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
 * extended all references should be to IssueVote
 */
public abstract class BaseIssueVote extends BaseObject
    implements org.apache.fulcrum.intake.Retrievable
{
    /** The Peer class */
    private static final IssueVotePeer peer =
        new IssueVotePeer();

        
    /** The value for the issueId field */
    private Long issueId;
      
    /** The value for the userId field */
    private Integer userId;
                                          
    /** The value for the votes field */
    private int votes = 0;
  
            
    /**
     * Get the IssueId
     *
     * @return Long
     */
    public Long getIssueId()
    {
        return issueId;
    }

                              
    /**
     * Set the value of IssueId
     *
     * @param v new value
     */
    public void setIssueId(Long v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.issueId, v))
              {
            this.issueId = v;
            setModified(true);
        }
    
                                  
                if (aIssue != null && !ObjectUtils.equals(aIssue.getIssueId(), v))
                {
            aIssue = null;
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
     * Get the Votes
     *
     * @return int
     */
    public int getVotes()
    {
        return votes;
    }

                        
    /**
     * Set the value of Votes
     *
     * @param v new value
     */
    public void setVotes(int v) 
    {
    
                  if (this.votes != v)
              {
            this.votes = v;
            setModified(true);
        }
    
          
              }
  
      
        
                  
    
        private Issue aIssue;

    /**
     * Declares an association between this object and a Issue object
     *
     * @param v Issue
     * @throws TorqueException
     */
    public void setIssue(Issue v) throws TorqueException
    {
            if (v == null)
        {
                  setIssueId((Long) null);
              }
        else
        {
            setIssueId(v.getIssueId());
        }
            aIssue = v;
    }

                        
    /**
     * Returns the associated Issue object.
           * If it was not retrieved before, the object is retrieved from
     * the database
           *
     * @return the associated Issue object
           * @throws TorqueException
           */
    public Issue getIssue()
              throws TorqueException
          {
              if (aIssue == null && (!ObjectUtils.equals(this.issueId, null)))
        {
                    aIssue = IssueManager.getInstance(SimpleKey.keyFor(this.issueId));
                }
              return aIssue;
    }

    /**
     * Return the associated Issue object
     * If it was not retrieved before, the object is retrieved from
     * the database using the passed connection
     *
     * @param connection the connection used to retrieve the associated object
     *        from the database, if it was not retrieved before
     * @return the associated Issue object
     * @throws TorqueException
     */
    public Issue getIssue(Connection connection)
        throws TorqueException
    {
        if (aIssue == null && (!ObjectUtils.equals(this.issueId, null)))
        {
                    aIssue = IssueManager.getCachedInstance(SimpleKey.keyFor(this.issueId));
            if (aIssue == null)
            {
                          aIssue = IssuePeer.retrieveByPK(SimpleKey.keyFor(this.issueId), connection);
                          IssueManager.putInstance(aIssue);
            }
                }
        return aIssue;
    }
    
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setIssueKey(ObjectKey key) throws TorqueException
    {
    
                    setIssueId(new Long(((NumberKey) key).longValue()));
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
              fieldNames.add("IssueId");
              fieldNames.add("UserId");
              fieldNames.add("Votes");
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
          if (name.equals("IssueId"))
        {
                return getIssueId();
            }
          if (name.equals("UserId"))
        {
                return getUserId();
            }
          if (name.equals("Votes"))
        {
                return new Integer(getVotes());
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
          if (name.equals(IssueVotePeer.ISSUE_ID))
        {
                return getIssueId();
            }
          if (name.equals(IssueVotePeer.USER_ID))
        {
                return getUserId();
            }
          if (name.equals(IssueVotePeer.VOTES))
        {
                return new Integer(getVotes());
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
                return getIssueId();
            }
              if (pos == 1)
        {
                return getUserId();
            }
              if (pos == 2)
        {
                return new Integer(getVotes());
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
          save(IssueVotePeer.getMapBuilder()
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
                    IssueVotePeer.doInsert((IssueVote) this, con);
                    setNew(false);
                }
                else
                {
                    IssueVotePeer.doUpdate((IssueVote) this, con);
                }

    
                      if (isCacheOnSave())
                {
                    IssueVoteManager.putInstance(this);
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
                      setIssueId(new Long(((NumberKey)keys[0]).longValue()));
                        setUserId(new Integer(((NumberKey)keys[1]).intValue()));
              }

    /**
     * Set the PrimaryKey using SimpleKeys.
     *
         * @param issueId Long
         * @param userId Integer
         */
    public void setPrimaryKey( Long issueId, Integer userId)
        throws TorqueException
    {
            setIssueId(issueId);
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
              pks[0] = SimpleKey.keyFor(getIssueId());
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
      public IssueVote copy() throws TorqueException
    {
        return copyInto(new IssueVote());
    }
  
    protected IssueVote copyInto(IssueVote copyObj) throws TorqueException
    {
          copyObj.setIssueId(issueId);
          copyObj.setUserId(userId);
          copyObj.setVotes(votes);
  
                    copyObj.setIssueId((Long)null);
                              copyObj.setUserId((Integer)null);
                  
                return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public IssueVotePeer getPeer()
    {
        return peer;
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("IssueVote:\n");
        str.append("IssueId = ")
               .append(getIssueId())
             .append("\n");
        str.append("UserId = ")
               .append(getUserId())
             .append("\n");
        str.append("Votes = ")
               .append(getVotes())
             .append("\n");
        return(str.toString());
    }
}
