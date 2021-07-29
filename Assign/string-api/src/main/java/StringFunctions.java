public class StringFunctions {
    public static void reverseString(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        System.out.println(sb.toString());
    }

    public static void lengthOfString(String str){
        StringBuilder sb=new StringBuilder(str);

        System.out.println(sb.length());
    }
}
