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
public class ModificationMapBuilder implements MapBuilder
{
    /**
     * The name of this class
     */
    public static final String CLASS_NAME =
        "org.tigris.scarab.om.map.ModificationMapBuilder";

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

        dbMap.addTable("SCARAB_MODIFICATION");
        TableMap tMap = dbMap.getTable("SCARAB_MODIFICATION");

        tMap.setPrimaryKeyMethod(TableMap.ID_BROKER);

        tMap.setPrimaryKeyMethodInfo(tMap.getName());

              tMap.addPrimaryKey("SCARAB_MODIFICATION.TABLE_ID", new Integer(0));
                    tMap.addPrimaryKey("SCARAB_MODIFICATION.COLUMN_ID", new Integer(0));
                    tMap.addColumn("SCARAB_MODIFICATION.MODIFIED_BY", new Integer(0));
                    tMap.addColumn("SCARAB_MODIFICATION.CREATED_BY", new Integer(0));
                    tMap.addColumn("SCARAB_MODIFICATION.MODIFIED_DATE", new Date());
                    tMap.addColumn("SCARAB_MODIFICATION.CREATED_DATE", new Date());
          }
}
