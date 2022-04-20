public class StringApp {
    public static void main(String[] args) {
        System.out.println("Hello World");  //String
        System.out.println('H');    //Character
        System.out.println("H");

        System.out.println("Hello" + "World");
        System.out.println("Hello\nWorld");
        System.out.println("Hello/nWorld");
        System.out.println("Hello\"World\"");

        System.out.println("Hello World".length());
        System.out.println("Hello, [[[aaa]]] ... bye".replace("[[[aaa]]]", "egoing"));
    }
}
