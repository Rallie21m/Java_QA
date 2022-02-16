package oop.homework5;

public class Animal {
    private String name;
    private String breed;
    private int age;
    private boolean hair;

    public Animal(String name, String breed, int age, boolean hair) {
        setName(name);
        setBreed(breed);
        setAge(age);
        setHair(hair);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid data!");
        }
    }

        public String getBreed () {
            return breed;
        }

        public void setBreed (String breed){
            if (!breed.isEmpty()) {
                this.breed = breed;
            } else {
                System.out.println("Invalid data!");
            }
        }

        public int getAge () {
            return age;
        }

        public void setAge ( int age){
            if (age > 0) {
                this.age = age;
            } else
                System.out.println("Invalid data!");
        }

        public boolean isHair () {
            return hair;
        }

        public void setHair ( boolean hair){
            this.hair = hair;
        }


    public void printData() {
        System.out.printf("This animal name is: %s.%nThis animal's age is:%d.%nThis animal's breed is: %s.%n", name, age, breed);
        if (hair) {
            System.out.println("This animal has hair.");
        } else {
            System.out.println("This animal hasn't hair.");
        }
    }
}
