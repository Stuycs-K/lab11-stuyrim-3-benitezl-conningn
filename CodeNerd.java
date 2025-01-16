public class CodeNerd extends Adventurer{
  int happiness, happinessMax, GPA, HW;
  String preferredLanguage;
  ArrayList<HW> Homework;

  /*the other constructors ultimately call the constructor
  *with all parameters.*/
  public CodeNerd(String name, int hp, String language){
    super(name,hp);
    happinessMax = 10;
    happiness = happinessMax/2;
    preferredLanguage = language;
    GPA = 85;
  }
  public int getGPA(){
    return GPA;
  }

  public int setGPA(int n){
    GPA =  n;
  }



  public String getHW(){
    String output = "";
    for(int i=0;i<Homework.length();i++) {
      HW current = Homework.get(i);
      output += " HW"+ (i+1) + " Type: " + current.getTypeS() + " due date: " + current.getDuration():
    }
    return output;
  }

  public String doHW(int number){

    if(Homework.getTypeS().equals("Coding")) {
      this.setGPA(getGPA()+2);
      Teacher
    }; else{
      this.setGPA(getGPA()+1);

    }
    Teacher.setHP(Teacher.getHP() - 1);
    return "Your GPA is now: " + getGPA() + "\n" + Homework.getHW();
  }













  /*The next 8 methods are all required because they are abstract:*/
  public String getSpecialName(){
    return "Advent Of Code";
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
