package com._3_algorithm._1_sort._6_quick_sort.code.SortClass;

public class BubbleSort1<E  extends Comparable<E>> extends Sort {
    @Override
    protected void sort() {
        for (int end = array.length - 1; end > 0; end--) {
            for (int begin = 1; begin <= end ; begin++) {
                if (cmp(begin,begin - 1) < 0) {
                    swap(begin,begin - 1);
                }
            }
        }
    }
}
