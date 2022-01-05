package minhduc.training.test;

import minhduc.training.leetcode._703_Kth_Largest_Element_in_a_Stream;


public class App {
	public static void main(String[] args) {
		int k = 3;
		int[] a = { 4, 5, 8, 2 };
		_703_Kth_Largest_Element_in_a_Stream test = new _703_Kth_Largest_Element_in_a_Stream(k, a);

		System.out.println(test.add(3));
		System.out.println(test.add(5));
		System.out.println(test.add(10));
		System.out.println(test.add(9));
		System.out.println(test.add(4));
	}

}
