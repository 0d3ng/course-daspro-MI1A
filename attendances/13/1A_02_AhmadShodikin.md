# JOBSHEET 13. Fungsi 1

## NAMA : AHMAD SHODIKIN
## NIM     : 2131710132

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
// Tuliskan kode program Percobaan 1 Langkah 1 & 2
static void beriSalam(){
    System.out.println("Halo! Selamat Pagi");
}
beriSalam();
```

    Halo! Selamat Pagi


3. Buat fungsi **beriUcapan** dengan sebuah parameter bertipe String.
![Gambar 3](images/1.3.png)

4. Buatlah variabel **salam** bertipe String kemudian eksekusi atau panggil fungsi **beriUcapan** dengan mengisi parameternya dengan variable **salam** yang sudah dibuat.
![Gambar 3](images/1.4.png)


```Java
// Tuliskan kode program Percobaan 1 Langkah 1, 2, 3 & 4
static void beriSalam(){ //membuat fungsi dengan statement 
    System.out.println("Halo! Selamat Pagi");
}

static void beriUcapan(String ucapan){ //data diambil dari bawah
    System.out.println(ucapan);
}

    beriSalam();
    String salam = "Selamat datang di pemrogaman java";  //mengisi string (salam)
    beriUcapan(salam); //mengirim isian string diambil dari salam lalu dikirim melewati(beriUcapan)
```

    Halo! Selamat Pagi
    Selamat datang di pemrogaman java


#### Pertanyaan
1. Jelaskan perbedaan fungsi **beriSalam** dan **beriUcapan** pada praktikum 1!

fungsi **berisalam** digunakan untuk memanggil fungsi berisalam berisi statement pengeluaran. **sedangkan,**
fungsi **beriUcapan** digunakan untuk memanggil fungsi beriucapan yang berisi statement pengeluaran namun data diambil dari luaran fungsi tsb

2. Jelaskan cara pemanggilan sebuah fungsi void yang berparameter dan tanpa parameter!

**dengan parameter =** static void reRata(int jumlah);
//// **tanpa parameter=** static void hasilHitung();

### Percobaan 2: Fungsi dengan return value (Bukan void)
Pada Percobaan 2, kode program yang dibuat digunakan untuk menghitung luas persegi dengan membuat fungsi **luasPersegi** yang menggunakan parameter.
1. Buat fungsi **luasPersegi**  untuk menghitung luas persegi yang mengembalikan nilai luas (int) dan parameter masukan sisi (int).
![Gambar 4](images/2.1.png)

2.	Eksekusi atau panggil fungsi luasPersegi dengan cara membuat variabel baru yaitu **luasan**, kemudian isi variabel tersebut dengan memanggil fungsi luasPersegi dan mengisi parameter sisi. Selanjutnya cetak variabel luasan untuk menampilkan luas persegi panjang
![Gambar 5](images/2.2.png)


```Java
// Tuliskan kode program Percobaan 2 Langkah 1 & 2

static int luasPersegi(int sisi){
    int luas = sisi * sisi;
    return luas;
}

int luasan = luasPersegi(5);
System.out.println("Luas Persegi dengan sisi 5 = " + luasan);
```

    Luas Persegi dengan sisi 5 = 25


#### Pertanyaan
1. jelaskan mengapa ketika memanggil fungsi **luasPersegi** harus membuat variabel baru yaitu luasan?

int luasan berfungsi sebagai variable baru untuk tempat penyimpan data yang diterima dari hasil fungsi luas persegi

2. Jelaskan kegunaan **return luas** pada percobaan 2 diatas!

return luas digunakan untuk mengembalikan nilai pada sebuah program, dalam kasus diatas yaitu mengembalikan nilai luas untuk diambil kembali.

3. Modifikasilah program di percobaan 2, dengan membuat panjang **sisi** sebagai inputan!


```Java
// Tuliskan jawaban nomor 2

static int luasPersegi(int panjangSisi){
    int luas = panjangSisi * panjangSisi;
    return luas;
}

