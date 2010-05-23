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
public class ActivityMapBuilder implements MapBuilder
{
    /**
     * The name of this class
     */
    public static final String CLASS_NAME =
        "org.tigris.scarab.om.map.ActivityMapBuilder";

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

        dbMap.addTable("SCARAB_ACTIVITY");
        TableMap tMap = dbMap.getTable("SCARAB_ACTIVITY");

        tMap.setPrimaryKeyMethod(TableMap.ID_BROKER);

        tMap.setPrimaryKeyMethodInfo(tMap.getName());

              tMap.addPrimaryKey("SCARAB_ACTIVITY.ACTIVITY_ID", new Long(0));
                    tMap.addForeignKey(
                "SCARAB_ACTIVITY.ISSUE_ID", new Long(0) , "SCARAB_ISSUE" ,
                "ISSUE_ID");
                    tMap.addForeignKey(
                "SCARAB_ACTIVITY.ATTRIBUTE_ID", new Integer(0) , "SCARAB_ATTRIBUTE" ,
                "ATTRIBUTE_ID");
                    tMap.addForeignKey(
                "SCARAB_ACTIVITY.TRANSACTION_ID", new Long(0) , "SCARAB_TRANSACTION" ,
                "TRANSACTION_ID");
                    tMap.addColumn("SCARAB_ACTIVITY.OLD_NUMERIC_VALUE", new Integer(0));
                    tMap.addColumn("SCARAB_ACTIVITY.NEW_NUMERIC_VALUE", new Integer(0));
                    tMap.addForeignKey(
                "SCARAB_ACTIVITY.OLD_USER_ID", new Integer(0) , "TURBINE_USER" ,
                "USER_ID");
                    tMap.addForeignKey(
                "SCARAB_ACTIVITY.NEW_USER_ID", new Integer(0) , "TURBINE_USER" ,
                "USER_ID");
                    tMap.addForeignKey(
                "SCARAB_ACTIVITY.OLD_OPTION_ID", new Integer(0) , "SCARAB_ATTRIBUTE_OPTION" ,
                "OPTION_ID");
                    tMap.addForeignKey(
                "SCARAB_ACTIVITY.NEW_OPTION_ID", new Integer(0) , "SCARAB_ATTRIBUTE_OPTION" ,
                "OPTION_ID");
                    tMap.addColumn("SCARAB_ACTIVITY.OLD_VALUE", "");
                    tMap.addColumn("SCARAB_ACTIVITY.NEW_VALUE", "");
                    tMap.addForeignKey(
                "SCARAB_ACTIVITY.DEPEND_ID", new Integer(0) , "SCARAB_DEPEND" ,
                "DEPEND_ID");
                    tMap.addColumn("SCARAB_ACTIVITY.DESCRIPTION", "");
                    tMap.addColumn("SCARAB_ACTIVITY.END_DATE", new Date());
                    tMap.addForeignKey(
                "SCARAB_ACTIVITY.ATTACHMENT_ID", new Long(0) , "SCARAB_ATTACHMENT" ,
                "ATTACHMENT_ID");
                    tMap.addColumn("SCARAB_ACTIVITY.ACTIVITY_TYPE", "");
          }
}
