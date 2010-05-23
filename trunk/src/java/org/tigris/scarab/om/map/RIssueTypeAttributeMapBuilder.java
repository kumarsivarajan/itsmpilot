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
public class RIssueTypeAttributeMapBuilder implements MapBuilder
{
    /**
     * The name of this class
     */
    public static final String CLASS_NAME =
        "org.tigris.scarab.om.map.RIssueTypeAttributeMapBuilder";

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

        dbMap.addTable("SCARAB_R_ISSUETYPE_ATTRIBUTE");
        TableMap tMap = dbMap.getTable("SCARAB_R_ISSUETYPE_ATTRIBUTE");

        tMap.setPrimaryKeyMethod("none");


              tMap.addForeignPrimaryKey(
                "SCARAB_R_ISSUETYPE_ATTRIBUTE.ATTRIBUTE_ID", new Integer(0) , "SCARAB_ATTRIBUTE" ,
                "ATTRIBUTE_ID");
                    tMap.addForeignPrimaryKey(
                "SCARAB_R_ISSUETYPE_ATTRIBUTE.ISSUE_TYPE_ID", new Integer(0) , "SCARAB_ISSUE_TYPE" ,
                "ISSUE_TYPE_ID");
                    tMap.addColumn("SCARAB_R_ISSUETYPE_ATTRIBUTE.ACTIVE", new Integer(0));
                    tMap.addColumn("SCARAB_R_ISSUETYPE_ATTRIBUTE.REQUIRED", new Integer(0));
                    tMap.addColumn("SCARAB_R_ISSUETYPE_ATTRIBUTE.PREFERRED_ORDER", new Integer(0));
                    tMap.addColumn("SCARAB_R_ISSUETYPE_ATTRIBUTE.QUICK_SEARCH", new Integer(0));
                    tMap.addColumn("SCARAB_R_ISSUETYPE_ATTRIBUTE.DEFAULT_TEXT_FLAG", new Integer(0));
                    tMap.addColumn("SCARAB_R_ISSUETYPE_ATTRIBUTE.LOCKED", new Integer(0));
          }
}
