<dl>
  <dt>NIM :</dt>
 <dd>2131710099</dd>

  <dt>Nama :</dt>
  <dd>Muhammad Rayhan Gibran</dd>
    
  <dt>Kelas :</dt>
  <dd>MI-1A</dd>
</dl>


___


# JOBSHEET 09 - Perulangan 2

## Tujuan
+ Mahasiswa memahami konsep perulangan bersarang (_nested loop_)
+ Mahasiswa dapat menjelaskan format penulisan perulangan bersarang (_nested loop_)
+ Mahasiswa dapat mengimplementasikan _flowchart_ perulangan bersarang menggunakan bahasa pemrograman Java

## Alat dan Bahan
+ PC/laptop
+ Browser(chrome, firefox, safari)
+ Koneksi internet
+ Anaconda3 + Java kernel (opsional)

## Praktikum
### Percobaan 1: Bintang Persegi
1. Perhatikan Flowchart di bawah ini
![Gambar 0](images/img-00.png)
> flowchart di atas digunakan untuk menggambar sebuah persegi dengan simbol * (bintang)
2. Pada percobaan ke-1 akan dilakukan percobaan tentang _nested loop_. Kasus yang akan diselesaikan adalah untuk membuat tampilan persegi * , dengan panjang sisi sebanyak N. Misalkan N dimasukan **5**, maka hasilnya adalah
![Gambar 1](images/img-01.png)
3. Karena program membutuhkan input dari keyboard, maka perlu import class Scanner
4. Ketikan kode program di bawah ini
![Gambar 2](images/img-02.png)


```Java
// Tulis Kode program Percobaan 1 Langkah 4 di atas
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int N;

System.out.print("Masukkan nilai N : ");
N = sc.nextInt();

for(int i = 0; i <= N; i++){
    System.out.print("*");
}
```

    Masukkan nilai N : 5
    ******

> Program diatas untuk mencetak 6 buah bintang

5.	Perhatikan sintaks perulangan yang digunakan untuk mencetak * sebanyak N kali ke arah samping. Di tahap 4 di atas kode _looping **for**_ kita jadikan sebagai _**inner loop**_. 
6.	Kita looping lagi _inner loop_ sebanyak N kali untuk menghasilkan _output_ seperti tahap 2. Maka perlu ditambahkan perulangan luar (_outer loop_).
![Gambar 3](images/img-03.png)


```Java
// Tulis Kode program Percobaan 1 Langkah 6 (gabungkan dengan inner loop pada langkah 4)
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int N;

System.out.print("Masukkan nilai N : ");
N = sc.nextInt();
for(int outer = 1; outer <= N; outer++){
for(int i = 0; i <= N; i++){
    System.out.print("*");
    }
}
```

    Masukkan nilai N : 5
    ******************************

#### Pertanyaan 
1. Apakah dengan menggabungkan _inner loop_ dan _outer loop_ seperti langkah 5 di atas sudah menghasilkan _output_ seperti gambar pada langkah 1?
2. Jika belum, silahkan modifikasi kode program sehingga menghasilkan output yang sesuai dengan gambar pada langkah 2?

#### Jawaban
1. Output yang dihasilkan tidak sama dengan gambar langkah 2
2. siap


```Java
// Tulis Kode program Percobaan 1 yang benar menurut kalian
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int N;

System.out.print("Masukkan nilai N : ");
N = sc.nextInt();
for(int outer = 1; outer <= N; outer++){
for(int i = 0; i <= N; i++){
    System.out.print("*");
    }
    System.out.println();
}
```

    Masukkan nilai N : 5
    ******
    ******
    ******
    ******
    ******


> Program diatas untuk mencetak seperti dicontoh gamabr langkah 2

