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
 * extended all references should be to NotificationStatus
 */
public abstract class BaseNotificationStatus extends BaseObject
    implements org.apache.fulcrum.intake.Retrievable
{
    /** The Peer class */
    private static final NotificationStatusPeer peer =
        new NotificationStatusPeer();

        
    /** The value for the activityId field */
    private Long activityId;
      
    /** The value for the creatorId field */
    private Integer creatorId;
      
    /** The value for the receiverId field */
    private Integer receiverId;
      
    /** The value for the status field */
    private Integer status;
      
    /** The value for the creationDate field */
    private Date creationDate;
      
    /** The value for the changeDate field */
    private Date changeDate;
      
    /** The value for the comment field */
    private String comment;
  
            
    /**
     * Get the ActivityId
     *
     * @return Long
     */
    public Long getActivityId()
    {
        return activityId;
    }

                              
    /**
     * Set the value of ActivityId
     *
     * @param v new value
     */
    public void setActivityId(Long v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.activityId, v))
              {
            this.activityId = v;
            setModified(true);
        }
    
                                  
                if (aActivity != null && !ObjectUtils.equals(aActivity.getActivityId(), v))
                {
            aActivity = null;
        }
      
              }
          
    /**
     * Get the CreatorId
     *
     * @return Integer
     */
    public Integer getCreatorId()
    {
        return creatorId;
    }

                              
    /**
     * Set the value of CreatorId
     *
     * @param v new value
     */
    public void setCreatorId(Integer v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.creatorId, v))
              {
            this.creatorId = v;
            setModified(true);
        }
    
                                          
                if (aScarabUser != null && !ObjectUtils.equals(aScarabUser.getUserId(), v))
                {
            aScarabUser = null;
        }
      
              }
          
    /**
     * Get the ReceiverId
     *
     * @return Integer
     */
    public Integer getReceiverId()
    {
        return receiverId;
    }

                        
    /**
     * Set the value of ReceiverId
     *
     * @param v new value
     */
    public void setReceiverId(Integer v) 
    {
    
                  if (!ObjectUtils.equals(this.receiverId, v))
              {
            this.receiverId = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the Status
     *
     * @return Integer
     */
    public Integer getStatus()
    {
        return status;
    }

                        
    /**
     * Set the value of Status
     *
     * @param v new value
     */
    public void setStatus(Integer v) 
    {
    
                  if (!ObjectUtils.equals(this.status, v))
              {
            this.status = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the CreationDate
     *
     * @return Date
     */
    public Date getCreationDate()
    {
        return creationDate;
    }

                        
    /**
     * Set the value of CreationDate
     *
     * @param v new value
     */
    public void setCreationDate(Date v) 
    {
    
                  if (!ObjectUtils.equals(this.creationDate, v))
              {
            this.creationDate = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the ChangeDate
     *
     * @return Date
     */
    public Date getChangeDate()
    {
        return changeDate;
    }

                        
    /**
     * Set the value of ChangeDate
     *
     * @param v new value
     */
    public void setChangeDate(Date v) 
    {
    
                  if (!ObjectUtils.equals(this.changeDate, v))
              {
            this.changeDate = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the Comment
     *
     * @return String
     */
    public String getComment()
    {
        return comment;
    }

                        
    /**
     * Set the value of Comment
     *
     * @param v new value
     */
    public void setComment(String v) 
    {
    
                  if (!ObjectUtils.equals(this.comment, v))
              {
            this.comment = v;
            setModified(true);
        }
    
          
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
                  setCreatorId((Integer) null);
              }
        else
        {
            setCreatorId(v.getUserId());
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
              if (aScarabUser == null && (!ObjectUtils.equals(this.creatorId, null)))
        {
                    aScarabUser = ScarabUserManager.getInstance(SimpleKey.keyFor(this.creatorId));
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
        if (aScarabUser == null && (!ObjectUtils.equals(this.creatorId, null)))
        {
                    aScarabUser = ScarabUserManager.getCachedInstance(SimpleKey.keyFor(this.creatorId));
            if (aScarabUser == null)
            {
                          aScarabUser = ScarabUserImplPeer.retrieveScarabUserImplByPK(SimpleKey.keyFor(this.creatorId), connection);
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
    
                    setCreatorId(new Integer(((NumberKey) key).intValue()));
              }
  
        
                  
    
        private Activity aActivity;

    /**
     * Declares an association between this object and a Activity object
     *
     * @param v Activity
     * @throws TorqueException
     */
    public void setActivity(Activity v) throws TorqueException
    {
            if (v == null)
        {
                  setActivityId((Long) null);
              }
        else
        {
            setActivityId(v.getActivityId());
        }
            aActivity = v;
    }

                        
    /**
     * Returns the associated Activity object.
           * If it was not retrieved before, the object is retrieved from
     * the database
           *
     * @return the associated Activity object
           * @throws TorqueException
           */
    public Activity getActivity()
              throws TorqueException
          {
              if (aActivity == null && (!ObjectUtils.equals(this.activityId, null)))
        {
                    aActivity = ActivityManager.getInstance(SimpleKey.keyFor(this.activityId));
                }
              return aActivity;
    }

    /**
     * Return the associated Activity object
     * If it was not retrieved before, the object is retrieved from
     * the database using the passed connection
     *
     * @param connection the connection used to retrieve the associated object
     *        from the database, if it was not retrieved before
     * @return the associated Activity object
     * @throws TorqueException
     */
    public Activity getActivity(Connection connection)
        throws TorqueException
    {
        if (aActivity == null && (!ObjectUtils.equals(this.activityId, null)))
        {
                    aActivity = ActivityManager.getCachedInstance(SimpleKey.keyFor(this.activityId));
            if (aActivity == null)
            {
                          aActivity = ActivityPeer.retrieveByPK(SimpleKey.keyFor(this.activityId), connection);
                          ActivityManager.putInstance(aActivity);
            }
                }
        return aActivity;
    }
    
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setActivityKey(ObjectKey key) throws TorqueException
    {
    
                    setActivityId(new Long(((NumberKey) key).longValue()));
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
              fieldNames.add("ActivityId");
              fieldNames.add("CreatorId");
              fieldNames.add("ReceiverId");
              fieldNames.add("Status");
              fieldNames.add("CreationDate");
              fieldNames.add("ChangeDate");
              fieldNames.add("Comment");
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
          if (name.equals("ActivityId"))
        {
                return getActivityId();
            }
          if (name.equals("CreatorId"))
        {
                return getCreatorId();
            }
          if (name.equals("ReceiverId"))
        {
                return getReceiverId();
            }
          if (name.equals("Status"))
        {
                return getStatus();
            }
          if (name.equals("CreationDate"))
        {
                return getCreationDate();
            }
          if (name.equals("ChangeDate"))
        {
                return getChangeDate();
            }
          if (name.equals("Comment"))
        {
                return getComment();
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
          if (name.equals(NotificationStatusPeer.ACTIVITY_ID))
        {
                return getActivityId();
            }
          if (name.equals(NotificationStatusPeer.CREATOR_ID))
        {
                return getCreatorId();
            }
          if (name.equals(NotificationStatusPeer.RECEIVER_ID))
        {
                return getReceiverId();
            }
          if (name.equals(NotificationStatusPeer.STATUS))
        {
                return getStatus();
            }
          if (name.equals(NotificationStatusPeer.CREATION_DATE))
        {
                return getCreationDate();
            }
          if (name.equals(NotificationStatusPeer.CHANGE_DATE))
        {
                return getChangeDate();
            }
          if (name.equals(NotificationStatusPeer.STATUS_COMMENT))
        {
                return getComment();
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
                return getActivityId();
            }
              if (pos == 1)
        {
                return getCreatorId();
            }
              if (pos == 2)
        {
                return getReceiverId();
            }
              if (pos == 3)
        {
                return getStatus();
            }
              if (pos == 4)
        {
                return getCreationDate();
            }
              if (pos == 5)
        {
                return getChangeDate();
            }
              if (pos == 6)
        {
                return getComment();
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
          save(NotificationStatusPeer.getMapBuilder()
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
                    NotificationStatusPeer.doInsert((NotificationStatus) this, con);
                    setNew(false);
                }
                else
                {
                    NotificationStatusPeer.doUpdate((NotificationStatus) this, con);
                }

    
                      if (isCacheOnSave())
                {
                    NotificationStatusManager.putInstance(this);
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

                                                              
  
    private final SimpleKey[] pks = new SimpleKey[3];
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
                      setActivityId(new Long(((NumberKey)keys[0]).longValue()));
                        setCreatorId(new Integer(((NumberKey)keys[1]).intValue()));
                        setReceiverId(new Integer(((NumberKey)keys[2]).intValue()));
              }

    /**
     * Set the PrimaryKey using SimpleKeys.
     *
         * @param activityId Long
         * @param creatorId Integer
         * @param receiverId Integer
         */
    public void setPrimaryKey( Long activityId, Integer creatorId, Integer receiverId)
        throws TorqueException
    {
            setActivityId(activityId);
            setCreatorId(creatorId);
            setReceiverId(receiverId);
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
              pks[0] = SimpleKey.keyFor(getActivityId());
                  pks[1] = SimpleKey.keyFor(getCreatorId());
                  pks[2] = SimpleKey.keyFor(getReceiverId());
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
      public NotificationStatus copy() throws TorqueException
    {
        return copyInto(new NotificationStatus());
    }
  
    protected NotificationStatus copyInto(NotificationStatus copyObj) throws TorqueException
    {
          copyObj.setActivityId(activityId);
          copyObj.setCreatorId(creatorId);
          copyObj.setReceiverId(receiverId);
          copyObj.setStatus(status);
          copyObj.setCreationDate(creationDate);
          copyObj.setChangeDate(changeDate);
          copyObj.setComment(comment);
  
                    copyObj.setActivityId((Long)null);
                              copyObj.setCreatorId((Integer)null);
                              copyObj.setReceiverId((Integer)null);
                                    
                return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public NotificationStatusPeer getPeer()
    {
        return peer;
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("NotificationStatus:\n");
        str.append("ActivityId = ")
               .append(getActivityId())
             .append("\n");
        str.append("CreatorId = ")
               .append(getCreatorId())
             .append("\n");
        str.append("ReceiverId = ")
               .append(getReceiverId())
             .append("\n");
        str.append("Status = ")
               .append(getStatus())
             .append("\n");
        str.append("CreationDate = ")
               .append(getCreationDate())
             .append("\n");
        str.append("ChangeDate = ")
               .append(getChangeDate())
             .append("\n");
        str.append("Comment = ")
               .append(getComment())
             .append("\n");
        return(str.toString());
    }
}
