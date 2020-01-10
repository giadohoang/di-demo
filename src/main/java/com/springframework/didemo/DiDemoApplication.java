package com.springframework.didemo;

import com.springframework.didemo.controllers.ConstructorInjectedController;
import com.springframework.didemo.controllers.MyController;
import com.springframework.didemo.controllers.PropertyInjectedController;
import com.springframework.didemo.controllers.GetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"services", "com.springframework.didemo"})
public class DiDemoApplication {

    public static void main(String[] args) {
      ApplicationContext ctx =  SpringApplication.run(DiDemoApplication.class, args);
        MyController controller = (MyController) ctx.getBean("myController");


        System.out.println( controller.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }

}
