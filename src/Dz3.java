import java.util.Arrays;

public class Dz3 {

    public static int [] task1(int [] m) {
        for (int i = 0; i < m.length / 2; i++) {
            if (m[i] % 2 == 0 && m[m.length - i - 1] % 2 == 0) {
                int x = m[i];
                m[i] = m[m.length-i-1];
                m[m.length-i-1] = x;
            }
        }
        return m;

    }
    public static int task2(int [] m) {
        int max = m [0];
        int fp = 0;
        int lp = m.length-1;
        for (int i = 1; i < m.length; i++) {
            if (max < m[i]) max = m[i];
        }
        for (int i=0; m[i]!=max; i++) fp = i+1;
        for (int i=0; m[m.length-1-i]!=max; i++) lp = m.length-2-i;
        return lp-fp;
    }
    public static int [][] task3(int [][] m) {
        for (int y=0; y<m.length; y++) {
            for (int i=0; i<m[y].length; i++){
                if (i<y) m[y][i]=0;
                    else if (i>y) m[y][i]=1;
            }
        }
        return m;
    }


}
