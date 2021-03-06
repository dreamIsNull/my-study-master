package com._1_list._4_circleLinked.code.test;


import com._1_list._4_circleLinked.code.circle.CircleLinkedList;
import com._1_list._4_circleLinked.code.List;

/**
 * 测试类
 * @author : Mr-Z
 * @date : 2020/10/13 15:25
 */
public class LinkedListDemo {


    public static void main(String[] args) {
//        testList(new SingleCircleLinkedList<>()); //测试单向循环链表
//        testList(new CirleLinkedList<>());//测试双向循环链表
        josephus();//约瑟夫问题
    }

    static void testList(List <Integer> list) {
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);

        list.add(0, 55); // [55, 11, 22, 33, 44]
        list.add(2, 66); // [55, 11, 66, 22, 33, 44]
        list.add(list.size(), 77); // [55, 11, 66, 22, 33, 44, 77]

        list.remove(0); // [11, 66, 22, 33, 44, 77]
        list.remove(2); // [11, 66, 33, 44, 77]
        list.remove(list.size()-1); // [11, 66, 33, 44]

        Asserts.test(list.indexOf(44) == 3);
        Asserts.test(list.indexOf(22) == List.ELEMENT_NOT_FOUND);
        Asserts.test(list.contains(33));
        Asserts.test(list.get(0) == 11);
        Asserts.test(list.get(1) == 66);
        Asserts.test(list.get(list.size()-1) == 44);

        System.out.println(list);
    }

    static void josephus() {
        CircleLinkedList <Integer> list = new CircleLinkedList <>();
        for (int i = 1; i <= 8; i++) {
            list.add(i);
        }
        list.reset();//指向头节点
        while (!list.isEmpty()) {
            list.next();
            list.next();
            System.out.println(list.remove());
        }
    }


}




