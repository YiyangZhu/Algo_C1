class LinkedListSen{
    LNode sentinel;
    
    LinkedListSen(){
        sentinel = new LNode(-1);
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
    }
    
    LNode search(int k){
        LNode current = sentinel.next;
        while(current != sentinel && current.key != k){
            current = current.next;
        }
        return current;
    }
    
    void insert(LNode n){
        n.next = sentinel.next;
        sentinel.next.prev = n;
        sentinel.next = n;
        n.prev = sentinel;
    }
    
    void delete(LNode n){
        LNode current = search(n.key);
        if(n == sentinel){
            System.out.println("No such node: "+n.key);
            return;
        }
        n.prev.next = n.next;
        n.next.prev = n.prev;
    }
    
    void display(){
        LNode current = sentinel.next;
        while(current != sentinel){
            System.out.print(current.key+" ");
            current = current.next;
        }
        System.out.println();
    }
}                  