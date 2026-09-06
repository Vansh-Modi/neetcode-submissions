class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count how many times each number appears
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        // Step 2: Collect all unique numbers into a list
        List<Integer> uniqueNums = new ArrayList<>(countMap.keySet());
        
        // Step 3: Sort the list using their frequencies in descending order (highest count first)
        uniqueNums.sort((a, b) -> countMap.get(b) - countMap.get(a));
        
        // Step 4: Extract the top k elements into the result array
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = uniqueNums.get(i);
        }
        
        return result;
    }
}