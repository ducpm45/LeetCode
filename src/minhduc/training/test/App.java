package minhduc.training.test;

import java.util.Arrays;

import minhduc.training.leetcode._912_Sort_an_Array;


public class App {
	public static void main(String[] args) {
		_912_Sort_an_Array test = new _912_Sort_an_Array();
		int[] a = { 5, 7, 11, 3, 9, 2, 6 };
		test.sortArray(a);
		System.out.println(Arrays.toString(test.sortArray(a)));
	}

}
