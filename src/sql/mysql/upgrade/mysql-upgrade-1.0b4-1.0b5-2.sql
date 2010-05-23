/*
 * This upgrade script increases the size of the SCARAB_ISSUE.ID_DOMAIN, 
 * SCARAB_MODULE.DOMAIN, and TURBINE_USER.LOGIN_NAME columns.
 *
 * Created By: John McNally
 * $Id: mysql-upgrade-1.0b4-1.0b5-2.sql 9625 2005-04-17 21:57:05Z dabbous $
 */

alter table SCARAB_MODULE change DOMAIN DOMAIN VARCHAR(127); 
alter table SCARAB_ISSUE change ID_DOMAIN ID_DOMAIN VARCHAR(127); 
alter table TURBINE_USER change LOGIN_NAME LOGIN_NAME VARCHAR(99); 
