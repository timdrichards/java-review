public class Streams {
  public static void main(String[] args) {
    // We have seen System.out:
    System.out.println("hello");

    // Reading input:
    int val = System.in.read();

    InputStreamReader is =
      new InputStreamReader(System.in);
    BufferedReader br =
      new BufferedReader(is);
    
    String line = br.readLine();
    System.out.println(line);
  }
}