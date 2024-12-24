package leetcode;

public class PlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int l = flowerbed.length;

        for (int i = 0; i < l; i++) {
            if (flowerbed[i] == 0) {
                if (checkLeft(flowerbed, i) && checkRight(flowerbed, i)) {
                    count++;
                    flowerbed[i] = 1;
                }
            }
        }

        return count >= n;
    }

    private boolean checkLeft(int[] flowerbed, int i) {
        if (i == 0 || flowerbed[i - 1] == 0) {
            return true;
        } else {
            return false;
        }
    }

    private boolean checkRight(int[] flowerbed, int i) {
        if (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(new PlaceFlowers().canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
    }
}
