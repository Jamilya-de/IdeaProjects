public class boolean3Division {

    public static void main(String[] args) {
        System.out.println(isDivisible(20, 10, 2));
    }

    public static boolean isDivisible(int num1, int num2, int num3) {
        if (num1 % num3 == 0) {
            return true;
        } else {
            if (num2 % num3 == 0) {
                return true;
            } else {
                return false;
            }
        }

    }
}