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
 * extended all references should be to Scope
 */
public abstract class BaseScope extends BaseObject
    implements org.apache.fulcrum.intake.Retrievable
{
    /** The Peer class */
    private static final ScopePeer peer =
        new ScopePeer();

        
    /** The value for the scopeId field */
    private Integer scopeId;
      
    /** The value for the name field */
    private String name;
  
            
    /**
     * Get the ScopeId
     *
     * @return Integer
     */
    public Integer getScopeId()
    {
        return scopeId;
    }

                                              
    /**
     * Set the value of ScopeId
     *
     * @param v new value
     */
    public void setScopeId(Integer v) throws TorqueException
    {
    
                  if (!ObjectUtils.equals(this.scopeId, v))
              {
            this.scopeId = v;
            setModified(true);
        }
    
          
                                  
                  // update associated Query
        if (collQuerys != null)
        {
            for (int i = 0; i < collQuerys.size(); i++)
            {
                ((Query) collQuerys.get(i))
                        .setScopeId(v);
            }
        }
                                                    
                  // update associated IssueTemplateInfo
        if (collIssueTemplateInfos != null)
        {
            for (int i = 0; i < collIssueTemplateInfos.size(); i++)
            {
                ((IssueTemplateInfo) collIssueTemplateInfos.get(i))
                        .setScopeId(v);
            }
        }
                                                    
                  // update associated Report
        if (collReports != null)
        {
            for (int i = 0; i < collReports.size(); i++)
            {
                ((Report) collReports.get(i))
                        .setScopeId(v);
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
        l.setScope((Scope) this);
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
     * Otherwise if this Scope has previously
           * been saved, it will retrieve related Querys from storage.
     * If this Scope is new, it will return
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
                        criteria.add(QueryPeer.SCOPE_ID, getScopeId() );
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
                            criteria.add(QueryPeer.SCOPE_ID, getScopeId());
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
     * Otherwise if this Scope has previously
           * been saved, it will retrieve related Querys from storage.
     * If this Scope is new, it will return
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
                         criteria.add(QueryPeer.SCOPE_ID, getScopeId());
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
                             criteria.add(QueryPeer.SCOPE_ID, getScopeId());
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
     * Otherwise if this Scope is new, it will return
                 * an empty collection; or if this Scope has previously
     * been saved, it will retrieve related Querys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Scope.
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
                              criteria.add(QueryPeer.SCOPE_ID, getScopeId());
                              collQuerys = QueryPeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(QueryPeer.SCOPE_ID, getScopeId());
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
     * Otherwise if this Scope is new, it will return
                 * an empty collection; or if this Scope has previously
     * been saved, it will retrieve related Querys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Scope.
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
                              criteria.add(QueryPeer.SCOPE_ID, getScopeId());
                              collQuerys = QueryPeer.doSelectJoinScope(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(QueryPeer.SCOPE_ID, getScopeId());
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
     * Otherwise if this Scope is new, it will return
                 * an empty collection; or if this Scope has previously
     * been saved, it will retrieve related Querys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Scope.
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
                              criteria.add(QueryPeer.SCOPE_ID, getScopeId());
                              collQuerys = QueryPeer.doSelectJoinScarabModule(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(QueryPeer.SCOPE_ID, getScopeId());
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
     * Otherwise if this Scope is new, it will return
                 * an empty collection; or if this Scope has previously
     * been saved, it will retrieve related Querys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Scope.
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
                              criteria.add(QueryPeer.SCOPE_ID, getScopeId());
                              collQuerys = QueryPeer.doSelectJoinIssueType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(QueryPeer.SCOPE_ID, getScopeId());
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
     * Otherwise if this Scope is new, it will return
                 * an empty collection; or if this Scope has previously
     * been saved, it will retrieve related Querys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Scope.
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
                              criteria.add(QueryPeer.SCOPE_ID, getScopeId());
                              collQuerys = QueryPeer.doSelectJoinMITList(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(QueryPeer.SCOPE_ID, getScopeId());
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
     * Otherwise if this Scope is new, it will return
                 * an empty collection; or if this Scope has previously
     * been saved, it will retrieve related Querys from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Scope.
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
                              criteria.add(QueryPeer.SCOPE_ID, getScopeId());
                              collQuerys = QueryPeer.doSelectJoinFrequency(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(QueryPeer.SCOPE_ID, getScopeId());
                                    if (!lastQuerysCriteria.equals(criteria))
            {
                collQuerys = QueryPeer.doSelectJoinFrequency(criteria);
            }
        }
        lastQuerysCriteria = criteria;

        return collQuerys;
                }
                            


                          
            
          /**
     * Collection to store aggregation of collIssueTemplateInfos
     */
    protected List collIssueTemplateInfos;

    /**
     * Temporary storage of collIssueTemplateInfos to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initIssueTemplateInfos()
    {
        if (collIssueTemplateInfos == null)
        {
            collIssueTemplateInfos = new ArrayList();
        }
    }

                
    /**
     * Method called to associate a IssueTemplateInfo object to this object
     * through the IssueTemplateInfo foreign key attribute
     *
     * @param l IssueTemplateInfo
     * @throws TorqueException
     */
    public void addIssueTemplateInfo(IssueTemplateInfo l) throws TorqueException
    {
        getIssueTemplateInfos().add(l);
        l.setScope((Scope) this);
    }

    /**
     * The criteria used to select the current contents of collIssueTemplateInfos
     */
    private Criteria lastIssueTemplateInfosCriteria = null;
      
    /**
                   * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getIssueTemplateInfos(new Criteria())
                   *
     * @return the collection of associated objects
           * @throws TorqueException
           */
    public List getIssueTemplateInfos()
              throws TorqueException
          {
                      if (collIssueTemplateInfos == null)
        {
            collIssueTemplateInfos = getIssueTemplateInfos(new Criteria(10));
        }
                return collIssueTemplateInfos;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Scope has previously
           * been saved, it will retrieve related IssueTemplateInfos from storage.
     * If this Scope is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getIssueTemplateInfos(Criteria criteria) throws TorqueException
    {
              if (collIssueTemplateInfos == null)
        {
            if (isNew())
            {
               collIssueTemplateInfos = new ArrayList();
            }
            else
            {
                        criteria.add(IssueTemplateInfoPeer.SCOPE_ID, getScopeId() );
                        collIssueTemplateInfos = IssueTemplateInfoPeer.doSelect(criteria);
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
                            criteria.add(IssueTemplateInfoPeer.SCOPE_ID, getScopeId());
                            if (!lastIssueTemplateInfosCriteria.equals(criteria))
                {
                    collIssueTemplateInfos = IssueTemplateInfoPeer.doSelect(criteria);
                }
            }
        }
        lastIssueTemplateInfosCriteria = criteria;

        return collIssueTemplateInfos;
          }

    /**
           * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getIssueTemplateInfos(new Criteria(),Connection)
           * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getIssueTemplateInfos(Connection con) throws TorqueException
    {
              if (collIssueTemplateInfos == null)
        {
            collIssueTemplateInfos = getIssueTemplateInfos(new Criteria(10), con);
        }
        return collIssueTemplateInfos;
          }

    /**
           * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Scope has previously
           * been saved, it will retrieve related IssueTemplateInfos from storage.
     * If this Scope is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getIssueTemplateInfos(Criteria criteria, Connection con)
            throws TorqueException
    {
              if (collIssueTemplateInfos == null)
        {
            if (isNew())
            {
               collIssueTemplateInfos = new ArrayList();
            }
            else
            {
                         criteria.add(IssueTemplateInfoPeer.SCOPE_ID, getScopeId());
                         collIssueTemplateInfos = IssueTemplateInfoPeer.doSelect(criteria, con);
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
                             criteria.add(IssueTemplateInfoPeer.SCOPE_ID, getScopeId());
                             if (!lastIssueTemplateInfosCriteria.equals(criteria))
                 {
                     collIssueTemplateInfos = IssueTemplateInfoPeer.doSelect(criteria, con);
                 }
             }
         }
         lastIssueTemplateInfosCriteria = criteria;

         return collIssueTemplateInfos;
           }

                        
              
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Scope is new, it will return
                 * an empty collection; or if this Scope has previously
     * been saved, it will retrieve related IssueTemplateInfos from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Scope.
     */
    protected List getIssueTemplateInfosJoinIssue(Criteria criteria)
        throws TorqueException
    {
                    if (collIssueTemplateInfos == null)
        {
            if (isNew())
            {
               collIssueTemplateInfos = new ArrayList();
            }
            else
            {
                              criteria.add(IssueTemplateInfoPeer.SCOPE_ID, getScopeId());
                              collIssueTemplateInfos = IssueTemplateInfoPeer.doSelectJoinIssue(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(IssueTemplateInfoPeer.SCOPE_ID, getScopeId());
                                    if (!lastIssueTemplateInfosCriteria.equals(criteria))
            {
                collIssueTemplateInfos = IssueTemplateInfoPeer.doSelectJoinIssue(criteria);
            }
        }
        lastIssueTemplateInfosCriteria = criteria;

        return collIssueTemplateInfos;
                }
                  
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
                 * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Scope is new, it will return
                 * an empty collection; or if this Scope has previously
     * been saved, it will retrieve related IssueTemplateInfos from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Scope.
     */
    protected List getIssueTemplateInfosJoinScope(Criteria criteria)
        throws TorqueException
    {
                    if (collIssueTemplateInfos == null)
        {
            if (isNew())
            {
               collIssueTemplateInfos = new ArrayList();
            }
            else
            {
                              criteria.add(IssueTemplateInfoPeer.SCOPE_ID, getScopeId());
                              collIssueTemplateInfos = IssueTemplateInfoPeer.doSelectJoinScope(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(IssueTemplateInfoPeer.SCOPE_ID, getScopeId());
                                    if (!lastIssueTemplateInfosCriteria.equals(criteria))
            {
                collIssueTemplateInfos = IssueTemplateInfoPeer.doSelectJoinScope(criteria);
            }
        }
        lastIssueTemplateInfosCriteria = criteria;

        return collIssueTemplateInfos;
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
        l.setScope((Scope) this);
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
     * Otherwise if this Scope has previously
           * been saved, it will retrieve related Reports from storage.
     * If this Scope is new, it will return
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
                        criteria.add(ReportPeer.SCOPE_ID, getScopeId() );
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
                            criteria.add(ReportPeer.SCOPE_ID, getScopeId());
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
     * Otherwise if this Scope has previously
           * been saved, it will retrieve related Reports from storage.
     * If this Scope is new, it will return
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
                         criteria.add(ReportPeer.SCOPE_ID, getScopeId());
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
                             criteria.add(ReportPeer.SCOPE_ID, getScopeId());
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
     * Otherwise if this Scope is new, it will return
                 * an empty collection; or if this Scope has previously
     * been saved, it will retrieve related Reports from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Scope.
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
                              criteria.add(ReportPeer.SCOPE_ID, getScopeId());
                              collReports = ReportPeer.doSelectJoinIssueType(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ReportPeer.SCOPE_ID, getScopeId());
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
     * Otherwise if this Scope is new, it will return
                 * an empty collection; or if this Scope has previously
     * been saved, it will retrieve related Reports from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Scope.
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
                              criteria.add(ReportPeer.SCOPE_ID, getScopeId());
                              collReports = ReportPeer.doSelectJoinScarabUserImpl(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ReportPeer.SCOPE_ID, getScopeId());
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
     * Otherwise if this Scope is new, it will return
                 * an empty collection; or if this Scope has previously
     * been saved, it will retrieve related Reports from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Scope.
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
                              criteria.add(ReportPeer.SCOPE_ID, getScopeId());
                              collReports = ReportPeer.doSelectJoinScarabModule(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ReportPeer.SCOPE_ID, getScopeId());
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
     * Otherwise if this Scope is new, it will return
                 * an empty collection; or if this Scope has previously
     * been saved, it will retrieve related Reports from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Scope.
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
                              criteria.add(ReportPeer.SCOPE_ID, getScopeId());
                              collReports = ReportPeer.doSelectJoinScope(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
                                    criteria.add(ReportPeer.SCOPE_ID, getScopeId());
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
              fieldNames.add("ScopeId");
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
          if (name.equals("ScopeId"))
        {
                return getScopeId();
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
          if (name.equals(ScopePeer.SCOPE_ID))
        {
                return getScopeId();
            }
          if (name.equals(ScopePeer.SCOPE_NAME))
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
                return getScopeId();
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
          save(ScopePeer.getMapBuilder()
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
                    ScopePeer.doInsert((Scope) this, con);
                    setNew(false);
                }
                else
                {
                    ScopePeer.doUpdate((Scope) this, con);
                }

    
                      if (isCacheOnSave())
                {
                    ScopeManager.putInstance(this);
                }
              }

                                      
                                    if (collQuerys != null)
            {
                for (int i = 0; i < collQuerys.size(); i++)
                {
                    ((Query) collQuerys.get(i)).save(con);
                }
            }
                                                  
                                    if (collIssueTemplateInfos != null)
            {
                for (int i = 0; i < collIssueTemplateInfos.size(); i++)
                {
                    ((IssueTemplateInfo) collIssueTemplateInfos.get(i)).save(con);
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
     * @param key scopeId ObjectKey
     */
    public void setPrimaryKey(ObjectKey key)
        throws TorqueException
    {
            setScopeId(new Integer(((NumberKey) key).intValue()));
        }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) throws TorqueException
    {
            setScopeId(new Integer(key));
        }

  
    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
          return SimpleKey.keyFor(getScopeId());
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
      public Scope copy() throws TorqueException
    {
        return copyInto(new Scope());
    }
  
    protected Scope copyInto(Scope copyObj) throws TorqueException
    {
          copyObj.setScopeId(scopeId);
          copyObj.setName(name);
  
                    copyObj.setScopeId((Integer)null);
                  
                                      
                            
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
                                                  
                            
        v = getIssueTemplateInfos();
                            if (v != null)
        {
            for (int i = 0; i < v.size(); i++)
            {
                IssueTemplateInfo obj = (IssueTemplateInfo) v.get(i);
                copyObj.addIssueTemplateInfo(obj.copy());
            }
        }
        else
        {
            copyObj.collIssueTemplateInfos = null;
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
    public ScopePeer getPeer()
    {
        return peer;
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("Scope:\n");
        str.append("ScopeId = ")
               .append(getScopeId())
             .append("\n");
        str.append("Name = ")
               .append(getName())
             .append("\n");
        return(str.toString());
    }
}
