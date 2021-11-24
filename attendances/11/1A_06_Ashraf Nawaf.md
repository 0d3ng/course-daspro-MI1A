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
// Tuliskan kode program Percobaan 1 Langkah 1
int[][] nilai = new int[2][3];
```

2. Isi masing-masing elemen array **nilai** sebagai berikut:
![Gambar 2](images/percobaan1-2.PNG)


```Java
// Tuliskan kode program Percobaan 1 Langkah 2
nilai[0][0] = 75;
nilai[0][1] = 90;
nilai[0][2] = 88;
nilai[1][0] = 79;
nilai[1][1] = 82;
nilai[1][2] = 67;
```




    67



3. Tampilkan semua isi elemen array **nilai**
![Gambar 3](images/percobaan1-3.PNG)


```Java
// Tuliskan kode program Percobaan 1 Langkah 2
System.out.println(nilai [0][0] + "" + nilai [0][1] + "" + nilai[0][2]);
System.out.println(nilai [1][0] + "" + nilai [1][1] + "" + nilai[1][2]);

```

    759088
    798267


#### Pertanyaan
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks 0? Jelaskan!

Jika input datanya ke dalam array tidak diharuskan berurutan, tetapi jika menggunakan looping harus dimulai dari index 0 sampai index n

2. Lakukan modifikasi pada Percobaan 1 Langkah 3 untuk menampilkan semua isi elemen array **nilai** menggunakan perulangan *for*


```Java
// Tuliskan jawaban nomor 2
for (int i = 0; i < nilai.length; i++)
    for(int j = 0; j < nilai[0].length; j++) {
        System.out.println(nilai[i][j]);
        
    }
System.out.print("panjang baris " +  nilai.length );
System.out.print("panjang kolom " +  nilai[0].length );
```

    75
    90
    88
    79
    82
    67
    panjang baris 2panjang kolom 3

### Percobaan 2: Mengisi Elemen Array 2 Dimensi Menggunakan Input Keyboard
Pada Percobaan 2, kode program yang dibuat digunakan untuk menyimpan nilai rating restoran yang terdaftar pada aplikasi pemesanan makanan online. Rating diberikan oleh 4 orang pengguna kepada 2 restoran yang terdaftar.
1. Import dan deklarasikan Scanner dengan nama **sc**
![Gambar 4](images/percobaan2-1.jpg)


```Java
// Tuliskan kode program Percobaan 2 Langkah 1
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
```

2.	Buat array bertipe **integer** dengan nama **rating** dengan kapasitas baris 4 elemen (menyatakan jumlah pengguna) dan kolom 2 elemen (menyatakan jumlah restoran)
![Gambar 5](images/percobaan2-2.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 2
int[][] rating = new int[4][2];
```

3. Dengan menggunakan perulangan *for*, buat input untuk mengisi elemen array **rating**
![Gambar 6](images/percobaan2-3.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 3
for (int i = 0; i < rating.length; i++) {
    for (int j = 0; j < rating[0].length; j++ ) {
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j + " : ");
    } 
    System.out.println("");
} 
```

    Masukkan rating pengguna 0 untuk restoran 0 : Masukkan rating pengguna 0 untuk restoran 1 : 
    Masukkan rating pengguna 1 untuk restoran 0 : Masukkan rating pengguna 1 untuk restoran 1 : 
    Masukkan rating pengguna 2 untuk restoran 0 : Masukkan rating pengguna 2 untuk restoran 1 : 
    Masukkan rating pengguna 3 untuk restoran 0 : Masukkan rating pengguna 3 untuk restoran 1 : 


4. Dengan menggunakan perulangan *for-each*, tampilkan semua isi elemen dari array **rating**
![Gambar 7](images/percobaan2-4.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 4
for (int[] rtg : rating) {
    for (int r: rtg) {
        System.out.print(r + "");
    }
    System.out.println("");
} 
```

    00
    00
    00
    00


Pertanyaan
1. Pada Percobaan 2 Langkah 3, dapatkah posisi i ditukar dengan posisi j? Jelaskan alasannya!

Tidak bisa karena i adalah baris dan j adalah kolom, dalam array harus meng input baris dulu setelah itu kolom

2. Tambahkan kode program untuk menentukan banyaknya baris dan kolom elemen array secara dinamis (baris dan kolom ditentukan saat program berjalan melalui input keyboard)!


