

package org.tigris.scarab.om;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.torque.Torque;
import org.apache.torque.TorqueException;
import org.apache.torque.manager.AbstractBaseManager;
import org.apache.torque.manager.CacheListener;
import org.apache.torque.manager.MethodResultCache;
import org.apache.torque.om.ObjectKey;
import org.apache.torque.om.SimpleKey;
import org.apache.torque.om.Persistent;
import org.apache.torque.util.Criteria;




/**
 * This class manages PendingGroupUserRole objects.
 * This class was autogenerated by Torque  *
 * You should not use this class directly.  It should not even be
 * extended all references should be to PendingGroupUserRoleManager
 */
public abstract class BasePendingGroupUserRoleManager
    extends AbstractBaseManager
{
    /** The name of the manager */
    protected static final String MANAGED_CLASS = "org.tigris.scarab.om.PendingGroupUserRole";

    /** The name of our class to pass to Torque as the default manager. */
    protected static final String DEFAULT_MANAGER_CLASS
        = "org.tigris.scarab.om.PendingGroupUserRoleManager";

    /**
     * Retrieves an implementation of the manager, based on the settings in
     * the configuration.
     *
     * @return an implementation of PendingGroupUserRoleManager.
     */
    public static PendingGroupUserRoleManager getManager()
    {
        return (PendingGroupUserRoleManager)
            Torque.getManager(PendingGroupUserRoleManager.MANAGED_CLASS,
                PendingGroupUserRoleManager.DEFAULT_MANAGER_CLASS);
    }

    /**
     * Static accessor for the @see #getInstanceImpl().
     *
     * @return a <code>PendingGroupUserRole</code> value
     * @exception TorqueException if an error occurs
     */
    public static PendingGroupUserRole getInstance()
        throws TorqueException
    {
        return getManager().getInstanceImpl();
    }

    /**
     * Static accessor for the @see #getInstanceImpl(ObjectKey).
     *
     * @param id an <code>ObjectKey</code> value
     * @return a <code>PendingGroupUserRole</code> value
     * @exception TorqueException if an error occurs
     */
    public static PendingGroupUserRole getInstance(ObjectKey id)
        throws TorqueException
    {
        return getManager().getInstanceImpl(id);
    }

    /**
     * Static accessor for the @see #getCachedInstanceImpl(ObjectKey).
     * Loads <code>PendingGroupUserRole</code> from cache, returns 
     * <code>null</code>, if instance is not in cache
     *
     * @param id an <code>ObjectKey</code> value
     * @return a <code>PendingGroupUserRole</code> value
     * @exception TorqueException if an error occurs
     */
    public static PendingGroupUserRole getCachedInstance(ObjectKey id)
        throws TorqueException
    {
        return getManager().getCachedInstanceImpl(id);
    }

    /**
     * Static accessor for the @see #getInstanceImpl(ObjectKey, boolean).
     *
     * @param id an <code>ObjectKey</code> value
     * @param fromCache if true, look for cached PendingGroupUserRoles before loading
     * from storage.
     * @return a <code>PendingGroupUserRole</code> value
     * @exception TorqueException if an error occurs
     */
    public static PendingGroupUserRole getInstance(ObjectKey id, boolean fromCache)
        throws TorqueException
    {
        return getManager().getInstanceImpl(id, fromCache);
    }


    /**
     * Static accessor for the @see #getInstancesImpl(List).
     *
     * @param ids a <code>List</code> value
     * @return a <code>List</code> value
     * @exception TorqueException if an error occurs
     */
    public static List getInstances(List ids)
        throws TorqueException
    {
        return getManager().getInstancesImpl(ids);
    }

    /**
     * Static accessor for the @see #getInstancesImpl(List, boolean).
     *
     * @param ids a <code>List</code> value
     * @param fromCache if true, look for cached PendingGroupUserRoles before loading
     * from storage.
     * @return a <code>List</code> value
     * @exception TorqueException if an error occurs
     */
    public static List getInstances(List ids, boolean fromCache)
        throws TorqueException
    {
        return getManager().getInstancesImpl(ids, fromCache);
    }

    public static void putInstance(Persistent om)
        throws TorqueException
    {
        getManager().putInstanceImpl(om);
    }

    public static void clear()
        throws TorqueException
    {
        getManager().clearImpl();
    }

    public static boolean exists(PendingGroupUserRole obj)
        throws TorqueException
    {
        return getManager().existsImpl(obj);
    }

    public static MethodResultCache getMethodResult()
    {
        return getManager().getMethodResultCache();
    }

    public static void addCacheListener(CacheListener listener)
    {
        getManager().addCacheListenerImpl(listener);
    }

    /**
     * Creates a new <code>BasePendingGroupUserRoleManager</code> instance.
     *
     * @exception TorqueException if an error occurs
     */
    public BasePendingGroupUserRoleManager()
        throws TorqueException
    {
        setClassName("org.tigris.scarab.om.PendingGroupUserRole");
    }

    /**
     * Get a fresh instance of a PendingGroupUserRoleManager
     */
    protected PendingGroupUserRole getInstanceImpl()
        throws TorqueException
    {
        PendingGroupUserRole obj = null;
        try
        {
            obj = (PendingGroupUserRole) getOMInstance();
        }
        catch (Exception e)
        {
            throw new TorqueException(e);
        }
        return obj;
    }

    /**
     * Get a PendingGroupUserRole with the given id.
     *
     * @param id <code>ObjectKey</code> value
     */
    protected PendingGroupUserRole getInstanceImpl(ObjectKey id)
        throws TorqueException
    {
        return (PendingGroupUserRole) getOMInstance(id);
    }

    /**
     * Get a PendingGroupUserRole with the given id from the cache. Returns 
     * <code>null</code> if instance is not in cache
     *
     * @param id <code>ObjectKey</code> value
     */
    protected PendingGroupUserRole getCachedInstanceImpl(ObjectKey id)
        throws TorqueException
    {
        return (PendingGroupUserRole) cacheGet(id);
    }

    /**
     * Get a PendingGroupUserRole with the given id.
     *
     * @param id <code>ObjectKey</code> value
     * @param fromCache if true, look for cached PendingGroupUserRoles before loading
     * from storage.
     */
    protected PendingGroupUserRole getInstanceImpl(ObjectKey id, boolean fromCache)
        throws TorqueException
    {
        return (PendingGroupUserRole) getOMInstance(id, fromCache);
    }

    /**
     * Gets a list of PendingGroupUserRoles based on id's.
     *
     * @param ids a List of <code>ObjectKeys</code> value
     * @return a <code>List</code> of PendingGroupUserRoles
     * @exception TorqueException if an error occurs
     */
    protected List getInstancesImpl(List ids)
        throws TorqueException
    {
        return getOMs(ids);
    }

    /**
     * Gets a list of PendingGroupUserRoles based on id's.
     *
     * @param ids a List of <code>ObjectKeys</code> value
     * @param fromCache if true, look for cached PendingGroupUserRoles before loading
     * from storage.
     * @return a <code>List</code> of PendingGroupUserRoles
     * @exception TorqueException if an error occurs
     */
    protected List getInstancesImpl(List ids, boolean fromCache)
        throws TorqueException
    {
        return getOMs(ids, fromCache);
    }

    /**
     * check for a duplicate project name
     */
    protected boolean existsImpl(PendingGroupUserRole om)
        throws TorqueException
    {
        Criteria crit = PendingGroupUserRolePeer
            .buildCriteria((PendingGroupUserRole)om);
        return PendingGroupUserRolePeer.doSelect(crit).size() > 0;
    }


    protected Persistent retrieveStoredOM(ObjectKey id)
        throws TorqueException
    {
        return PendingGroupUserRolePeer.retrieveByPK(id);
    }

    /**
     * Gets a list of ModuleEntities based on id's.
     *
     * @param ids a <code>NumberKey[]</code> value
     * @return a <code>List</code> value
     * @exception TorqueException if an error occurs
     */
    protected List retrieveStoredOMs(List ids)
        throws TorqueException
    {
        return PendingGroupUserRolePeer.retrieveByPKs(ids);
    }
}
