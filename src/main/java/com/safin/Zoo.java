package com.safin;

import com.safin.animals.*;
import com.safin.food.*;


public class Zoo {
  public static void main(String[] args) {
    Cow cow = new Cow();
    Duck duck = new Duck();
    Fish fish = new Fish();
    Lion lion = new Lion();
    Shark shark = new Shark();
    Wolf wolf = new Wolf();

    Food algae = new Algae();
    Food beef = new Beef();
    Food fishMeat = new FishMeat();
    Food hay = new Hay();

    Worker worker = new Worker();
    worker.feed(cow, hay);
    worker.feed(lion, beef);
    worker.feed(duck, fishMeat);
    worker.feed(wolf, algae);
    worker.getVoice(cow);

    Animal[] pond = {duck, fish, shark};
    for (Animal animal : pond) {
      Swim swimAnimal = (Swim) animal;
      swimAnimal.swim();
    }
    System.out.println(cow.getSatiety());
  }
}
