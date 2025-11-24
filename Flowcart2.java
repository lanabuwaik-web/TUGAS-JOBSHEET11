import java.util.Scanner;

public class Flowcart2 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] survey = new int[10][6];
        int i = 1;   
        while (i <= 10) {

            int j = 1;  
            while (j <= 6) {
                System.out.print("Masukkan nilai responden " + i + " untuk pertanyaan " + j + ": ");
                survey[i - 1][j - 1] = sc.nextInt();

                // j = j + 1
                j = j + 1;
            }

            // i = i + 1
            i = i + 1;
        }

        System.out.println("Input data selesai.");
    }
}

