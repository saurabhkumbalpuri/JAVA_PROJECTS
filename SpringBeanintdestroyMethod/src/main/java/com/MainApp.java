package com;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class MainApp {
   public static void main(String[] args)
   {
      AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
 
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.getMessage();

      context.registerShutdownHook();
      // this method shutdown container and helloworld bean will be destroy and destroy method
      // will call.
   }
}