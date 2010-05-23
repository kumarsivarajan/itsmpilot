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
 * extended all references should be to IssueType
 */
public abstract class BaseIssueType extends BaseObject
    implements org.apache.fulcrum.intake.Retrievable
{
    /** The Peer class */
    private static final IssueTypePeer peer =
        new IssueTypePeer();

        
    /** The value for the issueTypeId field */
    private Integer issueTypeId;
      
    /** The value for the name field */
    private String name;
      
    /** The value for the description field */
    private String description;
      
    /** The value for the parentId field */
    private Integer parentId;
                                                                
    /** The value for the dedupe field */
    private boolean dedupe = true;
                                                                
    /** The value for the deleted field */
    private boolean deleted = false;
                                                                
    /** The value for the locked field */
    private boolean locked = false;
                                                                
    /** The value for the isdefault field */
    private boolean isdefault = false;
  
            
    /**
     * Get the IssueTypeId
     *
     * @return Integer
     */
    public Integer getIssueTypeId()
    {
        return issueTypeId;
    }

                                              
    /**
     * Set the value of IssueTypeId
     *
     * @param v new value
     */
    public void setIssueTypeId(Integer v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.issueTypeId, v))
              {
            this.issueTypeId = v;
            setModified(true);
        }
    
          
                                  
                  // update associated AttributeGroup
        if (collAttributeGroups != null)
        {
            for (int i = 0; i < collAttributeGroups.size(); i++)
            {
                ((AttributeGroup) collAttributeGroups.get(i))
                        .setIssueTypeId(v);
            }
        }
                                                    
                  // update associated Issue
        if (collIssues != null)
        {
            for (int i = 0; i < collIssues.size(); i++)
            {
                ((Issue) collIssues.get(i))
                        .setTypeId(v);
            }
        }
                                                                  
                  // update associated RModuleIssueType
        if (collRModuleIssueTypes != null)
        {
            for (int i = 0; i < collRModuleIssueTypes.size(); i++)
            {
                ((RModuleIssueType) collRModuleIssueTypes.get(i))
                        .setIssueTypeId(v);
            }
        }
                                                    
                  // update associated MITListItem
        if (collMITListItems != null)
        {
            for (int i = 0; i < collMITListItems.size(); i++)
            {
                ((MITListItem) collMITListItems.get(i))
                        .setIssueTypeId(v);
            }
        }
                                                    
                  // update associated RModuleAttribute
        if (collRModuleAttributes != null)
        {
            for (int i = 0; i < collRModuleAttributes.size(); i++)
            {
                ((RModuleAttribute) collRModuleAttributes.get(i))
                        .setIssueTypeId(v);
            }
        }
                                                    
                  // update associated RIssueTypeAttribute
        if (collRIssueTypeAttributes != null)
        {
            for (int i = 0; i < collRIssueTypeAttributes.size(); i++)
            {
                ((RIssueTypeAttribute) collRIssueTypeAttributes.get(i))
                        .setIssueTypeId(v);
            }
        }
                                                    
                  // update associated RModuleOption
        if (collRModuleOptions != null)
        {
            for (int i = 0; i < collRModuleOptions.size(); i++)
            {
                ((RModuleOption) collRModuleOptions.get(i))
                        .setIssueTypeId(v);
            }
        }
                                                    
                  // update associated RIssueTypeOption
        if (collRIssueTypeOptions != null)
        {
            for (int i = 0; i < collRIssueTypeOptions.size(); i++)
            {
                ((RIssueTypeOption) collRIssueTypeOptions.get(i))
                        .setIssueTypeId(v);
            }
        }
                                                    
                  // update associated RModuleUserAttribute
        if (collRModuleUserAttributes != null)
        {
            for (int i = 0; i < collRModuleUserAttributes.size(); i++)
            {
                ((RModuleUserAttribute) collRModuleUserAttributes.get(i))
                        .setIssueTypeId(v);
            }
        }
                                                    
                  // update associated Query
        if (collQuerys != null)
        {
            for (int i = 0; i < collQuerys.size(); i++)
            {
                ((Query) collQuerys.get(i))
                        .setIssueTypeId(v);
            }
        }
                                                    
                  // update associated Report
        if (collReports != null)
        {
            for (int i = 0; i < collReports.size(); i++)
            {
                ((Report) collReports.get(i))
                        .setIssueTypeId(v);
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
     * Get the Description
     *
     * @return String
     */
    public String getDescription()
    {
        return description;
    }

                        
    /**
     * Set the value of Description
     *
     * @param v new value
     */
    public void setDescription(String v) 
    {
    
                  if (!ObjectUtils.equals(this.description, v))
              {
            this.description = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the ParentId
     *
     * @return Integer
     */
    public Integer getParentId()
    {
        return parentId;
    }

                              
    /**
     * Set the value of ParentId
     *
     * @param v new value
     */
    public void setParentId(Integer v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.parentId, v))
              {
            this.parentId = v;
            setModified(true);
        }
    
                                                                          
                if (aIssueTypeRelatedByParentId != null && !ObjectUtils.equals(aIssueTypeRelatedByParentId.getIssueTypeId(), v))
                {
            aIssueTypeRelatedByParentId = null;
        }
      
              }
          
    /**
     * Get the Dedupe
     *
     * @return boolean
     */
    public boolean getDedupe()
    {
        return dedupe;
    }

                        
    /**
     * Set the value of Dedupe
     *
     * @param v new value
     */
    public void setDedupe(boolean v) 
    {
    
                  if (this.dedupe != v)
              {
            this.dedupe = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the Deleted
     *
     * @return boolean
     */
    public boolean getDeleted()
    {
        return deleted;
    }

                        
    /**
     * Set the value of Deleted
     *
     * @param v new value
     */
    public void setDeleted(boolean v) 
    {
    
                  if (this.deleted != v)
              {
            this.deleted = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the Locked
     *
     * @return boolean
     */
    public boolean getLocked()
    {
        return locked;
    }

                        
    /**
     * Set the value of Locked
     *
     * @param v new value
     */
    public void setLocked(boolean v) 
    {
    
                  if (this.locked != v)
              {
            this.locked = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the Isdefault
     *
     * @return boolean
     */
    public boolean getIsdefault()
    {
        return isdefault;
    }

                        
    /**
     * Set the value of Isdefault
     *
     * @param v new value
     */
    public void setIsdefault(boolean v) 
    {
    
                  if (this.isdefault != v)
              {
            this.isdefault = v;
            setModified(true);
        }
    
          
              }
  
      
        
                        
        
        private IssueType aIssueTypeRelatedByParentId;

    /**
     * Declares an association between this object and a IssueType object
     *
     * @param v IssueType
     * @throws TorqueException
     */
    public void setIssueTypeRelatedByParentId(IssueType v) throws TorqueException
    {
            if (v == null)
        {
                  setParentId((Integer) null);
              }
        else
        {
            setParentId(v.getIssueTypeId());
        }
            aIssueTypeRelatedByParentId = v;
    }

                        
    /**
     * Returns the associated IssueType object.
           * If it was not retrieved before, the object is retrieved from
     * the database
           *
     * @return the associated IssueType object
           * @throws TorqueException
           */
    public IssueType getIssueTypeRelatedByParentId()
              throws TorqueException
          {
              if (aIssueTypeRelatedByParentId == null && (!ObjectUtils.equals(this.parentId, null)))
        {
                    aIssueTypeRelatedByParentId = IssueTypeManager.getInstance(SimpleKey.keyFor(this.parentId));
                }
              return aIssueTypeRelatedByParentId;
    }

    /**
     * Return the associated IssueType object
     * If it was not retrieved before, the object is retrieved from
     * the database using the passed connection
     *
     * @param connection the connection used to retrieve the associated object
     *        from the database, if it was not retrieved before
     * @return the associated IssueType object
     * @throws TorqueException
     */
    public IssueType getIssueTypeRelatedByParentId(Connection connection)
        throws TorqueException
    {
        if (aIssueTypeRelatedByParentId == null && (!ObjectUtils.equals(this.parentId, null)))
        {
                    aIssueTypeRelatedByParentId = IssueTypeManager.getCachedInstance(SimpleKey.keyFor(this.parentId));
            if (aIssueTypeRelatedByParentId == null)
            {
                          aIssueTypeRelatedByParentId = IssueTypePeer.retrieveByPK(SimpleKey.keyFor(this.parentId), connection);
                          IssueTypeManager.putInstance(aIssueTypeRelatedByParentId);
            }
                }
        return aIssueTypeRelatedByParentId;
    }
    
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setIssueTypeRelatedByParentIdKey(ObjectKey key) throws TorqueException
    {
    
                    setParentId(new Integer(((NumberKey) key).intValue()));
              }
     
                                
            
          /**
     * Collection to store aggregation of collAttributeGroups
     */
    protected List collAttributeGroups;

    /**
     * Temporary storage of collAttributeGroups to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initAttributeGroups()
    {
        if (collAttributeGroups == null)
        {
            collAttributeGroups = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a AttributeGroup object to this object
     * through the AttributeGroup foreign key attribute
     *
     * @param l AttributeGroup
     * @throws TorqueException
     */
    public void addAttributeGroup(AttributeGroup l) throws TorqueException
    {
        getAttributeGroups().add(l);
        l.setIssueType((IssueType) this);
    }

    /**
     * The criteria used to select the current contents of collAttributeGroups
     */
    private Criteria lastAttributeGroupsCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getAttributeGroups(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getAttributeGroups()
              throws TorqueException
          {
                      if (collAttributeGroups == null)
        {
            collAttributeGroups = getAttributeGroups(new Criteria(10));
        }
                return collAttributeGroups;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this IssueType has previously
           * been saved, it will retrieve related AttributeGroups from storage.
     * If this IssueType is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getAttributeGroups(Criteria criteria) throws TorqueException
    {
              if (collAttributeGroups == null)
        {
            if (isNew())
            {
               collAttributeGroups = new ArrayList();
            }
            else
            {
                        criteria.add(AttributeGroupPeer.ISSUE_TYPE_ID, getIssueTypeId() );
                        collAttributeGroups = AttributeGroupPeer.doSelect(criteria);
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
                            criteria.add(AttributeGroupPeer.ISSUE_TYPE_ID, getIssueTypeId());
                            if (!lastAttributeGroupsCriteria.equals(criteria))
                {
                    collAttributeGroups = AttributeGroupPeer.doSelect(criteria);
                }
            }
        }
        lastAttributeGroupsCriteria = criteria;

        return collAttributeGroups;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getAttributeGroups(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getAttributeGroups(Connection con) throws TorqueException
    {
              if (collAttributeGroups == null)
        {
            collAttributeGroups = getAttributeGroups(new Criteria(10), con);
        }
        return collAttributeGroups;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this IssueType has previously
           * been saved, it will retrieve related AttributeGroups from storage.
     * If this IssueType is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getAttributeGroups(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collAttributeGroups == null)
        {
            if (isNew())
            {
               collAttributeGroups = new ArrayList();
            }
            else
            {
                         criteria.add(AttributeGroupPeer.ISSUE_TYPE_ID, getIssueTypeId());
                         collAttributeGroups = AttributeGroupPeer.doSelect(criteria, con);
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
                             criteria.add(AttributeGroupPeer.ISSUE_TYPE_ID, getIssueTypeId());
                             if (!lastAttributeGroupsCriteria.equals(criteria))
                 {
                     collAttributeGroups = AttributeGroupPeer.doSelect(criteria, con);
                 }
             }
         }
         lastAttributeGroupsCriteria = criteria;

         return collAttributeGroups;
           }

                        
              
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this IssueType is new, it will return
                 * an empty collection; or if this IssueType has previously
     * been saved, it will retrieve related AttributeGroups from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in IssueType.
     */
    protected List getAttributeGroupsJoinScarabModule(Criteria criteria)
        throws TorqueException
    {
                    if (collAttributeGroups == null)
        {
            if (isNew())
            {
               collAttributeGroups = new ArrayList();
            }
            else
            {
                              criteria.add(AttributeGroupPeer.ISSUE_TYPE_ID, getIssueTypeId());
                              collAttributeGroups = AttributeGroupPeer.doSelectJoinScarabModule(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttributeGroupPeer.ISSUE_TYPE_ID, getIssueTypeId());
                                    if (!lastAttributeGroupsCriteria.equals(criteria))
            {
                collAttributeGroups = AttributeGroupPeer.doSelectJoinScarabModule(criteria);
            }
        }
        lastAttributeGroupsCriteria = criteria;

        return collAttributeGroups;
                }
                  
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this IssueType is new, it will return
                 * an empty collection; or if this IssueType has previously
     * been saved, it will retrieve related AttributeGroups from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in IssueType.
     */
    protected List getAttributeGroupsJoinIssueType(Criteria criteria)
        throws TorqueException
    {
                    if (collAttributeGroups == null)
        {
            if (isNew())
            {
               collAttributeGroups = new ArrayList();
            }
            else
            {
                              criteria.add(AttributeGroupPeer.ISSUE_TYPE_ID, getIssueTypeId());
                              collAttributeGroups = AttributeGroupPeer.doSelectJoinIssueType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttributeGroupPeer.ISSUE_TYPE_ID, getIssueTypeId());
                                    if (!lastAttributeGroupsCriteria.equals(criteria))
            {
                collAttributeGroups = AttributeGroupPeer.doSelectJoinIssueType(criteria);
            }
        }
        lastAttributeGroupsCriteria = criteria;

        return collAttributeGroups;
                }
                            


                          
            
          /**
     * Collection to store aggregation of collIssues
     */
    protected List collIssues;

    /**
     * Temporary storage of collIssues to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initIssues()
    {
        if (collIssues == null)
        {
            collIssues = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a Issue object to this object
     * through the Issue foreign key attribute
     *
     * @param l Issue
     * @throws TorqueException
     */
    public void addIssue(Issue l) throws TorqueException
    {
        getIssues().add(l);
        l.setIssueType((IssueType) this);
    }

    /**
     * The criteria used to select the current contents of collIssues
     */
    private Criteria lastIssuesCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getIssues(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getIssues()
              throws TorqueException
          {
                      if (collIssues == null)
        {
            collIssues = getIssues(new Criteria(10));
        }
                return collIssues;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this IssueType has previously
           * been saved, it will retrieve related Issues from storage.
     * If this IssueType is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getIssues(Criteria criteria) throws TorqueException
    {
              if (collIssues == null)
        {
            if (isNew())
            {
               collIssues = new ArrayList();
            }
            else
            {
                        criteria.add(IssuePeer.TYPE_ID, getIssueTypeId() );
                        collIssues = IssuePeer.doSelect(criteria);
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
                            criteria.add(IssuePeer.TYPE_ID, getIssueTypeId());
                            if (!lastIssuesCriteria.equals(criteria))
                {
                    collIssues = IssuePeer.doSelect(criteria);
                }
            }
        }
        lastIssuesCriteria = criteria;

        return collIssues;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getIssues(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getIssues(Connection con) throws TorqueException
    {
              if (collIssues == null)
        {
            collIssues = getIssues(new Criteria(10), con);
        }
        return collIssues;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this IssueType has previously
           * been saved, it will retrieve related Issues from storage.
     * If this IssueType is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getIssues(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collIssues == null)
        {
            if (isNew())
            {
               collIssues = new ArrayList();
            }
            else
            {
                         criteria.add(IssuePeer.TYPE_ID, getIssueTypeId());
                         collIssues = IssuePeer.doSelect(criteria, con);
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
                             criteria.add(IssuePeer.TYPE_ID, getIssueTypeId());
                             if (!lastIssuesCriteria.equals(criteria))
                 {
                     collIssues = IssuePeer.doSelect(criteria, con);
                 }
             }
         }
         lastIssuesCriteria = criteria;

         return collIssues;
           }

                                    
              
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this IssueType is new, it will return
                 * an empty collection; or if this IssueType has previously
     * been saved, it will retrieve related Issues from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in IssueType.
     */
    protected List getIssuesJoinScarabModule(Criteria criteria)
        throws TorqueException
    {
                    if (collIssues == null)
        {
            if (isNew())
            {
               collIssues = new ArrayList();
            }
            else
            {
                              criteria.add(IssuePeer.TYPE_ID, getIssueTypeId());
                              collIssues = IssuePeer.doSelectJoinScarabModule(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(IssuePeer.TYPE_ID, getIssueTypeId());
                                    if (!lastIssuesCriteria.equals(criteria))
            {
                collIssues = IssuePeer.doSelectJoinScarabModule(criteria);
            }
        }
        lastIssuesCriteria = criteria;

        return collIssues;
                }
                  
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this IssueType is new, it will return
                 * an empty collection; or if this IssueType has previously
     * been saved, it will retrieve related Issues from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in IssueType.
     */
    protected List getIssuesJoinIssueType(Criteria criteria)
        throws TorqueException
    {
                    if (collIssues == null)
        {
            if (isNew())
            {
               collIssues = new ArrayList();
            }
            else
            {
                              criteria.add(IssuePeer.TYPE_ID, getIssueTypeId());
                              collIssues = IssuePeer.doSelectJoinIssueType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(IssuePeer.TYPE_ID, getIssueTypeId());
                                    if (!lastIssuesCriteria.equals(criteria))
            {
                collIssues = IssuePeer.doSelectJoinIssueType(criteria);
            }
        }
        lastIssuesCriteria = criteria;

        return collIssues;
                }
                  
                    
                    
                                            
                                                                          
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this IssueType is new, it will return
                 * an empty collection; or if this IssueType has previously
     * been saved, it will retrieve related Issues from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in IssueType.
     */
    protected List getIssuesJoinActivitySetRelatedByCreatedTransId(Criteria criteria)
        throws TorqueException
    {
                    if (collIssues == null)
        {
            if (isNew())
            {
               collIssues = new ArrayList();
            }
            else
            {
                              criteria.add(IssuePeer.TYPE_ID, getIssueTypeId());
                              collIssues = IssuePeer.doSelectJoinActivitySetRelatedByCreatedTransId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(IssuePeer.TYPE_ID, getIssueTypeId());
                                    if (!lastIssuesCriteria.equals(criteria))
            {
                collIssues = IssuePeer.doSelectJoinActivitySetRelatedByCreatedTransId(criteria);
            }
        }
        lastIssuesCriteria = criteria;

        return collIssues;
                }
                  
                    
                    
                                            
                                                                          
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this IssueType is new, it will return
                 * an empty collection; or if this IssueType has previously
     * been saved, it will retrieve related Issues from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in IssueType.
     */
    protected List getIssuesJoinActivitySetRelatedByLastTransId(Criteria criteria)
        throws TorqueException
    {
                    if (collIssues == null)
        {
            if (isNew())
            {
               collIssues = new ArrayList();
            }
            else
            {
                              criteria.add(IssuePeer.TYPE_ID, getIssueTypeId());
                              collIssues = IssuePeer.doSelectJoinActivitySetRelatedByLastTransId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(IssuePeer.TYPE_ID, getIssueTypeId());
                                    if (!lastIssuesCriteria.equals(criteria))
            {
                collIssues = IssuePeer.doSelectJoinActivitySetRelatedByLastTransId(criteria);
            }
        }
        lastIssuesCriteria = criteria;

        return collIssues;
                }
                            


      


                          
            
          /**
     * Collection to store aggregation of collRModuleIssueTypes
     */
    protected List collRModuleIssueTypes;

    /**
     * Temporary storage of collRModuleIssueTypes to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initRModuleIssueTypes()
    {
        if (collRModuleIssueTypes == null)
        {
            collRModuleIssueTypes = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a RModuleIssueType object to this object
     * through the RModuleIssueType foreign key attribute
     *
     * @param l RModuleIssueType
     * @throws TorqueException
     */
    public void addRModuleIssueType(RModuleIssueType l) throws TorqueException
    {
        getRModuleIssueTypes().add(l);
        l.setIssueType((IssueType) this);
    }

    /**
     * The criteria used to select the current contents of collRModuleIssueTypes
     */
    private Criteria lastRModuleIssueTypesCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getRModuleIssueTypes(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getRModuleIssueTypes()
              throws TorqueException
          {
                      if (collRModuleIssueTypes == null)
        {
            collRModuleIssueTypes = getRModuleIssueTypes(new Criteria(10));
        }
                return collRModuleIssueTypes;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this IssueType has previously
           * been saved, it will retrieve related RModuleIssueTypes from storage.
     * If this IssueType is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getRModuleIssueTypes(Criteria criteria) throws TorqueException
    {
              if (collRModuleIssueTypes == null)
        {
            if (isNew())
            {
               collRModuleIssueTypes = new ArrayList();
            }
            else
            {
                        criteria.add(RModuleIssueTypePeer.ISSUE_TYPE_ID, getIssueTypeId() );
                        collRModuleIssueTypes = RModuleIssueTypePeer.doSelect(criteria);
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
                            criteria.add(RModuleIssueTypePeer.ISSUE_TYPE_ID, getIssueTypeId());
                            if (!lastRModuleIssueTypesCriteria.equals(criteria))
                {
                    collRModuleIssueTypes = RModuleIssueTypePeer.doSelect(criteria);
                }
            }
        }
        lastRModuleIssueTypesCriteria = criteria;

        return collRModuleIssueTypes;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getRModuleIssueTypes(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getRModuleIssueTypes(Connection con) throws TorqueException
    {
              if (collRModuleIssueTypes == null)
        {
            collRModuleIssueTypes = getRModuleIssueTypes(new Criteria(10), con);
        }
        return collRModuleIssueTypes;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this IssueType has previously
           * been saved, it will retrieve related RModuleIssueTypes from storage.
     * If this IssueType is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getRModuleIssueTypes(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collRModuleIssueTypes == null)
        {
            if (isNew())
            {
               collRModuleIssueTypes = new ArrayList();
            }
            else
            {
                         criteria.add(RModuleIssueTypePeer.ISSUE_TYPE_ID, getIssueTypeId());
                         collRModuleIssueTypes = RModuleIssueTypePeer.doSelect(criteria, con);
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
                             criteria.add(RModuleIssueTypePeer.ISSUE_TYPE_ID, getIssueTypeId());
                             if (!lastRModuleIssueTypesCriteria.equals(criteria))
                 {
                     collRModuleIssueTypes = RModuleIssueTypePeer.doSelect(criteria, con);
                 }
             }
         }
         lastRModuleIssueTypesCriteria = criteria;

         return collRModuleIssueTypes;
           }

                        
              
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this IssueType is new, it will return
                 * an empty collection; or if this IssueType has previously
     * been saved, it will retrieve related RModuleIssueTypes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in IssueType.
     */
    protected List getRModuleIssueTypesJoinScarabModule(Criteria criteria)
        throws TorqueException
    {
                    if (collRModuleIssueTypes == null)
        {
            if (isNew())
            {
               collRModuleIssueTypes = new ArrayList();
            }
            else
            {
                              criteria.add(RModuleIssueTypePeer.ISSUE_TYPE_ID, getIssueTypeId());
                              collRModuleIssueTypes = RModuleIssueTypePeer.doSelectJoinScarabModule(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleIssueTypePeer.ISSUE_TYPE_ID, getIssueTypeId());
                                    if (!lastRModuleIssueTypesCriteria.equals(criteria))
            {
                collRModuleIssueTypes = RModuleIssueTypePeer.doSelectJoinScarabModule(criteria);
            }
        }
        lastRModuleIssueTypesCriteria = criteria;

        return collRModuleIssueTypes;
                }
                  
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this IssueType is new, it will return
                 * an empty collection; or if this IssueType has previously
     * been saved, it will retrieve related RModuleIssueTypes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in IssueType.
     */
    protected List getRModuleIssueTypesJoinIssueType(Criteria criteria)
        throws TorqueException
    {
                    if (collRModuleIssueTypes == null)
        {
            if (isNew())
            {
               collRModuleIssueTypes = new ArrayList();
            }
            else
            {
                              criteria.add(RModuleIssueTypePeer.ISSUE_TYPE_ID, getIssueTypeId());
                              collRModuleIssueTypes = RModuleIssueTypePeer.doSelectJoinIssueType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleIssueTypePeer.ISSUE_TYPE_ID, getIssueTypeId());
                                    if (!lastRModuleIssueTypesCriteria.equals(criteria))
            {
                collRModuleIssueTypes = RModuleIssueTypePeer.doSelectJoinIssueType(criteria);
            }
        }
        lastRModuleIssueTypesCriteria = criteria;

        return collRModuleIssueTypes;
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
        l.setIssueType((IssueType) this);
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
     * Otherwise if this IssueType has previously
           * been saved, it will retrieve related MITListItems from storage.
     * If this IssueType is new, it will return
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
                        criteria.add(MITListItemPeer.ISSUE_TYPE_ID, getIssueTypeId() );
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
                            criteria.add(MITListItemPeer.ISSUE_TYPE_ID, getIssueTypeId());
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
     * Otherwise if this IssueType has previously
           * been saved, it will retrieve related MITListItems from storage.
     * If this IssueType is new, it will return
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
                         criteria.add(MITListItemPeer.ISSUE_TYPE_ID, getIssueTypeId());
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
                             criteria.add(MITListItemPeer.ISSUE_TYPE_ID, getIssueTypeId());
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
     * Otherwise if this IssueType is new, it will return
                 * an empty collection; or if this IssueType has previously
     * been saved, it will retrieve related MITListItems from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in IssueType.
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
                              criteria.add(MITListItemPeer.ISSUE_TYPE_ID, getIssueTypeId());
                              collMITListItems = MITListItemPeer.doSelectJoinMITList(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(MITListItemPeer.ISSUE_TYPE_ID, getIssueTypeId());
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
     * Otherwise if this IssueType is new, it will return
                 * an empty collection; or if this IssueType has previously
     * been saved, it will retrieve related MITListItems from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in IssueType.
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
                              criteria.add(MITListItemPeer.ISSUE_TYPE_ID, getIssueTypeId());
                              collMITListItems = MITListItemPeer.doSelectJoinScarabModule(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(MITListItemPeer.ISSUE_TYPE_ID, getIssueTypeId());
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
     * Otherwise if this IssueType is new, it will return
                 * an empty collection; or if this IssueType has previously
     * been saved, it will retrieve related MITListItems from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in IssueType.
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
                              criteria.add(MITListItemPeer.ISSUE_TYPE_ID, getIssueTypeId());
                              collMITListItems = MITListItemPeer.doSelectJoinIssueType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(MITListItemPeer.ISSUE_TYPE_ID, getIssueTypeId());
                                    if (!lastMITListItemsCriteria.equals(criteria))
            {
                collMITListItems = MITListItemPeer.doSelectJoinIssueType(criteria);
            }
        }
        lastMITListItemsCriteria = criteria;

        return collMITListItems;
                }
                            


                          
            
          /**
     * Collection to store aggregation of collRModuleAttributes
     */
    protected List collRModuleAttributes;

    /**
     * Temporary storage of collRModuleAttributes to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initRModuleAttributes()
    {
        if (collRModuleAttributes == null)
        {
            collRModuleAttributes = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a RModuleAttribute object to this object
     * through the RModuleAttribute foreign key attribute
     *
     * @param l RModuleAttribute
     * @throws TorqueException
     */
    public void addRModuleAttribute(RModuleAttribute l) throws TorqueException
    {
        getRModuleAttributes().add(l);
        l.setIssueType((IssueType) this);
    }

    /**
     * The criteria used to select the current contents of collRModuleAttributes
     */
    private Criteria lastRModuleAttributesCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getRModuleAttributes(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getRModuleAttributes()
              throws TorqueException
          {
                      if (collRModuleAttributes == null)
        {
            collRModuleAttributes = getRModuleAttributes(new Criteria(10));
        }
                return collRModuleAttributes;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this IssueType has previously
           * been saved, it will retrieve related RModuleAttributes from storage.
     * If this IssueType is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getRModuleAttributes(Criteria criteria) throws TorqueException
    {
              if (collRModuleAttributes == null)
        {
            if (isNew())
            {
               collRModuleAttributes = new ArrayList();
            }
            else
            {
                        criteria.add(RModuleAttributePeer.ISSUE_TYPE_ID, getIssueTypeId() );
                        collRModuleAttributes = RModuleAttributePeer.doSelect(criteria);
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
                            criteria.add(RModuleAttributePeer.ISSUE_TYPE_ID, getIssueTypeId());
                            if (!lastRModuleAttributesCriteria.equals(criteria))
                {
                    collRModuleAttributes = RModuleAttributePeer.doSelect(criteria);
                }
            }
        }
        lastRModuleAttributesCriteria = criteria;

        return collRModuleAttributes;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getRModuleAttributes(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getRModuleAttributes(Connection con) throws TorqueException
    {
              if (collRModuleAttributes == null)
        {
            collRModuleAttributes = getRModuleAttributes(new Criteria(10), con);
        }
        return collRModuleAttributes;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this IssueType has previously
           * been saved, it will retrieve related RModuleAttributes from storage.
     * If this IssueType is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getRModuleAttributes(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collRModuleAttributes == null)
        {
            if (isNew())
            {
               collRModuleAttributes = new ArrayList();
            }
            else
            {
                         criteria.add(RModuleAttributePeer.ISSUE_TYPE_ID, getIssueTypeId());
                         collRModuleAttributes = RModuleAttributePeer.doSelect(criteria, con);
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
                             criteria.add(RModuleAttributePeer.ISSUE_TYPE_ID, getIssueTypeId());
                             if (!lastRModuleAttributesCriteria.equals(criteria))
                 {
                     collRModuleAttributes = RModuleAttributePeer.doSelect(criteria, con);
                 }
             }
         }
         lastRModuleAttributesCriteria = criteria;

         return collRModuleAttributes;
           }

                              
              
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this IssueType is new, it will return
                 * an empty collection; or if this IssueType has previously
     * been saved, it will retrieve related RModuleAttributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in IssueType.
     */
    protected List getRModuleAttributesJoinAttribute(Criteria criteria)
        throws TorqueException
    {
                    if (collRModuleAttributes == null)
        {
            if (isNew())
            {
               collRModuleAttributes = new ArrayList();
            }
            else
            {
                              criteria.add(RModuleAttributePeer.ISSUE_TYPE_ID, getIssueTypeId());
                              collRModuleAttributes = RModuleAttributePeer.doSelectJoinAttribute(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleAttributePeer.ISSUE_TYPE_ID, getIssueTypeId());
                                    if (!lastRModuleAttributesCriteria.equals(criteria))
            {
                collRModuleAttributes = RModuleAttributePeer.doSelectJoinAttribute(criteria);
            }
        }
        lastRModuleAttributesCriteria = criteria;

        return collRModuleAttributes;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this IssueType is new, it will return
                 * an empty collection; or if this IssueType has previously
     * been saved, it will retrieve related RModuleAttributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in IssueType.
     */
    protected List getRModuleAttributesJoinScarabModule(Criteria criteria)
        throws TorqueException
    {
                    if (collRModuleAttributes == null)
        {
            if (isNew())
            {
               collRModuleAttributes = new ArrayList();
            }
            else
            {
                              criteria.add(RModuleAttributePeer.ISSUE_TYPE_ID, getIssueTypeId());
                              collRModuleAttributes = RModuleAttributePeer.doSelectJoinScarabModule(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleAttributePeer.ISSUE_TYPE_ID, getIssueTypeId());
                                    if (!lastRModuleAttributesCriteria.equals(criteria))
            {
                collRModuleAttributes = RModuleAttributePeer.doSelectJoinScarabModule(criteria);
            }
        }
        lastRModuleAttributesCriteria = criteria;

        return collRModuleAttributes;
                }
                  
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this IssueType is new, it will return
                 * an empty collection; or if this IssueType has previously
     * been saved, it will retrieve related RModuleAttributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in IssueType.
     */
    protected List getRModuleAttributesJoinIssueType(Criteria criteria)
        throws TorqueException
    {
                    if (collRModuleAttributes == null)
        {
            if (isNew())
            {
               collRModuleAttributes = new ArrayList();
            }
            else
            {
                              criteria.add(RModuleAttributePeer.ISSUE_TYPE_ID, getIssueTypeId());
                              collRModuleAttributes = RModuleAttributePeer.doSelectJoinIssueType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleAttributePeer.ISSUE_TYPE_ID, getIssueTypeId());
                                    if (!lastRModuleAttributesCriteria.equals(criteria))
            {
                collRModuleAttributes = RModuleAttributePeer.doSelectJoinIssueType(criteria);
            }
        }
        lastRModuleAttributesCriteria = criteria;

        return collRModuleAttributes;
                }
                            


                          
            
          /**
     * Collection to store aggregation of collRIssueTypeAttributes
     */
    protected List collRIssueTypeAttributes;

    /**
     * Temporary storage of collRIssueTypeAttributes to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initRIssueTypeAttributes()
    {
        if (collRIssueTypeAttributes == null)
        {
            collRIssueTypeAttributes = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a RIssueTypeAttribute object to this object
     * through the RIssueTypeAttribute foreign key attribute
     *
     * @param l RIssueTypeAttribute
     * @throws TorqueException
     */
    public void addRIssueTypeAttribute(RIssueTypeAttribute l) throws TorqueException
    {
        getRIssueTypeAttributes().add(l);
        l.setIssueType((IssueType) this);
    }

    /**
     * The criteria used to select the current contents of collRIssueTypeAttributes
     */
    private Criteria lastRIssueTypeAttributesCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getRIssueTypeAttributes(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getRIssueTypeAttributes()
              throws TorqueException
          {
                      if (collRIssueTypeAttributes == null)
        {
            collRIssueTypeAttributes = getRIssueTypeAttributes(new Criteria(10));
        }
                return collRIssueTypeAttributes;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this IssueType has previously
           * been saved, it will retrieve related RIssueTypeAttributes from storage.
     * If this IssueType is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getRIssueTypeAttributes(Criteria criteria) throws TorqueException
    {
              if (collRIssueTypeAttributes == null)
        {
            if (isNew())
            {
               collRIssueTypeAttributes = new ArrayList();
            }
            else
            {
                        criteria.add(RIssueTypeAttributePeer.ISSUE_TYPE_ID, getIssueTypeId() );
                        collRIssueTypeAttributes = RIssueTypeAttributePeer.doSelect(criteria);
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
                            criteria.add(RIssueTypeAttributePeer.ISSUE_TYPE_ID, getIssueTypeId());
                            if (!lastRIssueTypeAttributesCriteria.equals(criteria))
                {
                    collRIssueTypeAttributes = RIssueTypeAttributePeer.doSelect(criteria);
                }
            }
        }
        lastRIssueTypeAttributesCriteria = criteria;

        return collRIssueTypeAttributes;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getRIssueTypeAttributes(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getRIssueTypeAttributes(Connection con) throws TorqueException
    {
              if (collRIssueTypeAttributes == null)
        {
            collRIssueTypeAttributes = getRIssueTypeAttributes(new Criteria(10), con);
        }
        return collRIssueTypeAttributes;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this IssueType has previously
           * been saved, it will retrieve related RIssueTypeAttributes from storage.
     * If this IssueType is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getRIssueTypeAttributes(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collRIssueTypeAttributes == null)
        {
            if (isNew())
            {
               collRIssueTypeAttributes = new ArrayList();
            }
            else
            {
                         criteria.add(RIssueTypeAttributePeer.ISSUE_TYPE_ID, getIssueTypeId());
                         collRIssueTypeAttributes = RIssueTypeAttributePeer.doSelect(criteria, con);
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
                             criteria.add(RIssueTypeAttributePeer.ISSUE_TYPE_ID, getIssueTypeId());
                             if (!lastRIssueTypeAttributesCriteria.equals(criteria))
                 {
                     collRIssueTypeAttributes = RIssueTypeAttributePeer.doSelect(criteria, con);
                 }
             }
         }
         lastRIssueTypeAttributesCriteria = criteria;

         return collRIssueTypeAttributes;
           }

                        
              
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this IssueType is new, it will return
                 * an empty collection; or if this IssueType has previously
     * been saved, it will retrieve related RIssueTypeAttributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in IssueType.
     */
    protected List getRIssueTypeAttributesJoinAttribute(Criteria criteria)
        throws TorqueException
    {
                    if (collRIssueTypeAttributes == null)
        {
            if (isNew())
            {
               collRIssueTypeAttributes = new ArrayList();
            }
            else
            {
                              criteria.add(RIssueTypeAttributePeer.ISSUE_TYPE_ID, getIssueTypeId());
                              collRIssueTypeAttributes = RIssueTypeAttributePeer.doSelectJoinAttribute(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RIssueTypeAttributePeer.ISSUE_TYPE_ID, getIssueTypeId());
                                    if (!lastRIssueTypeAttributesCriteria.equals(criteria))
            {
                collRIssueTypeAttributes = RIssueTypeAttributePeer.doSelectJoinAttribute(criteria);
            }
        }
        lastRIssueTypeAttributesCriteria = criteria;

        return collRIssueTypeAttributes;
                }
                  
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this IssueType is new, it will return
                 * an empty collection; or if this IssueType has previously
     * been saved, it will retrieve related RIssueTypeAttributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in IssueType.
     */
    protected List getRIssueTypeAttributesJoinIssueType(Criteria criteria)
        throws TorqueException
    {
                    if (collRIssueTypeAttributes == null)
        {
            if (isNew())
            {
               collRIssueTypeAttributes = new ArrayList();
            }
            else
            {
                              criteria.add(RIssueTypeAttributePeer.ISSUE_TYPE_ID, getIssueTypeId());
                              collRIssueTypeAttributes = RIssueTypeAttributePeer.doSelectJoinIssueType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RIssueTypeAttributePeer.ISSUE_TYPE_ID, getIssueTypeId());
                                    if (!lastRIssueTypeAttributesCriteria.equals(criteria))
            {
                collRIssueTypeAttributes = RIssueTypeAttributePeer.doSelectJoinIssueType(criteria);
            }
        }
        lastRIssueTypeAttributesCriteria = criteria;

        return collRIssueTypeAttributes;
                }
                            


                          
            
          /**
     * Collection to store aggregation of collRModuleOptions
     */
    protected List collRModuleOptions;

    /**
     * Temporary storage of collRModuleOptions to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initRModuleOptions()
    {
        if (collRModuleOptions == null)
        {
            collRModuleOptions = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a RModuleOption object to this object
     * through the RModuleOption foreign key attribute
     *
     * @param l RModuleOption
     * @throws TorqueException
     */
    public void addRModuleOption(RModuleOption l) throws TorqueException
    {
        getRModuleOptions().add(l);
        l.setIssueType((IssueType) this);
    }

    /**
     * The criteria used to select the current contents of collRModuleOptions
     */
    private Criteria lastRModuleOptionsCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getRModuleOptions(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getRModuleOptions()
              throws TorqueException
          {
                      if (collRModuleOptions == null)
        {
            collRModuleOptions = getRModuleOptions(new Criteria(10));
        }
                return collRModuleOptions;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this IssueType has previously
           * been saved, it will retrieve related RModuleOptions from storage.
     * If this IssueType is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getRModuleOptions(Criteria criteria) throws TorqueException
    {
              if (collRModuleOptions == null)
        {
            if (isNew())
            {
               collRModuleOptions = new ArrayList();
            }
            else
            {
                        criteria.add(RModuleOptionPeer.ISSUE_TYPE_ID, getIssueTypeId() );
                        collRModuleOptions = RModuleOptionPeer.doSelect(criteria);
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
                            criteria.add(RModuleOptionPeer.ISSUE_TYPE_ID, getIssueTypeId());
                            if (!lastRModuleOptionsCriteria.equals(criteria))
                {
                    collRModuleOptions = RModuleOptionPeer.doSelect(criteria);
                }
            }
        }
        lastRModuleOptionsCriteria = criteria;

        return collRModuleOptions;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getRModuleOptions(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getRModuleOptions(Connection con) throws TorqueException
    {
              if (collRModuleOptions == null)
        {
            collRModuleOptions = getRModuleOptions(new Criteria(10), con);
        }
        return collRModuleOptions;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this IssueType has previously
           * been saved, it will retrieve related RModuleOptions from storage.
     * If this IssueType is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getRModuleOptions(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collRModuleOptions == null)
        {
            if (isNew())
            {
               collRModuleOptions = new ArrayList();
            }
            else
            {
                         criteria.add(RModuleOptionPeer.ISSUE_TYPE_ID, getIssueTypeId());
                         collRModuleOptions = RModuleOptionPeer.doSelect(criteria, con);
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
                             criteria.add(RModuleOptionPeer.ISSUE_TYPE_ID, getIssueTypeId());
                             if (!lastRModuleOptionsCriteria.equals(criteria))
                 {
                     collRModuleOptions = RModuleOptionPeer.doSelect(criteria, con);
                 }
             }
         }
         lastRModuleOptionsCriteria = criteria;

         return collRModuleOptions;
           }

                              
              
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this IssueType is new, it will return
                 * an empty collection; or if this IssueType has previously
     * been saved, it will retrieve related RModuleOptions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in IssueType.
     */
    protected List getRModuleOptionsJoinAttributeOption(Criteria criteria)
        throws TorqueException
    {
                    if (collRModuleOptions == null)
        {
            if (isNew())
            {
               collRModuleOptions = new ArrayList();
            }
            else
            {
                              criteria.add(RModuleOptionPeer.ISSUE_TYPE_ID, getIssueTypeId());
                              collRModuleOptions = RModuleOptionPeer.doSelectJoinAttributeOption(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleOptionPeer.ISSUE_TYPE_ID, getIssueTypeId());
                                    if (!lastRModuleOptionsCriteria.equals(criteria))
            {
                collRModuleOptions = RModuleOptionPeer.doSelectJoinAttributeOption(criteria);
            }
        }
        lastRModuleOptionsCriteria = criteria;

        return collRModuleOptions;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this IssueType is new, it will return
                 * an empty collection; or if this IssueType has previously
     * been saved, it will retrieve related RModuleOptions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in IssueType.
     */
    protected List getRModuleOptionsJoinScarabModule(Criteria criteria)
        throws TorqueException
    {
                    if (collRModuleOptions == null)
        {
            if (isNew())
            {
               collRModuleOptions = new ArrayList();
            }
            else
            {
                              criteria.add(RModuleOptionPeer.ISSUE_TYPE_ID, getIssueTypeId());
                              collRModuleOptions = RModuleOptionPeer.doSelectJoinScarabModule(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleOptionPeer.ISSUE_TYPE_ID, getIssueTypeId());
                                    if (!lastRModuleOptionsCriteria.equals(criteria))
            {
                collRModuleOptions = RModuleOptionPeer.doSelectJoinScarabModule(criteria);
            }
        }
        lastRModuleOptionsCriteria = criteria;

        return collRModuleOptions;
                }
                  
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this IssueType is new, it will return
                 * an empty collection; or if this IssueType has previously
     * been saved, it will retrieve related RModuleOptions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in IssueType.
     */
    protected List getRModuleOptionsJoinIssueType(Criteria criteria)
        throws TorqueException
    {
                    if (collRModuleOptions == null)
        {
            if (isNew())
            {
               collRModuleOptions = new ArrayList();
            }
            else
            {
                              criteria.add(RModuleOptionPeer.ISSUE_TYPE_ID, getIssueTypeId());
                              collRModuleOptions = RModuleOptionPeer.doSelectJoinIssueType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleOptionPeer.ISSUE_TYPE_ID, getIssueTypeId());
                                    if (!lastRModuleOptionsCriteria.equals(criteria))
            {
                collRModuleOptions = RModuleOptionPeer.doSelectJoinIssueType(criteria);
            }
        }
        lastRModuleOptionsCriteria = criteria;

        return collRModuleOptions;
                }
                            


                          
            
          /**
     * Collection to store aggregation of collRIssueTypeOptions
     */
    protected List collRIssueTypeOptions;

    /**
     * Temporary storage of collRIssueTypeOptions to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initRIssueTypeOptions()
    {
        if (collRIssueTypeOptions == null)
        {
            collRIssueTypeOptions = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a RIssueTypeOption object to this object
     * through the RIssueTypeOption foreign key attribute
     *
     * @param l RIssueTypeOption
     * @throws TorqueException
     */
    public void addRIssueTypeOption(RIssueTypeOption l) throws TorqueException
    {
        getRIssueTypeOptions().add(l);
        l.setIssueType((IssueType) this);
    }

    /**
     * The criteria used to select the current contents of collRIssueTypeOptions
     */
    private Criteria lastRIssueTypeOptionsCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getRIssueTypeOptions(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getRIssueTypeOptions()
              throws TorqueException
          {
                      if (collRIssueTypeOptions == null)
        {
            collRIssueTypeOptions = getRIssueTypeOptions(new Criteria(10));
        }
                return collRIssueTypeOptions;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this IssueType has previously
           * been saved, it will retrieve related RIssueTypeOptions from storage.
     * If this IssueType is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getRIssueTypeOptions(Criteria criteria) throws TorqueException
    {
              if (collRIssueTypeOptions == null)
        {
            if (isNew())
            {
               collRIssueTypeOptions = new ArrayList();
            }
            else
            {
                        criteria.add(RIssueTypeOptionPeer.ISSUE_TYPE_ID, getIssueTypeId() );
                        collRIssueTypeOptions = RIssueTypeOptionPeer.doSelect(criteria);
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
                            criteria.add(RIssueTypeOptionPeer.ISSUE_TYPE_ID, getIssueTypeId());
                            if (!lastRIssueTypeOptionsCriteria.equals(criteria))
                {
                    collRIssueTypeOptions = RIssueTypeOptionPeer.doSelect(criteria);
                }
            }
        }
        lastRIssueTypeOptionsCriteria = criteria;

        return collRIssueTypeOptions;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getRIssueTypeOptions(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getRIssueTypeOptions(Connection con) throws TorqueException
    {
              if (collRIssueTypeOptions == null)
        {
            collRIssueTypeOptions = getRIssueTypeOptions(new Criteria(10), con);
        }
        return collRIssueTypeOptions;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this IssueType has previously
           * been saved, it will retrieve related RIssueTypeOptions from storage.
     * If this IssueType is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getRIssueTypeOptions(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collRIssueTypeOptions == null)
        {
            if (isNew())
            {
               collRIssueTypeOptions = new ArrayList();
            }
            else
            {
                         criteria.add(RIssueTypeOptionPeer.ISSUE_TYPE_ID, getIssueTypeId());
                         collRIssueTypeOptions = RIssueTypeOptionPeer.doSelect(criteria, con);
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
                             criteria.add(RIssueTypeOptionPeer.ISSUE_TYPE_ID, getIssueTypeId());
                             if (!lastRIssueTypeOptionsCriteria.equals(criteria))
                 {
                     collRIssueTypeOptions = RIssueTypeOptionPeer.doSelect(criteria, con);
                 }
             }
         }
         lastRIssueTypeOptionsCriteria = criteria;

         return collRIssueTypeOptions;
           }

                        
              
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this IssueType is new, it will return
                 * an empty collection; or if this IssueType has previously
     * been saved, it will retrieve related RIssueTypeOptions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in IssueType.
     */
    protected List getRIssueTypeOptionsJoinAttributeOption(Criteria criteria)
        throws TorqueException
    {
                    if (collRIssueTypeOptions == null)
        {
            if (isNew())
            {
               collRIssueTypeOptions = new ArrayList();
            }
            else
            {
                              criteria.add(RIssueTypeOptionPeer.ISSUE_TYPE_ID, getIssueTypeId());
                              collRIssueTypeOptions = RIssueTypeOptionPeer.doSelectJoinAttributeOption(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RIssueTypeOptionPeer.ISSUE_TYPE_ID, getIssueTypeId());
                                    if (!lastRIssueTypeOptionsCriteria.equals(criteria))
            {
                collRIssueTypeOptions = RIssueTypeOptionPeer.doSelectJoinAttributeOption(criteria);
            }
        }
        lastRIssueTypeOptionsCriteria = criteria;

        return collRIssueTypeOptions;
                }
                  
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this IssueType is new, it will return
                 * an empty collection; or if this IssueType has previously
     * been saved, it will retrieve related RIssueTypeOptions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in IssueType.
     */
    protected List getRIssueTypeOptionsJoinIssueType(Criteria criteria)
        throws TorqueException
    {
                    if (collRIssueTypeOptions == null)
        {
            if (isNew())
            {
               collRIssueTypeOptions = new ArrayList();
            }
            else
            {
                              criteria.add(RIssueTypeOptionPeer.ISSUE_TYPE_ID, getIssueTypeId());
                              collRIssueTypeOptions = RIssueTypeOptionPeer.doSelectJoinIssueType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RIssueTypeOptionPeer.ISSUE_TYPE_ID, getIssueTypeId());
                                    if (!lastRIssueTypeOptionsCriteria.equals(criteria))
            {
                collRIssueTypeOptions = RIssueTypeOptionPeer.doSelectJoinIssueType(criteria);
            }
        }
        lastRIssueTypeOptionsCriteria = criteria;

        return collRIssueTypeOptions;
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
        l.setIssueType((IssueType) this);
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
     * Otherwise if this IssueType has previously
           * been saved, it will retrieve related RModuleUserAttributes from storage.
     * If this IssueType is new, it will return
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
                        criteria.add(RModuleUserAttributePeer.ISSUE_TYPE_ID, getIssueTypeId() );
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
                            criteria.add(RModuleUserAttributePeer.ISSUE_TYPE_ID, getIssueTypeId());
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
     * Otherwise if this IssueType has previously
           * been saved, it will retrieve related RModuleUserAttributes from storage.
     * If this IssueType is new, it will return
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
                         criteria.add(RModuleUserAttributePeer.ISSUE_TYPE_ID, getIssueTypeId());
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
                             criteria.add(RModuleUserAttributePeer.ISSUE_TYPE_ID, getIssueTypeId());
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
     * Otherwise if this IssueType is new, it will return
                 * an empty collection; or if this IssueType has previously
     * been saved, it will retrieve related RModuleUserAttributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in IssueType.
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
                              criteria.add(RModuleUserAttributePeer.ISSUE_TYPE_ID, getIssueTypeId());
                              collRModuleUserAttributes = RModuleUserAttributePeer.doSelectJoinMITList(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleUserAttributePeer.ISSUE_TYPE_ID, getIssueTypeId());
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
     * Otherwise if this IssueType is new, it will return
                 * an empty collection; or if this IssueType has previously
     * been saved, it will retrieve related RModuleUserAttributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in IssueType.
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
                              criteria.add(RModuleUserAttributePeer.ISSUE_TYPE_ID, getIssueTypeId());
                              collRModuleUserAttributes = RModuleUserAttributePeer.doSelectJoinScarabModule(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleUserAttributePeer.ISSUE_TYPE_ID, getIssueTypeId());
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
     * Otherwise if this IssueType is new, it will return
                 * an empty collection; or if this IssueType has previously
     * been saved, it will retrieve related RModuleUserAttributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in IssueType.
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
                              criteria.add(RModuleUserAttributePeer.ISSUE_TYPE_ID, getIssueTypeId());
                              collRModuleUserAttributes = RModuleUserAttributePeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleUserAttributePeer.ISSUE_TYPE_ID, getIssueTypeId());
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
     * Otherwise if this IssueType is new, it will return
                 * an empty collection; or if this IssueType has previously
     * been saved, it will retrieve related RModuleUserAttributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in IssueType.
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
                              criteria.add(RModuleUserAttributePeer.ISSUE_TYPE_ID, getIssueTypeId());
                              collRModuleUserAttributes = RModuleUserAttributePeer.doSelectJoinIssueType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleUserAttributePeer.ISSUE_TYPE_ID, getIssueTypeId());
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
     * Otherwise if this IssueType is new, it will return
                 * an empty collection; or if this IssueType has previously
     * been saved, it will retrieve related RModuleUserAttributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in IssueType.
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
                              criteria.add(RModuleUserAttributePeer.ISSUE_TYPE_ID, getIssueTypeId());
                              collRModuleUserAttributes = RModuleUserAttributePeer.doSelectJoinAttribute(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleUserAttributePeer.ISSUE_TYPE_ID, getIssueTypeId());
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
        l.setIssueType((IssueType) this);
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
     * Otherwise if this IssueType has previously
           * been saved, it will retrieve related Querys from storage.
     * If this IssueType is new, it will return
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
                        criteria.add(QueryPeer.ISSUE_TYPE_ID, getIssueTypeId() );
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
                            criteria.add(QueryPeer.ISSUE_TYPE_ID, getIssueTypeId());
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
     * Otherwise if this IssueType has previously
           * been saved, it will retrieve related Querys from storage.
     * If this IssueType is new, it will return
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
                         criteria.add(QueryPeer.ISSUE_TYPE_ID, getIssueTypeId());
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
                             criteria.add(QueryPeer.ISSUE_TYPE_ID, getIssueTypeId());
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
     * Otherwise if this IssueType is new, it will return
                 * an empty collection; or if this IssueType has previously
     * been saved, it will retrieve related Querys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in IssueType.
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
                              criteria.add(QueryPeer.ISSUE_TYPE_ID, getIssueTypeId());
                              collQuerys = QueryPeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(QueryPeer.ISSUE_TYPE_ID, getIssueTypeId());
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
     * Otherwise if this IssueType is new, it will return
                 * an empty collection; or if this IssueType has previously
     * been saved, it will retrieve related Querys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in IssueType.
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
                              criteria.add(QueryPeer.ISSUE_TYPE_ID, getIssueTypeId());
                              collQuerys = QueryPeer.doSelectJoinScope(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(QueryPeer.ISSUE_TYPE_ID, getIssueTypeId());
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
     * Otherwise if this IssueType is new, it will return
                 * an empty collection; or if this IssueType has previously
     * been saved, it will retrieve related Querys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in IssueType.
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
                              criteria.add(QueryPeer.ISSUE_TYPE_ID, getIssueTypeId());
                              collQuerys = QueryPeer.doSelectJoinScarabModule(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(QueryPeer.ISSUE_TYPE_ID, getIssueTypeId());
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
     * Otherwise if this IssueType is new, it will return
                 * an empty collection; or if this IssueType has previously
     * been saved, it will retrieve related Querys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in IssueType.
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
                              criteria.add(QueryPeer.ISSUE_TYPE_ID, getIssueTypeId());
                              collQuerys = QueryPeer.doSelectJoinIssueType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(QueryPeer.ISSUE_TYPE_ID, getIssueTypeId());
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
     * Otherwise if this IssueType is new, it will return
                 * an empty collection; or if this IssueType has previously
     * been saved, it will retrieve related Querys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in IssueType.
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
                              criteria.add(QueryPeer.ISSUE_TYPE_ID, getIssueTypeId());
                              collQuerys = QueryPeer.doSelectJoinMITList(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(QueryPeer.ISSUE_TYPE_ID, getIssueTypeId());
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
     * Otherwise if this IssueType is new, it will return
                 * an empty collection; or if this IssueType has previously
     * been saved, it will retrieve related Querys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in IssueType.
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
                              criteria.add(QueryPeer.ISSUE_TYPE_ID, getIssueTypeId());
                              collQuerys = QueryPeer.doSelectJoinFrequency(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(QueryPeer.ISSUE_TYPE_ID, getIssueTypeId());
                                    if (!lastQuerysCriteria.equals(criteria))
            {
                collQuerys = QueryPeer.doSelectJoinFrequency(criteria);
            }
        }
        lastQuerysCriteria = criteria;

        return collQuerys;
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
        l.setIssueType((IssueType) this);
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
     * Otherwise if this IssueType has previously
           * been saved, it will retrieve related Reports from storage.
     * If this IssueType is new, it will return
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
                        criteria.add(ReportPeer.ISSUE_TYPE_ID, getIssueTypeId() );
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
                            criteria.add(ReportPeer.ISSUE_TYPE_ID, getIssueTypeId());
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
     * Otherwise if this IssueType has previously
           * been saved, it will retrieve related Reports from storage.
     * If this IssueType is new, it will return
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
                         criteria.add(ReportPeer.ISSUE_TYPE_ID, getIssueTypeId());
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
                             criteria.add(ReportPeer.ISSUE_TYPE_ID, getIssueTypeId());
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
     * Otherwise if this IssueType is new, it will return
                 * an empty collection; or if this IssueType has previously
     * been saved, it will retrieve related Reports from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in IssueType.
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
                              criteria.add(ReportPeer.ISSUE_TYPE_ID, getIssueTypeId());
                              collReports = ReportPeer.doSelectJoinIssueType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ReportPeer.ISSUE_TYPE_ID, getIssueTypeId());
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
     * Otherwise if this IssueType is new, it will return
                 * an empty collection; or if this IssueType has previously
     * been saved, it will retrieve related Reports from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in IssueType.
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
                              criteria.add(ReportPeer.ISSUE_TYPE_ID, getIssueTypeId());
                              collReports = ReportPeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ReportPeer.ISSUE_TYPE_ID, getIssueTypeId());
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
     * Otherwise if this IssueType is new, it will return
                 * an empty collection; or if this IssueType has previously
     * been saved, it will retrieve related Reports from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in IssueType.
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
                              criteria.add(ReportPeer.ISSUE_TYPE_ID, getIssueTypeId());
                              collReports = ReportPeer.doSelectJoinScarabModule(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ReportPeer.ISSUE_TYPE_ID, getIssueTypeId());
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
     * Otherwise if this IssueType is new, it will return
                 * an empty collection; or if this IssueType has previously
     * been saved, it will retrieve related Reports from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in IssueType.
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
                              criteria.add(ReportPeer.ISSUE_TYPE_ID, getIssueTypeId());
                              collReports = ReportPeer.doSelectJoinScope(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ReportPeer.ISSUE_TYPE_ID, getIssueTypeId());
                                    if (!lastReportsCriteria.equals(criteria))
            {
                collReports = ReportPeer.doSelectJoinScope(criteria);
            }
        }
        lastReportsCriteria = criteria;

        return collReports;
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
              fieldNames.add("IssueTypeId");
              fieldNames.add("Name");
              fieldNames.add("Description");
              fieldNames.add("ParentId");
              fieldNames.add("Dedupe");
              fieldNames.add("Deleted");
              fieldNames.add("Locked");
              fieldNames.add("Isdefault");
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
          if (name.equals("IssueTypeId"))
        {
                return getIssueTypeId();
            }
          if (name.equals("Name"))
        {
                return getName();
            }
          if (name.equals("Description"))
        {
                return getDescription();
            }
          if (name.equals("ParentId"))
        {
                return getParentId();
            }
          if (name.equals("Dedupe"))
        {
                return Boolean.valueOf(getDedupe());
            }
          if (name.equals("Deleted"))
        {
                return Boolean.valueOf(getDeleted());
            }
          if (name.equals("Locked"))
        {
                return Boolean.valueOf(getLocked());
            }
          if (name.equals("Isdefault"))
        {
                return Boolean.valueOf(getIsdefault());
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
          if (name.equals(IssueTypePeer.ISSUE_TYPE_ID))
        {
                return getIssueTypeId();
            }
          if (name.equals(IssueTypePeer.NAME))
        {
                return getName();
            }
          if (name.equals(IssueTypePeer.DESCRIPTION))
        {
                return getDescription();
            }
          if (name.equals(IssueTypePeer.PARENT_ID))
        {
                return getParentId();
            }
          if (name.equals(IssueTypePeer.DEDUPE))
        {
                return Boolean.valueOf(getDedupe());
            }
          if (name.equals(IssueTypePeer.DELETED))
        {
                return Boolean.valueOf(getDeleted());
            }
          if (name.equals(IssueTypePeer.LOCKED))
        {
                return Boolean.valueOf(getLocked());
            }
          if (name.equals(IssueTypePeer.ISDEFAULT))
        {
                return Boolean.valueOf(getIsdefault());
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
                return getIssueTypeId();
            }
              if (pos == 1)
        {
                return getName();
            }
              if (pos == 2)
        {
                return getDescription();
            }
              if (pos == 3)
        {
                return getParentId();
            }
              if (pos == 4)
        {
                return Boolean.valueOf(getDedupe());
            }
              if (pos == 5)
        {
                return Boolean.valueOf(getDeleted());
            }
              if (pos == 6)
        {
                return Boolean.valueOf(getLocked());
            }
              if (pos == 7)
        {
                return Boolean.valueOf(getIsdefault());
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
          save(IssueTypePeer.getMapBuilder()
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
                    IssueTypePeer.doInsert((IssueType) this, con);
                    setNew(false);
                }
                else
                {
                    IssueTypePeer.doUpdate((IssueType) this, con);
                }

    
                      if (isCacheOnSave())
                {
                    IssueTypeManager.putInstance(this);
                }
              }

                                      
                                    if (collAttributeGroups != null)
            {
                for (int i = 0; i < collAttributeGroups.size(); i++)
                {
                    ((AttributeGroup) collAttributeGroups.get(i)).save(con);
                }
            }
                                                  
                                    if (collIssues != null)
            {
                for (int i = 0; i < collIssues.size(); i++)
                {
                    ((Issue) collIssues.get(i)).save(con);
                }
            }
                                                            
                                    if (collRModuleIssueTypes != null)
            {
                for (int i = 0; i < collRModuleIssueTypes.size(); i++)
                {
                    ((RModuleIssueType) collRModuleIssueTypes.get(i)).save(con);
                }
            }
                                                  
                                    if (collMITListItems != null)
            {
                for (int i = 0; i < collMITListItems.size(); i++)
                {
                    ((MITListItem) collMITListItems.get(i)).save(con);
                }
            }
                                                  
                                    if (collRModuleAttributes != null)
            {
                for (int i = 0; i < collRModuleAttributes.size(); i++)
                {
                    ((RModuleAttribute) collRModuleAttributes.get(i)).save(con);
                }
            }
                                                  
                                    if (collRIssueTypeAttributes != null)
            {
                for (int i = 0; i < collRIssueTypeAttributes.size(); i++)
                {
                    ((RIssueTypeAttribute) collRIssueTypeAttributes.get(i)).save(con);
                }
            }
                                                  
                                    if (collRModuleOptions != null)
            {
                for (int i = 0; i < collRModuleOptions.size(); i++)
                {
                    ((RModuleOption) collRModuleOptions.get(i)).save(con);
                }
            }
                                                  
                                    if (collRIssueTypeOptions != null)
            {
                for (int i = 0; i < collRIssueTypeOptions.size(); i++)
                {
                    ((RIssueTypeOption) collRIssueTypeOptions.get(i)).save(con);
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
                                                  
                                    if (collReports != null)
            {
                for (int i = 0; i < collReports.size(); i++)
                {
                    ((Report) collReports.get(i)).save(con);
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
     * @param key issueTypeId ObjectKey
     */
    public void setPrimaryKey(ObjectKey key)
        throws TorqueException
    {
            setIssueTypeId(new Integer(((NumberKey) key).intValue()));
        }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) throws TorqueException
    {
            setIssueTypeId(new Integer(key));
        }

  
    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
          return SimpleKey.keyFor(getIssueTypeId());
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
      public IssueType copy() throws TorqueException
    {
        return copyInto(new IssueType());
    }
  
    protected IssueType copyInto(IssueType copyObj) throws TorqueException
    {
          copyObj.setIssueTypeId(issueTypeId);
          copyObj.setName(name);
          copyObj.setDescription(description);
          copyObj.setParentId(parentId);
          copyObj.setDedupe(dedupe);
          copyObj.setDeleted(deleted);
          copyObj.setLocked(locked);
          copyObj.setIsdefault(isdefault);
  
                    copyObj.setIssueTypeId((Integer)null);
                                                      
                                      
                            
        List v = getAttributeGroups();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                AttributeGroup obj = (AttributeGroup) v.get(i);
                copyObj.addAttributeGroup(obj.copy());
            }
        }
        else
        {
            copyObj.collAttributeGroups = null;
        }
                                                  
                            
        v = getIssues();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                Issue obj = (Issue) v.get(i);
                copyObj.addIssue(obj.copy());
            }
        }
        else
        {
            copyObj.collIssues = null;
        }
                                                            
                            
        v = getRModuleIssueTypes();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                RModuleIssueType obj = (RModuleIssueType) v.get(i);
                copyObj.addRModuleIssueType(obj.copy());
            }
        }
        else
        {
            copyObj.collRModuleIssueTypes = null;
        }
                                                  
                            
        v = getMITListItems();
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
                                                  
                            
        v = getRModuleAttributes();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                RModuleAttribute obj = (RModuleAttribute) v.get(i);
                copyObj.addRModuleAttribute(obj.copy());
            }
        }
        else
        {
            copyObj.collRModuleAttributes = null;
        }
                                                  
                            
        v = getRIssueTypeAttributes();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                RIssueTypeAttribute obj = (RIssueTypeAttribute) v.get(i);
                copyObj.addRIssueTypeAttribute(obj.copy());
            }
        }
        else
        {
            copyObj.collRIssueTypeAttributes = null;
        }
                                                  
                            
        v = getRModuleOptions();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                RModuleOption obj = (RModuleOption) v.get(i);
                copyObj.addRModuleOption(obj.copy());
            }
        }
        else
        {
            copyObj.collRModuleOptions = null;
        }
                                                  
                            
        v = getRIssueTypeOptions();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                RIssueTypeOption obj = (RIssueTypeOption) v.get(i);
                copyObj.addRIssueTypeOption(obj.copy());
            }
        }
        else
        {
            copyObj.collRIssueTypeOptions = null;
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
                                                  
                            
        v = getReports();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                Report obj = (Report) v.get(i);
                copyObj.addReport(obj.copy());
            }
        }
        else
        {
            copyObj.collReports = null;
        }
                            return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public IssueTypePeer getPeer()
    {
        return peer;
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("IssueType:\n");
        str.append("IssueTypeId = ")
               .append(getIssueTypeId())
             .append("\n");
        str.append("Name = ")
               .append(getName())
             .append("\n");
        str.append("Description = ")
               .append(getDescription())
             .append("\n");
        str.append("ParentId = ")
               .append(getParentId())
             .append("\n");
        str.append("Dedupe = ")
               .append(getDedupe())
             .append("\n");
        str.append("Deleted = ")
               .append(getDeleted())
             .append("\n");
        str.append("Locked = ")
               .append(getLocked())
             .append("\n");
        str.append("Isdefault = ")
               .append(getIsdefault())
             .append("\n");
        return(str.toString());
    }
}
