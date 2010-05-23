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
 * extended all references should be to Transition
 */
public abstract class BaseTransition extends BaseObject
    implements org.apache.fulcrum.intake.Retrievable
{
    /** The Peer class */
    private static final TransitionPeer peer =
        new TransitionPeer();

        
    /** The value for the transitionId field */
    private Integer transitionId;
      
    /** The value for the roleId field */
    private Integer roleId;
      
    /** The value for the attributeId field */
    private Integer attributeId;
      
    /** The value for the fromOptionId field */
    private Integer fromOptionId;
      
    /** The value for the toOptionId field */
    private Integer toOptionId;
                                                                
    /** The value for the disabledIfBlocked field */
    private boolean disabledIfBlocked = false;
  
            
    /**
     * Get the TransitionId
     *
     * @return Integer
     */
    public Integer getTransitionId()
    {
        return transitionId;
    }

                                              
    /**
     * Set the value of TransitionId
     *
     * @param v new value
     */
    public void setTransitionId(Integer v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.transitionId, v))
              {
            this.transitionId = v;
            setModified(true);
        }
    
          
                                  
                  // update associated Condition
        if (collConditions != null)
        {
            for (int i = 0; i < collConditions.size(); i++)
            {
                ((Condition) collConditions.get(i))
                        .setTransitionId(v);
            }
        }
                                }
          
    /**
     * Get the RoleId
     *
     * @return Integer
     */
    public Integer getRoleId()
    {
        return roleId;
    }

                        
    /**
     * Set the value of RoleId
     *
     * @param v new value
     */
    public void setRoleId(Integer v) 
    {
    
                  if (!ObjectUtils.equals(this.roleId, v))
              {
            this.roleId = v;
            setModified(true);
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
     * Get the FromOptionId
     *
     * @return Integer
     */
    public Integer getFromOptionId()
    {
        return fromOptionId;
    }

                              
    /**
     * Set the value of FromOptionId
     *
     * @param v new value
     */
    public void setFromOptionId(Integer v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.fromOptionId, v))
              {
            this.fromOptionId = v;
            setModified(true);
        }
    
                                                                          
                if (aAttributeOptionRelatedByFromOptionId != null && !ObjectUtils.equals(aAttributeOptionRelatedByFromOptionId.getOptionId(), v))
                {
            aAttributeOptionRelatedByFromOptionId = null;
        }
      
              }
          
    /**
     * Get the ToOptionId
     *
     * @return Integer
     */
    public Integer getToOptionId()
    {
        return toOptionId;
    }

                              
    /**
     * Set the value of ToOptionId
     *
     * @param v new value
     */
    public void setToOptionId(Integer v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.toOptionId, v))
              {
            this.toOptionId = v;
            setModified(true);
        }
    
                                                                          
                if (aAttributeOptionRelatedByToOptionId != null && !ObjectUtils.equals(aAttributeOptionRelatedByToOptionId.getOptionId(), v))
                {
            aAttributeOptionRelatedByToOptionId = null;
        }
      
              }
          
    /**
     * Get the DisabledIfBlocked
     *
     * @return boolean
     */
    public boolean getDisabledIfBlocked()
    {
        return disabledIfBlocked;
    }

                        
    /**
     * Set the value of DisabledIfBlocked
     *
     * @param v new value
     */
    public void setDisabledIfBlocked(boolean v) 
    {
    
                  if (this.disabledIfBlocked != v)
              {
            this.disabledIfBlocked = v;
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
  
        
                        
        
        private AttributeOption aAttributeOptionRelatedByFromOptionId;

    /**
     * Declares an association between this object and a AttributeOption object
     *
     * @param v AttributeOption
     * @throws TorqueException
     */
    public void setAttributeOptionRelatedByFromOptionId(AttributeOption v) throws TorqueException
    {
            if (v == null)
        {
                  setFromOptionId((Integer) null);
              }
        else
        {
            setFromOptionId(v.getOptionId());
        }
            aAttributeOptionRelatedByFromOptionId = v;
    }

                        
    /**
     * Returns the associated AttributeOption object.
           * If it was not retrieved before, the object is retrieved from
     * the database
           *
     * @return the associated AttributeOption object
           * @throws TorqueException
           */
    public AttributeOption getAttributeOptionRelatedByFromOptionId()
              throws TorqueException
          {
              if (aAttributeOptionRelatedByFromOptionId == null && (!ObjectUtils.equals(this.fromOptionId, null)))
        {
                    aAttributeOptionRelatedByFromOptionId = AttributeOptionManager.getInstance(SimpleKey.keyFor(this.fromOptionId));
                }
              return aAttributeOptionRelatedByFromOptionId;
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
    public AttributeOption getAttributeOptionRelatedByFromOptionId(Connection connection)
        throws TorqueException
    {
        if (aAttributeOptionRelatedByFromOptionId == null && (!ObjectUtils.equals(this.fromOptionId, null)))
        {
                    aAttributeOptionRelatedByFromOptionId = AttributeOptionManager.getCachedInstance(SimpleKey.keyFor(this.fromOptionId));
            if (aAttributeOptionRelatedByFromOptionId == null)
            {
                          aAttributeOptionRelatedByFromOptionId = AttributeOptionPeer.retrieveByPK(SimpleKey.keyFor(this.fromOptionId), connection);
                          AttributeOptionManager.putInstance(aAttributeOptionRelatedByFromOptionId);
            }
                }
        return aAttributeOptionRelatedByFromOptionId;
    }
    
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setAttributeOptionRelatedByFromOptionIdKey(ObjectKey key) throws TorqueException
    {
    
                    setFromOptionId(new Integer(((NumberKey) key).intValue()));
              }
  
        
                        
        
        private AttributeOption aAttributeOptionRelatedByToOptionId;

    /**
     * Declares an association between this object and a AttributeOption object
     *
     * @param v AttributeOption
     * @throws TorqueException
     */
    public void setAttributeOptionRelatedByToOptionId(AttributeOption v) throws TorqueException
    {
            if (v == null)
        {
                  setToOptionId((Integer) null);
              }
        else
        {
            setToOptionId(v.getOptionId());
        }
            aAttributeOptionRelatedByToOptionId = v;
    }

                        
    /**
     * Returns the associated AttributeOption object.
           * If it was not retrieved before, the object is retrieved from
     * the database
           *
     * @return the associated AttributeOption object
           * @throws TorqueException
           */
    public AttributeOption getAttributeOptionRelatedByToOptionId()
              throws TorqueException
          {
              if (aAttributeOptionRelatedByToOptionId == null && (!ObjectUtils.equals(this.toOptionId, null)))
        {
                    aAttributeOptionRelatedByToOptionId = AttributeOptionManager.getInstance(SimpleKey.keyFor(this.toOptionId));
                }
              return aAttributeOptionRelatedByToOptionId;
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
    public AttributeOption getAttributeOptionRelatedByToOptionId(Connection connection)
        throws TorqueException
    {
        if (aAttributeOptionRelatedByToOptionId == null && (!ObjectUtils.equals(this.toOptionId, null)))
        {
                    aAttributeOptionRelatedByToOptionId = AttributeOptionManager.getCachedInstance(SimpleKey.keyFor(this.toOptionId));
            if (aAttributeOptionRelatedByToOptionId == null)
            {
                          aAttributeOptionRelatedByToOptionId = AttributeOptionPeer.retrieveByPK(SimpleKey.keyFor(this.toOptionId), connection);
                          AttributeOptionManager.putInstance(aAttributeOptionRelatedByToOptionId);
            }
                }
        return aAttributeOptionRelatedByToOptionId;
    }
    
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setAttributeOptionRelatedByToOptionIdKey(ObjectKey key) throws TorqueException
    {
    
                    setToOptionId(new Integer(((NumberKey) key).intValue()));
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
        l.setTransition((Transition) this);
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
     * Otherwise if this Transition has previously
           * been saved, it will retrieve related Conditions from storage.
     * If this Transition is new, it will return
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
                        criteria.add(ConditionPeer.TRANSITION_ID, getTransitionId() );
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
                            criteria.add(ConditionPeer.TRANSITION_ID, getTransitionId());
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
     * Otherwise if this Transition has previously
           * been saved, it will retrieve related Conditions from storage.
     * If this Transition is new, it will return
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
                         criteria.add(ConditionPeer.TRANSITION_ID, getTransitionId());
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
                             criteria.add(ConditionPeer.TRANSITION_ID, getTransitionId());
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
     * Otherwise if this Transition is new, it will return
                 * an empty collection; or if this Transition has previously
     * been saved, it will retrieve related Conditions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Transition.
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
                              criteria.add(ConditionPeer.TRANSITION_ID, getTransitionId());
                              collConditions = ConditionPeer.doSelectJoinRModuleAttribute(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ConditionPeer.TRANSITION_ID, getTransitionId());
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
     * Otherwise if this Transition is new, it will return
                 * an empty collection; or if this Transition has previously
     * been saved, it will retrieve related Conditions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Transition.
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
                              criteria.add(ConditionPeer.TRANSITION_ID, getTransitionId());
                              collConditions = ConditionPeer.doSelectJoinTransition(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ConditionPeer.TRANSITION_ID, getTransitionId());
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
     * Otherwise if this Transition is new, it will return
                 * an empty collection; or if this Transition has previously
     * been saved, it will retrieve related Conditions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Transition.
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
                              criteria.add(ConditionPeer.TRANSITION_ID, getTransitionId());
                              collConditions = ConditionPeer.doSelectJoinAttribute(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ConditionPeer.TRANSITION_ID, getTransitionId());
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
     * Otherwise if this Transition is new, it will return
                 * an empty collection; or if this Transition has previously
     * been saved, it will retrieve related Conditions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Transition.
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
                              criteria.add(ConditionPeer.TRANSITION_ID, getTransitionId());
                              collConditions = ConditionPeer.doSelectJoinAttributeOption(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ConditionPeer.TRANSITION_ID, getTransitionId());
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
     * Otherwise if this Transition is new, it will return
                 * an empty collection; or if this Transition has previously
     * been saved, it will retrieve related Conditions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Transition.
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
                              criteria.add(ConditionPeer.TRANSITION_ID, getTransitionId());
                              collConditions = ConditionPeer.doSelectJoinRModuleIssueType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ConditionPeer.TRANSITION_ID, getTransitionId());
                                    if (!lastConditionsCriteria.equals(criteria))
            {
                collConditions = ConditionPeer.doSelectJoinRModuleIssueType(criteria);
            }
        }
        lastConditionsCriteria = criteria;

        return collConditions;
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
              fieldNames.add("TransitionId");
              fieldNames.add("RoleId");
              fieldNames.add("AttributeId");
              fieldNames.add("FromOptionId");
              fieldNames.add("ToOptionId");
              fieldNames.add("DisabledIfBlocked");
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
          if (name.equals("TransitionId"))
        {
                return getTransitionId();
            }
          if (name.equals("RoleId"))
        {
                return getRoleId();
            }
          if (name.equals("AttributeId"))
        {
                return getAttributeId();
            }
          if (name.equals("FromOptionId"))
        {
                return getFromOptionId();
            }
          if (name.equals("ToOptionId"))
        {
                return getToOptionId();
            }
          if (name.equals("DisabledIfBlocked"))
        {
                return Boolean.valueOf(getDisabledIfBlocked());
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
          if (name.equals(TransitionPeer.TRANSITION_ID))
        {
                return getTransitionId();
            }
          if (name.equals(TransitionPeer.ROLE_ID))
        {
                return getRoleId();
            }
          if (name.equals(TransitionPeer.ATTRIBUTE_ID))
        {
                return getAttributeId();
            }
          if (name.equals(TransitionPeer.FROM_OPTION_ID))
        {
                return getFromOptionId();
            }
          if (name.equals(TransitionPeer.TO_OPTION_ID))
        {
                return getToOptionId();
            }
          if (name.equals(TransitionPeer.DISABLED_IF_BLOCKED))
        {
                return Boolean.valueOf(getDisabledIfBlocked());
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
                return getTransitionId();
            }
              if (pos == 1)
        {
                return getRoleId();
            }
              if (pos == 2)
        {
                return getAttributeId();
            }
              if (pos == 3)
        {
                return getFromOptionId();
            }
              if (pos == 4)
        {
                return getToOptionId();
            }
              if (pos == 5)
        {
                return Boolean.valueOf(getDisabledIfBlocked());
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
          save(TransitionPeer.getMapBuilder()
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
                    TransitionPeer.doInsert((Transition) this, con);
                    setNew(false);
                }
                else
                {
                    TransitionPeer.doUpdate((Transition) this, con);
                }

    
                      if (isCacheOnSave())
                {
                    TransitionManager.putInstance(this);
                }
              }

                                      
                                    if (collConditions != null)
            {
                for (int i = 0; i < collConditions.size(); i++)
                {
                    ((Condition) collConditions.get(i)).save(con);
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
     * @param key transitionId ObjectKey
     */
    public void setPrimaryKey(ObjectKey key)
        throws TorqueException
    {
            setTransitionId(new Integer(((NumberKey) key).intValue()));
        }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) throws TorqueException
    {
            setTransitionId(new Integer(key));
        }

  
    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
          return SimpleKey.keyFor(getTransitionId());
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
      public Transition copy() throws TorqueException
    {
        return copyInto(new Transition());
    }
  
    protected Transition copyInto(Transition copyObj) throws TorqueException
    {
          copyObj.setTransitionId(transitionId);
          copyObj.setRoleId(roleId);
          copyObj.setAttributeId(attributeId);
          copyObj.setFromOptionId(fromOptionId);
          copyObj.setToOptionId(toOptionId);
          copyObj.setDisabledIfBlocked(disabledIfBlocked);
  
                    copyObj.setTransitionId((Integer)null);
                                          
                                      
                            
        List v = getConditions();
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
                            return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public TransitionPeer getPeer()
    {
        return peer;
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("Transition:\n");
        str.append("TransitionId = ")
               .append(getTransitionId())
             .append("\n");
        str.append("RoleId = ")
               .append(getRoleId())
             .append("\n");
        str.append("AttributeId = ")
               .append(getAttributeId())
             .append("\n");
        str.append("FromOptionId = ")
               .append(getFromOptionId())
             .append("\n");
        str.append("ToOptionId = ")
               .append(getToOptionId())
             .append("\n");
        str.append("DisabledIfBlocked = ")
               .append(getDisabledIfBlocked())
             .append("\n");
        return(str.toString());
    }
}
