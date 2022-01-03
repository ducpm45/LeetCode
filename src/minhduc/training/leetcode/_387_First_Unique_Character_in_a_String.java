package minhduc.training.leetcode;

public class _387_First_Unique_Character_in_a_String {
	public int firstUniqChar(String s) {
		char[] arr = s.toCharArray();
		int[] count = new int[123];
		for (int i = 0; i < arr.length; i++) {
			char c = arr[i];
			int index = (int) c;
			count[index]++;
		}

		for (int i = 0; i < arr.length; i++) {
			char c = arr[i];
			int index = (int) c;
			if (count[index] == 1) {
				return i;
			}
		}

		return -1;

//		Map<Character, Integer> myMap = new HashMap<>();
//		char[] arr = s.toCharArray();
//		for (int i = 0; i < arr.length; i++) {
//			if (!myMap.containsKey(arr[i])) {
//				myMap.put(arr[i], 1);
//			} else {
//				int num = myMap.get(arr[i]);
//				myMap.put(arr[i], num + 1);
//			}
//		}
//		for (int i = 0; i < arr.length; i++) {
//			if (myMap.get(arr[i]) == 1) {
//				return i;
//			}
//		}
//		return -1;
	}
}
