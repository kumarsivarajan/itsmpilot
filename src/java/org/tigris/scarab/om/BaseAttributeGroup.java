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
 * extended all references should be to AttributeGroup
 */
public abstract class BaseAttributeGroup extends BaseObject
    implements org.apache.fulcrum.intake.Retrievable
{
    /** The Peer class */
    private static final AttributeGroupPeer peer =
        new AttributeGroupPeer();

        
    /** The value for the attributeGroupId field */
    private Integer attributeGroupId;
      
    /** The value for the name field */
    private String name;
      
    /** The value for the description field */
    private String description;
      
    /** The value for the moduleId field */
    private Integer moduleId;
      
    /** The value for the issueTypeId field */
    private Integer issueTypeId;
                                                                
    /** The value for the active field */
    private boolean active = false;
                                                                
    /** The value for the dedupe field */
    private boolean dedupe = false;
                                          
    /** The value for the order field */
    private int order = -1;
  
            
    /**
     * Get the AttributeGroupId
     *
     * @return Integer
     */
    public Integer getAttributeGroupId()
    {
        return attributeGroupId;
    }

                                              
    /**
     * Set the value of AttributeGroupId
     *
     * @param v new value
     */
    public void setAttributeGroupId(Integer v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.attributeGroupId, v))
              {
            this.attributeGroupId = v;
            setModified(true);
        }
    
          
                                  
                  // update associated RAttributeAttributeGroup
        if (collRAttributeAttributeGroups != null)
        {
            for (int i = 0; i < collRAttributeAttributeGroups.size(); i++)
            {
                ((RAttributeAttributeGroup) collRAttributeAttributeGroups.get(i))
                        .setGroupId(v);
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
        l.setAttributeGroup((AttributeGroup) this);
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
     * Otherwise if this AttributeGroup has previously
           * been saved, it will retrieve related RAttributeAttributeGroups from storage.
     * If this AttributeGroup is new, it will return
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
                        criteria.add(RAttributeAttributeGroupPeer.GROUP_ID, getAttributeGroupId() );
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
                            criteria.add(RAttributeAttributeGroupPeer.GROUP_ID, getAttributeGroupId());
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
     * Otherwise if this AttributeGroup has previously
           * been saved, it will retrieve related RAttributeAttributeGroups from storage.
     * If this AttributeGroup is new, it will return
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
                         criteria.add(RAttributeAttributeGroupPeer.GROUP_ID, getAttributeGroupId());
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
                             criteria.add(RAttributeAttributeGroupPeer.GROUP_ID, getAttributeGroupId());
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
     * Otherwise if this AttributeGroup is new, it will return
                 * an empty collection; or if this AttributeGroup has previously
     * been saved, it will retrieve related RAttributeAttributeGroups from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeGroup.
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
                              criteria.add(RAttributeAttributeGroupPeer.GROUP_ID, getAttributeGroupId());
                              collRAttributeAttributeGroups = RAttributeAttributeGroupPeer.doSelectJoinAttribute(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RAttributeAttributeGroupPeer.GROUP_ID, getAttributeGroupId());
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
     * Otherwise if this AttributeGroup is new, it will return
                 * an empty collection; or if this AttributeGroup has previously
     * been saved, it will retrieve related RAttributeAttributeGroups from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeGroup.
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
                              criteria.add(RAttributeAttributeGroupPeer.GROUP_ID, getAttributeGroupId());
                              collRAttributeAttributeGroups = RAttributeAttributeGroupPeer.doSelectJoinAttributeGroup(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RAttributeAttributeGroupPeer.GROUP_ID, getAttributeGroupId());
                                    if (!lastRAttributeAttributeGroupsCriteria.equals(criteria))
            {
                collRAttributeAttributeGroups = RAttributeAttributeGroupPeer.doSelectJoinAttributeGroup(criteria);
            }
        }
        lastRAttributeAttributeGroupsCriteria = criteria;

        return collRAttributeAttributeGroups;
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
              fieldNames.add("AttributeGroupId");
              fieldNames.add("Name");
              fieldNames.add("Description");
              fieldNames.add("ModuleId");
              fieldNames.add("IssueTypeId");
              fieldNames.add("Active");
              fieldNames.add("Dedupe");
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
          if (name.equals("AttributeGroupId"))
        {
                return getAttributeGroupId();
            }
          if (name.equals("Name"))
        {
                return getName();
            }
          if (name.equals("Description"))
        {
                return getDescription();
            }
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
          if (name.equals("Dedupe"))
        {
                return Boolean.valueOf(getDedupe());
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
          if (name.equals(AttributeGroupPeer.ATTRIBUTE_GROUP_ID))
        {
                return getAttributeGroupId();
            }
          if (name.equals(AttributeGroupPeer.NAME))
        {
                return getName();
            }
          if (name.equals(AttributeGroupPeer.DESCRIPTION))
        {
                return getDescription();
            }
          if (name.equals(AttributeGroupPeer.MODULE_ID))
        {
                return getModuleId();
            }
          if (name.equals(AttributeGroupPeer.ISSUE_TYPE_ID))
        {
                return getIssueTypeId();
            }
          if (name.equals(AttributeGroupPeer.ACTIVE))
        {
                return Boolean.valueOf(getActive());
            }
          if (name.equals(AttributeGroupPeer.DEDUPE))
        {
                return Boolean.valueOf(getDedupe());
            }
          if (name.equals(AttributeGroupPeer.PREFERRED_ORDER))
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
                return getAttributeGroupId();
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
                return getModuleId();
            }
              if (pos == 4)
        {
                return getIssueTypeId();
            }
              if (pos == 5)
        {
                return Boolean.valueOf(getActive());
            }
              if (pos == 6)
        {
                return Boolean.valueOf(getDedupe());
            }
              if (pos == 7)
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
          save(AttributeGroupPeer.getMapBuilder()
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
                    AttributeGroupPeer.doInsert((AttributeGroup) this, con);
                    setNew(false);
                }
                else
                {
                    AttributeGroupPeer.doUpdate((AttributeGroup) this, con);
                }

    
                      if (isCacheOnSave())
                {
                    AttributeGroupManager.putInstance(this);
                }
              }

                                      
                                    if (collRAttributeAttributeGroups != null)
            {
                for (int i = 0; i < collRAttributeAttributeGroups.size(); i++)
                {
                    ((RAttributeAttributeGroup) collRAttributeAttributeGroups.get(i)).save(con);
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
     * @param key attributeGroupId ObjectKey
     */
    public void setPrimaryKey(ObjectKey key)
        throws TorqueException
    {
            setAttributeGroupId(new Integer(((NumberKey) key).intValue()));
        }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) throws TorqueException
    {
            setAttributeGroupId(new Integer(key));
        }

  
    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
          return SimpleKey.keyFor(getAttributeGroupId());
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
      public AttributeGroup copy() throws TorqueException
    {
        return copyInto(new AttributeGroup());
    }
  
    protected AttributeGroup copyInto(AttributeGroup copyObj) throws TorqueException
    {
          copyObj.setAttributeGroupId(attributeGroupId);
          copyObj.setName(name);
          copyObj.setDescription(description);
          copyObj.setModuleId(moduleId);
          copyObj.setIssueTypeId(issueTypeId);
          copyObj.setActive(active);
          copyObj.setDedupe(dedupe);
          copyObj.setOrder(order);
  
                    copyObj.setAttributeGroupId((Integer)null);
                                                      
                                      
                            
        List v = getRAttributeAttributeGroups();
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
                            return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public AttributeGroupPeer getPeer()
    {
        return peer;
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("AttributeGroup:\n");
        str.append("AttributeGroupId = ")
               .append(getAttributeGroupId())
             .append("\n");
        str.append("Name = ")
               .append(getName())
             .append("\n");
        str.append("Description = ")
               .append(getDescription())
             .append("\n");
        str.append("ModuleId = ")
               .append(getModuleId())
             .append("\n");
        str.append("IssueTypeId = ")
               .append(getIssueTypeId())
             .append("\n");
        str.append("Active = ")
               .append(getActive())
             .append("\n");
        str.append("Dedupe = ")
               .append(getDedupe())
             .append("\n");
        str.append("Order = ")
               .append(getOrder())
             .append("\n");
        return(str.toString());
    }
}
