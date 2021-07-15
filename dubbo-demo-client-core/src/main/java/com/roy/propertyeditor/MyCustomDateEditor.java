package com.roy.propertyeditor;

import org.springframework.beans.propertyeditors.CustomDateEditor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class MyCustomDateEditor extends CustomDateEditor {
    public static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    public MyCustomDateEditor () {
        super(dateFormat, true);
    }
}
