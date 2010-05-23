package org.tigris.scarab.tools;

/* ================================================================
 * Copyright (c) 2000 CollabNet.  All rights reserved.
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
 * software developed by CollabNet (http://www.collab.net/)."
 * Alternately, this acknowlegement may appear in the software itself, if
 * and wherever such third-party acknowlegements normally appear.
 * 
 * 4. The hosted project names must not be used to endorse or promote
 * products derived from this software without prior written
 * permission. For written permission, please contact info@collab.net.
 * 
 * 5. Products derived from this software may not use the "Tigris" name
 * nor may "Tigris" appear in their names without prior written
 * permission of CollabNet.
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

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Takes a date in any format and converts it to the desired format
 */
public class Format
{
    /**
     * The default date/time format string.
     */
    public static final String DATE_TIME_FMT = "yyyy-MM-dd HH:mm";

    /**
     * Formats the date according to the passed in <code>DateFormat</code>.
     * This is generally used with SRT.getDateFormat() and in the templates
     * it looks something like this:
     * $format.getDate($scarabR.DateFormat, $issue.CreatedDate)
     */
    public static String getDate(DateFormat format, Date date)
    {
        return format.format(date);
    }

    /**
     * Formats the date according to the passed in format
     * Uses SimpleDateFormat to do its magic.
     */
    public static String getDate(String format, Date date)
    {
        SimpleDateFormat newFormat = new SimpleDateFormat(format);
        return newFormat.format(date);
    }

    /**
     * Formats the current date according to the passed in format
     * Uses SimpleDateFormat to do its magic.
     */
    public static String getNow(SimpleDateFormat format)
    {
        return getDate(format, new Date());
    }

    /**
     * Formats the current date according to the passed in format
     * Uses SimpleDateFormat to do its magic.
     */
    public static String getNow(String format)
    {
        return getDate(format, new Date());
    }
    
    
    /**
     * Formats a dimension in bytes to the most appropriate
     * size unit (bytes, KB, MB)
     */
    public static String getFileSize(long fileSize) 
    {
     // naive implementation..
     String fileUnit="bytes";
     double fSize=fileSize;
     
     if (fSize>1024) {
         fSize/=1024;
         fileUnit="KB";
     }

     if (fSize>1024) {
         fSize/=1024;
         fileUnit="MB";
     }    
     
     fSize=Math.round(fSize*100.0)/100.0;
     return String.valueOf(fSize)+" "+fileUnit;
    }
}
