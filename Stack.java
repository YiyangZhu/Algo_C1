class Stack{
    int[] array;
    final int SIZE = 8;
    int top;
    
    Stack(int[] a){
        array = new int[SIZE];
        for(int i = 0; i < a.length; i++){
            array[i] = a[i];
        }
        top = a.length - 1;
    }
    
    void push(int i){
        if(top == (SIZE - 1)){
            System.out.println("Stack is full!");
        } else {
            top++;
            array[top] = i;
        }
    }
    
    int pop(){
        if(top == -1){
            System.out.println("Stack is empty!");
            return -1;
        } else {
            top--;
            return array[top+1];
        }
    }
    
    int peek(){
        if(top == -1){
            System.out.println("Stack is empty!");
            return -1;
        } else {
            return array[top];
        }
    }
    
    void display(){
        for(int i = 0; i <= top; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
    