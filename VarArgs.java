public class VarArgs{
    static void vaTest(boolean b, char... v){
        System.out.println("The number of arguments of v is "+v.length);
        for(int i = 0; i < v.length; i++){
            System.out.println("arg"+i+" is "+v[i]);
        }
    }
    
    public static void main(String[] args){
        vaTest(true,(char)57,'a');
        vaTest(false);
        vaTest(false);
    }
}