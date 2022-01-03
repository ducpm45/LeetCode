package minhduc.training.leetcode;

import java.util.ArrayList;

public class _705_Design_HashSet {
	private ArrayList<Integer> myArr[];

	public _705_Design_HashSet() {
		myArr = new ArrayList[10000];
		for (int i = 0; i < myArr.length; i++) {
			myArr[i] = new ArrayList<>();
		}
	}

	private int hashFunction(int key) {
		return key % 10000;
	}

	public void add(int key) {
		int hashValue = hashFunction(key);
		var bucket = myArr[hashValue];
		bucket.add(key);
	}

	public void remove(int key) {
		int hashValue = hashFunction(key);
		var bucket = myArr[hashValue];
		int index;
		while ((index = bucket.indexOf(key)) >= 0) {
			bucket.remove(index);
		}
	}

	public boolean contains(int key) {
		int hashValue = hashFunction(key);
		var bucket = myArr[hashValue];
		return bucket.contains(key);
	}
}
