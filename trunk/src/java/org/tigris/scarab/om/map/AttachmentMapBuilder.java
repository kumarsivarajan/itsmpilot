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
public class AttachmentMapBuilder implements MapBuilder
{
    /**
     * The name of this class
     */
    public static final String CLASS_NAME =
        "org.tigris.scarab.om.map.AttachmentMapBuilder";

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

        dbMap.addTable("SCARAB_ATTACHMENT");
        TableMap tMap = dbMap.getTable("SCARAB_ATTACHMENT");

        tMap.setPrimaryKeyMethod(TableMap.ID_BROKER);

        tMap.setPrimaryKeyMethodInfo(tMap.getName());

              tMap.addPrimaryKey("SCARAB_ATTACHMENT.ATTACHMENT_ID", new Long(0));
                    tMap.addForeignKey(
                "SCARAB_ATTACHMENT.ISSUE_ID", new Long(0) , "SCARAB_ISSUE" ,
                "ISSUE_ID");
                    tMap.addForeignKey(
                "SCARAB_ATTACHMENT.ATTACHMENT_TYPE_ID", new Integer(0) , "SCARAB_ATTACHMENT_TYPE" ,
                "ATTACHMENT_TYPE_ID");
                    tMap.addColumn("SCARAB_ATTACHMENT.ATTACHMENT_NAME", "");
                    tMap.addColumn("SCARAB_ATTACHMENT.ATTACHMENT_DATA", "");
                    tMap.addColumn("SCARAB_ATTACHMENT.ATTACHMENT_FILE_PATH", "");
                    tMap.addColumn("SCARAB_ATTACHMENT.ATTACHMENT_MIME_TYPE", "");
                    tMap.addForeignKey(
                "SCARAB_ATTACHMENT.MODIFIED_BY", new Integer(0) , "TURBINE_USER" ,
                "USER_ID");
                    tMap.addForeignKey(
                "SCARAB_ATTACHMENT.CREATED_BY", new Integer(0) , "TURBINE_USER" ,
                "USER_ID");
                    tMap.addColumn("SCARAB_ATTACHMENT.MODIFIED_DATE", new Date());
                    tMap.addColumn("SCARAB_ATTACHMENT.CREATED_DATE", new Date());
                    tMap.addColumn("SCARAB_ATTACHMENT.DELETED", new Integer(0));
          }
}
