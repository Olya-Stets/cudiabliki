public class Dz4 {

    public static boolean IsSorted(int [] v, String SortOrder) {
        boolean a = false;
        if (SortOrder == "descending") {
            for (int i = 0; i < v.length - 1; i++) {
                if (v[i] >= v[i + 1]) a = true;
                else {
                    a = false;
                    break;
                }
            }
        }
        else if (SortOrder == "ascending") {
            for (int i = 0; i < v.length - 1; i++) {
                if (v[i] <= v[i + 1]) a = true;
                else {
                    a = false;
                    break;
                }
            }
        } else System.out.println("Wrong SortOrder value");
        return a;
    }

    public static int [] Transform (int [] v, String SortOrder) {
        if (IsSorted (v, SortOrder)){
            for (int i = 0; i< v.length; i++) v[i]=v[i]+i;
        }
        return v;
    }
}
