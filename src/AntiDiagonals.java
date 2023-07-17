import java.util.Scanner;

public class AntiDiagonals {
    public static void Diagonal(int[][] Array, int Rowsize, int Columnsize) {
        for (int x = 0; x < Columnsize; x++) {
            int i = 0, j = x;
            while (i < Columnsize && j >= 0) {
                System.out.print(Array[i][j] + " ");
                i++;
                j--;
            }
            System.out.println();
        }
        for (int x = 1; x < Rowsize; x++) {
            int i = x, j = Columnsize - 1;
            while (i < Rowsize && j >= 0) {
                System.out.print(Array[i][j] + " ");
                i++;
                j--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Rowsize = scanner.nextInt();
        int Columnsize = scanner.nextInt();
        int Array[][] = new int[Rowsize][Columnsize];
        for (int i = 0; i < Rowsize; i++) {
            for (int j = 0; j < Columnsize; j++) {
                Array[i][j] = scanner.nextInt();
            }
        }
        Diagonal(Array, Rowsize, Columnsize);
    }
}