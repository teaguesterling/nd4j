package org.nd4j.linalg.api.blas;

import org.nd4j.linalg.api.buffer.DataBuffer;
import org.nd4j.linalg.api.complex.IComplexNumber;
import org.nd4j.linalg.api.ndarray.INDArray;

public  interface Lapack {

/* C-LAPACK function prototypes */

    DataBuffer sbdsdc( DataBuffer matriint, char uplo, char compq,
                       DataBuffer n, INDArray d, INDArray e, INDArray u,
                       DataBuffer ldu, INDArray vt, DataBuffer ldvt, INDArray q,
                       DataBuffer iq );
    DataBuffer dbdsdc( DataBuffer matriint, char uplo, char compq,
                       DataBuffer n, INDArray d, INDArray e, INDArray u,
                       DataBuffer ldu, INDArray vt, DataBuffer ldvt,
                       INDArray q, DataBuffer iq );

    DataBuffer sbdsqr( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer ncvt, DataBuffer nru, DataBuffer ncc,
                       INDArray d, INDArray e, INDArray vt, DataBuffer ldvt,
                       INDArray u, DataBuffer ldu, INDArray c, DataBuffer ldc );
    DataBuffer dbdsqr( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer ncvt, DataBuffer nru, DataBuffer ncc,
                       INDArray d, INDArray e, INDArray vt, DataBuffer ldvt,
                       INDArray u, DataBuffer ldu, INDArray c,
                       DataBuffer ldc );
    DataBuffer cbdsqr( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer ncvt, DataBuffer nru, DataBuffer ncc,
                       INDArray d, INDArray e, IComplexNumber vt,
                       DataBuffer ldvt, IComplexNumber u,
                       DataBuffer ldu, IComplexNumber c,
                       DataBuffer ldc );
    DataBuffer zbdsqr( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer ncvt, DataBuffer nru, DataBuffer ncc,
                       INDArray d, INDArray e, IComplexNumber vt,
                       DataBuffer ldvt, IComplexNumber u,
                       DataBuffer ldu, IComplexNumber c,
                       DataBuffer ldc );
    DataBuffer sbdsvdx( DataBuffer matriint, char uplo, char jobz, char range,
                        DataBuffer n, INDArray d, INDArray e,
                        DataBuffer vl, DataBuffer vu,
                        DataBuffer il, DataBuffer iu, DataBuffer ns,
                        INDArray s, INDArray z, DataBuffer ldz,
                        DataBuffer superb );
    DataBuffer dbdsvdx( DataBuffer matriint, char uplo, char jobz, char range,
                        DataBuffer n, INDArray d, INDArray e,
                        DataBuffer vl, DataBuffer vu,
                        DataBuffer il, DataBuffer iu, DataBuffer ns,
                        INDArray s, INDArray z, DataBuffer ldz,
                        DataBuffer superb );
    DataBuffer sdisna( char job, DataBuffer m, DataBuffer n,  INDArray d,
                       INDArray sep );
    DataBuffer ddisna( char job, DataBuffer m, DataBuffer n,
                       INDArray d, INDArray sep );

    DataBuffer sgbbrd( DataBuffer matriint, char vect, DataBuffer m,
                       DataBuffer n, DataBuffer ncc, DataBuffer kl,
                       DataBuffer ku, INDArray ab, DataBuffer ldab, INDArray d,
                       INDArray e, INDArray q, DataBuffer ldq, INDArray pt,
                       DataBuffer ldpt, INDArray c, DataBuffer ldc );
    DataBuffer dgbbrd( DataBuffer matriint, char vect, DataBuffer m,
                       DataBuffer n, DataBuffer ncc, DataBuffer kl,
                       DataBuffer ku, INDArray ab, DataBuffer ldab,
                       INDArray d, INDArray e, INDArray q, DataBuffer ldq,
                       INDArray pt, DataBuffer ldpt, INDArray c,
                       DataBuffer ldc );
    DataBuffer cgbbrd( DataBuffer matriint, char vect, DataBuffer m,
                       DataBuffer n, DataBuffer ncc, DataBuffer kl,
                       DataBuffer ku, IComplexNumber ab,
                       DataBuffer ldab, INDArray d, INDArray e,
                       IComplexNumber q, DataBuffer ldq,
                       IComplexNumber pt, DataBuffer ldpt,
                       IComplexNumber c, DataBuffer ldc );
    DataBuffer zgbbrd( DataBuffer matriint, char vect, DataBuffer m,
                       DataBuffer n, DataBuffer ncc, DataBuffer kl,
                       DataBuffer ku, IComplexNumber ab,
                       DataBuffer ldab, INDArray d, INDArray e,
                       IComplexNumber q, DataBuffer ldq,
                       IComplexNumber pt, DataBuffer ldpt,
                       IComplexNumber c, DataBuffer ldc );

    DataBuffer sgbcon( DataBuffer matriint, char norm, DataBuffer n,
                       DataBuffer kl, DataBuffer ku,  INDArray ab,
                       DataBuffer ldab,  DataBuffer ipiv, float anorm,
                       INDArray rcond );
    DataBuffer dgbcon( DataBuffer matriint, char norm, DataBuffer n,
                       DataBuffer kl, DataBuffer ku,  INDArray ab,
                       DataBuffer ldab,  DataBuffer ipiv,
                       double anorm, INDArray rcond );
    DataBuffer cgbcon( DataBuffer matriint, char norm, DataBuffer n,
                       DataBuffer kl, DataBuffer ku,
                       IComplexNumber ab, DataBuffer ldab,
                       DataBuffer ipiv, float anorm, INDArray rcond );
    DataBuffer zgbcon( DataBuffer matriint, char norm, DataBuffer n,
                       DataBuffer kl, DataBuffer ku,
                       IComplexNumber ab, DataBuffer ldab,
                       DataBuffer ipiv, double anorm,
                       INDArray rcond );

    DataBuffer sgbequ( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer kl, DataBuffer ku,  INDArray ab,
                       DataBuffer ldab, INDArray r, INDArray c, INDArray rowcnd,
                       INDArray colcnd, INDArray amax );
    DataBuffer dgbequ( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer kl, DataBuffer ku,  INDArray ab,
                       DataBuffer ldab, INDArray r, INDArray c,
                       INDArray rowcnd, INDArray colcnd, INDArray amax );
    DataBuffer cgbequ( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer kl, DataBuffer ku,
                       IComplexNumber ab, DataBuffer ldab,
                       INDArray r, INDArray c, INDArray rowcnd, INDArray colcnd,
                       INDArray amax );
    DataBuffer zgbequ( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer kl, DataBuffer ku,
                       IComplexNumber ab, DataBuffer ldab,
                       INDArray r, INDArray c, INDArray rowcnd, INDArray colcnd,
                       INDArray amax );

    DataBuffer sgbequb( DataBuffer matriint, DataBuffer m, DataBuffer n,
                        DataBuffer kl, DataBuffer ku,  INDArray ab,
                        DataBuffer ldab, INDArray r, INDArray c, INDArray rowcnd,
                        INDArray colcnd, INDArray amax );
    DataBuffer dgbequb( DataBuffer matriint, DataBuffer m, DataBuffer n,
                        DataBuffer kl, DataBuffer ku,  INDArray ab,
                        DataBuffer ldab, INDArray r, INDArray c,
                        INDArray rowcnd, INDArray colcnd, INDArray amax );
    DataBuffer cgbequb( DataBuffer matriint, DataBuffer m, DataBuffer n,
                        DataBuffer kl, DataBuffer ku,
                        IComplexNumber ab, DataBuffer ldab,
                        INDArray r, INDArray c, INDArray rowcnd, INDArray colcnd,
                        INDArray amax );
    DataBuffer zgbequb( DataBuffer matriint, DataBuffer m, DataBuffer n,
                        DataBuffer kl, DataBuffer ku,
                        IComplexNumber ab, DataBuffer ldab,
                        INDArray r, INDArray c, INDArray rowcnd,
                        INDArray colcnd, INDArray amax );

    DataBuffer sgbrfs( DataBuffer matriint, char trans, DataBuffer n,
                       DataBuffer kl, DataBuffer ku, DataBuffer nrhs,
                       INDArray ab, DataBuffer ldab,  INDArray afb,
                       DataBuffer ldafb,  DataBuffer ipiv,
                       INDArray b, DataBuffer ldb, INDArray x,
                       DataBuffer ldx, INDArray ferr, INDArray berr );
    DataBuffer dgbrfs( DataBuffer matriint, char trans, DataBuffer n,
                       DataBuffer kl, DataBuffer ku, DataBuffer nrhs,
                       INDArray ab, DataBuffer ldab,  INDArray afb,
                       DataBuffer ldafb,  DataBuffer ipiv,
                       INDArray b, DataBuffer ldb, INDArray x,
                       DataBuffer ldx, INDArray ferr, INDArray berr );
    DataBuffer cgbrfs( DataBuffer matriint, char trans, DataBuffer n,
                       DataBuffer kl, DataBuffer ku, DataBuffer nrhs,
                       IComplexNumber ab, DataBuffer ldab,
                       IComplexNumber afb, DataBuffer ldafb,
                       DataBuffer ipiv,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx, INDArray ferr,
                       INDArray berr );
    DataBuffer zgbrfs( DataBuffer matriint, char trans, DataBuffer n,
                       DataBuffer kl, DataBuffer ku, DataBuffer nrhs,
                       IComplexNumber ab, DataBuffer ldab,
                       IComplexNumber afb, DataBuffer ldafb,
                       DataBuffer ipiv,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx,
                       INDArray ferr, INDArray berr );

    DataBuffer sgbrfsx( DataBuffer matriint, char trans, char equed,
                        DataBuffer n, DataBuffer kl, DataBuffer ku,
                        DataBuffer nrhs,  INDArray ab, DataBuffer ldab,
                        INDArray afb, DataBuffer ldafb,
                        DataBuffer ipiv,  INDArray r,
                        INDArray c,  INDArray b, DataBuffer ldb,
                        INDArray x, DataBuffer ldx, INDArray rcond, INDArray berr,
                        DataBuffer int_bnds, INDArray erint_norm,
                        INDArray erint_comp, DataBuffer nparams,
                        INDArray params );
    DataBuffer dgbrfsx( DataBuffer matriint, char trans, char equed,
                        DataBuffer n, DataBuffer kl, DataBuffer ku,
                        DataBuffer nrhs,  INDArray ab, DataBuffer ldab,
                        INDArray afb, DataBuffer ldafb,
                        DataBuffer ipiv,  INDArray r,
                        INDArray c,  INDArray b, DataBuffer ldb,
                        INDArray x, DataBuffer ldx, INDArray rcond,
                        INDArray berr, DataBuffer int_bnds,
                        INDArray erint_norm, INDArray erint_comp,
                        DataBuffer nparams, INDArray params );
    DataBuffer cgbrfsx( DataBuffer matriint, char trans, char equed,
                        DataBuffer n, DataBuffer kl, DataBuffer ku,
                        DataBuffer nrhs,  IComplexNumber ab,
                        DataBuffer ldab,  IComplexNumber afb,
                        DataBuffer ldafb,  DataBuffer ipiv,
                        INDArray r,  INDArray c,
                        IComplexNumber b, DataBuffer ldb,
                        IComplexNumber x, DataBuffer ldx,
                        INDArray rcond, INDArray berr, DataBuffer int_bnds,
                        INDArray erint_norm, INDArray erint_comp,
                        DataBuffer nparams, INDArray params );
    DataBuffer zgbrfsx( DataBuffer matriint, char trans, char equed,
                        DataBuffer n, DataBuffer kl, DataBuffer ku,
                        DataBuffer nrhs,  IComplexNumber ab,
                        DataBuffer ldab,  IComplexNumber afb,
                        DataBuffer ldafb,  DataBuffer ipiv,
                        INDArray r,  INDArray c,
                        IComplexNumber b, DataBuffer ldb,
                        IComplexNumber x, DataBuffer ldx,
                        INDArray rcond, INDArray berr, DataBuffer int_bnds,
                        INDArray erint_norm, INDArray erint_comp,
                        DataBuffer nparams, INDArray params );

    DataBuffer sgbsv( DataBuffer matriint, DataBuffer n, DataBuffer kl,
                      DataBuffer ku, DataBuffer nrhs, INDArray ab,
                      DataBuffer ldab, DataBuffer ipiv, INDArray b,
                      DataBuffer ldb );
    DataBuffer dgbsv( DataBuffer matriint, DataBuffer n, DataBuffer kl,
                      DataBuffer ku, DataBuffer nrhs, INDArray ab,
                      DataBuffer ldab, DataBuffer ipiv, INDArray b,
                      DataBuffer ldb );
    DataBuffer cgbsv( DataBuffer matriint, DataBuffer n, DataBuffer kl,
                      DataBuffer ku, DataBuffer nrhs,
                      IComplexNumber ab, DataBuffer ldab,
                      DataBuffer ipiv, IComplexNumber b,
                      DataBuffer ldb );
    DataBuffer zgbsv( DataBuffer matriint, DataBuffer n, DataBuffer kl,
                      DataBuffer ku, DataBuffer nrhs,
                      IComplexNumber ab, DataBuffer ldab,
                      DataBuffer ipiv, IComplexNumber b,
                      DataBuffer ldb );

    DataBuffer sgbsvx( DataBuffer matriint, char fact, char trans,
                       DataBuffer n, DataBuffer kl, DataBuffer ku,
                       DataBuffer nrhs, INDArray ab, DataBuffer ldab,
                       INDArray afb, DataBuffer ldafb, DataBuffer ipiv,
                       String equed, INDArray r, INDArray c, INDArray b,
                       DataBuffer ldb, INDArray x, DataBuffer ldx,
                       INDArray rcond, INDArray ferr, INDArray berr,
                       INDArray rpivot );
    DataBuffer dgbsvx( DataBuffer matriint, char fact, char trans,
                       DataBuffer n, DataBuffer kl, DataBuffer ku,
                       DataBuffer nrhs, INDArray ab, DataBuffer ldab,
                       INDArray afb, DataBuffer ldafb, DataBuffer ipiv,
                       String equed, INDArray r, INDArray c, INDArray b,
                       DataBuffer ldb, INDArray x, DataBuffer ldx,
                       INDArray rcond, INDArray ferr, INDArray berr,
                       INDArray rpivot );
    DataBuffer cgbsvx( DataBuffer matriint, char fact, char trans,
                       DataBuffer n, DataBuffer kl, DataBuffer ku,
                       DataBuffer nrhs, IComplexNumber ab,
                       DataBuffer ldab, IComplexNumber afb,
                       DataBuffer ldafb, DataBuffer ipiv, String equed,
                       INDArray r, INDArray c, IComplexNumber b,
                       DataBuffer ldb, IComplexNumber x,
                       DataBuffer ldx, INDArray rcond, INDArray ferr,
                       INDArray berr, INDArray rpivot );
    DataBuffer zgbsvx(DataBuffer matriint, char fact, char trans,
                      DataBuffer n, DataBuffer kl, DataBuffer ku,
                      DataBuffer nrhs, IComplexNumber ab,
                      DataBuffer ldab, IComplexNumber afb,
                      DataBuffer ldafb, DataBuffer ipiv, String equed,
                      INDArray r, INDArray c, IComplexNumber b,
                      DataBuffer ldb, IComplexNumber x,
                      DataBuffer ldx, INDArray rcond, INDArray ferr,
                      INDArray berr, INDArray rpivot );

    DataBuffer sgbsvxx( DataBuffer matriint, char fact, char trans,
                        DataBuffer n, DataBuffer kl, DataBuffer ku,
                        DataBuffer nrhs, INDArray ab, DataBuffer ldab,
                        INDArray afb, DataBuffer ldafb, DataBuffer ipiv,
                        String equed, INDArray r, INDArray c, INDArray b,
                        DataBuffer ldb, INDArray x, DataBuffer ldx,
                        INDArray rcond, INDArray rpvgrw, INDArray berr,
                        DataBuffer int_bnds, INDArray erint_norm,
                        INDArray erint_comp, DataBuffer nparams,
                        INDArray params );
    DataBuffer dgbsvxx( DataBuffer matriint, char fact, char trans,
                        DataBuffer n, DataBuffer kl, DataBuffer ku,
                        DataBuffer nrhs, INDArray ab, DataBuffer ldab,
                        INDArray afb, DataBuffer ldafb, DataBuffer ipiv,
                        String equed, INDArray r, INDArray c, INDArray b,
                        DataBuffer ldb, INDArray x, DataBuffer ldx,
                        INDArray rcond, INDArray rpvgrw, INDArray berr,
                        DataBuffer int_bnds, INDArray erint_norm,
                        INDArray erint_comp, DataBuffer nparams,
                        INDArray params );
    DataBuffer cgbsvxx( DataBuffer matriint, char fact, char trans,
                        DataBuffer n, DataBuffer kl, DataBuffer ku,
                        DataBuffer nrhs, IComplexNumber ab,
                        DataBuffer ldab, IComplexNumber afb,
                        DataBuffer ldafb, DataBuffer ipiv, String equed,
                        INDArray r, INDArray c, IComplexNumber b,
                        DataBuffer ldb, IComplexNumber x,
                        DataBuffer ldx, INDArray rcond, INDArray rpvgrw,
                        INDArray berr, DataBuffer int_bnds,
                        INDArray erint_norm, INDArray erint_comp,
                        DataBuffer nparams, INDArray params );
    DataBuffer zgbsvxx( DataBuffer matriint, char fact, char trans,
                        DataBuffer n, DataBuffer kl, DataBuffer ku,
                        DataBuffer nrhs, IComplexNumber ab,
                        DataBuffer ldab, IComplexNumber afb,
                        DataBuffer ldafb, DataBuffer ipiv, String equed,
                        INDArray r, INDArray c, IComplexNumber b,
                        DataBuffer ldb, IComplexNumber x,
                        DataBuffer ldx, INDArray rcond, INDArray rpvgrw,
                        INDArray berr, DataBuffer int_bnds,
                        INDArray erint_norm, INDArray erint_comp,
                        DataBuffer nparams, INDArray params );

    DataBuffer sgbtrf( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer kl, DataBuffer ku, INDArray ab,
                       DataBuffer ldab, DataBuffer ipiv );
    DataBuffer dgbtrf( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer kl, DataBuffer ku, INDArray ab,
                       DataBuffer ldab, DataBuffer ipiv );
    DataBuffer cgbtrf( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer kl, DataBuffer ku,
                       IComplexNumber ab, DataBuffer ldab,
                       DataBuffer ipiv );
    DataBuffer zgbtrf( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer kl, DataBuffer ku,
                       IComplexNumber ab, DataBuffer ldab,
                       DataBuffer ipiv );

    DataBuffer sgbtrs( DataBuffer matriint, char trans, DataBuffer n,
                       DataBuffer kl, DataBuffer ku, DataBuffer nrhs,
                       INDArray ab, DataBuffer ldab,
                       DataBuffer ipiv, INDArray b, DataBuffer ldb );
    DataBuffer dgbtrs( DataBuffer matriint, char trans, DataBuffer n,
                       DataBuffer kl, DataBuffer ku, DataBuffer nrhs,
                       INDArray ab, DataBuffer ldab,
                       DataBuffer ipiv, INDArray b, DataBuffer ldb );
    DataBuffer cgbtrs( DataBuffer matriint, char trans, DataBuffer n,
                       DataBuffer kl, DataBuffer ku, DataBuffer nrhs,
                       IComplexNumber ab, DataBuffer ldab,
                       DataBuffer ipiv, IComplexNumber b,
                       DataBuffer ldb );
    DataBuffer zgbtrs( DataBuffer matriint, char trans, DataBuffer n,
                       DataBuffer kl, DataBuffer ku, DataBuffer nrhs,
                       IComplexNumber ab, DataBuffer ldab,
                       DataBuffer ipiv, IComplexNumber b,
                       DataBuffer ldb );

    DataBuffer sgebak( DataBuffer matriint, char job, char side, DataBuffer n,
                       DataBuffer ilo, DataBuffer ihi,  INDArray scale,
                       DataBuffer m, INDArray v, DataBuffer ldv );
    DataBuffer dgebak( DataBuffer matriint, char job, char side, DataBuffer n,
                       DataBuffer ilo, DataBuffer ihi,  INDArray scale,
                       DataBuffer m, INDArray v, DataBuffer ldv );
    DataBuffer cgebak( DataBuffer matriint, char job, char side, DataBuffer n,
                       DataBuffer ilo, DataBuffer ihi,  INDArray scale,
                       DataBuffer m, IComplexNumber v,
                       DataBuffer ldv );
    DataBuffer zgebak( DataBuffer matriint, char job, char side, DataBuffer n,
                       DataBuffer ilo, DataBuffer ihi,  INDArray scale,
                       DataBuffer m, IComplexNumber v,
                       DataBuffer ldv );

    DataBuffer sgebal( DataBuffer matriint, char job, DataBuffer n, INDArray a,
                       DataBuffer lda, DataBuffer ilo, DataBuffer ihi,
                       INDArray scale );
    DataBuffer dgebal( DataBuffer matriint, char job, DataBuffer n, INDArray a,
                       DataBuffer lda, DataBuffer ilo, DataBuffer ihi,
                       INDArray scale );
    DataBuffer cgebal( DataBuffer matriint, char job, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       DataBuffer ilo, DataBuffer ihi, INDArray scale );
    DataBuffer zgebal( DataBuffer matriint, char job, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       DataBuffer ilo, DataBuffer ihi, INDArray scale );

    DataBuffer sgebrd( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       INDArray a, DataBuffer lda, INDArray d, INDArray e,
                       INDArray tauq, INDArray taup );
    DataBuffer dgebrd( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       INDArray a, DataBuffer lda, INDArray d, INDArray e,
                       INDArray tauq, INDArray taup );
    DataBuffer cgebrd( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       IComplexNumber a, DataBuffer lda, INDArray d,
                       INDArray e, IComplexNumber tauq,
                       IComplexNumber taup );
    DataBuffer zgebrd( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       IComplexNumber a, DataBuffer lda, INDArray d,
                       INDArray e, IComplexNumber tauq,
                       IComplexNumber taup );

    DataBuffer sgecon( DataBuffer matriint, char norm, DataBuffer n,
                       INDArray a, DataBuffer lda, float anorm,
                       INDArray rcond );
    DataBuffer dgecon( DataBuffer matriint, char norm, DataBuffer n,
                       INDArray a, DataBuffer lda, double anorm,
                       INDArray rcond );
    DataBuffer cgecon( DataBuffer matriint, char norm, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       float anorm, INDArray rcond );
    DataBuffer zgecon( DataBuffer matriint, char norm, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       double anorm, INDArray rcond );

    DataBuffer sgeequ( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       INDArray a, DataBuffer lda, INDArray r, INDArray c,
                       INDArray rowcnd, INDArray colcnd, INDArray amax );
    DataBuffer dgeequ( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       INDArray a, DataBuffer lda, INDArray r,
                       INDArray c, INDArray rowcnd, INDArray colcnd,
                       INDArray amax );
    DataBuffer cgeequ( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       INDArray r, INDArray c, INDArray rowcnd, INDArray colcnd,
                       INDArray amax );
    DataBuffer zgeequ( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       INDArray r, INDArray c, INDArray rowcnd, INDArray colcnd,
                       INDArray amax );

    DataBuffer sgeequb( DataBuffer matriint, DataBuffer m, DataBuffer n,
                        INDArray a, DataBuffer lda, INDArray r, INDArray c,
                        INDArray rowcnd, INDArray colcnd, INDArray amax );
    DataBuffer dgeequb( DataBuffer matriint, DataBuffer m, DataBuffer n,
                        INDArray a, DataBuffer lda, INDArray r,
                        INDArray c, INDArray rowcnd, INDArray colcnd,
                        INDArray amax );
    DataBuffer cgeequb( DataBuffer matriint, DataBuffer m, DataBuffer n,
                        IComplexNumber a, DataBuffer lda,
                        INDArray r, INDArray c, INDArray rowcnd, INDArray colcnd,
                        INDArray amax );
    DataBuffer zgeequb( DataBuffer matriint, DataBuffer m, DataBuffer n,
                        IComplexNumber a, DataBuffer lda,
                        INDArray r, INDArray c, INDArray rowcnd,
                        INDArray colcnd, INDArray amax );

    DataBuffer sgees( DataBuffer matriint, char jobvs, char sort,
                      int select, DataBuffer n, INDArray a,
                      DataBuffer lda, DataBuffer sdim, INDArray wr,
                      INDArray wi, INDArray vs, DataBuffer ldvs );
    DataBuffer dgees( DataBuffer matriint, char jobvs, char sort,
                      int select, DataBuffer n, INDArray a,
                      DataBuffer lda, DataBuffer sdim, INDArray wr,
                      INDArray wi, INDArray vs, DataBuffer ldvs );
    DataBuffer cgees( DataBuffer matriint, char jobvs, char sort,
                      int select, DataBuffer n,
                      IComplexNumber a, DataBuffer lda,
                      DataBuffer sdim, IComplexNumber w,
                      IComplexNumber vs, DataBuffer ldvs );
    DataBuffer zgees( DataBuffer matriint, char jobvs, char sort,
                      int select, DataBuffer n,
                      IComplexNumber a, DataBuffer lda,
                      DataBuffer sdim, IComplexNumber w,
                      IComplexNumber vs, DataBuffer ldvs );

    DataBuffer sgeesx( DataBuffer matriint, char jobvs, char sort,
                       int select, char sense, DataBuffer n,
                       INDArray a, DataBuffer lda, DataBuffer sdim,
                       INDArray wr, INDArray wi, INDArray vs, DataBuffer ldvs,
                       INDArray rconde, INDArray rcondv );
    DataBuffer dgeesx( DataBuffer matriint, char jobvs, char sort,
                       int select, char sense, DataBuffer n,
                       INDArray a, DataBuffer lda, DataBuffer sdim,
                       INDArray wr, INDArray wi, INDArray vs, DataBuffer ldvs,
                       INDArray rconde, INDArray rcondv );
    DataBuffer cgeesx( DataBuffer matriint, char jobvs, char sort,
                       int select, char sense, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       DataBuffer sdim, IComplexNumber w,
                       IComplexNumber vs, DataBuffer ldvs,
                       INDArray rconde, INDArray rcondv );
    DataBuffer zgeesx( DataBuffer matriint, char jobvs, char sort,
                       int select, char sense, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       DataBuffer sdim, IComplexNumber w,
                       IComplexNumber vs, DataBuffer ldvs,
                       INDArray rconde, INDArray rcondv );

    DataBuffer sgeev( DataBuffer matriint, char jobvl, char jobvr,
                      DataBuffer n, INDArray a, DataBuffer lda, INDArray wr,
                      INDArray wi, INDArray vl, DataBuffer ldvl, INDArray vr,
                      DataBuffer ldvr );
    DataBuffer dgeev( DataBuffer matriint, char jobvl, char jobvr,
                      DataBuffer n, INDArray a, DataBuffer lda, INDArray wr,
                      INDArray wi, INDArray vl, DataBuffer ldvl, INDArray vr,
                      DataBuffer ldvr );
    DataBuffer cgeev( DataBuffer matriint, char jobvl, char jobvr,
                      DataBuffer n, IComplexNumber a, DataBuffer lda,
                      IComplexNumber w, IComplexNumber vl,
                      DataBuffer ldvl, IComplexNumber vr,
                      DataBuffer ldvr );
    DataBuffer zgeev( DataBuffer matriint, char jobvl, char jobvr,
                      DataBuffer n, IComplexNumber a,
                      DataBuffer lda, IComplexNumber w,
                      IComplexNumber vl, DataBuffer ldvl,
                      IComplexNumber vr, DataBuffer ldvr );

    DataBuffer sgeevx( DataBuffer matriint, char balanc, char jobvl,
                       char jobvr, char sense, DataBuffer n, INDArray a,
                       DataBuffer lda, INDArray wr, INDArray wi, INDArray vl,
                       DataBuffer ldvl, INDArray vr, DataBuffer ldvr,
                       DataBuffer ilo, DataBuffer ihi, INDArray scale,
                       INDArray abnrm, INDArray rconde, INDArray rcondv );
    DataBuffer dgeevx( DataBuffer matriint, char balanc, char jobvl,
                       char jobvr, char sense, DataBuffer n, INDArray a,
                       DataBuffer lda, INDArray wr, INDArray wi, INDArray vl,
                       DataBuffer ldvl, INDArray vr, DataBuffer ldvr,
                       DataBuffer ilo, DataBuffer ihi, INDArray scale,
                       INDArray abnrm, INDArray rconde, INDArray rcondv );
    DataBuffer cgeevx( DataBuffer matriint, char balanc, char jobvl,
                       char jobvr, char sense, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber w, IComplexNumber vl,
                       DataBuffer ldvl, IComplexNumber vr,
                       DataBuffer ldvr, DataBuffer ilo, DataBuffer ihi,
                       INDArray scale, INDArray abnrm, INDArray rconde,
                       INDArray rcondv );
    DataBuffer zgeevx( DataBuffer matriint, char balanc, char jobvl,
                       char jobvr, char sense, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber w, IComplexNumber vl,
                       DataBuffer ldvl, IComplexNumber vr,
                       DataBuffer ldvr, DataBuffer ilo, DataBuffer ihi,
                       INDArray scale, INDArray abnrm, INDArray rconde,
                       INDArray rcondv );

    DataBuffer sgehrd( DataBuffer matriint, DataBuffer n, DataBuffer ilo,
                       DataBuffer ihi, INDArray a, DataBuffer lda,
                       INDArray tau );
    DataBuffer dgehrd( DataBuffer matriint, DataBuffer n, DataBuffer ilo,
                       DataBuffer ihi, INDArray a, DataBuffer lda,
                       INDArray tau );
    DataBuffer cgehrd( DataBuffer matriint, DataBuffer n, DataBuffer ilo,
                       DataBuffer ihi, IComplexNumber a,
                       DataBuffer lda, IComplexNumber tau );
    DataBuffer zgehrd( DataBuffer matriint, DataBuffer n, DataBuffer ilo,
                       DataBuffer ihi, IComplexNumber a,
                       DataBuffer lda, IComplexNumber tau );

    DataBuffer sgejsv( DataBuffer matriint, char joba, char jobu, char jobv,
                       char jobr, char jobt, char jobp, DataBuffer m,
                       DataBuffer n, INDArray a, DataBuffer lda, INDArray sva,
                       INDArray u, DataBuffer ldu, INDArray v, DataBuffer ldv,
                       INDArray stat, DataBuffer istat );
    DataBuffer dgejsv( DataBuffer matriint, char joba, char jobu, char jobv,
                       char jobr, char jobt, char jobp, DataBuffer m,
                       DataBuffer n, INDArray a, DataBuffer lda, INDArray sva,
                       INDArray u, DataBuffer ldu, INDArray v, DataBuffer ldv,
                       INDArray stat, DataBuffer istat );
    DataBuffer cgejsv( DataBuffer matriint, char joba, char jobu, char jobv,
                       char jobr, char jobt, char jobp, DataBuffer m,
                       DataBuffer n, IComplexNumber a, DataBuffer lda, INDArray sva,
                       IComplexNumber u, DataBuffer ldu, IComplexNumber v, DataBuffer ldv,
                       INDArray stat, DataBuffer istat );
    DataBuffer zgejsv( DataBuffer matriint, char joba, char jobu, char jobv,
                       char jobr, char jobt, char jobp, DataBuffer m,
                       DataBuffer n, IComplexNumber a, DataBuffer lda, INDArray sva,
                       IComplexNumber u, DataBuffer ldu, IComplexNumber v, DataBuffer ldv,
                       INDArray stat, DataBuffer istat );

    DataBuffer sgelq2( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       INDArray a, DataBuffer lda, INDArray tau );
    DataBuffer dgelq2( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       INDArray a, DataBuffer lda, INDArray tau );
    DataBuffer cgelq2( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber tau );
    DataBuffer zgelq2( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber tau );

    DataBuffer sgelqf( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       INDArray a, DataBuffer lda, INDArray tau );
    DataBuffer dgelqf( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       INDArray a, DataBuffer lda, INDArray tau );
    DataBuffer cgelqf( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber tau );
    DataBuffer zgelqf( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber tau );

    DataBuffer sgels( DataBuffer matriint, char trans, DataBuffer m,
                      DataBuffer n, DataBuffer nrhs, INDArray a,
                      DataBuffer lda, INDArray b, DataBuffer ldb );
    DataBuffer dgels( DataBuffer matriint, char trans, DataBuffer m,
                      DataBuffer n, DataBuffer nrhs, INDArray a,
                      DataBuffer lda, INDArray b, DataBuffer ldb );
    DataBuffer cgels( DataBuffer matriint, char trans, DataBuffer m,
                      DataBuffer n, DataBuffer nrhs,
                      IComplexNumber a, DataBuffer lda,
                      IComplexNumber b, DataBuffer ldb );
    DataBuffer zgels( DataBuffer matriint, char trans, DataBuffer m,
                      DataBuffer n, DataBuffer nrhs,
                      IComplexNumber a, DataBuffer lda,
                      IComplexNumber b, DataBuffer ldb );

    DataBuffer sgelsd( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer nrhs, INDArray a, DataBuffer lda, INDArray b,
                       DataBuffer ldb, INDArray s, float rcond,
                       DataBuffer rank );
    DataBuffer dgelsd( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer nrhs, INDArray a, DataBuffer lda,
                       INDArray b, DataBuffer ldb, INDArray s, double rcond,
                       DataBuffer rank );
    DataBuffer cgelsd( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer nrhs, IComplexNumber a,
                       DataBuffer lda, IComplexNumber b,
                       DataBuffer ldb, INDArray s, float rcond,
                       DataBuffer rank );
    DataBuffer zgelsd( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer nrhs, IComplexNumber a,
                       DataBuffer lda, IComplexNumber b,
                       DataBuffer ldb, INDArray s, double rcond,
                       DataBuffer rank );

    DataBuffer sgelss( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer nrhs, INDArray a, DataBuffer lda, INDArray b,
                       DataBuffer ldb, INDArray s, float rcond,
                       DataBuffer rank );
    DataBuffer dgelss( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer nrhs, INDArray a, DataBuffer lda,
                       INDArray b, DataBuffer ldb, INDArray s, double rcond,
                       DataBuffer rank );
    DataBuffer cgelss( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer nrhs, IComplexNumber a,
                       DataBuffer lda, IComplexNumber b,
                       DataBuffer ldb, INDArray s, float rcond,
                       DataBuffer rank );
    DataBuffer zgelss( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer nrhs, IComplexNumber a,
                       DataBuffer lda, IComplexNumber b,
                       DataBuffer ldb, INDArray s, double rcond,
                       DataBuffer rank );

    DataBuffer sgelsy( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer nrhs, INDArray a, DataBuffer lda, INDArray b,
                       DataBuffer ldb, DataBuffer jpvt, float rcond,
                       DataBuffer rank );
    DataBuffer dgelsy( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer nrhs, INDArray a, DataBuffer lda,
                       INDArray b, DataBuffer ldb, DataBuffer jpvt,
                       double rcond, DataBuffer rank );
    DataBuffer cgelsy( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer nrhs, IComplexNumber a,
                       DataBuffer lda, IComplexNumber b,
                       DataBuffer ldb, DataBuffer jpvt, float rcond,
                       DataBuffer rank );
    DataBuffer zgelsy( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer nrhs, IComplexNumber a,
                       DataBuffer lda, IComplexNumber b,
                       DataBuffer ldb, DataBuffer jpvt, double rcond,
                       DataBuffer rank );

    DataBuffer sgeqlf( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       INDArray a, DataBuffer lda, INDArray tau );
    DataBuffer dgeqlf( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       INDArray a, DataBuffer lda, INDArray tau );
    DataBuffer cgeqlf( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber tau );
    DataBuffer zgeqlf( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber tau );

    DataBuffer sgeqp3( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       INDArray a, DataBuffer lda, DataBuffer jpvt,
                       INDArray tau );
    DataBuffer dgeqp3( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       INDArray a, DataBuffer lda, DataBuffer jpvt,
                       INDArray tau );
    DataBuffer cgeqp3( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       DataBuffer jpvt, IComplexNumber tau );
    DataBuffer zgeqp3( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       DataBuffer jpvt, IComplexNumber tau );

    DataBuffer sgeqpf( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       INDArray a, DataBuffer lda, DataBuffer jpvt,
                       INDArray tau );
    DataBuffer dgeqpf( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       INDArray a, DataBuffer lda, DataBuffer jpvt,
                       INDArray tau );
    DataBuffer cgeqpf( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       DataBuffer jpvt, IComplexNumber tau );
    DataBuffer zgeqpf( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       DataBuffer jpvt, IComplexNumber tau );

    DataBuffer sgeqr2( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       INDArray a, DataBuffer lda, INDArray tau );
    DataBuffer dgeqr2( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       INDArray a, DataBuffer lda, INDArray tau );
    DataBuffer cgeqr2( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber tau );
    DataBuffer zgeqr2( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber tau );

    DataBuffer sgeqrf( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       INDArray a, DataBuffer lda, INDArray tau );
    DataBuffer dgeqrf( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       INDArray a, DataBuffer lda, INDArray tau );
    DataBuffer cgeqrf( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber tau );
    DataBuffer zgeqrf( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber tau );

    DataBuffer sgeqrfp( DataBuffer matriint, DataBuffer m, DataBuffer n,
                        INDArray a, DataBuffer lda, INDArray tau );
    DataBuffer dgeqrfp( DataBuffer matriint, DataBuffer m, DataBuffer n,
                        INDArray a, DataBuffer lda, INDArray tau );
    DataBuffer cgeqrfp( DataBuffer matriint, DataBuffer m, DataBuffer n,
                        IComplexNumber a, DataBuffer lda,
                        IComplexNumber tau );
    DataBuffer zgeqrfp( DataBuffer matriint, DataBuffer m, DataBuffer n,
                        IComplexNumber a, DataBuffer lda,
                        IComplexNumber tau );

    DataBuffer sgerfs( DataBuffer matriint, char trans, DataBuffer n,
                       DataBuffer nrhs,  INDArray a, DataBuffer lda,
                       INDArray af, DataBuffer ldaf,
                       DataBuffer ipiv,  INDArray b,
                       DataBuffer ldb, INDArray x, DataBuffer ldx,
                       INDArray ferr, INDArray berr );
    DataBuffer dgerfs( DataBuffer matriint, char trans, DataBuffer n,
                       DataBuffer nrhs,  INDArray a, DataBuffer lda,
                       INDArray af, DataBuffer ldaf,
                       DataBuffer ipiv,  INDArray b,
                       DataBuffer ldb, INDArray x, DataBuffer ldx,
                       INDArray ferr, INDArray berr );
    DataBuffer cgerfs( DataBuffer matriint, char trans, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber a,
                       DataBuffer lda,  IComplexNumber af,
                       DataBuffer ldaf,  DataBuffer ipiv,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx, INDArray ferr,
                       INDArray berr );
    DataBuffer zgerfs( DataBuffer matriint, char trans, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber a,
                       DataBuffer lda,  IComplexNumber af,
                       DataBuffer ldaf,  DataBuffer ipiv,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx,
                       INDArray ferr, INDArray berr );

    DataBuffer sgerfsx( DataBuffer matriint, char trans, char equed,
                        DataBuffer n, DataBuffer nrhs,  INDArray a,
                        DataBuffer lda,  INDArray af, DataBuffer ldaf,
                        DataBuffer ipiv,  INDArray r,
                        INDArray c,  INDArray b, DataBuffer ldb,
                        INDArray x, DataBuffer ldx, INDArray rcond, INDArray berr,
                        DataBuffer int_bnds, INDArray erint_norm,
                        INDArray erint_comp, DataBuffer nparams,
                        INDArray params );
    DataBuffer dgerfsx( DataBuffer matriint, char trans, char equed,
                        DataBuffer n, DataBuffer nrhs,  INDArray a,
                        DataBuffer lda,  INDArray af, DataBuffer ldaf,
                        DataBuffer ipiv,  INDArray r,
                        INDArray c,  INDArray b, DataBuffer ldb,
                        INDArray x, DataBuffer ldx, INDArray rcond,
                        INDArray berr, DataBuffer int_bnds,
                        INDArray erint_norm, INDArray erint_comp,
                        DataBuffer nparams, INDArray params );
    DataBuffer cgerfsx( DataBuffer matriint, char trans, char equed,
                        DataBuffer n, DataBuffer nrhs,
                        IComplexNumber a, DataBuffer lda,
                        IComplexNumber af, DataBuffer ldaf,
                        DataBuffer ipiv,  INDArray r,
                        INDArray c,  IComplexNumber b,
                        DataBuffer ldb, IComplexNumber x,
                        DataBuffer ldx, INDArray rcond, INDArray berr,
                        DataBuffer int_bnds, INDArray erint_norm,
                        INDArray erint_comp, DataBuffer nparams,
                        INDArray params );
    DataBuffer zgerfsx( DataBuffer matriint, char trans, char equed,
                        DataBuffer n, DataBuffer nrhs,
                        IComplexNumber a, DataBuffer lda,
                        IComplexNumber af, DataBuffer ldaf,
                        DataBuffer ipiv,  INDArray r,
                        INDArray c,  IComplexNumber b,
                        DataBuffer ldb, IComplexNumber x,
                        DataBuffer ldx, INDArray rcond, INDArray berr,
                        DataBuffer int_bnds, INDArray erint_norm,
                        INDArray erint_comp, DataBuffer nparams,
                        INDArray params );

    DataBuffer sgerqf( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       INDArray a, DataBuffer lda, INDArray tau );
    DataBuffer dgerqf( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       INDArray a, DataBuffer lda, INDArray tau );
    DataBuffer cgerqf( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber tau );
    DataBuffer zgerqf( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber tau );

    DataBuffer sgesdd( DataBuffer matriint, char jobz, DataBuffer m,
                       DataBuffer n, INDArray a, DataBuffer lda, INDArray s,
                       INDArray u, DataBuffer ldu, INDArray vt,
                       DataBuffer ldvt );
    DataBuffer dgesdd( DataBuffer matriint, char jobz, DataBuffer m,
                       DataBuffer n, INDArray a, DataBuffer lda, INDArray s,
                       INDArray u, DataBuffer ldu, INDArray vt,
                       DataBuffer ldvt );
    DataBuffer cgesdd( DataBuffer matriint, char jobz, DataBuffer m,
                       DataBuffer n, IComplexNumber a,
                       DataBuffer lda, INDArray s, IComplexNumber u,
                       DataBuffer ldu, IComplexNumber vt,
                       DataBuffer ldvt );
    DataBuffer zgesdd( DataBuffer matriint, char jobz, DataBuffer m,
                       DataBuffer n, IComplexNumber a,
                       DataBuffer lda, INDArray s, IComplexNumber u,
                       DataBuffer ldu, IComplexNumber vt,
                       DataBuffer ldvt );

    DataBuffer sgesv( DataBuffer matriint, DataBuffer n, DataBuffer nrhs,
                      INDArray a, DataBuffer lda, DataBuffer ipiv, INDArray b,
                      DataBuffer ldb );
    DataBuffer dgesv( DataBuffer matriint, DataBuffer n, DataBuffer nrhs,
                      INDArray a, DataBuffer lda, DataBuffer ipiv,
                      INDArray b, DataBuffer ldb );
    DataBuffer cgesv( DataBuffer matriint, DataBuffer n, DataBuffer nrhs,
                      IComplexNumber a, DataBuffer lda,
                      DataBuffer ipiv, IComplexNumber b,
                      DataBuffer ldb );
    DataBuffer zgesv( DataBuffer matriint, DataBuffer n, DataBuffer nrhs,
                      IComplexNumber a, DataBuffer lda,
                      DataBuffer ipiv, IComplexNumber b,
                      DataBuffer ldb );
    DataBuffer dsgesv( DataBuffer matriint, DataBuffer n, DataBuffer nrhs,
                       INDArray a, DataBuffer lda, DataBuffer ipiv,
                       INDArray b, DataBuffer ldb, INDArray x, DataBuffer ldx,
                       DataBuffer iter );
    DataBuffer zcgesv( DataBuffer matriint, DataBuffer n, DataBuffer nrhs,
                       IComplexNumber a, DataBuffer lda,
                       DataBuffer ipiv, IComplexNumber b,
                       DataBuffer ldb, IComplexNumber x,
                       DataBuffer ldx, DataBuffer iter );

    DataBuffer sgesvd( DataBuffer matriint, char jobu, char jobvt,
                       DataBuffer m, DataBuffer n, INDArray a, DataBuffer lda,
                       INDArray s, INDArray u, DataBuffer ldu, INDArray vt,
                       DataBuffer ldvt, INDArray superb );
    DataBuffer dgesvd( DataBuffer matriint, char jobu, char jobvt,
                       DataBuffer m, DataBuffer n, INDArray a,
                       DataBuffer lda, INDArray s, INDArray u, DataBuffer ldu,
                       INDArray vt, DataBuffer ldvt, INDArray superb );
    DataBuffer cgesvd( DataBuffer matriint, char jobu, char jobvt,
                       DataBuffer m, DataBuffer n, IComplexNumber a,
                       DataBuffer lda, INDArray s, IComplexNumber u,
                       DataBuffer ldu, IComplexNumber vt,
                       DataBuffer ldvt, INDArray superb );
    DataBuffer zgesvd( DataBuffer matriint, char jobu, char jobvt,
                       DataBuffer m, DataBuffer n, IComplexNumber a,
                       DataBuffer lda, INDArray s, IComplexNumber u,
                       DataBuffer ldu, IComplexNumber vt,
                       DataBuffer ldvt, INDArray superb );

    DataBuffer sgesvdx( DataBuffer matriint, char jobu, char jobvt, char range,
                        DataBuffer m, DataBuffer n, INDArray a,
                        DataBuffer lda, DataBuffer vl, DataBuffer vu,
                        DataBuffer il, DataBuffer iu, DataBuffer ns,
                        INDArray s, INDArray u, DataBuffer ldu,
                        INDArray vt, DataBuffer ldvt,
                        DataBuffer superb );
    DataBuffer dgesvdx( DataBuffer matriint, char jobu, char jobvt, char range,
                        DataBuffer m, DataBuffer n, INDArray a,
                        DataBuffer lda, DataBuffer vl, DataBuffer vu,
                        DataBuffer il, DataBuffer iu, DataBuffer ns,
                        INDArray s, INDArray u, DataBuffer ldu,
                        INDArray vt, DataBuffer ldvt,
                        DataBuffer superb );
    DataBuffer cgesvdx( DataBuffer matriint, char jobu, char jobvt, char range,
                        DataBuffer m, DataBuffer n, IComplexNumber a,
                        DataBuffer lda, DataBuffer vl, DataBuffer vu,
                        DataBuffer il, DataBuffer iu, DataBuffer ns,
                        INDArray s, IComplexNumber u, DataBuffer ldu,
                        IComplexNumber vt, DataBuffer ldvt,
                        DataBuffer superb );
    DataBuffer zgesvdx( DataBuffer matriint, char jobu, char jobvt, char range,
                        DataBuffer m, DataBuffer n, IComplexNumber a,
                        DataBuffer lda, DataBuffer vl, DataBuffer vu,
                        DataBuffer il, DataBuffer iu, DataBuffer ns,
                        INDArray s, IComplexNumber u, DataBuffer ldu,
                        IComplexNumber vt, DataBuffer ldvt,
                        DataBuffer superb );

    DataBuffer sgesvj( DataBuffer matriint, char joba, char jobu, char jobv,
                       DataBuffer m, DataBuffer n, INDArray a, DataBuffer lda,
                       INDArray sva, DataBuffer mv, INDArray v, DataBuffer ldv,
                       INDArray stat );
    DataBuffer dgesvj( DataBuffer matriint, char joba, char jobu, char jobv,
                       DataBuffer m, DataBuffer n, INDArray a,
                       DataBuffer lda, INDArray sva, DataBuffer mv,
                       INDArray v, DataBuffer ldv, INDArray stat );
    DataBuffer cgesvj( DataBuffer matriint, char joba, char jobu, char jobv,
                       DataBuffer m, DataBuffer n, IComplexNumber a,
                       DataBuffer lda, INDArray sva, DataBuffer mv,
                       IComplexNumber v, DataBuffer ldv, INDArray stat );
    DataBuffer zgesvj( DataBuffer matriint, char joba, char jobu, char jobv,
                       DataBuffer m, DataBuffer n, IComplexNumber a,
                       DataBuffer lda, INDArray sva, DataBuffer mv,
                       IComplexNumber v, DataBuffer ldv, INDArray stat );

    DataBuffer sgesvx( DataBuffer matriint, char fact, char trans,
                       DataBuffer n, DataBuffer nrhs, INDArray a,
                       DataBuffer lda, INDArray af, DataBuffer ldaf,
                       DataBuffer ipiv, String equed, INDArray r, INDArray c,
                       INDArray b, DataBuffer ldb, INDArray x, DataBuffer ldx,
                       INDArray rcond, INDArray ferr, INDArray berr,
                       INDArray rpivot );
    DataBuffer dgesvx( DataBuffer matriint, char fact, char trans,
                       DataBuffer n, DataBuffer nrhs, INDArray a,
                       DataBuffer lda, INDArray af, DataBuffer ldaf,
                       DataBuffer ipiv, String equed, INDArray r, INDArray c,
                       INDArray b, DataBuffer ldb, INDArray x, DataBuffer ldx,
                       INDArray rcond, INDArray ferr, INDArray berr,
                       INDArray rpivot );
    DataBuffer cgesvx( DataBuffer matriint, char fact, char trans,
                       DataBuffer n, DataBuffer nrhs,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber af, DataBuffer ldaf,
                       DataBuffer ipiv, String equed, INDArray r, INDArray c,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx,
                       INDArray rcond, INDArray ferr, INDArray berr,
                       INDArray rpivot );
    DataBuffer zgesvx( DataBuffer matriint, char fact, char trans,
                       DataBuffer n, DataBuffer nrhs,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber af, DataBuffer ldaf,
                       DataBuffer ipiv, String equed, INDArray r, INDArray c,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx,
                       INDArray rcond, INDArray ferr, INDArray berr,
                       INDArray rpivot );

    DataBuffer sgesvxx( DataBuffer matriint, char fact, char trans,
                        DataBuffer n, DataBuffer nrhs, INDArray a,
                        DataBuffer lda, INDArray af, DataBuffer ldaf,
                        DataBuffer ipiv, String equed, INDArray r, INDArray c,
                        INDArray b, DataBuffer ldb, INDArray x, DataBuffer ldx,
                        INDArray rcond, INDArray rpvgrw, INDArray berr,
                        DataBuffer int_bnds, INDArray erint_norm,
                        INDArray erint_comp, DataBuffer nparams,
                        INDArray params );
    DataBuffer dgesvxx( DataBuffer matriint, char fact, char trans,
                        DataBuffer n, DataBuffer nrhs, INDArray a,
                        DataBuffer lda, INDArray af, DataBuffer ldaf,
                        DataBuffer ipiv, String equed, INDArray r, INDArray c,
                        INDArray b, DataBuffer ldb, INDArray x,
                        DataBuffer ldx, INDArray rcond, INDArray rpvgrw,
                        INDArray berr, DataBuffer int_bnds,
                        INDArray erint_norm, INDArray erint_comp,
                        DataBuffer nparams, INDArray params );
    DataBuffer cgesvxx( DataBuffer matriint, char fact, char trans,
                        DataBuffer n, DataBuffer nrhs,
                        IComplexNumber a, DataBuffer lda,
                        IComplexNumber af, DataBuffer ldaf,
                        DataBuffer ipiv, String equed, INDArray r, INDArray c,
                        IComplexNumber b, DataBuffer ldb,
                        IComplexNumber x, DataBuffer ldx,
                        INDArray rcond, INDArray rpvgrw, INDArray berr,
                        DataBuffer int_bnds, INDArray erint_norm,
                        INDArray erint_comp, DataBuffer nparams,
                        INDArray params );
    DataBuffer zgesvxx( DataBuffer matriint, char fact, char trans,
                        DataBuffer n, DataBuffer nrhs,
                        IComplexNumber a, DataBuffer lda,
                        IComplexNumber af, DataBuffer ldaf,
                        DataBuffer ipiv, String equed, INDArray r, INDArray c,
                        IComplexNumber b, DataBuffer ldb,
                        IComplexNumber x, DataBuffer ldx,
                        INDArray rcond, INDArray rpvgrw, INDArray berr,
                        DataBuffer int_bnds, INDArray erint_norm,
                        INDArray erint_comp, DataBuffer nparams,
                        INDArray params );

    DataBuffer sgetf2( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       INDArray a, DataBuffer lda, DataBuffer ipiv );
    DataBuffer dgetf2( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       INDArray a, DataBuffer lda, DataBuffer ipiv );
    DataBuffer cgetf2( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       DataBuffer ipiv );
    DataBuffer zgetf2( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       DataBuffer ipiv );

    DataBuffer sgetrf( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       INDArray a, DataBuffer lda, DataBuffer ipiv );
    DataBuffer dgetrf( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       INDArray a, DataBuffer lda, DataBuffer ipiv );
    DataBuffer cgetrf( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       DataBuffer ipiv );
    DataBuffer zgetrf( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       DataBuffer ipiv );

    DataBuffer sgetrf2( DataBuffer matriint, DataBuffer m, DataBuffer n,
                        INDArray a, DataBuffer lda, DataBuffer ipiv );
    DataBuffer dgetrf2( DataBuffer matriint, DataBuffer m, DataBuffer n,
                        INDArray a, DataBuffer lda, DataBuffer ipiv );
    DataBuffer cgetrf2( DataBuffer matriint, DataBuffer m, DataBuffer n,
                        IComplexNumber a, DataBuffer lda,
                        DataBuffer ipiv );
    DataBuffer zgetrf2( DataBuffer matriint, DataBuffer m, DataBuffer n,
                        IComplexNumber a, DataBuffer lda,
                        DataBuffer ipiv );

    DataBuffer sgetri( DataBuffer matriint, DataBuffer n, INDArray a,
                       DataBuffer lda,  DataBuffer ipiv );
    DataBuffer dgetri( DataBuffer matriint, DataBuffer n, INDArray a,
                       DataBuffer lda,  DataBuffer ipiv );
    DataBuffer cgetri( DataBuffer matriint, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       DataBuffer ipiv );
    DataBuffer zgetri( DataBuffer matriint, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       DataBuffer ipiv );

    DataBuffer sgetrs( DataBuffer matriint, char trans, DataBuffer n,
                       DataBuffer nrhs,  INDArray a, DataBuffer lda,
                       DataBuffer ipiv, INDArray b, DataBuffer ldb );
    DataBuffer dgetrs( DataBuffer matriint, char trans, DataBuffer n,
                       DataBuffer nrhs,  INDArray a, DataBuffer lda,
                       DataBuffer ipiv, INDArray b, DataBuffer ldb );
    DataBuffer cgetrs( DataBuffer matriint, char trans, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber a,
                       DataBuffer lda,  DataBuffer ipiv,
                       IComplexNumber b, DataBuffer ldb );
    DataBuffer zgetrs( DataBuffer matriint, char trans, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber a,
                       DataBuffer lda,  DataBuffer ipiv,
                       IComplexNumber b, DataBuffer ldb );

    DataBuffer sggbak( DataBuffer matriint, char job, char side, DataBuffer n,
                       DataBuffer ilo, DataBuffer ihi,  INDArray lscale,
                       INDArray rscale, DataBuffer m, INDArray v,
                       DataBuffer ldv );
    DataBuffer dggbak( DataBuffer matriint, char job, char side, DataBuffer n,
                       DataBuffer ilo, DataBuffer ihi,  INDArray lscale,
                       INDArray rscale, DataBuffer m, INDArray v,
                       DataBuffer ldv );
    DataBuffer cggbak( DataBuffer matriint, char job, char side, DataBuffer n,
                       DataBuffer ilo, DataBuffer ihi,  INDArray lscale,
                       INDArray rscale, DataBuffer m,
                       IComplexNumber v, DataBuffer ldv );
    DataBuffer zggbak( DataBuffer matriint, char job, char side, DataBuffer n,
                       DataBuffer ilo, DataBuffer ihi,  INDArray lscale,
                       INDArray rscale, DataBuffer m,
                       IComplexNumber v, DataBuffer ldv );

    DataBuffer sggbal( DataBuffer matriint, char job, DataBuffer n, INDArray a,
                       DataBuffer lda, INDArray b, DataBuffer ldb,
                       DataBuffer ilo, DataBuffer ihi, INDArray lscale,
                       INDArray rscale );
    DataBuffer dggbal( DataBuffer matriint, char job, DataBuffer n, INDArray a,
                       DataBuffer lda, INDArray b, DataBuffer ldb,
                       DataBuffer ilo, DataBuffer ihi, INDArray lscale,
                       INDArray rscale );
    DataBuffer cggbal( DataBuffer matriint, char job, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber b, DataBuffer ldb,
                       DataBuffer ilo, DataBuffer ihi, INDArray lscale,
                       INDArray rscale );
    DataBuffer zggbal( DataBuffer matriint, char job, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber b, DataBuffer ldb,
                       DataBuffer ilo, DataBuffer ihi, INDArray lscale,
                       INDArray rscale );

    DataBuffer sgges( DataBuffer matriint, char jobvsl, char jobvsr, char sort,
                      int selctg, DataBuffer n, INDArray a,
                      DataBuffer lda, INDArray b, DataBuffer ldb,
                      DataBuffer sdim, INDArray alphar, INDArray alphai,
                      INDArray beta, INDArray vsl, DataBuffer ldvsl, INDArray vsr,
                      DataBuffer ldvsr );
    DataBuffer dgges( DataBuffer matriint, char jobvsl, char jobvsr, char sort,
                      int selctg, DataBuffer n, INDArray a,
                      DataBuffer lda, INDArray b, DataBuffer ldb,
                      DataBuffer sdim, INDArray alphar, INDArray alphai,
                      INDArray beta, INDArray vsl, DataBuffer ldvsl,
                      INDArray vsr, DataBuffer ldvsr );
    DataBuffer cgges( DataBuffer matriint, char jobvsl, char jobvsr, char sort,
                      int selctg, DataBuffer n,
                      IComplexNumber a, DataBuffer lda,
                      IComplexNumber b, DataBuffer ldb,
                      DataBuffer sdim, IComplexNumber alpha,
                      IComplexNumber beta, IComplexNumber vsl,
                      DataBuffer ldvsl, IComplexNumber vsr,
                      DataBuffer ldvsr );
    DataBuffer zgges( DataBuffer matriint, char jobvsl, char jobvsr, char sort,
                      int selctg, DataBuffer n,
                      IComplexNumber a, DataBuffer lda,
                      IComplexNumber b, DataBuffer ldb,
                      DataBuffer sdim, IComplexNumber alpha,
                      IComplexNumber beta,
                      IComplexNumber vsl, DataBuffer ldvsl,
                      IComplexNumber vsr, DataBuffer ldvsr );

    DataBuffer sgges3( DataBuffer matriint, char jobvsl, char jobvsr,
                       char sort, int selctg, DataBuffer n,
                       INDArray a, DataBuffer lda, INDArray b, DataBuffer ldb,
                       DataBuffer sdim, INDArray alphar, INDArray alphai,
                       INDArray beta, INDArray vsl, DataBuffer ldvsl,
                       INDArray vsr, DataBuffer ldvsr );
    DataBuffer dgges3( DataBuffer matriint, char jobvsl, char jobvsr,
                       char sort, int selctg, DataBuffer n,
                       INDArray a, DataBuffer lda, INDArray b, DataBuffer ldb,
                       DataBuffer sdim, INDArray alphar, INDArray alphai,
                       INDArray beta, INDArray vsl, DataBuffer ldvsl,
                       INDArray vsr, DataBuffer ldvsr );
    DataBuffer cgges3( DataBuffer matriint, char jobvsl, char jobvsr,
                       char sort, int selctg, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber b, DataBuffer ldb,
                       DataBuffer sdim, IComplexNumber alpha,
                       IComplexNumber beta,
                       IComplexNumber vsl, DataBuffer ldvsl,
                       IComplexNumber vsr, DataBuffer ldvsr );
    DataBuffer zgges3( DataBuffer matriint, char jobvsl, char jobvsr,
                       char sort, int selctg, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber b, DataBuffer ldb,
                       DataBuffer sdim, IComplexNumber alpha,
                       IComplexNumber beta,
                       IComplexNumber vsl, DataBuffer ldvsl,
                       IComplexNumber vsr, DataBuffer ldvsr );

    DataBuffer sggesx( DataBuffer matriint, char jobvsl, char jobvsr,
                       char sort, int selctg, char sense,
                       DataBuffer n, INDArray a, DataBuffer lda, INDArray b,
                       DataBuffer ldb, DataBuffer sdim, INDArray alphar,
                       INDArray alphai, INDArray beta, INDArray vsl,
                       DataBuffer ldvsl, INDArray vsr, DataBuffer ldvsr,
                       INDArray rconde, INDArray rcondv );
    DataBuffer dggesx( DataBuffer matriint, char jobvsl, char jobvsr,
                       char sort, int selctg, char sense,
                       DataBuffer n, INDArray a, DataBuffer lda, INDArray b,
                       DataBuffer ldb, DataBuffer sdim, INDArray alphar,
                       INDArray alphai, INDArray beta, INDArray vsl,
                       DataBuffer ldvsl, INDArray vsr, DataBuffer ldvsr,
                       INDArray rconde, INDArray rcondv );
    DataBuffer cggesx( DataBuffer matriint, char jobvsl, char jobvsr,
                       char sort, int selctg, char sense,
                       DataBuffer n, IComplexNumber a,
                       DataBuffer lda, IComplexNumber b,
                       DataBuffer ldb, DataBuffer sdim,
                       IComplexNumber alpha,
                       IComplexNumber beta,
                       IComplexNumber vsl, DataBuffer ldvsl,
                       IComplexNumber vsr, DataBuffer ldvsr,
                       INDArray rconde, INDArray rcondv );
    DataBuffer zggesx( DataBuffer matriint, char jobvsl, char jobvsr,
                       char sort, int selctg, char sense,
                       DataBuffer n, IComplexNumber a,
                       DataBuffer lda, IComplexNumber b,
                       DataBuffer ldb, DataBuffer sdim,
                       IComplexNumber alpha,
                       IComplexNumber beta,
                       IComplexNumber vsl, DataBuffer ldvsl,
                       IComplexNumber vsr, DataBuffer ldvsr,
                       INDArray rconde, INDArray rcondv );

    DataBuffer sggev( DataBuffer matriint, char jobvl, char jobvr,
                      DataBuffer n, INDArray a, DataBuffer lda, INDArray b,
                      DataBuffer ldb, INDArray alphar, INDArray alphai,
                      INDArray beta, INDArray vl, DataBuffer ldvl, INDArray vr,
                      DataBuffer ldvr );
    DataBuffer dggev( DataBuffer matriint, char jobvl, char jobvr,
                      DataBuffer n, INDArray a, DataBuffer lda, INDArray b,
                      DataBuffer ldb, INDArray alphar, INDArray alphai,
                      INDArray beta, INDArray vl, DataBuffer ldvl, INDArray vr,
                      DataBuffer ldvr );
    DataBuffer cggev( DataBuffer matriint, char jobvl, char jobvr,
                      DataBuffer n, IComplexNumber a, DataBuffer lda,
                      IComplexNumber b, DataBuffer ldb,
                      IComplexNumber alpha,
                      IComplexNumber beta, IComplexNumber vl,
                      DataBuffer ldvl, IComplexNumber vr,
                      DataBuffer ldvr );
    DataBuffer zggev( DataBuffer matriint, char jobvl, char jobvr,
                      DataBuffer n, IComplexNumber a,
                      DataBuffer lda, IComplexNumber b,
                      DataBuffer ldb, IComplexNumber alpha,
                      IComplexNumber beta,
                      IComplexNumber vl, DataBuffer ldvl,
                      IComplexNumber vr, DataBuffer ldvr );

    DataBuffer sggev3( DataBuffer matriint, char jobvl, char jobvr,
                       DataBuffer n, INDArray a, DataBuffer lda,
                       INDArray b, DataBuffer ldb,
                       INDArray alphar, INDArray alphai, INDArray beta,
                       INDArray vl, DataBuffer ldvl,
                       INDArray vr, DataBuffer ldvr );
    DataBuffer dggev3( DataBuffer matriint, char jobvl, char jobvr,
                       DataBuffer n, INDArray a, DataBuffer lda,
                       INDArray b, DataBuffer ldb,
                       INDArray alphar, INDArray alphai, INDArray beta,
                       INDArray vl, DataBuffer ldvl,
                       INDArray vr, DataBuffer ldvr );
    DataBuffer cggev3( DataBuffer matriint, char jobvl, char jobvr,
                       DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber alpha,
                       IComplexNumber beta,
                       IComplexNumber vl, DataBuffer ldvl,
                       IComplexNumber vr, DataBuffer ldvr );
    DataBuffer zggev3( DataBuffer matriint, char jobvl, char jobvr,
                       DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber alpha,
                       IComplexNumber beta,
                       IComplexNumber vl, DataBuffer ldvl,
                       IComplexNumber vr, DataBuffer ldvr );

    DataBuffer sggevx( DataBuffer matriint, char balanc, char jobvl,
                       char jobvr, char sense, DataBuffer n, INDArray a,
                       DataBuffer lda, INDArray b, DataBuffer ldb,
                       INDArray alphar, INDArray alphai, INDArray beta, INDArray vl,
                       DataBuffer ldvl, INDArray vr, DataBuffer ldvr,
                       DataBuffer ilo, DataBuffer ihi, INDArray lscale,
                       INDArray rscale, INDArray abnrm, INDArray bbnrm,
                       INDArray rconde, INDArray rcondv );
    DataBuffer dggevx( DataBuffer matriint, char balanc, char jobvl,
                       char jobvr, char sense, DataBuffer n, INDArray a,
                       DataBuffer lda, INDArray b, DataBuffer ldb,
                       INDArray alphar, INDArray alphai, INDArray beta,
                       INDArray vl, DataBuffer ldvl, INDArray vr,
                       DataBuffer ldvr, DataBuffer ilo, DataBuffer ihi,
                       INDArray lscale, INDArray rscale, INDArray abnrm,
                       INDArray bbnrm, INDArray rconde, INDArray rcondv );
    DataBuffer cggevx( DataBuffer matriint, char balanc, char jobvl,
                       char jobvr, char sense, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber alpha,
                       IComplexNumber beta, IComplexNumber vl,
                       DataBuffer ldvl, IComplexNumber vr,
                       DataBuffer ldvr, DataBuffer ilo, DataBuffer ihi,
                       INDArray lscale, INDArray rscale, INDArray abnrm,
                       INDArray bbnrm, INDArray rconde, INDArray rcondv );
    DataBuffer zggevx( DataBuffer matriint, char balanc, char jobvl,
                       char jobvr, char sense, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber alpha,
                       IComplexNumber beta,
                       IComplexNumber vl, DataBuffer ldvl,
                       IComplexNumber vr, DataBuffer ldvr,
                       DataBuffer ilo, DataBuffer ihi, INDArray lscale,
                       INDArray rscale, INDArray abnrm, INDArray bbnrm,
                       INDArray rconde, INDArray rcondv );

    DataBuffer sggglm( DataBuffer matriint, DataBuffer n, DataBuffer m,
                       DataBuffer p, INDArray a, DataBuffer lda, INDArray b,
                       DataBuffer ldb, INDArray d, INDArray x, INDArray y );
    DataBuffer dggglm( DataBuffer matriint, DataBuffer n, DataBuffer m,
                       DataBuffer p, INDArray a, DataBuffer lda, INDArray b,
                       DataBuffer ldb, INDArray d, INDArray x, INDArray y );
    DataBuffer cggglm( DataBuffer matriint, DataBuffer n, DataBuffer m,
                       DataBuffer p, IComplexNumber a,
                       DataBuffer lda, IComplexNumber b,
                       DataBuffer ldb, IComplexNumber d,
                       IComplexNumber x, IComplexNumber y );
    DataBuffer zggglm( DataBuffer matriint, DataBuffer n, DataBuffer m,
                       DataBuffer p, IComplexNumber a,
                       DataBuffer lda, IComplexNumber b,
                       DataBuffer ldb, IComplexNumber d,
                       IComplexNumber x, IComplexNumber y );

    DataBuffer sgghrd( DataBuffer matriint, char compq, char compz,
                       DataBuffer n, DataBuffer ilo, DataBuffer ihi,
                       INDArray a, DataBuffer lda, INDArray b, DataBuffer ldb,
                       INDArray q, DataBuffer ldq, INDArray z, DataBuffer ldz );
    DataBuffer dgghrd( DataBuffer matriint, char compq, char compz,
                       DataBuffer n, DataBuffer ilo, DataBuffer ihi,
                       INDArray a, DataBuffer lda, INDArray b, DataBuffer ldb,
                       INDArray q, DataBuffer ldq, INDArray z,
                       DataBuffer ldz );
    DataBuffer cgghrd( DataBuffer matriint, char compq, char compz,
                       DataBuffer n, DataBuffer ilo, DataBuffer ihi,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber q, DataBuffer ldq,
                       IComplexNumber z, DataBuffer ldz );
    DataBuffer zgghrd( DataBuffer matriint, char compq, char compz,
                       DataBuffer n, DataBuffer ilo, DataBuffer ihi,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber q, DataBuffer ldq,
                       IComplexNumber z, DataBuffer ldz );

    DataBuffer sgghd3( DataBuffer matriint, char compq, char compz,
                       DataBuffer n, DataBuffer ilo, DataBuffer ihi,
                       INDArray a, DataBuffer lda, INDArray b, DataBuffer ldb,
                       INDArray q, DataBuffer ldq, INDArray z, DataBuffer ldz );
    DataBuffer dgghd3( DataBuffer matriint, char compq, char compz,
                       DataBuffer n, DataBuffer ilo, DataBuffer ihi,
                       INDArray a, DataBuffer lda, INDArray b, DataBuffer ldb,
                       INDArray q, DataBuffer ldq, INDArray z,
                       DataBuffer ldz );
    DataBuffer cgghd3( DataBuffer matriint, char compq, char compz,
                       DataBuffer n, DataBuffer ilo, DataBuffer ihi,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber q, DataBuffer ldq,
                       IComplexNumber z, DataBuffer ldz );
    DataBuffer zgghd3( DataBuffer matriint, char compq, char compz,
                       DataBuffer n, DataBuffer ilo, DataBuffer ihi,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber q, DataBuffer ldq,
                       IComplexNumber z, DataBuffer ldz );

    DataBuffer sgglse( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer p, INDArray a, DataBuffer lda, INDArray b,
                       DataBuffer ldb, INDArray c, INDArray d, INDArray x );
    DataBuffer dgglse( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer p, INDArray a, DataBuffer lda, INDArray b,
                       DataBuffer ldb, INDArray c, INDArray d, INDArray x );
    DataBuffer cgglse( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer p, IComplexNumber a,
                       DataBuffer lda, IComplexNumber b,
                       DataBuffer ldb, IComplexNumber c,
                       IComplexNumber d, IComplexNumber x );
    DataBuffer zgglse( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer p, IComplexNumber a,
                       DataBuffer lda, IComplexNumber b,
                       DataBuffer ldb, IComplexNumber c,
                       IComplexNumber d, IComplexNumber x );

    DataBuffer sggqrf( DataBuffer matriint, DataBuffer n, DataBuffer m,
                       DataBuffer p, INDArray a, DataBuffer lda, INDArray taua,
                       INDArray b, DataBuffer ldb, INDArray taub );
    DataBuffer dggqrf( DataBuffer matriint, DataBuffer n, DataBuffer m,
                       DataBuffer p, INDArray a, DataBuffer lda,
                       INDArray taua, INDArray b, DataBuffer ldb,
                       INDArray taub );
    DataBuffer cggqrf( DataBuffer matriint, DataBuffer n, DataBuffer m,
                       DataBuffer p, IComplexNumber a,
                       DataBuffer lda, IComplexNumber taua,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber taub );
    DataBuffer zggqrf( DataBuffer matriint, DataBuffer n, DataBuffer m,
                       DataBuffer p, IComplexNumber a,
                       DataBuffer lda, IComplexNumber taua,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber taub );

    DataBuffer sggrqf( DataBuffer matriint, DataBuffer m, DataBuffer p,
                       DataBuffer n, INDArray a, DataBuffer lda, INDArray taua,
                       INDArray b, DataBuffer ldb, INDArray taub );
    DataBuffer dggrqf( DataBuffer matriint, DataBuffer m, DataBuffer p,
                       DataBuffer n, INDArray a, DataBuffer lda,
                       INDArray taua, INDArray b, DataBuffer ldb,
                       INDArray taub );
    DataBuffer cggrqf( DataBuffer matriint, DataBuffer m, DataBuffer p,
                       DataBuffer n, IComplexNumber a,
                       DataBuffer lda, IComplexNumber taua,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber taub );
    DataBuffer zggrqf( DataBuffer matriint, DataBuffer m, DataBuffer p,
                       DataBuffer n, IComplexNumber a,
                       DataBuffer lda, IComplexNumber taua,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber taub );

    DataBuffer sggsvd( DataBuffer matriint, char jobu, char jobv, char jobq,
                       DataBuffer m, DataBuffer n, DataBuffer p,
                       DataBuffer k, DataBuffer l, INDArray a,
                       DataBuffer lda, INDArray b, DataBuffer ldb,
                       INDArray alpha, INDArray beta, INDArray u, DataBuffer ldu,
                       INDArray v, DataBuffer ldv, INDArray q, DataBuffer ldq,
                       DataBuffer iwork );
    DataBuffer dggsvd( DataBuffer matriint, char jobu, char jobv, char jobq,
                       DataBuffer m, DataBuffer n, DataBuffer p,
                       DataBuffer k, DataBuffer l, INDArray a,
                       DataBuffer lda, INDArray b, DataBuffer ldb,
                       INDArray alpha, INDArray beta, INDArray u,
                       DataBuffer ldu, INDArray v, DataBuffer ldv, INDArray q,
                       DataBuffer ldq, DataBuffer iwork );
    DataBuffer cggsvd( DataBuffer matriint, char jobu, char jobv, char jobq,
                       DataBuffer m, DataBuffer n, DataBuffer p,
                       DataBuffer k, DataBuffer l,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber b, DataBuffer ldb,
                       INDArray alpha, INDArray beta, IComplexNumber u,
                       DataBuffer ldu, IComplexNumber v,
                       DataBuffer ldv, IComplexNumber q,
                       DataBuffer ldq, DataBuffer iwork );
    DataBuffer zggsvd( DataBuffer matriint, char jobu, char jobv, char jobq,
                       DataBuffer m, DataBuffer n, DataBuffer p,
                       DataBuffer k, DataBuffer l,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber b, DataBuffer ldb,
                       INDArray alpha, INDArray beta,
                       IComplexNumber u, DataBuffer ldu,
                       IComplexNumber v, DataBuffer ldv,
                       IComplexNumber q, DataBuffer ldq,
                       DataBuffer iwork );

    DataBuffer sggsvd3( DataBuffer matriint, char jobu, char jobv, char jobq,
                        DataBuffer m, DataBuffer n, DataBuffer p,
                        DataBuffer k, DataBuffer l, INDArray a,
                        DataBuffer lda, INDArray b, DataBuffer ldb,
                        INDArray alpha, INDArray beta, INDArray u, DataBuffer ldu,
                        INDArray v, DataBuffer ldv, INDArray q, DataBuffer ldq,
                        DataBuffer iwork );
    DataBuffer dggsvd3( DataBuffer matriint, char jobu, char jobv, char jobq,
                        DataBuffer m, DataBuffer n, DataBuffer p,
                        DataBuffer k, DataBuffer l, INDArray a,
                        DataBuffer lda, INDArray b, DataBuffer ldb,
                        INDArray alpha, INDArray beta, INDArray u,
                        DataBuffer ldu, INDArray v, DataBuffer ldv, INDArray q,
                        DataBuffer ldq, DataBuffer iwork );
    DataBuffer cggsvd3( DataBuffer matriint, char jobu, char jobv, char jobq,
                        DataBuffer m, DataBuffer n, DataBuffer p,
                        DataBuffer k, DataBuffer l,
                        IComplexNumber a, DataBuffer lda,
                        IComplexNumber b, DataBuffer ldb,
                        INDArray alpha, INDArray beta, IComplexNumber u,
                        DataBuffer ldu, IComplexNumber v,
                        DataBuffer ldv, IComplexNumber q,
                        DataBuffer ldq, DataBuffer iwork );
    DataBuffer zggsvd3( DataBuffer matriint, char jobu, char jobv, char jobq,
                        DataBuffer m, DataBuffer n, DataBuffer p,
                        DataBuffer k, DataBuffer l,
                        IComplexNumber a, DataBuffer lda,
                        IComplexNumber b, DataBuffer ldb,
                        INDArray alpha, INDArray beta,
                        IComplexNumber u, DataBuffer ldu,
                        IComplexNumber v, DataBuffer ldv,
                        IComplexNumber q, DataBuffer ldq,
                        DataBuffer iwork );

    DataBuffer sggsvp( DataBuffer matriint, char jobu, char jobv, char jobq,
                       DataBuffer m, DataBuffer p, DataBuffer n, INDArray a,
                       DataBuffer lda, INDArray b, DataBuffer ldb, float tola,
                       float tolb, DataBuffer k, DataBuffer l, INDArray u,
                       DataBuffer ldu, INDArray v, DataBuffer ldv, INDArray q,
                       DataBuffer ldq );
    DataBuffer dggsvp( DataBuffer matriint, char jobu, char jobv, char jobq,
                       DataBuffer m, DataBuffer p, DataBuffer n, INDArray a,
                       DataBuffer lda, INDArray b, DataBuffer ldb,
                       double tola, double tolb, DataBuffer k,
                       DataBuffer l, INDArray u, DataBuffer ldu, INDArray v,
                       DataBuffer ldv, INDArray q, DataBuffer ldq );
    DataBuffer cggsvp( DataBuffer matriint, char jobu, char jobv, char jobq,
                       DataBuffer m, DataBuffer p, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber b, DataBuffer ldb, float tola,
                       float tolb, DataBuffer k, DataBuffer l,
                       IComplexNumber u, DataBuffer ldu,
                       IComplexNumber v, DataBuffer ldv,
                       IComplexNumber q, DataBuffer ldq );
    DataBuffer zggsvp( DataBuffer matriint, char jobu, char jobv, char jobq,
                       DataBuffer m, DataBuffer p, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber b, DataBuffer ldb,
                       double tola, double tolb, DataBuffer k,
                       DataBuffer l, IComplexNumber u,
                       DataBuffer ldu, IComplexNumber v,
                       DataBuffer ldv, IComplexNumber q,
                       DataBuffer ldq );

    DataBuffer sggsvp3( DataBuffer matriint, char jobu, char jobv, char jobq,
                        DataBuffer m, DataBuffer p, DataBuffer n, INDArray a,
                        DataBuffer lda, INDArray b, DataBuffer ldb, float tola,
                        float tolb, DataBuffer k, DataBuffer l, INDArray u,
                        DataBuffer ldu, INDArray v, DataBuffer ldv, INDArray q,
                        DataBuffer ldq );
    DataBuffer dggsvp3( DataBuffer matriint, char jobu, char jobv, char jobq,
                        DataBuffer m, DataBuffer p, DataBuffer n, INDArray a,
                        DataBuffer lda, INDArray b, DataBuffer ldb,
                        double tola, double tolb, DataBuffer k,
                        DataBuffer l, INDArray u, DataBuffer ldu, INDArray v,
                        DataBuffer ldv, INDArray q, DataBuffer ldq );
    DataBuffer cggsvp3( DataBuffer matriint, char jobu, char jobv, char jobq,
                        DataBuffer m, DataBuffer p, DataBuffer n,
                        IComplexNumber a, DataBuffer lda,
                        IComplexNumber b, DataBuffer ldb, float tola,
                        float tolb, DataBuffer k, DataBuffer l,
                        IComplexNumber u, DataBuffer ldu,
                        IComplexNumber v, DataBuffer ldv,
                        IComplexNumber q, DataBuffer ldq );
    DataBuffer zggsvp3( DataBuffer matriint, char jobu, char jobv, char jobq,
                        DataBuffer m, DataBuffer p, DataBuffer n,
                        IComplexNumber a, DataBuffer lda,
                        IComplexNumber b, DataBuffer ldb,
                        double tola, double tolb, DataBuffer k,
                        DataBuffer l, IComplexNumber u,
                        DataBuffer ldu, IComplexNumber v,
                        DataBuffer ldv, IComplexNumber q,
                        DataBuffer ldq );

    DataBuffer sgtcon( char norm, DataBuffer n,  INDArray dl,
                       INDArray d,  INDArray du,  INDArray du2,
                       DataBuffer ipiv, float anorm, INDArray rcond );
    DataBuffer dgtcon( char norm, DataBuffer n,  INDArray dl,
                       INDArray d,  INDArray du,  INDArray du2,
                       DataBuffer ipiv, double anorm,
                       INDArray rcond );
    DataBuffer cgtcon( char norm, DataBuffer n,
                       IComplexNumber dl,
                       IComplexNumber d,
                       IComplexNumber du,
                       IComplexNumber du2,
                       DataBuffer ipiv, float anorm, INDArray rcond );
    DataBuffer zgtcon( char norm, DataBuffer n,
                       IComplexNumber dl,
                       IComplexNumber d,
                       IComplexNumber du,
                       IComplexNumber du2,
                       DataBuffer ipiv, double anorm,
                       INDArray rcond );

    DataBuffer sgtrfs( DataBuffer matriint, char trans, DataBuffer n,
                       DataBuffer nrhs,  INDArray dl,  INDArray d,
                       INDArray du,  INDArray dlf,  INDArray df,
                       INDArray duf,  INDArray du2,
                       DataBuffer ipiv,  INDArray b,
                       DataBuffer ldb, INDArray x, DataBuffer ldx,
                       INDArray ferr, INDArray berr );
    DataBuffer dgtrfs( DataBuffer matriint, char trans, DataBuffer n,
                       DataBuffer nrhs,  INDArray dl,  INDArray d,
                       INDArray du,  INDArray dlf,
                       INDArray df,  INDArray duf,
                       INDArray du2,  DataBuffer ipiv,
                       INDArray b, DataBuffer ldb, INDArray x,
                       DataBuffer ldx, INDArray ferr, INDArray berr );
    DataBuffer cgtrfs( DataBuffer matriint, char trans, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber dl,
                       IComplexNumber d,
                       IComplexNumber du,
                       IComplexNumber dlf,
                       IComplexNumber df,
                       IComplexNumber duf,
                       IComplexNumber du2,
                       DataBuffer ipiv,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx, INDArray ferr,
                       INDArray berr );
    DataBuffer zgtrfs( DataBuffer matriint, char trans, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber dl,
                       IComplexNumber d,
                       IComplexNumber du,
                       IComplexNumber dlf,
                       IComplexNumber df,
                       IComplexNumber duf,
                       IComplexNumber du2,
                       DataBuffer ipiv,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx,
                       INDArray ferr, INDArray berr );

    DataBuffer sgtsv( DataBuffer matriint, DataBuffer n, DataBuffer nrhs,
                      INDArray dl, INDArray d, INDArray du, INDArray b,
                      DataBuffer ldb );
    DataBuffer dgtsv( DataBuffer matriint, DataBuffer n, DataBuffer nrhs,
                      INDArray dl, INDArray d, INDArray du, INDArray b,
                      DataBuffer ldb );
    DataBuffer cgtsv( DataBuffer matriint, DataBuffer n, DataBuffer nrhs,
                      IComplexNumber dl, IComplexNumber d,
                      IComplexNumber du, IComplexNumber b,
                      DataBuffer ldb );
    DataBuffer zgtsv( DataBuffer matriint, DataBuffer n, DataBuffer nrhs,
                      IComplexNumber dl, IComplexNumber d,
                      IComplexNumber du, IComplexNumber b,
                      DataBuffer ldb );

    DataBuffer sgtsvx( DataBuffer matriint, char fact, char trans,
                       DataBuffer n, DataBuffer nrhs,  INDArray dl,
                       INDArray d,  INDArray du, INDArray dlf,
                       INDArray df, INDArray duf, INDArray du2, DataBuffer ipiv,
                       INDArray b, DataBuffer ldb, INDArray x,
                       DataBuffer ldx, INDArray rcond, INDArray ferr,
                       INDArray berr );
    DataBuffer dgtsvx( DataBuffer matriint, char fact, char trans,
                       DataBuffer n, DataBuffer nrhs,  INDArray dl,
                       INDArray d,  INDArray du, INDArray dlf,
                       INDArray df, INDArray duf, INDArray du2,
                       DataBuffer ipiv,  INDArray b, DataBuffer ldb,
                       INDArray x, DataBuffer ldx, INDArray rcond,
                       INDArray ferr, INDArray berr );
    DataBuffer cgtsvx( DataBuffer matriint, char fact, char trans,
                       DataBuffer n, DataBuffer nrhs,
                       IComplexNumber dl,
                       IComplexNumber d,
                       IComplexNumber du,
                       IComplexNumber dlf, IComplexNumber df,
                       IComplexNumber duf, IComplexNumber du2,
                       DataBuffer ipiv,  IComplexNumber b,
                       DataBuffer ldb, IComplexNumber x,
                       DataBuffer ldx, INDArray rcond, INDArray ferr,
                       INDArray berr );
    DataBuffer zgtsvx( DataBuffer matriint, char fact, char trans,
                       DataBuffer n, DataBuffer nrhs,
                       IComplexNumber dl,
                       IComplexNumber d,
                       IComplexNumber du,
                       IComplexNumber dlf,
                       IComplexNumber df,
                       IComplexNumber duf,
                       IComplexNumber du2, DataBuffer ipiv,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx,
                       INDArray rcond, INDArray ferr, INDArray berr );

    DataBuffer sgttrf( DataBuffer n, INDArray dl, INDArray d, INDArray du,
                       INDArray du2, DataBuffer ipiv );
    DataBuffer dgttrf( DataBuffer n, INDArray dl, INDArray d, INDArray du,
                       INDArray du2, DataBuffer ipiv );
    DataBuffer cgttrf( DataBuffer n, IComplexNumber dl,
                       IComplexNumber d, IComplexNumber du,
                       IComplexNumber du2, DataBuffer ipiv );
    DataBuffer zgttrf( DataBuffer n, IComplexNumber dl,
                       IComplexNumber d, IComplexNumber du,
                       IComplexNumber du2, DataBuffer ipiv );

    DataBuffer sgttrs( DataBuffer matriint, char trans, DataBuffer n,
                       DataBuffer nrhs,  INDArray dl,  INDArray d,
                       INDArray du,  INDArray du2,
                       DataBuffer ipiv, INDArray b, DataBuffer ldb );
    DataBuffer dgttrs( DataBuffer matriint, char trans, DataBuffer n,
                       DataBuffer nrhs,  INDArray dl,  INDArray d,
                       INDArray du,  INDArray du2,
                       DataBuffer ipiv, INDArray b, DataBuffer ldb );
    DataBuffer cgttrs( DataBuffer matriint, char trans, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber dl,
                       IComplexNumber d,
                       IComplexNumber du,
                       IComplexNumber du2,
                       DataBuffer ipiv, IComplexNumber b,
                       DataBuffer ldb );
    DataBuffer zgttrs( DataBuffer matriint, char trans, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber dl,
                       IComplexNumber d,
                       IComplexNumber du,
                       IComplexNumber du2,
                       DataBuffer ipiv, IComplexNumber b,
                       DataBuffer ldb );

    DataBuffer chbev( DataBuffer matriint, char jobz, char uplo, DataBuffer n,
                      DataBuffer kd, IComplexNumber ab,
                      DataBuffer ldab, INDArray w, IComplexNumber z,
                      DataBuffer ldz );
    DataBuffer zhbev( DataBuffer matriint, char jobz, char uplo, DataBuffer n,
                      DataBuffer kd, IComplexNumber ab,
                      DataBuffer ldab, INDArray w, IComplexNumber z,
                      DataBuffer ldz );

    DataBuffer chbevd( DataBuffer matriint, char jobz, char uplo, DataBuffer n,
                       DataBuffer kd, IComplexNumber ab,
                       DataBuffer ldab, INDArray w, IComplexNumber z,
                       DataBuffer ldz );
    DataBuffer zhbevd( DataBuffer matriint, char jobz, char uplo, DataBuffer n,
                       DataBuffer kd, IComplexNumber ab,
                       DataBuffer ldab, INDArray w, IComplexNumber z,
                       DataBuffer ldz );

    DataBuffer chbevx( DataBuffer matriint, char jobz, char range, char uplo,
                       DataBuffer n, DataBuffer kd,
                       IComplexNumber ab, DataBuffer ldab,
                       IComplexNumber q, DataBuffer ldq, float vl,
                       float vu, DataBuffer il, DataBuffer iu, float abstol,
                       DataBuffer m, INDArray w, IComplexNumber z,
                       DataBuffer ldz, DataBuffer ifail );
    DataBuffer zhbevx( DataBuffer matriint, char jobz, char range, char uplo,
                       DataBuffer n, DataBuffer kd,
                       IComplexNumber ab, DataBuffer ldab,
                       IComplexNumber q, DataBuffer ldq, double vl,
                       double vu, DataBuffer il, DataBuffer iu,
                       double abstol, DataBuffer m, INDArray w,
                       IComplexNumber z, DataBuffer ldz,
                       DataBuffer ifail );

    DataBuffer chbgst( DataBuffer matriint, char vect, char uplo, DataBuffer n,
                       DataBuffer ka, DataBuffer kb,
                       IComplexNumber ab, DataBuffer ldab,
                       IComplexNumber bb, DataBuffer ldbb,
                       IComplexNumber x, DataBuffer ldx );
    DataBuffer zhbgst( DataBuffer matriint, char vect, char uplo, DataBuffer n,
                       DataBuffer ka, DataBuffer kb,
                       IComplexNumber ab, DataBuffer ldab,
                       IComplexNumber bb, DataBuffer ldbb,
                       IComplexNumber x, DataBuffer ldx );

    DataBuffer chbgv( DataBuffer matriint, char jobz, char uplo, DataBuffer n,
                      DataBuffer ka, DataBuffer kb,
                      IComplexNumber ab, DataBuffer ldab,
                      IComplexNumber bb, DataBuffer ldbb, INDArray w,
                      IComplexNumber z, DataBuffer ldz );
    DataBuffer zhbgv( DataBuffer matriint, char jobz, char uplo, DataBuffer n,
                      DataBuffer ka, DataBuffer kb,
                      IComplexNumber ab, DataBuffer ldab,
                      IComplexNumber bb, DataBuffer ldbb, INDArray w,
                      IComplexNumber z, DataBuffer ldz );

    DataBuffer chbgvd( DataBuffer matriint, char jobz, char uplo, DataBuffer n,
                       DataBuffer ka, DataBuffer kb,
                       IComplexNumber ab, DataBuffer ldab,
                       IComplexNumber bb, DataBuffer ldbb, INDArray w,
                       IComplexNumber z, DataBuffer ldz );
    DataBuffer zhbgvd( DataBuffer matriint, char jobz, char uplo, DataBuffer n,
                       DataBuffer ka, DataBuffer kb,
                       IComplexNumber ab, DataBuffer ldab,
                       IComplexNumber bb, DataBuffer ldbb,
                       INDArray w, IComplexNumber z,
                       DataBuffer ldz );

    DataBuffer chbgvx( DataBuffer matriint, char jobz, char range, char uplo,
                       DataBuffer n, DataBuffer ka, DataBuffer kb,
                       IComplexNumber ab, DataBuffer ldab,
                       IComplexNumber bb, DataBuffer ldbb,
                       IComplexNumber q, DataBuffer ldq, float vl,
                       float vu, DataBuffer il, DataBuffer iu, float abstol,
                       DataBuffer m, INDArray w, IComplexNumber z,
                       DataBuffer ldz, DataBuffer ifail );
    DataBuffer zhbgvx( DataBuffer matriint, char jobz, char range, char uplo,
                       DataBuffer n, DataBuffer ka, DataBuffer kb,
                       IComplexNumber ab, DataBuffer ldab,
                       IComplexNumber bb, DataBuffer ldbb,
                       IComplexNumber q, DataBuffer ldq, double vl,
                       double vu, DataBuffer il, DataBuffer iu,
                       double abstol, DataBuffer m, INDArray w,
                       IComplexNumber z, DataBuffer ldz,
                       DataBuffer ifail );

    DataBuffer chbtrd( DataBuffer matriint, char vect, char uplo, DataBuffer n,
                       DataBuffer kd, IComplexNumber ab,
                       DataBuffer ldab, INDArray d, INDArray e,
                       IComplexNumber q, DataBuffer ldq );
    DataBuffer zhbtrd( DataBuffer matriint, char vect, char uplo, DataBuffer n,
                       DataBuffer kd, IComplexNumber ab,
                       DataBuffer ldab, INDArray d, INDArray e,
                       IComplexNumber q, DataBuffer ldq );

    DataBuffer checon( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       DataBuffer ipiv, float anorm, INDArray rcond );
    DataBuffer zhecon( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       DataBuffer ipiv, double anorm,
                       INDArray rcond );

    DataBuffer cheequb( DataBuffer matriint, char uplo, DataBuffer n,
                        IComplexNumber a, DataBuffer lda,
                        INDArray s, INDArray scond, INDArray amax );
    DataBuffer zheequb( DataBuffer matriint, char uplo, DataBuffer n,
                        IComplexNumber a, DataBuffer lda,
                        INDArray s, INDArray scond, INDArray amax );

    DataBuffer cheev( DataBuffer matriint, char jobz, char uplo, DataBuffer n,
                      IComplexNumber a, DataBuffer lda, INDArray w );
    DataBuffer zheev( DataBuffer matriint, char jobz, char uplo, DataBuffer n,
                      IComplexNumber a, DataBuffer lda, INDArray w );

    DataBuffer cheevd( DataBuffer matriint, char jobz, char uplo, DataBuffer n,
                       IComplexNumber a, DataBuffer lda, INDArray w );
    DataBuffer zheevd( DataBuffer matriint, char jobz, char uplo, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       INDArray w );

    DataBuffer cheevr( DataBuffer matriint, char jobz, char range, char uplo,
                       DataBuffer n, IComplexNumber a,
                       DataBuffer lda, float vl, float vu, DataBuffer il,
                       DataBuffer iu, float abstol, DataBuffer m, INDArray w,
                       IComplexNumber z, DataBuffer ldz,
                       DataBuffer isuppz );
    DataBuffer zheevr( DataBuffer matriint, char jobz, char range, char uplo,
                       DataBuffer n, IComplexNumber a,
                       DataBuffer lda, double vl, double vu, DataBuffer il,
                       DataBuffer iu, double abstol, DataBuffer m,
                       INDArray w, IComplexNumber z, DataBuffer ldz,
                       DataBuffer isuppz );

    DataBuffer cheevx( DataBuffer matriint, char jobz, char range, char uplo,
                       DataBuffer n, IComplexNumber a,
                       DataBuffer lda, float vl, float vu, DataBuffer il,
                       DataBuffer iu, float abstol, DataBuffer m, INDArray w,
                       IComplexNumber z, DataBuffer ldz,
                       DataBuffer ifail );
    DataBuffer zheevx( DataBuffer matriint, char jobz, char range, char uplo,
                       DataBuffer n, IComplexNumber a,
                       DataBuffer lda, double vl, double vu, DataBuffer il,
                       DataBuffer iu, double abstol, DataBuffer m,
                       INDArray w, IComplexNumber z, DataBuffer ldz,
                       DataBuffer ifail );

    DataBuffer chegst( DataBuffer matriint, DataBuffer itype, char uplo,
                       DataBuffer n, IComplexNumber a,
                       DataBuffer lda,  IComplexNumber b,
                       DataBuffer ldb );
    DataBuffer zhegst( DataBuffer matriint, DataBuffer itype, char uplo,
                       DataBuffer n, IComplexNumber a,
                       DataBuffer lda,  IComplexNumber b,
                       DataBuffer ldb );

    DataBuffer chegv( DataBuffer matriint, DataBuffer itype, char jobz,
                      char uplo, DataBuffer n, IComplexNumber a,
                      DataBuffer lda, IComplexNumber b,
                      DataBuffer ldb, INDArray w );
    DataBuffer zhegv( DataBuffer matriint, DataBuffer itype, char jobz,
                      char uplo, DataBuffer n, IComplexNumber a,
                      DataBuffer lda, IComplexNumber b,
                      DataBuffer ldb, INDArray w );

    DataBuffer chegvd( DataBuffer matriint, DataBuffer itype, char jobz,
                       char uplo, DataBuffer n, IComplexNumber a,
                       DataBuffer lda, IComplexNumber b,
                       DataBuffer ldb, INDArray w );
    DataBuffer zhegvd( DataBuffer matriint, DataBuffer itype, char jobz,
                       char uplo, DataBuffer n, IComplexNumber a,
                       DataBuffer lda, IComplexNumber b,
                       DataBuffer ldb, INDArray w );

    DataBuffer chegvx( DataBuffer matriint, DataBuffer itype, char jobz,
                       char range, char uplo, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber b, DataBuffer ldb, float vl,
                       float vu, DataBuffer il, DataBuffer iu, float abstol,
                       DataBuffer m, INDArray w, IComplexNumber z,
                       DataBuffer ldz, DataBuffer ifail );
    DataBuffer zhegvx( DataBuffer matriint, DataBuffer itype, char jobz,
                       char range, char uplo, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber b, DataBuffer ldb, double vl,
                       double vu, DataBuffer il, DataBuffer iu,
                       double abstol, DataBuffer m, INDArray w,
                       IComplexNumber z, DataBuffer ldz,
                       DataBuffer ifail );

    DataBuffer cherfs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber a,
                       DataBuffer lda,  IComplexNumber af,
                       DataBuffer ldaf,  DataBuffer ipiv,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx, INDArray ferr,
                       INDArray berr );
    DataBuffer zherfs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber a,
                       DataBuffer lda,  IComplexNumber af,
                       DataBuffer ldaf,  DataBuffer ipiv,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx,
                       INDArray ferr, INDArray berr );

    DataBuffer cherfsx( DataBuffer matriint, char uplo, char equed,
                        DataBuffer n, DataBuffer nrhs,
                        IComplexNumber a, DataBuffer lda,
                        IComplexNumber af, DataBuffer ldaf,
                        DataBuffer ipiv,  INDArray s,
                        IComplexNumber b, DataBuffer ldb,
                        IComplexNumber x, DataBuffer ldx,
                        INDArray rcond, INDArray berr, DataBuffer int_bnds,
                        INDArray erint_norm, INDArray erint_comp,
                        DataBuffer nparams, INDArray params );
    DataBuffer zherfsx( DataBuffer matriint, char uplo, char equed,
                        DataBuffer n, DataBuffer nrhs,
                        IComplexNumber a, DataBuffer lda,
                        IComplexNumber af, DataBuffer ldaf,
                        DataBuffer ipiv,  INDArray s,
                        IComplexNumber b, DataBuffer ldb,
                        IComplexNumber x, DataBuffer ldx,
                        INDArray rcond, INDArray berr, DataBuffer int_bnds,
                        INDArray erint_norm, INDArray erint_comp,
                        DataBuffer nparams, INDArray params );

    DataBuffer chesv( DataBuffer matriint, char uplo, DataBuffer n,
                      DataBuffer nrhs, IComplexNumber a,
                      DataBuffer lda, DataBuffer ipiv,
                      IComplexNumber b, DataBuffer ldb );
    DataBuffer zhesv( DataBuffer matriint, char uplo, DataBuffer n,
                      DataBuffer nrhs, IComplexNumber a,
                      DataBuffer lda, DataBuffer ipiv,
                      IComplexNumber b, DataBuffer ldb );

    DataBuffer chesvx( DataBuffer matriint, char fact, char uplo, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber a,
                       DataBuffer lda, IComplexNumber af,
                       DataBuffer ldaf, DataBuffer ipiv,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx,
                       INDArray rcond, INDArray ferr, INDArray berr );
    DataBuffer zhesvx( DataBuffer matriint, char fact, char uplo, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber a,
                       DataBuffer lda, IComplexNumber af,
                       DataBuffer ldaf, DataBuffer ipiv,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx,
                       INDArray rcond, INDArray ferr, INDArray berr );

    DataBuffer chesvxx( DataBuffer matriint, char fact, char uplo,
                        DataBuffer n, DataBuffer nrhs,
                        IComplexNumber a, DataBuffer lda,
                        IComplexNumber af, DataBuffer ldaf,
                        DataBuffer ipiv, String equed, INDArray s,
                        IComplexNumber b, DataBuffer ldb,
                        IComplexNumber x, DataBuffer ldx,
                        INDArray rcond, INDArray rpvgrw, INDArray berr,
                        DataBuffer int_bnds, INDArray erint_norm,
                        INDArray erint_comp, DataBuffer nparams,
                        INDArray params );
    DataBuffer zhesvxx( DataBuffer matriint, char fact, char uplo,
                        DataBuffer n, DataBuffer nrhs,
                        IComplexNumber a, DataBuffer lda,
                        IComplexNumber af, DataBuffer ldaf,
                        DataBuffer ipiv, String equed, INDArray s,
                        IComplexNumber b, DataBuffer ldb,
                        IComplexNumber x, DataBuffer ldx,
                        INDArray rcond, INDArray rpvgrw, INDArray berr,
                        DataBuffer int_bnds, INDArray erint_norm,
                        INDArray erint_comp, DataBuffer nparams,
                        INDArray params );

    DataBuffer chetrd( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber a, DataBuffer lda, INDArray d,
                       INDArray e, IComplexNumber tau );
    DataBuffer zhetrd( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber a, DataBuffer lda, INDArray d,
                       INDArray e, IComplexNumber tau );

    DataBuffer chetrf( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       DataBuffer ipiv );
    DataBuffer zhetrf( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       DataBuffer ipiv );

    DataBuffer chetri( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       DataBuffer ipiv );
    DataBuffer zhetri( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       DataBuffer ipiv );

    DataBuffer chetrs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber a,
                       DataBuffer lda,  DataBuffer ipiv,
                       IComplexNumber b, DataBuffer ldb );
    DataBuffer zhetrs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber a,
                       DataBuffer lda,  DataBuffer ipiv,
                       IComplexNumber b, DataBuffer ldb );

    DataBuffer chfrk( DataBuffer matriint, char transr, char uplo, char trans,
                      DataBuffer n, DataBuffer k, float alpha,
                      IComplexNumber a, DataBuffer lda,
                      float beta, IComplexNumber c );
    DataBuffer zhfrk( DataBuffer matriint, char transr, char uplo, char trans,
                      DataBuffer n, DataBuffer k, double alpha,
                      IComplexNumber a, DataBuffer lda,
                      double beta, IComplexNumber c );

    DataBuffer shgeqz( DataBuffer matriint, char job, char compq, char compz,
                       DataBuffer n, DataBuffer ilo, DataBuffer ihi,
                       INDArray h, DataBuffer ldh, INDArray t, DataBuffer ldt,
                       INDArray alphar, INDArray alphai, INDArray beta, INDArray q,
                       DataBuffer ldq, INDArray z, DataBuffer ldz );
    DataBuffer dhgeqz( DataBuffer matriint, char job, char compq, char compz,
                       DataBuffer n, DataBuffer ilo, DataBuffer ihi,
                       INDArray h, DataBuffer ldh, INDArray t, DataBuffer ldt,
                       INDArray alphar, INDArray alphai, INDArray beta,
                       INDArray q, DataBuffer ldq, INDArray z,
                       DataBuffer ldz );
    DataBuffer chgeqz( DataBuffer matriint, char job, char compq, char compz,
                       DataBuffer n, DataBuffer ilo, DataBuffer ihi,
                       IComplexNumber h, DataBuffer ldh,
                       IComplexNumber t, DataBuffer ldt,
                       IComplexNumber alpha,
                       IComplexNumber beta, IComplexNumber q,
                       DataBuffer ldq, IComplexNumber z,
                       DataBuffer ldz );
    DataBuffer zhgeqz( DataBuffer matriint, char job, char compq, char compz,
                       DataBuffer n, DataBuffer ilo, DataBuffer ihi,
                       IComplexNumber h, DataBuffer ldh,
                       IComplexNumber t, DataBuffer ldt,
                       IComplexNumber alpha,
                       IComplexNumber beta,
                       IComplexNumber q, DataBuffer ldq,
                       IComplexNumber z, DataBuffer ldz );

    DataBuffer chpcon( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber ap,
                       DataBuffer ipiv, float anorm, INDArray rcond );
    DataBuffer zhpcon( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber ap,
                       DataBuffer ipiv, double anorm,
                       INDArray rcond );

    DataBuffer chpev( DataBuffer matriint, char jobz, char uplo, DataBuffer n,
                      IComplexNumber ap, INDArray w,
                      IComplexNumber z, DataBuffer ldz );
    DataBuffer zhpev( DataBuffer matriint, char jobz, char uplo, DataBuffer n,
                      IComplexNumber ap, INDArray w,
                      IComplexNumber z, DataBuffer ldz );

    DataBuffer chpevd( DataBuffer matriint, char jobz, char uplo, DataBuffer n,
                       IComplexNumber ap, INDArray w,
                       IComplexNumber z, DataBuffer ldz );
    DataBuffer zhpevd( DataBuffer matriint, char jobz, char uplo, DataBuffer n,
                       IComplexNumber ap, INDArray w,
                       IComplexNumber z, DataBuffer ldz );

    DataBuffer chpevx( DataBuffer matriint, char jobz, char range, char uplo,
                       DataBuffer n, IComplexNumber ap, float vl,
                       float vu, DataBuffer il, DataBuffer iu, float abstol,
                       DataBuffer m, INDArray w, IComplexNumber z,
                       DataBuffer ldz, DataBuffer ifail );
    DataBuffer zhpevx( DataBuffer matriint, char jobz, char range, char uplo,
                       DataBuffer n, IComplexNumber ap, double vl,
                       double vu, DataBuffer il, DataBuffer iu,
                       double abstol, DataBuffer m, INDArray w,
                       IComplexNumber z, DataBuffer ldz,
                       DataBuffer ifail );

    DataBuffer chpgst( DataBuffer matriint, DataBuffer itype, char uplo,
                       DataBuffer n, IComplexNumber ap,
                       IComplexNumber bp );
    DataBuffer zhpgst( DataBuffer matriint, DataBuffer itype, char uplo,
                       DataBuffer n, IComplexNumber ap,
                       IComplexNumber bp );

    DataBuffer chpgv( DataBuffer matriint, DataBuffer itype, char jobz,
                      char uplo, DataBuffer n, IComplexNumber ap,
                      IComplexNumber bp, INDArray w,
                      IComplexNumber z, DataBuffer ldz );
    DataBuffer zhpgv( DataBuffer matriint, DataBuffer itype, char jobz,
                      char uplo, DataBuffer n, IComplexNumber ap,
                      IComplexNumber bp, INDArray w,
                      IComplexNumber z, DataBuffer ldz );

    DataBuffer chpgvd( DataBuffer matriint, DataBuffer itype, char jobz,
                       char uplo, DataBuffer n, IComplexNumber ap,
                       IComplexNumber bp, INDArray w,
                       IComplexNumber z, DataBuffer ldz );
    DataBuffer zhpgvd( DataBuffer matriint, DataBuffer itype, char jobz,
                       char uplo, DataBuffer n, IComplexNumber ap,
                       IComplexNumber bp, INDArray w,
                       IComplexNumber z, DataBuffer ldz );

    DataBuffer chpgvx( DataBuffer matriint, DataBuffer itype, char jobz,
                       char range, char uplo, DataBuffer n,
                       IComplexNumber ap, IComplexNumber bp,
                       float vl, float vu, DataBuffer il, DataBuffer iu,
                       float abstol, DataBuffer m, INDArray w,
                       IComplexNumber z, DataBuffer ldz,
                       DataBuffer ifail );
    DataBuffer zhpgvx( DataBuffer matriint, DataBuffer itype, char jobz,
                       char range, char uplo, DataBuffer n,
                       IComplexNumber ap, IComplexNumber bp,
                       double vl, double vu, DataBuffer il, DataBuffer iu,
                       double abstol, DataBuffer m, INDArray w,
                       IComplexNumber z, DataBuffer ldz,
                       DataBuffer ifail );

    DataBuffer chprfs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber ap,
                       IComplexNumber afp,
                       DataBuffer ipiv,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx, INDArray ferr,
                       INDArray berr );
    DataBuffer zhprfs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber ap,
                       IComplexNumber afp,
                       DataBuffer ipiv,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx,
                       INDArray ferr, INDArray berr );

    DataBuffer chpsv( DataBuffer matriint, char uplo, DataBuffer n,
                      DataBuffer nrhs, IComplexNumber ap,
                      DataBuffer ipiv, IComplexNumber b,
                      DataBuffer ldb );
    DataBuffer zhpsv( DataBuffer matriint, char uplo, DataBuffer n,
                      DataBuffer nrhs, IComplexNumber ap,
                      DataBuffer ipiv, IComplexNumber b,
                      DataBuffer ldb );

    DataBuffer chpsvx( DataBuffer matriint, char fact, char uplo, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber ap,
                       IComplexNumber afp, DataBuffer ipiv,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx,
                       INDArray rcond, INDArray ferr, INDArray berr );
    DataBuffer zhpsvx( DataBuffer matriint, char fact, char uplo, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber ap,
                       IComplexNumber afp, DataBuffer ipiv,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx,
                       INDArray rcond, INDArray ferr, INDArray berr );

    DataBuffer chptrd( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber ap, INDArray d, INDArray e,
                       IComplexNumber tau );
    DataBuffer zhptrd( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber ap, INDArray d, INDArray e,
                       IComplexNumber tau );

    DataBuffer chptrf( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber ap, DataBuffer ipiv );
    DataBuffer zhptrf( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber ap, DataBuffer ipiv );

    DataBuffer chptri( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber ap,  DataBuffer ipiv );
    DataBuffer zhptri( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber ap,  DataBuffer ipiv );

    DataBuffer chptrs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber ap,
                       DataBuffer ipiv, IComplexNumber b,
                       DataBuffer ldb );
    DataBuffer zhptrs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber ap,
                       DataBuffer ipiv, IComplexNumber b,
                       DataBuffer ldb );

    DataBuffer shsein( DataBuffer matriint, char job, char eigsrc, char initv,
                       DataBuffer select, DataBuffer n,  INDArray h,
                       DataBuffer ldh, INDArray wr,  INDArray wi,
                       INDArray vl, DataBuffer ldvl, INDArray vr,
                       DataBuffer ldvr, DataBuffer mm, DataBuffer m,
                       DataBuffer ifaill, DataBuffer ifailr );
    DataBuffer dhsein( DataBuffer matriint, char job, char eigsrc, char initv,
                       DataBuffer select, DataBuffer n,
                       INDArray h, DataBuffer ldh, INDArray wr,
                       INDArray wi, INDArray vl, DataBuffer ldvl,
                       INDArray vr, DataBuffer ldvr, DataBuffer mm,
                       DataBuffer m, DataBuffer ifaill,
                       DataBuffer ifailr );
    DataBuffer chsein( DataBuffer matriint, char job, char eigsrc, char initv,
                       DataBuffer select, DataBuffer n,
                       IComplexNumber h, DataBuffer ldh,
                       IComplexNumber w, IComplexNumber vl,
                       DataBuffer ldvl, IComplexNumber vr,
                       DataBuffer ldvr, DataBuffer mm, DataBuffer m,
                       DataBuffer ifaill, DataBuffer ifailr );
    DataBuffer zhsein( DataBuffer matriint, char job, char eigsrc, char initv,
                       DataBuffer select, DataBuffer n,
                       IComplexNumber h, DataBuffer ldh,
                       IComplexNumber w, IComplexNumber vl,
                       DataBuffer ldvl, IComplexNumber vr,
                       DataBuffer ldvr, DataBuffer mm, DataBuffer m,
                       DataBuffer ifaill, DataBuffer ifailr );

    DataBuffer shseqr( DataBuffer matriint, char job, char compz, DataBuffer n,
                       DataBuffer ilo, DataBuffer ihi, INDArray h,
                       DataBuffer ldh, INDArray wr, INDArray wi, INDArray z,
                       DataBuffer ldz );
    DataBuffer dhseqr( DataBuffer matriint, char job, char compz, DataBuffer n,
                       DataBuffer ilo, DataBuffer ihi, INDArray h,
                       DataBuffer ldh, INDArray wr, INDArray wi, INDArray z,
                       DataBuffer ldz );
    DataBuffer chseqr( DataBuffer matriint, char job, char compz, DataBuffer n,
                       DataBuffer ilo, DataBuffer ihi,
                       IComplexNumber h, DataBuffer ldh,
                       IComplexNumber w, IComplexNumber z,
                       DataBuffer ldz );
    DataBuffer zhseqr( DataBuffer matriint, char job, char compz, DataBuffer n,
                       DataBuffer ilo, DataBuffer ihi,
                       IComplexNumber h, DataBuffer ldh,
                       IComplexNumber w, IComplexNumber z,
                       DataBuffer ldz );


    DataBuffer slacpy( DataBuffer matriint, char uplo, DataBuffer m,
                       DataBuffer n,  INDArray a, DataBuffer lda, INDArray b,
                       DataBuffer ldb );
    DataBuffer dlacpy( DataBuffer matriint, char uplo, DataBuffer m,
                       DataBuffer n,  INDArray a, DataBuffer lda, INDArray b,
                       DataBuffer ldb );
    DataBuffer clacpy( DataBuffer matriint, char uplo, DataBuffer m,
                       DataBuffer n,  IComplexNumber a,
                       DataBuffer lda, IComplexNumber b,
                       DataBuffer ldb );
    DataBuffer zlacpy( DataBuffer matriint, char uplo, DataBuffer m,
                       DataBuffer n,  IComplexNumber a,
                       DataBuffer lda, IComplexNumber b,
                       DataBuffer ldb );

    DataBuffer clacp2( DataBuffer matriint, char uplo, DataBuffer m,
                       DataBuffer n,  INDArray a, DataBuffer lda,
                       IComplexNumber b, DataBuffer ldb );
    DataBuffer zlacp2( DataBuffer matriint, char uplo, DataBuffer m,
                       DataBuffer n,  INDArray a, DataBuffer lda,
                       IComplexNumber b, DataBuffer ldb );

    DataBuffer zlag2c( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber sa, DataBuffer ldsa );

    DataBuffer slag2d( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       INDArray sa, DataBuffer ldsa, INDArray a,
                       DataBuffer lda );

    DataBuffer dlag2s( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       INDArray a, DataBuffer lda, INDArray sa,
                       DataBuffer ldsa );

    DataBuffer clag2z( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       IComplexNumber sa, DataBuffer ldsa,
                       IComplexNumber a, DataBuffer lda );

    DataBuffer slagge( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer kl, DataBuffer ku,  INDArray d,
                       INDArray a, DataBuffer lda, DataBuffer iseed );
    DataBuffer dlagge( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer kl, DataBuffer ku,  INDArray d,
                       INDArray a, DataBuffer lda, DataBuffer iseed );
    DataBuffer clagge( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer kl, DataBuffer ku,  INDArray d,
                       IComplexNumber a, DataBuffer lda,
                       DataBuffer iseed );
    DataBuffer zlagge( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer kl, DataBuffer ku,  INDArray d,
                       IComplexNumber a, DataBuffer lda,
                       DataBuffer iseed );

    float slamch( char cmach );
    double dlamch( char cmach );

    float slange( DataBuffer matriint, char norm, DataBuffer m,
                  DataBuffer n,  INDArray a, DataBuffer lda );
    double dlange( DataBuffer matriint, char norm, DataBuffer m,
                   DataBuffer n,  INDArray a, DataBuffer lda );
    float clange( DataBuffer matriint, char norm, DataBuffer m,
                  DataBuffer n,  IComplexNumber a,
                  DataBuffer lda );
    double zlange( DataBuffer matriint, char norm, DataBuffer m,
                   DataBuffer n,  IComplexNumber a,
                   DataBuffer lda );

    float clanhe( DataBuffer matriint, char norm, char uplo, DataBuffer n,
                  IComplexNumber a, DataBuffer lda );
    double zlanhe( DataBuffer matriint, char norm, char uplo, DataBuffer n,
                   IComplexNumber a, DataBuffer lda );

    float slansy( DataBuffer matriint, char norm, char uplo, DataBuffer n,
                  INDArray a, DataBuffer lda );
    double dlansy( DataBuffer matriint, char norm, char uplo, DataBuffer n,
                   INDArray a, DataBuffer lda );
    float clansy( DataBuffer matriint, char norm, char uplo, DataBuffer n,
                  IComplexNumber a, DataBuffer lda );
    double zlansy( DataBuffer matriint, char norm, char uplo, DataBuffer n,
                   IComplexNumber a, DataBuffer lda );

    float slantr( DataBuffer matriint, char norm, char uplo, char diag,
                  DataBuffer m, DataBuffer n,  INDArray a,
                  DataBuffer lda );
    double dlantr( DataBuffer matriint, char norm, char uplo, char diag,
                   DataBuffer m, DataBuffer n,  INDArray a,
                   DataBuffer lda );
    float clantr( DataBuffer matriint, char norm, char uplo, char diag,
                  DataBuffer m, DataBuffer n,  IComplexNumber a,
                  DataBuffer lda );
    double zlantr( DataBuffer matriint, char norm, char uplo, char diag,
                   DataBuffer m, DataBuffer n,  IComplexNumber a,
                   DataBuffer lda );


    DataBuffer slarfb( DataBuffer matriint, char side, char trans, char direct,
                       char storev, DataBuffer m, DataBuffer n,
                       DataBuffer k,  INDArray v, DataBuffer ldv,
                       INDArray t, DataBuffer ldt, INDArray c,
                       DataBuffer ldc );
    DataBuffer dlarfb( DataBuffer matriint, char side, char trans, char direct,
                       char storev, DataBuffer m, DataBuffer n,
                       DataBuffer k,  INDArray v, DataBuffer ldv,
                       INDArray t, DataBuffer ldt, INDArray c,
                       DataBuffer ldc );
    DataBuffer clarfb( DataBuffer matriint, char side, char trans, char direct,
                       char storev, DataBuffer m, DataBuffer n,
                       DataBuffer k,  IComplexNumber v,
                       DataBuffer ldv,  IComplexNumber t,
                       DataBuffer ldt, IComplexNumber c,
                       DataBuffer ldc );
    DataBuffer zlarfb( DataBuffer matriint, char side, char trans, char direct,
                       char storev, DataBuffer m, DataBuffer n,
                       DataBuffer k,  IComplexNumber v,
                       DataBuffer ldv,  IComplexNumber t,
                       DataBuffer ldt, IComplexNumber c,
                       DataBuffer ldc );



    DataBuffer slarft( DataBuffer matriint, char direct, char storev,
                       DataBuffer n, DataBuffer k,  INDArray v,
                       DataBuffer ldv,  INDArray tau, INDArray t,
                       DataBuffer ldt );
    DataBuffer dlarft( DataBuffer matriint, char direct, char storev,
                       DataBuffer n, DataBuffer k,  INDArray v,
                       DataBuffer ldv,  INDArray tau, INDArray t,
                       DataBuffer ldt );
    DataBuffer clarft( DataBuffer matriint, char direct, char storev,
                       DataBuffer n, DataBuffer k,
                       IComplexNumber v, DataBuffer ldv,
                       IComplexNumber tau,
                       IComplexNumber t, DataBuffer ldt );
    DataBuffer zlarft( DataBuffer matriint, char direct, char storev,
                       DataBuffer n, DataBuffer k,
                       IComplexNumber v, DataBuffer ldv,
                       IComplexNumber tau,
                       IComplexNumber t, DataBuffer ldt );

    DataBuffer slarfx( DataBuffer matriint, char side, DataBuffer m,
                       DataBuffer n,  INDArray v, float tau, INDArray c,
                       DataBuffer ldc, INDArray work );
    DataBuffer dlarfx( DataBuffer matriint, char side, DataBuffer m,
                       DataBuffer n,  INDArray v, double tau, INDArray c,
                       DataBuffer ldc, INDArray work );
    DataBuffer clarfx( DataBuffer matriint, char side, DataBuffer m,
                       DataBuffer n,  IComplexNumber v,
                       IComplexNumber tau, IComplexNumber c,
                       DataBuffer ldc, IComplexNumber work );
    DataBuffer zlarfx( DataBuffer matriint, char side, DataBuffer m,
                       DataBuffer n,  IComplexNumber v,
                       IComplexNumber tau, IComplexNumber c,
                       DataBuffer ldc, IComplexNumber work );



    DataBuffer slascl( DataBuffer matriint, char type, DataBuffer kl,
                       DataBuffer ku, float cfrom, float cto,
                       DataBuffer m, DataBuffer n, INDArray a,
                       DataBuffer lda );
    DataBuffer dlascl( DataBuffer matriint, char type, DataBuffer kl,
                       DataBuffer ku, double cfrom, double cto,
                       DataBuffer m, DataBuffer n, INDArray a,
                       DataBuffer lda );
    DataBuffer clascl( DataBuffer matriint, char type, DataBuffer kl,
                       DataBuffer ku, float cfrom, float cto,
                       DataBuffer m, DataBuffer n, IComplexNumber a,
                       DataBuffer lda );
    DataBuffer zlascl( DataBuffer matriint, char type, DataBuffer kl,
                       DataBuffer ku, double cfrom, double cto,
                       DataBuffer m, DataBuffer n, IComplexNumber a,
                       DataBuffer lda );

    DataBuffer slaset( DataBuffer matriint, char uplo, DataBuffer m,
                       DataBuffer n, float alpha, float beta, INDArray a,
                       DataBuffer lda );
    DataBuffer dlaset( DataBuffer matriint, char uplo, DataBuffer m,
                       DataBuffer n, double alpha, double beta, INDArray a,
                       DataBuffer lda );
    DataBuffer claset( DataBuffer matriint, char uplo, DataBuffer m,
                       DataBuffer n, IComplexNumber alpha,
                       IComplexNumber beta, IComplexNumber a,
                       DataBuffer lda );
    DataBuffer zlaset( DataBuffer matriint, char uplo, DataBuffer m,
                       DataBuffer n, IComplexNumber alpha,
                       IComplexNumber beta, IComplexNumber a,
                       DataBuffer lda );

    DataBuffer slasrt( char id, DataBuffer n, INDArray d );
    DataBuffer dlasrt( char id, DataBuffer n, INDArray d );

    DataBuffer slaswp( DataBuffer matriint, DataBuffer n, INDArray a,
                       DataBuffer lda, DataBuffer k1, DataBuffer k2,
                       DataBuffer ipiv, DataBuffer incx );
    DataBuffer dlaswp( DataBuffer matriint, DataBuffer n, INDArray a,
                       DataBuffer lda, DataBuffer k1, DataBuffer k2,
                       DataBuffer ipiv, DataBuffer incx );
    DataBuffer claswp( DataBuffer matriint, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       DataBuffer k1, DataBuffer k2,  DataBuffer ipiv,
                       DataBuffer incx );
    DataBuffer zlaswp( DataBuffer matriint, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       DataBuffer k1, DataBuffer k2,  DataBuffer ipiv,
                       DataBuffer incx );

    DataBuffer slatms( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       char dist, DataBuffer iseed, char sym, INDArray d,
                       DataBuffer mode, float cond, float dmax,
                       DataBuffer kl, DataBuffer ku, char pack, INDArray a,
                       DataBuffer lda );
    DataBuffer dlatms( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       char dist, DataBuffer iseed, char sym, INDArray d,
                       DataBuffer mode, double cond, double dmax,
                       DataBuffer kl, DataBuffer ku, char pack, INDArray a,
                       DataBuffer lda );
    DataBuffer clatms( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       char dist, DataBuffer iseed, char sym, INDArray d,
                       DataBuffer mode, float cond, float dmax,
                       DataBuffer kl, DataBuffer ku, char pack,
                       IComplexNumber a, DataBuffer lda );
    DataBuffer zlatms( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       char dist, DataBuffer iseed, char sym, INDArray d,
                       DataBuffer mode, double cond, double dmax,
                       DataBuffer kl, DataBuffer ku, char pack,
                       IComplexNumber a, DataBuffer lda );

    DataBuffer slauum( DataBuffer matriint, char uplo, DataBuffer n, INDArray a,
                       DataBuffer lda );
    DataBuffer dlauum( DataBuffer matriint, char uplo, DataBuffer n, INDArray a,
                       DataBuffer lda );
    DataBuffer clauum( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber a, DataBuffer lda );
    DataBuffer zlauum( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber a, DataBuffer lda );

    DataBuffer sopgtr( DataBuffer matriint, char uplo, DataBuffer n,
                       INDArray ap,  INDArray tau, INDArray q,
                       DataBuffer ldq );
    DataBuffer dopgtr( DataBuffer matriint, char uplo, DataBuffer n,
                       INDArray ap,  INDArray tau, INDArray q,
                       DataBuffer ldq );

    DataBuffer sopmtr( DataBuffer matriint, char side, char uplo, char trans,
                       DataBuffer m, DataBuffer n,  INDArray ap,
                       INDArray tau, INDArray c, DataBuffer ldc );
    DataBuffer dopmtr( DataBuffer matriint, char side, char uplo, char trans,
                       DataBuffer m, DataBuffer n,  INDArray ap,
                       INDArray tau, INDArray c, DataBuffer ldc );

    DataBuffer sorgbr( DataBuffer matriint, char vect, DataBuffer m,
                       DataBuffer n, DataBuffer k, INDArray a, DataBuffer lda,
                       INDArray tau );
    DataBuffer dorgbr( DataBuffer matriint, char vect, DataBuffer m,
                       DataBuffer n, DataBuffer k, INDArray a,
                       DataBuffer lda,  INDArray tau );

    DataBuffer sorghr( DataBuffer matriint, DataBuffer n, DataBuffer ilo,
                       DataBuffer ihi, INDArray a, DataBuffer lda,
                       INDArray tau );
    DataBuffer dorghr( DataBuffer matriint, DataBuffer n, DataBuffer ilo,
                       DataBuffer ihi, INDArray a, DataBuffer lda,
                       INDArray tau );

    DataBuffer sorglq( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer k, INDArray a, DataBuffer lda,
                       INDArray tau );
    DataBuffer dorglq( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer k, INDArray a, DataBuffer lda,
                       INDArray tau );

    DataBuffer sorgql( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer k, INDArray a, DataBuffer lda,
                       INDArray tau );
    DataBuffer dorgql( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer k, INDArray a, DataBuffer lda,
                       INDArray tau );

    DataBuffer sorgqr( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer k, INDArray a, DataBuffer lda,
                       INDArray tau );
    DataBuffer dorgqr( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer k, INDArray a, DataBuffer lda,
                       INDArray tau );

    DataBuffer sorgrq( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer k, INDArray a, DataBuffer lda,
                       INDArray tau );
    DataBuffer dorgrq( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer k, INDArray a, DataBuffer lda,
                       INDArray tau );

    DataBuffer sorgtr( DataBuffer matriint, char uplo, DataBuffer n, INDArray a,
                       DataBuffer lda,  INDArray tau );
    DataBuffer dorgtr( DataBuffer matriint, char uplo, DataBuffer n, INDArray a,
                       DataBuffer lda,  INDArray tau );

    DataBuffer sormbr( DataBuffer matriint, char vect, char side, char trans,
                       DataBuffer m, DataBuffer n, DataBuffer k,
                       INDArray a, DataBuffer lda,  INDArray tau,
                       INDArray c, DataBuffer ldc );
    DataBuffer dormbr( DataBuffer matriint, char vect, char side, char trans,
                       DataBuffer m, DataBuffer n, DataBuffer k,
                       INDArray a, DataBuffer lda,  INDArray tau,
                       INDArray c, DataBuffer ldc );

    DataBuffer sormhr( DataBuffer matriint, char side, char trans,
                       DataBuffer m, DataBuffer n, DataBuffer ilo,
                       DataBuffer ihi,  INDArray a, DataBuffer lda,
                       INDArray tau, INDArray c, DataBuffer ldc );
    DataBuffer dormhr( DataBuffer matriint, char side, char trans,
                       DataBuffer m, DataBuffer n, DataBuffer ilo,
                       DataBuffer ihi,  INDArray a, DataBuffer lda,
                       INDArray tau, INDArray c, DataBuffer ldc );

    DataBuffer sormlq( DataBuffer matriint, char side, char trans,
                       DataBuffer m, DataBuffer n, DataBuffer k,
                       INDArray a, DataBuffer lda,  INDArray tau,
                       INDArray c, DataBuffer ldc );
    DataBuffer dormlq( DataBuffer matriint, char side, char trans,
                       DataBuffer m, DataBuffer n, DataBuffer k,
                       INDArray a, DataBuffer lda,  INDArray tau,
                       INDArray c, DataBuffer ldc );

    DataBuffer sormql( DataBuffer matriint, char side, char trans,
                       DataBuffer m, DataBuffer n, DataBuffer k,
                       INDArray a, DataBuffer lda,  INDArray tau,
                       INDArray c, DataBuffer ldc );
    DataBuffer dormql( DataBuffer matriint, char side, char trans,
                       DataBuffer m, DataBuffer n, DataBuffer k,
                       INDArray a, DataBuffer lda,  INDArray tau,
                       INDArray c, DataBuffer ldc );

    DataBuffer sormqr( DataBuffer matriint, char side, char trans,
                       DataBuffer m, DataBuffer n, DataBuffer k,
                       INDArray a, DataBuffer lda,  INDArray tau,
                       INDArray c, DataBuffer ldc );
    DataBuffer dormqr( DataBuffer matriint, char side, char trans,
                       DataBuffer m, DataBuffer n, DataBuffer k,
                       INDArray a, DataBuffer lda,  INDArray tau,
                       INDArray c, DataBuffer ldc );

    DataBuffer sormrq( DataBuffer matriint, char side, char trans,
                       DataBuffer m, DataBuffer n, DataBuffer k,
                       INDArray a, DataBuffer lda,  INDArray tau,
                       INDArray c, DataBuffer ldc );
    DataBuffer dormrq( DataBuffer matriint, char side, char trans,
                       DataBuffer m, DataBuffer n, DataBuffer k,
                       INDArray a, DataBuffer lda,  INDArray tau,
                       INDArray c, DataBuffer ldc );

    DataBuffer sormrz( DataBuffer matriint, char side, char trans,
                       DataBuffer m, DataBuffer n, DataBuffer k,
                       DataBuffer l,  INDArray a, DataBuffer lda,
                       INDArray tau, INDArray c, DataBuffer ldc );
    DataBuffer dormrz( DataBuffer matriint, char side, char trans,
                       DataBuffer m, DataBuffer n, DataBuffer k,
                       DataBuffer l,  INDArray a, DataBuffer lda,
                       INDArray tau, INDArray c, DataBuffer ldc );

    DataBuffer sormtr( DataBuffer matriint, char side, char uplo, char trans,
                       DataBuffer m, DataBuffer n,  INDArray a,
                       DataBuffer lda,  INDArray tau, INDArray c,
                       DataBuffer ldc );
    DataBuffer dormtr( DataBuffer matriint, char side, char uplo, char trans,
                       DataBuffer m, DataBuffer n,  INDArray a,
                       DataBuffer lda,  INDArray tau, INDArray c,
                       DataBuffer ldc );

    DataBuffer spbcon( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer kd,  INDArray ab, DataBuffer ldab,
                       float anorm, INDArray rcond );
    DataBuffer dpbcon( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer kd,  INDArray ab, DataBuffer ldab,
                       double anorm, INDArray rcond );
    DataBuffer cpbcon( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer kd,  IComplexNumber ab,
                       DataBuffer ldab, float anorm, INDArray rcond );
    DataBuffer zpbcon( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer kd,  IComplexNumber ab,
                       DataBuffer ldab, double anorm, INDArray rcond );

    DataBuffer spbequ( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer kd,  INDArray ab, DataBuffer ldab,
                       INDArray s, INDArray scond, INDArray amax );
    DataBuffer dpbequ( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer kd,  INDArray ab, DataBuffer ldab,
                       INDArray s, INDArray scond, INDArray amax );
    DataBuffer cpbequ( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer kd,  IComplexNumber ab,
                       DataBuffer ldab, INDArray s, INDArray scond,
                       INDArray amax );
    DataBuffer zpbequ( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer kd,  IComplexNumber ab,
                       DataBuffer ldab, INDArray s, INDArray scond,
                       INDArray amax );

    DataBuffer spbrfs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer kd, DataBuffer nrhs,  INDArray ab,
                       DataBuffer ldab,  INDArray afb, DataBuffer ldafb,
                       INDArray b, DataBuffer ldb, INDArray x,
                       DataBuffer ldx, INDArray ferr, INDArray berr );
    DataBuffer dpbrfs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer kd, DataBuffer nrhs,  INDArray ab,
                       DataBuffer ldab,  INDArray afb, DataBuffer ldafb,
                       INDArray b, DataBuffer ldb, INDArray x,
                       DataBuffer ldx, INDArray ferr, INDArray berr );
    DataBuffer cpbrfs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer kd, DataBuffer nrhs,
                       IComplexNumber ab, DataBuffer ldab,
                       IComplexNumber afb, DataBuffer ldafb,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx, INDArray ferr,
                       INDArray berr );
    DataBuffer zpbrfs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer kd, DataBuffer nrhs,
                       IComplexNumber ab, DataBuffer ldab,
                       IComplexNumber afb, DataBuffer ldafb,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx,
                       INDArray ferr, INDArray berr );

    DataBuffer spbstf( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer kb, INDArray bb, DataBuffer ldbb );
    DataBuffer dpbstf( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer kb, INDArray bb, DataBuffer ldbb );
    DataBuffer cpbstf( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer kb, IComplexNumber bb,
                       DataBuffer ldbb );
    DataBuffer zpbstf( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer kb, IComplexNumber bb,
                       DataBuffer ldbb );

    DataBuffer spbsv( DataBuffer matriint, char uplo, DataBuffer n,
                      DataBuffer kd, DataBuffer nrhs, INDArray ab,
                      DataBuffer ldab, INDArray b, DataBuffer ldb );
    DataBuffer dpbsv( DataBuffer matriint, char uplo, DataBuffer n,
                      DataBuffer kd, DataBuffer nrhs, INDArray ab,
                      DataBuffer ldab, INDArray b, DataBuffer ldb );
    DataBuffer cpbsv( DataBuffer matriint, char uplo, DataBuffer n,
                      DataBuffer kd, DataBuffer nrhs,
                      IComplexNumber ab, DataBuffer ldab,
                      IComplexNumber b, DataBuffer ldb );
    DataBuffer zpbsv( DataBuffer matriint, char uplo, DataBuffer n,
                      DataBuffer kd, DataBuffer nrhs,
                      IComplexNumber ab, DataBuffer ldab,
                      IComplexNumber b, DataBuffer ldb );

    DataBuffer spbsvx( DataBuffer matriint, char fact, char uplo, DataBuffer n,
                       DataBuffer kd, DataBuffer nrhs, INDArray ab,
                       DataBuffer ldab, INDArray afb, DataBuffer ldafb,
                       String equed, INDArray s, INDArray b, DataBuffer ldb,
                       INDArray x, DataBuffer ldx, INDArray rcond, INDArray ferr,
                       INDArray berr );
    DataBuffer dpbsvx( DataBuffer matriint, char fact, char uplo, DataBuffer n,
                       DataBuffer kd, DataBuffer nrhs, INDArray ab,
                       DataBuffer ldab, INDArray afb, DataBuffer ldafb,
                       String equed, INDArray s, INDArray b, DataBuffer ldb,
                       INDArray x, DataBuffer ldx, INDArray rcond,
                       INDArray ferr, INDArray berr );
    DataBuffer cpbsvx( DataBuffer matriint, char fact, char uplo, DataBuffer n,
                       DataBuffer kd, DataBuffer nrhs,
                       IComplexNumber ab, DataBuffer ldab,
                       IComplexNumber afb, DataBuffer ldafb,
                       String equed, INDArray s, IComplexNumber b,
                       DataBuffer ldb, IComplexNumber x,
                       DataBuffer ldx, INDArray rcond, INDArray ferr,
                       INDArray berr );
    DataBuffer zpbsvx( DataBuffer matriint, char fact, char uplo, DataBuffer n,
                       DataBuffer kd, DataBuffer nrhs,
                       IComplexNumber ab, DataBuffer ldab,
                       IComplexNumber afb, DataBuffer ldafb,
                       String equed, INDArray s, IComplexNumber b,
                       DataBuffer ldb, IComplexNumber x,
                       DataBuffer ldx, INDArray rcond, INDArray ferr,
                       INDArray berr );

    DataBuffer spbtrf( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer kd, INDArray ab, DataBuffer ldab );
    DataBuffer dpbtrf( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer kd, INDArray ab, DataBuffer ldab );
    DataBuffer cpbtrf( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer kd, IComplexNumber ab,
                       DataBuffer ldab );
    DataBuffer zpbtrf( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer kd, IComplexNumber ab,
                       DataBuffer ldab );

    DataBuffer spbtrs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer kd, DataBuffer nrhs,  INDArray ab,
                       DataBuffer ldab, INDArray b, DataBuffer ldb );
    DataBuffer dpbtrs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer kd, DataBuffer nrhs,  INDArray ab,
                       DataBuffer ldab, INDArray b, DataBuffer ldb );
    DataBuffer cpbtrs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer kd, DataBuffer nrhs,
                       IComplexNumber ab, DataBuffer ldab,
                       IComplexNumber b, DataBuffer ldb );
    DataBuffer zpbtrs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer kd, DataBuffer nrhs,
                       IComplexNumber ab, DataBuffer ldab,
                       IComplexNumber b, DataBuffer ldb );

    DataBuffer spftrf( DataBuffer matriint, char transr, char uplo,
                       DataBuffer n, INDArray a );
    DataBuffer dpftrf( DataBuffer matriint, char transr, char uplo,
                       DataBuffer n, INDArray a );
    DataBuffer cpftrf( DataBuffer matriint, char transr, char uplo,
                       DataBuffer n, IComplexNumber a );
    DataBuffer zpftrf( DataBuffer matriint, char transr, char uplo,
                       DataBuffer n, IComplexNumber a );

    DataBuffer spftri( DataBuffer matriint, char transr, char uplo,
                       DataBuffer n, INDArray a );
    DataBuffer dpftri( DataBuffer matriint, char transr, char uplo,
                       DataBuffer n, INDArray a );
    DataBuffer cpftri( DataBuffer matriint, char transr, char uplo,
                       DataBuffer n, IComplexNumber a );
    DataBuffer zpftri( DataBuffer matriint, char transr, char uplo,
                       DataBuffer n, IComplexNumber a );

    DataBuffer spftrs( DataBuffer matriint, char transr, char uplo,
                       DataBuffer n, DataBuffer nrhs,  INDArray a,
                       INDArray b, DataBuffer ldb );
    DataBuffer dpftrs( DataBuffer matriint, char transr, char uplo,
                       DataBuffer n, DataBuffer nrhs,  INDArray a,
                       INDArray b, DataBuffer ldb );
    DataBuffer cpftrs( DataBuffer matriint, char transr, char uplo,
                       DataBuffer n, DataBuffer nrhs,
                       IComplexNumber a,
                       IComplexNumber b, DataBuffer ldb );
    DataBuffer zpftrs( DataBuffer matriint, char transr, char uplo,
                       DataBuffer n, DataBuffer nrhs,
                       IComplexNumber a,
                       IComplexNumber b, DataBuffer ldb );

    DataBuffer spocon( DataBuffer matriint, char uplo, DataBuffer n,
                       INDArray a, DataBuffer lda, float anorm,
                       INDArray rcond );
    DataBuffer dpocon( DataBuffer matriint, char uplo, DataBuffer n,
                       INDArray a, DataBuffer lda, double anorm,
                       INDArray rcond );
    DataBuffer cpocon( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       float anorm, INDArray rcond );
    DataBuffer zpocon( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       double anorm, INDArray rcond );

    DataBuffer spoequ( DataBuffer matriint, DataBuffer n,  INDArray a,
                       DataBuffer lda, INDArray s, INDArray scond,
                       INDArray amax );
    DataBuffer dpoequ( DataBuffer matriint, DataBuffer n,  INDArray a,
                       DataBuffer lda, INDArray s, INDArray scond,
                       INDArray amax );
    DataBuffer cpoequ( DataBuffer matriint, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       INDArray s, INDArray scond, INDArray amax );
    DataBuffer zpoequ( DataBuffer matriint, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       INDArray s, INDArray scond, INDArray amax );

    DataBuffer spoequb( DataBuffer matriint, DataBuffer n,  INDArray a,
                        DataBuffer lda, INDArray s, INDArray scond,
                        INDArray amax );
    DataBuffer dpoequb( DataBuffer matriint, DataBuffer n,  INDArray a,
                        DataBuffer lda, INDArray s, INDArray scond,
                        INDArray amax );
    DataBuffer cpoequb( DataBuffer matriint, DataBuffer n,
                        IComplexNumber a, DataBuffer lda,
                        INDArray s, INDArray scond, INDArray amax );
    DataBuffer zpoequb( DataBuffer matriint, DataBuffer n,
                        IComplexNumber a, DataBuffer lda,
                        INDArray s, INDArray scond, INDArray amax );

    DataBuffer sporfs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  INDArray a, DataBuffer lda,
                       INDArray af, DataBuffer ldaf,  INDArray b,
                       DataBuffer ldb, INDArray x, DataBuffer ldx,
                       INDArray ferr, INDArray berr );
    DataBuffer dporfs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  INDArray a, DataBuffer lda,
                       INDArray af, DataBuffer ldaf,  INDArray b,
                       DataBuffer ldb, INDArray x, DataBuffer ldx,
                       INDArray ferr, INDArray berr );
    DataBuffer cporfs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber a,
                       DataBuffer lda,  IComplexNumber af,
                       DataBuffer ldaf,  IComplexNumber b,
                       DataBuffer ldb, IComplexNumber x,
                       DataBuffer ldx, INDArray ferr, INDArray berr );
    DataBuffer zporfs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber a,
                       DataBuffer lda,  IComplexNumber af,
                       DataBuffer ldaf,  IComplexNumber b,
                       DataBuffer ldb, IComplexNumber x,
                       DataBuffer ldx, INDArray ferr, INDArray berr );

    DataBuffer sporfsx( DataBuffer matriint, char uplo, char equed,
                        DataBuffer n, DataBuffer nrhs,  INDArray a,
                        DataBuffer lda,  INDArray af, DataBuffer ldaf,
                        INDArray s,  INDArray b, DataBuffer ldb,
                        INDArray x, DataBuffer ldx, INDArray rcond, INDArray berr,
                        DataBuffer int_bnds, INDArray erint_norm,
                        INDArray erint_comp, DataBuffer nparams,
                        INDArray params );
    DataBuffer dporfsx( DataBuffer matriint, char uplo, char equed,
                        DataBuffer n, DataBuffer nrhs,  INDArray a,
                        DataBuffer lda,  INDArray af, DataBuffer ldaf,
                        INDArray s,  INDArray b, DataBuffer ldb,
                        INDArray x, DataBuffer ldx, INDArray rcond,
                        INDArray berr, DataBuffer int_bnds,
                        INDArray erint_norm, INDArray erint_comp,
                        DataBuffer nparams, INDArray params );
    DataBuffer cporfsx( DataBuffer matriint, char uplo, char equed,
                        DataBuffer n, DataBuffer nrhs,
                        IComplexNumber a, DataBuffer lda,
                        IComplexNumber af, DataBuffer ldaf,
                        INDArray s,  IComplexNumber b,
                        DataBuffer ldb, IComplexNumber x,
                        DataBuffer ldx, INDArray rcond, INDArray berr,
                        DataBuffer int_bnds, INDArray erint_norm,
                        INDArray erint_comp, DataBuffer nparams,
                        INDArray params );
    DataBuffer zporfsx( DataBuffer matriint, char uplo, char equed,
                        DataBuffer n, DataBuffer nrhs,
                        IComplexNumber a, DataBuffer lda,
                        IComplexNumber af, DataBuffer ldaf,
                        INDArray s,  IComplexNumber b,
                        DataBuffer ldb, IComplexNumber x,
                        DataBuffer ldx, INDArray rcond, INDArray berr,
                        DataBuffer int_bnds, INDArray erint_norm,
                        INDArray erint_comp, DataBuffer nparams,
                        INDArray params );

    DataBuffer sposv( DataBuffer matriint, char uplo, DataBuffer n,
                      DataBuffer nrhs, INDArray a, DataBuffer lda, INDArray b,
                      DataBuffer ldb );
    DataBuffer dposv( DataBuffer matriint, char uplo, DataBuffer n,
                      DataBuffer nrhs, INDArray a, DataBuffer lda, INDArray b,
                      DataBuffer ldb );
    DataBuffer cposv( DataBuffer matriint, char uplo, DataBuffer n,
                      DataBuffer nrhs, IComplexNumber a,
                      DataBuffer lda, IComplexNumber b,
                      DataBuffer ldb );
    DataBuffer zposv( DataBuffer matriint, char uplo, DataBuffer n,
                      DataBuffer nrhs, IComplexNumber a,
                      DataBuffer lda, IComplexNumber b,
                      DataBuffer ldb );
    DataBuffer dsposv( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs, INDArray a, DataBuffer lda,
                       INDArray b, DataBuffer ldb, INDArray x, DataBuffer ldx,
                       DataBuffer iter );
    DataBuffer zcposv( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs, IComplexNumber a,
                       DataBuffer lda, IComplexNumber b,
                       DataBuffer ldb, IComplexNumber x,
                       DataBuffer ldx, DataBuffer iter );

    DataBuffer sposvx( DataBuffer matriint, char fact, char uplo, DataBuffer n,
                       DataBuffer nrhs, INDArray a, DataBuffer lda, INDArray af,
                       DataBuffer ldaf, String equed, INDArray s, INDArray b,
                       DataBuffer ldb, INDArray x, DataBuffer ldx,
                       INDArray rcond, INDArray ferr, INDArray berr );
    DataBuffer dposvx( DataBuffer matriint, char fact, char uplo, DataBuffer n,
                       DataBuffer nrhs, INDArray a, DataBuffer lda,
                       INDArray af, DataBuffer ldaf, String equed, INDArray s,
                       INDArray b, DataBuffer ldb, INDArray x, DataBuffer ldx,
                       INDArray rcond, INDArray ferr, INDArray berr );
    DataBuffer cposvx( DataBuffer matriint, char fact, char uplo, DataBuffer n,
                       DataBuffer nrhs, IComplexNumber a,
                       DataBuffer lda, IComplexNumber af,
                       DataBuffer ldaf, String equed, INDArray s,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx,
                       INDArray rcond, INDArray ferr, INDArray berr );
    DataBuffer zposvx( DataBuffer matriint, char fact, char uplo, DataBuffer n,
                       DataBuffer nrhs, IComplexNumber a,
                       DataBuffer lda, IComplexNumber af,
                       DataBuffer ldaf, String equed, INDArray s,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx,
                       INDArray rcond, INDArray ferr, INDArray berr );

    DataBuffer sposvxx( DataBuffer matriint, char fact, char uplo,
                        DataBuffer n, DataBuffer nrhs, INDArray a,
                        DataBuffer lda, INDArray af, DataBuffer ldaf,
                        String equed, INDArray s, INDArray b, DataBuffer ldb,
                        INDArray x, DataBuffer ldx, INDArray rcond,
                        INDArray rpvgrw, INDArray berr, DataBuffer int_bnds,
                        INDArray erint_norm, INDArray erint_comp,
                        DataBuffer nparams, INDArray params );
    DataBuffer dposvxx( DataBuffer matriint, char fact, char uplo,
                        DataBuffer n, DataBuffer nrhs, INDArray a,
                        DataBuffer lda, INDArray af, DataBuffer ldaf,
                        String equed, INDArray s, INDArray b, DataBuffer ldb,
                        INDArray x, DataBuffer ldx, INDArray rcond,
                        INDArray rpvgrw, INDArray berr, DataBuffer int_bnds,
                        INDArray erint_norm, INDArray erint_comp,
                        DataBuffer nparams, INDArray params );
    DataBuffer cposvxx( DataBuffer matriint, char fact, char uplo,
                        DataBuffer n, DataBuffer nrhs,
                        IComplexNumber a, DataBuffer lda,
                        IComplexNumber af, DataBuffer ldaf,
                        String equed, INDArray s, IComplexNumber b,
                        DataBuffer ldb, IComplexNumber x,
                        DataBuffer ldx, INDArray rcond, INDArray rpvgrw,
                        INDArray berr, DataBuffer int_bnds,
                        INDArray erint_norm, INDArray erint_comp,
                        DataBuffer nparams, INDArray params );
    DataBuffer zposvxx( DataBuffer matriint, char fact, char uplo,
                        DataBuffer n, DataBuffer nrhs,
                        IComplexNumber a, DataBuffer lda,
                        IComplexNumber af, DataBuffer ldaf,
                        String equed, INDArray s, IComplexNumber b,
                        DataBuffer ldb, IComplexNumber x,
                        DataBuffer ldx, INDArray rcond, INDArray rpvgrw,
                        INDArray berr, DataBuffer int_bnds,
                        INDArray erint_norm, INDArray erint_comp,
                        DataBuffer nparams, INDArray params );

    DataBuffer spotrf2( DataBuffer matriint, char uplo, DataBuffer n, INDArray a,
                        DataBuffer lda );
    DataBuffer dpotrf2( DataBuffer matriint, char uplo, DataBuffer n, INDArray a,
                        DataBuffer lda );
    DataBuffer cpotrf2( DataBuffer matriint, char uplo, DataBuffer n,
                        IComplexNumber a, DataBuffer lda );
    DataBuffer zpotrf2( DataBuffer matriint, char uplo, DataBuffer n,
                        IComplexNumber a, DataBuffer lda );

    DataBuffer spotrf( DataBuffer matriint, char uplo, DataBuffer n, INDArray a,
                       DataBuffer lda );
    DataBuffer dpotrf( DataBuffer matriint, char uplo, DataBuffer n, INDArray a,
                       DataBuffer lda );
    DataBuffer cpotrf( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber a, DataBuffer lda );
    DataBuffer zpotrf( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber a, DataBuffer lda );

    DataBuffer spotri( DataBuffer matriint, char uplo, DataBuffer n, INDArray a,
                       DataBuffer lda );
    DataBuffer dpotri( DataBuffer matriint, char uplo, DataBuffer n, INDArray a,
                       DataBuffer lda );
    DataBuffer cpotri( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber a, DataBuffer lda );
    DataBuffer zpotri( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber a, DataBuffer lda );

    DataBuffer spotrs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  INDArray a, DataBuffer lda,
                       INDArray b, DataBuffer ldb );
    DataBuffer dpotrs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  INDArray a, DataBuffer lda,
                       INDArray b, DataBuffer ldb );
    DataBuffer cpotrs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber a,
                       DataBuffer lda, IComplexNumber b,
                       DataBuffer ldb );
    DataBuffer zpotrs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber a,
                       DataBuffer lda, IComplexNumber b,
                       DataBuffer ldb );

    DataBuffer sppcon( DataBuffer matriint, char uplo, DataBuffer n,
                       INDArray ap, float anorm, INDArray rcond );
    DataBuffer dppcon( DataBuffer matriint, char uplo, DataBuffer n,
                       INDArray ap, double anorm, INDArray rcond );
    DataBuffer cppcon( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber ap, float anorm,
                       INDArray rcond );
    DataBuffer zppcon( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber ap, double anorm,
                       INDArray rcond );

    DataBuffer sppequ( DataBuffer matriint, char uplo, DataBuffer n,
                       INDArray ap, INDArray s, INDArray scond,
                       INDArray amax );
    DataBuffer dppequ( DataBuffer matriint, char uplo, DataBuffer n,
                       INDArray ap, INDArray s, INDArray scond,
                       INDArray amax );
    DataBuffer cppequ( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber ap, INDArray s,
                       INDArray scond, INDArray amax );
    DataBuffer zppequ( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber ap, INDArray s,
                       INDArray scond, INDArray amax );

    DataBuffer spprfs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  INDArray ap,  INDArray afp,
                       INDArray b, DataBuffer ldb, INDArray x,
                       DataBuffer ldx, INDArray ferr, INDArray berr );
    DataBuffer dpprfs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  INDArray ap,  INDArray afp,
                       INDArray b, DataBuffer ldb, INDArray x,
                       DataBuffer ldx, INDArray ferr, INDArray berr );
    DataBuffer cpprfs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber ap,
                       IComplexNumber afp,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx, INDArray ferr,
                       INDArray berr );
    DataBuffer zpprfs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber ap,
                       IComplexNumber afp,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx,
                       INDArray ferr, INDArray berr );

    DataBuffer sppsv( DataBuffer matriint, char uplo, DataBuffer n,
                      DataBuffer nrhs, INDArray ap, INDArray b,
                      DataBuffer ldb );
    DataBuffer dppsv( DataBuffer matriint, char uplo, DataBuffer n,
                      DataBuffer nrhs, INDArray ap, INDArray b,
                      DataBuffer ldb );
    DataBuffer cppsv( DataBuffer matriint, char uplo, DataBuffer n,
                      DataBuffer nrhs, IComplexNumber ap,
                      IComplexNumber b, DataBuffer ldb );
    DataBuffer zppsv( DataBuffer matriint, char uplo, DataBuffer n,
                      DataBuffer nrhs, IComplexNumber ap,
                      IComplexNumber b, DataBuffer ldb );

    DataBuffer sppsvx( DataBuffer matriint, char fact, char uplo, DataBuffer n,
                       DataBuffer nrhs, INDArray ap, INDArray afp, String equed,
                       INDArray s, INDArray b, DataBuffer ldb, INDArray x,
                       DataBuffer ldx, INDArray rcond, INDArray ferr,
                       INDArray berr );
    DataBuffer dppsvx( DataBuffer matriint, char fact, char uplo, DataBuffer n,
                       DataBuffer nrhs, INDArray ap, INDArray afp,
                       String equed, INDArray s, INDArray b, DataBuffer ldb,
                       INDArray x, DataBuffer ldx, INDArray rcond,
                       INDArray ferr, INDArray berr );
    DataBuffer cppsvx( DataBuffer matriint, char fact, char uplo, DataBuffer n,
                       DataBuffer nrhs, IComplexNumber ap,
                       IComplexNumber afp, String equed, INDArray s,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx,
                       INDArray rcond, INDArray ferr, INDArray berr );
    DataBuffer zppsvx( DataBuffer matriint, char fact, char uplo, DataBuffer n,
                       DataBuffer nrhs, IComplexNumber ap,
                       IComplexNumber afp, String equed, INDArray s,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx,
                       INDArray rcond, INDArray ferr, INDArray berr );

    DataBuffer spptrf( DataBuffer matriint, char uplo, DataBuffer n,
                       INDArray ap );
    DataBuffer dpptrf( DataBuffer matriint, char uplo, DataBuffer n,
                       INDArray ap );
    DataBuffer cpptrf( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber ap );
    DataBuffer zpptrf( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber ap );

    DataBuffer spptri( DataBuffer matriint, char uplo, DataBuffer n,
                       INDArray ap );
    DataBuffer dpptri( DataBuffer matriint, char uplo, DataBuffer n,
                       INDArray ap );
    DataBuffer cpptri( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber ap );
    DataBuffer zpptri( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber ap );

    DataBuffer spptrs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  INDArray ap, INDArray b,
                       DataBuffer ldb );
    DataBuffer dpptrs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  INDArray ap, INDArray b,
                       DataBuffer ldb );
    DataBuffer cpptrs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber ap,
                       IComplexNumber b, DataBuffer ldb );
    DataBuffer zpptrs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber ap,
                       IComplexNumber b, DataBuffer ldb );

    DataBuffer spstrf( DataBuffer matriint, char uplo, DataBuffer n, INDArray a,
                       DataBuffer lda, DataBuffer piv, DataBuffer rank,
                       float tol );
    DataBuffer dpstrf( DataBuffer matriint, char uplo, DataBuffer n, INDArray a,
                       DataBuffer lda, DataBuffer piv, DataBuffer rank,
                       double tol );
    DataBuffer cpstrf( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       DataBuffer piv, DataBuffer rank, float tol );
    DataBuffer zpstrf( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       DataBuffer piv, DataBuffer rank, double tol );

    DataBuffer sptcon( DataBuffer n,  INDArray d,  INDArray e,
                       float anorm, INDArray rcond );
    DataBuffer dptcon( DataBuffer n,  INDArray d,  INDArray e,
                       double anorm, INDArray rcond );
    DataBuffer cptcon( DataBuffer n,  INDArray d,
                       IComplexNumber e, float anorm,
                       INDArray rcond );
    DataBuffer zptcon( DataBuffer n,  INDArray d,
                       IComplexNumber e, double anorm,
                       INDArray rcond );

    DataBuffer spteqr( DataBuffer matriint, char compz, DataBuffer n, INDArray d,
                       INDArray e, INDArray z, DataBuffer ldz );
    DataBuffer dpteqr( DataBuffer matriint, char compz, DataBuffer n,
                       INDArray d, INDArray e, INDArray z, DataBuffer ldz );
    DataBuffer cpteqr( DataBuffer matriint, char compz, DataBuffer n, INDArray d,
                       INDArray e, IComplexNumber z, DataBuffer ldz );
    DataBuffer zpteqr( DataBuffer matriint, char compz, DataBuffer n,
                       INDArray d, INDArray e, IComplexNumber z,
                       DataBuffer ldz );

    DataBuffer sptrfs( DataBuffer matriint, DataBuffer n, DataBuffer nrhs,
                       INDArray d,  INDArray e,  INDArray df,
                       INDArray ef,  INDArray b, DataBuffer ldb,
                       INDArray x, DataBuffer ldx, INDArray ferr, INDArray berr );
    DataBuffer dptrfs( DataBuffer matriint, DataBuffer n, DataBuffer nrhs,
                       INDArray d,  INDArray e,  INDArray df,
                       INDArray ef,  INDArray b, DataBuffer ldb,
                       INDArray x, DataBuffer ldx, INDArray ferr,
                       INDArray berr );
    DataBuffer cptrfs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  INDArray d,
                       IComplexNumber e,  INDArray df,
                       IComplexNumber ef,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx, INDArray ferr,
                       INDArray berr );
    DataBuffer zptrfs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  INDArray d,
                       IComplexNumber e,  INDArray df,
                       IComplexNumber ef,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx,
                       INDArray ferr, INDArray berr );

    DataBuffer sptsv( DataBuffer matriint, DataBuffer n, DataBuffer nrhs,
                      INDArray d, INDArray e, INDArray b, DataBuffer ldb );
    DataBuffer dptsv( DataBuffer matriint, DataBuffer n, DataBuffer nrhs,
                      INDArray d, INDArray e, INDArray b, DataBuffer ldb );
    DataBuffer cptsv( DataBuffer matriint, DataBuffer n, DataBuffer nrhs,
                      INDArray d, IComplexNumber e,
                      IComplexNumber b, DataBuffer ldb );
    DataBuffer zptsv( DataBuffer matriint, DataBuffer n, DataBuffer nrhs,
                      INDArray d, IComplexNumber e,
                      IComplexNumber b, DataBuffer ldb );

    DataBuffer sptsvx( DataBuffer matriint, char fact, DataBuffer n,
                       DataBuffer nrhs,  INDArray d,  INDArray e,
                       INDArray df, INDArray ef,  INDArray b, DataBuffer ldb,
                       INDArray x, DataBuffer ldx, INDArray rcond, INDArray ferr,
                       INDArray berr );
    DataBuffer dptsvx( DataBuffer matriint, char fact, DataBuffer n,
                       DataBuffer nrhs,  INDArray d,  INDArray e,
                       INDArray df, INDArray ef,  INDArray b,
                       DataBuffer ldb, INDArray x, DataBuffer ldx,
                       INDArray rcond, INDArray ferr, INDArray berr );
    DataBuffer cptsvx( DataBuffer matriint, char fact, DataBuffer n,
                       DataBuffer nrhs,  INDArray d,
                       IComplexNumber e, INDArray df,
                       IComplexNumber ef,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx,
                       INDArray rcond, INDArray ferr, INDArray berr );
    DataBuffer zptsvx( DataBuffer matriint, char fact, DataBuffer n,
                       DataBuffer nrhs,  INDArray d,
                       IComplexNumber e, INDArray df,
                       IComplexNumber ef,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx,
                       INDArray rcond, INDArray ferr, INDArray berr );

    DataBuffer spttrf( DataBuffer n, INDArray d, INDArray e );
    DataBuffer dpttrf( DataBuffer n, INDArray d, INDArray e );
    DataBuffer cpttrf( DataBuffer n, INDArray d, IComplexNumber e );
    DataBuffer zpttrf( DataBuffer n, INDArray d, IComplexNumber e );

    DataBuffer spttrs( DataBuffer matriint, DataBuffer n, DataBuffer nrhs,
                       INDArray d,  INDArray e, INDArray b,
                       DataBuffer ldb );
    DataBuffer dpttrs( DataBuffer matriint, DataBuffer n, DataBuffer nrhs,
                       INDArray d,  INDArray e, INDArray b,
                       DataBuffer ldb );
    DataBuffer cpttrs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  INDArray d,
                       IComplexNumber e,
                       IComplexNumber b, DataBuffer ldb );
    DataBuffer zpttrs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  INDArray d,
                       IComplexNumber e,
                       IComplexNumber b, DataBuffer ldb );

    DataBuffer ssbev( DataBuffer matriint, char jobz, char uplo, DataBuffer n,
                      DataBuffer kd, INDArray ab, DataBuffer ldab, INDArray w,
                      INDArray z, DataBuffer ldz );
    DataBuffer dsbev( DataBuffer matriint, char jobz, char uplo, DataBuffer n,
                      DataBuffer kd, INDArray ab, DataBuffer ldab, INDArray w,
                      INDArray z, DataBuffer ldz );

    DataBuffer ssbevd( DataBuffer matriint, char jobz, char uplo, DataBuffer n,
                       DataBuffer kd, INDArray ab, DataBuffer ldab, INDArray w,
                       INDArray z, DataBuffer ldz );
    DataBuffer dsbevd( DataBuffer matriint, char jobz, char uplo, DataBuffer n,
                       DataBuffer kd, INDArray ab, DataBuffer ldab,
                       INDArray w, INDArray z, DataBuffer ldz );

    DataBuffer ssbevx( DataBuffer matriint, char jobz, char range, char uplo,
                       DataBuffer n, DataBuffer kd, INDArray ab,
                       DataBuffer ldab, INDArray q, DataBuffer ldq, float vl,
                       float vu, DataBuffer il, DataBuffer iu, float abstol,
                       DataBuffer m, INDArray w, INDArray z, DataBuffer ldz,
                       DataBuffer ifail );
    DataBuffer dsbevx( DataBuffer matriint, char jobz, char range, char uplo,
                       DataBuffer n, DataBuffer kd, INDArray ab,
                       DataBuffer ldab, INDArray q, DataBuffer ldq,
                       double vl, double vu, DataBuffer il, DataBuffer iu,
                       double abstol, DataBuffer m, INDArray w, INDArray z,
                       DataBuffer ldz, DataBuffer ifail );

    DataBuffer ssbgst( DataBuffer matriint, char vect, char uplo, DataBuffer n,
                       DataBuffer ka, DataBuffer kb, INDArray ab,
                       DataBuffer ldab,  INDArray bb, DataBuffer ldbb,
                       INDArray x, DataBuffer ldx );
    DataBuffer dsbgst( DataBuffer matriint, char vect, char uplo, DataBuffer n,
                       DataBuffer ka, DataBuffer kb, INDArray ab,
                       DataBuffer ldab,  INDArray bb, DataBuffer ldbb,
                       INDArray x, DataBuffer ldx );

    DataBuffer ssbgv( DataBuffer matriint, char jobz, char uplo, DataBuffer n,
                      DataBuffer ka, DataBuffer kb, INDArray ab,
                      DataBuffer ldab, INDArray bb, DataBuffer ldbb, INDArray w,
                      INDArray z, DataBuffer ldz );
    DataBuffer dsbgv( DataBuffer matriint, char jobz, char uplo, DataBuffer n,
                      DataBuffer ka, DataBuffer kb, INDArray ab,
                      DataBuffer ldab, INDArray bb, DataBuffer ldbb,
                      INDArray w, INDArray z, DataBuffer ldz );

    DataBuffer ssbgvd( DataBuffer matriint, char jobz, char uplo, DataBuffer n,
                       DataBuffer ka, DataBuffer kb, INDArray ab,
                       DataBuffer ldab, INDArray bb, DataBuffer ldbb,
                       INDArray w, INDArray z, DataBuffer ldz );
    DataBuffer dsbgvd( DataBuffer matriint, char jobz, char uplo, DataBuffer n,
                       DataBuffer ka, DataBuffer kb, INDArray ab,
                       DataBuffer ldab, INDArray bb, DataBuffer ldbb,
                       INDArray w, INDArray z, DataBuffer ldz );

    DataBuffer ssbgvx( DataBuffer matriint, char jobz, char range, char uplo,
                       DataBuffer n, DataBuffer ka, DataBuffer kb,
                       INDArray ab, DataBuffer ldab, INDArray bb,
                       DataBuffer ldbb, INDArray q, DataBuffer ldq, float vl,
                       float vu, DataBuffer il, DataBuffer iu, float abstol,
                       DataBuffer m, INDArray w, INDArray z, DataBuffer ldz,
                       DataBuffer ifail );
    DataBuffer dsbgvx( DataBuffer matriint, char jobz, char range, char uplo,
                       DataBuffer n, DataBuffer ka, DataBuffer kb,
                       INDArray ab, DataBuffer ldab, INDArray bb,
                       DataBuffer ldbb, INDArray q, DataBuffer ldq,
                       double vl, double vu, DataBuffer il, DataBuffer iu,
                       double abstol, DataBuffer m, INDArray w, INDArray z,
                       DataBuffer ldz, DataBuffer ifail );

    DataBuffer ssbtrd( DataBuffer matriint, char vect, char uplo, DataBuffer n,
                       DataBuffer kd, INDArray ab, DataBuffer ldab, INDArray d,
                       INDArray e, INDArray q, DataBuffer ldq );
    DataBuffer dsbtrd( DataBuffer matriint, char vect, char uplo, DataBuffer n,
                       DataBuffer kd, INDArray ab, DataBuffer ldab,
                       INDArray d, INDArray e, INDArray q, DataBuffer ldq );

    DataBuffer ssfrk( DataBuffer matriint, char transr, char uplo, char trans,
                      DataBuffer n, DataBuffer k, float alpha,
                      INDArray a, DataBuffer lda, float beta,
                      INDArray c );
    DataBuffer dsfrk( DataBuffer matriint, char transr, char uplo, char trans,
                      DataBuffer n, DataBuffer k, double alpha,
                      INDArray a, DataBuffer lda, double beta,
                      INDArray c );

    DataBuffer sspcon( DataBuffer matriint, char uplo, DataBuffer n,
                       INDArray ap,  DataBuffer ipiv, float anorm,
                       INDArray rcond );
    DataBuffer dspcon( DataBuffer matriint, char uplo, DataBuffer n,
                       INDArray ap,  DataBuffer ipiv,
                       double anorm, INDArray rcond );
    DataBuffer cspcon( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber ap,
                       DataBuffer ipiv, float anorm, INDArray rcond );
    DataBuffer zspcon( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber ap,
                       DataBuffer ipiv, double anorm,
                       INDArray rcond );

    DataBuffer sspev( DataBuffer matriint, char jobz, char uplo, DataBuffer n,
                      INDArray ap, INDArray w, INDArray z, DataBuffer ldz );
    DataBuffer dspev( DataBuffer matriint, char jobz, char uplo, DataBuffer n,
                      INDArray ap, INDArray w, INDArray z, DataBuffer ldz );

    DataBuffer sspevd( DataBuffer matriint, char jobz, char uplo, DataBuffer n,
                       INDArray ap, INDArray w, INDArray z, DataBuffer ldz );
    DataBuffer dspevd( DataBuffer matriint, char jobz, char uplo, DataBuffer n,
                       INDArray ap, INDArray w, INDArray z, DataBuffer ldz );

    DataBuffer sspevx( DataBuffer matriint, char jobz, char range, char uplo,
                       DataBuffer n, INDArray ap, float vl, float vu,
                       DataBuffer il, DataBuffer iu, float abstol,
                       DataBuffer m, INDArray w, INDArray z, DataBuffer ldz,
                       DataBuffer ifail );
    DataBuffer dspevx( DataBuffer matriint, char jobz, char range, char uplo,
                       DataBuffer n, INDArray ap, double vl, double vu,
                       DataBuffer il, DataBuffer iu, double abstol,
                       DataBuffer m, INDArray w, INDArray z, DataBuffer ldz,
                       DataBuffer ifail );

    DataBuffer sspgst( DataBuffer matriint, DataBuffer itype, char uplo,
                       DataBuffer n, INDArray ap,  INDArray bp );
    DataBuffer dspgst( DataBuffer matriint, DataBuffer itype, char uplo,
                       DataBuffer n, INDArray ap,  INDArray bp );

    DataBuffer sspgv( DataBuffer matriint, DataBuffer itype, char jobz,
                      char uplo, DataBuffer n, INDArray ap, INDArray bp,
                      INDArray w, INDArray z, DataBuffer ldz );
    DataBuffer dspgv( DataBuffer matriint, DataBuffer itype, char jobz,
                      char uplo, DataBuffer n, INDArray ap, INDArray bp,
                      INDArray w, INDArray z, DataBuffer ldz );

    DataBuffer sspgvd( DataBuffer matriint, DataBuffer itype, char jobz,
                       char uplo, DataBuffer n, INDArray ap, INDArray bp,
                       INDArray w, INDArray z, DataBuffer ldz );
    DataBuffer dspgvd( DataBuffer matriint, DataBuffer itype, char jobz,
                       char uplo, DataBuffer n, INDArray ap, INDArray bp,
                       INDArray w, INDArray z, DataBuffer ldz );

    DataBuffer sspgvx( DataBuffer matriint, DataBuffer itype, char jobz,
                       char range, char uplo, DataBuffer n, INDArray ap,
                       INDArray bp, float vl, float vu, DataBuffer il,
                       DataBuffer iu, float abstol, DataBuffer m, INDArray w,
                       INDArray z, DataBuffer ldz, DataBuffer ifail );
    DataBuffer dspgvx( DataBuffer matriint, DataBuffer itype, char jobz,
                       char range, char uplo, DataBuffer n, INDArray ap,
                       INDArray bp, double vl, double vu, DataBuffer il,
                       DataBuffer iu, double abstol, DataBuffer m,
                       INDArray w, INDArray z, DataBuffer ldz,
                       DataBuffer ifail );

    DataBuffer ssprfs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  INDArray ap,  INDArray afp,
                       DataBuffer ipiv,  INDArray b,
                       DataBuffer ldb, INDArray x, DataBuffer ldx,
                       INDArray ferr, INDArray berr );
    DataBuffer dsprfs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  INDArray ap,  INDArray afp,
                       DataBuffer ipiv,  INDArray b,
                       DataBuffer ldb, INDArray x, DataBuffer ldx,
                       INDArray ferr, INDArray berr );
    DataBuffer csprfs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber ap,
                       IComplexNumber afp,
                       DataBuffer ipiv,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx, INDArray ferr,
                       INDArray berr );
    DataBuffer zsprfs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber ap,
                       IComplexNumber afp,
                       DataBuffer ipiv,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx,
                       INDArray ferr, INDArray berr );

    DataBuffer sspsv( DataBuffer matriint, char uplo, DataBuffer n,
                      DataBuffer nrhs, INDArray ap, DataBuffer ipiv,
                      INDArray b, DataBuffer ldb );
    DataBuffer dspsv( DataBuffer matriint, char uplo, DataBuffer n,
                      DataBuffer nrhs, INDArray ap, DataBuffer ipiv,
                      INDArray b, DataBuffer ldb );
    DataBuffer cspsv( DataBuffer matriint, char uplo, DataBuffer n,
                      DataBuffer nrhs, IComplexNumber ap,
                      DataBuffer ipiv, IComplexNumber b,
                      DataBuffer ldb );
    DataBuffer zspsv( DataBuffer matriint, char uplo, DataBuffer n,
                      DataBuffer nrhs, IComplexNumber ap,
                      DataBuffer ipiv, IComplexNumber b,
                      DataBuffer ldb );

    DataBuffer sspsvx( DataBuffer matriint, char fact, char uplo, DataBuffer n,
                       DataBuffer nrhs,  INDArray ap, INDArray afp,
                       DataBuffer ipiv,  INDArray b, DataBuffer ldb,
                       INDArray x, DataBuffer ldx, INDArray rcond, INDArray ferr,
                       INDArray berr );
    DataBuffer dspsvx( DataBuffer matriint, char fact, char uplo, DataBuffer n,
                       DataBuffer nrhs,  INDArray ap, INDArray afp,
                       DataBuffer ipiv,  INDArray b, DataBuffer ldb,
                       INDArray x, DataBuffer ldx, INDArray rcond,
                       INDArray ferr, INDArray berr );
    DataBuffer cspsvx( DataBuffer matriint, char fact, char uplo, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber ap,
                       IComplexNumber afp, DataBuffer ipiv,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx,
                       INDArray rcond, INDArray ferr, INDArray berr );
    DataBuffer zspsvx( DataBuffer matriint, char fact, char uplo, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber ap,
                       IComplexNumber afp, DataBuffer ipiv,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx,
                       INDArray rcond, INDArray ferr, INDArray berr );

    DataBuffer ssptrd( DataBuffer matriint, char uplo, DataBuffer n, INDArray ap,
                       INDArray d, INDArray e, INDArray tau );
    DataBuffer dsptrd( DataBuffer matriint, char uplo, DataBuffer n,
                       INDArray ap, INDArray d, INDArray e, INDArray tau );

    DataBuffer ssptrf( DataBuffer matriint, char uplo, DataBuffer n, INDArray ap,
                       DataBuffer ipiv );
    DataBuffer dsptrf( DataBuffer matriint, char uplo, DataBuffer n,
                       INDArray ap, DataBuffer ipiv );
    DataBuffer csptrf( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber ap, DataBuffer ipiv );
    DataBuffer zsptrf( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber ap, DataBuffer ipiv );

    DataBuffer ssptri( DataBuffer matriint, char uplo, DataBuffer n, INDArray ap,
                       DataBuffer ipiv );
    DataBuffer dsptri( DataBuffer matriint, char uplo, DataBuffer n,
                       INDArray ap,  DataBuffer ipiv );
    DataBuffer csptri( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber ap,  DataBuffer ipiv );
    DataBuffer zsptri( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber ap,  DataBuffer ipiv );

    DataBuffer ssptrs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  INDArray ap,
                       DataBuffer ipiv, INDArray b, DataBuffer ldb );
    DataBuffer dsptrs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  INDArray ap,
                       DataBuffer ipiv, INDArray b, DataBuffer ldb );
    DataBuffer csptrs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber ap,
                       DataBuffer ipiv, IComplexNumber b,
                       DataBuffer ldb );
    DataBuffer zsptrs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber ap,
                       DataBuffer ipiv, IComplexNumber b,
                       DataBuffer ldb );

    DataBuffer sstebz( char range, char order, DataBuffer n, float vl,
                       float vu, DataBuffer il, DataBuffer iu, float abstol,
                       INDArray d,  INDArray e, DataBuffer m,
                       DataBuffer nsplit, INDArray w, DataBuffer iblock,
                       DataBuffer isplit );
    DataBuffer dstebz( char range, char order, DataBuffer n, double vl,
                       double vu, DataBuffer il, DataBuffer iu,
                       double abstol,  INDArray d,  INDArray e,
                       DataBuffer m, DataBuffer nsplit, INDArray w,
                       DataBuffer iblock, DataBuffer isplit );

    DataBuffer sstedc( DataBuffer matriint, char compz, DataBuffer n, INDArray d,
                       INDArray e, INDArray z, DataBuffer ldz );
    DataBuffer dstedc( DataBuffer matriint, char compz, DataBuffer n,
                       INDArray d, INDArray e, INDArray z, DataBuffer ldz );
    DataBuffer cstedc( DataBuffer matriint, char compz, DataBuffer n, INDArray d,
                       INDArray e, IComplexNumber z, DataBuffer ldz );
    DataBuffer zstedc( DataBuffer matriint, char compz, DataBuffer n,
                       INDArray d, INDArray e, IComplexNumber z,
                       DataBuffer ldz );

    DataBuffer sstegr( DataBuffer matriint, char jobz, char range,
                       DataBuffer n, INDArray d, INDArray e, float vl, float vu,
                       DataBuffer il, DataBuffer iu, float abstol,
                       DataBuffer m, INDArray w, INDArray z, DataBuffer ldz,
                       DataBuffer isuppz );
    DataBuffer dstegr( DataBuffer matriint, char jobz, char range,
                       DataBuffer n, INDArray d, INDArray e, double vl,
                       double vu, DataBuffer il, DataBuffer iu,
                       double abstol, DataBuffer m, INDArray w, INDArray z,
                       DataBuffer ldz, DataBuffer isuppz );
    DataBuffer cstegr( DataBuffer matriint, char jobz, char range,
                       DataBuffer n, INDArray d, INDArray e, float vl, float vu,
                       DataBuffer il, DataBuffer iu, float abstol,
                       DataBuffer m, INDArray w, IComplexNumber z,
                       DataBuffer ldz, DataBuffer isuppz );
    DataBuffer zstegr( DataBuffer matriint, char jobz, char range,
                       DataBuffer n, INDArray d, INDArray e, double vl,
                       double vu, DataBuffer il, DataBuffer iu,
                       double abstol, DataBuffer m, INDArray w,
                       IComplexNumber z, DataBuffer ldz,
                       DataBuffer isuppz );

    DataBuffer sstein( DataBuffer matriint, DataBuffer n,  INDArray d,
                       INDArray e, DataBuffer m,  INDArray w,
                       DataBuffer iblock,  DataBuffer isplit,
                       INDArray z, DataBuffer ldz, DataBuffer ifailv );
    DataBuffer dstein( DataBuffer matriint, DataBuffer n,  INDArray d,
                       INDArray e, DataBuffer m,  INDArray w,
                       DataBuffer iblock,  DataBuffer isplit,
                       INDArray z, DataBuffer ldz, DataBuffer ifailv );
    DataBuffer cstein( DataBuffer matriint, DataBuffer n,  INDArray d,
                       INDArray e, DataBuffer m,  INDArray w,
                       DataBuffer iblock,  DataBuffer isplit,
                       IComplexNumber z, DataBuffer ldz,
                       DataBuffer ifailv );
    DataBuffer zstein( DataBuffer matriint, DataBuffer n,  INDArray d,
                       INDArray e, DataBuffer m,  INDArray w,
                       DataBuffer iblock,  DataBuffer isplit,
                       IComplexNumber z, DataBuffer ldz,
                       DataBuffer ifailv );

    DataBuffer sstemr( DataBuffer matriint, char jobz, char range,
                       DataBuffer n, INDArray d, INDArray e, float vl, float vu,
                       DataBuffer il, DataBuffer iu, DataBuffer m,
                       INDArray w, INDArray z, DataBuffer ldz, DataBuffer nzc,
                       DataBuffer isuppz, DataBuffer tryrac );
    DataBuffer dstemr( DataBuffer matriint, char jobz, char range,
                       DataBuffer n, INDArray d, INDArray e, double vl,
                       double vu, DataBuffer il, DataBuffer iu,
                       DataBuffer m, INDArray w, INDArray z, DataBuffer ldz,
                       DataBuffer nzc, DataBuffer isuppz,
                       DataBuffer tryrac );
    DataBuffer cstemr( DataBuffer matriint, char jobz, char range,
                       DataBuffer n, INDArray d, INDArray e, float vl, float vu,
                       DataBuffer il, DataBuffer iu, DataBuffer m,
                       INDArray w, IComplexNumber z, DataBuffer ldz,
                       DataBuffer nzc, DataBuffer isuppz,
                       DataBuffer tryrac );
    DataBuffer zstemr( DataBuffer matriint, char jobz, char range,
                       DataBuffer n, INDArray d, INDArray e, double vl,
                       double vu, DataBuffer il, DataBuffer iu,
                       DataBuffer m, INDArray w, IComplexNumber z,
                       DataBuffer ldz, DataBuffer nzc, DataBuffer isuppz,
                       DataBuffer tryrac );

    DataBuffer ssteqr( DataBuffer matriint, char compz, DataBuffer n, INDArray d,
                       INDArray e, INDArray z, DataBuffer ldz );
    DataBuffer dsteqr( DataBuffer matriint, char compz, DataBuffer n,
                       INDArray d, INDArray e, INDArray z, DataBuffer ldz );
    DataBuffer csteqr( DataBuffer matriint, char compz, DataBuffer n, INDArray d,
                       INDArray e, IComplexNumber z, DataBuffer ldz );
    DataBuffer zsteqr( DataBuffer matriint, char compz, DataBuffer n,
                       INDArray d, INDArray e, IComplexNumber z,
                       DataBuffer ldz );

    DataBuffer ssterf( DataBuffer n, INDArray d, INDArray e );
    DataBuffer dsterf( DataBuffer n, INDArray d, INDArray e );

    DataBuffer sstev( DataBuffer matriint, char jobz, DataBuffer n, INDArray d,
                      INDArray e, INDArray z, DataBuffer ldz );
    DataBuffer dstev( DataBuffer matriint, char jobz, DataBuffer n, INDArray d,
                      INDArray e, INDArray z, DataBuffer ldz );

    DataBuffer sstevd( DataBuffer matriint, char jobz, DataBuffer n, INDArray d,
                       INDArray e, INDArray z, DataBuffer ldz );
    DataBuffer dstevd( DataBuffer matriint, char jobz, DataBuffer n, INDArray d,
                       INDArray e, INDArray z, DataBuffer ldz );

    DataBuffer sstevr( DataBuffer matriint, char jobz, char range,
                       DataBuffer n, INDArray d, INDArray e, float vl, float vu,
                       DataBuffer il, DataBuffer iu, float abstol,
                       DataBuffer m, INDArray w, INDArray z, DataBuffer ldz,
                       DataBuffer isuppz );
    DataBuffer dstevr( DataBuffer matriint, char jobz, char range,
                       DataBuffer n, INDArray d, INDArray e, double vl,
                       double vu, DataBuffer il, DataBuffer iu,
                       double abstol, DataBuffer m, INDArray w, INDArray z,
                       DataBuffer ldz, DataBuffer isuppz );

    DataBuffer sstevx( DataBuffer matriint, char jobz, char range,
                       DataBuffer n, INDArray d, INDArray e, float vl, float vu,
                       DataBuffer il, DataBuffer iu, float abstol,
                       DataBuffer m, INDArray w, INDArray z, DataBuffer ldz,
                       DataBuffer ifail );
    DataBuffer dstevx( DataBuffer matriint, char jobz, char range,
                       DataBuffer n, INDArray d, INDArray e, double vl,
                       double vu, DataBuffer il, DataBuffer iu,
                       double abstol, DataBuffer m, INDArray w, INDArray z,
                       DataBuffer ldz, DataBuffer ifail );

    DataBuffer ssycon( DataBuffer matriint, char uplo, DataBuffer n,
                       INDArray a, DataBuffer lda,
                       DataBuffer ipiv, float anorm, INDArray rcond );
    DataBuffer dsycon( DataBuffer matriint, char uplo, DataBuffer n,
                       INDArray a, DataBuffer lda,
                       DataBuffer ipiv, double anorm,
                       INDArray rcond );
    DataBuffer csycon( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       DataBuffer ipiv, float anorm, INDArray rcond );
    DataBuffer zsycon( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       DataBuffer ipiv, double anorm,
                       INDArray rcond );

    DataBuffer ssyequb( DataBuffer matriint, char uplo, DataBuffer n,
                        INDArray a, DataBuffer lda, INDArray s,
                        INDArray scond, INDArray amax );
    DataBuffer dsyequb( DataBuffer matriint, char uplo, DataBuffer n,
                        INDArray a, DataBuffer lda, INDArray s,
                        INDArray scond, INDArray amax );
    DataBuffer csyequb( DataBuffer matriint, char uplo, DataBuffer n,
                        IComplexNumber a, DataBuffer lda,
                        INDArray s, INDArray scond, INDArray amax );
    DataBuffer zsyequb( DataBuffer matriint, char uplo, DataBuffer n,
                        IComplexNumber a, DataBuffer lda,
                        INDArray s, INDArray scond, INDArray amax );

    DataBuffer ssyev( DataBuffer matriint, char jobz, char uplo, DataBuffer n,
                      INDArray a, DataBuffer lda, INDArray w );
    DataBuffer dsyev( DataBuffer matriint, char jobz, char uplo, DataBuffer n,
                      INDArray a, DataBuffer lda, INDArray w );

    DataBuffer ssyevd( DataBuffer matriint, char jobz, char uplo, DataBuffer n,
                       INDArray a, DataBuffer lda, INDArray w );
    DataBuffer dsyevd( DataBuffer matriint, char jobz, char uplo, DataBuffer n,
                       INDArray a, DataBuffer lda, INDArray w );

    DataBuffer ssyevr( DataBuffer matriint, char jobz, char range, char uplo,
                       DataBuffer n, INDArray a, DataBuffer lda, float vl,
                       float vu, DataBuffer il, DataBuffer iu, float abstol,
                       DataBuffer m, INDArray w, INDArray z, DataBuffer ldz,
                       DataBuffer isuppz );
    DataBuffer dsyevr( DataBuffer matriint, char jobz, char range, char uplo,
                       DataBuffer n, INDArray a, DataBuffer lda, double vl,
                       double vu, DataBuffer il, DataBuffer iu,
                       double abstol, DataBuffer m, INDArray w, INDArray z,
                       DataBuffer ldz, DataBuffer isuppz );

    DataBuffer ssyevx( DataBuffer matriint, char jobz, char range, char uplo,
                       DataBuffer n, INDArray a, DataBuffer lda, float vl,
                       float vu, DataBuffer il, DataBuffer iu, float abstol,
                       DataBuffer m, INDArray w, INDArray z, DataBuffer ldz,
                       DataBuffer ifail );
    DataBuffer dsyevx( DataBuffer matriint, char jobz, char range, char uplo,
                       DataBuffer n, INDArray a, DataBuffer lda, double vl,
                       double vu, DataBuffer il, DataBuffer iu,
                       double abstol, DataBuffer m, INDArray w, INDArray z,
                       DataBuffer ldz, DataBuffer ifail );

    DataBuffer ssygst( DataBuffer matriint, DataBuffer itype, char uplo,
                       DataBuffer n, INDArray a, DataBuffer lda,
                       INDArray b, DataBuffer ldb );
    DataBuffer dsygst( DataBuffer matriint, DataBuffer itype, char uplo,
                       DataBuffer n, INDArray a, DataBuffer lda,
                       INDArray b, DataBuffer ldb );

    DataBuffer ssygv( DataBuffer matriint, DataBuffer itype, char jobz,
                      char uplo, DataBuffer n, INDArray a, DataBuffer lda,
                      INDArray b, DataBuffer ldb, INDArray w );
    DataBuffer dsygv( DataBuffer matriint, DataBuffer itype, char jobz,
                      char uplo, DataBuffer n, INDArray a, DataBuffer lda,
                      INDArray b, DataBuffer ldb, INDArray w );

    DataBuffer ssygvd( DataBuffer matriint, DataBuffer itype, char jobz,
                       char uplo, DataBuffer n, INDArray a, DataBuffer lda,
                       INDArray b, DataBuffer ldb, INDArray w );
    DataBuffer dsygvd( DataBuffer matriint, DataBuffer itype, char jobz,
                       char uplo, DataBuffer n, INDArray a, DataBuffer lda,
                       INDArray b, DataBuffer ldb, INDArray w );

    DataBuffer ssygvx( DataBuffer matriint, DataBuffer itype, char jobz,
                       char range, char uplo, DataBuffer n, INDArray a,
                       DataBuffer lda, INDArray b, DataBuffer ldb, float vl,
                       float vu, DataBuffer il, DataBuffer iu, float abstol,
                       DataBuffer m, INDArray w, INDArray z, DataBuffer ldz,
                       DataBuffer ifail );
    DataBuffer dsygvx( DataBuffer matriint, DataBuffer itype, char jobz,
                       char range, char uplo, DataBuffer n, INDArray a,
                       DataBuffer lda, INDArray b, DataBuffer ldb, double vl,
                       double vu, DataBuffer il, DataBuffer iu,
                       double abstol, DataBuffer m, INDArray w, INDArray z,
                       DataBuffer ldz, DataBuffer ifail );

    DataBuffer ssyrfs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  INDArray a, DataBuffer lda,
                       INDArray af, DataBuffer ldaf,
                       DataBuffer ipiv,  INDArray b,
                       DataBuffer ldb, INDArray x, DataBuffer ldx,
                       INDArray ferr, INDArray berr );
    DataBuffer dsyrfs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  INDArray a, DataBuffer lda,
                       INDArray af, DataBuffer ldaf,
                       DataBuffer ipiv,  INDArray b,
                       DataBuffer ldb, INDArray x, DataBuffer ldx,
                       INDArray ferr, INDArray berr );
    DataBuffer csyrfs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber a,
                       DataBuffer lda,  IComplexNumber af,
                       DataBuffer ldaf,  DataBuffer ipiv,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx, INDArray ferr,
                       INDArray berr );
    DataBuffer zsyrfs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber a,
                       DataBuffer lda,  IComplexNumber af,
                       DataBuffer ldaf,  DataBuffer ipiv,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx,
                       INDArray ferr, INDArray berr );

    DataBuffer ssyrfsx( DataBuffer matriint, char uplo, char equed,
                        DataBuffer n, DataBuffer nrhs,  INDArray a,
                        DataBuffer lda,  INDArray af, DataBuffer ldaf,
                        DataBuffer ipiv,  INDArray s,
                        INDArray b, DataBuffer ldb, INDArray x,
                        DataBuffer ldx, INDArray rcond, INDArray berr,
                        DataBuffer int_bnds, INDArray erint_norm,
                        INDArray erint_comp, DataBuffer nparams,
                        INDArray params );
    DataBuffer dsyrfsx( DataBuffer matriint, char uplo, char equed,
                        DataBuffer n, DataBuffer nrhs,  INDArray a,
                        DataBuffer lda,  INDArray af, DataBuffer ldaf,
                        DataBuffer ipiv,  INDArray s,
                        INDArray b, DataBuffer ldb, INDArray x,
                        DataBuffer ldx, INDArray rcond, INDArray berr,
                        DataBuffer int_bnds, INDArray erint_norm,
                        INDArray erint_comp, DataBuffer nparams,
                        INDArray params );
    DataBuffer csyrfsx( DataBuffer matriint, char uplo, char equed,
                        DataBuffer n, DataBuffer nrhs,
                        IComplexNumber a, DataBuffer lda,
                        IComplexNumber af, DataBuffer ldaf,
                        DataBuffer ipiv,  INDArray s,
                        IComplexNumber b, DataBuffer ldb,
                        IComplexNumber x, DataBuffer ldx,
                        INDArray rcond, INDArray berr, DataBuffer int_bnds,
                        INDArray erint_norm, INDArray erint_comp,
                        DataBuffer nparams, INDArray params );
    DataBuffer zsyrfsx( DataBuffer matriint, char uplo, char equed,
                        DataBuffer n, DataBuffer nrhs,
                        IComplexNumber a, DataBuffer lda,
                        IComplexNumber af, DataBuffer ldaf,
                        DataBuffer ipiv,  INDArray s,
                        IComplexNumber b, DataBuffer ldb,
                        IComplexNumber x, DataBuffer ldx,
                        INDArray rcond, INDArray berr, DataBuffer int_bnds,
                        INDArray erint_norm, INDArray erint_comp,
                        DataBuffer nparams, INDArray params );

    DataBuffer ssysv( DataBuffer matriint, char uplo, DataBuffer n,
                      DataBuffer nrhs, INDArray a, DataBuffer lda,
                      DataBuffer ipiv, INDArray b, DataBuffer ldb );
    DataBuffer dsysv( DataBuffer matriint, char uplo, DataBuffer n,
                      DataBuffer nrhs, INDArray a, DataBuffer lda,
                      DataBuffer ipiv, INDArray b, DataBuffer ldb );
    DataBuffer csysv( DataBuffer matriint, char uplo, DataBuffer n,
                      DataBuffer nrhs, IComplexNumber a,
                      DataBuffer lda, DataBuffer ipiv,
                      IComplexNumber b, DataBuffer ldb );
    DataBuffer zsysv( DataBuffer matriint, char uplo, DataBuffer n,
                      DataBuffer nrhs, IComplexNumber a,
                      DataBuffer lda, DataBuffer ipiv,
                      IComplexNumber b, DataBuffer ldb );

    DataBuffer ssysvx( DataBuffer matriint, char fact, char uplo, DataBuffer n,
                       DataBuffer nrhs,  INDArray a, DataBuffer lda,
                       INDArray af, DataBuffer ldaf, DataBuffer ipiv,
                       INDArray b, DataBuffer ldb, INDArray x,
                       DataBuffer ldx, INDArray rcond, INDArray ferr,
                       INDArray berr );
    DataBuffer dsysvx( DataBuffer matriint, char fact, char uplo, DataBuffer n,
                       DataBuffer nrhs,  INDArray a, DataBuffer lda,
                       INDArray af, DataBuffer ldaf, DataBuffer ipiv,
                       INDArray b, DataBuffer ldb, INDArray x,
                       DataBuffer ldx, INDArray rcond, INDArray ferr,
                       INDArray berr );
    DataBuffer csysvx( DataBuffer matriint, char fact, char uplo, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber a,
                       DataBuffer lda, IComplexNumber af,
                       DataBuffer ldaf, DataBuffer ipiv,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx,
                       INDArray rcond, INDArray ferr, INDArray berr );
    DataBuffer zsysvx( DataBuffer matriint, char fact, char uplo, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber a,
                       DataBuffer lda, IComplexNumber af,
                       DataBuffer ldaf, DataBuffer ipiv,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx,
                       INDArray rcond, INDArray ferr, INDArray berr );

    DataBuffer ssysvxx( DataBuffer matriint, char fact, char uplo,
                        DataBuffer n, DataBuffer nrhs, INDArray a,
                        DataBuffer lda, INDArray af, DataBuffer ldaf,
                        DataBuffer ipiv, String equed, INDArray s, INDArray b,
                        DataBuffer ldb, INDArray x, DataBuffer ldx,
                        INDArray rcond, INDArray rpvgrw, INDArray berr,
                        DataBuffer int_bnds, INDArray erint_norm,
                        INDArray erint_comp, DataBuffer nparams,
                        INDArray params );
    DataBuffer dsysvxx( DataBuffer matriint, char fact, char uplo,
                        DataBuffer n, DataBuffer nrhs, INDArray a,
                        DataBuffer lda, INDArray af, DataBuffer ldaf,
                        DataBuffer ipiv, String equed, INDArray s, INDArray b,
                        DataBuffer ldb, INDArray x, DataBuffer ldx,
                        INDArray rcond, INDArray rpvgrw, INDArray berr,
                        DataBuffer int_bnds, INDArray erint_norm,
                        INDArray erint_comp, DataBuffer nparams,
                        INDArray params );
    DataBuffer csysvxx( DataBuffer matriint, char fact, char uplo,
                        DataBuffer n, DataBuffer nrhs,
                        IComplexNumber a, DataBuffer lda,
                        IComplexNumber af, DataBuffer ldaf,
                        DataBuffer ipiv, String equed, INDArray s,
                        IComplexNumber b, DataBuffer ldb,
                        IComplexNumber x, DataBuffer ldx,
                        INDArray rcond, INDArray rpvgrw, INDArray berr,
                        DataBuffer int_bnds, INDArray erint_norm,
                        INDArray erint_comp, DataBuffer nparams,
                        INDArray params );
    DataBuffer zsysvxx( DataBuffer matriint, char fact, char uplo,
                        DataBuffer n, DataBuffer nrhs,
                        IComplexNumber a, DataBuffer lda,
                        IComplexNumber af, DataBuffer ldaf,
                        DataBuffer ipiv, String equed, INDArray s,
                        IComplexNumber b, DataBuffer ldb,
                        IComplexNumber x, DataBuffer ldx,
                        INDArray rcond, INDArray rpvgrw, INDArray berr,
                        DataBuffer int_bnds, INDArray erint_norm,
                        INDArray erint_comp, DataBuffer nparams,
                        INDArray params );

    DataBuffer ssytrd( DataBuffer matriint, char uplo, DataBuffer n, INDArray a,
                       DataBuffer lda, INDArray d, INDArray e, INDArray tau );
    DataBuffer dsytrd( DataBuffer matriint, char uplo, DataBuffer n, INDArray a,
                       DataBuffer lda, INDArray d, INDArray e, INDArray tau );

    DataBuffer ssytrf( DataBuffer matriint, char uplo, DataBuffer n, INDArray a,
                       DataBuffer lda, DataBuffer ipiv );
    DataBuffer dsytrf( DataBuffer matriint, char uplo, DataBuffer n, INDArray a,
                       DataBuffer lda, DataBuffer ipiv );
    DataBuffer csytrf( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       DataBuffer ipiv );
    DataBuffer zsytrf( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       DataBuffer ipiv );

    DataBuffer ssytri( DataBuffer matriint, char uplo, DataBuffer n, INDArray a,
                       DataBuffer lda,  DataBuffer ipiv );
    DataBuffer dsytri( DataBuffer matriint, char uplo, DataBuffer n, INDArray a,
                       DataBuffer lda,  DataBuffer ipiv );
    DataBuffer csytri( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       DataBuffer ipiv );
    DataBuffer zsytri( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       DataBuffer ipiv );

    DataBuffer ssytrs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  INDArray a, DataBuffer lda,
                       DataBuffer ipiv, INDArray b, DataBuffer ldb );
    DataBuffer dsytrs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  INDArray a, DataBuffer lda,
                       DataBuffer ipiv, INDArray b, DataBuffer ldb );
    DataBuffer csytrs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber a,
                       DataBuffer lda,  DataBuffer ipiv,
                       IComplexNumber b, DataBuffer ldb );
    DataBuffer zsytrs( DataBuffer matriint, char uplo, DataBuffer n,
                       DataBuffer nrhs,  IComplexNumber a,
                       DataBuffer lda,  DataBuffer ipiv,
                       IComplexNumber b, DataBuffer ldb );

    DataBuffer stbcon( DataBuffer matriint, char norm, char uplo, char diag,
                       DataBuffer n, DataBuffer kd,  INDArray ab,
                       DataBuffer ldab, INDArray rcond );
    DataBuffer dtbcon( DataBuffer matriint, char norm, char uplo, char diag,
                       DataBuffer n, DataBuffer kd,  INDArray ab,
                       DataBuffer ldab, INDArray rcond );
    DataBuffer ctbcon( DataBuffer matriint, char norm, char uplo, char diag,
                       DataBuffer n, DataBuffer kd,
                       IComplexNumber ab, DataBuffer ldab,
                       INDArray rcond );
    DataBuffer ztbcon( DataBuffer matriint, char norm, char uplo, char diag,
                       DataBuffer n, DataBuffer kd,
                       IComplexNumber ab, DataBuffer ldab,
                       INDArray rcond );

    DataBuffer stbrfs( DataBuffer matriint, char uplo, char trans, char diag,
                       DataBuffer n, DataBuffer kd, DataBuffer nrhs,
                       INDArray ab, DataBuffer ldab,  INDArray b,
                       DataBuffer ldb,  INDArray x, DataBuffer ldx,
                       INDArray ferr, INDArray berr );
    DataBuffer dtbrfs( DataBuffer matriint, char uplo, char trans, char diag,
                       DataBuffer n, DataBuffer kd, DataBuffer nrhs,
                       INDArray ab, DataBuffer ldab,  INDArray b,
                       DataBuffer ldb,  INDArray x, DataBuffer ldx,
                       INDArray ferr, INDArray berr );
    DataBuffer ctbrfs( DataBuffer matriint, char uplo, char trans, char diag,
                       DataBuffer n, DataBuffer kd, DataBuffer nrhs,
                       IComplexNumber ab, DataBuffer ldab,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx,
                       INDArray ferr, INDArray berr );
    DataBuffer ztbrfs( DataBuffer matriint, char uplo, char trans, char diag,
                       DataBuffer n, DataBuffer kd, DataBuffer nrhs,
                       IComplexNumber ab, DataBuffer ldab,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx,
                       INDArray ferr, INDArray berr );

    DataBuffer stbtrs( DataBuffer matriint, char uplo, char trans, char diag,
                       DataBuffer n, DataBuffer kd, DataBuffer nrhs,
                       INDArray ab, DataBuffer ldab, INDArray b,
                       DataBuffer ldb );
    DataBuffer dtbtrs( DataBuffer matriint, char uplo, char trans, char diag,
                       DataBuffer n, DataBuffer kd, DataBuffer nrhs,
                       INDArray ab, DataBuffer ldab, INDArray b,
                       DataBuffer ldb );
    DataBuffer ctbtrs( DataBuffer matriint, char uplo, char trans, char diag,
                       DataBuffer n, DataBuffer kd, DataBuffer nrhs,
                       IComplexNumber ab, DataBuffer ldab,
                       IComplexNumber b, DataBuffer ldb );
    DataBuffer ztbtrs( DataBuffer matriint, char uplo, char trans, char diag,
                       DataBuffer n, DataBuffer kd, DataBuffer nrhs,
                       IComplexNumber ab, DataBuffer ldab,
                       IComplexNumber b, DataBuffer ldb );

    DataBuffer stfsm( DataBuffer matriint, char transr, char side, char uplo,
                      char trans, char diag, DataBuffer m, DataBuffer n,
                      float alpha,  INDArray a, INDArray b,
                      DataBuffer ldb );
    DataBuffer dtfsm( DataBuffer matriint, char transr, char side, char uplo,
                      char trans, char diag, DataBuffer m, DataBuffer n,
                      double alpha,  INDArray a, INDArray b,
                      DataBuffer ldb );
    DataBuffer ctfsm( DataBuffer matriint, char transr, char side, char uplo,
                      char trans, char diag, DataBuffer m, DataBuffer n,
                      IComplexNumber alpha,
                      IComplexNumber a,
                      IComplexNumber b, DataBuffer ldb );
    DataBuffer ztfsm( DataBuffer matriint, char transr, char side, char uplo,
                      char trans, char diag, DataBuffer m, DataBuffer n,
                      IComplexNumber alpha,
                      IComplexNumber a,
                      IComplexNumber b, DataBuffer ldb );

    DataBuffer stftri( DataBuffer matriint, char transr, char uplo, char diag,
                       DataBuffer n, INDArray a );
    DataBuffer dtftri( DataBuffer matriint, char transr, char uplo, char diag,
                       DataBuffer n, INDArray a );
    DataBuffer ctftri( DataBuffer matriint, char transr, char uplo, char diag,
                       DataBuffer n, IComplexNumber a );
    DataBuffer ztftri( DataBuffer matriint, char transr, char uplo, char diag,
                       DataBuffer n, IComplexNumber a );

    DataBuffer stfttp( DataBuffer matriint, char transr, char uplo,
                       DataBuffer n,  INDArray arf, INDArray ap );
    DataBuffer dtfttp( DataBuffer matriint, char transr, char uplo,
                       DataBuffer n,  INDArray arf, INDArray ap );
    DataBuffer ctfttp( DataBuffer matriint, char transr, char uplo,
                       DataBuffer n,  IComplexNumber arf,
                       IComplexNumber ap );
    DataBuffer ztfttp( DataBuffer matriint, char transr, char uplo,
                       DataBuffer n,  IComplexNumber arf,
                       IComplexNumber ap );

    DataBuffer stfttr( DataBuffer matriint, char transr, char uplo,
                       DataBuffer n,  INDArray arf, INDArray a,
                       DataBuffer lda );
    DataBuffer dtfttr( DataBuffer matriint, char transr, char uplo,
                       DataBuffer n,  INDArray arf, INDArray a,
                       DataBuffer lda );
    DataBuffer ctfttr( DataBuffer matriint, char transr, char uplo,
                       DataBuffer n,  IComplexNumber arf,
                       IComplexNumber a, DataBuffer lda );
    DataBuffer ztfttr( DataBuffer matriint, char transr, char uplo,
                       DataBuffer n,  IComplexNumber arf,
                       IComplexNumber a, DataBuffer lda );

    DataBuffer stgevc( DataBuffer matriint, char side, char howmny,
                       DataBuffer select, DataBuffer n,
                       INDArray s, DataBuffer lds,  INDArray p,
                       DataBuffer ldp, INDArray vl, DataBuffer ldvl,
                       INDArray vr, DataBuffer ldvr, DataBuffer mm,
                       DataBuffer m );
    DataBuffer dtgevc( DataBuffer matriint, char side, char howmny,
                       DataBuffer select, DataBuffer n,
                       INDArray s, DataBuffer lds,  INDArray p,
                       DataBuffer ldp, INDArray vl, DataBuffer ldvl,
                       INDArray vr, DataBuffer ldvr, DataBuffer mm,
                       DataBuffer m );
    DataBuffer ctgevc( DataBuffer matriint, char side, char howmny,
                       DataBuffer select, DataBuffer n,
                       IComplexNumber s, DataBuffer lds,
                       IComplexNumber p, DataBuffer ldp,
                       IComplexNumber vl, DataBuffer ldvl,
                       IComplexNumber vr, DataBuffer ldvr,
                       DataBuffer mm, DataBuffer m );
    DataBuffer ztgevc( DataBuffer matriint, char side, char howmny,
                       DataBuffer select, DataBuffer n,
                       IComplexNumber s, DataBuffer lds,
                       IComplexNumber p, DataBuffer ldp,
                       IComplexNumber vl, DataBuffer ldvl,
                       IComplexNumber vr, DataBuffer ldvr,
                       DataBuffer mm, DataBuffer m );

    DataBuffer stgexc( DataBuffer matriint, int wantq,
                       int wantz, DataBuffer n, INDArray a,
                       DataBuffer lda, INDArray b, DataBuffer ldb, INDArray q,
                       DataBuffer ldq, INDArray z, DataBuffer ldz,
                       DataBuffer ifst, DataBuffer ilst );
    DataBuffer dtgexc( DataBuffer matriint, int wantq,
                       int wantz, DataBuffer n, INDArray a,
                       DataBuffer lda, INDArray b, DataBuffer ldb, INDArray q,
                       DataBuffer ldq, INDArray z, DataBuffer ldz,
                       DataBuffer ifst, DataBuffer ilst );
    DataBuffer ctgexc( DataBuffer matriint, int wantq,
                       int wantz, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber q, DataBuffer ldq,
                       IComplexNumber z, DataBuffer ldz,
                       DataBuffer ifst, DataBuffer ilst );
    DataBuffer ztgexc( DataBuffer matriint, int wantq,
                       int wantz, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber q, DataBuffer ldq,
                       IComplexNumber z, DataBuffer ldz,
                       DataBuffer ifst, DataBuffer ilst );

    DataBuffer stgsen( DataBuffer matriint, DataBuffer ijob,
                       int wantq, int wantz,
                       DataBuffer select, DataBuffer n, INDArray a,
                       DataBuffer lda, INDArray b, DataBuffer ldb,
                       INDArray alphar, INDArray alphai, INDArray beta, INDArray q,
                       DataBuffer ldq, INDArray z, DataBuffer ldz,
                       DataBuffer m, INDArray pl, INDArray pr, INDArray dif );
    DataBuffer dtgsen( DataBuffer matriint, DataBuffer ijob,
                       int wantq, int wantz,
                       DataBuffer select, DataBuffer n,
                       INDArray a, DataBuffer lda, INDArray b, DataBuffer ldb,
                       INDArray alphar, INDArray alphai, INDArray beta,
                       INDArray q, DataBuffer ldq, INDArray z, DataBuffer ldz,
                       DataBuffer m, INDArray pl, INDArray pr, INDArray dif );
    DataBuffer ctgsen( DataBuffer matriint, DataBuffer ijob,
                       int wantq, int wantz,
                       DataBuffer select, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber alpha,
                       IComplexNumber beta, IComplexNumber q,
                       DataBuffer ldq, IComplexNumber z,
                       DataBuffer ldz, DataBuffer m, INDArray pl, INDArray pr,
                       INDArray dif );
    DataBuffer ztgsen( DataBuffer matriint, DataBuffer ijob,
                       int wantq, int wantz,
                       DataBuffer select, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber alpha,
                       IComplexNumber beta,
                       IComplexNumber q, DataBuffer ldq,
                       IComplexNumber z, DataBuffer ldz,
                       DataBuffer m, INDArray pl, INDArray pr, INDArray dif );

    DataBuffer stgsja( DataBuffer matriint, char jobu, char jobv, char jobq,
                       DataBuffer m, DataBuffer p, DataBuffer n,
                       DataBuffer k, DataBuffer l, INDArray a, DataBuffer lda,
                       INDArray b, DataBuffer ldb, float tola, float tolb,
                       INDArray alpha, INDArray beta, INDArray u, DataBuffer ldu,
                       INDArray v, DataBuffer ldv, INDArray q, DataBuffer ldq,
                       DataBuffer ncycle );
    DataBuffer dtgsja( DataBuffer matriint, char jobu, char jobv, char jobq,
                       DataBuffer m, DataBuffer p, DataBuffer n,
                       DataBuffer k, DataBuffer l, INDArray a,
                       DataBuffer lda, INDArray b, DataBuffer ldb,
                       double tola, double tolb, INDArray alpha,
                       INDArray beta, INDArray u, DataBuffer ldu, INDArray v,
                       DataBuffer ldv, INDArray q, DataBuffer ldq,
                       DataBuffer ncycle );
    DataBuffer ctgsja( DataBuffer matriint, char jobu, char jobv, char jobq,
                       DataBuffer m, DataBuffer p, DataBuffer n,
                       DataBuffer k, DataBuffer l, IComplexNumber a,
                       DataBuffer lda, IComplexNumber b,
                       DataBuffer ldb, float tola, float tolb, INDArray alpha,
                       INDArray beta, IComplexNumber u, DataBuffer ldu,
                       IComplexNumber v, DataBuffer ldv,
                       IComplexNumber q, DataBuffer ldq,
                       DataBuffer ncycle );
    DataBuffer ztgsja( DataBuffer matriint, char jobu, char jobv, char jobq,
                       DataBuffer m, DataBuffer p, DataBuffer n,
                       DataBuffer k, DataBuffer l, IComplexNumber a,
                       DataBuffer lda, IComplexNumber b,
                       DataBuffer ldb, double tola, double tolb,
                       INDArray alpha, INDArray beta,
                       IComplexNumber u, DataBuffer ldu,
                       IComplexNumber v, DataBuffer ldv,
                       IComplexNumber q, DataBuffer ldq,
                       DataBuffer ncycle );

    DataBuffer stgsna( DataBuffer matriint, char job, char howmny,
                       DataBuffer select, DataBuffer n,
                       INDArray a, DataBuffer lda,  INDArray b,
                       DataBuffer ldb,  INDArray vl, DataBuffer ldvl,
                       INDArray vr, DataBuffer ldvr, INDArray s,
                       INDArray dif, DataBuffer mm, DataBuffer m );
    DataBuffer dtgsna( DataBuffer matriint, char job, char howmny,
                       DataBuffer select, DataBuffer n,
                       INDArray a, DataBuffer lda,  INDArray b,
                       DataBuffer ldb,  INDArray vl, DataBuffer ldvl,
                       INDArray vr, DataBuffer ldvr, INDArray s,
                       INDArray dif, DataBuffer mm, DataBuffer m );
    DataBuffer ctgsna( DataBuffer matriint, char job, char howmny,
                       DataBuffer select, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber vl, DataBuffer ldvl,
                       IComplexNumber vr, DataBuffer ldvr,
                       INDArray s, INDArray dif, DataBuffer mm, DataBuffer m );
    DataBuffer ztgsna( DataBuffer matriint, char job, char howmny,
                       DataBuffer select, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber vl, DataBuffer ldvl,
                       IComplexNumber vr, DataBuffer ldvr,
                       INDArray s, INDArray dif, DataBuffer mm,
                       DataBuffer m );

    DataBuffer stgsyl( DataBuffer matriint, char trans, DataBuffer ijob,
                       DataBuffer m, DataBuffer n,  INDArray a,
                       DataBuffer lda,  INDArray b, DataBuffer ldb,
                       INDArray c, DataBuffer ldc,  INDArray d,
                       DataBuffer ldd,  INDArray e, DataBuffer lde,
                       INDArray f, DataBuffer ldf, INDArray scale, INDArray dif );
    DataBuffer dtgsyl( DataBuffer matriint, char trans, DataBuffer ijob,
                       DataBuffer m, DataBuffer n,  INDArray a,
                       DataBuffer lda,  INDArray b, DataBuffer ldb,
                       INDArray c, DataBuffer ldc,  INDArray d,
                       DataBuffer ldd,  INDArray e, DataBuffer lde,
                       INDArray f, DataBuffer ldf, INDArray scale,
                       INDArray dif );
    DataBuffer ctgsyl( DataBuffer matriint, char trans, DataBuffer ijob,
                       DataBuffer m, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber c, DataBuffer ldc,
                       IComplexNumber d, DataBuffer ldd,
                       IComplexNumber e, DataBuffer lde,
                       IComplexNumber f, DataBuffer ldf,
                       INDArray scale, INDArray dif );
    DataBuffer ztgsyl( DataBuffer matriint, char trans, DataBuffer ijob,
                       DataBuffer m, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber c, DataBuffer ldc,
                       IComplexNumber d, DataBuffer ldd,
                       IComplexNumber e, DataBuffer lde,
                       IComplexNumber f, DataBuffer ldf,
                       INDArray scale, INDArray dif );

    DataBuffer stpcon( DataBuffer matriint, char norm, char uplo, char diag,
                       DataBuffer n,  INDArray ap, INDArray rcond );
    DataBuffer dtpcon( DataBuffer matriint, char norm, char uplo, char diag,
                       DataBuffer n,  INDArray ap, INDArray rcond );
    DataBuffer ctpcon( DataBuffer matriint, char norm, char uplo, char diag,
                       DataBuffer n,  IComplexNumber ap,
                       INDArray rcond );
    DataBuffer ztpcon( DataBuffer matriint, char norm, char uplo, char diag,
                       DataBuffer n,  IComplexNumber ap,
                       INDArray rcond );

    DataBuffer stprfs( DataBuffer matriint, char uplo, char trans, char diag,
                       DataBuffer n, DataBuffer nrhs,  INDArray ap,
                       INDArray b, DataBuffer ldb,  INDArray x,
                       DataBuffer ldx, INDArray ferr, INDArray berr );
    DataBuffer dtprfs( DataBuffer matriint, char uplo, char trans, char diag,
                       DataBuffer n, DataBuffer nrhs,  INDArray ap,
                       INDArray b, DataBuffer ldb,  INDArray x,
                       DataBuffer ldx, INDArray ferr, INDArray berr );
    DataBuffer ctprfs( DataBuffer matriint, char uplo, char trans, char diag,
                       DataBuffer n, DataBuffer nrhs,
                       IComplexNumber ap,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx,
                       INDArray ferr, INDArray berr );
    DataBuffer ztprfs( DataBuffer matriint, char uplo, char trans, char diag,
                       DataBuffer n, DataBuffer nrhs,
                       IComplexNumber ap,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx,
                       INDArray ferr, INDArray berr );

    DataBuffer stptri( DataBuffer matriint, char uplo, char diag, DataBuffer n,
                       INDArray ap );
    DataBuffer dtptri( DataBuffer matriint, char uplo, char diag, DataBuffer n,
                       INDArray ap );
    DataBuffer ctptri( DataBuffer matriint, char uplo, char diag, DataBuffer n,
                       IComplexNumber ap );
    DataBuffer ztptri( DataBuffer matriint, char uplo, char diag, DataBuffer n,
                       IComplexNumber ap );

    DataBuffer stptrs( DataBuffer matriint, char uplo, char trans, char diag,
                       DataBuffer n, DataBuffer nrhs,  INDArray ap,
                       INDArray b, DataBuffer ldb );
    DataBuffer dtptrs( DataBuffer matriint, char uplo, char trans, char diag,
                       DataBuffer n, DataBuffer nrhs,  INDArray ap,
                       INDArray b, DataBuffer ldb );
    DataBuffer ctptrs( DataBuffer matriint, char uplo, char trans, char diag,
                       DataBuffer n, DataBuffer nrhs,
                       IComplexNumber ap,
                       IComplexNumber b, DataBuffer ldb );
    DataBuffer ztptrs( DataBuffer matriint, char uplo, char trans, char diag,
                       DataBuffer n, DataBuffer nrhs,
                       IComplexNumber ap,
                       IComplexNumber b, DataBuffer ldb );

    DataBuffer stpttf( DataBuffer matriint, char transr, char uplo,
                       DataBuffer n,  INDArray ap, INDArray arf );
    DataBuffer dtpttf( DataBuffer matriint, char transr, char uplo,
                       DataBuffer n,  INDArray ap, INDArray arf );
    DataBuffer ctpttf( DataBuffer matriint, char transr, char uplo,
                       DataBuffer n,  IComplexNumber ap,
                       IComplexNumber arf );
    DataBuffer ztpttf( DataBuffer matriint, char transr, char uplo,
                       DataBuffer n,  IComplexNumber ap,
                       IComplexNumber arf );

    DataBuffer stpttr( DataBuffer matriint, char uplo, DataBuffer n,
                       INDArray ap, INDArray a, DataBuffer lda );
    DataBuffer dtpttr( DataBuffer matriint, char uplo, DataBuffer n,
                       INDArray ap, INDArray a, DataBuffer lda );
    DataBuffer ctpttr( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber ap,
                       IComplexNumber a, DataBuffer lda );
    DataBuffer ztpttr( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber ap,
                       IComplexNumber a, DataBuffer lda );

    DataBuffer strcon( DataBuffer matriint, char norm, char uplo, char diag,
                       DataBuffer n,  INDArray a, DataBuffer lda,
                       INDArray rcond );
    DataBuffer dtrcon( DataBuffer matriint, char norm, char uplo, char diag,
                       DataBuffer n,  INDArray a, DataBuffer lda,
                       INDArray rcond );
    DataBuffer ctrcon( DataBuffer matriint, char norm, char uplo, char diag,
                       DataBuffer n,  IComplexNumber a,
                       DataBuffer lda, INDArray rcond );
    DataBuffer ztrcon( DataBuffer matriint, char norm, char uplo, char diag,
                       DataBuffer n,  IComplexNumber a,
                       DataBuffer lda, INDArray rcond );

    DataBuffer strevc( DataBuffer matriint, char side, char howmny,
                       DataBuffer select, DataBuffer n,  INDArray t,
                       DataBuffer ldt, INDArray vl, DataBuffer ldvl,
                       INDArray vr, DataBuffer ldvr, DataBuffer mm,
                       DataBuffer m );
    DataBuffer dtrevc( DataBuffer matriint, char side, char howmny,
                       DataBuffer select, DataBuffer n,
                       INDArray t, DataBuffer ldt, INDArray vl,
                       DataBuffer ldvl, INDArray vr, DataBuffer ldvr,
                       DataBuffer mm, DataBuffer m );
    DataBuffer ctrevc( DataBuffer matriint, char side, char howmny,
                       DataBuffer select, DataBuffer n,
                       IComplexNumber t, DataBuffer ldt,
                       IComplexNumber vl, DataBuffer ldvl,
                       IComplexNumber vr, DataBuffer ldvr,
                       DataBuffer mm, DataBuffer m );
    DataBuffer ztrevc( DataBuffer matriint, char side, char howmny,
                       DataBuffer select, DataBuffer n,
                       IComplexNumber t, DataBuffer ldt,
                       IComplexNumber vl, DataBuffer ldvl,
                       IComplexNumber vr, DataBuffer ldvr,
                       DataBuffer mm, DataBuffer m );

    DataBuffer strexc( DataBuffer matriint, char compq, DataBuffer n, INDArray t,
                       DataBuffer ldt, INDArray q, DataBuffer ldq,
                       DataBuffer ifst, DataBuffer ilst );
    DataBuffer dtrexc( DataBuffer matriint, char compq, DataBuffer n,
                       INDArray t, DataBuffer ldt, INDArray q, DataBuffer ldq,
                       DataBuffer ifst, DataBuffer ilst );
    DataBuffer ctrexc( DataBuffer matriint, char compq, DataBuffer n,
                       IComplexNumber t, DataBuffer ldt,
                       IComplexNumber q, DataBuffer ldq,
                       DataBuffer ifst, DataBuffer ilst );
    DataBuffer ztrexc( DataBuffer matriint, char compq, DataBuffer n,
                       IComplexNumber t, DataBuffer ldt,
                       IComplexNumber q, DataBuffer ldq,
                       DataBuffer ifst, DataBuffer ilst );

    DataBuffer strrfs( DataBuffer matriint, char uplo, char trans, char diag,
                       DataBuffer n, DataBuffer nrhs,  INDArray a,
                       DataBuffer lda,  INDArray b, DataBuffer ldb,
                       INDArray x, DataBuffer ldx, INDArray ferr,
                       INDArray berr );
    DataBuffer dtrrfs( DataBuffer matriint, char uplo, char trans, char diag,
                       DataBuffer n, DataBuffer nrhs,  INDArray a,
                       DataBuffer lda,  INDArray b, DataBuffer ldb,
                       INDArray x, DataBuffer ldx, INDArray ferr,
                       INDArray berr );
    DataBuffer ctrrfs( DataBuffer matriint, char uplo, char trans, char diag,
                       DataBuffer n, DataBuffer nrhs,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx,
                       INDArray ferr, INDArray berr );
    DataBuffer ztrrfs( DataBuffer matriint, char uplo, char trans, char diag,
                       DataBuffer n, DataBuffer nrhs,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber x, DataBuffer ldx,
                       INDArray ferr, INDArray berr );

    DataBuffer strsen( DataBuffer matriint, char job, char compq,
                       DataBuffer select, DataBuffer n, INDArray t,
                       DataBuffer ldt, INDArray q, DataBuffer ldq, INDArray wr,
                       INDArray wi, DataBuffer m, INDArray s, INDArray sep );
    DataBuffer dtrsen( DataBuffer matriint, char job, char compq,
                       DataBuffer select, DataBuffer n,
                       INDArray t, DataBuffer ldt, INDArray q, DataBuffer ldq,
                       INDArray wr, INDArray wi, DataBuffer m, INDArray s,
                       INDArray sep );
    DataBuffer ctrsen( DataBuffer matriint, char job, char compq,
                       DataBuffer select, DataBuffer n,
                       IComplexNumber t, DataBuffer ldt,
                       IComplexNumber q, DataBuffer ldq,
                       IComplexNumber w, DataBuffer m, INDArray s,
                       INDArray sep );
    DataBuffer ztrsen( DataBuffer matriint, char job, char compq,
                       DataBuffer select, DataBuffer n,
                       IComplexNumber t, DataBuffer ldt,
                       IComplexNumber q, DataBuffer ldq,
                       IComplexNumber w, DataBuffer m, INDArray s,
                       INDArray sep );

    DataBuffer strsna( DataBuffer matriint, char job, char howmny,
                       DataBuffer select, DataBuffer n,
                       INDArray t, DataBuffer ldt,  INDArray vl,
                       DataBuffer ldvl,  INDArray vr, DataBuffer ldvr,
                       INDArray s, INDArray sep, DataBuffer mm, DataBuffer m );
    DataBuffer dtrsna( DataBuffer matriint, char job, char howmny,
                       DataBuffer select, DataBuffer n,
                       INDArray t, DataBuffer ldt,  INDArray vl,
                       DataBuffer ldvl,  INDArray vr, DataBuffer ldvr,
                       INDArray s, INDArray sep, DataBuffer mm,
                       DataBuffer m );
    DataBuffer ctrsna( DataBuffer matriint, char job, char howmny,
                       DataBuffer select, DataBuffer n,
                       IComplexNumber t, DataBuffer ldt,
                       IComplexNumber vl, DataBuffer ldvl,
                       IComplexNumber vr, DataBuffer ldvr,
                       INDArray s, INDArray sep, DataBuffer mm, DataBuffer m );
    DataBuffer ztrsna( DataBuffer matriint, char job, char howmny,
                       DataBuffer select, DataBuffer n,
                       IComplexNumber t, DataBuffer ldt,
                       IComplexNumber vl, DataBuffer ldvl,
                       IComplexNumber vr, DataBuffer ldvr,
                       INDArray s, INDArray sep, DataBuffer mm,
                       DataBuffer m );

    DataBuffer strsyl( DataBuffer matriint, char trana, char tranb,
                       DataBuffer isgn, DataBuffer m, DataBuffer n,
                       INDArray a, DataBuffer lda,  INDArray b,
                       DataBuffer ldb, INDArray c, DataBuffer ldc,
                       INDArray scale );
    DataBuffer dtrsyl( DataBuffer matriint, char trana, char tranb,
                       DataBuffer isgn, DataBuffer m, DataBuffer n,
                       INDArray a, DataBuffer lda,  INDArray b,
                       DataBuffer ldb, INDArray c, DataBuffer ldc,
                       INDArray scale );
    DataBuffer ctrsyl( DataBuffer matriint, char trana, char tranb,
                       DataBuffer isgn, DataBuffer m, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber c, DataBuffer ldc,
                       INDArray scale );
    DataBuffer ztrsyl( DataBuffer matriint, char trana, char tranb,
                       DataBuffer isgn, DataBuffer m, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber c, DataBuffer ldc,
                       INDArray scale );

    DataBuffer strtri( DataBuffer matriint, char uplo, char diag, DataBuffer n,
                       INDArray a, DataBuffer lda );
    DataBuffer dtrtri( DataBuffer matriint, char uplo, char diag, DataBuffer n,
                       INDArray a, DataBuffer lda );
    DataBuffer ctrtri( DataBuffer matriint, char uplo, char diag, DataBuffer n,
                       IComplexNumber a, DataBuffer lda );
    DataBuffer ztrtri( DataBuffer matriint, char uplo, char diag, DataBuffer n,
                       IComplexNumber a, DataBuffer lda );

    DataBuffer strtrs( DataBuffer matriint, char uplo, char trans, char diag,
                       DataBuffer n, DataBuffer nrhs,  INDArray a,
                       DataBuffer lda, INDArray b, DataBuffer ldb );
    DataBuffer dtrtrs( DataBuffer matriint, char uplo, char trans, char diag,
                       DataBuffer n, DataBuffer nrhs,  INDArray a,
                       DataBuffer lda, INDArray b, DataBuffer ldb );
    DataBuffer ctrtrs( DataBuffer matriint, char uplo, char trans, char diag,
                       DataBuffer n, DataBuffer nrhs,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber b, DataBuffer ldb );
    DataBuffer ztrtrs( DataBuffer matriint, char uplo, char trans, char diag,
                       DataBuffer n, DataBuffer nrhs,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber b, DataBuffer ldb );

    DataBuffer strttf( DataBuffer matriint, char transr, char uplo,
                       DataBuffer n,  INDArray a, DataBuffer lda,
                       INDArray arf );
    DataBuffer dtrttf( DataBuffer matriint, char transr, char uplo,
                       DataBuffer n,  INDArray a, DataBuffer lda,
                       INDArray arf );
    DataBuffer ctrttf( DataBuffer matriint, char transr, char uplo,
                       DataBuffer n,  IComplexNumber a,
                       DataBuffer lda, IComplexNumber arf );
    DataBuffer ztrttf( DataBuffer matriint, char transr, char uplo,
                       DataBuffer n,  IComplexNumber a,
                       DataBuffer lda, IComplexNumber arf );

    DataBuffer strttp( DataBuffer matriint, char uplo, DataBuffer n,
                       INDArray a, DataBuffer lda, INDArray ap );
    DataBuffer dtrttp( DataBuffer matriint, char uplo, DataBuffer n,
                       INDArray a, DataBuffer lda, INDArray ap );
    DataBuffer ctrttp( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber ap );
    DataBuffer ztrttp( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber ap );

    DataBuffer stzrzf( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       INDArray a, DataBuffer lda, INDArray tau );
    DataBuffer dtzrzf( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       INDArray a, DataBuffer lda, INDArray tau );
    DataBuffer ctzrzf( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber tau );
    DataBuffer ztzrzf( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber tau );

    DataBuffer cungbr( DataBuffer matriint, char vect, DataBuffer m,
                       DataBuffer n, DataBuffer k, IComplexNumber a,
                       DataBuffer lda,  IComplexNumber tau );
    DataBuffer zungbr( DataBuffer matriint, char vect, DataBuffer m,
                       DataBuffer n, DataBuffer k, IComplexNumber a,
                       DataBuffer lda,  IComplexNumber tau );

    DataBuffer cunghr( DataBuffer matriint, DataBuffer n, DataBuffer ilo,
                       DataBuffer ihi, IComplexNumber a,
                       DataBuffer lda,  IComplexNumber tau );
    DataBuffer zunghr( DataBuffer matriint, DataBuffer n, DataBuffer ilo,
                       DataBuffer ihi, IComplexNumber a,
                       DataBuffer lda,  IComplexNumber tau );

    DataBuffer cunglq( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer k, IComplexNumber a,
                       DataBuffer lda,  IComplexNumber tau );
    DataBuffer zunglq( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer k, IComplexNumber a,
                       DataBuffer lda,  IComplexNumber tau );

    DataBuffer cungql( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer k, IComplexNumber a,
                       DataBuffer lda,  IComplexNumber tau );
    DataBuffer zungql( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer k, IComplexNumber a,
                       DataBuffer lda,  IComplexNumber tau );

    DataBuffer cungqr( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer k, IComplexNumber a,
                       DataBuffer lda,  IComplexNumber tau );
    DataBuffer zungqr( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer k, IComplexNumber a,
                       DataBuffer lda,  IComplexNumber tau );

    DataBuffer cungrq( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer k, IComplexNumber a,
                       DataBuffer lda,  IComplexNumber tau );
    DataBuffer zungrq( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer k, IComplexNumber a,
                       DataBuffer lda,  IComplexNumber tau );

    DataBuffer cungtr( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber tau );
    DataBuffer zungtr( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber tau );

    DataBuffer cunmbr( DataBuffer matriint, char vect, char side, char trans,
                       DataBuffer m, DataBuffer n, DataBuffer k,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber tau,
                       IComplexNumber c, DataBuffer ldc );
    DataBuffer zunmbr( DataBuffer matriint, char vect, char side, char trans,
                       DataBuffer m, DataBuffer n, DataBuffer k,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber tau,
                       IComplexNumber c, DataBuffer ldc );

    DataBuffer cunmhr( DataBuffer matriint, char side, char trans,
                       DataBuffer m, DataBuffer n, DataBuffer ilo,
                       DataBuffer ihi,  IComplexNumber a,
                       DataBuffer lda,  IComplexNumber tau,
                       IComplexNumber c, DataBuffer ldc );
    DataBuffer zunmhr( DataBuffer matriint, char side, char trans,
                       DataBuffer m, DataBuffer n, DataBuffer ilo,
                       DataBuffer ihi,  IComplexNumber a,
                       DataBuffer lda,  IComplexNumber tau,
                       IComplexNumber c, DataBuffer ldc );

    DataBuffer cunmlq( DataBuffer matriint, char side, char trans,
                       DataBuffer m, DataBuffer n, DataBuffer k,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber tau,
                       IComplexNumber c, DataBuffer ldc );
    DataBuffer zunmlq( DataBuffer matriint, char side, char trans,
                       DataBuffer m, DataBuffer n, DataBuffer k,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber tau,
                       IComplexNumber c, DataBuffer ldc );

    DataBuffer cunmql( DataBuffer matriint, char side, char trans,
                       DataBuffer m, DataBuffer n, DataBuffer k,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber tau,
                       IComplexNumber c, DataBuffer ldc );
    DataBuffer zunmql( DataBuffer matriint, char side, char trans,
                       DataBuffer m, DataBuffer n, DataBuffer k,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber tau,
                       IComplexNumber c, DataBuffer ldc );

    DataBuffer cunmqr( DataBuffer matriint, char side, char trans,
                       DataBuffer m, DataBuffer n, DataBuffer k,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber tau,
                       IComplexNumber c, DataBuffer ldc );
    DataBuffer zunmqr( DataBuffer matriint, char side, char trans,
                       DataBuffer m, DataBuffer n, DataBuffer k,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber tau,
                       IComplexNumber c, DataBuffer ldc );

    DataBuffer cunmrq( DataBuffer matriint, char side, char trans,
                       DataBuffer m, DataBuffer n, DataBuffer k,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber tau,
                       IComplexNumber c, DataBuffer ldc );
    DataBuffer zunmrq( DataBuffer matriint, char side, char trans,
                       DataBuffer m, DataBuffer n, DataBuffer k,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber tau,
                       IComplexNumber c, DataBuffer ldc );

    DataBuffer cunmrz( DataBuffer matriint, char side, char trans,
                       DataBuffer m, DataBuffer n, DataBuffer k,
                       DataBuffer l,  IComplexNumber a,
                       DataBuffer lda,  IComplexNumber tau,
                       IComplexNumber c, DataBuffer ldc );
    DataBuffer zunmrz( DataBuffer matriint, char side, char trans,
                       DataBuffer m, DataBuffer n, DataBuffer k,
                       DataBuffer l,  IComplexNumber a,
                       DataBuffer lda,  IComplexNumber tau,
                       IComplexNumber c, DataBuffer ldc );

    DataBuffer cunmtr( DataBuffer matriint, char side, char uplo, char trans,
                       DataBuffer m, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber tau,
                       IComplexNumber c, DataBuffer ldc );
    DataBuffer zunmtr( DataBuffer matriint, char side, char uplo, char trans,
                       DataBuffer m, DataBuffer n,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber tau,
                       IComplexNumber c, DataBuffer ldc );

    DataBuffer cupgtr( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber ap,
                       IComplexNumber tau,
                       IComplexNumber q, DataBuffer ldq );
    DataBuffer zupgtr( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber ap,
                       IComplexNumber tau,
                       IComplexNumber q, DataBuffer ldq );

    DataBuffer cupmtr( DataBuffer matriint, char side, char uplo, char trans,
                       DataBuffer m, DataBuffer n,
                       IComplexNumber ap,
                       IComplexNumber tau,
                       IComplexNumber c, DataBuffer ldc );
    DataBuffer zupmtr( DataBuffer matriint, char side, char uplo, char trans,
                       DataBuffer m, DataBuffer n,
                       IComplexNumber ap,
                       IComplexNumber tau,
                       IComplexNumber c, DataBuffer ldc );

    DataBuffer sbdsdint( DataBuffer matriint, char uplo, char compq,
                         DataBuffer n, INDArray d, INDArray e, INDArray u,
                         DataBuffer ldu, INDArray vt, DataBuffer ldvt,
                         INDArray q, DataBuffer iq, INDArray work,
                         DataBuffer iwork );
    DataBuffer dbdsdint( DataBuffer matriint, char uplo, char compq,
                         DataBuffer n, INDArray d, INDArray e, INDArray u,
                         DataBuffer ldu, INDArray vt, DataBuffer ldvt,
                         INDArray q, DataBuffer iq, INDArray work,
                         DataBuffer iwork );

    DataBuffer sbdsvdint( DataBuffer matriint, char uplo, char jobz, char range,
                          DataBuffer n, INDArray d, INDArray e,
                          DataBuffer vl, DataBuffer vu,
                          DataBuffer il, DataBuffer iu, DataBuffer ns,
                          INDArray s, INDArray z, DataBuffer ldz,
                          INDArray work, DataBuffer iwork );
    DataBuffer dbdsvdint( DataBuffer matriint, char uplo, char jobz, char range,
                          DataBuffer n, INDArray d, INDArray e,
                          DataBuffer vl, DataBuffer vu,
                          DataBuffer il, DataBuffer iu, DataBuffer ns,
                          INDArray s, INDArray z, DataBuffer ldz,
                          INDArray work, DataBuffer iwork );

    DataBuffer sbdsqint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer ncvt, DataBuffer nru, DataBuffer ncc,
                         INDArray d, INDArray e, INDArray vt, DataBuffer ldvt,
                         INDArray u, DataBuffer ldu, INDArray c,
                         DataBuffer ldc, INDArray work );
    DataBuffer dbdsqint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer ncvt, DataBuffer nru, DataBuffer ncc,
                         INDArray d, INDArray e, INDArray vt,
                         DataBuffer ldvt, INDArray u, DataBuffer ldu,
                         INDArray c, DataBuffer ldc, INDArray work );
    DataBuffer cbdsqint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer ncvt, DataBuffer nru, DataBuffer ncc,
                         INDArray d, INDArray e, IComplexNumber vt,
                         DataBuffer ldvt, IComplexNumber u,
                         DataBuffer ldu, IComplexNumber c,
                         DataBuffer ldc, INDArray work );
    DataBuffer zbdsqint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer ncvt, DataBuffer nru, DataBuffer ncc,
                         INDArray d, INDArray e, IComplexNumber vt,
                         DataBuffer ldvt, IComplexNumber u,
                         DataBuffer ldu, IComplexNumber c,
                         DataBuffer ldc, INDArray work );

    DataBuffer sdisnint( char job, DataBuffer m, DataBuffer n,
                         INDArray d, INDArray sep );
    DataBuffer ddisnint( char job, DataBuffer m, DataBuffer n,
                         INDArray d, INDArray sep );

    DataBuffer sgbbrint( DataBuffer matriint, char vect, DataBuffer m,
                         DataBuffer n, DataBuffer ncc, DataBuffer kl,
                         DataBuffer ku, INDArray ab, DataBuffer ldab,
                         INDArray d, INDArray e, INDArray q, DataBuffer ldq,
                         INDArray pt, DataBuffer ldpt, INDArray c,
                         DataBuffer ldc, INDArray work );
    DataBuffer dgbbrint( DataBuffer matriint, char vect, DataBuffer m,
                         DataBuffer n, DataBuffer ncc, DataBuffer kl,
                         DataBuffer ku, INDArray ab, DataBuffer ldab,
                         INDArray d, INDArray e, INDArray q, DataBuffer ldq,
                         INDArray pt, DataBuffer ldpt, INDArray c,
                         DataBuffer ldc, INDArray work );
    DataBuffer cgbbrint( DataBuffer matriint, char vect, DataBuffer m,
                         DataBuffer n, DataBuffer ncc, DataBuffer kl,
                         DataBuffer ku, IComplexNumber ab,
                         DataBuffer ldab, INDArray d, INDArray e,
                         IComplexNumber q, DataBuffer ldq,
                         IComplexNumber pt, DataBuffer ldpt,
                         IComplexNumber c, DataBuffer ldc,
                         IComplexNumber work, INDArray rwork );
    DataBuffer zgbbrint( DataBuffer matriint, char vect, DataBuffer m,
                         DataBuffer n, DataBuffer ncc, DataBuffer kl,
                         DataBuffer ku, IComplexNumber ab,
                         DataBuffer ldab, INDArray d, INDArray e,
                         IComplexNumber q, DataBuffer ldq,
                         IComplexNumber pt, DataBuffer ldpt,
                         IComplexNumber c, DataBuffer ldc,
                         IComplexNumber work, INDArray rwork );

    DataBuffer sgbcoint( DataBuffer matriint, char norm, DataBuffer n,
                         DataBuffer kl, DataBuffer ku,  INDArray ab,
                         DataBuffer ldab,  DataBuffer ipiv,
                         float anorm, INDArray rcond, INDArray work,
                         DataBuffer iwork );
    DataBuffer dgbcoint( DataBuffer matriint, char norm, DataBuffer n,
                         DataBuffer kl, DataBuffer ku,  INDArray ab,
                         DataBuffer ldab,  DataBuffer ipiv,
                         double anorm, INDArray rcond, INDArray work,
                         DataBuffer iwork );
    DataBuffer cgbcoint( DataBuffer matriint, char norm, DataBuffer n,
                         DataBuffer kl, DataBuffer ku,
                         IComplexNumber ab, DataBuffer ldab,
                         DataBuffer ipiv, float anorm,
                         INDArray rcond, IComplexNumber work,
                         INDArray rwork );
    DataBuffer zgbcoint( DataBuffer matriint, char norm, DataBuffer n,
                         DataBuffer kl, DataBuffer ku,
                         IComplexNumber ab,
                         DataBuffer ldab,  DataBuffer ipiv,
                         double anorm, INDArray rcond,
                         IComplexNumber work, INDArray rwork );

    DataBuffer sgbeqint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer kl, DataBuffer ku,  INDArray ab,
                         DataBuffer ldab, INDArray r, INDArray c,
                         INDArray rowcnd, INDArray colcnd, INDArray amax );
    DataBuffer dgbeqint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer kl, DataBuffer ku,  INDArray ab,
                         DataBuffer ldab, INDArray r, INDArray c,
                         INDArray rowcnd, INDArray colcnd, INDArray amax );
    DataBuffer cgbeqint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer kl, DataBuffer ku,
                         IComplexNumber ab, DataBuffer ldab,
                         INDArray r, INDArray c, INDArray rowcnd,
                         INDArray colcnd, INDArray amax );
    DataBuffer zgbeqint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer kl, DataBuffer ku,
                         IComplexNumber ab,
                         DataBuffer ldab, INDArray r, INDArray c,
                         INDArray rowcnd, INDArray colcnd, INDArray amax );

    DataBuffer sgbequint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                          DataBuffer kl, DataBuffer ku,  INDArray ab,
                          DataBuffer ldab, INDArray r, INDArray c,
                          INDArray rowcnd, INDArray colcnd, INDArray amax );
    DataBuffer dgbequint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                          DataBuffer kl, DataBuffer ku,  INDArray ab,
                          DataBuffer ldab, INDArray r, INDArray c,
                          INDArray rowcnd, INDArray colcnd, INDArray amax );
    DataBuffer cgbequint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                          DataBuffer kl, DataBuffer ku,
                          IComplexNumber ab,
                          DataBuffer ldab, INDArray r, INDArray c,
                          INDArray rowcnd, INDArray colcnd, INDArray amax );
    DataBuffer zgbequint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                          DataBuffer kl, DataBuffer ku,
                          IComplexNumber ab,
                          DataBuffer ldab, INDArray r, INDArray c,
                          INDArray rowcnd, INDArray colcnd, INDArray amax );

    DataBuffer sgbrfint( DataBuffer matriint, char trans, DataBuffer n,
                         DataBuffer kl, DataBuffer ku, DataBuffer nrhs,
                         INDArray ab, DataBuffer ldab,
                         INDArray afb, DataBuffer ldafb,
                         DataBuffer ipiv,  INDArray b,
                         DataBuffer ldb, INDArray x, DataBuffer ldx,
                         INDArray ferr, INDArray berr, INDArray work,
                         DataBuffer iwork );
    DataBuffer dgbrfint( DataBuffer matriint, char trans, DataBuffer n,
                         DataBuffer kl, DataBuffer ku, DataBuffer nrhs,
                         INDArray ab, DataBuffer ldab,
                         INDArray afb, DataBuffer ldafb,
                         DataBuffer ipiv,  INDArray b,
                         DataBuffer ldb, INDArray x, DataBuffer ldx,
                         INDArray ferr, INDArray berr, INDArray work,
                         DataBuffer iwork );
    DataBuffer cgbrfint( DataBuffer matriint, char trans, DataBuffer n,
                         DataBuffer kl, DataBuffer ku, DataBuffer nrhs,
                         IComplexNumber ab, DataBuffer ldab,
                         IComplexNumber afb,
                         DataBuffer ldafb,  DataBuffer ipiv,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber x, DataBuffer ldx,
                         INDArray ferr, INDArray berr,
                         IComplexNumber work, INDArray rwork );
    DataBuffer zgbrfint( DataBuffer matriint, char trans, DataBuffer n,
                         DataBuffer kl, DataBuffer ku, DataBuffer nrhs,
                         IComplexNumber ab,
                         DataBuffer ldab,
                         IComplexNumber afb,
                         DataBuffer ldafb,  DataBuffer ipiv,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber x, DataBuffer ldx,
                         INDArray ferr, INDArray berr,
                         IComplexNumber work, INDArray rwork );

    DataBuffer sgbrfsint( DataBuffer matriint, char trans, char equed,
                          DataBuffer n, DataBuffer kl, DataBuffer ku,
                          DataBuffer nrhs,  INDArray ab,
                          DataBuffer ldab,  INDArray afb,
                          DataBuffer ldafb,  DataBuffer ipiv,
                          INDArray r,  INDArray c,  INDArray b,
                          DataBuffer ldb, INDArray x, DataBuffer ldx,
                          INDArray rcond, INDArray berr,
                          DataBuffer int_bnds, INDArray erint_norm,
                          INDArray erint_comp, DataBuffer nparams,
                          INDArray params, INDArray work,
                          DataBuffer iwork );
    DataBuffer dgbrfsint( DataBuffer matriint, char trans, char equed,
                          DataBuffer n, DataBuffer kl, DataBuffer ku,
                          DataBuffer nrhs,  INDArray ab,
                          DataBuffer ldab,  INDArray afb,
                          DataBuffer ldafb,  DataBuffer ipiv,
                          INDArray r,  INDArray c,
                          INDArray b, DataBuffer ldb, INDArray x,
                          DataBuffer ldx, INDArray rcond, INDArray berr,
                          DataBuffer int_bnds, INDArray erint_norm,
                          INDArray erint_comp, DataBuffer nparams,
                          INDArray params, INDArray work,
                          DataBuffer iwork );
    DataBuffer cgbrfsint( DataBuffer matriint, char trans, char equed,
                          DataBuffer n, DataBuffer kl, DataBuffer ku,
                          DataBuffer nrhs,
                          IComplexNumber ab,
                          DataBuffer ldab,
                          IComplexNumber afb,
                          DataBuffer ldafb,  DataBuffer ipiv,
                          INDArray r,  INDArray c,
                          IComplexNumber b, DataBuffer ldb,
                          IComplexNumber x, DataBuffer ldx,
                          INDArray rcond, INDArray berr,
                          DataBuffer int_bnds, INDArray erint_norm,
                          INDArray erint_comp, DataBuffer nparams,
                          INDArray params, IComplexNumber work,
                          INDArray rwork );
    DataBuffer zgbrfsint( DataBuffer matriint, char trans, char equed,
                          DataBuffer n, DataBuffer kl, DataBuffer ku,
                          DataBuffer nrhs,
                          IComplexNumber ab,
                          DataBuffer ldab,
                          IComplexNumber afb,
                          DataBuffer ldafb,  DataBuffer ipiv,
                          INDArray r,  INDArray c,
                          IComplexNumber b, DataBuffer ldb,
                          IComplexNumber x, DataBuffer ldx,
                          INDArray rcond, INDArray berr,
                          DataBuffer int_bnds, INDArray erint_norm,
                          INDArray erint_comp, DataBuffer nparams,
                          INDArray params, IComplexNumber work,
                          INDArray rwork );

    DataBuffer sgbsint( DataBuffer matriint, DataBuffer n, DataBuffer kl,
                        DataBuffer ku, DataBuffer nrhs, INDArray ab,
                        DataBuffer ldab, DataBuffer ipiv, INDArray b,
                        DataBuffer ldb );
    DataBuffer dgbsint( DataBuffer matriint, DataBuffer n, DataBuffer kl,
                        DataBuffer ku, DataBuffer nrhs, INDArray ab,
                        DataBuffer ldab, DataBuffer ipiv, INDArray b,
                        DataBuffer ldb );
    DataBuffer cgbsint( DataBuffer matriint, DataBuffer n, DataBuffer kl,
                        DataBuffer ku, DataBuffer nrhs,
                        IComplexNumber ab, DataBuffer ldab,
                        DataBuffer ipiv, IComplexNumber b,
                        DataBuffer ldb );
    DataBuffer zgbsint( DataBuffer matriint, DataBuffer n, DataBuffer kl,
                        DataBuffer ku, DataBuffer nrhs,
                        IComplexNumber ab, DataBuffer ldab,
                        DataBuffer ipiv, IComplexNumber b,
                        DataBuffer ldb );

    DataBuffer sgbsvint( DataBuffer matriint, char fact, char trans,
                         DataBuffer n, DataBuffer kl, DataBuffer ku,
                         DataBuffer nrhs, INDArray ab, DataBuffer ldab,
                         INDArray afb, DataBuffer ldafb, DataBuffer ipiv,
                         String equed, INDArray r, INDArray c, INDArray b,
                         DataBuffer ldb, INDArray x, DataBuffer ldx,
                         INDArray rcond, INDArray ferr, INDArray berr,
                         INDArray work, DataBuffer iwork );
    DataBuffer dgbsvint( DataBuffer matriint, char fact, char trans,
                         DataBuffer n, DataBuffer kl, DataBuffer ku,
                         DataBuffer nrhs, INDArray ab, DataBuffer ldab,
                         INDArray afb, DataBuffer ldafb, DataBuffer ipiv,
                         String equed, INDArray r, INDArray c, INDArray b,
                         DataBuffer ldb, INDArray x, DataBuffer ldx,
                         INDArray rcond, INDArray ferr, INDArray berr,
                         INDArray work, DataBuffer iwork );
    DataBuffer cgbsvint( DataBuffer matriint, char fact, char trans,
                         DataBuffer n, DataBuffer kl, DataBuffer ku,
                         DataBuffer nrhs, IComplexNumber ab,
                         DataBuffer ldab, IComplexNumber afb,
                         DataBuffer ldafb, DataBuffer ipiv, String equed,
                         INDArray r, INDArray c, IComplexNumber b,
                         DataBuffer ldb, IComplexNumber x,
                         DataBuffer ldx, INDArray rcond, INDArray ferr,
                         INDArray berr, IComplexNumber work,
                         INDArray rwork );
    DataBuffer zgbsvint( DataBuffer matriint, char fact, char trans,
                         DataBuffer n, DataBuffer kl, DataBuffer ku,
                         DataBuffer nrhs, IComplexNumber ab,
                         DataBuffer ldab, IComplexNumber afb,
                         DataBuffer ldafb, DataBuffer ipiv, String equed,
                         INDArray r, INDArray c, IComplexNumber b,
                         DataBuffer ldb, IComplexNumber x,
                         DataBuffer ldx, INDArray rcond, INDArray ferr,
                         INDArray berr, IComplexNumber work,
                         INDArray rwork );

    DataBuffer sgbsvxint( DataBuffer matriint, char fact, char trans,
                          DataBuffer n, DataBuffer kl, DataBuffer ku,
                          DataBuffer nrhs, INDArray ab, DataBuffer ldab,
                          INDArray afb, DataBuffer ldafb, DataBuffer ipiv,
                          String equed, INDArray r, INDArray c, INDArray b,
                          DataBuffer ldb, INDArray x, DataBuffer ldx,
                          INDArray rcond, INDArray rpvgrw, INDArray berr,
                          DataBuffer int_bnds, INDArray erint_norm,
                          INDArray erint_comp, DataBuffer nparams,
                          INDArray params, INDArray work,
                          DataBuffer iwork );
    DataBuffer dgbsvxint( DataBuffer matriint, char fact, char trans,
                          DataBuffer n, DataBuffer kl, DataBuffer ku,
                          DataBuffer nrhs, INDArray ab, DataBuffer ldab,
                          INDArray afb, DataBuffer ldafb,
                          DataBuffer ipiv, String equed, INDArray r,
                          INDArray c, INDArray b, DataBuffer ldb,
                          INDArray x, DataBuffer ldx, INDArray rcond,
                          INDArray rpvgrw, INDArray berr,
                          DataBuffer int_bnds, INDArray erint_norm,
                          INDArray erint_comp, DataBuffer nparams,
                          INDArray params, INDArray work,
                          DataBuffer iwork );
    DataBuffer cgbsvxint( DataBuffer matriint, char fact, char trans,
                          DataBuffer n, DataBuffer kl, DataBuffer ku,
                          DataBuffer nrhs, IComplexNumber ab,
                          DataBuffer ldab, IComplexNumber afb,
                          DataBuffer ldafb, DataBuffer ipiv,
                          String equed, INDArray r, INDArray c,
                          IComplexNumber b, DataBuffer ldb,
                          IComplexNumber x, DataBuffer ldx,
                          INDArray rcond, INDArray rpvgrw, INDArray berr,
                          DataBuffer int_bnds, INDArray erint_norm,
                          INDArray erint_comp, DataBuffer nparams,
                          INDArray params, IComplexNumber work,
                          INDArray rwork );
    DataBuffer zgbsvxint( DataBuffer matriint, char fact, char trans,
                          DataBuffer n, DataBuffer kl, DataBuffer ku,
                          DataBuffer nrhs, IComplexNumber ab,
                          DataBuffer ldab, IComplexNumber afb,
                          DataBuffer ldafb, DataBuffer ipiv,
                          String equed, INDArray r, INDArray c,
                          IComplexNumber b, DataBuffer ldb,
                          IComplexNumber x, DataBuffer ldx,
                          INDArray rcond, INDArray rpvgrw, INDArray berr,
                          DataBuffer int_bnds, INDArray erint_norm,
                          INDArray erint_comp, DataBuffer nparams,
                          INDArray params, IComplexNumber work,
                          INDArray rwork );

    DataBuffer sgbtrint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer kl, DataBuffer ku, INDArray ab,
                         DataBuffer ldab, DataBuffer ipiv );
    DataBuffer dgbtrint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer kl, DataBuffer ku, INDArray ab,
                         DataBuffer ldab, DataBuffer ipiv );
    DataBuffer cgbtrint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer kl, DataBuffer ku,
                         IComplexNumber ab, DataBuffer ldab,
                         DataBuffer ipiv );
    DataBuffer zgbtrint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer kl, DataBuffer ku,
                         IComplexNumber ab, DataBuffer ldab,
                         DataBuffer ipiv );

    DataBuffer sgbtrint( DataBuffer matriint, char trans, DataBuffer n,
                         DataBuffer kl, DataBuffer ku, DataBuffer nrhs,
                         INDArray ab, DataBuffer ldab,
                         DataBuffer ipiv, INDArray b,
                         DataBuffer ldb );
    DataBuffer dgbtrint( DataBuffer matriint, char trans, DataBuffer n,
                         DataBuffer kl, DataBuffer ku, DataBuffer nrhs,
                         INDArray ab, DataBuffer ldab,
                         DataBuffer ipiv, INDArray b,
                         DataBuffer ldb );
    DataBuffer cgbtrint( DataBuffer matriint, char trans, DataBuffer n,
                         DataBuffer kl, DataBuffer ku, DataBuffer nrhs,
                         IComplexNumber ab, DataBuffer ldab,
                         DataBuffer ipiv, IComplexNumber b,
                         DataBuffer ldb );
    DataBuffer zgbtrint( DataBuffer matriint, char trans, DataBuffer n,
                         DataBuffer kl, DataBuffer ku, DataBuffer nrhs,
                         IComplexNumber ab,
                         DataBuffer ldab,  DataBuffer ipiv,
                         IComplexNumber b, DataBuffer ldb );

    DataBuffer sgebaint( DataBuffer matriint, char job, char side,
                         DataBuffer n, DataBuffer ilo, DataBuffer ihi,
                         INDArray scale, DataBuffer m, INDArray v,
                         DataBuffer ldv );
    DataBuffer dgebaint( DataBuffer matriint, char job, char side,
                         DataBuffer n, DataBuffer ilo, DataBuffer ihi,
                         INDArray scale, DataBuffer m, INDArray v,
                         DataBuffer ldv );
    DataBuffer cgebaint( DataBuffer matriint, char job, char side,
                         DataBuffer n, DataBuffer ilo, DataBuffer ihi,
                         INDArray scale, DataBuffer m,
                         IComplexNumber v, DataBuffer ldv );
    DataBuffer zgebaint( DataBuffer matriint, char job, char side,
                         DataBuffer n, DataBuffer ilo, DataBuffer ihi,
                         INDArray scale, DataBuffer m,
                         IComplexNumber v, DataBuffer ldv );

    DataBuffer sgebaint( DataBuffer matriint, char job, DataBuffer n,
                         INDArray a, DataBuffer lda, DataBuffer ilo,
                         DataBuffer ihi, INDArray scale );
    DataBuffer dgebaint( DataBuffer matriint, char job, DataBuffer n,
                         INDArray a, DataBuffer lda, DataBuffer ilo,
                         DataBuffer ihi, INDArray scale );
    DataBuffer cgebaint( DataBuffer matriint, char job, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         DataBuffer ilo, DataBuffer ihi,
                         INDArray scale );
    DataBuffer zgebaint( DataBuffer matriint, char job, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         DataBuffer ilo, DataBuffer ihi,
                         INDArray scale );

    DataBuffer sgebrint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         INDArray a, DataBuffer lda, INDArray d, INDArray e,
                         INDArray tauq, INDArray taup, INDArray work,
                         DataBuffer lwork );
    DataBuffer dgebrint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         INDArray a, DataBuffer lda, INDArray d, INDArray e,
                         INDArray tauq, INDArray taup, INDArray work,
                         DataBuffer lwork );
    DataBuffer cgebrint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         INDArray d, INDArray e, IComplexNumber tauq,
                         IComplexNumber taup,
                         IComplexNumber work, DataBuffer lwork );
    DataBuffer zgebrint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         INDArray d, INDArray e,
                         IComplexNumber tauq,
                         IComplexNumber taup,
                         IComplexNumber work, DataBuffer lwork );

    DataBuffer sgecoint( DataBuffer matriint, char norm, DataBuffer n,
                         INDArray a, DataBuffer lda, float anorm,
                         INDArray rcond, INDArray work, DataBuffer iwork );
    DataBuffer dgecoint( DataBuffer matriint, char norm, DataBuffer n,
                         INDArray a, DataBuffer lda, double anorm,
                         INDArray rcond, INDArray work,
                         DataBuffer iwork );
    DataBuffer cgecoint( DataBuffer matriint, char norm, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         float anorm, INDArray rcond,
                         IComplexNumber work, INDArray rwork );
    DataBuffer zgecoint( DataBuffer matriint, char norm, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         double anorm, INDArray rcond,
                         IComplexNumber work, INDArray rwork );

    DataBuffer sgeeqint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         INDArray a, DataBuffer lda, INDArray r,
                         INDArray c, INDArray rowcnd, INDArray colcnd,
                         INDArray amax );
    DataBuffer dgeeqint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         INDArray a, DataBuffer lda, INDArray r,
                         INDArray c, INDArray rowcnd, INDArray colcnd,
                         INDArray amax );
    DataBuffer cgeeqint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         INDArray r, INDArray c, INDArray rowcnd,
                         INDArray colcnd, INDArray amax );
    DataBuffer zgeeqint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         INDArray r, INDArray c, INDArray rowcnd,
                         INDArray colcnd, INDArray amax );

    DataBuffer sgeequint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                          INDArray a, DataBuffer lda, INDArray r,
                          INDArray c, INDArray rowcnd, INDArray colcnd,
                          INDArray amax );
    DataBuffer dgeequint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                          INDArray a, DataBuffer lda, INDArray r,
                          INDArray c, INDArray rowcnd, INDArray colcnd,
                          INDArray amax );
    DataBuffer cgeequint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                          IComplexNumber a, DataBuffer lda,
                          INDArray r, INDArray c, INDArray rowcnd,
                          INDArray colcnd, INDArray amax );
    DataBuffer zgeequint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                          IComplexNumber a, DataBuffer lda,
                          INDArray r, INDArray c, INDArray rowcnd,
                          INDArray colcnd, INDArray amax );

    DataBuffer sgeeint( DataBuffer matriint, char jobvs, char sort,
                        int select, DataBuffer n, INDArray a,
                        DataBuffer lda, DataBuffer sdim, INDArray wr,
                        INDArray wi, INDArray vs, DataBuffer ldvs,
                        INDArray work, DataBuffer lwork,
                        DataBuffer bwork );
    DataBuffer dgeeint( DataBuffer matriint, char jobvs, char sort,
                        int select, DataBuffer n, INDArray a,
                        DataBuffer lda, DataBuffer sdim, INDArray wr,
                        INDArray wi, INDArray vs, DataBuffer ldvs,
                        INDArray work, DataBuffer lwork,
                        DataBuffer bwork );
    DataBuffer cgeeint( DataBuffer matriint, char jobvs, char sort,
                        int select, DataBuffer n,
                        IComplexNumber a, DataBuffer lda,
                        DataBuffer sdim, IComplexNumber w,
                        IComplexNumber vs, DataBuffer ldvs,
                        IComplexNumber work, DataBuffer lwork,
                        INDArray rwork, DataBuffer bwork );
    DataBuffer zgeeint( DataBuffer matriint, char jobvs, char sort,
                        int select, DataBuffer n,
                        IComplexNumber a, DataBuffer lda,
                        DataBuffer sdim, IComplexNumber w,
                        IComplexNumber vs, DataBuffer ldvs,
                        IComplexNumber work, DataBuffer lwork,
                        INDArray rwork, DataBuffer bwork );

    DataBuffer sgeesint( DataBuffer matriint, char jobvs, char sort,
                         int select, char sense,
                         DataBuffer n, INDArray a, DataBuffer lda,
                         DataBuffer sdim, INDArray wr, INDArray wi,
                         INDArray vs, DataBuffer ldvs, INDArray rconde,
                         INDArray rcondv, INDArray work, DataBuffer lwork,
                         DataBuffer iwork, DataBuffer liwork,
                         DataBuffer bwork );
    DataBuffer dgeesint( DataBuffer matriint, char jobvs, char sort,
                         int select, char sense,
                         DataBuffer n, INDArray a, DataBuffer lda,
                         DataBuffer sdim, INDArray wr, INDArray wi,
                         INDArray vs, DataBuffer ldvs, INDArray rconde,
                         INDArray rcondv, INDArray work, DataBuffer lwork,
                         DataBuffer iwork, DataBuffer liwork,
                         DataBuffer bwork );
    DataBuffer cgeesint( DataBuffer matriint, char jobvs, char sort,
                         int select, char sense,
                         DataBuffer n, IComplexNumber a,
                         DataBuffer lda, DataBuffer sdim,
                         IComplexNumber w,
                         IComplexNumber vs, DataBuffer ldvs,
                         INDArray rconde, INDArray rcondv,
                         IComplexNumber work, DataBuffer lwork,
                         INDArray rwork, DataBuffer bwork );
    DataBuffer zgeesint( DataBuffer matriint, char jobvs, char sort,
                         int select, char sense,
                         DataBuffer n, IComplexNumber a,
                         DataBuffer lda, DataBuffer sdim,
                         IComplexNumber w,
                         IComplexNumber vs, DataBuffer ldvs,
                         INDArray rconde, INDArray rcondv,
                         IComplexNumber work, DataBuffer lwork,
                         INDArray rwork, DataBuffer bwork );

    DataBuffer sgeeint( DataBuffer matriint, char jobvl, char jobvr,
                        DataBuffer n, INDArray a, DataBuffer lda,
                        INDArray wr, INDArray wi, INDArray vl, DataBuffer ldvl,
                        INDArray vr, DataBuffer ldvr, INDArray work,
                        DataBuffer lwork );
    DataBuffer dgeeint( DataBuffer matriint, char jobvl, char jobvr,
                        DataBuffer n, INDArray a, DataBuffer lda,
                        INDArray wr, INDArray wi, INDArray vl,
                        DataBuffer ldvl, INDArray vr, DataBuffer ldvr,
                        INDArray work, DataBuffer lwork );
    DataBuffer cgeeint( DataBuffer matriint, char jobvl, char jobvr,
                        DataBuffer n, IComplexNumber a,
                        DataBuffer lda, IComplexNumber w,
                        IComplexNumber vl, DataBuffer ldvl,
                        IComplexNumber vr, DataBuffer ldvr,
                        IComplexNumber work, DataBuffer lwork,
                        INDArray rwork );
    DataBuffer zgeeint( DataBuffer matriint, char jobvl, char jobvr,
                        DataBuffer n, IComplexNumber a,
                        DataBuffer lda, IComplexNumber w,
                        IComplexNumber vl, DataBuffer ldvl,
                        IComplexNumber vr, DataBuffer ldvr,
                        IComplexNumber work, DataBuffer lwork,
                        INDArray rwork );

    DataBuffer sgeevint( DataBuffer matriint, char balanc, char jobvl,
                         char jobvr, char sense, DataBuffer n, INDArray a,
                         DataBuffer lda, INDArray wr, INDArray wi, INDArray vl,
                         DataBuffer ldvl, INDArray vr, DataBuffer ldvr,
                         DataBuffer ilo, DataBuffer ihi, INDArray scale,
                         INDArray abnrm, INDArray rconde, INDArray rcondv,
                         INDArray work, DataBuffer lwork,
                         DataBuffer iwork );
    DataBuffer dgeevint( DataBuffer matriint, char balanc, char jobvl,
                         char jobvr, char sense, DataBuffer n, INDArray a,
                         DataBuffer lda, INDArray wr, INDArray wi,
                         INDArray vl, DataBuffer ldvl, INDArray vr,
                         DataBuffer ldvr, DataBuffer ilo,
                         DataBuffer ihi, INDArray scale, INDArray abnrm,
                         INDArray rconde, INDArray rcondv, INDArray work,
                         DataBuffer lwork, DataBuffer iwork );
    DataBuffer cgeevint( DataBuffer matriint, char balanc, char jobvl,
                         char jobvr, char sense, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber w,
                         IComplexNumber vl, DataBuffer ldvl,
                         IComplexNumber vr, DataBuffer ldvr,
                         DataBuffer ilo, DataBuffer ihi, INDArray scale,
                         INDArray abnrm, INDArray rconde, INDArray rcondv,
                         IComplexNumber work, DataBuffer lwork,
                         INDArray rwork );
    DataBuffer zgeevint( DataBuffer matriint, char balanc, char jobvl,
                         char jobvr, char sense, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber w,
                         IComplexNumber vl, DataBuffer ldvl,
                         IComplexNumber vr, DataBuffer ldvr,
                         DataBuffer ilo, DataBuffer ihi, INDArray scale,
                         INDArray abnrm, INDArray rconde, INDArray rcondv,
                         IComplexNumber work, DataBuffer lwork,
                         INDArray rwork );

    DataBuffer sgehrint( DataBuffer matriint, DataBuffer n, DataBuffer ilo,
                         DataBuffer ihi, INDArray a, DataBuffer lda,
                         INDArray tau, INDArray work, DataBuffer lwork );
    DataBuffer dgehrint( DataBuffer matriint, DataBuffer n, DataBuffer ilo,
                         DataBuffer ihi, INDArray a, DataBuffer lda,
                         INDArray tau, INDArray work, DataBuffer lwork );
    DataBuffer cgehrint( DataBuffer matriint, DataBuffer n, DataBuffer ilo,
                         DataBuffer ihi, IComplexNumber a,
                         DataBuffer lda, IComplexNumber tau,
                         IComplexNumber work, DataBuffer lwork );
    DataBuffer zgehrint( DataBuffer matriint, DataBuffer n, DataBuffer ilo,
                         DataBuffer ihi, IComplexNumber a,
                         DataBuffer lda, IComplexNumber tau,
                         IComplexNumber work, DataBuffer lwork );

    DataBuffer sgejsint( DataBuffer matriint, char joba, char jobu,
                         char jobv, char jobr, char jobt, char jobp,
                         DataBuffer m, DataBuffer n, INDArray a,
                         DataBuffer lda, INDArray sva, INDArray u,
                         DataBuffer ldu, INDArray v, DataBuffer ldv,
                         INDArray work, DataBuffer lwork,
                         DataBuffer iwork );
    DataBuffer dgejsint( DataBuffer matriint, char joba, char jobu,
                         char jobv, char jobr, char jobt, char jobp,
                         DataBuffer m, DataBuffer n, INDArray a,
                         DataBuffer lda, INDArray sva, INDArray u,
                         DataBuffer ldu, INDArray v, DataBuffer ldv,
                         INDArray work, DataBuffer lwork,
                         DataBuffer iwork );
    DataBuffer cgejsint( DataBuffer matriint, char joba, char jobu,
                         char jobv, char jobr, char jobt, char jobp,
                         DataBuffer m, DataBuffer n, IComplexNumber a,
                         DataBuffer lda, INDArray sva, IComplexNumber u,
                         DataBuffer ldu, IComplexNumber v, DataBuffer ldv,
                         IComplexNumber cwork, DataBuffer lwork,
                         INDArray work, DataBuffer lrwork,
                         DataBuffer iwork );
    DataBuffer zgejsint( DataBuffer matriint, char joba, char jobu,
                         char jobv, char jobr, char jobt, char jobp,
                         DataBuffer m, DataBuffer n, IComplexNumber a,
                         DataBuffer lda, INDArray sva, IComplexNumber u,
                         DataBuffer ldu, IComplexNumber v, DataBuffer ldv,
                         IComplexNumber cwork, DataBuffer lwork,
                         INDArray work, DataBuffer lrwork,
                         DataBuffer iwork );

    DataBuffer sgelq2_work( DataBuffer matriint, DataBuffer m, DataBuffer n,
                            INDArray a, DataBuffer lda, INDArray tau,
                            INDArray work );
    DataBuffer dgelq2_work( DataBuffer matriint, DataBuffer m, DataBuffer n,
                            INDArray a, DataBuffer lda, INDArray tau,
                            INDArray work );
    DataBuffer cgelq2_work( DataBuffer matriint, DataBuffer m, DataBuffer n,
                            IComplexNumber a, DataBuffer lda,
                            IComplexNumber tau,
                            IComplexNumber work );
    DataBuffer zgelq2_work( DataBuffer matriint, DataBuffer m, DataBuffer n,
                            IComplexNumber a, DataBuffer lda,
                            IComplexNumber tau,
                            IComplexNumber work );

    DataBuffer sgelqint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         INDArray a, DataBuffer lda, INDArray tau,
                         INDArray work, DataBuffer lwork );
    DataBuffer dgelqint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         INDArray a, DataBuffer lda, INDArray tau,
                         INDArray work, DataBuffer lwork );
    DataBuffer cgelqint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber tau,
                         IComplexNumber work, DataBuffer lwork );
    DataBuffer zgelqint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber tau,
                         IComplexNumber work, DataBuffer lwork );

    DataBuffer sgelint( DataBuffer matriint, char trans, DataBuffer m,
                        DataBuffer n, DataBuffer nrhs, INDArray a,
                        DataBuffer lda, INDArray b, DataBuffer ldb,
                        INDArray work, DataBuffer lwork );
    DataBuffer dgelint( DataBuffer matriint, char trans, DataBuffer m,
                        DataBuffer n, DataBuffer nrhs, INDArray a,
                        DataBuffer lda, INDArray b, DataBuffer ldb,
                        INDArray work, DataBuffer lwork );
    DataBuffer cgelint( DataBuffer matriint, char trans, DataBuffer m,
                        DataBuffer n, DataBuffer nrhs,
                        IComplexNumber a, DataBuffer lda,
                        IComplexNumber b, DataBuffer ldb,
                        IComplexNumber work, DataBuffer lwork );
    DataBuffer zgelint( DataBuffer matriint, char trans, DataBuffer m,
                        DataBuffer n, DataBuffer nrhs,
                        IComplexNumber a, DataBuffer lda,
                        IComplexNumber b, DataBuffer ldb,
                        IComplexNumber work, DataBuffer lwork );

    DataBuffer sgelsint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer nrhs, INDArray a, DataBuffer lda,
                         INDArray b, DataBuffer ldb, INDArray s, float rcond,
                         DataBuffer rank, INDArray work, DataBuffer lwork,
                         DataBuffer iwork );
    DataBuffer dgelsint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer nrhs, INDArray a, DataBuffer lda,
                         INDArray b, DataBuffer ldb, INDArray s,
                         double rcond, DataBuffer rank, INDArray work,
                         DataBuffer lwork, DataBuffer iwork );
    DataBuffer cgelsint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer nrhs, IComplexNumber a,
                         DataBuffer lda, IComplexNumber b,
                         DataBuffer ldb, INDArray s, float rcond,
                         DataBuffer rank, IComplexNumber work,
                         DataBuffer lwork, INDArray rwork,
                         DataBuffer iwork );
    DataBuffer zgelsint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer nrhs, IComplexNumber a,
                         DataBuffer lda, IComplexNumber b,
                         DataBuffer ldb, INDArray s, double rcond,
                         DataBuffer rank, IComplexNumber work,
                         DataBuffer lwork, INDArray rwork,
                         DataBuffer iwork );

    DataBuffer sgelsint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer nrhs, INDArray a, DataBuffer lda,
                         INDArray b, DataBuffer ldb, INDArray s, float rcond,
                         DataBuffer rank, INDArray work,
                         DataBuffer lwork );
    DataBuffer dgelsint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer nrhs, INDArray a, DataBuffer lda,
                         INDArray b, DataBuffer ldb, INDArray s,
                         double rcond, DataBuffer rank, INDArray work,
                         DataBuffer lwork );
    DataBuffer cgelsint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer nrhs, IComplexNumber a,
                         DataBuffer lda, IComplexNumber b,
                         DataBuffer ldb, INDArray s, float rcond,
                         DataBuffer rank, IComplexNumber work,
                         DataBuffer lwork, INDArray rwork );
    DataBuffer zgelsint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer nrhs, IComplexNumber a,
                         DataBuffer lda, IComplexNumber b,
                         DataBuffer ldb, INDArray s, double rcond,
                         DataBuffer rank, IComplexNumber work,
                         DataBuffer lwork, INDArray rwork );

    DataBuffer sgelsint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer nrhs, INDArray a, DataBuffer lda,
                         INDArray b, DataBuffer ldb, DataBuffer jpvt,
                         float rcond, DataBuffer rank, INDArray work,
                         DataBuffer lwork );
    DataBuffer dgelsint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer nrhs, INDArray a, DataBuffer lda,
                         INDArray b, DataBuffer ldb, DataBuffer jpvt,
                         double rcond, DataBuffer rank, INDArray work,
                         DataBuffer lwork );
    DataBuffer cgelsint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer nrhs, IComplexNumber a,
                         DataBuffer lda, IComplexNumber b,
                         DataBuffer ldb, DataBuffer jpvt, float rcond,
                         DataBuffer rank, IComplexNumber work,
                         DataBuffer lwork, INDArray rwork );
    DataBuffer zgelsint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer nrhs, IComplexNumber a,
                         DataBuffer lda, IComplexNumber b,
                         DataBuffer ldb, DataBuffer jpvt, double rcond,
                         DataBuffer rank, IComplexNumber work,
                         DataBuffer lwork, INDArray rwork );

    DataBuffer sgeqlint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         INDArray a, DataBuffer lda, INDArray tau,
                         INDArray work, DataBuffer lwork );
    DataBuffer dgeqlint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         INDArray a, DataBuffer lda, INDArray tau,
                         INDArray work, DataBuffer lwork );
    DataBuffer cgeqlint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber tau,
                         IComplexNumber work, DataBuffer lwork );
    DataBuffer zgeqlint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber tau,
                         IComplexNumber work, DataBuffer lwork );

    DataBuffer sgeqp3_work( DataBuffer matriint, DataBuffer m, DataBuffer n,
                            INDArray a, DataBuffer lda, DataBuffer jpvt,
                            INDArray tau, INDArray work, DataBuffer lwork );
    DataBuffer dgeqp3_work( DataBuffer matriint, DataBuffer m, DataBuffer n,
                            INDArray a, DataBuffer lda, DataBuffer jpvt,
                            INDArray tau, INDArray work, DataBuffer lwork );
    DataBuffer cgeqp3_work( DataBuffer matriint, DataBuffer m, DataBuffer n,
                            IComplexNumber a, DataBuffer lda,
                            DataBuffer jpvt, IComplexNumber tau,
                            IComplexNumber work, DataBuffer lwork,
                            INDArray rwork );
    DataBuffer zgeqp3_work( DataBuffer matriint, DataBuffer m, DataBuffer n,
                            IComplexNumber a, DataBuffer lda,
                            DataBuffer jpvt, IComplexNumber tau,
                            IComplexNumber work, DataBuffer lwork,
                            INDArray rwork );

    DataBuffer sgeqpint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         INDArray a, DataBuffer lda, DataBuffer jpvt,
                         INDArray tau, INDArray work );
    DataBuffer dgeqpint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         INDArray a, DataBuffer lda, DataBuffer jpvt,
                         INDArray tau, INDArray work );
    DataBuffer cgeqpint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         DataBuffer jpvt, IComplexNumber tau,
                         IComplexNumber work, INDArray rwork );
    DataBuffer zgeqpint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         DataBuffer jpvt, IComplexNumber tau,
                         IComplexNumber work, INDArray rwork );

    DataBuffer sgeqr2_work( DataBuffer matriint, DataBuffer m, DataBuffer n,
                            INDArray a, DataBuffer lda, INDArray tau,
                            INDArray work );
    DataBuffer dgeqr2_work( DataBuffer matriint, DataBuffer m, DataBuffer n,
                            INDArray a, DataBuffer lda, INDArray tau,
                            INDArray work );
    DataBuffer cgeqr2_work( DataBuffer matriint, DataBuffer m, DataBuffer n,
                            IComplexNumber a, DataBuffer lda,
                            IComplexNumber tau,
                            IComplexNumber work );
    DataBuffer zgeqr2_work( DataBuffer matriint, DataBuffer m, DataBuffer n,
                            IComplexNumber a, DataBuffer lda,
                            IComplexNumber tau,
                            IComplexNumber work );

    DataBuffer sgeqrint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         INDArray a, DataBuffer lda, INDArray tau,
                         INDArray work, DataBuffer lwork );
    DataBuffer dgeqrint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         INDArray a, DataBuffer lda, INDArray tau,
                         INDArray work, DataBuffer lwork );
    DataBuffer cgeqrint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber tau,
                         IComplexNumber work, DataBuffer lwork );
    DataBuffer zgeqrint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber tau,
                         IComplexNumber work, DataBuffer lwork );

    DataBuffer sgeqrfint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                          INDArray a, DataBuffer lda, INDArray tau,
                          INDArray work, DataBuffer lwork );
    DataBuffer dgeqrfint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                          INDArray a, DataBuffer lda, INDArray tau,
                          INDArray work, DataBuffer lwork );
    DataBuffer cgeqrfint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                          IComplexNumber a, DataBuffer lda,
                          IComplexNumber tau,
                          IComplexNumber work, DataBuffer lwork );
    DataBuffer zgeqrfint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                          IComplexNumber a, DataBuffer lda,
                          IComplexNumber tau,
                          IComplexNumber work,
                          DataBuffer lwork );

    DataBuffer sgerfint( DataBuffer matriint, char trans, DataBuffer n,
                         DataBuffer nrhs,  INDArray a, DataBuffer lda,
                         INDArray af, DataBuffer ldaf,
                         DataBuffer ipiv,  INDArray b,
                         DataBuffer ldb, INDArray x, DataBuffer ldx,
                         INDArray ferr, INDArray berr, INDArray work,
                         DataBuffer iwork );
    DataBuffer dgerfint( DataBuffer matriint, char trans, DataBuffer n,
                         DataBuffer nrhs,  INDArray a,
                         DataBuffer lda,  INDArray af,
                         DataBuffer ldaf,  DataBuffer ipiv,
                         INDArray b, DataBuffer ldb, INDArray x,
                         DataBuffer ldx, INDArray ferr, INDArray berr,
                         INDArray work, DataBuffer iwork );
    DataBuffer cgerfint( DataBuffer matriint, char trans, DataBuffer n,
                         DataBuffer nrhs,  IComplexNumber a,
                         DataBuffer lda,  IComplexNumber af,
                         DataBuffer ldaf,  DataBuffer ipiv,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber x, DataBuffer ldx,
                         INDArray ferr, INDArray berr,
                         IComplexNumber work, INDArray rwork );
    DataBuffer zgerfint( DataBuffer matriint, char trans, DataBuffer n,
                         DataBuffer nrhs,  IComplexNumber a,
                         DataBuffer lda,  IComplexNumber af,
                         DataBuffer ldaf,  DataBuffer ipiv,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber x, DataBuffer ldx,
                         INDArray ferr, INDArray berr,
                         IComplexNumber work, INDArray rwork );

    DataBuffer sgerfsint( DataBuffer matriint, char trans, char equed,
                          DataBuffer n, DataBuffer nrhs,  INDArray a,
                          DataBuffer lda,  INDArray af,
                          DataBuffer ldaf,  DataBuffer ipiv,
                          INDArray r,  INDArray c,  INDArray b,
                          DataBuffer ldb, INDArray x, DataBuffer ldx,
                          INDArray rcond, INDArray berr,
                          DataBuffer int_bnds, INDArray erint_norm,
                          INDArray erint_comp, DataBuffer nparams,
                          INDArray params, INDArray work,
                          DataBuffer iwork );
    DataBuffer dgerfsint( DataBuffer matriint, char trans, char equed,
                          DataBuffer n, DataBuffer nrhs,  INDArray a,
                          DataBuffer lda,  INDArray af,
                          DataBuffer ldaf,  DataBuffer ipiv,
                          INDArray r,  INDArray c,
                          INDArray b, DataBuffer ldb, INDArray x,
                          DataBuffer ldx, INDArray rcond, INDArray berr,
                          DataBuffer int_bnds, INDArray erint_norm,
                          INDArray erint_comp, DataBuffer nparams,
                          INDArray params, INDArray work,
                          DataBuffer iwork );
    DataBuffer cgerfsint( DataBuffer matriint, char trans, char equed,
                          DataBuffer n, DataBuffer nrhs,
                          IComplexNumber a, DataBuffer lda,
                          IComplexNumber af,
                          DataBuffer ldaf,  DataBuffer ipiv,
                          INDArray r,  INDArray c,
                          IComplexNumber b, DataBuffer ldb,
                          IComplexNumber x, DataBuffer ldx,
                          INDArray rcond, INDArray berr,
                          DataBuffer int_bnds, INDArray erint_norm,
                          INDArray erint_comp, DataBuffer nparams,
                          INDArray params, IComplexNumber work,
                          INDArray rwork );
    DataBuffer zgerfsint( DataBuffer matriint, char trans, char equed,
                          DataBuffer n, DataBuffer nrhs,
                          IComplexNumber a, DataBuffer lda,
                          IComplexNumber af,
                          DataBuffer ldaf,  DataBuffer ipiv,
                          INDArray r,  INDArray c,
                          IComplexNumber b, DataBuffer ldb,
                          IComplexNumber x, DataBuffer ldx,
                          INDArray rcond, INDArray berr,
                          DataBuffer int_bnds, INDArray erint_norm,
                          INDArray erint_comp, DataBuffer nparams,
                          INDArray params, IComplexNumber work,
                          INDArray rwork );

    DataBuffer sgerqint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         INDArray a, DataBuffer lda, INDArray tau,
                         INDArray work, DataBuffer lwork );
    DataBuffer dgerqint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         INDArray a, DataBuffer lda, INDArray tau,
                         INDArray work, DataBuffer lwork );
    DataBuffer cgerqint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber tau,
                         IComplexNumber work, DataBuffer lwork );
    DataBuffer zgerqint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber tau,
                         IComplexNumber work, DataBuffer lwork );

    DataBuffer sgesdint( DataBuffer matriint, char jobz, DataBuffer m,
                         DataBuffer n, INDArray a, DataBuffer lda,
                         INDArray s, INDArray u, DataBuffer ldu, INDArray vt,
                         DataBuffer ldvt, INDArray work, DataBuffer lwork,
                         DataBuffer iwork );
    DataBuffer dgesdint( DataBuffer matriint, char jobz, DataBuffer m,
                         DataBuffer n, INDArray a, DataBuffer lda,
                         INDArray s, INDArray u, DataBuffer ldu,
                         INDArray vt, DataBuffer ldvt, INDArray work,
                         DataBuffer lwork, DataBuffer iwork );
    DataBuffer cgesdint( DataBuffer matriint, char jobz, DataBuffer m,
                         DataBuffer n, IComplexNumber a,
                         DataBuffer lda, INDArray s,
                         IComplexNumber u, DataBuffer ldu,
                         IComplexNumber vt, DataBuffer ldvt,
                         IComplexNumber work, DataBuffer lwork,
                         INDArray rwork, DataBuffer iwork );
    DataBuffer zgesdint( DataBuffer matriint, char jobz, DataBuffer m,
                         DataBuffer n, IComplexNumber a,
                         DataBuffer lda, INDArray s,
                         IComplexNumber u, DataBuffer ldu,
                         IComplexNumber vt, DataBuffer ldvt,
                         IComplexNumber work, DataBuffer lwork,
                         INDArray rwork, DataBuffer iwork );

    DataBuffer sgesint( DataBuffer matriint, DataBuffer n, DataBuffer nrhs,
                        INDArray a, DataBuffer lda, DataBuffer ipiv,
                        INDArray b, DataBuffer ldb );
    DataBuffer dgesint( DataBuffer matriint, DataBuffer n, DataBuffer nrhs,
                        INDArray a, DataBuffer lda, DataBuffer ipiv,
                        INDArray b, DataBuffer ldb );
    DataBuffer cgesint( DataBuffer matriint, DataBuffer n, DataBuffer nrhs,
                        IComplexNumber a, DataBuffer lda,
                        DataBuffer ipiv, IComplexNumber b,
                        DataBuffer ldb );
    DataBuffer zgesint( DataBuffer matriint, DataBuffer n, DataBuffer nrhs,
                        IComplexNumber a, DataBuffer lda,
                        DataBuffer ipiv, IComplexNumber b,
                        DataBuffer ldb );
    DataBuffer dsgesint( DataBuffer matriint, DataBuffer n, DataBuffer nrhs,
                         INDArray a, DataBuffer lda, DataBuffer ipiv,
                         INDArray b, DataBuffer ldb, INDArray x,
                         DataBuffer ldx, INDArray work, INDArray swork,
                         DataBuffer iter );
    DataBuffer zcgesint( DataBuffer matriint, DataBuffer n, DataBuffer nrhs,
                         IComplexNumber a, DataBuffer lda,
                         DataBuffer ipiv, IComplexNumber b,
                         DataBuffer ldb, IComplexNumber x,
                         DataBuffer ldx, IComplexNumber work,
                         IComplexNumber swork, INDArray rwork,
                         DataBuffer iter );

    DataBuffer sgesvint( DataBuffer matriint, char jobu, char jobvt,
                         DataBuffer m, DataBuffer n, INDArray a,
                         DataBuffer lda, INDArray s, INDArray u,
                         DataBuffer ldu, INDArray vt, DataBuffer ldvt,
                         INDArray work, DataBuffer lwork );
    DataBuffer dgesvint( DataBuffer matriint, char jobu, char jobvt,
                         DataBuffer m, DataBuffer n, INDArray a,
                         DataBuffer lda, INDArray s, INDArray u,
                         DataBuffer ldu, INDArray vt, DataBuffer ldvt,
                         INDArray work, DataBuffer lwork );
    DataBuffer cgesvint( DataBuffer matriint, char jobu, char jobvt,
                         DataBuffer m, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         INDArray s, IComplexNumber u,
                         DataBuffer ldu, IComplexNumber vt,
                         DataBuffer ldvt, IComplexNumber work,
                         DataBuffer lwork, INDArray rwork );
    DataBuffer zgesvint( DataBuffer matriint, char jobu, char jobvt,
                         DataBuffer m, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         INDArray s, IComplexNumber u,
                         DataBuffer ldu, IComplexNumber vt,
                         DataBuffer ldvt, IComplexNumber work,
                         DataBuffer lwork, INDArray rwork );

    DataBuffer sgesvdint( DataBuffer matriint, char jobu, char jobvt, char range,
                          DataBuffer m, DataBuffer n, INDArray a,
                          DataBuffer lda, DataBuffer vl, DataBuffer vu,
                          DataBuffer il, DataBuffer iu, DataBuffer ns,
                          INDArray s, INDArray u, DataBuffer ldu,
                          INDArray vt, DataBuffer ldvt,
                          INDArray work, DataBuffer lwork, DataBuffer iwork );
    DataBuffer dgesvdint( DataBuffer matriint, char jobu, char jobvt, char range,
                          DataBuffer m, DataBuffer n, INDArray a,
                          DataBuffer lda, DataBuffer vl, DataBuffer vu,
                          DataBuffer il, DataBuffer iu, DataBuffer ns,
                          INDArray s, INDArray u, DataBuffer ldu,
                          INDArray vt, DataBuffer ldvt,
                          INDArray work, DataBuffer lwork, DataBuffer iwork );
    DataBuffer cgesvdint( DataBuffer matriint, char jobu, char jobvt, char range,
                          DataBuffer m, DataBuffer n, IComplexNumber a,
                          DataBuffer lda, DataBuffer vl, DataBuffer vu,
                          DataBuffer il, DataBuffer iu, DataBuffer ns,
                          INDArray s, IComplexNumber u, DataBuffer ldu,
                          IComplexNumber vt, DataBuffer ldvt,
                          IComplexNumber work, DataBuffer lwork,
                          INDArray rwork, DataBuffer iwork );
    DataBuffer zgesvdint( DataBuffer matriint, char jobu, char jobvt, char range,
                          DataBuffer m, DataBuffer n, IComplexNumber a,
                          DataBuffer lda, DataBuffer vl, DataBuffer vu,
                          DataBuffer il, DataBuffer iu, DataBuffer ns,
                          INDArray s, IComplexNumber u, DataBuffer ldu,
                          IComplexNumber vt, DataBuffer ldvt,
                          IComplexNumber work, DataBuffer lwork,
                          INDArray rwork, DataBuffer iwork );

    DataBuffer sgesvint( DataBuffer matriint, char joba, char jobu,
                         char jobv, DataBuffer m, DataBuffer n, INDArray a,
                         DataBuffer lda, INDArray sva, DataBuffer mv,
                         INDArray v, DataBuffer ldv, INDArray work,
                         DataBuffer lwork );
    DataBuffer dgesvint( DataBuffer matriint, char joba, char jobu,
                         char jobv, DataBuffer m, DataBuffer n,
                         INDArray a, DataBuffer lda, INDArray sva,
                         DataBuffer mv, INDArray v, DataBuffer ldv,
                         INDArray work, DataBuffer lwork );
    DataBuffer cgesvint( DataBuffer matriint, char joba, char jobu,
                         char jobv, DataBuffer m, DataBuffer n, IComplexNumber a,
                         DataBuffer lda, INDArray sva, DataBuffer mv,
                         IComplexNumber v, DataBuffer ldv,
                         IComplexNumber cwork, DataBuffer lwork,
                         INDArray rwork,DataBuffer lrwork );
    DataBuffer zgesvint( DataBuffer matriint, char joba, char jobu,
                         char jobv, DataBuffer m, DataBuffer n,
                         IComplexNumber a, DataBuffer lda, INDArray sva,
                         DataBuffer mv, IComplexNumber v, DataBuffer ldv,
                         IComplexNumber cwork, DataBuffer lwork,
                         INDArray rwork, DataBuffer lrwork );

    DataBuffer sgesvint( DataBuffer matriint, char fact, char trans,
                         DataBuffer n, DataBuffer nrhs, INDArray a,
                         DataBuffer lda, INDArray af, DataBuffer ldaf,
                         DataBuffer ipiv, String equed, INDArray r,
                         INDArray c, INDArray b, DataBuffer ldb, INDArray x,
                         DataBuffer ldx, INDArray rcond, INDArray ferr,
                         INDArray berr, INDArray work, DataBuffer iwork );
    DataBuffer dgesvint( DataBuffer matriint, char fact, char trans,
                         DataBuffer n, DataBuffer nrhs, INDArray a,
                         DataBuffer lda, INDArray af, DataBuffer ldaf,
                         DataBuffer ipiv, String equed, INDArray r,
                         INDArray c, INDArray b, DataBuffer ldb, INDArray x,
                         DataBuffer ldx, INDArray rcond, INDArray ferr,
                         INDArray berr, INDArray work, DataBuffer iwork );
    DataBuffer cgesvint( DataBuffer matriint, char fact, char trans,
                         DataBuffer n, DataBuffer nrhs,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber af, DataBuffer ldaf,
                         DataBuffer ipiv, String equed, INDArray r,
                         INDArray c, IComplexNumber b,
                         DataBuffer ldb, IComplexNumber x,
                         DataBuffer ldx, INDArray rcond, INDArray ferr,
                         INDArray berr, IComplexNumber work,
                         INDArray rwork );
    DataBuffer zgesvint( DataBuffer matriint, char fact, char trans,
                         DataBuffer n, DataBuffer nrhs,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber af, DataBuffer ldaf,
                         DataBuffer ipiv, String equed, INDArray r,
                         INDArray c, IComplexNumber b,
                         DataBuffer ldb, IComplexNumber x,
                         DataBuffer ldx, INDArray rcond, INDArray ferr,
                         INDArray berr, IComplexNumber work,
                         INDArray rwork );

    DataBuffer sgesvxint( DataBuffer matriint, char fact, char trans,
                          DataBuffer n, DataBuffer nrhs, INDArray a,
                          DataBuffer lda, INDArray af, DataBuffer ldaf,
                          DataBuffer ipiv, String equed, INDArray r,
                          INDArray c, INDArray b, DataBuffer ldb, INDArray x,
                          DataBuffer ldx, INDArray rcond, INDArray rpvgrw,
                          INDArray berr, DataBuffer int_bnds,
                          INDArray erint_norm, INDArray erint_comp,
                          DataBuffer nparams, INDArray params, INDArray work,
                          DataBuffer iwork );
    DataBuffer dgesvxint( DataBuffer matriint, char fact, char trans,
                          DataBuffer n, DataBuffer nrhs, INDArray a,
                          DataBuffer lda, INDArray af, DataBuffer ldaf,
                          DataBuffer ipiv, String equed, INDArray r,
                          INDArray c, INDArray b, DataBuffer ldb,
                          INDArray x, DataBuffer ldx, INDArray rcond,
                          INDArray rpvgrw, INDArray berr,
                          DataBuffer int_bnds, INDArray erint_norm,
                          INDArray erint_comp, DataBuffer nparams,
                          INDArray params, INDArray work,
                          DataBuffer iwork );
    DataBuffer cgesvxint( DataBuffer matriint, char fact, char trans,
                          DataBuffer n, DataBuffer nrhs,
                          IComplexNumber a, DataBuffer lda,
                          IComplexNumber af, DataBuffer ldaf,
                          DataBuffer ipiv, String equed, INDArray r,
                          INDArray c, IComplexNumber b,
                          DataBuffer ldb, IComplexNumber x,
                          DataBuffer ldx, INDArray rcond, INDArray rpvgrw,
                          INDArray berr, DataBuffer int_bnds,
                          INDArray erint_norm, INDArray erint_comp,
                          DataBuffer nparams, INDArray params,
                          IComplexNumber work, INDArray rwork );
    DataBuffer zgesvxint( DataBuffer matriint, char fact, char trans,
                          DataBuffer n, DataBuffer nrhs,
                          IComplexNumber a, DataBuffer lda,
                          IComplexNumber af, DataBuffer ldaf,
                          DataBuffer ipiv, String equed, INDArray r,
                          INDArray c, IComplexNumber b,
                          DataBuffer ldb, IComplexNumber x,
                          DataBuffer ldx, INDArray rcond, INDArray rpvgrw,
                          INDArray berr, DataBuffer int_bnds,
                          INDArray erint_norm, INDArray erint_comp,
                          DataBuffer nparams, INDArray params,
                          IComplexNumber work, INDArray rwork );

    DataBuffer sgetf2_work( DataBuffer matriint, DataBuffer m, DataBuffer n,
                            INDArray a, DataBuffer lda, DataBuffer ipiv );
    DataBuffer dgetf2_work( DataBuffer matriint, DataBuffer m, DataBuffer n,
                            INDArray a, DataBuffer lda, DataBuffer ipiv );
    DataBuffer cgetf2_work( DataBuffer matriint, DataBuffer m, DataBuffer n,
                            IComplexNumber a, DataBuffer lda,
                            DataBuffer ipiv );
    DataBuffer zgetf2_work( DataBuffer matriint, DataBuffer m, DataBuffer n,
                            IComplexNumber a, DataBuffer lda,
                            DataBuffer ipiv );

    DataBuffer sgetrint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         INDArray a, DataBuffer lda, DataBuffer ipiv );
    DataBuffer dgetrint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         INDArray a, DataBuffer lda, DataBuffer ipiv );
    DataBuffer cgetrint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         DataBuffer ipiv );
    DataBuffer zgetrint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         DataBuffer ipiv );

    DataBuffer sgetrf2_work( DataBuffer matriint, DataBuffer m, DataBuffer n,
                             INDArray a, DataBuffer lda, DataBuffer ipiv );
    DataBuffer dgetrf2_work( DataBuffer matriint, DataBuffer m, DataBuffer n,
                             INDArray a, DataBuffer lda, DataBuffer ipiv );
    DataBuffer cgetrf2_work( DataBuffer matriint, DataBuffer m, DataBuffer n,
                             IComplexNumber a, DataBuffer lda,
                             DataBuffer ipiv );
    DataBuffer zgetrf2_work( DataBuffer matriint, DataBuffer m, DataBuffer n,
                             IComplexNumber a, DataBuffer lda,
                             DataBuffer ipiv );

    DataBuffer sgetrint( DataBuffer matriint, DataBuffer n, INDArray a,
                         DataBuffer lda,  DataBuffer ipiv,
                         INDArray work, DataBuffer lwork );
    DataBuffer dgetrint( DataBuffer matriint, DataBuffer n, INDArray a,
                         DataBuffer lda,  DataBuffer ipiv,
                         INDArray work, DataBuffer lwork );
    DataBuffer cgetrint( DataBuffer matriint, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         DataBuffer ipiv,
                         IComplexNumber work, DataBuffer lwork );
    DataBuffer zgetrint( DataBuffer matriint, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         DataBuffer ipiv,
                         IComplexNumber work, DataBuffer lwork );

    DataBuffer sgetrint( DataBuffer matriint, char trans, DataBuffer n,
                         DataBuffer nrhs,  INDArray a, DataBuffer lda,
                         DataBuffer ipiv, INDArray b,
                         DataBuffer ldb );
    DataBuffer dgetrint( DataBuffer matriint, char trans, DataBuffer n,
                         DataBuffer nrhs,  INDArray a,
                         DataBuffer lda,  DataBuffer ipiv,
                         INDArray b, DataBuffer ldb );
    DataBuffer cgetrint( DataBuffer matriint, char trans, DataBuffer n,
                         DataBuffer nrhs,  IComplexNumber a,
                         DataBuffer lda,  DataBuffer ipiv,
                         IComplexNumber b, DataBuffer ldb );
    DataBuffer zgetrint( DataBuffer matriint, char trans, DataBuffer n,
                         DataBuffer nrhs,  IComplexNumber a,
                         DataBuffer lda,  DataBuffer ipiv,
                         IComplexNumber b, DataBuffer ldb );

    DataBuffer sggbaint( DataBuffer matriint, char job, char side,
                         DataBuffer n, DataBuffer ilo, DataBuffer ihi,
                         INDArray lscale,  INDArray rscale,
                         DataBuffer m, INDArray v, DataBuffer ldv );
    DataBuffer dggbaint( DataBuffer matriint, char job, char side,
                         DataBuffer n, DataBuffer ilo, DataBuffer ihi,
                         INDArray lscale,  INDArray rscale,
                         DataBuffer m, INDArray v, DataBuffer ldv );
    DataBuffer cggbaint( DataBuffer matriint, char job, char side,
                         DataBuffer n, DataBuffer ilo, DataBuffer ihi,
                         INDArray lscale,  INDArray rscale,
                         DataBuffer m, IComplexNumber v,
                         DataBuffer ldv );
    DataBuffer zggbaint( DataBuffer matriint, char job, char side,
                         DataBuffer n, DataBuffer ilo, DataBuffer ihi,
                         INDArray lscale,  INDArray rscale,
                         DataBuffer m, IComplexNumber v,
                         DataBuffer ldv );

    DataBuffer sggbaint( DataBuffer matriint, char job, DataBuffer n,
                         INDArray a, DataBuffer lda, INDArray b,
                         DataBuffer ldb, DataBuffer ilo,
                         DataBuffer ihi, INDArray lscale, INDArray rscale,
                         INDArray work );
    DataBuffer dggbaint( DataBuffer matriint, char job, DataBuffer n,
                         INDArray a, DataBuffer lda, INDArray b,
                         DataBuffer ldb, DataBuffer ilo,
                         DataBuffer ihi, INDArray lscale, INDArray rscale,
                         INDArray work );
    DataBuffer cggbaint( DataBuffer matriint, char job, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber b, DataBuffer ldb,
                         DataBuffer ilo, DataBuffer ihi, INDArray lscale,
                         INDArray rscale, INDArray work );
    DataBuffer zggbaint( DataBuffer matriint, char job, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber b, DataBuffer ldb,
                         DataBuffer ilo, DataBuffer ihi,
                         INDArray lscale, INDArray rscale, INDArray work );

    DataBuffer sggeint( DataBuffer matriint, char jobvsl, char jobvsr,
                        char sort, int selctg, DataBuffer n,
                        INDArray a, DataBuffer lda, INDArray b,
                        DataBuffer ldb, DataBuffer sdim, INDArray alphar,
                        INDArray alphai, INDArray beta, INDArray vsl,
                        DataBuffer ldvsl, INDArray vsr, DataBuffer ldvsr,
                        INDArray work, DataBuffer lwork,
                        DataBuffer bwork );
    DataBuffer dggeint( DataBuffer matriint, char jobvsl, char jobvsr,
                        char sort, int selctg, DataBuffer n,
                        INDArray a, DataBuffer lda, INDArray b,
                        DataBuffer ldb, DataBuffer sdim, INDArray alphar,
                        INDArray alphai, INDArray beta, INDArray vsl,
                        DataBuffer ldvsl, INDArray vsr, DataBuffer ldvsr,
                        INDArray work, DataBuffer lwork,
                        DataBuffer bwork );
    DataBuffer cggeint( DataBuffer matriint, char jobvsl, char jobvsr,
                        char sort, int selctg, DataBuffer n,
                        IComplexNumber a, DataBuffer lda,
                        IComplexNumber b, DataBuffer ldb,
                        DataBuffer sdim, IComplexNumber alpha,
                        IComplexNumber beta,
                        IComplexNumber vsl, DataBuffer ldvsl,
                        IComplexNumber vsr, DataBuffer ldvsr,
                        IComplexNumber work, DataBuffer lwork,
                        INDArray rwork, DataBuffer bwork );
    DataBuffer zggeint( DataBuffer matriint, char jobvsl, char jobvsr,
                        char sort, int selctg, DataBuffer n,
                        IComplexNumber a, DataBuffer lda,
                        IComplexNumber b, DataBuffer ldb,
                        DataBuffer sdim, IComplexNumber alpha,
                        IComplexNumber beta,
                        IComplexNumber vsl, DataBuffer ldvsl,
                        IComplexNumber vsr, DataBuffer ldvsr,
                        IComplexNumber work, DataBuffer lwork,
                        INDArray rwork, DataBuffer bwork );

    DataBuffer sgges3_work( DataBuffer matriint, char jobvsl, char jobvsr,
                            char sort, int selctg,
                            DataBuffer n,
                            INDArray a, DataBuffer lda,
                            INDArray b, DataBuffer ldb, DataBuffer sdim,
                            INDArray alphar, INDArray alphai, INDArray beta,
                            INDArray vsl, DataBuffer ldvsl,
                            INDArray vsr, DataBuffer ldvsr,
                            INDArray work, DataBuffer lwork,
                            DataBuffer bwork );
    DataBuffer dgges3_work( DataBuffer matriint, char jobvsl, char jobvsr,
                            char sort, int selctg,
                            DataBuffer n,
                            INDArray a, DataBuffer lda,
                            INDArray b, DataBuffer ldb, DataBuffer sdim,
                            INDArray alphar, INDArray alphai, INDArray beta,
                            INDArray vsl, DataBuffer ldvsl,
                            INDArray vsr, DataBuffer ldvsr,
                            INDArray work, DataBuffer lwork,
                            DataBuffer bwork );
    DataBuffer cgges3_work( DataBuffer matriint, char jobvsl, char jobvsr,
                            char sort, int selctg,
                            DataBuffer n,
                            IComplexNumber a, DataBuffer lda,
                            IComplexNumber b, DataBuffer ldb,
                            DataBuffer sdim, IComplexNumber alpha,
                            IComplexNumber beta,
                            IComplexNumber vsl, DataBuffer ldvsl,
                            IComplexNumber vsr, DataBuffer ldvsr,
                            IComplexNumber work, DataBuffer lwork,
                            INDArray rwork, DataBuffer bwork );
    DataBuffer zgges3_work( DataBuffer matriint, char jobvsl, char jobvsr,
                            char sort, int selctg,
                            DataBuffer n,
                            IComplexNumber a, DataBuffer lda,
                            IComplexNumber b, DataBuffer ldb,
                            DataBuffer sdim, IComplexNumber alpha,
                            IComplexNumber beta,
                            IComplexNumber vsl, DataBuffer ldvsl,
                            IComplexNumber vsr, DataBuffer ldvsr,
                            IComplexNumber work, DataBuffer lwork,
                            INDArray rwork, DataBuffer bwork );

    DataBuffer sggesint( DataBuffer matriint, char jobvsl, char jobvsr,
                         char sort, int selctg, char sense,
                         DataBuffer n, INDArray a, DataBuffer lda,
                         INDArray b, DataBuffer ldb, DataBuffer sdim,
                         INDArray alphar, INDArray alphai, INDArray beta,
                         INDArray vsl, DataBuffer ldvsl, INDArray vsr,
                         DataBuffer ldvsr, INDArray rconde, INDArray rcondv,
                         INDArray work, DataBuffer lwork,
                         DataBuffer iwork, DataBuffer liwork,
                         DataBuffer bwork );
    DataBuffer dggesint( DataBuffer matriint, char jobvsl, char jobvsr,
                         char sort, int selctg, char sense,
                         DataBuffer n, INDArray a, DataBuffer lda,
                         INDArray b, DataBuffer ldb, DataBuffer sdim,
                         INDArray alphar, INDArray alphai, INDArray beta,
                         INDArray vsl, DataBuffer ldvsl, INDArray vsr,
                         DataBuffer ldvsr, INDArray rconde,
                         INDArray rcondv, INDArray work, DataBuffer lwork,
                         DataBuffer iwork, DataBuffer liwork,
                         DataBuffer bwork );
    DataBuffer cggesint( DataBuffer matriint, char jobvsl, char jobvsr,
                         char sort, int selctg, char sense,
                         DataBuffer n, IComplexNumber a,
                         DataBuffer lda, IComplexNumber b,
                         DataBuffer ldb, DataBuffer sdim,
                         IComplexNumber alpha,
                         IComplexNumber beta,
                         IComplexNumber vsl, DataBuffer ldvsl,
                         IComplexNumber vsr, DataBuffer ldvsr,
                         INDArray rconde, INDArray rcondv,
                         IComplexNumber work, DataBuffer lwork,
                         INDArray rwork, DataBuffer iwork,
                         DataBuffer liwork, DataBuffer bwork );
    DataBuffer zggesint( DataBuffer matriint, char jobvsl, char jobvsr,
                         char sort, int selctg, char sense,
                         DataBuffer n, IComplexNumber a,
                         DataBuffer lda, IComplexNumber b,
                         DataBuffer ldb, DataBuffer sdim,
                         IComplexNumber alpha,
                         IComplexNumber beta,
                         IComplexNumber vsl, DataBuffer ldvsl,
                         IComplexNumber vsr, DataBuffer ldvsr,
                         INDArray rconde, INDArray rcondv,
                         IComplexNumber work, DataBuffer lwork,
                         INDArray rwork, DataBuffer iwork,
                         DataBuffer liwork, DataBuffer bwork );

    DataBuffer sggeint( DataBuffer matriint, char jobvl, char jobvr,
                        DataBuffer n, INDArray a, DataBuffer lda, INDArray b,
                        DataBuffer ldb, INDArray alphar, INDArray alphai,
                        INDArray beta, INDArray vl, DataBuffer ldvl,
                        INDArray vr, DataBuffer ldvr, INDArray work,
                        DataBuffer lwork );
    DataBuffer dggeint( DataBuffer matriint, char jobvl, char jobvr,
                        DataBuffer n, INDArray a, DataBuffer lda,
                        INDArray b, DataBuffer ldb, INDArray alphar,
                        INDArray alphai, INDArray beta, INDArray vl,
                        DataBuffer ldvl, INDArray vr, DataBuffer ldvr,
                        INDArray work, DataBuffer lwork );
    DataBuffer cggeint( DataBuffer matriint, char jobvl, char jobvr,
                        DataBuffer n, IComplexNumber a,
                        DataBuffer lda, IComplexNumber b,
                        DataBuffer ldb, IComplexNumber alpha,
                        IComplexNumber beta,
                        IComplexNumber vl, DataBuffer ldvl,
                        IComplexNumber vr, DataBuffer ldvr,
                        IComplexNumber work, DataBuffer lwork,
                        INDArray rwork );
    DataBuffer zggeint( DataBuffer matriint, char jobvl, char jobvr,
                        DataBuffer n, IComplexNumber a,
                        DataBuffer lda, IComplexNumber b,
                        DataBuffer ldb, IComplexNumber alpha,
                        IComplexNumber beta,
                        IComplexNumber vl, DataBuffer ldvl,
                        IComplexNumber vr, DataBuffer ldvr,
                        IComplexNumber work, DataBuffer lwork,
                        INDArray rwork );

    DataBuffer sggev3_work( DataBuffer matriint, char jobvl, char jobvr,
                            DataBuffer n,
                            INDArray a, DataBuffer lda,
                            INDArray b, DataBuffer ldb,
                            INDArray alphar, INDArray alphai, INDArray beta,
                            INDArray vl, DataBuffer ldvl,
                            INDArray vr, DataBuffer ldvr,
                            INDArray work, DataBuffer lwork );
    DataBuffer dggev3_work( DataBuffer matriint, char jobvl, char jobvr,
                            DataBuffer n,
                            INDArray a, DataBuffer lda,
                            INDArray b, DataBuffer ldb,
                            INDArray alphar, INDArray alphai, INDArray beta,
                            INDArray vl, DataBuffer ldvl,
                            INDArray vr, DataBuffer ldvr,
                            INDArray work, DataBuffer lwork );
    DataBuffer cggev3_work( DataBuffer matriint, char jobvl, char jobvr,
                            DataBuffer n,
                            IComplexNumber a, DataBuffer lda,
                            IComplexNumber b, DataBuffer ldb,
                            IComplexNumber alpha,
                            IComplexNumber beta,
                            IComplexNumber vl, DataBuffer ldvl,
                            IComplexNumber vr, DataBuffer ldvr,
                            IComplexNumber work, DataBuffer lwork,
                            INDArray rwork );
    DataBuffer zggev3_work( DataBuffer matriint, char jobvl, char jobvr,
                            DataBuffer n,
                            IComplexNumber a, DataBuffer lda,
                            IComplexNumber b, DataBuffer ldb,
                            IComplexNumber alpha,
                            IComplexNumber beta,
                            IComplexNumber vl, DataBuffer ldvl,
                            IComplexNumber vr, DataBuffer ldvr,
                            IComplexNumber work, DataBuffer lwork,
                            INDArray rwork );

    DataBuffer sggevint( DataBuffer matriint, char balanc, char jobvl,
                         char jobvr, char sense, DataBuffer n, INDArray a,
                         DataBuffer lda, INDArray b, DataBuffer ldb,
                         INDArray alphar, INDArray alphai, INDArray beta,
                         INDArray vl, DataBuffer ldvl, INDArray vr,
                         DataBuffer ldvr, DataBuffer ilo,
                         DataBuffer ihi, INDArray lscale, INDArray rscale,
                         INDArray abnrm, INDArray bbnrm, INDArray rconde,
                         INDArray rcondv, INDArray work, DataBuffer lwork,
                         DataBuffer iwork, DataBuffer bwork );
    DataBuffer dggevint( DataBuffer matriint, char balanc, char jobvl,
                         char jobvr, char sense, DataBuffer n, INDArray a,
                         DataBuffer lda, INDArray b, DataBuffer ldb,
                         INDArray alphar, INDArray alphai, INDArray beta,
                         INDArray vl, DataBuffer ldvl, INDArray vr,
                         DataBuffer ldvr, DataBuffer ilo,
                         DataBuffer ihi, INDArray lscale, INDArray rscale,
                         INDArray abnrm, INDArray bbnrm, INDArray rconde,
                         INDArray rcondv, INDArray work, DataBuffer lwork,
                         DataBuffer iwork, DataBuffer bwork );
    DataBuffer cggevint( DataBuffer matriint, char balanc, char jobvl,
                         char jobvr, char sense, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber alpha,
                         IComplexNumber beta,
                         IComplexNumber vl, DataBuffer ldvl,
                         IComplexNumber vr, DataBuffer ldvr,
                         DataBuffer ilo, DataBuffer ihi, INDArray lscale,
                         INDArray rscale, INDArray abnrm, INDArray bbnrm,
                         INDArray rconde, INDArray rcondv,
                         IComplexNumber work, DataBuffer lwork,
                         INDArray rwork, DataBuffer iwork,
                         DataBuffer bwork );
    DataBuffer zggevint( DataBuffer matriint, char balanc, char jobvl,
                         char jobvr, char sense, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber alpha,
                         IComplexNumber beta,
                         IComplexNumber vl, DataBuffer ldvl,
                         IComplexNumber vr, DataBuffer ldvr,
                         DataBuffer ilo, DataBuffer ihi,
                         INDArray lscale, INDArray rscale, INDArray abnrm,
                         INDArray bbnrm, INDArray rconde, INDArray rcondv,
                         IComplexNumber work, DataBuffer lwork,
                         INDArray rwork, DataBuffer iwork,
                         DataBuffer bwork );

    DataBuffer sggglint( DataBuffer matriint, DataBuffer n, DataBuffer m,
                         DataBuffer p, INDArray a, DataBuffer lda,
                         INDArray b, DataBuffer ldb, INDArray d, INDArray x,
                         INDArray y, INDArray work, DataBuffer lwork );
    DataBuffer dggglint( DataBuffer matriint, DataBuffer n, DataBuffer m,
                         DataBuffer p, INDArray a, DataBuffer lda,
                         INDArray b, DataBuffer ldb, INDArray d, INDArray x,
                         INDArray y, INDArray work, DataBuffer lwork );
    DataBuffer cggglint( DataBuffer matriint, DataBuffer n, DataBuffer m,
                         DataBuffer p, IComplexNumber a,
                         DataBuffer lda, IComplexNumber b,
                         DataBuffer ldb, IComplexNumber d,
                         IComplexNumber x,
                         IComplexNumber y,
                         IComplexNumber work, DataBuffer lwork );
    DataBuffer zggglint( DataBuffer matriint, DataBuffer n, DataBuffer m,
                         DataBuffer p, IComplexNumber a,
                         DataBuffer lda, IComplexNumber b,
                         DataBuffer ldb, IComplexNumber d,
                         IComplexNumber x,
                         IComplexNumber y,
                         IComplexNumber work, DataBuffer lwork );

    DataBuffer sgghrint( DataBuffer matriint, char compq, char compz,
                         DataBuffer n, DataBuffer ilo, DataBuffer ihi,
                         INDArray a, DataBuffer lda, INDArray b,
                         DataBuffer ldb, INDArray q, DataBuffer ldq,
                         INDArray z, DataBuffer ldz );
    DataBuffer dgghrint( DataBuffer matriint, char compq, char compz,
                         DataBuffer n, DataBuffer ilo, DataBuffer ihi,
                         INDArray a, DataBuffer lda, INDArray b,
                         DataBuffer ldb, INDArray q, DataBuffer ldq,
                         INDArray z, DataBuffer ldz );
    DataBuffer cgghrint( DataBuffer matriint, char compq, char compz,
                         DataBuffer n, DataBuffer ilo, DataBuffer ihi,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber q, DataBuffer ldq,
                         IComplexNumber z, DataBuffer ldz );
    DataBuffer zgghrint( DataBuffer matriint, char compq, char compz,
                         DataBuffer n, DataBuffer ilo, DataBuffer ihi,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber q, DataBuffer ldq,
                         IComplexNumber z, DataBuffer ldz );

    DataBuffer sgghd3_work( DataBuffer matriint, char compq, char compz,
                            DataBuffer n, DataBuffer ilo, DataBuffer ihi,
                            INDArray a, DataBuffer lda,
                            INDArray b, DataBuffer ldb,
                            INDArray q, DataBuffer ldq,
                            INDArray z, DataBuffer ldz,
                            INDArray work, DataBuffer lwork );
    DataBuffer dgghd3_work( DataBuffer matriint, char compq, char compz,
                            DataBuffer n, DataBuffer ilo, DataBuffer ihi,
                            INDArray a, DataBuffer lda,
                            INDArray b, DataBuffer ldb,
                            INDArray q, DataBuffer ldq,
                            INDArray z, DataBuffer ldz,
                            INDArray work, DataBuffer lwork );
    DataBuffer cgghd3_work( DataBuffer matriint, char compq, char compz,
                            DataBuffer n, DataBuffer ilo, DataBuffer ihi,
                            IComplexNumber a, DataBuffer lda,
                            IComplexNumber b, DataBuffer ldb,
                            IComplexNumber q, DataBuffer ldq,
                            IComplexNumber z, DataBuffer ldz,
                            IComplexNumber work, DataBuffer lwork );
    DataBuffer zgghd3_work( DataBuffer matriint, char compq, char compz,
                            DataBuffer n, DataBuffer ilo, DataBuffer ihi,
                            IComplexNumber a, DataBuffer lda,
                            IComplexNumber b, DataBuffer ldb,
                            IComplexNumber q, DataBuffer ldq,
                            IComplexNumber z, DataBuffer ldz,
                            IComplexNumber work,
                            DataBuffer lwork );

    DataBuffer sgglsint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer p, INDArray a, DataBuffer lda,
                         INDArray b, DataBuffer ldb, INDArray c, INDArray d,
                         INDArray x, INDArray work, DataBuffer lwork );
    DataBuffer dgglsint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer p, INDArray a, DataBuffer lda,
                         INDArray b, DataBuffer ldb, INDArray c, INDArray d,
                         INDArray x, INDArray work, DataBuffer lwork );
    DataBuffer cgglsint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer p, IComplexNumber a,
                         DataBuffer lda, IComplexNumber b,
                         DataBuffer ldb, IComplexNumber c,
                         IComplexNumber d,
                         IComplexNumber x,
                         IComplexNumber work, DataBuffer lwork );
    DataBuffer zgglsint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer p, IComplexNumber a,
                         DataBuffer lda, IComplexNumber b,
                         DataBuffer ldb, IComplexNumber c,
                         IComplexNumber d,
                         IComplexNumber x,
                         IComplexNumber work, DataBuffer lwork );

    DataBuffer sggqrint( DataBuffer matriint, DataBuffer n, DataBuffer m,
                         DataBuffer p, INDArray a, DataBuffer lda,
                         INDArray taua, INDArray b, DataBuffer ldb,
                         INDArray taub, INDArray work, DataBuffer lwork );
    DataBuffer dggqrint( DataBuffer matriint, DataBuffer n, DataBuffer m,
                         DataBuffer p, INDArray a, DataBuffer lda,
                         INDArray taua, INDArray b, DataBuffer ldb,
                         INDArray taub, INDArray work, DataBuffer lwork );
    DataBuffer cggqrint( DataBuffer matriint, DataBuffer n, DataBuffer m,
                         DataBuffer p, IComplexNumber a,
                         DataBuffer lda, IComplexNumber taua,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber taub,
                         IComplexNumber work, DataBuffer lwork );
    DataBuffer zggqrint( DataBuffer matriint, DataBuffer n, DataBuffer m,
                         DataBuffer p, IComplexNumber a,
                         DataBuffer lda, IComplexNumber taua,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber taub,
                         IComplexNumber work, DataBuffer lwork );

    DataBuffer sggrqint( DataBuffer matriint, DataBuffer m, DataBuffer p,
                         DataBuffer n, INDArray a, DataBuffer lda,
                         INDArray taua, INDArray b, DataBuffer ldb,
                         INDArray taub, INDArray work, DataBuffer lwork );
    DataBuffer dggrqint( DataBuffer matriint, DataBuffer m, DataBuffer p,
                         DataBuffer n, INDArray a, DataBuffer lda,
                         INDArray taua, INDArray b, DataBuffer ldb,
                         INDArray taub, INDArray work, DataBuffer lwork );
    DataBuffer cggrqint( DataBuffer matriint, DataBuffer m, DataBuffer p,
                         DataBuffer n, IComplexNumber a,
                         DataBuffer lda, IComplexNumber taua,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber taub,
                         IComplexNumber work, DataBuffer lwork );
    DataBuffer zggrqint( DataBuffer matriint, DataBuffer m, DataBuffer p,
                         DataBuffer n, IComplexNumber a,
                         DataBuffer lda, IComplexNumber taua,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber taub,
                         IComplexNumber work, DataBuffer lwork );

    DataBuffer sggsvint( DataBuffer matriint, char jobu, char jobv,
                         char jobq, DataBuffer m, DataBuffer n,
                         DataBuffer p, DataBuffer k, DataBuffer l,
                         INDArray a, DataBuffer lda, INDArray b,
                         DataBuffer ldb, INDArray alpha, INDArray beta,
                         INDArray u, DataBuffer ldu, INDArray v,
                         DataBuffer ldv, INDArray q, DataBuffer ldq,
                         INDArray work, DataBuffer iwork );
    DataBuffer dggsvint( DataBuffer matriint, char jobu, char jobv,
                         char jobq, DataBuffer m, DataBuffer n,
                         DataBuffer p, DataBuffer k, DataBuffer l,
                         INDArray a, DataBuffer lda, INDArray b,
                         DataBuffer ldb, INDArray alpha, INDArray beta,
                         INDArray u, DataBuffer ldu, INDArray v,
                         DataBuffer ldv, INDArray q, DataBuffer ldq,
                         INDArray work, DataBuffer iwork );
    DataBuffer cggsvint( DataBuffer matriint, char jobu, char jobv,
                         char jobq, DataBuffer m, DataBuffer n,
                         DataBuffer p, DataBuffer k, DataBuffer l,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber b, DataBuffer ldb,
                         INDArray alpha, INDArray beta,
                         IComplexNumber u, DataBuffer ldu,
                         IComplexNumber v, DataBuffer ldv,
                         IComplexNumber q, DataBuffer ldq,
                         IComplexNumber work, INDArray rwork,
                         DataBuffer iwork );
    DataBuffer zggsvint( DataBuffer matriint, char jobu, char jobv,
                         char jobq, DataBuffer m, DataBuffer n,
                         DataBuffer p, DataBuffer k, DataBuffer l,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber b, DataBuffer ldb,
                         INDArray alpha, INDArray beta,
                         IComplexNumber u, DataBuffer ldu,
                         IComplexNumber v, DataBuffer ldv,
                         IComplexNumber q, DataBuffer ldq,
                         IComplexNumber work, INDArray rwork,
                         DataBuffer iwork );

    DataBuffer sggsvd3_work( DataBuffer matriint, char jobu, char jobv,
                             char jobq, DataBuffer m, DataBuffer n,
                             DataBuffer p, DataBuffer k, DataBuffer l,
                             INDArray a, DataBuffer lda, INDArray b,
                             DataBuffer ldb, INDArray alpha, INDArray beta,
                             INDArray u, DataBuffer ldu, INDArray v,
                             DataBuffer ldv, INDArray q, DataBuffer ldq,
                             INDArray work, DataBuffer lwork,
                             DataBuffer iwork );
    DataBuffer dggsvd3_work( DataBuffer matriint, char jobu, char jobv,
                             char jobq, DataBuffer m, DataBuffer n,
                             DataBuffer p, DataBuffer k, DataBuffer l,
                             INDArray a, DataBuffer lda, INDArray b,
                             DataBuffer ldb, INDArray alpha, INDArray beta,
                             INDArray u, DataBuffer ldu, INDArray v,
                             DataBuffer ldv, INDArray q, DataBuffer ldq,
                             INDArray work, DataBuffer lwork,
                             DataBuffer iwork );
    DataBuffer cggsvd3_work( DataBuffer matriint, char jobu, char jobv,
                             char jobq, DataBuffer m, DataBuffer n,
                             DataBuffer p, DataBuffer k, DataBuffer l,
                             IComplexNumber a, DataBuffer lda,
                             IComplexNumber b, DataBuffer ldb,
                             INDArray alpha, INDArray beta,
                             IComplexNumber u, DataBuffer ldu,
                             IComplexNumber v, DataBuffer ldv,
                             IComplexNumber q, DataBuffer ldq,
                             IComplexNumber work, DataBuffer lwork,
                             INDArray rwork, DataBuffer iwork );
    DataBuffer zggsvd3_work( DataBuffer matriint, char jobu, char jobv,
                             char jobq, DataBuffer m, DataBuffer n,
                             DataBuffer p, DataBuffer k, DataBuffer l,
                             IComplexNumber a, DataBuffer lda,
                             IComplexNumber b, DataBuffer ldb,
                             INDArray alpha, INDArray beta,
                             IComplexNumber u, DataBuffer ldu,
                             IComplexNumber v, DataBuffer ldv,
                             IComplexNumber q, DataBuffer ldq,
                             IComplexNumber work, DataBuffer lwork,
                             INDArray rwork, DataBuffer iwork );

    DataBuffer sggsvint( DataBuffer matriint, char jobu, char jobv,
                         char jobq, DataBuffer m, DataBuffer p,
                         DataBuffer n, INDArray a, DataBuffer lda,
                         INDArray b, DataBuffer ldb, float tola,
                         float tolb, DataBuffer k, DataBuffer l,
                         INDArray u, DataBuffer ldu, INDArray v,
                         DataBuffer ldv, INDArray q, DataBuffer ldq,
                         DataBuffer iwork, INDArray tau, INDArray work );
    DataBuffer dggsvint( DataBuffer matriint, char jobu, char jobv,
                         char jobq, DataBuffer m, DataBuffer p,
                         DataBuffer n, INDArray a, DataBuffer lda,
                         INDArray b, DataBuffer ldb, double tola,
                         double tolb, DataBuffer k, DataBuffer l,
                         INDArray u, DataBuffer ldu, INDArray v,
                         DataBuffer ldv, INDArray q, DataBuffer ldq,
                         DataBuffer iwork, INDArray tau, INDArray work );
    DataBuffer cggsvint( DataBuffer matriint, char jobu, char jobv,
                         char jobq, DataBuffer m, DataBuffer p,
                         DataBuffer n, IComplexNumber a,
                         DataBuffer lda, IComplexNumber b,
                         DataBuffer ldb, float tola, float tolb,
                         DataBuffer k, DataBuffer l,
                         IComplexNumber u, DataBuffer ldu,
                         IComplexNumber v, DataBuffer ldv,
                         IComplexNumber q, DataBuffer ldq,
                         DataBuffer iwork, INDArray rwork,
                         IComplexNumber tau,
                         IComplexNumber work );
    DataBuffer zggsvint( DataBuffer matriint, char jobu, char jobv,
                         char jobq, DataBuffer m, DataBuffer p,
                         DataBuffer n, IComplexNumber a,
                         DataBuffer lda, IComplexNumber b,
                         DataBuffer ldb, double tola, double tolb,
                         DataBuffer k, DataBuffer l,
                         IComplexNumber u, DataBuffer ldu,
                         IComplexNumber v, DataBuffer ldv,
                         IComplexNumber q, DataBuffer ldq,
                         DataBuffer iwork, INDArray rwork,
                         IComplexNumber tau,
                         IComplexNumber work );

    DataBuffer sggsvp3_work( DataBuffer matriint, char jobu, char jobv,
                             char jobq, DataBuffer m, DataBuffer p,
                             DataBuffer n, INDArray a, DataBuffer lda,
                             INDArray b, DataBuffer ldb, float tola,
                             float tolb, DataBuffer k, DataBuffer l,
                             INDArray u, DataBuffer ldu, INDArray v,
                             DataBuffer ldv, INDArray q, DataBuffer ldq,
                             DataBuffer iwork, INDArray tau,
                             INDArray work, DataBuffer lwork );
    DataBuffer dggsvp3_work( DataBuffer matriint, char jobu, char jobv,
                             char jobq, DataBuffer m, DataBuffer p,
                             DataBuffer n, INDArray a, DataBuffer lda,
                             INDArray b, DataBuffer ldb, double tola,
                             double tolb, DataBuffer k, DataBuffer l,
                             INDArray u, DataBuffer ldu, INDArray v,
                             DataBuffer ldv, INDArray q, DataBuffer ldq,
                             DataBuffer iwork, INDArray tau, INDArray work,
                             DataBuffer lwork );
    DataBuffer cggsvp3_work( DataBuffer matriint, char jobu, char jobv,
                             char jobq, DataBuffer m, DataBuffer p,
                             DataBuffer n, IComplexNumber a,
                             DataBuffer lda, IComplexNumber b,
                             DataBuffer ldb, float tola, float tolb,
                             DataBuffer k, DataBuffer l,
                             IComplexNumber u, DataBuffer ldu,
                             IComplexNumber v, DataBuffer ldv,
                             IComplexNumber q, DataBuffer ldq,
                             DataBuffer iwork, INDArray rwork,
                             IComplexNumber tau,
                             IComplexNumber work, DataBuffer lwork );
    DataBuffer zggsvp3_work( DataBuffer matriint, char jobu, char jobv,
                             char jobq, DataBuffer m, DataBuffer p,
                             DataBuffer n, IComplexNumber a,
                             DataBuffer lda, IComplexNumber b,
                             DataBuffer ldb, double tola, double tolb,
                             DataBuffer k, DataBuffer l,
                             IComplexNumber u, DataBuffer ldu,
                             IComplexNumber v, DataBuffer ldv,
                             IComplexNumber q, DataBuffer ldq,
                             DataBuffer iwork, INDArray rwork,
                             IComplexNumber tau,
                             IComplexNumber work, DataBuffer lwork );

    DataBuffer sgtcoint( char norm, DataBuffer n,  INDArray dl,
                         INDArray d,  INDArray du,
                         INDArray du2,  DataBuffer ipiv,
                         float anorm, INDArray rcond, INDArray work,
                         DataBuffer iwork );
    DataBuffer dgtcoint( char norm, DataBuffer n,  INDArray dl,
                         INDArray d,  INDArray du,
                         INDArray du2,  DataBuffer ipiv,
                         double anorm, INDArray rcond, INDArray work,
                         DataBuffer iwork );
    DataBuffer cgtcoint( char norm, DataBuffer n,
                         IComplexNumber dl,
                         IComplexNumber d,
                         IComplexNumber du,
                         IComplexNumber du2,
                         DataBuffer ipiv, float anorm,
                         INDArray rcond, IComplexNumber work );
    DataBuffer zgtcoint( char norm, DataBuffer n,
                         IComplexNumber dl,
                         IComplexNumber d,
                         IComplexNumber du,
                         IComplexNumber du2,
                         DataBuffer ipiv, double anorm,
                         INDArray rcond, IComplexNumber work );

    DataBuffer sgtrfint( DataBuffer matriint, char trans, DataBuffer n,
                         DataBuffer nrhs,  INDArray dl,
                         INDArray d,  INDArray du,
                         INDArray dlf,  INDArray df,
                         INDArray duf,  INDArray du2,
                         DataBuffer ipiv,  INDArray b,
                         DataBuffer ldb, INDArray x, DataBuffer ldx,
                         INDArray ferr, INDArray berr, INDArray work,
                         DataBuffer iwork );
    DataBuffer dgtrfint( DataBuffer matriint, char trans, DataBuffer n,
                         DataBuffer nrhs,  INDArray dl,
                         INDArray d,  INDArray du,
                         INDArray dlf,  INDArray df,
                         INDArray duf,  INDArray du2,
                         DataBuffer ipiv,  INDArray b,
                         DataBuffer ldb, INDArray x, DataBuffer ldx,
                         INDArray ferr, INDArray berr, INDArray work,
                         DataBuffer iwork );
    DataBuffer cgtrfint( DataBuffer matriint, char trans, DataBuffer n,
                         DataBuffer nrhs,  IComplexNumber dl,
                         IComplexNumber d,
                         IComplexNumber du,
                         IComplexNumber dlf,
                         IComplexNumber df,
                         IComplexNumber duf,
                         IComplexNumber du2,
                         DataBuffer ipiv,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber x, DataBuffer ldx,
                         INDArray ferr, INDArray berr,
                         IComplexNumber work, INDArray rwork );
    DataBuffer zgtrfint( DataBuffer matriint, char trans, DataBuffer n,
                         DataBuffer nrhs,
                         IComplexNumber dl,
                         IComplexNumber d,
                         IComplexNumber du,
                         IComplexNumber dlf,
                         IComplexNumber df,
                         IComplexNumber duf,
                         IComplexNumber du2,
                         DataBuffer ipiv,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber x, DataBuffer ldx,
                         INDArray ferr, INDArray berr,
                         IComplexNumber work, INDArray rwork );

    DataBuffer sgtsint( DataBuffer matriint, DataBuffer n, DataBuffer nrhs,
                        INDArray dl, INDArray d, INDArray du, INDArray b,
                        DataBuffer ldb );
    DataBuffer dgtsint( DataBuffer matriint, DataBuffer n, DataBuffer nrhs,
                        INDArray dl, INDArray d, INDArray du, INDArray b,
                        DataBuffer ldb );
    DataBuffer cgtsint( DataBuffer matriint, DataBuffer n, DataBuffer nrhs,
                        IComplexNumber dl,
                        IComplexNumber d,
                        IComplexNumber du,
                        IComplexNumber b, DataBuffer ldb );
    DataBuffer zgtsint( DataBuffer matriint, DataBuffer n, DataBuffer nrhs,
                        IComplexNumber dl,
                        IComplexNumber d,
                        IComplexNumber du,
                        IComplexNumber b, DataBuffer ldb );

    DataBuffer sgtsvint( DataBuffer matriint, char fact, char trans,
                         DataBuffer n, DataBuffer nrhs,  INDArray dl,
                         INDArray d,  INDArray du, INDArray dlf,
                         INDArray df, INDArray duf, INDArray du2,
                         DataBuffer ipiv,  INDArray b,
                         DataBuffer ldb, INDArray x, DataBuffer ldx,
                         INDArray rcond, INDArray ferr, INDArray berr,
                         INDArray work, DataBuffer iwork );
    DataBuffer dgtsvint( DataBuffer matriint, char fact, char trans,
                         DataBuffer n, DataBuffer nrhs,  INDArray dl,
                         INDArray d,  INDArray du, INDArray dlf,
                         INDArray df, INDArray duf, INDArray du2,
                         DataBuffer ipiv,  INDArray b,
                         DataBuffer ldb, INDArray x, DataBuffer ldx,
                         INDArray rcond, INDArray ferr, INDArray berr,
                         INDArray work, DataBuffer iwork );
    DataBuffer cgtsvint( DataBuffer matriint, char fact, char trans,
                         DataBuffer n, DataBuffer nrhs,
                         IComplexNumber dl,
                         IComplexNumber d,
                         IComplexNumber du,
                         IComplexNumber dlf,
                         IComplexNumber df,
                         IComplexNumber duf,
                         IComplexNumber du2, DataBuffer ipiv,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber x, DataBuffer ldx,
                         INDArray rcond, INDArray ferr, INDArray berr,
                         IComplexNumber work, INDArray rwork );
    DataBuffer zgtsvint( DataBuffer matriint, char fact, char trans,
                         DataBuffer n, DataBuffer nrhs,
                         IComplexNumber dl,
                         IComplexNumber d,
                         IComplexNumber du,
                         IComplexNumber dlf,
                         IComplexNumber df,
                         IComplexNumber duf,
                         IComplexNumber du2, DataBuffer ipiv,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber x, DataBuffer ldx,
                         INDArray rcond, INDArray ferr, INDArray berr,
                         IComplexNumber work, INDArray rwork );

    DataBuffer sgttrint( DataBuffer n, INDArray dl, INDArray d, INDArray du,
                         INDArray du2, DataBuffer ipiv );
    DataBuffer dgttrint( DataBuffer n, INDArray dl, INDArray d, INDArray du,
                         INDArray du2, DataBuffer ipiv );
    DataBuffer cgttrint( DataBuffer n, IComplexNumber dl,
                         IComplexNumber d,
                         IComplexNumber du,
                         IComplexNumber du2, DataBuffer ipiv );
    DataBuffer zgttrint( DataBuffer n, IComplexNumber dl,
                         IComplexNumber d,
                         IComplexNumber du,
                         IComplexNumber du2, DataBuffer ipiv );

    DataBuffer sgttrint( DataBuffer matriint, char trans, DataBuffer n,
                         DataBuffer nrhs,  INDArray dl,
                         INDArray d,  INDArray du,
                         INDArray du2,  DataBuffer ipiv,
                         INDArray b, DataBuffer ldb );
    DataBuffer dgttrint( DataBuffer matriint, char trans, DataBuffer n,
                         DataBuffer nrhs,  INDArray dl,
                         INDArray d,  INDArray du,
                         INDArray du2,  DataBuffer ipiv,
                         INDArray b, DataBuffer ldb );
    DataBuffer cgttrint( DataBuffer matriint, char trans, DataBuffer n,
                         DataBuffer nrhs,  IComplexNumber dl,
                         IComplexNumber d,
                         IComplexNumber du,
                         IComplexNumber du2,
                         DataBuffer ipiv, IComplexNumber b,
                         DataBuffer ldb );
    DataBuffer zgttrint( DataBuffer matriint, char trans, DataBuffer n,
                         DataBuffer nrhs,
                         IComplexNumber dl,
                         IComplexNumber d,
                         IComplexNumber du,
                         IComplexNumber du2,
                         DataBuffer ipiv,
                         IComplexNumber b, DataBuffer ldb );

    DataBuffer chbeint( DataBuffer matriint, char jobz, char uplo,
                        DataBuffer n, DataBuffer kd,
                        IComplexNumber ab, DataBuffer ldab,
                        INDArray w, IComplexNumber z,
                        DataBuffer ldz, IComplexNumber work,
                        INDArray rwork );
    DataBuffer zhbeint( DataBuffer matriint, char jobz, char uplo,
                        DataBuffer n, DataBuffer kd,
                        IComplexNumber ab, DataBuffer ldab,
                        INDArray w, IComplexNumber z,
                        DataBuffer ldz, IComplexNumber work,
                        INDArray rwork );

    DataBuffer chbevint( DataBuffer matriint, char jobz, char uplo,
                         DataBuffer n, DataBuffer kd,
                         IComplexNumber ab, DataBuffer ldab,
                         INDArray w, IComplexNumber z,
                         DataBuffer ldz, IComplexNumber work,
                         DataBuffer lwork, INDArray rwork,
                         DataBuffer lrwork, DataBuffer iwork,
                         DataBuffer liwork );
    DataBuffer zhbevint( DataBuffer matriint, char jobz, char uplo,
                         DataBuffer n, DataBuffer kd,
                         IComplexNumber ab, DataBuffer ldab,
                         INDArray w, IComplexNumber z,
                         DataBuffer ldz, IComplexNumber work,
                         DataBuffer lwork, INDArray rwork,
                         DataBuffer lrwork, DataBuffer iwork,
                         DataBuffer liwork );

    DataBuffer chbevint( DataBuffer matriint, char jobz, char range,
                         char uplo, DataBuffer n, DataBuffer kd,
                         IComplexNumber ab, DataBuffer ldab,
                         IComplexNumber q, DataBuffer ldq,
                         float vl, float vu, DataBuffer il,
                         DataBuffer iu, float abstol, DataBuffer m,
                         INDArray w, IComplexNumber z,
                         DataBuffer ldz, IComplexNumber work,
                         INDArray rwork, DataBuffer iwork,
                         DataBuffer ifail );
    DataBuffer zhbevint( DataBuffer matriint, char jobz, char range,
                         char uplo, DataBuffer n, DataBuffer kd,
                         IComplexNumber ab, DataBuffer ldab,
                         IComplexNumber q, DataBuffer ldq,
                         double vl, double vu, DataBuffer il,
                         DataBuffer iu, double abstol, DataBuffer m,
                         INDArray w, IComplexNumber z,
                         DataBuffer ldz, IComplexNumber work,
                         INDArray rwork, DataBuffer iwork,
                         DataBuffer ifail );

    DataBuffer chbgsint( DataBuffer matriint, char vect, char uplo,
                         DataBuffer n, DataBuffer ka, DataBuffer kb,
                         IComplexNumber ab, DataBuffer ldab,
                         IComplexNumber bb, DataBuffer ldbb,
                         IComplexNumber x, DataBuffer ldx,
                         IComplexNumber work, INDArray rwork );
    DataBuffer zhbgsint( DataBuffer matriint, char vect, char uplo,
                         DataBuffer n, DataBuffer ka, DataBuffer kb,
                         IComplexNumber ab, DataBuffer ldab,
                         IComplexNumber bb,
                         DataBuffer ldbb, IComplexNumber x,
                         DataBuffer ldx, IComplexNumber work,
                         INDArray rwork );

    DataBuffer chbgint( DataBuffer matriint, char jobz, char uplo,
                        DataBuffer n, DataBuffer ka, DataBuffer kb,
                        IComplexNumber ab, DataBuffer ldab,
                        IComplexNumber bb, DataBuffer ldbb,
                        INDArray w, IComplexNumber z,
                        DataBuffer ldz, IComplexNumber work,
                        INDArray rwork );
    DataBuffer zhbgint( DataBuffer matriint, char jobz, char uplo,
                        DataBuffer n, DataBuffer ka, DataBuffer kb,
                        IComplexNumber ab, DataBuffer ldab,
                        IComplexNumber bb, DataBuffer ldbb,
                        INDArray w, IComplexNumber z,
                        DataBuffer ldz, IComplexNumber work,
                        INDArray rwork );

    DataBuffer chbgvint( DataBuffer matriint, char jobz, char uplo,
                         DataBuffer n, DataBuffer ka, DataBuffer kb,
                         IComplexNumber ab, DataBuffer ldab,
                         IComplexNumber bb, DataBuffer ldbb,
                         INDArray w, IComplexNumber z,
                         DataBuffer ldz, IComplexNumber work,
                         DataBuffer lwork, INDArray rwork,
                         DataBuffer lrwork, DataBuffer iwork,
                         DataBuffer liwork );
    DataBuffer zhbgvint( DataBuffer matriint, char jobz, char uplo,
                         DataBuffer n, DataBuffer ka, DataBuffer kb,
                         IComplexNumber ab, DataBuffer ldab,
                         IComplexNumber bb, DataBuffer ldbb,
                         INDArray w, IComplexNumber z,
                         DataBuffer ldz, IComplexNumber work,
                         DataBuffer lwork, INDArray rwork,
                         DataBuffer lrwork, DataBuffer iwork,
                         DataBuffer liwork );

    DataBuffer chbgvint( DataBuffer matriint, char jobz, char range,
                         char uplo, DataBuffer n, DataBuffer ka,
                         DataBuffer kb, IComplexNumber ab,
                         DataBuffer ldab, IComplexNumber bb,
                         DataBuffer ldbb, IComplexNumber q,
                         DataBuffer ldq, float vl, float vu,
                         DataBuffer il, DataBuffer iu, float abstol,
                         DataBuffer m, INDArray w,
                         IComplexNumber z, DataBuffer ldz,
                         IComplexNumber work, INDArray rwork,
                         DataBuffer iwork, DataBuffer ifail );
    DataBuffer zhbgvint( DataBuffer matriint, char jobz, char range,
                         char uplo, DataBuffer n, DataBuffer ka,
                         DataBuffer kb, IComplexNumber ab,
                         DataBuffer ldab, IComplexNumber bb,
                         DataBuffer ldbb, IComplexNumber q,
                         DataBuffer ldq, double vl, double vu,
                         DataBuffer il, DataBuffer iu, double abstol,
                         DataBuffer m, INDArray w,
                         IComplexNumber z, DataBuffer ldz,
                         IComplexNumber work, INDArray rwork,
                         DataBuffer iwork, DataBuffer ifail );

    DataBuffer chbtrint( DataBuffer matriint, char vect, char uplo,
                         DataBuffer n, DataBuffer kd,
                         IComplexNumber ab, DataBuffer ldab,
                         INDArray d, INDArray e, IComplexNumber q,
                         DataBuffer ldq, IComplexNumber work );
    DataBuffer zhbtrint( DataBuffer matriint, char vect, char uplo,
                         DataBuffer n, DataBuffer kd,
                         IComplexNumber ab, DataBuffer ldab,
                         INDArray d, INDArray e, IComplexNumber q,
                         DataBuffer ldq, IComplexNumber work );

    DataBuffer checoint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         DataBuffer ipiv, float anorm,
                         INDArray rcond, IComplexNumber work );
    DataBuffer zhecoint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         DataBuffer ipiv, double anorm,
                         INDArray rcond, IComplexNumber work );

    DataBuffer cheequint( DataBuffer matriint, char uplo, DataBuffer n,
                          IComplexNumber a, DataBuffer lda,
                          INDArray s, INDArray scond, INDArray amax,
                          IComplexNumber work );
    DataBuffer zheequint( DataBuffer matriint, char uplo, DataBuffer n,
                          IComplexNumber a, DataBuffer lda,
                          INDArray s, INDArray scond, INDArray amax,
                          IComplexNumber work );

    DataBuffer cheeint( DataBuffer matriint, char jobz, char uplo,
                        DataBuffer n, IComplexNumber a,
                        DataBuffer lda, INDArray w,
                        IComplexNumber work, DataBuffer lwork,
                        INDArray rwork );
    DataBuffer zheeint( DataBuffer matriint, char jobz, char uplo,
                        DataBuffer n, IComplexNumber a,
                        DataBuffer lda, INDArray w,
                        IComplexNumber work, DataBuffer lwork,
                        INDArray rwork );

    DataBuffer cheevint( DataBuffer matriint, char jobz, char uplo,
                         DataBuffer n, IComplexNumber a,
                         DataBuffer lda, INDArray w,
                         IComplexNumber work, DataBuffer lwork,
                         INDArray rwork, DataBuffer lrwork,
                         DataBuffer iwork, DataBuffer liwork );
    DataBuffer zheevint( DataBuffer matriint, char jobz, char uplo,
                         DataBuffer n, IComplexNumber a,
                         DataBuffer lda, INDArray w,
                         IComplexNumber work, DataBuffer lwork,
                         INDArray rwork, DataBuffer lrwork,
                         DataBuffer iwork, DataBuffer liwork );

    DataBuffer cheevint( DataBuffer matriint, char jobz, char range,
                         char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         float vl, float vu, DataBuffer il,
                         DataBuffer iu, float abstol, DataBuffer m,
                         INDArray w, IComplexNumber z,
                         DataBuffer ldz, DataBuffer isuppz,
                         IComplexNumber work, DataBuffer lwork,
                         INDArray rwork, DataBuffer lrwork,
                         DataBuffer iwork, DataBuffer liwork );
    DataBuffer zheevint( DataBuffer matriint, char jobz, char range,
                         char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         double vl, double vu, DataBuffer il,
                         DataBuffer iu, double abstol, DataBuffer m,
                         INDArray w, IComplexNumber z,
                         DataBuffer ldz, DataBuffer isuppz,
                         IComplexNumber work, DataBuffer lwork,
                         INDArray rwork, DataBuffer lrwork,
                         DataBuffer iwork, DataBuffer liwork );

    DataBuffer cheevint( DataBuffer matriint, char jobz, char range,
                         char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         float vl, float vu, DataBuffer il,
                         DataBuffer iu, float abstol, DataBuffer m,
                         INDArray w, IComplexNumber z,
                         DataBuffer ldz, IComplexNumber work,
                         DataBuffer lwork, INDArray rwork,
                         DataBuffer iwork, DataBuffer ifail );
    DataBuffer zheevint( DataBuffer matriint, char jobz, char range,
                         char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         double vl, double vu, DataBuffer il,
                         DataBuffer iu, double abstol, DataBuffer m,
                         INDArray w, IComplexNumber z,
                         DataBuffer ldz, IComplexNumber work,
                         DataBuffer lwork, INDArray rwork,
                         DataBuffer iwork, DataBuffer ifail );

    DataBuffer chegsint( DataBuffer matriint, DataBuffer itype, char uplo,
                         DataBuffer n, IComplexNumber a,
                         DataBuffer lda,  IComplexNumber b,
                         DataBuffer ldb );
    DataBuffer zhegsint( DataBuffer matriint, DataBuffer itype, char uplo,
                         DataBuffer n, IComplexNumber a,
                         DataBuffer lda,  IComplexNumber b,
                         DataBuffer ldb );

    DataBuffer chegint( DataBuffer matriint, DataBuffer itype, char jobz,
                        char uplo, DataBuffer n, IComplexNumber a,
                        DataBuffer lda, IComplexNumber b,
                        DataBuffer ldb, INDArray w,
                        IComplexNumber work, DataBuffer lwork,
                        INDArray rwork );
    DataBuffer zhegint( DataBuffer matriint, DataBuffer itype, char jobz,
                        char uplo, DataBuffer n,
                        IComplexNumber a, DataBuffer lda,
                        IComplexNumber b, DataBuffer ldb,
                        INDArray w, IComplexNumber work,
                        DataBuffer lwork, INDArray rwork );

    DataBuffer chegvint( DataBuffer matriint, DataBuffer itype, char jobz,
                         char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber b, DataBuffer ldb,
                         INDArray w, IComplexNumber work,
                         DataBuffer lwork, INDArray rwork,
                         DataBuffer lrwork, DataBuffer iwork,
                         DataBuffer liwork );
    DataBuffer zhegvint( DataBuffer matriint, DataBuffer itype, char jobz,
                         char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber b, DataBuffer ldb,
                         INDArray w, IComplexNumber work,
                         DataBuffer lwork, INDArray rwork,
                         DataBuffer lrwork, DataBuffer iwork,
                         DataBuffer liwork );

    DataBuffer chegvint( DataBuffer matriint, DataBuffer itype, char jobz,
                         char range, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber b, DataBuffer ldb,
                         float vl, float vu, DataBuffer il,
                         DataBuffer iu, float abstol, DataBuffer m,
                         INDArray w, IComplexNumber z,
                         DataBuffer ldz, IComplexNumber work,
                         DataBuffer lwork, INDArray rwork,
                         DataBuffer iwork, DataBuffer ifail );
    DataBuffer zhegvint( DataBuffer matriint, DataBuffer itype, char jobz,
                         char range, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber b, DataBuffer ldb,
                         double vl, double vu, DataBuffer il,
                         DataBuffer iu, double abstol, DataBuffer m,
                         INDArray w, IComplexNumber z,
                         DataBuffer ldz, IComplexNumber work,
                         DataBuffer lwork, INDArray rwork,
                         DataBuffer iwork, DataBuffer ifail );

    DataBuffer cherfint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,  IComplexNumber a,
                         DataBuffer lda,  IComplexNumber af,
                         DataBuffer ldaf,  DataBuffer ipiv,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber x, DataBuffer ldx,
                         INDArray ferr, INDArray berr,
                         IComplexNumber work, INDArray rwork );
    DataBuffer zherfint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,  IComplexNumber a,
                         DataBuffer lda,  IComplexNumber af,
                         DataBuffer ldaf,  DataBuffer ipiv,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber x, DataBuffer ldx,
                         INDArray ferr, INDArray berr,
                         IComplexNumber work, INDArray rwork );

    DataBuffer cherfsint( DataBuffer matriint, char uplo, char equed,
                          DataBuffer n, DataBuffer nrhs,
                          IComplexNumber a, DataBuffer lda,
                          IComplexNumber af,
                          DataBuffer ldaf,  DataBuffer ipiv,
                          INDArray s,  IComplexNumber b,
                          DataBuffer ldb, IComplexNumber x,
                          DataBuffer ldx, INDArray rcond, INDArray berr,
                          DataBuffer int_bnds, INDArray erint_norm,
                          INDArray erint_comp, DataBuffer nparams,
                          INDArray params, IComplexNumber work,
                          INDArray rwork );
    DataBuffer zherfsint( DataBuffer matriint, char uplo, char equed,
                          DataBuffer n, DataBuffer nrhs,
                          IComplexNumber a, DataBuffer lda,
                          IComplexNumber af,
                          DataBuffer ldaf,  DataBuffer ipiv,
                          INDArray s,
                          IComplexNumber b, DataBuffer ldb,
                          IComplexNumber x, DataBuffer ldx,
                          INDArray rcond, INDArray berr,
                          DataBuffer int_bnds, INDArray erint_norm,
                          INDArray erint_comp, DataBuffer nparams,
                          INDArray params, IComplexNumber work,
                          INDArray rwork );

    DataBuffer chesint( DataBuffer matriint, char uplo, DataBuffer n,
                        DataBuffer nrhs, IComplexNumber a,
                        DataBuffer lda, DataBuffer ipiv,
                        IComplexNumber b, DataBuffer ldb,
                        IComplexNumber work, DataBuffer lwork );
    DataBuffer zhesint( DataBuffer matriint, char uplo, DataBuffer n,
                        DataBuffer nrhs, IComplexNumber a,
                        DataBuffer lda, DataBuffer ipiv,
                        IComplexNumber b, DataBuffer ldb,
                        IComplexNumber work, DataBuffer lwork );

    DataBuffer chesvint( DataBuffer matriint, char fact, char uplo,
                         DataBuffer n, DataBuffer nrhs,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber af, DataBuffer ldaf,
                         DataBuffer ipiv,  IComplexNumber b,
                         DataBuffer ldb, IComplexNumber x,
                         DataBuffer ldx, INDArray rcond, INDArray ferr,
                         INDArray berr, IComplexNumber work,
                         DataBuffer lwork, INDArray rwork );
    DataBuffer zhesvint( DataBuffer matriint, char fact, char uplo,
                         DataBuffer n, DataBuffer nrhs,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber af, DataBuffer ldaf,
                         DataBuffer ipiv,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber x, DataBuffer ldx,
                         INDArray rcond, INDArray ferr, INDArray berr,
                         IComplexNumber work, DataBuffer lwork,
                         INDArray rwork );

    DataBuffer chesvxint( DataBuffer matriint, char fact, char uplo,
                          DataBuffer n, DataBuffer nrhs,
                          IComplexNumber a, DataBuffer lda,
                          IComplexNumber af, DataBuffer ldaf,
                          DataBuffer ipiv, String equed, INDArray s,
                          IComplexNumber b, DataBuffer ldb,
                          IComplexNumber x, DataBuffer ldx,
                          INDArray rcond, INDArray rpvgrw, INDArray berr,
                          DataBuffer int_bnds, INDArray erint_norm,
                          INDArray erint_comp, DataBuffer nparams,
                          INDArray params, IComplexNumber work,
                          INDArray rwork );
    DataBuffer zhesvxint( DataBuffer matriint, char fact, char uplo,
                          DataBuffer n, DataBuffer nrhs,
                          IComplexNumber a, DataBuffer lda,
                          IComplexNumber af, DataBuffer ldaf,
                          DataBuffer ipiv, String equed, INDArray s,
                          IComplexNumber b, DataBuffer ldb,
                          IComplexNumber x, DataBuffer ldx,
                          INDArray rcond, INDArray rpvgrw, INDArray berr,
                          DataBuffer int_bnds, INDArray erint_norm,
                          INDArray erint_comp, DataBuffer nparams,
                          INDArray params, IComplexNumber work,
                          INDArray rwork );

    DataBuffer chetrint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         INDArray d, INDArray e, IComplexNumber tau,
                         IComplexNumber work, DataBuffer lwork );
    DataBuffer zhetrint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         INDArray d, INDArray e,
                         IComplexNumber tau,
                         IComplexNumber work, DataBuffer lwork );

    DataBuffer chetrint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         DataBuffer ipiv, IComplexNumber work,
                         DataBuffer lwork );
    DataBuffer zhetrint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         DataBuffer ipiv, IComplexNumber work,
                         DataBuffer lwork );

    DataBuffer chetrint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         DataBuffer ipiv,
                         IComplexNumber work );
    DataBuffer zhetrint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         DataBuffer ipiv,
                         IComplexNumber work );


    DataBuffer chfrint( DataBuffer matriint, char transr, char uplo,
                        char trans, DataBuffer n, DataBuffer k,
                        float alpha,  IComplexNumber a,
                        DataBuffer lda, float beta,
                        IComplexNumber c );
    DataBuffer zhfrint( DataBuffer matriint, char transr, char uplo,
                        char trans, DataBuffer n, DataBuffer k,
                        double alpha,  IComplexNumber a,
                        DataBuffer lda, double beta,
                        IComplexNumber c );

    DataBuffer shgeqint( DataBuffer matriint, char job, char compq,
                         char compz, DataBuffer n, DataBuffer ilo,
                         DataBuffer ihi, INDArray h, DataBuffer ldh,
                         INDArray t, DataBuffer ldt, INDArray alphar,
                         INDArray alphai, INDArray beta, INDArray q,
                         DataBuffer ldq, INDArray z, DataBuffer ldz,
                         INDArray work, DataBuffer lwork );
    DataBuffer dhgeqint( DataBuffer matriint, char job, char compq,
                         char compz, DataBuffer n, DataBuffer ilo,
                         DataBuffer ihi, INDArray h, DataBuffer ldh,
                         INDArray t, DataBuffer ldt, INDArray alphar,
                         INDArray alphai, INDArray beta, INDArray q,
                         DataBuffer ldq, INDArray z, DataBuffer ldz,
                         INDArray work, DataBuffer lwork );
    DataBuffer chgeqint( DataBuffer matriint, char job, char compq,
                         char compz, DataBuffer n, DataBuffer ilo,
                         DataBuffer ihi, IComplexNumber h,
                         DataBuffer ldh, IComplexNumber t,
                         DataBuffer ldt, IComplexNumber alpha,
                         IComplexNumber beta,
                         IComplexNumber q, DataBuffer ldq,
                         IComplexNumber z, DataBuffer ldz,
                         IComplexNumber work, DataBuffer lwork,
                         INDArray rwork );
    DataBuffer zhgeqint( DataBuffer matriint, char job, char compq,
                         char compz, DataBuffer n, DataBuffer ilo,
                         DataBuffer ihi, IComplexNumber h,
                         DataBuffer ldh, IComplexNumber t,
                         DataBuffer ldt, IComplexNumber alpha,
                         IComplexNumber beta,
                         IComplexNumber q, DataBuffer ldq,
                         IComplexNumber z, DataBuffer ldz,
                         IComplexNumber work, DataBuffer lwork,
                         INDArray rwork );

    DataBuffer chpcoint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber ap,
                         DataBuffer ipiv, float anorm,
                         INDArray rcond, IComplexNumber work );
    DataBuffer zhpcoint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber ap,
                         DataBuffer ipiv, double anorm,
                         INDArray rcond, IComplexNumber work );

    DataBuffer chpeint( DataBuffer matriint, char jobz, char uplo,
                        DataBuffer n, IComplexNumber ap, INDArray w,
                        IComplexNumber z, DataBuffer ldz,
                        IComplexNumber work, INDArray rwork );
    DataBuffer zhpeint( DataBuffer matriint, char jobz, char uplo,
                        DataBuffer n, IComplexNumber ap,
                        INDArray w, IComplexNumber z,
                        DataBuffer ldz, IComplexNumber work,
                        INDArray rwork );

    DataBuffer chpevint( DataBuffer matriint, char jobz, char uplo,
                         DataBuffer n, IComplexNumber ap,
                         INDArray w, IComplexNumber z,
                         DataBuffer ldz, IComplexNumber work,
                         DataBuffer lwork, INDArray rwork,
                         DataBuffer lrwork, DataBuffer iwork,
                         DataBuffer liwork );
    DataBuffer zhpevint( DataBuffer matriint, char jobz, char uplo,
                         DataBuffer n, IComplexNumber ap,
                         INDArray w, IComplexNumber z,
                         DataBuffer ldz, IComplexNumber work,
                         DataBuffer lwork, INDArray rwork,
                         DataBuffer lrwork, DataBuffer iwork,
                         DataBuffer liwork );

    DataBuffer chpevint( DataBuffer matriint, char jobz, char range,
                         char uplo, DataBuffer n,
                         IComplexNumber ap, float vl, float vu,
                         DataBuffer il, DataBuffer iu, float abstol,
                         DataBuffer m, INDArray w,
                         IComplexNumber z, DataBuffer ldz,
                         IComplexNumber work, INDArray rwork,
                         DataBuffer iwork, DataBuffer ifail );
    DataBuffer zhpevint( DataBuffer matriint, char jobz, char range,
                         char uplo, DataBuffer n,
                         IComplexNumber ap, double vl, double vu,
                         DataBuffer il, DataBuffer iu, double abstol,
                         DataBuffer m, INDArray w,
                         IComplexNumber z, DataBuffer ldz,
                         IComplexNumber work, INDArray rwork,
                         DataBuffer iwork, DataBuffer ifail );

    DataBuffer chpgsint( DataBuffer matriint, DataBuffer itype, char uplo,
                         DataBuffer n, IComplexNumber ap,
                         IComplexNumber bp );
    DataBuffer zhpgsint( DataBuffer matriint, DataBuffer itype, char uplo,
                         DataBuffer n, IComplexNumber ap,
                         IComplexNumber bp );

    DataBuffer chpgint( DataBuffer matriint, DataBuffer itype, char jobz,
                        char uplo, DataBuffer n,
                        IComplexNumber ap,
                        IComplexNumber bp, INDArray w,
                        IComplexNumber z, DataBuffer ldz,
                        IComplexNumber work, INDArray rwork );
    DataBuffer zhpgint( DataBuffer matriint, DataBuffer itype, char jobz,
                        char uplo, DataBuffer n,
                        IComplexNumber ap,
                        IComplexNumber bp, INDArray w,
                        IComplexNumber z, DataBuffer ldz,
                        IComplexNumber work, INDArray rwork );

    DataBuffer chpgvint( DataBuffer matriint, DataBuffer itype, char jobz,
                         char uplo, DataBuffer n,
                         IComplexNumber ap,
                         IComplexNumber bp, INDArray w,
                         IComplexNumber z, DataBuffer ldz,
                         IComplexNumber work, DataBuffer lwork,
                         INDArray rwork, DataBuffer lrwork,
                         DataBuffer iwork, DataBuffer liwork );
    DataBuffer zhpgvint( DataBuffer matriint, DataBuffer itype, char jobz,
                         char uplo, DataBuffer n,
                         IComplexNumber ap,
                         IComplexNumber bp, INDArray w,
                         IComplexNumber z, DataBuffer ldz,
                         IComplexNumber work, DataBuffer lwork,
                         INDArray rwork, DataBuffer lrwork,
                         DataBuffer iwork, DataBuffer liwork );

    DataBuffer chpgvint( DataBuffer matriint, DataBuffer itype, char jobz,
                         char range, char uplo, DataBuffer n,
                         IComplexNumber ap,
                         IComplexNumber bp, float vl, float vu,
                         DataBuffer il, DataBuffer iu, float abstol,
                         DataBuffer m, INDArray w,
                         IComplexNumber z, DataBuffer ldz,
                         IComplexNumber work, INDArray rwork,
                         DataBuffer iwork, DataBuffer ifail );
    DataBuffer zhpgvint( DataBuffer matriint, DataBuffer itype, char jobz,
                         char range, char uplo, DataBuffer n,
                         IComplexNumber ap,
                         IComplexNumber bp, double vl, double vu,
                         DataBuffer il, DataBuffer iu, double abstol,
                         DataBuffer m, INDArray w,
                         IComplexNumber z, DataBuffer ldz,
                         IComplexNumber work, INDArray rwork,
                         DataBuffer iwork, DataBuffer ifail );

    DataBuffer chprfint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,  IComplexNumber ap,
                         IComplexNumber afp,
                         DataBuffer ipiv,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber x, DataBuffer ldx,
                         INDArray ferr, INDArray berr,
                         IComplexNumber work, INDArray rwork );
    DataBuffer zhprfint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,
                         IComplexNumber ap,
                         IComplexNumber afp,
                         DataBuffer ipiv,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber x, DataBuffer ldx,
                         INDArray ferr, INDArray berr,
                         IComplexNumber work, INDArray rwork );

    DataBuffer chpsint( DataBuffer matriint, char uplo, DataBuffer n,
                        DataBuffer nrhs, IComplexNumber ap,
                        DataBuffer ipiv, IComplexNumber b,
                        DataBuffer ldb );
    DataBuffer zhpsint( DataBuffer matriint, char uplo, DataBuffer n,
                        DataBuffer nrhs, IComplexNumber ap,
                        DataBuffer ipiv, IComplexNumber b,
                        DataBuffer ldb );

    DataBuffer chpsvint( DataBuffer matriint, char fact, char uplo,
                         DataBuffer n, DataBuffer nrhs,
                         IComplexNumber ap,
                         IComplexNumber afp, DataBuffer ipiv,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber x, DataBuffer ldx,
                         INDArray rcond, INDArray ferr, INDArray berr,
                         IComplexNumber work, INDArray rwork );
    DataBuffer zhpsvint( DataBuffer matriint, char fact, char uplo,
                         DataBuffer n, DataBuffer nrhs,
                         IComplexNumber ap,
                         IComplexNumber afp, DataBuffer ipiv,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber x, DataBuffer ldx,
                         INDArray rcond, INDArray ferr, INDArray berr,
                         IComplexNumber work, INDArray rwork );

    DataBuffer chptrint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber ap, INDArray d, INDArray e,
                         IComplexNumber tau );
    DataBuffer zhptrint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber ap, INDArray d, INDArray e,
                         IComplexNumber tau );

    DataBuffer chptrint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber ap, DataBuffer ipiv );
    DataBuffer zhptrint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber ap, DataBuffer ipiv );

    DataBuffer chptrint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber ap,
                         DataBuffer ipiv,
                         IComplexNumber work );
    DataBuffer zhptrint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber ap,
                         DataBuffer ipiv,
                         IComplexNumber work );

    DataBuffer chptrint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,  IComplexNumber ap,
                         DataBuffer ipiv, IComplexNumber b,
                         DataBuffer ldb );
    DataBuffer zhptrint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,
                         IComplexNumber ap,
                         DataBuffer ipiv,
                         IComplexNumber b, DataBuffer ldb );

    DataBuffer shseiint( DataBuffer matriint, char job, char eigsrc,
                         char initv, DataBuffer select,
                         DataBuffer n,  INDArray h, DataBuffer ldh,
                         INDArray wr,  INDArray wi, INDArray vl,
                         DataBuffer ldvl, INDArray vr, DataBuffer ldvr,
                         DataBuffer mm, DataBuffer m, INDArray work,
                         DataBuffer ifaill, DataBuffer ifailr );
    DataBuffer dhseiint( DataBuffer matriint, char job, char eigsrc,
                         char initv, DataBuffer select,
                         DataBuffer n,  INDArray h, DataBuffer ldh,
                         INDArray wr,  INDArray wi, INDArray vl,
                         DataBuffer ldvl, INDArray vr, DataBuffer ldvr,
                         DataBuffer mm, DataBuffer m, INDArray work,
                         DataBuffer ifaill, DataBuffer ifailr );
    DataBuffer chseiint( DataBuffer matriint, char job, char eigsrc,
                         char initv,  DataBuffer select,
                         DataBuffer n,  IComplexNumber h,
                         DataBuffer ldh, IComplexNumber w,
                         IComplexNumber vl, DataBuffer ldvl,
                         IComplexNumber vr, DataBuffer ldvr,
                         DataBuffer mm, DataBuffer m,
                         IComplexNumber work, INDArray rwork,
                         DataBuffer ifaill, DataBuffer ifailr );
    DataBuffer zhseiint( DataBuffer matriint, char job, char eigsrc,
                         char initv,  DataBuffer select,
                         DataBuffer n,  IComplexNumber h,
                         DataBuffer ldh, IComplexNumber w,
                         IComplexNumber vl, DataBuffer ldvl,
                         IComplexNumber vr, DataBuffer ldvr,
                         DataBuffer mm, DataBuffer m,
                         IComplexNumber work, INDArray rwork,
                         DataBuffer ifaill, DataBuffer ifailr );

    DataBuffer shseqint( DataBuffer matriint, char job, char compz,
                         DataBuffer n, DataBuffer ilo, DataBuffer ihi,
                         INDArray h, DataBuffer ldh, INDArray wr, INDArray wi,
                         INDArray z, DataBuffer ldz, INDArray work,
                         DataBuffer lwork );
    DataBuffer dhseqint( DataBuffer matriint, char job, char compz,
                         DataBuffer n, DataBuffer ilo, DataBuffer ihi,
                         INDArray h, DataBuffer ldh, INDArray wr,
                         INDArray wi, INDArray z, DataBuffer ldz,
                         INDArray work, DataBuffer lwork );
    DataBuffer chseqint( DataBuffer matriint, char job, char compz,
                         DataBuffer n, DataBuffer ilo, DataBuffer ihi,
                         IComplexNumber h, DataBuffer ldh,
                         IComplexNumber w,
                         IComplexNumber z, DataBuffer ldz,
                         IComplexNumber work, DataBuffer lwork );
    DataBuffer zhseqint( DataBuffer matriint, char job, char compz,
                         DataBuffer n, DataBuffer ilo, DataBuffer ihi,
                         IComplexNumber h, DataBuffer ldh,
                         IComplexNumber w,
                         IComplexNumber z, DataBuffer ldz,
                         IComplexNumber work, DataBuffer lwork );

    DataBuffer clacgint( DataBuffer n, IComplexNumber x,
                         DataBuffer incx );
    DataBuffer zlacgint( DataBuffer n, IComplexNumber x,
                         DataBuffer incx );

    DataBuffer slacn2_work( DataBuffer n, INDArray v, INDArray x,
                            DataBuffer isgn, INDArray est, DataBuffer kase,
                            DataBuffer isave );
    DataBuffer dlacn2_work( DataBuffer n, INDArray v, INDArray x,
                            DataBuffer isgn, INDArray est, DataBuffer kase,
                            DataBuffer isave );
    DataBuffer clacn2_work( DataBuffer n, IComplexNumber v,
                            IComplexNumber x,
                            INDArray est, DataBuffer kase,
                            DataBuffer isave );
    DataBuffer zlacn2_work( DataBuffer n, IComplexNumber v,
                            IComplexNumber x,
                            INDArray est, DataBuffer kase,
                            DataBuffer isave );

    DataBuffer slacpint( DataBuffer matriint, char uplo, DataBuffer m,
                         DataBuffer n,  INDArray a, DataBuffer lda,
                         INDArray b, DataBuffer ldb );
    DataBuffer dlacpint( DataBuffer matriint, char uplo, DataBuffer m,
                         DataBuffer n,  INDArray a, DataBuffer lda,
                         INDArray b, DataBuffer ldb );
    DataBuffer clacpint( DataBuffer matriint, char uplo, DataBuffer m,
                         DataBuffer n,  IComplexNumber a,
                         DataBuffer lda, IComplexNumber b,
                         DataBuffer ldb );
    DataBuffer zlacpint( DataBuffer matriint, char uplo, DataBuffer m,
                         DataBuffer n,  IComplexNumber a,
                         DataBuffer lda, IComplexNumber b,
                         DataBuffer ldb );

    DataBuffer clacp2_work( DataBuffer matriint, char uplo, DataBuffer m,
                            DataBuffer n,  INDArray a, DataBuffer lda,
                            IComplexNumber b, DataBuffer ldb );
    DataBuffer zlacp2_work( DataBuffer matriint, char uplo, DataBuffer m,
                            DataBuffer n,  INDArray a, DataBuffer lda,
                            IComplexNumber b, DataBuffer ldb );

    DataBuffer zlag2int( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber sa, DataBuffer ldsa );

    DataBuffer slag2int( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         INDArray sa, DataBuffer ldsa, INDArray a,
                         DataBuffer lda );

    DataBuffer dlag2int( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         INDArray a, DataBuffer lda, INDArray sa,
                         DataBuffer ldsa );

    DataBuffer clag2int( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         IComplexNumber sa, DataBuffer ldsa,
                         IComplexNumber a, DataBuffer lda );

    DataBuffer slaggint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer kl, DataBuffer ku,  INDArray d,
                         INDArray a, DataBuffer lda, DataBuffer iseed,
                         INDArray work );
    DataBuffer dlaggint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer kl, DataBuffer ku,  INDArray d,
                         INDArray a, DataBuffer lda, DataBuffer iseed,
                         INDArray work );
    DataBuffer claggint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer kl, DataBuffer ku,  INDArray d,
                         IComplexNumber a, DataBuffer lda,
                         DataBuffer iseed, IComplexNumber work );
    DataBuffer zlaggint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer kl, DataBuffer ku,  INDArray d,
                         IComplexNumber a, DataBuffer lda,
                         DataBuffer iseed,
                         IComplexNumber work );

    DataBuffer claghint( DataBuffer matriint, DataBuffer n, DataBuffer k,
                         INDArray d, IComplexNumber a,
                         DataBuffer lda, DataBuffer iseed,
                         IComplexNumber work );
    DataBuffer zlaghint( DataBuffer matriint, DataBuffer n, DataBuffer k,
                         INDArray d, IComplexNumber a,
                         DataBuffer lda, DataBuffer iseed,
                         IComplexNumber work );

    DataBuffer slagsint( DataBuffer matriint, DataBuffer n, DataBuffer k,
                         INDArray d, INDArray a, DataBuffer lda,
                         DataBuffer iseed, INDArray work );
    DataBuffer dlagsint( DataBuffer matriint, DataBuffer n, DataBuffer k,
                         INDArray d, INDArray a, DataBuffer lda,
                         DataBuffer iseed, INDArray work );
    DataBuffer clagsint( DataBuffer matriint, DataBuffer n, DataBuffer k,
                         INDArray d, IComplexNumber a,
                         DataBuffer lda, DataBuffer iseed,
                         IComplexNumber work );
    DataBuffer zlagsint( DataBuffer matriint, DataBuffer n, DataBuffer k,
                         INDArray d, IComplexNumber a,
                         DataBuffer lda, DataBuffer iseed,
                         IComplexNumber work );

    DataBuffer slapmint( DataBuffer matriint, int forwrd,
                         DataBuffer m, DataBuffer n, INDArray x,
                         DataBuffer ldx, DataBuffer k );
    DataBuffer dlapmint( DataBuffer matriint, int forwrd,
                         DataBuffer m, DataBuffer n, INDArray x,
                         DataBuffer ldx, DataBuffer k );
    DataBuffer clapmint( DataBuffer matriint, int forwrd,
                         DataBuffer m, DataBuffer n,
                         IComplexNumber x, DataBuffer ldx,
                         DataBuffer k );
    DataBuffer zlapmint( DataBuffer matriint, int forwrd,
                         DataBuffer m, DataBuffer n,
                         IComplexNumber x, DataBuffer ldx,
                         DataBuffer k );


    DataBuffer slartgint( float f, float g, INDArray cs, INDArray sn,
                          INDArray r );
    DataBuffer dlartgint( double f, double g, INDArray cs, INDArray sn,
                          INDArray r );

    DataBuffer slartgint( float x, float y, float sigma, INDArray cs,
                          INDArray sn );
    DataBuffer dlartgint( double x, double y, double sigma, INDArray cs,
                          INDArray sn );

    float slapy2_work( float x, float y );
    double dlapy2_work( double x, double y );

    float slapy3_work( float x, float y, float z );
    double dlapy3_work( double x, double y, double z );

    float slamcint( char cmach );
    double dlamcint( char cmach );

    float slangint( DataBuffer matriint, char norm, DataBuffer m,
                    DataBuffer n,  INDArray a, DataBuffer lda,
                    INDArray work );
    double dlangint( DataBuffer matriint, char norm, DataBuffer m,
                     DataBuffer n,  INDArray a, DataBuffer lda,
                     INDArray work );
    float clangint( DataBuffer matriint, char norm, DataBuffer m,
                    DataBuffer n,  IComplexNumber a,
                    DataBuffer lda, INDArray work );
    double zlangint( DataBuffer matriint, char norm, DataBuffer m,
                     DataBuffer n,  IComplexNumber a,
                     DataBuffer lda, INDArray work );

    float clanhint( DataBuffer matriint, char norm, char uplo,
                    DataBuffer n,  IComplexNumber a,
                    DataBuffer lda, INDArray work );
    double zlanhint( DataBuffer matriint, char norm, char uplo,
                     DataBuffer n,  IComplexNumber a,
                     DataBuffer lda, INDArray work );

    float slansint( DataBuffer matriint, char norm, char uplo,
                    DataBuffer n,  INDArray a, DataBuffer lda,
                    INDArray work );
    double dlansint( DataBuffer matriint, char norm, char uplo,
                     DataBuffer n,  INDArray a, DataBuffer lda,
                     INDArray work );
    float clansint( DataBuffer matriint, char norm, char uplo,
                    DataBuffer n,  IComplexNumber a,
                    DataBuffer lda, INDArray work );
    double zlansint( DataBuffer matriint, char norm, char uplo,
                     DataBuffer n,  IComplexNumber a,
                     DataBuffer lda, INDArray work );

    float slantint( DataBuffer matriint, char norm, char uplo,
                    char diag, DataBuffer m, DataBuffer n,  INDArray a,
                    DataBuffer lda, INDArray work );
    double dlantint( DataBuffer matriint, char norm, char uplo,
                     char diag, DataBuffer m, DataBuffer n,
                     INDArray a, DataBuffer lda, INDArray work );
    float clantint( DataBuffer matriint, char norm, char uplo,
                    char diag, DataBuffer m, DataBuffer n,
                    IComplexNumber a, DataBuffer lda,
                    INDArray work );
    double zlantint( DataBuffer matriint, char norm, char uplo,
                     char diag, DataBuffer m, DataBuffer n,
                     IComplexNumber a, DataBuffer lda,
                     INDArray work );

    DataBuffer slarfint( DataBuffer matriint, char side, char trans,
                         char direct, char storev, DataBuffer m,
                         DataBuffer n, DataBuffer k,  INDArray v,
                         DataBuffer ldv,  INDArray t, DataBuffer ldt,
                         INDArray c, DataBuffer ldc, INDArray work,
                         DataBuffer ldwork );
    DataBuffer dlarfint( DataBuffer matriint, char side, char trans,
                         char direct, char storev, DataBuffer m,
                         DataBuffer n, DataBuffer k,  INDArray v,
                         DataBuffer ldv,  INDArray t, DataBuffer ldt,
                         INDArray c, DataBuffer ldc, INDArray work,
                         DataBuffer ldwork );
    DataBuffer clarfint( DataBuffer matriint, char side, char trans,
                         char direct, char storev, DataBuffer m,
                         DataBuffer n, DataBuffer k,
                         IComplexNumber v, DataBuffer ldv,
                         IComplexNumber t, DataBuffer ldt,
                         IComplexNumber c, DataBuffer ldc,
                         IComplexNumber work, DataBuffer ldwork );
    DataBuffer zlarfint( DataBuffer matriint, char side, char trans,
                         char direct, char storev, DataBuffer m,
                         DataBuffer n, DataBuffer k,
                         IComplexNumber v, DataBuffer ldv,
                         IComplexNumber t, DataBuffer ldt,
                         IComplexNumber c, DataBuffer ldc,
                         IComplexNumber work,
                         DataBuffer ldwork );

    DataBuffer slarfint( DataBuffer n, INDArray alpha, INDArray x,
                         DataBuffer incx, INDArray tau );
    DataBuffer dlarfint( DataBuffer n, INDArray alpha, INDArray x,
                         DataBuffer incx, INDArray tau );
    DataBuffer clarfint( DataBuffer n, IComplexNumber alpha,
                         IComplexNumber x, DataBuffer incx,
                         IComplexNumber tau );
    DataBuffer zlarfint( DataBuffer n, IComplexNumber alpha,
                         IComplexNumber x, DataBuffer incx,
                         IComplexNumber tau );

    DataBuffer slarfint( DataBuffer matriint, char direct, char storev,
                         DataBuffer n, DataBuffer k,  INDArray v,
                         DataBuffer ldv,  INDArray tau, INDArray t,
                         DataBuffer ldt );
    DataBuffer dlarfint( DataBuffer matriint, char direct, char storev,
                         DataBuffer n, DataBuffer k,  INDArray v,
                         DataBuffer ldv,  INDArray tau, INDArray t,
                         DataBuffer ldt );
    DataBuffer clarfint( DataBuffer matriint, char direct, char storev,
                         DataBuffer n, DataBuffer k,
                         IComplexNumber v, DataBuffer ldv,
                         IComplexNumber tau,
                         IComplexNumber t, DataBuffer ldt );
    DataBuffer zlarfint( DataBuffer matriint, char direct, char storev,
                         DataBuffer n, DataBuffer k,
                         IComplexNumber v, DataBuffer ldv,
                         IComplexNumber tau,
                         IComplexNumber t, DataBuffer ldt );

    DataBuffer slarfint( DataBuffer matriint, char side, DataBuffer m,
                         DataBuffer n,  INDArray v, float tau,
                         INDArray c, DataBuffer ldc, INDArray work );
    DataBuffer dlarfint( DataBuffer matriint, char side, DataBuffer m,
                         DataBuffer n,  INDArray v, double tau,
                         INDArray c, DataBuffer ldc, INDArray work );
    DataBuffer clarfint( DataBuffer matriint, char side, DataBuffer m,
                         DataBuffer n,  IComplexNumber v,
                         IComplexNumber tau,
                         IComplexNumber c, DataBuffer ldc,
                         IComplexNumber work );
    DataBuffer zlarfint( DataBuffer matriint, char side, DataBuffer m,
                         DataBuffer n,  IComplexNumber v,
                         IComplexNumber tau,
                         IComplexNumber c, DataBuffer ldc,
                         IComplexNumber work );

    DataBuffer slarnint( DataBuffer idist, DataBuffer iseed,
                         DataBuffer n, INDArray x );
    DataBuffer dlarnint( DataBuffer idist, DataBuffer iseed,
                         DataBuffer n, INDArray x );
    DataBuffer clarnint( DataBuffer idist, DataBuffer iseed,
                         DataBuffer n, IComplexNumber x );
    DataBuffer zlarnint( DataBuffer idist, DataBuffer iseed,
                         DataBuffer n, IComplexNumber x );


    DataBuffer slascint( DataBuffer matriint, char type, DataBuffer kl,
                         DataBuffer ku, float cfrom, float cto,
                         DataBuffer m, DataBuffer n, INDArray a,
                         DataBuffer lda );
    DataBuffer dlascint( DataBuffer matriint, char type, DataBuffer kl,
                         DataBuffer ku, double cfrom, double cto,
                         DataBuffer m, DataBuffer n, INDArray a,
                         DataBuffer lda );
    DataBuffer clascint( DataBuffer matriint, char type, DataBuffer kl,
                         DataBuffer ku, float cfrom, float cto,
                         DataBuffer m, DataBuffer n, IComplexNumber a,
                         DataBuffer lda );
    DataBuffer zlascint( DataBuffer matriint, char type, DataBuffer kl,
                         DataBuffer ku, double cfrom, double cto,
                         DataBuffer m, DataBuffer n, IComplexNumber a,
                         DataBuffer lda );

    DataBuffer slaseint( DataBuffer matriint, char uplo, DataBuffer m,
                         DataBuffer n, float alpha, float beta, INDArray a,
                         DataBuffer lda );
    DataBuffer dlaseint( DataBuffer matriint, char uplo, DataBuffer m,
                         DataBuffer n, double alpha, double beta,
                         INDArray a, DataBuffer lda );
    DataBuffer claseint( DataBuffer matriint, char uplo, DataBuffer m,
                         DataBuffer n, IComplexNumber alpha,
                         IComplexNumber beta,
                         IComplexNumber a, DataBuffer lda );
    DataBuffer zlaseint( DataBuffer matriint, char uplo, DataBuffer m,
                         DataBuffer n, IComplexNumber alpha,
                         IComplexNumber beta,
                         IComplexNumber a, DataBuffer lda );

    DataBuffer slasrint( char id, DataBuffer n, INDArray d );
    DataBuffer dlasrint( char id, DataBuffer n, INDArray d );

    DataBuffer slaswint( DataBuffer matriint, DataBuffer n, INDArray a,
                         DataBuffer lda, DataBuffer k1, DataBuffer k2,
                         DataBuffer ipiv, DataBuffer incx );
    DataBuffer dlaswint( DataBuffer matriint, DataBuffer n, INDArray a,
                         DataBuffer lda, DataBuffer k1, DataBuffer k2,
                         DataBuffer ipiv, DataBuffer incx );
    DataBuffer claswint( DataBuffer matriint, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         DataBuffer k1, DataBuffer k2,
                         DataBuffer ipiv, DataBuffer incx );
    DataBuffer zlaswint( DataBuffer matriint, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         DataBuffer k1, DataBuffer k2,
                         DataBuffer ipiv, DataBuffer incx );

    DataBuffer slatmint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         char dist, DataBuffer iseed, char sym,
                         INDArray d, DataBuffer mode, float cond,
                         float dmax, DataBuffer kl, DataBuffer ku,
                         char pack, INDArray a, DataBuffer lda,
                         INDArray work );
    DataBuffer dlatmint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         char dist, DataBuffer iseed, char sym,
                         INDArray d, DataBuffer mode, double cond,
                         double dmax, DataBuffer kl, DataBuffer ku,
                         char pack, INDArray a, DataBuffer lda,
                         INDArray work );
    DataBuffer clatmint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         char dist, DataBuffer iseed, char sym,
                         INDArray d, DataBuffer mode, float cond,
                         float dmax, DataBuffer kl, DataBuffer ku,
                         char pack, IComplexNumber a,
                         DataBuffer lda, IComplexNumber work );
    DataBuffer zlatmint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         char dist, DataBuffer iseed, char sym,
                         INDArray d, DataBuffer mode, double cond,
                         double dmax, DataBuffer kl, DataBuffer ku,
                         char pack, IComplexNumber a,
                         DataBuffer lda, IComplexNumber work );

    DataBuffer slauuint( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray a, DataBuffer lda );
    DataBuffer dlauuint( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray a, DataBuffer lda );
    DataBuffer clauuint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda );
    DataBuffer zlauuint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda );

    DataBuffer sopgtint( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray ap,  INDArray tau, INDArray q,
                         DataBuffer ldq, INDArray work );
    DataBuffer dopgtint( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray ap,  INDArray tau, INDArray q,
                         DataBuffer ldq, INDArray work );

    DataBuffer sopmtint( DataBuffer matriint, char side, char uplo,
                         char trans, DataBuffer m, DataBuffer n,
                         INDArray ap,  INDArray tau, INDArray c,
                         DataBuffer ldc, INDArray work );
    DataBuffer dopmtint( DataBuffer matriint, char side, char uplo,
                         char trans, DataBuffer m, DataBuffer n,
                         INDArray ap,  INDArray tau, INDArray c,
                         DataBuffer ldc, INDArray work );

    DataBuffer sorgbint( DataBuffer matriint, char vect, DataBuffer m,
                         DataBuffer n, DataBuffer k, INDArray a,
                         DataBuffer lda,  INDArray tau, INDArray work,
                         DataBuffer lwork );
    DataBuffer dorgbint( DataBuffer matriint, char vect, DataBuffer m,
                         DataBuffer n, DataBuffer k, INDArray a,
                         DataBuffer lda,  INDArray tau, INDArray work,
                         DataBuffer lwork );

    DataBuffer sorghint( DataBuffer matriint, DataBuffer n, DataBuffer ilo,
                         DataBuffer ihi, INDArray a, DataBuffer lda,
                         INDArray tau, INDArray work,
                         DataBuffer lwork );
    DataBuffer dorghint( DataBuffer matriint, DataBuffer n, DataBuffer ilo,
                         DataBuffer ihi, INDArray a, DataBuffer lda,
                         INDArray tau, INDArray work,
                         DataBuffer lwork );

    DataBuffer sorglint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer k, INDArray a, DataBuffer lda,
                         INDArray tau, INDArray work,
                         DataBuffer lwork );
    DataBuffer dorglint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer k, INDArray a, DataBuffer lda,
                         INDArray tau, INDArray work,
                         DataBuffer lwork );

    DataBuffer sorgqint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer k, INDArray a, DataBuffer lda,
                         INDArray tau, INDArray work,
                         DataBuffer lwork );
    DataBuffer dorgqint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer k, INDArray a, DataBuffer lda,
                         INDArray tau, INDArray work,
                         DataBuffer lwork );



    DataBuffer sorgrint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer k, INDArray a, DataBuffer lda,
                         INDArray tau, INDArray work,
                         DataBuffer lwork );
    DataBuffer dorgrint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer k, INDArray a, DataBuffer lda,
                         INDArray tau, INDArray work,
                         DataBuffer lwork );

    DataBuffer sorgtint( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray a, DataBuffer lda,  INDArray tau,
                         INDArray work, DataBuffer lwork );
    DataBuffer dorgtint( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray a, DataBuffer lda,  INDArray tau,
                         INDArray work, DataBuffer lwork );

    DataBuffer sormbint( DataBuffer matriint, char vect, char side,
                         char trans, DataBuffer m, DataBuffer n,
                         DataBuffer k,  INDArray a, DataBuffer lda,
                         INDArray tau, INDArray c, DataBuffer ldc,
                         INDArray work, DataBuffer lwork );
    DataBuffer dormbint( DataBuffer matriint, char vect, char side,
                         char trans, DataBuffer m, DataBuffer n,
                         DataBuffer k,  INDArray a, DataBuffer lda,
                         INDArray tau, INDArray c, DataBuffer ldc,
                         INDArray work, DataBuffer lwork );

    DataBuffer sormhint( DataBuffer matriint, char side, char trans,
                         DataBuffer m, DataBuffer n, DataBuffer ilo,
                         DataBuffer ihi,  INDArray a, DataBuffer lda,
                         INDArray tau, INDArray c, DataBuffer ldc,
                         INDArray work, DataBuffer lwork );
    DataBuffer dormhint( DataBuffer matriint, char side, char trans,
                         DataBuffer m, DataBuffer n, DataBuffer ilo,
                         DataBuffer ihi,  INDArray a, DataBuffer lda,
                         INDArray tau, INDArray c, DataBuffer ldc,
                         INDArray work, DataBuffer lwork );

    DataBuffer sormlint( DataBuffer matriint, char side, char trans,
                         DataBuffer m, DataBuffer n, DataBuffer k,
                         INDArray a, DataBuffer lda,
                         INDArray tau, INDArray c, DataBuffer ldc,
                         INDArray work, DataBuffer lwork );
    DataBuffer dormlint( DataBuffer matriint, char side, char trans,
                         DataBuffer m, DataBuffer n, DataBuffer k,
                         INDArray a, DataBuffer lda,
                         INDArray tau, INDArray c, DataBuffer ldc,
                         INDArray work, DataBuffer lwork );

    DataBuffer sormqint( DataBuffer matriint, char side, char trans,
                         DataBuffer m, DataBuffer n, DataBuffer k,
                         INDArray a, DataBuffer lda,
                         INDArray tau, INDArray c, DataBuffer ldc,
                         INDArray work, DataBuffer lwork );
    DataBuffer dormqint( DataBuffer matriint, char side, char trans,
                         DataBuffer m, DataBuffer n, DataBuffer k,
                         INDArray a, DataBuffer lda,
                         INDArray tau, INDArray c, DataBuffer ldc,
                         INDArray work, DataBuffer lwork );



    DataBuffer sormrint( DataBuffer matriint, char side, char trans,
                         DataBuffer m, DataBuffer n, DataBuffer k,
                         INDArray a, DataBuffer lda,
                         INDArray tau, INDArray c, DataBuffer ldc,
                         INDArray work, DataBuffer lwork );
    DataBuffer dormrint( DataBuffer matriint, char side, char trans,
                         DataBuffer m, DataBuffer n, DataBuffer k,
                         INDArray a, DataBuffer lda,
                         INDArray tau, INDArray c, DataBuffer ldc,
                         INDArray work, DataBuffer lwork );

    DataBuffer sormrint( DataBuffer matriint, char side, char trans,
                         DataBuffer m, DataBuffer n, DataBuffer k,
                         DataBuffer l,  INDArray a, DataBuffer lda,
                         INDArray tau, INDArray c, DataBuffer ldc,
                         INDArray work, DataBuffer lwork );
    DataBuffer dormrint( DataBuffer matriint, char side, char trans,
                         DataBuffer m, DataBuffer n, DataBuffer k,
                         DataBuffer l,  INDArray a, DataBuffer lda,
                         INDArray tau, INDArray c, DataBuffer ldc,
                         INDArray work, DataBuffer lwork );

    DataBuffer sormtint( DataBuffer matriint, char side, char uplo,
                         char trans, DataBuffer m, DataBuffer n,
                         INDArray a, DataBuffer lda,
                         INDArray tau, INDArray c, DataBuffer ldc,
                         INDArray work, DataBuffer lwork );
    DataBuffer dormtint( DataBuffer matriint, char side, char uplo,
                         char trans, DataBuffer m, DataBuffer n,
                         INDArray a, DataBuffer lda,
                         INDArray tau, INDArray c, DataBuffer ldc,
                         INDArray work, DataBuffer lwork );

    DataBuffer spbcoint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer kd,  INDArray ab, DataBuffer ldab,
                         float anorm, INDArray rcond, INDArray work,
                         DataBuffer iwork );
    DataBuffer dpbcoint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer kd,  INDArray ab,
                         DataBuffer ldab, double anorm, INDArray rcond,
                         INDArray work, DataBuffer iwork );
    DataBuffer cpbcoint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer kd,  IComplexNumber ab,
                         DataBuffer ldab, float anorm, INDArray rcond,
                         IComplexNumber work, INDArray rwork );
    DataBuffer zpbcoint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer kd,  IComplexNumber ab,
                         DataBuffer ldab, double anorm, INDArray rcond,
                         IComplexNumber work, INDArray rwork );

    DataBuffer spbeqint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer kd,  INDArray ab, DataBuffer ldab,
                         INDArray s, INDArray scond, INDArray amax );
    DataBuffer dpbeqint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer kd,  INDArray ab,
                         DataBuffer ldab, INDArray s, INDArray scond,
                         INDArray amax );
    DataBuffer cpbeqint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer kd,  IComplexNumber ab,
                         DataBuffer ldab, INDArray s, INDArray scond,
                         INDArray amax );
    DataBuffer zpbeqint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer kd,  IComplexNumber ab,
                         DataBuffer ldab, INDArray s, INDArray scond,
                         INDArray amax );

    DataBuffer spbrfint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer kd, DataBuffer nrhs,  INDArray ab,
                         DataBuffer ldab,  INDArray afb,
                         DataBuffer ldafb,  INDArray b,
                         DataBuffer ldb, INDArray x, DataBuffer ldx,
                         INDArray ferr, INDArray berr, INDArray work,
                         DataBuffer iwork );
    DataBuffer dpbrfint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer kd, DataBuffer nrhs,
                         INDArray ab, DataBuffer ldab,
                         INDArray afb, DataBuffer ldafb,
                         INDArray b, DataBuffer ldb, INDArray x,
                         DataBuffer ldx, INDArray ferr, INDArray berr,
                         INDArray work, DataBuffer iwork );
    DataBuffer cpbrfint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer kd, DataBuffer nrhs,
                         IComplexNumber ab, DataBuffer ldab,
                         IComplexNumber afb,
                         DataBuffer ldafb,  IComplexNumber b,
                         DataBuffer ldb, IComplexNumber x,
                         DataBuffer ldx, INDArray ferr, INDArray berr,
                         IComplexNumber work, INDArray rwork );
    DataBuffer zpbrfint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer kd, DataBuffer nrhs,
                         IComplexNumber ab,
                         DataBuffer ldab,
                         IComplexNumber afb,
                         DataBuffer ldafb,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber x, DataBuffer ldx,
                         INDArray ferr, INDArray berr,
                         IComplexNumber work, INDArray rwork );

    DataBuffer spbstint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer kb, INDArray bb, DataBuffer ldbb );
    DataBuffer dpbstint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer kb, INDArray bb, DataBuffer ldbb );
    DataBuffer cpbstint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer kb, IComplexNumber bb,
                         DataBuffer ldbb );
    DataBuffer zpbstint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer kb, IComplexNumber bb,
                         DataBuffer ldbb );

    DataBuffer spbsint( DataBuffer matriint, char uplo, DataBuffer n,
                        DataBuffer kd, DataBuffer nrhs, INDArray ab,
                        DataBuffer ldab, INDArray b, DataBuffer ldb );
    DataBuffer dpbsint( DataBuffer matriint, char uplo, DataBuffer n,
                        DataBuffer kd, DataBuffer nrhs, INDArray ab,
                        DataBuffer ldab, INDArray b, DataBuffer ldb );
    DataBuffer cpbsint( DataBuffer matriint, char uplo, DataBuffer n,
                        DataBuffer kd, DataBuffer nrhs,
                        IComplexNumber ab, DataBuffer ldab,
                        IComplexNumber b, DataBuffer ldb );
    DataBuffer zpbsint( DataBuffer matriint, char uplo, DataBuffer n,
                        DataBuffer kd, DataBuffer nrhs,
                        IComplexNumber ab, DataBuffer ldab,
                        IComplexNumber b, DataBuffer ldb );

    DataBuffer spbsvint( DataBuffer matriint, char fact, char uplo,
                         DataBuffer n, DataBuffer kd, DataBuffer nrhs,
                         INDArray ab, DataBuffer ldab, INDArray afb,
                         DataBuffer ldafb, String equed, INDArray s,
                         INDArray b, DataBuffer ldb, INDArray x,
                         DataBuffer ldx, INDArray rcond, INDArray ferr,
                         INDArray berr, INDArray work, DataBuffer iwork );
    DataBuffer dpbsvint( DataBuffer matriint, char fact, char uplo,
                         DataBuffer n, DataBuffer kd, DataBuffer nrhs,
                         INDArray ab, DataBuffer ldab, INDArray afb,
                         DataBuffer ldafb, String equed, INDArray s,
                         INDArray b, DataBuffer ldb, INDArray x,
                         DataBuffer ldx, INDArray rcond, INDArray ferr,
                         INDArray berr, INDArray work, DataBuffer iwork );
    DataBuffer cpbsvint( DataBuffer matriint, char fact, char uplo,
                         DataBuffer n, DataBuffer kd, DataBuffer nrhs,
                         IComplexNumber ab, DataBuffer ldab,
                         IComplexNumber afb, DataBuffer ldafb,
                         String equed, INDArray s, IComplexNumber b,
                         DataBuffer ldb, IComplexNumber x,
                         DataBuffer ldx, INDArray rcond, INDArray ferr,
                         INDArray berr, IComplexNumber work,
                         INDArray rwork );
    DataBuffer zpbsvint( DataBuffer matriint, char fact, char uplo,
                         DataBuffer n, DataBuffer kd, DataBuffer nrhs,
                         IComplexNumber ab, DataBuffer ldab,
                         IComplexNumber afb, DataBuffer ldafb,
                         String equed, INDArray s,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber x, DataBuffer ldx,
                         INDArray rcond, INDArray ferr, INDArray berr,
                         IComplexNumber work, INDArray rwork );

    DataBuffer spbtrint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer kd, INDArray ab, DataBuffer ldab );
    DataBuffer dpbtrint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer kd, INDArray ab, DataBuffer ldab );
    DataBuffer cpbtrint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer kd, IComplexNumber ab,
                         DataBuffer ldab );
    DataBuffer zpbtrint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer kd, IComplexNumber ab,
                         DataBuffer ldab );

    DataBuffer spbtrint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer kd, DataBuffer nrhs,  INDArray ab,
                         DataBuffer ldab, INDArray b, DataBuffer ldb );
    DataBuffer dpbtrint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer kd, DataBuffer nrhs,
                         INDArray ab, DataBuffer ldab, INDArray b,
                         DataBuffer ldb );
    DataBuffer cpbtrint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer kd, DataBuffer nrhs,
                         IComplexNumber ab, DataBuffer ldab,
                         IComplexNumber b, DataBuffer ldb );
    DataBuffer zpbtrint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer kd, DataBuffer nrhs,
                         IComplexNumber ab,
                         DataBuffer ldab, IComplexNumber b,
                         DataBuffer ldb );

    DataBuffer spftrint( DataBuffer matriint, char transr, char uplo,
                         DataBuffer n, INDArray a );
    DataBuffer dpftrint( DataBuffer matriint, char transr, char uplo,
                         DataBuffer n, INDArray a );
    DataBuffer cpftrint( DataBuffer matriint, char transr, char uplo,
                         DataBuffer n, IComplexNumber a );
    DataBuffer zpftrint( DataBuffer matriint, char transr, char uplo,
                         DataBuffer n, IComplexNumber a );



    DataBuffer spftrint( DataBuffer matriint, char transr, char uplo,
                         DataBuffer n, DataBuffer nrhs,  INDArray a,
                         INDArray b, DataBuffer ldb );
    DataBuffer dpftrint( DataBuffer matriint, char transr, char uplo,
                         DataBuffer n, DataBuffer nrhs,  INDArray a,
                         INDArray b, DataBuffer ldb );
    DataBuffer cpftrint( DataBuffer matriint, char transr, char uplo,
                         DataBuffer n, DataBuffer nrhs,
                         IComplexNumber a,
                         IComplexNumber b, DataBuffer ldb );
    DataBuffer zpftrint( DataBuffer matriint, char transr, char uplo,
                         DataBuffer n, DataBuffer nrhs,
                         IComplexNumber a,
                         IComplexNumber b, DataBuffer ldb );

    DataBuffer spocoint( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray a, DataBuffer lda, float anorm,
                         INDArray rcond, INDArray work, DataBuffer iwork );
    DataBuffer dpocoint( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray a, DataBuffer lda, double anorm,
                         INDArray rcond, INDArray work,
                         DataBuffer iwork );
    DataBuffer cpocoint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         float anorm, INDArray rcond,
                         IComplexNumber work, INDArray rwork );
    DataBuffer zpocoint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         double anorm, INDArray rcond,
                         IComplexNumber work, INDArray rwork );

    DataBuffer spoeqint( DataBuffer matriint, DataBuffer n,  INDArray a,
                         DataBuffer lda, INDArray s, INDArray scond,
                         INDArray amax );
    DataBuffer dpoeqint( DataBuffer matriint, DataBuffer n,  INDArray a,
                         DataBuffer lda, INDArray s, INDArray scond,
                         INDArray amax );
    DataBuffer cpoeqint( DataBuffer matriint, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         INDArray s, INDArray scond, INDArray amax );
    DataBuffer zpoeqint( DataBuffer matriint, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         INDArray s, INDArray scond, INDArray amax );

    DataBuffer spoequint( DataBuffer matriint, DataBuffer n,  INDArray a,
                          DataBuffer lda, INDArray s, INDArray scond,
                          INDArray amax );
    DataBuffer dpoequint( DataBuffer matriint, DataBuffer n,
                          INDArray a, DataBuffer lda, INDArray s,
                          INDArray scond, INDArray amax );
    DataBuffer cpoequint( DataBuffer matriint, DataBuffer n,
                          IComplexNumber a, DataBuffer lda,
                          INDArray s, INDArray scond, INDArray amax );
    DataBuffer zpoequint( DataBuffer matriint, DataBuffer n,
                          IComplexNumber a, DataBuffer lda,
                          INDArray s, INDArray scond, INDArray amax );

    DataBuffer sporfint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,  INDArray a, DataBuffer lda,
                         INDArray af, DataBuffer ldaf,
                         INDArray b, DataBuffer ldb, INDArray x,
                         DataBuffer ldx, INDArray ferr, INDArray berr,
                         INDArray work, DataBuffer iwork );
    DataBuffer dporfint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,  INDArray a,
                         DataBuffer lda,  INDArray af,
                         DataBuffer ldaf,  INDArray b,
                         DataBuffer ldb, INDArray x, DataBuffer ldx,
                         INDArray ferr, INDArray berr, INDArray work,
                         DataBuffer iwork );
    DataBuffer cporfint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,  IComplexNumber a,
                         DataBuffer lda,  IComplexNumber af,
                         DataBuffer ldaf,  IComplexNumber b,
                         DataBuffer ldb, IComplexNumber x,
                         DataBuffer ldx, INDArray ferr, INDArray berr,
                         IComplexNumber work, INDArray rwork );
    DataBuffer zporfint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,  IComplexNumber a,
                         DataBuffer lda,  IComplexNumber af,
                         DataBuffer ldaf,  IComplexNumber b,
                         DataBuffer ldb, IComplexNumber x,
                         DataBuffer ldx, INDArray ferr, INDArray berr,
                         IComplexNumber work, INDArray rwork );

    DataBuffer sporfsint( DataBuffer matriint, char uplo, char equed,
                          DataBuffer n, DataBuffer nrhs,  INDArray a,
                          DataBuffer lda,  INDArray af,
                          DataBuffer ldaf,  INDArray s,
                          INDArray b, DataBuffer ldb, INDArray x,
                          DataBuffer ldx, INDArray rcond, INDArray berr,
                          DataBuffer int_bnds, INDArray erint_norm,
                          INDArray erint_comp, DataBuffer nparams,
                          INDArray params, INDArray work,
                          DataBuffer iwork );
    DataBuffer dporfsint( DataBuffer matriint, char uplo, char equed,
                          DataBuffer n, DataBuffer nrhs,  INDArray a,
                          DataBuffer lda,  INDArray af,
                          DataBuffer ldaf,  INDArray s,
                          INDArray b, DataBuffer ldb, INDArray x,
                          DataBuffer ldx, INDArray rcond, INDArray berr,
                          DataBuffer int_bnds, INDArray erint_norm,
                          INDArray erint_comp, DataBuffer nparams,
                          INDArray params, INDArray work,
                          DataBuffer iwork );
    DataBuffer cporfsint( DataBuffer matriint, char uplo, char equed,
                          DataBuffer n, DataBuffer nrhs,
                          IComplexNumber a, DataBuffer lda,
                          IComplexNumber af,
                          DataBuffer ldaf,  INDArray s,
                          IComplexNumber b, DataBuffer ldb,
                          IComplexNumber x, DataBuffer ldx,
                          INDArray rcond, INDArray berr,
                          DataBuffer int_bnds, INDArray erint_norm,
                          INDArray erint_comp, DataBuffer nparams,
                          INDArray params, IComplexNumber work,
                          INDArray rwork );
    DataBuffer zporfsint( DataBuffer matriint, char uplo, char equed,
                          DataBuffer n, DataBuffer nrhs,
                          IComplexNumber a, DataBuffer lda,
                          IComplexNumber af,
                          DataBuffer ldaf,  INDArray s,
                          IComplexNumber b, DataBuffer ldb,
                          IComplexNumber x, DataBuffer ldx,
                          INDArray rcond, INDArray berr,
                          DataBuffer int_bnds, INDArray erint_norm,
                          INDArray erint_comp, DataBuffer nparams,
                          INDArray params, IComplexNumber work,
                          INDArray rwork );

    DataBuffer sposint( DataBuffer matriint, char uplo, DataBuffer n,
                        DataBuffer nrhs, INDArray a, DataBuffer lda,
                        INDArray b, DataBuffer ldb );
    DataBuffer dposint( DataBuffer matriint, char uplo, DataBuffer n,
                        DataBuffer nrhs, INDArray a, DataBuffer lda,
                        INDArray b, DataBuffer ldb );
    DataBuffer cposint( DataBuffer matriint, char uplo, DataBuffer n,
                        DataBuffer nrhs, IComplexNumber a,
                        DataBuffer lda, IComplexNumber b,
                        DataBuffer ldb );
    DataBuffer zposint( DataBuffer matriint, char uplo, DataBuffer n,
                        DataBuffer nrhs, IComplexNumber a,
                        DataBuffer lda, IComplexNumber b,
                        DataBuffer ldb );
    DataBuffer dsposint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs, INDArray a, DataBuffer lda,
                         INDArray b, DataBuffer ldb, INDArray x,
                         DataBuffer ldx, INDArray work, INDArray swork,
                         DataBuffer iter );
    DataBuffer zcposint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs, IComplexNumber a,
                         DataBuffer lda, IComplexNumber b,
                         DataBuffer ldb, IComplexNumber x,
                         DataBuffer ldx, IComplexNumber work,
                         IComplexNumber swork, INDArray rwork,
                         DataBuffer iter );

    DataBuffer sposvint( DataBuffer matriint, char fact, char uplo,
                         DataBuffer n, DataBuffer nrhs, INDArray a,
                         DataBuffer lda, INDArray af, DataBuffer ldaf,
                         String equed, INDArray s, INDArray b, DataBuffer ldb,
                         INDArray x, DataBuffer ldx, INDArray rcond,
                         INDArray ferr, INDArray berr, INDArray work,
                         DataBuffer iwork );
    DataBuffer dposvint( DataBuffer matriint, char fact, char uplo,
                         DataBuffer n, DataBuffer nrhs, INDArray a,
                         DataBuffer lda, INDArray af, DataBuffer ldaf,
                         String equed, INDArray s, INDArray b,
                         DataBuffer ldb, INDArray x, DataBuffer ldx,
                         INDArray rcond, INDArray ferr, INDArray berr,
                         INDArray work, DataBuffer iwork );
    DataBuffer cposvint( DataBuffer matriint, char fact, char uplo,
                         DataBuffer n, DataBuffer nrhs,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber af, DataBuffer ldaf,
                         String equed, INDArray s, IComplexNumber b,
                         DataBuffer ldb, IComplexNumber x,
                         DataBuffer ldx, INDArray rcond, INDArray ferr,
                         INDArray berr, IComplexNumber work,
                         INDArray rwork );
    DataBuffer zposvint( DataBuffer matriint, char fact, char uplo,
                         DataBuffer n, DataBuffer nrhs,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber af, DataBuffer ldaf,
                         String equed, INDArray s,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber x, DataBuffer ldx,
                         INDArray rcond, INDArray ferr, INDArray berr,
                         IComplexNumber work, INDArray rwork );

    DataBuffer sposvxint( DataBuffer matriint, char fact, char uplo,
                          DataBuffer n, DataBuffer nrhs, INDArray a,
                          DataBuffer lda, INDArray af, DataBuffer ldaf,
                          String equed, INDArray s, INDArray b,
                          DataBuffer ldb, INDArray x, DataBuffer ldx,
                          INDArray rcond, INDArray rpvgrw, INDArray berr,
                          DataBuffer int_bnds, INDArray erint_norm,
                          INDArray erint_comp, DataBuffer nparams,
                          INDArray params, INDArray work,
                          DataBuffer iwork );
    DataBuffer dposvxint( DataBuffer matriint, char fact, char uplo,
                          DataBuffer n, DataBuffer nrhs, INDArray a,
                          DataBuffer lda, INDArray af, DataBuffer ldaf,
                          String equed, INDArray s, INDArray b,
                          DataBuffer ldb, INDArray x, DataBuffer ldx,
                          INDArray rcond, INDArray rpvgrw, INDArray berr,
                          DataBuffer int_bnds, INDArray erint_norm,
                          INDArray erint_comp, DataBuffer nparams,
                          INDArray params, INDArray work,
                          DataBuffer iwork );
    DataBuffer cposvxint( DataBuffer matriint, char fact, char uplo,
                          DataBuffer n, DataBuffer nrhs,
                          IComplexNumber a, DataBuffer lda,
                          IComplexNumber af, DataBuffer ldaf,
                          String equed, INDArray s, IComplexNumber b,
                          DataBuffer ldb, IComplexNumber x,
                          DataBuffer ldx, INDArray rcond, INDArray rpvgrw,
                          INDArray berr, DataBuffer int_bnds,
                          INDArray erint_norm, INDArray erint_comp,
                          DataBuffer nparams, INDArray params,
                          IComplexNumber work, INDArray rwork );
    DataBuffer zposvxint( DataBuffer matriint, char fact, char uplo,
                          DataBuffer n, DataBuffer nrhs,
                          IComplexNumber a, DataBuffer lda,
                          IComplexNumber af, DataBuffer ldaf,
                          String equed, INDArray s,
                          IComplexNumber b, DataBuffer ldb,
                          IComplexNumber x, DataBuffer ldx,
                          INDArray rcond, INDArray rpvgrw, INDArray berr,
                          DataBuffer int_bnds, INDArray erint_norm,
                          INDArray erint_comp, DataBuffer nparams,
                          INDArray params, IComplexNumber work,
                          INDArray rwork );

    DataBuffer spotrf2_work( DataBuffer matriint, char uplo, DataBuffer n,
                             INDArray a, DataBuffer lda );
    DataBuffer dpotrf2_work( DataBuffer matriint, char uplo, DataBuffer n,
                             INDArray a, DataBuffer lda );
    DataBuffer cpotrf2_work( DataBuffer matriint, char uplo, DataBuffer n,
                             IComplexNumber a, DataBuffer lda );
    DataBuffer zpotrf2_work( DataBuffer matriint, char uplo, DataBuffer n,
                             IComplexNumber a, DataBuffer lda );

    DataBuffer spotrint( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray a, DataBuffer lda );
    DataBuffer dpotrint( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray a, DataBuffer lda );
    DataBuffer cpotrint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda );
    DataBuffer zpotrint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda );



    DataBuffer spotrint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,  INDArray a, DataBuffer lda,
                         INDArray b, DataBuffer ldb );
    DataBuffer dpotrint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,  INDArray a,
                         DataBuffer lda, INDArray b, DataBuffer ldb );
    DataBuffer cpotrint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,  IComplexNumber a,
                         DataBuffer lda, IComplexNumber b,
                         DataBuffer ldb );
    DataBuffer zpotrint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,  IComplexNumber a,
                         DataBuffer lda, IComplexNumber b,
                         DataBuffer ldb );

    DataBuffer sppcoint( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray ap, float anorm, INDArray rcond,
                         INDArray work, DataBuffer iwork );
    DataBuffer dppcoint( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray ap, double anorm, INDArray rcond,
                         INDArray work, DataBuffer iwork );
    DataBuffer cppcoint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber ap, float anorm,
                         INDArray rcond, IComplexNumber work,
                         INDArray rwork );
    DataBuffer zppcoint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber ap, double anorm,
                         INDArray rcond, IComplexNumber work,
                         INDArray rwork );

    DataBuffer sppeqint( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray ap, INDArray s, INDArray scond,
                         INDArray amax );
    DataBuffer dppeqint( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray ap, INDArray s, INDArray scond,
                         INDArray amax );
    DataBuffer cppeqint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber ap, INDArray s,
                         INDArray scond, INDArray amax );
    DataBuffer zppeqint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber ap, INDArray s,
                         INDArray scond, INDArray amax );

    DataBuffer spprfint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,  INDArray ap,
                         INDArray afp,  INDArray b,
                         DataBuffer ldb, INDArray x, DataBuffer ldx,
                         INDArray ferr, INDArray berr, INDArray work,
                         DataBuffer iwork );
    DataBuffer dpprfint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,  INDArray ap,
                         INDArray afp,  INDArray b,
                         DataBuffer ldb, INDArray x, DataBuffer ldx,
                         INDArray ferr, INDArray berr, INDArray work,
                         DataBuffer iwork );
    DataBuffer cpprfint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,  IComplexNumber ap,
                         IComplexNumber afp,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber x, DataBuffer ldx,
                         INDArray ferr, INDArray berr,
                         IComplexNumber work, INDArray rwork );
    DataBuffer zpprfint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,
                         IComplexNumber ap,
                         IComplexNumber afp,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber x, DataBuffer ldx,
                         INDArray ferr, INDArray berr,
                         IComplexNumber work, INDArray rwork );

    DataBuffer sppsint( DataBuffer matriint, char uplo, DataBuffer n,
                        DataBuffer nrhs, INDArray ap, INDArray b,
                        DataBuffer ldb );
    DataBuffer dppsint( DataBuffer matriint, char uplo, DataBuffer n,
                        DataBuffer nrhs, INDArray ap, INDArray b,
                        DataBuffer ldb );
    DataBuffer cppsint( DataBuffer matriint, char uplo, DataBuffer n,
                        DataBuffer nrhs, IComplexNumber ap,
                        IComplexNumber b, DataBuffer ldb );
    DataBuffer zppsint( DataBuffer matriint, char uplo, DataBuffer n,
                        DataBuffer nrhs, IComplexNumber ap,
                        IComplexNumber b, DataBuffer ldb );

    DataBuffer sppsvint( DataBuffer matriint, char fact, char uplo,
                         DataBuffer n, DataBuffer nrhs, INDArray ap,
                         INDArray afp, String equed, INDArray s, INDArray b,
                         DataBuffer ldb, INDArray x, DataBuffer ldx,
                         INDArray rcond, INDArray ferr, INDArray berr,
                         INDArray work, DataBuffer iwork );
    DataBuffer dppsvint( DataBuffer matriint, char fact, char uplo,
                         DataBuffer n, DataBuffer nrhs, INDArray ap,
                         INDArray afp, String equed, INDArray s, INDArray b,
                         DataBuffer ldb, INDArray x, DataBuffer ldx,
                         INDArray rcond, INDArray ferr, INDArray berr,
                         INDArray work, DataBuffer iwork );
    DataBuffer cppsvint( DataBuffer matriint, char fact, char uplo,
                         DataBuffer n, DataBuffer nrhs,
                         IComplexNumber ap,
                         IComplexNumber afp, String equed,
                         INDArray s, IComplexNumber b,
                         DataBuffer ldb, IComplexNumber x,
                         DataBuffer ldx, INDArray rcond, INDArray ferr,
                         INDArray berr, IComplexNumber work,
                         INDArray rwork );
    DataBuffer zppsvint( DataBuffer matriint, char fact, char uplo,
                         DataBuffer n, DataBuffer nrhs,
                         IComplexNumber ap,
                         IComplexNumber afp, String equed,
                         INDArray s, IComplexNumber b,
                         DataBuffer ldb, IComplexNumber x,
                         DataBuffer ldx, INDArray rcond, INDArray ferr,
                         INDArray berr, IComplexNumber work,
                         INDArray rwork );

    DataBuffer spptrint( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray ap );
    DataBuffer dpptrint( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray ap );
    DataBuffer cpptrint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber ap );
    DataBuffer zpptrint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber ap );



    DataBuffer spptrint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,  INDArray ap, INDArray b,
                         DataBuffer ldb );
    DataBuffer dpptrint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,  INDArray ap, INDArray b,
                         DataBuffer ldb );
    DataBuffer cpptrint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,  IComplexNumber ap,
                         IComplexNumber b, DataBuffer ldb );
    DataBuffer zpptrint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,
                         IComplexNumber ap,
                         IComplexNumber b, DataBuffer ldb );

    DataBuffer spstrint( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray a, DataBuffer lda, DataBuffer piv,
                         DataBuffer rank, float tol, INDArray work );
    DataBuffer dpstrint( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray a, DataBuffer lda, DataBuffer piv,
                         DataBuffer rank, double tol, INDArray work );
    DataBuffer cpstrint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         DataBuffer piv, DataBuffer rank, float tol,
                         INDArray work );
    DataBuffer zpstrint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         DataBuffer piv, DataBuffer rank, double tol,
                         INDArray work );

    DataBuffer sptcoint( DataBuffer n,  INDArray d,  INDArray e,
                         float anorm, INDArray rcond, INDArray work );
    DataBuffer dptcoint( DataBuffer n,  INDArray d,  INDArray e,
                         double anorm, INDArray rcond, INDArray work );
    DataBuffer cptcoint( DataBuffer n,  INDArray d,
                         IComplexNumber e, float anorm,
                         INDArray rcond, INDArray work );
    DataBuffer zptcoint( DataBuffer n,  INDArray d,
                         IComplexNumber e, double anorm,
                         INDArray rcond, INDArray work );

    DataBuffer spteqint( DataBuffer matriint, char compz, DataBuffer n,
                         INDArray d, INDArray e, INDArray z, DataBuffer ldz,
                         INDArray work );
    DataBuffer dpteqint( DataBuffer matriint, char compz, DataBuffer n,
                         INDArray d, INDArray e, INDArray z, DataBuffer ldz,
                         INDArray work );
    DataBuffer cpteqint( DataBuffer matriint, char compz, DataBuffer n,
                         INDArray d, INDArray e, IComplexNumber z,
                         DataBuffer ldz, INDArray work );
    DataBuffer zpteqint( DataBuffer matriint, char compz, DataBuffer n,
                         INDArray d, INDArray e, IComplexNumber z,
                         DataBuffer ldz, INDArray work );

    DataBuffer sptrfint( DataBuffer matriint, DataBuffer n, DataBuffer nrhs,
                         INDArray d,  INDArray e,  INDArray df,
                         INDArray ef,  INDArray b, DataBuffer ldb,
                         INDArray x, DataBuffer ldx, INDArray ferr,
                         INDArray berr, INDArray work );
    DataBuffer dptrfint( DataBuffer matriint, DataBuffer n, DataBuffer nrhs,
                         INDArray d,  INDArray e,
                         INDArray df,  INDArray ef,
                         INDArray b, DataBuffer ldb, INDArray x,
                         DataBuffer ldx, INDArray ferr, INDArray berr,
                         INDArray work );
    DataBuffer cptrfint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,  INDArray d,
                         IComplexNumber e,  INDArray df,
                         IComplexNumber ef,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber x, DataBuffer ldx,
                         INDArray ferr, INDArray berr,
                         IComplexNumber work, INDArray rwork );
    DataBuffer zptrfint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,  INDArray d,
                         IComplexNumber e,
                         INDArray df,
                         IComplexNumber ef,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber x, DataBuffer ldx,
                         INDArray ferr, INDArray berr,
                         IComplexNumber work, INDArray rwork );

    DataBuffer sptsint( DataBuffer matriint, DataBuffer n, DataBuffer nrhs,
                        INDArray d, INDArray e, INDArray b, DataBuffer ldb );
    DataBuffer dptsint( DataBuffer matriint, DataBuffer n, DataBuffer nrhs,
                        INDArray d, INDArray e, INDArray b,
                        DataBuffer ldb );
    DataBuffer cptsint( DataBuffer matriint, DataBuffer n, DataBuffer nrhs,
                        INDArray d, IComplexNumber e,
                        IComplexNumber b, DataBuffer ldb );
    DataBuffer zptsint( DataBuffer matriint, DataBuffer n, DataBuffer nrhs,
                        INDArray d, IComplexNumber e,
                        IComplexNumber b, DataBuffer ldb );

    DataBuffer sptsvint( DataBuffer matriint, char fact, DataBuffer n,
                         DataBuffer nrhs,  INDArray d,  INDArray e,
                         INDArray df, INDArray ef,  INDArray b,
                         DataBuffer ldb, INDArray x, DataBuffer ldx,
                         INDArray rcond, INDArray ferr, INDArray berr,
                         INDArray work );
    DataBuffer dptsvint( DataBuffer matriint, char fact, DataBuffer n,
                         DataBuffer nrhs,  INDArray d,
                         INDArray e, INDArray df, INDArray ef,
                         INDArray b, DataBuffer ldb, INDArray x,
                         DataBuffer ldx, INDArray rcond, INDArray ferr,
                         INDArray berr, INDArray work );
    DataBuffer cptsvint( DataBuffer matriint, char fact, DataBuffer n,
                         DataBuffer nrhs,  INDArray d,
                         IComplexNumber e, INDArray df,
                         IComplexNumber ef,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber x, DataBuffer ldx,
                         INDArray rcond, INDArray ferr, INDArray berr,
                         IComplexNumber work, INDArray rwork );
    DataBuffer zptsvint( DataBuffer matriint, char fact, DataBuffer n,
                         DataBuffer nrhs,  INDArray d,
                         IComplexNumber e, INDArray df,
                         IComplexNumber ef,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber x, DataBuffer ldx,
                         INDArray rcond, INDArray ferr, INDArray berr,
                         IComplexNumber work, INDArray rwork );

    DataBuffer spttrint( DataBuffer n, INDArray d, INDArray e );
    DataBuffer dpttrint( DataBuffer n, INDArray d, INDArray e );
    DataBuffer cpttrint( DataBuffer n, INDArray d,
                         IComplexNumber e );
    DataBuffer zpttrint( DataBuffer n, INDArray d,
                         IComplexNumber e );

    DataBuffer spttrint( DataBuffer matriint, DataBuffer n, DataBuffer nrhs,
                         INDArray d,  INDArray e, INDArray b,
                         DataBuffer ldb );
    DataBuffer dpttrint( DataBuffer matriint, DataBuffer n, DataBuffer nrhs,
                         INDArray d,  INDArray e, INDArray b,
                         DataBuffer ldb );
    DataBuffer cpttrint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,  INDArray d,
                         IComplexNumber e,
                         IComplexNumber b, DataBuffer ldb );
    DataBuffer zpttrint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,  INDArray d,
                         IComplexNumber e,
                         IComplexNumber b, DataBuffer ldb );

    DataBuffer ssbeint( DataBuffer matriint, char jobz, char uplo,
                        DataBuffer n, DataBuffer kd, INDArray ab,
                        DataBuffer ldab, INDArray w, INDArray z,
                        DataBuffer ldz, INDArray work );
    DataBuffer dsbeint( DataBuffer matriint, char jobz, char uplo,
                        DataBuffer n, DataBuffer kd, INDArray ab,
                        DataBuffer ldab, INDArray w, INDArray z,
                        DataBuffer ldz, INDArray work );

    DataBuffer ssbevint( DataBuffer matriint, char jobz, char uplo,
                         DataBuffer n, DataBuffer kd, INDArray ab,
                         DataBuffer ldab, INDArray w, INDArray z,
                         DataBuffer ldz, INDArray work, DataBuffer lwork,
                         DataBuffer iwork, DataBuffer liwork );
    DataBuffer dsbevint( DataBuffer matriint, char jobz, char uplo,
                         DataBuffer n, DataBuffer kd, INDArray ab,
                         DataBuffer ldab, INDArray w, INDArray z,
                         DataBuffer ldz, INDArray work, DataBuffer lwork,
                         DataBuffer iwork, DataBuffer liwork );

    DataBuffer ssbevint( DataBuffer matriint, char jobz, char range,
                         char uplo, DataBuffer n, DataBuffer kd,
                         INDArray ab, DataBuffer ldab, INDArray q,
                         DataBuffer ldq, float vl, float vu,
                         DataBuffer il, DataBuffer iu, float abstol,
                         DataBuffer m, INDArray w, INDArray z,
                         DataBuffer ldz, INDArray work, DataBuffer iwork,
                         DataBuffer ifail );
    DataBuffer dsbevint( DataBuffer matriint, char jobz, char range,
                         char uplo, DataBuffer n, DataBuffer kd,
                         INDArray ab, DataBuffer ldab, INDArray q,
                         DataBuffer ldq, double vl, double vu,
                         DataBuffer il, DataBuffer iu, double abstol,
                         DataBuffer m, INDArray w, INDArray z,
                         DataBuffer ldz, INDArray work, DataBuffer iwork,
                         DataBuffer ifail );

    DataBuffer ssbgsint( DataBuffer matriint, char vect, char uplo,
                         DataBuffer n, DataBuffer ka, DataBuffer kb,
                         INDArray ab, DataBuffer ldab,  INDArray bb,
                         DataBuffer ldbb, INDArray x, DataBuffer ldx,
                         INDArray work );
    DataBuffer dsbgsint( DataBuffer matriint, char vect, char uplo,
                         DataBuffer n, DataBuffer ka, DataBuffer kb,
                         INDArray ab, DataBuffer ldab,  INDArray bb,
                         DataBuffer ldbb, INDArray x, DataBuffer ldx,
                         INDArray work );

    DataBuffer ssbgint( DataBuffer matriint, char jobz, char uplo,
                        DataBuffer n, DataBuffer ka, DataBuffer kb,
                        INDArray ab, DataBuffer ldab, INDArray bb,
                        DataBuffer ldbb, INDArray w, INDArray z,
                        DataBuffer ldz, INDArray work );
    DataBuffer dsbgint( DataBuffer matriint, char jobz, char uplo,
                        DataBuffer n, DataBuffer ka, DataBuffer kb,
                        INDArray ab, DataBuffer ldab, INDArray bb,
                        DataBuffer ldbb, INDArray w, INDArray z,
                        DataBuffer ldz, INDArray work );

    DataBuffer ssbgvint( DataBuffer matriint, char jobz, char uplo,
                         DataBuffer n, DataBuffer ka, DataBuffer kb,
                         INDArray ab, DataBuffer ldab, INDArray bb,
                         DataBuffer ldbb, INDArray w, INDArray z,
                         DataBuffer ldz, INDArray work, DataBuffer lwork,
                         DataBuffer iwork, DataBuffer liwork );
    DataBuffer dsbgvint( DataBuffer matriint, char jobz, char uplo,
                         DataBuffer n, DataBuffer ka, DataBuffer kb,
                         INDArray ab, DataBuffer ldab, INDArray bb,
                         DataBuffer ldbb, INDArray w, INDArray z,
                         DataBuffer ldz, INDArray work, DataBuffer lwork,
                         DataBuffer iwork, DataBuffer liwork );

    DataBuffer ssbgvint( DataBuffer matriint, char jobz, char range,
                         char uplo, DataBuffer n, DataBuffer ka,
                         DataBuffer kb, INDArray ab, DataBuffer ldab,
                         INDArray bb, DataBuffer ldbb, INDArray q,
                         DataBuffer ldq, float vl, float vu,
                         DataBuffer il, DataBuffer iu, float abstol,
                         DataBuffer m, INDArray w, INDArray z,
                         DataBuffer ldz, INDArray work, DataBuffer iwork,
                         DataBuffer ifail );
    DataBuffer dsbgvint( DataBuffer matriint, char jobz, char range,
                         char uplo, DataBuffer n, DataBuffer ka,
                         DataBuffer kb, INDArray ab, DataBuffer ldab,
                         INDArray bb, DataBuffer ldbb, INDArray q,
                         DataBuffer ldq, double vl, double vu,
                         DataBuffer il, DataBuffer iu, double abstol,
                         DataBuffer m, INDArray w, INDArray z,
                         DataBuffer ldz, INDArray work, DataBuffer iwork,
                         DataBuffer ifail );

    DataBuffer ssbtrint( DataBuffer matriint, char vect, char uplo,
                         DataBuffer n, DataBuffer kd, INDArray ab,
                         DataBuffer ldab, INDArray d, INDArray e, INDArray q,
                         DataBuffer ldq, INDArray work );
    DataBuffer dsbtrint( DataBuffer matriint, char vect, char uplo,
                         DataBuffer n, DataBuffer kd, INDArray ab,
                         DataBuffer ldab, INDArray d, INDArray e,
                         INDArray q, DataBuffer ldq, INDArray work );

    DataBuffer ssfrint( DataBuffer matriint, char transr, char uplo,
                        char trans, DataBuffer n, DataBuffer k,
                        float alpha,  INDArray a, DataBuffer lda,
                        float beta, INDArray c );
    DataBuffer dsfrint( DataBuffer matriint, char transr, char uplo,
                        char trans, DataBuffer n, DataBuffer k,
                        double alpha,  INDArray a, DataBuffer lda,
                        double beta, INDArray c );

    DataBuffer sspcoint( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray ap,  DataBuffer ipiv,
                         float anorm, INDArray rcond, INDArray work,
                         DataBuffer iwork );
    DataBuffer dspcoint( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray ap,  DataBuffer ipiv,
                         double anorm, INDArray rcond, INDArray work,
                         DataBuffer iwork );
    DataBuffer cspcoint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber ap,
                         DataBuffer ipiv, float anorm,
                         INDArray rcond, IComplexNumber work );
    DataBuffer zspcoint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber ap,
                         DataBuffer ipiv, double anorm,
                         INDArray rcond, IComplexNumber work );

    DataBuffer sspeint( DataBuffer matriint, char jobz, char uplo,
                        DataBuffer n, INDArray ap, INDArray w, INDArray z,
                        DataBuffer ldz, INDArray work );
    DataBuffer dspeint( DataBuffer matriint, char jobz, char uplo,
                        DataBuffer n, INDArray ap, INDArray w, INDArray z,
                        DataBuffer ldz, INDArray work );

    DataBuffer sspevint( DataBuffer matriint, char jobz, char uplo,
                         DataBuffer n, INDArray ap, INDArray w, INDArray z,
                         DataBuffer ldz, INDArray work, DataBuffer lwork,
                         DataBuffer iwork, DataBuffer liwork );
    DataBuffer dspevint( DataBuffer matriint, char jobz, char uplo,
                         DataBuffer n, INDArray ap, INDArray w, INDArray z,
                         DataBuffer ldz, INDArray work, DataBuffer lwork,
                         DataBuffer iwork, DataBuffer liwork );

    DataBuffer sspevint( DataBuffer matriint, char jobz, char range,
                         char uplo, DataBuffer n, INDArray ap, float vl,
                         float vu, DataBuffer il, DataBuffer iu,
                         float abstol, DataBuffer m, INDArray w, INDArray z,
                         DataBuffer ldz, INDArray work, DataBuffer iwork,
                         DataBuffer ifail );
    DataBuffer dspevint( DataBuffer matriint, char jobz, char range,
                         char uplo, DataBuffer n, INDArray ap, double vl,
                         double vu, DataBuffer il, DataBuffer iu,
                         double abstol, DataBuffer m, INDArray w,
                         INDArray z, DataBuffer ldz, INDArray work,
                         DataBuffer iwork, DataBuffer ifail );

    DataBuffer sspgsint( DataBuffer matriint, DataBuffer itype, char uplo,
                         DataBuffer n, INDArray ap,  INDArray bp );
    DataBuffer dspgsint( DataBuffer matriint, DataBuffer itype, char uplo,
                         DataBuffer n, INDArray ap,  INDArray bp );

    DataBuffer sspgint( DataBuffer matriint, DataBuffer itype, char jobz,
                        char uplo, DataBuffer n, INDArray ap, INDArray bp,
                        INDArray w, INDArray z, DataBuffer ldz,
                        INDArray work );
    DataBuffer dspgint( DataBuffer matriint, DataBuffer itype, char jobz,
                        char uplo, DataBuffer n, INDArray ap, INDArray bp,
                        INDArray w, INDArray z, DataBuffer ldz,
                        INDArray work );

    DataBuffer sspgvint( DataBuffer matriint, DataBuffer itype, char jobz,
                         char uplo, DataBuffer n, INDArray ap, INDArray bp,
                         INDArray w, INDArray z, DataBuffer ldz, INDArray work,
                         DataBuffer lwork, DataBuffer iwork,
                         DataBuffer liwork );
    DataBuffer dspgvint( DataBuffer matriint, DataBuffer itype, char jobz,
                         char uplo, DataBuffer n, INDArray ap, INDArray bp,
                         INDArray w, INDArray z, DataBuffer ldz,
                         INDArray work, DataBuffer lwork,
                         DataBuffer iwork, DataBuffer liwork );

    DataBuffer sspgvint( DataBuffer matriint, DataBuffer itype, char jobz,
                         char range, char uplo, DataBuffer n, INDArray ap,
                         INDArray bp, float vl, float vu, DataBuffer il,
                         DataBuffer iu, float abstol, DataBuffer m,
                         INDArray w, INDArray z, DataBuffer ldz, INDArray work,
                         DataBuffer iwork, DataBuffer ifail );
    DataBuffer dspgvint( DataBuffer matriint, DataBuffer itype, char jobz,
                         char range, char uplo, DataBuffer n, INDArray ap,
                         INDArray bp, double vl, double vu, DataBuffer il,
                         DataBuffer iu, double abstol, DataBuffer m,
                         INDArray w, INDArray z, DataBuffer ldz,
                         INDArray work, DataBuffer iwork,
                         DataBuffer ifail );

    DataBuffer ssprfint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,  INDArray ap,
                         INDArray afp,  DataBuffer ipiv,
                         INDArray b, DataBuffer ldb, INDArray x,
                         DataBuffer ldx, INDArray ferr, INDArray berr,
                         INDArray work, DataBuffer iwork );
    DataBuffer dsprfint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,  INDArray ap,
                         INDArray afp,  DataBuffer ipiv,
                         INDArray b, DataBuffer ldb, INDArray x,
                         DataBuffer ldx, INDArray ferr, INDArray berr,
                         INDArray work, DataBuffer iwork );
    DataBuffer csprfint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,  IComplexNumber ap,
                         IComplexNumber afp,
                         DataBuffer ipiv,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber x, DataBuffer ldx,
                         INDArray ferr, INDArray berr,
                         IComplexNumber work, INDArray rwork );
    DataBuffer zsprfint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,
                         IComplexNumber ap,
                         IComplexNumber afp,
                         DataBuffer ipiv,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber x, DataBuffer ldx,
                         INDArray ferr, INDArray berr,
                         IComplexNumber work, INDArray rwork );

    DataBuffer sspsint( DataBuffer matriint, char uplo, DataBuffer n,
                        DataBuffer nrhs, INDArray ap, DataBuffer ipiv,
                        INDArray b, DataBuffer ldb );
    DataBuffer dspsint( DataBuffer matriint, char uplo, DataBuffer n,
                        DataBuffer nrhs, INDArray ap, DataBuffer ipiv,
                        INDArray b, DataBuffer ldb );
    DataBuffer cspsint( DataBuffer matriint, char uplo, DataBuffer n,
                        DataBuffer nrhs, IComplexNumber ap,
                        DataBuffer ipiv, IComplexNumber b,
                        DataBuffer ldb );
    DataBuffer zspsint( DataBuffer matriint, char uplo, DataBuffer n,
                        DataBuffer nrhs, IComplexNumber ap,
                        DataBuffer ipiv, IComplexNumber b,
                        DataBuffer ldb );

    DataBuffer sspsvint( DataBuffer matriint, char fact, char uplo,
                         DataBuffer n, DataBuffer nrhs,  INDArray ap,
                         INDArray afp, DataBuffer ipiv,  INDArray b,
                         DataBuffer ldb, INDArray x, DataBuffer ldx,
                         INDArray rcond, INDArray ferr, INDArray berr,
                         INDArray work, DataBuffer iwork );
    DataBuffer dspsvint( DataBuffer matriint, char fact, char uplo,
                         DataBuffer n, DataBuffer nrhs,  INDArray ap,
                         INDArray afp, DataBuffer ipiv,  INDArray b,
                         DataBuffer ldb, INDArray x, DataBuffer ldx,
                         INDArray rcond, INDArray ferr, INDArray berr,
                         INDArray work, DataBuffer iwork );
    DataBuffer cspsvint( DataBuffer matriint, char fact, char uplo,
                         DataBuffer n, DataBuffer nrhs,
                         IComplexNumber ap,
                         IComplexNumber afp, DataBuffer ipiv,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber x, DataBuffer ldx,
                         INDArray rcond, INDArray ferr, INDArray berr,
                         IComplexNumber work, INDArray rwork );
    DataBuffer zspsvint( DataBuffer matriint, char fact, char uplo,
                         DataBuffer n, DataBuffer nrhs,
                         IComplexNumber ap,
                         IComplexNumber afp, DataBuffer ipiv,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber x, DataBuffer ldx,
                         INDArray rcond, INDArray ferr, INDArray berr,
                         IComplexNumber work, INDArray rwork );

    DataBuffer ssptrint( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray ap, INDArray d, INDArray e, INDArray tau );
    DataBuffer dsptrint( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray ap, INDArray d, INDArray e, INDArray tau );

    DataBuffer ssptrint( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray ap, DataBuffer ipiv );
    DataBuffer dsptrint( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray ap, DataBuffer ipiv );
    DataBuffer csptrint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber ap, DataBuffer ipiv );
    DataBuffer zsptrint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber ap, DataBuffer ipiv );

    DataBuffer ssptrint( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray ap,  DataBuffer ipiv,
                         INDArray work );
    DataBuffer dsptrint( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray ap,  DataBuffer ipiv,
                         INDArray work );
    DataBuffer csptrint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber ap,
                         DataBuffer ipiv,
                         IComplexNumber work );
    DataBuffer zsptrint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber ap,
                         DataBuffer ipiv,
                         IComplexNumber work );

    DataBuffer ssptrint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,  INDArray ap,
                         DataBuffer ipiv, INDArray b,
                         DataBuffer ldb );
    DataBuffer dsptrint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,  INDArray ap,
                         DataBuffer ipiv, INDArray b,
                         DataBuffer ldb );
    DataBuffer csptrint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,  IComplexNumber ap,
                         DataBuffer ipiv, IComplexNumber b,
                         DataBuffer ldb );
    DataBuffer zsptrint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,
                         IComplexNumber ap,
                         DataBuffer ipiv,
                         IComplexNumber b, DataBuffer ldb );

    DataBuffer sstebint( char range, char order, DataBuffer n, float vl,
                         float vu, DataBuffer il, DataBuffer iu,
                         float abstol,  INDArray d,  INDArray e,
                         DataBuffer m, DataBuffer nsplit, INDArray w,
                         DataBuffer iblock, DataBuffer isplit,
                         INDArray work, DataBuffer iwork );
    DataBuffer dstebint( char range, char order, DataBuffer n, double vl,
                         double vu, DataBuffer il, DataBuffer iu,
                         double abstol,  INDArray d,  INDArray e,
                         DataBuffer m, DataBuffer nsplit, INDArray w,
                         DataBuffer iblock, DataBuffer isplit,
                         INDArray work, DataBuffer iwork );

    DataBuffer sstedint( DataBuffer matriint, char compz, DataBuffer n,
                         INDArray d, INDArray e, INDArray z, DataBuffer ldz,
                         INDArray work, DataBuffer lwork,
                         DataBuffer iwork, DataBuffer liwork );
    DataBuffer dstedint( DataBuffer matriint, char compz, DataBuffer n,
                         INDArray d, INDArray e, INDArray z, DataBuffer ldz,
                         INDArray work, DataBuffer lwork,
                         DataBuffer iwork, DataBuffer liwork );
    DataBuffer cstedint( DataBuffer matriint, char compz, DataBuffer n,
                         INDArray d, INDArray e, IComplexNumber z,
                         DataBuffer ldz, IComplexNumber work,
                         DataBuffer lwork, INDArray rwork,
                         DataBuffer lrwork, DataBuffer iwork,
                         DataBuffer liwork );
    DataBuffer zstedint( DataBuffer matriint, char compz, DataBuffer n,
                         INDArray d, INDArray e, IComplexNumber z,
                         DataBuffer ldz, IComplexNumber work,
                         DataBuffer lwork, INDArray rwork,
                         DataBuffer lrwork, DataBuffer iwork,
                         DataBuffer liwork );

    DataBuffer sstegint( DataBuffer matriint, char jobz, char range,
                         DataBuffer n, INDArray d, INDArray e, float vl,
                         float vu, DataBuffer il, DataBuffer iu,
                         float abstol, DataBuffer m, INDArray w, INDArray z,
                         DataBuffer ldz, DataBuffer isuppz, INDArray work,
                         DataBuffer lwork, DataBuffer iwork,
                         DataBuffer liwork );
    DataBuffer dstegint( DataBuffer matriint, char jobz, char range,
                         DataBuffer n, INDArray d, INDArray e, double vl,
                         double vu, DataBuffer il, DataBuffer iu,
                         double abstol, DataBuffer m, INDArray w,
                         INDArray z, DataBuffer ldz, DataBuffer isuppz,
                         INDArray work, DataBuffer lwork,
                         DataBuffer iwork, DataBuffer liwork );
    DataBuffer cstegint( DataBuffer matriint, char jobz, char range,
                         DataBuffer n, INDArray d, INDArray e, float vl,
                         float vu, DataBuffer il, DataBuffer iu,
                         float abstol, DataBuffer m, INDArray w,
                         IComplexNumber z, DataBuffer ldz,
                         DataBuffer isuppz, INDArray work,
                         DataBuffer lwork, DataBuffer iwork,
                         DataBuffer liwork );
    DataBuffer zstegint( DataBuffer matriint, char jobz, char range,
                         DataBuffer n, INDArray d, INDArray e, double vl,
                         double vu, DataBuffer il, DataBuffer iu,
                         double abstol, DataBuffer m, INDArray w,
                         IComplexNumber z, DataBuffer ldz,
                         DataBuffer isuppz, INDArray work,
                         DataBuffer lwork, DataBuffer iwork,
                         DataBuffer liwork );

    DataBuffer ssteiint( DataBuffer matriint, DataBuffer n,  INDArray d,
                         INDArray e, DataBuffer m,  INDArray w,
                         DataBuffer iblock,
                         DataBuffer isplit, INDArray z,
                         DataBuffer ldz, INDArray work, DataBuffer iwork,
                         DataBuffer ifailv );
    DataBuffer dsteiint( DataBuffer matriint, DataBuffer n,  INDArray d,
                         INDArray e, DataBuffer m,  INDArray w,
                         DataBuffer iblock,
                         DataBuffer isplit, INDArray z,
                         DataBuffer ldz, INDArray work, DataBuffer iwork,
                         DataBuffer ifailv );
    DataBuffer csteiint( DataBuffer matriint, DataBuffer n,  INDArray d,
                         INDArray e, DataBuffer m,  INDArray w,
                         DataBuffer iblock,
                         DataBuffer isplit,
                         IComplexNumber z, DataBuffer ldz,
                         INDArray work, DataBuffer iwork,
                         DataBuffer ifailv );
    DataBuffer zsteiint( DataBuffer matriint, DataBuffer n,  INDArray d,
                         INDArray e, DataBuffer m,  INDArray w,
                         DataBuffer iblock,
                         DataBuffer isplit,
                         IComplexNumber z, DataBuffer ldz,
                         INDArray work, DataBuffer iwork,
                         DataBuffer ifailv );

    DataBuffer sstemint( DataBuffer matriint, char jobz, char range,
                         DataBuffer n, INDArray d, INDArray e, float vl,
                         float vu, DataBuffer il, DataBuffer iu,
                         DataBuffer m, INDArray w, INDArray z,
                         DataBuffer ldz, DataBuffer nzc,
                         DataBuffer isuppz, DataBuffer tryrac,
                         INDArray work, DataBuffer lwork,
                         DataBuffer iwork, DataBuffer liwork );
    DataBuffer dstemint( DataBuffer matriint, char jobz, char range,
                         DataBuffer n, INDArray d, INDArray e, double vl,
                         double vu, DataBuffer il, DataBuffer iu,
                         DataBuffer m, INDArray w, INDArray z,
                         DataBuffer ldz, DataBuffer nzc,
                         DataBuffer isuppz, DataBuffer tryrac,
                         INDArray work, DataBuffer lwork,
                         DataBuffer iwork, DataBuffer liwork );
    DataBuffer cstemint( DataBuffer matriint, char jobz, char range,
                         DataBuffer n, INDArray d, INDArray e, float vl,
                         float vu, DataBuffer il, DataBuffer iu,
                         DataBuffer m, INDArray w,
                         IComplexNumber z, DataBuffer ldz,
                         DataBuffer nzc, DataBuffer isuppz,
                         DataBuffer tryrac, INDArray work,
                         DataBuffer lwork, DataBuffer iwork,
                         DataBuffer liwork );
    DataBuffer zstemint( DataBuffer matriint, char jobz, char range,
                         DataBuffer n, INDArray d, INDArray e, double vl,
                         double vu, DataBuffer il, DataBuffer iu,
                         DataBuffer m, INDArray w,
                         IComplexNumber z, DataBuffer ldz,
                         DataBuffer nzc, DataBuffer isuppz,
                         DataBuffer tryrac, INDArray work,
                         DataBuffer lwork, DataBuffer iwork,
                         DataBuffer liwork );

    DataBuffer ssteqint( DataBuffer matriint, char compz, DataBuffer n,
                         INDArray d, INDArray e, INDArray z, DataBuffer ldz,
                         INDArray work );
    DataBuffer dsteqint( DataBuffer matriint, char compz, DataBuffer n,
                         INDArray d, INDArray e, INDArray z, DataBuffer ldz,
                         INDArray work );
    DataBuffer csteqint( DataBuffer matriint, char compz, DataBuffer n,
                         INDArray d, INDArray e, IComplexNumber z,
                         DataBuffer ldz, INDArray work );
    DataBuffer zsteqint( DataBuffer matriint, char compz, DataBuffer n,
                         INDArray d, INDArray e, IComplexNumber z,
                         DataBuffer ldz, INDArray work );

    DataBuffer ssterint( DataBuffer n, INDArray d, INDArray e );
    DataBuffer dsterint( DataBuffer n, INDArray d, INDArray e );

    DataBuffer ssteint( DataBuffer matriint, char jobz, DataBuffer n,
                        INDArray d, INDArray e, INDArray z, DataBuffer ldz,
                        INDArray work );
    DataBuffer dsteint( DataBuffer matriint, char jobz, DataBuffer n,
                        INDArray d, INDArray e, INDArray z, DataBuffer ldz,
                        INDArray work );

    DataBuffer sstevint( DataBuffer matriint, char jobz, DataBuffer n,
                         INDArray d, INDArray e, INDArray z, DataBuffer ldz,
                         INDArray work, DataBuffer lwork,
                         DataBuffer iwork, DataBuffer liwork );
    DataBuffer dstevint( DataBuffer matriint, char jobz, DataBuffer n,
                         INDArray d, INDArray e, INDArray z, DataBuffer ldz,
                         INDArray work, DataBuffer lwork,
                         DataBuffer iwork, DataBuffer liwork );

    DataBuffer sstevint( DataBuffer matriint, char jobz, char range,
                         DataBuffer n, INDArray d, INDArray e, float vl,
                         float vu, DataBuffer il, DataBuffer iu,
                         float abstol, DataBuffer m, INDArray w, INDArray z,
                         DataBuffer ldz, DataBuffer isuppz, INDArray work,
                         DataBuffer lwork, DataBuffer iwork,
                         DataBuffer liwork );
    DataBuffer dstevint( DataBuffer matriint, char jobz, char range,
                         DataBuffer n, INDArray d, INDArray e, double vl,
                         double vu, DataBuffer il, DataBuffer iu,
                         double abstol, DataBuffer m, INDArray w,
                         INDArray z, DataBuffer ldz, DataBuffer isuppz,
                         INDArray work, DataBuffer lwork,
                         DataBuffer iwork, DataBuffer liwork );

    DataBuffer sstevint( DataBuffer matriint, char jobz, char range,
                         DataBuffer n, INDArray d, INDArray e, float vl,
                         float vu, DataBuffer il, DataBuffer iu,
                         float abstol, DataBuffer m, INDArray w, INDArray z,
                         DataBuffer ldz, INDArray work, DataBuffer iwork,
                         DataBuffer ifail );
    DataBuffer dstevint( DataBuffer matriint, char jobz, char range,
                         DataBuffer n, INDArray d, INDArray e, double vl,
                         double vu, DataBuffer il, DataBuffer iu,
                         double abstol, DataBuffer m, INDArray w,
                         INDArray z, DataBuffer ldz, INDArray work,
                         DataBuffer iwork, DataBuffer ifail );

    DataBuffer ssycoint( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray a, DataBuffer lda,
                         DataBuffer ipiv, float anorm,
                         INDArray rcond, INDArray work, DataBuffer iwork );
    DataBuffer dsycoint( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray a, DataBuffer lda,
                         DataBuffer ipiv, double anorm,
                         INDArray rcond, INDArray work,
                         DataBuffer iwork );
    DataBuffer csycoint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         DataBuffer ipiv, float anorm,
                         INDArray rcond, IComplexNumber work );
    DataBuffer zsycoint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         DataBuffer ipiv, double anorm,
                         INDArray rcond, IComplexNumber work );

    DataBuffer ssyequint( DataBuffer matriint, char uplo, DataBuffer n,
                          INDArray a, DataBuffer lda, INDArray s,
                          INDArray scond, INDArray amax, INDArray work );
    DataBuffer dsyequint( DataBuffer matriint, char uplo, DataBuffer n,
                          INDArray a, DataBuffer lda, INDArray s,
                          INDArray scond, INDArray amax, INDArray work );
    DataBuffer csyequint( DataBuffer matriint, char uplo, DataBuffer n,
                          IComplexNumber a, DataBuffer lda,
                          INDArray s, INDArray scond, INDArray amax,
                          IComplexNumber work );
    DataBuffer zsyequint( DataBuffer matriint, char uplo, DataBuffer n,
                          IComplexNumber a, DataBuffer lda,
                          INDArray s, INDArray scond, INDArray amax,
                          IComplexNumber work );

    DataBuffer ssyeint( DataBuffer matriint, char jobz, char uplo,
                        DataBuffer n, INDArray a, DataBuffer lda, INDArray w,
                        INDArray work, DataBuffer lwork );
    DataBuffer dsyeint( DataBuffer matriint, char jobz, char uplo,
                        DataBuffer n, INDArray a, DataBuffer lda,
                        INDArray w, INDArray work, DataBuffer lwork );

    DataBuffer ssyevint( DataBuffer matriint, char jobz, char uplo,
                         DataBuffer n, INDArray a, DataBuffer lda,
                         INDArray w, INDArray work, DataBuffer lwork,
                         DataBuffer iwork, DataBuffer liwork );
    DataBuffer dsyevint( DataBuffer matriint, char jobz, char uplo,
                         DataBuffer n, INDArray a, DataBuffer lda,
                         INDArray w, INDArray work, DataBuffer lwork,
                         DataBuffer iwork, DataBuffer liwork );

    DataBuffer ssyevint( DataBuffer matriint, char jobz, char range,
                         char uplo, DataBuffer n, INDArray a,
                         DataBuffer lda, float vl, float vu,
                         DataBuffer il, DataBuffer iu, float abstol,
                         DataBuffer m, INDArray w, INDArray z,
                         DataBuffer ldz, DataBuffer isuppz, INDArray work,
                         DataBuffer lwork, DataBuffer iwork,
                         DataBuffer liwork );
    DataBuffer dsyevint( DataBuffer matriint, char jobz, char range,
                         char uplo, DataBuffer n, INDArray a,
                         DataBuffer lda, double vl, double vu,
                         DataBuffer il, DataBuffer iu, double abstol,
                         DataBuffer m, INDArray w, INDArray z,
                         DataBuffer ldz, DataBuffer isuppz,
                         INDArray work, DataBuffer lwork,
                         DataBuffer iwork, DataBuffer liwork );

    DataBuffer ssyevint( DataBuffer matriint, char jobz, char range,
                         char uplo, DataBuffer n, INDArray a,
                         DataBuffer lda, float vl, float vu,
                         DataBuffer il, DataBuffer iu, float abstol,
                         DataBuffer m, INDArray w, INDArray z,
                         DataBuffer ldz, INDArray work, DataBuffer lwork,
                         DataBuffer iwork, DataBuffer ifail );
    DataBuffer dsyevint( DataBuffer matriint, char jobz, char range,
                         char uplo, DataBuffer n, INDArray a,
                         DataBuffer lda, double vl, double vu,
                         DataBuffer il, DataBuffer iu, double abstol,
                         DataBuffer m, INDArray w, INDArray z,
                         DataBuffer ldz, INDArray work, DataBuffer lwork,
                         DataBuffer iwork, DataBuffer ifail );

    DataBuffer ssygsint( DataBuffer matriint, DataBuffer itype, char uplo,
                         DataBuffer n, INDArray a, DataBuffer lda,
                         INDArray b, DataBuffer ldb );
    DataBuffer dsygsint( DataBuffer matriint, DataBuffer itype, char uplo,
                         DataBuffer n, INDArray a, DataBuffer lda,
                         INDArray b, DataBuffer ldb );

    DataBuffer ssygint( DataBuffer matriint, DataBuffer itype, char jobz,
                        char uplo, DataBuffer n, INDArray a,
                        DataBuffer lda, INDArray b, DataBuffer ldb,
                        INDArray w, INDArray work, DataBuffer lwork );
    DataBuffer dsygint( DataBuffer matriint, DataBuffer itype, char jobz,
                        char uplo, DataBuffer n, INDArray a,
                        DataBuffer lda, INDArray b, DataBuffer ldb,
                        INDArray w, INDArray work, DataBuffer lwork );

    DataBuffer ssygvint( DataBuffer matriint, DataBuffer itype, char jobz,
                         char uplo, DataBuffer n, INDArray a,
                         DataBuffer lda, INDArray b, DataBuffer ldb,
                         INDArray w, INDArray work, DataBuffer lwork,
                         DataBuffer iwork, DataBuffer liwork );
    DataBuffer dsygvint( DataBuffer matriint, DataBuffer itype, char jobz,
                         char uplo, DataBuffer n, INDArray a,
                         DataBuffer lda, INDArray b, DataBuffer ldb,
                         INDArray w, INDArray work, DataBuffer lwork,
                         DataBuffer iwork, DataBuffer liwork );

    DataBuffer ssygvint( DataBuffer matriint, DataBuffer itype, char jobz,
                         char range, char uplo, DataBuffer n, INDArray a,
                         DataBuffer lda, INDArray b, DataBuffer ldb,
                         float vl, float vu, DataBuffer il,
                         DataBuffer iu, float abstol, DataBuffer m,
                         INDArray w, INDArray z, DataBuffer ldz, INDArray work,
                         DataBuffer lwork, DataBuffer iwork,
                         DataBuffer ifail );
    DataBuffer dsygvint( DataBuffer matriint, DataBuffer itype, char jobz,
                         char range, char uplo, DataBuffer n, INDArray a,
                         DataBuffer lda, INDArray b, DataBuffer ldb,
                         double vl, double vu, DataBuffer il,
                         DataBuffer iu, double abstol, DataBuffer m,
                         INDArray w, INDArray z, DataBuffer ldz,
                         INDArray work, DataBuffer lwork,
                         DataBuffer iwork, DataBuffer ifail );

    DataBuffer ssyrfint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,  INDArray a, DataBuffer lda,
                         INDArray af, DataBuffer ldaf,
                         DataBuffer ipiv,  INDArray b,
                         DataBuffer ldb, INDArray x, DataBuffer ldx,
                         INDArray ferr, INDArray berr, INDArray work,
                         DataBuffer iwork );
    DataBuffer dsyrfint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,  INDArray a,
                         DataBuffer lda,  INDArray af,
                         DataBuffer ldaf,  DataBuffer ipiv,
                         INDArray b, DataBuffer ldb, INDArray x,
                         DataBuffer ldx, INDArray ferr, INDArray berr,
                         INDArray work, DataBuffer iwork );
    DataBuffer csyrfint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,  IComplexNumber a,
                         DataBuffer lda,  IComplexNumber af,
                         DataBuffer ldaf,  DataBuffer ipiv,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber x, DataBuffer ldx,
                         INDArray ferr, INDArray berr,
                         IComplexNumber work, INDArray rwork );
    DataBuffer zsyrfint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,  IComplexNumber a,
                         DataBuffer lda,  IComplexNumber af,
                         DataBuffer ldaf,  DataBuffer ipiv,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber x, DataBuffer ldx,
                         INDArray ferr, INDArray berr,
                         IComplexNumber work, INDArray rwork );

    DataBuffer ssyrfsint( DataBuffer matriint, char uplo, char equed,
                          DataBuffer n, DataBuffer nrhs,  INDArray a,
                          DataBuffer lda,  INDArray af,
                          DataBuffer ldaf,  DataBuffer ipiv,
                          INDArray s,  INDArray b, DataBuffer ldb,
                          INDArray x, DataBuffer ldx, INDArray rcond,
                          INDArray berr, DataBuffer int_bnds,
                          INDArray erint_norm, INDArray erint_comp,
                          DataBuffer nparams, INDArray params, INDArray work,
                          DataBuffer iwork );
    DataBuffer dsyrfsint( DataBuffer matriint, char uplo, char equed,
                          DataBuffer n, DataBuffer nrhs,  INDArray a,
                          DataBuffer lda,  INDArray af,
                          DataBuffer ldaf,  DataBuffer ipiv,
                          INDArray s,  INDArray b,
                          DataBuffer ldb, INDArray x, DataBuffer ldx,
                          INDArray rcond, INDArray berr,
                          DataBuffer int_bnds, INDArray erint_norm,
                          INDArray erint_comp, DataBuffer nparams,
                          INDArray params, INDArray work,
                          DataBuffer iwork );
    DataBuffer csyrfsint( DataBuffer matriint, char uplo, char equed,
                          DataBuffer n, DataBuffer nrhs,
                          IComplexNumber a, DataBuffer lda,
                          IComplexNumber af,
                          DataBuffer ldaf,  DataBuffer ipiv,
                          INDArray s,  IComplexNumber b,
                          DataBuffer ldb, IComplexNumber x,
                          DataBuffer ldx, INDArray rcond, INDArray berr,
                          DataBuffer int_bnds, INDArray erint_norm,
                          INDArray erint_comp, DataBuffer nparams,
                          INDArray params, IComplexNumber work,
                          INDArray rwork );
    DataBuffer zsyrfsint( DataBuffer matriint, char uplo, char equed,
                          DataBuffer n, DataBuffer nrhs,
                          IComplexNumber a, DataBuffer lda,
                          IComplexNumber af,
                          DataBuffer ldaf,  DataBuffer ipiv,
                          INDArray s,
                          IComplexNumber b, DataBuffer ldb,
                          IComplexNumber x, DataBuffer ldx,
                          INDArray rcond, INDArray berr,
                          DataBuffer int_bnds, INDArray erint_norm,
                          INDArray erint_comp, DataBuffer nparams,
                          INDArray params, IComplexNumber work,
                          INDArray rwork );

    DataBuffer ssysint( DataBuffer matriint, char uplo, DataBuffer n,
                        DataBuffer nrhs, INDArray a, DataBuffer lda,
                        DataBuffer ipiv, INDArray b, DataBuffer ldb,
                        INDArray work, DataBuffer lwork );
    DataBuffer dsysint( DataBuffer matriint, char uplo, DataBuffer n,
                        DataBuffer nrhs, INDArray a, DataBuffer lda,
                        DataBuffer ipiv, INDArray b, DataBuffer ldb,
                        INDArray work, DataBuffer lwork );
    DataBuffer csysint( DataBuffer matriint, char uplo, DataBuffer n,
                        DataBuffer nrhs, IComplexNumber a,
                        DataBuffer lda, DataBuffer ipiv,
                        IComplexNumber b, DataBuffer ldb,
                        IComplexNumber work, DataBuffer lwork );
    DataBuffer zsysint( DataBuffer matriint, char uplo, DataBuffer n,
                        DataBuffer nrhs, IComplexNumber a,
                        DataBuffer lda, DataBuffer ipiv,
                        IComplexNumber b, DataBuffer ldb,
                        IComplexNumber work, DataBuffer lwork );

    DataBuffer ssysvint( DataBuffer matriint, char fact, char uplo,
                         DataBuffer n, DataBuffer nrhs,  INDArray a,
                         DataBuffer lda, INDArray af, DataBuffer ldaf,
                         DataBuffer ipiv,  INDArray b,
                         DataBuffer ldb, INDArray x, DataBuffer ldx,
                         INDArray rcond, INDArray ferr, INDArray berr,
                         INDArray work, DataBuffer lwork,
                         DataBuffer iwork );
    DataBuffer dsysvint( DataBuffer matriint, char fact, char uplo,
                         DataBuffer n, DataBuffer nrhs,  INDArray a,
                         DataBuffer lda, INDArray af, DataBuffer ldaf,
                         DataBuffer ipiv,  INDArray b,
                         DataBuffer ldb, INDArray x, DataBuffer ldx,
                         INDArray rcond, INDArray ferr, INDArray berr,
                         INDArray work, DataBuffer lwork,
                         DataBuffer iwork );
    DataBuffer csysvint( DataBuffer matriint, char fact, char uplo,
                         DataBuffer n, DataBuffer nrhs,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber af, DataBuffer ldaf,
                         DataBuffer ipiv,  IComplexNumber b,
                         DataBuffer ldb, IComplexNumber x,
                         DataBuffer ldx, INDArray rcond, INDArray ferr,
                         INDArray berr, IComplexNumber work,
                         DataBuffer lwork, INDArray rwork );
    DataBuffer zsysvint( DataBuffer matriint, char fact, char uplo,
                         DataBuffer n, DataBuffer nrhs,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber af, DataBuffer ldaf,
                         DataBuffer ipiv,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber x, DataBuffer ldx,
                         INDArray rcond, INDArray ferr, INDArray berr,
                         IComplexNumber work, DataBuffer lwork,
                         INDArray rwork );

    DataBuffer ssysvxint( DataBuffer matriint, char fact, char uplo,
                          DataBuffer n, DataBuffer nrhs, INDArray a,
                          DataBuffer lda, INDArray af, DataBuffer ldaf,
                          DataBuffer ipiv, String equed, INDArray s,
                          INDArray b, DataBuffer ldb, INDArray x,
                          DataBuffer ldx, INDArray rcond, INDArray rpvgrw,
                          INDArray berr, DataBuffer int_bnds,
                          INDArray erint_norm, INDArray erint_comp,
                          DataBuffer nparams, INDArray params, INDArray work,
                          DataBuffer iwork );
    DataBuffer dsysvxint( DataBuffer matriint, char fact, char uplo,
                          DataBuffer n, DataBuffer nrhs, INDArray a,
                          DataBuffer lda, INDArray af, DataBuffer ldaf,
                          DataBuffer ipiv, String equed, INDArray s,
                          INDArray b, DataBuffer ldb, INDArray x,
                          DataBuffer ldx, INDArray rcond, INDArray rpvgrw,
                          INDArray berr, DataBuffer int_bnds,
                          INDArray erint_norm, INDArray erint_comp,
                          DataBuffer nparams, INDArray params,
                          INDArray work, DataBuffer iwork );
    DataBuffer csysvxint( DataBuffer matriint, char fact, char uplo,
                          DataBuffer n, DataBuffer nrhs,
                          IComplexNumber a, DataBuffer lda,
                          IComplexNumber af, DataBuffer ldaf,
                          DataBuffer ipiv, String equed, INDArray s,
                          IComplexNumber b, DataBuffer ldb,
                          IComplexNumber x, DataBuffer ldx,
                          INDArray rcond, INDArray rpvgrw, INDArray berr,
                          DataBuffer int_bnds, INDArray erint_norm,
                          INDArray erint_comp, DataBuffer nparams,
                          INDArray params, IComplexNumber work,
                          INDArray rwork );
    DataBuffer zsysvxint( DataBuffer matriint, char fact, char uplo,
                          DataBuffer n, DataBuffer nrhs,
                          IComplexNumber a, DataBuffer lda,
                          IComplexNumber af, DataBuffer ldaf,
                          DataBuffer ipiv, String equed, INDArray s,
                          IComplexNumber b, DataBuffer ldb,
                          IComplexNumber x, DataBuffer ldx,
                          INDArray rcond, INDArray rpvgrw, INDArray berr,
                          DataBuffer int_bnds, INDArray erint_norm,
                          INDArray erint_comp, DataBuffer nparams,
                          INDArray params, IComplexNumber work,
                          INDArray rwork );

    DataBuffer ssytrint( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray a, DataBuffer lda, INDArray d, INDArray e,
                         INDArray tau, INDArray work, DataBuffer lwork );
    DataBuffer dsytrint( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray a, DataBuffer lda, INDArray d, INDArray e,
                         INDArray tau, INDArray work, DataBuffer lwork );

    DataBuffer ssytrint( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray a, DataBuffer lda, DataBuffer ipiv,
                         INDArray work, DataBuffer lwork );
    DataBuffer dsytrint( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray a, DataBuffer lda, DataBuffer ipiv,
                         INDArray work, DataBuffer lwork );
    DataBuffer csytrint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         DataBuffer ipiv, IComplexNumber work,
                         DataBuffer lwork );
    DataBuffer zsytrint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         DataBuffer ipiv, IComplexNumber work,
                         DataBuffer lwork );

    DataBuffer ssytrint( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray a, DataBuffer lda,
                         DataBuffer ipiv, INDArray work );
    DataBuffer dsytrint( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray a, DataBuffer lda,
                         DataBuffer ipiv, INDArray work );
    DataBuffer csytrint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         DataBuffer ipiv,
                         IComplexNumber work );
    DataBuffer zsytrint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         DataBuffer ipiv,
                         IComplexNumber work );



    DataBuffer stbcoint( DataBuffer matriint, char norm, char uplo,
                         char diag, DataBuffer n, DataBuffer kd,
                         INDArray ab, DataBuffer ldab, INDArray rcond,
                         INDArray work, DataBuffer iwork );
    DataBuffer dtbcoint( DataBuffer matriint, char norm, char uplo,
                         char diag, DataBuffer n, DataBuffer kd,
                         INDArray ab, DataBuffer ldab,
                         INDArray rcond, INDArray work,
                         DataBuffer iwork );
    DataBuffer ctbcoint( DataBuffer matriint, char norm, char uplo,
                         char diag, DataBuffer n, DataBuffer kd,
                         IComplexNumber ab, DataBuffer ldab,
                         INDArray rcond, IComplexNumber work,
                         INDArray rwork );
    DataBuffer ztbcoint( DataBuffer matriint, char norm, char uplo,
                         char diag, DataBuffer n, DataBuffer kd,
                         IComplexNumber ab,
                         DataBuffer ldab, INDArray rcond,
                         IComplexNumber work, INDArray rwork );

    DataBuffer stbrfint( DataBuffer matriint, char uplo, char trans,
                         char diag, DataBuffer n, DataBuffer kd,
                         DataBuffer nrhs,  INDArray ab,
                         DataBuffer ldab,  INDArray b, DataBuffer ldb,
                         INDArray x, DataBuffer ldx, INDArray ferr,
                         INDArray berr, INDArray work, DataBuffer iwork );
    DataBuffer dtbrfint( DataBuffer matriint, char uplo, char trans,
                         char diag, DataBuffer n, DataBuffer kd,
                         DataBuffer nrhs,  INDArray ab,
                         DataBuffer ldab,  INDArray b,
                         DataBuffer ldb,  INDArray x, DataBuffer ldx,
                         INDArray ferr, INDArray berr, INDArray work,
                         DataBuffer iwork );
    DataBuffer ctbrfint( DataBuffer matriint, char uplo, char trans,
                         char diag, DataBuffer n, DataBuffer kd,
                         DataBuffer nrhs,  IComplexNumber ab,
                         DataBuffer ldab,  IComplexNumber b,
                         DataBuffer ldb,  IComplexNumber x,
                         DataBuffer ldx, INDArray ferr, INDArray berr,
                         IComplexNumber work, INDArray rwork );
    DataBuffer ztbrfint( DataBuffer matriint, char uplo, char trans,
                         char diag, DataBuffer n, DataBuffer kd,
                         DataBuffer nrhs,
                         IComplexNumber ab,
                         DataBuffer ldab,  IComplexNumber b,
                         DataBuffer ldb,  IComplexNumber x,
                         DataBuffer ldx, INDArray ferr, INDArray berr,
                         IComplexNumber work, INDArray rwork );

    DataBuffer stbtrint( DataBuffer matriint, char uplo, char trans,
                         char diag, DataBuffer n, DataBuffer kd,
                         DataBuffer nrhs,  INDArray ab,
                         DataBuffer ldab, INDArray b, DataBuffer ldb );
    DataBuffer dtbtrint( DataBuffer matriint, char uplo, char trans,
                         char diag, DataBuffer n, DataBuffer kd,
                         DataBuffer nrhs,  INDArray ab,
                         DataBuffer ldab, INDArray b, DataBuffer ldb );
    DataBuffer ctbtrint( DataBuffer matriint, char uplo, char trans,
                         char diag, DataBuffer n, DataBuffer kd,
                         DataBuffer nrhs,  IComplexNumber ab,
                         DataBuffer ldab, IComplexNumber b,
                         DataBuffer ldb );
    DataBuffer ztbtrint( DataBuffer matriint, char uplo, char trans,
                         char diag, DataBuffer n, DataBuffer kd,
                         DataBuffer nrhs,
                         IComplexNumber ab,
                         DataBuffer ldab, IComplexNumber b,
                         DataBuffer ldb );

    DataBuffer stfsint( DataBuffer matriint, char transr, char side,
                        char uplo, char trans, char diag, DataBuffer m,
                        DataBuffer n, float alpha,  INDArray a,
                        INDArray b, DataBuffer ldb );
    DataBuffer dtfsint( DataBuffer matriint, char transr, char side,
                        char uplo, char trans, char diag, DataBuffer m,
                        DataBuffer n, double alpha,  INDArray a,
                        INDArray b, DataBuffer ldb );
    DataBuffer ctfsint( DataBuffer matriint, char transr, char side,
                        char uplo, char trans, char diag, DataBuffer m,
                        DataBuffer n, IComplexNumber alpha,
                        IComplexNumber a,
                        IComplexNumber b, DataBuffer ldb );
    DataBuffer ztfsint( DataBuffer matriint, char transr, char side,
                        char uplo, char trans, char diag, DataBuffer m,
                        DataBuffer n, IComplexNumber alpha,
                        IComplexNumber a,
                        IComplexNumber b, DataBuffer ldb );

    DataBuffer stftrint( DataBuffer matriint, char transr, char uplo,
                         char diag, DataBuffer n, INDArray a );
    DataBuffer dtftrint( DataBuffer matriint, char transr, char uplo,
                         char diag, DataBuffer n, INDArray a );
    DataBuffer ctftrint( DataBuffer matriint, char transr, char uplo,
                         char diag, DataBuffer n,
                         IComplexNumber a );
    DataBuffer ztftrint( DataBuffer matriint, char transr, char uplo,
                         char diag, DataBuffer n,
                         IComplexNumber a );

    DataBuffer stfttint( DataBuffer matriint, char transr, char uplo,
                         DataBuffer n,  INDArray arf, INDArray ap );
    DataBuffer dtfttint( DataBuffer matriint, char transr, char uplo,
                         DataBuffer n,  INDArray arf, INDArray ap );
    DataBuffer ctfttint( DataBuffer matriint, char transr, char uplo,
                         DataBuffer n,  IComplexNumber arf,
                         IComplexNumber ap );
    DataBuffer ztfttint( DataBuffer matriint, char transr, char uplo,
                         DataBuffer n,  IComplexNumber arf,
                         IComplexNumber ap );

    DataBuffer stfttint( DataBuffer matriint, char transr, char uplo,
                         DataBuffer n,  INDArray arf, INDArray a,
                         DataBuffer lda );
    DataBuffer dtfttint( DataBuffer matriint, char transr, char uplo,
                         DataBuffer n,  INDArray arf, INDArray a,
                         DataBuffer lda );
    DataBuffer ctfttint( DataBuffer matriint, char transr, char uplo,
                         DataBuffer n,  IComplexNumber arf,
                         IComplexNumber a, DataBuffer lda );
    DataBuffer ztfttint( DataBuffer matriint, char transr, char uplo,
                         DataBuffer n,  IComplexNumber arf,
                         IComplexNumber a, DataBuffer lda );

    DataBuffer stgevint( DataBuffer matriint, char side, char howmny,
                         DataBuffer select, DataBuffer n,
                         INDArray s, DataBuffer lds,  INDArray p,
                         DataBuffer ldp, INDArray vl, DataBuffer ldvl,
                         INDArray vr, DataBuffer ldvr, DataBuffer mm,
                         DataBuffer m, INDArray work );
    DataBuffer dtgevint( DataBuffer matriint, char side, char howmny,
                         DataBuffer select, DataBuffer n,
                         INDArray s, DataBuffer lds,
                         INDArray p, DataBuffer ldp, INDArray vl,
                         DataBuffer ldvl, INDArray vr, DataBuffer ldvr,
                         DataBuffer mm, DataBuffer m, INDArray work );
    DataBuffer ctgevint( DataBuffer matriint, char side, char howmny,
                         DataBuffer select, DataBuffer n,
                         IComplexNumber s, DataBuffer lds,
                         IComplexNumber p, DataBuffer ldp,
                         IComplexNumber vl, DataBuffer ldvl,
                         IComplexNumber vr, DataBuffer ldvr,
                         DataBuffer mm, DataBuffer m,
                         IComplexNumber work, INDArray rwork );
    DataBuffer ztgevint( DataBuffer matriint, char side, char howmny,
                         DataBuffer select, DataBuffer n,
                         IComplexNumber s, DataBuffer lds,
                         IComplexNumber p, DataBuffer ldp,
                         IComplexNumber vl, DataBuffer ldvl,
                         IComplexNumber vr, DataBuffer ldvr,
                         DataBuffer mm, DataBuffer m,
                         IComplexNumber work, INDArray rwork );

    DataBuffer stgexint( DataBuffer matriint, int wantq,
                         int wantz, DataBuffer n, INDArray a,
                         DataBuffer lda, INDArray b, DataBuffer ldb,
                         INDArray q, DataBuffer ldq, INDArray z,
                         DataBuffer ldz, DataBuffer ifst,
                         DataBuffer ilst, INDArray work,
                         DataBuffer lwork );
    DataBuffer dtgexint( DataBuffer matriint, int wantq,
                         int wantz, DataBuffer n, INDArray a,
                         DataBuffer lda, INDArray b, DataBuffer ldb,
                         INDArray q, DataBuffer ldq, INDArray z,
                         DataBuffer ldz, DataBuffer ifst,
                         DataBuffer ilst, INDArray work,
                         DataBuffer lwork );
    DataBuffer ctgexint( DataBuffer matriint, int wantq,
                         int wantz, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber q, DataBuffer ldq,
                         IComplexNumber z, DataBuffer ldz,
                         DataBuffer ifst, DataBuffer ilst );
    DataBuffer ztgexint( DataBuffer matriint, int wantq,
                         int wantz, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber q, DataBuffer ldq,
                         IComplexNumber z, DataBuffer ldz,
                         DataBuffer ifst, DataBuffer ilst );

    DataBuffer stgseint( DataBuffer matriint, DataBuffer ijob,
                         int wantq, int wantz,
                         DataBuffer select, DataBuffer n,
                         INDArray a, DataBuffer lda, INDArray b,
                         DataBuffer ldb, INDArray alphar, INDArray alphai,
                         INDArray beta, INDArray q, DataBuffer ldq, INDArray z,
                         DataBuffer ldz, DataBuffer m, INDArray pl,
                         INDArray pr, INDArray dif, INDArray work,
                         DataBuffer lwork, DataBuffer iwork,
                         DataBuffer liwork );
    DataBuffer dtgseint( DataBuffer matriint, DataBuffer ijob,
                         int wantq, int wantz,
                         DataBuffer select, DataBuffer n,
                         INDArray a, DataBuffer lda, INDArray b,
                         DataBuffer ldb, INDArray alphar, INDArray alphai,
                         INDArray beta, INDArray q, DataBuffer ldq,
                         INDArray z, DataBuffer ldz, DataBuffer m,
                         INDArray pl, INDArray pr, INDArray dif,
                         INDArray work, DataBuffer lwork,
                         DataBuffer iwork, DataBuffer liwork );
    DataBuffer ctgseint( DataBuffer matriint, DataBuffer ijob,
                         int wantq, int wantz,
                         DataBuffer select, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber alpha,
                         IComplexNumber beta,
                         IComplexNumber q, DataBuffer ldq,
                         IComplexNumber z, DataBuffer ldz,
                         DataBuffer m, INDArray pl, INDArray pr, INDArray dif,
                         IComplexNumber work, DataBuffer lwork,
                         DataBuffer iwork, DataBuffer liwork );
    DataBuffer ztgseint( DataBuffer matriint, DataBuffer ijob,
                         int wantq, int wantz,
                         DataBuffer select, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber alpha,
                         IComplexNumber beta,
                         IComplexNumber q, DataBuffer ldq,
                         IComplexNumber z, DataBuffer ldz,
                         DataBuffer m, INDArray pl, INDArray pr,
                         INDArray dif, IComplexNumber work,
                         DataBuffer lwork, DataBuffer iwork,
                         DataBuffer liwork );

    DataBuffer stgsjint( DataBuffer matriint, char jobu, char jobv,
                         char jobq, DataBuffer m, DataBuffer p,
                         DataBuffer n, DataBuffer k, DataBuffer l,
                         INDArray a, DataBuffer lda, INDArray b,
                         DataBuffer ldb, float tola, float tolb,
                         INDArray alpha, INDArray beta, INDArray u,
                         DataBuffer ldu, INDArray v, DataBuffer ldv,
                         INDArray q, DataBuffer ldq, INDArray work,
                         DataBuffer ncycle );
    DataBuffer dtgsjint( DataBuffer matriint, char jobu, char jobv,
                         char jobq, DataBuffer m, DataBuffer p,
                         DataBuffer n, DataBuffer k, DataBuffer l,
                         INDArray a, DataBuffer lda, INDArray b,
                         DataBuffer ldb, double tola, double tolb,
                         INDArray alpha, INDArray beta, INDArray u,
                         DataBuffer ldu, INDArray v, DataBuffer ldv,
                         INDArray q, DataBuffer ldq, INDArray work,
                         DataBuffer ncycle );
    DataBuffer ctgsjint( DataBuffer matriint, char jobu, char jobv,
                         char jobq, DataBuffer m, DataBuffer p,
                         DataBuffer n, DataBuffer k, DataBuffer l,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber b, DataBuffer ldb,
                         float tola, float tolb, INDArray alpha,
                         INDArray beta, IComplexNumber u,
                         DataBuffer ldu, IComplexNumber v,
                         DataBuffer ldv, IComplexNumber q,
                         DataBuffer ldq, IComplexNumber work,
                         DataBuffer ncycle );
    DataBuffer ztgsjint( DataBuffer matriint, char jobu, char jobv,
                         char jobq, DataBuffer m, DataBuffer p,
                         DataBuffer n, DataBuffer k, DataBuffer l,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber b, DataBuffer ldb,
                         double tola, double tolb, INDArray alpha,
                         INDArray beta, IComplexNumber u,
                         DataBuffer ldu, IComplexNumber v,
                         DataBuffer ldv, IComplexNumber q,
                         DataBuffer ldq, IComplexNumber work,
                         DataBuffer ncycle );

    DataBuffer stgsnint( DataBuffer matriint, char job, char howmny,
                         DataBuffer select, DataBuffer n,
                         INDArray a, DataBuffer lda,  INDArray b,
                         DataBuffer ldb,  INDArray vl,
                         DataBuffer ldvl,  INDArray vr,
                         DataBuffer ldvr, INDArray s, INDArray dif,
                         DataBuffer mm, DataBuffer m, INDArray work,
                         DataBuffer lwork, DataBuffer iwork );
    DataBuffer dtgsnint( DataBuffer matriint, char job, char howmny,
                         DataBuffer select, DataBuffer n,
                         INDArray a, DataBuffer lda,
                         INDArray b, DataBuffer ldb,
                         INDArray vl, DataBuffer ldvl,
                         INDArray vr, DataBuffer ldvr, INDArray s,
                         INDArray dif, DataBuffer mm, DataBuffer m,
                         INDArray work, DataBuffer lwork,
                         DataBuffer iwork );
    DataBuffer ctgsnint( DataBuffer matriint, char job, char howmny,
                         DataBuffer select, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber vl, DataBuffer ldvl,
                         IComplexNumber vr, DataBuffer ldvr,
                         INDArray s, INDArray dif, DataBuffer mm,
                         DataBuffer m, IComplexNumber work,
                         DataBuffer lwork, DataBuffer iwork );
    DataBuffer ztgsnint( DataBuffer matriint, char job, char howmny,
                         DataBuffer select, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber vl,
                         DataBuffer ldvl,
                         IComplexNumber vr,
                         DataBuffer ldvr, INDArray s, INDArray dif,
                         DataBuffer mm, DataBuffer m,
                         IComplexNumber work, DataBuffer lwork,
                         DataBuffer iwork );

    DataBuffer stgsyint( DataBuffer matriint, char trans, DataBuffer ijob,
                         DataBuffer m, DataBuffer n,  INDArray a,
                         DataBuffer lda,  INDArray b, DataBuffer ldb,
                         INDArray c, DataBuffer ldc,  INDArray d,
                         DataBuffer ldd,  INDArray e, DataBuffer lde,
                         INDArray f, DataBuffer ldf, INDArray scale,
                         INDArray dif, INDArray work, DataBuffer lwork,
                         DataBuffer iwork );
    DataBuffer dtgsyint( DataBuffer matriint, char trans, DataBuffer ijob,
                         DataBuffer m, DataBuffer n,  INDArray a,
                         DataBuffer lda,  INDArray b, DataBuffer ldb,
                         INDArray c, DataBuffer ldc,  INDArray d,
                         DataBuffer ldd,  INDArray e, DataBuffer lde,
                         INDArray f, DataBuffer ldf, INDArray scale,
                         INDArray dif, INDArray work, DataBuffer lwork,
                         DataBuffer iwork );
    DataBuffer ctgsyint( DataBuffer matriint, char trans, DataBuffer ijob,
                         DataBuffer m, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber c, DataBuffer ldc,
                         IComplexNumber d, DataBuffer ldd,
                         IComplexNumber e, DataBuffer lde,
                         IComplexNumber f, DataBuffer ldf,
                         INDArray scale, INDArray dif,
                         IComplexNumber work, DataBuffer lwork,
                         DataBuffer iwork );
    DataBuffer ztgsyint( DataBuffer matriint, char trans, DataBuffer ijob,
                         DataBuffer m, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber c, DataBuffer ldc,
                         IComplexNumber d, DataBuffer ldd,
                         IComplexNumber e, DataBuffer lde,
                         IComplexNumber f, DataBuffer ldf,
                         INDArray scale, INDArray dif,
                         IComplexNumber work, DataBuffer lwork,
                         DataBuffer iwork );

    DataBuffer stpcoint( DataBuffer matriint, char norm, char uplo,
                         char diag, DataBuffer n,  INDArray ap,
                         INDArray rcond, INDArray work, DataBuffer iwork );
    DataBuffer dtpcoint( DataBuffer matriint, char norm, char uplo,
                         char diag, DataBuffer n,  INDArray ap,
                         INDArray rcond, INDArray work,
                         DataBuffer iwork );
    DataBuffer ctpcoint( DataBuffer matriint, char norm, char uplo,
                         char diag, DataBuffer n,
                         IComplexNumber ap, INDArray rcond,
                         IComplexNumber work, INDArray rwork );
    DataBuffer ztpcoint( DataBuffer matriint, char norm, char uplo,
                         char diag, DataBuffer n,
                         IComplexNumber ap, INDArray rcond,
                         IComplexNumber work, INDArray rwork );

    DataBuffer stprfint( DataBuffer matriint, char uplo, char trans,
                         char diag, DataBuffer n, DataBuffer nrhs,
                         INDArray ap,  INDArray b, DataBuffer ldb,
                         INDArray x, DataBuffer ldx, INDArray ferr,
                         INDArray berr, INDArray work, DataBuffer iwork );
    DataBuffer dtprfint( DataBuffer matriint, char uplo, char trans,
                         char diag, DataBuffer n, DataBuffer nrhs,
                         INDArray ap,  INDArray b,
                         DataBuffer ldb,  INDArray x, DataBuffer ldx,
                         INDArray ferr, INDArray berr, INDArray work,
                         DataBuffer iwork );
    DataBuffer ctprfint( DataBuffer matriint, char uplo, char trans,
                         char diag, DataBuffer n, DataBuffer nrhs,
                         IComplexNumber ap,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber x, DataBuffer ldx,
                         INDArray ferr, INDArray berr,
                         IComplexNumber work, INDArray rwork );
    DataBuffer ztprfint( DataBuffer matriint, char uplo, char trans,
                         char diag, DataBuffer n, DataBuffer nrhs,
                         IComplexNumber ap,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber x, DataBuffer ldx,
                         INDArray ferr, INDArray berr,
                         IComplexNumber work, INDArray rwork );

    DataBuffer stptrint( DataBuffer matriint, char uplo, char diag,
                         DataBuffer n, INDArray ap );
    DataBuffer dtptrint( DataBuffer matriint, char uplo, char diag,
                         DataBuffer n, INDArray ap );
    DataBuffer ctptrint( DataBuffer matriint, char uplo, char diag,
                         DataBuffer n, IComplexNumber ap );
    DataBuffer ztptrint( DataBuffer matriint, char uplo, char diag,
                         DataBuffer n, IComplexNumber ap );

    DataBuffer stptrint( DataBuffer matriint, char uplo, char trans,
                         char diag, DataBuffer n, DataBuffer nrhs,
                         INDArray ap, INDArray b, DataBuffer ldb );
    DataBuffer dtptrint( DataBuffer matriint, char uplo, char trans,
                         char diag, DataBuffer n, DataBuffer nrhs,
                         INDArray ap, INDArray b, DataBuffer ldb );
    DataBuffer ctptrint( DataBuffer matriint, char uplo, char trans,
                         char diag, DataBuffer n, DataBuffer nrhs,
                         IComplexNumber ap,
                         IComplexNumber b, DataBuffer ldb );
    DataBuffer ztptrint( DataBuffer matriint, char uplo, char trans,
                         char diag, DataBuffer n, DataBuffer nrhs,
                         IComplexNumber ap,
                         IComplexNumber b, DataBuffer ldb );

    DataBuffer stpttint( DataBuffer matriint, char transr, char uplo,
                         DataBuffer n,  INDArray ap, INDArray arf );
    DataBuffer dtpttint( DataBuffer matriint, char transr, char uplo,
                         DataBuffer n,  INDArray ap, INDArray arf );
    DataBuffer ctpttint( DataBuffer matriint, char transr, char uplo,
                         DataBuffer n,  IComplexNumber ap,
                         IComplexNumber arf );
    DataBuffer ztpttint( DataBuffer matriint, char transr, char uplo,
                         DataBuffer n,  IComplexNumber ap,
                         IComplexNumber arf );

    DataBuffer stpttint( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray ap, INDArray a, DataBuffer lda );
    DataBuffer dtpttint( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray ap, INDArray a, DataBuffer lda );
    DataBuffer ctpttint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber ap,
                         IComplexNumber a, DataBuffer lda );
    DataBuffer ztpttint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber ap,
                         IComplexNumber a, DataBuffer lda );

    DataBuffer strcoint( DataBuffer matriint, char norm, char uplo,
                         char diag, DataBuffer n,  INDArray a,
                         DataBuffer lda, INDArray rcond, INDArray work,
                         DataBuffer iwork );
    DataBuffer dtrcoint( DataBuffer matriint, char norm, char uplo,
                         char diag, DataBuffer n,  INDArray a,
                         DataBuffer lda, INDArray rcond, INDArray work,
                         DataBuffer iwork );
    DataBuffer ctrcoint( DataBuffer matriint, char norm, char uplo,
                         char diag, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         INDArray rcond, IComplexNumber work,
                         INDArray rwork );
    DataBuffer ztrcoint( DataBuffer matriint, char norm, char uplo,
                         char diag, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         INDArray rcond, IComplexNumber work,
                         INDArray rwork );

    DataBuffer strevint( DataBuffer matriint, char side, char howmny,
                         DataBuffer select, DataBuffer n,
                         INDArray t, DataBuffer ldt, INDArray vl,
                         DataBuffer ldvl, INDArray vr, DataBuffer ldvr,
                         DataBuffer mm, DataBuffer m, INDArray work );
    DataBuffer dtrevint( DataBuffer matriint, char side, char howmny,
                         DataBuffer select, DataBuffer n,
                         INDArray t, DataBuffer ldt, INDArray vl,
                         DataBuffer ldvl, INDArray vr, DataBuffer ldvr,
                         DataBuffer mm, DataBuffer m, INDArray work );
    DataBuffer ctrevint( DataBuffer matriint, char side, char howmny,
                         DataBuffer select, DataBuffer n,
                         IComplexNumber t, DataBuffer ldt,
                         IComplexNumber vl, DataBuffer ldvl,
                         IComplexNumber vr, DataBuffer ldvr,
                         DataBuffer mm, DataBuffer m,
                         IComplexNumber work, INDArray rwork );
    DataBuffer ztrevint( DataBuffer matriint, char side, char howmny,
                         DataBuffer select, DataBuffer n,
                         IComplexNumber t, DataBuffer ldt,
                         IComplexNumber vl, DataBuffer ldvl,
                         IComplexNumber vr, DataBuffer ldvr,
                         DataBuffer mm, DataBuffer m,
                         IComplexNumber work, INDArray rwork );

    DataBuffer strexint( DataBuffer matriint, char compq, DataBuffer n,
                         INDArray t, DataBuffer ldt, INDArray q,
                         DataBuffer ldq, DataBuffer ifst,
                         DataBuffer ilst, INDArray work );
    DataBuffer dtrexint( DataBuffer matriint, char compq, DataBuffer n,
                         INDArray t, DataBuffer ldt, INDArray q,
                         DataBuffer ldq, DataBuffer ifst,
                         DataBuffer ilst, INDArray work );
    DataBuffer ctrexint( DataBuffer matriint, char compq, DataBuffer n,
                         IComplexNumber t, DataBuffer ldt,
                         IComplexNumber q, DataBuffer ldq,
                         DataBuffer ifst, DataBuffer ilst );
    DataBuffer ztrexint( DataBuffer matriint, char compq, DataBuffer n,
                         IComplexNumber t, DataBuffer ldt,
                         IComplexNumber q, DataBuffer ldq,
                         DataBuffer ifst, DataBuffer ilst );

    DataBuffer strrfint( DataBuffer matriint, char uplo, char trans,
                         char diag, DataBuffer n, DataBuffer nrhs,
                         INDArray a, DataBuffer lda,  INDArray b,
                         DataBuffer ldb,  INDArray x, DataBuffer ldx,
                         INDArray ferr, INDArray berr, INDArray work,
                         DataBuffer iwork );
    DataBuffer dtrrfint( DataBuffer matriint, char uplo, char trans,
                         char diag, DataBuffer n, DataBuffer nrhs,
                         INDArray a, DataBuffer lda,
                         INDArray b, DataBuffer ldb,
                         INDArray x, DataBuffer ldx, INDArray ferr,
                         INDArray berr, INDArray work, DataBuffer iwork );
    DataBuffer ctrrfint( DataBuffer matriint, char uplo, char trans,
                         char diag, DataBuffer n, DataBuffer nrhs,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber x, DataBuffer ldx,
                         INDArray ferr, INDArray berr,
                         IComplexNumber work, INDArray rwork );
    DataBuffer ztrrfint( DataBuffer matriint, char uplo, char trans,
                         char diag, DataBuffer n, DataBuffer nrhs,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber x, DataBuffer ldx,
                         INDArray ferr, INDArray berr,
                         IComplexNumber work, INDArray rwork );

    DataBuffer strseint( DataBuffer matriint, char job, char compq,
                         DataBuffer select, DataBuffer n,
                         INDArray t, DataBuffer ldt, INDArray q,
                         DataBuffer ldq, INDArray wr, INDArray wi,
                         DataBuffer m, INDArray s, INDArray sep,
                         INDArray work, DataBuffer lwork,
                         DataBuffer iwork, DataBuffer liwork );
    DataBuffer dtrseint( DataBuffer matriint, char job, char compq,
                         DataBuffer select, DataBuffer n,
                         INDArray t, DataBuffer ldt, INDArray q,
                         DataBuffer ldq, INDArray wr, INDArray wi,
                         DataBuffer m, INDArray s, INDArray sep,
                         INDArray work, DataBuffer lwork,
                         DataBuffer iwork, DataBuffer liwork );
    DataBuffer ctrseint( DataBuffer matriint, char job, char compq,
                         DataBuffer select, DataBuffer n,
                         IComplexNumber t, DataBuffer ldt,
                         IComplexNumber q, DataBuffer ldq,
                         IComplexNumber w, DataBuffer m,
                         INDArray s, INDArray sep,
                         IComplexNumber work, DataBuffer lwork );
    DataBuffer ztrseint( DataBuffer matriint, char job, char compq,
                         DataBuffer select, DataBuffer n,
                         IComplexNumber t, DataBuffer ldt,
                         IComplexNumber q, DataBuffer ldq,
                         IComplexNumber w, DataBuffer m,
                         INDArray s, INDArray sep,
                         IComplexNumber work, DataBuffer lwork );

    DataBuffer strsnint( DataBuffer matriint, char job, char howmny,
                         DataBuffer select, DataBuffer n,
                         INDArray t, DataBuffer ldt,  INDArray vl,
                         DataBuffer ldvl,  INDArray vr,
                         DataBuffer ldvr, INDArray s, INDArray sep,
                         DataBuffer mm, DataBuffer m, INDArray work,
                         DataBuffer ldwork, DataBuffer iwork );
    DataBuffer dtrsnint( DataBuffer matriint, char job, char howmny,
                         DataBuffer select, DataBuffer n,
                         INDArray t, DataBuffer ldt,
                         INDArray vl, DataBuffer ldvl,
                         INDArray vr, DataBuffer ldvr, INDArray s,
                         INDArray sep, DataBuffer mm, DataBuffer m,
                         INDArray work, DataBuffer ldwork,
                         DataBuffer iwork );
    DataBuffer ctrsnint( DataBuffer matriint, char job, char howmny,
                         DataBuffer select, DataBuffer n,
                         IComplexNumber t, DataBuffer ldt,
                         IComplexNumber vl, DataBuffer ldvl,
                         IComplexNumber vr, DataBuffer ldvr,
                         INDArray s, INDArray sep, DataBuffer mm,
                         DataBuffer m, IComplexNumber work,
                         DataBuffer ldwork, INDArray rwork );
    DataBuffer ztrsnint( DataBuffer matriint, char job, char howmny,
                         DataBuffer select, DataBuffer n,
                         IComplexNumber t, DataBuffer ldt,
                         IComplexNumber vl,
                         DataBuffer ldvl,
                         IComplexNumber vr,
                         DataBuffer ldvr, INDArray s, INDArray sep,
                         DataBuffer mm, DataBuffer m,
                         IComplexNumber work, DataBuffer ldwork,
                         INDArray rwork );

    DataBuffer strsyint( DataBuffer matriint, char trana, char tranb,
                         DataBuffer isgn, DataBuffer m, DataBuffer n,
                         INDArray a, DataBuffer lda,  INDArray b,
                         DataBuffer ldb, INDArray c, DataBuffer ldc,
                         INDArray scale );
    DataBuffer dtrsyint( DataBuffer matriint, char trana, char tranb,
                         DataBuffer isgn, DataBuffer m, DataBuffer n,
                         INDArray a, DataBuffer lda,
                         INDArray b, DataBuffer ldb, INDArray c,
                         DataBuffer ldc, INDArray scale );
    DataBuffer ctrsyint( DataBuffer matriint, char trana, char tranb,
                         DataBuffer isgn, DataBuffer m, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber c, DataBuffer ldc,
                         INDArray scale );
    DataBuffer ztrsyint( DataBuffer matriint, char trana, char tranb,
                         DataBuffer isgn, DataBuffer m, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber c, DataBuffer ldc,
                         INDArray scale );

    DataBuffer strtrint( DataBuffer matriint, char uplo, char diag,
                         DataBuffer n, INDArray a, DataBuffer lda );
    DataBuffer dtrtrint( DataBuffer matriint, char uplo, char diag,
                         DataBuffer n, INDArray a, DataBuffer lda );
    DataBuffer ctrtrint( DataBuffer matriint, char uplo, char diag,
                         DataBuffer n, IComplexNumber a,
                         DataBuffer lda );
    DataBuffer ztrtrint( DataBuffer matriint, char uplo, char diag,
                         DataBuffer n, IComplexNumber a,
                         DataBuffer lda );

    DataBuffer strtrint( DataBuffer matriint, char uplo, char trans,
                         char diag, DataBuffer n, DataBuffer nrhs,
                         INDArray a, DataBuffer lda, INDArray b,
                         DataBuffer ldb );
    DataBuffer dtrtrint( DataBuffer matriint, char uplo, char trans,
                         char diag, DataBuffer n, DataBuffer nrhs,
                         INDArray a, DataBuffer lda, INDArray b,
                         DataBuffer ldb );
    DataBuffer ctrtrint( DataBuffer matriint, char uplo, char trans,
                         char diag, DataBuffer n, DataBuffer nrhs,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber b, DataBuffer ldb );
    DataBuffer ztrtrint( DataBuffer matriint, char uplo, char trans,
                         char diag, DataBuffer n, DataBuffer nrhs,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber b, DataBuffer ldb );

    DataBuffer strttint( DataBuffer matriint, char transr, char uplo,
                         DataBuffer n,  INDArray a, DataBuffer lda,
                         INDArray arf );
    DataBuffer dtrttint( DataBuffer matriint, char transr, char uplo,
                         DataBuffer n,  INDArray a, DataBuffer lda,
                         INDArray arf );
    DataBuffer ctrttint( DataBuffer matriint, char transr, char uplo,
                         DataBuffer n,  IComplexNumber a,
                         DataBuffer lda, IComplexNumber arf );
    DataBuffer ztrttint( DataBuffer matriint, char transr, char uplo,
                         DataBuffer n,  IComplexNumber a,
                         DataBuffer lda, IComplexNumber arf );

    DataBuffer strttint( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray a, DataBuffer lda, INDArray ap );
    DataBuffer dtrttint( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray a, DataBuffer lda, INDArray ap );
    DataBuffer ctrttint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber ap );
    DataBuffer ztrttint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber ap );

    DataBuffer stzrzint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         INDArray a, DataBuffer lda, INDArray tau,
                         INDArray work, DataBuffer lwork );
    DataBuffer dtzrzint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         INDArray a, DataBuffer lda, INDArray tau,
                         INDArray work, DataBuffer lwork );
    DataBuffer ctzrzint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber tau,
                         IComplexNumber work, DataBuffer lwork );
    DataBuffer ztzrzint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber tau,
                         IComplexNumber work, DataBuffer lwork );

    DataBuffer cungbint( DataBuffer matriint, char vect, DataBuffer m,
                         DataBuffer n, DataBuffer k,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber tau,
                         IComplexNumber work, DataBuffer lwork );
    DataBuffer zungbint( DataBuffer matriint, char vect, DataBuffer m,
                         DataBuffer n, DataBuffer k,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber tau,
                         IComplexNumber work, DataBuffer lwork );

    DataBuffer cunghint( DataBuffer matriint, DataBuffer n, DataBuffer ilo,
                         DataBuffer ihi, IComplexNumber a,
                         DataBuffer lda,  IComplexNumber tau,
                         IComplexNumber work, DataBuffer lwork );
    DataBuffer zunghint( DataBuffer matriint, DataBuffer n, DataBuffer ilo,
                         DataBuffer ihi, IComplexNumber a,
                         DataBuffer lda,
                         IComplexNumber tau,
                         IComplexNumber work, DataBuffer lwork );

    DataBuffer cunglint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer k, IComplexNumber a,
                         DataBuffer lda,  IComplexNumber tau,
                         IComplexNumber work, DataBuffer lwork );
    DataBuffer zunglint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer k, IComplexNumber a,
                         DataBuffer lda,
                         IComplexNumber tau,
                         IComplexNumber work, DataBuffer lwork );

    DataBuffer cungqint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer k, IComplexNumber a,
                         DataBuffer lda,  IComplexNumber tau,
                         IComplexNumber work, DataBuffer lwork );
    DataBuffer zungqint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer k, IComplexNumber a,
                         DataBuffer lda,
                         IComplexNumber tau,
                         IComplexNumber work, DataBuffer lwork );


    DataBuffer cungrint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer k, IComplexNumber a,
                         DataBuffer lda,  IComplexNumber tau,
                         IComplexNumber work, DataBuffer lwork );
    DataBuffer zungrint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer k, IComplexNumber a,
                         DataBuffer lda,
                         IComplexNumber tau,
                         IComplexNumber work, DataBuffer lwork );

    DataBuffer cungtint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber tau,
                         IComplexNumber work, DataBuffer lwork );
    DataBuffer zungtint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber tau,
                         IComplexNumber work, DataBuffer lwork );

    DataBuffer cunmbint( DataBuffer matriint, char vect, char side,
                         char trans, DataBuffer m, DataBuffer n,
                         DataBuffer k,  IComplexNumber a,
                         DataBuffer lda,  IComplexNumber tau,
                         IComplexNumber c, DataBuffer ldc,
                         IComplexNumber work, DataBuffer lwork );
    DataBuffer zunmbint( DataBuffer matriint, char vect, char side,
                         char trans, DataBuffer m, DataBuffer n,
                         DataBuffer k,  IComplexNumber a,
                         DataBuffer lda,
                         IComplexNumber tau,
                         IComplexNumber c, DataBuffer ldc,
                         IComplexNumber work, DataBuffer lwork );

    DataBuffer cunmhint( DataBuffer matriint, char side, char trans,
                         DataBuffer m, DataBuffer n, DataBuffer ilo,
                         DataBuffer ihi,  IComplexNumber a,
                         DataBuffer lda,  IComplexNumber tau,
                         IComplexNumber c, DataBuffer ldc,
                         IComplexNumber work, DataBuffer lwork );
    DataBuffer zunmhint( DataBuffer matriint, char side, char trans,
                         DataBuffer m, DataBuffer n, DataBuffer ilo,
                         DataBuffer ihi,  IComplexNumber a,
                         DataBuffer lda,
                         IComplexNumber tau,
                         IComplexNumber c, DataBuffer ldc,
                         IComplexNumber work, DataBuffer lwork );

    DataBuffer cunmlint( DataBuffer matriint, char side, char trans,
                         DataBuffer m, DataBuffer n, DataBuffer k,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber tau,
                         IComplexNumber c, DataBuffer ldc,
                         IComplexNumber work, DataBuffer lwork );
    DataBuffer zunmlint( DataBuffer matriint, char side, char trans,
                         DataBuffer m, DataBuffer n, DataBuffer k,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber tau,
                         IComplexNumber c, DataBuffer ldc,
                         IComplexNumber work, DataBuffer lwork );

    DataBuffer cunmqint( DataBuffer matriint, char side, char trans,
                         DataBuffer m, DataBuffer n, DataBuffer k,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber tau,
                         IComplexNumber c, DataBuffer ldc,
                         IComplexNumber work, DataBuffer lwork );
    DataBuffer zunmqint( DataBuffer matriint, char side, char trans,
                         DataBuffer m, DataBuffer n, DataBuffer k,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber tau,
                         IComplexNumber c, DataBuffer ldc,
                         IComplexNumber work, DataBuffer lwork );



    DataBuffer cunmrint( DataBuffer matriint, char side, char trans,
                         DataBuffer m, DataBuffer n, DataBuffer k,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber tau,
                         IComplexNumber c, DataBuffer ldc,
                         IComplexNumber work, DataBuffer lwork );
    DataBuffer zunmrint( DataBuffer matriint, char side, char trans,
                         DataBuffer m, DataBuffer n, DataBuffer k,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber tau,
                         IComplexNumber c, DataBuffer ldc,
                         IComplexNumber work, DataBuffer lwork );

    DataBuffer cunmrint( DataBuffer matriint, char side, char trans,
                         DataBuffer m, DataBuffer n, DataBuffer k,
                         DataBuffer l,  IComplexNumber a,
                         DataBuffer lda,  IComplexNumber tau,
                         IComplexNumber c, DataBuffer ldc,
                         IComplexNumber work, DataBuffer lwork );
    DataBuffer zunmrint( DataBuffer matriint, char side, char trans,
                         DataBuffer m, DataBuffer n, DataBuffer k,
                         DataBuffer l,  IComplexNumber a,
                         DataBuffer lda,
                         IComplexNumber tau,
                         IComplexNumber c, DataBuffer ldc,
                         IComplexNumber work, DataBuffer lwork );

    DataBuffer cunmtint( DataBuffer matriint, char side, char uplo,
                         char trans, DataBuffer m, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber tau,
                         IComplexNumber c, DataBuffer ldc,
                         IComplexNumber work, DataBuffer lwork );
    DataBuffer zunmtint( DataBuffer matriint, char side, char uplo,
                         char trans, DataBuffer m, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber tau,
                         IComplexNumber c, DataBuffer ldc,
                         IComplexNumber work, DataBuffer lwork );

    DataBuffer cupgtint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber ap,
                         IComplexNumber tau,
                         IComplexNumber q, DataBuffer ldq,
                         IComplexNumber work );
    DataBuffer zupgtint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber ap,
                         IComplexNumber tau,
                         IComplexNumber q, DataBuffer ldq,
                         IComplexNumber work );

    DataBuffer cupmtint( DataBuffer matriint, char side, char uplo,
                         char trans, DataBuffer m, DataBuffer n,
                         IComplexNumber ap,
                         IComplexNumber tau,
                         IComplexNumber c, DataBuffer ldc,
                         IComplexNumber work );
    DataBuffer zupmtint( DataBuffer matriint, char side, char uplo,
                         char trans, DataBuffer m, DataBuffer n,
                         IComplexNumber ap,
                         IComplexNumber tau,
                         IComplexNumber c, DataBuffer ldc,
                         IComplexNumber work );

    DataBuffer claghe( DataBuffer matriint, DataBuffer n, DataBuffer k,
                       INDArray d, IComplexNumber a,
                       DataBuffer lda, DataBuffer iseed );
    DataBuffer zlaghe( DataBuffer matriint, DataBuffer n, DataBuffer k,
                       INDArray d, IComplexNumber a,
                       DataBuffer lda, DataBuffer iseed );

    DataBuffer slagsy( DataBuffer matriint, DataBuffer n, DataBuffer k,
                       INDArray d, INDArray a, DataBuffer lda,
                       DataBuffer iseed );
    DataBuffer dlagsy( DataBuffer matriint, DataBuffer n, DataBuffer k,
                       INDArray d, INDArray a, DataBuffer lda,
                       DataBuffer iseed );
    DataBuffer clagsy( DataBuffer matriint, DataBuffer n, DataBuffer k,
                       INDArray d, IComplexNumber a,
                       DataBuffer lda, DataBuffer iseed );
    DataBuffer zlagsy( DataBuffer matriint, DataBuffer n, DataBuffer k,
                       INDArray d, IComplexNumber a,
                       DataBuffer lda, DataBuffer iseed );

    DataBuffer slapmr( DataBuffer matriint, int forwrd,
                       DataBuffer m, DataBuffer n, INDArray x, DataBuffer ldx,
                       DataBuffer k );
    DataBuffer dlapmr( DataBuffer matriint, int forwrd,
                       DataBuffer m, DataBuffer n, INDArray x,
                       DataBuffer ldx, DataBuffer k );
    DataBuffer clapmr( DataBuffer matriint, int forwrd,
                       DataBuffer m, DataBuffer n, IComplexNumber x,
                       DataBuffer ldx, DataBuffer k );
    DataBuffer zlapmr( DataBuffer matriint, int forwrd,
                       DataBuffer m, DataBuffer n, IComplexNumber x,
                       DataBuffer ldx, DataBuffer k );

    DataBuffer slapmt( DataBuffer matriint, int forwrd,
                       DataBuffer m, DataBuffer n, INDArray x, DataBuffer ldx,
                       DataBuffer k );
    DataBuffer dlapmt( DataBuffer matriint, int forwrd,
                       DataBuffer m, DataBuffer n, INDArray x,
                       DataBuffer ldx, DataBuffer k );
    DataBuffer clapmt( DataBuffer matriint, int forwrd,
                       DataBuffer m, DataBuffer n, IComplexNumber x,
                       DataBuffer ldx, DataBuffer k );
    DataBuffer zlapmt( DataBuffer matriint, int forwrd,
                       DataBuffer m, DataBuffer n, IComplexNumber x,
                       DataBuffer ldx, DataBuffer k );

    float slapy2( float x, float y );
    double dlapy2( double x, double y );

    float slapy3( float x, float y, float z );
    double dlapy3( double x, double y, double z );

    DataBuffer slartgp( float f, float g, INDArray cs, INDArray sn, INDArray r );
    DataBuffer dlartgp( double f, double g, INDArray cs, INDArray sn,
                        INDArray r );

    DataBuffer slartgs( float x, float y, float sigma, INDArray cs,
                        INDArray sn );
    DataBuffer dlartgs( double x, double y, double sigma, INDArray cs,
                        INDArray sn );


    //LAPACK 3.3.0
    DataBuffer cbbcsd( DataBuffer matriint, char jobu1, char jobu2,
                       char jobv1t, char jobv2t, char trans, DataBuffer m,
                       DataBuffer p, DataBuffer q, INDArray theta, INDArray phi,
                       IComplexNumber u1, DataBuffer ldu1,
                       IComplexNumber u2, DataBuffer ldu2,
                       IComplexNumber v1t, DataBuffer ldv1t,
                       IComplexNumber v2t, DataBuffer ldv2t,
                       INDArray b11d, INDArray b11e, INDArray b12d, INDArray b12e,
                       INDArray b21d, INDArray b21e, INDArray b22d, INDArray b22e );
    DataBuffer cbbcsint( DataBuffer matriint, char jobu1, char jobu2,
                         char jobv1t, char jobv2t, char trans,
                         DataBuffer m, DataBuffer p, DataBuffer q,
                         INDArray theta, INDArray phi,
                         IComplexNumber u1, DataBuffer ldu1,
                         IComplexNumber u2, DataBuffer ldu2,
                         IComplexNumber v1t, DataBuffer ldv1t,
                         IComplexNumber v2t, DataBuffer ldv2t,
                         INDArray b11d, INDArray b11e, INDArray b12d,
                         INDArray b12e, INDArray b21d, INDArray b21e,
                         INDArray b22d, INDArray b22e, INDArray rwork,
                         DataBuffer lrwork );
    DataBuffer cheswapr( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer i1,
                         DataBuffer i2 );
    DataBuffer cheswapint( DataBuffer matriint, char uplo, DataBuffer n,
                           IComplexNumber a, DataBuffer i1,
                           DataBuffer i2 );
    DataBuffer chetri2( DataBuffer matriint, char uplo, DataBuffer n,
                        IComplexNumber a, DataBuffer lda,
                        DataBuffer ipiv );
    DataBuffer chetri2_work( DataBuffer matriint, char uplo, DataBuffer n,
                             IComplexNumber a, DataBuffer lda,
                             DataBuffer ipiv,
                             IComplexNumber work, DataBuffer lwork );
    DataBuffer chetri2x( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         DataBuffer ipiv, DataBuffer nb );
    DataBuffer chetri2int( DataBuffer matriint, char uplo, DataBuffer n,
                           IComplexNumber a, DataBuffer lda,
                           DataBuffer ipiv,
                           IComplexNumber work, DataBuffer nb );
    DataBuffer chetrs2( DataBuffer matriint, char uplo, DataBuffer n,
                        DataBuffer nrhs,  IComplexNumber a,
                        DataBuffer lda,  DataBuffer ipiv,
                        IComplexNumber b, DataBuffer ldb );
    DataBuffer chetrs2_work( DataBuffer matriint, char uplo, DataBuffer n,
                             DataBuffer nrhs,  IComplexNumber a,
                             DataBuffer lda,  DataBuffer ipiv,
                             IComplexNumber b, DataBuffer ldb,
                             IComplexNumber work );
    DataBuffer csyconv( DataBuffer matriint, char uplo, char way, DataBuffer n,
                        IComplexNumber a, DataBuffer lda,
                        DataBuffer ipiv, IComplexNumber work  );
    DataBuffer csyconint( DataBuffer matriint, char uplo, char way,
                          DataBuffer n, IComplexNumber a,
                          DataBuffer lda,  DataBuffer ipiv,
                          IComplexNumber work );
    DataBuffer csyswapr( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer i1,
                         DataBuffer i2 );
    DataBuffer csyswapint( DataBuffer matriint, char uplo, DataBuffer n,
                           IComplexNumber a, DataBuffer i1,
                           DataBuffer i2 );
    DataBuffer csytri2( DataBuffer matriint, char uplo, DataBuffer n,
                        IComplexNumber a, DataBuffer lda,
                        DataBuffer ipiv );
    DataBuffer csytri2_work( DataBuffer matriint, char uplo, DataBuffer n,
                             IComplexNumber a, DataBuffer lda,
                             DataBuffer ipiv,
                             IComplexNumber work, DataBuffer lwork );
    DataBuffer csytri2x( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         DataBuffer ipiv, DataBuffer nb );
    DataBuffer csytri2int( DataBuffer matriint, char uplo, DataBuffer n,
                           IComplexNumber a, DataBuffer lda,
                           DataBuffer ipiv,
                           IComplexNumber work, DataBuffer nb );
    DataBuffer csytrs2( DataBuffer matriint, char uplo, DataBuffer n,
                        DataBuffer nrhs,  IComplexNumber a,
                        DataBuffer lda,  DataBuffer ipiv,
                        IComplexNumber b, DataBuffer ldb );
    DataBuffer csytrs2_work( DataBuffer matriint, char uplo, DataBuffer n,
                             DataBuffer nrhs,  IComplexNumber a,
                             DataBuffer lda,  DataBuffer ipiv,
                             IComplexNumber b, DataBuffer ldb,
                             IComplexNumber work );
    DataBuffer cunbdb( DataBuffer matriint, char trans, char signs,
                       DataBuffer m, DataBuffer p, DataBuffer q,
                       IComplexNumber x11, DataBuffer ldx11,
                       IComplexNumber x12, DataBuffer ldx12,
                       IComplexNumber x21, DataBuffer ldx21,
                       IComplexNumber x22, DataBuffer ldx22,
                       INDArray theta, INDArray phi,
                       IComplexNumber taup1,
                       IComplexNumber taup2,
                       IComplexNumber tauq1,
                       IComplexNumber tauq2 );
    DataBuffer cunbdint( DataBuffer matriint, char trans, char signs,
                         DataBuffer m, DataBuffer p, DataBuffer q,
                         IComplexNumber x11, DataBuffer ldx11,
                         IComplexNumber x12, DataBuffer ldx12,
                         IComplexNumber x21, DataBuffer ldx21,
                         IComplexNumber x22, DataBuffer ldx22,
                         INDArray theta, INDArray phi,
                         IComplexNumber taup1,
                         IComplexNumber taup2,
                         IComplexNumber tauq1,
                         IComplexNumber tauq2,
                         IComplexNumber work, DataBuffer lwork );
    DataBuffer cuncsd( DataBuffer matriint, char jobu1, char jobu2,
                       char jobv1t, char jobv2t, char trans, char signs,
                       DataBuffer m, DataBuffer p, DataBuffer q,
                       IComplexNumber x11, DataBuffer ldx11,
                       IComplexNumber x12, DataBuffer ldx12,
                       IComplexNumber x21, DataBuffer ldx21,
                       IComplexNumber x22, DataBuffer ldx22,
                       INDArray theta, IComplexNumber u1,
                       DataBuffer ldu1, IComplexNumber u2,
                       DataBuffer ldu2, IComplexNumber v1t,
                       DataBuffer ldv1t, IComplexNumber v2t,
                       DataBuffer ldv2t );
    DataBuffer cuncsint( DataBuffer matriint, char jobu1, char jobu2,
                         char jobv1t, char jobv2t, char trans,
                         char signs, DataBuffer m, DataBuffer p,
                         DataBuffer q, IComplexNumber x11,
                         DataBuffer ldx11, IComplexNumber x12,
                         DataBuffer ldx12, IComplexNumber x21,
                         DataBuffer ldx21, IComplexNumber x22,
                         DataBuffer ldx22, INDArray theta,
                         IComplexNumber u1, DataBuffer ldu1,
                         IComplexNumber u2, DataBuffer ldu2,
                         IComplexNumber v1t, DataBuffer ldv1t,
                         IComplexNumber v2t, DataBuffer ldv2t,
                         IComplexNumber work, DataBuffer lwork,
                         INDArray rwork, DataBuffer lrwork,
                         DataBuffer iwork );
    DataBuffer cuncsd2by1( DataBuffer matriint, char jobu1, char jobu2,
                           char jobv1t, DataBuffer m, DataBuffer p, DataBuffer q,
                           IComplexNumber x11, DataBuffer ldx11,
                           IComplexNumber x21, DataBuffer ldx21,
                           IComplexNumber theta, IComplexNumber u1,
                           DataBuffer ldu1, IComplexNumber u2,
                           DataBuffer ldu2, IComplexNumber v1t, DataBuffer ldv1t );
    DataBuffer cuncsd2by1_work( DataBuffer matriint, char jobu1, char jobu2,
                                char jobv1t, DataBuffer m, DataBuffer p,
                                DataBuffer q, IComplexNumber x11, DataBuffer ldx11,
                                IComplexNumber x21, DataBuffer ldx21,
                                IComplexNumber theta, IComplexNumber u1,
                                DataBuffer ldu1, IComplexNumber u2,
                                DataBuffer ldu2, IComplexNumber v1t,
                                DataBuffer ldv1t, IComplexNumber work,
                                DataBuffer lwork, INDArray rwork, DataBuffer lrwork,
                                DataBuffer iwork );
    DataBuffer dbbcsd( DataBuffer matriint, char jobu1, char jobu2,
                       char jobv1t, char jobv2t, char trans, DataBuffer m,
                       DataBuffer p, DataBuffer q, INDArray theta,
                       INDArray phi, INDArray u1, DataBuffer ldu1, INDArray u2,
                       DataBuffer ldu2, INDArray v1t, DataBuffer ldv1t,
                       INDArray v2t, DataBuffer ldv2t, INDArray b11d,
                       INDArray b11e, INDArray b12d, INDArray b12e,
                       INDArray b21d, INDArray b21e, INDArray b22d,
                       INDArray b22e );
    DataBuffer dbbcsint( DataBuffer matriint, char jobu1, char jobu2,
                         char jobv1t, char jobv2t, char trans,
                         DataBuffer m, DataBuffer p, DataBuffer q,
                         INDArray theta, INDArray phi, INDArray u1,
                         DataBuffer ldu1, INDArray u2, DataBuffer ldu2,
                         INDArray v1t, DataBuffer ldv1t, INDArray v2t,
                         DataBuffer ldv2t, INDArray b11d, INDArray b11e,
                         INDArray b12d, INDArray b12e, INDArray b21d,
                         INDArray b21e, INDArray b22d, INDArray b22e,
                         INDArray work, DataBuffer lwork );
    DataBuffer dorbdb( DataBuffer matriint, char trans, char signs,
                       DataBuffer m, DataBuffer p, DataBuffer q,
                       INDArray x11, DataBuffer ldx11, INDArray x12,
                       DataBuffer ldx12, INDArray x21, DataBuffer ldx21,
                       INDArray x22, DataBuffer ldx22, INDArray theta,
                       INDArray phi, INDArray taup1, INDArray taup2,
                       INDArray tauq1, INDArray tauq2 );
    DataBuffer dorbdint( DataBuffer matriint, char trans, char signs,
                         DataBuffer m, DataBuffer p, DataBuffer q,
                         INDArray x11, DataBuffer ldx11, INDArray x12,
                         DataBuffer ldx12, INDArray x21, DataBuffer ldx21,
                         INDArray x22, DataBuffer ldx22, INDArray theta,
                         INDArray phi, INDArray taup1, INDArray taup2,
                         INDArray tauq1, INDArray tauq2, INDArray work,
                         DataBuffer lwork );
    DataBuffer dorcsd( DataBuffer matriint, char jobu1, char jobu2,
                       char jobv1t, char jobv2t, char trans, char signs,
                       DataBuffer m, DataBuffer p, DataBuffer q,
                       INDArray x11, DataBuffer ldx11, INDArray x12,
                       DataBuffer ldx12, INDArray x21, DataBuffer ldx21,
                       INDArray x22, DataBuffer ldx22, INDArray theta,
                       INDArray u1, DataBuffer ldu1, INDArray u2,
                       DataBuffer ldu2, INDArray v1t, DataBuffer ldv1t,
                       INDArray v2t, DataBuffer ldv2t );
    DataBuffer dorcsint( DataBuffer matriint, char jobu1, char jobu2,
                         char jobv1t, char jobv2t, char trans,
                         char signs, DataBuffer m, DataBuffer p,
                         DataBuffer q, INDArray x11, DataBuffer ldx11,
                         INDArray x12, DataBuffer ldx12, INDArray x21,
                         DataBuffer ldx21, INDArray x22, DataBuffer ldx22,
                         INDArray theta, INDArray u1, DataBuffer ldu1,
                         INDArray u2, DataBuffer ldu2, INDArray v1t,
                         DataBuffer ldv1t, INDArray v2t, DataBuffer ldv2t,
                         INDArray work, DataBuffer lwork,
                         DataBuffer iwork );
    DataBuffer dorcsd2by1( DataBuffer matriint, char jobu1, char jobu2,
                           char jobv1t, DataBuffer m, DataBuffer p, DataBuffer q,
                           INDArray x11, DataBuffer ldx11, INDArray x21, DataBuffer ldx21,
                           INDArray theta, INDArray u1, DataBuffer ldu1, INDArray u2,
                           DataBuffer ldu2, INDArray v1t, DataBuffer ldv1t);
    DataBuffer dorcsd2by1_work( DataBuffer matriint, char jobu1, char jobu2,
                                char jobv1t, DataBuffer m, DataBuffer p, DataBuffer q,
                                INDArray x11, DataBuffer ldx11, INDArray x21, DataBuffer ldx21,
                                INDArray theta, INDArray u1, DataBuffer ldu1, INDArray u2,
                                DataBuffer ldu2, INDArray v1t, DataBuffer ldv1t,
                                INDArray work, DataBuffer lwork, DataBuffer iwork );
    DataBuffer dsyconv( DataBuffer matriint, char uplo, char way, DataBuffer n,
                        INDArray a, DataBuffer lda,  DataBuffer ipiv, INDArray work);
    DataBuffer dsyconint( DataBuffer matriint, char uplo, char way,
                          DataBuffer n, INDArray a, DataBuffer lda,
                          DataBuffer ipiv, INDArray work );
    DataBuffer dsyswapr( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray a, DataBuffer i1, DataBuffer i2 );
    DataBuffer dsyswapint( DataBuffer matriint, char uplo, DataBuffer n,
                           INDArray a, DataBuffer i1, DataBuffer i2 );
    DataBuffer dsytri2( DataBuffer matriint, char uplo, DataBuffer n,
                        INDArray a, DataBuffer lda,  DataBuffer ipiv );
    DataBuffer dsytri2_work( DataBuffer matriint, char uplo, DataBuffer n,
                             INDArray a, DataBuffer lda,
                             DataBuffer ipiv,
                             IComplexNumber work, DataBuffer lwork );
    DataBuffer dsytri2x( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray a, DataBuffer lda,  DataBuffer ipiv,
                         DataBuffer nb );
    DataBuffer dsytri2int( DataBuffer matriint, char uplo, DataBuffer n,
                           INDArray a, DataBuffer lda,
                           DataBuffer ipiv, INDArray work,
                           DataBuffer nb );
    DataBuffer dsytrs2( DataBuffer matriint, char uplo, DataBuffer n,
                        DataBuffer nrhs,  INDArray a, DataBuffer lda,
                        DataBuffer ipiv, INDArray b, DataBuffer ldb );
    DataBuffer dsytrs2_work( DataBuffer matriint, char uplo, DataBuffer n,
                             DataBuffer nrhs,  INDArray a,
                             DataBuffer lda,  DataBuffer ipiv,
                             INDArray b, DataBuffer ldb, INDArray work );
    DataBuffer sbbcsd( DataBuffer matriint, char jobu1, char jobu2,
                       char jobv1t, char jobv2t, char trans, DataBuffer m,
                       DataBuffer p, DataBuffer q, INDArray theta, INDArray phi,
                       INDArray u1, DataBuffer ldu1, INDArray u2,
                       DataBuffer ldu2, INDArray v1t, DataBuffer ldv1t,
                       INDArray v2t, DataBuffer ldv2t, INDArray b11d,
                       INDArray b11e, INDArray b12d, INDArray b12e, INDArray b21d,
                       INDArray b21e, INDArray b22d, INDArray b22e );
    DataBuffer sbbcsint( DataBuffer matriint, char jobu1, char jobu2,
                         char jobv1t, char jobv2t, char trans,
                         DataBuffer m, DataBuffer p, DataBuffer q,
                         INDArray theta, INDArray phi, INDArray u1,
                         DataBuffer ldu1, INDArray u2, DataBuffer ldu2,
                         INDArray v1t, DataBuffer ldv1t, INDArray v2t,
                         DataBuffer ldv2t, INDArray b11d, INDArray b11e,
                         INDArray b12d, INDArray b12e, INDArray b21d,
                         INDArray b21e, INDArray b22d, INDArray b22e,
                         INDArray work, DataBuffer lwork );
    DataBuffer sorbdb( DataBuffer matriint, char trans, char signs,
                       DataBuffer m, DataBuffer p, DataBuffer q, INDArray x11,
                       DataBuffer ldx11, INDArray x12, DataBuffer ldx12,
                       INDArray x21, DataBuffer ldx21, INDArray x22,
                       DataBuffer ldx22, INDArray theta, INDArray phi,
                       INDArray taup1, INDArray taup2, INDArray tauq1,
                       INDArray tauq2 );
    DataBuffer sorbdint( DataBuffer matriint, char trans, char signs,
                         DataBuffer m, DataBuffer p, DataBuffer q,
                         INDArray x11, DataBuffer ldx11, INDArray x12,
                         DataBuffer ldx12, INDArray x21, DataBuffer ldx21,
                         INDArray x22, DataBuffer ldx22, INDArray theta,
                         INDArray phi, INDArray taup1, INDArray taup2,
                         INDArray tauq1, INDArray tauq2, INDArray work,
                         DataBuffer lwork );
    DataBuffer sorcsd( DataBuffer matriint, char jobu1, char jobu2,
                       char jobv1t, char jobv2t, char trans, char signs,
                       DataBuffer m, DataBuffer p, DataBuffer q, INDArray x11,
                       DataBuffer ldx11, INDArray x12, DataBuffer ldx12,
                       INDArray x21, DataBuffer ldx21, INDArray x22,
                       DataBuffer ldx22, INDArray theta, INDArray u1,
                       DataBuffer ldu1, INDArray u2, DataBuffer ldu2,
                       INDArray v1t, DataBuffer ldv1t, INDArray v2t,
                       DataBuffer ldv2t );
    DataBuffer sorcsint( DataBuffer matriint, char jobu1, char jobu2,
                         char jobv1t, char jobv2t, char trans,
                         char signs, DataBuffer m, DataBuffer p,
                         DataBuffer q, INDArray x11, DataBuffer ldx11,
                         INDArray x12, DataBuffer ldx12, INDArray x21,
                         DataBuffer ldx21, INDArray x22, DataBuffer ldx22,
                         INDArray theta, INDArray u1, DataBuffer ldu1,
                         INDArray u2, DataBuffer ldu2, INDArray v1t,
                         DataBuffer ldv1t, INDArray v2t, DataBuffer ldv2t,
                         INDArray work, DataBuffer lwork,
                         DataBuffer iwork );
    DataBuffer sorcsd2by1( DataBuffer matriint, char jobu1, char jobu2,
                           char jobv1t, DataBuffer m, DataBuffer p, DataBuffer q,
                           INDArray x11, DataBuffer ldx11, INDArray x21, DataBuffer ldx21,
                           INDArray theta, INDArray u1, DataBuffer ldu1, INDArray u2,
                           DataBuffer ldu2, INDArray v1t, DataBuffer ldv1t);
    DataBuffer sorcsd2by1_work( DataBuffer matriint, char jobu1, char jobu2,
                                char jobv1t, DataBuffer m, DataBuffer p, DataBuffer q,
                                INDArray x11, DataBuffer ldx11, INDArray x21, DataBuffer ldx21,
                                INDArray theta, INDArray u1, DataBuffer ldu1, INDArray u2,
                                DataBuffer ldu2, INDArray v1t, DataBuffer ldv1t,
                                INDArray work, DataBuffer lwork, DataBuffer iwork );
    DataBuffer ssyconv( DataBuffer matriint, char uplo, char way, DataBuffer n,
                        INDArray a, DataBuffer lda,  DataBuffer ipiv, INDArray work );
    DataBuffer ssyconint( DataBuffer matriint, char uplo, char way,
                          DataBuffer n, INDArray a, DataBuffer lda,
                          DataBuffer ipiv, INDArray work );
    DataBuffer ssyswapr( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray a, DataBuffer i1, DataBuffer i2 );
    DataBuffer ssyswapint( DataBuffer matriint, char uplo, DataBuffer n,
                           INDArray a, DataBuffer i1, DataBuffer i2 );
    DataBuffer ssytri2( DataBuffer matriint, char uplo, DataBuffer n, INDArray a,
                        DataBuffer lda,  DataBuffer ipiv );
    DataBuffer ssytri2_work( DataBuffer matriint, char uplo, DataBuffer n,
                             INDArray a, DataBuffer lda,
                             DataBuffer ipiv,
                             IComplexNumber work, DataBuffer lwork );
    DataBuffer ssytri2x( DataBuffer matriint, char uplo, DataBuffer n,
                         INDArray a, DataBuffer lda,  DataBuffer ipiv,
                         DataBuffer nb );
    DataBuffer ssytri2int( DataBuffer matriint, char uplo, DataBuffer n,
                           INDArray a, DataBuffer lda,
                           DataBuffer ipiv, INDArray work,
                           DataBuffer nb );
    DataBuffer ssytrs2( DataBuffer matriint, char uplo, DataBuffer n,
                        DataBuffer nrhs,  INDArray a, DataBuffer lda,
                        DataBuffer ipiv, INDArray b, DataBuffer ldb );
    DataBuffer ssytrs2_work( DataBuffer matriint, char uplo, DataBuffer n,
                             DataBuffer nrhs,  INDArray a,
                             DataBuffer lda,  DataBuffer ipiv,
                             INDArray b, DataBuffer ldb, INDArray work );
    DataBuffer zbbcsd( DataBuffer matriint, char jobu1, char jobu2,
                       char jobv1t, char jobv2t, char trans, DataBuffer m,
                       DataBuffer p, DataBuffer q, INDArray theta,
                       INDArray phi, IComplexNumber u1,
                       DataBuffer ldu1, IComplexNumber u2,
                       DataBuffer ldu2, IComplexNumber v1t,
                       DataBuffer ldv1t, IComplexNumber v2t,
                       DataBuffer ldv2t, INDArray b11d, INDArray b11e,
                       INDArray b12d, INDArray b12e, INDArray b21d,
                       INDArray b21e, INDArray b22d, INDArray b22e );
    DataBuffer zbbcsint( DataBuffer matriint, char jobu1, char jobu2,
                         char jobv1t, char jobv2t, char trans,
                         DataBuffer m, DataBuffer p, DataBuffer q,
                         INDArray theta, INDArray phi,
                         IComplexNumber u1, DataBuffer ldu1,
                         IComplexNumber u2, DataBuffer ldu2,
                         IComplexNumber v1t, DataBuffer ldv1t,
                         IComplexNumber v2t, DataBuffer ldv2t,
                         INDArray b11d, INDArray b11e, INDArray b12d,
                         INDArray b12e, INDArray b21d, INDArray b21e,
                         INDArray b22d, INDArray b22e, INDArray rwork,
                         DataBuffer lrwork );
    DataBuffer zheswapr( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer i1,
                         DataBuffer i2 );
    DataBuffer zheswapint( DataBuffer matriint, char uplo, DataBuffer n,
                           IComplexNumber a, DataBuffer i1,
                           DataBuffer i2 );
    DataBuffer zhetri2( DataBuffer matriint, char uplo, DataBuffer n,
                        IComplexNumber a, DataBuffer lda,
                        DataBuffer ipiv );
    DataBuffer zhetri2_work( DataBuffer matriint, char uplo, DataBuffer n,
                             IComplexNumber a, DataBuffer lda,
                             DataBuffer ipiv,
                             IComplexNumber work, DataBuffer lwork );
    DataBuffer zhetri2x( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         DataBuffer ipiv, DataBuffer nb );
    DataBuffer zhetri2int( DataBuffer matriint, char uplo, DataBuffer n,
                           IComplexNumber a, DataBuffer lda,
                           DataBuffer ipiv,
                           IComplexNumber work, DataBuffer nb );
    DataBuffer zhetrs2( DataBuffer matriint, char uplo, DataBuffer n,
                        DataBuffer nrhs,  IComplexNumber a,
                        DataBuffer lda,  DataBuffer ipiv,
                        IComplexNumber b, DataBuffer ldb );
    DataBuffer zhetrs2_work( DataBuffer matriint, char uplo, DataBuffer n,
                             DataBuffer nrhs,  IComplexNumber a,
                             DataBuffer lda,  DataBuffer ipiv,
                             IComplexNumber b, DataBuffer ldb,
                             IComplexNumber work );
    DataBuffer zsyconv( DataBuffer matriint, char uplo, char way, DataBuffer n,
                        IComplexNumber a, DataBuffer lda,
                        DataBuffer ipiv, IComplexNumber work );
    DataBuffer zsyconint( DataBuffer matriint, char uplo, char way,
                          DataBuffer n, IComplexNumber a,
                          DataBuffer lda,  DataBuffer ipiv,
                          IComplexNumber work );
    DataBuffer zsyswapr( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer i1,
                         DataBuffer i2 );
    DataBuffer zsyswapint( DataBuffer matriint, char uplo, DataBuffer n,
                           IComplexNumber a, DataBuffer i1,
                           DataBuffer i2 );
    DataBuffer zsytri2( DataBuffer matriint, char uplo, DataBuffer n,
                        IComplexNumber a, DataBuffer lda,
                        DataBuffer ipiv );
    DataBuffer zsytri2_work( DataBuffer matriint, char uplo, DataBuffer n,
                             IComplexNumber a, DataBuffer lda,
                             DataBuffer ipiv,
                             IComplexNumber work, DataBuffer lwork );
    DataBuffer zsytri2x( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         DataBuffer ipiv, DataBuffer nb );
    DataBuffer zsytri2int( DataBuffer matriint, char uplo, DataBuffer n,
                           IComplexNumber a, DataBuffer lda,
                           DataBuffer ipiv,
                           IComplexNumber work, DataBuffer nb );
    DataBuffer zsytrs2( DataBuffer matriint, char uplo, DataBuffer n,
                        DataBuffer nrhs,  IComplexNumber a,
                        DataBuffer lda,  DataBuffer ipiv,
                        IComplexNumber b, DataBuffer ldb );
    DataBuffer zsytrs2_work( DataBuffer matriint, char uplo, DataBuffer n,
                             DataBuffer nrhs,  IComplexNumber a,
                             DataBuffer lda,  DataBuffer ipiv,
                             IComplexNumber b, DataBuffer ldb,
                             IComplexNumber work );
    DataBuffer zunbdb( DataBuffer matriint, char trans, char signs,
                       DataBuffer m, DataBuffer p, DataBuffer q,
                       IComplexNumber x11, DataBuffer ldx11,
                       IComplexNumber x12, DataBuffer ldx12,
                       IComplexNumber x21, DataBuffer ldx21,
                       IComplexNumber x22, DataBuffer ldx22,
                       INDArray theta, INDArray phi,
                       IComplexNumber taup1,
                       IComplexNumber taup2,
                       IComplexNumber tauq1,
                       IComplexNumber tauq2 );
    DataBuffer zunbdint( DataBuffer matriint, char trans, char signs,
                         DataBuffer m, DataBuffer p, DataBuffer q,
                         IComplexNumber x11, DataBuffer ldx11,
                         IComplexNumber x12, DataBuffer ldx12,
                         IComplexNumber x21, DataBuffer ldx21,
                         IComplexNumber x22, DataBuffer ldx22,
                         INDArray theta, INDArray phi,
                         IComplexNumber taup1,
                         IComplexNumber taup2,
                         IComplexNumber tauq1,
                         IComplexNumber tauq2,
                         IComplexNumber work, DataBuffer lwork );
    DataBuffer zuncsd( DataBuffer matriint, char jobu1, char jobu2,
                       char jobv1t, char jobv2t, char trans, char signs,
                       DataBuffer m, DataBuffer p, DataBuffer q,
                       IComplexNumber x11, DataBuffer ldx11,
                       IComplexNumber x12, DataBuffer ldx12,
                       IComplexNumber x21, DataBuffer ldx21,
                       IComplexNumber x22, DataBuffer ldx22,
                       INDArray theta, IComplexNumber u1,
                       DataBuffer ldu1, IComplexNumber u2,
                       DataBuffer ldu2, IComplexNumber v1t,
                       DataBuffer ldv1t, IComplexNumber v2t,
                       DataBuffer ldv2t );
    DataBuffer zuncsint( DataBuffer matriint, char jobu1, char jobu2,
                         char jobv1t, char jobv2t, char trans,
                         char signs, DataBuffer m, DataBuffer p,
                         DataBuffer q, IComplexNumber x11,
                         DataBuffer ldx11, IComplexNumber x12,
                         DataBuffer ldx12, IComplexNumber x21,
                         DataBuffer ldx21, IComplexNumber x22,
                         DataBuffer ldx22, INDArray theta,
                         IComplexNumber u1, DataBuffer ldu1,
                         IComplexNumber u2, DataBuffer ldu2,
                         IComplexNumber v1t, DataBuffer ldv1t,
                         IComplexNumber v2t, DataBuffer ldv2t,
                         IComplexNumber work, DataBuffer lwork,
                         INDArray rwork, DataBuffer lrwork,
                         DataBuffer iwork );
    DataBuffer zuncsd2by1( DataBuffer matriint, char jobu1, char jobu2,
                           char jobv1t, DataBuffer m, DataBuffer p, DataBuffer q,
                           IComplexNumber x11, DataBuffer ldx11,
                           IComplexNumber x21, DataBuffer ldx21,
                           IComplexNumber theta, IComplexNumber u1,
                           DataBuffer ldu1, IComplexNumber u2,
                           DataBuffer ldu2, IComplexNumber v1t, DataBuffer ldv1t );
    DataBuffer zuncsd2by1_work( DataBuffer matriint, char jobu1, char jobu2,
                                char jobv1t, DataBuffer m, DataBuffer p,
                                DataBuffer q, IComplexNumber x11, DataBuffer ldx11,
                                IComplexNumber x21, DataBuffer ldx21,
                                IComplexNumber theta, IComplexNumber u1,
                                DataBuffer ldu1, IComplexNumber u2,
                                DataBuffer ldu2, IComplexNumber v1t,
                                DataBuffer ldv1t, IComplexNumber work,
                                DataBuffer lwork, INDArray rwork, DataBuffer lrwork,
                                DataBuffer iwork );

    //LAPACK 3.4.0
    DataBuffer sgemqrt( DataBuffer matriint, char side, char trans,
                        DataBuffer m, DataBuffer n, DataBuffer k,
                        DataBuffer nb,  INDArray v, DataBuffer ldv,
                        INDArray t, DataBuffer ldt, INDArray c,
                        DataBuffer ldc );
    DataBuffer dgemqrt( DataBuffer matriint, char side, char trans,
                        DataBuffer m, DataBuffer n, DataBuffer k,
                        DataBuffer nb,  INDArray v, DataBuffer ldv,
                        INDArray t, DataBuffer ldt, INDArray c,
                        DataBuffer ldc );
    DataBuffer cgemqrt( DataBuffer matriint, char side, char trans,
                        DataBuffer m, DataBuffer n, DataBuffer k,
                        DataBuffer nb,  IComplexNumber v,
                        DataBuffer ldv,  IComplexNumber t,
                        DataBuffer ldt, IComplexNumber c,
                        DataBuffer ldc );
    DataBuffer zgemqrt( DataBuffer matriint, char side, char trans,
                        DataBuffer m, DataBuffer n, DataBuffer k,
                        DataBuffer nb,  IComplexNumber v,
                        DataBuffer ldv,  IComplexNumber t,
                        DataBuffer ldt, IComplexNumber c,
                        DataBuffer ldc );

    DataBuffer sgeqrt( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer nb, INDArray a, DataBuffer lda, INDArray t,
                       DataBuffer ldt );
    DataBuffer dgeqrt( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer nb, INDArray a, DataBuffer lda, INDArray t,
                       DataBuffer ldt );
    DataBuffer cgeqrt( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer nb, IComplexNumber a,
                       DataBuffer lda, IComplexNumber t,
                       DataBuffer ldt );
    DataBuffer zgeqrt( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer nb, IComplexNumber a,
                       DataBuffer lda, IComplexNumber t,
                       DataBuffer ldt );

    DataBuffer sgeqrt2( DataBuffer matriint, DataBuffer m, DataBuffer n,
                        INDArray a, DataBuffer lda, INDArray t,
                        DataBuffer ldt );
    DataBuffer dgeqrt2( DataBuffer matriint, DataBuffer m, DataBuffer n,
                        INDArray a, DataBuffer lda, INDArray t,
                        DataBuffer ldt );
    DataBuffer cgeqrt2( DataBuffer matriint, DataBuffer m, DataBuffer n,
                        IComplexNumber a, DataBuffer lda,
                        IComplexNumber t, DataBuffer ldt );
    DataBuffer zgeqrt2( DataBuffer matriint, DataBuffer m, DataBuffer n,
                        IComplexNumber a, DataBuffer lda,
                        IComplexNumber t, DataBuffer ldt );

    DataBuffer sgeqrt3( DataBuffer matriint, DataBuffer m, DataBuffer n,
                        INDArray a, DataBuffer lda, INDArray t,
                        DataBuffer ldt );
    DataBuffer dgeqrt3( DataBuffer matriint, DataBuffer m, DataBuffer n,
                        INDArray a, DataBuffer lda, INDArray t,
                        DataBuffer ldt );
    DataBuffer cgeqrt3( DataBuffer matriint, DataBuffer m, DataBuffer n,
                        IComplexNumber a, DataBuffer lda,
                        IComplexNumber t, DataBuffer ldt );
    DataBuffer zgeqrt3( DataBuffer matriint, DataBuffer m, DataBuffer n,
                        IComplexNumber a, DataBuffer lda,
                        IComplexNumber t, DataBuffer ldt );

    DataBuffer stpmqrt( DataBuffer matriint, char side, char trans,
                        DataBuffer m, DataBuffer n, DataBuffer k,
                        DataBuffer l, DataBuffer nb,  INDArray v,
                        DataBuffer ldv,  INDArray t, DataBuffer ldt,
                        INDArray a, DataBuffer lda, INDArray b,
                        DataBuffer ldb );
    DataBuffer dtpmqrt( DataBuffer matriint, char side, char trans,
                        DataBuffer m, DataBuffer n, DataBuffer k,
                        DataBuffer l, DataBuffer nb,  INDArray v,
                        DataBuffer ldv,  INDArray t, DataBuffer ldt,
                        INDArray a, DataBuffer lda, INDArray b,
                        DataBuffer ldb );
    DataBuffer ctpmqrt( DataBuffer matriint, char side, char trans,
                        DataBuffer m, DataBuffer n, DataBuffer k,
                        DataBuffer l, DataBuffer nb,
                        IComplexNumber v, DataBuffer ldv,
                        IComplexNumber t, DataBuffer ldt,
                        IComplexNumber a, DataBuffer lda,
                        IComplexNumber b, DataBuffer ldb );
    DataBuffer ztpmqrt( DataBuffer matriint, char side, char trans,
                        DataBuffer m, DataBuffer n, DataBuffer k,
                        DataBuffer l, DataBuffer nb,
                        IComplexNumber v, DataBuffer ldv,
                        IComplexNumber t, DataBuffer ldt,
                        IComplexNumber a, DataBuffer lda,
                        IComplexNumber b, DataBuffer ldb );

    DataBuffer stpqrt( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer l, DataBuffer nb, INDArray a,
                       DataBuffer lda, INDArray b, DataBuffer ldb, INDArray t,
                       DataBuffer ldt );

    DataBuffer dtpqrt( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer l, DataBuffer nb, INDArray a,
                       DataBuffer lda, INDArray b, DataBuffer ldb, INDArray t,
                       DataBuffer ldt );
    DataBuffer ctpqrt( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer l, DataBuffer nb,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber t, DataBuffer ldt );
    DataBuffer ztpqrt( DataBuffer matriint, DataBuffer m, DataBuffer n,
                       DataBuffer l, DataBuffer nb,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber b, DataBuffer ldb,
                       IComplexNumber t, DataBuffer ldt );

    DataBuffer stpqrt2( DataBuffer matriint,
                        DataBuffer m, DataBuffer n, DataBuffer l,
                        INDArray a, DataBuffer lda,
                        INDArray b, DataBuffer ldb,
                        INDArray t, DataBuffer ldt );
    DataBuffer dtpqrt2( DataBuffer matriint,
                        DataBuffer m, DataBuffer n, DataBuffer l,
                        INDArray a, DataBuffer lda,
                        INDArray b, DataBuffer ldb,
                        INDArray t, DataBuffer ldt );
    DataBuffer ctpqrt2( DataBuffer matriint,
                        DataBuffer m, DataBuffer n, DataBuffer l,
                        IComplexNumber a, DataBuffer lda,
                        IComplexNumber b, DataBuffer ldb,
                        IComplexNumber t, DataBuffer ldt );
    DataBuffer ztpqrt2( DataBuffer matriint,
                        DataBuffer m, DataBuffer n, DataBuffer l,
                        IComplexNumber a, DataBuffer lda,
                        IComplexNumber b, DataBuffer ldb,
                        IComplexNumber t, DataBuffer ldt );

    DataBuffer stprfb( DataBuffer matriint, char side, char trans, char direct,
                       char storev, DataBuffer m, DataBuffer n,
                       DataBuffer k, DataBuffer l,  INDArray v,
                       DataBuffer ldv,  INDArray t, DataBuffer ldt,
                       INDArray a, DataBuffer lda, INDArray b, DataBuffer ldb );
    DataBuffer dtprfb( DataBuffer matriint, char side, char trans, char direct,
                       char storev, DataBuffer m, DataBuffer n,
                       DataBuffer k, DataBuffer l,  INDArray v,
                       DataBuffer ldv,  INDArray t, DataBuffer ldt,
                       INDArray a, DataBuffer lda, INDArray b, DataBuffer ldb );
    DataBuffer ctprfb( DataBuffer matriint, char side, char trans, char direct,
                       char storev, DataBuffer m, DataBuffer n,
                       DataBuffer k, DataBuffer l,
                       IComplexNumber v, DataBuffer ldv,
                       IComplexNumber t, DataBuffer ldt,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber b, DataBuffer ldb );
    DataBuffer ztprfb( DataBuffer matriint, char side, char trans, char direct,
                       char storev, DataBuffer m, DataBuffer n,
                       DataBuffer k, DataBuffer l,
                       IComplexNumber v, DataBuffer ldv,
                       IComplexNumber t, DataBuffer ldt,
                       IComplexNumber a, DataBuffer lda,
                       IComplexNumber b, DataBuffer ldb );

    DataBuffer sgemqrint( DataBuffer matriint, char side, char trans,
                          DataBuffer m, DataBuffer n, DataBuffer k,
                          DataBuffer nb,  INDArray v, DataBuffer ldv,
                          INDArray t, DataBuffer ldt, INDArray c,
                          DataBuffer ldc, INDArray work );
    DataBuffer dgemqrint( DataBuffer matriint, char side, char trans,
                          DataBuffer m, DataBuffer n, DataBuffer k,
                          DataBuffer nb,  INDArray v, DataBuffer ldv,
                          INDArray t, DataBuffer ldt, INDArray c,
                          DataBuffer ldc, INDArray work );
    DataBuffer cgemqrint( DataBuffer matriint, char side, char trans,
                          DataBuffer m, DataBuffer n, DataBuffer k,
                          DataBuffer nb,  IComplexNumber v,
                          DataBuffer ldv,  IComplexNumber t,
                          DataBuffer ldt, IComplexNumber c,
                          DataBuffer ldc, IComplexNumber work );
    DataBuffer zgemqrint( DataBuffer matriint, char side, char trans,
                          DataBuffer m, DataBuffer n, DataBuffer k,
                          DataBuffer nb,  IComplexNumber v,
                          DataBuffer ldv,  IComplexNumber t,
                          DataBuffer ldt, IComplexNumber c,
                          DataBuffer ldc, IComplexNumber work );

    DataBuffer sgeqrint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer nb, INDArray a, DataBuffer lda,
                         INDArray t, DataBuffer ldt, INDArray work );
    DataBuffer dgeqrint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer nb, INDArray a, DataBuffer lda,
                         INDArray t, DataBuffer ldt, INDArray work );
    DataBuffer cgeqrint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer nb, IComplexNumber a,
                         DataBuffer lda, IComplexNumber t,
                         DataBuffer ldt, IComplexNumber work );
    DataBuffer zgeqrint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer nb, IComplexNumber a,
                         DataBuffer lda, IComplexNumber t,
                         DataBuffer ldt, IComplexNumber work );

    DataBuffer sgeqrt2_work( DataBuffer matriint, DataBuffer m, DataBuffer n,
                             INDArray a, DataBuffer lda, INDArray t,
                             DataBuffer ldt );
    DataBuffer dgeqrt2_work( DataBuffer matriint, DataBuffer m, DataBuffer n,
                             INDArray a, DataBuffer lda, INDArray t,
                             DataBuffer ldt );
    DataBuffer cgeqrt2_work( DataBuffer matriint, DataBuffer m, DataBuffer n,
                             IComplexNumber a, DataBuffer lda,
                             IComplexNumber t, DataBuffer ldt );
    DataBuffer zgeqrt2_work( DataBuffer matriint, DataBuffer m, DataBuffer n,
                             IComplexNumber a, DataBuffer lda,
                             IComplexNumber t, DataBuffer ldt );

    DataBuffer sgeqrt3_work( DataBuffer matriint, DataBuffer m, DataBuffer n,
                             INDArray a, DataBuffer lda, INDArray t,
                             DataBuffer ldt );
    DataBuffer dgeqrt3_work( DataBuffer matriint, DataBuffer m, DataBuffer n,
                             INDArray a, DataBuffer lda, INDArray t,
                             DataBuffer ldt );
    DataBuffer cgeqrt3_work( DataBuffer matriint, DataBuffer m, DataBuffer n,
                             IComplexNumber a, DataBuffer lda,
                             IComplexNumber t, DataBuffer ldt );
    DataBuffer zgeqrt3_work( DataBuffer matriint, DataBuffer m, DataBuffer n,
                             IComplexNumber a, DataBuffer lda,
                             IComplexNumber t, DataBuffer ldt );

    DataBuffer stpmqrint( DataBuffer matriint, char side, char trans,
                          DataBuffer m, DataBuffer n, DataBuffer k,
                          DataBuffer l, DataBuffer nb,  INDArray v,
                          DataBuffer ldv,  INDArray t, DataBuffer ldt,
                          INDArray a, DataBuffer lda, INDArray b,
                          DataBuffer ldb, INDArray work );
    DataBuffer dtpmqrint( DataBuffer matriint, char side, char trans,
                          DataBuffer m, DataBuffer n, DataBuffer k,
                          DataBuffer l, DataBuffer nb,  INDArray v,
                          DataBuffer ldv,  INDArray t,
                          DataBuffer ldt, INDArray a, DataBuffer lda,
                          INDArray b, DataBuffer ldb, INDArray work );
    DataBuffer ctpmqrint( DataBuffer matriint, char side, char trans,
                          DataBuffer m, DataBuffer n, DataBuffer k,
                          DataBuffer l, DataBuffer nb,
                          IComplexNumber v, DataBuffer ldv,
                          IComplexNumber t, DataBuffer ldt,
                          IComplexNumber a, DataBuffer lda,
                          IComplexNumber b, DataBuffer ldb,
                          IComplexNumber work );
    DataBuffer ztpmqrint( DataBuffer matriint, char side, char trans,
                          DataBuffer m, DataBuffer n, DataBuffer k,
                          DataBuffer l, DataBuffer nb,
                          IComplexNumber v, DataBuffer ldv,
                          IComplexNumber t, DataBuffer ldt,
                          IComplexNumber a, DataBuffer lda,
                          IComplexNumber b, DataBuffer ldb,
                          IComplexNumber work );

    DataBuffer stpqrint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer l, DataBuffer nb, INDArray a,
                         DataBuffer lda, INDArray b, DataBuffer ldb,
                         INDArray t, DataBuffer ldt, INDArray work );
    DataBuffer dtpqrint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer l, DataBuffer nb, INDArray a,
                         DataBuffer lda, INDArray b, DataBuffer ldb,
                         INDArray t, DataBuffer ldt, INDArray work );
    DataBuffer ctpqrint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer l, DataBuffer nb,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber t, DataBuffer ldt,
                         IComplexNumber work );
    DataBuffer ztpqrint( DataBuffer matriint, DataBuffer m, DataBuffer n,
                         DataBuffer l, DataBuffer nb,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber t, DataBuffer ldt,
                         IComplexNumber work );

    DataBuffer stpqrt2_work( DataBuffer matriint,
                             DataBuffer m, DataBuffer n, DataBuffer l,
                             INDArray a, DataBuffer lda,
                             INDArray b, DataBuffer ldb,
                             INDArray t, DataBuffer ldt );
    DataBuffer dtpqrt2_work( DataBuffer matriint,
                             DataBuffer m, DataBuffer n, DataBuffer l,
                             INDArray a, DataBuffer lda,
                             INDArray b, DataBuffer ldb,
                             INDArray t, DataBuffer ldt );
    DataBuffer ctpqrt2_work( DataBuffer matriint,
                             DataBuffer m, DataBuffer n, DataBuffer l,
                             IComplexNumber a, DataBuffer lda,
                             IComplexNumber b, DataBuffer ldb,
                             IComplexNumber t, DataBuffer ldt );
    DataBuffer ztpqrt2_work( DataBuffer matriint,
                             DataBuffer m, DataBuffer n, DataBuffer l,
                             IComplexNumber a, DataBuffer lda,
                             IComplexNumber b, DataBuffer ldb,
                             IComplexNumber t, DataBuffer ldt );

    DataBuffer stprfint( DataBuffer matriint, char side, char trans,
                         char direct, char storev, DataBuffer m,
                         DataBuffer n, DataBuffer k, DataBuffer l,
                         INDArray v, DataBuffer ldv,  INDArray t,
                         DataBuffer ldt, INDArray a, DataBuffer lda,
                         INDArray b, DataBuffer ldb,  INDArray work,
                         DataBuffer ldwork );
    DataBuffer dtprfint( DataBuffer matriint, char side, char trans,
                         char direct, char storev, DataBuffer m,
                         DataBuffer n, DataBuffer k, DataBuffer l,
                         INDArray v, DataBuffer ldv,
                         INDArray t, DataBuffer ldt, INDArray a,
                         DataBuffer lda, INDArray b, DataBuffer ldb,
                         INDArray work, DataBuffer ldwork );
    DataBuffer ctprfint( DataBuffer matriint, char side, char trans,
                         char direct, char storev, DataBuffer m,
                         DataBuffer n, DataBuffer k, DataBuffer l,
                         IComplexNumber v, DataBuffer ldv,
                         IComplexNumber t, DataBuffer ldt,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber work, DataBuffer ldwork );
    DataBuffer ztprfint( DataBuffer matriint, char side, char trans,
                         char direct, char storev, DataBuffer m,
                         DataBuffer n, DataBuffer k, DataBuffer l,
                         IComplexNumber v, DataBuffer ldv,
                         IComplexNumber t, DataBuffer ldt,
                         IComplexNumber a, DataBuffer lda,
                         IComplexNumber b, DataBuffer ldb,
                         IComplexNumber work, DataBuffer ldwork );
    //LAPACK 3.X.X
    DataBuffer ssysint( DataBuffer matriint, char uplo, DataBuffer n,
                        DataBuffer nrhs, INDArray a, DataBuffer lda,
                        DataBuffer ipiv, INDArray b, DataBuffer ldb );
    DataBuffer dsysint( DataBuffer matriint, char uplo, DataBuffer n,
                        DataBuffer nrhs, INDArray a, DataBuffer lda,
                        DataBuffer ipiv, INDArray b, DataBuffer ldb );
    DataBuffer csysint( DataBuffer matriint, char uplo, DataBuffer n,
                        DataBuffer nrhs, IComplexNumber a,
                        DataBuffer lda, DataBuffer ipiv,
                        IComplexNumber b, DataBuffer ldb );
    DataBuffer zsysint( DataBuffer matriint, char uplo, DataBuffer n,
                        DataBuffer nrhs, IComplexNumber a,
                        DataBuffer lda, DataBuffer ipiv,
                        IComplexNumber b, DataBuffer ldb );

    DataBuffer ssytrint( DataBuffer matriint, char uplo, DataBuffer n, INDArray a,
                         DataBuffer lda, DataBuffer ipiv );
    DataBuffer dsytrint( DataBuffer matriint, char uplo, DataBuffer n, INDArray a,
                         DataBuffer lda, DataBuffer ipiv );
    DataBuffer csytrint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         DataBuffer ipiv );
    DataBuffer zsytrint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         DataBuffer ipiv );

    DataBuffer ssytrint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,  INDArray a, DataBuffer lda,
                         DataBuffer ipiv, INDArray b, DataBuffer ldb );
    DataBuffer dsytrint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,  INDArray a, DataBuffer lda,
                         DataBuffer ipiv, INDArray b, DataBuffer ldb );
    DataBuffer csytrint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,  IComplexNumber a,
                         DataBuffer lda,  DataBuffer ipiv,
                         IComplexNumber b, DataBuffer ldb );
    DataBuffer zsytrint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,  IComplexNumber a,
                         DataBuffer lda,  DataBuffer ipiv,
                         IComplexNumber b, DataBuffer ldb );

    DataBuffer chetrint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         DataBuffer ipiv );
    DataBuffer zhetrint( DataBuffer matriint, char uplo, DataBuffer n,
                         IComplexNumber a, DataBuffer lda,
                         DataBuffer ipiv );

    DataBuffer chetrint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,  IComplexNumber a,
                         DataBuffer lda,  DataBuffer ipiv,
                         IComplexNumber b, DataBuffer ldb );
    DataBuffer zhetrint( DataBuffer matriint, char uplo, DataBuffer n,
                         DataBuffer nrhs,  IComplexNumber a,
                         DataBuffer lda,  DataBuffer ipiv,
                         IComplexNumber b, DataBuffer ldb );

    DataBuffer csyr( DataBuffer matriint, char uplo, DataBuffer n,
                     IComplexNumber alpha,
                     IComplexNumber x, DataBuffer incx,
                     IComplexNumber a, DataBuffer lda );
    DataBuffer zsyr( DataBuffer matriint, char uplo, DataBuffer n,
                     IComplexNumber alpha,
                     IComplexNumber x, DataBuffer incx,
                     IComplexNumber a, DataBuffer lda );

    DataBuffer ssysint_work( DataBuffer matriint, char uplo, DataBuffer n,
                             DataBuffer nrhs, INDArray a, DataBuffer lda,
                             DataBuffer ipiv, INDArray b, DataBuffer ldb,
                             INDArray work, DataBuffer lwork );
    DataBuffer dsysint_work( DataBuffer matriint, char uplo, DataBuffer n,
                             DataBuffer nrhs, INDArray a, DataBuffer lda,
                             DataBuffer ipiv, INDArray b, DataBuffer ldb,
                             INDArray work, DataBuffer lwork );
    DataBuffer csysint_work( DataBuffer matriint, char uplo, DataBuffer n,
                             DataBuffer nrhs, IComplexNumber a,
                             DataBuffer lda, DataBuffer ipiv,
                             IComplexNumber b, DataBuffer ldb,
                             IComplexNumber work,
                             DataBuffer lwork );
    DataBuffer zsysint_work( DataBuffer matriint, char uplo, DataBuffer n,
                             DataBuffer nrhs, IComplexNumber a,
                             DataBuffer lda, DataBuffer ipiv,
                             IComplexNumber b, DataBuffer ldb,
                             IComplexNumber work,
                             DataBuffer lwork );

    DataBuffer ssytrint_work( DataBuffer matriint, char uplo, DataBuffer n,
                              INDArray a, DataBuffer lda, DataBuffer ipiv,
                              INDArray work, DataBuffer lwork );
    DataBuffer dsytrint_work( DataBuffer matriint, char uplo, DataBuffer n,
                              INDArray a, DataBuffer lda, DataBuffer ipiv,
                              INDArray work, DataBuffer lwork );
    DataBuffer csytrint_work( DataBuffer matriint, char uplo, DataBuffer n,
                              IComplexNumber a, DataBuffer lda,
                              DataBuffer ipiv, IComplexNumber work,
                              DataBuffer lwork );
    DataBuffer zsytrint_work( DataBuffer matriint, char uplo, DataBuffer n,
                              IComplexNumber a, DataBuffer lda,
                              DataBuffer ipiv, IComplexNumber work,
                              DataBuffer lwork );

    DataBuffer ssytrint_work( DataBuffer matriint, char uplo, DataBuffer n,
                              DataBuffer nrhs,  INDArray a, DataBuffer lda,
                              DataBuffer ipiv, INDArray b,
                              DataBuffer ldb );
    DataBuffer dsytrint_work( DataBuffer matriint, char uplo, DataBuffer n,
                              DataBuffer nrhs,  INDArray a,
                              DataBuffer lda,  DataBuffer ipiv,
                              INDArray b, DataBuffer ldb );
    DataBuffer csytrint_work( DataBuffer matriint, char uplo, DataBuffer n,
                              DataBuffer nrhs,  IComplexNumber a,
                              DataBuffer lda,  DataBuffer ipiv,
                              IComplexNumber b, DataBuffer ldb );
    DataBuffer zsytrint_work( DataBuffer matriint, char uplo, DataBuffer n,
                              DataBuffer nrhs,  IComplexNumber a,
                              DataBuffer lda,  DataBuffer ipiv,
                              IComplexNumber b, DataBuffer ldb );

    DataBuffer chetrint_work( DataBuffer matriint, char uplo, DataBuffer n,
                              IComplexNumber a, DataBuffer lda,
                              DataBuffer ipiv, IComplexNumber work,
                              DataBuffer lwork );
    DataBuffer zhetrint_work( DataBuffer matriint, char uplo, DataBuffer n,
                              IComplexNumber a, DataBuffer lda,
                              DataBuffer ipiv, IComplexNumber work,
                              DataBuffer lwork );

    DataBuffer chetrint_work( DataBuffer matriint, char uplo, DataBuffer n,
                              DataBuffer nrhs,  IComplexNumber a,
                              DataBuffer lda,  DataBuffer ipiv,
                              IComplexNumber b, DataBuffer ldb );
    DataBuffer zhetrint_work( DataBuffer matriint, char uplo, DataBuffer n,
                              DataBuffer nrhs,  IComplexNumber a,
                              DataBuffer lda,  DataBuffer ipiv,
                              IComplexNumber b, DataBuffer ldb );


    DataBuffer csyint( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber alpha,
                       IComplexNumber x,
                       DataBuffer incx, IComplexNumber a,
                       DataBuffer lda );
    DataBuffer zsyint( DataBuffer matriint, char uplo, DataBuffer n,
                       IComplexNumber alpha,
                       IComplexNumber x,
                       DataBuffer incx, IComplexNumber a,
                       DataBuffer lda );

    void dgetrf( DataBuffer m, DataBuffer n, INDArray a, DataBuffer lda,
                 DataBuffer ipiv, DataBuffer info );
    void cgetrf( DataBuffer m, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, DataBuffer ipiv, DataBuffer info );
    void zgetrf( DataBuffer m, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, DataBuffer ipiv, DataBuffer info );
    void sgetrf2( DataBuffer m, DataBuffer n, INDArray a, DataBuffer lda,
                  DataBuffer ipiv, DataBuffer info );
    void dgetrf2( DataBuffer m, DataBuffer n, INDArray a, DataBuffer lda,
                  DataBuffer ipiv, DataBuffer info );
    void cgetrf2( DataBuffer m, DataBuffer n, IComplexNumber a,
                  DataBuffer lda, DataBuffer ipiv, DataBuffer info );
    void zgetrf2( DataBuffer m, DataBuffer n, IComplexNumber a,
                  DataBuffer lda, DataBuffer ipiv, DataBuffer info );
    void sgbtrf( DataBuffer m, DataBuffer n, DataBuffer kl,
                 DataBuffer ku, INDArray ab, DataBuffer ldab,
                 DataBuffer ipiv, DataBuffer info );
    void dgbtrf( DataBuffer m, DataBuffer n, DataBuffer kl,
                 DataBuffer ku, INDArray ab, DataBuffer ldab,
                 DataBuffer ipiv, DataBuffer info );
    void cgbtrf( DataBuffer m, DataBuffer n, DataBuffer kl,
                 DataBuffer ku, IComplexNumber ab, DataBuffer ldab,
                 DataBuffer ipiv, DataBuffer info );
    void zgbtrf( DataBuffer m, DataBuffer n, DataBuffer kl,
                 DataBuffer ku, IComplexNumber ab, DataBuffer ldab,
                 DataBuffer ipiv, DataBuffer info );
    void sgttrf( DataBuffer n, INDArray dl, INDArray d, INDArray du, INDArray du2,
                 DataBuffer ipiv, DataBuffer info );
    void dgttrf( DataBuffer n, INDArray dl, INDArray d, INDArray du,
                 INDArray du2, DataBuffer ipiv, DataBuffer info );
    void cgttrf( DataBuffer n, IComplexNumber dl,
                 IComplexNumber d, IComplexNumber du,
                 IComplexNumber du2, DataBuffer ipiv,
                 DataBuffer info );
    void zgttrf( DataBuffer n, IComplexNumber dl,
                 IComplexNumber d, IComplexNumber du,
                 IComplexNumber du2, DataBuffer ipiv,
                 DataBuffer info );
    void spotrf2( String uplo, DataBuffer n, INDArray a, DataBuffer lda,
                  DataBuffer info );
    void dpotrf2( String uplo, DataBuffer n, INDArray a, DataBuffer lda,
                  DataBuffer info );
    void cpotrf2( String uplo, DataBuffer n, IComplexNumber a,
                  DataBuffer lda, DataBuffer info );
    void zpotrf2( String uplo, DataBuffer n, IComplexNumber a,
                  DataBuffer lda, DataBuffer info );
    void spotrf( String uplo, DataBuffer n, INDArray a, DataBuffer lda,
                 DataBuffer info );
    void dpotrf( String uplo, DataBuffer n, INDArray a, DataBuffer lda,
                 DataBuffer info );
    void cpotrf( String uplo, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, DataBuffer info );
    void zpotrf( String uplo, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, DataBuffer info );
    void dpstrf( String uplo, DataBuffer n, INDArray a, DataBuffer lda,
                 DataBuffer piv, DataBuffer rank, INDArray tol,
                 INDArray work, DataBuffer info );
    void spstrf( String uplo, DataBuffer n, INDArray a, DataBuffer lda,
                 DataBuffer piv, DataBuffer rank, INDArray tol, INDArray work,
                 DataBuffer info );
    void zpstrf( String uplo, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, DataBuffer piv, DataBuffer rank,
                 INDArray tol, INDArray work, DataBuffer info );
    void cpstrf( String uplo, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, DataBuffer piv, DataBuffer rank,
                 INDArray tol, INDArray work, DataBuffer info );
    void dpftrf( String transr, String uplo, DataBuffer n, INDArray a,
                 DataBuffer info );
    void spftrf( String transr, String uplo, DataBuffer n, INDArray a,
                 DataBuffer info );
    void zpftrf( String transr, String uplo, DataBuffer n,
                 IComplexNumber a, DataBuffer info );
    void cpftrf( String transr, String uplo, DataBuffer n,
                 IComplexNumber a, DataBuffer info );
    void spptrf( String uplo, DataBuffer n, INDArray ap, DataBuffer info );
    void dpptrf( String uplo, DataBuffer n, INDArray ap, DataBuffer info );
    void cpptrf( String uplo, DataBuffer n, IComplexNumber ap,
                 DataBuffer info );
    void zpptrf( String uplo, DataBuffer n, IComplexNumber ap,
                 DataBuffer info );
    void spbtrf( String uplo, DataBuffer n, DataBuffer kd, INDArray ab,
                 DataBuffer ldab, DataBuffer info );
    void dpbtrf( String uplo, DataBuffer n, DataBuffer kd, INDArray ab,
                 DataBuffer ldab, DataBuffer info );
    void cpbtrf( String uplo, DataBuffer n, DataBuffer kd,
                 IComplexNumber ab, DataBuffer ldab,
                 DataBuffer info );
    void zpbtrf( String uplo, DataBuffer n, DataBuffer kd,
                 IComplexNumber ab, DataBuffer ldab,
                 DataBuffer info );
    void spttrf( DataBuffer n, INDArray d, INDArray e, DataBuffer info );
    void dpttrf( DataBuffer n, INDArray d, INDArray e, DataBuffer info );
    void cpttrf( DataBuffer n, INDArray d, IComplexNumber e,
                 DataBuffer info );
    void zpttrf( DataBuffer n, INDArray d, IComplexNumber e,
                 DataBuffer info );
    void ssytrf( String uplo, DataBuffer n, INDArray a, DataBuffer lda,
                 DataBuffer ipiv, INDArray work, DataBuffer lwork,
                 DataBuffer info );
    void dsytrf( String uplo, DataBuffer n, INDArray a, DataBuffer lda,
                 DataBuffer ipiv, INDArray work, DataBuffer lwork,
                 DataBuffer info );
    void csytrf( String uplo, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, DataBuffer ipiv,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void zsytrf( String uplo, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, DataBuffer ipiv,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void chetrf( String uplo, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, DataBuffer ipiv,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void zhetrf( String uplo, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, DataBuffer ipiv,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void ssptrf( String uplo, DataBuffer n, INDArray ap, DataBuffer ipiv,
                 DataBuffer info );
    void dsptrf( String uplo, DataBuffer n, INDArray ap, DataBuffer ipiv,
                 DataBuffer info );
    void csptrf( String uplo, DataBuffer n, IComplexNumber ap,
                 DataBuffer ipiv, DataBuffer info );
    void zsptrf( String uplo, DataBuffer n, IComplexNumber ap,
                 DataBuffer ipiv, DataBuffer info );
    void chptrf( String uplo, DataBuffer n, IComplexNumber ap,
                 DataBuffer ipiv, DataBuffer info );
    void zhptrf( String uplo, DataBuffer n, IComplexNumber ap,
                 DataBuffer ipiv, DataBuffer info );
    void sgetrs( String trans, DataBuffer n, DataBuffer nrhs,
                 INDArray a, DataBuffer lda,  DataBuffer ipiv,
                 INDArray b, DataBuffer ldb, DataBuffer info );
    void dgetrs( String trans, DataBuffer n, DataBuffer nrhs,
                 INDArray a, DataBuffer lda,  DataBuffer ipiv,
                 INDArray b, DataBuffer ldb, DataBuffer info );
    void cgetrs( String trans, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber a, DataBuffer lda,
                 DataBuffer ipiv, IComplexNumber b,
                 DataBuffer ldb, DataBuffer info );
    void zgetrs( String trans, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber a, DataBuffer lda,
                 DataBuffer ipiv, IComplexNumber b,
                 DataBuffer ldb, DataBuffer info );
    void sgbtrs( String trans, DataBuffer n, DataBuffer kl, DataBuffer ku,
                 DataBuffer nrhs,  INDArray ab, DataBuffer ldab,
                 DataBuffer ipiv, INDArray b, DataBuffer ldb,
                 DataBuffer info );
    void dgbtrs( String trans, DataBuffer n, DataBuffer kl, DataBuffer ku,
                 DataBuffer nrhs,  INDArray ab, DataBuffer ldab,
                 DataBuffer ipiv, INDArray b, DataBuffer ldb,
                 DataBuffer info );
    void cgbtrs( String trans, DataBuffer n, DataBuffer kl, DataBuffer ku,
                 DataBuffer nrhs,  IComplexNumber ab,
                 DataBuffer ldab,  DataBuffer ipiv,
                 IComplexNumber b, DataBuffer ldb,
                 DataBuffer info );
    void zgbtrs( String trans, DataBuffer n, DataBuffer kl, DataBuffer ku,
                 DataBuffer nrhs,  IComplexNumber ab,
                 DataBuffer ldab,  DataBuffer ipiv,
                 IComplexNumber b, DataBuffer ldb,
                 DataBuffer info );
    void sgttrs( String trans, DataBuffer n, DataBuffer nrhs,
                 INDArray dl,  INDArray d,  INDArray du,
                 INDArray du2,  DataBuffer ipiv, INDArray b,
                 DataBuffer ldb, DataBuffer info );
    void dgttrs( String trans, DataBuffer n, DataBuffer nrhs,
                 INDArray dl,  INDArray d,  INDArray du,
                 INDArray du2,  DataBuffer ipiv, INDArray b,
                 DataBuffer ldb, DataBuffer info );
    void cgttrs( String trans, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber dl,
                 IComplexNumber d,
                 IComplexNumber du,
                 IComplexNumber du2,  DataBuffer ipiv,
                 IComplexNumber b, DataBuffer ldb,
                 DataBuffer info );
    void zgttrs( String trans, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber dl,
                 IComplexNumber d,
                 IComplexNumber du,
                 IComplexNumber du2,  DataBuffer ipiv,
                 IComplexNumber b, DataBuffer ldb,
                 DataBuffer info );
    void spotrs( String uplo, DataBuffer n, DataBuffer nrhs,  INDArray a,
                 DataBuffer lda, INDArray b, DataBuffer ldb,
                 DataBuffer info );
    void dpotrs( String uplo, DataBuffer n, DataBuffer nrhs,
                 INDArray a, DataBuffer lda, INDArray b,
                 DataBuffer ldb, DataBuffer info );
    void cpotrs( String uplo, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb,
                 DataBuffer info );
    void zpotrs( String uplo, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb,
                 DataBuffer info );
    void dpftrs( String transr, String uplo, DataBuffer n, DataBuffer nrhs,
                 INDArray a, INDArray b, DataBuffer ldb,
                 DataBuffer info );
    void spftrs( String transr, String uplo, DataBuffer n, DataBuffer nrhs,
                 INDArray a, INDArray b, DataBuffer ldb,
                 DataBuffer info );
    void zpftrs( String transr, String uplo, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber a, IComplexNumber b,
                 DataBuffer ldb, DataBuffer info );
    void cpftrs( String transr, String uplo, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber a, IComplexNumber b,
                 DataBuffer ldb, DataBuffer info );
    void spptrs( String uplo, DataBuffer n, DataBuffer nrhs,
                 INDArray ap, INDArray b, DataBuffer ldb,
                 DataBuffer info );
    void dpptrs( String uplo, DataBuffer n, DataBuffer nrhs,
                 INDArray ap, INDArray b, DataBuffer ldb,
                 DataBuffer info );
    void cpptrs( String uplo, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber ap, IComplexNumber b,
                 DataBuffer ldb, DataBuffer info );
    void zpptrs( String uplo, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber ap, IComplexNumber b,
                 DataBuffer ldb, DataBuffer info );
    void spbtrs( String uplo, DataBuffer n, DataBuffer kd, DataBuffer nrhs,
                 INDArray ab, DataBuffer ldab, INDArray b,
                 DataBuffer ldb, DataBuffer info );
    void dpbtrs( String uplo, DataBuffer n, DataBuffer kd, DataBuffer nrhs,
                 INDArray ab, DataBuffer ldab, INDArray b,
                 DataBuffer ldb, DataBuffer info );
    void cpbtrs( String uplo, DataBuffer n, DataBuffer kd, DataBuffer nrhs,
                 IComplexNumber ab, DataBuffer ldab,
                 IComplexNumber b, DataBuffer ldb,
                 DataBuffer info );
    void zpbtrs( String uplo, DataBuffer n, DataBuffer kd, DataBuffer nrhs,
                 IComplexNumber ab, DataBuffer ldab,
                 IComplexNumber b, DataBuffer ldb,
                 DataBuffer info );
    void spttrs( DataBuffer n, DataBuffer nrhs,  INDArray d,
                 INDArray e, INDArray b, DataBuffer ldb,
                 DataBuffer info );
    void dpttrs( DataBuffer n, DataBuffer nrhs,  INDArray d,
                 INDArray e, INDArray b, DataBuffer ldb,
                 DataBuffer info );
    void cpttrs( String uplo, DataBuffer n, DataBuffer nrhs,  INDArray d,
                 IComplexNumber e, IComplexNumber b,
                 DataBuffer ldb, DataBuffer info );
    void zpttrs( String uplo, DataBuffer n, DataBuffer nrhs,
                 INDArray d,  IComplexNumber e,
                 IComplexNumber b, DataBuffer ldb,
                 DataBuffer info );
    void ssytrs( String uplo, DataBuffer n, DataBuffer nrhs,  INDArray a,
                 DataBuffer lda,  DataBuffer ipiv, INDArray b,
                 DataBuffer ldb, DataBuffer info );
    void dsytrs( String uplo, DataBuffer n, DataBuffer nrhs,
                 INDArray a, DataBuffer lda,  DataBuffer ipiv,
                 INDArray b, DataBuffer ldb, DataBuffer info );
    void csytrs( String uplo, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber a, DataBuffer lda,
                 DataBuffer ipiv, IComplexNumber b,
                 DataBuffer ldb, DataBuffer info );
    void zsytrs( String uplo, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber a, DataBuffer lda,
                 DataBuffer ipiv, IComplexNumber b,
                 DataBuffer ldb, DataBuffer info );
    void chetrs( String uplo, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber a, DataBuffer lda,
                 DataBuffer ipiv, IComplexNumber b,
                 DataBuffer ldb, DataBuffer info );
    void zhetrs( String uplo, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber a, DataBuffer lda,
                 DataBuffer ipiv, IComplexNumber b,
                 DataBuffer ldb, DataBuffer info );
    void ssptrs( String uplo, DataBuffer n, DataBuffer nrhs,
                 INDArray ap,  DataBuffer ipiv, INDArray b,
                 DataBuffer ldb, DataBuffer info );
    void dsptrs( String uplo, DataBuffer n, DataBuffer nrhs,
                 INDArray ap,  DataBuffer ipiv, INDArray b,
                 DataBuffer ldb, DataBuffer info );
    void csptrs( String uplo, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber ap,  DataBuffer ipiv,
                 IComplexNumber b, DataBuffer ldb,
                 DataBuffer info );
    void zsptrs( String uplo, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber ap,  DataBuffer ipiv,
                 IComplexNumber b, DataBuffer ldb,
                 DataBuffer info );
    void chptrs( String uplo, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber ap,  DataBuffer ipiv,
                 IComplexNumber b, DataBuffer ldb,
                 DataBuffer info );
    void zhptrs( String uplo, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber ap,  DataBuffer ipiv,
                 IComplexNumber b, DataBuffer ldb,
                 DataBuffer info );
    void strtrs( String uplo, String trans, String diag, DataBuffer n,
                 DataBuffer nrhs,  INDArray a, DataBuffer lda, INDArray b,
                 DataBuffer ldb, DataBuffer info );
    void dtrtrs( String uplo, String trans, String diag, DataBuffer n,
                 DataBuffer nrhs,  INDArray a, DataBuffer lda,
                 INDArray b, DataBuffer ldb, DataBuffer info );
    void ctrtrs( String uplo, String trans, String diag, DataBuffer n,
                 DataBuffer nrhs,  IComplexNumber a,
                 DataBuffer lda, IComplexNumber b, DataBuffer ldb,
                 DataBuffer info );
    void ztrtrs( String uplo, String trans, String diag, DataBuffer n,
                 DataBuffer nrhs,  IComplexNumber a,
                 DataBuffer lda, IComplexNumber b, DataBuffer ldb,
                 DataBuffer info );
    void stptrs( String uplo, String trans, String diag, DataBuffer n,
                 DataBuffer nrhs,  INDArray ap, INDArray b,
                 DataBuffer ldb, DataBuffer info );
    void dtptrs( String uplo, String trans, String diag, DataBuffer n,
                 DataBuffer nrhs,  INDArray ap, INDArray b,
                 DataBuffer ldb, DataBuffer info );
    void ctptrs( String uplo, String trans, String diag, DataBuffer n,
                 DataBuffer nrhs,  IComplexNumber ap,
                 IComplexNumber b, DataBuffer ldb,
                 DataBuffer info );
    void ztptrs( String uplo, String trans, String diag, DataBuffer n,
                 DataBuffer nrhs,  IComplexNumber ap,
                 IComplexNumber b, DataBuffer ldb,
                 DataBuffer info );
    void stbtrs( String uplo, String trans, String diag, DataBuffer n,
                 DataBuffer kd, DataBuffer nrhs,  INDArray ab,
                 DataBuffer ldab, INDArray b, DataBuffer ldb,
                 DataBuffer info );
    void dtbtrs( String uplo, String trans, String diag, DataBuffer n,
                 DataBuffer kd, DataBuffer nrhs,  INDArray ab,
                 DataBuffer ldab, INDArray b, DataBuffer ldb,
                 DataBuffer info );
    void ctbtrs( String uplo, String trans, String diag, DataBuffer n,
                 DataBuffer kd, DataBuffer nrhs,
                 IComplexNumber ab, DataBuffer ldab,
                 IComplexNumber b, DataBuffer ldb,
                 DataBuffer info );
    void ztbtrs( String uplo, String trans, String diag, DataBuffer n,
                 DataBuffer kd, DataBuffer nrhs,
                 IComplexNumber ab, DataBuffer ldab,
                 IComplexNumber b, DataBuffer ldb,
                 DataBuffer info );
    void sgecon( String norm, DataBuffer n,  INDArray a, DataBuffer lda,
                 INDArray anorm, INDArray rcond, INDArray work, DataBuffer iwork,
                 DataBuffer info );
    void dgecon( String norm, DataBuffer n,  INDArray a, DataBuffer lda,
                 INDArray anorm, INDArray rcond, INDArray work,
                 DataBuffer iwork, DataBuffer info );
    void cgecon( String norm, DataBuffer n,  IComplexNumber a,
                 DataBuffer lda, INDArray anorm, INDArray rcond,
                 IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void zgecon( String norm, DataBuffer n,  IComplexNumber a,
                 DataBuffer lda, INDArray anorm, INDArray rcond,
                 IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void sgbcon( String norm, DataBuffer n, DataBuffer kl, DataBuffer ku,
                 INDArray ab, DataBuffer ldab,  DataBuffer ipiv,
                 INDArray anorm, INDArray rcond, INDArray work, DataBuffer iwork,
                 DataBuffer info );
    void dgbcon( String norm, DataBuffer n, DataBuffer kl, DataBuffer ku,
                 INDArray ab, DataBuffer ldab,  DataBuffer ipiv,
                 INDArray anorm, INDArray rcond, INDArray work,
                 DataBuffer iwork, DataBuffer info );
    void cgbcon( String norm, DataBuffer n, DataBuffer kl, DataBuffer ku,
                 IComplexNumber ab, DataBuffer ldab,
                 DataBuffer ipiv, INDArray anorm, INDArray rcond,
                 IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void zgbcon( String norm, DataBuffer n, DataBuffer kl, DataBuffer ku,
                 IComplexNumber ab, DataBuffer ldab,
                 DataBuffer ipiv, INDArray anorm, INDArray rcond,
                 IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void sgtcon( String norm, DataBuffer n,  INDArray dl,  INDArray d,
                 INDArray du,  INDArray du2,  DataBuffer ipiv,
                 INDArray anorm, INDArray rcond, INDArray work, DataBuffer iwork,
                 DataBuffer info );
    void dgtcon( String norm, DataBuffer n,  INDArray dl,
                 INDArray d,  INDArray du,  INDArray du2,
                 DataBuffer ipiv, INDArray anorm, INDArray rcond,
                 INDArray work, DataBuffer iwork, DataBuffer info );
    void cgtcon( String norm, DataBuffer n,  IComplexNumber dl,
                 IComplexNumber d,
                 IComplexNumber du,
                 IComplexNumber du2,  DataBuffer ipiv,
                 INDArray anorm, INDArray rcond, IComplexNumber work,
                 DataBuffer info );
    void zgtcon( String norm, DataBuffer n,  IComplexNumber dl,
                 IComplexNumber d,
                 IComplexNumber du,
                 IComplexNumber du2,  DataBuffer ipiv,
                 INDArray anorm, INDArray rcond, IComplexNumber work,
                 DataBuffer info );
    void spocon( String uplo, DataBuffer n,  INDArray a, DataBuffer lda,
                 INDArray anorm, INDArray rcond, INDArray work, DataBuffer iwork,
                 DataBuffer info );
    void dpocon( String uplo, DataBuffer n,  INDArray a, DataBuffer lda,
                 INDArray anorm, INDArray rcond, INDArray work,
                 DataBuffer iwork, DataBuffer info );
    void cpocon( String uplo, DataBuffer n,  IComplexNumber a,
                 DataBuffer lda, INDArray anorm, INDArray rcond,
                 IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void zpocon( String uplo, DataBuffer n,  IComplexNumber a,
                 DataBuffer lda, INDArray anorm, INDArray rcond,
                 IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void sppcon( String uplo, DataBuffer n,  INDArray ap, INDArray anorm,
                 INDArray rcond, INDArray work, DataBuffer iwork,
                 DataBuffer info );
    void dppcon( String uplo, DataBuffer n,  INDArray ap, INDArray anorm,
                 INDArray rcond, INDArray work, DataBuffer iwork,
                 DataBuffer info );
    void cppcon( String uplo, DataBuffer n,  IComplexNumber ap,
                 INDArray anorm, INDArray rcond, IComplexNumber work,
                 INDArray rwork, DataBuffer info );
    void zppcon( String uplo, DataBuffer n,  IComplexNumber ap,
                 INDArray anorm, INDArray rcond, IComplexNumber work,
                 INDArray rwork, DataBuffer info );
    void spbcon( String uplo, DataBuffer n, DataBuffer kd,  INDArray ab,
                 DataBuffer ldab, INDArray anorm, INDArray rcond, INDArray work,
                 DataBuffer iwork, DataBuffer info );
    void dpbcon( String uplo, DataBuffer n, DataBuffer kd,  INDArray ab,
                 DataBuffer ldab, INDArray anorm, INDArray rcond,
                 INDArray work, DataBuffer iwork, DataBuffer info );
    void cpbcon( String uplo, DataBuffer n, DataBuffer kd,
                 IComplexNumber ab, DataBuffer ldab,
                 INDArray anorm, INDArray rcond, IComplexNumber work,
                 INDArray rwork, DataBuffer info );
    void zpbcon( String uplo, DataBuffer n, DataBuffer kd,
                 IComplexNumber ab, DataBuffer ldab,
                 INDArray anorm, INDArray rcond, IComplexNumber work,
                 INDArray rwork, DataBuffer info );
    void sptcon( DataBuffer n,  INDArray d,  INDArray e, INDArray anorm,
                 INDArray rcond, INDArray work, DataBuffer info );
    void dptcon( DataBuffer n,  INDArray d,  INDArray e,
                 INDArray anorm, INDArray rcond, INDArray work,
                 DataBuffer info );
    void cptcon( DataBuffer n,  INDArray d,
                 IComplexNumber e, INDArray anorm, INDArray rcond,
                 INDArray work, DataBuffer info );
    void zptcon( DataBuffer n,  INDArray d,
                 IComplexNumber e, INDArray anorm,
                 INDArray rcond, INDArray work, DataBuffer info );
    void ssycon( String uplo, DataBuffer n,  INDArray a, DataBuffer lda,
                 DataBuffer ipiv, INDArray anorm, INDArray rcond,
                 INDArray work, DataBuffer iwork, DataBuffer info );
    void dsycon( String uplo, DataBuffer n,  INDArray a, DataBuffer lda,
                 DataBuffer ipiv, INDArray anorm, INDArray rcond,
                 INDArray work, DataBuffer iwork, DataBuffer info );
    void csycon( String uplo, DataBuffer n,  IComplexNumber a,
                 DataBuffer lda,  DataBuffer ipiv, INDArray anorm,
                 INDArray rcond, IComplexNumber work,
                 DataBuffer info );
    void zsycon( String uplo, DataBuffer n,  IComplexNumber a,
                 DataBuffer lda,  DataBuffer ipiv, INDArray anorm,
                 INDArray rcond, IComplexNumber work,
                 DataBuffer info );
    void checon( String uplo, DataBuffer n,  IComplexNumber a,
                 DataBuffer lda,  DataBuffer ipiv, INDArray anorm,
                 INDArray rcond, IComplexNumber work,
                 DataBuffer info );
    void zhecon( String uplo, DataBuffer n,  IComplexNumber a,
                 DataBuffer lda,  DataBuffer ipiv, INDArray anorm,
                 INDArray rcond, IComplexNumber work,
                 DataBuffer info );
    void sspcon( String uplo, DataBuffer n,  INDArray ap,
                 DataBuffer ipiv, INDArray anorm, INDArray rcond,
                 INDArray work, DataBuffer iwork, DataBuffer info );
    void dspcon( String uplo, DataBuffer n,  INDArray ap,
                 DataBuffer ipiv, INDArray anorm, INDArray rcond,
                 INDArray work, DataBuffer iwork, DataBuffer info );
    void cspcon( String uplo, DataBuffer n,  IComplexNumber ap,
                 DataBuffer ipiv, INDArray anorm, INDArray rcond,
                 IComplexNumber work, DataBuffer info );
    void zspcon( String uplo, DataBuffer n,  IComplexNumber ap,
                 DataBuffer ipiv, INDArray anorm, INDArray rcond,
                 IComplexNumber work, DataBuffer info );
    void chpcon( String uplo, DataBuffer n,  IComplexNumber ap,
                 DataBuffer ipiv, INDArray anorm, INDArray rcond,
                 IComplexNumber work, DataBuffer info );
    void zhpcon( String uplo, DataBuffer n,  IComplexNumber ap,
                 DataBuffer ipiv, INDArray anorm, INDArray rcond,
                 IComplexNumber work, DataBuffer info );
    void strcon( String norm, String uplo, String diag, DataBuffer n,
                 INDArray a, DataBuffer lda, INDArray rcond, INDArray work,
                 DataBuffer iwork, DataBuffer info );
    void dtrcon( String norm, String uplo, String diag, DataBuffer n,
                 INDArray a, DataBuffer lda, INDArray rcond,
                 INDArray work, DataBuffer iwork, DataBuffer info );
    void ctrcon( String norm, String uplo, String diag, DataBuffer n,
                 IComplexNumber a, DataBuffer lda,
                 INDArray rcond, IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void ztrcon( String norm, String uplo, String diag, DataBuffer n,
                 IComplexNumber a, DataBuffer lda,
                 INDArray rcond, IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void stpcon( String norm, String uplo, String diag, DataBuffer n,
                 INDArray ap, INDArray rcond, INDArray work,
                 DataBuffer iwork, DataBuffer info );
    void dtpcon( String norm, String uplo, String diag, DataBuffer n,
                 INDArray ap, INDArray rcond, INDArray work,
                 DataBuffer iwork, DataBuffer info );
    void ctpcon( String norm, String uplo, String diag, DataBuffer n,
                 IComplexNumber ap, INDArray rcond,
                 IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void ztpcon( String norm, String uplo, String diag, DataBuffer n,
                 IComplexNumber ap, INDArray rcond,
                 IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void stbcon( String norm, String uplo, String diag, DataBuffer n,
                 DataBuffer kd,  INDArray ab, DataBuffer ldab,
                 INDArray rcond, INDArray work, DataBuffer iwork,
                 DataBuffer info );
    void dtbcon( String norm, String uplo, String diag, DataBuffer n,
                 DataBuffer kd,  INDArray ab, DataBuffer ldab,
                 INDArray rcond, INDArray work, DataBuffer iwork,
                 DataBuffer info );
    void ctbcon( String norm, String uplo, String diag, DataBuffer n,
                 DataBuffer kd,  IComplexNumber ab,
                 DataBuffer ldab, INDArray rcond, IComplexNumber work,
                 INDArray rwork, DataBuffer info );
    void ztbcon( String norm, String uplo, String diag, DataBuffer n,
                 DataBuffer kd,  IComplexNumber ab,
                 DataBuffer ldab, INDArray rcond,
                 IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void sgerfs( String trans, DataBuffer n, DataBuffer nrhs,
                 INDArray a, DataBuffer lda,  INDArray af,
                 DataBuffer ldaf,  DataBuffer ipiv,  INDArray b,
                 DataBuffer ldb, INDArray x, DataBuffer ldx, INDArray ferr,
                 INDArray berr, INDArray work, DataBuffer iwork,
                 DataBuffer info );
    void dgerfs( String trans, DataBuffer n, DataBuffer nrhs,
                 INDArray a, DataBuffer lda,  INDArray af,
                 DataBuffer ldaf,  DataBuffer ipiv,  INDArray b,
                 DataBuffer ldb, INDArray x, DataBuffer ldx, INDArray ferr,
                 INDArray berr, INDArray work, DataBuffer iwork,
                 DataBuffer info );
    void cgerfs( String trans, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber af, DataBuffer ldaf,
                 DataBuffer ipiv,  IComplexNumber b,
                 DataBuffer ldb, IComplexNumber x, DataBuffer ldx,
                 INDArray ferr, INDArray berr, IComplexNumber work,
                 INDArray rwork, DataBuffer info );
    void zgerfs( String trans, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber af, DataBuffer ldaf,
                 DataBuffer ipiv,  IComplexNumber b,
                 DataBuffer ldb, IComplexNumber x, DataBuffer ldx,
                 INDArray ferr, INDArray berr, IComplexNumber work,
                 INDArray rwork, DataBuffer info );
    void dgerfsx( String trans, String equed, DataBuffer n, DataBuffer nrhs,
                  INDArray a, DataBuffer lda,  INDArray af,
                  DataBuffer ldaf,  DataBuffer ipiv,  INDArray r,
                  INDArray c,  INDArray b, DataBuffer ldb,
                  INDArray x, DataBuffer ldx, INDArray rcond, INDArray berr,
                  DataBuffer int_bnds, INDArray erint_norm,
                  INDArray erint_comp, DataBuffer nparams, INDArray params,
                  INDArray work, DataBuffer iwork, DataBuffer info );
    void sgerfsx( String trans, String equed, DataBuffer n, DataBuffer nrhs,
                  INDArray a, DataBuffer lda,  INDArray af,
                  DataBuffer ldaf,  DataBuffer ipiv,  INDArray r,
                  INDArray c,  INDArray b, DataBuffer ldb, INDArray x,
                  DataBuffer ldx, INDArray rcond, INDArray berr,
                  DataBuffer int_bnds, INDArray erint_norm,
                  INDArray erint_comp, DataBuffer nparams, INDArray params,
                  INDArray work, DataBuffer iwork, DataBuffer info );
    void zgerfsx( String trans, String equed, DataBuffer n, DataBuffer nrhs,
                  IComplexNumber a, DataBuffer lda,
                  IComplexNumber af, DataBuffer ldaf,
                  DataBuffer ipiv,  INDArray r,  INDArray c,
                  IComplexNumber b, DataBuffer ldb,
                  IComplexNumber x, DataBuffer ldx, INDArray rcond,
                  INDArray berr, DataBuffer int_bnds,
                  INDArray erint_norm, INDArray erint_comp,
                  DataBuffer nparams, INDArray params,
                  IComplexNumber work, INDArray rwork,
                  DataBuffer info );
    void cgerfsx( String trans, String equed, DataBuffer n, DataBuffer nrhs,
                  IComplexNumber a, DataBuffer lda,
                  IComplexNumber af, DataBuffer ldaf,
                  DataBuffer ipiv,  INDArray r,  INDArray c,
                  IComplexNumber b, DataBuffer ldb,
                  IComplexNumber x, DataBuffer ldx, INDArray rcond,
                  INDArray berr, DataBuffer int_bnds, INDArray erint_norm,
                  INDArray erint_comp, DataBuffer nparams, INDArray params,
                  IComplexNumber work, INDArray rwork,
                  DataBuffer info );
    void sgbrfs( String trans, DataBuffer n, DataBuffer kl, DataBuffer ku,
                 DataBuffer nrhs,  INDArray ab, DataBuffer ldab,
                 INDArray afb, DataBuffer ldafb,  DataBuffer ipiv,
                 INDArray b, DataBuffer ldb, INDArray x, DataBuffer ldx,
                 INDArray ferr, INDArray berr, INDArray work, DataBuffer iwork,
                 DataBuffer info );
    void dgbrfs( String trans, DataBuffer n, DataBuffer kl, DataBuffer ku,
                 DataBuffer nrhs,  INDArray ab, DataBuffer ldab,
                 INDArray afb, DataBuffer ldafb,
                 DataBuffer ipiv,  INDArray b, DataBuffer ldb,
                 INDArray x, DataBuffer ldx, INDArray ferr, INDArray berr,
                 INDArray work, DataBuffer iwork, DataBuffer info );
    void cgbrfs( String trans, DataBuffer n, DataBuffer kl, DataBuffer ku,
                 DataBuffer nrhs,  IComplexNumber ab,
                 DataBuffer ldab,  IComplexNumber afb,
                 DataBuffer ldafb,  DataBuffer ipiv,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber x, DataBuffer ldx, INDArray ferr,
                 INDArray berr, IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void zgbrfs( String trans, DataBuffer n, DataBuffer kl, DataBuffer ku,
                 DataBuffer nrhs,  IComplexNumber ab,
                 DataBuffer ldab,  IComplexNumber afb,
                 DataBuffer ldafb,  DataBuffer ipiv,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber x, DataBuffer ldx, INDArray ferr,
                 INDArray berr, IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void dgbrfsx( String trans, String equed, DataBuffer n, DataBuffer kl,
                  DataBuffer ku, DataBuffer nrhs,  INDArray ab,
                  DataBuffer ldab,  INDArray afb, DataBuffer ldafb,
                  DataBuffer ipiv,  INDArray r,  INDArray c,
                  INDArray b, DataBuffer ldb, INDArray x,
                  DataBuffer ldx, INDArray rcond, INDArray berr,
                  DataBuffer int_bnds, INDArray erint_norm,
                  INDArray erint_comp, DataBuffer nparams, INDArray params,
                  INDArray work, DataBuffer iwork, DataBuffer info );
    void sgbrfsx( String trans, String equed, DataBuffer n, DataBuffer kl,
                  DataBuffer ku, DataBuffer nrhs,  INDArray ab,
                  DataBuffer ldab,  INDArray afb, DataBuffer ldafb,
                  DataBuffer ipiv,  INDArray r,  INDArray c,
                  INDArray b, DataBuffer ldb, INDArray x, DataBuffer ldx,
                  INDArray rcond, INDArray berr, DataBuffer int_bnds,
                  INDArray erint_norm, INDArray erint_comp,
                  DataBuffer nparams, INDArray params, INDArray work,
                  DataBuffer iwork, DataBuffer info );
    void zgbrfsx( String trans, String equed, DataBuffer n, DataBuffer kl,
                  DataBuffer ku, DataBuffer nrhs,
                  IComplexNumber ab, DataBuffer ldab,
                  IComplexNumber afb, DataBuffer ldafb,
                  DataBuffer ipiv,  INDArray r,  INDArray c,
                  IComplexNumber b, DataBuffer ldb,
                  IComplexNumber x, DataBuffer ldx, INDArray rcond,
                  INDArray berr, DataBuffer int_bnds,
                  INDArray erint_norm, INDArray erint_comp,
                  DataBuffer nparams, INDArray params,
                  IComplexNumber work, INDArray rwork,
                  DataBuffer info );
    void cgbrfsx( String trans, String equed, DataBuffer n, DataBuffer kl,
                  DataBuffer ku, DataBuffer nrhs,
                  IComplexNumber ab, DataBuffer ldab,
                  IComplexNumber afb, DataBuffer ldafb,
                  DataBuffer ipiv,  INDArray r,  INDArray c,
                  IComplexNumber b, DataBuffer ldb,
                  IComplexNumber x, DataBuffer ldx, INDArray rcond,
                  INDArray berr, DataBuffer int_bnds, INDArray erint_norm,
                  INDArray erint_comp, DataBuffer nparams, INDArray params,
                  IComplexNumber work, INDArray rwork,
                  DataBuffer info );
    void sgtrfs( String trans, DataBuffer n, DataBuffer nrhs,
                 INDArray dl,  INDArray d,  INDArray du,
                 INDArray dlf,  INDArray df,  INDArray duf,
                 INDArray du2,  DataBuffer ipiv,  INDArray b,
                 DataBuffer ldb, INDArray x, DataBuffer ldx, INDArray ferr,
                 INDArray berr, INDArray work, DataBuffer iwork,
                 DataBuffer info );
    void dgtrfs( String trans, DataBuffer n, DataBuffer nrhs,
                 INDArray dl,  INDArray d,  INDArray du,
                 INDArray dlf,  INDArray df,  INDArray duf,
                 INDArray du2,  DataBuffer ipiv,  INDArray b,
                 DataBuffer ldb, INDArray x, DataBuffer ldx, INDArray ferr,
                 INDArray berr, INDArray work, DataBuffer iwork,
                 DataBuffer info );
    void cgtrfs( String trans, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber dl,
                 IComplexNumber d,
                 IComplexNumber du,
                 IComplexNumber dlf,
                 IComplexNumber df,
                 IComplexNumber duf,
                 IComplexNumber du2,  DataBuffer ipiv,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber x, DataBuffer ldx, INDArray ferr,
                 INDArray berr, IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void zgtrfs( String trans, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber dl,
                 IComplexNumber d,
                 IComplexNumber du,
                 IComplexNumber dlf,
                 IComplexNumber df,
                 IComplexNumber duf,
                 IComplexNumber du2,  DataBuffer ipiv,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber x, DataBuffer ldx, INDArray ferr,
                 INDArray berr, IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void sporfs( String uplo, DataBuffer n, DataBuffer nrhs,  INDArray a,
                 DataBuffer lda,  INDArray af, DataBuffer ldaf,
                 INDArray b, DataBuffer ldb, INDArray x, DataBuffer ldx,
                 INDArray ferr, INDArray berr, INDArray work, DataBuffer iwork,
                 DataBuffer info );
    void dporfs( String uplo, DataBuffer n, DataBuffer nrhs,
                 INDArray a, DataBuffer lda,  INDArray af,
                 DataBuffer ldaf,  INDArray b, DataBuffer ldb,
                 INDArray x, DataBuffer ldx, INDArray ferr, INDArray berr,
                 INDArray work, DataBuffer iwork, DataBuffer info );
    void cporfs( String uplo, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber af, DataBuffer ldaf,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber x, DataBuffer ldx, INDArray ferr,
                 INDArray berr, IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void zporfs( String uplo, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber af, DataBuffer ldaf,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber x, DataBuffer ldx, INDArray ferr,
                 INDArray berr, IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void dporfsx( String uplo, String equed, DataBuffer n, DataBuffer nrhs,
                  INDArray a, DataBuffer lda,  INDArray af,
                  DataBuffer ldaf,  INDArray s,  INDArray b,
                  DataBuffer ldb, INDArray x, DataBuffer ldx, INDArray rcond,
                  INDArray berr, DataBuffer int_bnds,
                  INDArray erint_norm, INDArray erint_comp,
                  DataBuffer nparams, INDArray params, INDArray work,
                  DataBuffer iwork, DataBuffer info );
    void sporfsx( String uplo, String equed, DataBuffer n, DataBuffer nrhs,
                  INDArray a, DataBuffer lda,  INDArray af,
                  DataBuffer ldaf,  INDArray s,  INDArray b,
                  DataBuffer ldb, INDArray x, DataBuffer ldx, INDArray rcond,
                  INDArray berr, DataBuffer int_bnds, INDArray erint_norm,
                  INDArray erint_comp, DataBuffer nparams, INDArray params,
                  INDArray work, DataBuffer iwork, DataBuffer info );
    void zporfsx( String uplo, String equed, DataBuffer n, DataBuffer nrhs,
                  IComplexNumber a, DataBuffer lda,
                  IComplexNumber af, DataBuffer ldaf,
                  INDArray s,  IComplexNumber b,
                  DataBuffer ldb, IComplexNumber x, DataBuffer ldx,
                  INDArray rcond, INDArray berr, DataBuffer int_bnds,
                  INDArray erint_norm, INDArray erint_comp,
                  DataBuffer nparams, INDArray params,
                  IComplexNumber work, INDArray rwork,
                  DataBuffer info );
    void cporfsx( String uplo, String equed, DataBuffer n, DataBuffer nrhs,
                  IComplexNumber a, DataBuffer lda,
                  IComplexNumber af, DataBuffer ldaf,
                  INDArray s,  IComplexNumber b,
                  DataBuffer ldb, IComplexNumber x, DataBuffer ldx,
                  INDArray rcond, INDArray berr, DataBuffer int_bnds,
                  INDArray erint_norm, INDArray erint_comp,
                  DataBuffer nparams, INDArray params,
                  IComplexNumber work, INDArray rwork,
                  DataBuffer info );
    void spprfs( String uplo, DataBuffer n, DataBuffer nrhs,
                 INDArray ap,  INDArray afp,  INDArray b,
                 DataBuffer ldb, INDArray x, DataBuffer ldx, INDArray ferr,
                 INDArray berr, INDArray work, DataBuffer iwork,
                 DataBuffer info );
    void dpprfs( String uplo, DataBuffer n, DataBuffer nrhs,
                 INDArray ap,  INDArray afp,  INDArray b,
                 DataBuffer ldb, INDArray x, DataBuffer ldx, INDArray ferr,
                 INDArray berr, INDArray work, DataBuffer iwork,
                 DataBuffer info );
    void cpprfs( String uplo, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber ap,
                 IComplexNumber afp,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber x, DataBuffer ldx, INDArray ferr,
                 INDArray berr, IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void zpprfs( String uplo, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber ap,
                 IComplexNumber afp,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber x, DataBuffer ldx, INDArray ferr,
                 INDArray berr, IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void spbrfs( String uplo, DataBuffer n, DataBuffer kd, DataBuffer nrhs,
                 INDArray ab, DataBuffer ldab,  INDArray afb,
                 DataBuffer ldafb,  INDArray b, DataBuffer ldb,
                 INDArray x, DataBuffer ldx, INDArray ferr, INDArray berr,
                 INDArray work, DataBuffer iwork, DataBuffer info );
    void dpbrfs( String uplo, DataBuffer n, DataBuffer kd, DataBuffer nrhs,
                 INDArray ab, DataBuffer ldab,  INDArray afb,
                 DataBuffer ldafb,  INDArray b, DataBuffer ldb,
                 INDArray x, DataBuffer ldx, INDArray ferr, INDArray berr,
                 INDArray work, DataBuffer iwork, DataBuffer info );
    void cpbrfs( String uplo, DataBuffer n, DataBuffer kd, DataBuffer nrhs,
                 IComplexNumber ab, DataBuffer ldab,
                 IComplexNumber afb, DataBuffer ldafb,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber x, DataBuffer ldx, INDArray ferr,
                 INDArray berr, IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void zpbrfs( String uplo, DataBuffer n, DataBuffer kd, DataBuffer nrhs,
                 IComplexNumber ab, DataBuffer ldab,
                 IComplexNumber afb, DataBuffer ldafb,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber x, DataBuffer ldx, INDArray ferr,
                 INDArray berr, IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void sptrfs( DataBuffer n, DataBuffer nrhs,  INDArray d,
                 INDArray e,  INDArray df,  INDArray ef,
                 INDArray b, DataBuffer ldb, INDArray x, DataBuffer ldx,
                 INDArray ferr, INDArray berr, INDArray work, DataBuffer info );
    void dptrfs( DataBuffer n, DataBuffer nrhs,  INDArray d,
                 INDArray e,  INDArray df,  INDArray ef,
                 INDArray b, DataBuffer ldb, INDArray x,
                 DataBuffer ldx, INDArray ferr, INDArray berr, INDArray work,
                 DataBuffer info );
    void cptrfs( String uplo, DataBuffer n, DataBuffer nrhs,  INDArray d,
                 IComplexNumber e,  INDArray df,
                 IComplexNumber ef,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber x, DataBuffer ldx, INDArray ferr,
                 INDArray berr, IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void zptrfs( String uplo, DataBuffer n, DataBuffer nrhs,
                 INDArray d,  IComplexNumber e,
                 INDArray df,  IComplexNumber ef,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber x, DataBuffer ldx, INDArray ferr,
                 INDArray berr, IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void ssyrfs( String uplo, DataBuffer n, DataBuffer nrhs,  INDArray a,
                 DataBuffer lda,  INDArray af, DataBuffer ldaf,
                 DataBuffer ipiv,  INDArray b, DataBuffer ldb,
                 INDArray x, DataBuffer ldx, INDArray ferr, INDArray berr,
                 INDArray work, DataBuffer iwork, DataBuffer info );
    void dsyrfs( String uplo, DataBuffer n, DataBuffer nrhs,
                 INDArray a, DataBuffer lda,  INDArray af,
                 DataBuffer ldaf,  DataBuffer ipiv,  INDArray b,
                 DataBuffer ldb, INDArray x, DataBuffer ldx, INDArray ferr,
                 INDArray berr, INDArray work, DataBuffer iwork,
                 DataBuffer info );
    void csyrfs( String uplo, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber af, DataBuffer ldaf,
                 DataBuffer ipiv,  IComplexNumber b,
                 DataBuffer ldb, IComplexNumber x, DataBuffer ldx,
                 INDArray ferr, INDArray berr, IComplexNumber work,
                 INDArray rwork, DataBuffer info );
    void zsyrfs( String uplo, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber af, DataBuffer ldaf,
                 DataBuffer ipiv,  IComplexNumber b,
                 DataBuffer ldb, IComplexNumber x, DataBuffer ldx,
                 INDArray ferr, INDArray berr, IComplexNumber work,
                 INDArray rwork, DataBuffer info );
    void dsyrfsx( String uplo, String equed, DataBuffer n, DataBuffer nrhs,
                  INDArray a, DataBuffer lda,  INDArray af,
                  DataBuffer ldaf,  DataBuffer ipiv,  INDArray s,
                  INDArray b, DataBuffer ldb, INDArray x,
                  DataBuffer ldx, INDArray rcond, INDArray berr,
                  DataBuffer int_bnds, INDArray erint_norm,
                  INDArray erint_comp, DataBuffer nparams, INDArray params,
                  INDArray work, DataBuffer iwork, DataBuffer info );
    void ssyrfsx( String uplo, String equed, DataBuffer n, DataBuffer nrhs,
                  INDArray a, DataBuffer lda,  INDArray af,
                  DataBuffer ldaf,  DataBuffer ipiv,  INDArray s,
                  INDArray b, DataBuffer ldb, INDArray x, DataBuffer ldx,
                  INDArray rcond, INDArray berr, DataBuffer int_bnds,
                  INDArray erint_norm, INDArray erint_comp,
                  DataBuffer nparams, INDArray params, INDArray work,
                  DataBuffer iwork, DataBuffer info );
    void zsyrfsx( String uplo, String equed, DataBuffer n, DataBuffer nrhs,
                  IComplexNumber a, DataBuffer lda,
                  IComplexNumber af, DataBuffer ldaf,
                  DataBuffer ipiv,  INDArray s,
                  IComplexNumber b, DataBuffer ldb,
                  IComplexNumber x, DataBuffer ldx, INDArray rcond,
                  INDArray berr, DataBuffer int_bnds,
                  INDArray erint_norm, INDArray erint_comp,
                  DataBuffer nparams, INDArray params,
                  IComplexNumber work, INDArray rwork,
                  DataBuffer info );
    void csyrfsx( String uplo, String equed, DataBuffer n, DataBuffer nrhs,
                  IComplexNumber a, DataBuffer lda,
                  IComplexNumber af, DataBuffer ldaf,
                  DataBuffer ipiv,  INDArray s,
                  IComplexNumber b, DataBuffer ldb,
                  IComplexNumber x, DataBuffer ldx, INDArray rcond,
                  INDArray berr, DataBuffer int_bnds, INDArray erint_norm,
                  INDArray erint_comp, DataBuffer nparams, INDArray params,
                  IComplexNumber work, INDArray rwork,
                  DataBuffer info );
    void cherfs( String uplo, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber af, DataBuffer ldaf,
                 DataBuffer ipiv,  IComplexNumber b,
                 DataBuffer ldb, IComplexNumber x, DataBuffer ldx,
                 INDArray ferr, INDArray berr, IComplexNumber work,
                 INDArray rwork, DataBuffer info );
    void zherfs( String uplo, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber af, DataBuffer ldaf,
                 DataBuffer ipiv,  IComplexNumber b,
                 DataBuffer ldb, IComplexNumber x, DataBuffer ldx,
                 INDArray ferr, INDArray berr, IComplexNumber work,
                 INDArray rwork, DataBuffer info );
    void zherfsx( String uplo, String equed, DataBuffer n, DataBuffer nrhs,
                  IComplexNumber a, DataBuffer lda,
                  IComplexNumber af, DataBuffer ldaf,
                  DataBuffer ipiv,  INDArray s,
                  IComplexNumber b, DataBuffer ldb,
                  IComplexNumber x, DataBuffer ldx, INDArray rcond,
                  INDArray berr, DataBuffer int_bnds,
                  INDArray erint_norm, INDArray erint_comp,
                  DataBuffer nparams, INDArray params,
                  IComplexNumber work, INDArray rwork,
                  DataBuffer info );
    void cherfsx( String uplo, String equed, DataBuffer n, DataBuffer nrhs,
                  IComplexNumber a, DataBuffer lda,
                  IComplexNumber af, DataBuffer ldaf,
                  DataBuffer ipiv,  INDArray s,
                  IComplexNumber b, DataBuffer ldb,
                  IComplexNumber x, DataBuffer ldx, INDArray rcond,
                  INDArray berr, DataBuffer int_bnds, INDArray erint_norm,
                  INDArray erint_comp, DataBuffer nparams, INDArray params,
                  IComplexNumber work, INDArray rwork,
                  DataBuffer info );
    void ssprfs( String uplo, DataBuffer n, DataBuffer nrhs,
                 INDArray ap,  INDArray afp,  DataBuffer ipiv,
                 INDArray b, DataBuffer ldb, INDArray x, DataBuffer ldx,
                 INDArray ferr, INDArray berr, INDArray work, DataBuffer iwork,
                 DataBuffer info );
    void dsprfs( String uplo, DataBuffer n, DataBuffer nrhs,
                 INDArray ap,  INDArray afp,  DataBuffer ipiv,
                 INDArray b, DataBuffer ldb, INDArray x,
                 DataBuffer ldx, INDArray ferr, INDArray berr, INDArray work,
                 DataBuffer iwork, DataBuffer info );
    void csprfs( String uplo, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber ap,
                 IComplexNumber afp,  DataBuffer ipiv,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber x, DataBuffer ldx, INDArray ferr,
                 INDArray berr, IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void zsprfs( String uplo, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber ap,
                 IComplexNumber afp,  DataBuffer ipiv,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber x, DataBuffer ldx, INDArray ferr,
                 INDArray berr, IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void chprfs( String uplo, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber ap,
                 IComplexNumber afp,  DataBuffer ipiv,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber x, DataBuffer ldx, INDArray ferr,
                 INDArray berr, IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void zhprfs( String uplo, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber ap,
                 IComplexNumber afp,  DataBuffer ipiv,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber x, DataBuffer ldx, INDArray ferr,
                 INDArray berr, IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void strrfs( String uplo, String trans, String diag, DataBuffer n,
                 DataBuffer nrhs,  INDArray a, DataBuffer lda,
                 INDArray b, DataBuffer ldb,  INDArray x,
                 DataBuffer ldx, INDArray ferr, INDArray berr, INDArray work,
                 DataBuffer iwork, DataBuffer info );
    void dtrrfs( String uplo, String trans, String diag, DataBuffer n,
                 DataBuffer nrhs,  INDArray a, DataBuffer lda,
                 INDArray b, DataBuffer ldb,  INDArray x,
                 DataBuffer ldx, INDArray ferr, INDArray berr, INDArray work,
                 DataBuffer iwork, DataBuffer info );
    void ctrrfs( String uplo, String trans, String diag, DataBuffer n,
                 DataBuffer nrhs,  IComplexNumber a,
                 DataBuffer lda,  IComplexNumber b,
                 DataBuffer ldb,  IComplexNumber x,
                 DataBuffer ldx, INDArray ferr, INDArray berr,
                 IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void ztrrfs( String uplo, String trans, String diag, DataBuffer n,
                 DataBuffer nrhs,  IComplexNumber a,
                 DataBuffer lda,  IComplexNumber b,
                 DataBuffer ldb,  IComplexNumber x,
                 DataBuffer ldx, INDArray ferr, INDArray berr,
                 IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void stprfs( String uplo, String trans, String diag, DataBuffer n,
                 DataBuffer nrhs,  INDArray ap,  INDArray b,
                 DataBuffer ldb,  INDArray x, DataBuffer ldx,
                 INDArray ferr, INDArray berr, INDArray work, DataBuffer iwork,
                 DataBuffer info );
    void dtprfs( String uplo, String trans, String diag, DataBuffer n,
                 DataBuffer nrhs,  INDArray ap,  INDArray b,
                 DataBuffer ldb,  INDArray x, DataBuffer ldx,
                 INDArray ferr, INDArray berr, INDArray work, DataBuffer iwork,
                 DataBuffer info );
    void ctprfs( String uplo, String trans, String diag, DataBuffer n,
                 DataBuffer nrhs,  IComplexNumber ap,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber x, DataBuffer ldx, INDArray ferr,
                 INDArray berr, IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void ztprfs( String uplo, String trans, String diag, DataBuffer n,
                 DataBuffer nrhs,  IComplexNumber ap,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber x, DataBuffer ldx,
                 INDArray ferr, INDArray berr, IComplexNumber work,
                 INDArray rwork, DataBuffer info );
    void stbrfs( String uplo, String trans, String diag, DataBuffer n,
                 DataBuffer kd, DataBuffer nrhs,  INDArray ab,
                 DataBuffer ldab,  INDArray b, DataBuffer ldb,
                 INDArray x, DataBuffer ldx, INDArray ferr, INDArray berr,
                 INDArray work, DataBuffer iwork, DataBuffer info );
    void dtbrfs( String uplo, String trans, String diag, DataBuffer n,
                 DataBuffer kd, DataBuffer nrhs,  INDArray ab,
                 DataBuffer ldab,  INDArray b, DataBuffer ldb,
                 INDArray x, DataBuffer ldx, INDArray ferr,
                 INDArray berr, INDArray work, DataBuffer iwork,
                 DataBuffer info );
    void ctbrfs( String uplo, String trans, String diag, DataBuffer n,
                 DataBuffer kd, DataBuffer nrhs,
                 IComplexNumber ab, DataBuffer ldab,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber x, DataBuffer ldx, INDArray ferr,
                 INDArray berr, IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void ztbrfs( String uplo, String trans, String diag, DataBuffer n,
                 DataBuffer kd, DataBuffer nrhs,
                 IComplexNumber ab, DataBuffer ldab,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber x, DataBuffer ldx,
                 INDArray ferr, INDArray berr, IComplexNumber work,
                 INDArray rwork, DataBuffer info );
    void sgetri( DataBuffer n, INDArray a, DataBuffer lda,
                 DataBuffer ipiv, INDArray work, DataBuffer lwork,
                 DataBuffer info );
    void dgetri( DataBuffer n, INDArray a, DataBuffer lda,
                 DataBuffer ipiv, INDArray work, DataBuffer lwork,
                 DataBuffer info );
    void cgetri( DataBuffer n, IComplexNumber a, DataBuffer lda,
                 DataBuffer ipiv, IComplexNumber work,
                 DataBuffer lwork, DataBuffer info );
    void zgetri( DataBuffer n, IComplexNumber a, DataBuffer lda,
                 DataBuffer ipiv, IComplexNumber work,
                 DataBuffer lwork, DataBuffer info );
    void spotri( String uplo, DataBuffer n, INDArray a, DataBuffer lda,
                 DataBuffer info );
    void dpotri( String uplo, DataBuffer n, INDArray a, DataBuffer lda,
                 DataBuffer info );
    void cpotri( String uplo, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, DataBuffer info );
    void zpotri( String uplo, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, DataBuffer info );
    void dpftri( String transr, String uplo, DataBuffer n, INDArray a,
                 DataBuffer info );
    void spftri( String transr, String uplo, DataBuffer n, INDArray a,
                 DataBuffer info );
    void zpftri( String transr, String uplo, DataBuffer n,
                 IComplexNumber a, DataBuffer info );
    void cpftri( String transr, String uplo, DataBuffer n,
                 IComplexNumber a, DataBuffer info );
    void spptri( String uplo, DataBuffer n, INDArray ap, DataBuffer info );
    void dpptri( String uplo, DataBuffer n, INDArray ap, DataBuffer info );
    void cpptri( String uplo, DataBuffer n, IComplexNumber ap,
                 DataBuffer info );
    void zpptri( String uplo, DataBuffer n, IComplexNumber ap,
                 DataBuffer info );
    void ssytri( String uplo, DataBuffer n, INDArray a, DataBuffer lda,
                 DataBuffer ipiv, INDArray work, DataBuffer info );
    void dsytri( String uplo, DataBuffer n, INDArray a, DataBuffer lda,
                 DataBuffer ipiv, INDArray work, DataBuffer info );
    void csytri( String uplo, DataBuffer n, IComplexNumber a,
                 DataBuffer lda,  DataBuffer ipiv,
                 IComplexNumber work, DataBuffer info );
    void zsytri( String uplo, DataBuffer n, IComplexNumber a,
                 DataBuffer lda,  DataBuffer ipiv,
                 IComplexNumber work, DataBuffer info );
    void chetri( String uplo, DataBuffer n, IComplexNumber a,
                 DataBuffer lda,  DataBuffer ipiv,
                 IComplexNumber work, DataBuffer info );
    void zhetri( String uplo, DataBuffer n, IComplexNumber a,
                 DataBuffer lda,  DataBuffer ipiv,
                 IComplexNumber work, DataBuffer info );
    void ssptri( String uplo, DataBuffer n, INDArray ap,
                 DataBuffer ipiv, INDArray work, DataBuffer info );
    void dsptri( String uplo, DataBuffer n, INDArray ap,
                 DataBuffer ipiv, INDArray work, DataBuffer info );
    void csptri( String uplo, DataBuffer n, IComplexNumber ap,
                 DataBuffer ipiv, IComplexNumber work,
                 DataBuffer info );
    void zsptri( String uplo, DataBuffer n, IComplexNumber ap,
                 DataBuffer ipiv, IComplexNumber work,
                 DataBuffer info );
    void chptri( String uplo, DataBuffer n, IComplexNumber ap,
                 DataBuffer ipiv, IComplexNumber work,
                 DataBuffer info );
    void zhptri( String uplo, DataBuffer n, IComplexNumber ap,
                 DataBuffer ipiv, IComplexNumber work,
                 DataBuffer info );
    void strtri( String uplo, String diag, DataBuffer n, INDArray a,
                 DataBuffer lda, DataBuffer info );
    void dtrtri( String uplo, String diag, DataBuffer n, INDArray a,
                 DataBuffer lda, DataBuffer info );
    void ctrtri( String uplo, String diag, DataBuffer n,
                 IComplexNumber a, DataBuffer lda,
                 DataBuffer info );
    void ztrtri( String uplo, String diag, DataBuffer n,
                 IComplexNumber a, DataBuffer lda,
                 DataBuffer info );
    void dtftri( String transr, String uplo, String diag, DataBuffer n,
                 INDArray a, DataBuffer info );
    void stftri( String transr, String uplo, String diag, DataBuffer n,
                 INDArray a, DataBuffer info );
    void ztftri( String transr, String uplo, String diag, DataBuffer n,
                 IComplexNumber a, DataBuffer info );
    void ctftri( String transr, String uplo, String diag, DataBuffer n,
                 IComplexNumber a, DataBuffer info );
    void stptri( String uplo, String diag, DataBuffer n, INDArray ap,
                 DataBuffer info );
    void dtptri( String uplo, String diag, DataBuffer n, INDArray ap,
                 DataBuffer info );
    void ctptri( String uplo, String diag, DataBuffer n,
                 IComplexNumber ap, DataBuffer info );
    void ztptri( String uplo, String diag, DataBuffer n,
                 IComplexNumber ap, DataBuffer info );
    void sgeequ( DataBuffer m, DataBuffer n,  INDArray a,
                 DataBuffer lda, INDArray r, INDArray c, INDArray rowcnd,
                 INDArray colcnd, INDArray amax, DataBuffer info );
    void dgeequ( DataBuffer m, DataBuffer n,  INDArray a,
                 DataBuffer lda, INDArray r, INDArray c, INDArray rowcnd,
                 INDArray colcnd, INDArray amax, DataBuffer info );
    void cgeequ( DataBuffer m, DataBuffer n,  IComplexNumber a,
                 DataBuffer lda, INDArray r, INDArray c, INDArray rowcnd,
                 INDArray colcnd, INDArray amax, DataBuffer info );
    void zgeequ( DataBuffer m, DataBuffer n,
                 IComplexNumber a, DataBuffer lda, INDArray r,
                 INDArray c, INDArray rowcnd, INDArray colcnd, INDArray amax,
                 DataBuffer info );
    void dgeequb( DataBuffer m, DataBuffer n,  INDArray a,
                  DataBuffer lda, INDArray r, INDArray c, INDArray rowcnd,
                  INDArray colcnd, INDArray amax, DataBuffer info );
    void sgeequb( DataBuffer m, DataBuffer n,  INDArray a,
                  DataBuffer lda, INDArray r, INDArray c, INDArray rowcnd,
                  INDArray colcnd, INDArray amax, DataBuffer info );
    void zgeequb( DataBuffer m, DataBuffer n,
                  IComplexNumber a, DataBuffer lda, INDArray r,
                  INDArray c, INDArray rowcnd, INDArray colcnd, INDArray amax,
                  DataBuffer info );
    void cgeequb( DataBuffer m, DataBuffer n,
                  IComplexNumber a, DataBuffer lda, INDArray r,
                  INDArray c, INDArray rowcnd, INDArray colcnd, INDArray amax,
                  DataBuffer info );
    void sgbequ( DataBuffer m, DataBuffer n, DataBuffer kl,
                 DataBuffer ku,  INDArray ab, DataBuffer ldab, INDArray r,
                 INDArray c, INDArray rowcnd, INDArray colcnd, INDArray amax,
                 DataBuffer info );
    void dgbequ( DataBuffer m, DataBuffer n, DataBuffer kl,
                 DataBuffer ku,  INDArray ab, DataBuffer ldab,
                 INDArray r, INDArray c, INDArray rowcnd, INDArray colcnd,
                 INDArray amax, DataBuffer info );
    void cgbequ( DataBuffer m, DataBuffer n, DataBuffer kl,
                 DataBuffer ku,  IComplexNumber ab,
                 DataBuffer ldab, INDArray r, INDArray c, INDArray rowcnd,
                 INDArray colcnd, INDArray amax, DataBuffer info );
    void zgbequ( DataBuffer m, DataBuffer n, DataBuffer kl,
                 DataBuffer ku,  IComplexNumber ab,
                 DataBuffer ldab, INDArray r, INDArray c, INDArray rowcnd,
                 INDArray colcnd, INDArray amax, DataBuffer info );
    void dgbequb( DataBuffer m, DataBuffer n, DataBuffer kl,
                  DataBuffer ku,  INDArray ab, DataBuffer ldab,
                  INDArray r, INDArray c, INDArray rowcnd, INDArray colcnd,
                  INDArray amax, DataBuffer info );
    void sgbequb( DataBuffer m, DataBuffer n, DataBuffer kl,
                  DataBuffer ku,  INDArray ab, DataBuffer ldab,
                  INDArray r, INDArray c, INDArray rowcnd, INDArray colcnd,
                  INDArray amax, DataBuffer info );
    void zgbequb( DataBuffer m, DataBuffer n, DataBuffer kl,
                  DataBuffer ku,  IComplexNumber ab,
                  DataBuffer ldab, INDArray r, INDArray c, INDArray rowcnd,
                  INDArray colcnd, INDArray amax, DataBuffer info );
    void cgbequb( DataBuffer m, DataBuffer n, DataBuffer kl,
                  DataBuffer ku,  IComplexNumber ab,
                  DataBuffer ldab, INDArray r, INDArray c, INDArray rowcnd,
                  INDArray colcnd, INDArray amax, DataBuffer info );
    void spoequ( DataBuffer n,  INDArray a, DataBuffer lda, INDArray s,
                 INDArray scond, INDArray amax, DataBuffer info );
    void dpoequ( DataBuffer n,  INDArray a, DataBuffer lda, INDArray s,
                 INDArray scond, INDArray amax, DataBuffer info );
    void cpoequ( DataBuffer n,  IComplexNumber a,
                 DataBuffer lda, INDArray s, INDArray scond, INDArray amax,
                 DataBuffer info );
    void zpoequ( DataBuffer n,  IComplexNumber a,
                 DataBuffer lda, INDArray s, INDArray scond, INDArray amax,
                 DataBuffer info );
    void dpoequb( DataBuffer n,  INDArray a, DataBuffer lda, INDArray s,
                  INDArray scond, INDArray amax, DataBuffer info );
    void spoequb( DataBuffer n,  INDArray a, DataBuffer lda, INDArray s,
                  INDArray scond, INDArray amax, DataBuffer info );
    void zpoequb( DataBuffer n,  IComplexNumber a,
                  DataBuffer lda, INDArray s, INDArray scond, INDArray amax,
                  DataBuffer info );
    void cpoequb( DataBuffer n,  IComplexNumber a,
                  DataBuffer lda, INDArray s, INDArray scond, INDArray amax,
                  DataBuffer info );
    void sppequ( String uplo, DataBuffer n,  INDArray ap, INDArray s,
                 INDArray scond, INDArray amax, DataBuffer info );
    void dppequ( String uplo, DataBuffer n,  INDArray ap, INDArray s,
                 INDArray scond, INDArray amax, DataBuffer info );
    void cppequ( String uplo, DataBuffer n,  IComplexNumber ap,
                 INDArray s, INDArray scond, INDArray amax, DataBuffer info );
    void zppequ( String uplo, DataBuffer n,  IComplexNumber ap,
                 INDArray s, INDArray scond, INDArray amax, DataBuffer info );
    void spbequ( String uplo, DataBuffer n, DataBuffer kd,  INDArray ab,
                 DataBuffer ldab, INDArray s, INDArray scond, INDArray amax,
                 DataBuffer info );
    void dpbequ( String uplo, DataBuffer n, DataBuffer kd,  INDArray ab,
                 DataBuffer ldab, INDArray s, INDArray scond, INDArray amax,
                 DataBuffer info );
    void cpbequ( String uplo, DataBuffer n, DataBuffer kd,
                 IComplexNumber ab, DataBuffer ldab, INDArray s,
                 INDArray scond, INDArray amax, DataBuffer info );
    void zpbequ( String uplo, DataBuffer n, DataBuffer kd,
                 IComplexNumber ab, DataBuffer ldab,
                 INDArray s, INDArray scond, INDArray amax, DataBuffer info );
    void dsyequb( String uplo, DataBuffer n,  INDArray a,
                  DataBuffer lda, INDArray s, INDArray scond, INDArray amax,
                  INDArray work, DataBuffer info );
    void ssyequb( String uplo, DataBuffer n,  INDArray a, DataBuffer lda,
                  INDArray s, INDArray scond, INDArray amax, INDArray work,
                  DataBuffer info );
    void zsyequb( String uplo, DataBuffer n,  IComplexNumber a,
                  DataBuffer lda, INDArray s, INDArray scond, INDArray amax,
                  IComplexNumber work, DataBuffer info );
    void csyequb( String uplo, DataBuffer n,  IComplexNumber a,
                  DataBuffer lda, INDArray s, INDArray scond, INDArray amax,
                  IComplexNumber work, DataBuffer info );
    void zheequb( String uplo, DataBuffer n,  IComplexNumber a,
                  DataBuffer lda, INDArray s, INDArray scond, INDArray amax,
                  IComplexNumber work, DataBuffer info );
    void cheequb( String uplo, DataBuffer n,  IComplexNumber a,
                  DataBuffer lda, INDArray s, INDArray scond, INDArray amax,
                  IComplexNumber work, DataBuffer info );
    void sgesv( DataBuffer n, DataBuffer nrhs, INDArray a, DataBuffer lda,
                DataBuffer ipiv, INDArray b, DataBuffer ldb,
                DataBuffer info );
    void dgesv( DataBuffer n, DataBuffer nrhs, INDArray a, DataBuffer lda,
                DataBuffer ipiv, INDArray b, DataBuffer ldb,
                DataBuffer info );
    void cgesv( DataBuffer n, DataBuffer nrhs, IComplexNumber a,
                DataBuffer lda, DataBuffer ipiv, IComplexNumber b,
                DataBuffer ldb, DataBuffer info );
    void zgesv( DataBuffer n, DataBuffer nrhs, IComplexNumber a,
                DataBuffer lda, DataBuffer ipiv, IComplexNumber b,
                DataBuffer ldb, DataBuffer info );
    void dsgesv( DataBuffer n, DataBuffer nrhs, INDArray a, DataBuffer lda,
                 DataBuffer ipiv, INDArray b, DataBuffer ldb, INDArray x,
                 DataBuffer ldx, INDArray work, INDArray swork,
                 DataBuffer iter, DataBuffer info );
    void zcgesv( DataBuffer n, DataBuffer nrhs, IComplexNumber a,
                 DataBuffer lda, DataBuffer ipiv, IComplexNumber b,
                 DataBuffer ldb, IComplexNumber x, DataBuffer ldx,
                 IComplexNumber work, IComplexNumber swork,
                 INDArray rwork, DataBuffer iter, DataBuffer info );
    void sgesvx( String fact, String trans, DataBuffer n, DataBuffer nrhs,
                 INDArray a, DataBuffer lda, INDArray af, DataBuffer ldaf,
                 DataBuffer ipiv, String equed, INDArray r, INDArray c, INDArray b,
                 DataBuffer ldb, INDArray x, DataBuffer ldx, INDArray rcond,
                 INDArray ferr, INDArray berr, INDArray work, DataBuffer iwork,
                 DataBuffer info );
    void dgesvx( String fact, String trans, DataBuffer n, DataBuffer nrhs,
                 INDArray a, DataBuffer lda, INDArray af, DataBuffer ldaf,
                 DataBuffer ipiv, String equed, INDArray r, INDArray c,
                 INDArray b, DataBuffer ldb, INDArray x, DataBuffer ldx,
                 INDArray rcond, INDArray ferr, INDArray berr, INDArray work,
                 DataBuffer iwork, DataBuffer info );
    void cgesvx( String fact, String trans, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber af, DataBuffer ldaf,
                 DataBuffer ipiv, String equed, INDArray r, INDArray c,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber x, DataBuffer ldx, INDArray rcond,
                 INDArray ferr, INDArray berr, IComplexNumber work,
                 INDArray rwork, DataBuffer info );
    void zgesvx( String fact, String trans, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber af, DataBuffer ldaf,
                 DataBuffer ipiv, String equed, INDArray r, INDArray c,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber x, DataBuffer ldx, INDArray rcond,
                 INDArray ferr, INDArray berr, IComplexNumber work,
                 INDArray rwork, DataBuffer info );
    void dgesvxx( String fact, String trans, DataBuffer n, DataBuffer nrhs,
                  INDArray a, DataBuffer lda, INDArray af, DataBuffer ldaf,
                  DataBuffer ipiv, String equed, INDArray r, INDArray c,
                  INDArray b, DataBuffer ldb, INDArray x, DataBuffer ldx,
                  INDArray rcond, INDArray rpvgrw, INDArray berr,
                  DataBuffer int_bnds, INDArray erint_norm,
                  INDArray erint_comp, DataBuffer nparams, INDArray params,
                  INDArray work, DataBuffer iwork, DataBuffer info );
    void sgesvxx( String fact, String trans, DataBuffer n, DataBuffer nrhs,
                  INDArray a, DataBuffer lda, INDArray af, DataBuffer ldaf,
                  DataBuffer ipiv, String equed, INDArray r, INDArray c,
                  INDArray b, DataBuffer ldb, INDArray x, DataBuffer ldx,
                  INDArray rcond, INDArray rpvgrw, INDArray berr,
                  DataBuffer int_bnds, INDArray erint_norm,
                  INDArray erint_comp, DataBuffer nparams, INDArray params,
                  INDArray work, DataBuffer iwork, DataBuffer info );
    void zgesvxx( String fact, String trans, DataBuffer n, DataBuffer nrhs,
                  IComplexNumber a, DataBuffer lda,
                  IComplexNumber af, DataBuffer ldaf,
                  DataBuffer ipiv, String equed, INDArray r, INDArray c,
                  IComplexNumber b, DataBuffer ldb,
                  IComplexNumber x, DataBuffer ldx, INDArray rcond,
                  INDArray rpvgrw, INDArray berr, DataBuffer int_bnds,
                  INDArray erint_norm, INDArray erint_comp,
                  DataBuffer nparams, INDArray params,
                  IComplexNumber work, INDArray rwork,
                  DataBuffer info );
    void cgesvxx( String fact, String trans, DataBuffer n, DataBuffer nrhs,
                  IComplexNumber a, DataBuffer lda,
                  IComplexNumber af, DataBuffer ldaf,
                  DataBuffer ipiv, String equed, INDArray r, INDArray c,
                  IComplexNumber b, DataBuffer ldb,
                  IComplexNumber x, DataBuffer ldx, INDArray rcond,
                  INDArray rpvgrw, INDArray berr, DataBuffer int_bnds,
                  INDArray erint_norm, INDArray erint_comp,
                  DataBuffer nparams, INDArray params,
                  IComplexNumber work, INDArray rwork,
                  DataBuffer info );
    void sgbsv( DataBuffer n, DataBuffer kl, DataBuffer ku,
                DataBuffer nrhs, INDArray ab, DataBuffer ldab,
                DataBuffer ipiv, INDArray b, DataBuffer ldb,
                DataBuffer info );
    void dgbsv( DataBuffer n, DataBuffer kl, DataBuffer ku,
                DataBuffer nrhs, INDArray ab, DataBuffer ldab,
                DataBuffer ipiv, INDArray b, DataBuffer ldb,
                DataBuffer info );
    void cgbsv( DataBuffer n, DataBuffer kl, DataBuffer ku,
                DataBuffer nrhs, IComplexNumber ab, DataBuffer ldab,
                DataBuffer ipiv, IComplexNumber b, DataBuffer ldb,
                DataBuffer info );
    void zgbsv( DataBuffer n, DataBuffer kl, DataBuffer ku,
                DataBuffer nrhs, IComplexNumber ab,
                DataBuffer ldab, DataBuffer ipiv, IComplexNumber b,
                DataBuffer ldb, DataBuffer info );
    void sgbsvx( String fact, String trans, DataBuffer n, DataBuffer kl,
                 DataBuffer ku, DataBuffer nrhs, INDArray ab,
                 DataBuffer ldab, INDArray afb, DataBuffer ldafb,
                 DataBuffer ipiv, String equed, INDArray r, INDArray c, INDArray b,
                 DataBuffer ldb, INDArray x, DataBuffer ldx, INDArray rcond,
                 INDArray ferr, INDArray berr, INDArray work, DataBuffer iwork,
                 DataBuffer info );
    void dgbsvx( String fact, String trans, DataBuffer n, DataBuffer kl,
                 DataBuffer ku, DataBuffer nrhs, INDArray ab,
                 DataBuffer ldab, INDArray afb, DataBuffer ldafb,
                 DataBuffer ipiv, String equed, INDArray r, INDArray c,
                 INDArray b, DataBuffer ldb, INDArray x, DataBuffer ldx,
                 INDArray rcond, INDArray ferr, INDArray berr, INDArray work,
                 DataBuffer iwork, DataBuffer info );
    void cgbsvx( String fact, String trans, DataBuffer n, DataBuffer kl,
                 DataBuffer ku, DataBuffer nrhs, IComplexNumber ab,
                 DataBuffer ldab, IComplexNumber afb,
                 DataBuffer ldafb, DataBuffer ipiv, String equed, INDArray r,
                 INDArray c, IComplexNumber b, DataBuffer ldb,
                 IComplexNumber x, DataBuffer ldx, INDArray rcond,
                 INDArray ferr, INDArray berr, IComplexNumber work,
                 INDArray rwork, DataBuffer info );
    void zgbsvx( String fact, String trans, DataBuffer n, DataBuffer kl,
                 DataBuffer ku, DataBuffer nrhs, IComplexNumber ab,
                 DataBuffer ldab, IComplexNumber afb,
                 DataBuffer ldafb, DataBuffer ipiv, String equed, INDArray r,
                 INDArray c, IComplexNumber b, DataBuffer ldb,
                 IComplexNumber x, DataBuffer ldx, INDArray rcond,
                 INDArray ferr, INDArray berr, IComplexNumber work,
                 INDArray rwork, DataBuffer info );
    void dgbsvxx( String fact, String trans, DataBuffer n, DataBuffer kl,
                  DataBuffer ku, DataBuffer nrhs, INDArray ab,
                  DataBuffer ldab, INDArray afb, DataBuffer ldafb,
                  DataBuffer ipiv, String equed, INDArray r, INDArray c,
                  INDArray b, DataBuffer ldb, INDArray x, DataBuffer ldx,
                  INDArray rcond, INDArray rpvgrw, INDArray berr,
                  DataBuffer int_bnds, INDArray erint_norm,
                  INDArray erint_comp, DataBuffer nparams, INDArray params,
                  INDArray work, DataBuffer iwork, DataBuffer info );
    void sgbsvxx( String fact, String trans, DataBuffer n, DataBuffer kl,
                  DataBuffer ku, DataBuffer nrhs, INDArray ab,
                  DataBuffer ldab, INDArray afb, DataBuffer ldafb,
                  DataBuffer ipiv, String equed, INDArray r, INDArray c,
                  INDArray b, DataBuffer ldb, INDArray x, DataBuffer ldx,
                  INDArray rcond, INDArray rpvgrw, INDArray berr,
                  DataBuffer int_bnds, INDArray erint_norm,
                  INDArray erint_comp, DataBuffer nparams, INDArray params,
                  INDArray work, DataBuffer iwork, DataBuffer info );
    void zgbsvxx( String fact, String trans, DataBuffer n, DataBuffer kl,
                  DataBuffer ku, DataBuffer nrhs,
                  IComplexNumber ab, DataBuffer ldab,
                  IComplexNumber afb, DataBuffer ldafb,
                  DataBuffer ipiv, String equed, INDArray r, INDArray c,
                  IComplexNumber b, DataBuffer ldb,
                  IComplexNumber x, DataBuffer ldx, INDArray rcond,
                  INDArray rpvgrw, INDArray berr, DataBuffer int_bnds,
                  INDArray erint_norm, INDArray erint_comp,
                  DataBuffer nparams, INDArray params,
                  IComplexNumber work, INDArray rwork,
                  DataBuffer info );
    void cgbsvxx( String fact, String trans, DataBuffer n, DataBuffer kl,
                  DataBuffer ku, DataBuffer nrhs, IComplexNumber ab,
                  DataBuffer ldab, IComplexNumber afb,
                  DataBuffer ldafb, DataBuffer ipiv, String equed, INDArray r,
                  INDArray c, IComplexNumber b, DataBuffer ldb,
                  IComplexNumber x, DataBuffer ldx, INDArray rcond,
                  INDArray rpvgrw, INDArray berr, DataBuffer int_bnds,
                  INDArray erint_norm, INDArray erint_comp,
                  DataBuffer nparams, INDArray params,
                  IComplexNumber work, INDArray rwork,
                  DataBuffer info );
    void sgtsv( DataBuffer n, DataBuffer nrhs, INDArray dl, INDArray d,
                INDArray du, INDArray b, DataBuffer ldb, DataBuffer info );
    void dgtsv( DataBuffer n, DataBuffer nrhs, INDArray dl, INDArray d,
                INDArray du, INDArray b, DataBuffer ldb, DataBuffer info );
    void cgtsv( DataBuffer n, DataBuffer nrhs, IComplexNumber dl,
                IComplexNumber d, IComplexNumber du,
                IComplexNumber b, DataBuffer ldb, DataBuffer info );
    void zgtsv( DataBuffer n, DataBuffer nrhs, IComplexNumber dl,
                IComplexNumber d, IComplexNumber du,
                IComplexNumber b, DataBuffer ldb,
                DataBuffer info );
    void sgtsvx( String fact, String trans, DataBuffer n, DataBuffer nrhs,
                 INDArray dl,  INDArray d,  INDArray du,
                 INDArray dlf, INDArray df, INDArray duf, INDArray du2,
                 DataBuffer ipiv,  INDArray b, DataBuffer ldb, INDArray x,
                 DataBuffer ldx, INDArray rcond, INDArray ferr, INDArray berr,
                 INDArray work, DataBuffer iwork, DataBuffer info );
    void dgtsvx( String fact, String trans, DataBuffer n, DataBuffer nrhs,
                 INDArray dl,  INDArray d,  INDArray du,
                 INDArray dlf, INDArray df, INDArray duf, INDArray du2,
                 DataBuffer ipiv,  INDArray b, DataBuffer ldb,
                 INDArray x, DataBuffer ldx, INDArray rcond, INDArray ferr,
                 INDArray berr, INDArray work, DataBuffer iwork,
                 DataBuffer info );
    void cgtsvx( String fact, String trans, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber dl,
                 IComplexNumber d,
                 IComplexNumber du, IComplexNumber dlf,
                 IComplexNumber df, IComplexNumber duf,
                 IComplexNumber du2, DataBuffer ipiv,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber x, DataBuffer ldx, INDArray rcond,
                 INDArray ferr, INDArray berr, IComplexNumber work,
                 INDArray rwork, DataBuffer info );
    void zgtsvx( String fact, String trans, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber dl,
                 IComplexNumber d,
                 IComplexNumber du, IComplexNumber dlf,
                 IComplexNumber df, IComplexNumber duf,
                 IComplexNumber du2, DataBuffer ipiv,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber x, DataBuffer ldx, INDArray rcond,
                 INDArray ferr, INDArray berr, IComplexNumber work,
                 INDArray rwork, DataBuffer info );
    void sposv( String uplo, DataBuffer n, DataBuffer nrhs, INDArray a,
                DataBuffer lda, INDArray b, DataBuffer ldb,
                DataBuffer info );
    void dposv( String uplo, DataBuffer n, DataBuffer nrhs, INDArray a,
                DataBuffer lda, INDArray b, DataBuffer ldb,
                DataBuffer info );
    void cposv( String uplo, DataBuffer n, DataBuffer nrhs,
                IComplexNumber a, DataBuffer lda,
                IComplexNumber b, DataBuffer ldb, DataBuffer info );
    void zposv( String uplo, DataBuffer n, DataBuffer nrhs,
                IComplexNumber a, DataBuffer lda,
                IComplexNumber b, DataBuffer ldb,
                DataBuffer info );
    void dsposv( String uplo, DataBuffer n, DataBuffer nrhs, INDArray a,
                 DataBuffer lda, INDArray b, DataBuffer ldb, INDArray x,
                 DataBuffer ldx, INDArray work, INDArray swork,
                 DataBuffer iter, DataBuffer info );
    void zcposv( String uplo, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber x, DataBuffer ldx,
                 IComplexNumber work, IComplexNumber swork,
                 INDArray rwork, DataBuffer iter, DataBuffer info );
    void sposvx( String fact, String uplo, DataBuffer n, DataBuffer nrhs,
                 INDArray a, DataBuffer lda, INDArray af, DataBuffer ldaf,
                 String equed, INDArray s, INDArray b, DataBuffer ldb, INDArray x,
                 DataBuffer ldx, INDArray rcond, INDArray ferr, INDArray berr,
                 INDArray work, DataBuffer iwork, DataBuffer info );
    void dposvx( String fact, String uplo, DataBuffer n, DataBuffer nrhs,
                 INDArray a, DataBuffer lda, INDArray af, DataBuffer ldaf,
                 String equed, INDArray s, INDArray b, DataBuffer ldb,
                 INDArray x, DataBuffer ldx, INDArray rcond, INDArray ferr,
                 INDArray berr, INDArray work, DataBuffer iwork,
                 DataBuffer info );
    void cposvx( String fact, String uplo, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber af, DataBuffer ldaf, String equed,
                 INDArray s, IComplexNumber b, DataBuffer ldb,
                 IComplexNumber x, DataBuffer ldx, INDArray rcond,
                 INDArray ferr, INDArray berr, IComplexNumber work,
                 INDArray rwork, DataBuffer info );
    void zposvx( String fact, String uplo, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber af, DataBuffer ldaf, String equed,
                 INDArray s, IComplexNumber b, DataBuffer ldb,
                 IComplexNumber x, DataBuffer ldx, INDArray rcond,
                 INDArray ferr, INDArray berr, IComplexNumber work,
                 INDArray rwork, DataBuffer info );
    void dposvxx( String fact, String uplo, DataBuffer n, DataBuffer nrhs,
                  INDArray a, DataBuffer lda, INDArray af, DataBuffer ldaf,
                  String equed, INDArray s, INDArray b, DataBuffer ldb,
                  INDArray x, DataBuffer ldx, INDArray rcond, INDArray rpvgrw,
                  INDArray berr, DataBuffer int_bnds,
                  INDArray erint_norm, INDArray erint_comp,
                  DataBuffer nparams, INDArray params, INDArray work,
                  DataBuffer iwork, DataBuffer info );
    void sposvxx( String fact, String uplo, DataBuffer n, DataBuffer nrhs,
                  INDArray a, DataBuffer lda, INDArray af, DataBuffer ldaf,
                  String equed, INDArray s, INDArray b, DataBuffer ldb, INDArray x,
                  DataBuffer ldx, INDArray rcond, INDArray rpvgrw, INDArray berr,
                  DataBuffer int_bnds, INDArray erint_norm,
                  INDArray erint_comp, DataBuffer nparams, INDArray params,
                  INDArray work, DataBuffer iwork, DataBuffer info );
    void zposvxx( String fact, String uplo, DataBuffer n, DataBuffer nrhs,
                  IComplexNumber a, DataBuffer lda,
                  IComplexNumber af, DataBuffer ldaf, String equed,
                  INDArray s, IComplexNumber b, DataBuffer ldb,
                  IComplexNumber x, DataBuffer ldx, INDArray rcond,
                  INDArray rpvgrw, INDArray berr, DataBuffer int_bnds,
                  INDArray erint_norm, INDArray erint_comp,
                  DataBuffer nparams, INDArray params,
                  IComplexNumber work, INDArray rwork,
                  DataBuffer info );
    void cposvxx( String fact, String uplo, DataBuffer n, DataBuffer nrhs,
                  IComplexNumber a, DataBuffer lda,
                  IComplexNumber af, DataBuffer ldaf, String equed,
                  INDArray s, IComplexNumber b, DataBuffer ldb,
                  IComplexNumber x, DataBuffer ldx, INDArray rcond,
                  INDArray rpvgrw, INDArray berr, DataBuffer int_bnds,
                  INDArray erint_norm, INDArray erint_comp,
                  DataBuffer nparams, INDArray params,
                  IComplexNumber work, INDArray rwork,
                  DataBuffer info );
    void sppsv( String uplo, DataBuffer n, DataBuffer nrhs, INDArray ap,
                INDArray b, DataBuffer ldb, DataBuffer info );
    void dppsv( String uplo, DataBuffer n, DataBuffer nrhs, INDArray ap,
                INDArray b, DataBuffer ldb, DataBuffer info );
    void cppsv( String uplo, DataBuffer n, DataBuffer nrhs,
                IComplexNumber ap, IComplexNumber b,
                DataBuffer ldb, DataBuffer info );
    void zppsv( String uplo, DataBuffer n, DataBuffer nrhs,
                IComplexNumber ap, IComplexNumber b,
                DataBuffer ldb, DataBuffer info );
    void sppsvx( String fact, String uplo, DataBuffer n, DataBuffer nrhs,
                 INDArray ap, INDArray afp, String equed, INDArray s, INDArray b,
                 DataBuffer ldb, INDArray x, DataBuffer ldx, INDArray rcond,
                 INDArray ferr, INDArray berr, INDArray work, DataBuffer iwork,
                 DataBuffer info );
    void dppsvx( String fact, String uplo, DataBuffer n, DataBuffer nrhs,
                 INDArray ap, INDArray afp, String equed, INDArray s, INDArray b,
                 DataBuffer ldb, INDArray x, DataBuffer ldx, INDArray rcond,
                 INDArray ferr, INDArray berr, INDArray work, DataBuffer iwork,
                 DataBuffer info );
    void cppsvx( String fact, String uplo, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber ap, IComplexNumber afp,
                 String equed, INDArray s, IComplexNumber b,
                 DataBuffer ldb, IComplexNumber x, DataBuffer ldx,
                 INDArray rcond, INDArray ferr, INDArray berr,
                 IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void zppsvx( String fact, String uplo, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber ap, IComplexNumber afp,
                 String equed, INDArray s, IComplexNumber b,
                 DataBuffer ldb, IComplexNumber x, DataBuffer ldx,
                 INDArray rcond, INDArray ferr, INDArray berr,
                 IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void spbsv( String uplo, DataBuffer n, DataBuffer kd, DataBuffer nrhs,
                INDArray ab, DataBuffer ldab, INDArray b, DataBuffer ldb,
                DataBuffer info );
    void dpbsv( String uplo, DataBuffer n, DataBuffer kd, DataBuffer nrhs,
                INDArray ab, DataBuffer ldab, INDArray b, DataBuffer ldb,
                DataBuffer info );
    void cpbsv( String uplo, DataBuffer n, DataBuffer kd, DataBuffer nrhs,
                IComplexNumber ab, DataBuffer ldab,
                IComplexNumber b, DataBuffer ldb, DataBuffer info );
    void zpbsv( String uplo, DataBuffer n, DataBuffer kd, DataBuffer nrhs,
                IComplexNumber ab, DataBuffer ldab,
                IComplexNumber b, DataBuffer ldb,
                DataBuffer info );
    void spbsvx( String fact, String uplo, DataBuffer n, DataBuffer kd,
                 DataBuffer nrhs, INDArray ab, DataBuffer ldab, INDArray afb,
                 DataBuffer ldafb, String equed, INDArray s, INDArray b,
                 DataBuffer ldb, INDArray x, DataBuffer ldx, INDArray rcond,
                 INDArray ferr, INDArray berr, INDArray work, DataBuffer iwork,
                 DataBuffer info );
    void dpbsvx( String fact, String uplo, DataBuffer n, DataBuffer kd,
                 DataBuffer nrhs, INDArray ab, DataBuffer ldab, INDArray afb,
                 DataBuffer ldafb, String equed, INDArray s, INDArray b,
                 DataBuffer ldb, INDArray x, DataBuffer ldx, INDArray rcond,
                 INDArray ferr, INDArray berr, INDArray work, DataBuffer iwork,
                 DataBuffer info );
    void cpbsvx( String fact, String uplo, DataBuffer n, DataBuffer kd,
                 DataBuffer nrhs, IComplexNumber ab,
                 DataBuffer ldab, IComplexNumber afb,
                 DataBuffer ldafb, String equed, INDArray s,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber x, DataBuffer ldx, INDArray rcond,
                 INDArray ferr, INDArray berr, IComplexNumber work,
                 INDArray rwork, DataBuffer info );
    void zpbsvx( String fact, String uplo, DataBuffer n, DataBuffer kd,
                 DataBuffer nrhs, IComplexNumber ab,
                 DataBuffer ldab, IComplexNumber afb,
                 DataBuffer ldafb, String equed, INDArray s,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber x, DataBuffer ldx, INDArray rcond,
                 INDArray ferr, INDArray berr, IComplexNumber work,
                 INDArray rwork, DataBuffer info );
    void sptsv( DataBuffer n, DataBuffer nrhs, INDArray d, INDArray e,
                INDArray b, DataBuffer ldb, DataBuffer info );
    void dptsv( DataBuffer n, DataBuffer nrhs, INDArray d, INDArray e,
                INDArray b, DataBuffer ldb, DataBuffer info );
    void cptsv( DataBuffer n, DataBuffer nrhs, INDArray d,
                IComplexNumber e, IComplexNumber b,
                DataBuffer ldb, DataBuffer info );
    void zptsv( DataBuffer n, DataBuffer nrhs, INDArray d,
                IComplexNumber e, IComplexNumber b,
                DataBuffer ldb, DataBuffer info );
    void sptsvx( String fact, DataBuffer n, DataBuffer nrhs,  INDArray d,
                 INDArray e, INDArray df, INDArray ef,  INDArray b,
                 DataBuffer ldb, INDArray x, DataBuffer ldx, INDArray rcond,
                 INDArray ferr, INDArray berr, INDArray work, DataBuffer info );
    void dptsvx( String fact, DataBuffer n, DataBuffer nrhs,
                 INDArray d,  INDArray e, INDArray df, INDArray ef,
                 INDArray b, DataBuffer ldb, INDArray x,
                 DataBuffer ldx, INDArray rcond, INDArray ferr, INDArray berr,
                 INDArray work, DataBuffer info );
    void cptsvx( String fact, DataBuffer n, DataBuffer nrhs,  INDArray d,
                 IComplexNumber e, INDArray df,
                 IComplexNumber ef,  IComplexNumber b,
                 DataBuffer ldb, IComplexNumber x, DataBuffer ldx,
                 INDArray rcond, INDArray ferr, INDArray berr,
                 IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void zptsvx( String fact, DataBuffer n, DataBuffer nrhs,
                 INDArray d,  IComplexNumber e, INDArray df,
                 IComplexNumber ef,  IComplexNumber b,
                 DataBuffer ldb, IComplexNumber x, DataBuffer ldx,
                 INDArray rcond, INDArray ferr, INDArray berr,
                 IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void ssysv( String uplo, DataBuffer n, DataBuffer nrhs, INDArray a,
                DataBuffer lda, DataBuffer ipiv, INDArray b, DataBuffer ldb,
                INDArray work, DataBuffer lwork, DataBuffer info );
    void dsysv( String uplo, DataBuffer n, DataBuffer nrhs, INDArray a,
                DataBuffer lda, DataBuffer ipiv, INDArray b,
                DataBuffer ldb, INDArray work, DataBuffer lwork,
                DataBuffer info );
    void csysv( String uplo, DataBuffer n, DataBuffer nrhs,
                IComplexNumber a, DataBuffer lda, DataBuffer ipiv,
                IComplexNumber b, DataBuffer ldb,
                IComplexNumber work, DataBuffer lwork,
                DataBuffer info );
    void zsysv( String uplo, DataBuffer n, DataBuffer nrhs,
                IComplexNumber a, DataBuffer lda, DataBuffer ipiv,
                IComplexNumber b, DataBuffer ldb,
                IComplexNumber work, DataBuffer lwork,
                DataBuffer info );
    void ssysvx( String fact, String uplo, DataBuffer n, DataBuffer nrhs,
                 INDArray a, DataBuffer lda, INDArray af,
                 DataBuffer ldaf, DataBuffer ipiv,  INDArray b,
                 DataBuffer ldb, INDArray x, DataBuffer ldx, INDArray rcond,
                 INDArray ferr, INDArray berr, INDArray work, DataBuffer lwork,
                 DataBuffer iwork, DataBuffer info );
    void dsysvx( String fact, String uplo, DataBuffer n, DataBuffer nrhs,
                 INDArray a, DataBuffer lda, INDArray af,
                 DataBuffer ldaf, DataBuffer ipiv,  INDArray b,
                 DataBuffer ldb, INDArray x, DataBuffer ldx, INDArray rcond,
                 INDArray ferr, INDArray berr, INDArray work, DataBuffer lwork,
                 DataBuffer iwork, DataBuffer info );
    void csysvx( String fact, String uplo, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber af, DataBuffer ldaf,
                 DataBuffer ipiv,  IComplexNumber b,
                 DataBuffer ldb, IComplexNumber x, DataBuffer ldx,
                 INDArray rcond, INDArray ferr, INDArray berr,
                 IComplexNumber work, DataBuffer lwork, INDArray rwork,
                 DataBuffer info );
    void zsysvx( String fact, String uplo, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber af, DataBuffer ldaf,
                 DataBuffer ipiv,  IComplexNumber b,
                 DataBuffer ldb, IComplexNumber x, DataBuffer ldx,
                 INDArray rcond, INDArray ferr, INDArray berr,
                 IComplexNumber work, DataBuffer lwork,
                 INDArray rwork, DataBuffer info );
    void dsysvxx( String fact, String uplo, DataBuffer n, DataBuffer nrhs,
                  INDArray a, DataBuffer lda, INDArray af, DataBuffer ldaf,
                  DataBuffer ipiv, String equed, INDArray s, INDArray b,
                  DataBuffer ldb, INDArray x, DataBuffer ldx, INDArray rcond,
                  INDArray rpvgrw, INDArray berr, DataBuffer int_bnds,
                  INDArray erint_norm, INDArray erint_comp,
                  DataBuffer nparams, INDArray params, INDArray work,
                  DataBuffer iwork, DataBuffer info );
    void ssysvxx( String fact, String uplo, DataBuffer n, DataBuffer nrhs,
                  INDArray a, DataBuffer lda, INDArray af, DataBuffer ldaf,
                  DataBuffer ipiv, String equed, INDArray s, INDArray b,
                  DataBuffer ldb, INDArray x, DataBuffer ldx, INDArray rcond,
                  INDArray rpvgrw, INDArray berr, DataBuffer int_bnds,
                  INDArray erint_norm, INDArray erint_comp,
                  DataBuffer nparams, INDArray params, INDArray work,
                  DataBuffer iwork, DataBuffer info );
    void zsysvxx( String fact, String uplo, DataBuffer n, DataBuffer nrhs,
                  IComplexNumber a, DataBuffer lda,
                  IComplexNumber af, DataBuffer ldaf,
                  DataBuffer ipiv, String equed, INDArray s,
                  IComplexNumber b, DataBuffer ldb,
                  IComplexNumber x, DataBuffer ldx, INDArray rcond,
                  INDArray rpvgrw, INDArray berr, DataBuffer int_bnds,
                  INDArray erint_norm, INDArray erint_comp,
                  DataBuffer nparams, INDArray params,
                  IComplexNumber work, INDArray rwork,
                  DataBuffer info );
    void csysvxx( String fact, String uplo, DataBuffer n, DataBuffer nrhs,
                  IComplexNumber a, DataBuffer lda,
                  IComplexNumber af, DataBuffer ldaf,
                  DataBuffer ipiv, String equed, INDArray s,
                  IComplexNumber b, DataBuffer ldb,
                  IComplexNumber x, DataBuffer ldx, INDArray rcond,
                  INDArray rpvgrw, INDArray berr, DataBuffer int_bnds,
                  INDArray erint_norm, INDArray erint_comp,
                  DataBuffer nparams, INDArray params,
                  IComplexNumber work, INDArray rwork,
                  DataBuffer info );
    void chesv( String uplo, DataBuffer n, DataBuffer nrhs,
                IComplexNumber a, DataBuffer lda, DataBuffer ipiv,
                IComplexNumber b, DataBuffer ldb,
                IComplexNumber work, DataBuffer lwork,
                DataBuffer info );
    void zhesv( String uplo, DataBuffer n, DataBuffer nrhs,
                IComplexNumber a, DataBuffer lda, DataBuffer ipiv,
                IComplexNumber b, DataBuffer ldb,
                IComplexNumber work, DataBuffer lwork,
                DataBuffer info );
    void chesvx( String fact, String uplo, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber af, DataBuffer ldaf,
                 DataBuffer ipiv,  IComplexNumber b,
                 DataBuffer ldb, IComplexNumber x, DataBuffer ldx,
                 INDArray rcond, INDArray ferr, INDArray berr,
                 IComplexNumber work, DataBuffer lwork, INDArray rwork,
                 DataBuffer info );
    void zhesvx( String fact, String uplo, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber af, DataBuffer ldaf,
                 DataBuffer ipiv,  IComplexNumber b,
                 DataBuffer ldb, IComplexNumber x, DataBuffer ldx,
                 INDArray rcond, INDArray ferr, INDArray berr,
                 IComplexNumber work, DataBuffer lwork,
                 INDArray rwork, DataBuffer info );
    void zhesvxx( String fact, String uplo, DataBuffer n, DataBuffer nrhs,
                  IComplexNumber a, DataBuffer lda,
                  IComplexNumber af, DataBuffer ldaf,
                  DataBuffer ipiv, String equed, INDArray s,
                  IComplexNumber b, DataBuffer ldb,
                  IComplexNumber x, DataBuffer ldx, INDArray rcond,
                  INDArray rpvgrw, INDArray berr, DataBuffer int_bnds,
                  INDArray erint_norm, INDArray erint_comp,
                  DataBuffer nparams, INDArray params,
                  IComplexNumber work, INDArray rwork,
                  DataBuffer info );
    void chesvxx( String fact, String uplo, DataBuffer n, DataBuffer nrhs,
                  IComplexNumber a, DataBuffer lda,
                  IComplexNumber af, DataBuffer ldaf,
                  DataBuffer ipiv, String equed, INDArray s,
                  IComplexNumber b, DataBuffer ldb,
                  IComplexNumber x, DataBuffer ldx, INDArray rcond,
                  INDArray rpvgrw, INDArray berr, DataBuffer int_bnds,
                  INDArray erint_norm, INDArray erint_comp,
                  DataBuffer nparams, INDArray params,
                  IComplexNumber work, INDArray rwork,
                  DataBuffer info );
    void sspsv( String uplo, DataBuffer n, DataBuffer nrhs, INDArray ap,
                DataBuffer ipiv, INDArray b, DataBuffer ldb,
                DataBuffer info );
    void dspsv( String uplo, DataBuffer n, DataBuffer nrhs, INDArray ap,
                DataBuffer ipiv, INDArray b, DataBuffer ldb,
                DataBuffer info );
    void cspsv( String uplo, DataBuffer n, DataBuffer nrhs,
                IComplexNumber ap, DataBuffer ipiv,
                IComplexNumber b, DataBuffer ldb, DataBuffer info );
    void zspsv( String uplo, DataBuffer n, DataBuffer nrhs,
                IComplexNumber ap, DataBuffer ipiv,
                IComplexNumber b, DataBuffer ldb,
                DataBuffer info );
    void sspsvx( String fact, String uplo, DataBuffer n, DataBuffer nrhs,
                 INDArray ap, INDArray afp, DataBuffer ipiv,
                 INDArray b, DataBuffer ldb, INDArray x, DataBuffer ldx,
                 INDArray rcond, INDArray ferr, INDArray berr, INDArray work,
                 DataBuffer iwork, DataBuffer info );
    void dspsvx( String fact, String uplo, DataBuffer n, DataBuffer nrhs,
                 INDArray ap, INDArray afp, DataBuffer ipiv,
                 INDArray b, DataBuffer ldb, INDArray x,
                 DataBuffer ldx, INDArray rcond, INDArray ferr, INDArray berr,
                 INDArray work, DataBuffer iwork, DataBuffer info );
    void cspsvx( String fact, String uplo, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber ap, IComplexNumber afp,
                 DataBuffer ipiv,  IComplexNumber b,
                 DataBuffer ldb, IComplexNumber x, DataBuffer ldx,
                 INDArray rcond, INDArray ferr, INDArray berr,
                 IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void zspsvx( String fact, String uplo, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber ap, IComplexNumber afp,
                 DataBuffer ipiv,  IComplexNumber b,
                 DataBuffer ldb, IComplexNumber x, DataBuffer ldx,
                 INDArray rcond, INDArray ferr, INDArray berr,
                 IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void chpsv( String uplo, DataBuffer n, DataBuffer nrhs,
                IComplexNumber ap, DataBuffer ipiv,
                IComplexNumber b, DataBuffer ldb, DataBuffer info );
    void zhpsv( String uplo, DataBuffer n, DataBuffer nrhs,
                IComplexNumber ap, DataBuffer ipiv,
                IComplexNumber b, DataBuffer ldb,
                DataBuffer info );
    void chpsvx( String fact, String uplo, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber ap, IComplexNumber afp,
                 DataBuffer ipiv,  IComplexNumber b,
                 DataBuffer ldb, IComplexNumber x, DataBuffer ldx,
                 INDArray rcond, INDArray ferr, INDArray berr,
                 IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void zhpsvx( String fact, String uplo, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber ap, IComplexNumber afp,
                 DataBuffer ipiv,  IComplexNumber b,
                 DataBuffer ldb, IComplexNumber x, DataBuffer ldx,
                 INDArray rcond, INDArray ferr, INDArray berr,
                 IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void sgeqrf( DataBuffer m, DataBuffer n, INDArray a, DataBuffer lda,
                 INDArray tau, INDArray work, DataBuffer lwork,
                 DataBuffer info );
    void dgeqrf( DataBuffer m, DataBuffer n, INDArray a, DataBuffer lda,
                 INDArray tau, INDArray work, DataBuffer lwork,
                 DataBuffer info );
    void cgeqrf( DataBuffer m, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, IComplexNumber tau,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void zgeqrf( DataBuffer m, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, IComplexNumber tau,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void sgeqpf( DataBuffer m, DataBuffer n, INDArray a, DataBuffer lda,
                 DataBuffer jpvt, INDArray tau, INDArray work,
                 DataBuffer info );
    void dgeqpf( DataBuffer m, DataBuffer n, INDArray a, DataBuffer lda,
                 DataBuffer jpvt, INDArray tau, INDArray work,
                 DataBuffer info );
    void cgeqpf( DataBuffer m, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, DataBuffer jpvt,
                 IComplexNumber tau, IComplexNumber work,
                 INDArray rwork, DataBuffer info );
    void zgeqpf( DataBuffer m, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, DataBuffer jpvt,
                 IComplexNumber tau, IComplexNumber work,
                 INDArray rwork, DataBuffer info );
    void sgeqp3( DataBuffer m, DataBuffer n, INDArray a, DataBuffer lda,
                 DataBuffer jpvt, INDArray tau, INDArray work,
                 DataBuffer lwork, DataBuffer info );
    void dgeqp3( DataBuffer m, DataBuffer n, INDArray a, DataBuffer lda,
                 DataBuffer jpvt, INDArray tau, INDArray work,
                 DataBuffer lwork, DataBuffer info );
    void cgeqp3( DataBuffer m, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, DataBuffer jpvt,
                 IComplexNumber tau, IComplexNumber work,
                 DataBuffer lwork, INDArray rwork, DataBuffer info );
    void zgeqp3( DataBuffer m, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, DataBuffer jpvt,
                 IComplexNumber tau, IComplexNumber work,
                 DataBuffer lwork, INDArray rwork, DataBuffer info );
    void sorgqr( DataBuffer m, DataBuffer n, DataBuffer k, INDArray a,
                 DataBuffer lda,  INDArray tau, INDArray work,
                 DataBuffer lwork, DataBuffer info );
    void dorgqr( DataBuffer m, DataBuffer n, DataBuffer k, INDArray a,
                 DataBuffer lda,  INDArray tau, INDArray work,
                 DataBuffer lwork, DataBuffer info );
    void sormqr( String side, String trans, DataBuffer m, DataBuffer n,
                 DataBuffer k,  INDArray a, DataBuffer lda,
                 INDArray tau, INDArray c, DataBuffer ldc, INDArray work,
                 DataBuffer lwork, DataBuffer info );
    void dormqr( String side, String trans, DataBuffer m, DataBuffer n,
                 DataBuffer k,  INDArray a, DataBuffer lda,
                 INDArray tau, INDArray c, DataBuffer ldc, INDArray work,
                 DataBuffer lwork, DataBuffer info );
    void cungqr( DataBuffer m, DataBuffer n, DataBuffer k,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber tau, IComplexNumber work,
                 DataBuffer lwork, DataBuffer info );
    void zungqr( DataBuffer m, DataBuffer n, DataBuffer k,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber tau,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void cunmqr( String side, String trans, DataBuffer m, DataBuffer n,
                 DataBuffer k,  IComplexNumber a,
                 DataBuffer lda,  IComplexNumber tau,
                 IComplexNumber c, DataBuffer ldc,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void zunmqr( String side, String trans, DataBuffer m, DataBuffer n,
                 DataBuffer k,  IComplexNumber a,
                 DataBuffer lda,  IComplexNumber tau,
                 IComplexNumber c, DataBuffer ldc,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void sgelqf( DataBuffer m, DataBuffer n, INDArray a, DataBuffer lda,
                 INDArray tau, INDArray work, DataBuffer lwork,
                 DataBuffer info );
    void dgelqf( DataBuffer m, DataBuffer n, INDArray a, DataBuffer lda,
                 INDArray tau, INDArray work, DataBuffer lwork,
                 DataBuffer info );
    void cgelqf( DataBuffer m, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, IComplexNumber tau,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void zgelqf( DataBuffer m, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, IComplexNumber tau,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void sorglq( DataBuffer m, DataBuffer n, DataBuffer k, INDArray a,
                 DataBuffer lda,  INDArray tau, INDArray work,
                 DataBuffer lwork, DataBuffer info );
    void dorglq( DataBuffer m, DataBuffer n, DataBuffer k, INDArray a,
                 DataBuffer lda,  INDArray tau, INDArray work,
                 DataBuffer lwork, DataBuffer info );
    void sormlq( String side, String trans, DataBuffer m, DataBuffer n,
                 DataBuffer k,  INDArray a, DataBuffer lda,
                 INDArray tau, INDArray c, DataBuffer ldc, INDArray work,
                 DataBuffer lwork, DataBuffer info );
    void dormlq( String side, String trans, DataBuffer m, DataBuffer n,
                 DataBuffer k,  INDArray a, DataBuffer lda,
                 INDArray tau, INDArray c, DataBuffer ldc, INDArray work,
                 DataBuffer lwork, DataBuffer info );
    void cunglq( DataBuffer m, DataBuffer n, DataBuffer k,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber tau, IComplexNumber work,
                 DataBuffer lwork, DataBuffer info );
    void zunglq( DataBuffer m, DataBuffer n, DataBuffer k,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber tau,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void cunmlq( String side, String trans, DataBuffer m, DataBuffer n,
                 DataBuffer k,  IComplexNumber a,
                 DataBuffer lda,  IComplexNumber tau,
                 IComplexNumber c, DataBuffer ldc,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void zunmlq( String side, String trans, DataBuffer m, DataBuffer n,
                 DataBuffer k,  IComplexNumber a,
                 DataBuffer lda,  IComplexNumber tau,
                 IComplexNumber c, DataBuffer ldc,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void sgeqlf( DataBuffer m, DataBuffer n, INDArray a, DataBuffer lda,
                 INDArray tau, INDArray work, DataBuffer lwork,
                 DataBuffer info );
    void dgeqlf( DataBuffer m, DataBuffer n, INDArray a, DataBuffer lda,
                 INDArray tau, INDArray work, DataBuffer lwork,
                 DataBuffer info );
    void cgeqlf( DataBuffer m, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, IComplexNumber tau,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void zgeqlf( DataBuffer m, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, IComplexNumber tau,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void sorgql( DataBuffer m, DataBuffer n, DataBuffer k, INDArray a,
                 DataBuffer lda,  INDArray tau, INDArray work,
                 DataBuffer lwork, DataBuffer info );
    void dorgql( DataBuffer m, DataBuffer n, DataBuffer k, INDArray a,
                 DataBuffer lda,  INDArray tau, INDArray work,
                 DataBuffer lwork, DataBuffer info );
    void cungql( DataBuffer m, DataBuffer n, DataBuffer k,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber tau, IComplexNumber work,
                 DataBuffer lwork, DataBuffer info );
    void zungql( DataBuffer m, DataBuffer n, DataBuffer k,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber tau,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void sormql( String side, String trans, DataBuffer m, DataBuffer n,
                 DataBuffer k,  INDArray a, DataBuffer lda,
                 INDArray tau, INDArray c, DataBuffer ldc, INDArray work,
                 DataBuffer lwork, DataBuffer info );
    void dormql( String side, String trans, DataBuffer m, DataBuffer n,
                 DataBuffer k,  INDArray a, DataBuffer lda,
                 INDArray tau, INDArray c, DataBuffer ldc, INDArray work,
                 DataBuffer lwork, DataBuffer info );
    void cunmql( String side, String trans, DataBuffer m, DataBuffer n,
                 DataBuffer k,  IComplexNumber a,
                 DataBuffer lda,  IComplexNumber tau,
                 IComplexNumber c, DataBuffer ldc,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void zunmql( String side, String trans, DataBuffer m, DataBuffer n,
                 DataBuffer k,  IComplexNumber a,
                 DataBuffer lda,  IComplexNumber tau,
                 IComplexNumber c, DataBuffer ldc,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void sgerqf( DataBuffer m, DataBuffer n, INDArray a, DataBuffer lda,
                 INDArray tau, INDArray work, DataBuffer lwork,
                 DataBuffer info );
    void dgerqf( DataBuffer m, DataBuffer n, INDArray a, DataBuffer lda,
                 INDArray tau, INDArray work, DataBuffer lwork,
                 DataBuffer info );
    void cgerqf( DataBuffer m, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, IComplexNumber tau,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void zgerqf( DataBuffer m, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, IComplexNumber tau,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void sorgrq( DataBuffer m, DataBuffer n, DataBuffer k, INDArray a,
                 DataBuffer lda,  INDArray tau, INDArray work,
                 DataBuffer lwork, DataBuffer info );
    void dorgrq( DataBuffer m, DataBuffer n, DataBuffer k, INDArray a,
                 DataBuffer lda,  INDArray tau, INDArray work,
                 DataBuffer lwork, DataBuffer info );
    void cungrq( DataBuffer m, DataBuffer n, DataBuffer k,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber tau, IComplexNumber work,
                 DataBuffer lwork, DataBuffer info );
    void zungrq( DataBuffer m, DataBuffer n, DataBuffer k,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber tau,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void sormrq( String side, String trans, DataBuffer m, DataBuffer n,
                 DataBuffer k,  INDArray a, DataBuffer lda,
                 INDArray tau, INDArray c, DataBuffer ldc, INDArray work,
                 DataBuffer lwork, DataBuffer info );
    void dormrq( String side, String trans, DataBuffer m, DataBuffer n,
                 DataBuffer k,  INDArray a, DataBuffer lda,
                 INDArray tau, INDArray c, DataBuffer ldc, INDArray work,
                 DataBuffer lwork, DataBuffer info );
    void cunmrq( String side, String trans, DataBuffer m, DataBuffer n,
                 DataBuffer k,  IComplexNumber a,
                 DataBuffer lda,  IComplexNumber tau,
                 IComplexNumber c, DataBuffer ldc,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void zunmrq( String side, String trans, DataBuffer m, DataBuffer n,
                 DataBuffer k,  IComplexNumber a,
                 DataBuffer lda,  IComplexNumber tau,
                 IComplexNumber c, DataBuffer ldc,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void stzrzf( DataBuffer m, DataBuffer n, INDArray a, DataBuffer lda,
                 INDArray tau, INDArray work, DataBuffer lwork,
                 DataBuffer info );
    void dtzrzf( DataBuffer m, DataBuffer n, INDArray a, DataBuffer lda,
                 INDArray tau, INDArray work, DataBuffer lwork,
                 DataBuffer info );
    void ctzrzf( DataBuffer m, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, IComplexNumber tau,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void ztzrzf( DataBuffer m, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, IComplexNumber tau,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void sormrz( String side, String trans, DataBuffer m, DataBuffer n,
                 DataBuffer k, DataBuffer l,  INDArray a,
                 DataBuffer lda,  INDArray tau, INDArray c,
                 DataBuffer ldc, INDArray work, DataBuffer lwork,
                 DataBuffer info );
    void dormrz( String side, String trans, DataBuffer m, DataBuffer n,
                 DataBuffer k, DataBuffer l,  INDArray a,
                 DataBuffer lda,  INDArray tau, INDArray c,
                 DataBuffer ldc, INDArray work, DataBuffer lwork,
                 DataBuffer info );
    void cunmrz( String side, String trans, DataBuffer m, DataBuffer n,
                 DataBuffer k, DataBuffer l,  IComplexNumber a,
                 DataBuffer lda,  IComplexNumber tau,
                 IComplexNumber c, DataBuffer ldc,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void zunmrz( String side, String trans, DataBuffer m, DataBuffer n,
                 DataBuffer k, DataBuffer l,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber tau, IComplexNumber c,
                 DataBuffer ldc, IComplexNumber work,
                 DataBuffer lwork, DataBuffer info );
    void sggqrf( DataBuffer n, DataBuffer m, DataBuffer p, INDArray a,
                 DataBuffer lda, INDArray taua, INDArray b, DataBuffer ldb,
                 INDArray taub, INDArray work, DataBuffer lwork,
                 DataBuffer info );
    void dggqrf( DataBuffer n, DataBuffer m, DataBuffer p, INDArray a,
                 DataBuffer lda, INDArray taua, INDArray b, DataBuffer ldb,
                 INDArray taub, INDArray work, DataBuffer lwork,
                 DataBuffer info );
    void cggqrf( DataBuffer n, DataBuffer m, DataBuffer p,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber taua, IComplexNumber b,
                 DataBuffer ldb, IComplexNumber taub,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void zggqrf( DataBuffer n, DataBuffer m, DataBuffer p,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber taua, IComplexNumber b,
                 DataBuffer ldb, IComplexNumber taub,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void sggrqf( DataBuffer m, DataBuffer p, DataBuffer n, INDArray a,
                 DataBuffer lda, INDArray taua, INDArray b, DataBuffer ldb,
                 INDArray taub, INDArray work, DataBuffer lwork,
                 DataBuffer info );
    void dggrqf( DataBuffer m, DataBuffer p, DataBuffer n, INDArray a,
                 DataBuffer lda, INDArray taua, INDArray b, DataBuffer ldb,
                 INDArray taub, INDArray work, DataBuffer lwork,
                 DataBuffer info );
    void cggrqf( DataBuffer m, DataBuffer p, DataBuffer n,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber taua, IComplexNumber b,
                 DataBuffer ldb, IComplexNumber taub,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void zggrqf( DataBuffer m, DataBuffer p, DataBuffer n,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber taua, IComplexNumber b,
                 DataBuffer ldb, IComplexNumber taub,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void sgebrd( DataBuffer m, DataBuffer n, INDArray a, DataBuffer lda,
                 INDArray d, INDArray e, INDArray tauq, INDArray taup, INDArray work,
                 DataBuffer lwork, DataBuffer info );
    void dgebrd( DataBuffer m, DataBuffer n, INDArray a, DataBuffer lda,
                 INDArray d, INDArray e, INDArray tauq, INDArray taup,
                 INDArray work, DataBuffer lwork, DataBuffer info );
    void cgebrd( DataBuffer m, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, INDArray d, INDArray e,
                 IComplexNumber tauq, IComplexNumber taup,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void zgebrd( DataBuffer m, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, INDArray d, INDArray e,
                 IComplexNumber tauq, IComplexNumber taup,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void sgbbrd( String vect, DataBuffer m, DataBuffer n, DataBuffer ncc,
                 DataBuffer kl, DataBuffer ku, INDArray ab, DataBuffer ldab,
                 INDArray d, INDArray e, INDArray q, DataBuffer ldq, INDArray pt,
                 DataBuffer ldpt, INDArray c, DataBuffer ldc, INDArray work,
                 DataBuffer info );
    void dgbbrd( String vect, DataBuffer m, DataBuffer n, DataBuffer ncc,
                 DataBuffer kl, DataBuffer ku, INDArray ab,
                 DataBuffer ldab, INDArray d, INDArray e, INDArray q,
                 DataBuffer ldq, INDArray pt, DataBuffer ldpt, INDArray c,
                 DataBuffer ldc, INDArray work, DataBuffer info );
    void cgbbrd( String vect, DataBuffer m, DataBuffer n, DataBuffer ncc,
                 DataBuffer kl, DataBuffer ku, IComplexNumber ab,
                 DataBuffer ldab, INDArray d, INDArray e,
                 IComplexNumber q, DataBuffer ldq,
                 IComplexNumber pt, DataBuffer ldpt,
                 IComplexNumber c, DataBuffer ldc,
                 IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void zgbbrd( String vect, DataBuffer m, DataBuffer n, DataBuffer ncc,
                 DataBuffer kl, DataBuffer ku, IComplexNumber ab,
                 DataBuffer ldab, INDArray d, INDArray e,
                 IComplexNumber q, DataBuffer ldq,
                 IComplexNumber pt, DataBuffer ldpt,
                 IComplexNumber c, DataBuffer ldc,
                 IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void sorgbr( String vect, DataBuffer m, DataBuffer n, DataBuffer k,
                 INDArray a, DataBuffer lda,  INDArray tau, INDArray work,
                 DataBuffer lwork, DataBuffer info );
    void dorgbr( String vect, DataBuffer m, DataBuffer n, DataBuffer k,
                 INDArray a, DataBuffer lda,  INDArray tau, INDArray work,
                 DataBuffer lwork, DataBuffer info );
    void sormbr( String vect, String side, String trans, DataBuffer m,
                 DataBuffer n, DataBuffer k,  INDArray a,
                 DataBuffer lda,  INDArray tau, INDArray c,
                 DataBuffer ldc, INDArray work, DataBuffer lwork,
                 DataBuffer info );
    void dormbr( String vect, String side, String trans, DataBuffer m,
                 DataBuffer n, DataBuffer k,  INDArray a,
                 DataBuffer lda,  INDArray tau, INDArray c,
                 DataBuffer ldc, INDArray work, DataBuffer lwork,
                 DataBuffer info );
    void cungbr( String vect, DataBuffer m, DataBuffer n, DataBuffer k,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber tau, IComplexNumber work,
                 DataBuffer lwork, DataBuffer info );
    void zungbr( String vect, DataBuffer m, DataBuffer n, DataBuffer k,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber tau,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void cunmbr( String vect, String side, String trans, DataBuffer m,
                 DataBuffer n, DataBuffer k,  IComplexNumber a,
                 DataBuffer lda,  IComplexNumber tau,
                 IComplexNumber c, DataBuffer ldc,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void zunmbr( String vect, String side, String trans, DataBuffer m,
                 DataBuffer n, DataBuffer k,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber tau, IComplexNumber c,
                 DataBuffer ldc, IComplexNumber work,
                 DataBuffer lwork, DataBuffer info );
    void sbdsqr( String uplo, DataBuffer n, DataBuffer ncvt,
                 DataBuffer nru, DataBuffer ncc, INDArray d, INDArray e,
                 INDArray vt, DataBuffer ldvt, INDArray u, DataBuffer ldu,
                 INDArray c, DataBuffer ldc, INDArray work, DataBuffer info );
    void dbdsqr( String uplo, DataBuffer n, DataBuffer ncvt,
                 DataBuffer nru, DataBuffer ncc, INDArray d, INDArray e,
                 INDArray vt, DataBuffer ldvt, INDArray u, DataBuffer ldu,
                 INDArray c, DataBuffer ldc, INDArray work,
                 DataBuffer info );
    void cbdsqr( String uplo, DataBuffer n, DataBuffer ncvt,
                 DataBuffer nru, DataBuffer ncc, INDArray d, INDArray e,
                 IComplexNumber vt, DataBuffer ldvt,
                 IComplexNumber u, DataBuffer ldu,
                 IComplexNumber c, DataBuffer ldc, INDArray work,
                 DataBuffer info );
    void zbdsqr( String uplo, DataBuffer n, DataBuffer ncvt,
                 DataBuffer nru, DataBuffer ncc, INDArray d, INDArray e,
                 IComplexNumber vt, DataBuffer ldvt,
                 IComplexNumber u, DataBuffer ldu,
                 IComplexNumber c, DataBuffer ldc, INDArray work,
                 DataBuffer info );
    void sbdsdc( String uplo, String compq, DataBuffer n, INDArray d, INDArray e,
                 INDArray u, DataBuffer ldu, INDArray vt, DataBuffer ldvt,
                 INDArray q, DataBuffer iq, INDArray work, DataBuffer iwork,
                 DataBuffer info );
    void dbdsdc( String uplo, String compq, DataBuffer n, INDArray d,
                 INDArray e, INDArray u, DataBuffer ldu, INDArray vt,
                 DataBuffer ldvt, INDArray q, DataBuffer iq, INDArray work,
                 DataBuffer iwork, DataBuffer info );
    void sbdsvdx( String uplo, String jobz, String range,
                  DataBuffer n, INDArray d, INDArray e,
                  DataBuffer vl, DataBuffer vu,
                  DataBuffer il, DataBuffer iu, DataBuffer ns,
                  INDArray s, INDArray z, DataBuffer ldz,
                  INDArray work, DataBuffer iwork, DataBuffer info );
    void dbdsvdx( String uplo, String jobz, String range,
                  DataBuffer n, INDArray d, INDArray e,
                  DataBuffer vl, DataBuffer vu,
                  DataBuffer il, DataBuffer iu, DataBuffer ns,
                  INDArray s, INDArray z, DataBuffer ldz,
                  INDArray work, DataBuffer iwork, DataBuffer info );
    void ssytrd( String uplo, DataBuffer n, INDArray a, DataBuffer lda,
                 INDArray d, INDArray e, INDArray tau, INDArray work,
                 DataBuffer lwork, DataBuffer info );
    void dsytrd( String uplo, DataBuffer n, INDArray a, DataBuffer lda,
                 INDArray d, INDArray e, INDArray tau, INDArray work,
                 DataBuffer lwork, DataBuffer info );
    void sorgtr( String uplo, DataBuffer n, INDArray a, DataBuffer lda,
                 INDArray tau, INDArray work, DataBuffer lwork,
                 DataBuffer info );
    void dorgtr( String uplo, DataBuffer n, INDArray a, DataBuffer lda,
                 INDArray tau, INDArray work, DataBuffer lwork,
                 DataBuffer info );
    void sormtr( String side, String uplo, String trans, DataBuffer m,
                 DataBuffer n,  INDArray a, DataBuffer lda,
                 INDArray tau, INDArray c, DataBuffer ldc, INDArray work,
                 DataBuffer lwork, DataBuffer info );
    void dormtr( String side, String uplo, String trans, DataBuffer m,
                 DataBuffer n,  INDArray a, DataBuffer lda,
                 INDArray tau, INDArray c, DataBuffer ldc, INDArray work,
                 DataBuffer lwork, DataBuffer info );
    void chetrd( String uplo, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, INDArray d, INDArray e,
                 IComplexNumber tau, IComplexNumber work,
                 DataBuffer lwork, DataBuffer info );
    void zhetrd( String uplo, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, INDArray d, INDArray e,
                 IComplexNumber tau, IComplexNumber work,
                 DataBuffer lwork, DataBuffer info );
    void cungtr( String uplo, DataBuffer n, IComplexNumber a,
                 DataBuffer lda,  IComplexNumber tau,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void zungtr( String uplo, DataBuffer n, IComplexNumber a,
                 DataBuffer lda,  IComplexNumber tau,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void cunmtr( String side, String uplo, String trans, DataBuffer m,
                 DataBuffer n,  IComplexNumber a,
                 DataBuffer lda,  IComplexNumber tau,
                 IComplexNumber c, DataBuffer ldc,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void zunmtr( String side, String uplo, String trans, DataBuffer m,
                 DataBuffer n,  IComplexNumber a,
                 DataBuffer lda,  IComplexNumber tau,
                 IComplexNumber c, DataBuffer ldc,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void ssptrd( String uplo, DataBuffer n, INDArray ap, INDArray d, INDArray e,
                 INDArray tau, DataBuffer info );
    void dsptrd( String uplo, DataBuffer n, INDArray ap, INDArray d, INDArray e,
                 INDArray tau, DataBuffer info );
    void sopgtr( String uplo, DataBuffer n,  INDArray ap,
                 INDArray tau, INDArray q, DataBuffer ldq, INDArray work,
                 DataBuffer info );
    void dopgtr( String uplo, DataBuffer n,  INDArray ap,
                 INDArray tau, INDArray q, DataBuffer ldq, INDArray work,
                 DataBuffer info );
    void sopmtr( String side, String uplo, String trans, DataBuffer m,
                 DataBuffer n,  INDArray ap,  INDArray tau, INDArray c,
                 DataBuffer ldc, INDArray work, DataBuffer info );
    void dopmtr( String side, String uplo, String trans, DataBuffer m,
                 DataBuffer n,  INDArray ap,  INDArray tau,
                 INDArray c, DataBuffer ldc, INDArray work,
                 DataBuffer info );
    void chptrd( String uplo, DataBuffer n, IComplexNumber ap,
                 INDArray d, INDArray e, IComplexNumber tau,
                 DataBuffer info );
    void zhptrd( String uplo, DataBuffer n, IComplexNumber ap,
                 INDArray d, INDArray e, IComplexNumber tau,
                 DataBuffer info );
    void cupgtr( String uplo, DataBuffer n,  IComplexNumber ap,
                 IComplexNumber tau, IComplexNumber q,
                 DataBuffer ldq, IComplexNumber work,
                 DataBuffer info );
    void zupgtr( String uplo, DataBuffer n,  IComplexNumber ap,
                 IComplexNumber tau, IComplexNumber q,
                 DataBuffer ldq, IComplexNumber work,
                 DataBuffer info );
    void cupmtr( String side, String uplo, String trans, DataBuffer m,
                 DataBuffer n,  IComplexNumber ap,
                 IComplexNumber tau, IComplexNumber c,
                 DataBuffer ldc, IComplexNumber work,
                 DataBuffer info );
    void zupmtr( String side, String uplo, String trans, DataBuffer m,
                 DataBuffer n,  IComplexNumber ap,
                 IComplexNumber tau, IComplexNumber c,
                 DataBuffer ldc, IComplexNumber work,
                 DataBuffer info );
    void ssbtrd( String vect, String uplo, DataBuffer n, DataBuffer kd,
                 INDArray ab, DataBuffer ldab, INDArray d, INDArray e, INDArray q,
                 DataBuffer ldq, INDArray work, DataBuffer info );
    void dsbtrd( String vect, String uplo, DataBuffer n, DataBuffer kd,
                 INDArray ab, DataBuffer ldab, INDArray d, INDArray e,
                 INDArray q, DataBuffer ldq, INDArray work,
                 DataBuffer info );
    void chbtrd( String vect, String uplo, DataBuffer n, DataBuffer kd,
                 IComplexNumber ab, DataBuffer ldab, INDArray d,
                 INDArray e, IComplexNumber q, DataBuffer ldq,
                 IComplexNumber work, DataBuffer info );
    void zhbtrd( String vect, String uplo, DataBuffer n, DataBuffer kd,
                 IComplexNumber ab, DataBuffer ldab, INDArray d,
                 INDArray e, IComplexNumber q, DataBuffer ldq,
                 IComplexNumber work, DataBuffer info );
    void ssterf( DataBuffer n, INDArray d, INDArray e, DataBuffer info );
    void dsterf( DataBuffer n, INDArray d, INDArray e, DataBuffer info );
    void ssteqr( String compz, DataBuffer n, INDArray d, INDArray e, INDArray z,
                 DataBuffer ldz, INDArray work, DataBuffer info );
    void dsteqr( String compz, DataBuffer n, INDArray d, INDArray e, INDArray z,
                 DataBuffer ldz, INDArray work, DataBuffer info );
    void csteqr( String compz, DataBuffer n, INDArray d, INDArray e,
                 IComplexNumber z, DataBuffer ldz, INDArray work,
                 DataBuffer info );
    void zsteqr( String compz, DataBuffer n, INDArray d, INDArray e,
                 IComplexNumber z, DataBuffer ldz, INDArray work,
                 DataBuffer info );
    void sstemr( String jobz, String range, DataBuffer n, INDArray d, INDArray e,
                 INDArray vl, INDArray vu, DataBuffer il, DataBuffer iu,
                 DataBuffer m, INDArray w, INDArray z, DataBuffer ldz,
                 DataBuffer nzc, DataBuffer isuppz, DataBuffer tryrac,
                 INDArray work, DataBuffer lwork, DataBuffer iwork,
                 DataBuffer liwork, DataBuffer info );
    void dstemr( String jobz, String range, DataBuffer n, INDArray d,
                 INDArray e, INDArray vl, INDArray vu, DataBuffer il,
                 DataBuffer iu, DataBuffer m, INDArray w, INDArray z,
                 DataBuffer ldz, DataBuffer nzc, DataBuffer isuppz,
                 DataBuffer tryrac, INDArray work, DataBuffer lwork,
                 DataBuffer iwork, DataBuffer liwork, DataBuffer info );
    void cstemr( String jobz, String range, DataBuffer n, INDArray d, INDArray e,
                 INDArray vl, INDArray vu, DataBuffer il, DataBuffer iu,
                 DataBuffer m, INDArray w, IComplexNumber z,
                 DataBuffer ldz, DataBuffer nzc, DataBuffer isuppz,
                 DataBuffer tryrac, INDArray work, DataBuffer lwork,
                 DataBuffer iwork, DataBuffer liwork, DataBuffer info );
    void zstemr( String jobz, String range, DataBuffer n, INDArray d,
                 INDArray e, INDArray vl, INDArray vu, DataBuffer il,
                 DataBuffer iu, DataBuffer m, INDArray w,
                 IComplexNumber z, DataBuffer ldz, DataBuffer nzc,
                 DataBuffer isuppz, DataBuffer tryrac, INDArray work,
                 DataBuffer lwork, DataBuffer iwork, DataBuffer liwork,
                 DataBuffer info );
    void sstedc( String compz, DataBuffer n, INDArray d, INDArray e, INDArray z,
                 DataBuffer ldz, INDArray work, DataBuffer lwork,
                 DataBuffer iwork, DataBuffer liwork, DataBuffer info );
    void dstedc( String compz, DataBuffer n, INDArray d, INDArray e, INDArray z,
                 DataBuffer ldz, INDArray work, DataBuffer lwork,
                 DataBuffer iwork, DataBuffer liwork, DataBuffer info );
    void cstedc( String compz, DataBuffer n, INDArray d, INDArray e,
                 IComplexNumber z, DataBuffer ldz,
                 IComplexNumber work, DataBuffer lwork, INDArray rwork,
                 DataBuffer lrwork, DataBuffer iwork, DataBuffer liwork,
                 DataBuffer info );
    void zstedc( String compz, DataBuffer n, INDArray d, INDArray e,
                 IComplexNumber z, DataBuffer ldz,
                 IComplexNumber work, DataBuffer lwork,
                 INDArray rwork, DataBuffer lrwork, DataBuffer iwork,
                 DataBuffer liwork, DataBuffer info );
    void sstegr( String jobz, String range, DataBuffer n, INDArray d, INDArray e,
                 INDArray vl, INDArray vu, DataBuffer il, DataBuffer iu,
                 INDArray abstol, DataBuffer m, INDArray w, INDArray z,
                 DataBuffer ldz, DataBuffer isuppz, INDArray work,
                 DataBuffer lwork, DataBuffer iwork, DataBuffer liwork,
                 DataBuffer info );
    void dstegr( String jobz, String range, DataBuffer n, INDArray d,
                 INDArray e, INDArray vl, INDArray vu, DataBuffer il,
                 DataBuffer iu, INDArray abstol, DataBuffer m, INDArray w,
                 INDArray z, DataBuffer ldz, DataBuffer isuppz,
                 INDArray work, DataBuffer lwork, DataBuffer iwork,
                 DataBuffer liwork, DataBuffer info );
    void cstegr( String jobz, String range, DataBuffer n, INDArray d, INDArray e,
                 INDArray vl, INDArray vu, DataBuffer il, DataBuffer iu,
                 INDArray abstol, DataBuffer m, INDArray w,
                 IComplexNumber z, DataBuffer ldz,
                 DataBuffer isuppz, INDArray work, DataBuffer lwork,
                 DataBuffer iwork, DataBuffer liwork, DataBuffer info );
    void zstegr( String jobz, String range, DataBuffer n, INDArray d,
                 INDArray e, INDArray vl, INDArray vu, DataBuffer il,
                 DataBuffer iu, INDArray abstol, DataBuffer m, INDArray w,
                 IComplexNumber z, DataBuffer ldz,
                 DataBuffer isuppz, INDArray work, DataBuffer lwork,
                 DataBuffer iwork, DataBuffer liwork, DataBuffer info );
    void spteqr( String compz, DataBuffer n, INDArray d, INDArray e, INDArray z,
                 DataBuffer ldz, INDArray work, DataBuffer info );
    void dpteqr( String compz, DataBuffer n, INDArray d, INDArray e, INDArray z,
                 DataBuffer ldz, INDArray work, DataBuffer info );
    void cpteqr( String compz, DataBuffer n, INDArray d, INDArray e,
                 IComplexNumber z, DataBuffer ldz, INDArray work,
                 DataBuffer info );
    void zpteqr( String compz, DataBuffer n, INDArray d, INDArray e,
                 IComplexNumber z, DataBuffer ldz, INDArray work,
                 DataBuffer info );
    void sstebz( String range, String order, DataBuffer n, INDArray vl,
                 INDArray vu, DataBuffer il, DataBuffer iu, INDArray abstol,
                 INDArray d,  INDArray e, DataBuffer m,
                 DataBuffer nsplit, INDArray w, DataBuffer iblock,
                 DataBuffer isplit, INDArray work, DataBuffer iwork,
                 DataBuffer info );
    void dstebz( String range, String order, DataBuffer n, INDArray vl,
                 INDArray vu, DataBuffer il, DataBuffer iu, INDArray abstol,
                 INDArray d,  INDArray e, DataBuffer m,
                 DataBuffer nsplit, INDArray w, DataBuffer iblock,
                 DataBuffer isplit, INDArray work, DataBuffer iwork,
                 DataBuffer info );
    void sstein( DataBuffer n,  INDArray d,  INDArray e,
                 DataBuffer m,  INDArray w,  DataBuffer iblock,
                 DataBuffer isplit, INDArray z, DataBuffer ldz,
                 INDArray work, DataBuffer iwork, DataBuffer ifailv,
                 DataBuffer info );
    void dstein( DataBuffer n,  INDArray d,  INDArray e,
                 DataBuffer m,  INDArray w,  DataBuffer iblock,
                 DataBuffer isplit, INDArray z, DataBuffer ldz,
                 INDArray work, DataBuffer iwork, DataBuffer ifailv,
                 DataBuffer info );
    void cstein( DataBuffer n,  INDArray d,  INDArray e,
                 DataBuffer m,  INDArray w,  DataBuffer iblock,
                 DataBuffer isplit, IComplexNumber z,
                 DataBuffer ldz, INDArray work, DataBuffer iwork,
                 DataBuffer ifailv, DataBuffer info );
    void zstein( DataBuffer n,  INDArray d,  INDArray e,
                 DataBuffer m,  INDArray w,  DataBuffer iblock,
                 DataBuffer isplit, IComplexNumber z,
                 DataBuffer ldz, INDArray work, DataBuffer iwork,
                 DataBuffer ifailv, DataBuffer info );
    void sdisna( String job, DataBuffer m, DataBuffer n,  INDArray d,
                 INDArray sep, DataBuffer info );
    void ddisna( String job, DataBuffer m, DataBuffer n,  INDArray d,
                 INDArray sep, DataBuffer info );
    void ssygst( DataBuffer itype, String uplo, DataBuffer n, INDArray a,
                 DataBuffer lda,  INDArray b, DataBuffer ldb,
                 DataBuffer info );
    void dsygst( DataBuffer itype, String uplo, DataBuffer n, INDArray a,
                 DataBuffer lda,  INDArray b, DataBuffer ldb,
                 DataBuffer info );
    void chegst( DataBuffer itype, String uplo, DataBuffer n,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb,
                 DataBuffer info );
    void zhegst( DataBuffer itype, String uplo, DataBuffer n,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb,
                 DataBuffer info );
    void sspgst( DataBuffer itype, String uplo, DataBuffer n, INDArray ap,
                 INDArray bp, DataBuffer info );
    void dspgst( DataBuffer itype, String uplo, DataBuffer n, INDArray ap,
                 INDArray bp, DataBuffer info );
    void chpgst( DataBuffer itype, String uplo, DataBuffer n,
                 IComplexNumber ap,  IComplexNumber bp,
                 DataBuffer info );
    void zhpgst( DataBuffer itype, String uplo, DataBuffer n,
                 IComplexNumber ap,  IComplexNumber bp,
                 DataBuffer info );
    void ssbgst( String vect, String uplo, DataBuffer n, DataBuffer ka,
                 DataBuffer kb, INDArray ab, DataBuffer ldab,
                 INDArray bb, DataBuffer ldbb, INDArray x,
                 DataBuffer ldx, INDArray work, DataBuffer info );
    void dsbgst( String vect, String uplo, DataBuffer n, DataBuffer ka,
                 DataBuffer kb, INDArray ab, DataBuffer ldab,
                 INDArray bb, DataBuffer ldbb, INDArray x,
                 DataBuffer ldx, INDArray work, DataBuffer info );
    void chbgst( String vect, String uplo, DataBuffer n, DataBuffer ka,
                 DataBuffer kb, IComplexNumber ab, DataBuffer ldab,
                 IComplexNumber bb, DataBuffer ldbb,
                 IComplexNumber x, DataBuffer ldx,
                 IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void zhbgst( String vect, String uplo, DataBuffer n, DataBuffer ka,
                 DataBuffer kb, IComplexNumber ab, DataBuffer ldab,
                 IComplexNumber bb, DataBuffer ldbb,
                 IComplexNumber x, DataBuffer ldx,
                 IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void spbstf( String uplo, DataBuffer n, DataBuffer kb, INDArray bb,
                 DataBuffer ldbb, DataBuffer info );
    void dpbstf( String uplo, DataBuffer n, DataBuffer kb, INDArray bb,
                 DataBuffer ldbb, DataBuffer info );
    void cpbstf( String uplo, DataBuffer n, DataBuffer kb,
                 IComplexNumber bb, DataBuffer ldbb,
                 DataBuffer info );
    void zpbstf( String uplo, DataBuffer n, DataBuffer kb,
                 IComplexNumber bb, DataBuffer ldbb,
                 DataBuffer info );
    void sgehrd( DataBuffer n, DataBuffer ilo, DataBuffer ihi, INDArray a,
                 DataBuffer lda, INDArray tau, INDArray work, DataBuffer lwork,
                 DataBuffer info );
    void dgehrd( DataBuffer n, DataBuffer ilo, DataBuffer ihi, INDArray a,
                 DataBuffer lda, INDArray tau, INDArray work,
                 DataBuffer lwork, DataBuffer info );
    void cgehrd( DataBuffer n, DataBuffer ilo, DataBuffer ihi,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber tau, IComplexNumber work,
                 DataBuffer lwork, DataBuffer info );
    void zgehrd( DataBuffer n, DataBuffer ilo, DataBuffer ihi,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber tau, IComplexNumber work,
                 DataBuffer lwork, DataBuffer info );
    void sorghr( DataBuffer n, DataBuffer ilo, DataBuffer ihi, INDArray a,
                 DataBuffer lda,  INDArray tau, INDArray work,
                 DataBuffer lwork, DataBuffer info );
    void dorghr( DataBuffer n, DataBuffer ilo, DataBuffer ihi, INDArray a,
                 DataBuffer lda,  INDArray tau, INDArray work,
                 DataBuffer lwork, DataBuffer info );
    void sormhr( String side, String trans, DataBuffer m, DataBuffer n,
                 DataBuffer ilo, DataBuffer ihi,  INDArray a,
                 DataBuffer lda,  INDArray tau, INDArray c,
                 DataBuffer ldc, INDArray work, DataBuffer lwork,
                 DataBuffer info );
    void dormhr( String side, String trans, DataBuffer m, DataBuffer n,
                 DataBuffer ilo, DataBuffer ihi,  INDArray a,
                 DataBuffer lda,  INDArray tau, INDArray c,
                 DataBuffer ldc, INDArray work, DataBuffer lwork,
                 DataBuffer info );
    void cunghr( DataBuffer n, DataBuffer ilo, DataBuffer ihi,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber tau, IComplexNumber work,
                 DataBuffer lwork, DataBuffer info );
    void zunghr( DataBuffer n, DataBuffer ilo, DataBuffer ihi,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber tau,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void cunmhr( String side, String trans, DataBuffer m, DataBuffer n,
                 DataBuffer ilo, DataBuffer ihi,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber tau, IComplexNumber c,
                 DataBuffer ldc, IComplexNumber work,
                 DataBuffer lwork, DataBuffer info );
    void zunmhr( String side, String trans, DataBuffer m, DataBuffer n,
                 DataBuffer ilo, DataBuffer ihi,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber tau, IComplexNumber c,
                 DataBuffer ldc, IComplexNumber work,
                 DataBuffer lwork, DataBuffer info );
    void sgebal( String job, DataBuffer n, INDArray a, DataBuffer lda,
                 DataBuffer ilo, DataBuffer ihi, INDArray scale,
                 DataBuffer info );
    void dgebal( String job, DataBuffer n, INDArray a, DataBuffer lda,
                 DataBuffer ilo, DataBuffer ihi, INDArray scale,
                 DataBuffer info );
    void cgebal( String job, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, DataBuffer ilo, DataBuffer ihi,
                 INDArray scale, DataBuffer info );
    void zgebal( String job, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, DataBuffer ilo, DataBuffer ihi,
                 INDArray scale, DataBuffer info );
    void sgebak( String job, String side, DataBuffer n, DataBuffer ilo,
                 DataBuffer ihi,  INDArray scale, DataBuffer m,
                 INDArray v, DataBuffer ldv, DataBuffer info );
    void dgebak( String job, String side, DataBuffer n, DataBuffer ilo,
                 DataBuffer ihi,  INDArray scale, DataBuffer m,
                 INDArray v, DataBuffer ldv, DataBuffer info );
    void cgebak( String job, String side, DataBuffer n, DataBuffer ilo,
                 DataBuffer ihi,  INDArray scale, DataBuffer m,
                 IComplexNumber v, DataBuffer ldv,
                 DataBuffer info );
    void zgebak( String job, String side, DataBuffer n, DataBuffer ilo,
                 DataBuffer ihi,  INDArray scale, DataBuffer m,
                 IComplexNumber v, DataBuffer ldv,
                 DataBuffer info );
    void shseqr( String job, String compz, DataBuffer n, DataBuffer ilo,
                 DataBuffer ihi, INDArray h, DataBuffer ldh, INDArray wr,
                 INDArray wi, INDArray z, DataBuffer ldz, INDArray work,
                 DataBuffer lwork, DataBuffer info );
    void dhseqr( String job, String compz, DataBuffer n, DataBuffer ilo,
                 DataBuffer ihi, INDArray h, DataBuffer ldh, INDArray wr,
                 INDArray wi, INDArray z, DataBuffer ldz, INDArray work,
                 DataBuffer lwork, DataBuffer info );
    void chseqr( String job, String compz, DataBuffer n, DataBuffer ilo,
                 DataBuffer ihi, IComplexNumber h, DataBuffer ldh,
                 IComplexNumber w, IComplexNumber z,
                 DataBuffer ldz, IComplexNumber work,
                 DataBuffer lwork, DataBuffer info );
    void zhseqr( String job, String compz, DataBuffer n, DataBuffer ilo,
                 DataBuffer ihi, IComplexNumber h, DataBuffer ldh,
                 IComplexNumber w, IComplexNumber z,
                 DataBuffer ldz, IComplexNumber work,
                 DataBuffer lwork, DataBuffer info );
    void shsein( String job, String eigsrc, String initv,
                 DataBuffer select, DataBuffer n,  INDArray h,
                 DataBuffer ldh, INDArray wr,  INDArray wi, INDArray vl,
                 DataBuffer ldvl, INDArray vr, DataBuffer ldvr,
                 DataBuffer mm, DataBuffer m, INDArray work,
                 DataBuffer ifaill, DataBuffer ifailr, DataBuffer info );
    void dhsein( String job, String eigsrc, String initv,
                 DataBuffer select, DataBuffer n,  INDArray h,
                 DataBuffer ldh, INDArray wr,  INDArray wi, INDArray vl,
                 DataBuffer ldvl, INDArray vr, DataBuffer ldvr,
                 DataBuffer mm, DataBuffer m, INDArray work,
                 DataBuffer ifaill, DataBuffer ifailr, DataBuffer info );
    void chsein( String job, String eigsrc, String initv,
                 DataBuffer select, DataBuffer n,
                 IComplexNumber h, DataBuffer ldh,
                 IComplexNumber w, IComplexNumber vl,
                 DataBuffer ldvl, IComplexNumber vr,
                 DataBuffer ldvr, DataBuffer mm, DataBuffer m,
                 IComplexNumber work, INDArray rwork,
                 DataBuffer ifaill, DataBuffer ifailr, DataBuffer info );
    void zhsein( String job, String eigsrc, String initv,
                 DataBuffer select, DataBuffer n,
                 IComplexNumber h, DataBuffer ldh,
                 IComplexNumber w, IComplexNumber vl,
                 DataBuffer ldvl, IComplexNumber vr,
                 DataBuffer ldvr, DataBuffer mm, DataBuffer m,
                 IComplexNumber work, INDArray rwork,
                 DataBuffer ifaill, DataBuffer ifailr, DataBuffer info );
    void strevc( String side, String howmny, DataBuffer select,
                 DataBuffer n,  INDArray t, DataBuffer ldt, INDArray vl,
                 DataBuffer ldvl, INDArray vr, DataBuffer ldvr,
                 DataBuffer mm, DataBuffer m, INDArray work,
                 DataBuffer info );
    void dtrevc( String side, String howmny, DataBuffer select,
                 DataBuffer n,  INDArray t, DataBuffer ldt, INDArray vl,
                 DataBuffer ldvl, INDArray vr, DataBuffer ldvr,
                 DataBuffer mm, DataBuffer m, INDArray work,
                 DataBuffer info );
    void ctrevc( String side, String howmny,  DataBuffer select,
                 DataBuffer n, IComplexNumber t, DataBuffer ldt,
                 IComplexNumber vl, DataBuffer ldvl,
                 IComplexNumber vr, DataBuffer ldvr, DataBuffer mm,
                 DataBuffer m, IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void ztrevc( String side, String howmny,  DataBuffer select,
                 DataBuffer n, IComplexNumber t, DataBuffer ldt,
                 IComplexNumber vl, DataBuffer ldvl,
                 IComplexNumber vr, DataBuffer ldvr, DataBuffer mm,
                 DataBuffer m, IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void strsna( String job, String howmny,  DataBuffer select,
                 DataBuffer n,  INDArray t, DataBuffer ldt,
                 INDArray vl, DataBuffer ldvl,  INDArray vr,
                 DataBuffer ldvr, INDArray s, INDArray sep, DataBuffer mm,
                 DataBuffer m, INDArray work, DataBuffer ldwork,
                 DataBuffer iwork, DataBuffer info );
    void dtrsna( String job, String howmny,  DataBuffer select,
                 DataBuffer n,  INDArray t, DataBuffer ldt,
                 INDArray vl, DataBuffer ldvl,  INDArray vr,
                 DataBuffer ldvr, INDArray s, INDArray sep, DataBuffer mm,
                 DataBuffer m, INDArray work, DataBuffer ldwork,
                 DataBuffer iwork, DataBuffer info );
    void ctrsna( String job, String howmny,  DataBuffer select,
                 DataBuffer n,  IComplexNumber t,
                 DataBuffer ldt,  IComplexNumber vl,
                 DataBuffer ldvl,  IComplexNumber vr,
                 DataBuffer ldvr, INDArray s, INDArray sep, DataBuffer mm,
                 DataBuffer m, IComplexNumber work,
                 DataBuffer ldwork, INDArray rwork, DataBuffer info );
    void ztrsna( String job, String howmny,  DataBuffer select,
                 DataBuffer n,  IComplexNumber t,
                 DataBuffer ldt,  IComplexNumber vl,
                 DataBuffer ldvl,  IComplexNumber vr,
                 DataBuffer ldvr, INDArray s, INDArray sep, DataBuffer mm,
                 DataBuffer m, IComplexNumber work,
                 DataBuffer ldwork, INDArray rwork, DataBuffer info );
    void strexc( String compq, DataBuffer n, INDArray t, DataBuffer ldt,
                 INDArray q, DataBuffer ldq, DataBuffer ifst,
                 DataBuffer ilst, INDArray work, DataBuffer info );
    void dtrexc( String compq, DataBuffer n, INDArray t, DataBuffer ldt,
                 INDArray q, DataBuffer ldq, DataBuffer ifst,
                 DataBuffer ilst, INDArray work, DataBuffer info );
    void ctrexc( String compq, DataBuffer n, IComplexNumber t,
                 DataBuffer ldt, IComplexNumber q, DataBuffer ldq,
                 DataBuffer ifst, DataBuffer ilst, DataBuffer info );
    void ztrexc( String compq, DataBuffer n, IComplexNumber t,
                 DataBuffer ldt, IComplexNumber q, DataBuffer ldq,
                 DataBuffer ifst, DataBuffer ilst, DataBuffer info );
    void strsen( String job, String compq,  DataBuffer select,
                 DataBuffer n, INDArray t, DataBuffer ldt, INDArray q,
                 DataBuffer ldq, INDArray wr, INDArray wi, DataBuffer m,
                 INDArray s, INDArray sep, INDArray work, DataBuffer lwork,
                 DataBuffer iwork, DataBuffer liwork, DataBuffer info );
    void dtrsen( String job, String compq,  DataBuffer select,
                 DataBuffer n, INDArray t, DataBuffer ldt, INDArray q,
                 DataBuffer ldq, INDArray wr, INDArray wi, DataBuffer m,
                 INDArray s, INDArray sep, INDArray work, DataBuffer lwork,
                 DataBuffer iwork, DataBuffer liwork, DataBuffer info );
    void ctrsen( String job, String compq,  DataBuffer select,
                 DataBuffer n, IComplexNumber t, DataBuffer ldt,
                 IComplexNumber q, DataBuffer ldq,
                 IComplexNumber w, DataBuffer m, INDArray s,
                 INDArray sep, IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void ztrsen( String job, String compq,  DataBuffer select,
                 DataBuffer n, IComplexNumber t, DataBuffer ldt,
                 IComplexNumber q, DataBuffer ldq,
                 IComplexNumber w, DataBuffer m, INDArray s,
                 INDArray sep, IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void strsyl( String trana, String tranb, DataBuffer isgn, DataBuffer m,
                 DataBuffer n,  INDArray a, DataBuffer lda,
                 INDArray b, DataBuffer ldb, INDArray c, DataBuffer ldc,
                 INDArray scale, DataBuffer info );
    void dtrsyl( String trana, String tranb, DataBuffer isgn, DataBuffer m,
                 DataBuffer n,  INDArray a, DataBuffer lda,
                 INDArray b, DataBuffer ldb, INDArray c,
                 DataBuffer ldc, INDArray scale, DataBuffer info );
    void ctrsyl( String trana, String tranb, DataBuffer isgn, DataBuffer m,
                 DataBuffer n,  IComplexNumber a,
                 DataBuffer lda,  IComplexNumber b,
                 DataBuffer ldb, IComplexNumber c, DataBuffer ldc,
                 INDArray scale, DataBuffer info );
    void ztrsyl( String trana, String tranb, DataBuffer isgn, DataBuffer m,
                 DataBuffer n,  IComplexNumber a,
                 DataBuffer lda,  IComplexNumber b,
                 DataBuffer ldb, IComplexNumber c, DataBuffer ldc,
                 INDArray scale, DataBuffer info );
    void sgghrd( String compq, String compz, DataBuffer n, DataBuffer ilo,
                 DataBuffer ihi, INDArray a, DataBuffer lda, INDArray b,
                 DataBuffer ldb, INDArray q, DataBuffer ldq, INDArray z,
                 DataBuffer ldz, DataBuffer info );
    void dgghrd( String compq, String compz, DataBuffer n, DataBuffer ilo,
                 DataBuffer ihi, INDArray a, DataBuffer lda, INDArray b,
                 DataBuffer ldb, INDArray q, DataBuffer ldq, INDArray z,
                 DataBuffer ldz, DataBuffer info );
    void cgghrd( String compq, String compz, DataBuffer n, DataBuffer ilo,
                 DataBuffer ihi, IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber q, DataBuffer ldq,
                 IComplexNumber z, DataBuffer ldz,
                 DataBuffer info );
    void zgghrd( String compq, String compz, DataBuffer n, DataBuffer ilo,
                 DataBuffer ihi, IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber q, DataBuffer ldq,
                 IComplexNumber z, DataBuffer ldz,
                 DataBuffer info );
    void sgghd3( String compq, String compz, DataBuffer n, DataBuffer ilo,
                 DataBuffer ihi, INDArray a, DataBuffer lda, INDArray b,
                 DataBuffer ldb, INDArray q, DataBuffer ldq, INDArray z,
                 DataBuffer ldz, INDArray work, DataBuffer lwork,
                 DataBuffer info );
    void dgghd3( String compq, String compz, DataBuffer n, DataBuffer ilo,
                 DataBuffer ihi, INDArray a, DataBuffer lda, INDArray b,
                 DataBuffer ldb, INDArray q, DataBuffer ldq, INDArray z,
                 DataBuffer ldz, INDArray work, DataBuffer lwork,
                 DataBuffer info );
    void cgghd3( String compq, String compz, DataBuffer n,
                 DataBuffer ilo, DataBuffer ihi,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber q, DataBuffer ldq,
                 IComplexNumber z, DataBuffer ldz,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void zgghd3( String compq, String compz, DataBuffer n,
                 DataBuffer ilo, DataBuffer ihi,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber q, DataBuffer ldq,
                 IComplexNumber z, DataBuffer ldz,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer info );
    void sggbal( String job, DataBuffer n, INDArray a, DataBuffer lda,
                 INDArray b, DataBuffer ldb, DataBuffer ilo, DataBuffer ihi,
                 INDArray lscale, INDArray rscale, INDArray work,
                 DataBuffer info );
    void dggbal( String job, DataBuffer n, INDArray a, DataBuffer lda,
                 INDArray b, DataBuffer ldb, DataBuffer ilo,
                 DataBuffer ihi, INDArray lscale, INDArray rscale,
                 INDArray work, DataBuffer info );
    void cggbal( String job, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, IComplexNumber b, DataBuffer ldb,
                 DataBuffer ilo, DataBuffer ihi, INDArray lscale,
                 INDArray rscale, INDArray work, DataBuffer info );
    void zggbal( String job, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, IComplexNumber b, DataBuffer ldb,
                 DataBuffer ilo, DataBuffer ihi, INDArray lscale,
                 INDArray rscale, INDArray work, DataBuffer info );
    void sggbak( String job, String side, DataBuffer n, DataBuffer ilo,
                 DataBuffer ihi,  INDArray lscale,  INDArray rscale,
                 DataBuffer m, INDArray v, DataBuffer ldv,
                 DataBuffer info );
    void dggbak( String job, String side, DataBuffer n, DataBuffer ilo,
                 DataBuffer ihi,  INDArray lscale,  INDArray rscale,
                 DataBuffer m, INDArray v, DataBuffer ldv,
                 DataBuffer info );
    void cggbak( String job, String side, DataBuffer n, DataBuffer ilo,
                 DataBuffer ihi,  INDArray lscale,  INDArray rscale,
                 DataBuffer m, IComplexNumber v, DataBuffer ldv,
                 DataBuffer info );
    void zggbak( String job, String side, DataBuffer n, DataBuffer ilo,
                 DataBuffer ihi,  INDArray lscale,  INDArray rscale,
                 DataBuffer m, IComplexNumber v, DataBuffer ldv,
                 DataBuffer info );
    void shgeqz( String job, String compq, String compz, DataBuffer n,
                 DataBuffer ilo, DataBuffer ihi, INDArray h, DataBuffer ldh,
                 INDArray t, DataBuffer ldt, INDArray alphar, INDArray alphai,
                 INDArray beta, INDArray q, DataBuffer ldq, INDArray z,
                 DataBuffer ldz, INDArray work, DataBuffer lwork,
                 DataBuffer info );
    void dhgeqz( String job, String compq, String compz, DataBuffer n,
                 DataBuffer ilo, DataBuffer ihi, INDArray h,
                 DataBuffer ldh, INDArray t, DataBuffer ldt, INDArray alphar,
                 INDArray alphai, INDArray beta, INDArray q, DataBuffer ldq,
                 INDArray z, DataBuffer ldz, INDArray work, DataBuffer lwork,
                 DataBuffer info );
    void chgeqz( String job, String compq, String compz, DataBuffer n,
                 DataBuffer ilo, DataBuffer ihi, IComplexNumber h,
                 DataBuffer ldh, IComplexNumber t, DataBuffer ldt,
                 IComplexNumber alpha, IComplexNumber beta,
                 IComplexNumber q, DataBuffer ldq,
                 IComplexNumber z, DataBuffer ldz,
                 IComplexNumber work, DataBuffer lwork, INDArray rwork,
                 DataBuffer info );
    void zhgeqz( String job, String compq, String compz, DataBuffer n,
                 DataBuffer ilo, DataBuffer ihi, IComplexNumber h,
                 DataBuffer ldh, IComplexNumber t, DataBuffer ldt,
                 IComplexNumber alpha, IComplexNumber beta,
                 IComplexNumber q, DataBuffer ldq,
                 IComplexNumber z, DataBuffer ldz,
                 IComplexNumber work, DataBuffer lwork,
                 INDArray rwork, DataBuffer info );
    void stgevc( String side, String howmny,  DataBuffer select,
                 DataBuffer n,  INDArray s, DataBuffer lds,
                 INDArray p, DataBuffer ldp, INDArray vl,
                 DataBuffer ldvl, INDArray vr, DataBuffer ldvr,
                 DataBuffer mm, DataBuffer m, INDArray work,
                 DataBuffer info );
    void dtgevc( String side, String howmny,  DataBuffer select,
                 DataBuffer n,  INDArray s, DataBuffer lds,
                 INDArray p, DataBuffer ldp, INDArray vl,
                 DataBuffer ldvl, INDArray vr, DataBuffer ldvr,
                 DataBuffer mm, DataBuffer m, INDArray work,
                 DataBuffer info );
    void ctgevc( String side, String howmny,  DataBuffer select,
                 DataBuffer n,  IComplexNumber s,
                 DataBuffer lds,  IComplexNumber p,
                 DataBuffer ldp, IComplexNumber vl, DataBuffer ldvl,
                 IComplexNumber vr, DataBuffer ldvr, DataBuffer mm,
                 DataBuffer m, IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void ztgevc( String side, String howmny,  DataBuffer select,
                 DataBuffer n,  IComplexNumber s,
                 DataBuffer lds,  IComplexNumber p,
                 DataBuffer ldp, IComplexNumber vl,
                 DataBuffer ldvl, IComplexNumber vr,
                 DataBuffer ldvr, DataBuffer mm, DataBuffer m,
                 IComplexNumber work, INDArray rwork,
                 DataBuffer info );
    void stgexc( DataBuffer wantq, DataBuffer wantz, DataBuffer n,
                 INDArray a, DataBuffer lda, INDArray b, DataBuffer ldb,
                 INDArray q, DataBuffer ldq, INDArray z, DataBuffer ldz,
                 DataBuffer ifst, DataBuffer ilst, INDArray work,
                 DataBuffer lwork, DataBuffer info );
    void dtgexc( DataBuffer wantq, DataBuffer wantz, DataBuffer n,
                 INDArray a, DataBuffer lda, INDArray b, DataBuffer ldb,
                 INDArray q, DataBuffer ldq, INDArray z, DataBuffer ldz,
                 DataBuffer ifst, DataBuffer ilst, INDArray work,
                 DataBuffer lwork, DataBuffer info );
    void ctgexc( DataBuffer wantq, DataBuffer wantz, DataBuffer n,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber q, DataBuffer ldq,
                 IComplexNumber z, DataBuffer ldz, DataBuffer ifst,
                 DataBuffer ilst, DataBuffer info );
    void ztgexc( DataBuffer wantq, DataBuffer wantz, DataBuffer n,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber q, DataBuffer ldq,
                 IComplexNumber z, DataBuffer ldz, DataBuffer ifst,
                 DataBuffer ilst, DataBuffer info );
    void stgsen( DataBuffer ijob, DataBuffer wantq,
                 DataBuffer wantz,  DataBuffer select,
                 DataBuffer n, INDArray a, DataBuffer lda, INDArray b,
                 DataBuffer ldb, INDArray alphar, INDArray alphai, INDArray beta,
                 INDArray q, DataBuffer ldq, INDArray z, DataBuffer ldz,
                 DataBuffer m, INDArray pl, INDArray pr, INDArray dif,
                 INDArray work, DataBuffer lwork, DataBuffer iwork,
                 DataBuffer liwork, DataBuffer info );
    void dtgsen( DataBuffer ijob, DataBuffer wantq,
                 DataBuffer wantz,  DataBuffer select,
                 DataBuffer n, INDArray a, DataBuffer lda, INDArray b,
                 DataBuffer ldb, INDArray alphar, INDArray alphai,
                 INDArray beta, INDArray q, DataBuffer ldq, INDArray z,
                 DataBuffer ldz, DataBuffer m, INDArray pl, INDArray pr,
                 INDArray dif, INDArray work, DataBuffer lwork,
                 DataBuffer iwork, DataBuffer liwork, DataBuffer info );
    void ctgsen( DataBuffer ijob, DataBuffer wantq,
                 DataBuffer wantz,  DataBuffer select,
                 DataBuffer n, IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber alpha, IComplexNumber beta,
                 IComplexNumber q, DataBuffer ldq,
                 IComplexNumber z, DataBuffer ldz, DataBuffer m,
                 INDArray pl, INDArray pr, INDArray dif,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer iwork, DataBuffer liwork, DataBuffer info );
    void ztgsen( DataBuffer ijob, DataBuffer wantq,
                 DataBuffer wantz,  DataBuffer select,
                 DataBuffer n, IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber alpha, IComplexNumber beta,
                 IComplexNumber q, DataBuffer ldq,
                 IComplexNumber z, DataBuffer ldz, DataBuffer m,
                 INDArray pl, INDArray pr, INDArray dif,
                 IComplexNumber work, DataBuffer lwork,
                 DataBuffer iwork, DataBuffer liwork, DataBuffer info );
    void stgsyl( String trans, DataBuffer ijob, DataBuffer m, DataBuffer n,
                 INDArray a, DataBuffer lda,  INDArray b,
                 DataBuffer ldb, INDArray c, DataBuffer ldc,  INDArray d,
                 DataBuffer ldd,  INDArray e, DataBuffer lde, INDArray f,
                 DataBuffer ldf, INDArray scale, INDArray dif, INDArray work,
                 DataBuffer lwork, DataBuffer iwork, DataBuffer info );
    void dtgsyl( String trans, DataBuffer ijob, DataBuffer m, DataBuffer n,
                 INDArray a, DataBuffer lda,  INDArray b,
                 DataBuffer ldb, INDArray c, DataBuffer ldc,
                 INDArray d, DataBuffer ldd,  INDArray e,
                 DataBuffer lde, INDArray f, DataBuffer ldf, INDArray scale,
                 INDArray dif, INDArray work, DataBuffer lwork,
                 DataBuffer iwork, DataBuffer info );
    void ctgsyl( String trans, DataBuffer ijob, DataBuffer m, DataBuffer n,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber c, DataBuffer ldc,
                 IComplexNumber d, DataBuffer ldd,
                 IComplexNumber e, DataBuffer lde,
                 IComplexNumber f, DataBuffer ldf, INDArray scale,
                 INDArray dif, IComplexNumber work, DataBuffer lwork,
                 DataBuffer iwork, DataBuffer info );
    void ztgsyl( String trans, DataBuffer ijob, DataBuffer m, DataBuffer n,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber c, DataBuffer ldc,
                 IComplexNumber d, DataBuffer ldd,
                 IComplexNumber e, DataBuffer lde,
                 IComplexNumber f, DataBuffer ldf, INDArray scale,
                 INDArray dif, IComplexNumber work, DataBuffer lwork,
                 DataBuffer iwork, DataBuffer info );
    void stgsna( String job, String howmny,  DataBuffer select,
                 DataBuffer n,  INDArray a, DataBuffer lda,
                 INDArray b, DataBuffer ldb,  INDArray vl,
                 DataBuffer ldvl,  INDArray vr, DataBuffer ldvr,
                 INDArray s, INDArray dif, DataBuffer mm, DataBuffer m,
                 INDArray work, DataBuffer lwork, DataBuffer iwork,
                 DataBuffer info );
    void dtgsna( String job, String howmny,  DataBuffer select,
                 DataBuffer n,  INDArray a, DataBuffer lda,
                 INDArray b, DataBuffer ldb,  INDArray vl,
                 DataBuffer ldvl,  INDArray vr, DataBuffer ldvr,
                 INDArray s, INDArray dif, DataBuffer mm, DataBuffer m,
                 INDArray work, DataBuffer lwork, DataBuffer iwork,
                 DataBuffer info );
    void ctgsna( String job, String howmny,  DataBuffer select,
                 DataBuffer n,  IComplexNumber a,
                 DataBuffer lda,  IComplexNumber b,
                 DataBuffer ldb,  IComplexNumber vl,
                 DataBuffer ldvl,  IComplexNumber vr,
                 DataBuffer ldvr, INDArray s, INDArray dif, DataBuffer mm,
                 DataBuffer m, IComplexNumber work,
                 DataBuffer lwork, DataBuffer iwork, DataBuffer info );
    void ztgsna( String job, String howmny,  DataBuffer select,
                 DataBuffer n,  IComplexNumber a,
                 DataBuffer lda,  IComplexNumber b,
                 DataBuffer ldb,  IComplexNumber vl,
                 DataBuffer ldvl,  IComplexNumber vr,
                 DataBuffer ldvr, INDArray s, INDArray dif, DataBuffer mm,
                 DataBuffer m, IComplexNumber work,
                 DataBuffer lwork, DataBuffer iwork, DataBuffer info );
    void sggsvp( String jobu, String jobv, String jobq, DataBuffer m,
                 DataBuffer p, DataBuffer n, INDArray a, DataBuffer lda,
                 INDArray b, DataBuffer ldb, INDArray tola, INDArray tolb,
                 DataBuffer k, DataBuffer l, INDArray u, DataBuffer ldu,
                 INDArray v, DataBuffer ldv, INDArray q, DataBuffer ldq,
                 DataBuffer iwork, INDArray tau, INDArray work,
                 DataBuffer info );
    void dggsvp( String jobu, String jobv, String jobq, DataBuffer m,
                 DataBuffer p, DataBuffer n, INDArray a, DataBuffer lda,
                 INDArray b, DataBuffer ldb, INDArray tola, INDArray tolb,
                 DataBuffer k, DataBuffer l, INDArray u, DataBuffer ldu,
                 INDArray v, DataBuffer ldv, INDArray q, DataBuffer ldq,
                 DataBuffer iwork, INDArray tau, INDArray work,
                 DataBuffer info );
    void cggsvp( String jobu, String jobv, String jobq, DataBuffer m,
                 DataBuffer p, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, IComplexNumber b, DataBuffer ldb,
                 INDArray tola, INDArray tolb, DataBuffer k, DataBuffer l,
                 IComplexNumber u, DataBuffer ldu,
                 IComplexNumber v, DataBuffer ldv,
                 IComplexNumber q, DataBuffer ldq, DataBuffer iwork,
                 INDArray rwork, IComplexNumber tau,
                 IComplexNumber work, DataBuffer info );
    void zggsvp( String jobu, String jobv, String jobq, DataBuffer m,
                 DataBuffer p, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, IComplexNumber b, DataBuffer ldb,
                 INDArray tola, INDArray tolb, DataBuffer k, DataBuffer l,
                 IComplexNumber u, DataBuffer ldu,
                 IComplexNumber v, DataBuffer ldv,
                 IComplexNumber q, DataBuffer ldq,
                 DataBuffer iwork, INDArray rwork,
                 IComplexNumber tau, IComplexNumber work,
                 DataBuffer info );
    void sggsvp3( String jobu, String jobv, String jobq, DataBuffer m,
                  DataBuffer p, DataBuffer n, INDArray a, DataBuffer lda,
                  INDArray b, DataBuffer ldb, INDArray tola, INDArray tolb,
                  DataBuffer k, DataBuffer l, INDArray u, DataBuffer ldu,
                  INDArray v, DataBuffer ldv, INDArray q, DataBuffer ldq,
                  DataBuffer iwork, INDArray tau, INDArray work,
                  DataBuffer lwork, DataBuffer info );
    void dggsvp3( String jobu, String jobv, String jobq, DataBuffer m,
                  DataBuffer p, DataBuffer n, INDArray a, DataBuffer lda,
                  INDArray b, DataBuffer ldb, INDArray tola, INDArray tolb,
                  DataBuffer k, DataBuffer l, INDArray u, DataBuffer ldu,
                  INDArray v, DataBuffer ldv, INDArray q, DataBuffer ldq,
                  DataBuffer iwork, INDArray tau, INDArray work,
                  DataBuffer lwork, DataBuffer info );
    void cggsvp3( String jobu, String jobv, String jobq, DataBuffer m,
                  DataBuffer p, DataBuffer n, IComplexNumber a,
                  DataBuffer lda, IComplexNumber b, DataBuffer ldb,
                  INDArray tola, INDArray tolb, DataBuffer k, DataBuffer l,
                  IComplexNumber u, DataBuffer ldu,
                  IComplexNumber v, DataBuffer ldv,
                  IComplexNumber q, DataBuffer ldq, DataBuffer iwork,
                  INDArray rwork, IComplexNumber tau,
                  IComplexNumber work, DataBuffer lwork,
                  DataBuffer info );
    void zggsvp3( String jobu, String jobv, String jobq, DataBuffer m,
                  DataBuffer p, DataBuffer n, IComplexNumber a,
                  DataBuffer lda, IComplexNumber b, DataBuffer ldb,
                  INDArray tola, INDArray tolb, DataBuffer k, DataBuffer l,
                  IComplexNumber u, DataBuffer ldu,
                  IComplexNumber v, DataBuffer ldv,
                  IComplexNumber q, DataBuffer ldq,
                  DataBuffer iwork, INDArray rwork,
                  IComplexNumber tau, IComplexNumber work,
                  DataBuffer lwork, DataBuffer info );
    void stgsja( String jobu, String jobv, String jobq, DataBuffer m,
                 DataBuffer p, DataBuffer n, DataBuffer k, DataBuffer l,
                 INDArray a, DataBuffer lda, INDArray b, DataBuffer ldb,
                 INDArray tola, INDArray tolb, INDArray alpha, INDArray beta,
                 INDArray u, DataBuffer ldu, INDArray v, DataBuffer ldv,
                 INDArray q, DataBuffer ldq, INDArray work, DataBuffer ncycle,
                 DataBuffer info );
    void dtgsja( String jobu, String jobv, String jobq, DataBuffer m,
                 DataBuffer p, DataBuffer n, DataBuffer k, DataBuffer l,
                 INDArray a, DataBuffer lda, INDArray b, DataBuffer ldb,
                 INDArray tola, INDArray tolb, INDArray alpha, INDArray beta,
                 INDArray u, DataBuffer ldu, INDArray v, DataBuffer ldv,
                 INDArray q, DataBuffer ldq, INDArray work,
                 DataBuffer ncycle, DataBuffer info );
    void ctgsja( String jobu, String jobv, String jobq, DataBuffer m,
                 DataBuffer p, DataBuffer n, DataBuffer k, DataBuffer l,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb, INDArray tola,
                 INDArray tolb, INDArray alpha, INDArray beta,
                 IComplexNumber u, DataBuffer ldu,
                 IComplexNumber v, DataBuffer ldv,
                 IComplexNumber q, DataBuffer ldq,
                 IComplexNumber work, DataBuffer ncycle,
                 DataBuffer info );
    void ztgsja( String jobu, String jobv, String jobq, DataBuffer m,
                 DataBuffer p, DataBuffer n, DataBuffer k, DataBuffer l,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb, INDArray tola,
                 INDArray tolb, INDArray alpha, INDArray beta,
                 IComplexNumber u, DataBuffer ldu,
                 IComplexNumber v, DataBuffer ldv,
                 IComplexNumber q, DataBuffer ldq,
                 IComplexNumber work, DataBuffer ncycle,
                 DataBuffer info );
    void sgels( String trans, DataBuffer m, DataBuffer n, DataBuffer nrhs,
                INDArray a, DataBuffer lda, INDArray b, DataBuffer ldb,
                INDArray work, DataBuffer lwork, DataBuffer info );
    void dgels( String trans, DataBuffer m, DataBuffer n, DataBuffer nrhs,
                INDArray a, DataBuffer lda, INDArray b, DataBuffer ldb,
                INDArray work, DataBuffer lwork, DataBuffer info );
    void cgels( String trans, DataBuffer m, DataBuffer n, DataBuffer nrhs,
                IComplexNumber a, DataBuffer lda,
                IComplexNumber b, DataBuffer ldb,
                IComplexNumber work, DataBuffer lwork,
                DataBuffer info );
    void zgels( String trans, DataBuffer m, DataBuffer n, DataBuffer nrhs,
                IComplexNumber a, DataBuffer lda,
                IComplexNumber b, DataBuffer ldb,
                IComplexNumber work, DataBuffer lwork,
                DataBuffer info );
    void sgelsy( DataBuffer m, DataBuffer n, DataBuffer nrhs, INDArray a,
                 DataBuffer lda, INDArray b, DataBuffer ldb,
                 DataBuffer jpvt, INDArray rcond, DataBuffer rank,
                 INDArray work, DataBuffer lwork, DataBuffer info );
    void dgelsy( DataBuffer m, DataBuffer n, DataBuffer nrhs, INDArray a,
                 DataBuffer lda, INDArray b, DataBuffer ldb,
                 DataBuffer jpvt, INDArray rcond, DataBuffer rank,
                 INDArray work, DataBuffer lwork, DataBuffer info );
    void cgelsy( DataBuffer m, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb, DataBuffer jpvt,
                 INDArray rcond, DataBuffer rank, IComplexNumber work,
                 DataBuffer lwork, INDArray rwork, DataBuffer info );
    void zgelsy( DataBuffer m, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb, DataBuffer jpvt,
                 INDArray rcond, DataBuffer rank,
                 IComplexNumber work, DataBuffer lwork,
                 INDArray rwork, DataBuffer info );
    void sgelss( DataBuffer m, DataBuffer n, DataBuffer nrhs, INDArray a,
                 DataBuffer lda, INDArray b, DataBuffer ldb, INDArray s,
                 INDArray rcond, DataBuffer rank, INDArray work,
                 DataBuffer lwork, DataBuffer info );
    void dgelss( DataBuffer m, DataBuffer n, DataBuffer nrhs, INDArray a,
                 DataBuffer lda, INDArray b, DataBuffer ldb, INDArray s,
                 INDArray rcond, DataBuffer rank, INDArray work,
                 DataBuffer lwork, DataBuffer info );
    void cgelss( DataBuffer m, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb, INDArray s,
                 INDArray rcond, DataBuffer rank, IComplexNumber work,
                 DataBuffer lwork, INDArray rwork, DataBuffer info );
    void zgelss( DataBuffer m, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb, INDArray s,
                 INDArray rcond, DataBuffer rank,
                 IComplexNumber work, DataBuffer lwork,
                 INDArray rwork, DataBuffer info );
    void sgelsd( DataBuffer m, DataBuffer n, DataBuffer nrhs, INDArray a,
                 DataBuffer lda, INDArray b, DataBuffer ldb, INDArray s,
                 INDArray rcond, DataBuffer rank, INDArray work,
                 DataBuffer lwork, DataBuffer iwork, DataBuffer info );
    void dgelsd( DataBuffer m, DataBuffer n, DataBuffer nrhs, INDArray a,
                 DataBuffer lda, INDArray b, DataBuffer ldb, INDArray s,
                 INDArray rcond, DataBuffer rank, INDArray work,
                 DataBuffer lwork, DataBuffer iwork, DataBuffer info );
    void cgelsd( DataBuffer m, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb, INDArray s,
                 INDArray rcond, DataBuffer rank, IComplexNumber work,
                 DataBuffer lwork, INDArray rwork, DataBuffer iwork,
                 DataBuffer info );
    void zgelsd( DataBuffer m, DataBuffer n, DataBuffer nrhs,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb, INDArray s,
                 INDArray rcond, DataBuffer rank,
                 IComplexNumber work, DataBuffer lwork,
                 INDArray rwork, DataBuffer iwork, DataBuffer info );
    void sgglse( DataBuffer m, DataBuffer n, DataBuffer p, INDArray a,
                 DataBuffer lda, INDArray b, DataBuffer ldb, INDArray c,
                 INDArray d, INDArray x, INDArray work, DataBuffer lwork,
                 DataBuffer info );
    void dgglse( DataBuffer m, DataBuffer n, DataBuffer p, INDArray a,
                 DataBuffer lda, INDArray b, DataBuffer ldb, INDArray c,
                 INDArray d, INDArray x, INDArray work, DataBuffer lwork,
                 DataBuffer info );
    void cgglse( DataBuffer m, DataBuffer n, DataBuffer p,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber c, IComplexNumber d,
                 IComplexNumber x, IComplexNumber work,
                 DataBuffer lwork, DataBuffer info );
    void zgglse( DataBuffer m, DataBuffer n, DataBuffer p,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber c, IComplexNumber d,
                 IComplexNumber x, IComplexNumber work,
                 DataBuffer lwork, DataBuffer info );
    void sggglm( DataBuffer n, DataBuffer m, DataBuffer p, INDArray a,
                 DataBuffer lda, INDArray b, DataBuffer ldb, INDArray d,
                 INDArray x, INDArray y, INDArray work, DataBuffer lwork,
                 DataBuffer info );
    void dggglm( DataBuffer n, DataBuffer m, DataBuffer p, INDArray a,
                 DataBuffer lda, INDArray b, DataBuffer ldb, INDArray d,
                 INDArray x, INDArray y, INDArray work, DataBuffer lwork,
                 DataBuffer info );
    void cggglm( DataBuffer n, DataBuffer m, DataBuffer p,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber d, IComplexNumber x,
                 IComplexNumber y, IComplexNumber work,
                 DataBuffer lwork, DataBuffer info );
    void zggglm( DataBuffer n, DataBuffer m, DataBuffer p,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber d, IComplexNumber x,
                 IComplexNumber y, IComplexNumber work,
                 DataBuffer lwork, DataBuffer info );
    void ssyev( String jobz, String uplo, DataBuffer n, INDArray a,
                DataBuffer lda, INDArray w, INDArray work, DataBuffer lwork,
                DataBuffer info );
    void dsyev( String jobz, String uplo, DataBuffer n, INDArray a,
                DataBuffer lda, INDArray w, INDArray work, DataBuffer lwork,
                DataBuffer info );
    void cheev( String jobz, String uplo, DataBuffer n,
                IComplexNumber a, DataBuffer lda, INDArray w,
                IComplexNumber work, DataBuffer lwork, INDArray rwork,
                DataBuffer info );
    void zheev( String jobz, String uplo, DataBuffer n,
                IComplexNumber a, DataBuffer lda, INDArray w,
                IComplexNumber work, DataBuffer lwork,
                INDArray rwork, DataBuffer info );
    void ssyevd( String jobz, String uplo, DataBuffer n, INDArray a,
                 DataBuffer lda, INDArray w, INDArray work, DataBuffer lwork,
                 DataBuffer iwork, DataBuffer liwork, DataBuffer info );
    void dsyevd( String jobz, String uplo, DataBuffer n, INDArray a,
                 DataBuffer lda, INDArray w, INDArray work, DataBuffer lwork,
                 DataBuffer iwork, DataBuffer liwork, DataBuffer info );
    void cheevd( String jobz, String uplo, DataBuffer n,
                 IComplexNumber a, DataBuffer lda, INDArray w,
                 IComplexNumber work, DataBuffer lwork, INDArray rwork,
                 DataBuffer lrwork, DataBuffer iwork, DataBuffer liwork,
                 DataBuffer info );
    void zheevd( String jobz, String uplo, DataBuffer n,
                 IComplexNumber a, DataBuffer lda, INDArray w,
                 IComplexNumber work, DataBuffer lwork,
                 INDArray rwork, DataBuffer lrwork, DataBuffer iwork,
                 DataBuffer liwork, DataBuffer info );
    void ssyevx( String jobz, String range, String uplo, DataBuffer n,
                 INDArray a, DataBuffer lda, INDArray vl, INDArray vu,
                 DataBuffer il, DataBuffer iu, INDArray abstol,
                 DataBuffer m, INDArray w, INDArray z, DataBuffer ldz,
                 INDArray work, DataBuffer lwork, DataBuffer iwork,
                 DataBuffer ifail, DataBuffer info );
    void dsyevx( String jobz, String range, String uplo, DataBuffer n,
                 INDArray a, DataBuffer lda, INDArray vl, INDArray vu,
                 DataBuffer il, DataBuffer iu, INDArray abstol,
                 DataBuffer m, INDArray w, INDArray z, DataBuffer ldz,
                 INDArray work, DataBuffer lwork, DataBuffer iwork,
                 DataBuffer ifail, DataBuffer info );
    void cheevx( String jobz, String range, String uplo, DataBuffer n,
                 IComplexNumber a, DataBuffer lda, INDArray vl,
                 INDArray vu, DataBuffer il, DataBuffer iu, INDArray abstol,
                 DataBuffer m, INDArray w, IComplexNumber z,
                 DataBuffer ldz, IComplexNumber work,
                 DataBuffer lwork, INDArray rwork, DataBuffer iwork,
                 DataBuffer ifail, DataBuffer info );
    void zheevx( String jobz, String range, String uplo, DataBuffer n,
                 IComplexNumber a, DataBuffer lda, INDArray vl,
                 INDArray vu, DataBuffer il, DataBuffer iu, INDArray abstol,
                 DataBuffer m, INDArray w, IComplexNumber z,
                 DataBuffer ldz, IComplexNumber work,
                 DataBuffer lwork, INDArray rwork, DataBuffer iwork,
                 DataBuffer ifail, DataBuffer info );
    void ssyevr( String jobz, String range, String uplo, DataBuffer n,
                 INDArray a, DataBuffer lda, INDArray vl, INDArray vu,
                 DataBuffer il, DataBuffer iu, INDArray abstol,
                 DataBuffer m, INDArray w, INDArray z, DataBuffer ldz,
                 DataBuffer isuppz, INDArray work, DataBuffer lwork,
                 DataBuffer iwork, DataBuffer liwork, DataBuffer info );
    void dsyevr( String jobz, String range, String uplo, DataBuffer n,
                 INDArray a, DataBuffer lda, INDArray vl, INDArray vu,
                 DataBuffer il, DataBuffer iu, INDArray abstol,
                 DataBuffer m, INDArray w, INDArray z, DataBuffer ldz,
                 DataBuffer isuppz, INDArray work, DataBuffer lwork,
                 DataBuffer iwork, DataBuffer liwork, DataBuffer info );
    void cheevr( String jobz, String range, String uplo, DataBuffer n,
                 IComplexNumber a, DataBuffer lda, INDArray vl,
                 INDArray vu, DataBuffer il, DataBuffer iu, INDArray abstol,
                 DataBuffer m, INDArray w, IComplexNumber z,
                 DataBuffer ldz, DataBuffer isuppz,
                 IComplexNumber work, DataBuffer lwork, INDArray rwork,
                 DataBuffer lrwork, DataBuffer iwork, DataBuffer liwork,
                 DataBuffer info );
    void zheevr( String jobz, String range, String uplo, DataBuffer n,
                 IComplexNumber a, DataBuffer lda, INDArray vl,
                 INDArray vu, DataBuffer il, DataBuffer iu, INDArray abstol,
                 DataBuffer m, INDArray w, IComplexNumber z,
                 DataBuffer ldz, DataBuffer isuppz,
                 IComplexNumber work, DataBuffer lwork,
                 INDArray rwork, DataBuffer lrwork, DataBuffer iwork,
                 DataBuffer liwork, DataBuffer info );
    void sspev( String jobz, String uplo, DataBuffer n, INDArray ap, INDArray w,
                INDArray z, DataBuffer ldz, INDArray work, DataBuffer info );
    void dspev( String jobz, String uplo, DataBuffer n, INDArray ap, INDArray w,
                INDArray z, DataBuffer ldz, INDArray work, DataBuffer info );
    void chpev( String jobz, String uplo, DataBuffer n,
                IComplexNumber ap, INDArray w, IComplexNumber z,
                DataBuffer ldz, IComplexNumber work, INDArray rwork,
                DataBuffer info );
    void zhpev( String jobz, String uplo, DataBuffer n,
                IComplexNumber ap, INDArray w,
                IComplexNumber z, DataBuffer ldz,
                IComplexNumber work, INDArray rwork,
                DataBuffer info );
    void sspevd( String jobz, String uplo, DataBuffer n, INDArray ap, INDArray w,
                 INDArray z, DataBuffer ldz, INDArray work, DataBuffer lwork,
                 DataBuffer iwork, DataBuffer liwork, DataBuffer info );
    void dspevd( String jobz, String uplo, DataBuffer n, INDArray ap,
                 INDArray w, INDArray z, DataBuffer ldz, INDArray work,
                 DataBuffer lwork, DataBuffer iwork, DataBuffer liwork,
                 DataBuffer info );
    void chpevd( String jobz, String uplo, DataBuffer n,
                 IComplexNumber ap, INDArray w, IComplexNumber z,
                 DataBuffer ldz, IComplexNumber work,
                 DataBuffer lwork, INDArray rwork, DataBuffer lrwork,
                 DataBuffer iwork, DataBuffer liwork, DataBuffer info );
    void zhpevd( String jobz, String uplo, DataBuffer n,
                 IComplexNumber ap, INDArray w,
                 IComplexNumber z, DataBuffer ldz,
                 IComplexNumber work, DataBuffer lwork,
                 INDArray rwork, DataBuffer lrwork, DataBuffer iwork,
                 DataBuffer liwork, DataBuffer info );
    void sspevx( String jobz, String range, String uplo, DataBuffer n,
                 INDArray ap, INDArray vl, INDArray vu, DataBuffer il,
                 DataBuffer iu, INDArray abstol, DataBuffer m, INDArray w,
                 INDArray z, DataBuffer ldz, INDArray work, DataBuffer iwork,
                 DataBuffer ifail, DataBuffer info );
    void dspevx( String jobz, String range, String uplo, DataBuffer n,
                 INDArray ap, INDArray vl, INDArray vu, DataBuffer il,
                 DataBuffer iu, INDArray abstol, DataBuffer m, INDArray w,
                 INDArray z, DataBuffer ldz, INDArray work, DataBuffer iwork,
                 DataBuffer ifail, DataBuffer info );
    void chpevx( String jobz, String range, String uplo, DataBuffer n,
                 IComplexNumber ap, INDArray vl, INDArray vu,
                 DataBuffer il, DataBuffer iu, INDArray abstol,
                 DataBuffer m, INDArray w, IComplexNumber z,
                 DataBuffer ldz, IComplexNumber work, INDArray rwork,
                 DataBuffer iwork, DataBuffer ifail, DataBuffer info );
    void zhpevx( String jobz, String range, String uplo, DataBuffer n,
                 IComplexNumber ap, INDArray vl, INDArray vu,
                 DataBuffer il, DataBuffer iu, INDArray abstol,
                 DataBuffer m, INDArray w, IComplexNumber z,
                 DataBuffer ldz, IComplexNumber work, INDArray rwork,
                 DataBuffer iwork, DataBuffer ifail, DataBuffer info );
    void ssbev( String jobz, String uplo, DataBuffer n, DataBuffer kd,
                INDArray ab, DataBuffer ldab, INDArray w, INDArray z,
                DataBuffer ldz, INDArray work, DataBuffer info );
    void dsbev( String jobz, String uplo, DataBuffer n, DataBuffer kd,
                INDArray ab, DataBuffer ldab, INDArray w, INDArray z,
                DataBuffer ldz, INDArray work, DataBuffer info );
    void chbev( String jobz, String uplo, DataBuffer n, DataBuffer kd,
                IComplexNumber ab, DataBuffer ldab, INDArray w,
                IComplexNumber z, DataBuffer ldz,
                IComplexNumber work, INDArray rwork, DataBuffer info );
    void zhbev( String jobz, String uplo, DataBuffer n, DataBuffer kd,
                IComplexNumber ab, DataBuffer ldab, INDArray w,
                IComplexNumber z, DataBuffer ldz,
                IComplexNumber work, INDArray rwork,
                DataBuffer info );
    void ssbevd( String jobz, String uplo, DataBuffer n, DataBuffer kd,
                 INDArray ab, DataBuffer ldab, INDArray w, INDArray z,
                 DataBuffer ldz, INDArray work, DataBuffer lwork,
                 DataBuffer iwork, DataBuffer liwork, DataBuffer info );
    void dsbevd( String jobz, String uplo, DataBuffer n, DataBuffer kd,
                 INDArray ab, DataBuffer ldab, INDArray w, INDArray z,
                 DataBuffer ldz, INDArray work, DataBuffer lwork,
                 DataBuffer iwork, DataBuffer liwork, DataBuffer info );
    void chbevd( String jobz, String uplo, DataBuffer n, DataBuffer kd,
                 IComplexNumber ab, DataBuffer ldab, INDArray w,
                 IComplexNumber z, DataBuffer ldz,
                 IComplexNumber work, DataBuffer lwork, INDArray rwork,
                 DataBuffer lrwork, DataBuffer iwork, DataBuffer liwork,
                 DataBuffer info );
    void zhbevd( String jobz, String uplo, DataBuffer n, DataBuffer kd,
                 IComplexNumber ab, DataBuffer ldab, INDArray w,
                 IComplexNumber z, DataBuffer ldz,
                 IComplexNumber work, DataBuffer lwork,
                 INDArray rwork, DataBuffer lrwork, DataBuffer iwork,
                 DataBuffer liwork, DataBuffer info );
    void ssbevx( String jobz, String range, String uplo, DataBuffer n,
                 DataBuffer kd, INDArray ab, DataBuffer ldab, INDArray q,
                 DataBuffer ldq, INDArray vl, INDArray vu, DataBuffer il,
                 DataBuffer iu, INDArray abstol, DataBuffer m, INDArray w,
                 INDArray z, DataBuffer ldz, INDArray work, DataBuffer iwork,
                 DataBuffer ifail, DataBuffer info );
    void dsbevx( String jobz, String range, String uplo, DataBuffer n,
                 DataBuffer kd, INDArray ab, DataBuffer ldab, INDArray q,
                 DataBuffer ldq, INDArray vl, INDArray vu, DataBuffer il,
                 DataBuffer iu, INDArray abstol, DataBuffer m, INDArray w,
                 INDArray z, DataBuffer ldz, INDArray work, DataBuffer iwork,
                 DataBuffer ifail, DataBuffer info );
    void chbevx( String jobz, String range, String uplo, DataBuffer n,
                 DataBuffer kd, IComplexNumber ab, DataBuffer ldab,
                 IComplexNumber q, DataBuffer ldq, INDArray vl,
                 INDArray vu, DataBuffer il, DataBuffer iu, INDArray abstol,
                 DataBuffer m, INDArray w, IComplexNumber z,
                 DataBuffer ldz, IComplexNumber work, INDArray rwork,
                 DataBuffer iwork, DataBuffer ifail, DataBuffer info );
    void zhbevx( String jobz, String range, String uplo, DataBuffer n,
                 DataBuffer kd, IComplexNumber ab, DataBuffer ldab,
                 IComplexNumber q, DataBuffer ldq, INDArray vl,
                 INDArray vu, DataBuffer il, DataBuffer iu, INDArray abstol,
                 DataBuffer m, INDArray w, IComplexNumber z,
                 DataBuffer ldz, IComplexNumber work, INDArray rwork,
                 DataBuffer iwork, DataBuffer ifail, DataBuffer info );
    void sstev( String jobz, DataBuffer n, INDArray d, INDArray e, INDArray z,
                DataBuffer ldz, INDArray work, DataBuffer info );
    void dstev( String jobz, DataBuffer n, INDArray d, INDArray e, INDArray z,
                DataBuffer ldz, INDArray work, DataBuffer info );
    void sstevd( String jobz, DataBuffer n, INDArray d, INDArray e, INDArray z,
                 DataBuffer ldz, INDArray work, DataBuffer lwork,
                 DataBuffer iwork, DataBuffer liwork, DataBuffer info );
    void dstevd( String jobz, DataBuffer n, INDArray d, INDArray e, INDArray z,
                 DataBuffer ldz, INDArray work, DataBuffer lwork,
                 DataBuffer iwork, DataBuffer liwork, DataBuffer info );
    void sstevx( String jobz, String range, DataBuffer n, INDArray d, INDArray e,
                 INDArray vl, INDArray vu, DataBuffer il, DataBuffer iu,
                 INDArray abstol, DataBuffer m, INDArray w, INDArray z,
                 DataBuffer ldz, INDArray work, DataBuffer iwork,
                 DataBuffer ifail, DataBuffer info );
    void dstevx( String jobz, String range, DataBuffer n, INDArray d,
                 INDArray e, INDArray vl, INDArray vu, DataBuffer il,
                 DataBuffer iu, INDArray abstol, DataBuffer m, INDArray w,
                 INDArray z, DataBuffer ldz, INDArray work, DataBuffer iwork,
                 DataBuffer ifail, DataBuffer info );
    void sstevr( String jobz, String range, DataBuffer n, INDArray d, INDArray e,
                 INDArray vl, INDArray vu, DataBuffer il, DataBuffer iu,
                 INDArray abstol, DataBuffer m, INDArray w, INDArray z,
                 DataBuffer ldz, DataBuffer isuppz, INDArray work,
                 DataBuffer lwork, DataBuffer iwork, DataBuffer liwork,
                 DataBuffer info );
    void dstevr( String jobz, String range, DataBuffer n, INDArray d,
                 INDArray e, INDArray vl, INDArray vu, DataBuffer il,
                 DataBuffer iu, INDArray abstol, DataBuffer m, INDArray w,
                 INDArray z, DataBuffer ldz, DataBuffer isuppz,
                 INDArray work, DataBuffer lwork, DataBuffer iwork,
                 DataBuffer liwork, DataBuffer info );
    void sgees( String jobvs, String sort, int select,
                DataBuffer n, INDArray a, DataBuffer lda, DataBuffer sdim,
                INDArray wr, INDArray wi, INDArray vs, DataBuffer ldvs,
                INDArray work, DataBuffer lwork, DataBuffer bwork,
                DataBuffer info );
    void dgees( String jobvs, String sort, int select,
                DataBuffer n, INDArray a, DataBuffer lda, DataBuffer sdim,
                INDArray wr, INDArray wi, INDArray vs, DataBuffer ldvs,
                INDArray work, DataBuffer lwork, DataBuffer bwork,
                DataBuffer info );
    void cgees( String jobvs, String sort, int select,
                DataBuffer n, IComplexNumber a, DataBuffer lda,
                DataBuffer sdim, IComplexNumber w,
                IComplexNumber vs, DataBuffer ldvs,
                IComplexNumber work, DataBuffer lwork, INDArray rwork,
                DataBuffer bwork, DataBuffer info );
    void zgees( String jobvs, String sort, int select,
                DataBuffer n, IComplexNumber a, DataBuffer lda,
                DataBuffer sdim, IComplexNumber w,
                IComplexNumber vs, DataBuffer ldvs,
                IComplexNumber work, DataBuffer lwork,
                INDArray rwork, DataBuffer bwork, DataBuffer info );
    void sgeesx( String jobvs, String sort, int select,
                 String sense, DataBuffer n, INDArray a, DataBuffer lda,
                 DataBuffer sdim, INDArray wr, INDArray wi, INDArray vs,
                 DataBuffer ldvs, INDArray rconde, INDArray rcondv, INDArray work,
                 DataBuffer lwork, DataBuffer iwork, DataBuffer liwork,
                 DataBuffer bwork, DataBuffer info );
    void dgeesx( String jobvs, String sort, int select,
                 String sense, DataBuffer n, INDArray a, DataBuffer lda,
                 DataBuffer sdim, INDArray wr, INDArray wi, INDArray vs,
                 DataBuffer ldvs, INDArray rconde, INDArray rcondv,
                 INDArray work, DataBuffer lwork, DataBuffer iwork,
                 DataBuffer liwork, DataBuffer bwork,
                 DataBuffer info );
    void cgeesx( String jobvs, String sort, int select,
                 String sense, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, DataBuffer sdim, IComplexNumber w,
                 IComplexNumber vs, DataBuffer ldvs, INDArray rconde,
                 INDArray rcondv, IComplexNumber work,
                 DataBuffer lwork, INDArray rwork, DataBuffer bwork,
                 DataBuffer info );
    void zgeesx( String jobvs, String sort, int select,
                 String sense, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, DataBuffer sdim, IComplexNumber w,
                 IComplexNumber vs, DataBuffer ldvs, INDArray rconde,
                 INDArray rcondv, IComplexNumber work,
                 DataBuffer lwork, INDArray rwork, DataBuffer bwork,
                 DataBuffer info );
    void sgeev( String jobvl, String jobvr, DataBuffer n, INDArray a,
                DataBuffer lda, INDArray wr, INDArray wi, INDArray vl,
                DataBuffer ldvl, INDArray vr, DataBuffer ldvr, INDArray work,
                DataBuffer lwork, DataBuffer info );
    void dgeev( String jobvl, String jobvr, DataBuffer n, INDArray a,
                DataBuffer lda, INDArray wr, INDArray wi, INDArray vl,
                DataBuffer ldvl, INDArray vr, DataBuffer ldvr, INDArray work,
                DataBuffer lwork, DataBuffer info );
    void cgeev( String jobvl, String jobvr, DataBuffer n,
                IComplexNumber a, DataBuffer lda,
                IComplexNumber w, IComplexNumber vl,
                DataBuffer ldvl, IComplexNumber vr, DataBuffer ldvr,
                IComplexNumber work, DataBuffer lwork, INDArray rwork,
                DataBuffer info );
    void zgeev( String jobvl, String jobvr, DataBuffer n,
                IComplexNumber a, DataBuffer lda,
                IComplexNumber w, IComplexNumber vl,
                DataBuffer ldvl, IComplexNumber vr,
                DataBuffer ldvr, IComplexNumber work,
                DataBuffer lwork, INDArray rwork, DataBuffer info );
    void sgeevx( String balanc, String jobvl, String jobvr, String sense,
                 DataBuffer n, INDArray a, DataBuffer lda, INDArray wr,
                 INDArray wi, INDArray vl, DataBuffer ldvl, INDArray vr,
                 DataBuffer ldvr, DataBuffer ilo, DataBuffer ihi,
                 INDArray scale, INDArray abnrm, INDArray rconde, INDArray rcondv,
                 INDArray work, DataBuffer lwork, DataBuffer iwork,
                 DataBuffer info );
    void dgeevx( String balanc, String jobvl, String jobvr, String sense,
                 DataBuffer n, INDArray a, DataBuffer lda, INDArray wr,
                 INDArray wi, INDArray vl, DataBuffer ldvl, INDArray vr,
                 DataBuffer ldvr, DataBuffer ilo, DataBuffer ihi,
                 INDArray scale, INDArray abnrm, INDArray rconde,
                 INDArray rcondv, INDArray work, DataBuffer lwork,
                 DataBuffer iwork, DataBuffer info );
    void cgeevx( String balanc, String jobvl, String jobvr, String sense,
                 DataBuffer n, IComplexNumber a, DataBuffer lda,
                 IComplexNumber w, IComplexNumber vl,
                 DataBuffer ldvl, IComplexNumber vr,
                 DataBuffer ldvr, DataBuffer ilo, DataBuffer ihi,
                 INDArray scale, INDArray abnrm, INDArray rconde, INDArray rcondv,
                 IComplexNumber work, DataBuffer lwork, INDArray rwork,
                 DataBuffer info );
    void zgeevx( String balanc, String jobvl, String jobvr, String sense,
                 DataBuffer n, IComplexNumber a, DataBuffer lda,
                 IComplexNumber w, IComplexNumber vl,
                 DataBuffer ldvl, IComplexNumber vr,
                 DataBuffer ldvr, DataBuffer ilo, DataBuffer ihi,
                 INDArray scale, INDArray abnrm, INDArray rconde,
                 INDArray rcondv, IComplexNumber work,
                 DataBuffer lwork, INDArray rwork, DataBuffer info );
    void sgesvd( String jobu, String jobvt, DataBuffer m, DataBuffer n,
                 INDArray a, DataBuffer lda, INDArray s, INDArray u,
                 DataBuffer ldu, INDArray vt, DataBuffer ldvt, INDArray work,
                 DataBuffer lwork, DataBuffer info );
    void dgesvd( String jobu, String jobvt, DataBuffer m, DataBuffer n,
                 INDArray a, DataBuffer lda, INDArray s, INDArray u,
                 DataBuffer ldu, INDArray vt, DataBuffer ldvt, INDArray work,
                 DataBuffer lwork, DataBuffer info );
    void cgesvd( String jobu, String jobvt, DataBuffer m, DataBuffer n,
                 IComplexNumber a, DataBuffer lda, INDArray s,
                 IComplexNumber u, DataBuffer ldu,
                 IComplexNumber vt, DataBuffer ldvt,
                 IComplexNumber work, DataBuffer lwork, INDArray rwork,
                 DataBuffer info );
    void zgesvd( String jobu, String jobvt, DataBuffer m, DataBuffer n,
                 IComplexNumber a, DataBuffer lda, INDArray s,
                 IComplexNumber u, DataBuffer ldu,
                 IComplexNumber vt, DataBuffer ldvt,
                 IComplexNumber work, DataBuffer lwork,
                 INDArray rwork, DataBuffer info );
    void sgesvdx( String jobu, String jobvt, String range, DataBuffer m, DataBuffer n,
                  INDArray a, DataBuffer lda, DataBuffer vl, DataBuffer vu,
                  DataBuffer il, DataBuffer iu, DataBuffer ns, INDArray s, INDArray u,
                  DataBuffer ldu, INDArray vt, DataBuffer ldvt, INDArray work,
                  DataBuffer lwork, DataBuffer iwork, DataBuffer info );
    void dgesvdx( String jobu, String jobvt, String range, DataBuffer m, DataBuffer n,
                  INDArray a, DataBuffer lda, DataBuffer vl, DataBuffer vu,
                  DataBuffer il, DataBuffer iu, DataBuffer ns, INDArray s, INDArray u,
                  DataBuffer ldu, INDArray vt, DataBuffer ldvt, INDArray work,
                  DataBuffer lwork, DataBuffer iwork, DataBuffer info );
    void cgesvdx( String jobu, String jobvt, String range, DataBuffer m, DataBuffer n,
                  IComplexNumber a, DataBuffer lda, DataBuffer vl, DataBuffer vu,
                  DataBuffer il, DataBuffer iu, DataBuffer ns, INDArray s,
                  IComplexNumber u, DataBuffer ldu,
                  IComplexNumber vt, DataBuffer ldvt,
                  IComplexNumber work, DataBuffer lwork, INDArray rwork,
                  DataBuffer iwork, DataBuffer info );
    void zgesvdx( String jobu, String jobvt, String range, DataBuffer m, DataBuffer n,
                  IComplexNumber a, DataBuffer lda, DataBuffer vl, DataBuffer vu,
                  DataBuffer il, DataBuffer iu, DataBuffer ns, INDArray s,
                  IComplexNumber u, DataBuffer ldu,
                  IComplexNumber vt, DataBuffer ldvt,
                  IComplexNumber work, DataBuffer lwork,
                  INDArray rwork, DataBuffer iwork, DataBuffer info );
    void sgesdd( String jobz, DataBuffer m, DataBuffer n, INDArray a,
                 DataBuffer lda, INDArray s, INDArray u, DataBuffer ldu,
                 INDArray vt, DataBuffer ldvt, INDArray work, DataBuffer lwork,
                 DataBuffer iwork, DataBuffer info );
    void dgesdd( String jobz, DataBuffer m, DataBuffer n, INDArray a,
                 DataBuffer lda, INDArray s, INDArray u, DataBuffer ldu,
                 INDArray vt, DataBuffer ldvt, INDArray work,
                 DataBuffer lwork, DataBuffer iwork, DataBuffer info );
    void cgesdd( String jobz, DataBuffer m, DataBuffer n,
                 IComplexNumber a, DataBuffer lda, INDArray s,
                 IComplexNumber u, DataBuffer ldu,
                 IComplexNumber vt, DataBuffer ldvt,
                 IComplexNumber work, DataBuffer lwork, INDArray rwork,
                 DataBuffer iwork, DataBuffer info );
    void zgesdd( String jobz, DataBuffer m, DataBuffer n,
                 IComplexNumber a, DataBuffer lda, INDArray s,
                 IComplexNumber u, DataBuffer ldu,
                 IComplexNumber vt, DataBuffer ldvt,
                 IComplexNumber work, DataBuffer lwork,
                 INDArray rwork, DataBuffer iwork, DataBuffer info );
    void dgejsv( String joba, String jobu, String jobv, String jobr, String jobt,
                 String jobp, DataBuffer m, DataBuffer n, INDArray a,
                 DataBuffer lda, INDArray sva, INDArray u, DataBuffer ldu,
                 INDArray v, DataBuffer ldv, INDArray work, DataBuffer lwork,
                 DataBuffer iwork, DataBuffer info );
    void sgejsv( String joba, String jobu, String jobv, String jobr, String jobt,
                 String jobp, DataBuffer m, DataBuffer n, INDArray a,
                 DataBuffer lda, INDArray sva, INDArray u, DataBuffer ldu,
                 INDArray v, DataBuffer ldv, INDArray work, DataBuffer lwork,
                 DataBuffer iwork, DataBuffer info );
    void cgejsv( String joba, String jobu, String jobv, String jobr, String jobt,
                 String jobp, DataBuffer m, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, INDArray sva, IComplexNumber u, DataBuffer ldu,
                 IComplexNumber v, DataBuffer ldv, IComplexNumber cwork,
                 DataBuffer lwork, INDArray work, DataBuffer lrwork,
                 DataBuffer iwork, DataBuffer info );
    void zgejsv( String joba, String jobu, String jobv, String jobr, String jobt,
                 String jobp, DataBuffer m, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, INDArray sva, IComplexNumber u, DataBuffer ldu,
                 IComplexNumber v, DataBuffer ldv, IComplexNumber cwork,
                 DataBuffer lwork, INDArray work, DataBuffer lrwork,
                 DataBuffer iwork, DataBuffer info );
    void dgesvj( String joba, String jobu, String jobv, DataBuffer m,
                 DataBuffer n, INDArray a, DataBuffer lda, INDArray sva,
                 DataBuffer mv, INDArray v, DataBuffer ldv, INDArray work,
                 DataBuffer lwork, DataBuffer info );
    void sgesvj( String joba, String jobu, String jobv, DataBuffer m,
                 DataBuffer n, INDArray a, DataBuffer lda, INDArray sva,
                 DataBuffer mv, INDArray v, DataBuffer ldv, INDArray work,
                 DataBuffer lwork, DataBuffer info );
    void cgesvj( String joba, String jobu, String jobv, DataBuffer m,
                 DataBuffer n, IComplexNumber a, DataBuffer lda, INDArray sva,
                 DataBuffer mv, IComplexNumber v, DataBuffer ldv,
                 IComplexNumber cwork, DataBuffer lwork, INDArray rwork,
                 DataBuffer lrwork, DataBuffer info );
    void zgesvj( String joba, String jobu, String jobv, DataBuffer m,
                 DataBuffer n, IComplexNumber a, DataBuffer lda, INDArray sva,
                 DataBuffer mv, IComplexNumber v, DataBuffer ldv,
                 IComplexNumber cwork, DataBuffer lwork, INDArray rwork,
                 DataBuffer lrwork, DataBuffer info );
    void sggsvd( String jobu, String jobv, String jobq, DataBuffer m,
                 DataBuffer n, DataBuffer p, DataBuffer k, DataBuffer l,
                 INDArray a, DataBuffer lda, INDArray b, DataBuffer ldb,
                 INDArray alpha, INDArray beta, INDArray u, DataBuffer ldu,
                 INDArray v, DataBuffer ldv, INDArray q, DataBuffer ldq,
                 INDArray work, DataBuffer iwork, DataBuffer info );
    void dggsvd( String jobu, String jobv, String jobq, DataBuffer m,
                 DataBuffer n, DataBuffer p, DataBuffer k, DataBuffer l,
                 INDArray a, DataBuffer lda, INDArray b, DataBuffer ldb,
                 INDArray alpha, INDArray beta, INDArray u, DataBuffer ldu,
                 INDArray v, DataBuffer ldv, INDArray q, DataBuffer ldq,
                 INDArray work, DataBuffer iwork, DataBuffer info );
    void cggsvd( String jobu, String jobv, String jobq, DataBuffer m,
                 DataBuffer n, DataBuffer p, DataBuffer k, DataBuffer l,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb, INDArray alpha,
                 INDArray beta, IComplexNumber u, DataBuffer ldu,
                 IComplexNumber v, DataBuffer ldv,
                 IComplexNumber q, DataBuffer ldq,
                 IComplexNumber work, INDArray rwork, DataBuffer iwork,
                 DataBuffer info );
    void zggsvd( String jobu, String jobv, String jobq, DataBuffer m,
                 DataBuffer n, DataBuffer p, DataBuffer k, DataBuffer l,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb, INDArray alpha,
                 INDArray beta, IComplexNumber u, DataBuffer ldu,
                 IComplexNumber v, DataBuffer ldv,
                 IComplexNumber q, DataBuffer ldq,
                 IComplexNumber work, INDArray rwork,
                 DataBuffer iwork, DataBuffer info );
    void sggsvd3( String jobu, String jobv, String jobq, DataBuffer m,
                  DataBuffer n, DataBuffer p, DataBuffer k, DataBuffer l,
                  INDArray a, DataBuffer lda, INDArray b, DataBuffer ldb,
                  INDArray alpha, INDArray beta, INDArray u, DataBuffer ldu,
                  INDArray v, DataBuffer ldv, INDArray q, DataBuffer ldq,
                  INDArray work, DataBuffer lwork, DataBuffer iwork,
                  DataBuffer info );
    void dggsvd3( String jobu, String jobv, String jobq, DataBuffer m,
                  DataBuffer n, DataBuffer p, DataBuffer k, DataBuffer l,
                  INDArray a, DataBuffer lda, INDArray b, DataBuffer ldb,
                  INDArray alpha, INDArray beta, INDArray u, DataBuffer ldu,
                  INDArray v, DataBuffer ldv, INDArray q, DataBuffer ldq,
                  INDArray work, DataBuffer lwork, DataBuffer iwork,
                  DataBuffer info );
    void cggsvd3( String jobu, String jobv, String jobq, DataBuffer m,
                  DataBuffer n, DataBuffer p, DataBuffer k, DataBuffer l,
                  IComplexNumber a, DataBuffer lda,
                  IComplexNumber b, DataBuffer ldb, INDArray alpha,
                  INDArray beta, IComplexNumber u, DataBuffer ldu,
                  IComplexNumber v, DataBuffer ldv,
                  IComplexNumber q, DataBuffer ldq,
                  IComplexNumber work, DataBuffer lwork, INDArray rwork,
                  DataBuffer iwork, DataBuffer info );
    void zggsvd3( String jobu, String jobv, String jobq, DataBuffer m,
                  DataBuffer n, DataBuffer p, DataBuffer k, DataBuffer l,
                  IComplexNumber a, DataBuffer lda,
                  IComplexNumber b, DataBuffer ldb, INDArray alpha,
                  INDArray beta, IComplexNumber u, DataBuffer ldu,
                  IComplexNumber v, DataBuffer ldv,
                  IComplexNumber q, DataBuffer ldq,
                  IComplexNumber work, DataBuffer lwork,
                  INDArray rwork, DataBuffer iwork, DataBuffer info );
    void ssygv( DataBuffer itype, String jobz, String uplo, DataBuffer n,
                INDArray a, DataBuffer lda, INDArray b, DataBuffer ldb,
                INDArray w, INDArray work, DataBuffer lwork, DataBuffer info );
    void dsygv( DataBuffer itype, String jobz, String uplo, DataBuffer n,
                INDArray a, DataBuffer lda, INDArray b, DataBuffer ldb,
                INDArray w, INDArray work, DataBuffer lwork,
                DataBuffer info );
    void chegv( DataBuffer itype, String jobz, String uplo, DataBuffer n,
                IComplexNumber a, DataBuffer lda,
                IComplexNumber b, DataBuffer ldb, INDArray w,
                IComplexNumber work, DataBuffer lwork, INDArray rwork,
                DataBuffer info );
    void zhegv( DataBuffer itype, String jobz, String uplo, DataBuffer n,
                IComplexNumber a, DataBuffer lda,
                IComplexNumber b, DataBuffer ldb, INDArray w,
                IComplexNumber work, DataBuffer lwork,
                INDArray rwork, DataBuffer info );
    void ssygvd( DataBuffer itype, String jobz, String uplo, DataBuffer n,
                 INDArray a, DataBuffer lda, INDArray b, DataBuffer ldb,
                 INDArray w, INDArray work, DataBuffer lwork, DataBuffer iwork,
                 DataBuffer liwork, DataBuffer info );
    void dsygvd( DataBuffer itype, String jobz, String uplo, DataBuffer n,
                 INDArray a, DataBuffer lda, INDArray b, DataBuffer ldb,
                 INDArray w, INDArray work, DataBuffer lwork,
                 DataBuffer iwork, DataBuffer liwork, DataBuffer info );
    void chegvd( DataBuffer itype, String jobz, String uplo, DataBuffer n,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb, INDArray w,
                 IComplexNumber work, DataBuffer lwork, INDArray rwork,
                 DataBuffer lrwork, DataBuffer iwork, DataBuffer liwork,
                 DataBuffer info );
    void zhegvd( DataBuffer itype, String jobz, String uplo, DataBuffer n,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb, INDArray w,
                 IComplexNumber work, DataBuffer lwork,
                 INDArray rwork, DataBuffer lrwork, DataBuffer iwork,
                 DataBuffer liwork, DataBuffer info );
    void ssygvx( DataBuffer itype, String jobz, String range, String uplo,
                 DataBuffer n, INDArray a, DataBuffer lda, INDArray b,
                 DataBuffer ldb, INDArray vl, INDArray vu, DataBuffer il,
                 DataBuffer iu, INDArray abstol, DataBuffer m, INDArray w,
                 INDArray z, DataBuffer ldz, INDArray work, DataBuffer lwork,
                 DataBuffer iwork, DataBuffer ifail, DataBuffer info );
    void dsygvx( DataBuffer itype, String jobz, String range, String uplo,
                 DataBuffer n, INDArray a, DataBuffer lda, INDArray b,
                 DataBuffer ldb, INDArray vl, INDArray vu, DataBuffer il,
                 DataBuffer iu, INDArray abstol, DataBuffer m, INDArray w,
                 INDArray z, DataBuffer ldz, INDArray work, DataBuffer lwork,
                 DataBuffer iwork, DataBuffer ifail, DataBuffer info );
    void chegvx( DataBuffer itype, String jobz, String range, String uplo,
                 DataBuffer n, IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb, INDArray vl,
                 INDArray vu, DataBuffer il, DataBuffer iu, INDArray abstol,
                 DataBuffer m, INDArray w, IComplexNumber z,
                 DataBuffer ldz, IComplexNumber work,
                 DataBuffer lwork, INDArray rwork, DataBuffer iwork,
                 DataBuffer ifail, DataBuffer info );
    void zhegvx( DataBuffer itype, String jobz, String range, String uplo,
                 DataBuffer n, IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb, INDArray vl,
                 INDArray vu, DataBuffer il, DataBuffer iu, INDArray abstol,
                 DataBuffer m, INDArray w, IComplexNumber z,
                 DataBuffer ldz, IComplexNumber work,
                 DataBuffer lwork, INDArray rwork, DataBuffer iwork,
                 DataBuffer ifail, DataBuffer info );
    void sspgv( DataBuffer itype, String jobz, String uplo, DataBuffer n,
                INDArray ap, INDArray bp, INDArray w, INDArray z, DataBuffer ldz,
                INDArray work, DataBuffer info );
    void dspgv( DataBuffer itype, String jobz, String uplo, DataBuffer n,
                INDArray ap, INDArray bp, INDArray w, INDArray z,
                DataBuffer ldz, INDArray work, DataBuffer info );
    void chpgv( DataBuffer itype, String jobz, String uplo, DataBuffer n,
                IComplexNumber ap, IComplexNumber bp, INDArray w,
                IComplexNumber z, DataBuffer ldz,
                IComplexNumber work, INDArray rwork, DataBuffer info );
    void zhpgv( DataBuffer itype, String jobz, String uplo, DataBuffer n,
                IComplexNumber ap, IComplexNumber bp,
                INDArray w, IComplexNumber z, DataBuffer ldz,
                IComplexNumber work, INDArray rwork,
                DataBuffer info );
    void sspgvd( DataBuffer itype, String jobz, String uplo, DataBuffer n,
                 INDArray ap, INDArray bp, INDArray w, INDArray z, DataBuffer ldz,
                 INDArray work, DataBuffer lwork, DataBuffer iwork,
                 DataBuffer liwork, DataBuffer info );
    void dspgvd( DataBuffer itype, String jobz, String uplo, DataBuffer n,
                 INDArray ap, INDArray bp, INDArray w, INDArray z,
                 DataBuffer ldz, INDArray work, DataBuffer lwork,
                 DataBuffer iwork, DataBuffer liwork, DataBuffer info );
    void chpgvd( DataBuffer itype, String jobz, String uplo, DataBuffer n,
                 IComplexNumber ap, IComplexNumber bp,
                 INDArray w, IComplexNumber z, DataBuffer ldz,
                 IComplexNumber work, DataBuffer lwork, INDArray rwork,
                 DataBuffer lrwork, DataBuffer iwork, DataBuffer liwork,
                 DataBuffer info );
    void zhpgvd( DataBuffer itype, String jobz, String uplo, DataBuffer n,
                 IComplexNumber ap, IComplexNumber bp,
                 INDArray w, IComplexNumber z, DataBuffer ldz,
                 IComplexNumber work, DataBuffer lwork,
                 INDArray rwork, DataBuffer lrwork, DataBuffer iwork,
                 DataBuffer liwork, DataBuffer info );
    void sspgvx( DataBuffer itype, String jobz, String range, String uplo,
                 DataBuffer n, INDArray ap, INDArray bp, INDArray vl, INDArray vu,
                 DataBuffer il, DataBuffer iu, INDArray abstol,
                 DataBuffer m, INDArray w, INDArray z, DataBuffer ldz,
                 INDArray work, DataBuffer iwork, DataBuffer ifail,
                 DataBuffer info );
    void dspgvx( DataBuffer itype, String jobz, String range, String uplo,
                 DataBuffer n, INDArray ap, INDArray bp, INDArray vl,
                 INDArray vu, DataBuffer il, DataBuffer iu, INDArray abstol,
                 DataBuffer m, INDArray w, INDArray z, DataBuffer ldz,
                 INDArray work, DataBuffer iwork, DataBuffer ifail,
                 DataBuffer info );
    void chpgvx( DataBuffer itype, String jobz, String range, String uplo,
                 DataBuffer n, IComplexNumber ap,
                 IComplexNumber bp, INDArray vl, INDArray vu,
                 DataBuffer il, DataBuffer iu, INDArray abstol,
                 DataBuffer m, INDArray w, IComplexNumber z,
                 DataBuffer ldz, IComplexNumber work, INDArray rwork,
                 DataBuffer iwork, DataBuffer ifail, DataBuffer info );
    void zhpgvx( DataBuffer itype, String jobz, String range, String uplo,
                 DataBuffer n, IComplexNumber ap,
                 IComplexNumber bp, INDArray vl, INDArray vu,
                 DataBuffer il, DataBuffer iu, INDArray abstol,
                 DataBuffer m, INDArray w, IComplexNumber z,
                 DataBuffer ldz, IComplexNumber work, INDArray rwork,
                 DataBuffer iwork, DataBuffer ifail, DataBuffer info );
    void ssbgv( String jobz, String uplo, DataBuffer n, DataBuffer ka,
                DataBuffer kb, INDArray ab, DataBuffer ldab, INDArray bb,
                DataBuffer ldbb, INDArray w, INDArray z, DataBuffer ldz,
                INDArray work, DataBuffer info );
    void dsbgv( String jobz, String uplo, DataBuffer n, DataBuffer ka,
                DataBuffer kb, INDArray ab, DataBuffer ldab, INDArray bb,
                DataBuffer ldbb, INDArray w, INDArray z, DataBuffer ldz,
                INDArray work, DataBuffer info );
    void chbgv( String jobz, String uplo, DataBuffer n, DataBuffer ka,
                DataBuffer kb, IComplexNumber ab, DataBuffer ldab,
                IComplexNumber bb, DataBuffer ldbb, INDArray w,
                IComplexNumber z, DataBuffer ldz,
                IComplexNumber work, INDArray rwork, DataBuffer info );
    void zhbgv( String jobz, String uplo, DataBuffer n, DataBuffer ka,
                DataBuffer kb, IComplexNumber ab, DataBuffer ldab,
                IComplexNumber bb, DataBuffer ldbb, INDArray w,
                IComplexNumber z, DataBuffer ldz,
                IComplexNumber work, INDArray rwork,
                DataBuffer info );
    void ssbgvd( String jobz, String uplo, DataBuffer n, DataBuffer ka,
                 DataBuffer kb, INDArray ab, DataBuffer ldab, INDArray bb,
                 DataBuffer ldbb, INDArray w, INDArray z, DataBuffer ldz,
                 INDArray work, DataBuffer lwork, DataBuffer iwork,
                 DataBuffer liwork, DataBuffer info );
    void dsbgvd( String jobz, String uplo, DataBuffer n, DataBuffer ka,
                 DataBuffer kb, INDArray ab, DataBuffer ldab, INDArray bb,
                 DataBuffer ldbb, INDArray w, INDArray z, DataBuffer ldz,
                 INDArray work, DataBuffer lwork, DataBuffer iwork,
                 DataBuffer liwork, DataBuffer info );
    void chbgvd( String jobz, String uplo, DataBuffer n, DataBuffer ka,
                 DataBuffer kb, IComplexNumber ab, DataBuffer ldab,
                 IComplexNumber bb, DataBuffer ldbb, INDArray w,
                 IComplexNumber z, DataBuffer ldz,
                 IComplexNumber work, DataBuffer lwork, INDArray rwork,
                 DataBuffer lrwork, DataBuffer iwork, DataBuffer liwork,
                 DataBuffer info );
    void zhbgvd( String jobz, String uplo, DataBuffer n, DataBuffer ka,
                 DataBuffer kb, IComplexNumber ab, DataBuffer ldab,
                 IComplexNumber bb, DataBuffer ldbb, INDArray w,
                 IComplexNumber z, DataBuffer ldz,
                 IComplexNumber work, DataBuffer lwork,
                 INDArray rwork, DataBuffer lrwork, DataBuffer iwork,
                 DataBuffer liwork, DataBuffer info );
    void ssbgvx( String jobz, String range, String uplo, DataBuffer n,
                 DataBuffer ka, DataBuffer kb, INDArray ab, DataBuffer ldab,
                 INDArray bb, DataBuffer ldbb, INDArray q, DataBuffer ldq,
                 INDArray vl, INDArray vu, DataBuffer il, DataBuffer iu,
                 INDArray abstol, DataBuffer m, INDArray w, INDArray z,
                 DataBuffer ldz, INDArray work, DataBuffer iwork,
                 DataBuffer ifail, DataBuffer info );
    void dsbgvx( String jobz, String range, String uplo, DataBuffer n,
                 DataBuffer ka, DataBuffer kb, INDArray ab,
                 DataBuffer ldab, INDArray bb, DataBuffer ldbb, INDArray q,
                 DataBuffer ldq, INDArray vl, INDArray vu, DataBuffer il,
                 DataBuffer iu, INDArray abstol, DataBuffer m, INDArray w,
                 INDArray z, DataBuffer ldz, INDArray work, DataBuffer iwork,
                 DataBuffer ifail, DataBuffer info );
    void chbgvx( String jobz, String range, String uplo, DataBuffer n,
                 DataBuffer ka, DataBuffer kb, IComplexNumber ab,
                 DataBuffer ldab, IComplexNumber bb,
                 DataBuffer ldbb, IComplexNumber q, DataBuffer ldq,
                 INDArray vl, INDArray vu, DataBuffer il, DataBuffer iu,
                 INDArray abstol, DataBuffer m, INDArray w,
                 IComplexNumber z, DataBuffer ldz,
                 IComplexNumber work, INDArray rwork, DataBuffer iwork,
                 DataBuffer ifail, DataBuffer info );
    void zhbgvx( String jobz, String range, String uplo, DataBuffer n,
                 DataBuffer ka, DataBuffer kb, IComplexNumber ab,
                 DataBuffer ldab, IComplexNumber bb,
                 DataBuffer ldbb, IComplexNumber q, DataBuffer ldq,
                 INDArray vl, INDArray vu, DataBuffer il, DataBuffer iu,
                 INDArray abstol, DataBuffer m, INDArray w,
                 IComplexNumber z, DataBuffer ldz,
                 IComplexNumber work, INDArray rwork,
                 DataBuffer iwork, DataBuffer ifail, DataBuffer info );
    void sgges( String jobvsl, String jobvsr, String sort,
                int selctg, DataBuffer n, INDArray a,
                DataBuffer lda, INDArray b, DataBuffer ldb, DataBuffer sdim,
                INDArray alphar, INDArray alphai, INDArray beta, INDArray vsl,
                DataBuffer ldvsl, INDArray vsr, DataBuffer ldvsr,
                INDArray work, DataBuffer lwork, DataBuffer bwork,
                DataBuffer info );
    void dgges( String jobvsl, String jobvsr, String sort,
                int selctg, DataBuffer n, INDArray a,
                DataBuffer lda, INDArray b, DataBuffer ldb,
                DataBuffer sdim, INDArray alphar, INDArray alphai,
                INDArray beta, INDArray vsl, DataBuffer ldvsl, INDArray vsr,
                DataBuffer ldvsr, INDArray work, DataBuffer lwork,
                DataBuffer bwork, DataBuffer info );
    void cgges( String jobvsl, String jobvsr, String sort,
                int selctg, DataBuffer n,
                IComplexNumber a, DataBuffer lda,
                IComplexNumber b, DataBuffer ldb, DataBuffer sdim,
                IComplexNumber alpha, IComplexNumber beta,
                IComplexNumber vsl, DataBuffer ldvsl,
                IComplexNumber vsr, DataBuffer ldvsr,
                IComplexNumber work, DataBuffer lwork, INDArray rwork,
                DataBuffer bwork, DataBuffer info );
    void zgges( String jobvsl, String jobvsr, String sort,
                int selctg, DataBuffer n,
                IComplexNumber a, DataBuffer lda,
                IComplexNumber b, DataBuffer ldb, DataBuffer sdim,
                IComplexNumber alpha, IComplexNumber beta,
                IComplexNumber vsl, DataBuffer ldvsl,
                IComplexNumber vsr, DataBuffer ldvsr,
                IComplexNumber work, DataBuffer lwork,
                INDArray rwork, DataBuffer bwork, DataBuffer info );
    void sgges3( String jobvsl, String jobvsr, String sort,
                 int selctg, DataBuffer n,
                 INDArray a, DataBuffer lda, INDArray b, DataBuffer ldb,
                 DataBuffer sdim, INDArray alphar, INDArray alphai,
                 INDArray beta, INDArray vsl, DataBuffer ldvsl,
                 INDArray vsr, DataBuffer ldvsr,
                 INDArray work, DataBuffer lwork, DataBuffer bwork,
                 DataBuffer info );
    void dgges3( String jobvsl, String jobvsr, String sort,
                 int selctg, DataBuffer n, INDArray a,
                 DataBuffer lda, INDArray b, DataBuffer ldb,
                 DataBuffer sdim, INDArray alphar, INDArray alphai,
                 INDArray beta, INDArray vsl, DataBuffer ldvsl, INDArray vsr,
                 DataBuffer ldvsr, INDArray work, DataBuffer lwork,
                 DataBuffer bwork, DataBuffer info );
    void cgges3( String jobvsl, String jobvsr, String sort,
                 int selctg, DataBuffer n,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb,
                 DataBuffer sdim,
                 IComplexNumber alpha, IComplexNumber beta,
                 IComplexNumber vsl, DataBuffer ldvsl,
                 IComplexNumber vsr, DataBuffer ldvsr,
                 IComplexNumber work, DataBuffer lwork, INDArray rwork,
                 DataBuffer bwork, DataBuffer info );
    void zgges3( String jobvsl, String jobvsr, String sort,
                 int selctg, DataBuffer n,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb, DataBuffer sdim,
                 IComplexNumber alpha, IComplexNumber beta,
                 IComplexNumber vsl, DataBuffer ldvsl,
                 IComplexNumber vsr, DataBuffer ldvsr,
                 IComplexNumber work, DataBuffer lwork,
                 INDArray rwork, DataBuffer bwork, DataBuffer info );
    void sggesx( String jobvsl, String jobvsr, String sort,
                 int selctg, String sense, DataBuffer n,
                 INDArray a, DataBuffer lda, INDArray b, DataBuffer ldb,
                 DataBuffer sdim, INDArray alphar, INDArray alphai, INDArray beta,
                 INDArray vsl, DataBuffer ldvsl, INDArray vsr,
                 DataBuffer ldvsr, INDArray rconde, INDArray rcondv,
                 INDArray work, DataBuffer lwork, DataBuffer iwork,
                 DataBuffer liwork, DataBuffer bwork,
                 DataBuffer info );
    void dggesx( String jobvsl, String jobvsr, String sort,
                 int selctg, String sense, DataBuffer n,
                 INDArray a, DataBuffer lda, INDArray b, DataBuffer ldb,
                 DataBuffer sdim, INDArray alphar, INDArray alphai,
                 INDArray beta, INDArray vsl, DataBuffer ldvsl, INDArray vsr,
                 DataBuffer ldvsr, INDArray rconde, INDArray rcondv,
                 INDArray work, DataBuffer lwork, DataBuffer iwork,
                 DataBuffer liwork, DataBuffer bwork,
                 DataBuffer info );
    void cggesx( String jobvsl, String jobvsr, String sort,
                 int selctg, String sense, DataBuffer n,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb, DataBuffer sdim,
                 IComplexNumber alpha, IComplexNumber beta,
                 IComplexNumber vsl, DataBuffer ldvsl,
                 IComplexNumber vsr, DataBuffer ldvsr, INDArray rconde,
                 INDArray rcondv, IComplexNumber work,
                 DataBuffer lwork, INDArray rwork, DataBuffer iwork,
                 DataBuffer liwork, DataBuffer bwork,
                 DataBuffer info );
    void zggesx( String jobvsl, String jobvsr, String sort,
                 int selctg, String sense, DataBuffer n,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb, DataBuffer sdim,
                 IComplexNumber alpha, IComplexNumber beta,
                 IComplexNumber vsl, DataBuffer ldvsl,
                 IComplexNumber vsr, DataBuffer ldvsr,
                 INDArray rconde, INDArray rcondv, IComplexNumber work,
                 DataBuffer lwork, INDArray rwork, DataBuffer iwork,
                 DataBuffer liwork, DataBuffer bwork,
                 DataBuffer info );
    void sggev( String jobvl, String jobvr, DataBuffer n, INDArray a,
                DataBuffer lda, INDArray b, DataBuffer ldb, INDArray alphar,
                INDArray alphai, INDArray beta, INDArray vl, DataBuffer ldvl,
                INDArray vr, DataBuffer ldvr, INDArray work, DataBuffer lwork,
                DataBuffer info );
    void dggev( String jobvl, String jobvr, DataBuffer n, INDArray a,
                DataBuffer lda, INDArray b, DataBuffer ldb, INDArray alphar,
                INDArray alphai, INDArray beta, INDArray vl, DataBuffer ldvl,
                INDArray vr, DataBuffer ldvr, INDArray work,
                DataBuffer lwork, DataBuffer info );
    void cggev( String jobvl, String jobvr, DataBuffer n,
                IComplexNumber a, DataBuffer lda,
                IComplexNumber b, DataBuffer ldb,
                IComplexNumber alpha, IComplexNumber beta,
                IComplexNumber vl, DataBuffer ldvl,
                IComplexNumber vr, DataBuffer ldvr,
                IComplexNumber work, DataBuffer lwork, INDArray rwork,
                DataBuffer info );
    void zggev( String jobvl, String jobvr, DataBuffer n,
                IComplexNumber a, DataBuffer lda,
                IComplexNumber b, DataBuffer ldb,
                IComplexNumber alpha, IComplexNumber beta,
                IComplexNumber vl, DataBuffer ldvl,
                IComplexNumber vr, DataBuffer ldvr,
                IComplexNumber work, DataBuffer lwork,
                INDArray rwork, DataBuffer info );
    void sggev3( String jobvl, String jobvr, DataBuffer n, INDArray a,
                 DataBuffer lda, INDArray b, DataBuffer ldb, INDArray alphar,
                 INDArray alphai, INDArray beta, INDArray vl, DataBuffer ldvl,
                 INDArray vr, DataBuffer ldvr, INDArray work, DataBuffer lwork,
                 DataBuffer info );
    void dggev3( String jobvl, String jobvr, DataBuffer n, INDArray a,
                 DataBuffer lda, INDArray b, DataBuffer ldb, INDArray alphar,
                 INDArray alphai, INDArray beta, INDArray vl, DataBuffer ldvl,
                 INDArray vr, DataBuffer ldvr, INDArray work,
                 DataBuffer lwork, DataBuffer info );
    void cggev3( String jobvl, String jobvr, DataBuffer n,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber alpha, IComplexNumber beta,
                 IComplexNumber vl, DataBuffer ldvl,
                 IComplexNumber vr, DataBuffer ldvr,
                 IComplexNumber work, DataBuffer lwork, INDArray rwork,
                 DataBuffer info );
    void zggev3( String jobvl, String jobvr, DataBuffer n,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber alpha, IComplexNumber beta,
                 IComplexNumber vl, DataBuffer ldvl,
                 IComplexNumber vr, DataBuffer ldvr,
                 IComplexNumber work, DataBuffer lwork,
                 INDArray rwork, DataBuffer info );
    void sggevx( String balanc, String jobvl, String jobvr, String sense,
                 DataBuffer n, INDArray a, DataBuffer lda, INDArray b,
                 DataBuffer ldb, INDArray alphar, INDArray alphai, INDArray beta,
                 INDArray vl, DataBuffer ldvl, INDArray vr, DataBuffer ldvr,
                 DataBuffer ilo, DataBuffer ihi, INDArray lscale,
                 INDArray rscale, INDArray abnrm, INDArray bbnrm, INDArray rconde,
                 INDArray rcondv, INDArray work, DataBuffer lwork,
                 DataBuffer iwork, DataBuffer bwork,
                 DataBuffer info );
    void dggevx( String balanc, String jobvl, String jobvr, String sense,
                 DataBuffer n, INDArray a, DataBuffer lda, INDArray b,
                 DataBuffer ldb, INDArray alphar, INDArray alphai,
                 INDArray beta, INDArray vl, DataBuffer ldvl, INDArray vr,
                 DataBuffer ldvr, DataBuffer ilo, DataBuffer ihi,
                 INDArray lscale, INDArray rscale, INDArray abnrm,
                 INDArray bbnrm, INDArray rconde, INDArray rcondv, INDArray work,
                 DataBuffer lwork, DataBuffer iwork, DataBuffer bwork,
                 DataBuffer info );
    void cggevx( String balanc, String jobvl, String jobvr, String sense,
                 DataBuffer n, IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber alpha, IComplexNumber beta,
                 IComplexNumber vl, DataBuffer ldvl,
                 IComplexNumber vr, DataBuffer ldvr, DataBuffer ilo,
                 DataBuffer ihi, INDArray lscale, INDArray rscale, INDArray abnrm,
                 INDArray bbnrm, INDArray rconde, INDArray rcondv,
                 IComplexNumber work, DataBuffer lwork, INDArray rwork,
                 DataBuffer iwork, DataBuffer bwork,
                 DataBuffer info );
    void zggevx( String balanc, String jobvl, String jobvr, String sense,
                 DataBuffer n, IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber alpha, IComplexNumber beta,
                 IComplexNumber vl, DataBuffer ldvl,
                 IComplexNumber vr, DataBuffer ldvr,
                 DataBuffer ilo, DataBuffer ihi, INDArray lscale,
                 INDArray rscale, INDArray abnrm, INDArray bbnrm,
                 INDArray rconde, INDArray rcondv, IComplexNumber work,
                 DataBuffer lwork, INDArray rwork, DataBuffer iwork,
                 DataBuffer bwork, DataBuffer info );
    void dsfrk( String transr, String uplo, String trans, DataBuffer n,
                DataBuffer k, INDArray alpha,  INDArray a,
                DataBuffer lda, INDArray beta, INDArray c );
    void ssfrk( String transr, String uplo, String trans, DataBuffer n,
                DataBuffer k, INDArray alpha,  INDArray a, DataBuffer lda,
                INDArray beta, INDArray c );
    void zhfrk( String transr, String uplo, String trans, DataBuffer n,
                DataBuffer k, INDArray alpha,  IComplexNumber a,
                DataBuffer lda, INDArray beta, IComplexNumber c );
    void chfrk( String transr, String uplo, String trans, DataBuffer n,
                DataBuffer k, INDArray alpha,  IComplexNumber a,
                DataBuffer lda, INDArray beta, IComplexNumber c );
    void dtfsm( String transr, String side, String uplo, String trans,
                String diag, DataBuffer m, DataBuffer n, INDArray alpha,
                INDArray a, INDArray b, DataBuffer ldb );
    void stfsm( String transr, String side, String uplo, String trans,
                String diag, DataBuffer m, DataBuffer n, INDArray alpha,
                INDArray a, INDArray b, DataBuffer ldb );
    void ztfsm( String transr, String side, String uplo, String trans,
                String diag, DataBuffer m, DataBuffer n,
                IComplexNumber alpha,  IComplexNumber a,
                IComplexNumber b, DataBuffer ldb );
    void ctfsm( String transr, String side, String uplo, String trans,
                String diag, DataBuffer m, DataBuffer n,
                IComplexNumber alpha,  IComplexNumber a,
                IComplexNumber b, DataBuffer ldb );
    void dtfttp( String transr, String uplo, DataBuffer n,  INDArray arf,
                 INDArray ap, DataBuffer info );
    void stfttp( String transr, String uplo, DataBuffer n,  INDArray arf,
                 INDArray ap, DataBuffer info );
    void ztfttp( String transr, String uplo, DataBuffer n,
                 IComplexNumber arf, IComplexNumber ap,
                 DataBuffer info );
    void ctfttp( String transr, String uplo, DataBuffer n,
                 IComplexNumber arf, IComplexNumber ap,
                 DataBuffer info );
    void dtfttr( String transr, String uplo, DataBuffer n,  INDArray arf,
                 INDArray a, DataBuffer lda, DataBuffer info );
    void stfttr( String transr, String uplo, DataBuffer n,  INDArray arf,
                 INDArray a, DataBuffer lda, DataBuffer info );
    void ztfttr( String transr, String uplo, DataBuffer n,
                 IComplexNumber arf, IComplexNumber a,
                 DataBuffer lda, DataBuffer info );
    void ctfttr( String transr, String uplo, DataBuffer n,
                 IComplexNumber arf, IComplexNumber a,
                 DataBuffer lda, DataBuffer info );
    void dtpttf( String transr, String uplo, DataBuffer n,  INDArray ap,
                 INDArray arf, DataBuffer info );
    void stpttf( String transr, String uplo, DataBuffer n,  INDArray ap,
                 INDArray arf, DataBuffer info );
    void ztpttf( String transr, String uplo, DataBuffer n,
                 IComplexNumber ap, IComplexNumber arf,
                 DataBuffer info );
    void ctpttf( String transr, String uplo, DataBuffer n,
                 IComplexNumber ap, IComplexNumber arf,
                 DataBuffer info );
    void dtpttr( String uplo, DataBuffer n,  INDArray ap, INDArray a,
                 DataBuffer lda, DataBuffer info );
    void stpttr( String uplo, DataBuffer n,  INDArray ap, INDArray a,
                 DataBuffer lda, DataBuffer info );
    void ztpttr( String uplo, DataBuffer n,  IComplexNumber ap,
                 IComplexNumber a, DataBuffer lda,
                 DataBuffer info );
    void ctpttr( String uplo, DataBuffer n,  IComplexNumber ap,
                 IComplexNumber a, DataBuffer lda,
                 DataBuffer info );
    void dtrttf( String transr, String uplo, DataBuffer n,  INDArray a,
                 DataBuffer lda, INDArray arf, DataBuffer info );
    void strttf( String transr, String uplo, DataBuffer n,  INDArray a,
                 DataBuffer lda, INDArray arf, DataBuffer info );
    void ztrttf( String transr, String uplo, DataBuffer n,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber arf, DataBuffer info );
    void ctrttf( String transr, String uplo, DataBuffer n,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber arf, DataBuffer info );
    void dtrttp( String uplo, DataBuffer n,  INDArray a, DataBuffer lda,
                 INDArray ap, DataBuffer info );
    void strttp( String uplo, DataBuffer n,  INDArray a, DataBuffer lda,
                 INDArray ap, DataBuffer info );
    void ztrttp( String uplo, DataBuffer n,  IComplexNumber a,
                 DataBuffer lda, IComplexNumber ap,
                 DataBuffer info );
    void ctrttp( String uplo, DataBuffer n,  IComplexNumber a,
                 DataBuffer lda, IComplexNumber ap,
                 DataBuffer info );
    void sgeqrfp( DataBuffer m, DataBuffer n, INDArray a, DataBuffer lda,
                  INDArray tau, INDArray work, DataBuffer lwork,
                  DataBuffer info );
    void dgeqrfp( DataBuffer m, DataBuffer n, INDArray a, DataBuffer lda,
                  INDArray tau, INDArray work, DataBuffer lwork,
                  DataBuffer info );
    void cgeqrfp( DataBuffer m, DataBuffer n, IComplexNumber a,
                  DataBuffer lda, IComplexNumber tau,
                  IComplexNumber work, DataBuffer lwork,
                  DataBuffer info );
    void zgeqrfp( DataBuffer m, DataBuffer n, IComplexNumber a,
                  DataBuffer lda, IComplexNumber tau,
                  IComplexNumber work, DataBuffer lwork,
                  DataBuffer info );
    void clacgv( DataBuffer n, IComplexNumber x, DataBuffer incx );
    void zlacgv( DataBuffer n, IComplexNumber x, DataBuffer incx );
    void slarnv( DataBuffer idist, DataBuffer iseed, DataBuffer n,
                 INDArray x );
    void dlarnv( DataBuffer idist, DataBuffer iseed, DataBuffer n,
                 INDArray x );
    void clarnv( DataBuffer idist, DataBuffer iseed, DataBuffer n,
                 IComplexNumber x );
    void zlarnv( DataBuffer idist, DataBuffer iseed, DataBuffer n,
                 IComplexNumber x );
    void sgeqr2( DataBuffer m, DataBuffer n, INDArray a, DataBuffer lda,
                 INDArray tau, INDArray work, DataBuffer info );
    void dgeqr2( DataBuffer m, DataBuffer n, INDArray a, DataBuffer lda,
                 INDArray tau, INDArray work, DataBuffer info );
    void cgeqr2( DataBuffer m, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, IComplexNumber tau,
                 IComplexNumber work, DataBuffer info );
    void zgeqr2( DataBuffer m, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, IComplexNumber tau,
                 IComplexNumber work, DataBuffer info );
    void slacn2( DataBuffer n, INDArray v, INDArray x, DataBuffer isgn,
                 INDArray est, DataBuffer kase, DataBuffer isave );
    void dlacn2( DataBuffer n, INDArray v, INDArray x, DataBuffer isgn,
                 INDArray est, DataBuffer kase, DataBuffer isave );
    void clacn2( DataBuffer n, IComplexNumber v,
                 IComplexNumber x, INDArray est,
                 DataBuffer kase, DataBuffer isave );
    void zlacn2( DataBuffer n, IComplexNumber v,
                 IComplexNumber x, INDArray est,
                 DataBuffer kase, DataBuffer isave );
    void slacpy( String uplo, DataBuffer m, DataBuffer n,  INDArray a,
                 DataBuffer lda, INDArray b, DataBuffer ldb );
    void dlacpy( String uplo, DataBuffer m, DataBuffer n,  INDArray a,
                 DataBuffer lda, INDArray b, DataBuffer ldb );
    void clacpy( String uplo, DataBuffer m, DataBuffer n,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb );
    void zlacpy( String uplo, DataBuffer m, DataBuffer n,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb );

    void clacp2( String uplo, DataBuffer m, DataBuffer n,  INDArray a,
                 DataBuffer lda, IComplexNumber b, DataBuffer ldb );
    void zlacp2( String uplo, DataBuffer m, DataBuffer n,  INDArray a,
                 DataBuffer lda, IComplexNumber b,
                 DataBuffer ldb );

    void sgetf2( DataBuffer m, DataBuffer n, INDArray a, DataBuffer lda,
                 DataBuffer ipiv, DataBuffer info );
    void dgetf2( DataBuffer m, DataBuffer n, INDArray a, DataBuffer lda,
                 DataBuffer ipiv, DataBuffer info );
    void cgetf2( DataBuffer m, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, DataBuffer ipiv, DataBuffer info );
    void zgetf2( DataBuffer m, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, DataBuffer ipiv, DataBuffer info );
    void slaswp( DataBuffer n, INDArray a, DataBuffer lda, DataBuffer k1,
                 DataBuffer k2,  DataBuffer ipiv, DataBuffer incx );
    void dlaswp( DataBuffer n, INDArray a, DataBuffer lda, DataBuffer k1,
                 DataBuffer k2,  DataBuffer ipiv, DataBuffer incx );
    void claswp( DataBuffer n, IComplexNumber a, DataBuffer lda,
                 DataBuffer k1, DataBuffer k2,  DataBuffer ipiv,
                 DataBuffer incx );
    void zlaswp( DataBuffer n, IComplexNumber a, DataBuffer lda,
                 DataBuffer k1, DataBuffer k2,  DataBuffer ipiv,
                 DataBuffer incx );
    float slange( String norm, DataBuffer m, DataBuffer n,  INDArray a,
                  DataBuffer lda, INDArray work );
    double dlange( String norm, DataBuffer m, DataBuffer n,  INDArray a,
                   DataBuffer lda, INDArray work );
    float clange( String norm, DataBuffer m, DataBuffer n,
                  IComplexNumber a, DataBuffer lda, INDArray work );
    double zlange( String norm, DataBuffer m, DataBuffer n,
                   IComplexNumber a, DataBuffer lda, INDArray work );
    float clanhe( String norm, String uplo, DataBuffer n,
                  IComplexNumber a, DataBuffer lda, INDArray work );
    double zlanhe( String norm, String uplo, DataBuffer n,
                   IComplexNumber a, DataBuffer lda, INDArray work );
    float slansy( String norm, String uplo, DataBuffer n,  INDArray a,
                  DataBuffer lda, INDArray work );
    double dlansy( String norm, String uplo, DataBuffer n,  INDArray a,
                   DataBuffer lda, INDArray work );
    float clansy( String norm, String uplo, DataBuffer n,
                  IComplexNumber a, DataBuffer lda, INDArray work );
    double zlansy( String norm, String uplo, DataBuffer n,
                   IComplexNumber a, DataBuffer lda, INDArray work );
    float slantr( String norm, String uplo, String diag, DataBuffer m,
                  DataBuffer n,  INDArray a, DataBuffer lda, INDArray work );
    double dlantr( String norm, String uplo, String diag, DataBuffer m,
                   DataBuffer n,  INDArray a, DataBuffer lda, INDArray work );
    float clantr( String norm, String uplo, String diag, DataBuffer m,
                  DataBuffer n,  IComplexNumber a, DataBuffer lda,
                  INDArray work );
    double zlantr( String norm, String uplo, String diag, DataBuffer m,
                   DataBuffer n,  IComplexNumber a, DataBuffer lda,
                   INDArray work );
    float slamch( String cmach );
    double dlamch( String cmach );
    void sgelq2( DataBuffer m, DataBuffer n, INDArray a, DataBuffer lda,
                 INDArray tau, INDArray work, DataBuffer info );
    void dgelq2( DataBuffer m, DataBuffer n, INDArray a, DataBuffer lda,
                 INDArray tau, INDArray work, DataBuffer info );
    void cgelq2( DataBuffer m, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, IComplexNumber tau,
                 IComplexNumber work, DataBuffer info );
    void zgelq2( DataBuffer m, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, IComplexNumber tau,
                 IComplexNumber work, DataBuffer info );
    void slarfb( String side, String trans, String direct, String storev,
                 DataBuffer m, DataBuffer n, DataBuffer k,  INDArray v,
                 DataBuffer ldv,  INDArray t, DataBuffer ldt, INDArray c,
                 DataBuffer ldc, INDArray work, DataBuffer ldwork );
    void dlarfb( String side, String trans, String direct, String storev,
                 DataBuffer m, DataBuffer n, DataBuffer k,
                 INDArray v, DataBuffer ldv,  INDArray t,
                 DataBuffer ldt, INDArray c, DataBuffer ldc, INDArray work,
                 DataBuffer ldwork );
    void clarfb( String side, String trans, String direct, String storev,
                 DataBuffer m, DataBuffer n, DataBuffer k,
                 IComplexNumber v, DataBuffer ldv,
                 IComplexNumber t, DataBuffer ldt,
                 IComplexNumber c, DataBuffer ldc,
                 IComplexNumber work, DataBuffer ldwork );
    void zlarfb( String side, String trans, String direct, String storev,
                 DataBuffer m, DataBuffer n, DataBuffer k,
                 IComplexNumber v, DataBuffer ldv,
                 IComplexNumber t, DataBuffer ldt,
                 IComplexNumber c, DataBuffer ldc,
                 IComplexNumber work, DataBuffer ldwork );
    void slarfg( DataBuffer n, INDArray alpha, INDArray x, DataBuffer incx,
                 INDArray tau );
    void dlarfg( DataBuffer n, INDArray alpha, INDArray x, DataBuffer incx,
                 INDArray tau );
    void clarfg( DataBuffer n, IComplexNumber alpha,
                 IComplexNumber x, DataBuffer incx,
                 IComplexNumber tau );
    void zlarfg( DataBuffer n, IComplexNumber alpha,
                 IComplexNumber x, DataBuffer incx,
                 IComplexNumber tau );
    void slarft( String direct, String storev, DataBuffer n, DataBuffer k,
                 INDArray v, DataBuffer ldv,  INDArray tau, INDArray t,
                 DataBuffer ldt );
    void dlarft( String direct, String storev, DataBuffer n, DataBuffer k,
                 INDArray v, DataBuffer ldv,  INDArray tau,
                 INDArray t, DataBuffer ldt );
    void clarft( String direct, String storev, DataBuffer n, DataBuffer k,
                 IComplexNumber v, DataBuffer ldv,
                 IComplexNumber tau, IComplexNumber t,
                 DataBuffer ldt );
    void zlarft( String direct, String storev, DataBuffer n, DataBuffer k,
                 IComplexNumber v, DataBuffer ldv,
                 IComplexNumber tau, IComplexNumber t,
                 DataBuffer ldt );
    void slarfx( String side, DataBuffer m, DataBuffer n,  INDArray v,
                 INDArray tau, INDArray c, DataBuffer ldc, INDArray work );
    void dlarfx( String side, DataBuffer m, DataBuffer n,  INDArray v,
                 INDArray tau, INDArray c, DataBuffer ldc, INDArray work );
    void clarfx( String side, DataBuffer m, DataBuffer n,
                 IComplexNumber v, IComplexNumber tau,
                 IComplexNumber c, DataBuffer ldc,
                 IComplexNumber work );
    void zlarfx( String side, DataBuffer m, DataBuffer n,
                 IComplexNumber v, IComplexNumber tau,
                 IComplexNumber c, DataBuffer ldc,
                 IComplexNumber work );
    void slatms( DataBuffer m, DataBuffer n, String dist, DataBuffer iseed,
                 String sym, INDArray d, DataBuffer mode, INDArray cond,
                 INDArray dmax, DataBuffer kl, DataBuffer ku, String pack,
                 INDArray a, DataBuffer lda, INDArray work, DataBuffer info );
    void dlatms( DataBuffer m, DataBuffer n, String dist, DataBuffer iseed,
                 String sym, INDArray d, DataBuffer mode, INDArray cond,
                 INDArray dmax, DataBuffer kl, DataBuffer ku, String pack,
                 INDArray a, DataBuffer lda, INDArray work,
                 DataBuffer info );
    void clatms( DataBuffer m, DataBuffer n, String dist, DataBuffer iseed,
                 String sym, INDArray d, DataBuffer mode, INDArray cond,
                 INDArray dmax, DataBuffer kl, DataBuffer ku, String pack,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber work, DataBuffer info );
    void zlatms( DataBuffer m, DataBuffer n, String dist, DataBuffer iseed,
                 String sym, INDArray d, DataBuffer mode, INDArray cond,
                 INDArray dmax, DataBuffer kl, DataBuffer ku, String pack,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber work, DataBuffer info );
    void slag2d( DataBuffer m, DataBuffer n,  INDArray sa,
                 DataBuffer ldsa, INDArray a, DataBuffer lda,
                 DataBuffer info );
    void dlag2s( DataBuffer m, DataBuffer n,  INDArray a,
                 DataBuffer lda, INDArray sa, DataBuffer ldsa,
                 DataBuffer info );
    void clag2z( DataBuffer m, DataBuffer n,
                 IComplexNumber sa, DataBuffer ldsa,
                 IComplexNumber a, DataBuffer lda,
                 DataBuffer info );
    void zlag2c( DataBuffer m, DataBuffer n,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber sa, DataBuffer ldsa,
                 DataBuffer info );
    void slauum( String uplo, DataBuffer n, INDArray a, DataBuffer lda,
                 DataBuffer info );
    void dlauum( String uplo, DataBuffer n, INDArray a, DataBuffer lda,
                 DataBuffer info );
    void clauum( String uplo, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, DataBuffer info );
    void zlauum( String uplo, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, DataBuffer info );
    void slagge( DataBuffer m, DataBuffer n, DataBuffer kl,
                 DataBuffer ku,  INDArray d, INDArray a, DataBuffer lda,
                 DataBuffer iseed, INDArray work, DataBuffer info );
    void dlagge( DataBuffer m, DataBuffer n, DataBuffer kl,
                 DataBuffer ku,  INDArray d, INDArray a, DataBuffer lda,
                 DataBuffer iseed, INDArray work, DataBuffer info );
    void clagge( DataBuffer m, DataBuffer n, DataBuffer kl,
                 DataBuffer ku,  INDArray d, IComplexNumber a,
                 DataBuffer lda, DataBuffer iseed,
                 IComplexNumber work, DataBuffer info );
    void zlagge( DataBuffer m, DataBuffer n, DataBuffer kl,
                 DataBuffer ku,  INDArray d, IComplexNumber a,
                 DataBuffer lda, DataBuffer iseed,
                 IComplexNumber work, DataBuffer info );
    void slascl( String type, DataBuffer kl, DataBuffer ku, INDArray cfrom,
                 INDArray cto, DataBuffer m, DataBuffer n, INDArray a,
                 DataBuffer lda, DataBuffer info );
    void dlascl( String type, DataBuffer kl, DataBuffer ku, INDArray cfrom,
                 INDArray cto, DataBuffer m, DataBuffer n, INDArray a,
                 DataBuffer lda, DataBuffer info );
    void clascl( String type, DataBuffer kl, DataBuffer ku, INDArray cfrom,
                 INDArray cto, DataBuffer m, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, DataBuffer info );
    void zlascl( String type, DataBuffer kl, DataBuffer ku, INDArray cfrom,
                 INDArray cto, DataBuffer m, DataBuffer n, IComplexNumber a,
                 DataBuffer lda, DataBuffer info );
    void slaset( String uplo, DataBuffer m, DataBuffer n, INDArray alpha,
                 INDArray beta, INDArray a, DataBuffer lda );
    void dlaset( String uplo, DataBuffer m, DataBuffer n, INDArray alpha,
                 INDArray beta, INDArray a, DataBuffer lda );
    void claset( String uplo, DataBuffer m, DataBuffer n,
                 IComplexNumber alpha, IComplexNumber beta,
                 IComplexNumber a, DataBuffer lda );
    void zlaset( String uplo, DataBuffer m, DataBuffer n,
                 IComplexNumber alpha, IComplexNumber beta,
                 IComplexNumber a, DataBuffer lda );
    void slasrt( String id, DataBuffer n, INDArray d, DataBuffer info );
    void dlasrt( String id, DataBuffer n, INDArray d, DataBuffer info );
    void claghe( DataBuffer n, DataBuffer k,  INDArray d,
                 IComplexNumber a, DataBuffer lda, DataBuffer iseed,
                 IComplexNumber work, DataBuffer info );
    void zlaghe( DataBuffer n, DataBuffer k,  INDArray d,
                 IComplexNumber a, DataBuffer lda,
                 DataBuffer iseed, IComplexNumber work,
                 DataBuffer info );
    void slagsy( DataBuffer n, DataBuffer k,  INDArray d, INDArray a,
                 DataBuffer lda, DataBuffer iseed, INDArray work,
                 DataBuffer info );
    void dlagsy( DataBuffer n, DataBuffer k,  INDArray d, INDArray a,
                 DataBuffer lda, DataBuffer iseed, INDArray work,
                 DataBuffer info );
    void clagsy( DataBuffer n, DataBuffer k,  INDArray d,
                 IComplexNumber a, DataBuffer lda, DataBuffer iseed,
                 IComplexNumber work, DataBuffer info );
    void zlagsy( DataBuffer n, DataBuffer k,  INDArray d,
                 IComplexNumber a, DataBuffer lda,
                 DataBuffer iseed, IComplexNumber work,
                 DataBuffer info );
    void slapmr( DataBuffer forwrd, DataBuffer m, DataBuffer n,
                 INDArray x, DataBuffer ldx, DataBuffer k );
    void dlapmr( DataBuffer forwrd, DataBuffer m, DataBuffer n,
                 INDArray x, DataBuffer ldx, DataBuffer k );
    void clapmr( DataBuffer forwrd, DataBuffer m, DataBuffer n,
                 IComplexNumber x, DataBuffer ldx, DataBuffer k );
    void zlapmr( DataBuffer forwrd, DataBuffer m, DataBuffer n,
                 IComplexNumber x, DataBuffer ldx, DataBuffer k );
    void slapmt( DataBuffer forwrd, DataBuffer m, DataBuffer n,
                 INDArray x, DataBuffer ldx, DataBuffer k );
    void dlapmt( DataBuffer forwrd, DataBuffer m, DataBuffer n,
                 INDArray x, DataBuffer ldx, DataBuffer k );
    void clapmt( DataBuffer forwrd, DataBuffer m, DataBuffer n,
                 IComplexNumber x, DataBuffer ldx, DataBuffer k );
    void zlapmt( DataBuffer forwrd, DataBuffer m, DataBuffer n,
                 IComplexNumber x, DataBuffer ldx, DataBuffer k );
    float slapy2( INDArray x, INDArray y );
    double dlapy2( INDArray x, INDArray y );
    float slapy3( INDArray x, INDArray y, INDArray z );
    double dlapy3( INDArray x, INDArray y, INDArray z );
    void slartgp( INDArray f, INDArray g, INDArray cs, INDArray sn, INDArray r );
    void dlartgp( INDArray f, INDArray g, INDArray cs, INDArray sn, INDArray r );
    void slartgs( INDArray x, INDArray y, INDArray sigma, INDArray cs, INDArray sn );
    void dlartgs( INDArray x, INDArray y, INDArray sigma, INDArray cs,
                  INDArray sn );
    // LAPACK 3.3.0
    void cbbcsd( String jobu1, String jobu2,
                 String jobv1t, String jobv2t, String trans,
                 DataBuffer m, DataBuffer p, DataBuffer q,
                 INDArray theta, INDArray phi,
                 IComplexNumber u1, DataBuffer ldu1,
                 IComplexNumber u2, DataBuffer ldu2,
                 IComplexNumber v1t, DataBuffer ldv1t,
                 IComplexNumber v2t, DataBuffer ldv2t,
                 INDArray b11d, INDArray b11e, INDArray b12d,
                 INDArray b12e, INDArray b21d, INDArray b21e,
                 INDArray b22d, INDArray b22e, INDArray rwork,
                 DataBuffer lrwork , DataBuffer info );
    void cheswapr( String uplo, DataBuffer n,
                   IComplexNumber a, DataBuffer i1,
                   DataBuffer i2 );
    void chetri2( String uplo, DataBuffer n,
                  IComplexNumber a, DataBuffer lda,
                  DataBuffer ipiv,
                  IComplexNumber work, DataBuffer lwork , DataBuffer info );
    void chetri2x( String uplo, DataBuffer n,
                   IComplexNumber a, DataBuffer lda,
                   DataBuffer ipiv,
                   IComplexNumber work, DataBuffer nb , DataBuffer info );
    void chetrs2( String uplo, DataBuffer n,
                  DataBuffer nrhs,  IComplexNumber a,
                  DataBuffer lda,  DataBuffer ipiv,
                  IComplexNumber b, DataBuffer ldb,
                  IComplexNumber work , DataBuffer info );
    void csyconv( String uplo, String way,
                  DataBuffer n, IComplexNumber a,
                  DataBuffer lda,  DataBuffer ipiv,
                  IComplexNumber work , DataBuffer info );
    void csyswapr( String uplo, DataBuffer n,
                   IComplexNumber a, DataBuffer i1,
                   DataBuffer i2 );
    void csytri2( String uplo, DataBuffer n,
                  IComplexNumber a, DataBuffer lda,
                  DataBuffer ipiv,
                  IComplexNumber work, DataBuffer lwork , DataBuffer info );
    void csytri2x( String uplo, DataBuffer n,
                   IComplexNumber a, DataBuffer lda,
                   DataBuffer ipiv,
                   IComplexNumber work, DataBuffer nb , DataBuffer info );
    void csytrs2( String uplo, DataBuffer n,
                  DataBuffer nrhs,  IComplexNumber a,
                  DataBuffer lda,  DataBuffer ipiv,
                  IComplexNumber b, DataBuffer ldb,
                  IComplexNumber work , DataBuffer info );
    void cunbdb( String trans, String signs,
                 DataBuffer m, DataBuffer p, DataBuffer q,
                 IComplexNumber x11, DataBuffer ldx11,
                 IComplexNumber x12, DataBuffer ldx12,
                 IComplexNumber x21, DataBuffer ldx21,
                 IComplexNumber x22, DataBuffer ldx22,
                 INDArray theta, INDArray phi,
                 IComplexNumber taup1,
                 IComplexNumber taup2,
                 IComplexNumber tauq1,
                 IComplexNumber tauq2,
                 IComplexNumber work, DataBuffer lwork , DataBuffer info );
    void cuncsd( String jobu1, String jobu2,
                 String jobv1t, String jobv2t, String trans,
                 String signs, DataBuffer m, DataBuffer p,
                 DataBuffer q, IComplexNumber x11,
                 DataBuffer ldx11, IComplexNumber x12,
                 DataBuffer ldx12, IComplexNumber x21,
                 DataBuffer ldx21, IComplexNumber x22,
                 DataBuffer ldx22, INDArray theta,
                 IComplexNumber u1, DataBuffer ldu1,
                 IComplexNumber u2, DataBuffer ldu2,
                 IComplexNumber v1t, DataBuffer ldv1t,
                 IComplexNumber v2t, DataBuffer ldv2t,
                 IComplexNumber work, DataBuffer lwork,
                 INDArray rwork, DataBuffer lrwork,
                 DataBuffer iwork , DataBuffer info );
    void cuncsd2by1( String jobu1, String jobu2,
                     String jobv1t, DataBuffer m, DataBuffer p,
                     DataBuffer q, IComplexNumber x11,
                     DataBuffer ldx11, IComplexNumber x21,
                     DataBuffer ldx21, IComplexNumber theta,
                     IComplexNumber u1, DataBuffer ldu1,
                     IComplexNumber u2, DataBuffer ldu2,
                     IComplexNumber v1t, DataBuffer ldv1t,
                     IComplexNumber work, DataBuffer lwork,
                     INDArray rwork, DataBuffer lrwork,
                     DataBuffer iwork , DataBuffer info );
    void dbbcsd( String jobu1, String jobu2,
                 String jobv1t, String jobv2t, String trans,
                 DataBuffer m, DataBuffer p, DataBuffer q,
                 INDArray theta, INDArray phi, INDArray u1,
                 DataBuffer ldu1, INDArray u2, DataBuffer ldu2,
                 INDArray v1t, DataBuffer ldv1t, INDArray v2t,
                 DataBuffer ldv2t, INDArray b11d, INDArray b11e,
                 INDArray b12d, INDArray b12e, INDArray b21d,
                 INDArray b21e, INDArray b22d, INDArray b22e,
                 INDArray work, DataBuffer lwork , DataBuffer info );
    void dorbdb( String trans, String signs,
                 DataBuffer m, DataBuffer p, DataBuffer q,
                 INDArray x11, DataBuffer ldx11, INDArray x12,
                 DataBuffer ldx12, INDArray x21, DataBuffer ldx21,
                 INDArray x22, DataBuffer ldx22, INDArray theta,
                 INDArray phi, INDArray taup1, INDArray taup2,
                 INDArray tauq1, INDArray tauq2, INDArray work,
                 DataBuffer lwork , DataBuffer info );
    void dorcsd( String jobu1, String jobu2,
                 String jobv1t, String jobv2t, String trans,
                 String signs, DataBuffer m, DataBuffer p,
                 DataBuffer q, INDArray x11, DataBuffer ldx11,
                 INDArray x12, DataBuffer ldx12, INDArray x21,
                 DataBuffer ldx21, INDArray x22, DataBuffer ldx22,
                 INDArray theta, INDArray u1, DataBuffer ldu1,
                 INDArray u2, DataBuffer ldu2, INDArray v1t,
                 DataBuffer ldv1t, INDArray v2t, DataBuffer ldv2t,
                 INDArray work, DataBuffer lwork,
                 DataBuffer iwork , DataBuffer info );
    void dorcsd2by1( String jobu1, String jobu2,
                     String jobv1t, DataBuffer m, DataBuffer p,
                     DataBuffer q, INDArray x11, DataBuffer ldx11,
                     INDArray x21, DataBuffer ldx21,
                     INDArray theta, INDArray u1, DataBuffer ldu1,
                     INDArray u2, DataBuffer ldu2, INDArray v1t,
                     DataBuffer ldv1t, INDArray work, DataBuffer lwork,
                     DataBuffer iwork , DataBuffer info );
    void dsyconv( String uplo, String way,
                  DataBuffer n, INDArray a, DataBuffer lda,
                  DataBuffer ipiv, INDArray work , DataBuffer info );
    void dsyswapr( String uplo, DataBuffer n,
                   INDArray a, DataBuffer i1, DataBuffer i2 );
    void dsytri2( String uplo, DataBuffer n,
                  INDArray a, DataBuffer lda,
                  DataBuffer ipiv,
                  IComplexNumber work, DataBuffer lwork , DataBuffer info );
    void dsytri2x( String uplo, DataBuffer n,
                   INDArray a, DataBuffer lda,
                   DataBuffer ipiv, INDArray work,
                   DataBuffer nb , DataBuffer info );
    void dsytrs2( String uplo, DataBuffer n,
                  DataBuffer nrhs,  INDArray a,
                  DataBuffer lda,  DataBuffer ipiv,
                  INDArray b, DataBuffer ldb, INDArray work , DataBuffer info );
    void sbbcsd( String jobu1, String jobu2,
                 String jobv1t, String jobv2t, String trans,
                 DataBuffer m, DataBuffer p, DataBuffer q,
                 INDArray theta, INDArray phi, INDArray u1,
                 DataBuffer ldu1, INDArray u2, DataBuffer ldu2,
                 INDArray v1t, DataBuffer ldv1t, INDArray v2t,
                 DataBuffer ldv2t, INDArray b11d, INDArray b11e,
                 INDArray b12d, INDArray b12e, INDArray b21d,
                 INDArray b21e, INDArray b22d, INDArray b22e,
                 INDArray work, DataBuffer lwork , DataBuffer info );
    void sorbdb( String trans, String signs,
                 DataBuffer m, DataBuffer p, DataBuffer q,
                 INDArray x11, DataBuffer ldx11, INDArray x12,
                 DataBuffer ldx12, INDArray x21, DataBuffer ldx21,
                 INDArray x22, DataBuffer ldx22, INDArray theta,
                 INDArray phi, INDArray taup1, INDArray taup2,
                 INDArray tauq1, INDArray tauq2, INDArray work,
                 DataBuffer lwork , DataBuffer info );
    void sorcsd( String jobu1, String jobu2,
                 String jobv1t, String jobv2t, String trans,
                 String signs, DataBuffer m, DataBuffer p,
                 DataBuffer q, INDArray x11, DataBuffer ldx11,
                 INDArray x12, DataBuffer ldx12, INDArray x21,
                 DataBuffer ldx21, INDArray x22, DataBuffer ldx22,
                 INDArray theta, INDArray u1, DataBuffer ldu1,
                 INDArray u2, DataBuffer ldu2, INDArray v1t,
                 DataBuffer ldv1t, INDArray v2t, DataBuffer ldv2t,
                 INDArray work, DataBuffer lwork,
                 DataBuffer iwork , DataBuffer info );
    void sorcsd2by1( String jobu1, String jobu2,
                     String jobv1t, DataBuffer m, DataBuffer p,
                     DataBuffer q, INDArray x11, DataBuffer ldx11,
                     INDArray x21, DataBuffer ldx21,
                     INDArray theta, INDArray u1, DataBuffer ldu1,
                     INDArray u2, DataBuffer ldu2, INDArray v1t,
                     DataBuffer ldv1t, INDArray work, DataBuffer lwork,
                     DataBuffer iwork , DataBuffer info );
    void ssyconv( String uplo, String way,
                  DataBuffer n, INDArray a, DataBuffer lda,
                  DataBuffer ipiv, INDArray work , DataBuffer info );
    void ssyswapr( String uplo, DataBuffer n,
                   INDArray a, DataBuffer i1, DataBuffer i2 );
    void ssytri2( String uplo, DataBuffer n,
                  INDArray a, DataBuffer lda,
                  DataBuffer ipiv,
                  IComplexNumber work, DataBuffer lwork , DataBuffer info );
    void ssytri2x( String uplo, DataBuffer n,
                   INDArray a, DataBuffer lda,
                   DataBuffer ipiv, INDArray work,
                   DataBuffer nb , DataBuffer info );
    void ssytrs2( String uplo, DataBuffer n,
                  DataBuffer nrhs,  INDArray a,
                  DataBuffer lda,  DataBuffer ipiv,
                  INDArray b, DataBuffer ldb, INDArray work , DataBuffer info );
    void zbbcsd( String jobu1, String jobu2,
                 String jobv1t, String jobv2t, String trans,
                 DataBuffer m, DataBuffer p, DataBuffer q,
                 INDArray theta, INDArray phi,
                 IComplexNumber u1, DataBuffer ldu1,
                 IComplexNumber u2, DataBuffer ldu2,
                 IComplexNumber v1t, DataBuffer ldv1t,
                 IComplexNumber v2t, DataBuffer ldv2t,
                 INDArray b11d, INDArray b11e, INDArray b12d,
                 INDArray b12e, INDArray b21d, INDArray b21e,
                 INDArray b22d, INDArray b22e, INDArray rwork,
                 DataBuffer lrwork , DataBuffer info );
    void zheswapr( String uplo, DataBuffer n,
                   IComplexNumber a, DataBuffer i1,
                   DataBuffer i2 );
    void zhetri2( String uplo, DataBuffer n,
                  IComplexNumber a, DataBuffer lda,
                  DataBuffer ipiv,
                  IComplexNumber work, DataBuffer lwork , DataBuffer info );
    void zhetri2x( String uplo, DataBuffer n,
                   IComplexNumber a, DataBuffer lda,
                   DataBuffer ipiv,
                   IComplexNumber work, DataBuffer nb , DataBuffer info );
    void zhetrs2( String uplo, DataBuffer n,
                  DataBuffer nrhs,
                  IComplexNumber a, DataBuffer lda,
                  DataBuffer ipiv,
                  IComplexNumber b, DataBuffer ldb,
                  IComplexNumber work , DataBuffer info );
    void zsyconv( String uplo, String way,
                  DataBuffer n, IComplexNumber a,
                  DataBuffer lda,  DataBuffer ipiv,
                  IComplexNumber work , DataBuffer info );
    void zsyswapr( String uplo, DataBuffer n,
                   IComplexNumber a, DataBuffer i1,
                   DataBuffer i2 );
    void zsytri2( String uplo, DataBuffer n,
                  IComplexNumber a, DataBuffer lda,
                  DataBuffer ipiv,
                  IComplexNumber work, DataBuffer lwork , DataBuffer info );
    void zsytri2x( String uplo, DataBuffer n,
                   IComplexNumber a, DataBuffer lda,
                   DataBuffer ipiv,
                   IComplexNumber work, DataBuffer nb , DataBuffer info );
    void zsytrs2( String uplo, DataBuffer n,
                  DataBuffer nrhs,
                  IComplexNumber a, DataBuffer lda,
                  DataBuffer ipiv,
                  IComplexNumber b, DataBuffer ldb,
                  IComplexNumber work , DataBuffer info );
    void zunbdb( String trans, String signs,
                 DataBuffer m, DataBuffer p, DataBuffer q,
                 IComplexNumber x11, DataBuffer ldx11,
                 IComplexNumber x12, DataBuffer ldx12,
                 IComplexNumber x21, DataBuffer ldx21,
                 IComplexNumber x22, DataBuffer ldx22,
                 INDArray theta, INDArray phi,
                 IComplexNumber taup1,
                 IComplexNumber taup2,
                 IComplexNumber tauq1,
                 IComplexNumber tauq2,
                 IComplexNumber work, DataBuffer lwork , DataBuffer info );
    void zuncsd( String jobu1, String jobu2,
                 String jobv1t, String jobv2t, String trans,
                 String signs, DataBuffer m, DataBuffer p,
                 DataBuffer q, IComplexNumber x11,
                 DataBuffer ldx11, IComplexNumber x12,
                 DataBuffer ldx12, IComplexNumber x21,
                 DataBuffer ldx21, IComplexNumber x22,
                 DataBuffer ldx22, INDArray theta,
                 IComplexNumber u1, DataBuffer ldu1,
                 IComplexNumber u2, DataBuffer ldu2,
                 IComplexNumber v1t, DataBuffer ldv1t,
                 IComplexNumber v2t, DataBuffer ldv2t,
                 IComplexNumber work, DataBuffer lwork,
                 INDArray rwork, DataBuffer lrwork,
                 DataBuffer iwork , DataBuffer info );
    void zuncsd2by1( String jobu1, String jobu2,
                     String jobv1t, DataBuffer m, DataBuffer p,
                     DataBuffer q, IComplexNumber x11,
                     DataBuffer ldx11, IComplexNumber x21,
                     DataBuffer ldx21, IComplexNumber theta,
                     IComplexNumber u1, DataBuffer ldu1,
                     IComplexNumber u2, DataBuffer ldu2,
                     IComplexNumber v1t, DataBuffer ldv1t,
                     IComplexNumber work, DataBuffer lwork,
                     INDArray rwork, DataBuffer lrwork,
                     DataBuffer iwork , DataBuffer info );
    // LAPACK 3.4.0
    void sgemqrt( String side, String trans, DataBuffer m, DataBuffer n,
                  DataBuffer k, DataBuffer nb,  INDArray v,
                  DataBuffer ldv,  INDArray t, DataBuffer ldt, INDArray c,
                  DataBuffer ldc, INDArray work, DataBuffer info );
    void dgemqrt( String side, String trans, DataBuffer m, DataBuffer n,
                  DataBuffer k, DataBuffer nb,  INDArray v,
                  DataBuffer ldv,  INDArray t, DataBuffer ldt,
                  INDArray c, DataBuffer ldc, INDArray work,
                  DataBuffer info );
    void cgemqrt( String side, String trans, DataBuffer m, DataBuffer n,
                  DataBuffer k, DataBuffer nb,
                  IComplexNumber v, DataBuffer ldv,
                  IComplexNumber t, DataBuffer ldt,
                  IComplexNumber c, DataBuffer ldc,
                  IComplexNumber work, DataBuffer info );
    void zgemqrt( String side, String trans, DataBuffer m, DataBuffer n,
                  DataBuffer k, DataBuffer nb,
                  IComplexNumber v, DataBuffer ldv,
                  IComplexNumber t, DataBuffer ldt,
                  IComplexNumber c, DataBuffer ldc,
                  IComplexNumber work, DataBuffer info );
    void sgeqrt( DataBuffer m, DataBuffer n, DataBuffer nb, INDArray a,
                 DataBuffer lda, INDArray t, DataBuffer ldt, INDArray work,
                 DataBuffer info );
    void dgeqrt( DataBuffer m, DataBuffer n, DataBuffer nb, INDArray a,
                 DataBuffer lda, INDArray t, DataBuffer ldt, INDArray work,
                 DataBuffer info );
    void cgeqrt( DataBuffer m, DataBuffer n, DataBuffer nb,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber t, DataBuffer ldt,
                 IComplexNumber work, DataBuffer info );
    void zgeqrt( DataBuffer m, DataBuffer n, DataBuffer nb,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber t, DataBuffer ldt,
                 IComplexNumber work, DataBuffer info );
    void sgeqrt2( DataBuffer m, DataBuffer n, INDArray a, DataBuffer lda,
                  INDArray t, DataBuffer ldt, DataBuffer info );
    void dgeqrt2( DataBuffer m, DataBuffer n, INDArray a, DataBuffer lda,
                  INDArray t, DataBuffer ldt, DataBuffer info );
    void cgeqrt2( DataBuffer m, DataBuffer n, IComplexNumber a,
                  DataBuffer lda, IComplexNumber t, DataBuffer ldt,
                  DataBuffer info );
    void zgeqrt2( DataBuffer m, DataBuffer n, IComplexNumber a,
                  DataBuffer lda, IComplexNumber t, DataBuffer ldt,
                  DataBuffer info );
    void sgeqrt3( DataBuffer m, DataBuffer n, INDArray a, DataBuffer lda,
                  INDArray t, DataBuffer ldt, DataBuffer info );
    void dgeqrt3( DataBuffer m, DataBuffer n, INDArray a, DataBuffer lda,
                  INDArray t, DataBuffer ldt, DataBuffer info );
    void cgeqrt3( DataBuffer m, DataBuffer n, IComplexNumber a,
                  DataBuffer lda, IComplexNumber t, DataBuffer ldt,
                  DataBuffer info );
    void zgeqrt3( DataBuffer m, DataBuffer n, IComplexNumber a,
                  DataBuffer lda, IComplexNumber t, DataBuffer ldt,
                  DataBuffer info );
    void stpmqrt( String side, String trans, DataBuffer m, DataBuffer n,
                  DataBuffer k, DataBuffer l, DataBuffer nb,
                  INDArray v, DataBuffer ldv,  INDArray t,
                  DataBuffer ldt, INDArray a, DataBuffer lda, INDArray b,
                  DataBuffer ldb, INDArray work, DataBuffer info );
    void dtpmqrt( String side, String trans, DataBuffer m, DataBuffer n,
                  DataBuffer k, DataBuffer l, DataBuffer nb,
                  INDArray v, DataBuffer ldv,  INDArray t,
                  DataBuffer ldt, INDArray a, DataBuffer lda, INDArray b,
                  DataBuffer ldb, INDArray work, DataBuffer info );
    void ctpmqrt( String side, String trans, DataBuffer m, DataBuffer n,
                  DataBuffer k, DataBuffer l, DataBuffer nb,
                  IComplexNumber v, DataBuffer ldv,
                  IComplexNumber t, DataBuffer ldt,
                  IComplexNumber a, DataBuffer lda,
                  IComplexNumber b, DataBuffer ldb,
                  IComplexNumber work, DataBuffer info );
    void ztpmqrt( String side, String trans, DataBuffer m, DataBuffer n,
                  DataBuffer k, DataBuffer l, DataBuffer nb,
                  IComplexNumber v, DataBuffer ldv,
                  IComplexNumber t, DataBuffer ldt,
                  IComplexNumber a, DataBuffer lda,
                  IComplexNumber b, DataBuffer ldb,
                  IComplexNumber work, DataBuffer info );
    void stpqrt( DataBuffer m, DataBuffer n, DataBuffer l, DataBuffer nb,
                 INDArray a, DataBuffer lda, INDArray b, DataBuffer ldb,
                 INDArray t, DataBuffer ldt, INDArray work, DataBuffer info );
    void dtpqrt( DataBuffer m, DataBuffer n, DataBuffer l, DataBuffer nb,
                 INDArray a, DataBuffer lda, INDArray b, DataBuffer ldb,
                 INDArray t, DataBuffer ldt, INDArray work,
                 DataBuffer info );
    void ctpqrt( DataBuffer m, DataBuffer n, DataBuffer l, DataBuffer nb,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber t, DataBuffer ldt,
                 IComplexNumber work, DataBuffer info );
    void ztpqrt( DataBuffer m, DataBuffer n, DataBuffer l, DataBuffer nb,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber t, DataBuffer ldt,
                 IComplexNumber work, DataBuffer info );
    void stpqrt2( DataBuffer m, DataBuffer n, DataBuffer l,
                  INDArray a, DataBuffer lda,
                  INDArray b, DataBuffer ldb,
                  INDArray t, DataBuffer ldt,
                  DataBuffer info );
    void dtpqrt2( DataBuffer m, DataBuffer n, DataBuffer l,
                  INDArray a, DataBuffer lda,
                  INDArray b, DataBuffer ldb,
                  INDArray t, DataBuffer ldt,
                  DataBuffer info );
    void ctpqrt2( DataBuffer m, DataBuffer n, DataBuffer l,
                  IComplexNumber a, DataBuffer lda,
                  IComplexNumber b, DataBuffer ldb,
                  IComplexNumber t, DataBuffer ldt,
                  DataBuffer info );
    void ztpqrt2( DataBuffer m, DataBuffer n, DataBuffer l,
                  IComplexNumber a, DataBuffer lda,
                  IComplexNumber b, DataBuffer ldb,
                  IComplexNumber t, DataBuffer ldt,
                  DataBuffer info );
    void stprfb( String side, String trans, String direct, String storev,
                 DataBuffer m, DataBuffer n, DataBuffer k, DataBuffer l,
                 INDArray v, DataBuffer ldv,  INDArray t,
                 DataBuffer ldt, INDArray a, DataBuffer lda, INDArray b,
                 DataBuffer ldb,  INDArray work,
                 DataBuffer ldwork );
    void dtprfb( String side, String trans, String direct, String storev,
                 DataBuffer m, DataBuffer n, DataBuffer k, DataBuffer l,
                 INDArray v, DataBuffer ldv,  INDArray t,
                 DataBuffer ldt, INDArray a, DataBuffer lda, INDArray b,
                 DataBuffer ldb,  INDArray work,
                 DataBuffer ldwork );
    void ctprfb( String side, String trans, String direct, String storev,
                 DataBuffer m, DataBuffer n, DataBuffer k, DataBuffer l,
                 IComplexNumber v, DataBuffer ldv,
                 IComplexNumber t, DataBuffer ldt,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber work, DataBuffer ldwork );
    void ztprfb( String side, String trans, String direct, String storev,
                 DataBuffer m, DataBuffer n, DataBuffer k, DataBuffer l,
                 IComplexNumber v, DataBuffer ldv,
                 IComplexNumber t, DataBuffer ldt,
                 IComplexNumber a, DataBuffer lda,
                 IComplexNumber b, DataBuffer ldb,
                 IComplexNumber work, DataBuffer ldwork );
    // LAPACK 3.5.0
    void ssysint( String uplo, DataBuffer n, DataBuffer nrhs, INDArray a,
                  DataBuffer lda, DataBuffer ipiv, INDArray b,
                  DataBuffer ldb, INDArray work, DataBuffer lwork,
                  DataBuffer info );
    void ssytrint( String uplo, DataBuffer n, INDArray a, DataBuffer lda,
                   DataBuffer ipiv, INDArray work, DataBuffer lwork,
                   DataBuffer info );
    void dsysint( String uplo, DataBuffer n, DataBuffer nrhs, INDArray a,
                  DataBuffer lda, DataBuffer ipiv, INDArray b,
                  DataBuffer ldb, INDArray work, DataBuffer lwork,
                  DataBuffer info );
    void dsytrint( String uplo, DataBuffer n, INDArray a, DataBuffer lda,
                   DataBuffer ipiv, INDArray work, DataBuffer lwork,
                   DataBuffer info );
    void csysint( String uplo, DataBuffer n, DataBuffer nrhs,
                  IComplexNumber a, DataBuffer lda,
                  DataBuffer ipiv, IComplexNumber b,
                  DataBuffer ldb, IComplexNumber work,
                  DataBuffer lwork, DataBuffer info );
    void csytrint( String uplo, DataBuffer n, IComplexNumber a,
                   DataBuffer lda, DataBuffer ipiv,
                   IComplexNumber work, DataBuffer lwork,
                   DataBuffer info );
    void zsysint( String uplo, DataBuffer n, DataBuffer nrhs,
                  IComplexNumber a, DataBuffer lda,
                  DataBuffer ipiv, IComplexNumber b,
                  DataBuffer ldb, IComplexNumber work,
                  DataBuffer lwork, DataBuffer info );
    void zsytrint( String uplo, DataBuffer n, IComplexNumber a,
                   DataBuffer lda, DataBuffer ipiv,
                   IComplexNumber work, DataBuffer lwork,
                   DataBuffer info );
    void ssytrint( String uplo, DataBuffer n, DataBuffer nrhs,  INDArray a,
                   DataBuffer lda,  DataBuffer ipiv, INDArray b,
                   DataBuffer ldb, DataBuffer info );
    void dsytrint( String uplo, DataBuffer n, DataBuffer nrhs,
                   INDArray a, DataBuffer lda,  DataBuffer ipiv,
                   INDArray b, DataBuffer ldb, DataBuffer info );
    void csytrint( String uplo, DataBuffer n, DataBuffer nrhs,
                   IComplexNumber a, DataBuffer lda,
                   DataBuffer ipiv, IComplexNumber b,
                   DataBuffer ldb, DataBuffer info );
    void zsytrint( String uplo, DataBuffer n, DataBuffer nrhs,
                   IComplexNumber a, DataBuffer lda,
                   DataBuffer ipiv, IComplexNumber b,
                   DataBuffer ldb, DataBuffer info );
    void chetrint( String uplo, DataBuffer n, IComplexNumber a,
                   DataBuffer lda, DataBuffer ipiv,
                   IComplexNumber work, DataBuffer lwork,
                   DataBuffer info );
    void zhetrint( String uplo, DataBuffer n, IComplexNumber a,
                   DataBuffer lda, DataBuffer ipiv,
                   IComplexNumber work, DataBuffer lwork,
                   DataBuffer info );
    void chetrint( String uplo, DataBuffer n, DataBuffer nrhs,
                   IComplexNumber a, DataBuffer lda,
                   DataBuffer ipiv, IComplexNumber b,
                   DataBuffer ldb, DataBuffer info );
    void zhetrint( String uplo, DataBuffer n, DataBuffer nrhs,
                   IComplexNumber a, DataBuffer lda,
                   DataBuffer ipiv, IComplexNumber b,
                   DataBuffer ldb, DataBuffer info );

    void csyr( String uplo, DataBuffer n, IComplexNumber alpha,
               IComplexNumber x, DataBuffer incx,
               IComplexNumber a, DataBuffer lda );
    void zsyr( String uplo, DataBuffer n, IComplexNumber alpha,
               IComplexNumber x, DataBuffer incx,
               IComplexNumber a, DataBuffer lda );


}