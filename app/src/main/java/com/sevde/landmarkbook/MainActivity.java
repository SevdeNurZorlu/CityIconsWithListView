package com.sevde.landmarkbook;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    static Bitmap selectedImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );



        listView=findViewById ( R.id.listView );
        final ArrayList<String>MyCitiesNames=new ArrayList<String> ();
        MyCitiesNames.add ( "İstanbul" );
        MyCitiesNames.add("Ankara");
        MyCitiesNames.add("İzmir");
        MyCitiesNames.add("Bursa");
        MyCitiesNames.add("Edirne");
        MyCitiesNames.add("Denizli");
        MyCitiesNames.add("Van");
        MyCitiesNames.add("Konya");
        MyCitiesNames.add("Erzurum");
        MyCitiesNames.add("Diyarbakır");
        //MyCitiesNames.add("Şanlıurfa");
        MyCitiesNames.add("Adıyaman");
        MyCitiesNames.add("Mersin");
        MyCitiesNames.add ( "Çanakkale" );


        final ArrayList<String>mycitydetail=new ArrayList<String> ( );
        mycitydetail.add("KIZ KULESİ");
        mycitydetail.add("ANITKABİR");
        mycitydetail.add("SAAT KULESİ");
        mycitydetail.add("ULU CAMİİ");
        mycitydetail.add("SELİMİYE CAMİ");
        mycitydetail.add("PAMUKKALE TRAVERTENLERİ");
        mycitydetail.add ( "AKDAMAR ADASI" );
        mycitydetail.add("MEVLANA TÜRBESİ");
        mycitydetail.add("ÇİFT MİNARELİ MEDRESE");
        mycitydetail.add("DİYARBAKIR SURLARI");
        //mycitydetail.add ( "BALIKLIGÖL" );
        mycitydetail.add ( "NEMRUT DAĞI" );
        mycitydetail.add("KIZ KALESİ");
        mycitydetail.add("ŞEHİTLER ABİDESİ");


        Bitmap istanbul= BitmapFactory.decodeResource ( getApplicationContext ().getResources(),R.drawable.istanbul);
        Bitmap ankara= BitmapFactory.decodeResource ( getApplicationContext ().getResources(),R.drawable.ankara);
        Bitmap izmir= BitmapFactory.decodeResource ( getApplicationContext ().getResources(),R.drawable.izmir);
        Bitmap bursa= BitmapFactory.decodeResource ( getApplicationContext ().getResources(),R.drawable.bursa);
        Bitmap selimiye= BitmapFactory.decodeResource ( getApplicationContext ().getResources(),R.drawable.selimiye);
        Bitmap denizli=BitmapFactory.decodeResource ( getApplicationContext ().getResources (),R.drawable.denizli );
        Bitmap van= BitmapFactory.decodeResource ( getApplicationContext ().getResources(),R.drawable.van);
        Bitmap konya= BitmapFactory.decodeResource ( getApplicationContext ().getResources(),R.drawable.konya);
        Bitmap erzurum= BitmapFactory.decodeResource ( getApplicationContext ().getResources(),R.drawable.erzurum);
        Bitmap diyar= BitmapFactory.decodeResource ( getApplicationContext ().getResources(),R.drawable.diyar);
        //Bitmap urfa= BitmapFactory.decodeResource ( getApplicationContext ().getResources(),R.drawable.urfa);
        Bitmap adiyaman= BitmapFactory.decodeResource ( getApplicationContext ().getResources(),R.drawable.adiyaman );
        Bitmap mersin= BitmapFactory.decodeResource ( getApplicationContext ().getResources(),R.drawable.mersin);
        Bitmap canakkale= BitmapFactory.decodeResource ( getApplicationContext ().getResources(),R.drawable.canakkale);
        final ArrayList<Bitmap> MyCityImages=new ArrayList<> ();
        MyCityImages.add ( istanbul );
        MyCityImages.add ( ankara);
        MyCityImages.add ( izmir );
        MyCityImages.add ( bursa );
        MyCityImages.add ( selimiye);
        MyCityImages.add(denizli);
        MyCityImages.add ( van );
        MyCityImages.add ( konya );
        MyCityImages.add ( erzurum );
        MyCityImages.add(diyar);
       // MyCityImages.add ( urfa );
        MyCityImages.add ( adiyaman );
        MyCityImages.add ( mersin );
        MyCityImages.add ( canakkale );





        ArrayAdapter arrayAdapter=new ArrayAdapter (this,android.R.layout.simple_list_item_1,MyCitiesNames );
        listView.setAdapter ( arrayAdapter );
        listView.setOnItemClickListener ( new AdapterView.OnItemClickListener () {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Intent intent=new Intent (getApplicationContext (),DetailActivity.class );

                intent.putExtra ( "name",mycitydetail.get ( position ) );

                /*intent.putExtra ( "name",MyCitiesNames.get ( position ) );

*/

                selectedImage=MyCityImages.get ( position );
                startActivity ( intent );
            }
        } );

    }
}
