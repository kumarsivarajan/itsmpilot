

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
 * This class manages ScarabRoleImpl objects.
 * This class was autogenerated by Torque  *
 * You should not use this class directly.  It should not even be
 * extended all references should be to ScarabRoleImplManager
 */
public abstract class BaseScarabRoleImplManager
    extends AbstractBaseManager
{
    /** The name of the manager */
    protected static final String MANAGED_CLASS = "org.tigris.scarab.om.ScarabRoleImpl";

    /** The name of our class to pass to Torque as the default manager. */
    protected static final String DEFAULT_MANAGER_CLASS
        = "org.tigris.scarab.om.ScarabRoleImplManager";

    /**
     * Retrieves an implementation of the manager, based on the settings in
     * the configuration.
     *
     * @return an implementation of ScarabRoleImplManager.
     */
    public static ScarabRoleImplManager getManager()
    {
        return (ScarabRoleImplManager)
            Torque.getManager(ScarabRoleImplManager.MANAGED_CLASS,
                ScarabRoleImplManager.DEFAULT_MANAGER_CLASS);
    }

    /**
     * Static accessor for the @see #getInstanceImpl().
     *
     * @return a <code>ScarabRoleImpl</code> value
     * @exception TorqueException if an error occurs
     */
    public static ScarabRoleImpl getInstance()
        throws TorqueException
    {
        return getManager().getInstanceImpl();
    }

    /**
     * Static accessor for the @see #getInstanceImpl(ObjectKey).
     *
     * @param id an <code>ObjectKey</code> value
     * @return a <code>ScarabRoleImpl</code> value
     * @exception TorqueException if an error occurs
     */
    public static ScarabRoleImpl getInstance(ObjectKey id)
        throws TorqueException
    {
        return getManager().getInstanceImpl(id);
    }

    /**
     * Static accessor for the @see #getCachedInstanceImpl(ObjectKey).
     * Loads <code>ScarabRoleImpl</code> from cache, returns 
     * <code>null</code>, if instance is not in cache
     *
     * @param id an <code>ObjectKey</code> value
     * @return a <code>ScarabRoleImpl</code> value
     * @exception TorqueException if an error occurs
     */
    public static ScarabRoleImpl getCachedInstance(ObjectKey id)
        throws TorqueException
    {
        return getManager().getCachedInstanceImpl(id);
    }

    /**
     * Static accessor for the @see #getInstanceImpl(ObjectKey, boolean).
     *
     * @param id an <code>ObjectKey</code> value
     * @param fromCache if true, look for cached ScarabRoleImpls before loading
     * from storage.
     * @return a <code>ScarabRoleImpl</code> value
     * @exception TorqueException if an error occurs
     */
    public static ScarabRoleImpl getInstance(ObjectKey id, boolean fromCache)
        throws TorqueException
    {
        return getManager().getInstanceImpl(id, fromCache);
    }

    /**
     * Static accessor for the @see #getInstanceImpl(ObjectKey).
     *
     * @param id an <code>ObjectKey</code> value
     * @return a <code>ScarabRoleImpl</code> value
     * @exception TorqueException if an error occurs
     */
    public static ScarabRoleImpl getInstance(Integer id)
        throws TorqueException
    {
        return getManager().getInstanceImpl(SimpleKey.keyFor(id));
    }

    /**
     * Static accessor for the @see #getInstanceImpl(ObjectKey).
     *
     * @param id an <code>ObjectKey</code> value
     * @param fromCache if true, look for cached ScarabRoleImpls before loading
     * from storage.
     * @return a <code>ScarabRoleImpl</code> value
     * @exception TorqueException if an error occurs
     */
    public static ScarabRoleImpl getInstance(Integer id, boolean fromCache)
        throws TorqueException
    {
        return getManager().getInstanceImpl(SimpleKey.keyFor(id), fromCache);
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
     * @param fromCache if true, look for cached ScarabRoleImpls before loading
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

    public static boolean exists(ScarabRoleImpl obj)
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
     * Creates a new <code>BaseScarabRoleImplManager</code> instance.
     *
     * @exception TorqueException if an error occurs
     */
    public BaseScarabRoleImplManager()
        throws TorqueException
    {
        setClassName("org.tigris.scarab.om.ScarabRoleImpl");
    }

    /**
     * Get a fresh instance of a ScarabRoleImplManager
     */
    protected ScarabRoleImpl getInstanceImpl()
        throws TorqueException
    {
        ScarabRoleImpl obj = null;
        try
        {
            obj = (ScarabRoleImpl) getOMInstance();
        }
        catch (Exception e)
        {
            throw new TorqueException(e);
        }
        return obj;
    }

    /**
     * Get a ScarabRoleImpl with the given id.
     *
     * @param id <code>ObjectKey</code> value
     */
    protected ScarabRoleImpl getInstanceImpl(ObjectKey id)
        throws TorqueException
    {
        return (ScarabRoleImpl) getOMInstance(id);
    }

    /**
     * Get a ScarabRoleImpl with the given id from the cache. Returns 
     * <code>null</code> if instance is not in cache
     *
     * @param id <code>ObjectKey</code> value
     */
    protected ScarabRoleImpl getCachedInstanceImpl(ObjectKey id)
        throws TorqueException
    {
        return (ScarabRoleImpl) cacheGet(id);
    }

    /**
     * Get a ScarabRoleImpl with the given id.
     *
     * @param id <code>ObjectKey</code> value
     * @param fromCache if true, look for cached ScarabRoleImpls before loading
     * from storage.
     */
    protected ScarabRoleImpl getInstanceImpl(ObjectKey id, boolean fromCache)
        throws TorqueException
    {
        return (ScarabRoleImpl) getOMInstance(id, fromCache);
    }

    /**
     * Gets a list of ScarabRoleImpls based on id's.
     *
     * @param ids a List of <code>ObjectKeys</code> value
     * @return a <code>List</code> of ScarabRoleImpls
     * @exception TorqueException if an error occurs
     */
    protected List getInstancesImpl(List ids)
        throws TorqueException
    {
        return getOMs(ids);
    }

    /**
     * Gets a list of ScarabRoleImpls based on id's.
     *
     * @param ids a List of <code>ObjectKeys</code> value
     * @param fromCache if true, look for cached ScarabRoleImpls before loading
     * from storage.
     * @return a <code>List</code> of ScarabRoleImpls
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
    protected boolean existsImpl(ScarabRoleImpl om)
        throws TorqueException
    {
        Criteria crit = ScarabRoleImplPeer
            .buildCriteria((ScarabRoleImpl)om);
        return ScarabRoleImplPeer.doSelect(crit).size() > 0;
    }


    protected Persistent retrieveStoredOM(ObjectKey id)
        throws TorqueException
    {
        return ScarabRoleImplPeer.retrieveScarabRoleImplByPK(id);
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
        return ScarabRoleImplPeer.retrieveScarabRoleImplByPKs(ids);
    }
}
