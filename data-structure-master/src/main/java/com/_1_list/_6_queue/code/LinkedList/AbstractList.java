package com._1_list._6_queue.code.LinkedList;

/**
 * List抽象类
 *
 * @author : Mr-Z
 * @date : 2020/10/14 23:50
 */
public abstract class AbstractList<E> implements List <E> {
    /**
     * 保存当前数组的元素个数
     */
    protected int size;


    /**
     * 获取当前数组的元素个数
     *
     * @return 当前数组的元素个数
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * 判断当前数组是否为空
     *
     * @return 如果size == 0 则数组为空，否则不为空
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 判断数组中，是否包含某个元素，
     *
     * @return 包含，则返回true，不包含返回false
     */
    @Override
    public boolean contains(E element) {
        return this.indexOf(element) != ELEMENT_NOT_FOUND;
    }

    /**
     * 往数组中添加一个元素
     *
     * @param element 准备添加的元素
     */
    @Override
    public void add(E element) {
        //本质是往数组中最后一个元素后插入一个新的元素
        System.out.println("size == "+size);

        add(size, element);
    }

    /**
     * 封装异常信息
     *
     * @param index
     */
    protected void outOfBounds(int index) {
        throw new IndexOutOfBoundsException("Index:"+index+",Size:"+size);
    }

    /**
     * 检查范围(判断位置是否有效)
     *
     * @param index 检查的位置
     */
    protected void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            outOfBounds(index);
        }
    }

    /**
     * 检查范围:新增元素(判断位置是否有效)
     *
     * @param index 检查的位置
     */
    protected void rangeCheckForAdd(int index) {
        if (index < 0 || index > size) {
            outOfBounds(index);
        }
    }
}
