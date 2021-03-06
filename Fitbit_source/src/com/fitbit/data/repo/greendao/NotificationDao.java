// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            Notification, DaoSession

public class NotificationDao extends AbstractDao
{
    public static class Properties
    {

        public static final Property EntityStatus = new Property(2, java/lang/Integer, "entityStatus", false, "ENTITY_STATUS");
        public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
        public static final Property IsRead = new Property(4, java/lang/Boolean, "isRead", false, "IS_READ");
        public static final Property Message = new Property(6, java/lang/String, "message", false, "MESSAGE");
        public static final Property ProgramName = new Property(10, java/lang/String, "programName", false, "PROGRAM_NAME");
        public static final Property ServerId = new Property(1, java/lang/Long, "serverId", false, "SERVER_ID");
        public static final Property Timestamp = new Property(5, java/lang/Long, "timestamp", false, "TIMESTAMP");
        public static final Property Type = new Property(3, java/lang/String, "type", false, "TYPE");
        public static final Property UserAvatar = new Property(7, java/lang/String, "userAvatar", false, "USER_AVATAR");
        public static final Property UserDisplayName = new Property(8, java/lang/String, "userDisplayName", false, "USER_DISPLAY_NAME");
        public static final Property UserEncodedId = new Property(9, java/lang/String, "userEncodedId", false, "USER_ENCODED_ID");


        public Properties()
        {
        }
    }


    public static final String TABLENAME = "NOTIFICATION";

    public NotificationDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public NotificationDao(DaoConfig daoconfig, DaoSession daosession)
    {
        super(daoconfig, daosession);
    }

    public static void createTable(SQLiteDatabase sqlitedatabase, boolean flag)
    {
        String s;
        if (flag)
        {
            s = "IF NOT EXISTS ";
        } else
        {
            s = "";
        }
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'NOTIFICATION' (").append("'_id' INTEGER PRIMARY KEY ,").append("'SERVER_ID' INTEGER,").append("'ENTITY_STATUS' INTEGER,").append("'TYPE' TEXT,").append("'IS_READ' INTEGER,").append("'TIMESTAMP' INTEGER,").append("'MESSAGE' TEXT,").append("'USER_AVATAR' TEXT,").append("'USER_DISPLAY_NAME' TEXT,").append("'USER_ENCODED_ID' TEXT,").append("'PROGRAM_NAME' TEXT);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_NOTIFICATION_TYPE ON NOTIFICATION").append(" (TYPE);").toString());
    }

