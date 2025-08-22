package com.sist.anno;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
// @MyAnno(value="",count=2) => 구분 하려면 하단에 선언 해놔야 한다
@Retention(RUNTIME)
@Target(METHOD)
public @interface MyAnno {
	public String value();
	int count() default 1;
}
