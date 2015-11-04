package com.guokrspace;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.guokrspace.StudentEntity;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table STUDENT_ENTITY.
*/
public class StudentEntityDao extends AbstractDao<StudentEntity, Void> {

    public static final String TABLENAME = "STUDENT_ENTITY";

    /**
     * Properties of entity StudentEntity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Studentid = new Property(0, String.class, "studentid", false, "STUDENTID");
        public final static Property Pid = new Property(1, String.class, "pid", false, "PID");
        public final static Property Cnnname = new Property(2, String.class, "cnnname", false, "CNNNAME");
        public final static Property Schoolname = new Property(3, String.class, "schoolname", false, "SCHOOLNAME");
        public final static Property Avatar = new Property(4, String.class, "avatar", false, "AVATAR");
        public final static Property Classname = new Property(5, String.class, "classname", false, "CLASSNAME");
    };


    public StudentEntityDao(DaoConfig config) {
        super(config);
    }
    
    public StudentEntityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'STUDENT_ENTITY' (" + //
                "'STUDENTID' TEXT," + // 0: studentid
                "'PID' TEXT," + // 1: pid
                "'CNNNAME' TEXT," + // 2: cnnname
                "'SCHOOLNAME' TEXT," + // 3: schoolname
                "'AVATAR' TEXT," + // 4: avatar
                "'CLASSNAME' TEXT);"); // 5: classname
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'STUDENT_ENTITY'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, StudentEntity entity) {
        stmt.clearBindings();
 
        String studentid = entity.getStudentid();
        if (studentid != null) {
            stmt.bindString(1, studentid);
        }
 
        String pid = entity.getPid();
        if (pid != null) {
            stmt.bindString(2, pid);
        }
 
        String cnnname = entity.getCnnname();
        if (cnnname != null) {
            stmt.bindString(3, cnnname);
        }
 
        String schoolname = entity.getSchoolname();
        if (schoolname != null) {
            stmt.bindString(4, schoolname);
        }
 
        String avatar = entity.getAvatar();
        if (avatar != null) {
            stmt.bindString(5, avatar);
        }
 
        String classname = entity.getClassname();
        if (classname != null) {
            stmt.bindString(6, classname);
        }
    }

    /** @inheritdoc */
    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    /** @inheritdoc */
    @Override
    public StudentEntity readEntity(Cursor cursor, int offset) {
        StudentEntity entity = new StudentEntity( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // studentid
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // pid
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // cnnname
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // schoolname
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // avatar
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5) // classname
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, StudentEntity entity, int offset) {
        entity.setStudentid(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setPid(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setCnnname(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setSchoolname(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setAvatar(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setClassname(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
     }
    
    /** @inheritdoc */
    @Override
    protected Void updateKeyAfterInsert(StudentEntity entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    /** @inheritdoc */
    @Override
    public Void getKey(StudentEntity entity) {
        return null;
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
