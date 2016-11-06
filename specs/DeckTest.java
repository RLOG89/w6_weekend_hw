import static org.junit.Assert.*;
import org.junit.*;
import cards.*;
import java.util.*;

public class DeckTest{

  Deck deck;

  @Before
  public void before(){
    deck = new Deck();
  }

  @Test
  public void testDeckIsPopulated(){
    assertEquals(0, deck.getDeck().size());
    deck.populate();
    assertEquals(52, deck.getDeck().size());
  }

}