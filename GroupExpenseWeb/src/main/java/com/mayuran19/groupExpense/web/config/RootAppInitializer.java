package com.mayuran19.groupExpense.web.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by mayuran on 1/10/16.
 * This class will replace the web.xml.bk file. All the configurations in web.xml.bk can be configured
 * in this class as per servlet API 3.0
 */
public class RootAppInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        /*
        All the common configuration for the whole application will be loaded by the RootAppConfig
        class.
         */
        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        rootContext.register(RootAppConfig.class);
        servletContext.addListener(new ContextLoaderListener(rootContext));

        /*
        Add a DispatcherServlet for "/api" context
         */
        AnnotationConfigWebApplicationContext servicesContext = new AnnotationConfigWebApplicationContext();
        servicesContext.setParent(rootContext);
        servicesContext.register(APIServletConfig.class);
        ServletRegistration.Dynamic servicesDispatchServlet = servletContext.addServlet("services", new DispatcherServlet(servicesContext));
        servicesDispatchServlet.setLoadOnStartup(1);
        servicesDispatchServlet.addMapping("/api/*");
    }
}