int luasan = luasPersegi(5);
System.out.println("Luas Persegi dengan panjang sisi 5 = " + luasan);
```

    Luas Persegi dengan panjang sisi 5 = 25


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
static int kali(int C, int D){ //menerima nilai dari variable x kemudian disimpan pada variable c dan d
    int H;
    H = (C + 10) % (D + 19); //menghitung data c dan d kemudian dimasukkan pada variable H
    return H; //mengembalikan nilai H 
}

static int kurang(int A, int B){ //menerima data dari hasil inputan void main/utama lalu dimasukkan pada int A, dan B
    int X;
    A = A + 7;
    B = B + 4;
    X = kali(A,B); //mengirim data kemudian disimpan pada variable X
    return X; 
}

int nilai1, nilai2;
Scanner input = new Scanner(System.in);
System.out.println("Masukkan nilai 1: ");
nilai1 = input.nextInt();
System.out.println("Masukkan nilai 2: ");
nilai2 = input.nextInt();
int hasil = kurang(nilai1, nilai2); //mengirim nilai1, dan nilai2 pada fungsi kurang
System.out.println("Hasil akhir adalah: " + hasil);
```

    Masukkan nilai 1: 
    5
    Masukkan nilai 2: 
    3
    Hasil akhir adalah: 22


#### Pertanyaan
1. Modifikasilah percobaan diatas dimana di fungsi **Kali** dapat memanggil fungsi **Kurang** kemudian eksekusi atau panggil fungsi Kali


```Java
// Tuliskan jawaban nomor 1

static int kali(int C, int D){ //data diterima dari main, kemudian dimasukkan pada parameter C dan D 
    int H;
    C += 10; //data C diproses
    D += 19; // data D di proses
    H = kurang(C, D); // memanggil fungsi kurang dengan mengirim data hasil hitungan C dan D 
    return H; //data diterima dari fungsi kurang,kemudian data dikembalikan pada fungsi main
}

static int kurang(int A, int B){ //data diterima kemudian dimasukkan pada parameter A dan B 
    int X;
    A = A + 7; //data di proses
    B = B + 4;
    X = A%B; //data akhiran di lakukan perhitungan modulus
    return X; //mengembalikan nilai X kemudian dikirim kembali pada fungsi kali
}

int nilai1, nilai2;
Scanner input = new Scanner(System.in);
System.out.println("Masukkan nilai 1: ");
nilai1 = input.nextInt();
System.out.println("Masukkan nilai 2: ");
nilai2 = input.nextInt();
int hasil = kali(nilai1, nilai2); // memanggil funsgi kali dan mengirim data nilai1 dan nilai2
System.out.println("Hasil akhir adalah: " + hasil); //data diterima lalu di keluarkan pada out.print
```

    Masukkan nilai 1: 
    5
    Masukkan nilai 2: 
    3
    Hasil akhir adalah: 22


2. Jelaskan alur jalannya program di percobaan 3 mulai dari input sampai keluar output!

memasukkan nilai 1, dan nilai 2 pada inputan lalu di proses menggunakan fungsi kurang, pada fungsi kurang, bilangan akan ditambah 7 dan 4 lalu nilai akan dikembalikan , dilanjutkan dengan fungsi kali. pada fungsi kali bilangan akan diproses ditambahkan lalu di modulus sebelum dikembalikan. Setelah data di kembalikan bilangan akhir akan di tampilkan.

### Percobaan 4: Mengubah Program Tidak Menggunakan Fungsi dan Menggunakan Fungsi
Pada Percobaan 4, kode program yang dibuat digunakan untuk menghitung luas persegi panjang dan volume balok tanpa menggunakan fungsi dan dengan menggunakan fungsi.
1. Import dan deklarasikan Scanner dengan nama **input**
![Gambar 9](images/4.1.png)

2. Buatlah inputan panjang, lebar, dan tinggi 
![Gambar 10](images/4.2.png)

3. Hitung luas persegi panjang dan volume balok
![Gambar 10](images/4.3.png)


