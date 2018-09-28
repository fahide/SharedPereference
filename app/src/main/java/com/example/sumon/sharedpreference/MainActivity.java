package com.example.sumon.sharedpreference;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.editText);
        t1=(TextView)findViewById(R.id.textView);
    }


    public void savebtn(View view){
        SharedPreferences sp=getSharedPreferences("sumonsfile", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sp.edit();
        editor.putString("TEXT",e1.getText().toString());
        editor.apply();
        Toast.makeText(this,"Saved",Toast.LENGTH_SHORT).show();

    }


    public void displaybtn(View view){
        SharedPreferences sp=getSharedPreferences("sumonsfile", Context.MODE_PRIVATE);
        String s=sp.getString("TEXT"," ");
        t1.setText(s);
        Toast.makeText(this,"displayed",Toast.LENGTH_LONG).show();

    }
}
