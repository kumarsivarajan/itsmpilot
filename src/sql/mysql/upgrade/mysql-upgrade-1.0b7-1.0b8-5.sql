/*
 * Adds a column to store a module specific archive email address.
 * 
 * Created By: John McNally 
 * $Id: mysql-upgrade-1.0b7-1.0b8-5.sql 9625 2005-04-17 21:57:05Z dabbous $
 */

alter table SCARAB_MODULE add ARCHIVE_EMAIL VARCHAR(99);