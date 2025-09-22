public class output {
    public static void main(String[] args) {
        int score = 85;
        String result = (!(score>90)) ? "가" : "나"; // ! 논리의 부정 즉, 반대의 결과값 출력
        System.out.println(result);
    }
}
