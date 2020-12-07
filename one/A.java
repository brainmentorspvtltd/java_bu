public class A {
public static void main(String[] args) {
    String name = "Amit".intern();
    String name2 = "Amit".intern();
    String name3 = new String("Amit").intern();
    System.out.println(name == name2);
    System.out.println(name == name3);
    name = "Ram";
    System.out.println(name == name2);


}
}
