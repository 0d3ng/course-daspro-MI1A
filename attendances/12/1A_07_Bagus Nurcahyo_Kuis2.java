import java.util.Scanner; //Inisialisasi Scanner untuk inputan dari keyboard

public class Kuisdua {

  public static void main(String[] args) {

    int pilihan, i, j, a, b; //membuat variabel dengan bertipe data int

    //membuat array2 dengan bertipe data int
    int matriks1[][] = new int[10][10];
    int matriks2[][] = new int[10][10];
    int hasil[][] = new int[10][10];

    Scanner in = new Scanner(System.in);//inisialisasi Scanner

    //Menampilkan biodata
    System.out.println("=------------------------=");
    System.out.println("| Nama  : Bagus Nurcahyo |");
    System.out.println("| Absen : 07             |");
    System.out.println("| NIM   : 2131710120     |");
    System.out.println("=------------------------=");

    //Meminta inputan keyboard yang bersumber dari variabel a
	System.out.print("Masukkan jumlah baris matriks: ");
    a = in.nextInt();

    //Meminta inputan keyboard yang bersumber dari variabel b
    System.out.print("Masukkan jumlah kolom matriks: ");
    b = in.nextInt();

    System.out.println("\nMasukkan elemen matriks a: ");//meminta inputan dari keyboard
    //Meminta inputan dari keyboard yang menggunakan perulangan bersarang, yang meminta masukkan elemen matriks a
    for (i = 0; i < a; i++) {
      for (j = 0; j < b; j++) {
        matriks1[i][j] = in.nextInt();
      }
    }

    System.out.println("\nMasukkan elemen matriks b: ");//meminta inputan dari keyboard
    //Meminta inputan dari keyboard yang menggunakan perulangan bersarang, yang meminta masukkan elemen matriks b
    for (i = 0; i < a; i++) {
      for (j = 0; j < b; j++) {
        matriks2[i][j] = in.nextInt();
      }
    }

    //Perulangan dimana jika pengguna menginputkan pilihan 1 dan 2 maka program akan berjalan hingga pengguna menginputkan pilihan 3
    do{
        System.out.println("\n1. Penambahan Matrix");
        System.out.println("2. Menampilkan elemen diagonal kiri");
        System.out.println("3. Keluar");
        System.out.print("Pilihan anda : ");
        pilihan = in.nextInt();

        //pemilihan dari setiap nomor kasus menggunakan switch case
        switch(pilihan){
            case 1://pilihan 1
            System.out.println("\n==========================");
            System.out.println("Hasil penjumlahan matriks");
            System.out.println("--------------------------");
            //menampilkan penjumlahan dari setiap indeks yang diinputkan
            for (i = 0; i < a; i++) {
                for (j = 0; j < b; j++) {
                    hasil[i][j] = matriks1[i][j] + matriks2[i][j];
                    System.out.print(hasil[i][j] + "\t");
                }
            System.out.println();
            }
            System.out.println("==========================");
            break;

            case 2://pilihan 2
            System.out.println("\n==========================");
            System.out.println("Elemen diagonal kiri");
            System.out.println("--------------------------");
            //menampilkan elemnen diagonal kiri dari setiap index yang diinputkan
            for(i = 0; i<a; i++){
                for(j=0; j<b; j++){
                    if( (i+j)==(a-1) ){
                        System.out.println(hasil[i][j]);
                    }
                }
            }
            System.out.println("==========================");
            break;

            case 3://pilihan 3
            //jika user menginputkan pilihan 3
            System.out.println("==========================");
            System.out.println("See you next time :)");
            System.out.println("==========================");
            break;

            default:
            //jika user menginputkan selan pilihan 1, 2, dan 3
            System.out.println("==========================");
            System.out.println("Wrong Input");
            System.out.println("==========================");
            break;
        }
    }while(pilihan==2||pilihan==1);//jika pilihan yang diinputkan 1 atau 2 maka program akan melakukan loop

  }

}


// OUTPUT //
/*
=------------------------=
| Nama  : Bagus Nurcahyo |     
| Absen : 07             |     
| NIM   : 2131710120     |     
=------------------------=     
Masukkan jumlah baris matriks: 3
Masukkan jumlah kolom matriks: 3

Masukkan elemen matriks a: 
1
5
3
6
4
7
6
4
8

Masukkan elemen matriks b: 
8
3
4
5
1
2
6
3
8

1. Penambahan Matrix
2. Menampilkan elemen diagonal kiri
3. Keluar
Pilihan anda : 1

==========================
Hasil penjumlahan matriks
--------------------------
9       8       7
11      5       9
12      7       16
==========================

1. Penambahan Matrix
2. Menampilkan elemen diagonal kiri
3. Keluar
Pilihan anda : 2

==========================
Elemen diagonal kiri
--------------------------
7
5
12
==========================

1. Penambahan Matrix
2. Menampilkan elemen diagonal kiri
3. Keluar
Pilihan anda : 3
==========================
See you next time :)
==========================
*/