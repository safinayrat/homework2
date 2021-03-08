package com.safin.animals;

public class Wolf extends Carnivorous implements Run, Voice{
  @Override
  public void run() {
    System.out.println("Wolf is running");
  }

  @Override
  public String voice() {
    return "wolf howl";
  }
}
