package day1JavaBasic;

public class Strings {
    public static void main(String[] args) {
        String s1 = "Jan";
        String s2 = "Feb";
        String s3 = "March";
        String s4 = "April";
        if (s1 == s2){
            System.out.println("The given Strings are Equal");
        }else if (s1==s3){
            System.out.println(" The given Strings are Equal");
        }else if (s1 == s4){
            System.out.println("The given strings are not Equal");
        }else{
            System.out.println("The given condition is invalid");
        }
    }
}
