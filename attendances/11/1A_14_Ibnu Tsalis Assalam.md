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
System.out.println(nilai[0][0] + " " + nilai[0][1] + " " + nilai[0][2]);
System.out.println(nilai[1][0] + " " + nilai[1][1] + " " + nilai[1][2]);
```

    75 90 88
    79 82 67


#### Pertanyaan
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks 0? Jelaskan!


```Java
// Tuliskan jawaban nomor 1
// Tidak, karena seperti pemasukan data variabel pada umumnya yang bisa diisi secara acak tidak berurutan
```

2. Lakukan modifikasi pada Percobaan 1 Langkah 3 untuk menampilkan semua isi elemen array **nilai** menggunakan perulangan *for*


```Java
// Tuliskan jawaban nomor 2
for(int i = 0; i < 2; i++)
{
    for(int j = 0; j < 3; j++)
    {
        System.out.println(nilai[i][j]);
    }
}
```

    75
    90
    88
    79
    82
    67


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
for(int i = 0; i < rating.length; i++){
    for(int j = 0; j < rating[0].length; j++){
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j + " : ");
        rating[i][j] = sc.nextInt();
    }
    System.out.println("");
}
```

    Masukkan rating pengguna 0 untuk restoran 0 : 4
    Masukkan rating pengguna 0 untuk restoran 1 : 4
    
    Masukkan rating pengguna 1 untuk restoran 0 : 5
    Masukkan rating pengguna 1 untuk restoran 1 : 4
    
    Masukkan rating pengguna 2 untuk restoran 0 : 5
    Masukkan rating pengguna 2 untuk restoran 1 : 4
    
    Masukkan rating pengguna 3 untuk restoran 0 : 4
    Masukkan rating pengguna 3 untuk restoran 1 : 4
    


4. Dengan menggunakan perulangan *for-each*, tampilkan semua isi elemen dari array **rating**
![Gambar 7](images/percobaan2-4.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 4
for(int[] rtg : rating){
    for(int r : rtg){
        System.out.print(r + " ");
    }
    System.out.println("");
}
```

    4 4 
    5 4 
    5 4 
    4 4 


#### Pertanyaan
1. Pada Percobaan 2 Langkah 3, dapatkah posisi i ditukar dengan posisi i? Jelaskan alasannya!


```Java
// Tuliskan jawaban nomor 1
// Tidak, karena i mempresentasikan array pertama (Baris) dan j array kedua (Kolom).
```

2. Tambahkan kode program untuk menentukan banyaknya baris dan kolom elemen array secara dinamis (baris dan kolom ditentukan saat program berjalan melalui input keyboard)!


```Java
// Tuliskan jawaban nomor 2
System.out.print("Masukkan jumlah baris: ");
int baris = sc.nextInt();
System.out.print("Masukkan jumlah kolom: ");
int kolom = sc.nextInt();

int[][] rating = new int[baris][kolom];

for(int i = 0; i < rating.length; i++)
{
    for(int j = 0; j < rating[0].length; j++)
    {
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j + " : ");
        rating[i][j] = sc.nextInt();
    }
    System.out.println("");
}

for(int[] rtg : rating)
{
    for(int r : rtg)
    {
        System.out.print(r + " ");
    }
    System.out.println("");
}
```

    Masukkan jumlah baris: 3
    Masukkan jumlah kolom: 2
    Masukkan rating pengguna 0 untuk restoran 0 : 4
    Masukkan rating pengguna 0 untuk restoran 1 : 5
    
    Masukkan rating pengguna 1 untuk restoran 0 : 5
    Masukkan rating pengguna 1 untuk restoran 1 : 4
    
    Masukkan rating pengguna 2 untuk restoran 0 : 4
    Masukkan rating pengguna 2 untuk restoran 1 : 5
    
    4 5 
    5 4 
    4 5 


### Percobaan 3: Melakukan Operasi Aritmatika pada Elemen Array 2 Dimensi
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
for(int i = 0; i < harga.length; i++){
    total = 0;
    rata = 0;
    for(int j = 0; j < harga[0].length; j++){
        System.out.printf("Masukkan harga [%d] [%d]: ", i, j);
        harga[i][j] = sc.nextInt();
        total += harga[i][j];
    }
    rata = total / harga[0].length;
    System.out.printf("Rata-rata harga bahan ke-%d adalah %.2f\n", i, rata);
}
```

    Masukkan harga [0] [0]: 2500
    Masukkan harga [0] [1]: 3000
    Masukkan harga [0] [2]: 4000
    Masukkan harga [0] [3]: 5000
    Masukkan harga [0] [4]: 4500
    Masukkan harga [0] [5]: 2400
    Rata-rata harga bahan ke-0 adalah 3566.67
    Masukkan harga [1] [0]: 2200
    Masukkan harga [1] [1]: 2222
    Masukkan harga [1] [2]: 2222
    Masukkan harga [1] [3]: 2222
    Masukkan harga [1] [4]: 2222
    Masukkan harga [1] [5]: 1000
    Rata-rata harga bahan ke-1 adalah 2014.67
    Masukkan harga [2] [0]: 2000
    Masukkan harga [2] [1]: 3000
    Masukkan harga [2] [2]: 4000
    Masukkan harga [2] [3]: 5000
    Masukkan harga [2] [4]: 6000
    Masukkan harga [2] [5]: 7000
    Rata-rata harga bahan ke-2 adalah 4500.00


