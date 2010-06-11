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

// Java classes
import java.util.List;

import org.apache.torque.TorqueException;
import org.apache.torque.util.Criteria;

import org.tigris.scarab.tools.localization.L10NKeySet;
import org.tigris.scarab.util.ScarabException;
import org.tigris.scarab.services.cache.ScarabCache;

/** 
 * This class manages ActivitySetType objects.  
 *
 * @author <a href="mailto:jmcnally@collab.net">John McNally</a>
 * @author <a href="mailto:jon@collab.net">Jon S. Stevens</a>
 * @version $Id: ActivitySetTypeManager.java 9977 2005-12-09 00:40:59Z hair $
 */
public class ActivitySetTypeManager
    extends BaseActivitySetTypeManager
{
    // the following Strings are method names that are used in caching results
    private static final String TRANSACTION_TYPE =
        "ActivitySetType";
    private static final String GET_INSTANCE =
        "getInstance";

    /**
     * Creates a new <code>ActivitySetTypeManager</code> instance.
     *
     * @exception TorqueException if an error occurs
     */
    public ActivitySetTypeManager()
        throws TorqueException
    {
        super();
    }

    public static ActivitySetType getInstance(final String activitySetTypeName) 
        throws TorqueException,ScarabException
    {
        ActivitySetType ttype = null; 
        Object obj = ScarabCache.get(TRANSACTION_TYPE, GET_INSTANCE, 
                                     activitySetTypeName);
        if (obj == null) 
        {        
            final Criteria crit = new Criteria();
            crit.add(ActivitySetTypePeer.NAME, activitySetTypeName);
            final List activitySetTypes = ActivitySetTypePeer.doSelect(crit);
            if (activitySetTypes.size() < 1) 
            {
                throw new ScarabException(
                        L10NKeySet.ExceptionActivitySetTypenameNotFound, 
                        activitySetTypeName);
            }
            if (activitySetTypes.size() > 1)
            {
                throw new ScarabException(
                        L10NKeySet.ExceptionActivitySetDuplicateTypename,
                        activitySetTypeName);
            }
            ttype = (ActivitySetType)activitySetTypes.get(0);
            ScarabCache.put(ttype, "ActivitySetType", "getInstance", 
                            activitySetTypeName);
        }
        else 
        {
            ttype = (ActivitySetType)obj;
        }
        
        return ttype;
    }
}