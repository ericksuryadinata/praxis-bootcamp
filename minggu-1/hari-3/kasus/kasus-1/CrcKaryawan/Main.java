
/**
 * Main
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kodeKaryawan = 0;
        String namaKaryawan = "";
        String namaDepartemen = "";
        int jamMasuk = 0;
        int jamKeluar = 0;
        int gaji = 0;
        String next = "t";
        do {

            System.out.print("Department : ");
            namaDepartemen = input.next();
            System.out.print("Kode Karyawan : ");
            kodeKaryawan = input.nextInt();
            System.out.print("Nama Karyawan : ");
            namaKaryawan = input.next();
            System.out.print("Jam Masuk (1-24) : ");
            jamMasuk = input.nextInt();
            System.out.print("Jam Keluar (1-24) : ");
            jamKeluar = input.nextInt();
            System.out.print("Gaji : ");
            gaji = input.nextInt();

            // cek kalau jam masuk dan keluar gak lebih dari 24
            if(jamMasuk < 24 || jamKeluar < 24){
                Department department = new Department(namaDepartemen,kodeKaryawan, namaKaryawan);
                department.setJamMasuk(jamMasuk);
                department.setJamKeluar(jamKeluar);
                department.setGaji(gaji);
                department.print();
            }else{
                System.out.println("Sepertinya jam masuk atau jam keluar anda salah");
            }

            System.out.print("Input Lagi ? y/t");
            next = input.next();
        } while (next.equalsIgnoreCase("y"));
    }
}