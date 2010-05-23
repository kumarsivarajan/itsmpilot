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
public class IssueTemplateInfoMapBuilder implements MapBuilder
{
    /**
     * The name of this class
     */
    public static final String CLASS_NAME =
        "org.tigris.scarab.om.map.IssueTemplateInfoMapBuilder";

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

        dbMap.addTable("SCARAB_ISSUE_TEMPLATE_INFO");
        TableMap tMap = dbMap.getTable("SCARAB_ISSUE_TEMPLATE_INFO");

        tMap.setPrimaryKeyMethod("none");


              tMap.addForeignPrimaryKey(
                "SCARAB_ISSUE_TEMPLATE_INFO.ISSUE_ID", new Long(0) , "SCARAB_ISSUE" ,
                "ISSUE_ID");
                    tMap.addColumn("SCARAB_ISSUE_TEMPLATE_INFO.NAME", "");
                    tMap.addColumn("SCARAB_ISSUE_TEMPLATE_INFO.DESCRIPTION", "");
                    tMap.addColumn("SCARAB_ISSUE_TEMPLATE_INFO.APPROVED", new Integer(0));
                    tMap.addForeignKey(
                "SCARAB_ISSUE_TEMPLATE_INFO.SCOPE_ID", new Integer(0) , "SCARAB_SCOPE" ,
                "SCOPE_ID");
          }
}
