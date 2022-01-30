
/**
 * Nama : BAGUS TEJO WALUYO
 * NIM : 2131710076
 * Prodi : DIII Manajemen Informatika
 * Kelas/No : 1A/008
 */

import java.util.Scanner;

public class Kuismatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size, menu, parameter;
        double total = 0, rata = 0;

        System.out.print("Masukkan ukuran matrix: ");
        size = in.nextInt();

        int[][] matrixA = new int[size][size];
        int[][] matrixB = new int[size][size];
        int[][] matrixTotal = new int[size][size];

        System.out.println("Masukkan Matriks A");
        for (int a1 = 0; a1 < matrixA.length; a1++)
            for (int a2 = 0; a2 < matrixA[0].length; a2++) {
                System.out.printf("[%d][%d] : ", a1, a2);
                matrixA[a1][a2] = in.nextInt();
            }

        System.out.println("Masukkan Matriks B");
        for (int b1 = 0; b1 < matrixB.length; b1++)
            for (int b2 = 0; b2 < matrixB[0].length; b2++) {
                System.out.printf("[%d][%d] : ", b1, b2);
                matrixB[b1][b2] = in.nextInt();
            }

        while (true) {
            System.out.println(" Program Matrix Kuis 2 ");
            System.out.println("1. Penjumlahan matrix\n2. Cetak elemen diagonal kanan\n3. Keluar System");
            System.out.print("Pilih: ");
            menu = in.nextInt();

            if (menu == 1) {
                for (int i = 0; i < matrixA.length; i++) {
                    for (int j = 0; j < matrixA[0].length; j++)
                        matrixTotal[i][j] = matrixA[i][j] + matrixB[i][j];
                }

                for (int i = 0; i < matrixTotal.length; i++) {
                    for (int j = 0; j < matrixTotal[0].length; j++)
                        System.out.printf("%2d ", matrixTotal[i][j]);
                    System.out.println();
                }
            } else if (menu == 2) {
                parameter = matrixTotal.length - 1;
                for (int i = 0; i < matrixTotal.length; i++) {
                    for (; parameter >= 0;) {
                        System.out.print(matrixTotal[i][parameter]);
                        total += matrixTotal[i][parameter];
                        rata++;
                        parameter--;
                        break; // menghentikan program
                    }
                    System.out.println();
                }
                rata = total / rata;
                System.out.printf("rata-rata = %.2f\n", rata);
            } else if (menu == 3) {
                System.out.println("sesi berakhir.");
                break;
            } else {
                System.out.println("Maaf, inputan anda salah\n");
                continue;
            }
        }

    }
}