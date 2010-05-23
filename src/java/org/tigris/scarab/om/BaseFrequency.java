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
 * extended all references should be to Frequency
 */
public abstract class BaseFrequency extends BaseObject
    implements org.apache.fulcrum.intake.Retrievable
{
    /** The Peer class */
    private static final FrequencyPeer peer =
        new FrequencyPeer();

        
    /** The value for the frequencyId field */
    private Integer frequencyId;
      
    /** The value for the name field */
    private String name;
  
            
    /**
     * Get the FrequencyId
     *
     * @return Integer
     */
    public Integer getFrequencyId()
    {
        return frequencyId;
    }

                                              
    /**
     * Set the value of FrequencyId
     *
     * @param v new value
     */
    public void setFrequencyId(Integer v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.frequencyId, v))
              {
            this.frequencyId = v;
            setModified(true);
        }
    
          
                                  
                  // update associated Query
        if (collQuerys != null)
        {
            for (int i = 0; i < collQuerys.size(); i++)
            {
                ((Query) collQuerys.get(i))
                        .setSubscriptionFrequencyId(v);
            }
        }
                                                    
                  // update associated RQueryUser
        if (collRQueryUsers != null)
        {
            for (int i = 0; i < collRQueryUsers.size(); i++)
            {
                ((RQueryUser) collRQueryUsers.get(i))
                        .setSubscriptionFrequency(v);
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
     * Collection to store aggregation of collQuerys
     */
    protected List collQuerys;

    /**
     * Temporary storage of collQuerys to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initQuerys()
    {
        if (collQuerys == null)
        {
            collQuerys = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a Query object to this object
     * through the Query foreign key attribute
     *
     * @param l Query
     * @throws TorqueException
     */
    public void addQuery(Query l) throws TorqueException
    {
        getQuerys().add(l);
        l.setFrequency((Frequency) this);
    }

    /**
     * The criteria used to select the current contents of collQuerys
     */
    private Criteria lastQuerysCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getQuerys(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getQuerys()
              throws TorqueException
          {
                      if (collQuerys == null)
        {
            collQuerys = getQuerys(new Criteria(10));
        }
                return collQuerys;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Frequency has previously
           * been saved, it will retrieve related Querys from storage.
     * If this Frequency is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getQuerys(Criteria criteria) throws TorqueException
    {
              if (collQuerys == null)
        {
            if (isNew())
            {
               collQuerys = new ArrayList();
            }
            else
            {
                        criteria.add(QueryPeer.SUBSCRIPTION_FREQUENCY_ID, getFrequencyId() );
                        collQuerys = QueryPeer.doSelect(criteria);
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
                            criteria.add(QueryPeer.SUBSCRIPTION_FREQUENCY_ID, getFrequencyId());
                            if (!lastQuerysCriteria.equals(criteria))
                {
                    collQuerys = QueryPeer.doSelect(criteria);
                }
            }
        }
        lastQuerysCriteria = criteria;

        return collQuerys;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getQuerys(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getQuerys(Connection con) throws TorqueException
    {
              if (collQuerys == null)
        {
            collQuerys = getQuerys(new Criteria(10), con);
        }
        return collQuerys;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Frequency has previously
           * been saved, it will retrieve related Querys from storage.
     * If this Frequency is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getQuerys(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collQuerys == null)
        {
            if (isNew())
            {
               collQuerys = new ArrayList();
            }
            else
            {
                         criteria.add(QueryPeer.SUBSCRIPTION_FREQUENCY_ID, getFrequencyId());
                         collQuerys = QueryPeer.doSelect(criteria, con);
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
                             criteria.add(QueryPeer.SUBSCRIPTION_FREQUENCY_ID, getFrequencyId());
                             if (!lastQuerysCriteria.equals(criteria))
                 {
                     collQuerys = QueryPeer.doSelect(criteria, con);
                 }
             }
         }
         lastQuerysCriteria = criteria;

         return collQuerys;
           }

                                                
              
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Frequency is new, it will return
                 * an empty collection; or if this Frequency has previously
     * been saved, it will retrieve related Querys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Frequency.
     */
    protected List getQuerysJoinScarabUserImpl(Criteria criteria)
        throws TorqueException
    {
                    if (collQuerys == null)
        {
            if (isNew())
            {
               collQuerys = new ArrayList();
            }
            else
            {
                              criteria.add(QueryPeer.SUBSCRIPTION_FREQUENCY_ID, getFrequencyId());
                              collQuerys = QueryPeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(QueryPeer.SUBSCRIPTION_FREQUENCY_ID, getFrequencyId());
                                    if (!lastQuerysCriteria.equals(criteria))
            {
                collQuerys = QueryPeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        lastQuerysCriteria = criteria;

        return collQuerys;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Frequency is new, it will return
                 * an empty collection; or if this Frequency has previously
     * been saved, it will retrieve related Querys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Frequency.
     */
    protected List getQuerysJoinScope(Criteria criteria)
        throws TorqueException
    {
                    if (collQuerys == null)
        {
            if (isNew())
            {
               collQuerys = new ArrayList();
            }
            else
            {
                              criteria.add(QueryPeer.SUBSCRIPTION_FREQUENCY_ID, getFrequencyId());
                              collQuerys = QueryPeer.doSelectJoinScope(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(QueryPeer.SUBSCRIPTION_FREQUENCY_ID, getFrequencyId());
                                    if (!lastQuerysCriteria.equals(criteria))
            {
                collQuerys = QueryPeer.doSelectJoinScope(criteria);
            }
        }
        lastQuerysCriteria = criteria;

        return collQuerys;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Frequency is new, it will return
                 * an empty collection; or if this Frequency has previously
     * been saved, it will retrieve related Querys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Frequency.
     */
    protected List getQuerysJoinScarabModule(Criteria criteria)
        throws TorqueException
    {
                    if (collQuerys == null)
        {
            if (isNew())
            {
               collQuerys = new ArrayList();
            }
            else
            {
                              criteria.add(QueryPeer.SUBSCRIPTION_FREQUENCY_ID, getFrequencyId());
                              collQuerys = QueryPeer.doSelectJoinScarabModule(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(QueryPeer.SUBSCRIPTION_FREQUENCY_ID, getFrequencyId());
                                    if (!lastQuerysCriteria.equals(criteria))
            {
                collQuerys = QueryPeer.doSelectJoinScarabModule(criteria);
            }
        }
        lastQuerysCriteria = criteria;

        return collQuerys;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Frequency is new, it will return
                 * an empty collection; or if this Frequency has previously
     * been saved, it will retrieve related Querys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Frequency.
     */
    protected List getQuerysJoinIssueType(Criteria criteria)
        throws TorqueException
    {
                    if (collQuerys == null)
        {
            if (isNew())
            {
               collQuerys = new ArrayList();
            }
            else
            {
                              criteria.add(QueryPeer.SUBSCRIPTION_FREQUENCY_ID, getFrequencyId());
                              collQuerys = QueryPeer.doSelectJoinIssueType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(QueryPeer.SUBSCRIPTION_FREQUENCY_ID, getFrequencyId());
                                    if (!lastQuerysCriteria.equals(criteria))
            {
                collQuerys = QueryPeer.doSelectJoinIssueType(criteria);
            }
        }
        lastQuerysCriteria = criteria;

        return collQuerys;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Frequency is new, it will return
                 * an empty collection; or if this Frequency has previously
     * been saved, it will retrieve related Querys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Frequency.
     */
    protected List getQuerysJoinMITList(Criteria criteria)
        throws TorqueException
    {
                    if (collQuerys == null)
        {
            if (isNew())
            {
               collQuerys = new ArrayList();
            }
            else
            {
                              criteria.add(QueryPeer.SUBSCRIPTION_FREQUENCY_ID, getFrequencyId());
                              collQuerys = QueryPeer.doSelectJoinMITList(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(QueryPeer.SUBSCRIPTION_FREQUENCY_ID, getFrequencyId());
                                    if (!lastQuerysCriteria.equals(criteria))
            {
                collQuerys = QueryPeer.doSelectJoinMITList(criteria);
            }
        }
        lastQuerysCriteria = criteria;

        return collQuerys;
                }
                  
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Frequency is new, it will return
                 * an empty collection; or if this Frequency has previously
     * been saved, it will retrieve related Querys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Frequency.
     */
    protected List getQuerysJoinFrequency(Criteria criteria)
        throws TorqueException
    {
                    if (collQuerys == null)
        {
            if (isNew())
            {
               collQuerys = new ArrayList();
            }
            else
            {
                              criteria.add(QueryPeer.SUBSCRIPTION_FREQUENCY_ID, getFrequencyId());
                              collQuerys = QueryPeer.doSelectJoinFrequency(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(QueryPeer.SUBSCRIPTION_FREQUENCY_ID, getFrequencyId());
                                    if (!lastQuerysCriteria.equals(criteria))
            {
                collQuerys = QueryPeer.doSelectJoinFrequency(criteria);
            }
        }
        lastQuerysCriteria = criteria;

        return collQuerys;
                }
                            


                          
            
          /**
     * Collection to store aggregation of collRQueryUsers
     */
    protected List collRQueryUsers;

    /**
     * Temporary storage of collRQueryUsers to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initRQueryUsers()
    {
        if (collRQueryUsers == null)
        {
            collRQueryUsers = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a RQueryUser object to this object
     * through the RQueryUser foreign key attribute
     *
     * @param l RQueryUser
     * @throws TorqueException
     */
    public void addRQueryUser(RQueryUser l) throws TorqueException
    {
        getRQueryUsers().add(l);
        l.setFrequency((Frequency) this);
    }

    /**
     * The criteria used to select the current contents of collRQueryUsers
     */
    private Criteria lastRQueryUsersCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getRQueryUsers(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getRQueryUsers()
              throws TorqueException
          {
                      if (collRQueryUsers == null)
        {
            collRQueryUsers = getRQueryUsers(new Criteria(10));
        }
                return collRQueryUsers;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Frequency has previously
           * been saved, it will retrieve related RQueryUsers from storage.
     * If this Frequency is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getRQueryUsers(Criteria criteria) throws TorqueException
    {
              if (collRQueryUsers == null)
        {
            if (isNew())
            {
               collRQueryUsers = new ArrayList();
            }
            else
            {
                        criteria.add(RQueryUserPeer.SUBSCRIPTION_FREQUENCY_ID, getFrequencyId() );
                        collRQueryUsers = RQueryUserPeer.doSelect(criteria);
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
                            criteria.add(RQueryUserPeer.SUBSCRIPTION_FREQUENCY_ID, getFrequencyId());
                            if (!lastRQueryUsersCriteria.equals(criteria))
                {
                    collRQueryUsers = RQueryUserPeer.doSelect(criteria);
                }
            }
        }
        lastRQueryUsersCriteria = criteria;

        return collRQueryUsers;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getRQueryUsers(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getRQueryUsers(Connection con) throws TorqueException
    {
              if (collRQueryUsers == null)
        {
            collRQueryUsers = getRQueryUsers(new Criteria(10), con);
        }
        return collRQueryUsers;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Frequency has previously
           * been saved, it will retrieve related RQueryUsers from storage.
     * If this Frequency is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getRQueryUsers(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collRQueryUsers == null)
        {
            if (isNew())
            {
               collRQueryUsers = new ArrayList();
            }
            else
            {
                         criteria.add(RQueryUserPeer.SUBSCRIPTION_FREQUENCY_ID, getFrequencyId());
                         collRQueryUsers = RQueryUserPeer.doSelect(criteria, con);
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
                             criteria.add(RQueryUserPeer.SUBSCRIPTION_FREQUENCY_ID, getFrequencyId());
                             if (!lastRQueryUsersCriteria.equals(criteria))
                 {
                     collRQueryUsers = RQueryUserPeer.doSelect(criteria, con);
                 }
             }
         }
         lastRQueryUsersCriteria = criteria;

         return collRQueryUsers;
           }

                              
              
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Frequency is new, it will return
                 * an empty collection; or if this Frequency has previously
     * been saved, it will retrieve related RQueryUsers from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Frequency.
     */
    protected List getRQueryUsersJoinQuery(Criteria criteria)
        throws TorqueException
    {
                    if (collRQueryUsers == null)
        {
            if (isNew())
            {
               collRQueryUsers = new ArrayList();
            }
            else
            {
                              criteria.add(RQueryUserPeer.SUBSCRIPTION_FREQUENCY_ID, getFrequencyId());
                              collRQueryUsers = RQueryUserPeer.doSelectJoinQuery(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RQueryUserPeer.SUBSCRIPTION_FREQUENCY_ID, getFrequencyId());
                                    if (!lastRQueryUsersCriteria.equals(criteria))
            {
                collRQueryUsers = RQueryUserPeer.doSelectJoinQuery(criteria);
            }
        }
        lastRQueryUsersCriteria = criteria;

        return collRQueryUsers;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Frequency is new, it will return
                 * an empty collection; or if this Frequency has previously
     * been saved, it will retrieve related RQueryUsers from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Frequency.
     */
    protected List getRQueryUsersJoinScarabUserImpl(Criteria criteria)
        throws TorqueException
    {
                    if (collRQueryUsers == null)
        {
            if (isNew())
            {
               collRQueryUsers = new ArrayList();
            }
            else
            {
                              criteria.add(RQueryUserPeer.SUBSCRIPTION_FREQUENCY_ID, getFrequencyId());
                              collRQueryUsers = RQueryUserPeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RQueryUserPeer.SUBSCRIPTION_FREQUENCY_ID, getFrequencyId());
                                    if (!lastRQueryUsersCriteria.equals(criteria))
            {
                collRQueryUsers = RQueryUserPeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        lastRQueryUsersCriteria = criteria;

        return collRQueryUsers;
                }
                  
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Frequency is new, it will return
                 * an empty collection; or if this Frequency has previously
     * been saved, it will retrieve related RQueryUsers from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Frequency.
     */
    protected List getRQueryUsersJoinFrequency(Criteria criteria)
        throws TorqueException
    {
                    if (collRQueryUsers == null)
        {
            if (isNew())
            {
               collRQueryUsers = new ArrayList();
            }
            else
            {
                              criteria.add(RQueryUserPeer.SUBSCRIPTION_FREQUENCY_ID, getFrequencyId());
                              collRQueryUsers = RQueryUserPeer.doSelectJoinFrequency(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RQueryUserPeer.SUBSCRIPTION_FREQUENCY_ID, getFrequencyId());
                                    if (!lastRQueryUsersCriteria.equals(criteria))
            {
                collRQueryUsers = RQueryUserPeer.doSelectJoinFrequency(criteria);
            }
        }
        lastRQueryUsersCriteria = criteria;

        return collRQueryUsers;
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
              fieldNames.add("FrequencyId");
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
          if (name.equals("FrequencyId"))
        {
                return getFrequencyId();
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
          if (name.equals(FrequencyPeer.FREQUENCY_ID))
        {
                return getFrequencyId();
            }
          if (name.equals(FrequencyPeer.FREQUENCY_NAME))
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
                return getFrequencyId();
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
          save(FrequencyPeer.getMapBuilder()
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
                    FrequencyPeer.doInsert((Frequency) this, con);
                    setNew(false);
                }
                else
                {
                    FrequencyPeer.doUpdate((Frequency) this, con);
                }

    
                      if (isCacheOnSave())
                {
                    FrequencyManager.putInstance(this);
                }
              }

                                      
                                    if (collQuerys != null)
            {
                for (int i = 0; i < collQuerys.size(); i++)
                {
                    ((Query) collQuerys.get(i)).save(con);
                }
            }
                                                  
                                    if (collRQueryUsers != null)
            {
                for (int i = 0; i < collRQueryUsers.size(); i++)
                {
                    ((RQueryUser) collRQueryUsers.get(i)).save(con);
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
     * @param key frequencyId ObjectKey
     */
    public void setPrimaryKey(ObjectKey key)
        throws TorqueException
    {
            setFrequencyId(new Integer(((NumberKey) key).intValue()));
        }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) throws TorqueException
    {
            setFrequencyId(new Integer(key));
        }

  
    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
          return SimpleKey.keyFor(getFrequencyId());
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
      public Frequency copy() throws TorqueException
    {
        return copyInto(new Frequency());
    }
  
    protected Frequency copyInto(Frequency copyObj) throws TorqueException
    {
          copyObj.setFrequencyId(frequencyId);
          copyObj.setName(name);
  
                    copyObj.setFrequencyId((Integer)null);
                  
                                      
                            
        List v = getQuerys();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                Query obj = (Query) v.get(i);
                copyObj.addQuery(obj.copy());
            }
        }
        else
        {
            copyObj.collQuerys = null;
        }
                                                  
                            
        v = getRQueryUsers();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                RQueryUser obj = (RQueryUser) v.get(i);
                copyObj.addRQueryUser(obj.copy());
            }
        }
        else
        {
            copyObj.collRQueryUsers = null;
        }
                            return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public FrequencyPeer getPeer()
    {
        return peer;
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("Frequency:\n");
        str.append("FrequencyId = ")
               .append(getFrequencyId())
             .append("\n");
        str.append("Name = ")
               .append(getName())
             .append("\n");
        return(str.toString());
    }
}
