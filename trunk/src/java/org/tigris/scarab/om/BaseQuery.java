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
 * extended all references should be to Query
 */
public abstract class BaseQuery extends BaseObject
    implements org.apache.fulcrum.intake.Retrievable
{
    /** The Peer class */
    private static final QueryPeer peer =
        new QueryPeer();

        
    /** The value for the queryId field */
    private Long queryId;
      
    /** The value for the userId field */
    private Integer userId;
      
    /** The value for the name field */
    private String name;
      
    /** The value for the description field */
    private String description;
      
    /** The value for the value field */
    private String value;
      
    /** The value for the scopeId field */
    private Integer scopeId;
      
    /** The value for the issueTypeId field */
    private Integer issueTypeId;
      
    /** The value for the moduleId field */
    private Integer moduleId;
      
    /** The value for the listId field */
    private Long listId;
                                                                
    /** The value for the deleted field */
    private boolean deleted = false;
                                                                
    /** The value for the approved field */
    private boolean approved = false;
      
    /** The value for the createdDate field */
    private Date createdDate;
      
    /** The value for the subscriptionFrequencyId field */
    private Integer subscriptionFrequencyId;
                                                                
    /** The value for the homePage field */
    private boolean homePage = false;
                                          
    /** The value for the order field */
    private int order = 0;
  
            
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
    
          
                                  
                  // update associated RQueryUser
        if (collRQueryUsers != null)
        {
            for (int i = 0; i < collRQueryUsers.size(); i++)
            {
                ((RQueryUser) collRQueryUsers.get(i))
                        .setQueryId(v);
            }
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
     * Get the Value
     *
     * @return String
     */
    public String getValue()
    {
        return value;
    }

                        
    /**
     * Set the value of Value
     *
     * @param v new value
     */
    public void setValue(String v) 
    {
    
                  if (!ObjectUtils.equals(this.value, v))
              {
            this.value = v;
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
          
    /**
     * Get the SubscriptionFrequencyId
     *
     * @return Integer
     */
    public Integer getSubscriptionFrequencyId()
    {
        return subscriptionFrequencyId;
    }

                              
    /**
     * Set the value of SubscriptionFrequencyId
     *
     * @param v new value
     */
    public void setSubscriptionFrequencyId(Integer v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.subscriptionFrequencyId, v))
              {
            this.subscriptionFrequencyId = v;
            setModified(true);
        }
    
                                  
                if (aFrequency != null && !ObjectUtils.equals(aFrequency.getFrequencyId(), v))
                {
            aFrequency = null;
        }
      
              }
          
    /**
     * Get the HomePage
     *
     * @return boolean
     */
    public boolean getHomePage()
    {
        return homePage;
    }

                        
    /**
     * Set the value of HomePage
     *
     * @param v new value
     */
    public void setHomePage(boolean v) 
    {
    
                  if (this.homePage != v)
              {
            this.homePage = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the Order
     *
     * @return int
     */
    public int getOrder()
    {
        return order;
    }

                        
    /**
     * Set the value of Order
     *
     * @param v new value
     */
    public void setOrder(int v) 
    {
    
                  if (this.order != v)
              {
            this.order = v;
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
                  setSubscriptionFrequencyId((Integer) null);
              }
        else
        {
            setSubscriptionFrequencyId(v.getFrequencyId());
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
              if (aFrequency == null && (!ObjectUtils.equals(this.subscriptionFrequencyId, null)))
        {
                    aFrequency = FrequencyManager.getInstance(SimpleKey.keyFor(this.subscriptionFrequencyId));
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
        if (aFrequency == null && (!ObjectUtils.equals(this.subscriptionFrequencyId, null)))
        {
                    aFrequency = FrequencyManager.getCachedInstance(SimpleKey.keyFor(this.subscriptionFrequencyId));
            if (aFrequency == null)
            {
                          aFrequency = FrequencyPeer.retrieveByPK(SimpleKey.keyFor(this.subscriptionFrequencyId), connection);
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
    
                    setSubscriptionFrequencyId(new Integer(((NumberKey) key).intValue()));
              }
     
                                
            
          /**
     * Collection to store aggregation of collRQueryUsers
     */
    protected List collRQueryUsers;

    /**
     * Temporary storage of collRQueryUsers to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initRQueryUsers()
    {
        if (collRQueryUsers == null)
        {
            collRQueryUsers = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a RQueryUser object to this object
     * through the RQueryUser foreign key attribute
     *
     * @param l RQueryUser
     * @throws TorqueException
     */
    public void addRQueryUser(RQueryUser l) throws TorqueException
    {
        getRQueryUsers().add(l);
        l.setQuery((Query) this);
    }

    /**
     * The criteria used to select the current contents of collRQueryUsers
     */
    private Criteria lastRQueryUsersCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getRQueryUsers(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getRQueryUsers()
              throws TorqueException
          {
                      if (collRQueryUsers == null)
        {
            collRQueryUsers = getRQueryUsers(new Criteria(10));
        }
                return collRQueryUsers;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Query has previously
           * been saved, it will retrieve related RQueryUsers from storage.
     * If this Query is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getRQueryUsers(Criteria criteria) throws TorqueException
    {
              if (collRQueryUsers == null)
        {
            if (isNew())
            {
               collRQueryUsers = new ArrayList();
            }
            else
            {
                        criteria.add(RQueryUserPeer.QUERY_ID, getQueryId() );
                        collRQueryUsers = RQueryUserPeer.doSelect(criteria);
            }
        }
        else
        {
            // criteria has no effect for a new object
            if (!isNew())
            {
                // the following code is to determine if a new query is
                // called for.  If the criteria is the same as the last
                // one, just return the collection.
                            criteria.add(RQueryUserPeer.QUERY_ID, getQueryId());
                            if (!lastRQueryUsersCriteria.equals(criteria))
                {
                    collRQueryUsers = RQueryUserPeer.doSelect(criteria);
                }
            }
        }
        lastRQueryUsersCriteria = criteria;

        return collRQueryUsers;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getRQueryUsers(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getRQueryUsers(Connection con) throws TorqueException
    {
              if (collRQueryUsers == null)
        {
            collRQueryUsers = getRQueryUsers(new Criteria(10), con);
        }
        return collRQueryUsers;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Query has previously
           * been saved, it will retrieve related RQueryUsers from storage.
     * If this Query is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getRQueryUsers(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collRQueryUsers == null)
        {
            if (isNew())
            {
               collRQueryUsers = new ArrayList();
            }
            else
            {
                         criteria.add(RQueryUserPeer.QUERY_ID, getQueryId());
                         collRQueryUsers = RQueryUserPeer.doSelect(criteria, con);
             }
         }
         else
         {
             // criteria has no effect for a new object
             if (!isNew())
             {
                 // the following code is to determine if a new query is
                 // called for.  If the criteria is the same as the last
                 // one, just return the collection.
                             criteria.add(RQueryUserPeer.QUERY_ID, getQueryId());
                             if (!lastRQueryUsersCriteria.equals(criteria))
                 {
                     collRQueryUsers = RQueryUserPeer.doSelect(criteria, con);
                 }
             }
         }
         lastRQueryUsersCriteria = criteria;

         return collRQueryUsers;
           }

                              
              
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Query is new, it will return
                 * an empty collection; or if this Query has previously
     * been saved, it will retrieve related RQueryUsers from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Query.
     */
    protected List getRQueryUsersJoinQuery(Criteria criteria)
        throws TorqueException
    {
                    if (collRQueryUsers == null)
        {
            if (isNew())
            {
               collRQueryUsers = new ArrayList();
            }
            else
            {
                              criteria.add(RQueryUserPeer.QUERY_ID, getQueryId());
                              collRQueryUsers = RQueryUserPeer.doSelectJoinQuery(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RQueryUserPeer.QUERY_ID, getQueryId());
                                    if (!lastRQueryUsersCriteria.equals(criteria))
            {
                collRQueryUsers = RQueryUserPeer.doSelectJoinQuery(criteria);
            }
        }
        lastRQueryUsersCriteria = criteria;

        return collRQueryUsers;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Query is new, it will return
                 * an empty collection; or if this Query has previously
     * been saved, it will retrieve related RQueryUsers from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Query.
     */
    protected List getRQueryUsersJoinScarabUserImpl(Criteria criteria)
        throws TorqueException
    {
                    if (collRQueryUsers == null)
        {
            if (isNew())
            {
               collRQueryUsers = new ArrayList();
            }
            else
            {
                              criteria.add(RQueryUserPeer.QUERY_ID, getQueryId());
                              collRQueryUsers = RQueryUserPeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RQueryUserPeer.QUERY_ID, getQueryId());
                                    if (!lastRQueryUsersCriteria.equals(criteria))
            {
                collRQueryUsers = RQueryUserPeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        lastRQueryUsersCriteria = criteria;

        return collRQueryUsers;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Query is new, it will return
                 * an empty collection; or if this Query has previously
     * been saved, it will retrieve related RQueryUsers from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Query.
     */
    protected List getRQueryUsersJoinFrequency(Criteria criteria)
        throws TorqueException
    {
                    if (collRQueryUsers == null)
        {
            if (isNew())
            {
               collRQueryUsers = new ArrayList();
            }
            else
            {
                              criteria.add(RQueryUserPeer.QUERY_ID, getQueryId());
                              collRQueryUsers = RQueryUserPeer.doSelectJoinFrequency(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RQueryUserPeer.QUERY_ID, getQueryId());
                                    if (!lastRQueryUsersCriteria.equals(criteria))
            {
                collRQueryUsers = RQueryUserPeer.doSelectJoinFrequency(criteria);
            }
        }
        lastRQueryUsersCriteria = criteria;

        return collRQueryUsers;
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
              fieldNames.add("Name");
              fieldNames.add("Description");
              fieldNames.add("Value");
              fieldNames.add("ScopeId");
              fieldNames.add("IssueTypeId");
              fieldNames.add("ModuleId");
              fieldNames.add("ListId");
              fieldNames.add("Deleted");
              fieldNames.add("Approved");
              fieldNames.add("CreatedDate");
              fieldNames.add("SubscriptionFrequencyId");
              fieldNames.add("HomePage");
              fieldNames.add("Order");
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
          if (name.equals("Name"))
        {
                return getName();
            }
          if (name.equals("Description"))
        {
                return getDescription();
            }
          if (name.equals("Value"))
        {
                return getValue();
            }
          if (name.equals("ScopeId"))
        {
                return getScopeId();
            }
          if (name.equals("IssueTypeId"))
        {
                return getIssueTypeId();
            }
          if (name.equals("ModuleId"))
        {
                return getModuleId();
            }
          if (name.equals("ListId"))
        {
                return getListId();
            }
          if (name.equals("Deleted"))
        {
                return Boolean.valueOf(getDeleted());
            }
          if (name.equals("Approved"))
        {
                return Boolean.valueOf(getApproved());
            }
          if (name.equals("CreatedDate"))
        {
                return getCreatedDate();
            }
          if (name.equals("SubscriptionFrequencyId"))
        {
                return getSubscriptionFrequencyId();
            }
          if (name.equals("HomePage"))
        {
                return Boolean.valueOf(getHomePage());
            }
          if (name.equals("Order"))
        {
                return new Integer(getOrder());
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
          if (name.equals(QueryPeer.QUERY_ID))
        {
                return getQueryId();
            }
          if (name.equals(QueryPeer.USER_ID))
        {
                return getUserId();
            }
          if (name.equals(QueryPeer.NAME))
        {
                return getName();
            }
          if (name.equals(QueryPeer.DESCRIPTION))
        {
                return getDescription();
            }
          if (name.equals(QueryPeer.VALUE))
        {
                return getValue();
            }
          if (name.equals(QueryPeer.SCOPE_ID))
        {
                return getScopeId();
            }
          if (name.equals(QueryPeer.ISSUE_TYPE_ID))
        {
                return getIssueTypeId();
            }
          if (name.equals(QueryPeer.MODULE_ID))
        {
                return getModuleId();
            }
          if (name.equals(QueryPeer.LIST_ID))
        {
                return getListId();
            }
          if (name.equals(QueryPeer.DELETED))
        {
                return Boolean.valueOf(getDeleted());
            }
          if (name.equals(QueryPeer.APPROVED))
        {
                return Boolean.valueOf(getApproved());
            }
          if (name.equals(QueryPeer.CREATED_DATE))
        {
                return getCreatedDate();
            }
          if (name.equals(QueryPeer.SUBSCRIPTION_FREQUENCY_ID))
        {
                return getSubscriptionFrequencyId();
            }
          if (name.equals(QueryPeer.HOME_PAGE))
        {
                return Boolean.valueOf(getHomePage());
            }
          if (name.equals(QueryPeer.PREFERRED_ORDER))
        {
                return new Integer(getOrder());
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
                return getName();
            }
              if (pos == 3)
        {
                return getDescription();
            }
              if (pos == 4)
        {
                return getValue();
            }
              if (pos == 5)
        {
                return getScopeId();
            }
              if (pos == 6)
        {
                return getIssueTypeId();
            }
              if (pos == 7)
        {
                return getModuleId();
            }
              if (pos == 8)
        {
                return getListId();
            }
              if (pos == 9)
        {
                return Boolean.valueOf(getDeleted());
            }
              if (pos == 10)
        {
                return Boolean.valueOf(getApproved());
            }
              if (pos == 11)
        {
                return getCreatedDate();
            }
              if (pos == 12)
        {
                return getSubscriptionFrequencyId();
            }
              if (pos == 13)
        {
                return Boolean.valueOf(getHomePage());
            }
              if (pos == 14)
        {
                return new Integer(getOrder());
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
          save(QueryPeer.getMapBuilder()
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
                    QueryPeer.doInsert((Query) this, con);
                    setNew(false);
                }
                else
                {
                    QueryPeer.doUpdate((Query) this, con);
                }

    
                      if (isCacheOnSave())
                {
                    QueryManager.putInstance(this);
                }
              }

                                      
                                    if (collRQueryUsers != null)
            {
                for (int i = 0; i < collRQueryUsers.size(); i++)
                {
                    ((RQueryUser) collRQueryUsers.get(i)).save(con);
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
     * @param key queryId ObjectKey
     */
    public void setPrimaryKey(ObjectKey key)
        throws TorqueException
    {
            setQueryId(new Long(((NumberKey) key).longValue()));
        }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) throws TorqueException
    {
            setQueryId(new Long(key));
        }

  
    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
          return SimpleKey.keyFor(getQueryId());
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
      public Query copy() throws TorqueException
    {
        return copyInto(new Query());
    }
  
    protected Query copyInto(Query copyObj) throws TorqueException
    {
          copyObj.setQueryId(queryId);
          copyObj.setUserId(userId);
          copyObj.setName(name);
          copyObj.setDescription(description);
          copyObj.setValue(value);
          copyObj.setScopeId(scopeId);
          copyObj.setIssueTypeId(issueTypeId);
          copyObj.setModuleId(moduleId);
          copyObj.setListId(listId);
          copyObj.setDeleted(deleted);
          copyObj.setApproved(approved);
          copyObj.setCreatedDate(createdDate);
          copyObj.setSubscriptionFrequencyId(subscriptionFrequencyId);
          copyObj.setHomePage(homePage);
          copyObj.setOrder(order);
  
                    copyObj.setQueryId((Long)null);
                                                                                                
                                      
                            
        List v = getRQueryUsers();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                RQueryUser obj = (RQueryUser) v.get(i);
                copyObj.addRQueryUser(obj.copy());
            }
        }
        else
        {
            copyObj.collRQueryUsers = null;
        }
                            return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public QueryPeer getPeer()
    {
        return peer;
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("Query:\n");
        str.append("QueryId = ")
               .append(getQueryId())
             .append("\n");
        str.append("UserId = ")
               .append(getUserId())
             .append("\n");
        str.append("Name = ")
               .append(getName())
             .append("\n");
        str.append("Description = ")
               .append(getDescription())
             .append("\n");
        str.append("Value = ")
               .append(getValue())
             .append("\n");
        str.append("ScopeId = ")
               .append(getScopeId())
             .append("\n");
        str.append("IssueTypeId = ")
               .append(getIssueTypeId())
             .append("\n");
        str.append("ModuleId = ")
               .append(getModuleId())
             .append("\n");
        str.append("ListId = ")
               .append(getListId())
             .append("\n");
        str.append("Deleted = ")
               .append(getDeleted())
             .append("\n");
        str.append("Approved = ")
               .append(getApproved())
             .append("\n");
        str.append("CreatedDate = ")
               .append(getCreatedDate())
             .append("\n");
        str.append("SubscriptionFrequencyId = ")
               .append(getSubscriptionFrequencyId())
             .append("\n");
        str.append("HomePage = ")
               .append(getHomePage())
             .append("\n");
        str.append("Order = ")
               .append(getOrder())
             .append("\n");
        return(str.toString());
    }
}
