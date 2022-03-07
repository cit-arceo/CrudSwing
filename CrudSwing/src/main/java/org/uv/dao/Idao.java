package org.uv.dao;

import java.util.List;

/**
 *
 * @author citla
 */
public interface Idao <T>{
    public boolean insert(T t);
    public boolean delete(T t);
    public boolean update(T t);
    public T readOne(T t);
    public List<T> readAll();
}
