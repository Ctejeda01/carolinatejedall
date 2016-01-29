package mx.edu.utng.abstractas;

/**
 * Created by Carito on 22/01/2016.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AreasActivity extends Activity {
    private Cuadrado cuadrado;
    private TextView edtLado1;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.areas_layout);
        cuadrado = new Cuadrado();
        edtLado1 = (EditText)findViewById(R.id.edt_lado);
    }


    public void calcular(View v){
        float lado = Float.parseFloat(edtLado1.getText().toString());
        cuadrado.setLado(lado);
        CharSequence resultado ="Area de cuadrado " + cuadrado.calcularArea();
        Toast.makeText(AreasActivity.this, resultado, Toast.LENGTH_LONG).show();
        //Toast toast = toast.makeText(this.getApplicationContext(), Toast.LENGTH_SHORT);

    }

    public void ejecutar(View v) {
        Intent i = new Intent(AreasActivity.this, TrianguloActivity.class );
        startActivity(i);
    }
}


