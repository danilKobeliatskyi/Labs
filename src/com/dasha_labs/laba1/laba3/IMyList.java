package com.dasha_labs.laba1.laba3;

import java.util.Iterator;

public interface IMyList<E> extends Iterator {
    void add(E e);
    void clear();
    boolean remove(int index);
    Object[] toArray();
    int size();
    boolean contains(E o);
}
