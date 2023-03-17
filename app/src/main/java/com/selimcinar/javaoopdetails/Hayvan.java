package com.selimcinar.javaoopdetails;

public class Hayvan {
    String isim;
    String gozRengi;
    String tuyRengi;

    public  Hayvan(){
    super(); //Objecte gider miras alınan birşey yoksa
    }

    public Hayvan(String isim, String gozRengi, String tuyRengi) {
        this.isim = isim;
        this.gozRengi = gozRengi;
        this.tuyRengi = tuyRengi;
    }



}
