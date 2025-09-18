public class continue181 {
    public static void main(String[] args){
        for(int i=1; i<=50; i++){
            if (i%2 !=0) {
                continue;
            }
            System.out.println(i);
        }
    }
}


// 초기식: int i = 1 → i를 1로 시작.
// 조건식: i <= 50 → 50 이하일 때만 반복.
// 증감식: i++ → 반복할 때마다 i를 1씩 증가.
// 즉, i가 1부터 50까지 차례대로 바뀌며 반복.



// i % 2 : i를 2로 나눈 나머지.
// i % 2 != 0 : 나머지가 0이 아니면 홀수라는 뜻.
// continue; : 이번 반복을 건너뛰고 for문의 증감식(i++)로 바로 이동.
// 즉, i가 홀수면 System.out.println(i); 를 실행하지 않고
// 다음 숫자로 넘어감.