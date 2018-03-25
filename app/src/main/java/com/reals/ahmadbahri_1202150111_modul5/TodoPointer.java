package com.reals.ahmadbahri_1202150111_modul5;

import android.provider.BaseColumns;

public class TodoPointer {
    //buat pointer
    private TodoPointer(){}
    public static final class TodoEntry implements BaseColumns {
        public static final String TABLE_NAME = "TodoActivity";
        public static final String COLUMN_NAMA_ = "namaActivity";
        public static final String COLUMN_DESKRIPSI = "deskripsi";
        public static final String COLUMN_PRIOTIRTY = "priority";
    }

}
