public class Task2Calculator {

    /*
    a. add implementation to below calculator methods
    b. invent another calculator method that would do something useful
     */
    public static void main(String[] args) {
        // play around with numbers - try Integer.MAX_VALUE for example and see what happens
        System.out.println (plus(2147483647, -2147483647));
        System.out.println(minus(135, 235));
        System.out.println(multiply(10, 10));
        System.out.println(mod(50, 7));
    }
    static int plus(int a, int b) {
        return a+b;
    }

    static int minus(int a, int b) {
        int c = a - b;
        return c;
    }

    static int multiply(int a, int b) {
        return a*b;
    }

    static int mod(int a, int b) {
        // modulus - https://javarush.ru/groups/posts/operator-deleniya-po-modulyu
        return a % b;
    }

}
