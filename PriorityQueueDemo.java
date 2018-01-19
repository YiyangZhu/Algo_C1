class PriorityQueueDemo{
    public static void main(String[] args){
        int[] a = {1,4,2,17,8,9,10,3};
        MinPriorityQueue p = new MinPriorityQueue(a);
        PriorityQueue p1 = new PriorityQueue(a);
        p.display();
        System.out.println("min is: "+p.min());
        System.out.println("Extract the min:"+p.extractMin());
        System.out.println("After extracting min, p is: ");
        p.display();
        p.decreaseKey(5,0);
        p.display();
        p.insert(15);
        p.display();
        p1.display();
        System.out.println("max is: "+p1.max());
        System.out.println("Extract the max:"+p1.extractMax());
        System.out.println("After extracting max, p1 is: ");
        p1.display();
        p1.increaseKey(5,29);
        p1.display();
        p1.insert(15);
        p1.display();
    }
}