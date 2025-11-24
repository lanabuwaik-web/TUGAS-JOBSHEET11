import java.util.Scanner;

public class Flowcart1 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] survey = new int[10][6];
        for (int i = 0; i < 10; i++) {
            System.out.println("=== Responden ke-" + (i + 1) + " ===");
            for (int j = 0; j < 6; j++) {
                System.out.print("Nilai pertanyaan " + (j + 1) + " (1-5): ");
                survey[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("\n=== Rata-rata Setiap Responden ===");
        double totalSemua = 0;
        for (int i = 0; i < 10; i++) {
            int jumlah = 0;
            for (int j = 0; j < 6; j++) {
                jumlah += survey[i][j];
            }
            double rata = (double) jumlah / 6;
            totalSemua += rata;
            System.out.println("Rata-rata responden ke-" + (i + 1) + ": " + rata);
        }
        System.out.println("\n=== Rata-rata Per Pertanyaan ===");
        for (int j = 0; j < 6; j++) {
            int jumlah = 0;
            for (int i = 0; i < 10; i++) {
                jumlah += survey[i][j];
            }
            double rata = (double) jumlah / 10;
            System.out.println("Pertanyaan " + (j + 1) + ": " + rata);
        }
        double totalKeseluruhan = totalSemua / 10;
        System.out.println("\n=== Rata-rata Keseluruhan ===");
        System.out.println("Rata-rata keseluruhan: " + totalKeseluruhan);
    }
    
}
