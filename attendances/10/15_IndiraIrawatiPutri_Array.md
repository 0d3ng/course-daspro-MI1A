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
int[] bil=new int[4]; //intansiasi array
```

2. Isi masing-masing elemen array bil tadi dengan angka 5, 12, 7, 20.
![Gambar 0](images/P1L3.png)


```Java
// Tulis Kode program Percobaan 1 Langkah 3 di atas
bil[0]=5; //deklarasi array
bil[1]=12; //deklarasi array
bil[2]=7;  //deklarasi array
bil[3]=20;  //deklarasi array
```




    20



3. Tampilkan ke layar semua isi elemennya:
![Gambar 4](images/P1L4.png)


```Java
// Tulis Kode program Percobaan 1 Langkah 4
System.out.println(bil[0]); //menampilkan setiap array
System.out.println(bil[1]); //menampilkan setiap array
System.out.println(bil[2]); //menampilkan setiap array
System.out.println(bil[3]); //menampilkan setiap array
```

    5
    12
    7
    20


#### Pertanyaan 
1. Dari percobaan 1 berapakah indeks array terbesar dan terkecil?

// Tulis Jawaban no 1 disini
indeks array terbesar =[3]=5 indeks array terkecil =[0]=20


2. Jika Isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?

// Tulis Jawaban no 2 yang disini
Tidak bisa/error karena tipe datanya int.

3. Ubah statement pada langkah No 3 menjadi seperti berikut
![Gambar pertanyaan 3](images/P1T3.png)
Apa keluaran dari program? Mengapa bisa demikian?


```Java
// Tulis Jawaban no 3 yang disini
for(int i=0;i<4;i++){
    System.out.println(bil[i]); //menampilkan setiap array
}
```

    5
    12
    7
    20


### Percobaan 2: Meminta Inputan Pengguna untuk Mengisi Elemen Array
1. Pada percobaan ke-2 akan dilakukan percobaan yang meminta inputan pengguna untuk mengisi elemen array seperti pada flowchart berikut
![Gambar Flowchart](images/FCpercobaan2.png)

# // Tulis Kode program Percobaan 2 Langkah 1 di atas
Scanner sc = new Scanner(System.in);
int nilaiUAS[] = new int[6];
for(int i=0; i<6; i++){
    System.out.print("Masukan nilai UAS ke-"+i+": ");
    nilaiUAS[i]=sc.nextInt();
}
for(int i=0; i<6; i++){
    System.out.println("Nilai UAS ke-"+i+" adalah "+nilaiUAS[i]);
}

2. Import dan deklarasikan Scanner untuk keperluan input. 
![Gambar import scanner](images/P2L2.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 1 di atas
import java.util.Scanner;
Scanner sc =new Scanner(System.in);
```

