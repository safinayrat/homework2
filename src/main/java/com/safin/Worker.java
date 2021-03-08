package com.safin;

import com.safin.animals.Animal;
import com.safin.animals.Voice;
import com.safin.food.Food;

public class Worker {
  public void feed(Animal animal, Food food) {
    animal.eat(food);
  }

  public void getVoice(Voice animal) {
      System.out.println(animal.voice());
  }
}
