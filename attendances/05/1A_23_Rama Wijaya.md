## JOBSHEET 5

## PEMILIHAN 1
## Perbaikan
#### Nama   : Rama Wijaya
#### Kelas  : 1A
#### NIM    : 2131710107

### Tujuan

Mahasiswa mampu menyelesaikan permasalahan/studi kasus menggunakan sintaks pemilihan 1 dan mengimplemantasikannya dalam bahasa pemrogaman java.

### Alat dan Bahan
+ PC/laptop
+ Browser(chrome, firefox, safari)
+ Koneksi internet

### Praktikum

#### Percobaan 1 : Penggunaan if

#### Waktu percobaan : 40 menit

1. Perhatikan flowchart dibawah ini!

    <p align="left">
    <img width="351" height="460" src="images/01.png">
    </p>
    

> Flowchart diatas digunakan untuk menentukan bilangan ganjil/genap, selanjutnya kita akan membuat programnya berdasarkan
> flowchart di atas!

2. Tambahkan library Scanner, deklarasi Scanner, dan buat variabel bil untuk menampung data yang diinput melalui keyboard

    ![](images/03.png)


```Java
// Ketik kode program di atas di bawah sini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int bil;
System.out.print("Masukkan sebuah bilangan: ");
bil = input.nextInt();
```

    Masukkan sebuah bilangan: 20


