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
 * extended all references should be to UserVote
 */
public abstract class BaseUserVote extends BaseObject
    implements org.apache.fulcrum.intake.Retrievable
{
    /** The Peer class */
    private static final UserVotePeer peer =
        new UserVotePeer();

        
    /** The value for the moduleId field */
    private Integer moduleId;
      
    /** The value for the userId field */
    private Integer userId;
                                          
    /** The value for the totalVotes field */
    private int totalVotes = 0;
                                          
    /** The value for the usedVotes field */
    private int usedVotes = 0;
  
            
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
     * Get the UserId
     *
     * @return Integer
     */
    public Integer getUserId()
    {
        return userId;
    }

                              
    /**
     * Set the value of UserId
     *
     * @param v new value
     */
    public void setUserId(Integer v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.userId, v))
              {
            this.userId = v;
            setModified(true);
        }
    
                                          
                if (aScarabUser != null && !ObjectUtils.equals(aScarabUser.getUserId(), v))
                {
            aScarabUser = null;
        }
      
              }
          
    /**
     * Get the TotalVotes
     *
     * @return int
     */
    public int getTotalVotes()
    {
        return totalVotes;
    }

                        
    /**
     * Set the value of TotalVotes
     *
     * @param v new value
     */
    public void setTotalVotes(int v) 
    {
    
                  if (this.totalVotes != v)
              {
            this.totalVotes = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the UsedVotes
     *
     * @return int
     */
    public int getUsedVotes()
    {
        return usedVotes;
    }

                        
    /**
     * Set the value of UsedVotes
     *
     * @param v new value
     */
    public void setUsedVotes(int v) 
    {
    
                  if (this.usedVotes != v)
              {
            this.usedVotes = v;
            setModified(true);
        }
    
          
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
  
            
                  
    
        private ScarabUser aScarabUser;

    /**
     * Declares an association between this object and a ScarabUser object
     *
     * @param v ScarabUser
     * @throws TorqueException
     */
    public void setScarabUser(ScarabUser v) throws TorqueException
    {
            if (v == null)
        {
                  setUserId((Integer) null);
              }
        else
        {
            setUserId(v.getUserId());
        }
            aScarabUser = v;
    }

                        
    /**
     * Returns the associated ScarabUser object.
           * If it was not retrieved before, the object is retrieved from
     * the database
           *
     * @return the associated ScarabUser object
           * @throws TorqueException
           */
    public ScarabUser getScarabUser()
              throws TorqueException
          {
              if (aScarabUser == null && (!ObjectUtils.equals(this.userId, null)))
        {
                    aScarabUser = ScarabUserManager.getInstance(SimpleKey.keyFor(this.userId));
                }
              return aScarabUser;
    }

    /**
     * Return the associated ScarabUser object
     * If it was not retrieved before, the object is retrieved from
     * the database using the passed connection
     *
     * @param connection the connection used to retrieve the associated object
     *        from the database, if it was not retrieved before
     * @return the associated ScarabUser object
     * @throws TorqueException
     */
    public ScarabUser getScarabUser(Connection connection)
        throws TorqueException
    {
        if (aScarabUser == null && (!ObjectUtils.equals(this.userId, null)))
        {
                    aScarabUser = ScarabUserManager.getCachedInstance(SimpleKey.keyFor(this.userId));
            if (aScarabUser == null)
            {
                          aScarabUser = ScarabUserImplPeer.retrieveScarabUserImplByPK(SimpleKey.keyFor(this.userId), connection);
                          ScarabUserManager.putInstance(aScarabUser);
            }
                }
        return aScarabUser;
    }
    
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setScarabUserKey(ObjectKey key) throws TorqueException
    {
    
                    setUserId(new Integer(((NumberKey) key).intValue()));
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
              fieldNames.add("UserId");
              fieldNames.add("TotalVotes");
              fieldNames.add("UsedVotes");
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
          if (name.equals("UserId"))
        {
                return getUserId();
            }
          if (name.equals("TotalVotes"))
        {
                return new Integer(getTotalVotes());
            }
          if (name.equals("UsedVotes"))
        {
                return new Integer(getUsedVotes());
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
          if (name.equals(UserVotePeer.MODULE_ID))
        {
                return getModuleId();
            }
          if (name.equals(UserVotePeer.USER_ID))
        {
                return getUserId();
            }
          if (name.equals(UserVotePeer.TOTAL_VOTES))
        {
                return new Integer(getTotalVotes());
            }
          if (name.equals(UserVotePeer.USED_VOTES))
        {
                return new Integer(getUsedVotes());
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
                return getUserId();
            }
              if (pos == 2)
        {
                return new Integer(getTotalVotes());
            }
              if (pos == 3)
        {
                return new Integer(getUsedVotes());
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
          save(UserVotePeer.getMapBuilder()
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
                    UserVotePeer.doInsert((UserVote) this, con);
                    setNew(false);
                }
                else
                {
                    UserVotePeer.doUpdate((UserVote) this, con);
                }

    
                      if (isCacheOnSave())
                {
                    UserVoteManager.putInstance(this);
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
                      setModuleId(new Integer(((NumberKey)keys[0]).intValue()));
                        setUserId(new Integer(((NumberKey)keys[1]).intValue()));
              }

    /**
     * Set the PrimaryKey using SimpleKeys.
     *
         * @param moduleId Integer
         * @param userId Integer
         */
    public void setPrimaryKey( Integer moduleId, Integer userId)
        throws TorqueException
    {
            setModuleId(moduleId);
            setUserId(userId);
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
                  pks[1] = SimpleKey.keyFor(getUserId());
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
      public UserVote copy() throws TorqueException
    {
        return copyInto(new UserVote());
    }
  
    protected UserVote copyInto(UserVote copyObj) throws TorqueException
    {
          copyObj.setModuleId(moduleId);
          copyObj.setUserId(userId);
          copyObj.setTotalVotes(totalVotes);
          copyObj.setUsedVotes(usedVotes);
  
                    copyObj.setModuleId((Integer)null);
                              copyObj.setUserId((Integer)null);
                        
                return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public UserVotePeer getPeer()
    {
        return peer;
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("UserVote:\n");
        str.append("ModuleId = ")
               .append(getModuleId())
             .append("\n");
        str.append("UserId = ")
               .append(getUserId())
             .append("\n");
        str.append("TotalVotes = ")
               .append(getTotalVotes())
             .append("\n");
        str.append("UsedVotes = ")
               .append(getUsedVotes())
             .append("\n");
        return(str.toString());
    }
}
