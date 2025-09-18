

public class break179 {
    public static void main (String[] args) {
        while (true) {
            int num = (int) (Math.random() *6) + 1;
            System.out.println(num);
            if (num == 6) {
                break;
            }
        }
        System.out.println("프로그램 종료");
    }
}

// 조건이 true이므로 조건을 만족하지 않아도 계속 반복하는 무한 루프
// 루프를 빠져나가려면 break 필요


// Math.random() : 0.0 이상 1.0 미만의 난수(double)를 생성.
// *6 : 0.0 이상 6.0 미만의 실수로 변환.
// (int) : 소수점 버림 → 0 ~ 5 범위의 정수.
// +1 : 1 ~ 6 범위의 정수.
// 👉 1부터 6까지의 주사위 숫자를 랜덤하게 하나 뽑습니다.


// num이 6일 때 break 실행.
// break는 현재 실행 중인 가장 가까운 반복문을 즉시 빠져나옵니다.
// 즉, 6이 나오는 순간 while문 종료.