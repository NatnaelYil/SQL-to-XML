package com.abassi.team4A;

/**
 * This class provides a definition for column data read by the parser.
 */
public class SQLColumn {
    private String columnName;
    private String aliasName;
    private Boolean Compress = false;

    SQLColumn() {
        aliasName = null;
    }

    public Boolean getCompress() {
        return Compress;
    }

    void setCompress(Boolean comp) {
        Compress = comp;
    }

    public String getColumnName() {
        return columnName;
    }

    public String getAliasName() {
        return aliasName;
    }

    public void setColumnName(String col) {
        columnName = col;
    }

    void setAliasName(String ali) {
        aliasName = ali;
    }

}