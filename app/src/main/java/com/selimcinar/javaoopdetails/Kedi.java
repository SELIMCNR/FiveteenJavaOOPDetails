package com.selimcinar.javaoopdetails;

public class Kedi implements Eğitim {
      String isim;
      String gozRengi;
      String tuyRengi;




    public  Kedi(String isim,String gozRengi,String tuyRengi){
        this.isim=isim;
        this.gozRengi=gozRengi;
        this.tuyRengi=tuyRengi;
    }
    //İstersen  boş constructor da ekleyebilin.
    public  Kedi(){

    }
    //Static heryerden ulaşılabilir.
    public  static  String turIsmi = "felis";

    public  static  void konusKediStatic(){
        System.out.println("Benim türüm : "+turIsmi);
    }
    public  void  konusKedı(){
        System.out.println("Benim ismim : "+this.isim + "Benim türüm : "+turIsmi);
    }

    //Interface default değer verme

    @Override
    public boolean eğitimAl() {
        System.out.println("Kediler eğitim almaz");
        return false;
    }

    @Override
    public boolean eğitimAlBody() {
        System.out.println("Kediler eğitime yatkın değil");
        return false;
    }
}
