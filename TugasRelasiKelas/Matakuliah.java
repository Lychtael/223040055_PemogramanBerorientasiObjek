package TugasRelasiKelas;

public class Matakuliah {
    private String kode;
    private String nama;
    private String index;
    private int sks;

    public Matakuliah(String kode, String nama, String index, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.index = index;
        this.sks = sks;
    }

    public double nilaiIndex(){
        double indexValue = 0.0;
        if(index.equalsIgnoreCase("A")) {
            indexValue  = 4.0;
        } else if (index.equalsIgnoreCase("AB")) {
            indexValue = 3.5;
        } else if (index.equalsIgnoreCase("B")) {
            indexValue = 3;
        } else if(index.equalsIgnoreCase("BC")) {
            indexValue = 2.5;
        }  else if(index.equalsIgnoreCase("BC")) {
            indexValue = 2.5;
        }  else if(index.equalsIgnoreCase("C")) {
            indexValue = 2;
        } else if(index.equalsIgnoreCase("D")) {
            indexValue = 1;
        } else {
            indexValue = 0;
            System.out.println("E");
        }
            return indexValue;
    }

  //Setter Getter
    public int getSKS() {
        return sks;
    }

    public void setSKS(int sks) {
        this.sks = sks;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String display() {
        return kode + " - " + nama + " - " + index;
    }
}