```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner;
Scanner sc = new Scanner(System.in); 

System.out.print("Masukkan panjang baris Array: ");
int x = sc.nextInt();
System.out.print("Masukkan panjang kolom Array: ");
int y = sc.nextInt();
int[][] rating = new int[x][y];

for (int i=0; i<rating.length; i++){ 
    for (int j=0; j<rating[0].length; j++){ 
        System.out.print("Masukkan rating pengguna "+ i + " untuk restoran " + j + " : "); 
        rating[i][j] = sc.nextInt(); 
    }
    System.out.println("");
} 
```

    Masukkan panjang baris Array: 3
    Masukkan panjang kolom Array: 2
    Masukkan rating pengguna 0 untuk restoran 0 : 70
    Masukkan rating pengguna 0 untuk restoran 1 : 80
    
    Masukkan rating pengguna 1 untuk restoran 0 : 90
    Masukkan rating pengguna 1 untuk restoran 1 : 90
    
    Masukkan rating pengguna 2 untuk restoran 0 : 30
    Masukkan rating pengguna 2 untuk restoran 1 : 20
    


 Percobaan 3: Melakukan Operasi Aritmatika pada Elemen Array 2 Dimensi
Pada Percobaan 3, kode program yang dibuat digunakan untuk menghitung nilai rata-rata harga setiap bahan pokok selama 1 satu semester. Terdapat 3 bahan pokok yang dicatat harganya setiap akhir bulan. Program dibuat berdasarkan flowchart berikut.
![Gambar 8](images/percobaan3.jpg)
1. Import dan deklarasikan Scanner dengan nama **sc**
![Gambar 9](images/percobaan3-1.jpg)


```Java
// Tuliskan kode program Percobaan 3 Langkah 1
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
```

2.	Buat array bertipe **integer** dengan nama **harga** dengan kapasitas baris 3 elemen (menyatakan jumlah bahan pokok) dan kolom 6 elemen (menyatakan jumlah bulan). Deklarasikan juga variabel **total** dan **rata** bertipe **double**
![Gambar 10](images/percobaan3-2.PNG)


```Java
// Tuliskan kode program Percobaan 3 Langkah 2
int[][] harga = new int[3][6];
double total, rata;
```

3. Dengan menggunakan perulangan *for*, buat input untuk mengisi elemen array **harga**. Kemudian, perhitungan total harga dilakukan untuk setiap bulan (kolom) pada setiap bahan pokok (baris). Setelah itu, nilai rata-rata dihitung untuk setiap bahan pokok (tiap satu baris) dan ditampilkan
![Gambar 11](images/percobaan3-3.PNG)


```Java
// Tuliskan kode program Percobaan 3 Langkah 3
for (int i = 0; i < harga.length; i++){
    total = 0;
    rata = 0;
    for (int j = 0; j < harga[0].length; j++){
        System.out.printf("Masukkan harga [%d][%d]: ", i, j);
        harga[i][j] = sc.nextInt();
        total += harga[i][j];
    }
    rata = total / harga[0].length;
    System.out.printf("Rata-rata harga bahan ke-%d adalah %.2f\n", i, rata);
} 
```

    Masukkan harga [0][0]: 1000
    Masukkan harga [0][1]: 4000
    Masukkan harga [0][2]: 5000
    Masukkan harga [0][3]: 7000
    Masukkan harga [0][4]: 8000
    Masukkan harga [0][5]: 3000
    Rata-rata harga bahan ke-0 adalah 4666.67
    Masukkan harga [1][0]: 5000
    Masukkan harga [1][1]: 6000
    Masukkan harga [1][2]: 7000
    Masukkan harga [1][3]: 8000
    Masukkan harga [1][4]: 2000
    Masukkan harga [1][5]: 3000
    Rata-rata harga bahan ke-1 adalah 5166.67
    Masukkan harga [2][0]: 2000
    Masukkan harga [2][1]: 1000
    Masukkan harga [2][2]: 7000
    Masukkan harga [2][3]: 9000
    Masukkan harga [2][4]: 2000
    Masukkan harga [2][5]: 1000
    Rata-rata harga bahan ke-2 adalah 3666.67


#### Pertanyaan
1. Jelaskan fungsi dari **rata = total / harga[0].length**!

fungsi dari rata = total / harga[0].length adalah untuk menghitung rata rata dari total harga yang sudah di input mulai dari baris 0 kolom 0

2. Mengapa insialisasi variabel **total = 0** dan **rata = 0** berada di dalam perulangan *for* yang pertama? Menurut Anda, apa yang terjadi jika inisialisasi kedua variabel tersebut diletakkan di luar perulangan *for* (setelah deklarasi array)?

inisialisasi ada di dalam perulangan pertama untuk mereset atau memerintahkan komputer untuk mengubah total dan rata menjadi 0 setelah mengalami sistem perhitungan yang ada di dalam perulangan ke dua. jika variabel total=0 dan rata = 0 diletakkan setelah deklarasi array maka hasil dari sistem perhitungan setiap harga bahan pokok akan tergabung dan tidak akan mendapat rata rata harga setiap harga bahan pokok.

## Tugas

