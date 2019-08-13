 static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
    SinglyLinkedListNode newNode =new SinglyLinkedListNode(data);
        
        
        //Insert at head of queue
        if(position ==0){
            newNode.next = head;
            return newNode;
        }

        SinglyLinkedListNode temp=head;
        int p = 1;

        while(p < position ){
            temp = temp.next;
            p++;
        }

        //When I get to the position        
        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }
