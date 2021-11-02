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
bil[0] = 5.0;
bil[1] = 12867;
bil[2] = 7.5;
bil[3] = 2000000;
```


    |   bil[0] = 5.0;

    incompatible types: possible lossy conversion from double to int

    


3. Tampilkan ke layar semua isi elemennya:
![Gambar 4](images/P1L4.png)


```Java
// Tulis Kode program Percobaan 1 Langkah 4
System.out.println(bil[0]);
System.out.println(bil[1]);
System.out.println(bil[2]);
System.out.println(bil[3]);
```

    0
    0
    0
    0


#### Pertanyaan 
1. Dari percobaan 1 berapakah indeks array terbesar dan terkecil?


```Java
// Tulis Jawaban no 1 disini
indeks terbesar adalah indeks ke 3
indeks terkecil adalah indeks ke 0
```

2. Jika Isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?


```Java
// Tulis Jawaban no 2 yang disini
Akan mengeprint 0 semua
```

3. Ubah statement pada langkah No 3 menjadi seperti berikut
![Gambar pertanyaan 3](images/P1T3.png)
Apa keluaran dari program? Mengapa bisa demikian?


```Java
// Tulis Jawaban no 3 yang disini
for(int i=0; i<4; i++){
    System.out.println(bil[i]);
}

//keluaran dari program adalah sama
```

    0
    0
    0
    0


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
int[] nilaiUAS = new int[6];
```

