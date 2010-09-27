public class Control {
  public static void main(String[] args) {
    int val = 5;

    if (val == 5)
      System.out.println("five");
    else
      System.out.println("not sure");

    switch (val) {
    case 3:
      System.out.println("three");
      break;
    case 4:
      System.out.println("four");
      break;
    case 5:
      System.out.println("five");
      break;
    default:
      System.out.println("not sure");
    }

    for (int i = 0; i < val; i++)
      System.out.println(i);

    while (val != 0) {
      System.out.println(val);
      val--;
    }
  }
}