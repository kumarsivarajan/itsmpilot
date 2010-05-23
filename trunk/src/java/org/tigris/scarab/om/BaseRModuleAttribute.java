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
 * extended all references should be to RModuleAttribute
 */
public abstract class BaseRModuleAttribute extends BaseObject
    implements org.apache.fulcrum.intake.Retrievable
{
    /** The Peer class */
    private static final RModuleAttributePeer peer =
        new RModuleAttributePeer();

        
    /** The value for the moduleId field */
    private Integer moduleId;
      
    /** The value for the attributeId field */
    private Integer attributeId;
      
    /** The value for the issueTypeId field */
    private Integer issueTypeId;
      
    /** The value for the displayValue field */
    private String displayValue;
                                                                
    /** The value for the active field */
    private boolean active = true;
                                                                
    /** The value for the required field */
    private boolean required = false;
                                          
    /** The value for the order field */
    private int order = 0;
                                                                
    /** The value for the quickSearch field */
    private boolean quickSearch = false;
                                                                
    /** The value for the defaultTextFlag field */
    private boolean defaultTextFlag = false;
  
            
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
      
                                  
                  // update associated Condition
        if (collConditions != null)
        {
            for (int i = 0; i < collConditions.size(); i++)
            {
                ((Condition) collConditions.get(i))
                        .setModuleId(v);
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
      
                                  
                  // update associated Condition
        if (collConditions != null)
        {
            for (int i = 0; i < collConditions.size(); i++)
            {
                ((Condition) collConditions.get(i))
                        .setAttributeId(v);
            }
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
      
                                  
                  // update associated Condition
        if (collConditions != null)
        {
            for (int i = 0; i < collConditions.size(); i++)
            {
                ((Condition) collConditions.get(i))
                        .setIssueTypeId(v);
            }
        }
                                }
          
    /**
     * Get the DisplayValue
     *
     * @return String
     */
    public String getDisplayValue()
    {
        return displayValue;
    }

                        
    /**
     * Set the value of DisplayValue
     *
     * @param v new value
     */
    public void setDisplayValue(String v) 
    {
    
                  if (!ObjectUtils.equals(this.displayValue, v))
              {
            this.displayValue = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the Active
     *
     * @return boolean
     */
    public boolean getActive()
    {
        return active;
    }

                        
    /**
     * Set the value of Active
     *
     * @param v new value
     */
    public void setActive(boolean v) 
    {
    
                  if (this.active != v)
              {
            this.active = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the Required
     *
     * @return boolean
     */
    public boolean getRequired()
    {
        return required;
    }

                        
    /**
     * Set the value of Required
     *
     * @param v new value
     */
    public void setRequired(boolean v) 
    {
    
                  if (this.required != v)
              {
            this.required = v;
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
          
    /**
     * Get the QuickSearch
     *
     * @return boolean
     */
    public boolean getQuickSearch()
    {
        return quickSearch;
    }

                        
    /**
     * Set the value of QuickSearch
     *
     * @param v new value
     */
    public void setQuickSearch(boolean v) 
    {
    
                  if (this.quickSearch != v)
              {
            this.quickSearch = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the DefaultTextFlag
     *
     * @return boolean
     */
    public boolean getDefaultTextFlag()
    {
        return defaultTextFlag;
    }

                        
    /**
     * Set the value of DefaultTextFlag
     *
     * @param v new value
     */
    public void setDefaultTextFlag(boolean v) 
    {
    
                  if (this.defaultTextFlag != v)
              {
            this.defaultTextFlag = v;
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
        l.setRModuleAttribute((RModuleAttribute) this);
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
     * Otherwise if this RModuleAttribute has previously
           * been saved, it will retrieve related Conditions from storage.
     * If this RModuleAttribute is new, it will return
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
                        criteria.add(ConditionPeer.MODULE_ID, getModuleId() );
                        criteria.add(ConditionPeer.ATTRIBUTE_ID, getAttributeId() );
                        criteria.add(ConditionPeer.ISSUE_TYPE_ID, getIssueTypeId() );
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
                            criteria.add(ConditionPeer.MODULE_ID, getModuleId());
                      criteria.add(ConditionPeer.ATTRIBUTE_ID, getAttributeId());
                      criteria.add(ConditionPeer.ISSUE_TYPE_ID, getIssueTypeId());
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
     * Otherwise if this RModuleAttribute has previously
           * been saved, it will retrieve related Conditions from storage.
     * If this RModuleAttribute is new, it will return
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
                         criteria.add(ConditionPeer.MODULE_ID, getModuleId());
                         criteria.add(ConditionPeer.ATTRIBUTE_ID, getAttributeId());
                         criteria.add(ConditionPeer.ISSUE_TYPE_ID, getIssueTypeId());
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
                             criteria.add(ConditionPeer.MODULE_ID, getModuleId());
                       criteria.add(ConditionPeer.ATTRIBUTE_ID, getAttributeId());
                       criteria.add(ConditionPeer.ISSUE_TYPE_ID, getIssueTypeId());
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
     * Otherwise if this RModuleAttribute is new, it will return
                 * an empty collection; or if this RModuleAttribute has previously
     * been saved, it will retrieve related Conditions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in RModuleAttribute.
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
                              criteria.add(ConditionPeer.MODULE_ID, getModuleId());
                              criteria.add(ConditionPeer.ATTRIBUTE_ID, getAttributeId());
                              criteria.add(ConditionPeer.ISSUE_TYPE_ID, getIssueTypeId());
                              collConditions = ConditionPeer.doSelectJoinRModuleAttribute(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ConditionPeer.MODULE_ID, getModuleId());
                        criteria.add(ConditionPeer.ATTRIBUTE_ID, getAttributeId());
                        criteria.add(ConditionPeer.ISSUE_TYPE_ID, getIssueTypeId());
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
     * Otherwise if this RModuleAttribute is new, it will return
                 * an empty collection; or if this RModuleAttribute has previously
     * been saved, it will retrieve related Conditions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in RModuleAttribute.
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
                              criteria.add(ConditionPeer.MODULE_ID, getModuleId());
                              criteria.add(ConditionPeer.ATTRIBUTE_ID, getAttributeId());
                              criteria.add(ConditionPeer.ISSUE_TYPE_ID, getIssueTypeId());
                              collConditions = ConditionPeer.doSelectJoinTransition(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ConditionPeer.MODULE_ID, getModuleId());
                        criteria.add(ConditionPeer.ATTRIBUTE_ID, getAttributeId());
                        criteria.add(ConditionPeer.ISSUE_TYPE_ID, getIssueTypeId());
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
     * Otherwise if this RModuleAttribute is new, it will return
                 * an empty collection; or if this RModuleAttribute has previously
     * been saved, it will retrieve related Conditions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in RModuleAttribute.
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
                              criteria.add(ConditionPeer.MODULE_ID, getModuleId());
                              criteria.add(ConditionPeer.ATTRIBUTE_ID, getAttributeId());
                              criteria.add(ConditionPeer.ISSUE_TYPE_ID, getIssueTypeId());
                              collConditions = ConditionPeer.doSelectJoinAttribute(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ConditionPeer.MODULE_ID, getModuleId());
                        criteria.add(ConditionPeer.ATTRIBUTE_ID, getAttributeId());
                        criteria.add(ConditionPeer.ISSUE_TYPE_ID, getIssueTypeId());
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
     * Otherwise if this RModuleAttribute is new, it will return
                 * an empty collection; or if this RModuleAttribute has previously
     * been saved, it will retrieve related Conditions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in RModuleAttribute.
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
                              criteria.add(ConditionPeer.MODULE_ID, getModuleId());
                              criteria.add(ConditionPeer.ATTRIBUTE_ID, getAttributeId());
                              criteria.add(ConditionPeer.ISSUE_TYPE_ID, getIssueTypeId());
                              collConditions = ConditionPeer.doSelectJoinAttributeOption(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ConditionPeer.MODULE_ID, getModuleId());
                        criteria.add(ConditionPeer.ATTRIBUTE_ID, getAttributeId());
                        criteria.add(ConditionPeer.ISSUE_TYPE_ID, getIssueTypeId());
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
     * Otherwise if this RModuleAttribute is new, it will return
                 * an empty collection; or if this RModuleAttribute has previously
     * been saved, it will retrieve related Conditions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in RModuleAttribute.
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
                              criteria.add(ConditionPeer.MODULE_ID, getModuleId());
                              criteria.add(ConditionPeer.ATTRIBUTE_ID, getAttributeId());
                              criteria.add(ConditionPeer.ISSUE_TYPE_ID, getIssueTypeId());
                              collConditions = ConditionPeer.doSelectJoinRModuleIssueType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ConditionPeer.MODULE_ID, getModuleId());
                        criteria.add(ConditionPeer.ATTRIBUTE_ID, getAttributeId());
                        criteria.add(ConditionPeer.ISSUE_TYPE_ID, getIssueTypeId());
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
              fieldNames.add("ModuleId");
              fieldNames.add("AttributeId");
              fieldNames.add("IssueTypeId");
              fieldNames.add("DisplayValue");
              fieldNames.add("Active");
              fieldNames.add("Required");
              fieldNames.add("Order");
              fieldNames.add("QuickSearch");
              fieldNames.add("DefaultTextFlag");
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
          if (name.equals("ModuleId"))
        {
                return getModuleId();
            }
          if (name.equals("AttributeId"))
        {
                return getAttributeId();
            }
          if (name.equals("IssueTypeId"))
        {
                return getIssueTypeId();
            }
          if (name.equals("DisplayValue"))
        {
                return getDisplayValue();
            }
          if (name.equals("Active"))
        {
                return Boolean.valueOf(getActive());
            }
          if (name.equals("Required"))
        {
                return Boolean.valueOf(getRequired());
            }
          if (name.equals("Order"))
        {
                return new Integer(getOrder());
            }
          if (name.equals("QuickSearch"))
        {
                return Boolean.valueOf(getQuickSearch());
            }
          if (name.equals("DefaultTextFlag"))
        {
                return Boolean.valueOf(getDefaultTextFlag());
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
          if (name.equals(RModuleAttributePeer.MODULE_ID))
        {
                return getModuleId();
            }
          if (name.equals(RModuleAttributePeer.ATTRIBUTE_ID))
        {
                return getAttributeId();
            }
          if (name.equals(RModuleAttributePeer.ISSUE_TYPE_ID))
        {
                return getIssueTypeId();
            }
          if (name.equals(RModuleAttributePeer.DISPLAY_VALUE))
        {
                return getDisplayValue();
            }
          if (name.equals(RModuleAttributePeer.ACTIVE))
        {
                return Boolean.valueOf(getActive());
            }
          if (name.equals(RModuleAttributePeer.REQUIRED))
        {
                return Boolean.valueOf(getRequired());
            }
          if (name.equals(RModuleAttributePeer.PREFERRED_ORDER))
        {
                return new Integer(getOrder());
            }
          if (name.equals(RModuleAttributePeer.QUICK_SEARCH))
        {
                return Boolean.valueOf(getQuickSearch());
            }
          if (name.equals(RModuleAttributePeer.DEFAULT_TEXT_FLAG))
        {
                return Boolean.valueOf(getDefaultTextFlag());
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
                return getModuleId();
            }
              if (pos == 1)
        {
                return getAttributeId();
            }
              if (pos == 2)
        {
                return getIssueTypeId();
            }
              if (pos == 3)
        {
                return getDisplayValue();
            }
              if (pos == 4)
        {
                return Boolean.valueOf(getActive());
            }
              if (pos == 5)
        {
                return Boolean.valueOf(getRequired());
            }
              if (pos == 6)
        {
                return new Integer(getOrder());
            }
              if (pos == 7)
        {
                return Boolean.valueOf(getQuickSearch());
            }
              if (pos == 8)
        {
                return Boolean.valueOf(getDefaultTextFlag());
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
          save(RModuleAttributePeer.getMapBuilder()
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
                    RModuleAttributePeer.doInsert((RModuleAttribute) this, con);
                    setNew(false);
                }
                else
                {
                    RModuleAttributePeer.doUpdate((RModuleAttribute) this, con);
                }

    
                      if (isCacheOnSave())
                {
                    RModuleAttributeManager.putInstance(this);
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
                      setModuleId(new Integer(((NumberKey)keys[0]).intValue()));
                        setAttributeId(new Integer(((NumberKey)keys[1]).intValue()));
                        setIssueTypeId(new Integer(((NumberKey)keys[2]).intValue()));
              }

    /**
     * Set the PrimaryKey using SimpleKeys.
     *
         * @param moduleId Integer
         * @param attributeId Integer
         * @param issueTypeId Integer
         */
    public void setPrimaryKey( Integer moduleId, Integer attributeId, Integer issueTypeId)
        throws TorqueException
    {
            setModuleId(moduleId);
            setAttributeId(attributeId);
            setIssueTypeId(issueTypeId);
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
              pks[0] = SimpleKey.keyFor(getModuleId());
                  pks[1] = SimpleKey.keyFor(getAttributeId());
                  pks[2] = SimpleKey.keyFor(getIssueTypeId());
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
      public RModuleAttribute copy() throws TorqueException
    {
        return copyInto(new RModuleAttribute());
    }
  
    protected RModuleAttribute copyInto(RModuleAttribute copyObj) throws TorqueException
    {
          copyObj.setModuleId(moduleId);
          copyObj.setAttributeId(attributeId);
          copyObj.setIssueTypeId(issueTypeId);
          copyObj.setDisplayValue(displayValue);
          copyObj.setActive(active);
          copyObj.setRequired(required);
          copyObj.setOrder(order);
          copyObj.setQuickSearch(quickSearch);
          copyObj.setDefaultTextFlag(defaultTextFlag);
  
                    copyObj.setModuleId((Integer)null);
                              copyObj.setAttributeId((Integer)null);
                              copyObj.setIssueTypeId((Integer)null);
                                                
                                                                          
                            
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
    public RModuleAttributePeer getPeer()
    {
        return peer;
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("RModuleAttribute:\n");
        str.append("ModuleId = ")
               .append(getModuleId())
             .append("\n");
        str.append("AttributeId = ")
               .append(getAttributeId())
             .append("\n");
        str.append("IssueTypeId = ")
               .append(getIssueTypeId())
             .append("\n");
        str.append("DisplayValue = ")
               .append(getDisplayValue())
             .append("\n");
        str.append("Active = ")
               .append(getActive())
             .append("\n");
        str.append("Required = ")
               .append(getRequired())
             .append("\n");
        str.append("Order = ")
               .append(getOrder())
             .append("\n");
        str.append("QuickSearch = ")
               .append(getQuickSearch())
             .append("\n");
        str.append("DefaultTextFlag = ")
               .append(getDefaultTextFlag())
             .append("\n");
        return(str.toString());
    }
}
