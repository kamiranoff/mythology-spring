package com.nemeacreation.mythology.Coach;

import com.nemeacreation.mythology.Services.FortuneService;

/**
 * Created by kevin on 11/12/2016.
 */
public class BaseballCoach implements Coach {

  private String name = "Baseball Coach";

  // define private field for the dependency
  private FortuneService fortuneService;

  // define a constructor for dependency injection
  public BaseballCoach(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }


  @Override
  public String getDailyWorkout() {
    return "Spend 30 minutes on batting practice";
  }

  @Override
  public String getDailyFortune() {
    return this.name + this.fortuneService.getFortuneService();
  }

}
