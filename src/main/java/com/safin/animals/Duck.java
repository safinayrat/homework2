package com.safin.animals;

public class Duck extends Herbivore implements Fly, Voice, Swim {
  @Override
  public void fly() {
    System.out.println("Duck is flying");
  }

  @Override
  public String voice() {
    return "Quack";
  }

  @Override
  public void swim() {
    System.out.println("Duck is swimming");
  }
}
