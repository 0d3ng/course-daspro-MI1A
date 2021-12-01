# JOBSHEET 14. Fungsi 2

## Tujuan
* Mahasiswa memahami konsep fungsi rekursif
* Mahasiswa mampu mengimplementasikan fungsi rekursif dalam kode program



## Alat dan Bahan
* PC/Laptop
* Browser
* Koneksi internet
* Anaconda3 + Java kernel (opsional)

## Praktikum

### Percobaan 1
Pada percobaan ini akan dilakukan pembuatan program untuk menghitung nilai faktorial dari suatu bilangan dengan menggunakan fungsi rekursif. Selain itu, akan dibuat juga fungsi untuk menghitung nilai faktorial dengan menggunakan algoritma iteratif sebagai pembandingnya

1. Buat fungsi static dengan nama **faktorialRekursif()**, dengan tipe data kembalian fungsi int dan memiliki 1 parameter dengan tipe data int berupa bilangan yang akan dihitung nilai faktorialnya

    ![Gambar 1](images/code14-1.png)


```Java
// Tuliskan kode program Percobaan 1 Langkah 1
static int faktorialRekursif(int n){
    if (n==0){
        return(1);
    } else {
        return (n*faktorialRekursif(n-1));
    }
}
/*membuat fungsi yang memanggil dirinya sendiri, fungsi ini akan terus memanggil dirinya sendiri sampai kondisi yang tidak
memanggil diri sendiri terpenuhi*/
```

2. Buat lagi fungsi static dengan nama **faktorialIteratif()**, dengan tipe data kembalian fungsi int dan memiliki 1 parameter dengan tipe data int berupa bilangan yang akan dihitung nilai faktorialnya.

    ![Gambar 2](images/code14-2.png)


```Java
// Tuliskan kode program Percobaan 1 Langkah 2
static int faktorialIteratif(int n){
    int faktor = 1;
    for (int i=n; i>=1; i--){
        faktor = faktor*i;
    }
    return faktor;
}
/*membuat fungsi yang mengandung perulangan for*/
```

3. Lakukan pemanggilan terhadap kedua fungsi yang telah dibuat sebelumnya, dan tampilkan hasil yang didapatkan.

    ![Gambar 3](images/code14-3.png)


```Java
// Tuliskan kode program Percobaan 1 Langkah 1, 2, 3
System.out.println(faktorialRekursif(5));
System.out.println(faktorialIteratif(5));
/*Memberikan 2 output, dengan masing masing memanggil fungsi faktorialRekursif dan faktorialIteratif dengan parameter 5*/
```

    120
    120


4. Jika ditelusuri, pada saat pemanggilan fungsi faktorialRekursif(5),maka proses yang terjadi dapat diilustrasikan sebagai berikut:

    ![Gambar 4](images/code14-4.png)

#### Pertanyaan
1. Apa yang dimaksud dengan fungsi rekursif?
<p><b>->Fungsi Rekursif adalah fungsi yang dapat memanggil dirinya sendiri</b></p>
2. Bagaimana contoh kasus penggunaan fungsi rekursif ?
<p><b>-> Contoh kasus penggunaan fungsi rekursif yang saya tahu adalah untuk operasi menghitung faktorial dari suatu bilangan</b></p>
3. Pada Percobaan1, apakah hasil yang diberikan fungsi faktorialRekursif() dan fungsi faktorialIteratif() sama? Jelaskan perbedaan alur jalannya program pada penggunaan fungsi rekursif dan fungsi iteratif!
<p><b>-> Pada percobaan 1, hasil yang diberikan kedua fungsi baik rekursif maupun iteratif memiliki hasil yang sama. Perbedaannya terletak alur program. Pada fungsi iteratif, fungsi tersebut menggunakan perulangan for, membuat variabel yang menampung hasil operasi. Sedangkan pada fungsi rekursif, fungsi tersebut menggunakan perulangan dengan kondisi if/else yang akan berhenti ketika kasus awal sebelum pemanggilan fungsi pertama terpenuhi.</b></p>


### Percobaan 2
Pada percobaan ini akan dilakukan pembuatan program untuk menghitung pangkat sebuah bilangan dengan menggunakan fungsi rekursif.

1. Buat fungsi static dengan nama **hitungPangkat()**, dengan tipe data kembalian fungsi int dan memiliki 2 parameter dengan tipe data int berupa bilangan yang akan dihitung pangkatnya dan bilangan pangkatnya

    ![Gambar 5](images/code14-5.png)

2.	Deklarasikan Scanner dengan nama sc
3.	Buatlah dua buah variabel bertipe int dengan nama bilangan dan pangkat
4.	Tambahkan kode berikut ini untuk menerima input dari keyboard

    ![Gambar 6](images/code14-6.png)

5. Lakukan pemanggilan fungsi hitungPangkat yang telah dibuat sebelumnya dengan mengirimkan dua nilai parameter.

    ![Gambar 7](images/code14-7.png)


