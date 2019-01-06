package org.zx.spring.context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public  class ApplicationContextHelper implements ApplicationContextAware {



    private static ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        applicationContext = context;
    }

    /**
     * 从静态变量applicationContext中得到Bean, 自动转型为所赋值对象的类型.
     */
    public static <T> T popBean(Class<T> clazz){
        if(applicationContext == null){
            return null;
        }
        return applicationContext.getBean(clazz);
    }
    /**
     * 从静态变量applicationContext中得到Bean, 自动转型为所赋值对象的类型.
     */
    public static<T> T popBean(String name,Class<T> clazz){
        if(applicationContext == null){
            return null;
        }
        return applicationContext.getBean(name,clazz);
    }

    public  static void  getNames(){
        String [] names = applicationContext.getBeanDefinitionNames();

        for (String name : names
             ) {
            System.out.println(name);
        }
    }
}
