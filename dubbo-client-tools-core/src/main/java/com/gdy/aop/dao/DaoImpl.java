package com.gdy.aop.dao;

public class DaoImpl implements Dao {

    @Override
    public void select() {
        System.out.println("Enter DaoImpl.select()");
    }

    @Override
    public void insert() {
        System.out.println("Enter DaoImpl.insert()");
    }
    
}