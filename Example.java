public class Example {

    int func(int n)
    {
        int result;
        if (n == 1)
            return 1;
            result = func(n-1);
            return result;

        }

            public static void main(String[] args) {
                Example e = new Example();
                System.out.println(e.func(5));
            }
        }
