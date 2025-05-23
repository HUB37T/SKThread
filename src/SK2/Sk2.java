package SK2;
import java.util.*;
public class Sk2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah stok: ");
        int stok = in.nextInt();
        Toko toko = new Toko(stok);
        Thread thread0 = new Thread(()->{
            toko.beli("Thread-0",(int) (Math.random() * 6) +1);
        });
        Thread thread1 = new Thread(()->{
            toko.beli("Thread-1",(int) (Math.random() * 6) +1);
        });
        Thread thread2 = new Thread(()->{
            toko.restock("Thread-2",(int) (Math.random() * 6) +1);
        });
        Thread thread3 = new Thread(()->{
            toko.restock("Thread-3",(int) (Math.random() * 6) +1);
        });
        Thread thread4 = new Thread(()->{
            toko.getStok();
        });

        thread0.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}
