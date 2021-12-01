# JOBSHEET 14. Fungsi 2

##### Nama : Nabila Rasyidah
##### NIM : 2131710047

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
static int faktorialRekursif(int n){ //deklarasi fungsi bertipe int yaitu faktorialRekursif dengan parameter int n
    if (n == 0){  // base case, rekursi berakhir jika nilai n = 0
        return (1);  //jika nilai sudah mencapai 0, maka hasil yg keluar adalah 1
    } else {
        return (n * faktorialRekursif(n - 1));  //recursion call, output yg direturn adalah hasil dari proses
    }
}
```

2. Buat lagi fungsi static dengan nama **faktorialIteratif()**, dengan tipe data kembalian fungsi int dan memiliki 1 parameter dengan tipe data int berupa bilangan yang akan dihitung nilai faktorialnya.

    ![Gambar 2](images/code14-2.png)


```Java
// Tuliskan kode program Percobaan 1 Langkah 2
static int faktorialIteratif(int n){ //fungsi tipe int yaitu faktorialIteratif dengan parameter int n
    int faktor = 1;  //deklarasi variabel faktor
    for (int i = n; i >= 1; i--){ //iterasi atau perulangan
        faktor = faktor * i;
    }
    return faktor;  //mengembalikan nilai faktor
}
```

3. Lakukan pemanggilan terhadap kedua fungsi yang telah dibuat sebelumnya, dan tampilkan hasil yang didapatkan.

    ![Gambar 3](images/code14-3.png)


```Java
// Tuliskan kode program Percobaan 1 Langkah 1, 2, 3
System.out.println(faktorialRekursif(5)); //memanggil fungsi faktorialRekursif dengan input nilai 5
System.out.println(faktorialIteratif(5)); //memanggil fungsi faktorialIteratif dengan input nilai 5
```

    120
    120


4. Jika ditelusuri, pada saat pemanggilan fungsi faktorialRekursif(5),maka proses yang terjadi dapat diilustrasikan sebagai berikut:

    ![Gambar 4](images/code14-4.png)

#### Pertanyaan
1. Apa yang dimaksud dengan fungsi rekursif?
2. Bagaimana contoh kasus penggunaan fungsi rekursif ?
3. Pada Percobaan1, apakah hasil yang diberikan fungsi faktorialRekursif() dan fungsi faktorialIteratif() sama? Jelaskan perbedaan alur jalannya program pada penggunaan fungsi rekursif dan fungsi iteratif!


##### Jawaban
1. merupakan sebuah fungsi seperti metode perulangan tanpa iterasi yang memanggil fungsi itu sendiri hingga kondisi terpenuhi.
2. digunakan untuk menghitung dan mencari nilai faktor, pangkat.
3. sama. kalau fungsi rekursif, program akan berhenti jika kondisinya(base case) bernilai benar. kalau fungsi iteratif, program akan berhenti jika kondisi(syarat perulangan) bernilai salah.

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
static int hitungPangkat(int x, int y) { //fungsi tipe int yaitu hitungPangkat dengan parameter int x, dan y
    if (y == 0){ //base case, rekursi berakhir jika nilai y = 0
        return (1); //output yg keluar jika y = 0 adalah 1
    } else { //recursion call
        return (x * hitungPangkat(x, y -1));  //mengembalikan nilai yg ada dalam proses
    }
}
import java.util.Scanner; 
Scanner sc = new Scanner(System.in); //deklarasi library scanner
int bilangan, pangkat; //deklaasi variabel
System.out.print("Bilangan yang dihitung: "); //
bilangan = sc.nextInt(); //input bilangan
System.out.print("Pangkat: ");
pangkat = sc.nextInt(); //input pangkat
System.out.println(hitungPangkat(bilangan, pangkat)); //menampilkan hasil dari fungsi hitungPangkat
```

    Bilangan yang dihitung: 4
    Pangkat: 2
    16


#### Pertanyaan
1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan!

~ program akan terus memanggil fungsi pada recursion call, dan berhenti dijalankan jika nilai y = 0

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
static double hitungBunga(double saldo, int tahun) { //fungsi tipe double yaitu hitungBunga dengan parameter double saldo dan int tahun
    if (tahun == 0) { //base case, rekursi berakhir jika nilai tahun = 0
        return (saldo); //jika tahun = 0, maka output yg keluar adalah nilai saldo
    } else { //recursion call
        return (1.11 * hitungBunga(saldo, tahun - 1)); //mengembalikan nilai yang ada dalam proses
    }
}
import java.util.Scanner;
Scanner sc = new Scanner(System.in); //deklarasi library scanner
double saldoAwal; //deklarasi variabel saldoAwala
int tahun; //deklarasi variabel tahun
System.out.print("Jumlah saldo awal: ");
saldoAwal = sc.nextInt(); //untuk inputan saldoAwal
System.out.print("Lamanya menabung (tahun): ");
tahun = sc.nextInt(); //untuk inputan tahun
System.out.print("Jumlah uang setelah " +  tahun + " tahun: "); 
System.out.println(hitungBunga(saldoAwal, tahun)); //output yg muncul adalah hasil dari pemanggilang fungsi hitungBunga(saldoAwal, tahun).
//saldoAwal akan menjadi variabel saldo tipe double, dan tahun menjadi variabel int tahun, setelah itu nilai akan diproses dalam fungsi
```

    Jumlah saldo awal: 5000000
    Lamanya menabung (tahun): 5
    Jumlah uang setelah 5 tahun: 8425290.775500005


#### Pertanyaan
1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”!

##### Jawaban
1. base case

    if (tahun == 0) {
        return (saldo); }
    
2. recursion call

    else {
        return (1.11 * hitungBunga(saldo, tahun - 1)); }

## Tugas

1. Buatlah program untuk menampilkan bilangan n sampai 0 dengan menggunakan fungsi rekursif dan fungsi iteratif. (**DeretDescendingRekursif**).


```Java
// Tuliskan jawaban tugas nomor 1
static void deretRekursif(int n) { //fungsi tipe void yaitu deretRekursif dengan parameter int n
    if(n >= 0) { //base case
        System.out.print(n);
        deretDescendingRekursif(n - 1); //recursion call
    }
}

