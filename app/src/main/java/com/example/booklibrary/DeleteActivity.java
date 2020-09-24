package com.example.booklibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DeleteActivity extends AppCompatActivity {
    EditText passing_id;
    Button red_delete_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
        red_delete_button = findViewById(R.id.red_delete_button);
        passing_id = findViewById(R.id.editTextNumber);
        final String passingid = passing_id.toString().trim();

        red_delete_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDatabaseHelper myDB = new MyDatabaseHelper(DeleteActivity.this);
                myDB.deleteOneRow(passingid);
            }
        });
    }
}