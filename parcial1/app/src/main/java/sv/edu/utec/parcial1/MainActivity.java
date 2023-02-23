package sv.edu.utec.parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;

    EditText editUser, editPass;

    TextView viewResp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.editUser = findViewById(R.id.barra2);
        this.editPass = findViewById(R.id.contra2);
        this.viewResp = findViewById(R.id.viewResp);
    }

    public void iniciarSesion(View v){

        String u = this.editUser.getText().toString();
        String p = this.editPass.getText().toString();

        if(!u.isEmpty() && !p.isEmpty()){

            if(u.equals("parcialETps1") && p.equals("p4rC14l#tp$")){
                startActivity(new Intent(MainActivity.this, calpeso.class));
            }else{
                this.viewResp.setText("contraseña y usuario no correctos");
            }
        }else {
            this.viewResp.setText("Debe llenar los campo al usuario y clave");
        }
    }
}