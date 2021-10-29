package gmaster;

public class Car extends Vehicle {

    private int horses;

    public Car(String brand, int wheels, int horses) {
        super(brand, wheels);
        this.horses = horses;
    }

    public int getHorses() {
        return horses;
    }

    public void setHorses(int horses) {
        this.horses = horses;
    }

    public String noise() {
        return "vrooooooooooooooom";
    }
}