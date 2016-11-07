package cards;
import java.util.*;

public class Pontoon{

  // public static void main(String [] args){ //do we not need this in here?

    Deck deck = new Deck();
    private ArrayList<Player> players = new ArrayList<Player>();

    public void populateDeck(Deck deck){
      deck.populate();
    }

    public void shuffleDeck(Deck deck){
      deck.shuffle();
    }

    public void addPlayer(Player player){
      players.add(player);
    }

    public void deal(ArrayList<Card> deck){
      for (Player player : this.players){
        player.setHand(deck.get(0), deck.get(1));
        deck.remove(0);
        deck.remove(0);
      } 
    }

    public int playerCount(){
      return players.size();
    }

    public ArrayList<Card> getDeck(){
      return this.deck;
    }
  }
}
