package pe.edu.ulima.calculadoramagica;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener{
	Button but7, but8, but9, butMas;
	EditText eteNumeros;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        but7 = (Button)findViewById(R.id.but7);
        but8 = (Button)findViewById(R.id.but8);
        but9 = (Button)findViewById(R.id.but9);
        butMas = (Button)findViewById(R.id.butMas);
        eteNumeros = (EditText)findViewById(R.id.eteNumeros);
        
        but7.setOnClickListener(this);
        but8.setOnClickListener(this);
        but9.setOnClickListener(this);
    }
	@Override
	public void onClick(View v) {
		String numeroAnterior = eteNumeros.getText().toString();
		if (v.getId() == R.id.but7){
			eteNumeros.setText(numeroAnterior + "7");
		}else if (v.getId() == R.id.but8){
			eteNumeros.setText(numeroAnterior + "8");
		}else if (v.getId() == R.id.but9){
			eteNumeros.setText(numeroAnterior + "9");
		}
		
	}
}
