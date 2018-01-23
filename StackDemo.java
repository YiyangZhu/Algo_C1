class StackDemo{
    public static void main(String[] args){
        int[] a = {1,3,6,2,9};
        Stack s = new Stack(a);
        s.display();
        s.push(5);
        s.display();
        s.push(5);
        s.display();
        s.push(5);
        s.display();
        s.push(5);
        s.display();
        System.out.println(s.peek());
        s.display();
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());       
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        s.display();
        
    }
}
        