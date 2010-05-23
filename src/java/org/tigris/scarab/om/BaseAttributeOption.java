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
 * extended all references should be to AttributeOption
 */
public abstract class BaseAttributeOption extends BaseObject
    implements org.apache.fulcrum.intake.Retrievable
{
    /** The Peer class */
    private static final AttributeOptionPeer peer =
        new AttributeOptionPeer();

        
    /** The value for the optionId field */
    private Integer optionId;
      
    /** The value for the attributeId field */
    private Integer attributeId;
      
    /** The value for the name field */
    private String name;
                                                                
    /** The value for the deleted field */
    private boolean deleted = false;
  
            
    /**
     * Get the OptionId
     *
     * @return Integer
     */
    public Integer getOptionId()
    {
        return optionId;
    }

                                              
    /**
     * Set the value of OptionId
     *
     * @param v new value
     */
    public void setOptionId(Integer v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.optionId, v))
              {
            this.optionId = v;
            setModified(true);
        }
    
          
                                  
                  // update associated Activity
        if (collActivitysRelatedByOldOptionId != null)
        {
            for (int i = 0; i < collActivitysRelatedByOldOptionId.size(); i++)
            {
                ((Activity) collActivitysRelatedByOldOptionId.get(i))
                        .setOldOptionId(v);
            }
        }
                                                    
                  // update associated Activity
        if (collActivitysRelatedByNewOptionId != null)
        {
            for (int i = 0; i < collActivitysRelatedByNewOptionId.size(); i++)
            {
                ((Activity) collActivitysRelatedByNewOptionId.get(i))
                        .setNewOptionId(v);
            }
        }
                                                    
                  // update associated Attribute
        if (collAttributes != null)
        {
            for (int i = 0; i < collAttributes.size(); i++)
            {
                ((Attribute) collAttributes.get(i))
                        .setRequiredOptionId(v);
            }
        }
                                                    
                  // update associated Condition
        if (collConditions != null)
        {
            for (int i = 0; i < collConditions.size(); i++)
            {
                ((Condition) collConditions.get(i))
                        .setOptionId(v);
            }
        }
                                                    
                  // update associated AttributeValue
        if (collAttributeValues != null)
        {
            for (int i = 0; i < collAttributeValues.size(); i++)
            {
                ((AttributeValue) collAttributeValues.get(i))
                        .setOptionId(v);
            }
        }
                                                    
                  // update associated RModuleOption
        if (collRModuleOptions != null)
        {
            for (int i = 0; i < collRModuleOptions.size(); i++)
            {
                ((RModuleOption) collRModuleOptions.get(i))
                        .setOptionId(v);
            }
        }
                                                    
                  // update associated RIssueTypeOption
        if (collRIssueTypeOptions != null)
        {
            for (int i = 0; i < collRIssueTypeOptions.size(); i++)
            {
                ((RIssueTypeOption) collRIssueTypeOptions.get(i))
                        .setOptionId(v);
            }
        }
                                                    
                  // update associated ROptionOption
        if (collROptionOptionsRelatedByOption1Id != null)
        {
            for (int i = 0; i < collROptionOptionsRelatedByOption1Id.size(); i++)
            {
                ((ROptionOption) collROptionOptionsRelatedByOption1Id.get(i))
                        .setOption1Id(v);
            }
        }
                                                    
                  // update associated ROptionOption
        if (collROptionOptionsRelatedByOption2Id != null)
        {
            for (int i = 0; i < collROptionOptionsRelatedByOption2Id.size(); i++)
            {
                ((ROptionOption) collROptionOptionsRelatedByOption2Id.get(i))
                        .setOption2Id(v);
            }
        }
                                                    
                  // update associated Transition
        if (collTransitionsRelatedByFromOptionId != null)
        {
            for (int i = 0; i < collTransitionsRelatedByFromOptionId.size(); i++)
            {
                ((Transition) collTransitionsRelatedByFromOptionId.get(i))
                        .setFromOptionId(v);
            }
        }
                                                    
                  // update associated Transition
        if (collTransitionsRelatedByToOptionId != null)
        {
            for (int i = 0; i < collTransitionsRelatedByToOptionId.size(); i++)
            {
                ((Transition) collTransitionsRelatedByToOptionId.get(i))
                        .setToOptionId(v);
            }
        }
                                }
          
    /**
     * Get the AttributeId
     *
     * @return Integer
     */
    public Integer getAttributeId()
    {
        return attributeId;
    }

                              
    /**
     * Set the value of AttributeId
     *
     * @param v new value
     */
    public void setAttributeId(Integer v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.attributeId, v))
              {
            this.attributeId = v;
            setModified(true);
        }
    
                                  
                if (aAttribute != null && !ObjectUtils.equals(aAttribute.getAttributeId(), v))
                {
            aAttribute = null;
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
  
      
        
                  
    
        private Attribute aAttribute;

    /**
     * Declares an association between this object and a Attribute object
     *
     * @param v Attribute
     * @throws TorqueException
     */
    public void setAttribute(Attribute v) throws TorqueException
    {
            if (v == null)
        {
                  setAttributeId((Integer) null);
              }
        else
        {
            setAttributeId(v.getAttributeId());
        }
            aAttribute = v;
    }

                        
    /**
     * Returns the associated Attribute object.
           * If it was not retrieved before, the object is retrieved from
     * the database
           *
     * @return the associated Attribute object
           * @throws TorqueException
           */
    public Attribute getAttribute()
              throws TorqueException
          {
              if (aAttribute == null && (!ObjectUtils.equals(this.attributeId, null)))
        {
                    aAttribute = AttributeManager.getInstance(SimpleKey.keyFor(this.attributeId));
                }
              return aAttribute;
    }

    /**
     * Return the associated Attribute object
     * If it was not retrieved before, the object is retrieved from
     * the database using the passed connection
     *
     * @param connection the connection used to retrieve the associated object
     *        from the database, if it was not retrieved before
     * @return the associated Attribute object
     * @throws TorqueException
     */
    public Attribute getAttribute(Connection connection)
        throws TorqueException
    {
        if (aAttribute == null && (!ObjectUtils.equals(this.attributeId, null)))
        {
                    aAttribute = AttributeManager.getCachedInstance(SimpleKey.keyFor(this.attributeId));
            if (aAttribute == null)
            {
                          aAttribute = AttributePeer.retrieveByPK(SimpleKey.keyFor(this.attributeId), connection);
                          AttributeManager.putInstance(aAttribute);
            }
                }
        return aAttribute;
    }
    
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setAttributeKey(ObjectKey key) throws TorqueException
    {
    
                    setAttributeId(new Integer(((NumberKey) key).intValue()));
              }
     
                                        
            
          /**
     * Collection to store aggregation of collActivitysRelatedByOldOptionId
     */
    protected List collActivitysRelatedByOldOptionId;

    /**
     * Temporary storage of collActivitysRelatedByOldOptionId to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initActivitysRelatedByOldOptionId()
    {
        if (collActivitysRelatedByOldOptionId == null)
        {
            collActivitysRelatedByOldOptionId = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a Activity object to this object
     * through the Activity foreign key attribute
     *
     * @param l Activity
     * @throws TorqueException
     */
    public void addActivityRelatedByOldOptionId(Activity l) throws TorqueException
    {
        getActivitysRelatedByOldOptionId().add(l);
        l.setAttributeOptionRelatedByOldOptionId((AttributeOption) this);
    }

    /**
     * The criteria used to select the current contents of collActivitysRelatedByOldOptionId
     */
    private Criteria lastActivitysRelatedByOldOptionIdCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getActivitysRelatedByOldOptionId(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getActivitysRelatedByOldOptionId()
              throws TorqueException
          {
                      if (collActivitysRelatedByOldOptionId == null)
        {
            collActivitysRelatedByOldOptionId = getActivitysRelatedByOldOptionId(new Criteria(10));
        }
                return collActivitysRelatedByOldOptionId;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption has previously
           * been saved, it will retrieve related ActivitysRelatedByOldOptionId from storage.
     * If this AttributeOption is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getActivitysRelatedByOldOptionId(Criteria criteria) throws TorqueException
    {
              if (collActivitysRelatedByOldOptionId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByOldOptionId = new ArrayList();
            }
            else
            {
                        criteria.add(ActivityPeer.OLD_OPTION_ID, getOptionId() );
                        collActivitysRelatedByOldOptionId = ActivityPeer.doSelect(criteria);
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
                            criteria.add(ActivityPeer.OLD_OPTION_ID, getOptionId());
                            if (!lastActivitysRelatedByOldOptionIdCriteria.equals(criteria))
                {
                    collActivitysRelatedByOldOptionId = ActivityPeer.doSelect(criteria);
                }
            }
        }
        lastActivitysRelatedByOldOptionIdCriteria = criteria;

        return collActivitysRelatedByOldOptionId;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getActivitysRelatedByOldOptionId(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getActivitysRelatedByOldOptionId(Connection con) throws TorqueException
    {
              if (collActivitysRelatedByOldOptionId == null)
        {
            collActivitysRelatedByOldOptionId = getActivitysRelatedByOldOptionId(new Criteria(10), con);
        }
        return collActivitysRelatedByOldOptionId;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption has previously
           * been saved, it will retrieve related ActivitysRelatedByOldOptionId from storage.
     * If this AttributeOption is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getActivitysRelatedByOldOptionId(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collActivitysRelatedByOldOptionId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByOldOptionId = new ArrayList();
            }
            else
            {
                         criteria.add(ActivityPeer.OLD_OPTION_ID, getOptionId());
                         collActivitysRelatedByOldOptionId = ActivityPeer.doSelect(criteria, con);
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
                             criteria.add(ActivityPeer.OLD_OPTION_ID, getOptionId());
                             if (!lastActivitysRelatedByOldOptionIdCriteria.equals(criteria))
                 {
                     collActivitysRelatedByOldOptionId = ActivityPeer.doSelect(criteria, con);
                 }
             }
         }
         lastActivitysRelatedByOldOptionIdCriteria = criteria;

         return collActivitysRelatedByOldOptionId;
           }

                                                                  
              
                    
                    
                                
                                                              
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related ActivitysRelatedByOldOptionId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
     */
    protected List getActivitysRelatedByOldOptionIdJoinIssue(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitysRelatedByOldOptionId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByOldOptionId = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.OLD_OPTION_ID, getOptionId());
                              collActivitysRelatedByOldOptionId = ActivityPeer.doSelectJoinIssue(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.OLD_OPTION_ID, getOptionId());
                                    if (!lastActivitysRelatedByOldOptionIdCriteria.equals(criteria))
            {
                collActivitysRelatedByOldOptionId = ActivityPeer.doSelectJoinIssue(criteria);
            }
        }
        lastActivitysRelatedByOldOptionIdCriteria = criteria;

        return collActivitysRelatedByOldOptionId;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related ActivitysRelatedByOldOptionId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
     */
    protected List getActivitysRelatedByOldOptionIdJoinAttribute(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitysRelatedByOldOptionId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByOldOptionId = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.OLD_OPTION_ID, getOptionId());
                              collActivitysRelatedByOldOptionId = ActivityPeer.doSelectJoinAttribute(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.OLD_OPTION_ID, getOptionId());
                                    if (!lastActivitysRelatedByOldOptionIdCriteria.equals(criteria))
            {
                collActivitysRelatedByOldOptionId = ActivityPeer.doSelectJoinAttribute(criteria);
            }
        }
        lastActivitysRelatedByOldOptionIdCriteria = criteria;

        return collActivitysRelatedByOldOptionId;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related ActivitysRelatedByOldOptionId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
     */
    protected List getActivitysRelatedByOldOptionIdJoinActivitySet(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitysRelatedByOldOptionId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByOldOptionId = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.OLD_OPTION_ID, getOptionId());
                              collActivitysRelatedByOldOptionId = ActivityPeer.doSelectJoinActivitySet(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.OLD_OPTION_ID, getOptionId());
                                    if (!lastActivitysRelatedByOldOptionIdCriteria.equals(criteria))
            {
                collActivitysRelatedByOldOptionId = ActivityPeer.doSelectJoinActivitySet(criteria);
            }
        }
        lastActivitysRelatedByOldOptionIdCriteria = criteria;

        return collActivitysRelatedByOldOptionId;
                }
                  
                    
                    
                                            
                                                                          
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related ActivitysRelatedByOldOptionId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
     */
    protected List getActivitysRelatedByOldOptionIdJoinScarabUserImplRelatedByOldUserId(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitysRelatedByOldOptionId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByOldOptionId = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.OLD_OPTION_ID, getOptionId());
                              collActivitysRelatedByOldOptionId = ActivityPeer.doSelectJoinScarabUserImplRelatedByOldUserId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.OLD_OPTION_ID, getOptionId());
                                    if (!lastActivitysRelatedByOldOptionIdCriteria.equals(criteria))
            {
                collActivitysRelatedByOldOptionId = ActivityPeer.doSelectJoinScarabUserImplRelatedByOldUserId(criteria);
            }
        }
        lastActivitysRelatedByOldOptionIdCriteria = criteria;

        return collActivitysRelatedByOldOptionId;
                }
                  
                    
                    
                                            
                                                                          
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related ActivitysRelatedByOldOptionId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
     */
    protected List getActivitysRelatedByOldOptionIdJoinScarabUserImplRelatedByNewUserId(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitysRelatedByOldOptionId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByOldOptionId = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.OLD_OPTION_ID, getOptionId());
                              collActivitysRelatedByOldOptionId = ActivityPeer.doSelectJoinScarabUserImplRelatedByNewUserId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.OLD_OPTION_ID, getOptionId());
                                    if (!lastActivitysRelatedByOldOptionIdCriteria.equals(criteria))
            {
                collActivitysRelatedByOldOptionId = ActivityPeer.doSelectJoinScarabUserImplRelatedByNewUserId(criteria);
            }
        }
        lastActivitysRelatedByOldOptionIdCriteria = criteria;

        return collActivitysRelatedByOldOptionId;
                }
                  
                    
                              
                                            
                                                                          
                                        
                    
                                            
                  
                    
                              
                                            
                                                                          
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related ActivitysRelatedByOldOptionId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
     */
    protected List getActivitysRelatedByOldOptionIdJoinAttributeOptionRelatedByNewOptionId(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitysRelatedByOldOptionId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByOldOptionId = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.OLD_OPTION_ID, getOptionId());
                              collActivitysRelatedByOldOptionId = ActivityPeer.doSelectJoinAttributeOptionRelatedByNewOptionId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.OLD_OPTION_ID, getOptionId());
                                    if (!lastActivitysRelatedByOldOptionIdCriteria.equals(criteria))
            {
                collActivitysRelatedByOldOptionId = ActivityPeer.doSelectJoinAttributeOptionRelatedByNewOptionId(criteria);
            }
        }
        lastActivitysRelatedByOldOptionIdCriteria = criteria;

        return collActivitysRelatedByOldOptionId;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related ActivitysRelatedByOldOptionId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
     */
    protected List getActivitysRelatedByOldOptionIdJoinAttachment(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitysRelatedByOldOptionId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByOldOptionId = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.OLD_OPTION_ID, getOptionId());
                              collActivitysRelatedByOldOptionId = ActivityPeer.doSelectJoinAttachment(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.OLD_OPTION_ID, getOptionId());
                                    if (!lastActivitysRelatedByOldOptionIdCriteria.equals(criteria))
            {
                collActivitysRelatedByOldOptionId = ActivityPeer.doSelectJoinAttachment(criteria);
            }
        }
        lastActivitysRelatedByOldOptionIdCriteria = criteria;

        return collActivitysRelatedByOldOptionId;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related ActivitysRelatedByOldOptionId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
     */
    protected List getActivitysRelatedByOldOptionIdJoinDepend(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitysRelatedByOldOptionId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByOldOptionId = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.OLD_OPTION_ID, getOptionId());
                              collActivitysRelatedByOldOptionId = ActivityPeer.doSelectJoinDepend(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.OLD_OPTION_ID, getOptionId());
                                    if (!lastActivitysRelatedByOldOptionIdCriteria.equals(criteria))
            {
                collActivitysRelatedByOldOptionId = ActivityPeer.doSelectJoinDepend(criteria);
            }
        }
        lastActivitysRelatedByOldOptionIdCriteria = criteria;

        return collActivitysRelatedByOldOptionId;
                }
                            


                                  
            
          /**
     * Collection to store aggregation of collActivitysRelatedByNewOptionId
     */
    protected List collActivitysRelatedByNewOptionId;

    /**
     * Temporary storage of collActivitysRelatedByNewOptionId to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initActivitysRelatedByNewOptionId()
    {
        if (collActivitysRelatedByNewOptionId == null)
        {
            collActivitysRelatedByNewOptionId = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a Activity object to this object
     * through the Activity foreign key attribute
     *
     * @param l Activity
     * @throws TorqueException
     */
    public void addActivityRelatedByNewOptionId(Activity l) throws TorqueException
    {
        getActivitysRelatedByNewOptionId().add(l);
        l.setAttributeOptionRelatedByNewOptionId((AttributeOption) this);
    }

    /**
     * The criteria used to select the current contents of collActivitysRelatedByNewOptionId
     */
    private Criteria lastActivitysRelatedByNewOptionIdCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getActivitysRelatedByNewOptionId(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getActivitysRelatedByNewOptionId()
              throws TorqueException
          {
                      if (collActivitysRelatedByNewOptionId == null)
        {
            collActivitysRelatedByNewOptionId = getActivitysRelatedByNewOptionId(new Criteria(10));
        }
                return collActivitysRelatedByNewOptionId;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption has previously
           * been saved, it will retrieve related ActivitysRelatedByNewOptionId from storage.
     * If this AttributeOption is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getActivitysRelatedByNewOptionId(Criteria criteria) throws TorqueException
    {
              if (collActivitysRelatedByNewOptionId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByNewOptionId = new ArrayList();
            }
            else
            {
                        criteria.add(ActivityPeer.NEW_OPTION_ID, getOptionId() );
                        collActivitysRelatedByNewOptionId = ActivityPeer.doSelect(criteria);
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
                            criteria.add(ActivityPeer.NEW_OPTION_ID, getOptionId());
                            if (!lastActivitysRelatedByNewOptionIdCriteria.equals(criteria))
                {
                    collActivitysRelatedByNewOptionId = ActivityPeer.doSelect(criteria);
                }
            }
        }
        lastActivitysRelatedByNewOptionIdCriteria = criteria;

        return collActivitysRelatedByNewOptionId;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getActivitysRelatedByNewOptionId(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getActivitysRelatedByNewOptionId(Connection con) throws TorqueException
    {
              if (collActivitysRelatedByNewOptionId == null)
        {
            collActivitysRelatedByNewOptionId = getActivitysRelatedByNewOptionId(new Criteria(10), con);
        }
        return collActivitysRelatedByNewOptionId;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption has previously
           * been saved, it will retrieve related ActivitysRelatedByNewOptionId from storage.
     * If this AttributeOption is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getActivitysRelatedByNewOptionId(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collActivitysRelatedByNewOptionId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByNewOptionId = new ArrayList();
            }
            else
            {
                         criteria.add(ActivityPeer.NEW_OPTION_ID, getOptionId());
                         collActivitysRelatedByNewOptionId = ActivityPeer.doSelect(criteria, con);
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
                             criteria.add(ActivityPeer.NEW_OPTION_ID, getOptionId());
                             if (!lastActivitysRelatedByNewOptionIdCriteria.equals(criteria))
                 {
                     collActivitysRelatedByNewOptionId = ActivityPeer.doSelect(criteria, con);
                 }
             }
         }
         lastActivitysRelatedByNewOptionIdCriteria = criteria;

         return collActivitysRelatedByNewOptionId;
           }

                                                                  
              
                    
                    
                                
                                                              
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related ActivitysRelatedByNewOptionId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
     */
    protected List getActivitysRelatedByNewOptionIdJoinIssue(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitysRelatedByNewOptionId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByNewOptionId = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.NEW_OPTION_ID, getOptionId());
                              collActivitysRelatedByNewOptionId = ActivityPeer.doSelectJoinIssue(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.NEW_OPTION_ID, getOptionId());
                                    if (!lastActivitysRelatedByNewOptionIdCriteria.equals(criteria))
            {
                collActivitysRelatedByNewOptionId = ActivityPeer.doSelectJoinIssue(criteria);
            }
        }
        lastActivitysRelatedByNewOptionIdCriteria = criteria;

        return collActivitysRelatedByNewOptionId;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related ActivitysRelatedByNewOptionId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
     */
    protected List getActivitysRelatedByNewOptionIdJoinAttribute(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitysRelatedByNewOptionId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByNewOptionId = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.NEW_OPTION_ID, getOptionId());
                              collActivitysRelatedByNewOptionId = ActivityPeer.doSelectJoinAttribute(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.NEW_OPTION_ID, getOptionId());
                                    if (!lastActivitysRelatedByNewOptionIdCriteria.equals(criteria))
            {
                collActivitysRelatedByNewOptionId = ActivityPeer.doSelectJoinAttribute(criteria);
            }
        }
        lastActivitysRelatedByNewOptionIdCriteria = criteria;

        return collActivitysRelatedByNewOptionId;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related ActivitysRelatedByNewOptionId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
     */
    protected List getActivitysRelatedByNewOptionIdJoinActivitySet(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitysRelatedByNewOptionId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByNewOptionId = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.NEW_OPTION_ID, getOptionId());
                              collActivitysRelatedByNewOptionId = ActivityPeer.doSelectJoinActivitySet(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.NEW_OPTION_ID, getOptionId());
                                    if (!lastActivitysRelatedByNewOptionIdCriteria.equals(criteria))
            {
                collActivitysRelatedByNewOptionId = ActivityPeer.doSelectJoinActivitySet(criteria);
            }
        }
        lastActivitysRelatedByNewOptionIdCriteria = criteria;

        return collActivitysRelatedByNewOptionId;
                }
                  
                    
                    
                                            
                                                                          
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related ActivitysRelatedByNewOptionId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
     */
    protected List getActivitysRelatedByNewOptionIdJoinScarabUserImplRelatedByOldUserId(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitysRelatedByNewOptionId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByNewOptionId = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.NEW_OPTION_ID, getOptionId());
                              collActivitysRelatedByNewOptionId = ActivityPeer.doSelectJoinScarabUserImplRelatedByOldUserId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.NEW_OPTION_ID, getOptionId());
                                    if (!lastActivitysRelatedByNewOptionIdCriteria.equals(criteria))
            {
                collActivitysRelatedByNewOptionId = ActivityPeer.doSelectJoinScarabUserImplRelatedByOldUserId(criteria);
            }
        }
        lastActivitysRelatedByNewOptionIdCriteria = criteria;

        return collActivitysRelatedByNewOptionId;
                }
                  
                    
                    
                                            
                                                                          
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related ActivitysRelatedByNewOptionId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
     */
    protected List getActivitysRelatedByNewOptionIdJoinScarabUserImplRelatedByNewUserId(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitysRelatedByNewOptionId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByNewOptionId = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.NEW_OPTION_ID, getOptionId());
                              collActivitysRelatedByNewOptionId = ActivityPeer.doSelectJoinScarabUserImplRelatedByNewUserId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.NEW_OPTION_ID, getOptionId());
                                    if (!lastActivitysRelatedByNewOptionIdCriteria.equals(criteria))
            {
                collActivitysRelatedByNewOptionId = ActivityPeer.doSelectJoinScarabUserImplRelatedByNewUserId(criteria);
            }
        }
        lastActivitysRelatedByNewOptionIdCriteria = criteria;

        return collActivitysRelatedByNewOptionId;
                }
                  
                    
                              
                                            
                                                                          
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related ActivitysRelatedByNewOptionId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
     */
    protected List getActivitysRelatedByNewOptionIdJoinAttributeOptionRelatedByOldOptionId(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitysRelatedByNewOptionId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByNewOptionId = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.NEW_OPTION_ID, getOptionId());
                              collActivitysRelatedByNewOptionId = ActivityPeer.doSelectJoinAttributeOptionRelatedByOldOptionId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.NEW_OPTION_ID, getOptionId());
                                    if (!lastActivitysRelatedByNewOptionIdCriteria.equals(criteria))
            {
                collActivitysRelatedByNewOptionId = ActivityPeer.doSelectJoinAttributeOptionRelatedByOldOptionId(criteria);
            }
        }
        lastActivitysRelatedByNewOptionIdCriteria = criteria;

        return collActivitysRelatedByNewOptionId;
                }
                  
                    
                              
                                            
                                                                          
                                        
                    
                                            
                  
                    
                    
                                
                                                              
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related ActivitysRelatedByNewOptionId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
     */
    protected List getActivitysRelatedByNewOptionIdJoinAttachment(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitysRelatedByNewOptionId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByNewOptionId = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.NEW_OPTION_ID, getOptionId());
                              collActivitysRelatedByNewOptionId = ActivityPeer.doSelectJoinAttachment(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.NEW_OPTION_ID, getOptionId());
                                    if (!lastActivitysRelatedByNewOptionIdCriteria.equals(criteria))
            {
                collActivitysRelatedByNewOptionId = ActivityPeer.doSelectJoinAttachment(criteria);
            }
        }
        lastActivitysRelatedByNewOptionIdCriteria = criteria;

        return collActivitysRelatedByNewOptionId;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related ActivitysRelatedByNewOptionId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
     */
    protected List getActivitysRelatedByNewOptionIdJoinDepend(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitysRelatedByNewOptionId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByNewOptionId = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.NEW_OPTION_ID, getOptionId());
                              collActivitysRelatedByNewOptionId = ActivityPeer.doSelectJoinDepend(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.NEW_OPTION_ID, getOptionId());
                                    if (!lastActivitysRelatedByNewOptionIdCriteria.equals(criteria))
            {
                collActivitysRelatedByNewOptionId = ActivityPeer.doSelectJoinDepend(criteria);
            }
        }
        lastActivitysRelatedByNewOptionIdCriteria = criteria;

        return collActivitysRelatedByNewOptionId;
                }
                            


                          
            
          /**
     * Collection to store aggregation of collAttributes
     */
    protected List collAttributes;

    /**
     * Temporary storage of collAttributes to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initAttributes()
    {
        if (collAttributes == null)
        {
            collAttributes = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a Attribute object to this object
     * through the Attribute foreign key attribute
     *
     * @param l Attribute
     * @throws TorqueException
     */
    public void addAttribute(Attribute l) throws TorqueException
    {
        getAttributes().add(l);
        l.setAttributeOption((AttributeOption) this);
    }

    /**
     * The criteria used to select the current contents of collAttributes
     */
    private Criteria lastAttributesCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getAttributes(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getAttributes()
              throws TorqueException
          {
                      if (collAttributes == null)
        {
            collAttributes = getAttributes(new Criteria(10));
        }
                return collAttributes;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption has previously
           * been saved, it will retrieve related Attributes from storage.
     * If this AttributeOption is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getAttributes(Criteria criteria) throws TorqueException
    {
              if (collAttributes == null)
        {
            if (isNew())
            {
               collAttributes = new ArrayList();
            }
            else
            {
                        criteria.add(AttributePeer.REQUIRED_OPTION_ID, getOptionId() );
                        collAttributes = AttributePeer.doSelect(criteria);
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
                            criteria.add(AttributePeer.REQUIRED_OPTION_ID, getOptionId());
                            if (!lastAttributesCriteria.equals(criteria))
                {
                    collAttributes = AttributePeer.doSelect(criteria);
                }
            }
        }
        lastAttributesCriteria = criteria;

        return collAttributes;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getAttributes(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getAttributes(Connection con) throws TorqueException
    {
              if (collAttributes == null)
        {
            collAttributes = getAttributes(new Criteria(10), con);
        }
        return collAttributes;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption has previously
           * been saved, it will retrieve related Attributes from storage.
     * If this AttributeOption is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getAttributes(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collAttributes == null)
        {
            if (isNew())
            {
               collAttributes = new ArrayList();
            }
            else
            {
                         criteria.add(AttributePeer.REQUIRED_OPTION_ID, getOptionId());
                         collAttributes = AttributePeer.doSelect(criteria, con);
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
                             criteria.add(AttributePeer.REQUIRED_OPTION_ID, getOptionId());
                             if (!lastAttributesCriteria.equals(criteria))
                 {
                     collAttributes = AttributePeer.doSelect(criteria, con);
                 }
             }
         }
         lastAttributesCriteria = criteria;

         return collAttributes;
           }

                              
              
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related Attributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
     */
    protected List getAttributesJoinAttributeType(Criteria criteria)
        throws TorqueException
    {
                    if (collAttributes == null)
        {
            if (isNew())
            {
               collAttributes = new ArrayList();
            }
            else
            {
                              criteria.add(AttributePeer.REQUIRED_OPTION_ID, getOptionId());
                              collAttributes = AttributePeer.doSelectJoinAttributeType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttributePeer.REQUIRED_OPTION_ID, getOptionId());
                                    if (!lastAttributesCriteria.equals(criteria))
            {
                collAttributes = AttributePeer.doSelectJoinAttributeType(criteria);
            }
        }
        lastAttributesCriteria = criteria;

        return collAttributes;
                }
                  
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related Attributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
     */
    protected List getAttributesJoinAttributeOption(Criteria criteria)
        throws TorqueException
    {
                    if (collAttributes == null)
        {
            if (isNew())
            {
               collAttributes = new ArrayList();
            }
            else
            {
                              criteria.add(AttributePeer.REQUIRED_OPTION_ID, getOptionId());
                              collAttributes = AttributePeer.doSelectJoinAttributeOption(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttributePeer.REQUIRED_OPTION_ID, getOptionId());
                                    if (!lastAttributesCriteria.equals(criteria))
            {
                collAttributes = AttributePeer.doSelectJoinAttributeOption(criteria);
            }
        }
        lastAttributesCriteria = criteria;

        return collAttributes;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related Attributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
     */
    protected List getAttributesJoinScarabUserImpl(Criteria criteria)
        throws TorqueException
    {
                    if (collAttributes == null)
        {
            if (isNew())
            {
               collAttributes = new ArrayList();
            }
            else
            {
                              criteria.add(AttributePeer.REQUIRED_OPTION_ID, getOptionId());
                              collAttributes = AttributePeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttributePeer.REQUIRED_OPTION_ID, getOptionId());
                                    if (!lastAttributesCriteria.equals(criteria))
            {
                collAttributes = AttributePeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        lastAttributesCriteria = criteria;

        return collAttributes;
                }
                            


                          
            
          /**
     * Collection to store aggregation of collConditions
     */
    protected List collConditions;

    /**
     * Temporary storage of collConditions to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initConditions()
    {
        if (collConditions == null)
        {
            collConditions = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a Condition object to this object
     * through the Condition foreign key attribute
     *
     * @param l Condition
     * @throws TorqueException
     */
    public void addCondition(Condition l) throws TorqueException
    {
        getConditions().add(l);
        l.setAttributeOption((AttributeOption) this);
    }

    /**
     * The criteria used to select the current contents of collConditions
     */
    private Criteria lastConditionsCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getConditions(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getConditions()
              throws TorqueException
          {
                      if (collConditions == null)
        {
            collConditions = getConditions(new Criteria(10));
        }
                return collConditions;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption has previously
           * been saved, it will retrieve related Conditions from storage.
     * If this AttributeOption is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getConditions(Criteria criteria) throws TorqueException
    {
              if (collConditions == null)
        {
            if (isNew())
            {
               collConditions = new ArrayList();
            }
            else
            {
                        criteria.add(ConditionPeer.OPTION_ID, getOptionId() );
                        collConditions = ConditionPeer.doSelect(criteria);
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
                            criteria.add(ConditionPeer.OPTION_ID, getOptionId());
                            if (!lastConditionsCriteria.equals(criteria))
                {
                    collConditions = ConditionPeer.doSelect(criteria);
                }
            }
        }
        lastConditionsCriteria = criteria;

        return collConditions;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getConditions(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getConditions(Connection con) throws TorqueException
    {
              if (collConditions == null)
        {
            collConditions = getConditions(new Criteria(10), con);
        }
        return collConditions;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption has previously
           * been saved, it will retrieve related Conditions from storage.
     * If this AttributeOption is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getConditions(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collConditions == null)
        {
            if (isNew())
            {
               collConditions = new ArrayList();
            }
            else
            {
                         criteria.add(ConditionPeer.OPTION_ID, getOptionId());
                         collConditions = ConditionPeer.doSelect(criteria, con);
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
                             criteria.add(ConditionPeer.OPTION_ID, getOptionId());
                             if (!lastConditionsCriteria.equals(criteria))
                 {
                     collConditions = ConditionPeer.doSelect(criteria, con);
                 }
             }
         }
         lastConditionsCriteria = criteria;

         return collConditions;
           }

                                          
              
                    
                    
                                                                            
                                                                                                          
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related Conditions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
     */
    protected List getConditionsJoinRModuleAttribute(Criteria criteria)
        throws TorqueException
    {
                    if (collConditions == null)
        {
            if (isNew())
            {
               collConditions = new ArrayList();
            }
            else
            {
                              criteria.add(ConditionPeer.OPTION_ID, getOptionId());
                              collConditions = ConditionPeer.doSelectJoinRModuleAttribute(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ConditionPeer.OPTION_ID, getOptionId());
                                    if (!lastConditionsCriteria.equals(criteria))
            {
                collConditions = ConditionPeer.doSelectJoinRModuleAttribute(criteria);
            }
        }
        lastConditionsCriteria = criteria;

        return collConditions;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related Conditions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
     */
    protected List getConditionsJoinTransition(Criteria criteria)
        throws TorqueException
    {
                    if (collConditions == null)
        {
            if (isNew())
            {
               collConditions = new ArrayList();
            }
            else
            {
                              criteria.add(ConditionPeer.OPTION_ID, getOptionId());
                              collConditions = ConditionPeer.doSelectJoinTransition(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ConditionPeer.OPTION_ID, getOptionId());
                                    if (!lastConditionsCriteria.equals(criteria))
            {
                collConditions = ConditionPeer.doSelectJoinTransition(criteria);
            }
        }
        lastConditionsCriteria = criteria;

        return collConditions;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related Conditions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
     */
    protected List getConditionsJoinAttribute(Criteria criteria)
        throws TorqueException
    {
                    if (collConditions == null)
        {
            if (isNew())
            {
               collConditions = new ArrayList();
            }
            else
            {
                              criteria.add(ConditionPeer.OPTION_ID, getOptionId());
                              collConditions = ConditionPeer.doSelectJoinAttribute(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ConditionPeer.OPTION_ID, getOptionId());
                                    if (!lastConditionsCriteria.equals(criteria))
            {
                collConditions = ConditionPeer.doSelectJoinAttribute(criteria);
            }
        }
        lastConditionsCriteria = criteria;

        return collConditions;
                }
                  
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related Conditions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
     */
    protected List getConditionsJoinAttributeOption(Criteria criteria)
        throws TorqueException
    {
                    if (collConditions == null)
        {
            if (isNew())
            {
               collConditions = new ArrayList();
            }
            else
            {
                              criteria.add(ConditionPeer.OPTION_ID, getOptionId());
                              collConditions = ConditionPeer.doSelectJoinAttributeOption(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ConditionPeer.OPTION_ID, getOptionId());
                                    if (!lastConditionsCriteria.equals(criteria))
            {
                collConditions = ConditionPeer.doSelectJoinAttributeOption(criteria);
            }
        }
        lastConditionsCriteria = criteria;

        return collConditions;
                }
                  
                    
                    
                                                      
                                                                                    
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related Conditions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
     */
    protected List getConditionsJoinRModuleIssueType(Criteria criteria)
        throws TorqueException
    {
                    if (collConditions == null)
        {
            if (isNew())
            {
               collConditions = new ArrayList();
            }
            else
            {
                              criteria.add(ConditionPeer.OPTION_ID, getOptionId());
                              collConditions = ConditionPeer.doSelectJoinRModuleIssueType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ConditionPeer.OPTION_ID, getOptionId());
                                    if (!lastConditionsCriteria.equals(criteria))
            {
                collConditions = ConditionPeer.doSelectJoinRModuleIssueType(criteria);
            }
        }
        lastConditionsCriteria = criteria;

        return collConditions;
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
        l.setAttributeOption((AttributeOption) this);
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
     * Otherwise if this AttributeOption has previously
           * been saved, it will retrieve related AttributeValues from storage.
     * If this AttributeOption is new, it will return
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
                        criteria.add(AttributeValuePeer.OPTION_ID, getOptionId() );
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
                            criteria.add(AttributeValuePeer.OPTION_ID, getOptionId());
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
     * Otherwise if this AttributeOption has previously
           * been saved, it will retrieve related AttributeValues from storage.
     * If this AttributeOption is new, it will return
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
                         criteria.add(AttributeValuePeer.OPTION_ID, getOptionId());
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
                             criteria.add(AttributeValuePeer.OPTION_ID, getOptionId());
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
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related AttributeValues from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
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
                              criteria.add(AttributeValuePeer.OPTION_ID, getOptionId());
                              collAttributeValues = AttributeValuePeer.doSelectJoinIssue(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttributeValuePeer.OPTION_ID, getOptionId());
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
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related AttributeValues from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
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
                              criteria.add(AttributeValuePeer.OPTION_ID, getOptionId());
                              collAttributeValues = AttributeValuePeer.doSelectJoinAttribute(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttributeValuePeer.OPTION_ID, getOptionId());
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
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related AttributeValues from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
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
                              criteria.add(AttributeValuePeer.OPTION_ID, getOptionId());
                              collAttributeValues = AttributeValuePeer.doSelectJoinAttributeOption(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttributeValuePeer.OPTION_ID, getOptionId());
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
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related AttributeValues from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
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
                              criteria.add(AttributeValuePeer.OPTION_ID, getOptionId());
                              collAttributeValues = AttributeValuePeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttributeValuePeer.OPTION_ID, getOptionId());
                                    if (!lastAttributeValuesCriteria.equals(criteria))
            {
                collAttributeValues = AttributeValuePeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        lastAttributeValuesCriteria = criteria;

        return collAttributeValues;
                }
                            


                          
            
          /**
     * Collection to store aggregation of collRModuleOptions
     */
    protected List collRModuleOptions;

    /**
     * Temporary storage of collRModuleOptions to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initRModuleOptions()
    {
        if (collRModuleOptions == null)
        {
            collRModuleOptions = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a RModuleOption object to this object
     * through the RModuleOption foreign key attribute
     *
     * @param l RModuleOption
     * @throws TorqueException
     */
    public void addRModuleOption(RModuleOption l) throws TorqueException
    {
        getRModuleOptions().add(l);
        l.setAttributeOption((AttributeOption) this);
    }

    /**
     * The criteria used to select the current contents of collRModuleOptions
     */
    private Criteria lastRModuleOptionsCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getRModuleOptions(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getRModuleOptions()
              throws TorqueException
          {
                      if (collRModuleOptions == null)
        {
            collRModuleOptions = getRModuleOptions(new Criteria(10));
        }
                return collRModuleOptions;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption has previously
           * been saved, it will retrieve related RModuleOptions from storage.
     * If this AttributeOption is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getRModuleOptions(Criteria criteria) throws TorqueException
    {
              if (collRModuleOptions == null)
        {
            if (isNew())
            {
               collRModuleOptions = new ArrayList();
            }
            else
            {
                        criteria.add(RModuleOptionPeer.OPTION_ID, getOptionId() );
                        collRModuleOptions = RModuleOptionPeer.doSelect(criteria);
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
                            criteria.add(RModuleOptionPeer.OPTION_ID, getOptionId());
                            if (!lastRModuleOptionsCriteria.equals(criteria))
                {
                    collRModuleOptions = RModuleOptionPeer.doSelect(criteria);
                }
            }
        }
        lastRModuleOptionsCriteria = criteria;

        return collRModuleOptions;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getRModuleOptions(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getRModuleOptions(Connection con) throws TorqueException
    {
              if (collRModuleOptions == null)
        {
            collRModuleOptions = getRModuleOptions(new Criteria(10), con);
        }
        return collRModuleOptions;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption has previously
           * been saved, it will retrieve related RModuleOptions from storage.
     * If this AttributeOption is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getRModuleOptions(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collRModuleOptions == null)
        {
            if (isNew())
            {
               collRModuleOptions = new ArrayList();
            }
            else
            {
                         criteria.add(RModuleOptionPeer.OPTION_ID, getOptionId());
                         collRModuleOptions = RModuleOptionPeer.doSelect(criteria, con);
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
                             criteria.add(RModuleOptionPeer.OPTION_ID, getOptionId());
                             if (!lastRModuleOptionsCriteria.equals(criteria))
                 {
                     collRModuleOptions = RModuleOptionPeer.doSelect(criteria, con);
                 }
             }
         }
         lastRModuleOptionsCriteria = criteria;

         return collRModuleOptions;
           }

                              
              
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related RModuleOptions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
     */
    protected List getRModuleOptionsJoinAttributeOption(Criteria criteria)
        throws TorqueException
    {
                    if (collRModuleOptions == null)
        {
            if (isNew())
            {
               collRModuleOptions = new ArrayList();
            }
            else
            {
                              criteria.add(RModuleOptionPeer.OPTION_ID, getOptionId());
                              collRModuleOptions = RModuleOptionPeer.doSelectJoinAttributeOption(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleOptionPeer.OPTION_ID, getOptionId());
                                    if (!lastRModuleOptionsCriteria.equals(criteria))
            {
                collRModuleOptions = RModuleOptionPeer.doSelectJoinAttributeOption(criteria);
            }
        }
        lastRModuleOptionsCriteria = criteria;

        return collRModuleOptions;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related RModuleOptions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
     */
    protected List getRModuleOptionsJoinScarabModule(Criteria criteria)
        throws TorqueException
    {
                    if (collRModuleOptions == null)
        {
            if (isNew())
            {
               collRModuleOptions = new ArrayList();
            }
            else
            {
                              criteria.add(RModuleOptionPeer.OPTION_ID, getOptionId());
                              collRModuleOptions = RModuleOptionPeer.doSelectJoinScarabModule(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleOptionPeer.OPTION_ID, getOptionId());
                                    if (!lastRModuleOptionsCriteria.equals(criteria))
            {
                collRModuleOptions = RModuleOptionPeer.doSelectJoinScarabModule(criteria);
            }
        }
        lastRModuleOptionsCriteria = criteria;

        return collRModuleOptions;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related RModuleOptions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
     */
    protected List getRModuleOptionsJoinIssueType(Criteria criteria)
        throws TorqueException
    {
                    if (collRModuleOptions == null)
        {
            if (isNew())
            {
               collRModuleOptions = new ArrayList();
            }
            else
            {
                              criteria.add(RModuleOptionPeer.OPTION_ID, getOptionId());
                              collRModuleOptions = RModuleOptionPeer.doSelectJoinIssueType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleOptionPeer.OPTION_ID, getOptionId());
                                    if (!lastRModuleOptionsCriteria.equals(criteria))
            {
                collRModuleOptions = RModuleOptionPeer.doSelectJoinIssueType(criteria);
            }
        }
        lastRModuleOptionsCriteria = criteria;

        return collRModuleOptions;
                }
                            


                          
            
          /**
     * Collection to store aggregation of collRIssueTypeOptions
     */
    protected List collRIssueTypeOptions;

    /**
     * Temporary storage of collRIssueTypeOptions to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initRIssueTypeOptions()
    {
        if (collRIssueTypeOptions == null)
        {
            collRIssueTypeOptions = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a RIssueTypeOption object to this object
     * through the RIssueTypeOption foreign key attribute
     *
     * @param l RIssueTypeOption
     * @throws TorqueException
     */
    public void addRIssueTypeOption(RIssueTypeOption l) throws TorqueException
    {
        getRIssueTypeOptions().add(l);
        l.setAttributeOption((AttributeOption) this);
    }

    /**
     * The criteria used to select the current contents of collRIssueTypeOptions
     */
    private Criteria lastRIssueTypeOptionsCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getRIssueTypeOptions(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getRIssueTypeOptions()
              throws TorqueException
          {
                      if (collRIssueTypeOptions == null)
        {
            collRIssueTypeOptions = getRIssueTypeOptions(new Criteria(10));
        }
                return collRIssueTypeOptions;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption has previously
           * been saved, it will retrieve related RIssueTypeOptions from storage.
     * If this AttributeOption is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getRIssueTypeOptions(Criteria criteria) throws TorqueException
    {
              if (collRIssueTypeOptions == null)
        {
            if (isNew())
            {
               collRIssueTypeOptions = new ArrayList();
            }
            else
            {
                        criteria.add(RIssueTypeOptionPeer.OPTION_ID, getOptionId() );
                        collRIssueTypeOptions = RIssueTypeOptionPeer.doSelect(criteria);
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
                            criteria.add(RIssueTypeOptionPeer.OPTION_ID, getOptionId());
                            if (!lastRIssueTypeOptionsCriteria.equals(criteria))
                {
                    collRIssueTypeOptions = RIssueTypeOptionPeer.doSelect(criteria);
                }
            }
        }
        lastRIssueTypeOptionsCriteria = criteria;

        return collRIssueTypeOptions;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getRIssueTypeOptions(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getRIssueTypeOptions(Connection con) throws TorqueException
    {
              if (collRIssueTypeOptions == null)
        {
            collRIssueTypeOptions = getRIssueTypeOptions(new Criteria(10), con);
        }
        return collRIssueTypeOptions;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption has previously
           * been saved, it will retrieve related RIssueTypeOptions from storage.
     * If this AttributeOption is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getRIssueTypeOptions(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collRIssueTypeOptions == null)
        {
            if (isNew())
            {
               collRIssueTypeOptions = new ArrayList();
            }
            else
            {
                         criteria.add(RIssueTypeOptionPeer.OPTION_ID, getOptionId());
                         collRIssueTypeOptions = RIssueTypeOptionPeer.doSelect(criteria, con);
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
                             criteria.add(RIssueTypeOptionPeer.OPTION_ID, getOptionId());
                             if (!lastRIssueTypeOptionsCriteria.equals(criteria))
                 {
                     collRIssueTypeOptions = RIssueTypeOptionPeer.doSelect(criteria, con);
                 }
             }
         }
         lastRIssueTypeOptionsCriteria = criteria;

         return collRIssueTypeOptions;
           }

                        
              
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related RIssueTypeOptions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
     */
    protected List getRIssueTypeOptionsJoinAttributeOption(Criteria criteria)
        throws TorqueException
    {
                    if (collRIssueTypeOptions == null)
        {
            if (isNew())
            {
               collRIssueTypeOptions = new ArrayList();
            }
            else
            {
                              criteria.add(RIssueTypeOptionPeer.OPTION_ID, getOptionId());
                              collRIssueTypeOptions = RIssueTypeOptionPeer.doSelectJoinAttributeOption(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RIssueTypeOptionPeer.OPTION_ID, getOptionId());
                                    if (!lastRIssueTypeOptionsCriteria.equals(criteria))
            {
                collRIssueTypeOptions = RIssueTypeOptionPeer.doSelectJoinAttributeOption(criteria);
            }
        }
        lastRIssueTypeOptionsCriteria = criteria;

        return collRIssueTypeOptions;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related RIssueTypeOptions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
     */
    protected List getRIssueTypeOptionsJoinIssueType(Criteria criteria)
        throws TorqueException
    {
                    if (collRIssueTypeOptions == null)
        {
            if (isNew())
            {
               collRIssueTypeOptions = new ArrayList();
            }
            else
            {
                              criteria.add(RIssueTypeOptionPeer.OPTION_ID, getOptionId());
                              collRIssueTypeOptions = RIssueTypeOptionPeer.doSelectJoinIssueType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RIssueTypeOptionPeer.OPTION_ID, getOptionId());
                                    if (!lastRIssueTypeOptionsCriteria.equals(criteria))
            {
                collRIssueTypeOptions = RIssueTypeOptionPeer.doSelectJoinIssueType(criteria);
            }
        }
        lastRIssueTypeOptionsCriteria = criteria;

        return collRIssueTypeOptions;
                }
                            


                                  
            
          /**
     * Collection to store aggregation of collROptionOptionsRelatedByOption1Id
     */
    protected List collROptionOptionsRelatedByOption1Id;

    /**
     * Temporary storage of collROptionOptionsRelatedByOption1Id to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initROptionOptionsRelatedByOption1Id()
    {
        if (collROptionOptionsRelatedByOption1Id == null)
        {
            collROptionOptionsRelatedByOption1Id = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a ROptionOption object to this object
     * through the ROptionOption foreign key attribute
     *
     * @param l ROptionOption
     * @throws TorqueException
     */
    public void addROptionOptionRelatedByOption1Id(ROptionOption l) throws TorqueException
    {
        getROptionOptionsRelatedByOption1Id().add(l);
        l.setAttributeOptionRelatedByOption1Id((AttributeOption) this);
    }

    /**
     * The criteria used to select the current contents of collROptionOptionsRelatedByOption1Id
     */
    private Criteria lastROptionOptionsRelatedByOption1IdCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getROptionOptionsRelatedByOption1Id(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getROptionOptionsRelatedByOption1Id()
              throws TorqueException
          {
                      if (collROptionOptionsRelatedByOption1Id == null)
        {
            collROptionOptionsRelatedByOption1Id = getROptionOptionsRelatedByOption1Id(new Criteria(10));
        }
                return collROptionOptionsRelatedByOption1Id;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption has previously
           * been saved, it will retrieve related ROptionOptionsRelatedByOption1Id from storage.
     * If this AttributeOption is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getROptionOptionsRelatedByOption1Id(Criteria criteria) throws TorqueException
    {
              if (collROptionOptionsRelatedByOption1Id == null)
        {
            if (isNew())
            {
               collROptionOptionsRelatedByOption1Id = new ArrayList();
            }
            else
            {
                        criteria.add(ROptionOptionPeer.OPTION1_ID, getOptionId() );
                        collROptionOptionsRelatedByOption1Id = ROptionOptionPeer.doSelect(criteria);
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
                            criteria.add(ROptionOptionPeer.OPTION1_ID, getOptionId());
                            if (!lastROptionOptionsRelatedByOption1IdCriteria.equals(criteria))
                {
                    collROptionOptionsRelatedByOption1Id = ROptionOptionPeer.doSelect(criteria);
                }
            }
        }
        lastROptionOptionsRelatedByOption1IdCriteria = criteria;

        return collROptionOptionsRelatedByOption1Id;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getROptionOptionsRelatedByOption1Id(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getROptionOptionsRelatedByOption1Id(Connection con) throws TorqueException
    {
              if (collROptionOptionsRelatedByOption1Id == null)
        {
            collROptionOptionsRelatedByOption1Id = getROptionOptionsRelatedByOption1Id(new Criteria(10), con);
        }
        return collROptionOptionsRelatedByOption1Id;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption has previously
           * been saved, it will retrieve related ROptionOptionsRelatedByOption1Id from storage.
     * If this AttributeOption is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getROptionOptionsRelatedByOption1Id(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collROptionOptionsRelatedByOption1Id == null)
        {
            if (isNew())
            {
               collROptionOptionsRelatedByOption1Id = new ArrayList();
            }
            else
            {
                         criteria.add(ROptionOptionPeer.OPTION1_ID, getOptionId());
                         collROptionOptionsRelatedByOption1Id = ROptionOptionPeer.doSelect(criteria, con);
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
                             criteria.add(ROptionOptionPeer.OPTION1_ID, getOptionId());
                             if (!lastROptionOptionsRelatedByOption1IdCriteria.equals(criteria))
                 {
                     collROptionOptionsRelatedByOption1Id = ROptionOptionPeer.doSelect(criteria, con);
                 }
             }
         }
         lastROptionOptionsRelatedByOption1IdCriteria = criteria;

         return collROptionOptionsRelatedByOption1Id;
           }

                              
              
                    
                              
                                            
                                                                          
                                        
                    
                                            
                  
                    
                              
                                            
                                                                          
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related ROptionOptionsRelatedByOption1Id from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
     */
    protected List getROptionOptionsRelatedByOption1IdJoinAttributeOptionRelatedByOption2Id(Criteria criteria)
        throws TorqueException
    {
                    if (collROptionOptionsRelatedByOption1Id == null)
        {
            if (isNew())
            {
               collROptionOptionsRelatedByOption1Id = new ArrayList();
            }
            else
            {
                              criteria.add(ROptionOptionPeer.OPTION1_ID, getOptionId());
                              collROptionOptionsRelatedByOption1Id = ROptionOptionPeer.doSelectJoinAttributeOptionRelatedByOption2Id(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ROptionOptionPeer.OPTION1_ID, getOptionId());
                                    if (!lastROptionOptionsRelatedByOption1IdCriteria.equals(criteria))
            {
                collROptionOptionsRelatedByOption1Id = ROptionOptionPeer.doSelectJoinAttributeOptionRelatedByOption2Id(criteria);
            }
        }
        lastROptionOptionsRelatedByOption1IdCriteria = criteria;

        return collROptionOptionsRelatedByOption1Id;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related ROptionOptionsRelatedByOption1Id from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
     */
    protected List getROptionOptionsRelatedByOption1IdJoinOptionRelationship(Criteria criteria)
        throws TorqueException
    {
                    if (collROptionOptionsRelatedByOption1Id == null)
        {
            if (isNew())
            {
               collROptionOptionsRelatedByOption1Id = new ArrayList();
            }
            else
            {
                              criteria.add(ROptionOptionPeer.OPTION1_ID, getOptionId());
                              collROptionOptionsRelatedByOption1Id = ROptionOptionPeer.doSelectJoinOptionRelationship(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ROptionOptionPeer.OPTION1_ID, getOptionId());
                                    if (!lastROptionOptionsRelatedByOption1IdCriteria.equals(criteria))
            {
                collROptionOptionsRelatedByOption1Id = ROptionOptionPeer.doSelectJoinOptionRelationship(criteria);
            }
        }
        lastROptionOptionsRelatedByOption1IdCriteria = criteria;

        return collROptionOptionsRelatedByOption1Id;
                }
                            


                                  
            
          /**
     * Collection to store aggregation of collROptionOptionsRelatedByOption2Id
     */
    protected List collROptionOptionsRelatedByOption2Id;

    /**
     * Temporary storage of collROptionOptionsRelatedByOption2Id to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initROptionOptionsRelatedByOption2Id()
    {
        if (collROptionOptionsRelatedByOption2Id == null)
        {
            collROptionOptionsRelatedByOption2Id = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a ROptionOption object to this object
     * through the ROptionOption foreign key attribute
     *
     * @param l ROptionOption
     * @throws TorqueException
     */
    public void addROptionOptionRelatedByOption2Id(ROptionOption l) throws TorqueException
    {
        getROptionOptionsRelatedByOption2Id().add(l);
        l.setAttributeOptionRelatedByOption2Id((AttributeOption) this);
    }

    /**
     * The criteria used to select the current contents of collROptionOptionsRelatedByOption2Id
     */
    private Criteria lastROptionOptionsRelatedByOption2IdCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getROptionOptionsRelatedByOption2Id(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getROptionOptionsRelatedByOption2Id()
              throws TorqueException
          {
                      if (collROptionOptionsRelatedByOption2Id == null)
        {
            collROptionOptionsRelatedByOption2Id = getROptionOptionsRelatedByOption2Id(new Criteria(10));
        }
                return collROptionOptionsRelatedByOption2Id;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption has previously
           * been saved, it will retrieve related ROptionOptionsRelatedByOption2Id from storage.
     * If this AttributeOption is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getROptionOptionsRelatedByOption2Id(Criteria criteria) throws TorqueException
    {
              if (collROptionOptionsRelatedByOption2Id == null)
        {
            if (isNew())
            {
               collROptionOptionsRelatedByOption2Id = new ArrayList();
            }
            else
            {
                        criteria.add(ROptionOptionPeer.OPTION2_ID, getOptionId() );
                        collROptionOptionsRelatedByOption2Id = ROptionOptionPeer.doSelect(criteria);
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
                            criteria.add(ROptionOptionPeer.OPTION2_ID, getOptionId());
                            if (!lastROptionOptionsRelatedByOption2IdCriteria.equals(criteria))
                {
                    collROptionOptionsRelatedByOption2Id = ROptionOptionPeer.doSelect(criteria);
                }
            }
        }
        lastROptionOptionsRelatedByOption2IdCriteria = criteria;

        return collROptionOptionsRelatedByOption2Id;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getROptionOptionsRelatedByOption2Id(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getROptionOptionsRelatedByOption2Id(Connection con) throws TorqueException
    {
              if (collROptionOptionsRelatedByOption2Id == null)
        {
            collROptionOptionsRelatedByOption2Id = getROptionOptionsRelatedByOption2Id(new Criteria(10), con);
        }
        return collROptionOptionsRelatedByOption2Id;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption has previously
           * been saved, it will retrieve related ROptionOptionsRelatedByOption2Id from storage.
     * If this AttributeOption is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getROptionOptionsRelatedByOption2Id(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collROptionOptionsRelatedByOption2Id == null)
        {
            if (isNew())
            {
               collROptionOptionsRelatedByOption2Id = new ArrayList();
            }
            else
            {
                         criteria.add(ROptionOptionPeer.OPTION2_ID, getOptionId());
                         collROptionOptionsRelatedByOption2Id = ROptionOptionPeer.doSelect(criteria, con);
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
                             criteria.add(ROptionOptionPeer.OPTION2_ID, getOptionId());
                             if (!lastROptionOptionsRelatedByOption2IdCriteria.equals(criteria))
                 {
                     collROptionOptionsRelatedByOption2Id = ROptionOptionPeer.doSelect(criteria, con);
                 }
             }
         }
         lastROptionOptionsRelatedByOption2IdCriteria = criteria;

         return collROptionOptionsRelatedByOption2Id;
           }

                              
              
                    
                              
                                            
                                                                          
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related ROptionOptionsRelatedByOption2Id from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
     */
    protected List getROptionOptionsRelatedByOption2IdJoinAttributeOptionRelatedByOption1Id(Criteria criteria)
        throws TorqueException
    {
                    if (collROptionOptionsRelatedByOption2Id == null)
        {
            if (isNew())
            {
               collROptionOptionsRelatedByOption2Id = new ArrayList();
            }
            else
            {
                              criteria.add(ROptionOptionPeer.OPTION2_ID, getOptionId());
                              collROptionOptionsRelatedByOption2Id = ROptionOptionPeer.doSelectJoinAttributeOptionRelatedByOption1Id(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ROptionOptionPeer.OPTION2_ID, getOptionId());
                                    if (!lastROptionOptionsRelatedByOption2IdCriteria.equals(criteria))
            {
                collROptionOptionsRelatedByOption2Id = ROptionOptionPeer.doSelectJoinAttributeOptionRelatedByOption1Id(criteria);
            }
        }
        lastROptionOptionsRelatedByOption2IdCriteria = criteria;

        return collROptionOptionsRelatedByOption2Id;
                }
                  
                    
                              
                                            
                                                                          
                                        
                    
                                            
                  
                    
                    
                                
                                                              
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related ROptionOptionsRelatedByOption2Id from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
     */
    protected List getROptionOptionsRelatedByOption2IdJoinOptionRelationship(Criteria criteria)
        throws TorqueException
    {
                    if (collROptionOptionsRelatedByOption2Id == null)
        {
            if (isNew())
            {
               collROptionOptionsRelatedByOption2Id = new ArrayList();
            }
            else
            {
                              criteria.add(ROptionOptionPeer.OPTION2_ID, getOptionId());
                              collROptionOptionsRelatedByOption2Id = ROptionOptionPeer.doSelectJoinOptionRelationship(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ROptionOptionPeer.OPTION2_ID, getOptionId());
                                    if (!lastROptionOptionsRelatedByOption2IdCriteria.equals(criteria))
            {
                collROptionOptionsRelatedByOption2Id = ROptionOptionPeer.doSelectJoinOptionRelationship(criteria);
            }
        }
        lastROptionOptionsRelatedByOption2IdCriteria = criteria;

        return collROptionOptionsRelatedByOption2Id;
                }
                            


                                  
            
          /**
     * Collection to store aggregation of collTransitionsRelatedByFromOptionId
     */
    protected List collTransitionsRelatedByFromOptionId;

    /**
     * Temporary storage of collTransitionsRelatedByFromOptionId to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initTransitionsRelatedByFromOptionId()
    {
        if (collTransitionsRelatedByFromOptionId == null)
        {
            collTransitionsRelatedByFromOptionId = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a Transition object to this object
     * through the Transition foreign key attribute
     *
     * @param l Transition
     * @throws TorqueException
     */
    public void addTransitionRelatedByFromOptionId(Transition l) throws TorqueException
    {
        getTransitionsRelatedByFromOptionId().add(l);
        l.setAttributeOptionRelatedByFromOptionId((AttributeOption) this);
    }

    /**
     * The criteria used to select the current contents of collTransitionsRelatedByFromOptionId
     */
    private Criteria lastTransitionsRelatedByFromOptionIdCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getTransitionsRelatedByFromOptionId(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getTransitionsRelatedByFromOptionId()
              throws TorqueException
          {
                      if (collTransitionsRelatedByFromOptionId == null)
        {
            collTransitionsRelatedByFromOptionId = getTransitionsRelatedByFromOptionId(new Criteria(10));
        }
                return collTransitionsRelatedByFromOptionId;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption has previously
           * been saved, it will retrieve related TransitionsRelatedByFromOptionId from storage.
     * If this AttributeOption is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getTransitionsRelatedByFromOptionId(Criteria criteria) throws TorqueException
    {
              if (collTransitionsRelatedByFromOptionId == null)
        {
            if (isNew())
            {
               collTransitionsRelatedByFromOptionId = new ArrayList();
            }
            else
            {
                        criteria.add(TransitionPeer.FROM_OPTION_ID, getOptionId() );
                        collTransitionsRelatedByFromOptionId = TransitionPeer.doSelect(criteria);
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
                            criteria.add(TransitionPeer.FROM_OPTION_ID, getOptionId());
                            if (!lastTransitionsRelatedByFromOptionIdCriteria.equals(criteria))
                {
                    collTransitionsRelatedByFromOptionId = TransitionPeer.doSelect(criteria);
                }
            }
        }
        lastTransitionsRelatedByFromOptionIdCriteria = criteria;

        return collTransitionsRelatedByFromOptionId;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getTransitionsRelatedByFromOptionId(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getTransitionsRelatedByFromOptionId(Connection con) throws TorqueException
    {
              if (collTransitionsRelatedByFromOptionId == null)
        {
            collTransitionsRelatedByFromOptionId = getTransitionsRelatedByFromOptionId(new Criteria(10), con);
        }
        return collTransitionsRelatedByFromOptionId;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption has previously
           * been saved, it will retrieve related TransitionsRelatedByFromOptionId from storage.
     * If this AttributeOption is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getTransitionsRelatedByFromOptionId(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collTransitionsRelatedByFromOptionId == null)
        {
            if (isNew())
            {
               collTransitionsRelatedByFromOptionId = new ArrayList();
            }
            else
            {
                         criteria.add(TransitionPeer.FROM_OPTION_ID, getOptionId());
                         collTransitionsRelatedByFromOptionId = TransitionPeer.doSelect(criteria, con);
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
                             criteria.add(TransitionPeer.FROM_OPTION_ID, getOptionId());
                             if (!lastTransitionsRelatedByFromOptionIdCriteria.equals(criteria))
                 {
                     collTransitionsRelatedByFromOptionId = TransitionPeer.doSelect(criteria, con);
                 }
             }
         }
         lastTransitionsRelatedByFromOptionIdCriteria = criteria;

         return collTransitionsRelatedByFromOptionId;
           }

                              
              
                    
                    
                                
                                                              
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related TransitionsRelatedByFromOptionId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
     */
    protected List getTransitionsRelatedByFromOptionIdJoinAttribute(Criteria criteria)
        throws TorqueException
    {
                    if (collTransitionsRelatedByFromOptionId == null)
        {
            if (isNew())
            {
               collTransitionsRelatedByFromOptionId = new ArrayList();
            }
            else
            {
                              criteria.add(TransitionPeer.FROM_OPTION_ID, getOptionId());
                              collTransitionsRelatedByFromOptionId = TransitionPeer.doSelectJoinAttribute(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(TransitionPeer.FROM_OPTION_ID, getOptionId());
                                    if (!lastTransitionsRelatedByFromOptionIdCriteria.equals(criteria))
            {
                collTransitionsRelatedByFromOptionId = TransitionPeer.doSelectJoinAttribute(criteria);
            }
        }
        lastTransitionsRelatedByFromOptionIdCriteria = criteria;

        return collTransitionsRelatedByFromOptionId;
                }
                  
                    
                              
                                            
                                                                          
                                        
                    
                                            
                  
                    
                              
                                            
                                                                          
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related TransitionsRelatedByFromOptionId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
     */
    protected List getTransitionsRelatedByFromOptionIdJoinAttributeOptionRelatedByToOptionId(Criteria criteria)
        throws TorqueException
    {
                    if (collTransitionsRelatedByFromOptionId == null)
        {
            if (isNew())
            {
               collTransitionsRelatedByFromOptionId = new ArrayList();
            }
            else
            {
                              criteria.add(TransitionPeer.FROM_OPTION_ID, getOptionId());
                              collTransitionsRelatedByFromOptionId = TransitionPeer.doSelectJoinAttributeOptionRelatedByToOptionId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(TransitionPeer.FROM_OPTION_ID, getOptionId());
                                    if (!lastTransitionsRelatedByFromOptionIdCriteria.equals(criteria))
            {
                collTransitionsRelatedByFromOptionId = TransitionPeer.doSelectJoinAttributeOptionRelatedByToOptionId(criteria);
            }
        }
        lastTransitionsRelatedByFromOptionIdCriteria = criteria;

        return collTransitionsRelatedByFromOptionId;
                }
                            


                                  
            
          /**
     * Collection to store aggregation of collTransitionsRelatedByToOptionId
     */
    protected List collTransitionsRelatedByToOptionId;

    /**
     * Temporary storage of collTransitionsRelatedByToOptionId to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initTransitionsRelatedByToOptionId()
    {
        if (collTransitionsRelatedByToOptionId == null)
        {
            collTransitionsRelatedByToOptionId = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a Transition object to this object
     * through the Transition foreign key attribute
     *
     * @param l Transition
     * @throws TorqueException
     */
    public void addTransitionRelatedByToOptionId(Transition l) throws TorqueException
    {
        getTransitionsRelatedByToOptionId().add(l);
        l.setAttributeOptionRelatedByToOptionId((AttributeOption) this);
    }

    /**
     * The criteria used to select the current contents of collTransitionsRelatedByToOptionId
     */
    private Criteria lastTransitionsRelatedByToOptionIdCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getTransitionsRelatedByToOptionId(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getTransitionsRelatedByToOptionId()
              throws TorqueException
          {
                      if (collTransitionsRelatedByToOptionId == null)
        {
            collTransitionsRelatedByToOptionId = getTransitionsRelatedByToOptionId(new Criteria(10));
        }
                return collTransitionsRelatedByToOptionId;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption has previously
           * been saved, it will retrieve related TransitionsRelatedByToOptionId from storage.
     * If this AttributeOption is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getTransitionsRelatedByToOptionId(Criteria criteria) throws TorqueException
    {
              if (collTransitionsRelatedByToOptionId == null)
        {
            if (isNew())
            {
               collTransitionsRelatedByToOptionId = new ArrayList();
            }
            else
            {
                        criteria.add(TransitionPeer.TO_OPTION_ID, getOptionId() );
                        collTransitionsRelatedByToOptionId = TransitionPeer.doSelect(criteria);
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
                            criteria.add(TransitionPeer.TO_OPTION_ID, getOptionId());
                            if (!lastTransitionsRelatedByToOptionIdCriteria.equals(criteria))
                {
                    collTransitionsRelatedByToOptionId = TransitionPeer.doSelect(criteria);
                }
            }
        }
        lastTransitionsRelatedByToOptionIdCriteria = criteria;

        return collTransitionsRelatedByToOptionId;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getTransitionsRelatedByToOptionId(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getTransitionsRelatedByToOptionId(Connection con) throws TorqueException
    {
              if (collTransitionsRelatedByToOptionId == null)
        {
            collTransitionsRelatedByToOptionId = getTransitionsRelatedByToOptionId(new Criteria(10), con);
        }
        return collTransitionsRelatedByToOptionId;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption has previously
           * been saved, it will retrieve related TransitionsRelatedByToOptionId from storage.
     * If this AttributeOption is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getTransitionsRelatedByToOptionId(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collTransitionsRelatedByToOptionId == null)
        {
            if (isNew())
            {
               collTransitionsRelatedByToOptionId = new ArrayList();
            }
            else
            {
                         criteria.add(TransitionPeer.TO_OPTION_ID, getOptionId());
                         collTransitionsRelatedByToOptionId = TransitionPeer.doSelect(criteria, con);
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
                             criteria.add(TransitionPeer.TO_OPTION_ID, getOptionId());
                             if (!lastTransitionsRelatedByToOptionIdCriteria.equals(criteria))
                 {
                     collTransitionsRelatedByToOptionId = TransitionPeer.doSelect(criteria, con);
                 }
             }
         }
         lastTransitionsRelatedByToOptionIdCriteria = criteria;

         return collTransitionsRelatedByToOptionId;
           }

                              
              
                    
                    
                                
                                                              
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related TransitionsRelatedByToOptionId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
     */
    protected List getTransitionsRelatedByToOptionIdJoinAttribute(Criteria criteria)
        throws TorqueException
    {
                    if (collTransitionsRelatedByToOptionId == null)
        {
            if (isNew())
            {
               collTransitionsRelatedByToOptionId = new ArrayList();
            }
            else
            {
                              criteria.add(TransitionPeer.TO_OPTION_ID, getOptionId());
                              collTransitionsRelatedByToOptionId = TransitionPeer.doSelectJoinAttribute(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(TransitionPeer.TO_OPTION_ID, getOptionId());
                                    if (!lastTransitionsRelatedByToOptionIdCriteria.equals(criteria))
            {
                collTransitionsRelatedByToOptionId = TransitionPeer.doSelectJoinAttribute(criteria);
            }
        }
        lastTransitionsRelatedByToOptionIdCriteria = criteria;

        return collTransitionsRelatedByToOptionId;
                }
                  
                    
                              
                                            
                                                                          
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeOption is new, it will return
                 * an empty collection; or if this AttributeOption has previously
     * been saved, it will retrieve related TransitionsRelatedByToOptionId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeOption.
     */
    protected List getTransitionsRelatedByToOptionIdJoinAttributeOptionRelatedByFromOptionId(Criteria criteria)
        throws TorqueException
    {
                    if (collTransitionsRelatedByToOptionId == null)
        {
            if (isNew())
            {
               collTransitionsRelatedByToOptionId = new ArrayList();
            }
            else
            {
                              criteria.add(TransitionPeer.TO_OPTION_ID, getOptionId());
                              collTransitionsRelatedByToOptionId = TransitionPeer.doSelectJoinAttributeOptionRelatedByFromOptionId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(TransitionPeer.TO_OPTION_ID, getOptionId());
                                    if (!lastTransitionsRelatedByToOptionIdCriteria.equals(criteria))
            {
                collTransitionsRelatedByToOptionId = TransitionPeer.doSelectJoinAttributeOptionRelatedByFromOptionId(criteria);
            }
        }
        lastTransitionsRelatedByToOptionIdCriteria = criteria;

        return collTransitionsRelatedByToOptionId;
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
              fieldNames.add("OptionId");
              fieldNames.add("AttributeId");
              fieldNames.add("Name");
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
          if (name.equals("OptionId"))
        {
                return getOptionId();
            }
          if (name.equals("AttributeId"))
        {
                return getAttributeId();
            }
          if (name.equals("Name"))
        {
                return getName();
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
          if (name.equals(AttributeOptionPeer.OPTION_ID))
        {
                return getOptionId();
            }
          if (name.equals(AttributeOptionPeer.ATTRIBUTE_ID))
        {
                return getAttributeId();
            }
          if (name.equals(AttributeOptionPeer.OPTION_NAME))
        {
                return getName();
            }
          if (name.equals(AttributeOptionPeer.DELETED))
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
                return getOptionId();
            }
              if (pos == 1)
        {
                return getAttributeId();
            }
              if (pos == 2)
        {
                return getName();
            }
              if (pos == 3)
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
          save(AttributeOptionPeer.getMapBuilder()
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
                    AttributeOptionPeer.doInsert((AttributeOption) this, con);
                    setNew(false);
                }
                else
                {
                    AttributeOptionPeer.doUpdate((AttributeOption) this, con);
                }

    
                      if (isCacheOnSave())
                {
                    AttributeOptionManager.putInstance(this);
                }
              }

                                                
                                    if (collActivitysRelatedByOldOptionId != null)
            {
                for (int i = 0; i < collActivitysRelatedByOldOptionId.size(); i++)
                {
                    ((Activity) collActivitysRelatedByOldOptionId.get(i)).save(con);
                }
            }
                                                            
                                    if (collActivitysRelatedByNewOptionId != null)
            {
                for (int i = 0; i < collActivitysRelatedByNewOptionId.size(); i++)
                {
                    ((Activity) collActivitysRelatedByNewOptionId.get(i)).save(con);
                }
            }
                                                  
                                    if (collAttributes != null)
            {
                for (int i = 0; i < collAttributes.size(); i++)
                {
                    ((Attribute) collAttributes.get(i)).save(con);
                }
            }
                                                  
                                    if (collConditions != null)
            {
                for (int i = 0; i < collConditions.size(); i++)
                {
                    ((Condition) collConditions.get(i)).save(con);
                }
            }
                                                  
                                    if (collAttributeValues != null)
            {
                for (int i = 0; i < collAttributeValues.size(); i++)
                {
                    ((AttributeValue) collAttributeValues.get(i)).save(con);
                }
            }
                                                  
                                    if (collRModuleOptions != null)
            {
                for (int i = 0; i < collRModuleOptions.size(); i++)
                {
                    ((RModuleOption) collRModuleOptions.get(i)).save(con);
                }
            }
                                                  
                                    if (collRIssueTypeOptions != null)
            {
                for (int i = 0; i < collRIssueTypeOptions.size(); i++)
                {
                    ((RIssueTypeOption) collRIssueTypeOptions.get(i)).save(con);
                }
            }
                                                            
                                    if (collROptionOptionsRelatedByOption1Id != null)
            {
                for (int i = 0; i < collROptionOptionsRelatedByOption1Id.size(); i++)
                {
                    ((ROptionOption) collROptionOptionsRelatedByOption1Id.get(i)).save(con);
                }
            }
                                                            
                                    if (collROptionOptionsRelatedByOption2Id != null)
            {
                for (int i = 0; i < collROptionOptionsRelatedByOption2Id.size(); i++)
                {
                    ((ROptionOption) collROptionOptionsRelatedByOption2Id.get(i)).save(con);
                }
            }
                                                            
                                    if (collTransitionsRelatedByFromOptionId != null)
            {
                for (int i = 0; i < collTransitionsRelatedByFromOptionId.size(); i++)
                {
                    ((Transition) collTransitionsRelatedByFromOptionId.get(i)).save(con);
                }
            }
                                                            
                                    if (collTransitionsRelatedByToOptionId != null)
            {
                for (int i = 0; i < collTransitionsRelatedByToOptionId.size(); i++)
                {
                    ((Transition) collTransitionsRelatedByToOptionId.get(i)).save(con);
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
     * @param key optionId ObjectKey
     */
    public void setPrimaryKey(ObjectKey key)
        throws TorqueException
    {
            setOptionId(new Integer(((NumberKey) key).intValue()));
        }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) throws TorqueException
    {
            setOptionId(new Integer(key));
        }

  
    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
          return SimpleKey.keyFor(getOptionId());
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
      public AttributeOption copy() throws TorqueException
    {
        return copyInto(new AttributeOption());
    }
  
    protected AttributeOption copyInto(AttributeOption copyObj) throws TorqueException
    {
          copyObj.setOptionId(optionId);
          copyObj.setAttributeId(attributeId);
          copyObj.setName(name);
          copyObj.setDeleted(deleted);
  
                    copyObj.setOptionId((Integer)null);
                              
                                                
                            
        List v = getActivitysRelatedByOldOptionId();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                Activity obj = (Activity) v.get(i);
                copyObj.addActivityRelatedByOldOptionId(obj.copy());
            }
        }
        else
        {
            copyObj.collActivitysRelatedByOldOptionId = null;
        }
                                                            
                            
        v = getActivitysRelatedByNewOptionId();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                Activity obj = (Activity) v.get(i);
                copyObj.addActivityRelatedByNewOptionId(obj.copy());
            }
        }
        else
        {
            copyObj.collActivitysRelatedByNewOptionId = null;
        }
                                                  
                            
        v = getAttributes();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                Attribute obj = (Attribute) v.get(i);
                copyObj.addAttribute(obj.copy());
            }
        }
        else
        {
            copyObj.collAttributes = null;
        }
                                                  
                            
        v = getConditions();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                Condition obj = (Condition) v.get(i);
                copyObj.addCondition(obj.copy());
            }
        }
        else
        {
            copyObj.collConditions = null;
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
                                                  
                            
        v = getRModuleOptions();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                RModuleOption obj = (RModuleOption) v.get(i);
                copyObj.addRModuleOption(obj.copy());
            }
        }
        else
        {
            copyObj.collRModuleOptions = null;
        }
                                                  
                            
        v = getRIssueTypeOptions();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                RIssueTypeOption obj = (RIssueTypeOption) v.get(i);
                copyObj.addRIssueTypeOption(obj.copy());
            }
        }
        else
        {
            copyObj.collRIssueTypeOptions = null;
        }
                                                            
                            
        v = getROptionOptionsRelatedByOption1Id();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                ROptionOption obj = (ROptionOption) v.get(i);
                copyObj.addROptionOptionRelatedByOption1Id(obj.copy());
            }
        }
        else
        {
            copyObj.collROptionOptionsRelatedByOption1Id = null;
        }
                                                            
                            
        v = getROptionOptionsRelatedByOption2Id();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                ROptionOption obj = (ROptionOption) v.get(i);
                copyObj.addROptionOptionRelatedByOption2Id(obj.copy());
            }
        }
        else
        {
            copyObj.collROptionOptionsRelatedByOption2Id = null;
        }
                                                            
                            
        v = getTransitionsRelatedByFromOptionId();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                Transition obj = (Transition) v.get(i);
                copyObj.addTransitionRelatedByFromOptionId(obj.copy());
            }
        }
        else
        {
            copyObj.collTransitionsRelatedByFromOptionId = null;
        }
                                                            
                            
        v = getTransitionsRelatedByToOptionId();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                Transition obj = (Transition) v.get(i);
                copyObj.addTransitionRelatedByToOptionId(obj.copy());
            }
        }
        else
        {
            copyObj.collTransitionsRelatedByToOptionId = null;
        }
                            return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public AttributeOptionPeer getPeer()
    {
        return peer;
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("AttributeOption:\n");
        str.append("OptionId = ")
               .append(getOptionId())
             .append("\n");
        str.append("AttributeId = ")
               .append(getAttributeId())
             .append("\n");
        str.append("Name = ")
               .append(getName())
             .append("\n");
        str.append("Deleted = ")
               .append(getDeleted())
             .append("\n");
        return(str.toString());
    }
}
