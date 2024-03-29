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
public class UserPreferenceMapBuilder implements MapBuilder
{
    /**
     * The name of this class
     */
    public static final String CLASS_NAME =
        "org.tigris.scarab.om.map.UserPreferenceMapBuilder";

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

        dbMap.addTable("SCARAB_USER_PREFERENCE");
        TableMap tMap = dbMap.getTable("SCARAB_USER_PREFERENCE");

        tMap.setPrimaryKeyMethod("none");


              tMap.addForeignPrimaryKey(
                "SCARAB_USER_PREFERENCE.USER_ID", new Integer(0) , "TURBINE_USER" ,
                "USER_ID");
                    tMap.addColumn("SCARAB_USER_PREFERENCE.PASSWORD_EXPIRE", new Date());
                    tMap.addColumn("SCARAB_USER_PREFERENCE.ENTER_ISSUE_REDIRECT", new Integer(0));
                    tMap.addColumn("SCARAB_USER_PREFERENCE.HOME_PAGE", "");
                    tMap.addColumn("SCARAB_USER_PREFERENCE.LOCALE", "");
          }
}
