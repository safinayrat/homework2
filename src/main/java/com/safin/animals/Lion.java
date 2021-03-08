package com.safin.animals;

public class Lion extends  Carnivorous implements Run, Voice{
  @Override
  public void run() {
    System.out.println("Lion is running");
  }

  @Override
  public String voice() {
    return "Roar";
  }
}