    public static void dropTable(SQLiteDatabase sqlitedatabase, boolean flag)
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("DROP TABLE ");
        String s;
        if (flag)
        {
            s = "IF EXISTS ";
        } else
        {
            s = "";
        }
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'NOTIFICATION'").toString());
    }

    protected void bindValues(SQLiteStatement sqlitestatement, Notification notification)
    {
        sqlitestatement.clearBindings();
        Object obj = notification.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = notification.getServerId();
        if (obj != null)
        {
            sqlitestatement.bindLong(2, ((Long) (obj)).longValue());
        }
        obj = notification.getEntityStatus();
        if (obj != null)
        {
            sqlitestatement.bindLong(3, ((Integer) (obj)).intValue());
        }
        obj = notification.getType();
        if (obj != null)
        {
            sqlitestatement.bindString(4, ((String) (obj)));
        }
        obj = notification.getIsRead();
        if (obj != null)
        {
            long l;
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(5, l);
        }
        obj = notification.getTimestamp();
        if (obj != null)
        {
            sqlitestatement.bindLong(6, ((Long) (obj)).longValue());
        }
        obj = notification.getMessage();
        if (obj != null)
        {
            sqlitestatement.bindString(7, ((String) (obj)));
        }
        obj = notification.getUserAvatar();
        if (obj != null)
        {
            sqlitestatement.bindString(8, ((String) (obj)));
        }
        obj = notification.getUserDisplayName();
        if (obj != null)
        {
            sqlitestatement.bindString(9, ((String) (obj)));
        }
        obj = notification.getUserEncodedId();
        if (obj != null)
        {
            sqlitestatement.bindString(10, ((String) (obj)));
        }
        notification = notification.getProgramName();
        if (notification != null)
        {
            sqlitestatement.bindString(11, notification);
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (Notification)obj);
    }

    public Long getKey(Notification notification)
    {
        if (notification != null)
        {
            return notification.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((Notification)obj);
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public Notification readEntity(Cursor cursor, int i)
    {
        Object obj = null;
        Long long1;
        Long long2;
        Integer integer;
        String s;
        Boolean boolean1;
        Long long3;
        String s1;
        String s2;
        String s3;
        String s4;
        if (cursor.isNull(i + 0))
        {
            long1 = null;
        } else
        {
            long1 = Long.valueOf(cursor.getLong(i + 0));
        }
        if (cursor.isNull(i + 1))
        {
            long2 = null;
        } else
        {
            long2 = Long.valueOf(cursor.getLong(i + 1));
        }
        if (cursor.isNull(i + 2))
        {
            integer = null;
        } else
        {
            integer = Integer.valueOf(cursor.getInt(i + 2));
        }
        if (cursor.isNull(i + 3))
        {
            s = null;
        } else
        {
            s = cursor.getString(i + 3);
        }
        if (cursor.isNull(i + 4))
        {
            boolean1 = null;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 4) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            boolean1 = Boolean.valueOf(flag);
        }
        if (cursor.isNull(i + 5))
        {
            long3 = null;
        } else
        {
            long3 = Long.valueOf(cursor.getLong(i + 5));
        }
        if (cursor.isNull(i + 6))
        {
            s1 = null;
        } else
        {
            s1 = cursor.getString(i + 6);
        }
        if (cursor.isNull(i + 7))
        {
            s2 = null;
        } else
        {
            s2 = cursor.getString(i + 7);
        }
        if (cursor.isNull(i + 8))
        {
            s3 = null;
        } else
        {
            s3 = cursor.getString(i + 8);
        }
        if (cursor.isNull(i + 9))
        {
            s4 = null;
        } else
        {
            s4 = cursor.getString(i + 9);
        }
        if (cursor.isNull(i + 10))
        {
            cursor = obj;
        } else
        {
            cursor = cursor.getString(i + 10);
        }
        return new Notification(long1, long2, integer, s, boolean1, long3, s1, s2, s3, s4, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, Notification notification, int i)
    {
        Object obj1 = null;
        Object obj;
        if (cursor.isNull(i + 0))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 0));
        }
        notification.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 1));
        }
        notification.setServerId(((Long) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 2));
        }
        notification.setEntityStatus(((Integer) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 3);
        }
        notification.setType(((String) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 4) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = Boolean.valueOf(flag);
        }
        notification.setIsRead(((Boolean) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 5));
        }
        notification.setTimestamp(((Long) (obj)));
        if (cursor.isNull(i + 6))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 6);
        }
        notification.setMessage(((String) (obj)));
        if (cursor.isNull(i + 7))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 7);
        }
        notification.setUserAvatar(((String) (obj)));
        if (cursor.isNull(i + 8))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 8);
        }
        notification.setUserDisplayName(((String) (obj)));
        if (cursor.isNull(i + 9))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 9);
        }
        notification.setUserEncodedId(((String) (obj)));
        if (cursor.isNull(i + 10))
        {
            cursor = obj1;
        } else
        {
            cursor = cursor.getString(i + 10);
        }
        notification.setProgramName(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (Notification)obj, i);
    }

    public Long readKey(Cursor cursor, int i)
    {
        if (cursor.isNull(i + 0))
        {
            return null;
        } else
        {
            return Long.valueOf(cursor.getLong(i + 0));
        }
    }

    public volatile Object readKey(Cursor cursor, int i)
    {
        return readKey(cursor, i);
    }

    protected Long updateKeyAfterInsert(Notification notification, long l)
    {
        notification.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((Notification)obj, l);
    }
}
