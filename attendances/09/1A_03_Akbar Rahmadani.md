<dl>
  <dt>NIM : 2131710150</dt>
  <dd>...</dd>

  <dt>Nama : Akbar Rahmadani</dt>
  <dd>...</dd>
    
  <dt>Kelas : 1A</dt>
  <dd>...</dd>
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
import java.util.Scanner;

int N;
Scanner sc = new Scanner (System.in);
System.out.print("Masukkan nilai N : ");
N = sc.nextInt ();

for(int i = 0; i <= N; i++){
    System.out.print("*");
}
```

    Masukkan nilai N : 5
    ******

5.	Perhatikan sintaks perulangan yang digunakan untuk mencetak * sebanyak N kali ke arah samping. Di tahap 4 di atas kode _looping **for**_ kita jadikan sebagai _**inner loop**_. 
6.	Kita looping lagi _inner loop_ sebanyak N kali untuk menghasilkan _output_ seperti tahap 2. Maka perlu ditambahkan perulangan luar (_outer loop_).
![Gambar 3](images/img-03.png)


```Java
import java.util.Scanner;

int N = 0;
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan nilai N");
N = sc.nextInt();

for(int i = 0; i <= N; i++){
    for(int j = 0; j <=4; j++){
        System.out.print("*");
    }
     System.out.println();
}
```

    Masukkan nilai N5
    *****
    *****
    *****
    *****
    *****
    *****


#### Pertanyaan 
1. Apakah dengan menggabungkan _inner loop_ dan _outer loop_ seperti langkah 5 di atas sudah menghasilkan _output_ seperti gambar pada langkah 1?
2. Jika belum, silahkan modifikasi kode program sehingga menghasilkan output yang sesuai dengan gambar pada langkah 2?

#### Jawaban
1. ...
2. ...


```Java
import java.util.Scanner;

int N = 0;
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan nilai N");
N = sc.nextInt();

for(int i = 0; i <= N; i++){
    for(int j = 0; j <=4; j++){
        System.out.print("*");
    }
}
```

    Masukkan nilai N5
    ******************************

***
### Percobaan 2: Bintang Segitiga
1.	Pada percobaan ke-2 akan dilakukan percobaan segitiga * sama siku dengan tinggi sebesar N. Misalkan N dimasukan **5**, maka hasilnya seperti gambar berikut
![Gambar 4](images/img-04.png)
2. Karena program membutuhkan input dari keyboard, maka perlu import class Scanner
3. Ketikan kode program di bawah ini
![Gambar 5](images/img-05.png)


```Java
import java.util.Scanner;

int N = 0;
int i = 0;
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan nilai N : ");
N = sc.nextInt();
while(i <= N) {
    int j = 0;
    while (j < i) {
        System.out.print("*");
        j++;
    }
    System.out.println("*");
    i++;
}
```

    Masukkan nilai N : 5
    *
    **
    ***
    ****
    *****
    ******


Amati kode program yang telah kalian tulis di atas.

#### Pertanyaan
1. Perhatikan, apakah output yang dihasilkan dengan nilai N = 5 sesuai dengan  tampilan seperti pada tahap 1 (Percobaan 2)?
2. Jika tidak sesuai, bagian mana saja yang harus diperbaiki/ditambahkan? Jelaskan setiap bagian yang perlu diperbaiki/ditambahkan. 

#### Jawaban
1. Sudah Sesuai
2. ...

***
### Percobaan 3: Segitiga Angka
1.	Pada percobaan ke-3 akan dilakukan percobaan segitiga angka sama siku dengan tinggi sebesar N. Misalkan N dimasukan **5**, maka hasilnya seperti berikut
![Gambar 7](images/img-07.png)
2. Karena program membutuhkan input dari keyboard, maka perlu import class Scanner
3. Ketikan kode program di bawah ini
![Gambar 8](images/img-08.png)



```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
System.out.print("Masukkan nilai N : ");
int N = input.nextInt();

