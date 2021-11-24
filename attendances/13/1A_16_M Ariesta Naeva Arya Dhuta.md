# JOBSHEET 13. Fungsi 1

## Tujuan
* Mahasiswa mampu memahami penggunaan fungsi static pada Java dengan parameter dan mengembalikan nilai.
* Mahasiswa mampu membuat program menggunakan fungsi static dan mengeksekusi fungsi tersebut.


## Alat dan Bahan
* PC/Laptop
* Browser
* Koneksi internet
* Anaconda3 + Java kernel (opsional)

## Praktikum

### Percobaan 1: Fungsi Void (tidak menggunakan return value)

1.	Buat fungsi **beriSalam** bertipe void yang digunakan untuk mencetak **“Halo! Selamat Pagi”**.
![Gambar 1](images/1.1.png)

2. Eksekusi atau panggil fungsi **beriSalam**.
![Gambar 2](images/1.2.png)


```Java
static void beriSalam(){
    System.out.println("Halo! Selamat Pagi");//fungsi tanpa parameter yang hanya untuk menampilkan halo selamat pagi
}
static void beriSalam(){
    System.out.println("Halo! Selamat Pagi");
}
beriSalam();
```

3. Buat fungsi **beriUcapan** dengan sebuah parameter bertipe String.
![Gambar 3](images/1.3.png)

4. Buatlah variabel **salam** bertipe String kemudian eksekusi atau panggil fungsi **beriUcapan** dengan mengisi parameternya dengan variable **salam** yang sudah dibuat.
![Gambar 3](images/1.4.png)


```Java
static void beriSalam(){
    System.out.println("Halo! Selamat Pagi");
}
static void beriSalam(){
    System.out.println("Halo! Selamat Pagi");
}
beriSalam();

static void beriSalam(){
    System.out.println("Halo! Selamat Pagi");
}
static void beriUcapan(String ucapan){
    System.out.println(ucapan);
}

beriSalam();
String salam = "Selamat datang di pemrograman Java";
beriUcapan(salam);//memanggil fungsi beriUcapan dengan String ucapan yang sudah diganti dengan "Selamat datang di pemrograman Java"
```

    Halo! Selamat Pagi
    Halo! Selamat Pagi
    Selamat datang di pemrograman Java


#### Pertanyaan
1. Jelaskan perbedaan fungsi **beriSalam** dan **beriUcapan** pada praktikum 1!

fungsi beriSAlam itu untuk menampilkan Halo Selamat Pagi saja jika di panggil
jika fungsi beriUcapan itu untuk format string saja

2. Jelaskan cara pemanggilan sebuah fungsi void yang berparameter dan tanpa parameter!


```Java
cara pemanggilanya yaitu jika berparameter terdapat variabel string untuk mengeksekusi dengan cara memanggil fungsi
jika tanpa parameter itu seperti contoh di atas tidak perlu variable untuk pengeksekusian
```

### Percobaan 2: Fungsi dengan return value (Bukan void)
Pada Percobaan 2, kode program yang dibuat digunakan untuk menghitung luas persegi dengan membuat fungsi **luasPersegi** yang menggunakan parameter.
1. Buat fungsi **luasPersegi**  untuk menghitung luas persegi yang mengembalikan nilai luas (int) dan parameter masukan sisi (int).
![Gambar 4](images/2.1.png)

2.	Eksekusi atau panggil fungsi luasPersegi dengan cara membuat variabel baru yaitu **luasan**, kemudian isi variabel tersebut dengan memanggil fungsi luasPersegi dan mengisi parameter sisi. Selanjutnya cetak variabel luasan untuk menampilkan luas persegi panjang
![Gambar 5](images/2.2.png)


```Java
static int luasPersegi (int sisi){
    int luas = sisi * sisi ;//fungsi yang dibuat untuk memakai rumus menghitung luas
    return luas;//untuk mengembalikan
}
int luasan = luasPersegi(5);//disini fungsi luasPersegi dipanggil dan sisi nya sudah diinputkan di fungsinya
System.out.println("Luas Persegi dengan sisi 5 =" + luasan);
```

    Luas Persegi dengan sisi 5 =25


#### Pertanyaan
1. jelaskan mengapa ketika memanggil fungsi **luasPersegi** harus membuat variabel baru yaitu luasan?


```Java
variabel luasan itu untuk dipanggil saat mau menampilkan hasil nya,jika tidak maka nanti tidak bisa ditampilkan kalo pake fungsi juga udh beda lagi
```