```Java
// Tuliskan kode program Percobaan 2 Langkah 1 - 5
static int hitungPangkat(int x, int y){
    if (y==0){
        return(1);
    } else {
        return (x * hitungPangkat(x, y-1));
    }
}
/*fungsi static yang berparameter, fungsi ini akan memanggil dirinya sendiri hingga kondisi awal terpenuhi,
disebut dengan fungsi rekursif*/

import java.util.Scanner;
Scanner sc = new Scanner(System.in);
//mengimport dan mendeklarasikan scanner dengan nama sc

int bilangan, pangkat;
//mendeklarasikan 2 variabel bernama 'bilangan' dan 'pangkat' bertipe int yang nantinya bernilai sesuai inputan dari keyboard

System.out.print("Bilangan yang dihitung: ");
bilangan = sc.nextInt();
System.out.print("Pangkat: ");
pangkat = sc.nextInt();
//blok kode untuk menerima inputan dari keyboard

System.out.println(hitungPangkat(bilangan, pangkat));
/*Pada langkah terakhir ini, memberikan sebuah output dimana memanggil fungsi hitungPangkat dengan parameter variabel 'bilangan'
dan variabel 'pangkat'*/
```

    Bilangan yang dihitung: 5
    Pangkat: 2
    25


#### Pertanyaan
1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan!
<p><b>-> Pada fungsi rekursif diatas, pengulangan akan dilakukan sebanyak nilai awal variabel y. Variabel y memiliki nilai awal yang sama dengan input keyboard untuk variabel 'pangkat', karena pada pmanggilan fungsi hitungPangkat di baris terakhir pangkat dikenali sebagai y pada fungsi</b></p>

### Percobaan 3
Pada percobaan ini akan dilakukan pembuatan program untuk menghitung jumlah uang nasabah yang disimpan di Bank setelah mendapatkan bunga selama beberapa tahun dengan menggunakan fungsi rekursif. 

1. Buat fungsi static dengan nama **hitungBunga()**, dengan tipe data kembalian fungsi double dan memiliki 2 parameter dengan tipe  data int berupa saldo nasabah dan lamanya menabung. Pada kasus ini dianggap bunga yang ditentukan oleh bank adalah 11% per tahun. Karena perhitungan bunga adalah bunga * saldo, sehingga untuk menghitung besarnya uang setelah ditambah bunga adalah saldo + bunga * saldo. Dalam hal ini, besarnya bunga adalah 0.11 * saldo, dan saldo dianggap 1 * saldo, sehingga 1 * saldo + 0.11 * saldo dapat diringkas menjadi 1.11 * saldo untuk perhitungan saldo setelah ditambah bunga (dalam setahun).

    ![Gambar 8](images/code14-8.png)

2.	Deklarasikan Scanner dengan nama sc
3.	Buatlah sebuah variabel bertipa double dengan nama saldoAwal dan sebuah variabel bertipe int bernama tahun
4.	Tambahkan kode berikut ini untuk menerima input dari keyboard

 ![Gambar 9](images/code14-9.png)

5. Lakukan pemanggilan fungsi hitungBunga yang telah dibuat sebelumnya dengan mengirimkan dua nilai parameter.

    ![Gambar 10](images/code14-10.png)


```Java
// Tuliskan kode program Percobaan 3 Langkah 1 - 5
static double hitungBunga(double saldo, int tahun){
    if (tahun == 0){
        return(saldo);
    }else{
        return(1.11*hitungBunga(saldo,tahun-1));
    }
}
/*Membuat fungsi static rekursif yang bertipe double untuk menghitung bunga, dengan
menghitung saldo total setelah dihitung bunganya*/

import java.util.Scanner;
Scanner sc = new Scanner(System.in);
/*Mendeklarasikan scanner dengan nama sc*/

double saldoAwal;
int tahun;
//Mendeklrasikan variabel tahun dengan tipe int dan variabel saldoAwal dengan tipe double

System.out.print("Jumlah saldo awal: ");
saldoAwal = sc.nextInt();
System.out.print("Lamanya menabung(tahun): ");
tahun = sc.nextInt();
//Blok kode yang berfungsi untuk menerima input dari keyboard

System.out.print("Jumlah uang setelah " + tahun + " tahun: ");
System.out.println(hitungBunga(saldoAwal, tahun));
```

    Jumlah saldo awal: 1000000
    Lamanya menabung(tahun): 2
    Jumlah uang setelah 2 tahun: 1232100.0


#### Pertanyaan
1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”!
<p><b>-> Pada Percobaan3, yang merupakan base case adalah pada kondisi if dalam fungsi, sedangkan recursion call adalah kondisi else dalam fungsi.</b></p>

## Tugas

1. Buatlah program untuk menampilkan bilangan n sampai 0 dengan menggunakan fungsi rekursif dan fungsi iteratif. (**DeretDescendingRekursif**).


