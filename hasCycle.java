    //Detecting whether a linked list whose known max length is cyclic
    
    static boolean hasCycle(SinglyLinkedListNode head) {

        SinglyLinkedListNode temp = head;
        int counter = 0;

        while(temp != null){
            if(counter++ > 1000) return true;
          temp = temp.next;
        }
        
        return false;
    }
