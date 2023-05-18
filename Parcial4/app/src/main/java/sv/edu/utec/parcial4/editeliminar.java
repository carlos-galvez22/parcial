package sv.edu.utec.parcial4;
import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class editeliminar extends AppCompatActivity {

    EditText Enombre, eapellido, edireccion, ecliente, evehiculo, eciudad;
    EditText emarca, emodelo;
    EditText ematricula, ekilometraje;
    Button beditar, bbuscarid;
    Button beliminar;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edicion);


        ecliente =findViewById(R.id.ecliente);
        evehiculo =findViewById(R.id.evehiculo);
        eciudad =findViewById(R.id.eciudad);
        Enombre =findViewById(R.id.enombre);
        eapellido =findViewById(R.id.eapellido);
        edireccion =findViewById(R.id.edireccion);
        emarca =findViewById(R.id.emarca);
        emodelo = findViewById(R.id.emodelo);
        ematricula =findViewById(R.id.ematricula);
        ekilometraje =findViewById(R.id.ekilometrajes);
        beditar = findViewById(R.id.editar);
        beliminar = findViewById(R.id.eliminar);
        bbuscarid =findViewById(R.id.buscar);


        bbuscarid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                SQLiteOpenHelper admin = new SQLiteOpenHelper(getApplicationContext(),"bd",null,1);
                SQLiteDatabase bd= admin.getWritableDatabase();

                String idCl= ecliente.getText().toString();

                Cursor filas=bd.rawQuery("select sNombreCliente,sApellidosClientes,sDireccionClientes,sCiudadCliente " +
                        "from bd where ID_Cliente="+idCl,null);

                if(filas.moveToFirst()){
                    Enombre.setText(filas.getString(0));
                    eapellido.setText(filas.getString(1));
                    edireccion.setText(filas.getString(2));
                    eciudad.setText(filas.getString(3));
                }
                else{
                    Toast.makeText(getApplicationContext(),"No se encontro" +
                            " el cliente",Toast.LENGTH_LONG).show();

                }
                bd.close();

            }
        });
    }
}

