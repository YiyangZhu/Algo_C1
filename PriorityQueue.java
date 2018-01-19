class PriorityQueue{
    int[] array;
    int size;
    int LENGTH = 200;
    int max;
    int temp;
    int l;
    int r;
    int largest;
    int parent;
    
    PriorityQueue(int[] a){
        array = new int[LENGTH];
        for(int i = 0; i < a.length;i++){
            array[i] = a[i];
        }
        size = a.length;
        buildMaxHeap();
    }
    
    void buildMaxHeap(){
        for(int k = size/2 - 1; k >= 0;k--){
            maxHeapify(array, k);
        }
    }
    
    void display(){
        for(int i = 0; i < size; i++){
            System.out.print(array[i]+"  ");
        }
        System.out.println();
    }
    
    int left(int i){
        return 2*i + 1;
    }
    
    int right(int i){
        return 2*i + 2;
    }
    
    int parent(int i){
        return (i-1)/2;
    }
    
    void maxHeapify(int[] a, int i){
        l = left(i);
        r = right(i);
        if(l < size && a[l] > a[i]){
            largest = l;
        } else {
            largest = i;
        }
        if(r < size && a[r] > a[largest]){
            largest = r;
        }
        if(i != largest){
            temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;
            maxHeapify(a,largest);
        }
    }
    
    int max(){
        return array[0];
    }
    
    int extractMax(){
        if(size == 0){
            System.out.println("Underflow!");
            return -1;
        }
        max = array[0];
        array[0] = array[size - 1];
        size--;
        maxHeapify(array,0);
        return max;
    }
    
    void increaseKey(int i, int key){
        if(key <= array[i]){
            System.out.println("New key is NOT greater than current key!");
            return;
        }
        array[i] = key;
        while(i>0 && array[i] > array[parent(i)]){
            temp = array[i];
            array[i] = array[parent(i)];
            array[parent(i)] = temp;
            i = parent(i);
        }
    }
    
    void insert(int i){
        size++;
        array[size-1] = -2;
        increaseKey(size - 1, i);
    }
}
        