import java.util.Scanner; digunakan untuk menambahkan library scanner yang diimport ke dalam program java.
Scanner input = new Scanner(System.in); merupakan perintah deklarasi scanner.
int bil merupakan tipe data berupa integer atau bilangan bulat dengan variabel bil.
Perintah System.out.print("Masukkan sebuah bilangan:  menampilkan kalimat Masukkan sebuah bilangan ke layar.
bil = input.nextInt; merupakan input variabel bil berupa bilangan bulat.

3. Buatlah struktur kondisi untuk mengecek apakah bilangan tersebut merupakan bilangan genap atau ganjil

    ![](images/04.png)


```Java
// Ketik kode program di atas di bawah sini
if(bil % 2 == 0){
    System.out.println("Bilangan Genap");
}else{
    System.out.println("Bilangan Ganjil");
}
```

    Bilangan Genap


if(bil % 2 == 0) artinya bilangan yang habis dibagi 2 sama dengan 0, yang berarti bilangan tersebut masuk ke dalam bilangan genap. 
##### Pertanyaan
1. Modifikasi program diatas dibagian struktur pemilihannya sehingga menjadi sebagai berikut:

    ![](images/05.png)


```Java
// Ketik kode program di atas di bawah sini
String output = (bil % 2 == 0) ? "Bilangan Genap":"Bilangan Ganjil";
System.out.println(output);
```

    Bilangan Genap


Kode di atas adalah source code menggunakan pemilihan ternary operator. (bil % 2 == 0) adalah ekspresi, tanda " ? " adalah ternary, lalu setelah itu adalah pernyataan benar, kemudian pernyataan salah yang dipisahkan dengan " : ". Ternary operator ini untuk program kode yang memiliki percabangan sederhana, jika memakai if else maka akan terlalu panjang, namun ternary ini tidak bisa untuk membuat kode program yang rumit, maka saat itu menggunakan if else.

2. Jalankan dan amatilah hasilnya!
3. Jelaskan mengapa output program yang dimodifikasi sama dengan output program sebelum dimodifikasi!

#### Percobaan 2 : Penggunaan if else

#### Waktu percobaan : 40 menit

**Jawaban**

2. Output yang dikeluarkan oleh program akan sama dengan sebelumnya, yang diubah adalah pada bagian percabangan dan diubah menggunakan operator ternary. 
3. karena program awal menggunakan if else. nomor 1. Ternary operator digunakan untuk program yang memiliki percabangan sederhana, jika memakai if else akan terlalu panjang. Itu sebabnya mengapa ouput keduanya sama.

+ Buatlah sebuah variabel nilai untuk menyimpan inputan dari keyboard

    ![](images/06.png)


```Java
// Ketik kode program di atas di bawah sini
 int nilai;
System.out.print("Masukkan sebuah bilangan: ");
nilai = input.nextInt();
```

    Masukkan sebuah bilangan: 115


int nilai; merupakan tipe data integer dengan variabel nilai. Perintah System.out.print("Masukkan sebuah bilangan:  menampilkan kalimat Masukkan sebuah bilangan ke layar. nilai = input.nextInt merupakan input variabel nilai yang berupa bilangan bulat.

+ Tambahkan sebuah kondisi untuk mengecek input pada variabel nilai

    ![](images/07.png)


```Java
// Ketik kode program di atas di bawah sini
if(nilai >=100){
    nilai += 10;
}else{
    nilai -= 10;
}
System.out.println("Hasil akhir nilai adalah "+nilai);
```

    Hasil akhir nilai adalah 125


**if** berfungsi jika nilai lebih dari sama dengan 100 maka nilai akan ditambah 10, **else** berfungsi jika nilai kurang dari 100 maka akan dikurangi 10. **System.out.println("Hasil akhir nilai adalah "+nilai);** menampilkan kalimat **Hasil akhir nilai adalah** dan nilai yang kita input ke layar.

+ Jalankan program. Amati apa yang terjadi!

##### Pertanyaan
1. Jelaskan fungsi kode program berikut:
    
    ```
    nilai+=10;
    nilai-=10;
    ```

2. Modifikasilah program diatas dimana inputannya yang awalnya hanya satu kemudian diganti 2 inputan (misal : nilai1 dan nilai2), lakukan perhitungan rata-rata kedua nilai tersebut jika nilainya lebih dari sama dengan 100 maka dikurangi 5, sedangkan jika nilai rata-rata tersebut kurang dari 100 maka akan langsung dicetak!

**Jawaban**
1. Fungsi kode nilai+=10; adalah untuk menambahkan nilai sebanyak 10 pada variabel. Sedangkan fungsi kode nilai-=10; adalah untuk mengurangi nilai sebanyak 10 pada variabel.

2. **Lebih dari 100, maka dikurangi 5**


```Java
// Ketik kode program di atas di bawah sini
import java.util.Scanner;
Scanner input = new Scanner(System.in);

int nilai1, nilai2, nilaiRata2;

System.out.print("Masukkan Nilai Pertama: ");
nilai1 = input.nextInt();

System.out.println("Masukkan Nilai Kedua: ");
nilai2 = input.nextInt();

nilaiRata2 = (nilai1 + nilai2) / 2;

if(nilaiRata2>=100){
nilaiRata2-=5;
}
System.out.println("Hasil akhir nilai adalah " + nilaiRata2);
```

    Masukkan Nilai Pertama: 100
    Masukkan Nilai Kedua: 
    100
    Hasil akhir nilai adalah 95


**import java.util.Scanner;** digunakan untuk menambahkan library scanner yang diimport ke dalam program java.
**Scanner input = new Scanner(System.in);** merupakan perintah deklarasi scanner.
**int nilai1, nilai2, nilaiRata2;** merupakan tipe data berupa integer atau bilangan bulat dengan variabel nilai1, nilai2, dan nilaiRata2.
Perintah **System.out.print("Masukkan Nilai Pertama: ");** dan **System.out.print("Masukkan Nilai Kedua: ");** menampilkan kalimat **Masukkan Nilai Pertama dan Masukkan Nilai Kedua** pada layar yang inputnya dapat kita isi.
**nilai1 = input.nextInt();** dan **nilai2 = input.nextInt();** merupakan input variabel nilai1 dan nilai2 yang berupa bilangan bulat.
**nilaiRata2 = (nilai1 + nilai2) / 2;** merupakan cara penghitungan nilai rata-rata.
**if** memiliki arti jika nilai rata-rata lebih dari sama dengan 100 maka nilai rata-rata nya dikurangi lima.
**System.out.println("Hasil akhir nilai adalah " + nilaiRata2);** menampilkan kalimat **Hasil akhir nilai adalah** beserta hasil dari nilai rata-rata yang telah diproses.

**Kurang dari 100, maka langsung dicetak**


```Java
// Ketik kode program di atas di bawah sini
import java.util.Scanner;
Scanner input = new Scanner(System.in);

int nilai1, nilai2, nilaiRata2;

System.out.print("Masukkan Nilai Pertama: ");
nilai1 = input.nextInt();

System.out.println("Masukkan Nilai Kedua: ");
nilai2 = input.nextInt();

nilaiRata2 = (nilai1 + nilai2) / 2;

if(nilaiRata2>=100){
nilaiRata2-=5;
}
System.out.println("Hasil akhir nilai adalah " + nilaiRata2);
```

    Masukkan Nilai Pertama: 90
    Masukkan Nilai Kedua: 
    90
    Hasil akhir nilai adalah 90


**import java.util.Scanner;** digunakan untuk menambahkan library scanner yang diimport ke dalam program java.
**Scanner input = new Scanner(System.in);** merupakan perintah deklarasi scanner.
**int nilai1, nilai2, nilaiRata2;** merupakan tipe data berupa integer atau bilangan bulat dengan variabel nilai1, nilai2, dan nilaiRata2.
Perintah **System.out.print("Masukkan Nilai Pertama: ");** dan **System.out.print("Masukkan Nilai Kedua: ");** menampilkan kalimat **Masukkan Nilai Pertama dan Masukkan Nilai Kedua** pada layar yang inputnya dapat kita isi.
**nilai1 = input.nextInt();** dan **nilai2 = input.nextInt();** merupakan input variabel nilai1 dan nilai2 yang berupa bilangan bulat.
**nilaiRata2 = (nilai1 + nilai2) / 2;** merupakan cara penghitungan nilai rata-rata.
**if** memiliki arti jika nilai rata-rata lebih dari sama dengan 100 maka nilai rata-rata nya dikurangi lima.
**System.out.println("Hasil akhir nilai adalah " + nilaiRata2);** menampilkan kalimat **Hasil akhir nilai adalah** beserta hasil dari nilai rata-rata yang telah diproses. Di atas saya mencoba memberi input nilai pertama 80 dan nilai kedua 80. Karena hasilnya kurang dari 100 maka tidak dikurangi 5 dan langsung dicetak.

#### Percobaan 3 : Penggunaan if else-if else

#### Waktu percobaan : 40 menit

+ Tambahakan library `Scanner`
+ Buatlah deklarasi `Scanner`
+ Buat variabel umur bertipe `int`

    ![](images/08.png)


```Java
// Ketik kode program di atas di bawah sini
int umur;
System.out.print("Masukkan umur Anda: ");
umur = input.nextInt();
```

    Masukkan umur Anda: 18


**int umur;** merupakan tipe data integer dengan variabel umur. **System.out.print("Masukkan umur Anda: ");** menampilkan kalimat **Masukkan umur Anda:** ke layar. **umur = input.nextInt();** merupakan input variabel umur berupa bilangan bulat.

+ Kode untuk melakukan pengecekan variabel `umur`

    ![](images/09.png)


```Java
// Ketik kode program di atas di bawah sini
if(umur > 60)
    System.out.println("Lansia");
else if(umur > 45)
    System.out.println("Tua");
else if(umur > 17)
    System.out.println("Dewasa");
else if(umur > 5)
    System.out.println("Anak-anak");
else
    System.out.println("Balita");
```

    Dewasa


**if** berarti jika umur > 60 tahun maka tergolong Lansia. **else if** umur > 45 maka tergolong Tua. **else if** > 17 maka tergolong Dewasa. **else if** umur > 5 maka tergolong Anak-anak. **else** selain umur yang tertera di atas atau kurang dari 5 tahun maka tergolong Balita.

+ Jalankan program dan amati apa yang terjadi!

##### Percobaan 4 : Penggunaan switch-case

#### Waktu percobaan : 40 menit

1. Deklarasikan Scanner
1. Buatlah variabel-variabel berikut

    ![](images/10.png)


```Java
// Ketik kode program di atas di bawah sini
Scanner sc = new Scanner(System.in);
double angka1, angka2, hasil;
char operator;
```

**Scanner sc = new Scanner(System.in);** merupakan perintah deklarasi scanner. **double angka1, angka2, hasil;** merupakan tipe data double yang memiliki variabel angka1, angka2, dan hasil.
**char operator;** merupakan tipe data char yang memiliki variabel operator.

3. Kode program untuk meminta inputan dari keyboard

    ![](images/11.png)


```Java
// Ketik kode program di atas di bawah sini
System.out.print("Masukkan angka pertama: ");
angka1 = sc.nextDouble();
System.out.print("Masukkan angka kedua: ");
angka2 = sc.nextDouble();
System.out.print("Masukkan operator (+ - * /): ");
operator = sc.next().charAt(0);
```

    Masukkan angka pertama: 20
    Masukkan angka kedua: 40
    Masukkan operator (+ - * /): *


**System.out.print("Masukkan angka pertama: ");** menampilkan kalimat **Masukkan angka pertama:** ke layar.
**angka1 = sc.nextDouble();** merupakan input variabel angka1 yang bertipe data double.
**System.out.print("Masukkan angka kedua: ");** menampilkan kalimat **Masukkan angka kedua:** ke layar.
**angka2 = sc.nextDouble();** merupakan input variabel angka2 yang bertipe data double.
**System.out.print("Masukkan operator (+ - * /): ");** menampilkan kalimat **Masukkan operator** yang operatornya bisa kita pilih sendiri sesuai yang tertera.
**operator = sc.next().charAt(0);** fungsi perintahnnya adalah untuk mengambil huruf atau karakter dari nilai bertipe data String, berdasarkan nomor index atau posisi keberadaan dari karakter, yang dimana index di dalam program java, dimulai dengan angka 0. Metode ini sering digunakan ketika ingin memanipulasi String. Karena disini kita mengambil perhuruf atau perkarakter, maka nilainya akan diubah menjadi tipe data primitif char.

4. Kode di bawah ini untuk melakukan pengecekan operator yang digunakan sebelum dilakukan operasi aritmatika

    ![](images/12.png)


```Java
// Ketik kode program di atas di bawah sini
switch(operator){
    case '+':
    hasil = angka1 + angka2;
    System.out.println(angka1 + " + " + angka2 + " = " + hasil);
    break;
    case '*':
    hasil = angka1 * angka2;
    System.out.println(angka1 + " * " + angka2 + " = " + hasil);
    break;
    case '/':
    hasil = angka1 / angka2;
    System.out.println(angka1 + " / " + angka2 + " = " + hasil);
    break;
    default:
    System.out.println("Operator yang Anda masukkan salah");
}
```

    20.0 * 30.0 = 600.0


source code di atas adalah kondisi SWITCH CASE, percabangan kode program dimana kita membandingkan isi sebuah variabel dengan beberapa nilai. Jika proses perbandingan tersebut menghasilkan true, maka block code program akan diproses.
**break** berfungsi untuk mengakhiri case yang telah dibuat.
**default** berfungsi apabila ada case yang tidak terpenuhi kondisinya maka akan masuk ke default.

5. Jalankan program. Amati apa yang terjadi!

##### Pertanyaan
1. Jelaskan fungsi dari break dan default pada percobaan 4 diatas!
2. Jelaskan fungsi perintah kode program dibawah ini pada percobaan 4!

    ```
    operator = sc.next().chartAt(0);
    ```

1. **Break** digunakan untuk membatasi eksekusi. Ketika variabel yang dibandingkan sama dengan case, statement pada case tersebut akan diekseskusi sampai pada keyword break. Ketika sampai pada keyword break, switch berhenti dieksekusi, dan aliran proses melompat pada kode sesudah statement switch. Sedangkan fungsi dari **Default Case** adalah jika nilai value inputan tidak ada yang cocok dengan list case yang diberikan, maka output akan mengambil dari default case.
2. Fungsi perintahnnya adalah untuk mengambil huruf atau karakter dari nilai bertipe data String, berdasarkan nomor index atau posisi keberadaan dari karakter, yang dimana index di dalam program java, dimulai dengan angka 0. Metode ini sering digunakan ketika ingin memanipulasi String. Karena disini kita mengambil per-huruf atau per-karakter, maka nilainya akan diubah menjadi tipe data primitif char.

### Tugas

#### Waktu pengerjaan Tugas: 140 menit

1. Buatlah program untuk menginputkan dua buah bilangan bulat, kemudian mencetak salah satu bilangan yang nilainya terbesar.
2. Perhatikan flowchart berikut ini:

![](images/02.png)

> Buatlah program sesuai dengan flowchart diatas!

3. Pada akhir semester seorang dosen menghitung nilai akhir dari mahasiswa yang terdiri dari nilai uas, uts, kuis, dan tugas. Nilai akhir didapatkan dari 40% nilai uas, 30% nilai uts, 10% nilai kuis, dan 20% nilai tugas. Jika nilai akhir dari mahasiswa dibawah 65 maka mahasiswa tersebut akan mendapatkan remidi. Buatlah program untuk membantu mengetahui mahasiswa yang mendapatkan remidi berdasarkan nilai akhir yang didapatkannya!

4. Sebuah toko memberikan diskon kepada pelanggannya dengan ketentuan sebagai berikut:

| Total Belanja     | Potongan |
|-------------------|----------|
| >Rp. 200.000,00   | 2%       |
| >Rp. 500.000,00   | 5%       |
| >Rp. 1.000.000,00 | 10%      |

> Total belanja diperoleh dari pembelian tiga barang yaitu barang A, barang B, dan barang C. Ketika menginputkan harga barang juga menginputkan jumlah barang yang dibeli.

Contoh outputnya
```
Masukkan harga barang A   :100000
Masukkan jumlah barang A  :10
Masukkan harga barang B   :250000
Masukkan jumlah barang B  :5
Masukkan harga barang C   :150000
Masukkan jumlah barang C  :1
---------------------------------------------
                Struk total
---------------------------------------------
Nama Barang 	| 	Harga 	| 	Jumlah 	| 	Total
Barang A            100000         10        1000000   
Barang B            250000         5         1250000   
Barang C            150000         1         150000    
Total       :2400000
Diskon      :240000.0
Total Bayar :2160000.0
```


```Java
import java.util.Scanner;

        Scanner sc = new Scanner(System.in);

        int bilbul1, bilbul2;

        System.out.println("Masukkan Bilangan Bulat Pertama: ");
        bilbul1 = sc.nextInt();
        System.out.println("Masukkan Bilangan Bulat Kedua: ");
        bilbul2 = sc.nextInt();

        System.out.println("Bilangan Pertama Anda = " + bilbul1);
        System.out.println("Bilangan Kedua Anda = " + bilbul2);

        if(bilbul1 > bilbul2){
            System.out.println("Bilangan Pertama Lebih Besar Daripada Bilangan Kedua");
            System.out.println("Bilangan Terbesarnya adalah = " + bilbul1);
        }
        else if(bilbul1 == bilbul2){
            System.out.println("Bilangan Pertama Sama Besarnya Dengan Bilangan Kedua");
            System.out.println(bilbul1 + " = " + bilbul2);
        }
        else{
            System.out.println("Bilangan Pertama Lebih Kecil Daripada Bilangan Kedua");
            System.out.print("Bilangan Terbesarnya adalah = " + bilbul2);
        }
```

    Masukkan Bilangan Bulat Pertama: 
    300
    Masukkan Bilangan Bulat Kedua: 
    250
    Bilangan Pertama Anda = 300
    Bilangan Kedua Anda = 250
    Bilangan Pertama Lebih Besar Daripada Bilangan Kedua
    Bilangan Terbesarnya adalah = 300


**import java.util.Scanner;** digunakan untuk menambahkan library scanner yang diimport ke dalam program java. **Scanner sc = new Scanner(System.in);** merupakan perintah deklarasi scanner. **int bilbul1, bilbul2;** merupakan tipe data berupa integer atau bilangan bulat dengan variabel bilbul1 dan bilbul2. Perintah **System.out.println("Masukkan Bilangan Bulat Pertama: ");** menampilkan kalimat **Masukkan Bilangan Bulat Pertama:** pada layar. **bilbul1 = sc.nextInt();** merupakan input variable bilbul1 berupa bilangan bulat. System.out.println("Masukkan Bilangan Bulat Kedua: "); menampilkan kalimat **Masukkan Bilangan Bulat Kedua:** pada layar. **bilbul2 = sc.nextInt();** merupakan input variabel bilbul2 berupa bilangan bulat. System.out.println("Bilangan Pertama Anda = " + bilbul1); "); menampilkan kalimat **Bilangan Pertama Anda =** serta angka yang kita input pada variable bilbul1. **System.out.println("Bilangan Kedua Anda = " + bilbul2);** menampilkan kalimat **Bilangan Kedua Anda =** serta angka yang kita input pada variable bilbul2.
**if(bilbul1 > bilbul2)**, berarti jika bilangan bulat 1 > bilangan bulat 2 maka outputnya adalah **Bilangan Pertama Lebih Besar Daripada Bilangan Kedua** serta Bilangan Terbesarnya adalah = " + bilbul1
**else if(bilbul1 == bilbul2)**, berarti jika bilangan bulat 1 = bilangan bulat 2 maka outputnya **Bilangan Pertama Sama Besarnya Dengan Bilangan Kedua** serta  bilbul1 + " = " + bilbul2
**else**, berarti jika bilangan bulat 1 < bilangan bulat 2 maka outputnya **Bilangan Pertama Lebih Kecil Daripada Bilangan Kedua** serta Bilangan Terbesarnya adalah = " + bilbul2



```Java
import java.util.Scanner;

        Scanner sc = new Scanner(System.in);

        int umur;

        System.out.println("Masukkan Umur Anda: ");
        umur = sc.nextInt();

        if(umur >= 17){
            System.out.println("Anda Diperbolehkan Berkendara!");
        }
        else{
            System.out.println("Anda Tidak Diperbolehkan Berkendara!");
        }
```

    Masukkan Umur Anda: 
    18
    Anda Diperbolehkan Berkendara!


import java.util.Scanner; digunakan untuk menambahkan library scanner yang diimport ke dalam program java. Scanner sc = new Scanner(System.in); merupakan perintah deklarasi scanner. int umur; merupakan tipe data berupa integer atau bilangan bulat dengan variabel umur. System.out.println("Masukkan Umur Anda:  menampilkan kalimat Masukkan Umur Anda: ke layar. umur = sc.nextInt(); merupakan input variabel umur yang berupa bilangan bulat.



```Java
import java.util.Scanner;

        Scanner sc = new Scanner(System.in);

        float nilaiUAS, nilaiUTS, nilaiKuis, nilaiTugas;
        float nilaiAkhir;
        
        System.out.println("Masukkan Nilai UAS: ");
        nilaiUAS = sc.nextFloat();
        System.out.println("Masukkan Nilai UTS: ");
        nilaiUTS = sc.nextFloat();
        System.out.println("Masukkan Nilai Kuis: ");
        nilaiKuis = sc.nextFloat();
        System.out.println("Masukkan Nilai Tugas: ");
        nilaiTugas = sc.nextFloat();

        nilaiUAS = nilaiUAS * 40/100;
        nilaiUTS = nilaiUTS * 30/100;
        nilaiKuis = nilaiKuis * 10/100;
        nilaiTugas = nilaiTugas * 20/100;

        nilaiAkhir = nilaiUAS + nilaiUTS + nilaiKuis + nilaiTugas;
        
        System.out.println("Nilai Akhir Anda Adalah: " + nilaiAkhir);
        if(nilaiAkhir > 65.0){
            System.out.println("Selamat Anda Tidak Remidi!");
        }
        else{
            System.out.println("Mohon Maaf Anda Harus Remidi!");
        }
```

    Masukkan Nilai UAS: 
    90
    Masukkan Nilai UTS: 
    90
    Masukkan Nilai Kuis: 
    90
    Masukkan Nilai Tugas: 
    90
    Nilai Akhir Anda Adalah: 90.0
    Selamat Anda Tidak Remidi!


import java.util.Scanner; digunakan untuk menambahkan library scanner yang diimport ke dalam program java. Scanner sc = new Scanner(System.in); merupakan perintah deklarasi scanner. tipe data yang berupa bilangan riil dengan variable nilaiUAS, nilaiUTS, nilaiKuis, nilaiTugas, nilaiAkhir. 



```Java
import java.util.Scanner;

        Scanner sc = new Scanner(System.in);
        
        long hargaA, hargaB, hargaC;
        int banyakA, banyakB, banyakC;
        long totalBelanja, diskonBelanja, totalBayar;
        long tsA, tsB, tsC;
        long diskon;

        System.out.println("Masukkan Harga Barang A: ");
        hargaA = sc.nextLong();
        System.out.println("Banyaknya Barang A: ");
        banyakA = sc.nextInt();

        System.out.println("Masukkan Harga Barang B: ");
        hargaB =sc.nextLong();
        System.out.println("Banyaknya Barang B: ");
        banyakB = sc.nextInt();

        System.out.println("Masukkan Harga Barang C: ");
        hargaC =sc.nextLong();
        System.out.println("Banyaknya Barang C: ");
        banyakC = sc.nextInt();

        tsA = hargaA * banyakA;
        tsB = hargaB * banyakB;
        tsC = hargaC * banyakC;

        totalBelanja = tsA + tsB + tsC;

        if(totalBelanja > 1000000){
            diskon = totalBelanja * 10/100;
        }
        else if(totalBelanja > 500000){
            diskon = totalBelanja * 5/100;
        }
        else if(totalBelanja > 200000){
            diskon = 2/100;
        }
        else{
            diskon = 0;
        }

        totalBayar = totalBelanja - diskon;

        System.out.println("-------------------------------------------------------------------");
        System.out.println("                            Struk Nota                             ");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Nama Barang\t |\t Harga \t\t| \t Jumlah\t\t| \t Total ");
        System.out.println("Barang A\t \t" + hargaA +"\t\t\t"+ banyakA +"\t\t\t "+ tsA +" ");
        System.out.println("Barang B\t \t" + hargaB +"\t\t\t"+ banyakB +"\t\t\t "+ tsB +" ");
        System.out.println("Barang C\t \t" + hargaC +"\t\t\t"+ banyakC +"\t\t\t "+ tsC +" ");
        System.out.println("Total \t\t :" + totalBelanja);
        System.out.println("Diskon \t\t :" + diskon);
        System.out.println("Total Bayar \t :" + totalBayar);
```

    Masukkan Harga Barang A: 
    100000
    Banyaknya Barang A: 
    10
    Masukkan Harga Barang B: 
    250000
    Banyaknya Barang B: 
    5
    Masukkan Harga Barang C: 
    150000
    Banyaknya Barang C: 
    1
    -------------------------------------------------------------------
                                Struk Nota                             
    -------------------------------------------------------------------
    Nama Barang	 |	 Harga 		| 	 Jumlah		| 	 Total 
    Barang A	 	100000			10			 1000000 
    Barang B	 	250000			5			 1250000 
    Barang C	 	150000			1			 150000 
    Total 		 :2400000
    Diskon 		 :240000
    Total Bayar 	 :2160000


import java.util.Scanner; digunakan untuk menambahkan library scanner yang diimport ke dalam program java. Scanner sc = new Scanner(System.in); merupakan perintah deklarasi scanner. tipe data yang berupa bilangan bulat dengan variabel hargaA, hargaB, hargaC, totalBelanja, diskonBelanja, totalBayar, tsA, tsB, tsC, diskon.  tipe data yang berupa bilangan bulat dengan variabel banyakA, banyakB, banyakC. Untuk menghitung total belanja tiap barang dengan kode A, B, dan C 