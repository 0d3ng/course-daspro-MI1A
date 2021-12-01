# JOBSHEET 14. Fungsi 2

## NAMA : M Ariesta Naeva Arya Dhuta
## NIM      : 2131710053

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
import java.util.Scanner;
Scanner sc = new Scanner(System.in);//scanner seperti biasaa
```

2. Buat lagi fungsi static dengan nama **faktorialIteratif()**, dengan tipe data kembalian fungsi int dan memiliki 1 parameter dengan tipe data int berupa bilangan yang akan dihitung nilai faktorialnya.

    ![Gambar 2](images/code14-2.png)


```Java
// Tuliskan kode program Percobaan 1 Langkah 2
static int faktorialRekursif(int n){//rekursif 
    if ( n == 0){//base case nya
        return(1);
    }else{
        return(n * faktorialRekursif(n-1));//agar n nya terus berkurang saat fungsi nya dipanggil lagi,dan terus dikalikan
    }
}
static int faktorialIteratif(int n){//untuk iteratif
    int faktor = 1;
    for(int i = n; i>= 1; i--){
        faktor = faktor * i;
    }
    return faktor;//recursion call nya
}
```

3. Lakukan pemanggilan terhadap kedua fungsi yang telah dibuat sebelumnya, dan tampilkan hasil yang didapatkan.

    ![Gambar 3](images/code14-3.png)


```Java
// Tuliskan kode program Percobaan 1 Langkah 1, 2, 3
System.out.println(faktorialRekursif(5));//menampilkan hasil akhir dari faktorialRekursif
System.out.println(faktorialIteratif(5));//menampilkan hasil akhir dari faktorialIteratif
```

    120
    120


4. Jika ditelusuri, pada saat pemanggilan fungsi faktorialRekursif(5),maka proses yang terjadi dapat diilustrasikan sebagai berikut:

    ![Gambar 4](images/code14-4.png)

#### Pertanyaan
1. Apa yang dimaksud dengan fungsi rekursif?
    -Pengeksekusian fungsi didalam fungsi itu sendiri
2. Bagaimana contoh kasus penggunaan fungsi rekursif ?
    -Mencari Faktorial
3. Pada Percobaan1, apakah hasil yang diberikan fungsi faktorialRekursif() dan fungsi faktorialIteratif() sama? Jelaskan perbedaan alur jalannya program pada penggunaan fungsi rekursif dan fungsi iteratif!
    -sama,rekursif dikurang langsung,jika iteratif dikurangnya lewat perulanganya 


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
    if (y == 0) {//base case
        return (1);
    }else{
        return(x * hitungPangkat(x, y - 1));//recursion call
    }
}
int bilangan;
int pangkat;

System.out.print("Bilangan yang dihitung: ");
bilangan = sc.nextInt();
System.out.print("Pangkat: ");
pangkat = sc.nextInt();

System.out.println(hitungPangkat(bilangan, pangkat));
```

    Bilangan yang dihitung: 5
    Pangkat: 2
    25


#### Pertanyaan
1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan! 

