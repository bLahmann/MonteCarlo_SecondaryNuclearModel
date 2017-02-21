/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package cStopPow;

public class StopPow_Mehlhorn extends StopPow_PartialIoniz {
  private long swigCPtr;

  protected StopPow_Mehlhorn(long cPtr, boolean cMemoryOwn) {
    super(cStopPowJNI.StopPow_Mehlhorn_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(StopPow_Mehlhorn obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        cStopPowJNI.delete_StopPow_Mehlhorn(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public StopPow_Mehlhorn(double mt, double Zt, DoubleVector mf, DoubleVector Zf, DoubleVector Tf, DoubleVector nf, DoubleVector Zbar, double Te) throws java.lang.IllegalArgumentException {
    this(cStopPowJNI.new_StopPow_Mehlhorn__SWIG_0(mt, Zt, DoubleVector.getCPtr(mf), mf, DoubleVector.getCPtr(Zf), Zf, DoubleVector.getCPtr(Tf), Tf, DoubleVector.getCPtr(nf), nf, DoubleVector.getCPtr(Zbar), Zbar, Te), true);
  }

  public StopPow_Mehlhorn(double mt, double Zt, SWIGTYPE_p_std__vectorT_std__arrayT_double_5_t_t field, double Te) throws java.lang.IllegalArgumentException {
    this(cStopPowJNI.new_StopPow_Mehlhorn__SWIG_1(mt, Zt, SWIGTYPE_p_std__vectorT_std__arrayT_double_5_t_t.getCPtr(field), Te), true);
  }

  public double dEdx_MeV_um(double E) throws java.lang.IllegalArgumentException {
    return cStopPowJNI.StopPow_Mehlhorn_dEdx_MeV_um(swigCPtr, this, E);
  }

  public double dEdx_MeV_mgcm2(double E) throws java.lang.IllegalArgumentException {
    return cStopPowJNI.StopPow_Mehlhorn_dEdx_MeV_mgcm2(swigCPtr, this, E);
  }

  public double get_Emin() {
    return cStopPowJNI.StopPow_Mehlhorn_get_Emin(swigCPtr, this);
  }

  public double get_Emax() {
    return cStopPowJNI.StopPow_Mehlhorn_get_Emax(swigCPtr, this);
  }

  public double Ibar(double E, int index) {
    return cStopPowJNI.StopPow_Mehlhorn_Ibar(swigCPtr, this, E, index);
  }

  public void set_Ibar(DoubleVector Ibar) throws java.lang.IllegalArgumentException {
    cStopPowJNI.StopPow_Mehlhorn_set_Ibar(swigCPtr, this, DoubleVector.getCPtr(Ibar), Ibar);
  }

}