static void deretIteratif(int n) { //fungsi tipe void yaitu deretIteratif dengan parameter int n
    for(int i = n; i >= 0; i--) System.out.print(i); //perulangan menggunakan for
}

deretRekursif(5); //memanggil fungsi rekursif
System.out.println("\ndengan rekursif");
System.out.println();
deretIteratif(5); //memanggil fungsi iteratif
System.out.print("\ndengan iteratif");
```


    |   // Tuliskan jawaban tugas nomor 1

    |   static void deretRekursif(int n) { //fungsi tipe void yaitu deretRekursif dengan parameter int n

    |       if(n >= 0) { //base case

    |           System.out.print(n);

    |           deretDescendingRekursif(n - 1); //recursion call

    |       }

    |   }

    Unresolved dependencies:

       - method deretDescendingRekursif(int)


2. Buatlah program yang di dalamnya terdapat fungsi rekursif untuk menghitung bilangan faktorial. Misalniya f = 8, maka akan dihasilkan 1+2+3+4+5+6+7+8 = 36 (**PenjumlahanRekursif**).


```Java
// Tuliskan jawaban tugas nomor 2
int i = 0; //deklarasi variabel
static int rekursif(int n) { //fungsi tipe int yaitu rekursif dengan parameter int n
    if (i == n) //base case
        return 0; //output akan bernilai 0 dengan berapapun nilai dari n
    else { //recursion call
        i++;
        System.out.print( i + " + ");
        return(i + rekursif(n)); //mengambalikan nilai yg ada dalam proses
    }
}
System.out.print(" = "+ rekursif(8)); //menampilkan hasil dari pemanggilang fungsi rekursif
```

    1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 +  = 36

3.	Buat program yang di dalamnya terdapat fungsi rekursif untuk mengecek apakah suatu bilangan n merupakan bilangan prima atau bukan. n dikatakan bukan bilangan prima jika ia habis dibagi dengan bilangan kurang dari n. (**CekPrimaRekursif**).


```Java
// Tuliskan jawaban tugas nomor 3
import java.util.Scanner; 
Scanner sc = new Scanner(System.in); //deklarasi library scanner
int n ; //deklarasi variabel

static int cekPrimaRekursif(int p){ //fungsi tipe int dengan parameter int p
    if (p == 1){ //base case
        return 1; //jika p = 1 maka output yg keluar adalah 1
        
    }else if(n%p==0){
        return 0; //jika hasil n modulus p adalah 0 maka output yg keluar adalah 0
        
    }else{ //recursion call
        return cekPrimaRekursif(p-1); //mengembalikan nilai dari fungsi
    }
}

System.out.print("Masukkan angka: ");
n = sc.nextInt(); //input untuk memasukkan angka
    if(n>1){
        int p = cekPrimaRekursif(n-1);
        if (p==1){
            printf("%d Bilangan Prima\n", n);
            
        }else{
            printf("%d Bukan bilangan prima\n", n);
        }
    }else{
        printf("Bukan bilangan prima\n", n);
    }
```

    Masukkan angka: 11
    11 Bilangan Prima


4.	Sepasang marmut yang baru lahir (jantan dan betina) ditempatkan pada suatu pembiakan.  Setelah dua bulan pasangan marmut tersebut melahirkan sepasang marmut kembar (jantan dan betina). Setiap pasangan marmut yang lahir juga akan melahirkan sepasang marmut juga setiap 2 bulan.  Berapa pasangan marmut yang ada pada akhir bulan ke-12? Buatlah programnya menggunakan fungsi rekursif! (**Fibonacci**).
Berikut ini adalah ilustrasinya dalam bentuk tabel.

 ![Gambar 11](images/code14-11.PNG)


```Java
// Tuliskan jawaban tugas nomor 4
import java.util.Scanner;
Scanner in = new Scanner(System.in); //deklarasi scanner

static int pasangan(int n, int a, int b) { //fungsi tipe int yaitu pasangan dengan parameter int n, int a, int b
     if (n == 0) return a; 
     if (n == 1) return b;
     return pasangan(n - 1, b, a + b); //mengembalikan nilai pada fungsi pasangan
}

printf("Masukkan bulan: ");
int bulan = in.nextInt(); //input nilai bulan
printf("Pada bulan ke %d ada %d pasangan \n\n", bulan , pasangan(bulan, 0, 1)); //menampilkan hasil nilai bulan dan pasangan
```

    Masukkan bulan: 12
    Pada bulan ke 12 ada 144 pasangan 
    

