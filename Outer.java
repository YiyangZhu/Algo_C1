class Outer{
    int[] nums;
    Outer(int[] n){
        nums = n;
    }
    
    void analyze(){
        Inner i = new Inner();
        System.out.println("Min is: " + i.min());
        System.out.println("Max is: " + i.max());
        System.out.println("Avg is: " + i.avg());
    }
    
    class Inner{
        int min(){
            int m = nums[0];
            for(int i : nums){
                if(i < m){
                    m = i;
                }
            }
            return m;
        }
        
        int max(){
            int m = nums[0];
            for(int i : nums){
                if(i > m){
                    m = i;
                }
            }
            return m;
        }
        
        double avg(){
            double sum = 0;
            for(int i : nums){
                sum += i;
            }
            return sum/(nums.length);
        }
    }
}
        
        