import java.util.Scanner;

/**
 * Program untuk melakukan pengecekan kata dalam palindrom dalam bahasa java
 * 
 * Palindrom adalah sebuah kata, frasa, angka maupun susunan lainnya yang dapat dibaca dengan 
 * sama baik dari depan maupun belakang (spasi antara huruf-huruf biasanya diperbolehkan). (wikipedia)
 * 
 * @author Anas Naufal al-kiram
 * @version 05/11/2021
 */
public class Palindrom 
{    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String kata;
        String rev = "";

        System.out.print("Kata yang akan di cek: ");
        kata = scanner.next();
        int length = kata.length() - 1;

       for(int i = length; i>=0 ; i--)
           rev += kata.charAt(i);

        if(kata.equals(rev))
        {
            System.out.println("Kata yang di cek palindrom");
        }
        else
        {
            System.out.println("Kata yang di cek bukan palindrom");
        }
        scanner.close();
    }
}
