package tdc.edu.vn.qlsv.GiaoDien;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.textfield.TextInputLayout;

import tdc.edu.vn.qlsv.R;

public class Dangky extends AppCompatActivity {
 private TextInputLayout textdk, textmk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dangky);

        textdk = findViewById(R.id.tkdk);
        textmk = findViewById(R.id.mkdk);


    }

    private boolean validateUsername() {
        String username = textdk.getEditText().getText().toString().trim();
        if(username.isEmpty()){
            textdk.setError("kkkkkkkkkkkkkkkkkkkkk sai roi");
            return false;
         }else  if(username.length() > 15 ){
            textdk.setError("kkkkkkkkkkkkkkkkkkkkk sai roi");
            return false;
        }else {
            textdk.setError(null);
            return true;
        }
    }
    private boolean validatepasswork() {
        String paswork = textmk.getEditText().getText().toString().trim();
        if(paswork.isEmpty()){
            textmk.setError("kkkkkkkkkkkkkkkkkkkkk sai roi");
            return false;
        }else  if(paswork.length() > 15 ){
            textmk.setError("kkkkkkkkkkkkkkkkkkkkk sai roi");
            return false;
        }else {
            textmk.setError(null);
            return true;
        }
    }

     public void confirmInput(View v){
        if(!validateUsername() | !validatepasswork()){
            return;
        }

        String input = "Username: " + textdk.getEditText().getText().toString();
        input += "\n";
        input+= "passwork: " + textmk.getEditText().getText().toString();
     }
}