/*
 * This upgrade script renames the combo-box attribute type name to be
 * Dropdown list.
 *
 * Created By: Jon Scott Stevens
 * $Id: mysql-upgrade-1.0b6-1.0b7-1.sql 9625 2005-04-17 21:57:05Z dabbous $
 */

update SCARAB_ATTRIBUTE_TYPE 
    set ATTRIBUTE_TYPE_NAME='Dropdown list'
    where ATTRIBUTE_TYPE_NAME='combo-box';
