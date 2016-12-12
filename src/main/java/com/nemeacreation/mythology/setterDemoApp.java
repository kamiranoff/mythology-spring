package com.nemeacreation.mythology;

import com.nemeacreation.mythology.Coach.BasketballCoach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kevin on 11/12/2016.
 */
public class setterDemoApp {

  public static void main(String[] args) {

    //load the spring configuration file
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    //retrive bean from spring container
    BasketballCoach basketballCoach = context.getBean("myBasketballCoach", BasketballCoach.class);

    // call method on the bean
    System.out.println(basketballCoach.getDailyWorkout());
    System.out.println(basketballCoach.getDailyFortune());
    System.out.println(basketballCoach.getEmail());
    System.out.println(basketballCoach.getTeam());

    // close the context
    context.close();
  }
}
