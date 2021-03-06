package com._3_algorithm._1_sort._9_radix_sort.code.SortClass.Cmp;

public class InsertionSort2<E  extends Comparable<E>> extends Sort<E> {
        protected void sort() {
        for (int begin = 1; begin < array.length; begin++) {
            int cur = begin;
            E element = array[cur];
            while (cur >0 && cmp(element,array[cur - 1]) < 0) {
                array[cur] = array[cur - 1];
                cur--;
            }
            array[cur] = element;
        }
    }
}
