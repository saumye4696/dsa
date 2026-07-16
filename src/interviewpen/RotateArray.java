package interviewpen;

public class RotateArray {
    public static void main(String[] args) {
        RotateArray.newArray();
    }

    static void newArray() {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] b = new int[3][3];
        int  k = 2;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[j][k] = a[i][j];
            }
            k--;
        }

        // printing array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void inPlace() {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


    }
}
