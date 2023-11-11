package l;

public class Third {
	static class Solution {
		public int removeDuplicates(int[] nums) {
			int a = 1;
			for (int i = 1; i < nums.length; i++) {
				if (nums[i] != nums[i - 1]) {
					nums[a] = nums[i];
					a++;
				}
				System.out.print(nums[i]);
			}
			return a;
		}
	};
	public static void main(String[]args){
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 5, 6, 1, 4};
		Solution S  = new Solution();
		int result = S.removeDuplicates(nums);
		System.out.println(result);
	}
	
}