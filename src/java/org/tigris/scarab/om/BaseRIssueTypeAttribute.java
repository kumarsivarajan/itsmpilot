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
 * extended all references should be to RIssueTypeAttribute
 */
public abstract class BaseRIssueTypeAttribute extends BaseObject
    implements org.apache.fulcrum.intake.Retrievable
{
    /** The Peer class */
    private static final RIssueTypeAttributePeer peer =
        new RIssueTypeAttributePeer();

        
    /** The value for the attributeId field */
    private Integer attributeId;
      
    /** The value for the issueTypeId field */
    private Integer issueTypeId;
                                                                
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
                                                                
    /** The value for the locked field */
    private boolean locked = false;
  
            
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
          
    /**
     * Get the Locked
     *
     * @return boolean
     */
    public boolean getLocked()
    {
        return locked;
    }

                        
    /**
     * Set the value of Locked
     *
     * @param v new value
     */
    public void setLocked(boolean v) 
    {
    
                  if (this.locked != v)
              {
            this.locked = v;
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
              fieldNames.add("IssueTypeId");
              fieldNames.add("Active");
              fieldNames.add("Required");
              fieldNames.add("Order");
              fieldNames.add("QuickSearch");
              fieldNames.add("DefaultTextFlag");
              fieldNames.add("Locked");
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
          if (name.equals("IssueTypeId"))
        {
                return getIssueTypeId();
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
          if (name.equals("Locked"))
        {
                return Boolean.valueOf(getLocked());
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
          if (name.equals(RIssueTypeAttributePeer.ATTRIBUTE_ID))
        {
                return getAttributeId();
            }
          if (name.equals(RIssueTypeAttributePeer.ISSUE_TYPE_ID))
        {
                return getIssueTypeId();
            }
          if (name.equals(RIssueTypeAttributePeer.ACTIVE))
        {
                return Boolean.valueOf(getActive());
            }
          if (name.equals(RIssueTypeAttributePeer.REQUIRED))
        {
                return Boolean.valueOf(getRequired());
            }
          if (name.equals(RIssueTypeAttributePeer.PREFERRED_ORDER))
        {
                return new Integer(getOrder());
            }
          if (name.equals(RIssueTypeAttributePeer.QUICK_SEARCH))
        {
                return Boolean.valueOf(getQuickSearch());
            }
          if (name.equals(RIssueTypeAttributePeer.DEFAULT_TEXT_FLAG))
        {
                return Boolean.valueOf(getDefaultTextFlag());
            }
          if (name.equals(RIssueTypeAttributePeer.LOCKED))
        {
                return Boolean.valueOf(getLocked());
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
                return getIssueTypeId();
            }
              if (pos == 2)
        {
                return Boolean.valueOf(getActive());
            }
              if (pos == 3)
        {
                return Boolean.valueOf(getRequired());
            }
              if (pos == 4)
        {
                return new Integer(getOrder());
            }
              if (pos == 5)
        {
                return Boolean.valueOf(getQuickSearch());
            }
              if (pos == 6)
        {
                return Boolean.valueOf(getDefaultTextFlag());
            }
              if (pos == 7)
        {
                return Boolean.valueOf(getLocked());
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
          save(RIssueTypeAttributePeer.getMapBuilder()
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
                    RIssueTypeAttributePeer.doInsert((RIssueTypeAttribute) this, con);
                    setNew(false);
                }
                else
                {
                    RIssueTypeAttributePeer.doUpdate((RIssueTypeAttribute) this, con);
                }

    
                      if (isCacheOnSave())
                {
                    RIssueTypeAttributeManager.putInstance(this);
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
                      setAttributeId(new Integer(((NumberKey)keys[0]).intValue()));
                        setIssueTypeId(new Integer(((NumberKey)keys[1]).intValue()));
              }

    /**
     * Set the PrimaryKey using SimpleKeys.
     *
         * @param attributeId Integer
         * @param issueTypeId Integer
         */
    public void setPrimaryKey( Integer attributeId, Integer issueTypeId)
        throws TorqueException
    {
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
              pks[0] = SimpleKey.keyFor(getAttributeId());
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
      public RIssueTypeAttribute copy() throws TorqueException
    {
        return copyInto(new RIssueTypeAttribute());
    }
  
    protected RIssueTypeAttribute copyInto(RIssueTypeAttribute copyObj) throws TorqueException
    {
          copyObj.setAttributeId(attributeId);
          copyObj.setIssueTypeId(issueTypeId);
          copyObj.setActive(active);
          copyObj.setRequired(required);
          copyObj.setOrder(order);
          copyObj.setQuickSearch(quickSearch);
          copyObj.setDefaultTextFlag(defaultTextFlag);
          copyObj.setLocked(locked);
  
                    copyObj.setAttributeId((Integer)null);
                              copyObj.setIssueTypeId((Integer)null);
                                                
                return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public RIssueTypeAttributePeer getPeer()
    {
        return peer;
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("RIssueTypeAttribute:\n");
        str.append("AttributeId = ")
               .append(getAttributeId())
             .append("\n");
        str.append("IssueTypeId = ")
               .append(getIssueTypeId())
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
        str.append("Locked = ")
               .append(getLocked())
             .append("\n");
        return(str.toString());
    }
}
