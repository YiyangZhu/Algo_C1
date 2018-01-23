class Queue{
    int[] array;
    final int SIZE = 8;
    int head;
    int tail;
    int count;
    
    Queue(int[] a){
        array = new int[SIZE];
        for(int i = 0; i < a.length; i++){
            array[i] = a[i];
        }
        head = 0;
        tail = a.length;
        count = a.length;
    }
    
    void enqueue(int i){
        if(count == SIZE){
            System.out.println("cannot enqueue, queue is full!");
            return;
        }
        if(tail == SIZE - 1){
            array[tail] = i;
            tail = 0;
            count++;
        } else {
            array[tail] = i;
            tail++;
            count++;
        }
    }
    
    int dequeue(){
        if(count == 0){
            System.out.println("cannot dequeue, queue is empty!");
            return -1;
        }
        if(head == SIZE - 1){
            head = 0;
            count--;
            return array[SIZE - 1];
        } else {
            head++;
            count--;
            return array[head - 1];
        }
    }
    
    void display(){
        if(count == 0){
            System.out.println("cannot display, queue is empty");
            return;
        }
        if(head >= tail){
            for(int i = head; i < SIZE; i++){
                System.out.print(array[i]+" ");
            }
            for(int i = 0; i < tail; i++){
                System.out.print(array[i]+" ");
            }
        }
        for(int i = head; i < tail; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}  