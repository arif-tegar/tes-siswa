//Driver Class

import java.util.Scanner;

public class TesSiswa {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nama : ");
        String nama = in.nextLine();
        System.out.println("ID : ");
        int id = in.nextInt();
        System.out.println("IPK");
        double ipk = in.nextDouble();
        //membuat obyek

        Siswa ari = new Siswa(id, nama, ipk);
        //nilai diatas 75 lulus
        if (ari.getIpk() >= 75) {
            System.out.println(ari.getNama() + "lulus");
        } else {
            System.out.println(ari.getNama() + "tidak lulus");
        }
        //nilai huruf
        if (ari.getipk() < 60) {
            System.out.println( "E");
        }else if (ari.getipk() > 60 && ari.getipk() <= 70) {
            System.out.println("D");
        }else if (ari.getipk() > 71 && ari.getipk() <= 80) {
            System.out.println("C");
        }else if (ari.getipk() > 81 && ari.getipk() <= 90) {
            System.out.println("B");
        }else if (ari.getipk() > 91 && ari.getipk() <= 100) {
            System.out.println("A");
        }

        in.close();
    }

    
}
