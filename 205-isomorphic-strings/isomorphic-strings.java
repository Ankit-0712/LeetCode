class Solution {
    public boolean isIsomorphic(String s, String t) {
        //Check for length of both string
        if(s.length() != t.length()) return false;

        //use two maps to store the values from both string
        Map<Character, Character> mapST = new HashMap<>();
        Map<Character, Character> mapTS = new HashMap<>();

        //iterarte over the both strings together
        for(int i=0;i<s.length();i++){
            char c1 = s.charAt(i);//initialize 2 char to store first value of both str
            char c2 = t.charAt(i);

            //check if char present in the map and it c1!=c2
            if(mapST.containsKey(c1)&& mapST.get(c1)!=c2) return false;
            if(mapTS.containsKey(c2) && mapTS.get(c2) != c1) return false;

            //if abpve condotion false put c1, c2 in maps
            mapST.put(c1,c2);
            mapTS.put(c2,c1);
        }
        return true;
    }
}