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
 * extended all references should be to ActivitySetType
 */
public abstract class BaseActivitySetType extends BaseObject
    implements org.apache.fulcrum.intake.Retrievable
{
    /** The Peer class */
    private static final ActivitySetTypePeer peer =
        new ActivitySetTypePeer();

        
    /** The value for the typeId field */
    private Integer typeId;
      
    /** The value for the name field */
    private String name;
  
            
    /**
     * Get the TypeId
     *
     * @return Integer
     */
    public Integer getTypeId()
    {
        return typeId;
    }

                                              
    /**
     * Set the value of TypeId
     *
     * @param v new value
     */
    public void setTypeId(Integer v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.typeId, v))
              {
            this.typeId = v;
            setModified(true);
        }
    
          
                                  
                  // update associated ActivitySet
        if (collActivitySets != null)
        {
            for (int i = 0; i < collActivitySets.size(); i++)
            {
                ((ActivitySet) collActivitySets.get(i))
                        .setTypeId(v);
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
     * Collection to store aggregation of collActivitySets
     */
    protected List collActivitySets;

    /**
     * Temporary storage of collActivitySets to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initActivitySets()
    {
        if (collActivitySets == null)
        {
            collActivitySets = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a ActivitySet object to this object
     * through the ActivitySet foreign key attribute
     *
     * @param l ActivitySet
     * @throws TorqueException
     */
    public void addActivitySet(ActivitySet l) throws TorqueException
    {
        getActivitySets().add(l);
        l.setActivitySetType((ActivitySetType) this);
    }

    /**
     * The criteria used to select the current contents of collActivitySets
     */
    private Criteria lastActivitySetsCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getActivitySets(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getActivitySets()
              throws TorqueException
          {
                      if (collActivitySets == null)
        {
            collActivitySets = getActivitySets(new Criteria(10));
        }
                return collActivitySets;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ActivitySetType has previously
           * been saved, it will retrieve related ActivitySets from storage.
     * If this ActivitySetType is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getActivitySets(Criteria criteria) throws TorqueException
    {
              if (collActivitySets == null)
        {
            if (isNew())
            {
               collActivitySets = new ArrayList();
            }
            else
            {
                        criteria.add(ActivitySetPeer.TYPE_ID, getTypeId() );
                        collActivitySets = ActivitySetPeer.doSelect(criteria);
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
                            criteria.add(ActivitySetPeer.TYPE_ID, getTypeId());
                            if (!lastActivitySetsCriteria.equals(criteria))
                {
                    collActivitySets = ActivitySetPeer.doSelect(criteria);
                }
            }
        }
        lastActivitySetsCriteria = criteria;

        return collActivitySets;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getActivitySets(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getActivitySets(Connection con) throws TorqueException
    {
              if (collActivitySets == null)
        {
            collActivitySets = getActivitySets(new Criteria(10), con);
        }
        return collActivitySets;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ActivitySetType has previously
           * been saved, it will retrieve related ActivitySets from storage.
     * If this ActivitySetType is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getActivitySets(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collActivitySets == null)
        {
            if (isNew())
            {
               collActivitySets = new ArrayList();
            }
            else
            {
                         criteria.add(ActivitySetPeer.TYPE_ID, getTypeId());
                         collActivitySets = ActivitySetPeer.doSelect(criteria, con);
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
                             criteria.add(ActivitySetPeer.TYPE_ID, getTypeId());
                             if (!lastActivitySetsCriteria.equals(criteria))
                 {
                     collActivitySets = ActivitySetPeer.doSelect(criteria, con);
                 }
             }
         }
         lastActivitySetsCriteria = criteria;

         return collActivitySets;
           }

                              
              
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ActivitySetType is new, it will return
                 * an empty collection; or if this ActivitySetType has previously
     * been saved, it will retrieve related ActivitySets from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ActivitySetType.
     */
    protected List getActivitySetsJoinScarabUserImpl(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitySets == null)
        {
            if (isNew())
            {
               collActivitySets = new ArrayList();
            }
            else
            {
                              criteria.add(ActivitySetPeer.TYPE_ID, getTypeId());
                              collActivitySets = ActivitySetPeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivitySetPeer.TYPE_ID, getTypeId());
                                    if (!lastActivitySetsCriteria.equals(criteria))
            {
                collActivitySets = ActivitySetPeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        lastActivitySetsCriteria = criteria;

        return collActivitySets;
                }
                  
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ActivitySetType is new, it will return
                 * an empty collection; or if this ActivitySetType has previously
     * been saved, it will retrieve related ActivitySets from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ActivitySetType.
     */
    protected List getActivitySetsJoinActivitySetType(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitySets == null)
        {
            if (isNew())
            {
               collActivitySets = new ArrayList();
            }
            else
            {
                              criteria.add(ActivitySetPeer.TYPE_ID, getTypeId());
                              collActivitySets = ActivitySetPeer.doSelectJoinActivitySetType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivitySetPeer.TYPE_ID, getTypeId());
                                    if (!lastActivitySetsCriteria.equals(criteria))
            {
                collActivitySets = ActivitySetPeer.doSelectJoinActivitySetType(criteria);
            }
        }
        lastActivitySetsCriteria = criteria;

        return collActivitySets;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ActivitySetType is new, it will return
                 * an empty collection; or if this ActivitySetType has previously
     * been saved, it will retrieve related ActivitySets from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ActivitySetType.
     */
    protected List getActivitySetsJoinAttachment(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitySets == null)
        {
            if (isNew())
            {
               collActivitySets = new ArrayList();
            }
            else
            {
                              criteria.add(ActivitySetPeer.TYPE_ID, getTypeId());
                              collActivitySets = ActivitySetPeer.doSelectJoinAttachment(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivitySetPeer.TYPE_ID, getTypeId());
                                    if (!lastActivitySetsCriteria.equals(criteria))
            {
                collActivitySets = ActivitySetPeer.doSelectJoinAttachment(criteria);
            }
        }
        lastActivitySetsCriteria = criteria;

        return collActivitySets;
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
              fieldNames.add("TypeId");
              fieldNames.add("Name");
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
          if (name.equals("TypeId"))
        {
                return getTypeId();
            }
          if (name.equals("Name"))
        {
                return getName();
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
          if (name.equals(ActivitySetTypePeer.TYPE_ID))
        {
                return getTypeId();
            }
          if (name.equals(ActivitySetTypePeer.NAME))
        {
                return getName();
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
                return getTypeId();
            }
              if (pos == 1)
        {
                return getName();
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
          save(ActivitySetTypePeer.getMapBuilder()
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
                    ActivitySetTypePeer.doInsert((ActivitySetType) this, con);
                    setNew(false);
                }
                else
                {
                    ActivitySetTypePeer.doUpdate((ActivitySetType) this, con);
                }

    
                      if (isCacheOnSave())
                {
                    ActivitySetTypeManager.putInstance(this);
                }
              }

                                      
                                    if (collActivitySets != null)
            {
                for (int i = 0; i < collActivitySets.size(); i++)
                {
                    ((ActivitySet) collActivitySets.get(i)).save(con);
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
     * @param key typeId ObjectKey
     */
    public void setPrimaryKey(ObjectKey key)
        throws TorqueException
    {
            setTypeId(new Integer(((NumberKey) key).intValue()));
        }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) throws TorqueException
    {
            setTypeId(new Integer(key));
        }

  
    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
          return SimpleKey.keyFor(getTypeId());
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
      public ActivitySetType copy() throws TorqueException
    {
        return copyInto(new ActivitySetType());
    }
  
    protected ActivitySetType copyInto(ActivitySetType copyObj) throws TorqueException
    {
          copyObj.setTypeId(typeId);
          copyObj.setName(name);
  
                    copyObj.setTypeId((Integer)null);
                  
                                      
                            
        List v = getActivitySets();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                ActivitySet obj = (ActivitySet) v.get(i);
                copyObj.addActivitySet(obj.copy());
            }
        }
        else
        {
            copyObj.collActivitySets = null;
        }
                            return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public ActivitySetTypePeer getPeer()
    {
        return peer;
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("ActivitySetType:\n");
        str.append("TypeId = ")
               .append(getTypeId())
             .append("\n");
        str.append("Name = ")
               .append(getName())
             .append("\n");
        return(str.toString());
    }
}
