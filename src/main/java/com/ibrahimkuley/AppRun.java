package com.ibrahimkuley;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by hikuley on 29.06.2016.
 */


@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = {"com.ibrahimkuley","io.swagger."})
public class AppRun {

    private static Log logger = LogFactory.getLog(AppRun.class);


    @Bean
    protected ServletContextListener listener() {
        return new ServletContextListener() {

            @Override
            public void contextInitialized(ServletContextEvent sce) {
                logger.info("ServletContext initialized");
            }

            @Override
            public void contextDestroyed(ServletContextEvent sce) {
                logger.info("ServletContext destroyed");
            }

        };
    }


    public static void main(String[] args) {
        SpringApplication.run(AppRun.class, args);
    }

}
