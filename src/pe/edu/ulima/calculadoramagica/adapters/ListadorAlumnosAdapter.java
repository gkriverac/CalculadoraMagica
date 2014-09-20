package pe.edu.ulima.calculadoramagica.adapters;

import java.util.List;

import pe.edu.ulima.calculadoramagica.R;
import pe.edu.ulima.calculadoramagica.model.Alumno;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListadorAlumnosAdapter extends BaseAdapter{
	
	private List<Alumno> mAlumnos;
	private LayoutInflater mInflater;
	
	public ListadorAlumnosAdapter(List<Alumno> alumnos, Context context){
		mAlumnos = alumnos;
		mInflater = LayoutInflater.from(context);
		
	}
	
	@Override
	public int getCount() {
	return mAlumnos.size();
	}
	
	@Override
	public Object getItem(int position) {
		return mAlumnos.get(position);
	}
	
	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View view = mInflater.inflate(R.layout.item_listado_alumnos, null);

		Alumno alumno = mAlumnos.get(position);
		TextView tviCodigoAlumno = (TextView) view.findViewById(R.id.tviCodigoAlumno);
		TextView tviNombreAlumno = (TextView) view.findViewById(R.id.tviNombreAlumno);
		
		tviCodigoAlumno.setText();
		tviNombreAlumno.setText(resid);
		return view;
	}

}
