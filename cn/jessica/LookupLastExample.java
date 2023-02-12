package cn.jessica;

public class LookupLastExample {
    public static void main(String[] args) {
        String strOrig = "Hello world , Hello Readers";
        int lastIndex = strOrig.lastIndexOf("Hello");
        if(lastIndex == - 1){
            System.out.println("Hello not found");
        }else{
            System.out.println("Last occurrence of Hello " + lastIndex);
        }
    }
}
