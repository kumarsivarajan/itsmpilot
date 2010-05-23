package org.tigris.scarab.om.map;

import java.util.Date;
import java.math.BigDecimal;

import org.apache.torque.Torque;
import org.apache.torque.TorqueException;
import org.apache.torque.map.MapBuilder;
import org.apache.torque.map.DatabaseMap;
import org.apache.torque.map.TableMap;

/**
  */
public class AttributeValueMapBuilder implements MapBuilder
{
    /**
     * The name of this class
     */
    public static final String CLASS_NAME =
        "org.tigris.scarab.om.map.AttributeValueMapBuilder";

    /**
     * The database map.
     */
    private DatabaseMap dbMap = null;

    /**
     * Tells us if this DatabaseMapBuilder is built so that we
     * don't have to re-build it every time.
     *
     * @return true if this DatabaseMapBuilder is built
     */
    public boolean isBuilt()
    {
        return (dbMap != null);
    }

    /**
     * Gets the databasemap this map builder built.
     *
     * @return the databasemap
     */
    public DatabaseMap getDatabaseMap()
    {
        return this.dbMap;
    }

    /**
     * The doBuild() method builds the DatabaseMap
     *
     * @throws TorqueException
     */
    public void doBuild() throws TorqueException
    {
        dbMap = Torque.getDatabaseMap("scarab");

        dbMap.addTable("SCARAB_ISSUE_ATTRIBUTE_VALUE");
        TableMap tMap = dbMap.getTable("SCARAB_ISSUE_ATTRIBUTE_VALUE");

        tMap.setPrimaryKeyMethod(TableMap.ID_BROKER);

        tMap.setPrimaryKeyMethodInfo(tMap.getName());

              tMap.addPrimaryKey("SCARAB_ISSUE_ATTRIBUTE_VALUE.VALUE_ID", new Long(0));
                    tMap.addForeignKey(
                "SCARAB_ISSUE_ATTRIBUTE_VALUE.ISSUE_ID", new Long(0) , "SCARAB_ISSUE" ,
                "ISSUE_ID");
                    tMap.addForeignKey(
                "SCARAB_ISSUE_ATTRIBUTE_VALUE.ATTRIBUTE_ID", new Integer(0) , "SCARAB_ATTRIBUTE" ,
                "ATTRIBUTE_ID");
                    tMap.addColumn("SCARAB_ISSUE_ATTRIBUTE_VALUE.NUMERIC_VALUE", new Integer(0));
                    tMap.addForeignKey(
                "SCARAB_ISSUE_ATTRIBUTE_VALUE.OPTION_ID", new Integer(0) , "SCARAB_ATTRIBUTE_OPTION" ,
                "OPTION_ID");
                    tMap.addForeignKey(
                "SCARAB_ISSUE_ATTRIBUTE_VALUE.USER_ID", new Integer(0) , "TURBINE_USER" ,
                "USER_ID");
                    tMap.addColumn("SCARAB_ISSUE_ATTRIBUTE_VALUE.VALUE", "");
                    tMap.addColumn("SCARAB_ISSUE_ATTRIBUTE_VALUE.DELETED", new Integer(0));
          }
}
