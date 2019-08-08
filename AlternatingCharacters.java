// Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
      
      int del =0;

      for(int i=1; i<s.length(); i++){
          if(s.charAt(i) == s.charAt(i-1)) del +=1;
      }
      return del;
    }