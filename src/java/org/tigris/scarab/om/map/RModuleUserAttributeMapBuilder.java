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
public class RModuleUserAttributeMapBuilder implements MapBuilder
{
    /**
     * The name of this class
     */
    public static final String CLASS_NAME =
        "org.tigris.scarab.om.map.RModuleUserAttributeMapBuilder";

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

        dbMap.addTable("SCARAB_R_MODULE_USER_ATTRIBUTE");
        TableMap tMap = dbMap.getTable("SCARAB_R_MODULE_USER_ATTRIBUTE");

        tMap.setPrimaryKeyMethod(TableMap.ID_BROKER);

        tMap.setPrimaryKeyMethodInfo(tMap.getName());

              tMap.addPrimaryKey("SCARAB_R_MODULE_USER_ATTRIBUTE.RMUA_ID", new Long(0));
                    tMap.addForeignKey(
                "SCARAB_R_MODULE_USER_ATTRIBUTE.LIST_ID", new Long(0) , "SCARAB_MIT_LIST" ,
                "LIST_ID");
                    tMap.addForeignKey(
                "SCARAB_R_MODULE_USER_ATTRIBUTE.MODULE_ID", new Integer(0) , "SCARAB_MODULE" ,
                "MODULE_ID");
                    tMap.addForeignKey(
                "SCARAB_R_MODULE_USER_ATTRIBUTE.USER_ID", new Integer(0) , "TURBINE_USER" ,
                "USER_ID");
                    tMap.addForeignKey(
                "SCARAB_R_MODULE_USER_ATTRIBUTE.ISSUE_TYPE_ID", new Integer(0) , "SCARAB_ISSUE_TYPE" ,
                "ISSUE_TYPE_ID");
                    tMap.addForeignKey(
                "SCARAB_R_MODULE_USER_ATTRIBUTE.ATTRIBUTE_ID", new Integer(0) , "SCARAB_ATTRIBUTE" ,
                "ATTRIBUTE_ID");
                    tMap.addColumn("SCARAB_R_MODULE_USER_ATTRIBUTE.INTERNAL_ATTRIBUTE", "");
                    tMap.addColumn("SCARAB_R_MODULE_USER_ATTRIBUTE.PREFERRED_ORDER", new Integer(0));
          }
}
