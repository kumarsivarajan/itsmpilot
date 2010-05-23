/*
 * This upgrade script removes a few tables that were not used by the 
 * application, so there should be no data related changes.
 *
 * Created By: John McNally
 * $Id: mysql-upgrade-1.0b3-1.0b4-1.sql 9625 2005-04-17 21:57:05Z dabbous $
 */

drop table if exists SCARAB_ISSUE_ATTRIBUTE_VOTE;
drop table if exists SCARAB_R_ATTRIBUTE_VALUE_WORD;
drop table if exists SCARAB_WORD;