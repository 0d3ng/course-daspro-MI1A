import java.util.Scanner;

public class Kuis2
{  
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan ukuran matrik: ");
        int matrik = sc.nextInt();

        int matriksA[][] = new int[matrik][matrik];
        int matriksB[][] = new int[matrik][matrik];
		int matriks[][] = new int[matrik][matrik];

        System.out.println("Masukkan matrik A: ");
        for(int i = 0; i < matriks.length; i++)
        {
            for(int j = 0; j < matriks[0].length; j++)
            {
                System.out.printf("elemen [%d,%d]: ",i,j);
                matriksA[i][j] = sc.nextInt();
            }
        }

        System.out.println("Masukkan matrik B: ");
        for(int i = 0; i < matriks.length; i++)
        {
            for(int j = 0; j < matriks[0].length; j++)
            {
                System.out.printf("elemen [%d,%d]: ",i,j);
                matriksB[i][j] = sc.nextInt();
            }
        }
       
        int pilih;
        boolean kondisi = true;
        double rata, total = 0;
       
        while(kondisi){
            System.out.println("");
            System.out.println("Program square matrik simpel");
            System.out.println("1. Pengurangan matrik");
            System.out.println("2. Tampil elemen diagonal kanan");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();

            switch(pilih){
            case 1:
                System.out.println("Hasil pengurangan: ");
                for(int i = 0; i < matriks.length; i++)
                {
                    for(int j = 0; j < matriks[0].length; j++)
                    {
                        matriks[i][j] = matriksA[i][j] - matriksB[i][j];
                        System.out.printf("%2d ",matriks[i][j]);
                    }
                    System.out.println("");
                }
			break;
			
          
            case 2:
                System.out.println("Elemen diagonal kanan: ");
                for(int i = 0; i < matriks.length; i++)
                {
                    for(int j = 0; j < matriks[0].length; j++)
                    {
                        if(i == j)
                        {
                            System.out.printf("%2d\n",matriks[i][j]);
                            total += matriks[i][j];
                        }
                    }
                }
                rata = total / matrik;
                System.out.printf("Hasil rata-rata: %.2f\n",rata);
			break;
                        
            default:
			kondisi = false;
            break; 
                                    
            }
        }
	}
}

/*
NAMA: MOCH AZHARUL B
NIM: 2131710097
KELAS: MI-1A

HASIL
Masukkan ukuran matrik: 2
Masukkan matrik A:
elemen [0,0]: 10
elemen [0,1]: 20
elemen [1,0]: 30
elemen [1,1]: 10
Masukkan matrik B:
elemen [0,0]: 20
elemen [0,1]: 30
elemen [1,0]: 40
elemen [1,1]: 10

Program square matrik simpel
1. Pengurangan matrik
2. Tampil elemen diagonal kanan
3. Keluar
Pilih: 1
Hasil pengurangan:
-10 -10
-10  0

Program square matrik simpel
1. Pengurangan matrik
2. Tampil elemen diagonal kanan
3. Keluar
Pilih: 2
Elemen diagonal kanan:
-10
 0
Hasil rata-rata: -5.00

Program square matrik simpel
1. Pengurangan matrik
2. Tampil elemen diagonal kanan
3. Keluar
Pilih:
*/