```Java
// Tuliskan kode program Percobaan 4 Langkah 1, 2, & 3
import java.util.Scanner;
Scanner input = new Scanner(System.in);

int p,l,t,L,vol;

System.out.println("Masukkan panjang");
p = input.nextInt();
System.out.println("Masukkan lebar");
l = input.nextInt();
System.out.println("Masukkan tinggi");
t = input.nextInt();

//hitung
L = p*l;
System.out.println("Luas persegi panjang adalah " + L);

vol = p*l*t;
System.out.println("Volume balok adalah " + vol);
```

    Masukkan panjang
    14
    Masukkan lebar
    20
    Masukkan tinggi
    40
    Luas persegi panjang adalah 280
    Volume balok adalah 11200


4. Program menghitung luas persegi dan volume balok diatas jika dibuatkan fungsi maka terdapat 3 fungsi yaitu hitungLuas, hitungVolume dan fungsi main, seperti dibawah ini:

Fungsi hitungLuas

![Gambar 10](images/4.4Luas.png)

Fungsi hitungVolume
![Gambar 10](images/4.4Volume.png)



5. Eksekusi/panggil fungsi **hitungLuas** dan **hitungVolume**

![Gambar 10](images/4.5.png)


```Java
// Tuliskan kode program Percobaan 4 Langkah 1, 2, & 3
static int hitungLuas(int pjg, int lb){
    int luas = pjg*lb;
    return luas;
}

static int hitungVolume(int tinggi, int a, int b){
    int volume = hitungLuas(a,b)*tinggi;
    return volume;
}

Scanner input = new Scanner(System.in);
int p,l,t,L, vol;
System.out.println("Masukkan panjang");
p = input.nextInt();
System.out.println("Masukkan lebar");
l = input.nextInt();
System.out.println("Masukkan tinggi");
t = input.nextInt();

L = hitungLuas(p, l);
System.out.println("Luas persegi panjang adalah " + L);
vol = hitungVolume(t, p, l);
System.out.println("Volume Balok adalah " + vol);
```

    Masukkan panjang
    14
    Masukkan lebar
    20
    Masukkan tinggi
    40
    Luas persegi panjang adalah 280
    Volume Balok adalah 11200


#### Pertanyaan
1. Jelaskan kegunaan parameter yang terdapat didalam fungsi hitungLuas dan hitungVolume!


parameter berfungsi untuk menyimpan nilai yang diberikan

2. Setelah melakukan percobaan 4, menurut anda manakah program yg lebih efisien apakah menggunakan fungsi atau tanpa fungsi? Jelaskan!

program yang lebih efisien menggunakan fungsi dikarenakan kita hanya perlu memanggil fungsi jika diperlukan dan jikalau program berisi banyak sekali code, akan membutuhkan memori lebih banyak

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
static int total = 0, i;

static int [] isiArray(int angka){
    Scanner input = new Scanner(System.in);
    int array[] = new int[angka];
    for(i = 0; i<array.length; i++){
        System.out.println("Masukkan data ke - " + i);
        array[i] =  input.nextInt();
    }
    return array;
}

static void tampilArray(int[] arr){
    for(i = 0; i<arr.length; i++){
        System.out.println("Nilai yang anda inputan ke - " + i);
        System.out.println(arr[i]);
    }
}

static int hitTot(int[] arr){
    for(i=0; i<arr.length; i++){
        total += arr[i];
    }
    return total;
}


import java.util.Scanner;
Scanner input = new Scanner(System.in);
System.out.println("Masukkan jumlah data yang ingin anda inputkan: ");
int jum = input.nextInt();
int []dataArray = isiArray(jum);
tampilArray(dataArray);
total = hitTot(dataArray);
System.out.println("Total nilai = " + total);
```

    Masukkan jumlah data yang ingin anda inputkan: 
    3
    Masukkan data ke - 0
    12
    Masukkan data ke - 1
    34
    Masukkan data ke - 2
    21
    Nilai yang anda inputan ke - 0
    12
    Nilai yang anda inputan ke - 1
    34
    Nilai yang anda inputan ke - 2
    21
    Total nilai = 67


#### Pertanyaan
1. Jelaskan mengapa fungsi tampil array dibuat bertipe void, sedangkan isiarray dan hitTot bertipe int!

karena data tampilArray tidak memerlukan nilai balik, sedangkan nilai isiarrray dan hittot membutuhkan nilai balik untuk dikembalikan.

2. Menurut pendapat anda apakah fugsi isiarray dan hitTot dapat diganti dengan tipe void? Jelaskan dan buktikan dengan program!


```Java
// Tuliskan jawaban nomor 2

