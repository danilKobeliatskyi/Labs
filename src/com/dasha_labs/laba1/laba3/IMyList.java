package com.dasha_labs.laba1.laba3;

public interface IMyList<E> extends Iterable {
    void add(E o);
    void clear();
    boolean remove(Object o);
    Object[] toArray();
    int size();
    boolean contains(E o);
}
