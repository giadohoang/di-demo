package com.springframework.didemo;

import com.springframework.didemo.controllers.ConstructorInjectedController;
import com.springframework.didemo.controllers.MyController;
import com.springframework.didemo.controllers.PropertyInjectedController;
import com.springframework.didemo.controllers.GetterInjectedController;
import com.springframework.didemo.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
      ApplicationContext ctx =  SpringApplication.run(DiDemoApplication.class, args);
        MyController controller = (MyController) ctx.getBean("myController");

        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

        System.out.println(fakeDataSource.getUser());
    }

}
