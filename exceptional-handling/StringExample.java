public class StringExample {
    public static void main(String[] args){
        String s1="Hello ";
        String s2= "hello";
        String s3 ="ell";

        System.out.println(s1+" "+s2);
        System.out.println(s1.concat(s2));

        System.out.println(s1.length());//to find length

       System.out.println(s1.indexOf('e'));
       System.out.println(s1.charAt(3));
       

        //System.out.println(s1.replace ('o','a'));
        // System.out.println(s1.contains(s3));
        //System.out.println(s1.substring(  2));
        //System.out.println(s1.substring(  1,  6));
        //System.out.println(s1.equalsIgnoreCase(s2));
    }
    
}