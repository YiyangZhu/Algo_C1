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
        if(result.prev == null && result.next == null){
            head = null;
        } else if(result.prev == null && result.next != null){
            head = head.next;
            head.prev = null;
        } else if(result.prev != null && result.next == null){
            result.prev.next = null;
        } else {
            result.prev.next = result.next;
            result.next.prev = result.prev;
        }
    }
    
    void display(){
        LNode current = head;
        while(current != null){
            System.out.print(current.key+" ");
            current = current.next;
        }
        System.out.println();
    }
}