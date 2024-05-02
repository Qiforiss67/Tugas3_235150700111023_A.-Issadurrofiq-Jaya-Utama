public class PegawaiTetap extends Pegawai {
    private double upah;

    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        setUpah(upah);
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

    @Override
    public double gaji() {
        return getUpah();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Pegawai Tetap:\n")
               .append("+------------------------------+\n")
               .append(String.format("| Nama       : %-14s|\n", getName()))
               .append(String.format("| No. KTP    : %-16s|\n", getNoKTP()))
               .append(String.format("| Upah       : Rp%,-14.2f|\n", upah))
               .append("+------------------------------+");
        return builder.toString();
    }
    
}
