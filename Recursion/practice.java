public class practice {

    public static void f(){
        System.err.println("Hello World");
        f();
    }
    public static void main(String[] args) {
        f();
    }
}
