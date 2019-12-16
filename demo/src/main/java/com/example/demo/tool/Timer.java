package com.example.demo.tool;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author : rain
 * @date : 2018/8/9 7:24 AM
 *
 * 时间记录annotation
 * 标注需要记录时间消耗的方法
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Timer {
}