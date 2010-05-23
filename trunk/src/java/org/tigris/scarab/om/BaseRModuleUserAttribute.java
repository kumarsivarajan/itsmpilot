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
 * extended all references should be to RModuleUserAttribute
 */
public abstract class BaseRModuleUserAttribute extends BaseObject
    implements org.apache.fulcrum.intake.Retrievable
{
    /** The Peer class */
    private static final RModuleUserAttributePeer peer =
        new RModuleUserAttributePeer();

        
    /** The value for the rmuaId field */
    private Long rmuaId;
      
    /** The value for the listId field */
    private Long listId;
      
    /** The value for the moduleId field */
    private Integer moduleId;
      
    /** The value for the userId field */
    private Integer userId;
      
    /** The value for the issueTypeId field */
    private Integer issueTypeId;
      
    /** The value for the attributeId field */
    private Integer attributeId;
      
    /** The value for the internalAttribute field */
    private String internalAttribute;
                                          
    /** The value for the order field */
    private int order = 0;
  
            
    /**
     * Get the RmuaId
     *
     * @return Long
     */
    public Long getRmuaId()
    {
        return rmuaId;
    }

                        
    /**
     * Set the value of RmuaId
     *
     * @param v new value
     */
    public void setRmuaId(Long v) 
    {
    
                  if (!ObjectUtils.equals(this.rmuaId, v))
              {
            this.rmuaId = v;
            setModified(true);
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
     * Get the InternalAttribute
     *
     * @return String
     */
    public String getInternalAttribute()
    {
        return internalAttribute;
    }

                        
    /**
     * Set the value of InternalAttribute
     *
     * @param v new value
     */
    public void setInternalAttribute(String v) 
    {
    
                  if (!ObjectUtils.equals(this.internalAttribute, v))
              {
            this.internalAttribute = v;
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
              fieldNames.add("RmuaId");
              fieldNames.add("ListId");
              fieldNames.add("ModuleId");
              fieldNames.add("UserId");
              fieldNames.add("IssueTypeId");
              fieldNames.add("AttributeId");
              fieldNames.add("InternalAttribute");
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
          if (name.equals("RmuaId"))
        {
                return getRmuaId();
            }
          if (name.equals("ListId"))
        {
                return getListId();
            }
          if (name.equals("ModuleId"))
        {
                return getModuleId();
            }
          if (name.equals("UserId"))
        {
                return getUserId();
            }
          if (name.equals("IssueTypeId"))
        {
                return getIssueTypeId();
            }
          if (name.equals("AttributeId"))
        {
                return getAttributeId();
            }
          if (name.equals("InternalAttribute"))
        {
                return getInternalAttribute();
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
          if (name.equals(RModuleUserAttributePeer.RMUA_ID))
        {
                return getRmuaId();
            }
          if (name.equals(RModuleUserAttributePeer.LIST_ID))
        {
                return getListId();
            }
          if (name.equals(RModuleUserAttributePeer.MODULE_ID))
        {
                return getModuleId();
            }
          if (name.equals(RModuleUserAttributePeer.USER_ID))
        {
                return getUserId();
            }
          if (name.equals(RModuleUserAttributePeer.ISSUE_TYPE_ID))
        {
                return getIssueTypeId();
            }
          if (name.equals(RModuleUserAttributePeer.ATTRIBUTE_ID))
        {
                return getAttributeId();
            }
          if (name.equals(RModuleUserAttributePeer.INTERNAL_ATTRIBUTE))
        {
                return getInternalAttribute();
            }
          if (name.equals(RModuleUserAttributePeer.PREFERRED_ORDER))
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
                return getRmuaId();
            }
              if (pos == 1)
        {
                return getListId();
            }
              if (pos == 2)
        {
                return getModuleId();
            }
              if (pos == 3)
        {
                return getUserId();
            }
              if (pos == 4)
        {
                return getIssueTypeId();
            }
              if (pos == 5)
        {
                return getAttributeId();
            }
              if (pos == 6)
        {
                return getInternalAttribute();
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
          save(RModuleUserAttributePeer.getMapBuilder()
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
                    RModuleUserAttributePeer.doInsert((RModuleUserAttribute) this, con);
                    setNew(false);
                }
                else
                {
                    RModuleUserAttributePeer.doUpdate((RModuleUserAttribute) this, con);
                }

    
                      if (isCacheOnSave())
                {
                    RModuleUserAttributeManager.putInstance(this);
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
     * @param key rmuaId ObjectKey
     */
    public void setPrimaryKey(ObjectKey key)
        
    {
            setRmuaId(new Long(((NumberKey) key).longValue()));
        }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) 
    {
            setRmuaId(new Long(key));
        }

  
    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
          return SimpleKey.keyFor(getRmuaId());
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
      public RModuleUserAttribute copy() throws TorqueException
    {
        return copyInto(new RModuleUserAttribute());
    }
  
    protected RModuleUserAttribute copyInto(RModuleUserAttribute copyObj) throws TorqueException
    {
          copyObj.setRmuaId(rmuaId);
          copyObj.setListId(listId);
          copyObj.setModuleId(moduleId);
          copyObj.setUserId(userId);
          copyObj.setIssueTypeId(issueTypeId);
          copyObj.setAttributeId(attributeId);
          copyObj.setInternalAttribute(internalAttribute);
          copyObj.setOrder(order);
  
                    copyObj.setRmuaId((Long)null);
                                                      
                return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public RModuleUserAttributePeer getPeer()
    {
        return peer;
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("RModuleUserAttribute:\n");
        str.append("RmuaId = ")
               .append(getRmuaId())
             .append("\n");
        str.append("ListId = ")
               .append(getListId())
             .append("\n");
        str.append("ModuleId = ")
               .append(getModuleId())
             .append("\n");
        str.append("UserId = ")
               .append(getUserId())
             .append("\n");
        str.append("IssueTypeId = ")
               .append(getIssueTypeId())
             .append("\n");
        str.append("AttributeId = ")
               .append(getAttributeId())
             .append("\n");
        str.append("InternalAttribute = ")
               .append(getInternalAttribute())
             .append("\n");
        str.append("Order = ")
               .append(getOrder())
             .append("\n");
        return(str.toString());
    }
}
