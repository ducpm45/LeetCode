package minhduc.training.leetcode;

import java.util.ArrayList;

public class _706_Design_HashMap {
	private class Data {
		int key;
		int value;

		Data(int key, int value) {
			this.key = key;
			this.value = value;
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Data) {
				return this.key == ((Data) obj).key;
			}
			return false;
		}
	}

	private ArrayList<Data> myArr[];

	public _706_Design_HashMap() {
		myArr = new ArrayList[1000];
		for (int i = 0; i < myArr.length; i++) {
			myArr[i] = new ArrayList<>();
		}
    }

	public int hashFunction(int key) {
		return key % 1000;
	}

	public void put(int key, int value) {
		int hashValue = hashFunction(key);
		var bucket = myArr[hashValue];
		Data newData = new Data(key, value);
		int index = bucket.indexOf(newData);
		if (index >= 0) {
			bucket.get(index).value = value;
		} else {
			bucket.add(newData);
		}
	}

	public int get(int key) {
		int hashValue = hashFunction(key);
		var bucket = myArr[hashValue];
		Data temp = new Data(key, 0);
		int index = bucket.indexOf(temp);
		if (index >= 0) {
			return bucket.get(index).value;
		}
		return -1;
	}

	public void remove(int key) {
		int hashValue = hashFunction(key);
		var bucket = myArr[hashValue];
		Data delData = new Data(key, 0);
		bucket.remove(delData);
	}
}
