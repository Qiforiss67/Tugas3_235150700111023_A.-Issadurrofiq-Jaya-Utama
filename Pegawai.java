public abstract class Pegawai {
    private String nama;
    private String noKTP;
    
    public Pegawai(String nama, String noKTP){
        this.nama = nama;
        this.noKTP = noKTP;
    }
 
    public String getName(){
        return nama;
    }
 
    public String getNoKTP(){
        return noKTP;
    }
 
    @Override
    public String toString() {
        return String.format("Nama: %s%nNo. KTP: %s", nama, noKTP);
    }

    public abstract double gaji(); 
}