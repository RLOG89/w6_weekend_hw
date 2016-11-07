import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

public class CardTest{

  Card card;

  @Before
  public void before(){
    card = new Card(Rank.TEN, Suit.CLUBS);
  }

  @Test
  public void canGetRank(){
    assertEquals(Rank.TEN, card.getRank());
  }

  @Test
  public void canGetSuit(){
    assertEquals(Suit.CLUBS, card.getSuit());
  }

  @Test
  public void canPrintCardAsString(){
    assertEquals("TEN OF CLUBS", card.toString());
  }
}