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
 * extended all references should be to RQueryUser
 */
public abstract class BaseRQueryUser extends BaseObject
    implements org.apache.fulcrum.intake.Retrievable
{
    /** The Peer class */
    private static final RQueryUserPeer peer =
        new RQueryUserPeer();

        
    /** The value for the queryId field */
    private Long queryId;
      
    /** The value for the userId field */
    private Integer userId;
                                                                
    /** The value for the isSubscribed field */
    private boolean isSubscribed = false;
      
    /** The value for the subscriptionFrequency field */
    private Integer subscriptionFrequency;
                                                                
    /** The value for the isdefault field */
    private boolean isdefault = false;
  
            
    /**
     * Get the QueryId
     *
     * @return Long
     */
    public Long getQueryId()
    {
        return queryId;
    }

                              
    /**
     * Set the value of QueryId
     *
     * @param v new value
     */
    public void setQueryId(Long v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.queryId, v))
              {
            this.queryId = v;
            setModified(true);
        }
    
                                  
                if (aQuery != null && !ObjectUtils.equals(aQuery.getQueryId(), v))
                {
            aQuery = null;
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
     * Get the IsSubscribed
     *
     * @return boolean
     */
    public boolean getIsSubscribed()
    {
        return isSubscribed;
    }

                        
    /**
     * Set the value of IsSubscribed
     *
     * @param v new value
     */
    public void setIsSubscribed(boolean v) 
    {
    
                  if (this.isSubscribed != v)
              {
            this.isSubscribed = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the SubscriptionFrequency
     *
     * @return Integer
     */
    public Integer getSubscriptionFrequency()
    {
        return subscriptionFrequency;
    }

                              
    /**
     * Set the value of SubscriptionFrequency
     *
     * @param v new value
     */
    public void setSubscriptionFrequency(Integer v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.subscriptionFrequency, v))
              {
            this.subscriptionFrequency = v;
            setModified(true);
        }
    
                                  
                if (aFrequency != null && !ObjectUtils.equals(aFrequency.getFrequencyId(), v))
                {
            aFrequency = null;
        }
      
              }
          
    /**
     * Get the Isdefault
     *
     * @return boolean
     */
    public boolean getIsdefault()
    {
        return isdefault;
    }

                        
    /**
     * Set the value of Isdefault
     *
     * @param v new value
     */
    public void setIsdefault(boolean v) 
    {
    
                  if (this.isdefault != v)
              {
            this.isdefault = v;
            setModified(true);
        }
    
          
              }
  
      
        
                  
    
        private Query aQuery;

    /**
     * Declares an association between this object and a Query object
     *
     * @param v Query
     * @throws TorqueException
     */
    public void setQuery(Query v) throws TorqueException
    {
            if (v == null)
        {
                  setQueryId((Long) null);
              }
        else
        {
            setQueryId(v.getQueryId());
        }
            aQuery = v;
    }

                        
    /**
     * Returns the associated Query object.
           * If it was not retrieved before, the object is retrieved from
     * the database
           *
     * @return the associated Query object
           * @throws TorqueException
           */
    public Query getQuery()
              throws TorqueException
          {
              if (aQuery == null && (!ObjectUtils.equals(this.queryId, null)))
        {
                    aQuery = QueryManager.getInstance(SimpleKey.keyFor(this.queryId));
                }
              return aQuery;
    }

    /**
     * Return the associated Query object
     * If it was not retrieved before, the object is retrieved from
     * the database using the passed connection
     *
     * @param connection the connection used to retrieve the associated object
     *        from the database, if it was not retrieved before
     * @return the associated Query object
     * @throws TorqueException
     */
    public Query getQuery(Connection connection)
        throws TorqueException
    {
        if (aQuery == null && (!ObjectUtils.equals(this.queryId, null)))
        {
                    aQuery = QueryManager.getCachedInstance(SimpleKey.keyFor(this.queryId));
            if (aQuery == null)
            {
                          aQuery = QueryPeer.retrieveByPK(SimpleKey.keyFor(this.queryId), connection);
                          QueryManager.putInstance(aQuery);
            }
                }
        return aQuery;
    }
    
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setQueryKey(ObjectKey key) throws TorqueException
    {
    
                    setQueryId(new Long(((NumberKey) key).longValue()));
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
  
        
                  
    
        private Frequency aFrequency;

    /**
     * Declares an association between this object and a Frequency object
     *
     * @param v Frequency
     * @throws TorqueException
     */
    public void setFrequency(Frequency v) throws TorqueException
    {
            if (v == null)
        {
                  setSubscriptionFrequency((Integer) null);
              }
        else
        {
            setSubscriptionFrequency(v.getFrequencyId());
        }
            aFrequency = v;
    }

                        
    /**
     * Returns the associated Frequency object.
           * If it was not retrieved before, the object is retrieved from
     * the database
           *
     * @return the associated Frequency object
           * @throws TorqueException
           */
    public Frequency getFrequency()
              throws TorqueException
          {
              if (aFrequency == null && (!ObjectUtils.equals(this.subscriptionFrequency, null)))
        {
                    aFrequency = FrequencyManager.getInstance(SimpleKey.keyFor(this.subscriptionFrequency));
                }
              return aFrequency;
    }

    /**
     * Return the associated Frequency object
     * If it was not retrieved before, the object is retrieved from
     * the database using the passed connection
     *
     * @param connection the connection used to retrieve the associated object
     *        from the database, if it was not retrieved before
     * @return the associated Frequency object
     * @throws TorqueException
     */
    public Frequency getFrequency(Connection connection)
        throws TorqueException
    {
        if (aFrequency == null && (!ObjectUtils.equals(this.subscriptionFrequency, null)))
        {
                    aFrequency = FrequencyManager.getCachedInstance(SimpleKey.keyFor(this.subscriptionFrequency));
            if (aFrequency == null)
            {
                          aFrequency = FrequencyPeer.retrieveByPK(SimpleKey.keyFor(this.subscriptionFrequency), connection);
                          FrequencyManager.putInstance(aFrequency);
            }
                }
        return aFrequency;
    }
    
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setFrequencyKey(ObjectKey key) throws TorqueException
    {
    
                    setSubscriptionFrequency(new Integer(((NumberKey) key).intValue()));
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
              fieldNames.add("QueryId");
              fieldNames.add("UserId");
              fieldNames.add("IsSubscribed");
              fieldNames.add("SubscriptionFrequency");
              fieldNames.add("Isdefault");
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
          if (name.equals("QueryId"))
        {
                return getQueryId();
            }
          if (name.equals("UserId"))
        {
                return getUserId();
            }
          if (name.equals("IsSubscribed"))
        {
                return Boolean.valueOf(getIsSubscribed());
            }
          if (name.equals("SubscriptionFrequency"))
        {
                return getSubscriptionFrequency();
            }
          if (name.equals("Isdefault"))
        {
                return Boolean.valueOf(getIsdefault());
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
          if (name.equals(RQueryUserPeer.QUERY_ID))
        {
                return getQueryId();
            }
          if (name.equals(RQueryUserPeer.USER_ID))
        {
                return getUserId();
            }
          if (name.equals(RQueryUserPeer.IS_SUBSCRIBED))
        {
                return Boolean.valueOf(getIsSubscribed());
            }
          if (name.equals(RQueryUserPeer.SUBSCRIPTION_FREQUENCY_ID))
        {
                return getSubscriptionFrequency();
            }
          if (name.equals(RQueryUserPeer.ISDEFAULT))
        {
                return Boolean.valueOf(getIsdefault());
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
                return getQueryId();
            }
              if (pos == 1)
        {
                return getUserId();
            }
              if (pos == 2)
        {
                return Boolean.valueOf(getIsSubscribed());
            }
              if (pos == 3)
        {
                return getSubscriptionFrequency();
            }
              if (pos == 4)
        {
                return Boolean.valueOf(getIsdefault());
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
          save(RQueryUserPeer.getMapBuilder()
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
                    RQueryUserPeer.doInsert((RQueryUser) this, con);
                    setNew(false);
                }
                else
                {
                    RQueryUserPeer.doUpdate((RQueryUser) this, con);
                }

    
                      if (isCacheOnSave())
                {
                    RQueryUserManager.putInstance(this);
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
                      setQueryId(new Long(((NumberKey)keys[0]).longValue()));
                        setUserId(new Integer(((NumberKey)keys[1]).intValue()));
              }

    /**
     * Set the PrimaryKey using SimpleKeys.
     *
         * @param queryId Long
         * @param userId Integer
         */
    public void setPrimaryKey( Long queryId, Integer userId)
        throws TorqueException
    {
            setQueryId(queryId);
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
              pks[0] = SimpleKey.keyFor(getQueryId());
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
      public RQueryUser copy() throws TorqueException
    {
        return copyInto(new RQueryUser());
    }
  
    protected RQueryUser copyInto(RQueryUser copyObj) throws TorqueException
    {
          copyObj.setQueryId(queryId);
          copyObj.setUserId(userId);
          copyObj.setIsSubscribed(isSubscribed);
          copyObj.setSubscriptionFrequency(subscriptionFrequency);
          copyObj.setIsdefault(isdefault);
  
                    copyObj.setQueryId((Long)null);
                              copyObj.setUserId((Integer)null);
                              
                return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public RQueryUserPeer getPeer()
    {
        return peer;
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("RQueryUser:\n");
        str.append("QueryId = ")
               .append(getQueryId())
             .append("\n");
        str.append("UserId = ")
               .append(getUserId())
             .append("\n");
        str.append("IsSubscribed = ")
               .append(getIsSubscribed())
             .append("\n");
        str.append("SubscriptionFrequency = ")
               .append(getSubscriptionFrequency())
             .append("\n");
        str.append("Isdefault = ")
               .append(getIsdefault())
             .append("\n");
        return(str.toString());
    }
}
