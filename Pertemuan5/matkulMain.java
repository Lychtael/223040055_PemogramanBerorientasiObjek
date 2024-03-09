package Pertemuan5;

public class matkulMain {
    public static void main(String[] args) {
        matkul mk1 = new matkul("001", "Algoritma Pemograman 1", "A", 3);
        matkul mk2 = new matkul("002", "Algoritma Pemograman 2", "BC", 3);
        matkul mk3 = new matkul("003", "Pemograman Berorientasi Objek", "B", 3);

        System.out.println("---Daftar matkul---");
        System.out.println(mk1.display());
        System.out.println(mk2.display());
        System.out.println(mk3.display());


        System.out.println("---Nilai Ipk---");
        //rumus : (index nilai*sks)+ (index nilai*sks) +  (index nilai*sks) ...  (index nilai*sks)/total_sks
        int total_sks = mk1.getSks() + mk2.getSks() + mk3.getSks();
        double total_nilai = mk1.nilaiIndex() + mk2.nilaiIndex() + mk3.nilaiIndex();
        double ipk = total_nilai / total_sks;
        System.out.println("Nilai ipk");

        System.out.println("total sks " + total_sks);
        System.out.println("total nilai " + total_nilai);
        System.out.println("total ipk " + ipk);
    }
}