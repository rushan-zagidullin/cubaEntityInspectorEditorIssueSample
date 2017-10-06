-- begin ENTITYINSPECTOR_FIRST_ISSUE_A
create table ENTITYINSPECTOR_FIRST_ISSUE_A (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    primary key (ID)
)^
-- end ENTITYINSPECTOR_FIRST_ISSUE_A
-- begin ENTITYINSPECTOR_FIRST_ISSUE_B
create table ENTITYINSPECTOR_FIRST_ISSUE_B (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_ISSUE_A_ID varchar(36),
    USER_ID varchar(36),
    --
    primary key (ID)
)^
-- end ENTITYINSPECTOR_FIRST_ISSUE_B
-- begin ENTITYINSPECTOR_SECOND_ISSUE
create table ENTITYINSPECTOR_SECOND_ISSUE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    USER_ID varchar(36),
    --
    primary key (ID)
)^
-- end ENTITYINSPECTOR_SECOND_ISSUE
