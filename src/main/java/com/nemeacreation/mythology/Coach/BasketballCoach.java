package com.nemeacreation.mythology.Coach;

import com.nemeacreation.mythology.Services.FortuneService;

/**
 * Created by kevin on 11/12/2016.
 */
public class BasketballCoach implements Coach {

  private FortuneService fortuneService;

  private String email;
  private String team;

  public BasketballCoach() {
    System.out.println("Basketball inside no-arg constructor");
  }


  @Override
  public String getDailyWorkout() {
    return "make 200 attempts at 3 points and at 200 more at 2 points";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortuneService();
  }

  public void setFortuneService(FortuneService fortuneService) {
    System.out.println("Basketball inside setter method - setFortune Service");
    this.fortuneService = fortuneService;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    System.out.println("Basketball inside setter method - setEmail");

    this.email = email;
  }

  public String getTeam() {
    return this.team;
  }

  public void setTeam(String team) {
    System.out.println("Basketball inside setter method - setTeam");

    this.team = team;
  }
}
