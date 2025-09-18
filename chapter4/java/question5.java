// import javax.naming.InitialContext;
// import javax.print.DocFlavor.STRING;

public class question5 {
    public static void main(String[] args) {
        for (int i=1; i<5; i++) {
            for (int j=1; j<=i; j++){
                System.out.print("*");
                if(j==i){
                    System.out.println();
                }
            }
        }
    }
    
}




// int i=1; i<5; i++   =  1부터 시작해서 4까지 1씩 증감함
// int j=1; j<=i; j++  =  1부터 시작해서 i보다 작거나 같을 때까지 1씩 증감함

// i\j   1    2    3    4
//  1   i=j  i<J  i<J  i<J
//  2   i<j  i=J  i<J  i<J
//  3   i<j  i>J  i=J  i<J
//  4   i<j  i>J  i>J  i=J

// i>j, i=j 조건이 성립되면 "*"를 출력

// 만약, i == j 이면 println(줄바꿈)

// 바깥쪽 한 “사이클”마다 안쪽 전체가 한 번씩 완주