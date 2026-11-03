class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res = new HashMap<>();
        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String ss = new String(ch);
            res.putIfAbsent(ss, new ArrayList<>());
            res.get(ss).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
