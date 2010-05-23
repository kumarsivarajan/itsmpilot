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
 * extended all references should be to IssueTemplateInfo
 */
public abstract class BaseIssueTemplateInfo extends BaseObject
    implements org.apache.fulcrum.intake.Retrievable
{
    /** The Peer class */
    private static final IssueTemplateInfoPeer peer =
        new IssueTemplateInfoPeer();

        
    /** The value for the issueId field */
    private Long issueId;
      
    /** The value for the name field */
    private String name;
      
    /** The value for the description field */
    private String description;
                                                                
    /** The value for the approved field */
    private boolean approved = false;
      
    /** The value for the scopeId field */
    private Integer scopeId;
  
            
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
     * Get the Name
     *
     * @return String
     */
    public String getName()
    {
        return name;
    }

                        
    /**
     * Set the value of Name
     *
     * @param v new value
     */
    public void setName(String v) 
    {
    
                  if (!ObjectUtils.equals(this.name, v))
              {
            this.name = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the Description
     *
     * @return String
     */
    public String getDescription()
    {
        return description;
    }

                        
    /**
     * Set the value of Description
     *
     * @param v new value
     */
    public void setDescription(String v) 
    {
    
                  if (!ObjectUtils.equals(this.description, v))
              {
            this.description = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the Approved
     *
     * @return boolean
     */
    public boolean getApproved()
    {
        return approved;
    }

                        
    /**
     * Set the value of Approved
     *
     * @param v new value
     */
    public void setApproved(boolean v) 
    {
    
                  if (this.approved != v)
              {
            this.approved = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the ScopeId
     *
     * @return Integer
     */
    public Integer getScopeId()
    {
        return scopeId;
    }

                              
    /**
     * Set the value of ScopeId
     *
     * @param v new value
     */
    public void setScopeId(Integer v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.scopeId, v))
              {
            this.scopeId = v;
            setModified(true);
        }
    
                                  
                if (aScope != null && !ObjectUtils.equals(aScope.getScopeId(), v))
                {
            aScope = null;
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
  
        
                  
    
        private Scope aScope;

    /**
     * Declares an association between this object and a Scope object
     *
     * @param v Scope
     * @throws TorqueException
     */
    public void setScope(Scope v) throws TorqueException
    {
            if (v == null)
        {
                  setScopeId((Integer) null);
              }
        else
        {
            setScopeId(v.getScopeId());
        }
            aScope = v;
    }

                        
    /**
     * Returns the associated Scope object.
           * If it was not retrieved before, the object is retrieved from
     * the database
           *
     * @return the associated Scope object
           * @throws TorqueException
           */
    public Scope getScope()
              throws TorqueException
          {
              if (aScope == null && (!ObjectUtils.equals(this.scopeId, null)))
        {
                    aScope = ScopeManager.getInstance(SimpleKey.keyFor(this.scopeId));
                }
              return aScope;
    }

    /**
     * Return the associated Scope object
     * If it was not retrieved before, the object is retrieved from
     * the database using the passed connection
     *
     * @param connection the connection used to retrieve the associated object
     *        from the database, if it was not retrieved before
     * @return the associated Scope object
     * @throws TorqueException
     */
    public Scope getScope(Connection connection)
        throws TorqueException
    {
        if (aScope == null && (!ObjectUtils.equals(this.scopeId, null)))
        {
                    aScope = ScopeManager.getCachedInstance(SimpleKey.keyFor(this.scopeId));
            if (aScope == null)
            {
                          aScope = ScopePeer.retrieveByPK(SimpleKey.keyFor(this.scopeId), connection);
                          ScopeManager.putInstance(aScope);
            }
                }
        return aScope;
    }
    
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setScopeKey(ObjectKey key) throws TorqueException
    {
    
                    setScopeId(new Integer(((NumberKey) key).intValue()));
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
              fieldNames.add("Name");
              fieldNames.add("Description");
              fieldNames.add("Approved");
              fieldNames.add("ScopeId");
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
          if (name.equals("Name"))
        {
                return getName();
            }
          if (name.equals("Description"))
        {
                return getDescription();
            }
          if (name.equals("Approved"))
        {
                return Boolean.valueOf(getApproved());
            }
          if (name.equals("ScopeId"))
        {
                return getScopeId();
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
          if (name.equals(IssueTemplateInfoPeer.ISSUE_ID))
        {
                return getIssueId();
            }
          if (name.equals(IssueTemplateInfoPeer.NAME))
        {
                return getName();
            }
          if (name.equals(IssueTemplateInfoPeer.DESCRIPTION))
        {
                return getDescription();
            }
          if (name.equals(IssueTemplateInfoPeer.APPROVED))
        {
                return Boolean.valueOf(getApproved());
            }
          if (name.equals(IssueTemplateInfoPeer.SCOPE_ID))
        {
                return getScopeId();
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
                return getName();
            }
              if (pos == 2)
        {
                return getDescription();
            }
              if (pos == 3)
        {
                return Boolean.valueOf(getApproved());
            }
              if (pos == 4)
        {
                return getScopeId();
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
          save(IssueTemplateInfoPeer.getMapBuilder()
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
                    IssueTemplateInfoPeer.doInsert((IssueTemplateInfo) this, con);
                    setNew(false);
                }
                else
                {
                    IssueTemplateInfoPeer.doUpdate((IssueTemplateInfo) this, con);
                }

    
                      if (isCacheOnSave())
                {
                    IssueTemplateInfoManager.putInstance(this);
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
     * @param key issueId ObjectKey
     */
    public void setPrimaryKey(ObjectKey key)
        throws TorqueException
    {
            setIssueId(new Long(((NumberKey) key).longValue()));
        }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) throws TorqueException
    {
            setIssueId(new Long(key));
        }

  
    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
          return SimpleKey.keyFor(getIssueId());
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
      public IssueTemplateInfo copy() throws TorqueException
    {
        return copyInto(new IssueTemplateInfo());
    }
  
    protected IssueTemplateInfo copyInto(IssueTemplateInfo copyObj) throws TorqueException
    {
          copyObj.setIssueId(issueId);
          copyObj.setName(name);
          copyObj.setDescription(description);
          copyObj.setApproved(approved);
          copyObj.setScopeId(scopeId);
  
                    copyObj.setIssueId((Long)null);
                                    
                return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public IssueTemplateInfoPeer getPeer()
    {
        return peer;
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("IssueTemplateInfo:\n");
        str.append("IssueId = ")
               .append(getIssueId())
             .append("\n");
        str.append("Name = ")
               .append(getName())
             .append("\n");
        str.append("Description = ")
               .append(getDescription())
             .append("\n");
        str.append("Approved = ")
               .append(getApproved())
             .append("\n");
        str.append("ScopeId = ")
               .append(getScopeId())
             .append("\n");
        return(str.toString());
    }
}
