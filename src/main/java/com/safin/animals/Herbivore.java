package com.safin.animals;

import com.safin.food.Food;
import com.safin.food.Grass;

public abstract class Herbivore extends Animal {

  @Override
  public void eat(Food food) {
    if (food instanceof Grass) {
      satiety += food.getAmountOfFood();
      System.out.println("The animal is fed");
    } else {
      System.out.println("This food is not grass");
    }
  }
}
