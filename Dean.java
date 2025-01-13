public class Dean extends Adventurer{
  int happiness, happinessMax;
  String preferredLanguage;

  /*the other constructors ultimately call the constructor
  *with all parameters.*/
  public CodeWarrior(String name, int hp, String language){
    super(name,hp);
    caffeineMax = 12;
    caffeine = caffeineMax/2;
    preferredLanguage = language;
  }

  public CodeWarrior(String name, int hp){
    this(name,hp,"c++");
  }

  public CodeWarrior(String name){
    this(name,24);
  }


  public Dean(String name, int hp, String language){
    super(name,hp);
    happinessMax = 20;
    happiness = happinessMax/2;
    preferredLanguage = language;
  }

  public Dean(String name, int hp){
    this(name,hp,"c++");
  }

  public Dean(String name){
    this(name,24);
  }

  public Dean(){
    this("Carmack");
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
    if(happiness < 5){
      other.setSpecial(other.getSpecial() - 2);
      setSpecial(getSpecial() + 2);
      return "Are you listening to music and relaxing during your free period!? Give me those airpods!";
    }

  }
  /*Restores 5 special to other*/
  public String support(Adventurer other){
    other.setHp(other.getHP + 5);
    return "";
  }
  /*Restores 6 special and 1 hp to self.*/
  public String support(){

  }
}
