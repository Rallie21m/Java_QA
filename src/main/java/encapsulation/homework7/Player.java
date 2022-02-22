package encapsulation.homework7;

public class Player {
    private String name;
    private double endurance;
    private double sprint;
    private double dribble;
    private double passing;
    private double shooting;
    public double stat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("A name should not be empty.");
        }
    }

    public double getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        if (endurance > 0 && endurance < 100) {
            this.endurance = endurance;
        } else {
            System.out.println("Endurance should be between 0 and 100.");
        }
    }

    public double getSprint() {
        return sprint;
    }

    public void setSprint(int sprint) {
        if (sprint > 0 && sprint < 100) {
            this.sprint = sprint;
        } else {
            System.out.println("Sprint should be between 0 and 100.");
        }
    }

    public double getDribble() {
        return dribble;
    }

    public void setDribble(int dribble) {
        if (dribble > 0 && dribble < 100) {
            this.dribble = dribble;
        } else {
            System.out.println("Dribble should be between 0 and 100.");
        }
    }

    public double getPassing() {
        return passing;
    }

    public void setPassing(int passing) {
        if (passing > 0 && passing < 100) {
            this.passing = passing;
        } else {
            System.out.println("Passing should be between 0 and 100.");
        }
    }

    public double getShooting() {
        return shooting;
    }

    public void setShooting(int shooting) {
        if (shooting > 0 && shooting < 100) {
            this.shooting = shooting;
        } else {
            System.out.println("Shooting should be between 0 and 100.");
        }
    }

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting){
        setName(name);
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
        this.stat = (this.endurance + this.sprint + this.dribble + this.passing + this.shooting)/5;
    }
}
