package org.tigris.scarab.om;

/* ================================================================
 * Copyright (c) 2000-2005 CollabNet.  All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 * 
 * 1. Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 * 
 * 2. Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * 
 * 3. The end-user documentation included with the redistribution, if
 * any, must include the following acknowlegement: "This product includes
 * software developed by Collab.Net <http://www.Collab.Net/>."
 * Alternately, this acknowlegement may appear in the software itself, if
 * and wherever such third-party acknowlegements normally appear.
 * 
 * 4. The hosted project names must not be used to endorse or promote
 * products derived from this software without prior written
 * permission. For written permission, please contact info@collab.net.
 * 
 * 5. Products derived from this software may not use the "Tigris" or 
 * "Scarab" names nor may "Tigris" or "Scarab" appear in their names without 
 * prior written permission of Collab.Net.
 * 
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL COLLAB.NET OR ITS CONTRIBUTORS BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE
 * GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER
 * IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR
 * OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * ====================================================================
 * 
 * This software consists of voluntary contributions made by many
 * individuals on behalf of Collab.Net.
 */

import java.util.List;

import org.apache.torque.TorqueException;
import org.apache.torque.util.Criteria;

import org.tigris.scarab.tools.localization.L10NKeySet;
import org.tigris.scarab.util.AnonymousUserUtil;
import org.tigris.scarab.util.ScarabException;

import org.apache.fulcrum.security.TurbineSecurity;
import org.apache.fulcrum.security.util.DataBackendException;
import org.apache.fulcrum.security.util.UnknownEntityException;

/** 
 * This class manages ScarabUser objects.
 *
 * @author <a href="mailto:jmcnally@collab.net">John McNally</a>
 * @author <a href="mailto:jon@collab.net">Jon S. Stevens</a>
 * @version $Id: ScarabUserManager.java 10042 2006-04-11 11:28:39Z jorgeuriarte $
 */
public class ScarabUserManager
    extends BaseScarabUserManager
{
	public final static String HAS_ROLE_IN_MODULE = "hasRoleInModule";
    public final static String GET_ACL = "getACL";
	
    /**
     * Creates a new <code>ScarabUserManager</code> instance.
     *
     * @exception TorqueException if an error occurs
     */
    public ScarabUserManager()
        throws TorqueException
    {
        super();
        setRegion(getClassName().replace('.', '_'));
    }    

    /**
     * @return null if there is an UnknownEntityException
     */
    protected ScarabUser getInstanceImpl()
    {
        ScarabUser user = null;
        try
        {
            user = (ScarabUser) AnonymousUserUtil.getAnonymousUser();
        }
        catch (UnknownEntityException uee)
        {
        }
        catch (DataBackendException e)
        {
        }
        return user;
    }

    /**
     * Return an instance of User based on username.  Domain is currently
     * unused.
     */
    public static ScarabUser getInstance(final String username)
        throws TorqueException,ScarabException
    {
        return getManager().getInstanceImpl(username);
    }

    /**
     * Return an instance of User based on username.  <br/>
     * 
     */
    public static ScarabUser getInstanceByEmail(final String email) 
        throws TorqueException,ScarabException
    {
        return getManager().getInstanceByEmailImpl(email);
    }
    
    /**
     * Gets a list of ScarabUsers based on usernames.  Domain is currently
     * unused.
     *
     * @param usernames a <code>String[]</code> value
     * @return a <code>List</code> value
     * @exception Exception if an error occurs
     */
    public static List getUsers(final String[] usernames) 
        throws TorqueException
    {
        return getManager().getUsersImpl(usernames);
    }

    /**
     * Return an instance of User based on username.  Domain is currently
     * unused.
     */
    protected ScarabUser getInstanceImpl(final String username) 
        throws TorqueException,ScarabException
    {
        ScarabUser user = null;
        if (username != null) 
        {
            final Criteria crit = new Criteria();
            crit.add(ScarabUserImplPeer.USERNAME, username);
            final List users = ScarabUserImplPeer.doSelect(crit);
            if (users.size() == 1) 
            {
                user = (ScarabUser)users.get(0);
            }
            else if (users.size() > 1) 
            {
                throw new ScarabException(L10NKeySet.ExceptionDuplicateUsername);
            }
        }
        return user;
    }
    
    /**
     * Return an instance of User based on email. <br/>
     *
     */
    protected ScarabUser getInstanceByEmailImpl(final String email) 
        throws TorqueException,ScarabException
    {
        ScarabUser user = null;
        if (email != null) 
        {
            final Criteria crit = new Criteria();
            crit.add(ScarabUserImplPeer.EMAIL, email);
            final List users = ScarabUserImplPeer.doSelect(crit);
            if (users.size() == 1) 
            {
                user = (ScarabUser)users.get(0);
            }
            else if (users.size() > 1) 
            {
                throw new ScarabException(L10NKeySet.ExceptionDuplicateUsername); 
            }
        }
        return user;
    }
    
    /**
     * Gets a list of ScarabUsers based on usernames.  Domain is currently
     * unused.
     *
     * @param usernames a <code>String[]</code> value
     * @return a <code>List</code> value
     * @exception Exception if an error occurs
     */
    protected List getUsersImpl(final String[] usernames) 
        throws TorqueException
    {
        List users = null;
        if (usernames != null && usernames.length > 0) 
        {
            final Criteria crit = new Criteria();
            crit.addIn(ScarabUserImplPeer.USERNAME, usernames);
            users = ScarabUserImplPeer.doSelect(crit);            
        }
        return users;
    }    
    
    /**
     * Reactivate a User instance, if and only if it exists AND
     * it has previously been delted (instance state is DELETED).
     * returns reacitvated ScarabUser instance, or null, if user
     * is NOT deleted. May return an internal Exception.
     * @param su
     * @return
     * @throws Exception
     */
    public static ScarabUser reactivateUserIfDeleted(ScarabUser su) throws Exception
    {
        String username = su.getUserName();
        ScarabUser reactivatedUser=(ScarabUser) TurbineSecurity.getUser(username);
        String cs = reactivatedUser.getConfirmed();
        if(cs.equals(ScarabUser.DELETED))
        {
            reactivatedUser.setConfirmed(su.getConfirmed());
            reactivatedUser.setEmail(su.getEmail());
            String encryptedPassword = TurbineSecurity.encryptPassword(su.getPassword());
            reactivatedUser.setPassword(encryptedPassword);
            reactivatedUser.setFirstName(su.getFirstName());
            reactivatedUser.setLastName(su.getLastName());
            reactivatedUser.save();
            su = reactivatedUser;
        } 
        else
        {
            su = null;
        }
        return su;
    }
   
}





