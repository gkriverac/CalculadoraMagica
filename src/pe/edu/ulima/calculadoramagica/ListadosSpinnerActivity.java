package pe.edu.ulima.calculadoramagica;

import java.util.List;

import pe.edu.ulima.calculadoramagica.adapters.ListadorAlumnosAdapter;
import pe.edu.ulima.calculadoramagica.model.Alumno;
import pe.edu.ulima.calculadoramagica.model.GestorAlumnos;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Spinner;

public class ListadosSpinnerActivity extends Activity{
	Spinner spiAlumnos;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_listados_spinner);
		
		spiAlumnos = (Spinner) findViewById(R.id.spiAlumnos);
		List<Alumno> alumnos = GestorAlumnos.dameAlumnos();
		ListadorAlumnosAdapter adapter = new ListadorAlumnosAdapter(alumnos, this);
		
		
		spiAlumnos.setAdapter(adapter);
		
	}

}
