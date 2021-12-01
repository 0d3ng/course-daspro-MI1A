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
static int faktorialRekursif(int n){ // deklarasi fungsi rekursif
    if(n == 0){ // base case
        return(1); 
    } else {
        return(n * faktorialRekursif(n - 1)); // recursion call
    }
}
```

2. Buat lagi fungsi static dengan nama **faktorialIteratif()**, dengan tipe data kembalian fungsi int dan memiliki 1 parameter dengan tipe data int berupa bilangan yang akan dihitung nilai faktorialnya.

    ![Gambar 2](images/code14-2.png)


```Java
// Tuliskan kode program Percobaan 1 Langkah 2
static int faktorialIteratif(int n) { // deklarasi fungsi iteratif
    int faktor = 1; // instansiasi variabel faktor
    for (int i = n; i >= 1; i--) { // sama halnya dengan base case
        faktor = faktor * i; // operasi perhitungan faktor
    }
    return faktor; // menampung hasil perhitungan dan ditampung untuk proses selanjutnya
}
```

3. Lakukan pemanggilan terhadap kedua fungsi yang telah dibuat sebelumnya, dan tampilkan hasil yang didapatkan.

    ![Gambar 3](images/code14-3.png)


```Java
// Tuliskan kode program Percobaan 1 Langkah 1, 2, 3
static int faktorialRekursif(int n){ // deklarasi fungsi rekursif
    if(n == 0){ // base case
        return(1);
    } else {
        return(n * faktorialRekursif(n - 1)); // recursion call
    }
}

static int faktorialIteratif(int n) { // deklarasi fungsi iteratif
    int faktor = 1; // instansiasi variabel faktor
    for (int i = n; i >= 1; i--) { // sama halnya dengan base case
        faktor = faktor * i; // operasi perhitungan faktor
    }
    return faktor; // menampung hasil perhitungan dan ditampung untuk proses selanjutnya
}

System.out.println(faktorialRekursif(5)); // pemanggilan fungsi rekursif
System.out.println(faktorialIteratif(5)); // pemanggilan fungsi iteratif
```

    120
    120


4. Jika ditelusuri, pada saat pemanggilan fungsi faktorialRekursif(5),maka proses yang terjadi dapat diilustrasikan sebagai berikut:

    ![Gambar 4](images/code14-4.png)

#### Pertanyaan

1. Apa yang dimaksud dengan fungsi rekursif?

--> Yaitu sebuah fungsi yang memanggil fungsi itu sendiri hingga kondisi yang berada di base case terpenuhi.

2. Bagaimana contoh kasus penggunaan fungsi rekursif ?

--> Contohnya seperti menghitung faktorial dari sebuah bilangan.

3. Pada Percobaan1, apakah hasil yang diberikan fungsi faktorialRekursif() dan fungsi faktorialIteratif() sama? Jelaskan perbedaan alur jalannya program pada penggunaan fungsi rekursif dan fungsi iteratif!

--> Iya sama. Pada fungsi rekursif, perulangan akan berhenti jika kondisi benar. Sedangkan pada fungsi iteratif, perulangan akan berhenti jika kondisi salah.

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
static int hitungPangkat(int x, int y) { // deklarasi fungsi rekursif
    if (y == 0) { // base case
        return (1);
    } else {
        return (x * hitungPangkat(x, y - 1)); // recursion call
    }
}
import java.util.Scanner; // memasukkan inputan dari keyboard
Scanner sc = new Scanner(System.in); // deklarasi Scanner
int bilangan, pangkat; // deklarasi variabel

System.out.print("Bilangan yang dihitung: ");
bilangan = sc.nextInt(); // memasukkan bilangan
System.out.print("Pangkat: ");
pangkat = sc.nextInt(); // memasukkan pangkat
System.out.println(hitungPangkat(bilangan, pangkat)); // pemanggilan fungsi hitungPangkat

```

    Bilangan yang dihitung: 3
    Pangkat: 4
    81


#### Pertanyaan
1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan!

--> Sampai variabel y = 0 atau base case terpenuhi.

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
static double hitungBunga(double saldo, int tahun) { // deklarasi fungsi rekursif
    if (tahun == 0) { // base case
        return (saldo);
    } else {
        return (1.11 * hitungBunga(saldo, tahun - 1)); // recursion call
    }
}
import java.util.Scanner; // untuk memasukkan inputan dari keyboard
Scanner sc = new Scanner(System.in); // deklarasi scanner
double saldoAwal; int tahun; // deklarasi variabel

System.out.print("Jumlah saldo awal: ");
saldoAwal = sc.nextInt(); // memasukkan saldo awal
System.out.print("Lamanya menabung (tahun): ");
tahun = sc.nextInt(); // memasukkan tahun

