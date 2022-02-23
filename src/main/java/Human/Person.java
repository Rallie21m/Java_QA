package Human;

import Animals.Mammal;

public class Person extends Mammal {

    public Person(String name) {
        super(name);
    }

    @Override
    protected void Eat(String food) {
        super.Eat(food);
    }
}
