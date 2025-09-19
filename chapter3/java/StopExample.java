public class StopExample {
    public static void main(String[] args) {
        boolean stop = false;   // 처음에는 stop이 false

        // !stop이 true인 동안 계속 반복
        while (!stop) {
            System.out.println("반복 실행 중...");

            // 어떤 조건을 만나면 stop을 true로 바꾼다.
            // 여기서는 임의로 카운터를 이용
            int num = (int) (Math.random() * 10); // 0~9 사이 난수
            System.out.println("생성된 숫자: " + num);

            if (num == 5) { // 숫자 5가 나오면 멈춤
                stop = true;   // stop을 true로 바꾸면 !stop 은 false
                System.out.println("5가 나와서 반복을 멈춥니다.");
            }

            try {
                Thread.sleep(500); // 0.5초 잠시 대기 (출력 보기 편하게)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("프로그램 종료");
    }
}