3. Buat array bertipe integer dengan nama nilaiUAS, dengan kapasitas 6 elemen.
![Gambar deklarasi array](images/P2L3.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 3 di atas
int[] nilaiUAS=new int[6]; //intansiasi array
```

4. Menggunakan perulangan, buat input untuk mengisi elemen dari array nilaiUAS.
![Gambar perulangan input](images/P2L4.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 4 di atas
for(int i=0;i<6;i++){
    System.out.print("Masukkan nila UAS ke-"+i+":"); //menampilkan setiap array
    nilaiUAS[i]=sc.nextInt(); 
}
```

    Masukkan nila UAS ke-0:100
    Masukkan nila UAS ke-1:90
    Masukkan nila UAS ke-2:100
    Masukkan nila UAS ke-3:90
    Masukkan nila UAS ke-4:80
    Masukkan nila UAS ke-5:90


5. Menggunakan perulangan, tampilkan semua isi elemen dari array nilaiUAS.
![Gambar perulangan print](images/P2L5.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 5 di atas
for(int i=0;i<6;i++){
    System.out.println("Nilai UAS ke-"+i+"adalah:"+nilaiUAS[i]); //menampilkan setiap array
}
```

    Nilai UAS ke-0adalah:100
    Nilai UAS ke-1adalah:90
    Nilai UAS ke-2adalah:100
    Nilai UAS ke-3adalah:90
    Nilai UAS ke-4adalah:80
    Nilai UAS ke-5adalah:90


#### Pertanyaan
1. Ubah statement pada langkah No 4 menjadi seperti berikut ini :
![Gambar pertanyaan1](images/P2T1.png)
Jalankan program, apakah terjadi perubahan? Mengapa demikian?



```Java
// Tulis Jawaban nomor 1 disini
for(int i=0;i<nilaiUAS.length;i++){
    System.out.print("Masukkan nilai UAS ke-"+i+":"); //menampilkan setiap array
    nilaiUAS[i]=sc.nextInt(); 
}
```

    Masukkan nilai UAS ke-0:100
    Masukkan nilai UAS ke-1:90
    Masukkan nilai UAS ke-2:100
    Masukkan nilai UAS ke-3:90
    Masukkan nilai UAS ke-4:80
    Masukkan nilai UAS ke-5:100


Perubahan yang terjadi adalah kita bisa memasukkan nilai sesuai yang kita mau, dengan coding lebih sederhana.
Mengapa demikian karena memberikan code nilaiUAS[i]=sc.nextInt();

2. Apa kegunaan dari `nilaiUAS.length`? 

// Tulis Jawaban nomor 2 disini
Memerikasa panjang dari variabel dengan tipe data String


3. Ubah statement pada langkah No 5 menjadi seperti berikut ini sehingga program hanya menampilkan status mahasiswa yang lulus saja:
![Gambar pertanyaan1](images/P2T3.png)
Jalankan program dan Jelaskan alur program!


```Java
// Tulis Jawaban nomor 3 disini
for(int i=0;i<nilaiUAS.length;i++){
    if(nilaiUAS[i]>70){
        System.out.println("Mahasiswa ke-"+i+"lulus"); //menampilkan setiap array
    }
}
```

    Mahasiswa ke-0lulus
    Mahasiswa ke-1lulus
    Mahasiswa ke-2lulus
    Mahasiswa ke-3lulus
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
Scanner sc=new Scanner(System.in);
```

2. Buat array nilaiMHS bertipe integer dengan kapasitas 10. Kemudian deklarasikan variable total dan rata seperti gambar berikut ini
![Gambar deklarasi variabel](images/P3L2.png)



```Java
// Tulis Kode program Percobaan 3 Langkah 2 di atas, disini
int nilaiMHS[]=new int[10]; //intansiasi array
double total; //deklarasi variabel
double rata; //deklarasi variabel
```

3. Menggunakan perulangan, buat input untuk mengisi array nilaiMHS
![Gambar perulangan input](images/P3L3.png)



```Java
// Tulis Kode program Percobaan 3 Langkah 3 di atas, disini
for(int i=0; i<nilaiMHS.length;i++){
    System.out.print("Masukkan nilai Mahasiswa ke-"+(i+1)+":"); //menampilkan setiap array
    nilaiMHS[i]=sc.nextInt();
}
```

    Masukkan nilai Mahasiswa ke-1:100
    Masukkan nilai Mahasiswa ke-2:90
    Masukkan nilai Mahasiswa ke-3:80
    Masukkan nilai Mahasiswa ke-4:100
    Masukkan nilai Mahasiswa ke-5:90
    Masukkan nilai Mahasiswa ke-6:80
    Masukkan nilai Mahasiswa ke-7:100
    Masukkan nilai Mahasiswa ke-8:90
    Masukkan nilai Mahasiswa ke-9:100
    Masukkan nilai Mahasiswa ke-10:80


4. Menggunakan perulangan untuk menghitung jumlah keseluruhan nilai.
![Gambar perulangan jumlah](images/P3L4.png)



```Java
// Tulis Kode program Percobaan 3 Langkah 4 di atas, disini
for(int i=0;i<nilaiMHS.length;i++){
    total+=nilaiMHS[i];
}
```

5. Kemudian hitung nilai rata-rata dengan cara nilai total dibagi jumlah elemen dari array nilaiMHS\
![Gambar hitung rata2](images/P3L5.png)



```Java
// Tulis Kode program Percobaan 3 Langkah 3 di atas, disini
rata=total/nilaiMHS.length; //membagi untuk hasil rata-rata
System.out.println("Rata-rata nilai mahasiswa adalah"+rata); //menampilkan setiap array
```

    Rata-rata nilai mahasiswa adalah91.0


#### Pertanyaan 
1. Pada Percobaan 3 langkah ke-5. Mengapa perhitungan rata berada diluar perulangan?

// Tulis jawaban no 1 disini
Rata-rata tidak memerlukan perulangan.

2. Modifikasi program pada percobaan 3 sehingga bisa mengeluarkan output  seperti gambar berikut ini!
syarat lulus nilai >70
![Gambar pertanyaan 2](images/P3T2.png)


```Java
// Tulis jawaban no 2 disini
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int nilaiMHS[] = new int[10]; //intansiasi array
double total1, total2; //Deklarasi variabel
double rata1, rata2; //Deklarasi variabel
int lulus, tidaklulus; //Deklarasi Variabel
for(int i = 0; i < nilaiMHS.length; i++){
    System.out.print("Masukkan nilai Mahasiswa ke- " + (i+1)+ " : "); //menampilkan setiap array
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
System.out.println("Rata-rata nilai mahasiswa adalah " + rata1); //menampilkan setiap array
System.out.println("Rata-rata nilai mahasiswa adalah " + rata2); //menampilkan setiap array
```

    Masukkan nilai Mahasiswa ke- 1 : 100
    Masukkan nilai Mahasiswa ke- 2 : 90
    Masukkan nilai Mahasiswa ke- 3 : 80
    Masukkan nilai Mahasiswa ke- 4 : 45
    Masukkan nilai Mahasiswa ke- 5 : 60
    Masukkan nilai Mahasiswa ke- 6 : 70
    Masukkan nilai Mahasiswa ke- 7 : 60
    Masukkan nilai Mahasiswa ke- 8 : 100
    Masukkan nilai Mahasiswa ke- 9 : 80
    Masukkan nilai Mahasiswa ke- 10 : 90
    Rata-rata nilai mahasiswa adalah 90.0
    Rata-rata nilai mahasiswa adalah 58.75


### Percobaan 4: Pencarian menggunakan Array
Pada praktikum ini, akan dilakukan percobaan untuk mencari lokasi/indeks sebuah angka dalam array. Sesuai dengan flowchart di bawah ini:
![Gambar flowchart searching](images/FCpercobaan4.png) 

1. Buat array arr[] bertipe integer dengan kapasitas 6 dan isi dengan nilai 6, 4, 1, 9, 7, 3, 2 dan 8. Kemudian deklarasikan variabel integer `key` untuk kata kunci pencarian dan variabel `hasil` untuk hasil indeks pencarian. Deklarasi dan inisialisasi seperti gambar berikut ini
![Gambar deklarasi variabel](images/P4L2.png)



```Java
// Tulis Kode program Percobaan 4 Langkah 1 di atas, disini
int[] arr={6,4,1,9,7,3,2,8}; 
//inisialisasi array=menentukan jumlah elemennya
//serta menentukan nilai dari setiap elemennya
int key=3; // deklarasi variabel
int hasil=-1; //deklarasi variabel
```

2. Menggunakan perulangan, lakukan pencarian untuk mendapatkan nilai array yang sesuai dengan key. Bila ada yang sesuai, simpan indeksnya sebagai hasil pencarian
![Gambar perulangan search](images/p4L3.png)



```Java
// Tulis Kode program Percobaan 4 Langkah 2 di atas, disini
for(int i=0; i<arr.length; i++){
    if(key==arr[i]){
        hasil=i;
        break; //Perintah khusus untuk memberhentikan perulangan sebelum waktunya.
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

// Tulis jawaban no 1 disini
Perintah khusus untuk memberhentikan perulangan sebelum waktunya.

2. Modifikasi program pada percobaan 4 sehingga key yang dicari adalah angka 5. Kemudian jalankan program, amati hasilnya! Jelaskan penyebab dari hasil tersebut! 


```Java
// Tulis jawaban no 2 disini

int[] arr = {16, 4, 10, 90, 27, 3, 12, 28};
//inisialisasi array=menentukan jumlah elemennya
//serta menentukan nilai dari setiap elemennya
int temp = 0;//deklarasi variabel

for(int i = 0; i < arr.length; i++){
    for(int j = 1; j < (arr.length-i); j++){
        if(arr[j-1] > arr[j]){
            temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
        }
    }
}

System.out.println("Hasil pengurutan: ");  //menampilkan setiap array
for(int i = 0; i < arr.length; i++)
    System.out.println(arr[i]);  //menampilkan setiap array

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


### Percobaan 5: Pengurutan bilangan menggunakan Array
Pada praktikum ini, akan dilakukan percobaan untuk mengurutkan angka dalam array. Sesuai dengan flowchart di bawah ini:
![Gambar flowchart sorting](images/FCpercobaan5.png)
1.Buat array arr[] bertipe integer dengan kapasitas 8 dan isi dengan nilai 16, 4, 10, 90, 27, 3, 12 dan 28. Kemudian deklarasikan variabel integer `temp` untuk media penukaran nilai pada variabel. Deklarasi dan inisialisasi seperti gambar berikut ini
![Gambar deklarasi dan inisialisasi](images/P5L1.png)


```Java
// Tulis Kode program Percobaan 5 Langkah 1 disini
int[]arr={16,4,10,90,27,3,12,28};
//inisialisasi array=menentukan jumlah elemennya
//serta menentukan nilai dari setiap elemennya
int temp=0; //deklarasi variabel
```


```Java
// Tulis Kode program Percobaan 5 Langkah 2 di atas, disini
for(int i=0;i<arr.length;i++){
    for(int j=1; j<(arr.length-i);j++){
        if(arr[j-1]>arr[j]);
        temp=arr[j-1];
        arr[j-1]=arr[j];
        arr[j]=temp;
    }
}
```

2. Menggunakan perulangan, lakukan pengurutan bilangan dengan menukar posisi indeks tersebut dengan indeks berikutnya. Perulangan dilakukan untuk menukar posisi berulang kali. 
![Gambar sorting](images/P5L2.png)

3. Tampilkan hasil pengurutan dengan menggunakan perulangan
![Gambar print](images/P5L3.png)


```Java
// Tulis Kode program Percobaan 5 Langkah 3 di atas, disini
System.out.println("Hasil pengaturan:"); //menampilkan setiap array
for(int i=0;i<arr.length;i++)
    System.out.println(arr[i]);  //menampilkan setiap array
```

    Hasil pengaturan:
    28
    12
    3
    27
    90
    10
    4
    16


## Tugas
### Soal 1
Buatlah program yang **sesuai** dengan alur _flowchart_ di bawah ini
![Soal 1](images/soal1.png)

Flowchart diatas menggambarkan alur program yang membaca 10 masukan pengguna berupa integer dan menyimpannya. Kemudian angka ganjil dan genap disimpan kembali ke dalam variabel lain yang terpisah


```Java
/* Jawaban Soal 1 disini */
import java.util.Scanner;
Scanner sc=new Scanner(System.in);
int checkNum[]=new int[10]; //intansiasi array
int evenNum[]=new int[10]; //intansiasi array
int oddNum[]=new int[10]; //intansiasi array
int cEven, c0dd=0; //deklarasi variabel

for(int i=0;i<checkNum.length;i++){
    System.out.printf("Masukkan Number ke-%d:",i); //menampilkan setiap array
    checkNum[i]=sc.nextInt();//intansiasi array
}
for(int j=0;j<checkNum.length;j++){
    if(checkNum[j]%2==0){
        evenNum[cEven]=checkNum[j];
        cEven++;
    }else{
        oddNum[c0dd]=checkNum[j];
        c0dd++;
    }
}
System.out.printf("\nJumlah genap ada %d",cEven,c0dd);//menampilkan setiap array
System.out.print("\nBilangan genap adalah\n");//menampilkan setiap array
for(int i=0;i<cEven; i++){
    System.out.printf("=%d\n",evenNum[i]);//menampilkan setiap array
}
System.out.printf("\nJumlah ganjil ada %d",cEven,c0dd);//menampilkan setiap array
System.out.print("\nBilangan ganjil adalah\n");//menampilkan setiap array
for(int i=0;i<c0dd; i++){
    System.out.printf("=%d\n",oddNum[i]);//menampilkan setiap array
}
```

    Masukkan Number ke-0:1
    Masukkan Number ke-1:2
    Masukkan Number ke-2:3
    Masukkan Number ke-3:4
    Masukkan Number ke-4:5
    Masukkan Number ke-5:6
    Masukkan Number ke-6:7
    Masukkan Number ke-7:8
    Masukkan Number ke-8:9
    Masukkan Number ke-9:10
    
    Jumlah genap ada 5
    Bilangan genap adalah
    =2
    =4
    =6
    =8
    =10
    
    Jumlah ganjil ada 5
    Bilangan ganjil adalah
    =1
    =3
    =5
    =7
    =9


### Soal 2
Buatlah program yang terdapat array dengan jumlah elemen 5, buatlah input untuk mengisi elemen array tersebut, kemudian tampilkan isi array tersebut dengan urutan terbalik. Seperti ilustrasi gambar dibawah ini.
![Soal 2](images/T2.png)


```Java
/* Jawaban Soal 2 disini */
import java.util.Scanner;
Scanner sc=new Scanner(System.in);
int array[]; //deklarasi variabel
array=new int[5];//intansiasi array
for(int i=0; i<array.length;i++){
    System.out.print("Masukkan angka:"); //menampilkan setiap array
    array[i]=sc.nextInt();//intansiasi array
}
System.out.print("Hasil terbalik adalah:");
for(int i=array.length-1;i>=0;i--){
    System.out.print(array[i]+",");//menampilkan setiap array
}

```

    Masukkan angka:5
    Masukkan angka:2
    Masukkan angka:7
    Masukkan angka:9
    Masukkan angka:6
    Hasil terbalik adalah:6,9,7,2,5,

### Soal 3
Buatlah program yang menerima input jumlah elemen array, inputkan isi arraynya, kemudian tampilkan bilangan terbesar dari isi elemen arraynya. Contoh hasil program:
![Soal 3](images/t3.png)


```Java
/* Jawaban Soal 3 disini */
import java.util.*;
    int maksimum, jumlah, i, lokasi = 1, array[];//deklarasi variabel
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan isi array: ");//intansiasi array
    jumlah = scan.nextInt();
    array = new int[jumlah];//intansiasi array
    
    for(i = 0; i < jumlah; i++) {
      System.out.print("Masukkan elemen array ke-"+ (i+1) +": " );//menampilkan setiap array
      array[i] = scan.nextInt();//intansiasi array
    }
    maksimum = array[0];
    for(i = 0; i < jumlah; i++) {
      if (array[i] > maksimum){
        maksimum = array[i];//intansiasi array
        lokasi = i+1;
      }
    }
    System.out.println("Bilangan terbesar adalah "+maksimum);//menampilkan setiap array
```

    Masukkan isi array: 5
    Masukkan elemen array ke-1: 25
    Masukkan elemen array ke-2: 78
    Masukkan elemen array ke-3: 12
    Masukkan elemen array ke-4: 63
    Masukkan elemen array ke-5: 99
    Bilangan terbesar adalah 99



```Java

```
