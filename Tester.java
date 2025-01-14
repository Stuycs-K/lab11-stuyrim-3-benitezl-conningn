public class Tester{
  public static void main(String[] args) {
    System.out.print("┌");
    for(int i =0; i < 78; i++){
      System.out.print("─");
    }
    System.out.println("┐");
    for(int i = 0; i < 28; i ++){
      System.out.print("│");
      for(int j = 0; j < 78; j++){
        System.out.print(" ");
      }
      System.out.println("│");
    }
    System.out.print("└");
    for(int i =0; i < 78; i++){
      System.out.print("─");
    }
    System.out.println("┘");
  }
}
