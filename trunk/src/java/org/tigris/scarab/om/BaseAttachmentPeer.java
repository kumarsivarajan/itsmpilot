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
public abstract class BaseAttachmentPeer
    extends BasePeer
{

    /** the default database name for this class */
    public static final String DATABASE_NAME = "scarab";

     /** the table name for this class */
    public static final String TABLE_NAME = "SCARAB_ATTACHMENT";

    /**
     * @return the map builder for this peer
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static MapBuilder getMapBuilder()
        throws TorqueException
    {
        return getMapBuilder(AttachmentMapBuilder.CLASS_NAME);
    }

      /** the column name for the ATTACHMENT_ID field */
    public static final String ATTACHMENT_ID;
      /** the column name for the ISSUE_ID field */
    public static final String ISSUE_ID;
      /** the column name for the ATTACHMENT_TYPE_ID field */
    public static final String ATTACHMENT_TYPE_ID;
      /** the column name for the ATTACHMENT_NAME field */
    public static final String ATTACHMENT_NAME;
      /** the column name for the ATTACHMENT_DATA field */
    public static final String ATTACHMENT_DATA;
      /** the column name for the ATTACHMENT_FILE_PATH field */
    public static final String ATTACHMENT_FILE_PATH;
      /** the column name for the ATTACHMENT_MIME_TYPE field */
    public static final String ATTACHMENT_MIME_TYPE;
      /** the column name for the MODIFIED_BY field */
    public static final String MODIFIED_BY;
      /** the column name for the CREATED_BY field */
    public static final String CREATED_BY;
      /** the column name for the MODIFIED_DATE field */
    public static final String MODIFIED_DATE;
      /** the column name for the CREATED_DATE field */
    public static final String CREATED_DATE;
      /** the column name for the DELETED field */
    public static final String DELETED;
  
    static
    {
          ATTACHMENT_ID = "SCARAB_ATTACHMENT.ATTACHMENT_ID";
          ISSUE_ID = "SCARAB_ATTACHMENT.ISSUE_ID";
          ATTACHMENT_TYPE_ID = "SCARAB_ATTACHMENT.ATTACHMENT_TYPE_ID";
          ATTACHMENT_NAME = "SCARAB_ATTACHMENT.ATTACHMENT_NAME";
          ATTACHMENT_DATA = "SCARAB_ATTACHMENT.ATTACHMENT_DATA";
          ATTACHMENT_FILE_PATH = "SCARAB_ATTACHMENT.ATTACHMENT_FILE_PATH";
          ATTACHMENT_MIME_TYPE = "SCARAB_ATTACHMENT.ATTACHMENT_MIME_TYPE";
          MODIFIED_BY = "SCARAB_ATTACHMENT.MODIFIED_BY";
          CREATED_BY = "SCARAB_ATTACHMENT.CREATED_BY";
          MODIFIED_DATE = "SCARAB_ATTACHMENT.MODIFIED_DATE";
          CREATED_DATE = "SCARAB_ATTACHMENT.CREATED_DATE";
          DELETED = "SCARAB_ATTACHMENT.DELETED";
          if (Torque.isInit())
        {
            try
            {
                getMapBuilder(AttachmentMapBuilder.CLASS_NAME);
            }
            catch (Exception e)
            {
                log.error("Could not initialize Peer", e);
                throw new RuntimeException(e);
            }
        }
        else
        {
            Torque.registerMapBuilder(AttachmentMapBuilder.CLASS_NAME);
        }
    }
 
    /** number of columns for this peer */
    public static final int numColumns =  12;

    /** A class that can be returned by this peer. */
    protected static final String CLASSNAME_DEFAULT =
        "org.tigris.scarab.om.Attachment";

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
        return BaseAttachmentPeer
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
          criteria.addSelectColumn(ATTACHMENT_ID);
          criteria.addSelectColumn(ISSUE_ID);
          criteria.addSelectColumn(ATTACHMENT_TYPE_ID);
          criteria.addSelectColumn(ATTACHMENT_NAME);
          criteria.addSelectColumn(ATTACHMENT_DATA);
          criteria.addSelectColumn(ATTACHMENT_FILE_PATH);
          criteria.addSelectColumn(ATTACHMENT_MIME_TYPE);
          criteria.addSelectColumn(MODIFIED_BY);
          criteria.addSelectColumn(CREATED_BY);
          criteria.addSelectColumn(MODIFIED_DATE);
          criteria.addSelectColumn(CREATED_DATE);
          criteria.addSelectColumn(DELETED);
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
    public static Attachment row2Object(Record row,
                                             int offset,
                                             Class cls)
        throws TorqueException
    {
        try
        {
            Attachment obj = (Attachment) cls.newInstance();
            AttachmentPeer.populateObject(row, offset, obj);
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
                                      Attachment obj)
        throws TorqueException
    {
        try
        {
                obj.setAttachmentId(row.getValue(offset + 0).asLongObj());
                  obj.setIssueId(row.getValue(offset + 1).asLongObj());
                  obj.setTypeId(row.getValue(offset + 2).asIntegerObj());
                  obj.setName(row.getValue(offset + 3).asString());
                  obj.setData(row.getValue(offset + 4).asString());
                  obj.setFileName(row.getValue(offset + 5).asString());
                  obj.setMimeType(row.getValue(offset + 6).asString());
                  obj.setModifiedBy(row.getValue(offset + 7).asIntegerObj());
                  obj.setCreatedBy(row.getValue(offset + 8).asIntegerObj());
                  obj.setModifiedDate(row.getValue(offset + 9).asUtilDate());
                  obj.setCreatedDate(row.getValue(offset + 10).asUtilDate());
                  obj.setDeleted(row.getValue(offset + 11).asBoolean());
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
        return BaseAttachmentPeer
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
              results.add(AttachmentPeer.row2Object(row, 1,
                AttachmentPeer.getOMClass()));
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
         BaseAttachmentPeer
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

  
             selectCriteria.put(ATTACHMENT_ID, criteria.remove(ATTACHMENT_ID));
      
      
      
      
      
      
      
      
      
      
      
      
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
         AttachmentPeer
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
    public static List doSelect(Attachment obj) throws TorqueException
    {
        return doSelect(buildSelectCriteria(obj));
    }

    /**
     * Method to do inserts
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static void doInsert(Attachment obj) throws TorqueException
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
    public static void doUpdate(Attachment obj) throws TorqueException
    {
        doUpdate(buildCriteria(obj));
        obj.setModified(false);
    }

    /**
     * @param obj the data object to delete in the database.
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static void doDelete(Attachment obj) throws TorqueException
    {
        doDelete(buildSelectCriteria(obj));
    }

    /**
     * Method to do inserts.  This method is to be used during a transaction,
     * otherwise use the doInsert(Attachment) method.  It will take
     * care of the connection details internally.
     *
     * @param obj the data object to insert into the database.
     * @param con the connection to use
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static void doInsert(Attachment obj, Connection con)
        throws TorqueException
    {
          obj.setPrimaryKey(doInsert(buildCriteria(obj), con));
          obj.setNew(false);
        obj.setModified(false);
    }

    /**
     * Method to do update.  This method is to be used during a transaction,
     * otherwise use the doUpdate(Attachment) method.  It will take
     * care of the connection details internally.
     *
     * @param obj the data object to update in the database.
     * @param con the connection to use
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static void doUpdate(Attachment obj, Connection con)
        throws TorqueException
    {
        doUpdate(buildCriteria(obj), con);
        obj.setModified(false);
    }

    /**
     * Method to delete.  This method is to be used during a transaction,
     * otherwise use the doDelete(Attachment) method.  It will take
     * care of the connection details internally.
     *
     * @param obj the data object to delete in the database.
     * @param con the connection to use
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    public static void doDelete(Attachment obj, Connection con)
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
        BaseAttachmentPeer
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
              criteria.add(ATTACHMENT_ID, pk);
          return criteria;
     }

    /** Build a Criteria object from the data object for this peer */
    public static Criteria buildCriteria( Attachment obj )
    {
        Criteria criteria = new Criteria(DATABASE_NAME);
              if (!obj.isNew())
            criteria.add(ATTACHMENT_ID, obj.getAttachmentId());
              criteria.add(ISSUE_ID, obj.getIssueId());
              criteria.add(ATTACHMENT_TYPE_ID, obj.getTypeId());
              criteria.add(ATTACHMENT_NAME, obj.getName());
              criteria.add(ATTACHMENT_DATA, obj.getData());
              criteria.add(ATTACHMENT_FILE_PATH, obj.getFileName());
              criteria.add(ATTACHMENT_MIME_TYPE, obj.getMimeType());
              criteria.add(MODIFIED_BY, obj.getModifiedBy());
              criteria.add(CREATED_BY, obj.getCreatedBy());
              criteria.add(MODIFIED_DATE, obj.getModifiedDate());
              criteria.add(CREATED_DATE, obj.getCreatedDate());
              criteria.add(DELETED, obj.getDeleted());
          return criteria;
    }

    /** Build a Criteria object from the data object for this peer, skipping all binary columns */
    public static Criteria buildSelectCriteria( Attachment obj )
    {
        Criteria criteria = new Criteria(DATABASE_NAME);
              if (!obj.isNew())
        {
                    criteria.add(ATTACHMENT_ID, obj.getAttachmentId());
                }
                          criteria.add(ISSUE_ID, obj.getIssueId());
                              criteria.add(ATTACHMENT_TYPE_ID, obj.getTypeId());
                              criteria.add(ATTACHMENT_NAME, obj.getName());
                              criteria.add(ATTACHMENT_DATA, obj.getData());
                              criteria.add(ATTACHMENT_FILE_PATH, obj.getFileName());
                              criteria.add(ATTACHMENT_MIME_TYPE, obj.getMimeType());
                              criteria.add(MODIFIED_BY, obj.getModifiedBy());
                              criteria.add(CREATED_BY, obj.getCreatedBy());
                              criteria.add(MODIFIED_DATE, obj.getModifiedDate());
                              criteria.add(CREATED_DATE, obj.getCreatedDate());
                              criteria.add(DELETED, obj.getDeleted());
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
    public static Attachment retrieveByPK(Long pk)
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
    public static Attachment retrieveByPK(Long pk, Connection con)
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
    public static Attachment retrieveByPK(ObjectKey pk)
        throws TorqueException, NoRowsException, TooManyRowsException
    {
        Connection db = null;
        Attachment retVal = null;
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
    public static Attachment retrieveByPK(ObjectKey pk, Connection con)
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
            return (Attachment)v.get(0);
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
              criteria.addIn( ATTACHMENT_ID, pks );
          objs = doSelect(criteria, dbcon);
        }
        return objs;
    }

 



                
                                              
                
                

    /**
     * selects a collection of Attachment objects pre-filled with their
     * Issue objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttachmentPeer.
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
     * selects a collection of Attachment objects pre-filled with their
     * Issue objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttachmentPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinIssue(Criteria criteria, Connection conn)
        throws TorqueException
    {
        setDbName(criteria);

        AttachmentPeer.addSelectColumns(criteria);
        int offset = numColumns + 1;
        IssuePeer.addSelectColumns(criteria);


                        criteria.addJoin(AttachmentPeer.ISSUE_ID,
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

                            Class omClass = AttachmentPeer.getOMClass();
                    Attachment obj1 = (Attachment) AttachmentPeer
                .row2Object(row, 1, omClass);
                     omClass = IssuePeer.getOMClass();
                    Issue obj2 = (Issue)IssuePeer
                .row2Object(row, offset, omClass);

            boolean newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Attachment temp_obj1 = (Attachment)results.get(j);
                Issue temp_obj2 = (Issue)temp_obj1.getIssue();
                if (temp_obj2.getPrimaryKey().equals(obj2.getPrimaryKey()))
                {
                    newObject = false;
                              temp_obj2.addAttachment(obj1);
                              break;
                }
            }
                      if (newObject)
            {
                obj2.initAttachments();
                obj2.addAttachment(obj1);
            }
                      results.add(obj1);
        }
        return results;
    }
                                                            
                
                

    /**
     * selects a collection of Attachment objects pre-filled with their
     * AttachmentType objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttachmentPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAttachmentType(Criteria criteria)
        throws TorqueException
    {
        return doSelectJoinAttachmentType(criteria, null);
    }

    /**
     * selects a collection of Attachment objects pre-filled with their
     * AttachmentType objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttachmentPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAttachmentType(Criteria criteria, Connection conn)
        throws TorqueException
    {
        setDbName(criteria);

        AttachmentPeer.addSelectColumns(criteria);
        int offset = numColumns + 1;
        AttachmentTypePeer.addSelectColumns(criteria);


                        criteria.addJoin(AttachmentPeer.ATTACHMENT_TYPE_ID,
            AttachmentTypePeer.ATTACHMENT_TYPE_ID);
        
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

                            Class omClass = AttachmentPeer.getOMClass();
                    Attachment obj1 = (Attachment) AttachmentPeer
                .row2Object(row, 1, omClass);
                     omClass = AttachmentTypePeer.getOMClass();
                    AttachmentType obj2 = (AttachmentType)AttachmentTypePeer
                .row2Object(row, offset, omClass);

            boolean newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Attachment temp_obj1 = (Attachment)results.get(j);
                AttachmentType temp_obj2 = (AttachmentType)temp_obj1.getAttachmentType();
                if (temp_obj2.getPrimaryKey().equals(obj2.getPrimaryKey()))
                {
                    newObject = false;
                              temp_obj2.addAttachment(obj1);
                              break;
                }
            }
                      if (newObject)
            {
                obj2.initAttachments();
                obj2.addAttachment(obj1);
            }
                      results.add(obj1);
        }
        return results;
    }
                                                                      
                        
                

    /**
     * selects a collection of Attachment objects pre-filled with their
     * ScarabUserImpl objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttachmentPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinScarabUserImplRelatedByCreatedBy(Criteria criteria)
        throws TorqueException
    {
        return doSelectJoinScarabUserImplRelatedByCreatedBy(criteria, null);
    }

    /**
     * selects a collection of Attachment objects pre-filled with their
     * ScarabUserImpl objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttachmentPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinScarabUserImplRelatedByCreatedBy(Criteria criteria, Connection conn)
        throws TorqueException
    {
        setDbName(criteria);

        AttachmentPeer.addSelectColumns(criteria);
        int offset = numColumns + 1;
        ScarabUserImplPeer.addSelectColumns(criteria);


                        criteria.addJoin(AttachmentPeer.CREATED_BY,
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

                            Class omClass = AttachmentPeer.getOMClass();
                    Attachment obj1 = (Attachment) AttachmentPeer
                .row2Object(row, 1, omClass);
                     omClass = ScarabUserImplPeer.getOMClass();
                    ScarabUserImpl obj2 = (ScarabUserImpl)ScarabUserImplPeer
                .row2Object(row, offset, omClass);

            boolean newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Attachment temp_obj1 = (Attachment)results.get(j);
                ScarabUserImpl temp_obj2 = (ScarabUserImpl)temp_obj1.getScarabUserRelatedByCreatedBy();
                if (temp_obj2.getPrimaryKey().equals(obj2.getPrimaryKey()))
                {
                    newObject = false;
                              temp_obj2.addAttachmentRelatedByCreatedBy(obj1);
                              break;
                }
            }
                      if (newObject)
            {
                obj2.initAttachmentsRelatedByCreatedBy();
                obj2.addAttachmentRelatedByCreatedBy(obj1);
            }
                      results.add(obj1);
        }
        return results;
    }
                                                                      
                        
                

    /**
     * selects a collection of Attachment objects pre-filled with their
     * ScarabUserImpl objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttachmentPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinScarabUserImplRelatedByModifiedBy(Criteria criteria)
        throws TorqueException
    {
        return doSelectJoinScarabUserImplRelatedByModifiedBy(criteria, null);
    }

    /**
     * selects a collection of Attachment objects pre-filled with their
     * ScarabUserImpl objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttachmentPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinScarabUserImplRelatedByModifiedBy(Criteria criteria, Connection conn)
        throws TorqueException
    {
        setDbName(criteria);

        AttachmentPeer.addSelectColumns(criteria);
        int offset = numColumns + 1;
        ScarabUserImplPeer.addSelectColumns(criteria);


                        criteria.addJoin(AttachmentPeer.MODIFIED_BY,
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

                            Class omClass = AttachmentPeer.getOMClass();
                    Attachment obj1 = (Attachment) AttachmentPeer
                .row2Object(row, 1, omClass);
                     omClass = ScarabUserImplPeer.getOMClass();
                    ScarabUserImpl obj2 = (ScarabUserImpl)ScarabUserImplPeer
                .row2Object(row, offset, omClass);

            boolean newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Attachment temp_obj1 = (Attachment)results.get(j);
                ScarabUserImpl temp_obj2 = (ScarabUserImpl)temp_obj1.getScarabUserRelatedByModifiedBy();
                if (temp_obj2.getPrimaryKey().equals(obj2.getPrimaryKey()))
                {
                    newObject = false;
                              temp_obj2.addAttachmentRelatedByModifiedBy(obj1);
                              break;
                }
            }
                      if (newObject)
            {
                obj2.initAttachmentsRelatedByModifiedBy();
                obj2.addAttachmentRelatedByModifiedBy(obj1);
            }
                      results.add(obj1);
        }
        return results;
    }
                    
  
                                              
          
        
                                  
                
    /**
     * selects a collection of Attachment objects pre-filled with
     * all related objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttachmentPeer.
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
     * selects a collection of Attachment objects pre-filled with
     * all related objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttachmentPeer.
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
                                    
                                                  
                    AttachmentTypePeer.addSelectColumns(criteria);
                                    criteria.addJoin(AttachmentPeer.ATTACHMENT_TYPE_ID, AttachmentTypePeer.ATTACHMENT_TYPE_ID);
                                    int offset3 = offset2 + AttachmentTypePeer.numColumns;
                                                                                
                    ScarabUserImplPeer.addSelectColumns(criteria);
                                    criteria.addJoin(AttachmentPeer.CREATED_BY, ScarabUserImplPeer.USER_ID);
                                    int offset4 = offset3 + ScarabUserImplPeer.numColumns;
                                                                                
                    ScarabUserImplPeer.addSelectColumns(criteria);
                                    criteria.addJoin(AttachmentPeer.MODIFIED_BY, ScarabUserImplPeer.USER_ID);
                                                          
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

                            Class omClass = AttachmentPeer.getOMClass();
                    Attachment obj1 = (Attachment)AttachmentPeer
                .row2Object(row, 1, omClass);
                                                
                                                                  
                                                        
                            
              
                           omClass = AttachmentTypePeer.getOMClass();
                          AttachmentType obj2 = (AttachmentType)AttachmentTypePeer
                .row2Object( row, offset2, omClass);

               boolean  newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Attachment temp_obj1 = (Attachment)results.get(j);
                AttachmentType temp_obj2 = (AttachmentType)temp_obj1.getAttachmentType();
                if (temp_obj2.getPrimaryKey().equals(obj2.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj2.addAttachment(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj2.initAttachments();
                obj2.addAttachment(obj1);
            }
                                                                                                
                                                                        
                            
              
                           omClass = ScarabUserImplPeer.getOMClass();
                          ScarabUserImpl obj3 = (ScarabUserImpl)ScarabUserImplPeer
                .row2Object( row, offset3, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Attachment temp_obj1 = (Attachment)results.get(j);
                ScarabUserImpl temp_obj3 = (ScarabUserImpl)temp_obj1.getScarabUserRelatedByCreatedBy();
                if (temp_obj3.getPrimaryKey().equals(obj3.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj3.addAttachmentRelatedByCreatedBy(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj3.initAttachmentsRelatedByCreatedBy();
                obj3.addAttachmentRelatedByCreatedBy(obj1);
            }
                                                                                                
                                                                        
                            
              
                           omClass = ScarabUserImplPeer.getOMClass();
                          ScarabUserImpl obj4 = (ScarabUserImpl)ScarabUserImplPeer
                .row2Object( row, offset4, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Attachment temp_obj1 = (Attachment)results.get(j);
                ScarabUserImpl temp_obj4 = (ScarabUserImpl)temp_obj1.getScarabUserRelatedByModifiedBy();
                if (temp_obj4.getPrimaryKey().equals(obj4.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj4.addAttachmentRelatedByModifiedBy(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj4.initAttachmentsRelatedByModifiedBy();
                obj4.addAttachmentRelatedByModifiedBy(obj1);
            }
                                                                results.add(obj1);
        }
        return results;
    }
        
        
                                  
                
    /**
     * selects a collection of Attachment objects pre-filled with
     * all related objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttachmentPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAllExceptAttachmentType(Criteria criteria)
        throws TorqueException
    {
        return doSelectJoinAllExceptAttachmentType(criteria, null);
    }

    /**
     * selects a collection of Attachment objects pre-filled with
     * all related objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttachmentPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAllExceptAttachmentType(Criteria criteria, Connection conn)
        throws TorqueException
    {
        setDbName(criteria);

        addSelectColumns(criteria);
        int offset2 = numColumns + 1;
                                    
                    IssuePeer.addSelectColumns(criteria);
                                    criteria.addJoin(AttachmentPeer.ISSUE_ID, IssuePeer.ISSUE_ID);
                                    int offset3 = offset2 + IssuePeer.numColumns;
                                                                                
                                                  
                    ScarabUserImplPeer.addSelectColumns(criteria);
                                    criteria.addJoin(AttachmentPeer.CREATED_BY, ScarabUserImplPeer.USER_ID);
                                    int offset4 = offset3 + ScarabUserImplPeer.numColumns;
                                                                                
                    ScarabUserImplPeer.addSelectColumns(criteria);
                                    criteria.addJoin(AttachmentPeer.MODIFIED_BY, ScarabUserImplPeer.USER_ID);
                                                          
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

                            Class omClass = AttachmentPeer.getOMClass();
                    Attachment obj1 = (Attachment)AttachmentPeer
                .row2Object(row, 1, omClass);
                                                
                                                        
                            
              
                           omClass = IssuePeer.getOMClass();
                          Issue obj2 = (Issue)IssuePeer
                .row2Object( row, offset2, omClass);

               boolean  newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Attachment temp_obj1 = (Attachment)results.get(j);
                Issue temp_obj2 = (Issue)temp_obj1.getIssue();
                if (temp_obj2.getPrimaryKey().equals(obj2.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj2.addAttachment(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj2.initAttachments();
                obj2.addAttachment(obj1);
            }
                                                                                    
                                                                              
                                                                        
                            
              
                           omClass = ScarabUserImplPeer.getOMClass();
                          ScarabUserImpl obj3 = (ScarabUserImpl)ScarabUserImplPeer
                .row2Object( row, offset3, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Attachment temp_obj1 = (Attachment)results.get(j);
                ScarabUserImpl temp_obj3 = (ScarabUserImpl)temp_obj1.getScarabUserRelatedByCreatedBy();
                if (temp_obj3.getPrimaryKey().equals(obj3.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj3.addAttachmentRelatedByCreatedBy(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj3.initAttachmentsRelatedByCreatedBy();
                obj3.addAttachmentRelatedByCreatedBy(obj1);
            }
                                                                                                
                                                                        
                            
              
                           omClass = ScarabUserImplPeer.getOMClass();
                          ScarabUserImpl obj4 = (ScarabUserImpl)ScarabUserImplPeer
                .row2Object( row, offset4, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Attachment temp_obj1 = (Attachment)results.get(j);
                ScarabUserImpl temp_obj4 = (ScarabUserImpl)temp_obj1.getScarabUserRelatedByModifiedBy();
                if (temp_obj4.getPrimaryKey().equals(obj4.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj4.addAttachmentRelatedByModifiedBy(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj4.initAttachmentsRelatedByModifiedBy();
                obj4.addAttachmentRelatedByModifiedBy(obj1);
            }
                                                                results.add(obj1);
        }
        return results;
    }
        
        
                                            
                
    /**
     * selects a collection of Attachment objects pre-filled with
     * all related objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttachmentPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAllExceptScarabUserImplRelatedByCreatedBy(Criteria criteria)
        throws TorqueException
    {
        return doSelectJoinAllExceptScarabUserImplRelatedByCreatedBy(criteria, null);
    }

    /**
     * selects a collection of Attachment objects pre-filled with
     * all related objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttachmentPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAllExceptScarabUserImplRelatedByCreatedBy(Criteria criteria, Connection conn)
        throws TorqueException
    {
        setDbName(criteria);

        addSelectColumns(criteria);
        int offset2 = numColumns + 1;
                                    
                    IssuePeer.addSelectColumns(criteria);
                                    criteria.addJoin(AttachmentPeer.ISSUE_ID, IssuePeer.ISSUE_ID);
                                    int offset3 = offset2 + IssuePeer.numColumns;
                                                                                
                    AttachmentTypePeer.addSelectColumns(criteria);
                                    criteria.addJoin(AttachmentPeer.ATTACHMENT_TYPE_ID, AttachmentTypePeer.ATTACHMENT_TYPE_ID);
                                    int offset4 = offset3 + AttachmentTypePeer.numColumns;
                                                                                
                                                  
                              
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

                            Class omClass = AttachmentPeer.getOMClass();
                    Attachment obj1 = (Attachment)AttachmentPeer
                .row2Object(row, 1, omClass);
                                                
                                                        
                            
              
                           omClass = IssuePeer.getOMClass();
                          Issue obj2 = (Issue)IssuePeer
                .row2Object( row, offset2, omClass);

               boolean  newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Attachment temp_obj1 = (Attachment)results.get(j);
                Issue temp_obj2 = (Issue)temp_obj1.getIssue();
                if (temp_obj2.getPrimaryKey().equals(obj2.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj2.addAttachment(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj2.initAttachments();
                obj2.addAttachment(obj1);
            }
                                                                                    
                                                        
                            
              
                           omClass = AttachmentTypePeer.getOMClass();
                          AttachmentType obj3 = (AttachmentType)AttachmentTypePeer
                .row2Object( row, offset3, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Attachment temp_obj1 = (Attachment)results.get(j);
                AttachmentType temp_obj3 = (AttachmentType)temp_obj1.getAttachmentType();
                if (temp_obj3.getPrimaryKey().equals(obj3.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj3.addAttachment(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj3.initAttachments();
                obj3.addAttachment(obj1);
            }
                                                                                                
                                                                              
                                              results.add(obj1);
        }
        return results;
    }
        
        
                                            
                
    /**
     * selects a collection of Attachment objects pre-filled with
     * all related objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttachmentPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAllExceptScarabUserImplRelatedByModifiedBy(Criteria criteria)
        throws TorqueException
    {
        return doSelectJoinAllExceptScarabUserImplRelatedByModifiedBy(criteria, null);
    }

    /**
     * selects a collection of Attachment objects pre-filled with
     * all related objects.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttachmentPeer.
     *
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */
    protected static List doSelectJoinAllExceptScarabUserImplRelatedByModifiedBy(Criteria criteria, Connection conn)
        throws TorqueException
    {
        setDbName(criteria);

        addSelectColumns(criteria);
        int offset2 = numColumns + 1;
                                    
                    IssuePeer.addSelectColumns(criteria);
                                    criteria.addJoin(AttachmentPeer.ISSUE_ID, IssuePeer.ISSUE_ID);
                                    int offset3 = offset2 + IssuePeer.numColumns;
                                                                                
                    AttachmentTypePeer.addSelectColumns(criteria);
                                    criteria.addJoin(AttachmentPeer.ATTACHMENT_TYPE_ID, AttachmentTypePeer.ATTACHMENT_TYPE_ID);
                                    int offset4 = offset3 + AttachmentTypePeer.numColumns;
                                                                                
                                                  
                              
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

                            Class omClass = AttachmentPeer.getOMClass();
                    Attachment obj1 = (Attachment)AttachmentPeer
                .row2Object(row, 1, omClass);
                                                
                                                        
                            
              
                           omClass = IssuePeer.getOMClass();
                          Issue obj2 = (Issue)IssuePeer
                .row2Object( row, offset2, omClass);

               boolean  newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Attachment temp_obj1 = (Attachment)results.get(j);
                Issue temp_obj2 = (Issue)temp_obj1.getIssue();
                if (temp_obj2.getPrimaryKey().equals(obj2.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj2.addAttachment(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj2.initAttachments();
                obj2.addAttachment(obj1);
            }
                                                                                    
                                                        
                            
              
                           omClass = AttachmentTypePeer.getOMClass();
                          AttachmentType obj3 = (AttachmentType)AttachmentTypePeer
                .row2Object( row, offset3, omClass);

               newObject = true;
            for (int j = 0; j < results.size(); j++)
            {
                Attachment temp_obj1 = (Attachment)results.get(j);
                AttachmentType temp_obj3 = (AttachmentType)temp_obj1.getAttachmentType();
                if (temp_obj3.getPrimaryKey().equals(obj3.getPrimaryKey()))
                {
                    newObject = false;
                                    temp_obj3.addAttachment(obj1);
                                    break;
                }
            }
                            if (newObject)
            {
                obj3.initAttachments();
                obj3.addAttachment(obj1);
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
