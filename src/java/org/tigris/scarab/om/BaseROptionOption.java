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
 * extended all references should be to ROptionOption
 */
public abstract class BaseROptionOption extends BaseObject
    implements org.apache.fulcrum.intake.Retrievable
{
    /** The Peer class */
    private static final ROptionOptionPeer peer =
        new ROptionOptionPeer();

        
    /** The value for the option1Id field */
    private Integer option1Id;
      
    /** The value for the option2Id field */
    private Integer option2Id;
      
    /** The value for the relationshipId field */
    private Integer relationshipId;
      
    /** The value for the weight field */
    private int weight;
      
    /** The value for the preferredOrder field */
    private int preferredOrder;
  
            
    /**
     * Get the Option1Id
     *
     * @return Integer
     */
    public Integer getOption1Id()
    {
        return option1Id;
    }

                              
    /**
     * Set the value of Option1Id
     *
     * @param v new value
     */
    public void setOption1Id(Integer v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.option1Id, v))
              {
            this.option1Id = v;
            setModified(true);
        }
    
                                                                          
                if (aAttributeOptionRelatedByOption1Id != null && !ObjectUtils.equals(aAttributeOptionRelatedByOption1Id.getOptionId(), v))
                {
            aAttributeOptionRelatedByOption1Id = null;
        }
      
              }
          
    /**
     * Get the Option2Id
     *
     * @return Integer
     */
    public Integer getOption2Id()
    {
        return option2Id;
    }

                              
    /**
     * Set the value of Option2Id
     *
     * @param v new value
     */
    public void setOption2Id(Integer v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.option2Id, v))
              {
            this.option2Id = v;
            setModified(true);
        }
    
                                                                          
                if (aAttributeOptionRelatedByOption2Id != null && !ObjectUtils.equals(aAttributeOptionRelatedByOption2Id.getOptionId(), v))
                {
            aAttributeOptionRelatedByOption2Id = null;
        }
      
              }
          
    /**
     * Get the RelationshipId
     *
     * @return Integer
     */
    public Integer getRelationshipId()
    {
        return relationshipId;
    }

                              
    /**
     * Set the value of RelationshipId
     *
     * @param v new value
     */
    public void setRelationshipId(Integer v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.relationshipId, v))
              {
            this.relationshipId = v;
            setModified(true);
        }
    
                                  
                if (aOptionRelationship != null && !ObjectUtils.equals(aOptionRelationship.getRelationshipId(), v))
                {
            aOptionRelationship = null;
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
          
    /**
     * Get the PreferredOrder
     *
     * @return int
     */
    public int getPreferredOrder()
    {
        return preferredOrder;
    }

                        
    /**
     * Set the value of PreferredOrder
     *
     * @param v new value
     */
    public void setPreferredOrder(int v) 
    {
    
                  if (this.preferredOrder != v)
              {
            this.preferredOrder = v;
            setModified(true);
        }
    
          
              }
  
      
        
                        
        
        private AttributeOption aAttributeOptionRelatedByOption1Id;

    /**
     * Declares an association between this object and a AttributeOption object
     *
     * @param v AttributeOption
     * @throws TorqueException
     */
    public void setAttributeOptionRelatedByOption1Id(AttributeOption v) throws TorqueException
    {
            if (v == null)
        {
                  setOption1Id((Integer) null);
              }
        else
        {
            setOption1Id(v.getOptionId());
        }
            aAttributeOptionRelatedByOption1Id = v;
    }

                        
    /**
     * Returns the associated AttributeOption object.
           * If it was not retrieved before, the object is retrieved from
     * the database
           *
     * @return the associated AttributeOption object
           * @throws TorqueException
           */
    public AttributeOption getAttributeOptionRelatedByOption1Id()
              throws TorqueException
          {
              if (aAttributeOptionRelatedByOption1Id == null && (!ObjectUtils.equals(this.option1Id, null)))
        {
                    aAttributeOptionRelatedByOption1Id = AttributeOptionManager.getInstance(SimpleKey.keyFor(this.option1Id));
                }
              return aAttributeOptionRelatedByOption1Id;
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
    public AttributeOption getAttributeOptionRelatedByOption1Id(Connection connection)
        throws TorqueException
    {
        if (aAttributeOptionRelatedByOption1Id == null && (!ObjectUtils.equals(this.option1Id, null)))
        {
                    aAttributeOptionRelatedByOption1Id = AttributeOptionManager.getCachedInstance(SimpleKey.keyFor(this.option1Id));
            if (aAttributeOptionRelatedByOption1Id == null)
            {
                          aAttributeOptionRelatedByOption1Id = AttributeOptionPeer.retrieveByPK(SimpleKey.keyFor(this.option1Id), connection);
                          AttributeOptionManager.putInstance(aAttributeOptionRelatedByOption1Id);
            }
                }
        return aAttributeOptionRelatedByOption1Id;
    }
    
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setAttributeOptionRelatedByOption1IdKey(ObjectKey key) throws TorqueException
    {
    
                    setOption1Id(new Integer(((NumberKey) key).intValue()));
              }
  
        
                        
        
        private AttributeOption aAttributeOptionRelatedByOption2Id;

    /**
     * Declares an association between this object and a AttributeOption object
     *
     * @param v AttributeOption
     * @throws TorqueException
     */
    public void setAttributeOptionRelatedByOption2Id(AttributeOption v) throws TorqueException
    {
            if (v == null)
        {
                  setOption2Id((Integer) null);
              }
        else
        {
            setOption2Id(v.getOptionId());
        }
            aAttributeOptionRelatedByOption2Id = v;
    }

                        
    /**
     * Returns the associated AttributeOption object.
           * If it was not retrieved before, the object is retrieved from
     * the database
           *
     * @return the associated AttributeOption object
           * @throws TorqueException
           */
    public AttributeOption getAttributeOptionRelatedByOption2Id()
              throws TorqueException
          {
              if (aAttributeOptionRelatedByOption2Id == null && (!ObjectUtils.equals(this.option2Id, null)))
        {
                    aAttributeOptionRelatedByOption2Id = AttributeOptionManager.getInstance(SimpleKey.keyFor(this.option2Id));
                }
              return aAttributeOptionRelatedByOption2Id;
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
    public AttributeOption getAttributeOptionRelatedByOption2Id(Connection connection)
        throws TorqueException
    {
        if (aAttributeOptionRelatedByOption2Id == null && (!ObjectUtils.equals(this.option2Id, null)))
        {
                    aAttributeOptionRelatedByOption2Id = AttributeOptionManager.getCachedInstance(SimpleKey.keyFor(this.option2Id));
            if (aAttributeOptionRelatedByOption2Id == null)
            {
                          aAttributeOptionRelatedByOption2Id = AttributeOptionPeer.retrieveByPK(SimpleKey.keyFor(this.option2Id), connection);
                          AttributeOptionManager.putInstance(aAttributeOptionRelatedByOption2Id);
            }
                }
        return aAttributeOptionRelatedByOption2Id;
    }
    
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setAttributeOptionRelatedByOption2IdKey(ObjectKey key) throws TorqueException
    {
    
                    setOption2Id(new Integer(((NumberKey) key).intValue()));
              }
  
        
                  
    
        private OptionRelationship aOptionRelationship;

    /**
     * Declares an association between this object and a OptionRelationship object
     *
     * @param v OptionRelationship
     * @throws TorqueException
     */
    public void setOptionRelationship(OptionRelationship v) throws TorqueException
    {
            if (v == null)
        {
                  setRelationshipId((Integer) null);
              }
        else
        {
            setRelationshipId(v.getRelationshipId());
        }
            aOptionRelationship = v;
    }

                        
    /**
     * Returns the associated OptionRelationship object.
           * If it was not retrieved before, the object is retrieved from
     * the database
           *
     * @return the associated OptionRelationship object
           * @throws TorqueException
           */
    public OptionRelationship getOptionRelationship()
              throws TorqueException
          {
              if (aOptionRelationship == null && (!ObjectUtils.equals(this.relationshipId, null)))
        {
                    aOptionRelationship = OptionRelationshipManager.getInstance(SimpleKey.keyFor(this.relationshipId));
                }
              return aOptionRelationship;
    }

    /**
     * Return the associated OptionRelationship object
     * If it was not retrieved before, the object is retrieved from
     * the database using the passed connection
     *
     * @param connection the connection used to retrieve the associated object
     *        from the database, if it was not retrieved before
     * @return the associated OptionRelationship object
     * @throws TorqueException
     */
    public OptionRelationship getOptionRelationship(Connection connection)
        throws TorqueException
    {
        if (aOptionRelationship == null && (!ObjectUtils.equals(this.relationshipId, null)))
        {
                    aOptionRelationship = OptionRelationshipManager.getCachedInstance(SimpleKey.keyFor(this.relationshipId));
            if (aOptionRelationship == null)
            {
                          aOptionRelationship = OptionRelationshipPeer.retrieveByPK(SimpleKey.keyFor(this.relationshipId), connection);
                          OptionRelationshipManager.putInstance(aOptionRelationship);
            }
                }
        return aOptionRelationship;
    }
    
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setOptionRelationshipKey(ObjectKey key) throws TorqueException
    {
    
                    setRelationshipId(new Integer(((NumberKey) key).intValue()));
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
              fieldNames.add("Option1Id");
              fieldNames.add("Option2Id");
              fieldNames.add("RelationshipId");
              fieldNames.add("Weight");
              fieldNames.add("PreferredOrder");
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
          if (name.equals("Option1Id"))
        {
                return getOption1Id();
            }
          if (name.equals("Option2Id"))
        {
                return getOption2Id();
            }
          if (name.equals("RelationshipId"))
        {
                return getRelationshipId();
            }
          if (name.equals("Weight"))
        {
                return new Integer(getWeight());
            }
          if (name.equals("PreferredOrder"))
        {
                return new Integer(getPreferredOrder());
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
          if (name.equals(ROptionOptionPeer.OPTION1_ID))
        {
                return getOption1Id();
            }
          if (name.equals(ROptionOptionPeer.OPTION2_ID))
        {
                return getOption2Id();
            }
          if (name.equals(ROptionOptionPeer.RELATIONSHIP_ID))
        {
                return getRelationshipId();
            }
          if (name.equals(ROptionOptionPeer.WEIGHT))
        {
                return new Integer(getWeight());
            }
          if (name.equals(ROptionOptionPeer.PREFERRED_ORDER))
        {
                return new Integer(getPreferredOrder());
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
                return getOption1Id();
            }
              if (pos == 1)
        {
                return getOption2Id();
            }
              if (pos == 2)
        {
                return getRelationshipId();
            }
              if (pos == 3)
        {
                return new Integer(getWeight());
            }
              if (pos == 4)
        {
                return new Integer(getPreferredOrder());
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
          save(ROptionOptionPeer.getMapBuilder()
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
                    ROptionOptionPeer.doInsert((ROptionOption) this, con);
                    setNew(false);
                }
                else
                {
                    ROptionOptionPeer.doUpdate((ROptionOption) this, con);
                }

    
                      if (isCacheOnSave())
                {
                    ROptionOptionManager.putInstance(this);
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
                      setOption1Id(new Integer(((NumberKey)keys[0]).intValue()));
                        setOption2Id(new Integer(((NumberKey)keys[1]).intValue()));
              }

    /**
     * Set the PrimaryKey using SimpleKeys.
     *
         * @param option1Id Integer
         * @param option2Id Integer
         */
    public void setPrimaryKey( Integer option1Id, Integer option2Id)
        throws TorqueException
    {
            setOption1Id(option1Id);
            setOption2Id(option2Id);
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
              pks[0] = SimpleKey.keyFor(getOption1Id());
                  pks[1] = SimpleKey.keyFor(getOption2Id());
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
      public ROptionOption copy() throws TorqueException
    {
        return copyInto(new ROptionOption());
    }
  
    protected ROptionOption copyInto(ROptionOption copyObj) throws TorqueException
    {
          copyObj.setOption1Id(option1Id);
          copyObj.setOption2Id(option2Id);
          copyObj.setRelationshipId(relationshipId);
          copyObj.setWeight(weight);
          copyObj.setPreferredOrder(preferredOrder);
  
                    copyObj.setOption1Id((Integer)null);
                              copyObj.setOption2Id((Integer)null);
                              
                return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public ROptionOptionPeer getPeer()
    {
        return peer;
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("ROptionOption:\n");
        str.append("Option1Id = ")
               .append(getOption1Id())
             .append("\n");
        str.append("Option2Id = ")
               .append(getOption2Id())
             .append("\n");
        str.append("RelationshipId = ")
               .append(getRelationshipId())
             .append("\n");
        str.append("Weight = ")
               .append(getWeight())
             .append("\n");
        str.append("PreferredOrder = ")
               .append(getPreferredOrder())
             .append("\n");
        return(str.toString());
    }
}
