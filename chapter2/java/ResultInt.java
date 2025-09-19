public class ResultInt {
    public static void main(String[] args) {
        int x = 5;
        int y = 2;
        float result = (float) x / y;
        // double이나 float을 사용하여 소수점까지 보이도록 한다
        // int/int 식의 결과는 상수지만
        // (float) x / y; 이나 (double) x / y;으로 작성하여
        // x 나 y 둘 중 하나만 승격시키면
        // 자동 타입 변환으로 결과가 출력된다

        System.out.println("");
        System.out.println(result);
    }
}
