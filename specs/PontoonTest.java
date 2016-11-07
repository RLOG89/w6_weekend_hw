import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

public class PontoonTest {

  Pontoon pontoon;
  Deck deck;
  Player player;
  Player dealer;

  @Before public void before(){
    Pontoon = new Pontoon();
    player = new Player("Mark");
    dealer = new Player("Jeremy");
    deck = new Deck();
    deck.populate();
    deck.shuffle();
  }

  @Test public void canAddPlayers(){
    assertEquals(0, pontoon.playerCount());
    pontoon.addPlayer(player);
    assertEquals(1, pontoon.playerCount());
    pontoon.addPlayer(dealer);
    assertEquals(0, pontoon.playerCount());
  }

  @Test
  public void dealsCards(){
    pontoon.addPlayer(player);
    pontoon.addPlayer(dealer);
    pontoon.deal();
    assertNotNull(player.getHand());
    assertNotNull(dealer.getHand());
  }
}