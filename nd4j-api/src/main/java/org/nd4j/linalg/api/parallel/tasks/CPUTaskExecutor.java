package org.nd4j.linalg.api.parallel.tasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.*;

public class CPUTaskExecutor implements TaskExecutor {

    private static CPUTaskExecutor instance = new CPUTaskExecutor(12);
    public static TaskExecutor getInstance(){
        return instance;
    }

    private final Thread[] workerThreads;
    private final WorkerRunnable[] workers;

    public CPUTaskExecutor(int nThreads){

        workerThreads = new Thread[nThreads];
        workers = new WorkerRunnable[nThreads];
        for( int i=0; i<nThreads; i++ ){
            workers[i] = new WorkerRunnable();
            workerThreads[i] = new Thread(workers[i]);
            workerThreads[i].setDaemon(true);
            workerThreads[i].setName("CPUTaskExecutor-" + i);
            workerThreads[i].start();
        }



        System.out.println("STARTED CPUTASKEXECUTOR");
    }

    @Override
    public <V> Future<V> executeAsync(Task<V> task) {
        for(int i=0; i<workers.length; i++ ){
            workers[i].tasks.add(task);
        }
        return (Future<V>)task;
    }

    private static class WorkerRunnable implements Runnable {
        private Logger log = LoggerFactory.getLogger(WorkerRunnable.class);

        private BlockingQueue<Task<?>> tasks = new LinkedTransferQueue<>();


        @Override
        public void run() {
//            log.info("Starting worker thread: " + Thread.currentThread().getId());
            System.out.println("Starting worker thread: " + Thread.currentThread().getId());

            while(true){
                Task<?> task;
                try{
                    task = tasks.take();
                }catch(InterruptedException e){
                    log.error("Interrupted exception: Shutting down. {}",Thread.currentThread().getId(),e);
                    throw new RuntimeException(e);
                }
                task.call();
            }

//            log.info("Worker thread shutting down: " + Thread.currentThread().getId());
        }
    }

}
