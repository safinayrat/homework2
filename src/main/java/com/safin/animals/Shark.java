package com.safin.animals;

public class Shark extends Carnivorous implements Swim {
  @Override
  public void swim() {
    System.out.println("Shark is swimming");
  }
}
