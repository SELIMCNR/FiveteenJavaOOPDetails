package com.selimcinar.javaoopdetails;

public class Kopek extends Hayvan implements Eğitim  {

    public Kopek(){
    super(); // Miras alınan extends edilen nesneleri tutar.
    }
    public Kopek(String isim,String gozRengi,String tuyRengi){
        super(isim, gozRengi, tuyRengi);
    }

    @Override
    public boolean eğitimAl() {
        System.out.println("Köpekler eğitim alır");
        return true;
    }

    @Override
    public boolean eğitimAlBody() {
        System.out.println("Köpekler gayet de eğitim alırlar");
        return true;
    }
}
