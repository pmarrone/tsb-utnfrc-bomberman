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

public class btConvexHullComputer {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btConvexHullComputer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btConvexHullComputer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btConvexHullComputer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setVertices(SWIGTYPE_p_btAlignedObjectArrayT_btVector3_t value) {
    gdxBulletJNI.btConvexHullComputer_vertices_set(swigCPtr, this, SWIGTYPE_p_btAlignedObjectArrayT_btVector3_t.getCPtr(value));
  }

  public SWIGTYPE_p_btAlignedObjectArrayT_btVector3_t getVertices() {
    long cPtr = gdxBulletJNI.btConvexHullComputer_vertices_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_btAlignedObjectArrayT_btVector3_t(cPtr, false);
  }

  public void setEdges(SWIGTYPE_p_btAlignedObjectArrayT_btConvexHullComputer__Edge_t value) {
    gdxBulletJNI.btConvexHullComputer_edges_set(swigCPtr, this, SWIGTYPE_p_btAlignedObjectArrayT_btConvexHullComputer__Edge_t.getCPtr(value));
  }

  public SWIGTYPE_p_btAlignedObjectArrayT_btConvexHullComputer__Edge_t getEdges() {
    long cPtr = gdxBulletJNI.btConvexHullComputer_edges_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_btAlignedObjectArrayT_btConvexHullComputer__Edge_t(cPtr, false);
  }

  public void setFaces(SWIGTYPE_p_btAlignedObjectArrayT_int_t value) {
    gdxBulletJNI.btConvexHullComputer_faces_set(swigCPtr, this, SWIGTYPE_p_btAlignedObjectArrayT_int_t.getCPtr(value));
  }

  public SWIGTYPE_p_btAlignedObjectArrayT_int_t getFaces() {
    long cPtr = gdxBulletJNI.btConvexHullComputer_faces_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_btAlignedObjectArrayT_int_t(cPtr, false);
  }

  public float compute(java.nio.FloatBuffer coords, int stride, int count, float shrink, float shrinkClamp) {
    assert coords.isDirect() : "Buffer must be allocated direct.";
    {
      return gdxBulletJNI.btConvexHullComputer_compute__SWIG_0(swigCPtr, this, coords, stride, count, shrink, shrinkClamp);
    }
  }

  public float compute(java.nio.DoubleBuffer coords, int stride, int count, float shrink, float shrinkClamp) {
    assert coords.isDirect() : "Buffer must be allocated direct.";
    {
      return gdxBulletJNI.btConvexHullComputer_compute__SWIG_1(swigCPtr, this, coords, stride, count, shrink, shrinkClamp);
    }
  }

  public btConvexHullComputer() {
    this(gdxBulletJNI.new_btConvexHullComputer(), true);
  }

}
