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
int[][] nilai = new int[2][3]; //inisialisasi arrai
```

2. Isi masing-masing elemen array **nilai** sebagai berikut:
![Gambar 2](images/percobaan1-2.PNG)


```Java
// Tuliskan kode program Percobaan 1 Langkah 2
nilai[0][0] = 75;//isi arrai
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
// Tuliskan kode program Percobaan 1 
System.out.println(nilai[0][0] + " " + nilai[0][1] + " " + nilai[0][2]);//menampilkan arrai
System.out.println(nilai[1][0] + " " + nilai[1][1] + " " + nilai[1][2]);
```

    75 90 88
    79 82 67


#### Pertanyaan
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks 0? Jelaskan!


```Java
// Tuliskan jawaban nomor 1
iya karena indeks selalu diawali dari angka 0
```

2. Lakukan modifikasi pada Percobaan 1 Langkah 3 untuk menampilkan semua isi elemen array **nilai** menggunakan perulangan *for*


```Java
// Tuliskan jawaban nomor 2
for (int i=0; i<2; i++){//menampilkan output baris 
    for (int j=0; j<3; j++){//menampilkan output kolom
        System.out.print(nilai[i][j] +" ");// menampilkan  Array
    }
    System.out.println(" ");// menampilkan array
}
```

    75 90 88  
    79 82 67  


### Percobaan 2: Mengisi Elemen Array 2 Dimensi Menggunakan Input Keyboard
Pada Percobaan 2, kode program yang dibuat digunakan untuk menyimpan nilai rating restoran yang terdaftar pada aplikasi pemesanan makanan online. Rating diberikan oleh 4 orang pengguna kepada 2 restoran yang terdaftar.
1. Import dan deklarasikan Scanner dengan nama **sc**
![Gambar 4](images/percobaan2-1.jpg)


```Java
// Tuliskan kode program Percobaan 2 Langkah 1
import java.util.Scanner;//inputan dari keyboard
Scanner sc= new Scanner(System.in);
```

2.	Buat array bertipe **integer** dengan nama **rating** dengan kapasitas baris 4 elemen (menyatakan jumlah pengguna) dan kolom 2 elemen (menyatakan jumlah restoran)
![Gambar 5](images/percobaan2-2.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 2
int[][] rating = new int[4][2];//menampilkan baris dan kolom
```

3. Dengan menggunakan perulangan *for*, buat input untuk mengisi elemen array **rating**
![Gambar 6](images/percobaan2-3.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 3
for (int i = 0; i < rating.length; i++) {//menampilkan baris
    for (int j = 0; j < rating[0].length; j++) {//menampilkan kolom
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j +" : ");//menampilkan hasil output array
        rating[i][j] = sc.nextInt();
    }
    System.out.println("");//menampilkan hasil output array
}
```

    Masukkan rating pengguna 0 untuk restoran 0 : 1
    Masukkan rating pengguna 0 untuk restoran 1 : 2
    
    Masukkan rating pengguna 1 untuk restoran 0 : 3
    Masukkan rating pengguna 1 untuk restoran 1 : 4
    
    Masukkan rating pengguna 2 untuk restoran 0 : 5
    Masukkan rating pengguna 2 untuk restoran 1 : 6
    
    Masukkan rating pengguna 3 untuk restoran 0 : 7
    Masukkan rating pengguna 3 untuk restoran 1 : 7
    


4. Dengan menggunakan perulangan *for-each*, tampilkan semua isi elemen dari array **rating**
![Gambar 7](images/percobaan2-4.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 4
for (int[] rtg : rating) {
    for (int r: rtg) {
        System.out.print(r + " ");//menampilkan output array
    }
    System.out.println("");//menampilkan output array
}
```

    1 2 
    3 4 
    5 6 
    7 7 


#### Pertanyaan
1. Pada Percobaan 2 Langkah 3, dapatkah posisi i ditukar dengan posisi j? Jelaskan alasannya!