2. Jelaskan kegunaan **return luas** pada percobaan 2 diatas!


```Java
return luas untuk mengembalikan variabel luas ketempet asalnya
```

3. Modifikasilah program di percobaan 2, dengan membuat panjang **sisi** sebagai inputan!


```Java
import java.util.Scanner;
Scanner sc = new Scanner (System.in);
static int luasPersegi (int sisi){
    int luas = sisi * sisi ;
    return luas;
}
int masuk = sc.nextInt();//inputan
int luasan = luasPersegi(masuk);//disini memanggil fungsi luasPersegi dan variabel nya sudah di inputkan di inputan sebelumnya
System.out.printf("Luas Persegi dengan sisi %d = %d ",masuk,luasan);
```

    6
    Luas Persegi dengan sisi 6 = 36 




    java.io.PrintStream@710bef2a



### Percobaan 3: Fungsi dapat meng-CALL Fungsi Lain
Pada Percobaan 3, kode program yang dibuat digunakan untuk mengimplementasikan bahwa fungsi dapat meng-CALL fungsi yang lain. Dimana dalam percobaan ini terdapat fungsi **Kali dan Kurang**. 
1. Buatlah fungsi **Kali** yang mengembalikan nilai H (int) dan parameter masukan C dan D (int).
![Gambar 9](images/3.1.png)

2.	Buatlah fungsi **Kurang** yang mengembalikan nilai X (int) dan parameter masukan A dan B (int) dan memanggil fungsi Kali.
![Gambar 10](images/3.2.png)

3. Lakukan import class Scanner sebagai inputan di langkah selajutnya.

4. Eksekusi atau panggil fungsi **Kurang** .
![Gambar 11](images/3.4.png)


```Java
// Tuliskan kode program Percobaan 3 Langkah 1, 2, 3 & 4
static int Kali(int C, int D){
    int H;
    H = (C + 10) % (D + 19);
    return H;
}
static int Kurang (int A, int B){
    int X;
    A = A + 7;
    B = B + 4;
    X = Kali (A, B);
    return X;
}
int nilai1, nilai2;
Scanner input = new Scanner (System.in);
System.out.println("Masukkan nilai 1:");
nilai1=input.nextInt();
System.out.println("Masukkan Nilai 2:");
nilai2=input.nextInt();
int hasil = Kurang(nilai1, nilai2);
System.out.println("Hasil akhir adalah " + hasil);
```

    Masukkan nilai 1:
    10
    Masukkan Nilai 2:
    3
    Hasil akhir adalah1


#### Pertanyaan
1. Modifikasilah percobaan diatas dimana di fungsi **Kali** dapat memanggil fungsi **Kurang** kemudian eksekusi atau panggil fungsi Kali


```Java
static int Kali(int C, int D){
    int H;
    C = C + 5;
    D = D + 8;
    H = Kurang (C, D);
    return H;
}
static int Kurang (int A, int B){
    int X;
    A = A + 7;
    B = B + 4;
    X = A - B;
    return X;
}
int nilai1, nilai2;
Scanner input = new Scanner (System.in);
System.out.println("Masukkan nilai 1:");
nilai1=input.nextInt();
System.out.println("Masukkan Nilai 2:");
nilai2=input.nextInt();
int hasil = Kali(nilai1, nilai2);
System.out.println("Hasil akhir adalah " + hasil);
```

    Masukkan nilai 1:
    4
    Masukkan Nilai 2:
    6
    Hasil akhir adalah -2


2. Jelaskan alur jalannya program di percobaan 3 mulai dari input sampai keluar output!


```Java
input nilai 1
input nilai 2
memanggil fungsi kurang
memanggil fungsi kali
lalu menampilkan hasil
```

### Percobaan 4: Mengubah Program Tidak Menggunakan Fungsi dan Menggunakan Fungsi
Pada Percobaan 4, kode program yang dibuat digunakan untuk menghitung luas persegi panjang dan volume balok tanpa menggunakan fungsi dan dengan menggunakan fungsi.
1. Import dan deklarasikan Scanner dengan nama **input**
![Gambar 9](images/4.1.png)

2. Buatlah inputan panjang, lebar, dan tinggi 
![Gambar 10](images/4.2.png)

3. Hitung luas persegi panjang dan volume balok
![Gambar 10](images/4.3.png)


