package com.nemeacreation.mythology;

import com.nemeacreation.mythology.Coach.FootballCoach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kevin on 13/12/2016.
 */
public class BeanScopeDemoApp {

  public static void main(String[] args) {

    //load the spring configuration file
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-beanScope.xml");


    //retrieve bean from spring container
    FootballCoach coachEast = context.getBean("footballCoach", FootballCoach.class);
    FootballCoach coachWest = context.getBean("footballCoach", FootballCoach.class);


    // check if the same
    // Will be the same if the bean is a singleton
    // Will be different if the bean has prototype scope
    boolean result = (coachEast == coachWest);
    System.out.println("coachEast == coachWest :" +result);

    System.out.println("\nMemory location for coachEast:" + coachEast);

    System.out.println("\nMemory location for coachWest:" + coachWest + "\n");

    // close the context
    context.close();

  }

}
