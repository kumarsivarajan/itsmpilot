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
 * extended all references should be to OptionRelationship
 */
public abstract class BaseOptionRelationship extends BaseObject
    implements org.apache.fulcrum.intake.Retrievable
{
    /** The Peer class */
    private static final OptionRelationshipPeer peer =
        new OptionRelationshipPeer();

        
    /** The value for the relationshipId field */
    private Integer relationshipId;
      
    /** The value for the name field */
    private String name;
  
            
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
    
          
                                  
                  // update associated ROptionOption
        if (collROptionOptions != null)
        {
            for (int i = 0; i < collROptionOptions.size(); i++)
            {
                ((ROptionOption) collROptionOptions.get(i))
                        .setRelationshipId(v);
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
     * Collection to store aggregation of collROptionOptions
     */
    protected List collROptionOptions;

    /**
     * Temporary storage of collROptionOptions to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initROptionOptions()
    {
        if (collROptionOptions == null)
        {
            collROptionOptions = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a ROptionOption object to this object
     * through the ROptionOption foreign key attribute
     *
     * @param l ROptionOption
     * @throws TorqueException
     */
    public void addROptionOption(ROptionOption l) throws TorqueException
    {
        getROptionOptions().add(l);
        l.setOptionRelationship((OptionRelationship) this);
    }

    /**
     * The criteria used to select the current contents of collROptionOptions
     */
    private Criteria lastROptionOptionsCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getROptionOptions(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getROptionOptions()
              throws TorqueException
          {
                      if (collROptionOptions == null)
        {
            collROptionOptions = getROptionOptions(new Criteria(10));
        }
                return collROptionOptions;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this OptionRelationship has previously
           * been saved, it will retrieve related ROptionOptions from storage.
     * If this OptionRelationship is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getROptionOptions(Criteria criteria) throws TorqueException
    {
              if (collROptionOptions == null)
        {
            if (isNew())
            {
               collROptionOptions = new ArrayList();
            }
            else
            {
                        criteria.add(ROptionOptionPeer.RELATIONSHIP_ID, getRelationshipId() );
                        collROptionOptions = ROptionOptionPeer.doSelect(criteria);
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
                            criteria.add(ROptionOptionPeer.RELATIONSHIP_ID, getRelationshipId());
                            if (!lastROptionOptionsCriteria.equals(criteria))
                {
                    collROptionOptions = ROptionOptionPeer.doSelect(criteria);
                }
            }
        }
        lastROptionOptionsCriteria = criteria;

        return collROptionOptions;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getROptionOptions(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getROptionOptions(Connection con) throws TorqueException
    {
              if (collROptionOptions == null)
        {
            collROptionOptions = getROptionOptions(new Criteria(10), con);
        }
        return collROptionOptions;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this OptionRelationship has previously
           * been saved, it will retrieve related ROptionOptions from storage.
     * If this OptionRelationship is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getROptionOptions(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collROptionOptions == null)
        {
            if (isNew())
            {
               collROptionOptions = new ArrayList();
            }
            else
            {
                         criteria.add(ROptionOptionPeer.RELATIONSHIP_ID, getRelationshipId());
                         collROptionOptions = ROptionOptionPeer.doSelect(criteria, con);
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
                             criteria.add(ROptionOptionPeer.RELATIONSHIP_ID, getRelationshipId());
                             if (!lastROptionOptionsCriteria.equals(criteria))
                 {
                     collROptionOptions = ROptionOptionPeer.doSelect(criteria, con);
                 }
             }
         }
         lastROptionOptionsCriteria = criteria;

         return collROptionOptions;
           }

                              
              
                    
                    
                                            
                                                                          
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this OptionRelationship is new, it will return
                 * an empty collection; or if this OptionRelationship has previously
     * been saved, it will retrieve related ROptionOptions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in OptionRelationship.
     */
    protected List getROptionOptionsJoinAttributeOptionRelatedByOption1Id(Criteria criteria)
        throws TorqueException
    {
                    if (collROptionOptions == null)
        {
            if (isNew())
            {
               collROptionOptions = new ArrayList();
            }
            else
            {
                              criteria.add(ROptionOptionPeer.RELATIONSHIP_ID, getRelationshipId());
                              collROptionOptions = ROptionOptionPeer.doSelectJoinAttributeOptionRelatedByOption1Id(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ROptionOptionPeer.RELATIONSHIP_ID, getRelationshipId());
                                    if (!lastROptionOptionsCriteria.equals(criteria))
            {
                collROptionOptions = ROptionOptionPeer.doSelectJoinAttributeOptionRelatedByOption1Id(criteria);
            }
        }
        lastROptionOptionsCriteria = criteria;

        return collROptionOptions;
                }
                  
                    
                    
                                            
                                                                          
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this OptionRelationship is new, it will return
                 * an empty collection; or if this OptionRelationship has previously
     * been saved, it will retrieve related ROptionOptions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in OptionRelationship.
     */
    protected List getROptionOptionsJoinAttributeOptionRelatedByOption2Id(Criteria criteria)
        throws TorqueException
    {
                    if (collROptionOptions == null)
        {
            if (isNew())
            {
               collROptionOptions = new ArrayList();
            }
            else
            {
                              criteria.add(ROptionOptionPeer.RELATIONSHIP_ID, getRelationshipId());
                              collROptionOptions = ROptionOptionPeer.doSelectJoinAttributeOptionRelatedByOption2Id(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ROptionOptionPeer.RELATIONSHIP_ID, getRelationshipId());
                                    if (!lastROptionOptionsCriteria.equals(criteria))
            {
                collROptionOptions = ROptionOptionPeer.doSelectJoinAttributeOptionRelatedByOption2Id(criteria);
            }
        }
        lastROptionOptionsCriteria = criteria;

        return collROptionOptions;
                }
                  
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this OptionRelationship is new, it will return
                 * an empty collection; or if this OptionRelationship has previously
     * been saved, it will retrieve related ROptionOptions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in OptionRelationship.
     */
    protected List getROptionOptionsJoinOptionRelationship(Criteria criteria)
        throws TorqueException
    {
                    if (collROptionOptions == null)
        {
            if (isNew())
            {
               collROptionOptions = new ArrayList();
            }
            else
            {
                              criteria.add(ROptionOptionPeer.RELATIONSHIP_ID, getRelationshipId());
                              collROptionOptions = ROptionOptionPeer.doSelectJoinOptionRelationship(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ROptionOptionPeer.RELATIONSHIP_ID, getRelationshipId());
                                    if (!lastROptionOptionsCriteria.equals(criteria))
            {
                collROptionOptions = ROptionOptionPeer.doSelectJoinOptionRelationship(criteria);
            }
        }
        lastROptionOptionsCriteria = criteria;

        return collROptionOptions;
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
              fieldNames.add("RelationshipId");
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
          if (name.equals("RelationshipId"))
        {
                return getRelationshipId();
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
          if (name.equals(OptionRelationshipPeer.RELATIONSHIP_ID))
        {
                return getRelationshipId();
            }
          if (name.equals(OptionRelationshipPeer.RELATIONSHIP_NAME))
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
                return getRelationshipId();
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
          save(OptionRelationshipPeer.getMapBuilder()
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
                    OptionRelationshipPeer.doInsert((OptionRelationship) this, con);
                    setNew(false);
                }
                else
                {
                    OptionRelationshipPeer.doUpdate((OptionRelationship) this, con);
                }

    
                      if (isCacheOnSave())
                {
                    OptionRelationshipManager.putInstance(this);
                }
              }

                                      
                                    if (collROptionOptions != null)
            {
                for (int i = 0; i < collROptionOptions.size(); i++)
                {
                    ((ROptionOption) collROptionOptions.get(i)).save(con);
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
     * @param key relationshipId ObjectKey
     */
    public void setPrimaryKey(ObjectKey key)
        throws TorqueException
    {
            setRelationshipId(new Integer(((NumberKey) key).intValue()));
        }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) throws TorqueException
    {
            setRelationshipId(new Integer(key));
        }

  
    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
          return SimpleKey.keyFor(getRelationshipId());
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
      public OptionRelationship copy() throws TorqueException
    {
        return copyInto(new OptionRelationship());
    }
  
    protected OptionRelationship copyInto(OptionRelationship copyObj) throws TorqueException
    {
          copyObj.setRelationshipId(relationshipId);
          copyObj.setName(name);
  
                    copyObj.setRelationshipId((Integer)null);
                  
                                      
                            
        List v = getROptionOptions();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                ROptionOption obj = (ROptionOption) v.get(i);
                copyObj.addROptionOption(obj.copy());
            }
        }
        else
        {
            copyObj.collROptionOptions = null;
        }
                            return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public OptionRelationshipPeer getPeer()
    {
        return peer;
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("OptionRelationship:\n");
        str.append("RelationshipId = ")
               .append(getRelationshipId())
             .append("\n");
        str.append("Name = ")
               .append(getName())
             .append("\n");
        return(str.toString());
    }
}
