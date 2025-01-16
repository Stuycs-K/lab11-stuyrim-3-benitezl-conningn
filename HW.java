public class HW{
  int Duration;
  String TypeS;
  int TypeI;
  public HW(String type, int duration,String recipient){
    if((type.equals("Math") || type.equals("Coding")) || type.equals("History")) {
      Type = type;
      Duration = duration;
    }else{
      throw IllegalArgumentException("wrong type of hw.");
    }
  }

  public String getTypeS(){
  return this.TypeS;
}



public int getDuration(){
  return this.Duration;
}

public void changeDuration(int n){
  Duration = n;
}


}
