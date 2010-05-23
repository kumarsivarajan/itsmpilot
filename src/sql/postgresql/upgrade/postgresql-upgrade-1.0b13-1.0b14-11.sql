/*
 * Drops the unique constraint on the NAME column.  
 *
 * Created: Sean Jackson <sean@pnc.com.au>
 * $Id: postgresql-upgrade-1.0b13-1.0b14-11.sql 9625 2005-04-17 21:57:05Z dabbous $
 */

DROP INDEX scarab_global_paramete_name_key;
