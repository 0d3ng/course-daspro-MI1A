# JOBSHEET 11. ARRAY 2

## Tujuan
* Mahasiswa mampu memahami pembuatan array dua dimensi
* Mahasiswa mampu menyelesaikan studi kasus dengan memanfaatkan array dua dimensi

## Alat dan Bahan
* PC/Laptop
* Browser
* Koneksi internet
* Anaconda3 + Java kernel (opsional)

## Praktikum

### Percobaan 1: Deklarasi, Inisialisasi, dan Menampilkan Array 2 Dimensi
Pada Percobaan 1, kode program yang dibuat digunakan untuk menyimpan nilai praktikum dari 2 orang mahasiswa pada 3 mata kuliah yang berbeda.
1.	Buat array bertipe **integer** dengan nama **nilai** dengan kapasitas baris 2 elemen (menyatakan jumlah mahasiswa) dan kolom 3 elemen (menyatakan jumlah mata kuliah)
![Gambar 1](images/percobaan1-1.PNG)


```Java
int nilai[][] = new int [2][3]; /* Mendeklarasikan array dengan 2 baris 3 kolom */
```

>Program diats untuk mendeklarasikan array yang berisi 2 baris 3 kolom

2. Isi masing-masing elemen array **nilai** sebagai berikut:
![Gambar 2](images/percobaan1-2.PNG)


```Java
nilai [0][0] = 75;/* mendeklarasikan isi dari koordinar 00 berisi angka 75 */
nilai [0][1] = 90;/* mendeklarasikan isi dari koordinar 01 berisi angka 90 */
nilai [0][2] = 88;/* mendeklarasikan isi dari koordinar 02 berisi angka 88 */
nilai [1][0] = 79;/* mendeklarasikan isi dari koordinar 03 berisi angka 79 */
nilai [1][1] = 82;/* mendeklarasikan isi dari koordinar 04 berisi angka 82 */
nilai [1][2] = 67;/* mendeklarasikan isi dari koordinar 05 berisi angka 67 */
```




    67



>Program diatas digunakan untuk memasukkan data ke dalam array yang dimulai dari indeks [0][0].

3. Tampilkan semua isi elemen array **nilai**
![Gambar 3](images/percobaan1-3.PNG)


```Java
System.out.println(nilai[0][0]+" " + nilai[0][1]+" " +nilai[0][2]); /* Mencetak data dalam array koordinat 00 dan 01 */
System.out.println(nilai[1][0]+" " + nilai[1][1]+" " +nilai[1][2]); /* Mencetak data dalam array koordinat 10 dan 11 */
```

    75 90 88
    79 82 67


>Program diatas digunakan untuk mencetak data yang sudah dimasukkan yang jika data yang dicetak beda baris maka akan dicetak dibawahnya

#### Pertanyaan
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks 0? Jelaskan!

> Pengisian elemen array tidak harus dilakukan secara berurutan mulai dari indeks 0

2. Lakukan modifikasi pada Percobaan 1 Langkah 3 untuk menampilkan semua isi elemen array **nilai** menggunakan perulangan *for*


```Java
for(int i=0; i<nilai.length; i++){ /* Memebuat perulangan jenis for dengan inisialisasi i=0, perulangan tetap berlanjut selama i kurang dari panjang baris Array , dan setiap perulangan i ditambah 1*/
    for(int j=0; j<nilai[0].length ; j++){  /* Memebuat perulangan jenis for dengan inisialisasi j=0, perulangan tetap berlanjut selama j kurang dari panjang kolom Array , dan setiap perulangan j ditambah 1*/
        System.out.print(nilai[i][j] + " "); /* komputer mencetak angka sesuai koordinat [i][j]*/
    }
    System.out.println();/* Ketika array ganti baris maka akan komputer mencetak data array dibawah data sebelumnya */
}
```

    75 90 88 
    79 82 67 


>Program diatas digunakan untuk mencetak data dalam Array menggunakan perulangan bersarang.

### Percobaan 2: Mengisi Elemen Array 2 Dimensi Menggunakan Input Keyboard
Pada Percobaan 2, kode program yang dibuat digunakan untuk menyimpan nilai rating restoran yang terdaftar pada aplikasi pemesanan makanan online. Rating diberikan oleh 4 orang pengguna kepada 2 restoran yang terdaftar.
1. Import dan deklarasikan Scanner dengan nama **sc**
![Gambar 4](images/percobaan2-1.jpg)