#### Pertanyaan
1. Jelaskan fungsi dari **rata = total / harga[0].length**!


```Java
// Tuliskan jawaban nomor 1
// untuk menghitung rata rata dengan cara membagi total dengan panjang Array (kolom harga)
```

2. Mengapa insialisasi variabel **total = 0** dan **rata = 0** berada di dalam perulangan *for* yang pertama? Menurut Anda, apa yang terjadi jika inisialisasi kedua variabel tersebut diletakkan di luar perulangan *for* (setelah deklarasi array)?


```Java
// Tuliskan jawaban nomor 2
// Agar data direset saat loop yang dimulai dengan data baru yaitu 0; 
// Data dari variabel total dan rata akan mengikuti data pada perulangan sebelumnya (Tidak mengulang dari 0)
```

## Tugas

1. Perhatikan flowchart berikut.
![Gambar 12](images/tugas-1.jpg)
Buat kode program sesuai dengan flowchart tersebut untuk mencari suhu tertinggi yang dicatat dari 5 kota di Jepang selama 7 hari berturut-turut!


```Java
// Tuliskan jawaban nomor 1
double suhu[][] = new double[5][7];
int x, y;
double max = 0;

for(x = 0; x < suhu.length; x++)
{
    for(y = 0; y < suhu[0].length; y++)
    {
        System.out.printf("Masukkan suhu kota ke-%d hari ke-%d: ",(x + 1),(y + 1));
        suhu[x][y] = sc.nextDouble();
        if(suhu[x][y] > max)
        {
            max = suhu[x][y];
        }
    }
}
System.out.print("Suhu max: " + max);
```

    Masukkan suhu kota ke-1 hari ke-1: 35
    Masukkan suhu kota ke-1 hari ke-2: 37
    Masukkan suhu kota ke-1 hari ke-3: 38
    Masukkan suhu kota ke-1 hari ke-4: 36
    Masukkan suhu kota ke-1 hari ke-5: 34
    Masukkan suhu kota ke-1 hari ke-6: 35
    Masukkan suhu kota ke-1 hari ke-7: 35
    Masukkan suhu kota ke-2 hari ke-1: 34
    Masukkan suhu kota ke-2 hari ke-2: 33
    Masukkan suhu kota ke-2 hari ke-3: 33
    Masukkan suhu kota ke-2 hari ke-4: 33
    Masukkan suhu kota ke-2 hari ke-5: 35
    Masukkan suhu kota ke-2 hari ke-6: 35
    Masukkan suhu kota ke-2 hari ke-7: 35
    Masukkan suhu kota ke-3 hari ke-1: 36
    Masukkan suhu kota ke-3 hari ke-2: 37
    Masukkan suhu kota ke-3 hari ke-3: 35
    Masukkan suhu kota ke-3 hari ke-4: 38
    Masukkan suhu kota ke-3 hari ke-5: 35
    Masukkan suhu kota ke-3 hari ke-6: 35
    Masukkan suhu kota ke-3 hari ke-7: 35
    Masukkan suhu kota ke-4 hari ke-1: 35
    Masukkan suhu kota ke-4 hari ke-2: 34
    Masukkan suhu kota ke-4 hari ke-3: 34
    Masukkan suhu kota ke-4 hari ke-4: 34
    Masukkan suhu kota ke-4 hari ke-5: 34
    Masukkan suhu kota ke-4 hari ke-6: 35
    Masukkan suhu kota ke-4 hari ke-7: 35
    Masukkan suhu kota ke-5 hari ke-1: 33
    Masukkan suhu kota ke-5 hari ke-2: 33
    Masukkan suhu kota ke-5 hari ke-3: 33
    Masukkan suhu kota ke-5 hari ke-4: 33
    Masukkan suhu kota ke-5 hari ke-5: 34
    Masukkan suhu kota ke-5 hari ke-6: 33
    Masukkan suhu kota ke-5 hari ke-7: 33
    Suhu max: 38.0


