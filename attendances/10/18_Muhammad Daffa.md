# JOBSHEET 10 - Array 1

## Tujuan
+ Mahasiswa mampu memahami pembuatan Array 1 dimensi dan pengaksesan elemenya di Java. 
+ Mahasiswa mampu membuat program dengan menggunakan konsep array satu dimensi.


## Alat dan Bahan
+ PC/laptop
+ Browser(chrome, firefox, safari)
+ Koneksi internet
+ Anaconda3 + Java kernel (opsional)

## Praktikum
### Percobaan 1: Mengisi Elemen Array
1. Pada percobaan ke-1 akan dilakukan percobaan untuk mengisi elemen array. Buat array bertipe integer dengan nama bil dengan kapasitas 4 elemen.
![Gambar 0](images/P1L2.png)


```Java
// Tulis Kode program Percobaan 1 Langkah 2 di atas
int[] bil=new int[4];
```

2. Isi masing-masing elemen array bil tadi dengan angka 5, 12, 7, 20.
![Gambar 0](images/P1L3.png)


```Java
// Tulis Kode program Percobaan 1 Langkah 3 di atas
bil[0] = 5;
bil[1] = 12;
bil[2] = 7;
bil[3] = 20;
```




    20



3. Tampilkan ke layar semua isi elemennya:
![Gambar 4](images/P1L4.png)


```Java
// Tulis Kode program Percobaan 1 Langkah 4
System.out.println(bil[0]);
System.out.println(bil[1]);
System.out.println(bil[2]);
System.out.println(bil[3]);

```

    5
    12
    7
    20


#### Pertanyaan 
1. Dari percobaan 1 berapakah indeks array terbesar dan terkecil?


```Java
// Tulis Jawaban no 1 disini
// indeks array terbesar pada percobaan ke 1 adalah 0 dan indeks array terbesar pada percobaan ke 1 adalah 3
```

2. Jika Isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?


```Java
// Tulis Jawaban no 2 yang disini
int[] bil=new int[4];

bil[0] = 5.0;
bil[1] = 12867;
bil[2] = 7.5;
bil[3] = 2000000;

System.out.println(bil[0]);
System.out.println(bil[1]);
System.out.println(bil[2]);
System.out.println(bil[3]);

// tidak bisa karena tipe datanya masih (int) dan harus diubah ke (double) jika ingin program bisa berjalan
```


    |   bil[0] = 5.0;

    incompatible types: possible lossy conversion from double to int

    


3. Ubah statement pada langkah No 3 menjadi seperti berikut
![Gambar pertanyaan 3](images/P1T3.png)
Apa keluaran dari program? Mengapa bisa demikian?


```Java
// Tulis Jawaban no 3 yang disini
int[] bil=new int[4];

bil[0] = 5;
bil[1] = 12;
bil[2] = 7;
bil[3] = 20;

for(int i=0; i<4; i++){
    System.out.println(bil[i]);
}

// keluaran dari program sama dari sebelumnya. Karena pengulangan bisa dilakukan pada array
```

    5
    12
    7
    20


