public class error {
    public static void main(String[] args) {
        byte b = 5;
        b = (byte) -b; // 방법 1 :b = -b; 수정
        // 단, 이때 값이 byte 범위(-128~127)를 벗어나면 
        // 오버플로가 날 수 있음.

        int b2 = 5; // 방법 2 : 변수 타입 변경
        b2 =  -b2;     

        int result1 = 10 / b; //방법 1의 결과
        int result2 = 10 / b; //방법 2의 결과
        
        System.out.println(result1);
        System.out.println(result2);
    }
}
