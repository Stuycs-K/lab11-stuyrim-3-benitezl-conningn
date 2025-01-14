public class Tester{
  public static void main(String[] args) {
    System.out.println("┘");
    System.out.println("🯅");
    System.out.println("🮲🮳");
    System.out.println("🯁🯂🯃");
    System.out.println("➪");
    System.out.println("➤");
    String[] thing = "🯰 🯱 🯲 🯳 🯴 🯵 🯶 🯷 🯸 🯹".split(" ");
    System.out.println(thing[Integer.parseInt(args[0].substring(0,1))]+thing[Integer.parseInt(args[0].substring(1))]);
  }
}
