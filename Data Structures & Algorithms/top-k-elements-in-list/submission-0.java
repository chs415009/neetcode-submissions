class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 1. 統計頻率
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 2. 將 Map 的鍵（數字）放入 List 中，並根據頻率由高到低排序
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a, b) -> map.get(b) - map.get(a));

        // 3. 取出前 k 個元素
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}