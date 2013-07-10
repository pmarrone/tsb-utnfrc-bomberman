/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btBroadphasePair {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btBroadphasePair(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btBroadphasePair obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btBroadphasePair(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public btBroadphasePair() {
    this(gdxBulletJNI.new_btBroadphasePair__SWIG_0(), true);
  }

  public btBroadphasePair(btBroadphasePair other) {
    this(gdxBulletJNI.new_btBroadphasePair__SWIG_1(btBroadphasePair.getCPtr(other), other), true);
  }

  public btBroadphasePair(btBroadphaseProxy proxy0, btBroadphaseProxy proxy1) {
    this(gdxBulletJNI.new_btBroadphasePair__SWIG_2(btBroadphaseProxy.getCPtr(proxy0), proxy0, btBroadphaseProxy.getCPtr(proxy1), proxy1), true);
  }

  public void setM_pProxy0(btBroadphaseProxy value) {
    gdxBulletJNI.btBroadphasePair_m_pProxy0_set(swigCPtr, this, btBroadphaseProxy.getCPtr(value), value);
  }

  public btBroadphaseProxy getM_pProxy0() {
    long cPtr = gdxBulletJNI.btBroadphasePair_m_pProxy0_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btBroadphaseProxy(cPtr, false);
  }

  public void setM_pProxy1(btBroadphaseProxy value) {
    gdxBulletJNI.btBroadphasePair_m_pProxy1_set(swigCPtr, this, btBroadphaseProxy.getCPtr(value), value);
  }

  public btBroadphaseProxy getM_pProxy1() {
    long cPtr = gdxBulletJNI.btBroadphasePair_m_pProxy1_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btBroadphaseProxy(cPtr, false);
  }

  public void setM_algorithm(btCollisionAlgorithm value) {
    gdxBulletJNI.btBroadphasePair_m_algorithm_set(swigCPtr, this, btCollisionAlgorithm.getCPtr(value), value);
  }

  public btCollisionAlgorithm getM_algorithm() {
    long cPtr = gdxBulletJNI.btBroadphasePair_m_algorithm_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btCollisionAlgorithm(cPtr, false);
  }

}
