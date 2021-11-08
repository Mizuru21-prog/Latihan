import java.util.Scanner;

/**
 * program bilangan ganjil genap
 * @author Anas Naufal Al-kiram
 * @version 07/11/21
 */

public class number
{
    
    public static void main(String[] args) 
    {
        int num;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat: ");
        num = scanner.nextInt();

        if(num % 2 == 0)
        {
            System.out.println(num + " adalah bilangan genap");
        }
        else
        {
            System.out.println(num + " adalah bilangan ganjil");
        }

        scanner.close();
    }
}