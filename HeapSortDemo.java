class HeapSortDemo{
    public static void main(String[] args){
        int[] a = {4,1,3,2,16,9,10,14,8,7};
        Heap h = new Heap(a);
        h.displayHeap();
        h.heapSort();
        System.out.println("\nAfter heap sort: ");
        h.displayHeap();
    }
}
        