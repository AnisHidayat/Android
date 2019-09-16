package com.dicoding.picodiploma.dicodingmission4.db;

import android.provider.BaseColumns;

public class DatabaseContract {

    static final class MovieColumns implements BaseColumns {
        static final String TABLE_NAME = "tb_favorite";

        static final String PHOTO = "photo";

        static final String TITLE = "title";

        static final String DATE = "date";

        static final String DESCRIPTION = "description";


    }
}
