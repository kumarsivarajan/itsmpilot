/*
 * This upgrade script adds an ATTACHMENT_ID column to the SCARAB_ACTIVITY table.
 *
 * Created By: Jon Scott Stevens
 * $Id: mysql-upgrade-1.0b7-1.0b8-7.sql 9625 2005-04-17 21:57:05Z dabbous $
 */

ALTER TABLE SCARAB_ACTIVITY ADD column ATTACHMENT_ID integer null;

update SCARAB_ACTIVITY set ATTACHMENT_ID=null where ATTACHMENT_ID=0;
