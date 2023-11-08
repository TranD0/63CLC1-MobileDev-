package vn.tranthaingocdo.vieccanlam;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.google.firebase.Firebase;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<TASKS> lstVCL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView rcview = findViewById(R.id.lstVCL);
        ArrayList<TASKS> vclTask = new ArrayList<TASKS>();
        TaskAdater adater = new TaskAdater(vclTask, this);
        rcview.setAdapter(adater);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = database.getReference("TASKS");
        lstVCL = new ArrayList<TASKS>();
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot obj: snapshot.getChildren()){
                   TASKS tasks= obj.getValue(TASKS.class);
                   lstVCL.add(tasks);
                    Log.w("VCL app","Việc cần làm "+tasks.getName());
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}