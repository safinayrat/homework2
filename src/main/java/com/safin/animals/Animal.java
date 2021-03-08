package com.safin.animals;

import com.safin.food.Food;

public abstract class Animal {
  protected int satiety;

  public Animal() {
    this.satiety = 1;
  }

  public abstract void eat(Food food);

  public int getSatiety() {
    return satiety;
  }
}
