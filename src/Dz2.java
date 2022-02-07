public class Dz2 {

    public static int task1(int value) {
        int sum = 0;
        String strInt = Integer.toString(value);
        char[] charm = strInt.toCharArray();
        for (int i = 0; i < strInt.length(); i++) {
            int a = Character.getNumericValue(charm[i]);
            if (a % 2 == 1) sum = sum + a;
        }
        return sum;
    }

    public static int task2(int value) {
        int a = 0;
        String abc = Integer.toBinaryString(value);
        for (int b = 0; b < abc.length(); b++) {
            if (abc.charAt(b) == '1') a++;
        }
        return a;
    }
    public static int task3(int value) {
        int [] fib = new int[value];
        int sum = 0;
        for (int i = 0; i < value; i++) {
            if (i==0) fib [i] = 0;
                else if (i==1) fib [i] = 1;
                    else fib [i] = fib [i-1] + fib [i-2];
            sum = sum + fib [i];
        }
        return sum;
    }

    public static int task3_case(int value) {
        int[] fib = new int[value];
        int sum = 0;
        for (int i = 0; i < value; i++) {
            switch (i) {
                case (0):
                    fib [i] = 0;
                    break;
                case (1):
                    fib [i] = 1;
                    break;
                default:
                    fib [i] = fib [i-1] + fib [i-2];
                    break;
            }
            sum = sum + fib[i];
        }
        return sum;
    }
}
