package cards;
import java.util.*;

public class Player {

  private String name;
  private ArrayList<Card> hand = new ArrayList<Card>(); 

  public Player (String name){
    this.name = name;
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

  public void setHand(ArrayList<Card> cards){
    this.hand = cards;
  }

}

