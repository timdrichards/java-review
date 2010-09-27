public class Hello {
  private String name;
  private int    age;

  public Hello(String name, int age) {
    this.name = name;
    this.age  = age;
  }

  public String name() {
    return name;
  }

  public int age() {
    return age;
  }

  public String toString() {
    return "Hello(" + name + " " + age + ")";
  }
}