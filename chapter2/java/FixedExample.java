public class FixedExample {
    public static void main(String[] args) {

        // byte는 -128 ~ 127 범위만 가능 → 100으로 수정
        byte var1 = 100;

        // char는 한 글자만 가능 → 'A' 로 수정
        char var2 = 'A';

        // char는 0~65535 범위의 정수 리터럴 허용 → 그대로 사용 가능
        char var3 = 65;   // 65는 'A'와 동일

        // long 리터럴은 int 범위를 넘을 경우 L 접미사 필요
        long var4 = 50000000000L;

        // float 리터럴은 f 접미사 필요
        float var5 = 3.14f;

        // 오타 수정 : double
        double var6 = 100.0;

        // 문자열 안의 큰따옴표는 \" 로 이스케이프
        String var7 = "나의 직업은 \"개발자\"입니다.";

        // boolean 은 true/false 만 가능
        boolean var8 = false;

        // le2 라는 변수를 먼저 선언 후 사용
        int le2 = 100;
        int var9 = le2;

        // le2f 라는 변수를 먼저 선언 후 사용
        float le2f = 1e2f; // 100.0f
        float var10 = le2f;

        // 확인용 출력
        System.out.println(var1 + ", " + var2 + ", " + var3 + ", " + var4 + ", " +
                           var5 + ", " + var6 + ", " + var7 + ", " + var8 + ", " +
                           var9 + ", " + var10);
    }
}
