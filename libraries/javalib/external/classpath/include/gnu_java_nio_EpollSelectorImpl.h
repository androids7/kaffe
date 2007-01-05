/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class gnu_java_nio_EpollSelectorImpl */

#ifndef _Included_gnu_java_nio_EpollSelectorImpl
#define _Included_gnu_java_nio_EpollSelectorImpl
#ifdef __cplusplus
extern "C" {
#endif
#undef gnu_java_nio_EpollSelectorImpl_DEFAULT_EPOLL_SIZE
#define gnu_java_nio_EpollSelectorImpl_DEFAULT_EPOLL_SIZE 128L
#undef gnu_java_nio_EpollSelectorImpl_OP_ACCEPT
#define gnu_java_nio_EpollSelectorImpl_OP_ACCEPT 16L
#undef gnu_java_nio_EpollSelectorImpl_OP_CONNECT
#define gnu_java_nio_EpollSelectorImpl_OP_CONNECT 8L
#undef gnu_java_nio_EpollSelectorImpl_OP_READ
#define gnu_java_nio_EpollSelectorImpl_OP_READ 1L
#undef gnu_java_nio_EpollSelectorImpl_OP_WRITE
#define gnu_java_nio_EpollSelectorImpl_OP_WRITE 4L
/*
 * Class:     gnu_java_nio_EpollSelectorImpl
 * Method:    epoll_supported
 * Signature: ()Z
 */
JNIEXPORT jboolean JNICALL Java_gnu_java_nio_EpollSelectorImpl_epoll_1supported
  (JNIEnv *, jclass);

/*
 * Class:     gnu_java_nio_EpollSelectorImpl
 * Method:    sizeof_struct
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_gnu_java_nio_EpollSelectorImpl_sizeof_1struct
  (JNIEnv *, jclass);

/*
 * Class:     gnu_java_nio_EpollSelectorImpl
 * Method:    epoll_create
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_gnu_java_nio_EpollSelectorImpl_epoll_1create
  (JNIEnv *, jclass, jint);

/*
 * Class:     gnu_java_nio_EpollSelectorImpl
 * Method:    epoll_add
 * Signature: (III)V
 */
JNIEXPORT void JNICALL Java_gnu_java_nio_EpollSelectorImpl_epoll_1add
  (JNIEnv *, jclass, jint, jint, jint);

/*
 * Class:     gnu_java_nio_EpollSelectorImpl
 * Method:    epoll_modify
 * Signature: (III)V
 */
JNIEXPORT void JNICALL Java_gnu_java_nio_EpollSelectorImpl_epoll_1modify
  (JNIEnv *, jclass, jint, jint, jint);

/*
 * Class:     gnu_java_nio_EpollSelectorImpl
 * Method:    epoll_delete
 * Signature: (II)V
 */
JNIEXPORT void JNICALL Java_gnu_java_nio_EpollSelectorImpl_epoll_1delete
  (JNIEnv *, jclass, jint, jint);

/*
 * Class:     gnu_java_nio_EpollSelectorImpl
 * Method:    epoll_wait
 * Signature: (ILjava/nio/ByteBuffer;II)I
 */
JNIEXPORT jint JNICALL Java_gnu_java_nio_EpollSelectorImpl_epoll_1wait
  (JNIEnv *, jclass, jint, jobject, jint, jint);

/*
 * Class:     gnu_java_nio_EpollSelectorImpl
 * Method:    selected_fd
 * Signature: (Ljava/nio/ByteBuffer;)I
 */
JNIEXPORT jint JNICALL Java_gnu_java_nio_EpollSelectorImpl_selected_1fd
  (JNIEnv *, jclass, jobject);

/*
 * Class:     gnu_java_nio_EpollSelectorImpl
 * Method:    selected_ops
 * Signature: (Ljava/nio/ByteBuffer;)I
 */
JNIEXPORT jint JNICALL Java_gnu_java_nio_EpollSelectorImpl_selected_1ops
  (JNIEnv *, jclass, jobject);

#ifdef __cplusplus
}
#endif
#endif
