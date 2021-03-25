public class MyString {
    private MyString(){

   }

    public static String reverseString(String line){
       return new StringBuilder(line).reverse().toString();
    }

    public static boolean isPalindrome(String line){
        String linee=line.trim().replaceAll("[^A-Za-z0-9]+", "");
        return linee.equals(reverseString(linee));
    }
    public static String shortHanded(String line){
        String edited=line.replaceAll(" and ","&");
        edited=edited.replaceAll(" to ","2");
        edited=edited.replaceAll(" for ","4");
        edited=edited.replaceAll(" you ","U");
        return edited.replaceAll("[a-zA-z][auizoOIZUA]","");
    }
    public static int numberOfSentences(String line){
        return line.split("[.,?!]").length;
    }
    public static int numberOfWords(String line){
        return line.split(" ").length;
    }
}
