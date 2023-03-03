package String;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    String name;
    System.out.print("Masukan nama anda : ");
    name = in.nextLine();
    String inputan = name.toLowerCase();
     System.out.print("Hasil Inputan : " + inputan);
    char[] chars = inputan.toCharArray();
    Arrays.sort(chars);
    String sorting = new String(chars);
    System.out.print("Sorting : " + sorting);
    System.out.println("");
    char[] hasilSort = sorting.toCharArray();

    List<Character> vokal = new ArrayList<>();
    List<Character> konsonan = new ArrayList<>();
    
    for (int i = 0; i < hasilSort.length; i++) {
      if (chars[i] == 'a' || chars[i] == 'i' || chars[i] == 'u' || chars[i] == 'e' || chars[i] == 'o')
        vokal.add(chars[i]);
      else if (chars[i] != ' '){
        konsonan.add(chars[i]);
      }
    }

    StringBuilder vc = new StringBuilder();
    for(Character c : vokal) {
        vc.append(c);
    }
    String vokalBaru = vc.toString();

    StringBuilder ks = new StringBuilder();
    for(Character d : konsonan) {
        ks.append(d);
    }
    String konsonanBaru = ks.toString();


    
    
    System.out.print("Vokal : " + vokalBaru);
    System.out.println("");

    System.out.print("Konsonan : " + konsonanBaru);
    System.out.println("");
  }
}
