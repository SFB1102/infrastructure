/*
 * This file is generated by jOOQ.
 */
package de.saar.minecraft.matchmaker.db.tables;


import de.saar.minecraft.matchmaker.db.Indexes;
import de.saar.minecraft.matchmaker.db.Keys;
import de.saar.minecraft.matchmaker.db.Minecraft;
import de.saar.minecraft.matchmaker.db.enums.GameLogsDirection;
import de.saar.minecraft.matchmaker.db.tables.records.GameLogsRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.12"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GameLogs extends TableImpl<GameLogsRecord> {

    private static final long serialVersionUID = -1024262880;

    /**
     * The reference instance of <code>minecraft.game_logs</code>
     */
    public static final GameLogs GAME_LOGS = new GameLogs();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GameLogsRecord> getRecordType() {
        return GameLogsRecord.class;
    }

    /**
     * The column <code>minecraft.game_logs.id</code>.
     */
    public final TableField<GameLogsRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>minecraft.game_logs.gameid</code>.
     */
    public final TableField<GameLogsRecord, Integer> GAMEID = createField("gameid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>minecraft.game_logs.direction</code>.
     */
    public final TableField<GameLogsRecord, GameLogsDirection> DIRECTION = createField("direction", org.jooq.impl.SQLDataType.VARCHAR(15).asEnumDataType(de.saar.minecraft.matchmaker.db.enums.GameLogsDirection.class), this, "");

    /**
     * The column <code>minecraft.game_logs.message_type</code>.
     */
    public final TableField<GameLogsRecord, String> MESSAGE_TYPE = createField("message_type", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>minecraft.game_logs.message</code>.
     */
    public final TableField<GameLogsRecord, String> MESSAGE = createField("message", org.jooq.impl.SQLDataType.VARCHAR(500), this, "");

    /**
     * The column <code>minecraft.game_logs.timestamp</code>.
     */
    public final TableField<GameLogsRecord, Timestamp> TIMESTAMP = createField("timestamp", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>minecraft.game_logs</code> table reference
     */
    public GameLogs() {
        this(DSL.name("game_logs"), null);
    }

    /**
     * Create an aliased <code>minecraft.game_logs</code> table reference
     */
    public GameLogs(String alias) {
        this(DSL.name(alias), GAME_LOGS);
    }

    /**
     * Create an aliased <code>minecraft.game_logs</code> table reference
     */
    public GameLogs(Name alias) {
        this(alias, GAME_LOGS);
    }

    private GameLogs(Name alias, Table<GameLogsRecord> aliased) {
        this(alias, aliased, null);
    }

    private GameLogs(Name alias, Table<GameLogsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GameLogs(Table<O> child, ForeignKey<O, GameLogsRecord> key) {
        super(child, key, GAME_LOGS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Minecraft.MINECRAFT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.GAME_LOGS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<GameLogsRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_GAME_LOGS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GameLogsRecord> getPrimaryKey() {
        return Keys.KEY_GAME_LOGS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GameLogsRecord>> getKeys() {
        return Arrays.<UniqueKey<GameLogsRecord>>asList(Keys.KEY_GAME_LOGS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GameLogs as(String alias) {
        return new GameLogs(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GameLogs as(Name alias) {
        return new GameLogs(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GameLogs rename(String name) {
        return new GameLogs(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GameLogs rename(Name name) {
        return new GameLogs(name, null);
    }
}
