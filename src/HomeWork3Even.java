public class HomeWork3Even {

    public static void main(String[] args) {
        System.out.println(isEven(15)); // must print false
        System.out.println(isEven(10)); // must print true
    }

    /**
     * @param x  - input to be checked
     * @return true if the number is even, false otherwise
     */
    public static boolean isEven(int x) {
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
