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
 * extended all references should be to MITList
 */
public abstract class BaseMITList extends BaseObject
    implements org.apache.fulcrum.intake.Retrievable
{
    /** The Peer class */
    private static final MITListPeer peer =
        new MITListPeer();

        
    /** The value for the listId field */
    private Long listId;
      
    /** The value for the name field */
    private String name;
                                                                
    /** The value for the active field */
    private boolean active = true;
                                                                
    /** The value for the modifiable field */
    private boolean modifiable = true;
      
    /** The value for the userId field */
    private Integer userId;
  
            
    /**
     * Get the ListId
     *
     * @return Long
     */
    public Long getListId()
    {
        return listId;
    }

                                              
    /**
     * Set the value of ListId
     *
     * @param v new value
     */
    public void setListId(Long v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.listId, v))
              {
            this.listId = v;
            setModified(true);
        }
    
          
                                  
                  // update associated MITListItem
        if (collMITListItems != null)
        {
            for (int i = 0; i < collMITListItems.size(); i++)
            {
                ((MITListItem) collMITListItems.get(i))
                        .setListId(v);
            }
        }
                                                    
                  // update associated RModuleUserAttribute
        if (collRModuleUserAttributes != null)
        {
            for (int i = 0; i < collRModuleUserAttributes.size(); i++)
            {
                ((RModuleUserAttribute) collRModuleUserAttributes.get(i))
                        .setListId(v);
            }
        }
                                                    
                  // update associated Query
        if (collQuerys != null)
        {
            for (int i = 0; i < collQuerys.size(); i++)
            {
                ((Query) collQuerys.get(i))
                        .setListId(v);
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
     * Get the Active
     *
     * @return boolean
     */
    public boolean getActive()
    {
        return active;
    }

                        
    /**
     * Set the value of Active
     *
     * @param v new value
     */
    public void setActive(boolean v) 
    {
    
                  if (this.active != v)
              {
            this.active = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the Modifiable
     *
     * @return boolean
     */
    public boolean getModifiable()
    {
        return modifiable;
    }

                        
    /**
     * Set the value of Modifiable
     *
     * @param v new value
     */
    public void setModifiable(boolean v) 
    {
    
                  if (this.modifiable != v)
              {
            this.modifiable = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the UserId
     *
     * @return Integer
     */
    public Integer getUserId()
    {
        return userId;
    }

                              
    /**
     * Set the value of UserId
     *
     * @param v new value
     */
    public void setUserId(Integer v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.userId, v))
              {
            this.userId = v;
            setModified(true);
        }
    
                                          
                if (aScarabUser != null && !ObjectUtils.equals(aScarabUser.getUserId(), v))
                {
            aScarabUser = null;
        }
      
              }
  
      
            
                  
    
        private ScarabUser aScarabUser;

    /**
     * Declares an association between this object and a ScarabUser object
     *
     * @param v ScarabUser
     * @throws TorqueException
     */
    public void setScarabUser(ScarabUser v) throws TorqueException
    {
            if (v == null)
        {
                  setUserId((Integer) null);
              }
        else
        {
            setUserId(v.getUserId());
        }
            aScarabUser = v;
    }

                        
    /**
     * Returns the associated ScarabUser object.
           * If it was not retrieved before, the object is retrieved from
     * the database
           *
     * @return the associated ScarabUser object
           * @throws TorqueException
           */
    public ScarabUser getScarabUser()
              throws TorqueException
          {
              if (aScarabUser == null && (!ObjectUtils.equals(this.userId, null)))
        {
                    aScarabUser = ScarabUserManager.getInstance(SimpleKey.keyFor(this.userId));
                }
              return aScarabUser;
    }

    /**
     * Return the associated ScarabUser object
     * If it was not retrieved before, the object is retrieved from
     * the database using the passed connection
     *
     * @param connection the connection used to retrieve the associated object
     *        from the database, if it was not retrieved before
     * @return the associated ScarabUser object
     * @throws TorqueException
     */
    public ScarabUser getScarabUser(Connection connection)
        throws TorqueException
    {
        if (aScarabUser == null && (!ObjectUtils.equals(this.userId, null)))
        {
                    aScarabUser = ScarabUserManager.getCachedInstance(SimpleKey.keyFor(this.userId));
            if (aScarabUser == null)
            {
                          aScarabUser = ScarabUserImplPeer.retrieveScarabUserImplByPK(SimpleKey.keyFor(this.userId), connection);
                          ScarabUserManager.putInstance(aScarabUser);
            }
                }
        return aScarabUser;
    }
    
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setScarabUserKey(ObjectKey key) throws TorqueException
    {
    
                    setUserId(new Integer(((NumberKey) key).intValue()));
              }
     
                                
            
          /**
     * Collection to store aggregation of collMITListItems
     */
    protected List collMITListItems;

    /**
     * Temporary storage of collMITListItems to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initMITListItems()
    {
        if (collMITListItems == null)
        {
            collMITListItems = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a MITListItem object to this object
     * through the MITListItem foreign key attribute
     *
     * @param l MITListItem
     * @throws TorqueException
     */
    public void addMITListItem(MITListItem l) throws TorqueException
    {
        getMITListItems().add(l);
        l.setMITList((MITList) this);
    }

    /**
     * The criteria used to select the current contents of collMITListItems
     */
    private Criteria lastMITListItemsCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getMITListItems(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getMITListItems()
              throws TorqueException
          {
                      if (collMITListItems == null)
        {
            collMITListItems = getMITListItems(new Criteria(10));
        }
                return collMITListItems;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this MITList has previously
           * been saved, it will retrieve related MITListItems from storage.
     * If this MITList is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getMITListItems(Criteria criteria) throws TorqueException
    {
              if (collMITListItems == null)
        {
            if (isNew())
            {
               collMITListItems = new ArrayList();
            }
            else
            {
                        criteria.add(MITListItemPeer.LIST_ID, getListId() );
                        collMITListItems = MITListItemPeer.doSelect(criteria);
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
                            criteria.add(MITListItemPeer.LIST_ID, getListId());
                            if (!lastMITListItemsCriteria.equals(criteria))
                {
                    collMITListItems = MITListItemPeer.doSelect(criteria);
                }
            }
        }
        lastMITListItemsCriteria = criteria;

        return collMITListItems;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getMITListItems(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getMITListItems(Connection con) throws TorqueException
    {
              if (collMITListItems == null)
        {
            collMITListItems = getMITListItems(new Criteria(10), con);
        }
        return collMITListItems;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this MITList has previously
           * been saved, it will retrieve related MITListItems from storage.
     * If this MITList is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getMITListItems(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collMITListItems == null)
        {
            if (isNew())
            {
               collMITListItems = new ArrayList();
            }
            else
            {
                         criteria.add(MITListItemPeer.LIST_ID, getListId());
                         collMITListItems = MITListItemPeer.doSelect(criteria, con);
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
                             criteria.add(MITListItemPeer.LIST_ID, getListId());
                             if (!lastMITListItemsCriteria.equals(criteria))
                 {
                     collMITListItems = MITListItemPeer.doSelect(criteria, con);
                 }
             }
         }
         lastMITListItemsCriteria = criteria;

         return collMITListItems;
           }

                              
              
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this MITList is new, it will return
                 * an empty collection; or if this MITList has previously
     * been saved, it will retrieve related MITListItems from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in MITList.
     */
    protected List getMITListItemsJoinMITList(Criteria criteria)
        throws TorqueException
    {
                    if (collMITListItems == null)
        {
            if (isNew())
            {
               collMITListItems = new ArrayList();
            }
            else
            {
                              criteria.add(MITListItemPeer.LIST_ID, getListId());
                              collMITListItems = MITListItemPeer.doSelectJoinMITList(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(MITListItemPeer.LIST_ID, getListId());
                                    if (!lastMITListItemsCriteria.equals(criteria))
            {
                collMITListItems = MITListItemPeer.doSelectJoinMITList(criteria);
            }
        }
        lastMITListItemsCriteria = criteria;

        return collMITListItems;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this MITList is new, it will return
                 * an empty collection; or if this MITList has previously
     * been saved, it will retrieve related MITListItems from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in MITList.
     */
    protected List getMITListItemsJoinScarabModule(Criteria criteria)
        throws TorqueException
    {
                    if (collMITListItems == null)
        {
            if (isNew())
            {
               collMITListItems = new ArrayList();
            }
            else
            {
                              criteria.add(MITListItemPeer.LIST_ID, getListId());
                              collMITListItems = MITListItemPeer.doSelectJoinScarabModule(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(MITListItemPeer.LIST_ID, getListId());
                                    if (!lastMITListItemsCriteria.equals(criteria))
            {
                collMITListItems = MITListItemPeer.doSelectJoinScarabModule(criteria);
            }
        }
        lastMITListItemsCriteria = criteria;

        return collMITListItems;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this MITList is new, it will return
                 * an empty collection; or if this MITList has previously
     * been saved, it will retrieve related MITListItems from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in MITList.
     */
    protected List getMITListItemsJoinIssueType(Criteria criteria)
        throws TorqueException
    {
                    if (collMITListItems == null)
        {
            if (isNew())
            {
               collMITListItems = new ArrayList();
            }
            else
            {
                              criteria.add(MITListItemPeer.LIST_ID, getListId());
                              collMITListItems = MITListItemPeer.doSelectJoinIssueType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(MITListItemPeer.LIST_ID, getListId());
                                    if (!lastMITListItemsCriteria.equals(criteria))
            {
                collMITListItems = MITListItemPeer.doSelectJoinIssueType(criteria);
            }
        }
        lastMITListItemsCriteria = criteria;

        return collMITListItems;
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
        l.setMITList((MITList) this);
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
     * Otherwise if this MITList has previously
           * been saved, it will retrieve related RModuleUserAttributes from storage.
     * If this MITList is new, it will return
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
                        criteria.add(RModuleUserAttributePeer.LIST_ID, getListId() );
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
                            criteria.add(RModuleUserAttributePeer.LIST_ID, getListId());
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
     * Otherwise if this MITList has previously
           * been saved, it will retrieve related RModuleUserAttributes from storage.
     * If this MITList is new, it will return
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
                         criteria.add(RModuleUserAttributePeer.LIST_ID, getListId());
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
                             criteria.add(RModuleUserAttributePeer.LIST_ID, getListId());
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
     * Otherwise if this MITList is new, it will return
                 * an empty collection; or if this MITList has previously
     * been saved, it will retrieve related RModuleUserAttributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in MITList.
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
                              criteria.add(RModuleUserAttributePeer.LIST_ID, getListId());
                              collRModuleUserAttributes = RModuleUserAttributePeer.doSelectJoinMITList(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleUserAttributePeer.LIST_ID, getListId());
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
     * Otherwise if this MITList is new, it will return
                 * an empty collection; or if this MITList has previously
     * been saved, it will retrieve related RModuleUserAttributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in MITList.
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
                              criteria.add(RModuleUserAttributePeer.LIST_ID, getListId());
                              collRModuleUserAttributes = RModuleUserAttributePeer.doSelectJoinScarabModule(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleUserAttributePeer.LIST_ID, getListId());
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
     * Otherwise if this MITList is new, it will return
                 * an empty collection; or if this MITList has previously
     * been saved, it will retrieve related RModuleUserAttributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in MITList.
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
                              criteria.add(RModuleUserAttributePeer.LIST_ID, getListId());
                              collRModuleUserAttributes = RModuleUserAttributePeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleUserAttributePeer.LIST_ID, getListId());
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
     * Otherwise if this MITList is new, it will return
                 * an empty collection; or if this MITList has previously
     * been saved, it will retrieve related RModuleUserAttributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in MITList.
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
                              criteria.add(RModuleUserAttributePeer.LIST_ID, getListId());
                              collRModuleUserAttributes = RModuleUserAttributePeer.doSelectJoinIssueType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleUserAttributePeer.LIST_ID, getListId());
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
     * Otherwise if this MITList is new, it will return
                 * an empty collection; or if this MITList has previously
     * been saved, it will retrieve related RModuleUserAttributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in MITList.
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
                              criteria.add(RModuleUserAttributePeer.LIST_ID, getListId());
                              collRModuleUserAttributes = RModuleUserAttributePeer.doSelectJoinAttribute(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleUserAttributePeer.LIST_ID, getListId());
                                    if (!lastRModuleUserAttributesCriteria.equals(criteria))
            {
                collRModuleUserAttributes = RModuleUserAttributePeer.doSelectJoinAttribute(criteria);
            }
        }
        lastRModuleUserAttributesCriteria = criteria;

        return collRModuleUserAttributes;
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
        l.setMITList((MITList) this);
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
     * Otherwise if this MITList has previously
           * been saved, it will retrieve related Querys from storage.
     * If this MITList is new, it will return
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
                        criteria.add(QueryPeer.LIST_ID, getListId() );
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
                            criteria.add(QueryPeer.LIST_ID, getListId());
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
     * Otherwise if this MITList has previously
           * been saved, it will retrieve related Querys from storage.
     * If this MITList is new, it will return
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
                         criteria.add(QueryPeer.LIST_ID, getListId());
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
                             criteria.add(QueryPeer.LIST_ID, getListId());
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
     * Otherwise if this MITList is new, it will return
                 * an empty collection; or if this MITList has previously
     * been saved, it will retrieve related Querys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in MITList.
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
                              criteria.add(QueryPeer.LIST_ID, getListId());
                              collQuerys = QueryPeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(QueryPeer.LIST_ID, getListId());
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
     * Otherwise if this MITList is new, it will return
                 * an empty collection; or if this MITList has previously
     * been saved, it will retrieve related Querys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in MITList.
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
                              criteria.add(QueryPeer.LIST_ID, getListId());
                              collQuerys = QueryPeer.doSelectJoinScope(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(QueryPeer.LIST_ID, getListId());
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
     * Otherwise if this MITList is new, it will return
                 * an empty collection; or if this MITList has previously
     * been saved, it will retrieve related Querys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in MITList.
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
                              criteria.add(QueryPeer.LIST_ID, getListId());
                              collQuerys = QueryPeer.doSelectJoinScarabModule(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(QueryPeer.LIST_ID, getListId());
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
     * Otherwise if this MITList is new, it will return
                 * an empty collection; or if this MITList has previously
     * been saved, it will retrieve related Querys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in MITList.
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
                              criteria.add(QueryPeer.LIST_ID, getListId());
                              collQuerys = QueryPeer.doSelectJoinIssueType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(QueryPeer.LIST_ID, getListId());
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
     * Otherwise if this MITList is new, it will return
                 * an empty collection; or if this MITList has previously
     * been saved, it will retrieve related Querys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in MITList.
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
                              criteria.add(QueryPeer.LIST_ID, getListId());
                              collQuerys = QueryPeer.doSelectJoinMITList(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(QueryPeer.LIST_ID, getListId());
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
     * Otherwise if this MITList is new, it will return
                 * an empty collection; or if this MITList has previously
     * been saved, it will retrieve related Querys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in MITList.
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
                              criteria.add(QueryPeer.LIST_ID, getListId());
                              collQuerys = QueryPeer.doSelectJoinFrequency(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(QueryPeer.LIST_ID, getListId());
                                    if (!lastQuerysCriteria.equals(criteria))
            {
                collQuerys = QueryPeer.doSelectJoinFrequency(criteria);
            }
        }
        lastQuerysCriteria = criteria;

        return collQuerys;
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
              fieldNames.add("ListId");
              fieldNames.add("Name");
              fieldNames.add("Active");
              fieldNames.add("Modifiable");
              fieldNames.add("UserId");
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
          if (name.equals("ListId"))
        {
                return getListId();
            }
          if (name.equals("Name"))
        {
                return getName();
            }
          if (name.equals("Active"))
        {
                return Boolean.valueOf(getActive());
            }
          if (name.equals("Modifiable"))
        {
                return Boolean.valueOf(getModifiable());
            }
          if (name.equals("UserId"))
        {
                return getUserId();
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
          if (name.equals(MITListPeer.LIST_ID))
        {
                return getListId();
            }
          if (name.equals(MITListPeer.NAME))
        {
                return getName();
            }
          if (name.equals(MITListPeer.ACTIVE))
        {
                return Boolean.valueOf(getActive());
            }
          if (name.equals(MITListPeer.MODIFIABLE))
        {
                return Boolean.valueOf(getModifiable());
            }
          if (name.equals(MITListPeer.USER_ID))
        {
                return getUserId();
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
                return getListId();
            }
              if (pos == 1)
        {
                return getName();
            }
              if (pos == 2)
        {
                return Boolean.valueOf(getActive());
            }
              if (pos == 3)
        {
                return Boolean.valueOf(getModifiable());
            }
              if (pos == 4)
        {
                return getUserId();
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
          save(MITListPeer.getMapBuilder()
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
                    MITListPeer.doInsert((MITList) this, con);
                    setNew(false);
                }
                else
                {
                    MITListPeer.doUpdate((MITList) this, con);
                }

    
                      if (isCacheOnSave())
                {
                    MITListManager.putInstance(this);
                }
              }

                                      
                                    if (collMITListItems != null)
            {
                for (int i = 0; i < collMITListItems.size(); i++)
                {
                    ((MITListItem) collMITListItems.get(i)).save(con);
                }
            }
                                                  
                                    if (collRModuleUserAttributes != null)
            {
                for (int i = 0; i < collRModuleUserAttributes.size(); i++)
                {
                    ((RModuleUserAttribute) collRModuleUserAttributes.get(i)).save(con);
                }
            }
                                                  
                                    if (collQuerys != null)
            {
                for (int i = 0; i < collQuerys.size(); i++)
                {
                    ((Query) collQuerys.get(i)).save(con);
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
     * @param key listId ObjectKey
     */
    public void setPrimaryKey(ObjectKey key)
        throws TorqueException
    {
            setListId(new Long(((NumberKey) key).longValue()));
        }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) throws TorqueException
    {
            setListId(new Long(key));
        }

  
    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
          return SimpleKey.keyFor(getListId());
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
      public MITList copy() throws TorqueException
    {
        return copyInto(new MITList());
    }
  
    protected MITList copyInto(MITList copyObj) throws TorqueException
    {
          copyObj.setListId(listId);
          copyObj.setName(name);
          copyObj.setActive(active);
          copyObj.setModifiable(modifiable);
          copyObj.setUserId(userId);
  
                    copyObj.setListId((Long)null);
                                    
                                      
                            
        List v = getMITListItems();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                MITListItem obj = (MITListItem) v.get(i);
                copyObj.addMITListItem(obj.copy());
            }
        }
        else
        {
            copyObj.collMITListItems = null;
        }
                                                  
                            
        v = getRModuleUserAttributes();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                RModuleUserAttribute obj = (RModuleUserAttribute) v.get(i);
                copyObj.addRModuleUserAttribute(obj.copy());
            }
        }
        else
        {
            copyObj.collRModuleUserAttributes = null;
        }
                                                  
                            
        v = getQuerys();
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
                            return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public MITListPeer getPeer()
    {
        return peer;
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("MITList:\n");
        str.append("ListId = ")
               .append(getListId())
             .append("\n");
        str.append("Name = ")
               .append(getName())
             .append("\n");
        str.append("Active = ")
               .append(getActive())
             .append("\n");
        str.append("Modifiable = ")
               .append(getModifiable())
             .append("\n");
        str.append("UserId = ")
               .append(getUserId())
             .append("\n");
        return(str.toString());
    }
}