```Java
import java.util.Scanner; /* mengimpor class Scanner dari library java */
Scanner sc = new Scanner(System.in); /* Mendeklarasikan sc sebagai inputan */
```

>Program diatas mempunyai fungsi mengimpor class Scanner dari library java

2.	Buat array bertipe **integer** dengan nama **rating** dengan kapasitas baris 4 elemen (menyatakan jumlah pengguna) dan kolom 2 elemen (menyatakan jumlah restoran)
![Gambar 5](images/percobaan2-2.PNG)


```Java
int[][] rating = new int[4][2]; /* Medeklarasikan variabel rating sebagai array 2 dimensi yang punya 4 baris 2 kolom */ 
```

> Medeklarasikan variabel rating sebagai array 2 dimensi yang punya 4 baris 2 kolom.

3. Dengan menggunakan perulangan *for*, buat input untuk mengisi elemen array **rating**
![Gambar 6](images/percobaan2-3.PNG)


```Java
for(int i=0; i<rating.length; i++){ /* Memebuat perulangan jenis for dengan inisialisasi i=0, perulangan tetap berlanjut selama i kurang dari panjang baris Array, dan setiap perulangan i ditambah 1*/
    for(int j=0; j<rating[0].length ; j++){ /* Memebuat perulangan jenis for dengan inisialisasi j=0, perulangan tetap berlanjut selama j kurang dari panjang kolom Array, dan setiap perulangan j ditambah 1*/
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j + " : "); /* Memasukkan data ke dalam array */
        rating [i][j] = sc.nextInt();
    }
    System.out.println(""); /* Mempunyai fungsi untuk berganti baris */
}
```

    Masukkan rating pengguna 0 untuk restoran 0 : 1
    Masukkan rating pengguna 0 untuk restoran 1 : 2
    
    Masukkan rating pengguna 1 untuk restoran 0 : 3
    Masukkan rating pengguna 1 untuk restoran 1 : 4
    
    Masukkan rating pengguna 2 untuk restoran 0 : 5
    Masukkan rating pengguna 2 untuk restoran 1 : 6
    
    Masukkan rating pengguna 3 untuk restoran 0 : 5
    Masukkan rating pengguna 3 untuk restoran 1 : 6
    


>Program diatas untuk memasukkan data ke dalam array menggunakan perulangan for 

4. Dengan menggunakan perulangan *for-each*, tampilkan semua isi elemen dari array **rating**
![Gambar 7](images/percobaan2-4.PNG)


```Java
for(int[] rtg : rating ){ /* Menampilkan isi array secara menyeluruh dengan menggunakan for each */
    for(int r: rtg){ 
        System.out.print(r + " ");
    }
    System.out.println(" ");
}
```

    1 2  
    3 4  
    5 6  
    5 6  


>Program diatas mempunyai fungsi untuk mencetak data array yang telah dimasukkan menggunakan for each bersarang

#### Pertanyaan
1. Pada Percobaan 2 Langkah 3, dapatkah posisi i ditukar dengan posisi i? Jelaskan alasannya!


```Java
// Tuliskan jawaban nomor 1
for(int j=0; j<rating.length; j++){ /* Memebuat perulangan jenis for dengan inisialisasi i=0, perulangan tetap berlanjut selama i kurang dari panjang baris Array, dan setiap perulangan i ditambah 1*/
    for(int i=0; i<rating[0].length ; i++){ /* Memebuat perulangan jenis for dengan inisialisasi j=0, perulangan tetap berlanjut selama j kurang dari panjang kolom Array, dan setiap perulangan j ditambah 1*/
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j + " : "); /* Memasukkan data ke dalam array */
        rating [j][i] = sc.nextInt();
    }
    System.out.println(" "); /* Mempunyai fungsi untuk berganti baris */
}
```

    Masukkan rating pengguna 0 untuk restoran 0 : 1
    Masukkan rating pengguna 1 untuk restoran 0 : 1
     
    Masukkan rating pengguna 0 untuk restoran 1 : 2
    Masukkan rating pengguna 1 untuk restoran 1 : 2
     
    Masukkan rating pengguna 0 untuk restoran 2 : 3
    Masukkan rating pengguna 1 untuk restoran 2 : 2
     
    Masukkan rating pengguna 0 untuk restoran 3 : 3
    Masukkan rating pengguna 1 untuk restoran 3 : 4
     


