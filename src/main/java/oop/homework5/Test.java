package oop.homework5;

public class Test {
    public static void main(String[] args) {
        Cat smallCat = new Cat();
        smallCat.setBreed("Singapura");
        smallCat.setHair(true);
        smallCat.setAge(5);
        smallCat.setName("Muri");

        smallCat.printData();
        smallCat.voice();
        smallCat.run();
        smallCat.eat();

        Cat bigCat = new Cat("Arti", "Main coon", 8, true);
        bigCat.printData();
        bigCat.voice();
        bigCat.run();
        bigCat.eat();

    }
}
