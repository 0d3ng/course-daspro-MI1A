# JOBSHEET 11. ARRAY 2

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
int [][] nilai = new int [2][3];
```

2. Isi masing-masing elemen array **nilai** sebagai berikut:
![Gambar 2](images/percobaan1-2.PNG)


```Java
// Tuliskan kode program Percobaan 1 Langkah 2
nilai [0][0] = 75;
nilai [0][1] = 90;
nilai [0][2] = 88;
nilai [1][0] = 79;
nilai [1][1] = 82;
nilai [1][2] = 67;
```




    67



3. Tampilkan semua isi elemen array **nilai**
![Gambar 3](images/percobaan1-3.PNG)


```Java
// Tuliskan kode program Percobaan 1 Langkah 2
System.out.println(nilai[0][0]+ " " +nilai[0][1]+ " " +nilai[0][2]);
System.out.println(nilai[1][0]+ " " +nilai[1][1]+ " " +nilai[1][2]);
```

    75 90 88
    79 82 67


#### Pertanyaan
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks 0? Jelaskan!


```Java
// Tuliskan jawaban nomor 1
Tidak, karena pengisisan elemen bisa secara terpisah - pisah   
```

2. Lakukan modifikasi pada Percobaan 1 Langkah 3 untuk menampilkan semua isi elemen array **nilai** menggunakan perulangan *for*


```Java
// Tuliskan jawaban nomor 2
int [][] nilai = new int [2][3];
nilai [0][0] = 75;
nilai [0][1] = 90;
nilai [0][2] = 88;
nilai [1][0] = 79;
nilai [1][1] = 82;
nilai [1][2] = 67;
for(int i=0; i<nilai.length; i++){
    for(int j=0; j<nilai[0].length; j++){
        System.out.print(" "+nilai[i][j]);
    }
    System.out.println();
}
```

     75 90 88
     79 82 67


### Percobaan 2: Mengisi Elemen Array 2 Dimensi Menggunakan Input Keyboard
Pada Percobaan 2, kode program yang dibuat digunakan untuk menyimpan nilai rating restoran yang terdaftar pada aplikasi pemesanan makanan online. Rating diberikan oleh 4 orang pengguna kepada 2 restoran yang terdaftar.
1. Import dan deklarasikan Scanner dengan nama **sc**
![Gambar 4](images/percobaan2-1.jpg)


```Java
// Tuliskan kode program Percobaan 2 Langkah 1
import java.util.Scanner;
Scanner sc = new Scanner (System.in);
```

2.	Buat array bertipe **integer** dengan nama **rating** dengan kapasitas baris 4 elemen (menyatakan jumlah pengguna) dan kolom 2 elemen (menyatakan jumlah restoran)
![Gambar 5](images/percobaan2-2.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 2
int[][] rating = new int[4][2];
```

