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
public class ConditionMapBuilder implements MapBuilder
{
    /**
     * The name of this class
     */
    public static final String CLASS_NAME =
        "org.tigris.scarab.om.map.ConditionMapBuilder";

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

        dbMap.addTable("SCARAB_CONDITION");
        TableMap tMap = dbMap.getTable("SCARAB_CONDITION");

        tMap.setPrimaryKeyMethod(TableMap.ID_BROKER);

        tMap.setPrimaryKeyMethodInfo(tMap.getName());

              tMap.addPrimaryKey("SCARAB_CONDITION.CONDITION_ID", new Long(0));
                    tMap.addForeignKey(
                "SCARAB_CONDITION.TRANSITION_ID", new Integer(0) , "SCARAB_TRANSITION" ,
                "TRANSITION_ID");
                    tMap.addForeignKey(
                "SCARAB_CONDITION.MODULE_ID", new Integer(0) , "SCARAB_R_MODULE_ATTRIBUTE" ,
                "MODULE_ID");
                    tMap.addForeignKey(
                "SCARAB_CONDITION.ISSUE_TYPE_ID", new Integer(0) , "SCARAB_R_MODULE_ATTRIBUTE" ,
                "ISSUE_TYPE_ID");
                    tMap.addForeignKey(
                "SCARAB_CONDITION.ATTRIBUTE_ID", new Integer(0) , "SCARAB_R_MODULE_ATTRIBUTE" ,
                "ATTRIBUTE_ID");
                    tMap.addForeignKey(
                "SCARAB_CONDITION.OPTION_ID", new Integer(0) , "SCARAB_ATTRIBUTE_OPTION" ,
                "OPTION_ID");
          }
}
