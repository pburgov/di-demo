package com.pburgov.didemo;

import com.pburgov.didemo.controllers.ConstructorInjectedController;
import com.pburgov.didemo.controllers.GetterInjectedController;
import com.pburgov.didemo.controllers.MyController;
import com.pburgov.didemo.controllers.PropertyInjectedController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main( String[] args ) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        MyController myController = (MyController) ctx.getBean("myController");

        System.out.println(myController.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

    }

}
