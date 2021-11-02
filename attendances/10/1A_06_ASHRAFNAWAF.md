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

3. Tampilkan ke layar semua isi elemennya:
![Gambar 4](images/P1L4.png)


```Java
// Tulis Kode program Percobaan 1 Langkah 4
System.out.println(bil[0]);
System.out.println(bil[1]);
System.out.println(bil[2]);
System.out.println(bil[3]);
```

#### Pertanyaan 
1. Dari percobaan 1 berapakah indeks array terbesar dan terkecil?


```Java
// Tulis Jawaban no 1 disini
indeks terkecil adalah 0 dan indeks terbesar adalah 3
```

2. Jika Isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?


```Java
// Tulis Jawaban no 2 yang disini
bil[0] = 5;
bil[1] = 12;
bil[2] = 7;
bil[3] = 20;

System.out.println(bil[0]);
System.out.println(bil[1]);
System.out.println(bil[2]);
System.out.println(bil[3]);

//maka yang terjadi adalah error karena menurut saya memiliki tipe data yang berbeda yaitu tipe data double sehingga menghasilkan error
```

    5
    12
    7
    20


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

// output yang dikeluarkan sama dengan sebelumnya karena pengulangan bisa digunakan pada array
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
import java.util.Scanner; // Import Library Scanner 

Scanner in = new Scanner(System.in); // Instansiasi input Scanner
int nilaiUAS[] = new int[6]; // Instansiasi array integer dengan nama array: nilaiUAS
System.out.println("---Input nilai UAS---"); // Digunakan sebagai header output
for(int i = 0; i < 6; i++) nilaiUAS[i] = in.nextInt(); // Perulangan untuk input nilai UAS
System.out.println("---Output nilai UAS---"); // Digunakan sebagai header output
for(int i = 0; i < 6; i++) System.out.println(nilaiUAS[i]); // Sebagai output pada masing masing nilai 
```

    ---Input nilai UAS---
    20
    30
    10
    70
    80
    50
    ---Output nilai UAS---
    20
    30
    10
    70
    80
    50


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
for(int i = 0; i<6; i++){
    System.out.print("Masukkan nilai UAS ke-" + i + ": ");
    nilaiUAS[i] = sc.nextInt();
} 
```

