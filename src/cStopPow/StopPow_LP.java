/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package cStopPow;

public class StopPow_LP extends StopPow_Plasma {
  private long swigCPtr;

  protected StopPow_LP(long cPtr, boolean cMemoryOwn) {
    super(cStopPowJNI.StopPow_LP_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(StopPow_LP obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        cStopPowJNI.delete_StopPow_LP(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public StopPow_LP(double mt, double Zt, DoubleVector mf, DoubleVector Zf, DoubleVector Tf, DoubleVector nf) throws java.lang.IllegalArgumentException {
    this(cStopPowJNI.new_StopPow_LP__SWIG_0(mt, Zt, DoubleVector.getCPtr(mf), mf, DoubleVector.getCPtr(Zf), Zf, DoubleVector.getCPtr(Tf), Tf, DoubleVector.getCPtr(nf), nf), true);
  }

  public StopPow_LP(double mt, double Zt, SWIGTYPE_p_std__vectorT_std__arrayT_double_4_t_t field) throws java.lang.IllegalArgumentException {
    this(cStopPowJNI.new_StopPow_LP__SWIG_1(mt, Zt, SWIGTYPE_p_std__vectorT_std__arrayT_double_4_t_t.getCPtr(field)), true);
  }

  public StopPow_LP(double mt, double Zt, DoubleVector mf, DoubleVector Zf, DoubleVector Tf, DoubleVector nf, double Te) throws java.lang.IllegalArgumentException {
    this(cStopPowJNI.new_StopPow_LP__SWIG_2(mt, Zt, DoubleVector.getCPtr(mf), mf, DoubleVector.getCPtr(Zf), Zf, DoubleVector.getCPtr(Tf), Tf, DoubleVector.getCPtr(nf), nf, Te), true);
  }

  public StopPow_LP(double mt, double Zt, SWIGTYPE_p_std__vectorT_std__arrayT_double_4_t_t field, double Te) throws java.lang.IllegalArgumentException {
    this(cStopPowJNI.new_StopPow_LP__SWIG_3(mt, Zt, SWIGTYPE_p_std__vectorT_std__arrayT_double_4_t_t.getCPtr(field), Te), true);
  }

  public double dEdx_MeV_um(double E) throws java.lang.IllegalArgumentException {
    return cStopPowJNI.StopPow_LP_dEdx_MeV_um(swigCPtr, this, E);
  }

  public double dEdx_MeV_mgcm2(double E) throws java.lang.IllegalArgumentException {
    return cStopPowJNI.StopPow_LP_dEdx_MeV_mgcm2(swigCPtr, this, E);
  }

  public double dEdx_field(double E, int i) throws java.lang.IllegalArgumentException {
    return cStopPowJNI.StopPow_LP_dEdx_field(swigCPtr, this, E, i);
  }

  public void set_collective(boolean set) {
    cStopPowJNI.StopPow_LP_set_collective(swigCPtr, this, set);
  }

  public void set_quantum(boolean set) {
    cStopPowJNI.StopPow_LP_set_quantum(swigCPtr, this, set);
  }

  public void set_xtf_factor(double a) {
    cStopPowJNI.StopPow_LP_set_xtf_factor(swigCPtr, this, a);
  }

  public void set_xtf_collective_factor(double a) {
    cStopPowJNI.StopPow_LP_set_xtf_collective_factor(swigCPtr, this, a);
  }

  public void set_u_factor(double a) {
    cStopPowJNI.StopPow_LP_set_u_factor(swigCPtr, this, a);
  }

  public void use_published_collective(boolean p) {
    cStopPowJNI.StopPow_LP_use_published_collective(swigCPtr, this, p);
  }

  public void use_classical_LogL(boolean p) {
    cStopPowJNI.StopPow_LP_use_classical_LogL(swigCPtr, this, p);
  }

  public double get_Emin() {
    return cStopPowJNI.StopPow_LP_get_Emin(swigCPtr, this);
  }

  public double get_Emax() {
    return cStopPowJNI.StopPow_LP_get_Emax(swigCPtr, this);
  }

}
