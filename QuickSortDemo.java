class QuickSortDemo{
    public static void main(String[] args){
        int[] a = {1,3,1,9,10,8,5,6,9};
        QuickSort q = new QuickSort(a);
        q.display();
        q.quickSort();
        q.display();
    }
}