1. Perhatikan flowchart berikut.
![Gambar 12](images/tugas-1.jpg)
Buat kode program sesuai dengan flowchart tersebut untuk mencari suhu tertinggi yang dicatat dari 5 kota di Jepang selama 7 hari berturut-turut!


```Java
// Tuliskan jawaban nomor 1
int[][] dataMhs = {
    {19, 51, 155},
    {18, 55, 163},
    {18, 45, 153},
    {20, 46, 158},
    {19, 58, 160}
};

int i,j;
int minbb=100;
for(i=0; i<dataMhs.length; i++){
    for(j=0; j<dataMhs[1].length; j++){
        if(dataMhs[i][1] < minbb){
            minbb = dataMhs[i][1];
        }
    }
}
System.out.print("Berat badan terendah dari kelima mahasiswa tersebut yaitu " + minbb);

double totaltb = 0;
double ratatb = 0;
for(i=0; i<dataMhs.length; i++){
    for(j=0; j<dataMhs[0].length; j++){
    if(j == 2)
        totaltb += dataMhs[i][j];
    }
}
ratatb = totaltb / dataMhs.length;
System.out.printf('\n' + "Total tinggi badan = " + totaltb);
System.out.print('\n'+ "Rerata tinggi badan dari kelima mahasiswa tersebut yaitu " + ratatb);

String[] nama = {"Desi", "Rofan", "Lala", "Beky", "Ega"};

int indeks;
int tua=0;
for(i=0; i<dataMhs.length; i++){
    for(j=0; j<dataMhs[0].length; j++){
        if(dataMhs[i][0] > tua){
            tua = dataMhs[i][0];
            indeks = i;
        }
    }
}
System.out.print('\n'+"Umur tertua dari kelima mahasiswa tersebut yaitu " +tua +" bernama " + nama[indeks]);
```

    Berat badan terendah dari kelima mahasiswa tersebut yaitu 45
    Total tinggi badan = 789.0
    Rerata tinggi badan dari kelima mahasiswa tersebut yaitu 157.8
    Umur tertua dari kelima mahasiswa tersebut yaitu 20 bernama Beky

2. Terdapat hasil pencatatan data lima mahasiswa yang berisi informasi mengenai umur, berat badan (kg), dan tinggi badan (cm). Data tersebut disimpan ke dalam array dua dimensi.
![Gambar 13](images/tugas-2.PNG)
*Keterangan: penyimpanan nilai dapat dilakukan melalui inisialisasi menggunakan operator assignment*
 * Tampilkan *berat badan terendah* di antara kelima mahasiswa tersebut
 * Tampilkan *rata-rata tinggi badan* dari kelima mahasiswa tersebut
 * Tampilkan nama mahasiswa dengan *umur tertua* di antara kelima mahasiswa tersebut


```Java
import java.util.Scanner; 
Scanner sc = new Scanner(System.in);  
int terendah = 100,max=0; 
double total = 0,rata = 0; 
String nama []= {"Desi", "Rofan", "lala", "Beky", "Ega"}; 
String old;


System.out.print("Masukkan banyak siswa  : "); 
int baris = sc.nextInt(); 
System.out.print("Masukkan aspek yang di ukur : ");
int kolom = sc.nextInt();  

int data[][] = new int [baris][kolom]; 

for(int i=0; i<data.length; i++){ 
    for(int j=0; j<data[0].length; j++){ 
      System.out.print("Masukkan data ke-["+i+"]["+j+"] : "); 
      data[i][j] = sc.nextInt(); 
         if(data[i][j] < terendah && j==1 ){ 
          terendah = data[i][j];
          }
         if(j==2){ 
         total+=data[i][j];
         }
         if(j == 0 && data[i][j] > max){ 
             max = data[i][j];
             old = nama[i]; 
         }
    }
     System.out.println("------------------------------------------");  
    }
rata = total/data.length;
System.out.println("Berat badan terendah adalah "+terendah); 
System.out.printf("Rata - rata tinggi badan kelima mahasiswa tersebut adalah %.1f\n",rata); 
System.out.printf("Umur tertua dari kelima mahasiswa tersebut adalah %d yang bernama %s ",max,old); 
```

    Masukkan banyak siswa  : 2
    Masukkan aspek yang di ukur : 2
    Masukkan data ke-[0][0] : 10
    Masukkan data ke-[0][1] : 10
    ------------------------------------------
    Masukkan data ke-[1][0] : 20
    Masukkan data ke-[1][1] : 40
    ------------------------------------------
    Berat badan terendah adalah 10
    Rata - rata tinggi badan kelima mahasiswa tersebut adalah 0.0
    Umur tertua dari kelima mahasiswa tersebut adalah 20 yang bernama Rofan 




    java.io.PrintStream@584581cc


