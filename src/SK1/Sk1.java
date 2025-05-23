package SK1;
import java.util.*;
public class Sk1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();

        Thread thread1 = new Thread(() ->{
            System.out.println("Hasil dari pangkat angka pertama adalah -> "+ (a*a));
            System.out.println("Hasil dari pangkat angka kedua adalah -> "+ (b*b));
        });

        Thread thread2 = new Thread(() ->{
            System.out.println("Hasil dari "+a+" tambah "+b+" -> "+(a+b));
        });

        Thread thread3 = new Thread(() ->{
            System.out.println("Hasil dari "+a+" kurang "+b+" -> "+(a-b));
        });

        Thread thread4 = new Thread(() ->{
            System.out.println("Hasil dari "+a+" kali "+b+" -> "+(a*b));
        });

        Thread thread5 = new Thread(() ->{
            if(b!= 0) {
                System.out.println("Hasil dari " + a + " bagi " + b + " -> " + ((double) a / b));
            }
            else{
                System.out.println("Tidak bisa dibagi dengan nol!");
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
