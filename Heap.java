class Heap{
    int size;
    int length;
    int[] array;
    int l;
    int r;
    int largest;
    
    Heap(int[] a){
        array = a;
        size = a.length;
        length = a.length;
    }
    
    int left(int i){
        return i * 2 + 1;
    }
    
    int right(int i){
        return i * 2 + 2;
    }
    
    int parent(int i){
        return (i - 1) / 2;
    }
    
    void maxHeapify(int[] a, int i){
        int temp;
        l = left(i);
        r = right(i);
        if(l < length && a[l] > a[i]){
            largest = l;
        } else {
            largest = i;
        }
        if(r < length && a[r] > a[largest]){
            largest = r;
        }
        if(i != largest){
            temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;
            maxHeapify(a, largest);
        }
        return;
    }
    
    void buildMaxHeap(){
        size = array.length;
        for(int k = array.length / 2 - 1; k >= 0; k--){
            maxHeapify(array, k);
        }
    }
    
    void heapSort(){
        int temp = 0;
        buildMaxHeap();
        for(int k = array.length - 1; k >= 1; k--){
            temp = array[0];
            array[0] = array[k];
            array[k] = temp;
            length--;
            maxHeapify(array, 0);
        }
    }
    
    void displayHeap(){
        int count = 0;
        for(int i : array){
            System.out.print(count+"th:"+i+"     ");
            count++;
        }
    }
    
}
            
            
            
            
            