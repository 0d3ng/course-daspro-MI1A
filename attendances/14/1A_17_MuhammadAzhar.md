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
    if (n == 0){
        return (1);
    } else {
        return (n * faktorialRekursif(n-1));
    }
}

```


```Java
Penjelasan
Pada code diatas mendeklarasikan fungsi rekursif kembalian bertipe int dengan parameter berisi "n". Di baris kedua ada basecase yang berfungsi 
untuk menghentikan fungsi rekursif jika nilai batas sudah terpenuhi. Baris ketiga, return bernilai 1. baris keempat adalah recursion
call, nilai kembalian dikalikan dengan fungsi berparameter n-1
```

2. Buat lagi fungsi static dengan nama **faktorialIteratif()**, dengan tipe data kembalian fungsi int dan memiliki 1 parameter dengan tipe data int berupa bilangan yang akan dihitung nilai faktorialnya.

    ![Gambar 2](images/code14-2.png)


```Java
// Tuliskan kode program Percobaan 1 Langkah 2
static int faktorialIteratif(int n){
    int faktor = 1;
    for (int i = n; i >=1; i--){
        faktor = faktor * i;
    }
    return faktor;
}
```


```Java
Penjelasan
Pada code diatas mendeklarasikan fungsi iteratif kembalian bertipe int dengan parameter berisi "n". Baris kedua mendeklarasikan
variabel faktor dengan tipe integer berisi nilai 1. Baris ketiga melakukan perulangan untuk menghitung variabel faktor dimana i=n 
nilai parameter kemudian dikurangi 1 sampai kondisi tidak kurang dari 1. Selanjutnya dilakukan proses faktor dikali nilai 1 dan 
disimpan di variabel faktor. Terakhir mengembalikan nilai ke variabel faktor
```

3. Lakukan pemanggilan terhadap kedua fungsi yang telah dibuat sebelumnya, dan tampilkan hasil yang didapatkan.

    ![Gambar 3](images/code14-3.png)


```Java
// Tuliskan kode program Percobaan 1 Langkah 1, 2, 3
System.out.println(faktorialRekursif(5));
System.out.println(faktorialIteratif(5));
```

    240
    120



```Java
Penjelasan
Menampilkan output fungsi rekursif dan iteratif dengan parameter 5.
```

4. Jika ditelusuri, pada saat pemanggilan fungsi faktorialRekursif(5),maka proses yang terjadi dapat diilustrasikan sebagai berikut:

    ![Gambar 4](images/code14-4.png)

#### Pertanyaan
1. Apa yang dimaksud dengan fungsi rekursif?
2. Bagaimana contoh kasus penggunaan fungsi rekursif ?
3. Pada Percobaan1, apakah hasil yang diberikan fungsi faktorialRekursif() dan fungsi faktorialIteratif() sama? Jelaskan perbedaan alur jalannya program pada penggunaan fungsi rekursif dan fungsi iteratif!

### Jawaban
1. Fungsi rekursif adalah fungsi yang terdapat perintah untuk memanggil fungsi itu sendiri secara berulang ulang sampai kondisi basecase terpenuhi
2. Mencari nilai faktorial dan pangkat
3. Sama.Fungsi rekursif menggunakan perulangan dengan struktur seleksi sedangkan fungsi iteratif menggunakan perulangan struktur repetisi

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
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

int bilangan, pangkat;

static int hitungPangkat(int x, int y){
    if (y == 0){
        return (1);
    } else {
        return (x * hitungPangkat(x, y-1));
    }
}

System.out.print("Bilangan yang dihitung: ");
bilangan= sc.nextInt();
System.out.print("Pangkat: ");
pangkat = sc.nextInt();

System.out.println(hitungPangkat(bilangan, pangkat));
```

    Bilangan yang dihitung: 1
    Pangkat: 3
    1



```Java
Penjelasan
Fungsi rekursif diatas adalah fungsi kembalian bertipe integer dengan parameter bertipe int x dan y. Pertama memasukkan library scanner
dan mendeklarasikan scanner menjadi sc. Baris ketiga membuat variabel bilangan dan pangkat bertipe int yang berfungsi untuk 
menyimpan nilai inputan. Selanjutnya membuat fungsi rekrusfif jika basecase y == 0, maka akan mengembalikan nilai 1. jika tidak mengembalikan nilai
x dikali dengan fungsiRekursif berisi parameter x dan y-1. Selanjutnya membuat output untuk menambahkan nilai kedalam variabel bilangan
yang akan di simpan di parameter x. Setelah itu membuat output untuk menambahkan nilai ke dalam variabel pangkat yang akan disimpan di parameter y. 
Terakhir menampilkan fungsi rekursif hitungPangkat.
```

