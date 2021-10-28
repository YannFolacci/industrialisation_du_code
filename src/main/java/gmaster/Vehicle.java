public class Vehicle {

    private String brand;
    private int wheels;

    public Vehicle(String brand, int wheels) {
        this.brand = brand;
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String noise() {
        return "bep bep";
    }
}