- sampai y nya 0

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
        return (saldo);
    }else{
        return (1.11 * hitungBunga(saldo, tahun - 1));
    }
}
int saldoAwal;
int tahun;
double total = 0;
System.out.print("Jumlah saldo awal: ");
saldoAwal = sc.nextInt();
System.out.print("Lamanya menabung (tahun):");
tahun = sc.nextInt();
total = hitungBunga(saldoAwal, tahun);
System.out.printf("Jumlah uang setelah " + tahun + " tahun: %.0f",total);
```

    Jumlah saldo awal: 20000
    Lamanya menabung (tahun):4
    Jumlah uang setelah 4 tahun: 30361




    java.io.PrintStream@7a582a18



#### Pertanyaan
1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”!


-base case = di yang if
-recursion call = di syntax return (1.11 * hitungBunga(saldo, tahun - 1));

## Tugas

1. Buatlah program untuk menampilkan bilangan n sampai 0 dengan menggunakan fungsi rekursif dan fungsi iteratif. (**DeretDescendingRekursif**).


```Java
// Tuliskan jawaban tugas nomor 1
// Tuliskan jawaban tugas nomor 1
static int faktorialRekursif(int n){//kalo rekursif rada susah karna pake if else

    if ( n == 0){
        return(0);
    }else{
        System.out.print(n+" ");
        return(faktorialRekursif(n-1));//
        
    }
}
static int faktorialIteratif(int n){//fungsi iteratif ini enak bisa pakai for
    for(int i = n; i>=1; i--){
        System.out.print(i+" ");
    }
    return (0);
}
System.out.println(faktorialRekursif(5));
System.out.print(faktorialIteratif(5));
```

    5 4 3 2 1 0
    5 4 3 2 1 0

2. Buatlah program yang di dalamnya terdapat fungsi rekursif untuk menghitung bilangan faktorial. Misalniya f = 8, maka akan dihasilkan 1+2+3+4+5+6+7+8 = 36 (**PenjumlahanRekursif**).


```Java
// Tuliskan jawaban tugas nomor 2

int i = 1;
System.out.print("Masukkan Bilangan: ");
int anjay = sc.nextInt();
printf("1");
static int faktorialRekursif(int n) {
    if (i == n) return 1;
    else {
        i++;
        System.out.print( " + "+i);
        return(i + faktorialRekursif(n));
    }
}

System.out.println(" = "+ faktorialRekursif(anjay));
```

    Masukkan Bilangan: 4
    1 + 2 + 3 + 4 = 10


3.	Buat program yang di dalamnya terdapat fungsi rekursif untuk mengecek apakah suatu bilangan n merupakan bilangan prima atau bukan. n dikatakan bukan bilangan prima jika ia habis dibagi dengan bilangan kurang dari n. (**CekPrimaRekursif**).


```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
```


```Java
// Tuliskan jawaban tugas nomor 3
int anj=0;
int prima;
printf("Masukkan bilangan : ");
int jay = sc.nextInt();
static int cekPrima(int a){
    if (a != 0){
        if(jay % a == 0){
            anj++;
            return cekPrima(a - 1);
        }else{
            return cekPrima(a - 1);
        }
    }
       if(anj > 2){
            System.out.print("Bukan Prima");//untuk mengecek angka yang bukan prima
            return 0;
        }
        else if (anj == 2){
            System.out.print("Prima"); //untuk mengecek angka yang prima
            return 0;
        }
    return cekPrima(a - 1);
}
prima = cekPrima(jay);

```

    Masukkan bilangan : 3
    Prima

4.	Sepasang marmut yang baru lahir (jantan dan betina) ditempatkan pada suatu pembiakan.  Setelah dua bulan pasangan marmut tersebut melahirkan sepasang marmut kembar (jantan dan betina). Setiap pasangan marmut yang lahir juga akan melahirkan sepasang marmut juga setiap 2 bulan.  Berapa pasangan marmut yang ada pada akhir bulan ke-12? Buatlah programnya menggunakan fungsi rekursif! (**Fibonacci**).
Berikut ini adalah ilustrasinya dalam bentuk tabel.

 ![Gambar 11](images/code14-11.PNG)


```Java
// Tuliskan jawaban tugas nomor 4
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
printf("Masukkan bilangan : ");
int faceles = sc.nextInt();
static long fib(int poc){
    if (poc == 1 || poc == 2 ){//rumus fibonaaci
        return 1;
    }else{
        return (fib(poc-1) + fib(poc-2));//jadi ini logika nya seperti pohon faktor
    }
}

System.out.print("Jumlah marmut yang ada dalam waktu "+faceles+" adalah "+fib(faceles)+" pasang marmut ");



```

    Masukkan bilangan : 12
    Jumlah marmut yang ada dalam waktu 12 adalah 144 pasang marmut 


```Java

```
