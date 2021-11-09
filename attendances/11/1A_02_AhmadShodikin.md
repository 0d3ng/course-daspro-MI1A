# JOBSHEET 11. ARRAY 2

# NAMA : Ahmad Shodikin
# NIM     : 2131710132


## Tujuan
* Mahasiswa mampu memahami pembuatan array dua dimensi
* Mahasiswa mampu menyelesaikan studi kasus dengan memanfaatkan array dua dimensi

## Alat dan Bahan
* PC/Laptop
* Browser
* Koneksi internet
* Anaconda3 + Java kernel (opsional)

## Praktikum

### Percobaan 1: Deklarasi, Inisialisasi, dan Menampilkan Array 2 Dimensi
Pada Percobaan 1, kode program yang dibuat digunakan untuk menyimpan nilai praktikum dari 2 orang mahasiswa pada 3 mata kuliah yang berbeda.
1.	Buat array bertipe **integer** dengan nama **nilai** dengan kapasitas baris 2 elemen (menyatakan jumlah mahasiswa) dan kolom 3 elemen (menyatakan jumlah mata kuliah)
![Gambar 1](images/percobaan1-1.PNG)


```Java
// Tuliskan kode program Percobaan 1 Langkah 1
int[][] nilai = new int[2][3];
```

2. Isi masing-masing elemen array **nilai** sebagai berikut:
![Gambar 2](images/percobaan1-2.PNG)


```Java
// Tuliskan kode program Percobaan 1 Langkah 2
nilai[0][0] = 75;
nilai[0][1] = 90;
nilai[0][2] = 88;
nilai[1][0] = 79;
nilai[1][1] = 82;
nilai[1][2] = 67;
```




    67



3. Tampilkan semua isi elemen array **nilai**
![Gambar 3](images/percobaan1-3.PNG)


```Java
// Tuliskan kode program Percobaan 1 Langkah 2

for(int i = 0; i<nilai.length;){ //perulangan akan dijalankan jika i lebih kecil dari jmlah index
    for(int j = 0; j<nilai[0].length; j++){ //sama namun mengambil panjang index kolom
    System.out.print(nilai[i][j]);  // mengeluarkan nilai baris [i] dan kolom [j]
        System.out.print(" ");
        if(j == 2) //jika kolom sampai keindex 2 akan dijalankan lane baru 
            System.out.println(" ");
}
i++;
}
```

    75 90 88  
    79 82 67  


#### Pertanyaan
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks 0? Jelaskan!

// Tuliskan jawaban nomor 1

tidak harus dari 0, namun pada umumnya diisi dengan 0 karena memudahkan untuk memgetahui dimana letak kordinat

2. Lakukan modifikasi pada Percobaan 1 Langkah 3 untuk menampilkan semua isi elemen array **nilai** menggunakan perulangan *for*


```Java
// Tuliskan jawaban nomor 2
-
```

### Percobaan 2: Mengisi Elemen Array 2 Dimensi Menggunakan Input Keyboard
Pada Percobaan 2, kode program yang dibuat digunakan untuk menyimpan nilai rating restoran yang terdaftar pada aplikasi pemesanan makanan online. Rating diberikan oleh 4 orang pengguna kepada 2 restoran yang terdaftar.
1. Import dan deklarasikan Scanner dengan nama **sc**
![Gambar 4](images/percobaan2-1.jpg)


```Java
// Tuliskan kode program Percobaan 2 Langkah 1
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
```

