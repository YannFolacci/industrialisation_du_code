package gmaster;

public class Hippo extends Animal {

    private int power;

    public Hippo(int weight, int height, int name, int power) {
        super(weight, height, name);
        this.power = power;
    }

    public Hippo swim() {
        // fais perdre du poids à l'hippopotame
        int newWeight = this.getWeight() - 10;
        if (newWeight > 40) {
            this.setWeight(newWeight);
            return null;
        }
        this.setWeight(40);
        return null;
    }

    public Hippo eat() {
        // fais prendre du poids
        this.setWeight(this.getWeight() + 15);
        return null;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}