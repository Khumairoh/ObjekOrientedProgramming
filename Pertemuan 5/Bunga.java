class Bunga {
    public String bunga;
    public String mawar;
    public String matahari;
    public void jenis(){
        System.out.println("=============================================");
        System.out.println("                 Macam-Macam Bunga           ");
        System.out.println("=============================================");
    }
    //getter
    public String getBunga(){
        return bunga;
    }
    //Setter
    public void setBunga(String newBunga){
        this.bunga = newBunga;
    }
}

class Mawar extends Bunga{
    public void M1 (){
        System.out.println("Bunga mawar berwarna merah");
    }
    public void M2(){
        System.out.println("Bunga mawar berwarna putih");
    }
    //getter
    public String getMawar(){
        return mawar;
    }
    //Setter
    public void setMawar(String newMawar){
        this.mawar = newMawar;
    }
}

class Matahari extends Bunga{
    public void N1(){
        System.out.println("Bunga matahari mekar dan menghasilkan kuaci");
    }
    public void N2(){
        System.out.println("Bunga matahari layu");
    }
    //getter
    public String getMatahari(){
        return matahari;
    }
    //Setter
    public void setMatahari(String newMatahari){
        this.matahari = newMatahari;
    }
    public static void main(String[] args) {
        //objek
        Bunga myBunga = new Bunga();
        Mawar myMawar = new Mawar();
        Matahari myMatahari = new Matahari();
        
        //pemanggilan function
        myBunga.jenis();
        myBunga.setBunga("contoh bunga mawar dan matahari");
        System.out.println(myBunga.getBunga());
        System.out.println("---------------------------------------------");

        myMawar.setMawar("bunga mawar");
        System.out.println(myMawar.getMawar());
        myMawar.M1();
        myMawar.M2();
       
        myMatahari.setMatahari("bunga matahari");
        System.out.println(myMatahari.getMatahari());
        myMatahari.N1(); 
        myMatahari.N2();
    }
}