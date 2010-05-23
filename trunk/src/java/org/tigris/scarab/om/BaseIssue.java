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
 * extended all references should be to Issue
 */
public abstract class BaseIssue extends BaseObject
    implements org.apache.fulcrum.intake.Retrievable
{
    /** The Peer class */
    private static final IssuePeer peer =
        new IssuePeer();

        
    /** The value for the issueId field */
    private Long issueId;
      
    /** The value for the idPrefix field */
    private String idPrefix;
      
    /** The value for the idCount field */
    private int idCount;
      
    /** The value for the idDomain field */
    private String idDomain;
      
    /** The value for the typeId field */
    private Integer typeId;
      
    /** The value for the moduleId field */
    private Integer moduleId;
      
    /** The value for the createdTransId field */
    private Long createdTransId;
      
    /** The value for the lastTransId field */
    private Long lastTransId;
                                                                
    /** The value for the deleted field */
    private boolean deleted = false;
                                                                
    /** The value for the moved field */
    private boolean moved = false;
  
            
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
    
          
                                  
                  // update associated Activity
        if (collActivitys != null)
        {
            for (int i = 0; i < collActivitys.size(); i++)
            {
                ((Activity) collActivitys.get(i))
                        .setIssueId(v);
            }
        }
                                                    
                  // update associated Attachment
        if (collAttachments != null)
        {
            for (int i = 0; i < collAttachments.size(); i++)
            {
                ((Attachment) collAttachments.get(i))
                        .setIssueId(v);
            }
        }
                                                    
                  // update associated Depend
        if (collDependsRelatedByObservedId != null)
        {
            for (int i = 0; i < collDependsRelatedByObservedId.size(); i++)
            {
                ((Depend) collDependsRelatedByObservedId.get(i))
                        .setObservedId(v);
            }
        }
                                                    
                  // update associated Depend
        if (collDependsRelatedByObserverId != null)
        {
            for (int i = 0; i < collDependsRelatedByObserverId.size(); i++)
            {
                ((Depend) collDependsRelatedByObserverId.get(i))
                        .setObserverId(v);
            }
        }
                                                    
                  // update associated AttributeValue
        if (collAttributeValues != null)
        {
            for (int i = 0; i < collAttributeValues.size(); i++)
            {
                ((AttributeValue) collAttributeValues.get(i))
                        .setIssueId(v);
            }
        }
                                                    
                  // update associated IssueVote
        if (collIssueVotes != null)
        {
            for (int i = 0; i < collIssueVotes.size(); i++)
            {
                ((IssueVote) collIssueVotes.get(i))
                        .setIssueId(v);
            }
        }
                                                    
                  // update associated IssueTemplateInfo
        if (collIssueTemplateInfos != null)
        {
            for (int i = 0; i < collIssueTemplateInfos.size(); i++)
            {
                ((IssueTemplateInfo) collIssueTemplateInfos.get(i))
                        .setIssueId(v);
            }
        }
                                }
          
    /**
     * Get the IdPrefix
     *
     * @return String
     */
    public String getIdPrefix()
    {
        return idPrefix;
    }

                        
    /**
     * Set the value of IdPrefix
     *
     * @param v new value
     */
    public void setIdPrefix(String v) 
    {
    
                  if (!ObjectUtils.equals(this.idPrefix, v))
              {
            this.idPrefix = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the IdCount
     *
     * @return int
     */
    public int getIdCount()
    {
        return idCount;
    }

                        
    /**
     * Set the value of IdCount
     *
     * @param v new value
     */
    public void setIdCount(int v) 
    {
    
                  if (this.idCount != v)
              {
            this.idCount = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the IdDomain
     *
     * @return String
     */
    public String getIdDomain()
    {
        return idDomain;
    }

                        
    /**
     * Set the value of IdDomain
     *
     * @param v new value
     */
    public void setIdDomain(String v) 
    {
    
                  if (!ObjectUtils.equals(this.idDomain, v))
              {
            this.idDomain = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the TypeId
     *
     * @return Integer
     */
    public Integer getTypeId()
    {
        return typeId;
    }

                              
    /**
     * Set the value of TypeId
     *
     * @param v new value
     */
    public void setTypeId(Integer v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.typeId, v))
              {
            this.typeId = v;
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
     * Get the CreatedTransId
     *
     * @return Long
     */
    public Long getCreatedTransId()
    {
        return createdTransId;
    }

                              
    /**
     * Set the value of CreatedTransId
     *
     * @param v new value
     */
    public void setCreatedTransId(Long v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.createdTransId, v))
              {
            this.createdTransId = v;
            setModified(true);
        }
    
                                                                          
                if (aActivitySetRelatedByCreatedTransId != null && !ObjectUtils.equals(aActivitySetRelatedByCreatedTransId.getActivitySetId(), v))
                {
            aActivitySetRelatedByCreatedTransId = null;
        }
      
              }
          
    /**
     * Get the LastTransId
     *
     * @return Long
     */
    public Long getLastTransId()
    {
        return lastTransId;
    }

                              
    /**
     * Set the value of LastTransId
     *
     * @param v new value
     */
    public void setLastTransId(Long v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.lastTransId, v))
              {
            this.lastTransId = v;
            setModified(true);
        }
    
                                                                          
                if (aActivitySetRelatedByLastTransId != null && !ObjectUtils.equals(aActivitySetRelatedByLastTransId.getActivitySetId(), v))
                {
            aActivitySetRelatedByLastTransId = null;
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
     * Get the Moved
     *
     * @return boolean
     */
    public boolean getMoved()
    {
        return moved;
    }

                        
    /**
     * Set the value of Moved
     *
     * @param v new value
     */
    public void setMoved(boolean v) 
    {
    
                  if (this.moved != v)
              {
            this.moved = v;
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
                  setTypeId((Integer) null);
              }
        else
        {
            setTypeId(v.getIssueTypeId());
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
              if (aIssueType == null && (!ObjectUtils.equals(this.typeId, null)))
        {
                    aIssueType = IssueTypeManager.getInstance(SimpleKey.keyFor(this.typeId));
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
        if (aIssueType == null && (!ObjectUtils.equals(this.typeId, null)))
        {
                    aIssueType = IssueTypeManager.getCachedInstance(SimpleKey.keyFor(this.typeId));
            if (aIssueType == null)
            {
                          aIssueType = IssueTypePeer.retrieveByPK(SimpleKey.keyFor(this.typeId), connection);
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
    
                    setTypeId(new Integer(((NumberKey) key).intValue()));
              }
  
        
                        
        
        private ActivitySet aActivitySetRelatedByCreatedTransId;

    /**
     * Declares an association between this object and a ActivitySet object
     *
     * @param v ActivitySet
     * @throws TorqueException
     */
    public void setActivitySetRelatedByCreatedTransId(ActivitySet v) throws TorqueException
    {
            if (v == null)
        {
                  setCreatedTransId((Long) null);
              }
        else
        {
            setCreatedTransId(v.getActivitySetId());
        }
            aActivitySetRelatedByCreatedTransId = v;
    }

                        
    /**
     * Returns the associated ActivitySet object.
           * If it was not retrieved before, the object is retrieved from
     * the database
           *
     * @return the associated ActivitySet object
           * @throws TorqueException
           */
    public ActivitySet getActivitySetRelatedByCreatedTransId()
              throws TorqueException
          {
              if (aActivitySetRelatedByCreatedTransId == null && (!ObjectUtils.equals(this.createdTransId, null)))
        {
                    aActivitySetRelatedByCreatedTransId = ActivitySetManager.getInstance(SimpleKey.keyFor(this.createdTransId));
                }
              return aActivitySetRelatedByCreatedTransId;
    }

    /**
     * Return the associated ActivitySet object
     * If it was not retrieved before, the object is retrieved from
     * the database using the passed connection
     *
     * @param connection the connection used to retrieve the associated object
     *        from the database, if it was not retrieved before
     * @return the associated ActivitySet object
     * @throws TorqueException
     */
    public ActivitySet getActivitySetRelatedByCreatedTransId(Connection connection)
        throws TorqueException
    {
        if (aActivitySetRelatedByCreatedTransId == null && (!ObjectUtils.equals(this.createdTransId, null)))
        {
                    aActivitySetRelatedByCreatedTransId = ActivitySetManager.getCachedInstance(SimpleKey.keyFor(this.createdTransId));
            if (aActivitySetRelatedByCreatedTransId == null)
            {
                          aActivitySetRelatedByCreatedTransId = ActivitySetPeer.retrieveByPK(SimpleKey.keyFor(this.createdTransId), connection);
                          ActivitySetManager.putInstance(aActivitySetRelatedByCreatedTransId);
            }
                }
        return aActivitySetRelatedByCreatedTransId;
    }
    
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setActivitySetRelatedByCreatedTransIdKey(ObjectKey key) throws TorqueException
    {
    
                    setCreatedTransId(new Long(((NumberKey) key).longValue()));
              }
  
        
                        
        
        private ActivitySet aActivitySetRelatedByLastTransId;

    /**
     * Declares an association between this object and a ActivitySet object
     *
     * @param v ActivitySet
     * @throws TorqueException
     */
    public void setActivitySetRelatedByLastTransId(ActivitySet v) throws TorqueException
    {
            if (v == null)
        {
                  setLastTransId((Long) null);
              }
        else
        {
            setLastTransId(v.getActivitySetId());
        }
            aActivitySetRelatedByLastTransId = v;
    }

                        
    /**
     * Returns the associated ActivitySet object.
           * If it was not retrieved before, the object is retrieved from
     * the database
           *
     * @return the associated ActivitySet object
           * @throws TorqueException
           */
    public ActivitySet getActivitySetRelatedByLastTransId()
              throws TorqueException
          {
              if (aActivitySetRelatedByLastTransId == null && (!ObjectUtils.equals(this.lastTransId, null)))
        {
                    aActivitySetRelatedByLastTransId = ActivitySetManager.getInstance(SimpleKey.keyFor(this.lastTransId));
                }
              return aActivitySetRelatedByLastTransId;
    }

    /**
     * Return the associated ActivitySet object
     * If it was not retrieved before, the object is retrieved from
     * the database using the passed connection
     *
     * @param connection the connection used to retrieve the associated object
     *        from the database, if it was not retrieved before
     * @return the associated ActivitySet object
     * @throws TorqueException
     */
    public ActivitySet getActivitySetRelatedByLastTransId(Connection connection)
        throws TorqueException
    {
        if (aActivitySetRelatedByLastTransId == null && (!ObjectUtils.equals(this.lastTransId, null)))
        {
                    aActivitySetRelatedByLastTransId = ActivitySetManager.getCachedInstance(SimpleKey.keyFor(this.lastTransId));
            if (aActivitySetRelatedByLastTransId == null)
            {
                          aActivitySetRelatedByLastTransId = ActivitySetPeer.retrieveByPK(SimpleKey.keyFor(this.lastTransId), connection);
                          ActivitySetManager.putInstance(aActivitySetRelatedByLastTransId);
            }
                }
        return aActivitySetRelatedByLastTransId;
    }
    
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setActivitySetRelatedByLastTransIdKey(ObjectKey key) throws TorqueException
    {
    
                    setLastTransId(new Long(((NumberKey) key).longValue()));
              }
     
                                
            
          /**
     * Collection to store aggregation of collActivitys
     */
    protected List collActivitys;

    /**
     * Temporary storage of collActivitys to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initActivitys()
    {
        if (collActivitys == null)
        {
            collActivitys = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a Activity object to this object
     * through the Activity foreign key attribute
     *
     * @param l Activity
     * @throws TorqueException
     */
    public void addActivity(Activity l) throws TorqueException
    {
        getActivitys().add(l);
        l.setIssue((Issue) this);
    }

    /**
     * The criteria used to select the current contents of collActivitys
     */
    private Criteria lastActivitysCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getActivitys(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getActivitys()
              throws TorqueException
          {
                      if (collActivitys == null)
        {
            collActivitys = getActivitys(new Criteria(10));
        }
                return collActivitys;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Issue has previously
           * been saved, it will retrieve related Activitys from storage.
     * If this Issue is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getActivitys(Criteria criteria) throws TorqueException
    {
              if (collActivitys == null)
        {
            if (isNew())
            {
               collActivitys = new ArrayList();
            }
            else
            {
                        criteria.add(ActivityPeer.ISSUE_ID, getIssueId() );
                        collActivitys = ActivityPeer.doSelect(criteria);
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
                            criteria.add(ActivityPeer.ISSUE_ID, getIssueId());
                            if (!lastActivitysCriteria.equals(criteria))
                {
                    collActivitys = ActivityPeer.doSelect(criteria);
                }
            }
        }
        lastActivitysCriteria = criteria;

        return collActivitys;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getActivitys(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getActivitys(Connection con) throws TorqueException
    {
              if (collActivitys == null)
        {
            collActivitys = getActivitys(new Criteria(10), con);
        }
        return collActivitys;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Issue has previously
           * been saved, it will retrieve related Activitys from storage.
     * If this Issue is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getActivitys(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collActivitys == null)
        {
            if (isNew())
            {
               collActivitys = new ArrayList();
            }
            else
            {
                         criteria.add(ActivityPeer.ISSUE_ID, getIssueId());
                         collActivitys = ActivityPeer.doSelect(criteria, con);
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
                             criteria.add(ActivityPeer.ISSUE_ID, getIssueId());
                             if (!lastActivitysCriteria.equals(criteria))
                 {
                     collActivitys = ActivityPeer.doSelect(criteria, con);
                 }
             }
         }
         lastActivitysCriteria = criteria;

         return collActivitys;
           }

                                                                  
              
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Issue is new, it will return
                 * an empty collection; or if this Issue has previously
     * been saved, it will retrieve related Activitys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Issue.
     */
    protected List getActivitysJoinIssue(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitys == null)
        {
            if (isNew())
            {
               collActivitys = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.ISSUE_ID, getIssueId());
                              collActivitys = ActivityPeer.doSelectJoinIssue(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.ISSUE_ID, getIssueId());
                                    if (!lastActivitysCriteria.equals(criteria))
            {
                collActivitys = ActivityPeer.doSelectJoinIssue(criteria);
            }
        }
        lastActivitysCriteria = criteria;

        return collActivitys;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Issue is new, it will return
                 * an empty collection; or if this Issue has previously
     * been saved, it will retrieve related Activitys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Issue.
     */
    protected List getActivitysJoinAttribute(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitys == null)
        {
            if (isNew())
            {
               collActivitys = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.ISSUE_ID, getIssueId());
                              collActivitys = ActivityPeer.doSelectJoinAttribute(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.ISSUE_ID, getIssueId());
                                    if (!lastActivitysCriteria.equals(criteria))
            {
                collActivitys = ActivityPeer.doSelectJoinAttribute(criteria);
            }
        }
        lastActivitysCriteria = criteria;

        return collActivitys;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Issue is new, it will return
                 * an empty collection; or if this Issue has previously
     * been saved, it will retrieve related Activitys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Issue.
     */
    protected List getActivitysJoinActivitySet(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitys == null)
        {
            if (isNew())
            {
               collActivitys = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.ISSUE_ID, getIssueId());
                              collActivitys = ActivityPeer.doSelectJoinActivitySet(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.ISSUE_ID, getIssueId());
                                    if (!lastActivitysCriteria.equals(criteria))
            {
                collActivitys = ActivityPeer.doSelectJoinActivitySet(criteria);
            }
        }
        lastActivitysCriteria = criteria;

        return collActivitys;
                }
                  
                    
                    
                                            
                                                                          
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Issue is new, it will return
                 * an empty collection; or if this Issue has previously
     * been saved, it will retrieve related Activitys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Issue.
     */
    protected List getActivitysJoinScarabUserImplRelatedByOldUserId(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitys == null)
        {
            if (isNew())
            {
               collActivitys = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.ISSUE_ID, getIssueId());
                              collActivitys = ActivityPeer.doSelectJoinScarabUserImplRelatedByOldUserId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.ISSUE_ID, getIssueId());
                                    if (!lastActivitysCriteria.equals(criteria))
            {
                collActivitys = ActivityPeer.doSelectJoinScarabUserImplRelatedByOldUserId(criteria);
            }
        }
        lastActivitysCriteria = criteria;

        return collActivitys;
                }
                  
                    
                    
                                            
                                                                          
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Issue is new, it will return
                 * an empty collection; or if this Issue has previously
     * been saved, it will retrieve related Activitys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Issue.
     */
    protected List getActivitysJoinScarabUserImplRelatedByNewUserId(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitys == null)
        {
            if (isNew())
            {
               collActivitys = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.ISSUE_ID, getIssueId());
                              collActivitys = ActivityPeer.doSelectJoinScarabUserImplRelatedByNewUserId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.ISSUE_ID, getIssueId());
                                    if (!lastActivitysCriteria.equals(criteria))
            {
                collActivitys = ActivityPeer.doSelectJoinScarabUserImplRelatedByNewUserId(criteria);
            }
        }
        lastActivitysCriteria = criteria;

        return collActivitys;
                }
                  
                    
                    
                                            
                                                                          
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Issue is new, it will return
                 * an empty collection; or if this Issue has previously
     * been saved, it will retrieve related Activitys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Issue.
     */
    protected List getActivitysJoinAttributeOptionRelatedByOldOptionId(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitys == null)
        {
            if (isNew())
            {
               collActivitys = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.ISSUE_ID, getIssueId());
                              collActivitys = ActivityPeer.doSelectJoinAttributeOptionRelatedByOldOptionId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.ISSUE_ID, getIssueId());
                                    if (!lastActivitysCriteria.equals(criteria))
            {
                collActivitys = ActivityPeer.doSelectJoinAttributeOptionRelatedByOldOptionId(criteria);
            }
        }
        lastActivitysCriteria = criteria;

        return collActivitys;
                }
                  
                    
                    
                                            
                                                                          
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Issue is new, it will return
                 * an empty collection; or if this Issue has previously
     * been saved, it will retrieve related Activitys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Issue.
     */
    protected List getActivitysJoinAttributeOptionRelatedByNewOptionId(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitys == null)
        {
            if (isNew())
            {
               collActivitys = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.ISSUE_ID, getIssueId());
                              collActivitys = ActivityPeer.doSelectJoinAttributeOptionRelatedByNewOptionId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.ISSUE_ID, getIssueId());
                                    if (!lastActivitysCriteria.equals(criteria))
            {
                collActivitys = ActivityPeer.doSelectJoinAttributeOptionRelatedByNewOptionId(criteria);
            }
        }
        lastActivitysCriteria = criteria;

        return collActivitys;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Issue is new, it will return
                 * an empty collection; or if this Issue has previously
     * been saved, it will retrieve related Activitys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Issue.
     */
    protected List getActivitysJoinAttachment(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitys == null)
        {
            if (isNew())
            {
               collActivitys = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.ISSUE_ID, getIssueId());
                              collActivitys = ActivityPeer.doSelectJoinAttachment(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.ISSUE_ID, getIssueId());
                                    if (!lastActivitysCriteria.equals(criteria))
            {
                collActivitys = ActivityPeer.doSelectJoinAttachment(criteria);
            }
        }
        lastActivitysCriteria = criteria;

        return collActivitys;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Issue is new, it will return
                 * an empty collection; or if this Issue has previously
     * been saved, it will retrieve related Activitys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Issue.
     */
    protected List getActivitysJoinDepend(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitys == null)
        {
            if (isNew())
            {
               collActivitys = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.ISSUE_ID, getIssueId());
                              collActivitys = ActivityPeer.doSelectJoinDepend(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.ISSUE_ID, getIssueId());
                                    if (!lastActivitysCriteria.equals(criteria))
            {
                collActivitys = ActivityPeer.doSelectJoinDepend(criteria);
            }
        }
        lastActivitysCriteria = criteria;

        return collActivitys;
                }
                            


                          
            
          /**
     * Collection to store aggregation of collAttachments
     */
    protected List collAttachments;

    /**
     * Temporary storage of collAttachments to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initAttachments()
    {
        if (collAttachments == null)
        {
            collAttachments = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a Attachment object to this object
     * through the Attachment foreign key attribute
     *
     * @param l Attachment
     * @throws TorqueException
     */
    public void addAttachment(Attachment l) throws TorqueException
    {
        getAttachments().add(l);
        l.setIssue((Issue) this);
    }

    /**
     * The criteria used to select the current contents of collAttachments
     */
    private Criteria lastAttachmentsCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getAttachments(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getAttachments()
              throws TorqueException
          {
                      if (collAttachments == null)
        {
            collAttachments = getAttachments(new Criteria(10));
        }
                return collAttachments;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Issue has previously
           * been saved, it will retrieve related Attachments from storage.
     * If this Issue is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getAttachments(Criteria criteria) throws TorqueException
    {
              if (collAttachments == null)
        {
            if (isNew())
            {
               collAttachments = new ArrayList();
            }
            else
            {
                        criteria.add(AttachmentPeer.ISSUE_ID, getIssueId() );
                        collAttachments = AttachmentPeer.doSelect(criteria);
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
                            criteria.add(AttachmentPeer.ISSUE_ID, getIssueId());
                            if (!lastAttachmentsCriteria.equals(criteria))
                {
                    collAttachments = AttachmentPeer.doSelect(criteria);
                }
            }
        }
        lastAttachmentsCriteria = criteria;

        return collAttachments;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getAttachments(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getAttachments(Connection con) throws TorqueException
    {
              if (collAttachments == null)
        {
            collAttachments = getAttachments(new Criteria(10), con);
        }
        return collAttachments;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Issue has previously
           * been saved, it will retrieve related Attachments from storage.
     * If this Issue is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getAttachments(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collAttachments == null)
        {
            if (isNew())
            {
               collAttachments = new ArrayList();
            }
            else
            {
                         criteria.add(AttachmentPeer.ISSUE_ID, getIssueId());
                         collAttachments = AttachmentPeer.doSelect(criteria, con);
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
                             criteria.add(AttachmentPeer.ISSUE_ID, getIssueId());
                             if (!lastAttachmentsCriteria.equals(criteria))
                 {
                     collAttachments = AttachmentPeer.doSelect(criteria, con);
                 }
             }
         }
         lastAttachmentsCriteria = criteria;

         return collAttachments;
           }

                                    
              
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Issue is new, it will return
                 * an empty collection; or if this Issue has previously
     * been saved, it will retrieve related Attachments from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Issue.
     */
    protected List getAttachmentsJoinIssue(Criteria criteria)
        throws TorqueException
    {
                    if (collAttachments == null)
        {
            if (isNew())
            {
               collAttachments = new ArrayList();
            }
            else
            {
                              criteria.add(AttachmentPeer.ISSUE_ID, getIssueId());
                              collAttachments = AttachmentPeer.doSelectJoinIssue(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttachmentPeer.ISSUE_ID, getIssueId());
                                    if (!lastAttachmentsCriteria.equals(criteria))
            {
                collAttachments = AttachmentPeer.doSelectJoinIssue(criteria);
            }
        }
        lastAttachmentsCriteria = criteria;

        return collAttachments;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Issue is new, it will return
                 * an empty collection; or if this Issue has previously
     * been saved, it will retrieve related Attachments from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Issue.
     */
    protected List getAttachmentsJoinAttachmentType(Criteria criteria)
        throws TorqueException
    {
                    if (collAttachments == null)
        {
            if (isNew())
            {
               collAttachments = new ArrayList();
            }
            else
            {
                              criteria.add(AttachmentPeer.ISSUE_ID, getIssueId());
                              collAttachments = AttachmentPeer.doSelectJoinAttachmentType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttachmentPeer.ISSUE_ID, getIssueId());
                                    if (!lastAttachmentsCriteria.equals(criteria))
            {
                collAttachments = AttachmentPeer.doSelectJoinAttachmentType(criteria);
            }
        }
        lastAttachmentsCriteria = criteria;

        return collAttachments;
                }
                  
                    
                    
                                            
                                                                          
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Issue is new, it will return
                 * an empty collection; or if this Issue has previously
     * been saved, it will retrieve related Attachments from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Issue.
     */
    protected List getAttachmentsJoinScarabUserImplRelatedByCreatedBy(Criteria criteria)
        throws TorqueException
    {
                    if (collAttachments == null)
        {
            if (isNew())
            {
               collAttachments = new ArrayList();
            }
            else
            {
                              criteria.add(AttachmentPeer.ISSUE_ID, getIssueId());
                              collAttachments = AttachmentPeer.doSelectJoinScarabUserImplRelatedByCreatedBy(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttachmentPeer.ISSUE_ID, getIssueId());
                                    if (!lastAttachmentsCriteria.equals(criteria))
            {
                collAttachments = AttachmentPeer.doSelectJoinScarabUserImplRelatedByCreatedBy(criteria);
            }
        }
        lastAttachmentsCriteria = criteria;

        return collAttachments;
                }
                  
                    
                    
                                            
                                                                          
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Issue is new, it will return
                 * an empty collection; or if this Issue has previously
     * been saved, it will retrieve related Attachments from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Issue.
     */
    protected List getAttachmentsJoinScarabUserImplRelatedByModifiedBy(Criteria criteria)
        throws TorqueException
    {
                    if (collAttachments == null)
        {
            if (isNew())
            {
               collAttachments = new ArrayList();
            }
            else
            {
                              criteria.add(AttachmentPeer.ISSUE_ID, getIssueId());
                              collAttachments = AttachmentPeer.doSelectJoinScarabUserImplRelatedByModifiedBy(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttachmentPeer.ISSUE_ID, getIssueId());
                                    if (!lastAttachmentsCriteria.equals(criteria))
            {
                collAttachments = AttachmentPeer.doSelectJoinScarabUserImplRelatedByModifiedBy(criteria);
            }
        }
        lastAttachmentsCriteria = criteria;

        return collAttachments;
                }
                            


                                  
            
          /**
     * Collection to store aggregation of collDependsRelatedByObservedId
     */
    protected List collDependsRelatedByObservedId;

    /**
     * Temporary storage of collDependsRelatedByObservedId to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initDependsRelatedByObservedId()
    {
        if (collDependsRelatedByObservedId == null)
        {
            collDependsRelatedByObservedId = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a Depend object to this object
     * through the Depend foreign key attribute
     *
     * @param l Depend
     * @throws TorqueException
     */
    public void addDependRelatedByObservedId(Depend l) throws TorqueException
    {
        getDependsRelatedByObservedId().add(l);
        l.setIssueRelatedByObservedId((Issue) this);
    }

    /**
     * The criteria used to select the current contents of collDependsRelatedByObservedId
     */
    private Criteria lastDependsRelatedByObservedIdCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getDependsRelatedByObservedId(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getDependsRelatedByObservedId()
              throws TorqueException
          {
                      if (collDependsRelatedByObservedId == null)
        {
            collDependsRelatedByObservedId = getDependsRelatedByObservedId(new Criteria(10));
        }
                return collDependsRelatedByObservedId;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Issue has previously
           * been saved, it will retrieve related DependsRelatedByObservedId from storage.
     * If this Issue is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getDependsRelatedByObservedId(Criteria criteria) throws TorqueException
    {
              if (collDependsRelatedByObservedId == null)
        {
            if (isNew())
            {
               collDependsRelatedByObservedId = new ArrayList();
            }
            else
            {
                        criteria.add(DependPeer.OBSERVED_ID, getIssueId() );
                        collDependsRelatedByObservedId = DependPeer.doSelect(criteria);
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
                            criteria.add(DependPeer.OBSERVED_ID, getIssueId());
                            if (!lastDependsRelatedByObservedIdCriteria.equals(criteria))
                {
                    collDependsRelatedByObservedId = DependPeer.doSelect(criteria);
                }
            }
        }
        lastDependsRelatedByObservedIdCriteria = criteria;

        return collDependsRelatedByObservedId;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getDependsRelatedByObservedId(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getDependsRelatedByObservedId(Connection con) throws TorqueException
    {
              if (collDependsRelatedByObservedId == null)
        {
            collDependsRelatedByObservedId = getDependsRelatedByObservedId(new Criteria(10), con);
        }
        return collDependsRelatedByObservedId;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Issue has previously
           * been saved, it will retrieve related DependsRelatedByObservedId from storage.
     * If this Issue is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getDependsRelatedByObservedId(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collDependsRelatedByObservedId == null)
        {
            if (isNew())
            {
               collDependsRelatedByObservedId = new ArrayList();
            }
            else
            {
                         criteria.add(DependPeer.OBSERVED_ID, getIssueId());
                         collDependsRelatedByObservedId = DependPeer.doSelect(criteria, con);
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
                             criteria.add(DependPeer.OBSERVED_ID, getIssueId());
                             if (!lastDependsRelatedByObservedIdCriteria.equals(criteria))
                 {
                     collDependsRelatedByObservedId = DependPeer.doSelect(criteria, con);
                 }
             }
         }
         lastDependsRelatedByObservedIdCriteria = criteria;

         return collDependsRelatedByObservedId;
           }

                              
              
                    
                              
                                            
                                                                          
                                        
                    
                                            
                  
                    
                              
                                            
                                                                          
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Issue is new, it will return
                 * an empty collection; or if this Issue has previously
     * been saved, it will retrieve related DependsRelatedByObservedId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Issue.
     */
    protected List getDependsRelatedByObservedIdJoinIssueRelatedByObserverId(Criteria criteria)
        throws TorqueException
    {
                    if (collDependsRelatedByObservedId == null)
        {
            if (isNew())
            {
               collDependsRelatedByObservedId = new ArrayList();
            }
            else
            {
                              criteria.add(DependPeer.OBSERVED_ID, getIssueId());
                              collDependsRelatedByObservedId = DependPeer.doSelectJoinIssueRelatedByObserverId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(DependPeer.OBSERVED_ID, getIssueId());
                                    if (!lastDependsRelatedByObservedIdCriteria.equals(criteria))
            {
                collDependsRelatedByObservedId = DependPeer.doSelectJoinIssueRelatedByObserverId(criteria);
            }
        }
        lastDependsRelatedByObservedIdCriteria = criteria;

        return collDependsRelatedByObservedId;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Issue is new, it will return
                 * an empty collection; or if this Issue has previously
     * been saved, it will retrieve related DependsRelatedByObservedId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Issue.
     */
    protected List getDependsRelatedByObservedIdJoinDependType(Criteria criteria)
        throws TorqueException
    {
                    if (collDependsRelatedByObservedId == null)
        {
            if (isNew())
            {
               collDependsRelatedByObservedId = new ArrayList();
            }
            else
            {
                              criteria.add(DependPeer.OBSERVED_ID, getIssueId());
                              collDependsRelatedByObservedId = DependPeer.doSelectJoinDependType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(DependPeer.OBSERVED_ID, getIssueId());
                                    if (!lastDependsRelatedByObservedIdCriteria.equals(criteria))
            {
                collDependsRelatedByObservedId = DependPeer.doSelectJoinDependType(criteria);
            }
        }
        lastDependsRelatedByObservedIdCriteria = criteria;

        return collDependsRelatedByObservedId;
                }
                            


                                  
            
          /**
     * Collection to store aggregation of collDependsRelatedByObserverId
     */
    protected List collDependsRelatedByObserverId;

    /**
     * Temporary storage of collDependsRelatedByObserverId to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initDependsRelatedByObserverId()
    {
        if (collDependsRelatedByObserverId == null)
        {
            collDependsRelatedByObserverId = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a Depend object to this object
     * through the Depend foreign key attribute
     *
     * @param l Depend
     * @throws TorqueException
     */
    public void addDependRelatedByObserverId(Depend l) throws TorqueException
    {
        getDependsRelatedByObserverId().add(l);
        l.setIssueRelatedByObserverId((Issue) this);
    }

    /**
     * The criteria used to select the current contents of collDependsRelatedByObserverId
     */
    private Criteria lastDependsRelatedByObserverIdCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getDependsRelatedByObserverId(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getDependsRelatedByObserverId()
              throws TorqueException
          {
                      if (collDependsRelatedByObserverId == null)
        {
            collDependsRelatedByObserverId = getDependsRelatedByObserverId(new Criteria(10));
        }
                return collDependsRelatedByObserverId;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Issue has previously
           * been saved, it will retrieve related DependsRelatedByObserverId from storage.
     * If this Issue is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getDependsRelatedByObserverId(Criteria criteria) throws TorqueException
    {
              if (collDependsRelatedByObserverId == null)
        {
            if (isNew())
            {
               collDependsRelatedByObserverId = new ArrayList();
            }
            else
            {
                        criteria.add(DependPeer.OBSERVER_ID, getIssueId() );
                        collDependsRelatedByObserverId = DependPeer.doSelect(criteria);
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
                            criteria.add(DependPeer.OBSERVER_ID, getIssueId());
                            if (!lastDependsRelatedByObserverIdCriteria.equals(criteria))
                {
                    collDependsRelatedByObserverId = DependPeer.doSelect(criteria);
                }
            }
        }
        lastDependsRelatedByObserverIdCriteria = criteria;

        return collDependsRelatedByObserverId;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getDependsRelatedByObserverId(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getDependsRelatedByObserverId(Connection con) throws TorqueException
    {
              if (collDependsRelatedByObserverId == null)
        {
            collDependsRelatedByObserverId = getDependsRelatedByObserverId(new Criteria(10), con);
        }
        return collDependsRelatedByObserverId;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Issue has previously
           * been saved, it will retrieve related DependsRelatedByObserverId from storage.
     * If this Issue is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getDependsRelatedByObserverId(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collDependsRelatedByObserverId == null)
        {
            if (isNew())
            {
               collDependsRelatedByObserverId = new ArrayList();
            }
            else
            {
                         criteria.add(DependPeer.OBSERVER_ID, getIssueId());
                         collDependsRelatedByObserverId = DependPeer.doSelect(criteria, con);
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
                             criteria.add(DependPeer.OBSERVER_ID, getIssueId());
                             if (!lastDependsRelatedByObserverIdCriteria.equals(criteria))
                 {
                     collDependsRelatedByObserverId = DependPeer.doSelect(criteria, con);
                 }
             }
         }
         lastDependsRelatedByObserverIdCriteria = criteria;

         return collDependsRelatedByObserverId;
           }

                              
              
                    
                              
                                            
                                                                          
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Issue is new, it will return
                 * an empty collection; or if this Issue has previously
     * been saved, it will retrieve related DependsRelatedByObserverId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Issue.
     */
    protected List getDependsRelatedByObserverIdJoinIssueRelatedByObservedId(Criteria criteria)
        throws TorqueException
    {
                    if (collDependsRelatedByObserverId == null)
        {
            if (isNew())
            {
               collDependsRelatedByObserverId = new ArrayList();
            }
            else
            {
                              criteria.add(DependPeer.OBSERVER_ID, getIssueId());
                              collDependsRelatedByObserverId = DependPeer.doSelectJoinIssueRelatedByObservedId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(DependPeer.OBSERVER_ID, getIssueId());
                                    if (!lastDependsRelatedByObserverIdCriteria.equals(criteria))
            {
                collDependsRelatedByObserverId = DependPeer.doSelectJoinIssueRelatedByObservedId(criteria);
            }
        }
        lastDependsRelatedByObserverIdCriteria = criteria;

        return collDependsRelatedByObserverId;
                }
                  
                    
                              
                                            
                                                                          
                                        
                    
                                            
                  
                    
                    
                                
                                                              
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Issue is new, it will return
                 * an empty collection; or if this Issue has previously
     * been saved, it will retrieve related DependsRelatedByObserverId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Issue.
     */
    protected List getDependsRelatedByObserverIdJoinDependType(Criteria criteria)
        throws TorqueException
    {
                    if (collDependsRelatedByObserverId == null)
        {
            if (isNew())
            {
               collDependsRelatedByObserverId = new ArrayList();
            }
            else
            {
                              criteria.add(DependPeer.OBSERVER_ID, getIssueId());
                              collDependsRelatedByObserverId = DependPeer.doSelectJoinDependType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(DependPeer.OBSERVER_ID, getIssueId());
                                    if (!lastDependsRelatedByObserverIdCriteria.equals(criteria))
            {
                collDependsRelatedByObserverId = DependPeer.doSelectJoinDependType(criteria);
            }
        }
        lastDependsRelatedByObserverIdCriteria = criteria;

        return collDependsRelatedByObserverId;
                }
                            


                          
            
          /**
     * Collection to store aggregation of collAttributeValues
     */
    protected List collAttributeValues;

    /**
     * Temporary storage of collAttributeValues to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initAttributeValues()
    {
        if (collAttributeValues == null)
        {
            collAttributeValues = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a AttributeValue object to this object
     * through the AttributeValue foreign key attribute
     *
     * @param l AttributeValue
     * @throws TorqueException
     */
    public void addAttributeValue(AttributeValue l) throws TorqueException
    {
        getAttributeValues().add(l);
        l.setIssue((Issue) this);
    }

    /**
     * The criteria used to select the current contents of collAttributeValues
     */
    private Criteria lastAttributeValuesCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getAttributeValues(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getAttributeValues()
              throws TorqueException
          {
                      if (collAttributeValues == null)
        {
            collAttributeValues = getAttributeValues(new Criteria(10));
        }
                return collAttributeValues;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Issue has previously
           * been saved, it will retrieve related AttributeValues from storage.
     * If this Issue is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getAttributeValues(Criteria criteria) throws TorqueException
    {
              if (collAttributeValues == null)
        {
            if (isNew())
            {
               collAttributeValues = new ArrayList();
            }
            else
            {
                        criteria.add(AttributeValuePeer.ISSUE_ID, getIssueId() );
                        collAttributeValues = AttributeValuePeer.doSelect(criteria);
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
                            criteria.add(AttributeValuePeer.ISSUE_ID, getIssueId());
                            if (!lastAttributeValuesCriteria.equals(criteria))
                {
                    collAttributeValues = AttributeValuePeer.doSelect(criteria);
                }
            }
        }
        lastAttributeValuesCriteria = criteria;

        return collAttributeValues;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getAttributeValues(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getAttributeValues(Connection con) throws TorqueException
    {
              if (collAttributeValues == null)
        {
            collAttributeValues = getAttributeValues(new Criteria(10), con);
        }
        return collAttributeValues;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Issue has previously
           * been saved, it will retrieve related AttributeValues from storage.
     * If this Issue is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getAttributeValues(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collAttributeValues == null)
        {
            if (isNew())
            {
               collAttributeValues = new ArrayList();
            }
            else
            {
                         criteria.add(AttributeValuePeer.ISSUE_ID, getIssueId());
                         collAttributeValues = AttributeValuePeer.doSelect(criteria, con);
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
                             criteria.add(AttributeValuePeer.ISSUE_ID, getIssueId());
                             if (!lastAttributeValuesCriteria.equals(criteria))
                 {
                     collAttributeValues = AttributeValuePeer.doSelect(criteria, con);
                 }
             }
         }
         lastAttributeValuesCriteria = criteria;

         return collAttributeValues;
           }

                                    
              
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Issue is new, it will return
                 * an empty collection; or if this Issue has previously
     * been saved, it will retrieve related AttributeValues from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Issue.
     */
    protected List getAttributeValuesJoinIssue(Criteria criteria)
        throws TorqueException
    {
                    if (collAttributeValues == null)
        {
            if (isNew())
            {
               collAttributeValues = new ArrayList();
            }
            else
            {
                              criteria.add(AttributeValuePeer.ISSUE_ID, getIssueId());
                              collAttributeValues = AttributeValuePeer.doSelectJoinIssue(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttributeValuePeer.ISSUE_ID, getIssueId());
                                    if (!lastAttributeValuesCriteria.equals(criteria))
            {
                collAttributeValues = AttributeValuePeer.doSelectJoinIssue(criteria);
            }
        }
        lastAttributeValuesCriteria = criteria;

        return collAttributeValues;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Issue is new, it will return
                 * an empty collection; or if this Issue has previously
     * been saved, it will retrieve related AttributeValues from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Issue.
     */
    protected List getAttributeValuesJoinAttribute(Criteria criteria)
        throws TorqueException
    {
                    if (collAttributeValues == null)
        {
            if (isNew())
            {
               collAttributeValues = new ArrayList();
            }
            else
            {
                              criteria.add(AttributeValuePeer.ISSUE_ID, getIssueId());
                              collAttributeValues = AttributeValuePeer.doSelectJoinAttribute(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttributeValuePeer.ISSUE_ID, getIssueId());
                                    if (!lastAttributeValuesCriteria.equals(criteria))
            {
                collAttributeValues = AttributeValuePeer.doSelectJoinAttribute(criteria);
            }
        }
        lastAttributeValuesCriteria = criteria;

        return collAttributeValues;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Issue is new, it will return
                 * an empty collection; or if this Issue has previously
     * been saved, it will retrieve related AttributeValues from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Issue.
     */
    protected List getAttributeValuesJoinAttributeOption(Criteria criteria)
        throws TorqueException
    {
                    if (collAttributeValues == null)
        {
            if (isNew())
            {
               collAttributeValues = new ArrayList();
            }
            else
            {
                              criteria.add(AttributeValuePeer.ISSUE_ID, getIssueId());
                              collAttributeValues = AttributeValuePeer.doSelectJoinAttributeOption(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttributeValuePeer.ISSUE_ID, getIssueId());
                                    if (!lastAttributeValuesCriteria.equals(criteria))
            {
                collAttributeValues = AttributeValuePeer.doSelectJoinAttributeOption(criteria);
            }
        }
        lastAttributeValuesCriteria = criteria;

        return collAttributeValues;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Issue is new, it will return
                 * an empty collection; or if this Issue has previously
     * been saved, it will retrieve related AttributeValues from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Issue.
     */
    protected List getAttributeValuesJoinScarabUserImpl(Criteria criteria)
        throws TorqueException
    {
                    if (collAttributeValues == null)
        {
            if (isNew())
            {
               collAttributeValues = new ArrayList();
            }
            else
            {
                              criteria.add(AttributeValuePeer.ISSUE_ID, getIssueId());
                              collAttributeValues = AttributeValuePeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttributeValuePeer.ISSUE_ID, getIssueId());
                                    if (!lastAttributeValuesCriteria.equals(criteria))
            {
                collAttributeValues = AttributeValuePeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        lastAttributeValuesCriteria = criteria;

        return collAttributeValues;
                }
                            


                          
            
          /**
     * Collection to store aggregation of collIssueVotes
     */
    protected List collIssueVotes;

    /**
     * Temporary storage of collIssueVotes to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initIssueVotes()
    {
        if (collIssueVotes == null)
        {
            collIssueVotes = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a IssueVote object to this object
     * through the IssueVote foreign key attribute
     *
     * @param l IssueVote
     * @throws TorqueException
     */
    public void addIssueVote(IssueVote l) throws TorqueException
    {
        getIssueVotes().add(l);
        l.setIssue((Issue) this);
    }

    /**
     * The criteria used to select the current contents of collIssueVotes
     */
    private Criteria lastIssueVotesCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getIssueVotes(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getIssueVotes()
              throws TorqueException
          {
                      if (collIssueVotes == null)
        {
            collIssueVotes = getIssueVotes(new Criteria(10));
        }
                return collIssueVotes;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Issue has previously
           * been saved, it will retrieve related IssueVotes from storage.
     * If this Issue is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getIssueVotes(Criteria criteria) throws TorqueException
    {
              if (collIssueVotes == null)
        {
            if (isNew())
            {
               collIssueVotes = new ArrayList();
            }
            else
            {
                        criteria.add(IssueVotePeer.ISSUE_ID, getIssueId() );
                        collIssueVotes = IssueVotePeer.doSelect(criteria);
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
                            criteria.add(IssueVotePeer.ISSUE_ID, getIssueId());
                            if (!lastIssueVotesCriteria.equals(criteria))
                {
                    collIssueVotes = IssueVotePeer.doSelect(criteria);
                }
            }
        }
        lastIssueVotesCriteria = criteria;

        return collIssueVotes;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getIssueVotes(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getIssueVotes(Connection con) throws TorqueException
    {
              if (collIssueVotes == null)
        {
            collIssueVotes = getIssueVotes(new Criteria(10), con);
        }
        return collIssueVotes;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Issue has previously
           * been saved, it will retrieve related IssueVotes from storage.
     * If this Issue is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getIssueVotes(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collIssueVotes == null)
        {
            if (isNew())
            {
               collIssueVotes = new ArrayList();
            }
            else
            {
                         criteria.add(IssueVotePeer.ISSUE_ID, getIssueId());
                         collIssueVotes = IssueVotePeer.doSelect(criteria, con);
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
                             criteria.add(IssueVotePeer.ISSUE_ID, getIssueId());
                             if (!lastIssueVotesCriteria.equals(criteria))
                 {
                     collIssueVotes = IssueVotePeer.doSelect(criteria, con);
                 }
             }
         }
         lastIssueVotesCriteria = criteria;

         return collIssueVotes;
           }

                        
              
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Issue is new, it will return
                 * an empty collection; or if this Issue has previously
     * been saved, it will retrieve related IssueVotes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Issue.
     */
    protected List getIssueVotesJoinIssue(Criteria criteria)
        throws TorqueException
    {
                    if (collIssueVotes == null)
        {
            if (isNew())
            {
               collIssueVotes = new ArrayList();
            }
            else
            {
                              criteria.add(IssueVotePeer.ISSUE_ID, getIssueId());
                              collIssueVotes = IssueVotePeer.doSelectJoinIssue(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(IssueVotePeer.ISSUE_ID, getIssueId());
                                    if (!lastIssueVotesCriteria.equals(criteria))
            {
                collIssueVotes = IssueVotePeer.doSelectJoinIssue(criteria);
            }
        }
        lastIssueVotesCriteria = criteria;

        return collIssueVotes;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Issue is new, it will return
                 * an empty collection; or if this Issue has previously
     * been saved, it will retrieve related IssueVotes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Issue.
     */
    protected List getIssueVotesJoinScarabUserImpl(Criteria criteria)
        throws TorqueException
    {
                    if (collIssueVotes == null)
        {
            if (isNew())
            {
               collIssueVotes = new ArrayList();
            }
            else
            {
                              criteria.add(IssueVotePeer.ISSUE_ID, getIssueId());
                              collIssueVotes = IssueVotePeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(IssueVotePeer.ISSUE_ID, getIssueId());
                                    if (!lastIssueVotesCriteria.equals(criteria))
            {
                collIssueVotes = IssueVotePeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        lastIssueVotesCriteria = criteria;

        return collIssueVotes;
                }
                            


                          
            
          /**
     * Collection to store aggregation of collIssueTemplateInfos
     */
    protected List collIssueTemplateInfos;

    /**
     * Temporary storage of collIssueTemplateInfos to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initIssueTemplateInfos()
    {
        if (collIssueTemplateInfos == null)
        {
            collIssueTemplateInfos = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a IssueTemplateInfo object to this object
     * through the IssueTemplateInfo foreign key attribute
     *
     * @param l IssueTemplateInfo
     * @throws TorqueException
     */
    public void addIssueTemplateInfo(IssueTemplateInfo l) throws TorqueException
    {
        getIssueTemplateInfos().add(l);
        l.setIssue((Issue) this);
    }

    /**
     * The criteria used to select the current contents of collIssueTemplateInfos
     */
    private Criteria lastIssueTemplateInfosCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getIssueTemplateInfos(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getIssueTemplateInfos()
              throws TorqueException
          {
                      if (collIssueTemplateInfos == null)
        {
            collIssueTemplateInfos = getIssueTemplateInfos(new Criteria(10));
        }
                return collIssueTemplateInfos;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Issue has previously
           * been saved, it will retrieve related IssueTemplateInfos from storage.
     * If this Issue is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getIssueTemplateInfos(Criteria criteria) throws TorqueException
    {
              if (collIssueTemplateInfos == null)
        {
            if (isNew())
            {
               collIssueTemplateInfos = new ArrayList();
            }
            else
            {
                        criteria.add(IssueTemplateInfoPeer.ISSUE_ID, getIssueId() );
                        collIssueTemplateInfos = IssueTemplateInfoPeer.doSelect(criteria);
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
                            criteria.add(IssueTemplateInfoPeer.ISSUE_ID, getIssueId());
                            if (!lastIssueTemplateInfosCriteria.equals(criteria))
                {
                    collIssueTemplateInfos = IssueTemplateInfoPeer.doSelect(criteria);
                }
            }
        }
        lastIssueTemplateInfosCriteria = criteria;

        return collIssueTemplateInfos;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getIssueTemplateInfos(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getIssueTemplateInfos(Connection con) throws TorqueException
    {
              if (collIssueTemplateInfos == null)
        {
            collIssueTemplateInfos = getIssueTemplateInfos(new Criteria(10), con);
        }
        return collIssueTemplateInfos;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Issue has previously
           * been saved, it will retrieve related IssueTemplateInfos from storage.
     * If this Issue is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getIssueTemplateInfos(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collIssueTemplateInfos == null)
        {
            if (isNew())
            {
               collIssueTemplateInfos = new ArrayList();
            }
            else
            {
                         criteria.add(IssueTemplateInfoPeer.ISSUE_ID, getIssueId());
                         collIssueTemplateInfos = IssueTemplateInfoPeer.doSelect(criteria, con);
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
                             criteria.add(IssueTemplateInfoPeer.ISSUE_ID, getIssueId());
                             if (!lastIssueTemplateInfosCriteria.equals(criteria))
                 {
                     collIssueTemplateInfos = IssueTemplateInfoPeer.doSelect(criteria, con);
                 }
             }
         }
         lastIssueTemplateInfosCriteria = criteria;

         return collIssueTemplateInfos;
           }

                        
              
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Issue is new, it will return
                 * an empty collection; or if this Issue has previously
     * been saved, it will retrieve related IssueTemplateInfos from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Issue.
     */
    protected List getIssueTemplateInfosJoinIssue(Criteria criteria)
        throws TorqueException
    {
                    if (collIssueTemplateInfos == null)
        {
            if (isNew())
            {
               collIssueTemplateInfos = new ArrayList();
            }
            else
            {
                              criteria.add(IssueTemplateInfoPeer.ISSUE_ID, getIssueId());
                              collIssueTemplateInfos = IssueTemplateInfoPeer.doSelectJoinIssue(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(IssueTemplateInfoPeer.ISSUE_ID, getIssueId());
                                    if (!lastIssueTemplateInfosCriteria.equals(criteria))
            {
                collIssueTemplateInfos = IssueTemplateInfoPeer.doSelectJoinIssue(criteria);
            }
        }
        lastIssueTemplateInfosCriteria = criteria;

        return collIssueTemplateInfos;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Issue is new, it will return
                 * an empty collection; or if this Issue has previously
     * been saved, it will retrieve related IssueTemplateInfos from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Issue.
     */
    protected List getIssueTemplateInfosJoinScope(Criteria criteria)
        throws TorqueException
    {
                    if (collIssueTemplateInfos == null)
        {
            if (isNew())
            {
               collIssueTemplateInfos = new ArrayList();
            }
            else
            {
                              criteria.add(IssueTemplateInfoPeer.ISSUE_ID, getIssueId());
                              collIssueTemplateInfos = IssueTemplateInfoPeer.doSelectJoinScope(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(IssueTemplateInfoPeer.ISSUE_ID, getIssueId());
                                    if (!lastIssueTemplateInfosCriteria.equals(criteria))
            {
                collIssueTemplateInfos = IssueTemplateInfoPeer.doSelectJoinScope(criteria);
            }
        }
        lastIssueTemplateInfosCriteria = criteria;

        return collIssueTemplateInfos;
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
              fieldNames.add("IdPrefix");
              fieldNames.add("IdCount");
              fieldNames.add("IdDomain");
              fieldNames.add("TypeId");
              fieldNames.add("ModuleId");
              fieldNames.add("CreatedTransId");
              fieldNames.add("LastTransId");
              fieldNames.add("Deleted");
              fieldNames.add("Moved");
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
          if (name.equals("IdPrefix"))
        {
                return getIdPrefix();
            }
          if (name.equals("IdCount"))
        {
                return new Integer(getIdCount());
            }
          if (name.equals("IdDomain"))
        {
                return getIdDomain();
            }
          if (name.equals("TypeId"))
        {
                return getTypeId();
            }
          if (name.equals("ModuleId"))
        {
                return getModuleId();
            }
          if (name.equals("CreatedTransId"))
        {
                return getCreatedTransId();
            }
          if (name.equals("LastTransId"))
        {
                return getLastTransId();
            }
          if (name.equals("Deleted"))
        {
                return Boolean.valueOf(getDeleted());
            }
          if (name.equals("Moved"))
        {
                return Boolean.valueOf(getMoved());
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
          if (name.equals(IssuePeer.ISSUE_ID))
        {
                return getIssueId();
            }
          if (name.equals(IssuePeer.ID_PREFIX))
        {
                return getIdPrefix();
            }
          if (name.equals(IssuePeer.ID_COUNT))
        {
                return new Integer(getIdCount());
            }
          if (name.equals(IssuePeer.ID_DOMAIN))
        {
                return getIdDomain();
            }
          if (name.equals(IssuePeer.TYPE_ID))
        {
                return getTypeId();
            }
          if (name.equals(IssuePeer.MODULE_ID))
        {
                return getModuleId();
            }
          if (name.equals(IssuePeer.CREATED_TRANS_ID))
        {
                return getCreatedTransId();
            }
          if (name.equals(IssuePeer.LAST_TRANS_ID))
        {
                return getLastTransId();
            }
          if (name.equals(IssuePeer.DELETED))
        {
                return Boolean.valueOf(getDeleted());
            }
          if (name.equals(IssuePeer.MOVED))
        {
                return Boolean.valueOf(getMoved());
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
                return getIdPrefix();
            }
              if (pos == 2)
        {
                return new Integer(getIdCount());
            }
              if (pos == 3)
        {
                return getIdDomain();
            }
              if (pos == 4)
        {
                return getTypeId();
            }
              if (pos == 5)
        {
                return getModuleId();
            }
              if (pos == 6)
        {
                return getCreatedTransId();
            }
              if (pos == 7)
        {
                return getLastTransId();
            }
              if (pos == 8)
        {
                return Boolean.valueOf(getDeleted());
            }
              if (pos == 9)
        {
                return Boolean.valueOf(getMoved());
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
          save(IssuePeer.getMapBuilder()
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
                    IssuePeer.doInsert((Issue) this, con);
                    setNew(false);
                }
                else
                {
                    IssuePeer.doUpdate((Issue) this, con);
                }

    
                      if (isCacheOnSave())
                {
                    IssueManager.putInstance(this);
                }
              }

                                      
                                    if (collActivitys != null)
            {
                for (int i = 0; i < collActivitys.size(); i++)
                {
                    ((Activity) collActivitys.get(i)).save(con);
                }
            }
                                                  
                                    if (collAttachments != null)
            {
                for (int i = 0; i < collAttachments.size(); i++)
                {
                    ((Attachment) collAttachments.get(i)).save(con);
                }
            }
                                                            
                                    if (collDependsRelatedByObservedId != null)
            {
                for (int i = 0; i < collDependsRelatedByObservedId.size(); i++)
                {
                    ((Depend) collDependsRelatedByObservedId.get(i)).save(con);
                }
            }
                                                            
                                    if (collDependsRelatedByObserverId != null)
            {
                for (int i = 0; i < collDependsRelatedByObserverId.size(); i++)
                {
                    ((Depend) collDependsRelatedByObserverId.get(i)).save(con);
                }
            }
                                                  
                                    if (collAttributeValues != null)
            {
                for (int i = 0; i < collAttributeValues.size(); i++)
                {
                    ((AttributeValue) collAttributeValues.get(i)).save(con);
                }
            }
                                                  
                                    if (collIssueVotes != null)
            {
                for (int i = 0; i < collIssueVotes.size(); i++)
                {
                    ((IssueVote) collIssueVotes.get(i)).save(con);
                }
            }
                                                  
                                    if (collIssueTemplateInfos != null)
            {
                for (int i = 0; i < collIssueTemplateInfos.size(); i++)
                {
                    ((IssueTemplateInfo) collIssueTemplateInfos.get(i)).save(con);
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
      public Issue copy() throws TorqueException
    {
        return copyInto(new Issue());
    }
  
    protected Issue copyInto(Issue copyObj) throws TorqueException
    {
          copyObj.setIssueId(issueId);
          copyObj.setIdPrefix(idPrefix);
          copyObj.setIdCount(idCount);
          copyObj.setIdDomain(idDomain);
          copyObj.setTypeId(typeId);
          copyObj.setModuleId(moduleId);
          copyObj.setCreatedTransId(createdTransId);
          copyObj.setLastTransId(lastTransId);
          copyObj.setDeleted(deleted);
          copyObj.setMoved(moved);
  
                    copyObj.setIssueId((Long)null);
                                                                  
                                      
                            
        List v = getActivitys();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                Activity obj = (Activity) v.get(i);
                copyObj.addActivity(obj.copy());
            }
        }
        else
        {
            copyObj.collActivitys = null;
        }
                                                  
                            
        v = getAttachments();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                Attachment obj = (Attachment) v.get(i);
                copyObj.addAttachment(obj.copy());
            }
        }
        else
        {
            copyObj.collAttachments = null;
        }
                                                            
                            
        v = getDependsRelatedByObservedId();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                Depend obj = (Depend) v.get(i);
                copyObj.addDependRelatedByObservedId(obj.copy());
            }
        }
        else
        {
            copyObj.collDependsRelatedByObservedId = null;
        }
                                                            
                            
        v = getDependsRelatedByObserverId();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                Depend obj = (Depend) v.get(i);
                copyObj.addDependRelatedByObserverId(obj.copy());
            }
        }
        else
        {
            copyObj.collDependsRelatedByObserverId = null;
        }
                                                  
                            
        v = getAttributeValues();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                AttributeValue obj = (AttributeValue) v.get(i);
                copyObj.addAttributeValue(obj.copy());
            }
        }
        else
        {
            copyObj.collAttributeValues = null;
        }
                                                  
                            
        v = getIssueVotes();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                IssueVote obj = (IssueVote) v.get(i);
                copyObj.addIssueVote(obj.copy());
            }
        }
        else
        {
            copyObj.collIssueVotes = null;
        }
                                                  
                            
        v = getIssueTemplateInfos();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                IssueTemplateInfo obj = (IssueTemplateInfo) v.get(i);
                copyObj.addIssueTemplateInfo(obj.copy());
            }
        }
        else
        {
            copyObj.collIssueTemplateInfos = null;
        }
                            return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public IssuePeer getPeer()
    {
        return peer;
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("Issue:\n");
        str.append("IssueId = ")
               .append(getIssueId())
             .append("\n");
        str.append("IdPrefix = ")
               .append(getIdPrefix())
             .append("\n");
        str.append("IdCount = ")
               .append(getIdCount())
             .append("\n");
        str.append("IdDomain = ")
               .append(getIdDomain())
             .append("\n");
        str.append("TypeId = ")
               .append(getTypeId())
             .append("\n");
        str.append("ModuleId = ")
               .append(getModuleId())
             .append("\n");
        str.append("CreatedTransId = ")
               .append(getCreatedTransId())
             .append("\n");
        str.append("LastTransId = ")
               .append(getLastTransId())
             .append("\n");
        str.append("Deleted = ")
               .append(getDeleted())
             .append("\n");
        str.append("Moved = ")
               .append(getMoved())
             .append("\n");
        return(str.toString());
    }
}
