// This problem can easily be solved using stack data structure

    static String isBalanced(String s) {

        LinkedList<Character> stack = new LinkedList<>();
        int size =0; //Keep track of size to avoid over looping 

        char c;
        for(int i=0; i<s.length(); i++){
            c=s.charAt(i);
            if(size==0){
                stack.add(c); //push
                size++;
            }
            //Same as top. Dont add new elem, pop top
            else if( (stack.get(0)=='[' && c==']')||  (stack.get(0)=='(' && c==')') || (stack.get(0)=='{' && c=='}') ){ 
                stack.remove(0);
                size--;
            }
            else{//push
                stack.add(0, c);//By pushing elements to list head (stack top), we can pop them in O(1), keeping the overral complexity at O(n)
                size++;
            }
        }

        if(size==0) return "YES";
        return "NO";
    }
