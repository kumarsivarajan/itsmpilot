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
 * extended all references should be to Report
 */
public abstract class BaseReport extends BaseObject
    implements org.apache.fulcrum.intake.Retrievable
{
    /** The Peer class */
    private static final ReportPeer peer =
        new ReportPeer();

        
    /** The value for the reportId field */
    private Integer reportId;
      
    /** The value for the userId field */
    private Integer userId;
      
    /** The value for the moduleId field */
    private Integer moduleId;
      
    /** The value for the issueTypeId field */
    private Integer issueTypeId;
      
    /** The value for the name field */
    private String name;
      
    /** The value for the description field */
    private String description;
      
    /** The value for the queryString field */
    private String queryString;
      
    /** The value for the scopeId field */
    private Integer scopeId;
                                                                
    /** The value for the deleted field */
    private boolean deleted = false;
      
    /** The value for the createdDate field */
    private Date createdDate;
  
            
    /**
     * Get the ReportId
     *
     * @return Integer
     */
    public Integer getReportId()
    {
        return reportId;
    }

                        
    /**
     * Set the value of ReportId
     *
     * @param v new value
     */
    public void setReportId(Integer v) 
    {
    
                  if (!ObjectUtils.equals(this.reportId, v))
              {
            this.reportId = v;
            setModified(true);
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
     * Get the QueryString
     *
     * @return String
     */
    public String getQueryString()
    {
        return queryString;
    }

                        
    /**
     * Set the value of QueryString
     *
     * @param v new value
     */
    public void setQueryString(String v) 
    {
    
                  if (!ObjectUtils.equals(this.queryString, v))
              {
            this.queryString = v;
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
          
    /**
     * Get the Deleted
     *
     * @return boolean
     */
    public boolean getDeleted()
    {
        return deleted;
    }

                        
    /**
     * Set the value of Deleted
     *
     * @param v new value
     */
    public void setDeleted(boolean v) 
    {
    
                  if (this.deleted != v)
              {
            this.deleted = v;
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
              fieldNames.add("ReportId");
              fieldNames.add("UserId");
              fieldNames.add("ModuleId");
              fieldNames.add("IssueTypeId");
              fieldNames.add("Name");
              fieldNames.add("Description");
              fieldNames.add("QueryString");
              fieldNames.add("ScopeId");
              fieldNames.add("Deleted");
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
          if (name.equals("ReportId"))
        {
                return getReportId();
            }
          if (name.equals("UserId"))
        {
                return getUserId();
            }
          if (name.equals("ModuleId"))
        {
                return getModuleId();
            }
          if (name.equals("IssueTypeId"))
        {
                return getIssueTypeId();
            }
          if (name.equals("Name"))
        {
                return getName();
            }
          if (name.equals("Description"))
        {
                return getDescription();
            }
          if (name.equals("QueryString"))
        {
                return getQueryString();
            }
          if (name.equals("ScopeId"))
        {
                return getScopeId();
            }
          if (name.equals("Deleted"))
        {
                return Boolean.valueOf(getDeleted());
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
          if (name.equals(ReportPeer.REPORT_ID))
        {
                return getReportId();
            }
          if (name.equals(ReportPeer.USER_ID))
        {
                return getUserId();
            }
          if (name.equals(ReportPeer.MODULE_ID))
        {
                return getModuleId();
            }
          if (name.equals(ReportPeer.ISSUE_TYPE_ID))
        {
                return getIssueTypeId();
            }
          if (name.equals(ReportPeer.NAME))
        {
                return getName();
            }
          if (name.equals(ReportPeer.DESCRIPTION))
        {
                return getDescription();
            }
          if (name.equals(ReportPeer.QUERY_STRING))
        {
                return getQueryString();
            }
          if (name.equals(ReportPeer.SCOPE_ID))
        {
                return getScopeId();
            }
          if (name.equals(ReportPeer.DELETED))
        {
                return Boolean.valueOf(getDeleted());
            }
          if (name.equals(ReportPeer.CREATED_DATE))
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
                return getReportId();
            }
              if (pos == 1)
        {
                return getUserId();
            }
              if (pos == 2)
        {
                return getModuleId();
            }
              if (pos == 3)
        {
                return getIssueTypeId();
            }
              if (pos == 4)
        {
                return getName();
            }
              if (pos == 5)
        {
                return getDescription();
            }
              if (pos == 6)
        {
                return getQueryString();
            }
              if (pos == 7)
        {
                return getScopeId();
            }
              if (pos == 8)
        {
                return Boolean.valueOf(getDeleted());
            }
              if (pos == 9)
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
          save(ReportPeer.getMapBuilder()
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
                    ReportPeer.doInsert((Report) this, con);
                    setNew(false);
                }
                else
                {
                    ReportPeer.doUpdate((Report) this, con);
                }

    
                      if (isCacheOnSave())
                {
                    ReportManager.putInstance(this);
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
     * @param key reportId ObjectKey
     */
    public void setPrimaryKey(ObjectKey key)
        
    {
            setReportId(new Integer(((NumberKey) key).intValue()));
        }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) 
    {
            setReportId(new Integer(key));
        }

  
    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
          return SimpleKey.keyFor(getReportId());
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
      public Report copy() throws TorqueException
    {
        return copyInto(new Report());
    }
  
    protected Report copyInto(Report copyObj) throws TorqueException
    {
          copyObj.setReportId(reportId);
          copyObj.setUserId(userId);
          copyObj.setModuleId(moduleId);
          copyObj.setIssueTypeId(issueTypeId);
          copyObj.setName(name);
          copyObj.setDescription(description);
          copyObj.setQueryString(queryString);
          copyObj.setScopeId(scopeId);
          copyObj.setDeleted(deleted);
          copyObj.setCreatedDate(createdDate);
  
                    copyObj.setReportId((Integer)null);
                                                                  
                return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public ReportPeer getPeer()
    {
        return peer;
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("Report:\n");
        str.append("ReportId = ")
               .append(getReportId())
             .append("\n");
        str.append("UserId = ")
               .append(getUserId())
             .append("\n");
        str.append("ModuleId = ")
               .append(getModuleId())
             .append("\n");
        str.append("IssueTypeId = ")
               .append(getIssueTypeId())
             .append("\n");
        str.append("Name = ")
               .append(getName())
             .append("\n");
        str.append("Description = ")
               .append(getDescription())
             .append("\n");
        str.append("QueryString = ")
               .append(getQueryString())
             .append("\n");
        str.append("ScopeId = ")
               .append(getScopeId())
             .append("\n");
        str.append("Deleted = ")
               .append(getDeleted())
             .append("\n");
        str.append("CreatedDate = ")
               .append(getCreatedDate())
             .append("\n");
        return(str.toString());
    }
}
