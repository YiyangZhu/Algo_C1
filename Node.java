class Node{
    int index;
    int element;
    int parent;
    int left;
    int right;
    
    Node(int i, int e){
        index = i;
        element = e;
        parent = (i - 1) / 2;
        left = i * 2 + 1;
        right = i * 2 + 2;
    }
}
    