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
 * extended all references should be to UserPreference
 */
public abstract class BaseUserPreference extends BaseObject
    implements org.apache.fulcrum.intake.Retrievable
{
    /** The Peer class */
    private static final UserPreferencePeer peer =
        new UserPreferencePeer();

        
    /** The value for the userId field */
    private Integer userId;
      
    /** The value for the passwordExpire field */
    private Date passwordExpire;
      
    /** The value for the enterIssueRedirect field */
    private int enterIssueRedirect;
      
    /** The value for the homePage field */
    private String homePage;
      
    /** The value for the locale field */
    private String locale;
  
            
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
          
    /**
     * Get the PasswordExpire
     *
     * @return Date
     */
    public Date getPasswordExpire()
    {
        return passwordExpire;
    }

                        
    /**
     * Set the value of PasswordExpire
     *
     * @param v new value
     */
    public void setPasswordExpire(Date v) 
    {
    
                  if (!ObjectUtils.equals(this.passwordExpire, v))
              {
            this.passwordExpire = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the EnterIssueRedirect
     *
     * @return int
     */
    public int getEnterIssueRedirect()
    {
        return enterIssueRedirect;
    }

                        
    /**
     * Set the value of EnterIssueRedirect
     *
     * @param v new value
     */
    public void setEnterIssueRedirect(int v) 
    {
    
                  if (this.enterIssueRedirect != v)
              {
            this.enterIssueRedirect = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the HomePage
     *
     * @return String
     */
    public String getHomePage()
    {
        return homePage;
    }

                        
    /**
     * Set the value of HomePage
     *
     * @param v new value
     */
    public void setHomePage(String v) 
    {
    
                  if (!ObjectUtils.equals(this.homePage, v))
              {
            this.homePage = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the Locale
     *
     * @return String
     */
    public String getLocale()
    {
        return locale;
    }

                        
    /**
     * Set the value of Locale
     *
     * @param v new value
     */
    public void setLocale(String v) 
    {
    
                  if (!ObjectUtils.equals(this.locale, v))
              {
            this.locale = v;
            setModified(true);
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
              fieldNames.add("UserId");
              fieldNames.add("PasswordExpire");
              fieldNames.add("EnterIssueRedirect");
              fieldNames.add("HomePage");
              fieldNames.add("Locale");
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
          if (name.equals("UserId"))
        {
                return getUserId();
            }
          if (name.equals("PasswordExpire"))
        {
                return getPasswordExpire();
            }
          if (name.equals("EnterIssueRedirect"))
        {
                return new Integer(getEnterIssueRedirect());
            }
          if (name.equals("HomePage"))
        {
                return getHomePage();
            }
          if (name.equals("Locale"))
        {
                return getLocale();
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
          if (name.equals(UserPreferencePeer.USER_ID))
        {
                return getUserId();
            }
          if (name.equals(UserPreferencePeer.PASSWORD_EXPIRE))
        {
                return getPasswordExpire();
            }
          if (name.equals(UserPreferencePeer.ENTER_ISSUE_REDIRECT))
        {
                return new Integer(getEnterIssueRedirect());
            }
          if (name.equals(UserPreferencePeer.HOME_PAGE))
        {
                return getHomePage();
            }
          if (name.equals(UserPreferencePeer.LOCALE))
        {
                return getLocale();
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
                return getUserId();
            }
              if (pos == 1)
        {
                return getPasswordExpire();
            }
              if (pos == 2)
        {
                return new Integer(getEnterIssueRedirect());
            }
              if (pos == 3)
        {
                return getHomePage();
            }
              if (pos == 4)
        {
                return getLocale();
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
          save(UserPreferencePeer.getMapBuilder()
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
                    UserPreferencePeer.doInsert((UserPreference) this, con);
                    setNew(false);
                }
                else
                {
                    UserPreferencePeer.doUpdate((UserPreference) this, con);
                }

    
                      if (isCacheOnSave())
                {
                    UserPreferenceManager.putInstance(this);
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
     * @param key userId ObjectKey
     */
    public void setPrimaryKey(ObjectKey key)
        throws TorqueException
    {
            setUserId(new Integer(((NumberKey) key).intValue()));
        }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) throws TorqueException
    {
            setUserId(new Integer(key));
        }

  
    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
          return SimpleKey.keyFor(getUserId());
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
      public UserPreference copy() throws TorqueException
    {
        return copyInto(new UserPreference());
    }
  
    protected UserPreference copyInto(UserPreference copyObj) throws TorqueException
    {
          copyObj.setUserId(userId);
          copyObj.setPasswordExpire(passwordExpire);
          copyObj.setEnterIssueRedirect(enterIssueRedirect);
          copyObj.setHomePage(homePage);
          copyObj.setLocale(locale);
  
                    copyObj.setUserId((Integer)null);
                                    
                return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public UserPreferencePeer getPeer()
    {
        return peer;
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("UserPreference:\n");
        str.append("UserId = ")
               .append(getUserId())
             .append("\n");
        str.append("PasswordExpire = ")
               .append(getPasswordExpire())
             .append("\n");
        str.append("EnterIssueRedirect = ")
               .append(getEnterIssueRedirect())
             .append("\n");
        str.append("HomePage = ")
               .append(getHomePage())
             .append("\n");
        str.append("Locale = ")
               .append(getLocale())
             .append("\n");
        return(str.toString());
    }
}
