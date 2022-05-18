public class max3 {
    public static void main(String[] args) {
        System.out.println(max3(10, 19, 0));
    }

    public static int max3(int num1, int num2, int num3) {
        int max;
        max = (num1 > num2) ? num1 : num2;
        max = (max > num3) ? max : num3;
        return max;
    }
    /*
    тринокулярный оператор, оператор с тремя операндами.
     */
}
