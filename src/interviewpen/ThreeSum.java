package interviewpen;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] a = new int[]{-3, -1, 1, 0, 2, 10, -2, 8};
        int l = a.length;

        int[] ans = new int[3];
        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < l - 2; i++) {
            for (int j = 1; j < l - 1; j++) {
                for (int k = 0; k < l; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        ans[0] = i;
                        ans[1]=j;
                        ans[2]=k;

                        list.add(ans);
                    }
                }
            }
        }

        System.out.println(list.toArray());
    }
}
