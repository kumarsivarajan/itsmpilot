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
 * extended all references should be to AttributeClass
 */
public abstract class BaseAttributeClass extends BaseObject
    implements org.apache.fulcrum.intake.Retrievable
{
    /** The Peer class */
    private static final AttributeClassPeer peer =
        new AttributeClassPeer();

        
    /** The value for the attributeClassId field */
    private Integer attributeClassId;
      
    /** The value for the name field */
    private String name;
      
    /** The value for the desc field */
    private String desc;
      
    /** The value for the javaClassName field */
    private String javaClassName;
  
            
    /**
     * Get the AttributeClassId
     *
     * @return Integer
     */
    public Integer getAttributeClassId()
    {
        return attributeClassId;
    }

                                              
    /**
     * Set the value of AttributeClassId
     *
     * @param v new value
     */
    public void setAttributeClassId(Integer v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.attributeClassId, v))
              {
            this.attributeClassId = v;
            setModified(true);
        }
    
          
                                  
                  // update associated AttributeType
        if (collAttributeTypes != null)
        {
            for (int i = 0; i < collAttributeTypes.size(); i++)
            {
                ((AttributeType) collAttributeTypes.get(i))
                        .setClassId(v);
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
     * Get the Desc
     *
     * @return String
     */
    public String getDesc()
    {
        return desc;
    }

                        
    /**
     * Set the value of Desc
     *
     * @param v new value
     */
    public void setDesc(String v) 
    {
    
                  if (!ObjectUtils.equals(this.desc, v))
              {
            this.desc = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the JavaClassName
     *
     * @return String
     */
    public String getJavaClassName()
    {
        return javaClassName;
    }

                        
    /**
     * Set the value of JavaClassName
     *
     * @param v new value
     */
    public void setJavaClassName(String v) 
    {
    
                  if (!ObjectUtils.equals(this.javaClassName, v))
              {
            this.javaClassName = v;
            setModified(true);
        }
    
          
              }
  
         
                                
            
          /**
     * Collection to store aggregation of collAttributeTypes
     */
    protected List collAttributeTypes;

    /**
     * Temporary storage of collAttributeTypes to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initAttributeTypes()
    {
        if (collAttributeTypes == null)
        {
            collAttributeTypes = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a AttributeType object to this object
     * through the AttributeType foreign key attribute
     *
     * @param l AttributeType
     * @throws TorqueException
     */
    public void addAttributeType(AttributeType l) throws TorqueException
    {
        getAttributeTypes().add(l);
        l.setAttributeClass((AttributeClass) this);
    }

    /**
     * The criteria used to select the current contents of collAttributeTypes
     */
    private Criteria lastAttributeTypesCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getAttributeTypes(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getAttributeTypes()
              throws TorqueException
          {
                      if (collAttributeTypes == null)
        {
            collAttributeTypes = getAttributeTypes(new Criteria(10));
        }
                return collAttributeTypes;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeClass has previously
           * been saved, it will retrieve related AttributeTypes from storage.
     * If this AttributeClass is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getAttributeTypes(Criteria criteria) throws TorqueException
    {
              if (collAttributeTypes == null)
        {
            if (isNew())
            {
               collAttributeTypes = new ArrayList();
            }
            else
            {
                        criteria.add(AttributeTypePeer.ATTRIBUTE_CLASS_ID, getAttributeClassId() );
                        collAttributeTypes = AttributeTypePeer.doSelect(criteria);
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
                            criteria.add(AttributeTypePeer.ATTRIBUTE_CLASS_ID, getAttributeClassId());
                            if (!lastAttributeTypesCriteria.equals(criteria))
                {
                    collAttributeTypes = AttributeTypePeer.doSelect(criteria);
                }
            }
        }
        lastAttributeTypesCriteria = criteria;

        return collAttributeTypes;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getAttributeTypes(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getAttributeTypes(Connection con) throws TorqueException
    {
              if (collAttributeTypes == null)
        {
            collAttributeTypes = getAttributeTypes(new Criteria(10), con);
        }
        return collAttributeTypes;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeClass has previously
           * been saved, it will retrieve related AttributeTypes from storage.
     * If this AttributeClass is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getAttributeTypes(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collAttributeTypes == null)
        {
            if (isNew())
            {
               collAttributeTypes = new ArrayList();
            }
            else
            {
                         criteria.add(AttributeTypePeer.ATTRIBUTE_CLASS_ID, getAttributeClassId());
                         collAttributeTypes = AttributeTypePeer.doSelect(criteria, con);
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
                             criteria.add(AttributeTypePeer.ATTRIBUTE_CLASS_ID, getAttributeClassId());
                             if (!lastAttributeTypesCriteria.equals(criteria))
                 {
                     collAttributeTypes = AttributeTypePeer.doSelect(criteria, con);
                 }
             }
         }
         lastAttributeTypesCriteria = criteria;

         return collAttributeTypes;
           }

                  
              
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeClass is new, it will return
                 * an empty collection; or if this AttributeClass has previously
     * been saved, it will retrieve related AttributeTypes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeClass.
     */
    protected List getAttributeTypesJoinAttributeClass(Criteria criteria)
        throws TorqueException
    {
                    if (collAttributeTypes == null)
        {
            if (isNew())
            {
               collAttributeTypes = new ArrayList();
            }
            else
            {
                              criteria.add(AttributeTypePeer.ATTRIBUTE_CLASS_ID, getAttributeClassId());
                              collAttributeTypes = AttributeTypePeer.doSelectJoinAttributeClass(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttributeTypePeer.ATTRIBUTE_CLASS_ID, getAttributeClassId());
                                    if (!lastAttributeTypesCriteria.equals(criteria))
            {
                collAttributeTypes = AttributeTypePeer.doSelectJoinAttributeClass(criteria);
            }
        }
        lastAttributeTypesCriteria = criteria;

        return collAttributeTypes;
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
              fieldNames.add("AttributeClassId");
              fieldNames.add("Name");
              fieldNames.add("Desc");
              fieldNames.add("JavaClassName");
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
          if (name.equals("AttributeClassId"))
        {
                return getAttributeClassId();
            }
          if (name.equals("Name"))
        {
                return getName();
            }
          if (name.equals("Desc"))
        {
                return getDesc();
            }
          if (name.equals("JavaClassName"))
        {
                return getJavaClassName();
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
          if (name.equals(AttributeClassPeer.ATTRIBUTE_CLASS_ID))
        {
                return getAttributeClassId();
            }
          if (name.equals(AttributeClassPeer.ATTRIBUTE_CLASS_NAME))
        {
                return getName();
            }
          if (name.equals(AttributeClassPeer.ATTRIBUTE_CLASS_DESC))
        {
                return getDesc();
            }
          if (name.equals(AttributeClassPeer.JAVA_CLASS_NAME))
        {
                return getJavaClassName();
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
                return getAttributeClassId();
            }
              if (pos == 1)
        {
                return getName();
            }
              if (pos == 2)
        {
                return getDesc();
            }
              if (pos == 3)
        {
                return getJavaClassName();
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
          save(AttributeClassPeer.getMapBuilder()
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
                    AttributeClassPeer.doInsert((AttributeClass) this, con);
                    setNew(false);
                }
                else
                {
                    AttributeClassPeer.doUpdate((AttributeClass) this, con);
                }

    
                      if (isCacheOnSave())
                {
                    AttributeClassManager.putInstance(this);
                }
              }

                                      
                                    if (collAttributeTypes != null)
            {
                for (int i = 0; i < collAttributeTypes.size(); i++)
                {
                    ((AttributeType) collAttributeTypes.get(i)).save(con);
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
     * @param key attributeClassId ObjectKey
     */
    public void setPrimaryKey(ObjectKey key)
        throws TorqueException
    {
            setAttributeClassId(new Integer(((NumberKey) key).intValue()));
        }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) throws TorqueException
    {
            setAttributeClassId(new Integer(key));
        }

  
    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
          return SimpleKey.keyFor(getAttributeClassId());
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
      public AttributeClass copy() throws TorqueException
    {
        return copyInto(new AttributeClass());
    }
  
    protected AttributeClass copyInto(AttributeClass copyObj) throws TorqueException
    {
          copyObj.setAttributeClassId(attributeClassId);
          copyObj.setName(name);
          copyObj.setDesc(desc);
          copyObj.setJavaClassName(javaClassName);
  
                    copyObj.setAttributeClassId((Integer)null);
                              
                                      
                            
        List v = getAttributeTypes();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                AttributeType obj = (AttributeType) v.get(i);
                copyObj.addAttributeType(obj.copy());
            }
        }
        else
        {
            copyObj.collAttributeTypes = null;
        }
                            return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public AttributeClassPeer getPeer()
    {
        return peer;
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("AttributeClass:\n");
        str.append("AttributeClassId = ")
               .append(getAttributeClassId())
             .append("\n");
        str.append("Name = ")
               .append(getName())
             .append("\n");
        str.append("Desc = ")
               .append(getDesc())
             .append("\n");
        str.append("JavaClassName = ")
               .append(getJavaClassName())
             .append("\n");
        return(str.toString());
    }
}
