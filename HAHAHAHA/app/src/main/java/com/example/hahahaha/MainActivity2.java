package com.example.hahahaha;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

public class MainActivity2 extends AppCompatActivity {

    private Button move;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);


        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);



        loginbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(username.getText().toString().equals("Yana") && password.getText().toString().equals("Yanalogi")){
                    //correct
                    Toast.makeText(MainActivity2.this,"LOGIN SUCCESSFUL", Toast.LENGTH_SHORT ).show();
                    move=findViewById(R.id.loginbtn);
                    move.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                            startActivity(intent);
                        }
                    });


                }else{
                    Toast.makeText(MainActivity2.this,"LOGIN FAILED !!!", Toast.LENGTH_SHORT ).show();
                }
            }






        });




    }
}