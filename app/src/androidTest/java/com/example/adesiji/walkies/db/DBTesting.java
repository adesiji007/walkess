package com.example.adesiji.walkies.db;


import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.test.AndroidTestCase;


public class DBTesting extends AndroidTestCase{

    /**

    private static String mContactName;
    private static String mContactAddress;
    private static int mContactMobile;
    private static String mContactEmail;
    private static String mContactStaffname;
    private static int mContactRollNumber;
    private static long mContactDBAssignId;


    public void testTestCreatedDB() throws Exception {
        DBHelper dbHelper = new DBHelper(mContext);
        Utilities.Log("testDropDB Pass");
    }

    public void testTestCreatedDB1() throws Exception {
        DBHelper dbHelper = new DBHelper(mContext);
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        assertTrue(db.isOpen());
        db.close();
        Utilities.Log("testCreatedDB Pass");

    }
    public void testInsertData(){
        DBHelper dbHelper = new DBHelper(mContext);
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        mContactName = "Solomon";
        mContactAddress = "20 Snadgate Sunderland";
        mContactMobile = 07576134421;
        mContactEmail = "sonnbeam@yahoo.com";
        mContactStaffname = "Mrs Marthins";
        mContactRollNumber = 1001;

        ContentValues contentValues = new ContentValues();

         ContentValues.put(AddContact.COLUMN_NAME, mContactName);
        ContentValues.put(AddContact.COLUMN_ADDRESS, mContactAddress);
        ContentValues.put(AddContact.COLUMN_MOBILE, mContactMobile);
        ContentValues.put(AddContact.COLUMN_EMAIL, mContactEmail);
        ContentValues.put(AddContact.COLUMN_STAFFNAME, mContactStaffname);
        ContentValues.put(AddContact.COLUMN_ROLL_NO, mContactRollNumber);
`

        mContactDBAssignId = db.insert(DBContact.AddContact.TABLE_NAME, null, contentValues);
        assertTrue(mContactDBAssignId != -1);
        Utilities.Log("testInsertData Pass - ID: " + mContactDBAssignId);

    }
    public void testIsDataCorrectInDB(){
        DBHelper dbHelper = new DBHelper(mContext);
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        Cursor cursor = db.query(DBContact.AddContact.TABLE_NAME, null, null, null, null, null, null);
        assertTrue(cursor.moveToFirst());

        int idColumnIndex = cursor.getColumnIndex(DBContact.AddContact._ID);
        int dbId = cursor.getInt(idColumnIndex);

        int nameColumnIndex = cursor.getColumnIndex(DBContact.AddContact.COLUMN_NAME);
        String dbName = cursor.getString(nameColumnIndex);

        int addressColumnIndex = cursor.getColumnIndex(DBContact.AddContact.COLUMN_ADDRESS);
        String dbAddress = cursor.getString(addressColumnIndex);

        int mobileColumnIndex = cursor.getColumnIndex(DBContact.AddContact.COLUMN_MOBILE);
        int dbMobile = cursor.getInt(mobileColumnIndex);

        int emailColumnIndex = cursor.getColumnIndex(DBContact.AddContact.COLUMN_EMAIL);
        String dbEmail = cursor.getString(emailColumnIndex);

        int staffnameColumnIndex = cursor.getColumnIndex(DBContact.AddContact.COLUMN_STAFFNAME);
        String dbStaffname = cursor.getString(staffnameColumnIndex);

        int rollNoColumnIndex = cursor.getColumnIndex(DBContact.AddContact.COLUMN_ROLL_NO);
        int dbRollNo = cursor.getInt(rollNoColumnIndex);

        Utilities.Log("testIsDataCorrect Pass");

    }
    **/
}
