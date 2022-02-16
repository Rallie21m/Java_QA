package oop.homework5;

public class Cat extends Animal {
    public Cat(String name, String breed, int age, boolean hair) {
        super(name, breed, age, hair);
    }
    public Cat(){
        super("", "", 0, false);
    }

    @Override
    public void printData() {
        super.printData();
        System.out.printf(super.getName() + " is a cat.");
    }

    public void voice() {
        System.out.println("The cat's voice is: Miau Miau");
    }

    public void run() {
        System.out.println("The cat is running fast.");
    }

    public void eat() {
        if (getAge() > 5) {
            System.out.println("The cat have to eat 2 times per day.");
        } else {
            System.out.println("Tha cat have to eat 1 time per day.");
        }
    }
    }

