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
public abstract class BaseRQueryUserPeer
    extends BasePeer
{

    /** the default database name for this class */
    public static final String DATABASE_NAME = "scarab";

     /** the table name for this class */
    public static final String TABLE_NAME = "SCARAB_R_QUERY_USER";

    /**
     * @return the map builder for this peer
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static MapBuilder getMapBuilder()
        throws TorqueException
    {
        return getMapBuilder(RQueryUserMapBuilder.CLASS_NAME);
    }

      /** the column name for the QUERY_ID field */
    public static final String QUERY_ID;
      /** the column name for the USER_ID field */
    public static final String USER_ID;
      /** the column name for the IS_SUBSCRIBED field */
    public static final String IS_SUBSCRIBED;
      /** the column name for the SUBSCRIPTION_FREQUENCY_ID field */
    public static final String SUBSCRIPTION_FREQUENCY_ID;
      /** the column name for the ISDEFAULT field */
    public static final String ISDEFAULT;
  
    static
    {
          QUERY_ID = "SCARAB_R_QUERY_USER.QUERY_ID";
          USER_ID = "SCARAB_R_QUERY_USER.USER_ID";
          IS_SUBSCRIBED = "SCARAB_R_QUERY_USER.IS_SUBSCRIBED";
          SUBSCRIPTION_FREQUENCY_ID = "SCARAB_R_QUERY_USER.SUBSCRIPTION_FREQUENCY_ID";
          ISDEFAULT = "SCARAB_R_QUERY_USER.ISDEFAULT";
          if (Torque.isInit())
        {
            try
            {
                getMapBuilder(RQueryUserMapBuilder.CLASS_NAME);
            }
            catch (Exception e)
            {
                log.error("Could not initialize Peer", e);
                throw new RuntimeException(e);
            }
        }
        else
        {
            Torque.registerMapBuilder(RQueryUserMapBuilder.CLASS_NAME);
        }
    }
 
    /** number of columns for this peer */
    public static final int numColumns =  5;

    /** A class that can be returned by this peer. */
    protected static final String CLASSNAME_DEFAULT =
        "org.tigris.scarab.om.RQueryUser";

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
        return BaseRQueryUserPeer
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
          criteria.addSelectColumn(QUERY_ID);
          criteria.addSelectColumn(USER_ID);
          criteria.addSelectColumn(IS_SUBSCRIBED);
          criteria.addSelectColumn(SUBSCRIPTION_FREQUENCY_ID);
          criteria.addSelectColumn(ISDEFAULT);
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
        if (criteria.containsKey(IS_SUBSCRIBED))
        {
            Object possibleBoolean = criteria.get(IS_SUBSCRIBED);
            if (possibleBoolean instanceof Boolean)
            {
                criteria.add(IS_SUBSCRIBED, ((Boolean) possibleBoolean).booleanValue() ? 1 : 0);
            }
         }
                        // check for conversion from boolean to int
        if (criteria.containsKey(ISDEFAULT))
        {
            Object possibleBoolean = criteria.get(ISDEFAULT);
            if (possibleBoolean instanceof Boolean)
            {
                criteria.add(ISDEFAULT, ((Boolean) possibleBoolean).booleanValue() ? 1 : 0);
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
    public static RQueryUser row2Object(Record row,
                                             int offset,
                                             Class cls)
        throws TorqueException
    {
        try
        {
            RQueryUser obj = (RQueryUser) cls.newInstance();
            RQueryUserPeer.populateObject(row, offset, obj);
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
                                      RQueryUser obj)
        throws TorqueException
    {
        try
        {
                obj.setQueryId(row.getValue(offset + 0).asLongObj());
                  obj.setUserId(row.getValue(offset + 1).asIntegerObj());
                  obj.setIsSubscribed(row.getValue(offset + 2).asBoolean());
                  obj.setSubscriptionFrequency(row.getValue(offset + 3).asIntegerObj());
                  obj.setIsdefault(row.getValue(offset + 4).asBoolean());
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
        return BaseRQueryUserPeer
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
              results.add(RQueryUserPeer.row2Object(row, 1,
                RQueryUserPeer.getOMClass()));
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
         BaseRQueryUserPeer
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

  
             selectCriteria.put(QUERY_ID, criteria.remove(QUERY_ID));
      
             selectCriteria.put(USER_ID, criteria.remove(USER_ID));
      
      
      
      
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
         RQueryUserPeer
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
    public static List doSelect(RQueryUser obj) throws TorqueException
    {
        return doSelect(buildSelectCriteria(obj));
    }

    /**
     * Method to do inserts
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static void doInsert(RQueryUser obj) throws TorqueException
    {
          doInsert(buildCriteria(obj));
          obj.setNew(false);
        obj.setModified(false);
    }

    /**
     * @param obj the data object to update in the database.
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static void doUpdate(RQueryUser obj) throws TorqueException
    {
        doUpdate(buildCriteria(obj));
        obj.setModified(false);
    }

    /**
     * @param obj the data object to delete in the database.
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static void doDelete(RQueryUser obj) throws TorqueException
    {
        doDelete(buildSelectCriteria(obj));
    }

    /**
     * Method to do inserts.  This method is to be used during a transaction,
     * otherwise use the doInsert(RQueryUser) method.  It will take
     * care of the connection details internally.
     *
     * @param obj the data object to insert into the database.
     * @param con the connection to use
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static void doInsert(RQueryUser obj, Connection con)
        throws TorqueException
    {
          doInsert(buildCriteria(obj), con);
          obj.setNew(false);
        obj.setModified(false);
    }

    /**
     * Method to do update.  This method is to be used during a transaction,
     * otherwise use the doUpdate(RQueryUser) method.  It will take
     * care of the connection details internally.
     *
     * @param obj the data object to update in the database.
     * @param con the connection to use
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static void doUpdate(RQueryUser obj, Connection con)
        throws TorqueException
    {
        doUpdate(buildCriteria(obj), con);
        obj.setModified(false);
    }

    /**
     * Method to delete.  This method is to be used during a transaction,
     * otherwise use the doDelete(RQueryUser) method.  It will take
     * care of the connection details internally.
     *
     * @param obj the data object to delete in the database.
     * @param con the connection to use
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static void doDelete(RQueryUser obj, Connection con)
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
        BaseRQueryUserPeer
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
          SimpleKey[] keys = (SimpleKey[])pk.getValue();
                    criteria.add(QUERY_ID, keys[0]);
                      criteria.add(USER_ID, keys[1]);
                    return criteria;
     }

    /** Build a Criteria object from the data object for this peer */
    public static Criteria buildCriteria( RQueryUser obj )
    {
        Criteria criteria = new Criteria(DATABASE_NAME);
              criteria.add(QUERY_ID, obj.getQueryId());
              criteria.add(USER_ID, obj.getUserId());
              criteria.add(IS_SUBSCRIBED, obj.getIsSubscribed());
              criteria.add(SUBSCRIPTION_FREQUENCY_ID, obj.getSubscriptionFrequency());
              criteria.add(ISDEFAULT, obj.getIsdefault());
          return criteria;
    }

    /** Build a Criteria object from the data object for this peer, skipping all binary columns */
    public static Criteria buildSelectCriteria( RQueryUser obj )
    {
        Criteria criteria = new Criteria(DATABASE_NAME);
                      criteria.add(QUERY_ID, obj.getQueryId());
                              criteria.add(USER_ID, obj.getUserId());
                              criteria.add(IS_SUBSCRIBED, obj.getIsSubscribed());
                              criteria.add(SUBSCRIPTION_FREQUENCY_ID, obj.getSubscriptionFrequency());
                              criteria.add(ISDEFAULT, obj.getIsdefault());
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
    public static RQueryUser retrieveByPK(ObjectKey pk)
        throws TorqueException, NoRowsException, TooManyRowsException
    {
        Connection db = null;
        RQueryUser retVal = null;
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
    public static RQueryUser retrieveByPK(ObjectKey pk, Connection con)
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
            return (RQueryUser)v.get(0);
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
              Iterator iter = pks.iterator();
            while (iter.hasNext())
            {
                ObjectKey pk = (ObjectKey)iter.next();
                SimpleKey[] keys = (SimpleKey[])pk.getValue();
                            Criteria.Criterion c0 = criteria.getNewCriterion(
                        QUERY_ID, keys[0], Criteria.EQUAL);
                                    Criteria.Criterion c1 = criteria.getNewCriterion(
                        USER_ID, keys[1], Criteria.EQUAL);
                                    c0.and(c1);
                          criteria.or(c0);
            }
          objs = doSelect(criteria, dbcon);
        }
        return objs;
    }

 
    /**
     * retrieve object using using pk values.
     *
       * @param query_id Long
       * @param user_id Integer
       */
    public static RQueryUser retrieveByPK(
       Long query_id
          , Integer user_id
              ) throws TorqueException
    {
        Connection db = null;
        RQueryUser retVal = null;
        try
        {
           db = Torque.getConnection(DATABASE_NAME);
           retVal = retrieveByPK(
         query_id
          , user_id
                     , db);
        }
        finally
        {
            Torque.closeConnection(db);
        }
        return retVal;
    }

      /**
     * retrieve object using using pk values.
     *
       * @param query_id Long
       * @param user_id Integer
       * @param con Connection
     */
    public static RQueryUser retrieveByPK(
       Long query_id
          , Integer user_id
             ,Connection con) throws TorqueException
    {

        Criteria criteria = new Criteria(5);
          criteria.add(QUERY_ID, query_id);
          criteria.add(USER_ID, user_id);
          List v = doSelect(criteria, con);
        if (v.size() == 1)
        {
            return (RQueryUser) v.get(0);
        }
        else
        {
            throw new TorqueException("Failed to select one and only one row.");
        }
    }



              
                                              
                
                

    /**
     * selects a collection of RQueryUser objects pre-filled with their
     * Query objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in RQueryUserPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinQuery(Criteria criteria)
        throws TorqueException
    {
        return doSelectJoinQuery(criteria, null);
    }

    /**
     * selects a collection of RQueryUser objects pre-filled with their
     * Query objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in RQueryUserPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinQuery(Criteria criteria, Connection conn)
        throws TorqueException
    {
        setDbName(criteria);

        RQueryUserPeer.addSelectColumns(criteria);
        int offset = numColumns + 1;
        QueryPeer.addSelectColumns(criteria);


                        criteria.addJoin(RQueryUserPeer.QUERY_ID,
            QueryPeer.QUERY_ID);
        
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

                            Class omClass = RQueryUserPeer.getOMClass();
                    RQueryUser obj1 = (RQueryUser) RQueryUserPeer
                .row2Object(row, 1, omClass);
                     omClass = QueryPeer.getOMClass();
                    Query obj2 = (Query)QueryPeer
                .row2Object(row, offset, omClass);

            boolean newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                RQueryUser temp_obj1 = (RQueryUser)results.get(j);
                Query temp_obj2 = (Query)temp_obj1.getQuery();
                if (temp_obj2.getPrimaryKey().equals(obj2.getPrimaryKey()))
                {
                    newObject = false;
                              temp_obj2.addRQueryUser(obj1);
                              break;
                }
            }
                      if (newObject)
            {
                obj2.initRQueryUsers();
                obj2.addRQueryUser(obj1);
            }
                      results.add(obj1);
        }
        return results;
    }
                                                            
                        
                

    /**
     * selects a collection of RQueryUser objects pre-filled with their
     * ScarabUserImpl objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in RQueryUserPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinScarabUserImpl(Criteria criteria)
        throws TorqueException
    {
        return doSelectJoinScarabUserImpl(criteria, null);
    }

    /**
     * selects a collection of RQueryUser objects pre-filled with their
     * ScarabUserImpl objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in RQueryUserPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinScarabUserImpl(Criteria criteria, Connection conn)
        throws TorqueException
    {
        setDbName(criteria);

        RQueryUserPeer.addSelectColumns(criteria);
        int offset = numColumns + 1;
        ScarabUserImplPeer.addSelectColumns(criteria);


                        criteria.addJoin(RQueryUserPeer.USER_ID,
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

                            Class omClass = RQueryUserPeer.getOMClass();
                    RQueryUser obj1 = (RQueryUser) RQueryUserPeer
                .row2Object(row, 1, omClass);
                     omClass = ScarabUserImplPeer.getOMClass();
                    ScarabUserImpl obj2 = (ScarabUserImpl)ScarabUserImplPeer
                .row2Object(row, offset, omClass);

            boolean newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                RQueryUser temp_obj1 = (RQueryUser)results.get(j);
                ScarabUserImpl temp_obj2 = (ScarabUserImpl)temp_obj1.getScarabUser();
                if (temp_obj2.getPrimaryKey().equals(obj2.getPrimaryKey()))
                {
                    newObject = false;
                              temp_obj2.addRQueryUser(obj1);
                              break;
                }
            }
                      if (newObject)
            {
                obj2.initRQueryUsers();
                obj2.addRQueryUser(obj1);
            }
                      results.add(obj1);
        }
        return results;
    }
                                                            
                
                

    /**
     * selects a collection of RQueryUser objects pre-filled with their
     * Frequency objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in RQueryUserPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinFrequency(Criteria criteria)
        throws TorqueException
    {
        return doSelectJoinFrequency(criteria, null);
    }

    /**
     * selects a collection of RQueryUser objects pre-filled with their
     * Frequency objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in RQueryUserPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinFrequency(Criteria criteria, Connection conn)
        throws TorqueException
    {
        setDbName(criteria);

        RQueryUserPeer.addSelectColumns(criteria);
        int offset = numColumns + 1;
        FrequencyPeer.addSelectColumns(criteria);


                        criteria.addJoin(RQueryUserPeer.SUBSCRIPTION_FREQUENCY_ID,
            FrequencyPeer.FREQUENCY_ID);
        
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

                            Class omClass = RQueryUserPeer.getOMClass();
                    RQueryUser obj1 = (RQueryUser) RQueryUserPeer
                .row2Object(row, 1, omClass);
                     omClass = FrequencyPeer.getOMClass();
                    Frequency obj2 = (Frequency)FrequencyPeer
                .row2Object(row, offset, omClass);

            boolean newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                RQueryUser temp_obj1 = (RQueryUser)results.get(j);
                Frequency temp_obj2 = (Frequency)temp_obj1.getFrequency();
                if (temp_obj2.getPrimaryKey().equals(obj2.getPrimaryKey()))
                {
                    newObject = false;
                              temp_obj2.addRQueryUser(obj1);
                              break;
                }
            }
                      if (newObject)
            {
                obj2.initRQueryUsers();
                obj2.addRQueryUser(obj1);
            }
                      results.add(obj1);
        }
        return results;
    }
                    
  
                                    
          
        
                                  
                
    /**
     * selects a collection of RQueryUser objects pre-filled with
     * all related objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in RQueryUserPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAllExceptQuery(Criteria criteria)
        throws TorqueException
    {
        return doSelectJoinAllExceptQuery(criteria, null);
    }

    /**
     * selects a collection of RQueryUser objects pre-filled with
     * all related objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in RQueryUserPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAllExceptQuery(Criteria criteria, Connection conn)
        throws TorqueException
    {
        setDbName(criteria);

        addSelectColumns(criteria);
        int offset2 = numColumns + 1;
                                    
                                                  
                    ScarabUserImplPeer.addSelectColumns(criteria);
                                    criteria.addJoin(RQueryUserPeer.USER_ID, ScarabUserImplPeer.USER_ID);
                                    int offset3 = offset2 + ScarabUserImplPeer.numColumns;
                                                                                
                    FrequencyPeer.addSelectColumns(criteria);
                                    criteria.addJoin(RQueryUserPeer.SUBSCRIPTION_FREQUENCY_ID, FrequencyPeer.FREQUENCY_ID);
                                                          
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

                            Class omClass = RQueryUserPeer.getOMClass();
                    RQueryUser obj1 = (RQueryUser)RQueryUserPeer
                .row2Object(row, 1, omClass);
                                                
                                                                              
                                                        
                            
              
                           omClass = ScarabUserImplPeer.getOMClass();
                          ScarabUserImpl obj2 = (ScarabUserImpl)ScarabUserImplPeer
                .row2Object( row, offset2, omClass);

               boolean  newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                RQueryUser temp_obj1 = (RQueryUser)results.get(j);
                ScarabUserImpl temp_obj2 = (ScarabUserImpl)temp_obj1.getScarabUser();
                if (temp_obj2.getPrimaryKey().equals(obj2.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj2.addRQueryUser(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj2.initRQueryUsers();
                obj2.addRQueryUser(obj1);
            }
                                                                                    
                                                        
                            
              
                           omClass = FrequencyPeer.getOMClass();
                          Frequency obj3 = (Frequency)FrequencyPeer
                .row2Object( row, offset3, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                RQueryUser temp_obj1 = (RQueryUser)results.get(j);
                Frequency temp_obj3 = (Frequency)temp_obj1.getFrequency();
                if (temp_obj3.getPrimaryKey().equals(obj3.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj3.addRQueryUser(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj3.initRQueryUsers();
                obj3.addRQueryUser(obj1);
            }
                                                                results.add(obj1);
        }
        return results;
    }
        
        
                                  
                
    /**
     * selects a collection of RQueryUser objects pre-filled with
     * all related objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in RQueryUserPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAllExceptScarabUserImpl(Criteria criteria)
        throws TorqueException
    {
        return doSelectJoinAllExceptScarabUserImpl(criteria, null);
    }

    /**
     * selects a collection of RQueryUser objects pre-filled with
     * all related objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in RQueryUserPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAllExceptScarabUserImpl(Criteria criteria, Connection conn)
        throws TorqueException
    {
        setDbName(criteria);

        addSelectColumns(criteria);
        int offset2 = numColumns + 1;
                                    
                    QueryPeer.addSelectColumns(criteria);
                                    criteria.addJoin(RQueryUserPeer.QUERY_ID, QueryPeer.QUERY_ID);
                                    int offset3 = offset2 + QueryPeer.numColumns;
                                                                                
                                                  
                    FrequencyPeer.addSelectColumns(criteria);
                                    criteria.addJoin(RQueryUserPeer.SUBSCRIPTION_FREQUENCY_ID, FrequencyPeer.FREQUENCY_ID);
                                                          
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

                            Class omClass = RQueryUserPeer.getOMClass();
                    RQueryUser obj1 = (RQueryUser)RQueryUserPeer
                .row2Object(row, 1, omClass);
                                                
                                                        
                            
              
                           omClass = QueryPeer.getOMClass();
                          Query obj2 = (Query)QueryPeer
                .row2Object( row, offset2, omClass);

               boolean  newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                RQueryUser temp_obj1 = (RQueryUser)results.get(j);
                Query temp_obj2 = (Query)temp_obj1.getQuery();
                if (temp_obj2.getPrimaryKey().equals(obj2.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj2.addRQueryUser(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj2.initRQueryUsers();
                obj2.addRQueryUser(obj1);
            }
                                                                                                
                                                                  
                                                        
                            
              
                           omClass = FrequencyPeer.getOMClass();
                          Frequency obj3 = (Frequency)FrequencyPeer
                .row2Object( row, offset3, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                RQueryUser temp_obj1 = (RQueryUser)results.get(j);
                Frequency temp_obj3 = (Frequency)temp_obj1.getFrequency();
                if (temp_obj3.getPrimaryKey().equals(obj3.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj3.addRQueryUser(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj3.initRQueryUsers();
                obj3.addRQueryUser(obj1);
            }
                                                                results.add(obj1);
        }
        return results;
    }
        
        
                                  
                
    /**
     * selects a collection of RQueryUser objects pre-filled with
     * all related objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in RQueryUserPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAllExceptFrequency(Criteria criteria)
        throws TorqueException
    {
        return doSelectJoinAllExceptFrequency(criteria, null);
    }

    /**
     * selects a collection of RQueryUser objects pre-filled with
     * all related objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in RQueryUserPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAllExceptFrequency(Criteria criteria, Connection conn)
        throws TorqueException
    {
        setDbName(criteria);

        addSelectColumns(criteria);
        int offset2 = numColumns + 1;
                                    
                    QueryPeer.addSelectColumns(criteria);
                                    criteria.addJoin(RQueryUserPeer.QUERY_ID, QueryPeer.QUERY_ID);
                                    int offset3 = offset2 + QueryPeer.numColumns;
                                                                                
                    ScarabUserImplPeer.addSelectColumns(criteria);
                                    criteria.addJoin(RQueryUserPeer.USER_ID, ScarabUserImplPeer.USER_ID);
                                                                              
                              
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

                            Class omClass = RQueryUserPeer.getOMClass();
                    RQueryUser obj1 = (RQueryUser)RQueryUserPeer
                .row2Object(row, 1, omClass);
                                                
                                                        
                            
              
                           omClass = QueryPeer.getOMClass();
                          Query obj2 = (Query)QueryPeer
                .row2Object( row, offset2, omClass);

               boolean  newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                RQueryUser temp_obj1 = (RQueryUser)results.get(j);
                Query temp_obj2 = (Query)temp_obj1.getQuery();
                if (temp_obj2.getPrimaryKey().equals(obj2.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj2.addRQueryUser(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj2.initRQueryUsers();
                obj2.addRQueryUser(obj1);
            }
                                                                                                
                                                        
                            
              
                           omClass = ScarabUserImplPeer.getOMClass();
                          ScarabUserImpl obj3 = (ScarabUserImpl)ScarabUserImplPeer
                .row2Object( row, offset3, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                RQueryUser temp_obj1 = (RQueryUser)results.get(j);
                ScarabUserImpl temp_obj3 = (ScarabUserImpl)temp_obj1.getScarabUser();
                if (temp_obj3.getPrimaryKey().equals(obj3.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj3.addRQueryUser(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj3.initRQueryUsers();
                obj3.addRQueryUser(obj1);
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
