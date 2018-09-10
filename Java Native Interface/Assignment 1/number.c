#include <stdio.h>
#include "Number.h"
#include <jni.h>
JNIEXPORT void JNICALL Java_Number_welcome
  (JNIEnv *env, jobject obj)
{
	printf("Hello in C\n");
}


JNIEXPORT jint JNICALL Java_Number_factorial
  (JNIEnv * env, jobject obj, jint n)
{
	int fact=1;
	while(n > 0)
	{
		fact=fact*n;
		n--;
	}
	return fact;
}