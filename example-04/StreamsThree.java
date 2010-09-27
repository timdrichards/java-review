import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class StreamsThree {
  public static void main(String[] args) {
    // We have seen System.out:
    System.out.println("hello");

    try {
      // Reading input:
      int val = System.in.read();

      InputStreamReader is =
        new InputStreamReader(System.in);
      BufferedReader br =
        new BufferedReader(is);
    
      String line = br.readLine();
      System.out.println(line);
    }
    catch (IOException e) {
      System.out.println(e);
    }
  }
}