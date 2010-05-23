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
public class IssueMapBuilder implements MapBuilder
{
    /**
     * The name of this class
     */
    public static final String CLASS_NAME =
        "org.tigris.scarab.om.map.IssueMapBuilder";

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

        dbMap.addTable("SCARAB_ISSUE");
        TableMap tMap = dbMap.getTable("SCARAB_ISSUE");

        tMap.setPrimaryKeyMethod(TableMap.ID_BROKER);

        tMap.setPrimaryKeyMethodInfo(tMap.getName());

              tMap.addPrimaryKey("SCARAB_ISSUE.ISSUE_ID", new Long(0));
                    tMap.addColumn("SCARAB_ISSUE.ID_PREFIX", "");
                    tMap.addColumn("SCARAB_ISSUE.ID_COUNT", new Integer(0));
                    tMap.addColumn("SCARAB_ISSUE.ID_DOMAIN", "");
                    tMap.addForeignKey(
                "SCARAB_ISSUE.TYPE_ID", new Integer(0) , "SCARAB_ISSUE_TYPE" ,
                "ISSUE_TYPE_ID");
                    tMap.addForeignKey(
                "SCARAB_ISSUE.MODULE_ID", new Integer(0) , "SCARAB_MODULE" ,
                "MODULE_ID");
                    tMap.addForeignKey(
                "SCARAB_ISSUE.CREATED_TRANS_ID", new Long(0) , "SCARAB_TRANSACTION" ,
                "TRANSACTION_ID");
                    tMap.addForeignKey(
                "SCARAB_ISSUE.LAST_TRANS_ID", new Long(0) , "SCARAB_TRANSACTION" ,
                "TRANSACTION_ID");
                    tMap.addColumn("SCARAB_ISSUE.DELETED", new Integer(0));
                    tMap.addColumn("SCARAB_ISSUE.MOVED", new Integer(0));
          }
}