for(int i = 1; i <= N; i++){
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


#### Pertanyaan 
1. Apakah kode program di atas menghasilkan _output_ yang diharapkan?
2. Jika belum, kode program mana yang harus modifikasi? Jelaskan

#### Jawaban
1. Sesuai Harapan
2. ...

***
### Percobaan 4: Tebak Angka
1. Pada Percobaan 4 ini, kita akan belajar membuat kode untuk menebak angka menggunakan _nested loop_.
2. Pada percobaan ini kita menggunakan library Scanner untuk menangkap input dari keyboard dan Random untuk meng-generate angka secara acak
3. Ketik dan pahami kode program di bawah ini
![Gambar 6](images/img-06.png)


```Java
import java.util.Scanner;
import java.util.Random;

Random random = new Random();
Scanner input = new Scanner (System.in);
char menu = 'y';

do {
    int number = random.nextInt(10)+ 1;
    boolean success = false;
    
    do {
        System.out.print("Tebak angka (1-10) : ");
        int answer = input.nextInt();
        input.nextLine();
        
        if(answer == number){
             System.out.println("Yay... tebakan Anda benar... selamat!!!");
             success = true;
         }
    } while(!success);
    System.out.print("Apakah Anda ingin mengulang permainan (y/T)?");
    menu = input.nextLine().charAt(0);
} while(menu == 'y' || menu == 'T');
```

    Tebak angka (1-10) : 1
    Tebak angka (1-10) : 2
    Tebak angka (1-10) : 3
    Tebak angka (1-10) : 4
    Tebak angka (1-10) : 5
    Tebak angka (1-10) : 6
    Tebak angka (1-10) : 7
    Tebak angka (1-10) : 8
    Tebak angka (1-10) : 9
    Tebak angka (1-10) : 10
    Yay... tebakan Anda benar... selamat!!!
    Apakah Anda ingin mengulang permainan (y/T)?D


#### Pertanyaan
1. Jelaskan alur program di atas!
2. Apa yang harus dilakukan untuk tidak melanjutkan (tidak mengulangi) permainan tersebut? 
3. Modifikasi program di atas, sehingga bisa menampilkan informasi mengenai : 
    1. input nilai tebakan yang dimasukan oleh user apakah lebih kecil atau lebih besar dari nilai random!
    2. hentikan _nested loop_ jika pengguna gagal menebak angka sampai 10x tebakan, dan beri pesan "Maaf Anda gagal menebak angka sebanyak 10x"

#### Jawaban
1. Alur Diagram
- Di awal program, program menetapkan terlebih dahulu sebuah angka antara 1-10 yang akan ditebak dan dimasukkan dalam variabel number.
- Pemain menginput angka tebakannya.
- Inputan angka yang ditebak oleh pemain akan dimasukkan ke dalam variabel answer.
- Dilakukan pengecekan di blok if. Jika angka yang diinput (answer) belum benar atau belum sama dengan angka yang sudah ditetapkan program (number), maka akan dilakukan perulangan mulai dari pemain menginput angka, angka dimasukkan ke dalam variabel answer, dan dilakukan pengecekan hingga tebakan pemain benar. Inner looping akan terus dilakukan selama boolean succes bernilai false.
- Jika angka yang diinput (answer) bernilai sama dengan angka yang sudah ditetapkan program (number) maka akan keluar tulisan "Yay... tebakan Anda benar... Selamat!!!" dan boolean succes bernilai true yang mengakibatkan inner looping berhenti.
- Setelah permainan selesai, pemain akan ditanya untuk mengulang atau tidak. Jika pemain menginput y/Y dan program akan mengeksekusi outer loop. Yang termasuk dalam outer loop yaitu mulai dari program menetapkan angka (number) hingga pertanyaan mengulang permainan.
- Outer loop akan terus berjalan selama pemain menginput y/Y
2. Menginput kan angka apa saja yang bukan (y/T)



```Java
import java.util.Scanner;
import java.util.Random;

Random random = new Random();
Scanner input = new Scanner(System.in);
char menu = 'y';

do{
    int number = random.nextInt(10) + 1;
    boolean success = false;
    
    do{
        System.out.print("Tebak angka (1-10) : ");
        int answer = input.nextInt();
        input.nextLine();
        
        if(answer == number){
            System.out.println("Yay... tebakan Anda benar... Selamat!!!");
            success = true;
        } else if(answer < number){
            System.out.println("Nomor yang Anda input terlalu kecil");
        } else if(answer > number){
            System.out.println("Nomor yang Anda input terlalu besar");
        }
    } while(!success);
    System.out.print("Apakah Anda ingin mengulang permainan (y/Y)?");
    menu = input.nextLine().charAt(0);
} while(menu == 'y' || menu == 'Y');
```

    Tebak angka (1-10) : 2
    Nomor yang Anda input terlalu kecil
    Tebak angka (1-10) : 5
    Nomor yang Anda input terlalu kecil
    Tebak angka (1-10) : 8
    Nomor yang Anda input terlalu besar
    Tebak angka (1-10) : 6
    Yay... tebakan Anda benar... Selamat!!!
    Apakah Anda ingin mengulang permainan (y/Y)?D



```Java
import java.util.Scanner;
import java.util.Random;

Random random = new Random();
Scanner input = new Scanner(System.in);
char menu = 'y';
int count = 1;
do{
    int number = random.nextInt(10) + 1;
    boolean success = false;
    
    do{
        System.out.print("Tebak angka (1-10) : ");
        int answer = input.nextInt();
        input.nextLine();
        if(count == 10){
            System.out.println("Maaf Anda gagal menebak angka sebanyak 10x");
            break;
        } else if(answer == number){
            System.out.println("Yay... tebakan Anda benar... Selamat!!!");
            success = true;
        } else if(answer < number){
            count += 1;
        } else if(answer > number){
            count += 1;
        }
    } while(!success);
    System.out.print("Apakah Anda ingin mengulang permainan (y/Y)?");
    menu = input.nextLine().charAt(0);
} while(menu == 'y' || menu == 'Y');
```

    Tebak angka (1-10) : 1
    Tebak angka (1-10) : 1
    Tebak angka (1-10) : 1
    Tebak angka (1-10) : 1
    Tebak angka (1-10) : 1
    Tebak angka (1-10) : 1
    Tebak angka (1-10) : 1
    Tebak angka (1-10) : 1
    Tebak angka (1-10) : 1
    Tebak angka (1-10) : 1
    Maaf Anda gagal menebak angka sebanyak 10x
    Apakah Anda ingin mengulang permainan (y/Y)?D


***
## Tugas
### Soal 1
Buatlah program yang **sesuai** dengan alur _flowchart_ di bawah ini
![Soal 1](images/Soal-01.png)

Apabila kode program sesuai _flowchart_, maka untuk nilai N = 5 akan menghasilkan output seperti gambar berikut
![Soal 1 A](images/Soal-01.1.png)


```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int N;
System.out.print("Masukkan nilai N : ");
N = sc.nextInt();

for(int i = 1; i<= N; i++){
   for(int j = N; j >= 1; j--) {
       if(i < j){
            System.out.print(" ");
       } else {
         System.out.print("*");  
       }
    }
    System.out.println();
}
```

    Masukkan nilai N : 5
        *
       **
      ***
     ****
    *****


***
### Soal 2
Buatlah program untuk mencetak tampilan persegi angka seperti di bawah ini berdasarkan input dari _keyboard_ N (nilai N minimal 3). Contoh N = 3, dan N = 5
![Soal 2](images/Soal-02.png)


```Java
import java.util.Scanner;

Scanner in = new Scanner(System.in);

System.out.print("Masukkan nilai K : ");
int k = in.nextInt();
int l = k;
for (int a = 1; a <= k; a++) {
    for (int b = 1; b <= l; b++) {
        if (a == 1 || a == k || b == 1 || b == l) System.out.print(k);
        else System.out.print(" ");
    }
    System.out.println();
}
```

    Masukkan nilai K : 5
    55555
    5   5
    5   5
    5   5
    55555


***
### Soal 3
Buatlah program untuk mencetak tampilan piramida * seperti gambar di bawah ini, tinggi piramida berdasarkan input dari _keyboard_ N (nilai N minimal 3). Contoh N = 3, dan N = 5
![Soal 3](images/Soal-03.png)


```Java
import java.util.Scanner;

Scanner in = new Scanner(System.in);
System.out.print("Masukkan jumlah tinggi: ");
int tinggi = in.nextInt();
int k = 0;

for (int i = 1; i <= tinggi; ++i, k = 0) {
  for (int jarak = 1; jarak <= tinggi - i; ++jarak) System.out.print("  ");

  while (k != 2 * i - 1) {
    System.out.print("* ");
    ++k;
  }

  System.out.println();
}
```

    Masukkan jumlah tinggi: 5
            * 
          * * * 
        * * * * * 
      * * * * * * * 
    * * * * * * * * * 

