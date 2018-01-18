class HeapSortDemo{
    public static void main(String[] args){
        int[] a = {16,4,14,5,23,8};
        Heap h = new Heap(a);
        h.display();
        h.heapSort();
        h.display();
    }
}