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

public class btAxisSweep3InternalShort extends btBroadphaseInterface {
  private long swigCPtr;

  protected btAxisSweep3InternalShort(long cPtr, boolean cMemoryOwn) {
    super(gdxBulletJNI.btAxisSweep3InternalShort_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(btAxisSweep3InternalShort obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btAxisSweep3InternalShort(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public btAxisSweep3InternalShort(Vector3 worldAabbMin, Vector3 worldAabbMax, int handleMask, int handleSentinel, int maxHandles, btOverlappingPairCache pairCache, boolean disableRaycastAccelerator) {
    this(gdxBulletJNI.new_btAxisSweep3InternalShort__SWIG_0(worldAabbMin, worldAabbMax, handleMask, handleSentinel, maxHandles, btOverlappingPairCache.getCPtr(pairCache), pairCache, disableRaycastAccelerator), true);
  }

  public btAxisSweep3InternalShort(Vector3 worldAabbMin, Vector3 worldAabbMax, int handleMask, int handleSentinel, int maxHandles, btOverlappingPairCache pairCache) {
    this(gdxBulletJNI.new_btAxisSweep3InternalShort__SWIG_1(worldAabbMin, worldAabbMax, handleMask, handleSentinel, maxHandles, btOverlappingPairCache.getCPtr(pairCache), pairCache), true);
  }

  public btAxisSweep3InternalShort(Vector3 worldAabbMin, Vector3 worldAabbMax, int handleMask, int handleSentinel, int maxHandles) {
    this(gdxBulletJNI.new_btAxisSweep3InternalShort__SWIG_2(worldAabbMin, worldAabbMax, handleMask, handleSentinel, maxHandles), true);
  }

  public btAxisSweep3InternalShort(Vector3 worldAabbMin, Vector3 worldAabbMax, int handleMask, int handleSentinel) {
    this(gdxBulletJNI.new_btAxisSweep3InternalShort__SWIG_3(worldAabbMin, worldAabbMax, handleMask, handleSentinel), true);
  }

  public int getNumHandles() {
    return gdxBulletJNI.btAxisSweep3InternalShort_getNumHandles(swigCPtr, this);
  }

  public int addHandle(Vector3 aabbMin, Vector3 aabbMax, SWIGTYPE_p_void pOwner, short collisionFilterGroup, short collisionFilterMask, btDispatcher dispatcher, SWIGTYPE_p_void multiSapProxy) {
    return gdxBulletJNI.btAxisSweep3InternalShort_addHandle(swigCPtr, this, aabbMin, aabbMax, SWIGTYPE_p_void.getCPtr(pOwner), collisionFilterGroup, collisionFilterMask, btDispatcher.getCPtr(dispatcher), dispatcher, SWIGTYPE_p_void.getCPtr(multiSapProxy));
  }

  public void removeHandle(int handle, btDispatcher dispatcher) {
    gdxBulletJNI.btAxisSweep3InternalShort_removeHandle(swigCPtr, this, handle, btDispatcher.getCPtr(dispatcher), dispatcher);
  }

  public void updateHandle(int handle, Vector3 aabbMin, Vector3 aabbMax, btDispatcher dispatcher) {
    gdxBulletJNI.btAxisSweep3InternalShort_updateHandle(swigCPtr, this, handle, aabbMin, aabbMax, btDispatcher.getCPtr(dispatcher), dispatcher);
  }

  public SWIGTYPE_p_btAxisSweep3InternalT_unsigned_short_t__Handle getHandle(int index) {
    long cPtr = gdxBulletJNI.btAxisSweep3InternalShort_getHandle(swigCPtr, this, index);
    return (cPtr == 0) ? null : new SWIGTYPE_p_btAxisSweep3InternalT_unsigned_short_t__Handle(cPtr, false);
  }

  public void rayTest(Vector3 rayFrom, Vector3 rayTo, btBroadphaseRayCallback rayCallback, Vector3 aabbMin, Vector3 aabbMax) {
    gdxBulletJNI.btAxisSweep3InternalShort_rayTest__SWIG_0(swigCPtr, this, rayFrom, rayTo, btBroadphaseRayCallback.getCPtr(rayCallback), rayCallback, aabbMin, aabbMax);
  }

  public void rayTest(Vector3 rayFrom, Vector3 rayTo, btBroadphaseRayCallback rayCallback, Vector3 aabbMin) {
    gdxBulletJNI.btAxisSweep3InternalShort_rayTest__SWIG_1(swigCPtr, this, rayFrom, rayTo, btBroadphaseRayCallback.getCPtr(rayCallback), rayCallback, aabbMin);
  }

  public void rayTest(Vector3 rayFrom, Vector3 rayTo, btBroadphaseRayCallback rayCallback) {
    gdxBulletJNI.btAxisSweep3InternalShort_rayTest__SWIG_2(swigCPtr, this, rayFrom, rayTo, btBroadphaseRayCallback.getCPtr(rayCallback), rayCallback);
  }

  public void quantize(java.nio.IntBuffer out, Vector3 point, int isMax) {
    assert out.isDirect() : "Buffer must be allocated direct.";
    {
      gdxBulletJNI.btAxisSweep3InternalShort_quantize(swigCPtr, this, out, point, isMax);
    }
  }

  public void unQuantize(btBroadphaseProxy proxy, Vector3 aabbMin, Vector3 aabbMax) {
    gdxBulletJNI.btAxisSweep3InternalShort_unQuantize(swigCPtr, this, btBroadphaseProxy.getCPtr(proxy), proxy, aabbMin, aabbMax);
  }

  public boolean testAabbOverlap(btBroadphaseProxy proxy0, btBroadphaseProxy proxy1) {
    return gdxBulletJNI.btAxisSweep3InternalShort_testAabbOverlap(swigCPtr, this, btBroadphaseProxy.getCPtr(proxy0), proxy0, btBroadphaseProxy.getCPtr(proxy1), proxy1);
  }

  public btOverlappingPairCache getOverlappingPairCache() {
    long cPtr = gdxBulletJNI.btAxisSweep3InternalShort_getOverlappingPairCache__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new btOverlappingPairCache(cPtr, false);
  }

  public void setOverlappingPairUserCallback(btOverlappingPairCallback pairCallback) {
    gdxBulletJNI.btAxisSweep3InternalShort_setOverlappingPairUserCallback(swigCPtr, this, btOverlappingPairCallback.getCPtr(pairCallback), pairCallback);
  }

  public btOverlappingPairCallback getOverlappingPairUserCallback() {
    long cPtr = gdxBulletJNI.btAxisSweep3InternalShort_getOverlappingPairUserCallback(swigCPtr, this);
    return (cPtr == 0) ? null : new btOverlappingPairCallback(cPtr, false);
  }

}
