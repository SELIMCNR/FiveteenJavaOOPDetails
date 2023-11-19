package com.selimcinar.javaoopdetails;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        

        //Parametreli constructor
        Kedi kedi = new Kedi("Kedi1","Sarı","Kahverengi");

        //Parametresiz constructor ikiside özelliklere erişir
        Kedi kedi2 = new Kedi();
        kedi2.isim="Kedi 2";
        System.out.println(kedi2.isim);

        //Static
        //static değişken veya metotlara direkt sınıf adı ile ulaşılabilir obje nesne adıyla değil
        System.out.println(Kedi.turIsmi);
        kedi.konusKedı(); //Static olmayan
        Kedi.konusKediStatic(); // Static olan

        //Kalıtım ve interface
        Kopek kopek = new Kopek();
        Kopek kopek2 = new Kopek();
        System.out.println(kopek2.tuyRengi);
        Hayvan hayvan = new Hayvan();

        System.out.println(kedi.eğitimAl());
        //Interface default değer yazdırma
        System.out.println(kopek.eğitimAlBody());
        System.out.println(kedi.eğitimAlBody());

    }

    public  void  test(){

    }
}
