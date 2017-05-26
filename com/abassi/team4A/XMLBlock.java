package com.abassi.team4A;

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides a definition for an XML Block (Definition 3) read by the parser.
 *
 * This class can store columns and other XML blocks; XML blocks must be read from the SQLCommand object recursively.
 */
public class XMLBlock {

    private String blockName;
    private Boolean Compress = false;
    private List<Object> Columns = new ArrayList<Object>();
    //private List<XMLBlock> XMLBlocks = new ArrayList<XMLBlock>();


    void setBlockName(String name) {
        blockName = name;
    }

    /*
    public List<XMLBlock> getXMLBlocks() {
        return XMLBlocks;
    }
    */

    public String getBlockName() {
        return blockName;
    }

    public List<Object> getColumns() {
        return Columns;
    }

    public Boolean getCompress() {
        return Compress;
    }

    void setCompress(Boolean comp) {
        Compress = comp;
    }

}