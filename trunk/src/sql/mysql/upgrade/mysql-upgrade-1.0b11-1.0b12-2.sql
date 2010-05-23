/*
 * Add columns to ISSUE_TYPE
 *
 * $Id: mysql-upgrade-1.0b11-1.0b12-2.sql 9625 2005-04-17 21:57:05Z dabbous $
 *
 * Created By: Elicia David
 */

ALTER TABLE SCARAB_ISSUE_TYPE ADD ISDEFAULT INTEGER (1) default 0;
