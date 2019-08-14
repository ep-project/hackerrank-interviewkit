static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);

        if(head == null){
            return newNode;
        }

        DoublyLinkedListNode temp = head;

        //Insertion at begining
        if(data < temp.data){
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            return head;
        }

        //Inserting in the middle of the list
        while(temp.next != null && temp.next.data < data){
            temp = temp.next;
        }
        
        if(temp.next != null){
            temp.next.prev = newNode;    
        }

        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next = newNode;

        return head;
    }
