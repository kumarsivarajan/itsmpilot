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
 * extended all references should be to AttributeValue
 */
public abstract class BaseAttributeValue extends BaseObject
    implements org.apache.fulcrum.intake.Retrievable
{
    /** The Peer class */
    private static final AttributeValuePeer peer =
        new AttributeValuePeer();

        
    /** The value for the valueId field */
    private Long valueId;
      
    /** The value for the issueId field */
    private Long issueId;
      
    /** The value for the attributeId field */
    private Integer attributeId;
      
    /** The value for the numericValue field */
    private Integer numericValue;
      
    /** The value for the optionId field */
    private Integer optionId;
      
    /** The value for the userId field */
    private Integer userId;
      
    /** The value for the value field */
    private String value;
                                                                
    /** The value for the deleted field */
    private boolean deleted = false;
  
            
    /**
     * Get the ValueId
     *
     * @return Long
     */
    public Long getValueId()
    {
        return valueId;
    }

                        
    /**
     * Set the value of ValueId
     *
     * @param v new value
     */
    public void setValueId(Long v) 
    {
    
                  if (!ObjectUtils.equals(this.valueId, v))
              {
            this.valueId = v;
            setModified(true);
        }
    
          
              }
          
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
    
                                  
                if (aIssue != null && !ObjectUtils.equals(aIssue.getIssueId(), v))
                {
            aIssue = null;
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
     * Get the NumericValue
     *
     * @return Integer
     */
    public Integer getNumericValue()
    {
        return numericValue;
    }

                        
    /**
     * Set the value of NumericValue
     *
     * @param v new value
     */
    public void setNumericValue(Integer v) 
    {
    
                  if (!ObjectUtils.equals(this.numericValue, v))
              {
            this.numericValue = v;
            setModified(true);
        }
    
          
              }
          
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
    
                                  
                if (aAttributeOption != null && !ObjectUtils.equals(aAttributeOption.getOptionId(), v))
                {
            aAttributeOption = null;
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
     * Get the Value
     *
     * @return String
     */
    public String getValue()
    {
        return value;
    }

                        
    /**
     * Set the value of Value
     *
     * @param v new value
     */
    public void setValue(String v) 
    {
    
                  if (!ObjectUtils.equals(this.value, v))
              {
            this.value = v;
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
  
      
        
                  
    
        private Issue aIssue;

    /**
     * Declares an association between this object and a Issue object
     *
     * @param v Issue
     * @throws TorqueException
     */
    public void setIssue(Issue v) throws TorqueException
    {
            if (v == null)
        {
                  setIssueId((Long) null);
              }
        else
        {
            setIssueId(v.getIssueId());
        }
            aIssue = v;
    }

                        
    /**
     * Returns the associated Issue object.
           * If it was not retrieved before, the object is retrieved from
     * the database
           *
     * @return the associated Issue object
           * @throws TorqueException
           */
    public Issue getIssue()
              throws TorqueException
          {
              if (aIssue == null && (!ObjectUtils.equals(this.issueId, null)))
        {
                    aIssue = IssueManager.getInstance(SimpleKey.keyFor(this.issueId));
                }
              return aIssue;
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
    public Issue getIssue(Connection connection)
        throws TorqueException
    {
        if (aIssue == null && (!ObjectUtils.equals(this.issueId, null)))
        {
                    aIssue = IssueManager.getCachedInstance(SimpleKey.keyFor(this.issueId));
            if (aIssue == null)
            {
                          aIssue = IssuePeer.retrieveByPK(SimpleKey.keyFor(this.issueId), connection);
                          IssueManager.putInstance(aIssue);
            }
                }
        return aIssue;
    }
    
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setIssueKey(ObjectKey key) throws TorqueException
    {
    
                    setIssueId(new Long(((NumberKey) key).longValue()));
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
                  setOptionId((Integer) null);
              }
        else
        {
            setOptionId(v.getOptionId());
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
              if (aAttributeOption == null && (!ObjectUtils.equals(this.optionId, null)))
        {
                    aAttributeOption = AttributeOptionManager.getInstance(SimpleKey.keyFor(this.optionId));
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
        if (aAttributeOption == null && (!ObjectUtils.equals(this.optionId, null)))
        {
                    aAttributeOption = AttributeOptionManager.getCachedInstance(SimpleKey.keyFor(this.optionId));
            if (aAttributeOption == null)
            {
                          aAttributeOption = AttributeOptionPeer.retrieveByPK(SimpleKey.keyFor(this.optionId), connection);
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
    
                    setOptionId(new Integer(((NumberKey) key).intValue()));
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
              fieldNames.add("ValueId");
              fieldNames.add("IssueId");
              fieldNames.add("AttributeId");
              fieldNames.add("NumericValue");
              fieldNames.add("OptionId");
              fieldNames.add("UserId");
              fieldNames.add("Value");
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
          if (name.equals("ValueId"))
        {
                return getValueId();
            }
          if (name.equals("IssueId"))
        {
                return getIssueId();
            }
          if (name.equals("AttributeId"))
        {
                return getAttributeId();
            }
          if (name.equals("NumericValue"))
        {
                return getNumericValue();
            }
          if (name.equals("OptionId"))
        {
                return getOptionId();
            }
          if (name.equals("UserId"))
        {
                return getUserId();
            }
          if (name.equals("Value"))
        {
                return getValue();
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
          if (name.equals(AttributeValuePeer.VALUE_ID))
        {
                return getValueId();
            }
          if (name.equals(AttributeValuePeer.ISSUE_ID))
        {
                return getIssueId();
            }
          if (name.equals(AttributeValuePeer.ATTRIBUTE_ID))
        {
                return getAttributeId();
            }
          if (name.equals(AttributeValuePeer.NUMERIC_VALUE))
        {
                return getNumericValue();
            }
          if (name.equals(AttributeValuePeer.OPTION_ID))
        {
                return getOptionId();
            }
          if (name.equals(AttributeValuePeer.USER_ID))
        {
                return getUserId();
            }
          if (name.equals(AttributeValuePeer.VALUE))
        {
                return getValue();
            }
          if (name.equals(AttributeValuePeer.DELETED))
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
                return getValueId();
            }
              if (pos == 1)
        {
                return getIssueId();
            }
              if (pos == 2)
        {
                return getAttributeId();
            }
              if (pos == 3)
        {
                return getNumericValue();
            }
              if (pos == 4)
        {
                return getOptionId();
            }
              if (pos == 5)
        {
                return getUserId();
            }
              if (pos == 6)
        {
                return getValue();
            }
              if (pos == 7)
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
          save(AttributeValuePeer.getMapBuilder()
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
                    AttributeValuePeer.doInsert((AttributeValue) this, con);
                    setNew(false);
                }
                else
                {
                    AttributeValuePeer.doUpdate((AttributeValue) this, con);
                }

    
                      if (isCacheOnSave())
                {
                    AttributeValueManager.putInstance(this);
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
     * @param key valueId ObjectKey
     */
    public void setPrimaryKey(ObjectKey key)
        
    {
            setValueId(new Long(((NumberKey) key).longValue()));
        }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) 
    {
            setValueId(new Long(key));
        }

  
    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
          return SimpleKey.keyFor(getValueId());
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
      public abstract AttributeValue copy() throws TorqueException;
  
    protected AttributeValue copyInto(AttributeValue copyObj) throws TorqueException
    {
          copyObj.setValueId(valueId);
          copyObj.setIssueId(issueId);
          copyObj.setAttributeId(attributeId);
          copyObj.setNumericValue(numericValue);
          copyObj.setOptionId(optionId);
          copyObj.setUserId(userId);
          copyObj.setValue(value);
          copyObj.setDeleted(deleted);
  
                    copyObj.setValueId((Long)null);
                                                      
                return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public AttributeValuePeer getPeer()
    {
        return peer;
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("AttributeValue:\n");
        str.append("ValueId = ")
               .append(getValueId())
             .append("\n");
        str.append("IssueId = ")
               .append(getIssueId())
             .append("\n");
        str.append("AttributeId = ")
               .append(getAttributeId())
             .append("\n");
        str.append("NumericValue = ")
               .append(getNumericValue())
             .append("\n");
        str.append("OptionId = ")
               .append(getOptionId())
             .append("\n");
        str.append("UserId = ")
               .append(getUserId())
             .append("\n");
        str.append("Value = ")
               .append(getValue())
             .append("\n");
        str.append("Deleted = ")
               .append(getDeleted())
             .append("\n");
        return(str.toString());
    }
}
