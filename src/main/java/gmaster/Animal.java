public class Animal {

    private int weight;
    private int height;
    private int name;

    public Animal(int weight, int height, int name) {
        this.weight = weight;
        this.height = height;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }
}