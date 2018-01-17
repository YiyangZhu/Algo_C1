class Queue6Demo{
    public static void main(String[] args){
        int i = 3;
        Queue6 q = new Queue6(i);
        q.put('p');
        q.put('e');
        q.put('r');
        Queue6 q2 = new Queue6(q);
        System.out.print("q1 is as follows: ");
        for(int j = 0; j < 3; j++){
            System.out.print(q.get());
        }
        System.out.println();
        System.out.print("q2 is as follows: ");
        for(int j = 0; j < 3; j++){
            System.out.print(q2.get());
        }
        System.out.println();
        System.out.print("q3 is as follows: ");
        char[] a = {'t','r','y'};
        Queue6 q3 = new Queue6(a);
        for(int j = 0; j < 3; j++){
            System.out.print(q3.get());
        }
       
    }
}