import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{

    private String[] MyBunga = {"Matahari","Mawar"};
    public List <Bunga> jenisBunga1 = new ArrayList<Bunga>();
    public List <Bunga> jenisBunga2 = new ArrayList<Bunga>();

    public static void main(String[] args) {

        System.out.println("===================================================");
        System.out.println("\t\tJenis - jenis Bunga");
        System.out.println("===================================================");

        Scanner myObj = new Scanner(System.in);
        Main B = new Main();

        System.out.println("\nPilihlah angka untuk melanjutkan");
        System.out.println("1. Menambahkan jenis bunga baru");
        System.out.println("2. Melihat jenis bunga");
        System.out.print("\nPilih angka : ");

        String input = myObj.nextLine();
        int code = Integer.parseInt(input);
        System.out.println("===================================================");

        switch (code) {
            case 1:
                B.InputListBunga();
                break;
            case 2:
                B.ShowListBunga();
                break;

            default:
                System.out.println("Pilihan tidak terdaftar");
                break;
        }

    }

    public void InputListBunga(){

        System.out.println("\n---------------------------------------------------");
        System.out.println("\t\tMenambahkan jenis bunga baru");
        System.out.println("---------------------------------------------------\n");
        System.out.println("Pilih jenis bunga : ");

        int i=1;
        for (String bunga : MyBunga){
            System.out.println(i + "." + bunga);
            i++;
        }

        System.out.print("\nMasukkan pilihan : ");
        Scanner myObj = new Scanner(System.in);

        String inputProduct = myObj.nextLine();
        int product = Integer.parseInt(inputProduct);

        switch (product) {
            case 1:
                try {
                    jenisBunga1 =  InputBungaMA();
                } catch (Exception e) {
                    System.out.println("Masukkan data yang valid!");
                    System.out.println("Error: "+e.getMessage());
                }
                break;

            case 2:
                try {
                    jenisBunga2 =  InputBungaMW();
                } catch (Exception e) {
                    System.out.println("Masukkan data yang valid!");
                    System.out.println("Error: "+e.getMessage());
                }
                break;

            default:
                break;

        }

        myObj.close();

    }

    public List InputBungaMA() {

        Scanner myObj = new Scanner(System.in);
        System.out.println("\n============= Jenis bunga baru =============");

        int jmlData1 = 2;
        for (int i = 0; i < jmlData1; i++) {
            Bunga b1 = new Bunga();
            System.out.println("Jenis ke-" + (i+1) + " :");

            System.out.print("Jenis Bunga : ");
            String jenis = myObj.nextLine();
            b1.setJenis(jenis);

            System.out.print("Ciri-Ciri Bunga : ");
            String CiriCiri = myObj.nextLine();
            b1.setCiriCiri(CiriCiri);

            System.out.print("Harga Bunga : ");
            int harga = myObj.nextInt();
            b1.setHarga(harga);

            System.out.println('\n');
            this.jenisBunga1.add(b1);
        }

        System.out.println("\n");
        myObj.close();
        return this.jenisBunga1;

    }

    public List InputBungaMW() {

        Scanner myObj = new Scanner(System.in);
        System.out.println("\n============= Jenis bunga baru =============");

        int jmlData2 = 2;
        for (int i = 0; i < jmlData2; i++) {
            Bunga b2 = new Bunga();
            System.out.println("Jenis ke-" + (i+1) + ":");

            System.out.print("Jenis Bunga : ");
            String jenis = myObj.nextLine();
            b2.setJenis(jenis);

            System.out.print("Ciri-Ciri Bunga : ");
            String CiriCiri = myObj.nextLine();
            b2.setCiriCiri(CiriCiri);

            System.out.print("Harga Bunga : ");
            int harga = myObj.nextInt();
            b2.setHarga(harga);

            System.out.println('\n');
            this.jenisBunga2.add(b2);
        }

        System.out.println("\n");
        myObj.close();
        return this.jenisBunga2;

    }

    public void ShowListBunga(){

        for (String x : MyBunga) {
            System.out.println("bunga yang sudah ada yaitu : "+ x);
        }

    }

}