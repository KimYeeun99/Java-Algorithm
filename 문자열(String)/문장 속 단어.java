import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] s = br.readLine().split(" ");
    String result = "";
    for (String word : s) {
      if(result.length() < word.length()) result = word;
    }
    System.out.println(result);
    
  }
}