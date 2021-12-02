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
int[] bil = new int[4]; //mendeklarasikan variabel
```

2. Isi masing-masing elemen array bil tadi dengan angka 5, 12, 7, 20.
![Gambar 0](images/P1L3.png)


```Java
// Tulis Kode program Percobaan 1 Langkah 3 di atas
bil[0] = 12; //mengisi elemen index array
bil[1] = 13; //mengisi elemen index array
bil[2] = 5;  //mengisi elemen index array
bil[3] = 5;  //mengisi elemen index array

```




    5



3. Tampilkan ke layar semua isi elemennya:
![Gambar 4](images/P1L4.png)


```Java
// Tulis Kode program Percobaan 1 Langkah 4
System.out.println(bil[0]);//menampilkan elemen index array
System.out.println(bil[1]);//menampilkan elemen index array
System.out.println(bil[2]);//menampilkan elemen index array
System.out.println(bil[3]);//menampilkan elemen index array

```

    12
    13
    5
    5


#### Pertanyaan 
1. Dari percobaan 1 berapakah indeks array terbesar dan terkecil?

// Tulis Jawaban no 1 disini
0,4

2. Jika Isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?

// Tulis Jawaban no 2 yang disini
error karena int

3. Ubah statement pada langkah No 3 menjadi seperti berikut
![Gambar pertanyaan 3](images/P1T3.png)
Apa keluaran dari program? Mengapa bisa demikian?


```Java
// Tulis Jawaban no 3 yang disini
for(int i=0; i<4; i++){ //perulangan untuk menampilkan elemen index array
    System.out.println(bil[i]);//print index array
}
```

    12
    13
    5
    5


### Percobaan 2: Meminta Inputan Pengguna untuk Mengisi Elemen Array
1. Pada percobaan ke-2 akan dilakukan percobaan yang meminta inputan pengguna untuk mengisi elemen array seperti pada flowchart berikut
![Gambar Flowchart](images/FCpercobaan2.png)


```Java

import java.util.Scanner;
Scanner in = new Scanner(System.in);
int[] nilaiUAS = new int[6]; //deklarasi variabel

for(int i = 0; i<6; i++){
    System.out.print("Masukkan nilai UAS ke-"+i + ": ");
    nilaiUAS[i] = sc.nextInt();//untuk inputan nilai uas
}
for(int i = 0; i<6; i++){
    System.out.println("Nilai UAS ke-" + i + " adalah :" +nilaiUAS[i]);//untuk menampilkan nilai uas yang sudah di inputkan
}
```

2. Import dan deklarasikan Scanner untuk keperluan input. 
![Gambar import scanner](images/P2L2.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 1 di atas
import java.util.Scanner;
Scanner sc = new Scanner (System.in);
```

