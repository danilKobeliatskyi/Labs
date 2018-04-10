package com.dasha_labs.laba1.laba3;

import com.dasha_labs.laba1.laba2.TubeMonitor;

public class MyListImpl implements IMyList<TubeMonitor> {
    private final int INIT_SIZE = 16;
    private final int CUT_RATE = 4;
    private Object[] array = new Object[INIT_SIZE];
    private int pointer = 0;

    @Override
    public void add(TubeMonitor item) {
        if(pointer == array.length-1)
            resize(array.length*2);
        array[pointer++] = item;
    }

    @Override
    public void clear() {
        pointer = 0;
    }

    @Override
    public boolean remove(int index) {
        for (int i = index; i < pointer; i++)
            array[i] = array[i+1];
        array[pointer] = null;
        pointer--;
        if (array.length > INIT_SIZE && pointer < array.length / CUT_RATE)
            resize(array.length/2);
        return true;
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[pointer];
        for (int i = 0; i < result.length; i++) {
            result[i] = array[i];
            System.out.println(result[i]);
        }
        return result;
    }

    public TubeMonitor get(int index) {
        return (TubeMonitor) array[index];
    }

    @Override
    public int size() {
        return pointer;
    }

    @Override
    public boolean contains(TubeMonitor o) {
        for (int i = 0; i < pointer; i++)
            if (array[i].equals(o))
                System.out.println(true);
        else System.out.println(false);
        return false;
    }

    /*Вспомогательный метод для масштабирования.*/
    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }
}
