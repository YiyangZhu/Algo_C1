class StringDemo{
    public static void main(String[] args){
        String s = "abc";
        String t = new String("abc");
        System.out.println(s.equals(t));
        s = new String("Ted");
        String s2 = new String();
        System.out.println(s2);
        System.out.println(s.compareTo(t));
        System.out.println(s.compareTo(s2));
        System.out.println(("abc").compareTo(t));
        System.out.println(("1").compareTo(t));
    }
}