package offer;

/**
 * @Auther DRevelation
 * @Date 2019-09-11 10:46
 * @Desc
 */
public class Solution01 {

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        System.out.println(Solution01.find1(6, array));
        System.out.println(Solution01.find2(3, array));
    }

    /**
     * 从右上开始
     * @param target
     * @param array
     * @return
     */
    public static boolean find1(int target, int[][] array) {
        int r = 0; //行
        int c = array[0].length - 1; //列
        while (r < array.length && c >= 0) {
            if (array[r][c] == target) {
                return true;
            } else if (array[r][c] > target) {
                c--;
            } else {
                r++;
            }
        }
        return false;
    }

    /**
     * 从左下开始
     * @param target
     * @param array
     * @return
     */
    public static boolean find2(int target, int[][] array) {
        int r = array.length - 1; //行
        int c = 0; //列
        while (c < array[0].length && r >= 0) {
            if (array[r][c] == target) {
                return true;
            } else if (array[r][c] > target) {
                r--;
            } else {
                c++;
            }
        }
        return false;
    }
}
