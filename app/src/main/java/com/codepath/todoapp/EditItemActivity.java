package com.codepath.todoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    EditText editItem;
    Button saveBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        editItem = (EditText)findViewById(R.id.editItem);
        saveBtn = (Button)findViewById(R.id.saveBtn);
        final int position = getIntent().getIntExtra("position", 200);

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent data = new Intent();
                data.putExtra("todoItemSaved", editItem.getText().toString());
                data.putExtra("positionSaved",position);

                setResult(RESULT_OK, data);
                finish();
            }
        });


    }
}
