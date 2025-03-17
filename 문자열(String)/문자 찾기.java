import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String sentence = br.readLine();
    char character = br.readLine().charAt(0);

    char ch = Character.toUpperCase(character);
    int count = 0;
    for(char s : sentence.toUpperCase().toCharArray()) {
      if(s == ch) {
        count++;
      }
    }

    System.out.println(count);
  }
}