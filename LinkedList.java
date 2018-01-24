class LinkedList{
    LNode head;
    
    LNode search(int k){
        LNode current = head;
        while(current != null && current.key != k){
            current = current.next;
        }
        return current;
    }
    
    void insert(LNode n){
        n.next = head;
        if(head != null){
            head.prev = n;
        }
        head = n;
        n.prev = null;
    }
    
    void delete(LNode n){
        LNode result = search(n.key);
        if(result == null){
            System.out.println("No such node: "+n.key);
            return;
        }
        if(result == head){
            head = head.next;
            if(head == null){
                return;
            }
            head.prev = null;
            return;
        }
        result.prev.next = result.next;
        if(result.next == null){
            return;
        }
        result.next.prev = result.prev;
    }
    
    void display(){
        if(head == null){
            System.out.print("linked list is empty!");
        }
        LNode current = head;
        while(current != null){
            System.out.print(current.key+" ");
            current = current.next;
        }
        System.out.println();
    }
}
        