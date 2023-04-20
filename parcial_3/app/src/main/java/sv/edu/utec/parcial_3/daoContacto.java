package sv.edu.utec.parcial_3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class daoContacto {
    SQLiteDatabase ex;
    ArrayList<Contacto> lista;
    Contacto e;
    Context et;
    String nombrebd = "Parcial_3";
    String tabla = "create table if not exist Contacto(id integer primary key autoincrement, nombre text, apellido text, telefono text, correo text)";

    public daoContacto(Context e){
        this.et = e;
        ex = e.openOrCreateDatabase(nombrebd, Context.MODE_WORLD_WRITEABLE, null);
        ex.execSQL(tabla);
    }

    public boolean insert(Contacto e){
        return true;
    }

    public boolean delete(int id){
        return true;
    }

    public boolean edit(Contacto e){
        return true;
    }

    public ArrayList<Contacto> verLista() {
        return lista;
    }

    public Contacto verUno(){
        return e;
    }
}
