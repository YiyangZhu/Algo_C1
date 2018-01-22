class CountingSort{
    int[] array;
    int length;
    int[] outcome;
    
    CountingSort(int[] a){
        array = a;
        length = a.length;
    }
    
    int max(){
        int temp = 0;
        for(int i: array){
            if(i > temp){
                temp = i;
            }
        }
        return temp+1;
    }
    
    void countingSort(){
        int cLength = max();
        outcome = new int[length];
        int[] c = new int[cLength];
        for(int i = 0; i < length; i++){
            c[array[i]]++;
        }
        for(int i = 1; i < cLength; i++){
            c[i] = c[i] + c[i - 1];
        }
        for(int i = length - 1; i >= 0; i--){
            outcome[c[array[i]] - 1] = array[i];
            c[array[i]]--;
        }
    }
    
    void display(){
        System.out.println("After counting sort:");
        for(int i: outcome){
            System.out.print(i+" ");
        }
    }
}
            