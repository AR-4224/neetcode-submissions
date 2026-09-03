class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();

        for(String word : strs){
            char[] letters = word.toCharArray();

            Arrays.sort(letters);
            String sortedWord = new String(letters);

            result.putIfAbsent(sortedWord, new ArrayList<>());

            result.get(sortedWord).add(word);
        }

        return new ArrayList<>(result.values());
    }
}
