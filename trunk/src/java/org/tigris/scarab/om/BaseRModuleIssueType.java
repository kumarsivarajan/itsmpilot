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
 * extended all references should be to RModuleIssueType
 */
public abstract class BaseRModuleIssueType extends BaseObject
    implements org.apache.fulcrum.intake.Retrievable
{
    /** The Peer class */
    private static final RModuleIssueTypePeer peer =
        new RModuleIssueTypePeer();

        
    /** The value for the moduleId field */
    private Integer moduleId;
      
    /** The value for the issueTypeId field */
    private Integer issueTypeId;
                                                                
    /** The value for the active field */
    private boolean active = true;
                                                                
    /** The value for the display field */
    private boolean display = true;
                                          
    /** The value for the order field */
    private int order = 0;
                                                                
    /** The value for the dedupe field */
    private boolean dedupe = true;
                                          
    /** The value for the history field */
    private int history = 5;
                                          
    /** The value for the comments field */
    private int comments = 5;
      
    /** The value for the displayName field */
    private String displayName;
      
    /** The value for the displayDescription field */
    private String displayDescription;
  
            
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
     * Get the Display
     *
     * @return boolean
     */
    public boolean getDisplay()
    {
        return display;
    }

                        
    /**
     * Set the value of Display
     *
     * @param v new value
     */
    public void setDisplay(boolean v) 
    {
    
                  if (this.display != v)
              {
            this.display = v;
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
     * Get the Dedupe
     *
     * @return boolean
     */
    public boolean getDedupe()
    {
        return dedupe;
    }

                        
    /**
     * Set the value of Dedupe
     *
     * @param v new value
     */
    public void setDedupe(boolean v) 
    {
    
                  if (this.dedupe != v)
              {
            this.dedupe = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the History
     *
     * @return int
     */
    public int getHistory()
    {
        return history;
    }

                        
    /**
     * Set the value of History
     *
     * @param v new value
     */
    public void setHistory(int v) 
    {
    
                  if (this.history != v)
              {
            this.history = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the Comments
     *
     * @return int
     */
    public int getComments()
    {
        return comments;
    }

                        
    /**
     * Set the value of Comments
     *
     * @param v new value
     */
    public void setComments(int v) 
    {
    
                  if (this.comments != v)
              {
            this.comments = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the DisplayName
     *
     * @return String
     */
    public String getDisplayName()
    {
        return displayName;
    }

                        
    /**
     * Set the value of DisplayName
     *
     * @param v new value
     */
    public void setDisplayName(String v) 
    {
    
                  if (!ObjectUtils.equals(this.displayName, v))
              {
            this.displayName = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the DisplayDescription
     *
     * @return String
     */
    public String getDisplayDescription()
    {
        return displayDescription;
    }

                        
    /**
     * Set the value of DisplayDescription
     *
     * @param v new value
     */
    public void setDisplayDescription(String v) 
    {
    
                  if (!ObjectUtils.equals(this.displayDescription, v))
              {
            this.displayDescription = v;
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
        l.setRModuleIssueType((RModuleIssueType) this);
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
     * Otherwise if this RModuleIssueType has previously
           * been saved, it will retrieve related Conditions from storage.
     * If this RModuleIssueType is new, it will return
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
     * Otherwise if this RModuleIssueType has previously
           * been saved, it will retrieve related Conditions from storage.
     * If this RModuleIssueType is new, it will return
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
     * Otherwise if this RModuleIssueType is new, it will return
                 * an empty collection; or if this RModuleIssueType has previously
     * been saved, it will retrieve related Conditions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in RModuleIssueType.
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
     * Otherwise if this RModuleIssueType is new, it will return
                 * an empty collection; or if this RModuleIssueType has previously
     * been saved, it will retrieve related Conditions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in RModuleIssueType.
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
     * Otherwise if this RModuleIssueType is new, it will return
                 * an empty collection; or if this RModuleIssueType has previously
     * been saved, it will retrieve related Conditions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in RModuleIssueType.
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
     * Otherwise if this RModuleIssueType is new, it will return
                 * an empty collection; or if this RModuleIssueType has previously
     * been saved, it will retrieve related Conditions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in RModuleIssueType.
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
     * Otherwise if this RModuleIssueType is new, it will return
                 * an empty collection; or if this RModuleIssueType has previously
     * been saved, it will retrieve related Conditions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in RModuleIssueType.
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
              fieldNames.add("IssueTypeId");
              fieldNames.add("Active");
              fieldNames.add("Display");
              fieldNames.add("Order");
              fieldNames.add("Dedupe");
              fieldNames.add("History");
              fieldNames.add("Comments");
              fieldNames.add("DisplayName");
              fieldNames.add("DisplayDescription");
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
          if (name.equals("IssueTypeId"))
        {
                return getIssueTypeId();
            }
          if (name.equals("Active"))
        {
                return Boolean.valueOf(getActive());
            }
          if (name.equals("Display"))
        {
                return Boolean.valueOf(getDisplay());
            }
          if (name.equals("Order"))
        {
                return new Integer(getOrder());
            }
          if (name.equals("Dedupe"))
        {
                return Boolean.valueOf(getDedupe());
            }
          if (name.equals("History"))
        {
                return new Integer(getHistory());
            }
          if (name.equals("Comments"))
        {
                return new Integer(getComments());
            }
          if (name.equals("DisplayName"))
        {
                return getDisplayName();
            }
          if (name.equals("DisplayDescription"))
        {
                return getDisplayDescription();
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
          if (name.equals(RModuleIssueTypePeer.MODULE_ID))
        {
                return getModuleId();
            }
          if (name.equals(RModuleIssueTypePeer.ISSUE_TYPE_ID))
        {
                return getIssueTypeId();
            }
          if (name.equals(RModuleIssueTypePeer.ACTIVE))
        {
                return Boolean.valueOf(getActive());
            }
          if (name.equals(RModuleIssueTypePeer.DISPLAY))
        {
                return Boolean.valueOf(getDisplay());
            }
          if (name.equals(RModuleIssueTypePeer.PREFERRED_ORDER))
        {
                return new Integer(getOrder());
            }
          if (name.equals(RModuleIssueTypePeer.DEDUPE))
        {
                return Boolean.valueOf(getDedupe());
            }
          if (name.equals(RModuleIssueTypePeer.HISTORY))
        {
                return new Integer(getHistory());
            }
          if (name.equals(RModuleIssueTypePeer.COMMENTS))
        {
                return new Integer(getComments());
            }
          if (name.equals(RModuleIssueTypePeer.DISPLAY_NAME))
        {
                return getDisplayName();
            }
          if (name.equals(RModuleIssueTypePeer.DISPLAY_DESCRIPTION))
        {
                return getDisplayDescription();
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
                return getIssueTypeId();
            }
              if (pos == 2)
        {
                return Boolean.valueOf(getActive());
            }
              if (pos == 3)
        {
                return Boolean.valueOf(getDisplay());
            }
              if (pos == 4)
        {
                return new Integer(getOrder());
            }
              if (pos == 5)
        {
                return Boolean.valueOf(getDedupe());
            }
              if (pos == 6)
        {
                return new Integer(getHistory());
            }
              if (pos == 7)
        {
                return new Integer(getComments());
            }
              if (pos == 8)
        {
                return getDisplayName();
            }
              if (pos == 9)
        {
                return getDisplayDescription();
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
          save(RModuleIssueTypePeer.getMapBuilder()
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
                    RModuleIssueTypePeer.doInsert((RModuleIssueType) this, con);
                    setNew(false);
                }
                else
                {
                    RModuleIssueTypePeer.doUpdate((RModuleIssueType) this, con);
                }

    
                      if (isCacheOnSave())
                {
                    RModuleIssueTypeManager.putInstance(this);
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
                      setModuleId(new Integer(((NumberKey)keys[0]).intValue()));
                        setIssueTypeId(new Integer(((NumberKey)keys[1]).intValue()));
              }

    /**
     * Set the PrimaryKey using SimpleKeys.
     *
         * @param moduleId Integer
         * @param issueTypeId Integer
         */
    public void setPrimaryKey( Integer moduleId, Integer issueTypeId)
        throws TorqueException
    {
            setModuleId(moduleId);
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
                  pks[1] = SimpleKey.keyFor(getIssueTypeId());
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
      public RModuleIssueType copy() throws TorqueException
    {
        return copyInto(new RModuleIssueType());
    }
  
    protected RModuleIssueType copyInto(RModuleIssueType copyObj) throws TorqueException
    {
          copyObj.setModuleId(moduleId);
          copyObj.setIssueTypeId(issueTypeId);
          copyObj.setActive(active);
          copyObj.setDisplay(display);
          copyObj.setOrder(order);
          copyObj.setDedupe(dedupe);
          copyObj.setHistory(history);
          copyObj.setComments(comments);
          copyObj.setDisplayName(displayName);
          copyObj.setDisplayDescription(displayDescription);
  
                    copyObj.setModuleId((Integer)null);
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
    public RModuleIssueTypePeer getPeer()
    {
        return peer;
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("RModuleIssueType:\n");
        str.append("ModuleId = ")
               .append(getModuleId())
             .append("\n");
        str.append("IssueTypeId = ")
               .append(getIssueTypeId())
             .append("\n");
        str.append("Active = ")
               .append(getActive())
             .append("\n");
        str.append("Display = ")
               .append(getDisplay())
             .append("\n");
        str.append("Order = ")
               .append(getOrder())
             .append("\n");
        str.append("Dedupe = ")
               .append(getDedupe())
             .append("\n");
        str.append("History = ")
               .append(getHistory())
             .append("\n");
        str.append("Comments = ")
               .append(getComments())
             .append("\n");
        str.append("DisplayName = ")
               .append(getDisplayName())
             .append("\n");
        str.append("DisplayDescription = ")
               .append(getDisplayDescription())
             .append("\n");
        return(str.toString());
    }
}
