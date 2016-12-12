package com.nemeacreation.mythology.Coach;

import com.nemeacreation.mythology.Services.FortuneService;

/**
 * Created by kevin on 11/12/2016.
 */
public class TrackCoach implements Coach {


  private String name = "Track Coach";

  // define private field for the dependency
  private FortuneService fortuneService;

  public TrackCoach(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "Run a fast paste 5k";
  }

  @Override
  public String getDailyFortune() {
    return this.name + this.fortuneService.getFortuneService();
  }
}
