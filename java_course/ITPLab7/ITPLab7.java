package ITPLab7;

public class ITPLab7 {
  public static void main(String[] args) {
    String myStr = "220315060 Heval Sogut";
    System.out.println(myStr);
    String myId = myStr.substring(0, 9);
    String myName = myStr.substring(10);
    System.out.println(myId);
    System.out.println(myName);
    myName += (char) (Math.random() * 26 + 65);
    myName += (char) (Math.random() * 26 + 65);
    myName += (char) (Math.random() * 26 + 65);
    System.out.println(myName);
    myName = myName.toLowerCase();
    System.out.println(myName);

  }
}
