class QueueDemo{
    public static void main(String[] args){
        int[] a = {1,5,6,2,3};
        Queue q = new Queue(a);
        int j = 5;
        while(j <= 8){
            q.enqueue(8);
            q.display();
            j++;
        }
        int i = 8;
        while(i >= 0){
            q.dequeue();
            i--;
        }
        q.display();
    }
}