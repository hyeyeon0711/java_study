package src.generic;

import java.util.ArrayList;

class Fruit0 implements Eatable {
    public String toString() {
        return "Fruit0";
    }
}
class Apple0 extends Fruit0 {
    public String toString() {
        return "Apple0";
    }
}
class Grape0 extends Fruit0 {
    public String toString() {
        return "Grape0";
    }
}
class Toy0  {
    public String toString() {
        return "Toy0";
    }
}

interface Eatable { }

public class GenericEx2 {
    public static void main(String args[]) {
        FruitBox<Fruit0> fruitBox = new FruitBox<Fruit0>();
        FruitBox<Apple0> appleBox = new FruitBox<Apple0>();
        FruitBox<Grape0> grapeBox = new FruitBox<Grape0>();

        fruitBox.add(new Fruit0());
        fruitBox.add(new Apple0());
        fruitBox.add(new Grape0());
        appleBox.add(new Apple0());
        grapeBox.add(new Grape0());

        System.out.println("fruitBox-" + fruitBox);
        System.out.println("appleBox-" + appleBox);
        System.out.println("grapeBox-" + grapeBox);
    }
}

class FruitBox<T extends Fruit0 & Eatable> extends Box<T> {}

class Box0<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item)    { list.add(item); }
    T get (int i)       { return list.get(i); }
    int size()          { return list.size(); }
    public String toString() { return list.toString(); }
}