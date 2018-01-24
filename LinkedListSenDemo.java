class LinkedListSenDemo{
    public static void main(String[] args){
        LNode n = new LNode(5);
        LinkedListSen l = new LinkedListSen();
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
        l.delete(n2);
    }
}