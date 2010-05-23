package org.tigris.scarab.om;


import java.math.BigDecimal;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.ObjectUtils;
import org.apache.fulcrum.intake.Retrievable;
import org.apache.torque.TorqueException;
import org.apache.torque.om.BaseObject;
import org.apache.torque.om.ComboKey;
import org.apache.torque.om.DateKey;
import org.apache.torque.om.NumberKey;
import org.apache.torque.om.ObjectKey;
import org.apache.torque.om.SimpleKey;
import org.apache.torque.om.StringKey;
import org.apache.torque.om.Persistent;
import org.apache.torque.util.Criteria;
import org.apache.torque.util.Transaction;





/**
 * You should not use this class directly.  It should not even be
 * extended all references should be to Modification
 */
public abstract class BaseModification extends BaseObject
    implements org.apache.fulcrum.intake.Retrievable
{
    /** The Peer class */
    private static final ModificationPeer peer =
        new ModificationPeer();

        
    /** The value for the tableId field */
    private Integer tableId;
      
    /** The value for the columnId field */
    private Integer columnId;
      
    /** The value for the modifiedBy field */
    private Integer modifiedBy;
      
    /** The value for the createdBy field */
    private Integer createdBy;
      
    /** The value for the modifiedDate field */
    private Date modifiedDate;
      
    /** The value for the createdDate field */
    private Date createdDate;
  
            
    /**
     * Get the TableId
     *
     * @return Integer
     */
    public Integer getTableId()
    {
        return tableId;
    }

                        
    /**
     * Set the value of TableId
     *
     * @param v new value
     */
    public void setTableId(Integer v) 
    {
    
                  if (!ObjectUtils.equals(this.tableId, v))
              {
            this.tableId = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the ColumnId
     *
     * @return Integer
     */
    public Integer getColumnId()
    {
        return columnId;
    }

                        
    /**
     * Set the value of ColumnId
     *
     * @param v new value
     */
    public void setColumnId(Integer v) 
    {
    
                  if (!ObjectUtils.equals(this.columnId, v))
              {
            this.columnId = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the ModifiedBy
     *
     * @return Integer
     */
    public Integer getModifiedBy()
    {
        return modifiedBy;
    }

                        
    /**
     * Set the value of ModifiedBy
     *
     * @param v new value
     */
    public void setModifiedBy(Integer v) 
    {
    
                  if (!ObjectUtils.equals(this.modifiedBy, v))
              {
            this.modifiedBy = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the CreatedBy
     *
     * @return Integer
     */
    public Integer getCreatedBy()
    {
        return createdBy;
    }

                        
    /**
     * Set the value of CreatedBy
     *
     * @param v new value
     */
    public void setCreatedBy(Integer v) 
    {
    
                  if (!ObjectUtils.equals(this.createdBy, v))
              {
            this.createdBy = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the ModifiedDate
     *
     * @return Date
     */
    public Date getModifiedDate()
    {
        return modifiedDate;
    }

                        
    /**
     * Set the value of ModifiedDate
     *
     * @param v new value
     */
    public void setModifiedDate(Date v) 
    {
    
                  if (!ObjectUtils.equals(this.modifiedDate, v))
              {
            this.modifiedDate = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the CreatedDate
     *
     * @return Date
     */
    public Date getCreatedDate()
    {
        return createdDate;
    }

                        
    /**
     * Set the value of CreatedDate
     *
     * @param v new value
     */
    public void setCreatedDate(Date v) 
    {
    
                  if (!ObjectUtils.equals(this.createdDate, v))
              {
            this.createdDate = v;
            setModified(true);
        }
    
          
              }
  
         
                
    private static List fieldNames = null;

    /**
     * Generate a list of field names.
     *
     * @return a list of field names
     */
    public static synchronized List getFieldNames()
    {
        if (fieldNames == null)
        {
            fieldNames = new ArrayList();
              fieldNames.add("TableId");
              fieldNames.add("ColumnId");
              fieldNames.add("ModifiedBy");
              fieldNames.add("CreatedBy");
              fieldNames.add("ModifiedDate");
              fieldNames.add("CreatedDate");
              fieldNames = Collections.unmodifiableList(fieldNames);
        }
        return fieldNames;
    }

    /**
     * Retrieves a field from the object by name passed in as a String.
     *
     * @param name field name
     * @return value
     */
    public Object getByName(String name)
    {
          if (name.equals("TableId"))
        {
                return getTableId();
            }
          if (name.equals("ColumnId"))
        {
                return getColumnId();
            }
          if (name.equals("ModifiedBy"))
        {
                return getModifiedBy();
            }
          if (name.equals("CreatedBy"))
        {
                return getCreatedBy();
            }
          if (name.equals("ModifiedDate"))
        {
                return getModifiedDate();
            }
          if (name.equals("CreatedDate"))
        {
                return getCreatedDate();
            }
          return null;
    }

    /**
     * Retrieves a field from the object by name passed in
     * as a String.  The String must be one of the static
     * Strings defined in this Class' Peer.
     *
     * @param name peer name
     * @return value
     */
    public Object getByPeerName(String name)
    {
          if (name.equals(ModificationPeer.TABLE_ID))
        {
                return getTableId();
            }
          if (name.equals(ModificationPeer.COLUMN_ID))
        {
                return getColumnId();
            }
          if (name.equals(ModificationPeer.MODIFIED_BY))
        {
                return getModifiedBy();
            }
          if (name.equals(ModificationPeer.CREATED_BY))
        {
                return getCreatedBy();
            }
          if (name.equals(ModificationPeer.MODIFIED_DATE))
        {
                return getModifiedDate();
            }
          if (name.equals(ModificationPeer.CREATED_DATE))
        {
                return getCreatedDate();
            }
          return null;
    }

    /**
     * Retrieves a field from the object by Position as specified
     * in the xml schema.  Zero-based.
     *
     * @param pos position in xml schema
     * @return value
     */
    public Object getByPosition(int pos)
    {
            if (pos == 0)
        {
                return getTableId();
            }
              if (pos == 1)
        {
                return getColumnId();
            }
              if (pos == 2)
        {
                return getModifiedBy();
            }
              if (pos == 3)
        {
                return getCreatedBy();
            }
              if (pos == 4)
        {
                return getModifiedDate();
            }
              if (pos == 5)
        {
                return getCreatedDate();
            }
              return null;
    }
     
    /**
     * Stores the object in the database.  If the object is new,
     * it inserts it; otherwise an update is performed.
     *
     * @throws TorqueException
     */
    public void save() throws TorqueException
    {
          save(ModificationPeer.getMapBuilder()
                .getDatabaseMap().getName());
      }

    /**
     * Stores the object in the database.  If the object is new,
     * it inserts it; otherwise an update is performed.
       * Note: this code is here because the method body is
     * auto-generated conditionally and therefore needs to be
     * in this file instead of in the super class, BaseObject.
       *
     * @param dbName
     * @throws TorqueException
     */
    public void save(String dbName) throws TorqueException
    {
        Connection con = null;
          try
        {
            con = Transaction.begin(dbName);
            save(con);
            Transaction.commit(con);
        }
        catch(TorqueException e)
        {
            Transaction.safeRollback(con);
            throw e;
        }
      }

      /** flag to prevent endless save loop, if this object is referenced
        by another object which falls in this transaction. */
    private boolean alreadyInSave = false;
      /**
     * Stores the object in the database.  If the object is new,
     * it inserts it; otherwise an update is performed.  This method
     * is meant to be used as part of a transaction, otherwise use
     * the save() method and the connection details will be handled
     * internally
     *
     * @param con
     * @throws TorqueException
     */
    public void save(Connection con) throws TorqueException
    {
          if (!alreadyInSave)
        {
            alreadyInSave = true;


  
            // If this object has been modified, then save it to the database.
            if (isModified())
            {
                if (isNew())
                {
                    ModificationPeer.doInsert((Modification) this, con);
                    setNew(false);
                }
                else
                {
                    ModificationPeer.doUpdate((Modification) this, con);
                }

    
                      if (isCacheOnSave())
                {
                    ModificationManager.putInstance(this);
                }
              }

                      alreadyInSave = false;
        }
      }

    /**
     * Specify whether to cache the object after saving to the db.
     * This method returns true
     */
    protected boolean isCacheOnSave()
    {
        return true;
    }

                                  
  
    private final SimpleKey[] pks = new SimpleKey[2];
    private final ComboKey comboPK = new ComboKey(pks);

    /**
     * Set the PrimaryKey with an ObjectKey
     *
     * @param key
     */
    public void setPrimaryKey(ObjectKey key) throws TorqueException
    {
        SimpleKey[] keys = (SimpleKey[]) key.getValue();
        SimpleKey tmpKey = null;
                      setTableId(new Integer(((NumberKey)keys[0]).intValue()));
                        setColumnId(new Integer(((NumberKey)keys[1]).intValue()));
              }

    /**
     * Set the PrimaryKey using SimpleKeys.
     *
         * @param tableId Integer
         * @param columnId Integer
         */
    public void setPrimaryKey( Integer tableId, Integer columnId)
        
    {
            setTableId(tableId);
            setColumnId(columnId);
        }

    /**
     * Set the PrimaryKey using a String.
     */
    public void setPrimaryKey(String key) throws TorqueException
    {
        setPrimaryKey(new ComboKey(key));
    }
  
    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
              pks[0] = SimpleKey.keyFor(getTableId());
                  pks[1] = SimpleKey.keyFor(getColumnId());
                  return comboPK;
      }
 
    /**
     * get an id that differentiates this object from others
     * of its class.
     */
    public String getQueryKey()
    {
        if (getPrimaryKey() == null)
        {
            return "";
        }
        else
        {
            return getPrimaryKey().toString();
        }
    }

    /**
     * set an id that differentiates this object from others
     * of its class.
     */
    public void setQueryKey(String key)
        throws TorqueException
    {
              setPrimaryKey(key);
      }

    /**
     * Makes a copy of this object.
     * It creates a new object filling in the simple attributes.
       * It then fills all the association collections and sets the
     * related objects to isNew=true.
       */
      public Modification copy() throws TorqueException
    {
        return copyInto(new Modification());
    }
  
    protected Modification copyInto(Modification copyObj) throws TorqueException
    {
          copyObj.setTableId(tableId);
          copyObj.setColumnId(columnId);
          copyObj.setModifiedBy(modifiedBy);
          copyObj.setCreatedBy(createdBy);
          copyObj.setModifiedDate(modifiedDate);
          copyObj.setCreatedDate(createdDate);
  
                    copyObj.setTableId((Integer)null);
                              copyObj.setColumnId((Integer)null);
                                    
                return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public ModificationPeer getPeer()
    {
        return peer;
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("Modification:\n");
        str.append("TableId = ")
               .append(getTableId())
             .append("\n");
        str.append("ColumnId = ")
               .append(getColumnId())
             .append("\n");
        str.append("ModifiedBy = ")
               .append(getModifiedBy())
             .append("\n");
        str.append("CreatedBy = ")
               .append(getCreatedBy())
             .append("\n");
        str.append("ModifiedDate = ")
               .append(getModifiedDate())
             .append("\n");
        str.append("CreatedDate = ")
               .append(getCreatedDate())
             .append("\n");
        return(str.toString());
    }
}
