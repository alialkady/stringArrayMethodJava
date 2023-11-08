import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
       // String str2 = input.nextLine();
        //System.out.println(countChar(str,'a'));

        //System.out.println(convertOldNew(str,'a','h'));
        // System.out.println(convertOldNewLast(str,'a','h'));
        // System.out.println(replaceChar(str,'a','h'));
        //System.out.println(replaceEvenIndex(str,'a','h'));
        // System.out.println(concatination(str,str2));
       // System.out.println(concatereverse(str, str2));
        //System.out.println(concateSpecial(str,str2));
       // System.out.println(reverseString(str));
        //System.out.println(stringToCharArray(str));
        //System.out.println(charArrayToString(new char[] {'A','b','c'}));
        System.out.println(Split(str,' '));
    }

    //method to count the number of targeted char
    public static int countChar(String st, char s) {
        int counter = 0;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == s)
                counter++;

        }
        return counter;
    }

    //method to convert old char to new char just once
    public static String convertOldNew(String st, char o, char n) {

        String str = "";
        boolean check = true;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == o && check) {
                str += n;
                check = false;
            } else {
                str += st.charAt(i);
            }

        }
        return str;
    }
    //method to convert old char to new char just one in the  last

    public static String convertOldNewLast(String st, char o, char n) {
        int counter = countChar(st, o);
        int count = 0;
        String str = "";
        boolean check = true;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == o && check) {
                count++;
                if (count == counter) {
                    str += n;
                    check = false;
                } else {
                    str += st.charAt(i);
                }
            } else {
                str += st.charAt(i);

            }
        }
        return str;
    }

    //replace the char
    public static String replaceChar(String st, char o, char n) {
        String str = "";
        boolean check = true;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == o && check) {
                str += n;
            } else {
                str += st.charAt(i);
            }

        }
        return str;
    }

    //replace in odd index
    public static String replaceEvenIndex(String st, char o, char n) {
        String str = "";
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == o && i % 2 == 0) {
                str += n;
            } else {
                str += st.charAt(i);
            }
        }
        return str;
    }

    //concatination method
    public static String concatination(String s1, String s2) {
        String result = s1 + " " + s2;
        return result;
    }

    //concatenation with reversing second string
    public static String concatereverse(String s1, String s2) {
        String result = s1 + " ";
        for (int i = s2.length() - 1; i >= 0; i--) {
            result += s2.charAt(i);
        }
        return result;
    }

    //print second string in odd index only
    public static String concateSpecial(String s1, String s2)
    {
        String str = "";
        for (int i = 0; i < s2.length(); i++) {
            str = str + s1.charAt(i) + s2.charAt(i);
            if (i == s2.length() - 1){
                for (int j = i+1; j < s1.length(); j++)
                    str += s1.charAt(j);
                break;
            }
            if (i == s1.length() - 1) {
                for (int j = i+1; j < s2.length(); j++)
                    str += s2.charAt(j);
                break;
            }
        }
        return str;
    }
    //reverse string
    public static String reverseString(String S){
        String str="";
        for(int i =S.length()-1; i>=0;i--){
            str+=S.charAt(i);
        }
        return str;
    }
    //reverse first word
    public static String reverseFirstWord(String s)
    {
        String firstWord = "";
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                for (int j = i; j < s.length(); j++)
                    str += s.charAt(j);
                break;
            }
            firstWord += s.charAt(i);
        }
        str = reverseString(firstWord) + str;
        return str;
    }
    //convert string to array
    public static char[] stringToCharArray(String s){
        char[] arr=new char[s.length()];
        for(int i =0; i<s.length();i++){
            arr[i]=s.charAt(i);
        }
        return arr;
    }
    //convert array to string
    public static String charArrayToString(char[]c){
        String str ="";
        for(int i =0; i<c.length;i++){
            str+=c[i];
        }
        return str;
    }
    //split string to array with specific character
    public static String[] Split(String s,char sp){
        int counter=0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)==sp)
                counter++;
        }
        String[] arr= new String[counter+1];
        int j=0;
        String str = "";
        for(int i =0; i <s.length();i++){
            if(s.charAt(i)==sp){
                arr[j]=str;
            j++;
            str = "";
            }
            else{
                str+=s.charAt(i);
            }
        }

        return arr;
    }
};