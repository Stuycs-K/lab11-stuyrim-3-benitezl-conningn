public class HW{
  int Duration;
  String TypeS;
  int TypeI;
  public HW(String type, int duration){
    if((type.equals("Math") || type.equals("Coding")) || type.equals("History")) {
      Type = type;
      Duration = duration;
    }else{
      throw IllegalArgumentException("wrong type of hw.");
    }

  }

  public String hwTypeS()
{
  return this.TypeS;
}

  public int hwTypeI(){
    return this.TypeI;
  }




public int hwDuration(){
  return this.Duration;
}



}
