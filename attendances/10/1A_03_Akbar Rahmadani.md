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
int[] bil=new int[4]
```

2. Isi masing-masing elemen array bil tadi dengan angka 5, 12, 7, 20.
![Gambar 0](images/P1L3.png)


```Java
int array[] = {5, 12, 7, 20};
```

3. Tampilkan ke layar semua isi elemennya:
![Gambar 4](images/P1L4.png)


```Java
for (int i : array){
    System.out.println(i);
}
```

    5
    12
    7
    20


#### Pertanyaan 
1. Dari percobaan 1 berapakah indeks array terbesar dan terkecil?

- Terbesar 20
- Terkecil 5

2. Jika Isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?


```Java
int array[4] = {5.0, 12867, 7.5, 2000000};

for (int i : array){
    System.out.println(i);
}
System.out.print("Tidak bisa muncul karena bilangan desimal");
```


    |   int array[4] = {5.0, 12867, 7.5, 2000000};

    ']' expected

    


Tidak bisa muncul karena bilangan desimal

3. Ubah statement pada langkah No 3 menjadi seperti berikut
![Gambar pertanyaan 3](images/P1T3.png)
Apa keluaran dari program? Mengapa bisa demikian?


```Java
int array[] = {5, 12, 7, 20};

for(int i=0; i<4; i++){
    System.out.println(bil[i]);
}
```

    0
    0
    0
    0


### Percobaan 2: Meminta Inputan Pengguna untuk Mengisi Elemen Array
1. Pada percobaan ke-2 akan dilakukan percobaan yang meminta inputan pengguna untuk mengisi elemen array seperti pada flowchart berikut
![Gambar Flowchart](images/FCpercobaan2.png)


```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

System.out.println("===Input UAS===");
int[] nilaiUAS = new int[6];
for(int i = 0; i < 6; i++){
    System.out.print("Masukkan nilai UAS ke-" + i +" : ");
    nilaiUAS[i] = sc.nextInt();
}
System.out.println("===Output UAS===");
for(int i = 0; i <6; i++){
    System.out.println("Nilai UAS ke-" + i + " adalah : " + nilaiUAS[i]);
}
```

    ===Input UAS===
    Masukkan nilai UAS ke-0 : 45
    Masukkan nilai UAS ke-1 : 65
    Masukkan nilai UAS ke-2 : 98
    Masukkan nilai UAS ke-3 : 55
    Masukkan nilai UAS ke-4 : 99
    Masukkan nilai UAS ke-5 : 89
    ===Output UAS===
    Nilai UAS ke-0 adalah : 45
    Nilai UAS ke-1 adalah : 65
    Nilai UAS ke-2 adalah : 98
    Nilai UAS ke-3 adalah : 55
    Nilai UAS ke-4 adalah : 99
    Nilai UAS ke-5 adalah : 89


2. Import dan deklarasikan Scanner untuk keperluan input. 
![Gambar import scanner](images/P2L2.png)


```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
```

3. Buat array bertipe integer dengan nama nilaiUAS, dengan kapasitas 6 elemen.
![Gambar deklarasi array](images/P2L3.png)


```Java
System.out.println("===Input UAS===");
int[] nilaiUAS = new int[6];
```

    ===Input UAS===


4. Menggunakan perulangan, buat input untuk mengisi elemen dari array nilaiUAS.
![Gambar perulangan input](images/P2L4.png)


```Java
for(int i = 0; i < 6; i++){
    System.out.print("Masukkan nilai UAS ke-" + i +" : ");
    nilaiUAS[i] = sc.nextInt();
}
```

    Masukkan nilai UAS ke-0 : 98
    Masukkan nilai UAS ke-1 : 56
    Masukkan nilai UAS ke-2 : 8
    Masukkan nilai UAS ke-3 : 66
    Masukkan nilai UAS ke-4 : 33
    Masukkan nilai UAS ke-5 : 100


5. Menggunakan perulangan, tampilkan semua isi elemen dari array nilaiUAS.
![Gambar perulangan print](images/P2L5.png)


```Java
System.out.println("===Output UAS===");
for(int i = 0; i <6; i++){
    System.out.println("Nilai UAS ke-" + i + " adalah : " + nilaiUAS[i]);
}
```

    ===Output UAS===
    Nilai UAS ke-0 adalah : 98
    Nilai UAS ke-1 adalah : 56
    Nilai UAS ke-2 adalah : 8
    Nilai UAS ke-3 adalah : 66
    Nilai UAS ke-4 adalah : 33
    Nilai UAS ke-5 adalah : 100


#### Pertanyaan
1. Ubah statement pada langkah No 4 menjadi seperti berikut ini :
![Gambar pertanyaan1](images/P2T1.png)
Jalankan program, apakah terjadi perubahan? Mengapa demikian?



```Java
for(int i = 0; i < nilaiUAS.length; i++) {
    System.out.print("Masukkan nilai UAS ke-" + i + ": ");
    nilaiUAS[i] = sc.nextInt();
}
```

    Masukkan nilai UAS ke-0: 45
    Masukkan nilai UAS ke-1: 6
    Masukkan nilai UAS ke-2: 99
    Masukkan nilai UAS ke-3: 88
    Masukkan nilai UAS ke-4: 22
    Masukkan nilai UAS ke-5: 54


2. Apa kegunaan dari `nilaiUAS.length`? 

- length dipergunakan untung panjang Arry

3. Ubah statement pada langkah No 5 menjadi seperti berikut ini sehingga program hanya menampilkan status mahasiswa yang lulus saja:
![Gambar pertanyaan1](images/P2T3.png)
Jalankan program dan Jelaskan alur program!


```Java
for(int i = 0; i < nilaiUAS.length; i++){
    if(nilaiUAS[i] > 70){
        System.out.println("Mahasiswa ke-" + i +" lulus");
    }
}
```

    Mahasiswa ke-2 lulus
    Mahasiswa ke-3 lulus


### Percobaan 3: Melakukan Operasi Aritmatika terhadap Elemen Array
Pada praktikum ini, akan dilakukan percobaan untuk menjumlahkan Array. Program akan menerima input sebanyak 10 nilai mahasiswa. Kemudian program akan menampilkan nilai rata-rata nilai dari 10 Mahasiswa. Seperti flowchart berikut
![Gambar flowchart](images/FCpercobaan3.png)

1.Import dan deklarasikan Scanner untuk keperluan input. 
![Gambar deklarasi scanner](images/P3L1.png)


```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