> posisi i dan j dapat ditukar deangan syarat semua variabel inisialisasi-syarat-perubahan nilai perulangan dan variabel inputan ditukar, jika hanya salah satu variabel ditukar program tidak berjalan

2. Tambahkan kode program untuk menentukan banyaknya baris dan kolom elemen array secara dinamis (baris dan kolom ditentukan saat program berjalan melalui input keyboard)!


```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int baris,kolom;

System.out.print("Masukkan banyak baris Array : ");
baris = sc.nextInt(); /* User dapat menentukan banyak baris dari Array */
System.out.print("Masukkan banyak kolom Array : ");
kolom = sc.nextInt(); /* User dapat menentukan banyak kolom dari Array */

int[][] rating = new int[baris][kolom];/* Mendeklarasikan banyak baris dan kolom diambil dari inputan sebelumnya */
for(int i=0; i<rating.length; i++){ /* Memebuat perulangan jenis for dengan inisialisasi i=0, perulangan tetap berlanjut selama i kurang dari panjang baris Array dan setiap perulangan i ditambah 1*/
    for(int j=0; j<rating[0].length ; j++){ /* Memebuat perulangan jenis for dengan inisialisasi j=0, perulangan tetap berlanjut selama j kurang dari panjang baris Array dan setiap perulangan j ditambah 1*/
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j + " : "); 
        rating [i][j] = sc.nextInt(); /* Memasukkan data ke dalam array */
    }
    System.out.println(""); /* Mempunyai fungsi untuk berganti baris */
}
for(int[] rtg : rating ){  /* Menampilkan isi array secara menyeluruh dengan menggunakan for each */
    for(int r: rtg){
        System.out.print(r + " ");
    }
    System.out.println(" ");
}
```

    Masukkan banyak baris Array : 3
    Masukkan banyak kolom Array : 3
    Masukkan rating pengguna 0 untuk restoran 0 : 1
    Masukkan rating pengguna 0 untuk restoran 1 : 1
    Masukkan rating pengguna 0 untuk restoran 2 : 1
    
    Masukkan rating pengguna 1 untuk restoran 0 : 2
    Masukkan rating pengguna 1 untuk restoran 1 : 2
    Masukkan rating pengguna 1 untuk restoran 2 : 2
    
    Masukkan rating pengguna 2 untuk restoran 0 : 3
    Masukkan rating pengguna 2 untuk restoran 1 : 3
    Masukkan rating pengguna 2 untuk restoran 2 : 3
    
    1 1 1  
    2 2 2  
    3 3 3  


>Program diatas sama dengan sebelumnya tetapi user dapat menentukan sendiri banyak baris dan kolom dari array.

### Percobaan 3: Melakukan Operasi Aritmatika pada Elemen Array 2 Dimensi
Pada Percobaan 3, kode program yang dibuat digunakan untuk menghitung nilai rata-rata harga setiap bahan pokok selama 1 satu semester. Terdapat 3 bahan pokok yang dicatat harganya setiap akhir bulan. Program dibuat berdasarkan flowchart berikut.
![Gambar 8](images/percobaan3.jpg)
1. Import dan deklarasikan Scanner dengan nama **sc**
![Gambar 9](images/percobaan3-1.jpg)


```Java
// Tuliskan kode program Percobaan 3 Langkah 1
import java.util.Scanner; /* mengimpor class Scanner dari library java */
Scanner sc = new Scanner(System.in); /* Mendeklarasikan sc sebagai inputan */
```

>Program diatas mempunyai fungsi mengimpor class Scanner dari library java

2.	Buat array bertipe **integer** dengan nama **harga** dengan kapasitas baris 3 elemen (menyatakan jumlah bahan pokok) dan kolom 6 elemen (menyatakan jumlah bulan). Deklarasikan juga variabel **total** dan **rata** bertipe **double**
![Gambar 10](images/percobaan3-2.PNG)


```Java
// Tuliskan kode program Percobaan 3 Langkah 2
int harga[][] = new int [3][6]; /* Mendeklarasikan array dengan 3 baris 6 kolom */
double total,rata; /* Mendeklarasikan total dan rata sebagai tipe data double */
```

>Program diats untuk mendeklarasikan array yang berisi 3 baris 6 kolom

