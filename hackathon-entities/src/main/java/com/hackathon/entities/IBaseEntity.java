package com.ahlquist.commio.model;

public interface IBaseEntity<K> {

    public K getId();

    public Object setId(K id);

}
