package edu.upc.eseiaat.pma.titleapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TitleActivity extends AppCompatActivity {

    private String title="Aquest és el títol inicial...";
    // atribut per poder-hi accedir
    private TextView title_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);

        title_text = (TextView)findViewById(R.id.title);
        title_text.setText(title);
    }

    public void editTitle(View view){

       //  (I)

        // 1. crear un 'intent'
        //objecte de la classe intent

        Intent intent = new Intent(this, EditTitleActivity.class ); // this és un punter a l'activitat actual, Vull obrir una activitat de aquesta classe ( editTitleActivity)
        // 2. Afegir paràmetres ( dades extra) a la crida de l'activitat
        intent.putExtra("title", title);
        // 3. Passa l'intent a Android perquè obri l'activitat

       //  startActivity(intent); no l'utilitzem
        // cridem aquest mètode perquè l'activitat anterior ens torna algo
        startActivityForResult(intent,0);
    }

    // mètode perquè té un result
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // requestCode ha de ser el mateix que el de abans
        // esultCode és el RESULT_OK/CANCEL...
        // data són les dades que retorna l'altre activitat

        switch(requestCode){
            //(IV)
            case 0: // activitat quan has posat un 0 en el startActivityForResult
                if(resultCode == AppCompatActivity.RESULT_OK){
                    title = data.getStringExtra("title");
                    title_text.setText(title);
                }

        }


    }
}
