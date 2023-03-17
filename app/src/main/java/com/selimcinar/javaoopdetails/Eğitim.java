package com.selimcinar.javaoopdetails;

public interface Eğitim {
    public  boolean eğitimAl();

    //Varsayılan değer atadık interfaceye implemente hata vermez bunu yazarsak
    public  default  boolean eğitimAlBody(){
        System.out.println("eğitim almıyoruz");
        return false;
    }
}