3. Dengan menggunakan perulangan *for*, buat input untuk mengisi elemen array **harga**. Kemudian, perhitungan total harga dilakukan untuk setiap bulan (kolom) pada setiap bahan pokok (baris). Setelah itu, nilai rata-rata dihitung untuk setiap bahan pokok (tiap satu baris) dan ditampilkan
![Gambar 11](images/percobaan3-3.PNG)


```Java
// Tuliskan kode program Percobaan 3 Langkah 3
for(int i=0; i<harga.length; i++){  /* Memebuat perulangan jenis for dengan inisialisasi i=0, perulangan tetap berlanjut selama i kurang dari panjang baris Array dan setiap perulangan i ditambah 1*/
      total = 0; /* untuk mereset hasil sebelumnya*/
      rata  = 0; /* untuk mereset hasil sebelumnya*/
    for(int j=0; j<harga[0].length; j++){ 
      System.out.print("Masukkan harga ke-["+i+"]["+j+"] "); /* Memebuat perulangan jenis for dengan inisialisasi j=0, perulangan tetap berlanjut selama j kurang dari panjang baris Array dan setiap perulangan j ditambah 1*/
      harga[i][j] = sc.nextInt(); /* Memasukkan data ke dalam array */
        total += harga[i][j]; /*Total diperoleh dari penjumlahan total ditambah data yang telah diinput*/
    }
    rata = total/harga[0].length; /* rata diperoleh dari  total dibagi banyak kolom array*/
     System.out.printf("Rata - rata harga bahan ke-%d adalah %.2f\n",(i+1), rata); /* Mencetak rata rata */
     System.out.println("------------------------------------------");/* Untuk membedakan hasil setiap bahan pokok */
}
```

    Masukkan harga ke-[0][0] 12
    Masukkan harga ke-[0][1] 13
    Masukkan harga ke-[0][2] 22
    Masukkan harga ke-[0][3] 21
    Masukkan harga ke-[0][4] 23
    Masukkan harga ke-[0][5] 23
    Rata - rata harga bahan ke-1 adalah 19.00
    ------------------------------------------
    Masukkan harga ke-[1][0] 22
    Masukkan harga ke-[1][1] 22
    Masukkan harga ke-[1][2] 22
    Masukkan harga ke-[1][3] 22
    Masukkan harga ke-[1][4] 22
    Masukkan harga ke-[1][5] 22
    Rata - rata harga bahan ke-2 adalah 22.00
    ------------------------------------------
    Masukkan harga ke-[2][0] 33
    Masukkan harga ke-[2][1] 33
    Masukkan harga ke-[2][2] 33
    Masukkan harga ke-[2][3] 33
    Masukkan harga ke-[2][4] 33
    Masukkan harga ke-[2][5] 33
    Rata - rata harga bahan ke-3 adalah 33.00
    ------------------------------------------


>Pada program diatas user memasukkan data ke dalam array 6 kali lalu akan di proses menjadi rata rata. dan berulang kembali  selama 3 kali putaran.

## Pertanyaan
1. Jelaskan fungsi dari **rata = total / harga[0].length**!

> fungsi dari sintaks tersebut adalah menghitung rata rata harga, terjemahan dari sintaks tersebut adalah variabel rata rata didapat dari isi variabel total dibagi panjang dari kolom array

2. Mengapa insialisasi variabel **total = 0** dan **rata = 0** berada di dalam perulangan *for* yang pertama? Menurut Anda, apa yang terjadi jika inisialisasi kedua variabel tersebut diletakkan di luar perulangan *for* (setelah deklarasi array)?

>inisialisasi ada di dalam perulangan pertama untuk mereset atau memerintahkan komputer untuk mengubah total dan rata menjadi 0 setelah mengalami sistem perhitungan yang ada di dalam perulangan ke dua. jika variabel total=0 dan rata = 0 diletakkan setelah deklarasi array maka hasil dari sistem perhitungan setiap harga bahan pokok akan tergabung dan tidak akan mendapat rata rata harga setiap harga bahan pokok.

## Tugas

1. Perhatikan flowchart berikut.
![Gambar 12](images/tugas-1.jpg)
Buat kode program sesuai dengan flowchart tersebut untuk mencari suhu tertinggi yang dicatat dari 5 kota di Jepang selama 7 hari berturut-turut!


