package lesson_3;

public class Task9 {
    public static void main(String[] args) {

        diagonal(10, 10);

    }

    public static void diagonal(int x, int y) {
        int[][] arr = new int[x][y];

        for (int i = 0; i < arr.length; i++) {
            arr[i][arr.length - i - 1] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][i] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
