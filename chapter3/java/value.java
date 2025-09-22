import java.util.Scanner;

public class value {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 수: ");
        double num1 = Double.parseDouble(scanner.next()); // next()로 입력받아 double 변환

        System.out.print("두번째 수: ");
        double num2 = Double.parseDouble(scanner.next()); //Double.parseDouble()로 실수형으로 변환

        if (num2 == 0.0) { //if (num2 == 0.0) 로 나누는 수가 0인지 확인
            System.out.println("결과:무한대");
        } else {
            double result = num1 / num2;            
            System.out.printf("결과: %.2f\n", result); //// 소수 둘째자리까지 출력
        }

        scanner.close();
    }
}
