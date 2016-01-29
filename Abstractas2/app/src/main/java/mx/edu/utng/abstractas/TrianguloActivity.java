package mx.edu.utng.abstractas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Carito on 26/01/2016.
 */
public class TrianguloActivity extends Activity {
    private Triangulo triangulo;
    private TextView edtBase;
    private TextView edtAltura;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.triangulo_layout);
        triangulo = new Triangulo();
        edtBase = (EditText)findViewById(R.id.edt_base);
        edtAltura = (EditText)findViewById(R.id.edt_altura);
    }


    public void calcular(View v){
        float base = Float.parseFloat(edtBase.getText().toString());
        triangulo.setBase(base);
        float altura = Float.parseFloat(edtAltura.getText().toString());
        triangulo.setAltura(altura);
        CharSequence resultado ="Area de triangulo  es " + triangulo.calcularArea();
        Toast.makeText(TrianguloActivity.this, resultado, Toast.LENGTH_LONG).show();
        //Toast toast = toast.makeText(this.getApplicationContext(), Toast.LENGTH_SHORT);

    }
    public void ejecutar1(View v) {
        Intent i = new Intent(TrianguloActivity.this, AreasActivity.class );
        startActivity(i);
    }


}
