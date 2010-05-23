/*
 * LOCALE is a more precise name than LANGUAGE.
 * 
 * Created: Sean Jackson <sean@pnc.com.au>
 * $Id: postgresql-upgrade-1.0b13-1.0b14-15.sql 9625 2005-04-17 21:57:05Z dabbous $
 */

ALTER TABLE SCARAB_USER_PREFERENCE RENAME LANGUAGE TO LOCALE;
