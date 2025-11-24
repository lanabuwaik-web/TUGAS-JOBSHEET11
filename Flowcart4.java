import java.util.Scanner;
public class Flowcart4 {
    public static void main(String[] args) {
        int[][] survey = {
                {4, 5, 3, 4, 5, 4},
                {3, 4, 4, 3, 4, 3},
                {5, 5, 5, 4, 5, 5},
                {2, 3, 3, 2, 3, 2},
                {4, 4, 4, 4, 4, 4},
                {3, 3, 3, 3, 3, 3},
                {5, 4, 5, 5, 5, 4},
                {4, 3, 4, 4, 4, 3},
                {3, 2, 3, 3, 3, 2},
                {5, 5, 4, 5, 5, 5}
        };
        int j = 1; 
        while (j <= 6) { 
            int TotalPertanyaan = 0;
            int i = 1;
            while (i <= 10) { 
                TotalPertanyaan = TotalPertanyaan + survey[i - 1][j - 1];
                i = i + 1; 
            }
            double RataRata = (double) TotalPertanyaan / 10;
            System.out.println("Rata-rata pertanyaan ke-" + j + " = " + RataRata);

            j = j + 1; // j = j + 1
        }

        System.out.println("Selesai.");
    }
}
