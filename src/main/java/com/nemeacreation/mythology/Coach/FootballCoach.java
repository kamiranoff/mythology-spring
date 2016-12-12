package com.nemeacreation.mythology.Coach;

import com.nemeacreation.mythology.Services.FortuneService;

/**
 * Created by kevin on 11/12/2016.
 */
public class FootballCoach implements Coach {


  private String name = "Football Coach";


  // define private field for the dependency
  private FortuneService fortuneService;

  public FootballCoach(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "Throw 50 passes to your wingman";
  }

  @Override
  public String getDailyFortune() {
    return this.name + this.fortuneService.getFortuneService();
  }
}
