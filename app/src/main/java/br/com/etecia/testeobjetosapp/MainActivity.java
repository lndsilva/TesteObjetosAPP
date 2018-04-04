package br.com.etecia.testeobjetosapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnEntrar;
    private TextView txtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEntrar = (Button)findViewById(R.id.btnEntrar);
        txtNome = (TextView) findViewById(R.id.txtNome);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String textoDigitado = "";
                textoDigitado = txtNome.getText().toString();
                Intent intent = new Intent(MainActivity.this,SegundoActivity.class);

                Bundle bundle = new Bundle();

                bundle.putString("textoDigitado",textoDigitado);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });


    }


}