3. Dengan menggunakan perulangan *for*, buat input untuk mengisi elemen array **rating**
![Gambar 6](images/percobaan2-3.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 3
for(int i=0; i<rating.length; i++){
    for(int j=0; j<rating[0].length; j++){
        System.out.print("Masukkan rating pengguna " +i+ " untuk restoran " +j+ " : ");
        rating[i][j]=sc.nextInt();
    }
    System.out.println("");
}
```

    Masukkan rating pengguna 0 untuk restoran 0 : 90
    Masukkan rating pengguna 0 untuk restoran 1 : 44
    
    Masukkan rating pengguna 1 untuk restoran 0 : 98
    Masukkan rating pengguna 1 untuk restoran 1 : 0
    
    Masukkan rating pengguna 2 untuk restoran 0 : 56
    Masukkan rating pengguna 2 untuk restoran 1 : 43
    
    Masukkan rating pengguna 3 untuk restoran 0 : 66
    Masukkan rating pengguna 3 untuk restoran 1 : 78
    


4. Dengan menggunakan perulangan *for-each*, tampilkan semua isi elemen dari array **rating**
![Gambar 7](images/percobaan2-4.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 4
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int[][] rating = new int[4][2];

for(int i=0; i<rating.length; i++){
    for(int j=0; j<rating[0].length; j++){
        System.out.print("Masukkan rating pengguna " +i+ " untuk restoran " +j+ " : ");
        rating[i][j]=sc.nextInt();
    }
    System.out.println("");
}

System.out.println("");

for(int[] rtg : rating){
    for(int r : rtg){
        System.out.print(r + " ");
    }
    System.out.println("");
}
```

    Masukkan rating pengguna 0 untuk restoran 0 : 99
    Masukkan rating pengguna 0 untuk restoran 1 : 100
    
    Masukkan rating pengguna 1 untuk restoran 0 : 1
    Masukkan rating pengguna 1 untuk restoran 1 : 12
    
    Masukkan rating pengguna 2 untuk restoran 0 : 88
    Masukkan rating pengguna 2 untuk restoran 1 : 67
    
    Masukkan rating pengguna 3 untuk restoran 0 : 8
    Masukkan rating pengguna 3 untuk restoran 1 : 98
    
    
    99 100 
    1 12 
    88 67 
    8 98 


#### Pertanyaan
1. Pada Percobaan 2 Langkah 3, dapatkah posisi i ditukar dengan posisi i? Jelaskan alasannya!


```Java
//Tuliskan jawaban nomor 1
Bisa, karena penukaran tersebut tidak akan membuat error
```

2. Tambahkan kode program untuk menentukan banyaknya baris dan kolom elemen array secara dinamis (baris dan kolom ditentukan saat program berjalan melalui input keyboard)!


```Java
//Tuliskan jawaban nomor 2
import java.util.Scanner;
Scanner sc = new Scanner(System.in); 
System.out.print("Masukkan panjang baris : ");
int x = sc.nextInt();
System.out.print("Masukkan panjang kolom : ");
int y = sc.nextInt();
int[][] rating = new int[x][y];
for (int i=0; i<rating.length; i++){ 
    for (int j=0; j<rating[0].length; j++){ 
        System.out.print("Masukkan rating pengguna "+ i + " untuk restoran " + j + " : "); 
        rating[i][j] = sc.nextInt(); 
    }
    System.out.println("");
}
```

    Masukkan panjang baris : 2
    Masukkan panjang kolom : 3
    Masukkan rating pengguna 0 untuk restoran 0 : 99
    Masukkan rating pengguna 0 untuk restoran 1 : 87
    Masukkan rating pengguna 0 untuk restoran 2 : 56
    
    Masukkan rating pengguna 1 untuk restoran 0 : 12
    Masukkan rating pengguna 1 untuk restoran 1 : 55
    Masukkan rating pengguna 1 untuk restoran 2 : 91




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
for(int i=0; i<harga.length; i++){
    total=0;
    rata=0;
    for(int j=0; j<harga[0].length; j++){
        System.out.printf("Masukkan harga [%d][%d]: ",i,j);
        harga[i][j]=sc.nextInt();
        total += harga[i][j];
    }
    rata = total / harga[0].length;
    System.out.printf("Rata-rata harga bahan ke-%d adalah %.2f\n",i,rata);
}
```

    Masukkan harga [0][0]: 1000
    Masukkan harga [0][1]: 2000
    Masukkan harga [0][2]: 3000
    Masukkan harga [0][3]: 4000
    Masukkan harga [0][4]: 5000
    Masukkan harga [0][5]: 6000
    Rata-rata harga bahan ke-0 adalah 3500.00
    Masukkan harga [1][0]: 1500
    Masukkan harga [1][1]: 2500
    Masukkan harga [1][2]: 3500
    Masukkan harga [1][3]: 4500
    Masukkan harga [1][4]: 5500
    Masukkan harga [1][5]: 6500
    Rata-rata harga bahan ke-1 adalah 4000.00
    Masukkan harga [2][0]: 10000
    Masukkan harga [2][1]: 120000
    Masukkan harga [2][2]: 13000
    Masukkan harga [2][3]: 14000
    Masukkan harga [2][4]: 15000
    Masukkan harga [2][5]: 14500
    Rata-rata harga bahan ke-2 adalah 31083.33


## Pertanyaan
1. Jelaskan fungsi dari **rata = total / harga[0].length**!


```Java
// Tuliskan jawaban nomor 1
hasil dari rata sama dengan total dibagi harga[0].length
```

2. Mengapa insialisasi variabel **total = 0** dan **rata = 0** berada di dalam perulangan *for* yang pertama? Menurut Anda, apa yang terjadi jika inisialisasi kedua variabel tersebut diletakkan di luar perulangan *for* (setelah deklarasi array)?


```Java
// Tuliskan jawaban nomor 2
Akan terjadi error karena inisialisasi variabel tidak boleh diluar for 
```

## Tugas

1. Perhatikan flowchart berikut.
![Gambar 12](images/tugas-1.jpg)
Buat kode program sesuai dengan flowchart tersebut untuk mencari suhu tertinggi yang dicatat dari 5 kota di Jepang selama 7 hari berturut-turut!


```Java
// Tuliskan jawaban nomor 1

//deklarasi scanner
import java.util.Scanner;
Scanner in = new Scanner(System.in);

//Deklarasi variabel
double suhu[][] = new double [5][7];
int x,y;
double max= 0;

//memproses inputan 
for(x=0; x<suhu.length; x++){
    for(y=0; y<suhu[0].length; y++){
        System.out.printf("Masukkan suhu kota %d : ",(x+1));//meminta inputan keyboard
        suhu[x][y]=in.nextDouble();
        if(suhu[x][y]>max){
            max=suhu[x][y];
        }
    }System.out.println();//Enter
}
System.out.println("Suhu tertinggi : "+max);//Menampilkan hasil hitung
```

    Masukkan suhu kota 1 : 90
    Masukkan suhu kota 1 : 12
    Masukkan suhu kota 1 : 34
    Masukkan suhu kota 1 : 6
    Masukkan suhu kota 1 : 67
    Masukkan suhu kota 1 : 2
    Masukkan suhu kota 1 : 23

    Masukkan suhu kota 2 : 4
    Masukkan suhu kota 2 : 45
    Masukkan suhu kota 2 : 7
    Masukkan suhu kota 2 : 334
    Masukkan suhu kota 2 : 56
    Masukkan suhu kota 2 : 2
    Masukkan suhu kota 2 : 4

    Masukkan suhu kota 3 : 67
    Masukkan suhu kota 3 : 2
    Masukkan suhu kota 3 : 34
    Masukkan suhu kota 3 : 6
    Masukkan suhu kota 3 : 34
    Masukkan suhu kota 3 : 67
    Masukkan suhu kota 3 : 45

    Masukkan suhu kota 4 : 7
    Masukkan suhu kota 4 : 56
    Masukkan suhu kota 4 : 7
    Masukkan suhu kota 4 : 545
    Masukkan suhu kota 4 : 73
    Masukkan suhu kota 4 : 34
    Masukkan suhu kota 4 : 6

    Masukkan suhu kota 5 : 7
    Masukkan suhu kota 5 : 78
    Masukkan suhu kota 5 : 98
    Masukkan suhu kota 5 : 34
    Masukkan suhu kota 5 : 6
    Masukkan suhu kota 5 : 34
    Masukkan suhu kota 5 : 6

    Suhu tertinggi : 545.0

    


2. Terdapat hasil pencatatan data lima mahasiswa yang berisi informasi mengenai umur, berat badan (kg), dan tinggi badan (cm). Data tersebut disimpan ke dalam array dua dimensi.
![Gambar 13](images/tugas-2.PNG)
*Keterangan: penyimpanan nilai dapat dilakukan melalui inisialisasi menggunakan operator assignment*
 * Tampilkan *berat badan terendah* di antara kelima mahasiswa tersebut
 * Tampilkan *rata-rata tinggi badan* dari kelima mahasiswa tersebut
 * Tampilkan nama mahasiswa dengan *umur tertua* di antara kelima mahasiswa tersebut


```Java
// Tuliskan jawaban nomor 2

//Inisialisasi array Umur, berat badan, dan tinggi badan
int[][] mahasiswa = {
        {19, 51, 155},
        {18, 55, 163},
        {18, 45, 153},
        {20, 46, 158},
        {19, 58, 160}
    };

//Inisialisasi array nama
String[] nama = {
        {"Desi"}, 
        {"Rofan"},
        {"Lala"},
        {"Beky"},
        {"Ega"}
    };

//menghitung berat badan
int a,b, beratBadan=46;
for(a=0; a<mahasiswa.length; a++){
    for(b=0; b<mahasiswa[1].length; b++){
        if(mahasiswa[a][1]<beratBadan){
            beratBadan = mahasiswa[a][1];
        }
    }
}
//menampilkan hasil hitung berat badan
System.out.printf("Berat badan terendah dari kelima mahasiswa adalah %d",beratBadan);

//menghitung rata rata tinggi badan mahasiswa
double totalBerat = 0, rataRata = 0;
for(a=0; a<mahasiswa.length; a++){
    for(b=0; b<mahasiswa[0].length; b++){
        if(b==2){
            totalBerat += mahasiswa[a][b];
        }
    }
}
rataRata = totalBerat / mahasiswa.length;
//menampilkan hasil hitung rata rata tinggi mahasiswa
System.out.println("");
System.out.println("Rata-rata tinggi badan dari kelima mahasiswa tersebut adalah "+rataRata);


//menghitung umur tertua dari mahsiswa
int umur;
int tertua=0;
for(a=0; a<mahasiswa.length; a++){
    for(b=0; b<mahasiswa[0].length; b++){
        if(mahasiswa[a][0]>tertua){
            tertua=mahasiswa[a][0];
            umur = a;
        }
    }
}
//menampilkan hasil hitung dari umur tertua mahsiswa
System.out.println("Nama mahasiswa dengan umur tertua ialah "+nama[umur]);
```

    Berat badan terendah dari kelima mahasiswa adalah 45
    Rata-rata tinggi badan dari kelima mahasiswa tersebut adalah 157.8
    Nama mahasiswa dengan umur tertua ialah Beky
