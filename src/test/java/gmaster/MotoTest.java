package gmaster;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MotoTest {

  private Moto moto;

  @BeforeEach
  public void init() {
    this.moto = new Moto("yamaha", 2, 150);
  }

  @Test
  void should_make_noise() {
    assertEquals("brrr", moto.noise());
  }

  @Test
  void accelere_vitesse() {
    moto.accelere();
    assertEquals(151, moto.getVitesse());
  }
}