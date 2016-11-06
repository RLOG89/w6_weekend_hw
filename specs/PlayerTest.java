import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

public class PlayerTest {

  Player player;
  Card card1;
  Card card2;

  @Before
  public void before(){
    player = new Player ("Keith");
    card1 = new Card(Rank.TEN, Suit.CLUBS);
    card2 = new Card(Rank.NINE, Suit.CLUBS);
  }

  @Test
  public void testPlayerHasName(){
    assertEquals("Keith", player.getName());
  }

  @Test
  public void handStartsEmpty(){
    assertEquals(null,player.getHand());
  }

  @Test 
  public void canSetHand(){
    assertEquals(card1, card2, player.getHand());
  }
}