```Java
import java.util.Scanner;
Scanner input = new Scanner (System.in);
int p,l,t,L,vol;

System.out.println("Masukkan panjang");
p=input.nextInt();
System.out.println("Masukkan lebar");
l=input.nextInt();
System.out.println("Masukkan tinggi");
t=input.nextInt();
L = p*l;
System.out.println("Masukkan Persegi Panjang Adalah "+L);

vol=p*l*t;
System.out.println("Volume balok adalah"+ vol);
```

    Masukkan panjang
    5
    Masukkan lebar
    6
    Masukkan tinggi
    8
    Masukkan Persegi Panjang Adalah 30
    Volume balok adalah240


4. Program menghitung luas persegi dan volume balok diatas jika dibuatkan fungsi maka terdapat 3 fungsi yaitu hitungLuas, hitungVolume dan fungsi main, seperti dibawah ini:

Fungsi hitungLuas

![Gambar 10](images/4.4Luas.png)

Fungsi hitungVolume
![Gambar 10](images/4.4Volume.png)



5. Eksekusi/panggil fungsi **hitungLuas** dan **hitungVolume**

![Gambar 10](images/4.5.png)


```Java
static int hitungVolume(int tinggi, int a, int b){
    int volume = hitungLuas(a,b)* tinggi;
    return volume;
}
static int hitungLuas(int pjg, int lb){
    int Luas = pjg * lb;
    return Luas;
}
Scanner input = new Scanner (System.in);
int p,l,v,t,L, vol;

System.out.println("Masukkan panjang");
p=input.nextInt();
System.out.println("Masukkan lebar");
l=input.nextInt();
System.out.println("Masukkan tinggi");
t=input.nextInt();

L = hitungLuas(p,l);//sebelumnya kan kita menginputkan angka p dan l yang berarti panjang dan lebar,di syntax ini kita memanggil fungsi hitungLuas dan di variabel pjg dan lb sudah terisi dengan nilai yang sudah di inputkan sebelumnya
System.out.println("Masukkan Persegi Panjang Adalah "+L);
vol=hitungVolume(t,p,l);//sama seperti di L
System.out.println("Volume balok adalah"+ vol);
```

    Masukkan panjang
    6
    Masukkan lebar
    5
    Masukkan tinggi
    8
    Masukkan Persegi Panjang Adalah 30
    Volume balok adalah240


#### Pertanyaan
1. Jelaskan kegunaan parameter yang terdapat didalam fungsi hitungLuas dan hitungVolume!


```Java
untuk menampung tipe data int
```

2. Setelah melakukan percobaan 4, menurut anda manakah program yg lebih efisien apakah menggunakan fungsi atau tanpa fungsi? Jelaskan!


```Java
kalau untuk sekali saja ya lebih efisien yang pertama jika rumus nya dipakai terus menerus maka lebih efisien yang pakai fungsi
```

### Percobaan 5: Fungsi Menggunakan Array dan Variabel Global
Pada Percobaan 5, kode program yang dibuat digunakan untuk menghitung total nilai yang ada didalam array dengan membuat 3 fungsi yaitu isiarray, hitTol, dan tampilArray.
1. Buatlah **variable global total dan i** bertipe int
![Gambar 9](images/5.1pertama.png)

2. Buatlah fungsi **isiarray** bertipe int dengan parameter angka bertipe int 

![Gambar 10](images/5.1.png)

3. Buatlah fungsi **tampilArray** bertipe **void** dengan parameter data array **arr** bertipe int

![Gambar 10](images/5.2.png)

4. Buatlah fungsi **hitTot** bertipe int dengan parameter data array **arr** bertipe int

![Gambar 10](images/5.3.png)

5. Import dan deklarasikan Scanner dengan nama **input**

![Gambar 10](images/4.1.png)

6. Eksekusi atau panggil ketiga fungsi yaitu **isiarray, tampilArray, dan hitTot**, kemudian jalankan program!

![Gambar 10](images/5.6.png)


