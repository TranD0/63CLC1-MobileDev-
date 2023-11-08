package vn.tranthaingocdo.vieccanlam;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Objects;

public class ThemTaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them_task);
        FloatingActionButton floatingActionButton = findViewById(R.id.floatingActionButton2);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextName = findViewById(R.id.editTextName);
                EditText editTextDate = findViewById(R.id.editTextDate);
                EditText editTextMessage = findViewById(R.id.editTextMessage);
                EditText editTextPrority = findViewById(R.id.editTextPrority);
                String tenCV = editTextName.getText().toString();
                String dat = editTextDate.getText().toString();
                String mess = editTextMessage.getText().toString();
                String pri = editTextPrority.getText().toString();
                TASKS tasks = new TASKS(tenCV,dat,mess,pri);
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference databaseReference = database.getReference("TASKS");
                String key = databaseReference.push().getKey();

                HashMap<String, Object> item = new HashMap<String, Object>();
                item.put(key,tasks.toFireBaseObject());
                databaseReference.updateChildren(item, new DatabaseReference.CompletionListener() {
                    @Override
                    public void onComplete(@Nullable DatabaseError error, @NonNull DatabaseReference ref) {
                            if(error==null) finish();
                    }
                });
            }
        });
    }
}