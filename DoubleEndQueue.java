class DoubleEndQueue{
    int[] array;
    final int SIZE = 8;
    int head;
    int tail;
    int count;
    
    DoubleEndQueue(int[] a){
        array = new int[SIZE];
        for(int i = 0; i < a.length; i++){
            array[i] = a[i];
        }
        head = 0;
        tail = a.length;
        count = a.length;
    }
    
    void enqueue(int i, int j){
        if(count == SIZE){
            System.out.println("cannot enqueue, queue is full!");
            return;
        }
        if(j == 1){
            if(tail == SIZE - 1){
                array[tail] = i;
                tail = 0;
                count++;
            } else {
                array[tail] = i;
                tail++;
                count++;
            }
        } else{
            if(head == 0){
                array[SIZE - 1] = i;
                head = SIZE - 1;
                count++;
            } else {
                head--;
                array[head] = i;
                count++;
            }
        }     
    }
    
    int dequeue(int j){
        if(count == 0){
            System.out.println("cannot dequeue, queue is empty!");
            return -1;
        }
        if(j==0){
            if(head == SIZE - 1){
                head = 0;
                count--;
                return array[SIZE - 1];
            } else {
                head++;
                count--;
                return array[head - 1];
            }
        } else {
            if(tail == 0){
                tail = SIZE -1;
                count--;
                return array[SIZE - 1];
            } else {
                tail--;
                count--;
                return array[tail];
            }
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