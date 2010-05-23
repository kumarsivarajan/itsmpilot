--
-- b20-b21 Migration.
--
-- Creates new tables for the notification system.
--
 
SET FOREIGN_KEY_CHECKS = 0; 

--
-- SCARAB_NOTIFICATION_STATUS
--

CREATE TABLE SCARAB_NOTIFICATION_STATUS
(
    ACTIVITY_ID BIGINT NOT NULL,
    CREATOR_ID INTEGER NOT NULL,
    RECEIVER_ID INTEGER NOT NULL,
    STATUS INTEGER NOT NULL,
    CREATION_DATE DATETIME,
    CHANGE_DATE DATETIME,
    STATUS_COMMENT VARCHAR(255),
    PRIMARY KEY(ACTIVITY_ID,CREATOR_ID,RECEIVER_ID),
    FOREIGN KEY (CREATOR_ID) REFERENCES TURBINE_USER (USER_ID),
--    [SCB1793] commented out the next fk, 
--    because in b21 a nonexistent user_id is used to 
--    save a notification for the archive emails
--    FOREIGN KEY (RECEIVER_ID) REFERENCES TURBINE_USER (USER_ID),
    FOREIGN KEY (ACTIVITY_ID) REFERENCES SCARAB_ACTIVITY (ACTIVITY_ID),
    INDEX IX_NOTIF_STATUS (STATUS)
);

--
-- SCARAB_NOTIFICATION_FILTER
--

CREATE TABLE SCARAB_NOTIFICATION_FILTER
(
    MODULE_ID INTEGER NOT NULL,
    USER_ID INTEGER NOT NULL,
    ACTIVITY_TYPE VARCHAR(30) NOT NULL,
    MANAGER_ID INTEGER default 0 NOT NULL,
    FILTER_STATE INTEGER(1) default 0 NOT NULL,
    SEND_SELF INTEGER(1) default 0 NOT NULL,
    SEND_FAILURES INTEGER(1) default 0 NOT NULL,
    PRIMARY KEY(MODULE_ID,USER_ID,ACTIVITY_TYPE,MANAGER_ID),
    FOREIGN KEY (USER_ID) REFERENCES TURBINE_USER (USER_ID),
    FOREIGN KEY (MODULE_ID) REFERENCES SCARAB_MODULE (MODULE_ID)
);

--
-- SCARAB_DEFAULT_NOTIFICATION_FILTER
--

CREATE TABLE SCARAB_DEFAULT_NOTIFICATION_FILTER (
  MODULE_ID INTEGER NOT NULL,
  ROLE_ID INTEGER NOT NULL,
  ACTIVITY_TYPE varchar(30) NOT NULL,
  MANAGER_ID INTEGER NOT NULL,
  FILTER_STATE INTEGER(1) NOT NULL default 0,
  MODIFYABlE INTEGER(1) NOT NULL default 1,
  PRIMARY KEY  (MODULE_ID,ROLE_ID,ACTIVITY_TYPE,MANAGER_ID)
);

SET FOREIGN_KEY_CHECKS = 1; 