int nilaiMHS[] = new int[10];
double total;
double rata;
for(int i = 0; i<nilaiMHS.length; i++){
    System.out.print("Masukkan nilai Mahasiswa ke-"+(i+1)+" : ");
    nilaiMHS[i] = sc.nextInt();
}
for(int i = 0; i<nilaiMHS.length; i++){
    total+=nilaiMHS[i];
}
rata= total/nilaiMHS.length;
System.out.println("Rata-rata nilai mahasiswa adalah : "+rata);
```

    Masukkan nilai Mahasiswa ke-1 : 45
    Masukkan nilai Mahasiswa ke-2 : 55
    Masukkan nilai Mahasiswa ke-3 : 89
    Masukkan nilai Mahasiswa ke-4 : 100
    Masukkan nilai Mahasiswa ke-5 : 75
    Masukkan nilai Mahasiswa ke-6 : 65
    Masukkan nilai Mahasiswa ke-7 : 12
    Masukkan nilai Mahasiswa ke-8 : 45
    Masukkan nilai Mahasiswa ke-9 : 32
    Masukkan nilai Mahasiswa ke-10 : 49
    Rata-rata nilai mahasiswa adalah : 56.7


2. Buat array nilaiMHS bertipe integer dengan kapasitas 10. Kemudian deklarasikan variable total dan rata seperti gambar berikut ini
![Gambar deklarasi variabel](images/P3L2.png)



```Java
int nilaiMHS[] = new int[10];
double total;
double rata;
```

3. Menggunakan perulangan, buat input untuk mengisi array nilaiMHS
![Gambar perulangan input](images/P3L3.png)



```Java
for(int i = 0; i<nilaiMHS.length; i++){
    System.out.print("Masukkan nilai Mahasiswa ke-"+(i+1)+" : ");
    nilaiMHS[i] = sc.nextInt();
}
```

    Masukkan nilai Mahasiswa ke-1 : 89
    Masukkan nilai Mahasiswa ke-2 : 99
    Masukkan nilai Mahasiswa ke-3 : 65
    Masukkan nilai Mahasiswa ke-4 : 75
    Masukkan nilai Mahasiswa ke-5 : 88
    Masukkan nilai Mahasiswa ke-6 : 46
    Masukkan nilai Mahasiswa ke-7 : 50
    Masukkan nilai Mahasiswa ke-8 : 71
    Masukkan nilai Mahasiswa ke-9 : 12
    Masukkan nilai Mahasiswa ke-10 : 100


4. Menggunakan perulangan untuk menghitung jumlah keseluruhan nilai.
![Gambar perulangan jumlah](images/P3L4.png)



```Java
for(int i = 0; i<nilaiMHS.length; i++){
    total+=nilaiMHS[i];
}
```

5. Kemudian hitung nilai rata-rata dengan cara nilai total dibagi jumlah elemen dari array nilaiMHS\
![Gambar hitung rata2](images/P3L5.png)



```Java
rata= total/nilaiMHS.length;
System.out.println("Rata-rata nilai mahasiswa adalah : "+rata);
```

    Rata-rata nilai mahasiswa adalah : 69.5


#### Pertanyaan 
1. Pada Percobaan 3 langkah ke-5. Mengapa perhitungan rata berada diluar perulangan?

- Agara fariabel tottal datap ditampilkan

2. Modifikasi program pada percobaan 3 sehingga bisa mengeluarkan output  seperti gambar berikut ini!
syarat lulus nilai >70
![Gambar pertanyaan 2](images/P3T2.png)


```Java
import java.util.Scanner;
Scanner sc=new Scanner (System.in);
int nilaiMHS[] = new int[10];
double total1;
double total2;
double rata1;
double rata2;
int a=0;
int b=0;
for(int i=0; i<nilaiMHS.length; i++){
    System.out.print("Masukkan nilai Mahasiswa ke-"+(i+1)+":");
    nilaiMHS[i]=sc.nextInt();
}
for(int i=0; i<nilaiMHS.length; i++){
    if(nilaiMHS[i]>70){
        total1+=nilaiMHS[i];
        a++;
    }
    else if(nilaiMHS[i]<=70){
        total2+=nilaiMHS[i];
        b++;
    }
}
rata1=total1/a;
rata2=total2/b;
System.out.println("Rata-rata nilai mahasiswa yang lulus adalah "+rata1);
System.out.println("Rata-rata nilai mahasiswa yang tidak lulus adalah "+rata2);
```

    Masukkan nilai Mahasiswa ke-1:77
    Masukkan nilai Mahasiswa ke-2:95
    Masukkan nilai Mahasiswa ke-3:65
    Masukkan nilai Mahasiswa ke-4:45
    Masukkan nilai Mahasiswa ke-5:100
    Masukkan nilai Mahasiswa ke-6:99
    Masukkan nilai Mahasiswa ke-7:78
    Masukkan nilai Mahasiswa ke-8:12
    Masukkan nilai Mahasiswa ke-9:32
    Masukkan nilai Mahasiswa ke-10:66
    Rata-rata nilai mahasiswa yang lulus adalah 89.8
    Rata-rata nilai mahasiswa yang tidak lulus adalah 44.0


### Percobaan 4: Pencarian menggunakan Array
Pada praktikum ini, akan dilakukan percobaan untuk mencari lokasi/indeks sebuah angka dalam array. Sesuai dengan flowchart di bawah ini:
![Gambar flowchart searching](images/FCpercobaan4.png) 

1. Buat array arr[] bertipe integer dengan kapasitas 6 dan isi dengan nilai 6, 4, 1, 9, 7, 3, 2 dan 8. Kemudian deklarasikan variabel integer `key` untuk kata kunci pencarian dan variabel `hasil` untuk hasil indeks pencarian. Deklarasi dan inisialisasi seperti gambar berikut ini
![Gambar deklarasi variabel](images/P4L2.png)



```Java
int[] arr = {6, 4, 1, 9, 7, 3, 2, 8};
int key = 3;
int hasil = -1;
```

2. Menggunakan perulangan, lakukan pencarian untuk mendapatkan nilai array yang sesuai dengan key. Bila ada yang sesuai, simpan indeksnya sebagai hasil pencarian
![Gambar perulangan search](images/p4L3.png)



```Java
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
System.out.println("key ada di array ke-"+hasil);
```

    key ada di array ke-5


#### Pertanyaan 
1. Pada Percobaan 4 langkah ke-2. Apa kegunaan dari statement `break`?


```Java
break digunakan untuk menghentikan sebuah perulangan
```

2. Modifikasi program pada percobaan 4 sehingga key yang dicari adalah angka 5. Kemudian jalankan program, amati hasilnya! Jelaskan penyebab dari hasil tersebut! 


```Java
int[] arr = {6, 4, 1, 9, 7, 3, 2, 8};
int key = 5;
int hasil = -1;
for(int i=0; i<arr.length; i++){
    if(key==arr[i]){
        hasil=i;
        break;
    }
}
System.out.println("key ada di array ke-"+hasil);
```

    key ada di array ke--1


### Percobaan 5: Pengurutan bilangan menggunakan Array
Pada praktikum ini, akan dilakukan percobaan untuk mengurutkan angka dalam array. Sesuai dengan flowchart di bawah ini:
![Gambar flowchart sorting](images/FCpercobaan5.png)
1.Buat array arr[] bertipe integer dengan kapasitas 8 dan isi dengan nilai 16, 4, 10, 90, 27, 3, 12 dan 28. Kemudian deklarasikan variabel integer `temp` untuk media penukaran nilai pada variabel. Deklarasi dan inisialisasi seperti gambar berikut ini
![Gambar deklarasi dan inisialisasi](images/P5L1.png)


```Java
int[] arr = {16, 4, 10, 90, 27, 3, 12, 28};
int temp = 0;
```


```Java
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
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

