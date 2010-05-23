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
public class AttributeGroupMapBuilder implements MapBuilder
{
    /**
     * The name of this class
     */
    public static final String CLASS_NAME =
        "org.tigris.scarab.om.map.AttributeGroupMapBuilder";

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

        dbMap.addTable("SCARAB_ATTRIBUTE_GROUP");
        TableMap tMap = dbMap.getTable("SCARAB_ATTRIBUTE_GROUP");

        tMap.setPrimaryKeyMethod(TableMap.ID_BROKER);

        tMap.setPrimaryKeyMethodInfo(tMap.getName());

              tMap.addPrimaryKey("SCARAB_ATTRIBUTE_GROUP.ATTRIBUTE_GROUP_ID", new Integer(0));
                    tMap.addColumn("SCARAB_ATTRIBUTE_GROUP.NAME", "");
                    tMap.addColumn("SCARAB_ATTRIBUTE_GROUP.DESCRIPTION", "");
                    tMap.addForeignKey(
                "SCARAB_ATTRIBUTE_GROUP.MODULE_ID", new Integer(0) , "SCARAB_MODULE" ,
                "MODULE_ID");
                    tMap.addForeignKey(
                "SCARAB_ATTRIBUTE_GROUP.ISSUE_TYPE_ID", new Integer(0) , "SCARAB_ISSUE_TYPE" ,
                "ISSUE_TYPE_ID");
                    tMap.addColumn("SCARAB_ATTRIBUTE_GROUP.ACTIVE", new Integer(0));
                    tMap.addColumn("SCARAB_ATTRIBUTE_GROUP.DEDUPE", new Integer(0));
                    tMap.addColumn("SCARAB_ATTRIBUTE_GROUP.PREFERRED_ORDER", new Integer(0));
          }
}
