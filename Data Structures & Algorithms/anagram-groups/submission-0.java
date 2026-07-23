class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> map = new HashMap<>();

        for(int i = 0;i<strs.length;i++)
        {
            String str = strs[i];

            char ch[] = str.toCharArray();

            Arrays.sort(ch);

            String Sorted = new String(ch);

            if(!map.containsKey(Sorted))
            {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(Sorted,list);
            }
            else 
            {
                map.get(Sorted).add(str);
            }
        }

        return new ArrayList<>(map.values());
    }
}
