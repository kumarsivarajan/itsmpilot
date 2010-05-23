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
public class QueryMapBuilder implements MapBuilder
{
    /**
     * The name of this class
     */
    public static final String CLASS_NAME =
        "org.tigris.scarab.om.map.QueryMapBuilder";

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

        dbMap.addTable("SCARAB_QUERY");
        TableMap tMap = dbMap.getTable("SCARAB_QUERY");

        tMap.setPrimaryKeyMethod(TableMap.ID_BROKER);

        tMap.setPrimaryKeyMethodInfo(tMap.getName());

              tMap.addPrimaryKey("SCARAB_QUERY.QUERY_ID", new Long(0));
                    tMap.addForeignKey(
                "SCARAB_QUERY.USER_ID", new Integer(0) , "TURBINE_USER" ,
                "USER_ID");
                    tMap.addColumn("SCARAB_QUERY.NAME", "");
                    tMap.addColumn("SCARAB_QUERY.DESCRIPTION", "");
                    tMap.addColumn("SCARAB_QUERY.VALUE", "");
                    tMap.addForeignKey(
                "SCARAB_QUERY.SCOPE_ID", new Integer(0) , "SCARAB_SCOPE" ,
                "SCOPE_ID");
                    tMap.addForeignKey(
                "SCARAB_QUERY.ISSUE_TYPE_ID", new Integer(0) , "SCARAB_ISSUE_TYPE" ,
                "ISSUE_TYPE_ID");
                    tMap.addForeignKey(
                "SCARAB_QUERY.MODULE_ID", new Integer(0) , "SCARAB_MODULE" ,
                "MODULE_ID");
                    tMap.addForeignKey(
                "SCARAB_QUERY.LIST_ID", new Long(0) , "SCARAB_MIT_LIST" ,
                "LIST_ID");
                    tMap.addColumn("SCARAB_QUERY.DELETED", new Integer(0));
                    tMap.addColumn("SCARAB_QUERY.APPROVED", new Integer(0));
                    tMap.addColumn("SCARAB_QUERY.CREATED_DATE", new Date());
                    tMap.addForeignKey(
                "SCARAB_QUERY.SUBSCRIPTION_FREQUENCY_ID", new Integer(0) , "SCARAB_FREQUENCY" ,
                "FREQUENCY_ID");
                    tMap.addColumn("SCARAB_QUERY.HOME_PAGE", new Integer(0));
                    tMap.addColumn("SCARAB_QUERY.PREFERRED_ORDER", new Integer(0));
          }
}
