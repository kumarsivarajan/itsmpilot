package org.tigris.scarab.om;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.apache.torque.NoRowsException;
import org.apache.torque.TooManyRowsException;
import org.apache.torque.Torque;
import org.apache.torque.TorqueException;
import org.apache.torque.map.MapBuilder;
import org.apache.torque.map.TableMap;
import org.apache.torque.om.DateKey;
import org.apache.torque.om.NumberKey;
import org.apache.torque.om.StringKey;
import org.apache.torque.om.ObjectKey;
import org.apache.torque.om.SimpleKey;
import org.apache.torque.util.BasePeer;
import org.apache.torque.util.Criteria;

import com.workingdogs.village.DataSetException;
import com.workingdogs.village.QueryDataSet;
import com.workingdogs.village.Record;

// Local classes
import org.tigris.scarab.om.map.*;



/**
 */
public abstract class BaseScarabModulePeer
    extends BasePeer
{

    /** the default database name for this class */
    public static final String DATABASE_NAME = "scarab";

     /** the table name for this class */
    public static final String TABLE_NAME = "SCARAB_MODULE";

    /**
     * @return the map builder for this peer
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static MapBuilder getMapBuilder()
        throws TorqueException
    {
        return getMapBuilder(ScarabModuleMapBuilder.CLASS_NAME);
    }

      /** the column name for the MODULE_ID field */
    public static final String MODULE_ID;
      /** the column name for the MODULE_NAME field */
    public static final String MODULE_NAME;
      /** the column name for the DOMAIN field */
    public static final String DOMAIN;
      /** the column name for the MODULE_CODE field */
    public static final String MODULE_CODE;
      /** the column name for the MODULE_DESCRIPTION field */
    public static final String MODULE_DESCRIPTION;
      /** the column name for the MODULE_URL field */
    public static final String MODULE_URL;
      /** the column name for the ARCHIVE_EMAIL field */
    public static final String ARCHIVE_EMAIL;
      /** the column name for the PARENT_ID field */
    public static final String PARENT_ID;
      /** the column name for the OWNER_ID field */
    public static final String OWNER_ID;
      /** the column name for the QA_CONTACT_ID field */
    public static final String QA_CONTACT_ID;
      /** the column name for the DELETED field */
    public static final String DELETED;
      /** the column name for the LOCKED field */
    public static final String LOCKED;
      /** the column name for the CLASS_KEY field */
    public static final String CLASS_KEY;
  
    static
    {
          MODULE_ID = "SCARAB_MODULE.MODULE_ID";
          MODULE_NAME = "SCARAB_MODULE.MODULE_NAME";
          DOMAIN = "SCARAB_MODULE.DOMAIN";
          MODULE_CODE = "SCARAB_MODULE.MODULE_CODE";
          MODULE_DESCRIPTION = "SCARAB_MODULE.MODULE_DESCRIPTION";
          MODULE_URL = "SCARAB_MODULE.MODULE_URL";
          ARCHIVE_EMAIL = "SCARAB_MODULE.ARCHIVE_EMAIL";
          PARENT_ID = "SCARAB_MODULE.PARENT_ID";
          OWNER_ID = "SCARAB_MODULE.OWNER_ID";
          QA_CONTACT_ID = "SCARAB_MODULE.QA_CONTACT_ID";
          DELETED = "SCARAB_MODULE.DELETED";
          LOCKED = "SCARAB_MODULE.LOCKED";
          CLASS_KEY = "SCARAB_MODULE.CLASS_KEY";
          if (Torque.isInit())
        {
            try
            {
                getMapBuilder(ScarabModuleMapBuilder.CLASS_NAME);
            }
            catch (Exception e)
            {
                log.error("Could not initialize Peer", e);
                throw new RuntimeException(e);
            }
        }
        else
        {
            Torque.registerMapBuilder(ScarabModuleMapBuilder.CLASS_NAME);
        }
    }
 
    /** number of columns for this peer */
    public static final int numColumns =  13;

    /** A class that can be returned by this peer. */
    protected static final String CLASSNAME_DEFAULT =
        "org.tigris.scarab.om.ScarabModule";

    /** A class that can be returned by this peer. */
    protected static final Class CLASS_DEFAULT = initClass(CLASSNAME_DEFAULT);

    /**
     * Class object initialization method.
     *
     * @param className name of the class to initialize
     * @return the initialized class
     */
    private static Class initClass(String className)
    {
        Class c = null;
        try
        {
            c = Class.forName(className);
        }
        catch (Throwable t)
        {
            log.error("A FATAL ERROR has occurred which should not "
                + "have happened under any circumstance.  Please notify "
                + "the Torque developers <torque-dev@db.apache.org> "
                + "and give as many details as possible (including the error "
                + "stack trace).", t);

            // Error objects should always be propogated.
            if (t instanceof Error)
            {
                throw (Error) t.fillInStackTrace();
            }
        }
        return c;
    }

    /**
     * Get the list of objects for a ResultSet.  Please not that your
     * resultset MUST return columns in the right order.  You can use
     * getFieldNames() in BaseObject to get the correct sequence.
     *
     * @param results the ResultSet
     * @return the list of objects
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static List resultSet2Objects(java.sql.ResultSet results)
            throws TorqueException
    {
        try
        {
            QueryDataSet qds = null;
            List rows = null;
            try
            {
                qds = new QueryDataSet(results);
                rows = getSelectResults(qds);
            }
            finally
            {
                if (qds != null)
                {
                    qds.close();
                }
            }

            return populateObjects(rows);
        }
        catch (SQLException e)
        {
            throw new TorqueException(e);
        }
        catch (DataSetException e)
        {
            throw new TorqueException(e);
        }
    }


  
    
                            
          /** A key representing a particular subclass */
    public static final int CLASSKEY_1 =
        1;

    /** A class that can be returned by this peer. */
    public static final String CLASSNAME_1 =
        "org.tigris.scarab.om.ScarabModuleContainer";

    /** A class that can be returned by this peer. */
    public static final Class CLASS_1 =
        initClass(CLASSNAME_1);
            
    /**
     * Method to do inserts.
     *
     * @param criteria object used to create the INSERT statement.
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static ObjectKey doInsert(Criteria criteria)
        throws TorqueException
    {
        return BaseScarabModulePeer
            .doInsert(criteria, (Connection) null);
    }

    /**
     * Method to do inserts.  This method is to be used during a transaction,
     * otherwise use the doInsert(Criteria) method.  It will take care of
     * the connection details internally.
     *
     * @param criteria object used to create the INSERT statement.
     * @param con the connection to use
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static ObjectKey doInsert(Criteria criteria, Connection con)
        throws TorqueException
    {
        correctBooleans(criteria);

        setDbName(criteria);

        if (con == null)
        {
            return BasePeer.doInsert(criteria);
        }
        else
        {
            return BasePeer.doInsert(criteria, con);
        }
    }

    /**
     * Add all the columns needed to create a new object.
     *
     * @param criteria object containing the columns to add.
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static void addSelectColumns(Criteria criteria)
            throws TorqueException
    {
          criteria.addSelectColumn(MODULE_ID);
          criteria.addSelectColumn(MODULE_NAME);
          criteria.addSelectColumn(DOMAIN);
          criteria.addSelectColumn(MODULE_CODE);
          criteria.addSelectColumn(MODULE_DESCRIPTION);
          criteria.addSelectColumn(MODULE_URL);
          criteria.addSelectColumn(ARCHIVE_EMAIL);
          criteria.addSelectColumn(PARENT_ID);
          criteria.addSelectColumn(OWNER_ID);
          criteria.addSelectColumn(QA_CONTACT_ID);
          criteria.addSelectColumn(DELETED);
          criteria.addSelectColumn(LOCKED);
          criteria.addSelectColumn(CLASS_KEY);
      }

    /**
     * changes the boolean values in the criteria to the appropriate type,
     * whenever a booleanchar or booleanint column is involved.
     * This enables the user to create criteria using Boolean values
     * for booleanchar or booleanint columns
     * @param criteria the criteria in which the boolean values should be corrected
     */
    public static void correctBooleans(Criteria criteria)
    {
                                                                            // check for conversion from boolean to int
        if (criteria.containsKey(DELETED))
        {
            Object possibleBoolean = criteria.get(DELETED);
            if (possibleBoolean instanceof Boolean)
            {
                criteria.add(DELETED, ((Boolean) possibleBoolean).booleanValue() ? 1 : 0);
            }
         }
                  // check for conversion from boolean to int
        if (criteria.containsKey(LOCKED))
        {
            Object possibleBoolean = criteria.get(LOCKED);
            if (possibleBoolean instanceof Boolean)
            {
                criteria.add(LOCKED, ((Boolean) possibleBoolean).booleanValue() ? 1 : 0);
            }
         }
                }

    /**
     * Create a new object of type cls from a resultset row starting
     * from a specified offset.  This is done so that you can select
     * other rows than just those needed for this object.  You may
     * for example want to create two objects from the same row.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static ScarabModule row2Object(Record row,
                                             int offset,
                                             Class cls)
        throws TorqueException
    {
        try
        {
            ScarabModule obj = (ScarabModule) cls.newInstance();
            ScarabModulePeer.populateObject(row, offset, obj);
                  obj.setModified(false);
              obj.setNew(false);

            return obj;
        }
        catch (InstantiationException e)
        {
            throw new TorqueException(e);
        }
        catch (IllegalAccessException e)
        {
            throw new TorqueException(e);
        }
    }

    /**
     * Populates an object from a resultset row starting
     * from a specified offset.  This is done so that you can select
     * other rows than just those needed for this object.  You may
     * for example want to create two objects from the same row.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static void populateObject(Record row,
                                      int offset,
                                      ScarabModule obj)
        throws TorqueException
    {
        try
        {
                obj.setModuleId(row.getValue(offset + 0).asIntegerObj());
                  obj.setRealName(row.getValue(offset + 1).asString());
                  obj.setDomain(row.getValue(offset + 2).asString());
                  obj.setCode(row.getValue(offset + 3).asString());
                  obj.setDescription(row.getValue(offset + 4).asString());
                  obj.setUrl(row.getValue(offset + 5).asString());
                  obj.setArchiveEmail(row.getValue(offset + 6).asString());
                  obj.setParentId(row.getValue(offset + 7).asIntegerObj());
                  obj.setOwnerId(row.getValue(offset + 8).asIntegerObj());
                  obj.setQaContactId(row.getValue(offset + 9).asIntegerObj());
                  obj.setDeleted(row.getValue(offset + 10).asBoolean());
                  obj.setLocked(row.getValue(offset + 11).asBoolean());
                  obj.setClassKey(row.getValue(offset + 12).asInt());
              }
        catch (DataSetException e)
        {
            throw new TorqueException(e);
        }
    }

    /**
     * Method to do selects.
     *
     * @param criteria object used to create the SELECT statement.
     * @return List of selected Objects
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static List doSelect(Criteria criteria) throws TorqueException
    {
        return populateObjects(doSelectVillageRecords(criteria));
    }

    /**
     * Method to do selects within a transaction.
     *
     * @param criteria object used to create the SELECT statement.
     * @param con the connection to use
     * @return List of selected Objects
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static List doSelect(Criteria criteria, Connection con)
        throws TorqueException
    {
        return populateObjects(doSelectVillageRecords(criteria, con));
    }

    /**
     * Grabs the raw Village records to be formed into objects.
     * This method handles connections internally.  The Record objects
     * returned by this method should be considered readonly.  Do not
     * alter the data and call save(), your results may vary, but are
     * certainly likely to result in hard to track MT bugs.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static List doSelectVillageRecords(Criteria criteria)
        throws TorqueException
    {
        return BaseScarabModulePeer
            .doSelectVillageRecords(criteria, (Connection) null);
    }

    /**
     * Grabs the raw Village records to be formed into objects.
     * This method should be used for transactions
     *
     * @param criteria object used to create the SELECT statement.
     * @param con the connection to use
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static List doSelectVillageRecords(Criteria criteria, Connection con)
        throws TorqueException
    {
        if (criteria.getSelectColumns().size() == 0)
        {
            addSelectColumns(criteria);
        }
        correctBooleans(criteria);

        setDbName(criteria);

        // BasePeer returns a List of Value (Village) arrays.  The array
        // order follows the order columns were placed in the Select clause.
        if (con == null)
        {
            return BasePeer.doSelect(criteria);
        }
        else
        {
            return BasePeer.doSelect(criteria, con);
        }
    }

    /**
     * The returned List will contain objects of the default type or
     * objects that inherit from the default.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static List populateObjects(List records)
        throws TorqueException
    {
        List results = new ArrayList(records.size());

        // populate the object(s)
        for (int i = 0; i < records.size(); i++)
        {
            Record row = (Record) records.get(i);
              results.add(ScarabModulePeer.row2Object(row, 1,
                ScarabModulePeer.getOMClass(row, 1)));
          }
        return results;
    }
 
    /**
     * The returned Class will contain objects of the default type or
     * objects that inherit from the default.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static Class getOMClass(Record record, int offset)
        throws TorqueException
    {
        Class c = null;
        try
        {
              Class omClass = null;
            int classKey =
                record.getValue(offset - 1 + 13)
                .asInt();
                          if (classKey == CLASSKEY_1)
                  {
                omClass = CLASS_1;
            }
                      else
            {
                omClass = getOMClass();
            }
            c = omClass;
          }
        catch (Exception e)
        {
            throw new TorqueException(e);
        }
        return c;
    }

    /**
     * The class that the Peer will make instances of.
     * If the BO is abstract then you must implement this method
     * in the BO.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static Class getOMClass()
        throws TorqueException
    {
        return CLASS_DEFAULT;
    }

    /**
     * Method to do updates.
     *
     * @param criteria object containing data that is used to create the UPDATE
     *        statement.
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static void doUpdate(Criteria criteria) throws TorqueException
    {
         BaseScarabModulePeer
            .doUpdate(criteria, (Connection) null);
    }

    /**
     * Method to do updates.  This method is to be used during a transaction,
     * otherwise use the doUpdate(Criteria) method.  It will take care of
     * the connection details internally.
     *
     * @param criteria object containing data that is used to create the UPDATE
     *        statement.
     * @param con the connection to use
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static void doUpdate(Criteria criteria, Connection con)
        throws TorqueException
    {
        Criteria selectCriteria = new Criteria(DATABASE_NAME, 2);
        correctBooleans(criteria);

  
             selectCriteria.put(MODULE_ID, criteria.remove(MODULE_ID));
      
      
      
      
      
      
      
      
      
      
      
      
      
        setDbName(criteria);

        if (con == null)
        {
            BasePeer.doUpdate(selectCriteria, criteria);
        }
        else
        {
            BasePeer.doUpdate(selectCriteria, criteria, con);
        }
    }

    /**
     * Method to do deletes.
     *
     * @param criteria object containing data that is used DELETE from database.
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
     public static void doDelete(Criteria criteria) throws TorqueException
     {
         ScarabModulePeer
            .doDelete(criteria, (Connection) null);
     }

    /**
     * Method to do deletes.  This method is to be used during a transaction,
     * otherwise use the doDelete(Criteria) method.  It will take care of
     * the connection details internally.
     *
     * @param criteria object containing data that is used DELETE from database.
     * @param con the connection to use
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
     public static void doDelete(Criteria criteria, Connection con)
        throws TorqueException
     {
        correctBooleans(criteria);

        setDbName(criteria);

        if (con == null)
        {
            BasePeer.doDelete(criteria);
        }
        else
        {
            BasePeer.doDelete(criteria, con);
        }
     }

    /**
     * Method to do selects
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static List doSelect(ScarabModule obj) throws TorqueException
    {
        return doSelect(buildSelectCriteria(obj));
    }

    /**
     * Method to do inserts
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static void doInsert(ScarabModule obj) throws TorqueException
    {
          obj.setPrimaryKey(doInsert(buildCriteria(obj)));
          obj.setNew(false);
        obj.setModified(false);
    }

    /**
     * @param obj the data object to update in the database.
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static void doUpdate(ScarabModule obj) throws TorqueException
    {
        doUpdate(buildCriteria(obj));
        obj.setModified(false);
    }

    /**
     * @param obj the data object to delete in the database.
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static void doDelete(ScarabModule obj) throws TorqueException
    {
        doDelete(buildSelectCriteria(obj));
    }

    /**
     * Method to do inserts.  This method is to be used during a transaction,
     * otherwise use the doInsert(ScarabModule) method.  It will take
     * care of the connection details internally.
     *
     * @param obj the data object to insert into the database.
     * @param con the connection to use
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static void doInsert(ScarabModule obj, Connection con)
        throws TorqueException
    {
          obj.setPrimaryKey(doInsert(buildCriteria(obj), con));
          obj.setNew(false);
        obj.setModified(false);
    }

    /**
     * Method to do update.  This method is to be used during a transaction,
     * otherwise use the doUpdate(ScarabModule) method.  It will take
     * care of the connection details internally.
     *
     * @param obj the data object to update in the database.
     * @param con the connection to use
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static void doUpdate(ScarabModule obj, Connection con)
        throws TorqueException
    {
        doUpdate(buildCriteria(obj), con);
        obj.setModified(false);
    }

    /**
     * Method to delete.  This method is to be used during a transaction,
     * otherwise use the doDelete(ScarabModule) method.  It will take
     * care of the connection details internally.
     *
     * @param obj the data object to delete in the database.
     * @param con the connection to use
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static void doDelete(ScarabModule obj, Connection con)
        throws TorqueException
    {
        doDelete(buildSelectCriteria(obj), con);
    }

    /**
     * Method to do deletes.
     *
     * @param pk ObjectKey that is used DELETE from database.
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static void doDelete(ObjectKey pk) throws TorqueException
    {
        BaseScarabModulePeer
           .doDelete(pk, (Connection) null);
    }

    /**
     * Method to delete.  This method is to be used during a transaction,
     * otherwise use the doDelete(ObjectKey) method.  It will take
     * care of the connection details internally.
     *
     * @param pk the primary key for the object to delete in the database.
     * @param con the connection to use
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static void doDelete(ObjectKey pk, Connection con)
        throws TorqueException
    {
        doDelete(buildCriteria(pk), con);
    }

    /** Build a Criteria object from an ObjectKey */
    public static Criteria buildCriteria( ObjectKey pk )
    {
        Criteria criteria = new Criteria();
              criteria.add(MODULE_ID, pk);
          return criteria;
     }

    /** Build a Criteria object from the data object for this peer */
    public static Criteria buildCriteria( ScarabModule obj )
    {
        Criteria criteria = new Criteria(DATABASE_NAME);
              if (!obj.isNew())
            criteria.add(MODULE_ID, obj.getModuleId());
              criteria.add(MODULE_NAME, obj.getRealName());
              criteria.add(DOMAIN, obj.getDomain());
              criteria.add(MODULE_CODE, obj.getCode());
              criteria.add(MODULE_DESCRIPTION, obj.getDescription());
              criteria.add(MODULE_URL, obj.getUrl());
              criteria.add(ARCHIVE_EMAIL, obj.getArchiveEmail());
              criteria.add(PARENT_ID, obj.getParentId());
              criteria.add(OWNER_ID, obj.getOwnerId());
              criteria.add(QA_CONTACT_ID, obj.getQaContactId());
              criteria.add(DELETED, obj.getDeleted());
              criteria.add(LOCKED, obj.getLocked());
              criteria.add(CLASS_KEY, obj.getClassKey());
          return criteria;
    }

    /** Build a Criteria object from the data object for this peer, skipping all binary columns */
    public static Criteria buildSelectCriteria( ScarabModule obj )
    {
        Criteria criteria = new Criteria(DATABASE_NAME);
              if (!obj.isNew())
        {
                    criteria.add(MODULE_ID, obj.getModuleId());
                }
                          criteria.add(MODULE_NAME, obj.getRealName());
                              criteria.add(DOMAIN, obj.getDomain());
                              criteria.add(MODULE_CODE, obj.getCode());
                              criteria.add(MODULE_DESCRIPTION, obj.getDescription());
                              criteria.add(MODULE_URL, obj.getUrl());
                              criteria.add(ARCHIVE_EMAIL, obj.getArchiveEmail());
                              criteria.add(PARENT_ID, obj.getParentId());
                              criteria.add(OWNER_ID, obj.getOwnerId());
                              criteria.add(QA_CONTACT_ID, obj.getQaContactId());
                              criteria.add(DELETED, obj.getDeleted());
                              criteria.add(LOCKED, obj.getLocked());
                              criteria.add(CLASS_KEY, obj.getClassKey());
                  return criteria;
    }
 
    
        /**
     * Retrieve a single object by pk
     *
     * @param pk the primary key
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     * @throws NoRowsException Primary key was not found in database.
     * @throws TooManyRowsException Primary key was not found in database.
     */
    public static ScarabModule retrieveByPK(Integer pk)
        throws TorqueException, NoRowsException, TooManyRowsException
    {
        return retrieveByPK(SimpleKey.keyFor(pk));
    }

    /**
     * Retrieve a single object by pk
     *
     * @param pk the primary key
     * @param con the connection to use
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     * @throws NoRowsException Primary key was not found in database.
     * @throws TooManyRowsException Primary key was not found in database.
     */
    public static ScarabModule retrieveByPK(Integer pk, Connection con)
        throws TorqueException, NoRowsException, TooManyRowsException
    {
        return retrieveByPK(SimpleKey.keyFor(pk), con);
    }
  
    /**
     * Retrieve a single object by pk
     *
     * @param pk the primary key
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     * @throws NoRowsException Primary key was not found in database.
     * @throws TooManyRowsException Primary key was not found in database.
     */
    public static ScarabModule retrieveByPK(ObjectKey pk)
        throws TorqueException, NoRowsException, TooManyRowsException
    {
        Connection db = null;
        ScarabModule retVal = null;
        try
        {
            db = Torque.getConnection(DATABASE_NAME);
            retVal = retrieveByPK(pk, db);
        }
        finally
        {
            Torque.closeConnection(db);
        }
        return retVal;
    }

    /**
     * Retrieve a single object by pk
     *
     * @param pk the primary key
     * @param con the connection to use
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     * @throws NoRowsException Primary key was not found in database.
     * @throws TooManyRowsException Primary key was not found in database.
     */
    public static ScarabModule retrieveByPK(ObjectKey pk, Connection con)
        throws TorqueException, NoRowsException, TooManyRowsException
    {
        Criteria criteria = buildCriteria(pk);
        List v = doSelect(criteria, con);
        if (v.size() == 0)
        {
            throw new NoRowsException("Failed to select a row.");
        }
        else if (v.size() > 1)
        {
            throw new TooManyRowsException("Failed to select only one row.");
        }
        else
        {
            return (ScarabModule)v.get(0);
        }
    }

    /**
     * Retrieve a multiple objects by pk
     *
     * @param pks List of primary keys
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static List retrieveByPKs(List pks)
        throws TorqueException
    {
        Connection db = null;
        List retVal = null;
        try
        {
           db = Torque.getConnection(DATABASE_NAME);
           retVal = retrieveByPKs(pks, db);
        }
        finally
        {
            Torque.closeConnection(db);
        }
        return retVal;
    }

    /**
     * Retrieve a multiple objects by pk
     *
     * @param pks List of primary keys
     * @param dbcon the connection to use
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static List retrieveByPKs( List pks, Connection dbcon )
        throws TorqueException
    {
        List objs = null;
        if (pks == null || pks.size() == 0)
        {
            objs = new LinkedList();
        }
        else
        {
            Criteria criteria = new Criteria();
              criteria.addIn( MODULE_ID, pks );
          objs = doSelect(criteria, dbcon);
        }
        return objs;
    }

 



              
                                                                                  
                        
                

    /**
     * selects a collection of ScarabModule objects pre-filled with their
     * ScarabUserImpl objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModulePeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinScarabUserImplRelatedByOwnerId(Criteria criteria)
        throws TorqueException
    {
        return doSelectJoinScarabUserImplRelatedByOwnerId(criteria, null);
    }

    /**
     * selects a collection of ScarabModule objects pre-filled with their
     * ScarabUserImpl objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModulePeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinScarabUserImplRelatedByOwnerId(Criteria criteria, Connection conn)
        throws TorqueException
    {
        setDbName(criteria);

        ScarabModulePeer.addSelectColumns(criteria);
        int offset = numColumns + 1;
        ScarabUserImplPeer.addSelectColumns(criteria);


                        criteria.addJoin(ScarabModulePeer.OWNER_ID,
            ScarabUserImplPeer.USER_ID);
        
        correctBooleans(criteria);

        List rows;
        if (conn == null)
        {
            rows = BasePeer.doSelect(criteria);
        }
        else
        {
            rows = BasePeer.doSelect(criteria,conn);
        }

        List results = new ArrayList();

        for (int i = 0; i < rows.size(); i++)
        {
            Record row = (Record) rows.get(i);

                            Class omClass = ScarabModulePeer.getOMClass(row, 1);
                    ScarabModule obj1 = (ScarabModule) ScarabModulePeer
                .row2Object(row, 1, omClass);
                     omClass = ScarabUserImplPeer.getOMClass();
                    ScarabUserImpl obj2 = (ScarabUserImpl)ScarabUserImplPeer
                .row2Object(row, offset, omClass);

            boolean newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                ScarabModule temp_obj1 = (ScarabModule)results.get(j);
                ScarabUserImpl temp_obj2 = (ScarabUserImpl)temp_obj1.getScarabUserRelatedByOwnerId();
                if (temp_obj2.getPrimaryKey().equals(obj2.getPrimaryKey()))
                {
                    newObject = false;
                              temp_obj2.addScarabModuleRelatedByOwnerId(obj1);
                              break;
                }
            }
                      if (newObject)
            {
                obj2.initScarabModulesRelatedByOwnerId();
                obj2.addScarabModuleRelatedByOwnerId(obj1);
            }
                      results.add(obj1);
        }
        return results;
    }
                                                                      
                        
                

    /**
     * selects a collection of ScarabModule objects pre-filled with their
     * ScarabUserImpl objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModulePeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinScarabUserImplRelatedByQaContactId(Criteria criteria)
        throws TorqueException
    {
        return doSelectJoinScarabUserImplRelatedByQaContactId(criteria, null);
    }

    /**
     * selects a collection of ScarabModule objects pre-filled with their
     * ScarabUserImpl objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModulePeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinScarabUserImplRelatedByQaContactId(Criteria criteria, Connection conn)
        throws TorqueException
    {
        setDbName(criteria);

        ScarabModulePeer.addSelectColumns(criteria);
        int offset = numColumns + 1;
        ScarabUserImplPeer.addSelectColumns(criteria);


                        criteria.addJoin(ScarabModulePeer.QA_CONTACT_ID,
            ScarabUserImplPeer.USER_ID);
        
        correctBooleans(criteria);

        List rows;
        if (conn == null)
        {
            rows = BasePeer.doSelect(criteria);
        }
        else
        {
            rows = BasePeer.doSelect(criteria,conn);
        }

        List results = new ArrayList();

        for (int i = 0; i < rows.size(); i++)
        {
            Record row = (Record) rows.get(i);

                            Class omClass = ScarabModulePeer.getOMClass(row, 1);
                    ScarabModule obj1 = (ScarabModule) ScarabModulePeer
                .row2Object(row, 1, omClass);
                     omClass = ScarabUserImplPeer.getOMClass();
                    ScarabUserImpl obj2 = (ScarabUserImpl)ScarabUserImplPeer
                .row2Object(row, offset, omClass);

            boolean newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                ScarabModule temp_obj1 = (ScarabModule)results.get(j);
                ScarabUserImpl temp_obj2 = (ScarabUserImpl)temp_obj1.getScarabUserRelatedByQaContactId();
                if (temp_obj2.getPrimaryKey().equals(obj2.getPrimaryKey()))
                {
                    newObject = false;
                              temp_obj2.addScarabModuleRelatedByQaContactId(obj1);
                              break;
                }
            }
                      if (newObject)
            {
                obj2.initScarabModulesRelatedByQaContactId();
                obj2.addScarabModuleRelatedByQaContactId(obj1);
            }
                      results.add(obj1);
        }
        return results;
    }
                    
  
                                    
          
        
                                  
                
    /**
     * selects a collection of ScarabModule objects pre-filled with
     * all related objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModulePeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAllExceptScarabModule(Criteria criteria)
        throws TorqueException
    {
        return doSelectJoinAllExceptScarabModule(criteria, null);
    }

    /**
     * selects a collection of ScarabModule objects pre-filled with
     * all related objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModulePeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAllExceptScarabModule(Criteria criteria, Connection conn)
        throws TorqueException
    {
        setDbName(criteria);

        addSelectColumns(criteria);
        int offset2 = numColumns + 1;
                                                                
                    ScarabUserImplPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ScarabModulePeer.OWNER_ID, ScarabUserImplPeer.USER_ID);
                                    int offset3 = offset2 + ScarabUserImplPeer.numColumns;
                                                                                
                    ScarabUserImplPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ScarabModulePeer.QA_CONTACT_ID, ScarabUserImplPeer.USER_ID);
                                                          
        correctBooleans(criteria);

        List rows;
        if (conn == null)
        {
            rows = BasePeer.doSelect(criteria);
        }
        else
        {
            rows = BasePeer.doSelect(criteria,conn);
        }

        List results = new ArrayList();

        for (int i = 0; i < rows.size(); i++)
        {
            Record row = (Record)rows.get(i);

                            Class omClass = ScarabModulePeer.getOMClass(row, 1);
                    ScarabModule obj1 = (ScarabModule)ScarabModulePeer
                .row2Object(row, 1, omClass);
                                                                                          
                                                                        
                            
              
                           omClass = ScarabUserImplPeer.getOMClass();
                          ScarabUserImpl obj2 = (ScarabUserImpl)ScarabUserImplPeer
                .row2Object( row, offset2, omClass);

               boolean  newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                ScarabModule temp_obj1 = (ScarabModule)results.get(j);
                ScarabUserImpl temp_obj2 = (ScarabUserImpl)temp_obj1.getScarabUserRelatedByOwnerId();
                if (temp_obj2.getPrimaryKey().equals(obj2.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj2.addScarabModuleRelatedByOwnerId(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj2.initScarabModulesRelatedByOwnerId();
                obj2.addScarabModuleRelatedByOwnerId(obj1);
            }
                                                                                                
                                                                        
                            
              
                           omClass = ScarabUserImplPeer.getOMClass();
                          ScarabUserImpl obj3 = (ScarabUserImpl)ScarabUserImplPeer
                .row2Object( row, offset3, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                ScarabModule temp_obj1 = (ScarabModule)results.get(j);
                ScarabUserImpl temp_obj3 = (ScarabUserImpl)temp_obj1.getScarabUserRelatedByQaContactId();
                if (temp_obj3.getPrimaryKey().equals(obj3.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj3.addScarabModuleRelatedByQaContactId(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj3.initScarabModulesRelatedByQaContactId();
                obj3.addScarabModuleRelatedByQaContactId(obj1);
            }
                                                                results.add(obj1);
        }
        return results;
    }
        
        
                                            
                
    /**
     * selects a collection of ScarabModule objects pre-filled with
     * all related objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModulePeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAllExceptScarabUserImplRelatedByOwnerId(Criteria criteria)
        throws TorqueException
    {
        return doSelectJoinAllExceptScarabUserImplRelatedByOwnerId(criteria, null);
    }

    /**
     * selects a collection of ScarabModule objects pre-filled with
     * all related objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModulePeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAllExceptScarabUserImplRelatedByOwnerId(Criteria criteria, Connection conn)
        throws TorqueException
    {
        setDbName(criteria);

        addSelectColumns(criteria);
        int offset2 = numColumns + 1;
                                                                
                                                  
                              
        correctBooleans(criteria);

        List rows;
        if (conn == null)
        {
            rows = BasePeer.doSelect(criteria);
        }
        else
        {
            rows = BasePeer.doSelect(criteria,conn);
        }

        List results = new ArrayList();

        for (int i = 0; i < rows.size(); i++)
        {
            Record row = (Record)rows.get(i);

                            Class omClass = ScarabModulePeer.getOMClass(row, 1);
                    ScarabModule obj1 = (ScarabModule)ScarabModulePeer
                .row2Object(row, 1, omClass);
                                                                                          
                                                                              
                                              results.add(obj1);
        }
        return results;
    }
        
        
                                            
                
    /**
     * selects a collection of ScarabModule objects pre-filled with
     * all related objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModulePeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAllExceptScarabUserImplRelatedByQaContactId(Criteria criteria)
        throws TorqueException
    {
        return doSelectJoinAllExceptScarabUserImplRelatedByQaContactId(criteria, null);
    }

    /**
     * selects a collection of ScarabModule objects pre-filled with
     * all related objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModulePeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAllExceptScarabUserImplRelatedByQaContactId(Criteria criteria, Connection conn)
        throws TorqueException
    {
        setDbName(criteria);

        addSelectColumns(criteria);
        int offset2 = numColumns + 1;
                                                                
                                                  
                              
        correctBooleans(criteria);

        List rows;
        if (conn == null)
        {
            rows = BasePeer.doSelect(criteria);
        }
        else
        {
            rows = BasePeer.doSelect(criteria,conn);
        }

        List results = new ArrayList();

        for (int i = 0; i < rows.size(); i++)
        {
            Record row = (Record)rows.get(i);

                            Class omClass = ScarabModulePeer.getOMClass(row, 1);
                    ScarabModule obj1 = (ScarabModule)ScarabModulePeer
                .row2Object(row, 1, omClass);
                                                                                          
                                                                              
                                              results.add(obj1);
        }
        return results;
    }
                    
  
      /**
     * Returns the TableMap related to this peer.  This method is not
     * needed for general use but a specific application could have a need.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static TableMap getTableMap()
        throws TorqueException
    {
        return Torque.getDatabaseMap(DATABASE_NAME).getTable(TABLE_NAME);
    }
   
    private static void setDbName(Criteria crit)
    {
        // Set the correct dbName if it has not been overridden
        // crit.getDbName will return the same object if not set to
        // another value so == check is okay and faster
        if (crit.getDbName() == Torque.getDefaultDB())
        {
            crit.setDbName(DATABASE_NAME);
        }
    }
}
