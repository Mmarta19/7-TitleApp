package edu.upc.eseiaat.pma.titleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TitleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);
    }

    public void editTitle(View view){

        // crear un 'intent'
        //objecte de la classe intent

        Intent intent = new Intent(this, EditTitleActivity.class ); // this és un punter a l'activitat actual, Vull obrir una activitat de aquesta classe ( editTitleActivity)
        // 2. Passa l'intetn a Android perquè obri l'activitat
        startActivity(intent); //


    }
}