```Java
/*
Program akan akan meminta pengguna untuk memasukkan data suhu disetiap 5 kota selama 7 hari. 
Dengan "x + 1" sebagai hari, dan "y + 1" sebagai kota.
Setelah itu akan menyimpan data suhu terbesar "max" dengan mengidentifikasi setiap data yang dimasukkan.
Jika saat perulangan didapati data suhu yang lebih tinggi maka "max" akan diganti.
*/
```

2. Terdapat hasil pencatatan data lima mahasiswa yang berisi informasi mengenai umur, berat badan (kg), dan tinggi badan (cm). Data tersebut disimpan ke dalam array dua dimensi.
![Gambar 13](images/tugas-2.PNG)
*Keterangan: penyimpanan nilai dapat dilakukan melalui inisialisasi menggunakan operator assignment*
 * Tampilkan *berat badan terendah* di antara kelima mahasiswa tersebut
 * Tampilkan *rata-rata tinggi badan* dari kelima mahasiswa tersebut
 * Tampilkan nama mahasiswa dengan *umur tertua* di antara kelima mahasiswa tersebut


```Java
// Tuliskan jawaban nomor 2
int dSiswa[][] = new int[5][3];
String nSiswa[] = new String[5];
String bSiswa, uSiswa;
int x, y, tTinggi, rTinggi, minBerat, maxUmur, berat = 1000;

for(x = 0; x < nSiswa.length; x++)
{
    System.out.printf("Masukkan nama siswa ke-%d: ", (x + 1));
    nSiswa[x] = sc.nextLine();
}
System.out.println("");

for(x = 0; x < dSiswa.length; x++)
{
    for(y = 0; y < dSiswa[0].length; y++)
    {
        String macamData[] = {"Umur", "Berat", "Tinggi"};
        System.out.printf("Masukkan %s %s: ",macamData[y], nSiswa[x]);
        dSiswa[x][y] = sc.nextInt();
        
        if(dSiswa[x][0] > maxUmur)
        {
            maxUmur = dSiswa[x][0];
            uSiswa = nSiswa[x];
        }
        tTinggi += dSiswa[x][2];
    }
    
    if(berat > dSiswa[x][1])
    {
        bSiswa = nSiswa[x];
        minBerat = dSiswa[x][1];
        berat = dSiswa[x][1];
    }
    System.out.println("");
}
rTinggi = tTinggi / nSiswa.length;
System.out.printf("Siswa dengan berat badan terendah adalah %s dengan berat: %d\n", bSiswa, minBerat);
System.out.printf("Rata-rata tinggi badan siswa adalah %d\n", rTinggi);
System.out.printf("Siswa tertua adalah %s dengan umur: %d", uSiswa, maxUmur);
```

    Masukkan nama siswa ke-1: desi
    Masukkan nama siswa ke-2: rofan
    Masukkan nama siswa ke-3: lala
    Masukkan nama siswa ke-4: beky
    Masukkan nama siswa ke-5: ega
    
    Masukkan Umur desi: 19
    Masukkan Berat desi: 51
    Masukkan Tinggi desi: 155
    
    Masukkan Umur rofan: 18
    Masukkan Berat rofan: 55
    Masukkan Tinggi rofan: 163
    
    Masukkan Umur lala: 18
    Masukkan Berat lala: 45
    Masukkan Tinggi lala: 153
    
    Masukkan Umur beky: 20
    Masukkan Berat beky: 46
    Masukkan Tinggi beky: 158
    
    Masukkan Umur ega: 19
    Masukkan Berat ega: 58
    Masukkan Tinggi ega: 160
    
    Siswa dengan berat badan terendah adalah lala dengan berat: 45
    Rata-rata tinggi badan siswa adalah 157
    Siswa tertua adalah beky dengan umur: 20




    java.io.PrintStream@2d54ee27




```Java
/*
Program akan akan meminta pengguna untuk memasukkan nama 5 siswa.
Kemudian akan diminta data umur, berat, dan tinggi dari setiap nama tadi.
Dalam memasukkan data tersebut, akan dicek umur yang tertua "maxUmur" dari data umur siswa "dSiswa[x][0]". 
Nama siswa tertua juga akan disimpan "uSiswa" dari data "nSiswa[x]"
"x" untuk nama dan "0" untuk data indeks pertama (Umur).
Dihitung total dari data tinggi "dSiswa[x][2]"
"x" untuk nama dan "2" untuk data indeks ketiga (Tinggi).
Selain itu juga akan dicek berat badan terendah "minBerat" dari data berat siswa "dSiswa[x][1]".
Nama siswa dengan berat terendah juga akan disimpan "bSiswa" dari data "nSiswa[x]"
"x" untuk nama dan "1" untuk data indeks kedua (Berat).
Terakhir yaitu menghitung rata rata tinggi, dengan membagi data total tinggi tadi dengan banyaknya siswa.
*/
```
