package com.test.annotation;

import lombok.extern.slf4j.Slf4j;


@TestAnnotation()
public class Test1 {
    public static void main(String[] args) {

        boolean hasAnnotation = Test1.class.isAnnotationPresent(TestAnnotation.class);

        if ( hasAnnotation ) {
            TestAnnotation testAnnotation = Test1.class.getAnnotation(TestAnnotation.class);
            System.out.println("id:"+testAnnotation.id());
            System.out.println("msg:"+testAnnotation.msg());
        }

    }
}
