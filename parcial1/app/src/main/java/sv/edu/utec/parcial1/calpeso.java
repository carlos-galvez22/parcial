package sv.edu.utec.parcial1;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calpeso extends AppCompatActivity {

    EditText editAltura, editPeso;
    TextView viewImc;
    Button btnImc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculopeso);

        this.editAltura = findViewById(R.id.edicionaltura);
        this.editPeso = findViewById(R.id.texto6);
        this.viewImc = findViewById(R.id.viewImc);
        this.btnImc = findViewById(R.id.boton6);
    }

    public void calcularIMC(View v){

        String s ="";
        double altura1 =  Double.parseDouble(editAltura.getText().toString());
        double peso1 = Double.parseDouble(editPeso.getText().toString());

        double imc = (peso1) /( (altura1/100) * (altura1 / 100));

        if(imc < 10.5){
            s ="Críticamente Bajo de Peso";
        }else if(imc < 15.9){
            s ="Severamente Bajo de Peso";
        }else if(imc < 18.5){
            s ="Bajo de Peso";
        }else if(imc < 25){
            s = "Normal (peso saludable)";
        }else if(imc < 30){
            s ="Sobrepeso";
        }else if(imc < 35){
            s ="Obesidad Clase 1 - Moderadamente Obeso";
        }else if(imc < 35){
            s ="Obesidad Clase 2 - Severamente Obeso";
        }else{
            s ="Obesidad Clase 3 - Críticamente Obeso";
        }

        this.viewImc.setText(s);
    }
}