```Java
// Tuliskan jawaban nomor 1
import java.util.Scanner; /* mengimpor class Scanner dari library java */
Scanner sc = new Scanner(System.in); /* Mendeklarasikan sc sebagai inputan */
double suhu[][] = new double [5][7]; /* Mendeklarasikan array 2 dimensi dengan baris 5 dan kolom 7 */
int x,y; /* Mendeklarasikan variabel x dan y sebagai int */
double max=0; /* Mendklarasikan max sebagai tipe data double */

for(x=0; x<suhu.length; x++){ /* Memebuat perulangan jenis for dengan inisialisasi i=0, perulangan tetap berlanjut selama i kurang dari panjang baris Array dan setiap perulangan i ditambah 1*/
    for(y=0; y<suhu[0].length; y++){ /* Memebuat perulangan jenis for dengan inisialisasi j=0, perulangan tetap berlanjut selama j kurang dari panjang baris Array dan setiap perulangan j ditambah 1*/
      System.out.print("Masukkan suhu ke-["+x+"]["+y+"] ");
      suhu[x][y] = sc.nextDouble(); /* Memasukkan data suhu ke dalam Array*/
      if(suhu[x][y] > max ){ /* jika data suhu kurang lebih dari variabel max maka data suhu menggantikan max*/
          max = suhu[x][y];
      }
    }
    System.out.println("------------------------------------------"); /* Digunakan untuk membedakan data setiap kota */
}
System.out.printf("Suhu tertinggi dari 5 kota di jepang yang diteliti selama 7 hari adalah %.1f derajat celcius",max) /* Output  sehu tertinggi dari 5 kota selama 7 hari */
```

    Masukkan suhu ke-[0][0] 1
    Masukkan suhu ke-[0][1] 1
    Masukkan suhu ke-[0][2] 1
    Masukkan suhu ke-[0][3] 1
    Masukkan suhu ke-[0][4] 1
    Masukkan suhu ke-[0][5] 1
    Masukkan suhu ke-[0][6] 1
    ------------------------------------------
    Masukkan suhu ke-[1][0] 2
    Masukkan suhu ke-[1][1] 2
    Masukkan suhu ke-[1][2] 2
    Masukkan suhu ke-[1][3] 2
    Masukkan suhu ke-[1][4] 2
    Masukkan suhu ke-[1][5] 2
    Masukkan suhu ke-[1][6] 2
    ------------------------------------------
    Masukkan suhu ke-[2][0] 3
    Masukkan suhu ke-[2][1] 3
    Masukkan suhu ke-[2][2] 3
    Masukkan suhu ke-[2][3] 3
    Masukkan suhu ke-[2][4] 3
    Masukkan suhu ke-[2][5] 3
    Masukkan suhu ke-[2][6] 3
    ------------------------------------------
    Masukkan suhu ke-[3][0] 4
    Masukkan suhu ke-[3][1] 4
    Masukkan suhu ke-[3][2] 4
    Masukkan suhu ke-[3][3] 4
    Masukkan suhu ke-[3][4] 4
    Masukkan suhu ke-[3][5] 4
    Masukkan suhu ke-[3][6] 4
    ------------------------------------------
    Masukkan suhu ke-[4][0] 5
    Masukkan suhu ke-[4][1] 5
    Masukkan suhu ke-[4][2] 5
    Masukkan suhu ke-[4][3] 5
    Masukkan suhu ke-[4][4] 5
    Masukkan suhu ke-[4][5] 5
    Masukkan suhu ke-[4][6] 5
    ------------------------------------------
    Suhu tertinggi dari 5 kota di jepang yang diteliti selama 7 hari adalah 5.0 derajat celcius




    java.io.PrintStream@79a5fac



2. Terdapat hasil pencatatan data lima mahasiswa yang berisi informasi mengenai umur, berat badan (kg), dan tinggi badan (cm). Data tersebut disimpan ke dalam array dua dimensi.
![Gambar 13](images/tugas-2.PNG)
*Keterangan: penyimpanan nilai dapat dilakukan melalui inisialisasi menggunakan operator assignment*
 * Tampilkan *berat badan terendah* di antara kelima mahasiswa tersebut
 * Tampilkan *rata-rata tinggi badan* dari kelima mahasiswa tersebut
 * Tampilkan nama mahasiswa dengan *umur tertua* di antara kelima mahasiswa tersebut


