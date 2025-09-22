# exam02.py - Java Exam02를 Python Enum으로 변환

from enum import Enum, auto

class LoginResult(Enum):
    """로그인 결과를 나타내는 열거형"""
    SUCCESS = auto()
    FAIL_ID = auto()
    FAIL_PASSWORD = auto()
    
    def __str__(self):
        """문자열 표현을 위한 메서드"""
        return self.name
    
    def get_message(self):
        """각 결과에 대한 메시지 반환"""
        messages = {
            LoginResult.SUCCESS: "로그인 성공",
            LoginResult.FAIL_ID: "로그인 실패: 아이디가 존재하지 않음",
            LoginResult.FAIL_PASSWORD: "로그인 실패: 패스워드가 틀림"
        }
        return messages.get(self, "알 수 없는 오류")

def main():
    """메인 실행 함수 - 원본 Java 코드와 동일한 로직"""
    # Java 코드와 동일한 테스트
    result = LoginResult.FAIL_PASSWORD
    
    if result == LoginResult.SUCCESS:
        print("로그인 성공")
    elif result == LoginResult.FAIL_ID:
        print("로그인 실패: 아이디가 존재하지 않음")
    elif result == LoginResult.FAIL_PASSWORD:
        print("로그인 실패: 패스워드가 틀림")
    
    print(f"\n현재 결과: {result}")
    print(f"메시지: {result.get_message()}")
    
    # 추가 예제: 모든 가능한 결과 출력
    print("\n=== 모든 로그인 결과 ===")
    for login_result in LoginResult:
        print(f"{login_result}: {login_result.get_message()}")

def simulate_login(user_id: str, password: str) -> LoginResult:
    """로그인 시뮬레이션 함수"""
    # 간단한 로그인 로직
    valid_users = {
        "admin": "12345",
        "user": "password",
        "test": "1234"
    }
    
    if user_id not in valid_users:
        return LoginResult.FAIL_ID
    elif valid_users[user_id] != password:
        return LoginResult.FAIL_PASSWORD
    else:
        return LoginResult.SUCCESS

def interactive_test():
    """대화형 테스트"""
    print("=== 로그인 시스템 테스트 ===")
    print("유효한 계정: admin/12345, user/password, test/1234")
    
    while True:
        user_id = input("\n아이디를 입력하세요 (종료: quit): ").strip()
        if user_id.lower() == 'quit':
            break
            
        password = input("패스워드를 입력하세요: ").strip()
        
        result = simulate_login(user_id, password)
        print(f"결과: {result.get_message()}")

if __name__ == "__main__":
    main()
    print("\n" + "="*50)
    interactive_test()