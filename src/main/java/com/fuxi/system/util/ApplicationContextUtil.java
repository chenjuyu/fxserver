package com.fuxi.system.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 
 * @author
 * 
 */

public class ApplicationContextUtil implements ApplicationContextAware {

    private static ApplicationContext context;


    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.context = context;
    }

    public static ApplicationContext getContext() {
        return context;
    }
}
