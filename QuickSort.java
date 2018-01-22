class QuickSort{
    int[] array;
    int length;
    int temp;
    
    QuickSort(int[] a){
        array = a;
        length = a.length;
    }
    
    void display(){
        for(int i: array){
            System.out.print(i+"  ");
        }
        System.out.println();
    }
    
    void quickSort(){
        qs(array, 0, length - 1);
    }
    
    void qs(int[] a, int l, int r){
        if(l >= r) return;
        int q = partition(a, l, r);
        qs(a, l, q - 1);
        qs(a, q + 1, r);
    }
    
    int partition(int[] a, int l, int r){
        int i = l - 1;
        int j = l;
        while(j < r){
            if(a[j] < a[r]){
                i++;
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            } else {
                j++;
            }
        }
        temp = a[r];
        a[r] = a[i + 1];
        a[i + 1] = temp;
        return i+1;
    }
}
            