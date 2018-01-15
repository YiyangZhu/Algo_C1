public class StaticPractice{
    public static void main(String[] args){
        System.out.println("absolute value of -5 is: "+abs(-5));
        System.out.println("absolute value of 5 is: "+abs(5));
        System.out.println("absolute value of -7.899 is: "+abs(-7.899));
        System.out.println("absolute value of 7.899 is: "+abs(7.899));
        System.out.println("Is 78 a prime? "+isPrime(78));
        System.out.println("Is 193 a prime? "+isPrime(193));
        System.out.println("Hypotenuse of 71.2 and 43.5 is: "+hypotenuse(71.2,43.5));
        System.out.println("Hypotenuse of 12.11 and 15.6 is: "+hypotenuse(12.11,15.6));
        System.out.println("The Harmonic Series of 71 is "+H(71));

    }
    
    public static int abs(int x){
        if(x >= 0) return x;
        return -x;
    }
    
    public static double abs(double d){
        if(d >= 0) return d;
        return -d;
    }
    
    public static boolean isPrime(int i){
        for(int j = 2; j < Math.sqrt(i); j++){
            if( i % j == 0){
                return false;
            }
        }
        return true;
    }
    
    public static double hypotenuse(double a, double b){
        return Math.sqrt(a*a + b*b);
    }
    
    public static double H(int N){
        double sum = 0.0;
        for(int i = 1; i <= N; i++){
            sum += 1.0 / i;
        }
        return sum;
    }
}