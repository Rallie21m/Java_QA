package Animals;

public class Mammal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.trim().isEmpty()) {
            this.name = name;
        }
        else {
            System.out.println("A name should not be empty.");
        }
    }

    public Mammal (String name){
        setName(name);
    }

    protected void Eat (String food){
        System.out.printf("%n%s eats %s.", name, food);
    }

}
