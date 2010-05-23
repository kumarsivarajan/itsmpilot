/*
 * This script removes the date and float attribute types as they are not
 * handled properly in the schema or code.
 *
 * Created By: John McNally 
 * $Id: mysql-upgrade-1.0b6-1.0b7-4.sql 9625 2005-04-17 21:57:05Z dabbous $
 */

delete from SCARAB_ATTRIBUTE_TYPE where ATTRIBUTE_TYPE_ID=2;
delete from SCARAB_ATTRIBUTE_TYPE where ATTRIBUTE_TYPE_ID=4;