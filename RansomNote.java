//the code seems long but the complexity if actually O(m+n) which is the best we can do (I assume)

// Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        
        HashMap<String, Integer> mag = new HashMap<>();
        int temp = 0;
        for(String m: magazine){
            if( mag.get(m)==null ){//Does not exist
                mag.put(m, 1);
            }else{
                mag.put(m, 1+mag.get(m)); //Increase counter
            }            
        }
        //Do the same for note
        HashMap<String, Integer> nt = new HashMap<>();
        
        for(String n: note){
            if( nt.get(n)==null ){//Does not exist
                nt.put(n, 1);
            }else{
                nt.put(n, 1+nt.get(n)); //Increase counter
            }            
        }

        //Check if every note letter is in magazine
        for(String n: nt.keySet()){
            if( mag.get(n)==null||  (mag.get(n) < nt.get(n))){//Does not exist
                System.out.println("No");
                return;
            }
        }        
        System.out.println("Yes");
    }