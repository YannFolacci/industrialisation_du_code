package gmaster;

public class Moto extends Vehicle {

  private int vitesse;

  public Moto(String brand, int wheels, int vitesse) {
    super(brand, wheels);
    this.vitesse = vitesse;
  }

  public String noise() {
    return "brrr";
  }

  public int getVitesse() {
    return vitesse;
  }

  public void setVitesse(int vitesse) {
    this.vitesse = vitesse;
  }

  public int accelere() {
    return this.vitesse++;
  }
}