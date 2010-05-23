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
 * extended all references should be to ScarabRoleImpl
 */
public abstract class BaseScarabRoleImpl extends org.apache.fulcrum.security.impl.db.entity.TurbineRole
    implements org.apache.fulcrum.intake.Retrievable
{
    /** The Peer class */
    private static final ScarabRoleImplPeer peer =
        new ScarabRoleImplPeer();


         
                                
            
          /**
     * Collection to store aggregation of collNotificationDefaultFilters
     */
    protected List collNotificationDefaultFilters;

    /**
     * Temporary storage of collNotificationDefaultFilters to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initNotificationDefaultFilters()
    {
        if (collNotificationDefaultFilters == null)
        {
            collNotificationDefaultFilters = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a NotificationDefaultFilter object to this object
     * through the NotificationDefaultFilter foreign key attribute
     *
     * @param l NotificationDefaultFilter
     * @throws TorqueException
     */
    public void addNotificationDefaultFilter(NotificationDefaultFilter l) throws TorqueException
    {
        getNotificationDefaultFilters().add(l);
        l.setScarabRoleImpl((ScarabRoleImpl) this);
    }

    /**
     * The criteria used to select the current contents of collNotificationDefaultFilters
     */
    private Criteria lastNotificationDefaultFiltersCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getNotificationDefaultFilters(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getNotificationDefaultFilters()
              throws TorqueException
          {
                      if (collNotificationDefaultFilters == null)
        {
            collNotificationDefaultFilters = getNotificationDefaultFilters(new Criteria(10));
        }
                return collNotificationDefaultFilters;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabRoleImpl has previously
           * been saved, it will retrieve related NotificationDefaultFilters from storage.
     * If this ScarabRoleImpl is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getNotificationDefaultFilters(Criteria criteria) throws TorqueException
    {
              if (collNotificationDefaultFilters == null)
        {
            if (isNew())
            {
               collNotificationDefaultFilters = new ArrayList();
            }
            else
            {
                        criteria.add(NotificationDefaultFilterPeer.ROLE_ID, getRoleId() );
                        collNotificationDefaultFilters = NotificationDefaultFilterPeer.doSelect(criteria);
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
                            criteria.add(NotificationDefaultFilterPeer.ROLE_ID, getRoleId());
                            if (!lastNotificationDefaultFiltersCriteria.equals(criteria))
                {
                    collNotificationDefaultFilters = NotificationDefaultFilterPeer.doSelect(criteria);
                }
            }
        }
        lastNotificationDefaultFiltersCriteria = criteria;

        return collNotificationDefaultFilters;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getNotificationDefaultFilters(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getNotificationDefaultFilters(Connection con) throws TorqueException
    {
              if (collNotificationDefaultFilters == null)
        {
            collNotificationDefaultFilters = getNotificationDefaultFilters(new Criteria(10), con);
        }
        return collNotificationDefaultFilters;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabRoleImpl has previously
           * been saved, it will retrieve related NotificationDefaultFilters from storage.
     * If this ScarabRoleImpl is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getNotificationDefaultFilters(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collNotificationDefaultFilters == null)
        {
            if (isNew())
            {
               collNotificationDefaultFilters = new ArrayList();
            }
            else
            {
                         criteria.add(NotificationDefaultFilterPeer.ROLE_ID, getRoleId());
                         collNotificationDefaultFilters = NotificationDefaultFilterPeer.doSelect(criteria, con);
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
                             criteria.add(NotificationDefaultFilterPeer.ROLE_ID, getRoleId());
                             if (!lastNotificationDefaultFiltersCriteria.equals(criteria))
                 {
                     collNotificationDefaultFilters = NotificationDefaultFilterPeer.doSelect(criteria, con);
                 }
             }
         }
         lastNotificationDefaultFiltersCriteria = criteria;

         return collNotificationDefaultFilters;
           }

                        
              
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabRoleImpl is new, it will return
                 * an empty collection; or if this ScarabRoleImpl has previously
     * been saved, it will retrieve related NotificationDefaultFilters from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabRoleImpl.
     */
    protected List getNotificationDefaultFiltersJoinScarabRoleImpl(Criteria criteria)
        throws TorqueException
    {
                    if (collNotificationDefaultFilters == null)
        {
            if (isNew())
            {
               collNotificationDefaultFilters = new ArrayList();
            }
            else
            {
                              criteria.add(NotificationDefaultFilterPeer.ROLE_ID, getRoleId());
                              collNotificationDefaultFilters = NotificationDefaultFilterPeer.doSelectJoinScarabRoleImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(NotificationDefaultFilterPeer.ROLE_ID, getRoleId());
                                    if (!lastNotificationDefaultFiltersCriteria.equals(criteria))
            {
                collNotificationDefaultFilters = NotificationDefaultFilterPeer.doSelectJoinScarabRoleImpl(criteria);
            }
        }
        lastNotificationDefaultFiltersCriteria = criteria;

        return collNotificationDefaultFilters;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabRoleImpl is new, it will return
                 * an empty collection; or if this ScarabRoleImpl has previously
     * been saved, it will retrieve related NotificationDefaultFilters from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabRoleImpl.
     */
    protected List getNotificationDefaultFiltersJoinScarabModule(Criteria criteria)
        throws TorqueException
    {
                    if (collNotificationDefaultFilters == null)
        {
            if (isNew())
            {
               collNotificationDefaultFilters = new ArrayList();
            }
            else
            {
                              criteria.add(NotificationDefaultFilterPeer.ROLE_ID, getRoleId());
                              collNotificationDefaultFilters = NotificationDefaultFilterPeer.doSelectJoinScarabModule(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(NotificationDefaultFilterPeer.ROLE_ID, getRoleId());
                                    if (!lastNotificationDefaultFiltersCriteria.equals(criteria))
            {
                collNotificationDefaultFilters = NotificationDefaultFilterPeer.doSelectJoinScarabModule(criteria);
            }
        }
        lastNotificationDefaultFiltersCriteria = criteria;

        return collNotificationDefaultFilters;
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
              try
        {
          setPrimaryKey(key);
          }
        catch (Exception e)
        {
            throw new TorqueException("Unable to set query key", e);
        }
      }




    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("ScarabRoleImpl:\n");
        str.append("RoleId = ")
               .append(getRoleId())
             .append("\n");
        return(str.toString());
    }
}
