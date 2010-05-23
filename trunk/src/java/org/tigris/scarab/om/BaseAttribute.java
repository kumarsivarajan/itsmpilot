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
 * extended all references should be to Attribute
 */
public abstract class BaseAttribute extends BaseObject
    implements org.apache.fulcrum.intake.Retrievable
{
    /** The Peer class */
    private static final AttributePeer peer =
        new AttributePeer();

        
    /** The value for the attributeId field */
    private Integer attributeId;
      
    /** The value for the name field */
    private String name;
      
    /** The value for the typeId field */
    private Integer typeId;
      
    /** The value for the permission field */
    private String permission;
      
    /** The value for the requiredOptionId field */
    private Integer requiredOptionId;
      
    /** The value for the description field */
    private String description;
      
    /** The value for the action field */
    private String action;
      
    /** The value for the createdBy field */
    private Integer createdBy;
      
    /** The value for the createdDate field */
    private Date createdDate;
                                                                
    /** The value for the deleted field */
    private boolean deleted = false;
  
            
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
    
          
                                  
                  // update associated Activity
        if (collActivitys != null)
        {
            for (int i = 0; i < collActivitys.size(); i++)
            {
                ((Activity) collActivitys.get(i))
                        .setAttributeId(v);
            }
        }
                                                    
                  // update associated Condition
        if (collConditions != null)
        {
            for (int i = 0; i < collConditions.size(); i++)
            {
                ((Condition) collConditions.get(i))
                        .setAttributeId(v);
            }
        }
                                                    
                  // update associated RAttributeAttributeGroup
        if (collRAttributeAttributeGroups != null)
        {
            for (int i = 0; i < collRAttributeAttributeGroups.size(); i++)
            {
                ((RAttributeAttributeGroup) collRAttributeAttributeGroups.get(i))
                        .setAttributeId(v);
            }
        }
                                                    
                  // update associated AttributeOption
        if (collAttributeOptions != null)
        {
            for (int i = 0; i < collAttributeOptions.size(); i++)
            {
                ((AttributeOption) collAttributeOptions.get(i))
                        .setAttributeId(v);
            }
        }
                                                    
                  // update associated AttributeValue
        if (collAttributeValues != null)
        {
            for (int i = 0; i < collAttributeValues.size(); i++)
            {
                ((AttributeValue) collAttributeValues.get(i))
                        .setAttributeId(v);
            }
        }
                                                    
                  // update associated RModuleAttribute
        if (collRModuleAttributes != null)
        {
            for (int i = 0; i < collRModuleAttributes.size(); i++)
            {
                ((RModuleAttribute) collRModuleAttributes.get(i))
                        .setAttributeId(v);
            }
        }
                                                    
                  // update associated RIssueTypeAttribute
        if (collRIssueTypeAttributes != null)
        {
            for (int i = 0; i < collRIssueTypeAttributes.size(); i++)
            {
                ((RIssueTypeAttribute) collRIssueTypeAttributes.get(i))
                        .setAttributeId(v);
            }
        }
                                                    
                  // update associated RModuleUserAttribute
        if (collRModuleUserAttributes != null)
        {
            for (int i = 0; i < collRModuleUserAttributes.size(); i++)
            {
                ((RModuleUserAttribute) collRModuleUserAttributes.get(i))
                        .setAttributeId(v);
            }
        }
                                                    
                  // update associated Transition
        if (collTransitions != null)
        {
            for (int i = 0; i < collTransitions.size(); i++)
            {
                ((Transition) collTransitions.get(i))
                        .setAttributeId(v);
            }
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
    
                                  
                if (aAttributeType != null && !ObjectUtils.equals(aAttributeType.getAttributeTypeId(), v))
                {
            aAttributeType = null;
        }
      
              }
          
    /**
     * Get the Permission
     *
     * @return String
     */
    public String getPermission()
    {
        return permission;
    }

                        
    /**
     * Set the value of Permission
     *
     * @param v new value
     */
    public void setPermission(String v) 
    {
    
                  if (!ObjectUtils.equals(this.permission, v))
              {
            this.permission = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the RequiredOptionId
     *
     * @return Integer
     */
    public Integer getRequiredOptionId()
    {
        return requiredOptionId;
    }

                              
    /**
     * Set the value of RequiredOptionId
     *
     * @param v new value
     */
    public void setRequiredOptionId(Integer v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.requiredOptionId, v))
              {
            this.requiredOptionId = v;
            setModified(true);
        }
    
                                  
                if (aAttributeOption != null && !ObjectUtils.equals(aAttributeOption.getOptionId(), v))
                {
            aAttributeOption = null;
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
     * Get the Action
     *
     * @return String
     */
    public String getAction()
    {
        return action;
    }

                        
    /**
     * Set the value of Action
     *
     * @param v new value
     */
    public void setAction(String v) 
    {
    
                  if (!ObjectUtils.equals(this.action, v))
              {
            this.action = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the CreatedBy
     *
     * @return Integer
     */
    public Integer getCreatedBy()
    {
        return createdBy;
    }

                              
    /**
     * Set the value of CreatedBy
     *
     * @param v new value
     */
    public void setCreatedBy(Integer v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.createdBy, v))
              {
            this.createdBy = v;
            setModified(true);
        }
    
                                          
                if (aScarabUser != null && !ObjectUtils.equals(aScarabUser.getUserId(), v))
                {
            aScarabUser = null;
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
  
      
        
                  
    
        private AttributeType aAttributeType;

    /**
     * Declares an association between this object and a AttributeType object
     *
     * @param v AttributeType
     * @throws TorqueException
     */
    public void setAttributeType(AttributeType v) throws TorqueException
    {
            if (v == null)
        {
                  setTypeId((Integer) null);
              }
        else
        {
            setTypeId(v.getAttributeTypeId());
        }
            aAttributeType = v;
    }

                        
    /**
     * Returns the associated AttributeType object.
           * If it was not retrieved before, the object is retrieved from
     * the database
           *
     * @return the associated AttributeType object
           * @throws TorqueException
           */
    public AttributeType getAttributeType()
              throws TorqueException
          {
              if (aAttributeType == null && (!ObjectUtils.equals(this.typeId, null)))
        {
                    aAttributeType = AttributeTypeManager.getInstance(SimpleKey.keyFor(this.typeId));
                }
              return aAttributeType;
    }

    /**
     * Return the associated AttributeType object
     * If it was not retrieved before, the object is retrieved from
     * the database using the passed connection
     *
     * @param connection the connection used to retrieve the associated object
     *        from the database, if it was not retrieved before
     * @return the associated AttributeType object
     * @throws TorqueException
     */
    public AttributeType getAttributeType(Connection connection)
        throws TorqueException
    {
        if (aAttributeType == null && (!ObjectUtils.equals(this.typeId, null)))
        {
                    aAttributeType = AttributeTypeManager.getCachedInstance(SimpleKey.keyFor(this.typeId));
            if (aAttributeType == null)
            {
                          aAttributeType = AttributeTypePeer.retrieveByPK(SimpleKey.keyFor(this.typeId), connection);
                          AttributeTypeManager.putInstance(aAttributeType);
            }
                }
        return aAttributeType;
    }
    
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setAttributeTypeKey(ObjectKey key) throws TorqueException
    {
    
                    setTypeId(new Integer(((NumberKey) key).intValue()));
              }
  
        
                  
    
        private AttributeOption aAttributeOption;

    /**
     * Declares an association between this object and a AttributeOption object
     *
     * @param v AttributeOption
     * @throws TorqueException
     */
    public void setAttributeOption(AttributeOption v) throws TorqueException
    {
            if (v == null)
        {
                  setRequiredOptionId((Integer) null);
              }
        else
        {
            setRequiredOptionId(v.getOptionId());
        }
            aAttributeOption = v;
    }

                        
    /**
     * Returns the associated AttributeOption object.
           * If it was not retrieved before, the object is retrieved from
     * the database
           *
     * @return the associated AttributeOption object
           * @throws TorqueException
           */
    public AttributeOption getAttributeOption()
              throws TorqueException
          {
              if (aAttributeOption == null && (!ObjectUtils.equals(this.requiredOptionId, null)))
        {
                    aAttributeOption = AttributeOptionManager.getInstance(SimpleKey.keyFor(this.requiredOptionId));
                }
              return aAttributeOption;
    }

    /**
     * Return the associated AttributeOption object
     * If it was not retrieved before, the object is retrieved from
     * the database using the passed connection
     *
     * @param connection the connection used to retrieve the associated object
     *        from the database, if it was not retrieved before
     * @return the associated AttributeOption object
     * @throws TorqueException
     */
    public AttributeOption getAttributeOption(Connection connection)
        throws TorqueException
    {
        if (aAttributeOption == null && (!ObjectUtils.equals(this.requiredOptionId, null)))
        {
                    aAttributeOption = AttributeOptionManager.getCachedInstance(SimpleKey.keyFor(this.requiredOptionId));
            if (aAttributeOption == null)
            {
                          aAttributeOption = AttributeOptionPeer.retrieveByPK(SimpleKey.keyFor(this.requiredOptionId), connection);
                          AttributeOptionManager.putInstance(aAttributeOption);
            }
                }
        return aAttributeOption;
    }
    
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setAttributeOptionKey(ObjectKey key) throws TorqueException
    {
    
                    setRequiredOptionId(new Integer(((NumberKey) key).intValue()));
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
                  setCreatedBy((Integer) null);
              }
        else
        {
            setCreatedBy(v.getUserId());
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
              if (aScarabUser == null && (!ObjectUtils.equals(this.createdBy, null)))
        {
                    aScarabUser = ScarabUserManager.getInstance(SimpleKey.keyFor(this.createdBy));
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
        if (aScarabUser == null && (!ObjectUtils.equals(this.createdBy, null)))
        {
                    aScarabUser = ScarabUserManager.getCachedInstance(SimpleKey.keyFor(this.createdBy));
            if (aScarabUser == null)
            {
                          aScarabUser = ScarabUserImplPeer.retrieveScarabUserImplByPK(SimpleKey.keyFor(this.createdBy), connection);
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
    
                    setCreatedBy(new Integer(((NumberKey) key).intValue()));
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
        l.setAttribute((Attribute) this);
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
     * Otherwise if this Attribute has previously
           * been saved, it will retrieve related Activitys from storage.
     * If this Attribute is new, it will return
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
                        criteria.add(ActivityPeer.ATTRIBUTE_ID, getAttributeId() );
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
                            criteria.add(ActivityPeer.ATTRIBUTE_ID, getAttributeId());
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
     * Otherwise if this Attribute has previously
           * been saved, it will retrieve related Activitys from storage.
     * If this Attribute is new, it will return
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
                         criteria.add(ActivityPeer.ATTRIBUTE_ID, getAttributeId());
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
                             criteria.add(ActivityPeer.ATTRIBUTE_ID, getAttributeId());
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
     * Otherwise if this Attribute is new, it will return
                 * an empty collection; or if this Attribute has previously
     * been saved, it will retrieve related Activitys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attribute.
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
                              criteria.add(ActivityPeer.ATTRIBUTE_ID, getAttributeId());
                              collActivitys = ActivityPeer.doSelectJoinIssue(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.ATTRIBUTE_ID, getAttributeId());
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
     * Otherwise if this Attribute is new, it will return
                 * an empty collection; or if this Attribute has previously
     * been saved, it will retrieve related Activitys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attribute.
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
                              criteria.add(ActivityPeer.ATTRIBUTE_ID, getAttributeId());
                              collActivitys = ActivityPeer.doSelectJoinAttribute(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.ATTRIBUTE_ID, getAttributeId());
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
     * Otherwise if this Attribute is new, it will return
                 * an empty collection; or if this Attribute has previously
     * been saved, it will retrieve related Activitys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attribute.
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
                              criteria.add(ActivityPeer.ATTRIBUTE_ID, getAttributeId());
                              collActivitys = ActivityPeer.doSelectJoinActivitySet(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.ATTRIBUTE_ID, getAttributeId());
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
     * Otherwise if this Attribute is new, it will return
                 * an empty collection; or if this Attribute has previously
     * been saved, it will retrieve related Activitys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attribute.
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
                              criteria.add(ActivityPeer.ATTRIBUTE_ID, getAttributeId());
                              collActivitys = ActivityPeer.doSelectJoinScarabUserImplRelatedByOldUserId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.ATTRIBUTE_ID, getAttributeId());
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
     * Otherwise if this Attribute is new, it will return
                 * an empty collection; or if this Attribute has previously
     * been saved, it will retrieve related Activitys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attribute.
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
                              criteria.add(ActivityPeer.ATTRIBUTE_ID, getAttributeId());
                              collActivitys = ActivityPeer.doSelectJoinScarabUserImplRelatedByNewUserId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.ATTRIBUTE_ID, getAttributeId());
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
     * Otherwise if this Attribute is new, it will return
                 * an empty collection; or if this Attribute has previously
     * been saved, it will retrieve related Activitys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attribute.
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
                              criteria.add(ActivityPeer.ATTRIBUTE_ID, getAttributeId());
                              collActivitys = ActivityPeer.doSelectJoinAttributeOptionRelatedByOldOptionId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.ATTRIBUTE_ID, getAttributeId());
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
     * Otherwise if this Attribute is new, it will return
                 * an empty collection; or if this Attribute has previously
     * been saved, it will retrieve related Activitys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attribute.
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
                              criteria.add(ActivityPeer.ATTRIBUTE_ID, getAttributeId());
                              collActivitys = ActivityPeer.doSelectJoinAttributeOptionRelatedByNewOptionId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.ATTRIBUTE_ID, getAttributeId());
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
     * Otherwise if this Attribute is new, it will return
                 * an empty collection; or if this Attribute has previously
     * been saved, it will retrieve related Activitys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attribute.
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
                              criteria.add(ActivityPeer.ATTRIBUTE_ID, getAttributeId());
                              collActivitys = ActivityPeer.doSelectJoinAttachment(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.ATTRIBUTE_ID, getAttributeId());
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
     * Otherwise if this Attribute is new, it will return
                 * an empty collection; or if this Attribute has previously
     * been saved, it will retrieve related Activitys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attribute.
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
                              criteria.add(ActivityPeer.ATTRIBUTE_ID, getAttributeId());
                              collActivitys = ActivityPeer.doSelectJoinDepend(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.ATTRIBUTE_ID, getAttributeId());
                                    if (!lastActivitysCriteria.equals(criteria))
            {
                collActivitys = ActivityPeer.doSelectJoinDepend(criteria);
            }
        }
        lastActivitysCriteria = criteria;

        return collActivitys;
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
        l.setAttribute((Attribute) this);
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
     * Otherwise if this Attribute has previously
           * been saved, it will retrieve related Conditions from storage.
     * If this Attribute is new, it will return
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
                        criteria.add(ConditionPeer.ATTRIBUTE_ID, getAttributeId() );
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
                            criteria.add(ConditionPeer.ATTRIBUTE_ID, getAttributeId());
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
     * Otherwise if this Attribute has previously
           * been saved, it will retrieve related Conditions from storage.
     * If this Attribute is new, it will return
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
                         criteria.add(ConditionPeer.ATTRIBUTE_ID, getAttributeId());
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
                             criteria.add(ConditionPeer.ATTRIBUTE_ID, getAttributeId());
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
     * Otherwise if this Attribute is new, it will return
                 * an empty collection; or if this Attribute has previously
     * been saved, it will retrieve related Conditions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attribute.
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
                              criteria.add(ConditionPeer.ATTRIBUTE_ID, getAttributeId());
                              collConditions = ConditionPeer.doSelectJoinRModuleAttribute(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ConditionPeer.ATTRIBUTE_ID, getAttributeId());
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
     * Otherwise if this Attribute is new, it will return
                 * an empty collection; or if this Attribute has previously
     * been saved, it will retrieve related Conditions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attribute.
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
                              criteria.add(ConditionPeer.ATTRIBUTE_ID, getAttributeId());
                              collConditions = ConditionPeer.doSelectJoinTransition(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ConditionPeer.ATTRIBUTE_ID, getAttributeId());
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
     * Otherwise if this Attribute is new, it will return
                 * an empty collection; or if this Attribute has previously
     * been saved, it will retrieve related Conditions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attribute.
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
                              criteria.add(ConditionPeer.ATTRIBUTE_ID, getAttributeId());
                              collConditions = ConditionPeer.doSelectJoinAttribute(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ConditionPeer.ATTRIBUTE_ID, getAttributeId());
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
     * Otherwise if this Attribute is new, it will return
                 * an empty collection; or if this Attribute has previously
     * been saved, it will retrieve related Conditions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attribute.
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
                              criteria.add(ConditionPeer.ATTRIBUTE_ID, getAttributeId());
                              collConditions = ConditionPeer.doSelectJoinAttributeOption(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ConditionPeer.ATTRIBUTE_ID, getAttributeId());
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
     * Otherwise if this Attribute is new, it will return
                 * an empty collection; or if this Attribute has previously
     * been saved, it will retrieve related Conditions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attribute.
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
                              criteria.add(ConditionPeer.ATTRIBUTE_ID, getAttributeId());
                              collConditions = ConditionPeer.doSelectJoinRModuleIssueType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ConditionPeer.ATTRIBUTE_ID, getAttributeId());
                                    if (!lastConditionsCriteria.equals(criteria))
            {
                collConditions = ConditionPeer.doSelectJoinRModuleIssueType(criteria);
            }
        }
        lastConditionsCriteria = criteria;

        return collConditions;
                }
                            


                          
            
          /**
     * Collection to store aggregation of collRAttributeAttributeGroups
     */
    protected List collRAttributeAttributeGroups;

    /**
     * Temporary storage of collRAttributeAttributeGroups to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initRAttributeAttributeGroups()
    {
        if (collRAttributeAttributeGroups == null)
        {
            collRAttributeAttributeGroups = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a RAttributeAttributeGroup object to this object
     * through the RAttributeAttributeGroup foreign key attribute
     *
     * @param l RAttributeAttributeGroup
     * @throws TorqueException
     */
    public void addRAttributeAttributeGroup(RAttributeAttributeGroup l) throws TorqueException
    {
        getRAttributeAttributeGroups().add(l);
        l.setAttribute((Attribute) this);
    }

    /**
     * The criteria used to select the current contents of collRAttributeAttributeGroups
     */
    private Criteria lastRAttributeAttributeGroupsCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getRAttributeAttributeGroups(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getRAttributeAttributeGroups()
              throws TorqueException
          {
                      if (collRAttributeAttributeGroups == null)
        {
            collRAttributeAttributeGroups = getRAttributeAttributeGroups(new Criteria(10));
        }
                return collRAttributeAttributeGroups;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Attribute has previously
           * been saved, it will retrieve related RAttributeAttributeGroups from storage.
     * If this Attribute is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getRAttributeAttributeGroups(Criteria criteria) throws TorqueException
    {
              if (collRAttributeAttributeGroups == null)
        {
            if (isNew())
            {
               collRAttributeAttributeGroups = new ArrayList();
            }
            else
            {
                        criteria.add(RAttributeAttributeGroupPeer.ATTRIBUTE_ID, getAttributeId() );
                        collRAttributeAttributeGroups = RAttributeAttributeGroupPeer.doSelect(criteria);
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
                            criteria.add(RAttributeAttributeGroupPeer.ATTRIBUTE_ID, getAttributeId());
                            if (!lastRAttributeAttributeGroupsCriteria.equals(criteria))
                {
                    collRAttributeAttributeGroups = RAttributeAttributeGroupPeer.doSelect(criteria);
                }
            }
        }
        lastRAttributeAttributeGroupsCriteria = criteria;

        return collRAttributeAttributeGroups;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getRAttributeAttributeGroups(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getRAttributeAttributeGroups(Connection con) throws TorqueException
    {
              if (collRAttributeAttributeGroups == null)
        {
            collRAttributeAttributeGroups = getRAttributeAttributeGroups(new Criteria(10), con);
        }
        return collRAttributeAttributeGroups;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Attribute has previously
           * been saved, it will retrieve related RAttributeAttributeGroups from storage.
     * If this Attribute is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getRAttributeAttributeGroups(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collRAttributeAttributeGroups == null)
        {
            if (isNew())
            {
               collRAttributeAttributeGroups = new ArrayList();
            }
            else
            {
                         criteria.add(RAttributeAttributeGroupPeer.ATTRIBUTE_ID, getAttributeId());
                         collRAttributeAttributeGroups = RAttributeAttributeGroupPeer.doSelect(criteria, con);
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
                             criteria.add(RAttributeAttributeGroupPeer.ATTRIBUTE_ID, getAttributeId());
                             if (!lastRAttributeAttributeGroupsCriteria.equals(criteria))
                 {
                     collRAttributeAttributeGroups = RAttributeAttributeGroupPeer.doSelect(criteria, con);
                 }
             }
         }
         lastRAttributeAttributeGroupsCriteria = criteria;

         return collRAttributeAttributeGroups;
           }

                        
              
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Attribute is new, it will return
                 * an empty collection; or if this Attribute has previously
     * been saved, it will retrieve related RAttributeAttributeGroups from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attribute.
     */
    protected List getRAttributeAttributeGroupsJoinAttribute(Criteria criteria)
        throws TorqueException
    {
                    if (collRAttributeAttributeGroups == null)
        {
            if (isNew())
            {
               collRAttributeAttributeGroups = new ArrayList();
            }
            else
            {
                              criteria.add(RAttributeAttributeGroupPeer.ATTRIBUTE_ID, getAttributeId());
                              collRAttributeAttributeGroups = RAttributeAttributeGroupPeer.doSelectJoinAttribute(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RAttributeAttributeGroupPeer.ATTRIBUTE_ID, getAttributeId());
                                    if (!lastRAttributeAttributeGroupsCriteria.equals(criteria))
            {
                collRAttributeAttributeGroups = RAttributeAttributeGroupPeer.doSelectJoinAttribute(criteria);
            }
        }
        lastRAttributeAttributeGroupsCriteria = criteria;

        return collRAttributeAttributeGroups;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Attribute is new, it will return
                 * an empty collection; or if this Attribute has previously
     * been saved, it will retrieve related RAttributeAttributeGroups from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attribute.
     */
    protected List getRAttributeAttributeGroupsJoinAttributeGroup(Criteria criteria)
        throws TorqueException
    {
                    if (collRAttributeAttributeGroups == null)
        {
            if (isNew())
            {
               collRAttributeAttributeGroups = new ArrayList();
            }
            else
            {
                              criteria.add(RAttributeAttributeGroupPeer.ATTRIBUTE_ID, getAttributeId());
                              collRAttributeAttributeGroups = RAttributeAttributeGroupPeer.doSelectJoinAttributeGroup(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RAttributeAttributeGroupPeer.ATTRIBUTE_ID, getAttributeId());
                                    if (!lastRAttributeAttributeGroupsCriteria.equals(criteria))
            {
                collRAttributeAttributeGroups = RAttributeAttributeGroupPeer.doSelectJoinAttributeGroup(criteria);
            }
        }
        lastRAttributeAttributeGroupsCriteria = criteria;

        return collRAttributeAttributeGroups;
                }
                            


                          
            
          /**
     * Collection to store aggregation of collAttributeOptions
     */
    protected List collAttributeOptions;

    /**
     * Temporary storage of collAttributeOptions to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initAttributeOptions()
    {
        if (collAttributeOptions == null)
        {
            collAttributeOptions = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a AttributeOption object to this object
     * through the AttributeOption foreign key attribute
     *
     * @param l AttributeOption
     * @throws TorqueException
     */
    public void addAttributeOption(AttributeOption l) throws TorqueException
    {
        getAttributeOptions().add(l);
        l.setAttribute((Attribute) this);
    }

    /**
     * The criteria used to select the current contents of collAttributeOptions
     */
    private Criteria lastAttributeOptionsCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getAttributeOptions(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getAttributeOptions()
              throws TorqueException
          {
                      if (collAttributeOptions == null)
        {
            collAttributeOptions = getAttributeOptions(new Criteria(10));
        }
                return collAttributeOptions;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Attribute has previously
           * been saved, it will retrieve related AttributeOptions from storage.
     * If this Attribute is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getAttributeOptions(Criteria criteria) throws TorqueException
    {
              if (collAttributeOptions == null)
        {
            if (isNew())
            {
               collAttributeOptions = new ArrayList();
            }
            else
            {
                        criteria.add(AttributeOptionPeer.ATTRIBUTE_ID, getAttributeId() );
                        collAttributeOptions = AttributeOptionPeer.doSelect(criteria);
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
                            criteria.add(AttributeOptionPeer.ATTRIBUTE_ID, getAttributeId());
                            if (!lastAttributeOptionsCriteria.equals(criteria))
                {
                    collAttributeOptions = AttributeOptionPeer.doSelect(criteria);
                }
            }
        }
        lastAttributeOptionsCriteria = criteria;

        return collAttributeOptions;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getAttributeOptions(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getAttributeOptions(Connection con) throws TorqueException
    {
              if (collAttributeOptions == null)
        {
            collAttributeOptions = getAttributeOptions(new Criteria(10), con);
        }
        return collAttributeOptions;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Attribute has previously
           * been saved, it will retrieve related AttributeOptions from storage.
     * If this Attribute is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getAttributeOptions(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collAttributeOptions == null)
        {
            if (isNew())
            {
               collAttributeOptions = new ArrayList();
            }
            else
            {
                         criteria.add(AttributeOptionPeer.ATTRIBUTE_ID, getAttributeId());
                         collAttributeOptions = AttributeOptionPeer.doSelect(criteria, con);
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
                             criteria.add(AttributeOptionPeer.ATTRIBUTE_ID, getAttributeId());
                             if (!lastAttributeOptionsCriteria.equals(criteria))
                 {
                     collAttributeOptions = AttributeOptionPeer.doSelect(criteria, con);
                 }
             }
         }
         lastAttributeOptionsCriteria = criteria;

         return collAttributeOptions;
           }

                  
              
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Attribute is new, it will return
                 * an empty collection; or if this Attribute has previously
     * been saved, it will retrieve related AttributeOptions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attribute.
     */
    protected List getAttributeOptionsJoinAttribute(Criteria criteria)
        throws TorqueException
    {
                    if (collAttributeOptions == null)
        {
            if (isNew())
            {
               collAttributeOptions = new ArrayList();
            }
            else
            {
                              criteria.add(AttributeOptionPeer.ATTRIBUTE_ID, getAttributeId());
                              collAttributeOptions = AttributeOptionPeer.doSelectJoinAttribute(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttributeOptionPeer.ATTRIBUTE_ID, getAttributeId());
                                    if (!lastAttributeOptionsCriteria.equals(criteria))
            {
                collAttributeOptions = AttributeOptionPeer.doSelectJoinAttribute(criteria);
            }
        }
        lastAttributeOptionsCriteria = criteria;

        return collAttributeOptions;
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
        l.setAttribute((Attribute) this);
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
     * Otherwise if this Attribute has previously
           * been saved, it will retrieve related AttributeValues from storage.
     * If this Attribute is new, it will return
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
                        criteria.add(AttributeValuePeer.ATTRIBUTE_ID, getAttributeId() );
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
                            criteria.add(AttributeValuePeer.ATTRIBUTE_ID, getAttributeId());
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
     * Otherwise if this Attribute has previously
           * been saved, it will retrieve related AttributeValues from storage.
     * If this Attribute is new, it will return
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
                         criteria.add(AttributeValuePeer.ATTRIBUTE_ID, getAttributeId());
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
                             criteria.add(AttributeValuePeer.ATTRIBUTE_ID, getAttributeId());
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
     * Otherwise if this Attribute is new, it will return
                 * an empty collection; or if this Attribute has previously
     * been saved, it will retrieve related AttributeValues from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attribute.
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
                              criteria.add(AttributeValuePeer.ATTRIBUTE_ID, getAttributeId());
                              collAttributeValues = AttributeValuePeer.doSelectJoinIssue(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttributeValuePeer.ATTRIBUTE_ID, getAttributeId());
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
     * Otherwise if this Attribute is new, it will return
                 * an empty collection; or if this Attribute has previously
     * been saved, it will retrieve related AttributeValues from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attribute.
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
                              criteria.add(AttributeValuePeer.ATTRIBUTE_ID, getAttributeId());
                              collAttributeValues = AttributeValuePeer.doSelectJoinAttribute(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttributeValuePeer.ATTRIBUTE_ID, getAttributeId());
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
     * Otherwise if this Attribute is new, it will return
                 * an empty collection; or if this Attribute has previously
     * been saved, it will retrieve related AttributeValues from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attribute.
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
                              criteria.add(AttributeValuePeer.ATTRIBUTE_ID, getAttributeId());
                              collAttributeValues = AttributeValuePeer.doSelectJoinAttributeOption(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttributeValuePeer.ATTRIBUTE_ID, getAttributeId());
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
     * Otherwise if this Attribute is new, it will return
                 * an empty collection; or if this Attribute has previously
     * been saved, it will retrieve related AttributeValues from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attribute.
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
                              criteria.add(AttributeValuePeer.ATTRIBUTE_ID, getAttributeId());
                              collAttributeValues = AttributeValuePeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttributeValuePeer.ATTRIBUTE_ID, getAttributeId());
                                    if (!lastAttributeValuesCriteria.equals(criteria))
            {
                collAttributeValues = AttributeValuePeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        lastAttributeValuesCriteria = criteria;

        return collAttributeValues;
                }
                            


                          
            
          /**
     * Collection to store aggregation of collRModuleAttributes
     */
    protected List collRModuleAttributes;

    /**
     * Temporary storage of collRModuleAttributes to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initRModuleAttributes()
    {
        if (collRModuleAttributes == null)
        {
            collRModuleAttributes = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a RModuleAttribute object to this object
     * through the RModuleAttribute foreign key attribute
     *
     * @param l RModuleAttribute
     * @throws TorqueException
     */
    public void addRModuleAttribute(RModuleAttribute l) throws TorqueException
    {
        getRModuleAttributes().add(l);
        l.setAttribute((Attribute) this);
    }

    /**
     * The criteria used to select the current contents of collRModuleAttributes
     */
    private Criteria lastRModuleAttributesCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getRModuleAttributes(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getRModuleAttributes()
              throws TorqueException
          {
                      if (collRModuleAttributes == null)
        {
            collRModuleAttributes = getRModuleAttributes(new Criteria(10));
        }
                return collRModuleAttributes;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Attribute has previously
           * been saved, it will retrieve related RModuleAttributes from storage.
     * If this Attribute is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getRModuleAttributes(Criteria criteria) throws TorqueException
    {
              if (collRModuleAttributes == null)
        {
            if (isNew())
            {
               collRModuleAttributes = new ArrayList();
            }
            else
            {
                        criteria.add(RModuleAttributePeer.ATTRIBUTE_ID, getAttributeId() );
                        collRModuleAttributes = RModuleAttributePeer.doSelect(criteria);
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
                            criteria.add(RModuleAttributePeer.ATTRIBUTE_ID, getAttributeId());
                            if (!lastRModuleAttributesCriteria.equals(criteria))
                {
                    collRModuleAttributes = RModuleAttributePeer.doSelect(criteria);
                }
            }
        }
        lastRModuleAttributesCriteria = criteria;

        return collRModuleAttributes;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getRModuleAttributes(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getRModuleAttributes(Connection con) throws TorqueException
    {
              if (collRModuleAttributes == null)
        {
            collRModuleAttributes = getRModuleAttributes(new Criteria(10), con);
        }
        return collRModuleAttributes;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Attribute has previously
           * been saved, it will retrieve related RModuleAttributes from storage.
     * If this Attribute is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getRModuleAttributes(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collRModuleAttributes == null)
        {
            if (isNew())
            {
               collRModuleAttributes = new ArrayList();
            }
            else
            {
                         criteria.add(RModuleAttributePeer.ATTRIBUTE_ID, getAttributeId());
                         collRModuleAttributes = RModuleAttributePeer.doSelect(criteria, con);
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
                             criteria.add(RModuleAttributePeer.ATTRIBUTE_ID, getAttributeId());
                             if (!lastRModuleAttributesCriteria.equals(criteria))
                 {
                     collRModuleAttributes = RModuleAttributePeer.doSelect(criteria, con);
                 }
             }
         }
         lastRModuleAttributesCriteria = criteria;

         return collRModuleAttributes;
           }

                              
              
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Attribute is new, it will return
                 * an empty collection; or if this Attribute has previously
     * been saved, it will retrieve related RModuleAttributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attribute.
     */
    protected List getRModuleAttributesJoinAttribute(Criteria criteria)
        throws TorqueException
    {
                    if (collRModuleAttributes == null)
        {
            if (isNew())
            {
               collRModuleAttributes = new ArrayList();
            }
            else
            {
                              criteria.add(RModuleAttributePeer.ATTRIBUTE_ID, getAttributeId());
                              collRModuleAttributes = RModuleAttributePeer.doSelectJoinAttribute(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleAttributePeer.ATTRIBUTE_ID, getAttributeId());
                                    if (!lastRModuleAttributesCriteria.equals(criteria))
            {
                collRModuleAttributes = RModuleAttributePeer.doSelectJoinAttribute(criteria);
            }
        }
        lastRModuleAttributesCriteria = criteria;

        return collRModuleAttributes;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Attribute is new, it will return
                 * an empty collection; or if this Attribute has previously
     * been saved, it will retrieve related RModuleAttributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attribute.
     */
    protected List getRModuleAttributesJoinScarabModule(Criteria criteria)
        throws TorqueException
    {
                    if (collRModuleAttributes == null)
        {
            if (isNew())
            {
               collRModuleAttributes = new ArrayList();
            }
            else
            {
                              criteria.add(RModuleAttributePeer.ATTRIBUTE_ID, getAttributeId());
                              collRModuleAttributes = RModuleAttributePeer.doSelectJoinScarabModule(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleAttributePeer.ATTRIBUTE_ID, getAttributeId());
                                    if (!lastRModuleAttributesCriteria.equals(criteria))
            {
                collRModuleAttributes = RModuleAttributePeer.doSelectJoinScarabModule(criteria);
            }
        }
        lastRModuleAttributesCriteria = criteria;

        return collRModuleAttributes;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Attribute is new, it will return
                 * an empty collection; or if this Attribute has previously
     * been saved, it will retrieve related RModuleAttributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attribute.
     */
    protected List getRModuleAttributesJoinIssueType(Criteria criteria)
        throws TorqueException
    {
                    if (collRModuleAttributes == null)
        {
            if (isNew())
            {
               collRModuleAttributes = new ArrayList();
            }
            else
            {
                              criteria.add(RModuleAttributePeer.ATTRIBUTE_ID, getAttributeId());
                              collRModuleAttributes = RModuleAttributePeer.doSelectJoinIssueType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleAttributePeer.ATTRIBUTE_ID, getAttributeId());
                                    if (!lastRModuleAttributesCriteria.equals(criteria))
            {
                collRModuleAttributes = RModuleAttributePeer.doSelectJoinIssueType(criteria);
            }
        }
        lastRModuleAttributesCriteria = criteria;

        return collRModuleAttributes;
                }
                            


                          
            
          /**
     * Collection to store aggregation of collRIssueTypeAttributes
     */
    protected List collRIssueTypeAttributes;

    /**
     * Temporary storage of collRIssueTypeAttributes to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initRIssueTypeAttributes()
    {
        if (collRIssueTypeAttributes == null)
        {
            collRIssueTypeAttributes = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a RIssueTypeAttribute object to this object
     * through the RIssueTypeAttribute foreign key attribute
     *
     * @param l RIssueTypeAttribute
     * @throws TorqueException
     */
    public void addRIssueTypeAttribute(RIssueTypeAttribute l) throws TorqueException
    {
        getRIssueTypeAttributes().add(l);
        l.setAttribute((Attribute) this);
    }

    /**
     * The criteria used to select the current contents of collRIssueTypeAttributes
     */
    private Criteria lastRIssueTypeAttributesCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getRIssueTypeAttributes(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getRIssueTypeAttributes()
              throws TorqueException
          {
                      if (collRIssueTypeAttributes == null)
        {
            collRIssueTypeAttributes = getRIssueTypeAttributes(new Criteria(10));
        }
                return collRIssueTypeAttributes;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Attribute has previously
           * been saved, it will retrieve related RIssueTypeAttributes from storage.
     * If this Attribute is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getRIssueTypeAttributes(Criteria criteria) throws TorqueException
    {
              if (collRIssueTypeAttributes == null)
        {
            if (isNew())
            {
               collRIssueTypeAttributes = new ArrayList();
            }
            else
            {
                        criteria.add(RIssueTypeAttributePeer.ATTRIBUTE_ID, getAttributeId() );
                        collRIssueTypeAttributes = RIssueTypeAttributePeer.doSelect(criteria);
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
                            criteria.add(RIssueTypeAttributePeer.ATTRIBUTE_ID, getAttributeId());
                            if (!lastRIssueTypeAttributesCriteria.equals(criteria))
                {
                    collRIssueTypeAttributes = RIssueTypeAttributePeer.doSelect(criteria);
                }
            }
        }
        lastRIssueTypeAttributesCriteria = criteria;

        return collRIssueTypeAttributes;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getRIssueTypeAttributes(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getRIssueTypeAttributes(Connection con) throws TorqueException
    {
              if (collRIssueTypeAttributes == null)
        {
            collRIssueTypeAttributes = getRIssueTypeAttributes(new Criteria(10), con);
        }
        return collRIssueTypeAttributes;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Attribute has previously
           * been saved, it will retrieve related RIssueTypeAttributes from storage.
     * If this Attribute is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getRIssueTypeAttributes(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collRIssueTypeAttributes == null)
        {
            if (isNew())
            {
               collRIssueTypeAttributes = new ArrayList();
            }
            else
            {
                         criteria.add(RIssueTypeAttributePeer.ATTRIBUTE_ID, getAttributeId());
                         collRIssueTypeAttributes = RIssueTypeAttributePeer.doSelect(criteria, con);
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
                             criteria.add(RIssueTypeAttributePeer.ATTRIBUTE_ID, getAttributeId());
                             if (!lastRIssueTypeAttributesCriteria.equals(criteria))
                 {
                     collRIssueTypeAttributes = RIssueTypeAttributePeer.doSelect(criteria, con);
                 }
             }
         }
         lastRIssueTypeAttributesCriteria = criteria;

         return collRIssueTypeAttributes;
           }

                        
              
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Attribute is new, it will return
                 * an empty collection; or if this Attribute has previously
     * been saved, it will retrieve related RIssueTypeAttributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attribute.
     */
    protected List getRIssueTypeAttributesJoinAttribute(Criteria criteria)
        throws TorqueException
    {
                    if (collRIssueTypeAttributes == null)
        {
            if (isNew())
            {
               collRIssueTypeAttributes = new ArrayList();
            }
            else
            {
                              criteria.add(RIssueTypeAttributePeer.ATTRIBUTE_ID, getAttributeId());
                              collRIssueTypeAttributes = RIssueTypeAttributePeer.doSelectJoinAttribute(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RIssueTypeAttributePeer.ATTRIBUTE_ID, getAttributeId());
                                    if (!lastRIssueTypeAttributesCriteria.equals(criteria))
            {
                collRIssueTypeAttributes = RIssueTypeAttributePeer.doSelectJoinAttribute(criteria);
            }
        }
        lastRIssueTypeAttributesCriteria = criteria;

        return collRIssueTypeAttributes;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Attribute is new, it will return
                 * an empty collection; or if this Attribute has previously
     * been saved, it will retrieve related RIssueTypeAttributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attribute.
     */
    protected List getRIssueTypeAttributesJoinIssueType(Criteria criteria)
        throws TorqueException
    {
                    if (collRIssueTypeAttributes == null)
        {
            if (isNew())
            {
               collRIssueTypeAttributes = new ArrayList();
            }
            else
            {
                              criteria.add(RIssueTypeAttributePeer.ATTRIBUTE_ID, getAttributeId());
                              collRIssueTypeAttributes = RIssueTypeAttributePeer.doSelectJoinIssueType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RIssueTypeAttributePeer.ATTRIBUTE_ID, getAttributeId());
                                    if (!lastRIssueTypeAttributesCriteria.equals(criteria))
            {
                collRIssueTypeAttributes = RIssueTypeAttributePeer.doSelectJoinIssueType(criteria);
            }
        }
        lastRIssueTypeAttributesCriteria = criteria;

        return collRIssueTypeAttributes;
                }
                            


                          
            
          /**
     * Collection to store aggregation of collRModuleUserAttributes
     */
    protected List collRModuleUserAttributes;

    /**
     * Temporary storage of collRModuleUserAttributes to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initRModuleUserAttributes()
    {
        if (collRModuleUserAttributes == null)
        {
            collRModuleUserAttributes = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a RModuleUserAttribute object to this object
     * through the RModuleUserAttribute foreign key attribute
     *
     * @param l RModuleUserAttribute
     * @throws TorqueException
     */
    public void addRModuleUserAttribute(RModuleUserAttribute l) throws TorqueException
    {
        getRModuleUserAttributes().add(l);
        l.setAttribute((Attribute) this);
    }

    /**
     * The criteria used to select the current contents of collRModuleUserAttributes
     */
    private Criteria lastRModuleUserAttributesCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getRModuleUserAttributes(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getRModuleUserAttributes()
              throws TorqueException
          {
                      if (collRModuleUserAttributes == null)
        {
            collRModuleUserAttributes = getRModuleUserAttributes(new Criteria(10));
        }
                return collRModuleUserAttributes;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Attribute has previously
           * been saved, it will retrieve related RModuleUserAttributes from storage.
     * If this Attribute is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getRModuleUserAttributes(Criteria criteria) throws TorqueException
    {
              if (collRModuleUserAttributes == null)
        {
            if (isNew())
            {
               collRModuleUserAttributes = new ArrayList();
            }
            else
            {
                        criteria.add(RModuleUserAttributePeer.ATTRIBUTE_ID, getAttributeId() );
                        collRModuleUserAttributes = RModuleUserAttributePeer.doSelect(criteria);
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
                            criteria.add(RModuleUserAttributePeer.ATTRIBUTE_ID, getAttributeId());
                            if (!lastRModuleUserAttributesCriteria.equals(criteria))
                {
                    collRModuleUserAttributes = RModuleUserAttributePeer.doSelect(criteria);
                }
            }
        }
        lastRModuleUserAttributesCriteria = criteria;

        return collRModuleUserAttributes;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getRModuleUserAttributes(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getRModuleUserAttributes(Connection con) throws TorqueException
    {
              if (collRModuleUserAttributes == null)
        {
            collRModuleUserAttributes = getRModuleUserAttributes(new Criteria(10), con);
        }
        return collRModuleUserAttributes;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Attribute has previously
           * been saved, it will retrieve related RModuleUserAttributes from storage.
     * If this Attribute is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getRModuleUserAttributes(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collRModuleUserAttributes == null)
        {
            if (isNew())
            {
               collRModuleUserAttributes = new ArrayList();
            }
            else
            {
                         criteria.add(RModuleUserAttributePeer.ATTRIBUTE_ID, getAttributeId());
                         collRModuleUserAttributes = RModuleUserAttributePeer.doSelect(criteria, con);
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
                             criteria.add(RModuleUserAttributePeer.ATTRIBUTE_ID, getAttributeId());
                             if (!lastRModuleUserAttributesCriteria.equals(criteria))
                 {
                     collRModuleUserAttributes = RModuleUserAttributePeer.doSelect(criteria, con);
                 }
             }
         }
         lastRModuleUserAttributesCriteria = criteria;

         return collRModuleUserAttributes;
           }

                                          
              
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Attribute is new, it will return
                 * an empty collection; or if this Attribute has previously
     * been saved, it will retrieve related RModuleUserAttributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attribute.
     */
    protected List getRModuleUserAttributesJoinMITList(Criteria criteria)
        throws TorqueException
    {
                    if (collRModuleUserAttributes == null)
        {
            if (isNew())
            {
               collRModuleUserAttributes = new ArrayList();
            }
            else
            {
                              criteria.add(RModuleUserAttributePeer.ATTRIBUTE_ID, getAttributeId());
                              collRModuleUserAttributes = RModuleUserAttributePeer.doSelectJoinMITList(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleUserAttributePeer.ATTRIBUTE_ID, getAttributeId());
                                    if (!lastRModuleUserAttributesCriteria.equals(criteria))
            {
                collRModuleUserAttributes = RModuleUserAttributePeer.doSelectJoinMITList(criteria);
            }
        }
        lastRModuleUserAttributesCriteria = criteria;

        return collRModuleUserAttributes;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Attribute is new, it will return
                 * an empty collection; or if this Attribute has previously
     * been saved, it will retrieve related RModuleUserAttributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attribute.
     */
    protected List getRModuleUserAttributesJoinScarabModule(Criteria criteria)
        throws TorqueException
    {
                    if (collRModuleUserAttributes == null)
        {
            if (isNew())
            {
               collRModuleUserAttributes = new ArrayList();
            }
            else
            {
                              criteria.add(RModuleUserAttributePeer.ATTRIBUTE_ID, getAttributeId());
                              collRModuleUserAttributes = RModuleUserAttributePeer.doSelectJoinScarabModule(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleUserAttributePeer.ATTRIBUTE_ID, getAttributeId());
                                    if (!lastRModuleUserAttributesCriteria.equals(criteria))
            {
                collRModuleUserAttributes = RModuleUserAttributePeer.doSelectJoinScarabModule(criteria);
            }
        }
        lastRModuleUserAttributesCriteria = criteria;

        return collRModuleUserAttributes;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Attribute is new, it will return
                 * an empty collection; or if this Attribute has previously
     * been saved, it will retrieve related RModuleUserAttributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attribute.
     */
    protected List getRModuleUserAttributesJoinScarabUserImpl(Criteria criteria)
        throws TorqueException
    {
                    if (collRModuleUserAttributes == null)
        {
            if (isNew())
            {
               collRModuleUserAttributes = new ArrayList();
            }
            else
            {
                              criteria.add(RModuleUserAttributePeer.ATTRIBUTE_ID, getAttributeId());
                              collRModuleUserAttributes = RModuleUserAttributePeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleUserAttributePeer.ATTRIBUTE_ID, getAttributeId());
                                    if (!lastRModuleUserAttributesCriteria.equals(criteria))
            {
                collRModuleUserAttributes = RModuleUserAttributePeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        lastRModuleUserAttributesCriteria = criteria;

        return collRModuleUserAttributes;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Attribute is new, it will return
                 * an empty collection; or if this Attribute has previously
     * been saved, it will retrieve related RModuleUserAttributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attribute.
     */
    protected List getRModuleUserAttributesJoinIssueType(Criteria criteria)
        throws TorqueException
    {
                    if (collRModuleUserAttributes == null)
        {
            if (isNew())
            {
               collRModuleUserAttributes = new ArrayList();
            }
            else
            {
                              criteria.add(RModuleUserAttributePeer.ATTRIBUTE_ID, getAttributeId());
                              collRModuleUserAttributes = RModuleUserAttributePeer.doSelectJoinIssueType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleUserAttributePeer.ATTRIBUTE_ID, getAttributeId());
                                    if (!lastRModuleUserAttributesCriteria.equals(criteria))
            {
                collRModuleUserAttributes = RModuleUserAttributePeer.doSelectJoinIssueType(criteria);
            }
        }
        lastRModuleUserAttributesCriteria = criteria;

        return collRModuleUserAttributes;
                }
                  
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Attribute is new, it will return
                 * an empty collection; or if this Attribute has previously
     * been saved, it will retrieve related RModuleUserAttributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attribute.
     */
    protected List getRModuleUserAttributesJoinAttribute(Criteria criteria)
        throws TorqueException
    {
                    if (collRModuleUserAttributes == null)
        {
            if (isNew())
            {
               collRModuleUserAttributes = new ArrayList();
            }
            else
            {
                              criteria.add(RModuleUserAttributePeer.ATTRIBUTE_ID, getAttributeId());
                              collRModuleUserAttributes = RModuleUserAttributePeer.doSelectJoinAttribute(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleUserAttributePeer.ATTRIBUTE_ID, getAttributeId());
                                    if (!lastRModuleUserAttributesCriteria.equals(criteria))
            {
                collRModuleUserAttributes = RModuleUserAttributePeer.doSelectJoinAttribute(criteria);
            }
        }
        lastRModuleUserAttributesCriteria = criteria;

        return collRModuleUserAttributes;
                }
                            


                          
            
          /**
     * Collection to store aggregation of collTransitions
     */
    protected List collTransitions;

    /**
     * Temporary storage of collTransitions to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initTransitions()
    {
        if (collTransitions == null)
        {
            collTransitions = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a Transition object to this object
     * through the Transition foreign key attribute
     *
     * @param l Transition
     * @throws TorqueException
     */
    public void addTransition(Transition l) throws TorqueException
    {
        getTransitions().add(l);
        l.setAttribute((Attribute) this);
    }

    /**
     * The criteria used to select the current contents of collTransitions
     */
    private Criteria lastTransitionsCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getTransitions(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getTransitions()
              throws TorqueException
          {
                      if (collTransitions == null)
        {
            collTransitions = getTransitions(new Criteria(10));
        }
                return collTransitions;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Attribute has previously
           * been saved, it will retrieve related Transitions from storage.
     * If this Attribute is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getTransitions(Criteria criteria) throws TorqueException
    {
              if (collTransitions == null)
        {
            if (isNew())
            {
               collTransitions = new ArrayList();
            }
            else
            {
                        criteria.add(TransitionPeer.ATTRIBUTE_ID, getAttributeId() );
                        collTransitions = TransitionPeer.doSelect(criteria);
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
                            criteria.add(TransitionPeer.ATTRIBUTE_ID, getAttributeId());
                            if (!lastTransitionsCriteria.equals(criteria))
                {
                    collTransitions = TransitionPeer.doSelect(criteria);
                }
            }
        }
        lastTransitionsCriteria = criteria;

        return collTransitions;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getTransitions(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getTransitions(Connection con) throws TorqueException
    {
              if (collTransitions == null)
        {
            collTransitions = getTransitions(new Criteria(10), con);
        }
        return collTransitions;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Attribute has previously
           * been saved, it will retrieve related Transitions from storage.
     * If this Attribute is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getTransitions(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collTransitions == null)
        {
            if (isNew())
            {
               collTransitions = new ArrayList();
            }
            else
            {
                         criteria.add(TransitionPeer.ATTRIBUTE_ID, getAttributeId());
                         collTransitions = TransitionPeer.doSelect(criteria, con);
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
                             criteria.add(TransitionPeer.ATTRIBUTE_ID, getAttributeId());
                             if (!lastTransitionsCriteria.equals(criteria))
                 {
                     collTransitions = TransitionPeer.doSelect(criteria, con);
                 }
             }
         }
         lastTransitionsCriteria = criteria;

         return collTransitions;
           }

                              
              
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Attribute is new, it will return
                 * an empty collection; or if this Attribute has previously
     * been saved, it will retrieve related Transitions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attribute.
     */
    protected List getTransitionsJoinAttribute(Criteria criteria)
        throws TorqueException
    {
                    if (collTransitions == null)
        {
            if (isNew())
            {
               collTransitions = new ArrayList();
            }
            else
            {
                              criteria.add(TransitionPeer.ATTRIBUTE_ID, getAttributeId());
                              collTransitions = TransitionPeer.doSelectJoinAttribute(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(TransitionPeer.ATTRIBUTE_ID, getAttributeId());
                                    if (!lastTransitionsCriteria.equals(criteria))
            {
                collTransitions = TransitionPeer.doSelectJoinAttribute(criteria);
            }
        }
        lastTransitionsCriteria = criteria;

        return collTransitions;
                }
                  
                    
                    
                                            
                                                                          
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Attribute is new, it will return
                 * an empty collection; or if this Attribute has previously
     * been saved, it will retrieve related Transitions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attribute.
     */
    protected List getTransitionsJoinAttributeOptionRelatedByFromOptionId(Criteria criteria)
        throws TorqueException
    {
                    if (collTransitions == null)
        {
            if (isNew())
            {
               collTransitions = new ArrayList();
            }
            else
            {
                              criteria.add(TransitionPeer.ATTRIBUTE_ID, getAttributeId());
                              collTransitions = TransitionPeer.doSelectJoinAttributeOptionRelatedByFromOptionId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(TransitionPeer.ATTRIBUTE_ID, getAttributeId());
                                    if (!lastTransitionsCriteria.equals(criteria))
            {
                collTransitions = TransitionPeer.doSelectJoinAttributeOptionRelatedByFromOptionId(criteria);
            }
        }
        lastTransitionsCriteria = criteria;

        return collTransitions;
                }
                  
                    
                    
                                            
                                                                          
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Attribute is new, it will return
                 * an empty collection; or if this Attribute has previously
     * been saved, it will retrieve related Transitions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attribute.
     */
    protected List getTransitionsJoinAttributeOptionRelatedByToOptionId(Criteria criteria)
        throws TorqueException
    {
                    if (collTransitions == null)
        {
            if (isNew())
            {
               collTransitions = new ArrayList();
            }
            else
            {
                              criteria.add(TransitionPeer.ATTRIBUTE_ID, getAttributeId());
                              collTransitions = TransitionPeer.doSelectJoinAttributeOptionRelatedByToOptionId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(TransitionPeer.ATTRIBUTE_ID, getAttributeId());
                                    if (!lastTransitionsCriteria.equals(criteria))
            {
                collTransitions = TransitionPeer.doSelectJoinAttributeOptionRelatedByToOptionId(criteria);
            }
        }
        lastTransitionsCriteria = criteria;

        return collTransitions;
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
              fieldNames.add("AttributeId");
              fieldNames.add("Name");
              fieldNames.add("TypeId");
              fieldNames.add("Permission");
              fieldNames.add("RequiredOptionId");
              fieldNames.add("Description");
              fieldNames.add("Action");
              fieldNames.add("CreatedBy");
              fieldNames.add("CreatedDate");
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
          if (name.equals("AttributeId"))
        {
                return getAttributeId();
            }
          if (name.equals("Name"))
        {
                return getName();
            }
          if (name.equals("TypeId"))
        {
                return getTypeId();
            }
          if (name.equals("Permission"))
        {
                return getPermission();
            }
          if (name.equals("RequiredOptionId"))
        {
                return getRequiredOptionId();
            }
          if (name.equals("Description"))
        {
                return getDescription();
            }
          if (name.equals("Action"))
        {
                return getAction();
            }
          if (name.equals("CreatedBy"))
        {
                return getCreatedBy();
            }
          if (name.equals("CreatedDate"))
        {
                return getCreatedDate();
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
          if (name.equals(AttributePeer.ATTRIBUTE_ID))
        {
                return getAttributeId();
            }
          if (name.equals(AttributePeer.ATTRIBUTE_NAME))
        {
                return getName();
            }
          if (name.equals(AttributePeer.ATTRIBUTE_TYPE_ID))
        {
                return getTypeId();
            }
          if (name.equals(AttributePeer.PERMISSION))
        {
                return getPermission();
            }
          if (name.equals(AttributePeer.REQUIRED_OPTION_ID))
        {
                return getRequiredOptionId();
            }
          if (name.equals(AttributePeer.DESCRIPTION))
        {
                return getDescription();
            }
          if (name.equals(AttributePeer.ACTION))
        {
                return getAction();
            }
          if (name.equals(AttributePeer.CREATED_BY))
        {
                return getCreatedBy();
            }
          if (name.equals(AttributePeer.CREATED_DATE))
        {
                return getCreatedDate();
            }
          if (name.equals(AttributePeer.DELETED))
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
                return getAttributeId();
            }
              if (pos == 1)
        {
                return getName();
            }
              if (pos == 2)
        {
                return getTypeId();
            }
              if (pos == 3)
        {
                return getPermission();
            }
              if (pos == 4)
        {
                return getRequiredOptionId();
            }
              if (pos == 5)
        {
                return getDescription();
            }
              if (pos == 6)
        {
                return getAction();
            }
              if (pos == 7)
        {
                return getCreatedBy();
            }
              if (pos == 8)
        {
                return getCreatedDate();
            }
              if (pos == 9)
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
          save(AttributePeer.getMapBuilder()
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
                    AttributePeer.doInsert((Attribute) this, con);
                    setNew(false);
                }
                else
                {
                    AttributePeer.doUpdate((Attribute) this, con);
                }

    
                      if (isCacheOnSave())
                {
                    AttributeManager.putInstance(this);
                }
              }

                                      
                                    if (collActivitys != null)
            {
                for (int i = 0; i < collActivitys.size(); i++)
                {
                    ((Activity) collActivitys.get(i)).save(con);
                }
            }
                                                  
                                    if (collConditions != null)
            {
                for (int i = 0; i < collConditions.size(); i++)
                {
                    ((Condition) collConditions.get(i)).save(con);
                }
            }
                                                  
                                    if (collRAttributeAttributeGroups != null)
            {
                for (int i = 0; i < collRAttributeAttributeGroups.size(); i++)
                {
                    ((RAttributeAttributeGroup) collRAttributeAttributeGroups.get(i)).save(con);
                }
            }
                                                  
                                    if (collAttributeOptions != null)
            {
                for (int i = 0; i < collAttributeOptions.size(); i++)
                {
                    ((AttributeOption) collAttributeOptions.get(i)).save(con);
                }
            }
                                                  
                                    if (collAttributeValues != null)
            {
                for (int i = 0; i < collAttributeValues.size(); i++)
                {
                    ((AttributeValue) collAttributeValues.get(i)).save(con);
                }
            }
                                                  
                                    if (collRModuleAttributes != null)
            {
                for (int i = 0; i < collRModuleAttributes.size(); i++)
                {
                    ((RModuleAttribute) collRModuleAttributes.get(i)).save(con);
                }
            }
                                                  
                                    if (collRIssueTypeAttributes != null)
            {
                for (int i = 0; i < collRIssueTypeAttributes.size(); i++)
                {
                    ((RIssueTypeAttribute) collRIssueTypeAttributes.get(i)).save(con);
                }
            }
                                                  
                                    if (collRModuleUserAttributes != null)
            {
                for (int i = 0; i < collRModuleUserAttributes.size(); i++)
                {
                    ((RModuleUserAttribute) collRModuleUserAttributes.get(i)).save(con);
                }
            }
                                                  
                                    if (collTransitions != null)
            {
                for (int i = 0; i < collTransitions.size(); i++)
                {
                    ((Transition) collTransitions.get(i)).save(con);
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
     * @param key attributeId ObjectKey
     */
    public void setPrimaryKey(ObjectKey key)
        throws TorqueException
    {
            setAttributeId(new Integer(((NumberKey) key).intValue()));
        }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) throws TorqueException
    {
            setAttributeId(new Integer(key));
        }

  
    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
          return SimpleKey.keyFor(getAttributeId());
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
      public Attribute copy() throws TorqueException
    {
        return copyInto(new Attribute());
    }
  
    protected Attribute copyInto(Attribute copyObj) throws TorqueException
    {
          copyObj.setAttributeId(attributeId);
          copyObj.setName(name);
          copyObj.setTypeId(typeId);
          copyObj.setPermission(permission);
          copyObj.setRequiredOptionId(requiredOptionId);
          copyObj.setDescription(description);
          copyObj.setAction(action);
          copyObj.setCreatedBy(createdBy);
          copyObj.setCreatedDate(createdDate);
          copyObj.setDeleted(deleted);
  
                    copyObj.setAttributeId((Integer)null);
                                                                  
                                      
                            
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
                                                  
                            
        v = getRAttributeAttributeGroups();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                RAttributeAttributeGroup obj = (RAttributeAttributeGroup) v.get(i);
                copyObj.addRAttributeAttributeGroup(obj.copy());
            }
        }
        else
        {
            copyObj.collRAttributeAttributeGroups = null;
        }
                                                  
                            
        v = getAttributeOptions();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                AttributeOption obj = (AttributeOption) v.get(i);
                copyObj.addAttributeOption(obj.copy());
            }
        }
        else
        {
            copyObj.collAttributeOptions = null;
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
                                                  
                            
        v = getRModuleAttributes();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                RModuleAttribute obj = (RModuleAttribute) v.get(i);
                copyObj.addRModuleAttribute(obj.copy());
            }
        }
        else
        {
            copyObj.collRModuleAttributes = null;
        }
                                                  
                            
        v = getRIssueTypeAttributes();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                RIssueTypeAttribute obj = (RIssueTypeAttribute) v.get(i);
                copyObj.addRIssueTypeAttribute(obj.copy());
            }
        }
        else
        {
            copyObj.collRIssueTypeAttributes = null;
        }
                                                  
                            
        v = getRModuleUserAttributes();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                RModuleUserAttribute obj = (RModuleUserAttribute) v.get(i);
                copyObj.addRModuleUserAttribute(obj.copy());
            }
        }
        else
        {
            copyObj.collRModuleUserAttributes = null;
        }
                                                  
                            
        v = getTransitions();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                Transition obj = (Transition) v.get(i);
                copyObj.addTransition(obj.copy());
            }
        }
        else
        {
            copyObj.collTransitions = null;
        }
                            return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public AttributePeer getPeer()
    {
        return peer;
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("Attribute:\n");
        str.append("AttributeId = ")
               .append(getAttributeId())
             .append("\n");
        str.append("Name = ")
               .append(getName())
             .append("\n");
        str.append("TypeId = ")
               .append(getTypeId())
             .append("\n");
        str.append("Permission = ")
               .append(getPermission())
             .append("\n");
        str.append("RequiredOptionId = ")
               .append(getRequiredOptionId())
             .append("\n");
        str.append("Description = ")
               .append(getDescription())
             .append("\n");
        str.append("Action = ")
               .append(getAction())
             .append("\n");
        str.append("CreatedBy = ")
               .append(getCreatedBy())
             .append("\n");
        str.append("CreatedDate = ")
               .append(getCreatedDate())
             .append("\n");
        str.append("Deleted = ")
               .append(getDeleted())
             .append("\n");
        return(str.toString());
    }
}
