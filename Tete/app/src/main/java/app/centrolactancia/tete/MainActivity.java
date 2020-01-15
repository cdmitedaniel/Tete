package app.centrolactancia.tete;

import androidx.appcompat.app.AppCompatActivity;

import  java.sql.Connection;
import  java.sql.DriverManager;
import  java.sql.PreparedStatement;
import  java.sql.ResultSet;


import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tete.R;

public class MainActivity extends AppCompatActivity {

    EditText edtNombre, edtPass;
    Button btnLogin, btnReg , btnMap;

    Button btnS1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNombre= (EditText) findViewById(R.id.usuario);
        edtPass= (EditText) findViewById(R.id.contraseña);
        btnLogin = (Button) findViewById(R.id.btnInicioSesion);
        btnReg = (Button) findViewById(R.id.btnRegistro);
        btnMap = (Button) findViewById(R.id.btnMap);

        btnS1 = (Button) findViewById(R.id.btnSig1);
        btnS1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Main2Activity.class);
                startActivityForResult(intent, 0);
            }
        });



     btnLogin.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            //Toast.makeText(getApplicationContext(),"BIENVENIDO", Toast.LENGTH_SHORT).show();
            ingresoUser();
        }
    });
        btnReg.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
           // Toast.makeText(getApplicationContext(),"BIENVENIDO", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(v.getContext(), Main2Activity.class);
            startActivityForResult(intent,0);
        }
    });

        btnMap.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Toast.makeText(getApplicationContext(),"BIENVENIDO", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(v.getContext(), MapsActivity.class);
                startActivityForResult(intent,0);
            }
        });
}


    public Connection conexionBD(){
        Connection conexion=null;
        try {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
            Class.forName("net.sourceforge.jtds.jdbc.Driver").newInstance();
            conexion = DriverManager.getConnection("jdbc:jtds:sqlserver://52.232.165.138;databaseName=Tete;user=Tete;password=tete;");

        }catch(Exception e){
            Toast.makeText(getApplicationContext(),e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        return conexion;
    }
    public void ingresoUser() {
        int n;
        try {

            PreparedStatement pst = conexionBD().prepareStatement("SELECT Id_User FROM Tbl_Users WHERE Nom_User ='"+edtNombre.getText().toString() +"' and Pass='"+edtPass.getText().toString() +"'");
            ResultSet a =pst.executeQuery();
            if(a.next()) {
               // n=a.getInt(1);
               // guardarpreferencias(n);
                Toast.makeText(getApplicationContext(),"BIENVENIDO", Toast.LENGTH_SHORT).show();
                Intent ListSong = new Intent(getApplicationContext(), Main3Activity.class);
                startActivity(ListSong);
            }else{
                Toast.makeText(getApplicationContext(), "USUARIO O CONTRASEÑA ERRONEA", Toast.LENGTH_SHORT).show();
            }
        }catch(Exception e){
            Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_SHORT).show();
        }
    }

    /*public void guardarpreferencias(int x){

        String Nombr="";
        String Use="";
        String Ape="";
        String Mail="";
        String Edad="";

        SharedPreferences myPreferences
                = getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE);
        SharedPreferences.Editor myEditor = myPreferences.edit();
        try {

            PreparedStatement pst = conexionBD().prepareStatement("SELECT Nombre FROM Ingreso WHERE UserId ="+x+"");
            ResultSet a =pst.executeQuery();
            if(a.next()) {
                Nombr=a.getString(1);
                myEditor.putString("Nombre", Nombr);
            }
            PreparedStatement pst1 = conexionBD().prepareStatement("SELECT Usuario FROM Ingreso WHERE UserId ="+x+"");
            ResultSet a1 =pst1.executeQuery();
            if(a1.next()) {
                Use=a1.getString(1);
                myEditor.putString("Usuario",Use);
            }
            PreparedStatement pst2 = conexionBD().prepareStatement("SELECT Apellido FROM Ingreso WHERE UserId ="+x+"");
            ResultSet a2 =pst2.executeQuery();
            if(a2.next()) {
                Ape=a2.getString(1);
                myEditor.putString("Apellido",Ape);
            }
            PreparedStatement pst3 = conexionBD().prepareStatement("SELECT Correo FROM Ingreso WHERE UserId ="+x+"");
            ResultSet a3 =pst3.executeQuery();
            if(a3.next()) {
                Mail=a3.getString(1);
                myEditor.putString("Mail",Mail);
            }
            PreparedStatement pst4 = conexionBD().prepareStatement("SELECT Edad FROM Ingreso WHERE UserId ="+x+"");
            ResultSet a4 =pst4.executeQuery();
            if(a4.next()) {
                int ed=a4.getInt(1);
                Edad=Integer.toString(ed);
                myEditor.putString("Edad",Edad);
            }
            myEditor.commit();
        }catch(Exception e){
            Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_SHORT).show();
        }
    }

    public String CarNomb(){
        SharedPreferences myPreferences
                = getSharedPreferences("MisPreferencias",Context.MODE_PRIVATE);
        String Nomb=myPreferences.getString("Nombre","unknown");

        return Nomb;
    }
    public String CarUser(){
        SharedPreferences myPreferences
                = getSharedPreferences("MisPreferencias",Context.MODE_PRIVATE);
        String UserI=myPreferences.getString("Usuario","unknown");

        return UserI;
    }
    public String CarApe(){
        SharedPreferences myPreferences
                = getSharedPreferences("MisPreferencias",Context.MODE_PRIVATE);
        String Ape=myPreferences.getString("Apellido","unknown");

        return Ape;
    }
    public String CarEdad(){
        SharedPreferences myPreferences
                = getSharedPreferences("MisPreferencias",Context.MODE_PRIVATE);
        String Edad=myPreferences.getString("Edad","unknown");

        return Edad;
    }
    public String CarMail(){
        SharedPreferences myPreferences
                = getSharedPreferences("MisPreferencias",Context.MODE_PRIVATE);
        String Mail=myPreferences.getString("Mail","unknown");

        return Mail;
    }*/

}


