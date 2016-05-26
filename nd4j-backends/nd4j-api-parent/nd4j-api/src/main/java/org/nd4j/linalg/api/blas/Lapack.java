package org.nd4j.linalg.api.blas;

import org.nd4j.linalg.api.complex.IComplexNumber;

/**
 * Lapack interface,derived from lapacke.h
 *
 * @author Adam Gibson
 */
public interface Lapack {

    /*****************************************************************************
     Copyright (c) 2014, Intel Corp.
     All rights reserved.

     Redistribution and use in source and binary forms, with or without
     modification, are permitted provided that the following conditions are met:

     * Redistributions of source code must retain the above copyright notice,
     this list of conditions and the following disclaimer.
     * Redistributions in binary form must reproduce the above copyright
     notice, this list of conditions and the following disclaimer in the
     documentation and/or other materials provided with the distribution.
     * Neither the name of Intel Corporation nor the names of its contributors
     may be used to endorse or promote products derived from this software
     without specific prior written permission.

     THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
     AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
     IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
     ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
     LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
     CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
     SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
     INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
     CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
     ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
     THE POSSIBILITY OF SUCH DAMAGE.
     ******************************************************************************
     * Contents: Native C interface to LAPACK
     * Author: Intel Corporation
     * Generated August, 2015
     *****************************************************************************/

    public final static int ROW_MAJOR     =          101;
    public final static int  COL_MAJOR    =           102;

    public final static int  WORK_MEMORY_ERROR  =     -1010;
    public final static int TRANSPOSE_MEMORY_ERROR = -1011;


    boolean lsame( long ca,  long cb,
                   int lca, int lcb );

/* C-LAPACK function prototypes */

    int sbdsdc( int matrix_layout, char uplo, char compq,
                int n, long d, long e, long u,
                int ldu, long vt, int ldvt, long q,
                long iq );
    int dbdsdc( int matrix_layout, char uplo, char compq,
                int n, long d, long e, long u,
                int ldu, long vt, int ldvt,
                long q, long iq );

    int sbdsqr( int matrix_layout, char uplo, int n,
                int ncvt, int nru, int ncc,
                long d, long e, long vt, int ldvt,
                long u, int ldu, long c, int ldc );
    int dbdsqr( int matrix_layout, char uplo, int n,
                int ncvt, int nru, int ncc,
                long d, long e, long vt, int ldvt,
                long u, int ldu, long c,
                int ldc );

    int sbdsvdx( int matrix_layout, char uplo, char jobz, char range,
                 int n, long d, long e,
                 int vl, int vu,
                 int il, int iu, int ns,
                 long s, long z, int ldz,
                 long superb );
    int dbdsvdx( int matrix_layout, char uplo, char jobz, char range,
                 int n, long d, long e,
                 int vl, int vu,
                 int il, int iu, int ns,
                 long s, long z, int ldz,
                 long superb );
    int sdisna( char job, int m, int n, final long d,
                long sep );
    int ddisna( char job, int m, int n,
                final long d, long sep );

    int sgbbrd( int matrix_layout, char vect, int m,
                int n, int ncc, int kl,
                int ku, long ab, int ldab, long d,
                long e, long q, int ldq, long pt,
                int ldpt, long c, int ldc );
    int dgbbrd( int matrix_layout, char vect, int m,
                int n, int ncc, int kl,
                int ku, long ab, int ldab,
                long d, long e, long q, int ldq,
                long pt, int ldpt, long c,
                int ldc );


    int sgbcon( int matrix_layout, char norm, int n,
                int kl, int ku, final long ab,
                int ldab, final long ipiv, float anorm,
                long rcond );
    int dgbcon( int matrix_layout, char norm, int n,
                int kl, int ku, final long ab,
                int ldab, final long ipiv,
                double anorm, long rcond );



    int sgbequ( int matrix_layout, int m, int n,
                int kl, int ku, final long ab,
                int ldab, long r, long c, long rowcnd,
                long colcnd, long amax );
    int dgbequ( int matrix_layout, int m, int n,
                int kl, int ku, final long ab,
                int ldab, long r, long c,
                long rowcnd, long colcnd, long amax );
    int cgbequ(int matrix_layout, int m, int n,
               int kl, int ku,
               final IComplexNumber ab, int ldab,
               long r, long c, long rowcnd, long colcnd,
               long amax );
    int zgbequ( int matrix_layout, int m, int n,
                int kl, int ku,
                final IComplexNumber ab, int ldab,
                long r, long c, long rowcnd, long colcnd,
                long amax );

    int sgbequb( int matrix_layout, int m, int n,
                 int kl, int ku, final long ab,
                 int ldab, long r, long c, long rowcnd,
                 long colcnd, long amax );
    int dgbequb( int matrix_layout, int m, int n,
                 int kl, int ku, final long ab,
                 int ldab, long r, long c,
                 long rowcnd, long colcnd, long amax );
    int cgbequb( int matrix_layout, int m, int n,
                 int kl, int ku,
                 final IComplexNumber ab, int ldab,
                 long r, long c, long rowcnd, long colcnd,
                 long amax );
    int zgbequb( int matrix_layout, int m, int n,
                 int kl, int ku,
                 final IComplexNumber ab, int ldab,
                 long r, long c, long rowcnd,
                 long colcnd, long amax );

    int sgbrfs( int matrix_layout, char trans, int n,
                int kl, int ku, int nrhs,
                final long ab, int ldab, final long afb,
                int ldafb, final long ipiv,
                final long b, int ldb, long x,
                int ldx, long ferr, long berr );
    int dgbrfs( int matrix_layout, char trans, int n,
                int kl, int ku, int nrhs,
                final long ab, int ldab, final long afb,
                int ldafb, final long ipiv,
                final long b, int ldb, long x,
                int ldx, long ferr, long berr );
    int cgbrfs( int matrix_layout, char trans, int n,
                int kl, int ku, int nrhs,
                final IComplexNumber ab, int ldab,
                final IComplexNumber afb, int ldafb,
                final long ipiv,
                final IComplexNumber b, int ldb,
                IComplexNumber x, int ldx, long ferr,
                long berr );
    int zgbrfs( int matrix_layout, char trans, int n,
                int kl, int ku, int nrhs,
                final IComplexNumber ab, int ldab,
                final IComplexNumber afb, int ldafb,
                final long ipiv,
                final IComplexNumber b, int ldb,
                IComplexNumber x, int ldx,
                long ferr, long berr );

    int sgbrfsx( int matrix_layout, char trans, char equed,
                 int n, int kl, int ku,
                 int nrhs, final long ab, int ldab,
                 final long afb, int ldafb,
                 final long ipiv, final long r,
                 final long c, final long b, int ldb,
                 long x, int ldx, long rcond, long berr,
                 int n_err_bnds, long err_bnds_norm,
                 long err_bnds_comp, int nparams,
                 long params );
    int dgbrfsx( int matrix_layout, char trans, char equed,
                 int n, int kl, int ku,
                 int nrhs, final long ab, int ldab,
                 final long afb, int ldafb,
                 final long ipiv, final long r,
                 final long c, final long b, int ldb,
                 long x, int ldx, long rcond,
                 long berr, int n_err_bnds,
                 long err_bnds_norm, long err_bnds_comp,
                 int nparams, long params );
    int cgbrfsx( int matrix_layout, char trans, char equed,
                 int n, int kl, int ku,
                 int nrhs, final IComplexNumber ab,
                 int ldab, final IComplexNumber afb,
                 int ldafb, final long ipiv,
                 final long r, final long c,
                 final IComplexNumber b, int ldb,
                 IComplexNumber x, int ldx,
                 long rcond, long berr, int n_err_bnds,
                 long err_bnds_norm, long err_bnds_comp,
                 int nparams, long params );
    int zgbrfsx( int matrix_layout, char trans, char equed,
                 int n, int kl, int ku,
                 int nrhs, final IComplexNumber ab,
                 int ldab, final IComplexNumber afb,
                 int ldafb, final long ipiv,
                 final long r, final long c,
                 final IComplexNumber b, int ldb,
                 IComplexNumber x, int ldx,
                 long rcond, long berr, int n_err_bnds,
                 long err_bnds_norm, long err_bnds_comp,
                 int nparams, long params );

    int sgbsv( int matrix_layout, int n, int kl,
               int ku, int nrhs, long ab,
               int ldab, long ipiv, long b,
               int ldb );
    int dgbsv( int matrix_layout, int n, int kl,
               int ku, int nrhs, long ab,
               int ldab, long ipiv, long b,
               int ldb );
    int cgbsv( int matrix_layout, int n, int kl,
               int ku, int nrhs,
               IComplexNumber ab, int ldab,
               long ipiv, IComplexNumber b,
               int ldb );
    int zgbsv( int matrix_layout, int n, int kl,
               int ku, int nrhs,
               IComplexNumber ab, int ldab,
               long ipiv, IComplexNumber b,
               int ldb );

    int sgbsvx( int matrix_layout, char fact, char trans,
                int n, int kl, int ku,
                int nrhs, long ab, int ldab,
                long afb, int ldafb, long ipiv,
                long equed, long r, long c, long b,
                int ldb, long x, int ldx,
                long rcond, long ferr, long berr,
                long rpivot );
    int dgbsvx( int matrix_layout, char fact, char trans,
                int n, int kl, int ku,
                int nrhs, long ab, int ldab,
                long afb, int ldafb, long ipiv,
                long equed, long r, long c, long b,
                int ldb, long x, int ldx,
                long rcond, long ferr, long berr,
                long rpivot );
    int cgbsvx( int matrix_layout, char fact, char trans,
                int n, int kl, int ku,
                int nrhs, IComplexNumber ab,
                int ldab, IComplexNumber afb,
                int ldafb, long ipiv, long equed,
                long r, long c, IComplexNumber b,
                int ldb, IComplexNumber x,
                int ldx, long rcond, long ferr,
                long berr, long rpivot );
    int zgbsvx( int matrix_layout, char fact, char trans,
                int n, int kl, int ku,
                int nrhs, IComplexNumber ab,
                int ldab, IComplexNumber afb,
                int ldafb, long ipiv, long equed,
                long r, long c, IComplexNumber b,
                int ldb, IComplexNumber x,
                int ldx, long rcond, long ferr,
                long berr, long rpivot );

    int sgbsvxx( int matrix_layout, char fact, char trans,
                 int n, int kl, int ku,
                 int nrhs, long ab, int ldab,
                 long afb, int ldafb, long ipiv,
                 long equed, long r, long c, long b,
                 int ldb, long x, int ldx,
                 long rcond, long rpvgrw, long berr,
                 int n_err_bnds, long err_bnds_norm,
                 long err_bnds_comp, int nparams,
                 long params );
    int dgbsvxx( int matrix_layout, char fact, char trans,
                 int n, int kl, int ku,
                 int nrhs, long ab, int ldab,
                 long afb, int ldafb, long ipiv,
                 long equed, long r, long c, long b,
                 int ldb, long x, int ldx,
                 long rcond, long rpvgrw, long berr,
                 int n_err_bnds, long err_bnds_norm,
                 long err_bnds_comp, int nparams,
                 long params );
    int cgbsvxx( int matrix_layout, char fact, char trans,
                 int n, int kl, int ku,
                 int nrhs, IComplexNumber ab,
                 int ldab, IComplexNumber afb,
                 int ldafb, long ipiv, long equed,
                 long r, long c, IComplexNumber b,
                 int ldb, IComplexNumber x,
                 int ldx, long rcond, long rpvgrw,
                 long berr, int n_err_bnds,
                 long err_bnds_norm, long err_bnds_comp,
                 int nparams, long params );
    int zgbsvxx( int matrix_layout, char fact, char trans,
                 int n, int kl, int ku,
                 int nrhs, IComplexNumber ab,
                 int ldab, IComplexNumber afb,
                 int ldafb, long ipiv, long equed,
                 long r, long c, IComplexNumber b,
                 int ldb, IComplexNumber x,
                 int ldx, long rcond, long rpvgrw,
                 long berr, int n_err_bnds,
                 long err_bnds_norm, long err_bnds_comp,
                 int nparams, long params );

    int sgbtrf( int matrix_layout, int m, int n,
                int kl, int ku, long ab,
                int ldab, long ipiv );
    int dgbtrf( int matrix_layout, int m, int n,
                int kl, int ku, long ab,
                int ldab, long ipiv );
    int cgbtrf( int matrix_layout, int m, int n,
                int kl, int ku,
                IComplexNumber ab, int ldab,
                long ipiv );
    int zgbtrf( int matrix_layout, int m, int n,
                int kl, int ku,
                IComplexNumber ab, int ldab,
                long ipiv );

    int sgbtrs( int matrix_layout, char trans, int n,
                int kl, int ku, int nrhs,
                final long ab, int ldab,
                final long ipiv, long b, int ldb );
    int dgbtrs( int matrix_layout, char trans, int n,
                int kl, int ku, int nrhs,
                final long ab, int ldab,
                final long ipiv, long b, int ldb );
    int cgbtrs( int matrix_layout, char trans, int n,
                int kl, int ku, int nrhs,
                final IComplexNumber ab, int ldab,
                final long ipiv, IComplexNumber b,
                int ldb );
    int zgbtrs( int matrix_layout, char trans, int n,
                int kl, int ku, int nrhs,
                final IComplexNumber ab, int ldab,
                final long ipiv, IComplexNumber b,
                int ldb );

    int sgebak( int matrix_layout, char job, char side, int n,
                int ilo, int ihi, final long scale,
                int m, long v, int ldv );
    int dgebak( int matrix_layout, char job, char side, int n,
                int ilo, int ihi, final long scale,
                int m, long v, int ldv );
    int cgebak( int matrix_layout, char job, char side, int n,
                int ilo, int ihi, final long scale,
                int m, IComplexNumber v,
                int ldv );
    int zgebak( int matrix_layout, char job, char side, int n,
                int ilo, int ihi, final long scale,
                int m, IComplexNumber v,
                int ldv );

    int sgebal( int matrix_layout, char job, int n, long a,
                int lda, long ilo, long ihi,
                long scale );
    int dgebal( int matrix_layout, char job, int n, long a,
                int lda, long ilo, long ihi,
                long scale );
    int cgebal( int matrix_layout, char job, int n,
                IComplexNumber a, int lda,
                long ilo, long ihi, long scale );
    int zgebal( int matrix_layout, char job, int n,
                IComplexNumber a, int lda,
                long ilo, long ihi, long scale );

    int sgebrd( int matrix_layout, int m, int n,
                long a, int lda, long d, long e,
                long tauq, long taup );
    int dgebrd( int matrix_layout, int m, int n,
                long a, int lda, long d, long e,
                long tauq, long taup );
    int cgebrd( int matrix_layout, int m, int n,
                IComplexNumber a, int lda, long d,
                long e, IComplexNumber tauq,
                IComplexNumber taup );
    int zgebrd( int matrix_layout, int m, int n,
                IComplexNumber a, int lda, long d,
                long e, IComplexNumber tauq,
                IComplexNumber taup );

    int sgecon( int matrix_layout, char norm, int n,
                final long a, int lda, float anorm,
                long rcond );
    int dgecon( int matrix_layout, char norm, int n,
                final long a, int lda, double anorm,
                long rcond );
    int cgecon( int matrix_layout, char norm, int n,
                final IComplexNumber a, int lda,
                float anorm, long rcond );
    int zgecon( int matrix_layout, char norm, int n,
                final IComplexNumber a, int lda,
                double anorm, long rcond );

    int sgeequ( int matrix_layout, int m, int n,
                final long a, int lda, long r, long c,
                long rowcnd, long colcnd, long amax );
    int dgeequ( int matrix_layout, int m, int n,
                final long a, int lda, long r,
                long c, long rowcnd, long colcnd,
                long amax );
    int cgeequ( int matrix_layout, int m, int n,
                final IComplexNumber a, int lda,
                long r, long c, long rowcnd, long colcnd,
                long amax );
    int zgeequ( int matrix_layout, int m, int n,
                final IComplexNumber a, int lda,
                long r, long c, long rowcnd, long colcnd,
                long amax );

    int sgeequb( int matrix_layout, int m, int n,
                 final long a, int lda, long r, long c,
                 long rowcnd, long colcnd, long amax );
    int dgeequb( int matrix_layout, int m, int n,
                 final long a, int lda, long r,
                 long c, long rowcnd, long colcnd,
                 long amax );
    int cgeequb( int matrix_layout, int m, int n,
                 final IComplexNumber a, int lda,
                 long r, long c, long rowcnd, long colcnd,
                 long amax );
    int zgeequb( int matrix_layout, int m, int n,
                 final IComplexNumber a, int lda,
                 long r, long c, long rowcnd,
                 long colcnd, long amax );

    int sgees( int matrix_layout, char jobvs, char sort,
               long  select, int n, long a,
               int lda, long sdim, long wr,
               long wi, long vs, int ldvs );
    int dgees( int matrix_layout, char jobvs, char sort,
               long  select, int n, long a,
               int lda, long sdim, long wr,
               long wi, long vs, int ldvs );
    int cgees( int matrix_layout, char jobvs, char sort,
               long  select, int n,
               IComplexNumber a, int lda,
               long sdim, IComplexNumber w,
               IComplexNumber vs, int ldvs );
    int zgees( int matrix_layout, char jobvs, char sort,
               long  select, int n,
               IComplexNumber a, int lda,
               long sdim, IComplexNumber w,
               IComplexNumber vs, int ldvs );

    int sgeesx( int matrix_layout, char jobvs, char sort,
                long  select, char sense, int n,
                long a, int lda, long sdim,
                long wr, long wi, long vs, int ldvs,
                long rconde, long rcondv );
    int dgeesx( int matrix_layout, char jobvs, char sort,
                long  select, char sense, int n,
                long a, int lda, long sdim,
                long wr, long wi, long vs, int ldvs,
                long rconde, long rcondv );
    int cgeesx( int matrix_layout, char jobvs, char sort,
                long  select, char sense, int n,
                IComplexNumber a, int lda,
                long sdim, IComplexNumber w,
                IComplexNumber vs, int ldvs,
                long rconde, long rcondv );
    int zgeesx( int matrix_layout, char jobvs, char sort,
                long  select, char sense, int n,
                IComplexNumber a, int lda,
                long sdim, IComplexNumber w,
                IComplexNumber vs, int ldvs,
                long rconde, long rcondv );

    int sgeev( int matrix_layout, char jobvl, char jobvr,
               int n, long a, int lda, long wr,
               long wi, long vl, int ldvl, long vr,
               int ldvr );
    int dgeev( int matrix_layout, char jobvl, char jobvr,
               int n, long a, int lda, long wr,
               long wi, long vl, int ldvl, long vr,
               int ldvr );
    int cgeev( int matrix_layout, char jobvl, char jobvr,
               int n, IComplexNumber a, int lda,
               IComplexNumber w, IComplexNumber vl,
               int ldvl, IComplexNumber vr,
               int ldvr );
    int zgeev( int matrix_layout, char jobvl, char jobvr,
               int n, IComplexNumber a,
               int lda, IComplexNumber w,
               IComplexNumber vl, int ldvl,
               IComplexNumber vr, int ldvr );

    int sgeevx( int matrix_layout, char balanc, char jobvl,
                char jobvr, char sense, int n, long a,
                int lda, long wr, long wi, long vl,
                int ldvl, long vr, int ldvr,
                long ilo, long ihi, long scale,
                long abnrm, long rconde, long rcondv );
    int dgeevx( int matrix_layout, char balanc, char jobvl,
                char jobvr, char sense, int n, long a,
                int lda, long wr, long wi, long vl,
                int ldvl, long vr, int ldvr,
                long ilo, long ihi, long scale,
                long abnrm, long rconde, long rcondv );
    int cgeevx( int matrix_layout, char balanc, char jobvl,
                char jobvr, char sense, int n,
                IComplexNumber a, int lda,
                IComplexNumber w, IComplexNumber vl,
                int ldvl, IComplexNumber vr,
                int ldvr, long ilo, long ihi,
                long scale, long abnrm, long rconde,
                long rcondv );
    int zgeevx( int matrix_layout, char balanc, char jobvl,
                char jobvr, char sense, int n,
                IComplexNumber a, int lda,
                IComplexNumber w, IComplexNumber vl,
                int ldvl, IComplexNumber vr,
                int ldvr, long ilo, long ihi,
                long scale, long abnrm, long rconde,
                long rcondv );

    int sgehrd( int matrix_layout, int n, int ilo,
                int ihi, long a, int lda,
                long tau );
    int dgehrd( int matrix_layout, int n, int ilo,
                int ihi, long a, int lda,
                long tau );
    int cgehrd( int matrix_layout, int n, int ilo,
                int ihi, IComplexNumber a,
                int lda, IComplexNumber tau );
    int zgehrd( int matrix_layout, int n, int ilo,
                int ihi, IComplexNumber a,
                int lda, IComplexNumber tau );

    int sgejsv( int matrix_layout, char joba, char jobu, char jobv,
                char jobr, char jobt, char jobp, int m,
                int n, long a, int lda, long sva,
                long u, int ldu, long v, int ldv,
                long stat, long istat );
    int dgejsv( int matrix_layout, char joba, char jobu, char jobv,
                char jobr, char jobt, char jobp, int m,
                int n, long a, int lda, long sva,
                long u, int ldu, long v, int ldv,
                long stat, long istat );
    int cgejsv( int matrix_layout, char joba, char jobu, char jobv,
                char jobr, char jobt, char jobp, int m,
                int n, IComplexNumber a, int lda, long sva,
                IComplexNumber u, int ldu, IComplexNumber v, int ldv,
                long stat, long istat );
    int zgejsv( int matrix_layout, char joba, char jobu, char jobv,
                char jobr, char jobt, char jobp, int m,
                int n, IComplexNumber a, int lda, long sva,
                IComplexNumber u, int ldu, IComplexNumber v, int ldv,
                long stat, long istat );

    int sgelq2( int matrix_layout, int m, int n,
                long a, int lda, long tau );
    int dgelq2( int matrix_layout, int m, int n,
                long a, int lda, long tau );
    int cgelq2( int matrix_layout, int m, int n,
                IComplexNumber a, int lda,
                IComplexNumber tau );
    int zgelq2( int matrix_layout, int m, int n,
                IComplexNumber a, int lda,
                IComplexNumber tau );

    int sgelqf( int matrix_layout, int m, int n,
                long a, int lda, long tau );
    int dgelqf( int matrix_layout, int m, int n,
                long a, int lda, long tau );
    int cgelqf( int matrix_layout, int m, int n,
                IComplexNumber a, int lda,
                IComplexNumber tau );
    int zgelqf( int matrix_layout, int m, int n,
                IComplexNumber a, int lda,
                IComplexNumber tau );

    int sgels( int matrix_layout, char trans, int m,
               int n, int nrhs, long a,
               int lda, long b, int ldb );
    int dgels( int matrix_layout, char trans, int m,
               int n, int nrhs, long a,
               int lda, long b, int ldb );
    int cgels( int matrix_layout, char trans, int m,
               int n, int nrhs,
               IComplexNumber a, int lda,
               IComplexNumber b, int ldb );
    int zgels( int matrix_layout, char trans, int m,
               int n, int nrhs,
               IComplexNumber a, int lda,
               IComplexNumber b, int ldb );

    int sgelsd( int matrix_layout, int m, int n,
                int nrhs, long a, int lda, long b,
                int ldb, long s, float rcond,
                long rank );
    int dgelsd( int matrix_layout, int m, int n,
                int nrhs, long a, int lda,
                long b, int ldb, long s, double rcond,
                long rank );
    int cgelsd( int matrix_layout, int m, int n,
                int nrhs, IComplexNumber a,
                int lda, IComplexNumber b,
                int ldb, long s, float rcond,
                long rank );
    int zgelsd( int matrix_layout, int m, int n,
                int nrhs, IComplexNumber a,
                int lda, IComplexNumber b,
                int ldb, long s, double rcond,
                long rank );

    int sgelss( int matrix_layout, int m, int n,
                int nrhs, long a, int lda, long b,
                int ldb, long s, float rcond,
                long rank );
    int dgelss( int matrix_layout, int m, int n,
                int nrhs, long a, int lda,
                long b, int ldb, long s, double rcond,
                long rank );
    int cgelss( int matrix_layout, int m, int n,
                int nrhs, IComplexNumber a,
                int lda, IComplexNumber b,
                int ldb, long s, float rcond,
                long rank );
    int zgelss( int matrix_layout, int m, int n,
                int nrhs, IComplexNumber a,
                int lda, IComplexNumber b,
                int ldb, long s, double rcond,
                long rank );

    int sgelsy( int matrix_layout, int m, int n,
                int nrhs, long a, int lda, long b,
                int ldb, long jpvt, float rcond,
                long rank );
    int dgelsy( int matrix_layout, int m, int n,
                int nrhs, long a, int lda,
                long b, int ldb, long jpvt,
                double rcond, long rank );
    int cgelsy( int matrix_layout, int m, int n,
                int nrhs, IComplexNumber a,
                int lda, IComplexNumber b,
                int ldb, long jpvt, float rcond,
                long rank );
    int zgelsy( int matrix_layout, int m, int n,
                int nrhs, IComplexNumber a,
                int lda, IComplexNumber b,
                int ldb, long jpvt, double rcond,
                long rank );

    int sgeqlf( int matrix_layout, int m, int n,
                long a, int lda, long tau );
    int dgeqlf( int matrix_layout, int m, int n,
                long a, int lda, long tau );
    int cgeqlf( int matrix_layout, int m, int n,
                IComplexNumber a, int lda,
                IComplexNumber tau );
    int zgeqlf( int matrix_layout, int m, int n,
                IComplexNumber a, int lda,
                IComplexNumber tau );

    int sgeqp3( int matrix_layout, int m, int n,
                long a, int lda, long jpvt,
                long tau );
    int dgeqp3( int matrix_layout, int m, int n,
                long a, int lda, long jpvt,
                long tau );
    int cgeqp3( int matrix_layout, int m, int n,
                IComplexNumber a, int lda,
                long jpvt, IComplexNumber tau );
    int zgeqp3( int matrix_layout, int m, int n,
                IComplexNumber a, int lda,
                long jpvt, IComplexNumber tau );

    int sgeqpf( int matrix_layout, int m, int n,
                long a, int lda, long jpvt,
                long tau );
    int dgeqpf( int matrix_layout, int m, int n,
                long a, int lda, long jpvt,
                long tau );
    int cgeqpf( int matrix_layout, int m, int n,
                IComplexNumber a, int lda,
                long jpvt, IComplexNumber tau );
    int zgeqpf( int matrix_layout, int m, int n,
                IComplexNumber a, int lda,
                long jpvt, IComplexNumber tau );

    int sgeqr2( int matrix_layout, int m, int n,
                long a, int lda, long tau );
    int dgeqr2( int matrix_layout, int m, int n,
                long a, int lda, long tau );
    int cgeqr2( int matrix_layout, int m, int n,
                IComplexNumber a, int lda,
                IComplexNumber tau );
    int zgeqr2( int matrix_layout, int m, int n,
                IComplexNumber a, int lda,
                IComplexNumber tau );

    int sgeqrf( int matrix_layout, int m, int n,
                long a, int lda, long tau );
    int dgeqrf( int matrix_layout, int m, int n,
                long a, int lda, long tau );
    int cgeqrf( int matrix_layout, int m, int n,
                IComplexNumber a, int lda,
                IComplexNumber tau );
    int zgeqrf( int matrix_layout, int m, int n,
                IComplexNumber a, int lda,
                IComplexNumber tau );

    int sgeqrfp( int matrix_layout, int m, int n,
                 long a, int lda, long tau );
    int dgeqrfp( int matrix_layout, int m, int n,
                 long a, int lda, long tau );
    int cgeqrfp( int matrix_layout, int m, int n,
                 IComplexNumber a, int lda,
                 IComplexNumber tau );
    int zgeqrfp( int matrix_layout, int m, int n,
                 IComplexNumber a, int lda,
                 IComplexNumber tau );

    int sgerfs( int matrix_layout, char trans, int n,
                int nrhs, final long a, int lda,
                final long af, int ldaf,
                final long ipiv, final long b,
                int ldb, long x, int ldx,
                long ferr, long berr );
    int dgerfs( int matrix_layout, char trans, int n,
                int nrhs, final long a, int lda,
                final long af, int ldaf,
                final long ipiv, final long b,
                int ldb, long x, int ldx,
                long ferr, long berr );
    int cgerfs( int matrix_layout, char trans, int n,
                int nrhs, final IComplexNumber a,
                int lda, final IComplexNumber af,
                int ldaf, final long ipiv,
                final IComplexNumber b, int ldb,
                IComplexNumber x, int ldx, long ferr,
                long berr );
    int zgerfs( int matrix_layout, char trans, int n,
                int nrhs, final IComplexNumber a,
                int lda, final IComplexNumber af,
                int ldaf, final long ipiv,
                final IComplexNumber b, int ldb,
                IComplexNumber x, int ldx,
                long ferr, long berr );

    int sgerfsx( int matrix_layout, char trans, char equed,
                 int n, int nrhs, final long a,
                 int lda, final long af, int ldaf,
                 final long ipiv, final long r,
                 final long c, final long b, int ldb,
                 long x, int ldx, long rcond, long berr,
                 int n_err_bnds, long err_bnds_norm,
                 long err_bnds_comp, int nparams,
                 long params );
    int dgerfsx( int matrix_layout, char trans, char equed,
                 int n, int nrhs, final long a,
                 int lda, final long af, int ldaf,
                 final long ipiv, final long r,
                 final long c, final long b, int ldb,
                 long x, int ldx, long rcond,
                 long berr, int n_err_bnds,
                 long err_bnds_norm, long err_bnds_comp,
                 int nparams, long params );
    int cgerfsx( int matrix_layout, char trans, char equed,
                 int n, int nrhs,
                 final IComplexNumber a, int lda,
                 final IComplexNumber af, int ldaf,
                 final long ipiv, final long r,
                 final long c, final IComplexNumber b,
                 int ldb, IComplexNumber x,
                 int ldx, long rcond, long berr,
                 int n_err_bnds, long err_bnds_norm,
                 long err_bnds_comp, int nparams,
                 long params );
    int zgerfsx( int matrix_layout, char trans, char equed,
                 int n, int nrhs,
                 final IComplexNumber a, int lda,
                 final IComplexNumber af, int ldaf,
                 final long ipiv, final long r,
                 final long c, final IComplexNumber b,
                 int ldb, IComplexNumber x,
                 int ldx, long rcond, long berr,
                 int n_err_bnds, long err_bnds_norm,
                 long err_bnds_comp, int nparams,
                 long params );

    int sgerqf( int matrix_layout, int m, int n,
                long a, int lda, long tau );
    int dgerqf( int matrix_layout, int m, int n,
                long a, int lda, long tau );
    int cgerqf( int matrix_layout, int m, int n,
                IComplexNumber a, int lda,
                IComplexNumber tau );
    int zgerqf( int matrix_layout, int m, int n,
                IComplexNumber a, int lda,
                IComplexNumber tau );

    int sgesdd( int matrix_layout, char jobz, int m,
                int n, long a, int lda, long s,
                long u, int ldu, long vt,
                int ldvt );
    int dgesdd( int matrix_layout, char jobz, int m,
                int n, long a, int lda, long s,
                long u, int ldu, long vt,
                int ldvt );
    int cgesdd( int matrix_layout, char jobz, int m,
                int n, IComplexNumber a,
                int lda, long s, IComplexNumber u,
                int ldu, IComplexNumber vt,
                int ldvt );
    int zgesdd( int matrix_layout, char jobz, int m,
                int n, IComplexNumber a,
                int lda, long s, IComplexNumber u,
                int ldu, IComplexNumber vt,
                int ldvt );

    int sgesv( int matrix_layout, int n, int nrhs,
               long a, int lda, long ipiv, long b,
               int ldb );
    int dgesv( int matrix_layout, int n, int nrhs,
               long a, int lda, long ipiv,
               long b, int ldb );
    int cgesv( int matrix_layout, int n, int nrhs,
               IComplexNumber a, int lda,
               long ipiv, IComplexNumber b,
               int ldb );
    int zgesv( int matrix_layout, int n, int nrhs,
               IComplexNumber a, int lda,
               long ipiv, IComplexNumber b,
               int ldb );
    int dsgesv( int matrix_layout, int n, int nrhs,
                long a, int lda, long ipiv,
                long b, int ldb, long x, int ldx,
                long iter );
    int zcgesv( int matrix_layout, int n, int nrhs,
                IComplexNumber a, int lda,
                long ipiv, IComplexNumber b,
                int ldb, IComplexNumber x,
                int ldx, long iter );

    int sgesvd( int matrix_layout, char jobu, char jobvt,
                int m, int n, long a, int lda,
                long s, long u, int ldu, long vt,
                int ldvt, long superb );
    int dgesvd( int matrix_layout, char jobu, char jobvt,
                int m, int n, long a,
                int lda, long s, long u, int ldu,
                long vt, int ldvt, long superb );
    int cgesvd( int matrix_layout, char jobu, char jobvt,
                int m, int n, IComplexNumber a,
                int lda, long s, IComplexNumber u,
                int ldu, IComplexNumber vt,
                int ldvt, long superb );
    int zgesvd( int matrix_layout, char jobu, char jobvt,
                int m, int n, IComplexNumber a,
                int lda, long s, IComplexNumber u,
                int ldu, IComplexNumber vt,
                int ldvt, long superb );

    int sgesvdx( int matrix_layout, char jobu, char jobvt, char range,
                 int m, int n, long a,
                 int lda, int vl, int vu,
                 int il, int iu, int ns,
                 long s, long u, int ldu,
                 long vt, int ldvt,
                 long superb );
    int dgesvdx( int matrix_layout, char jobu, char jobvt, char range,
                 int m, int n, long a,
                 int lda, int vl, int vu,
                 int il, int iu, int ns,
                 long s, long u, int ldu,
                 long vt, int ldvt,
                 long superb );
    int cgesvdx( int matrix_layout, char jobu, char jobvt, char range,
                 int m, int n, IComplexNumber a,
                 int lda, int vl, int vu,
                 int il, int iu, int ns,
                 long s, IComplexNumber u, int ldu,
                 IComplexNumber vt, int ldvt,
                 long superb );
    int zgesvdx( int matrix_layout, char jobu, char jobvt, char range,
                 int m, int n, IComplexNumber a,
                 int lda, int vl, int vu,
                 int il, int iu, int ns,
                 long s, IComplexNumber u, int ldu,
                 IComplexNumber vt, int ldvt,
                 long superb );

    int sgesvj( int matrix_layout, char joba, char jobu, char jobv,
                int m, int n, long a, int lda,
                long sva, int mv, long v, int ldv,
                long stat );
    int dgesvj( int matrix_layout, char joba, char jobu, char jobv,
                int m, int n, long a,
                int lda, long sva, int mv,
                long v, int ldv, long stat );
    int cgesvj( int matrix_layout, char joba, char jobu, char jobv,
                int m, int n, IComplexNumber a,
                int lda, long sva, int mv,
                IComplexNumber v, int ldv, long stat );
    int zgesvj( int matrix_layout, char joba, char jobu, char jobv,
                int m, int n, IComplexNumber a,
                int lda, long sva, int mv,
                IComplexNumber v, int ldv, long stat );

    int sgesvx( int matrix_layout, char fact, char trans,
                int n, int nrhs, long a,
                int lda, long af, int ldaf,
                long ipiv, long equed, long r, long c,
                long b, int ldb, long x, int ldx,
                long rcond, long ferr, long berr,
                long rpivot );
    int dgesvx( int matrix_layout, char fact, char trans,
                int n, int nrhs, long a,
                int lda, long af, int ldaf,
                long ipiv, long equed, long r, long c,
                long b, int ldb, long x, int ldx,
                long rcond, long ferr, long berr,
                long rpivot );
    int cgesvx( int matrix_layout, char fact, char trans,
                int n, int nrhs,
                IComplexNumber a, int lda,
                IComplexNumber af, int ldaf,
                long ipiv, long equed, long r, long c,
                IComplexNumber b, int ldb,
                IComplexNumber x, int ldx,
                long rcond, long ferr, long berr,
                long rpivot );
    int zgesvx( int matrix_layout, char fact, char trans,
                int n, int nrhs,
                IComplexNumber a, int lda,
                IComplexNumber af, int ldaf,
                long ipiv, long equed, long r, long c,
                IComplexNumber b, int ldb,
                IComplexNumber x, int ldx,
                long rcond, long ferr, long berr,
                long rpivot );

    int sgesvxx( int matrix_layout, char fact, char trans,
                 int n, int nrhs, long a,
                 int lda, long af, int ldaf,
                 long ipiv, long equed, long r, long c,
                 long b, int ldb, long x, int ldx,
                 long rcond, long rpvgrw, long berr,
                 int n_err_bnds, long err_bnds_norm,
                 long err_bnds_comp, int nparams,
                 long params );
    int dgesvxx( int matrix_layout, char fact, char trans,
                 int n, int nrhs, long a,
                 int lda, long af, int ldaf,
                 long ipiv, long equed, long r, long c,
                 long b, int ldb, long x,
                 int ldx, long rcond, long rpvgrw,
                 long berr, int n_err_bnds,
                 long err_bnds_norm, long err_bnds_comp,
                 int nparams, long params );
    int cgesvxx( int matrix_layout, char fact, char trans,
                 int n, int nrhs,
                 IComplexNumber a, int lda,
                 IComplexNumber af, int ldaf,
                 long ipiv, long equed, long r, long c,
                 IComplexNumber b, int ldb,
                 IComplexNumber x, int ldx,
                 long rcond, long rpvgrw, long berr,
                 int n_err_bnds, long err_bnds_norm,
                 long err_bnds_comp, int nparams,
                 long params );
    int zgesvxx( int matrix_layout, char fact, char trans,
                 int n, int nrhs,
                 IComplexNumber a, int lda,
                 IComplexNumber af, int ldaf,
                 long ipiv, long equed, long r, long c,
                 IComplexNumber b, int ldb,
                 IComplexNumber x, int ldx,
                 long rcond, long rpvgrw, long berr,
                 int n_err_bnds, long err_bnds_norm,
                 long err_bnds_comp, int nparams,
                 long params );

    int sgetf2( int matrix_layout, int m, int n,
                long a, int lda, long ipiv );
    int dgetf2( int matrix_layout, int m, int n,
                long a, int lda, long ipiv );
    int cgetf2( int matrix_layout, int m, int n,
                IComplexNumber a, int lda,
                long ipiv );
    int zgetf2( int matrix_layout, int m, int n,
                IComplexNumber a, int lda,
                long ipiv );

    int sgetrf( int matrix_layout, int m, int n,
                long a, int lda, long ipiv );
    int dgetrf( int matrix_layout, int m, int n,
                long a, int lda, long ipiv );
    int cgetrf( int matrix_layout, int m, int n,
                IComplexNumber a, int lda,
                long ipiv );
    int zgetrf( int matrix_layout, int m, int n,
                IComplexNumber a, int lda,
                long ipiv );

    int sgetrf2( int matrix_layout, int m, int n,
                 long a, int lda, long ipiv );
    int dgetrf2( int matrix_layout, int m, int n,
                 long a, int lda, long ipiv );
    int cgetrf2( int matrix_layout, int m, int n,
                 IComplexNumber a, int lda,
                 long ipiv );
    int zgetrf2( int matrix_layout, int m, int n,
                 IComplexNumber a, int lda,
                 long ipiv );

    int sgetri( int matrix_layout, int n, long a,
                int lda, final long ipiv );
    int dgetri( int matrix_layout, int n, long a,
                int lda, final long ipiv );
    int cgetri( int matrix_layout, int n,
                IComplexNumber a, int lda,
                final long ipiv );
    int zgetri( int matrix_layout, int n,
                IComplexNumber a, int lda,
                final long ipiv );

    int sgetrs( int matrix_layout, char trans, int n,
                int nrhs, final long a, int lda,
                final long ipiv, long b, int ldb );
    int dgetrs( int matrix_layout, char trans, int n,
                int nrhs, final long a, int lda,
                final long ipiv, long b, int ldb );
    int cgetrs( int matrix_layout, char trans, int n,
                int nrhs, final IComplexNumber a,
                int lda, final long ipiv,
                IComplexNumber b, int ldb );
    int zgetrs( int matrix_layout, char trans, int n,
                int nrhs, final IComplexNumber a,
                int lda, final long ipiv,
                IComplexNumber b, int ldb );

    int sggbak( int matrix_layout, char job, char side, int n,
                int ilo, int ihi, final long lscale,
                final long rscale, int m, long v,
                int ldv );
    int dggbak( int matrix_layout, char job, char side, int n,
                int ilo, int ihi, final long lscale,
                final long rscale, int m, long v,
                int ldv );
    int cggbak( int matrix_layout, char job, char side, int n,
                int ilo, int ihi, final long lscale,
                final long rscale, int m,
                IComplexNumber v, int ldv );
    int zggbak( int matrix_layout, char job, char side, int n,
                int ilo, int ihi, final long lscale,
                final long rscale, int m,
                IComplexNumber v, int ldv );

    int sggbal( int matrix_layout, char job, int n, long a,
                int lda, long b, int ldb,
                long ilo, long ihi, long lscale,
                long rscale );
    int dggbal( int matrix_layout, char job, int n, long a,
                int lda, long b, int ldb,
                long ilo, long ihi, long lscale,
                long rscale );
    int cggbal( int matrix_layout, char job, int n,
                IComplexNumber a, int lda,
                IComplexNumber b, int ldb,
                long ilo, long ihi, long lscale,
                long rscale );
    int zggbal( int matrix_layout, char job, int n,
                IComplexNumber a, int lda,
                IComplexNumber b, int ldb,
                long ilo, long ihi, long lscale,
                long rscale );

    int sgges( int matrix_layout, char jobvsl, char jobvsr, char sort,
               long  selctg, int n, long a,
               int lda, long b, int ldb,
               long sdim, long alphar, long alphai,
               long beta, long vsl, int ldvsl, long vsr,
               int ldvsr );
    int dgges( int matrix_layout, char jobvsl, char jobvsr, char sort,
               long  selctg, int n, long a,
               int lda, long b, int ldb,
               long sdim, long alphar, long alphai,
               long beta, long vsl, int ldvsl,
               long vsr, int ldvsr );
    int cgges( int matrix_layout, char jobvsl, char jobvsr, char sort,
               long  selctg, int n,
               IComplexNumber a, int lda,
               IComplexNumber b, int ldb,
               long sdim, IComplexNumber alpha,
               IComplexNumber beta, IComplexNumber vsl,
               int ldvsl, IComplexNumber vsr,
               int ldvsr );
    int zgges( int matrix_layout, char jobvsl, char jobvsr, char sort,
               long  selctg, int n,
               IComplexNumber a, int lda,
               IComplexNumber b, int ldb,
               long sdim, IComplexNumber alpha,
               IComplexNumber beta,
               IComplexNumber vsl, int ldvsl,
               IComplexNumber vsr, int ldvsr );

    int sgges3( int matrix_layout, char jobvsl, char jobvsr,
                char sort, long  selctg, int n,
                long a, int lda, long b, int ldb,
                long sdim, long alphar, long alphai,
                long beta, long vsl, int ldvsl,
                long vsr, int ldvsr );
    int dgges3( int matrix_layout, char jobvsl, char jobvsr,
                char sort, long  selctg, int n,
                long a, int lda, long b, int ldb,
                long sdim, long alphar, long alphai,
                long beta, long vsl, int ldvsl,
                long vsr, int ldvsr );
    int cgges3( int matrix_layout, char jobvsl, char jobvsr,
                char sort, long  selctg, int n,
                IComplexNumber a, int lda,
                IComplexNumber b, int ldb,
                long sdim, IComplexNumber alpha,
                IComplexNumber beta,
                IComplexNumber vsl, int ldvsl,
                IComplexNumber vsr, int ldvsr );
    int zgges3( int matrix_layout, char jobvsl, char jobvsr,
                char sort, long  selctg, int n,
                IComplexNumber a, int lda,
                IComplexNumber b, int ldb,
                long sdim, IComplexNumber alpha,
                IComplexNumber beta,
                IComplexNumber vsl, int ldvsl,
                IComplexNumber vsr, int ldvsr );

    int sggesx( int matrix_layout, char jobvsl, char jobvsr,
                char sort, long  selctg, char sense,
                int n, long a, int lda, long b,
                int ldb, long sdim, long alphar,
                long alphai, long beta, long vsl,
                int ldvsl, long vsr, int ldvsr,
                long rconde, long rcondv );
    int dggesx( int matrix_layout, char jobvsl, char jobvsr,
                char sort, long  selctg, char sense,
                int n, long a, int lda, long b,
                int ldb, long sdim, long alphar,
                long alphai, long beta, long vsl,
                int ldvsl, long vsr, int ldvsr,
                long rconde, long rcondv );
    int cggesx( int matrix_layout, char jobvsl, char jobvsr,
                char sort, long  selctg, char sense,
                int n, IComplexNumber a,
                int lda, IComplexNumber b,
                int ldb, long sdim,
                IComplexNumber alpha,
                IComplexNumber beta,
                IComplexNumber vsl, int ldvsl,
                IComplexNumber vsr, int ldvsr,
                long rconde, long rcondv );
    int zggesx( int matrix_layout, char jobvsl, char jobvsr,
                char sort, long  selctg, char sense,
                int n, IComplexNumber a,
                int lda, IComplexNumber b,
                int ldb, long sdim,
                IComplexNumber alpha,
                IComplexNumber beta,
                IComplexNumber vsl, int ldvsl,
                IComplexNumber vsr, int ldvsr,
                long rconde, long rcondv );

    int sggev( int matrix_layout, char jobvl, char jobvr,
               int n, long a, int lda, long b,
               int ldb, long alphar, long alphai,
               long beta, long vl, int ldvl, long vr,
               int ldvr );
    int dggev( int matrix_layout, char jobvl, char jobvr,
               int n, long a, int lda, long b,
               int ldb, long alphar, long alphai,
               long beta, long vl, int ldvl, long vr,
               int ldvr );
    int cggev( int matrix_layout, char jobvl, char jobvr,
               int n, IComplexNumber a, int lda,
               IComplexNumber b, int ldb,
               IComplexNumber alpha,
               IComplexNumber beta, IComplexNumber vl,
               int ldvl, IComplexNumber vr,
               int ldvr );
    int zggev( int matrix_layout, char jobvl, char jobvr,
               int n, IComplexNumber a,
               int lda, IComplexNumber b,
               int ldb, IComplexNumber alpha,
               IComplexNumber beta,
               IComplexNumber vl, int ldvl,
               IComplexNumber vr, int ldvr );

    int sggev3( int matrix_layout, char jobvl, char jobvr,
                int n, long a, int lda,
                long b, int ldb,
                long alphar, long alphai, long beta,
                long vl, int ldvl,
                long vr, int ldvr );
    int dggev3( int matrix_layout, char jobvl, char jobvr,
                int n, long a, int lda,
                long b, int ldb,
                long alphar, long alphai, long beta,
                long vl, int ldvl,
                long vr, int ldvr );
    int cggev3( int matrix_layout, char jobvl, char jobvr,
                int n,
                IComplexNumber a, int lda,
                IComplexNumber b, int ldb,
                IComplexNumber alpha,
                IComplexNumber beta,
                IComplexNumber vl, int ldvl,
                IComplexNumber vr, int ldvr );
    int zggev3( int matrix_layout, char jobvl, char jobvr,
                int n,
                IComplexNumber a, int lda,
                IComplexNumber b, int ldb,
                IComplexNumber alpha,
                IComplexNumber beta,
                IComplexNumber vl, int ldvl,
                IComplexNumber vr, int ldvr );

    int sggevx( int matrix_layout, char balanc, char jobvl,
                char jobvr, char sense, int n, long a,
                int lda, long b, int ldb,
                long alphar, long alphai, long beta, long vl,
                int ldvl, long vr, int ldvr,
                long ilo, long ihi, long lscale,
                long rscale, long abnrm, long bbnrm,
                long rconde, long rcondv );
    int dggevx( int matrix_layout, char balanc, char jobvl,
                char jobvr, char sense, int n, long a,
                int lda, long b, int ldb,
                long alphar, long alphai, long beta,
                long vl, int ldvl, long vr,
                int ldvr, long ilo, long ihi,
                long lscale, long rscale, long abnrm,
                long bbnrm, long rconde, long rcondv );
    int cggevx( int matrix_layout, char balanc, char jobvl,
                char jobvr, char sense, int n,
                IComplexNumber a, int lda,
                IComplexNumber b, int ldb,
                IComplexNumber alpha,
                IComplexNumber beta, IComplexNumber vl,
                int ldvl, IComplexNumber vr,
                int ldvr, long ilo, long ihi,
                long lscale, long rscale, long abnrm,
                long bbnrm, long rconde, long rcondv );
    int zggevx( int matrix_layout, char balanc, char jobvl,
                char jobvr, char sense, int n,
                IComplexNumber a, int lda,
                IComplexNumber b, int ldb,
                IComplexNumber alpha,
                IComplexNumber beta,
                IComplexNumber vl, int ldvl,
                IComplexNumber vr, int ldvr,
                long ilo, long ihi, long lscale,
                long rscale, long abnrm, long bbnrm,
                long rconde, long rcondv );

    int sggglm( int matrix_layout, int n, int m,
                int p, long a, int lda, long b,
                int ldb, long d, long x, long y );
    int dggglm( int matrix_layout, int n, int m,
                int p, long a, int lda, long b,
                int ldb, long d, long x, long y );
    int cggglm( int matrix_layout, int n, int m,
                int p, IComplexNumber a,
                int lda, IComplexNumber b,
                int ldb, IComplexNumber d,
                IComplexNumber x, IComplexNumber y );
    int zggglm( int matrix_layout, int n, int m,
                int p, IComplexNumber a,
                int lda, IComplexNumber b,
                int ldb, IComplexNumber d,
                IComplexNumber x, IComplexNumber y );

    int sgghrd( int matrix_layout, char compq, char compz,
                int n, int ilo, int ihi,
                long a, int lda, long b, int ldb,
                long q, int ldq, long z, int ldz );
    int dgghrd( int matrix_layout, char compq, char compz,
                int n, int ilo, int ihi,
                long a, int lda, long b, int ldb,
                long q, int ldq, long z,
                int ldz );
    int cgghrd( int matrix_layout, char compq, char compz,
                int n, int ilo, int ihi,
                IComplexNumber a, int lda,
                IComplexNumber b, int ldb,
                IComplexNumber q, int ldq,
                IComplexNumber z, int ldz );
    int zgghrd( int matrix_layout, char compq, char compz,
                int n, int ilo, int ihi,
                IComplexNumber a, int lda,
                IComplexNumber b, int ldb,
                IComplexNumber q, int ldq,
                IComplexNumber z, int ldz );

    int sgghd3( int matrix_layout, char compq, char compz,
                int n, int ilo, int ihi,
                long a, int lda, long b, int ldb,
                long q, int ldq, long z, int ldz );
    int dgghd3( int matrix_layout, char compq, char compz,
                int n, int ilo, int ihi,
                long a, int lda, long b, int ldb,
                long q, int ldq, long z,
                int ldz );
    int cgghd3( int matrix_layout, char compq, char compz,
                int n, int ilo, int ihi,
                IComplexNumber a, int lda,
                IComplexNumber b, int ldb,
                IComplexNumber q, int ldq,
                IComplexNumber z, int ldz );
    int zgghd3( int matrix_layout, char compq, char compz,
                int n, int ilo, int ihi,
                IComplexNumber a, int lda,
                IComplexNumber b, int ldb,
                IComplexNumber q, int ldq,
                IComplexNumber z, int ldz );

    int sgglse( int matrix_layout, int m, int n,
                int p, long a, int lda, long b,
                int ldb, long c, long d, long x );
    int dgglse( int matrix_layout, int m, int n,
                int p, long a, int lda, long b,
                int ldb, long c, long d, long x );
    int cgglse( int matrix_layout, int m, int n,
                int p, IComplexNumber a,
                int lda, IComplexNumber b,
                int ldb, IComplexNumber c,
                IComplexNumber d, IComplexNumber x );
    int zgglse( int matrix_layout, int m, int n,
                int p, IComplexNumber a,
                int lda, IComplexNumber b,
                int ldb, IComplexNumber c,
                IComplexNumber d, IComplexNumber x );

    int sggqrf( int matrix_layout, int n, int m,
                int p, long a, int lda, long taua,
                long b, int ldb, long taub );
    int dggqrf( int matrix_layout, int n, int m,
                int p, long a, int lda,
                long taua, long b, int ldb,
                long taub );
    int cggqrf( int matrix_layout, int n, int m,
                int p, IComplexNumber a,
                int lda, IComplexNumber taua,
                IComplexNumber b, int ldb,
                IComplexNumber taub );
    int zggqrf( int matrix_layout, int n, int m,
                int p, IComplexNumber a,
                int lda, IComplexNumber taua,
                IComplexNumber b, int ldb,
                IComplexNumber taub );

    int sggrqf( int matrix_layout, int m, int p,
                int n, long a, int lda, long taua,
                long b, int ldb, long taub );
    int dggrqf( int matrix_layout, int m, int p,
                int n, long a, int lda,
                long taua, long b, int ldb,
                long taub );
    int cggrqf( int matrix_layout, int m, int p,
                int n, IComplexNumber a,
                int lda, IComplexNumber taua,
                IComplexNumber b, int ldb,
                IComplexNumber taub );
    int zggrqf( int matrix_layout, int m, int p,
                int n, IComplexNumber a,
                int lda, IComplexNumber taua,
                IComplexNumber b, int ldb,
                IComplexNumber taub );

    int sggsvd( int matrix_layout, char jobu, char jobv, char jobq,
                int m, int n, int p,
                long k, long l, long a,
                int lda, long b, int ldb,
                long alpha, long beta, long u, int ldu,
                long v, int ldv, long q, int ldq,
                long iwork );
    int dggsvd( int matrix_layout, char jobu, char jobv, char jobq,
                int m, int n, int p,
                long k, long l, long a,
                int lda, long b, int ldb,
                long alpha, long beta, long u,
                int ldu, long v, int ldv, long q,
                int ldq, long iwork );
    int cggsvd( int matrix_layout, char jobu, char jobv, char jobq,
                int m, int n, int p,
                long k, long l,
                IComplexNumber a, int lda,
                IComplexNumber b, int ldb,
                long alpha, long beta, IComplexNumber u,
                int ldu, IComplexNumber v,
                int ldv, IComplexNumber q,
                int ldq, long iwork );
    int zggsvd( int matrix_layout, char jobu, char jobv, char jobq,
                int m, int n, int p,
                long k, long l,
                IComplexNumber a, int lda,
                IComplexNumber b, int ldb,
                long alpha, long beta,
                IComplexNumber u, int ldu,
                IComplexNumber v, int ldv,
                IComplexNumber q, int ldq,
                long iwork );

    int sggsvd3( int matrix_layout, char jobu, char jobv, char jobq,
                 int m, int n, int p,
                 long k, long l, long a,
                 int lda, long b, int ldb,
                 long alpha, long beta, long u, int ldu,
                 long v, int ldv, long q, int ldq,
                 long iwork );
    int dggsvd3( int matrix_layout, char jobu, char jobv, char jobq,
                 int m, int n, int p,
                 long k, long l, long a,
                 int lda, long b, int ldb,
                 long alpha, long beta, long u,
                 int ldu, long v, int ldv, long q,
                 int ldq, long iwork );
    int cggsvd3( int matrix_layout, char jobu, char jobv, char jobq,
                 int m, int n, int p,
                 long k, long l,
                 IComplexNumber a, int lda,
                 IComplexNumber b, int ldb,
                 long alpha, long beta, IComplexNumber u,
                 int ldu, IComplexNumber v,
                 int ldv, IComplexNumber q,
                 int ldq, long iwork );
    int zggsvd3( int matrix_layout, char jobu, char jobv, char jobq,
                 int m, int n, int p,
                 long k, long l,
                 IComplexNumber a, int lda,
                 IComplexNumber b, int ldb,
                 long alpha, long beta,
                 IComplexNumber u, int ldu,
                 IComplexNumber v, int ldv,
                 IComplexNumber q, int ldq,
                 long iwork );

    int sggsvp( int matrix_layout, char jobu, char jobv, char jobq,
                int m, int p, int n, long a,
                int lda, long b, int ldb, float tola,
                float tolb, long k, long l, long u,
                int ldu, long v, int ldv, long q,
                int ldq );
    int dggsvp( int matrix_layout, char jobu, char jobv, char jobq,
                int m, int p, int n, long a,
                int lda, long b, int ldb,
                double tola, double tolb, long k,
                long l, long u, int ldu, long v,
                int ldv, long q, int ldq );
    int cggsvp( int matrix_layout, char jobu, char jobv, char jobq,
                int m, int p, int n,
                IComplexNumber a, int lda,
                IComplexNumber b, int ldb, float tola,
                float tolb, long k, long l,
                IComplexNumber u, int ldu,
                IComplexNumber v, int ldv,
                IComplexNumber q, int ldq );
    int zggsvp( int matrix_layout, char jobu, char jobv, char jobq,
                int m, int p, int n,
                IComplexNumber a, int lda,
                IComplexNumber b, int ldb,
                double tola, double tolb, long k,
                long l, IComplexNumber u,
                int ldu, IComplexNumber v,
                int ldv, IComplexNumber q,
                int ldq );

    int sggsvp3( int matrix_layout, char jobu, char jobv, char jobq,
                 int m, int p, int n, long a,
                 int lda, long b, int ldb, float tola,
                 float tolb, long k, long l, long u,
                 int ldu, long v, int ldv, long q,
                 int ldq );
    int dggsvp3( int matrix_layout, char jobu, char jobv, char jobq,
                 int m, int p, int n, long a,
                 int lda, long b, int ldb,
                 double tola, double tolb, long k,
                 long l, long u, int ldu, long v,
                 int ldv, long q, int ldq );
    int cggsvp3( int matrix_layout, char jobu, char jobv, char jobq,
                 int m, int p, int n,
                 IComplexNumber a, int lda,
                 IComplexNumber b, int ldb, float tola,
                 float tolb, long k, long l,
                 IComplexNumber u, int ldu,
                 IComplexNumber v, int ldv,
                 IComplexNumber q, int ldq );
    int zggsvp3( int matrix_layout, char jobu, char jobv, char jobq,
                 int m, int p, int n,
                 IComplexNumber a, int lda,
                 IComplexNumber b, int ldb,
                 double tola, double tolb, long k,
                 long l, IComplexNumber u,
                 int ldu, IComplexNumber v,
                 int ldv, IComplexNumber q,
                 int ldq );

    int sgtcon( char norm, int n, final long dl,
                final long d, final long du, final long du2,
                final long ipiv, float anorm, long rcond );
    int dgtcon( char norm, int n, final long dl,
                final long d, final long du, final long du2,
                final long ipiv, double anorm,
                long rcond );
    int cgtcon( char norm, int n,
                final IComplexNumber dl,
                final IComplexNumber d,
                final IComplexNumber du,
                final IComplexNumber du2,
                final long ipiv, float anorm, long rcond );
    int zgtcon( char norm, int n,
                final IComplexNumber dl,
                final IComplexNumber d,
                final IComplexNumber du,
                final IComplexNumber du2,
                final long ipiv, double anorm,
                long rcond );

    int sgtrfs( int matrix_layout, char trans, int n,
                int nrhs, final long dl, final long d,
                final long du, final long dlf, final long df,
                final long duf, final long du2,
                final long ipiv, final long b,
                int ldb, long x, int ldx,
                long ferr, long berr );
    int dgtrfs( int matrix_layout, char trans, int n,
                int nrhs, final long dl, final long d,
                final long du, final long dlf,
                final long df, final long duf,
                final long du2, final long ipiv,
                final long b, int ldb, long x,
                int ldx, long ferr, long berr );
    int cgtrfs( int matrix_layout, char trans, int n,
                int nrhs, final IComplexNumber dl,
                final IComplexNumber d,
                final IComplexNumber du,
                final IComplexNumber dlf,
                final IComplexNumber df,
                final IComplexNumber duf,
                final IComplexNumber du2,
                final long ipiv,
                final IComplexNumber b, int ldb,
                IComplexNumber x, int ldx, long ferr,
                long berr );
    int zgtrfs( int matrix_layout, char trans, int n,
                int nrhs, final IComplexNumber dl,
                final IComplexNumber d,
                final IComplexNumber du,
                final IComplexNumber dlf,
                final IComplexNumber df,
                final IComplexNumber duf,
                final IComplexNumber du2,
                final long ipiv,
                final IComplexNumber b, int ldb,
                IComplexNumber x, int ldx,
                long ferr, long berr );

    int sgtsv( int matrix_layout, int n, int nrhs,
               long dl, long d, long du, long b,
               int ldb );
    int dgtsv( int matrix_layout, int n, int nrhs,
               long dl, long d, long du, long b,
               int ldb );
    int cgtsv( int matrix_layout, int n, int nrhs,
               IComplexNumber dl, IComplexNumber d,
               IComplexNumber du, IComplexNumber b,
               int ldb );
    int zgtsv( int matrix_layout, int n, int nrhs,
               IComplexNumber dl, IComplexNumber d,
               IComplexNumber du, IComplexNumber b,
               int ldb );

    int sgtsvx( int matrix_layout, char fact, char trans,
                int n, int nrhs, final long dl,
                final long d, final long du, long dlf,
                long df, long duf, long du2, long ipiv,
                final long b, int ldb, long x,
                int ldx, long rcond, long ferr,
                long berr );
    int dgtsvx( int matrix_layout, char fact, char trans,
                int n, int nrhs, final long dl,
                final long d, final long du, long dlf,
                long df, long duf, long du2,
                long ipiv, final long b, int ldb,
                long x, int ldx, long rcond,
                long ferr, long berr );
    int cgtsvx( int matrix_layout, char fact, char trans,
                int n, int nrhs,
                final IComplexNumber dl,
                final IComplexNumber d,
                final IComplexNumber du,
                IComplexNumber dlf, IComplexNumber df,
                IComplexNumber duf, IComplexNumber du2,
                long ipiv, final IComplexNumber b,
                int ldb, IComplexNumber x,
                int ldx, long rcond, long ferr,
                long berr );
    int zgtsvx( int matrix_layout, char fact, char trans,
                int n, int nrhs,
                final IComplexNumber dl,
                final IComplexNumber d,
                final IComplexNumber du,
                IComplexNumber dlf,
                IComplexNumber df,
                IComplexNumber duf,
                IComplexNumber du2, long ipiv,
                final IComplexNumber b, int ldb,
                IComplexNumber x, int ldx,
                long rcond, long ferr, long berr );

    int sgttrf( int n, long dl, long d, long du,
                long du2, long ipiv );
    int dgttrf( int n, long dl, long d, long du,
                long du2, long ipiv );
    int cgttrf( int n, IComplexNumber dl,
                IComplexNumber d, IComplexNumber du,
                IComplexNumber du2, long ipiv );
    int zgttrf( int n, IComplexNumber dl,
                IComplexNumber d, IComplexNumber du,
                IComplexNumber du2, long ipiv );

    int sgttrs( int matrix_layout, char trans, int n,
                int nrhs, final long dl, final long d,
                final long du, final long du2,
                final long ipiv, long b, int ldb );
    int dgttrs( int matrix_layout, char trans, int n,
                int nrhs, final long dl, final long d,
                final long du, final long du2,
                final long ipiv, long b, int ldb );
    int cgttrs( int matrix_layout, char trans, int n,
                int nrhs, final IComplexNumber dl,
                final IComplexNumber d,
                final IComplexNumber du,
                final IComplexNumber du2,
                final long ipiv, IComplexNumber b,
                int ldb );
    int zgttrs( int matrix_layout, char trans, int n,
                int nrhs, final IComplexNumber dl,
                final IComplexNumber d,
                final IComplexNumber du,
                final IComplexNumber du2,
                final long ipiv, IComplexNumber b,
                int ldb );

    int chbev( int matrix_layout, char jobz, char uplo, int n,
               int kd, IComplexNumber ab,
               int ldab, long w, IComplexNumber z,
               int ldz );
    int zhbev( int matrix_layout, char jobz, char uplo, int n,
               int kd, IComplexNumber ab,
               int ldab, long w, IComplexNumber z,
               int ldz );

    int chbevd( int matrix_layout, char jobz, char uplo, int n,
                int kd, IComplexNumber ab,
                int ldab, long w, IComplexNumber z,
                int ldz );
    int zhbevd( int matrix_layout, char jobz, char uplo, int n,
                int kd, IComplexNumber ab,
                int ldab, long w, IComplexNumber z,
                int ldz );

    int chbevx( int matrix_layout, char jobz, char range, char uplo,
                int n, int kd,
                IComplexNumber ab, int ldab,
                IComplexNumber q, int ldq, float vl,
                float vu, int il, int iu, float abstol,
                long m, long w, IComplexNumber z,
                int ldz, long ifail );
    int zhbevx( int matrix_layout, char jobz, char range, char uplo,
                int n, int kd,
                IComplexNumber ab, int ldab,
                IComplexNumber q, int ldq, double vl,
                double vu, int il, int iu,
                double abstol, long m, long w,
                IComplexNumber z, int ldz,
                long ifail );

    int chbgst( int matrix_layout, char vect, char uplo, int n,
                int ka, int kb,
                IComplexNumber ab, int ldab,
                final IComplexNumber bb, int ldbb,
                IComplexNumber x, int ldx );
    int zhbgst( int matrix_layout, char vect, char uplo, int n,
                int ka, int kb,
                IComplexNumber ab, int ldab,
                final IComplexNumber bb, int ldbb,
                IComplexNumber x, int ldx );

    int chbgv( int matrix_layout, char jobz, char uplo, int n,
               int ka, int kb,
               IComplexNumber ab, int ldab,
               IComplexNumber bb, int ldbb, long w,
               IComplexNumber z, int ldz );
    int zhbgv( int matrix_layout, char jobz, char uplo, int n,
               int ka, int kb,
               IComplexNumber ab, int ldab,
               IComplexNumber bb, int ldbb, long w,
               IComplexNumber z, int ldz );

    int chbgvd( int matrix_layout, char jobz, char uplo, int n,
                int ka, int kb,
                IComplexNumber ab, int ldab,
                IComplexNumber bb, int ldbb, long w,
                IComplexNumber z, int ldz );
    int zhbgvd( int matrix_layout, char jobz, char uplo, int n,
                int ka, int kb,
                IComplexNumber ab, int ldab,
                IComplexNumber bb, int ldbb,
                long w, IComplexNumber z,
                int ldz );

    int chbgvx( int matrix_layout, char jobz, char range, char uplo,
                int n, int ka, int kb,
                IComplexNumber ab, int ldab,
                IComplexNumber bb, int ldbb,
                IComplexNumber q, int ldq, float vl,
                float vu, int il, int iu, float abstol,
                long m, long w, IComplexNumber z,
                int ldz, long ifail );
    int zhbgvx( int matrix_layout, char jobz, char range, char uplo,
                int n, int ka, int kb,
                IComplexNumber ab, int ldab,
                IComplexNumber bb, int ldbb,
                IComplexNumber q, int ldq, double vl,
                double vu, int il, int iu,
                double abstol, long m, long w,
                IComplexNumber z, int ldz,
                long ifail );

    int chbtrd( int matrix_layout, char vect, char uplo, int n,
                int kd, IComplexNumber ab,
                int ldab, long d, long e,
                IComplexNumber q, int ldq );
    int zhbtrd( int matrix_layout, char vect, char uplo, int n,
                int kd, IComplexNumber ab,
                int ldab, long d, long e,
                IComplexNumber q, int ldq );

    int checon( int matrix_layout, char uplo, int n,
                final IComplexNumber a, int lda,
                final long ipiv, float anorm, long rcond );
    int zhecon( int matrix_layout, char uplo, int n,
                final IComplexNumber a, int lda,
                final long ipiv, double anorm,
                long rcond );

    int cheequb( int matrix_layout, char uplo, int n,
                 final IComplexNumber a, int lda,
                 long s, long scond, long amax );
    int zheequb( int matrix_layout, char uplo, int n,
                 final IComplexNumber a, int lda,
                 long s, long scond, long amax );

    int cheev( int matrix_layout, char jobz, char uplo, int n,
               IComplexNumber a, int lda, long w );
    int zheev( int matrix_layout, char jobz, char uplo, int n,
               IComplexNumber a, int lda, long w );

    int cheevd( int matrix_layout, char jobz, char uplo, int n,
                IComplexNumber a, int lda, long w );
    int zheevd( int matrix_layout, char jobz, char uplo, int n,
                IComplexNumber a, int lda,
                long w );

    int cheevr( int matrix_layout, char jobz, char range, char uplo,
                int n, IComplexNumber a,
                int lda, float vl, float vu, int il,
                int iu, float abstol, long m, long w,
                IComplexNumber z, int ldz,
                long isuppz );
    int zheevr( int matrix_layout, char jobz, char range, char uplo,
                int n, IComplexNumber a,
                int lda, double vl, double vu, int il,
                int iu, double abstol, long m,
                long w, IComplexNumber z, int ldz,
                long isuppz );

    int cheevx( int matrix_layout, char jobz, char range, char uplo,
                int n, IComplexNumber a,
                int lda, float vl, float vu, int il,
                int iu, float abstol, long m, long w,
                IComplexNumber z, int ldz,
                long ifail );
    int zheevx( int matrix_layout, char jobz, char range, char uplo,
                int n, IComplexNumber a,
                int lda, double vl, double vu, int il,
                int iu, double abstol, long m,
                long w, IComplexNumber z, int ldz,
                long ifail );

    int chegst( int matrix_layout, int itype, char uplo,
                int n, IComplexNumber a,
                int lda, final IComplexNumber b,
                int ldb );
    int zhegst( int matrix_layout, int itype, char uplo,
                int n, IComplexNumber a,
                int lda, final IComplexNumber b,
                int ldb );

    int chegv( int matrix_layout, int itype, char jobz,
               char uplo, int n, IComplexNumber a,
               int lda, IComplexNumber b,
               int ldb, long w );
    int zhegv( int matrix_layout, int itype, char jobz,
               char uplo, int n, IComplexNumber a,
               int lda, IComplexNumber b,
               int ldb, long w );

    int chegvd( int matrix_layout, int itype, char jobz,
                char uplo, int n, IComplexNumber a,
                int lda, IComplexNumber b,
                int ldb, long w );
    int zhegvd( int matrix_layout, int itype, char jobz,
                char uplo, int n, IComplexNumber a,
                int lda, IComplexNumber b,
                int ldb, long w );

    int chegvx( int matrix_layout, int itype, char jobz,
                char range, char uplo, int n,
                IComplexNumber a, int lda,
                IComplexNumber b, int ldb, float vl,
                float vu, int il, int iu, float abstol,
                long m, long w, IComplexNumber z,
                int ldz, long ifail );
    int zhegvx( int matrix_layout, int itype, char jobz,
                char range, char uplo, int n,
                IComplexNumber a, int lda,
                IComplexNumber b, int ldb, double vl,
                double vu, int il, int iu,
                double abstol, long m, long w,
                IComplexNumber z, int ldz,
                long ifail );

    int cherfs( int matrix_layout, char uplo, int n,
                int nrhs, final IComplexNumber a,
                int lda, final IComplexNumber af,
                int ldaf, final long ipiv,
                final IComplexNumber b, int ldb,
                IComplexNumber x, int ldx, long ferr,
                long berr );
    int zherfs( int matrix_layout, char uplo, int n,
                int nrhs, final IComplexNumber a,
                int lda, final IComplexNumber af,
                int ldaf, final long ipiv,
                final IComplexNumber b, int ldb,
                IComplexNumber x, int ldx,
                long ferr, long berr );

    int cherfsx( int matrix_layout, char uplo, char equed,
                 int n, int nrhs,
                 final IComplexNumber a, int lda,
                 final IComplexNumber af, int ldaf,
                 final long ipiv, final long s,
                 final IComplexNumber b, int ldb,
                 IComplexNumber x, int ldx,
                 long rcond, long berr, int n_err_bnds,
                 long err_bnds_norm, long err_bnds_comp,
                 int nparams, long params );
    int zherfsx( int matrix_layout, char uplo, char equed,
                 int n, int nrhs,
                 final IComplexNumber a, int lda,
                 final IComplexNumber af, int ldaf,
                 final long ipiv, final long s,
                 final IComplexNumber b, int ldb,
                 IComplexNumber x, int ldx,
                 long rcond, long berr, int n_err_bnds,
                 long err_bnds_norm, long err_bnds_comp,
                 int nparams, long params );

    int chesv( int matrix_layout, char uplo, int n,
               int nrhs, IComplexNumber a,
               int lda, long ipiv,
               IComplexNumber b, int ldb );
    int zhesv( int matrix_layout, char uplo, int n,
               int nrhs, IComplexNumber a,
               int lda, long ipiv,
               IComplexNumber b, int ldb );

    int chesvx( int matrix_layout, char fact, char uplo, int n,
                int nrhs, final IComplexNumber a,
                int lda, IComplexNumber af,
                int ldaf, long ipiv,
                final IComplexNumber b, int ldb,
                IComplexNumber x, int ldx,
                long rcond, long ferr, long berr );
    int zhesvx( int matrix_layout, char fact, char uplo, int n,
                int nrhs, final IComplexNumber a,
                int lda, IComplexNumber af,
                int ldaf, long ipiv,
                final IComplexNumber b, int ldb,
                IComplexNumber x, int ldx,
                long rcond, long ferr, long berr );

    int chesvxx( int matrix_layout, char fact, char uplo,
                 int n, int nrhs,
                 IComplexNumber a, int lda,
                 IComplexNumber af, int ldaf,
                 long ipiv, long equed, long s,
                 IComplexNumber b, int ldb,
                 IComplexNumber x, int ldx,
                 long rcond, long rpvgrw, long berr,
                 int n_err_bnds, long err_bnds_norm,
                 long err_bnds_comp, int nparams,
                 long params );
    int zhesvxx( int matrix_layout, char fact, char uplo,
                 int n, int nrhs,
                 IComplexNumber a, int lda,
                 IComplexNumber af, int ldaf,
                 long ipiv, long equed, long s,
                 IComplexNumber b, int ldb,
                 IComplexNumber x, int ldx,
                 long rcond, long rpvgrw, long berr,
                 int n_err_bnds, long err_bnds_norm,
                 long err_bnds_comp, int nparams,
                 long params );

    int chetrd( int matrix_layout, char uplo, int n,
                IComplexNumber a, int lda, long d,
                long e, IComplexNumber tau );
    int zhetrd( int matrix_layout, char uplo, int n,
                IComplexNumber a, int lda, long d,
                long e, IComplexNumber tau );

    int chetrf( int matrix_layout, char uplo, int n,
                IComplexNumber a, int lda,
                long ipiv );
    int zhetrf( int matrix_layout, char uplo, int n,
                IComplexNumber a, int lda,
                long ipiv );

    int chetri( int matrix_layout, char uplo, int n,
                IComplexNumber a, int lda,
                final long ipiv );
    int zhetri( int matrix_layout, char uplo, int n,
                IComplexNumber a, int lda,
                final long ipiv );

    int chetrs( int matrix_layout, char uplo, int n,
                int nrhs, final IComplexNumber a,
                int lda, final long ipiv,
                IComplexNumber b, int ldb );
    int zhetrs( int matrix_layout, char uplo, int n,
                int nrhs, final IComplexNumber a,
                int lda, final long ipiv,
                IComplexNumber b, int ldb );

    int chfrk( int matrix_layout, char transr, char uplo, char trans,
               int n, int k, float alpha,
               final IComplexNumber a, int lda,
               float beta, IComplexNumber c );
    int zhfrk( int matrix_layout, char transr, char uplo, char trans,
               int n, int k, double alpha,
               final IComplexNumber a, int lda,
               double beta, IComplexNumber c );

    int shgeqz( int matrix_layout, char job, char compq, char compz,
                int n, int ilo, int ihi,
                long h, int ldh, long t, int ldt,
                long alphar, long alphai, long beta, long q,
                int ldq, long z, int ldz );
    int dhgeqz( int matrix_layout, char job, char compq, char compz,
                int n, int ilo, int ihi,
                long h, int ldh, long t, int ldt,
                long alphar, long alphai, long beta,
                long q, int ldq, long z,
                int ldz );
    int chgeqz( int matrix_layout, char job, char compq, char compz,
                int n, int ilo, int ihi,
                IComplexNumber h, int ldh,
                IComplexNumber t, int ldt,
                IComplexNumber alpha,
                IComplexNumber beta, IComplexNumber q,
                int ldq, IComplexNumber z,
                int ldz );
    int zhgeqz( int matrix_layout, char job, char compq, char compz,
                int n, int ilo, int ihi,
                IComplexNumber h, int ldh,
                IComplexNumber t, int ldt,
                IComplexNumber alpha,
                IComplexNumber beta,
                IComplexNumber q, int ldq,
                IComplexNumber z, int ldz );

    int chpcon( int matrix_layout, char uplo, int n,
                final IComplexNumber ap,
                final long ipiv, float anorm, long rcond );
    int zhpcon( int matrix_layout, char uplo, int n,
                final IComplexNumber ap,
                final long ipiv, double anorm,
                long rcond );

    int chpev( int matrix_layout, char jobz, char uplo, int n,
               IComplexNumber ap, long w,
               IComplexNumber z, int ldz );
    int zhpev( int matrix_layout, char jobz, char uplo, int n,
               IComplexNumber ap, long w,
               IComplexNumber z, int ldz );

    int chpevd( int matrix_layout, char jobz, char uplo, int n,
                IComplexNumber ap, long w,
                IComplexNumber z, int ldz );
    int zhpevd( int matrix_layout, char jobz, char uplo, int n,
                IComplexNumber ap, long w,
                IComplexNumber z, int ldz );

    int chpevx( int matrix_layout, char jobz, char range, char uplo,
                int n, IComplexNumber ap, float vl,
                float vu, int il, int iu, float abstol,
                long m, long w, IComplexNumber z,
                int ldz, long ifail );
    int zhpevx( int matrix_layout, char jobz, char range, char uplo,
                int n, IComplexNumber ap, double vl,
                double vu, int il, int iu,
                double abstol, long m, long w,
                IComplexNumber z, int ldz,
                long ifail );

    int chpgst( int matrix_layout, int itype, char uplo,
                int n, IComplexNumber ap,
                final IComplexNumber bp );
    int zhpgst( int matrix_layout, int itype, char uplo,
                int n, IComplexNumber ap,
                final IComplexNumber bp );

    int chpgv( int matrix_layout, int itype, char jobz,
               char uplo, int n, IComplexNumber ap,
               IComplexNumber bp, long w,
               IComplexNumber z, int ldz );
    int zhpgv( int matrix_layout, int itype, char jobz,
               char uplo, int n, IComplexNumber ap,
               IComplexNumber bp, long w,
               IComplexNumber z, int ldz );

    int chpgvd( int matrix_layout, int itype, char jobz,
                char uplo, int n, IComplexNumber ap,
                IComplexNumber bp, long w,
                IComplexNumber z, int ldz );
    int zhpgvd( int matrix_layout, int itype, char jobz,
                char uplo, int n, IComplexNumber ap,
                IComplexNumber bp, long w,
                IComplexNumber z, int ldz );

    int chpgvx( int matrix_layout, int itype, char jobz,
                char range, char uplo, int n,
                IComplexNumber ap, IComplexNumber bp,
                float vl, float vu, int il, int iu,
                float abstol, long m, long w,
                IComplexNumber z, int ldz,
                long ifail );
    int zhpgvx( int matrix_layout, int itype, char jobz,
                char range, char uplo, int n,
                IComplexNumber ap, IComplexNumber bp,
                double vl, double vu, int il, int iu,
                double abstol, long m, long w,
                IComplexNumber z, int ldz,
                long ifail );

    int chprfs( int matrix_layout, char uplo, int n,
                int nrhs, final IComplexNumber ap,
                final IComplexNumber afp,
                final long ipiv,
                final IComplexNumber b, int ldb,
                IComplexNumber x, int ldx, long ferr,
                long berr );
    int zhprfs( int matrix_layout, char uplo, int n,
                int nrhs, final IComplexNumber ap,
                final IComplexNumber afp,
                final long ipiv,
                final IComplexNumber b, int ldb,
                IComplexNumber x, int ldx,
                long ferr, long berr );

    int chpsv( int matrix_layout, char uplo, int n,
               int nrhs, IComplexNumber ap,
               long ipiv, IComplexNumber b,
               int ldb );
    int zhpsv( int matrix_layout, char uplo, int n,
               int nrhs, IComplexNumber ap,
               long ipiv, IComplexNumber b,
               int ldb );

    int chpsvx( int matrix_layout, char fact, char uplo, int n,
                int nrhs, final IComplexNumber ap,
                IComplexNumber afp, long ipiv,
                final IComplexNumber b, int ldb,
                IComplexNumber x, int ldx,
                long rcond, long ferr, long berr );
    int zhpsvx( int matrix_layout, char fact, char uplo, int n,
                int nrhs, final IComplexNumber ap,
                IComplexNumber afp, long ipiv,
                final IComplexNumber b, int ldb,
                IComplexNumber x, int ldx,
                long rcond, long ferr, long berr );

    int chptrd( int matrix_layout, char uplo, int n,
                IComplexNumber ap, long d, long e,
                IComplexNumber tau );
    int zhptrd( int matrix_layout, char uplo, int n,
                IComplexNumber ap, long d, long e,
                IComplexNumber tau );

    int chptrf( int matrix_layout, char uplo, int n,
                IComplexNumber ap, long ipiv );
    int zhptrf( int matrix_layout, char uplo, int n,
                IComplexNumber ap, long ipiv );

    int chptri( int matrix_layout, char uplo, int n,
                IComplexNumber ap, final long ipiv );
    int zhptri( int matrix_layout, char uplo, int n,
                IComplexNumber ap, final long ipiv );

    int chptrs( int matrix_layout, char uplo, int n,
                int nrhs, final IComplexNumber ap,
                final long ipiv, IComplexNumber b,
                int ldb );
    int zhptrs( int matrix_layout, char uplo, int n,
                int nrhs, final IComplexNumber ap,
                final long ipiv, IComplexNumber b,
                int ldb );

    int shsein( int matrix_layout, char job, char eigsrc, char initv,
                long  select, int n, final long h,
                int ldh, long wr, final long wi,
                long vl, int ldvl, long vr,
                int ldvr, int mm, long m,
                long ifaill, long ifailr );
    int dhsein( int matrix_layout, char job, char eigsrc, char initv,
                long  select, int n,
                final long h, int ldh, long wr,
                final long wi, long vl, int ldvl,
                long vr, int ldvr, int mm,
                long m, long ifaill,
                long ifailr );
    int chsein( int matrix_layout, char job, char eigsrc, char initv,
                long   select, int n,
                final IComplexNumber h, int ldh,
                IComplexNumber w, IComplexNumber vl,
                int ldvl, IComplexNumber vr,
                int ldvr, int mm, long m,
                long ifaill, long ifailr );
    int zhsein( int matrix_layout, char job, char eigsrc, char initv,
                long   select, int n,
                final IComplexNumber h, int ldh,
                IComplexNumber w, IComplexNumber vl,
                int ldvl, IComplexNumber vr,
                int ldvr, int mm, long m,
                long ifaill, long ifailr );

    int shseqr( int matrix_layout, char job, char compz, int n,
                int ilo, int ihi, long h,
                int ldh, long wr, long wi, long z,
                int ldz );
    int dhseqr( int matrix_layout, char job, char compz, int n,
                int ilo, int ihi, long h,
                int ldh, long wr, long wi, long z,
                int ldz );
    int chseqr( int matrix_layout, char job, char compz, int n,
                int ilo, int ihi,
                IComplexNumber h, int ldh,
                IComplexNumber w, IComplexNumber z,
                int ldz );
    int zhseqr( int matrix_layout, char job, char compz, int n,
                int ilo, int ihi,
                IComplexNumber h, int ldh,
                IComplexNumber w, IComplexNumber z,
                int ldz );

    int clacgv( int n, IComplexNumber x,
                int incx );
    int zlacgv( int n, IComplexNumber x,
                int incx );

    int slacn2( int n, long v, long x, long isgn,
                long est, long kase, long isave );
    int dlacn2( int n, long v, long x, long isgn,
                long est, long kase, long isave );
    int clacn2( int n, IComplexNumber v,
                IComplexNumber x,
                long est, long kase, long isave );
    int zlacn2( int n, IComplexNumber v,
                IComplexNumber x,
                long est, long kase, long isave );

    int slacpy( int matrix_layout, char uplo, int m,
                int n, final long a, int lda, long b,
                int ldb );
    int dlacpy( int matrix_layout, char uplo, int m,
                int n, final long a, int lda, long b,
                int ldb );
    int clacpy( int matrix_layout, char uplo, int m,
                int n, final IComplexNumber a,
                int lda, IComplexNumber b,
                int ldb );
    int zlacpy( int matrix_layout, char uplo, int m,
                int n, final IComplexNumber a,
                int lda, IComplexNumber b,
                int ldb );

    int clacp2( int matrix_layout, char uplo, int m,
                int n, final long a, int lda,
                IComplexNumber b, int ldb );
    int zlacp2( int matrix_layout, char uplo, int m,
                int n, final long a, int lda,
                IComplexNumber b, int ldb );

    int zlag2c( int matrix_layout, int m, int n,
                final IComplexNumber a, int lda,
                IComplexNumber sa, int ldsa );

    int slag2d( int matrix_layout, int m, int n,
                final long sa, int ldsa, long a,
                int lda );

    int dlag2s( int matrix_layout, int m, int n,
                final long a, int lda, long sa,
                int ldsa );

    int clag2z( int matrix_layout, int m, int n,
                final IComplexNumber sa, int ldsa,
                IComplexNumber a, int lda );

    int slagge( int matrix_layout, int m, int n,
                int kl, int ku, final long d,
                long a, int lda, long iseed );
    int dlagge( int matrix_layout, int m, int n,
                int kl, int ku, final long d,
                long a, int lda, long iseed );
    int clagge( int matrix_layout, int m, int n,
                int kl, int ku, final long d,
                IComplexNumber a, int lda,
                long iseed );
    int zlagge( int matrix_layout, int m, int n,
                int kl, int ku, final long d,
                IComplexNumber a, int lda,
                long iseed );

    float slamch( char cmach );
    double dlamch( char cmach );

    float slange( int matrix_layout, char norm, int m,
                  int n, final long a, int lda );
    double dlange( int matrix_layout, char norm, int m,
                   int n, final long a, int lda );
    float clange( int matrix_layout, char norm, int m,
                  int n, final IComplexNumber a,
                  int lda );
    double zlange( int matrix_layout, char norm, int m,
                   int n, final IComplexNumber a,
                   int lda );

    float clanhe( int matrix_layout, char norm, char uplo, int n,
                  final IComplexNumber a, int lda );
    double zlanhe( int matrix_layout, char norm, char uplo, int n,
                   final IComplexNumber a, int lda );

    float slansy( int matrix_layout, char norm, char uplo, int n,
                  final long a, int lda );
    double dlansy( int matrix_layout, char norm, char uplo, int n,
                   final long a, int lda );
    float clansy( int matrix_layout, char norm, char uplo, int n,
                  final IComplexNumber a, int lda );
    double zlansy( int matrix_layout, char norm, char uplo, int n,
                   final IComplexNumber a, int lda );

    float slantr( int matrix_layout, char norm, char uplo, char diag,
                  int m, int n, final long a,
                  int lda );
    double dlantr( int matrix_layout, char norm, char uplo, char diag,
                   int m, int n, final long a,
                   int lda );
    float clantr( int matrix_layout, char norm, char uplo, char diag,
                  int m, int n, final IComplexNumber a,
                  int lda );
    double zlantr( int matrix_layout, char norm, char uplo, char diag,
                   int m, int n, final IComplexNumber a,
                   int lda );


    int slarfb( int matrix_layout, char side, char trans, char direct,
                char storev, int m, int n,
                int k, final long v, int ldv,
                final long t, int ldt, long c,
                int ldc );
    int dlarfb( int matrix_layout, char side, char trans, char direct,
                char storev, int m, int n,
                int k, final long v, int ldv,
                final long t, int ldt, long c,
                int ldc );
    int clarfb( int matrix_layout, char side, char trans, char direct,
                char storev, int m, int n,
                int k, final IComplexNumber v,
                int ldv, final IComplexNumber t,
                int ldt, IComplexNumber c,
                int ldc );
    int zlarfb( int matrix_layout, char side, char trans, char direct,
                char storev, int m, int n,
                int k, final IComplexNumber v,
                int ldv, final IComplexNumber t,
                int ldt, IComplexNumber c,
                int ldc );

    int slarfg( int n, long alpha, long x,
                int incx, long tau );
    int dlarfg( int n, long alpha, long x,
                int incx, long tau );
    int clarfg( int n, IComplexNumber alpha,
                IComplexNumber x, int incx,
                IComplexNumber tau );
    int zlarfg( int n, IComplexNumber alpha,
                IComplexNumber x, int incx,
                IComplexNumber tau );

    int slarft( int matrix_layout, char direct, char storev,
                int n, int k, final long v,
                int ldv, final long tau, long t,
                int ldt );
    int dlarft( int matrix_layout, char direct, char storev,
                int n, int k, final long v,
                int ldv, final long tau, long t,
                int ldt );
    int clarft( int matrix_layout, char direct, char storev,
                int n, int k,
                final IComplexNumber v, int ldv,
                final IComplexNumber tau,
                IComplexNumber t, int ldt );
    int zlarft( int matrix_layout, char direct, char storev,
                int n, int k,
                final IComplexNumber v, int ldv,
                final IComplexNumber tau,
                IComplexNumber t, int ldt );

    int slarfx( int matrix_layout, char side, int m,
                int n, final long v, float tau, long c,
                int ldc, long work );
    int dlarfx( int matrix_layout, char side, int m,
                int n, final long v, double tau, long c,
                int ldc, long work );
    int clarfx( int matrix_layout, char side, int m,
                int n, final IComplexNumber v,
                IComplexNumber tau, IComplexNumber c,
                int ldc, IComplexNumber work );
    int zlarfx( int matrix_layout, char side, int m,
                int n, final IComplexNumber v,
                IComplexNumber tau, IComplexNumber c,
                int ldc, IComplexNumber work );

    int slarnv( int idist, long iseed, int n,
                long x );
    int dlarnv( int idist, long iseed, int n,
                long x );
    int clarnv( int idist, long iseed, int n,
                IComplexNumber x );
    int zlarnv( int idist, long iseed, int n,
                IComplexNumber x );

    int slascl( int matrix_layout, char type, int kl,
                int ku, float cfrom, float cto,
                int m, int n, long a,
                int lda );
    int dlascl( int matrix_layout, char type, int kl,
                int ku, double cfrom, double cto,
                int m, int n, long a,
                int lda );
    int clascl( int matrix_layout, char type, int kl,
                int ku, float cfrom, float cto,
                int m, int n, IComplexNumber a,
                int lda );
    int zlascl( int matrix_layout, char type, int kl,
                int ku, double cfrom, double cto,
                int m, int n, IComplexNumber a,
                int lda );

    int slaset( int matrix_layout, char uplo, int m,
                int n, float alpha, float beta, long a,
                int lda );
    int dlaset( int matrix_layout, char uplo, int m,
                int n, double alpha, double beta, long a,
                int lda );
    int claset( int matrix_layout, char uplo, int m,
                int n, IComplexNumber alpha,
                IComplexNumber beta, IComplexNumber a,
                int lda );
    int zlaset( int matrix_layout, char uplo, int m,
                int n, IComplexNumber alpha,
                IComplexNumber beta, IComplexNumber a,
                int lda );

    int slasrt( char id, int n, long d );
    int dlasrt( char id, int n, long d );

    int slaswp( int matrix_layout, int n, long a,
                int lda, int k1, int k2,
                final long ipiv, int incx );
    int dlaswp( int matrix_layout, int n, long a,
                int lda, int k1, int k2,
                final long ipiv, int incx );
    int claswp( int matrix_layout, int n,
                IComplexNumber a, int lda,
                int k1, int k2, final long ipiv,
                int incx );
    int zlaswp( int matrix_layout, int n,
                IComplexNumber a, int lda,
                int k1, int k2, final long ipiv,
                int incx );

    int slatms( int matrix_layout, int m, int n,
                char dist, long iseed, char sym, long d,
                int mode, float cond, float dmax,
                int kl, int ku, char pack, long a,
                int lda );
    int dlatms( int matrix_layout, int m, int n,
                char dist, long iseed, char sym, long d,
                int mode, double cond, double dmax,
                int kl, int ku, char pack, long a,
                int lda );
    int clatms( int matrix_layout, int m, int n,
                char dist, long iseed, char sym, long d,
                int mode, float cond, float dmax,
                int kl, int ku, char pack,
                IComplexNumber a, int lda );
    int zlatms( int matrix_layout, int m, int n,
                char dist, long iseed, char sym, long d,
                int mode, double cond, double dmax,
                int kl, int ku, char pack,
                IComplexNumber a, int lda );

    int slauum( int matrix_layout, char uplo, int n, long a,
                int lda );
    int dlauum( int matrix_layout, char uplo, int n, long a,
                int lda );
    int clauum( int matrix_layout, char uplo, int n,
                IComplexNumber a, int lda );
    int zlauum( int matrix_layout, char uplo, int n,
                IComplexNumber a, int lda );

    int sopgtr( int matrix_layout, char uplo, int n,
                final long ap, final long tau, long q,
                int ldq );
    int dopgtr( int matrix_layout, char uplo, int n,
                final long ap, final long tau, long q,
                int ldq );

    int sopmtr( int matrix_layout, char side, char uplo, char trans,
                int m, int n, final long ap,
                final long tau, long c, int ldc );
    int dopmtr( int matrix_layout, char side, char uplo, char trans,
                int m, int n, final long ap,
                final long tau, long c, int ldc );

    int sorgbr( int matrix_layout, char vect, int m,
                int n, int k, long a, int lda,
                final long tau );
    int dorgbr( int matrix_layout, char vect, int m,
                int n, int k, long a,
                int lda, final long tau );

    int sorghr( int matrix_layout, int n, int ilo,
                int ihi, long a, int lda,
                final long tau );
    int dorghr( int matrix_layout, int n, int ilo,
                int ihi, long a, int lda,
                final long tau );

    int sorglq( int matrix_layout, int m, int n,
                int k, long a, int lda,
                final long tau );
    int dorglq( int matrix_layout, int m, int n,
                int k, long a, int lda,
                final long tau );

    int sorgql( int matrix_layout, int m, int n,
                int k, long a, int lda,
                final long tau );
    int dorgql( int matrix_layout, int m, int n,
                int k, long a, int lda,
                final long tau );

    int sorgqr( int matrix_layout, int m, int n,
                int k, long a, int lda,
                final long tau );
    int dorgqr( int matrix_layout, int m, int n,
                int k, long a, int lda,
                final long tau );

    int sorgrq( int matrix_layout, int m, int n,
                int k, long a, int lda,
                final long tau );
    int dorgrq( int matrix_layout, int m, int n,
                int k, long a, int lda,
                final long tau );

    int sorgtr( int matrix_layout, char uplo, int n, long a,
                int lda, final long tau );
    int dorgtr( int matrix_layout, char uplo, int n, long a,
                int lda, final long tau );

    int sormbr( int matrix_layout, char vect, char side, char trans,
                int m, int n, int k,
                final long a, int lda, final long tau,
                long c, int ldc );
    int dormbr( int matrix_layout, char vect, char side, char trans,
                int m, int n, int k,
                final long a, int lda, final long tau,
                long c, int ldc );

    int sormhr( int matrix_layout, char side, char trans,
                int m, int n, int ilo,
                int ihi, final long a, int lda,
                final long tau, long c, int ldc );
    int dormhr( int matrix_layout, char side, char trans,
                int m, int n, int ilo,
                int ihi, final long a, int lda,
                final long tau, long c, int ldc );

    int sormlq( int matrix_layout, char side, char trans,
                int m, int n, int k,
                final long a, int lda, final long tau,
                long c, int ldc );
    int dormlq( int matrix_layout, char side, char trans,
                int m, int n, int k,
                final long a, int lda, final long tau,
                long c, int ldc );

    int sormql( int matrix_layout, char side, char trans,
                int m, int n, int k,
                final long a, int lda, final long tau,
                long c, int ldc );
    int dormql( int matrix_layout, char side, char trans,
                int m, int n, int k,
                final long a, int lda, final long tau,
                long c, int ldc );

    int sormqr( int matrix_layout, char side, char trans,
                int m, int n, int k,
                final long a, int lda, final long tau,
                long c, int ldc );
    int dormqr( int matrix_layout, char side, char trans,
                int m, int n, int k,
                final long a, int lda, final long tau,
                long c, int ldc );

    int sormrq( int matrix_layout, char side, char trans,
                int m, int n, int k,
                final long a, int lda, final long tau,
                long c, int ldc );
    int dormrq( int matrix_layout, char side, char trans,
                int m, int n, int k,
                final long a, int lda, final long tau,
                long c, int ldc );

    int sormrz( int matrix_layout, char side, char trans,
                int m, int n, int k,
                int l, final long a, int lda,
                final long tau, long c, int ldc );
    int dormrz( int matrix_layout, char side, char trans,
                int m, int n, int k,
                int l, final long a, int lda,
                final long tau, long c, int ldc );

    int sormtr( int matrix_layout, char side, char uplo, char trans,
                int m, int n, final long a,
                int lda, final long tau, long c,
                int ldc );
    int dormtr( int matrix_layout, char side, char uplo, char trans,
                int m, int n, final long a,
                int lda, final long tau, long c,
                int ldc );

    int spbcon( int matrix_layout, char uplo, int n,
                int kd, final long ab, int ldab,
                float anorm, long rcond );
    int dpbcon( int matrix_layout, char uplo, int n,
                int kd, final long ab, int ldab,
                double anorm, long rcond );
    int cpbcon( int matrix_layout, char uplo, int n,
                int kd, final IComplexNumber ab,
                int ldab, float anorm, long rcond );
    int zpbcon( int matrix_layout, char uplo, int n,
                int kd, final IComplexNumber ab,
                int ldab, double anorm, long rcond );

    int spbequ( int matrix_layout, char uplo, int n,
                int kd, final long ab, int ldab,
                long s, long scond, long amax );
    int dpbequ( int matrix_layout, char uplo, int n,
                int kd, final long ab, int ldab,
                long s, long scond, long amax );
    int cpbequ( int matrix_layout, char uplo, int n,
                int kd, final IComplexNumber ab,
                int ldab, long s, long scond,
                long amax );
    int zpbequ( int matrix_layout, char uplo, int n,
                int kd, final IComplexNumber ab,
                int ldab, long s, long scond,
                long amax );

    int spbrfs( int matrix_layout, char uplo, int n,
                int kd, int nrhs, final long ab,
                int ldab, final long afb, int ldafb,
                final long b, int ldb, long x,
                int ldx, long ferr, long berr );
    int dpbrfs( int matrix_layout, char uplo, int n,
                int kd, int nrhs, final long ab,
                int ldab, final long afb, int ldafb,
                final long b, int ldb, long x,
                int ldx, long ferr, long berr );
    int cpbrfs( int matrix_layout, char uplo, int n,
                int kd, int nrhs,
                final IComplexNumber ab, int ldab,
                final IComplexNumber afb, int ldafb,
                final IComplexNumber b, int ldb,
                IComplexNumber x, int ldx, long ferr,
                long berr );
    int zpbrfs( int matrix_layout, char uplo, int n,
                int kd, int nrhs,
                final IComplexNumber ab, int ldab,
                final IComplexNumber afb, int ldafb,
                final IComplexNumber b, int ldb,
                IComplexNumber x, int ldx,
                long ferr, long berr );

    int spbstf( int matrix_layout, char uplo, int n,
                int kb, long bb, int ldbb );
    int dpbstf( int matrix_layout, char uplo, int n,
                int kb, long bb, int ldbb );
    int cpbstf( int matrix_layout, char uplo, int n,
                int kb, IComplexNumber bb,
                int ldbb );
    int zpbstf( int matrix_layout, char uplo, int n,
                int kb, IComplexNumber bb,
                int ldbb );

    int spbsv( int matrix_layout, char uplo, int n,
               int kd, int nrhs, long ab,
               int ldab, long b, int ldb );
    int dpbsv( int matrix_layout, char uplo, int n,
               int kd, int nrhs, long ab,
               int ldab, long b, int ldb );
    int cpbsv( int matrix_layout, char uplo, int n,
               int kd, int nrhs,
               IComplexNumber ab, int ldab,
               IComplexNumber b, int ldb );
    int zpbsv( int matrix_layout, char uplo, int n,
               int kd, int nrhs,
               IComplexNumber ab, int ldab,
               IComplexNumber b, int ldb );

    int spbsvx( int matrix_layout, char fact, char uplo, int n,
                int kd, int nrhs, long ab,
                int ldab, long afb, int ldafb,
                long equed, long s, long b, int ldb,
                long x, int ldx, long rcond, long ferr,
                long berr );
    int dpbsvx( int matrix_layout, char fact, char uplo, int n,
                int kd, int nrhs, long ab,
                int ldab, long afb, int ldafb,
                long equed, long s, long b, int ldb,
                long x, int ldx, long rcond,
                long ferr, long berr );
    int cpbsvx( int matrix_layout, char fact, char uplo, int n,
                int kd, int nrhs,
                IComplexNumber ab, int ldab,
                IComplexNumber afb, int ldafb,
                long equed, long s, IComplexNumber b,
                int ldb, IComplexNumber x,
                int ldx, long rcond, long ferr,
                long berr );
    int zpbsvx( int matrix_layout, char fact, char uplo, int n,
                int kd, int nrhs,
                IComplexNumber ab, int ldab,
                IComplexNumber afb, int ldafb,
                long equed, long s, IComplexNumber b,
                int ldb, IComplexNumber x,
                int ldx, long rcond, long ferr,
                long berr );

    int spbtrf( int matrix_layout, char uplo, int n,
                int kd, long ab, int ldab );
    int dpbtrf( int matrix_layout, char uplo, int n,
                int kd, long ab, int ldab );
    int cpbtrf( int matrix_layout, char uplo, int n,
                int kd, IComplexNumber ab,
                int ldab );
    int zpbtrf( int matrix_layout, char uplo, int n,
                int kd, IComplexNumber ab,
                int ldab );

    int spbtrs( int matrix_layout, char uplo, int n,
                int kd, int nrhs, final long ab,
                int ldab, long b, int ldb );
    int dpbtrs( int matrix_layout, char uplo, int n,
                int kd, int nrhs, final long ab,
                int ldab, long b, int ldb );
    int cpbtrs( int matrix_layout, char uplo, int n,
                int kd, int nrhs,
                final IComplexNumber ab, int ldab,
                IComplexNumber b, int ldb );
    int zpbtrs( int matrix_layout, char uplo, int n,
                int kd, int nrhs,
                final IComplexNumber ab, int ldab,
                IComplexNumber b, int ldb );

    int spftrf( int matrix_layout, char transr, char uplo,
                int n, long a );
    int dpftrf( int matrix_layout, char transr, char uplo,
                int n, long a );
    int cpftrf( int matrix_layout, char transr, char uplo,
                int n, IComplexNumber a );
    int zpftrf( int matrix_layout, char transr, char uplo,
                int n, IComplexNumber a );

    int spftri( int matrix_layout, char transr, char uplo,
                int n, long a );
    int dpftri( int matrix_layout, char transr, char uplo,
                int n, long a );
    int cpftri( int matrix_layout, char transr, char uplo,
                int n, IComplexNumber a );
    int zpftri( int matrix_layout, char transr, char uplo,
                int n, IComplexNumber a );

    int spftrs( int matrix_layout, char transr, char uplo,
                int n, int nrhs, final long a,
                long b, int ldb );
    int dpftrs( int matrix_layout, char transr, char uplo,
                int n, int nrhs, final long a,
                long b, int ldb );
    int cpftrs( int matrix_layout, char transr, char uplo,
                int n, int nrhs,
                final IComplexNumber a,
                IComplexNumber b, int ldb );
    int zpftrs( int matrix_layout, char transr, char uplo,
                int n, int nrhs,
                final IComplexNumber a,
                IComplexNumber b, int ldb );

    int spocon( int matrix_layout, char uplo, int n,
                final long a, int lda, float anorm,
                long rcond );
    int dpocon( int matrix_layout, char uplo, int n,
                final long a, int lda, double anorm,
                long rcond );
    int cpocon( int matrix_layout, char uplo, int n,
                final IComplexNumber a, int lda,
                float anorm, long rcond );
    int zpocon( int matrix_layout, char uplo, int n,
                final IComplexNumber a, int lda,
                double anorm, long rcond );

    int spoequ( int matrix_layout, int n, final long a,
                int lda, long s, long scond,
                long amax );
    int dpoequ( int matrix_layout, int n, final long a,
                int lda, long s, long scond,
                long amax );
    int cpoequ( int matrix_layout, int n,
                final IComplexNumber a, int lda,
                long s, long scond, long amax );
    int zpoequ( int matrix_layout, int n,
                final IComplexNumber a, int lda,
                long s, long scond, long amax );

    int spoequb( int matrix_layout, int n, final long a,
                 int lda, long s, long scond,
                 long amax );
    int dpoequb( int matrix_layout, int n, final long a,
                 int lda, long s, long scond,
                 long amax );
    int cpoequb( int matrix_layout, int n,
                 final IComplexNumber a, int lda,
                 long s, long scond, long amax );
    int zpoequb( int matrix_layout, int n,
                 final IComplexNumber a, int lda,
                 long s, long scond, long amax );

    int sporfs( int matrix_layout, char uplo, int n,
                int nrhs, final long a, int lda,
                final long af, int ldaf, final long b,
                int ldb, long x, int ldx,
                long ferr, long berr );
    int dporfs( int matrix_layout, char uplo, int n,
                int nrhs, final long a, int lda,
                final long af, int ldaf, final long b,
                int ldb, long x, int ldx,
                long ferr, long berr );
    int cporfs( int matrix_layout, char uplo, int n,
                int nrhs, final IComplexNumber a,
                int lda, final IComplexNumber af,
                int ldaf, final IComplexNumber b,
                int ldb, IComplexNumber x,
                int ldx, long ferr, long berr );
    int zporfs( int matrix_layout, char uplo, int n,
                int nrhs, final IComplexNumber a,
                int lda, final IComplexNumber af,
                int ldaf, final IComplexNumber b,
                int ldb, IComplexNumber x,
                int ldx, long ferr, long berr );

    int sporfsx( int matrix_layout, char uplo, char equed,
                 int n, int nrhs, final long a,
                 int lda, final long af, int ldaf,
                 final long s, final long b, int ldb,
                 long x, int ldx, long rcond, long berr,
                 int n_err_bnds, long err_bnds_norm,
                 long err_bnds_comp, int nparams,
                 long params );
    int dporfsx( int matrix_layout, char uplo, char equed,
                 int n, int nrhs, final long a,
                 int lda, final long af, int ldaf,
                 final long s, final long b, int ldb,
                 long x, int ldx, long rcond,
                 long berr, int n_err_bnds,
                 long err_bnds_norm, long err_bnds_comp,
                 int nparams, long params );
    int cporfsx( int matrix_layout, char uplo, char equed,
                 int n, int nrhs,
                 final IComplexNumber a, int lda,
                 final IComplexNumber af, int ldaf,
                 final long s, final IComplexNumber b,
                 int ldb, IComplexNumber x,
                 int ldx, long rcond, long berr,
                 int n_err_bnds, long err_bnds_norm,
                 long err_bnds_comp, int nparams,
                 long params );
    int zporfsx( int matrix_layout, char uplo, char equed,
                 int n, int nrhs,
                 final IComplexNumber a, int lda,
                 final IComplexNumber af, int ldaf,
                 final long s, final IComplexNumber b,
                 int ldb, IComplexNumber x,
                 int ldx, long rcond, long berr,
                 int n_err_bnds, long err_bnds_norm,
                 long err_bnds_comp, int nparams,
                 long params );

    int sposv( int matrix_layout, char uplo, int n,
               int nrhs, long a, int lda, long b,
               int ldb );
    int dposv( int matrix_layout, char uplo, int n,
               int nrhs, long a, int lda, long b,
               int ldb );
    int cposv( int matrix_layout, char uplo, int n,
               int nrhs, IComplexNumber a,
               int lda, IComplexNumber b,
               int ldb );
    int zposv( int matrix_layout, char uplo, int n,
               int nrhs, IComplexNumber a,
               int lda, IComplexNumber b,
               int ldb );
    int dsposv( int matrix_layout, char uplo, int n,
                int nrhs, long a, int lda,
                long b, int ldb, long x, int ldx,
                long iter );
    int zcposv( int matrix_layout, char uplo, int n,
                int nrhs, IComplexNumber a,
                int lda, IComplexNumber b,
                int ldb, IComplexNumber x,
                int ldx, long iter );

    int sposvx( int matrix_layout, char fact, char uplo, int n,
                int nrhs, long a, int lda, long af,
                int ldaf, long equed, long s, long b,
                int ldb, long x, int ldx,
                long rcond, long ferr, long berr );
    int dposvx( int matrix_layout, char fact, char uplo, int n,
                int nrhs, long a, int lda,
                long af, int ldaf, long equed, long s,
                long b, int ldb, long x, int ldx,
                long rcond, long ferr, long berr );
    int cposvx( int matrix_layout, char fact, char uplo, int n,
                int nrhs, IComplexNumber a,
                int lda, IComplexNumber af,
                int ldaf, long equed, long s,
                IComplexNumber b, int ldb,
                IComplexNumber x, int ldx,
                long rcond, long ferr, long berr );
    int zposvx( int matrix_layout, char fact, char uplo, int n,
                int nrhs, IComplexNumber a,
                int lda, IComplexNumber af,
                int ldaf, long equed, long s,
                IComplexNumber b, int ldb,
                IComplexNumber x, int ldx,
                long rcond, long ferr, long berr );

    int sposvxx( int matrix_layout, char fact, char uplo,
                 int n, int nrhs, long a,
                 int lda, long af, int ldaf,
                 long equed, long s, long b, int ldb,
                 long x, int ldx, long rcond,
                 long rpvgrw, long berr, int n_err_bnds,
                 long err_bnds_norm, long err_bnds_comp,
                 int nparams, long params );
    int dposvxx( int matrix_layout, char fact, char uplo,
                 int n, int nrhs, long a,
                 int lda, long af, int ldaf,
                 long equed, long s, long b, int ldb,
                 long x, int ldx, long rcond,
                 long rpvgrw, long berr, int n_err_bnds,
                 long err_bnds_norm, long err_bnds_comp,
                 int nparams, long params );
    int cposvxx( int matrix_layout, char fact, char uplo,
                 int n, int nrhs,
                 IComplexNumber a, int lda,
                 IComplexNumber af, int ldaf,
                 long equed, long s, IComplexNumber b,
                 int ldb, IComplexNumber x,
                 int ldx, long rcond, long rpvgrw,
                 long berr, int n_err_bnds,
                 long err_bnds_norm, long err_bnds_comp,
                 int nparams, long params );
    int zposvxx( int matrix_layout, char fact, char uplo,
                 int n, int nrhs,
                 IComplexNumber a, int lda,
                 IComplexNumber af, int ldaf,
                 long equed, long s, IComplexNumber b,
                 int ldb, IComplexNumber x,
                 int ldx, long rcond, long rpvgrw,
                 long berr, int n_err_bnds,
                 long err_bnds_norm, long err_bnds_comp,
                 int nparams, long params );

    int spotrf2( int matrix_layout, char uplo, int n, long a,
                 int lda );
    int dpotrf2( int matrix_layout, char uplo, int n, long a,
                 int lda );
    int cpotrf2( int matrix_layout, char uplo, int n,
                 IComplexNumber a, int lda );
    int zpotrf2( int matrix_layout, char uplo, int n,
                 IComplexNumber a, int lda );

    int spotrf( int matrix_layout, char uplo, int n, long a,
                int lda );
    int dpotrf( int matrix_layout, char uplo, int n, long a,
                int lda );
    int cpotrf( int matrix_layout, char uplo, int n,
                IComplexNumber a, int lda );
    int zpotrf( int matrix_layout, char uplo, int n,
                IComplexNumber a, int lda );

    int spotri( int matrix_layout, char uplo, int n, long a,
                int lda );
    int dpotri( int matrix_layout, char uplo, int n, long a,
                int lda );
    int cpotri( int matrix_layout, char uplo, int n,
                IComplexNumber a, int lda );
    int zpotri( int matrix_layout, char uplo, int n,
                IComplexNumber a, int lda );

    int spotrs( int matrix_layout, char uplo, int n,
                int nrhs, final long a, int lda,
                long b, int ldb );
    int dpotrs( int matrix_layout, char uplo, int n,
                int nrhs, final long a, int lda,
                long b, int ldb );
    int cpotrs( int matrix_layout, char uplo, int n,
                int nrhs, final IComplexNumber a,
                int lda, IComplexNumber b,
                int ldb );
    int zpotrs( int matrix_layout, char uplo, int n,
                int nrhs, final IComplexNumber a,
                int lda, IComplexNumber b,
                int ldb );

    int sppcon( int matrix_layout, char uplo, int n,
                final long ap, float anorm, long rcond );
    int dppcon( int matrix_layout, char uplo, int n,
                final long ap, double anorm, long rcond );
    int cppcon( int matrix_layout, char uplo, int n,
                final IComplexNumber ap, float anorm,
                long rcond );
    int zppcon( int matrix_layout, char uplo, int n,
                final IComplexNumber ap, double anorm,
                long rcond );

    int sppequ( int matrix_layout, char uplo, int n,
                final long ap, long s, long scond,
                long amax );
    int dppequ( int matrix_layout, char uplo, int n,
                final long ap, long s, long scond,
                long amax );
    int cppequ( int matrix_layout, char uplo, int n,
                final IComplexNumber ap, long s,
                long scond, long amax );
    int zppequ( int matrix_layout, char uplo, int n,
                final IComplexNumber ap, long s,
                long scond, long amax );

    int spprfs( int matrix_layout, char uplo, int n,
                int nrhs, final long ap, final long afp,
                final long b, int ldb, long x,
                int ldx, long ferr, long berr );
    int dpprfs( int matrix_layout, char uplo, int n,
                int nrhs, final long ap, final long afp,
                final long b, int ldb, long x,
                int ldx, long ferr, long berr );
    int cpprfs( int matrix_layout, char uplo, int n,
                int nrhs, final IComplexNumber ap,
                final IComplexNumber afp,
                final IComplexNumber b, int ldb,
                IComplexNumber x, int ldx, long ferr,
                long berr );
    int zpprfs( int matrix_layout, char uplo, int n,
                int nrhs, final IComplexNumber ap,
                final IComplexNumber afp,
                final IComplexNumber b, int ldb,
                IComplexNumber x, int ldx,
                long ferr, long berr );

    int sppsv( int matrix_layout, char uplo, int n,
               int nrhs, long ap, long b,
               int ldb );
    int dppsv( int matrix_layout, char uplo, int n,
               int nrhs, long ap, long b,
               int ldb );
    int cppsv( int matrix_layout, char uplo, int n,
               int nrhs, IComplexNumber ap,
               IComplexNumber b, int ldb );
    int zppsv( int matrix_layout, char uplo, int n,
               int nrhs, IComplexNumber ap,
               IComplexNumber b, int ldb );

    int sppsvx( int matrix_layout, char fact, char uplo, int n,
                int nrhs, long ap, long afp, long equed,
                long s, long b, int ldb, long x,
                int ldx, long rcond, long ferr,
                long berr );
    int dppsvx( int matrix_layout, char fact, char uplo, int n,
                int nrhs, long ap, long afp,
                long equed, long s, long b, int ldb,
                long x, int ldx, long rcond,
                long ferr, long berr );
    int cppsvx( int matrix_layout, char fact, char uplo, int n,
                int nrhs, IComplexNumber ap,
                IComplexNumber afp, long equed, long s,
                IComplexNumber b, int ldb,
                IComplexNumber x, int ldx,
                long rcond, long ferr, long berr );
    int zppsvx( int matrix_layout, char fact, char uplo, int n,
                int nrhs, IComplexNumber ap,
                IComplexNumber afp, long equed, long s,
                IComplexNumber b, int ldb,
                IComplexNumber x, int ldx,
                long rcond, long ferr, long berr );

    int spptrf( int matrix_layout, char uplo, int n,
                long ap );
    int dpptrf( int matrix_layout, char uplo, int n,
                long ap );
    int cpptrf( int matrix_layout, char uplo, int n,
                IComplexNumber ap );
    int zpptrf( int matrix_layout, char uplo, int n,
                IComplexNumber ap );

    int spptri( int matrix_layout, char uplo, int n,
                long ap );
    int dpptri( int matrix_layout, char uplo, int n,
                long ap );
    int cpptri( int matrix_layout, char uplo, int n,
                IComplexNumber ap );
    int zpptri( int matrix_layout, char uplo, int n,
                IComplexNumber ap );

    int spptrs( int matrix_layout, char uplo, int n,
                int nrhs, final long ap, long b,
                int ldb );
    int dpptrs( int matrix_layout, char uplo, int n,
                int nrhs, final long ap, long b,
                int ldb );
    int cpptrs( int matrix_layout, char uplo, int n,
                int nrhs, final IComplexNumber ap,
                IComplexNumber b, int ldb );
    int zpptrs( int matrix_layout, char uplo, int n,
                int nrhs, final IComplexNumber ap,
                IComplexNumber b, int ldb );

    int spstrf( int matrix_layout, char uplo, int n, long a,
                int lda, long piv, long rank,
                float tol );
    int dpstrf( int matrix_layout, char uplo, int n, long a,
                int lda, long piv, long rank,
                double tol );
    int cpstrf( int matrix_layout, char uplo, int n,
                IComplexNumber a, int lda,
                long piv, long rank, float tol );
    int zpstrf( int matrix_layout, char uplo, int n,
                IComplexNumber a, int lda,
                long piv, long rank, double tol );

    int sptcon( int n, final long d, final long e,
                float anorm, long rcond );
    int dptcon( int n, final long d, final long e,
                double anorm, long rcond );
    int cptcon( int n, final long d,
                final IComplexNumber e, float anorm,
                long rcond );
    int zptcon( int n, final long d,
                final IComplexNumber e, double anorm,
                long rcond );

    int spteqr( int matrix_layout, char compz, int n, long d,
                long e, long z, int ldz );
    int dpteqr( int matrix_layout, char compz, int n,
                long d, long e, long z, int ldz );
    int cpteqr( int matrix_layout, char compz, int n, long d,
                long e, IComplexNumber z, int ldz );
    int zpteqr( int matrix_layout, char compz, int n,
                long d, long e, IComplexNumber z,
                int ldz );

    int sptrfs( int matrix_layout, int n, int nrhs,
                final long d, final long e, final long df,
                final long ef, final long b, int ldb,
                long x, int ldx, long ferr, long berr );
    int dptrfs( int matrix_layout, int n, int nrhs,
                final long d, final long e, final long df,
                final long ef, final long b, int ldb,
                long x, int ldx, long ferr,
                long berr );
    int cptrfs( int matrix_layout, char uplo, int n,
                int nrhs, final long d,
                final IComplexNumber e, final long df,
                final IComplexNumber ef,
                final IComplexNumber b, int ldb,
                IComplexNumber x, int ldx, long ferr,
                long berr );
    int zptrfs( int matrix_layout, char uplo, int n,
                int nrhs, final long d,
                final IComplexNumber e, final long df,
                final IComplexNumber ef,
                final IComplexNumber b, int ldb,
                IComplexNumber x, int ldx,
                long ferr, long berr );

    int sptsv( int matrix_layout, int n, int nrhs,
               long d, long e, long b, int ldb );
    int dptsv( int matrix_layout, int n, int nrhs,
               long d, long e, long b, int ldb );
    int cptsv( int matrix_layout, int n, int nrhs,
               long d, IComplexNumber e,
               IComplexNumber b, int ldb );
    int zptsv( int matrix_layout, int n, int nrhs,
               long d, IComplexNumber e,
               IComplexNumber b, int ldb );

    int sptsvx( int matrix_layout, char fact, int n,
                int nrhs, final long d, final long e,
                long df, long ef, final long b, int ldb,
                long x, int ldx, long rcond, long ferr,
                long berr );
    int dptsvx( int matrix_layout, char fact, int n,
                int nrhs, final long d, final long e,
                long df, long ef, final long b,
                int ldb, long x, int ldx,
                long rcond, long ferr, long berr );
    int cptsvx( int matrix_layout, char fact, int n,
                int nrhs, final long d,
                final IComplexNumber e, long df,
                IComplexNumber ef,
                final IComplexNumber b, int ldb,
                IComplexNumber x, int ldx,
                long rcond, long ferr, long berr );
    int zptsvx( int matrix_layout, char fact, int n,
                int nrhs, final long d,
                final IComplexNumber e, long df,
                IComplexNumber ef,
                final IComplexNumber b, int ldb,
                IComplexNumber x, int ldx,
                long rcond, long ferr, long berr );

    int spttrf( int n, long d, long e );
    int dpttrf( int n, long d, long e );
    int cpttrf( int n, long d, IComplexNumber e );
    int zpttrf( int n, long d, IComplexNumber e );

    int spttrs( int matrix_layout, int n, int nrhs,
                final long d, final long e, long b,
                int ldb );
    int dpttrs( int matrix_layout, int n, int nrhs,
                final long d, final long e, long b,
                int ldb );
    int cpttrs( int matrix_layout, char uplo, int n,
                int nrhs, final long d,
                final IComplexNumber e,
                IComplexNumber b, int ldb );
    int zpttrs( int matrix_layout, char uplo, int n,
                int nrhs, final long d,
                final IComplexNumber e,
                IComplexNumber b, int ldb );

    int ssbev( int matrix_layout, char jobz, char uplo, int n,
               int kd, long ab, int ldab, long w,
               long z, int ldz );
    int dsbev( int matrix_layout, char jobz, char uplo, int n,
               int kd, long ab, int ldab, long w,
               long z, int ldz );

    int ssbevd( int matrix_layout, char jobz, char uplo, int n,
                int kd, long ab, int ldab, long w,
                long z, int ldz );
    int dsbevd( int matrix_layout, char jobz, char uplo, int n,
                int kd, long ab, int ldab,
                long w, long z, int ldz );

    int ssbevx( int matrix_layout, char jobz, char range, char uplo,
                int n, int kd, long ab,
                int ldab, long q, int ldq, float vl,
                float vu, int il, int iu, float abstol,
                long m, long w, long z, int ldz,
                long ifail );
    int dsbevx( int matrix_layout, char jobz, char range, char uplo,
                int n, int kd, long ab,
                int ldab, long q, int ldq,
                double vl, double vu, int il, int iu,
                double abstol, long m, long w, long z,
                int ldz, long ifail );

    int ssbgst( int matrix_layout, char vect, char uplo, int n,
                int ka, int kb, long ab,
                int ldab, final long bb, int ldbb,
                long x, int ldx );
    int dsbgst( int matrix_layout, char vect, char uplo, int n,
                int ka, int kb, long ab,
                int ldab, final long bb, int ldbb,
                long x, int ldx );

    int ssbgv( int matrix_layout, char jobz, char uplo, int n,
               int ka, int kb, long ab,
               int ldab, long bb, int ldbb, long w,
               long z, int ldz );
    int dsbgv( int matrix_layout, char jobz, char uplo, int n,
               int ka, int kb, long ab,
               int ldab, long bb, int ldbb,
               long w, long z, int ldz );

    int ssbgvd( int matrix_layout, char jobz, char uplo, int n,
                int ka, int kb, long ab,
                int ldab, long bb, int ldbb,
                long w, long z, int ldz );
    int dsbgvd( int matrix_layout, char jobz, char uplo, int n,
                int ka, int kb, long ab,
                int ldab, long bb, int ldbb,
                long w, long z, int ldz );

    int ssbgvx( int matrix_layout, char jobz, char range, char uplo,
                int n, int ka, int kb,
                long ab, int ldab, long bb,
                int ldbb, long q, int ldq, float vl,
                float vu, int il, int iu, float abstol,
                long m, long w, long z, int ldz,
                long ifail );
    int dsbgvx( int matrix_layout, char jobz, char range, char uplo,
                int n, int ka, int kb,
                long ab, int ldab, long bb,
                int ldbb, long q, int ldq,
                double vl, double vu, int il, int iu,
                double abstol, long m, long w, long z,
                int ldz, long ifail );

    int ssbtrd( int matrix_layout, char vect, char uplo, int n,
                int kd, long ab, int ldab, long d,
                long e, long q, int ldq );
    int dsbtrd( int matrix_layout, char vect, char uplo, int n,
                int kd, long ab, int ldab,
                long d, long e, long q, int ldq );

    int ssfrk( int matrix_layout, char transr, char uplo, char trans,
               int n, int k, float alpha,
               final long a, int lda, float beta,
               long c );
    int dsfrk( int matrix_layout, char transr, char uplo, char trans,
               int n, int k, double alpha,
               final long a, int lda, double beta,
               long c );

    int sspcon( int matrix_layout, char uplo, int n,
                final long ap, final long ipiv, float anorm,
                long rcond );
    int dspcon( int matrix_layout, char uplo, int n,
                final long ap, final long ipiv,
                double anorm, long rcond );
    int cspcon( int matrix_layout, char uplo, int n,
                final IComplexNumber ap,
                final long ipiv, float anorm, long rcond );
    int zspcon( int matrix_layout, char uplo, int n,
                final IComplexNumber ap,
                final long ipiv, double anorm,
                long rcond );

    int sspev( int matrix_layout, char jobz, char uplo, int n,
               long ap, long w, long z, int ldz );
    int dspev( int matrix_layout, char jobz, char uplo, int n,
               long ap, long w, long z, int ldz );

    int sspevd( int matrix_layout, char jobz, char uplo, int n,
                long ap, long w, long z, int ldz );
    int dspevd( int matrix_layout, char jobz, char uplo, int n,
                long ap, long w, long z, int ldz );

    int sspevx( int matrix_layout, char jobz, char range, char uplo,
                int n, long ap, float vl, float vu,
                int il, int iu, float abstol,
                long m, long w, long z, int ldz,
                long ifail );
    int dspevx( int matrix_layout, char jobz, char range, char uplo,
                int n, long ap, double vl, double vu,
                int il, int iu, double abstol,
                long m, long w, long z, int ldz,
                long ifail );

    int sspgst( int matrix_layout, int itype, char uplo,
                int n, long ap, final long bp );
    int dspgst( int matrix_layout, int itype, char uplo,
                int n, long ap, final long bp );

    int sspgv( int matrix_layout, int itype, char jobz,
               char uplo, int n, long ap, long bp,
               long w, long z, int ldz );
    int dspgv( int matrix_layout, int itype, char jobz,
               char uplo, int n, long ap, long bp,
               long w, long z, int ldz );

    int sspgvd( int matrix_layout, int itype, char jobz,
                char uplo, int n, long ap, long bp,
                long w, long z, int ldz );
    int dspgvd( int matrix_layout, int itype, char jobz,
                char uplo, int n, long ap, long bp,
                long w, long z, int ldz );

    int sspgvx( int matrix_layout, int itype, char jobz,
                char range, char uplo, int n, long ap,
                long bp, float vl, float vu, int il,
                int iu, float abstol, long m, long w,
                long z, int ldz, long ifail );
    int dspgvx( int matrix_layout, int itype, char jobz,
                char range, char uplo, int n, long ap,
                long bp, double vl, double vu, int il,
                int iu, double abstol, long m,
                long w, long z, int ldz,
                long ifail );

    int ssprfs( int matrix_layout, char uplo, int n,
                int nrhs, final long ap, final long afp,
                final long ipiv, final long b,
                int ldb, long x, int ldx,
                long ferr, long berr );
    int dsprfs( int matrix_layout, char uplo, int n,
                int nrhs, final long ap, final long afp,
                final long ipiv, final long b,
                int ldb, long x, int ldx,
                long ferr, long berr );
    int csprfs( int matrix_layout, char uplo, int n,
                int nrhs, final IComplexNumber ap,
                final IComplexNumber afp,
                final long ipiv,
                final IComplexNumber b, int ldb,
                IComplexNumber x, int ldx, long ferr,
                long berr );
    int zsprfs( int matrix_layout, char uplo, int n,
                int nrhs, final IComplexNumber ap,
                final IComplexNumber afp,
                final long ipiv,
                final IComplexNumber b, int ldb,
                IComplexNumber x, int ldx,
                long ferr, long berr );

    int sspsv( int matrix_layout, char uplo, int n,
               int nrhs, long ap, long ipiv,
               long b, int ldb );
    int dspsv( int matrix_layout, char uplo, int n,
               int nrhs, long ap, long ipiv,
               long b, int ldb );
    int cspsv( int matrix_layout, char uplo, int n,
               int nrhs, IComplexNumber ap,
               long ipiv, IComplexNumber b,
               int ldb );
    int zspsv( int matrix_layout, char uplo, int n,
               int nrhs, IComplexNumber ap,
               long ipiv, IComplexNumber b,
               int ldb );

    int sspsvx( int matrix_layout, char fact, char uplo, int n,
                int nrhs, final long ap, long afp,
                long ipiv, final long b, int ldb,
                long x, int ldx, long rcond, long ferr,
                long berr );
    int dspsvx( int matrix_layout, char fact, char uplo, int n,
                int nrhs, final long ap, long afp,
                long ipiv, final long b, int ldb,
                long x, int ldx, long rcond,
                long ferr, long berr );
    int cspsvx( int matrix_layout, char fact, char uplo, int n,
                int nrhs, final IComplexNumber ap,
                IComplexNumber afp, long ipiv,
                final IComplexNumber b, int ldb,
                IComplexNumber x, int ldx,
                long rcond, long ferr, long berr );
    int zspsvx( int matrix_layout, char fact, char uplo, int n,
                int nrhs, final IComplexNumber ap,
                IComplexNumber afp, long ipiv,
                final IComplexNumber b, int ldb,
                IComplexNumber x, int ldx,
                long rcond, long ferr, long berr );

    int ssptrd( int matrix_layout, char uplo, int n, long ap,
                long d, long e, long tau );
    int dsptrd( int matrix_layout, char uplo, int n,
                long ap, long d, long e, long tau );

    int ssptrf( int matrix_layout, char uplo, int n, long ap,
                long ipiv );
    int dsptrf( int matrix_layout, char uplo, int n,
                long ap, long ipiv );
    int csptrf( int matrix_layout, char uplo, int n,
                IComplexNumber ap, long ipiv );
    int zsptrf( int matrix_layout, char uplo, int n,
                IComplexNumber ap, long ipiv );

    int ssptri( int matrix_layout, char uplo, int n, long ap,
                final long ipiv );
    int dsptri( int matrix_layout, char uplo, int n,
                long ap, final long ipiv );
    int csptri( int matrix_layout, char uplo, int n,
                IComplexNumber ap, final long ipiv );
    int zsptri( int matrix_layout, char uplo, int n,
                IComplexNumber ap, final long ipiv );

    int ssptrs( int matrix_layout, char uplo, int n,
                int nrhs, final long ap,
                final long ipiv, long b, int ldb );
    int dsptrs( int matrix_layout, char uplo, int n,
                int nrhs, final long ap,
                final long ipiv, long b, int ldb );
    int csptrs( int matrix_layout, char uplo, int n,
                int nrhs, final IComplexNumber ap,
                final long ipiv, IComplexNumber b,
                int ldb );
    int zsptrs( int matrix_layout, char uplo, int n,
                int nrhs, final IComplexNumber ap,
                final long ipiv, IComplexNumber b,
                int ldb );

    int sstebz( char range, char order, int n, float vl,
                float vu, int il, int iu, float abstol,
                final long d, final long e, long m,
                long nsplit, long w, long iblock,
                long isplit );
    int dstebz( char range, char order, int n, double vl,
                double vu, int il, int iu,
                double abstol, final long d, final long e,
                long m, long nsplit, long w,
                long iblock, long isplit );

    int sstedc( int matrix_layout, char compz, int n, long d,
                long e, long z, int ldz );
    int dstedc( int matrix_layout, char compz, int n,
                long d, long e, long z, int ldz );
    int cstedc( int matrix_layout, char compz, int n, long d,
                long e, IComplexNumber z, int ldz );
    int zstedc( int matrix_layout, char compz, int n,
                long d, long e, IComplexNumber z,
                int ldz );

    int sstegr( int matrix_layout, char jobz, char range,
                int n, long d, long e, float vl, float vu,
                int il, int iu, float abstol,
                long m, long w, long z, int ldz,
                long isuppz );
    int dstegr( int matrix_layout, char jobz, char range,
                int n, long d, long e, double vl,
                double vu, int il, int iu,
                double abstol, long m, long w, long z,
                int ldz, long isuppz );
    int cstegr( int matrix_layout, char jobz, char range,
                int n, long d, long e, float vl, float vu,
                int il, int iu, float abstol,
                long m, long w, IComplexNumber z,
                int ldz, long isuppz );
    int zstegr( int matrix_layout, char jobz, char range,
                int n, long d, long e, double vl,
                double vu, int il, int iu,
                double abstol, long m, long w,
                IComplexNumber z, int ldz,
                long isuppz );

    int sstein( int matrix_layout, int n, final long d,
                final long e, int m, final long w,
                final long iblock, final long isplit,
                long z, int ldz, long ifailv );
    int dstein( int matrix_layout, int n, final long d,
                final long e, int m, final long w,
                final long iblock, final long isplit,
                long z, int ldz, long ifailv );
    int cstein( int matrix_layout, int n, final long d,
                final long e, int m, final long w,
                final long iblock, final long isplit,
                IComplexNumber z, int ldz,
                long ifailv );
    int zstein( int matrix_layout, int n, final long d,
                final long e, int m, final long w,
                final long iblock, final long isplit,
                IComplexNumber z, int ldz,
                long ifailv );

    int sstemr( int matrix_layout, char jobz, char range,
                int n, long d, long e, float vl, float vu,
                int il, int iu, long m,
                long w, long z, int ldz, int nzc,
                long isuppz,long  tryrac );
    int dstemr( int matrix_layout, char jobz, char range,
                int n, long d, long e, double vl,
                double vu, int il, int iu,
                long m, long w, long z, int ldz,
                int nzc, long isuppz,
                long  tryrac );
    int cstemr( int matrix_layout, char jobz, char range,
                int n, long d, long e, float vl, float vu,
                int il, int iu, long m,
                long w, IComplexNumber z, int ldz,
                int nzc, long isuppz,
                long  tryrac );
    int zstemr( int matrix_layout, char jobz, char range,
                int n, long d, long e, double vl,
                double vu, int il, int iu,
                long m, long w, IComplexNumber z,
                int ldz, int nzc, long isuppz,
                long  tryrac );

    int ssteqr( int matrix_layout, char compz, int n, long d,
                long e, long z, int ldz );
    int dsteqr( int matrix_layout, char compz, int n,
                long d, long e, long z, int ldz );
    int csteqr( int matrix_layout, char compz, int n, long d,
                long e, IComplexNumber z, int ldz );
    int zsteqr( int matrix_layout, char compz, int n,
                long d, long e, IComplexNumber z,
                int ldz );

    int ssterf( int n, long d, long e );
    int dsterf( int n, long d, long e );

    int sstev( int matrix_layout, char jobz, int n, long d,
               long e, long z, int ldz );
    int dstev( int matrix_layout, char jobz, int n, long d,
               long e, long z, int ldz );

    int sstevd( int matrix_layout, char jobz, int n, long d,
                long e, long z, int ldz );
    int dstevd( int matrix_layout, char jobz, int n, long d,
                long e, long z, int ldz );

    int sstevr( int matrix_layout, char jobz, char range,
                int n, long d, long e, float vl, float vu,
                int il, int iu, float abstol,
                long m, long w, long z, int ldz,
                long isuppz );
    int dstevr( int matrix_layout, char jobz, char range,
                int n, long d, long e, double vl,
                double vu, int il, int iu,
                double abstol, long m, long w, long z,
                int ldz, long isuppz );

    int sstevx( int matrix_layout, char jobz, char range,
                int n, long d, long e, float vl, float vu,
                int il, int iu, float abstol,
                long m, long w, long z, int ldz,
                long ifail );
    int dstevx( int matrix_layout, char jobz, char range,
                int n, long d, long e, double vl,
                double vu, int il, int iu,
                double abstol, long m, long w, long z,
                int ldz, long ifail );

    int ssycon( int matrix_layout, char uplo, int n,
                final long a, int lda,
                final long ipiv, float anorm, long rcond );
    int dsycon( int matrix_layout, char uplo, int n,
                final long a, int lda,
                final long ipiv, double anorm,
                long rcond );
    int csycon( int matrix_layout, char uplo, int n,
                final IComplexNumber a, int lda,
                final long ipiv, float anorm, long rcond );
    int zsycon( int matrix_layout, char uplo, int n,
                final IComplexNumber a, int lda,
                final long ipiv, double anorm,
                long rcond );

    int ssyequb( int matrix_layout, char uplo, int n,
                 final long a, int lda, long s,
                 long scond, long amax );
    int dsyequb( int matrix_layout, char uplo, int n,
                 final long a, int lda, long s,
                 long scond, long amax );
    int csyequb( int matrix_layout, char uplo, int n,
                 final IComplexNumber a, int lda,
                 long s, long scond, long amax );
    int zsyequb( int matrix_layout, char uplo, int n,
                 final IComplexNumber a, int lda,
                 long s, long scond, long amax );

    int ssyev( int matrix_layout, char jobz, char uplo, int n,
               long a, int lda, long w );
    int dsyev( int matrix_layout, char jobz, char uplo, int n,
               long a, int lda, long w );

    int ssyevd( int matrix_layout, char jobz, char uplo, int n,
                long a, int lda, long w );
    int dsyevd( int matrix_layout, char jobz, char uplo, int n,
                long a, int lda, long w );

    int ssyevr( int matrix_layout, char jobz, char range, char uplo,
                int n, long a, int lda, float vl,
                float vu, int il, int iu, float abstol,
                long m, long w, long z, int ldz,
                long isuppz );
    int dsyevr( int matrix_layout, char jobz, char range, char uplo,
                int n, long a, int lda, double vl,
                double vu, int il, int iu,
                double abstol, long m, long w, long z,
                int ldz, long isuppz );

    int ssyevx( int matrix_layout, char jobz, char range, char uplo,
                int n, long a, int lda, float vl,
                float vu, int il, int iu, float abstol,
                long m, long w, long z, int ldz,
                long ifail );
    int dsyevx( int matrix_layout, char jobz, char range, char uplo,
                int n, long a, int lda, double vl,
                double vu, int il, int iu,
                double abstol, long m, long w, long z,
                int ldz, long ifail );

    int ssygst( int matrix_layout, int itype, char uplo,
                int n, long a, int lda,
                final long b, int ldb );
    int dsygst( int matrix_layout, int itype, char uplo,
                int n, long a, int lda,
                final long b, int ldb );

    int ssygv( int matrix_layout, int itype, char jobz,
               char uplo, int n, long a, int lda,
               long b, int ldb, long w );
    int dsygv( int matrix_layout, int itype, char jobz,
               char uplo, int n, long a, int lda,
               long b, int ldb, long w );

    int ssygvd( int matrix_layout, int itype, char jobz,
                char uplo, int n, long a, int lda,
                long b, int ldb, long w );
    int dsygvd( int matrix_layout, int itype, char jobz,
                char uplo, int n, long a, int lda,
                long b, int ldb, long w );

    int ssygvx( int matrix_layout, int itype, char jobz,
                char range, char uplo, int n, long a,
                int lda, long b, int ldb, float vl,
                float vu, int il, int iu, float abstol,
                long m, long w, long z, int ldz,
                long ifail );
    int dsygvx( int matrix_layout, int itype, char jobz,
                char range, char uplo, int n, long a,
                int lda, long b, int ldb, double vl,
                double vu, int il, int iu,
                double abstol, long m, long w, long z,
                int ldz, long ifail );

    int ssyrfs( int matrix_layout, char uplo, int n,
                int nrhs, final long a, int lda,
                final long af, int ldaf,
                final long ipiv, final long b,
                int ldb, long x, int ldx,
                long ferr, long berr );
    int dsyrfs( int matrix_layout, char uplo, int n,
                int nrhs, final long a, int lda,
                final long af, int ldaf,
                final long ipiv, final long b,
                int ldb, long x, int ldx,
                long ferr, long berr );
    int csyrfs( int matrix_layout, char uplo, int n,
                int nrhs, final IComplexNumber a,
                int lda, final IComplexNumber af,
                int ldaf, final long ipiv,
                final IComplexNumber b, int ldb,
                IComplexNumber x, int ldx, long ferr,
                long berr );
    int zsyrfs( int matrix_layout, char uplo, int n,
                int nrhs, final IComplexNumber a,
                int lda, final IComplexNumber af,
                int ldaf, final long ipiv,
                final IComplexNumber b, int ldb,
                IComplexNumber x, int ldx,
                long ferr, long berr );

    int ssyrfsx( int matrix_layout, char uplo, char equed,
                 int n, int nrhs, final long a,
                 int lda, final long af, int ldaf,
                 final long ipiv, final long s,
                 final long b, int ldb, long x,
                 int ldx, long rcond, long berr,
                 int n_err_bnds, long err_bnds_norm,
                 long err_bnds_comp, int nparams,
                 long params );
    int dsyrfsx( int matrix_layout, char uplo, char equed,
                 int n, int nrhs, final long a,
                 int lda, final long af, int ldaf,
                 final long ipiv, final long s,
                 final long b, int ldb, long x,
                 int ldx, long rcond, long berr,
                 int n_err_bnds, long err_bnds_norm,
                 long err_bnds_comp, int nparams,
                 long params );
    int csyrfsx( int matrix_layout, char uplo, char equed,
                 int n, int nrhs,
                 final IComplexNumber a, int lda,
                 final IComplexNumber af, int ldaf,
                 final long ipiv, final long s,
                 final IComplexNumber b, int ldb,
                 IComplexNumber x, int ldx,
                 long rcond, long berr, int n_err_bnds,
                 long err_bnds_norm, long err_bnds_comp,
                 int nparams, long params );
    int zsyrfsx( int matrix_layout, char uplo, char equed,
                 int n, int nrhs,
                 final IComplexNumber a, int lda,
                 final IComplexNumber af, int ldaf,
                 final long ipiv, final long s,
                 final IComplexNumber b, int ldb,
                 IComplexNumber x, int ldx,
                 long rcond, long berr, int n_err_bnds,
                 long err_bnds_norm, long err_bnds_comp,
                 int nparams, long params );

    int ssysv( int matrix_layout, char uplo, int n,
               int nrhs, long a, int lda,
               long ipiv, long b, int ldb );
    int dsysv( int matrix_layout, char uplo, int n,
               int nrhs, long a, int lda,
               long ipiv, long b, int ldb );
    int csysv( int matrix_layout, char uplo, int n,
               int nrhs, IComplexNumber a,
               int lda, long ipiv,
               IComplexNumber b, int ldb );
    int zsysv( int matrix_layout, char uplo, int n,
               int nrhs, IComplexNumber a,
               int lda, long ipiv,
               IComplexNumber b, int ldb );

    int ssysvx( int matrix_layout, char fact, char uplo, int n,
                int nrhs, final long a, int lda,
                long af, int ldaf, long ipiv,
                final long b, int ldb, long x,
                int ldx, long rcond, long ferr,
                long berr );
    int dsysvx( int matrix_layout, char fact, char uplo, int n,
                int nrhs, final long a, int lda,
                long af, int ldaf, long ipiv,
                final long b, int ldb, long x,
                int ldx, long rcond, long ferr,
                long berr );
    int csysvx( int matrix_layout, char fact, char uplo, int n,
                int nrhs, final IComplexNumber a,
                int lda, IComplexNumber af,
                int ldaf, long ipiv,
                final IComplexNumber b, int ldb,
                IComplexNumber x, int ldx,
                long rcond, long ferr, long berr );
    int zsysvx( int matrix_layout, char fact, char uplo, int n,
                int nrhs, final IComplexNumber a,
                int lda, IComplexNumber af,
                int ldaf, long ipiv,
                final IComplexNumber b, int ldb,
                IComplexNumber x, int ldx,
                long rcond, long ferr, long berr );

    int ssysvxx( int matrix_layout, char fact, char uplo,
                 int n, int nrhs, long a,
                 int lda, long af, int ldaf,
                 long ipiv, long equed, long s, long b,
                 int ldb, long x, int ldx,
                 long rcond, long rpvgrw, long berr,
                 int n_err_bnds, long err_bnds_norm,
                 long err_bnds_comp, int nparams,
                 long params );
    int dsysvxx( int matrix_layout, char fact, char uplo,
                 int n, int nrhs, long a,
                 int lda, long af, int ldaf,
                 long ipiv, long equed, long s, long b,
                 int ldb, long x, int ldx,
                 long rcond, long rpvgrw, long berr,
                 int n_err_bnds, long err_bnds_norm,
                 long err_bnds_comp, int nparams,
                 long params );
    int csysvxx( int matrix_layout, char fact, char uplo,
                 int n, int nrhs,
                 IComplexNumber a, int lda,
                 IComplexNumber af, int ldaf,
                 long ipiv, long equed, long s,
                 IComplexNumber b, int ldb,
                 IComplexNumber x, int ldx,
                 long rcond, long rpvgrw, long berr,
                 int n_err_bnds, long err_bnds_norm,
                 long err_bnds_comp, int nparams,
                 long params );
    int zsysvxx( int matrix_layout, char fact, char uplo,
                 int n, int nrhs,
                 IComplexNumber a, int lda,
                 IComplexNumber af, int ldaf,
                 long ipiv, long equed, long s,
                 IComplexNumber b, int ldb,
                 IComplexNumber x, int ldx,
                 long rcond, long rpvgrw, long berr,
                 int n_err_bnds, long err_bnds_norm,
                 long err_bnds_comp, int nparams,
                 long params );

    int ssytrd( int matrix_layout, char uplo, int n, long a,
                int lda, long d, long e, long tau );
    int dsytrd( int matrix_layout, char uplo, int n, long a,
                int lda, long d, long e, long tau );

    int ssytrf( int matrix_layout, char uplo, int n, long a,
                int lda, long ipiv );
    int dsytrf( int matrix_layout, char uplo, int n, long a,
                int lda, long ipiv );
    int csytrf( int matrix_layout, char uplo, int n,
                IComplexNumber a, int lda,
                long ipiv );
    int zsytrf( int matrix_layout, char uplo, int n,
                IComplexNumber a, int lda,
                long ipiv );

    int ssytri( int matrix_layout, char uplo, int n, long a,
                int lda, final long ipiv );
    int dsytri( int matrix_layout, char uplo, int n, long a,
                int lda, final long ipiv );
    int csytri( int matrix_layout, char uplo, int n,
                IComplexNumber a, int lda,
                final long ipiv );
    int zsytri( int matrix_layout, char uplo, int n,
                IComplexNumber a, int lda,
                final long ipiv );

    int ssytrs( int matrix_layout, char uplo, int n,
                int nrhs, final long a, int lda,
                final long ipiv, long b, int ldb );
    int dsytrs( int matrix_layout, char uplo, int n,
                int nrhs, final long a, int lda,
                final long ipiv, long b, int ldb );
    int csytrs( int matrix_layout, char uplo, int n,
                int nrhs, final IComplexNumber a,
                int lda, final long ipiv,
                IComplexNumber b, int ldb );
    int zsytrs( int matrix_layout, char uplo, int n,
                int nrhs, final IComplexNumber a,
                int lda, final long ipiv,
                IComplexNumber b, int ldb );

    int stbcon( int matrix_layout, char norm, char uplo, char diag,
                int n, int kd, final long ab,
                int ldab, long rcond );
    int dtbcon( int matrix_layout, char norm, char uplo, char diag,
                int n, int kd, final long ab,
                int ldab, long rcond );
    int ctbcon( int matrix_layout, char norm, char uplo, char diag,
                int n, int kd,
                final IComplexNumber ab, int ldab,
                long rcond );
    int ztbcon( int matrix_layout, char norm, char uplo, char diag,
                int n, int kd,
                final IComplexNumber ab, int ldab,
                long rcond );

    int stbrfs( int matrix_layout, char uplo, char trans, char diag,
                int n, int kd, int nrhs,
                final long ab, int ldab, final long b,
                int ldb, final long x, int ldx,
                long ferr, long berr );
    int dtbrfs( int matrix_layout, char uplo, char trans, char diag,
                int n, int kd, int nrhs,
                final long ab, int ldab, final long b,
                int ldb, final long x, int ldx,
                long ferr, long berr );
    int ctbrfs( int matrix_layout, char uplo, char trans, char diag,
                int n, int kd, int nrhs,
                final IComplexNumber ab, int ldab,
                final IComplexNumber b, int ldb,
                final IComplexNumber x, int ldx,
                long ferr, long berr );
    int ztbrfs( int matrix_layout, char uplo, char trans, char diag,
                int n, int kd, int nrhs,
                final IComplexNumber ab, int ldab,
                final IComplexNumber b, int ldb,
                final IComplexNumber x, int ldx,
                long ferr, long berr );

    int stbtrs( int matrix_layout, char uplo, char trans, char diag,
                int n, int kd, int nrhs,
                final long ab, int ldab, long b,
                int ldb );
    int dtbtrs( int matrix_layout, char uplo, char trans, char diag,
                int n, int kd, int nrhs,
                final long ab, int ldab, long b,
                int ldb );
    int ctbtrs( int matrix_layout, char uplo, char trans, char diag,
                int n, int kd, int nrhs,
                final IComplexNumber ab, int ldab,
                IComplexNumber b, int ldb );
    int ztbtrs( int matrix_layout, char uplo, char trans, char diag,
                int n, int kd, int nrhs,
                final IComplexNumber ab, int ldab,
                IComplexNumber b, int ldb );

    int stfsm( int matrix_layout, char transr, char side, char uplo,
               char trans, char diag, int m, int n,
               float alpha, final long a, long b,
               int ldb );
    int dtfsm( int matrix_layout, char transr, char side, char uplo,
               char trans, char diag, int m, int n,
               double alpha, final long a, long b,
               int ldb );
    int ctfsm( int matrix_layout, char transr, char side, char uplo,
               char trans, char diag, int m, int n,
               IComplexNumber alpha,
               final IComplexNumber a,
               IComplexNumber b, int ldb );
    int ztfsm( int matrix_layout, char transr, char side, char uplo,
               char trans, char diag, int m, int n,
               IComplexNumber alpha,
               final IComplexNumber a,
               IComplexNumber b, int ldb );

    int stftri( int matrix_layout, char transr, char uplo, char diag,
                int n, long a );
    int dtftri( int matrix_layout, char transr, char uplo, char diag,
                int n, long a );
    int ctftri( int matrix_layout, char transr, char uplo, char diag,
                int n, IComplexNumber a );
    int ztftri( int matrix_layout, char transr, char uplo, char diag,
                int n, IComplexNumber a );

    int stfttp( int matrix_layout, char transr, char uplo,
                int n, final long arf, long ap );
    int dtfttp( int matrix_layout, char transr, char uplo,
                int n, final long arf, long ap );
    int ctfttp( int matrix_layout, char transr, char uplo,
                int n, final IComplexNumber arf,
                IComplexNumber ap );
    int ztfttp( int matrix_layout, char transr, char uplo,
                int n, final IComplexNumber arf,
                IComplexNumber ap );

    int stfttr( int matrix_layout, char transr, char uplo,
                int n, final long arf, long a,
                int lda );
    int dtfttr( int matrix_layout, char transr, char uplo,
                int n, final long arf, long a,
                int lda );
    int ctfttr( int matrix_layout, char transr, char uplo,
                int n, final IComplexNumber arf,
                IComplexNumber a, int lda );
    int ztfttr( int matrix_layout, char transr, char uplo,
                int n, final IComplexNumber arf,
                IComplexNumber a, int lda );

    int stgevc( int matrix_layout, char side, char howmny,
                long   select, int n,
                final long s, int lds, final long p,
                int ldp, long vl, int ldvl,
                long vr, int ldvr, int mm,
                long m );
    int dtgevc( int matrix_layout, char side, char howmny,
                long   select, int n,
                final long s, int lds, final long p,
                int ldp, long vl, int ldvl,
                long vr, int ldvr, int mm,
                long m );
    int ctgevc( int matrix_layout, char side, char howmny,
                long   select, int n,
                final IComplexNumber s, int lds,
                final IComplexNumber p, int ldp,
                IComplexNumber vl, int ldvl,
                IComplexNumber vr, int ldvr,
                int mm, long m );
    int ztgevc( int matrix_layout, char side, char howmny,
                long   select, int n,
                final IComplexNumber s, int lds,
                final IComplexNumber p, int ldp,
                IComplexNumber vl, int ldvl,
                IComplexNumber vr, int ldvr,
                int mm, long m );

    int stgexc( int matrix_layout,boolean wantq,
                boolean wantz, int n, long a,
                int lda, long b, int ldb, long q,
                int ldq, long z, int ldz,
                long ifst, long ilst );
    int dtgexc( int matrix_layout,boolean wantq,
                boolean wantz, int n, long a,
                int lda, long b, int ldb, long q,
                int ldq, long z, int ldz,
                long ifst, long ilst );
    int ctgexc( int matrix_layout,boolean wantq,
                boolean wantz, int n,
                IComplexNumber a, int lda,
                IComplexNumber b, int ldb,
                IComplexNumber q, int ldq,
                IComplexNumber z, int ldz,
                int ifst, int ilst );
    int ztgexc( int matrix_layout,boolean wantq,
                boolean wantz, int n,
                IComplexNumber a, int lda,
                IComplexNumber b, int ldb,
                IComplexNumber q, int ldq,
                IComplexNumber z, int ldz,
                int ifst, int ilst );

    int stgsen( int matrix_layout, int ijob,
                boolean wantq,boolean wantz,
                long   select, int n, long a,
                int lda, long b, int ldb,
                long alphar, long alphai, long beta, long q,
                int ldq, long z, int ldz,
                long m, long pl, long pr, long dif );
    int dtgsen( int matrix_layout, int ijob,
                boolean wantq,boolean wantz,
                long   select, int n,
                long a, int lda, long b, int ldb,
                long alphar, long alphai, long beta,
                long q, int ldq, long z, int ldz,
                long m, long pl, long pr, long dif );
    int ctgsen( int matrix_layout, int ijob,
                boolean wantq,boolean wantz,
                long   select, int n,
                IComplexNumber a, int lda,
                IComplexNumber b, int ldb,
                IComplexNumber alpha,
                IComplexNumber beta, IComplexNumber q,
                int ldq, IComplexNumber z,
                int ldz, long m, long pl, long pr,
                long dif );
    int ztgsen( int matrix_layout, int ijob,
                boolean wantq,boolean wantz,
                long   select, int n,
                IComplexNumber a, int lda,
                IComplexNumber b, int ldb,
                IComplexNumber alpha,
                IComplexNumber beta,
                IComplexNumber q, int ldq,
                IComplexNumber z, int ldz,
                long m, long pl, long pr, long dif );

    int stgsja( int matrix_layout, char jobu, char jobv, char jobq,
                int m, int p, int n,
                int k, int l, long a, int lda,
                long b, int ldb, float tola, float tolb,
                long alpha, long beta, long u, int ldu,
                long v, int ldv, long q, int ldq,
                long ncycle );
    int dtgsja( int matrix_layout, char jobu, char jobv, char jobq,
                int m, int p, int n,
                int k, int l, long a,
                int lda, long b, int ldb,
                double tola, double tolb, long alpha,
                long beta, long u, int ldu, long v,
                int ldv, long q, int ldq,
                long ncycle );
    int ctgsja( int matrix_layout, char jobu, char jobv, char jobq,
                int m, int p, int n,
                int k, int l, IComplexNumber a,
                int lda, IComplexNumber b,
                int ldb, float tola, float tolb, long alpha,
                long beta, IComplexNumber u, int ldu,
                IComplexNumber v, int ldv,
                IComplexNumber q, int ldq,
                long ncycle );
    int ztgsja( int matrix_layout, char jobu, char jobv, char jobq,
                int m, int p, int n,
                int k, int l, IComplexNumber a,
                int lda, IComplexNumber b,
                int ldb, double tola, double tolb,
                long alpha, long beta,
                IComplexNumber u, int ldu,
                IComplexNumber v, int ldv,
                IComplexNumber q, int ldq,
                long ncycle );

    int stgsna( int matrix_layout, char job, char howmny,
                long   select, int n,
                final long a, int lda, final long b,
                int ldb, final long vl, int ldvl,
                final long vr, int ldvr, long s,
                long dif, int mm, long m );
    int dtgsna( int matrix_layout, char job, char howmny,
                long   select, int n,
                final long a, int lda, final long b,
                int ldb, final long vl, int ldvl,
                final long vr, int ldvr, long s,
                long dif, int mm, long m );
    int ctgsna( int matrix_layout, char job, char howmny,
                long   select, int n,
                final IComplexNumber a, int lda,
                final IComplexNumber b, int ldb,
                final IComplexNumber vl, int ldvl,
                final IComplexNumber vr, int ldvr,
                long s, long dif, int mm, long m );
    int ztgsna( int matrix_layout, char job, char howmny,
                long   select, int n,
                final IComplexNumber a, int lda,
                final IComplexNumber b, int ldb,
                final IComplexNumber vl, int ldvl,
                final IComplexNumber vr, int ldvr,
                long s, long dif, int mm,
                long m );

    int stgsyl( int matrix_layout, char trans, int ijob,
                int m, int n, final long a,
                int lda, final long b, int ldb,
                long c, int ldc, final long d,
                int ldd, final long e, int lde,
                long f, int ldf, long scale, long dif );
    int dtgsyl( int matrix_layout, char trans, int ijob,
                int m, int n, final long a,
                int lda, final long b, int ldb,
                long c, int ldc, final long d,
                int ldd, final long e, int lde,
                long f, int ldf, long scale,
                long dif );
    int ctgsyl( int matrix_layout, char trans, int ijob,
                int m, int n,
                final IComplexNumber a, int lda,
                final IComplexNumber b, int ldb,
                IComplexNumber c, int ldc,
                final IComplexNumber d, int ldd,
                final IComplexNumber e, int lde,
                IComplexNumber f, int ldf,
                long scale, long dif );
    int ztgsyl( int matrix_layout, char trans, int ijob,
                int m, int n,
                final IComplexNumber a, int lda,
                final IComplexNumber b, int ldb,
                IComplexNumber c, int ldc,
                final IComplexNumber d, int ldd,
                final IComplexNumber e, int lde,
                IComplexNumber f, int ldf,
                long scale, long dif );

    int stpcon( int matrix_layout, char norm, char uplo, char diag,
                int n, final long ap, long rcond );
    int dtpcon( int matrix_layout, char norm, char uplo, char diag,
                int n, final long ap, long rcond );
    int ctpcon( int matrix_layout, char norm, char uplo, char diag,
                int n, final IComplexNumber ap,
                long rcond );
    int ztpcon( int matrix_layout, char norm, char uplo, char diag,
                int n, final IComplexNumber ap,
                long rcond );

    int stprfs( int matrix_layout, char uplo, char trans, char diag,
                int n, int nrhs, final long ap,
                final long b, int ldb, final long x,
                int ldx, long ferr, long berr );
    int dtprfs( int matrix_layout, char uplo, char trans, char diag,
                int n, int nrhs, final long ap,
                final long b, int ldb, final long x,
                int ldx, long ferr, long berr );
    int ctprfs( int matrix_layout, char uplo, char trans, char diag,
                int n, int nrhs,
                final IComplexNumber ap,
                final IComplexNumber b, int ldb,
                final IComplexNumber x, int ldx,
                long ferr, long berr );
    int ztprfs( int matrix_layout, char uplo, char trans, char diag,
                int n, int nrhs,
                final IComplexNumber ap,
                final IComplexNumber b, int ldb,
                final IComplexNumber x, int ldx,
                long ferr, long berr );

    int stptri( int matrix_layout, char uplo, char diag, int n,
                long ap );
    int dtptri( int matrix_layout, char uplo, char diag, int n,
                long ap );
    int ctptri( int matrix_layout, char uplo, char diag, int n,
                IComplexNumber ap );
    int ztptri( int matrix_layout, char uplo, char diag, int n,
                IComplexNumber ap );

    int stptrs( int matrix_layout, char uplo, char trans, char diag,
                int n, int nrhs, final long ap,
                long b, int ldb );
    int dtptrs( int matrix_layout, char uplo, char trans, char diag,
                int n, int nrhs, final long ap,
                long b, int ldb );
    int ctptrs( int matrix_layout, char uplo, char trans, char diag,
                int n, int nrhs,
                final IComplexNumber ap,
                IComplexNumber b, int ldb );
    int ztptrs( int matrix_layout, char uplo, char trans, char diag,
                int n, int nrhs,
                final IComplexNumber ap,
                IComplexNumber b, int ldb );

    int stpttf( int matrix_layout, char transr, char uplo,
                int n, final long ap, long arf );
    int dtpttf( int matrix_layout, char transr, char uplo,
                int n, final long ap, long arf );
    int ctpttf( int matrix_layout, char transr, char uplo,
                int n, final IComplexNumber ap,
                IComplexNumber arf );
    int ztpttf( int matrix_layout, char transr, char uplo,
                int n, final IComplexNumber ap,
                IComplexNumber arf );

    int stpttr( int matrix_layout, char uplo, int n,
                final long ap, long a, int lda );
    int dtpttr( int matrix_layout, char uplo, int n,
                final long ap, long a, int lda );
    int ctpttr( int matrix_layout, char uplo, int n,
                final IComplexNumber ap,
                IComplexNumber a, int lda );
    int ztpttr( int matrix_layout, char uplo, int n,
                final IComplexNumber ap,
                IComplexNumber a, int lda );

    int strcon( int matrix_layout, char norm, char uplo, char diag,
                int n, final long a, int lda,
                long rcond );
    int dtrcon( int matrix_layout, char norm, char uplo, char diag,
                int n, final long a, int lda,
                long rcond );
    int ctrcon( int matrix_layout, char norm, char uplo, char diag,
                int n, final IComplexNumber a,
                int lda, long rcond );
    int ztrcon( int matrix_layout, char norm, char uplo, char diag,
                int n, final IComplexNumber a,
                int lda, long rcond );

    int strevc( int matrix_layout, char side, char howmny,
                long  select, int n, final long t,
                int ldt, long vl, int ldvl,
                long vr, int ldvr, int mm,
                long m );
    int dtrevc( int matrix_layout, char side, char howmny,
                long  select, int n,
                final long t, int ldt, long vl,
                int ldvl, long vr, int ldvr,
                int mm, long m );
    int ctrevc( int matrix_layout, char side, char howmny,
                long   select, int n,
                IComplexNumber t, int ldt,
                IComplexNumber vl, int ldvl,
                IComplexNumber vr, int ldvr,
                int mm, long m );
    int ztrevc( int matrix_layout, char side, char howmny,
                long   select, int n,
                IComplexNumber t, int ldt,
                IComplexNumber vl, int ldvl,
                IComplexNumber vr, int ldvr,
                int mm, long m );

    int strexc( int matrix_layout, char compq, int n, long t,
                int ldt, long q, int ldq,
                long ifst, long ilst );
    int dtrexc( int matrix_layout, char compq, int n,
                long t, int ldt, long q, int ldq,
                long ifst, long ilst );
    int ctrexc( int matrix_layout, char compq, int n,
                IComplexNumber t, int ldt,
                IComplexNumber q, int ldq,
                int ifst, int ilst );
    int ztrexc( int matrix_layout, char compq, int n,
                IComplexNumber t, int ldt,
                IComplexNumber q, int ldq,
                int ifst, int ilst );

    int strrfs( int matrix_layout, char uplo, char trans, char diag,
                int n, int nrhs, final long a,
                int lda, final long b, int ldb,
                final long x, int ldx, long ferr,
                long berr );
    int dtrrfs( int matrix_layout, char uplo, char trans, char diag,
                int n, int nrhs, final long a,
                int lda, final long b, int ldb,
                final long x, int ldx, long ferr,
                long berr );
    int ctrrfs( int matrix_layout, char uplo, char trans, char diag,
                int n, int nrhs,
                final IComplexNumber a, int lda,
                final IComplexNumber b, int ldb,
                final IComplexNumber x, int ldx,
                long ferr, long berr );
    int ztrrfs( int matrix_layout, char uplo, char trans, char diag,
                int n, int nrhs,
                final IComplexNumber a, int lda,
                final IComplexNumber b, int ldb,
                final IComplexNumber x, int ldx,
                long ferr, long berr );

    int strsen( int matrix_layout, char job, char compq,
                long   select, int n, long t,
                int ldt, long q, int ldq, long wr,
                long wi, long m, long s, long sep );
    int dtrsen( int matrix_layout, char job, char compq,
                long   select, int n,
                long t, int ldt, long q, int ldq,
                long wr, long wi, long m, long s,
                long sep );
    int ctrsen( int matrix_layout, char job, char compq,
                long   select, int n,
                IComplexNumber t, int ldt,
                IComplexNumber q, int ldq,
                IComplexNumber w, long m, long s,
                long sep );
    int ztrsen( int matrix_layout, char job, char compq,
                long   select, int n,
                IComplexNumber t, int ldt,
                IComplexNumber q, int ldq,
                IComplexNumber w, long m, long s,
                long sep );

    int strsna( int matrix_layout, char job, char howmny,
                long   select, int n,
                final long t, int ldt, final long vl,
                int ldvl, final long vr, int ldvr,
                long s, long sep, int mm, long m );
    int dtrsna( int matrix_layout, char job, char howmny,
                long   select, int n,
                final long t, int ldt, final long vl,
                int ldvl, final long vr, int ldvr,
                long s, long sep, int mm,
                long m );
    int ctrsna( int matrix_layout, char job, char howmny,
                long   select, int n,
                final IComplexNumber t, int ldt,
                final IComplexNumber vl, int ldvl,
                final IComplexNumber vr, int ldvr,
                long s, long sep, int mm, long m );
    int ztrsna( int matrix_layout, char job, char howmny,
                long   select, int n,
                final IComplexNumber t, int ldt,
                final IComplexNumber vl, int ldvl,
                final IComplexNumber vr, int ldvr,
                long s, long sep, int mm,
                long m );

    int strsyl( int matrix_layout, char trana, char tranb,
                int isgn, int m, int n,
                final long a, int lda, final long b,
                int ldb, long c, int ldc,
                long scale );
    int dtrsyl( int matrix_layout, char trana, char tranb,
                int isgn, int m, int n,
                final long a, int lda, final long b,
                int ldb, long c, int ldc,
                long scale );
    int ctrsyl( int matrix_layout, char trana, char tranb,
                int isgn, int m, int n,
                final IComplexNumber a, int lda,
                final IComplexNumber b, int ldb,
                IComplexNumber c, int ldc,
                long scale );
    int ztrsyl( int matrix_layout, char trana, char tranb,
                int isgn, int m, int n,
                final IComplexNumber a, int lda,
                final IComplexNumber b, int ldb,
                IComplexNumber c, int ldc,
                long scale );

    int strtri( int matrix_layout, char uplo, char diag, int n,
                long a, int lda );
    int dtrtri( int matrix_layout, char uplo, char diag, int n,
                long a, int lda );
    int ctrtri( int matrix_layout, char uplo, char diag, int n,
                IComplexNumber a, int lda );
    int ztrtri( int matrix_layout, char uplo, char diag, int n,
                IComplexNumber a, int lda );

    int strtrs( int matrix_layout, char uplo, char trans, char diag,
                int n, int nrhs, final long a,
                int lda, long b, int ldb );
    int dtrtrs( int matrix_layout, char uplo, char trans, char diag,
                int n, int nrhs, final long a,
                int lda, long b, int ldb );
    int ctrtrs( int matrix_layout, char uplo, char trans, char diag,
                int n, int nrhs,
                final IComplexNumber a, int lda,
                IComplexNumber b, int ldb );
    int ztrtrs( int matrix_layout, char uplo, char trans, char diag,
                int n, int nrhs,
                final IComplexNumber a, int lda,
                IComplexNumber b, int ldb );

    int strttf( int matrix_layout, char transr, char uplo,
                int n, final long a, int lda,
                long arf );
    int dtrttf( int matrix_layout, char transr, char uplo,
                int n, final long a, int lda,
                long arf );
    int ctrttf( int matrix_layout, char transr, char uplo,
                int n, final IComplexNumber a,
                int lda, IComplexNumber arf );
    int ztrttf( int matrix_layout, char transr, char uplo,
                int n, final IComplexNumber a,
                int lda, IComplexNumber arf );

    int strttp( int matrix_layout, char uplo, int n,
                final long a, int lda, long ap );
    int dtrttp( int matrix_layout, char uplo, int n,
                final long a, int lda, long ap );
    int ctrttp( int matrix_layout, char uplo, int n,
                final IComplexNumber a, int lda,
                IComplexNumber ap );
    int ztrttp( int matrix_layout, char uplo, int n,
                final IComplexNumber a, int lda,
                IComplexNumber ap );

    int stzrzf( int matrix_layout, int m, int n,
                long a, int lda, long tau );
    int dtzrzf( int matrix_layout, int m, int n,
                long a, int lda, long tau );
    int ctzrzf( int matrix_layout, int m, int n,
                IComplexNumber a, int lda,
                IComplexNumber tau );
    int ztzrzf( int matrix_layout, int m, int n,
                IComplexNumber a, int lda,
                IComplexNumber tau );

    int cungbr( int matrix_layout, char vect, int m,
                int n, int k, IComplexNumber a,
                int lda, final IComplexNumber tau );
    int zungbr( int matrix_layout, char vect, int m,
                int n, int k, IComplexNumber a,
                int lda, final IComplexNumber tau );

    int cunghr( int matrix_layout, int n, int ilo,
                int ihi, IComplexNumber a,
                int lda, final IComplexNumber tau );
    int zunghr( int matrix_layout, int n, int ilo,
                int ihi, IComplexNumber a,
                int lda, final IComplexNumber tau );

    int cunglq( int matrix_layout, int m, int n,
                int k, IComplexNumber a,
                int lda, final IComplexNumber tau );
    int zunglq( int matrix_layout, int m, int n,
                int k, IComplexNumber a,
                int lda, final IComplexNumber tau );

    int cungql( int matrix_layout, int m, int n,
                int k, IComplexNumber a,
                int lda, final IComplexNumber tau );
    int zungql( int matrix_layout, int m, int n,
                int k, IComplexNumber a,
                int lda, final IComplexNumber tau );

    int cungqr( int matrix_layout, int m, int n,
                int k, IComplexNumber a,
                int lda, final IComplexNumber tau );
    int zungqr( int matrix_layout, int m, int n,
                int k, IComplexNumber a,
                int lda, final IComplexNumber tau );

    int cungrq( int matrix_layout, int m, int n,
                int k, IComplexNumber a,
                int lda, final IComplexNumber tau );
    int zungrq( int matrix_layout, int m, int n,
                int k, IComplexNumber a,
                int lda, final IComplexNumber tau );

    int cungtr( int matrix_layout, char uplo, int n,
                IComplexNumber a, int lda,
                final IComplexNumber tau );
    int zungtr( int matrix_layout, char uplo, int n,
                IComplexNumber a, int lda,
                final IComplexNumber tau );

    int cunmbr( int matrix_layout, char vect, char side, char trans,
                int m, int n, int k,
                final IComplexNumber a, int lda,
                final IComplexNumber tau,
                IComplexNumber c, int ldc );
    int zunmbr( int matrix_layout, char vect, char side, char trans,
                int m, int n, int k,
                final IComplexNumber a, int lda,
                final IComplexNumber tau,
                IComplexNumber c, int ldc );

    int cunmhr( int matrix_layout, char side, char trans,
                int m, int n, int ilo,
                int ihi, final IComplexNumber a,
                int lda, final IComplexNumber tau,
                IComplexNumber c, int ldc );
    int zunmhr( int matrix_layout, char side, char trans,
                int m, int n, int ilo,
                int ihi, final IComplexNumber a,
                int lda, final IComplexNumber tau,
                IComplexNumber c, int ldc );

    int cunmlq( int matrix_layout, char side, char trans,
                int m, int n, int k,
                final IComplexNumber a, int lda,
                final IComplexNumber tau,
                IComplexNumber c, int ldc );
    int zunmlq( int matrix_layout, char side, char trans,
                int m, int n, int k,
                final IComplexNumber a, int lda,
                final IComplexNumber tau,
                IComplexNumber c, int ldc );

    int cunmql( int matrix_layout, char side, char trans,
                int m, int n, int k,
                final IComplexNumber a, int lda,
                final IComplexNumber tau,
                IComplexNumber c, int ldc );
    int zunmql( int matrix_layout, char side, char trans,
                int m, int n, int k,
                final IComplexNumber a, int lda,
                final IComplexNumber tau,
                IComplexNumber c, int ldc );

    int cunmqr( int matrix_layout, char side, char trans,
                int m, int n, int k,
                final IComplexNumber a, int lda,
                final IComplexNumber tau,
                IComplexNumber c, int ldc );
    int zunmqr( int matrix_layout, char side, char trans,
                int m, int n, int k,
                final IComplexNumber a, int lda,
                final IComplexNumber tau,
                IComplexNumber c, int ldc );

    int cunmrq( int matrix_layout, char side, char trans,
                int m, int n, int k,
                final IComplexNumber a, int lda,
                final IComplexNumber tau,
                IComplexNumber c, int ldc );
    int zunmrq( int matrix_layout, char side, char trans,
                int m, int n, int k,
                final IComplexNumber a, int lda,
                final IComplexNumber tau,
                IComplexNumber c, int ldc );

    int cunmrz( int matrix_layout, char side, char trans,
                int m, int n, int k,
                int l, final IComplexNumber a,
                int lda, final IComplexNumber tau,
                IComplexNumber c, int ldc );
    int zunmrz( int matrix_layout, char side, char trans,
                int m, int n, int k,
                int l, final IComplexNumber a,
                int lda, final IComplexNumber tau,
                IComplexNumber c, int ldc );

    int cunmtr( int matrix_layout, char side, char uplo, char trans,
                int m, int n,
                final IComplexNumber a, int lda,
                final IComplexNumber tau,
                IComplexNumber c, int ldc );
    int zunmtr( int matrix_layout, char side, char uplo, char trans,
                int m, int n,
                final IComplexNumber a, int lda,
                final IComplexNumber tau,
                IComplexNumber c, int ldc );

    int cupgtr( int matrix_layout, char uplo, int n,
                final IComplexNumber ap,
                final IComplexNumber tau,
                IComplexNumber q, int ldq );
    int zupgtr( int matrix_layout, char uplo, int n,
                final IComplexNumber ap,
                final IComplexNumber tau,
                IComplexNumber q, int ldq );

    int cupmtr( int matrix_layout, char side, char uplo, char trans,
                int m, int n,
                final IComplexNumber ap,
                final IComplexNumber tau,
                IComplexNumber c, int ldc );
    int zupmtr( int matrix_layout, char side, char uplo, char trans,
                int m, int n,
                final IComplexNumber ap,
                final IComplexNumber tau,
                IComplexNumber c, int ldc );

    int sbdsdc_work( int matrix_layout, char uplo, char compq,
                     int n, long d, long e, long u,
                     int ldu, long vt, int ldvt,
                     long q, long iq, long work,
                     long iwork );
    int dbdsdc_work( int matrix_layout, char uplo, char compq,
                     int n, long d, long e, long u,
                     int ldu, long vt, int ldvt,
                     long q, long iq, long work,
                     long iwork );

    int sbdsvdx_work( int matrix_layout, char uplo, char jobz, char range,
                      int n, long d, long e,
                      int vl, int vu,
                      int il, int iu, int ns,
                      long s, long z, int ldz,
                      long work, long iwork );
    int dbdsvdx_work( int matrix_layout, char uplo, char jobz, char range,
                      int n, long d, long e,
                      int vl, int vu,
                      int il, int iu, int ns,
                      long s, long z, int ldz,
                      long work, long iwork );

    int sbdsqr_work( int matrix_layout, char uplo, int n,
                     int ncvt, int nru, int ncc,
                     long d, long e, long vt, int ldvt,
                     long u, int ldu, long c,
                     int ldc, long work );
    int dbdsqr_work( int matrix_layout, char uplo, int n,
                     int ncvt, int nru, int ncc,
                     long d, long e, long vt,
                     int ldvt, long u, int ldu,
                     long c, int ldc, long work );
    int cbdsqr_work( int matrix_layout, char uplo, int n,
                     int ncvt, int nru, int ncc,
                     long d, long e, IComplexNumber vt,
                     int ldvt, IComplexNumber u,
                     int ldu, IComplexNumber c,
                     int ldc, long work );
    int zbdsqr_work( int matrix_layout, char uplo, int n,
                     int ncvt, int nru, int ncc,
                     long d, long e, IComplexNumber vt,
                     int ldvt, IComplexNumber u,
                     int ldu, IComplexNumber c,
                     int ldc, long work );

    int sdisna_work( char job, int m, int n,
                     final long d, long sep );
    int ddisna_work( char job, int m, int n,
                     final long d, long sep );

    int sgbbrd_work( int matrix_layout, char vect, int m,
                     int n, int ncc, int kl,
                     int ku, long ab, int ldab,
                     long d, long e, long q, int ldq,
                     long pt, int ldpt, long c,
                     int ldc, long work );
    int dgbbrd_work( int matrix_layout, char vect, int m,
                     int n, int ncc, int kl,
                     int ku, long ab, int ldab,
                     long d, long e, long q, int ldq,
                     long pt, int ldpt, long c,
                     int ldc, long work );
    int cgbbrd_work( int matrix_layout, char vect, int m,
                     int n, int ncc, int kl,
                     int ku, IComplexNumber ab,
                     int ldab, long d, long e,
                     IComplexNumber q, int ldq,
                     IComplexNumber pt, int ldpt,
                     IComplexNumber c, int ldc,
                     IComplexNumber work, long rwork );
    int zgbbrd_work( int matrix_layout, char vect, int m,
                     int n, int ncc, int kl,
                     int ku, IComplexNumber ab,
                     int ldab, long d, long e,
                     IComplexNumber q, int ldq,
                     IComplexNumber pt, int ldpt,
                     IComplexNumber c, int ldc,
                     IComplexNumber work, long rwork );

    int sgbcon_work( int matrix_layout, char norm, int n,
                     int kl, int ku, final long ab,
                     int ldab, final long ipiv,
                     float anorm, long rcond, long work,
                     long iwork );
    int dgbcon_work( int matrix_layout, char norm, int n,
                     int kl, int ku, final long ab,
                     int ldab, final long ipiv,
                     double anorm, long rcond, long work,
                     long iwork );
    int cgbcon_work( int matrix_layout, char norm, int n,
                     int kl, int ku,
                     final IComplexNumber ab, int ldab,
                     final long ipiv, float anorm,
                     long rcond, IComplexNumber work,
                     long rwork );
    int zgbcon_work( int matrix_layout, char norm, int n,
                     int kl, int ku,
                     final IComplexNumber ab,
                     int ldab, final long ipiv,
                     double anorm, long rcond,
                     IComplexNumber work, long rwork );

    int sgbequ_work( int matrix_layout, int m, int n,
                     int kl, int ku, final long ab,
                     int ldab, long r, long c,
                     long rowcnd, long colcnd, long amax );
    int dgbequ_work( int matrix_layout, int m, int n,
                     int kl, int ku, final long ab,
                     int ldab, long r, long c,
                     long rowcnd, long colcnd, long amax );
    int cgbequ_work( int matrix_layout, int m, int n,
                     int kl, int ku,
                     final IComplexNumber ab, int ldab,
                     long r, long c, long rowcnd,
                     long colcnd, long amax );
    int zgbequ_work( int matrix_layout, int m, int n,
                     int kl, int ku,
                     final IComplexNumber ab,
                     int ldab, long r, long c,
                     long rowcnd, long colcnd, long amax );

    int sgbequb_work( int matrix_layout, int m, int n,
                      int kl, int ku, final long ab,
                      int ldab, long r, long c,
                      long rowcnd, long colcnd, long amax );
    int dgbequb_work( int matrix_layout, int m, int n,
                      int kl, int ku, final long ab,
                      int ldab, long r, long c,
                      long rowcnd, long colcnd, long amax );
    int cgbequb_work( int matrix_layout, int m, int n,
                      int kl, int ku,
                      final IComplexNumber ab,
                      int ldab, long r, long c,
                      long rowcnd, long colcnd, long amax );
    int zgbequb_work( int matrix_layout, int m, int n,
                      int kl, int ku,
                      final IComplexNumber ab,
                      int ldab, long r, long c,
                      long rowcnd, long colcnd, long amax );

    int sgbrfs_work( int matrix_layout, char trans, int n,
                     int kl, int ku, int nrhs,
                     final long ab, int ldab,
                     final long afb, int ldafb,
                     final long ipiv, final long b,
                     int ldb, long x, int ldx,
                     long ferr, long berr, long work,
                     long iwork );
    int dgbrfs_work( int matrix_layout, char trans, int n,
                     int kl, int ku, int nrhs,
                     final long ab, int ldab,
                     final long afb, int ldafb,
                     final long ipiv, final long b,
                     int ldb, long x, int ldx,
                     long ferr, long berr, long work,
                     long iwork );
    int cgbrfs_work( int matrix_layout, char trans, int n,
                     int kl, int ku, int nrhs,
                     final IComplexNumber ab, int ldab,
                     final IComplexNumber afb,
                     int ldafb, final long ipiv,
                     final IComplexNumber b, int ldb,
                     IComplexNumber x, int ldx,
                     long ferr, long berr,
                     IComplexNumber work, long rwork );
    int zgbrfs_work( int matrix_layout, char trans, int n,
                     int kl, int ku, int nrhs,
                     final IComplexNumber ab,
                     int ldab,
                     final IComplexNumber afb,
                     int ldafb, final long ipiv,
                     final IComplexNumber b, int ldb,
                     IComplexNumber x, int ldx,
                     long ferr, long berr,
                     IComplexNumber work, long rwork );

    int sgbrfsx_work( int matrix_layout, char trans, char equed,
                      int n, int kl, int ku,
                      int nrhs, final long ab,
                      int ldab, final long afb,
                      int ldafb, final long ipiv,
                      final long r, final long c, final long b,
                      int ldb, long x, int ldx,
                      long rcond, long berr,
                      int n_err_bnds, long err_bnds_norm,
                      long err_bnds_comp, int nparams,
                      long params, long work,
                      long iwork );
    int dgbrfsx_work( int matrix_layout, char trans, char equed,
                      int n, int kl, int ku,
                      int nrhs, final long ab,
                      int ldab, final long afb,
                      int ldafb, final long ipiv,
                      final long r, final long c,
                      final long b, int ldb, long x,
                      int ldx, long rcond, long berr,
                      int n_err_bnds, long err_bnds_norm,
                      long err_bnds_comp, int nparams,
                      long params, long work,
                      long iwork );
    int cgbrfsx_work( int matrix_layout, char trans, char equed,
                      int n, int kl, int ku,
                      int nrhs,
                      final IComplexNumber ab,
                      int ldab,
                      final IComplexNumber afb,
                      int ldafb, final long ipiv,
                      final long r, final long c,
                      final IComplexNumber b, int ldb,
                      IComplexNumber x, int ldx,
                      long rcond, long berr,
                      int n_err_bnds, long err_bnds_norm,
                      long err_bnds_comp, int nparams,
                      long params, IComplexNumber work,
                      long rwork );
    int zgbrfsx_work( int matrix_layout, char trans, char equed,
                      int n, int kl, int ku,
                      int nrhs,
                      final IComplexNumber ab,
                      int ldab,
                      final IComplexNumber afb,
                      int ldafb, final long ipiv,
                      final long r, final long c,
                      final IComplexNumber b, int ldb,
                      IComplexNumber x, int ldx,
                      long rcond, long berr,
                      int n_err_bnds, long err_bnds_norm,
                      long err_bnds_comp, int nparams,
                      long params, IComplexNumber work,
                      long rwork );

    int sgbsv_work( int matrix_layout, int n, int kl,
                    int ku, int nrhs, long ab,
                    int ldab, long ipiv, long b,
                    int ldb );
    int dgbsv_work( int matrix_layout, int n, int kl,
                    int ku, int nrhs, long ab,
                    int ldab, long ipiv, long b,
                    int ldb );
    int cgbsv_work( int matrix_layout, int n, int kl,
                    int ku, int nrhs,
                    IComplexNumber ab, int ldab,
                    long ipiv, IComplexNumber b,
                    int ldb );
    int zgbsv_work( int matrix_layout, int n, int kl,
                    int ku, int nrhs,
                    IComplexNumber ab, int ldab,
                    long ipiv, IComplexNumber b,
                    int ldb );

    int sgbsvx_work( int matrix_layout, char fact, char trans,
                     int n, int kl, int ku,
                     int nrhs, long ab, int ldab,
                     long afb, int ldafb, long ipiv,
                     long equed, long r, long c, long b,
                     int ldb, long x, int ldx,
                     long rcond, long ferr, long berr,
                     long work, long iwork );
    int dgbsvx_work( int matrix_layout, char fact, char trans,
                     int n, int kl, int ku,
                     int nrhs, long ab, int ldab,
                     long afb, int ldafb, long ipiv,
                     long equed, long r, long c, long b,
                     int ldb, long x, int ldx,
                     long rcond, long ferr, long berr,
                     long work, long iwork );
    int cgbsvx_work( int matrix_layout, char fact, char trans,
                     int n, int kl, int ku,
                     int nrhs, IComplexNumber ab,
                     int ldab, IComplexNumber afb,
                     int ldafb, long ipiv, long equed,
                     long r, long c, IComplexNumber b,
                     int ldb, IComplexNumber x,
                     int ldx, long rcond, long ferr,
                     long berr, IComplexNumber work,
                     long rwork );
    int zgbsvx_work( int matrix_layout, char fact, char trans,
                     int n, int kl, int ku,
                     int nrhs, IComplexNumber ab,
                     int ldab, IComplexNumber afb,
                     int ldafb, long ipiv, long equed,
                     long r, long c, IComplexNumber b,
                     int ldb, IComplexNumber x,
                     int ldx, long rcond, long ferr,
                     long berr, IComplexNumber work,
                     long rwork );

    int sgbsvxx_work( int matrix_layout, char fact, char trans,
                      int n, int kl, int ku,
                      int nrhs, long ab, int ldab,
                      long afb, int ldafb, long ipiv,
                      long equed, long r, long c, long b,
                      int ldb, long x, int ldx,
                      long rcond, long rpvgrw, long berr,
                      int n_err_bnds, long err_bnds_norm,
                      long err_bnds_comp, int nparams,
                      long params, long work,
                      long iwork );
    int dgbsvxx_work( int matrix_layout, char fact, char trans,
                      int n, int kl, int ku,
                      int nrhs, long ab, int ldab,
                      long afb, int ldafb,
                      long ipiv, long equed, long r,
                      long c, long b, int ldb,
                      long x, int ldx, long rcond,
                      long rpvgrw, long berr,
                      int n_err_bnds, long err_bnds_norm,
                      long err_bnds_comp, int nparams,
                      long params, long work,
                      long iwork );
    int cgbsvxx_work( int matrix_layout, char fact, char trans,
                      int n, int kl, int ku,
                      int nrhs, IComplexNumber ab,
                      int ldab, IComplexNumber afb,
                      int ldafb, long ipiv,
                      long equed, long r, long c,
                      IComplexNumber b, int ldb,
                      IComplexNumber x, int ldx,
                      long rcond, long rpvgrw, long berr,
                      int n_err_bnds, long err_bnds_norm,
                      long err_bnds_comp, int nparams,
                      long params, IComplexNumber work,
                      long rwork );
    int zgbsvxx_work( int matrix_layout, char fact, char trans,
                      int n, int kl, int ku,
                      int nrhs, IComplexNumber ab,
                      int ldab, IComplexNumber afb,
                      int ldafb, long ipiv,
                      long equed, long r, long c,
                      IComplexNumber b, int ldb,
                      IComplexNumber x, int ldx,
                      long rcond, long rpvgrw, long berr,
                      int n_err_bnds, long err_bnds_norm,
                      long err_bnds_comp, int nparams,
                      long params, IComplexNumber work,
                      long rwork );

    int sgbtrf_work( int matrix_layout, int m, int n,
                     int kl, int ku, long ab,
                     int ldab, long ipiv );
    int dgbtrf_work( int matrix_layout, int m, int n,
                     int kl, int ku, long ab,
                     int ldab, long ipiv );
    int cgbtrf_work( int matrix_layout, int m, int n,
                     int kl, int ku,
                     IComplexNumber ab, int ldab,
                     long ipiv );
    int zgbtrf_work( int matrix_layout, int m, int n,
                     int kl, int ku,
                     IComplexNumber ab, int ldab,
                     long ipiv );

    int sgbtrs_work( int matrix_layout, char trans, int n,
                     int kl, int ku, int nrhs,
                     final long ab, int ldab,
                     final long ipiv, long b,
                     int ldb );
    int dgbtrs_work( int matrix_layout, char trans, int n,
                     int kl, int ku, int nrhs,
                     final long ab, int ldab,
                     final long ipiv, long b,
                     int ldb );
    int cgbtrs_work( int matrix_layout, char trans, int n,
                     int kl, int ku, int nrhs,
                     final IComplexNumber ab, int ldab,
                     final long ipiv, IComplexNumber b,
                     int ldb );
    int zgbtrs_work( int matrix_layout, char trans, int n,
                     int kl, int ku, int nrhs,
                     final IComplexNumber ab,
                     int ldab, final long ipiv,
                     IComplexNumber b, int ldb );

    int sgebak_work( int matrix_layout, char job, char side,
                     int n, int ilo, int ihi,
                     final long scale, int m, long v,
                     int ldv );
    int dgebak_work( int matrix_layout, char job, char side,
                     int n, int ilo, int ihi,
                     final long scale, int m, long v,
                     int ldv );
    int cgebak_work( int matrix_layout, char job, char side,
                     int n, int ilo, int ihi,
                     final long scale, int m,
                     IComplexNumber v, int ldv );
    int zgebak_work( int matrix_layout, char job, char side,
                     int n, int ilo, int ihi,
                     final long scale, int m,
                     IComplexNumber v, int ldv );

    int sgebal_work( int matrix_layout, char job, int n,
                     long a, int lda, long ilo,
                     long ihi, long scale );
    int dgebal_work( int matrix_layout, char job, int n,
                     long a, int lda, long ilo,
                     long ihi, long scale );
    int cgebal_work( int matrix_layout, char job, int n,
                     IComplexNumber a, int lda,
                     long ilo, long ihi,
                     long scale );
    int zgebal_work( int matrix_layout, char job, int n,
                     IComplexNumber a, int lda,
                     long ilo, long ihi,
                     long scale );

    int sgebrd_work( int matrix_layout, int m, int n,
                     long a, int lda, long d, long e,
                     long tauq, long taup, long work,
                     int lwork );
    int dgebrd_work( int matrix_layout, int m, int n,
                     long a, int lda, long d, long e,
                     long tauq, long taup, long work,
                     int lwork );
    int cgebrd_work( int matrix_layout, int m, int n,
                     IComplexNumber a, int lda,
                     long d, long e, IComplexNumber tauq,
                     IComplexNumber taup,
                     IComplexNumber work, int lwork );
    int zgebrd_work( int matrix_layout, int m, int n,
                     IComplexNumber a, int lda,
                     long d, long e,
                     IComplexNumber tauq,
                     IComplexNumber taup,
                     IComplexNumber work, int lwork );

    int sgecon_work( int matrix_layout, char norm, int n,
                     final long a, int lda, float anorm,
                     long rcond, long work, long iwork );
    int dgecon_work( int matrix_layout, char norm, int n,
                     final long a, int lda, double anorm,
                     long rcond, long work,
                     long iwork );
    int cgecon_work( int matrix_layout, char norm, int n,
                     final IComplexNumber a, int lda,
                     float anorm, long rcond,
                     IComplexNumber work, long rwork );
    int zgecon_work( int matrix_layout, char norm, int n,
                     final IComplexNumber a, int lda,
                     double anorm, long rcond,
                     IComplexNumber work, long rwork );

    int sgeequ_work( int matrix_layout, int m, int n,
                     final long a, int lda, long r,
                     long c, long rowcnd, long colcnd,
                     long amax );
    int dgeequ_work( int matrix_layout, int m, int n,
                     final long a, int lda, long r,
                     long c, long rowcnd, long colcnd,
                     long amax );
    int cgeequ_work( int matrix_layout, int m, int n,
                     final IComplexNumber a, int lda,
                     long r, long c, long rowcnd,
                     long colcnd, long amax );
    int zgeequ_work( int matrix_layout, int m, int n,
                     final IComplexNumber a, int lda,
                     long r, long c, long rowcnd,
                     long colcnd, long amax );

    int sgeequb_work( int matrix_layout, int m, int n,
                      final long a, int lda, long r,
                      long c, long rowcnd, long colcnd,
                      long amax );
    int dgeequb_work( int matrix_layout, int m, int n,
                      final long a, int lda, long r,
                      long c, long rowcnd, long colcnd,
                      long amax );
    int cgeequb_work( int matrix_layout, int m, int n,
                      final IComplexNumber a, int lda,
                      long r, long c, long rowcnd,
                      long colcnd, long amax );
    int zgeequb_work( int matrix_layout, int m, int n,
                      final IComplexNumber a, int lda,
                      long r, long c, long rowcnd,
                      long colcnd, long amax );

    int sgees_work( int matrix_layout, char jobvs, char sort,
                    long  select, int n, long a,
                    int lda, long sdim, long wr,
                    long wi, long vs, int ldvs,
                    long work, int lwork,
                    long  bwork );
    int dgees_work( int matrix_layout, char jobvs, char sort,
                    long  select, int n, long a,
                    int lda, long sdim, long wr,
                    long wi, long vs, int ldvs,
                    long work, int lwork,
                    long  bwork );
    int cgees_work( int matrix_layout, char jobvs, char sort,
                    long  select, int n,
                    IComplexNumber a, int lda,
                    long sdim, IComplexNumber w,
                    IComplexNumber vs, int ldvs,
                    IComplexNumber work, int lwork,
                    long rwork,long  bwork );
    int zgees_work( int matrix_layout, char jobvs, char sort,
                    long  select, int n,
                    IComplexNumber a, int lda,
                    long sdim, IComplexNumber w,
                    IComplexNumber vs, int ldvs,
                    IComplexNumber work, int lwork,
                    long rwork,long  bwork );

    int sgeesx_work( int matrix_layout, char jobvs, char sort,
                     long  select, char sense,
                     int n, long a, int lda,
                     long sdim, long wr, long wi,
                     long vs, int ldvs, long rconde,
                     long rcondv, long work, int lwork,
                     long iwork, int liwork,
                     long  bwork );
    int dgeesx_work( int matrix_layout, char jobvs, char sort,
                     long  select, char sense,
                     int n, long a, int lda,
                     long sdim, long wr, long wi,
                     long vs, int ldvs, long rconde,
                     long rcondv, long work, int lwork,
                     long iwork, int liwork,
                     long  bwork );
    int cgeesx_work( int matrix_layout, char jobvs, char sort,
                     long  select, char sense,
                     int n, IComplexNumber a,
                     int lda, long sdim,
                     IComplexNumber w,
                     IComplexNumber vs, int ldvs,
                     long rconde, long rcondv,
                     IComplexNumber work, int lwork,
                     long rwork,long  bwork );
    int zgeesx_work( int matrix_layout, char jobvs, char sort,
                     long  select, char sense,
                     int n, IComplexNumber a,
                     int lda, long sdim,
                     IComplexNumber w,
                     IComplexNumber vs, int ldvs,
                     long rconde, long rcondv,
                     IComplexNumber work, int lwork,
                     long rwork,long  bwork );

    int sgeev_work( int matrix_layout, char jobvl, char jobvr,
                    int n, long a, int lda,
                    long wr, long wi, long vl, int ldvl,
                    long vr, int ldvr, long work,
                    int lwork );
    int dgeev_work( int matrix_layout, char jobvl, char jobvr,
                    int n, long a, int lda,
                    long wr, long wi, long vl,
                    int ldvl, long vr, int ldvr,
                    long work, int lwork );
    int cgeev_work( int matrix_layout, char jobvl, char jobvr,
                    int n, IComplexNumber a,
                    int lda, IComplexNumber w,
                    IComplexNumber vl, int ldvl,
                    IComplexNumber vr, int ldvr,
                    IComplexNumber work, int lwork,
                    long rwork );
    int zgeev_work( int matrix_layout, char jobvl, char jobvr,
                    int n, IComplexNumber a,
                    int lda, IComplexNumber w,
                    IComplexNumber vl, int ldvl,
                    IComplexNumber vr, int ldvr,
                    IComplexNumber work, int lwork,
                    long rwork );

    int sgeevx_work( int matrix_layout, char balanc, char jobvl,
                     char jobvr, char sense, int n, long a,
                     int lda, long wr, long wi, long vl,
                     int ldvl, long vr, int ldvr,
                     long ilo, long ihi, long scale,
                     long abnrm, long rconde, long rcondv,
                     long work, int lwork,
                     long iwork );
    int dgeevx_work( int matrix_layout, char balanc, char jobvl,
                     char jobvr, char sense, int n, long a,
                     int lda, long wr, long wi,
                     long vl, int ldvl, long vr,
                     int ldvr, long ilo,
                     long ihi, long scale, long abnrm,
                     long rconde, long rcondv, long work,
                     int lwork, long iwork );
    int cgeevx_work( int matrix_layout, char balanc, char jobvl,
                     char jobvr, char sense, int n,
                     IComplexNumber a, int lda,
                     IComplexNumber w,
                     IComplexNumber vl, int ldvl,
                     IComplexNumber vr, int ldvr,
                     long ilo, long ihi, long scale,
                     long abnrm, long rconde, long rcondv,
                     IComplexNumber work, int lwork,
                     long rwork );
    int zgeevx_work( int matrix_layout, char balanc, char jobvl,
                     char jobvr, char sense, int n,
                     IComplexNumber a, int lda,
                     IComplexNumber w,
                     IComplexNumber vl, int ldvl,
                     IComplexNumber vr, int ldvr,
                     long ilo, long ihi, long scale,
                     long abnrm, long rconde, long rcondv,
                     IComplexNumber work, int lwork,
                     long rwork );

    int sgehrd_work( int matrix_layout, int n, int ilo,
                     int ihi, long a, int lda,
                     long tau, long work, int lwork );
    int dgehrd_work( int matrix_layout, int n, int ilo,
                     int ihi, long a, int lda,
                     long tau, long work, int lwork );
    int cgehrd_work( int matrix_layout, int n, int ilo,
                     int ihi, IComplexNumber a,
                     int lda, IComplexNumber tau,
                     IComplexNumber work, int lwork );
    int zgehrd_work( int matrix_layout, int n, int ilo,
                     int ihi, IComplexNumber a,
                     int lda, IComplexNumber tau,
                     IComplexNumber work, int lwork );

    int sgejsv_work( int matrix_layout, char joba, char jobu,
                     char jobv, char jobr, char jobt, char jobp,
                     int m, int n, long a,
                     int lda, long sva, long u,
                     int ldu, long v, int ldv,
                     long work, int lwork,
                     long iwork );
    int dgejsv_work( int matrix_layout, char joba, char jobu,
                     char jobv, char jobr, char jobt, char jobp,
                     int m, int n, long a,
                     int lda, long sva, long u,
                     int ldu, long v, int ldv,
                     long work, int lwork,
                     long iwork );
    int cgejsv_work( int matrix_layout, char joba, char jobu,
                     char jobv, char jobr, char jobt, char jobp,
                     int m, int n, IComplexNumber a,
                     int lda, long sva, IComplexNumber u,
                     int ldu, IComplexNumber v, int ldv,
                     IComplexNumber cwork, int lwork,
                     long work, int lrwork,
                     long iwork );
    int zgejsv_work( int matrix_layout, char joba, char jobu,
                     char jobv, char jobr, char jobt, char jobp,
                     int m, int n, IComplexNumber a,
                     int lda, long sva, IComplexNumber u,
                     int ldu, IComplexNumber v, int ldv,
                     IComplexNumber cwork, int lwork,
                     long work, int lrwork,
                     long iwork );

    int sgelq2_work( int matrix_layout, int m, int n,
                     long a, int lda, long tau,
                     long work );
    int dgelq2_work( int matrix_layout, int m, int n,
                     long a, int lda, long tau,
                     long work );
    int cgelq2_work( int matrix_layout, int m, int n,
                     IComplexNumber a, int lda,
                     IComplexNumber tau,
                     IComplexNumber work );
    int zgelq2_work( int matrix_layout, int m, int n,
                     IComplexNumber a, int lda,
                     IComplexNumber tau,
                     IComplexNumber work );

    int sgelqf_work( int matrix_layout, int m, int n,
                     long a, int lda, long tau,
                     long work, int lwork );
    int dgelqf_work( int matrix_layout, int m, int n,
                     long a, int lda, long tau,
                     long work, int lwork );
    int cgelqf_work( int matrix_layout, int m, int n,
                     IComplexNumber a, int lda,
                     IComplexNumber tau,
                     IComplexNumber work, int lwork );
    int zgelqf_work( int matrix_layout, int m, int n,
                     IComplexNumber a, int lda,
                     IComplexNumber tau,
                     IComplexNumber work, int lwork );

    int sgels_work( int matrix_layout, char trans, int m,
                    int n, int nrhs, long a,
                    int lda, long b, int ldb,
                    long work, int lwork );
    int dgels_work( int matrix_layout, char trans, int m,
                    int n, int nrhs, long a,
                    int lda, long b, int ldb,
                    long work, int lwork );
    int cgels_work( int matrix_layout, char trans, int m,
                    int n, int nrhs,
                    IComplexNumber a, int lda,
                    IComplexNumber b, int ldb,
                    IComplexNumber work, int lwork );
    int zgels_work( int matrix_layout, char trans, int m,
                    int n, int nrhs,
                    IComplexNumber a, int lda,
                    IComplexNumber b, int ldb,
                    IComplexNumber work, int lwork );

    int sgelsd_work( int matrix_layout, int m, int n,
                     int nrhs, long a, int lda,
                     long b, int ldb, long s, float rcond,
                     long rank, long work, int lwork,
                     long iwork );
    int dgelsd_work( int matrix_layout, int m, int n,
                     int nrhs, long a, int lda,
                     long b, int ldb, long s,
                     double rcond, long rank, long work,
                     int lwork, long iwork );
    int cgelsd_work( int matrix_layout, int m, int n,
                     int nrhs, IComplexNumber a,
                     int lda, IComplexNumber b,
                     int ldb, long s, float rcond,
                     long rank, IComplexNumber work,
                     int lwork, long rwork,
                     long iwork );
    int zgelsd_work( int matrix_layout, int m, int n,
                     int nrhs, IComplexNumber a,
                     int lda, IComplexNumber b,
                     int ldb, long s, double rcond,
                     long rank, IComplexNumber work,
                     int lwork, long rwork,
                     long iwork );

    int sgelss_work( int matrix_layout, int m, int n,
                     int nrhs, long a, int lda,
                     long b, int ldb, long s, float rcond,
                     long rank, long work,
                     int lwork );
    int dgelss_work( int matrix_layout, int m, int n,
                     int nrhs, long a, int lda,
                     long b, int ldb, long s,
                     double rcond, long rank, long work,
                     int lwork );
    int cgelss_work( int matrix_layout, int m, int n,
                     int nrhs, IComplexNumber a,
                     int lda, IComplexNumber b,
                     int ldb, long s, float rcond,
                     long rank, IComplexNumber work,
                     int lwork, long rwork );
    int zgelss_work( int matrix_layout, int m, int n,
                     int nrhs, IComplexNumber a,
                     int lda, IComplexNumber b,
                     int ldb, long s, double rcond,
                     long rank, IComplexNumber work,
                     int lwork, long rwork );

    int sgelsy_work( int matrix_layout, int m, int n,
                     int nrhs, long a, int lda,
                     long b, int ldb, long jpvt,
                     float rcond, long rank, long work,
                     int lwork );
    int dgelsy_work( int matrix_layout, int m, int n,
                     int nrhs, long a, int lda,
                     long b, int ldb, long jpvt,
                     double rcond, long rank, long work,
                     int lwork );
    int cgelsy_work( int matrix_layout, int m, int n,
                     int nrhs, IComplexNumber a,
                     int lda, IComplexNumber b,
                     int ldb, long jpvt, float rcond,
                     long rank, IComplexNumber work,
                     int lwork, long rwork );
    int zgelsy_work( int matrix_layout, int m, int n,
                     int nrhs, IComplexNumber a,
                     int lda, IComplexNumber b,
                     int ldb, long jpvt, double rcond,
                     long rank, IComplexNumber work,
                     int lwork, long rwork );

    int sgeqlf_work( int matrix_layout, int m, int n,
                     long a, int lda, long tau,
                     long work, int lwork );
    int dgeqlf_work( int matrix_layout, int m, int n,
                     long a, int lda, long tau,
                     long work, int lwork );
    int cgeqlf_work( int matrix_layout, int m, int n,
                     IComplexNumber a, int lda,
                     IComplexNumber tau,
                     IComplexNumber work, int lwork );
    int zgeqlf_work( int matrix_layout, int m, int n,
                     IComplexNumber a, int lda,
                     IComplexNumber tau,
                     IComplexNumber work, int lwork );

    int sgeqp3_work( int matrix_layout, int m, int n,
                     long a, int lda, long jpvt,
                     long tau, long work, int lwork );
    int dgeqp3_work( int matrix_layout, int m, int n,
                     long a, int lda, long jpvt,
                     long tau, long work, int lwork );
    int cgeqp3_work( int matrix_layout, int m, int n,
                     IComplexNumber a, int lda,
                     long jpvt, IComplexNumber tau,
                     IComplexNumber work, int lwork,
                     long rwork );
    int zgeqp3_work( int matrix_layout, int m, int n,
                     IComplexNumber a, int lda,
                     long jpvt, IComplexNumber tau,
                     IComplexNumber work, int lwork,
                     long rwork );

    int sgeqpf_work( int matrix_layout, int m, int n,
                     long a, int lda, long jpvt,
                     long tau, long work );
    int dgeqpf_work( int matrix_layout, int m, int n,
                     long a, int lda, long jpvt,
                     long tau, long work );
    int cgeqpf_work( int matrix_layout, int m, int n,
                     IComplexNumber a, int lda,
                     long jpvt, IComplexNumber tau,
                     IComplexNumber work, long rwork );
    int zgeqpf_work( int matrix_layout, int m, int n,
                     IComplexNumber a, int lda,
                     long jpvt, IComplexNumber tau,
                     IComplexNumber work, long rwork );

    int sgeqr2_work( int matrix_layout, int m, int n,
                     long a, int lda, long tau,
                     long work );
    int dgeqr2_work( int matrix_layout, int m, int n,
                     long a, int lda, long tau,
                     long work );
    int cgeqr2_work( int matrix_layout, int m, int n,
                     IComplexNumber a, int lda,
                     IComplexNumber tau,
                     IComplexNumber work );
    int zgeqr2_work( int matrix_layout, int m, int n,
                     IComplexNumber a, int lda,
                     IComplexNumber tau,
                     IComplexNumber work );

    int sgeqrf_work( int matrix_layout, int m, int n,
                     long a, int lda, long tau,
                     long work, int lwork );
    int dgeqrf_work( int matrix_layout, int m, int n,
                     long a, int lda, long tau,
                     long work, int lwork );
    int cgeqrf_work( int matrix_layout, int m, int n,
                     IComplexNumber a, int lda,
                     IComplexNumber tau,
                     IComplexNumber work, int lwork );
    int zgeqrf_work( int matrix_layout, int m, int n,
                     IComplexNumber a, int lda,
                     IComplexNumber tau,
                     IComplexNumber work, int lwork );

    int sgeqrfp_work( int matrix_layout, int m, int n,
                      long a, int lda, long tau,
                      long work, int lwork );
    int dgeqrfp_work( int matrix_layout, int m, int n,
                      long a, int lda, long tau,
                      long work, int lwork );
    int cgeqrfp_work( int matrix_layout, int m, int n,
                      IComplexNumber a, int lda,
                      IComplexNumber tau,
                      IComplexNumber work, int lwork );
    int zgeqrfp_work( int matrix_layout, int m, int n,
                      IComplexNumber a, int lda,
                      IComplexNumber tau,
                      IComplexNumber work,
                      int lwork );

    int sgerfs_work( int matrix_layout, char trans, int n,
                     int nrhs, final long a, int lda,
                     final long af, int ldaf,
                     final long ipiv, final long b,
                     int ldb, long x, int ldx,
                     long ferr, long berr, long work,
                     long iwork );
    int dgerfs_work( int matrix_layout, char trans, int n,
                     int nrhs, final long a,
                     int lda, final long af,
                     int ldaf, final long ipiv,
                     final long b, int ldb, long x,
                     int ldx, long ferr, long berr,
                     long work, long iwork );
    int cgerfs_work( int matrix_layout, char trans, int n,
                     int nrhs, final IComplexNumber a,
                     int lda, final IComplexNumber af,
                     int ldaf, final long ipiv,
                     final IComplexNumber b, int ldb,
                     IComplexNumber x, int ldx,
                     long ferr, long berr,
                     IComplexNumber work, long rwork );
    int zgerfs_work( int matrix_layout, char trans, int n,
                     int nrhs, final IComplexNumber a,
                     int lda, final IComplexNumber af,
                     int ldaf, final long ipiv,
                     final IComplexNumber b, int ldb,
                     IComplexNumber x, int ldx,
                     long ferr, long berr,
                     IComplexNumber work, long rwork );

    int sgerfsx_work( int matrix_layout, char trans, char equed,
                      int n, int nrhs, final long a,
                      int lda, final long af,
                      int ldaf, final long ipiv,
                      final long r, final long c, final long b,
                      int ldb, long x, int ldx,
                      long rcond, long berr,
                      int n_err_bnds, long err_bnds_norm,
                      long err_bnds_comp, int nparams,
                      long params, long work,
                      long iwork );
    int dgerfsx_work( int matrix_layout, char trans, char equed,
                      int n, int nrhs, final long a,
                      int lda, final long af,
                      int ldaf, final long ipiv,
                      final long r, final long c,
                      final long b, int ldb, long x,
                      int ldx, long rcond, long berr,
                      int n_err_bnds, long err_bnds_norm,
                      long err_bnds_comp, int nparams,
                      long params, long work,
                      long iwork );
    int cgerfsx_work( int matrix_layout, char trans, char equed,
                      int n, int nrhs,
                      final IComplexNumber a, int lda,
                      final IComplexNumber af,
                      int ldaf, final long ipiv,
                      final long r, final long c,
                      final IComplexNumber b, int ldb,
                      IComplexNumber x, int ldx,
                      long rcond, long berr,
                      int n_err_bnds, long err_bnds_norm,
                      long err_bnds_comp, int nparams,
                      long params, IComplexNumber work,
                      long rwork );
    int zgerfsx_work( int matrix_layout, char trans, char equed,
                      int n, int nrhs,
                      final IComplexNumber a, int lda,
                      final IComplexNumber af,
                      int ldaf, final long ipiv,
                      final long r, final long c,
                      final IComplexNumber b, int ldb,
                      IComplexNumber x, int ldx,
                      long rcond, long berr,
                      int n_err_bnds, long err_bnds_norm,
                      long err_bnds_comp, int nparams,
                      long params, IComplexNumber work,
                      long rwork );

    int sgerqf_work( int matrix_layout, int m, int n,
                     long a, int lda, long tau,
                     long work, int lwork );
    int dgerqf_work( int matrix_layout, int m, int n,
                     long a, int lda, long tau,
                     long work, int lwork );
    int cgerqf_work( int matrix_layout, int m, int n,
                     IComplexNumber a, int lda,
                     IComplexNumber tau,
                     IComplexNumber work, int lwork );
    int zgerqf_work( int matrix_layout, int m, int n,
                     IComplexNumber a, int lda,
                     IComplexNumber tau,
                     IComplexNumber work, int lwork );

    int sgesdd_work( int matrix_layout, char jobz, int m,
                     int n, long a, int lda,
                     long s, long u, int ldu, long vt,
                     int ldvt, long work, int lwork,
                     long iwork );
    int dgesdd_work( int matrix_layout, char jobz, int m,
                     int n, long a, int lda,
                     long s, long u, int ldu,
                     long vt, int ldvt, long work,
                     int lwork, long iwork );
    int cgesdd_work( int matrix_layout, char jobz, int m,
                     int n, IComplexNumber a,
                     int lda, long s,
                     IComplexNumber u, int ldu,
                     IComplexNumber vt, int ldvt,
                     IComplexNumber work, int lwork,
                     long rwork, long iwork );
    int zgesdd_work( int matrix_layout, char jobz, int m,
                     int n, IComplexNumber a,
                     int lda, long s,
                     IComplexNumber u, int ldu,
                     IComplexNumber vt, int ldvt,
                     IComplexNumber work, int lwork,
                     long rwork, long iwork );

    int sgesv_work( int matrix_layout, int n, int nrhs,
                    long a, int lda, long ipiv,
                    long b, int ldb );
    int dgesv_work( int matrix_layout, int n, int nrhs,
                    long a, int lda, long ipiv,
                    long b, int ldb );
    int cgesv_work( int matrix_layout, int n, int nrhs,
                    IComplexNumber a, int lda,
                    long ipiv, IComplexNumber b,
                    int ldb );
    int zgesv_work( int matrix_layout, int n, int nrhs,
                    IComplexNumber a, int lda,
                    long ipiv, IComplexNumber b,
                    int ldb );
    int dsgesv_work( int matrix_layout, int n, int nrhs,
                     long a, int lda, long ipiv,
                     long b, int ldb, long x,
                     int ldx, long work, long swork,
                     long iter );
    int zcgesv_work( int matrix_layout, int n, int nrhs,
                     IComplexNumber a, int lda,
                     long ipiv, IComplexNumber b,
                     int ldb, IComplexNumber x,
                     int ldx, IComplexNumber work,
                     IComplexNumber swork, long rwork,
                     long iter );

    int sgesvd_work( int matrix_layout, char jobu, char jobvt,
                     int m, int n, long a,
                     int lda, long s, long u,
                     int ldu, long vt, int ldvt,
                     long work, int lwork );
    int dgesvd_work( int matrix_layout, char jobu, char jobvt,
                     int m, int n, long a,
                     int lda, long s, long u,
                     int ldu, long vt, int ldvt,
                     long work, int lwork );
    int cgesvd_work( int matrix_layout, char jobu, char jobvt,
                     int m, int n,
                     IComplexNumber a, int lda,
                     long s, IComplexNumber u,
                     int ldu, IComplexNumber vt,
                     int ldvt, IComplexNumber work,
                     int lwork, long rwork );
    int zgesvd_work( int matrix_layout, char jobu, char jobvt,
                     int m, int n,
                     IComplexNumber a, int lda,
                     long s, IComplexNumber u,
                     int ldu, IComplexNumber vt,
                     int ldvt, IComplexNumber work,
                     int lwork, long rwork );

    int sgesvdx_work( int matrix_layout, char jobu, char jobvt, char range,
                      int m, int n, long a,
                      int lda, int vl, int vu,
                      int il, int iu, int ns,
                      long s, long u, int ldu,
                      long vt, int ldvt,
                      long work, int lwork, long iwork );
    int dgesvdx_work( int matrix_layout, char jobu, char jobvt, char range,
                      int m, int n, long a,
                      int lda, int vl, int vu,
                      int il, int iu, int ns,
                      long s, long u, int ldu,
                      long vt, int ldvt,
                      long work, int lwork, long iwork );
    int cgesvdx_work( int matrix_layout, char jobu, char jobvt, char range,
                      int m, int n, IComplexNumber a,
                      int lda, int vl, int vu,
                      int il, int iu, int ns,
                      long s, IComplexNumber u, int ldu,
                      IComplexNumber vt, int ldvt,
                      IComplexNumber work, int lwork,
                      long rwork, long iwork );
    int zgesvdx_work( int matrix_layout, char jobu, char jobvt, char range,
                      int m, int n, IComplexNumber a,
                      int lda, int vl, int vu,
                      int il, int iu, int ns,
                      long s, IComplexNumber u, int ldu,
                      IComplexNumber vt, int ldvt,
                      IComplexNumber work, int lwork,
                      long rwork, long iwork );

    int sgesvj_work( int matrix_layout, char joba, char jobu,
                     char jobv, int m, int n, long a,
                     int lda, long sva, int mv,
                     long v, int ldv, long work,
                     int lwork );
    int dgesvj_work( int matrix_layout, char joba, char jobu,
                     char jobv, int m, int n,
                     long a, int lda, long sva,
                     int mv, long v, int ldv,
                     long work, int lwork );
    int cgesvj_work( int matrix_layout, char joba, char jobu,
                     char jobv, int m, int n, IComplexNumber a,
                     int lda, long sva, int mv,
                     IComplexNumber v, int ldv,
                     IComplexNumber cwork, int lwork,
                     long rwork,int lrwork );
    int zgesvj_work( int matrix_layout, char joba, char jobu,
                     char jobv, int m, int n,
                     IComplexNumber a, int lda, long sva,
                     int mv, IComplexNumber v, int ldv,
                     IComplexNumber cwork, int lwork,
                     long rwork, int lrwork );

    int sgesvx_work( int matrix_layout, char fact, char trans,
                     int n, int nrhs, long a,
                     int lda, long af, int ldaf,
                     long ipiv, long equed, long r,
                     long c, long b, int ldb, long x,
                     int ldx, long rcond, long ferr,
                     long berr, long work, long iwork );
    int dgesvx_work( int matrix_layout, char fact, char trans,
                     int n, int nrhs, long a,
                     int lda, long af, int ldaf,
                     long ipiv, long equed, long r,
                     long c, long b, int ldb, long x,
                     int ldx, long rcond, long ferr,
                     long berr, long work, long iwork );
    int cgesvx_work( int matrix_layout, char fact, char trans,
                     int n, int nrhs,
                     IComplexNumber a, int lda,
                     IComplexNumber af, int ldaf,
                     long ipiv, long equed, long r,
                     long c, IComplexNumber b,
                     int ldb, IComplexNumber x,
                     int ldx, long rcond, long ferr,
                     long berr, IComplexNumber work,
                     long rwork );
    int zgesvx_work( int matrix_layout, char fact, char trans,
                     int n, int nrhs,
                     IComplexNumber a, int lda,
                     IComplexNumber af, int ldaf,
                     long ipiv, long equed, long r,
                     long c, IComplexNumber b,
                     int ldb, IComplexNumber x,
                     int ldx, long rcond, long ferr,
                     long berr, IComplexNumber work,
                     long rwork );

    int sgesvxx_work( int matrix_layout, char fact, char trans,
                      int n, int nrhs, long a,
                      int lda, long af, int ldaf,
                      long ipiv, long equed, long r,
                      long c, long b, int ldb, long x,
                      int ldx, long rcond, long rpvgrw,
                      long berr, int n_err_bnds,
                      long err_bnds_norm, long err_bnds_comp,
                      int nparams, long params, long work,
                      long iwork );
    int dgesvxx_work( int matrix_layout, char fact, char trans,
                      int n, int nrhs, long a,
                      int lda, long af, int ldaf,
                      long ipiv, long equed, long r,
                      long c, long b, int ldb,
                      long x, int ldx, long rcond,
                      long rpvgrw, long berr,
                      int n_err_bnds, long err_bnds_norm,
                      long err_bnds_comp, int nparams,
                      long params, long work,
                      long iwork );
    int cgesvxx_work( int matrix_layout, char fact, char trans,
                      int n, int nrhs,
                      IComplexNumber a, int lda,
                      IComplexNumber af, int ldaf,
                      long ipiv, long equed, long r,
                      long c, IComplexNumber b,
                      int ldb, IComplexNumber x,
                      int ldx, long rcond, long rpvgrw,
                      long berr, int n_err_bnds,
                      long err_bnds_norm, long err_bnds_comp,
                      int nparams, long params,
                      IComplexNumber work, long rwork );
    int zgesvxx_work( int matrix_layout, char fact, char trans,
                      int n, int nrhs,
                      IComplexNumber a, int lda,
                      IComplexNumber af, int ldaf,
                      long ipiv, long equed, long r,
                      long c, IComplexNumber b,
                      int ldb, IComplexNumber x,
                      int ldx, long rcond, long rpvgrw,
                      long berr, int n_err_bnds,
                      long err_bnds_norm, long err_bnds_comp,
                      int nparams, long params,
                      IComplexNumber work, long rwork );

    int sgetf2_work( int matrix_layout, int m, int n,
                     long a, int lda, long ipiv );
    int dgetf2_work( int matrix_layout, int m, int n,
                     long a, int lda, long ipiv );
    int cgetf2_work( int matrix_layout, int m, int n,
                     IComplexNumber a, int lda,
                     long ipiv );
    int zgetf2_work( int matrix_layout, int m, int n,
                     IComplexNumber a, int lda,
                     long ipiv );

    int sgetrf_work( int matrix_layout, int m, int n,
                     long a, int lda, long ipiv );
    int dgetrf_work( int matrix_layout, int m, int n,
                     long a, int lda, long ipiv );
    int cgetrf_work( int matrix_layout, int m, int n,
                     IComplexNumber a, int lda,
                     long ipiv );
    int zgetrf_work( int matrix_layout, int m, int n,
                     IComplexNumber a, int lda,
                     long ipiv );

    int sgetrf2_work( int matrix_layout, int m, int n,
                      long a, int lda, long ipiv );
    int dgetrf2_work( int matrix_layout, int m, int n,
                      long a, int lda, long ipiv );
    int cgetrf2_work( int matrix_layout, int m, int n,
                      IComplexNumber a, int lda,
                      long ipiv );
    int zgetrf2_work( int matrix_layout, int m, int n,
                      IComplexNumber a, int lda,
                      long ipiv );

    int sgetri_work( int matrix_layout, int n, long a,
                     int lda, final long ipiv,
                     long work, int lwork );
    int dgetri_work( int matrix_layout, int n, long a,
                     int lda, final long ipiv,
                     long work, int lwork );
    int cgetri_work( int matrix_layout, int n,
                     IComplexNumber a, int lda,
                     final long ipiv,
                     IComplexNumber work, int lwork );
    int zgetri_work( int matrix_layout, int n,
                     IComplexNumber a, int lda,
                     final long ipiv,
                     IComplexNumber work, int lwork );

    int sgetrs_work( int matrix_layout, char trans, int n,
                     int nrhs, final long a, int lda,
                     final long ipiv, long b,
                     int ldb );
    int dgetrs_work( int matrix_layout, char trans, int n,
                     int nrhs, final long a,
                     int lda, final long ipiv,
                     long b, int ldb );
    int cgetrs_work( int matrix_layout, char trans, int n,
                     int nrhs, final IComplexNumber a,
                     int lda, final long ipiv,
                     IComplexNumber b, int ldb );
    int zgetrs_work( int matrix_layout, char trans, int n,
                     int nrhs, final IComplexNumber a,
                     int lda, final long ipiv,
                     IComplexNumber b, int ldb );

    int sggbak_work( int matrix_layout, char job, char side,
                     int n, int ilo, int ihi,
                     final long lscale, final long rscale,
                     int m, long v, int ldv );
    int dggbak_work( int matrix_layout, char job, char side,
                     int n, int ilo, int ihi,
                     final long lscale, final long rscale,
                     int m, long v, int ldv );
    int cggbak_work( int matrix_layout, char job, char side,
                     int n, int ilo, int ihi,
                     final long lscale, final long rscale,
                     int m, IComplexNumber v,
                     int ldv );
    int zggbak_work( int matrix_layout, char job, char side,
                     int n, int ilo, int ihi,
                     final long lscale, final long rscale,
                     int m, IComplexNumber v,
                     int ldv );

    int sggbal_work( int matrix_layout, char job, int n,
                     long a, int lda, long b,
                     int ldb, long ilo,
                     long ihi, long lscale, long rscale,
                     long work );
    int dggbal_work( int matrix_layout, char job, int n,
                     long a, int lda, long b,
                     int ldb, long ilo,
                     long ihi, long lscale, long rscale,
                     long work );
    int cggbal_work( int matrix_layout, char job, int n,
                     IComplexNumber a, int lda,
                     IComplexNumber b, int ldb,
                     long ilo, long ihi, long lscale,
                     long rscale, long work );
    int zggbal_work( int matrix_layout, char job, int n,
                     IComplexNumber a, int lda,
                     IComplexNumber b, int ldb,
                     long ilo, long ihi,
                     long lscale, long rscale, long work );

    int sgges_work( int matrix_layout, char jobvsl, char jobvsr,
                    char sort, long  selctg, int n,
                    long a, int lda, long b,
                    int ldb, long sdim, long alphar,
                    long alphai, long beta, long vsl,
                    int ldvsl, long vsr, int ldvsr,
                    long work, int lwork,
                    long  bwork );
    int dgges_work( int matrix_layout, char jobvsl, char jobvsr,
                    char sort, long  selctg, int n,
                    long a, int lda, long b,
                    int ldb, long sdim, long alphar,
                    long alphai, long beta, long vsl,
                    int ldvsl, long vsr, int ldvsr,
                    long work, int lwork,
                    long  bwork );
    int cgges_work( int matrix_layout, char jobvsl, char jobvsr,
                    char sort, long  selctg, int n,
                    IComplexNumber a, int lda,
                    IComplexNumber b, int ldb,
                    long sdim, IComplexNumber alpha,
                    IComplexNumber beta,
                    IComplexNumber vsl, int ldvsl,
                    IComplexNumber vsr, int ldvsr,
                    IComplexNumber work, int lwork,
                    long rwork,long  bwork );
    int zgges_work( int matrix_layout, char jobvsl, char jobvsr,
                    char sort, long  selctg, int n,
                    IComplexNumber a, int lda,
                    IComplexNumber b, int ldb,
                    long sdim, IComplexNumber alpha,
                    IComplexNumber beta,
                    IComplexNumber vsl, int ldvsl,
                    IComplexNumber vsr, int ldvsr,
                    IComplexNumber work, int lwork,
                    long rwork,long  bwork );

    int sgges3_work( int matrix_layout, char jobvsl, char jobvsr,
                     char sort, long  selctg,
                     int n,
                     long a, int lda,
                     long b, int ldb, long sdim,
                     long alphar, long alphai, long beta,
                     long vsl, int ldvsl,
                     long vsr, int ldvsr,
                     long work, int lwork,
                     long  bwork );
    int dgges3_work( int matrix_layout, char jobvsl, char jobvsr,
                     char sort, long  selctg,
                     int n,
                     long a, int lda,
                     long b, int ldb, long sdim,
                     long alphar, long alphai, long beta,
                     long vsl, int ldvsl,
                     long vsr, int ldvsr,
                     long work, int lwork,
                     long  bwork );
    int cgges3_work( int matrix_layout, char jobvsl, char jobvsr,
                     char sort, long  selctg,
                     int n,
                     IComplexNumber a, int lda,
                     IComplexNumber b, int ldb,
                     long sdim, IComplexNumber alpha,
                     IComplexNumber beta,
                     IComplexNumber vsl, int ldvsl,
                     IComplexNumber vsr, int ldvsr,
                     IComplexNumber work, int lwork,
                     long rwork,long  bwork );
    int zgges3_work( int matrix_layout, char jobvsl, char jobvsr,
                     char sort, long  selctg,
                     int n,
                     IComplexNumber a, int lda,
                     IComplexNumber b, int ldb,
                     long sdim, IComplexNumber alpha,
                     IComplexNumber beta,
                     IComplexNumber vsl, int ldvsl,
                     IComplexNumber vsr, int ldvsr,
                     IComplexNumber work, int lwork,
                     long rwork,long  bwork );

    int sggesx_work( int matrix_layout, char jobvsl, char jobvsr,
                     char sort, long  selctg, char sense,
                     int n, long a, int lda,
                     long b, int ldb, long sdim,
                     long alphar, long alphai, long beta,
                     long vsl, int ldvsl, long vsr,
                     int ldvsr, long rconde, long rcondv,
                     long work, int lwork,
                     long iwork, int liwork,
                     long  bwork );
    int dggesx_work( int matrix_layout, char jobvsl, char jobvsr,
                     char sort, long  selctg, char sense,
                     int n, long a, int lda,
                     long b, int ldb, long sdim,
                     long alphar, long alphai, long beta,
                     long vsl, int ldvsl, long vsr,
                     int ldvsr, long rconde,
                     long rcondv, long work, int lwork,
                     long iwork, int liwork,
                     long  bwork );
    int cggesx_work( int matrix_layout, char jobvsl, char jobvsr,
                     char sort, long  selctg, char sense,
                     int n, IComplexNumber a,
                     int lda, IComplexNumber b,
                     int ldb, long sdim,
                     IComplexNumber alpha,
                     IComplexNumber beta,
                     IComplexNumber vsl, int ldvsl,
                     IComplexNumber vsr, int ldvsr,
                     long rconde, long rcondv,
                     IComplexNumber work, int lwork,
                     long rwork, long iwork,
                     int liwork,long  bwork );
    int zggesx_work( int matrix_layout, char jobvsl, char jobvsr,
                     char sort, long  selctg, char sense,
                     int n, IComplexNumber a,
                     int lda, IComplexNumber b,
                     int ldb, long sdim,
                     IComplexNumber alpha,
                     IComplexNumber beta,
                     IComplexNumber vsl, int ldvsl,
                     IComplexNumber vsr, int ldvsr,
                     long rconde, long rcondv,
                     IComplexNumber work, int lwork,
                     long rwork, long iwork,
                     int liwork,long  bwork );

    int sggev_work( int matrix_layout, char jobvl, char jobvr,
                    int n, long a, int lda, long b,
                    int ldb, long alphar, long alphai,
                    long beta, long vl, int ldvl,
                    long vr, int ldvr, long work,
                    int lwork );
    int dggev_work( int matrix_layout, char jobvl, char jobvr,
                    int n, long a, int lda,
                    long b, int ldb, long alphar,
                    long alphai, long beta, long vl,
                    int ldvl, long vr, int ldvr,
                    long work, int lwork );
    int cggev_work( int matrix_layout, char jobvl, char jobvr,
                    int n, IComplexNumber a,
                    int lda, IComplexNumber b,
                    int ldb, IComplexNumber alpha,
                    IComplexNumber beta,
                    IComplexNumber vl, int ldvl,
                    IComplexNumber vr, int ldvr,
                    IComplexNumber work, int lwork,
                    long rwork );
    int zggev_work( int matrix_layout, char jobvl, char jobvr,
                    int n, IComplexNumber a,
                    int lda, IComplexNumber b,
                    int ldb, IComplexNumber alpha,
                    IComplexNumber beta,
                    IComplexNumber vl, int ldvl,
                    IComplexNumber vr, int ldvr,
                    IComplexNumber work, int lwork,
                    long rwork );

    int sggev3_work( int matrix_layout, char jobvl, char jobvr,
                     int n,
                     long a, int lda,
                     long b, int ldb,
                     long alphar, long alphai, long beta,
                     long vl, int ldvl,
                     long vr, int ldvr,
                     long work, int lwork );
    int dggev3_work( int matrix_layout, char jobvl, char jobvr,
                     int n,
                     long a, int lda,
                     long b, int ldb,
                     long alphar, long alphai, long beta,
                     long vl, int ldvl,
                     long vr, int ldvr,
                     long work, int lwork );
    int cggev3_work( int matrix_layout, char jobvl, char jobvr,
                     int n,
                     IComplexNumber a, int lda,
                     IComplexNumber b, int ldb,
                     IComplexNumber alpha,
                     IComplexNumber beta,
                     IComplexNumber vl, int ldvl,
                     IComplexNumber vr, int ldvr,
                     IComplexNumber work, int lwork,
                     long rwork );
    int zggev3_work( int matrix_layout, char jobvl, char jobvr,
                     int n,
                     IComplexNumber a, int lda,
                     IComplexNumber b, int ldb,
                     IComplexNumber alpha,
                     IComplexNumber beta,
                     IComplexNumber vl, int ldvl,
                     IComplexNumber vr, int ldvr,
                     IComplexNumber work, int lwork,
                     long rwork );

    int sggevx_work( int matrix_layout, char balanc, char jobvl,
                     char jobvr, char sense, int n, long a,
                     int lda, long b, int ldb,
                     long alphar, long alphai, long beta,
                     long vl, int ldvl, long vr,
                     int ldvr, long ilo,
                     long ihi, long lscale, long rscale,
                     long abnrm, long bbnrm, long rconde,
                     long rcondv, long work, int lwork,
                     long iwork,long  bwork );
    int dggevx_work( int matrix_layout, char balanc, char jobvl,
                     char jobvr, char sense, int n, long a,
                     int lda, long b, int ldb,
                     long alphar, long alphai, long beta,
                     long vl, int ldvl, long vr,
                     int ldvr, long ilo,
                     long ihi, long lscale, long rscale,
                     long abnrm, long bbnrm, long rconde,
                     long rcondv, long work, int lwork,
                     long iwork,long  bwork );
    int cggevx_work( int matrix_layout, char balanc, char jobvl,
                     char jobvr, char sense, int n,
                     IComplexNumber a, int lda,
                     IComplexNumber b, int ldb,
                     IComplexNumber alpha,
                     IComplexNumber beta,
                     IComplexNumber vl, int ldvl,
                     IComplexNumber vr, int ldvr,
                     long ilo, long ihi, long lscale,
                     long rscale, long abnrm, long bbnrm,
                     long rconde, long rcondv,
                     IComplexNumber work, int lwork,
                     long rwork, long iwork,
                     long  bwork );
    int zggevx_work( int matrix_layout, char balanc, char jobvl,
                     char jobvr, char sense, int n,
                     IComplexNumber a, int lda,
                     IComplexNumber b, int ldb,
                     IComplexNumber alpha,
                     IComplexNumber beta,
                     IComplexNumber vl, int ldvl,
                     IComplexNumber vr, int ldvr,
                     long ilo, long ihi,
                     long lscale, long rscale, long abnrm,
                     long bbnrm, long rconde, long rcondv,
                     IComplexNumber work, int lwork,
                     long rwork, long iwork,
                     long  bwork );

    int sggglm_work( int matrix_layout, int n, int m,
                     int p, long a, int lda,
                     long b, int ldb, long d, long x,
                     long y, long work, int lwork );
    int dggglm_work( int matrix_layout, int n, int m,
                     int p, long a, int lda,
                     long b, int ldb, long d, long x,
                     long y, long work, int lwork );
    int cggglm_work( int matrix_layout, int n, int m,
                     int p, IComplexNumber a,
                     int lda, IComplexNumber b,
                     int ldb, IComplexNumber d,
                     IComplexNumber x,
                     IComplexNumber y,
                     IComplexNumber work, int lwork );
    int zggglm_work( int matrix_layout, int n, int m,
                     int p, IComplexNumber a,
                     int lda, IComplexNumber b,
                     int ldb, IComplexNumber d,
                     IComplexNumber x,
                     IComplexNumber y,
                     IComplexNumber work, int lwork );

    int sgghrd_work( int matrix_layout, char compq, char compz,
                     int n, int ilo, int ihi,
                     long a, int lda, long b,
                     int ldb, long q, int ldq,
                     long z, int ldz );
    int dgghrd_work( int matrix_layout, char compq, char compz,
                     int n, int ilo, int ihi,
                     long a, int lda, long b,
                     int ldb, long q, int ldq,
                     long z, int ldz );
    int cgghrd_work( int matrix_layout, char compq, char compz,
                     int n, int ilo, int ihi,
                     IComplexNumber a, int lda,
                     IComplexNumber b, int ldb,
                     IComplexNumber q, int ldq,
                     IComplexNumber z, int ldz );
    int zgghrd_work( int matrix_layout, char compq, char compz,
                     int n, int ilo, int ihi,
                     IComplexNumber a, int lda,
                     IComplexNumber b, int ldb,
                     IComplexNumber q, int ldq,
                     IComplexNumber z, int ldz );

    int sgghd3_work( int matrix_layout, char compq, char compz,
                     int n, int ilo, int ihi,
                     long a, int lda,
                     long b, int ldb,
                     long q, int ldq,
                     long z, int ldz,
                     long work, int lwork );
    int dgghd3_work( int matrix_layout, char compq, char compz,
                     int n, int ilo, int ihi,
                     long a, int lda,
                     long b, int ldb,
                     long q, int ldq,
                     long z, int ldz,
                     long work, int lwork );
    int cgghd3_work( int matrix_layout, char compq, char compz,
                     int n, int ilo, int ihi,
                     IComplexNumber a, int lda,
                     IComplexNumber b, int ldb,
                     IComplexNumber q, int ldq,
                     IComplexNumber z, int ldz,
                     IComplexNumber work, int lwork );
    int zgghd3_work( int matrix_layout, char compq, char compz,
                     int n, int ilo, int ihi,
                     IComplexNumber a, int lda,
                     IComplexNumber b, int ldb,
                     IComplexNumber q, int ldq,
                     IComplexNumber z, int ldz,
                     IComplexNumber work,
                     int lwork );

    int sgglse_work( int matrix_layout, int m, int n,
                     int p, long a, int lda,
                     long b, int ldb, long c, long d,
                     long x, long work, int lwork );
    int dgglse_work( int matrix_layout, int m, int n,
                     int p, long a, int lda,
                     long b, int ldb, long c, long d,
                     long x, long work, int lwork );
    int cgglse_work( int matrix_layout, int m, int n,
                     int p, IComplexNumber a,
                     int lda, IComplexNumber b,
                     int ldb, IComplexNumber c,
                     IComplexNumber d,
                     IComplexNumber x,
                     IComplexNumber work, int lwork );
    int zgglse_work( int matrix_layout, int m, int n,
                     int p, IComplexNumber a,
                     int lda, IComplexNumber b,
                     int ldb, IComplexNumber c,
                     IComplexNumber d,
                     IComplexNumber x,
                     IComplexNumber work, int lwork );

    int sggqrf_work( int matrix_layout, int n, int m,
                     int p, long a, int lda,
                     long taua, long b, int ldb,
                     long taub, long work, int lwork );
    int dggqrf_work( int matrix_layout, int n, int m,
                     int p, long a, int lda,
                     long taua, long b, int ldb,
                     long taub, long work, int lwork );
    int cggqrf_work( int matrix_layout, int n, int m,
                     int p, IComplexNumber a,
                     int lda, IComplexNumber taua,
                     IComplexNumber b, int ldb,
                     IComplexNumber taub,
                     IComplexNumber work, int lwork );
    int zggqrf_work( int matrix_layout, int n, int m,
                     int p, IComplexNumber a,
                     int lda, IComplexNumber taua,
                     IComplexNumber b, int ldb,
                     IComplexNumber taub,
                     IComplexNumber work, int lwork );

    int sggrqf_work( int matrix_layout, int m, int p,
                     int n, long a, int lda,
                     long taua, long b, int ldb,
                     long taub, long work, int lwork );
    int dggrqf_work( int matrix_layout, int m, int p,
                     int n, long a, int lda,
                     long taua, long b, int ldb,
                     long taub, long work, int lwork );
    int cggrqf_work( int matrix_layout, int m, int p,
                     int n, IComplexNumber a,
                     int lda, IComplexNumber taua,
                     IComplexNumber b, int ldb,
                     IComplexNumber taub,
                     IComplexNumber work, int lwork );
    int zggrqf_work( int matrix_layout, int m, int p,
                     int n, IComplexNumber a,
                     int lda, IComplexNumber taua,
                     IComplexNumber b, int ldb,
                     IComplexNumber taub,
                     IComplexNumber work, int lwork );

    int sggsvd_work( int matrix_layout, char jobu, char jobv,
                     char jobq, int m, int n,
                     int p, long k, long l,
                     long a, int lda, long b,
                     int ldb, long alpha, long beta,
                     long u, int ldu, long v,
                     int ldv, long q, int ldq,
                     long work, long iwork );
    int dggsvd_work( int matrix_layout, char jobu, char jobv,
                     char jobq, int m, int n,
                     int p, long k, long l,
                     long a, int lda, long b,
                     int ldb, long alpha, long beta,
                     long u, int ldu, long v,
                     int ldv, long q, int ldq,
                     long work, long iwork );
    int cggsvd_work( int matrix_layout, char jobu, char jobv,
                     char jobq, int m, int n,
                     int p, long k, long l,
                     IComplexNumber a, int lda,
                     IComplexNumber b, int ldb,
                     long alpha, long beta,
                     IComplexNumber u, int ldu,
                     IComplexNumber v, int ldv,
                     IComplexNumber q, int ldq,
                     IComplexNumber work, long rwork,
                     long iwork );
    int zggsvd_work( int matrix_layout, char jobu, char jobv,
                     char jobq, int m, int n,
                     int p, long k, long l,
                     IComplexNumber a, int lda,
                     IComplexNumber b, int ldb,
                     long alpha, long beta,
                     IComplexNumber u, int ldu,
                     IComplexNumber v, int ldv,
                     IComplexNumber q, int ldq,
                     IComplexNumber work, long rwork,
                     long iwork );

    int sggsvd3_work( int matrix_layout, char jobu, char jobv,
                      char jobq, int m, int n,
                      int p, long k, long l,
                      long a, int lda, long b,
                      int ldb, long alpha, long beta,
                      long u, int ldu, long v,
                      int ldv, long q, int ldq,
                      long work, int lwork,
                      long iwork );
    int dggsvd3_work( int matrix_layout, char jobu, char jobv,
                      char jobq, int m, int n,
                      int p, long k, long l,
                      long a, int lda, long b,
                      int ldb, long alpha, long beta,
                      long u, int ldu, long v,
                      int ldv, long q, int ldq,
                      long work, int lwork,
                      long iwork );
    int cggsvd3_work( int matrix_layout, char jobu, char jobv,
                      char jobq, int m, int n,
                      int p, long k, long l,
                      IComplexNumber a, int lda,
                      IComplexNumber b, int ldb,
                      long alpha, long beta,
                      IComplexNumber u, int ldu,
                      IComplexNumber v, int ldv,
                      IComplexNumber q, int ldq,
                      IComplexNumber work, int lwork,
                      long rwork, long iwork );
    int zggsvd3_work( int matrix_layout, char jobu, char jobv,
                      char jobq, int m, int n,
                      int p, long k, long l,
                      IComplexNumber a, int lda,
                      IComplexNumber b, int ldb,
                      long alpha, long beta,
                      IComplexNumber u, int ldu,
                      IComplexNumber v, int ldv,
                      IComplexNumber q, int ldq,
                      IComplexNumber work, int lwork,
                      long rwork, long iwork );

    int sggsvp_work( int matrix_layout, char jobu, char jobv,
                     char jobq, int m, int p,
                     int n, long a, int lda,
                     long b, int ldb, float tola,
                     float tolb, long k, long l,
                     long u, int ldu, long v,
                     int ldv, long q, int ldq,
                     long iwork, long tau, long work );
    int dggsvp_work( int matrix_layout, char jobu, char jobv,
                     char jobq, int m, int p,
                     int n, long a, int lda,
                     long b, int ldb, double tola,
                     double tolb, long k, long l,
                     long u, int ldu, long v,
                     int ldv, long q, int ldq,
                     long iwork, long tau, long work );
    int cggsvp_work( int matrix_layout, char jobu, char jobv,
                     char jobq, int m, int p,
                     int n, IComplexNumber a,
                     int lda, IComplexNumber b,
                     int ldb, float tola, float tolb,
                     long k, long l,
                     IComplexNumber u, int ldu,
                     IComplexNumber v, int ldv,
                     IComplexNumber q, int ldq,
                     long iwork, long rwork,
                     IComplexNumber tau,
                     IComplexNumber work );
    int zggsvp_work( int matrix_layout, char jobu, char jobv,
                     char jobq, int m, int p,
                     int n, IComplexNumber a,
                     int lda, IComplexNumber b,
                     int ldb, double tola, double tolb,
                     long k, long l,
                     IComplexNumber u, int ldu,
                     IComplexNumber v, int ldv,
                     IComplexNumber q, int ldq,
                     long iwork, long rwork,
                     IComplexNumber tau,
                     IComplexNumber work );

    int sggsvp3_work( int matrix_layout, char jobu, char jobv,
                      char jobq, int m, int p,
                      int n, long a, int lda,
                      long b, int ldb, float tola,
                      float tolb, long k, long l,
                      long u, int ldu, long v,
                      int ldv, long q, int ldq,
                      long iwork, long tau,
                      long work, int lwork );
    int dggsvp3_work( int matrix_layout, char jobu, char jobv,
                      char jobq, int m, int p,
                      int n, long a, int lda,
                      long b, int ldb, double tola,
                      double tolb, long k, long l,
                      long u, int ldu, long v,
                      int ldv, long q, int ldq,
                      long iwork, long tau, long work,
                      int lwork );
    int cggsvp3_work( int matrix_layout, char jobu, char jobv,
                      char jobq, int m, int p,
                      int n, IComplexNumber a,
                      int lda, IComplexNumber b,
                      int ldb, float tola, float tolb,
                      long k, long l,
                      IComplexNumber u, int ldu,
                      IComplexNumber v, int ldv,
                      IComplexNumber q, int ldq,
                      long iwork, long rwork,
                      IComplexNumber tau,
                      IComplexNumber work, int lwork );
    int zggsvp3_work( int matrix_layout, char jobu, char jobv,
                      char jobq, int m, int p,
                      int n, IComplexNumber a,
                      int lda, IComplexNumber b,
                      int ldb, double tola, double tolb,
                      long k, long l,
                      IComplexNumber u, int ldu,
                      IComplexNumber v, int ldv,
                      IComplexNumber q, int ldq,
                      long iwork, long rwork,
                      IComplexNumber tau,
                      IComplexNumber work, int lwork );

    int sgtcon_work( char norm, int n, final long dl,
                     final long d, final long du,
                     final long du2, final long ipiv,
                     float anorm, long rcond, long work,
                     long iwork );
    int dgtcon_work( char norm, int n, final long dl,
                     final long d, final long du,
                     final long du2, final long ipiv,
                     double anorm, long rcond, long work,
                     long iwork );
    int cgtcon_work( char norm, int n,
                     final IComplexNumber dl,
                     final IComplexNumber d,
                     final IComplexNumber du,
                     final IComplexNumber du2,
                     final long ipiv, float anorm,
                     long rcond, IComplexNumber work );
    int zgtcon_work( char norm, int n,
                     final IComplexNumber dl,
                     final IComplexNumber d,
                     final IComplexNumber du,
                     final IComplexNumber du2,
                     final long ipiv, double anorm,
                     long rcond, IComplexNumber work );

    int sgtrfs_work( int matrix_layout, char trans, int n,
                     int nrhs, final long dl,
                     final long d, final long du,
                     final long dlf, final long df,
                     final long duf, final long du2,
                     final long ipiv, final long b,
                     int ldb, long x, int ldx,
                     long ferr, long berr, long work,
                     long iwork );
    int dgtrfs_work( int matrix_layout, char trans, int n,
                     int nrhs, final long dl,
                     final long d, final long du,
                     final long dlf, final long df,
                     final long duf, final long du2,
                     final long ipiv, final long b,
                     int ldb, long x, int ldx,
                     long ferr, long berr, long work,
                     long iwork );
    int cgtrfs_work( int matrix_layout, char trans, int n,
                     int nrhs, final IComplexNumber dl,
                     final IComplexNumber d,
                     final IComplexNumber du,
                     final IComplexNumber dlf,
                     final IComplexNumber df,
                     final IComplexNumber duf,
                     final IComplexNumber du2,
                     final long ipiv,
                     final IComplexNumber b, int ldb,
                     IComplexNumber x, int ldx,
                     long ferr, long berr,
                     IComplexNumber work, long rwork );
    int zgtrfs_work( int matrix_layout, char trans, int n,
                     int nrhs,
                     final IComplexNumber dl,
                     final IComplexNumber d,
                     final IComplexNumber du,
                     final IComplexNumber dlf,
                     final IComplexNumber df,
                     final IComplexNumber duf,
                     final IComplexNumber du2,
                     final long ipiv,
                     final IComplexNumber b, int ldb,
                     IComplexNumber x, int ldx,
                     long ferr, long berr,
                     IComplexNumber work, long rwork );

    int sgtsv_work( int matrix_layout, int n, int nrhs,
                    long dl, long d, long du, long b,
                    int ldb );
    int dgtsv_work( int matrix_layout, int n, int nrhs,
                    long dl, long d, long du, long b,
                    int ldb );
    int cgtsv_work( int matrix_layout, int n, int nrhs,
                    IComplexNumber dl,
                    IComplexNumber d,
                    IComplexNumber du,
                    IComplexNumber b, int ldb );
    int zgtsv_work( int matrix_layout, int n, int nrhs,
                    IComplexNumber dl,
                    IComplexNumber d,
                    IComplexNumber du,
                    IComplexNumber b, int ldb );

    int sgtsvx_work( int matrix_layout, char fact, char trans,
                     int n, int nrhs, final long dl,
                     final long d, final long du, long dlf,
                     long df, long duf, long du2,
                     long ipiv, final long b,
                     int ldb, long x, int ldx,
                     long rcond, long ferr, long berr,
                     long work, long iwork );
    int dgtsvx_work( int matrix_layout, char fact, char trans,
                     int n, int nrhs, final long dl,
                     final long d, final long du, long dlf,
                     long df, long duf, long du2,
                     long ipiv, final long b,
                     int ldb, long x, int ldx,
                     long rcond, long ferr, long berr,
                     long work, long iwork );
    int cgtsvx_work( int matrix_layout, char fact, char trans,
                     int n, int nrhs,
                     final IComplexNumber dl,
                     final IComplexNumber d,
                     final IComplexNumber du,
                     IComplexNumber dlf,
                     IComplexNumber df,
                     IComplexNumber duf,
                     IComplexNumber du2, long ipiv,
                     final IComplexNumber b, int ldb,
                     IComplexNumber x, int ldx,
                     long rcond, long ferr, long berr,
                     IComplexNumber work, long rwork );
    int zgtsvx_work( int matrix_layout, char fact, char trans,
                     int n, int nrhs,
                     final IComplexNumber dl,
                     final IComplexNumber d,
                     final IComplexNumber du,
                     IComplexNumber dlf,
                     IComplexNumber df,
                     IComplexNumber duf,
                     IComplexNumber du2, long ipiv,
                     final IComplexNumber b, int ldb,
                     IComplexNumber x, int ldx,
                     long rcond, long ferr, long berr,
                     IComplexNumber work, long rwork );

    int sgttrf_work( int n, long dl, long d, long du,
                     long du2, long ipiv );
    int dgttrf_work( int n, long dl, long d, long du,
                     long du2, long ipiv );
    int cgttrf_work( int n, IComplexNumber dl,
                     IComplexNumber d,
                     IComplexNumber du,
                     IComplexNumber du2, long ipiv );
    int zgttrf_work( int n, IComplexNumber dl,
                     IComplexNumber d,
                     IComplexNumber du,
                     IComplexNumber du2, long ipiv );

    int sgttrs_work( int matrix_layout, char trans, int n,
                     int nrhs, final long dl,
                     final long d, final long du,
                     final long du2, final long ipiv,
                     long b, int ldb );
    int dgttrs_work( int matrix_layout, char trans, int n,
                     int nrhs, final long dl,
                     final long d, final long du,
                     final long du2, final long ipiv,
                     long b, int ldb );
    int cgttrs_work( int matrix_layout, char trans, int n,
                     int nrhs, final IComplexNumber dl,
                     final IComplexNumber d,
                     final IComplexNumber du,
                     final IComplexNumber du2,
                     final long ipiv, IComplexNumber b,
                     int ldb );
    int zgttrs_work( int matrix_layout, char trans, int n,
                     int nrhs,
                     final IComplexNumber dl,
                     final IComplexNumber d,
                     final IComplexNumber du,
                     final IComplexNumber du2,
                     final long ipiv,
                     IComplexNumber b, int ldb );

    int chbev_work( int matrix_layout, char jobz, char uplo,
                    int n, int kd,
                    IComplexNumber ab, int ldab,
                    long w, IComplexNumber z,
                    int ldz, IComplexNumber work,
                    long rwork );
    int zhbev_work( int matrix_layout, char jobz, char uplo,
                    int n, int kd,
                    IComplexNumber ab, int ldab,
                    long w, IComplexNumber z,
                    int ldz, IComplexNumber work,
                    long rwork );

    int chbevd_work( int matrix_layout, char jobz, char uplo,
                     int n, int kd,
                     IComplexNumber ab, int ldab,
                     long w, IComplexNumber z,
                     int ldz, IComplexNumber work,
                     int lwork, long rwork,
                     int lrwork, long iwork,
                     int liwork );
    int zhbevd_work( int matrix_layout, char jobz, char uplo,
                     int n, int kd,
                     IComplexNumber ab, int ldab,
                     long w, IComplexNumber z,
                     int ldz, IComplexNumber work,
                     int lwork, long rwork,
                     int lrwork, long iwork,
                     int liwork );

    int chbevx_work( int matrix_layout, char jobz, char range,
                     char uplo, int n, int kd,
                     IComplexNumber ab, int ldab,
                     IComplexNumber q, int ldq,
                     float vl, float vu, int il,
                     int iu, float abstol, long m,
                     long w, IComplexNumber z,
                     int ldz, IComplexNumber work,
                     long rwork, long iwork,
                     long ifail );
    int zhbevx_work( int matrix_layout, char jobz, char range,
                     char uplo, int n, int kd,
                     IComplexNumber ab, int ldab,
                     IComplexNumber q, int ldq,
                     double vl, double vu, int il,
                     int iu, double abstol, long m,
                     long w, IComplexNumber z,
                     int ldz, IComplexNumber work,
                     long rwork, long iwork,
                     long ifail );

    int chbgst_work( int matrix_layout, char vect, char uplo,
                     int n, int ka, int kb,
                     IComplexNumber ab, int ldab,
                     final IComplexNumber bb, int ldbb,
                     IComplexNumber x, int ldx,
                     IComplexNumber work, long rwork );
    int zhbgst_work( int matrix_layout, char vect, char uplo,
                     int n, int ka, int kb,
                     IComplexNumber ab, int ldab,
                     final IComplexNumber bb,
                     int ldbb, IComplexNumber x,
                     int ldx, IComplexNumber work,
                     long rwork );

    int chbgv_work( int matrix_layout, char jobz, char uplo,
                    int n, int ka, int kb,
                    IComplexNumber ab, int ldab,
                    IComplexNumber bb, int ldbb,
                    long w, IComplexNumber z,
                    int ldz, IComplexNumber work,
                    long rwork );
    int zhbgv_work( int matrix_layout, char jobz, char uplo,
                    int n, int ka, int kb,
                    IComplexNumber ab, int ldab,
                    IComplexNumber bb, int ldbb,
                    long w, IComplexNumber z,
                    int ldz, IComplexNumber work,
                    long rwork );

    int chbgvd_work( int matrix_layout, char jobz, char uplo,
                     int n, int ka, int kb,
                     IComplexNumber ab, int ldab,
                     IComplexNumber bb, int ldbb,
                     long w, IComplexNumber z,
                     int ldz, IComplexNumber work,
                     int lwork, long rwork,
                     int lrwork, long iwork,
                     int liwork );
    int zhbgvd_work( int matrix_layout, char jobz, char uplo,
                     int n, int ka, int kb,
                     IComplexNumber ab, int ldab,
                     IComplexNumber bb, int ldbb,
                     long w, IComplexNumber z,
                     int ldz, IComplexNumber work,
                     int lwork, long rwork,
                     int lrwork, long iwork,
                     int liwork );

    int chbgvx_work( int matrix_layout, char jobz, char range,
                     char uplo, int n, int ka,
                     int kb, IComplexNumber ab,
                     int ldab, IComplexNumber bb,
                     int ldbb, IComplexNumber q,
                     int ldq, float vl, float vu,
                     int il, int iu, float abstol,
                     long m, long w,
                     IComplexNumber z, int ldz,
                     IComplexNumber work, long rwork,
                     long iwork, long ifail );
    int zhbgvx_work( int matrix_layout, char jobz, char range,
                     char uplo, int n, int ka,
                     int kb, IComplexNumber ab,
                     int ldab, IComplexNumber bb,
                     int ldbb, IComplexNumber q,
                     int ldq, double vl, double vu,
                     int il, int iu, double abstol,
                     long m, long w,
                     IComplexNumber z, int ldz,
                     IComplexNumber work, long rwork,
                     long iwork, long ifail );

    int chbtrd_work( int matrix_layout, char vect, char uplo,
                     int n, int kd,
                     IComplexNumber ab, int ldab,
                     long d, long e, IComplexNumber q,
                     int ldq, IComplexNumber work );
    int zhbtrd_work( int matrix_layout, char vect, char uplo,
                     int n, int kd,
                     IComplexNumber ab, int ldab,
                     long d, long e, IComplexNumber q,
                     int ldq, IComplexNumber work );

    int checon_work( int matrix_layout, char uplo, int n,
                     final IComplexNumber a, int lda,
                     final long ipiv, float anorm,
                     long rcond, IComplexNumber work );
    int zhecon_work( int matrix_layout, char uplo, int n,
                     final IComplexNumber a, int lda,
                     final long ipiv, double anorm,
                     long rcond, IComplexNumber work );

    int cheequb_work( int matrix_layout, char uplo, int n,
                      final IComplexNumber a, int lda,
                      long s, long scond, long amax,
                      IComplexNumber work );
    int zheequb_work( int matrix_layout, char uplo, int n,
                      final IComplexNumber a, int lda,
                      long s, long scond, long amax,
                      IComplexNumber work );

    int cheev_work( int matrix_layout, char jobz, char uplo,
                    int n, IComplexNumber a,
                    int lda, long w,
                    IComplexNumber work, int lwork,
                    long rwork );
    int zheev_work( int matrix_layout, char jobz, char uplo,
                    int n, IComplexNumber a,
                    int lda, long w,
                    IComplexNumber work, int lwork,
                    long rwork );

    int cheevd_work( int matrix_layout, char jobz, char uplo,
                     int n, IComplexNumber a,
                     int lda, long w,
                     IComplexNumber work, int lwork,
                     long rwork, int lrwork,
                     long iwork, int liwork );
    int zheevd_work( int matrix_layout, char jobz, char uplo,
                     int n, IComplexNumber a,
                     int lda, long w,
                     IComplexNumber work, int lwork,
                     long rwork, int lrwork,
                     long iwork, int liwork );

    int cheevr_work( int matrix_layout, char jobz, char range,
                     char uplo, int n,
                     IComplexNumber a, int lda,
                     float vl, float vu, int il,
                     int iu, float abstol, long m,
                     long w, IComplexNumber z,
                     int ldz, long isuppz,
                     IComplexNumber work, int lwork,
                     long rwork, int lrwork,
                     long iwork, int liwork );
    int zheevr_work( int matrix_layout, char jobz, char range,
                     char uplo, int n,
                     IComplexNumber a, int lda,
                     double vl, double vu, int il,
                     int iu, double abstol, long m,
                     long w, IComplexNumber z,
                     int ldz, long isuppz,
                     IComplexNumber work, int lwork,
                     long rwork, int lrwork,
                     long iwork, int liwork );

    int cheevx_work( int matrix_layout, char jobz, char range,
                     char uplo, int n,
                     IComplexNumber a, int lda,
                     float vl, float vu, int il,
                     int iu, float abstol, long m,
                     long w, IComplexNumber z,
                     int ldz, IComplexNumber work,
                     int lwork, long rwork,
                     long iwork, long ifail );
    int zheevx_work( int matrix_layout, char jobz, char range,
                     char uplo, int n,
                     IComplexNumber a, int lda,
                     double vl, double vu, int il,
                     int iu, double abstol, long m,
                     long w, IComplexNumber z,
                     int ldz, IComplexNumber work,
                     int lwork, long rwork,
                     long iwork, long ifail );

    int chegst_work( int matrix_layout, int itype, char uplo,
                     int n, IComplexNumber a,
                     int lda, final IComplexNumber b,
                     int ldb );
    int zhegst_work( int matrix_layout, int itype, char uplo,
                     int n, IComplexNumber a,
                     int lda, final IComplexNumber b,
                     int ldb );

    int chegv_work( int matrix_layout, int itype, char jobz,
                    char uplo, int n, IComplexNumber a,
                    int lda, IComplexNumber b,
                    int ldb, long w,
                    IComplexNumber work, int lwork,
                    long rwork );
    int zhegv_work( int matrix_layout, int itype, char jobz,
                    char uplo, int n,
                    IComplexNumber a, int lda,
                    IComplexNumber b, int ldb,
                    long w, IComplexNumber work,
                    int lwork, long rwork );

    int chegvd_work( int matrix_layout, int itype, char jobz,
                     char uplo, int n,
                     IComplexNumber a, int lda,
                     IComplexNumber b, int ldb,
                     long w, IComplexNumber work,
                     int lwork, long rwork,
                     int lrwork, long iwork,
                     int liwork );
    int zhegvd_work( int matrix_layout, int itype, char jobz,
                     char uplo, int n,
                     IComplexNumber a, int lda,
                     IComplexNumber b, int ldb,
                     long w, IComplexNumber work,
                     int lwork, long rwork,
                     int lrwork, long iwork,
                     int liwork );

    int chegvx_work( int matrix_layout, int itype, char jobz,
                     char range, char uplo, int n,
                     IComplexNumber a, int lda,
                     IComplexNumber b, int ldb,
                     float vl, float vu, int il,
                     int iu, float abstol, long m,
                     long w, IComplexNumber z,
                     int ldz, IComplexNumber work,
                     int lwork, long rwork,
                     long iwork, long ifail );
    int zhegvx_work( int matrix_layout, int itype, char jobz,
                     char range, char uplo, int n,
                     IComplexNumber a, int lda,
                     IComplexNumber b, int ldb,
                     double vl, double vu, int il,
                     int iu, double abstol, long m,
                     long w, IComplexNumber z,
                     int ldz, IComplexNumber work,
                     int lwork, long rwork,
                     long iwork, long ifail );

    int cherfs_work( int matrix_layout, char uplo, int n,
                     int nrhs, final IComplexNumber a,
                     int lda, final IComplexNumber af,
                     int ldaf, final long ipiv,
                     final IComplexNumber b, int ldb,
                     IComplexNumber x, int ldx,
                     long ferr, long berr,
                     IComplexNumber work, long rwork );
    int zherfs_work( int matrix_layout, char uplo, int n,
                     int nrhs, final IComplexNumber a,
                     int lda, final IComplexNumber af,
                     int ldaf, final long ipiv,
                     final IComplexNumber b, int ldb,
                     IComplexNumber x, int ldx,
                     long ferr, long berr,
                     IComplexNumber work, long rwork );

    int cherfsx_work( int matrix_layout, char uplo, char equed,
                      int n, int nrhs,
                      final IComplexNumber a, int lda,
                      final IComplexNumber af,
                      int ldaf, final long ipiv,
                      final long s, final IComplexNumber b,
                      int ldb, IComplexNumber x,
                      int ldx, long rcond, long berr,
                      int n_err_bnds, long err_bnds_norm,
                      long err_bnds_comp, int nparams,
                      long params, IComplexNumber work,
                      long rwork );
    int zherfsx_work( int matrix_layout, char uplo, char equed,
                      int n, int nrhs,
                      final IComplexNumber a, int lda,
                      final IComplexNumber af,
                      int ldaf, final long ipiv,
                      final long s,
                      final IComplexNumber b, int ldb,
                      IComplexNumber x, int ldx,
                      long rcond, long berr,
                      int n_err_bnds, long err_bnds_norm,
                      long err_bnds_comp, int nparams,
                      long params, IComplexNumber work,
                      long rwork );

    int chesv_work( int matrix_layout, char uplo, int n,
                    int nrhs, IComplexNumber a,
                    int lda, long ipiv,
                    IComplexNumber b, int ldb,
                    IComplexNumber work, int lwork );
    int zhesv_work( int matrix_layout, char uplo, int n,
                    int nrhs, IComplexNumber a,
                    int lda, long ipiv,
                    IComplexNumber b, int ldb,
                    IComplexNumber work, int lwork );

    int chesvx_work( int matrix_layout, char fact, char uplo,
                     int n, int nrhs,
                     final IComplexNumber a, int lda,
                     IComplexNumber af, int ldaf,
                     long ipiv, final IComplexNumber b,
                     int ldb, IComplexNumber x,
                     int ldx, long rcond, long ferr,
                     long berr, IComplexNumber work,
                     int lwork, long rwork );
    int zhesvx_work( int matrix_layout, char fact, char uplo,
                     int n, int nrhs,
                     final IComplexNumber a, int lda,
                     IComplexNumber af, int ldaf,
                     long ipiv,
                     final IComplexNumber b, int ldb,
                     IComplexNumber x, int ldx,
                     long rcond, long ferr, long berr,
                     IComplexNumber work, int lwork,
                     long rwork );

    int chesvxx_work( int matrix_layout, char fact, char uplo,
                      int n, int nrhs,
                      IComplexNumber a, int lda,
                      IComplexNumber af, int ldaf,
                      long ipiv, long equed, long s,
                      IComplexNumber b, int ldb,
                      IComplexNumber x, int ldx,
                      long rcond, long rpvgrw, long berr,
                      int n_err_bnds, long err_bnds_norm,
                      long err_bnds_comp, int nparams,
                      long params, IComplexNumber work,
                      long rwork );
    int zhesvxx_work( int matrix_layout, char fact, char uplo,
                      int n, int nrhs,
                      IComplexNumber a, int lda,
                      IComplexNumber af, int ldaf,
                      long ipiv, long equed, long s,
                      IComplexNumber b, int ldb,
                      IComplexNumber x, int ldx,
                      long rcond, long rpvgrw, long berr,
                      int n_err_bnds, long err_bnds_norm,
                      long err_bnds_comp, int nparams,
                      long params, IComplexNumber work,
                      long rwork );

    int chetrd_work( int matrix_layout, char uplo, int n,
                     IComplexNumber a, int lda,
                     long d, long e, IComplexNumber tau,
                     IComplexNumber work, int lwork );
    int zhetrd_work( int matrix_layout, char uplo, int n,
                     IComplexNumber a, int lda,
                     long d, long e,
                     IComplexNumber tau,
                     IComplexNumber work, int lwork );

    int chetrf_work( int matrix_layout, char uplo, int n,
                     IComplexNumber a, int lda,
                     long ipiv, IComplexNumber work,
                     int lwork );
    int zhetrf_work( int matrix_layout, char uplo, int n,
                     IComplexNumber a, int lda,
                     long ipiv, IComplexNumber work,
                     int lwork );

    int chetri_work( int matrix_layout, char uplo, int n,
                     IComplexNumber a, int lda,
                     final long ipiv,
                     IComplexNumber work );
    int zhetri_work( int matrix_layout, char uplo, int n,
                     IComplexNumber a, int lda,
                     final long ipiv,
                     IComplexNumber work );

    int chetrs_work( int matrix_layout, char uplo, int n,
                     int nrhs, final IComplexNumber a,
                     int lda, final long ipiv,
                     IComplexNumber b, int ldb );
    int zhetrs_work( int matrix_layout, char uplo, int n,
                     int nrhs, final IComplexNumber a,
                     int lda, final long ipiv,
                     IComplexNumber b, int ldb );

    int chfrk_work( int matrix_layout, char transr, char uplo,
                    char trans, int n, int k,
                    float alpha, final IComplexNumber a,
                    int lda, float beta,
                    IComplexNumber c );
    int zhfrk_work( int matrix_layout, char transr, char uplo,
                    char trans, int n, int k,
                    double alpha, final IComplexNumber a,
                    int lda, double beta,
                    IComplexNumber c );

    int shgeqz_work( int matrix_layout, char job, char compq,
                     char compz, int n, int ilo,
                     int ihi, long h, int ldh,
                     long t, int ldt, long alphar,
                     long alphai, long beta, long q,
                     int ldq, long z, int ldz,
                     long work, int lwork );
    int dhgeqz_work( int matrix_layout, char job, char compq,
                     char compz, int n, int ilo,
                     int ihi, long h, int ldh,
                     long t, int ldt, long alphar,
                     long alphai, long beta, long q,
                     int ldq, long z, int ldz,
                     long work, int lwork );
    int chgeqz_work( int matrix_layout, char job, char compq,
                     char compz, int n, int ilo,
                     int ihi, IComplexNumber h,
                     int ldh, IComplexNumber t,
                     int ldt, IComplexNumber alpha,
                     IComplexNumber beta,
                     IComplexNumber q, int ldq,
                     IComplexNumber z, int ldz,
                     IComplexNumber work, int lwork,
                     long rwork );
    int zhgeqz_work( int matrix_layout, char job, char compq,
                     char compz, int n, int ilo,
                     int ihi, IComplexNumber h,
                     int ldh, IComplexNumber t,
                     int ldt, IComplexNumber alpha,
                     IComplexNumber beta,
                     IComplexNumber q, int ldq,
                     IComplexNumber z, int ldz,
                     IComplexNumber work, int lwork,
                     long rwork );

    int chpcon_work( int matrix_layout, char uplo, int n,
                     final IComplexNumber ap,
                     final long ipiv, float anorm,
                     long rcond, IComplexNumber work );
    int zhpcon_work( int matrix_layout, char uplo, int n,
                     final IComplexNumber ap,
                     final long ipiv, double anorm,
                     long rcond, IComplexNumber work );

    int chpev_work( int matrix_layout, char jobz, char uplo,
                    int n, IComplexNumber ap, long w,
                    IComplexNumber z, int ldz,
                    IComplexNumber work, long rwork );
    int zhpev_work( int matrix_layout, char jobz, char uplo,
                    int n, IComplexNumber ap,
                    long w, IComplexNumber z,
                    int ldz, IComplexNumber work,
                    long rwork );

    int chpevd_work( int matrix_layout, char jobz, char uplo,
                     int n, IComplexNumber ap,
                     long w, IComplexNumber z,
                     int ldz, IComplexNumber work,
                     int lwork, long rwork,
                     int lrwork, long iwork,
                     int liwork );
    int zhpevd_work( int matrix_layout, char jobz, char uplo,
                     int n, IComplexNumber ap,
                     long w, IComplexNumber z,
                     int ldz, IComplexNumber work,
                     int lwork, long rwork,
                     int lrwork, long iwork,
                     int liwork );

    int chpevx_work( int matrix_layout, char jobz, char range,
                     char uplo, int n,
                     IComplexNumber ap, float vl, float vu,
                     int il, int iu, float abstol,
                     long m, long w,
                     IComplexNumber z, int ldz,
                     IComplexNumber work, long rwork,
                     long iwork, long ifail );
    int zhpevx_work( int matrix_layout, char jobz, char range,
                     char uplo, int n,
                     IComplexNumber ap, double vl, double vu,
                     int il, int iu, double abstol,
                     long m, long w,
                     IComplexNumber z, int ldz,
                     IComplexNumber work, long rwork,
                     long iwork, long ifail );

    int chpgst_work( int matrix_layout, int itype, char uplo,
                     int n, IComplexNumber ap,
                     final IComplexNumber bp );
    int zhpgst_work( int matrix_layout, int itype, char uplo,
                     int n, IComplexNumber ap,
                     final IComplexNumber bp );

    int chpgv_work( int matrix_layout, int itype, char jobz,
                    char uplo, int n,
                    IComplexNumber ap,
                    IComplexNumber bp, long w,
                    IComplexNumber z, int ldz,
                    IComplexNumber work, long rwork );
    int zhpgv_work( int matrix_layout, int itype, char jobz,
                    char uplo, int n,
                    IComplexNumber ap,
                    IComplexNumber bp, long w,
                    IComplexNumber z, int ldz,
                    IComplexNumber work, long rwork );

    int chpgvd_work( int matrix_layout, int itype, char jobz,
                     char uplo, int n,
                     IComplexNumber ap,
                     IComplexNumber bp, long w,
                     IComplexNumber z, int ldz,
                     IComplexNumber work, int lwork,
                     long rwork, int lrwork,
                     long iwork, int liwork );
    int zhpgvd_work( int matrix_layout, int itype, char jobz,
                     char uplo, int n,
                     IComplexNumber ap,
                     IComplexNumber bp, long w,
                     IComplexNumber z, int ldz,
                     IComplexNumber work, int lwork,
                     long rwork, int lrwork,
                     long iwork, int liwork );

    int chpgvx_work( int matrix_layout, int itype, char jobz,
                     char range, char uplo, int n,
                     IComplexNumber ap,
                     IComplexNumber bp, float vl, float vu,
                     int il, int iu, float abstol,
                     long m, long w,
                     IComplexNumber z, int ldz,
                     IComplexNumber work, long rwork,
                     long iwork, long ifail );
    int zhpgvx_work( int matrix_layout, int itype, char jobz,
                     char range, char uplo, int n,
                     IComplexNumber ap,
                     IComplexNumber bp, double vl, double vu,
                     int il, int iu, double abstol,
                     long m, long w,
                     IComplexNumber z, int ldz,
                     IComplexNumber work, long rwork,
                     long iwork, long ifail );

    int chprfs_work( int matrix_layout, char uplo, int n,
                     int nrhs, final IComplexNumber ap,
                     final IComplexNumber afp,
                     final long ipiv,
                     final IComplexNumber b, int ldb,
                     IComplexNumber x, int ldx,
                     long ferr, long berr,
                     IComplexNumber work, long rwork );
    int zhprfs_work( int matrix_layout, char uplo, int n,
                     int nrhs,
                     final IComplexNumber ap,
                     final IComplexNumber afp,
                     final long ipiv,
                     final IComplexNumber b, int ldb,
                     IComplexNumber x, int ldx,
                     long ferr, long berr,
                     IComplexNumber work, long rwork );

    int chpsv_work( int matrix_layout, char uplo, int n,
                    int nrhs, IComplexNumber ap,
                    long ipiv, IComplexNumber b,
                    int ldb );
    int zhpsv_work( int matrix_layout, char uplo, int n,
                    int nrhs, IComplexNumber ap,
                    long ipiv, IComplexNumber b,
                    int ldb );

    int chpsvx_work( int matrix_layout, char fact, char uplo,
                     int n, int nrhs,
                     final IComplexNumber ap,
                     IComplexNumber afp, long ipiv,
                     final IComplexNumber b, int ldb,
                     IComplexNumber x, int ldx,
                     long rcond, long ferr, long berr,
                     IComplexNumber work, long rwork );
    int zhpsvx_work( int matrix_layout, char fact, char uplo,
                     int n, int nrhs,
                     final IComplexNumber ap,
                     IComplexNumber afp, long ipiv,
                     final IComplexNumber b, int ldb,
                     IComplexNumber x, int ldx,
                     long rcond, long ferr, long berr,
                     IComplexNumber work, long rwork );

    int chptrd_work( int matrix_layout, char uplo, int n,
                     IComplexNumber ap, long d, long e,
                     IComplexNumber tau );
    int zhptrd_work( int matrix_layout, char uplo, int n,
                     IComplexNumber ap, long d, long e,
                     IComplexNumber tau );

    int chptrf_work( int matrix_layout, char uplo, int n,
                     IComplexNumber ap, long ipiv );
    int zhptrf_work( int matrix_layout, char uplo, int n,
                     IComplexNumber ap, long ipiv );

    int chptri_work( int matrix_layout, char uplo, int n,
                     IComplexNumber ap,
                     final long ipiv,
                     IComplexNumber work );
    int zhptri_work( int matrix_layout, char uplo, int n,
                     IComplexNumber ap,
                     final long ipiv,
                     IComplexNumber work );

    int chptrs_work( int matrix_layout, char uplo, int n,
                     int nrhs, final IComplexNumber ap,
                     final long ipiv, IComplexNumber b,
                     int ldb );
    int zhptrs_work( int matrix_layout, char uplo, int n,
                     int nrhs,
                     final IComplexNumber ap,
                     final long ipiv,
                     IComplexNumber b, int ldb );

    int shsein_work( int matrix_layout, char job, char eigsrc,
                     char initv,long  select,
                     int n, final long h, int ldh,
                     long wr, final long wi, long vl,
                     int ldvl, long vr, int ldvr,
                     int mm, long m, long work,
                     long ifaill, long ifailr );
    int dhsein_work( int matrix_layout, char job, char eigsrc,
                     char initv,long  select,
                     int n, final long h, int ldh,
                     long wr, final long wi, long vl,
                     int ldvl, long vr, int ldvr,
                     int mm, long m, long work,
                     long ifaill, long ifailr );
    int chsein_work( int matrix_layout, char job, char eigsrc,
                     char initv, long   select,
                     int n, final IComplexNumber h,
                     int ldh, IComplexNumber w,
                     IComplexNumber vl, int ldvl,
                     IComplexNumber vr, int ldvr,
                     int mm, long m,
                     IComplexNumber work, long rwork,
                     long ifaill, long ifailr );
    int zhsein_work( int matrix_layout, char job, char eigsrc,
                     char initv, long   select,
                     int n, final IComplexNumber h,
                     int ldh, IComplexNumber w,
                     IComplexNumber vl, int ldvl,
                     IComplexNumber vr, int ldvr,
                     int mm, long m,
                     IComplexNumber work, long rwork,
                     long ifaill, long ifailr );

    int shseqr_work( int matrix_layout, char job, char compz,
                     int n, int ilo, int ihi,
                     long h, int ldh, long wr, long wi,
                     long z, int ldz, long work,
                     int lwork );
    int dhseqr_work( int matrix_layout, char job, char compz,
                     int n, int ilo, int ihi,
                     long h, int ldh, long wr,
                     long wi, long z, int ldz,
                     long work, int lwork );
    int chseqr_work( int matrix_layout, char job, char compz,
                     int n, int ilo, int ihi,
                     IComplexNumber h, int ldh,
                     IComplexNumber w,
                     IComplexNumber z, int ldz,
                     IComplexNumber work, int lwork );
    int zhseqr_work( int matrix_layout, char job, char compz,
                     int n, int ilo, int ihi,
                     IComplexNumber h, int ldh,
                     IComplexNumber w,
                     IComplexNumber z, int ldz,
                     IComplexNumber work, int lwork );

    int clacgv_work( int n, IComplexNumber x,
                     int incx );
    int zlacgv_work( int n, IComplexNumber x,
                     int incx );

    int slacn2_work( int n, long v, long x,
                     long isgn, long est, long kase,
                     long isave );
    int dlacn2_work( int n, long v, long x,
                     long isgn, long est, long kase,
                     long isave );
    int clacn2_work( int n, IComplexNumber v,
                     IComplexNumber x,
                     long est, long kase,
                     long isave );
    int zlacn2_work( int n, IComplexNumber v,
                     IComplexNumber x,
                     long est, long kase,
                     long isave );

    int slacpy_work( int matrix_layout, char uplo, int m,
                     int n, final long a, int lda,
                     long b, int ldb );
    int dlacpy_work( int matrix_layout, char uplo, int m,
                     int n, final long a, int lda,
                     long b, int ldb );
    int clacpy_work( int matrix_layout, char uplo, int m,
                     int n, final IComplexNumber a,
                     int lda, IComplexNumber b,
                     int ldb );
    int zlacpy_work( int matrix_layout, char uplo, int m,
                     int n, final IComplexNumber a,
                     int lda, IComplexNumber b,
                     int ldb );

    int clacp2_work( int matrix_layout, char uplo, int m,
                     int n, final long a, int lda,
                     IComplexNumber b, int ldb );
    int zlacp2_work( int matrix_layout, char uplo, int m,
                     int n, final long a, int lda,
                     IComplexNumber b, int ldb );

    int zlag2c_work( int matrix_layout, int m, int n,
                     final IComplexNumber a, int lda,
                     IComplexNumber sa, int ldsa );

    int slag2d_work( int matrix_layout, int m, int n,
                     final long sa, int ldsa, long a,
                     int lda );

    int dlag2s_work( int matrix_layout, int m, int n,
                     final long a, int lda, long sa,
                     int ldsa );

    int clag2z_work( int matrix_layout, int m, int n,
                     final IComplexNumber sa, int ldsa,
                     IComplexNumber a, int lda );

    int slagge_work( int matrix_layout, int m, int n,
                     int kl, int ku, final long d,
                     long a, int lda, long iseed,
                     long work );
    int dlagge_work( int matrix_layout, int m, int n,
                     int kl, int ku, final long d,
                     long a, int lda, long iseed,
                     long work );
    int clagge_work( int matrix_layout, int m, int n,
                     int kl, int ku, final long d,
                     IComplexNumber a, int lda,
                     long iseed, IComplexNumber work );
    int zlagge_work( int matrix_layout, int m, int n,
                     int kl, int ku, final long d,
                     IComplexNumber a, int lda,
                     long iseed,
                     IComplexNumber work );

    int claghe_work( int matrix_layout, int n, int k,
                     final long d, IComplexNumber a,
                     int lda, long iseed,
                     IComplexNumber work );
    int zlaghe_work( int matrix_layout, int n, int k,
                     final long d, IComplexNumber a,
                     int lda, long iseed,
                     IComplexNumber work );

    int slagsy_work( int matrix_layout, int n, int k,
                     final long d, long a, int lda,
                     long iseed, long work );
    int dlagsy_work( int matrix_layout, int n, int k,
                     final long d, long a, int lda,
                     long iseed, long work );
    int clagsy_work( int matrix_layout, int n, int k,
                     final long d, IComplexNumber a,
                     int lda, long iseed,
                     IComplexNumber work );
    int zlagsy_work( int matrix_layout, int n, int k,
                     final long d, IComplexNumber a,
                     int lda, long iseed,
                     IComplexNumber work );

    int slapmr_work( int matrix_layout,boolean forwrd,
                     int m, int n, long x,
                     int ldx, long k );
    int dlapmr_work( int matrix_layout,boolean forwrd,
                     int m, int n, long x,
                     int ldx, long k );
    int clapmr_work( int matrix_layout,boolean forwrd,
                     int m, int n,
                     IComplexNumber x, int ldx,
                     long k );
    int zlapmr_work( int matrix_layout,boolean forwrd,
                     int m, int n,
                     IComplexNumber x, int ldx,
                     long k );

    int slapmt_work( int matrix_layout,boolean forwrd,
                     int m, int n, long x,
                     int ldx, long k );
    int dlapmt_work( int matrix_layout,boolean forwrd,
                     int m, int n, long x,
                     int ldx, long k );
    int clapmt_work( int matrix_layout,boolean forwrd,
                     int m, int n,
                     IComplexNumber x, int ldx,
                     long k );
    int zlapmt_work( int matrix_layout,boolean forwrd,
                     int m, int n,
                     IComplexNumber x, int ldx,
                     long k );

    int slartgp_work( float f, float g, long cs, long sn,
                      long r );
    int dlartgp_work( double f, double g, long cs, long sn,
                      long r );

    int slartgs_work( float x, float y, float sigma, long cs,
                      long sn );
    int dlartgs_work( double x, double y, double sigma, long cs,
                      long sn );

    float slapy2_work( float x, float y );
    double dlapy2_work( double x, double y );

    float slapy3_work( float x, float y, float z );
    double dlapy3_work( double x, double y, double z );

    float slamch_work( char cmach );
    double dlamch_work( char cmach );

    float slange_work( int matrix_layout, char norm, int m,
                       int n, final long a, int lda,
                       long work );
    double dlange_work( int matrix_layout, char norm, int m,
                        int n, final long a, int lda,
                        long work );
    float clange_work( int matrix_layout, char norm, int m,
                       int n, final IComplexNumber a,
                       int lda, long work );
    double zlange_work( int matrix_layout, char norm, int m,
                        int n, final IComplexNumber a,
                        int lda, long work );

    float clanhe_work( int matrix_layout, char norm, char uplo,
                       int n, final IComplexNumber a,
                       int lda, long work );
    double zlanhe_work( int matrix_layout, char norm, char uplo,
                        int n, final IComplexNumber a,
                        int lda, long work );

    float slansy_work( int matrix_layout, char norm, char uplo,
                       int n, final long a, int lda,
                       long work );
    double dlansy_work( int matrix_layout, char norm, char uplo,
                        int n, final long a, int lda,
                        long work );
    float clansy_work( int matrix_layout, char norm, char uplo,
                       int n, final IComplexNumber a,
                       int lda, long work );
    double zlansy_work( int matrix_layout, char norm, char uplo,
                        int n, final IComplexNumber a,
                        int lda, long work );

    float slantr_work( int matrix_layout, char norm, char uplo,
                       char diag, int m, int n, final long a,
                       int lda, long work );
    double dlantr_work( int matrix_layout, char norm, char uplo,
                        char diag, int m, int n,
                        final long a, int lda, long work );
    float clantr_work( int matrix_layout, char norm, char uplo,
                       char diag, int m, int n,
                       final IComplexNumber a, int lda,
                       long work );
    double zlantr_work( int matrix_layout, char norm, char uplo,
                        char diag, int m, int n,
                        final IComplexNumber a, int lda,
                        long work );

    int slarfb_work( int matrix_layout, char side, char trans,
                     char direct, char storev, int m,
                     int n, int k, final long v,
                     int ldv, final long t, int ldt,
                     long c, int ldc, long work,
                     int ldwork );
    int dlarfb_work( int matrix_layout, char side, char trans,
                     char direct, char storev, int m,
                     int n, int k, final long v,
                     int ldv, final long t, int ldt,
                     long c, int ldc, long work,
                     int ldwork );
    int clarfb_work( int matrix_layout, char side, char trans,
                     char direct, char storev, int m,
                     int n, int k,
                     final IComplexNumber v, int ldv,
                     final IComplexNumber t, int ldt,
                     IComplexNumber c, int ldc,
                     IComplexNumber work, int ldwork );
    int zlarfb_work( int matrix_layout, char side, char trans,
                     char direct, char storev, int m,
                     int n, int k,
                     final IComplexNumber v, int ldv,
                     final IComplexNumber t, int ldt,
                     IComplexNumber c, int ldc,
                     IComplexNumber work,
                     int ldwork );

    int slarfg_work( int n, long alpha, long x,
                     int incx, long tau );
    int dlarfg_work( int n, long alpha, long x,
                     int incx, long tau );
    int clarfg_work( int n, IComplexNumber alpha,
                     IComplexNumber x, int incx,
                     IComplexNumber tau );
    int zlarfg_work( int n, IComplexNumber alpha,
                     IComplexNumber x, int incx,
                     IComplexNumber tau );

    int slarft_work( int matrix_layout, char direct, char storev,
                     int n, int k, final long v,
                     int ldv, final long tau, long t,
                     int ldt );
    int dlarft_work( int matrix_layout, char direct, char storev,
                     int n, int k, final long v,
                     int ldv, final long tau, long t,
                     int ldt );
    int clarft_work( int matrix_layout, char direct, char storev,
                     int n, int k,
                     final IComplexNumber v, int ldv,
                     final IComplexNumber tau,
                     IComplexNumber t, int ldt );
    int zlarft_work( int matrix_layout, char direct, char storev,
                     int n, int k,
                     final IComplexNumber v, int ldv,
                     final IComplexNumber tau,
                     IComplexNumber t, int ldt );

    int slarfx_work( int matrix_layout, char side, int m,
                     int n, final long v, float tau,
                     long c, int ldc, long work );
    int dlarfx_work( int matrix_layout, char side, int m,
                     int n, final long v, double tau,
                     long c, int ldc, long work );
    int clarfx_work( int matrix_layout, char side, int m,
                     int n, final IComplexNumber v,
                     IComplexNumber tau,
                     IComplexNumber c, int ldc,
                     IComplexNumber work );
    int zlarfx_work( int matrix_layout, char side, int m,
                     int n, final IComplexNumber v,
                     IComplexNumber tau,
                     IComplexNumber c, int ldc,
                     IComplexNumber work );

    int slarnv_work( int idist, long iseed,
                     int n, long x );
    int dlarnv_work( int idist, long iseed,
                     int n, long x );
    int clarnv_work( int idist, long iseed,
                     int n, IComplexNumber x );
    int zlarnv_work( int idist, long iseed,
                     int n, IComplexNumber x );


    int slascl_work( int matrix_layout, char type, int kl,
                     int ku, float cfrom, float cto,
                     int m, int n, long a,
                     int lda );
    int dlascl_work( int matrix_layout, char type, int kl,
                     int ku, double cfrom, double cto,
                     int m, int n, long a,
                     int lda );
    int clascl_work( int matrix_layout, char type, int kl,
                     int ku, float cfrom, float cto,
                     int m, int n, IComplexNumber a,
                     int lda );
    int zlascl_work( int matrix_layout, char type, int kl,
                     int ku, double cfrom, double cto,
                     int m, int n, IComplexNumber a,
                     int lda );

    int slaset_work( int matrix_layout, char uplo, int m,
                     int n, float alpha, float beta, long a,
                     int lda );
    int dlaset_work( int matrix_layout, char uplo, int m,
                     int n, double alpha, double beta,
                     long a, int lda );
    int claset_work( int matrix_layout, char uplo, int m,
                     int n, IComplexNumber alpha,
                     IComplexNumber beta,
                     IComplexNumber a, int lda );
    int zlaset_work( int matrix_layout, char uplo, int m,
                     int n, IComplexNumber alpha,
                     IComplexNumber beta,
                     IComplexNumber a, int lda );

    int slasrt_work( char id, int n, long d );
    int dlasrt_work( char id, int n, long d );

    int slaswp_work( int matrix_layout, int n, long a,
                     int lda, int k1, int k2,
                     final long ipiv, int incx );
    int dlaswp_work( int matrix_layout, int n, long a,
                     int lda, int k1, int k2,
                     final long ipiv, int incx );
    int claswp_work( int matrix_layout, int n,
                     IComplexNumber a, int lda,
                     int k1, int k2,
                     final long ipiv, int incx );
    int zlaswp_work( int matrix_layout, int n,
                     IComplexNumber a, int lda,
                     int k1, int k2,
                     final long ipiv, int incx );

    int slatms_work( int matrix_layout, int m, int n,
                     char dist, long iseed, char sym,
                     long d, int mode, float cond,
                     float dmax, int kl, int ku,
                     char pack, long a, int lda,
                     long work );
    int dlatms_work( int matrix_layout, int m, int n,
                     char dist, long iseed, char sym,
                     long d, int mode, double cond,
                     double dmax, int kl, int ku,
                     char pack, long a, int lda,
                     long work );
    int clatms_work( int matrix_layout, int m, int n,
                     char dist, long iseed, char sym,
                     long d, int mode, float cond,
                     float dmax, int kl, int ku,
                     char pack, IComplexNumber a,
                     int lda, IComplexNumber work );
    int zlatms_work( int matrix_layout, int m, int n,
                     char dist, long iseed, char sym,
                     long d, int mode, double cond,
                     double dmax, int kl, int ku,
                     char pack, IComplexNumber a,
                     int lda, IComplexNumber work );

    int slauum_work( int matrix_layout, char uplo, int n,
                     long a, int lda );
    int dlauum_work( int matrix_layout, char uplo, int n,
                     long a, int lda );
    int clauum_work( int matrix_layout, char uplo, int n,
                     IComplexNumber a, int lda );
    int zlauum_work( int matrix_layout, char uplo, int n,
                     IComplexNumber a, int lda );

    int sopgtr_work( int matrix_layout, char uplo, int n,
                     final long ap, final long tau, long q,
                     int ldq, long work );
    int dopgtr_work( int matrix_layout, char uplo, int n,
                     final long ap, final long tau, long q,
                     int ldq, long work );

    int sopmtr_work( int matrix_layout, char side, char uplo,
                     char trans, int m, int n,
                     final long ap, final long tau, long c,
                     int ldc, long work );
    int dopmtr_work( int matrix_layout, char side, char uplo,
                     char trans, int m, int n,
                     final long ap, final long tau, long c,
                     int ldc, long work );

    int sorgbr_work( int matrix_layout, char vect, int m,
                     int n, int k, long a,
                     int lda, final long tau, long work,
                     int lwork );
    int dorgbr_work( int matrix_layout, char vect, int m,
                     int n, int k, long a,
                     int lda, final long tau, long work,
                     int lwork );

    int sorghr_work( int matrix_layout, int n, int ilo,
                     int ihi, long a, int lda,
                     final long tau, long work,
                     int lwork );
    int dorghr_work( int matrix_layout, int n, int ilo,
                     int ihi, long a, int lda,
                     final long tau, long work,
                     int lwork );

    int sorglq_work( int matrix_layout, int m, int n,
                     int k, long a, int lda,
                     final long tau, long work,
                     int lwork );
    int dorglq_work( int matrix_layout, int m, int n,
                     int k, long a, int lda,
                     final long tau, long work,
                     int lwork );

    int sorgql_work( int matrix_layout, int m, int n,
                     int k, long a, int lda,
                     final long tau, long work,
                     int lwork );
    int dorgql_work( int matrix_layout, int m, int n,
                     int k, long a, int lda,
                     final long tau, long work,
                     int lwork );

    int sorgqr_work( int matrix_layout, int m, int n,
                     int k, long a, int lda,
                     final long tau, long work,
                     int lwork );
    int dorgqr_work( int matrix_layout, int m, int n,
                     int k, long a, int lda,
                     final long tau, long work,
                     int lwork );

    int sorgrq_work( int matrix_layout, int m, int n,
                     int k, long a, int lda,
                     final long tau, long work,
                     int lwork );
    int dorgrq_work( int matrix_layout, int m, int n,
                     int k, long a, int lda,
                     final long tau, long work,
                     int lwork );

    int sorgtr_work( int matrix_layout, char uplo, int n,
                     long a, int lda, final long tau,
                     long work, int lwork );
    int dorgtr_work( int matrix_layout, char uplo, int n,
                     long a, int lda, final long tau,
                     long work, int lwork );

    int sormbr_work( int matrix_layout, char vect, char side,
                     char trans, int m, int n,
                     int k, final long a, int lda,
                     final long tau, long c, int ldc,
                     long work, int lwork );
    int dormbr_work( int matrix_layout, char vect, char side,
                     char trans, int m, int n,
                     int k, final long a, int lda,
                     final long tau, long c, int ldc,
                     long work, int lwork );

    int sormhr_work( int matrix_layout, char side, char trans,
                     int m, int n, int ilo,
                     int ihi, final long a, int lda,
                     final long tau, long c, int ldc,
                     long work, int lwork );
    int dormhr_work( int matrix_layout, char side, char trans,
                     int m, int n, int ilo,
                     int ihi, final long a, int lda,
                     final long tau, long c, int ldc,
                     long work, int lwork );

    int sormlq_work( int matrix_layout, char side, char trans,
                     int m, int n, int k,
                     final long a, int lda,
                     final long tau, long c, int ldc,
                     long work, int lwork );
    int dormlq_work( int matrix_layout, char side, char trans,
                     int m, int n, int k,
                     final long a, int lda,
                     final long tau, long c, int ldc,
                     long work, int lwork );

    int sormql_work( int matrix_layout, char side, char trans,
                     int m, int n, int k,
                     final long a, int lda,
                     final long tau, long c, int ldc,
                     long work, int lwork );
    int dormql_work( int matrix_layout, char side, char trans,
                     int m, int n, int k,
                     final long a, int lda,
                     final long tau, long c, int ldc,
                     long work, int lwork );

    int sormqr_work( int matrix_layout, char side, char trans,
                     int m, int n, int k,
                     final long a, int lda,
                     final long tau, long c, int ldc,
                     long work, int lwork );
    int dormqr_work( int matrix_layout, char side, char trans,
                     int m, int n, int k,
                     final long a, int lda,
                     final long tau, long c, int ldc,
                     long work, int lwork );

    int sormrq_work( int matrix_layout, char side, char trans,
                     int m, int n, int k,
                     final long a, int lda,
                     final long tau, long c, int ldc,
                     long work, int lwork );
    int dormrq_work( int matrix_layout, char side, char trans,
                     int m, int n, int k,
                     final long a, int lda,
                     final long tau, long c, int ldc,
                     long work, int lwork );

    int sormrz_work( int matrix_layout, char side, char trans,
                     int m, int n, int k,
                     int l, final long a, int lda,
                     final long tau, long c, int ldc,
                     long work, int lwork );
    int dormrz_work( int matrix_layout, char side, char trans,
                     int m, int n, int k,
                     int l, final long a, int lda,
                     final long tau, long c, int ldc,
                     long work, int lwork );

    int sormtr_work( int matrix_layout, char side, char uplo,
                     char trans, int m, int n,
                     final long a, int lda,
                     final long tau, long c, int ldc,
                     long work, int lwork );
    int dormtr_work( int matrix_layout, char side, char uplo,
                     char trans, int m, int n,
                     final long a, int lda,
                     final long tau, long c, int ldc,
                     long work, int lwork );

    int spbcon_work( int matrix_layout, char uplo, int n,
                     int kd, final long ab, int ldab,
                     float anorm, long rcond, long work,
                     long iwork );
    int dpbcon_work( int matrix_layout, char uplo, int n,
                     int kd, final long ab,
                     int ldab, double anorm, long rcond,
                     long work, long iwork );
    int cpbcon_work( int matrix_layout, char uplo, int n,
                     int kd, final IComplexNumber ab,
                     int ldab, float anorm, long rcond,
                     IComplexNumber work, long rwork );
    int zpbcon_work( int matrix_layout, char uplo, int n,
                     int kd, final IComplexNumber ab,
                     int ldab, double anorm, long rcond,
                     IComplexNumber work, long rwork );

    int spbequ_work( int matrix_layout, char uplo, int n,
                     int kd, final long ab, int ldab,
                     long s, long scond, long amax );
    int dpbequ_work( int matrix_layout, char uplo, int n,
                     int kd, final long ab,
                     int ldab, long s, long scond,
                     long amax );
    int cpbequ_work( int matrix_layout, char uplo, int n,
                     int kd, final IComplexNumber ab,
                     int ldab, long s, long scond,
                     long amax );
    int zpbequ_work( int matrix_layout, char uplo, int n,
                     int kd, final IComplexNumber ab,
                     int ldab, long s, long scond,
                     long amax );

    int spbrfs_work( int matrix_layout, char uplo, int n,
                     int kd, int nrhs, final long ab,
                     int ldab, final long afb,
                     int ldafb, final long b,
                     int ldb, long x, int ldx,
                     long ferr, long berr, long work,
                     long iwork );
    int dpbrfs_work( int matrix_layout, char uplo, int n,
                     int kd, int nrhs,
                     final long ab, int ldab,
                     final long afb, int ldafb,
                     final long b, int ldb, long x,
                     int ldx, long ferr, long berr,
                     long work, long iwork );
    int cpbrfs_work( int matrix_layout, char uplo, int n,
                     int kd, int nrhs,
                     final IComplexNumber ab, int ldab,
                     final IComplexNumber afb,
                     int ldafb, final IComplexNumber b,
                     int ldb, IComplexNumber x,
                     int ldx, long ferr, long berr,
                     IComplexNumber work, long rwork );
    int zpbrfs_work( int matrix_layout, char uplo, int n,
                     int kd, int nrhs,
                     final IComplexNumber ab,
                     int ldab,
                     final IComplexNumber afb,
                     int ldafb,
                     final IComplexNumber b, int ldb,
                     IComplexNumber x, int ldx,
                     long ferr, long berr,
                     IComplexNumber work, long rwork );

    int spbstf_work( int matrix_layout, char uplo, int n,
                     int kb, long bb, int ldbb );
    int dpbstf_work( int matrix_layout, char uplo, int n,
                     int kb, long bb, int ldbb );
    int cpbstf_work( int matrix_layout, char uplo, int n,
                     int kb, IComplexNumber bb,
                     int ldbb );
    int zpbstf_work( int matrix_layout, char uplo, int n,
                     int kb, IComplexNumber bb,
                     int ldbb );

    int spbsv_work( int matrix_layout, char uplo, int n,
                    int kd, int nrhs, long ab,
                    int ldab, long b, int ldb );
    int dpbsv_work( int matrix_layout, char uplo, int n,
                    int kd, int nrhs, long ab,
                    int ldab, long b, int ldb );
    int cpbsv_work( int matrix_layout, char uplo, int n,
                    int kd, int nrhs,
                    IComplexNumber ab, int ldab,
                    IComplexNumber b, int ldb );
    int zpbsv_work( int matrix_layout, char uplo, int n,
                    int kd, int nrhs,
                    IComplexNumber ab, int ldab,
                    IComplexNumber b, int ldb );

    int spbsvx_work( int matrix_layout, char fact, char uplo,
                     int n, int kd, int nrhs,
                     long ab, int ldab, long afb,
                     int ldafb, long equed, long s,
                     long b, int ldb, long x,
                     int ldx, long rcond, long ferr,
                     long berr, long work, long iwork );
    int dpbsvx_work( int matrix_layout, char fact, char uplo,
                     int n, int kd, int nrhs,
                     long ab, int ldab, long afb,
                     int ldafb, long equed, long s,
                     long b, int ldb, long x,
                     int ldx, long rcond, long ferr,
                     long berr, long work, long iwork );
    int cpbsvx_work( int matrix_layout, char fact, char uplo,
                     int n, int kd, int nrhs,
                     IComplexNumber ab, int ldab,
                     IComplexNumber afb, int ldafb,
                     long equed, long s, IComplexNumber b,
                     int ldb, IComplexNumber x,
                     int ldx, long rcond, long ferr,
                     long berr, IComplexNumber work,
                     long rwork );
    int zpbsvx_work( int matrix_layout, char fact, char uplo,
                     int n, int kd, int nrhs,
                     IComplexNumber ab, int ldab,
                     IComplexNumber afb, int ldafb,
                     long equed, long s,
                     IComplexNumber b, int ldb,
                     IComplexNumber x, int ldx,
                     long rcond, long ferr, long berr,
                     IComplexNumber work, long rwork );

    int spbtrf_work( int matrix_layout, char uplo, int n,
                     int kd, long ab, int ldab );
    int dpbtrf_work( int matrix_layout, char uplo, int n,
                     int kd, long ab, int ldab );
    int cpbtrf_work( int matrix_layout, char uplo, int n,
                     int kd, IComplexNumber ab,
                     int ldab );
    int zpbtrf_work( int matrix_layout, char uplo, int n,
                     int kd, IComplexNumber ab,
                     int ldab );

    int spbtrs_work( int matrix_layout, char uplo, int n,
                     int kd, int nrhs, final long ab,
                     int ldab, long b, int ldb );
    int dpbtrs_work( int matrix_layout, char uplo, int n,
                     int kd, int nrhs,
                     final long ab, int ldab, long b,
                     int ldb );
    int cpbtrs_work( int matrix_layout, char uplo, int n,
                     int kd, int nrhs,
                     final IComplexNumber ab, int ldab,
                     IComplexNumber b, int ldb );
    int zpbtrs_work( int matrix_layout, char uplo, int n,
                     int kd, int nrhs,
                     final IComplexNumber ab,
                     int ldab, IComplexNumber b,
                     int ldb );

    int spftrf_work( int matrix_layout, char transr, char uplo,
                     int n, long a );
    int dpftrf_work( int matrix_layout, char transr, char uplo,
                     int n, long a );
    int cpftrf_work( int matrix_layout, char transr, char uplo,
                     int n, IComplexNumber a );
    int zpftrf_work( int matrix_layout, char transr, char uplo,
                     int n, IComplexNumber a );

    int spftri_work( int matrix_layout, char transr, char uplo,
                     int n, long a );
    int dpftri_work( int matrix_layout, char transr, char uplo,
                     int n, long a );
    int cpftri_work( int matrix_layout, char transr, char uplo,
                     int n, IComplexNumber a );
    int zpftri_work( int matrix_layout, char transr, char uplo,
                     int n, IComplexNumber a );

    int spftrs_work( int matrix_layout, char transr, char uplo,
                     int n, int nrhs, final long a,
                     long b, int ldb );
    int dpftrs_work( int matrix_layout, char transr, char uplo,
                     int n, int nrhs, final long a,
                     long b, int ldb );
    int cpftrs_work( int matrix_layout, char transr, char uplo,
                     int n, int nrhs,
                     final IComplexNumber a,
                     IComplexNumber b, int ldb );
    int zpftrs_work( int matrix_layout, char transr, char uplo,
                     int n, int nrhs,
                     final IComplexNumber a,
                     IComplexNumber b, int ldb );

    int spocon_work( int matrix_layout, char uplo, int n,
                     final long a, int lda, float anorm,
                     long rcond, long work, long iwork );
    int dpocon_work( int matrix_layout, char uplo, int n,
                     final long a, int lda, double anorm,
                     long rcond, long work,
                     long iwork );
    int cpocon_work( int matrix_layout, char uplo, int n,
                     final IComplexNumber a, int lda,
                     float anorm, long rcond,
                     IComplexNumber work, long rwork );
    int zpocon_work( int matrix_layout, char uplo, int n,
                     final IComplexNumber a, int lda,
                     double anorm, long rcond,
                     IComplexNumber work, long rwork );

    int spoequ_work( int matrix_layout, int n, final long a,
                     int lda, long s, long scond,
                     long amax );
    int dpoequ_work( int matrix_layout, int n, final long a,
                     int lda, long s, long scond,
                     long amax );
    int cpoequ_work( int matrix_layout, int n,
                     final IComplexNumber a, int lda,
                     long s, long scond, long amax );
    int zpoequ_work( int matrix_layout, int n,
                     final IComplexNumber a, int lda,
                     long s, long scond, long amax );

    int spoequb_work( int matrix_layout, int n, final long a,
                      int lda, long s, long scond,
                      long amax );
    int dpoequb_work( int matrix_layout, int n,
                      final long a, int lda, long s,
                      long scond, long amax );
    int cpoequb_work( int matrix_layout, int n,
                      final IComplexNumber a, int lda,
                      long s, long scond, long amax );
    int zpoequb_work( int matrix_layout, int n,
                      final IComplexNumber a, int lda,
                      long s, long scond, long amax );

    int sporfs_work( int matrix_layout, char uplo, int n,
                     int nrhs, final long a, int lda,
                     final long af, int ldaf,
                     final long b, int ldb, long x,
                     int ldx, long ferr, long berr,
                     long work, long iwork );
    int dporfs_work( int matrix_layout, char uplo, int n,
                     int nrhs, final long a,
                     int lda, final long af,
                     int ldaf, final long b,
                     int ldb, long x, int ldx,
                     long ferr, long berr, long work,
                     long iwork );
    int cporfs_work( int matrix_layout, char uplo, int n,
                     int nrhs, final IComplexNumber a,
                     int lda, final IComplexNumber af,
                     int ldaf, final IComplexNumber b,
                     int ldb, IComplexNumber x,
                     int ldx, long ferr, long berr,
                     IComplexNumber work, long rwork );
    int zporfs_work( int matrix_layout, char uplo, int n,
                     int nrhs, final IComplexNumber a,
                     int lda, final IComplexNumber af,
                     int ldaf, final IComplexNumber b,
                     int ldb, IComplexNumber x,
                     int ldx, long ferr, long berr,
                     IComplexNumber work, long rwork );

    int sporfsx_work( int matrix_layout, char uplo, char equed,
                      int n, int nrhs, final long a,
                      int lda, final long af,
                      int ldaf, final long s,
                      final long b, int ldb, long x,
                      int ldx, long rcond, long berr,
                      int n_err_bnds, long err_bnds_norm,
                      long err_bnds_comp, int nparams,
                      long params, long work,
                      long iwork );
    int dporfsx_work( int matrix_layout, char uplo, char equed,
                      int n, int nrhs, final long a,
                      int lda, final long af,
                      int ldaf, final long s,
                      final long b, int ldb, long x,
                      int ldx, long rcond, long berr,
                      int n_err_bnds, long err_bnds_norm,
                      long err_bnds_comp, int nparams,
                      long params, long work,
                      long iwork );
    int cporfsx_work( int matrix_layout, char uplo, char equed,
                      int n, int nrhs,
                      final IComplexNumber a, int lda,
                      final IComplexNumber af,
                      int ldaf, final long s,
                      final IComplexNumber b, int ldb,
                      IComplexNumber x, int ldx,
                      long rcond, long berr,
                      int n_err_bnds, long err_bnds_norm,
                      long err_bnds_comp, int nparams,
                      long params, IComplexNumber work,
                      long rwork );
    int zporfsx_work( int matrix_layout, char uplo, char equed,
                      int n, int nrhs,
                      final IComplexNumber a, int lda,
                      final IComplexNumber af,
                      int ldaf, final long s,
                      final IComplexNumber b, int ldb,
                      IComplexNumber x, int ldx,
                      long rcond, long berr,
                      int n_err_bnds, long err_bnds_norm,
                      long err_bnds_comp, int nparams,
                      long params, IComplexNumber work,
                      long rwork );

    int sposv_work( int matrix_layout, char uplo, int n,
                    int nrhs, long a, int lda,
                    long b, int ldb );
    int dposv_work( int matrix_layout, char uplo, int n,
                    int nrhs, long a, int lda,
                    long b, int ldb );
    int cposv_work( int matrix_layout, char uplo, int n,
                    int nrhs, IComplexNumber a,
                    int lda, IComplexNumber b,
                    int ldb );
    int zposv_work( int matrix_layout, char uplo, int n,
                    int nrhs, IComplexNumber a,
                    int lda, IComplexNumber b,
                    int ldb );
    int dsposv_work( int matrix_layout, char uplo, int n,
                     int nrhs, long a, int lda,
                     long b, int ldb, long x,
                     int ldx, long work, long swork,
                     long iter );
    int zcposv_work( int matrix_layout, char uplo, int n,
                     int nrhs, IComplexNumber a,
                     int lda, IComplexNumber b,
                     int ldb, IComplexNumber x,
                     int ldx, IComplexNumber work,
                     IComplexNumber swork, long rwork,
                     long iter );

    int sposvx_work( int matrix_layout, char fact, char uplo,
                     int n, int nrhs, long a,
                     int lda, long af, int ldaf,
                     long equed, long s, long b, int ldb,
                     long x, int ldx, long rcond,
                     long ferr, long berr, long work,
                     long iwork );
    int dposvx_work( int matrix_layout, char fact, char uplo,
                     int n, int nrhs, long a,
                     int lda, long af, int ldaf,
                     long equed, long s, long b,
                     int ldb, long x, int ldx,
                     long rcond, long ferr, long berr,
                     long work, long iwork );
    int cposvx_work( int matrix_layout, char fact, char uplo,
                     int n, int nrhs,
                     IComplexNumber a, int lda,
                     IComplexNumber af, int ldaf,
                     long equed, long s, IComplexNumber b,
                     int ldb, IComplexNumber x,
                     int ldx, long rcond, long ferr,
                     long berr, IComplexNumber work,
                     long rwork );
    int zposvx_work( int matrix_layout, char fact, char uplo,
                     int n, int nrhs,
                     IComplexNumber a, int lda,
                     IComplexNumber af, int ldaf,
                     long equed, long s,
                     IComplexNumber b, int ldb,
                     IComplexNumber x, int ldx,
                     long rcond, long ferr, long berr,
                     IComplexNumber work, long rwork );

    int sposvxx_work( int matrix_layout, char fact, char uplo,
                      int n, int nrhs, long a,
                      int lda, long af, int ldaf,
                      long equed, long s, long b,
                      int ldb, long x, int ldx,
                      long rcond, long rpvgrw, long berr,
                      int n_err_bnds, long err_bnds_norm,
                      long err_bnds_comp, int nparams,
                      long params, long work,
                      long iwork );
    int dposvxx_work( int matrix_layout, char fact, char uplo,
                      int n, int nrhs, long a,
                      int lda, long af, int ldaf,
                      long equed, long s, long b,
                      int ldb, long x, int ldx,
                      long rcond, long rpvgrw, long berr,
                      int n_err_bnds, long err_bnds_norm,
                      long err_bnds_comp, int nparams,
                      long params, long work,
                      long iwork );
    int cposvxx_work( int matrix_layout, char fact, char uplo,
                      int n, int nrhs,
                      IComplexNumber a, int lda,
                      IComplexNumber af, int ldaf,
                      long equed, long s, IComplexNumber b,
                      int ldb, IComplexNumber x,
                      int ldx, long rcond, long rpvgrw,
                      long berr, int n_err_bnds,
                      long err_bnds_norm, long err_bnds_comp,
                      int nparams, long params,
                      IComplexNumber work, long rwork );
    int zposvxx_work( int matrix_layout, char fact, char uplo,
                      int n, int nrhs,
                      IComplexNumber a, int lda,
                      IComplexNumber af, int ldaf,
                      long equed, long s,
                      IComplexNumber b, int ldb,
                      IComplexNumber x, int ldx,
                      long rcond, long rpvgrw, long berr,
                      int n_err_bnds, long err_bnds_norm,
                      long err_bnds_comp, int nparams,
                      long params, IComplexNumber work,
                      long rwork );

    int spotrf2_work( int matrix_layout, char uplo, int n,
                      long a, int lda );
    int dpotrf2_work( int matrix_layout, char uplo, int n,
                      long a, int lda );
    int cpotrf2_work( int matrix_layout, char uplo, int n,
                      IComplexNumber a, int lda );
    int zpotrf2_work( int matrix_layout, char uplo, int n,
                      IComplexNumber a, int lda );

    int spotrf_work( int matrix_layout, char uplo, int n,
                     long a, int lda );
    int dpotrf_work( int matrix_layout, char uplo, int n,
                     long a, int lda );
    int cpotrf_work( int matrix_layout, char uplo, int n,
                     IComplexNumber a, int lda );
    int zpotrf_work( int matrix_layout, char uplo, int n,
                     IComplexNumber a, int lda );

    int spotri_work( int matrix_layout, char uplo, int n,
                     long a, int lda );
    int dpotri_work( int matrix_layout, char uplo, int n,
                     long a, int lda );
    int cpotri_work( int matrix_layout, char uplo, int n,
                     IComplexNumber a, int lda );
    int zpotri_work( int matrix_layout, char uplo, int n,
                     IComplexNumber a, int lda );

    int spotrs_work( int matrix_layout, char uplo, int n,
                     int nrhs, final long a, int lda,
                     long b, int ldb );
    int dpotrs_work( int matrix_layout, char uplo, int n,
                     int nrhs, final long a,
                     int lda, long b, int ldb );
    int cpotrs_work( int matrix_layout, char uplo, int n,
                     int nrhs, final IComplexNumber a,
                     int lda, IComplexNumber b,
                     int ldb );
    int zpotrs_work( int matrix_layout, char uplo, int n,
                     int nrhs, final IComplexNumber a,
                     int lda, IComplexNumber b,
                     int ldb );

    int sppcon_work( int matrix_layout, char uplo, int n,
                     final long ap, float anorm, long rcond,
                     long work, long iwork );
    int dppcon_work( int matrix_layout, char uplo, int n,
                     final long ap, double anorm, long rcond,
                     long work, long iwork );
    int cppcon_work( int matrix_layout, char uplo, int n,
                     final IComplexNumber ap, float anorm,
                     long rcond, IComplexNumber work,
                     long rwork );
    int zppcon_work( int matrix_layout, char uplo, int n,
                     final IComplexNumber ap, double anorm,
                     long rcond, IComplexNumber work,
                     long rwork );

    int sppequ_work( int matrix_layout, char uplo, int n,
                     final long ap, long s, long scond,
                     long amax );
    int dppequ_work( int matrix_layout, char uplo, int n,
                     final long ap, long s, long scond,
                     long amax );
    int cppequ_work( int matrix_layout, char uplo, int n,
                     final IComplexNumber ap, long s,
                     long scond, long amax );
    int zppequ_work( int matrix_layout, char uplo, int n,
                     final IComplexNumber ap, long s,
                     long scond, long amax );

    int spprfs_work( int matrix_layout, char uplo, int n,
                     int nrhs, final long ap,
                     final long afp, final long b,
                     int ldb, long x, int ldx,
                     long ferr, long berr, long work,
                     long iwork );
    int dpprfs_work( int matrix_layout, char uplo, int n,
                     int nrhs, final long ap,
                     final long afp, final long b,
                     int ldb, long x, int ldx,
                     long ferr, long berr, long work,
                     long iwork );
    int cpprfs_work( int matrix_layout, char uplo, int n,
                     int nrhs, final IComplexNumber ap,
                     final IComplexNumber afp,
                     final IComplexNumber b, int ldb,
                     IComplexNumber x, int ldx,
                     long ferr, long berr,
                     IComplexNumber work, long rwork );
    int zpprfs_work( int matrix_layout, char uplo, int n,
                     int nrhs,
                     final IComplexNumber ap,
                     final IComplexNumber afp,
                     final IComplexNumber b, int ldb,
                     IComplexNumber x, int ldx,
                     long ferr, long berr,
                     IComplexNumber work, long rwork );

    int sppsv_work( int matrix_layout, char uplo, int n,
                    int nrhs, long ap, long b,
                    int ldb );
    int dppsv_work( int matrix_layout, char uplo, int n,
                    int nrhs, long ap, long b,
                    int ldb );
    int cppsv_work( int matrix_layout, char uplo, int n,
                    int nrhs, IComplexNumber ap,
                    IComplexNumber b, int ldb );
    int zppsv_work( int matrix_layout, char uplo, int n,
                    int nrhs, IComplexNumber ap,
                    IComplexNumber b, int ldb );

    int sppsvx_work( int matrix_layout, char fact, char uplo,
                     int n, int nrhs, long ap,
                     long afp, long equed, long s, long b,
                     int ldb, long x, int ldx,
                     long rcond, long ferr, long berr,
                     long work, long iwork );
    int dppsvx_work( int matrix_layout, char fact, char uplo,
                     int n, int nrhs, long ap,
                     long afp, long equed, long s, long b,
                     int ldb, long x, int ldx,
                     long rcond, long ferr, long berr,
                     long work, long iwork );
    int cppsvx_work( int matrix_layout, char fact, char uplo,
                     int n, int nrhs,
                     IComplexNumber ap,
                     IComplexNumber afp, long equed,
                     long s, IComplexNumber b,
                     int ldb, IComplexNumber x,
                     int ldx, long rcond, long ferr,
                     long berr, IComplexNumber work,
                     long rwork );
    int zppsvx_work( int matrix_layout, char fact, char uplo,
                     int n, int nrhs,
                     IComplexNumber ap,
                     IComplexNumber afp, long equed,
                     long s, IComplexNumber b,
                     int ldb, IComplexNumber x,
                     int ldx, long rcond, long ferr,
                     long berr, IComplexNumber work,
                     long rwork );

    int spptrf_work( int matrix_layout, char uplo, int n,
                     long ap );
    int dpptrf_work( int matrix_layout, char uplo, int n,
                     long ap );
    int cpptrf_work( int matrix_layout, char uplo, int n,
                     IComplexNumber ap );
    int zpptrf_work( int matrix_layout, char uplo, int n,
                     IComplexNumber ap );

    int spptri_work( int matrix_layout, char uplo, int n,
                     long ap );
    int dpptri_work( int matrix_layout, char uplo, int n,
                     long ap );
    int cpptri_work( int matrix_layout, char uplo, int n,
                     IComplexNumber ap );
    int zpptri_work( int matrix_layout, char uplo, int n,
                     IComplexNumber ap );

    int spptrs_work( int matrix_layout, char uplo, int n,
                     int nrhs, final long ap, long b,
                     int ldb );
    int dpptrs_work( int matrix_layout, char uplo, int n,
                     int nrhs, final long ap, long b,
                     int ldb );
    int cpptrs_work( int matrix_layout, char uplo, int n,
                     int nrhs, final IComplexNumber ap,
                     IComplexNumber b, int ldb );
    int zpptrs_work( int matrix_layout, char uplo, int n,
                     int nrhs,
                     final IComplexNumber ap,
                     IComplexNumber b, int ldb );

    int spstrf_work( int matrix_layout, char uplo, int n,
                     long a, int lda, long piv,
                     long rank, float tol, long work );
    int dpstrf_work( int matrix_layout, char uplo, int n,
                     long a, int lda, long piv,
                     long rank, double tol, long work );
    int cpstrf_work( int matrix_layout, char uplo, int n,
                     IComplexNumber a, int lda,
                     long piv, long rank, float tol,
                     long work );
    int zpstrf_work( int matrix_layout, char uplo, int n,
                     IComplexNumber a, int lda,
                     long piv, long rank, double tol,
                     long work );

    int sptcon_work( int n, final long d, final long e,
                     float anorm, long rcond, long work );
    int dptcon_work( int n, final long d, final long e,
                     double anorm, long rcond, long work );
    int cptcon_work( int n, final long d,
                     final IComplexNumber e, float anorm,
                     long rcond, long work );
    int zptcon_work( int n, final long d,
                     final IComplexNumber e, double anorm,
                     long rcond, long work );

    int spteqr_work( int matrix_layout, char compz, int n,
                     long d, long e, long z, int ldz,
                     long work );
    int dpteqr_work( int matrix_layout, char compz, int n,
                     long d, long e, long z, int ldz,
                     long work );
    int cpteqr_work( int matrix_layout, char compz, int n,
                     long d, long e, IComplexNumber z,
                     int ldz, long work );
    int zpteqr_work( int matrix_layout, char compz, int n,
                     long d, long e, IComplexNumber z,
                     int ldz, long work );

    int sptrfs_work( int matrix_layout, int n, int nrhs,
                     final long d, final long e, final long df,
                     final long ef, final long b, int ldb,
                     long x, int ldx, long ferr,
                     long berr, long work );
    int dptrfs_work( int matrix_layout, int n, int nrhs,
                     final long d, final long e,
                     final long df, final long ef,
                     final long b, int ldb, long x,
                     int ldx, long ferr, long berr,
                     long work );
    int cptrfs_work( int matrix_layout, char uplo, int n,
                     int nrhs, final long d,
                     final IComplexNumber e, final long df,
                     final IComplexNumber ef,
                     final IComplexNumber b, int ldb,
                     IComplexNumber x, int ldx,
                     long ferr, long berr,
                     IComplexNumber work, long rwork );
    int zptrfs_work( int matrix_layout, char uplo, int n,
                     int nrhs, final long d,
                     final IComplexNumber e,
                     final long df,
                     final IComplexNumber ef,
                     final IComplexNumber b, int ldb,
                     IComplexNumber x, int ldx,
                     long ferr, long berr,
                     IComplexNumber work, long rwork );

    int sptsv_work( int matrix_layout, int n, int nrhs,
                    long d, long e, long b, int ldb );
    int dptsv_work( int matrix_layout, int n, int nrhs,
                    long d, long e, long b,
                    int ldb );
    int cptsv_work( int matrix_layout, int n, int nrhs,
                    long d, IComplexNumber e,
                    IComplexNumber b, int ldb );
    int zptsv_work( int matrix_layout, int n, int nrhs,
                    long d, IComplexNumber e,
                    IComplexNumber b, int ldb );

    int sptsvx_work( int matrix_layout, char fact, int n,
                     int nrhs, final long d, final long e,
                     long df, long ef, final long b,
                     int ldb, long x, int ldx,
                     long rcond, long ferr, long berr,
                     long work );
    int dptsvx_work( int matrix_layout, char fact, int n,
                     int nrhs, final long d,
                     final long e, long df, long ef,
                     final long b, int ldb, long x,
                     int ldx, long rcond, long ferr,
                     long berr, long work );
    int cptsvx_work( int matrix_layout, char fact, int n,
                     int nrhs, final long d,
                     final IComplexNumber e, long df,
                     IComplexNumber ef,
                     final IComplexNumber b, int ldb,
                     IComplexNumber x, int ldx,
                     long rcond, long ferr, long berr,
                     IComplexNumber work, long rwork );
    int zptsvx_work( int matrix_layout, char fact, int n,
                     int nrhs, final long d,
                     final IComplexNumber e, long df,
                     IComplexNumber ef,
                     final IComplexNumber b, int ldb,
                     IComplexNumber x, int ldx,
                     long rcond, long ferr, long berr,
                     IComplexNumber work, long rwork );

    int spttrf_work( int n, long d, long e );
    int dpttrf_work( int n, long d, long e );
    int cpttrf_work( int n, long d,
                     IComplexNumber e );
    int zpttrf_work( int n, long d,
                     IComplexNumber e );

    int spttrs_work( int matrix_layout, int n, int nrhs,
                     final long d, final long e, long b,
                     int ldb );
    int dpttrs_work( int matrix_layout, int n, int nrhs,
                     final long d, final long e, long b,
                     int ldb );
    int cpttrs_work( int matrix_layout, char uplo, int n,
                     int nrhs, final long d,
                     final IComplexNumber e,
                     IComplexNumber b, int ldb );
    int zpttrs_work( int matrix_layout, char uplo, int n,
                     int nrhs, final long d,
                     final IComplexNumber e,
                     IComplexNumber b, int ldb );

    int ssbev_work( int matrix_layout, char jobz, char uplo,
                    int n, int kd, long ab,
                    int ldab, long w, long z,
                    int ldz, long work );
    int dsbev_work( int matrix_layout, char jobz, char uplo,
                    int n, int kd, long ab,
                    int ldab, long w, long z,
                    int ldz, long work );

    int ssbevd_work( int matrix_layout, char jobz, char uplo,
                     int n, int kd, long ab,
                     int ldab, long w, long z,
                     int ldz, long work, int lwork,
                     long iwork, int liwork );
    int dsbevd_work( int matrix_layout, char jobz, char uplo,
                     int n, int kd, long ab,
                     int ldab, long w, long z,
                     int ldz, long work, int lwork,
                     long iwork, int liwork );

    int ssbevx_work( int matrix_layout, char jobz, char range,
                     char uplo, int n, int kd,
                     long ab, int ldab, long q,
                     int ldq, float vl, float vu,
                     int il, int iu, float abstol,
                     long m, long w, long z,
                     int ldz, long work, long iwork,
                     long ifail );
    int dsbevx_work( int matrix_layout, char jobz, char range,
                     char uplo, int n, int kd,
                     long ab, int ldab, long q,
                     int ldq, double vl, double vu,
                     int il, int iu, double abstol,
                     long m, long w, long z,
                     int ldz, long work, long iwork,
                     long ifail );

    int ssbgst_work( int matrix_layout, char vect, char uplo,
                     int n, int ka, int kb,
                     long ab, int ldab, final long bb,
                     int ldbb, long x, int ldx,
                     long work );
    int dsbgst_work( int matrix_layout, char vect, char uplo,
                     int n, int ka, int kb,
                     long ab, int ldab, final long bb,
                     int ldbb, long x, int ldx,
                     long work );

    int ssbgv_work( int matrix_layout, char jobz, char uplo,
                    int n, int ka, int kb,
                    long ab, int ldab, long bb,
                    int ldbb, long w, long z,
                    int ldz, long work );
    int dsbgv_work( int matrix_layout, char jobz, char uplo,
                    int n, int ka, int kb,
                    long ab, int ldab, long bb,
                    int ldbb, long w, long z,
                    int ldz, long work );

    int ssbgvd_work( int matrix_layout, char jobz, char uplo,
                     int n, int ka, int kb,
                     long ab, int ldab, long bb,
                     int ldbb, long w, long z,
                     int ldz, long work, int lwork,
                     long iwork, int liwork );
    int dsbgvd_work( int matrix_layout, char jobz, char uplo,
                     int n, int ka, int kb,
                     long ab, int ldab, long bb,
                     int ldbb, long w, long z,
                     int ldz, long work, int lwork,
                     long iwork, int liwork );

    int ssbgvx_work( int matrix_layout, char jobz, char range,
                     char uplo, int n, int ka,
                     int kb, long ab, int ldab,
                     long bb, int ldbb, long q,
                     int ldq, float vl, float vu,
                     int il, int iu, float abstol,
                     long m, long w, long z,
                     int ldz, long work, long iwork,
                     long ifail );
    int dsbgvx_work( int matrix_layout, char jobz, char range,
                     char uplo, int n, int ka,
                     int kb, long ab, int ldab,
                     long bb, int ldbb, long q,
                     int ldq, double vl, double vu,
                     int il, int iu, double abstol,
                     long m, long w, long z,
                     int ldz, long work, long iwork,
                     long ifail );

    int ssbtrd_work( int matrix_layout, char vect, char uplo,
                     int n, int kd, long ab,
                     int ldab, long d, long e, long q,
                     int ldq, long work );
    int dsbtrd_work( int matrix_layout, char vect, char uplo,
                     int n, int kd, long ab,
                     int ldab, long d, long e,
                     long q, int ldq, long work );

    int ssfrk_work( int matrix_layout, char transr, char uplo,
                    char trans, int n, int k,
                    float alpha, final long a, int lda,
                    float beta, long c );
    int dsfrk_work( int matrix_layout, char transr, char uplo,
                    char trans, int n, int k,
                    double alpha, final long a, int lda,
                    double beta, long c );

    int sspcon_work( int matrix_layout, char uplo, int n,
                     final long ap, final long ipiv,
                     float anorm, long rcond, long work,
                     long iwork );
    int dspcon_work( int matrix_layout, char uplo, int n,
                     final long ap, final long ipiv,
                     double anorm, long rcond, long work,
                     long iwork );
    int cspcon_work( int matrix_layout, char uplo, int n,
                     final IComplexNumber ap,
                     final long ipiv, float anorm,
                     long rcond, IComplexNumber work );
    int zspcon_work( int matrix_layout, char uplo, int n,
                     final IComplexNumber ap,
                     final long ipiv, double anorm,
                     long rcond, IComplexNumber work );

    int sspev_work( int matrix_layout, char jobz, char uplo,
                    int n, long ap, long w, long z,
                    int ldz, long work );
    int dspev_work( int matrix_layout, char jobz, char uplo,
                    int n, long ap, long w, long z,
                    int ldz, long work );

    int sspevd_work( int matrix_layout, char jobz, char uplo,
                     int n, long ap, long w, long z,
                     int ldz, long work, int lwork,
                     long iwork, int liwork );
    int dspevd_work( int matrix_layout, char jobz, char uplo,
                     int n, long ap, long w, long z,
                     int ldz, long work, int lwork,
                     long iwork, int liwork );

    int sspevx_work( int matrix_layout, char jobz, char range,
                     char uplo, int n, long ap, float vl,
                     float vu, int il, int iu,
                     float abstol, long m, long w, long z,
                     int ldz, long work, long iwork,
                     long ifail );
    int dspevx_work( int matrix_layout, char jobz, char range,
                     char uplo, int n, long ap, double vl,
                     double vu, int il, int iu,
                     double abstol, long m, long w,
                     long z, int ldz, long work,
                     long iwork, long ifail );

    int sspgst_work( int matrix_layout, int itype, char uplo,
                     int n, long ap, final long bp );
    int dspgst_work( int matrix_layout, int itype, char uplo,
                     int n, long ap, final long bp );

    int sspgv_work( int matrix_layout, int itype, char jobz,
                    char uplo, int n, long ap, long bp,
                    long w, long z, int ldz,
                    long work );
    int dspgv_work( int matrix_layout, int itype, char jobz,
                    char uplo, int n, long ap, long bp,
                    long w, long z, int ldz,
                    long work );

    int sspgvd_work( int matrix_layout, int itype, char jobz,
                     char uplo, int n, long ap, long bp,
                     long w, long z, int ldz, long work,
                     int lwork, long iwork,
                     int liwork );
    int dspgvd_work( int matrix_layout, int itype, char jobz,
                     char uplo, int n, long ap, long bp,
                     long w, long z, int ldz,
                     long work, int lwork,
                     long iwork, int liwork );

    int sspgvx_work( int matrix_layout, int itype, char jobz,
                     char range, char uplo, int n, long ap,
                     long bp, float vl, float vu, int il,
                     int iu, float abstol, long m,
                     long w, long z, int ldz, long work,
                     long iwork, long ifail );
    int dspgvx_work( int matrix_layout, int itype, char jobz,
                     char range, char uplo, int n, long ap,
                     long bp, double vl, double vu, int il,
                     int iu, double abstol, long m,
                     long w, long z, int ldz,
                     long work, long iwork,
                     long ifail );

    int ssprfs_work( int matrix_layout, char uplo, int n,
                     int nrhs, final long ap,
                     final long afp, final long ipiv,
                     final long b, int ldb, long x,
                     int ldx, long ferr, long berr,
                     long work, long iwork );
    int dsprfs_work( int matrix_layout, char uplo, int n,
                     int nrhs, final long ap,
                     final long afp, final long ipiv,
                     final long b, int ldb, long x,
                     int ldx, long ferr, long berr,
                     long work, long iwork );
    int csprfs_work( int matrix_layout, char uplo, int n,
                     int nrhs, final IComplexNumber ap,
                     final IComplexNumber afp,
                     final long ipiv,
                     final IComplexNumber b, int ldb,
                     IComplexNumber x, int ldx,
                     long ferr, long berr,
                     IComplexNumber work, long rwork );
    int zsprfs_work( int matrix_layout, char uplo, int n,
                     int nrhs,
                     final IComplexNumber ap,
                     final IComplexNumber afp,
                     final long ipiv,
                     final IComplexNumber b, int ldb,
                     IComplexNumber x, int ldx,
                     long ferr, long berr,
                     IComplexNumber work, long rwork );

    int sspsv_work( int matrix_layout, char uplo, int n,
                    int nrhs, long ap, long ipiv,
                    long b, int ldb );
    int dspsv_work( int matrix_layout, char uplo, int n,
                    int nrhs, long ap, long ipiv,
                    long b, int ldb );
    int cspsv_work( int matrix_layout, char uplo, int n,
                    int nrhs, IComplexNumber ap,
                    long ipiv, IComplexNumber b,
                    int ldb );
    int zspsv_work( int matrix_layout, char uplo, int n,
                    int nrhs, IComplexNumber ap,
                    long ipiv, IComplexNumber b,
                    int ldb );

    int sspsvx_work( int matrix_layout, char fact, char uplo,
                     int n, int nrhs, final long ap,
                     long afp, long ipiv, final long b,
                     int ldb, long x, int ldx,
                     long rcond, long ferr, long berr,
                     long work, long iwork );
    int dspsvx_work( int matrix_layout, char fact, char uplo,
                     int n, int nrhs, final long ap,
                     long afp, long ipiv, final long b,
                     int ldb, long x, int ldx,
                     long rcond, long ferr, long berr,
                     long work, long iwork );
    int cspsvx_work( int matrix_layout, char fact, char uplo,
                     int n, int nrhs,
                     final IComplexNumber ap,
                     IComplexNumber afp, long ipiv,
                     final IComplexNumber b, int ldb,
                     IComplexNumber x, int ldx,
                     long rcond, long ferr, long berr,
                     IComplexNumber work, long rwork );
    int zspsvx_work( int matrix_layout, char fact, char uplo,
                     int n, int nrhs,
                     final IComplexNumber ap,
                     IComplexNumber afp, long ipiv,
                     final IComplexNumber b, int ldb,
                     IComplexNumber x, int ldx,
                     long rcond, long ferr, long berr,
                     IComplexNumber work, long rwork );

    int ssptrd_work( int matrix_layout, char uplo, int n,
                     long ap, long d, long e, long tau );
    int dsptrd_work( int matrix_layout, char uplo, int n,
                     long ap, long d, long e, long tau );

    int ssptrf_work( int matrix_layout, char uplo, int n,
                     long ap, long ipiv );
    int dsptrf_work( int matrix_layout, char uplo, int n,
                     long ap, long ipiv );
    int csptrf_work( int matrix_layout, char uplo, int n,
                     IComplexNumber ap, long ipiv );
    int zsptrf_work( int matrix_layout, char uplo, int n,
                     IComplexNumber ap, long ipiv );

    int ssptri_work( int matrix_layout, char uplo, int n,
                     long ap, final long ipiv,
                     long work );
    int dsptri_work( int matrix_layout, char uplo, int n,
                     long ap, final long ipiv,
                     long work );
    int csptri_work( int matrix_layout, char uplo, int n,
                     IComplexNumber ap,
                     final long ipiv,
                     IComplexNumber work );
    int zsptri_work( int matrix_layout, char uplo, int n,
                     IComplexNumber ap,
                     final long ipiv,
                     IComplexNumber work );

    int ssptrs_work( int matrix_layout, char uplo, int n,
                     int nrhs, final long ap,
                     final long ipiv, long b,
                     int ldb );
    int dsptrs_work( int matrix_layout, char uplo, int n,
                     int nrhs, final long ap,
                     final long ipiv, long b,
                     int ldb );
    int csptrs_work( int matrix_layout, char uplo, int n,
                     int nrhs, final IComplexNumber ap,
                     final long ipiv, IComplexNumber b,
                     int ldb );
    int zsptrs_work( int matrix_layout, char uplo, int n,
                     int nrhs,
                     final IComplexNumber ap,
                     final long ipiv,
                     IComplexNumber b, int ldb );

    int sstebz_work( char range, char order, int n, float vl,
                     float vu, int il, int iu,
                     float abstol, final long d, final long e,
                     long m, long nsplit, long w,
                     long iblock, long isplit,
                     long work, long iwork );
    int dstebz_work( char range, char order, int n, double vl,
                     double vu, int il, int iu,
                     double abstol, final long d, final long e,
                     long m, long nsplit, long w,
                     long iblock, long isplit,
                     long work, long iwork );

    int sstedc_work( int matrix_layout, char compz, int n,
                     long d, long e, long z, int ldz,
                     long work, int lwork,
                     long iwork, int liwork );
    int dstedc_work( int matrix_layout, char compz, int n,
                     long d, long e, long z, int ldz,
                     long work, int lwork,
                     long iwork, int liwork );
    int cstedc_work( int matrix_layout, char compz, int n,
                     long d, long e, IComplexNumber z,
                     int ldz, IComplexNumber work,
                     int lwork, long rwork,
                     int lrwork, long iwork,
                     int liwork );
    int zstedc_work( int matrix_layout, char compz, int n,
                     long d, long e, IComplexNumber z,
                     int ldz, IComplexNumber work,
                     int lwork, long rwork,
                     int lrwork, long iwork,
                     int liwork );

    int sstegr_work( int matrix_layout, char jobz, char range,
                     int n, long d, long e, float vl,
                     float vu, int il, int iu,
                     float abstol, long m, long w, long z,
                     int ldz, long isuppz, long work,
                     int lwork, long iwork,
                     int liwork );
    int dstegr_work( int matrix_layout, char jobz, char range,
                     int n, long d, long e, double vl,
                     double vu, int il, int iu,
                     double abstol, long m, long w,
                     long z, int ldz, long isuppz,
                     long work, int lwork,
                     long iwork, int liwork );
    int cstegr_work( int matrix_layout, char jobz, char range,
                     int n, long d, long e, float vl,
                     float vu, int il, int iu,
                     float abstol, long m, long w,
                     IComplexNumber z, int ldz,
                     long isuppz, long work,
                     int lwork, long iwork,
                     int liwork );
    int zstegr_work( int matrix_layout, char jobz, char range,
                     int n, long d, long e, double vl,
                     double vu, int il, int iu,
                     double abstol, long m, long w,
                     IComplexNumber z, int ldz,
                     long isuppz, long work,
                     int lwork, long iwork,
                     int liwork );

    int sstein_work( int matrix_layout, int n, final long d,
                     final long e, int m, final long w,
                     final long iblock,
                     final long isplit, long z,
                     int ldz, long work, long iwork,
                     long ifailv );
    int dstein_work( int matrix_layout, int n, final long d,
                     final long e, int m, final long w,
                     final long iblock,
                     final long isplit, long z,
                     int ldz, long work, long iwork,
                     long ifailv );
    int cstein_work( int matrix_layout, int n, final long d,
                     final long e, int m, final long w,
                     final long iblock,
                     final long isplit,
                     IComplexNumber z, int ldz,
                     long work, long iwork,
                     long ifailv );
    int zstein_work( int matrix_layout, int n, final long d,
                     final long e, int m, final long w,
                     final long iblock,
                     final long isplit,
                     IComplexNumber z, int ldz,
                     long work, long iwork,
                     long ifailv );

    int sstemr_work( int matrix_layout, char jobz, char range,
                     int n, long d, long e, float vl,
                     float vu, int il, int iu,
                     long m, long w, long z,
                     int ldz, int nzc,
                     long isuppz,long  tryrac,
                     long work, int lwork,
                     long iwork, int liwork );
    int dstemr_work( int matrix_layout, char jobz, char range,
                     int n, long d, long e, double vl,
                     double vu, int il, int iu,
                     long m, long w, long z,
                     int ldz, int nzc,
                     long isuppz,long  tryrac,
                     long work, int lwork,
                     long iwork, int liwork );
    int cstemr_work( int matrix_layout, char jobz, char range,
                     int n, long d, long e, float vl,
                     float vu, int il, int iu,
                     long m, long w,
                     IComplexNumber z, int ldz,
                     int nzc, long isuppz,
                     long  tryrac, long work,
                     int lwork, long iwork,
                     int liwork );
    int zstemr_work( int matrix_layout, char jobz, char range,
                     int n, long d, long e, double vl,
                     double vu, int il, int iu,
                     long m, long w,
                     IComplexNumber z, int ldz,
                     int nzc, long isuppz,
                     long  tryrac, long work,
                     int lwork, long iwork,
                     int liwork );

    int ssteqr_work( int matrix_layout, char compz, int n,
                     long d, long e, long z, int ldz,
                     long work );
    int dsteqr_work( int matrix_layout, char compz, int n,
                     long d, long e, long z, int ldz,
                     long work );
    int csteqr_work( int matrix_layout, char compz, int n,
                     long d, long e, IComplexNumber z,
                     int ldz, long work );
    int zsteqr_work( int matrix_layout, char compz, int n,
                     long d, long e, IComplexNumber z,
                     int ldz, long work );

    int ssterf_work( int n, long d, long e );
    int dsterf_work( int n, long d, long e );

    int sstev_work( int matrix_layout, char jobz, int n,
                    long d, long e, long z, int ldz,
                    long work );
    int dstev_work( int matrix_layout, char jobz, int n,
                    long d, long e, long z, int ldz,
                    long work );

    int sstevd_work( int matrix_layout, char jobz, int n,
                     long d, long e, long z, int ldz,
                     long work, int lwork,
                     long iwork, int liwork );
    int dstevd_work( int matrix_layout, char jobz, int n,
                     long d, long e, long z, int ldz,
                     long work, int lwork,
                     long iwork, int liwork );

    int sstevr_work( int matrix_layout, char jobz, char range,
                     int n, long d, long e, float vl,
                     float vu, int il, int iu,
                     float abstol, long m, long w, long z,
                     int ldz, long isuppz, long work,
                     int lwork, long iwork,
                     int liwork );
    int dstevr_work( int matrix_layout, char jobz, char range,
                     int n, long d, long e, double vl,
                     double vu, int il, int iu,
                     double abstol, long m, long w,
                     long z, int ldz, long isuppz,
                     long work, int lwork,
                     long iwork, int liwork );

    int sstevx_work( int matrix_layout, char jobz, char range,
                     int n, long d, long e, float vl,
                     float vu, int il, int iu,
                     float abstol, long m, long w, long z,
                     int ldz, long work, long iwork,
                     long ifail );
    int dstevx_work( int matrix_layout, char jobz, char range,
                     int n, long d, long e, double vl,
                     double vu, int il, int iu,
                     double abstol, long m, long w,
                     long z, int ldz, long work,
                     long iwork, long ifail );

    int ssycon_work( int matrix_layout, char uplo, int n,
                     final long a, int lda,
                     final long ipiv, float anorm,
                     long rcond, long work, long iwork );
    int dsycon_work( int matrix_layout, char uplo, int n,
                     final long a, int lda,
                     final long ipiv, double anorm,
                     long rcond, long work,
                     long iwork );
    int csycon_work( int matrix_layout, char uplo, int n,
                     final IComplexNumber a, int lda,
                     final long ipiv, float anorm,
                     long rcond, IComplexNumber work );
    int zsycon_work( int matrix_layout, char uplo, int n,
                     final IComplexNumber a, int lda,
                     final long ipiv, double anorm,
                     long rcond, IComplexNumber work );

    int ssyequb_work( int matrix_layout, char uplo, int n,
                      final long a, int lda, long s,
                      long scond, long amax, long work );
    int dsyequb_work( int matrix_layout, char uplo, int n,
                      final long a, int lda, long s,
                      long scond, long amax, long work );
    int csyequb_work( int matrix_layout, char uplo, int n,
                      final IComplexNumber a, int lda,
                      long s, long scond, long amax,
                      IComplexNumber work );
    int zsyequb_work( int matrix_layout, char uplo, int n,
                      final IComplexNumber a, int lda,
                      long s, long scond, long amax,
                      IComplexNumber work );

    int ssyev_work( int matrix_layout, char jobz, char uplo,
                    int n, long a, int lda, long w,
                    long work, int lwork );
    int dsyev_work( int matrix_layout, char jobz, char uplo,
                    int n, long a, int lda,
                    long w, long work, int lwork );

    int ssyevd_work( int matrix_layout, char jobz, char uplo,
                     int n, long a, int lda,
                     long w, long work, int lwork,
                     long iwork, int liwork );
    int dsyevd_work( int matrix_layout, char jobz, char uplo,
                     int n, long a, int lda,
                     long w, long work, int lwork,
                     long iwork, int liwork );

    int ssyevr_work( int matrix_layout, char jobz, char range,
                     char uplo, int n, long a,
                     int lda, float vl, float vu,
                     int il, int iu, float abstol,
                     long m, long w, long z,
                     int ldz, long isuppz, long work,
                     int lwork, long iwork,
                     int liwork );
    int dsyevr_work( int matrix_layout, char jobz, char range,
                     char uplo, int n, long a,
                     int lda, double vl, double vu,
                     int il, int iu, double abstol,
                     long m, long w, long z,
                     int ldz, long isuppz,
                     long work, int lwork,
                     long iwork, int liwork );

    int ssyevx_work( int matrix_layout, char jobz, char range,
                     char uplo, int n, long a,
                     int lda, float vl, float vu,
                     int il, int iu, float abstol,
                     long m, long w, long z,
                     int ldz, long work, int lwork,
                     long iwork, long ifail );
    int dsyevx_work( int matrix_layout, char jobz, char range,
                     char uplo, int n, long a,
                     int lda, double vl, double vu,
                     int il, int iu, double abstol,
                     long m, long w, long z,
                     int ldz, long work, int lwork,
                     long iwork, long ifail );

    int ssygst_work( int matrix_layout, int itype, char uplo,
                     int n, long a, int lda,
                     final long b, int ldb );
    int dsygst_work( int matrix_layout, int itype, char uplo,
                     int n, long a, int lda,
                     final long b, int ldb );

    int ssygv_work( int matrix_layout, int itype, char jobz,
                    char uplo, int n, long a,
                    int lda, long b, int ldb,
                    long w, long work, int lwork );
    int dsygv_work( int matrix_layout, int itype, char jobz,
                    char uplo, int n, long a,
                    int lda, long b, int ldb,
                    long w, long work, int lwork );

    int ssygvd_work( int matrix_layout, int itype, char jobz,
                     char uplo, int n, long a,
                     int lda, long b, int ldb,
                     long w, long work, int lwork,
                     long iwork, int liwork );
    int dsygvd_work( int matrix_layout, int itype, char jobz,
                     char uplo, int n, long a,
                     int lda, long b, int ldb,
                     long w, long work, int lwork,
                     long iwork, int liwork );

    int ssygvx_work( int matrix_layout, int itype, char jobz,
                     char range, char uplo, int n, long a,
                     int lda, long b, int ldb,
                     float vl, float vu, int il,
                     int iu, float abstol, long m,
                     long w, long z, int ldz, long work,
                     int lwork, long iwork,
                     long ifail );
    int dsygvx_work( int matrix_layout, int itype, char jobz,
                     char range, char uplo, int n, long a,
                     int lda, long b, int ldb,
                     double vl, double vu, int il,
                     int iu, double abstol, long m,
                     long w, long z, int ldz,
                     long work, int lwork,
                     long iwork, long ifail );

    int ssyrfs_work( int matrix_layout, char uplo, int n,
                     int nrhs, final long a, int lda,
                     final long af, int ldaf,
                     final long ipiv, final long b,
                     int ldb, long x, int ldx,
                     long ferr, long berr, long work,
                     long iwork );
    int dsyrfs_work( int matrix_layout, char uplo, int n,
                     int nrhs, final long a,
                     int lda, final long af,
                     int ldaf, final long ipiv,
                     final long b, int ldb, long x,
                     int ldx, long ferr, long berr,
                     long work, long iwork );
    int csyrfs_work( int matrix_layout, char uplo, int n,
                     int nrhs, final IComplexNumber a,
                     int lda, final IComplexNumber af,
                     int ldaf, final long ipiv,
                     final IComplexNumber b, int ldb,
                     IComplexNumber x, int ldx,
                     long ferr, long berr,
                     IComplexNumber work, long rwork );
    int zsyrfs_work( int matrix_layout, char uplo, int n,
                     int nrhs, final IComplexNumber a,
                     int lda, final IComplexNumber af,
                     int ldaf, final long ipiv,
                     final IComplexNumber b, int ldb,
                     IComplexNumber x, int ldx,
                     long ferr, long berr,
                     IComplexNumber work, long rwork );

    int ssyrfsx_work( int matrix_layout, char uplo, char equed,
                      int n, int nrhs, final long a,
                      int lda, final long af,
                      int ldaf, final long ipiv,
                      final long s, final long b, int ldb,
                      long x, int ldx, long rcond,
                      long berr, int n_err_bnds,
                      long err_bnds_norm, long err_bnds_comp,
                      int nparams, long params, long work,
                      long iwork );
    int dsyrfsx_work( int matrix_layout, char uplo, char equed,
                      int n, int nrhs, final long a,
                      int lda, final long af,
                      int ldaf, final long ipiv,
                      final long s, final long b,
                      int ldb, long x, int ldx,
                      long rcond, long berr,
                      int n_err_bnds, long err_bnds_norm,
                      long err_bnds_comp, int nparams,
                      long params, long work,
                      long iwork );
    int csyrfsx_work( int matrix_layout, char uplo, char equed,
                      int n, int nrhs,
                      final IComplexNumber a, int lda,
                      final IComplexNumber af,
                      int ldaf, final long ipiv,
                      final long s, final IComplexNumber b,
                      int ldb, IComplexNumber x,
                      int ldx, long rcond, long berr,
                      int n_err_bnds, long err_bnds_norm,
                      long err_bnds_comp, int nparams,
                      long params, IComplexNumber work,
                      long rwork );
    int zsyrfsx_work( int matrix_layout, char uplo, char equed,
                      int n, int nrhs,
                      final IComplexNumber a, int lda,
                      final IComplexNumber af,
                      int ldaf, final long ipiv,
                      final long s,
                      final IComplexNumber b, int ldb,
                      IComplexNumber x, int ldx,
                      long rcond, long berr,
                      int n_err_bnds, long err_bnds_norm,
                      long err_bnds_comp, int nparams,
                      long params, IComplexNumber work,
                      long rwork );

    int ssysv_work( int matrix_layout, char uplo, int n,
                    int nrhs, long a, int lda,
                    long ipiv, long b, int ldb,
                    long work, int lwork );
    int dsysv_work( int matrix_layout, char uplo, int n,
                    int nrhs, long a, int lda,
                    long ipiv, long b, int ldb,
                    long work, int lwork );
    int csysv_work( int matrix_layout, char uplo, int n,
                    int nrhs, IComplexNumber a,
                    int lda, long ipiv,
                    IComplexNumber b, int ldb,
                    IComplexNumber work, int lwork );
    int zsysv_work( int matrix_layout, char uplo, int n,
                    int nrhs, IComplexNumber a,
                    int lda, long ipiv,
                    IComplexNumber b, int ldb,
                    IComplexNumber work, int lwork );

    int ssysvx_work( int matrix_layout, char fact, char uplo,
                     int n, int nrhs, final long a,
                     int lda, long af, int ldaf,
                     long ipiv, final long b,
                     int ldb, long x, int ldx,
                     long rcond, long ferr, long berr,
                     long work, int lwork,
                     long iwork );
    int dsysvx_work( int matrix_layout, char fact, char uplo,
                     int n, int nrhs, final long a,
                     int lda, long af, int ldaf,
                     long ipiv, final long b,
                     int ldb, long x, int ldx,
                     long rcond, long ferr, long berr,
                     long work, int lwork,
                     long iwork );
    int csysvx_work( int matrix_layout, char fact, char uplo,
                     int n, int nrhs,
                     final IComplexNumber a, int lda,
                     IComplexNumber af, int ldaf,
                     long ipiv, final IComplexNumber b,
                     int ldb, IComplexNumber x,
                     int ldx, long rcond, long ferr,
                     long berr, IComplexNumber work,
                     int lwork, long rwork );
    int zsysvx_work( int matrix_layout, char fact, char uplo,
                     int n, int nrhs,
                     final IComplexNumber a, int lda,
                     IComplexNumber af, int ldaf,
                     long ipiv,
                     final IComplexNumber b, int ldb,
                     IComplexNumber x, int ldx,
                     long rcond, long ferr, long berr,
                     IComplexNumber work, int lwork,
                     long rwork );

    int ssysvxx_work( int matrix_layout, char fact, char uplo,
                      int n, int nrhs, long a,
                      int lda, long af, int ldaf,
                      long ipiv, long equed, long s,
                      long b, int ldb, long x,
                      int ldx, long rcond, long rpvgrw,
                      long berr, int n_err_bnds,
                      long err_bnds_norm, long err_bnds_comp,
                      int nparams, long params, long work,
                      long iwork );
    int dsysvxx_work( int matrix_layout, char fact, char uplo,
                      int n, int nrhs, long a,
                      int lda, long af, int ldaf,
                      long ipiv, long equed, long s,
                      long b, int ldb, long x,
                      int ldx, long rcond, long rpvgrw,
                      long berr, int n_err_bnds,
                      long err_bnds_norm, long err_bnds_comp,
                      int nparams, long params,
                      long work, long iwork );
    int csysvxx_work( int matrix_layout, char fact, char uplo,
                      int n, int nrhs,
                      IComplexNumber a, int lda,
                      IComplexNumber af, int ldaf,
                      long ipiv, long equed, long s,
                      IComplexNumber b, int ldb,
                      IComplexNumber x, int ldx,
                      long rcond, long rpvgrw, long berr,
                      int n_err_bnds, long err_bnds_norm,
                      long err_bnds_comp, int nparams,
                      long params, IComplexNumber work,
                      long rwork );
    int zsysvxx_work( int matrix_layout, char fact, char uplo,
                      int n, int nrhs,
                      IComplexNumber a, int lda,
                      IComplexNumber af, int ldaf,
                      long ipiv, long equed, long s,
                      IComplexNumber b, int ldb,
                      IComplexNumber x, int ldx,
                      long rcond, long rpvgrw, long berr,
                      int n_err_bnds, long err_bnds_norm,
                      long err_bnds_comp, int nparams,
                      long params, IComplexNumber work,
                      long rwork );

    int ssytrd_work( int matrix_layout, char uplo, int n,
                     long a, int lda, long d, long e,
                     long tau, long work, int lwork );
    int dsytrd_work( int matrix_layout, char uplo, int n,
                     long a, int lda, long d, long e,
                     long tau, long work, int lwork );

    int ssytrf_work( int matrix_layout, char uplo, int n,
                     long a, int lda, long ipiv,
                     long work, int lwork );
    int dsytrf_work( int matrix_layout, char uplo, int n,
                     long a, int lda, long ipiv,
                     long work, int lwork );
    int csytrf_work( int matrix_layout, char uplo, int n,
                     IComplexNumber a, int lda,
                     long ipiv, IComplexNumber work,
                     int lwork );
    int zsytrf_work( int matrix_layout, char uplo, int n,
                     IComplexNumber a, int lda,
                     long ipiv, IComplexNumber work,
                     int lwork );

    int ssytri_work( int matrix_layout, char uplo, int n,
                     long a, int lda,
                     final long ipiv, long work );
    int dsytri_work( int matrix_layout, char uplo, int n,
                     long a, int lda,
                     final long ipiv, long work );
    int csytri_work( int matrix_layout, char uplo, int n,
                     IComplexNumber a, int lda,
                     final long ipiv,
                     IComplexNumber work );
    int zsytri_work( int matrix_layout, char uplo, int n,
                     IComplexNumber a, int lda,
                     final long ipiv,
                     IComplexNumber work );

    int ssytrs_work( int matrix_layout, char uplo, int n,
                     int nrhs, final long a, int lda,
                     final long ipiv, long b,
                     int ldb );
    int dsytrs_work( int matrix_layout, char uplo, int n,
                     int nrhs, final long a,
                     int lda, final long ipiv,
                     long b, int ldb );
    int csytrs_work( int matrix_layout, char uplo, int n,
                     int nrhs, final IComplexNumber a,
                     int lda, final long ipiv,
                     IComplexNumber b, int ldb );
    int zsytrs_work( int matrix_layout, char uplo, int n,
                     int nrhs, final IComplexNumber a,
                     int lda, final long ipiv,
                     IComplexNumber b, int ldb );

    int stbcon_work( int matrix_layout, char norm, char uplo,
                     char diag, int n, int kd,
                     final long ab, int ldab, long rcond,
                     long work, long iwork );
    int dtbcon_work( int matrix_layout, char norm, char uplo,
                     char diag, int n, int kd,
                     final long ab, int ldab,
                     long rcond, long work,
                     long iwork );
    int ctbcon_work( int matrix_layout, char norm, char uplo,
                     char diag, int n, int kd,
                     final IComplexNumber ab, int ldab,
                     long rcond, IComplexNumber work,
                     long rwork );
    int ztbcon_work( int matrix_layout, char norm, char uplo,
                     char diag, int n, int kd,
                     final IComplexNumber ab,
                     int ldab, long rcond,
                     IComplexNumber work, long rwork );

    int stbrfs_work( int matrix_layout, char uplo, char trans,
                     char diag, int n, int kd,
                     int nrhs, final long ab,
                     int ldab, final long b, int ldb,
                     final long x, int ldx, long ferr,
                     long berr, long work, long iwork );
    int dtbrfs_work( int matrix_layout, char uplo, char trans,
                     char diag, int n, int kd,
                     int nrhs, final long ab,
                     int ldab, final long b,
                     int ldb, final long x, int ldx,
                     long ferr, long berr, long work,
                     long iwork );
    int ctbrfs_work( int matrix_layout, char uplo, char trans,
                     char diag, int n, int kd,
                     int nrhs, final IComplexNumber ab,
                     int ldab, final IComplexNumber b,
                     int ldb, final IComplexNumber x,
                     int ldx, long ferr, long berr,
                     IComplexNumber work, long rwork );
    int ztbrfs_work( int matrix_layout, char uplo, char trans,
                     char diag, int n, int kd,
                     int nrhs,
                     final IComplexNumber ab,
                     int ldab, final IComplexNumber b,
                     int ldb, final IComplexNumber x,
                     int ldx, long ferr, long berr,
                     IComplexNumber work, long rwork );

    int stbtrs_work( int matrix_layout, char uplo, char trans,
                     char diag, int n, int kd,
                     int nrhs, final long ab,
                     int ldab, long b, int ldb );
    int dtbtrs_work( int matrix_layout, char uplo, char trans,
                     char diag, int n, int kd,
                     int nrhs, final long ab,
                     int ldab, long b, int ldb );
    int ctbtrs_work( int matrix_layout, char uplo, char trans,
                     char diag, int n, int kd,
                     int nrhs, final IComplexNumber ab,
                     int ldab, IComplexNumber b,
                     int ldb );
    int ztbtrs_work( int matrix_layout, char uplo, char trans,
                     char diag, int n, int kd,
                     int nrhs,
                     final IComplexNumber ab,
                     int ldab, IComplexNumber b,
                     int ldb );

    int stfsm_work( int matrix_layout, char transr, char side,
                    char uplo, char trans, char diag, int m,
                    int n, float alpha, final long a,
                    long b, int ldb );
    int dtfsm_work( int matrix_layout, char transr, char side,
                    char uplo, char trans, char diag, int m,
                    int n, double alpha, final long a,
                    long b, int ldb );
    int ctfsm_work( int matrix_layout, char transr, char side,
                    char uplo, char trans, char diag, int m,
                    int n, IComplexNumber alpha,
                    final IComplexNumber a,
                    IComplexNumber b, int ldb );
    int ztfsm_work( int matrix_layout, char transr, char side,
                    char uplo, char trans, char diag, int m,
                    int n, IComplexNumber alpha,
                    final IComplexNumber a,
                    IComplexNumber b, int ldb );

    int stftri_work( int matrix_layout, char transr, char uplo,
                     char diag, int n, long a );
    int dtftri_work( int matrix_layout, char transr, char uplo,
                     char diag, int n, long a );
    int ctftri_work( int matrix_layout, char transr, char uplo,
                     char diag, int n,
                     IComplexNumber a );
    int ztftri_work( int matrix_layout, char transr, char uplo,
                     char diag, int n,
                     IComplexNumber a );

    int stfttp_work( int matrix_layout, char transr, char uplo,
                     int n, final long arf, long ap );
    int dtfttp_work( int matrix_layout, char transr, char uplo,
                     int n, final long arf, long ap );
    int ctfttp_work( int matrix_layout, char transr, char uplo,
                     int n, final IComplexNumber arf,
                     IComplexNumber ap );
    int ztfttp_work( int matrix_layout, char transr, char uplo,
                     int n, final IComplexNumber arf,
                     IComplexNumber ap );

    int stfttr_work( int matrix_layout, char transr, char uplo,
                     int n, final long arf, long a,
                     int lda );
    int dtfttr_work( int matrix_layout, char transr, char uplo,
                     int n, final long arf, long a,
                     int lda );
    int ctfttr_work( int matrix_layout, char transr, char uplo,
                     int n, final IComplexNumber arf,
                     IComplexNumber a, int lda );
    int ztfttr_work( int matrix_layout, char transr, char uplo,
                     int n, final IComplexNumber arf,
                     IComplexNumber a, int lda );

    int stgevc_work( int matrix_layout, char side, char howmny,
                     long   select, int n,
                     final long s, int lds, final long p,
                     int ldp, long vl, int ldvl,
                     long vr, int ldvr, int mm,
                     long m, long work );
    int dtgevc_work( int matrix_layout, char side, char howmny,
                     long   select, int n,
                     final long s, int lds,
                     final long p, int ldp, long vl,
                     int ldvl, long vr, int ldvr,
                     int mm, long m, long work );
    int ctgevc_work( int matrix_layout, char side, char howmny,
                     long   select, int n,
                     final IComplexNumber s, int lds,
                     final IComplexNumber p, int ldp,
                     IComplexNumber vl, int ldvl,
                     IComplexNumber vr, int ldvr,
                     int mm, long m,
                     IComplexNumber work, long rwork );
    int ztgevc_work( int matrix_layout, char side, char howmny,
                     long   select, int n,
                     final IComplexNumber s, int lds,
                     final IComplexNumber p, int ldp,
                     IComplexNumber vl, int ldvl,
                     IComplexNumber vr, int ldvr,
                     int mm, long m,
                     IComplexNumber work, long rwork );

    int stgexc_work( int matrix_layout,boolean wantq,
                     boolean wantz, int n, long a,
                     int lda, long b, int ldb,
                     long q, int ldq, long z,
                     int ldz, long ifst,
                     long ilst, long work,
                     int lwork );
    int dtgexc_work( int matrix_layout,boolean wantq,
                     boolean wantz, int n, long a,
                     int lda, long b, int ldb,
                     long q, int ldq, long z,
                     int ldz, long ifst,
                     long ilst, long work,
                     int lwork );
    int ctgexc_work( int matrix_layout,boolean wantq,
                     boolean wantz, int n,
                     IComplexNumber a, int lda,
                     IComplexNumber b, int ldb,
                     IComplexNumber q, int ldq,
                     IComplexNumber z, int ldz,
                     int ifst, int ilst );
    int ztgexc_work( int matrix_layout,boolean wantq,
                     boolean wantz, int n,
                     IComplexNumber a, int lda,
                     IComplexNumber b, int ldb,
                     IComplexNumber q, int ldq,
                     IComplexNumber z, int ldz,
                     int ifst, int ilst );

    int stgsen_work( int matrix_layout, int ijob,
                     boolean wantq,boolean wantz,
                     long   select, int n,
                     long a, int lda, long b,
                     int ldb, long alphar, long alphai,
                     long beta, long q, int ldq, long z,
                     int ldz, long m, long pl,
                     long pr, long dif, long work,
                     int lwork, long iwork,
                     int liwork );
    int dtgsen_work( int matrix_layout, int ijob,
                     boolean wantq,boolean wantz,
                     long   select, int n,
                     long a, int lda, long b,
                     int ldb, long alphar, long alphai,
                     long beta, long q, int ldq,
                     long z, int ldz, long m,
                     long pl, long pr, long dif,
                     long work, int lwork,
                     long iwork, int liwork );
    int ctgsen_work( int matrix_layout, int ijob,
                     boolean wantq,boolean wantz,
                     long   select, int n,
                     IComplexNumber a, int lda,
                     IComplexNumber b, int ldb,
                     IComplexNumber alpha,
                     IComplexNumber beta,
                     IComplexNumber q, int ldq,
                     IComplexNumber z, int ldz,
                     long m, long pl, long pr, long dif,
                     IComplexNumber work, int lwork,
                     long iwork, int liwork );
    int ztgsen_work( int matrix_layout, int ijob,
                     boolean wantq,boolean wantz,
                     long   select, int n,
                     IComplexNumber a, int lda,
                     IComplexNumber b, int ldb,
                     IComplexNumber alpha,
                     IComplexNumber beta,
                     IComplexNumber q, int ldq,
                     IComplexNumber z, int ldz,
                     long m, long pl, long pr,
                     long dif, IComplexNumber work,
                     int lwork, long iwork,
                     int liwork );

    int stgsja_work( int matrix_layout, char jobu, char jobv,
                     char jobq, int m, int p,
                     int n, int k, int l,
                     long a, int lda, long b,
                     int ldb, float tola, float tolb,
                     long alpha, long beta, long u,
                     int ldu, long v, int ldv,
                     long q, int ldq, long work,
                     long ncycle );
    int dtgsja_work( int matrix_layout, char jobu, char jobv,
                     char jobq, int m, int p,
                     int n, int k, int l,
                     long a, int lda, long b,
                     int ldb, double tola, double tolb,
                     long alpha, long beta, long u,
                     int ldu, long v, int ldv,
                     long q, int ldq, long work,
                     long ncycle );
    int ctgsja_work( int matrix_layout, char jobu, char jobv,
                     char jobq, int m, int p,
                     int n, int k, int l,
                     IComplexNumber a, int lda,
                     IComplexNumber b, int ldb,
                     float tola, float tolb, long alpha,
                     long beta, IComplexNumber u,
                     int ldu, IComplexNumber v,
                     int ldv, IComplexNumber q,
                     int ldq, IComplexNumber work,
                     long ncycle );
    int ztgsja_work( int matrix_layout, char jobu, char jobv,
                     char jobq, int m, int p,
                     int n, int k, int l,
                     IComplexNumber a, int lda,
                     IComplexNumber b, int ldb,
                     double tola, double tolb, long alpha,
                     long beta, IComplexNumber u,
                     int ldu, IComplexNumber v,
                     int ldv, IComplexNumber q,
                     int ldq, IComplexNumber work,
                     long ncycle );

    int stgsna_work( int matrix_layout, char job, char howmny,
                     long   select, int n,
                     final long a, int lda, final long b,
                     int ldb, final long vl,
                     int ldvl, final long vr,
                     int ldvr, long s, long dif,
                     int mm, long m, long work,
                     int lwork, long iwork );
    int dtgsna_work( int matrix_layout, char job, char howmny,
                     long   select, int n,
                     final long a, int lda,
                     final long b, int ldb,
                     final long vl, int ldvl,
                     final long vr, int ldvr, long s,
                     long dif, int mm, long m,
                     long work, int lwork,
                     long iwork );
    int ctgsna_work( int matrix_layout, char job, char howmny,
                     long   select, int n,
                     final IComplexNumber a, int lda,
                     final IComplexNumber b, int ldb,
                     final IComplexNumber vl, int ldvl,
                     final IComplexNumber vr, int ldvr,
                     long s, long dif, int mm,
                     long m, IComplexNumber work,
                     int lwork, long iwork );
    int ztgsna_work( int matrix_layout, char job, char howmny,
                     long   select, int n,
                     final IComplexNumber a, int lda,
                     final IComplexNumber b, int ldb,
                     final IComplexNumber vl,
                     int ldvl,
                     final IComplexNumber vr,
                     int ldvr, long s, long dif,
                     int mm, long m,
                     IComplexNumber work, int lwork,
                     long iwork );

    int stgsyl_work( int matrix_layout, char trans, int ijob,
                     int m, int n, final long a,
                     int lda, final long b, int ldb,
                     long c, int ldc, final long d,
                     int ldd, final long e, int lde,
                     long f, int ldf, long scale,
                     long dif, long work, int lwork,
                     long iwork );
    int dtgsyl_work( int matrix_layout, char trans, int ijob,
                     int m, int n, final long a,
                     int lda, final long b, int ldb,
                     long c, int ldc, final long d,
                     int ldd, final long e, int lde,
                     long f, int ldf, long scale,
                     long dif, long work, int lwork,
                     long iwork );
    int ctgsyl_work( int matrix_layout, char trans, int ijob,
                     int m, int n,
                     final IComplexNumber a, int lda,
                     final IComplexNumber b, int ldb,
                     IComplexNumber c, int ldc,
                     final IComplexNumber d, int ldd,
                     final IComplexNumber e, int lde,
                     IComplexNumber f, int ldf,
                     long scale, long dif,
                     IComplexNumber work, int lwork,
                     long iwork );
    int ztgsyl_work( int matrix_layout, char trans, int ijob,
                     int m, int n,
                     final IComplexNumber a, int lda,
                     final IComplexNumber b, int ldb,
                     IComplexNumber c, int ldc,
                     final IComplexNumber d, int ldd,
                     final IComplexNumber e, int lde,
                     IComplexNumber f, int ldf,
                     long scale, long dif,
                     IComplexNumber work, int lwork,
                     long iwork );

    int stpcon_work( int matrix_layout, char norm, char uplo,
                     char diag, int n, final long ap,
                     long rcond, long work, long iwork );
    int dtpcon_work( int matrix_layout, char norm, char uplo,
                     char diag, int n, final long ap,
                     long rcond, long work,
                     long iwork );
    int ctpcon_work( int matrix_layout, char norm, char uplo,
                     char diag, int n,
                     final IComplexNumber ap, long rcond,
                     IComplexNumber work, long rwork );
    int ztpcon_work( int matrix_layout, char norm, char uplo,
                     char diag, int n,
                     final IComplexNumber ap, long rcond,
                     IComplexNumber work, long rwork );

    int stprfs_work( int matrix_layout, char uplo, char trans,
                     char diag, int n, int nrhs,
                     final long ap, final long b, int ldb,
                     final long x, int ldx, long ferr,
                     long berr, long work, long iwork );
    int dtprfs_work( int matrix_layout, char uplo, char trans,
                     char diag, int n, int nrhs,
                     final long ap, final long b,
                     int ldb, final long x, int ldx,
                     long ferr, long berr, long work,
                     long iwork );
    int ctprfs_work( int matrix_layout, char uplo, char trans,
                     char diag, int n, int nrhs,
                     final IComplexNumber ap,
                     final IComplexNumber b, int ldb,
                     final IComplexNumber x, int ldx,
                     long ferr, long berr,
                     IComplexNumber work, long rwork );
    int ztprfs_work( int matrix_layout, char uplo, char trans,
                     char diag, int n, int nrhs,
                     final IComplexNumber ap,
                     final IComplexNumber b, int ldb,
                     final IComplexNumber x, int ldx,
                     long ferr, long berr,
                     IComplexNumber work, long rwork );

    int stptri_work( int matrix_layout, char uplo, char diag,
                     int n, long ap );
    int dtptri_work( int matrix_layout, char uplo, char diag,
                     int n, long ap );
    int ctptri_work( int matrix_layout, char uplo, char diag,
                     int n, IComplexNumber ap );
    int ztptri_work( int matrix_layout, char uplo, char diag,
                     int n, IComplexNumber ap );

    int stptrs_work( int matrix_layout, char uplo, char trans,
                     char diag, int n, int nrhs,
                     final long ap, long b, int ldb );
    int dtptrs_work( int matrix_layout, char uplo, char trans,
                     char diag, int n, int nrhs,
                     final long ap, long b, int ldb );
    int ctptrs_work( int matrix_layout, char uplo, char trans,
                     char diag, int n, int nrhs,
                     final IComplexNumber ap,
                     IComplexNumber b, int ldb );
    int ztptrs_work( int matrix_layout, char uplo, char trans,
                     char diag, int n, int nrhs,
                     final IComplexNumber ap,
                     IComplexNumber b, int ldb );

    int stpttf_work( int matrix_layout, char transr, char uplo,
                     int n, final long ap, long arf );
    int dtpttf_work( int matrix_layout, char transr, char uplo,
                     int n, final long ap, long arf );
    int ctpttf_work( int matrix_layout, char transr, char uplo,
                     int n, final IComplexNumber ap,
                     IComplexNumber arf );
    int ztpttf_work( int matrix_layout, char transr, char uplo,
                     int n, final IComplexNumber ap,
                     IComplexNumber arf );

    int stpttr_work( int matrix_layout, char uplo, int n,
                     final long ap, long a, int lda );
    int dtpttr_work( int matrix_layout, char uplo, int n,
                     final long ap, long a, int lda );
    int ctpttr_work( int matrix_layout, char uplo, int n,
                     final IComplexNumber ap,
                     IComplexNumber a, int lda );
    int ztpttr_work( int matrix_layout, char uplo, int n,
                     final IComplexNumber ap,
                     IComplexNumber a, int lda );

    int strcon_work( int matrix_layout, char norm, char uplo,
                     char diag, int n, final long a,
                     int lda, long rcond, long work,
                     long iwork );
    int dtrcon_work( int matrix_layout, char norm, char uplo,
                     char diag, int n, final long a,
                     int lda, long rcond, long work,
                     long iwork );
    int ctrcon_work( int matrix_layout, char norm, char uplo,
                     char diag, int n,
                     final IComplexNumber a, int lda,
                     long rcond, IComplexNumber work,
                     long rwork );
    int ztrcon_work( int matrix_layout, char norm, char uplo,
                     char diag, int n,
                     final IComplexNumber a, int lda,
                     long rcond, IComplexNumber work,
                     long rwork );

    int strevc_work( int matrix_layout, char side, char howmny,
                     long  select, int n,
                     final long t, int ldt, long vl,
                     int ldvl, long vr, int ldvr,
                     int mm, long m, long work );
    int dtrevc_work( int matrix_layout, char side, char howmny,
                     long  select, int n,
                     final long t, int ldt, long vl,
                     int ldvl, long vr, int ldvr,
                     int mm, long m, long work );
    int ctrevc_work( int matrix_layout, char side, char howmny,
                     long   select, int n,
                     IComplexNumber t, int ldt,
                     IComplexNumber vl, int ldvl,
                     IComplexNumber vr, int ldvr,
                     int mm, long m,
                     IComplexNumber work, long rwork );
    int ztrevc_work( int matrix_layout, char side, char howmny,
                     long   select, int n,
                     IComplexNumber t, int ldt,
                     IComplexNumber vl, int ldvl,
                     IComplexNumber vr, int ldvr,
                     int mm, long m,
                     IComplexNumber work, long rwork );

    int strexc_work( int matrix_layout, char compq, int n,
                     long t, int ldt, long q,
                     int ldq, long ifst,
                     long ilst, long work );
    int dtrexc_work( int matrix_layout, char compq, int n,
                     long t, int ldt, long q,
                     int ldq, long ifst,
                     long ilst, long work );
    int ctrexc_work( int matrix_layout, char compq, int n,
                     IComplexNumber t, int ldt,
                     IComplexNumber q, int ldq,
                     int ifst, int ilst );
    int ztrexc_work( int matrix_layout, char compq, int n,
                     IComplexNumber t, int ldt,
                     IComplexNumber q, int ldq,
                     int ifst, int ilst );

    int strrfs_work( int matrix_layout, char uplo, char trans,
                     char diag, int n, int nrhs,
                     final long a, int lda, final long b,
                     int ldb, final long x, int ldx,
                     long ferr, long berr, long work,
                     long iwork );
    int dtrrfs_work( int matrix_layout, char uplo, char trans,
                     char diag, int n, int nrhs,
                     final long a, int lda,
                     final long b, int ldb,
                     final long x, int ldx, long ferr,
                     long berr, long work, long iwork );
    int ctrrfs_work( int matrix_layout, char uplo, char trans,
                     char diag, int n, int nrhs,
                     final IComplexNumber a, int lda,
                     final IComplexNumber b, int ldb,
                     final IComplexNumber x, int ldx,
                     long ferr, long berr,
                     IComplexNumber work, long rwork );
    int ztrrfs_work( int matrix_layout, char uplo, char trans,
                     char diag, int n, int nrhs,
                     final IComplexNumber a, int lda,
                     final IComplexNumber b, int ldb,
                     final IComplexNumber x, int ldx,
                     long ferr, long berr,
                     IComplexNumber work, long rwork );

    int strsen_work( int matrix_layout, char job, char compq,
                     long   select, int n,
                     long t, int ldt, long q,
                     int ldq, long wr, long wi,
                     long m, long s, long sep,
                     long work, int lwork,
                     long iwork, int liwork );
    int dtrsen_work( int matrix_layout, char job, char compq,
                     long   select, int n,
                     long t, int ldt, long q,
                     int ldq, long wr, long wi,
                     long m, long s, long sep,
                     long work, int lwork,
                     long iwork, int liwork );
    int ctrsen_work( int matrix_layout, char job, char compq,
                     long   select, int n,
                     IComplexNumber t, int ldt,
                     IComplexNumber q, int ldq,
                     IComplexNumber w, long m,
                     long s, long sep,
                     IComplexNumber work, int lwork );
    int ztrsen_work( int matrix_layout, char job, char compq,
                     long   select, int n,
                     IComplexNumber t, int ldt,
                     IComplexNumber q, int ldq,
                     IComplexNumber w, long m,
                     long s, long sep,
                     IComplexNumber work, int lwork );

    int strsna_work( int matrix_layout, char job, char howmny,
                     long   select, int n,
                     final long t, int ldt, final long vl,
                     int ldvl, final long vr,
                     int ldvr, long s, long sep,
                     int mm, long m, long work,
                     int ldwork, long iwork );
    int dtrsna_work( int matrix_layout, char job, char howmny,
                     long   select, int n,
                     final long t, int ldt,
                     final long vl, int ldvl,
                     final long vr, int ldvr, long s,
                     long sep, int mm, long m,
                     long work, int ldwork,
                     long iwork );
    int ctrsna_work( int matrix_layout, char job, char howmny,
                     long   select, int n,
                     final IComplexNumber t, int ldt,
                     final IComplexNumber vl, int ldvl,
                     final IComplexNumber vr, int ldvr,
                     long s, long sep, int mm,
                     long m, IComplexNumber work,
                     int ldwork, long rwork );
    int ztrsna_work( int matrix_layout, char job, char howmny,
                     long   select, int n,
                     final IComplexNumber t, int ldt,
                     final IComplexNumber vl,
                     int ldvl,
                     final IComplexNumber vr,
                     int ldvr, long s, long sep,
                     int mm, long m,
                     IComplexNumber work, int ldwork,
                     long rwork );

    int strsyl_work( int matrix_layout, char trana, char tranb,
                     int isgn, int m, int n,
                     final long a, int lda, final long b,
                     int ldb, long c, int ldc,
                     long scale );
    int dtrsyl_work( int matrix_layout, char trana, char tranb,
                     int isgn, int m, int n,
                     final long a, int lda,
                     final long b, int ldb, long c,
                     int ldc, long scale );
    int ctrsyl_work( int matrix_layout, char trana, char tranb,
                     int isgn, int m, int n,
                     final IComplexNumber a, int lda,
                     final IComplexNumber b, int ldb,
                     IComplexNumber c, int ldc,
                     long scale );
    int ztrsyl_work( int matrix_layout, char trana, char tranb,
                     int isgn, int m, int n,
                     final IComplexNumber a, int lda,
                     final IComplexNumber b, int ldb,
                     IComplexNumber c, int ldc,
                     long scale );

    int strtri_work( int matrix_layout, char uplo, char diag,
                     int n, long a, int lda );
    int dtrtri_work( int matrix_layout, char uplo, char diag,
                     int n, long a, int lda );
    int ctrtri_work( int matrix_layout, char uplo, char diag,
                     int n, IComplexNumber a,
                     int lda );
    int ztrtri_work( int matrix_layout, char uplo, char diag,
                     int n, IComplexNumber a,
                     int lda );

    int strtrs_work( int matrix_layout, char uplo, char trans,
                     char diag, int n, int nrhs,
                     final long a, int lda, long b,
                     int ldb );
    int dtrtrs_work( int matrix_layout, char uplo, char trans,
                     char diag, int n, int nrhs,
                     final long a, int lda, long b,
                     int ldb );
    int ctrtrs_work( int matrix_layout, char uplo, char trans,
                     char diag, int n, int nrhs,
                     final IComplexNumber a, int lda,
                     IComplexNumber b, int ldb );
    int ztrtrs_work( int matrix_layout, char uplo, char trans,
                     char diag, int n, int nrhs,
                     final IComplexNumber a, int lda,
                     IComplexNumber b, int ldb );

    int strttf_work( int matrix_layout, char transr, char uplo,
                     int n, final long a, int lda,
                     long arf );
    int dtrttf_work( int matrix_layout, char transr, char uplo,
                     int n, final long a, int lda,
                     long arf );
    int ctrttf_work( int matrix_layout, char transr, char uplo,
                     int n, final IComplexNumber a,
                     int lda, IComplexNumber arf );
    int ztrttf_work( int matrix_layout, char transr, char uplo,
                     int n, final IComplexNumber a,
                     int lda, IComplexNumber arf );

    int strttp_work( int matrix_layout, char uplo, int n,
                     final long a, int lda, long ap );
    int dtrttp_work( int matrix_layout, char uplo, int n,
                     final long a, int lda, long ap );
    int ctrttp_work( int matrix_layout, char uplo, int n,
                     final IComplexNumber a, int lda,
                     IComplexNumber ap );
    int ztrttp_work( int matrix_layout, char uplo, int n,
                     final IComplexNumber a, int lda,
                     IComplexNumber ap );

    int stzrzf_work( int matrix_layout, int m, int n,
                     long a, int lda, long tau,
                     long work, int lwork );
    int dtzrzf_work( int matrix_layout, int m, int n,
                     long a, int lda, long tau,
                     long work, int lwork );
    int ctzrzf_work( int matrix_layout, int m, int n,
                     IComplexNumber a, int lda,
                     IComplexNumber tau,
                     IComplexNumber work, int lwork );
    int ztzrzf_work( int matrix_layout, int m, int n,
                     IComplexNumber a, int lda,
                     IComplexNumber tau,
                     IComplexNumber work, int lwork );

    int cungbr_work( int matrix_layout, char vect, int m,
                     int n, int k,
                     IComplexNumber a, int lda,
                     final IComplexNumber tau,
                     IComplexNumber work, int lwork );
    int zungbr_work( int matrix_layout, char vect, int m,
                     int n, int k,
                     IComplexNumber a, int lda,
                     final IComplexNumber tau,
                     IComplexNumber work, int lwork );

    int cunghr_work( int matrix_layout, int n, int ilo,
                     int ihi, IComplexNumber a,
                     int lda, final IComplexNumber tau,
                     IComplexNumber work, int lwork );
    int zunghr_work( int matrix_layout, int n, int ilo,
                     int ihi, IComplexNumber a,
                     int lda,
                     final IComplexNumber tau,
                     IComplexNumber work, int lwork );

    int cunglq_work( int matrix_layout, int m, int n,
                     int k, IComplexNumber a,
                     int lda, final IComplexNumber tau,
                     IComplexNumber work, int lwork );
    int zunglq_work( int matrix_layout, int m, int n,
                     int k, IComplexNumber a,
                     int lda,
                     final IComplexNumber tau,
                     IComplexNumber work, int lwork );

    int cungql_work( int matrix_layout, int m, int n,
                     int k, IComplexNumber a,
                     int lda, final IComplexNumber tau,
                     IComplexNumber work, int lwork );
    int zungql_work( int matrix_layout, int m, int n,
                     int k, IComplexNumber a,
                     int lda,
                     final IComplexNumber tau,
                     IComplexNumber work, int lwork );

    int cungqr_work( int matrix_layout, int m, int n,
                     int k, IComplexNumber a,
                     int lda, final IComplexNumber tau,
                     IComplexNumber work, int lwork );
    int zungqr_work( int matrix_layout, int m, int n,
                     int k, IComplexNumber a,
                     int lda,
                     final IComplexNumber tau,
                     IComplexNumber work, int lwork );

    int cungrq_work( int matrix_layout, int m, int n,
                     int k, IComplexNumber a,
                     int lda, final IComplexNumber tau,
                     IComplexNumber work, int lwork );
    int zungrq_work( int matrix_layout, int m, int n,
                     int k, IComplexNumber a,
                     int lda,
                     final IComplexNumber tau,
                     IComplexNumber work, int lwork );

    int cungtr_work( int matrix_layout, char uplo, int n,
                     IComplexNumber a, int lda,
                     final IComplexNumber tau,
                     IComplexNumber work, int lwork );
    int zungtr_work( int matrix_layout, char uplo, int n,
                     IComplexNumber a, int lda,
                     final IComplexNumber tau,
                     IComplexNumber work, int lwork );

    int cunmbr_work( int matrix_layout, char vect, char side,
                     char trans, int m, int n,
                     int k, final IComplexNumber a,
                     int lda, final IComplexNumber tau,
                     IComplexNumber c, int ldc,
                     IComplexNumber work, int lwork );
    int zunmbr_work( int matrix_layout, char vect, char side,
                     char trans, int m, int n,
                     int k, final IComplexNumber a,
                     int lda,
                     final IComplexNumber tau,
                     IComplexNumber c, int ldc,
                     IComplexNumber work, int lwork );

    int cunmhr_work( int matrix_layout, char side, char trans,
                     int m, int n, int ilo,
                     int ihi, final IComplexNumber a,
                     int lda, final IComplexNumber tau,
                     IComplexNumber c, int ldc,
                     IComplexNumber work, int lwork );
    int zunmhr_work( int matrix_layout, char side, char trans,
                     int m, int n, int ilo,
                     int ihi, final IComplexNumber a,
                     int lda,
                     final IComplexNumber tau,
                     IComplexNumber c, int ldc,
                     IComplexNumber work, int lwork );

    int cunmlq_work( int matrix_layout, char side, char trans,
                     int m, int n, int k,
                     final IComplexNumber a, int lda,
                     final IComplexNumber tau,
                     IComplexNumber c, int ldc,
                     IComplexNumber work, int lwork );
    int zunmlq_work( int matrix_layout, char side, char trans,
                     int m, int n, int k,
                     final IComplexNumber a, int lda,
                     final IComplexNumber tau,
                     IComplexNumber c, int ldc,
                     IComplexNumber work, int lwork );

    int cunmql_work( int matrix_layout, char side, char trans,
                     int m, int n, int k,
                     final IComplexNumber a, int lda,
                     final IComplexNumber tau,
                     IComplexNumber c, int ldc,
                     IComplexNumber work, int lwork );
    int zunmql_work( int matrix_layout, char side, char trans,
                     int m, int n, int k,
                     final IComplexNumber a, int lda,
                     final IComplexNumber tau,
                     IComplexNumber c, int ldc,
                     IComplexNumber work, int lwork );

    int cunmqr_work( int matrix_layout, char side, char trans,
                     int m, int n, int k,
                     final IComplexNumber a, int lda,
                     final IComplexNumber tau,
                     IComplexNumber c, int ldc,
                     IComplexNumber work, int lwork );
    int zunmqr_work( int matrix_layout, char side, char trans,
                     int m, int n, int k,
                     final IComplexNumber a, int lda,
                     final IComplexNumber tau,
                     IComplexNumber c, int ldc,
                     IComplexNumber work, int lwork );

    int cunmrq_work( int matrix_layout, char side, char trans,
                     int m, int n, int k,
                     final IComplexNumber a, int lda,
                     final IComplexNumber tau,
                     IComplexNumber c, int ldc,
                     IComplexNumber work, int lwork );
    int zunmrq_work( int matrix_layout, char side, char trans,
                     int m, int n, int k,
                     final IComplexNumber a, int lda,
                     final IComplexNumber tau,
                     IComplexNumber c, int ldc,
                     IComplexNumber work, int lwork );

    int cunmrz_work( int matrix_layout, char side, char trans,
                     int m, int n, int k,
                     int l, final IComplexNumber a,
                     int lda, final IComplexNumber tau,
                     IComplexNumber c, int ldc,
                     IComplexNumber work, int lwork );
    int zunmrz_work( int matrix_layout, char side, char trans,
                     int m, int n, int k,
                     int l, final IComplexNumber a,
                     int lda,
                     final IComplexNumber tau,
                     IComplexNumber c, int ldc,
                     IComplexNumber work, int lwork );

    int cunmtr_work( int matrix_layout, char side, char uplo,
                     char trans, int m, int n,
                     final IComplexNumber a, int lda,
                     final IComplexNumber tau,
                     IComplexNumber c, int ldc,
                     IComplexNumber work, int lwork );
    int zunmtr_work( int matrix_layout, char side, char uplo,
                     char trans, int m, int n,
                     final IComplexNumber a, int lda,
                     final IComplexNumber tau,
                     IComplexNumber c, int ldc,
                     IComplexNumber work, int lwork );

    int cupgtr_work( int matrix_layout, char uplo, int n,
                     final IComplexNumber ap,
                     final IComplexNumber tau,
                     IComplexNumber q, int ldq,
                     IComplexNumber work );
    int zupgtr_work( int matrix_layout, char uplo, int n,
                     final IComplexNumber ap,
                     final IComplexNumber tau,
                     IComplexNumber q, int ldq,
                     IComplexNumber work );

    int cupmtr_work( int matrix_layout, char side, char uplo,
                     char trans, int m, int n,
                     final IComplexNumber ap,
                     final IComplexNumber tau,
                     IComplexNumber c, int ldc,
                     IComplexNumber work );
    int zupmtr_work( int matrix_layout, char side, char uplo,
                     char trans, int m, int n,
                     final IComplexNumber ap,
                     final IComplexNumber tau,
                     IComplexNumber c, int ldc,
                     IComplexNumber work );

    int claghe( int matrix_layout, int n, int k,
                final long d, IComplexNumber a,
                int lda, long iseed );
    int zlaghe( int matrix_layout, int n, int k,
                final long d, IComplexNumber a,
                int lda, long iseed );

    int slagsy( int matrix_layout, int n, int k,
                final long d, long a, int lda,
                long iseed );
    int dlagsy( int matrix_layout, int n, int k,
                final long d, long a, int lda,
                long iseed );
    int clagsy( int matrix_layout, int n, int k,
                final long d, IComplexNumber a,
                int lda, long iseed );
    int zlagsy( int matrix_layout, int n, int k,
                final long d, IComplexNumber a,
                int lda, long iseed );

    int slapmr( int matrix_layout,boolean forwrd,
                int m, int n, long x, int ldx,
                long k );
    int dlapmr( int matrix_layout,boolean forwrd,
                int m, int n, long x,
                int ldx, long k );
    int clapmr( int matrix_layout,boolean forwrd,
                int m, int n, IComplexNumber x,
                int ldx, long k );
    int zlapmr( int matrix_layout,boolean forwrd,
                int m, int n, IComplexNumber x,
                int ldx, long k );

    int slapmt( int matrix_layout,boolean forwrd,
                int m, int n, long x, int ldx,
                long k );
    int dlapmt( int matrix_layout,boolean forwrd,
                int m, int n, long x,
                int ldx, long k );
    int clapmt( int matrix_layout,boolean forwrd,
                int m, int n, IComplexNumber x,
                int ldx, long k );
    int zlapmt( int matrix_layout,boolean forwrd,
                int m, int n, IComplexNumber x,
                int ldx, long k );

    float slapy2( float x, float y );
    double dlapy2( double x, double y );

    float slapy3( float x, float y, float z );
    double dlapy3( double x, double y, double z );

    int slartgp( float f, float g, long cs, long sn, long r );
    int dlartgp( double f, double g, long cs, long sn,
                 long r );

    int slartgs( float x, float y, float sigma, long cs,
                 long sn );
    int dlartgs( double x, double y, double sigma, long cs,
                 long sn );


    //LAPACK 3.3.0
    int cbbcsd( int matrix_layout, char jobu1, char jobu2,
                char jobv1t, char jobv2t, char trans, int m,
                int p, int q, long theta, long phi,
                IComplexNumber u1, int ldu1,
                IComplexNumber u2, int ldu2,
                IComplexNumber v1t, int ldv1t,
                IComplexNumber v2t, int ldv2t,
                long b11d, long b11e, long b12d, long b12e,
                long b21d, long b21e, long b22d, long b22e );
    int cbbcsd_work( int matrix_layout, char jobu1, char jobu2,
                     char jobv1t, char jobv2t, char trans,
                     int m, int p, int q,
                     long theta, long phi,
                     IComplexNumber u1, int ldu1,
                     IComplexNumber u2, int ldu2,
                     IComplexNumber v1t, int ldv1t,
                     IComplexNumber v2t, int ldv2t,
                     long b11d, long b11e, long b12d,
                     long b12e, long b21d, long b21e,
                     long b22d, long b22e, long rwork,
                     int lrwork );
    int cheswapr( int matrix_layout, char uplo, int n,
                  IComplexNumber a, int i1,
                  int i2 );
    int cheswapr_work( int matrix_layout, char uplo, int n,
                       IComplexNumber a, int i1,
                       int i2 );
    int chetri2( int matrix_layout, char uplo, int n,
                 IComplexNumber a, int lda,
                 final long ipiv );
    int chetri2_work( int matrix_layout, char uplo, int n,
                      IComplexNumber a, int lda,
                      final long ipiv,
                      IComplexNumber work, int lwork );
    int chetri2x( int matrix_layout, char uplo, int n,
                  IComplexNumber a, int lda,
                  final long ipiv, int nb );
    int chetri2x_work( int matrix_layout, char uplo, int n,
                       IComplexNumber a, int lda,
                       final long ipiv,
                       IComplexNumber work, int nb );
    int chetrs2( int matrix_layout, char uplo, int n,
                 int nrhs, final IComplexNumber a,
                 int lda, final long ipiv,
                 IComplexNumber b, int ldb );
    int chetrs2_work( int matrix_layout, char uplo, int n,
                      int nrhs, final IComplexNumber a,
                      int lda, final long ipiv,
                      IComplexNumber b, int ldb,
                      IComplexNumber work );
    int csyconv( int matrix_layout, char uplo, char way, int n,
                 IComplexNumber a, int lda,
                 final long ipiv, IComplexNumber work  );
    int csyconv_work( int matrix_layout, char uplo, char way,
                      int n, IComplexNumber a,
                      int lda, final long ipiv,
                      IComplexNumber work );
    int csyswapr( int matrix_layout, char uplo, int n,
                  IComplexNumber a, int i1,
                  int i2 );
    int csyswapr_work( int matrix_layout, char uplo, int n,
                       IComplexNumber a, int i1,
                       int i2 );
    int csytri2( int matrix_layout, char uplo, int n,
                 IComplexNumber a, int lda,
                 final long ipiv );
    int csytri2_work( int matrix_layout, char uplo, int n,
                      IComplexNumber a, int lda,
                      final long ipiv,
                      IComplexNumber work, int lwork );
    int csytri2x( int matrix_layout, char uplo, int n,
                  IComplexNumber a, int lda,
                  final long ipiv, int nb );
    int csytri2x_work( int matrix_layout, char uplo, int n,
                       IComplexNumber a, int lda,
                       final long ipiv,
                       IComplexNumber work, int nb );
    int csytrs2( int matrix_layout, char uplo, int n,
                 int nrhs, final IComplexNumber a,
                 int lda, final long ipiv,
                 IComplexNumber b, int ldb );
    int csytrs2_work( int matrix_layout, char uplo, int n,
                      int nrhs, final IComplexNumber a,
                      int lda, final long ipiv,
                      IComplexNumber b, int ldb,
                      IComplexNumber work );
    int cunbdb( int matrix_layout, char trans, char signs,
                int m, int p, int q,
                IComplexNumber x11, int ldx11,
                IComplexNumber x12, int ldx12,
                IComplexNumber x21, int ldx21,
                IComplexNumber x22, int ldx22,
                long theta, long phi,
                IComplexNumber taup1,
                IComplexNumber taup2,
                IComplexNumber tauq1,
                IComplexNumber tauq2 );
    int cunbdb_work( int matrix_layout, char trans, char signs,
                     int m, int p, int q,
                     IComplexNumber x11, int ldx11,
                     IComplexNumber x12, int ldx12,
                     IComplexNumber x21, int ldx21,
                     IComplexNumber x22, int ldx22,
                     long theta, long phi,
                     IComplexNumber taup1,
                     IComplexNumber taup2,
                     IComplexNumber tauq1,
                     IComplexNumber tauq2,
                     IComplexNumber work, int lwork );
    int cuncsd( int matrix_layout, char jobu1, char jobu2,
                char jobv1t, char jobv2t, char trans, char signs,
                int m, int p, int q,
                IComplexNumber x11, int ldx11,
                IComplexNumber x12, int ldx12,
                IComplexNumber x21, int ldx21,
                IComplexNumber x22, int ldx22,
                long theta, IComplexNumber u1,
                int ldu1, IComplexNumber u2,
                int ldu2, IComplexNumber v1t,
                int ldv1t, IComplexNumber v2t,
                int ldv2t );
    int cuncsd_work( int matrix_layout, char jobu1, char jobu2,
                     char jobv1t, char jobv2t, char trans,
                     char signs, int m, int p,
                     int q, IComplexNumber x11,
                     int ldx11, IComplexNumber x12,
                     int ldx12, IComplexNumber x21,
                     int ldx21, IComplexNumber x22,
                     int ldx22, long theta,
                     IComplexNumber u1, int ldu1,
                     IComplexNumber u2, int ldu2,
                     IComplexNumber v1t, int ldv1t,
                     IComplexNumber v2t, int ldv2t,
                     IComplexNumber work, int lwork,
                     long rwork, int lrwork,
                     long iwork );
    int cuncsd2by1( int matrix_layout, char jobu1, char jobu2,
                    char jobv1t, int m, int p, int q,
                    IComplexNumber x11, int ldx11,
                    IComplexNumber x21, int ldx21,
                    IComplexNumber theta, IComplexNumber u1,
                    int ldu1, IComplexNumber u2,
                    int ldu2, IComplexNumber v1t, int ldv1t );
    int cuncsd2by1_work( int matrix_layout, char jobu1, char jobu2,
                         char jobv1t, int m, int p,
                         int q, IComplexNumber x11, int ldx11,
                         IComplexNumber x21, int ldx21,
                         IComplexNumber theta, IComplexNumber u1,
                         int ldu1, IComplexNumber u2,
                         int ldu2, IComplexNumber v1t,
                         int ldv1t, IComplexNumber work,
                         int lwork, long rwork, int lrwork,
                         long iwork );
    int dbbcsd( int matrix_layout, char jobu1, char jobu2,
                char jobv1t, char jobv2t, char trans, int m,
                int p, int q, long theta,
                long phi, long u1, int ldu1, long u2,
                int ldu2, long v1t, int ldv1t,
                long v2t, int ldv2t, long b11d,
                long b11e, long b12d, long b12e,
                long b21d, long b21e, long b22d,
                long b22e );
    int dbbcsd_work( int matrix_layout, char jobu1, char jobu2,
                     char jobv1t, char jobv2t, char trans,
                     int m, int p, int q,
                     long theta, long phi, long u1,
                     int ldu1, long u2, int ldu2,
                     long v1t, int ldv1t, long v2t,
                     int ldv2t, long b11d, long b11e,
                     long b12d, long b12e, long b21d,
                     long b21e, long b22d, long b22e,
                     long work, int lwork );
    int dorbdb( int matrix_layout, char trans, char signs,
                int m, int p, int q,
                long x11, int ldx11, long x12,
                int ldx12, long x21, int ldx21,
                long x22, int ldx22, long theta,
                long phi, long taup1, long taup2,
                long tauq1, long tauq2 );
    int dorbdb_work( int matrix_layout, char trans, char signs,
                     int m, int p, int q,
                     long x11, int ldx11, long x12,
                     int ldx12, long x21, int ldx21,
                     long x22, int ldx22, long theta,
                     long phi, long taup1, long taup2,
                     long tauq1, long tauq2, long work,
                     int lwork );
    int dorcsd( int matrix_layout, char jobu1, char jobu2,
                char jobv1t, char jobv2t, char trans, char signs,
                int m, int p, int q,
                long x11, int ldx11, long x12,
                int ldx12, long x21, int ldx21,
                long x22, int ldx22, long theta,
                long u1, int ldu1, long u2,
                int ldu2, long v1t, int ldv1t,
                long v2t, int ldv2t );
    int dorcsd_work( int matrix_layout, char jobu1, char jobu2,
                     char jobv1t, char jobv2t, char trans,
                     char signs, int m, int p,
                     int q, long x11, int ldx11,
                     long x12, int ldx12, long x21,
                     int ldx21, long x22, int ldx22,
                     long theta, long u1, int ldu1,
                     long u2, int ldu2, long v1t,
                     int ldv1t, long v2t, int ldv2t,
                     long work, int lwork,
                     long iwork );
    int dorcsd2by1( int matrix_layout, char jobu1, char jobu2,
                    char jobv1t, int m, int p, int q,
                    long x11, int ldx11, long x21, int ldx21,
                    long theta, long u1, int ldu1, long u2,
                    int ldu2, long v1t, int ldv1t);
    int dorcsd2by1_work( int matrix_layout, char jobu1, char jobu2,
                         char jobv1t, int m, int p, int q,
                         long x11, int ldx11, long x21, int ldx21,
                         long theta, long u1, int ldu1, long u2,
                         int ldu2, long v1t, int ldv1t,
                         long work, int lwork, long iwork );
    int dsyconv( int matrix_layout, char uplo, char way, int n,
                 long a, int lda, final long ipiv, long work);
    int dsyconv_work( int matrix_layout, char uplo, char way,
                      int n, long a, int lda,
                      final long ipiv, long work );
    int dsyswapr( int matrix_layout, char uplo, int n,
                  long a, int i1, int i2 );
    int dsyswapr_work( int matrix_layout, char uplo, int n,
                       long a, int i1, int i2 );
    int dsytri2( int matrix_layout, char uplo, int n,
                 long a, int lda, final long ipiv );
    int dsytri2_work( int matrix_layout, char uplo, int n,
                      long a, int lda,
                      final long ipiv,
                      IComplexNumber work, int lwork );
    int dsytri2x( int matrix_layout, char uplo, int n,
                  long a, int lda, final long ipiv,
                  int nb );
    int dsytri2x_work( int matrix_layout, char uplo, int n,
                       long a, int lda,
                       final long ipiv, long work,
                       int nb );
    int dsytrs2( int matrix_layout, char uplo, int n,
                 int nrhs, final long a, int lda,
                 final long ipiv, long b, int ldb );
    int dsytrs2_work( int matrix_layout, char uplo, int n,
                      int nrhs, final long a,
                      int lda, final long ipiv,
                      long b, int ldb, long work );
    int sbbcsd( int matrix_layout, char jobu1, char jobu2,
                char jobv1t, char jobv2t, char trans, int m,
                int p, int q, long theta, long phi,
                long u1, int ldu1, long u2,
                int ldu2, long v1t, int ldv1t,
                long v2t, int ldv2t, long b11d,
                long b11e, long b12d, long b12e, long b21d,
                long b21e, long b22d, long b22e );
    int sbbcsd_work( int matrix_layout, char jobu1, char jobu2,
                     char jobv1t, char jobv2t, char trans,
                     int m, int p, int q,
                     long theta, long phi, long u1,
                     int ldu1, long u2, int ldu2,
                     long v1t, int ldv1t, long v2t,
                     int ldv2t, long b11d, long b11e,
                     long b12d, long b12e, long b21d,
                     long b21e, long b22d, long b22e,
                     long work, int lwork );
    int sorbdb( int matrix_layout, char trans, char signs,
                int m, int p, int q, long x11,
                int ldx11, long x12, int ldx12,
                long x21, int ldx21, long x22,
                int ldx22, long theta, long phi,
                long taup1, long taup2, long tauq1,
                long tauq2 );
    int sorbdb_work( int matrix_layout, char trans, char signs,
                     int m, int p, int q,
                     long x11, int ldx11, long x12,
                     int ldx12, long x21, int ldx21,
                     long x22, int ldx22, long theta,
                     long phi, long taup1, long taup2,
                     long tauq1, long tauq2, long work,
                     int lwork );
    int sorcsd( int matrix_layout, char jobu1, char jobu2,
                char jobv1t, char jobv2t, char trans, char signs,
                int m, int p, int q, long x11,
                int ldx11, long x12, int ldx12,
                long x21, int ldx21, long x22,
                int ldx22, long theta, long u1,
                int ldu1, long u2, int ldu2,
                long v1t, int ldv1t, long v2t,
                int ldv2t );
    int sorcsd_work( int matrix_layout, char jobu1, char jobu2,
                     char jobv1t, char jobv2t, char trans,
                     char signs, int m, int p,
                     int q, long x11, int ldx11,
                     long x12, int ldx12, long x21,
                     int ldx21, long x22, int ldx22,
                     long theta, long u1, int ldu1,
                     long u2, int ldu2, long v1t,
                     int ldv1t, long v2t, int ldv2t,
                     long work, int lwork,
                     long iwork );
    int sorcsd2by1( int matrix_layout, char jobu1, char jobu2,
                    char jobv1t, int m, int p, int q,
                    long x11, int ldx11, long x21, int ldx21,
                    long theta, long u1, int ldu1, long u2,
                    int ldu2, long v1t, int ldv1t);
    int sorcsd2by1_work( int matrix_layout, char jobu1, char jobu2,
                         char jobv1t, int m, int p, int q,
                         long x11, int ldx11, long x21, int ldx21,
                         long theta, long u1, int ldu1, long u2,
                         int ldu2, long v1t, int ldv1t,
                         long work, int lwork, long iwork );
    int ssyconv( int matrix_layout, char uplo, char way, int n,
                 long a, int lda, final long ipiv, long work );
    int ssyconv_work( int matrix_layout, char uplo, char way,
                      int n, long a, int lda,
                      final long ipiv, long work );
    int ssyswapr( int matrix_layout, char uplo, int n,
                  long a, int i1, int i2 );
    int ssyswapr_work( int matrix_layout, char uplo, int n,
                       long a, int i1, int i2 );
    int ssytri2( int matrix_layout, char uplo, int n, long a,
                 int lda, final long ipiv );
    int ssytri2_work( int matrix_layout, char uplo, int n,
                      long a, int lda,
                      final long ipiv,
                      IComplexNumber work, int lwork );
    int ssytri2x( int matrix_layout, char uplo, int n,
                  long a, int lda, final long ipiv,
                  int nb );
    int ssytri2x_work( int matrix_layout, char uplo, int n,
                       long a, int lda,
                       final long ipiv, long work,
                       int nb );
    int ssytrs2( int matrix_layout, char uplo, int n,
                 int nrhs, final long a, int lda,
                 final long ipiv, long b, int ldb );
    int ssytrs2_work( int matrix_layout, char uplo, int n,
                      int nrhs, final long a,
                      int lda, final long ipiv,
                      long b, int ldb, long work );
    int zbbcsd( int matrix_layout, char jobu1, char jobu2,
                char jobv1t, char jobv2t, char trans, int m,
                int p, int q, long theta,
                long phi, IComplexNumber u1,
                int ldu1, IComplexNumber u2,
                int ldu2, IComplexNumber v1t,
                int ldv1t, IComplexNumber v2t,
                int ldv2t, long b11d, long b11e,
                long b12d, long b12e, long b21d,
                long b21e, long b22d, long b22e );
    int zbbcsd_work( int matrix_layout, char jobu1, char jobu2,
                     char jobv1t, char jobv2t, char trans,
                     int m, int p, int q,
                     long theta, long phi,
                     IComplexNumber u1, int ldu1,
                     IComplexNumber u2, int ldu2,
                     IComplexNumber v1t, int ldv1t,
                     IComplexNumber v2t, int ldv2t,
                     long b11d, long b11e, long b12d,
                     long b12e, long b21d, long b21e,
                     long b22d, long b22e, long rwork,
                     int lrwork );
    int zheswapr( int matrix_layout, char uplo, int n,
                  IComplexNumber a, int i1,
                  int i2 );
    int zheswapr_work( int matrix_layout, char uplo, int n,
                       IComplexNumber a, int i1,
                       int i2 );
    int zhetri2( int matrix_layout, char uplo, int n,
                 IComplexNumber a, int lda,
                 final long ipiv );
    int zhetri2_work( int matrix_layout, char uplo, int n,
                      IComplexNumber a, int lda,
                      final long ipiv,
                      IComplexNumber work, int lwork );
    int zhetri2x( int matrix_layout, char uplo, int n,
                  IComplexNumber a, int lda,
                  final long ipiv, int nb );
    int zhetri2x_work( int matrix_layout, char uplo, int n,
                       IComplexNumber a, int lda,
                       final long ipiv,
                       IComplexNumber work, int nb );
    int zhetrs2( int matrix_layout, char uplo, int n,
                 int nrhs, final IComplexNumber a,
                 int lda, final long ipiv,
                 IComplexNumber b, int ldb );
    int zhetrs2_work( int matrix_layout, char uplo, int n,
                      int nrhs, final IComplexNumber a,
                      int lda, final long ipiv,
                      IComplexNumber b, int ldb,
                      IComplexNumber work );
    int zsyconv( int matrix_layout, char uplo, char way, int n,
                 IComplexNumber a, int lda,
                 final long ipiv, IComplexNumber work );
    int zsyconv_work( int matrix_layout, char uplo, char way,
                      int n, IComplexNumber a,
                      int lda, final long ipiv,
                      IComplexNumber work );
    int zsyswapr( int matrix_layout, char uplo, int n,
                  IComplexNumber a, int i1,
                  int i2 );
    int zsyswapr_work( int matrix_layout, char uplo, int n,
                       IComplexNumber a, int i1,
                       int i2 );
    int zsytri2( int matrix_layout, char uplo, int n,
                 IComplexNumber a, int lda,
                 final long ipiv );
    int zsytri2_work( int matrix_layout, char uplo, int n,
                      IComplexNumber a, int lda,
                      final long ipiv,
                      IComplexNumber work, int lwork );
    int zsytri2x( int matrix_layout, char uplo, int n,
                  IComplexNumber a, int lda,
                  final long ipiv, int nb );
    int zsytri2x_work( int matrix_layout, char uplo, int n,
                       IComplexNumber a, int lda,
                       final long ipiv,
                       IComplexNumber work, int nb );
    int zsytrs2( int matrix_layout, char uplo, int n,
                 int nrhs, final IComplexNumber a,
                 int lda, final long ipiv,
                 IComplexNumber b, int ldb );
    int zsytrs2_work( int matrix_layout, char uplo, int n,
                      int nrhs, final IComplexNumber a,
                      int lda, final long ipiv,
                      IComplexNumber b, int ldb,
                      IComplexNumber work );
    int zunbdb( int matrix_layout, char trans, char signs,
                int m, int p, int q,
                IComplexNumber x11, int ldx11,
                IComplexNumber x12, int ldx12,
                IComplexNumber x21, int ldx21,
                IComplexNumber x22, int ldx22,
                long theta, long phi,
                IComplexNumber taup1,
                IComplexNumber taup2,
                IComplexNumber tauq1,
                IComplexNumber tauq2 );
    int zunbdb_work( int matrix_layout, char trans, char signs,
                     int m, int p, int q,
                     IComplexNumber x11, int ldx11,
                     IComplexNumber x12, int ldx12,
                     IComplexNumber x21, int ldx21,
                     IComplexNumber x22, int ldx22,
                     long theta, long phi,
                     IComplexNumber taup1,
                     IComplexNumber taup2,
                     IComplexNumber tauq1,
                     IComplexNumber tauq2,
                     IComplexNumber work, int lwork );
    int zuncsd( int matrix_layout, char jobu1, char jobu2,
                char jobv1t, char jobv2t, char trans, char signs,
                int m, int p, int q,
                IComplexNumber x11, int ldx11,
                IComplexNumber x12, int ldx12,
                IComplexNumber x21, int ldx21,
                IComplexNumber x22, int ldx22,
                long theta, IComplexNumber u1,
                int ldu1, IComplexNumber u2,
                int ldu2, IComplexNumber v1t,
                int ldv1t, IComplexNumber v2t,
                int ldv2t );
    int zuncsd_work( int matrix_layout, char jobu1, char jobu2,
                     char jobv1t, char jobv2t, char trans,
                     char signs, int m, int p,
                     int q, IComplexNumber x11,
                     int ldx11, IComplexNumber x12,
                     int ldx12, IComplexNumber x21,
                     int ldx21, IComplexNumber x22,
                     int ldx22, long theta,
                     IComplexNumber u1, int ldu1,
                     IComplexNumber u2, int ldu2,
                     IComplexNumber v1t, int ldv1t,
                     IComplexNumber v2t, int ldv2t,
                     IComplexNumber work, int lwork,
                     long rwork, int lrwork,
                     long iwork );
    int zuncsd2by1( int matrix_layout, char jobu1, char jobu2,
                    char jobv1t, int m, int p, int q,
                    IComplexNumber x11, int ldx11,
                    IComplexNumber x21, int ldx21,
                    IComplexNumber theta, IComplexNumber u1,
                    int ldu1, IComplexNumber u2,
                    int ldu2, IComplexNumber v1t, int ldv1t );
    int zuncsd2by1_work( int matrix_layout, char jobu1, char jobu2,
                         char jobv1t, int m, int p,
                         int q, IComplexNumber x11, int ldx11,
                         IComplexNumber x21, int ldx21,
                         IComplexNumber theta, IComplexNumber u1,
                         int ldu1, IComplexNumber u2,
                         int ldu2, IComplexNumber v1t,
                         int ldv1t, IComplexNumber work,
                         int lwork, long rwork, int lrwork,
                         long iwork );

    //LAPACK 3.4.0
    int sgemqrt( int matrix_layout, char side, char trans,
                 int m, int n, int k,
                 int nb, final long v, int ldv,
                 final long t, int ldt, long c,
                 int ldc );
    int dgemqrt( int matrix_layout, char side, char trans,
                 int m, int n, int k,
                 int nb, final long v, int ldv,
                 final long t, int ldt, long c,
                 int ldc );
    int cgemqrt( int matrix_layout, char side, char trans,
                 int m, int n, int k,
                 int nb, final IComplexNumber v,
                 int ldv, final IComplexNumber t,
                 int ldt, IComplexNumber c,
                 int ldc );
    int zgemqrt( int matrix_layout, char side, char trans,
                 int m, int n, int k,
                 int nb, final IComplexNumber v,
                 int ldv, final IComplexNumber t,
                 int ldt, IComplexNumber c,
                 int ldc );

    int sgeqrt( int matrix_layout, int m, int n,
                int nb, long a, int lda, long t,
                int ldt );
    int dgeqrt( int matrix_layout, int m, int n,
                int nb, long a, int lda, long t,
                int ldt );
    int cgeqrt( int matrix_layout, int m, int n,
                int nb, IComplexNumber a,
                int lda, IComplexNumber t,
                int ldt );
    int zgeqrt( int matrix_layout, int m, int n,
                int nb, IComplexNumber a,
                int lda, IComplexNumber t,
                int ldt );

    int sgeqrt2( int matrix_layout, int m, int n,
                 long a, int lda, long t,
                 int ldt );
    int dgeqrt2( int matrix_layout, int m, int n,
                 long a, int lda, long t,
                 int ldt );
    int cgeqrt2( int matrix_layout, int m, int n,
                 IComplexNumber a, int lda,
                 IComplexNumber t, int ldt );
    int zgeqrt2( int matrix_layout, int m, int n,
                 IComplexNumber a, int lda,
                 IComplexNumber t, int ldt );

    int sgeqrt3( int matrix_layout, int m, int n,
                 long a, int lda, long t,
                 int ldt );
    int dgeqrt3( int matrix_layout, int m, int n,
                 long a, int lda, long t,
                 int ldt );
    int cgeqrt3( int matrix_layout, int m, int n,
                 IComplexNumber a, int lda,
                 IComplexNumber t, int ldt );
    int zgeqrt3( int matrix_layout, int m, int n,
                 IComplexNumber a, int lda,
                 IComplexNumber t, int ldt );

    int stpmqrt( int matrix_layout, char side, char trans,
                 int m, int n, int k,
                 int l, int nb, final long v,
                 int ldv, final long t, int ldt,
                 long a, int lda, long b,
                 int ldb );
    int dtpmqrt( int matrix_layout, char side, char trans,
                 int m, int n, int k,
                 int l, int nb, final long v,
                 int ldv, final long t, int ldt,
                 long a, int lda, long b,
                 int ldb );
    int ctpmqrt( int matrix_layout, char side, char trans,
                 int m, int n, int k,
                 int l, int nb,
                 final IComplexNumber v, int ldv,
                 final IComplexNumber t, int ldt,
                 IComplexNumber a, int lda,
                 IComplexNumber b, int ldb );
    int ztpmqrt( int matrix_layout, char side, char trans,
                 int m, int n, int k,
                 int l, int nb,
                 final IComplexNumber v, int ldv,
                 final IComplexNumber t, int ldt,
                 IComplexNumber a, int lda,
                 IComplexNumber b, int ldb );

    int stpqrt( int matrix_layout, int m, int n,
                int l, int nb, long a,
                int lda, long b, int ldb, long t,
                int ldt );

    int dtpqrt( int matrix_layout, int m, int n,
                int l, int nb, long a,
                int lda, long b, int ldb, long t,
                int ldt );
    int ctpqrt( int matrix_layout, int m, int n,
                int l, int nb,
                IComplexNumber a, int lda,
                IComplexNumber b, int ldb,
                IComplexNumber t, int ldt );
    int ztpqrt( int matrix_layout, int m, int n,
                int l, int nb,
                IComplexNumber a, int lda,
                IComplexNumber b, int ldb,
                IComplexNumber t, int ldt );

    int stpqrt2( int matrix_layout,
                 int m, int n, int l,
                 long a, int lda,
                 long b, int ldb,
                 long t, int ldt );
    int dtpqrt2( int matrix_layout,
                 int m, int n, int l,
                 long a, int lda,
                 long b, int ldb,
                 long t, int ldt );
    int ctpqrt2( int matrix_layout,
                 int m, int n, int l,
                 IComplexNumber a, int lda,
                 IComplexNumber b, int ldb,
                 IComplexNumber t, int ldt );
    int ztpqrt2( int matrix_layout,
                 int m, int n, int l,
                 IComplexNumber a, int lda,
                 IComplexNumber b, int ldb,
                 IComplexNumber t, int ldt );

    int stprfb( int matrix_layout, char side, char trans, char direct,
                char storev, int m, int n,
                int k, int l, final long v,
                int ldv, final long t, int ldt,
                long a, int lda, long b, int ldb );
    int dtprfb( int matrix_layout, char side, char trans, char direct,
                char storev, int m, int n,
                int k, int l, final long v,
                int ldv, final long t, int ldt,
                long a, int lda, long b, int ldb );
    int ctprfb( int matrix_layout, char side, char trans, char direct,
                char storev, int m, int n,
                int k, int l,
                final IComplexNumber v, int ldv,
                final IComplexNumber t, int ldt,
                IComplexNumber a, int lda,
                IComplexNumber b, int ldb );
    int ztprfb( int matrix_layout, char side, char trans, char direct,
                char storev, int m, int n,
                int k, int l,
                final IComplexNumber v, int ldv,
                final IComplexNumber t, int ldt,
                IComplexNumber a, int lda,
                IComplexNumber b, int ldb );

    int sgemqrt_work( int matrix_layout, char side, char trans,
                      int m, int n, int k,
                      int nb, final long v, int ldv,
                      final long t, int ldt, long c,
                      int ldc, long work );
    int dgemqrt_work( int matrix_layout, char side, char trans,
                      int m, int n, int k,
                      int nb, final long v, int ldv,
                      final long t, int ldt, long c,
                      int ldc, long work );
    int cgemqrt_work( int matrix_layout, char side, char trans,
                      int m, int n, int k,
                      int nb, final IComplexNumber v,
                      int ldv, final IComplexNumber t,
                      int ldt, IComplexNumber c,
                      int ldc, IComplexNumber work );
    int zgemqrt_work( int matrix_layout, char side, char trans,
                      int m, int n, int k,
                      int nb, final IComplexNumber v,
                      int ldv, final IComplexNumber t,
                      int ldt, IComplexNumber c,
                      int ldc, IComplexNumber work );

    int sgeqrt_work( int matrix_layout, int m, int n,
                     int nb, long a, int lda,
                     long t, int ldt, long work );
    int dgeqrt_work( int matrix_layout, int m, int n,
                     int nb, long a, int lda,
                     long t, int ldt, long work );
    int cgeqrt_work( int matrix_layout, int m, int n,
                     int nb, IComplexNumber a,
                     int lda, IComplexNumber t,
                     int ldt, IComplexNumber work );
    int zgeqrt_work( int matrix_layout, int m, int n,
                     int nb, IComplexNumber a,
                     int lda, IComplexNumber t,
                     int ldt, IComplexNumber work );

    int sgeqrt2_work( int matrix_layout, int m, int n,
                      long a, int lda, long t,
                      int ldt );
    int dgeqrt2_work( int matrix_layout, int m, int n,
                      long a, int lda, long t,
                      int ldt );
    int cgeqrt2_work( int matrix_layout, int m, int n,
                      IComplexNumber a, int lda,
                      IComplexNumber t, int ldt );
    int zgeqrt2_work( int matrix_layout, int m, int n,
                      IComplexNumber a, int lda,
                      IComplexNumber t, int ldt );

    int sgeqrt3_work( int matrix_layout, int m, int n,
                      long a, int lda, long t,
                      int ldt );
    int dgeqrt3_work( int matrix_layout, int m, int n,
                      long a, int lda, long t,
                      int ldt );
    int cgeqrt3_work( int matrix_layout, int m, int n,
                      IComplexNumber a, int lda,
                      IComplexNumber t, int ldt );
    int zgeqrt3_work( int matrix_layout, int m, int n,
                      IComplexNumber a, int lda,
                      IComplexNumber t, int ldt );

    int stpmqrt_work( int matrix_layout, char side, char trans,
                      int m, int n, int k,
                      int l, int nb, final long v,
                      int ldv, final long t, int ldt,
                      long a, int lda, long b,
                      int ldb, long work );
    int dtpmqrt_work( int matrix_layout, char side, char trans,
                      int m, int n, int k,
                      int l, int nb, final long v,
                      int ldv, final long t,
                      int ldt, long a, int lda,
                      long b, int ldb, long work );
    int ctpmqrt_work( int matrix_layout, char side, char trans,
                      int m, int n, int k,
                      int l, int nb,
                      final IComplexNumber v, int ldv,
                      final IComplexNumber t, int ldt,
                      IComplexNumber a, int lda,
                      IComplexNumber b, int ldb,
                      IComplexNumber work );
    int ztpmqrt_work( int matrix_layout, char side, char trans,
                      int m, int n, int k,
                      int l, int nb,
                      final IComplexNumber v, int ldv,
                      final IComplexNumber t, int ldt,
                      IComplexNumber a, int lda,
                      IComplexNumber b, int ldb,
                      IComplexNumber work );

    int stpqrt_work( int matrix_layout, int m, int n,
                     int l, int nb, long a,
                     int lda, long b, int ldb,
                     long t, int ldt, long work );
    int dtpqrt_work( int matrix_layout, int m, int n,
                     int l, int nb, long a,
                     int lda, long b, int ldb,
                     long t, int ldt, long work );
    int ctpqrt_work( int matrix_layout, int m, int n,
                     int l, int nb,
                     IComplexNumber a, int lda,
                     IComplexNumber b, int ldb,
                     IComplexNumber t, int ldt,
                     IComplexNumber work );
    int ztpqrt_work( int matrix_layout, int m, int n,
                     int l, int nb,
                     IComplexNumber a, int lda,
                     IComplexNumber b, int ldb,
                     IComplexNumber t, int ldt,
                     IComplexNumber work );

    int stpqrt2_work( int matrix_layout,
                      int m, int n, int l,
                      long a, int lda,
                      long b, int ldb,
                      long t, int ldt );
    int dtpqrt2_work( int matrix_layout,
                      int m, int n, int l,
                      long a, int lda,
                      long b, int ldb,
                      long t, int ldt );
    int ctpqrt2_work( int matrix_layout,
                      int m, int n, int l,
                      IComplexNumber a, int lda,
                      IComplexNumber b, int ldb,
                      IComplexNumber t, int ldt );
    int ztpqrt2_work( int matrix_layout,
                      int m, int n, int l,
                      IComplexNumber a, int lda,
                      IComplexNumber b, int ldb,
                      IComplexNumber t, int ldt );

    int stprfb_work( int matrix_layout, char side, char trans,
                     char direct, char storev, int m,
                     int n, int k, int l,
                     final long v, int ldv, final long t,
                     int ldt, long a, int lda,
                     long b, int ldb, final long work,
                     int ldwork );
    int dtprfb_work( int matrix_layout, char side, char trans,
                     char direct, char storev, int m,
                     int n, int k, int l,
                     final long v, int ldv,
                     final long t, int ldt, long a,
                     int lda, long b, int ldb,
                     final long work, int ldwork );
    int ctprfb_work( int matrix_layout, char side, char trans,
                     char direct, char storev, int m,
                     int n, int k, int l,
                     final IComplexNumber v, int ldv,
                     final IComplexNumber t, int ldt,
                     IComplexNumber a, int lda,
                     IComplexNumber b, int ldb,
                     IComplexNumber work, int ldwork );
    int ztprfb_work( int matrix_layout, char side, char trans,
                     char direct, char storev, int m,
                     int n, int k, int l,
                     final IComplexNumber v, int ldv,
                     final IComplexNumber t, int ldt,
                     IComplexNumber a, int lda,
                     IComplexNumber b, int ldb,
                     IComplexNumber work, int ldwork );
    //LAPACK 3.X.X
    int ssysv_rook( int matrix_layout, char uplo, int n,
                    int nrhs, long a, int lda,
                    long ipiv, long b, int ldb );
    int dsysv_rook( int matrix_layout, char uplo, int n,
                    int nrhs, long a, int lda,
                    long ipiv, long b, int ldb );
    int csysv_rook( int matrix_layout, char uplo, int n,
                    int nrhs, IComplexNumber a,
                    int lda, long ipiv,
                    IComplexNumber b, int ldb );
    int zsysv_rook( int matrix_layout, char uplo, int n,
                    int nrhs, IComplexNumber a,
                    int lda, long ipiv,
                    IComplexNumber b, int ldb );

    int ssytrf_rook( int matrix_layout, char uplo, int n, long a,
                     int lda, long ipiv );
    int dsytrf_rook( int matrix_layout, char uplo, int n, long a,
                     int lda, long ipiv );
    int csytrf_rook( int matrix_layout, char uplo, int n,
                     IComplexNumber a, int lda,
                     long ipiv );
    int zsytrf_rook( int matrix_layout, char uplo, int n,
                     IComplexNumber a, int lda,
                     long ipiv );

    int ssytrs_rook( int matrix_layout, char uplo, int n,
                     int nrhs, final long a, int lda,
                     final long ipiv, long b, int ldb );
    int dsytrs_rook( int matrix_layout, char uplo, int n,
                     int nrhs, final long a, int lda,
                     final long ipiv, long b, int ldb );
    int csytrs_rook( int matrix_layout, char uplo, int n,
                     int nrhs, final IComplexNumber a,
                     int lda, final long ipiv,
                     IComplexNumber b, int ldb );
    int zsytrs_rook( int matrix_layout, char uplo, int n,
                     int nrhs, final IComplexNumber a,
                     int lda, final long ipiv,
                     IComplexNumber b, int ldb );

    int chetrf_rook( int matrix_layout, char uplo, int n,
                     IComplexNumber a, int lda,
                     long ipiv );
    int zhetrf_rook( int matrix_layout, char uplo, int n,
                     IComplexNumber a, int lda,
                     long ipiv );

    int chetrs_rook( int matrix_layout, char uplo, int n,
                     int nrhs, final IComplexNumber a,
                     int lda, final long ipiv,
                     IComplexNumber b, int ldb );
    int zhetrs_rook( int matrix_layout, char uplo, int n,
                     int nrhs, final IComplexNumber a,
                     int lda, final long ipiv,
                     IComplexNumber b, int ldb );

    int csyr( int matrix_layout, char uplo, int n,
              IComplexNumber alpha,
              final IComplexNumber x, int incx,
              IComplexNumber a, int lda );
    int zsyr( int matrix_layout, char uplo, int n,
              IComplexNumber alpha,
              final IComplexNumber x, int incx,
              IComplexNumber a, int lda );

    int ssysv_rook_work( int matrix_layout, char uplo, int n,
                         int nrhs, long a, int lda,
                         long ipiv, long b, int ldb,
                         long work, int lwork );
    int dsysv_rook_work( int matrix_layout, char uplo, int n,
                         int nrhs, long a, int lda,
                         long ipiv, long b, int ldb,
                         long work, int lwork );
    int csysv_rook_work( int matrix_layout, char uplo, int n,
                         int nrhs, IComplexNumber a,
                         int lda, long ipiv,
                         IComplexNumber b, int ldb,
                         IComplexNumber work,
                         int lwork );
    int zsysv_rook_work( int matrix_layout, char uplo, int n,
                         int nrhs, IComplexNumber a,
                         int lda, long ipiv,
                         IComplexNumber b, int ldb,
                         IComplexNumber work,
                         int lwork );

    int ssytrf_rook_work( int matrix_layout, char uplo, int n,
                          long a, int lda, long ipiv,
                          long work, int lwork );
    int dsytrf_rook_work( int matrix_layout, char uplo, int n,
                          long a, int lda, long ipiv,
                          long work, int lwork );
    int csytrf_rook_work( int matrix_layout, char uplo, int n,
                          IComplexNumber a, int lda,
                          long ipiv, IComplexNumber work,
                          int lwork );
    int zsytrf_rook_work( int matrix_layout, char uplo, int n,
                          IComplexNumber a, int lda,
                          long ipiv, IComplexNumber work,
                          int lwork );

    int ssytrs_rook_work( int matrix_layout, char uplo, int n,
                          int nrhs, final long a, int lda,
                          final long ipiv, long b,
                          int ldb );
    int dsytrs_rook_work( int matrix_layout, char uplo, int n,
                          int nrhs, final long a,
                          int lda, final long ipiv,
                          long b, int ldb );
    int csytrs_rook_work( int matrix_layout, char uplo, int n,
                          int nrhs, final IComplexNumber a,
                          int lda, final long ipiv,
                          IComplexNumber b, int ldb );
    int zsytrs_rook_work( int matrix_layout, char uplo, int n,
                          int nrhs, final IComplexNumber a,
                          int lda, final long ipiv,
                          IComplexNumber b, int ldb );

    int chetrf_rook_work( int matrix_layout, char uplo, int n,
                          IComplexNumber a, int lda,
                          long ipiv, IComplexNumber work,
                          int lwork );
    int zhetrf_rook_work( int matrix_layout, char uplo, int n,
                          IComplexNumber a, int lda,
                          long ipiv, IComplexNumber work,
                          int lwork );

    int chetrs_rook_work( int matrix_layout, char uplo, int n,
                          int nrhs, final IComplexNumber a,
                          int lda, final long ipiv,
                          IComplexNumber b, int ldb );
    int zhetrs_rook_work( int matrix_layout, char uplo, int n,
                          int nrhs, final IComplexNumber a,
                          int lda, final long ipiv,
                          IComplexNumber b, int ldb );


    int csyr_work( int matrix_layout, char uplo, int n,
                   IComplexNumber alpha,
                   final IComplexNumber x,
                   int incx, IComplexNumber a,
                   int lda );
    int zsyr_work( int matrix_layout, char uplo, int n,
                   IComplexNumber alpha,
                   final IComplexNumber x,
                   int incx, IComplexNumber a,
                   int lda );
    void ilaver( final long vers_major,
                 final long vers_minor,
                 final long vers_patch );




    void sgetrf( long m, long n, long a, long lda,
                 long ipiv, long info );
    void dgetrf( long m, long n, long a, long lda,
                 long ipiv, long info );
    void cgetrf( long m, long n, IComplexNumber a,
                 long lda, long ipiv, long info );
    void zgetrf( long m, long n, IComplexNumber a,
                 long lda, long ipiv, long info );
    void sgetrf2( long m, long n, long a, long lda,
                  long ipiv, long info );
    void dgetrf2( long m, long n, long a, long lda,
                  long ipiv, long info );
    void cgetrf2( long m, long n, IComplexNumber a,
                  long lda, long ipiv, long info );
    void zgetrf2( long m, long n, IComplexNumber a,
                  long lda, long ipiv, long info );
    void sgbtrf( long m, long n, long kl,
                 long ku, long ab, long ldab,
                 long ipiv, long info );
    void dgbtrf( long m, long n, long kl,
                 long ku, long ab, long ldab,
                 long ipiv, long info );
    void cgbtrf( long m, long n, long kl,
                 long ku, IComplexNumber ab, long ldab,
                 long ipiv, long info );
    void zgbtrf( long m, long n, long kl,
                 long ku, IComplexNumber ab, long ldab,
                 long ipiv, long info );
    void sgttrf( long n, long dl, long d, long du, long du2,
                 long ipiv, long info );
    void dgttrf( long n, long dl, long d, long du,
                 long du2, long ipiv, long info );
    void cgttrf( long n, IComplexNumber dl,
                 IComplexNumber d, IComplexNumber du,
                 IComplexNumber du2, long ipiv,
                 long info );
    void zgttrf( long n, IComplexNumber dl,
                 IComplexNumber d, IComplexNumber du,
                 IComplexNumber du2, long ipiv,
                 long info );
    void spotrf2( long uplo, long n, long a, long lda,
                  long info );
    void dpotrf2( long uplo, long n, long a, long lda,
                  long info );
    void cpotrf2( long uplo, long n, IComplexNumber a,
                  long lda, long info );
    void zpotrf2( long uplo, long n, IComplexNumber a,
                  long lda, long info );
    void spotrf( long uplo, long n, long a, long lda,
                 long info );
    void dpotrf( long uplo, long n, long a, long lda,
                 long info );
    void cpotrf( long uplo, long n, IComplexNumber a,
                 long lda, long info );
    void zpotrf( long uplo, long n, IComplexNumber a,
                 long lda, long info );
    void dpstrf( long uplo, long n, long a, long lda,
                 long piv, long rank, long tol,
                 long work, long info );
    void spstrf( long uplo, long n, long a, long lda,
                 long piv, long rank, long tol, long work,
                 long info );
    void zpstrf( long uplo, long n, IComplexNumber a,
                 long lda, long piv, long rank,
                 long tol, long work, long info );
    void cpstrf( long uplo, long n, IComplexNumber a,
                 long lda, long piv, long rank,
                 long tol, long work, long info );
    void dpftrf( long transr, long uplo, long n, long a,
                 long info );
    void spftrf( long transr, long uplo, long n, long a,
                 long info );
    void zpftrf( long transr, long uplo, long n,
                 IComplexNumber a, long info );
    void cpftrf( long transr, long uplo, long n,
                 IComplexNumber a, long info );
    void spptrf( long uplo, long n, long ap, long info );
    void dpptrf( long uplo, long n, long ap, long info );
    void cpptrf( long uplo, long n, IComplexNumber ap,
                 long info );
    void zpptrf( long uplo, long n, IComplexNumber ap,
                 long info );
    void spbtrf( long uplo, long n, long kd, long ab,
                 long ldab, long info );
    void dpbtrf( long uplo, long n, long kd, long ab,
                 long ldab, long info );
    void cpbtrf( long uplo, long n, long kd,
                 IComplexNumber ab, long ldab,
                 long info );
    void zpbtrf( long uplo, long n, long kd,
                 IComplexNumber ab, long ldab,
                 long info );
    void spttrf( long n, long d, long e, long info );
    void dpttrf( long n, long d, long e, long info );
    void cpttrf( long n, long d, IComplexNumber e,
                 long info );
    void zpttrf( long n, long d, IComplexNumber e,
                 long info );
    void ssytrf( long uplo, long n, long a, long lda,
                 long ipiv, long work, long lwork,
                 long info );
    void dsytrf( long uplo, long n, long a, long lda,
                 long ipiv, long work, long lwork,
                 long info );
    void csytrf( long uplo, long n, IComplexNumber a,
                 long lda, long ipiv,
                 IComplexNumber work, long lwork,
                 long info );
    void zsytrf( long uplo, long n, IComplexNumber a,
                 long lda, long ipiv,
                 IComplexNumber work, long lwork,
                 long info );
    void chetrf( long uplo, long n, IComplexNumber a,
                 long lda, long ipiv,
                 IComplexNumber work, long lwork,
                 long info );
    void zhetrf( long uplo, long n, IComplexNumber a,
                 long lda, long ipiv,
                 IComplexNumber work, long lwork,
                 long info );
    void ssptrf( long uplo, long n, long ap, long ipiv,
                 long info );
    void dsptrf( long uplo, long n, long ap, long ipiv,
                 long info );
    void csptrf( long uplo, long n, IComplexNumber ap,
                 long ipiv, long info );
    void zsptrf( long uplo, long n, IComplexNumber ap,
                 long ipiv, long info );
    void chptrf( long uplo, long n, IComplexNumber ap,
                 long ipiv, long info );
    void zhptrf( long uplo, long n, IComplexNumber ap,
                 long ipiv, long info );
    void sgetrs( long trans, long n, long nrhs,
                 final long a, long lda, final long ipiv,
                 long b, long ldb, long info );
    void dgetrs( long trans, long n, long nrhs,
                 final long a, long lda, final long ipiv,
                 long b, long ldb, long info );
    void cgetrs( long trans, long n, long nrhs,
                 final IComplexNumber a, long lda,
                 final long ipiv, IComplexNumber b,
                 long ldb, long info );
    void zgetrs( long trans, long n, long nrhs,
                 final IComplexNumber a, long lda,
                 final long ipiv, IComplexNumber b,
                 long ldb, long info );
    void sgbtrs( long trans, long n, long kl, long ku,
                 long nrhs, final long ab, long ldab,
                 final long ipiv, long b, long ldb,
                 long info );
    void dgbtrs( long trans, long n, long kl, long ku,
                 long nrhs, final long ab, long ldab,
                 final long ipiv, long b, long ldb,
                 long info );
    void cgbtrs( long trans, long n, long kl, long ku,
                 long nrhs, final IComplexNumber ab,
                 long ldab, final long ipiv,
                 IComplexNumber b, long ldb,
                 long info );
    void zgbtrs( long trans, long n, long kl, long ku,
                 long nrhs, final IComplexNumber ab,
                 long ldab, final long ipiv,
                 IComplexNumber b, long ldb,
                 long info );
    void sgttrs( long trans, long n, long nrhs,
                 final long dl, final long d, final long du,
                 final long du2, final long ipiv, long b,
                 long ldb, long info );
    void dgttrs( long trans, long n, long nrhs,
                 final long dl, final long d, final long du,
                 final long du2, final long ipiv, long b,
                 long ldb, long info );
    void cgttrs( long trans, long n, long nrhs,
                 final IComplexNumber dl,
                 final IComplexNumber d,
                 final IComplexNumber du,
                 final IComplexNumber du2, final long ipiv,
                 IComplexNumber b, long ldb,
                 long info );
    void zgttrs( long trans, long n, long nrhs,
                 final IComplexNumber dl,
                 final IComplexNumber d,
                 final IComplexNumber du,
                 final IComplexNumber du2, final long ipiv,
                 IComplexNumber b, long ldb,
                 long info );
    void spotrs( long uplo, long n, long nrhs, final long a,
                 long lda, long b, long ldb,
                 long info );
    void dpotrs( long uplo, long n, long nrhs,
                 final long a, long lda, long b,
                 long ldb, long info );
    void cpotrs( long uplo, long n, long nrhs,
                 final IComplexNumber a, long lda,
                 IComplexNumber b, long ldb,
                 long info );
    void zpotrs( long uplo, long n, long nrhs,
                 final IComplexNumber a, long lda,
                 IComplexNumber b, long ldb,
                 long info );
    void dpftrs( long transr, long uplo, long n, long nrhs,
                 final long a, long b, long ldb,
                 long info );
    void spftrs( long transr, long uplo, long n, long nrhs,
                 final long a, long b, long ldb,
                 long info );
    void zpftrs( long transr, long uplo, long n, long nrhs,
                 final IComplexNumber a, IComplexNumber b,
                 long ldb, long info );
    void cpftrs( long transr, long uplo, long n, long nrhs,
                 final IComplexNumber a, IComplexNumber b,
                 long ldb, long info );
    void spptrs( long uplo, long n, long nrhs,
                 final long ap, long b, long ldb,
                 long info );
    void dpptrs( long uplo, long n, long nrhs,
                 final long ap, long b, long ldb,
                 long info );
    void cpptrs( long uplo, long n, long nrhs,
                 final IComplexNumber ap, IComplexNumber b,
                 long ldb, long info );
    void zpptrs( long uplo, long n, long nrhs,
                 final IComplexNumber ap, IComplexNumber b,
                 long ldb, long info );
    void spbtrs( long uplo, long n, long kd, long nrhs,
                 final long ab, long ldab, long b,
                 long ldb, long info );
    void dpbtrs( long uplo, long n, long kd, long nrhs,
                 final long ab, long ldab, long b,
                 long ldb, long info );
    void cpbtrs( long uplo, long n, long kd, long nrhs,
                 final IComplexNumber ab, long ldab,
                 IComplexNumber b, long ldb,
                 long info );
    void zpbtrs( long uplo, long n, long kd, long nrhs,
                 final IComplexNumber ab, long ldab,
                 IComplexNumber b, long ldb,
                 long info );
    void spttrs( long n, long nrhs, final long d,
                 final long e, long b, long ldb,
                 long info );
    void dpttrs( long n, long nrhs, final long d,
                 final long e, long b, long ldb,
                 long info );
    void cpttrs( long uplo, long n, long nrhs, final long d,
                 final IComplexNumber e, IComplexNumber b,
                 long ldb, long info );
    void zpttrs( long uplo, long n, long nrhs,
                 final long d, final IComplexNumber e,
                 IComplexNumber b, long ldb,
                 long info );
    void ssytrs( long uplo, long n, long nrhs, final long a,
                 long lda, final long ipiv, long b,
                 long ldb, long info );
    void dsytrs( long uplo, long n, long nrhs,
                 final long a, long lda, final long ipiv,
                 long b, long ldb, long info );
    void csytrs( long uplo, long n, long nrhs,
                 final IComplexNumber a, long lda,
                 final long ipiv, IComplexNumber b,
                 long ldb, long info );
    void zsytrs( long uplo, long n, long nrhs,
                 final IComplexNumber a, long lda,
                 final long ipiv, IComplexNumber b,
                 long ldb, long info );
    void chetrs( long uplo, long n, long nrhs,
                 final IComplexNumber a, long lda,
                 final long ipiv, IComplexNumber b,
                 long ldb, long info );
    void zhetrs( long uplo, long n, long nrhs,
                 final IComplexNumber a, long lda,
                 final long ipiv, IComplexNumber b,
                 long ldb, long info );
    void ssptrs( long uplo, long n, long nrhs,
                 final long ap, final long ipiv, long b,
                 long ldb, long info );
    void dsptrs( long uplo, long n, long nrhs,
                 final long ap, final long ipiv, long b,
                 long ldb, long info );
    void csptrs( long uplo, long n, long nrhs,
                 final IComplexNumber ap, final long ipiv,
                 IComplexNumber b, long ldb,
                 long info );
    void zsptrs( long uplo, long n, long nrhs,
                 final IComplexNumber ap, final long ipiv,
                 IComplexNumber b, long ldb,
                 long info );
    void chptrs( long uplo, long n, long nrhs,
                 final IComplexNumber ap, final long ipiv,
                 IComplexNumber b, long ldb,
                 long info );
    void zhptrs( long uplo, long n, long nrhs,
                 final IComplexNumber ap, final long ipiv,
                 IComplexNumber b, long ldb,
                 long info );
    void strtrs( long uplo, long trans, long diag, long n,
                 long nrhs, final long a, long lda, long b,
                 long ldb, long info );
    void dtrtrs( long uplo, long trans, long diag, long n,
                 long nrhs, final long a, long lda,
                 long b, long ldb, long info );
    void ctrtrs( long uplo, long trans, long diag, long n,
                 long nrhs, final IComplexNumber a,
                 long lda, IComplexNumber b, long ldb,
                 long info );
    void ztrtrs( long uplo, long trans, long diag, long n,
                 long nrhs, final IComplexNumber a,
                 long lda, IComplexNumber b, long ldb,
                 long info );
    void stptrs( long uplo, long trans, long diag, long n,
                 long nrhs, final long ap, long b,
                 long ldb, long info );
    void dtptrs( long uplo, long trans, long diag, long n,
                 long nrhs, final long ap, long b,
                 long ldb, long info );
    void ctptrs( long uplo, long trans, long diag, long n,
                 long nrhs, final IComplexNumber ap,
                 IComplexNumber b, long ldb,
                 long info );
    void ztptrs( long uplo, long trans, long diag, long n,
                 long nrhs, final IComplexNumber ap,
                 IComplexNumber b, long ldb,
                 long info );
    void stbtrs( long uplo, long trans, long diag, long n,
                 long kd, long nrhs, final long ab,
                 long ldab, long b, long ldb,
                 long info );
    void dtbtrs( long uplo, long trans, long diag, long n,
                 long kd, long nrhs, final long ab,
                 long ldab, long b, long ldb,
                 long info );
    void ctbtrs( long uplo, long trans, long diag, long n,
                 long kd, long nrhs,
                 final IComplexNumber ab, long ldab,
                 IComplexNumber b, long ldb,
                 long info );
    void ztbtrs( long uplo, long trans, long diag, long n,
                 long kd, long nrhs,
                 final IComplexNumber ab, long ldab,
                 IComplexNumber b, long ldb,
                 long info );
    void sgecon( long norm, long n, final long a, long lda,
                 long anorm, long rcond, long work, long iwork,
                 long info );
    void dgecon( long norm, long n, final long a, long lda,
                 long anorm, long rcond, long work,
                 long iwork, long info );
    void cgecon( long norm, long n, final IComplexNumber a,
                 long lda, long anorm, long rcond,
                 IComplexNumber work, long rwork,
                 long info );
    void zgecon( long norm, long n, final IComplexNumber a,
                 long lda, long anorm, long rcond,
                 IComplexNumber work, long rwork,
                 long info );
    void sgbcon( long norm, long n, long kl, long ku,
                 final long ab, long ldab, final long ipiv,
                 long anorm, long rcond, long work, long iwork,
                 long info );
    void dgbcon( long norm, long n, long kl, long ku,
                 final long ab, long ldab, final long ipiv,
                 long anorm, long rcond, long work,
                 long iwork, long info );
    void cgbcon( long norm, long n, long kl, long ku,
                 final IComplexNumber ab, long ldab,
                 final long ipiv, long anorm, long rcond,
                 IComplexNumber work, long rwork,
                 long info );
    void zgbcon( long norm, long n, long kl, long ku,
                 final IComplexNumber ab, long ldab,
                 final long ipiv, long anorm, long rcond,
                 IComplexNumber work, long rwork,
                 long info );
    void sgtcon( long norm, long n, final long dl, final long d,
                 final long du, final long du2, final long ipiv,
                 long anorm, long rcond, long work, long iwork,
                 long info );
    void dgtcon( long norm, long n, final long dl,
                 final long d, final long du, final long du2,
                 final long ipiv, long anorm, long rcond,
                 long work, long iwork, long info );
    void cgtcon( long norm, long n, final IComplexNumber dl,
                 final IComplexNumber d,
                 final IComplexNumber du,
                 final IComplexNumber du2, final long ipiv,
                 long anorm, long rcond, IComplexNumber work,
                 long info );
    void zgtcon( long norm, long n, final IComplexNumber dl,
                 final IComplexNumber d,
                 final IComplexNumber du,
                 final IComplexNumber du2, final long ipiv,
                 long anorm, long rcond, IComplexNumber work,
                 long info );
    void spocon( long uplo, long n, final long a, long lda,
                 long anorm, long rcond, long work, long iwork,
                 long info );
    void dpocon( long uplo, long n, final long a, long lda,
                 long anorm, long rcond, long work,
                 long iwork, long info );
    void cpocon( long uplo, long n, final IComplexNumber a,
                 long lda, long anorm, long rcond,
                 IComplexNumber work, long rwork,
                 long info );
    void zpocon( long uplo, long n, final IComplexNumber a,
                 long lda, long anorm, long rcond,
                 IComplexNumber work, long rwork,
                 long info );
    void sppcon( long uplo, long n, final long ap, long anorm,
                 long rcond, long work, long iwork,
                 long info );
    void dppcon( long uplo, long n, final long ap, long anorm,
                 long rcond, long work, long iwork,
                 long info );
    void cppcon( long uplo, long n, final IComplexNumber ap,
                 long anorm, long rcond, IComplexNumber work,
                 long rwork, long info );
    void zppcon( long uplo, long n, final IComplexNumber ap,
                 long anorm, long rcond, IComplexNumber work,
                 long rwork, long info );
    void spbcon( long uplo, long n, long kd, final long ab,
                 long ldab, long anorm, long rcond, long work,
                 long iwork, long info );
    void dpbcon( long uplo, long n, long kd, final long ab,
                 long ldab, long anorm, long rcond,
                 long work, long iwork, long info );
    void cpbcon( long uplo, long n, long kd,
                 final IComplexNumber ab, long ldab,
                 long anorm, long rcond, IComplexNumber work,
                 long rwork, long info );
    void zpbcon( long uplo, long n, long kd,
                 final IComplexNumber ab, long ldab,
                 long anorm, long rcond, IComplexNumber work,
                 long rwork, long info );
    void sptcon( long n, final long d, final long e, long anorm,
                 long rcond, long work, long info );
    void dptcon( long n, final long d, final long e,
                 long anorm, long rcond, long work,
                 long info );
    void cptcon( long n, final long d,
                 final IComplexNumber e, long anorm, long rcond,
                 long work, long info );
    void zptcon( long n, final long d,
                 final IComplexNumber e, long anorm,
                 long rcond, long work, long info );
    void ssycon( long uplo, long n, final long a, long lda,
                 final long ipiv, long anorm, long rcond,
                 long work, long iwork, long info );
    void dsycon( long uplo, long n, final long a, long lda,
                 final long ipiv, long anorm, long rcond,
                 long work, long iwork, long info );
    void csycon( long uplo, long n, final IComplexNumber a,
                 long lda, final long ipiv, long anorm,
                 long rcond, IComplexNumber work,
                 long info );
    void zsycon( long uplo, long n, final IComplexNumber a,
                 long lda, final long ipiv, long anorm,
                 long rcond, IComplexNumber work,
                 long info );
    void checon( long uplo, long n, final IComplexNumber a,
                 long lda, final long ipiv, long anorm,
                 long rcond, IComplexNumber work,
                 long info );
    void zhecon( long uplo, long n, final IComplexNumber a,
                 long lda, final long ipiv, long anorm,
                 long rcond, IComplexNumber work,
                 long info );
    void sspcon( long uplo, long n, final long ap,
                 final long ipiv, long anorm, long rcond,
                 long work, long iwork, long info );
    void dspcon( long uplo, long n, final long ap,
                 final long ipiv, long anorm, long rcond,
                 long work, long iwork, long info );
    void cspcon( long uplo, long n, final IComplexNumber ap,
                 final long ipiv, long anorm, long rcond,
                 IComplexNumber work, long info );
    void zspcon( long uplo, long n, final IComplexNumber ap,
                 final long ipiv, long anorm, long rcond,
                 IComplexNumber work, long info );
    void chpcon( long uplo, long n, final IComplexNumber ap,
                 final long ipiv, long anorm, long rcond,
                 IComplexNumber work, long info );
    void zhpcon( long uplo, long n, final IComplexNumber ap,
                 final long ipiv, long anorm, long rcond,
                 IComplexNumber work, long info );
    void strcon( long norm, long uplo, long diag, long n,
                 final long a, long lda, long rcond, long work,
                 long iwork, long info );
    void dtrcon( long norm, long uplo, long diag, long n,
                 final long a, long lda, long rcond,
                 long work, long iwork, long info );
    void ctrcon( long norm, long uplo, long diag, long n,
                 final IComplexNumber a, long lda,
                 long rcond, IComplexNumber work, long rwork,
                 long info );
    void ztrcon( long norm, long uplo, long diag, long n,
                 final IComplexNumber a, long lda,
                 long rcond, IComplexNumber work, long rwork,
                 long info );
    void stpcon( long norm, long uplo, long diag, long n,
                 final long ap, long rcond, long work,
                 long iwork, long info );
    void dtpcon( long norm, long uplo, long diag, long n,
                 final long ap, long rcond, long work,
                 long iwork, long info );
    void ctpcon( long norm, long uplo, long diag, long n,
                 final IComplexNumber ap, long rcond,
                 IComplexNumber work, long rwork,
                 long info );
    void ztpcon( long norm, long uplo, long diag, long n,
                 final IComplexNumber ap, long rcond,
                 IComplexNumber work, long rwork,
                 long info );
    void stbcon( long norm, long uplo, long diag, long n,
                 long kd, final long ab, long ldab,
                 long rcond, long work, long iwork,
                 long info );
    void dtbcon( long norm, long uplo, long diag, long n,
                 long kd, final long ab, long ldab,
                 long rcond, long work, long iwork,
                 long info );
    void ctbcon( long norm, long uplo, long diag, long n,
                 long kd, final IComplexNumber ab,
                 long ldab, long rcond, IComplexNumber work,
                 long rwork, long info );
    void ztbcon( long norm, long uplo, long diag, long n,
                 long kd, final IComplexNumber ab,
                 long ldab, long rcond,
                 IComplexNumber work, long rwork,
                 long info );
    void sgerfs( long trans, long n, long nrhs,
                 final long a, long lda, final long af,
                 long ldaf, final long ipiv, final long b,
                 long ldb, long x, long ldx, long ferr,
                 long berr, long work, long iwork,
                 long info );
    void dgerfs( long trans, long n, long nrhs,
                 final long a, long lda, final long af,
                 long ldaf, final long ipiv, final long b,
                 long ldb, long x, long ldx, long ferr,
                 long berr, long work, long iwork,
                 long info );
    void cgerfs( long trans, long n, long nrhs,
                 final IComplexNumber a, long lda,
                 final IComplexNumber af, long ldaf,
                 final long ipiv, final IComplexNumber b,
                 long ldb, IComplexNumber x, long ldx,
                 long ferr, long berr, IComplexNumber work,
                 long rwork, long info );
    void zgerfs( long trans, long n, long nrhs,
                 final IComplexNumber a, long lda,
                 final IComplexNumber af, long ldaf,
                 final long ipiv, final IComplexNumber b,
                 long ldb, IComplexNumber x, long ldx,
                 long ferr, long berr, IComplexNumber work,
                 long rwork, long info );
    void dgerfsx( long trans, long equed, long n, long nrhs,
                  final long a, long lda, final long af,
                  long ldaf, final long ipiv, final long r,
                  final long c, final long b, long ldb,
                  long x, long ldx, long rcond, long berr,
                  long n_err_bnds, long err_bnds_norm,
                  long err_bnds_comp, long nparams, long params,
                  long work, long iwork, long info );
    void sgerfsx( long trans, long equed, long n, long nrhs,
                  final long a, long lda, final long af,
                  long ldaf, final long ipiv, final long r,
                  final long c, final long b, long ldb, long x,
                  long ldx, long rcond, long berr,
                  long n_err_bnds, long err_bnds_norm,
                  long err_bnds_comp, long nparams, long params,
                  long work, long iwork, long info );
    void zgerfsx( long trans, long equed, long n, long nrhs,
                  final IComplexNumber a, long lda,
                  final IComplexNumber af, long ldaf,
                  final long ipiv, final long r, final long c,
                  final IComplexNumber b, long ldb,
                  IComplexNumber x, long ldx, long rcond,
                  long berr, long n_err_bnds,
                  long err_bnds_norm, long err_bnds_comp,
                  long nparams, long params,
                  IComplexNumber work, long rwork,
                  long info );
    void cgerfsx( long trans, long equed, long n, long nrhs,
                  final IComplexNumber a, long lda,
                  final IComplexNumber af, long ldaf,
                  final long ipiv, final long r, final long c,
                  final IComplexNumber b, long ldb,
                  IComplexNumber x, long ldx, long rcond,
                  long berr, long n_err_bnds, long err_bnds_norm,
                  long err_bnds_comp, long nparams, long params,
                  IComplexNumber work, long rwork,
                  long info );
    void sgbrfs( long trans, long n, long kl, long ku,
                 long nrhs, final long ab, long ldab,
                 final long afb, long ldafb, final long ipiv,
                 final long b, long ldb, long x, long ldx,
                 long ferr, long berr, long work, long iwork,
                 long info );
    void dgbrfs( long trans, long n, long kl, long ku,
                 long nrhs, final long ab, long ldab,
                 final long afb, long ldafb,
                 final long ipiv, final long b, long ldb,
                 long x, long ldx, long ferr, long berr,
                 long work, long iwork, long info );
    void cgbrfs( long trans, long n, long kl, long ku,
                 long nrhs, final IComplexNumber ab,
                 long ldab, final IComplexNumber afb,
                 long ldafb, final long ipiv,
                 final IComplexNumber b, long ldb,
                 IComplexNumber x, long ldx, long ferr,
                 long berr, IComplexNumber work, long rwork,
                 long info );
    void zgbrfs( long trans, long n, long kl, long ku,
                 long nrhs, final IComplexNumber ab,
                 long ldab, final IComplexNumber afb,
                 long ldafb, final long ipiv,
                 final IComplexNumber b, long ldb,
                 IComplexNumber x, long ldx, long ferr,
                 long berr, IComplexNumber work, long rwork,
                 long info );
    void dgbrfsx( long trans, long equed, long n, long kl,
                  long ku, long nrhs, final long ab,
                  long ldab, final long afb, long ldafb,
                  final long ipiv, final long r, final long c,
                  final long b, long ldb, long x,
                  long ldx, long rcond, long berr,
                  long n_err_bnds, long err_bnds_norm,
                  long err_bnds_comp, long nparams, long params,
                  long work, long iwork, long info );
    void sgbrfsx( long trans, long equed, long n, long kl,
                  long ku, long nrhs, final long ab,
                  long ldab, final long afb, long ldafb,
                  final long ipiv, final long r, final long c,
                  final long b, long ldb, long x, long ldx,
                  long rcond, long berr, long n_err_bnds,
                  long err_bnds_norm, long err_bnds_comp,
                  long nparams, long params, long work,
                  long iwork, long info );
    void zgbrfsx( long trans, long equed, long n, long kl,
                  long ku, long nrhs,
                  final IComplexNumber ab, long ldab,
                  final IComplexNumber afb, long ldafb,
                  final long ipiv, final long r, final long c,
                  final IComplexNumber b, long ldb,
                  IComplexNumber x, long ldx, long rcond,
                  long berr, long n_err_bnds,
                  long err_bnds_norm, long err_bnds_comp,
                  long nparams, long params,
                  IComplexNumber work, long rwork,
                  long info );
    void cgbrfsx( long trans, long equed, long n, long kl,
                  long ku, long nrhs,
                  final IComplexNumber ab, long ldab,
                  final IComplexNumber afb, long ldafb,
                  final long ipiv, final long r, final long c,
                  final IComplexNumber b, long ldb,
                  IComplexNumber x, long ldx, long rcond,
                  long berr, long n_err_bnds, long err_bnds_norm,
                  long err_bnds_comp, long nparams, long params,
                  IComplexNumber work, long rwork,
                  long info );
    void sgtrfs( long trans, long n, long nrhs,
                 final long dl, final long d, final long du,
                 final long dlf, final long df, final long duf,
                 final long du2, final long ipiv, final long b,
                 long ldb, long x, long ldx, long ferr,
                 long berr, long work, long iwork,
                 long info );
    void dgtrfs( long trans, long n, long nrhs,
                 final long dl, final long d, final long du,
                 final long dlf, final long df, final long duf,
                 final long du2, final long ipiv, final long b,
                 long ldb, long x, long ldx, long ferr,
                 long berr, long work, long iwork,
                 long info );
    void cgtrfs( long trans, long n, long nrhs,
                 final IComplexNumber dl,
                 final IComplexNumber d,
                 final IComplexNumber du,
                 final IComplexNumber dlf,
                 final IComplexNumber df,
                 final IComplexNumber duf,
                 final IComplexNumber du2, final long ipiv,
                 final IComplexNumber b, long ldb,
                 IComplexNumber x, long ldx, long ferr,
                 long berr, IComplexNumber work, long rwork,
                 long info );
    void zgtrfs( long trans, long n, long nrhs,
                 final IComplexNumber dl,
                 final IComplexNumber d,
                 final IComplexNumber du,
                 final IComplexNumber dlf,
                 final IComplexNumber df,
                 final IComplexNumber duf,
                 final IComplexNumber du2, final long ipiv,
                 final IComplexNumber b, long ldb,
                 IComplexNumber x, long ldx, long ferr,
                 long berr, IComplexNumber work, long rwork,
                 long info );
    void sporfs( long uplo, long n, long nrhs, final long a,
                 long lda, final long af, long ldaf,
                 final long b, long ldb, long x, long ldx,
                 long ferr, long berr, long work, long iwork,
                 long info );
    void dporfs( long uplo, long n, long nrhs,
                 final long a, long lda, final long af,
                 long ldaf, final long b, long ldb,
                 long x, long ldx, long ferr, long berr,
                 long work, long iwork, long info );
    void cporfs( long uplo, long n, long nrhs,
                 final IComplexNumber a, long lda,
                 final IComplexNumber af, long ldaf,
                 final IComplexNumber b, long ldb,
                 IComplexNumber x, long ldx, long ferr,
                 long berr, IComplexNumber work, long rwork,
                 long info );
    void zporfs( long uplo, long n, long nrhs,
                 final IComplexNumber a, long lda,
                 final IComplexNumber af, long ldaf,
                 final IComplexNumber b, long ldb,
                 IComplexNumber x, long ldx, long ferr,
                 long berr, IComplexNumber work, long rwork,
                 long info );
    void dporfsx( long uplo, long equed, long n, long nrhs,
                  final long a, long lda, final long af,
                  long ldaf, final long s, final long b,
                  long ldb, long x, long ldx, long rcond,
                  long berr, long n_err_bnds,
                  long err_bnds_norm, long err_bnds_comp,
                  long nparams, long params, long work,
                  long iwork, long info );
    void sporfsx( long uplo, long equed, long n, long nrhs,
                  final long a, long lda, final long af,
                  long ldaf, final long s, final long b,
                  long ldb, long x, long ldx, long rcond,
                  long berr, long n_err_bnds, long err_bnds_norm,
                  long err_bnds_comp, long nparams, long params,
                  long work, long iwork, long info );
    void zporfsx( long uplo, long equed, long n, long nrhs,
                  final IComplexNumber a, long lda,
                  final IComplexNumber af, long ldaf,
                  final long s, final IComplexNumber b,
                  long ldb, IComplexNumber x, long ldx,
                  long rcond, long berr, long n_err_bnds,
                  long err_bnds_norm, long err_bnds_comp,
                  long nparams, long params,
                  IComplexNumber work, long rwork,
                  long info );
    void cporfsx( long uplo, long equed, long n, long nrhs,
                  final IComplexNumber a, long lda,
                  final IComplexNumber af, long ldaf,
                  final long s, final IComplexNumber b,
                  long ldb, IComplexNumber x, long ldx,
                  long rcond, long berr, long n_err_bnds,
                  long err_bnds_norm, long err_bnds_comp,
                  long nparams, long params,
                  IComplexNumber work, long rwork,
                  long info );
    void spprfs( long uplo, long n, long nrhs,
                 final long ap, final long afp, final long b,
                 long ldb, long x, long ldx, long ferr,
                 long berr, long work, long iwork,
                 long info );
    void dpprfs( long uplo, long n, long nrhs,
                 final long ap, final long afp, final long b,
                 long ldb, long x, long ldx, long ferr,
                 long berr, long work, long iwork,
                 long info );
    void cpprfs( long uplo, long n, long nrhs,
                 final IComplexNumber ap,
                 final IComplexNumber afp,
                 final IComplexNumber b, long ldb,
                 IComplexNumber x, long ldx, long ferr,
                 long berr, IComplexNumber work, long rwork,
                 long info );
    void zpprfs( long uplo, long n, long nrhs,
                 final IComplexNumber ap,
                 final IComplexNumber afp,
                 final IComplexNumber b, long ldb,
                 IComplexNumber x, long ldx, long ferr,
                 long berr, IComplexNumber work, long rwork,
                 long info );
    void spbrfs( long uplo, long n, long kd, long nrhs,
                 final long ab, long ldab, final long afb,
                 long ldafb, final long b, long ldb,
                 long x, long ldx, long ferr, long berr,
                 long work, long iwork, long info );
    void dpbrfs( long uplo, long n, long kd, long nrhs,
                 final long ab, long ldab, final long afb,
                 long ldafb, final long b, long ldb,
                 long x, long ldx, long ferr, long berr,
                 long work, long iwork, long info );
    void cpbrfs( long uplo, long n, long kd, long nrhs,
                 final IComplexNumber ab, long ldab,
                 final IComplexNumber afb, long ldafb,
                 final IComplexNumber b, long ldb,
                 IComplexNumber x, long ldx, long ferr,
                 long berr, IComplexNumber work, long rwork,
                 long info );
    void zpbrfs( long uplo, long n, long kd, long nrhs,
                 final IComplexNumber ab, long ldab,
                 final IComplexNumber afb, long ldafb,
                 final IComplexNumber b, long ldb,
                 IComplexNumber x, long ldx, long ferr,
                 long berr, IComplexNumber work, long rwork,
                 long info );
    void sptrfs( long n, long nrhs, final long d,
                 final long e, final long df, final long ef,
                 final long b, long ldb, long x, long ldx,
                 long ferr, long berr, long work, long info );
    void dptrfs( long n, long nrhs, final long d,
                 final long e, final long df, final long ef,
                 final long b, long ldb, long x,
                 long ldx, long ferr, long berr, long work,
                 long info );
    void cptrfs( long uplo, long n, long nrhs, final long d,
                 final IComplexNumber e, final long df,
                 final IComplexNumber ef,
                 final IComplexNumber b, long ldb,
                 IComplexNumber x, long ldx, long ferr,
                 long berr, IComplexNumber work, long rwork,
                 long info );
    void zptrfs( long uplo, long n, long nrhs,
                 final long d, final IComplexNumber e,
                 final long df, final IComplexNumber ef,
                 final IComplexNumber b, long ldb,
                 IComplexNumber x, long ldx, long ferr,
                 long berr, IComplexNumber work, long rwork,
                 long info );
    void ssyrfs( long uplo, long n, long nrhs, final long a,
                 long lda, final long af, long ldaf,
                 final long ipiv, final long b, long ldb,
                 long x, long ldx, long ferr, long berr,
                 long work, long iwork, long info );
    void dsyrfs( long uplo, long n, long nrhs,
                 final long a, long lda, final long af,
                 long ldaf, final long ipiv, final long b,
                 long ldb, long x, long ldx, long ferr,
                 long berr, long work, long iwork,
                 long info );
    void csyrfs( long uplo, long n, long nrhs,
                 final IComplexNumber a, long lda,
                 final IComplexNumber af, long ldaf,
                 final long ipiv, final IComplexNumber b,
                 long ldb, IComplexNumber x, long ldx,
                 long ferr, long berr, IComplexNumber work,
                 long rwork, long info );
    void zsyrfs( long uplo, long n, long nrhs,
                 final IComplexNumber a, long lda,
                 final IComplexNumber af, long ldaf,
                 final long ipiv, final IComplexNumber b,
                 long ldb, IComplexNumber x, long ldx,
                 long ferr, long berr, IComplexNumber work,
                 long rwork, long info );
    void dsyrfsx( long uplo, long equed, long n, long nrhs,
                  final long a, long lda, final long af,
                  long ldaf, final long ipiv, final long s,
                  final long b, long ldb, long x,
                  long ldx, long rcond, long berr,
                  long n_err_bnds, long err_bnds_norm,
                  long err_bnds_comp, long nparams, long params,
                  long work, long iwork, long info );
    void ssyrfsx( long uplo, long equed, long n, long nrhs,
                  final long a, long lda, final long af,
                  long ldaf, final long ipiv, final long s,
                  final long b, long ldb, long x, long ldx,
                  long rcond, long berr, long n_err_bnds,
                  long err_bnds_norm, long err_bnds_comp,
                  long nparams, long params, long work,
                  long iwork, long info );
    void zsyrfsx( long uplo, long equed, long n, long nrhs,
                  final IComplexNumber a, long lda,
                  final IComplexNumber af, long ldaf,
                  final long ipiv, final long s,
                  final IComplexNumber b, long ldb,
                  IComplexNumber x, long ldx, long rcond,
                  long berr, long n_err_bnds,
                  long err_bnds_norm, long err_bnds_comp,
                  long nparams, long params,
                  IComplexNumber work, long rwork,
                  long info );
    void csyrfsx( long uplo, long equed, long n, long nrhs,
                  final IComplexNumber a, long lda,
                  final IComplexNumber af, long ldaf,
                  final long ipiv, final long s,
                  final IComplexNumber b, long ldb,
                  IComplexNumber x, long ldx, long rcond,
                  long berr, long n_err_bnds, long err_bnds_norm,
                  long err_bnds_comp, long nparams, long params,
                  IComplexNumber work, long rwork,
                  long info );
    void cherfs( long uplo, long n, long nrhs,
                 final IComplexNumber a, long lda,
                 final IComplexNumber af, long ldaf,
                 final long ipiv, final IComplexNumber b,
                 long ldb, IComplexNumber x, long ldx,
                 long ferr, long berr, IComplexNumber work,
                 long rwork, long info );
    void zherfs( long uplo, long n, long nrhs,
                 final IComplexNumber a, long lda,
                 final IComplexNumber af, long ldaf,
                 final long ipiv, final IComplexNumber b,
                 long ldb, IComplexNumber x, long ldx,
                 long ferr, long berr, IComplexNumber work,
                 long rwork, long info );
    void zherfsx( long uplo, long equed, long n, long nrhs,
                  final IComplexNumber a, long lda,
                  final IComplexNumber af, long ldaf,
                  final long ipiv, final long s,
                  final IComplexNumber b, long ldb,
                  IComplexNumber x, long ldx, long rcond,
                  long berr, long n_err_bnds,
                  long err_bnds_norm, long err_bnds_comp,
                  long nparams, long params,
                  IComplexNumber work, long rwork,
                  long info );
    void cherfsx( long uplo, long equed, long n, long nrhs,
                  final IComplexNumber a, long lda,
                  final IComplexNumber af, long ldaf,
                  final long ipiv, final long s,
                  final IComplexNumber b, long ldb,
                  IComplexNumber x, long ldx, long rcond,
                  long berr, long n_err_bnds, long err_bnds_norm,
                  long err_bnds_comp, long nparams, long params,
                  IComplexNumber work, long rwork,
                  long info );
    void ssprfs( long uplo, long n, long nrhs,
                 final long ap, final long afp, final long ipiv,
                 final long b, long ldb, long x, long ldx,
                 long ferr, long berr, long work, long iwork,
                 long info );
    void dsprfs( long uplo, long n, long nrhs,
                 final long ap, final long afp, final long ipiv,
                 final long b, long ldb, long x,
                 long ldx, long ferr, long berr, long work,
                 long iwork, long info );
    void csprfs( long uplo, long n, long nrhs,
                 final IComplexNumber ap,
                 final IComplexNumber afp, final long ipiv,
                 final IComplexNumber b, long ldb,
                 IComplexNumber x, long ldx, long ferr,
                 long berr, IComplexNumber work, long rwork,
                 long info );
    void zsprfs( long uplo, long n, long nrhs,
                 final IComplexNumber ap,
                 final IComplexNumber afp, final long ipiv,
                 final IComplexNumber b, long ldb,
                 IComplexNumber x, long ldx, long ferr,
                 long berr, IComplexNumber work, long rwork,
                 long info );
    void chprfs( long uplo, long n, long nrhs,
                 final IComplexNumber ap,
                 final IComplexNumber afp, final long ipiv,
                 final IComplexNumber b, long ldb,
                 IComplexNumber x, long ldx, long ferr,
                 long berr, IComplexNumber work, long rwork,
                 long info );
    void zhprfs( long uplo, long n, long nrhs,
                 final IComplexNumber ap,
                 final IComplexNumber afp, final long ipiv,
                 final IComplexNumber b, long ldb,
                 IComplexNumber x, long ldx, long ferr,
                 long berr, IComplexNumber work, long rwork,
                 long info );
    void strrfs( long uplo, long trans, long diag, long n,
                 long nrhs, final long a, long lda,
                 final long b, long ldb, final long x,
                 long ldx, long ferr, long berr, long work,
                 long iwork, long info );
    void dtrrfs( long uplo, long trans, long diag, long n,
                 long nrhs, final long a, long lda,
                 final long b, long ldb, final long x,
                 long ldx, long ferr, long berr, long work,
                 long iwork, long info );
    void ctrrfs( long uplo, long trans, long diag, long n,
                 long nrhs, final IComplexNumber a,
                 long lda, final IComplexNumber b,
                 long ldb, final IComplexNumber x,
                 long ldx, long ferr, long berr,
                 IComplexNumber work, long rwork,
                 long info );
    void ztrrfs( long uplo, long trans, long diag, long n,
                 long nrhs, final IComplexNumber a,
                 long lda, final IComplexNumber b,
                 long ldb, final IComplexNumber x,
                 long ldx, long ferr, long berr,
                 IComplexNumber work, long rwork,
                 long info );
    void stprfs( long uplo, long trans, long diag, long n,
                 long nrhs, final long ap, final long b,
                 long ldb, final long x, long ldx,
                 long ferr, long berr, long work, long iwork,
                 long info );
    void dtprfs( long uplo, long trans, long diag, long n,
                 long nrhs, final long ap, final long b,
                 long ldb, final long x, long ldx,
                 long ferr, long berr, long work, long iwork,
                 long info );
    void ctprfs( long uplo, long trans, long diag, long n,
                 long nrhs, final IComplexNumber ap,
                 final IComplexNumber b, long ldb,
                 final IComplexNumber x, long ldx, long ferr,
                 long berr, IComplexNumber work, long rwork,
                 long info );
    void ztprfs( long uplo, long trans, long diag, long n,
                 long nrhs, final IComplexNumber ap,
                 final IComplexNumber b, long ldb,
                 final IComplexNumber x, long ldx,
                 long ferr, long berr, IComplexNumber work,
                 long rwork, long info );
    void stbrfs( long uplo, long trans, long diag, long n,
                 long kd, long nrhs, final long ab,
                 long ldab, final long b, long ldb,
                 final long x, long ldx, long ferr, long berr,
                 long work, long iwork, long info );
    void dtbrfs( long uplo, long trans, long diag, long n,
                 long kd, long nrhs, final long ab,
                 long ldab, final long b, long ldb,
                 final long x, long ldx, long ferr,
                 long berr, long work, long iwork,
                 long info );
    void ctbrfs( long uplo, long trans, long diag, long n,
                 long kd, long nrhs,
                 final IComplexNumber ab, long ldab,
                 final IComplexNumber b, long ldb,
                 final IComplexNumber x, long ldx, long ferr,
                 long berr, IComplexNumber work, long rwork,
                 long info );
    void ztbrfs( long uplo, long trans, long diag, long n,
                 long kd, long nrhs,
                 final IComplexNumber ab, long ldab,
                 final IComplexNumber b, long ldb,
                 final IComplexNumber x, long ldx,
                 long ferr, long berr, IComplexNumber work,
                 long rwork, long info );
    void sgetri( long n, long a, long lda,
                 final long ipiv, long work, long lwork,
                 long info );
    void dgetri( long n, long a, long lda,
                 final long ipiv, long work, long lwork,
                 long info );
    void cgetri( long n, IComplexNumber a, long lda,
                 final long ipiv, IComplexNumber work,
                 long lwork, long info );
    void zgetri( long n, IComplexNumber a, long lda,
                 final long ipiv, IComplexNumber work,
                 long lwork, long info );
    void spotri( long uplo, long n, long a, long lda,
                 long info );
    void dpotri( long uplo, long n, long a, long lda,
                 long info );
    void cpotri( long uplo, long n, IComplexNumber a,
                 long lda, long info );
    void zpotri( long uplo, long n, IComplexNumber a,
                 long lda, long info );
    void dpftri( long transr, long uplo, long n, long a,
                 long info );
    void spftri( long transr, long uplo, long n, long a,
                 long info );
    void zpftri( long transr, long uplo, long n,
                 IComplexNumber a, long info );
    void cpftri( long transr, long uplo, long n,
                 IComplexNumber a, long info );
    void spptri( long uplo, long n, long ap, long info );
    void dpptri( long uplo, long n, long ap, long info );
    void cpptri( long uplo, long n, IComplexNumber ap,
                 long info );
    void zpptri( long uplo, long n, IComplexNumber ap,
                 long info );
    void ssytri( long uplo, long n, long a, long lda,
                 final long ipiv, long work, long info );
    void dsytri( long uplo, long n, long a, long lda,
                 final long ipiv, long work, long info );
    void csytri( long uplo, long n, IComplexNumber a,
                 long lda, final long ipiv,
                 IComplexNumber work, long info );
    void zsytri( long uplo, long n, IComplexNumber a,
                 long lda, final long ipiv,
                 IComplexNumber work, long info );
    void chetri( long uplo, long n, IComplexNumber a,
                 long lda, final long ipiv,
                 IComplexNumber work, long info );
    void zhetri( long uplo, long n, IComplexNumber a,
                 long lda, final long ipiv,
                 IComplexNumber work, long info );
    void ssptri( long uplo, long n, long ap,
                 final long ipiv, long work, long info );
    void dsptri( long uplo, long n, long ap,
                 final long ipiv, long work, long info );
    void csptri( long uplo, long n, IComplexNumber ap,
                 final long ipiv, IComplexNumber work,
                 long info );
    void zsptri( long uplo, long n, IComplexNumber ap,
                 final long ipiv, IComplexNumber work,
                 long info );
    void chptri( long uplo, long n, IComplexNumber ap,
                 final long ipiv, IComplexNumber work,
                 long info );
    void zhptri( long uplo, long n, IComplexNumber ap,
                 final long ipiv, IComplexNumber work,
                 long info );
    void strtri( long uplo, long diag, long n, long a,
                 long lda, long info );
    void dtrtri( long uplo, long diag, long n, long a,
                 long lda, long info );
    void ctrtri( long uplo, long diag, long n,
                 IComplexNumber a, long lda,
                 long info );
    void ztrtri( long uplo, long diag, long n,
                 IComplexNumber a, long lda,
                 long info );
    void dtftri( long transr, long uplo, long diag, long n,
                 long a, long info );
    void stftri( long transr, long uplo, long diag, long n,
                 long a, long info );
    void ztftri( long transr, long uplo, long diag, long n,
                 IComplexNumber a, long info );
    void ctftri( long transr, long uplo, long diag, long n,
                 IComplexNumber a, long info );
    void stptri( long uplo, long diag, long n, long ap,
                 long info );
    void dtptri( long uplo, long diag, long n, long ap,
                 long info );
    void ctptri( long uplo, long diag, long n,
                 IComplexNumber ap, long info );
    void ztptri( long uplo, long diag, long n,
                 IComplexNumber ap, long info );
    void sgeequ( long m, long n, final long a,
                 long lda, long r, long c, long rowcnd,
                 long colcnd, long amax, long info );
    void dgeequ( long m, long n, final long a,
                 long lda, long r, long c, long rowcnd,
                 long colcnd, long amax, long info );
    void cgeequ( long m, long n, final IComplexNumber a,
                 long lda, long r, long c, long rowcnd,
                 long colcnd, long amax, long info );
    void zgeequ( long m, long n,
                 final IComplexNumber a, long lda, long r,
                 long c, long rowcnd, long colcnd, long amax,
                 long info );
    void dgeequb( long m, long n, final long a,
                  long lda, long r, long c, long rowcnd,
                  long colcnd, long amax, long info );
    void sgeequb( long m, long n, final long a,
                  long lda, long r, long c, long rowcnd,
                  long colcnd, long amax, long info );
    void zgeequb( long m, long n,
                  final IComplexNumber a, long lda, long r,
                  long c, long rowcnd, long colcnd, long amax,
                  long info );
    void cgeequb( long m, long n,
                  final IComplexNumber a, long lda, long r,
                  long c, long rowcnd, long colcnd, long amax,
                  long info );
    void sgbequ( long m, long n, long kl,
                 long ku, final long ab, long ldab, long r,
                 long c, long rowcnd, long colcnd, long amax,
                 long info );
    void dgbequ( long m, long n, long kl,
                 long ku, final long ab, long ldab,
                 long r, long c, long rowcnd, long colcnd,
                 long amax, long info );
    void cgbequ( long m, long n, long kl,
                 long ku, final IComplexNumber ab,
                 long ldab, long r, long c, long rowcnd,
                 long colcnd, long amax, long info );
    void zgbequ( long m, long n, long kl,
                 long ku, final IComplexNumber ab,
                 long ldab, long r, long c, long rowcnd,
                 long colcnd, long amax, long info );
    void dgbequb( long m, long n, long kl,
                  long ku, final long ab, long ldab,
                  long r, long c, long rowcnd, long colcnd,
                  long amax, long info );
    void sgbequb( long m, long n, long kl,
                  long ku, final long ab, long ldab,
                  long r, long c, long rowcnd, long colcnd,
                  long amax, long info );
    void zgbequb( long m, long n, long kl,
                  long ku, final IComplexNumber ab,
                  long ldab, long r, long c, long rowcnd,
                  long colcnd, long amax, long info );
    void cgbequb( long m, long n, long kl,
                  long ku, final IComplexNumber ab,
                  long ldab, long r, long c, long rowcnd,
                  long colcnd, long amax, long info );
    void spoequ( long n, final long a, long lda, long s,
                 long scond, long amax, long info );
    void dpoequ( long n, final long a, long lda, long s,
                 long scond, long amax, long info );
    void cpoequ( long n, final IComplexNumber a,
                 long lda, long s, long scond, long amax,
                 long info );
    void zpoequ( long n, final IComplexNumber a,
                 long lda, long s, long scond, long amax,
                 long info );
    void dpoequb( long n, final long a, long lda, long s,
                  long scond, long amax, long info );
    void spoequb( long n, final long a, long lda, long s,
                  long scond, long amax, long info );
    void zpoequb( long n, final IComplexNumber a,
                  long lda, long s, long scond, long amax,
                  long info );
    void cpoequb( long n, final IComplexNumber a,
                  long lda, long s, long scond, long amax,
                  long info );
    void sppequ( long uplo, long n, final long ap, long s,
                 long scond, long amax, long info );
    void dppequ( long uplo, long n, final long ap, long s,
                 long scond, long amax, long info );
    void cppequ( long uplo, long n, final IComplexNumber ap,
                 long s, long scond, long amax, long info );
    void zppequ( long uplo, long n, final IComplexNumber ap,
                 long s, long scond, long amax, long info );
    void spbequ( long uplo, long n, long kd, final long ab,
                 long ldab, long s, long scond, long amax,
                 long info );
    void dpbequ( long uplo, long n, long kd, final long ab,
                 long ldab, long s, long scond, long amax,
                 long info );
    void cpbequ( long uplo, long n, long kd,
                 final IComplexNumber ab, long ldab, long s,
                 long scond, long amax, long info );
    void zpbequ( long uplo, long n, long kd,
                 final IComplexNumber ab, long ldab,
                 long s, long scond, long amax, long info );
    void dsyequb( long uplo, long n, final long a,
                  long lda, long s, long scond, long amax,
                  long work, long info );
    void ssyequb( long uplo, long n, final long a, long lda,
                  long s, long scond, long amax, long work,
                  long info );
    void zsyequb( long uplo, long n, final IComplexNumber a,
                  long lda, long s, long scond, long amax,
                  IComplexNumber work, long info );
    void csyequb( long uplo, long n, final IComplexNumber a,
                  long lda, long s, long scond, long amax,
                  IComplexNumber work, long info );
    void zheequb( long uplo, long n, final IComplexNumber a,
                  long lda, long s, long scond, long amax,
                  IComplexNumber work, long info );
    void cheequb( long uplo, long n, final IComplexNumber a,
                  long lda, long s, long scond, long amax,
                  IComplexNumber work, long info );
    void sgesv( long n, long nrhs, long a, long lda,
                long ipiv, long b, long ldb,
                long info );
    void dgesv( long n, long nrhs, long a, long lda,
                long ipiv, long b, long ldb,
                long info );
    void cgesv( long n, long nrhs, IComplexNumber a,
                long lda, long ipiv, IComplexNumber b,
                long ldb, long info );
    void zgesv( long n, long nrhs, IComplexNumber a,
                long lda, long ipiv, IComplexNumber b,
                long ldb, long info );
    void dsgesv( long n, long nrhs, long a, long lda,
                 long ipiv, long b, long ldb, long x,
                 long ldx, long work, long swork,
                 long iter, long info );
    void zcgesv( long n, long nrhs, IComplexNumber a,
                 long lda, long ipiv, IComplexNumber b,
                 long ldb, IComplexNumber x, long ldx,
                 IComplexNumber work, IComplexNumber swork,
                 long rwork, long iter, long info );
    void sgesvx( long fact, long trans, long n, long nrhs,
                 long a, long lda, long af, long ldaf,
                 long ipiv, long equed, long r, long c, long b,
                 long ldb, long x, long ldx, long rcond,
                 long ferr, long berr, long work, long iwork,
                 long info );
    void dgesvx( long fact, long trans, long n, long nrhs,
                 long a, long lda, long af, long ldaf,
                 long ipiv, long equed, long r, long c,
                 long b, long ldb, long x, long ldx,
                 long rcond, long ferr, long berr, long work,
                 long iwork, long info );
    void cgesvx( long fact, long trans, long n, long nrhs,
                 IComplexNumber a, long lda,
                 IComplexNumber af, long ldaf,
                 long ipiv, long equed, long r, long c,
                 IComplexNumber b, long ldb,
                 IComplexNumber x, long ldx, long rcond,
                 long ferr, long berr, IComplexNumber work,
                 long rwork, long info );
    void zgesvx( long fact, long trans, long n, long nrhs,
                 IComplexNumber a, long lda,
                 IComplexNumber af, long ldaf,
                 long ipiv, long equed, long r, long c,
                 IComplexNumber b, long ldb,
                 IComplexNumber x, long ldx, long rcond,
                 long ferr, long berr, IComplexNumber work,
                 long rwork, long info );
    void dgesvxx( long fact, long trans, long n, long nrhs,
                  long a, long lda, long af, long ldaf,
                  long ipiv, long equed, long r, long c,
                  long b, long ldb, long x, long ldx,
                  long rcond, long rpvgrw, long berr,
                  long n_err_bnds, long err_bnds_norm,
                  long err_bnds_comp, long nparams, long params,
                  long work, long iwork, long info );
    void sgesvxx( long fact, long trans, long n, long nrhs,
                  long a, long lda, long af, long ldaf,
                  long ipiv, long equed, long r, long c,
                  long b, long ldb, long x, long ldx,
                  long rcond, long rpvgrw, long berr,
                  long n_err_bnds, long err_bnds_norm,
                  long err_bnds_comp, long nparams, long params,
                  long work, long iwork, long info );
    void zgesvxx( long fact, long trans, long n, long nrhs,
                  IComplexNumber a, long lda,
                  IComplexNumber af, long ldaf,
                  long ipiv, long equed, long r, long c,
                  IComplexNumber b, long ldb,
                  IComplexNumber x, long ldx, long rcond,
                  long rpvgrw, long berr, long n_err_bnds,
                  long err_bnds_norm, long err_bnds_comp,
                  long nparams, long params,
                  IComplexNumber work, long rwork,
                  long info );
    void cgesvxx( long fact, long trans, long n, long nrhs,
                  IComplexNumber a, long lda,
                  IComplexNumber af, long ldaf,
                  long ipiv, long equed, long r, long c,
                  IComplexNumber b, long ldb,
                  IComplexNumber x, long ldx, long rcond,
                  long rpvgrw, long berr, long n_err_bnds,
                  long err_bnds_norm, long err_bnds_comp,
                  long nparams, long params,
                  IComplexNumber work, long rwork,
                  long info );
    void sgbsv( long n, long kl, long ku,
                long nrhs, long ab, long ldab,
                long ipiv, long b, long ldb,
                long info );
    void dgbsv( long n, long kl, long ku,
                long nrhs, long ab, long ldab,
                long ipiv, long b, long ldb,
                long info );
    void cgbsv( long n, long kl, long ku,
                long nrhs, IComplexNumber ab, long ldab,
                long ipiv, IComplexNumber b, long ldb,
                long info );
    void zgbsv( long n, long kl, long ku,
                long nrhs, IComplexNumber ab,
                long ldab, long ipiv, IComplexNumber b,
                long ldb, long info );
    void sgbsvx( long fact, long trans, long n, long kl,
                 long ku, long nrhs, long ab,
                 long ldab, long afb, long ldafb,
                 long ipiv, long equed, long r, long c, long b,
                 long ldb, long x, long ldx, long rcond,
                 long ferr, long berr, long work, long iwork,
                 long info );
    void dgbsvx( long fact, long trans, long n, long kl,
                 long ku, long nrhs, long ab,
                 long ldab, long afb, long ldafb,
                 long ipiv, long equed, long r, long c,
                 long b, long ldb, long x, long ldx,
                 long rcond, long ferr, long berr, long work,
                 long iwork, long info );
    void cgbsvx( long fact, long trans, long n, long kl,
                 long ku, long nrhs, IComplexNumber ab,
                 long ldab, IComplexNumber afb,
                 long ldafb, long ipiv, long equed, long r,
                 long c, IComplexNumber b, long ldb,
                 IComplexNumber x, long ldx, long rcond,
                 long ferr, long berr, IComplexNumber work,
                 long rwork, long info );
    void zgbsvx( long fact, long trans, long n, long kl,
                 long ku, long nrhs, IComplexNumber ab,
                 long ldab, IComplexNumber afb,
                 long ldafb, long ipiv, long equed, long r,
                 long c, IComplexNumber b, long ldb,
                 IComplexNumber x, long ldx, long rcond,
                 long ferr, long berr, IComplexNumber work,
                 long rwork, long info );
    void dgbsvxx( long fact, long trans, long n, long kl,
                  long ku, long nrhs, long ab,
                  long ldab, long afb, long ldafb,
                  long ipiv, long equed, long r, long c,
                  long b, long ldb, long x, long ldx,
                  long rcond, long rpvgrw, long berr,
                  long n_err_bnds, long err_bnds_norm,
                  long err_bnds_comp, long nparams, long params,
                  long work, long iwork, long info );
    void sgbsvxx( long fact, long trans, long n, long kl,
                  long ku, long nrhs, long ab,
                  long ldab, long afb, long ldafb,
                  long ipiv, long equed, long r, long c,
                  long b, long ldb, long x, long ldx,
                  long rcond, long rpvgrw, long berr,
                  long n_err_bnds, long err_bnds_norm,
                  long err_bnds_comp, long nparams, long params,
                  long work, long iwork, long info );
    void zgbsvxx( long fact, long trans, long n, long kl,
                  long ku, long nrhs,
                  IComplexNumber ab, long ldab,
                  IComplexNumber afb, long ldafb,
                  long ipiv, long equed, long r, long c,
                  IComplexNumber b, long ldb,
                  IComplexNumber x, long ldx, long rcond,
                  long rpvgrw, long berr, long n_err_bnds,
                  long err_bnds_norm, long err_bnds_comp,
                  long nparams, long params,
                  IComplexNumber work, long rwork,
                  long info );
    void cgbsvxx( long fact, long trans, long n, long kl,
                  long ku, long nrhs, IComplexNumber ab,
                  long ldab, IComplexNumber afb,
                  long ldafb, long ipiv, long equed, long r,
                  long c, IComplexNumber b, long ldb,
                  IComplexNumber x, long ldx, long rcond,
                  long rpvgrw, long berr, long n_err_bnds,
                  long err_bnds_norm, long err_bnds_comp,
                  long nparams, long params,
                  IComplexNumber work, long rwork,
                  long info );
    void sgtsv( long n, long nrhs, long dl, long d,
                long du, long b, long ldb, long info );
    void dgtsv( long n, long nrhs, long dl, long d,
                long du, long b, long ldb, long info );
    void cgtsv( long n, long nrhs, IComplexNumber dl,
                IComplexNumber d, IComplexNumber du,
                IComplexNumber b, long ldb, long info );
    void zgtsv( long n, long nrhs, IComplexNumber dl,
                IComplexNumber d, IComplexNumber du,
                IComplexNumber b, long ldb,
                long info );
    void sgtsvx( long fact, long trans, long n, long nrhs,
                 final long dl, final long d, final long du,
                 long dlf, long df, long duf, long du2,
                 long ipiv, final long b, long ldb, long x,
                 long ldx, long rcond, long ferr, long berr,
                 long work, long iwork, long info );
    void dgtsvx( long fact, long trans, long n, long nrhs,
                 final long dl, final long d, final long du,
                 long dlf, long df, long duf, long du2,
                 long ipiv, final long b, long ldb,
                 long x, long ldx, long rcond, long ferr,
                 long berr, long work, long iwork,
                 long info );
    void cgtsvx( long fact, long trans, long n, long nrhs,
                 final IComplexNumber dl,
                 final IComplexNumber d,
                 final IComplexNumber du, IComplexNumber dlf,
                 IComplexNumber df, IComplexNumber duf,
                 IComplexNumber du2, long ipiv,
                 final IComplexNumber b, long ldb,
                 IComplexNumber x, long ldx, long rcond,
                 long ferr, long berr, IComplexNumber work,
                 long rwork, long info );
    void zgtsvx( long fact, long trans, long n, long nrhs,
                 final IComplexNumber dl,
                 final IComplexNumber d,
                 final IComplexNumber du, IComplexNumber dlf,
                 IComplexNumber df, IComplexNumber duf,
                 IComplexNumber du2, long ipiv,
                 final IComplexNumber b, long ldb,
                 IComplexNumber x, long ldx, long rcond,
                 long ferr, long berr, IComplexNumber work,
                 long rwork, long info );
    void sposv( long uplo, long n, long nrhs, long a,
                long lda, long b, long ldb,
                long info );
    void dposv( long uplo, long n, long nrhs, long a,
                long lda, long b, long ldb,
                long info );
    void cposv( long uplo, long n, long nrhs,
                IComplexNumber a, long lda,
                IComplexNumber b, long ldb, long info );
    void zposv( long uplo, long n, long nrhs,
                IComplexNumber a, long lda,
                IComplexNumber b, long ldb,
                long info );
    void dsposv( long uplo, long n, long nrhs, long a,
                 long lda, long b, long ldb, long x,
                 long ldx, long work, long swork,
                 long iter, long info );
    void zcposv( long uplo, long n, long nrhs,
                 IComplexNumber a, long lda,
                 IComplexNumber b, long ldb,
                 IComplexNumber x, long ldx,
                 IComplexNumber work, IComplexNumber swork,
                 long rwork, long iter, long info );
    void sposvx( long fact, long uplo, long n, long nrhs,
                 long a, long lda, long af, long ldaf,
                 long equed, long s, long b, long ldb, long x,
                 long ldx, long rcond, long ferr, long berr,
                 long work, long iwork, long info );
    void dposvx( long fact, long uplo, long n, long nrhs,
                 long a, long lda, long af, long ldaf,
                 long equed, long s, long b, long ldb,
                 long x, long ldx, long rcond, long ferr,
                 long berr, long work, long iwork,
                 long info );
    void cposvx( long fact, long uplo, long n, long nrhs,
                 IComplexNumber a, long lda,
                 IComplexNumber af, long ldaf, long equed,
                 long s, IComplexNumber b, long ldb,
                 IComplexNumber x, long ldx, long rcond,
                 long ferr, long berr, IComplexNumber work,
                 long rwork, long info );
    void zposvx( long fact, long uplo, long n, long nrhs,
                 IComplexNumber a, long lda,
                 IComplexNumber af, long ldaf, long equed,
                 long s, IComplexNumber b, long ldb,
                 IComplexNumber x, long ldx, long rcond,
                 long ferr, long berr, IComplexNumber work,
                 long rwork, long info );
    void dposvxx( long fact, long uplo, long n, long nrhs,
                  long a, long lda, long af, long ldaf,
                  long equed, long s, long b, long ldb,
                  long x, long ldx, long rcond, long rpvgrw,
                  long berr, long n_err_bnds,
                  long err_bnds_norm, long err_bnds_comp,
                  long nparams, long params, long work,
                  long iwork, long info );
    void sposvxx( long fact, long uplo, long n, long nrhs,
                  long a, long lda, long af, long ldaf,
                  long equed, long s, long b, long ldb, long x,
                  long ldx, long rcond, long rpvgrw, long berr,
                  long n_err_bnds, long err_bnds_norm,
                  long err_bnds_comp, long nparams, long params,
                  long work, long iwork, long info );
    void zposvxx( long fact, long uplo, long n, long nrhs,
                  IComplexNumber a, long lda,
                  IComplexNumber af, long ldaf, long equed,
                  long s, IComplexNumber b, long ldb,
                  IComplexNumber x, long ldx, long rcond,
                  long rpvgrw, long berr, long n_err_bnds,
                  long err_bnds_norm, long err_bnds_comp,
                  long nparams, long params,
                  IComplexNumber work, long rwork,
                  long info );
    void cposvxx( long fact, long uplo, long n, long nrhs,
                  IComplexNumber a, long lda,
                  IComplexNumber af, long ldaf, long equed,
                  long s, IComplexNumber b, long ldb,
                  IComplexNumber x, long ldx, long rcond,
                  long rpvgrw, long berr, long n_err_bnds,
                  long err_bnds_norm, long err_bnds_comp,
                  long nparams, long params,
                  IComplexNumber work, long rwork,
                  long info );
    void sppsv( long uplo, long n, long nrhs, long ap,
                long b, long ldb, long info );
    void dppsv( long uplo, long n, long nrhs, long ap,
                long b, long ldb, long info );
    void cppsv( long uplo, long n, long nrhs,
                IComplexNumber ap, IComplexNumber b,
                long ldb, long info );
    void zppsv( long uplo, long n, long nrhs,
                IComplexNumber ap, IComplexNumber b,
                long ldb, long info );
    void sppsvx( long fact, long uplo, long n, long nrhs,
                 long ap, long afp, long equed, long s, long b,
                 long ldb, long x, long ldx, long rcond,
                 long ferr, long berr, long work, long iwork,
                 long info );
    void dppsvx( long fact, long uplo, long n, long nrhs,
                 long ap, long afp, long equed, long s, long b,
                 long ldb, long x, long ldx, long rcond,
                 long ferr, long berr, long work, long iwork,
                 long info );
    void cppsvx( long fact, long uplo, long n, long nrhs,
                 IComplexNumber ap, IComplexNumber afp,
                 long equed, long s, IComplexNumber b,
                 long ldb, IComplexNumber x, long ldx,
                 long rcond, long ferr, long berr,
                 IComplexNumber work, long rwork,
                 long info );
    void zppsvx( long fact, long uplo, long n, long nrhs,
                 IComplexNumber ap, IComplexNumber afp,
                 long equed, long s, IComplexNumber b,
                 long ldb, IComplexNumber x, long ldx,
                 long rcond, long ferr, long berr,
                 IComplexNumber work, long rwork,
                 long info );
    void spbsv( long uplo, long n, long kd, long nrhs,
                long ab, long ldab, long b, long ldb,
                long info );
    void dpbsv( long uplo, long n, long kd, long nrhs,
                long ab, long ldab, long b, long ldb,
                long info );
    void cpbsv( long uplo, long n, long kd, long nrhs,
                IComplexNumber ab, long ldab,
                IComplexNumber b, long ldb, long info );
    void zpbsv( long uplo, long n, long kd, long nrhs,
                IComplexNumber ab, long ldab,
                IComplexNumber b, long ldb,
                long info );
    void spbsvx( long fact, long uplo, long n, long kd,
                 long nrhs, long ab, long ldab, long afb,
                 long ldafb, long equed, long s, long b,
                 long ldb, long x, long ldx, long rcond,
                 long ferr, long berr, long work, long iwork,
                 long info );
    void dpbsvx( long fact, long uplo, long n, long kd,
                 long nrhs, long ab, long ldab, long afb,
                 long ldafb, long equed, long s, long b,
                 long ldb, long x, long ldx, long rcond,
                 long ferr, long berr, long work, long iwork,
                 long info );
    void cpbsvx( long fact, long uplo, long n, long kd,
                 long nrhs, IComplexNumber ab,
                 long ldab, IComplexNumber afb,
                 long ldafb, long equed, long s,
                 IComplexNumber b, long ldb,
                 IComplexNumber x, long ldx, long rcond,
                 long ferr, long berr, IComplexNumber work,
                 long rwork, long info );
    void zpbsvx( long fact, long uplo, long n, long kd,
                 long nrhs, IComplexNumber ab,
                 long ldab, IComplexNumber afb,
                 long ldafb, long equed, long s,
                 IComplexNumber b, long ldb,
                 IComplexNumber x, long ldx, long rcond,
                 long ferr, long berr, IComplexNumber work,
                 long rwork, long info );
    void sptsv( long n, long nrhs, long d, long e,
                long b, long ldb, long info );
    void dptsv( long n, long nrhs, long d, long e,
                long b, long ldb, long info );
    void cptsv( long n, long nrhs, long d,
                IComplexNumber e, IComplexNumber b,
                long ldb, long info );
    void zptsv( long n, long nrhs, long d,
                IComplexNumber e, IComplexNumber b,
                long ldb, long info );
    void sptsvx( long fact, long n, long nrhs, final long d,
                 final long e, long df, long ef, final long b,
                 long ldb, long x, long ldx, long rcond,
                 long ferr, long berr, long work, long info );
    void dptsvx( long fact, long n, long nrhs,
                 final long d, final long e, long df, long ef,
                 final long b, long ldb, long x,
                 long ldx, long rcond, long ferr, long berr,
                 long work, long info );
    void cptsvx( long fact, long n, long nrhs, final long d,
                 final IComplexNumber e, long df,
                 IComplexNumber ef, final IComplexNumber b,
                 long ldb, IComplexNumber x, long ldx,
                 long rcond, long ferr, long berr,
                 IComplexNumber work, long rwork,
                 long info );
    void zptsvx( long fact, long n, long nrhs,
                 final long d, final IComplexNumber e, long df,
                 IComplexNumber ef, final IComplexNumber b,
                 long ldb, IComplexNumber x, long ldx,
                 long rcond, long ferr, long berr,
                 IComplexNumber work, long rwork,
                 long info );
    void ssysv( long uplo, long n, long nrhs, long a,
                long lda, long ipiv, long b, long ldb,
                long work, long lwork, long info );
    void dsysv( long uplo, long n, long nrhs, long a,
                long lda, long ipiv, long b,
                long ldb, long work, long lwork,
                long info );
    void csysv( long uplo, long n, long nrhs,
                IComplexNumber a, long lda, long ipiv,
                IComplexNumber b, long ldb,
                IComplexNumber work, long lwork,
                long info );
    void zsysv( long uplo, long n, long nrhs,
                IComplexNumber a, long lda, long ipiv,
                IComplexNumber b, long ldb,
                IComplexNumber work, long lwork,
                long info );
    void ssysvx( long fact, long uplo, long n, long nrhs,
                 final long a, long lda, long af,
                 long ldaf, long ipiv, final long b,
                 long ldb, long x, long ldx, long rcond,
                 long ferr, long berr, long work, long lwork,
                 long iwork, long info );
    void dsysvx( long fact, long uplo, long n, long nrhs,
                 final long a, long lda, long af,
                 long ldaf, long ipiv, final long b,
                 long ldb, long x, long ldx, long rcond,
                 long ferr, long berr, long work, long lwork,
                 long iwork, long info );
    void csysvx( long fact, long uplo, long n, long nrhs,
                 final IComplexNumber a, long lda,
                 IComplexNumber af, long ldaf,
                 long ipiv, final IComplexNumber b,
                 long ldb, IComplexNumber x, long ldx,
                 long rcond, long ferr, long berr,
                 IComplexNumber work, long lwork, long rwork,
                 long info );
    void zsysvx( long fact, long uplo, long n, long nrhs,
                 final IComplexNumber a, long lda,
                 IComplexNumber af, long ldaf,
                 long ipiv, final IComplexNumber b,
                 long ldb, IComplexNumber x, long ldx,
                 long rcond, long ferr, long berr,
                 IComplexNumber work, long lwork,
                 long rwork, long info );
    void dsysvxx( long fact, long uplo, long n, long nrhs,
                  long a, long lda, long af, long ldaf,
                  long ipiv, long equed, long s, long b,
                  long ldb, long x, long ldx, long rcond,
                  long rpvgrw, long berr, long n_err_bnds,
                  long err_bnds_norm, long err_bnds_comp,
                  long nparams, long params, long work,
                  long iwork, long info );
    void ssysvxx( long fact, long uplo, long n, long nrhs,
                  long a, long lda, long af, long ldaf,
                  long ipiv, long equed, long s, long b,
                  long ldb, long x, long ldx, long rcond,
                  long rpvgrw, long berr, long n_err_bnds,
                  long err_bnds_norm, long err_bnds_comp,
                  long nparams, long params, long work,
                  long iwork, long info );
    void zsysvxx( long fact, long uplo, long n, long nrhs,
                  IComplexNumber a, long lda,
                  IComplexNumber af, long ldaf,
                  long ipiv, long equed, long s,
                  IComplexNumber b, long ldb,
                  IComplexNumber x, long ldx, long rcond,
                  long rpvgrw, long berr, long n_err_bnds,
                  long err_bnds_norm, long err_bnds_comp,
                  long nparams, long params,
                  IComplexNumber work, long rwork,
                  long info );
    void csysvxx( long fact, long uplo, long n, long nrhs,
                  IComplexNumber a, long lda,
                  IComplexNumber af, long ldaf,
                  long ipiv, long equed, long s,
                  IComplexNumber b, long ldb,
                  IComplexNumber x, long ldx, long rcond,
                  long rpvgrw, long berr, long n_err_bnds,
                  long err_bnds_norm, long err_bnds_comp,
                  long nparams, long params,
                  IComplexNumber work, long rwork,
                  long info );
    void chesv( long uplo, long n, long nrhs,
                IComplexNumber a, long lda, long ipiv,
                IComplexNumber b, long ldb,
                IComplexNumber work, long lwork,
                long info );
    void zhesv( long uplo, long n, long nrhs,
                IComplexNumber a, long lda, long ipiv,
                IComplexNumber b, long ldb,
                IComplexNumber work, long lwork,
                long info );
    void chesvx( long fact, long uplo, long n, long nrhs,
                 final IComplexNumber a, long lda,
                 IComplexNumber af, long ldaf,
                 long ipiv, final IComplexNumber b,
                 long ldb, IComplexNumber x, long ldx,
                 long rcond, long ferr, long berr,
                 IComplexNumber work, long lwork, long rwork,
                 long info );
    void zhesvx( long fact, long uplo, long n, long nrhs,
                 final IComplexNumber a, long lda,
                 IComplexNumber af, long ldaf,
                 long ipiv, final IComplexNumber b,
                 long ldb, IComplexNumber x, long ldx,
                 long rcond, long ferr, long berr,
                 IComplexNumber work, long lwork,
                 long rwork, long info );
    void zhesvxx( long fact, long uplo, long n, long nrhs,
                  IComplexNumber a, long lda,
                  IComplexNumber af, long ldaf,
                  long ipiv, long equed, long s,
                  IComplexNumber b, long ldb,
                  IComplexNumber x, long ldx, long rcond,
                  long rpvgrw, long berr, long n_err_bnds,
                  long err_bnds_norm, long err_bnds_comp,
                  long nparams, long params,
                  IComplexNumber work, long rwork,
                  long info );
    void chesvxx( long fact, long uplo, long n, long nrhs,
                  IComplexNumber a, long lda,
                  IComplexNumber af, long ldaf,
                  long ipiv, long equed, long s,
                  IComplexNumber b, long ldb,
                  IComplexNumber x, long ldx, long rcond,
                  long rpvgrw, long berr, long n_err_bnds,
                  long err_bnds_norm, long err_bnds_comp,
                  long nparams, long params,
                  IComplexNumber work, long rwork,
                  long info );
    void sspsv( long uplo, long n, long nrhs, long ap,
                long ipiv, long b, long ldb,
                long info );
    void dspsv( long uplo, long n, long nrhs, long ap,
                long ipiv, long b, long ldb,
                long info );
    void cspsv( long uplo, long n, long nrhs,
                IComplexNumber ap, long ipiv,
                IComplexNumber b, long ldb, long info );
    void zspsv( long uplo, long n, long nrhs,
                IComplexNumber ap, long ipiv,
                IComplexNumber b, long ldb,
                long info );
    void sspsvx( long fact, long uplo, long n, long nrhs,
                 final long ap, long afp, long ipiv,
                 final long b, long ldb, long x, long ldx,
                 long rcond, long ferr, long berr, long work,
                 long iwork, long info );
    void dspsvx( long fact, long uplo, long n, long nrhs,
                 final long ap, long afp, long ipiv,
                 final long b, long ldb, long x,
                 long ldx, long rcond, long ferr, long berr,
                 long work, long iwork, long info );
    void cspsvx( long fact, long uplo, long n, long nrhs,
                 final IComplexNumber ap, IComplexNumber afp,
                 long ipiv, final IComplexNumber b,
                 long ldb, IComplexNumber x, long ldx,
                 long rcond, long ferr, long berr,
                 IComplexNumber work, long rwork,
                 long info );
    void zspsvx( long fact, long uplo, long n, long nrhs,
                 final IComplexNumber ap, IComplexNumber afp,
                 long ipiv, final IComplexNumber b,
                 long ldb, IComplexNumber x, long ldx,
                 long rcond, long ferr, long berr,
                 IComplexNumber work, long rwork,
                 long info );
    void chpsv( long uplo, long n, long nrhs,
                IComplexNumber ap, long ipiv,
                IComplexNumber b, long ldb, long info );
    void zhpsv( long uplo, long n, long nrhs,
                IComplexNumber ap, long ipiv,
                IComplexNumber b, long ldb,
                long info );
    void chpsvx( long fact, long uplo, long n, long nrhs,
                 final IComplexNumber ap, IComplexNumber afp,
                 long ipiv, final IComplexNumber b,
                 long ldb, IComplexNumber x, long ldx,
                 long rcond, long ferr, long berr,
                 IComplexNumber work, long rwork,
                 long info );
    void zhpsvx( long fact, long uplo, long n, long nrhs,
                 final IComplexNumber ap, IComplexNumber afp,
                 long ipiv, final IComplexNumber b,
                 long ldb, IComplexNumber x, long ldx,
                 long rcond, long ferr, long berr,
                 IComplexNumber work, long rwork,
                 long info );
    void sgeqrf( long m, long n, long a, long lda,
                 long tau, long work, long lwork,
                 long info );
    void dgeqrf( long m, long n, long a, long lda,
                 long tau, long work, long lwork,
                 long info );
    void cgeqrf( long m, long n, IComplexNumber a,
                 long lda, IComplexNumber tau,
                 IComplexNumber work, long lwork,
                 long info );
    void zgeqrf( long m, long n, IComplexNumber a,
                 long lda, IComplexNumber tau,
                 IComplexNumber work, long lwork,
                 long info );
    void sgeqpf( long m, long n, long a, long lda,
                 long jpvt, long tau, long work,
                 long info );
    void dgeqpf( long m, long n, long a, long lda,
                 long jpvt, long tau, long work,
                 long info );
    void cgeqpf( long m, long n, IComplexNumber a,
                 long lda, long jpvt,
                 IComplexNumber tau, IComplexNumber work,
                 long rwork, long info );
    void zgeqpf( long m, long n, IComplexNumber a,
                 long lda, long jpvt,
                 IComplexNumber tau, IComplexNumber work,
                 long rwork, long info );
    void sgeqp3( long m, long n, long a, long lda,
                 long jpvt, long tau, long work,
                 long lwork, long info );
    void dgeqp3( long m, long n, long a, long lda,
                 long jpvt, long tau, long work,
                 long lwork, long info );
    void cgeqp3( long m, long n, IComplexNumber a,
                 long lda, long jpvt,
                 IComplexNumber tau, IComplexNumber work,
                 long lwork, long rwork, long info );
    void zgeqp3( long m, long n, IComplexNumber a,
                 long lda, long jpvt,
                 IComplexNumber tau, IComplexNumber work,
                 long lwork, long rwork, long info );
    void sorgqr( long m, long n, long k, long a,
                 long lda, final long tau, long work,
                 long lwork, long info );
    void dorgqr( long m, long n, long k, long a,
                 long lda, final long tau, long work,
                 long lwork, long info );
    void sormqr( long side, long trans, long m, long n,
                 long k, final long a, long lda,
                 final long tau, long c, long ldc, long work,
                 long lwork, long info );
    void dormqr( long side, long trans, long m, long n,
                 long k, final long a, long lda,
                 final long tau, long c, long ldc, long work,
                 long lwork, long info );
    void cungqr( long m, long n, long k,
                 IComplexNumber a, long lda,
                 final IComplexNumber tau, IComplexNumber work,
                 long lwork, long info );
    void zungqr( long m, long n, long k,
                 IComplexNumber a, long lda,
                 final IComplexNumber tau,
                 IComplexNumber work, long lwork,
                 long info );
    void cunmqr( long side, long trans, long m, long n,
                 long k, final IComplexNumber a,
                 long lda, final IComplexNumber tau,
                 IComplexNumber c, long ldc,
                 IComplexNumber work, long lwork,
                 long info );
    void zunmqr( long side, long trans, long m, long n,
                 long k, final IComplexNumber a,
                 long lda, final IComplexNumber tau,
                 IComplexNumber c, long ldc,
                 IComplexNumber work, long lwork,
                 long info );
    void sgelqf( long m, long n, long a, long lda,
                 long tau, long work, long lwork,
                 long info );
    void dgelqf( long m, long n, long a, long lda,
                 long tau, long work, long lwork,
                 long info );
    void cgelqf( long m, long n, IComplexNumber a,
                 long lda, IComplexNumber tau,
                 IComplexNumber work, long lwork,
                 long info );
    void zgelqf( long m, long n, IComplexNumber a,
                 long lda, IComplexNumber tau,
                 IComplexNumber work, long lwork,
                 long info );
    void sorglq( long m, long n, long k, long a,
                 long lda, final long tau, long work,
                 long lwork, long info );
    void dorglq( long m, long n, long k, long a,
                 long lda, final long tau, long work,
                 long lwork, long info );
    void sormlq( long side, long trans, long m, long n,
                 long k, final long a, long lda,
                 final long tau, long c, long ldc, long work,
                 long lwork, long info );
    void dormlq( long side, long trans, long m, long n,
                 long k, final long a, long lda,
                 final long tau, long c, long ldc, long work,
                 long lwork, long info );
    void cunglq( long m, long n, long k,
                 IComplexNumber a, long lda,
                 final IComplexNumber tau, IComplexNumber work,
                 long lwork, long info );
    void zunglq( long m, long n, long k,
                 IComplexNumber a, long lda,
                 final IComplexNumber tau,
                 IComplexNumber work, long lwork,
                 long info );
    void cunmlq( long side, long trans, long m, long n,
                 long k, final IComplexNumber a,
                 long lda, final IComplexNumber tau,
                 IComplexNumber c, long ldc,
                 IComplexNumber work, long lwork,
                 long info );
    void zunmlq( long side, long trans, long m, long n,
                 long k, final IComplexNumber a,
                 long lda, final IComplexNumber tau,
                 IComplexNumber c, long ldc,
                 IComplexNumber work, long lwork,
                 long info );
    void sgeqlf( long m, long n, long a, long lda,
                 long tau, long work, long lwork,
                 long info );
    void dgeqlf( long m, long n, long a, long lda,
                 long tau, long work, long lwork,
                 long info );
    void cgeqlf( long m, long n, IComplexNumber a,
                 long lda, IComplexNumber tau,
                 IComplexNumber work, long lwork,
                 long info );
    void zgeqlf( long m, long n, IComplexNumber a,
                 long lda, IComplexNumber tau,
                 IComplexNumber work, long lwork,
                 long info );
    void sorgql( long m, long n, long k, long a,
                 long lda, final long tau, long work,
                 long lwork, long info );
    void dorgql( long m, long n, long k, long a,
                 long lda, final long tau, long work,
                 long lwork, long info );
    void cungql( long m, long n, long k,
                 IComplexNumber a, long lda,
                 final IComplexNumber tau, IComplexNumber work,
                 long lwork, long info );
    void zungql( long m, long n, long k,
                 IComplexNumber a, long lda,
                 final IComplexNumber tau,
                 IComplexNumber work, long lwork,
                 long info );
    void sormql( long side, long trans, long m, long n,
                 long k, final long a, long lda,
                 final long tau, long c, long ldc, long work,
                 long lwork, long info );
    void dormql( long side, long trans, long m, long n,
                 long k, final long a, long lda,
                 final long tau, long c, long ldc, long work,
                 long lwork, long info );
    void cunmql( long side, long trans, long m, long n,
                 long k, final IComplexNumber a,
                 long lda, final IComplexNumber tau,
                 IComplexNumber c, long ldc,
                 IComplexNumber work, long lwork,
                 long info );
    void zunmql( long side, long trans, long m, long n,
                 long k, final IComplexNumber a,
                 long lda, final IComplexNumber tau,
                 IComplexNumber c, long ldc,
                 IComplexNumber work, long lwork,
                 long info );
    void sgerqf( long m, long n, long a, long lda,
                 long tau, long work, long lwork,
                 long info );
    void dgerqf( long m, long n, long a, long lda,
                 long tau, long work, long lwork,
                 long info );
    void cgerqf( long m, long n, IComplexNumber a,
                 long lda, IComplexNumber tau,
                 IComplexNumber work, long lwork,
                 long info );
    void zgerqf( long m, long n, IComplexNumber a,
                 long lda, IComplexNumber tau,
                 IComplexNumber work, long lwork,
                 long info );
    void sorgrq( long m, long n, long k, long a,
                 long lda, final long tau, long work,
                 long lwork, long info );
    void dorgrq( long m, long n, long k, long a,
                 long lda, final long tau, long work,
                 long lwork, long info );
    void cungrq( long m, long n, long k,
                 IComplexNumber a, long lda,
                 final IComplexNumber tau, IComplexNumber work,
                 long lwork, long info );
    void zungrq( long m, long n, long k,
                 IComplexNumber a, long lda,
                 final IComplexNumber tau,
                 IComplexNumber work, long lwork,
                 long info );
    void sormrq( long side, long trans, long m, long n,
                 long k, final long a, long lda,
                 final long tau, long c, long ldc, long work,
                 long lwork, long info );
    void dormrq( long side, long trans, long m, long n,
                 long k, final long a, long lda,
                 final long tau, long c, long ldc, long work,
                 long lwork, long info );
    void cunmrq( long side, long trans, long m, long n,
                 long k, final IComplexNumber a,
                 long lda, final IComplexNumber tau,
                 IComplexNumber c, long ldc,
                 IComplexNumber work, long lwork,
                 long info );
    void zunmrq( long side, long trans, long m, long n,
                 long k, final IComplexNumber a,
                 long lda, final IComplexNumber tau,
                 IComplexNumber c, long ldc,
                 IComplexNumber work, long lwork,
                 long info );
    void stzrzf( long m, long n, long a, long lda,
                 long tau, long work, long lwork,
                 long info );
    void dtzrzf( long m, long n, long a, long lda,
                 long tau, long work, long lwork,
                 long info );
    void ctzrzf( long m, long n, IComplexNumber a,
                 long lda, IComplexNumber tau,
                 IComplexNumber work, long lwork,
                 long info );
    void ztzrzf( long m, long n, IComplexNumber a,
                 long lda, IComplexNumber tau,
                 IComplexNumber work, long lwork,
                 long info );
    void sormrz( long side, long trans, long m, long n,
                 long k, long l, final long a,
                 long lda, final long tau, long c,
                 long ldc, long work, long lwork,
                 long info );
    void dormrz( long side, long trans, long m, long n,
                 long k, long l, final long a,
                 long lda, final long tau, long c,
                 long ldc, long work, long lwork,
                 long info );
    void cunmrz( long side, long trans, long m, long n,
                 long k, long l, final IComplexNumber a,
                 long lda, final IComplexNumber tau,
                 IComplexNumber c, long ldc,
                 IComplexNumber work, long lwork,
                 long info );
    void zunmrz( long side, long trans, long m, long n,
                 long k, long l,
                 final IComplexNumber a, long lda,
                 final IComplexNumber tau, IComplexNumber c,
                 long ldc, IComplexNumber work,
                 long lwork, long info );
    void sggqrf( long n, long m, long p, long a,
                 long lda, long taua, long b, long ldb,
                 long taub, long work, long lwork,
                 long info );
    void dggqrf( long n, long m, long p, long a,
                 long lda, long taua, long b, long ldb,
                 long taub, long work, long lwork,
                 long info );
    void cggqrf( long n, long m, long p,
                 IComplexNumber a, long lda,
                 IComplexNumber taua, IComplexNumber b,
                 long ldb, IComplexNumber taub,
                 IComplexNumber work, long lwork,
                 long info );
    void zggqrf( long n, long m, long p,
                 IComplexNumber a, long lda,
                 IComplexNumber taua, IComplexNumber b,
                 long ldb, IComplexNumber taub,
                 IComplexNumber work, long lwork,
                 long info );
    void sggrqf( long m, long p, long n, long a,
                 long lda, long taua, long b, long ldb,
                 long taub, long work, long lwork,
                 long info );
    void dggrqf( long m, long p, long n, long a,
                 long lda, long taua, long b, long ldb,
                 long taub, long work, long lwork,
                 long info );
    void cggrqf( long m, long p, long n,
                 IComplexNumber a, long lda,
                 IComplexNumber taua, IComplexNumber b,
                 long ldb, IComplexNumber taub,
                 IComplexNumber work, long lwork,
                 long info );
    void zggrqf( long m, long p, long n,
                 IComplexNumber a, long lda,
                 IComplexNumber taua, IComplexNumber b,
                 long ldb, IComplexNumber taub,
                 IComplexNumber work, long lwork,
                 long info );
    void sgebrd( long m, long n, long a, long lda,
                 long d, long e, long tauq, long taup, long work,
                 long lwork, long info );
    void dgebrd( long m, long n, long a, long lda,
                 long d, long e, long tauq, long taup,
                 long work, long lwork, long info );
    void cgebrd( long m, long n, IComplexNumber a,
                 long lda, long d, long e,
                 IComplexNumber tauq, IComplexNumber taup,
                 IComplexNumber work, long lwork,
                 long info );
    void zgebrd( long m, long n, IComplexNumber a,
                 long lda, long d, long e,
                 IComplexNumber tauq, IComplexNumber taup,
                 IComplexNumber work, long lwork,
                 long info );
    void sgbbrd( long vect, long m, long n, long ncc,
                 long kl, long ku, long ab, long ldab,
                 long d, long e, long q, long ldq, long pt,
                 long ldpt, long c, long ldc, long work,
                 long info );
    void dgbbrd( long vect, long m, long n, long ncc,
                 long kl, long ku, long ab,
                 long ldab, long d, long e, long q,
                 long ldq, long pt, long ldpt, long c,
                 long ldc, long work, long info );
    void cgbbrd( long vect, long m, long n, long ncc,
                 long kl, long ku, IComplexNumber ab,
                 long ldab, long d, long e,
                 IComplexNumber q, long ldq,
                 IComplexNumber pt, long ldpt,
                 IComplexNumber c, long ldc,
                 IComplexNumber work, long rwork,
                 long info );
    void zgbbrd( long vect, long m, long n, long ncc,
                 long kl, long ku, IComplexNumber ab,
                 long ldab, long d, long e,
                 IComplexNumber q, long ldq,
                 IComplexNumber pt, long ldpt,
                 IComplexNumber c, long ldc,
                 IComplexNumber work, long rwork,
                 long info );
    void sorgbr( long vect, long m, long n, long k,
                 long a, long lda, final long tau, long work,
                 long lwork, long info );
    void dorgbr( long vect, long m, long n, long k,
                 long a, long lda, final long tau, long work,
                 long lwork, long info );
    void sormbr( long vect, long side, long trans, long m,
                 long n, long k, final long a,
                 long lda, final long tau, long c,
                 long ldc, long work, long lwork,
                 long info );
    void dormbr( long vect, long side, long trans, long m,
                 long n, long k, final long a,
                 long lda, final long tau, long c,
                 long ldc, long work, long lwork,
                 long info );
    void cungbr( long vect, long m, long n, long k,
                 IComplexNumber a, long lda,
                 final IComplexNumber tau, IComplexNumber work,
                 long lwork, long info );
    void zungbr( long vect, long m, long n, long k,
                 IComplexNumber a, long lda,
                 final IComplexNumber tau,
                 IComplexNumber work, long lwork,
                 long info );
    void cunmbr( long vect, long side, long trans, long m,
                 long n, long k, final IComplexNumber a,
                 long lda, final IComplexNumber tau,
                 IComplexNumber c, long ldc,
                 IComplexNumber work, long lwork,
                 long info );
    void zunmbr( long vect, long side, long trans, long m,
                 long n, long k,
                 final IComplexNumber a, long lda,
                 final IComplexNumber tau, IComplexNumber c,
                 long ldc, IComplexNumber work,
                 long lwork, long info );
    void sbdsqr( long uplo, long n, long ncvt,
                 long nru, long ncc, long d, long e,
                 long vt, long ldvt, long u, long ldu,
                 long c, long ldc, long work, long info );
    void dbdsqr( long uplo, long n, long ncvt,
                 long nru, long ncc, long d, long e,
                 long vt, long ldvt, long u, long ldu,
                 long c, long ldc, long work,
                 long info );
    void cbdsqr( long uplo, long n, long ncvt,
                 long nru, long ncc, long d, long e,
                 IComplexNumber vt, long ldvt,
                 IComplexNumber u, long ldu,
                 IComplexNumber c, long ldc, long work,
                 long info );
    void zbdsqr( long uplo, long n, long ncvt,
                 long nru, long ncc, long d, long e,
                 IComplexNumber vt, long ldvt,
                 IComplexNumber u, long ldu,
                 IComplexNumber c, long ldc, long work,
                 long info );
    void sbdsdc( long uplo, long compq, long n, long d, long e,
                 long u, long ldu, long vt, long ldvt,
                 long q, long iq, long work, long iwork,
                 long info );
    void dbdsdc( long uplo, long compq, long n, long d,
                 long e, long u, long ldu, long vt,
                 long ldvt, long q, long iq, long work,
                 long iwork, long info );
    void sbdsvdx( long uplo, long jobz, long range,
                  long n, long d, long e,
                  long vl, long vu,
                  long il, long iu, long ns,
                  long s, long z, long ldz,
                  long work, long iwork, long info );
    void dbdsvdx( long uplo, long jobz, long range,
                  long n, long d, long e,
                  long vl, long vu,
                  long il, long iu, long ns,
                  long s, long z, long ldz,
                  long work, long iwork, long info );
    void ssytrd( long uplo, long n, long a, long lda,
                 long d, long e, long tau, long work,
                 long lwork, long info );
    void dsytrd( long uplo, long n, long a, long lda,
                 long d, long e, long tau, long work,
                 long lwork, long info );
    void sorgtr( long uplo, long n, long a, long lda,
                 final long tau, long work, long lwork,
                 long info );
    void dorgtr( long uplo, long n, long a, long lda,
                 final long tau, long work, long lwork,
                 long info );
    void sormtr( long side, long uplo, long trans, long m,
                 long n, final long a, long lda,
                 final long tau, long c, long ldc, long work,
                 long lwork, long info );
    void dormtr( long side, long uplo, long trans, long m,
                 long n, final long a, long lda,
                 final long tau, long c, long ldc, long work,
                 long lwork, long info );
    void chetrd( long uplo, long n, IComplexNumber a,
                 long lda, long d, long e,
                 IComplexNumber tau, IComplexNumber work,
                 long lwork, long info );
    void zhetrd( long uplo, long n, IComplexNumber a,
                 long lda, long d, long e,
                 IComplexNumber tau, IComplexNumber work,
                 long lwork, long info );
    void cungtr( long uplo, long n, IComplexNumber a,
                 long lda, final IComplexNumber tau,
                 IComplexNumber work, long lwork,
                 long info );
    void zungtr( long uplo, long n, IComplexNumber a,
                 long lda, final IComplexNumber tau,
                 IComplexNumber work, long lwork,
                 long info );
    void cunmtr( long side, long uplo, long trans, long m,
                 long n, final IComplexNumber a,
                 long lda, final IComplexNumber tau,
                 IComplexNumber c, long ldc,
                 IComplexNumber work, long lwork,
                 long info );
    void zunmtr( long side, long uplo, long trans, long m,
                 long n, final IComplexNumber a,
                 long lda, final IComplexNumber tau,
                 IComplexNumber c, long ldc,
                 IComplexNumber work, long lwork,
                 long info );
    void ssptrd( long uplo, long n, long ap, long d, long e,
                 long tau, long info );
    void dsptrd( long uplo, long n, long ap, long d, long e,
                 long tau, long info );
    void sopgtr( long uplo, long n, final long ap,
                 final long tau, long q, long ldq, long work,
                 long info );
    void dopgtr( long uplo, long n, final long ap,
                 final long tau, long q, long ldq, long work,
                 long info );
    void sopmtr( long side, long uplo, long trans, long m,
                 long n, final long ap, final long tau, long c,
                 long ldc, long work, long info );
    void dopmtr( long side, long uplo, long trans, long m,
                 long n, final long ap, final long tau,
                 long c, long ldc, long work,
                 long info );
    void chptrd( long uplo, long n, IComplexNumber ap,
                 long d, long e, IComplexNumber tau,
                 long info );
    void zhptrd( long uplo, long n, IComplexNumber ap,
                 long d, long e, IComplexNumber tau,
                 long info );
    void cupgtr( long uplo, long n, final IComplexNumber ap,
                 final IComplexNumber tau, IComplexNumber q,
                 long ldq, IComplexNumber work,
                 long info );
    void zupgtr( long uplo, long n, final IComplexNumber ap,
                 final IComplexNumber tau, IComplexNumber q,
                 long ldq, IComplexNumber work,
                 long info );
    void cupmtr( long side, long uplo, long trans, long m,
                 long n, final IComplexNumber ap,
                 final IComplexNumber tau, IComplexNumber c,
                 long ldc, IComplexNumber work,
                 long info );
    void zupmtr( long side, long uplo, long trans, long m,
                 long n, final IComplexNumber ap,
                 final IComplexNumber tau, IComplexNumber c,
                 long ldc, IComplexNumber work,
                 long info );
    void ssbtrd( long vect, long uplo, long n, long kd,
                 long ab, long ldab, long d, long e, long q,
                 long ldq, long work, long info );
    void dsbtrd( long vect, long uplo, long n, long kd,
                 long ab, long ldab, long d, long e,
                 long q, long ldq, long work,
                 long info );
    void chbtrd( long vect, long uplo, long n, long kd,
                 IComplexNumber ab, long ldab, long d,
                 long e, IComplexNumber q, long ldq,
                 IComplexNumber work, long info );
    void zhbtrd( long vect, long uplo, long n, long kd,
                 IComplexNumber ab, long ldab, long d,
                 long e, IComplexNumber q, long ldq,
                 IComplexNumber work, long info );
    void ssterf( long n, long d, long e, long info );
    void dsterf( long n, long d, long e, long info );
    void ssteqr( long compz, long n, long d, long e, long z,
                 long ldz, long work, long info );
    void dsteqr( long compz, long n, long d, long e, long z,
                 long ldz, long work, long info );
    void csteqr( long compz, long n, long d, long e,
                 IComplexNumber z, long ldz, long work,
                 long info );
    void zsteqr( long compz, long n, long d, long e,
                 IComplexNumber z, long ldz, long work,
                 long info );
    void sstemr( long jobz, long range, long n, long d, long e,
                 long vl, long vu, long il, long iu,
                 long m, long w, long z, long ldz,
                 long nzc, long isuppz,long  tryrac,
                 long work, long lwork, long iwork,
                 long liwork, long info );
    void dstemr( long jobz, long range, long n, long d,
                 long e, long vl, long vu, long il,
                 long iu, long m, long w, long z,
                 long ldz, long nzc, long isuppz,
                 long  tryrac, long work, long lwork,
                 long iwork, long liwork, long info );
    void cstemr( long jobz, long range, long n, long d, long e,
                 long vl, long vu, long il, long iu,
                 long m, long w, IComplexNumber z,
                 long ldz, long nzc, long isuppz,
                 long  tryrac, long work, long lwork,
                 long iwork, long liwork, long info );
    void zstemr( long jobz, long range, long n, long d,
                 long e, long vl, long vu, long il,
                 long iu, long m, long w,
                 IComplexNumber z, long ldz, long nzc,
                 long isuppz,long  tryrac, long work,
                 long lwork, long iwork, long liwork,
                 long info );
    void sstedc( long compz, long n, long d, long e, long z,
                 long ldz, long work, long lwork,
                 long iwork, long liwork, long info );
    void dstedc( long compz, long n, long d, long e, long z,
                 long ldz, long work, long lwork,
                 long iwork, long liwork, long info );
    void cstedc( long compz, long n, long d, long e,
                 IComplexNumber z, long ldz,
                 IComplexNumber work, long lwork, long rwork,
                 long lrwork, long iwork, long liwork,
                 long info );
    void zstedc( long compz, long n, long d, long e,
                 IComplexNumber z, long ldz,
                 IComplexNumber work, long lwork,
                 long rwork, long lrwork, long iwork,
                 long liwork, long info );
    void sstegr( long jobz, long range, long n, long d, long e,
                 long vl, long vu, long il, long iu,
                 long abstol, long m, long w, long z,
                 long ldz, long isuppz, long work,
                 long lwork, long iwork, long liwork,
                 long info );
    void dstegr( long jobz, long range, long n, long d,
                 long e, long vl, long vu, long il,
                 long iu, long abstol, long m, long w,
                 long z, long ldz, long isuppz,
                 long work, long lwork, long iwork,
                 long liwork, long info );
    void cstegr( long jobz, long range, long n, long d, long e,
                 long vl, long vu, long il, long iu,
                 long abstol, long m, long w,
                 IComplexNumber z, long ldz,
                 long isuppz, long work, long lwork,
                 long iwork, long liwork, long info );
    void zstegr( long jobz, long range, long n, long d,
                 long e, long vl, long vu, long il,
                 long iu, long abstol, long m, long w,
                 IComplexNumber z, long ldz,
                 long isuppz, long work, long lwork,
                 long iwork, long liwork, long info );
    void spteqr( long compz, long n, long d, long e, long z,
                 long ldz, long work, long info );
    void dpteqr( long compz, long n, long d, long e, long z,
                 long ldz, long work, long info );
    void cpteqr( long compz, long n, long d, long e,
                 IComplexNumber z, long ldz, long work,
                 long info );
    void zpteqr( long compz, long n, long d, long e,
                 IComplexNumber z, long ldz, long work,
                 long info );
    void sstebz( long range, long order, long n, long vl,
                 long vu, long il, long iu, long abstol,
                 final long d, final long e, long m,
                 long nsplit, long w, long iblock,
                 long isplit, long work, long iwork,
                 long info );
    void dstebz( long range, long order, long n, long vl,
                 long vu, long il, long iu, long abstol,
                 final long d, final long e, long m,
                 long nsplit, long w, long iblock,
                 long isplit, long work, long iwork,
                 long info );
    void sstein( long n, final long d, final long e,
                 long m, final long w, final long iblock,
                 final long isplit, long z, long ldz,
                 long work, long iwork, long ifailv,
                 long info );
    void dstein( long n, final long d, final long e,
                 long m, final long w, final long iblock,
                 final long isplit, long z, long ldz,
                 long work, long iwork, long ifailv,
                 long info );
    void cstein( long n, final long d, final long e,
                 long m, final long w, final long iblock,
                 final long isplit, IComplexNumber z,
                 long ldz, long work, long iwork,
                 long ifailv, long info );
    void zstein( long n, final long d, final long e,
                 long m, final long w, final long iblock,
                 final long isplit, IComplexNumber z,
                 long ldz, long work, long iwork,
                 long ifailv, long info );
    void sdisna( long job, long m, long n, final long d,
                 long sep, long info );
    void ddisna( long job, long m, long n, final long d,
                 long sep, long info );
    void ssygst( long itype, long uplo, long n, long a,
                 long lda, final long b, long ldb,
                 long info );
    void dsygst( long itype, long uplo, long n, long a,
                 long lda, final long b, long ldb,
                 long info );
    void chegst( long itype, long uplo, long n,
                 IComplexNumber a, long lda,
                 final IComplexNumber b, long ldb,
                 long info );
    void zhegst( long itype, long uplo, long n,
                 IComplexNumber a, long lda,
                 final IComplexNumber b, long ldb,
                 long info );
    void sspgst( long itype, long uplo, long n, long ap,
                 final long bp, long info );
    void dspgst( long itype, long uplo, long n, long ap,
                 final long bp, long info );
    void chpgst( long itype, long uplo, long n,
                 IComplexNumber ap, final IComplexNumber bp,
                 long info );
    void zhpgst( long itype, long uplo, long n,
                 IComplexNumber ap, final IComplexNumber bp,
                 long info );
    void ssbgst( long vect, long uplo, long n, long ka,
                 long kb, long ab, long ldab,
                 final long bb, long ldbb, long x,
                 long ldx, long work, long info );
    void dsbgst( long vect, long uplo, long n, long ka,
                 long kb, long ab, long ldab,
                 final long bb, long ldbb, long x,
                 long ldx, long work, long info );
    void chbgst( long vect, long uplo, long n, long ka,
                 long kb, IComplexNumber ab, long ldab,
                 final IComplexNumber bb, long ldbb,
                 IComplexNumber x, long ldx,
                 IComplexNumber work, long rwork,
                 long info );
    void zhbgst( long vect, long uplo, long n, long ka,
                 long kb, IComplexNumber ab, long ldab,
                 final IComplexNumber bb, long ldbb,
                 IComplexNumber x, long ldx,
                 IComplexNumber work, long rwork,
                 long info );
    void spbstf( long uplo, long n, long kb, long bb,
                 long ldbb, long info );
    void dpbstf( long uplo, long n, long kb, long bb,
                 long ldbb, long info );
    void cpbstf( long uplo, long n, long kb,
                 IComplexNumber bb, long ldbb,
                 long info );
    void zpbstf( long uplo, long n, long kb,
                 IComplexNumber bb, long ldbb,
                 long info );
    void sgehrd( long n, long ilo, long ihi, long a,
                 long lda, long tau, long work, long lwork,
                 long info );
    void dgehrd( long n, long ilo, long ihi, long a,
                 long lda, long tau, long work,
                 long lwork, long info );
    void cgehrd( long n, long ilo, long ihi,
                 IComplexNumber a, long lda,
                 IComplexNumber tau, IComplexNumber work,
                 long lwork, long info );
    void zgehrd( long n, long ilo, long ihi,
                 IComplexNumber a, long lda,
                 IComplexNumber tau, IComplexNumber work,
                 long lwork, long info );
    void sorghr( long n, long ilo, long ihi, long a,
                 long lda, final long tau, long work,
                 long lwork, long info );
    void dorghr( long n, long ilo, long ihi, long a,
                 long lda, final long tau, long work,
                 long lwork, long info );
    void sormhr( long side, long trans, long m, long n,
                 long ilo, long ihi, final long a,
                 long lda, final long tau, long c,
                 long ldc, long work, long lwork,
                 long info );
    void dormhr( long side, long trans, long m, long n,
                 long ilo, long ihi, final long a,
                 long lda, final long tau, long c,
                 long ldc, long work, long lwork,
                 long info );
    void cunghr( long n, long ilo, long ihi,
                 IComplexNumber a, long lda,
                 final IComplexNumber tau, IComplexNumber work,
                 long lwork, long info );
    void zunghr( long n, long ilo, long ihi,
                 IComplexNumber a, long lda,
                 final IComplexNumber tau,
                 IComplexNumber work, long lwork,
                 long info );
    void cunmhr( long side, long trans, long m, long n,
                 long ilo, long ihi,
                 final IComplexNumber a, long lda,
                 final IComplexNumber tau, IComplexNumber c,
                 long ldc, IComplexNumber work,
                 long lwork, long info );
    void zunmhr( long side, long trans, long m, long n,
                 long ilo, long ihi,
                 final IComplexNumber a, long lda,
                 final IComplexNumber tau, IComplexNumber c,
                 long ldc, IComplexNumber work,
                 long lwork, long info );
    void sgebal( long job, long n, long a, long lda,
                 long ilo, long ihi, long scale,
                 long info );
    void dgebal( long job, long n, long a, long lda,
                 long ilo, long ihi, long scale,
                 long info );
    void cgebal( long job, long n, IComplexNumber a,
                 long lda, long ilo, long ihi,
                 long scale, long info );
    void zgebal( long job, long n, IComplexNumber a,
                 long lda, long ilo, long ihi,
                 long scale, long info );
    void sgebak( long job, long side, long n, long ilo,
                 long ihi, final long scale, long m,
                 long v, long ldv, long info );
    void dgebak( long job, long side, long n, long ilo,
                 long ihi, final long scale, long m,
                 long v, long ldv, long info );
    void cgebak( long job, long side, long n, long ilo,
                 long ihi, final long scale, long m,
                 IComplexNumber v, long ldv,
                 long info );
    void zgebak( long job, long side, long n, long ilo,
                 long ihi, final long scale, long m,
                 IComplexNumber v, long ldv,
                 long info );
    void shseqr( long job, long compz, long n, long ilo,
                 long ihi, long h, long ldh, long wr,
                 long wi, long z, long ldz, long work,
                 long lwork, long info );
    void dhseqr( long job, long compz, long n, long ilo,
                 long ihi, long h, long ldh, long wr,
                 long wi, long z, long ldz, long work,
                 long lwork, long info );
    void chseqr( long job, long compz, long n, long ilo,
                 long ihi, IComplexNumber h, long ldh,
                 IComplexNumber w, IComplexNumber z,
                 long ldz, IComplexNumber work,
                 long lwork, long info );
    void zhseqr( long job, long compz, long n, long ilo,
                 long ihi, IComplexNumber h, long ldh,
                 IComplexNumber w, IComplexNumber z,
                 long ldz, IComplexNumber work,
                 long lwork, long info );
    void shsein( long job, long eigsrc, long initv,
                 long  select, long n, final long h,
                 long ldh, long wr, final long wi, long vl,
                 long ldvl, long vr, long ldvr,
                 long mm, long m, long work,
                 long ifaill, long ifailr, long info );
    void dhsein( long job, long eigsrc, long initv,
                 long  select, long n, final long h,
                 long ldh, long wr, final long wi, long vl,
                 long ldvl, long vr, long ldvr,
                 long mm, long m, long work,
                 long ifaill, long ifailr, long info );
    void chsein( long job, long eigsrc, long initv,
                 long   select, long n,
                 final IComplexNumber h, long ldh,
                 IComplexNumber w, IComplexNumber vl,
                 long ldvl, IComplexNumber vr,
                 long ldvr, long mm, long m,
                 IComplexNumber work, long rwork,
                 long ifaill, long ifailr, long info );
    void zhsein( long job, long eigsrc, long initv,
                 long   select, long n,
                 final IComplexNumber h, long ldh,
                 IComplexNumber w, IComplexNumber vl,
                 long ldvl, IComplexNumber vr,
                 long ldvr, long mm, long m,
                 IComplexNumber work, long rwork,
                 long ifaill, long ifailr, long info );
    void strevc( long side, long howmny,long  select,
                 long n, final long t, long ldt, long vl,
                 long ldvl, long vr, long ldvr,
                 long mm, long m, long work,
                 long info );
    void dtrevc( long side, long howmny,long  select,
                 long n, final long t, long ldt, long vl,
                 long ldvl, long vr, long ldvr,
                 long mm, long m, long work,
                 long info );
    void ctrevc( long side, long howmny, long   select,
                 long n, IComplexNumber t, long ldt,
                 IComplexNumber vl, long ldvl,
                 IComplexNumber vr, long ldvr, long mm,
                 long m, IComplexNumber work, long rwork,
                 long info );
    void ztrevc( long side, long howmny, long   select,
                 long n, IComplexNumber t, long ldt,
                 IComplexNumber vl, long ldvl,
                 IComplexNumber vr, long ldvr, long mm,
                 long m, IComplexNumber work, long rwork,
                 long info );
    void strsna( long job, long howmny, long   select,
                 long n, final long t, long ldt,
                 final long vl, long ldvl, final long vr,
                 long ldvr, long s, long sep, long mm,
                 long m, long work, long ldwork,
                 long iwork, long info );
    void dtrsna( long job, long howmny, long   select,
                 long n, final long t, long ldt,
                 final long vl, long ldvl, final long vr,
                 long ldvr, long s, long sep, long mm,
                 long m, long work, long ldwork,
                 long iwork, long info );
    void ctrsna( long job, long howmny, long   select,
                 long n, final IComplexNumber t,
                 long ldt, final IComplexNumber vl,
                 long ldvl, final IComplexNumber vr,
                 long ldvr, long s, long sep, long mm,
                 long m, IComplexNumber work,
                 long ldwork, long rwork, long info );
    void ztrsna( long job, long howmny, long   select,
                 long n, final IComplexNumber t,
                 long ldt, final IComplexNumber vl,
                 long ldvl, final IComplexNumber vr,
                 long ldvr, long s, long sep, long mm,
                 long m, IComplexNumber work,
                 long ldwork, long rwork, long info );
    void strexc( long compq, long n, long t, long ldt,
                 long q, long ldq, long ifst,
                 long ilst, long work, long info );
    void dtrexc( long compq, long n, long t, long ldt,
                 long q, long ldq, long ifst,
                 long ilst, long work, long info );
    void ctrexc( long compq, long n, IComplexNumber t,
                 long ldt, IComplexNumber q, long ldq,
                 long ifst, long ilst, long info );
    void ztrexc( long compq, long n, IComplexNumber t,
                 long ldt, IComplexNumber q, long ldq,
                 long ifst, long ilst, long info );
    void strsen( long job, long compq, long   select,
                 long n, long t, long ldt, long q,
                 long ldq, long wr, long wi, long m,
                 long s, long sep, long work, long lwork,
                 long iwork, long liwork, long info );
    void dtrsen( long job, long compq, long   select,
                 long n, long t, long ldt, long q,
                 long ldq, long wr, long wi, long m,
                 long s, long sep, long work, long lwork,
                 long iwork, long liwork, long info );
    void ctrsen( long job, long compq, long   select,
                 long n, IComplexNumber t, long ldt,
                 IComplexNumber q, long ldq,
                 IComplexNumber w, long m, long s,
                 long sep, IComplexNumber work, long lwork,
                 long info );
    void ztrsen( long job, long compq, long   select,
                 long n, IComplexNumber t, long ldt,
                 IComplexNumber q, long ldq,
                 IComplexNumber w, long m, long s,
                 long sep, IComplexNumber work, long lwork,
                 long info );
    void strsyl( long trana, long tranb, long isgn, long m,
                 long n, final long a, long lda,
                 final long b, long ldb, long c, long ldc,
                 long scale, long info );
    void dtrsyl( long trana, long tranb, long isgn, long m,
                 long n, final long a, long lda,
                 final long b, long ldb, long c,
                 long ldc, long scale, long info );
    void ctrsyl( long trana, long tranb, long isgn, long m,
                 long n, final IComplexNumber a,
                 long lda, final IComplexNumber b,
                 long ldb, IComplexNumber c, long ldc,
                 long scale, long info );
    void ztrsyl( long trana, long tranb, long isgn, long m,
                 long n, final IComplexNumber a,
                 long lda, final IComplexNumber b,
                 long ldb, IComplexNumber c, long ldc,
                 long scale, long info );
    void sgghrd( long compq, long compz, long n, long ilo,
                 long ihi, long a, long lda, long b,
                 long ldb, long q, long ldq, long z,
                 long ldz, long info );
    void dgghrd( long compq, long compz, long n, long ilo,
                 long ihi, long a, long lda, long b,
                 long ldb, long q, long ldq, long z,
                 long ldz, long info );
    void cgghrd( long compq, long compz, long n, long ilo,
                 long ihi, IComplexNumber a, long lda,
                 IComplexNumber b, long ldb,
                 IComplexNumber q, long ldq,
                 IComplexNumber z, long ldz,
                 long info );
    void zgghrd( long compq, long compz, long n, long ilo,
                 long ihi, IComplexNumber a, long lda,
                 IComplexNumber b, long ldb,
                 IComplexNumber q, long ldq,
                 IComplexNumber z, long ldz,
                 long info );
    void sgghd3( long compq, long compz, long n, long ilo,
                 long ihi, long a, long lda, long b,
                 long ldb, long q, long ldq, long z,
                 long ldz, long work, long lwork,
                 long info );
    void dgghd3( long compq, long compz, long n, long ilo,
                 long ihi, long a, long lda, long b,
                 long ldb, long q, long ldq, long z,
                 long ldz, long work, long lwork,
                 long info );
    void cgghd3( long compq, long compz, long n,
                 long ilo, long ihi,
                 IComplexNumber a, long lda,
                 IComplexNumber b, long ldb,
                 IComplexNumber q, long ldq,
                 IComplexNumber z, long ldz,
                 IComplexNumber work, long lwork,
                 long info );
    void zgghd3( long compq, long compz, long n,
                 long ilo, long ihi,
                 IComplexNumber a, long lda,
                 IComplexNumber b, long ldb,
                 IComplexNumber q, long ldq,
                 IComplexNumber z, long ldz,
                 IComplexNumber work, long lwork,
                 long info );
    void sggbal( long job, long n, long a, long lda,
                 long b, long ldb, long ilo, long ihi,
                 long lscale, long rscale, long work,
                 long info );
    void dggbal( long job, long n, long a, long lda,
                 long b, long ldb, long ilo,
                 long ihi, long lscale, long rscale,
                 long work, long info );
    void cggbal( long job, long n, IComplexNumber a,
                 long lda, IComplexNumber b, long ldb,
                 long ilo, long ihi, long lscale,
                 long rscale, long work, long info );
    void zggbal( long job, long n, IComplexNumber a,
                 long lda, IComplexNumber b, long ldb,
                 long ilo, long ihi, long lscale,
                 long rscale, long work, long info );
    void sggbak( long job, long side, long n, long ilo,
                 long ihi, final long lscale, final long rscale,
                 long m, long v, long ldv,
                 long info );
    void dggbak( long job, long side, long n, long ilo,
                 long ihi, final long lscale, final long rscale,
                 long m, long v, long ldv,
                 long info );
    void cggbak( long job, long side, long n, long ilo,
                 long ihi, final long lscale, final long rscale,
                 long m, IComplexNumber v, long ldv,
                 long info );
    void zggbak( long job, long side, long n, long ilo,
                 long ihi, final long lscale, final long rscale,
                 long m, IComplexNumber v, long ldv,
                 long info );
    void shgeqz( long job, long compq, long compz, long n,
                 long ilo, long ihi, long h, long ldh,
                 long t, long ldt, long alphar, long alphai,
                 long beta, long q, long ldq, long z,
                 long ldz, long work, long lwork,
                 long info );
    void dhgeqz( long job, long compq, long compz, long n,
                 long ilo, long ihi, long h,
                 long ldh, long t, long ldt, long alphar,
                 long alphai, long beta, long q, long ldq,
                 long z, long ldz, long work, long lwork,
                 long info );
    void chgeqz( long job, long compq, long compz, long n,
                 long ilo, long ihi, IComplexNumber h,
                 long ldh, IComplexNumber t, long ldt,
                 IComplexNumber alpha, IComplexNumber beta,
                 IComplexNumber q, long ldq,
                 IComplexNumber z, long ldz,
                 IComplexNumber work, long lwork, long rwork,
                 long info );
    void zhgeqz( long job, long compq, long compz, long n,
                 long ilo, long ihi, IComplexNumber h,
                 long ldh, IComplexNumber t, long ldt,
                 IComplexNumber alpha, IComplexNumber beta,
                 IComplexNumber q, long ldq,
                 IComplexNumber z, long ldz,
                 IComplexNumber work, long lwork,
                 long rwork, long info );
    void stgevc( long side, long howmny, long   select,
                 long n, final long s, long lds,
                 final long p, long ldp, long vl,
                 long ldvl, long vr, long ldvr,
                 long mm, long m, long work,
                 long info );
    void dtgevc( long side, long howmny, long   select,
                 long n, final long s, long lds,
                 final long p, long ldp, long vl,
                 long ldvl, long vr, long ldvr,
                 long mm, long m, long work,
                 long info );
    void ctgevc( long side, long howmny, long   select,
                 long n, final IComplexNumber s,
                 long lds, final IComplexNumber p,
                 long ldp, IComplexNumber vl, long ldvl,
                 IComplexNumber vr, long ldvr, long mm,
                 long m, IComplexNumber work, long rwork,
                 long info );
    void ztgevc( long side, long howmny, long   select,
                 long n, final IComplexNumber s,
                 long lds, final IComplexNumber p,
                 long ldp, IComplexNumber vl,
                 long ldvl, IComplexNumber vr,
                 long ldvr, long mm, long m,
                 IComplexNumber work, long rwork,
                 long info );
    void stgexc(long  wantq,long  wantz, long n,
                long a, long lda, long b, long ldb,
                long q, long ldq, long z, long ldz,
                long ifst, long ilst, long work,
                long lwork, long info );
    void dtgexc(long  wantq,long  wantz, long n,
                long a, long lda, long b, long ldb,
                long q, long ldq, long z, long ldz,
                long ifst, long ilst, long work,
                long lwork, long info );
    void ctgexc(long  wantq,long  wantz, long n,
                IComplexNumber a, long lda,
                IComplexNumber b, long ldb,
                IComplexNumber q, long ldq,
                IComplexNumber z, long ldz, long ifst,
                long ilst, long info );
    void ztgexc(long  wantq,long  wantz, long n,
                IComplexNumber a, long lda,
                IComplexNumber b, long ldb,
                IComplexNumber q, long ldq,
                IComplexNumber z, long ldz, long ifst,
                long ilst, long info );
    void stgsen( long ijob,long  wantq,
                 long  wantz, long   select,
                 long n, long a, long lda, long b,
                 long ldb, long alphar, long alphai, long beta,
                 long q, long ldq, long z, long ldz,
                 long m, long pl, long pr, long dif,
                 long work, long lwork, long iwork,
                 long liwork, long info );
    void dtgsen( long ijob,long  wantq,
                 long  wantz, long   select,
                 long n, long a, long lda, long b,
                 long ldb, long alphar, long alphai,
                 long beta, long q, long ldq, long z,
                 long ldz, long m, long pl, long pr,
                 long dif, long work, long lwork,
                 long iwork, long liwork, long info );
    void ctgsen( long ijob,long  wantq,
                 long  wantz, long   select,
                 long n, IComplexNumber a, long lda,
                 IComplexNumber b, long ldb,
                 IComplexNumber alpha, IComplexNumber beta,
                 IComplexNumber q, long ldq,
                 IComplexNumber z, long ldz, long m,
                 long pl, long pr, long dif,
                 IComplexNumber work, long lwork,
                 long iwork, long liwork, long info );
    void ztgsen( long ijob,long  wantq,
                 long  wantz, long   select,
                 long n, IComplexNumber a, long lda,
                 IComplexNumber b, long ldb,
                 IComplexNumber alpha, IComplexNumber beta,
                 IComplexNumber q, long ldq,
                 IComplexNumber z, long ldz, long m,
                 long pl, long pr, long dif,
                 IComplexNumber work, long lwork,
                 long iwork, long liwork, long info );
    void stgsyl( long trans, long ijob, long m, long n,
                 final long a, long lda, final long b,
                 long ldb, long c, long ldc, final long d,
                 long ldd, final long e, long lde, long f,
                 long ldf, long scale, long dif, long work,
                 long lwork, long iwork, long info );
    void dtgsyl( long trans, long ijob, long m, long n,
                 final long a, long lda, final long b,
                 long ldb, long c, long ldc,
                 final long d, long ldd, final long e,
                 long lde, long f, long ldf, long scale,
                 long dif, long work, long lwork,
                 long iwork, long info );
    void ctgsyl( long trans, long ijob, long m, long n,
                 final IComplexNumber a, long lda,
                 final IComplexNumber b, long ldb,
                 IComplexNumber c, long ldc,
                 final IComplexNumber d, long ldd,
                 final IComplexNumber e, long lde,
                 IComplexNumber f, long ldf, long scale,
                 long dif, IComplexNumber work, long lwork,
                 long iwork, long info );
    void ztgsyl( long trans, long ijob, long m, long n,
                 final IComplexNumber a, long lda,
                 final IComplexNumber b, long ldb,
                 IComplexNumber c, long ldc,
                 final IComplexNumber d, long ldd,
                 final IComplexNumber e, long lde,
                 IComplexNumber f, long ldf, long scale,
                 long dif, IComplexNumber work, long lwork,
                 long iwork, long info );
    void stgsna( long job, long howmny, long   select,
                 long n, final long a, long lda,
                 final long b, long ldb, final long vl,
                 long ldvl, final long vr, long ldvr,
                 long s, long dif, long mm, long m,
                 long work, long lwork, long iwork,
                 long info );
    void dtgsna( long job, long howmny, long   select,
                 long n, final long a, long lda,
                 final long b, long ldb, final long vl,
                 long ldvl, final long vr, long ldvr,
                 long s, long dif, long mm, long m,
                 long work, long lwork, long iwork,
                 long info );
    void ctgsna( long job, long howmny, long   select,
                 long n, final IComplexNumber a,
                 long lda, final IComplexNumber b,
                 long ldb, final IComplexNumber vl,
                 long ldvl, final IComplexNumber vr,
                 long ldvr, long s, long dif, long mm,
                 long m, IComplexNumber work,
                 long lwork, long iwork, long info );
    void ztgsna( long job, long howmny, long   select,
                 long n, final IComplexNumber a,
                 long lda, final IComplexNumber b,
                 long ldb, final IComplexNumber vl,
                 long ldvl, final IComplexNumber vr,
                 long ldvr, long s, long dif, long mm,
                 long m, IComplexNumber work,
                 long lwork, long iwork, long info );
    void sggsvp( long jobu, long jobv, long jobq, long m,
                 long p, long n, long a, long lda,
                 long b, long ldb, long tola, long tolb,
                 long k, long l, long u, long ldu,
                 long v, long ldv, long q, long ldq,
                 long iwork, long tau, long work,
                 long info );
    void dggsvp( long jobu, long jobv, long jobq, long m,
                 long p, long n, long a, long lda,
                 long b, long ldb, long tola, long tolb,
                 long k, long l, long u, long ldu,
                 long v, long ldv, long q, long ldq,
                 long iwork, long tau, long work,
                 long info );
    void cggsvp( long jobu, long jobv, long jobq, long m,
                 long p, long n, IComplexNumber a,
                 long lda, IComplexNumber b, long ldb,
                 long tola, long tolb, long k, long l,
                 IComplexNumber u, long ldu,
                 IComplexNumber v, long ldv,
                 IComplexNumber q, long ldq, long iwork,
                 long rwork, IComplexNumber tau,
                 IComplexNumber work, long info );
    void zggsvp( long jobu, long jobv, long jobq, long m,
                 long p, long n, IComplexNumber a,
                 long lda, IComplexNumber b, long ldb,
                 long tola, long tolb, long k, long l,
                 IComplexNumber u, long ldu,
                 IComplexNumber v, long ldv,
                 IComplexNumber q, long ldq,
                 long iwork, long rwork,
                 IComplexNumber tau, IComplexNumber work,
                 long info );
    void sggsvp3( long jobu, long jobv, long jobq, long m,
                  long p, long n, long a, long lda,
                  long b, long ldb, long tola, long tolb,
                  long k, long l, long u, long ldu,
                  long v, long ldv, long q, long ldq,
                  long iwork, long tau, long work,
                  long lwork, long info );
    void dggsvp3( long jobu, long jobv, long jobq, long m,
                  long p, long n, long a, long lda,
                  long b, long ldb, long tola, long tolb,
                  long k, long l, long u, long ldu,
                  long v, long ldv, long q, long ldq,
                  long iwork, long tau, long work,
                  long lwork, long info );
    void cggsvp3( long jobu, long jobv, long jobq, long m,
                  long p, long n, IComplexNumber a,
                  long lda, IComplexNumber b, long ldb,
                  long tola, long tolb, long k, long l,
                  IComplexNumber u, long ldu,
                  IComplexNumber v, long ldv,
                  IComplexNumber q, long ldq, long iwork,
                  long rwork, IComplexNumber tau,
                  IComplexNumber work, long lwork,
                  long info );
    void zggsvp3( long jobu, long jobv, long jobq, long m,
                  long p, long n, IComplexNumber a,
                  long lda, IComplexNumber b, long ldb,
                  long tola, long tolb, long k, long l,
                  IComplexNumber u, long ldu,
                  IComplexNumber v, long ldv,
                  IComplexNumber q, long ldq,
                  long iwork, long rwork,
                  IComplexNumber tau, IComplexNumber work,
                  long lwork, long info );
    void stgsja( long jobu, long jobv, long jobq, long m,
                 long p, long n, long k, long l,
                 long a, long lda, long b, long ldb,
                 long tola, long tolb, long alpha, long beta,
                 long u, long ldu, long v, long ldv,
                 long q, long ldq, long work, long ncycle,
                 long info );
    void dtgsja( long jobu, long jobv, long jobq, long m,
                 long p, long n, long k, long l,
                 long a, long lda, long b, long ldb,
                 long tola, long tolb, long alpha, long beta,
                 long u, long ldu, long v, long ldv,
                 long q, long ldq, long work,
                 long ncycle, long info );
    void ctgsja( long jobu, long jobv, long jobq, long m,
                 long p, long n, long k, long l,
                 IComplexNumber a, long lda,
                 IComplexNumber b, long ldb, long tola,
                 long tolb, long alpha, long beta,
                 IComplexNumber u, long ldu,
                 IComplexNumber v, long ldv,
                 IComplexNumber q, long ldq,
                 IComplexNumber work, long ncycle,
                 long info );
    void ztgsja( long jobu, long jobv, long jobq, long m,
                 long p, long n, long k, long l,
                 IComplexNumber a, long lda,
                 IComplexNumber b, long ldb, long tola,
                 long tolb, long alpha, long beta,
                 IComplexNumber u, long ldu,
                 IComplexNumber v, long ldv,
                 IComplexNumber q, long ldq,
                 IComplexNumber work, long ncycle,
                 long info );
    void sgels( long trans, long m, long n, long nrhs,
                long a, long lda, long b, long ldb,
                long work, long lwork, long info );
    void dgels( long trans, long m, long n, long nrhs,
                long a, long lda, long b, long ldb,
                long work, long lwork, long info );
    void cgels( long trans, long m, long n, long nrhs,
                IComplexNumber a, long lda,
                IComplexNumber b, long ldb,
                IComplexNumber work, long lwork,
                long info );
    void zgels( long trans, long m, long n, long nrhs,
                IComplexNumber a, long lda,
                IComplexNumber b, long ldb,
                IComplexNumber work, long lwork,
                long info );
    void sgelsy( long m, long n, long nrhs, long a,
                 long lda, long b, long ldb,
                 long jpvt, long rcond, long rank,
                 long work, long lwork, long info );
    void dgelsy( long m, long n, long nrhs, long a,
                 long lda, long b, long ldb,
                 long jpvt, long rcond, long rank,
                 long work, long lwork, long info );
    void cgelsy( long m, long n, long nrhs,
                 IComplexNumber a, long lda,
                 IComplexNumber b, long ldb, long jpvt,
                 long rcond, long rank, IComplexNumber work,
                 long lwork, long rwork, long info );
    void zgelsy( long m, long n, long nrhs,
                 IComplexNumber a, long lda,
                 IComplexNumber b, long ldb, long jpvt,
                 long rcond, long rank,
                 IComplexNumber work, long lwork,
                 long rwork, long info );
    void sgelss( long m, long n, long nrhs, long a,
                 long lda, long b, long ldb, long s,
                 long rcond, long rank, long work,
                 long lwork, long info );
    void dgelss( long m, long n, long nrhs, long a,
                 long lda, long b, long ldb, long s,
                 long rcond, long rank, long work,
                 long lwork, long info );
    void cgelss( long m, long n, long nrhs,
                 IComplexNumber a, long lda,
                 IComplexNumber b, long ldb, long s,
                 long rcond, long rank, IComplexNumber work,
                 long lwork, long rwork, long info );
    void zgelss( long m, long n, long nrhs,
                 IComplexNumber a, long lda,
                 IComplexNumber b, long ldb, long s,
                 long rcond, long rank,
                 IComplexNumber work, long lwork,
                 long rwork, long info );
    void sgelsd( long m, long n, long nrhs, long a,
                 long lda, long b, long ldb, long s,
                 long rcond, long rank, long work,
                 long lwork, long iwork, long info );
    void dgelsd( long m, long n, long nrhs, long a,
                 long lda, long b, long ldb, long s,
                 long rcond, long rank, long work,
                 long lwork, long iwork, long info );
    void cgelsd( long m, long n, long nrhs,
                 IComplexNumber a, long lda,
                 IComplexNumber b, long ldb, long s,
                 long rcond, long rank, IComplexNumber work,
                 long lwork, long rwork, long iwork,
                 long info );
    void zgelsd( long m, long n, long nrhs,
                 IComplexNumber a, long lda,
                 IComplexNumber b, long ldb, long s,
                 long rcond, long rank,
                 IComplexNumber work, long lwork,
                 long rwork, long iwork, long info );
    void sgglse( long m, long n, long p, long a,
                 long lda, long b, long ldb, long c,
                 long d, long x, long work, long lwork,
                 long info );
    void dgglse( long m, long n, long p, long a,
                 long lda, long b, long ldb, long c,
                 long d, long x, long work, long lwork,
                 long info );
    void cgglse( long m, long n, long p,
                 IComplexNumber a, long lda,
                 IComplexNumber b, long ldb,
                 IComplexNumber c, IComplexNumber d,
                 IComplexNumber x, IComplexNumber work,
                 long lwork, long info );
    void zgglse( long m, long n, long p,
                 IComplexNumber a, long lda,
                 IComplexNumber b, long ldb,
                 IComplexNumber c, IComplexNumber d,
                 IComplexNumber x, IComplexNumber work,
                 long lwork, long info );
    void sggglm( long n, long m, long p, long a,
                 long lda, long b, long ldb, long d,
                 long x, long y, long work, long lwork,
                 long info );
    void dggglm( long n, long m, long p, long a,
                 long lda, long b, long ldb, long d,
                 long x, long y, long work, long lwork,
                 long info );
    void cggglm( long n, long m, long p,
                 IComplexNumber a, long lda,
                 IComplexNumber b, long ldb,
                 IComplexNumber d, IComplexNumber x,
                 IComplexNumber y, IComplexNumber work,
                 long lwork, long info );
    void zggglm( long n, long m, long p,
                 IComplexNumber a, long lda,
                 IComplexNumber b, long ldb,
                 IComplexNumber d, IComplexNumber x,
                 IComplexNumber y, IComplexNumber work,
                 long lwork, long info );
    void ssyev( long jobz, long uplo, long n, long a,
                long lda, long w, long work, long lwork,
                long info );
    void dsyev( long jobz, long uplo, long n, long a,
                long lda, long w, long work, long lwork,
                long info );
    void cheev( long jobz, long uplo, long n,
                IComplexNumber a, long lda, long w,
                IComplexNumber work, long lwork, long rwork,
                long info );
    void zheev( long jobz, long uplo, long n,
                IComplexNumber a, long lda, long w,
                IComplexNumber work, long lwork,
                long rwork, long info );
    void ssyevd( long jobz, long uplo, long n, long a,
                 long lda, long w, long work, long lwork,
                 long iwork, long liwork, long info );
    void dsyevd( long jobz, long uplo, long n, long a,
                 long lda, long w, long work, long lwork,
                 long iwork, long liwork, long info );
    void cheevd( long jobz, long uplo, long n,
                 IComplexNumber a, long lda, long w,
                 IComplexNumber work, long lwork, long rwork,
                 long lrwork, long iwork, long liwork,
                 long info );
    void zheevd( long jobz, long uplo, long n,
                 IComplexNumber a, long lda, long w,
                 IComplexNumber work, long lwork,
                 long rwork, long lrwork, long iwork,
                 long liwork, long info );
    void ssyevx( long jobz, long range, long uplo, long n,
                 long a, long lda, long vl, long vu,
                 long il, long iu, long abstol,
                 long m, long w, long z, long ldz,
                 long work, long lwork, long iwork,
                 long ifail, long info );
    void dsyevx( long jobz, long range, long uplo, long n,
                 long a, long lda, long vl, long vu,
                 long il, long iu, long abstol,
                 long m, long w, long z, long ldz,
                 long work, long lwork, long iwork,
                 long ifail, long info );
    void cheevx( long jobz, long range, long uplo, long n,
                 IComplexNumber a, long lda, long vl,
                 long vu, long il, long iu, long abstol,
                 long m, long w, IComplexNumber z,
                 long ldz, IComplexNumber work,
                 long lwork, long rwork, long iwork,
                 long ifail, long info );
    void zheevx( long jobz, long range, long uplo, long n,
                 IComplexNumber a, long lda, long vl,
                 long vu, long il, long iu, long abstol,
                 long m, long w, IComplexNumber z,
                 long ldz, IComplexNumber work,
                 long lwork, long rwork, long iwork,
                 long ifail, long info );
    void ssyevr( long jobz, long range, long uplo, long n,
                 long a, long lda, long vl, long vu,
                 long il, long iu, long abstol,
                 long m, long w, long z, long ldz,
                 long isuppz, long work, long lwork,
                 long iwork, long liwork, long info );
    void dsyevr( long jobz, long range, long uplo, long n,
                 long a, long lda, long vl, long vu,
                 long il, long iu, long abstol,
                 long m, long w, long z, long ldz,
                 long isuppz, long work, long lwork,
                 long iwork, long liwork, long info );
    void cheevr( long jobz, long range, long uplo, long n,
                 IComplexNumber a, long lda, long vl,
                 long vu, long il, long iu, long abstol,
                 long m, long w, IComplexNumber z,
                 long ldz, long isuppz,
                 IComplexNumber work, long lwork, long rwork,
                 long lrwork, long iwork, long liwork,
                 long info );
    void zheevr( long jobz, long range, long uplo, long n,
                 IComplexNumber a, long lda, long vl,
                 long vu, long il, long iu, long abstol,
                 long m, long w, IComplexNumber z,
                 long ldz, long isuppz,
                 IComplexNumber work, long lwork,
                 long rwork, long lrwork, long iwork,
                 long liwork, long info );
    void sspev( long jobz, long uplo, long n, long ap, long w,
                long z, long ldz, long work, long info );
    void dspev( long jobz, long uplo, long n, long ap, long w,
                long z, long ldz, long work, long info );
    void chpev( long jobz, long uplo, long n,
                IComplexNumber ap, long w, IComplexNumber z,
                long ldz, IComplexNumber work, long rwork,
                long info );
    void zhpev( long jobz, long uplo, long n,
                IComplexNumber ap, long w,
                IComplexNumber z, long ldz,
                IComplexNumber work, long rwork,
                long info );
    void sspevd( long jobz, long uplo, long n, long ap, long w,
                 long z, long ldz, long work, long lwork,
                 long iwork, long liwork, long info );
    void dspevd( long jobz, long uplo, long n, long ap,
                 long w, long z, long ldz, long work,
                 long lwork, long iwork, long liwork,
                 long info );
    void chpevd( long jobz, long uplo, long n,
                 IComplexNumber ap, long w, IComplexNumber z,
                 long ldz, IComplexNumber work,
                 long lwork, long rwork, long lrwork,
                 long iwork, long liwork, long info );
    void zhpevd( long jobz, long uplo, long n,
                 IComplexNumber ap, long w,
                 IComplexNumber z, long ldz,
                 IComplexNumber work, long lwork,
                 long rwork, long lrwork, long iwork,
                 long liwork, long info );
    void sspevx( long jobz, long range, long uplo, long n,
                 long ap, long vl, long vu, long il,
                 long iu, long abstol, long m, long w,
                 long z, long ldz, long work, long iwork,
                 long ifail, long info );
    void dspevx( long jobz, long range, long uplo, long n,
                 long ap, long vl, long vu, long il,
                 long iu, long abstol, long m, long w,
                 long z, long ldz, long work, long iwork,
                 long ifail, long info );
    void chpevx( long jobz, long range, long uplo, long n,
                 IComplexNumber ap, long vl, long vu,
                 long il, long iu, long abstol,
                 long m, long w, IComplexNumber z,
                 long ldz, IComplexNumber work, long rwork,
                 long iwork, long ifail, long info );
    void zhpevx( long jobz, long range, long uplo, long n,
                 IComplexNumber ap, long vl, long vu,
                 long il, long iu, long abstol,
                 long m, long w, IComplexNumber z,
                 long ldz, IComplexNumber work, long rwork,
                 long iwork, long ifail, long info );
    void ssbev( long jobz, long uplo, long n, long kd,
                long ab, long ldab, long w, long z,
                long ldz, long work, long info );
    void dsbev( long jobz, long uplo, long n, long kd,
                long ab, long ldab, long w, long z,
                long ldz, long work, long info );
    void chbev( long jobz, long uplo, long n, long kd,
                IComplexNumber ab, long ldab, long w,
                IComplexNumber z, long ldz,
                IComplexNumber work, long rwork, long info );
    void zhbev( long jobz, long uplo, long n, long kd,
                IComplexNumber ab, long ldab, long w,
                IComplexNumber z, long ldz,
                IComplexNumber work, long rwork,
                long info );
    void ssbevd( long jobz, long uplo, long n, long kd,
                 long ab, long ldab, long w, long z,
                 long ldz, long work, long lwork,
                 long iwork, long liwork, long info );
    void dsbevd( long jobz, long uplo, long n, long kd,
                 long ab, long ldab, long w, long z,
                 long ldz, long work, long lwork,
                 long iwork, long liwork, long info );
    void chbevd( long jobz, long uplo, long n, long kd,
                 IComplexNumber ab, long ldab, long w,
                 IComplexNumber z, long ldz,
                 IComplexNumber work, long lwork, long rwork,
                 long lrwork, long iwork, long liwork,
                 long info );
    void zhbevd( long jobz, long uplo, long n, long kd,
                 IComplexNumber ab, long ldab, long w,
                 IComplexNumber z, long ldz,
                 IComplexNumber work, long lwork,
                 long rwork, long lrwork, long iwork,
                 long liwork, long info );
    void ssbevx( long jobz, long range, long uplo, long n,
                 long kd, long ab, long ldab, long q,
                 long ldq, long vl, long vu, long il,
                 long iu, long abstol, long m, long w,
                 long z, long ldz, long work, long iwork,
                 long ifail, long info );
    void dsbevx( long jobz, long range, long uplo, long n,
                 long kd, long ab, long ldab, long q,
                 long ldq, long vl, long vu, long il,
                 long iu, long abstol, long m, long w,
                 long z, long ldz, long work, long iwork,
                 long ifail, long info );
    void chbevx( long jobz, long range, long uplo, long n,
                 long kd, IComplexNumber ab, long ldab,
                 IComplexNumber q, long ldq, long vl,
                 long vu, long il, long iu, long abstol,
                 long m, long w, IComplexNumber z,
                 long ldz, IComplexNumber work, long rwork,
                 long iwork, long ifail, long info );
    void zhbevx( long jobz, long range, long uplo, long n,
                 long kd, IComplexNumber ab, long ldab,
                 IComplexNumber q, long ldq, long vl,
                 long vu, long il, long iu, long abstol,
                 long m, long w, IComplexNumber z,
                 long ldz, IComplexNumber work, long rwork,
                 long iwork, long ifail, long info );
    void sstev( long jobz, long n, long d, long e, long z,
                long ldz, long work, long info );
    void dstev( long jobz, long n, long d, long e, long z,
                long ldz, long work, long info );
    void sstevd( long jobz, long n, long d, long e, long z,
                 long ldz, long work, long lwork,
                 long iwork, long liwork, long info );
    void dstevd( long jobz, long n, long d, long e, long z,
                 long ldz, long work, long lwork,
                 long iwork, long liwork, long info );
    void sstevx( long jobz, long range, long n, long d, long e,
                 long vl, long vu, long il, long iu,
                 long abstol, long m, long w, long z,
                 long ldz, long work, long iwork,
                 long ifail, long info );
    void dstevx( long jobz, long range, long n, long d,
                 long e, long vl, long vu, long il,
                 long iu, long abstol, long m, long w,
                 long z, long ldz, long work, long iwork,
                 long ifail, long info );
    void sstevr( long jobz, long range, long n, long d, long e,
                 long vl, long vu, long il, long iu,
                 long abstol, long m, long w, long z,
                 long ldz, long isuppz, long work,
                 long lwork, long iwork, long liwork,
                 long info );
    void dstevr( long jobz, long range, long n, long d,
                 long e, long vl, long vu, long il,
                 long iu, long abstol, long m, long w,
                 long z, long ldz, long isuppz,
                 long work, long lwork, long iwork,
                 long liwork, long info );
    void sgees( long jobvs, long sort, long  select,
                long n, long a, long lda, long sdim,
                long wr, long wi, long vs, long ldvs,
                long work, long lwork,long  bwork,
                long info );
    void dgees( long jobvs, long sort, long  select,
                long n, long a, long lda, long sdim,
                long wr, long wi, long vs, long ldvs,
                long work, long lwork,long  bwork,
                long info );
    void cgees( long jobvs, long sort, long  select,
                long n, IComplexNumber a, long lda,
                long sdim, IComplexNumber w,
                IComplexNumber vs, long ldvs,
                IComplexNumber work, long lwork, long rwork,
                long  bwork, long info );
    void zgees( long jobvs, long sort, long  select,
                long n, IComplexNumber a, long lda,
                long sdim, IComplexNumber w,
                IComplexNumber vs, long ldvs,
                IComplexNumber work, long lwork,
                long rwork,long  bwork, long info );
    void sgeesx( long jobvs, long sort, long  select,
                 long sense, long n, long a, long lda,
                 long sdim, long wr, long wi, long vs,
                 long ldvs, long rconde, long rcondv, long work,
                 long lwork, long iwork, long liwork,
                 long  bwork, long info );
    void dgeesx( long jobvs, long sort, long  select,
                 long sense, long n, long a, long lda,
                 long sdim, long wr, long wi, long vs,
                 long ldvs, long rconde, long rcondv,
                 long work, long lwork, long iwork,
                 long liwork,long  bwork,
                 long info );
    void cgeesx( long jobvs, long sort, long  select,
                 long sense, long n, IComplexNumber a,
                 long lda, long sdim, IComplexNumber w,
                 IComplexNumber vs, long ldvs, long rconde,
                 long rcondv, IComplexNumber work,
                 long lwork, long rwork,long  bwork,
                 long info );
    void zgeesx( long jobvs, long sort, long  select,
                 long sense, long n, IComplexNumber a,
                 long lda, long sdim, IComplexNumber w,
                 IComplexNumber vs, long ldvs, long rconde,
                 long rcondv, IComplexNumber work,
                 long lwork, long rwork,long  bwork,
                 long info );
    void sgeev( long jobvl, long jobvr, long n, long a,
                long lda, long wr, long wi, long vl,
                long ldvl, long vr, long ldvr, long work,
                long lwork, long info );
    void dgeev( long jobvl, long jobvr, long n, long a,
                long lda, long wr, long wi, long vl,
                long ldvl, long vr, long ldvr, long work,
                long lwork, long info );
    void cgeev( long jobvl, long jobvr, long n,
                IComplexNumber a, long lda,
                IComplexNumber w, IComplexNumber vl,
                long ldvl, IComplexNumber vr, long ldvr,
                IComplexNumber work, long lwork, long rwork,
                long info );
    void zgeev( long jobvl, long jobvr, long n,
                IComplexNumber a, long lda,
                IComplexNumber w, IComplexNumber vl,
                long ldvl, IComplexNumber vr,
                long ldvr, IComplexNumber work,
                long lwork, long rwork, long info );
    void sgeevx( long balanc, long jobvl, long jobvr, long sense,
                 long n, long a, long lda, long wr,
                 long wi, long vl, long ldvl, long vr,
                 long ldvr, long ilo, long ihi,
                 long scale, long abnrm, long rconde, long rcondv,
                 long work, long lwork, long iwork,
                 long info );
    void dgeevx( long balanc, long jobvl, long jobvr, long sense,
                 long n, long a, long lda, long wr,
                 long wi, long vl, long ldvl, long vr,
                 long ldvr, long ilo, long ihi,
                 long scale, long abnrm, long rconde,
                 long rcondv, long work, long lwork,
                 long iwork, long info );
    void cgeevx( long balanc, long jobvl, long jobvr, long sense,
                 long n, IComplexNumber a, long lda,
                 IComplexNumber w, IComplexNumber vl,
                 long ldvl, IComplexNumber vr,
                 long ldvr, long ilo, long ihi,
                 long scale, long abnrm, long rconde, long rcondv,
                 IComplexNumber work, long lwork, long rwork,
                 long info );
    void zgeevx( long balanc, long jobvl, long jobvr, long sense,
                 long n, IComplexNumber a, long lda,
                 IComplexNumber w, IComplexNumber vl,
                 long ldvl, IComplexNumber vr,
                 long ldvr, long ilo, long ihi,
                 long scale, long abnrm, long rconde,
                 long rcondv, IComplexNumber work,
                 long lwork, long rwork, long info );
    void sgesvd( long jobu, long jobvt, long m, long n,
                 long a, long lda, long s, long u,
                 long ldu, long vt, long ldvt, long work,
                 long lwork, long info );
    void dgesvd( long jobu, long jobvt, long m, long n,
                 long a, long lda, long s, long u,
                 long ldu, long vt, long ldvt, long work,
                 long lwork, long info );
    void cgesvd( long jobu, long jobvt, long m, long n,
                 IComplexNumber a, long lda, long s,
                 IComplexNumber u, long ldu,
                 IComplexNumber vt, long ldvt,
                 IComplexNumber work, long lwork, long rwork,
                 long info );
    void zgesvd( long jobu, long jobvt, long m, long n,
                 IComplexNumber a, long lda, long s,
                 IComplexNumber u, long ldu,
                 IComplexNumber vt, long ldvt,
                 IComplexNumber work, long lwork,
                 long rwork, long info );
    void sgesvdx( long jobu, long jobvt, long range, long m, long n,
                  long a, long lda, long vl, long vu,
                  long il, long iu, long ns, long s, long u,
                  long ldu, long vt, long ldvt, long work,
                  long lwork, long iwork, long info );
    void dgesvdx( long jobu, long jobvt, long range, long m, long n,
                  long a, long lda, long vl, long vu,
                  long il, long iu, long ns, long s, long u,
                  long ldu, long vt, long ldvt, long work,
                  long lwork, long iwork, long info );
    void cgesvdx( long jobu, long jobvt, long range, long m, long n,
                  IComplexNumber a, long lda, long vl, long vu,
                  long il, long iu, long ns, long s,
                  IComplexNumber u, long ldu,
                  IComplexNumber vt, long ldvt,
                  IComplexNumber work, long lwork, long rwork,
                  long iwork, long info );
    void zgesvdx( long jobu, long jobvt, long range, long m, long n,
                  IComplexNumber a, long lda, long vl, long vu,
                  long il, long iu, long ns, long s,
                  IComplexNumber u, long ldu,
                  IComplexNumber vt, long ldvt,
                  IComplexNumber work, long lwork,
                  long rwork, long iwork, long info );
    void sgesdd( long jobz, long m, long n, long a,
                 long lda, long s, long u, long ldu,
                 long vt, long ldvt, long work, long lwork,
                 long iwork, long info );
    void dgesdd( long jobz, long m, long n, long a,
                 long lda, long s, long u, long ldu,
                 long vt, long ldvt, long work,
                 long lwork, long iwork, long info );
    void cgesdd( long jobz, long m, long n,
                 IComplexNumber a, long lda, long s,
                 IComplexNumber u, long ldu,
                 IComplexNumber vt, long ldvt,
                 IComplexNumber work, long lwork, long rwork,
                 long iwork, long info );
    void zgesdd( long jobz, long m, long n,
                 IComplexNumber a, long lda, long s,
                 IComplexNumber u, long ldu,
                 IComplexNumber vt, long ldvt,
                 IComplexNumber work, long lwork,
                 long rwork, long iwork, long info );
    void dgejsv( long joba, long jobu, long jobv, long jobr, long jobt,
                 long jobp, long m, long n, long a,
                 long lda, long sva, long u, long ldu,
                 long v, long ldv, long work, long lwork,
                 long iwork, long info );
    void sgejsv( long joba, long jobu, long jobv, long jobr, long jobt,
                 long jobp, long m, long n, long a,
                 long lda, long sva, long u, long ldu,
                 long v, long ldv, long work, long lwork,
                 long iwork, long info );
    void cgejsv( long joba, long jobu, long jobv, long jobr, long jobt,
                 long jobp, long m, long n, IComplexNumber a,
                 long lda, long sva, IComplexNumber u, long ldu,
                 IComplexNumber v, long ldv, IComplexNumber cwork,
                 long lwork, long work, long lrwork,
                 long iwork, long info );
    void zgejsv( long joba, long jobu, long jobv, long jobr, long jobt,
                 long jobp, long m, long n, IComplexNumber a,
                 long lda, long sva, IComplexNumber u, long ldu,
                 IComplexNumber v, long ldv, IComplexNumber cwork,
                 long lwork, long work, long lrwork,
                 long iwork, long info );
    void dgesvj( long joba, long jobu, long jobv, long m,
                 long n, long a, long lda, long sva,
                 long mv, long v, long ldv, long work,
                 long lwork, long info );
    void sgesvj( long joba, long jobu, long jobv, long m,
                 long n, long a, long lda, long sva,
                 long mv, long v, long ldv, long work,
                 long lwork, long info );
    void cgesvj( long joba, long jobu, long jobv, long m,
                 long n, IComplexNumber a, long lda, long sva,
                 long mv, IComplexNumber v, long ldv,
                 IComplexNumber cwork, long lwork, long rwork,
                 long lrwork, long info );
    void zgesvj( long joba, long jobu, long jobv, long m,
                 long n, IComplexNumber a, long lda, long sva,
                 long mv, IComplexNumber v, long ldv,
                 IComplexNumber cwork, long lwork, long rwork,
                 long lrwork, long info );
    void sggsvd( long jobu, long jobv, long jobq, long m,
                 long n, long p, long k, long l,
                 long a, long lda, long b, long ldb,
                 long alpha, long beta, long u, long ldu,
                 long v, long ldv, long q, long ldq,
                 long work, long iwork, long info );
    void dggsvd( long jobu, long jobv, long jobq, long m,
                 long n, long p, long k, long l,
                 long a, long lda, long b, long ldb,
                 long alpha, long beta, long u, long ldu,
                 long v, long ldv, long q, long ldq,
                 long work, long iwork, long info );
    void cggsvd( long jobu, long jobv, long jobq, long m,
                 long n, long p, long k, long l,
                 IComplexNumber a, long lda,
                 IComplexNumber b, long ldb, long alpha,
                 long beta, IComplexNumber u, long ldu,
                 IComplexNumber v, long ldv,
                 IComplexNumber q, long ldq,
                 IComplexNumber work, long rwork, long iwork,
                 long info );
    void zggsvd( long jobu, long jobv, long jobq, long m,
                 long n, long p, long k, long l,
                 IComplexNumber a, long lda,
                 IComplexNumber b, long ldb, long alpha,
                 long beta, IComplexNumber u, long ldu,
                 IComplexNumber v, long ldv,
                 IComplexNumber q, long ldq,
                 IComplexNumber work, long rwork,
                 long iwork, long info );
    void sggsvd3( long jobu, long jobv, long jobq, long m,
                  long n, long p, long k, long l,
                  long a, long lda, long b, long ldb,
                  long alpha, long beta, long u, long ldu,
                  long v, long ldv, long q, long ldq,
                  long work, long lwork, long iwork,
                  long info );
    void dggsvd3( long jobu, long jobv, long jobq, long m,
                  long n, long p, long k, long l,
                  long a, long lda, long b, long ldb,
                  long alpha, long beta, long u, long ldu,
                  long v, long ldv, long q, long ldq,
                  long work, long lwork, long iwork,
                  long info );
    void cggsvd3( long jobu, long jobv, long jobq, long m,
                  long n, long p, long k, long l,
                  IComplexNumber a, long lda,
                  IComplexNumber b, long ldb, long alpha,
                  long beta, IComplexNumber u, long ldu,
                  IComplexNumber v, long ldv,
                  IComplexNumber q, long ldq,
                  IComplexNumber work, long lwork, long rwork,
                  long iwork, long info );
    void zggsvd3( long jobu, long jobv, long jobq, long m,
                  long n, long p, long k, long l,
                  IComplexNumber a, long lda,
                  IComplexNumber b, long ldb, long alpha,
                  long beta, IComplexNumber u, long ldu,
                  IComplexNumber v, long ldv,
                  IComplexNumber q, long ldq,
                  IComplexNumber work, long lwork,
                  long rwork, long iwork, long info );
    void ssygv( long itype, long jobz, long uplo, long n,
                long a, long lda, long b, long ldb,
                long w, long work, long lwork, long info );
    void dsygv( long itype, long jobz, long uplo, long n,
                long a, long lda, long b, long ldb,
                long w, long work, long lwork,
                long info );
    void chegv( long itype, long jobz, long uplo, long n,
                IComplexNumber a, long lda,
                IComplexNumber b, long ldb, long w,
                IComplexNumber work, long lwork, long rwork,
                long info );
    void zhegv( long itype, long jobz, long uplo, long n,
                IComplexNumber a, long lda,
                IComplexNumber b, long ldb, long w,
                IComplexNumber work, long lwork,
                long rwork, long info );
    void ssygvd( long itype, long jobz, long uplo, long n,
                 long a, long lda, long b, long ldb,
                 long w, long work, long lwork, long iwork,
                 long liwork, long info );
    void dsygvd( long itype, long jobz, long uplo, long n,
                 long a, long lda, long b, long ldb,
                 long w, long work, long lwork,
                 long iwork, long liwork, long info );
    void chegvd( long itype, long jobz, long uplo, long n,
                 IComplexNumber a, long lda,
                 IComplexNumber b, long ldb, long w,
                 IComplexNumber work, long lwork, long rwork,
                 long lrwork, long iwork, long liwork,
                 long info );
    void zhegvd( long itype, long jobz, long uplo, long n,
                 IComplexNumber a, long lda,
                 IComplexNumber b, long ldb, long w,
                 IComplexNumber work, long lwork,
                 long rwork, long lrwork, long iwork,
                 long liwork, long info );
    void ssygvx( long itype, long jobz, long range, long uplo,
                 long n, long a, long lda, long b,
                 long ldb, long vl, long vu, long il,
                 long iu, long abstol, long m, long w,
                 long z, long ldz, long work, long lwork,
                 long iwork, long ifail, long info );
    void dsygvx( long itype, long jobz, long range, long uplo,
                 long n, long a, long lda, long b,
                 long ldb, long vl, long vu, long il,
                 long iu, long abstol, long m, long w,
                 long z, long ldz, long work, long lwork,
                 long iwork, long ifail, long info );
    void chegvx( long itype, long jobz, long range, long uplo,
                 long n, IComplexNumber a, long lda,
                 IComplexNumber b, long ldb, long vl,
                 long vu, long il, long iu, long abstol,
                 long m, long w, IComplexNumber z,
                 long ldz, IComplexNumber work,
                 long lwork, long rwork, long iwork,
                 long ifail, long info );
    void zhegvx( long itype, long jobz, long range, long uplo,
                 long n, IComplexNumber a, long lda,
                 IComplexNumber b, long ldb, long vl,
                 long vu, long il, long iu, long abstol,
                 long m, long w, IComplexNumber z,
                 long ldz, IComplexNumber work,
                 long lwork, long rwork, long iwork,
                 long ifail, long info );
    void sspgv( long itype, long jobz, long uplo, long n,
                long ap, long bp, long w, long z, long ldz,
                long work, long info );
    void dspgv( long itype, long jobz, long uplo, long n,
                long ap, long bp, long w, long z,
                long ldz, long work, long info );
    void chpgv( long itype, long jobz, long uplo, long n,
                IComplexNumber ap, IComplexNumber bp, long w,
                IComplexNumber z, long ldz,
                IComplexNumber work, long rwork, long info );
    void zhpgv( long itype, long jobz, long uplo, long n,
                IComplexNumber ap, IComplexNumber bp,
                long w, IComplexNumber z, long ldz,
                IComplexNumber work, long rwork,
                long info );
    void sspgvd( long itype, long jobz, long uplo, long n,
                 long ap, long bp, long w, long z, long ldz,
                 long work, long lwork, long iwork,
                 long liwork, long info );
    void dspgvd( long itype, long jobz, long uplo, long n,
                 long ap, long bp, long w, long z,
                 long ldz, long work, long lwork,
                 long iwork, long liwork, long info );
    void chpgvd( long itype, long jobz, long uplo, long n,
                 IComplexNumber ap, IComplexNumber bp,
                 long w, IComplexNumber z, long ldz,
                 IComplexNumber work, long lwork, long rwork,
                 long lrwork, long iwork, long liwork,
                 long info );
    void zhpgvd( long itype, long jobz, long uplo, long n,
                 IComplexNumber ap, IComplexNumber bp,
                 long w, IComplexNumber z, long ldz,
                 IComplexNumber work, long lwork,
                 long rwork, long lrwork, long iwork,
                 long liwork, long info );
    void sspgvx( long itype, long jobz, long range, long uplo,
                 long n, long ap, long bp, long vl, long vu,
                 long il, long iu, long abstol,
                 long m, long w, long z, long ldz,
                 long work, long iwork, long ifail,
                 long info );
    void dspgvx( long itype, long jobz, long range, long uplo,
                 long n, long ap, long bp, long vl,
                 long vu, long il, long iu, long abstol,
                 long m, long w, long z, long ldz,
                 long work, long iwork, long ifail,
                 long info );
    void chpgvx( long itype, long jobz, long range, long uplo,
                 long n, IComplexNumber ap,
                 IComplexNumber bp, long vl, long vu,
                 long il, long iu, long abstol,
                 long m, long w, IComplexNumber z,
                 long ldz, IComplexNumber work, long rwork,
                 long iwork, long ifail, long info );
    void zhpgvx( long itype, long jobz, long range, long uplo,
                 long n, IComplexNumber ap,
                 IComplexNumber bp, long vl, long vu,
                 long il, long iu, long abstol,
                 long m, long w, IComplexNumber z,
                 long ldz, IComplexNumber work, long rwork,
                 long iwork, long ifail, long info );
    void ssbgv( long jobz, long uplo, long n, long ka,
                long kb, long ab, long ldab, long bb,
                long ldbb, long w, long z, long ldz,
                long work, long info );
    void dsbgv( long jobz, long uplo, long n, long ka,
                long kb, long ab, long ldab, long bb,
                long ldbb, long w, long z, long ldz,
                long work, long info );
    void chbgv( long jobz, long uplo, long n, long ka,
                long kb, IComplexNumber ab, long ldab,
                IComplexNumber bb, long ldbb, long w,
                IComplexNumber z, long ldz,
                IComplexNumber work, long rwork, long info );
    void zhbgv( long jobz, long uplo, long n, long ka,
                long kb, IComplexNumber ab, long ldab,
                IComplexNumber bb, long ldbb, long w,
                IComplexNumber z, long ldz,
                IComplexNumber work, long rwork,
                long info );
    void ssbgvd( long jobz, long uplo, long n, long ka,
                 long kb, long ab, long ldab, long bb,
                 long ldbb, long w, long z, long ldz,
                 long work, long lwork, long iwork,
                 long liwork, long info );
    void dsbgvd( long jobz, long uplo, long n, long ka,
                 long kb, long ab, long ldab, long bb,
                 long ldbb, long w, long z, long ldz,
                 long work, long lwork, long iwork,
                 long liwork, long info );
    void chbgvd( long jobz, long uplo, long n, long ka,
                 long kb, IComplexNumber ab, long ldab,
                 IComplexNumber bb, long ldbb, long w,
                 IComplexNumber z, long ldz,
                 IComplexNumber work, long lwork, long rwork,
                 long lrwork, long iwork, long liwork,
                 long info );
    void zhbgvd( long jobz, long uplo, long n, long ka,
                 long kb, IComplexNumber ab, long ldab,
                 IComplexNumber bb, long ldbb, long w,
                 IComplexNumber z, long ldz,
                 IComplexNumber work, long lwork,
                 long rwork, long lrwork, long iwork,
                 long liwork, long info );
    void ssbgvx( long jobz, long range, long uplo, long n,
                 long ka, long kb, long ab, long ldab,
                 long bb, long ldbb, long q, long ldq,
                 long vl, long vu, long il, long iu,
                 long abstol, long m, long w, long z,
                 long ldz, long work, long iwork,
                 long ifail, long info );
    void dsbgvx( long jobz, long range, long uplo, long n,
                 long ka, long kb, long ab,
                 long ldab, long bb, long ldbb, long q,
                 long ldq, long vl, long vu, long il,
                 long iu, long abstol, long m, long w,
                 long z, long ldz, long work, long iwork,
                 long ifail, long info );
    void chbgvx( long jobz, long range, long uplo, long n,
                 long ka, long kb, IComplexNumber ab,
                 long ldab, IComplexNumber bb,
                 long ldbb, IComplexNumber q, long ldq,
                 long vl, long vu, long il, long iu,
                 long abstol, long m, long w,
                 IComplexNumber z, long ldz,
                 IComplexNumber work, long rwork, long iwork,
                 long ifail, long info );
    void zhbgvx( long jobz, long range, long uplo, long n,
                 long ka, long kb, IComplexNumber ab,
                 long ldab, IComplexNumber bb,
                 long ldbb, IComplexNumber q, long ldq,
                 long vl, long vu, long il, long iu,
                 long abstol, long m, long w,
                 IComplexNumber z, long ldz,
                 IComplexNumber work, long rwork,
                 long iwork, long ifail, long info );
    void sgges( long jobvsl, long jobvsr, long sort,
                long  selctg, long n, long a,
                long lda, long b, long ldb, long sdim,
                long alphar, long alphai, long beta, long vsl,
                long ldvsl, long vsr, long ldvsr,
                long work, long lwork,long  bwork,
                long info );
    void dgges( long jobvsl, long jobvsr, long sort,
                long  selctg, long n, long a,
                long lda, long b, long ldb,
                long sdim, long alphar, long alphai,
                long beta, long vsl, long ldvsl, long vsr,
                long ldvsr, long work, long lwork,
                long  bwork, long info );
    void cgges( long jobvsl, long jobvsr, long sort,
                long  selctg, long n,
                IComplexNumber a, long lda,
                IComplexNumber b, long ldb, long sdim,
                IComplexNumber alpha, IComplexNumber beta,
                IComplexNumber vsl, long ldvsl,
                IComplexNumber vsr, long ldvsr,
                IComplexNumber work, long lwork, long rwork,
                long  bwork, long info );
    void zgges( long jobvsl, long jobvsr, long sort,
                long  selctg, long n,
                IComplexNumber a, long lda,
                IComplexNumber b, long ldb, long sdim,
                IComplexNumber alpha, IComplexNumber beta,
                IComplexNumber vsl, long ldvsl,
                IComplexNumber vsr, long ldvsr,
                IComplexNumber work, long lwork,
                long rwork,long  bwork, long info );
    void sgges3( long jobvsl, long jobvsr, long sort,
                 long  selctg, long n,
                 long a, long lda, long b, long ldb,
                 long sdim, long alphar, long alphai,
                 long beta, long vsl, long ldvsl,
                 long vsr, long ldvsr,
                 long work, long lwork,long  bwork,
                 long info );
    void dgges3( long jobvsl, long jobvsr, long sort,
                 long  selctg, long n, long a,
                 long lda, long b, long ldb,
                 long sdim, long alphar, long alphai,
                 long beta, long vsl, long ldvsl, long vsr,
                 long ldvsr, long work, long lwork,
                 long  bwork, long info );
    void cgges3( long jobvsl, long jobvsr, long sort,
                 long  selctg, long n,
                 IComplexNumber a, long lda,
                 IComplexNumber b, long ldb,
                 long sdim,
                 IComplexNumber alpha, IComplexNumber beta,
                 IComplexNumber vsl, long ldvsl,
                 IComplexNumber vsr, long ldvsr,
                 IComplexNumber work, long lwork, long rwork,
                 long  bwork, long info );
    void zgges3( long jobvsl, long jobvsr, long sort,
                 long  selctg, long n,
                 IComplexNumber a, long lda,
                 IComplexNumber b, long ldb, long sdim,
                 IComplexNumber alpha, IComplexNumber beta,
                 IComplexNumber vsl, long ldvsl,
                 IComplexNumber vsr, long ldvsr,
                 IComplexNumber work, long lwork,
                 long rwork,long  bwork, long info );
    void sggesx( long jobvsl, long jobvsr, long sort,
                 long  selctg, long sense, long n,
                 long a, long lda, long b, long ldb,
                 long sdim, long alphar, long alphai, long beta,
                 long vsl, long ldvsl, long vsr,
                 long ldvsr, long rconde, long rcondv,
                 long work, long lwork, long iwork,
                 long liwork,long  bwork,
                 long info );
    void dggesx( long jobvsl, long jobvsr, long sort,
                 long  selctg, long sense, long n,
                 long a, long lda, long b, long ldb,
                 long sdim, long alphar, long alphai,
                 long beta, long vsl, long ldvsl, long vsr,
                 long ldvsr, long rconde, long rcondv,
                 long work, long lwork, long iwork,
                 long liwork,long  bwork,
                 long info );
    void cggesx( long jobvsl, long jobvsr, long sort,
                 long  selctg, long sense, long n,
                 IComplexNumber a, long lda,
                 IComplexNumber b, long ldb, long sdim,
                 IComplexNumber alpha, IComplexNumber beta,
                 IComplexNumber vsl, long ldvsl,
                 IComplexNumber vsr, long ldvsr, long rconde,
                 long rcondv, IComplexNumber work,
                 long lwork, long rwork, long iwork,
                 long liwork,long  bwork,
                 long info );
    void zggesx( long jobvsl, long jobvsr, long sort,
                 long  selctg, long sense, long n,
                 IComplexNumber a, long lda,
                 IComplexNumber b, long ldb, long sdim,
                 IComplexNumber alpha, IComplexNumber beta,
                 IComplexNumber vsl, long ldvsl,
                 IComplexNumber vsr, long ldvsr,
                 long rconde, long rcondv, IComplexNumber work,
                 long lwork, long rwork, long iwork,
                 long liwork,long  bwork,
                 long info );
    void sggev( long jobvl, long jobvr, long n, long a,
                long lda, long b, long ldb, long alphar,
                long alphai, long beta, long vl, long ldvl,
                long vr, long ldvr, long work, long lwork,
                long info );
    void dggev( long jobvl, long jobvr, long n, long a,
                long lda, long b, long ldb, long alphar,
                long alphai, long beta, long vl, long ldvl,
                long vr, long ldvr, long work,
                long lwork, long info );
    void cggev( long jobvl, long jobvr, long n,
                IComplexNumber a, long lda,
                IComplexNumber b, long ldb,
                IComplexNumber alpha, IComplexNumber beta,
                IComplexNumber vl, long ldvl,
                IComplexNumber vr, long ldvr,
                IComplexNumber work, long lwork, long rwork,
                long info );
    void zggev( long jobvl, long jobvr, long n,
                IComplexNumber a, long lda,
                IComplexNumber b, long ldb,
                IComplexNumber alpha, IComplexNumber beta,
                IComplexNumber vl, long ldvl,
                IComplexNumber vr, long ldvr,
                IComplexNumber work, long lwork,
                long rwork, long info );
    void sggev3( long jobvl, long jobvr, long n, long a,
                 long lda, long b, long ldb, long alphar,
                 long alphai, long beta, long vl, long ldvl,
                 long vr, long ldvr, long work, long lwork,
                 long info );
    void dggev3( long jobvl, long jobvr, long n, long a,
                 long lda, long b, long ldb, long alphar,
                 long alphai, long beta, long vl, long ldvl,
                 long vr, long ldvr, long work,
                 long lwork, long info );
    void cggev3( long jobvl, long jobvr, long n,
                 IComplexNumber a, long lda,
                 IComplexNumber b, long ldb,
                 IComplexNumber alpha, IComplexNumber beta,
                 IComplexNumber vl, long ldvl,
                 IComplexNumber vr, long ldvr,
                 IComplexNumber work, long lwork, long rwork,
                 long info );
    void zggev3( long jobvl, long jobvr, long n,
                 IComplexNumber a, long lda,
                 IComplexNumber b, long ldb,
                 IComplexNumber alpha, IComplexNumber beta,
                 IComplexNumber vl, long ldvl,
                 IComplexNumber vr, long ldvr,
                 IComplexNumber work, long lwork,
                 long rwork, long info );
    void sggevx( long balanc, long jobvl, long jobvr, long sense,
                 long n, long a, long lda, long b,
                 long ldb, long alphar, long alphai, long beta,
                 long vl, long ldvl, long vr, long ldvr,
                 long ilo, long ihi, long lscale,
                 long rscale, long abnrm, long bbnrm, long rconde,
                 long rcondv, long work, long lwork,
                 long iwork,long  bwork,
                 long info );
    void dggevx( long balanc, long jobvl, long jobvr, long sense,
                 long n, long a, long lda, long b,
                 long ldb, long alphar, long alphai,
                 long beta, long vl, long ldvl, long vr,
                 long ldvr, long ilo, long ihi,
                 long lscale, long rscale, long abnrm,
                 long bbnrm, long rconde, long rcondv, long work,
                 long lwork, long iwork,long  bwork,
                 long info );
    void cggevx( long balanc, long jobvl, long jobvr, long sense,
                 long n, IComplexNumber a, long lda,
                 IComplexNumber b, long ldb,
                 IComplexNumber alpha, IComplexNumber beta,
                 IComplexNumber vl, long ldvl,
                 IComplexNumber vr, long ldvr, long ilo,
                 long ihi, long lscale, long rscale, long abnrm,
                 long bbnrm, long rconde, long rcondv,
                 IComplexNumber work, long lwork, long rwork,
                 long iwork,long  bwork,
                 long info );
    void zggevx( long balanc, long jobvl, long jobvr, long sense,
                 long n, IComplexNumber a, long lda,
                 IComplexNumber b, long ldb,
                 IComplexNumber alpha, IComplexNumber beta,
                 IComplexNumber vl, long ldvl,
                 IComplexNumber vr, long ldvr,
                 long ilo, long ihi, long lscale,
                 long rscale, long abnrm, long bbnrm,
                 long rconde, long rcondv, IComplexNumber work,
                 long lwork, long rwork, long iwork,
                 long  bwork, long info );
    void dsfrk( long transr, long uplo, long trans, long n,
                long k, long alpha, final long a,
                long lda, long beta, long c );
    void ssfrk( long transr, long uplo, long trans, long n,
                long k, long alpha, final long a, long lda,
                long beta, long c );
    void zhfrk( long transr, long uplo, long trans, long n,
                long k, long alpha, final IComplexNumber a,
                long lda, long beta, IComplexNumber c );
    void chfrk( long transr, long uplo, long trans, long n,
                long k, long alpha, final IComplexNumber a,
                long lda, long beta, IComplexNumber c );
    void dtfsm( long transr, long side, long uplo, long trans,
                long diag, long m, long n, long alpha,
                final long a, long b, long ldb );
    void stfsm( long transr, long side, long uplo, long trans,
                long diag, long m, long n, long alpha,
                final long a, long b, long ldb );
    void ztfsm( long transr, long side, long uplo, long trans,
                long diag, long m, long n,
                IComplexNumber alpha, final IComplexNumber a,
                IComplexNumber b, long ldb );
    void ctfsm( long transr, long side, long uplo, long trans,
                long diag, long m, long n,
                IComplexNumber alpha, final IComplexNumber a,
                IComplexNumber b, long ldb );
    void dtfttp( long transr, long uplo, long n, final long arf,
                 long ap, long info );
    void stfttp( long transr, long uplo, long n, final long arf,
                 long ap, long info );
    void ztfttp( long transr, long uplo, long n,
                 final IComplexNumber arf, IComplexNumber ap,
                 long info );
    void ctfttp( long transr, long uplo, long n,
                 final IComplexNumber arf, IComplexNumber ap,
                 long info );
    void dtfttr( long transr, long uplo, long n, final long arf,
                 long a, long lda, long info );
    void stfttr( long transr, long uplo, long n, final long arf,
                 long a, long lda, long info );
    void ztfttr( long transr, long uplo, long n,
                 final IComplexNumber arf, IComplexNumber a,
                 long lda, long info );
    void ctfttr( long transr, long uplo, long n,
                 final IComplexNumber arf, IComplexNumber a,
                 long lda, long info );
    void dtpttf( long transr, long uplo, long n, final long ap,
                 long arf, long info );
    void stpttf( long transr, long uplo, long n, final long ap,
                 long arf, long info );
    void ztpttf( long transr, long uplo, long n,
                 final IComplexNumber ap, IComplexNumber arf,
                 long info );
    void ctpttf( long transr, long uplo, long n,
                 final IComplexNumber ap, IComplexNumber arf,
                 long info );
    void dtpttr( long uplo, long n, final long ap, long a,
                 long lda, long info );
    void stpttr( long uplo, long n, final long ap, long a,
                 long lda, long info );
    void ztpttr( long uplo, long n, final IComplexNumber ap,
                 IComplexNumber a, long lda,
                 long info );
    void ctpttr( long uplo, long n, final IComplexNumber ap,
                 IComplexNumber a, long lda,
                 long info );
    void dtrttf( long transr, long uplo, long n, final long a,
                 long lda, long arf, long info );
    void strttf( long transr, long uplo, long n, final long a,
                 long lda, long arf, long info );
    void ztrttf( long transr, long uplo, long n,
                 final IComplexNumber a, long lda,
                 IComplexNumber arf, long info );
    void ctrttf( long transr, long uplo, long n,
                 final IComplexNumber a, long lda,
                 IComplexNumber arf, long info );
    void dtrttp( long uplo, long n, final long a, long lda,
                 long ap, long info );
    void strttp( long uplo, long n, final long a, long lda,
                 long ap, long info );
    void ztrttp( long uplo, long n, final IComplexNumber a,
                 long lda, IComplexNumber ap,
                 long info );
    void ctrttp( long uplo, long n, final IComplexNumber a,
                 long lda, IComplexNumber ap,
                 long info );
    void sgeqrfp( long m, long n, long a, long lda,
                  long tau, long work, long lwork,
                  long info );
    void dgeqrfp( long m, long n, long a, long lda,
                  long tau, long work, long lwork,
                  long info );
    void cgeqrfp( long m, long n, IComplexNumber a,
                  long lda, IComplexNumber tau,
                  IComplexNumber work, long lwork,
                  long info );
    void zgeqrfp( long m, long n, IComplexNumber a,
                  long lda, IComplexNumber tau,
                  IComplexNumber work, long lwork,
                  long info );
    void clacgv( long n, IComplexNumber x, long incx );
    void zlacgv( long n, IComplexNumber x, long incx );
    void slarnv( long idist, long iseed, long n,
                 long x );
    void dlarnv( long idist, long iseed, long n,
                 long x );
    void clarnv( long idist, long iseed, long n,
                 IComplexNumber x );
    void zlarnv( long idist, long iseed, long n,
                 IComplexNumber x );
    void sgeqr2( long m, long n, long a, long lda,
                 long tau, long work, long info );
    void dgeqr2( long m, long n, long a, long lda,
                 long tau, long work, long info );
    void cgeqr2( long m, long n, IComplexNumber a,
                 long lda, IComplexNumber tau,
                 IComplexNumber work, long info );
    void zgeqr2( long m, long n, IComplexNumber a,
                 long lda, IComplexNumber tau,
                 IComplexNumber work, long info );
    void slacn2( long n, long v, long x, long isgn,
                 long est, long kase, long isave );
    void dlacn2( long n, long v, long x, long isgn,
                 long est, long kase, long isave );
    void clacn2( long n, IComplexNumber v,
                 IComplexNumber x, long est,
                 long kase, long isave );
    void zlacn2( long n, IComplexNumber v,
                 IComplexNumber x, long est,
                 long kase, long isave );
    void slacpy( long uplo, long m, long n, final long a,
                 long lda, long b, long ldb );
    void dlacpy( long uplo, long m, long n, final long a,
                 long lda, long b, long ldb );
    void clacpy( long uplo, long m, long n,
                 final IComplexNumber a, long lda,
                 IComplexNumber b, long ldb );
    void zlacpy( long uplo, long m, long n,
                 final IComplexNumber a, long lda,
                 IComplexNumber b, long ldb );

    void clacp2( long uplo, long m, long n, final long a,
                 long lda, IComplexNumber b, long ldb );
    void zlacp2( long uplo, long m, long n, final long a,
                 long lda, IComplexNumber b,
                 long ldb );

    void sgetf2( long m, long n, long a, long lda,
                 long ipiv, long info );
    void dgetf2( long m, long n, long a, long lda,
                 long ipiv, long info );
    void cgetf2( long m, long n, IComplexNumber a,
                 long lda, long ipiv, long info );
    void zgetf2( long m, long n, IComplexNumber a,
                 long lda, long ipiv, long info );
    void slaswp( long n, long a, long lda, long k1,
                 long k2, final long ipiv, long incx );
    void dlaswp( long n, long a, long lda, long k1,
                 long k2, final long ipiv, long incx );
    void claswp( long n, IComplexNumber a, long lda,
                 long k1, long k2, final long ipiv,
                 long incx );
    void zlaswp( long n, IComplexNumber a, long lda,
                 long k1, long k2, final long ipiv,
                 long incx );
    float slange( long norm, long m, long n, final long a,
                  long lda, long work );
    double dlange( long norm, long m, long n, final long a,
                   long lda, long work );
    float clange( long norm, long m, long n,
                  final IComplexNumber a, long lda, long work );
    double zlange( long norm, long m, long n,
                   final IComplexNumber a, long lda, long work );
    float clanhe( long norm, long uplo, long n,
                  final IComplexNumber a, long lda, long work );
    double zlanhe( long norm, long uplo, long n,
                   final IComplexNumber a, long lda, long work );
    float slansy( long norm, long uplo, long n, final long a,
                  long lda, long work );
    double dlansy( long norm, long uplo, long n, final long a,
                   long lda, long work );
    float clansy( long norm, long uplo, long n,
                  final IComplexNumber a, long lda, long work );
    double zlansy( long norm, long uplo, long n,
                   final IComplexNumber a, long lda, long work );
    float slantr( long norm, long uplo, long diag, long m,
                  long n, final long a, long lda, long work );
    double dlantr( long norm, long uplo, long diag, long m,
                   long n, final long a, long lda, long work );
    float clantr( long norm, long uplo, long diag, long m,
                  long n, final IComplexNumber a, long lda,
                  long work );
    double zlantr( long norm, long uplo, long diag, long m,
                   long n, final IComplexNumber a, long lda,
                   long work );
    float slamch( long cmach );
    double dlamch( long cmach );
    void sgelq2( long m, long n, long a, long lda,
                 long tau, long work, long info );
    void dgelq2( long m, long n, long a, long lda,
                 long tau, long work, long info );
    void cgelq2( long m, long n, IComplexNumber a,
                 long lda, IComplexNumber tau,
                 IComplexNumber work, long info );
    void zgelq2( long m, long n, IComplexNumber a,
                 long lda, IComplexNumber tau,
                 IComplexNumber work, long info );
    void slarfb( long side, long trans, long direct, long storev,
                 long m, long n, long k, final long v,
                 long ldv, final long t, long ldt, long c,
                 long ldc, long work, long ldwork );
    void dlarfb( long side, long trans, long direct, long storev,
                 long m, long n, long k,
                 final long v, long ldv, final long t,
                 long ldt, long c, long ldc, long work,
                 long ldwork );
    void clarfb( long side, long trans, long direct, long storev,
                 long m, long n, long k,
                 final IComplexNumber v, long ldv,
                 final IComplexNumber t, long ldt,
                 IComplexNumber c, long ldc,
                 IComplexNumber work, long ldwork );
    void zlarfb( long side, long trans, long direct, long storev,
                 long m, long n, long k,
                 final IComplexNumber v, long ldv,
                 final IComplexNumber t, long ldt,
                 IComplexNumber c, long ldc,
                 IComplexNumber work, long ldwork );
    void slarfg( long n, long alpha, long x, long incx,
                 long tau );
    void dlarfg( long n, long alpha, long x, long incx,
                 long tau );
    void clarfg( long n, IComplexNumber alpha,
                 IComplexNumber x, long incx,
                 IComplexNumber tau );
    void zlarfg( long n, IComplexNumber alpha,
                 IComplexNumber x, long incx,
                 IComplexNumber tau );
    void slarft( long direct, long storev, long n, long k,
                 final long v, long ldv, final long tau, long t,
                 long ldt );
    void dlarft( long direct, long storev, long n, long k,
                 final long v, long ldv, final long tau,
                 long t, long ldt );
    void clarft( long direct, long storev, long n, long k,
                 final IComplexNumber v, long ldv,
                 final IComplexNumber tau, IComplexNumber t,
                 long ldt );
    void zlarft( long direct, long storev, long n, long k,
                 final IComplexNumber v, long ldv,
                 final IComplexNumber tau, IComplexNumber t,
                 long ldt );
    void slarfx( long side, long m, long n, final long v,
                 long tau, long c, long ldc, long work );
    void dlarfx( long side, long m, long n, final long v,
                 long tau, long c, long ldc, long work );
    void clarfx( long side, long m, long n,
                 final IComplexNumber v, IComplexNumber tau,
                 IComplexNumber c, long ldc,
                 IComplexNumber work );
    void zlarfx( long side, long m, long n,
                 final IComplexNumber v, IComplexNumber tau,
                 IComplexNumber c, long ldc,
                 IComplexNumber work );
    void slatms( long m, long n, long dist, long iseed,
                 long sym, long d, long mode, long cond,
                 long dmax, long kl, long ku, long pack,
                 long a, long lda, long work, long info );
    void dlatms( long m, long n, long dist, long iseed,
                 long sym, long d, long mode, long cond,
                 long dmax, long kl, long ku, long pack,
                 long a, long lda, long work,
                 long info );
    void clatms( long m, long n, long dist, long iseed,
                 long sym, long d, long mode, long cond,
                 long dmax, long kl, long ku, long pack,
                 IComplexNumber a, long lda,
                 IComplexNumber work, long info );
    void zlatms( long m, long n, long dist, long iseed,
                 long sym, long d, long mode, long cond,
                 long dmax, long kl, long ku, long pack,
                 IComplexNumber a, long lda,
                 IComplexNumber work, long info );
    void slag2d( long m, long n, final long sa,
                 long ldsa, long a, long lda,
                 long info );
    void dlag2s( long m, long n, final long a,
                 long lda, long sa, long ldsa,
                 long info );
    void clag2z( long m, long n,
                 final IComplexNumber sa, long ldsa,
                 IComplexNumber a, long lda,
                 long info );
    void zlag2c( long m, long n,
                 final IComplexNumber a, long lda,
                 IComplexNumber sa, long ldsa,
                 long info );
    void slauum( long uplo, long n, long a, long lda,
                 long info );
    void dlauum( long uplo, long n, long a, long lda,
                 long info );
    void clauum( long uplo, long n, IComplexNumber a,
                 long lda, long info );
    void zlauum( long uplo, long n, IComplexNumber a,
                 long lda, long info );
    void slagge( long m, long n, long kl,
                 long ku, final long d, long a, long lda,
                 long iseed, long work, long info );
    void dlagge( long m, long n, long kl,
                 long ku, final long d, long a, long lda,
                 long iseed, long work, long info );
    void clagge( long m, long n, long kl,
                 long ku, final long d, IComplexNumber a,
                 long lda, long iseed,
                 IComplexNumber work, long info );
    void zlagge( long m, long n, long kl,
                 long ku, final long d, IComplexNumber a,
                 long lda, long iseed,
                 IComplexNumber work, long info );
    void slascl( long type, long kl, long ku, long cfrom,
                 long cto, long m, long n, long a,
                 long lda, long info );
    void dlascl( long type, long kl, long ku, long cfrom,
                 long cto, long m, long n, long a,
                 long lda, long info );
    void clascl( long type, long kl, long ku, long cfrom,
                 long cto, long m, long n, IComplexNumber a,
                 long lda, long info );
    void zlascl( long type, long kl, long ku, long cfrom,
                 long cto, long m, long n, IComplexNumber a,
                 long lda, long info );
    void slaset( long uplo, long m, long n, long alpha,
                 long beta, long a, long lda );
    void dlaset( long uplo, long m, long n, long alpha,
                 long beta, long a, long lda );
    void claset( long uplo, long m, long n,
                 IComplexNumber alpha, IComplexNumber beta,
                 IComplexNumber a, long lda );
    void zlaset( long uplo, long m, long n,
                 IComplexNumber alpha, IComplexNumber beta,
                 IComplexNumber a, long lda );
    void slasrt( long id, long n, long d, long info );
    void dlasrt( long id, long n, long d, long info );
    void claghe( long n, long k, final long d,
                 IComplexNumber a, long lda, long iseed,
                 IComplexNumber work, long info );
    void zlaghe( long n, long k, final long d,
                 IComplexNumber a, long lda,
                 long iseed, IComplexNumber work,
                 long info );
    void slagsy( long n, long k, final long d, long a,
                 long lda, long iseed, long work,
                 long info );
    void dlagsy( long n, long k, final long d, long a,
                 long lda, long iseed, long work,
                 long info );
    void clagsy( long n, long k, final long d,
                 IComplexNumber a, long lda, long iseed,
                 IComplexNumber work, long info );
    void zlagsy( long n, long k, final long d,
                 IComplexNumber a, long lda,
                 long iseed, IComplexNumber work,
                 long info );
    void slapmr(long  forwrd, long m, long n,
                long x, long ldx, long k );
    void dlapmr(long  forwrd, long m, long n,
                long x, long ldx, long k );
    void clapmr(long  forwrd, long m, long n,
                IComplexNumber x, long ldx, long k );
    void zlapmr(long  forwrd, long m, long n,
                IComplexNumber x, long ldx, long k );
    void slapmt(long  forwrd, long m, long n,
                long x, long ldx, long k );
    void dlapmt(long  forwrd, long m, long n,
                long x, long ldx, long k );
    void clapmt(long  forwrd, long m, long n,
                IComplexNumber x, long ldx, long k );
    void zlapmt(long  forwrd, long m, long n,
                IComplexNumber x, long ldx, long k );
    float slapy2( long x, long y );
    double dlapy2( long x, long y );
    float slapy3( long x, long y, long z );
    double dlapy3( long x, long y, long z );
    void slartgp( long f, long g, long cs, long sn, long r );
    void dlartgp( long f, long g, long cs, long sn, long r );
    void slartgs( long x, long y, long sigma, long cs, long sn );
    void dlartgs( long x, long y, long sigma, long cs,
                  long sn );
    // LAPACK 3.3.0
    void cbbcsd( long jobu1, long jobu2,
                 long jobv1t, long jobv2t, long trans,
                 long m, long p, long q,
                 long theta, long phi,
                 IComplexNumber u1, long ldu1,
                 IComplexNumber u2, long ldu2,
                 IComplexNumber v1t, long ldv1t,
                 IComplexNumber v2t, long ldv2t,
                 long b11d, long b11e, long b12d,
                 long b12e, long b21d, long b21e,
                 long b22d, long b22e, long rwork,
                 long lrwork , long info );
    void cheswapr( long uplo, long n,
                   IComplexNumber a, long i1,
                   long i2 );
    void chetri2( long uplo, long n,
                  IComplexNumber a, long lda,
                  final long ipiv,
                  IComplexNumber work, long lwork , long info );
    void chetri2x( long uplo, long n,
                   IComplexNumber a, long lda,
                   final long ipiv,
                   IComplexNumber work, long nb , long info );
    void chetrs2( long uplo, long n,
                  long nrhs, final IComplexNumber a,
                  long lda, final long ipiv,
                  IComplexNumber b, long ldb,
                  IComplexNumber work , long info );
    void csyconv( long uplo, long way,
                  long n, IComplexNumber a,
                  long lda, final long ipiv,
                  IComplexNumber work , long info );
    void csyswapr( long uplo, long n,
                   IComplexNumber a, long i1,
                   long i2 );
    void csytri2( long uplo, long n,
                  IComplexNumber a, long lda,
                  final long ipiv,
                  IComplexNumber work, long lwork , long info );
    void csytri2x( long uplo, long n,
                   IComplexNumber a, long lda,
                   final long ipiv,
                   IComplexNumber work, long nb , long info );
    void csytrs2( long uplo, long n,
                  long nrhs, final IComplexNumber a,
                  long lda, final long ipiv,
                  IComplexNumber b, long ldb,
                  IComplexNumber work , long info );
    void cunbdb( long trans, long signs,
                 long m, long p, long q,
                 IComplexNumber x11, long ldx11,
                 IComplexNumber x12, long ldx12,
                 IComplexNumber x21, long ldx21,
                 IComplexNumber x22, long ldx22,
                 long theta, long phi,
                 IComplexNumber taup1,
                 IComplexNumber taup2,
                 IComplexNumber tauq1,
                 IComplexNumber tauq2,
                 IComplexNumber work, long lwork , long info );
    void cuncsd( long jobu1, long jobu2,
                 long jobv1t, long jobv2t, long trans,
                 long signs, long m, long p,
                 long q, IComplexNumber x11,
                 long ldx11, IComplexNumber x12,
                 long ldx12, IComplexNumber x21,
                 long ldx21, IComplexNumber x22,
                 long ldx22, long theta,
                 IComplexNumber u1, long ldu1,
                 IComplexNumber u2, long ldu2,
                 IComplexNumber v1t, long ldv1t,
                 IComplexNumber v2t, long ldv2t,
                 IComplexNumber work, long lwork,
                 long rwork, long lrwork,
                 long iwork , long info );
    void cuncsd2by1( long jobu1, long jobu2,
                     long jobv1t, long m, long p,
                     long q, IComplexNumber x11,
                     long ldx11, IComplexNumber x21,
                     long ldx21, IComplexNumber theta,
                     IComplexNumber u1, long ldu1,
                     IComplexNumber u2, long ldu2,
                     IComplexNumber v1t, long ldv1t,
                     IComplexNumber work, long lwork,
                     long rwork, long lrwork,
                     long iwork , long info );
    void dbbcsd( long jobu1, long jobu2,
                 long jobv1t, long jobv2t, long trans,
                 long m, long p, long q,
                 long theta, long phi, long u1,
                 long ldu1, long u2, long ldu2,
                 long v1t, long ldv1t, long v2t,
                 long ldv2t, long b11d, long b11e,
                 long b12d, long b12e, long b21d,
                 long b21e, long b22d, long b22e,
                 long work, long lwork , long info );
    void dorbdb( long trans, long signs,
                 long m, long p, long q,
                 long x11, long ldx11, long x12,
                 long ldx12, long x21, long ldx21,
                 long x22, long ldx22, long theta,
                 long phi, long taup1, long taup2,
                 long tauq1, long tauq2, long work,
                 long lwork , long info );
    void dorcsd( long jobu1, long jobu2,
                 long jobv1t, long jobv2t, long trans,
                 long signs, long m, long p,
                 long q, long x11, long ldx11,
                 long x12, long ldx12, long x21,
                 long ldx21, long x22, long ldx22,
                 long theta, long u1, long ldu1,
                 long u2, long ldu2, long v1t,
                 long ldv1t, long v2t, long ldv2t,
                 long work, long lwork,
                 long iwork , long info );
    void dorcsd2by1( long jobu1, long jobu2,
                     long jobv1t, long m, long p,
                     long q, long x11, long ldx11,
                     long x21, long ldx21,
                     long theta, long u1, long ldu1,
                     long u2, long ldu2, long v1t,
                     long ldv1t, long work, long lwork,
                     long iwork , long info );
    void dsyconv( long uplo, long way,
                  long n, long a, long lda,
                  final long ipiv, long work , long info );
    void dsyswapr( long uplo, long n,
                   long a, long i1, long i2 );
    void dsytri2( long uplo, long n,
                  long a, long lda,
                  final long ipiv,
                  IComplexNumber work, long lwork , long info );
    void dsytri2x( long uplo, long n,
                   long a, long lda,
                   final long ipiv, long work,
                   long nb , long info );
    void dsytrs2( long uplo, long n,
                  long nrhs, final long a,
                  long lda, final long ipiv,
                  long b, long ldb, long work , long info );
    void sbbcsd( long jobu1, long jobu2,
                 long jobv1t, long jobv2t, long trans,
                 long m, long p, long q,
                 long theta, long phi, long u1,
                 long ldu1, long u2, long ldu2,
                 long v1t, long ldv1t, long v2t,
                 long ldv2t, long b11d, long b11e,
                 long b12d, long b12e, long b21d,
                 long b21e, long b22d, long b22e,
                 long work, long lwork , long info );
    void sorbdb( long trans, long signs,
                 long m, long p, long q,
                 long x11, long ldx11, long x12,
                 long ldx12, long x21, long ldx21,
                 long x22, long ldx22, long theta,
                 long phi, long taup1, long taup2,
                 long tauq1, long tauq2, long work,
                 long lwork , long info );
    void sorcsd( long jobu1, long jobu2,
                 long jobv1t, long jobv2t, long trans,
                 long signs, long m, long p,
                 long q, long x11, long ldx11,
                 long x12, long ldx12, long x21,
                 long ldx21, long x22, long ldx22,
                 long theta, long u1, long ldu1,
                 long u2, long ldu2, long v1t,
                 long ldv1t, long v2t, long ldv2t,
                 long work, long lwork,
                 long iwork , long info );
    void sorcsd2by1( long jobu1, long jobu2,
                     long jobv1t, long m, long p,
                     long q, long x11, long ldx11,
                     long x21, long ldx21,
                     long theta, long u1, long ldu1,
                     long u2, long ldu2, long v1t,
                     long ldv1t, long work, long lwork,
                     long iwork , long info );
    void ssyconv( long uplo, long way,
                  long n, long a, long lda,
                  final long ipiv, long work , long info );
    void ssyswapr( long uplo, long n,
                   long a, long i1, long i2 );
    void ssytri2( long uplo, long n,
                  long a, long lda,
                  final long ipiv,
                  IComplexNumber work, long lwork , long info );
    void ssytri2x( long uplo, long n,
                   long a, long lda,
                   final long ipiv, long work,
                   long nb , long info );
    void ssytrs2( long uplo, long n,
                  long nrhs, final long a,
                  long lda, final long ipiv,
                  long b, long ldb, long work , long info );
    void zbbcsd( long jobu1, long jobu2,
                 long jobv1t, long jobv2t, long trans,
                 long m, long p, long q,
                 long theta, long phi,
                 IComplexNumber u1, long ldu1,
                 IComplexNumber u2, long ldu2,
                 IComplexNumber v1t, long ldv1t,
                 IComplexNumber v2t, long ldv2t,
                 long b11d, long b11e, long b12d,
                 long b12e, long b21d, long b21e,
                 long b22d, long b22e, long rwork,
                 long lrwork , long info );
    void zheswapr( long uplo, long n,
                   IComplexNumber a, long i1,
                   long i2 );
    void zhetri2( long uplo, long n,
                  IComplexNumber a, long lda,
                  final long ipiv,
                  IComplexNumber work, long lwork , long info );
    void zhetri2x( long uplo, long n,
                   IComplexNumber a, long lda,
                   final long ipiv,
                   IComplexNumber work, long nb , long info );
    void zhetrs2( long uplo, long n,
                  long nrhs,
                  final IComplexNumber a, long lda,
                  final long ipiv,
                  IComplexNumber b, long ldb,
                  IComplexNumber work , long info );
    void zsyconv( long uplo, long way,
                  long n, IComplexNumber a,
                  long lda, final long ipiv,
                  IComplexNumber work , long info );
    void zsyswapr( long uplo, long n,
                   IComplexNumber a, long i1,
                   long i2 );
    void zsytri2( long uplo, long n,
                  IComplexNumber a, long lda,
                  final long ipiv,
                  IComplexNumber work, long lwork , long info );
    void zsytri2x( long uplo, long n,
                   IComplexNumber a, long lda,
                   final long ipiv,
                   IComplexNumber work, long nb , long info );
    void zsytrs2( long uplo, long n,
                  long nrhs,
                  final IComplexNumber a, long lda,
                  final long ipiv,
                  IComplexNumber b, long ldb,
                  IComplexNumber work , long info );
    void zunbdb( long trans, long signs,
                 long m, long p, long q,
                 IComplexNumber x11, long ldx11,
                 IComplexNumber x12, long ldx12,
                 IComplexNumber x21, long ldx21,
                 IComplexNumber x22, long ldx22,
                 long theta, long phi,
                 IComplexNumber taup1,
                 IComplexNumber taup2,
                 IComplexNumber tauq1,
                 IComplexNumber tauq2,
                 IComplexNumber work, long lwork , long info );
    void zuncsd( long jobu1, long jobu2,
                 long jobv1t, long jobv2t, long trans,
                 long signs, long m, long p,
                 long q, IComplexNumber x11,
                 long ldx11, IComplexNumber x12,
                 long ldx12, IComplexNumber x21,
                 long ldx21, IComplexNumber x22,
                 long ldx22, long theta,
                 IComplexNumber u1, long ldu1,
                 IComplexNumber u2, long ldu2,
                 IComplexNumber v1t, long ldv1t,
                 IComplexNumber v2t, long ldv2t,
                 IComplexNumber work, long lwork,
                 long rwork, long lrwork,
                 long iwork , long info );
    void zuncsd2by1( long jobu1, long jobu2,
                     long jobv1t, long m, long p,
                     long q, IComplexNumber x11,
                     long ldx11, IComplexNumber x21,
                     long ldx21, IComplexNumber theta,
                     IComplexNumber u1, long ldu1,
                     IComplexNumber u2, long ldu2,
                     IComplexNumber v1t, long ldv1t,
                     IComplexNumber work, long lwork,
                     long rwork, long lrwork,
                     long iwork , long info );
    // LAPACK 3.4.0
    void sgemqrt( long side, long trans, long m, long n,
                  long k, long nb, final long v,
                  long ldv, final long t, long ldt, long c,
                  long ldc, long work, long info );
    void dgemqrt( long side, long trans, long m, long n,
                  long k, long nb, final long v,
                  long ldv, final long t, long ldt,
                  long c, long ldc, long work,
                  long info );
    void cgemqrt( long side, long trans, long m, long n,
                  long k, long nb,
                  final IComplexNumber v, long ldv,
                  final IComplexNumber t, long ldt,
                  IComplexNumber c, long ldc,
                  IComplexNumber work, long info );
    void zgemqrt( long side, long trans, long m, long n,
                  long k, long nb,
                  final IComplexNumber v, long ldv,
                  final IComplexNumber t, long ldt,
                  IComplexNumber c, long ldc,
                  IComplexNumber work, long info );
    void sgeqrt( long m, long n, long nb, long a,
                 long lda, long t, long ldt, long work,
                 long info );
    void dgeqrt( long m, long n, long nb, long a,
                 long lda, long t, long ldt, long work,
                 long info );
    void cgeqrt( long m, long n, long nb,
                 IComplexNumber a, long lda,
                 IComplexNumber t, long ldt,
                 IComplexNumber work, long info );
    void zgeqrt( long m, long n, long nb,
                 IComplexNumber a, long lda,
                 IComplexNumber t, long ldt,
                 IComplexNumber work, long info );
    void sgeqrt2( long m, long n, long a, long lda,
                  long t, long ldt, long info );
    void dgeqrt2( long m, long n, long a, long lda,
                  long t, long ldt, long info );
    void cgeqrt2( long m, long n, IComplexNumber a,
                  long lda, IComplexNumber t, long ldt,
                  long info );
    void zgeqrt2( long m, long n, IComplexNumber a,
                  long lda, IComplexNumber t, long ldt,
                  long info );
    void sgeqrt3( long m, long n, long a, long lda,
                  long t, long ldt, long info );
    void dgeqrt3( long m, long n, long a, long lda,
                  long t, long ldt, long info );
    void cgeqrt3( long m, long n, IComplexNumber a,
                  long lda, IComplexNumber t, long ldt,
                  long info );
    void zgeqrt3( long m, long n, IComplexNumber a,
                  long lda, IComplexNumber t, long ldt,
                  long info );
    void stpmqrt( long side, long trans, long m, long n,
                  long k, long l, long nb,
                  final long v, long ldv, final long t,
                  long ldt, long a, long lda, long b,
                  long ldb, long work, long info );
    void dtpmqrt( long side, long trans, long m, long n,
                  long k, long l, long nb,
                  final long v, long ldv, final long t,
                  long ldt, long a, long lda, long b,
                  long ldb, long work, long info );
    void ctpmqrt( long side, long trans, long m, long n,
                  long k, long l, long nb,
                  final IComplexNumber v, long ldv,
                  final IComplexNumber t, long ldt,
                  IComplexNumber a, long lda,
                  IComplexNumber b, long ldb,
                  IComplexNumber work, long info );
    void ztpmqrt( long side, long trans, long m, long n,
                  long k, long l, long nb,
                  final IComplexNumber v, long ldv,
                  final IComplexNumber t, long ldt,
                  IComplexNumber a, long lda,
                  IComplexNumber b, long ldb,
                  IComplexNumber work, long info );
    void stpqrt( long m, long n, long l, long nb,
                 long a, long lda, long b, long ldb,
                 long t, long ldt, long work, long info );
    void dtpqrt( long m, long n, long l, long nb,
                 long a, long lda, long b, long ldb,
                 long t, long ldt, long work,
                 long info );
    void ctpqrt( long m, long n, long l, long nb,
                 IComplexNumber a, long lda,
                 IComplexNumber b, long ldb,
                 IComplexNumber t, long ldt,
                 IComplexNumber work, long info );
    void ztpqrt( long m, long n, long l, long nb,
                 IComplexNumber a, long lda,
                 IComplexNumber b, long ldb,
                 IComplexNumber t, long ldt,
                 IComplexNumber work, long info );
    void stpqrt2( long m, long n, long l,
                  long a, long lda,
                  long b, long ldb,
                  long t, long ldt,
                  long info );
    void dtpqrt2( long m, long n, long l,
                  long a, long lda,
                  long b, long ldb,
                  long t, long ldt,
                  long info );
    void ctpqrt2( long m, long n, long l,
                  IComplexNumber a, long lda,
                  IComplexNumber b, long ldb,
                  IComplexNumber t, long ldt,
                  long info );
    void ztpqrt2( long m, long n, long l,
                  IComplexNumber a, long lda,
                  IComplexNumber b, long ldb,
                  IComplexNumber t, long ldt,
                  long info );
    void stprfb( long side, long trans, long direct, long storev,
                 long m, long n, long k, long l,
                 final long v, long ldv, final long t,
                 long ldt, long a, long lda, long b,
                 long ldb, final long work,
                 long ldwork );
    void dtprfb( long side, long trans, long direct, long storev,
                 long m, long n, long k, long l,
                 final long v, long ldv, final long t,
                 long ldt, long a, long lda, long b,
                 long ldb, final long work,
                 long ldwork );
    void ctprfb( long side, long trans, long direct, long storev,
                 long m, long n, long k, long l,
                 final IComplexNumber v, long ldv,
                 final IComplexNumber t, long ldt,
                 IComplexNumber a, long lda,
                 IComplexNumber b, long ldb,
                 IComplexNumber work, long ldwork );
    void ztprfb( long side, long trans, long direct, long storev,
                 long m, long n, long k, long l,
                 final IComplexNumber v, long ldv,
                 final IComplexNumber t, long ldt,
                 IComplexNumber a, long lda,
                 IComplexNumber b, long ldb,
                 IComplexNumber work, long ldwork );
    // LAPACK 3.5.0
    void ssysv_rook( long uplo, long n, long nrhs, long a,
                     long lda, long ipiv, long b,
                     long ldb, long work, long lwork,
                     long info );
    void ssytrf_rook( long uplo, long n, long a, long lda,
                      long ipiv, long work, long lwork,
                      long info );
    void dsysv_rook( long uplo, long n, long nrhs, long a,
                     long lda, long ipiv, long b,
                     long ldb, long work, long lwork,
                     long info );
    void dsytrf_rook( long uplo, long n, long a, long lda,
                      long ipiv, long work, long lwork,
                      long info );
    void csysv_rook( long uplo, long n, long nrhs,
                     IComplexNumber a, long lda,
                     long ipiv, IComplexNumber b,
                     long ldb, IComplexNumber work,
                     long lwork, long info );
    void csytrf_rook( long uplo, long n, IComplexNumber a,
                      long lda, long ipiv,
                      IComplexNumber work, long lwork,
                      long info );
    void zsysv_rook( long uplo, long n, long nrhs,
                     IComplexNumber a, long lda,
                     long ipiv, IComplexNumber b,
                     long ldb, IComplexNumber work,
                     long lwork, long info );
    void zsytrf_rook( long uplo, long n, IComplexNumber a,
                      long lda, long ipiv,
                      IComplexNumber work, long lwork,
                      long info );
    void ssytrs_rook( long uplo, long n, long nrhs, final long a,
                      long lda, final long ipiv, long b,
                      long ldb, long info );
    void dsytrs_rook( long uplo, long n, long nrhs,
                      final long a, long lda, final long ipiv,
                      long b, long ldb, long info );
    void csytrs_rook( long uplo, long n, long nrhs,
                      final IComplexNumber a, long lda,
                      final long ipiv, IComplexNumber b,
                      long ldb, long info );
    void zsytrs_rook( long uplo, long n, long nrhs,
                      final IComplexNumber a, long lda,
                      final long ipiv, IComplexNumber b,
                      long ldb, long info );
    void chetrf_rook( long uplo, long n, IComplexNumber a,
                      long lda, long ipiv,
                      IComplexNumber work, long lwork,
                      long info );
    void zhetrf_rook( long uplo, long n, IComplexNumber a,
                      long lda, long ipiv,
                      IComplexNumber work, long lwork,
                      long info );
    void chetrs_rook( long uplo, long n, long nrhs,
                      final IComplexNumber a, long lda,
                      final long ipiv, IComplexNumber b,
                      long ldb, long info );
    void zhetrs_rook( long uplo, long n, long nrhs,
                      final IComplexNumber a, long lda,
                      final long ipiv, IComplexNumber b,
                      long ldb, long info );

    void csyr( long uplo, long n, IComplexNumber alpha,
               final IComplexNumber x, long incx,
               IComplexNumber a, long lda );
    void zsyr( long uplo, long n, IComplexNumber alpha,
               final IComplexNumber x, long incx,
               IComplexNumber a, long lda );


}
