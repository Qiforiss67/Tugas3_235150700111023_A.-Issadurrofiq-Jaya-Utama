public class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private int jamKerja;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int jamKerja) {
    super(nama, noKTP);
    setUpahPerJam(upahPerJam);
    setJamKerja(jamKerja);
    }

    public void setUpahPerJam(double gajiPerJam) {
        this.upahPerJam = gajiPerJam;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }
    
    public double getUpahPerJam() {
        return upahPerJam;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public double gaji() {
        if(getJamKerja() <= 40)
            return upahPerJam * jamKerja;
        else
            return upahPerJam * 40 + (jamKerja - 40) * upahPerJam * 1.5;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Pegawai Harian:\n")
               .append("+------------------------------+\n")
               .append(String.format("| Nama         : %-14s|\n", getName()))
               .append(String.format("| No. KTP      : %-14s|\n", getNoKTP()))
               .append(String.format("| Upah Per Jam : Rp.%,-11.2f|\n", upahPerJam))
               .append(String.format("| Jam Kerja    : %-13d |\n", jamKerja))
               .append("+------------------------------+");
        return builder.toString();
    }
}