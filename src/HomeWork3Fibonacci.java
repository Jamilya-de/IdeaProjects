public class HomeWork3Fibonacci {

    public static void main(String[] args) {
        printFirstNFibonacciNumbers(10); // must print numbers 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        printFirstNFibonacciNumbers(3); // must print numbers 0, 1, 1
        printFirstNFibonacciNumbers(11); // must print numbers 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
    }

    /**
     * First 10 Fibonacci numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
     * <p>
     * See definition here - https://en.wikipedia.org/wiki/Fibonacci_number
     *
     * @param n number of fibonacci numbers to be printed. >= 0
     */
    public static void printFirstNFibonacciNumbers(int n ) {
         {
            int f = 0;
            int y = 1;
            int x;
            System.out.println(f);
            System.out.println(y);
            for (int i = 3; i <= n; i++)
            {
                x=f+y;
                f=y;
                y=x;
                System.out.println(x);

            }


        }

        }
    }