#### Pertanyaan
1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan!

#### Jawaban
1. Proses pemanggilan fungsi akan terhenti ketika base case terpenuhi

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
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

double saldoAwal;
int tahun;

static double hitungBunga (double saldo,int tahun){
    if (tahun == 0){
        return (saldo);
    } else {
        return (1.11 * hitungBunga(saldo, tahun -1));
    }
}

System.out.print("Jumlah saldo awal: ");
saldoAwal = sc.nextInt();
System.out.print("Lama menabung (tahun): ");
tahun = sc.nextInt();

System.out.println("Jumlah uang setelah " + tahun + " tahun: " );
System.out.println(hitungBunga (saldoAwal, tahun));
```

    Jumlah saldo awal: 100000
    Lama menabung (tahun): 5
    Jumlah uang setelah 5 tahun: 
    168505.81551000007



```Java
Penjelasan
Fungsi rekursif diatas adalah fungsi kembalian bertipe double dengan parameter bertipe double saldo dan tahun. Memasukkan library 
scanner dan mendeklarasikan. Membuat variabel saldoAwal dengan tipe double dan tahun dengan tipe integer. kemudian membuat fungsi rekrusif. Jika base case terpenuhi maka akan mengembalikan nilai saldo. Jika belum
maka akan mengembalikan nilai hasil proses 1.11 dikali dengan fungsi rekursif hitungBungan dengan parameter saldo dan tahun dikurangi 1.
Selanjutnya menampilkan teks jumlah saldo awal dan mengambil inputan pengguna kemudian disimpan di variabel saldoAwal dan juga menampilkan lama 
menabung kemudian inputan disimpan di variabel tahun. terakhir menampilkan "jumlah uang setelah" dan menampilkan variabel tahun. Juga menampilkan fungsi 
hitungBunga beserta parameter. 
```

#### Pertanyaan
1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”!

## Tugas

1. Buatlah program untuk menampilkan bilangan n sampai 0 dengan menggunakan fungsi rekursif dan fungsi iteratif. (**DeretDescendingRekursif**).


```Java
// Tuliskan jawaban tugas nomor 1
static int urutanRekursif(int n){
    if (n == 0){
        return (0);
    } else {
        System.out.println(n);
        return (urutanRekursif(n-1));
    }
}

static int urutanIteratif(int n){
    for (int i = n; i >=1; i--){
        System.out.println(i);
    }
    return 0;
}

System.out.println("Urutan bilangan menggunakan Fungsi Rekursif adalah: ");
System.out.println(urutanRekursif(10));
System.out.println("Urutan bilangan menggunakan Fungsi Iteratif adalah: ");
System.out.println(urutanIteratif(10));