```Java
// Tuliskan kode program Percobaan 4 Langkah 1 s/d 6
import java.util.Scanner;
Scanner input = new Scanner(System.in);
static int total = 0,i;

static int [] isiarray (int angka){
    Scanner input =new Scanner (System.in);
    int array[]= new int [angka];
    for (i = 0; i<array.length; i++){
        System.out.println("Masukkan data ke - "+(i+1));
        array[i] = input.nextInt();//fungsi array untuk menginputkan
    }
    return array;
}

static void tampilArray(int [] arr){
    for (i=0; i<arr.length; i++){
        System.out.println("Nilai yang anda inputkan ke "+(i+1));//fungsi array untuk menampilkan
        System.out.println(arr[i]);
    }
}
static int hitTot(int [] arr){
    for(i=0; i<arr.length; i++){
        total += arr[i];
    }
    return total;
}
System.out.println("Masukkan jumlah data yang ingin anda inputkan: ");
int jum = input.nextInt();
int []dataArray = isiarray(jum);
tampilArray(dataArray);
total= hitTot(dataArray);
System.out.println("Total nilai= "+total)
```

    Masukkan jumlah data yang ingin anda inputkan: 
    6
    Masukkan data ke - 1
    5
    Masukkan data ke - 2
    4
    Masukkan data ke - 3
    3
    Masukkan data ke - 4
    6
    Masukkan data ke - 5
    7
    Masukkan data ke - 6
    7
    Nilai yang anda inputkan ke 1
    5
    Nilai yang anda inputkan ke 2
    4
    Nilai yang anda inputkan ke 3
    3
    Nilai yang anda inputkan ke 4
    6
    Nilai yang anda inputkan ke 5
    7
    Nilai yang anda inputkan ke 6
    7
    Total nilai= 32


#### Pertanyaan
1. Jelaskan mengapa fungsi tampil array dibuat bertipe void, sedangkan isiarray dan hitTot bertipe int!


```Java
karena di isiarray dan hittot harus menginputkan sesuatu tetapi di tampilArray hanya menampilkan saja
```

2. Menurut pendapat anda apakah fugsi isiarray dan hitTot dapat diganti dengan tipe void? Jelaskan dan buktikan dengan program!


```Java
// Tuliskan kode program Percobaan 4 Langkah 1 s/d 6
import java.util.Scanner;
Scanner input = new Scanner(System.in);
static int total = 0,i;

static int [] isiarray (int angka){
    Scanner input =new Scanner (System.in);
    int array[]= new int [angka];
    for (i = 0; i<array.length; i++){
        System.out.println("Masukkan data ke - "+(i+1));
        array[i] = input.nextInt();
    }
    return array;
}

static void tampilArray(int [] arr){
    for (i=0; i<arr.length; i++){
        System.out.println("Nilai yang anda inputkan ke "+(i+1));
        System.out.println(arr[i]);
    }
}
static void hitTot(int [] arr){
    for(i=0; i<arr.length; i++){
        total += arr[i];
    }
    return total;
}
System.out.println("Masukkan jumlah data yang ingin anda inputkan: ");
int jum = input.nextInt();
int []dataArray = isiarray(jum);
tampilArray(dataArray);
total= hitTot(dataArray);
System.out.println("Total nilai= "+total)
//tidak bisa karena di fungsi yang disebutkan harus menginputkan atau melakukan sesuatu seperti rumus dan juga perlu return
```


    |       return total;

    incompatible types: unexpected return value

    


## Tugas

1. Buatlah sebuah static method yang bernama Max3(int bil1, int bil2, int bil3) yang menerima 3 buah parameter bilangan integer dan mengembalikan sebuah bilangan integer yang merupakan nilai maksimum diantara ketiga bilangan tersebut. 


```Java
// Tuliskan jawaban nomor 1
static int Max3(int A, int B, int C){//fungsi untuk mencari nilai terbesar
    int l = 0;
        if(A>B && A>C){
            l = A;
        }else if(B>A && B>C){
            l = B;
        } else{
            l = C;
        }
    return l;
}
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int bil1,bil2,bil3,max;
System.out.print("bil 1 = ");
bil1=sc.nextInt();
System.out.print("bil 2 = ");
bil2=sc.nextInt();
System.out.print("bil 3 = ");
bil3=sc.nextInt();

max=Max3(bil1,bil2,bil3);//memanggil fungsi Max3(fungsi untuk mencari nilai terbesar)
System.out.print("Nilai Terbesar adalah = "+ max)


```

    bil 1 = 2
    bil 2 = 1
    bil 3 = 5
    Nilai Terbesar adalah = 5

2. Disebuah restoran terdapat 3 menu yang dijual yaitu nasi goreng, soto, dan sate. Harga nasi goreng Rp. 20.000, soto Rp. 15.000, dan sate Rp. 25.000. Restoran tersebut buka dari hari senin sampai jumat. Berikut ini merupakan tabel pejualan perhari untuk masing-masing menu di restoran tersebut dari hari senin sampai jumat
![Gambar 13](images/soal3.png)

