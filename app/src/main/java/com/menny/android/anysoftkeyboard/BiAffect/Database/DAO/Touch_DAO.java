package com.menny.android.anysoftkeyboard.BiAffect.Database.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;

import com.menny.android.anysoftkeyboard.BiAffect.Database.Models.TouchTypeData;


// DAO includes methods that offer abstract access to your app's database.
@Dao
public interface Touch_DAO {

    // When you create a DAO method and annotate it with @Insert,
    // Room generates an implementation that inserts all parameters into the database in a single transaction.

    // When an applicable constraint violation occurs, the IGNORE resolution algorithm skips the one row that contains the constraint violation
    // and continues processing subsequent rows of the SQL statement as if nothing went wrong.
    // Other rows before and after the row that contained the constraint violation are inserted or updated normally.
    // No error is returned when the IGNORE conflict resolution algorithm is used.
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insertSingleTouchDataEntry(TouchTypeData data);
}
