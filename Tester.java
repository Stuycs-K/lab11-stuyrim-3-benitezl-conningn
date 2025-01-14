public class Tester{
  public static void main(String[] args) {
    System.out.print("\u250c");
    for(int i =0; i < 40; i++){
      System.out.print("\u2500");
    }
    System.out.println("\u2510");
    for(int i = 0; i < 30; i ++){
      System.out.print("\u2502");
      for(int j = 0; j < 40; j++){
        System.out.print(" ");
      }
      System.out.println("\u2502");
    }
  }
}
