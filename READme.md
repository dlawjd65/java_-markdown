
# ☕ Java 학습 노트

한빛미디어 출판사의 [혼자 공부하는 자바] 책의<br>
목차별 핵심 키워드와 확인문제를 정리하였습니다.<br>
파일명은 챕터의 순서와 페이지 조합으로 작명하였습니다.

<br><br>

# 📚 목차

Chapter 1: 자바 시작하기<br>
Chapter 2: 변수와 타입<br>
Chapter 3: 연산자<br>
Chapter 4: 조건문과 반복문<br>
Chapter 5: 참조 타입<br>

<br><br>


# 🛠️ 프로젝트 구조
java-study/<br>
├── chapter1/          # 자바 시작하기<br>
├── chapter2/          # 변수와 타입<br>
│   ├── java/          # 실습 코드<br>
│   └── python/        # Python 비교 코드<br>
├── chapter3/          # 연산자<br>
│   └── java/<br>
├── chapter4/          # 조건문·반복문<br>
│   └── java/<br>
├── chapter5/          # 참조 타입<br>
│   ├── java/<br>
│   ├── TS/            # TypeScript 변환<br>
│   └── html/          # 웹 데모<br>
├── Python             # 파이썬 실행파일<br>
│   ├──Exam02          # 웹 데모<br>
└── └──logic           # 웹 데모<br>

<br>

## Chapter 1: 개발 환경 구축

### 핵심 개념
- **기계어**: 컴퓨터가 이해하는 0과 1로 이루어진 코드
- **프로그래밍 언어**: Java, C, Python 등 사람의 언어를 컴퓨터가 이해하도록 돕는 도구
- **JDK**: Java Development Kit - 자바 개발 도구
- **컴파일**: 소스 파일(.java)을 기계어(.class)로 번역하는 과정

### 실행 흐름
```
소스코드(.java) → javac 컴파일러 → 바이트코드(.class) → JVM → 기계어 → 실행
```

### 주요 학습 내용
- JDK 설치 및 환경변수 설정
- 이클립스 IDE 사용법
- 첫 프로그램 작성 및 실행

📂 **관련 파일**: `chapter1/1-38.md`, `chapter1/1-67.md`



<br>


## Chapter 2: 변수와 타입

### 기본 타입
| 구분 | 1byte | 2byte | 4byte | 8byte |
|------|-------|-------|-------|-------|
| 정수 | byte  | short, char | int | long |
| 실수 | - | - | float | double |
| 논리 | boolean | - | - | - |

### 타입 변환
- **자동 타입 변환**: 작은 타입 → 큰 타입
- **강제 타입 변환**: 큰 타입 → 작은 타입 (캐스팅)

```java
// 자동 변환
int a = 10;
double b = a;  // int → double

// 강제 변환
double x = 3.14;
int y = (int) x;  // double → int (소수점 버림)
```

### 입출력
- `System.out.println()`: 출력 후 줄바꿈
- `System.out.print()`: 출력만
- `System.out.printf()`: 형식 지정 출력
- `Scanner`: 사용자 입력 받기

📂 **관련 파일**: `chapter2/2-79.md`, `chapter2/2-92.md`, `chapter2/2-107.md`, `chapter2/2-120.md`



<br>


## Chapter 3: 연산자

### 연산자 우선순위
| 증감·부호·논리 | 산술 | 비교 | 논리 | 조건 | 대입 |
|---------------|------|------|------|------|------|
| ++, --, !, +, - | *, /, % → +, - | <, >, <=, >= | &&, \|\| | ?: | =, +=, -= |

### 주요 연산자
```java
// 증감 연산자
int x = 5;
int a = ++x;  // 전위: x를 먼저 증가 → a = 6
int b = x++;  // 후위: b에 먼저 대입 → x 증가

// 삼항 연산자
int score = 85;
String result = (score >= 90) ? "합격" : "불합격";

// 대입 연산자
int value = 10;
value += 5;  // value = value + 5
```

