package Arrays;

public class Arrays {
  public static void main(String[] args) {
    String ogrenci1 = "Ahmet";
    String ogrenci2 = "Mehmet";
    String ogrenci3 = "Heval";

    System.out.println(ogrenci1);
    System.out.println(ogrenci2);
    System.out.println(ogrenci3);
    System.out.println("---------------------");
    String[] ogrenciler = new String[3];
    ogrenciler[0] = "Ahmet";
    ogrenciler[1] = "Mehmet";
    ogrenciler[2] = "Heval";

    for (int i = 0; i < ogrenciler.length; i++) {
      System.out.println(ogrenciler[i]);
    }
    /* recommended usage */
    for (String ogrenci : ogrenciler) {
      System.out.println(ogrenci);
    }
  }

}
