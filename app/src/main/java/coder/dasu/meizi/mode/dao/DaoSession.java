package coder.dasu.meizi.mode.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import coder.dasu.meizi.mode.entity.Data;
import coder.dasu.meizi.mode.entity.DayPublish;

import coder.dasu.meizi.mode.dao.DataDao;
import coder.dasu.meizi.mode.dao.DayPublishDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig dataDaoConfig;
    private final DaoConfig dayPublishDaoConfig;

    private final DataDao dataDao;
    private final DayPublishDao dayPublishDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        dataDaoConfig = daoConfigMap.get(DataDao.class).clone();
        dataDaoConfig.initIdentityScope(type);

        dayPublishDaoConfig = daoConfigMap.get(DayPublishDao.class).clone();
        dayPublishDaoConfig.initIdentityScope(type);

        dataDao = new DataDao(dataDaoConfig, this);
        dayPublishDao = new DayPublishDao(dayPublishDaoConfig, this);

        registerDao(Data.class, dataDao);
        registerDao(DayPublish.class, dayPublishDao);
    }
    
    public void clear() {
        dataDaoConfig.clearIdentityScope();
        dayPublishDaoConfig.clearIdentityScope();
    }

    public DataDao getDataDao() {
        return dataDao;
    }

    public DayPublishDao getDayPublishDao() {
        return dayPublishDao;
    }

}
