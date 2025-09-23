package chapter5.java;

import java.util.Scanner;

public class Exam06 {
    public static void main(String[] args) {
        boolean run = true;
        int studentNum = 0;
        int[] scores = null;
        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("------------------------");
            System.out.println("선택> ");

           // 메뉴 번호 입력
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) continue; // 빈 입력 방지
            int selectNo = Integer.parseInt(line);

            if(selectNo == 1) {
               System.out.print("학생수> ");
                studentNum = Integer.parseInt(scanner.nextLine().trim());
                if (studentNum <= 0) {
                    System.out.println("학생수는 1 이상이어야 합니다.");
                    studentNum = 0;
                    scores = null;
                } else {
                    scores = new int[studentNum];
                }
            } else if(selectNo == 2) {
                 if (scores == null) {
                    System.out.println("먼저 1번에서 학생수를 입력하세요.");
                    continue;
                }
                for (int i = 0; i < scores.length; i++) {
                    System.out.print("score[" + i + "]> ");
                    scores[i] = Integer.parseInt(scanner.nextLine().trim());
                }
 
            } else if(selectNo == 3) {
               if (scores == null) {
                    System.out.println("먼저 1번에서 학생수를 입력하세요.");
                    continue;
                }
                for (int i = 0; i < scores.length; i++) {
                    System.out.println("score[" + i + "]: " + scores[i]);
                }
            } else if(selectNo == 4) {
                 if (scores == null) {
                    System.out.println("먼저 1번에서 학생수와 2번에서 점수를 입력하세요.");
                    continue;
                }
                int max = Integer.MIN_VALUE;
                long sum = 0;
                for (int s : scores) {
                    if (s > max) max = s;
                    sum += s;
                }
                double avg = (scores.length == 0) ? 0.0 : (double) sum / scores.length;

                System.out.println("최고점수: " + max);
                System.out.printf("평균점수: %.12f%n", avg); // 소수점 12자리
            } else if(selectNo == 5) {
                run = false;

            } else {
                System.out.println("1~5 중에서 선택하세요.");
            }
                   
            
        } System.out.println("프로그램 종료");
        scanner.close();

    }
}