5. Menggunakan perulangan, tampilkan semua isi elemen dari array nilaiUAS.
![Gambar perulangan print](images/P2L5.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 5 di atas
for(int i = 0; i < 6; i++) {
    System.out.println("Nilai UAS ke-" + i + " adalah: " + nilaiUAS[i]);
} 
```

#### Pertanyaan
1. Ubah statement pada langkah No 4 menjadi seperti berikut ini :
![Gambar pertanyaan1](images/P2T1.png)
Jalankan program, apakah terjadi perubahan? Mengapa demikian?



```Java
// Tulis Jawaban nomor 1 disini
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int[] nilaiUAS = new int[6];
for(int i = 0; i < nilaiUAS.length; i++){
    System.out.print("Masukkan nilai UAS ke-" + i + ": ");
} 
```

    Masukkan nilai UAS ke-0: Masukkan nilai UAS ke-1: Masukkan nilai UAS ke-2: Masukkan nilai UAS ke-3: Masukkan nilai UAS ke-4: Masukkan nilai UAS ke-5: 

Tidak ada perubahan, karena output dari nilaiUAS.length adalah 6

2. Apa kegunaan dari `nilaiUAS.length`? 

// Tulis Jawaban nomor 2 disini
Menghitung panjang array

3. Ubah statement pada langkah No 5 menjadi seperti berikut ini sehingga program hanya menampilkan status mahasiswa yang lulus saja:
![Gambar pertanyaan1](images/P2T3.png)
Jalankan program dan Jelaskan alur program!


```Java
// Tulis Jawaban nomor 3 disini
for(int i = 0; i < nilaiUAS.length; i++) {
    if(nilaiUAS[i] > 70) {
        System.out.println("Mahasiswa ke-" + i + " lulus");
    }
} 
```


    |   for(int i = 0; i < nilaiUAS.length; i++) {

    cannot find symbol

      symbol:   variable nilaiUAS

    

    |       if(nilaiUAS[i] > 70) {

    cannot find symbol

      symbol:   variable nilaiUAS

    


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
for(int i = 0; i < nilaiMHS.length; i++) {
    System.out.print("Masukkan nilai Mahasiswa ke-" + (i + 1) + ":");
    nilaiMHS[i] = sc.nextInt();
} 
```

4. Menggunakan perulangan untuk menghitung jumlah keseluruhan nilai.
![Gambar perulangan jumlah](images/P3L4.png)



```Java
// Tulis Kode program Percobaan 3 Langkah 4 di atas, disini
for(int i = 0; i < nilaiMHS.length; i++) {
    total += nilaiMHS[i];
}
```

5. Kemudian hitung nilai rata-rata dengan cara nilai total dibagi jumlah elemen dari array nilaiMHS\
![Gambar hitung rata2](images/P3L5.png)



```Java
// Tulis Kode program Percobaan 3 Langkah 3 di atas, disini
rata = total/nilaiMHS.length;
System.out.println("Rata-rata nilai mahasiswa adalah " + rata);
```

#### Pertanyaan 
1. Pada Percobaan 3 langkah ke-5. Mengapa perhitungan rata berada diluar perulangan?

// Tulis jawaban no 1 disini
Karena menghitung nilai akhir dari variabel yang telah ditambahkan setelah proses perulangan

2. Modifikasi program pada percobaan 3 sehingga bisa mengeluarkan output  seperti gambar berikut ini!
syarat lulus nilai >70
![Gambar pertanyaan 2](images/P3T2.png)


```Java
// Tulis jawaban no 2 disini
double rataLulus, rataTidakLulus;
int totalLulus, totalTidakLulus;

List<Integer> a = new ArrayList<>(); // menggunakan arraylist agar panjang array sama mengikuti isinya
List<Integer> b = new ArrayList<>();

int index,temp;
for(int c: nilaiMHS){
    System.out.print("Masukkan nilai Mahasiswa ke-" + (index += 1) + ":");
    temp = sc.nextInt();
    if(temp > 70) a.add(temp); // .add merupakan fungsi untuk menambahkan isi kedalam arraylist
    else b.add(temp);
}

for(int a : a) totalLulus += a;
for(int b : b) totalTidakLulus += b;

System.out.printf("Rata-rata nilai mahasiswa yang lulus adalah: %.2f", (double) totalLulus/a.size()); // a.size() berfungsi untuk menghitung panjang arraylist a
System.out.printf("\nRata-rata nilai mahasiswa yang tidak lulus adalah: %.2f", (double) totalTidakLulus/b.size());
```


    |   for(int c: nilaiMHS){

    cannot find symbol

      symbol:   variable nilaiMHS

    

    |       temp = sc.nextInt();

    cannot find symbol

      symbol:   variable sc

    



```Java
### Percobaan 4: Pencarian menggunakan Array
Pada praktikum ini, akan dilakukan percobaan untuk mencari lokasi/indeks sebuah angka dalam array. Sesuai dengan flowchart di bawah ini:
![Gambar flowchart searching](images/FCpercobaan4.png) 
```

1. Buat array arr[] bertipe integer dengan kapasitas 6 dan isi dengan nilai 6, 4, 1, 9, 7, 3, 2 dan 8. Kemudian deklarasikan variabel integer `key` untuk kata kunci pencarian dan variabel `hasil` untuk hasil indeks pencarian. Deklarasi dan inisialisasi seperti gambar berikut ini
![Gambar deklarasi variabel](images/P4L2.png)



```Java
// Tulis Kode program Percobaan 4 Langkah 1 di atas, disini
int[] arr = {6,4,1,9,7,3,2,8}; // inisialisasi array secara explicit
int key = 3;
int hasil = -1;
```

2. Menggunakan perulangan, lakukan pencarian untuk mendapatkan nilai array yang sesuai dengan key. Bila ada yang sesuai, simpan indeksnya sebagai hasil pencarian
![Gambar perulangan search](images/p4L3.png)



```Java
// Tulis Kode program Percobaan 4 Langkah 2 di atas, disini
for(int i=0; i<arr.length; i++) {
    if(key==arr[i]) {
        hasil=i;
        break;
    }
}
```

3. Tampilkan hasil pencarian dengan kode berikut.
![Gambar perulangan jumlah](images/P4L4.png)



```Java
// Tulis Kode program Percobaan 4 Langkah 3 di atas, disini
System.out.println("Key ada di array ke-" + hasil);
```

#### Pertanyaan 
1. Pada Percobaan 4 langkah ke-2. Apa kegunaan dari statement `break`?

// Tulis jawaban no 1 disini
Untuk menghentikan perulangan jika key ditemukan

2. Modifikasi program pada percobaan 4 sehingga key yang dicari adalah angka 5. Kemudian jalankan program, amati hasilnya! Jelaskan penyebab dari hasil tersebut! 


```Java
int[] arr = {6,4,1,9,7,3,2,8};
key = 5;
int hasil = -1;

for(int i=0; i<arr.length; i++) {
    if(key==arr[i]) {
        hasil=i;
        break;
    }
}
System.out.println("Key ada di array ke-" + hasil); 
```


    |   key = 5;

    cannot find symbol

      symbol:   variable key

    


key tidak ditemukan maka output yang dikeluarkan adalah nilai awal dari variabel hasil

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
System.out.println("Hasil pengurutan: ");
for(int i = 0; i < arr.length; i++)
    System.out.println(arr[i]);
```

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
    Masukkan Bilangan: 7
    Masukkan Bilangan: 5
    Masukkan Bilangan: 4
    Masukkan Bilangan: 9
    Masukkan Bilangan: 4
    Masukkan Bilangan: 3
    Masukkan Bilangan: 7
    Masukkan Bilangan: 8
    Masukkan Bilangan: 5
    
    Genap:
    4 4 8 0 0 0 0 0 0 0 
    Ganjil:
    1 7 5 9 3 7 5 0 0 0 

### Soal 2
Buatlah program yang terdapat array dengan jumlah elemen 5, buatlah input untuk mengisi elemen array tersebut, kemudian tampilkan isi array tersebut dengan urutan terbalik. Seperti ilustrasi gambar dibawah ini.
![Soal 2](images/T2.png)


```Java
import java.util.Scanner;
Scanner in = new Scanner(System.in);
int[] a = new int[5]; // Instansiasi array beserta panjangnya
System.out.println("--Masukkan Urutan 1-5--"); 
for(int i = 0; i < a.length; i++) a[i] = in.nextInt(); 
System.out.println("--Urutan Terbalik--");
for(int i = a.length - 1; i >= 0; i--) System.out.println(a[i]); // Mengubah variabel indeks awal menjadi panjang array
```

    --Masukkan Urutan 1-5--
    7
    9
    4
    2
    6
    --Urutan Terbalik--
    6
    2
    4
    9
    7


### Soal 3
Buatlah program yang menerima input jumlah elemen array, inputkan isi arraynya, kemudian tampilkan bilangan terbesar dari isi elemen arraynya. Contoh hasil program:
![Soal 3](images/t3.png)


```Java
import java.util.Scanner;
Scanner in = new Scanner(System.in);

System.out.print("Masukkan isi array: ");
int bilanganTerbesar = 0;
int isiArray = in.nextInt();
int[] a = new int[isiArray]; // Isi/Panjang array akan mengikuti berdasarkan apa yang telah di input

for(int i = 0; i < a.length; i++) {
    System.out.printf("Masukkan elemen array ke-" + i + ": ");
    a[i] = in.nextInt();
}

for(int i = 0; i < a.length; i++) {
    if(i == 0) bilanganTerbesar = a[i]; // pada awal iterasi melakukan assignment
    else
        if(bilanganTerbesar < a[i]) bilanganTerbesar = a[i]; // Mengecek apabila nilai sebelumnya lebih kecil dari nilai saat ini
}
System.out.println("\nBilangan terbesar adalah " + bilanganTerbesar); 
```

    Masukkan isi array: 4
    Masukkan elemen array ke-0: 999
    Masukkan elemen array ke-1: 309
    Masukkan elemen array ke-2: 280
    Masukkan elemen array ke-3: 865
    
    Bilangan terbesar adalah 999

