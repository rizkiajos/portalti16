package ajos.app.portalti16.Data;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import ajos.app.portalti16.Entity.Mahasiswa;

@Database(entities = {Mahasiswa.class}, version = 1, exportSchema = false)
public abstract class MahasiswaDatabase extends RoomDatabase {
    public abstract MahasiswaDao mahasiswaDao();
}

