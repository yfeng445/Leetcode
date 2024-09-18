class Solution {
    public String largestNumber(int[] nums) {
        String[] array = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            array[i] = String.valueOf(nums[i]);
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                String str1 = array[j] + array[j + 1];
                String str2 = array[j + 1] + array[j];
                

                if (str1.compareTo(str2) < 0) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        if (array[0].equals("0")) {
            return "0";
        }

        StringBuilder largest = new StringBuilder();
        for (String num : array) {
            largest.append(num);
        }

        return largest.toString();
    }
}
