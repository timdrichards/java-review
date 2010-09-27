package animals;

import java.io.InputStream;

public class Console {
  private InputStream in;

  public Console() {
    in = System.in;
    System.out.println("Console is ready.");
    System.out.println("Enter a command followed by ENTER.");
    System.out.print("> ");
  }

  public char nextCmd() {
    // TODO
    // Here you must add code that does the
    // following:
    //  1) Check if the val is between 1 and 5,
    //     these are the allowable commands.
    //  2) If the val is between 1 and 5, return
    //     the corresponding character:
    //     1 -> 'a'
    //     2 -> 'b'
    //     3 -> 'c;
    //     4 -> 'd'
    //     5 -> 'e'
    //  3) If the val is not between 1 and 5, print
    //     "Bad command", and try to read the input
    //     again.
    //
    //  Note: remember to deal with exceptions.
    
    // INSERT CODE BELOW
    // int val = in.read();

    // Replace this return with actual commands.
    return 'e';
  }
}