// tidak bisa, dikarenakan fungsi isi array dan hittot menggunakan fungsi mengembalikan untuk nilai yang diberikan.
    
//kode 
    static void int[] isiArray(int angka){ //menggunakan void
    Scanner input = new Scanner(System.in);
    int array[] = new int[angka];
    for(i = 0; i<array.length; i++){
        System.out.println("Masukkan data ke - " + i);
        array[i] =  input.nextInt();
    }
//     return array; //jika fungsi data menggunakan void, maka tidak memerlukan return/tidak bisa menembalikan nilai
}

static void tampilArray(int[] arr){
    for(i = 0; i<arr.length; i++){
        System.out.println("Nilai yang anda inputan ke - " + i);
        System.out.println(arr[i]);
    }
}


static void hitTot(int[] arr){ //menggunakan tipe void
    for(i=0; i<arr.length; i++){
        total += arr[i];
    }
//     return total; //tidak berfungsi dikarenakan menggunakan tipe void pada fungsi
}



import java.util.Scanner;
Scanner input = new Scanner(System.in);
System.out.println("Masukkan jumlah data yang ingin anda inputkan: ");
int jum = input.nextInt();
int []dataArray = isiArray(jum);
tampilArray(dataArray);
total = hitTot(dataArray);
System.out.println("Total nilai = " + total);
```


    |       static void int[] isiArray(int angka){ //menggunakan void

    illegal start of expression

    

    |       static void int[] isiArray(int angka){ //menggunakan void

    ';' expected

    

    |       static void int[] isiArray(int angka){ //menggunakan void

    ';' expected

    

    |       static void int[] isiArray(int angka){ //menggunakan void

    ';' expected

    

    |       for(i = 0; i<array.length; i++){

    cannot find symbol

      symbol:   variable i

    

    |       for(i = 0; i<array.length; i++){

    cannot find symbol

      symbol:   variable i

    

    |       for(i = 0; i<array.length; i++){

    cannot find symbol

      symbol:   variable i

    

    |           System.out.println("Masukkan data ke - " + i);

    cannot find symbol

      symbol:   variable i

    

    |           array[i] =  input.nextInt();

    cannot find symbol

      symbol:   variable i

    

    |       int array[] = new int[angka];

    variable angka might not have been initialized

    


## Tugas

1. Buatlah sebuah static method yang bernama Max3(int bil1, int bil2, int bil3) yang menerima 3 buah parameter bilangan integer dan mengembalikan sebuah bilangan integer yang merupakan nilai maksimum diantara ketiga bilangan tersebut. 


```Java
// Tuliskan jawaban nomor 1
static void max3(int bil1,int bil2,int bil3){  //menerima nilai dari inputan main
    int bilBesar; //deklarasi untuk menyimpan nilai
    if(bil1>bil2 && bil1>bil3){ //membandingkan nilai
     bilBesar = bil1;
     }else{
         if(bil2>bil3){ //membandingkan nilai 
     bilBesar = bil2;
         }else{
     bilBesar = bil3; 
     }
     }
    System.out.printf("Angka terbesar dari %d , %d dan %d adalah %d", bil1, bil2, bil3, bilBesar);
    }

Scanner sc = new Scanner(System.in);
int angka1, angka2, angka3, total; //deklarasi angka1, angka2, angka3 dan total

System.out.println("Masukkan bilangan 1");
angka1 = sc.nextInt();
System.out.println("Masukkan bilangan 2");
angka2 = sc.nextInt();
System.out.println("Masukkan bilangan 3");
angka3 = sc.nextInt();
max3(angka1, angka2, angka3); //menjalankan fungsi 

