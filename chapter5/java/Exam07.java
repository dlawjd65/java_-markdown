package chapter5.java;

public class Exam07 {
    public static void main(String[] args) {
        int var1 = 10;
        int var2 = 10;
        String var3 ="AB";
        String var4 = "AB";  // var3, var4은 동일한 객체의 주소를 참조
        String var5 = new String("AB"); //new String("AB") 는 힙(Heap) 영역에 항상 새로운 String 객체를 생성

        boolean result1 = var1 == var2; // 10 == 10
        boolean result2 = var1 != var2; // 10은 10과 같지 않다
        boolean result3 = var3 == var4; // AB는 AB
        boolean result4 = var3 != var5; // AB은 AB과 같지 않다
        boolean result5 = var4.equals(var5); //equals() : 문자열의 실제 내용을 비교하는 메서드.       

        System.out.println("");
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }    
}