3. Buat array bertipe integer dengan nama nilaiUAS, dengan kapasitas 6 elemen.
![Gambar deklarasi array](images/P2L3.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 3 di atas
int[] nilaiUAS = new int [6];//deklarasi variabel
```

4. Menggunakan perulangan, buat input untuk mengisi elemen dari array nilaiUAS.
![Gambar perulangan input](images/P2L4.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 4 di atas
for(int i = 0; i<nilaiUAS.length; i++){
    System.out.print("Masukkan nilai UAS ke-"+i + ": ");
    nilaiUAS[i] = sc.nextInt();//untuk menginputkan nilai uas
}
```

    Masukkan nilai UAS ke-0: 90
    Masukkan nilai UAS ke-1: 80
    Masukkan nilai UAS ke-2: 70
    Masukkan nilai UAS ke-3: 50
    Masukkan nilai UAS ke-4: 89
    Masukkan nilai UAS ke-5: 78


5. Menggunakan perulangan, tampilkan semua isi elemen dari array nilaiUAS.
![Gambar perulangan print](images/P2L5.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 5 di atas
for(int i = 0; i<6; i++){
    System.out.println("Nilai UAS ke-" + i + "adalah :" +nilaiUAS[i]);//untuk menampilkan nilai uas yang sudah di inputkan
}
```

#### Pertanyaan
1. Ubah statement pada langkah No 4 menjadi seperti berikut ini :
![Gambar pertanyaan1](images/P2T1.png)
Jalankan program, apakah terjadi perubahan? Mengapa demikian?



```Java
// Tulis Jawaban nomor 1 disini
iya pengisian input nilai uas akan berhenti jika sudah mengisi nya selama 5 kali karena di awal int[6] indeks nya sudah 6 dan akan berhanti jika sudah menginputkan selama 5 kali karena kalo di array menghitung nya dari 0
```

2. Apa kegunaan dari `nilaiUAS.length`? 


```Java
// Tulis Jawaban nomor 2 disini
kegunaanya yaitu untuk menghitung jumlah array yang sudah ditentukan sebelumnya semisal "int[] nilaiUAS = new int [6];" jadi hanya bisa mengisi sebanyak 5 kali karena menghitung array itu dari 0
```

3. Ubah statement pada langkah No 5 menjadi seperti berikut ini sehingga program hanya menampilkan status mahasiswa yang lulus saja:
![Gambar pertanyaan1](images/P2T3.png)
Jalankan program dan Jelaskan alur program!


```Java
// Tulis Jawaban nomor 3 disini
for(int i = 0; i < nilaiUAS.length; i++){
    if(nilaiUAS[i] > 70){ //percabangan untuk mencari siswa yang lulus saat UAS
        System.out.println("Mahasiswa ke-" + i + "lulus");
    }
}
```

    Mahasiswa ke-0lulus
    Mahasiswa ke-1lulus
    Mahasiswa ke-4lulus
    Mahasiswa ke-5lulus


### Percobaan 3: Melakukan Operasi Aritmatika terhadap Elemen Array
Pada praktikum ini, akan dilakukan percobaan untuk menjumlahkan Array. Program akan menerima input sebanyak 10 nilai mahasiswa. Kemudian program akan menampilkan nilai rata-rata nilai dari 10 Mahasiswa. Seperti flowchart berikut
![Gambar flowchart](images/FCpercobaan3.png)

1.Import dan deklarasikan Scanner untuk keperluan input. 
![Gambar deklarasi scanner](images/P3L1.png)


```Java
// Tulis Kode program Percobaan 3 Langkah 1 di atas, disini
import java.util.Scanner;
Scanner sc = new Scanner (System.in);
```

2. Buat array nilaiMHS bertipe integer dengan kapasitas 10. Kemudian deklarasikan variable total dan rata seperti gambar berikut ini
![Gambar deklarasi variabel](images/P3L2.png)



```Java
// Tulis Kode program Percobaan 3 Langkah 2 di atas, disini
int nilaiHMS[] = new int [10];//deklarasi variabel
double total; //deklarasi variabel
double rata; //deklarasi variabel
```

3. Menggunakan perulangan, buat input untuk mengisi array nilaiMHS
![Gambar perulangan input](images/P3L3.png)



```Java
// Tulis Kode program Percobaan 3 Langkah 3 di atas, disini
for (int i = 0; i<nilaiHMS.length; i++){
    System.out.print("Masukkan nilai mahasiswa ke - "+(i+1) + ":" );
    nilaiHMS[i] = sc.nextInt();//input nilai mahasiswa
}
```

    Masukkan nilai mahasiswa ke - 1:80
    Masukkan nilai mahasiswa ke - 2:90
    Masukkan nilai mahasiswa ke - 3:70
    Masukkan nilai mahasiswa ke - 4:80
    Masukkan nilai mahasiswa ke - 5:60
    Masukkan nilai mahasiswa ke - 6:90
    Masukkan nilai mahasiswa ke - 7:80
    Masukkan nilai mahasiswa ke - 8:70
    Masukkan nilai mahasiswa ke - 9:60
    Masukkan nilai mahasiswa ke - 10:50


4. Menggunakan perulangan untuk menghitung jumlah keseluruhan nilai.
![Gambar perulangan jumlah](images/P3L4.png)



```Java
// Tulis Kode program Percobaan 3 Langkah 4 di atas, disini
for(int i = 0; i<nilaiHMS.length; i++){
    total +=nilaiHMS[i];
}
```

5. Kemudian hitung nilai rata-rata dengan cara nilai total dibagi jumlah elemen dari array nilaiMHS\
![Gambar hitung rata2](images/P3L5.png)



```Java
// Tulis Kode program Percobaan 3 Langkah 3 di atas, disini
rata = total/nilaiHMS.length;
System.out.println("Rata-rata nilai mahasiswa adalah " +rata);
```

    Rata-rata nilai mahasiswa adalah 73.0


#### Pertanyaan 
1. Pada Percobaan 3 langkah ke-5. Mengapa perhitungan rata berada diluar perulangan?


```Java
//Tulis jawaban no 1 disini
//nanti ikut mengulang perhitungan rata rata nya
```

2. Modifikasi program pada percobaan 3 sehingga bisa mengeluarkan output  seperti gambar berikut ini!
syarat lulus nilai >70
![Gambar pertanyaan 2](images/P3T2.png)


```Java
import java.util.Scanner;
Scanner sc = new Scanner (System.in);
int nilaiHMS[] = new int [10];
double total;// deklarasi variabel
double totalLulus,totalOra;// deklarasi variabel
double rataLulus,rataOra;// deklarasi variabel
int a = 0;// deklarasi variabel
int b = 0;// deklarasi variabel
for (int i = 0; i<nilaiHMS.length; i++){ //perulangan untuk memasukkan nilai siswa sebanyak 10 x 
    System.out.print("Masukkan nilai mahasiswa ke - "+(i+1) + ":" );
    nilaiHMS[i] = sc.nextInt();
}
for (int i = 0; i<nilaiHMS.length; i++){
 if(nilaiHMS[i]>70){//script if else ini untuk menjumlah nilai sesuai kondisi
     totalLulus += nilaiHMS[i];
     a++;
 }else{
     totalOra += nilaiHMS[i];
     b++;
 }
 }
 rataLulus = totalLulus / (nilaiHMS.length - b);//untuk menghitung rata rata mahasiswa yang lulus
 rataOra = totalOra / (nilaiHMS.length - a) ;//untuk menghitung rata rata mahasiswa yang lulus
 System.out.printf("Rata-rata nilai mahasiswa yang Lulus adalah %.2f\n",rataLulus);//untuk menampilkan Rata-rata siswa yang lulus
 System.out.printf("Rata-rata nilai mahasiswa yang Gagal adalah %.2f\n",rataOra);//untuk menampilkan Rata-rata siswa yang Gagal


```

    Masukkan nilai mahasiswa ke - 1:90
    Masukkan nilai mahasiswa ke - 2:100
    Masukkan nilai mahasiswa ke - 3:80
    Masukkan nilai mahasiswa ke - 4:70
    Masukkan nilai mahasiswa ke - 5:60
    Masukkan nilai mahasiswa ke - 6:50
    Masukkan nilai mahasiswa ke - 7:40
    Masukkan nilai mahasiswa ke - 8:30
    Masukkan nilai mahasiswa ke - 9:20
    Masukkan nilai mahasiswa ke - 10:10
    Rata-rata nilai mahasiswa yang Lulus adalah 90.00
    Rata-rata nilai mahasiswa yang Gagal adalah 40.00





    java.io.PrintStream@6515288d



###### Percobaan 4: Pencarian menggunakan Array
Pada praktikum ini, akan dilakukan percobaan untuk mencari lokasi/indeks sebuah angka dalam array. Sesuai dengan flowchart di bawah ini:
![Gambar flowchart searching](images/FCpercobaan4.png) 

1. Buat array arr[] bertipe integer dengan kapasitas 6 dan isi dengan nilai 6, 4, 1, 9, 7, 3, 2 dan 8. Kemudian deklarasikan variabel integer `key` untuk kata kunci pencarian dan variabel `hasil` untuk hasil indeks pencarian. Deklarasi dan inisialisasi seperti gambar berikut ini
![Gambar deklarasi variabel](images/P4L2.png)



```Java
// Tulis Kode program Percobaan 4 Langkah 1 di atas, disini
int [] arr = {6,4,1,9,7,3,2,8};//untuk mendeklarasikan variabel dan memberi nilai array sekalian
int key = 8 ;
int hasil = -1;
```

2. Menggunakan perulangan, lakukan pencarian untuk mendapatkan nilai array yang sesuai dengan key. Bila ada yang sesuai, simpan indeksnya sebagai hasil pencarian
![Gambar perulangan search](images/p4L3.png)



```Java
// Tulis Kode program Percobaan 4 Langkah 2 di atas, disini
for(int i = 0 ;i<arr.length; i++){
    if (key==arr[i]){
        hasil = i;
        break;//untuk menghentikan perulangan jika hasil didapatkan
    }
}
```

3. Tampilkan hasil pencarian dengan kode berikut.
![Gambar perulangan jumlah](images/P4L4.png)



```Java
// Tulis Kode program Percobaan 4 Langkah 3 di atas, disini
System.out.println("Key ada di array ke- "+hasil);//menampilkan hasil
```

    Key ada di array ke- 7


#### Pertanyaan 
1. Pada Percobaan 4 langkah ke-2. Apa kegunaan dari statement `break`?


```Java
// Tulis jawaban no 1 disini
break untuk menghentikan perulangan saat hasil nya ketemu
```

2. Modifikasi program pada percobaan 4 sehingga key yang dicari adalah angka 5. Kemudian jalankan program, amati hasilnya! Jelaskan penyebab dari hasil tersebut! 


```Java
// Tulis jawaban no 2 disini
int [] arr = {6,4,1,9,7,3,2,8};//untuk mendeklarasikan variabel dan memberi nilai array sekalian
int key = 5 ;//untuk mencari angka 
int hasil = -1;//semisal jika tidak mendapatkan key yang dicari dia akan menghasilkan angka - 1
for(int i = 0 ;i<arr.length; i++){
    if (key==arr[i]){
        hasil = i;
        break;//untuk menghentikan perulangan jika hasil didapatkan
    }
}
System.out.println("Key ada di array ke- "+hasil);//menampilkan hasil

```

    Key ada di array ke- -1


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
Scanner sc = new Scanner (System.in);
int checkNum[] = new int[10];
int evenNum[]  = new int [10];
int oddNum[]   = new int [10];
int cEven, cOdd = 0;

for(int i=0; i<checkNum.length; i++){
    checkNum[i] = sc.nextInt();//menginputkan angka angka
}
for(int j=0; j<checkNum.length; j++){
    if(checkNum[j] %2==0){//untuk mencari genap ganjil nya
        evenNum[cEven] = checkNum[j];
        cEven++;
    } else {
        oddNum[cOdd] = checkNum[j];
        cOdd++;
    }
}
```

    1
    2
    3
    4
    5
    6
    7
    8
    9
    12


### Soal 2
Buatlah program yang terdapat array dengan jumlah elemen 5, buatlah input untuk mengisi elemen array tersebut, kemudian tampilkan isi array tersebut dengan urutan terbalik. Seperti ilustrasi gambar dibawah ini.
![Soal 2](images/T2.png)


```Java

import java.util.Scanner;
Scanner sc = new Scanner(System.in);

    int array[];//mendeklarasikan variabel
    array = new int[5];//memberi length array
        for (int i = 0; i < array.length; i++) {
        System.out.print("Masukkan angka : ");
        array[i]=sc.nextInt();//inputan
        }
    System.out.print("Hasil terbalik adalah : ");
    for(int i = array.length-1; i>=0; i--){//untuk perulangan agar angka yang di inputkan muncul mundur/terbalik
        System.out.print(array[i]+", ");
    }
```

    Masukkan angka : 4
    Masukkan angka : 8
    Masukkan angka : 7
    Masukkan angka : 6
    Masukkan angka : 4
    Hasil terbalik adalah : 4, 6, 7, 8, 4, 

##### Soal 3
Buatlah program yang menerima input jumlah elemen array, inputkan isi arraynya, kemudian tampilkan bilangan terbesar dari isi elemen arraynya. Contoh hasil program:
![Soal 3](images/t3.png)


```Java
/* Jawaban Soal 3 disini */
import java.util.Scanner;
Scanner sc = new Scanner (System.in);
System.out.print("Masukkan isi array : ");
int bilanganterbesar = 0;
int isiArray = sc.nextInt();
int[] elemen = new int[isiArray];//isi array sebelumnya sudah diinputkan di dalam inputan diatas,dan hasil isi array itu langsung dimasukkan ke variabel elemen

for(int i = 0; i<elemen.length; i++){
    System.out.println("Masukkan elemen Array ke - "+i+":");
    elemen[i]=sc.nextInt();
    }
for(int i = 0; i<elemen.length; i++){
    if(elemen[i]>bilanganterbesar){//untuk mencari bilangan terbesar
        bilanganterbesar=elemen[i];
    } 
    }
System.out.println("Bilangan terbesar adalah "+bilanganterbesar);


```

    Masukkan isi array : 5
    Masukkan elemen Array ke - 0:
    5
    Masukkan elemen Array ke - 1:
    6
    Masukkan elemen Array ke - 2:
    9
    Masukkan elemen Array ke - 3:
    3
    Masukkan elemen Array ke - 4:
    5
    Bilangan terbesar adalah 9

