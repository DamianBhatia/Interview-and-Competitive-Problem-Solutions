class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        
        for(int i = 0; i < allowed.length(); ++i) map.put(allowed.charAt(i), allowed.charAt(i));

        for(String word : words) {
            int i = 0;
            while(i < word.length() && map.containsKey(word.charAt(i))) i++;
            if(i == word.length()) count++;
        }
        
        return count;
    }
}