int checkNum[] = new int[10];
int oddNum[] = new int[10];
int evenNum[] = new int[10];
int cEven, cOdd = 0;

for(int i=0; i<checkNum.length; i++){
    System.out.print("Masukkan angka :");
    checkNum[i] = sc.nextInt();
}

for(int j=0; j<checkNum.length; j++){
    if(checkNum[j]%2==0){
        evenNum[cEven] = checkNum[j];
        cEven++;
    }else{
        oddNum[cOdd] = checkNum[j];
        cOdd++;
    }
}

for(int i=0; i<cEven; i++){
    System.out.printf("Bilangan Genap :%d\n",evenNum[i]);
}
for(int i=0; i<cOdd; i++){
    System.out.printf("Bilangan Ganjil :%d\n",oddNum[i]);
}
```

    Masukkan angka :45
    Masukkan angka :66
    Masukkan angka :89
    Masukkan angka :42
    Masukkan angka :5
    Masukkan angka :12
    Masukkan angka :65
    Masukkan angka :44
    Masukkan angka :12
    Masukkan angka :67
    Bilangan Genap :66
    Bilangan Genap :42
    Bilangan Genap :12
    Bilangan Genap :44
    Bilangan Genap :12
    Bilangan Ganjil :45
    Bilangan Ganjil :89
    Bilangan Ganjil :5
    Bilangan Ganjil :65
    Bilangan Ganjil :67


### Soal 2
Buatlah program yang terdapat array dengan jumlah elemen 5, buatlah input untuk mengisi elemen array tersebut, kemudian tampilkan isi array tersebut dengan urutan terbalik. Seperti ilustrasi gambar dibawah ini.
![Soal 2](images/T2.png)


```Java
int array[] = {5, 2, 7, 9, 6};
System.out.printf("%s%5s\n","Index","Value");

