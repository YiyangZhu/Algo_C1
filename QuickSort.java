class QuickSort{
    public static void main(String[] args){
        display(quickSort());
    }
    
    static void display(int[] a){
        for(int i : a){
            System.out.print(i+" ");
        }
    }
    
    static int[] quickSort(){
        int[] a = {4,1,7,9,18,7,3,7,3,3,3,2};
        qs(a, 0, a.length - 1);
        return a;
    }
    
    static void qs(int[] a, int l, int r){
        if(l >= r) return;
        int temp;
        int i = l;
        int j = l;
        int pivot = a[l];
        int pi = l;
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
        temp = a[i];
        a[i] = a[pi];
        a[pi] = temp;
        qs(a, l, i - 1);
        qs(a, i + 1, r);
    }
}