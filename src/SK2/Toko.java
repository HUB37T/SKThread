package SK2;

public class Toko {
    private int stok;
    public Toko(int stok) {
        this.stok = stok;
    }
    public synchronized void beli(String nama, int jlh){
        if(stok >= jlh) {
            stok -= jlh;
            System.out.println(nama + ": Berhasil beli " + jlh + " Laptop. Stok tersisa: " + stok);
        }
        else{
            System.out.println(nama + ": Gagal membeli " + jlh + " Laptop. Stok tidak cukup!");
        }
    }
    public synchronized void restock(String nama, int jlh){
        stok += jlh;
        System.out.println(nama + ": Restock " + jlh + " Laptop. Stok sekarang: " + stok);
    }
    public int getStok() {
        return stok;
    }
}
