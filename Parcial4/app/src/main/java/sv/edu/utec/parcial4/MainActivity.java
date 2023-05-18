package sv.edu.utec.parcial4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.parcial4_cristian_alvarez.Helper.SQLiteOpenHelper;

public class MainActivity extends AppCompatActivity
{

    EditText enombre, eapellidos, edireccion, eciudad, ecliente, evehiculo;
    EditText emarca, emodelo;
    EditText ematriculo, ekilometraje;
    Button eagregar;
    Button editeliminar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ecliente =findViewById(R.id.ecliente);
        evehiculo =findViewById(R.id.evehiculo);
        eciudad =findViewById(R.id.eciudad);
        enombre =findViewById(R.id.enombre);
        eapellidos =findViewById(R.id.eapellido);
        edireccion =findViewById(R.id.edireccion);
        emarca =findViewById(R.id.emarca);
        emodelo = findViewById(R.id.emodelo);
        ematriculo =findViewById(R.id.ematricula);
        ekilometraje =findViewById(R.id.ekilometrajes);
        eagregar = findViewById(R.id.bAgregar);
        editeliminar = findViewById(R.id.edieliminar);



        editeliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento=new Intent(getApplicationContext(), EditarEliminar.class);
                startActivity(intento);
            }
        });


        SQLiteOpenHelper admin = new SQLiteOpenHelper(getApplicationContext(), "db",null,1);
        SQLiteDatabase db= admin.getWritableDatabase();
        if(db!=null){
            Toast.makeText(this, "Base de datos creada", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "Error en crear la Base de datos", Toast.LENGTH_LONG).show();
        }



        eagregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SQLiteOpenHelper admin = new SQLiteOpenHelper(getApplicationContext(),"bd",null,1);
                SQLiteDatabase bd= admin.getWritableDatabase();

                String idCl= ecliente.getText().toString();
                String idVe= evehiculo.getText().toString();
                String nom= enombre.getText().toString();
                String ape= eapellidos.getText().toString();
                String dire= edireccion.getText().toString();
                String ciu= eciudad.getText().toString();
                String mar= emarca.getText().toString();
                String mod= emodelo.getText().toString();
                String mat= ematriculo.getText().toString();
                String kil= ekilometraje.getText().toString();

                ContentValues informacion =new ContentValues();

                informacion.put("ID_Cliente",idCl);
                informacion.put("ID_Vehiculos",idVe);
                informacion.put("sNombreCliente",nom);
                informacion.put("sApellidosClientes",ape);
                informacion.put("sDireccionClientes",dire);
                informacion.put("sCiudadCliente",ciu);
                informacion.put("sMarca",mar);
                informacion.put("sModelo",mod);
                informacion.put("sMatricula",mat);
                informacion.put("iKilometros",kil);

                try {
                    bd.insert("MD_Clientes", null, informacion);
                    bd.insert("MD_Vehiculos", null, informacion);
                    bd.insert("MD_ClienteVehiculo", null, informacion);

                    Toast.makeText(getApplicationContext(), "Se inserto ", Toast.LENGTH_LONG).show();
                    bd.close();

                } catch (Exception e){
                    Toast.makeText(getApplicationContext(), ""+e.getCause(), Toast.LENGTH_LONG).show();
                }

            }
        });



    }
}