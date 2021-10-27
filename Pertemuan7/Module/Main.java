import java.util.Scanner;
import java.util.LinkedList;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        // Object Class Main
        Main m = new Main();

        System.out.println("\n======================================================================");
        System.out.print("Masukkan Text : ");
 
        // Object Import Scanner
        Scanner myScr = new Scanner(System.in);
        String output = myScr.nextLine();
 
        System.out.println("Outputnya adalah : " + output);
 
        System.out.println("\n======================================================================");
 
        // Pemanggilan Object Bunga dengan Linked List
        LinkedList<Bunga> bungaLokal = new LinkedList<Bunga>();
 
        for (int i = 0; i < 1; i++) {
 
            // Pemanggilan Object Bunga di looping for
            Bunga myBunga = new Bunga();

            System.out.print("Nama Bunga : ");
            String nama = myScr.nextLine();
            myBunga.setNama(nama);
 
            System.out.print("Ciri-ciri kelopak  : ");
            String kelopak = myScr.nextLine();
            myBunga.setKelopak(kelopak);
 
            System.out.print("Ciri-ciri daun : ");
            String daun = myScr.nextLine();
            myBunga.setDaun(daun);
 
            System.out.print("Ciri-ciri tangkai : ");
            String tangkai = myScr.nextLine();
            myBunga.setTangkai(tangkai);
 
            bungaLokal.add(myBunga);
        }
 
        for (Bunga myBunga : bungaLokal) {
            System.out.println("\n- Bunga yang dipilih : " + myBunga.getNama());
            System.out.println("- Ciri-ciri Kelopak : " + myBunga.getKelopak());
            System.out.println("- Ciri-ciri Daun : " + myBunga.getDaun());
            System.out.println("- Ciri-ciri tangkai : " + myBunga.getTangkai());
        }         
    }    
}