4. Menggunakan perulangan, buat input untuk mengisi elemen dari array nilaiUAS.
![Gambar perulangan input](images/P2L4.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 4 di atas
for(int i=0; i<6; i++){
    System.out.print("Masukkan nilai UAS ke-"+i+": ");
    nilaiUAS[i] = sc.nextInt();
}
```

    Masukkan nilai UAS ke-0: 55
    Masukkan nilai UAS ke-1: 56
    Masukkan nilai UAS ke-2: 76
    Masukkan nilai UAS ke-3: 87
    Masukkan nilai UAS ke-4: 590
    Masukkan nilai UAS ke-5: 98


5. Menggunakan perulangan, tampilkan semua isi elemen dari array nilaiUAS.
![Gambar perulangan print](images/P2L5.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 5 di atas
for(int i=0; i<6; i++){
    System.out.println("Nilai UAS ke-"+i+" adalah "+nilaiUAS[i]);
}
```

    Nilai UAS ke-0 adalah 55
    Nilai UAS ke-1 adalah 56
    Nilai UAS ke-2 adalah 76
    Nilai UAS ke-3 adalah 87
    Nilai UAS ke-4 adalah 590
    Nilai UAS ke-5 adalah 98


#### Pertanyaan
1. Ubah statement pada langkah No 4 menjadi seperti berikut ini :
![Gambar pertanyaan1](images/P2T1.png)
Jalankan program, apakah terjadi perubahan? Mengapa demikian?



```Java
// Tulis Jawaban nomor 1 disini
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int[] nilaiUAS = new int[6];
for(int i=0; i<nilaiUAS.length; i++){
    System.out.print("Masukkan nilai UAS ke-"+i+": ");
    nilaiUAS[i] = sc.nextInt();
}
for(int i=0; i<6; i++){
    System.out.println("Nilai UAS ke-"+i+" adalah "+nilaiUAS[i]);
}
//tidak terjadi perubahan, karena tidak menampilkan indeks dari elemen dari sebuah array dalam posisi tertentu
```

    Masukkan nilai UAS ke-0: 78
    Masukkan nilai UAS ke-1: 87
    Masukkan nilai UAS ke-2: 87
    Masukkan nilai UAS ke-3: 87
    Masukkan nilai UAS ke-4: 87
    Masukkan nilai UAS ke-5: 87
    Nilai UAS ke-0 adalah 78
    Nilai UAS ke-1 adalah 87
    Nilai UAS ke-2 adalah 87
    Nilai UAS ke-3 adalah 87
    Nilai UAS ke-4 adalah 87
    Nilai UAS ke-5 adalah 87


2. Apa kegunaan dari `nilaiUAS.length`? 


```Java
// Tulis Jawaban nomor 2 disini
Dapat menggunakan panjang array, bersama dengan indeksnya, untuk melakukan beberapa operasi menggunakan loop.
Dapat menginisialisasi array secara efisien.
```

3. Ubah statement pada langkah No 5 menjadi seperti berikut ini sehingga program hanya menampilkan status mahasiswa yang lulus saja:
![Gambar pertanyaan1](images/P2T3.png)
Jalankan program dan Jelaskan alur program!


```Java
// Tulis Jawaban nomor 3 disini
//menambahkan library Scanner
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

//mendeklarasikan array
int[] nilaiUAS = new int[6];

//melakukan perulangan
for(int i=0; i<nilaiUAS.length; i++){
    System.out.print("Masukkan nilai UAS ke-"+i+": ");
    nilaiUAS[i] = sc.nextInt();
}

//menampilkan hasil perulangan jika nilai meleihi 70
for(int i=0; i<nilaiUAS.length; i++){
    if(nilaiUAS[i]>70){
        System.out.println("Mahasiswa ke-"+i+" lulus");
    }
}
```

    Masukkan nilai UAS ke-0: 87
    Masukkan nilai UAS ke-1: 87
    Masukkan nilai UAS ke-2: 90
    Masukkan nilai UAS ke-3: 98
    Masukkan nilai UAS ke-4: 8
    Masukkan nilai UAS ke-5: 78
    Mahasiswa ke-0 lulus
    Mahasiswa ke-1 lulus
    Mahasiswa ke-2 lulus
    Mahasiswa ke-3 lulus
    Mahasiswa ke-5 lulus


### Percobaan 3: Melakukan Operasi Aritmatika terhadap Elemen Array
Pada praktikum ini, akan dilakukan percobaan untuk menjumlahkan Array. Program akan menerima input sebanyak 10 nilai mahasiswa. Kemudian program akan menampilkan nilai rata-rata nilai dari 10 Mahasiswa. Seperti flowchart berikut
![Gambar flowchart](images/FCpercobaan3.png)

1.Import dan deklarasikan Scanner untuk keperluan input. 
![Gambar deklarasi scanner](images/P3L1.png)


```Java
// Tulis Kode program Percobaan 3 Langkah 1 di atas, disini
import java.util.Scanner;
Scanner sc=new Scanner(System.in);
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
for(int i=0; i<nilaiMHS.length; i++){
    System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+": ");
    nilaiMHS[i] = sc.nextInt();
}
```

    Masukkan nilai mahasiswa ke-1: 7
    Masukkan nilai mahasiswa ke-2: 87
    Masukkan nilai mahasiswa ke-3: 77
    Masukkan nilai mahasiswa ke-4: 88
    Masukkan nilai mahasiswa ke-5: 78
    Masukkan nilai mahasiswa ke-6: 98
    Masukkan nilai mahasiswa ke-7: 99
    Masukkan nilai mahasiswa ke-8: 87
    Masukkan nilai mahasiswa ke-9: 67
    Masukkan nilai mahasiswa ke-10: 67


4. Menggunakan perulangan untuk menghitung jumlah keseluruhan nilai.
![Gambar perulangan jumlah](images/P3L4.png)



```Java
// Tulis Kode program Percobaan 3 Langkah 4 di atas, disini
for(int i=0; i<nilaiMHS.length; i++){
    total+=nilaiMHS[i];
}
```

5. Kemudian hitung nilai rata-rata dengan cara nilai total dibagi jumlah elemen dari array nilaiMHS\
![Gambar hitung rata2](images/P3L5.png)



```Java
// Tulis Kode program Percobaan 3 Langkah 3 di atas, disini
rata=total/nilaiMHS.length;
System.out.println("Rata-rata nilai mahasiswa adalah "+rata);
```

    Rata-rata nilai mahasiswa adalah 75.5


#### Pertanyaan 
1. Pada Percobaan 3 langkah ke-5. Mengapa perhitungan rata berada diluar perulangan?


```Java
// Tulis jawaban no 1 disini
Karena supaya menjangkau seluruh program
```

2. Modifikasi program pada percobaan 3 sehingga bisa mengeluarkan output  seperti gambar berikut ini!
syarat lulus nilai >70
![Gambar pertanyaan 2](images/P3T2.png)


```Java
// Tulis jawaban no 2 disini
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
double rataLulus, rataTidakLulus;
int totalLulus, totalTidakLulus;
List<Integer> a = new ArrayList<>();
List<Integer> b = new ArrayList<>();

int temp;
int nilaiMHS[] = new int[10];
for(int i = 0; i < nilaiMHS.length; i++) {
    System.out.print("Masukkan nilai Mahasiswa ke-" + (i + 1) + ":");
    temp = sc.nextInt();
    if(temp > 70) a.add(temp);
    else b.add(temp);
}

for(int a : a) totalLulus += a;
for(int b : b) totalTidakLulus += b;

System.out.println("Rata-rata nilai mahasiswa yang lulus adalah " + (double) totalLulus/a.size() );
System.out.println("Rata-rata nilai mahasiswa yang tidak lulus adalah " + (double) totalTidakLulus/b.size()); 
```

    Masukkan nilai Mahasiswa ke-1:5
    Masukkan nilai Mahasiswa ke-2:46
    Masukkan nilai Mahasiswa ke-3:53
    Masukkan nilai Mahasiswa ke-4:55
    Masukkan nilai Mahasiswa ke-5:88
    Masukkan nilai Mahasiswa ke-6:88
    Masukkan nilai Mahasiswa ke-7:88
    Masukkan nilai Mahasiswa ke-8:7
    Masukkan nilai Mahasiswa ke-9:88
    Masukkan nilai Mahasiswa ke-10:88
    Rata-rata nilai mahasiswa yang lulus adalah 88.0
    Rata-rata nilai mahasiswa yang tidak lulus adalah 33.2



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
Memberhentikan program
```

2. Modifikasi program pada percobaan 4 sehingga key yang dicari adalah angka 5. Kemudian jalankan program, amati hasilnya! Jelaskan penyebab dari hasil tersebut! 


```Java
// Tulis jawaban no 2 disini

int[] arr = {6,4,1,9,7,3,2,8};
int key = 3;
int hasil = -1;
for(int i=0; i<arr.length; i++){
    if(key==arr[i]){
        hasil=i;
        break;
    }
}
System.out.println("Key ada di array ke-"+hasil);
//tidak ada penyebab


/*
int[] arr = {16, 4, 10, 90, 27, 3, 12, 28};
int temp = 0;

for(int i = 0; i < arr.length; i++){
    for(int j = 1; j < (arr.length-i); j++){
        if(arr[j-1] > arr[j]){
            temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
        }
    }
}

System.out.println("Hasil pengurutan: ");
for(int i = 0; i < arr.length; i++)
    System.out.println(arr[i]);
*/
```

    Key ada di array ke-5


### Percobaan 5: Pengurutan bilangan menggunakan Array
Pada praktikum ini, akan dilakukan percobaan untuk mengurutkan angka dalam array. Sesuai dengan flowchart di bawah ini:
![Gambar flowchart sorting](images/FCpercobaan5.png)
1.Buat array arr[] bertipe integer dengan kapasitas 8 dan isi dengan nilai 16, 4, 10, 90, 27, 3, 12 dan 28. Kemudian deklarasikan variabel integer `temp` untuk media penukaran nilai pada variabel. Deklarasi dan inisialisasi seperti gambar berikut ini
![Gambar deklarasi dan inisialisasi](images/P5L1.png)


```Java
// Tulis Kode program Percobaan 5 Langkah 1 disini
int[] arr={16, 4, 10, 90, 27, 3, 12, 28};
int temp = 0;
```


```Java
// Tulis Kode program Percobaan 5 Langkah 2 di atas, disini
for(int i=0; i<arr.length; i++){
    for(int j=1; j<(arr.length-i); j++){
        if(arr[j-1]>arr[j]){
            temp = arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=temp;
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
System.out.println("Hasil Pengurutan: ");
for(int i=0; i<arr.length; i++)
    System.out.println(arr[i]);
```

    Hasil Pengurutan: 
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

//membuat Scanner
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

//membuat array
int checkNum[] = new int[10];
int evenNum[] = new int[10];
int oddNum[] = new int[10];
int cEven, codd=0;

//isi array
for(int i=0; i<checkNum.length; i++){
    System.out.print("Masukkan Nomor"+i+": ");
    checkNum[i] = sc.nextInt();
}
for(int j=0; j<checkNum.length; j++){
    if(checkNum[j]%2==0){
        evenNum[cEven] = checkNum[j];
        cEven++;
    }else{
        oddNum[codd]=checkNum[j];
        codd++;}
}System.out.println();

//membuat output bil genap & ganjil serta menampilkan bilangan tersebut
System.out.println("Bilangan genap berjumlah  "+cEven);
System.out.println("Bilangan ganjil berjumlah "+codd);
System.out.print("\nBilangan genap:\n");
for(int i=0; i<cEven; i++){
    System.out.printf("%d\n",evenNum[i]);
}
System.out.print("\nBilangan ganjil:\n");
for(int i=0; i<codd; i++){
    System.out.printf("%d\n",oddNum[i]);
}
```

    Masukkan Nomor0: 1
    Masukkan Nomor1: 2
    Masukkan Nomor2: 3
    Masukkan Nomor3: 4
    Masukkan Nomor4: 5
    Masukkan Nomor5: 6
    Masukkan Nomor6: 7
    Masukkan Nomor7: 8
    Masukkan Nomor8: 9
    Masukkan Nomor9: 13
    
    Bilangan genap berjumlah  4
    Bilangan ganjil berjumlah 6
    
    Bilangan genap:
    2
    4
    6
    8
    
    Bilangan ganjil:
    1
    3
    5
    7
    9
    13


### Soal 2
Buatlah program yang terdapat array dengan jumlah elemen 5, buatlah input untuk mengisi elemen array tersebut, kemudian tampilkan isi array tersebut dengan urutan terbalik. Seperti ilustrasi gambar dibawah ini.
![Soal 2](images/T2.png)


```Java
/* Jawaban Soal 2 disini */

//membuat library scanner
import java.util.Scanner;
Scanner in=new Scanner(System.in);

//membuat array
int[] a = new int[5]; 

//menginisialisasi array
for(int i=0; i<a.length;i++){
    System.out.print("Masukkan angka: ");
    a[i]=in.nextInt();
}System.out.println();

//membalikan hasil array
for(int i=a.length-1;i>=0;i--){
    System.out.print(a[i]+" ");
}
```

    Masukkan angka: 13
    Masukkan angka: 567
    Masukkan angka: 97
    Masukkan angka: 13
    Masukkan angka: 66
    
    66 13 97 567 13 


### Soal 3
Buatlah program yang menerima input jumlah elemen array, inputkan isi arraynya, kemudian tampilkan bilangan terbesar dari isi elemen arraynya. Contoh hasil program:
![Soal 3](images/t3.png)


```Java
/* Jawaban Soal 3 disini */

//membuat library scanner
import java.util.Scanner;
Scanner uwu = new Scanner(System.in);

//membuat variabel + array
int maks, jmlh, i;
int lok = 1;
int array[];

//meminta imputan jumlah array
System.out.print("Masukkan jumlah array: ");
jmlh=uwu.nextInt();
array=new int[jmlh];

//menginisialisasi array memasukkan elemen array
for(i=0; i<jmlh; i++){
    System.out.printf("Masukkan elemen array ke-%d : ",(i+1));
    array[i]=uwu.nextInt();
}

//menginisialisasi array bilangan terbesar
maks=array[0];
for(i=0; i<jmlh; i++){
    if (array[i]>maks){
        maks=array[i];
        lok=i+1;
    }
}System.out.println("Bilangan terbesar = "+maks);
```

    Masukkan jumlah array: 4
    Masukkan elemen array ke-1 : 213
    Masukkan elemen array ke-2 : 111
    Masukkan elemen array ke-3 : 56
    Masukkan elemen array ke-4 : 8
    Bilangan terbesar = 213
