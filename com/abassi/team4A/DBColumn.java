package com.abassi.team4A;

/**
 * Created by robin on 11/25/2016.
 */
public class DBColumn {
    private String TableName;
    private String ColumnName;

    DBColumn(String tbl, String col) {
        TableName = tbl;
        ColumnName = col;
    }

    public String getTableName() {
        return TableName;
    }

    public String getColumnName() {
        return ColumnName;
    }
}
