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
 * extended all references should be to Depend
 */
public abstract class BaseDepend extends BaseObject
    implements org.apache.fulcrum.intake.Retrievable
{
    /** The Peer class */
    private static final DependPeer peer =
        new DependPeer();

        
    /** The value for the dependId field */
    private Integer dependId;
      
    /** The value for the observedId field */
    private Long observedId;
      
    /** The value for the observerId field */
    private Long observerId;
      
    /** The value for the typeId field */
    private Integer typeId;
                                                                
    /** The value for the deleted field */
    private boolean deleted = false;
  
            
    /**
     * Get the DependId
     *
     * @return Integer
     */
    public Integer getDependId()
    {
        return dependId;
    }

                                              
    /**
     * Set the value of DependId
     *
     * @param v new value
     */
    public void setDependId(Integer v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.dependId, v))
              {
            this.dependId = v;
            setModified(true);
        }
    
          
                                  
                  // update associated Activity
        if (collActivitys != null)
        {
            for (int i = 0; i < collActivitys.size(); i++)
            {
                ((Activity) collActivitys.get(i))
                        .setDependId(v);
            }
        }
                                }
          
    /**
     * Get the ObservedId
     *
     * @return Long
     */
    public Long getObservedId()
    {
        return observedId;
    }

                              
    /**
     * Set the value of ObservedId
     *
     * @param v new value
     */
    public void setObservedId(Long v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.observedId, v))
              {
            this.observedId = v;
            setModified(true);
        }
    
                                                                          
                if (aIssueRelatedByObservedId != null && !ObjectUtils.equals(aIssueRelatedByObservedId.getIssueId(), v))
                {
            aIssueRelatedByObservedId = null;
        }
      
              }
          
    /**
     * Get the ObserverId
     *
     * @return Long
     */
    public Long getObserverId()
    {
        return observerId;
    }

                              
    /**
     * Set the value of ObserverId
     *
     * @param v new value
     */
    public void setObserverId(Long v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.observerId, v))
              {
            this.observerId = v;
            setModified(true);
        }
    
                                                                          
                if (aIssueRelatedByObserverId != null && !ObjectUtils.equals(aIssueRelatedByObserverId.getIssueId(), v))
                {
            aIssueRelatedByObserverId = null;
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
    
                                  
                if (aDependType != null && !ObjectUtils.equals(aDependType.getDependTypeId(), v))
                {
            aDependType = null;
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
  
      
        
                        
        
        private Issue aIssueRelatedByObservedId;

    /**
     * Declares an association between this object and a Issue object
     *
     * @param v Issue
     * @throws TorqueException
     */
    public void setIssueRelatedByObservedId(Issue v) throws TorqueException
    {
            if (v == null)
        {
                  setObservedId((Long) null);
              }
        else
        {
            setObservedId(v.getIssueId());
        }
            aIssueRelatedByObservedId = v;
    }

                        
    /**
     * Returns the associated Issue object.
           * If it was not retrieved before, the object is retrieved from
     * the database
           *
     * @return the associated Issue object
           * @throws TorqueException
           */
    public Issue getIssueRelatedByObservedId()
              throws TorqueException
          {
              if (aIssueRelatedByObservedId == null && (!ObjectUtils.equals(this.observedId, null)))
        {
                    aIssueRelatedByObservedId = IssueManager.getInstance(SimpleKey.keyFor(this.observedId));
                }
              return aIssueRelatedByObservedId;
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
    public Issue getIssueRelatedByObservedId(Connection connection)
        throws TorqueException
    {
        if (aIssueRelatedByObservedId == null && (!ObjectUtils.equals(this.observedId, null)))
        {
                    aIssueRelatedByObservedId = IssueManager.getCachedInstance(SimpleKey.keyFor(this.observedId));
            if (aIssueRelatedByObservedId == null)
            {
                          aIssueRelatedByObservedId = IssuePeer.retrieveByPK(SimpleKey.keyFor(this.observedId), connection);
                          IssueManager.putInstance(aIssueRelatedByObservedId);
            }
                }
        return aIssueRelatedByObservedId;
    }
    
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setIssueRelatedByObservedIdKey(ObjectKey key) throws TorqueException
    {
    
                    setObservedId(new Long(((NumberKey) key).longValue()));
              }
  
        
                        
        
        private Issue aIssueRelatedByObserverId;

    /**
     * Declares an association between this object and a Issue object
     *
     * @param v Issue
     * @throws TorqueException
     */
    public void setIssueRelatedByObserverId(Issue v) throws TorqueException
    {
            if (v == null)
        {
                  setObserverId((Long) null);
              }
        else
        {
            setObserverId(v.getIssueId());
        }
            aIssueRelatedByObserverId = v;
    }

                        
    /**
     * Returns the associated Issue object.
           * If it was not retrieved before, the object is retrieved from
     * the database
           *
     * @return the associated Issue object
           * @throws TorqueException
           */
    public Issue getIssueRelatedByObserverId()
              throws TorqueException
          {
              if (aIssueRelatedByObserverId == null && (!ObjectUtils.equals(this.observerId, null)))
        {
                    aIssueRelatedByObserverId = IssueManager.getInstance(SimpleKey.keyFor(this.observerId));
                }
              return aIssueRelatedByObserverId;
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
    public Issue getIssueRelatedByObserverId(Connection connection)
        throws TorqueException
    {
        if (aIssueRelatedByObserverId == null && (!ObjectUtils.equals(this.observerId, null)))
        {
                    aIssueRelatedByObserverId = IssueManager.getCachedInstance(SimpleKey.keyFor(this.observerId));
            if (aIssueRelatedByObserverId == null)
            {
                          aIssueRelatedByObserverId = IssuePeer.retrieveByPK(SimpleKey.keyFor(this.observerId), connection);
                          IssueManager.putInstance(aIssueRelatedByObserverId);
            }
                }
        return aIssueRelatedByObserverId;
    }
    
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setIssueRelatedByObserverIdKey(ObjectKey key) throws TorqueException
    {
    
                    setObserverId(new Long(((NumberKey) key).longValue()));
              }
  
        
                  
    
        private DependType aDependType;

    /**
     * Declares an association between this object and a DependType object
     *
     * @param v DependType
     * @throws TorqueException
     */
    public void setDependType(DependType v) throws TorqueException
    {
            if (v == null)
        {
                  setTypeId((Integer) null);
              }
        else
        {
            setTypeId(v.getDependTypeId());
        }
            aDependType = v;
    }

                        
    /**
     * Returns the associated DependType object.
           * If it was not retrieved before, the object is retrieved from
     * the database
           *
     * @return the associated DependType object
           * @throws TorqueException
           */
    public DependType getDependType()
              throws TorqueException
          {
              if (aDependType == null && (!ObjectUtils.equals(this.typeId, null)))
        {
                    aDependType = DependTypeManager.getInstance(SimpleKey.keyFor(this.typeId));
                }
              return aDependType;
    }

    /**
     * Return the associated DependType object
     * If it was not retrieved before, the object is retrieved from
     * the database using the passed connection
     *
     * @param connection the connection used to retrieve the associated object
     *        from the database, if it was not retrieved before
     * @return the associated DependType object
     * @throws TorqueException
     */
    public DependType getDependType(Connection connection)
        throws TorqueException
    {
        if (aDependType == null && (!ObjectUtils.equals(this.typeId, null)))
        {
                    aDependType = DependTypeManager.getCachedInstance(SimpleKey.keyFor(this.typeId));
            if (aDependType == null)
            {
                          aDependType = DependTypePeer.retrieveByPK(SimpleKey.keyFor(this.typeId), connection);
                          DependTypeManager.putInstance(aDependType);
            }
                }
        return aDependType;
    }
    
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setDependTypeKey(ObjectKey key) throws TorqueException
    {
    
                    setTypeId(new Integer(((NumberKey) key).intValue()));
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
        l.setDepend((Depend) this);
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
     * Otherwise if this Depend has previously
           * been saved, it will retrieve related Activitys from storage.
     * If this Depend is new, it will return
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
                        criteria.add(ActivityPeer.DEPEND_ID, getDependId() );
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
                            criteria.add(ActivityPeer.DEPEND_ID, getDependId());
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
     * Otherwise if this Depend has previously
           * been saved, it will retrieve related Activitys from storage.
     * If this Depend is new, it will return
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
                         criteria.add(ActivityPeer.DEPEND_ID, getDependId());
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
                             criteria.add(ActivityPeer.DEPEND_ID, getDependId());
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
     * Otherwise if this Depend is new, it will return
                 * an empty collection; or if this Depend has previously
     * been saved, it will retrieve related Activitys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Depend.
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
                              criteria.add(ActivityPeer.DEPEND_ID, getDependId());
                              collActivitys = ActivityPeer.doSelectJoinIssue(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.DEPEND_ID, getDependId());
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
     * Otherwise if this Depend is new, it will return
                 * an empty collection; or if this Depend has previously
     * been saved, it will retrieve related Activitys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Depend.
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
                              criteria.add(ActivityPeer.DEPEND_ID, getDependId());
                              collActivitys = ActivityPeer.doSelectJoinAttribute(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.DEPEND_ID, getDependId());
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
     * Otherwise if this Depend is new, it will return
                 * an empty collection; or if this Depend has previously
     * been saved, it will retrieve related Activitys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Depend.
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
                              criteria.add(ActivityPeer.DEPEND_ID, getDependId());
                              collActivitys = ActivityPeer.doSelectJoinActivitySet(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.DEPEND_ID, getDependId());
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
     * Otherwise if this Depend is new, it will return
                 * an empty collection; or if this Depend has previously
     * been saved, it will retrieve related Activitys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Depend.
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
                              criteria.add(ActivityPeer.DEPEND_ID, getDependId());
                              collActivitys = ActivityPeer.doSelectJoinScarabUserImplRelatedByOldUserId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.DEPEND_ID, getDependId());
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
     * Otherwise if this Depend is new, it will return
                 * an empty collection; or if this Depend has previously
     * been saved, it will retrieve related Activitys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Depend.
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
                              criteria.add(ActivityPeer.DEPEND_ID, getDependId());
                              collActivitys = ActivityPeer.doSelectJoinScarabUserImplRelatedByNewUserId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.DEPEND_ID, getDependId());
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
     * Otherwise if this Depend is new, it will return
                 * an empty collection; or if this Depend has previously
     * been saved, it will retrieve related Activitys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Depend.
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
                              criteria.add(ActivityPeer.DEPEND_ID, getDependId());
                              collActivitys = ActivityPeer.doSelectJoinAttributeOptionRelatedByOldOptionId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.DEPEND_ID, getDependId());
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
     * Otherwise if this Depend is new, it will return
                 * an empty collection; or if this Depend has previously
     * been saved, it will retrieve related Activitys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Depend.
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
                              criteria.add(ActivityPeer.DEPEND_ID, getDependId());
                              collActivitys = ActivityPeer.doSelectJoinAttributeOptionRelatedByNewOptionId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.DEPEND_ID, getDependId());
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
     * Otherwise if this Depend is new, it will return
                 * an empty collection; or if this Depend has previously
     * been saved, it will retrieve related Activitys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Depend.
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
                              criteria.add(ActivityPeer.DEPEND_ID, getDependId());
                              collActivitys = ActivityPeer.doSelectJoinAttachment(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.DEPEND_ID, getDependId());
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
     * Otherwise if this Depend is new, it will return
                 * an empty collection; or if this Depend has previously
     * been saved, it will retrieve related Activitys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Depend.
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
                              criteria.add(ActivityPeer.DEPEND_ID, getDependId());
                              collActivitys = ActivityPeer.doSelectJoinDepend(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.DEPEND_ID, getDependId());
                                    if (!lastActivitysCriteria.equals(criteria))
            {
                collActivitys = ActivityPeer.doSelectJoinDepend(criteria);
            }
        }
        lastActivitysCriteria = criteria;

        return collActivitys;
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
              fieldNames.add("DependId");
              fieldNames.add("ObservedId");
              fieldNames.add("ObserverId");
              fieldNames.add("TypeId");
              fieldNames.add("Deleted");
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
          if (name.equals("DependId"))
        {
                return getDependId();
            }
          if (name.equals("ObservedId"))
        {
                return getObservedId();
            }
          if (name.equals("ObserverId"))
        {
                return getObserverId();
            }
          if (name.equals("TypeId"))
        {
                return getTypeId();
            }
          if (name.equals("Deleted"))
        {
                return Boolean.valueOf(getDeleted());
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
          if (name.equals(DependPeer.DEPEND_ID))
        {
                return getDependId();
            }
          if (name.equals(DependPeer.OBSERVED_ID))
        {
                return getObservedId();
            }
          if (name.equals(DependPeer.OBSERVER_ID))
        {
                return getObserverId();
            }
          if (name.equals(DependPeer.DEPEND_TYPE_ID))
        {
                return getTypeId();
            }
          if (name.equals(DependPeer.DELETED))
        {
                return Boolean.valueOf(getDeleted());
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
                return getDependId();
            }
              if (pos == 1)
        {
                return getObservedId();
            }
              if (pos == 2)
        {
                return getObserverId();
            }
              if (pos == 3)
        {
                return getTypeId();
            }
              if (pos == 4)
        {
                return Boolean.valueOf(getDeleted());
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
          save(DependPeer.getMapBuilder()
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
                    DependPeer.doInsert((Depend) this, con);
                    setNew(false);
                }
                else
                {
                    DependPeer.doUpdate((Depend) this, con);
                }

    
                      if (isCacheOnSave())
                {
                    DependManager.putInstance(this);
                }
              }

                                      
                                    if (collActivitys != null)
            {
                for (int i = 0; i < collActivitys.size(); i++)
                {
                    ((Activity) collActivitys.get(i)).save(con);
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
     * @param key dependId ObjectKey
     */
    public void setPrimaryKey(ObjectKey key)
        throws TorqueException
    {
            setDependId(new Integer(((NumberKey) key).intValue()));
        }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) throws TorqueException
    {
            setDependId(new Integer(key));
        }

  
    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
          return SimpleKey.keyFor(getDependId());
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
      public Depend copy() throws TorqueException
    {
        return copyInto(new Depend());
    }
  
    protected Depend copyInto(Depend copyObj) throws TorqueException
    {
          copyObj.setDependId(dependId);
          copyObj.setObservedId(observedId);
          copyObj.setObserverId(observerId);
          copyObj.setTypeId(typeId);
          copyObj.setDeleted(deleted);
  
                    copyObj.setDependId((Integer)null);
                                    
                                      
                            
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
                            return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public DependPeer getPeer()
    {
        return peer;
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("Depend:\n");
        str.append("DependId = ")
               .append(getDependId())
             .append("\n");
        str.append("ObservedId = ")
               .append(getObservedId())
             .append("\n");
        str.append("ObserverId = ")
               .append(getObserverId())
             .append("\n");
        str.append("TypeId = ")
               .append(getTypeId())
             .append("\n");
        str.append("Deleted = ")
               .append(getDeleted())
             .append("\n");
        return(str.toString());
    }
}
