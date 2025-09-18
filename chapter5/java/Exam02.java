package chapter5.java;

public class Exam02 {

    public enum LoginResult {
        SUCCESS, FAIL_ID, FAIL_PASSWORD
    }

    public class InnerExam02 {
        public static void main(String[] args) {
            LoginResult result = LoginResult.FAIL_PASSWORD;
            if (result == LoginResult.SUCCESS) {                               
            } else if (result == LoginResult.FAIL_ID) {

            } else if (result == LoginResult.FAIL_PASSWORD) {

            }

        }
    
        
    }
}