// Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        HashMap<Character, Integer> s = new HashMap<>();

        for(int i=0; i<s1.length(); i++){
            s.put(s1.charAt(i), i );
        }

        //If they share any letter then they have a common substring
        for(int j=0; j<s2.length(); j++){
            if(s.get(s2.charAt(j)) !=null){
                return "YES";
            }
        }
        return "NO";
    }