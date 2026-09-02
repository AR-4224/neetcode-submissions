class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numbers = new HashMap<>();


        for(int num : nums){
            numbers.put(num, numbers.getOrDefault(num, 0) + 1);
        }

        List<int[]> arr = new ArrayList<>();
        for(Map.Entry<Integer, Integer> values : numbers.entrySet()){
            arr.add(new int [] {values.getValue(), values.getKey()});
        }

        arr.sort((a, b) -> b[0] - a[0]);

        int[] result = new int[k];

        for(int i = 0; i < k; i++){
            result[i] = arr.get(i)[1];
        }

        return result;
    }
}
