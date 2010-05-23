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
 * extended all references should be to MITListItem
 */
public abstract class BaseMITListItem extends BaseObject
    implements org.apache.fulcrum.intake.Retrievable
{
    /** The Peer class */
    private static final MITListItemPeer peer =
        new MITListItemPeer();

        
    /** The value for the itemId field */
    private Long itemId;
      
    /** The value for the moduleId field */
    private Integer moduleId;
      
    /** The value for the issueTypeId field */
    private Integer issueTypeId;
      
    /** The value for the listId field */
    private Long listId;
  
            
    /**
     * Get the ItemId
     *
     * @return Long
     */
    public Long getItemId()
    {
        return itemId;
    }

                        
    /**
     * Set the value of ItemId
     *
     * @param v new value
     */
    public void setItemId(Long v) 
    {
    
                  if (!ObjectUtils.equals(this.itemId, v))
              {
            this.itemId = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the ModuleId
     *
     * @return Integer
     */
    public Integer getModuleId()
    {
        return moduleId;
    }

                              
    /**
     * Set the value of ModuleId
     *
     * @param v new value
     */
    public void setModuleId(Integer v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.moduleId, v))
              {
            this.moduleId = v;
            setModified(true);
        }
    
                                          
                if (aModule != null && !ObjectUtils.equals(aModule.getModuleId(), v))
                {
            aModule = null;
        }
      
              }
          
    /**
     * Get the IssueTypeId
     *
     * @return Integer
     */
    public Integer getIssueTypeId()
    {
        return issueTypeId;
    }

                              
    /**
     * Set the value of IssueTypeId
     *
     * @param v new value
     */
    public void setIssueTypeId(Integer v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.issueTypeId, v))
              {
            this.issueTypeId = v;
            setModified(true);
        }
    
                                  
                if (aIssueType != null && !ObjectUtils.equals(aIssueType.getIssueTypeId(), v))
                {
            aIssueType = null;
        }
      
              }
          
    /**
     * Get the ListId
     *
     * @return Long
     */
    public Long getListId()
    {
        return listId;
    }

                              
    /**
     * Set the value of ListId
     *
     * @param v new value
     */
    public void setListId(Long v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.listId, v))
              {
            this.listId = v;
            setModified(true);
        }
    
                                  
                if (aMITList != null && !ObjectUtils.equals(aMITList.getListId(), v))
                {
            aMITList = null;
        }
      
              }
  
      
        
                  
    
        private MITList aMITList;

    /**
     * Declares an association between this object and a MITList object
     *
     * @param v MITList
     * @throws TorqueException
     */
    public void setMITList(MITList v) throws TorqueException
    {
            if (v == null)
        {
                  setListId((Long) null);
              }
        else
        {
            setListId(v.getListId());
        }
            aMITList = v;
    }

                        
    /**
     * Returns the associated MITList object.
           * If it was not retrieved before, the object is retrieved from
     * the database
           *
     * @return the associated MITList object
           * @throws TorqueException
           */
    public MITList getMITList()
              throws TorqueException
          {
              if (aMITList == null && (!ObjectUtils.equals(this.listId, null)))
        {
                    aMITList = MITListManager.getInstance(SimpleKey.keyFor(this.listId));
                }
              return aMITList;
    }

    /**
     * Return the associated MITList object
     * If it was not retrieved before, the object is retrieved from
     * the database using the passed connection
     *
     * @param connection the connection used to retrieve the associated object
     *        from the database, if it was not retrieved before
     * @return the associated MITList object
     * @throws TorqueException
     */
    public MITList getMITList(Connection connection)
        throws TorqueException
    {
        if (aMITList == null && (!ObjectUtils.equals(this.listId, null)))
        {
                    aMITList = MITListManager.getCachedInstance(SimpleKey.keyFor(this.listId));
            if (aMITList == null)
            {
                          aMITList = MITListPeer.retrieveByPK(SimpleKey.keyFor(this.listId), connection);
                          MITListManager.putInstance(aMITList);
            }
                }
        return aMITList;
    }
    
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setMITListKey(ObjectKey key) throws TorqueException
    {
    
                    setListId(new Long(((NumberKey) key).longValue()));
              }
  
            
                  
    
        private Module aModule;

    /**
     * Declares an association between this object and a Module object
     *
     * @param v Module
     * @throws TorqueException
     */
    public void setModule(Module v) throws TorqueException
    {
            if (v == null)
        {
                  setModuleId((Integer) null);
              }
        else
        {
            setModuleId(v.getModuleId());
        }
            aModule = v;
    }

                        
    /**
     * Returns the associated Module object.
           * If it was not retrieved before, the object is retrieved from
     * the database
           *
     * @return the associated Module object
           * @throws TorqueException
           */
    public Module getModule()
              throws TorqueException
          {
              if (aModule == null && (!ObjectUtils.equals(this.moduleId, null)))
        {
                    aModule = ModuleManager.getInstance(SimpleKey.keyFor(this.moduleId));
                }
              return aModule;
    }

    /**
     * Return the associated Module object
     * If it was not retrieved before, the object is retrieved from
     * the database using the passed connection
     *
     * @param connection the connection used to retrieve the associated object
     *        from the database, if it was not retrieved before
     * @return the associated Module object
     * @throws TorqueException
     */
    public Module getModule(Connection connection)
        throws TorqueException
    {
        if (aModule == null && (!ObjectUtils.equals(this.moduleId, null)))
        {
                    aModule = ModuleManager.getCachedInstance(SimpleKey.keyFor(this.moduleId));
            if (aModule == null)
            {
                          aModule = ScarabModulePeer.retrieveByPK(SimpleKey.keyFor(this.moduleId), connection);
                          ModuleManager.putInstance(aModule);
            }
                }
        return aModule;
    }
    
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setModuleKey(ObjectKey key) throws TorqueException
    {
    
                    setModuleId(new Integer(((NumberKey) key).intValue()));
              }
  
        
                  
    
        private IssueType aIssueType;

    /**
     * Declares an association between this object and a IssueType object
     *
     * @param v IssueType
     * @throws TorqueException
     */
    public void setIssueType(IssueType v) throws TorqueException
    {
            if (v == null)
        {
                  setIssueTypeId((Integer) null);
              }
        else
        {
            setIssueTypeId(v.getIssueTypeId());
        }
            aIssueType = v;
    }

                        
    /**
     * Returns the associated IssueType object.
           * If it was not retrieved before, the object is retrieved from
     * the database
           *
     * @return the associated IssueType object
           * @throws TorqueException
           */
    public IssueType getIssueType()
              throws TorqueException
          {
              if (aIssueType == null && (!ObjectUtils.equals(this.issueTypeId, null)))
        {
                    aIssueType = IssueTypeManager.getInstance(SimpleKey.keyFor(this.issueTypeId));
                }
              return aIssueType;
    }

    /**
     * Return the associated IssueType object
     * If it was not retrieved before, the object is retrieved from
     * the database using the passed connection
     *
     * @param connection the connection used to retrieve the associated object
     *        from the database, if it was not retrieved before
     * @return the associated IssueType object
     * @throws TorqueException
     */
    public IssueType getIssueType(Connection connection)
        throws TorqueException
    {
        if (aIssueType == null && (!ObjectUtils.equals(this.issueTypeId, null)))
        {
                    aIssueType = IssueTypeManager.getCachedInstance(SimpleKey.keyFor(this.issueTypeId));
            if (aIssueType == null)
            {
                          aIssueType = IssueTypePeer.retrieveByPK(SimpleKey.keyFor(this.issueTypeId), connection);
                          IssueTypeManager.putInstance(aIssueType);
            }
                }
        return aIssueType;
    }
    
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setIssueTypeKey(ObjectKey key) throws TorqueException
    {
    
                    setIssueTypeId(new Integer(((NumberKey) key).intValue()));
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
              fieldNames.add("ItemId");
              fieldNames.add("ModuleId");
              fieldNames.add("IssueTypeId");
              fieldNames.add("ListId");
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
          if (name.equals("ItemId"))
        {
                return getItemId();
            }
          if (name.equals("ModuleId"))
        {
                return getModuleId();
            }
          if (name.equals("IssueTypeId"))
        {
                return getIssueTypeId();
            }
          if (name.equals("ListId"))
        {
                return getListId();
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
          if (name.equals(MITListItemPeer.ITEM_ID))
        {
                return getItemId();
            }
          if (name.equals(MITListItemPeer.MODULE_ID))
        {
                return getModuleId();
            }
          if (name.equals(MITListItemPeer.ISSUE_TYPE_ID))
        {
                return getIssueTypeId();
            }
          if (name.equals(MITListItemPeer.LIST_ID))
        {
                return getListId();
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
                return getItemId();
            }
              if (pos == 1)
        {
                return getModuleId();
            }
              if (pos == 2)
        {
                return getIssueTypeId();
            }
              if (pos == 3)
        {
                return getListId();
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
          save(MITListItemPeer.getMapBuilder()
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
                    MITListItemPeer.doInsert((MITListItem) this, con);
                    setNew(false);
                }
                else
                {
                    MITListItemPeer.doUpdate((MITListItem) this, con);
                }

    
                      if (isCacheOnSave())
                {
                    MITListItemManager.putInstance(this);
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

                  
      /**
     * Set the PrimaryKey using ObjectKey.
     *
     * @param key itemId ObjectKey
     */
    public void setPrimaryKey(ObjectKey key)
        
    {
            setItemId(new Long(((NumberKey) key).longValue()));
        }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) 
    {
            setItemId(new Long(key));
        }

  
    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
          return SimpleKey.keyFor(getItemId());
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
      public MITListItem copy() throws TorqueException
    {
        return copyInto(new MITListItem());
    }
  
    protected MITListItem copyInto(MITListItem copyObj) throws TorqueException
    {
          copyObj.setItemId(itemId);
          copyObj.setModuleId(moduleId);
          copyObj.setIssueTypeId(issueTypeId);
          copyObj.setListId(listId);
  
                    copyObj.setItemId((Long)null);
                              
                return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public MITListItemPeer getPeer()
    {
        return peer;
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("MITListItem:\n");
        str.append("ItemId = ")
               .append(getItemId())
             .append("\n");
        str.append("ModuleId = ")
               .append(getModuleId())
             .append("\n");
        str.append("IssueTypeId = ")
               .append(getIssueTypeId())
             .append("\n");
        str.append("ListId = ")
               .append(getListId())
             .append("\n");
        return(str.toString());
    }
}