```

    Masukkan bilangan 1
    15
    Masukkan bilangan 2
    22
    Masukkan bilangan 3
    17
    Angka terbesar dari 15 , 22 dan 17 adalah 22

2. Disebuah restoran terdapat 3 menu yang dijual yaitu nasi goreng, soto, dan sate. Harga nasi goreng Rp. 20.000, soto Rp. 15.000, dan sate Rp. 25.000. Restoran tersebut buka dari hari senin sampai jumat. Berikut ini merupakan tabel pejualan perhari untuk masing-masing menu di restoran tersebut dari hari senin sampai jumat
![Gambar 13](images/soal3.png)

Buatlah Fungsi sebagai berikut:
 * Fungsi menampilkan menu favorit di hari selasa dan jumat (menu favorit diasumsikan adalah menu yang paling banyak terjual di hari tersebut)
 * Fungsi untuk menghitung pemasukan restoran tersebut mulai hari senin sampai jumat.
 * Fungsi untuk menghitung berapa porsi yang terjual untuk masing-masing menu yaitu nasi goreng, soto, dan sate mulai senin sampai jumat.


```Java
// Tuliskan jawaban nomor 2
int[][] menu = {{20,15,35,24,70}, //array jumlah porsi
                {30,40,10,28,35},
                {5,10,50,48,15}};
String[] namaMenu = {"Nasi Goreng", "Soto", "Sate"}; //array nama makanan

static void tampilFav(int letak){
    int menuTinggi = menu[0][letak]; // mencari letak dari kolom mulai dari kolom 0
    int banyakJual = 0; //nilai awal dari banyaknya penjualan
    for(int i = 0; i < menu.length; i++){ 
    if(menu[i][letak] > menuTinggi){ //membandingkan nilai dari menu tertinggi 
        menuTinggi = menu[i][letak]; //menyimpan nilai menu minat tertinggi
        banyakJual = i; //hasil akhir banyaknbya penjualan 
    }
}System.out.printf("\nporsi tertinggi dengan jumlah %d porsi adalah %s", menuTinggi, namaMenu[banyakJual]);
}

static void hitungMasuk(){
    int totalHitung = 0; //nilai awal hasil hitungan 
    for(int i = 0; i<menu.length; i++){
        for(int j = 0; j<menu[0].length; j++){
            if (j == 0){ //mencari letak kolom
                totalHitung += menu[i][j]*20000; //setiap baris ke 0 akan dikali 20000  
            } else if (j == 1){ //mencari letak kolom dan hitung harga
                totalHitung += menu[i][j]*15000; // mengkalikan jenis makanan
            } else if(j == 2){
                totalHitung += menu[i][j]*25000; 
            }
        }
    }
    System.out.printf("\njumlah pemasukan dari senin-jumat adalah Rp.%d", totalHitung);
}

static void hitungPorsi(int menPorsi){ //parameter berisi interger untuk data menu nama porsi 
    int totalHitung = 0, jumlahPorsi = 0; //deklarasi nilai awal dari total hitung dan jumlah porsi
    for(int j = 0; j<menu[0].length; j++){ 
            totalHitung += menu[menPorsi][j]; //menghitung jumlah porsi yang terjual
        }
    jumlahPorsi = totalHitung; 
    System.out.printf("\nporsi yang terjual dari %s berjumlah %d porsi",namaMenu[menPorsi], jumlahPorsi); 
}

//memanggil semua fungsi pada main;
tampilFav(1);
tampilFav(4);

hitungMasuk();

hitungPorsi(0);
hitungPorsi(1);
hitungPorsi(2);
```

    
    porsi tertinggi dengan jumlah 40 porsi adalah Soto
    porsi tertinggi dengan jumlah 70 porsi adalah Nasi Goreng
    jumlah pemasukan dari senin-jumat adalah Rp.4450000
    porsi yang terjual dari Nasi Goreng berjumlah 164 porsi
    porsi yang terjual dari Soto berjumlah 143 porsi
    porsi yang terjual dari Sate berjumlah 128 porsi


```Java

```