```Java
// Tuliskan jawaban tugas nomor 1
static int urutRekursif(int n){
    if (n==0){
        return 0;
    } else {
        System.out.println(n);
        return (urutRekursif(n-1));
    }
}
/*Membuat fungsi rekursif yang mengurangi nilai n sampai n = 0 serta memberikan output dari n sampai 1*/
static int urutIteratif(int n){
    int faktor = 1;
    for (int i=n; i>=1; i--){
        System.out.println(i);
        faktor = i;
    }
    return 0;
}
/*Membuat fungsi iteratif yang menggunakan for dan men-decrement n hingga bernilai 1 serta meng-outputkan tiap nilai n*/
System.out.println("Urutan bilangan dari 5 sampai 0 adalah sebagai berikut:");
System.out.println(urutRekursif(5));
System.out.println("Urutan bilangan dari 5 sampai 0 adalah sebagai berikut:");
System.out.println(urutIteratif(5));
/*Memanggil fungsi dan mengoutputkannya*/
```

    Urutan bilangan dari 5 sampai 0 adalah sebagai berikut:
    5
    4
    3
    2
    1
    0
    Urutan bilangan dari 5 sampai 0 adalah sebagai berikut:
    5
    4
    3
    2
    1
    0


2. Buatlah program yang di dalamnya terdapat fungsi rekursif untuk menghitung bilangan faktorial. Misalniya f = 8, maka akan dihasilkan 1+2+3+4+5+6+7+8 = 36 (**PenjumlahanRekursif**).


```Java
// Tuliskan jawaban tugas nomor 2
static int penjumlahanRekursif(int n){
    if (n==0){
        System.out.print("0 = ");
        return (0);
    }
    /*base case untuk mengecek dan jika n sudah 0 maka akan memberikan nilai balikan 0 dan memberikan output "0 ="*/
    else {
        System.out.print(n + " + ");
        return (n+penjumlahanRekursif(n-1));
    }
    /*recursion call yang terus menerus mengoutput " harga n + " agar terbentuk sususan output yang rapi, dan 
    memberikan nilai balikan sesuai nilai n ditambah nilai n yang selanjutnya*/
}
System.out.println(penjumlahanRekursif(5));
```

    5 + 4 + 3 + 2 + 1 + 0 = 15


3.	Buat program yang di dalamnya terdapat fungsi rekursif untuk mengecek apakah suatu bilangan n merupakan bilangan prima atau bukan. n dikatakan bukan bilangan prima jika ia habis dibagi dengan bilangan kurang dari n. (**CekPrimaRekursif**).


```Java
// Tuliskan jawaban tugas nomor 3
static int cekPrimaRekursif(int pembagi){
    if(pembagi == 1){
        return 1;
    } else if(n%pembagi == 0){
        return 0;
    } else{
        return cekPrimaRekursif(pembagi-1);
    }
}
/*membuat fungsi yang mengecek bilangan, apakah prima atau bukan, sesuai dengan kondisi yang tertera pada soal
jika habis dibagi dengan bilangan selain 1 maka bukanlah prima dan mereturn nilai 0, begitupun sebaliknya
jika tidak habis dibagi dengan bilangan selain 1 maka bilangan tersebut adalah prima*/

int n = 19;
//int n adalah bilangan yang akan dicek

if(n>1){
    int hasil = cekPrimaRekursif(n-1);
    if(hasil==1){
        System.out.printf("Bilangan %d merupakan bilangan prima",n);
    } else if(hasil==0){
        System.out.printf("Bilangan %d bukanlah bilangan prima",n);
    }
} else{
    System.out.printf("Bilangan %d bukanlah bilangan prima",n);
}
//kondisi yang memanggil fungsi cekPrimaRekursif sekaligus memberikan output berdasarkan hasil dari fungsi cekPrimaRekursif
```

    Bilangan 19 merupakan bilangan prima

4.	Sepasang marmut yang baru lahir (jantan dan betina) ditempatkan pada suatu pembiakan.  Setelah dua bulan pasangan marmut tersebut melahirkan sepasang marmut kembar (jantan dan betina). Setiap pasangan marmut yang lahir juga akan melahirkan sepasang marmut juga setiap 2 bulan.  Berapa pasangan marmut yang ada pada akhir bulan ke-12? Buatlah programnya menggunakan fungsi rekursif! (**Fibonacci**).
Berikut ini adalah ilustrasinya dalam bentuk tabel.

 ![Gambar 11](images/code14-11.PNG)


```Java
// Tuliskan jawaban tugas nomor 4
static int marmut(int bulan, int a, int b){
    if(bulan==0) return a;
    if(bulan==1) return b;
    else return marmut(bulan-1, b, a+b);
}
/*fungsi yang mengecek, dengan alur nilai a + b akan menjadi b pada recursion call berikutnya, dan nilai b akan menjadi nilai a 
pada recursion call berikutnya. Sehingga akan memiliki rumus b+(a+b) pada setiap recursion call*/

System.out.printf("Pasangan marmut pada akhir bulan ke %d adalah %d",12,marmut(12,0,1));
//memanggil fungsi marmut untuk mengetahui hasil pada bulan ke 12
```

    Pasangan marmut pada akhir bulan ke 12 adalah 144




    java.io.PrintStream@5dd5cd88




```Java

```
