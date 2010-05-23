/*
 * This upgrade script moves the renames the DEFAULT_SUBSCRIPTION_FREQUENCY_ID 
 * column.  Some databases choke on the longer name.
 *
 * Created By: John McNally
 * $Id: mysql-upgrade-1.0b4-1.0b5-1.sql 9625 2005-04-17 21:57:05Z dabbous $
 */

alter table SCARAB_QUERY change DEFAULT_SUBSCRIPTION_FREQUENCY_ID SUBSCRIPTION_FREQUENCY_ID int(11); 