```Java
 // Tuliskan jawaban nomor 1
for (int i = 0; i < rating.length; i++) {//menampilkan baris
    for (int j = 0; j < rating[0].length; j++) {//menampilkan kolom
        System.out.print("Masukkan rating pengguna " + j + " untuk restoran " + i +" : ");//menampilkan hasil output array
        rating[i][j] = sc.nextInt();
    }
    System.out.println("");//menampilkan hasil output array
}

```

    Masukkan rating pengguna 0 untuk restoran 0 : 1
    Masukkan rating pengguna 1 untuk restoran 0 : 2
    
    Masukkan rating pengguna 0 untuk restoran 1 : 3
    Masukkan rating pengguna 1 untuk restoran 1 : 4
    
    Masukkan rating pengguna 0 untuk restoran 2 : 5
    Masukkan rating pengguna 1 untuk restoran 2 : 56
    
    Masukkan rating pengguna 0 untuk restoran 3 : 6
    Masukkan rating pengguna 1 untuk restoran 3 : 7
    


2. Tambahkan kode program untuk menentukan banyaknya baris dan kolom elemen array secara dinamis (baris dan kolom ditentukan saat program berjalan melalui input keyboard)!


```Java
// Tuliskan jawaban nomor 2
System.out.print("Masukkan jumlah baris: ");
int baris = sc.nextInt();
System.out.print("Masukkan jumlah kolom: ");
int kolom = sc.nextInt();
int[][] rating = new int[baris][kolom];
```

    Masukkan jumlah baris: 2
    Masukkan jumlah kolom: 4


### Percobaan 3: Melakukan Operasi Aritmatika pada Elemen Array 2 Dimensi
Pada Percobaan 3, kode program yang dibuat digunakan untuk menghitung nilai rata-rata harga setiap bahan pokok selama 1 semester. Terdapat 3 bahan pokok yang dicatat harganya setiap akhir bulan. Program dibuat berdasarkan flowchart berikut.
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
int[][] harga = new int[3][6];//menampilkan kolom dan baris 
double total,rata;//mendeklarasikan variabel total dan rata
```

3. Dengan menggunakan perulangan *for*, buat input untuk mengisi elemen array **harga**. Kemudian, perhitungan total harga dilakukan untuk setiap bulan (kolom) pada setiap bahan pokok (baris). Setelah itu, nilai rata-rata dihitung untuk setiap bahan pokok (tiap satu baris) dan ditampilkan
![Gambar 11](images/percobaan3-3.PNG)


```Java
// Tuliskan kode program Percobaan 3 Langkah 3
for(int i=0; i<harga.length; i++){
    total=0;
    rata=0;
    for(int j=0; j<harga[0].length; j++){
        System.out.printf("Masukkan harga [%d][%d]: ",i,j);
        harga[i][j]=sc.nextInt();
        total += harga[i][j];
    }
    rata = total / harga[0].length;
    System.out.printf("Rata-rata harga bahan ke-%d adalah %.2f\n",i,rata);
}

```

    Masukkan harga [0][0]: 20000
    Masukkan harga [0][1]: 20000
    Masukkan harga [0][2]: 30000
    Masukkan harga [0][3]: 5000
    Masukkan harga [0][4]: 50000
    Masukkan harga [0][5]: 60000
    Rata-rata harga bahan ke-0 adalah 30833.33
    Masukkan harga [1][0]: 70000
    Masukkan harga [1][1]: 70000
    Masukkan harga [1][2]: 90000
    Masukkan harga [1][3]: 80000
    Masukkan harga [1][4]: 20000
    Masukkan harga [1][5]: 70000
    Rata-rata harga bahan ke-1 adalah 66666.67
    Masukkan harga [2][0]: 60000
    Masukkan harga [2][1]: 10000
    Masukkan harga [2][2]: 80000
    Masukkan harga [2][3]: 30000
    Masukkan harga [2][4]: 40000
    Masukkan harga [2][5]: 50000
    Rata-rata harga bahan ke-2 adalah 45000.00


#### Pertanyaan
1. Jelaskan fungsi dari **rata = total / harga[0].length**!


```Java
// Tuliskan jawaban nomor 1
untuk menghitung rata rata dari total/harga
```

2. Mengapa insialisasi variabel **total = 0** dan **rata = 0** berada di dalam perulangan *for* yang pertama? Menurut Anda, apa yang terjadi jika inisialisasi kedua variabel tersebut diletakkan di luar perulangan *for* (setelah deklarasi array)?


```Java
// Tuliskan jawaban nomor 2
agar perulangan looping lagi hingga 6 kali

