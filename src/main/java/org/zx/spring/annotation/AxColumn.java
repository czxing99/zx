package org.zx.spring.annotation;

import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AxColumn {
    String name () default "";
    long length () default 0;
    Class clazz() default Object.class;
    Class clazzMapper() default Object.class;
    String fk() default "";
    String msg() default "";
    String isNull() default  "";
}
