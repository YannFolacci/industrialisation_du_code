import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HippoTest {

  private Hippo hippopote;

  @BeforeEach
  public void init() {
    this.hippopote = new Hippo(200, 320, 1, 10);
  }


  @Test
  void should_not_change_weight() {
    this.hippopote.eat();
    this.hippopote.eat();
    this.hippopote.swim();
    this.hippopote.swim();
    this.hippopote.swim();
    assertEquals(200, this.hippopote.getWeight());
  }

  @Test
  void cant_lose_more_weight() {
    for(int i=0; i<22; i++){
        this.hippopote.swim();
    }
    assertEquals(40, this.hippopote.getWeight());
  }
}