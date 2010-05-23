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
 * extended all references should be to Attachment
 */
public abstract class BaseAttachment extends BaseObject
    implements org.apache.fulcrum.intake.Retrievable
{
    /** The Peer class */
    private static final AttachmentPeer peer =
        new AttachmentPeer();

        
    /** The value for the attachmentId field */
    private Long attachmentId;
      
    /** The value for the issueId field */
    private Long issueId;
      
    /** The value for the typeId field */
    private Integer typeId;
      
    /** The value for the name field */
    private String name;
      
    /** The value for the data field */
    private String data;
      
    /** The value for the fileName field */
    private String fileName;
      
    /** The value for the mimeType field */
    private String mimeType;
      
    /** The value for the modifiedBy field */
    private Integer modifiedBy;
      
    /** The value for the createdBy field */
    private Integer createdBy;
      
    /** The value for the modifiedDate field */
    private Date modifiedDate;
      
    /** The value for the createdDate field */
    private Date createdDate;
                                                                
    /** The value for the deleted field */
    private boolean deleted = false;
  
            
    /**
     * Get the AttachmentId
     *
     * @return Long
     */
    public Long getAttachmentId()
    {
        return attachmentId;
    }

                                              
    /**
     * Set the value of AttachmentId
     *
     * @param v new value
     */
    public void setAttachmentId(Long v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.attachmentId, v))
              {
            this.attachmentId = v;
            setModified(true);
        }
    
          
                                  
                  // update associated Activity
        if (collActivitys != null)
        {
            for (int i = 0; i < collActivitys.size(); i++)
            {
                ((Activity) collActivitys.get(i))
                        .setAttachmentId(v);
            }
        }
                                                    
                  // update associated ActivitySet
        if (collActivitySets != null)
        {
            for (int i = 0; i < collActivitySets.size(); i++)
            {
                ((ActivitySet) collActivitySets.get(i))
                        .setAttachmentId(v);
            }
        }
                                }
          
    /**
     * Get the IssueId
     *
     * @return Long
     */
    public Long getIssueId()
    {
        return issueId;
    }

                              
    /**
     * Set the value of IssueId
     *
     * @param v new value
     */
    public void setIssueId(Long v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.issueId, v))
              {
            this.issueId = v;
            setModified(true);
        }
    
                                  
                if (aIssue != null && !ObjectUtils.equals(aIssue.getIssueId(), v))
                {
            aIssue = null;
        }
      
              }
          
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
    
                                  
                if (aAttachmentType != null && !ObjectUtils.equals(aAttachmentType.getAttachmentTypeId(), v))
                {
            aAttachmentType = null;
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
     * Get the Data
     *
     * @return String
     */
    public String getData()
    {
        return data;
    }

                        
    /**
     * Set the value of Data
     *
     * @param v new value
     */
    public void setData(String v) 
    {
    
                  if (!ObjectUtils.equals(this.data, v))
              {
            this.data = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the FileName
     *
     * @return String
     */
    public String getFileName()
    {
        return fileName;
    }

                        
    /**
     * Set the value of FileName
     *
     * @param v new value
     */
    public void setFileName(String v) 
    {
    
                  if (!ObjectUtils.equals(this.fileName, v))
              {
            this.fileName = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the MimeType
     *
     * @return String
     */
    public String getMimeType()
    {
        return mimeType;
    }

                        
    /**
     * Set the value of MimeType
     *
     * @param v new value
     */
    public void setMimeType(String v) 
    {
    
                  if (!ObjectUtils.equals(this.mimeType, v))
              {
            this.mimeType = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the ModifiedBy
     *
     * @return Integer
     */
    public Integer getModifiedBy()
    {
        return modifiedBy;
    }

                              
    /**
     * Set the value of ModifiedBy
     *
     * @param v new value
     */
    public void setModifiedBy(Integer v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.modifiedBy, v))
              {
            this.modifiedBy = v;
            setModified(true);
        }
    
                                                                                  
                if (aScarabUserRelatedByModifiedBy != null && !ObjectUtils.equals(aScarabUserRelatedByModifiedBy.getUserId(), v))
                {
            aScarabUserRelatedByModifiedBy = null;
        }
      
              }
          
    /**
     * Get the CreatedBy
     *
     * @return Integer
     */
    public Integer getCreatedBy()
    {
        return createdBy;
    }

                              
    /**
     * Set the value of CreatedBy
     *
     * @param v new value
     */
    public void setCreatedBy(Integer v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.createdBy, v))
              {
            this.createdBy = v;
            setModified(true);
        }
    
                                                                                  
                if (aScarabUserRelatedByCreatedBy != null && !ObjectUtils.equals(aScarabUserRelatedByCreatedBy.getUserId(), v))
                {
            aScarabUserRelatedByCreatedBy = null;
        }
      
              }
          
    /**
     * Get the ModifiedDate
     *
     * @return Date
     */
    public Date getModifiedDate()
    {
        return modifiedDate;
    }

                        
    /**
     * Set the value of ModifiedDate
     *
     * @param v new value
     */
    public void setModifiedDate(Date v) 
    {
    
                  if (!ObjectUtils.equals(this.modifiedDate, v))
              {
            this.modifiedDate = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the CreatedDate
     *
     * @return Date
     */
    public Date getCreatedDate()
    {
        return createdDate;
    }

                        
    /**
     * Set the value of CreatedDate
     *
     * @param v new value
     */
    public void setCreatedDate(Date v) 
    {
    
                  if (!ObjectUtils.equals(this.createdDate, v))
              {
            this.createdDate = v;
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
  
      
        
                  
    
        private Issue aIssue;

    /**
     * Declares an association between this object and a Issue object
     *
     * @param v Issue
     * @throws TorqueException
     */
    public void setIssue(Issue v) throws TorqueException
    {
            if (v == null)
        {
                  setIssueId((Long) null);
              }
        else
        {
            setIssueId(v.getIssueId());
        }
            aIssue = v;
    }

                        
    /**
     * Returns the associated Issue object.
           * If it was not retrieved before, the object is retrieved from
     * the database
           *
     * @return the associated Issue object
           * @throws TorqueException
           */
    public Issue getIssue()
              throws TorqueException
          {
              if (aIssue == null && (!ObjectUtils.equals(this.issueId, null)))
        {
                    aIssue = IssueManager.getInstance(SimpleKey.keyFor(this.issueId));
                }
              return aIssue;
    }

    /**
     * Return the associated Issue object
     * If it was not retrieved before, the object is retrieved from
     * the database using the passed connection
     *
     * @param connection the connection used to retrieve the associated object
     *        from the database, if it was not retrieved before
     * @return the associated Issue object
     * @throws TorqueException
     */
    public Issue getIssue(Connection connection)
        throws TorqueException
    {
        if (aIssue == null && (!ObjectUtils.equals(this.issueId, null)))
        {
                    aIssue = IssueManager.getCachedInstance(SimpleKey.keyFor(this.issueId));
            if (aIssue == null)
            {
                          aIssue = IssuePeer.retrieveByPK(SimpleKey.keyFor(this.issueId), connection);
                          IssueManager.putInstance(aIssue);
            }
                }
        return aIssue;
    }
    
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setIssueKey(ObjectKey key) throws TorqueException
    {
    
                    setIssueId(new Long(((NumberKey) key).longValue()));
              }
  
        
                  
    
        private AttachmentType aAttachmentType;

    /**
     * Declares an association between this object and a AttachmentType object
     *
     * @param v AttachmentType
     * @throws TorqueException
     */
    public void setAttachmentType(AttachmentType v) throws TorqueException
    {
            if (v == null)
        {
                  setTypeId((Integer) null);
              }
        else
        {
            setTypeId(v.getAttachmentTypeId());
        }
            aAttachmentType = v;
    }

                        
    /**
     * Returns the associated AttachmentType object.
           * If it was not retrieved before, the object is retrieved from
     * the database
           *
     * @return the associated AttachmentType object
           * @throws TorqueException
           */
    public AttachmentType getAttachmentType()
              throws TorqueException
          {
              if (aAttachmentType == null && (!ObjectUtils.equals(this.typeId, null)))
        {
                    aAttachmentType = AttachmentTypeManager.getInstance(SimpleKey.keyFor(this.typeId));
                }
              return aAttachmentType;
    }

    /**
     * Return the associated AttachmentType object
     * If it was not retrieved before, the object is retrieved from
     * the database using the passed connection
     *
     * @param connection the connection used to retrieve the associated object
     *        from the database, if it was not retrieved before
     * @return the associated AttachmentType object
     * @throws TorqueException
     */
    public AttachmentType getAttachmentType(Connection connection)
        throws TorqueException
    {
        if (aAttachmentType == null && (!ObjectUtils.equals(this.typeId, null)))
        {
                    aAttachmentType = AttachmentTypeManager.getCachedInstance(SimpleKey.keyFor(this.typeId));
            if (aAttachmentType == null)
            {
                          aAttachmentType = AttachmentTypePeer.retrieveByPK(SimpleKey.keyFor(this.typeId), connection);
                          AttachmentTypeManager.putInstance(aAttachmentType);
            }
                }
        return aAttachmentType;
    }
    
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setAttachmentTypeKey(ObjectKey key) throws TorqueException
    {
    
                    setTypeId(new Integer(((NumberKey) key).intValue()));
              }
  
            
                        
        
        private ScarabUser aScarabUserRelatedByCreatedBy;

    /**
     * Declares an association between this object and a ScarabUser object
     *
     * @param v ScarabUser
     * @throws TorqueException
     */
    public void setScarabUserRelatedByCreatedBy(ScarabUser v) throws TorqueException
    {
            if (v == null)
        {
                  setCreatedBy((Integer) null);
              }
        else
        {
            setCreatedBy(v.getUserId());
        }
            aScarabUserRelatedByCreatedBy = v;
    }

                        
    /**
     * Returns the associated ScarabUser object.
           * If it was not retrieved before, the object is retrieved from
     * the database
           *
     * @return the associated ScarabUser object
           * @throws TorqueException
           */
    public ScarabUser getScarabUserRelatedByCreatedBy()
              throws TorqueException
          {
              if (aScarabUserRelatedByCreatedBy == null && (!ObjectUtils.equals(this.createdBy, null)))
        {
                    aScarabUserRelatedByCreatedBy = ScarabUserManager.getInstance(SimpleKey.keyFor(this.createdBy));
                }
              return aScarabUserRelatedByCreatedBy;
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
    public ScarabUser getScarabUserRelatedByCreatedBy(Connection connection)
        throws TorqueException
    {
        if (aScarabUserRelatedByCreatedBy == null && (!ObjectUtils.equals(this.createdBy, null)))
        {
                    aScarabUserRelatedByCreatedBy = ScarabUserManager.getCachedInstance(SimpleKey.keyFor(this.createdBy));
            if (aScarabUserRelatedByCreatedBy == null)
            {
                          aScarabUserRelatedByCreatedBy = ScarabUserImplPeer.retrieveScarabUserImplByPK(SimpleKey.keyFor(this.createdBy), connection);
                          ScarabUserManager.putInstance(aScarabUserRelatedByCreatedBy);
            }
                }
        return aScarabUserRelatedByCreatedBy;
    }
    
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setScarabUserRelatedByCreatedByKey(ObjectKey key) throws TorqueException
    {
    
                    setCreatedBy(new Integer(((NumberKey) key).intValue()));
              }
  
            
                        
        
        private ScarabUser aScarabUserRelatedByModifiedBy;

    /**
     * Declares an association between this object and a ScarabUser object
     *
     * @param v ScarabUser
     * @throws TorqueException
     */
    public void setScarabUserRelatedByModifiedBy(ScarabUser v) throws TorqueException
    {
            if (v == null)
        {
                  setModifiedBy((Integer) null);
              }
        else
        {
            setModifiedBy(v.getUserId());
        }
            aScarabUserRelatedByModifiedBy = v;
    }

                        
    /**
     * Returns the associated ScarabUser object.
           * If it was not retrieved before, the object is retrieved from
     * the database
           *
     * @return the associated ScarabUser object
           * @throws TorqueException
           */
    public ScarabUser getScarabUserRelatedByModifiedBy()
              throws TorqueException
          {
              if (aScarabUserRelatedByModifiedBy == null && (!ObjectUtils.equals(this.modifiedBy, null)))
        {
                    aScarabUserRelatedByModifiedBy = ScarabUserManager.getInstance(SimpleKey.keyFor(this.modifiedBy));
                }
              return aScarabUserRelatedByModifiedBy;
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
    public ScarabUser getScarabUserRelatedByModifiedBy(Connection connection)
        throws TorqueException
    {
        if (aScarabUserRelatedByModifiedBy == null && (!ObjectUtils.equals(this.modifiedBy, null)))
        {
                    aScarabUserRelatedByModifiedBy = ScarabUserManager.getCachedInstance(SimpleKey.keyFor(this.modifiedBy));
            if (aScarabUserRelatedByModifiedBy == null)
            {
                          aScarabUserRelatedByModifiedBy = ScarabUserImplPeer.retrieveScarabUserImplByPK(SimpleKey.keyFor(this.modifiedBy), connection);
                          ScarabUserManager.putInstance(aScarabUserRelatedByModifiedBy);
            }
                }
        return aScarabUserRelatedByModifiedBy;
    }
    
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setScarabUserRelatedByModifiedByKey(ObjectKey key) throws TorqueException
    {
    
                    setModifiedBy(new Integer(((NumberKey) key).intValue()));
              }
     
                                
            
          /**
     * Collection to store aggregation of collActivitys
     */
    protected List collActivitys;

    /**
     * Temporary storage of collActivitys to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initActivitys()
    {
        if (collActivitys == null)
        {
            collActivitys = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a Activity object to this object
     * through the Activity foreign key attribute
     *
     * @param l Activity
     * @throws TorqueException
     */
    public void addActivity(Activity l) throws TorqueException
    {
        getActivitys().add(l);
        l.setAttachment((Attachment) this);
    }

    /**
     * The criteria used to select the current contents of collActivitys
     */
    private Criteria lastActivitysCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getActivitys(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getActivitys()
              throws TorqueException
          {
                      if (collActivitys == null)
        {
            collActivitys = getActivitys(new Criteria(10));
        }
                return collActivitys;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Attachment has previously
           * been saved, it will retrieve related Activitys from storage.
     * If this Attachment is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getActivitys(Criteria criteria) throws TorqueException
    {
              if (collActivitys == null)
        {
            if (isNew())
            {
               collActivitys = new ArrayList();
            }
            else
            {
                        criteria.add(ActivityPeer.ATTACHMENT_ID, getAttachmentId() );
                        collActivitys = ActivityPeer.doSelect(criteria);
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
                            criteria.add(ActivityPeer.ATTACHMENT_ID, getAttachmentId());
                            if (!lastActivitysCriteria.equals(criteria))
                {
                    collActivitys = ActivityPeer.doSelect(criteria);
                }
            }
        }
        lastActivitysCriteria = criteria;

        return collActivitys;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getActivitys(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getActivitys(Connection con) throws TorqueException
    {
              if (collActivitys == null)
        {
            collActivitys = getActivitys(new Criteria(10), con);
        }
        return collActivitys;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Attachment has previously
           * been saved, it will retrieve related Activitys from storage.
     * If this Attachment is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getActivitys(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collActivitys == null)
        {
            if (isNew())
            {
               collActivitys = new ArrayList();
            }
            else
            {
                         criteria.add(ActivityPeer.ATTACHMENT_ID, getAttachmentId());
                         collActivitys = ActivityPeer.doSelect(criteria, con);
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
                             criteria.add(ActivityPeer.ATTACHMENT_ID, getAttachmentId());
                             if (!lastActivitysCriteria.equals(criteria))
                 {
                     collActivitys = ActivityPeer.doSelect(criteria, con);
                 }
             }
         }
         lastActivitysCriteria = criteria;

         return collActivitys;
           }

                                                                  
              
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Attachment is new, it will return
                 * an empty collection; or if this Attachment has previously
     * been saved, it will retrieve related Activitys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attachment.
     */
    protected List getActivitysJoinIssue(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitys == null)
        {
            if (isNew())
            {
               collActivitys = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.ATTACHMENT_ID, getAttachmentId());
                              collActivitys = ActivityPeer.doSelectJoinIssue(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.ATTACHMENT_ID, getAttachmentId());
                                    if (!lastActivitysCriteria.equals(criteria))
            {
                collActivitys = ActivityPeer.doSelectJoinIssue(criteria);
            }
        }
        lastActivitysCriteria = criteria;

        return collActivitys;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Attachment is new, it will return
                 * an empty collection; or if this Attachment has previously
     * been saved, it will retrieve related Activitys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attachment.
     */
    protected List getActivitysJoinAttribute(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitys == null)
        {
            if (isNew())
            {
               collActivitys = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.ATTACHMENT_ID, getAttachmentId());
                              collActivitys = ActivityPeer.doSelectJoinAttribute(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.ATTACHMENT_ID, getAttachmentId());
                                    if (!lastActivitysCriteria.equals(criteria))
            {
                collActivitys = ActivityPeer.doSelectJoinAttribute(criteria);
            }
        }
        lastActivitysCriteria = criteria;

        return collActivitys;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Attachment is new, it will return
                 * an empty collection; or if this Attachment has previously
     * been saved, it will retrieve related Activitys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attachment.
     */
    protected List getActivitysJoinActivitySet(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitys == null)
        {
            if (isNew())
            {
               collActivitys = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.ATTACHMENT_ID, getAttachmentId());
                              collActivitys = ActivityPeer.doSelectJoinActivitySet(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.ATTACHMENT_ID, getAttachmentId());
                                    if (!lastActivitysCriteria.equals(criteria))
            {
                collActivitys = ActivityPeer.doSelectJoinActivitySet(criteria);
            }
        }
        lastActivitysCriteria = criteria;

        return collActivitys;
                }
                  
                    
                    
                                            
                                                                          
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Attachment is new, it will return
                 * an empty collection; or if this Attachment has previously
     * been saved, it will retrieve related Activitys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attachment.
     */
    protected List getActivitysJoinScarabUserImplRelatedByOldUserId(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitys == null)
        {
            if (isNew())
            {
               collActivitys = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.ATTACHMENT_ID, getAttachmentId());
                              collActivitys = ActivityPeer.doSelectJoinScarabUserImplRelatedByOldUserId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.ATTACHMENT_ID, getAttachmentId());
                                    if (!lastActivitysCriteria.equals(criteria))
            {
                collActivitys = ActivityPeer.doSelectJoinScarabUserImplRelatedByOldUserId(criteria);
            }
        }
        lastActivitysCriteria = criteria;

        return collActivitys;
                }
                  
                    
                    
                                            
                                                                          
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Attachment is new, it will return
                 * an empty collection; or if this Attachment has previously
     * been saved, it will retrieve related Activitys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attachment.
     */
    protected List getActivitysJoinScarabUserImplRelatedByNewUserId(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitys == null)
        {
            if (isNew())
            {
               collActivitys = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.ATTACHMENT_ID, getAttachmentId());
                              collActivitys = ActivityPeer.doSelectJoinScarabUserImplRelatedByNewUserId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.ATTACHMENT_ID, getAttachmentId());
                                    if (!lastActivitysCriteria.equals(criteria))
            {
                collActivitys = ActivityPeer.doSelectJoinScarabUserImplRelatedByNewUserId(criteria);
            }
        }
        lastActivitysCriteria = criteria;

        return collActivitys;
                }
                  
                    
                    
                                            
                                                                          
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Attachment is new, it will return
                 * an empty collection; or if this Attachment has previously
     * been saved, it will retrieve related Activitys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attachment.
     */
    protected List getActivitysJoinAttributeOptionRelatedByOldOptionId(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitys == null)
        {
            if (isNew())
            {
               collActivitys = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.ATTACHMENT_ID, getAttachmentId());
                              collActivitys = ActivityPeer.doSelectJoinAttributeOptionRelatedByOldOptionId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.ATTACHMENT_ID, getAttachmentId());
                                    if (!lastActivitysCriteria.equals(criteria))
            {
                collActivitys = ActivityPeer.doSelectJoinAttributeOptionRelatedByOldOptionId(criteria);
            }
        }
        lastActivitysCriteria = criteria;

        return collActivitys;
                }
                  
                    
                    
                                            
                                                                          
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Attachment is new, it will return
                 * an empty collection; or if this Attachment has previously
     * been saved, it will retrieve related Activitys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attachment.
     */
    protected List getActivitysJoinAttributeOptionRelatedByNewOptionId(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitys == null)
        {
            if (isNew())
            {
               collActivitys = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.ATTACHMENT_ID, getAttachmentId());
                              collActivitys = ActivityPeer.doSelectJoinAttributeOptionRelatedByNewOptionId(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.ATTACHMENT_ID, getAttachmentId());
                                    if (!lastActivitysCriteria.equals(criteria))
            {
                collActivitys = ActivityPeer.doSelectJoinAttributeOptionRelatedByNewOptionId(criteria);
            }
        }
        lastActivitysCriteria = criteria;

        return collActivitys;
                }
                  
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Attachment is new, it will return
                 * an empty collection; or if this Attachment has previously
     * been saved, it will retrieve related Activitys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attachment.
     */
    protected List getActivitysJoinAttachment(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitys == null)
        {
            if (isNew())
            {
               collActivitys = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.ATTACHMENT_ID, getAttachmentId());
                              collActivitys = ActivityPeer.doSelectJoinAttachment(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.ATTACHMENT_ID, getAttachmentId());
                                    if (!lastActivitysCriteria.equals(criteria))
            {
                collActivitys = ActivityPeer.doSelectJoinAttachment(criteria);
            }
        }
        lastActivitysCriteria = criteria;

        return collActivitys;
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Attachment is new, it will return
                 * an empty collection; or if this Attachment has previously
     * been saved, it will retrieve related Activitys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attachment.
     */
    protected List getActivitysJoinDepend(Criteria criteria)
        throws TorqueException
    {
                    if (collActivitys == null)
        {
            if (isNew())
            {
               collActivitys = new ArrayList();
            }
            else
            {
                              criteria.add(ActivityPeer.ATTACHMENT_ID, getAttachmentId());
                              collActivitys = ActivityPeer.doSelectJoinDepend(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivityPeer.ATTACHMENT_ID, getAttachmentId());
                                    if (!lastActivitysCriteria.equals(criteria))
            {
                collActivitys = ActivityPeer.doSelectJoinDepend(criteria);
            }
        }
        lastActivitysCriteria = criteria;

        return collActivitys;
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
        l.setAttachment((Attachment) this);
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
     * Otherwise if this Attachment has previously
           * been saved, it will retrieve related ActivitySets from storage.
     * If this Attachment is new, it will return
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
                        criteria.add(ActivitySetPeer.ATTACHMENT_ID, getAttachmentId() );
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
                            criteria.add(ActivitySetPeer.ATTACHMENT_ID, getAttachmentId());
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
     * Otherwise if this Attachment has previously
           * been saved, it will retrieve related ActivitySets from storage.
     * If this Attachment is new, it will return
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
                         criteria.add(ActivitySetPeer.ATTACHMENT_ID, getAttachmentId());
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
                             criteria.add(ActivitySetPeer.ATTACHMENT_ID, getAttachmentId());
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
     * Otherwise if this Attachment is new, it will return
                 * an empty collection; or if this Attachment has previously
     * been saved, it will retrieve related ActivitySets from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attachment.
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
                              criteria.add(ActivitySetPeer.ATTACHMENT_ID, getAttachmentId());
                              collActivitySets = ActivitySetPeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivitySetPeer.ATTACHMENT_ID, getAttachmentId());
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
     * Otherwise if this Attachment is new, it will return
                 * an empty collection; or if this Attachment has previously
     * been saved, it will retrieve related ActivitySets from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attachment.
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
                              criteria.add(ActivitySetPeer.ATTACHMENT_ID, getAttachmentId());
                              collActivitySets = ActivitySetPeer.doSelectJoinActivitySetType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivitySetPeer.ATTACHMENT_ID, getAttachmentId());
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
     * Otherwise if this Attachment is new, it will return
                 * an empty collection; or if this Attachment has previously
     * been saved, it will retrieve related ActivitySets from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Attachment.
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
                              criteria.add(ActivitySetPeer.ATTACHMENT_ID, getAttachmentId());
                              collActivitySets = ActivitySetPeer.doSelectJoinAttachment(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ActivitySetPeer.ATTACHMENT_ID, getAttachmentId());
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
              fieldNames.add("AttachmentId");
              fieldNames.add("IssueId");
              fieldNames.add("TypeId");
              fieldNames.add("Name");
              fieldNames.add("Data");
              fieldNames.add("FileName");
              fieldNames.add("MimeType");
              fieldNames.add("ModifiedBy");
              fieldNames.add("CreatedBy");
              fieldNames.add("ModifiedDate");
              fieldNames.add("CreatedDate");
              fieldNames.add("Deleted");
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
          if (name.equals("AttachmentId"))
        {
                return getAttachmentId();
            }
          if (name.equals("IssueId"))
        {
                return getIssueId();
            }
          if (name.equals("TypeId"))
        {
                return getTypeId();
            }
          if (name.equals("Name"))
        {
                return getName();
            }
          if (name.equals("Data"))
        {
                return getData();
            }
          if (name.equals("FileName"))
        {
                return getFileName();
            }
          if (name.equals("MimeType"))
        {
                return getMimeType();
            }
          if (name.equals("ModifiedBy"))
        {
                return getModifiedBy();
            }
          if (name.equals("CreatedBy"))
        {
                return getCreatedBy();
            }
          if (name.equals("ModifiedDate"))
        {
                return getModifiedDate();
            }
          if (name.equals("CreatedDate"))
        {
                return getCreatedDate();
            }
          if (name.equals("Deleted"))
        {
                return Boolean.valueOf(getDeleted());
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
          if (name.equals(AttachmentPeer.ATTACHMENT_ID))
        {
                return getAttachmentId();
            }
          if (name.equals(AttachmentPeer.ISSUE_ID))
        {
                return getIssueId();
            }
          if (name.equals(AttachmentPeer.ATTACHMENT_TYPE_ID))
        {
                return getTypeId();
            }
          if (name.equals(AttachmentPeer.ATTACHMENT_NAME))
        {
                return getName();
            }
          if (name.equals(AttachmentPeer.ATTACHMENT_DATA))
        {
                return getData();
            }
          if (name.equals(AttachmentPeer.ATTACHMENT_FILE_PATH))
        {
                return getFileName();
            }
          if (name.equals(AttachmentPeer.ATTACHMENT_MIME_TYPE))
        {
                return getMimeType();
            }
          if (name.equals(AttachmentPeer.MODIFIED_BY))
        {
                return getModifiedBy();
            }
          if (name.equals(AttachmentPeer.CREATED_BY))
        {
                return getCreatedBy();
            }
          if (name.equals(AttachmentPeer.MODIFIED_DATE))
        {
                return getModifiedDate();
            }
          if (name.equals(AttachmentPeer.CREATED_DATE))
        {
                return getCreatedDate();
            }
          if (name.equals(AttachmentPeer.DELETED))
        {
                return Boolean.valueOf(getDeleted());
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
                return getAttachmentId();
            }
              if (pos == 1)
        {
                return getIssueId();
            }
              if (pos == 2)
        {
                return getTypeId();
            }
              if (pos == 3)
        {
                return getName();
            }
              if (pos == 4)
        {
                return getData();
            }
              if (pos == 5)
        {
                return getFileName();
            }
              if (pos == 6)
        {
                return getMimeType();
            }
              if (pos == 7)
        {
                return getModifiedBy();
            }
              if (pos == 8)
        {
                return getCreatedBy();
            }
              if (pos == 9)
        {
                return getModifiedDate();
            }
              if (pos == 10)
        {
                return getCreatedDate();
            }
              if (pos == 11)
        {
                return Boolean.valueOf(getDeleted());
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
          save(AttachmentPeer.getMapBuilder()
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
                    AttachmentPeer.doInsert((Attachment) this, con);
                    setNew(false);
                }
                else
                {
                    AttachmentPeer.doUpdate((Attachment) this, con);
                }

    
                      if (isCacheOnSave())
                {
                    AttachmentManager.putInstance(this);
                }
              }

                                      
                                    if (collActivitys != null)
            {
                for (int i = 0; i < collActivitys.size(); i++)
                {
                    ((Activity) collActivitys.get(i)).save(con);
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
     * @param key attachmentId ObjectKey
     */
    public void setPrimaryKey(ObjectKey key)
        throws TorqueException
    {
            setAttachmentId(new Long(((NumberKey) key).longValue()));
        }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) throws TorqueException
    {
            setAttachmentId(new Long(key));
        }

  
    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
          return SimpleKey.keyFor(getAttachmentId());
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
      public Attachment copy() throws TorqueException
    {
        return copyInto(new Attachment());
    }
  
    protected Attachment copyInto(Attachment copyObj) throws TorqueException
    {
          copyObj.setAttachmentId(attachmentId);
          copyObj.setIssueId(issueId);
          copyObj.setTypeId(typeId);
          copyObj.setName(name);
          copyObj.setData(data);
          copyObj.setFileName(fileName);
          copyObj.setMimeType(mimeType);
          copyObj.setModifiedBy(modifiedBy);
          copyObj.setCreatedBy(createdBy);
          copyObj.setModifiedDate(modifiedDate);
          copyObj.setCreatedDate(createdDate);
          copyObj.setDeleted(deleted);
  
                    copyObj.setAttachmentId((Long)null);
                                                                              
                                      
                            
        List v = getActivitys();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                Activity obj = (Activity) v.get(i);
                copyObj.addActivity(obj.copy());
            }
        }
        else
        {
            copyObj.collActivitys = null;
        }
                                                  
                            
        v = getActivitySets();
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
    public AttachmentPeer getPeer()
    {
        return peer;
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("Attachment:\n");
        str.append("AttachmentId = ")
               .append(getAttachmentId())
             .append("\n");
        str.append("IssueId = ")
               .append(getIssueId())
             .append("\n");
        str.append("TypeId = ")
               .append(getTypeId())
             .append("\n");
        str.append("Name = ")
               .append(getName())
             .append("\n");
        str.append("Data = ")
               .append(getData())
             .append("\n");
        str.append("FileName = ")
               .append(getFileName())
             .append("\n");
        str.append("MimeType = ")
               .append(getMimeType())
             .append("\n");
        str.append("ModifiedBy = ")
               .append(getModifiedBy())
             .append("\n");
        str.append("CreatedBy = ")
               .append(getCreatedBy())
             .append("\n");
        str.append("ModifiedDate = ")
               .append(getModifiedDate())
             .append("\n");
        str.append("CreatedDate = ")
               .append(getCreatedDate())
             .append("\n");
        str.append("Deleted = ")
               .append(getDeleted())
             .append("\n");
        return(str.toString());
    }
}
