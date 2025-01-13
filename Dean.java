public class Dean extends Adventurer{
  int happiness, happinessMax;


  /*the other constructors ultimately call the constructor
  *with all parameters.*/
  public Dean(String name, int hp){
    super(name,hp);
    happinessMax = 20;
    happiness = happinessMax/2;
  }


  /*The next 8 methods are all required because they are abstract:*/
  public String getSpecialName(){
    return "Steal Your Airpods";
  }

  public int getSpecial(){
    return happiness;
  }

  public void setSpecial(int n){
    happiness = n;
  }

  public int getSpecialMax(){
    return happinessMax;
  }

  /*Deal 2-7 damage to opponent, restores 2 happiness*/
  public String attack(Adventurer other){
    other.setHP(other.getHP() - 2);
    return "Hey! This isnt your free period! Get to class!";
  }

  /*Deal 3-12 damage to opponent, only if happiness is high enough.
  *Reduces happiness by 8.
  */
  public String specialAttack(Adventurer other){
    if(happiness < 5){
      other.setSpecial(other.getSpecial() - 2);
      setSpecial(getSpecial() + 2);
      other.setHP(other.getHP() - 3);
      return "Are you listening to music and relaxing during your free period!? Give me those airpods " + other.getName() + "!";

    }

  }
  /*Restores 5 special to other*/
  public String support(Adventurer other){
    other.setHp(other.getHP + 3);
    return other.getName + ", Im here to help!";
  }

  public String support(){
    return "I have a free period! Let me watch the knicks game!"
  }
}
