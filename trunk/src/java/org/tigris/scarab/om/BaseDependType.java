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
 * extended all references should be to DependType
 */
public abstract class BaseDependType extends BaseObject
    implements org.apache.fulcrum.intake.Retrievable
{
    /** The Peer class */
    private static final DependTypePeer peer =
        new DependTypePeer();

        
    /** The value for the dependTypeId field */
    private Integer dependTypeId;
      
    /** The value for the name field */
    private String name;
  
            
    /**
     * Get the DependTypeId
     *
     * @return Integer
     */
    public Integer getDependTypeId()
    {
        return dependTypeId;
    }

                                              
    /**
     * Set the value of DependTypeId
     *
     * @param v new value
     */
    public void setDependTypeId(Integer v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.dependTypeId, v))
              {
            this.dependTypeId = v;
            setModified(true);
        }
    
          
                                  
                  // update associated Depend
        if (collDepends != null)
        {
            for (int i = 0; i < collDepends.size(); i++)
            {
                ((Depend) collDepends.get(i))
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
     * Collection to store aggregation of collDepends
     */
    protected List collDepends;

    /**
     * Temporary storage of collDepends to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initDepends()
    {
        if (collDepends == null)
        {
            collDepends = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a Depend object to this object
     * through the Depend foreign key attribute
     *
     * @param l Depend
     * @throws TorqueException
     */
    public void addDepend(Depend l) throws TorqueException
    {
        getDepends().add(l);
        l.setDependType((DependType) this);
    }

    /**
     * The criteria used to select the current contents of collDepends
     */
    private Criteria lastDependsCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getDepends(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getDepends()
              throws TorqueException
          {
                      if (collDepends == null)
        {
            collDepends = getDepends(new Criteria(10));
        }
                return collDepends;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this DependType has previously
           * been saved, it will retrieve related Depends from storage.
     * If this DependType is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getDepends(Criteria criteria) throws TorqueException
    {
              if (collDepends == null)
        {
            if (isNew())
            {
               collDepends = new ArrayList();
            }
            else
            {
                        criteria.add(DependPeer.DEPEND_TYPE_ID, getDependTypeId() );
                        collDepends = DependPeer.doSelect(criteria);
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
                            criteria.add(DependPeer.DEPEND_TYPE_ID, getDependTypeId());
                            if (!lastDependsCriteria.equals(criteria))
                {
                    collDepends = DependPeer.doSelect(criteria);
                }
            }
        }
        lastDependsCriteria = criteria;

        return collDepends;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getDepends(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getDepends(Connection con) throws TorqueException
    {
              if (collDepends == null)
        {
            collDepends = getDepends(new Criteria(10), con);
        }
        return collDepends;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this DependType has previously
           * been saved, it will retrieve related Depends from storage.
     * If this DependType is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getDepends(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collDepends == null)
        {
            if (isNew())
            {
               collDepends = new ArrayList();
            }
            else
            {
                         criteria.add(DependPeer.DEPEND_TYPE_ID, getDependTypeId());
                         collDepends = DependPeer.doSelect(criteria, con);
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
                             criteria.add(DependPeer.DEPEND_TYPE_ID, getDependTypeId());
                             if (!lastDependsCriteria.equals(criteria))
                 {
                     collDepends = DependPeer.doSelect(criteria, con);
                 }
             }
         }
         lastDependsCriteria = criteria;

         return collDepends;
           }

                              
              
                    
                    
                                            
                                                                          
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this DependType is new, it will return
                 * an empty collection; or if this DependType has previously
     * been saved, it will retrieve related Depends from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in DependType.
     */
    protected List getDependsJoinIssueRelatedByObservedId(Criteria criteria)
        throws TorqueException
    {
                    if (collDepends == null)
        {
            if (isNew())
            {
               collDepends = new ArrayList();
            }
            else
            {
                              criteria.add(DependPeer.DEPEND_TYPE_ID, getDependTypeId());
                              collDepends = DependPeer.doSelectJoinIssueRelatedByObservedId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(DependPeer.DEPEND_TYPE_ID, getDependTypeId());
                                    if (!lastDependsCriteria.equals(criteria))
            {
                collDepends = DependPeer.doSelectJoinIssueRelatedByObservedId(criteria);
            }
        }
        lastDependsCriteria = criteria;

        return collDepends;
                }
                  
                    
                    
                                            
                                                                          
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this DependType is new, it will return
                 * an empty collection; or if this DependType has previously
     * been saved, it will retrieve related Depends from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in DependType.
     */
    protected List getDependsJoinIssueRelatedByObserverId(Criteria criteria)
        throws TorqueException
    {
                    if (collDepends == null)
        {
            if (isNew())
            {
               collDepends = new ArrayList();
            }
            else
            {
                              criteria.add(DependPeer.DEPEND_TYPE_ID, getDependTypeId());
                              collDepends = DependPeer.doSelectJoinIssueRelatedByObserverId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(DependPeer.DEPEND_TYPE_ID, getDependTypeId());
                                    if (!lastDependsCriteria.equals(criteria))
            {
                collDepends = DependPeer.doSelectJoinIssueRelatedByObserverId(criteria);
            }
        }
        lastDependsCriteria = criteria;

        return collDepends;
                }
                  
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this DependType is new, it will return
                 * an empty collection; or if this DependType has previously
     * been saved, it will retrieve related Depends from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in DependType.
     */
    protected List getDependsJoinDependType(Criteria criteria)
        throws TorqueException
    {
                    if (collDepends == null)
        {
            if (isNew())
            {
               collDepends = new ArrayList();
            }
            else
            {
                              criteria.add(DependPeer.DEPEND_TYPE_ID, getDependTypeId());
                              collDepends = DependPeer.doSelectJoinDependType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(DependPeer.DEPEND_TYPE_ID, getDependTypeId());
                                    if (!lastDependsCriteria.equals(criteria))
            {
                collDepends = DependPeer.doSelectJoinDependType(criteria);
            }
        }
        lastDependsCriteria = criteria;

        return collDepends;
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
              fieldNames.add("DependTypeId");
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
          if (name.equals("DependTypeId"))
        {
                return getDependTypeId();
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
          if (name.equals(DependTypePeer.DEPEND_TYPE_ID))
        {
                return getDependTypeId();
            }
          if (name.equals(DependTypePeer.DEPEND_TYPE_NAME))
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
                return getDependTypeId();
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
          save(DependTypePeer.getMapBuilder()
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
                    DependTypePeer.doInsert((DependType) this, con);
                    setNew(false);
                }
                else
                {
                    DependTypePeer.doUpdate((DependType) this, con);
                }

    
                      if (isCacheOnSave())
                {
                    DependTypeManager.putInstance(this);
                }
              }

                                      
                                    if (collDepends != null)
            {
                for (int i = 0; i < collDepends.size(); i++)
                {
                    ((Depend) collDepends.get(i)).save(con);
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
     * @param key dependTypeId ObjectKey
     */
    public void setPrimaryKey(ObjectKey key)
        throws TorqueException
    {
            setDependTypeId(new Integer(((NumberKey) key).intValue()));
        }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) throws TorqueException
    {
            setDependTypeId(new Integer(key));
        }

  
    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
          return SimpleKey.keyFor(getDependTypeId());
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
      public DependType copy() throws TorqueException
    {
        return copyInto(new DependType());
    }
  
    protected DependType copyInto(DependType copyObj) throws TorqueException
    {
          copyObj.setDependTypeId(dependTypeId);
          copyObj.setName(name);
  
                    copyObj.setDependTypeId((Integer)null);
                  
                                      
                            
        List v = getDepends();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                Depend obj = (Depend) v.get(i);
                copyObj.addDepend(obj.copy());
            }
        }
        else
        {
            copyObj.collDepends = null;
        }
                            return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public DependTypePeer getPeer()
    {
        return peer;
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("DependType:\n");
        str.append("DependTypeId = ")
               .append(getDependTypeId())
             .append("\n");
        str.append("Name = ")
               .append(getName())
             .append("\n");
        return(str.toString());
    }
}
