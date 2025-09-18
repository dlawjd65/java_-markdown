public class error3 {
    public static void main(String[] args) {
      byte byteValue = 10;
      float floatValue = 2.5F;
      double doubleValue = 2.5;

    //byte result1 = byteValue + byteValue;
    //결과가 int로 나와 강제 타입 변환되어 cannot convert 에러창이 뜬다
      int result2 = 5 + byteValue;
      float result3 = 5 + floatValue;
      double result4 = 5 + doubleValue;

    //System.out.println(result1);
      System.out.println(result2);
      System.out.println(result3);
      System.out.println(result4);
}
}
