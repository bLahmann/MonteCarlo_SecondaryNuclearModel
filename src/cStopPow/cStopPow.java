/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package cStopPow;

public class cStopPow {
  public static SWIGTYPE_p_int new_intp() {
    long cPtr = cStopPowJNI.new_intp();
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public static SWIGTYPE_p_int copy_intp(int value) {
    long cPtr = cStopPowJNI.copy_intp(value);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public static void delete_intp(SWIGTYPE_p_int obj) {
    cStopPowJNI.delete_intp(SWIGTYPE_p_int.getCPtr(obj));
  }

  public static void intp_assign(SWIGTYPE_p_int obj, int value) {
    cStopPowJNI.intp_assign(SWIGTYPE_p_int.getCPtr(obj), value);
  }

  public static int intp_value(SWIGTYPE_p_int obj) {
    return cStopPowJNI.intp_value(SWIGTYPE_p_int.getCPtr(obj));
  }

  public static SWIGTYPE_p_float new_floatp() {
    long cPtr = cStopPowJNI.new_floatp();
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  public static SWIGTYPE_p_float copy_floatp(float value) {
    long cPtr = cStopPowJNI.copy_floatp(value);
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  public static void delete_floatp(SWIGTYPE_p_float obj) {
    cStopPowJNI.delete_floatp(SWIGTYPE_p_float.getCPtr(obj));
  }

  public static void floatp_assign(SWIGTYPE_p_float obj, float value) {
    cStopPowJNI.floatp_assign(SWIGTYPE_p_float.getCPtr(obj), value);
  }

  public static float floatp_value(SWIGTYPE_p_float obj) {
    return cStopPowJNI.floatp_value(SWIGTYPE_p_float.getCPtr(obj));
  }

  public static double getPLOT_DEFAULT_NUM_POINTS() {
    return cStopPowJNI.PLOT_DEFAULT_NUM_POINTS_get();
  }

  public static boolean get_dEdx_vs_E(StopPow model, DoubleVector2D data) {
    return cStopPowJNI.get_dEdx_vs_E__SWIG_0(StopPow.getCPtr(model), model, DoubleVector2D.getCPtr(data), data);
  }

  public static boolean get_dEdx_vs_E(StopPow model, int num_points, DoubleVector2D data) {
    return cStopPowJNI.get_dEdx_vs_E__SWIG_1(StopPow.getCPtr(model), model, num_points, DoubleVector2D.getCPtr(data), data);
  }

  public static boolean get_dEdx_vs_E(StopPow model, double Emin, double Emax, int num_points, DoubleVector2D data) {
    return cStopPowJNI.get_dEdx_vs_E__SWIG_2(StopPow.getCPtr(model), model, Emin, Emax, num_points, DoubleVector2D.getCPtr(data), data);
  }

  public static boolean get_Range_vs_E(StopPow model, DoubleVector2D data) {
    return cStopPowJNI.get_Range_vs_E__SWIG_0(StopPow.getCPtr(model), model, DoubleVector2D.getCPtr(data), data);
  }

  public static boolean get_Range_vs_E(StopPow model, int num_points, DoubleVector2D data) {
    return cStopPowJNI.get_Range_vs_E__SWIG_1(StopPow.getCPtr(model), model, num_points, DoubleVector2D.getCPtr(data), data);
  }

  public static boolean get_Range_vs_E(StopPow model, double Emin, double Emax, int num_points, DoubleVector2D data) {
    return cStopPowJNI.get_Range_vs_E__SWIG_2(StopPow.getCPtr(model), model, Emin, Emax, num_points, DoubleVector2D.getCPtr(data), data);
  }

  public static boolean get_Eout_vs_Ein(StopPow model, double Thickness, DoubleVector2D data) {
    return cStopPowJNI.get_Eout_vs_Ein__SWIG_0(StopPow.getCPtr(model), model, Thickness, DoubleVector2D.getCPtr(data), data);
  }

  public static boolean get_Eout_vs_Ein(StopPow model, int num_points, double Thickness, DoubleVector2D data) {
    return cStopPowJNI.get_Eout_vs_Ein__SWIG_1(StopPow.getCPtr(model), model, num_points, Thickness, DoubleVector2D.getCPtr(data), data);
  }

  public static boolean get_Eout_vs_Ein(StopPow model, double Emin, double Emax, int num_points, double Thickness, DoubleVector2D data) {
    return cStopPowJNI.get_Eout_vs_Ein__SWIG_2(StopPow.getCPtr(model), model, Emin, Emax, num_points, Thickness, DoubleVector2D.getCPtr(data), data);
  }

  public static boolean get_Eout_vs_Thickness(StopPow model, double Ein, DoubleVector2D data) {
    return cStopPowJNI.get_Eout_vs_Thickness__SWIG_0(StopPow.getCPtr(model), model, Ein, DoubleVector2D.getCPtr(data), data);
  }

  public static boolean get_Eout_vs_Thickness(StopPow model, int num_points, double Ein, DoubleVector2D data) {
    return cStopPowJNI.get_Eout_vs_Thickness__SWIG_1(StopPow.getCPtr(model), model, num_points, Ein, DoubleVector2D.getCPtr(data), data);
  }

  public static boolean get_Eout_vs_Thickness(StopPow model, double Tmin, double Tmax, int num_points, double Ein, DoubleVector2D data) {
    return cStopPowJNI.get_Eout_vs_Thickness__SWIG_2(StopPow.getCPtr(model), model, Tmin, Tmax, num_points, Ein, DoubleVector2D.getCPtr(data), data);
  }

  public static boolean get_Ein_vs_Eout(StopPow model, double Thickness, DoubleVector2D data) {
    return cStopPowJNI.get_Ein_vs_Eout__SWIG_0(StopPow.getCPtr(model), model, Thickness, DoubleVector2D.getCPtr(data), data);
  }

  public static boolean get_Ein_vs_Eout(StopPow model, int num_points, double Thickness, DoubleVector2D data) {
    return cStopPowJNI.get_Ein_vs_Eout__SWIG_1(StopPow.getCPtr(model), model, num_points, Thickness, DoubleVector2D.getCPtr(data), data);
  }

  public static boolean get_Ein_vs_Eout(StopPow model, double Emin, double Emax, int num_points, double Thickness, DoubleVector2D data) {
    return cStopPowJNI.get_Ein_vs_Eout__SWIG_2(StopPow.getCPtr(model), model, Emin, Emax, num_points, Thickness, DoubleVector2D.getCPtr(data), data);
  }

  public static boolean get_Ein_vs_Thickness(StopPow model, double Eout, DoubleVector2D data) {
    return cStopPowJNI.get_Ein_vs_Thickness__SWIG_0(StopPow.getCPtr(model), model, Eout, DoubleVector2D.getCPtr(data), data);
  }

  public static boolean get_Ein_vs_Thickness(StopPow model, int num_points, double Eout, DoubleVector2D data) {
    return cStopPowJNI.get_Ein_vs_Thickness__SWIG_1(StopPow.getCPtr(model), model, num_points, Eout, DoubleVector2D.getCPtr(data), data);
  }

  public static boolean get_Ein_vs_Thickness(StopPow model, double Tmin, double Tmax, int num_points, double Eout, DoubleVector2D data) {
    return cStopPowJNI.get_Ein_vs_Thickness__SWIG_2(StopPow.getCPtr(model), model, Tmin, Tmax, num_points, Eout, DoubleVector2D.getCPtr(data), data);
  }

  public static boolean get_Thickness_vs_Eout(StopPow model, double Ein, DoubleVector2D data) {
    return cStopPowJNI.get_Thickness_vs_Eout__SWIG_0(StopPow.getCPtr(model), model, Ein, DoubleVector2D.getCPtr(data), data);
  }

  public static boolean get_Thickness_vs_Eout(StopPow model, int num_points, double Ein, DoubleVector2D data) {
    return cStopPowJNI.get_Thickness_vs_Eout__SWIG_1(StopPow.getCPtr(model), model, num_points, Ein, DoubleVector2D.getCPtr(data), data);
  }

  public static boolean get_Thickness_vs_Eout(StopPow model, double Emin, double Emax, int num_points, double Ein, DoubleVector2D data) {
    return cStopPowJNI.get_Thickness_vs_Eout__SWIG_2(StopPow.getCPtr(model), model, Emin, Emax, num_points, Ein, DoubleVector2D.getCPtr(data), data);
  }

  public static boolean get_Thickness_vs_Ein(StopPow model, double Eout, DoubleVector2D data) {
    return cStopPowJNI.get_Thickness_vs_Ein__SWIG_0(StopPow.getCPtr(model), model, Eout, DoubleVector2D.getCPtr(data), data);
  }

  public static boolean get_Thickness_vs_Ein(StopPow model, int num_points, double Eout, DoubleVector2D data) {
    return cStopPowJNI.get_Thickness_vs_Ein__SWIG_1(StopPow.getCPtr(model), model, num_points, Eout, DoubleVector2D.getCPtr(data), data);
  }

  public static boolean get_Thickness_vs_Ein(StopPow model, double Emin, double Emax, int num_points, double Eout, DoubleVector2D data) {
    return cStopPowJNI.get_Thickness_vs_Ein__SWIG_2(StopPow.getCPtr(model), model, Emin, Emax, num_points, Eout, DoubleVector2D.getCPtr(data), data);
  }

  public static void shift(StopPow model, double thickness, DoubleVector data_E, DoubleVector data_Y) throws java.lang.IllegalArgumentException {
    cStopPowJNI.shift__SWIG_0(StopPow.getCPtr(model), model, thickness, DoubleVector.getCPtr(data_E), data_E, DoubleVector.getCPtr(data_Y), data_Y);
  }

  public static void shift(StopPow model, double thickness, DoubleVector data_E, DoubleVector data_Y, DoubleVector data_err) throws java.lang.IllegalArgumentException {
    cStopPowJNI.shift__SWIG_1(StopPow.getCPtr(model), model, thickness, DoubleVector.getCPtr(data_E), data_E, DoubleVector.getCPtr(data_Y), data_Y, DoubleVector.getCPtr(data_err), data_err);
  }

  public static boolean fit_Gaussian(DoubleVector data_x, DoubleVector data_y, DoubleVector data_std, DoubleVector fit, DoubleVector fit_unc, SWIGTYPE_p_double chi2_dof, boolean verbose) {
    return cStopPowJNI.fit_Gaussian(DoubleVector.getCPtr(data_x), data_x, DoubleVector.getCPtr(data_y), data_y, DoubleVector.getCPtr(data_std), data_std, DoubleVector.getCPtr(fit), fit, DoubleVector.getCPtr(fit_unc), fit_unc, SWIGTYPE_p_double.getCPtr(chi2_dof), verbose);
  }

  public static boolean fit_rhoR(DoubleVector data_x, DoubleVector data_y, DoubleVector data_std, double dE, DoubleVector fit, DoubleVector fit_unc, SWIGTYPE_p_double chi2_dof, StopPow s, double E0, double E0_unc, SWIGTYPE_p_double rhoR, SWIGTYPE_p_double rhoR_unc, boolean verbose) {
    return cStopPowJNI.fit_rhoR(DoubleVector.getCPtr(data_x), data_x, DoubleVector.getCPtr(data_y), data_y, DoubleVector.getCPtr(data_std), data_std, dE, DoubleVector.getCPtr(fit), fit, DoubleVector.getCPtr(fit_unc), fit_unc, SWIGTYPE_p_double.getCPtr(chi2_dof), StopPow.getCPtr(s), s, E0, E0_unc, SWIGTYPE_p_double.getCPtr(rhoR), SWIGTYPE_p_double.getCPtr(rhoR_unc), verbose);
  }

  public static boolean forward_fit_rhoR(DoubleVector data_x, DoubleVector data_y, DoubleVector data_std, double dE, SWIGTYPE_p_double chi2_dof, StopPow s, double E0, double E0_unc, DoubleVector fit, DoubleVector fit_unc, boolean verbose) {
    return cStopPowJNI.forward_fit_rhoR(DoubleVector.getCPtr(data_x), data_x, DoubleVector.getCPtr(data_y), data_y, DoubleVector.getCPtr(data_std), data_std, dE, SWIGTYPE_p_double.getCPtr(chi2_dof), StopPow.getCPtr(s), s, E0, E0_unc, DoubleVector.getCPtr(fit), fit, DoubleVector.getCPtr(fit_unc), fit_unc, verbose);
  }

  public static boolean deconvolve_fit_rhoR(DoubleVector data_x, DoubleVector data_y, DoubleVector data_std, double dE, SWIGTYPE_p_double chi2_dof, StopPow s, double E0, double E0_unc, DoubleVector fit, DoubleVector fit_unc, boolean verbose) {
    return cStopPowJNI.deconvolve_fit_rhoR(DoubleVector.getCPtr(data_x), data_x, DoubleVector.getCPtr(data_y), data_y, DoubleVector.getCPtr(data_std), data_std, dE, SWIGTYPE_p_double.getCPtr(chi2_dof), StopPow.getCPtr(s), s, E0, E0_unc, DoubleVector.getCPtr(fit), fit, DoubleVector.getCPtr(fit_unc), fit_unc, verbose);
  }

  public static boolean forward_fit_dEdx(DoubleVector data_x, DoubleVector data_y, DoubleVector data_std, double dE, double E0, double E0_unc, double sigma, double sigma_unc, double rhoR, double rhoR_unc, StopPow_Fit s, SWIGTYPE_p_double chi2_dof, DoubleVector fit, DoubleVector fit_unc, boolean verbose) {
    return cStopPowJNI.forward_fit_dEdx(DoubleVector.getCPtr(data_x), data_x, DoubleVector.getCPtr(data_y), data_y, DoubleVector.getCPtr(data_std), data_std, dE, E0, E0_unc, sigma, sigma_unc, rhoR, rhoR_unc, StopPow_Fit.getCPtr(s), s, SWIGTYPE_p_double.getCPtr(chi2_dof), DoubleVector.getCPtr(fit), fit, DoubleVector.getCPtr(fit_unc), fit_unc, verbose);
  }

}
