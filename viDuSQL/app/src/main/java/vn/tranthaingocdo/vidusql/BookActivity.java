package vn.tranthaingocdo.vidusql;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BookActivity extends AppCompatActivity {
    SQLiteDatabase bookDB;Cursor csPointToRecord;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        bookDB = openOrCreateDatabase("Sach.db",MODE_PRIVATE,null);
        csPointToRecord= bookDB.rawQuery("select * from BOOKS",);
        csPointToRecord.moveToFirst();
        Button btnFirst = findViewById(R.id.btnBookFirst);
        Button btnLast = findViewById(R.id.btnBookLast);
        Button btnNext = findViewById(R.id.btnBookNext);
        Button btnPrevious = findViewById(R.id.btnBookPrevious);

        btnFirst.setOnClickListener(xuLyFirst);
       // btnLast.setOnClickListener(xuLyFirst);
       btnNext.setOnClickListener(xuLyNext);
//       btnPrevious.setOnClickListener(xuLyFirst);

        View.OnClickListener xuLyFirst = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                csPointToRecord.moveToFirst();
                int ID = csPointToRecord.getInt(0);
                String Name = csPointToRecord.getString(1);
                int numPage = csPointToRecord.getInt(2);
                float price = csPointToRecord.getFloat(3);
                String des = csPointToRecord.getString(4);
                TextView tvID = findViewById(R.id.tvBookId);
                TextView tvName = findViewById(R.id.tvBookName);
                TextView tvPage = findViewById(R.id.tvBookPage);
                TextView tvPrice = findViewById(R.id.tvBookPrice);
                TextView tvDes = findViewById(R.id.tvBookDes);
                tvID.setText( String.valueOf(ID) );
                tvName.setText(Name);
                tvPage.setText(String.valueOf(numPage) );
                tvPrice.setText( String.valueOf(price) );
                tvDes.setText( des );

            }
        };
        View.OnClickListener xuLyNext = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                csPointToRecord.moveToNext();
            }
        };
    }
}