// Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {

    HashMap<Character, Integer> str_a= makeMap(a);
    HashMap<Character, Integer> str_b= makeMap(b);
   
      return deleteCount(str_a, str_b) + deleteCount(str_b, str_a);
    }

    static int deleteCount(HashMap<Character, Integer> y, HashMap<Character, Integer> x){
         int counter =0;
         for(Character k: y.keySet()){
            if( x.get(k)==null ){
              counter += y.get(k); //delete what ever is in y
            } else if( y.get(k) > x.get(k) ){
                 counter += y.get(k) - x.get(k); //delete the difference
            }
         }
         return counter;        
    }
    
    static HashMap<Character, Integer> makeMap(String v) {   
      HashMap<Character, Integer> val= new HashMap<>();
      for(int i=0; i<v.length(); i++){        
        if( val.get(v.charAt(i))==null ){
            val.put(v.charAt(i), 1);
        }else{
            val.put(v.charAt(i),  val.get(v.charAt(i))+1 );
        }        
     }
     return val;
    }