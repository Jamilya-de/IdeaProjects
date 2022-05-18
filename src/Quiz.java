public class Quiz {
    public static void main(String[] args) {
        printSmth(10);
    }

    static void printSmth(int number) {
        if (number >10) {
            System.out.println("Hello");
        } else if (number < 10) {
            System.out.println("World");
        } else {
            System.out.println("!");
        }
    }
}
