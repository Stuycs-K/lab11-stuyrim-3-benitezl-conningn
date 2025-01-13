public class HistoryNerd extends Adventurer{
  int Amsco_Notes, Amsco_Notes_Max;
  String preferredLanguage;

  /*the other constructors ultimately call the constructor
  *with all parameters.*/
  public HistoryNerd(String name, int hp, String language){
    super(name,hp);
    caffeineMax = 10;
    Amsco_Notes = caffeineMax/2;
    preferredLanguage = language;
  }

  public HistoryNerd(String name, int hp){
    this(name,hp,"c++");
  }

  public HistoryNerd(String name){
    this(name,24);
  }

  public HistoryNerd(){
    this("Carmack");
  }

  /*The next 8 methods are all required because they are abstract:*/
  public String getSpecialName(){
    return "";
  }

  public int getSpecial(){
    return caffeine;
  }

  public void setSpecial(int n){
    caffeine = n;
  }

  public int getSpecialMax(){
    return caffeineMax;
  }

  /*Deal 2-7 damage to opponent, restores 2 caffeine*/
  public String attack(Adventurer other){
    return "";
  }

  /*Deal 3-12 damage to opponent, only if caffeine is high enough.
  *Reduces caffeine by 8.
  */
  public String specialAttack(Adventurer other){
    return "";
  }
  /*Restores 5 special to other*/
  public String support(Adventurer other){
    return "History tutoring for you " + other.getName() + "!";
  }
  /*Restores 6 special and 1 hp to self.*/
  public String support(){
    return "";
  }
}