```Java
// Tuliskan jawaban nomor 2 
import java.util.Scanner; /* mengimpor class Scanner dari library java */
Scanner sc = new Scanner(System.in);  /* Mendeklarasikan sc sebagai inputan */
int terendah = 100,max=0; /* mendeklarasikan variebel terendah berisi angka 100 sebagai int dan variabel max sebagai int berisi angka 0*/
double total = 0,rata = 0; /* mendeklarasikan total dan rata sebagai tipe data double dan berisi angka 0 */
String nama []= {"Desi", "Rofan", "lala", "Beky", "Ega"}; /* mendeklarasikan array 1 dimensi yang berisi 5 tipe data string */
String old; /* mendeklarasikan variabel old sebagai tipe data string*/


System.out.print("Masukkan banyak siswa  : "); 
int baris = sc.nextInt(); /* User dapat menentukan banyak baris Array */
System.out.print("Masukkan aspek yang di ukur : ");
int kolom = sc.nextInt();  /* User dapat menentukan banyak kolom Array */

int data[][] = new int [baris][kolom]; /* Mendeklarasikan Array dara sebagai int dan  banyak baris dan kolom diambil dari inputan user sebelumnya*/

for(int i=0; i<data.length; i++){ /* Memebuat perulangan jenis for dengan inisialisasi i=0, perulangan tetap berlanjut selama i kurang dari panjang baris Array dan setiap perulangan i ditambah 1*/
    for(int j=0; j<data[0].length; j++){ /* Memebuat perulangan jenis for dengan inisialisasi j=0, perulangan tetap berlanjut selama j kurang dari panjang baris Array dan setiap perulangan j ditambah 1*/
      System.out.print("Masukkan data ke-["+i+"]["+j+"] : "); 
      data[i][j] = sc.nextInt(); /* Memasukkan data ke dalam array */
         if(data[i][j] < terendah && j==1 ){ /* jika data[i][j] kurang dari variabel terendah dan masih di kolom 1 maka isi data[i][j] menggantikan isi data variabel terendah */
          terendah = data[i][j];
          }
         if(j==2){ /* data yang ada di kolom 2 akan di jumlahkan semua */
         total+=data[i][j];
         }
         if(j == 0 && data[i][j] > max){ /* jika isi data[i][j] ada dikolom satu dan melebihi isi variabel max maka isi data[i][j] akan menggantikan variabel max */
             max = data[i][j];
             old = nama[i]; /* nama yang tertua koordinatnya diambil dari data[i][j] yang masuk di pemilihan ini*/
         }
    }
     System.out.println("------------------------------------------"); /* Digunakan untuk membedakan data setiap baris*/  
    }
rata = total/data.length;
System.out.println("Berat badan terendah adalah "+terendah); /* mencetak berat badan terendah */
System.out.printf("Rata - rata tinggi badan kelima mahasiswa tersebut adalah %.1f\n",rata); /* mencetak rata rata tinggi dari kelima mahasiswa tersebut*/
System.out.printf("Umur tertua dari kelima mahasiswa tersebut adalah %d yang bernama %s ",max,old); /* Mencetak nama dari mahasiswa yang memiliki umur tertuan */
```

    Masukkan banyak siswa  : 5
    Masukkan aspek yang di ukur : 3
    Masukkan data ke-[0][0] : 19
    Masukkan data ke-[0][1] : 51
    Masukkan data ke-[0][2] : 155
    ------------------------------------------
    Masukkan data ke-[1][0] : 18
    Masukkan data ke-[1][1] : 55
    Masukkan data ke-[1][2] : 163
    ------------------------------------------
    Masukkan data ke-[2][0] : 18
    Masukkan data ke-[2][1] : 45
    Masukkan data ke-[2][2] : 153
    ------------------------------------------
    Masukkan data ke-[3][0] : 20
    Masukkan data ke-[3][1] : 46
    Masukkan data ke-[3][2] : 158
    ------------------------------------------
    Masukkan data ke-[4][0] : 19
    Masukkan data ke-[4][1] : 58
    Masukkan data ke-[4][2] : 160
    ------------------------------------------
    Berat badan terendah adalah 45
    Rata - rata tinggi badan kelima mahasiswa tersebut adalah 157.8
    Umur tertua dari kelima mahasiswa tersebut adalah 20 yang bernama Beky 




    java.io.PrintStream@76d1835a




```Java

```