```

    Urutan bilangan menggunakan Fungsi Rekursif adalah: 
    10
    9
    8
    7
    6
    5
    4
    3
    2
    1
    0
    Urutan bilangan menggunakan Fungsi Iteratif adalah: 
    10
    9
    8
    7
    6
    5
    4
    3
    2
    1
    0


#### Penjelasan
Pada code diatas mendeklarasikan fungsi rekursif kembalian bertipe int dengan parameter berisi "n" dengan nama urutanRekursif. Di baris kedua ada basecase yang ketika nilai n 0. fungsi akan mengembalikan nilai 0. Jika nilai tidak sama dengan 0, maka akan menampilkan n dan mengembalikan hasil fungsi urutanRekursif dengan parameter dikurangi 1 . Selanjutnya menggunakan fungsi interatif dengan nama fungsi urutanIteratif. Selanjutnya melakukan perulangan untuk menampilkan nilai 1 dimana i=n 
nilai parameter kemudian dikurangi 1 sampai kondisi tidak kurang dari 1 dan nilai dikembalikan. Terakhir menampilkan fungsi dengan memanggil nama fungsi.

2. Buatlah program yang di dalamnya terdapat fungsi rekursif untuk menghitung bilangan faktorial. Misalniya f = 8, maka akan dihasilkan 1+2+3+4+5+6+7+8 = 36 (**PenjumlahanRekursif**).


```Java
// Tuliskan jawaban tugas nomor 2
static int jumlahRekursif(int f){
    if (f == 0){
        System.out.print("0 = ");
        return (0);
    } else {
        System.out.print(f + " + ");
        return (f + jumlahRekursif(f-1));
    }
}
System.out.print(jumlahRekursif(8));
```

    8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0 = 36

### Penjelasan
Membuat fungsi dengan nama jumlahRekursif bertipe integer dengan parameter f bertipe integer. Jika parameter f == 0 maka akan menampilan 0 = dan mengembalikan nila 0. Jika tidak akan menampikan nilai parameter diikuti simbol tambah. nilai akan dikembalikan yang berisi parameter ditambah fungsiJumlahRekursif parameter dikurangi 1. terakhir menampilkan fungsi dengan memangil nama fungsi dan parameter berisi nilai 8. 

3.	Buat program yang di dalamnya terdapat fungsi rekursif untuk mengecek apakah suatu bilangan n merupakan bilangan prima atau bukan. n dikatakan bukan bilangan prima jika ia habis dibagi dengan bilangan kurang dari n. (**CekPrimaRekursif**).


```Java
// Tuliskan jawaban tugas nomor 3
import java.util.Scanner;
Scanner in = new Scanner(System.in);

public static boolean bilPrima(int x,int y){
        if(x % y == 0) return false;
        else{
            bilPrima ( x , y + 1 );
            return true;
        }
    }

    System.out.print("Masukkan bilangan: ");
    int bil = in.nextInt();
        if(bilPrima(bil,2)) System.out.println("Bilangan "+ bil +" Bilangan prima");
            else
            System.out.println("Bilangan "+ bil +" Bukan bilangan prima");
```

    Masukkan bilangan: 10
    Bilangan 10 Bukan bilangan prima


#### Penjelasan
Pertama membuat library scanner dan mendeklarasikan .Membuat fungsi bilPrima dengan tipe boolean karena hanya akan menampilkan benar/salah. fungsi berisi parameter x dan y bertipe int. jika parameter x modulus y sama dengan 0. maka nilai false akan dikembalikan. jika tidak bilPrima parameter x dan y+1 akan dikembalikan dengan nilai true. Selanjutnya menampilkan masukkan bilangan dan mengambil inputan disimpan di variabel bil. Jika fungsi bilPrima parameter kedua adalah 2. maka akan menampilkan "Bilangan...bilangan prima". Jika tidak akan tampil bukan"Bilangan...bukan bilangan prima"

4.	Sepasang marmut yang baru lahir (jantan dan betina) ditempatkan pada suatu pembiakan.  Setelah dua bulan pasangan marmut tersebut melahirkan sepasang marmut kembar (jantan dan betina). Setiap pasangan marmut yang lahir juga akan melahirkan sepasang marmut juga setiap 2 bulan.  Berapa pasangan marmut yang ada pada akhir bulan ke-12? Buatlah programnya menggunakan fungsi rekursif! (**Fibonacci**).
Berikut ini adalah ilustrasinya dalam bentuk tabel.

 ![Gambar 11](images/code14-11.PNG)


```Java
// Tuliskan jawaban tugas nomor 4
static int fibonacci(int bulan){
      if ((bulan == 0) || (bulan == 1))
         return bulan;
      else
         return fibonacci(bulan - 1) + fibonacci(bulan - 2);
   }
      System.out.println("Pasangan marmut yang ada pada akhir bulan ke-12 yaitu =  " + fibonacci(12));

```

    Pasangan marmut yang ada pada akhir bulan ke-12 yaitu =  144


Membuat fungsi bertipe integer dengan nama fibonacci berisi 1 parameter dengan nama bulan bertipe integer. jika bulan bernilai 0 atau 1, maka akan mengembalikan nilai bulan. Jika tidak akan mengembalikan nilai fungsi fibonacci parameter bulan dikurangi 1 ditambah fungsi fibonacci parameter bulan dikurangi 2. Terakhir menampilkan "Pasangan marmut yang ada pada akhir bulan ke-12 yaitu =  " diikuti dengan memanggil fungsi fibonaci bernilai 12.
