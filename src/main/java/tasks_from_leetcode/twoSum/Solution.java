package tasks_from_leetcode.twoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//HashMap --->


class Solution {
    public static int[] twoSum(int[] nums, int target) {
        // Создаем HashMap для хранения пар: число -> его индекс
        Map<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int complement = target - currentNum;  // Вычисляем недостающее число

            // Проверяем, есть ли complement в HashMap
            if (numToIndex.containsKey(complement)) {
                // Если есть, возвращаем индексы
                return new int[] { numToIndex.get(complement), i };
            }

            // Если нет, добавляем текущее число в HashMap
            numToIndex.put(currentNum, i);
        }
        throw new IllegalArgumentException("No solution");
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.twoSum(new int[]{3,2,4}, 6)));

    }
}