2.	Buat array bertipe **integer** dengan nama **rating** dengan kapasitas baris 4 elemen (menyatakan jumlah pengguna) dan kolom 2 elemen (menyatakan jumlah restoran)
![Gambar 5](images/percobaan2-2.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 2
int [][] rating = new int[4][2];
```

3. Dengan menggunakan perulangan *for*, buat input untuk mengisi elemen array **rating**
![Gambar 6](images/percobaan2-3.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 3
for(int i = 0; i< rating.length; i++){
    for(int j = 0; j < rating[0].length; j++){
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j + " : ");
        rating[i][j] = sc.nextInt();
    }
    System.out.println("");
}
```

    Masukkan rating pengguna 0 untuk restoran 0 : 98
    Masukkan rating pengguna 0 untuk restoran 1 : 88
    
    Masukkan rating pengguna 1 untuk restoran 0 : 78
    Masukkan rating pengguna 1 untuk restoran 1 : 99
    
    Masukkan rating pengguna 2 untuk restoran 0 : 86
    Masukkan rating pengguna 2 untuk restoran 1 : 65
    
    Masukkan rating pengguna 3 untuk restoran 0 : 78
    Masukkan rating pengguna 3 untuk restoran 1 : 66
    


###### 4. Dengan menggunakan perulangan *for-each*, tampilkan semua isi elemen dari array **rating**
![Gambar 7](images/percobaan2-4.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 4
for(int[] rtg : rating){  // mengambil data baris 
    for(int r : rtg) { // mengambil data pada kolom
        System.out.print(r + " "); // output data
    }
    System.out.println(" ");
}
```

    98 98  
    12 34  
    98 88  
    89 45  


#### Pertanyaan
1. Pada Percobaan 2 Langkah 3, dapatkah posisi i ditukar dengan posisi i? Jelaskan alasannya!

// Tuliskan jawaban nomor 1

posisi i dapat diganti dengan i karena merupakan variable yang sama, namun jika i diganti dengan J maka program akan error 


2. Tambahkan kode program untuk menentukan banyaknya baris dan kolom elemen array secara dinamis (baris dan kolom ditentukan saat program berjalan melalui input keyboard)!


```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

System.out.print("masukkan baris data ");
int baris = sc.nextInt();
System.out.print("masukkan kolom data ");
int kolom = sc.nextInt();


int [][] rating = new int[baris][kolom];

for(int i = 0; i< rating.length; i++){ 
    for(int j = 0; j < rating[kolom].length; j++){
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j + " : ");
        rating[i][j] = sc.nextInt();
    }
    System.out.println("");
}

for(int[] rtg : rating){
    for(int r : rtg) {
        System.out.print(r + " ");
    }
    System.out.println(" ");
}
```

    masukkan baris data 4
    masukkan kolom data 2
    Masukkan rating pengguna 0 untuk restoran 0 : 45
    Masukkan rating pengguna 0 untuk restoran 1 : 43
    
    Masukkan rating pengguna 1 untuk restoran 0 : 67
    Masukkan rating pengguna 1 untuk restoran 1 : 65
    
    Masukkan rating pengguna 2 untuk restoran 0 : 43
    Masukkan rating pengguna 2 untuk restoran 1 : 88
    
    Masukkan rating pengguna 3 untuk restoran 0 : 76
    Masukkan rating pengguna 3 untuk restoran 1 : 65
    
    45 43  
    67 65  
    43 88  
    76 65  


### Percobaan 3: Melakukan Operasi Aritmatika pada Elemen Array 2 Dimensi
Pada Percobaan 3, kode program yang dibuat digunakan untuk menghitung nilai rata-rata harga setiap bahan pokok selama 1 satu semester. Terdapat 3 bahan pokok yang dicatat harganya setiap akhir bulan. Program dibuat berdasarkan flowchart berikut.
![Gambar 8](images/percobaan3.jpg)
1. Import dan deklarasikan Scanner dengan nama **sc**
![Gambar 9](images/percobaan3-1.jpg)


```Java
// Tuliskan kode program Percobaan 3 Langkah 1
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
```

2.	Buat array bertipe **integer** dengan nama **harga** dengan kapasitas baris 3 elemen (menyatakan jumlah bahan pokok) dan kolom 6 elemen (menyatakan jumlah bulan). Deklarasikan juga variabel **total** dan **rata** bertipe **double**
![Gambar 10](images/percobaan3-2.PNG)


```Java
// Tuliskan kode program Percobaan 3 Langkah 2
int [][] harga = new int[3][6];
double total, rata;
```

3. Dengan menggunakan perulangan *for*, buat input untuk mengisi elemen array **harga**. Kemudian, perhitungan total harga dilakukan untuk setiap bulan (kolom) pada setiap bahan pokok (baris). Setelah itu, nilai rata-rata dihitung untuk setiap bahan pokok (tiap satu baris) dan ditampilkan
![Gambar 11](images/percobaan3-3.PNG)


```Java
// Tuliskan kode program Percobaan 3 Langkah 3
for (int i = 0; i< harga.length; i++){
    total = 0; //memberikan nilai awal 
    rata = 0;
    for(int j = 0; j< harga[0].length; j++) {
        System.out.printf("Masukkan harga [%d][%d]: ", i, j); //mengeluarkan data kolom i dan j
        harga[i][j] = sc.nextInt();
        total += harga[i][j];
    }
    rata = total/harga[0].length;
    System.out.printf("Rata-rata harga bahan ke-%d adalah %.2f \n", i, rata);
}
```

    Masukkan harga [0][0]: 12000
    Masukkan harga [0][1]: 25000
    Masukkan harga [0][2]: 43000
    Masukkan harga [0][3]: 25000
    Masukkan harga [0][4]: 66000
    Masukkan harga [0][5]: 45000
    Rata-rata harga bahan ke-0 adalah 36000.00 
    Masukkan harga [1][0]: 32000
    Masukkan harga [1][1]: 120
    Masukkan harga [1][2]: 230
    Masukkan harga [1][3]: 450
    Masukkan harga [1][4]: 540
    Masukkan harga [1][5]: 2300
    Rata-rata harga bahan ke-1 adalah 5940.00 
    Masukkan harga [2][0]: 120000
    Masukkan harga [2][1]: 2300
    Masukkan harga [2][2]: 324000
    Masukkan harga [2][3]: 12000
    Masukkan harga [2][4]: 32000
    Masukkan harga [2][5]: 34000
    Rata-rata harga bahan ke-2 adalah 87383.33 


#### Pertanyaan
1. Jelaskan fungsi dari **rata = total / harga[0].length**!

// Tuliskan jawaban nomor 1

menghitung rata rata dari total dibagi jumlah index harga kolom[0]

2. Mengapa insialisasi variabel **total = 0** dan **rata = 0** berada di dalam perulangan *for* yang pertama? Menurut Anda, apa yang terjadi jika inisialisasi kedua variabel tersebut diletakkan di luar perulangan *for* (setelah deklarasi array)?

// Tuliskan jawaban nomor 2

nilai total dan rata 0 digunakan sebagai data awal sebuah variabel, jika variable dirubah keluar perulangan for maka program akan tetap berjalan namun data yang ada pada total dan rata akan terus bertambah/tidak di reset, jika ada dalam perulangan maka data akan direset setiap data ditampilkan

## Tugas

1. Perhatikan flowchart berikut.
![Gambar 12](images/tugas-1.jpg)
Buat kode program sesuai dengan flowchart tersebut untuk mencari suhu tertinggi yang dicatat dari 5 kota di Jepang selama 7 hari berturut-turut!


```Java
// Tuliskan jawaban nomor 1
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

double suhu[][] = new double[5][7];
int x, y;
double max = 0;


for(x = 0; x < suhu.length; x++){
    for(y = 0; y< suhu[0].length; y++){
        System.out.print("Masukkan suhu : ");
        suhu [x][y] = sc.nextDouble();
    
    if(suhu[x][y] > max)
        max = suhu[x][y]; // data pada max akan terus di update
}
} 

System.out.print("Hasil max suhu adalah: " + max);
```

    Masukkan suhu34
    Masukkan suhu32
    Masukkan suhu54
    Masukkan suhu34
    Masukkan suhu32
    Masukkan suhu78
    Masukkan suhu65
    Masukkan suhu54
    Masukkan suhu34
    Masukkan suhu32
    Masukkan suhu45
    Masukkan suhu65
    Masukkan suhu54
    Masukkan suhu43
    Masukkan suhu78
    Masukkan suhu65
    Masukkan suhu43
    Masukkan suhu56
    Masukkan suhu54
    Masukkan suhu43
    Masukkan suhu54
    Masukkan suhu43
    Masukkan suhu32
    Masukkan suhu78
    Masukkan suhu65
    Masukkan suhu43
    Masukkan suhu32
    Masukkan suhu78
    Masukkan suhu98
    Masukkan suhu87
    Masukkan suhu76
    Masukkan suhu66
    Masukkan suhu54
    Masukkan suhu43
    Masukkan suhu43
    Hasil max suhu adalah98.0

##### 2. Terdapat hasil pencatatan data lima mahasiswa yang berisi informasi mengenai umur, berat badan (kg), dan tinggi badan (cm). Data tersebut disimpan ke dalam array dua dimensi.
![Gambar 13](images/tugas-2.PNG)
*Keterangan: penyimpanan nilai dapat dilakukan melalui inisialisasi menggunakan operator assignment*
 * Tampilkan *berat badan terendah* di antara kelima mahasiswa tersebut
 * Tampilkan *rata-rata tinggi badan* dari kelima mahasiswa tersebut
 * Tampilkan nama mahasiswa dengan *umur tertua* di antara kelima mahasiswa tersebut


```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

int data[][] = new int[5][4];
int x,y;
String[] nama = {"Desi", "Rofan", "lala", "Beky", "Ega"}; //data array nama
String namaNo; 
int rataTinggi;
int beratMin = 2000, umurMax=0, dataTinggi=0; //nilai awal/temp dari berat,umur,tinggi untuk perbandingan
 

for(y=0; y <data[0].length; y++){
    if(y == 0){
        for(x = 0; x<data.length;){
        System.out.print("Masukkan umur " + nama[x] + " : "); //masukkan data nama
        data[x][y] = sc.nextInt();
        
        if(data[x][y]>umurMax){
            umurMax = data[x][y]; //membandingkan data nama dengan umur
            namaNo = nama[x]; 
        }
        x++;
    }
        System.out.print("\n");
    }else if(y == 1){ // jika data baris samadengan index 1 akan dijalankan
        for(x = 0; x<data.length;){
        System.out.print("Masukkan berat " + nama[x] +  " : "); //masukkan data berat
        data[x][y] = sc.nextInt();
        
        if(data[x][y]<beratMin){ //menghitung data berat 
            beratMin = data[x][y]; // menganti berat minimal dengan data index pada baris x dan kolom y
        }
        x++;
    }
        System.out.print("\n");
    }else if(y == 2){
        for(x=0; x<data.length;){
        System.out.print("Masukkan tinggi " + nama[x] + " : "); // masukkan tinggi badan setiap mahasiswa
        data[x][y] = sc.nextInt(); // memasukkan data pada baris x dan kolom y
            
        dataTinggi += data[x][y];
        x++;
    }
        System.out.print("\n");
    }   
}
    rataTinggi = dataTinggi/data.length; // menghitung rata tinggi dari datatinggi dibagi total index data x

System.out.print("\n");
System.out.println("Berat badan terendah adalah :" + beratMin);
System.out.println("rerata tinggi badan adalah  :" + rataTinggi);
System.out.println("Mahasiswa paling tua adalah :" + namaNo);
```

    Masukkan umur Desi : 19
    Masukkan umur Rofan : 18
    Masukkan umur lala : 18
    Masukkan umur Beky : 20
    Masukkan umur Ega : 19
    
    Masukkan berat Desi : 51
    Masukkan berat Rofan : 55
    Masukkan berat lala : 45
    Masukkan berat Beky : 46
    Masukkan berat Ega : 58
    
    Masukkan tinggi Desi : 155
    Masukkan tinggi Rofan : 163
    Masukkan tinggi lala : 153
    Masukkan tinggi Beky : 158
    Masukkan tinggi Ega : 160
    
    
    Berat badan terendah adalah :45
    rerata tinggi badan adalah  :157
    Mahasiswa paling tua adalah :Beky


#### 


```Java

```
