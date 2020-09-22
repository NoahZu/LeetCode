class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(Character c : s.toCharArray()) {
            Integer count = map.get(c);
            if(count == null) {
                count = 1;
                map.put(c,count);
            } else {
                count = count + 1;
                map.replace(c,count);
            }
        }
        for(int i = 0;i<s.length();i++) {
            if(map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}