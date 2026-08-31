class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }

        char[] Word1 = s.toCharArray();
        char[] Word2 = t.toCharArray();

        Arrays.sort(Word1);
        Arrays.sort(Word2);

        return Arrays.equals(Word1, Word2);

    }
}
