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
 * extended all references should be to ScarabUserImpl
 */
public abstract class BaseScarabUserImpl extends org.apache.fulcrum.security.impl.db.entity.TurbineUser
    implements org.apache.fulcrum.intake.Retrievable
{
    /** The Peer class */
    private static final ScarabUserImplPeer peer =
        new ScarabUserImplPeer();


         
                                        
            
          /**
     * Collection to store aggregation of collActivitysRelatedByOldUserId
     */
    protected List collActivitysRelatedByOldUserId;

    /**
     * Temporary storage of collActivitysRelatedByOldUserId to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initActivitysRelatedByOldUserId()
    {
        if (collActivitysRelatedByOldUserId == null)
        {
            collActivitysRelatedByOldUserId = new ArrayList();
        }
    }

                        
    /**
     * Method called to associate a Activity object to this object
     * through the Activity foreign key attribute
     *
     * @param l Activity
     * @throws TorqueException
     */
    public void addActivityRelatedByOldUserId(Activity l) throws TorqueException
    {
        getActivitysRelatedByOldUserId().add(l);
        l.setScarabUserRelatedByOldUserId((ScarabUserImpl) this);
    }

    /**
     * The criteria used to select the current contents of collActivitysRelatedByOldUserId
     */
    private Criteria lastActivitysRelatedByOldUserIdCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getActivitysRelatedByOldUserId(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getActivitysRelatedByOldUserId()
              throws TorqueException
          {
                      if (collActivitysRelatedByOldUserId == null)
        {
            collActivitysRelatedByOldUserId = getActivitysRelatedByOldUserId(new Criteria(10));
        }
                return collActivitysRelatedByOldUserId;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related ActivitysRelatedByOldUserId from storage.
     * If this ScarabUserImpl is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getActivitysRelatedByOldUserId(Criteria criteria) throws TorqueException
    {
              if (collActivitysRelatedByOldUserId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByOldUserId = new ArrayList();
            }
            else
            {
                        criteria.add(ActivityPeer.OLD_USER_ID, getUserId() );
                        collActivitysRelatedByOldUserId = ActivityPeer.doSelect(criteria);
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
                            criteria.add(ActivityPeer.OLD_USER_ID, getUserId());
                            if (!lastActivitysRelatedByOldUserIdCriteria.equals(criteria))
                {
                    collActivitysRelatedByOldUserId = ActivityPeer.doSelect(criteria);
                }
            }
        }
        lastActivitysRelatedByOldUserIdCriteria = criteria;

        return collActivitysRelatedByOldUserId;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getActivitysRelatedByOldUserId(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getActivitysRelatedByOldUserId(Connection con) throws TorqueException
    {
              if (collActivitysRelatedByOldUserId == null)
        {
            collActivitysRelatedByOldUserId = getActivitysRelatedByOldUserId(new Criteria(10), con);
        }
        return collActivitysRelatedByOldUserId;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related ActivitysRelatedByOldUserId from storage.
     * If this ScarabUserImpl is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getActivitysRelatedByOldUserId(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collActivitysRelatedByOldUserId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByOldUserId = new ArrayList();
            }
            else
            {
                         criteria.add(ActivityPeer.OLD_USER_ID, getUserId());
                         collActivitysRelatedByOldUserId = ActivityPeer.doSelect(criteria, con);
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
                             criteria.add(ActivityPeer.OLD_USER_ID, getUserId());
                             if (!lastActivitysRelatedByOldUserIdCriteria.equals(criteria))
                 {
                     collActivitysRelatedByOldUserId = ActivityPeer.doSelect(criteria, con);
                 }
             }
         }
         lastActivitysRelatedByOldUserIdCriteria = criteria;

         return collActivitysRelatedByOldUserId;
           }

                                                                  
              
                    
                    
                                
                                                              
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related ActivitysRelatedByOldUserId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getActivitysRelatedByOldUserIdJoinIssue(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitysRelatedByOldUserId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByOldUserId = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.OLD_USER_ID, getUserId());
                              collActivitysRelatedByOldUserId = ActivityPeer.doSelectJoinIssue(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.OLD_USER_ID, getUserId());
                                    if (!lastActivitysRelatedByOldUserIdCriteria.equals(criteria))
            {
                collActivitysRelatedByOldUserId = ActivityPeer.doSelectJoinIssue(criteria);
            }
        }
        lastActivitysRelatedByOldUserIdCriteria = criteria;

        return collActivitysRelatedByOldUserId;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related ActivitysRelatedByOldUserId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getActivitysRelatedByOldUserIdJoinAttribute(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitysRelatedByOldUserId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByOldUserId = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.OLD_USER_ID, getUserId());
                              collActivitysRelatedByOldUserId = ActivityPeer.doSelectJoinAttribute(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.OLD_USER_ID, getUserId());
                                    if (!lastActivitysRelatedByOldUserIdCriteria.equals(criteria))
            {
                collActivitysRelatedByOldUserId = ActivityPeer.doSelectJoinAttribute(criteria);
            }
        }
        lastActivitysRelatedByOldUserIdCriteria = criteria;

        return collActivitysRelatedByOldUserId;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related ActivitysRelatedByOldUserId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getActivitysRelatedByOldUserIdJoinActivitySet(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitysRelatedByOldUserId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByOldUserId = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.OLD_USER_ID, getUserId());
                              collActivitysRelatedByOldUserId = ActivityPeer.doSelectJoinActivitySet(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.OLD_USER_ID, getUserId());
                                    if (!lastActivitysRelatedByOldUserIdCriteria.equals(criteria))
            {
                collActivitysRelatedByOldUserId = ActivityPeer.doSelectJoinActivitySet(criteria);
            }
        }
        lastActivitysRelatedByOldUserIdCriteria = criteria;

        return collActivitysRelatedByOldUserId;
                }
                  
                    
                              
                                            
                                                                          
                                        
                    
                                            
                  
                    
                              
                                            
                                                                          
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related ActivitysRelatedByOldUserId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getActivitysRelatedByOldUserIdJoinScarabUserImplRelatedByNewUserId(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitysRelatedByOldUserId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByOldUserId = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.OLD_USER_ID, getUserId());
                              collActivitysRelatedByOldUserId = ActivityPeer.doSelectJoinScarabUserImplRelatedByNewUserId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.OLD_USER_ID, getUserId());
                                    if (!lastActivitysRelatedByOldUserIdCriteria.equals(criteria))
            {
                collActivitysRelatedByOldUserId = ActivityPeer.doSelectJoinScarabUserImplRelatedByNewUserId(criteria);
            }
        }
        lastActivitysRelatedByOldUserIdCriteria = criteria;

        return collActivitysRelatedByOldUserId;
                }
                  
                    
                    
                                            
                                                                          
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related ActivitysRelatedByOldUserId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getActivitysRelatedByOldUserIdJoinAttributeOptionRelatedByOldOptionId(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitysRelatedByOldUserId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByOldUserId = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.OLD_USER_ID, getUserId());
                              collActivitysRelatedByOldUserId = ActivityPeer.doSelectJoinAttributeOptionRelatedByOldOptionId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.OLD_USER_ID, getUserId());
                                    if (!lastActivitysRelatedByOldUserIdCriteria.equals(criteria))
            {
                collActivitysRelatedByOldUserId = ActivityPeer.doSelectJoinAttributeOptionRelatedByOldOptionId(criteria);
            }
        }
        lastActivitysRelatedByOldUserIdCriteria = criteria;

        return collActivitysRelatedByOldUserId;
                }
                  
                    
                    
                                            
                                                                          
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related ActivitysRelatedByOldUserId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getActivitysRelatedByOldUserIdJoinAttributeOptionRelatedByNewOptionId(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitysRelatedByOldUserId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByOldUserId = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.OLD_USER_ID, getUserId());
                              collActivitysRelatedByOldUserId = ActivityPeer.doSelectJoinAttributeOptionRelatedByNewOptionId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.OLD_USER_ID, getUserId());
                                    if (!lastActivitysRelatedByOldUserIdCriteria.equals(criteria))
            {
                collActivitysRelatedByOldUserId = ActivityPeer.doSelectJoinAttributeOptionRelatedByNewOptionId(criteria);
            }
        }
        lastActivitysRelatedByOldUserIdCriteria = criteria;

        return collActivitysRelatedByOldUserId;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related ActivitysRelatedByOldUserId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getActivitysRelatedByOldUserIdJoinAttachment(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitysRelatedByOldUserId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByOldUserId = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.OLD_USER_ID, getUserId());
                              collActivitysRelatedByOldUserId = ActivityPeer.doSelectJoinAttachment(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.OLD_USER_ID, getUserId());
                                    if (!lastActivitysRelatedByOldUserIdCriteria.equals(criteria))
            {
                collActivitysRelatedByOldUserId = ActivityPeer.doSelectJoinAttachment(criteria);
            }
        }
        lastActivitysRelatedByOldUserIdCriteria = criteria;

        return collActivitysRelatedByOldUserId;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related ActivitysRelatedByOldUserId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getActivitysRelatedByOldUserIdJoinDepend(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitysRelatedByOldUserId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByOldUserId = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.OLD_USER_ID, getUserId());
                              collActivitysRelatedByOldUserId = ActivityPeer.doSelectJoinDepend(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.OLD_USER_ID, getUserId());
                                    if (!lastActivitysRelatedByOldUserIdCriteria.equals(criteria))
            {
                collActivitysRelatedByOldUserId = ActivityPeer.doSelectJoinDepend(criteria);
            }
        }
        lastActivitysRelatedByOldUserIdCriteria = criteria;

        return collActivitysRelatedByOldUserId;
                }
                            


                                  
            
          /**
     * Collection to store aggregation of collActivitysRelatedByNewUserId
     */
    protected List collActivitysRelatedByNewUserId;

    /**
     * Temporary storage of collActivitysRelatedByNewUserId to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initActivitysRelatedByNewUserId()
    {
        if (collActivitysRelatedByNewUserId == null)
        {
            collActivitysRelatedByNewUserId = new ArrayList();
        }
    }

                        
    /**
     * Method called to associate a Activity object to this object
     * through the Activity foreign key attribute
     *
     * @param l Activity
     * @throws TorqueException
     */
    public void addActivityRelatedByNewUserId(Activity l) throws TorqueException
    {
        getActivitysRelatedByNewUserId().add(l);
        l.setScarabUserRelatedByNewUserId((ScarabUserImpl) this);
    }

    /**
     * The criteria used to select the current contents of collActivitysRelatedByNewUserId
     */
    private Criteria lastActivitysRelatedByNewUserIdCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getActivitysRelatedByNewUserId(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getActivitysRelatedByNewUserId()
              throws TorqueException
          {
                      if (collActivitysRelatedByNewUserId == null)
        {
            collActivitysRelatedByNewUserId = getActivitysRelatedByNewUserId(new Criteria(10));
        }
                return collActivitysRelatedByNewUserId;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related ActivitysRelatedByNewUserId from storage.
     * If this ScarabUserImpl is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getActivitysRelatedByNewUserId(Criteria criteria) throws TorqueException
    {
              if (collActivitysRelatedByNewUserId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByNewUserId = new ArrayList();
            }
            else
            {
                        criteria.add(ActivityPeer.NEW_USER_ID, getUserId() );
                        collActivitysRelatedByNewUserId = ActivityPeer.doSelect(criteria);
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
                            criteria.add(ActivityPeer.NEW_USER_ID, getUserId());
                            if (!lastActivitysRelatedByNewUserIdCriteria.equals(criteria))
                {
                    collActivitysRelatedByNewUserId = ActivityPeer.doSelect(criteria);
                }
            }
        }
        lastActivitysRelatedByNewUserIdCriteria = criteria;

        return collActivitysRelatedByNewUserId;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getActivitysRelatedByNewUserId(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getActivitysRelatedByNewUserId(Connection con) throws TorqueException
    {
              if (collActivitysRelatedByNewUserId == null)
        {
            collActivitysRelatedByNewUserId = getActivitysRelatedByNewUserId(new Criteria(10), con);
        }
        return collActivitysRelatedByNewUserId;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related ActivitysRelatedByNewUserId from storage.
     * If this ScarabUserImpl is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getActivitysRelatedByNewUserId(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collActivitysRelatedByNewUserId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByNewUserId = new ArrayList();
            }
            else
            {
                         criteria.add(ActivityPeer.NEW_USER_ID, getUserId());
                         collActivitysRelatedByNewUserId = ActivityPeer.doSelect(criteria, con);
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
                             criteria.add(ActivityPeer.NEW_USER_ID, getUserId());
                             if (!lastActivitysRelatedByNewUserIdCriteria.equals(criteria))
                 {
                     collActivitysRelatedByNewUserId = ActivityPeer.doSelect(criteria, con);
                 }
             }
         }
         lastActivitysRelatedByNewUserIdCriteria = criteria;

         return collActivitysRelatedByNewUserId;
           }

                                                                  
              
                    
                    
                                
                                                              
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related ActivitysRelatedByNewUserId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getActivitysRelatedByNewUserIdJoinIssue(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitysRelatedByNewUserId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByNewUserId = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.NEW_USER_ID, getUserId());
                              collActivitysRelatedByNewUserId = ActivityPeer.doSelectJoinIssue(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.NEW_USER_ID, getUserId());
                                    if (!lastActivitysRelatedByNewUserIdCriteria.equals(criteria))
            {
                collActivitysRelatedByNewUserId = ActivityPeer.doSelectJoinIssue(criteria);
            }
        }
        lastActivitysRelatedByNewUserIdCriteria = criteria;

        return collActivitysRelatedByNewUserId;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related ActivitysRelatedByNewUserId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getActivitysRelatedByNewUserIdJoinAttribute(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitysRelatedByNewUserId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByNewUserId = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.NEW_USER_ID, getUserId());
                              collActivitysRelatedByNewUserId = ActivityPeer.doSelectJoinAttribute(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.NEW_USER_ID, getUserId());
                                    if (!lastActivitysRelatedByNewUserIdCriteria.equals(criteria))
            {
                collActivitysRelatedByNewUserId = ActivityPeer.doSelectJoinAttribute(criteria);
            }
        }
        lastActivitysRelatedByNewUserIdCriteria = criteria;

        return collActivitysRelatedByNewUserId;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related ActivitysRelatedByNewUserId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getActivitysRelatedByNewUserIdJoinActivitySet(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitysRelatedByNewUserId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByNewUserId = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.NEW_USER_ID, getUserId());
                              collActivitysRelatedByNewUserId = ActivityPeer.doSelectJoinActivitySet(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.NEW_USER_ID, getUserId());
                                    if (!lastActivitysRelatedByNewUserIdCriteria.equals(criteria))
            {
                collActivitysRelatedByNewUserId = ActivityPeer.doSelectJoinActivitySet(criteria);
            }
        }
        lastActivitysRelatedByNewUserIdCriteria = criteria;

        return collActivitysRelatedByNewUserId;
                }
                  
                    
                              
                                            
                                                                          
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related ActivitysRelatedByNewUserId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getActivitysRelatedByNewUserIdJoinScarabUserImplRelatedByOldUserId(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitysRelatedByNewUserId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByNewUserId = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.NEW_USER_ID, getUserId());
                              collActivitysRelatedByNewUserId = ActivityPeer.doSelectJoinScarabUserImplRelatedByOldUserId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.NEW_USER_ID, getUserId());
                                    if (!lastActivitysRelatedByNewUserIdCriteria.equals(criteria))
            {
                collActivitysRelatedByNewUserId = ActivityPeer.doSelectJoinScarabUserImplRelatedByOldUserId(criteria);
            }
        }
        lastActivitysRelatedByNewUserIdCriteria = criteria;

        return collActivitysRelatedByNewUserId;
                }
                  
                    
                              
                                            
                                                                          
                                        
                    
                                            
                  
                    
                    
                                            
                                                                          
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related ActivitysRelatedByNewUserId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getActivitysRelatedByNewUserIdJoinAttributeOptionRelatedByOldOptionId(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitysRelatedByNewUserId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByNewUserId = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.NEW_USER_ID, getUserId());
                              collActivitysRelatedByNewUserId = ActivityPeer.doSelectJoinAttributeOptionRelatedByOldOptionId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.NEW_USER_ID, getUserId());
                                    if (!lastActivitysRelatedByNewUserIdCriteria.equals(criteria))
            {
                collActivitysRelatedByNewUserId = ActivityPeer.doSelectJoinAttributeOptionRelatedByOldOptionId(criteria);
            }
        }
        lastActivitysRelatedByNewUserIdCriteria = criteria;

        return collActivitysRelatedByNewUserId;
                }
                  
                    
                    
                                            
                                                                          
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related ActivitysRelatedByNewUserId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getActivitysRelatedByNewUserIdJoinAttributeOptionRelatedByNewOptionId(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitysRelatedByNewUserId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByNewUserId = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.NEW_USER_ID, getUserId());
                              collActivitysRelatedByNewUserId = ActivityPeer.doSelectJoinAttributeOptionRelatedByNewOptionId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.NEW_USER_ID, getUserId());
                                    if (!lastActivitysRelatedByNewUserIdCriteria.equals(criteria))
            {
                collActivitysRelatedByNewUserId = ActivityPeer.doSelectJoinAttributeOptionRelatedByNewOptionId(criteria);
            }
        }
        lastActivitysRelatedByNewUserIdCriteria = criteria;

        return collActivitysRelatedByNewUserId;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related ActivitysRelatedByNewUserId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getActivitysRelatedByNewUserIdJoinAttachment(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitysRelatedByNewUserId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByNewUserId = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.NEW_USER_ID, getUserId());
                              collActivitysRelatedByNewUserId = ActivityPeer.doSelectJoinAttachment(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.NEW_USER_ID, getUserId());
                                    if (!lastActivitysRelatedByNewUserIdCriteria.equals(criteria))
            {
                collActivitysRelatedByNewUserId = ActivityPeer.doSelectJoinAttachment(criteria);
            }
        }
        lastActivitysRelatedByNewUserIdCriteria = criteria;

        return collActivitysRelatedByNewUserId;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related ActivitysRelatedByNewUserId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getActivitysRelatedByNewUserIdJoinDepend(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitysRelatedByNewUserId == null)
        {
            if (isNew())
            {
               collActivitysRelatedByNewUserId = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.NEW_USER_ID, getUserId());
                              collActivitysRelatedByNewUserId = ActivityPeer.doSelectJoinDepend(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.NEW_USER_ID, getUserId());
                                    if (!lastActivitysRelatedByNewUserIdCriteria.equals(criteria))
            {
                collActivitysRelatedByNewUserId = ActivityPeer.doSelectJoinDepend(criteria);
            }
        }
        lastActivitysRelatedByNewUserIdCriteria = criteria;

        return collActivitysRelatedByNewUserId;
                }
                            


                                  
            
          /**
     * Collection to store aggregation of collAttachmentsRelatedByCreatedBy
     */
    protected List collAttachmentsRelatedByCreatedBy;

    /**
     * Temporary storage of collAttachmentsRelatedByCreatedBy to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initAttachmentsRelatedByCreatedBy()
    {
        if (collAttachmentsRelatedByCreatedBy == null)
        {
            collAttachmentsRelatedByCreatedBy = new ArrayList();
        }
    }

                        
    /**
     * Method called to associate a Attachment object to this object
     * through the Attachment foreign key attribute
     *
     * @param l Attachment
     * @throws TorqueException
     */
    public void addAttachmentRelatedByCreatedBy(Attachment l) throws TorqueException
    {
        getAttachmentsRelatedByCreatedBy().add(l);
        l.setScarabUserRelatedByCreatedBy((ScarabUserImpl) this);
    }

    /**
     * The criteria used to select the current contents of collAttachmentsRelatedByCreatedBy
     */
    private Criteria lastAttachmentsRelatedByCreatedByCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getAttachmentsRelatedByCreatedBy(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getAttachmentsRelatedByCreatedBy()
              throws TorqueException
          {
                      if (collAttachmentsRelatedByCreatedBy == null)
        {
            collAttachmentsRelatedByCreatedBy = getAttachmentsRelatedByCreatedBy(new Criteria(10));
        }
                return collAttachmentsRelatedByCreatedBy;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related AttachmentsRelatedByCreatedBy from storage.
     * If this ScarabUserImpl is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getAttachmentsRelatedByCreatedBy(Criteria criteria) throws TorqueException
    {
              if (collAttachmentsRelatedByCreatedBy == null)
        {
            if (isNew())
            {
               collAttachmentsRelatedByCreatedBy = new ArrayList();
            }
            else
            {
                        criteria.add(AttachmentPeer.CREATED_BY, getUserId() );
                        collAttachmentsRelatedByCreatedBy = AttachmentPeer.doSelect(criteria);
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
                            criteria.add(AttachmentPeer.CREATED_BY, getUserId());
                            if (!lastAttachmentsRelatedByCreatedByCriteria.equals(criteria))
                {
                    collAttachmentsRelatedByCreatedBy = AttachmentPeer.doSelect(criteria);
                }
            }
        }
        lastAttachmentsRelatedByCreatedByCriteria = criteria;

        return collAttachmentsRelatedByCreatedBy;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getAttachmentsRelatedByCreatedBy(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getAttachmentsRelatedByCreatedBy(Connection con) throws TorqueException
    {
              if (collAttachmentsRelatedByCreatedBy == null)
        {
            collAttachmentsRelatedByCreatedBy = getAttachmentsRelatedByCreatedBy(new Criteria(10), con);
        }
        return collAttachmentsRelatedByCreatedBy;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related AttachmentsRelatedByCreatedBy from storage.
     * If this ScarabUserImpl is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getAttachmentsRelatedByCreatedBy(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collAttachmentsRelatedByCreatedBy == null)
        {
            if (isNew())
            {
               collAttachmentsRelatedByCreatedBy = new ArrayList();
            }
            else
            {
                         criteria.add(AttachmentPeer.CREATED_BY, getUserId());
                         collAttachmentsRelatedByCreatedBy = AttachmentPeer.doSelect(criteria, con);
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
                             criteria.add(AttachmentPeer.CREATED_BY, getUserId());
                             if (!lastAttachmentsRelatedByCreatedByCriteria.equals(criteria))
                 {
                     collAttachmentsRelatedByCreatedBy = AttachmentPeer.doSelect(criteria, con);
                 }
             }
         }
         lastAttachmentsRelatedByCreatedByCriteria = criteria;

         return collAttachmentsRelatedByCreatedBy;
           }

                                    
              
                    
                    
                                
                                                              
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related AttachmentsRelatedByCreatedBy from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getAttachmentsRelatedByCreatedByJoinIssue(Criteria criteria)
        throws TorqueException
    {
                    if (collAttachmentsRelatedByCreatedBy == null)
        {
            if (isNew())
            {
               collAttachmentsRelatedByCreatedBy = new ArrayList();
            }
            else
            {
                              criteria.add(AttachmentPeer.CREATED_BY, getUserId());
                              collAttachmentsRelatedByCreatedBy = AttachmentPeer.doSelectJoinIssue(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttachmentPeer.CREATED_BY, getUserId());
                                    if (!lastAttachmentsRelatedByCreatedByCriteria.equals(criteria))
            {
                collAttachmentsRelatedByCreatedBy = AttachmentPeer.doSelectJoinIssue(criteria);
            }
        }
        lastAttachmentsRelatedByCreatedByCriteria = criteria;

        return collAttachmentsRelatedByCreatedBy;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related AttachmentsRelatedByCreatedBy from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getAttachmentsRelatedByCreatedByJoinAttachmentType(Criteria criteria)
        throws TorqueException
    {
                    if (collAttachmentsRelatedByCreatedBy == null)
        {
            if (isNew())
            {
               collAttachmentsRelatedByCreatedBy = new ArrayList();
            }
            else
            {
                              criteria.add(AttachmentPeer.CREATED_BY, getUserId());
                              collAttachmentsRelatedByCreatedBy = AttachmentPeer.doSelectJoinAttachmentType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttachmentPeer.CREATED_BY, getUserId());
                                    if (!lastAttachmentsRelatedByCreatedByCriteria.equals(criteria))
            {
                collAttachmentsRelatedByCreatedBy = AttachmentPeer.doSelectJoinAttachmentType(criteria);
            }
        }
        lastAttachmentsRelatedByCreatedByCriteria = criteria;

        return collAttachmentsRelatedByCreatedBy;
                }
                  
                    
                              
                                            
                                                                          
                                        
                    
                                            
                  
                    
                              
                                            
                                                                          
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related AttachmentsRelatedByCreatedBy from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getAttachmentsRelatedByCreatedByJoinScarabUserImplRelatedByModifiedBy(Criteria criteria)
        throws TorqueException
    {
                    if (collAttachmentsRelatedByCreatedBy == null)
        {
            if (isNew())
            {
               collAttachmentsRelatedByCreatedBy = new ArrayList();
            }
            else
            {
                              criteria.add(AttachmentPeer.CREATED_BY, getUserId());
                              collAttachmentsRelatedByCreatedBy = AttachmentPeer.doSelectJoinScarabUserImplRelatedByModifiedBy(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttachmentPeer.CREATED_BY, getUserId());
                                    if (!lastAttachmentsRelatedByCreatedByCriteria.equals(criteria))
            {
                collAttachmentsRelatedByCreatedBy = AttachmentPeer.doSelectJoinScarabUserImplRelatedByModifiedBy(criteria);
            }
        }
        lastAttachmentsRelatedByCreatedByCriteria = criteria;

        return collAttachmentsRelatedByCreatedBy;
                }
                            


                                  
            
          /**
     * Collection to store aggregation of collAttachmentsRelatedByModifiedBy
     */
    protected List collAttachmentsRelatedByModifiedBy;

    /**
     * Temporary storage of collAttachmentsRelatedByModifiedBy to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initAttachmentsRelatedByModifiedBy()
    {
        if (collAttachmentsRelatedByModifiedBy == null)
        {
            collAttachmentsRelatedByModifiedBy = new ArrayList();
        }
    }

                        
    /**
     * Method called to associate a Attachment object to this object
     * through the Attachment foreign key attribute
     *
     * @param l Attachment
     * @throws TorqueException
     */
    public void addAttachmentRelatedByModifiedBy(Attachment l) throws TorqueException
    {
        getAttachmentsRelatedByModifiedBy().add(l);
        l.setScarabUserRelatedByModifiedBy((ScarabUserImpl) this);
    }

    /**
     * The criteria used to select the current contents of collAttachmentsRelatedByModifiedBy
     */
    private Criteria lastAttachmentsRelatedByModifiedByCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getAttachmentsRelatedByModifiedBy(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getAttachmentsRelatedByModifiedBy()
              throws TorqueException
          {
                      if (collAttachmentsRelatedByModifiedBy == null)
        {
            collAttachmentsRelatedByModifiedBy = getAttachmentsRelatedByModifiedBy(new Criteria(10));
        }
                return collAttachmentsRelatedByModifiedBy;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related AttachmentsRelatedByModifiedBy from storage.
     * If this ScarabUserImpl is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getAttachmentsRelatedByModifiedBy(Criteria criteria) throws TorqueException
    {
              if (collAttachmentsRelatedByModifiedBy == null)
        {
            if (isNew())
            {
               collAttachmentsRelatedByModifiedBy = new ArrayList();
            }
            else
            {
                        criteria.add(AttachmentPeer.MODIFIED_BY, getUserId() );
                        collAttachmentsRelatedByModifiedBy = AttachmentPeer.doSelect(criteria);
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
                            criteria.add(AttachmentPeer.MODIFIED_BY, getUserId());
                            if (!lastAttachmentsRelatedByModifiedByCriteria.equals(criteria))
                {
                    collAttachmentsRelatedByModifiedBy = AttachmentPeer.doSelect(criteria);
                }
            }
        }
        lastAttachmentsRelatedByModifiedByCriteria = criteria;

        return collAttachmentsRelatedByModifiedBy;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getAttachmentsRelatedByModifiedBy(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getAttachmentsRelatedByModifiedBy(Connection con) throws TorqueException
    {
              if (collAttachmentsRelatedByModifiedBy == null)
        {
            collAttachmentsRelatedByModifiedBy = getAttachmentsRelatedByModifiedBy(new Criteria(10), con);
        }
        return collAttachmentsRelatedByModifiedBy;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related AttachmentsRelatedByModifiedBy from storage.
     * If this ScarabUserImpl is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getAttachmentsRelatedByModifiedBy(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collAttachmentsRelatedByModifiedBy == null)
        {
            if (isNew())
            {
               collAttachmentsRelatedByModifiedBy = new ArrayList();
            }
            else
            {
                         criteria.add(AttachmentPeer.MODIFIED_BY, getUserId());
                         collAttachmentsRelatedByModifiedBy = AttachmentPeer.doSelect(criteria, con);
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
                             criteria.add(AttachmentPeer.MODIFIED_BY, getUserId());
                             if (!lastAttachmentsRelatedByModifiedByCriteria.equals(criteria))
                 {
                     collAttachmentsRelatedByModifiedBy = AttachmentPeer.doSelect(criteria, con);
                 }
             }
         }
         lastAttachmentsRelatedByModifiedByCriteria = criteria;

         return collAttachmentsRelatedByModifiedBy;
           }

                                    
              
                    
                    
                                
                                                              
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related AttachmentsRelatedByModifiedBy from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getAttachmentsRelatedByModifiedByJoinIssue(Criteria criteria)
        throws TorqueException
    {
                    if (collAttachmentsRelatedByModifiedBy == null)
        {
            if (isNew())
            {
               collAttachmentsRelatedByModifiedBy = new ArrayList();
            }
            else
            {
                              criteria.add(AttachmentPeer.MODIFIED_BY, getUserId());
                              collAttachmentsRelatedByModifiedBy = AttachmentPeer.doSelectJoinIssue(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttachmentPeer.MODIFIED_BY, getUserId());
                                    if (!lastAttachmentsRelatedByModifiedByCriteria.equals(criteria))
            {
                collAttachmentsRelatedByModifiedBy = AttachmentPeer.doSelectJoinIssue(criteria);
            }
        }
        lastAttachmentsRelatedByModifiedByCriteria = criteria;

        return collAttachmentsRelatedByModifiedBy;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related AttachmentsRelatedByModifiedBy from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getAttachmentsRelatedByModifiedByJoinAttachmentType(Criteria criteria)
        throws TorqueException
    {
                    if (collAttachmentsRelatedByModifiedBy == null)
        {
            if (isNew())
            {
               collAttachmentsRelatedByModifiedBy = new ArrayList();
            }
            else
            {
                              criteria.add(AttachmentPeer.MODIFIED_BY, getUserId());
                              collAttachmentsRelatedByModifiedBy = AttachmentPeer.doSelectJoinAttachmentType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttachmentPeer.MODIFIED_BY, getUserId());
                                    if (!lastAttachmentsRelatedByModifiedByCriteria.equals(criteria))
            {
                collAttachmentsRelatedByModifiedBy = AttachmentPeer.doSelectJoinAttachmentType(criteria);
            }
        }
        lastAttachmentsRelatedByModifiedByCriteria = criteria;

        return collAttachmentsRelatedByModifiedBy;
                }
                  
                    
                              
                                            
                                                                          
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related AttachmentsRelatedByModifiedBy from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getAttachmentsRelatedByModifiedByJoinScarabUserImplRelatedByCreatedBy(Criteria criteria)
        throws TorqueException
    {
                    if (collAttachmentsRelatedByModifiedBy == null)
        {
            if (isNew())
            {
               collAttachmentsRelatedByModifiedBy = new ArrayList();
            }
            else
            {
                              criteria.add(AttachmentPeer.MODIFIED_BY, getUserId());
                              collAttachmentsRelatedByModifiedBy = AttachmentPeer.doSelectJoinScarabUserImplRelatedByCreatedBy(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttachmentPeer.MODIFIED_BY, getUserId());
                                    if (!lastAttachmentsRelatedByModifiedByCriteria.equals(criteria))
            {
                collAttachmentsRelatedByModifiedBy = AttachmentPeer.doSelectJoinScarabUserImplRelatedByCreatedBy(criteria);
            }
        }
        lastAttachmentsRelatedByModifiedByCriteria = criteria;

        return collAttachmentsRelatedByModifiedBy;
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
        l.setScarabUser((ScarabUserImpl) this);
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
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related Attributes from storage.
     * If this ScarabUserImpl is new, it will return
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
                        criteria.add(AttributePeer.CREATED_BY, getUserId() );
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
                            criteria.add(AttributePeer.CREATED_BY, getUserId());
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
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related Attributes from storage.
     * If this ScarabUserImpl is new, it will return
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
                         criteria.add(AttributePeer.CREATED_BY, getUserId());
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
                             criteria.add(AttributePeer.CREATED_BY, getUserId());
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
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related Attributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
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
                              criteria.add(AttributePeer.CREATED_BY, getUserId());
                              collAttributes = AttributePeer.doSelectJoinAttributeType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttributePeer.CREATED_BY, getUserId());
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
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related Attributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
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
                              criteria.add(AttributePeer.CREATED_BY, getUserId());
                              collAttributes = AttributePeer.doSelectJoinAttributeOption(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttributePeer.CREATED_BY, getUserId());
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
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related Attributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
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
                              criteria.add(AttributePeer.CREATED_BY, getUserId());
                              collAttributes = AttributePeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttributePeer.CREATED_BY, getUserId());
                                    if (!lastAttributesCriteria.equals(criteria))
            {
                collAttributes = AttributePeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        lastAttributesCriteria = criteria;

        return collAttributes;
                }
                            


                          
            
          /**
     * Collection to store aggregation of collMITLists
     */
    protected List collMITLists;

    /**
     * Temporary storage of collMITLists to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initMITLists()
    {
        if (collMITLists == null)
        {
            collMITLists = new ArrayList();
        }
    }

                        
    /**
     * Method called to associate a MITList object to this object
     * through the MITList foreign key attribute
     *
     * @param l MITList
     * @throws TorqueException
     */
    public void addMITList(MITList l) throws TorqueException
    {
        getMITLists().add(l);
        l.setScarabUser((ScarabUserImpl) this);
    }

    /**
     * The criteria used to select the current contents of collMITLists
     */
    private Criteria lastMITListsCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getMITLists(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getMITLists()
              throws TorqueException
          {
                      if (collMITLists == null)
        {
            collMITLists = getMITLists(new Criteria(10));
        }
                return collMITLists;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related MITLists from storage.
     * If this ScarabUserImpl is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getMITLists(Criteria criteria) throws TorqueException
    {
              if (collMITLists == null)
        {
            if (isNew())
            {
               collMITLists = new ArrayList();
            }
            else
            {
                        criteria.add(MITListPeer.USER_ID, getUserId() );
                        collMITLists = MITListPeer.doSelect(criteria);
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
                            criteria.add(MITListPeer.USER_ID, getUserId());
                            if (!lastMITListsCriteria.equals(criteria))
                {
                    collMITLists = MITListPeer.doSelect(criteria);
                }
            }
        }
        lastMITListsCriteria = criteria;

        return collMITLists;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getMITLists(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getMITLists(Connection con) throws TorqueException
    {
              if (collMITLists == null)
        {
            collMITLists = getMITLists(new Criteria(10), con);
        }
        return collMITLists;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related MITLists from storage.
     * If this ScarabUserImpl is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getMITLists(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collMITLists == null)
        {
            if (isNew())
            {
               collMITLists = new ArrayList();
            }
            else
            {
                         criteria.add(MITListPeer.USER_ID, getUserId());
                         collMITLists = MITListPeer.doSelect(criteria, con);
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
                             criteria.add(MITListPeer.USER_ID, getUserId());
                             if (!lastMITListsCriteria.equals(criteria))
                 {
                     collMITLists = MITListPeer.doSelect(criteria, con);
                 }
             }
         }
         lastMITListsCriteria = criteria;

         return collMITLists;
           }

                  
              
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related MITLists from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getMITListsJoinScarabUserImpl(Criteria criteria)
        throws TorqueException
    {
                    if (collMITLists == null)
        {
            if (isNew())
            {
               collMITLists = new ArrayList();
            }
            else
            {
                              criteria.add(MITListPeer.USER_ID, getUserId());
                              collMITLists = MITListPeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(MITListPeer.USER_ID, getUserId());
                                    if (!lastMITListsCriteria.equals(criteria))
            {
                collMITLists = MITListPeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        lastMITListsCriteria = criteria;

        return collMITLists;
                }
                            


                          
            
          /**
     * Collection to store aggregation of collAttributeValues
     */
    protected List collAttributeValues;

    /**
     * Temporary storage of collAttributeValues to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initAttributeValues()
    {
        if (collAttributeValues == null)
        {
            collAttributeValues = new ArrayList();
        }
    }

                        
    /**
     * Method called to associate a AttributeValue object to this object
     * through the AttributeValue foreign key attribute
     *
     * @param l AttributeValue
     * @throws TorqueException
     */
    public void addAttributeValue(AttributeValue l) throws TorqueException
    {
        getAttributeValues().add(l);
        l.setScarabUser((ScarabUserImpl) this);
    }

    /**
     * The criteria used to select the current contents of collAttributeValues
     */
    private Criteria lastAttributeValuesCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getAttributeValues(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getAttributeValues()
              throws TorqueException
          {
                      if (collAttributeValues == null)
        {
            collAttributeValues = getAttributeValues(new Criteria(10));
        }
                return collAttributeValues;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related AttributeValues from storage.
     * If this ScarabUserImpl is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getAttributeValues(Criteria criteria) throws TorqueException
    {
              if (collAttributeValues == null)
        {
            if (isNew())
            {
               collAttributeValues = new ArrayList();
            }
            else
            {
                        criteria.add(AttributeValuePeer.USER_ID, getUserId() );
                        collAttributeValues = AttributeValuePeer.doSelect(criteria);
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
                            criteria.add(AttributeValuePeer.USER_ID, getUserId());
                            if (!lastAttributeValuesCriteria.equals(criteria))
                {
                    collAttributeValues = AttributeValuePeer.doSelect(criteria);
                }
            }
        }
        lastAttributeValuesCriteria = criteria;

        return collAttributeValues;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getAttributeValues(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getAttributeValues(Connection con) throws TorqueException
    {
              if (collAttributeValues == null)
        {
            collAttributeValues = getAttributeValues(new Criteria(10), con);
        }
        return collAttributeValues;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related AttributeValues from storage.
     * If this ScarabUserImpl is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getAttributeValues(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collAttributeValues == null)
        {
            if (isNew())
            {
               collAttributeValues = new ArrayList();
            }
            else
            {
                         criteria.add(AttributeValuePeer.USER_ID, getUserId());
                         collAttributeValues = AttributeValuePeer.doSelect(criteria, con);
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
                             criteria.add(AttributeValuePeer.USER_ID, getUserId());
                             if (!lastAttributeValuesCriteria.equals(criteria))
                 {
                     collAttributeValues = AttributeValuePeer.doSelect(criteria, con);
                 }
             }
         }
         lastAttributeValuesCriteria = criteria;

         return collAttributeValues;
           }

                                    
              
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related AttributeValues from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getAttributeValuesJoinIssue(Criteria criteria)
        throws TorqueException
    {
                    if (collAttributeValues == null)
        {
            if (isNew())
            {
               collAttributeValues = new ArrayList();
            }
            else
            {
                              criteria.add(AttributeValuePeer.USER_ID, getUserId());
                              collAttributeValues = AttributeValuePeer.doSelectJoinIssue(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttributeValuePeer.USER_ID, getUserId());
                                    if (!lastAttributeValuesCriteria.equals(criteria))
            {
                collAttributeValues = AttributeValuePeer.doSelectJoinIssue(criteria);
            }
        }
        lastAttributeValuesCriteria = criteria;

        return collAttributeValues;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related AttributeValues from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getAttributeValuesJoinAttribute(Criteria criteria)
        throws TorqueException
    {
                    if (collAttributeValues == null)
        {
            if (isNew())
            {
               collAttributeValues = new ArrayList();
            }
            else
            {
                              criteria.add(AttributeValuePeer.USER_ID, getUserId());
                              collAttributeValues = AttributeValuePeer.doSelectJoinAttribute(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttributeValuePeer.USER_ID, getUserId());
                                    if (!lastAttributeValuesCriteria.equals(criteria))
            {
                collAttributeValues = AttributeValuePeer.doSelectJoinAttribute(criteria);
            }
        }
        lastAttributeValuesCriteria = criteria;

        return collAttributeValues;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related AttributeValues from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getAttributeValuesJoinAttributeOption(Criteria criteria)
        throws TorqueException
    {
                    if (collAttributeValues == null)
        {
            if (isNew())
            {
               collAttributeValues = new ArrayList();
            }
            else
            {
                              criteria.add(AttributeValuePeer.USER_ID, getUserId());
                              collAttributeValues = AttributeValuePeer.doSelectJoinAttributeOption(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttributeValuePeer.USER_ID, getUserId());
                                    if (!lastAttributeValuesCriteria.equals(criteria))
            {
                collAttributeValues = AttributeValuePeer.doSelectJoinAttributeOption(criteria);
            }
        }
        lastAttributeValuesCriteria = criteria;

        return collAttributeValues;
                }
                  
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related AttributeValues from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getAttributeValuesJoinScarabUserImpl(Criteria criteria)
        throws TorqueException
    {
                    if (collAttributeValues == null)
        {
            if (isNew())
            {
               collAttributeValues = new ArrayList();
            }
            else
            {
                              criteria.add(AttributeValuePeer.USER_ID, getUserId());
                              collAttributeValues = AttributeValuePeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttributeValuePeer.USER_ID, getUserId());
                                    if (!lastAttributeValuesCriteria.equals(criteria))
            {
                collAttributeValues = AttributeValuePeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        lastAttributeValuesCriteria = criteria;

        return collAttributeValues;
                }
                            


                                  
            
          /**
     * Collection to store aggregation of collScarabModulesRelatedByOwnerId
     */
    protected List collScarabModulesRelatedByOwnerId;

    /**
     * Temporary storage of collScarabModulesRelatedByOwnerId to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initScarabModulesRelatedByOwnerId()
    {
        if (collScarabModulesRelatedByOwnerId == null)
        {
            collScarabModulesRelatedByOwnerId = new ArrayList();
        }
    }

                        
    /**
     * Method called to associate a ScarabModule object to this object
     * through the ScarabModule foreign key attribute
     *
     * @param l ScarabModule
     * @throws TorqueException
     */
    public void addScarabModuleRelatedByOwnerId(ScarabModule l) throws TorqueException
    {
        getScarabModulesRelatedByOwnerId().add(l);
        l.setScarabUserRelatedByOwnerId((ScarabUserImpl) this);
    }

    /**
     * The criteria used to select the current contents of collScarabModulesRelatedByOwnerId
     */
    private Criteria lastScarabModulesRelatedByOwnerIdCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getScarabModulesRelatedByOwnerId(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getScarabModulesRelatedByOwnerId()
              throws TorqueException
          {
                      if (collScarabModulesRelatedByOwnerId == null)
        {
            collScarabModulesRelatedByOwnerId = getScarabModulesRelatedByOwnerId(new Criteria(10));
        }
                return collScarabModulesRelatedByOwnerId;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related ScarabModulesRelatedByOwnerId from storage.
     * If this ScarabUserImpl is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getScarabModulesRelatedByOwnerId(Criteria criteria) throws TorqueException
    {
              if (collScarabModulesRelatedByOwnerId == null)
        {
            if (isNew())
            {
               collScarabModulesRelatedByOwnerId = new ArrayList();
            }
            else
            {
                        criteria.add(ScarabModulePeer.OWNER_ID, getUserId() );
                        collScarabModulesRelatedByOwnerId = ScarabModulePeer.doSelect(criteria);
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
                            criteria.add(ScarabModulePeer.OWNER_ID, getUserId());
                            if (!lastScarabModulesRelatedByOwnerIdCriteria.equals(criteria))
                {
                    collScarabModulesRelatedByOwnerId = ScarabModulePeer.doSelect(criteria);
                }
            }
        }
        lastScarabModulesRelatedByOwnerIdCriteria = criteria;

        return collScarabModulesRelatedByOwnerId;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getScarabModulesRelatedByOwnerId(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getScarabModulesRelatedByOwnerId(Connection con) throws TorqueException
    {
              if (collScarabModulesRelatedByOwnerId == null)
        {
            collScarabModulesRelatedByOwnerId = getScarabModulesRelatedByOwnerId(new Criteria(10), con);
        }
        return collScarabModulesRelatedByOwnerId;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related ScarabModulesRelatedByOwnerId from storage.
     * If this ScarabUserImpl is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getScarabModulesRelatedByOwnerId(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collScarabModulesRelatedByOwnerId == null)
        {
            if (isNew())
            {
               collScarabModulesRelatedByOwnerId = new ArrayList();
            }
            else
            {
                         criteria.add(ScarabModulePeer.OWNER_ID, getUserId());
                         collScarabModulesRelatedByOwnerId = ScarabModulePeer.doSelect(criteria, con);
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
                             criteria.add(ScarabModulePeer.OWNER_ID, getUserId());
                             if (!lastScarabModulesRelatedByOwnerIdCriteria.equals(criteria))
                 {
                     collScarabModulesRelatedByOwnerId = ScarabModulePeer.doSelect(criteria, con);
                 }
             }
         }
         lastScarabModulesRelatedByOwnerIdCriteria = criteria;

         return collScarabModulesRelatedByOwnerId;
           }

                              
              
                    
                    
                                
                                                              
                                                  
                    
                                
                  
                    
                              
                                            
                                                                          
                                        
                    
                                            
                  
                    
                              
                                            
                                                                          
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related ScarabModulesRelatedByOwnerId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getScarabModulesRelatedByOwnerIdJoinScarabUserImplRelatedByQaContactId(Criteria criteria)
        throws TorqueException
    {
                    if (collScarabModulesRelatedByOwnerId == null)
        {
            if (isNew())
            {
               collScarabModulesRelatedByOwnerId = new ArrayList();
            }
            else
            {
                              criteria.add(ScarabModulePeer.OWNER_ID, getUserId());
                              collScarabModulesRelatedByOwnerId = ScarabModulePeer.doSelectJoinScarabUserImplRelatedByQaContactId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ScarabModulePeer.OWNER_ID, getUserId());
                                    if (!lastScarabModulesRelatedByOwnerIdCriteria.equals(criteria))
            {
                collScarabModulesRelatedByOwnerId = ScarabModulePeer.doSelectJoinScarabUserImplRelatedByQaContactId(criteria);
            }
        }
        lastScarabModulesRelatedByOwnerIdCriteria = criteria;

        return collScarabModulesRelatedByOwnerId;
                }
                            


                                  
            
          /**
     * Collection to store aggregation of collScarabModulesRelatedByQaContactId
     */
    protected List collScarabModulesRelatedByQaContactId;

    /**
     * Temporary storage of collScarabModulesRelatedByQaContactId to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initScarabModulesRelatedByQaContactId()
    {
        if (collScarabModulesRelatedByQaContactId == null)
        {
            collScarabModulesRelatedByQaContactId = new ArrayList();
        }
    }

                        
    /**
     * Method called to associate a ScarabModule object to this object
     * through the ScarabModule foreign key attribute
     *
     * @param l ScarabModule
     * @throws TorqueException
     */
    public void addScarabModuleRelatedByQaContactId(ScarabModule l) throws TorqueException
    {
        getScarabModulesRelatedByQaContactId().add(l);
        l.setScarabUserRelatedByQaContactId((ScarabUserImpl) this);
    }

    /**
     * The criteria used to select the current contents of collScarabModulesRelatedByQaContactId
     */
    private Criteria lastScarabModulesRelatedByQaContactIdCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getScarabModulesRelatedByQaContactId(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getScarabModulesRelatedByQaContactId()
              throws TorqueException
          {
                      if (collScarabModulesRelatedByQaContactId == null)
        {
            collScarabModulesRelatedByQaContactId = getScarabModulesRelatedByQaContactId(new Criteria(10));
        }
                return collScarabModulesRelatedByQaContactId;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related ScarabModulesRelatedByQaContactId from storage.
     * If this ScarabUserImpl is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getScarabModulesRelatedByQaContactId(Criteria criteria) throws TorqueException
    {
              if (collScarabModulesRelatedByQaContactId == null)
        {
            if (isNew())
            {
               collScarabModulesRelatedByQaContactId = new ArrayList();
            }
            else
            {
                        criteria.add(ScarabModulePeer.QA_CONTACT_ID, getUserId() );
                        collScarabModulesRelatedByQaContactId = ScarabModulePeer.doSelect(criteria);
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
                            criteria.add(ScarabModulePeer.QA_CONTACT_ID, getUserId());
                            if (!lastScarabModulesRelatedByQaContactIdCriteria.equals(criteria))
                {
                    collScarabModulesRelatedByQaContactId = ScarabModulePeer.doSelect(criteria);
                }
            }
        }
        lastScarabModulesRelatedByQaContactIdCriteria = criteria;

        return collScarabModulesRelatedByQaContactId;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getScarabModulesRelatedByQaContactId(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getScarabModulesRelatedByQaContactId(Connection con) throws TorqueException
    {
              if (collScarabModulesRelatedByQaContactId == null)
        {
            collScarabModulesRelatedByQaContactId = getScarabModulesRelatedByQaContactId(new Criteria(10), con);
        }
        return collScarabModulesRelatedByQaContactId;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related ScarabModulesRelatedByQaContactId from storage.
     * If this ScarabUserImpl is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getScarabModulesRelatedByQaContactId(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collScarabModulesRelatedByQaContactId == null)
        {
            if (isNew())
            {
               collScarabModulesRelatedByQaContactId = new ArrayList();
            }
            else
            {
                         criteria.add(ScarabModulePeer.QA_CONTACT_ID, getUserId());
                         collScarabModulesRelatedByQaContactId = ScarabModulePeer.doSelect(criteria, con);
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
                             criteria.add(ScarabModulePeer.QA_CONTACT_ID, getUserId());
                             if (!lastScarabModulesRelatedByQaContactIdCriteria.equals(criteria))
                 {
                     collScarabModulesRelatedByQaContactId = ScarabModulePeer.doSelect(criteria, con);
                 }
             }
         }
         lastScarabModulesRelatedByQaContactIdCriteria = criteria;

         return collScarabModulesRelatedByQaContactId;
           }

                              
              
                    
                    
                                
                                                              
                                                  
                    
                                
                  
                    
                              
                                            
                                                                          
                                        
                    
                                
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related ScarabModulesRelatedByQaContactId from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getScarabModulesRelatedByQaContactIdJoinScarabUserImplRelatedByOwnerId(Criteria criteria)
        throws TorqueException
    {
                    if (collScarabModulesRelatedByQaContactId == null)
        {
            if (isNew())
            {
               collScarabModulesRelatedByQaContactId = new ArrayList();
            }
            else
            {
                              criteria.add(ScarabModulePeer.QA_CONTACT_ID, getUserId());
                              collScarabModulesRelatedByQaContactId = ScarabModulePeer.doSelectJoinScarabUserImplRelatedByOwnerId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ScarabModulePeer.QA_CONTACT_ID, getUserId());
                                    if (!lastScarabModulesRelatedByQaContactIdCriteria.equals(criteria))
            {
                collScarabModulesRelatedByQaContactId = ScarabModulePeer.doSelectJoinScarabUserImplRelatedByOwnerId(criteria);
            }
        }
        lastScarabModulesRelatedByQaContactIdCriteria = criteria;

        return collScarabModulesRelatedByQaContactId;
                }
                  
                    
                              
                                            
                                                                          
                                        
                    
                                            
                            


                          
            
          /**
     * Collection to store aggregation of collRModuleUserAttributes
     */
    protected List collRModuleUserAttributes;

    /**
     * Temporary storage of collRModuleUserAttributes to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initRModuleUserAttributes()
    {
        if (collRModuleUserAttributes == null)
        {
            collRModuleUserAttributes = new ArrayList();
        }
    }

                        
    /**
     * Method called to associate a RModuleUserAttribute object to this object
     * through the RModuleUserAttribute foreign key attribute
     *
     * @param l RModuleUserAttribute
     * @throws TorqueException
     */
    public void addRModuleUserAttribute(RModuleUserAttribute l) throws TorqueException
    {
        getRModuleUserAttributes().add(l);
        l.setScarabUser((ScarabUserImpl) this);
    }

    /**
     * The criteria used to select the current contents of collRModuleUserAttributes
     */
    private Criteria lastRModuleUserAttributesCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getRModuleUserAttributes(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getRModuleUserAttributes()
              throws TorqueException
          {
                      if (collRModuleUserAttributes == null)
        {
            collRModuleUserAttributes = getRModuleUserAttributes(new Criteria(10));
        }
                return collRModuleUserAttributes;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related RModuleUserAttributes from storage.
     * If this ScarabUserImpl is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getRModuleUserAttributes(Criteria criteria) throws TorqueException
    {
              if (collRModuleUserAttributes == null)
        {
            if (isNew())
            {
               collRModuleUserAttributes = new ArrayList();
            }
            else
            {
                        criteria.add(RModuleUserAttributePeer.USER_ID, getUserId() );
                        collRModuleUserAttributes = RModuleUserAttributePeer.doSelect(criteria);
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
                            criteria.add(RModuleUserAttributePeer.USER_ID, getUserId());
                            if (!lastRModuleUserAttributesCriteria.equals(criteria))
                {
                    collRModuleUserAttributes = RModuleUserAttributePeer.doSelect(criteria);
                }
            }
        }
        lastRModuleUserAttributesCriteria = criteria;

        return collRModuleUserAttributes;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getRModuleUserAttributes(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getRModuleUserAttributes(Connection con) throws TorqueException
    {
              if (collRModuleUserAttributes == null)
        {
            collRModuleUserAttributes = getRModuleUserAttributes(new Criteria(10), con);
        }
        return collRModuleUserAttributes;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related RModuleUserAttributes from storage.
     * If this ScarabUserImpl is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getRModuleUserAttributes(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collRModuleUserAttributes == null)
        {
            if (isNew())
            {
               collRModuleUserAttributes = new ArrayList();
            }
            else
            {
                         criteria.add(RModuleUserAttributePeer.USER_ID, getUserId());
                         collRModuleUserAttributes = RModuleUserAttributePeer.doSelect(criteria, con);
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
                             criteria.add(RModuleUserAttributePeer.USER_ID, getUserId());
                             if (!lastRModuleUserAttributesCriteria.equals(criteria))
                 {
                     collRModuleUserAttributes = RModuleUserAttributePeer.doSelect(criteria, con);
                 }
             }
         }
         lastRModuleUserAttributesCriteria = criteria;

         return collRModuleUserAttributes;
           }

                                          
              
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related RModuleUserAttributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getRModuleUserAttributesJoinMITList(Criteria criteria)
        throws TorqueException
    {
                    if (collRModuleUserAttributes == null)
        {
            if (isNew())
            {
               collRModuleUserAttributes = new ArrayList();
            }
            else
            {
                              criteria.add(RModuleUserAttributePeer.USER_ID, getUserId());
                              collRModuleUserAttributes = RModuleUserAttributePeer.doSelectJoinMITList(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleUserAttributePeer.USER_ID, getUserId());
                                    if (!lastRModuleUserAttributesCriteria.equals(criteria))
            {
                collRModuleUserAttributes = RModuleUserAttributePeer.doSelectJoinMITList(criteria);
            }
        }
        lastRModuleUserAttributesCriteria = criteria;

        return collRModuleUserAttributes;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related RModuleUserAttributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getRModuleUserAttributesJoinScarabModule(Criteria criteria)
        throws TorqueException
    {
                    if (collRModuleUserAttributes == null)
        {
            if (isNew())
            {
               collRModuleUserAttributes = new ArrayList();
            }
            else
            {
                              criteria.add(RModuleUserAttributePeer.USER_ID, getUserId());
                              collRModuleUserAttributes = RModuleUserAttributePeer.doSelectJoinScarabModule(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleUserAttributePeer.USER_ID, getUserId());
                                    if (!lastRModuleUserAttributesCriteria.equals(criteria))
            {
                collRModuleUserAttributes = RModuleUserAttributePeer.doSelectJoinScarabModule(criteria);
            }
        }
        lastRModuleUserAttributesCriteria = criteria;

        return collRModuleUserAttributes;
                }
                  
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related RModuleUserAttributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getRModuleUserAttributesJoinScarabUserImpl(Criteria criteria)
        throws TorqueException
    {
                    if (collRModuleUserAttributes == null)
        {
            if (isNew())
            {
               collRModuleUserAttributes = new ArrayList();
            }
            else
            {
                              criteria.add(RModuleUserAttributePeer.USER_ID, getUserId());
                              collRModuleUserAttributes = RModuleUserAttributePeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleUserAttributePeer.USER_ID, getUserId());
                                    if (!lastRModuleUserAttributesCriteria.equals(criteria))
            {
                collRModuleUserAttributes = RModuleUserAttributePeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        lastRModuleUserAttributesCriteria = criteria;

        return collRModuleUserAttributes;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related RModuleUserAttributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getRModuleUserAttributesJoinIssueType(Criteria criteria)
        throws TorqueException
    {
                    if (collRModuleUserAttributes == null)
        {
            if (isNew())
            {
               collRModuleUserAttributes = new ArrayList();
            }
            else
            {
                              criteria.add(RModuleUserAttributePeer.USER_ID, getUserId());
                              collRModuleUserAttributes = RModuleUserAttributePeer.doSelectJoinIssueType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleUserAttributePeer.USER_ID, getUserId());
                                    if (!lastRModuleUserAttributesCriteria.equals(criteria))
            {
                collRModuleUserAttributes = RModuleUserAttributePeer.doSelectJoinIssueType(criteria);
            }
        }
        lastRModuleUserAttributesCriteria = criteria;

        return collRModuleUserAttributes;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related RModuleUserAttributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getRModuleUserAttributesJoinAttribute(Criteria criteria)
        throws TorqueException
    {
                    if (collRModuleUserAttributes == null)
        {
            if (isNew())
            {
               collRModuleUserAttributes = new ArrayList();
            }
            else
            {
                              criteria.add(RModuleUserAttributePeer.USER_ID, getUserId());
                              collRModuleUserAttributes = RModuleUserAttributePeer.doSelectJoinAttribute(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleUserAttributePeer.USER_ID, getUserId());
                                    if (!lastRModuleUserAttributesCriteria.equals(criteria))
            {
                collRModuleUserAttributes = RModuleUserAttributePeer.doSelectJoinAttribute(criteria);
            }
        }
        lastRModuleUserAttributesCriteria = criteria;

        return collRModuleUserAttributes;
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
        l.setScarabUser((ScarabUserImpl) this);
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
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related ActivitySets from storage.
     * If this ScarabUserImpl is new, it will return
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
                        criteria.add(ActivitySetPeer.CREATED_BY, getUserId() );
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
                            criteria.add(ActivitySetPeer.CREATED_BY, getUserId());
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
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related ActivitySets from storage.
     * If this ScarabUserImpl is new, it will return
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
                         criteria.add(ActivitySetPeer.CREATED_BY, getUserId());
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
                             criteria.add(ActivitySetPeer.CREATED_BY, getUserId());
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
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related ActivitySets from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
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
                              criteria.add(ActivitySetPeer.CREATED_BY, getUserId());
                              collActivitySets = ActivitySetPeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivitySetPeer.CREATED_BY, getUserId());
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
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related ActivitySets from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
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
                              criteria.add(ActivitySetPeer.CREATED_BY, getUserId());
                              collActivitySets = ActivitySetPeer.doSelectJoinActivitySetType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivitySetPeer.CREATED_BY, getUserId());
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
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related ActivitySets from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
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
                              criteria.add(ActivitySetPeer.CREATED_BY, getUserId());
                              collActivitySets = ActivitySetPeer.doSelectJoinAttachment(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivitySetPeer.CREATED_BY, getUserId());
                                    if (!lastActivitySetsCriteria.equals(criteria))
            {
                collActivitySets = ActivitySetPeer.doSelectJoinAttachment(criteria);
            }
        }
        lastActivitySetsCriteria = criteria;

        return collActivitySets;
                }
                            


                          
            
          /**
     * Collection to store aggregation of collUserPreferences
     */
    protected List collUserPreferences;

    /**
     * Temporary storage of collUserPreferences to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initUserPreferences()
    {
        if (collUserPreferences == null)
        {
            collUserPreferences = new ArrayList();
        }
    }

                        
    /**
     * Method called to associate a UserPreference object to this object
     * through the UserPreference foreign key attribute
     *
     * @param l UserPreference
     * @throws TorqueException
     */
    public void addUserPreference(UserPreference l) throws TorqueException
    {
        getUserPreferences().add(l);
        l.setScarabUser((ScarabUserImpl) this);
    }

    /**
     * The criteria used to select the current contents of collUserPreferences
     */
    private Criteria lastUserPreferencesCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getUserPreferences(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getUserPreferences()
              throws TorqueException
          {
                      if (collUserPreferences == null)
        {
            collUserPreferences = getUserPreferences(new Criteria(10));
        }
                return collUserPreferences;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related UserPreferences from storage.
     * If this ScarabUserImpl is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getUserPreferences(Criteria criteria) throws TorqueException
    {
              if (collUserPreferences == null)
        {
            if (isNew())
            {
               collUserPreferences = new ArrayList();
            }
            else
            {
                        criteria.add(UserPreferencePeer.USER_ID, getUserId() );
                        collUserPreferences = UserPreferencePeer.doSelect(criteria);
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
                            criteria.add(UserPreferencePeer.USER_ID, getUserId());
                            if (!lastUserPreferencesCriteria.equals(criteria))
                {
                    collUserPreferences = UserPreferencePeer.doSelect(criteria);
                }
            }
        }
        lastUserPreferencesCriteria = criteria;

        return collUserPreferences;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getUserPreferences(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getUserPreferences(Connection con) throws TorqueException
    {
              if (collUserPreferences == null)
        {
            collUserPreferences = getUserPreferences(new Criteria(10), con);
        }
        return collUserPreferences;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related UserPreferences from storage.
     * If this ScarabUserImpl is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getUserPreferences(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collUserPreferences == null)
        {
            if (isNew())
            {
               collUserPreferences = new ArrayList();
            }
            else
            {
                         criteria.add(UserPreferencePeer.USER_ID, getUserId());
                         collUserPreferences = UserPreferencePeer.doSelect(criteria, con);
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
                             criteria.add(UserPreferencePeer.USER_ID, getUserId());
                             if (!lastUserPreferencesCriteria.equals(criteria))
                 {
                     collUserPreferences = UserPreferencePeer.doSelect(criteria, con);
                 }
             }
         }
         lastUserPreferencesCriteria = criteria;

         return collUserPreferences;
           }

                  
              
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related UserPreferences from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getUserPreferencesJoinScarabUserImpl(Criteria criteria)
        throws TorqueException
    {
                    if (collUserPreferences == null)
        {
            if (isNew())
            {
               collUserPreferences = new ArrayList();
            }
            else
            {
                              criteria.add(UserPreferencePeer.USER_ID, getUserId());
                              collUserPreferences = UserPreferencePeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(UserPreferencePeer.USER_ID, getUserId());
                                    if (!lastUserPreferencesCriteria.equals(criteria))
            {
                collUserPreferences = UserPreferencePeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        lastUserPreferencesCriteria = criteria;

        return collUserPreferences;
                }
                            


                          
            
          /**
     * Collection to store aggregation of collUserVotes
     */
    protected List collUserVotes;

    /**
     * Temporary storage of collUserVotes to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initUserVotes()
    {
        if (collUserVotes == null)
        {
            collUserVotes = new ArrayList();
        }
    }

                        
    /**
     * Method called to associate a UserVote object to this object
     * through the UserVote foreign key attribute
     *
     * @param l UserVote
     * @throws TorqueException
     */
    public void addUserVote(UserVote l) throws TorqueException
    {
        getUserVotes().add(l);
        l.setScarabUser((ScarabUserImpl) this);
    }

    /**
     * The criteria used to select the current contents of collUserVotes
     */
    private Criteria lastUserVotesCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getUserVotes(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getUserVotes()
              throws TorqueException
          {
                      if (collUserVotes == null)
        {
            collUserVotes = getUserVotes(new Criteria(10));
        }
                return collUserVotes;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related UserVotes from storage.
     * If this ScarabUserImpl is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getUserVotes(Criteria criteria) throws TorqueException
    {
              if (collUserVotes == null)
        {
            if (isNew())
            {
               collUserVotes = new ArrayList();
            }
            else
            {
                        criteria.add(UserVotePeer.USER_ID, getUserId() );
                        collUserVotes = UserVotePeer.doSelect(criteria);
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
                            criteria.add(UserVotePeer.USER_ID, getUserId());
                            if (!lastUserVotesCriteria.equals(criteria))
                {
                    collUserVotes = UserVotePeer.doSelect(criteria);
                }
            }
        }
        lastUserVotesCriteria = criteria;

        return collUserVotes;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getUserVotes(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getUserVotes(Connection con) throws TorqueException
    {
              if (collUserVotes == null)
        {
            collUserVotes = getUserVotes(new Criteria(10), con);
        }
        return collUserVotes;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related UserVotes from storage.
     * If this ScarabUserImpl is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getUserVotes(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collUserVotes == null)
        {
            if (isNew())
            {
               collUserVotes = new ArrayList();
            }
            else
            {
                         criteria.add(UserVotePeer.USER_ID, getUserId());
                         collUserVotes = UserVotePeer.doSelect(criteria, con);
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
                             criteria.add(UserVotePeer.USER_ID, getUserId());
                             if (!lastUserVotesCriteria.equals(criteria))
                 {
                     collUserVotes = UserVotePeer.doSelect(criteria, con);
                 }
             }
         }
         lastUserVotesCriteria = criteria;

         return collUserVotes;
           }

                        
              
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related UserVotes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getUserVotesJoinScarabModule(Criteria criteria)
        throws TorqueException
    {
                    if (collUserVotes == null)
        {
            if (isNew())
            {
               collUserVotes = new ArrayList();
            }
            else
            {
                              criteria.add(UserVotePeer.USER_ID, getUserId());
                              collUserVotes = UserVotePeer.doSelectJoinScarabModule(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(UserVotePeer.USER_ID, getUserId());
                                    if (!lastUserVotesCriteria.equals(criteria))
            {
                collUserVotes = UserVotePeer.doSelectJoinScarabModule(criteria);
            }
        }
        lastUserVotesCriteria = criteria;

        return collUserVotes;
                }
                  
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related UserVotes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getUserVotesJoinScarabUserImpl(Criteria criteria)
        throws TorqueException
    {
                    if (collUserVotes == null)
        {
            if (isNew())
            {
               collUserVotes = new ArrayList();
            }
            else
            {
                              criteria.add(UserVotePeer.USER_ID, getUserId());
                              collUserVotes = UserVotePeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(UserVotePeer.USER_ID, getUserId());
                                    if (!lastUserVotesCriteria.equals(criteria))
            {
                collUserVotes = UserVotePeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        lastUserVotesCriteria = criteria;

        return collUserVotes;
                }
                            


                          
            
          /**
     * Collection to store aggregation of collIssueVotes
     */
    protected List collIssueVotes;

    /**
     * Temporary storage of collIssueVotes to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initIssueVotes()
    {
        if (collIssueVotes == null)
        {
            collIssueVotes = new ArrayList();
        }
    }

                        
    /**
     * Method called to associate a IssueVote object to this object
     * through the IssueVote foreign key attribute
     *
     * @param l IssueVote
     * @throws TorqueException
     */
    public void addIssueVote(IssueVote l) throws TorqueException
    {
        getIssueVotes().add(l);
        l.setScarabUser((ScarabUserImpl) this);
    }

    /**
     * The criteria used to select the current contents of collIssueVotes
     */
    private Criteria lastIssueVotesCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getIssueVotes(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getIssueVotes()
              throws TorqueException
          {
                      if (collIssueVotes == null)
        {
            collIssueVotes = getIssueVotes(new Criteria(10));
        }
                return collIssueVotes;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related IssueVotes from storage.
     * If this ScarabUserImpl is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getIssueVotes(Criteria criteria) throws TorqueException
    {
              if (collIssueVotes == null)
        {
            if (isNew())
            {
               collIssueVotes = new ArrayList();
            }
            else
            {
                        criteria.add(IssueVotePeer.USER_ID, getUserId() );
                        collIssueVotes = IssueVotePeer.doSelect(criteria);
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
                            criteria.add(IssueVotePeer.USER_ID, getUserId());
                            if (!lastIssueVotesCriteria.equals(criteria))
                {
                    collIssueVotes = IssueVotePeer.doSelect(criteria);
                }
            }
        }
        lastIssueVotesCriteria = criteria;

        return collIssueVotes;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getIssueVotes(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getIssueVotes(Connection con) throws TorqueException
    {
              if (collIssueVotes == null)
        {
            collIssueVotes = getIssueVotes(new Criteria(10), con);
        }
        return collIssueVotes;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related IssueVotes from storage.
     * If this ScarabUserImpl is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getIssueVotes(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collIssueVotes == null)
        {
            if (isNew())
            {
               collIssueVotes = new ArrayList();
            }
            else
            {
                         criteria.add(IssueVotePeer.USER_ID, getUserId());
                         collIssueVotes = IssueVotePeer.doSelect(criteria, con);
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
                             criteria.add(IssueVotePeer.USER_ID, getUserId());
                             if (!lastIssueVotesCriteria.equals(criteria))
                 {
                     collIssueVotes = IssueVotePeer.doSelect(criteria, con);
                 }
             }
         }
         lastIssueVotesCriteria = criteria;

         return collIssueVotes;
           }

                        
              
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related IssueVotes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getIssueVotesJoinIssue(Criteria criteria)
        throws TorqueException
    {
                    if (collIssueVotes == null)
        {
            if (isNew())
            {
               collIssueVotes = new ArrayList();
            }
            else
            {
                              criteria.add(IssueVotePeer.USER_ID, getUserId());
                              collIssueVotes = IssueVotePeer.doSelectJoinIssue(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(IssueVotePeer.USER_ID, getUserId());
                                    if (!lastIssueVotesCriteria.equals(criteria))
            {
                collIssueVotes = IssueVotePeer.doSelectJoinIssue(criteria);
            }
        }
        lastIssueVotesCriteria = criteria;

        return collIssueVotes;
                }
                  
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related IssueVotes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getIssueVotesJoinScarabUserImpl(Criteria criteria)
        throws TorqueException
    {
                    if (collIssueVotes == null)
        {
            if (isNew())
            {
               collIssueVotes = new ArrayList();
            }
            else
            {
                              criteria.add(IssueVotePeer.USER_ID, getUserId());
                              collIssueVotes = IssueVotePeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(IssueVotePeer.USER_ID, getUserId());
                                    if (!lastIssueVotesCriteria.equals(criteria))
            {
                collIssueVotes = IssueVotePeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        lastIssueVotesCriteria = criteria;

        return collIssueVotes;
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
        l.setScarabUser((ScarabUserImpl) this);
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
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related Querys from storage.
     * If this ScarabUserImpl is new, it will return
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
                        criteria.add(QueryPeer.USER_ID, getUserId() );
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
                            criteria.add(QueryPeer.USER_ID, getUserId());
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
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related Querys from storage.
     * If this ScarabUserImpl is new, it will return
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
                         criteria.add(QueryPeer.USER_ID, getUserId());
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
                             criteria.add(QueryPeer.USER_ID, getUserId());
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
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related Querys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
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
                              criteria.add(QueryPeer.USER_ID, getUserId());
                              collQuerys = QueryPeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(QueryPeer.USER_ID, getUserId());
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
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related Querys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
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
                              criteria.add(QueryPeer.USER_ID, getUserId());
                              collQuerys = QueryPeer.doSelectJoinScope(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(QueryPeer.USER_ID, getUserId());
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
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related Querys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
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
                              criteria.add(QueryPeer.USER_ID, getUserId());
                              collQuerys = QueryPeer.doSelectJoinScarabModule(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(QueryPeer.USER_ID, getUserId());
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
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related Querys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
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
                              criteria.add(QueryPeer.USER_ID, getUserId());
                              collQuerys = QueryPeer.doSelectJoinIssueType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(QueryPeer.USER_ID, getUserId());
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
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related Querys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
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
                              criteria.add(QueryPeer.USER_ID, getUserId());
                              collQuerys = QueryPeer.doSelectJoinMITList(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(QueryPeer.USER_ID, getUserId());
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
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related Querys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
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
                              criteria.add(QueryPeer.USER_ID, getUserId());
                              collQuerys = QueryPeer.doSelectJoinFrequency(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(QueryPeer.USER_ID, getUserId());
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
        l.setScarabUser((ScarabUserImpl) this);
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
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related RQueryUsers from storage.
     * If this ScarabUserImpl is new, it will return
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
                        criteria.add(RQueryUserPeer.USER_ID, getUserId() );
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
                            criteria.add(RQueryUserPeer.USER_ID, getUserId());
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
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related RQueryUsers from storage.
     * If this ScarabUserImpl is new, it will return
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
                         criteria.add(RQueryUserPeer.USER_ID, getUserId());
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
                             criteria.add(RQueryUserPeer.USER_ID, getUserId());
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
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related RQueryUsers from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
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
                              criteria.add(RQueryUserPeer.USER_ID, getUserId());
                              collRQueryUsers = RQueryUserPeer.doSelectJoinQuery(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RQueryUserPeer.USER_ID, getUserId());
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
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related RQueryUsers from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
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
                              criteria.add(RQueryUserPeer.USER_ID, getUserId());
                              collRQueryUsers = RQueryUserPeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RQueryUserPeer.USER_ID, getUserId());
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
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related RQueryUsers from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
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
                              criteria.add(RQueryUserPeer.USER_ID, getUserId());
                              collRQueryUsers = RQueryUserPeer.doSelectJoinFrequency(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RQueryUserPeer.USER_ID, getUserId());
                                    if (!lastRQueryUsersCriteria.equals(criteria))
            {
                collRQueryUsers = RQueryUserPeer.doSelectJoinFrequency(criteria);
            }
        }
        lastRQueryUsersCriteria = criteria;

        return collRQueryUsers;
                }
                            


                          
            
          /**
     * Collection to store aggregation of collReports
     */
    protected List collReports;

    /**
     * Temporary storage of collReports to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initReports()
    {
        if (collReports == null)
        {
            collReports = new ArrayList();
        }
    }

                        
    /**
     * Method called to associate a Report object to this object
     * through the Report foreign key attribute
     *
     * @param l Report
     * @throws TorqueException
     */
    public void addReport(Report l) throws TorqueException
    {
        getReports().add(l);
        l.setScarabUser((ScarabUserImpl) this);
    }

    /**
     * The criteria used to select the current contents of collReports
     */
    private Criteria lastReportsCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getReports(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getReports()
              throws TorqueException
          {
                      if (collReports == null)
        {
            collReports = getReports(new Criteria(10));
        }
                return collReports;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related Reports from storage.
     * If this ScarabUserImpl is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getReports(Criteria criteria) throws TorqueException
    {
              if (collReports == null)
        {
            if (isNew())
            {
               collReports = new ArrayList();
            }
            else
            {
                        criteria.add(ReportPeer.USER_ID, getUserId() );
                        collReports = ReportPeer.doSelect(criteria);
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
                            criteria.add(ReportPeer.USER_ID, getUserId());
                            if (!lastReportsCriteria.equals(criteria))
                {
                    collReports = ReportPeer.doSelect(criteria);
                }
            }
        }
        lastReportsCriteria = criteria;

        return collReports;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getReports(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getReports(Connection con) throws TorqueException
    {
              if (collReports == null)
        {
            collReports = getReports(new Criteria(10), con);
        }
        return collReports;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related Reports from storage.
     * If this ScarabUserImpl is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getReports(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collReports == null)
        {
            if (isNew())
            {
               collReports = new ArrayList();
            }
            else
            {
                         criteria.add(ReportPeer.USER_ID, getUserId());
                         collReports = ReportPeer.doSelect(criteria, con);
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
                             criteria.add(ReportPeer.USER_ID, getUserId());
                             if (!lastReportsCriteria.equals(criteria))
                 {
                     collReports = ReportPeer.doSelect(criteria, con);
                 }
             }
         }
         lastReportsCriteria = criteria;

         return collReports;
           }

                                    
              
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related Reports from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getReportsJoinIssueType(Criteria criteria)
        throws TorqueException
    {
                    if (collReports == null)
        {
            if (isNew())
            {
               collReports = new ArrayList();
            }
            else
            {
                              criteria.add(ReportPeer.USER_ID, getUserId());
                              collReports = ReportPeer.doSelectJoinIssueType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ReportPeer.USER_ID, getUserId());
                                    if (!lastReportsCriteria.equals(criteria))
            {
                collReports = ReportPeer.doSelectJoinIssueType(criteria);
            }
        }
        lastReportsCriteria = criteria;

        return collReports;
                }
                  
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related Reports from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getReportsJoinScarabUserImpl(Criteria criteria)
        throws TorqueException
    {
                    if (collReports == null)
        {
            if (isNew())
            {
               collReports = new ArrayList();
            }
            else
            {
                              criteria.add(ReportPeer.USER_ID, getUserId());
                              collReports = ReportPeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ReportPeer.USER_ID, getUserId());
                                    if (!lastReportsCriteria.equals(criteria))
            {
                collReports = ReportPeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        lastReportsCriteria = criteria;

        return collReports;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related Reports from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getReportsJoinScarabModule(Criteria criteria)
        throws TorqueException
    {
                    if (collReports == null)
        {
            if (isNew())
            {
               collReports = new ArrayList();
            }
            else
            {
                              criteria.add(ReportPeer.USER_ID, getUserId());
                              collReports = ReportPeer.doSelectJoinScarabModule(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ReportPeer.USER_ID, getUserId());
                                    if (!lastReportsCriteria.equals(criteria))
            {
                collReports = ReportPeer.doSelectJoinScarabModule(criteria);
            }
        }
        lastReportsCriteria = criteria;

        return collReports;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related Reports from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getReportsJoinScope(Criteria criteria)
        throws TorqueException
    {
                    if (collReports == null)
        {
            if (isNew())
            {
               collReports = new ArrayList();
            }
            else
            {
                              criteria.add(ReportPeer.USER_ID, getUserId());
                              collReports = ReportPeer.doSelectJoinScope(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ReportPeer.USER_ID, getUserId());
                                    if (!lastReportsCriteria.equals(criteria))
            {
                collReports = ReportPeer.doSelectJoinScope(criteria);
            }
        }
        lastReportsCriteria = criteria;

        return collReports;
                }
                            


                          
            
          /**
     * Collection to store aggregation of collPendingGroupUserRoles
     */
    protected List collPendingGroupUserRoles;

    /**
     * Temporary storage of collPendingGroupUserRoles to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initPendingGroupUserRoles()
    {
        if (collPendingGroupUserRoles == null)
        {
            collPendingGroupUserRoles = new ArrayList();
        }
    }

                        
    /**
     * Method called to associate a PendingGroupUserRole object to this object
     * through the PendingGroupUserRole foreign key attribute
     *
     * @param l PendingGroupUserRole
     * @throws TorqueException
     */
    public void addPendingGroupUserRole(PendingGroupUserRole l) throws TorqueException
    {
        getPendingGroupUserRoles().add(l);
        l.setScarabUser((ScarabUserImpl) this);
    }

    /**
     * The criteria used to select the current contents of collPendingGroupUserRoles
     */
    private Criteria lastPendingGroupUserRolesCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getPendingGroupUserRoles(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getPendingGroupUserRoles()
              throws TorqueException
          {
                      if (collPendingGroupUserRoles == null)
        {
            collPendingGroupUserRoles = getPendingGroupUserRoles(new Criteria(10));
        }
                return collPendingGroupUserRoles;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related PendingGroupUserRoles from storage.
     * If this ScarabUserImpl is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getPendingGroupUserRoles(Criteria criteria) throws TorqueException
    {
              if (collPendingGroupUserRoles == null)
        {
            if (isNew())
            {
               collPendingGroupUserRoles = new ArrayList();
            }
            else
            {
                        criteria.add(PendingGroupUserRolePeer.USER_ID, getUserId() );
                        collPendingGroupUserRoles = PendingGroupUserRolePeer.doSelect(criteria);
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
                            criteria.add(PendingGroupUserRolePeer.USER_ID, getUserId());
                            if (!lastPendingGroupUserRolesCriteria.equals(criteria))
                {
                    collPendingGroupUserRoles = PendingGroupUserRolePeer.doSelect(criteria);
                }
            }
        }
        lastPendingGroupUserRolesCriteria = criteria;

        return collPendingGroupUserRoles;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getPendingGroupUserRoles(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getPendingGroupUserRoles(Connection con) throws TorqueException
    {
              if (collPendingGroupUserRoles == null)
        {
            collPendingGroupUserRoles = getPendingGroupUserRoles(new Criteria(10), con);
        }
        return collPendingGroupUserRoles;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related PendingGroupUserRoles from storage.
     * If this ScarabUserImpl is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getPendingGroupUserRoles(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collPendingGroupUserRoles == null)
        {
            if (isNew())
            {
               collPendingGroupUserRoles = new ArrayList();
            }
            else
            {
                         criteria.add(PendingGroupUserRolePeer.USER_ID, getUserId());
                         collPendingGroupUserRoles = PendingGroupUserRolePeer.doSelect(criteria, con);
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
                             criteria.add(PendingGroupUserRolePeer.USER_ID, getUserId());
                             if (!lastPendingGroupUserRolesCriteria.equals(criteria))
                 {
                     collPendingGroupUserRoles = PendingGroupUserRolePeer.doSelect(criteria, con);
                 }
             }
         }
         lastPendingGroupUserRolesCriteria = criteria;

         return collPendingGroupUserRoles;
           }

                        
              
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related PendingGroupUserRoles from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getPendingGroupUserRolesJoinScarabUserImpl(Criteria criteria)
        throws TorqueException
    {
                    if (collPendingGroupUserRoles == null)
        {
            if (isNew())
            {
               collPendingGroupUserRoles = new ArrayList();
            }
            else
            {
                              criteria.add(PendingGroupUserRolePeer.USER_ID, getUserId());
                              collPendingGroupUserRoles = PendingGroupUserRolePeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(PendingGroupUserRolePeer.USER_ID, getUserId());
                                    if (!lastPendingGroupUserRolesCriteria.equals(criteria))
            {
                collPendingGroupUserRoles = PendingGroupUserRolePeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        lastPendingGroupUserRolesCriteria = criteria;

        return collPendingGroupUserRoles;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related PendingGroupUserRoles from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getPendingGroupUserRolesJoinScarabModule(Criteria criteria)
        throws TorqueException
    {
                    if (collPendingGroupUserRoles == null)
        {
            if (isNew())
            {
               collPendingGroupUserRoles = new ArrayList();
            }
            else
            {
                              criteria.add(PendingGroupUserRolePeer.USER_ID, getUserId());
                              collPendingGroupUserRoles = PendingGroupUserRolePeer.doSelectJoinScarabModule(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(PendingGroupUserRolePeer.USER_ID, getUserId());
                                    if (!lastPendingGroupUserRolesCriteria.equals(criteria))
            {
                collPendingGroupUserRoles = PendingGroupUserRolePeer.doSelectJoinScarabModule(criteria);
            }
        }
        lastPendingGroupUserRolesCriteria = criteria;

        return collPendingGroupUserRoles;
                }
                            


                          
            
          /**
     * Collection to store aggregation of collNotificationStatuss
     */
    protected List collNotificationStatuss;

    /**
     * Temporary storage of collNotificationStatuss to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initNotificationStatuss()
    {
        if (collNotificationStatuss == null)
        {
            collNotificationStatuss = new ArrayList();
        }
    }

                        
    /**
     * Method called to associate a NotificationStatus object to this object
     * through the NotificationStatus foreign key attribute
     *
     * @param l NotificationStatus
     * @throws TorqueException
     */
    public void addNotificationStatus(NotificationStatus l) throws TorqueException
    {
        getNotificationStatuss().add(l);
        l.setScarabUser((ScarabUserImpl) this);
    }

    /**
     * The criteria used to select the current contents of collNotificationStatuss
     */
    private Criteria lastNotificationStatussCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getNotificationStatuss(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getNotificationStatuss()
              throws TorqueException
          {
                      if (collNotificationStatuss == null)
        {
            collNotificationStatuss = getNotificationStatuss(new Criteria(10));
        }
                return collNotificationStatuss;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related NotificationStatuss from storage.
     * If this ScarabUserImpl is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getNotificationStatuss(Criteria criteria) throws TorqueException
    {
              if (collNotificationStatuss == null)
        {
            if (isNew())
            {
               collNotificationStatuss = new ArrayList();
            }
            else
            {
                        criteria.add(NotificationStatusPeer.CREATOR_ID, getUserId() );
                        collNotificationStatuss = NotificationStatusPeer.doSelect(criteria);
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
                            criteria.add(NotificationStatusPeer.CREATOR_ID, getUserId());
                            if (!lastNotificationStatussCriteria.equals(criteria))
                {
                    collNotificationStatuss = NotificationStatusPeer.doSelect(criteria);
                }
            }
        }
        lastNotificationStatussCriteria = criteria;

        return collNotificationStatuss;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getNotificationStatuss(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getNotificationStatuss(Connection con) throws TorqueException
    {
              if (collNotificationStatuss == null)
        {
            collNotificationStatuss = getNotificationStatuss(new Criteria(10), con);
        }
        return collNotificationStatuss;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related NotificationStatuss from storage.
     * If this ScarabUserImpl is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getNotificationStatuss(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collNotificationStatuss == null)
        {
            if (isNew())
            {
               collNotificationStatuss = new ArrayList();
            }
            else
            {
                         criteria.add(NotificationStatusPeer.CREATOR_ID, getUserId());
                         collNotificationStatuss = NotificationStatusPeer.doSelect(criteria, con);
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
                             criteria.add(NotificationStatusPeer.CREATOR_ID, getUserId());
                             if (!lastNotificationStatussCriteria.equals(criteria))
                 {
                     collNotificationStatuss = NotificationStatusPeer.doSelect(criteria, con);
                 }
             }
         }
         lastNotificationStatussCriteria = criteria;

         return collNotificationStatuss;
           }

                        
              
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related NotificationStatuss from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getNotificationStatussJoinScarabUserImpl(Criteria criteria)
        throws TorqueException
    {
                    if (collNotificationStatuss == null)
        {
            if (isNew())
            {
               collNotificationStatuss = new ArrayList();
            }
            else
            {
                              criteria.add(NotificationStatusPeer.CREATOR_ID, getUserId());
                              collNotificationStatuss = NotificationStatusPeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(NotificationStatusPeer.CREATOR_ID, getUserId());
                                    if (!lastNotificationStatussCriteria.equals(criteria))
            {
                collNotificationStatuss = NotificationStatusPeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        lastNotificationStatussCriteria = criteria;

        return collNotificationStatuss;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related NotificationStatuss from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getNotificationStatussJoinActivity(Criteria criteria)
        throws TorqueException
    {
                    if (collNotificationStatuss == null)
        {
            if (isNew())
            {
               collNotificationStatuss = new ArrayList();
            }
            else
            {
                              criteria.add(NotificationStatusPeer.CREATOR_ID, getUserId());
                              collNotificationStatuss = NotificationStatusPeer.doSelectJoinActivity(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(NotificationStatusPeer.CREATOR_ID, getUserId());
                                    if (!lastNotificationStatussCriteria.equals(criteria))
            {
                collNotificationStatuss = NotificationStatusPeer.doSelectJoinActivity(criteria);
            }
        }
        lastNotificationStatussCriteria = criteria;

        return collNotificationStatuss;
                }
                            


                          
            
          /**
     * Collection to store aggregation of collNotificationFilters
     */
    protected List collNotificationFilters;

    /**
     * Temporary storage of collNotificationFilters to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initNotificationFilters()
    {
        if (collNotificationFilters == null)
        {
            collNotificationFilters = new ArrayList();
        }
    }

                        
    /**
     * Method called to associate a NotificationFilter object to this object
     * through the NotificationFilter foreign key attribute
     *
     * @param l NotificationFilter
     * @throws TorqueException
     */
    public void addNotificationFilter(NotificationFilter l) throws TorqueException
    {
        getNotificationFilters().add(l);
        l.setScarabUser((ScarabUserImpl) this);
    }

    /**
     * The criteria used to select the current contents of collNotificationFilters
     */
    private Criteria lastNotificationFiltersCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getNotificationFilters(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getNotificationFilters()
              throws TorqueException
          {
                      if (collNotificationFilters == null)
        {
            collNotificationFilters = getNotificationFilters(new Criteria(10));
        }
                return collNotificationFilters;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related NotificationFilters from storage.
     * If this ScarabUserImpl is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getNotificationFilters(Criteria criteria) throws TorqueException
    {
              if (collNotificationFilters == null)
        {
            if (isNew())
            {
               collNotificationFilters = new ArrayList();
            }
            else
            {
                        criteria.add(NotificationFilterPeer.USER_ID, getUserId() );
                        collNotificationFilters = NotificationFilterPeer.doSelect(criteria);
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
                            criteria.add(NotificationFilterPeer.USER_ID, getUserId());
                            if (!lastNotificationFiltersCriteria.equals(criteria))
                {
                    collNotificationFilters = NotificationFilterPeer.doSelect(criteria);
                }
            }
        }
        lastNotificationFiltersCriteria = criteria;

        return collNotificationFilters;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getNotificationFilters(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getNotificationFilters(Connection con) throws TorqueException
    {
              if (collNotificationFilters == null)
        {
            collNotificationFilters = getNotificationFilters(new Criteria(10), con);
        }
        return collNotificationFilters;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl has previously
           * been saved, it will retrieve related NotificationFilters from storage.
     * If this ScarabUserImpl is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getNotificationFilters(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collNotificationFilters == null)
        {
            if (isNew())
            {
               collNotificationFilters = new ArrayList();
            }
            else
            {
                         criteria.add(NotificationFilterPeer.USER_ID, getUserId());
                         collNotificationFilters = NotificationFilterPeer.doSelect(criteria, con);
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
                             criteria.add(NotificationFilterPeer.USER_ID, getUserId());
                             if (!lastNotificationFiltersCriteria.equals(criteria))
                 {
                     collNotificationFilters = NotificationFilterPeer.doSelect(criteria, con);
                 }
             }
         }
         lastNotificationFiltersCriteria = criteria;

         return collNotificationFilters;
           }

                        
              
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related NotificationFilters from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getNotificationFiltersJoinScarabUserImpl(Criteria criteria)
        throws TorqueException
    {
                    if (collNotificationFilters == null)
        {
            if (isNew())
            {
               collNotificationFilters = new ArrayList();
            }
            else
            {
                              criteria.add(NotificationFilterPeer.USER_ID, getUserId());
                              collNotificationFilters = NotificationFilterPeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(NotificationFilterPeer.USER_ID, getUserId());
                                    if (!lastNotificationFiltersCriteria.equals(criteria))
            {
                collNotificationFilters = NotificationFilterPeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        lastNotificationFiltersCriteria = criteria;

        return collNotificationFilters;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabUserImpl is new, it will return
                 * an empty collection; or if this ScarabUserImpl has previously
     * been saved, it will retrieve related NotificationFilters from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabUserImpl.
     */
    protected List getNotificationFiltersJoinScarabModule(Criteria criteria)
        throws TorqueException
    {
                    if (collNotificationFilters == null)
        {
            if (isNew())
            {
               collNotificationFilters = new ArrayList();
            }
            else
            {
                              criteria.add(NotificationFilterPeer.USER_ID, getUserId());
                              collNotificationFilters = NotificationFilterPeer.doSelectJoinScarabModule(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(NotificationFilterPeer.USER_ID, getUserId());
                                    if (!lastNotificationFiltersCriteria.equals(criteria))
            {
                collNotificationFilters = NotificationFilterPeer.doSelectJoinScarabModule(criteria);
            }
        }
        lastNotificationFiltersCriteria = criteria;

        return collNotificationFilters;
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
        str.append("ScarabUserImpl:\n");
        str.append("UserId = ")
               .append(getUserId())
             .append("\n");
        return(str.toString());
    }
}
