class LinkedListDemo{
    public static void main(String[] args){
        LNode n = new LNode(5);
        LinkedList l = new LinkedList();
        l.display();
        l.insert(n);
        l.display();
        LNode n2 = new LNode(7);
        l.insert(n2);
        l.display();
        l.delete(n);
        l.display();
        l.delete(n);
        l.display();
        l.delete(n2);
        l.display();
    }
}