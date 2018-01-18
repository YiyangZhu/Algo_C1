class Heap{
    int length;
    int size;
    int[] array;
    int l;
    int r;
    int temp;
    int largest;
    
    Heap(int[] a){
        array = a;
        length = a.length;
        size = a.length;
    }
    
    void display(){
        for(int i : array){
            System.out.print(i+" ");
        }
        
        System.out.println();
    }
    
    int left(int i){
        return 2*i + 1;
    }
    
    int right(int i){
        return 2*i + 2;
    }
    
    void maxHeapify(int[] a, int i){
        l = left(i);
        r = right(i);
        if(l < size && a[l] > a[i]){
            largest = l;
        } else {
            largest = i;
        }
        
        if(r < size && a[r] > a[i]){
            largest = r;
        }
        if(i != largest){
            temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;
            maxHeapify(a, largest);
        }
    }
    
    void buildMaxHeap(){
        for(int k = length/2 - 1; k>=0;k--){
            maxHeapify(array, k);
        }
    }
    
    void heapSort(){
        buildMaxHeap();
        for(int k = length-1; k >= 1; k--){
            temp = array[k];
            array[k] = array[0];
            array[0] = temp;
            size--;
            maxHeapify(array,0);
        }
    }
}