```

## Tugas

1. Perhatikan flowchart berikut.
![Gambar 12](images/tugas-1.jpg)
Buat kode program sesuai dengan flowchart tersebut untuk mencari suhu tertinggi yang dicatat dari 5 kota di Jepang selama 7 hari berturut-turut!


```Java
 // Tuliskan jawaban nomor 1

import java.util.Scanner;//deklarasi input keyboard

        Scanner sc=new Scanner(System.in);
        double suhu[][]=new double[5][7];
        int x = 0,j;
          double max=0;
        for (double[] suhu1 : suhu) {
            max=0;
            for(int y=0;y<suhu[0].length;y++){
                System.out.printf("Masukkan suhu[%d][%d] :",x,y);
                suhu[x][y]=sc.nextInt();
                if(suhu[x][y]>max){
                  max = suhu[x][y];
                }else{
                }System.out.println("suhu tertinggi di jepang adalah:"+max);
                
            
        
    }
}
```

    Masukkan suhu[0][0] :1
    suhu tertinggi di jepang adalah:1.0
    Masukkan suhu[0][1] :2
    suhu tertinggi di jepang adalah:2.0
    Masukkan suhu[0][2] :3
    suhu tertinggi di jepang adalah:3.0
    Masukkan suhu[0][3] :4
    suhu tertinggi di jepang adalah:4.0
    Masukkan suhu[0][4] :5
    suhu tertinggi di jepang adalah:5.0
    Masukkan suhu[0][5] :3
    suhu tertinggi di jepang adalah:5.0
    Masukkan suhu[0][6] :4
    suhu tertinggi di jepang adalah:5.0
    Masukkan suhu[0][0] :5
    suhu tertinggi di jepang adalah:5.0
    Masukkan suhu[0][1] :6
    suhu tertinggi di jepang adalah:6.0
    Masukkan suhu[0][2] :4
    suhu tertinggi di jepang adalah:6.0
    Masukkan suhu[0][3] :6
    suhu tertinggi di jepang adalah:6.0
    Masukkan suhu[0][4] :4
    suhu tertinggi di jepang adalah:6.0
    Masukkan suhu[0][5] :3
    suhu tertinggi di jepang adalah:6.0
    Masukkan suhu[0][6] :6
    suhu tertinggi di jepang adalah:6.0
    Masukkan suhu[0][0] :7
    suhu tertinggi di jepang adalah:7.0
    Masukkan suhu[0][1] :6
    suhu tertinggi di jepang adalah:7.0
    Masukkan suhu[0][2] :8
    suhu tertinggi di jepang adalah:8.0
    Masukkan suhu[0][3] :6
    suhu tertinggi di jepang adalah:8.0
    Masukkan suhu[0][4] :
    9
    suhu tertinggi di jepang adalah:9.0
    Masukkan suhu[0][5] :7
    suhu tertinggi di jepang adalah:9.0
    Masukkan suhu[0][6] :6
    suhu tertinggi di jepang adalah:9.0
    Masukkan suhu[0][0] :9
    suhu tertinggi di jepang adalah:9.0
    Masukkan suhu[0][1] :9
    suhu tertinggi di jepang adalah:9.0
    Masukkan suhu[0][2] :8
    suhu tertinggi di jepang adalah:9.0
    Masukkan suhu[0][3] :9
    suhu tertinggi di jepang adalah:9.0
    Masukkan suhu[0][4] :8
    suhu tertinggi di jepang adalah:9.0
    Masukkan suhu[0][5] :9
    suhu tertinggi di jepang adalah:9.0
    Masukkan suhu[0][6] :8
    suhu tertinggi di jepang adalah:9.0
    Masukkan suhu[0][0] :

2. Terdapat hasil pencatatan data lima mahasiswa yang berisi informasi mengenai umur, berat badan (kg), dan tinggi badan (cm). Data tersebut disimpan ke dalam array dua dimensi.
![Gambar 13](images/tugas-2.PNG)
*Keterangan: penyimpanan nilai dapat dilakukan melalui inisialisasi menggunakan operator assignment*
 * Tampilkan *berat badan terendah* di antara kelima mahasiswa tersebut
 * Tampilkan *rata-rata tinggi badan* dari kelima mahasiswa tersebut
 * Tampilkan nama mahasiswa dengan *umur tertua* di antara kelima mahasiswa tersebut


```Java
// Tuliskan jawaban nomor 2
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
