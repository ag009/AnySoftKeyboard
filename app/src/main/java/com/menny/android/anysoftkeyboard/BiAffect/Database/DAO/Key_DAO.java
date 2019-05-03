package com.menny.android.anysoftkeyboard.BiAffect.Database.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;

import com.menny.android.anysoftkeyboard.BiAffect.Database.Models.KeyTypeData;


// DAO includes methods that offer abstract access to your app's database.
@Dao
public interface Key_DAO {

    // When you create a DAO method and annotate it with @Insert,
    // Room generates an implementation that inserts all parameters into the database in a single transaction.

    @Insert
    void insertSingleKeyData(KeyTypeData data);
}
