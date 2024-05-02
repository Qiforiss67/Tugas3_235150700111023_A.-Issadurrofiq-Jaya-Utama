public class Sales extends Pegawai {
    private double penjualan;
    private double komisi;

    public Sales(String nama, String noKTP, double penjualan, double komisi) {
        super(nama, noKTP);
        setPenjualan(penjualan);
        setKomisi(komisi);
    }

    public void setPenjualan(double penjualan) {
        this.penjualan = penjualan;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }
    
    public double getPenjualan() {
        return penjualan;
    }
    
    public double getKomisi() {
        return komisi;
    }

    @Override
    public double gaji() {
        return getPenjualan() * getKomisi();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Sales:\n")
               .append("+---------------------------+\n")
               .append(String.format("| Nama      : %-14s|\n", getName()))
               .append(String.format("| No. KTP   : %-14s|\n", getNoKTP()))
               .append(String.format("| Penjualan : %-13d |\n", (int) penjualan))
               .append(String.format("| Komisi    : Rp.%,-11.2f|\n", komisi))
               .append("+------------------------------+");
        return builder.toString();
    }
}