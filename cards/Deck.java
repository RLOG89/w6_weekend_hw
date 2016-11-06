package cards;
import java.util.*;

public class Deck {

  private ArrayList<Card> deck;

  public Deck(){
    deck = new ArrayList<Card>();
  }

  public ArrayList<Card> getDeck() {
    return this.deck;
  }

  public void populate(){
    for (Rank rank : Rank.values()){
      for (Suit suit : Suit.values()){
        deck.add(new Card(rank, suit));
      }
    }
  }
}
