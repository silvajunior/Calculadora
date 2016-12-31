package devembro.com.calculadora;

import android.support.v7.app.*;
import android.os.Bundle;

import android.support.v7.app.AlertDialog;
import android.widget.*;
import android.view.*;

public class MainActivity extends AppCompatActivity {
    EditText edtN1,edtN2;
    Button btnsomar,btnsub,btndiv,btnmult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtN1 = (EditText) findViewById(R.id.edtN1);
        edtN2 = (EditText) findViewById(R.id.edtN2);
        btnsomar = (Button) findViewById(R.id.btnSomar);
        btnsub = (Button) findViewById(R.id.btnSubtrair);
        btndiv = (Button) findViewById(R.id.btnDividir);
        btnmult = (Button) findViewById(R.id.btnMultiplicar);

        btnsomar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                double n1 = Double.parseDouble(edtN1.getText().toString());
                double n2 = Double.parseDouble(edtN2.getText().toString());
                double resultado = n1 + n2;

                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);

                dialogo.setTitle("Resultado");
                dialogo.setMessage(n1+" + "+n2+" = "+resultado);
                dialogo.setNeutralButton("Ok",null);
                dialogo.show();
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                double n1 = Double.parseDouble(edtN1.getText().toString());
                double n2 = Double.parseDouble(edtN2.getText().toString());
                double resultado = n1 - n2;

                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);

                dialogo.setTitle("Resultado");
                dialogo.setMessage(n1+" - "+n2+" = "+resultado);
                dialogo.setNeutralButton("Ok",null);
                dialogo.show();
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                double n1 = Double.parseDouble(edtN1.getText().toString());
                double n2 = Double.parseDouble(edtN2.getText().toString());
                double resultado = n1 / n2;

                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);

                dialogo.setTitle("Resultado");
                dialogo.setMessage(n1+" / "+n2+" = "+resultado);
                dialogo.setNeutralButton("Ok",null);
                dialogo.show();
            }
        });
         btnmult.setOnClickListener(new View.OnClickListener(){
             @Override
             public void onClick(View v){
                 double n1 = Double.parseDouble(edtN1.getText().toString());
                 double n2 = Double.parseDouble(edtN2.getText().toString());
                 double resultado = n1 * n2;

                 AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);

                 dialogo.setTitle("Resultado");
                 dialogo.setMessage(n1+" * "+n2+" = "+resultado);
                 dialogo.setNeutralButton("Ok",null);
                 dialogo.show();
             }
         });

    }

}
