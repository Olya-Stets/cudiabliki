public class Dz1
{
    public static int task1(int n) throws UnsupportedOperationException {
        if (n > 0)
            n = n * n;
        else if (n < 0)
            n = Math.abs(n);
        else n = 0;
        return n;
    }

    public static int task2(int n) throws UnsupportedOperationException {
        int n3 = n % 10;
        int n2 = ((n - n3) / 10) % 10;
        int n1 = (n - (n2 * 10) - n3) / 100;
        int max = 0, mid = 0, min = 0;
        if (n1 > n2) {
            max = n1;
            min = n2;
        } else {
            max = n2;
            min = n1;
        }
        if (n3 > max) {
            mid = max;
            max = n3;
        } else {
            if (n3 < min) {
                mid = min;
                min = n3;
            } else {
                mid = n3;
            }
        }
        int res = max * 100 + mid * 10 + min;
        return res;
    }
}
