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
        int i = l;
        int j = l;
        int pi = l;
        int pivot = a[pi];
        while(pi < r){
            temp = a[pi];
            a[pi] = a[pi + 1];
            a[pi + 1] = temp;
            pi++;
            if(a[pi - 1] < a[pi]){
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j++;
            } else {
                j++;
            }
        }
        temp = a[pi];
        a[pi] = a[i];
        a[i] = temp;
        qs(a, l, i - 1);
        qs(a, i + 1, r);
    }
}
            