***
### Percobaan 2: Bintang Segitiga
1.	Pada percobaan ke-2 akan dilakukan percobaan segitiga * sama siku dengan tinggi sebesar N. Misalkan N dimasukan **5**, maka hasilnya seperti gambar berikut
![Gambar 4](images/img-04.png)
2. Karena program membutuhkan input dari keyboard, maka perlu import class Scanner
3. Ketikan kode program di bawah ini
![Gambar 5](images/img-05.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 3 di atas
Scanner sc = new Scanner (System.in);
System.out.print("Masukkan nilai N = ");
int N = sc.nextInt();
int i = 0;
while(i <= N) {
    int j = 0;
    while(j < i){
        System.out.print("*");
        j++;
    }
    i++;
}
```

    Masukkan nilai N = 5
    ***************

> Program diatas menghasilkan output * sebanyak 25 secara horizontal karena belum di mengubah Bagian kondisi inner loop menjadi while(j <= i) dan di outer loop diberi statement System.out.println();

Amati kode program yang telah kalian tulis di atas.

#### Pertanyaan
1. Perhatikan, apakah output yang dihasilkan dengan nilai N = 5 sesuai dengan  tampilan seperti pada tahap 1 (Percobaan 2)?
2. Jika tidak sesuai, bagian mana saja yang harus diperbaiki/ditambahkan? Jelaskan setiap bagian yang perlu diperbaiki/ditambahkan. 

#### Jawaban
1. output yang dihasilkan tidak sesuai dengan  tampilan seperti pada tahap 1 (Percobaan 2)
2. Bagian kondisi inner loop menjadi while(j <= i) dan di outer loop diberi statement System.out.println();



```Java
// Tulis Kode program Percobaan 2 yang benar menurut kalian
Scanner sc = new Scanner (System.in);
System.out.print("Masukkan nilai N = ");
int N = sc.nextInt();
int i = 0;
while(i <= N) {
    int j = 0;
    while(j <= i){
        System.out.print("*");
        j++;
    }
     System.out.println();
    i++;
}
```

    Masukkan nilai N = 5
    *
    **
    ***
    ****
    *****
    ******


>dengan mengubah Bagian kondisi inner loop menjadi while(j <= i) dan di outer loop diberi statement System.out.println(); maka hasilnya seperti di contoh

***
### Percobaan 3: Segitiga Angka
1.	Pada percobaan ke-3 akan dilakukan percobaan segitiga angka sama siku dengan tinggi sebesar N. Misalkan N dimasukan **5**, maka hasilnya seperti berikut
![Gambar 7](images/img-07.png)
2. Karena program membutuhkan input dari keyboard, maka perlu import class Scanner
3. Ketikan kode program di bawah ini
![Gambar 8](images/img-08.png)



```Java
// Tulis Kode program Percobaan 3 Langkah 3 di atas, disini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int N;

System.out.print("Masukkan nilai N : ");
N = sc.nextInt();

for(int i = 0; i <= N; i++){
    for(int j = 1; j <= i; j++){
    System.out.print(j);
    }
    System.out.println();
}
```

    Masukkan nilai N : 5
    
    1
    12
    123
    1234
    12345


>Program diatas Output yang dihasilkan tidak sesuai dengan  tampilan diatas karena belum mengubah statement inner loop dari "System.out.print(j);" menjadi " System.out.print(i);

#### Pertanyaan 
1. Apakah kode program di atas menghasilkan _output_ yang diharapkan?
2. Jika belum, kode program mana yang harus modifikasi? Jelaskan

#### Jawaban
1. Output yang dihasilkan tidak sesuai dengan  tampilan diatas
2. Kode yang adalah diubah adalah statement inner loop dari "System.out.print(j);" menjadi " System.out.print(i);"


```Java
// Tulis Kode program Percobaan 3 yang benar menurut kalian
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int N;

System.out.print("Masukkan nilai N : ");
N = sc.nextInt();

for(int i = 0; i <= N; i++){
    for(int j = 1; j <= i; j++){
    System.out.print(i);
    }
    System.out.println();
}
```

    Masukkan nilai N : 5
    
    1
    22
    333
    4444
    55555


>dengan mengubah mengubah statement inner loop dari "System.out.print(j);" menjadi " System.out.print(i);

***
### Percobaan 4: Tebak Angka
1. Pada Percobaan 4 ini, kita akan belajar membuat kode untuk menebak angka menggunakan _nested loop_.
2. Pada percobaan ini kita menggunakan library Scanner untuk menangkap input dari keyboard dan Random untuk meng-generate angka secara acak
3. Ketik dan pahami kode program di bawah ini
![Gambar 6](images/img-06.png)


```Java
// Tulis Kode program Percobaan 4 Langkah 3 di atas, disini
import java.util.Scanner;
import java.util.Random;

Random random = new Random();
Scanner input = new Scanner(System.in);
char menu = 'y';

do{
    int number = random.nextInt(10) + 1;
    boolean success = false;
    
    do {
       System.out.print("Tebak angka (1-10) : ");
       int answer = input.nextInt();
       input.nextLine();
        
      if(answer == number){
          System.out.println("Yay... tebakan anda benar...Selamat!!!");
          success = true;
      }
    } while(!success);
    
     System.out.print("Apakah Anda ingin mengulang permainan (Y/T)? ");
     menu = input.nextLine().charAt(0);
} while(menu == 'y'  || menu =='Y');
System.out.print("============selesai Terima kasih============");
```

    Tebak angka (1-10) : 1
    Tebak angka (1-10) : 2
    Tebak angka (1-10) : 3
    Tebak angka (1-10) : 4
    Tebak angka (1-10) : 5
    Tebak angka (1-10) : 6
    Yay... tebakan anda benar...Selamat!!!
    Apakah Anda ingin mengulang permainan (Y/T)? T
    ============selesai Terima kasih============

#### Pertanyaan
1. Jelaskan alur program di atas!
2. Apa yang harus dilakukan untuk tidak melanjutkan (tidak mengulangi) permainan tersebut? 
3. Modifikasi program di atas, sehingga bisa menampilkan informasi mengenai : 
    1. input nilai tebakan yang dimasukan oleh user apakah lebih kecil atau lebih besar dari nilai random!
    2. hentikan _nested loop_ jika pengguna gagal menebak angka sampai 10x tebakan, dan beri pesan "Maaf Anda gagal menebak angka sebanyak 10x"

#### Jawaban
1. Program diatas merupakan sebuah game dimana user menebak angka random yang telah ditentukan oleh komputer, alur program diatas dimulai dari mengimpor class random dan scanner kemudian memberikan perintah ke komputer untuk mengambil nomor acak 1-10 kemudian membuat inner loop dengan menyuruh user menginput angka yang menurut user sama dengan dengan perulangan do - while jika salah maka akan mengulangi pertanyaan lagi dan jika benar maka akan memuculkan kata "Yay... tebakan anda benar...Selamat!!!" setelah itu ada pertanyaan lagu untuk melajutkan permainan atau tidak jika iya maka akan kembali ke permainan dan jika tidak maka game selesai.

2. Menambahkan System.out.print("============selesai Terima kasih============"); dibawah while yang paling akhir



```Java
/* Jawaban untuk Percobaan 4 Pertnyaan 3.A disini */
import java.util.Scanner;
import java.util.Random;

Random random = new Random();
Scanner input = new Scanner(System.in);
char menu = 'y';

do{
    int number = random.nextInt(10) + 1;
    boolean success = false;
    
    do {
       System.out.print("Tebak angka (1-10) : ");
       int answer = input.nextInt();
       input.nextLine();
        
      if(answer == number){
          System.out.println("Yay... tebakan anda benar...Selamat!!!");
          success = true;
      }
      else if (answer < number){
         System.out.println("Kurang Besar rekan");
         
     }
        else{
        System.out.println("terlalu besar rekan");
        }
    } while(!success);
    
     System.out.print("Apakah Anda ingin mengulang permainan (Y/T)? ");
     menu = input.nextLine().charAt(0);
} while(menu == 'y'  || menu =='Y');
System.out.print("============selesai Terima kasih============");
```

    Tebak angka (1-10) : 1
    Kurang Besar rekan
    Tebak angka (1-10) : 2
    Kurang Besar rekan
    Tebak angka (1-10) : 3
    Kurang Besar rekan
    Tebak angka (1-10) : 6
    Kurang Besar rekan
    Tebak angka (1-10) : 9
    Yay... tebakan anda benar...Selamat!!!
    Apakah Anda ingin mengulang permainan (Y/T)? t
    ============selesai Terima kasih============

> Program diatas untuk memunculkan keterangan ketika angka yang ditebak user lebih kecil dari angka yang diambil komputer maka akan memunculkan kalimat "kurang besar rekan" dan jika yang dimasukkan lebih dari yang ditentukan komputer maka akan memunculkan kalimat "terlalu besar rekan"


```Java
/* Jawaban untuk Percobaan 4 Pertnyaan 3.B disini */
import java.util.Scanner;
import java.util.Random;

Random random = new Random();
Scanner input = new Scanner(System.in);
int i;
char menu = 'y';

do{
    int number = random.nextInt(10) + 1;
    boolean success = false;
    
    do {
       System.out.print("Tebak angka (1-10) : ");
       int answer = input.nextInt();
       input.nextLine();
     if (i == 10){
         System.out.println("Maaf Anda gagal menebak angka sebanyak 10x");
         break;
      }
        
      else if(answer == number){
          System.out.println("Yay... tebakan anda benar...Selamat!!!");
          success = true;
      }
      else if (answer < number){
         System.out.println("Kurang Besar rekan");
         i += 1;
     }
      else if (answer > number){
        System.out.println("terlalu besar rekan");
        i += 1;
        }
      
    } while(!success);
    
     System.out.print("Apakah Anda ingin mengulang permainan (Y/T)? ");
     menu = input.nextLine().charAt(0);
} while(menu == 'y'  || menu =='Y');
System.out.print("============selesai Terima kasih============");
```

    Tebak angka (1-10) : 1
    Kurang Besar rekan
    Tebak angka (1-10) : 9
    terlalu besar rekan
    Tebak angka (1-10) : 7
    terlalu besar rekan
    Tebak angka (1-10) : 6
    terlalu besar rekan
    Tebak angka (1-10) : 5
    terlalu besar rekan
    Tebak angka (1-10) : 4
    terlalu besar rekan
    Tebak angka (1-10) : 3
    Yay... tebakan anda benar...Selamat!!!
    Apakah Anda ingin mengulang permainan (Y/T)? t
    ============selesai Terima kasih============

> Program diatas akan memuculkan kalimat "Maaf Anda gagal menebak angka sebanyak 10x" ketika user salah menebak angka yang diambil komputer sebanyak 10 kali dan selanjutnya akan ditawarkan ingin bermain lagi atau tidak

***
## Tugas
### Soal 1
Buatlah program yang **sesuai** dengan alur _flowchart_ di bawah ini
![Soal 1](images/Soal-01.png)

Apabila kode program sesuai _flowchart_, maka untuk nilai N = 5 akan menghasilkan output seperti gambar berikut
![Soal 1 A](images/Soal-01.1.png)


```Java
/* Jawaban Soal 1 disini */
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int N;

System.out.print("Masukkan nilai N = ");
N = sc.nextInt();
for(int i = 1; i <= N; i++){
for(int j = N; j >= 1; j--){
    if(i < j){
      System.out.print(" ");
        }
    else{
      System.out.print("*");
        }
    }
    System.out.println(" ");
}
```

    Masukkan nilai N = 5
        * 
       ** 
      *** 
     **** 
    ***** 


> Program diatas untuk memunculkan segitiga siku dengan format rata kanan

***
### Soal 2
Buatlah program untuk mencetak tampilan persegi angka seperti di bawah ini berdasarkan input dari _keyboard_ N (nilai N minimal 3). Contoh N = 3, dan N = 5
![Soal 2](images/Soal-02.png)


```Java
/* Jawaban Soal 2 disini */
import java.util.Scanner;

System.out.print("Masukkan nilai = ");
Scanner in = new Scanner(System.in);

int k = in.nextInt();
for (int a = 1; a <= k; a++) {
    for (int b = 1; b <= k; b++) {
        if (a == 1 || a == k || b == 1 || b == k) System.out.print(" " + k);
        else System.out.print("  ");
    }
    System.out.println();
}
```

    Masukkan nilai = 5
     5 5 5 5 5
     5       5
     5       5
     5       5
     5 5 5 5 5


***
### Soal 3
Buatlah program untuk mencetak tampilan piramida * seperti gambar di bawah ini, tinggi piramida berdasarkan input dari _keyboard_ N (nilai N minimal 3). Contoh N = 3, dan N = 5
![Soal 3](images/Soal-03.png)


```Java
/* Jawaban Soal 3 disini */
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int a,b,c,d,N;

System.out.print("Masukkan nilai N = ");
N = sc.nextInt();

        for (a = 1; a <= N; a++) {
            //outerloop
            for ( b = N; b >= a; b--) {
                //inner loop no 1
                System.out.print(" ");
                //Untuk memberikan spasi ke samping
            }
            
            for ( c = 1; c <=a; c++) {
                //inner loop no 2
                System.out.print("*");
                //menampilkan bintang dari kanan ke kiri
            }
            for ( d = 1; d <= a-1; d++) {
                //inner loop no 3
                System.out.print("*");  
                //menampilkan bintang dari kiri ke kanan
            }
            System.out.println();
            //Memberikan baris baru atau enter pada 
        }
```

    Masukkan nilai N = 5
         *
        ***
       *****
      *******
     *********


> Proggram diatas untuk membuat piramida dengan 3 inner loop inner pertama untuk memberikan spasi kesamping, inner kedua menampilkan bintang dari kanan ke kiri, inner ketiga menampilkan bintang dari kiri ke kanan
