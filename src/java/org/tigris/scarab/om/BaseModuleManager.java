

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
 * This class manages Module objects.
 * This class was autogenerated by Torque  *
 * You should not use this class directly.  It should not even be
 * extended all references should be to ModuleManager
 */
public abstract class BaseModuleManager
    extends AbstractBaseManager
{
    /** The name of the manager */
    protected static final String MANAGED_CLASS = "org.tigris.scarab.om.Module";

    /** The name of our class to pass to Torque as the default manager. */
    protected static final String DEFAULT_MANAGER_CLASS
        = "org.tigris.scarab.om.ModuleManager";

    /**
     * Retrieves an implementation of the manager, based on the settings in
     * the configuration.
     *
     * @return an implementation of ModuleManager.
     */
    public static ModuleManager getManager()
    {
        return (ModuleManager)
            Torque.getManager(ModuleManager.MANAGED_CLASS,
                ModuleManager.DEFAULT_MANAGER_CLASS);
    }

    /**
     * Static accessor for the @see #getInstanceImpl().
     *
     * @return a <code>Module</code> value
     * @exception TorqueException if an error occurs
     */
    public static Module getInstance()
        throws TorqueException
    {
        return getManager().getInstanceImpl();
    }

    /**
     * Static accessor for the @see #getInstanceImpl(ObjectKey).
     *
     * @param id an <code>ObjectKey</code> value
     * @return a <code>Module</code> value
     * @exception TorqueException if an error occurs
     */
    public static Module getInstance(ObjectKey id)
        throws TorqueException
    {
        return getManager().getInstanceImpl(id);
    }

    /**
     * Static accessor for the @see #getCachedInstanceImpl(ObjectKey).
     * Loads <code>Module</code> from cache, returns 
     * <code>null</code>, if instance is not in cache
     *
     * @param id an <code>ObjectKey</code> value
     * @return a <code>Module</code> value
     * @exception TorqueException if an error occurs
     */
    public static Module getCachedInstance(ObjectKey id)
        throws TorqueException
    {
        return getManager().getCachedInstanceImpl(id);
    }

    /**
     * Static accessor for the @see #getInstanceImpl(ObjectKey, boolean).
     *
     * @param id an <code>ObjectKey</code> value
     * @param fromCache if true, look for cached Modules before loading
     * from storage.
     * @return a <code>Module</code> value
     * @exception TorqueException if an error occurs
     */
    public static Module getInstance(ObjectKey id, boolean fromCache)
        throws TorqueException
    {
        return getManager().getInstanceImpl(id, fromCache);
    }

    /**
     * Static accessor for the @see #getInstanceImpl(ObjectKey).
     *
     * @param id an <code>ObjectKey</code> value
     * @return a <code>Module</code> value
     * @exception TorqueException if an error occurs
     */
    public static Module getInstance(Integer id)
        throws TorqueException
    {
        return getManager().getInstanceImpl(SimpleKey.keyFor(id));
    }

    /**
     * Static accessor for the @see #getInstanceImpl(ObjectKey).
     *
     * @param id an <code>ObjectKey</code> value
     * @param fromCache if true, look for cached Modules before loading
     * from storage.
     * @return a <code>Module</code> value
     * @exception TorqueException if an error occurs
     */
    public static Module getInstance(Integer id, boolean fromCache)
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
     * @param fromCache if true, look for cached Modules before loading
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

    public static boolean exists(Module obj)
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
     * Creates a new <code>BaseModuleManager</code> instance.
     *
     * @exception TorqueException if an error occurs
     */
    public BaseModuleManager()
        throws TorqueException
    {
        setClassName("org.tigris.scarab.om.Module");
    }

    /**
     * Get a fresh instance of a ModuleManager
     */
    protected Module getInstanceImpl()
        throws TorqueException
    {
        Module obj = null;
        try
        {
            obj = (Module) getOMInstance();
        }
        catch (Exception e)
        {
            throw new TorqueException(e);
        }
        return obj;
    }

    /**
     * Get a Module with the given id.
     *
     * @param id <code>ObjectKey</code> value
     */
    protected Module getInstanceImpl(ObjectKey id)
        throws TorqueException
    {
        return (Module) getOMInstance(id);
    }

    /**
     * Get a Module with the given id from the cache. Returns 
     * <code>null</code> if instance is not in cache
     *
     * @param id <code>ObjectKey</code> value
     */
    protected Module getCachedInstanceImpl(ObjectKey id)
        throws TorqueException
    {
        return (Module) cacheGet(id);
    }

    /**
     * Get a Module with the given id.
     *
     * @param id <code>ObjectKey</code> value
     * @param fromCache if true, look for cached Modules before loading
     * from storage.
     */
    protected Module getInstanceImpl(ObjectKey id, boolean fromCache)
        throws TorqueException
    {
        return (Module) getOMInstance(id, fromCache);
    }

    /**
     * Gets a list of Modules based on id's.
     *
     * @param ids a List of <code>ObjectKeys</code> value
     * @return a <code>List</code> of Modules
     * @exception TorqueException if an error occurs
     */
    protected List getInstancesImpl(List ids)
        throws TorqueException
    {
        return getOMs(ids);
    }

    /**
     * Gets a list of Modules based on id's.
     *
     * @param ids a List of <code>ObjectKeys</code> value
     * @param fromCache if true, look for cached Modules before loading
     * from storage.
     * @return a <code>List</code> of Modules
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
    protected boolean existsImpl(Module om)
        throws TorqueException
    {
        Criteria crit = ScarabModulePeer
            .buildCriteria((ScarabModule)om);
        return ScarabModulePeer.doSelect(crit).size() > 0;
    }


    protected Persistent retrieveStoredOM(ObjectKey id)
        throws TorqueException
    {
        return ScarabModulePeer.retrieveByPK(id);
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
        return ScarabModulePeer.retrieveByPKs(ids);
    }
}
