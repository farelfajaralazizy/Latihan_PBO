
package toko_online;


public class Toko_Online {


    public static void main(String[] args) {
        
        Barang barang = new Barang();
        Member member = new Member();
        Transaksi transaksi = new Transaksi();
        Laporan laporan = new Laporan();

        laporan.laporan(barang);
        laporan.laporan(member);
        laporan.laporan(transaksi, barang);

        transaksi.prosesTransaksi(member, transaksi, barang);

        laporan.laporan(transaksi, barang);
        laporan.laporan(barang);
        laporan.laporan(member);
        laporan.laporan(transaksi, barang);
    }
}

    
    

