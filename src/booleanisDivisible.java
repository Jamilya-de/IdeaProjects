public class booleanisDivisible {

    public static void main(String[] args) {
        System.out.println(isDivisible(15,10) + " число делиться без остатка");

    }

    public static boolean isDivisible(int num1, int num2) {
        if (num1 % num2 == 0) {
            return true;
        } else {
            return false;
        }
    }


}
