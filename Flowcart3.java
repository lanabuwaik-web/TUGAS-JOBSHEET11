import java .util.Scanner;
public class Flowcart3 {
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
        int i = 1; 
        while (i <= 10) {  

            int TotalResponden = 0;  
            int j = 1;               

            while (j <= 6) {
                TotalResponden = TotalResponden + survey[i - 1][j - 1];
                j = j + 1; 
            }
            double RataRata = (double) TotalResponden / 6;
            System.out.println("Rata-rata responden ke-" + i + " = " + RataRata);

            i = i + 1; 
        }

        System.out.println("Selesai.");

    }

}