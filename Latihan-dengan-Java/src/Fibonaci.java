/**
 * Program latihan pemrograman mencari deret fibonaci dengan Java
 * @author Anas Naufal Al-kiram
 * @version 05/11/2021
 */

import java.util.Scanner;

public class Fibonaci 
{
    public static void main(String[] args) 
    {
        /** 
         * variabel i mulai dengan angka 2 karena 2 nilai deret awal sudah diisi dengan nilai a dan b sebelum di ubah 
         * variabel a mulai dengan 0
         * variabel b mulai dengan 1
         * variabel sum akan menambahkan nilai a dan b
         * variabel n adalah jumlah deret yang diinginkan, untuk nilainya akan diinputkan
         */ 
        int i = 2, n, a = 0, b = 1, sum;

        Scanner scanner = new Scanner(System.in); // objek scanner di buat untuk dapat memasukkan nilai ke variabel n

        System.out.print("Masukkan jumlah deret yang diinginkan: ");
        n = scanner.nextInt();

        System.out.print(a + ", " + b); // ini akan menampilkan 2 angka pertama dari deret
       
        while(i <= n) // perulangan akan berhenti jika i lebih kecil atau sama dengan n
        {
            sum = a + b; // nilai a+b akan terus di jumlahkan
            System.out.print(", " + sum); // nilai sum akan di tampilkan setiap kali terjadi perulangan
            a = b; // nilai a digantikan dengan b
            b = sum; // nilai b akan di gantikan  dengan nilai sum
            i++; // nilai i akan terus bertambah
        }
        System.out.println("");
        scanner.close(); // objek scanner ditutup agar tidak ada peringatan
    }
}
