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
 * extended all references should be to ScarabModule
 */
public abstract class BaseScarabModule extends org.tigris.scarab.om.AbstractScarabModule
    implements org.apache.fulcrum.intake.Retrievable
{
    /** The Peer class */
    private static final ScarabModulePeer peer =
        new ScarabModulePeer();

        
    /** The value for the moduleId field */
    private Integer moduleId;
      
    /** The value for the realName field */
    private String realName;
      
    /** The value for the domain field */
    private String domain;
      
    /** The value for the code field */
    private String code;
      
    /** The value for the description field */
    private String description;
      
    /** The value for the url field */
    private String url;
      
    /** The value for the archiveEmail field */
    private String archiveEmail;
      
    /** The value for the parentId field */
    private Integer parentId;
      
    /** The value for the ownerId field */
    private Integer ownerId;
      
    /** The value for the qaContactId field */
    private Integer qaContactId;
                                                                
    /** The value for the deleted field */
    private boolean deleted = false;
                                                                
    /** The value for the locked field */
    private boolean locked = false;
      
    /** The value for the classKey field */
    private int classKey;
  
            
    /**
     * Get the ModuleId
     *
     * @return Integer
     */
    public Integer getModuleId()
    {
        return moduleId;
    }

                                              
    /**
     * Set the value of ModuleId
     *
     * @param v new value
     */
    public void setModuleId(Integer v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.moduleId, v))
              {
            this.moduleId = v;
            setModified(true);
        }
    
          
                                  
                  // update associated AttributeGroup
        if (collAttributeGroups != null)
        {
            for (int i = 0; i < collAttributeGroups.size(); i++)
            {
                ((AttributeGroup) collAttributeGroups.get(i))
                        .setModuleId(v);
            }
        }
                                                    
                  // update associated Issue
        if (collIssues != null)
        {
            for (int i = 0; i < collIssues.size(); i++)
            {
                ((Issue) collIssues.get(i))
                        .setModuleId(v);
            }
        }
                                                    
                  // update associated RModuleIssueType
        if (collRModuleIssueTypes != null)
        {
            for (int i = 0; i < collRModuleIssueTypes.size(); i++)
            {
                ((RModuleIssueType) collRModuleIssueTypes.get(i))
                        .setModuleId(v);
            }
        }
                                                    
                  // update associated MITListItem
        if (collMITListItems != null)
        {
            for (int i = 0; i < collMITListItems.size(); i++)
            {
                ((MITListItem) collMITListItems.get(i))
                        .setModuleId(v);
            }
        }
                                                                  
                  // update associated RModuleAttribute
        if (collRModuleAttributes != null)
        {
            for (int i = 0; i < collRModuleAttributes.size(); i++)
            {
                ((RModuleAttribute) collRModuleAttributes.get(i))
                        .setModuleId(v);
            }
        }
                                                    
                  // update associated RModuleOption
        if (collRModuleOptions != null)
        {
            for (int i = 0; i < collRModuleOptions.size(); i++)
            {
                ((RModuleOption) collRModuleOptions.get(i))
                        .setModuleId(v);
            }
        }
                                                    
                  // update associated RModuleUserAttribute
        if (collRModuleUserAttributes != null)
        {
            for (int i = 0; i < collRModuleUserAttributes.size(); i++)
            {
                ((RModuleUserAttribute) collRModuleUserAttributes.get(i))
                        .setModuleId(v);
            }
        }
                                                    
                  // update associated UserVote
        if (collUserVotes != null)
        {
            for (int i = 0; i < collUserVotes.size(); i++)
            {
                ((UserVote) collUserVotes.get(i))
                        .setModuleId(v);
            }
        }
                                                    
                  // update associated Query
        if (collQuerys != null)
        {
            for (int i = 0; i < collQuerys.size(); i++)
            {
                ((Query) collQuerys.get(i))
                        .setModuleId(v);
            }
        }
                                                    
                  // update associated Report
        if (collReports != null)
        {
            for (int i = 0; i < collReports.size(); i++)
            {
                ((Report) collReports.get(i))
                        .setModuleId(v);
            }
        }
                                                    
                  // update associated PendingGroupUserRole
        if (collPendingGroupUserRoles != null)
        {
            for (int i = 0; i < collPendingGroupUserRoles.size(); i++)
            {
                ((PendingGroupUserRole) collPendingGroupUserRoles.get(i))
                        .setGroupId(v);
            }
        }
                                                    
                  // update associated GlobalParameter
        if (collGlobalParameters != null)
        {
            for (int i = 0; i < collGlobalParameters.size(); i++)
            {
                ((GlobalParameter) collGlobalParameters.get(i))
                        .setModuleId(v);
            }
        }
                                                    
                  // update associated NotificationFilter
        if (collNotificationFilters != null)
        {
            for (int i = 0; i < collNotificationFilters.size(); i++)
            {
                ((NotificationFilter) collNotificationFilters.get(i))
                        .setModuleId(v);
            }
        }
                                                    
                  // update associated NotificationDefaultFilter
        if (collNotificationDefaultFilters != null)
        {
            for (int i = 0; i < collNotificationDefaultFilters.size(); i++)
            {
                ((NotificationDefaultFilter) collNotificationDefaultFilters.get(i))
                        .setModuleId(v);
            }
        }
                                }
          
    /**
     * Get the RealName
     *
     * @return String
     */
    public String getRealName()
    {
        return realName;
    }

                        
    /**
     * Set the value of RealName
     *
     * @param v new value
     */
    public void setRealName(String v) 
    {
    
                  if (!ObjectUtils.equals(this.realName, v))
              {
            this.realName = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the Domain
     *
     * @return String
     */
    public String getDomain()
    {
        return domain;
    }

                        
    /**
     * Set the value of Domain
     *
     * @param v new value
     */
    public void setDomain(String v) 
    {
    
                  if (!ObjectUtils.equals(this.domain, v))
              {
            this.domain = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the Code
     *
     * @return String
     */
    public String getCode()
    {
        return code;
    }

                        
    /**
     * Set the value of Code
     *
     * @param v new value
     */
    public void setCode(String v) 
    {
    
                  if (!ObjectUtils.equals(this.code, v))
              {
            this.code = v;
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
     * Get the Url
     *
     * @return String
     */
    public String getUrl()
    {
        return url;
    }

                        
    /**
     * Set the value of Url
     *
     * @param v new value
     */
    public void setUrl(String v) 
    {
    
                  if (!ObjectUtils.equals(this.url, v))
              {
            this.url = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the ArchiveEmail
     *
     * @return String
     */
    public String getArchiveEmail()
    {
        return archiveEmail;
    }

                        
    /**
     * Set the value of ArchiveEmail
     *
     * @param v new value
     */
    public void setArchiveEmail(String v) 
    {
    
                  if (!ObjectUtils.equals(this.archiveEmail, v))
              {
            this.archiveEmail = v;
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
    
                                                                                  
                if (aModuleRelatedByParentId != null && !ObjectUtils.equals(aModuleRelatedByParentId.getModuleId(), v))
                {
            aModuleRelatedByParentId = null;
        }
      
              }
          
    /**
     * Get the OwnerId
     *
     * @return Integer
     */
    public Integer getOwnerId()
    {
        return ownerId;
    }

                              
    /**
     * Set the value of OwnerId
     *
     * @param v new value
     */
    public void setOwnerId(Integer v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.ownerId, v))
              {
            this.ownerId = v;
            setModified(true);
        }
    
                                                                                  
                if (aScarabUserRelatedByOwnerId != null && !ObjectUtils.equals(aScarabUserRelatedByOwnerId.getUserId(), v))
                {
            aScarabUserRelatedByOwnerId = null;
        }
      
              }
          
    /**
     * Get the QaContactId
     *
     * @return Integer
     */
    public Integer getQaContactId()
    {
        return qaContactId;
    }

                              
    /**
     * Set the value of QaContactId
     *
     * @param v new value
     */
    public void setQaContactId(Integer v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.qaContactId, v))
              {
            this.qaContactId = v;
            setModified(true);
        }
    
                                                                                  
                if (aScarabUserRelatedByQaContactId != null && !ObjectUtils.equals(aScarabUserRelatedByQaContactId.getUserId(), v))
                {
            aScarabUserRelatedByQaContactId = null;
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
     * Get the ClassKey
     *
     * @return int
     */
    public int getClassKey()
    {
        return classKey;
    }

                        
    /**
     * Set the value of ClassKey
     *
     * @param v new value
     */
    public void setClassKey(int v) 
    {
    
                  if (this.classKey != v)
              {
            this.classKey = v;
            setModified(true);
        }
    
          
              }
  
      
            
                        
        
        private Module aModuleRelatedByParentId;

    /**
     * Declares an association between this object and a Module object
     *
     * @param v Module
     * @throws TorqueException
     */
    public void setModuleRelatedByParentId(Module v) throws TorqueException
    {
            if (v == null)
        {
                  setParentId((Integer) null);
              }
        else
        {
            setParentId(v.getModuleId());
        }
            aModuleRelatedByParentId = v;
    }

                        
    /**
     * Returns the associated Module object.
           * If it was not retrieved before, the object is retrieved from
     * the database
           *
     * @return the associated Module object
           * @throws TorqueException
           */
    public Module getModuleRelatedByParentId()
              throws TorqueException
          {
              if (aModuleRelatedByParentId == null && (!ObjectUtils.equals(this.parentId, null)))
        {
                    aModuleRelatedByParentId = ModuleManager.getInstance(SimpleKey.keyFor(this.parentId));
                }
              return aModuleRelatedByParentId;
    }

    /**
     * Return the associated Module object
     * If it was not retrieved before, the object is retrieved from
     * the database using the passed connection
     *
     * @param connection the connection used to retrieve the associated object
     *        from the database, if it was not retrieved before
     * @return the associated Module object
     * @throws TorqueException
     */
    public Module getModuleRelatedByParentId(Connection connection)
        throws TorqueException
    {
        if (aModuleRelatedByParentId == null && (!ObjectUtils.equals(this.parentId, null)))
        {
                    aModuleRelatedByParentId = ModuleManager.getCachedInstance(SimpleKey.keyFor(this.parentId));
            if (aModuleRelatedByParentId == null)
            {
                          aModuleRelatedByParentId = ScarabModulePeer.retrieveByPK(SimpleKey.keyFor(this.parentId), connection);
                          ModuleManager.putInstance(aModuleRelatedByParentId);
            }
                }
        return aModuleRelatedByParentId;
    }
    
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setModuleRelatedByParentIdKey(ObjectKey key) throws TorqueException
    {
    
                    setParentId(new Integer(((NumberKey) key).intValue()));
              }
  
            
                        
        
        private ScarabUser aScarabUserRelatedByOwnerId;

    /**
     * Declares an association between this object and a ScarabUser object
     *
     * @param v ScarabUser
     * @throws TorqueException
     */
    public void setScarabUserRelatedByOwnerId(ScarabUser v) throws TorqueException
    {
            if (v == null)
        {
                  setOwnerId((Integer) null);
              }
        else
        {
            setOwnerId(v.getUserId());
        }
            aScarabUserRelatedByOwnerId = v;
    }

                        
    /**
     * Returns the associated ScarabUser object.
           * If it was not retrieved before, the object is retrieved from
     * the database
           *
     * @return the associated ScarabUser object
           * @throws TorqueException
           */
    public ScarabUser getScarabUserRelatedByOwnerId()
              throws TorqueException
          {
              if (aScarabUserRelatedByOwnerId == null && (!ObjectUtils.equals(this.ownerId, null)))
        {
                    aScarabUserRelatedByOwnerId = ScarabUserManager.getInstance(SimpleKey.keyFor(this.ownerId));
                }
              return aScarabUserRelatedByOwnerId;
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
    public ScarabUser getScarabUserRelatedByOwnerId(Connection connection)
        throws TorqueException
    {
        if (aScarabUserRelatedByOwnerId == null && (!ObjectUtils.equals(this.ownerId, null)))
        {
                    aScarabUserRelatedByOwnerId = ScarabUserManager.getCachedInstance(SimpleKey.keyFor(this.ownerId));
            if (aScarabUserRelatedByOwnerId == null)
            {
                          aScarabUserRelatedByOwnerId = ScarabUserImplPeer.retrieveScarabUserImplByPK(SimpleKey.keyFor(this.ownerId), connection);
                          ScarabUserManager.putInstance(aScarabUserRelatedByOwnerId);
            }
                }
        return aScarabUserRelatedByOwnerId;
    }
    
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setScarabUserRelatedByOwnerIdKey(ObjectKey key) throws TorqueException
    {
    
                    setOwnerId(new Integer(((NumberKey) key).intValue()));
              }
  
            
                        
        
        private ScarabUser aScarabUserRelatedByQaContactId;

    /**
     * Declares an association between this object and a ScarabUser object
     *
     * @param v ScarabUser
     * @throws TorqueException
     */
    public void setScarabUserRelatedByQaContactId(ScarabUser v) throws TorqueException
    {
            if (v == null)
        {
                  setQaContactId((Integer) null);
              }
        else
        {
            setQaContactId(v.getUserId());
        }
            aScarabUserRelatedByQaContactId = v;
    }

                        
    /**
     * Returns the associated ScarabUser object.
           * If it was not retrieved before, the object is retrieved from
     * the database
           *
     * @return the associated ScarabUser object
           * @throws TorqueException
           */
    public ScarabUser getScarabUserRelatedByQaContactId()
              throws TorqueException
          {
              if (aScarabUserRelatedByQaContactId == null && (!ObjectUtils.equals(this.qaContactId, null)))
        {
                    aScarabUserRelatedByQaContactId = ScarabUserManager.getInstance(SimpleKey.keyFor(this.qaContactId));
                }
              return aScarabUserRelatedByQaContactId;
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
    public ScarabUser getScarabUserRelatedByQaContactId(Connection connection)
        throws TorqueException
    {
        if (aScarabUserRelatedByQaContactId == null && (!ObjectUtils.equals(this.qaContactId, null)))
        {
                    aScarabUserRelatedByQaContactId = ScarabUserManager.getCachedInstance(SimpleKey.keyFor(this.qaContactId));
            if (aScarabUserRelatedByQaContactId == null)
            {
                          aScarabUserRelatedByQaContactId = ScarabUserImplPeer.retrieveScarabUserImplByPK(SimpleKey.keyFor(this.qaContactId), connection);
                          ScarabUserManager.putInstance(aScarabUserRelatedByQaContactId);
            }
                }
        return aScarabUserRelatedByQaContactId;
    }
    
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setScarabUserRelatedByQaContactIdKey(ObjectKey key) throws TorqueException
    {
    
                    setQaContactId(new Integer(((NumberKey) key).intValue()));
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
        l.setModule((ScarabModule) this);
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
     * Otherwise if this ScarabModule has previously
           * been saved, it will retrieve related AttributeGroups from storage.
     * If this ScarabModule is new, it will return
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
                        criteria.add(AttributeGroupPeer.MODULE_ID, getModuleId() );
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
                            criteria.add(AttributeGroupPeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule has previously
           * been saved, it will retrieve related AttributeGroups from storage.
     * If this ScarabModule is new, it will return
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
                         criteria.add(AttributeGroupPeer.MODULE_ID, getModuleId());
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
                             criteria.add(AttributeGroupPeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related AttributeGroups from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(AttributeGroupPeer.MODULE_ID, getModuleId());
                              collAttributeGroups = AttributeGroupPeer.doSelectJoinScarabModule(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttributeGroupPeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related AttributeGroups from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(AttributeGroupPeer.MODULE_ID, getModuleId());
                              collAttributeGroups = AttributeGroupPeer.doSelectJoinIssueType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(AttributeGroupPeer.MODULE_ID, getModuleId());
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
        l.setModule((ScarabModule) this);
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
     * Otherwise if this ScarabModule has previously
           * been saved, it will retrieve related Issues from storage.
     * If this ScarabModule is new, it will return
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
                        criteria.add(IssuePeer.MODULE_ID, getModuleId() );
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
                            criteria.add(IssuePeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule has previously
           * been saved, it will retrieve related Issues from storage.
     * If this ScarabModule is new, it will return
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
                         criteria.add(IssuePeer.MODULE_ID, getModuleId());
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
                             criteria.add(IssuePeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related Issues from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(IssuePeer.MODULE_ID, getModuleId());
                              collIssues = IssuePeer.doSelectJoinScarabModule(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(IssuePeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related Issues from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(IssuePeer.MODULE_ID, getModuleId());
                              collIssues = IssuePeer.doSelectJoinIssueType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(IssuePeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related Issues from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(IssuePeer.MODULE_ID, getModuleId());
                              collIssues = IssuePeer.doSelectJoinActivitySetRelatedByCreatedTransId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(IssuePeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related Issues from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(IssuePeer.MODULE_ID, getModuleId());
                              collIssues = IssuePeer.doSelectJoinActivitySetRelatedByLastTransId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(IssuePeer.MODULE_ID, getModuleId());
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
        l.setModule((ScarabModule) this);
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
     * Otherwise if this ScarabModule has previously
           * been saved, it will retrieve related RModuleIssueTypes from storage.
     * If this ScarabModule is new, it will return
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
                        criteria.add(RModuleIssueTypePeer.MODULE_ID, getModuleId() );
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
                            criteria.add(RModuleIssueTypePeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule has previously
           * been saved, it will retrieve related RModuleIssueTypes from storage.
     * If this ScarabModule is new, it will return
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
                         criteria.add(RModuleIssueTypePeer.MODULE_ID, getModuleId());
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
                             criteria.add(RModuleIssueTypePeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related RModuleIssueTypes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(RModuleIssueTypePeer.MODULE_ID, getModuleId());
                              collRModuleIssueTypes = RModuleIssueTypePeer.doSelectJoinScarabModule(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleIssueTypePeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related RModuleIssueTypes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(RModuleIssueTypePeer.MODULE_ID, getModuleId());
                              collRModuleIssueTypes = RModuleIssueTypePeer.doSelectJoinIssueType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleIssueTypePeer.MODULE_ID, getModuleId());
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
        l.setModule((ScarabModule) this);
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
     * Otherwise if this ScarabModule has previously
           * been saved, it will retrieve related MITListItems from storage.
     * If this ScarabModule is new, it will return
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
                        criteria.add(MITListItemPeer.MODULE_ID, getModuleId() );
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
                            criteria.add(MITListItemPeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule has previously
           * been saved, it will retrieve related MITListItems from storage.
     * If this ScarabModule is new, it will return
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
                         criteria.add(MITListItemPeer.MODULE_ID, getModuleId());
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
                             criteria.add(MITListItemPeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related MITListItems from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(MITListItemPeer.MODULE_ID, getModuleId());
                              collMITListItems = MITListItemPeer.doSelectJoinMITList(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(MITListItemPeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related MITListItems from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(MITListItemPeer.MODULE_ID, getModuleId());
                              collMITListItems = MITListItemPeer.doSelectJoinScarabModule(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(MITListItemPeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related MITListItems from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(MITListItemPeer.MODULE_ID, getModuleId());
                              collMITListItems = MITListItemPeer.doSelectJoinIssueType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(MITListItemPeer.MODULE_ID, getModuleId());
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
        l.setModule((ScarabModule) this);
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
     * Otherwise if this ScarabModule has previously
           * been saved, it will retrieve related RModuleAttributes from storage.
     * If this ScarabModule is new, it will return
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
                        criteria.add(RModuleAttributePeer.MODULE_ID, getModuleId() );
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
                            criteria.add(RModuleAttributePeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule has previously
           * been saved, it will retrieve related RModuleAttributes from storage.
     * If this ScarabModule is new, it will return
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
                         criteria.add(RModuleAttributePeer.MODULE_ID, getModuleId());
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
                             criteria.add(RModuleAttributePeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related RModuleAttributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(RModuleAttributePeer.MODULE_ID, getModuleId());
                              collRModuleAttributes = RModuleAttributePeer.doSelectJoinAttribute(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleAttributePeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related RModuleAttributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(RModuleAttributePeer.MODULE_ID, getModuleId());
                              collRModuleAttributes = RModuleAttributePeer.doSelectJoinScarabModule(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleAttributePeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related RModuleAttributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(RModuleAttributePeer.MODULE_ID, getModuleId());
                              collRModuleAttributes = RModuleAttributePeer.doSelectJoinIssueType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleAttributePeer.MODULE_ID, getModuleId());
                                    if (!lastRModuleAttributesCriteria.equals(criteria))
            {
                collRModuleAttributes = RModuleAttributePeer.doSelectJoinIssueType(criteria);
            }
        }
        lastRModuleAttributesCriteria = criteria;

        return collRModuleAttributes;
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
        l.setModule((ScarabModule) this);
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
     * Otherwise if this ScarabModule has previously
           * been saved, it will retrieve related RModuleOptions from storage.
     * If this ScarabModule is new, it will return
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
                        criteria.add(RModuleOptionPeer.MODULE_ID, getModuleId() );
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
                            criteria.add(RModuleOptionPeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule has previously
           * been saved, it will retrieve related RModuleOptions from storage.
     * If this ScarabModule is new, it will return
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
                         criteria.add(RModuleOptionPeer.MODULE_ID, getModuleId());
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
                             criteria.add(RModuleOptionPeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related RModuleOptions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(RModuleOptionPeer.MODULE_ID, getModuleId());
                              collRModuleOptions = RModuleOptionPeer.doSelectJoinAttributeOption(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleOptionPeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related RModuleOptions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(RModuleOptionPeer.MODULE_ID, getModuleId());
                              collRModuleOptions = RModuleOptionPeer.doSelectJoinScarabModule(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleOptionPeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related RModuleOptions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(RModuleOptionPeer.MODULE_ID, getModuleId());
                              collRModuleOptions = RModuleOptionPeer.doSelectJoinIssueType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleOptionPeer.MODULE_ID, getModuleId());
                                    if (!lastRModuleOptionsCriteria.equals(criteria))
            {
                collRModuleOptions = RModuleOptionPeer.doSelectJoinIssueType(criteria);
            }
        }
        lastRModuleOptionsCriteria = criteria;

        return collRModuleOptions;
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
        l.setModule((ScarabModule) this);
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
     * Otherwise if this ScarabModule has previously
           * been saved, it will retrieve related RModuleUserAttributes from storage.
     * If this ScarabModule is new, it will return
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
                        criteria.add(RModuleUserAttributePeer.MODULE_ID, getModuleId() );
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
                            criteria.add(RModuleUserAttributePeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule has previously
           * been saved, it will retrieve related RModuleUserAttributes from storage.
     * If this ScarabModule is new, it will return
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
                         criteria.add(RModuleUserAttributePeer.MODULE_ID, getModuleId());
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
                             criteria.add(RModuleUserAttributePeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related RModuleUserAttributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(RModuleUserAttributePeer.MODULE_ID, getModuleId());
                              collRModuleUserAttributes = RModuleUserAttributePeer.doSelectJoinMITList(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleUserAttributePeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related RModuleUserAttributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(RModuleUserAttributePeer.MODULE_ID, getModuleId());
                              collRModuleUserAttributes = RModuleUserAttributePeer.doSelectJoinScarabModule(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleUserAttributePeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related RModuleUserAttributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(RModuleUserAttributePeer.MODULE_ID, getModuleId());
                              collRModuleUserAttributes = RModuleUserAttributePeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleUserAttributePeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related RModuleUserAttributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(RModuleUserAttributePeer.MODULE_ID, getModuleId());
                              collRModuleUserAttributes = RModuleUserAttributePeer.doSelectJoinIssueType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleUserAttributePeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related RModuleUserAttributes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(RModuleUserAttributePeer.MODULE_ID, getModuleId());
                              collRModuleUserAttributes = RModuleUserAttributePeer.doSelectJoinAttribute(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(RModuleUserAttributePeer.MODULE_ID, getModuleId());
                                    if (!lastRModuleUserAttributesCriteria.equals(criteria))
            {
                collRModuleUserAttributes = RModuleUserAttributePeer.doSelectJoinAttribute(criteria);
            }
        }
        lastRModuleUserAttributesCriteria = criteria;

        return collRModuleUserAttributes;
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
        l.setModule((ScarabModule) this);
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
     * Otherwise if this ScarabModule has previously
           * been saved, it will retrieve related UserVotes from storage.
     * If this ScarabModule is new, it will return
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
                        criteria.add(UserVotePeer.MODULE_ID, getModuleId() );
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
                            criteria.add(UserVotePeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule has previously
           * been saved, it will retrieve related UserVotes from storage.
     * If this ScarabModule is new, it will return
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
                         criteria.add(UserVotePeer.MODULE_ID, getModuleId());
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
                             criteria.add(UserVotePeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related UserVotes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(UserVotePeer.MODULE_ID, getModuleId());
                              collUserVotes = UserVotePeer.doSelectJoinScarabModule(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(UserVotePeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related UserVotes from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(UserVotePeer.MODULE_ID, getModuleId());
                              collUserVotes = UserVotePeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(UserVotePeer.MODULE_ID, getModuleId());
                                    if (!lastUserVotesCriteria.equals(criteria))
            {
                collUserVotes = UserVotePeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        lastUserVotesCriteria = criteria;

        return collUserVotes;
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
        l.setModule((ScarabModule) this);
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
     * Otherwise if this ScarabModule has previously
           * been saved, it will retrieve related Querys from storage.
     * If this ScarabModule is new, it will return
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
                        criteria.add(QueryPeer.MODULE_ID, getModuleId() );
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
                            criteria.add(QueryPeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule has previously
           * been saved, it will retrieve related Querys from storage.
     * If this ScarabModule is new, it will return
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
                         criteria.add(QueryPeer.MODULE_ID, getModuleId());
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
                             criteria.add(QueryPeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related Querys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(QueryPeer.MODULE_ID, getModuleId());
                              collQuerys = QueryPeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(QueryPeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related Querys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(QueryPeer.MODULE_ID, getModuleId());
                              collQuerys = QueryPeer.doSelectJoinScope(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(QueryPeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related Querys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(QueryPeer.MODULE_ID, getModuleId());
                              collQuerys = QueryPeer.doSelectJoinScarabModule(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(QueryPeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related Querys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(QueryPeer.MODULE_ID, getModuleId());
                              collQuerys = QueryPeer.doSelectJoinIssueType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(QueryPeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related Querys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(QueryPeer.MODULE_ID, getModuleId());
                              collQuerys = QueryPeer.doSelectJoinMITList(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(QueryPeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related Querys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(QueryPeer.MODULE_ID, getModuleId());
                              collQuerys = QueryPeer.doSelectJoinFrequency(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(QueryPeer.MODULE_ID, getModuleId());
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
        l.setModule((ScarabModule) this);
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
     * Otherwise if this ScarabModule has previously
           * been saved, it will retrieve related Reports from storage.
     * If this ScarabModule is new, it will return
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
                        criteria.add(ReportPeer.MODULE_ID, getModuleId() );
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
                            criteria.add(ReportPeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule has previously
           * been saved, it will retrieve related Reports from storage.
     * If this ScarabModule is new, it will return
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
                         criteria.add(ReportPeer.MODULE_ID, getModuleId());
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
                             criteria.add(ReportPeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related Reports from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(ReportPeer.MODULE_ID, getModuleId());
                              collReports = ReportPeer.doSelectJoinIssueType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ReportPeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related Reports from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(ReportPeer.MODULE_ID, getModuleId());
                              collReports = ReportPeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ReportPeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related Reports from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(ReportPeer.MODULE_ID, getModuleId());
                              collReports = ReportPeer.doSelectJoinScarabModule(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ReportPeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related Reports from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(ReportPeer.MODULE_ID, getModuleId());
                              collReports = ReportPeer.doSelectJoinScope(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ReportPeer.MODULE_ID, getModuleId());
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
        l.setModule((ScarabModule) this);
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
     * Otherwise if this ScarabModule has previously
           * been saved, it will retrieve related PendingGroupUserRoles from storage.
     * If this ScarabModule is new, it will return
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
                        criteria.add(PendingGroupUserRolePeer.GROUP_ID, getModuleId() );
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
                            criteria.add(PendingGroupUserRolePeer.GROUP_ID, getModuleId());
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
     * Otherwise if this ScarabModule has previously
           * been saved, it will retrieve related PendingGroupUserRoles from storage.
     * If this ScarabModule is new, it will return
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
                         criteria.add(PendingGroupUserRolePeer.GROUP_ID, getModuleId());
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
                             criteria.add(PendingGroupUserRolePeer.GROUP_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related PendingGroupUserRoles from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(PendingGroupUserRolePeer.GROUP_ID, getModuleId());
                              collPendingGroupUserRoles = PendingGroupUserRolePeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(PendingGroupUserRolePeer.GROUP_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related PendingGroupUserRoles from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(PendingGroupUserRolePeer.GROUP_ID, getModuleId());
                              collPendingGroupUserRoles = PendingGroupUserRolePeer.doSelectJoinScarabModule(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(PendingGroupUserRolePeer.GROUP_ID, getModuleId());
                                    if (!lastPendingGroupUserRolesCriteria.equals(criteria))
            {
                collPendingGroupUserRoles = PendingGroupUserRolePeer.doSelectJoinScarabModule(criteria);
            }
        }
        lastPendingGroupUserRolesCriteria = criteria;

        return collPendingGroupUserRoles;
                }
                            


                          
            
          /**
     * Collection to store aggregation of collGlobalParameters
     */
    protected List collGlobalParameters;

    /**
     * Temporary storage of collGlobalParameters to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initGlobalParameters()
    {
        if (collGlobalParameters == null)
        {
            collGlobalParameters = new ArrayList();
        }
    }

                        
    /**
     * Method called to associate a GlobalParameter object to this object
     * through the GlobalParameter foreign key attribute
     *
     * @param l GlobalParameter
     * @throws TorqueException
     */
    public void addGlobalParameter(GlobalParameter l) throws TorqueException
    {
        getGlobalParameters().add(l);
        l.setModule((ScarabModule) this);
    }

    /**
     * The criteria used to select the current contents of collGlobalParameters
     */
    private Criteria lastGlobalParametersCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getGlobalParameters(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getGlobalParameters()
              throws TorqueException
          {
                      if (collGlobalParameters == null)
        {
            collGlobalParameters = getGlobalParameters(new Criteria(10));
        }
                return collGlobalParameters;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabModule has previously
           * been saved, it will retrieve related GlobalParameters from storage.
     * If this ScarabModule is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getGlobalParameters(Criteria criteria) throws TorqueException
    {
              if (collGlobalParameters == null)
        {
            if (isNew())
            {
               collGlobalParameters = new ArrayList();
            }
            else
            {
                        criteria.add(GlobalParameterPeer.MODULE_ID, getModuleId() );
                        collGlobalParameters = GlobalParameterPeer.doSelect(criteria);
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
                            criteria.add(GlobalParameterPeer.MODULE_ID, getModuleId());
                            if (!lastGlobalParametersCriteria.equals(criteria))
                {
                    collGlobalParameters = GlobalParameterPeer.doSelect(criteria);
                }
            }
        }
        lastGlobalParametersCriteria = criteria;

        return collGlobalParameters;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getGlobalParameters(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getGlobalParameters(Connection con) throws TorqueException
    {
              if (collGlobalParameters == null)
        {
            collGlobalParameters = getGlobalParameters(new Criteria(10), con);
        }
        return collGlobalParameters;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabModule has previously
           * been saved, it will retrieve related GlobalParameters from storage.
     * If this ScarabModule is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getGlobalParameters(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collGlobalParameters == null)
        {
            if (isNew())
            {
               collGlobalParameters = new ArrayList();
            }
            else
            {
                         criteria.add(GlobalParameterPeer.MODULE_ID, getModuleId());
                         collGlobalParameters = GlobalParameterPeer.doSelect(criteria, con);
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
                             criteria.add(GlobalParameterPeer.MODULE_ID, getModuleId());
                             if (!lastGlobalParametersCriteria.equals(criteria))
                 {
                     collGlobalParameters = GlobalParameterPeer.doSelect(criteria, con);
                 }
             }
         }
         lastGlobalParametersCriteria = criteria;

         return collGlobalParameters;
           }

                  
              
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related GlobalParameters from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
     */
    protected List getGlobalParametersJoinScarabModule(Criteria criteria)
        throws TorqueException
    {
                    if (collGlobalParameters == null)
        {
            if (isNew())
            {
               collGlobalParameters = new ArrayList();
            }
            else
            {
                              criteria.add(GlobalParameterPeer.MODULE_ID, getModuleId());
                              collGlobalParameters = GlobalParameterPeer.doSelectJoinScarabModule(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(GlobalParameterPeer.MODULE_ID, getModuleId());
                                    if (!lastGlobalParametersCriteria.equals(criteria))
            {
                collGlobalParameters = GlobalParameterPeer.doSelectJoinScarabModule(criteria);
            }
        }
        lastGlobalParametersCriteria = criteria;

        return collGlobalParameters;
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
        l.setModule((ScarabModule) this);
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
     * Otherwise if this ScarabModule has previously
           * been saved, it will retrieve related NotificationFilters from storage.
     * If this ScarabModule is new, it will return
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
                        criteria.add(NotificationFilterPeer.MODULE_ID, getModuleId() );
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
                            criteria.add(NotificationFilterPeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule has previously
           * been saved, it will retrieve related NotificationFilters from storage.
     * If this ScarabModule is new, it will return
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
                         criteria.add(NotificationFilterPeer.MODULE_ID, getModuleId());
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
                             criteria.add(NotificationFilterPeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related NotificationFilters from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(NotificationFilterPeer.MODULE_ID, getModuleId());
                              collNotificationFilters = NotificationFilterPeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(NotificationFilterPeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related NotificationFilters from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(NotificationFilterPeer.MODULE_ID, getModuleId());
                              collNotificationFilters = NotificationFilterPeer.doSelectJoinScarabModule(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(NotificationFilterPeer.MODULE_ID, getModuleId());
                                    if (!lastNotificationFiltersCriteria.equals(criteria))
            {
                collNotificationFilters = NotificationFilterPeer.doSelectJoinScarabModule(criteria);
            }
        }
        lastNotificationFiltersCriteria = criteria;

        return collNotificationFilters;
                }
                            


                          
            
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
        l.setModule((ScarabModule) this);
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
     * Otherwise if this ScarabModule has previously
           * been saved, it will retrieve related NotificationDefaultFilters from storage.
     * If this ScarabModule is new, it will return
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
                        criteria.add(NotificationDefaultFilterPeer.MODULE_ID, getModuleId() );
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
                            criteria.add(NotificationDefaultFilterPeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule has previously
           * been saved, it will retrieve related NotificationDefaultFilters from storage.
     * If this ScarabModule is new, it will return
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
                         criteria.add(NotificationDefaultFilterPeer.MODULE_ID, getModuleId());
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
                             criteria.add(NotificationDefaultFilterPeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related NotificationDefaultFilters from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(NotificationDefaultFilterPeer.MODULE_ID, getModuleId());
                              collNotificationDefaultFilters = NotificationDefaultFilterPeer.doSelectJoinScarabRoleImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(NotificationDefaultFilterPeer.MODULE_ID, getModuleId());
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
     * Otherwise if this ScarabModule is new, it will return
                 * an empty collection; or if this ScarabModule has previously
     * been saved, it will retrieve related NotificationDefaultFilters from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ScarabModule.
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
                              criteria.add(NotificationDefaultFilterPeer.MODULE_ID, getModuleId());
                              collNotificationDefaultFilters = NotificationDefaultFilterPeer.doSelectJoinScarabModule(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(NotificationDefaultFilterPeer.MODULE_ID, getModuleId());
                                    if (!lastNotificationDefaultFiltersCriteria.equals(criteria))
            {
                collNotificationDefaultFilters = NotificationDefaultFilterPeer.doSelectJoinScarabModule(criteria);
            }
        }
        lastNotificationDefaultFiltersCriteria = criteria;

        return collNotificationDefaultFilters;
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
              fieldNames.add("ModuleId");
              fieldNames.add("RealName");
              fieldNames.add("Domain");
              fieldNames.add("Code");
              fieldNames.add("Description");
              fieldNames.add("Url");
              fieldNames.add("ArchiveEmail");
              fieldNames.add("ParentId");
              fieldNames.add("OwnerId");
              fieldNames.add("QaContactId");
              fieldNames.add("Deleted");
              fieldNames.add("Locked");
              fieldNames.add("ClassKey");
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
          if (name.equals("ModuleId"))
        {
                return getModuleId();
            }
          if (name.equals("RealName"))
        {
                return getRealName();
            }
          if (name.equals("Domain"))
        {
                return getDomain();
            }
          if (name.equals("Code"))
        {
                return getCode();
            }
          if (name.equals("Description"))
        {
                return getDescription();
            }
          if (name.equals("Url"))
        {
                return getUrl();
            }
          if (name.equals("ArchiveEmail"))
        {
                return getArchiveEmail();
            }
          if (name.equals("ParentId"))
        {
                return getParentId();
            }
          if (name.equals("OwnerId"))
        {
                return getOwnerId();
            }
          if (name.equals("QaContactId"))
        {
                return getQaContactId();
            }
          if (name.equals("Deleted"))
        {
                return Boolean.valueOf(getDeleted());
            }
          if (name.equals("Locked"))
        {
                return Boolean.valueOf(getLocked());
            }
          if (name.equals("ClassKey"))
        {
                return new Integer(getClassKey());
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
          if (name.equals(ScarabModulePeer.MODULE_ID))
        {
                return getModuleId();
            }
          if (name.equals(ScarabModulePeer.MODULE_NAME))
        {
                return getRealName();
            }
          if (name.equals(ScarabModulePeer.DOMAIN))
        {
                return getDomain();
            }
          if (name.equals(ScarabModulePeer.MODULE_CODE))
        {
                return getCode();
            }
          if (name.equals(ScarabModulePeer.MODULE_DESCRIPTION))
        {
                return getDescription();
            }
          if (name.equals(ScarabModulePeer.MODULE_URL))
        {
                return getUrl();
            }
          if (name.equals(ScarabModulePeer.ARCHIVE_EMAIL))
        {
                return getArchiveEmail();
            }
          if (name.equals(ScarabModulePeer.PARENT_ID))
        {
                return getParentId();
            }
          if (name.equals(ScarabModulePeer.OWNER_ID))
        {
                return getOwnerId();
            }
          if (name.equals(ScarabModulePeer.QA_CONTACT_ID))
        {
                return getQaContactId();
            }
          if (name.equals(ScarabModulePeer.DELETED))
        {
                return Boolean.valueOf(getDeleted());
            }
          if (name.equals(ScarabModulePeer.LOCKED))
        {
                return Boolean.valueOf(getLocked());
            }
          if (name.equals(ScarabModulePeer.CLASS_KEY))
        {
                return new Integer(getClassKey());
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
                return getModuleId();
            }
              if (pos == 1)
        {
                return getRealName();
            }
              if (pos == 2)
        {
                return getDomain();
            }
              if (pos == 3)
        {
                return getCode();
            }
              if (pos == 4)
        {
                return getDescription();
            }
              if (pos == 5)
        {
                return getUrl();
            }
              if (pos == 6)
        {
                return getArchiveEmail();
            }
              if (pos == 7)
        {
                return getParentId();
            }
              if (pos == 8)
        {
                return getOwnerId();
            }
              if (pos == 9)
        {
                return getQaContactId();
            }
              if (pos == 10)
        {
                return Boolean.valueOf(getDeleted());
            }
              if (pos == 11)
        {
                return Boolean.valueOf(getLocked());
            }
              if (pos == 12)
        {
                return new Integer(getClassKey());
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
          save(ScarabModulePeer.getMapBuilder()
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
                    ScarabModulePeer.doInsert((ScarabModule) this, con);
                    setNew(false);
                }
                else
                {
                    ScarabModulePeer.doUpdate((ScarabModule) this, con);
                }

    
                          if (isCacheOnSave())
                {
                    ModuleManager.putInstance(this);
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
                                                  
                                    if (collRModuleOptions != null)
            {
                for (int i = 0; i < collRModuleOptions.size(); i++)
                {
                    ((RModuleOption) collRModuleOptions.get(i)).save(con);
                }
            }
                                                  
                                    if (collRModuleUserAttributes != null)
            {
                for (int i = 0; i < collRModuleUserAttributes.size(); i++)
                {
                    ((RModuleUserAttribute) collRModuleUserAttributes.get(i)).save(con);
                }
            }
                                                  
                                    if (collUserVotes != null)
            {
                for (int i = 0; i < collUserVotes.size(); i++)
                {
                    ((UserVote) collUserVotes.get(i)).save(con);
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
                                                  
                                    if (collPendingGroupUserRoles != null)
            {
                for (int i = 0; i < collPendingGroupUserRoles.size(); i++)
                {
                    ((PendingGroupUserRole) collPendingGroupUserRoles.get(i)).save(con);
                }
            }
                                                  
                                    if (collGlobalParameters != null)
            {
                for (int i = 0; i < collGlobalParameters.size(); i++)
                {
                    ((GlobalParameter) collGlobalParameters.get(i)).save(con);
                }
            }
                                                  
                                    if (collNotificationFilters != null)
            {
                for (int i = 0; i < collNotificationFilters.size(); i++)
                {
                    ((NotificationFilter) collNotificationFilters.get(i)).save(con);
                }
            }
                                                  
                                    if (collNotificationDefaultFilters != null)
            {
                for (int i = 0; i < collNotificationDefaultFilters.size(); i++)
                {
                    ((NotificationDefaultFilter) collNotificationDefaultFilters.get(i)).save(con);
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
     * @param key moduleId ObjectKey
     */
    public void setPrimaryKey(ObjectKey key)
        throws TorqueException
    {
            setModuleId(new Integer(((NumberKey) key).intValue()));
        }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) throws TorqueException
    {
            setModuleId(new Integer(key));
        }

  
    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
          return SimpleKey.keyFor(getModuleId());
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
      public ScarabModule copy() throws TorqueException
    {
        return copyInto(new ScarabModule());
    }
  
    protected ScarabModule copyInto(ScarabModule copyObj) throws TorqueException
    {
          copyObj.setModuleId(moduleId);
          copyObj.setRealName(realName);
          copyObj.setDomain(domain);
          copyObj.setCode(code);
          copyObj.setDescription(description);
          copyObj.setUrl(url);
          copyObj.setArchiveEmail(archiveEmail);
          copyObj.setParentId(parentId);
          copyObj.setOwnerId(ownerId);
          copyObj.setQaContactId(qaContactId);
          copyObj.setDeleted(deleted);
          copyObj.setLocked(locked);
          copyObj.setClassKey(classKey);
  
                    copyObj.setModuleId((Integer)null);
                                                                                    
                                      
                            
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
                                                  
                            
        v = getUserVotes();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                UserVote obj = (UserVote) v.get(i);
                copyObj.addUserVote(obj.copy());
            }
        }
        else
        {
            copyObj.collUserVotes = null;
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
                                                  
                            
        v = getPendingGroupUserRoles();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                PendingGroupUserRole obj = (PendingGroupUserRole) v.get(i);
                copyObj.addPendingGroupUserRole(obj.copy());
            }
        }
        else
        {
            copyObj.collPendingGroupUserRoles = null;
        }
                                                  
                            
        v = getGlobalParameters();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                GlobalParameter obj = (GlobalParameter) v.get(i);
                copyObj.addGlobalParameter(obj.copy());
            }
        }
        else
        {
            copyObj.collGlobalParameters = null;
        }
                                                  
                            
        v = getNotificationFilters();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                NotificationFilter obj = (NotificationFilter) v.get(i);
                copyObj.addNotificationFilter(obj.copy());
            }
        }
        else
        {
            copyObj.collNotificationFilters = null;
        }
                                                  
                            
        v = getNotificationDefaultFilters();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                NotificationDefaultFilter obj = (NotificationDefaultFilter) v.get(i);
                copyObj.addNotificationDefaultFilter(obj.copy());
            }
        }
        else
        {
            copyObj.collNotificationDefaultFilters = null;
        }
                            return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public ScarabModulePeer getPeer()
    {
        return peer;
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("ScarabModule:\n");
        str.append("ModuleId = ")
               .append(getModuleId())
             .append("\n");
        str.append("RealName = ")
               .append(getRealName())
             .append("\n");
        str.append("Domain = ")
               .append(getDomain())
             .append("\n");
        str.append("Code = ")
               .append(getCode())
             .append("\n");
        str.append("Description = ")
               .append(getDescription())
             .append("\n");
        str.append("Url = ")
               .append(getUrl())
             .append("\n");
        str.append("ArchiveEmail = ")
               .append(getArchiveEmail())
             .append("\n");
        str.append("ParentId = ")
               .append(getParentId())
             .append("\n");
        str.append("OwnerId = ")
               .append(getOwnerId())
             .append("\n");
        str.append("QaContactId = ")
               .append(getQaContactId())
             .append("\n");
        str.append("Deleted = ")
               .append(getDeleted())
             .append("\n");
        str.append("Locked = ")
               .append(getLocked())
             .append("\n");
        str.append("ClassKey = ")
               .append(getClassKey())
             .append("\n");
        return(str.toString());
    }
}
