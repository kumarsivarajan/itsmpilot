

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
 * This class manages Scope objects.
 * This class was autogenerated by Torque  *
 * You should not use this class directly.  It should not even be
 * extended all references should be to ScopeManager
 */
public abstract class BaseScopeManager
    extends AbstractBaseManager
{
    /** The name of the manager */
    protected static final String MANAGED_CLASS = "org.tigris.scarab.om.Scope";

    /** The name of our class to pass to Torque as the default manager. */
    protected static final String DEFAULT_MANAGER_CLASS
        = "org.tigris.scarab.om.ScopeManager";

    /**
     * Retrieves an implementation of the manager, based on the settings in
     * the configuration.
     *
     * @return an implementation of ScopeManager.
     */
    public static ScopeManager getManager()
    {
        return (ScopeManager)
            Torque.getManager(ScopeManager.MANAGED_CLASS,
                ScopeManager.DEFAULT_MANAGER_CLASS);
    }

    /**
     * Static accessor for the @see #getInstanceImpl().
     *
     * @return a <code>Scope</code> value
     * @exception TorqueException if an error occurs
     */
    public static Scope getInstance()
        throws TorqueException
    {
        return getManager().getInstanceImpl();
    }

    /**
     * Static accessor for the @see #getInstanceImpl(ObjectKey).
     *
     * @param id an <code>ObjectKey</code> value
     * @return a <code>Scope</code> value
     * @exception TorqueException if an error occurs
     */
    public static Scope getInstance(ObjectKey id)
        throws TorqueException
    {
        return getManager().getInstanceImpl(id);
    }

    /**
     * Static accessor for the @see #getCachedInstanceImpl(ObjectKey).
     * Loads <code>Scope</code> from cache, returns 
     * <code>null</code>, if instance is not in cache
     *
     * @param id an <code>ObjectKey</code> value
     * @return a <code>Scope</code> value
     * @exception TorqueException if an error occurs
     */
    public static Scope getCachedInstance(ObjectKey id)
        throws TorqueException
    {
        return getManager().getCachedInstanceImpl(id);
    }

    /**
     * Static accessor for the @see #getInstanceImpl(ObjectKey, boolean).
     *
     * @param id an <code>ObjectKey</code> value
     * @param fromCache if true, look for cached Scopes before loading
     * from storage.
     * @return a <code>Scope</code> value
     * @exception TorqueException if an error occurs
     */
    public static Scope getInstance(ObjectKey id, boolean fromCache)
        throws TorqueException
    {
        return getManager().getInstanceImpl(id, fromCache);
    }

    /**
     * Static accessor for the @see #getInstanceImpl(ObjectKey).
     *
     * @param id an <code>ObjectKey</code> value
     * @return a <code>Scope</code> value
     * @exception TorqueException if an error occurs
     */
    public static Scope getInstance(Integer id)
        throws TorqueException
    {
        return getManager().getInstanceImpl(SimpleKey.keyFor(id));
    }

    /**
     * Static accessor for the @see #getInstanceImpl(ObjectKey).
     *
     * @param id an <code>ObjectKey</code> value
     * @param fromCache if true, look for cached Scopes before loading
     * from storage.
     * @return a <code>Scope</code> value
     * @exception TorqueException if an error occurs
     */
    public static Scope getInstance(Integer id, boolean fromCache)
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
     * @param fromCache if true, look for cached Scopes before loading
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

    public static boolean exists(Scope obj)
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
     * Creates a new <code>BaseScopeManager</code> instance.
     *
     * @exception TorqueException if an error occurs
     */
    public BaseScopeManager()
        throws TorqueException
    {
        setClassName("org.tigris.scarab.om.Scope");
    }

    /**
     * Get a fresh instance of a ScopeManager
     */
    protected Scope getInstanceImpl()
        throws TorqueException
    {
        Scope obj = null;
        try
        {
            obj = (Scope) getOMInstance();
        }
        catch (Exception e)
        {
            throw new TorqueException(e);
        }
        return obj;
    }

    /**
     * Get a Scope with the given id.
     *
     * @param id <code>ObjectKey</code> value
     */
    protected Scope getInstanceImpl(ObjectKey id)
        throws TorqueException
    {
        return (Scope) getOMInstance(id);
    }

    /**
     * Get a Scope with the given id from the cache. Returns 
     * <code>null</code> if instance is not in cache
     *
     * @param id <code>ObjectKey</code> value
     */
    protected Scope getCachedInstanceImpl(ObjectKey id)
        throws TorqueException
    {
        return (Scope) cacheGet(id);
    }

    /**
     * Get a Scope with the given id.
     *
     * @param id <code>ObjectKey</code> value
     * @param fromCache if true, look for cached Scopes before loading
     * from storage.
     */
    protected Scope getInstanceImpl(ObjectKey id, boolean fromCache)
        throws TorqueException
    {
        return (Scope) getOMInstance(id, fromCache);
    }

    /**
     * Gets a list of Scopes based on id's.
     *
     * @param ids a List of <code>ObjectKeys</code> value
     * @return a <code>List</code> of Scopes
     * @exception TorqueException if an error occurs
     */
    protected List getInstancesImpl(List ids)
        throws TorqueException
    {
        return getOMs(ids);
    }

    /**
     * Gets a list of Scopes based on id's.
     *
     * @param ids a List of <code>ObjectKeys</code> value
     * @param fromCache if true, look for cached Scopes before loading
     * from storage.
     * @return a <code>List</code> of Scopes
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
    protected boolean existsImpl(Scope om)
        throws TorqueException
    {
        Criteria crit = ScopePeer
            .buildCriteria((Scope)om);
        return ScopePeer.doSelect(crit).size() > 0;
    }


    protected Persistent retrieveStoredOM(ObjectKey id)
        throws TorqueException
    {
        return ScopePeer.retrieveByPK(id);
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
        return ScopePeer.retrieveByPKs(ids);
    }
}
