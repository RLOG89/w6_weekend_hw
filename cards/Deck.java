package cards;
import java.util.*;

public class Deck {

  private ArrayList<Card> deck;

  public Deck(){
    this.deck = new ArrayList<Card>();
  }

  public ArrayList<Card> getDeck() {
    return this.deck;
  }

  public void populate(){
    for (Rank rank : Rank.values()){
      for (Suit suit : Suit.values()){
        this.deck.add(new Card(rank, suit));
      }
    }
  }
// move this to Shuffle.java later and use better rng
  public void shuffle(){
    Collections.shuffle(deck);
  }

  public void removeCard(int index){
    this.deck.remove(index);
  }

  public Card getCard(int index){
    return this.deck.get(index);
  }

  public int size(){
    return this.deck.size();
  }

  public void dealCard(Deck deck){
    deck.removeCard(0);
  }
}

