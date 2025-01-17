public class Teacher extends Adventurer{
  int happiness, happinessMax;


  /*the other constructors ultimately call the constructor
  *with all parameters.*/
  public Teacher(String name, int hp){
    super(name,hp);
    happinessMax = 10;
    happiness = happinessMax/2;
  }





  /*The next 8 methods are all required because they are abstract:*/
  public String getSpecialName(){
    return "";
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
    return "";
  }

  /*Deal 3-12 damage to opponent, only if happiness is high enough.
  *Reduces happiness by 8.
  */
  public String specialAttack(Adventurer other){
    return "";
  }
  /*Restores 5 special to other*/
  public String support(Adventurer other){
    return "";
  }
  /*Restores 6 special and 1 hp to self.*/
  public String support(){
    return "";
  }
}
