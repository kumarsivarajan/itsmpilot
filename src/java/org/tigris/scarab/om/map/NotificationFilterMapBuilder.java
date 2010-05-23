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
public class NotificationFilterMapBuilder implements MapBuilder
{
    /**
     * The name of this class
     */
    public static final String CLASS_NAME =
        "org.tigris.scarab.om.map.NotificationFilterMapBuilder";

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

        dbMap.addTable("SCARAB_NOTIFICATION_FILTER");
        TableMap tMap = dbMap.getTable("SCARAB_NOTIFICATION_FILTER");

        tMap.setPrimaryKeyMethod("none");


              tMap.addForeignPrimaryKey(
                "SCARAB_NOTIFICATION_FILTER.MODULE_ID", new Integer(0) , "SCARAB_MODULE" ,
                "MODULE_ID");
                    tMap.addForeignPrimaryKey(
                "SCARAB_NOTIFICATION_FILTER.USER_ID", new Integer(0) , "TURBINE_USER" ,
                "USER_ID");
                    tMap.addPrimaryKey("SCARAB_NOTIFICATION_FILTER.ACTIVITY_TYPE", "");
                    tMap.addPrimaryKey("SCARAB_NOTIFICATION_FILTER.MANAGER_ID", new Integer(0));
                    tMap.addColumn("SCARAB_NOTIFICATION_FILTER.FILTER_STATE", new Integer(0));
                    tMap.addColumn("SCARAB_NOTIFICATION_FILTER.SEND_SELF", new Integer(0));
                    tMap.addColumn("SCARAB_NOTIFICATION_FILTER.SEND_FAILURES", new Integer(0));
          }
}
