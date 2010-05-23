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
public class ScarabModuleMapBuilder implements MapBuilder
{
    /**
     * The name of this class
     */
    public static final String CLASS_NAME =
        "org.tigris.scarab.om.map.ScarabModuleMapBuilder";

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

        dbMap.addTable("SCARAB_MODULE");
        TableMap tMap = dbMap.getTable("SCARAB_MODULE");

        tMap.setPrimaryKeyMethod(TableMap.ID_BROKER);

        tMap.setPrimaryKeyMethodInfo(tMap.getName());

              tMap.addPrimaryKey("SCARAB_MODULE.MODULE_ID", new Integer(0));
                    tMap.addColumn("SCARAB_MODULE.MODULE_NAME", "");
                    tMap.addColumn("SCARAB_MODULE.DOMAIN", "");
                    tMap.addColumn("SCARAB_MODULE.MODULE_CODE", "");
                    tMap.addColumn("SCARAB_MODULE.MODULE_DESCRIPTION", "");
                    tMap.addColumn("SCARAB_MODULE.MODULE_URL", "");
                    tMap.addColumn("SCARAB_MODULE.ARCHIVE_EMAIL", "");
                    tMap.addForeignKey(
                "SCARAB_MODULE.PARENT_ID", new Integer(0) , "SCARAB_MODULE" ,
                "MODULE_ID");
                    tMap.addForeignKey(
                "SCARAB_MODULE.OWNER_ID", new Integer(0) , "TURBINE_USER" ,
                "USER_ID");
                    tMap.addForeignKey(
                "SCARAB_MODULE.QA_CONTACT_ID", new Integer(0) , "TURBINE_USER" ,
                "USER_ID");
                    tMap.addColumn("SCARAB_MODULE.DELETED", new Integer(0));
                    tMap.addColumn("SCARAB_MODULE.LOCKED", new Integer(0));
                    tMap.addColumn("SCARAB_MODULE.CLASS_KEY", new Integer(0));
          }
}