### Percobaan 2: Meminta Inputan Pengguna untuk Mengisi Elemen Array
1. Pada percobaan ke-2 akan dilakukan percobaan yang meminta inputan pengguna untuk mengisi elemen array seperti pada flowchart berikut
![Gambar Flowchart](images/FCpercobaan2.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 1 di atas
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

int[] nilaiUAS = new int[6];

for(int i = 0; i < 6; i++){
    System.out.print("Masukkan nilai UAS ke-" + i + ":  ");
    nilaiUAS[i] = sc.nextInt();
} 
for(int i = 0; i < 6; i++){
    System.out.println("Nilai UAS ke-" + i + " adalah: " + nilaiUAS[i]);
}







```

    Masukkan nilai UAS ke-0:  100
    Masukkan nilai UAS ke-1:  96
    Masukkan nilai UAS ke-2:  97
    Masukkan nilai UAS ke-3:  98
    Masukkan nilai UAS ke-4:  99
    Masukkan nilai UAS ke-5:  80
    Nilai UAS ke-0 adalah: 100
    Nilai UAS ke-1 adalah: 96
    Nilai UAS ke-2 adalah: 97
    Nilai UAS ke-3 adalah: 98
    Nilai UAS ke-4 adalah: 99
    Nilai UAS ke-5 adalah: 80


2. Import dan deklarasikan Scanner untuk keperluan input. 
![Gambar import scanner](images/P2L2.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 1 di atas
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
```

3. Buat array bertipe integer dengan nama nilaiUAS, dengan kapasitas 6 elemen.
![Gambar deklarasi array](images/P2L3.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 3 di atas
int[] nilaiUAS = new int[6];
```

4. Menggunakan perulangan, buat input untuk mengisi elemen dari array nilaiUAS.
![Gambar perulangan input](images/P2L4.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 4 di atas
for(int i = 0; i < 6; i++){
    System.out.print("Masukkan nilai UAS ke-" + i + ":  ");
    nilaiUAS[i] = sc.nextInt();
} 
```

    Masukkan nilai UAS ke-0:  100
    Masukkan nilai UAS ke-1:  98
    Masukkan nilai UAS ke-2:  97
    Masukkan nilai UAS ke-3:  90
    Masukkan nilai UAS ke-4:  87
    Masukkan nilai UAS ke-5:  78


5. Menggunakan perulangan, tampilkan semua isi elemen dari array nilaiUAS.
![Gambar perulangan print](images/P2L5.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 5 di atas
for(int i = 0; i < 6; i++){
    System.out.println("Nilai UAS ke-" + i + " adalah: " + nilaiUAS[i]);
}
```

    Nilai UAS ke-0 adalah: 100
    Nilai UAS ke-1 adalah: 98
    Nilai UAS ke-2 adalah: 97
    Nilai UAS ke-3 adalah: 90
    Nilai UAS ke-4 adalah: 87
    Nilai UAS ke-5 adalah: 78


#### Pertanyaan
1. Ubah statement pada langkah No 4 menjadi seperti berikut ini :
![Gambar pertanyaan1](images/P2T1.png)
Jalankan program, apakah terjadi perubahan? Mengapa demikian?



```Java
// Tulis Jawaban nomor 1 disini
for(int i = 0; i < nilaiUAS.length; i++){
    System.out.print("Masukkan nilai UAS ke-" + i + ": ");
    nilaiUAS[i] = sc.nextInt();
}
// tidak terjadi perubahan karena kode program diatas serupa dengan kode yang ada di langkah ke 4 karena hanya menambahkan length
```

    Masukkan nilai UAS ke-0: 100
    Masukkan nilai UAS ke-1: 98
    Masukkan nilai UAS ke-2: 60
    Masukkan nilai UAS ke-3: 68
    Masukkan nilai UAS ke-4: 78
    Masukkan nilai UAS ke-5: 85


2. Apa kegunaan dari `nilaiUAS.length`? 


```Java
// Tulis Jawaban nomor 2 disini
// nilaiUAS.length berguna untuk menghitung panjang array
```

3. Ubah statement pada langkah No 5 menjadi seperti berikut ini sehingga program hanya menampilkan status mahasiswa yang lulus saja:
![Gambar pertanyaan1](images/P2T3.png)
Jalankan program dan Jelaskan alur program!


```Java
// Tulis Jawaban nomor 3 disini
for(int i = 0; i < nilaiUAS.length; i++){ // perulangan for untuk nilai UAS
    if(nilaiUAS[i] > 70){ // jika nilai UAS diatas 70 Mahasiswa akan lulus, jika dibawah akan gagal
        System.out.println("Mahasiswa ke-" + i +" lulus"); // untuk menampilkan mahasiswa yang lulus atau nilainya diatas 70
    }
}
```

    Mahasiswa ke-0 lulus
    Mahasiswa ke-1 lulus
    Mahasiswa ke-4 lulus
    Mahasiswa ke-5 lulus


### Percobaan 3: Melakukan Operasi Aritmatika terhadap Elemen Array
Pada praktikum ini, akan dilakukan percobaan untuk menjumlahkan Array. Program akan menerima input sebanyak 10 nilai mahasiswa. Kemudian program akan menampilkan nilai rata-rata nilai dari 10 Mahasiswa. Seperti flowchart berikut
![Gambar flowchart](images/FCpercobaan3.png)

1.Import dan deklarasikan Scanner untuk keperluan input. 
![Gambar deklarasi scanner](images/P3L1.png)


```Java
// Tulis Kode program Percobaan 3 Langkah 1 di atas, disini
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
```

2. Buat array nilaiMHS bertipe integer dengan kapasitas 10. Kemudian deklarasikan variable total dan rata seperti gambar berikut ini
![Gambar deklarasi variabel](images/P3L2.png)



```Java
// Tulis Kode program Percobaan 3 Langkah 2 di atas, disini
int nilaiMHS[] = new int[10];
double total;
double rata;
```

3. Menggunakan perulangan, buat input untuk mengisi array nilaiMHS
![Gambar perulangan input](images/P3L3.png)



```Java
// Tulis Kode program Percobaan 3 Langkah 3 di atas, disini
for(int i = 0; i<nilaiMHS.length; i++){
    System.out.print("Masukkan nilai Mahasiswa ke-"+(i+1)+":");
    nilaiMHS[i] = sc.nextInt();
}
```

    Masukkan nilai Mahasiswa ke-1:90
    Masukkan nilai Mahasiswa ke-2:100
    Masukkan nilai Mahasiswa ke-3:98
    Masukkan nilai Mahasiswa ke-4:99
    Masukkan nilai Mahasiswa ke-5:87
    Masukkan nilai Mahasiswa ke-6:90
    Masukkan nilai Mahasiswa ke-7:91
    Masukkan nilai Mahasiswa ke-8:84
    Masukkan nilai Mahasiswa ke-9:83
    Masukkan nilai Mahasiswa ke-10:97


4. Menggunakan perulangan untuk menghitung jumlah keseluruhan nilai.
![Gambar perulangan jumlah](images/P3L4.png)



```Java
// Tulis Kode program Percobaan 3 Langkah 4 di atas, disini
for(int i = 0; i<nilaiMHS.length; i++){
    total+=nilaiMHS[i];
}
```

5. Kemudian hitung nilai rata-rata dengan cara nilai total dibagi jumlah elemen dari array nilaiMHS\
![Gambar hitung rata2](images/P3L5.png)



```Java
// Tulis Kode program Percobaan 3 Langkah 3 di atas, disini
rata= total/nilaiMHS.length;
System.out.println("Rata-rata nilai mahasiswa adalah "+rata);
```

    Rata-rata nilai mahasiswa adalah 91.9


#### Pertanyaan 
1. Pada Percobaan 3 langkah ke-5. Mengapa perhitungan rata berada diluar perulangan?


```Java
// Tulis jawaban no 1 disini
// karena untuk menghitung nilai akhir dari variabel yang ditambahkan setelah proses perulangan
```

2. Modifikasi program pada percobaan 3 sehingga bisa mengeluarkan output  seperti gambar berikut ini!
syarat lulus nilai >70
![Gambar pertanyaan 2](images/P3T2.png)


```Java
// Tulis jawaban no 2 disini
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

double totalLulus, totalGagal, rataLulus, rataGagal;
int nilaiMHS[] = new int[10];
int a = 0, b = 0;

for(int i = 0;i < nilaiMHS.length; i++){
    System.out.printf("Masukkan nilai mahasiswa ke -%2d: ",(i+1));
    nilaiMHS[i] = sc.nextInt();
}
for(int i = 0;i < nilaiMHS.length; i++){
    if(nilaiMHS[i] > 70){
        totalLulus += nilaiMHS[i];
        a++;
    } else{
        totalGagal += nilaiMHS[i];
        b++;
    }
}
rataLulus = totalLulus / (nilaiMHS.length - a);
rataGagal = totalGagal / (nilaiMHS.length - b);
System.out.printf("Rata-rata nilai mahasiswa yang lulus adalah %.2f\n", rataLulus);
System.out.printf("Rata-rata nilai mahasiswa yang gagal adalah %.2f\n", rataGagal);



```

    Masukkan nilai mahasiswa ke - 1: 100
    Masukkan nilai mahasiswa ke - 2: 95
    Masukkan nilai mahasiswa ke - 3: 90
    Masukkan nilai mahasiswa ke - 4: 85
    Masukkan nilai mahasiswa ke - 5: 60
    Masukkan nilai mahasiswa ke - 6: 65
    Masukkan nilai mahasiswa ke - 7: 55
    Masukkan nilai mahasiswa ke - 8: 50
    Masukkan nilai mahasiswa ke - 9: 89
    Masukkan nilai mahasiswa ke -10: 69
    Rata-rata nilai mahasiswa yang lulus adalah 91.80
    Rata-rata nilai mahasiswa yang gagal adalah 59.80





    java.io.PrintStream@2991f77e




```Java
### Percobaan 4: Pencarian menggunakan Array
Pada praktikum ini, akan dilakukan percobaan untuk mencari lokasi/indeks sebuah angka dalam array. Sesuai dengan flowchart di bawah ini:
![Gambar flowchart searching](images/FCpercobaan4.png) 
```

1. Buat array arr[] bertipe integer dengan kapasitas 6 dan isi dengan nilai 6, 4, 1, 9, 7, 3, 2 dan 8. Kemudian deklarasikan variabel integer `key` untuk kata kunci pencarian dan variabel `hasil` untuk hasil indeks pencarian. Deklarasi dan inisialisasi seperti gambar berikut ini
![Gambar deklarasi variabel](images/P4L2.png)



```Java
// Tulis Kode program Percobaan 4 Langkah 1 di atas, disini
int[] arr = {6,4,1,9,7,3,2,8};
int key = 3;
int hasil = -1;
```

2. Menggunakan perulangan, lakukan pencarian untuk mendapatkan nilai array yang sesuai dengan key. Bila ada yang sesuai, simpan indeksnya sebagai hasil pencarian
![Gambar perulangan search](images/p4L3.png)



```Java
// Tulis Kode program Percobaan 4 Langkah 2 di atas, disini
for(int i=0; i<arr.length; i++){
    if(key==arr[i]){
        hasil=i;
        break;
    }
}
```

3. Tampilkan hasil pencarian dengan kode berikut.
![Gambar perulangan jumlah](images/P4L4.png)



```Java
// Tulis Kode program Percobaan 4 Langkah 3 di atas, disini
System.out.println("Key ada di array ke-"+hasil);
```

    Key ada di array ke-5


#### Pertanyaan 
1. Pada Percobaan 4 langkah ke-2. Apa kegunaan dari statement `break`?


```Java
// Tulis jawaban no 1 disini
// statement break pada percobaan ke 4 berguna untuk menghentikan perulangan jika angka yang kita cari sudah ketemu
```

2. Modifikasi program pada percobaan 4 sehingga key yang dicari adalah angka 5. Kemudian jalankan program, amati hasilnya! Jelaskan penyebab dari hasil tersebut! 


```Java
// Tulis jawaban no 2 disini
int[] arr = {6,4,1,9,7,3,2,8};
int key = 5;
int hasil = -1;

for(int i=0; i<arr.length; i++){
    if(key==arr[i]){
        hasil=i;
        break;
    }
}
System.out.println("Key ada di array ke-"+hasil);

// hasilnya adalah key ada di array ke--1. Penyebabnya adalah tidak ada (5) di indeks jadi hasilnya akan mencari di luar indeks
```

    Key ada di array ke--1


### Percobaan 5: Pengurutan bilangan menggunakan Array
Pada praktikum ini, akan dilakukan percobaan untuk mengurutkan angka dalam array. Sesuai dengan flowchart di bawah ini:
![Gambar flowchart sorting](images/FCpercobaan5.png)
1.Buat array arr[] bertipe integer dengan kapasitas 8 dan isi dengan nilai 16, 4, 10, 90, 27, 3, 12 dan 28. Kemudian deklarasikan variabel integer `temp` untuk media penukaran nilai pada variabel. Deklarasi dan inisialisasi seperti gambar berikut ini
![Gambar deklarasi dan inisialisasi](images/P5L1.png)


```Java
// Tulis Kode program Percobaan 5 Langkah 1 disini
int [] arr = {16, 4, 10, 90, 27, 3, 12, 28};
int temp = 0
```


```Java
// Tulis Kode program Percobaan 5 Langkah 2 di atas, disini
for(int i = 0; i < arr.length; i++){
    for(int j = 1; j < (arr.length-i); j++){
        if(arr[j-1] > arr[j]){
            temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
        }
    }
}
```

2. Menggunakan perulangan, lakukan pengurutan bilangan dengan menukar posisi indeks tersebut dengan indeks berikutnya. Perulangan dilakukan untuk menukar posisi berulang kali. 
![Gambar sorting](images/P5L2.png)

3. Tampilkan hasil pengurutan dengan menggunakan perulangan
![Gambar print](images/P5L3.png)


```Java
// Tulis Kode program Percobaan 5 Langkah 3 di atas, disini
System.out.println("hasil pengurutan: ");
for(int i = 0; i < arr.length; i++)
    System.out.println(arr[i]);
```

    hasil pengurutan: 
    3
    4
    10
    12
    16
    27
    28
    90


## Tugas
### Soal 1
Buatlah program yang **sesuai** dengan alur _flowchart_ di bawah ini
![Soal 1](images/soal1.png)

Flowchart diatas menggambarkan alur program yang membaca 10 masukan pengguna berupa integer dan menyimpannya. Kemudian angka ganjil dan genap disimpan kembali ke dalam variabel lain yang terpisah


```Java
/* Jawaban Soal 1 disini */
import java.util.Scanner;

Scanner in = new Scanner(System.in);
int checkNum[] = new int[10];
int evenNum[] = new int[10];
int oddNum[] = new int[10];
int cEven, cOdd = 0;

for(int i = 0; i < checkNum.length; i++) {
    System.out.print("Masukkan Bilangan: ");
    checkNum[i] = in.nextInt();
}
for(int j = 0; j < checkNum.length; j++) {
    if(checkNum[j] % 2 == 0) {
        evenNum[cEven] = checkNum[j];
        cEven++;
    } else {
        oddNum[cOdd] = checkNum[j];
        cOdd++;
    }
}

// Debug
System.out.println("\nGenap:");
for(int v: evenNum) System.out.print(v + " ");
System.out.println("\nGanjil:");
for(int v: oddNum) System.out.print(v + " "); 
    

```

    Masukkan Bilangan: 1
    Masukkan Bilangan: 2
    Masukkan Bilangan: 3
    Masukkan Bilangan: 4
    Masukkan Bilangan: 5
    Masukkan Bilangan: 6
    Masukkan Bilangan: 7
    Masukkan Bilangan: 8
    Masukkan Bilangan: 9
    Masukkan Bilangan: 10
    
    Genap:
    2 4 6 8 10 0 0 0 0 0 
    Ganjil:
    1 3 5 7 9 0 0 0 0 0 

### Soal 2
Buatlah program yang terdapat array dengan jumlah elemen 5, buatlah input untuk mengisi elemen array tersebut, kemudian tampilkan isi array tersebut dengan urutan terbalik. Seperti ilustrasi gambar dibawah ini.
![Soal 2](images/T2.png)


```Java
//* Jawaban Soal 2 disini */
import java.util.Scanner;
Scanner in = new Scanner(System.in);
System.out.println("Masukkan panjang array");
int panjangArray = in.nextInt();
int[] a = new int[panjangArray];
System.out.println("Masukkan bilangan 1-5");
for (int i=0; i < a.length; i++){
    a[i]=in.nextInt();
    }
System.out.println("Kebalikan");
for (int i=a.length-1; i >= 0; i--){
    System.out.println(a[i]);
}




```

    Masukkan panjang array
    5
    Masukkan bilangan 1-5
    5
    2
    7
    9
    6
    Kebalikan
    6
    9
    7
    2
    5


### Soal 3
Buatlah program yang menerima input jumlah elemen array, inputkan isi arraynya, kemudian tampilkan bilangan terbesar dari isi elemen arraynya. Contoh hasil program:
![Soal 3](images/t3.png)


```Java
 /* Jawaban Soal 3 disini */
import java.util.Scanner;
Scanner in = new Scanner(System.in);
int angka;
    int Max;
    int Array[];
        System.out.print("Masukkan isi array: ");
        angka = in.nextInt();
        Array = new int[angka];
       
        for (int i=0;i<angka;i++){
            System.out.printf("Masukkan elemen array ke -%2d: ",(i+0));
            Array[i]=in.nextInt();
            Max = Array[0];
           
                for (int k=0;k<angka;k++){
                    if (Array[k] > Max);
                    Max = Array[k];
            }
        }
        System.out.println("Bilangan terbesar adalah  " + Max);
        
        
  



```

    Masukkan isi array: 5
    Masukkan elemen array ke - 0: 25
    Masukkan elemen array ke - 1: 78
    Masukkan elemen array ke - 2: 12
    Masukkan elemen array ke - 3: 63
    Masukkan elemen array ke - 4: 99
    Bilangan terbesar adalah  99



```Java

```
