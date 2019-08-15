 static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {

        DoublyLinkedListNode temp = head, RH=null;

        while( temp != null){    
            DoublyLinkedListNode rd = new DoublyLinkedListNode(temp.data);
            if(RH==null){
                RH = rd;
            }else{
                RH.prev = rd;
                rd.next = RH;
                RH = rd;
            }
            temp = temp.next;
        }
        return RH;
    }
