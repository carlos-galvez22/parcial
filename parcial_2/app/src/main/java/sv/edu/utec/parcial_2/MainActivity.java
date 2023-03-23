package sv.edu.utec.parcial_2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.lw1);
        ArrayList<participante> arrayList = new ArrayList<>();
        arrayList.add(new participante(R.drawable.lead_photo_1,"Alexander Pierrot","CEO", "Insures S.O."));
        arrayList.add(new participante(R.drawable.lead_photo_2,"Carlos Lopez","Asistente", "Hospital Blue"));
        arrayList.add(new participante(R.drawable.lead_photo_3,"Sara Bonz","Directora de Marketing", "Electrical Parts ltd"));
        arrayList.add(new participante(R.drawable.lead_photo_4,"Liliana Clarence","Diseñadora de Producto","Creativa App"));
        arrayList.add(new participante(R.drawable.lead_photo_5,"Benito Peralta","Supervisor de Ventas", "Neumaticos Press"));
        arrayList.add(new participante(R.drawable.lead_photo_6,"Juan Jaramillo","CEO", "Banco Nacional"));
        arrayList.add(new participante(R.drawable.lead_photo_7,"Christian Steps","CTO", "Cooperativa Verde"));
        arrayList.add(new participante(R.drawable.lead_photo_8,"Alexa Giraldo","Lead Programmer", "Frutisofy"));
        arrayList.add(new participante(R.drawable.lead_photo_9,"Linda Murillo","Directora de Marketing", "Seguros Boliver"));
        arrayList.add(new participante(R.drawable.lead_photo_10,"Lizet Astrada","CEO", "Concesionario Motolox"));
        AdaptadorPersona adaptadorPersona = new AdaptadorPersona(this, R.layout.list_row,arrayList);
        listView.setAdapter(adaptadorPersona);
    }
}