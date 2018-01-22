class CountingSortDemo{
    public static void main(String[] args){
        int[] a = {6,0,2,0,1,3,4,6,1,3,2};
        CountingSort c = new CountingSort(a);
        c.countingSort();
        c.display();
    }
}