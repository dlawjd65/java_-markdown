// exam02.ts - Java Exam02를 TypeScript Enum으로 변환

// 기본 열거형 정의
enum LoginResult {
    SUCCESS = "SUCCESS",
    FAIL_ID = "FAIL_ID", 
    FAIL_PASSWORD = "FAIL_PASSWORD"
}

// 타입 정의
type LoginCredentials = {
    userId: string;
    password: string;
};

type User = {
    id: string;
    password: string;
    name: string;
};

// 로그인 결과 메시지를 반환하는 함수
function getLoginMessage(result: LoginResult): string {
    const messages: Record<LoginResult, string> = {
        [LoginResult.SUCCESS]: "로그인 성공",
        [LoginResult.FAIL_ID]: "로그인 실패: 아이디가 존재하지 않음",
        [LoginResult.FAIL_PASSWORD]: "로그인 실패: 패스워드가 틀림"
    };
    
    return messages[result];
}

// 로그인 시뮬레이션 클래스
class LoginSystem {
    private validUsers: User[] = [
        { id: "admin", password: "12345", name: "관리자" },
        { id: "user", password: "password", name: "사용자" },
        { id: "test", password: "1234", name: "테스터" }
    ];
    
    // 로그인 검증 메서드
    public authenticate(credentials: LoginCredentials): LoginResult {
        const user = this.validUsers.find(u => u.id === credentials.userId);
        
        if (!user) {
            return LoginResult.FAIL_ID;
        }
        
        if (user.password !== credentials.password) {
            return LoginResult.FAIL_PASSWORD;
        }
        
        return LoginResult.SUCCESS;
    }
    
    // 사용자 정보 조회
    public getUserInfo(userId: string): User | null {
        return this.validUsers.find(u => u.id === userId) || null;
    }
}

// 메인 실행 함수 (Java 원본과 동일한 로직)
function main(): void {
    console.log("=== TypeScript 로그인 시스템 ===\n");
    
    // Java 코드와 동일한 테스트
    const result: LoginResult = LoginResult.FAIL_PASSWORD;
    
    if (result === LoginResult.SUCCESS) {
        console.log("로그인 성공");
    } else if (result === LoginResult.FAIL_ID) {
        console.log("로그인 실패: 아이디가 존재하지 않음");
    } else if (result === LoginResult.FAIL_PASSWORD) {
        console.log("로그인 실패: 패스워드가 틀림");
    }
    
    console.log(`현재 결과: ${result}`);
    console.log(`메시지: ${getLoginMessage(result)}\n`);
    
    // 추가 예제: 모든 가능한 결과 출력
    console.log("=== 모든 로그인 결과 ===");
    Object.values(LoginResult).forEach(loginResult => {
        console.log(`${loginResult}: ${getLoginMessage(loginResult)}`);
    });
}

// 로그인 테스트 함수
function testLogin(): void {
    console.log("\n=== 로그인 테스트 ===");
    const loginSystem = new LoginSystem();
    
    const testCases: LoginCredentials[] = [
        { userId: "admin", password: "12345" },     // 성공
        { userId: "admin", password: "wrong" },     // 비밀번호 틀림
        { userId: "unknown", password: "12345" },   // 아이디 없음
        { userId: "user", password: "password" },   // 성공
    ];
    
    testCases.forEach((credentials, index) => {
        console.log(`\n테스트 ${index + 1}:`);
        console.log(`입력: ID="${credentials.userId}", PW="${credentials.password}"`);
        
        const result = loginSystem.authenticate(credentials);
        console.log(`결과: ${getLoginMessage(result)}`);
        
        if (result === LoginResult.SUCCESS) {
            const user = loginSystem.getUserInfo(credentials.userId);
            console.log(`환영합니다, ${user?.name}님!`);
        }
    });
}

// 타입 체크를 위한 유틸리티 함수
function isValidLoginResult(value: string): value is LoginResult {
    return Object.values(LoginResult).includes(value as LoginResult);
}

// 문자열에서 LoginResult로 변환하는 함수
function parseLoginResult(value: string): LoginResult | null {
    return isValidLoginResult(value) ? (value as LoginResult) : null;
}

// 실행
main();
testLogin();

// 추가 예제: 문자열 파싱 테스트
console.log("\n=== 문자열 파싱 테스트 ===");
const testStrings = ["SUCCESS", "FAIL_ID", "INVALID"];
testStrings.forEach(str => {
    const parsed = parseLoginResult(str);
    console.log(`"${str}" → ${parsed ? getLoginMessage(parsed) : "유효하지 않은 값"}`);
});

// Export for module usage
export { LoginResult, LoginSystem, getLoginMessage, LoginCredentials, User };