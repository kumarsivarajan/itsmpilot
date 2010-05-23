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
 * extended all references should be to RModuleOption
 */
public abstract class BaseRModuleOption extends BaseObject
    implements org.apache.fulcrum.intake.Retrievable
{
    /** The Peer class */
    private static final RModuleOptionPeer peer =
        new RModuleOptionPeer();

        
    /** The value for the moduleId field */
    private Integer moduleId;
      
    /** The value for the issueTypeId field */
    private Integer issueTypeId;
      
    /** The value for the optionId field */
    private Integer optionId;
      
    /** The value for the displayValue field */
    private String displayValue;
                                                                
    /** The value for the active field */
    private boolean active = true;
                                          
    /** The value for the order field */
    private int order = -1;
                                          
    /** The value for the weight field */
    private int weight = -1;
  
            
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
     * Get the Weight
     *
     * @return int
     */
    public int getWeight()
    {
        return weight;
    }

                        
    /**
     * Set the value of Weight
     *
     * @param v new value
     */
    public void setWeight(int v) 
    {
    
                  if (this.weight != v)
              {
            this.weight = v;
            setModified(true);
        }
    
          
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
              fieldNames.add("OptionId");
              fieldNames.add("DisplayValue");
              fieldNames.add("Active");
              fieldNames.add("Order");
              fieldNames.add("Weight");
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
          if (name.equals("OptionId"))
        {
                return getOptionId();
            }
          if (name.equals("DisplayValue"))
        {
                return getDisplayValue();
            }
          if (name.equals("Active"))
        {
                return Boolean.valueOf(getActive());
            }
          if (name.equals("Order"))
        {
                return new Integer(getOrder());
            }
          if (name.equals("Weight"))
        {
                return new Integer(getWeight());
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
          if (name.equals(RModuleOptionPeer.MODULE_ID))
        {
                return getModuleId();
            }
          if (name.equals(RModuleOptionPeer.ISSUE_TYPE_ID))
        {
                return getIssueTypeId();
            }
          if (name.equals(RModuleOptionPeer.OPTION_ID))
        {
                return getOptionId();
            }
          if (name.equals(RModuleOptionPeer.DISPLAY_VALUE))
        {
                return getDisplayValue();
            }
          if (name.equals(RModuleOptionPeer.ACTIVE))
        {
                return Boolean.valueOf(getActive());
            }
          if (name.equals(RModuleOptionPeer.PREFERRED_ORDER))
        {
                return new Integer(getOrder());
            }
          if (name.equals(RModuleOptionPeer.WEIGHT))
        {
                return new Integer(getWeight());
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
                return getOptionId();
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
                return new Integer(getOrder());
            }
              if (pos == 6)
        {
                return new Integer(getWeight());
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
          save(RModuleOptionPeer.getMapBuilder()
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
                    RModuleOptionPeer.doInsert((RModuleOption) this, con);
                    setNew(false);
                }
                else
                {
                    RModuleOptionPeer.doUpdate((RModuleOption) this, con);
                }

    
                      if (isCacheOnSave())
                {
                    RModuleOptionManager.putInstance(this);
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
                        setIssueTypeId(new Integer(((NumberKey)keys[1]).intValue()));
                        setOptionId(new Integer(((NumberKey)keys[2]).intValue()));
              }

    /**
     * Set the PrimaryKey using SimpleKeys.
     *
         * @param moduleId Integer
         * @param issueTypeId Integer
         * @param optionId Integer
         */
    public void setPrimaryKey( Integer moduleId, Integer issueTypeId, Integer optionId)
        throws TorqueException
    {
            setModuleId(moduleId);
            setIssueTypeId(issueTypeId);
            setOptionId(optionId);
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
                  pks[2] = SimpleKey.keyFor(getOptionId());
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
      public RModuleOption copy() throws TorqueException
    {
        return copyInto(new RModuleOption());
    }
  
    protected RModuleOption copyInto(RModuleOption copyObj) throws TorqueException
    {
          copyObj.setModuleId(moduleId);
          copyObj.setIssueTypeId(issueTypeId);
          copyObj.setOptionId(optionId);
          copyObj.setDisplayValue(displayValue);
          copyObj.setActive(active);
          copyObj.setOrder(order);
          copyObj.setWeight(weight);
  
                    copyObj.setModuleId((Integer)null);
                              copyObj.setIssueTypeId((Integer)null);
                              copyObj.setOptionId((Integer)null);
                                    
                return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public RModuleOptionPeer getPeer()
    {
        return peer;
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("RModuleOption:\n");
        str.append("ModuleId = ")
               .append(getModuleId())
             .append("\n");
        str.append("IssueTypeId = ")
               .append(getIssueTypeId())
             .append("\n");
        str.append("OptionId = ")
               .append(getOptionId())
             .append("\n");
        str.append("DisplayValue = ")
               .append(getDisplayValue())
             .append("\n");
        str.append("Active = ")
               .append(getActive())
             .append("\n");
        str.append("Order = ")
               .append(getOrder())
             .append("\n");
        str.append("Weight = ")
               .append(getWeight())
             .append("\n");
        return(str.toString());
    }
}
