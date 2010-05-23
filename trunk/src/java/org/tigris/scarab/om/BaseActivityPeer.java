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
public abstract class BaseActivityPeer
    extends BasePeer
{

    /** the default database name for this class */
    public static final String DATABASE_NAME = "scarab";

     /** the table name for this class */
    public static final String TABLE_NAME = "SCARAB_ACTIVITY";

    /**
     * @return the map builder for this peer
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static MapBuilder getMapBuilder()
        throws TorqueException
    {
        return getMapBuilder(ActivityMapBuilder.CLASS_NAME);
    }

      /** the column name for the ACTIVITY_ID field */
    public static final String ACTIVITY_ID;
      /** the column name for the ISSUE_ID field */
    public static final String ISSUE_ID;
      /** the column name for the ATTRIBUTE_ID field */
    public static final String ATTRIBUTE_ID;
      /** the column name for the TRANSACTION_ID field */
    public static final String TRANSACTION_ID;
      /** the column name for the OLD_NUMERIC_VALUE field */
    public static final String OLD_NUMERIC_VALUE;
      /** the column name for the NEW_NUMERIC_VALUE field */
    public static final String NEW_NUMERIC_VALUE;
      /** the column name for the OLD_USER_ID field */
    public static final String OLD_USER_ID;
      /** the column name for the NEW_USER_ID field */
    public static final String NEW_USER_ID;
      /** the column name for the OLD_OPTION_ID field */
    public static final String OLD_OPTION_ID;
      /** the column name for the NEW_OPTION_ID field */
    public static final String NEW_OPTION_ID;
      /** the column name for the OLD_VALUE field */
    public static final String OLD_VALUE;
      /** the column name for the NEW_VALUE field */
    public static final String NEW_VALUE;
      /** the column name for the DEPEND_ID field */
    public static final String DEPEND_ID;
      /** the column name for the DESCRIPTION field */
    public static final String DESCRIPTION;
      /** the column name for the END_DATE field */
    public static final String END_DATE;
      /** the column name for the ATTACHMENT_ID field */
    public static final String ATTACHMENT_ID;
      /** the column name for the ACTIVITY_TYPE field */
    public static final String ACTIVITY_TYPE;
  
    static
    {
          ACTIVITY_ID = "SCARAB_ACTIVITY.ACTIVITY_ID";
          ISSUE_ID = "SCARAB_ACTIVITY.ISSUE_ID";
          ATTRIBUTE_ID = "SCARAB_ACTIVITY.ATTRIBUTE_ID";
          TRANSACTION_ID = "SCARAB_ACTIVITY.TRANSACTION_ID";
          OLD_NUMERIC_VALUE = "SCARAB_ACTIVITY.OLD_NUMERIC_VALUE";
          NEW_NUMERIC_VALUE = "SCARAB_ACTIVITY.NEW_NUMERIC_VALUE";
          OLD_USER_ID = "SCARAB_ACTIVITY.OLD_USER_ID";
          NEW_USER_ID = "SCARAB_ACTIVITY.NEW_USER_ID";
          OLD_OPTION_ID = "SCARAB_ACTIVITY.OLD_OPTION_ID";
          NEW_OPTION_ID = "SCARAB_ACTIVITY.NEW_OPTION_ID";
          OLD_VALUE = "SCARAB_ACTIVITY.OLD_VALUE";
          NEW_VALUE = "SCARAB_ACTIVITY.NEW_VALUE";
          DEPEND_ID = "SCARAB_ACTIVITY.DEPEND_ID";
          DESCRIPTION = "SCARAB_ACTIVITY.DESCRIPTION";
          END_DATE = "SCARAB_ACTIVITY.END_DATE";
          ATTACHMENT_ID = "SCARAB_ACTIVITY.ATTACHMENT_ID";
          ACTIVITY_TYPE = "SCARAB_ACTIVITY.ACTIVITY_TYPE";
          if (Torque.isInit())
        {
            try
            {
                getMapBuilder(ActivityMapBuilder.CLASS_NAME);
            }
            catch (Exception e)
            {
                log.error("Could not initialize Peer", e);
                throw new RuntimeException(e);
            }
        }
        else
        {
            Torque.registerMapBuilder(ActivityMapBuilder.CLASS_NAME);
        }
    }
 
    /** number of columns for this peer */
    public static final int numColumns =  17;

    /** A class that can be returned by this peer. */
    protected static final String CLASSNAME_DEFAULT =
        "org.tigris.scarab.om.Activity";

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
        return BaseActivityPeer
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
          criteria.addSelectColumn(ACTIVITY_ID);
          criteria.addSelectColumn(ISSUE_ID);
          criteria.addSelectColumn(ATTRIBUTE_ID);
          criteria.addSelectColumn(TRANSACTION_ID);
          criteria.addSelectColumn(OLD_NUMERIC_VALUE);
          criteria.addSelectColumn(NEW_NUMERIC_VALUE);
          criteria.addSelectColumn(OLD_USER_ID);
          criteria.addSelectColumn(NEW_USER_ID);
          criteria.addSelectColumn(OLD_OPTION_ID);
          criteria.addSelectColumn(NEW_OPTION_ID);
          criteria.addSelectColumn(OLD_VALUE);
          criteria.addSelectColumn(NEW_VALUE);
          criteria.addSelectColumn(DEPEND_ID);
          criteria.addSelectColumn(DESCRIPTION);
          criteria.addSelectColumn(END_DATE);
          criteria.addSelectColumn(ATTACHMENT_ID);
          criteria.addSelectColumn(ACTIVITY_TYPE);
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
    public static Activity row2Object(Record row,
                                             int offset,
                                             Class cls)
        throws TorqueException
    {
        try
        {
            Activity obj = (Activity) cls.newInstance();
            ActivityPeer.populateObject(row, offset, obj);
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
                                      Activity obj)
        throws TorqueException
    {
        try
        {
                obj.setActivityId(row.getValue(offset + 0).asLongObj());
                  obj.setIssueId(row.getValue(offset + 1).asLongObj());
                  obj.setAttributeId(row.getValue(offset + 2).asIntegerObj());
                  obj.setTransactionId(row.getValue(offset + 3).asLongObj());
                  obj.setOldNumericValue(row.getValue(offset + 4).asIntegerObj());
                  obj.setNewNumericValue(row.getValue(offset + 5).asIntegerObj());
                  obj.setOldUserId(row.getValue(offset + 6).asIntegerObj());
                  obj.setNewUserId(row.getValue(offset + 7).asIntegerObj());
                  obj.setOldOptionId(row.getValue(offset + 8).asIntegerObj());
                  obj.setNewOptionId(row.getValue(offset + 9).asIntegerObj());
                  obj.setOldValue(row.getValue(offset + 10).asString());
                  obj.setNewValue(row.getValue(offset + 11).asString());
                  obj.setDependId(row.getValue(offset + 12).asIntegerObj());
                  obj.setDescription(row.getValue(offset + 13).asString());
                  obj.setEndDate(row.getValue(offset + 14).asUtilDate());
                  obj.setAttachmentId(row.getValue(offset + 15).asLongObj());
                  obj.setActivityType(row.getValue(offset + 16).asString());
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
        return BaseActivityPeer
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
              results.add(ActivityPeer.row2Object(row, 1,
                ActivityPeer.getOMClass()));
          }
        return results;
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
         BaseActivityPeer
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

  
             selectCriteria.put(ACTIVITY_ID, criteria.remove(ACTIVITY_ID));
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
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
         ActivityPeer
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
    public static List doSelect(Activity obj) throws TorqueException
    {
        return doSelect(buildSelectCriteria(obj));
    }

    /**
     * Method to do inserts
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static void doInsert(Activity obj) throws TorqueException
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
    public static void doUpdate(Activity obj) throws TorqueException
    {
        doUpdate(buildCriteria(obj));
        obj.setModified(false);
    }

    /**
     * @param obj the data object to delete in the database.
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static void doDelete(Activity obj) throws TorqueException
    {
        doDelete(buildSelectCriteria(obj));
    }

    /**
     * Method to do inserts.  This method is to be used during a transaction,
     * otherwise use the doInsert(Activity) method.  It will take
     * care of the connection details internally.
     *
     * @param obj the data object to insert into the database.
     * @param con the connection to use
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static void doInsert(Activity obj, Connection con)
        throws TorqueException
    {
          obj.setPrimaryKey(doInsert(buildCriteria(obj), con));
          obj.setNew(false);
        obj.setModified(false);
    }

    /**
     * Method to do update.  This method is to be used during a transaction,
     * otherwise use the doUpdate(Activity) method.  It will take
     * care of the connection details internally.
     *
     * @param obj the data object to update in the database.
     * @param con the connection to use
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static void doUpdate(Activity obj, Connection con)
        throws TorqueException
    {
        doUpdate(buildCriteria(obj), con);
        obj.setModified(false);
    }

    /**
     * Method to delete.  This method is to be used during a transaction,
     * otherwise use the doDelete(Activity) method.  It will take
     * care of the connection details internally.
     *
     * @param obj the data object to delete in the database.
     * @param con the connection to use
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static void doDelete(Activity obj, Connection con)
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
        BaseActivityPeer
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
              criteria.add(ACTIVITY_ID, pk);
          return criteria;
     }

    /** Build a Criteria object from the data object for this peer */
    public static Criteria buildCriteria( Activity obj )
    {
        Criteria criteria = new Criteria(DATABASE_NAME);
              if (!obj.isNew())
            criteria.add(ACTIVITY_ID, obj.getActivityId());
              criteria.add(ISSUE_ID, obj.getIssueId());
              criteria.add(ATTRIBUTE_ID, obj.getAttributeId());
              criteria.add(TRANSACTION_ID, obj.getTransactionId());
              criteria.add(OLD_NUMERIC_VALUE, obj.getOldNumericValue());
              criteria.add(NEW_NUMERIC_VALUE, obj.getNewNumericValue());
              criteria.add(OLD_USER_ID, obj.getOldUserId());
              criteria.add(NEW_USER_ID, obj.getNewUserId());
              criteria.add(OLD_OPTION_ID, obj.getOldOptionId());
              criteria.add(NEW_OPTION_ID, obj.getNewOptionId());
              criteria.add(OLD_VALUE, obj.getOldValue());
              criteria.add(NEW_VALUE, obj.getNewValue());
              criteria.add(DEPEND_ID, obj.getDependId());
              criteria.add(DESCRIPTION, obj.getDescription());
              criteria.add(END_DATE, obj.getEndDate());
              criteria.add(ATTACHMENT_ID, obj.getAttachmentId());
              criteria.add(ACTIVITY_TYPE, obj.getActivityType());
          return criteria;
    }

    /** Build a Criteria object from the data object for this peer, skipping all binary columns */
    public static Criteria buildSelectCriteria( Activity obj )
    {
        Criteria criteria = new Criteria(DATABASE_NAME);
              if (!obj.isNew())
        {
                    criteria.add(ACTIVITY_ID, obj.getActivityId());
                }
                          criteria.add(ISSUE_ID, obj.getIssueId());
                              criteria.add(ATTRIBUTE_ID, obj.getAttributeId());
                              criteria.add(TRANSACTION_ID, obj.getTransactionId());
                              criteria.add(OLD_NUMERIC_VALUE, obj.getOldNumericValue());
                              criteria.add(NEW_NUMERIC_VALUE, obj.getNewNumericValue());
                              criteria.add(OLD_USER_ID, obj.getOldUserId());
                              criteria.add(NEW_USER_ID, obj.getNewUserId());
                              criteria.add(OLD_OPTION_ID, obj.getOldOptionId());
                              criteria.add(NEW_OPTION_ID, obj.getNewOptionId());
                              criteria.add(OLD_VALUE, obj.getOldValue());
                              criteria.add(NEW_VALUE, obj.getNewValue());
                              criteria.add(DEPEND_ID, obj.getDependId());
                              criteria.add(DESCRIPTION, obj.getDescription());
                              criteria.add(END_DATE, obj.getEndDate());
                              criteria.add(ATTACHMENT_ID, obj.getAttachmentId());
                              criteria.add(ACTIVITY_TYPE, obj.getActivityType());
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
    public static Activity retrieveByPK(Long pk)
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
    public static Activity retrieveByPK(Long pk, Connection con)
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
    public static Activity retrieveByPK(ObjectKey pk)
        throws TorqueException, NoRowsException, TooManyRowsException
    {
        Connection db = null;
        Activity retVal = null;
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
    public static Activity retrieveByPK(ObjectKey pk, Connection con)
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
            return (Activity)v.get(0);
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
              criteria.addIn( ACTIVITY_ID, pks );
          objs = doSelect(criteria, dbcon);
        }
        return objs;
    }

 



                          
                                              
                
                

    /**
     * selects a collection of Activity objects pre-filled with their
     * Issue objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ActivityPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinIssue(Criteria criteria)
        throws TorqueException
    {
        return doSelectJoinIssue(criteria, null);
    }

    /**
     * selects a collection of Activity objects pre-filled with their
     * Issue objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ActivityPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinIssue(Criteria criteria, Connection conn)
        throws TorqueException
    {
        setDbName(criteria);

        ActivityPeer.addSelectColumns(criteria);
        int offset = numColumns + 1;
        IssuePeer.addSelectColumns(criteria);


                        criteria.addJoin(ActivityPeer.ISSUE_ID,
            IssuePeer.ISSUE_ID);
        
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

                            Class omClass = ActivityPeer.getOMClass();
                    Activity obj1 = (Activity) ActivityPeer
                .row2Object(row, 1, omClass);
                     omClass = IssuePeer.getOMClass();
                    Issue obj2 = (Issue)IssuePeer
                .row2Object(row, offset, omClass);

            boolean newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                Issue temp_obj2 = (Issue)temp_obj1.getIssue();
                if (temp_obj2.getPrimaryKey().equals(obj2.getPrimaryKey()))
                {
                    newObject = false;
                              temp_obj2.addActivity(obj1);
                              break;
                }
            }
                      if (newObject)
            {
                obj2.initActivitys();
                obj2.addActivity(obj1);
            }
                      results.add(obj1);
        }
        return results;
    }
                                                            
                
                

    /**
     * selects a collection of Activity objects pre-filled with their
     * Attribute objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ActivityPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAttribute(Criteria criteria)
        throws TorqueException
    {
        return doSelectJoinAttribute(criteria, null);
    }

    /**
     * selects a collection of Activity objects pre-filled with their
     * Attribute objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ActivityPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAttribute(Criteria criteria, Connection conn)
        throws TorqueException
    {
        setDbName(criteria);

        ActivityPeer.addSelectColumns(criteria);
        int offset = numColumns + 1;
        AttributePeer.addSelectColumns(criteria);


                        criteria.addJoin(ActivityPeer.ATTRIBUTE_ID,
            AttributePeer.ATTRIBUTE_ID);
        
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

                            Class omClass = ActivityPeer.getOMClass();
                    Activity obj1 = (Activity) ActivityPeer
                .row2Object(row, 1, omClass);
                     omClass = AttributePeer.getOMClass();
                    Attribute obj2 = (Attribute)AttributePeer
                .row2Object(row, offset, omClass);

            boolean newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                Attribute temp_obj2 = (Attribute)temp_obj1.getAttribute();
                if (temp_obj2.getPrimaryKey().equals(obj2.getPrimaryKey()))
                {
                    newObject = false;
                              temp_obj2.addActivity(obj1);
                              break;
                }
            }
                      if (newObject)
            {
                obj2.initActivitys();
                obj2.addActivity(obj1);
            }
                      results.add(obj1);
        }
        return results;
    }
                                                            
                
                

    /**
     * selects a collection of Activity objects pre-filled with their
     * ActivitySet objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ActivityPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinActivitySet(Criteria criteria)
        throws TorqueException
    {
        return doSelectJoinActivitySet(criteria, null);
    }

    /**
     * selects a collection of Activity objects pre-filled with their
     * ActivitySet objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ActivityPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinActivitySet(Criteria criteria, Connection conn)
        throws TorqueException
    {
        setDbName(criteria);

        ActivityPeer.addSelectColumns(criteria);
        int offset = numColumns + 1;
        ActivitySetPeer.addSelectColumns(criteria);


                        criteria.addJoin(ActivityPeer.TRANSACTION_ID,
            ActivitySetPeer.TRANSACTION_ID);
        
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

                            Class omClass = ActivityPeer.getOMClass();
                    Activity obj1 = (Activity) ActivityPeer
                .row2Object(row, 1, omClass);
                     omClass = ActivitySetPeer.getOMClass();
                    ActivitySet obj2 = (ActivitySet)ActivitySetPeer
                .row2Object(row, offset, omClass);

            boolean newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                ActivitySet temp_obj2 = (ActivitySet)temp_obj1.getActivitySet();
                if (temp_obj2.getPrimaryKey().equals(obj2.getPrimaryKey()))
                {
                    newObject = false;
                              temp_obj2.addActivity(obj1);
                              break;
                }
            }
                      if (newObject)
            {
                obj2.initActivitys();
                obj2.addActivity(obj1);
            }
                      results.add(obj1);
        }
        return results;
    }
                                                                      
                        
                

    /**
     * selects a collection of Activity objects pre-filled with their
     * ScarabUserImpl objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ActivityPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinScarabUserImplRelatedByOldUserId(Criteria criteria)
        throws TorqueException
    {
        return doSelectJoinScarabUserImplRelatedByOldUserId(criteria, null);
    }

    /**
     * selects a collection of Activity objects pre-filled with their
     * ScarabUserImpl objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ActivityPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinScarabUserImplRelatedByOldUserId(Criteria criteria, Connection conn)
        throws TorqueException
    {
        setDbName(criteria);

        ActivityPeer.addSelectColumns(criteria);
        int offset = numColumns + 1;
        ScarabUserImplPeer.addSelectColumns(criteria);


                        criteria.addJoin(ActivityPeer.OLD_USER_ID,
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

                            Class omClass = ActivityPeer.getOMClass();
                    Activity obj1 = (Activity) ActivityPeer
                .row2Object(row, 1, omClass);
                     omClass = ScarabUserImplPeer.getOMClass();
                    ScarabUserImpl obj2 = (ScarabUserImpl)ScarabUserImplPeer
                .row2Object(row, offset, omClass);

            boolean newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                ScarabUserImpl temp_obj2 = (ScarabUserImpl)temp_obj1.getScarabUserRelatedByOldUserId();
                if (temp_obj2.getPrimaryKey().equals(obj2.getPrimaryKey()))
                {
                    newObject = false;
                              temp_obj2.addActivityRelatedByOldUserId(obj1);
                              break;
                }
            }
                      if (newObject)
            {
                obj2.initActivitysRelatedByOldUserId();
                obj2.addActivityRelatedByOldUserId(obj1);
            }
                      results.add(obj1);
        }
        return results;
    }
                                                                      
                        
                

    /**
     * selects a collection of Activity objects pre-filled with their
     * ScarabUserImpl objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ActivityPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinScarabUserImplRelatedByNewUserId(Criteria criteria)
        throws TorqueException
    {
        return doSelectJoinScarabUserImplRelatedByNewUserId(criteria, null);
    }

    /**
     * selects a collection of Activity objects pre-filled with their
     * ScarabUserImpl objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ActivityPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinScarabUserImplRelatedByNewUserId(Criteria criteria, Connection conn)
        throws TorqueException
    {
        setDbName(criteria);

        ActivityPeer.addSelectColumns(criteria);
        int offset = numColumns + 1;
        ScarabUserImplPeer.addSelectColumns(criteria);


                        criteria.addJoin(ActivityPeer.NEW_USER_ID,
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

                            Class omClass = ActivityPeer.getOMClass();
                    Activity obj1 = (Activity) ActivityPeer
                .row2Object(row, 1, omClass);
                     omClass = ScarabUserImplPeer.getOMClass();
                    ScarabUserImpl obj2 = (ScarabUserImpl)ScarabUserImplPeer
                .row2Object(row, offset, omClass);

            boolean newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                ScarabUserImpl temp_obj2 = (ScarabUserImpl)temp_obj1.getScarabUserRelatedByNewUserId();
                if (temp_obj2.getPrimaryKey().equals(obj2.getPrimaryKey()))
                {
                    newObject = false;
                              temp_obj2.addActivityRelatedByNewUserId(obj1);
                              break;
                }
            }
                      if (newObject)
            {
                obj2.initActivitysRelatedByNewUserId();
                obj2.addActivityRelatedByNewUserId(obj1);
            }
                      results.add(obj1);
        }
        return results;
    }
                                                                      
                
                

    /**
     * selects a collection of Activity objects pre-filled with their
     * AttributeOption objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ActivityPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAttributeOptionRelatedByOldOptionId(Criteria criteria)
        throws TorqueException
    {
        return doSelectJoinAttributeOptionRelatedByOldOptionId(criteria, null);
    }

    /**
     * selects a collection of Activity objects pre-filled with their
     * AttributeOption objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ActivityPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAttributeOptionRelatedByOldOptionId(Criteria criteria, Connection conn)
        throws TorqueException
    {
        setDbName(criteria);

        ActivityPeer.addSelectColumns(criteria);
        int offset = numColumns + 1;
        AttributeOptionPeer.addSelectColumns(criteria);


                        criteria.addJoin(ActivityPeer.OLD_OPTION_ID,
            AttributeOptionPeer.OPTION_ID);
        
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

                            Class omClass = ActivityPeer.getOMClass();
                    Activity obj1 = (Activity) ActivityPeer
                .row2Object(row, 1, omClass);
                     omClass = AttributeOptionPeer.getOMClass();
                    AttributeOption obj2 = (AttributeOption)AttributeOptionPeer
                .row2Object(row, offset, omClass);

            boolean newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                AttributeOption temp_obj2 = (AttributeOption)temp_obj1.getAttributeOptionRelatedByOldOptionId();
                if (temp_obj2.getPrimaryKey().equals(obj2.getPrimaryKey()))
                {
                    newObject = false;
                              temp_obj2.addActivityRelatedByOldOptionId(obj1);
                              break;
                }
            }
                      if (newObject)
            {
                obj2.initActivitysRelatedByOldOptionId();
                obj2.addActivityRelatedByOldOptionId(obj1);
            }
                      results.add(obj1);
        }
        return results;
    }
                                                                      
                
                

    /**
     * selects a collection of Activity objects pre-filled with their
     * AttributeOption objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ActivityPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAttributeOptionRelatedByNewOptionId(Criteria criteria)
        throws TorqueException
    {
        return doSelectJoinAttributeOptionRelatedByNewOptionId(criteria, null);
    }

    /**
     * selects a collection of Activity objects pre-filled with their
     * AttributeOption objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ActivityPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAttributeOptionRelatedByNewOptionId(Criteria criteria, Connection conn)
        throws TorqueException
    {
        setDbName(criteria);

        ActivityPeer.addSelectColumns(criteria);
        int offset = numColumns + 1;
        AttributeOptionPeer.addSelectColumns(criteria);


                        criteria.addJoin(ActivityPeer.NEW_OPTION_ID,
            AttributeOptionPeer.OPTION_ID);
        
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

                            Class omClass = ActivityPeer.getOMClass();
                    Activity obj1 = (Activity) ActivityPeer
                .row2Object(row, 1, omClass);
                     omClass = AttributeOptionPeer.getOMClass();
                    AttributeOption obj2 = (AttributeOption)AttributeOptionPeer
                .row2Object(row, offset, omClass);

            boolean newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                AttributeOption temp_obj2 = (AttributeOption)temp_obj1.getAttributeOptionRelatedByNewOptionId();
                if (temp_obj2.getPrimaryKey().equals(obj2.getPrimaryKey()))
                {
                    newObject = false;
                              temp_obj2.addActivityRelatedByNewOptionId(obj1);
                              break;
                }
            }
                      if (newObject)
            {
                obj2.initActivitysRelatedByNewOptionId();
                obj2.addActivityRelatedByNewOptionId(obj1);
            }
                      results.add(obj1);
        }
        return results;
    }
                                                            
                
                

    /**
     * selects a collection of Activity objects pre-filled with their
     * Attachment objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ActivityPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAttachment(Criteria criteria)
        throws TorqueException
    {
        return doSelectJoinAttachment(criteria, null);
    }

    /**
     * selects a collection of Activity objects pre-filled with their
     * Attachment objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ActivityPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAttachment(Criteria criteria, Connection conn)
        throws TorqueException
    {
        setDbName(criteria);

        ActivityPeer.addSelectColumns(criteria);
        int offset = numColumns + 1;
        AttachmentPeer.addSelectColumns(criteria);


                        criteria.addJoin(ActivityPeer.ATTACHMENT_ID,
            AttachmentPeer.ATTACHMENT_ID);
        
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

                            Class omClass = ActivityPeer.getOMClass();
                    Activity obj1 = (Activity) ActivityPeer
                .row2Object(row, 1, omClass);
                     omClass = AttachmentPeer.getOMClass();
                    Attachment obj2 = (Attachment)AttachmentPeer
                .row2Object(row, offset, omClass);

            boolean newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                Attachment temp_obj2 = (Attachment)temp_obj1.getAttachment();
                if (temp_obj2.getPrimaryKey().equals(obj2.getPrimaryKey()))
                {
                    newObject = false;
                              temp_obj2.addActivity(obj1);
                              break;
                }
            }
                      if (newObject)
            {
                obj2.initActivitys();
                obj2.addActivity(obj1);
            }
                      results.add(obj1);
        }
        return results;
    }
                                                            
                
                

    /**
     * selects a collection of Activity objects pre-filled with their
     * Depend objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ActivityPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinDepend(Criteria criteria)
        throws TorqueException
    {
        return doSelectJoinDepend(criteria, null);
    }

    /**
     * selects a collection of Activity objects pre-filled with their
     * Depend objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ActivityPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinDepend(Criteria criteria, Connection conn)
        throws TorqueException
    {
        setDbName(criteria);

        ActivityPeer.addSelectColumns(criteria);
        int offset = numColumns + 1;
        DependPeer.addSelectColumns(criteria);


                        criteria.addJoin(ActivityPeer.DEPEND_ID,
            DependPeer.DEPEND_ID);
        
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

                            Class omClass = ActivityPeer.getOMClass();
                    Activity obj1 = (Activity) ActivityPeer
                .row2Object(row, 1, omClass);
                     omClass = DependPeer.getOMClass();
                    Depend obj2 = (Depend)DependPeer
                .row2Object(row, offset, omClass);

            boolean newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                Depend temp_obj2 = (Depend)temp_obj1.getDepend();
                if (temp_obj2.getPrimaryKey().equals(obj2.getPrimaryKey()))
                {
                    newObject = false;
                              temp_obj2.addActivity(obj1);
                              break;
                }
            }
                      if (newObject)
            {
                obj2.initActivitys();
                obj2.addActivity(obj1);
            }
                      results.add(obj1);
        }
        return results;
    }
                    
  
                                                                                                
          
        
                                  
                
    /**
     * selects a collection of Activity objects pre-filled with
     * all related objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ActivityPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAllExceptIssue(Criteria criteria)
        throws TorqueException
    {
        return doSelectJoinAllExceptIssue(criteria, null);
    }

    /**
     * selects a collection of Activity objects pre-filled with
     * all related objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ActivityPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAllExceptIssue(Criteria criteria, Connection conn)
        throws TorqueException
    {
        setDbName(criteria);

        addSelectColumns(criteria);
        int offset2 = numColumns + 1;
                                    
                                                  
                    AttributePeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.ATTRIBUTE_ID, AttributePeer.ATTRIBUTE_ID);
                                    int offset3 = offset2 + AttributePeer.numColumns;
                                                                                
                    ActivitySetPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.TRANSACTION_ID, ActivitySetPeer.TRANSACTION_ID);
                                    int offset4 = offset3 + ActivitySetPeer.numColumns;
                                                                                
                    ScarabUserImplPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.OLD_USER_ID, ScarabUserImplPeer.USER_ID);
                                    int offset5 = offset4 + ScarabUserImplPeer.numColumns;
                                                                                
                    ScarabUserImplPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.NEW_USER_ID, ScarabUserImplPeer.USER_ID);
                                    int offset6 = offset5 + ScarabUserImplPeer.numColumns;
                                                                                
                    AttributeOptionPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.OLD_OPTION_ID, AttributeOptionPeer.OPTION_ID);
                                    int offset7 = offset6 + AttributeOptionPeer.numColumns;
                                                                                
                    AttributeOptionPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.NEW_OPTION_ID, AttributeOptionPeer.OPTION_ID);
                                    int offset8 = offset7 + AttributeOptionPeer.numColumns;
                                                                                
                    AttachmentPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.ATTACHMENT_ID, AttachmentPeer.ATTACHMENT_ID);
                                    int offset9 = offset8 + AttachmentPeer.numColumns;
                                                                                
                    DependPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.DEPEND_ID, DependPeer.DEPEND_ID);
                                                          
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

                            Class omClass = ActivityPeer.getOMClass();
                    Activity obj1 = (Activity)ActivityPeer
                .row2Object(row, 1, omClass);
                                                
                                                                  
                                                        
                            
              
                           omClass = AttributePeer.getOMClass();
                          Attribute obj2 = (Attribute)AttributePeer
                .row2Object( row, offset2, omClass);

               boolean  newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                Attribute temp_obj2 = (Attribute)temp_obj1.getAttribute();
                if (temp_obj2.getPrimaryKey().equals(obj2.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj2.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj2.initActivitys();
                obj2.addActivity(obj1);
            }
                                                                                    
                                                        
                            
              
                           omClass = ActivitySetPeer.getOMClass();
                          ActivitySet obj3 = (ActivitySet)ActivitySetPeer
                .row2Object( row, offset3, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                ActivitySet temp_obj3 = (ActivitySet)temp_obj1.getActivitySet();
                if (temp_obj3.getPrimaryKey().equals(obj3.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj3.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj3.initActivitys();
                obj3.addActivity(obj1);
            }
                                                                                                
                                                                        
                            
              
                           omClass = ScarabUserImplPeer.getOMClass();
                          ScarabUserImpl obj4 = (ScarabUserImpl)ScarabUserImplPeer
                .row2Object( row, offset4, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                ScarabUserImpl temp_obj4 = (ScarabUserImpl)temp_obj1.getScarabUserRelatedByOldUserId();
                if (temp_obj4.getPrimaryKey().equals(obj4.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj4.addActivityRelatedByOldUserId(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj4.initActivitysRelatedByOldUserId();
                obj4.addActivityRelatedByOldUserId(obj1);
            }
                                                                                                
                                                                        
                            
              
                           omClass = ScarabUserImplPeer.getOMClass();
                          ScarabUserImpl obj5 = (ScarabUserImpl)ScarabUserImplPeer
                .row2Object( row, offset5, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                ScarabUserImpl temp_obj5 = (ScarabUserImpl)temp_obj1.getScarabUserRelatedByNewUserId();
                if (temp_obj5.getPrimaryKey().equals(obj5.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj5.addActivityRelatedByNewUserId(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj5.initActivitysRelatedByNewUserId();
                obj5.addActivityRelatedByNewUserId(obj1);
            }
                                                                                    
                                                                        
                            
              
                           omClass = AttributeOptionPeer.getOMClass();
                          AttributeOption obj6 = (AttributeOption)AttributeOptionPeer
                .row2Object( row, offset6, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                AttributeOption temp_obj6 = (AttributeOption)temp_obj1.getAttributeOptionRelatedByOldOptionId();
                if (temp_obj6.getPrimaryKey().equals(obj6.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj6.addActivityRelatedByOldOptionId(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj6.initActivitysRelatedByOldOptionId();
                obj6.addActivityRelatedByOldOptionId(obj1);
            }
                                                                                    
                                                                        
                            
              
                           omClass = AttributeOptionPeer.getOMClass();
                          AttributeOption obj7 = (AttributeOption)AttributeOptionPeer
                .row2Object( row, offset7, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                AttributeOption temp_obj7 = (AttributeOption)temp_obj1.getAttributeOptionRelatedByNewOptionId();
                if (temp_obj7.getPrimaryKey().equals(obj7.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj7.addActivityRelatedByNewOptionId(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj7.initActivitysRelatedByNewOptionId();
                obj7.addActivityRelatedByNewOptionId(obj1);
            }
                                                                                    
                                                        
                            
              
                           omClass = AttachmentPeer.getOMClass();
                          Attachment obj8 = (Attachment)AttachmentPeer
                .row2Object( row, offset8, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                Attachment temp_obj8 = (Attachment)temp_obj1.getAttachment();
                if (temp_obj8.getPrimaryKey().equals(obj8.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj8.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj8.initActivitys();
                obj8.addActivity(obj1);
            }
                                                                                    
                                                        
                            
              
                           omClass = DependPeer.getOMClass();
                          Depend obj9 = (Depend)DependPeer
                .row2Object( row, offset9, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                Depend temp_obj9 = (Depend)temp_obj1.getDepend();
                if (temp_obj9.getPrimaryKey().equals(obj9.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj9.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj9.initActivitys();
                obj9.addActivity(obj1);
            }
                                                                results.add(obj1);
        }
        return results;
    }
        
        
                                  
                
    /**
     * selects a collection of Activity objects pre-filled with
     * all related objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ActivityPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAllExceptAttribute(Criteria criteria)
        throws TorqueException
    {
        return doSelectJoinAllExceptAttribute(criteria, null);
    }

    /**
     * selects a collection of Activity objects pre-filled with
     * all related objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ActivityPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAllExceptAttribute(Criteria criteria, Connection conn)
        throws TorqueException
    {
        setDbName(criteria);

        addSelectColumns(criteria);
        int offset2 = numColumns + 1;
                                    
                    IssuePeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.ISSUE_ID, IssuePeer.ISSUE_ID);
                                    int offset3 = offset2 + IssuePeer.numColumns;
                                                                                
                                                  
                    ActivitySetPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.TRANSACTION_ID, ActivitySetPeer.TRANSACTION_ID);
                                    int offset4 = offset3 + ActivitySetPeer.numColumns;
                                                                                
                    ScarabUserImplPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.OLD_USER_ID, ScarabUserImplPeer.USER_ID);
                                    int offset5 = offset4 + ScarabUserImplPeer.numColumns;
                                                                                
                    ScarabUserImplPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.NEW_USER_ID, ScarabUserImplPeer.USER_ID);
                                    int offset6 = offset5 + ScarabUserImplPeer.numColumns;
                                                                                
                    AttributeOptionPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.OLD_OPTION_ID, AttributeOptionPeer.OPTION_ID);
                                    int offset7 = offset6 + AttributeOptionPeer.numColumns;
                                                                                
                    AttributeOptionPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.NEW_OPTION_ID, AttributeOptionPeer.OPTION_ID);
                                    int offset8 = offset7 + AttributeOptionPeer.numColumns;
                                                                                
                    AttachmentPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.ATTACHMENT_ID, AttachmentPeer.ATTACHMENT_ID);
                                    int offset9 = offset8 + AttachmentPeer.numColumns;
                                                                                
                    DependPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.DEPEND_ID, DependPeer.DEPEND_ID);
                                                          
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

                            Class omClass = ActivityPeer.getOMClass();
                    Activity obj1 = (Activity)ActivityPeer
                .row2Object(row, 1, omClass);
                                                
                                                        
                            
              
                           omClass = IssuePeer.getOMClass();
                          Issue obj2 = (Issue)IssuePeer
                .row2Object( row, offset2, omClass);

               boolean  newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                Issue temp_obj2 = (Issue)temp_obj1.getIssue();
                if (temp_obj2.getPrimaryKey().equals(obj2.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj2.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj2.initActivitys();
                obj2.addActivity(obj1);
            }
                                                                                    
                                                                  
                                                        
                            
              
                           omClass = ActivitySetPeer.getOMClass();
                          ActivitySet obj3 = (ActivitySet)ActivitySetPeer
                .row2Object( row, offset3, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                ActivitySet temp_obj3 = (ActivitySet)temp_obj1.getActivitySet();
                if (temp_obj3.getPrimaryKey().equals(obj3.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj3.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj3.initActivitys();
                obj3.addActivity(obj1);
            }
                                                                                                
                                                                        
                            
              
                           omClass = ScarabUserImplPeer.getOMClass();
                          ScarabUserImpl obj4 = (ScarabUserImpl)ScarabUserImplPeer
                .row2Object( row, offset4, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                ScarabUserImpl temp_obj4 = (ScarabUserImpl)temp_obj1.getScarabUserRelatedByOldUserId();
                if (temp_obj4.getPrimaryKey().equals(obj4.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj4.addActivityRelatedByOldUserId(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj4.initActivitysRelatedByOldUserId();
                obj4.addActivityRelatedByOldUserId(obj1);
            }
                                                                                                
                                                                        
                            
              
                           omClass = ScarabUserImplPeer.getOMClass();
                          ScarabUserImpl obj5 = (ScarabUserImpl)ScarabUserImplPeer
                .row2Object( row, offset5, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                ScarabUserImpl temp_obj5 = (ScarabUserImpl)temp_obj1.getScarabUserRelatedByNewUserId();
                if (temp_obj5.getPrimaryKey().equals(obj5.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj5.addActivityRelatedByNewUserId(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj5.initActivitysRelatedByNewUserId();
                obj5.addActivityRelatedByNewUserId(obj1);
            }
                                                                                    
                                                                        
                            
              
                           omClass = AttributeOptionPeer.getOMClass();
                          AttributeOption obj6 = (AttributeOption)AttributeOptionPeer
                .row2Object( row, offset6, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                AttributeOption temp_obj6 = (AttributeOption)temp_obj1.getAttributeOptionRelatedByOldOptionId();
                if (temp_obj6.getPrimaryKey().equals(obj6.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj6.addActivityRelatedByOldOptionId(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj6.initActivitysRelatedByOldOptionId();
                obj6.addActivityRelatedByOldOptionId(obj1);
            }
                                                                                    
                                                                        
                            
              
                           omClass = AttributeOptionPeer.getOMClass();
                          AttributeOption obj7 = (AttributeOption)AttributeOptionPeer
                .row2Object( row, offset7, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                AttributeOption temp_obj7 = (AttributeOption)temp_obj1.getAttributeOptionRelatedByNewOptionId();
                if (temp_obj7.getPrimaryKey().equals(obj7.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj7.addActivityRelatedByNewOptionId(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj7.initActivitysRelatedByNewOptionId();
                obj7.addActivityRelatedByNewOptionId(obj1);
            }
                                                                                    
                                                        
                            
              
                           omClass = AttachmentPeer.getOMClass();
                          Attachment obj8 = (Attachment)AttachmentPeer
                .row2Object( row, offset8, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                Attachment temp_obj8 = (Attachment)temp_obj1.getAttachment();
                if (temp_obj8.getPrimaryKey().equals(obj8.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj8.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj8.initActivitys();
                obj8.addActivity(obj1);
            }
                                                                                    
                                                        
                            
              
                           omClass = DependPeer.getOMClass();
                          Depend obj9 = (Depend)DependPeer
                .row2Object( row, offset9, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                Depend temp_obj9 = (Depend)temp_obj1.getDepend();
                if (temp_obj9.getPrimaryKey().equals(obj9.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj9.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj9.initActivitys();
                obj9.addActivity(obj1);
            }
                                                                results.add(obj1);
        }
        return results;
    }
        
        
                                  
                
    /**
     * selects a collection of Activity objects pre-filled with
     * all related objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ActivityPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAllExceptActivitySet(Criteria criteria)
        throws TorqueException
    {
        return doSelectJoinAllExceptActivitySet(criteria, null);
    }

    /**
     * selects a collection of Activity objects pre-filled with
     * all related objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ActivityPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAllExceptActivitySet(Criteria criteria, Connection conn)
        throws TorqueException
    {
        setDbName(criteria);

        addSelectColumns(criteria);
        int offset2 = numColumns + 1;
                                    
                    IssuePeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.ISSUE_ID, IssuePeer.ISSUE_ID);
                                    int offset3 = offset2 + IssuePeer.numColumns;
                                                                                
                    AttributePeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.ATTRIBUTE_ID, AttributePeer.ATTRIBUTE_ID);
                                    int offset4 = offset3 + AttributePeer.numColumns;
                                                                                
                                                  
                    ScarabUserImplPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.OLD_USER_ID, ScarabUserImplPeer.USER_ID);
                                    int offset5 = offset4 + ScarabUserImplPeer.numColumns;
                                                                                
                    ScarabUserImplPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.NEW_USER_ID, ScarabUserImplPeer.USER_ID);
                                    int offset6 = offset5 + ScarabUserImplPeer.numColumns;
                                                                                
                    AttributeOptionPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.OLD_OPTION_ID, AttributeOptionPeer.OPTION_ID);
                                    int offset7 = offset6 + AttributeOptionPeer.numColumns;
                                                                                
                    AttributeOptionPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.NEW_OPTION_ID, AttributeOptionPeer.OPTION_ID);
                                    int offset8 = offset7 + AttributeOptionPeer.numColumns;
                                                                                
                    AttachmentPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.ATTACHMENT_ID, AttachmentPeer.ATTACHMENT_ID);
                                    int offset9 = offset8 + AttachmentPeer.numColumns;
                                                                                
                    DependPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.DEPEND_ID, DependPeer.DEPEND_ID);
                                                          
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

                            Class omClass = ActivityPeer.getOMClass();
                    Activity obj1 = (Activity)ActivityPeer
                .row2Object(row, 1, omClass);
                                                
                                                        
                            
              
                           omClass = IssuePeer.getOMClass();
                          Issue obj2 = (Issue)IssuePeer
                .row2Object( row, offset2, omClass);

               boolean  newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                Issue temp_obj2 = (Issue)temp_obj1.getIssue();
                if (temp_obj2.getPrimaryKey().equals(obj2.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj2.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj2.initActivitys();
                obj2.addActivity(obj1);
            }
                                                                                    
                                                        
                            
              
                           omClass = AttributePeer.getOMClass();
                          Attribute obj3 = (Attribute)AttributePeer
                .row2Object( row, offset3, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                Attribute temp_obj3 = (Attribute)temp_obj1.getAttribute();
                if (temp_obj3.getPrimaryKey().equals(obj3.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj3.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj3.initActivitys();
                obj3.addActivity(obj1);
            }
                                                                                    
                                                                              
                                                                        
                            
              
                           omClass = ScarabUserImplPeer.getOMClass();
                          ScarabUserImpl obj4 = (ScarabUserImpl)ScarabUserImplPeer
                .row2Object( row, offset4, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                ScarabUserImpl temp_obj4 = (ScarabUserImpl)temp_obj1.getScarabUserRelatedByOldUserId();
                if (temp_obj4.getPrimaryKey().equals(obj4.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj4.addActivityRelatedByOldUserId(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj4.initActivitysRelatedByOldUserId();
                obj4.addActivityRelatedByOldUserId(obj1);
            }
                                                                                                
                                                                        
                            
              
                           omClass = ScarabUserImplPeer.getOMClass();
                          ScarabUserImpl obj5 = (ScarabUserImpl)ScarabUserImplPeer
                .row2Object( row, offset5, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                ScarabUserImpl temp_obj5 = (ScarabUserImpl)temp_obj1.getScarabUserRelatedByNewUserId();
                if (temp_obj5.getPrimaryKey().equals(obj5.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj5.addActivityRelatedByNewUserId(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj5.initActivitysRelatedByNewUserId();
                obj5.addActivityRelatedByNewUserId(obj1);
            }
                                                                                    
                                                                        
                            
              
                           omClass = AttributeOptionPeer.getOMClass();
                          AttributeOption obj6 = (AttributeOption)AttributeOptionPeer
                .row2Object( row, offset6, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                AttributeOption temp_obj6 = (AttributeOption)temp_obj1.getAttributeOptionRelatedByOldOptionId();
                if (temp_obj6.getPrimaryKey().equals(obj6.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj6.addActivityRelatedByOldOptionId(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj6.initActivitysRelatedByOldOptionId();
                obj6.addActivityRelatedByOldOptionId(obj1);
            }
                                                                                    
                                                                        
                            
              
                           omClass = AttributeOptionPeer.getOMClass();
                          AttributeOption obj7 = (AttributeOption)AttributeOptionPeer
                .row2Object( row, offset7, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                AttributeOption temp_obj7 = (AttributeOption)temp_obj1.getAttributeOptionRelatedByNewOptionId();
                if (temp_obj7.getPrimaryKey().equals(obj7.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj7.addActivityRelatedByNewOptionId(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj7.initActivitysRelatedByNewOptionId();
                obj7.addActivityRelatedByNewOptionId(obj1);
            }
                                                                                    
                                                        
                            
              
                           omClass = AttachmentPeer.getOMClass();
                          Attachment obj8 = (Attachment)AttachmentPeer
                .row2Object( row, offset8, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                Attachment temp_obj8 = (Attachment)temp_obj1.getAttachment();
                if (temp_obj8.getPrimaryKey().equals(obj8.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj8.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj8.initActivitys();
                obj8.addActivity(obj1);
            }
                                                                                    
                                                        
                            
              
                           omClass = DependPeer.getOMClass();
                          Depend obj9 = (Depend)DependPeer
                .row2Object( row, offset9, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                Depend temp_obj9 = (Depend)temp_obj1.getDepend();
                if (temp_obj9.getPrimaryKey().equals(obj9.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj9.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj9.initActivitys();
                obj9.addActivity(obj1);
            }
                                                                results.add(obj1);
        }
        return results;
    }
        
        
                                            
                
    /**
     * selects a collection of Activity objects pre-filled with
     * all related objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ActivityPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAllExceptScarabUserImplRelatedByOldUserId(Criteria criteria)
        throws TorqueException
    {
        return doSelectJoinAllExceptScarabUserImplRelatedByOldUserId(criteria, null);
    }

    /**
     * selects a collection of Activity objects pre-filled with
     * all related objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ActivityPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAllExceptScarabUserImplRelatedByOldUserId(Criteria criteria, Connection conn)
        throws TorqueException
    {
        setDbName(criteria);

        addSelectColumns(criteria);
        int offset2 = numColumns + 1;
                                    
                    IssuePeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.ISSUE_ID, IssuePeer.ISSUE_ID);
                                    int offset3 = offset2 + IssuePeer.numColumns;
                                                                                
                    AttributePeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.ATTRIBUTE_ID, AttributePeer.ATTRIBUTE_ID);
                                    int offset4 = offset3 + AttributePeer.numColumns;
                                                                                
                    ActivitySetPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.TRANSACTION_ID, ActivitySetPeer.TRANSACTION_ID);
                                    int offset5 = offset4 + ActivitySetPeer.numColumns;
                                                                                
                                                  
                                                  
                    AttributeOptionPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.OLD_OPTION_ID, AttributeOptionPeer.OPTION_ID);
                                    int offset6 = offset5 + AttributeOptionPeer.numColumns;
                                                                                
                    AttributeOptionPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.NEW_OPTION_ID, AttributeOptionPeer.OPTION_ID);
                                    int offset7 = offset6 + AttributeOptionPeer.numColumns;
                                                                                
                    AttachmentPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.ATTACHMENT_ID, AttachmentPeer.ATTACHMENT_ID);
                                    int offset8 = offset7 + AttachmentPeer.numColumns;
                                                                                
                    DependPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.DEPEND_ID, DependPeer.DEPEND_ID);
                                    int offset9 = offset8 + DependPeer.numColumns;
                                                            
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

                            Class omClass = ActivityPeer.getOMClass();
                    Activity obj1 = (Activity)ActivityPeer
                .row2Object(row, 1, omClass);
                                                
                                                        
                            
              
                           omClass = IssuePeer.getOMClass();
                          Issue obj2 = (Issue)IssuePeer
                .row2Object( row, offset2, omClass);

               boolean  newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                Issue temp_obj2 = (Issue)temp_obj1.getIssue();
                if (temp_obj2.getPrimaryKey().equals(obj2.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj2.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj2.initActivitys();
                obj2.addActivity(obj1);
            }
                                                                                    
                                                        
                            
              
                           omClass = AttributePeer.getOMClass();
                          Attribute obj3 = (Attribute)AttributePeer
                .row2Object( row, offset3, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                Attribute temp_obj3 = (Attribute)temp_obj1.getAttribute();
                if (temp_obj3.getPrimaryKey().equals(obj3.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj3.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj3.initActivitys();
                obj3.addActivity(obj1);
            }
                                                                                    
                                                        
                            
              
                           omClass = ActivitySetPeer.getOMClass();
                          ActivitySet obj4 = (ActivitySet)ActivitySetPeer
                .row2Object( row, offset4, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                ActivitySet temp_obj4 = (ActivitySet)temp_obj1.getActivitySet();
                if (temp_obj4.getPrimaryKey().equals(obj4.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj4.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj4.initActivitys();
                obj4.addActivity(obj1);
            }
                                                                                                
                                                                              
                                                                  
                                                                        
                            
              
                           omClass = AttributeOptionPeer.getOMClass();
                          AttributeOption obj5 = (AttributeOption)AttributeOptionPeer
                .row2Object( row, offset5, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                AttributeOption temp_obj5 = (AttributeOption)temp_obj1.getAttributeOptionRelatedByOldOptionId();
                if (temp_obj5.getPrimaryKey().equals(obj5.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj5.addActivityRelatedByOldOptionId(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj5.initActivitysRelatedByOldOptionId();
                obj5.addActivityRelatedByOldOptionId(obj1);
            }
                                                                                    
                                                                        
                            
              
                           omClass = AttributeOptionPeer.getOMClass();
                          AttributeOption obj6 = (AttributeOption)AttributeOptionPeer
                .row2Object( row, offset6, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                AttributeOption temp_obj6 = (AttributeOption)temp_obj1.getAttributeOptionRelatedByNewOptionId();
                if (temp_obj6.getPrimaryKey().equals(obj6.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj6.addActivityRelatedByNewOptionId(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj6.initActivitysRelatedByNewOptionId();
                obj6.addActivityRelatedByNewOptionId(obj1);
            }
                                                                                    
                                                        
                            
              
                           omClass = AttachmentPeer.getOMClass();
                          Attachment obj7 = (Attachment)AttachmentPeer
                .row2Object( row, offset7, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                Attachment temp_obj7 = (Attachment)temp_obj1.getAttachment();
                if (temp_obj7.getPrimaryKey().equals(obj7.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj7.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj7.initActivitys();
                obj7.addActivity(obj1);
            }
                                                                                    
                                                        
                            
              
                           omClass = DependPeer.getOMClass();
                          Depend obj8 = (Depend)DependPeer
                .row2Object( row, offset8, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                Depend temp_obj8 = (Depend)temp_obj1.getDepend();
                if (temp_obj8.getPrimaryKey().equals(obj8.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj8.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj8.initActivitys();
                obj8.addActivity(obj1);
            }
                                                                results.add(obj1);
        }
        return results;
    }
        
        
                                            
                
    /**
     * selects a collection of Activity objects pre-filled with
     * all related objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ActivityPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAllExceptScarabUserImplRelatedByNewUserId(Criteria criteria)
        throws TorqueException
    {
        return doSelectJoinAllExceptScarabUserImplRelatedByNewUserId(criteria, null);
    }

    /**
     * selects a collection of Activity objects pre-filled with
     * all related objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ActivityPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAllExceptScarabUserImplRelatedByNewUserId(Criteria criteria, Connection conn)
        throws TorqueException
    {
        setDbName(criteria);

        addSelectColumns(criteria);
        int offset2 = numColumns + 1;
                                    
                    IssuePeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.ISSUE_ID, IssuePeer.ISSUE_ID);
                                    int offset3 = offset2 + IssuePeer.numColumns;
                                                                                
                    AttributePeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.ATTRIBUTE_ID, AttributePeer.ATTRIBUTE_ID);
                                    int offset4 = offset3 + AttributePeer.numColumns;
                                                                                
                    ActivitySetPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.TRANSACTION_ID, ActivitySetPeer.TRANSACTION_ID);
                                    int offset5 = offset4 + ActivitySetPeer.numColumns;
                                                                                
                                                  
                                                  
                    AttributeOptionPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.OLD_OPTION_ID, AttributeOptionPeer.OPTION_ID);
                                    int offset6 = offset5 + AttributeOptionPeer.numColumns;
                                                                                
                    AttributeOptionPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.NEW_OPTION_ID, AttributeOptionPeer.OPTION_ID);
                                    int offset7 = offset6 + AttributeOptionPeer.numColumns;
                                                                                
                    AttachmentPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.ATTACHMENT_ID, AttachmentPeer.ATTACHMENT_ID);
                                    int offset8 = offset7 + AttachmentPeer.numColumns;
                                                                                
                    DependPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.DEPEND_ID, DependPeer.DEPEND_ID);
                                    int offset9 = offset8 + DependPeer.numColumns;
                                                            
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

                            Class omClass = ActivityPeer.getOMClass();
                    Activity obj1 = (Activity)ActivityPeer
                .row2Object(row, 1, omClass);
                                                
                                                        
                            
              
                           omClass = IssuePeer.getOMClass();
                          Issue obj2 = (Issue)IssuePeer
                .row2Object( row, offset2, omClass);

               boolean  newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                Issue temp_obj2 = (Issue)temp_obj1.getIssue();
                if (temp_obj2.getPrimaryKey().equals(obj2.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj2.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj2.initActivitys();
                obj2.addActivity(obj1);
            }
                                                                                    
                                                        
                            
              
                           omClass = AttributePeer.getOMClass();
                          Attribute obj3 = (Attribute)AttributePeer
                .row2Object( row, offset3, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                Attribute temp_obj3 = (Attribute)temp_obj1.getAttribute();
                if (temp_obj3.getPrimaryKey().equals(obj3.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj3.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj3.initActivitys();
                obj3.addActivity(obj1);
            }
                                                                                    
                                                        
                            
              
                           omClass = ActivitySetPeer.getOMClass();
                          ActivitySet obj4 = (ActivitySet)ActivitySetPeer
                .row2Object( row, offset4, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                ActivitySet temp_obj4 = (ActivitySet)temp_obj1.getActivitySet();
                if (temp_obj4.getPrimaryKey().equals(obj4.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj4.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj4.initActivitys();
                obj4.addActivity(obj1);
            }
                                                                                                
                                                                              
                                                                  
                                                                        
                            
              
                           omClass = AttributeOptionPeer.getOMClass();
                          AttributeOption obj5 = (AttributeOption)AttributeOptionPeer
                .row2Object( row, offset5, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                AttributeOption temp_obj5 = (AttributeOption)temp_obj1.getAttributeOptionRelatedByOldOptionId();
                if (temp_obj5.getPrimaryKey().equals(obj5.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj5.addActivityRelatedByOldOptionId(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj5.initActivitysRelatedByOldOptionId();
                obj5.addActivityRelatedByOldOptionId(obj1);
            }
                                                                                    
                                                                        
                            
              
                           omClass = AttributeOptionPeer.getOMClass();
                          AttributeOption obj6 = (AttributeOption)AttributeOptionPeer
                .row2Object( row, offset6, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                AttributeOption temp_obj6 = (AttributeOption)temp_obj1.getAttributeOptionRelatedByNewOptionId();
                if (temp_obj6.getPrimaryKey().equals(obj6.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj6.addActivityRelatedByNewOptionId(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj6.initActivitysRelatedByNewOptionId();
                obj6.addActivityRelatedByNewOptionId(obj1);
            }
                                                                                    
                                                        
                            
              
                           omClass = AttachmentPeer.getOMClass();
                          Attachment obj7 = (Attachment)AttachmentPeer
                .row2Object( row, offset7, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                Attachment temp_obj7 = (Attachment)temp_obj1.getAttachment();
                if (temp_obj7.getPrimaryKey().equals(obj7.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj7.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj7.initActivitys();
                obj7.addActivity(obj1);
            }
                                                                                    
                                                        
                            
              
                           omClass = DependPeer.getOMClass();
                          Depend obj8 = (Depend)DependPeer
                .row2Object( row, offset8, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                Depend temp_obj8 = (Depend)temp_obj1.getDepend();
                if (temp_obj8.getPrimaryKey().equals(obj8.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj8.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj8.initActivitys();
                obj8.addActivity(obj1);
            }
                                                                results.add(obj1);
        }
        return results;
    }
        
        
                                            
                
    /**
     * selects a collection of Activity objects pre-filled with
     * all related objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ActivityPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAllExceptAttributeOptionRelatedByOldOptionId(Criteria criteria)
        throws TorqueException
    {
        return doSelectJoinAllExceptAttributeOptionRelatedByOldOptionId(criteria, null);
    }

    /**
     * selects a collection of Activity objects pre-filled with
     * all related objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ActivityPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAllExceptAttributeOptionRelatedByOldOptionId(Criteria criteria, Connection conn)
        throws TorqueException
    {
        setDbName(criteria);

        addSelectColumns(criteria);
        int offset2 = numColumns + 1;
                                    
                    IssuePeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.ISSUE_ID, IssuePeer.ISSUE_ID);
                                    int offset3 = offset2 + IssuePeer.numColumns;
                                                                                
                    AttributePeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.ATTRIBUTE_ID, AttributePeer.ATTRIBUTE_ID);
                                    int offset4 = offset3 + AttributePeer.numColumns;
                                                                                
                    ActivitySetPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.TRANSACTION_ID, ActivitySetPeer.TRANSACTION_ID);
                                    int offset5 = offset4 + ActivitySetPeer.numColumns;
                                                                                
                    ScarabUserImplPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.OLD_USER_ID, ScarabUserImplPeer.USER_ID);
                                    int offset6 = offset5 + ScarabUserImplPeer.numColumns;
                                                                                
                    ScarabUserImplPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.NEW_USER_ID, ScarabUserImplPeer.USER_ID);
                                    int offset7 = offset6 + ScarabUserImplPeer.numColumns;
                                                                                
                                                  
                                                  
                    AttachmentPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.ATTACHMENT_ID, AttachmentPeer.ATTACHMENT_ID);
                                    int offset8 = offset7 + AttachmentPeer.numColumns;
                                                                                
                    DependPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.DEPEND_ID, DependPeer.DEPEND_ID);
                                    int offset9 = offset8 + DependPeer.numColumns;
                                                            
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

                            Class omClass = ActivityPeer.getOMClass();
                    Activity obj1 = (Activity)ActivityPeer
                .row2Object(row, 1, omClass);
                                                
                                                        
                            
              
                           omClass = IssuePeer.getOMClass();
                          Issue obj2 = (Issue)IssuePeer
                .row2Object( row, offset2, omClass);

               boolean  newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                Issue temp_obj2 = (Issue)temp_obj1.getIssue();
                if (temp_obj2.getPrimaryKey().equals(obj2.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj2.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj2.initActivitys();
                obj2.addActivity(obj1);
            }
                                                                                    
                                                        
                            
              
                           omClass = AttributePeer.getOMClass();
                          Attribute obj3 = (Attribute)AttributePeer
                .row2Object( row, offset3, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                Attribute temp_obj3 = (Attribute)temp_obj1.getAttribute();
                if (temp_obj3.getPrimaryKey().equals(obj3.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj3.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj3.initActivitys();
                obj3.addActivity(obj1);
            }
                                                                                    
                                                        
                            
              
                           omClass = ActivitySetPeer.getOMClass();
                          ActivitySet obj4 = (ActivitySet)ActivitySetPeer
                .row2Object( row, offset4, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                ActivitySet temp_obj4 = (ActivitySet)temp_obj1.getActivitySet();
                if (temp_obj4.getPrimaryKey().equals(obj4.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj4.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj4.initActivitys();
                obj4.addActivity(obj1);
            }
                                                                                                
                                                                        
                            
              
                           omClass = ScarabUserImplPeer.getOMClass();
                          ScarabUserImpl obj5 = (ScarabUserImpl)ScarabUserImplPeer
                .row2Object( row, offset5, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                ScarabUserImpl temp_obj5 = (ScarabUserImpl)temp_obj1.getScarabUserRelatedByOldUserId();
                if (temp_obj5.getPrimaryKey().equals(obj5.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj5.addActivityRelatedByOldUserId(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj5.initActivitysRelatedByOldUserId();
                obj5.addActivityRelatedByOldUserId(obj1);
            }
                                                                                                
                                                                        
                            
              
                           omClass = ScarabUserImplPeer.getOMClass();
                          ScarabUserImpl obj6 = (ScarabUserImpl)ScarabUserImplPeer
                .row2Object( row, offset6, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                ScarabUserImpl temp_obj6 = (ScarabUserImpl)temp_obj1.getScarabUserRelatedByNewUserId();
                if (temp_obj6.getPrimaryKey().equals(obj6.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj6.addActivityRelatedByNewUserId(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj6.initActivitysRelatedByNewUserId();
                obj6.addActivityRelatedByNewUserId(obj1);
            }
                                                                                    
                                                                  
                                                                  
                                                        
                            
              
                           omClass = AttachmentPeer.getOMClass();
                          Attachment obj7 = (Attachment)AttachmentPeer
                .row2Object( row, offset7, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                Attachment temp_obj7 = (Attachment)temp_obj1.getAttachment();
                if (temp_obj7.getPrimaryKey().equals(obj7.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj7.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj7.initActivitys();
                obj7.addActivity(obj1);
            }
                                                                                    
                                                        
                            
              
                           omClass = DependPeer.getOMClass();
                          Depend obj8 = (Depend)DependPeer
                .row2Object( row, offset8, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                Depend temp_obj8 = (Depend)temp_obj1.getDepend();
                if (temp_obj8.getPrimaryKey().equals(obj8.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj8.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj8.initActivitys();
                obj8.addActivity(obj1);
            }
                                                                results.add(obj1);
        }
        return results;
    }
        
        
                                            
                
    /**
     * selects a collection of Activity objects pre-filled with
     * all related objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ActivityPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAllExceptAttributeOptionRelatedByNewOptionId(Criteria criteria)
        throws TorqueException
    {
        return doSelectJoinAllExceptAttributeOptionRelatedByNewOptionId(criteria, null);
    }

    /**
     * selects a collection of Activity objects pre-filled with
     * all related objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ActivityPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAllExceptAttributeOptionRelatedByNewOptionId(Criteria criteria, Connection conn)
        throws TorqueException
    {
        setDbName(criteria);

        addSelectColumns(criteria);
        int offset2 = numColumns + 1;
                                    
                    IssuePeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.ISSUE_ID, IssuePeer.ISSUE_ID);
                                    int offset3 = offset2 + IssuePeer.numColumns;
                                                                                
                    AttributePeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.ATTRIBUTE_ID, AttributePeer.ATTRIBUTE_ID);
                                    int offset4 = offset3 + AttributePeer.numColumns;
                                                                                
                    ActivitySetPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.TRANSACTION_ID, ActivitySetPeer.TRANSACTION_ID);
                                    int offset5 = offset4 + ActivitySetPeer.numColumns;
                                                                                
                    ScarabUserImplPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.OLD_USER_ID, ScarabUserImplPeer.USER_ID);
                                    int offset6 = offset5 + ScarabUserImplPeer.numColumns;
                                                                                
                    ScarabUserImplPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.NEW_USER_ID, ScarabUserImplPeer.USER_ID);
                                    int offset7 = offset6 + ScarabUserImplPeer.numColumns;
                                                                                
                                                  
                                                  
                    AttachmentPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.ATTACHMENT_ID, AttachmentPeer.ATTACHMENT_ID);
                                    int offset8 = offset7 + AttachmentPeer.numColumns;
                                                                                
                    DependPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.DEPEND_ID, DependPeer.DEPEND_ID);
                                    int offset9 = offset8 + DependPeer.numColumns;
                                                            
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

                            Class omClass = ActivityPeer.getOMClass();
                    Activity obj1 = (Activity)ActivityPeer
                .row2Object(row, 1, omClass);
                                                
                                                        
                            
              
                           omClass = IssuePeer.getOMClass();
                          Issue obj2 = (Issue)IssuePeer
                .row2Object( row, offset2, omClass);

               boolean  newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                Issue temp_obj2 = (Issue)temp_obj1.getIssue();
                if (temp_obj2.getPrimaryKey().equals(obj2.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj2.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj2.initActivitys();
                obj2.addActivity(obj1);
            }
                                                                                    
                                                        
                            
              
                           omClass = AttributePeer.getOMClass();
                          Attribute obj3 = (Attribute)AttributePeer
                .row2Object( row, offset3, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                Attribute temp_obj3 = (Attribute)temp_obj1.getAttribute();
                if (temp_obj3.getPrimaryKey().equals(obj3.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj3.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj3.initActivitys();
                obj3.addActivity(obj1);
            }
                                                                                    
                                                        
                            
              
                           omClass = ActivitySetPeer.getOMClass();
                          ActivitySet obj4 = (ActivitySet)ActivitySetPeer
                .row2Object( row, offset4, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                ActivitySet temp_obj4 = (ActivitySet)temp_obj1.getActivitySet();
                if (temp_obj4.getPrimaryKey().equals(obj4.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj4.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj4.initActivitys();
                obj4.addActivity(obj1);
            }
                                                                                                
                                                                        
                            
              
                           omClass = ScarabUserImplPeer.getOMClass();
                          ScarabUserImpl obj5 = (ScarabUserImpl)ScarabUserImplPeer
                .row2Object( row, offset5, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                ScarabUserImpl temp_obj5 = (ScarabUserImpl)temp_obj1.getScarabUserRelatedByOldUserId();
                if (temp_obj5.getPrimaryKey().equals(obj5.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj5.addActivityRelatedByOldUserId(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj5.initActivitysRelatedByOldUserId();
                obj5.addActivityRelatedByOldUserId(obj1);
            }
                                                                                                
                                                                        
                            
              
                           omClass = ScarabUserImplPeer.getOMClass();
                          ScarabUserImpl obj6 = (ScarabUserImpl)ScarabUserImplPeer
                .row2Object( row, offset6, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                ScarabUserImpl temp_obj6 = (ScarabUserImpl)temp_obj1.getScarabUserRelatedByNewUserId();
                if (temp_obj6.getPrimaryKey().equals(obj6.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj6.addActivityRelatedByNewUserId(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj6.initActivitysRelatedByNewUserId();
                obj6.addActivityRelatedByNewUserId(obj1);
            }
                                                                                    
                                                                  
                                                                  
                                                        
                            
              
                           omClass = AttachmentPeer.getOMClass();
                          Attachment obj7 = (Attachment)AttachmentPeer
                .row2Object( row, offset7, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                Attachment temp_obj7 = (Attachment)temp_obj1.getAttachment();
                if (temp_obj7.getPrimaryKey().equals(obj7.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj7.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj7.initActivitys();
                obj7.addActivity(obj1);
            }
                                                                                    
                                                        
                            
              
                           omClass = DependPeer.getOMClass();
                          Depend obj8 = (Depend)DependPeer
                .row2Object( row, offset8, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                Depend temp_obj8 = (Depend)temp_obj1.getDepend();
                if (temp_obj8.getPrimaryKey().equals(obj8.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj8.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj8.initActivitys();
                obj8.addActivity(obj1);
            }
                                                                results.add(obj1);
        }
        return results;
    }
        
        
                                  
                
    /**
     * selects a collection of Activity objects pre-filled with
     * all related objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ActivityPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAllExceptAttachment(Criteria criteria)
        throws TorqueException
    {
        return doSelectJoinAllExceptAttachment(criteria, null);
    }

    /**
     * selects a collection of Activity objects pre-filled with
     * all related objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ActivityPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAllExceptAttachment(Criteria criteria, Connection conn)
        throws TorqueException
    {
        setDbName(criteria);

        addSelectColumns(criteria);
        int offset2 = numColumns + 1;
                                    
                    IssuePeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.ISSUE_ID, IssuePeer.ISSUE_ID);
                                    int offset3 = offset2 + IssuePeer.numColumns;
                                                                                
                    AttributePeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.ATTRIBUTE_ID, AttributePeer.ATTRIBUTE_ID);
                                    int offset4 = offset3 + AttributePeer.numColumns;
                                                                                
                    ActivitySetPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.TRANSACTION_ID, ActivitySetPeer.TRANSACTION_ID);
                                    int offset5 = offset4 + ActivitySetPeer.numColumns;
                                                                                
                    ScarabUserImplPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.OLD_USER_ID, ScarabUserImplPeer.USER_ID);
                                    int offset6 = offset5 + ScarabUserImplPeer.numColumns;
                                                                                
                    ScarabUserImplPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.NEW_USER_ID, ScarabUserImplPeer.USER_ID);
                                    int offset7 = offset6 + ScarabUserImplPeer.numColumns;
                                                                                
                    AttributeOptionPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.OLD_OPTION_ID, AttributeOptionPeer.OPTION_ID);
                                    int offset8 = offset7 + AttributeOptionPeer.numColumns;
                                                                                
                    AttributeOptionPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.NEW_OPTION_ID, AttributeOptionPeer.OPTION_ID);
                                    int offset9 = offset8 + AttributeOptionPeer.numColumns;
                                                                                
                                                  
                    DependPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.DEPEND_ID, DependPeer.DEPEND_ID);
                                                          
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

                            Class omClass = ActivityPeer.getOMClass();
                    Activity obj1 = (Activity)ActivityPeer
                .row2Object(row, 1, omClass);
                                                
                                                        
                            
              
                           omClass = IssuePeer.getOMClass();
                          Issue obj2 = (Issue)IssuePeer
                .row2Object( row, offset2, omClass);

               boolean  newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                Issue temp_obj2 = (Issue)temp_obj1.getIssue();
                if (temp_obj2.getPrimaryKey().equals(obj2.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj2.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj2.initActivitys();
                obj2.addActivity(obj1);
            }
                                                                                    
                                                        
                            
              
                           omClass = AttributePeer.getOMClass();
                          Attribute obj3 = (Attribute)AttributePeer
                .row2Object( row, offset3, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                Attribute temp_obj3 = (Attribute)temp_obj1.getAttribute();
                if (temp_obj3.getPrimaryKey().equals(obj3.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj3.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj3.initActivitys();
                obj3.addActivity(obj1);
            }
                                                                                    
                                                        
                            
              
                           omClass = ActivitySetPeer.getOMClass();
                          ActivitySet obj4 = (ActivitySet)ActivitySetPeer
                .row2Object( row, offset4, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                ActivitySet temp_obj4 = (ActivitySet)temp_obj1.getActivitySet();
                if (temp_obj4.getPrimaryKey().equals(obj4.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj4.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj4.initActivitys();
                obj4.addActivity(obj1);
            }
                                                                                                
                                                                        
                            
              
                           omClass = ScarabUserImplPeer.getOMClass();
                          ScarabUserImpl obj5 = (ScarabUserImpl)ScarabUserImplPeer
                .row2Object( row, offset5, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                ScarabUserImpl temp_obj5 = (ScarabUserImpl)temp_obj1.getScarabUserRelatedByOldUserId();
                if (temp_obj5.getPrimaryKey().equals(obj5.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj5.addActivityRelatedByOldUserId(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj5.initActivitysRelatedByOldUserId();
                obj5.addActivityRelatedByOldUserId(obj1);
            }
                                                                                                
                                                                        
                            
              
                           omClass = ScarabUserImplPeer.getOMClass();
                          ScarabUserImpl obj6 = (ScarabUserImpl)ScarabUserImplPeer
                .row2Object( row, offset6, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                ScarabUserImpl temp_obj6 = (ScarabUserImpl)temp_obj1.getScarabUserRelatedByNewUserId();
                if (temp_obj6.getPrimaryKey().equals(obj6.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj6.addActivityRelatedByNewUserId(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj6.initActivitysRelatedByNewUserId();
                obj6.addActivityRelatedByNewUserId(obj1);
            }
                                                                                    
                                                                        
                            
              
                           omClass = AttributeOptionPeer.getOMClass();
                          AttributeOption obj7 = (AttributeOption)AttributeOptionPeer
                .row2Object( row, offset7, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                AttributeOption temp_obj7 = (AttributeOption)temp_obj1.getAttributeOptionRelatedByOldOptionId();
                if (temp_obj7.getPrimaryKey().equals(obj7.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj7.addActivityRelatedByOldOptionId(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj7.initActivitysRelatedByOldOptionId();
                obj7.addActivityRelatedByOldOptionId(obj1);
            }
                                                                                    
                                                                        
                            
              
                           omClass = AttributeOptionPeer.getOMClass();
                          AttributeOption obj8 = (AttributeOption)AttributeOptionPeer
                .row2Object( row, offset8, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                AttributeOption temp_obj8 = (AttributeOption)temp_obj1.getAttributeOptionRelatedByNewOptionId();
                if (temp_obj8.getPrimaryKey().equals(obj8.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj8.addActivityRelatedByNewOptionId(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj8.initActivitysRelatedByNewOptionId();
                obj8.addActivityRelatedByNewOptionId(obj1);
            }
                                                                                    
                                                                  
                                                        
                            
              
                           omClass = DependPeer.getOMClass();
                          Depend obj9 = (Depend)DependPeer
                .row2Object( row, offset9, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                Depend temp_obj9 = (Depend)temp_obj1.getDepend();
                if (temp_obj9.getPrimaryKey().equals(obj9.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj9.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj9.initActivitys();
                obj9.addActivity(obj1);
            }
                                                                results.add(obj1);
        }
        return results;
    }
        
        
                                  
                
    /**
     * selects a collection of Activity objects pre-filled with
     * all related objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ActivityPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAllExceptDepend(Criteria criteria)
        throws TorqueException
    {
        return doSelectJoinAllExceptDepend(criteria, null);
    }

    /**
     * selects a collection of Activity objects pre-filled with
     * all related objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ActivityPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAllExceptDepend(Criteria criteria, Connection conn)
        throws TorqueException
    {
        setDbName(criteria);

        addSelectColumns(criteria);
        int offset2 = numColumns + 1;
                                    
                    IssuePeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.ISSUE_ID, IssuePeer.ISSUE_ID);
                                    int offset3 = offset2 + IssuePeer.numColumns;
                                                                                
                    AttributePeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.ATTRIBUTE_ID, AttributePeer.ATTRIBUTE_ID);
                                    int offset4 = offset3 + AttributePeer.numColumns;
                                                                                
                    ActivitySetPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.TRANSACTION_ID, ActivitySetPeer.TRANSACTION_ID);
                                    int offset5 = offset4 + ActivitySetPeer.numColumns;
                                                                                
                    ScarabUserImplPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.OLD_USER_ID, ScarabUserImplPeer.USER_ID);
                                    int offset6 = offset5 + ScarabUserImplPeer.numColumns;
                                                                                
                    ScarabUserImplPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.NEW_USER_ID, ScarabUserImplPeer.USER_ID);
                                    int offset7 = offset6 + ScarabUserImplPeer.numColumns;
                                                                                
                    AttributeOptionPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.OLD_OPTION_ID, AttributeOptionPeer.OPTION_ID);
                                    int offset8 = offset7 + AttributeOptionPeer.numColumns;
                                                                                
                    AttributeOptionPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.NEW_OPTION_ID, AttributeOptionPeer.OPTION_ID);
                                    int offset9 = offset8 + AttributeOptionPeer.numColumns;
                                                                                
                    AttachmentPeer.addSelectColumns(criteria);
                                    criteria.addJoin(ActivityPeer.ATTACHMENT_ID, AttachmentPeer.ATTACHMENT_ID);
                                                                              
                              
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

                            Class omClass = ActivityPeer.getOMClass();
                    Activity obj1 = (Activity)ActivityPeer
                .row2Object(row, 1, omClass);
                                                
                                                        
                            
              
                           omClass = IssuePeer.getOMClass();
                          Issue obj2 = (Issue)IssuePeer
                .row2Object( row, offset2, omClass);

               boolean  newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                Issue temp_obj2 = (Issue)temp_obj1.getIssue();
                if (temp_obj2.getPrimaryKey().equals(obj2.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj2.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj2.initActivitys();
                obj2.addActivity(obj1);
            }
                                                                                    
                                                        
                            
              
                           omClass = AttributePeer.getOMClass();
                          Attribute obj3 = (Attribute)AttributePeer
                .row2Object( row, offset3, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                Attribute temp_obj3 = (Attribute)temp_obj1.getAttribute();
                if (temp_obj3.getPrimaryKey().equals(obj3.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj3.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj3.initActivitys();
                obj3.addActivity(obj1);
            }
                                                                                    
                                                        
                            
              
                           omClass = ActivitySetPeer.getOMClass();
                          ActivitySet obj4 = (ActivitySet)ActivitySetPeer
                .row2Object( row, offset4, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                ActivitySet temp_obj4 = (ActivitySet)temp_obj1.getActivitySet();
                if (temp_obj4.getPrimaryKey().equals(obj4.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj4.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj4.initActivitys();
                obj4.addActivity(obj1);
            }
                                                                                                
                                                                        
                            
              
                           omClass = ScarabUserImplPeer.getOMClass();
                          ScarabUserImpl obj5 = (ScarabUserImpl)ScarabUserImplPeer
                .row2Object( row, offset5, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                ScarabUserImpl temp_obj5 = (ScarabUserImpl)temp_obj1.getScarabUserRelatedByOldUserId();
                if (temp_obj5.getPrimaryKey().equals(obj5.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj5.addActivityRelatedByOldUserId(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj5.initActivitysRelatedByOldUserId();
                obj5.addActivityRelatedByOldUserId(obj1);
            }
                                                                                                
                                                                        
                            
              
                           omClass = ScarabUserImplPeer.getOMClass();
                          ScarabUserImpl obj6 = (ScarabUserImpl)ScarabUserImplPeer
                .row2Object( row, offset6, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                ScarabUserImpl temp_obj6 = (ScarabUserImpl)temp_obj1.getScarabUserRelatedByNewUserId();
                if (temp_obj6.getPrimaryKey().equals(obj6.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj6.addActivityRelatedByNewUserId(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj6.initActivitysRelatedByNewUserId();
                obj6.addActivityRelatedByNewUserId(obj1);
            }
                                                                                    
                                                                        
                            
              
                           omClass = AttributeOptionPeer.getOMClass();
                          AttributeOption obj7 = (AttributeOption)AttributeOptionPeer
                .row2Object( row, offset7, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                AttributeOption temp_obj7 = (AttributeOption)temp_obj1.getAttributeOptionRelatedByOldOptionId();
                if (temp_obj7.getPrimaryKey().equals(obj7.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj7.addActivityRelatedByOldOptionId(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj7.initActivitysRelatedByOldOptionId();
                obj7.addActivityRelatedByOldOptionId(obj1);
            }
                                                                                    
                                                                        
                            
              
                           omClass = AttributeOptionPeer.getOMClass();
                          AttributeOption obj8 = (AttributeOption)AttributeOptionPeer
                .row2Object( row, offset8, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                AttributeOption temp_obj8 = (AttributeOption)temp_obj1.getAttributeOptionRelatedByNewOptionId();
                if (temp_obj8.getPrimaryKey().equals(obj8.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj8.addActivityRelatedByNewOptionId(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj8.initActivitysRelatedByNewOptionId();
                obj8.addActivityRelatedByNewOptionId(obj1);
            }
                                                                                    
                                                        
                            
              
                           omClass = AttachmentPeer.getOMClass();
                          Attachment obj9 = (Attachment)AttachmentPeer
                .row2Object( row, offset9, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Activity temp_obj1 = (Activity)results.get(j);
                Attachment temp_obj9 = (Attachment)temp_obj1.getAttachment();
                if (temp_obj9.getPrimaryKey().equals(obj9.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj9.addActivity(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj9.initActivitys();
                obj9.addActivity(obj1);
            }
                                                                                    
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
