package com.dasha_labs.laba1.laba3;

import java.util.Iterator;

public interface IMyList<E> extends Iterable {
    void add(E e);
    void clear();
    boolean remove(Object o);
    Object[] toArray();
    int size();
    boolean contains(E o);
}
