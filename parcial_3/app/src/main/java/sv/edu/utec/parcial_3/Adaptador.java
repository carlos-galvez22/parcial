package sv.edu.utec.parcial_3;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {
    ArrayList<Contacto> lista;
    daoContacto dao;
    Contacto e;
    Activity a;
    public Adaptador(ArrayList<Contacto> lista,Activity a, daoContacto dao){
        this.lista = lista;
        this.a = a;
        this.dao = dao;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Contacto getItem(int i) {
        e = lista.get(i);
        return null;
    }

    @Override
    public long getItemId(int i) {
        e = lista.get(i);
        return e.getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
