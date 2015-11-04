package com.guokrspace;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import com.guokrspace.ParentsEntity;
import com.guokrspace.CardEntity;
import com.guokrspace.StudentEntity;
import com.guokrspace.TimeRecordEntity;

import com.guokrspace.ParentsEntityDao;
import com.guokrspace.CardEntityDao;
import com.guokrspace.StudentEntityDao;
import com.guokrspace.TimeRecordEntityDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig parentsEntityDaoConfig;
    private final DaoConfig cardEntityDaoConfig;
    private final DaoConfig studentEntityDaoConfig;
    private final DaoConfig timeRecordEntityDaoConfig;

    private final ParentsEntityDao parentsEntityDao;
    private final CardEntityDao cardEntityDao;
    private final StudentEntityDao studentEntityDao;
    private final TimeRecordEntityDao timeRecordEntityDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        parentsEntityDaoConfig = daoConfigMap.get(ParentsEntityDao.class).clone();
        parentsEntityDaoConfig.initIdentityScope(type);

        cardEntityDaoConfig = daoConfigMap.get(CardEntityDao.class).clone();
        cardEntityDaoConfig.initIdentityScope(type);

        studentEntityDaoConfig = daoConfigMap.get(StudentEntityDao.class).clone();
        studentEntityDaoConfig.initIdentityScope(type);

        timeRecordEntityDaoConfig = daoConfigMap.get(TimeRecordEntityDao.class).clone();
        timeRecordEntityDaoConfig.initIdentityScope(type);

        parentsEntityDao = new ParentsEntityDao(parentsEntityDaoConfig, this);
        cardEntityDao = new CardEntityDao(cardEntityDaoConfig, this);
        studentEntityDao = new StudentEntityDao(studentEntityDaoConfig, this);
        timeRecordEntityDao = new TimeRecordEntityDao(timeRecordEntityDaoConfig, this);

        registerDao(ParentsEntity.class, parentsEntityDao);
        registerDao(CardEntity.class, cardEntityDao);
        registerDao(StudentEntity.class, studentEntityDao);
        registerDao(TimeRecordEntity.class, timeRecordEntityDao);
    }
    
    public void clear() {
        parentsEntityDaoConfig.getIdentityScope().clear();
        cardEntityDaoConfig.getIdentityScope().clear();
        studentEntityDaoConfig.getIdentityScope().clear();
        timeRecordEntityDaoConfig.getIdentityScope().clear();
    }

    public ParentsEntityDao getParentsEntityDao() {
        return parentsEntityDao;
    }

    public CardEntityDao getCardEntityDao() {
        return cardEntityDao;
    }

    public StudentEntityDao getStudentEntityDao() {
        return studentEntityDao;
    }

    public TimeRecordEntityDao getTimeRecordEntityDao() {
        return timeRecordEntityDao;
    }

}