Buatlah Fungsi sebagai berikut:
 * Fungsi menampilkan menu favorit di hari selasa dan jumat (menu favorit diasumsikan adalah menu yang paling banyak terjual di hari tersebut)
 * Fungsi untuk menghitung pemasukan restoran tersebut mulai hari senin sampai jumat.
 * Fungsi untuk menghitung berapa porsi yang terjual untuk masing-masing menu yaitu nasi goreng, soto, dan sate mulai senin sampai jumat.


```Java
// Tuliskan jawaban nomor 2
static String hari[] = {"Senin","Selasa","Rabu","Kamis","Jumat"};
static String panganan[]= {"Nasi Goreng","Soto","Sate"};
static int porsi[][] = {{20,15,35,24,70},
                        {30,40,10,28,35},
                        {5,10,50,48,15}};
static void Fav(){
    int max = 0;
    int max1 = 0;
    String pangan1="";
    String pangan2="";
     for(int i = 0; i<porsi.length; i++){////if untuk mencari porsi terbesar dan juga mencari nama makanan
         for(int j = 0; j<porsi[0].length; j++){
             if(porsi[i][1]>max)
             {
                  max = porsi[i][1];
                  pangan1 = panganan[i];
             }
             if(porsi[i][3]>max1)
             {
                  max1 = porsi[i][3];
                  pangan2 = panganan[i];
             }
             
             
         }
     }
        System.out.println("Favorit di hari selasa adalah "+max+" Porsi "+pangan1);
        System.out.println("Favorit di hari jumat adalah "+max1+ " Porsi "+pangan2);
}

Fav();
static void duit(){
    int nasgor = 0 ;
    int duitNasgor  = 0 ;
    int soto = 0 ;
    int duitSoto  = 0 ;
    int sate = 0 ;
    int duitSate  = 0 ;
    for(int i = 0; i<porsi.length; i++){//untuk menjumlah semua pemasokan
        for(int j = 0; j<porsi[0].length; j++){
           if (i == 0){
               nasgor += porsi[i][j];
           }
            
        }
    }
     for(int i = 0; i<porsi.length; i++){
        for(int j = 0; j<porsi[0].length; j++){
           if (i == 1){
               soto += porsi[i][j];
           }
        }
     }
      for(int i = 0; i<porsi.length; i++){
        for(int j = 0; j<porsi[0].length; j++){
           if (i == 2){
               sate += porsi[i][j];
           }
        }
     }
    duitNasgor = nasgor * 20000 ;
    duitSoto = soto * 15000 ;
    duitSate = sate * 25000 ;
    System.out.println("\nPemasokan uang Nasi Goreng pada hari senin sampai jum'at adalah " +duitNasgor) ;
     System.out.println("Pemasokan uang Soto pada hari senin sampai jum'at adalah " +duitSoto) ;
     System.out.println("Pemasokan uang Sate pada hari senin sampai jum'at adalah " +duitSate) ;
}

duit();
    static void pors(){//fungsi untuk menjumlah semua porsi
        int sego = 0;
        int sto = 0;
        int ste = 0;
        for(int i = 0; i<porsi.length; i++){
        for(int j = 0; j<porsi[0].length; j++){
           if (i == 0){
               sego += porsi[i][j];
           }
            
        }
    }
     for(int i = 0; i<porsi.length; i++){
        for(int j = 0; j<porsi[0].length; j++){
           if (i == 1){
               sto += porsi[i][j];
           }
        }
     }
      for(int i = 0; i<porsi.length; i++){
        for(int j = 0; j<porsi[0].length; j++){
           if (i == 2){
               ste += porsi[i][j];
           }
        }
     }
        System.out.println("\nPorsi Nasi Goreng pada hari senin sampai jum at yang terjual adalah " +sego+ " Porsi");
        System.out.println("Porsi Soto pada hari senin sampai jum at yang terjual adalah " +sto+ " Porsi");
        System.out.println("Porsi Sate pada hari senin sampai jum at yang terjual adalah " +ste+ " Porsi");
    }
pors();
    
    

    

```

    Favorit di hari selasa adalah 40 Porsi Soto
    Favorit di hari jumat adalah 48 Porsi Sate
    
    Pemasokan uang Nasi Goreng pada hari senin sampai jum'at adalah 3280000
    Pemasokan uang Soto pada hari senin sampai jum'at adalah 2145000
    Pemasokan uang Sate pada hari senin sampai jum'at adalah 3200000
    
    Porsi Nasi Goreng pada hari senin sampai jum at yang terjual adalah 164 Porsi
    Porsi Soto pada hari senin sampai jum at yang terjual adalah 143 Porsi
    Porsi Sate pada hari senin sampai jum at yang terjual adalah 128 Porsi





```Java

```