for (int i=0; i<array.length;i++){
    System.out.printf("%d\n",array[i]);
}
System.out.print("=========");
for (int i=array.length-1; i>=0;i--){
    System.out.printf("\n%d",array[i]);
}
```

    IndexValue
    5
    2
    7
    9
    6
    =========
    6
    9
    7
    2
    5

### Soal 3
Buatlah program yang menerima input jumlah elemen array, inputkan isi arraynya, kemudian tampilkan bilangan terbesar dari isi elemen arraynya. Contoh hasil program:
![Soal 3](images/t3.png)


```Java
Scanner input = new Scanner (System.in);
int Bilanganterbesar=0;
System.out.println("masukkan isi arry : ");
int[] array = new int[input.nextInt()];
for (int i=0; i<array.length;i++)
{
    System.out.print("isi arry : ");
    array[i]=input.nextInt();
}

for (int i=0; i<array.length;i++)
{
//     System.out.printf("array %2d dengan elemen %5d\n",i,array[i]);
    if (Bilanganterbesar<array[i])Bilanganterbesar= array[i];
}
System.out.print("Bilangan terbesar adalah : "+Bilanganterbesar);
```

    masukkan isi arry : 
    4
    isi arry : 12
    isi arry : 5
    isi arry : 100
    isi arry : 56
    Bilangan terbesar adalah : 100
