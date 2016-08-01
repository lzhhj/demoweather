package com.demoweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class WeatherDB {
    /**
     * 数据库名
     */
    public static final String DB_NAME = "demo_weather";
    /**
     * 数据库版本
     */
    public static final int VERSION = 1;
    private static WeatherDB weatherDB;
    private SQLiteDatabase db;

    /**
     * 将构造方法私有化
     */
    private WeatherDB(Context context) {
        WeatherOpenHelper dbHelper = new WeatherOpenHelper(context, DB_NAME, null, VERSION);
        db = dbHelper.getWritableDatabase();
    }
}
