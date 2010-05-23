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
public class GlobalParameterMapBuilder implements MapBuilder
{
    /**
     * The name of this class
     */
    public static final String CLASS_NAME =
        "org.tigris.scarab.om.map.GlobalParameterMapBuilder";

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

        dbMap.addTable("SCARAB_GLOBAL_PARAMETER");
        TableMap tMap = dbMap.getTable("SCARAB_GLOBAL_PARAMETER");

        tMap.setPrimaryKeyMethod(TableMap.ID_BROKER);

        tMap.setPrimaryKeyMethodInfo(tMap.getName());

              tMap.addPrimaryKey("SCARAB_GLOBAL_PARAMETER.PARAMETER_ID", new Integer(0));
                    tMap.addColumn("SCARAB_GLOBAL_PARAMETER.NAME", "");
                    tMap.addColumn("SCARAB_GLOBAL_PARAMETER.VALUE", "");
                    tMap.addForeignKey(
                "SCARAB_GLOBAL_PARAMETER.MODULE_ID", new Integer(0) , "SCARAB_MODULE" ,
                "MODULE_ID");
          }
}
