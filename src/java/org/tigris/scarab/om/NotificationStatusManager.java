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
 * software developed by CollabNet <http://www.Collab.Net/>."
 * Alternately, this acknowlegement may appear in the software itself, if
 * and wherever such third-party acknowlegements normally appear.
 *
 * 4. The hosted project names must not be used to endorse or promote
 * products derived from this software without prior written
 * permission. For written permission, please contact info@collab.net.
 *
 * 5. Products derived from this software may not use the "Tigris" or
 * "Scarab" names nor may "Tigris" or "Scarab" appear in their names without
 * prior written permission of CollabNet.
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
 * individuals on behalf of CollabNet.
 */

import java.util.List;

import org.apache.torque.Torque;
import org.apache.torque.TorqueException;
import org.apache.torque.om.Persistent;
import org.apache.torque.util.Criteria;
import org.tigris.scarab.services.security.ScarabSecurity;
import org.tigris.scarab.tools.localization.L10NKeySet;
import org.tigris.scarab.util.ScarabException;

/**
 * This class manages NotificationStatus objects.
 * The skeleton for this class was autogenerated by Torque  * You should add additional methods to this class to meet the
 * application requirements.  This class will only be generated as
 * long as it does not already exist in the output directory.
 */
public class NotificationStatusManager
    extends BaseNotificationStatusManager
{
    /**
     * Creates a new <code>NotificationStatusManager</code> instance.
     *
     * @exception TorqueException if an error occurs
     */
    public NotificationStatusManager()
        throws TorqueException
    {
        super();
    }
    
    /**
     * Get the list of notifications currently stored in the 
     * Table SCARAB_NOTIFICATION_STATUS.
     * @param user
     * @return
     * @throws TorqueException
     */
    public static List getNotificationsFor(ScarabUser user) throws TorqueException
    {
        //NotificationStatusManager.getInstance().
        List result = null;
        Criteria crit = new Criteria()
        .add(NotificationStatusPeer.RECEIVER_ID, user.getUserId());
        crit.and(NotificationStatusPeer.STATUS, NotificationStatus.MARK_DELETED, Criteria.NOT_EQUAL);
        result = NotificationStatusPeer.doSelect(crit);
        return result;
    }
    
    
    
}