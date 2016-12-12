package com.nemeacreation.mythology;

import com.nemeacreation.mythology.Coach.Coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kevin on 11/12/2016.
 */
public class SpringHelloApp {

  public static void main(String[] args) {

    // load the spring configuration file
    ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext.xml");

    // retreive bean from spring container
    Coach coach = context.getBean("myCoach", Coach.class);


    // call methods on the bean
    System.out.println(coach.getDailyWorkout());
    System.out.println(coach.getDailyFortune());

    // close context
    context.close();
  }
}
