package methods;

public class OverloadStringWithVoid {
    public static void main(String[] args) {
        int a = printString("hello",0,3);
        System.out.println(a);
    }
    public static void printString(String str){
        System.out.println(str.charAt(0));
    }
    public static void printString(String str,int index){
        System.out.println(str.charAt(index));
    }
    public static int printString(String str, int num1, int num2){

        return str.substring(num1,num2).length();
    }
}