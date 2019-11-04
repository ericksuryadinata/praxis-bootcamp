
public class PenjumlahanMatriks{
    public static void main(String[] args){
        int A[][] = new int[2][2];
        int B[][] = new int[2][2];

        // masukkan nilai ke dalam array
        A[0][0] = 1;
        A[0][1] = 3;
        A[1][0] = 4;
        A[1][1] = 5;
        // .... seterusnya lanjutkan sendiri

        // begitupun dengan B

        // masukkan nilai ke dalam array
        B[0][0] = 1;
        // .... seterusnya lanjutkan sendiri

        System.out.println("MATRIKS A");
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println(" ");
        }

        System.out.println("MATRIKS B");
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.println(" ");
        }

        // kita buat dulu variabel untuk menampung hasil tersebut
        int hasil = 0;
        // selanjutkan kita akses array tersebut, dan ditambahkan dengan array yang lain
        System.out.println("HASIL PENJUMLAHAN MATRIKS A DAN B");
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A.length; j++){
                hasil = hasil + A[i][j] + B[i][j];
                System.out.print(hasil + " ");
                hasil = 0;
            }
        }
    }
}