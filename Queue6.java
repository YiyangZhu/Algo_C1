class Queue6{
    private char[] q;
    private int get;
    private int put;
    
    Queue6(int size){
        q = new char[size];
        get = get = 0;
    }
    
    Queue6(Queue6 ob){
        put = ob.put;
        get = ob.get;
        q = new char[ob.q.length];
        for(int i = 0; i < ob.put; i++){
            q[i] = ob.q[i];
        }
    }
    
    Queue6(char a[]){
        put = 0;
        get = 0;
        q = new char[a.length];
        for(int i = 0; i < a.length; i++){
            put(a[i]);
        }
    }
    
    void put(char c){
        if(q.length == put){
            System.out.println("Queue is full!");
            return;
        }
        q[put++] = c;
    }
    
    char get(){
        if(get == put){
            System.out.println("Queue is empty!");
            return (char) 0;
        }
        return q[get++];
    }
}