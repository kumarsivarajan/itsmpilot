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
 * extended all references should be to RAttributeAttributeGroup
 */
public abstract class BaseRAttributeAttributeGroup extends BaseObject
    implements org.apache.fulcrum.intake.Retrievable
{
    /** The Peer class */
    private static final RAttributeAttributeGroupPeer peer =
        new RAttributeAttributeGroupPeer();

        
    /** The value for the groupId field */
    private Integer groupId;
      
    /** The value for the attributeId field */
    private Integer attributeId;
                                          
    /** The value for the order field */
    private int order = -1;
  
            
    /**
     * Get the GroupId
     *
     * @return Integer
     */
    public Integer getGroupId()
    {
        return groupId;
    }

                              
    /**
     * Set the value of GroupId
     *
     * @param v new value
     */
    public void setGroupId(Integer v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.groupId, v))
              {
            this.groupId = v;
            setModified(true);
        }
    
                                  
                if (aAttributeGroup != null && !ObjectUtils.equals(aAttributeGroup.getAttributeGroupId(), v))
                {
            aAttributeGroup = null;
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
  
        
                  
    
        private AttributeGroup aAttributeGroup;

    /**
     * Declares an association between this object and a AttributeGroup object
     *
     * @param v AttributeGroup
     * @throws TorqueException
     */
    public void setAttributeGroup(AttributeGroup v) throws TorqueException
    {
            if (v == null)
        {
                  setGroupId((Integer) null);
              }
        else
        {
            setGroupId(v.getAttributeGroupId());
        }
            aAttributeGroup = v;
    }

                        
    /**
     * Returns the associated AttributeGroup object.
           * If it was not retrieved before, the object is retrieved from
     * the database
           *
     * @return the associated AttributeGroup object
           * @throws TorqueException
           */
    public AttributeGroup getAttributeGroup()
              throws TorqueException
          {
              if (aAttributeGroup == null && (!ObjectUtils.equals(this.groupId, null)))
        {
                    aAttributeGroup = AttributeGroupManager.getInstance(SimpleKey.keyFor(this.groupId));
                }
              return aAttributeGroup;
    }

    /**
     * Return the associated AttributeGroup object
     * If it was not retrieved before, the object is retrieved from
     * the database using the passed connection
     *
     * @param connection the connection used to retrieve the associated object
     *        from the database, if it was not retrieved before
     * @return the associated AttributeGroup object
     * @throws TorqueException
     */
    public AttributeGroup getAttributeGroup(Connection connection)
        throws TorqueException
    {
        if (aAttributeGroup == null && (!ObjectUtils.equals(this.groupId, null)))
        {
                    aAttributeGroup = AttributeGroupManager.getCachedInstance(SimpleKey.keyFor(this.groupId));
            if (aAttributeGroup == null)
            {
                          aAttributeGroup = AttributeGroupPeer.retrieveByPK(SimpleKey.keyFor(this.groupId), connection);
                          AttributeGroupManager.putInstance(aAttributeGroup);
            }
                }
        return aAttributeGroup;
    }
    
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setAttributeGroupKey(ObjectKey key) throws TorqueException
    {
    
                    setGroupId(new Integer(((NumberKey) key).intValue()));
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
              fieldNames.add("GroupId");
              fieldNames.add("AttributeId");
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
          if (name.equals("GroupId"))
        {
                return getGroupId();
            }
          if (name.equals("AttributeId"))
        {
                return getAttributeId();
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
          if (name.equals(RAttributeAttributeGroupPeer.GROUP_ID))
        {
                return getGroupId();
            }
          if (name.equals(RAttributeAttributeGroupPeer.ATTRIBUTE_ID))
        {
                return getAttributeId();
            }
          if (name.equals(RAttributeAttributeGroupPeer.PREFERRED_ORDER))
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
                return getGroupId();
            }
              if (pos == 1)
        {
                return getAttributeId();
            }
              if (pos == 2)
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
          save(RAttributeAttributeGroupPeer.getMapBuilder()
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
                    RAttributeAttributeGroupPeer.doInsert((RAttributeAttributeGroup) this, con);
                    setNew(false);
                }
                else
                {
                    RAttributeAttributeGroupPeer.doUpdate((RAttributeAttributeGroup) this, con);
                }

    
                      if (isCacheOnSave())
                {
                    RAttributeAttributeGroupManager.putInstance(this);
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
                      setGroupId(new Integer(((NumberKey)keys[0]).intValue()));
                        setAttributeId(new Integer(((NumberKey)keys[1]).intValue()));
              }

    /**
     * Set the PrimaryKey using SimpleKeys.
     *
         * @param groupId Integer
         * @param attributeId Integer
         */
    public void setPrimaryKey( Integer groupId, Integer attributeId)
        throws TorqueException
    {
            setGroupId(groupId);
            setAttributeId(attributeId);
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
              pks[0] = SimpleKey.keyFor(getGroupId());
                  pks[1] = SimpleKey.keyFor(getAttributeId());
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
      public RAttributeAttributeGroup copy() throws TorqueException
    {
        return copyInto(new RAttributeAttributeGroup());
    }
  
    protected RAttributeAttributeGroup copyInto(RAttributeAttributeGroup copyObj) throws TorqueException
    {
          copyObj.setGroupId(groupId);
          copyObj.setAttributeId(attributeId);
          copyObj.setOrder(order);
  
                    copyObj.setGroupId((Integer)null);
                              copyObj.setAttributeId((Integer)null);
                  
                return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public RAttributeAttributeGroupPeer getPeer()
    {
        return peer;
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("RAttributeAttributeGroup:\n");
        str.append("GroupId = ")
               .append(getGroupId())
             .append("\n");
        str.append("AttributeId = ")
               .append(getAttributeId())
             .append("\n");
        str.append("Order = ")
               .append(getOrder())
             .append("\n");
        return(str.toString());
    }
}
