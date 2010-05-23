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
 * extended all references should be to Condition
 */
public abstract class BaseCondition extends BaseObject
    implements org.apache.fulcrum.intake.Retrievable
{
    /** The Peer class */
    private static final ConditionPeer peer =
        new ConditionPeer();

        
    /** The value for the conditionId field */
    private Long conditionId;
      
    /** The value for the transitionId field */
    private Integer transitionId;
      
    /** The value for the moduleId field */
    private Integer moduleId;
      
    /** The value for the issueTypeId field */
    private Integer issueTypeId;
      
    /** The value for the attributeId field */
    private Integer attributeId;
      
    /** The value for the optionId field */
    private Integer optionId;
  
            
    /**
     * Get the ConditionId
     *
     * @return Long
     */
    public Long getConditionId()
    {
        return conditionId;
    }

                        
    /**
     * Set the value of ConditionId
     *
     * @param v new value
     */
    public void setConditionId(Long v) 
    {
    
                  if (!ObjectUtils.equals(this.conditionId, v))
              {
            this.conditionId = v;
            setModified(true);
        }
    
          
              }
          
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
    
                                  
                if (aTransition != null && !ObjectUtils.equals(aTransition.getTransitionId(), v))
                {
            aTransition = null;
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
    
                                  
                if (aRModuleAttribute != null && !ObjectUtils.equals(aRModuleAttribute.getModuleId(), v))
                {
            aRModuleAttribute = null;
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
    
                                  
                if (aRModuleAttribute != null && !ObjectUtils.equals(aRModuleAttribute.getIssueTypeId(), v))
                {
            aRModuleAttribute = null;
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
    
                                  
                if (aRModuleAttribute != null && !ObjectUtils.equals(aRModuleAttribute.getAttributeId(), v))
                {
            aRModuleAttribute = null;
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
  
      
        
                                      
    
        private RModuleAttribute aRModuleAttribute;

    /**
     * Declares an association between this object and a RModuleAttribute object
     *
     * @param v RModuleAttribute
     * @throws TorqueException
     */
    public void setRModuleAttribute(RModuleAttribute v) throws TorqueException
    {
            if (v == null)
        {
                  setModuleId((Integer) null);
              }
        else
        {
            setModuleId(v.getModuleId());
        }
            if (v == null)
        {
                  setAttributeId((Integer) null);
              }
        else
        {
            setAttributeId(v.getAttributeId());
        }
            if (v == null)
        {
                  setIssueTypeId((Integer) null);
              }
        else
        {
            setIssueTypeId(v.getIssueTypeId());
        }
            aRModuleAttribute = v;
    }

                                                        
    /**
     * Returns the associated RModuleAttribute object.
           * If it was not retrieved before, the object is retrieved from
     * the database
           *
     * @return the associated RModuleAttribute object
           * @throws TorqueException
           */
    public RModuleAttribute getRModuleAttribute()
              throws TorqueException
          {
              if (aRModuleAttribute == null && (!ObjectUtils.equals(this.moduleId, null) && !ObjectUtils.equals(this.attributeId, null) && !ObjectUtils.equals(this.issueTypeId, null)))
        {
                    SimpleKey[] keys = { SimpleKey.keyFor(this.moduleId), SimpleKey.keyFor(this.attributeId), SimpleKey.keyFor(this.issueTypeId) };
            aRModuleAttribute = RModuleAttributeManager.getInstance(new ComboKey(keys));
                }
              return aRModuleAttribute;
    }

    /**
     * Return the associated RModuleAttribute object
     * If it was not retrieved before, the object is retrieved from
     * the database using the passed connection
     *
     * @param connection the connection used to retrieve the associated object
     *        from the database, if it was not retrieved before
     * @return the associated RModuleAttribute object
     * @throws TorqueException
     */
    public RModuleAttribute getRModuleAttribute(Connection connection)
        throws TorqueException
    {
        if (aRModuleAttribute == null && (!ObjectUtils.equals(this.moduleId, null) && !ObjectUtils.equals(this.attributeId, null) && !ObjectUtils.equals(this.issueTypeId, null)))
        {
                    SimpleKey[] keys = { SimpleKey.keyFor(this.moduleId), SimpleKey.keyFor(this.attributeId), SimpleKey.keyFor(this.issueTypeId) };
            ComboKey comboid = new ComboKey(keys);

            aRModuleAttribute = RModuleAttributeManager.getCachedInstance(comboid);
            if (aRModuleAttribute == null)
            {
                          aRModuleAttribute = RModuleAttributePeer.retrieveByPK(comboid, connection);
                          RModuleAttributeManager.putInstance(aRModuleAttribute);
            }
                }
        return aRModuleAttribute;
    }
    
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         * Note: It is important that the xml schema used to create this class
     * maintains consistency in the order of related columns between
     * SCARAB_CONDITION and SCARAB_R_MODULE_ATTRIBUTE.
     * If for some reason this is impossible, this method should be
     * overridden in <code>Condition</code>.
         */
    public void setRModuleAttributeKey(ObjectKey key) throws TorqueException
    {
            SimpleKey[] keys = (SimpleKey[]) key.getValue();
                            setModuleId(new Integer(((NumberKey) keys[0]).intValue()));
        
                              setAttributeId(new Integer(((NumberKey) keys[1]).intValue()));
        
                              setIssueTypeId(new Integer(((NumberKey) keys[2]).intValue()));
        
                      }
  
        
                  
    
        private Transition aTransition;

    /**
     * Declares an association between this object and a Transition object
     *
     * @param v Transition
     * @throws TorqueException
     */
    public void setTransition(Transition v) throws TorqueException
    {
            if (v == null)
        {
                  setTransitionId((Integer) null);
              }
        else
        {
            setTransitionId(v.getTransitionId());
        }
            aTransition = v;
    }

                        
    /**
     * Returns the associated Transition object.
           * If it was not retrieved before, the object is retrieved from
     * the database
           *
     * @return the associated Transition object
           * @throws TorqueException
           */
    public Transition getTransition()
              throws TorqueException
          {
              if (aTransition == null && (!ObjectUtils.equals(this.transitionId, null)))
        {
                    aTransition = TransitionManager.getInstance(SimpleKey.keyFor(this.transitionId));
                }
              return aTransition;
    }

    /**
     * Return the associated Transition object
     * If it was not retrieved before, the object is retrieved from
     * the database using the passed connection
     *
     * @param connection the connection used to retrieve the associated object
     *        from the database, if it was not retrieved before
     * @return the associated Transition object
     * @throws TorqueException
     */
    public Transition getTransition(Connection connection)
        throws TorqueException
    {
        if (aTransition == null && (!ObjectUtils.equals(this.transitionId, null)))
        {
                    aTransition = TransitionManager.getCachedInstance(SimpleKey.keyFor(this.transitionId));
            if (aTransition == null)
            {
                          aTransition = TransitionPeer.retrieveByPK(SimpleKey.keyFor(this.transitionId), connection);
                          TransitionManager.putInstance(aTransition);
            }
                }
        return aTransition;
    }
    
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setTransitionKey(ObjectKey key) throws TorqueException
    {
    
                    setTransitionId(new Integer(((NumberKey) key).intValue()));
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
  
        
                            
    
        private RModuleIssueType aRModuleIssueType;

    /**
     * Declares an association between this object and a RModuleIssueType object
     *
     * @param v RModuleIssueType
     * @throws TorqueException
     */
    public void setRModuleIssueType(RModuleIssueType v) throws TorqueException
    {
            if (v == null)
        {
                  setModuleId((Integer) null);
              }
        else
        {
            setModuleId(v.getModuleId());
        }
            if (v == null)
        {
                  setIssueTypeId((Integer) null);
              }
        else
        {
            setIssueTypeId(v.getIssueTypeId());
        }
            aRModuleIssueType = v;
    }

                                        
    /**
     * Returns the associated RModuleIssueType object.
           * If it was not retrieved before, the object is retrieved from
     * the database
           *
     * @return the associated RModuleIssueType object
           * @throws TorqueException
           */
    public RModuleIssueType getRModuleIssueType()
              throws TorqueException
          {
              if (aRModuleIssueType == null && (!ObjectUtils.equals(this.moduleId, null) && !ObjectUtils.equals(this.issueTypeId, null)))
        {
                    SimpleKey[] keys = { SimpleKey.keyFor(this.moduleId), SimpleKey.keyFor(this.issueTypeId) };
            aRModuleIssueType = RModuleIssueTypeManager.getInstance(new ComboKey(keys));
                }
              return aRModuleIssueType;
    }

    /**
     * Return the associated RModuleIssueType object
     * If it was not retrieved before, the object is retrieved from
     * the database using the passed connection
     *
     * @param connection the connection used to retrieve the associated object
     *        from the database, if it was not retrieved before
     * @return the associated RModuleIssueType object
     * @throws TorqueException
     */
    public RModuleIssueType getRModuleIssueType(Connection connection)
        throws TorqueException
    {
        if (aRModuleIssueType == null && (!ObjectUtils.equals(this.moduleId, null) && !ObjectUtils.equals(this.issueTypeId, null)))
        {
                    SimpleKey[] keys = { SimpleKey.keyFor(this.moduleId), SimpleKey.keyFor(this.issueTypeId) };
            ComboKey comboid = new ComboKey(keys);

            aRModuleIssueType = RModuleIssueTypeManager.getCachedInstance(comboid);
            if (aRModuleIssueType == null)
            {
                          aRModuleIssueType = RModuleIssueTypePeer.retrieveByPK(comboid, connection);
                          RModuleIssueTypeManager.putInstance(aRModuleIssueType);
            }
                }
        return aRModuleIssueType;
    }
    
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         * Note: It is important that the xml schema used to create this class
     * maintains consistency in the order of related columns between
     * SCARAB_CONDITION and SCARAB_R_MODULE_ISSUE_TYPE.
     * If for some reason this is impossible, this method should be
     * overridden in <code>Condition</code>.
         */
    public void setRModuleIssueTypeKey(ObjectKey key) throws TorqueException
    {
            SimpleKey[] keys = (SimpleKey[]) key.getValue();
                            setModuleId(new Integer(((NumberKey) keys[0]).intValue()));
        
                              setIssueTypeId(new Integer(((NumberKey) keys[1]).intValue()));
        
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
              fieldNames.add("ConditionId");
              fieldNames.add("TransitionId");
              fieldNames.add("ModuleId");
              fieldNames.add("IssueTypeId");
              fieldNames.add("AttributeId");
              fieldNames.add("OptionId");
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
          if (name.equals("ConditionId"))
        {
                return getConditionId();
            }
          if (name.equals("TransitionId"))
        {
                return getTransitionId();
            }
          if (name.equals("ModuleId"))
        {
                return getModuleId();
            }
          if (name.equals("IssueTypeId"))
        {
                return getIssueTypeId();
            }
          if (name.equals("AttributeId"))
        {
                return getAttributeId();
            }
          if (name.equals("OptionId"))
        {
                return getOptionId();
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
          if (name.equals(ConditionPeer.CONDITION_ID))
        {
                return getConditionId();
            }
          if (name.equals(ConditionPeer.TRANSITION_ID))
        {
                return getTransitionId();
            }
          if (name.equals(ConditionPeer.MODULE_ID))
        {
                return getModuleId();
            }
          if (name.equals(ConditionPeer.ISSUE_TYPE_ID))
        {
                return getIssueTypeId();
            }
          if (name.equals(ConditionPeer.ATTRIBUTE_ID))
        {
                return getAttributeId();
            }
          if (name.equals(ConditionPeer.OPTION_ID))
        {
                return getOptionId();
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
                return getConditionId();
            }
              if (pos == 1)
        {
                return getTransitionId();
            }
              if (pos == 2)
        {
                return getModuleId();
            }
              if (pos == 3)
        {
                return getIssueTypeId();
            }
              if (pos == 4)
        {
                return getAttributeId();
            }
              if (pos == 5)
        {
                return getOptionId();
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
          save(ConditionPeer.getMapBuilder()
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
                    ConditionPeer.doInsert((Condition) this, con);
                    setNew(false);
                }
                else
                {
                    ConditionPeer.doUpdate((Condition) this, con);
                }

    
                      if (isCacheOnSave())
                {
                    ConditionManager.putInstance(this);
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
     * @param key conditionId ObjectKey
     */
    public void setPrimaryKey(ObjectKey key)
        
    {
            setConditionId(new Long(((NumberKey) key).longValue()));
        }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) 
    {
            setConditionId(new Long(key));
        }

  
    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
          return SimpleKey.keyFor(getConditionId());
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
      public Condition copy() throws TorqueException
    {
        return copyInto(new Condition());
    }
  
    protected Condition copyInto(Condition copyObj) throws TorqueException
    {
          copyObj.setConditionId(conditionId);
          copyObj.setTransitionId(transitionId);
          copyObj.setModuleId(moduleId);
          copyObj.setIssueTypeId(issueTypeId);
          copyObj.setAttributeId(attributeId);
          copyObj.setOptionId(optionId);
  
                    copyObj.setConditionId((Long)null);
                                          
                return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public ConditionPeer getPeer()
    {
        return peer;
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("Condition:\n");
        str.append("ConditionId = ")
               .append(getConditionId())
             .append("\n");
        str.append("TransitionId = ")
               .append(getTransitionId())
             .append("\n");
        str.append("ModuleId = ")
               .append(getModuleId())
             .append("\n");
        str.append("IssueTypeId = ")
               .append(getIssueTypeId())
             .append("\n");
        str.append("AttributeId = ")
               .append(getAttributeId())
             .append("\n");
        str.append("OptionId = ")
               .append(getOptionId())
             .append("\n");
        return(str.toString());
    }
}
