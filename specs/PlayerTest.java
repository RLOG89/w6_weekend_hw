import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

public class PlayerTest {

  Player player1;
  Player player2;
  ArrayList<Card> cards;

  @Before
  public void before(){
    player1 = new Player ("Mark");
    player2 = new Player ("SuperHans");
    tClubs = new Card(Rank.TEN, Suit.CLUBS);
    nClubs = new Card(Rank.NINE, Suit.CLUBS);
    ArrayList<Card> testCards = new ArrayList<Card>();
    testCards.add(tClubs);
    testCards.add(nClubs);
    player1.setHand(testCards);
  }

  @Test
  public void testPlayerHasName(){
    assertEquals("Mark", player1.getName());
  }

  @Test
  public void handStartsEmpty(){
    assertEquals(null,player2.getHand());
  }

  @Test 
  public void canSetHand(){
    assertEquals(Rank.TEN, player1.getHand.get(0).getRank());
  }
}