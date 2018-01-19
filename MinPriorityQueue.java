class MinPriorityQueue{
    int[] array;
    int size;
    int LENGTH = 200;
    int min;
    int temp;
    int l;
    int r;
    int smallest;
    int parent;
    
    MinPriorityQueue(int[] a){
        array = new int[LENGTH];
        for(int i = 0; i < a.length;i++){
            array[i] = a[i];
        }
        size = a.length;
        buildMinHeap();
    }
    
    void buildMinHeap(){
        for(int k = size/2 - 1; k >= 0;k--){
            minHeapify(array, k);
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
    
    void minHeapify(int[] a, int i){
        l = left(i);
        r = right(i);
        if(l < size && a[l] < a[i]){
            smallest = l;
        } else {
            smallest = i;
        }
        if(r < size && a[r] < a[smallest]){
            smallest = r;
        }
        if(i != smallest){
            temp = a[i];
            a[i] = a[smallest];
            a[smallest] = temp;
            minHeapify(a,smallest);
        }
    }
    
    int min(){
        return array[0];
    }
    
    int extractMin(){
        if(size == 0){
            System.out.println("Underflow!");
            return -1;
        }
        min = array[0];
        array[0] = array[size - 1];
        size--;
        minHeapify(array,0);
        return min;
    }
    
    void decreaseKey(int i, int key){
        if(key >= array[i]){
            System.out.println("New key is NOT smaller than current key!");
            return;
        }
        array[i] = key;
        while(i>0 && array[i] < array[parent(i)]){
            temp = array[i];
            array[i] = array[parent(i)];
            array[parent(i)] = temp;
            i = parent(i);
        }
    }
    
    void insert(int i){
        size++;
        array[size-1] = 100000;
        decreaseKey(size - 1, i);
    }
}
        