class DoubleEndQueueDemo{
    public static void main(String[] args){
        int[] a = {1,5,6,2,3};
        DoubleEndQueue q = new DoubleEndQueue(a);
        int j = 5;
        while(j <= 8){
            q.enqueue(8,1);
            q.display();
            j++;
        }
        int i = 8;
        while(i >= 0){
            q.dequeue(0);
            i--;
        }
        q.display();
        j = 0;
        while(j <= 8){
            q.enqueue(j,0);
            q.display();
            j++;
        }
        i = 8;
        while(i >= 0){
            q.dequeue(1);
            i--;
        }
        q.display();
    }
}