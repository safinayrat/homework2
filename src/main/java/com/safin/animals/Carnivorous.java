package com.safin.animals;

import com.safin.food.Food;
import com.safin.food.Meat;

public abstract class Carnivorous extends Animal {

  @Override
  public void eat(Food food) {
    if (food instanceof Meat) {
      satiety += food.getAmountOfFood();
      System.out.println("The animal is fed");
    } else {
      System.out.println("This food is not meat");
    }
  }
}
