package com._1_list._4_circleLinked.code.test;

/**
 * 测试断言类
 * @author : Mr-Z
 * @date : 2020/10/13 15:29
 */
public class Asserts {
	public static void test(boolean value) {
		try {
			if (!value) {
				throw new Exception("测试未通过");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
