/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_badlogic_gdx_graphics_g2d_Gdx2DPixmap */

#ifndef _Included_com_badlogic_gdx_graphics_g2d_Gdx2DPixmap
#define _Included_com_badlogic_gdx_graphics_g2d_Gdx2DPixmap
#ifdef __cplusplus
extern "C" {
#endif
#undef com_badlogic_gdx_graphics_g2d_Gdx2DPixmap_GDX2D_FORMAT_ALPHA
#define com_badlogic_gdx_graphics_g2d_Gdx2DPixmap_GDX2D_FORMAT_ALPHA 1L
#undef com_badlogic_gdx_graphics_g2d_Gdx2DPixmap_GDX2D_FORMAT_LUMINANCE_ALPHA
#define com_badlogic_gdx_graphics_g2d_Gdx2DPixmap_GDX2D_FORMAT_LUMINANCE_ALPHA 2L
#undef com_badlogic_gdx_graphics_g2d_Gdx2DPixmap_GDX2D_FORMAT_RGB888
#define com_badlogic_gdx_graphics_g2d_Gdx2DPixmap_GDX2D_FORMAT_RGB888 3L
#undef com_badlogic_gdx_graphics_g2d_Gdx2DPixmap_GDX2D_FORMAT_RGBA8888
#define com_badlogic_gdx_graphics_g2d_Gdx2DPixmap_GDX2D_FORMAT_RGBA8888 4L
#undef com_badlogic_gdx_graphics_g2d_Gdx2DPixmap_GDX2D_FORMAT_RGB565
#define com_badlogic_gdx_graphics_g2d_Gdx2DPixmap_GDX2D_FORMAT_RGB565 5L
#undef com_badlogic_gdx_graphics_g2d_Gdx2DPixmap_GDX2D_FORMAT_RGBA4444
#define com_badlogic_gdx_graphics_g2d_Gdx2DPixmap_GDX2D_FORMAT_RGBA4444 6L
#undef com_badlogic_gdx_graphics_g2d_Gdx2DPixmap_GDX2D_SCALE_NEAREST
#define com_badlogic_gdx_graphics_g2d_Gdx2DPixmap_GDX2D_SCALE_NEAREST 0L
#undef com_badlogic_gdx_graphics_g2d_Gdx2DPixmap_GDX2D_SCALE_LINEAR
#define com_badlogic_gdx_graphics_g2d_Gdx2DPixmap_GDX2D_SCALE_LINEAR 1L
#undef com_badlogic_gdx_graphics_g2d_Gdx2DPixmap_GDX2D_BLEND_NONE
#define com_badlogic_gdx_graphics_g2d_Gdx2DPixmap_GDX2D_BLEND_NONE 0L
#undef com_badlogic_gdx_graphics_g2d_Gdx2DPixmap_GDX2D_BLEND_SRC_OVER
#define com_badlogic_gdx_graphics_g2d_Gdx2DPixmap_GDX2D_BLEND_SRC_OVER 1L
/*
 * Class:     com_badlogic_gdx_graphics_g2d_Gdx2DPixmap
 * Method:    load
 * Signature: ([J[BIII)Ljava/nio/ByteBuffer;
 */
JNIEXPORT jobject JNICALL Java_com_badlogic_gdx_graphics_g2d_Gdx2DPixmap_load
  (JNIEnv *, jclass, jlongArray, jbyteArray, jint, jint, jint);

/*
 * Class:     com_badlogic_gdx_graphics_g2d_Gdx2DPixmap
 * Method:    newPixmap
 * Signature: ([JIII)Ljava/nio/ByteBuffer;
 */
JNIEXPORT jobject JNICALL Java_com_badlogic_gdx_graphics_g2d_Gdx2DPixmap_newPixmap
  (JNIEnv *, jclass, jlongArray, jint, jint, jint);

/*
 * Class:     com_badlogic_gdx_graphics_g2d_Gdx2DPixmap
 * Method:    free
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_com_badlogic_gdx_graphics_g2d_Gdx2DPixmap_free
  (JNIEnv *, jclass, jlong);

/*
 * Class:     com_badlogic_gdx_graphics_g2d_Gdx2DPixmap
 * Method:    clear
 * Signature: (JI)V
 */
JNIEXPORT void JNICALL Java_com_badlogic_gdx_graphics_g2d_Gdx2DPixmap_clear
  (JNIEnv *, jclass, jlong, jint);

/*
 * Class:     com_badlogic_gdx_graphics_g2d_Gdx2DPixmap
 * Method:    setPixel
 * Signature: (JIII)V
 */
JNIEXPORT void JNICALL Java_com_badlogic_gdx_graphics_g2d_Gdx2DPixmap_setPixel
  (JNIEnv *, jclass, jlong, jint, jint, jint);

/*
 * Class:     com_badlogic_gdx_graphics_g2d_Gdx2DPixmap
 * Method:    getPixel
 * Signature: (JII)I
 */
JNIEXPORT jint JNICALL Java_com_badlogic_gdx_graphics_g2d_Gdx2DPixmap_getPixel
  (JNIEnv *, jclass, jlong, jint, jint);

/*
 * Class:     com_badlogic_gdx_graphics_g2d_Gdx2DPixmap
 * Method:    drawLine
 * Signature: (JIIIII)V
 */
JNIEXPORT void JNICALL Java_com_badlogic_gdx_graphics_g2d_Gdx2DPixmap_drawLine
  (JNIEnv *, jclass, jlong, jint, jint, jint, jint, jint);

/*
 * Class:     com_badlogic_gdx_graphics_g2d_Gdx2DPixmap
 * Method:    drawRect
 * Signature: (JIIIII)V
 */
JNIEXPORT void JNICALL Java_com_badlogic_gdx_graphics_g2d_Gdx2DPixmap_drawRect
  (JNIEnv *, jclass, jlong, jint, jint, jint, jint, jint);

/*
 * Class:     com_badlogic_gdx_graphics_g2d_Gdx2DPixmap
 * Method:    drawCircle
 * Signature: (JIIII)V
 */
JNIEXPORT void JNICALL Java_com_badlogic_gdx_graphics_g2d_Gdx2DPixmap_drawCircle
  (JNIEnv *, jclass, jlong, jint, jint, jint, jint);

/*
 * Class:     com_badlogic_gdx_graphics_g2d_Gdx2DPixmap
 * Method:    fillRect
 * Signature: (JIIIII)V
 */
JNIEXPORT void JNICALL Java_com_badlogic_gdx_graphics_g2d_Gdx2DPixmap_fillRect
  (JNIEnv *, jclass, jlong, jint, jint, jint, jint, jint);

/*
 * Class:     com_badlogic_gdx_graphics_g2d_Gdx2DPixmap
 * Method:    fillCircle
 * Signature: (JIIII)V
 */
JNIEXPORT void JNICALL Java_com_badlogic_gdx_graphics_g2d_Gdx2DPixmap_fillCircle
  (JNIEnv *, jclass, jlong, jint, jint, jint, jint);

/*
 * Class:     com_badlogic_gdx_graphics_g2d_Gdx2DPixmap
 * Method:    drawPixmap
 * Signature: (JJIIIIIIII)V
 */
JNIEXPORT void JNICALL Java_com_badlogic_gdx_graphics_g2d_Gdx2DPixmap_drawPixmap
  (JNIEnv *, jclass, jlong, jlong, jint, jint, jint, jint, jint, jint, jint, jint);

/*
 * Class:     com_badlogic_gdx_graphics_g2d_Gdx2DPixmap
 * Method:    setBlend
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_com_badlogic_gdx_graphics_g2d_Gdx2DPixmap_setBlend
  (JNIEnv *, jclass, jint);

/*
 * Class:     com_badlogic_gdx_graphics_g2d_Gdx2DPixmap
 * Method:    setScale
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_com_badlogic_gdx_graphics_g2d_Gdx2DPixmap_setScale
  (JNIEnv *, jclass, jint);

/*
 * Class:     com_badlogic_gdx_graphics_g2d_Gdx2DPixmap
 * Method:    getFailureReason
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_badlogic_gdx_graphics_g2d_Gdx2DPixmap_getFailureReason
  (JNIEnv *, jclass);

#ifdef __cplusplus
}
#endif
#endif
