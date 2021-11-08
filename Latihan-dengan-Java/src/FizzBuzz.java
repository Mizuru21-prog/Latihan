/**
 * Program FizzBuzz latihan dasar pemrograman
 * @author Anas Naufal Al-kiram
 * @version 05//11/21
 */
public class FizzBuzz
{   
    public static void main(String[] args) 
    {
        int N = 100; // inisialisasi nilai N
        int i; // inisialisasi nilai i

        for(i = 1; i <= N; i++) // Perulangan for i dimulai dari 1 dan berhenti ketika kurang atau sama dengan nilai N
        {                       // nilai i akan bertambah setiap di ulang
            if(i % 3 == 0) // i jika habis di bagi tiga akan menampilkan Fizz
            {
                System.out.println("Fizz");
                continue; // continue di pakai agar ketika i habis dibagi 3 nilai i dilompati
            }
            else if(i % 5 == 0)
            {
                System.out.println("Buzz");
                continue; // continue di pakai agar ketika i habis dibagi 5 nilai i dilompati
            }
            System.out.println(i); // nilai i di print dari 1 sampai N
        }
    }
}