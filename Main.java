
public class Main {
    public static void main(String[] args) {
        Pegawai[] daftarPegawai = new Pegawai[3];
        daftarPegawai[0] = new PegawaiTetap("Ritsuka Fujimaru", "4516271672812", 3000000);
        daftarPegawai[1] = new PegawaiHarian("Ahmad Permana", "4516271829123", 50000, 35);
        daftarPegawai[2] = new Sales("Anastasia", "451637281934", 500, 5000);


        for (Pegawai pegawai : daftarPegawai) {
            System.out.println(pegawai);
            System.out.printf("| Pendapatan  : Rp%,.2f |\n", pegawai.gaji());
            System.out.println("+------------------------------+");
            System.out.println();
        }
    }
}