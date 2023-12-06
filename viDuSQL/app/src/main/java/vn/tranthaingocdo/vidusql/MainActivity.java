package vn.tranthaingocdo.vidusql;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import java.sql.SQLData;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase bookDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//tạo csdl có 1 bảng tên Sach
         bookDB= openOrCreateDatabase("Sach.db", MODE_PRIVATE,null);
         //thực hiện lệnh tạo bảng
        String sqlXoaBangNeuDaCo="DROP TABLE IF EXISTS BOOKS";
        String sqlTaoBang="CREATE TABLE BOOKS(BookID integer PRIMARY KEY, BookName text,\n" +
                "Page integer, Price Float, Description text)";
        String sqlThemDong="INSERT INTO BOOKS VALUES(1, 'Java', 100, 9.99, 'sách về java')";

        bookDB.execSQL(sqlXoaBangNeuDaCo);
        bookDB.execSQL(sqlTaoBang);
        bookDB.execSQL((sqlThemDong));
    }
}