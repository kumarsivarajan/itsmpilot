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
 * extended all references should be to AttributeType
 */
public abstract class BaseAttributeType extends BaseObject
    implements org.apache.fulcrum.intake.Retrievable
{
    /** The Peer class */
    private static final AttributeTypePeer peer =
        new AttributeTypePeer();

        
    /** The value for the attributeTypeId field */
    private Integer attributeTypeId;
      
    /** The value for the classId field */
    private Integer classId;
      
    /** The value for the name field */
    private String name;
      
    /** The value for the javaClassName field */
    private String javaClassName;
      
    /** The value for the validationKey field */
    private String validationKey;
  
            
    /**
     * Get the AttributeTypeId
     *
     * @return Integer
     */
    public Integer getAttributeTypeId()
    {
        return attributeTypeId;
    }

                                              
    /**
     * Set the value of AttributeTypeId
     *
     * @param v new value
     */
    public void setAttributeTypeId(Integer v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.attributeTypeId, v))
              {
            this.attributeTypeId = v;
            setModified(true);
        }
    
          
                                  
                  // update associated Attribute
        if (collAttributes != null)
        {
            for (int i = 0; i < collAttributes.size(); i++)
            {
                ((Attribute) collAttributes.get(i))
                        .setTypeId(v);
            }
        }
                                }
          
    /**
     * Get the ClassId
     *
     * @return Integer
     */
    public Integer getClassId()
    {
        return classId;
    }

                              
    /**
     * Set the value of ClassId
     *
     * @param v new value
     */
    public void setClassId(Integer v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.classId, v))
              {
            this.classId = v;
            setModified(true);
        }
    
                                  
                if (aAttributeClass != null && !ObjectUtils.equals(aAttributeClass.getAttributeClassId(), v))
                {
            aAttributeClass = null;
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
     * Get the ValidationKey
     *
     * @return String
     */
    public String getValidationKey()
    {
        return validationKey;
    }

                        
    /**
     * Set the value of ValidationKey
     *
     * @param v new value
     */
    public void setValidationKey(String v) 
    {
    
                  if (!ObjectUtils.equals(this.validationKey, v))
              {
            this.validationKey = v;
            setModified(true);
        }
    
          
              }
  
      
        
                  
    
        private AttributeClass aAttributeClass;

    /**
     * Declares an association between this object and a AttributeClass object
     *
     * @param v AttributeClass
     * @throws TorqueException
     */
    public void setAttributeClass(AttributeClass v) throws TorqueException
    {
            if (v == null)
        {
                  setClassId((Integer) null);
              }
        else
        {
            setClassId(v.getAttributeClassId());
        }
            aAttributeClass = v;
    }

                        
    /**
     * Returns the associated AttributeClass object.
           * If it was not retrieved before, the object is retrieved from
     * the database
           *
     * @return the associated AttributeClass object
           * @throws TorqueException
           */
    public AttributeClass getAttributeClass()
              throws TorqueException
          {
              if (aAttributeClass == null && (!ObjectUtils.equals(this.classId, null)))
        {
                    aAttributeClass = AttributeClassManager.getInstance(SimpleKey.keyFor(this.classId));
                }
              return aAttributeClass;
    }

    /**
     * Return the associated AttributeClass object
     * If it was not retrieved before, the object is retrieved from
     * the database using the passed connection
     *
     * @param connection the connection used to retrieve the associated object
     *        from the database, if it was not retrieved before
     * @return the associated AttributeClass object
     * @throws TorqueException
     */
    public AttributeClass getAttributeClass(Connection connection)
        throws TorqueException
    {
        if (aAttributeClass == null && (!ObjectUtils.equals(this.classId, null)))
        {
                    aAttributeClass = AttributeClassManager.getCachedInstance(SimpleKey.keyFor(this.classId));
            if (aAttributeClass == null)
            {
                          aAttributeClass = AttributeClassPeer.retrieveByPK(SimpleKey.keyFor(this.classId), connection);
                          AttributeClassManager.putInstance(aAttributeClass);
            }
                }
        return aAttributeClass;
    }
    
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setAttributeClassKey(ObjectKey key) throws TorqueException
    {
    
                    setClassId(new Integer(((NumberKey) key).intValue()));
              }
     
                                
            
          /**
     * Collection to store aggregation of collAttributes
     */
    protected List collAttributes;

    /**
     * Temporary storage of collAttributes to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initAttributes()
    {
        if (collAttributes == null)
        {
            collAttributes = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a Attribute object to this object
     * through the Attribute foreign key attribute
     *
     * @param l Attribute
     * @throws TorqueException
     */
    public void addAttribute(Attribute l) throws TorqueException
    {
        getAttributes().add(l);
        l.setAttributeType((AttributeType) this);
    }

    /**
     * The criteria used to select the current contents of collAttributes
     */
    private Criteria lastAttributesCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getAttributes(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getAttributes()
              throws TorqueException
          {
                      if (collAttributes == null)
        {
            collAttributes = getAttributes(new Criteria(10));
        }
                return collAttributes;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeType has previously
           * been saved, it will retrieve related Attributes from storage.
     * If this AttributeType is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getAttributes(Criteria criteria) throws TorqueException
    {
              if (collAttributes == null)
        {
            if (isNew())
            {
               collAttributes = new ArrayList();
            }
            else
            {
                        criteria.add(AttributePeer.ATTRIBUTE_TYPE_ID, getAttributeTypeId() );
                        collAttributes = AttributePeer.doSelect(criteria);
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
                            criteria.add(AttributePeer.ATTRIBUTE_TYPE_ID, getAttributeTypeId());
                            if (!lastAttributesCriteria.equals(criteria))
                {
                    collAttributes = AttributePeer.doSelect(criteria);
                }
            }
        }
        lastAttributesCriteria = criteria;

        return collAttributes;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getAttributes(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getAttributes(Connection con) throws TorqueException
    {
              if (collAttributes == null)
        {
            collAttributes = getAttributes(new Criteria(10), con);
        }
        return collAttributes;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeType has previously
           * been saved, it will retrieve related Attributes from storage.
     * If this AttributeType is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getAttributes(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collAttributes == null)
        {
            if (isNew())
            {
               collAttributes = new ArrayList();
            }
            else
            {
                         criteria.add(AttributePeer.ATTRIBUTE_TYPE_ID, getAttributeTypeId());
                         collAttributes = AttributePeer.doSelect(criteria, con);
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
                             criteria.add(AttributePeer.ATTRIBUTE_TYPE_ID, getAttributeTypeId());
                             if (!lastAttributesCriteria.equals(criteria))
                 {
                     collAttributes = AttributePeer.doSelect(criteria, con);
                 }
             }
         }
         lastAttributesCriteria = criteria;

         return collAttributes;
           }

                              
              
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeType is new, it will return
                 * an empty collection; or if this AttributeType has previously
     * been saved, it will retrieve related Attributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeType.
     */
    protected List getAttributesJoinAttributeType(Criteria criteria)
        throws TorqueException
    {
                    if (collAttributes == null)
        {
            if (isNew())
            {
               collAttributes = new ArrayList();
            }
            else
            {
                              criteria.add(AttributePeer.ATTRIBUTE_TYPE_ID, getAttributeTypeId());
                              collAttributes = AttributePeer.doSelectJoinAttributeType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttributePeer.ATTRIBUTE_TYPE_ID, getAttributeTypeId());
                                    if (!lastAttributesCriteria.equals(criteria))
            {
                collAttributes = AttributePeer.doSelectJoinAttributeType(criteria);
            }
        }
        lastAttributesCriteria = criteria;

        return collAttributes;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeType is new, it will return
                 * an empty collection; or if this AttributeType has previously
     * been saved, it will retrieve related Attributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeType.
     */
    protected List getAttributesJoinAttributeOption(Criteria criteria)
        throws TorqueException
    {
                    if (collAttributes == null)
        {
            if (isNew())
            {
               collAttributes = new ArrayList();
            }
            else
            {
                              criteria.add(AttributePeer.ATTRIBUTE_TYPE_ID, getAttributeTypeId());
                              collAttributes = AttributePeer.doSelectJoinAttributeOption(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttributePeer.ATTRIBUTE_TYPE_ID, getAttributeTypeId());
                                    if (!lastAttributesCriteria.equals(criteria))
            {
                collAttributes = AttributePeer.doSelectJoinAttributeOption(criteria);
            }
        }
        lastAttributesCriteria = criteria;

        return collAttributes;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this AttributeType is new, it will return
                 * an empty collection; or if this AttributeType has previously
     * been saved, it will retrieve related Attributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in AttributeType.
     */
    protected List getAttributesJoinScarabUserImpl(Criteria criteria)
        throws TorqueException
    {
                    if (collAttributes == null)
        {
            if (isNew())
            {
               collAttributes = new ArrayList();
            }
            else
            {
                              criteria.add(AttributePeer.ATTRIBUTE_TYPE_ID, getAttributeTypeId());
                              collAttributes = AttributePeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttributePeer.ATTRIBUTE_TYPE_ID, getAttributeTypeId());
                                    if (!lastAttributesCriteria.equals(criteria))
            {
                collAttributes = AttributePeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        lastAttributesCriteria = criteria;

        return collAttributes;
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
              fieldNames.add("AttributeTypeId");
              fieldNames.add("ClassId");
              fieldNames.add("Name");
              fieldNames.add("JavaClassName");
              fieldNames.add("ValidationKey");
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
          if (name.equals("AttributeTypeId"))
        {
                return getAttributeTypeId();
            }
          if (name.equals("ClassId"))
        {
                return getClassId();
            }
          if (name.equals("Name"))
        {
                return getName();
            }
          if (name.equals("JavaClassName"))
        {
                return getJavaClassName();
            }
          if (name.equals("ValidationKey"))
        {
                return getValidationKey();
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
          if (name.equals(AttributeTypePeer.ATTRIBUTE_TYPE_ID))
        {
                return getAttributeTypeId();
            }
          if (name.equals(AttributeTypePeer.ATTRIBUTE_CLASS_ID))
        {
                return getClassId();
            }
          if (name.equals(AttributeTypePeer.ATTRIBUTE_TYPE_NAME))
        {
                return getName();
            }
          if (name.equals(AttributeTypePeer.JAVA_CLASS_NAME))
        {
                return getJavaClassName();
            }
          if (name.equals(AttributeTypePeer.VALIDATION_KEY))
        {
                return getValidationKey();
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
                return getAttributeTypeId();
            }
              if (pos == 1)
        {
                return getClassId();
            }
              if (pos == 2)
        {
                return getName();
            }
              if (pos == 3)
        {
                return getJavaClassName();
            }
              if (pos == 4)
        {
                return getValidationKey();
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
          save(AttributeTypePeer.getMapBuilder()
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
                    AttributeTypePeer.doInsert((AttributeType) this, con);
                    setNew(false);
                }
                else
                {
                    AttributeTypePeer.doUpdate((AttributeType) this, con);
                }

    
                      if (isCacheOnSave())
                {
                    AttributeTypeManager.putInstance(this);
                }
              }

                                      
                                    if (collAttributes != null)
            {
                for (int i = 0; i < collAttributes.size(); i++)
                {
                    ((Attribute) collAttributes.get(i)).save(con);
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
     * @param key attributeTypeId ObjectKey
     */
    public void setPrimaryKey(ObjectKey key)
        throws TorqueException
    {
            setAttributeTypeId(new Integer(((NumberKey) key).intValue()));
        }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) throws TorqueException
    {
            setAttributeTypeId(new Integer(key));
        }

  
    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
          return SimpleKey.keyFor(getAttributeTypeId());
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
      public AttributeType copy() throws TorqueException
    {
        return copyInto(new AttributeType());
    }
  
    protected AttributeType copyInto(AttributeType copyObj) throws TorqueException
    {
          copyObj.setAttributeTypeId(attributeTypeId);
          copyObj.setClassId(classId);
          copyObj.setName(name);
          copyObj.setJavaClassName(javaClassName);
          copyObj.setValidationKey(validationKey);
  
                    copyObj.setAttributeTypeId((Integer)null);
                                    
                                      
                            
        List v = getAttributes();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                Attribute obj = (Attribute) v.get(i);
                copyObj.addAttribute(obj.copy());
            }
        }
        else
        {
            copyObj.collAttributes = null;
        }
                            return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public AttributeTypePeer getPeer()
    {
        return peer;
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("AttributeType:\n");
        str.append("AttributeTypeId = ")
               .append(getAttributeTypeId())
             .append("\n");
        str.append("ClassId = ")
               .append(getClassId())
             .append("\n");
        str.append("Name = ")
               .append(getName())
             .append("\n");
        str.append("JavaClassName = ")
               .append(getJavaClassName())
             .append("\n");
        str.append("ValidationKey = ")
               .append(getValidationKey())
             .append("\n");
        return(str.toString());
    }
}