System.out.print("Jumlah uang setelah " + tahun + " tahun: "); // menampilkan jumlah uang
System.out.println(hitungBunga(saldoAwal, tahun)); // memanggil fungsi hitungBunga
```

    Jumlah saldo awal: 1000000
    Lamanya menabung (tahun): 1
    Jumlah uang setelah 1 tahun: 1110000.0


#### Pertanyaan
1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”!

--> base case :  if (tahun == 0) {
        return (saldo);
    }

--> recursion call : else {
        return (1.11 * hitungBunga(saldo, tahun - 1));
    }

## Tugas

1. Buatlah program untuk menampilkan bilangan n sampai 0 dengan menggunakan fungsi rekursif dan fungsi iteratif. (**DeretDescendingRekursif**).


```Java
// Tuliskan jawaban tugas nomor 1
static void deretDescendingRekursif(int bil) { // deklarasi fungsi rekursif
    if(bil >= 0) { // base case
        System.out.print(bil);
        deretDescendingRekursif(bil - 1); // recursion call
    }
}

static void deretDescendingIteratif(int bil) { // deklarasi fungsi iteratif
    for(int i = bil; i >= 0; i--) System.out.print(i);
}

deretDescendingRekursif(7); // pemanggilan fungsi rekursif
System.out.println(); // menampilkan hasil fungsi
deretDescendingIteratif(5); // pemanggilan fungsi iteratif
```

    76543210
    543210

2. Buatlah program yang di dalamnya terdapat fungsi rekursif untuk menghitung bilangan faktorial. Misalniya f = 8, maka akan dihasilkan 1+2+3+4+5+6+7+8 = 36 (**PenjumlahanRekursif**).


```Java
// Tuliskan jawaban tugas nomor 2
int i = 0; // instansiasi variabel
static int faktorialRekursif(int n){ // deklarasi fungsi rekursif
    if(i == n){ // base case
        return 0;
    } else { 
        i++; // untuk menambah 1 nilai
        System.out.print(i   + "+");
        return(i + faktorialRekursif(n)); // recursion call
    }
}
System.out.print(" = " + faktorialRekursif(8)); // pemanggilan fungsi rekursif
```

    1+2+3+4+5+6+7+8+ = 36

3.	Buat program yang di dalamnya terdapat fungsi rekursif untuk mengecek apakah suatu bilangan n merupakan bilangan prima atau bukan. n dikatakan bukan bilangan prima jika ia habis dibagi dengan bilangan kurang dari n. (**CekPrimaRekursif**).


```Java
// Tuliskan jawaban tugas nomor 3
int n ; // deklarasi variabel

int cekPrima(int p){ // deklarasi fungsi rekursif cekPrima
    if (p == 1){ // base case jika p = 1 maka hasil akan ditampung 1
        return 1;
        
    }else if(n%p==0){ // base case jika n modulus p = 0 maka hasil akan ditampung
        return 0;
        
    }else{
        return cekPrima(p-1); // recursion call 
    }
}

System.out.print("Masukkan nilai: "); // menampilkan "Masukkan nilai: "
n = sc.nextInt(); // memasukkan nilai dari keyboard
    if(n>1){ // kondisi jika n>1 maka akan dilakukan pengecekan
        int p = cekPrima(n-1); // recursion call
        if (p==1){ // jika hasil dari perhitungan adalah 1 atau bilangan itu sendiri maka bilangan tersebut merupakan bilangan prima
            printf("%d Bilangan Prima\n", n);
            
        }else{ // jika hasil dari perhitungan bukan 1 atau bilangan yang lain maka bilangan tersebut bukan merupakan bilangan prima
            printf("%d Bukan Bilangan Prima\n", n);
        }
    }else{ // jika hasil dari perhitungan bukan 1 atau bilangan yang lain maka bilangan tersebut bukan merupakan bilangan prima
        printf("Bukan Bilangan Prima\n", n);
    }
```

    Masukkan nilai: 3
    3 Bilangan Prima


4.	Sepasang marmut yang baru lahir (jantan dan betina) ditempatkan pada suatu pembiakan.  Setelah dua bulan pasangan marmut tersebut melahirkan sepasang marmut kembar (jantan dan betina). Setiap pasangan marmut yang lahir juga akan melahirkan sepasang marmut juga setiap 2 bulan.  Berapa pasangan marmut yang ada pada akhir bulan ke-12? Buatlah programnya menggunakan fungsi rekursif! (**Fibonacci**).
Berikut ini adalah ilustrasinya dalam bentuk tabel.

 ![Gambar 11](images/code14-11.PNG)


```Java
// Tuliskan jawaban tugas nomor 4
static int pembiakan(int n, int a, int b) { // deklarasi fungsi rekursif pembiakan dengan 3 paremeter
     if (n == 0) return a; // base case jika n = 0 akan ditampung di variabel b
     if (n == 1) return b; // base case jika n = 0 akan ditampung di variabel a
     return pembiakan(n - 1, b, a + b); // recursion call untuk mengembalikan nilai ke fungsi pemanggilnya
}

printf("Pada bulan ke %d terdapat %d pasangan ",12 , pembiakan(12, 0, 1)); // memanggil dan menampilkan hasil dari pembiakan
```

    Pada bulan ke 12 terdapat 144 pasangan 
