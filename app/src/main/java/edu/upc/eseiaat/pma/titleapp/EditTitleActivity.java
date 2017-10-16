package edu.upc.eseiaat.pma.titleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EditTitleActivity extends AppCompatActivity {

    //atribut
    private EditText edit_title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_title);

        //(II)
        // cridem l'intent del Titleactivity
        Intent intent = getIntent();
        // Agafem el valor que té title a l'altre activitat
        String title = intent.getStringExtra("title");
        edit_title = (EditText)findViewById(R.id.edit_title);
        // li posem al edit Text d'aquesta acitivat
        edit_title.setText(title);

    }

    // enviar el que hi ha a l'activitat anterior

    public void saveTitle(View view) {
        // (III)
        String new_title=edit_title.getText().toString();
        Intent data = new Intent();
        data.putExtra("title", new_title);

        setResult(RESULT_OK, data); // li passem les dades com a resultat ( és com un return)

        // tancar l'activitat actual i tornar a la de abans
        finish();
    }
}
