package com._3_algorithm._1_sort._8_counting_sort.code.SortClass.Cmp;

public class HeapSort<E  extends Comparable<E>> extends Sort<E> {
private int heapSize;
    @Override
    protected void sort() {
        heapSize = array.length;
        //原地建堆
        for (int i = ((heapSize >> 1) - 1); i >= 0; i--) {
            siftDown(i);
        }
        while (heapSize > 1) {
            //交换堆顶与堆尾部元素进行交换
            swap(0,--heapSize);
            //对0位置，进行siftDown
            siftDown(0);
        }
    }

    private void siftDown(int index) {
        E element = array[index];
        int half = heapSize >> 1;
        while (index < half){
            int childIndex = (index << 1) +1;
            E child = array[childIndex];
            int rightIndex = childIndex + 1;
            if (rightIndex < heapSize && cmp(array[rightIndex],child) > 0) {
                child = array[childIndex = rightIndex];
            }
            if (cmp(element,child) > 0) break;
            array[index] = child;
            index = childIndex;
        }
        array[index] = element;
    }

}