📂 **관련 파일**: `chapter3/3-128.md`, `chapter3/3-149.md`



<br>


## Chapter 4: 조건문과 반복문

### 조건문
```java
// if-else
if (score >= 90) {
    System.out.println("A등급");
} else if (score >= 80) {
    System.out.println("B등급");
} else {
    System.out.println("C등급");
}

// switch
switch(grade) {
    case 'A':
        System.out.println("우수");
        break;
    case 'B':
        System.out.println("보통");
        break;
    default:
        System.out.println("미흡");
}
```

### 반복문
```java
// for문
for (int i = 1; i <= 100; i++) {
    sum += i;
}

// while문
int i = 1;
while (i <= 10) {
    System.out.println(i);
    i++;
}

// 향상된 for문
for (int num : array) {
    System.out.println(num);
}
```

📂 **관련 파일**: `chapter4/4-167.md`, `chapter4/4-182.md`



<br>


## Chapter 5: 참조 타입

### 배열
```java
// 배열 선언 및 초기화
int[] scores = { 85, 90, 78 };
int[] numbers = new int[5];

// 2차원 배열
int[][] matrix = {
    { 1, 2, 3 },
    { 4, 5, 6 }
};

// 배열 길이
int length = scores.length;
```

### 열거 타입
```java
// 열거 타입 선언
public enum Week {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, 
    FRIDAY, SATURDAY, SUNDAY
}

// 사용
Week today = Week.FRIDAY;
```

### 기본 타입 vs 참조 타입
- **기본 타입**: 값을 직접 저장 (스택)
- **참조 타입**: 객체의 주소를 저장 (힙)
- **null**: 참조하는 객체가 없음을 의미

📂 **관련 파일**: `chapter5/5-197.md`, `chapter5/5-221.md`, `chapter5/5-232.md`


<br><br>


# 🚀 시작하기

### 1. JDK 설치
```bash
# OpenJDK 17 다운로드
# https://github.com/openjdk/jdk

# 환경변수 설정
JAVA_HOME = C:\Program Files\Java\jdk-17
Path += %JAVA_HOME%\bin
```

### 2. 컴파일 및 실행
```bash
# 컴파일
javac HelloWorld.java

# 실행
java HelloWorld
```

### 3. 설치한 확장 프로그램
1. Extension Pack for JAVA<br> 자바 코드 작성, 빌드, 디버깅, 단위 테스트 환경을 한 번에 세팅<br><br>
2. Debugger for JAVA<br> 단계별로 실행·변수값 추적 및 디버깅, IDE급 디버깅 경험을 제공<br><br>
3. MAVEN for Java<br>pom.xml을 인식해 dependency 추가/업데이트 자동화,<br> Spring Boot, Tomcat 등 Maven 기반 프로젝트 관리<br><br>
4. Dev Containters <br> .devcontainer 폴더에 Dockerfile/설정을 넣으면<br> “Reopen in Container” 클릭 → 컨테이너 안에서 바로 코딩·빌드가능 <br>VS Code가 Docker 컨테이너 내부를 개발 환경처럼 사용할 수 있음<br><br>
5. ERD Edit<br>데이터베이스 테이블 관계도를 시각적으로 편집<br><br>
6. Python<br>Python 언어 지원, 가상환경(venv, conda) 인식, 테스트 실행, 포맷터(Black, autopep8) 등<br>Flask/Django 서버 개발, 데이터 분석, 스크립트 작성<br><br>
7. Community Server Connect(tomcat대신)<br>Tomcat, Jetty 같은 서버 런타임을 VS Code에서 직접 실행/배포할 수 있도록 도움

<br>
<br>

## 🔗 참고하기 좋은 자료

- [Java 공식 문서](https://docs.oracle.com/en/java/)
- [OpenJDK](https://openjdk.org/)
- [Java Tutorials](https://docs.oracle.com/javase/tutorial/)
