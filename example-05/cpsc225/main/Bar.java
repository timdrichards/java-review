package cpsc225.main;

import cpsc225.example.Foo;
import cpsc225.util.Baz;

public class Bar {
  public static void main(String[] args) {
    Foo f1 = new Foo();
    Bar b1 = new Bar();

    cpsc225.example.Foo f2 =
      new cpsc225.example.Foo();
    cpsc225.util.Baz b2 =
      new cpsc225.util.Baz();
  }
}