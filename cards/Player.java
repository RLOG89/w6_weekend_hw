package cards;
import java.util.*;

public class Player {

  private String name;
  private ArrayList<Card> hand; 

  public Player (String name){
    this.name = name;
    // this.hand = new ArrayList<Card>();
  }

  public String getName() {
    return this.name;
  }

  public void setName(String newName) {
    this.name = name;
  }

  public ArrayList<Card> getHand(){
    return this.hand;
  }

  public void setHand(Card...cards){
    this.hand = hand;
  }

}

