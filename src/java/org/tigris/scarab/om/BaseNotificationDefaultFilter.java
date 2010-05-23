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
 * extended all references should be to NotificationDefaultFilter
 */
public abstract class BaseNotificationDefaultFilter extends BaseObject
    implements org.apache.fulcrum.intake.Retrievable
{
    /** The Peer class */
    private static final NotificationDefaultFilterPeer peer =
        new NotificationDefaultFilterPeer();

        
    /** The value for the moduleId field */
    private Integer moduleId;
      
    /** The value for the roleId field */
    private Integer roleId;
      
    /** The value for the activityType field */
    private String activityType;
                                                  
    /** The value for the managerId field */
    private Integer managerId = new Integer(0);
                                                                
    /** The value for the filterState field */
    private boolean filterState = false;
                                                                
    /** The value for the modifyable field */
    private boolean modifyable = true;
  
            
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
     * Get the RoleId
     *
     * @return Integer
     */
    public Integer getRoleId()
    {
        return roleId;
    }

                              
    /**
     * Set the value of RoleId
     *
     * @param v new value
     */
    public void setRoleId(Integer v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.roleId, v))
              {
            this.roleId = v;
            setModified(true);
        }
    
                                  
                if (aScarabRoleImpl != null && !ObjectUtils.equals(aScarabRoleImpl.getRoleId(), v))
                {
            aScarabRoleImpl = null;
        }
      
              }
          
    /**
     * Get the ActivityType
     *
     * @return String
     */
    public String getActivityType()
    {
        return activityType;
    }

                        
    /**
     * Set the value of ActivityType
     *
     * @param v new value
     */
    public void setActivityType(String v) 
    {
    
                  if (!ObjectUtils.equals(this.activityType, v))
              {
            this.activityType = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the ManagerId
     *
     * @return Integer
     */
    public Integer getManagerId()
    {
        return managerId;
    }

                        
    /**
     * Set the value of ManagerId
     *
     * @param v new value
     */
    public void setManagerId(Integer v) 
    {
    
                  if (!ObjectUtils.equals(this.managerId, v))
              {
            this.managerId = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the FilterState
     *
     * @return boolean
     */
    public boolean getFilterState()
    {
        return filterState;
    }

                        
    /**
     * Set the value of FilterState
     *
     * @param v new value
     */
    public void setFilterState(boolean v) 
    {
    
                  if (this.filterState != v)
              {
            this.filterState = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the Modifyable
     *
     * @return boolean
     */
    public boolean getModifyable()
    {
        return modifyable;
    }

                        
    /**
     * Set the value of Modifyable
     *
     * @param v new value
     */
    public void setModifyable(boolean v) 
    {
    
                  if (this.modifyable != v)
              {
            this.modifyable = v;
            setModified(true);
        }
    
          
              }
  
      
        
                  
    
        private ScarabRoleImpl aScarabRoleImpl;

    /**
     * Declares an association between this object and a ScarabRoleImpl object
     *
     * @param v ScarabRoleImpl
     * @throws TorqueException
     */
    public void setScarabRoleImpl(ScarabRoleImpl v) throws TorqueException
    {
            if (v == null)
        {
                  setRoleId((Integer) null);
              }
        else
        {
            setRoleId(v.getRoleId());
        }
            aScarabRoleImpl = v;
    }

                        
    /**
     * Returns the associated ScarabRoleImpl object.
           * If it was not retrieved before, the object is retrieved from
     * the database
           *
     * @return the associated ScarabRoleImpl object
           * @throws TorqueException
           */
    public ScarabRoleImpl getScarabRoleImpl()
              throws TorqueException
          {
              if (aScarabRoleImpl == null && (!ObjectUtils.equals(this.roleId, null)))
        {
                    aScarabRoleImpl = ScarabRoleImplManager.getInstance(SimpleKey.keyFor(this.roleId));
                }
              return aScarabRoleImpl;
    }

    /**
     * Return the associated ScarabRoleImpl object
     * If it was not retrieved before, the object is retrieved from
     * the database using the passed connection
     *
     * @param connection the connection used to retrieve the associated object
     *        from the database, if it was not retrieved before
     * @return the associated ScarabRoleImpl object
     * @throws TorqueException
     */
    public ScarabRoleImpl getScarabRoleImpl(Connection connection)
        throws TorqueException
    {
        if (aScarabRoleImpl == null && (!ObjectUtils.equals(this.roleId, null)))
        {
                    aScarabRoleImpl = ScarabRoleImplManager.getCachedInstance(SimpleKey.keyFor(this.roleId));
            if (aScarabRoleImpl == null)
            {
                          aScarabRoleImpl = ScarabRoleImplPeer.retrieveScarabRoleImplByPK(SimpleKey.keyFor(this.roleId), connection);
                          ScarabRoleImplManager.putInstance(aScarabRoleImpl);
            }
                }
        return aScarabRoleImpl;
    }
    
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setScarabRoleImplKey(ObjectKey key) throws TorqueException
    {
    
                    setRoleId(new Integer(((NumberKey) key).intValue()));
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
              fieldNames.add("ModuleId");
              fieldNames.add("RoleId");
              fieldNames.add("ActivityType");
              fieldNames.add("ManagerId");
              fieldNames.add("FilterState");
              fieldNames.add("Modifyable");
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
          if (name.equals("ModuleId"))
        {
                return getModuleId();
            }
          if (name.equals("RoleId"))
        {
                return getRoleId();
            }
          if (name.equals("ActivityType"))
        {
                return getActivityType();
            }
          if (name.equals("ManagerId"))
        {
                return getManagerId();
            }
          if (name.equals("FilterState"))
        {
                return Boolean.valueOf(getFilterState());
            }
          if (name.equals("Modifyable"))
        {
                return Boolean.valueOf(getModifyable());
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
          if (name.equals(NotificationDefaultFilterPeer.MODULE_ID))
        {
                return getModuleId();
            }
          if (name.equals(NotificationDefaultFilterPeer.ROLE_ID))
        {
                return getRoleId();
            }
          if (name.equals(NotificationDefaultFilterPeer.ACTIVITY_TYPE))
        {
                return getActivityType();
            }
          if (name.equals(NotificationDefaultFilterPeer.MANAGER_ID))
        {
                return getManagerId();
            }
          if (name.equals(NotificationDefaultFilterPeer.FILTER_STATE))
        {
                return Boolean.valueOf(getFilterState());
            }
          if (name.equals(NotificationDefaultFilterPeer.MODIFYABLE))
        {
                return Boolean.valueOf(getModifyable());
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
                return getModuleId();
            }
              if (pos == 1)
        {
                return getRoleId();
            }
              if (pos == 2)
        {
                return getActivityType();
            }
              if (pos == 3)
        {
                return getManagerId();
            }
              if (pos == 4)
        {
                return Boolean.valueOf(getFilterState());
            }
              if (pos == 5)
        {
                return Boolean.valueOf(getModifyable());
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
          save(NotificationDefaultFilterPeer.getMapBuilder()
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
                    NotificationDefaultFilterPeer.doInsert((NotificationDefaultFilter) this, con);
                    setNew(false);
                }
                else
                {
                    NotificationDefaultFilterPeer.doUpdate((NotificationDefaultFilter) this, con);
                }

    
                      if (isCacheOnSave())
                {
                    NotificationDefaultFilterManager.putInstance(this);
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

                                                                              
  
    private final SimpleKey[] pks = new SimpleKey[4];
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
                      setModuleId(new Integer(((NumberKey)keys[0]).intValue()));
                        setRoleId(new Integer(((NumberKey)keys[1]).intValue()));
                        setActivityType(keys[2].toString());
                        setManagerId(new Integer(((NumberKey)keys[3]).intValue()));
              }

    /**
     * Set the PrimaryKey using SimpleKeys.
     *
         * @param moduleId Integer
         * @param roleId Integer
         * @param activityType String
         * @param managerId Integer
         */
    public void setPrimaryKey( Integer moduleId, Integer roleId, String activityType, Integer managerId)
        throws TorqueException
    {
            setModuleId(moduleId);
            setRoleId(roleId);
            setActivityType(activityType);
            setManagerId(managerId);
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
              pks[0] = SimpleKey.keyFor(getModuleId());
                  pks[1] = SimpleKey.keyFor(getRoleId());
                  pks[2] = SimpleKey.keyFor(getActivityType());
                  pks[3] = SimpleKey.keyFor(getManagerId());
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
      public NotificationDefaultFilter copy() throws TorqueException
    {
        return copyInto(new NotificationDefaultFilter());
    }
  
    protected NotificationDefaultFilter copyInto(NotificationDefaultFilter copyObj) throws TorqueException
    {
          copyObj.setModuleId(moduleId);
          copyObj.setRoleId(roleId);
          copyObj.setActivityType(activityType);
          copyObj.setManagerId(managerId);
          copyObj.setFilterState(filterState);
          copyObj.setModifyable(modifyable);
  
                    copyObj.setModuleId((Integer)null);
                              copyObj.setRoleId((Integer)null);
                              copyObj.setActivityType((String)null);
                              copyObj.setManagerId((Integer)null);
                        
                return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public NotificationDefaultFilterPeer getPeer()
    {
        return peer;
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("NotificationDefaultFilter:\n");
        str.append("ModuleId = ")
               .append(getModuleId())
             .append("\n");
        str.append("RoleId = ")
               .append(getRoleId())
             .append("\n");
        str.append("ActivityType = ")
               .append(getActivityType())
             .append("\n");
        str.append("ManagerId = ")
               .append(getManagerId())
             .append("\n");
        str.append("FilterState = ")
               .append(getFilterState())
             .append("\n");
        str.append("Modifyable = ")
               .append(getModifyable())
             .append("\n");
        return(str.toString());
    }
}
