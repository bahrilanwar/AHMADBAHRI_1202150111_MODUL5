package com.reals.ahmadbahri_1202150111_modul5;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.reals.ahmadbahri_1202150111_modul5.TodoPointer.*;

public class Databasesql extends SQLiteOpenHelper {
    public Databasesql(Context context) {
        super(context, "todolist.db", null, 1);
    }

    // buat query database
    @Override
    public void onCreate(SQLiteDatabase query) {
        final String SQL_CREATE_TABLE = "CREATE TABLE "
                +TodoEntry.TABLE_NAME+" ("
                +TodoEntry._ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "
                +TodoEntry.COLUMN_NAMA_+" TEXT NOT NULL, "
                +TodoEntry.COLUMN_DESKRIPSI+" TEXT NOT NULL, "
                +TodoEntry.COLUMN_PRIOTIRTY+" INTEGER NOT NULL);";
        query.execSQL(SQL_CREATE_TABLE);
    }

    //update query
    @Override
    public void onUpgrade(SQLiteDatabase query, int i, int i1) {
        query.execSQL("DROP TABLE IF EXISTS "+TodoEntry.TABLE_NAME);
        onCreate(query);
    }
}
