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
int[] bil = new int [4];
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

// Tulis Jawaban no 1 disini

indeks array terbesar adalah (bil[3]) = 20

indeks array terkecil adalah (bil[0]) = 5

2. Jika Isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?


```Java
// Tulis Jawaban no 2 yang disini
bil[0] = 5.0;
bil[1] = 12867;
bil[2] = 7.5;
bil[3] = 2000000;
```


    |   bil[0] = 5.0;

    incompatible types: possible lossy conversion from double to int

    


Yang terjadi adalah eror seperti percobaan diatas.

Mengapa demikian? Karena bilangan yang dimasukkan bukan termasuk kedalam jangkauan tipe data integer.

3. Ubah statement pada langkah No 3 menjadi seperti berikut
![Gambar pertanyaan 3](images/P1T3.png)
Apa keluaran dari program? Mengapa bisa demikian?


```Java
// Tulis Jawaban no 3 yang disini
for(int i = 0; i < 4; i++){
    System.out.println(bil[i]);
}
```

    5
    12
    7
    20


Karena kode program tersebut adalah perulangan, jadi outputnya sama dengan langkah No 3.

### Percobaan 2: Meminta Inputan Pengguna untuk Mengisi Elemen Array
1. Pada percobaan ke-2 akan dilakukan percobaan yang meminta inputan pengguna untuk mengisi elemen array seperti pada flowchart berikut
![Gambar Flowchart](images/FCpercobaan2.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 1 di atas

```

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
int [] nilaiUAS = new int[6];
```

4. Menggunakan perulangan, buat input untuk mengisi elemen dari array nilaiUAS.
![Gambar perulangan input](images/P2L4.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 4 di atas
for(int i = 0; i < 6; i++){
    System.out.print("Masukkan nilai UAS ke-" + i + ": ");
    nilaiUAS[i] = sc.nextInt();
}
```

    Masukkan nilai UAS ke-0: 76
    Masukkan nilai UAS ke-1: 78
    Masukkan nilai UAS ke-2: 80
    Masukkan nilai UAS ke-3: 82
    Masukkan nilai UAS ke-4: 84
    Masukkan nilai UAS ke-5: 86


5. Menggunakan perulangan, tampilkan semua isi elemen dari array nilaiUAS.
![Gambar perulangan print](images/P2L5.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 5 di atas
for(int i = 0; i < 6; i++){
    System.out.println("Nilai UAS ke-" + i + "adalah: " + nilaiUAS[i]);
}
```

    Nilai UAS ke-0adalah: 76
    Nilai UAS ke-1adalah: 78
    Nilai UAS ke-2adalah: 80
    Nilai UAS ke-3adalah: 82
    Nilai UAS ke-4adalah: 84
    Nilai UAS ke-5adalah: 86


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
```

    Masukkan nilai UAS ke-0: 76
    Masukkan nilai UAS ke-1: 78
    Masukkan nilai UAS ke-2: 80
    Masukkan nilai UAS ke-3: 82
    Masukkan nilai UAS ke-4: 84
    Masukkan nilai UAS ke-5: 86


Tidak terjadi perubahan, hanya saja kita diminta untuk memasukkan nilai lagi.

Mengapa demikian? Karena kode program tersebut maksudnya sama.

2. Apa kegunaan dari `nilaiUAS.length`? 

// Tulis Jawaban nomor 2 disini

Kegunaan dari kode program tersebut adalah untuk mengindikasikan panjang dari array tersebut.

3. Ubah statement pada langkah No 5 menjadi seperti berikut ini sehingga program hanya menampilkan status mahasiswa yang lulus saja:
![Gambar pertanyaan1](images/P2T3.png)
Jalankan program dan Jelaskan alur program!


```Java
// Tulis Jawaban nomor 3 disini
for(int i = 0; i < nilaiUAS.length; i++){
    if(nilaiUAS[i] > 70){
        System.out.println("Mahasiswa ke-" + i + " lulus");
    }
}
```

    Mahasiswa ke-0 lulus
    Mahasiswa ke-1 lulus
    Mahasiswa ke-2 lulus
    Mahasiswa ke-3 lulus
    Mahasiswa ke-4 lulus
    Mahasiswa ke-5 lulus


Alur Program
1. for(int i = 0; i < nilaiUAS.length; i++){ --> baris kode program ini berfungsi sebagai inisialisasi, kondisi, dan perubahan nilai.
2. if(nilaiUAS[i] > 70){ --> baris kode program ini berfungsi sebagai kondisi ketika i > 70.
3. System.out.println("Mahasiswa ke-" + i + " lulus"); --> baris kode program ini berfungsi sebagai pencetak output jika kondisi i > 70.

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
for(int i = 0; i < nilaiMHS.length; i++){
    System.out.print("Masukkan nilai Mahasiswa ke- " + (i+1)+ ":");
    nilaiMHS[i] = sc.nextInt();
}
```

    Masukkan nilai Mahasiswa ke- 1:50
    Masukkan nilai Mahasiswa ke- 2:60
    Masukkan nilai Mahasiswa ke- 3:70
    Masukkan nilai Mahasiswa ke- 4:80
    Masukkan nilai Mahasiswa ke- 5:90
    Masukkan nilai Mahasiswa ke- 6:100
    Masukkan nilai Mahasiswa ke- 7:90
    Masukkan nilai Mahasiswa ke- 8:80
    Masukkan nilai Mahasiswa ke- 9:70
    Masukkan nilai Mahasiswa ke- 10:60


4. Menggunakan perulangan untuk menghitung jumlah keseluruhan nilai.
![Gambar perulangan jumlah](images/P3L4.png)



```Java
// Tulis Kode program Percobaan 3 Langkah 4 di atas, disini
for(int i = 0; i < nilaiMHS.length; i++){
    total += nilaiMHS[i];
}
```

5. Kemudian hitung nilai rata-rata dengan cara nilai total dibagi jumlah elemen dari array nilaiMHS\
![Gambar hitung rata2](images/P3L5.png)



```Java
// Tulis Kode program Percobaan 3 Langkah 3 di atas, disini
rata = total / nilaiMHS.length;
System.out.println("Rata-rata nilai mahasiswa adalah " + rata);
```

    Rata-rata nilai mahasiswa adalah 75.0


#### Pertanyaan 
1. Pada Percobaan 3 langkah ke-5. Mengapa perhitungan rata berada diluar perulangan?

// Tulis jawaban no 1 disini

Karena rata-rata tidak memerlukan perulangan.

2. Modifikasi program pada percobaan 3 sehingga bisa mengeluarkan output  seperti gambar berikut ini!
syarat lulus nilai >70
![Gambar pertanyaan 2](images/P3T2.png)


```Java
// Tulis jawaban no 2 disini
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int nilaiMHS[] = new int[4];
double total1, total2;
double rata1, rata2;
int lulus, tidaklulus;
for(int i = 0; i < nilaiMHS.length; i++){
    System.out.print("Masukkan nilai Mahasiswa ke- " + (i+1)+ " : ");
    nilaiMHS[i] = sc.nextInt();
    if(nilaiMHS[i] > 70){
        total1 += nilaiMHS[i];
        lulus++;
    }else{
        total2 += nilaiMHS[i];
        tidaklulus++;
    }
}
rata1 = total1 / lulus;
rata2 = total2 / tidaklulus;
System.out.println("Rata-rata nilai mahasiswa adalah " + rata1);
System.out.println("Rata-rata nilai mahasiswa adalah " + rata2);
```

    Masukkan nilai Mahasiswa ke- 1 : 50
    Masukkan nilai Mahasiswa ke- 2 : 60
    Masukkan nilai Mahasiswa ke- 3 : 80
    Masukkan nilai Mahasiswa ke- 4 : 90
    Rata-rata nilai mahasiswa adalah 85.0
    Rata-rata nilai mahasiswa adalah 55.0


### Percobaan 4: Pencarian menggunakan Array
Pada praktikum ini, akan dilakukan percobaan untuk mencari lokasi/indeks sebuah angka dalam array. Sesuai dengan flowchart di bawah ini:
![Gambar flowchart searching](images/FCpercobaan4.png) 

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
for (int i = 0; i < arr.length; i++){
    if (key==arr[i]){
        hasil = i;
        break;
    }
}
```

3. Tampilkan hasil pencarian dengan kode berikut.
![Gambar perulangan jumlah](images/P4L4.png)



```Java
// Tulis Kode program Percobaan 4 Langkah 3 di atas, disini
System.out.println("Key ada di array ke- " + hasil);
```

    Key ada di array ke- 5


#### Pertanyaan 
1. Pada Percobaan 4 langkah ke-2. Apa kegunaan dari statement `break`?

// Tulis jawaban no 1 disini

Kegunaan dari statement break adalah untuk keluar dari perulangan jika sudah mendapatkan hasil.

2. Modifikasi program pada percobaan 4 sehingga key yang dicari adalah angka 5. Kemudian jalankan program, amati hasilnya! Jelaskan penyebab dari hasil tersebut! 


```Java
// Tulis jawaban no 2 disini

int[] arr = {6,4,1,9,7,3,2,8};
int key = 5;
int hasil = -1;
for (int i = 0; i < arr.length; i++){
    if (key==arr[i]){
        hasil = i;
        break;
    }
}
System.out.println("Key ada di array ke- " + hasil);
```

    Key ada di array ke- -1


Penyebab dari hasil tersebut adalah karena angka 5 tidak ada di dalam elemen arr.

### Percobaan 5: Pengurutan bilangan menggunakan Array
Pada praktikum ini, akan dilakukan percobaan untuk mengurutkan angka dalam array. Sesuai dengan flowchart di bawah ini:
![Gambar flowchart sorting](images/FCpercobaan5.png)
1.Buat array arr[] bertipe integer dengan kapasitas 8 dan isi dengan nilai 16, 4, 10, 90, 27, 3, 12 dan 28. Kemudian deklarasikan variabel integer `temp` untuk media penukaran nilai pada variabel. Deklarasi dan inisialisasi seperti gambar berikut ini
![Gambar deklarasi dan inisialisasi](images/P5L1.png)


```Java
// Tulis Kode program Percobaan 5 Langkah 1 disini
int[] arr = {16, 4, 10, 90, 27, 3, 12, 28};
int temp = 0;
```

2. Menggunakan perulangan, lakukan pengurutan bilangan dengan menukar posisi indeks tersebut dengan indeks berikutnya. Perulangan dilakukan untuk menukar posisi berulang kali. 
![Gambar sorting](images/P5L2.png)


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

3. Tampilkan hasil pengurutan dengan menggunakan perulangan
![Gambar print](images/P5L3.png)


```Java
// Tulis Kode program Percobaan 5 Langkah 3 di atas, disini
System.out.println("Hasil pengurutan: ");
for(int i = 0; i < arr.length; i++)
    System.out.println(arr[i]);
```

    Hasil pengurutan: 
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
Scanner sc = new Scanner(System.in);

int checkNum[] = new int [10];
int evenNum[] = new int [10];
int oddNum[] = new int [10];
int cEven, cOdd = 0;

for(int i=0; i<checkNum.length; i++){
    System.out.printf("Masukkan angka ke- %d: ",i);
    checkNum[i] = sc.nextInt();
}
for(int j=0; j<checkNum.length; j++){
    if(checkNum[j] %2 == 0){
        evenNum[cEven] = checkNum[j];
        cEven++;
    } else {
        oddNum[cOdd] = checkNum[j];
        cOdd++;
    }
}
System.out.printf("\nJumlah genap ada %d, dan jumlah ganjil ada %d", cEven, cOdd);
System.out.print("\nBilangan genap adalah\n");
for(int i = 0; i <cEven; i++){
    System.out.printf("- %d\n", evenNum[i]);
}
System.out.print("\nBilangan ganjil adalah\n");
for(int i = 0; i < cOdd; i++){
    System.out.printf("- %d\n", oddNum[i]);
}
```

    Masukkan angka ke- 0: 60
    Masukkan angka ke- 1: 55
    Masukkan angka ke- 2: 50
    Masukkan angka ke- 3: 67
    Masukkan angka ke- 4: 88
    Masukkan angka ke- 5: 90
    Masukkan angka ke- 6: 65
    Masukkan angka ke- 7: 78
    Masukkan angka ke- 8: 77
    Masukkan angka ke- 9: 40
    
    Jumlah genap ada 6, dan jumlah ganjil ada 4
    Bilangan genap adalah
    - 60
    - 50
    - 88
    - 90
    - 78
    - 40
    
    Bilangan ganjil adalah
    - 55
    - 67
    - 65
    - 77


Penjelasan Kode Program :
1. import java.util.Scanner;
Scanner sc = new Scanner(System.in);
==> Kode tersebut berfungsi untuk memasukkan inputan menggunakan keyboard dan membuat library-nya.
2. int checkNum[] = new int [10];
int evenNum[] = new int [10];
int oddNum[] = new int [10];
int cEven, cOdd = 0; 
==> Kode diatas berfungsi untuk menginstansiasi variabel array.
3. for(int i=0; i<checkNum.length; i++){
    System.out.printf("Masukkan angka ke- %d: ",i);
    checkNum[i] = sc.nextInt();
}
==> Kode diatas berfungsi untuk perulangan memasukkan inputan dari pengguna sampai dengan batas instansiasi.
4. for(int j=0; j<checkNum.length; j++){
    if(checkNum[j] %2 == 0){
        evenNum[cEven] = checkNum[j];
        cEven++;
    } else {
        oddNum[cOdd] = checkNum[j];
        cOdd++;
    }
}
==> Kode diatas berfungsi untuk perulangan jika bilangan yang diinputkan merupakan bilangan yang habis dibagi 2, maka akan ditampilkan bilangan genap, selain itu maka bilangan yang ditampilkan adalah bilangan ganjil.
5. System.out.printf("\nJumlah genap ada %d, dan jumlah ganjil ada %d", cEven, cOdd);
==> Kode ini berfungsi untuk menampilkan jumlah bilangan genap dan jumlah bilangan ganjil;
6. for(int i = 0; i <cEven; i++){
    System.out.printf("- %d\n", evenNum[i]);
}
==> Untuk perulangan bilangan yang habis dibagi 2 dan menampilkannya.
7. for(int i = 0; i < cOdd; i++){
    System.out.printf("- %d\n", oddNum[i]);
}
==> Untuk perulangan bilangan yang tidak habis dibagi 2 dan menampilkannya.

### Soal 2
Buatlah program yang terdapat array dengan jumlah elemen 5, buatlah input untuk mengisi elemen array tersebut, kemudian tampilkan isi array tersebut dengan urutan terbalik. Seperti ilustrasi gambar dibawah ini.
![Soal 2](images/T2.png)


```Java
/* Jawaban Soal 2 disini */

import java.util.Scanner;
Scanner sc = new Scanner(System.in);

int array[];
array = new int[5];
    for (int i = 0; i < array.length; i++) {
    System.out.print("Masukkan angka : ");
    array[i]=sc.nextInt();
    }
System.out.print("Hasil terbalik adalah : ");
for(int i = array.length-1; i>=0; i--){
    System.out.print(array[i]+", ");
}
```

    Masukkan angka : 5
    Masukkan angka : 2
    Masukkan angka : 7
    Masukkan angka : 9
    Masukkan angka : 6
    Hasil terbalik adalah : 6, 9, 7, 2, 5, 

Penjelasan Kode Program :
1. import java.util.Scanner;
Scanner sc = new Scanner(System.in);
==> Berfungsi untuk memasukkan inputan menggunakan keyboard dan membuat library-nya.
2. int array[];
array = new int[5];
==> Untuk deklarasi dan instansiasi array.
3. for (int i = 0; i < array.length; i++) {
    System.out.print("Masukkan angka : ");
    array[i]=sc.nextInt();
    }
==> Untuk perulangan memasukkan angka inputan sampai dengan elemen yang diminta.
4. for(int i = array.length-1; i>=0; i--){
    System.out.print(array[i]+", ");
}
==> Untuk perulangan dengan inisialisasi i = panjang elemen array - 1, kondisi i>=0 dan perubahan nilai i-- atau decrement. Sehingga dapat membuat output menjadi terbalik dari yang di-input-kan.

### Soal 3
Buatlah program yang menerima input jumlah elemen array, inputkan isi arraynya, kemudian tampilkan bilangan terbesar dari isi elemen arraynya. Contoh hasil program:
![Soal 3](images/t3.png)


```Java
/* Jawaban Soal 3 disini */
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int max = 0;
int n;
System.out.print("Masukkan isi array: ");
int n = sc.nextInt();
int[] nilaiMHS = new int[n];
for(int i=0; i<nilaiMHS.length; i++){
         System.out.print("Masukkan elemen array ke- "+i+": ");
         nilaiMHS[i]=sc.nextInt();
}
for(int i=0; i<nilaiMHS.length; i++){
         if (nilaiMHS[i] > max) {
          max = nilaiMHS[i];
     }
}
System.out.println("Bilangan terbesar adalah " + max);
```

    Masukkan isi array: 5
    Masukkan elemen array ke- 0: 75
    Masukkan elemen array ke- 1: 40
    Masukkan elemen array ke- 2: 50
    Masukkan elemen array ke- 3: 80
    Masukkan elemen array ke- 4: 90
    Bilangan terbesar adalah 90


Penjelasan Kode Program :
1. import java.util.Scanner;
Scanner sc = new Scanner(System.in);
==> Berfungsi untuk memasukkan inputan menggunakan keyboard dan membuat library-nya.
2. int max = 0;
int n;
==> Untuk mendeklarasikan tipe data dan variabel yang akan digunakan.
3. System.out.print("Masukkan isi array: ");
int n = sc.nextInt();
==> Untuk menampilkan isi array yang diinginkan pengguna.
4. int[] nilaiMHS = new int[n];
==> Untuk instansiasi array nilai mahasiswa.
5. for(int i=0; i<nilaiMHS.length; i++){
         System.out.print("Masukkan elemen array ke- "+i+": ");
         nilaiMHS[i]=sc.nextInt();
}
==> Untuk perulangan memasukkan nilai mahasiswa sesuai dengan isi array yang telah dimasukkan sebelumnya.
6. for(int i=0; i<nilaiMHS.length; i++){
         if (nilaiMHS[i] > max) {
          max = nilaiMHS[i];
     }
}
==> Untuk perulangan jika kondisi i atau nilai mahasiswa merupakan bilangan yang terbesar.
7. System.out.println("Bilangan terbesar adalah " + max);
==> Untuk menampilkan nilai mahasiswa yang paling besar.
