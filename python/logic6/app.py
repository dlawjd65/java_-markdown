from flask import Flask

app = Flask(__name__)

@app.route("/")
def index():
    x = 5
    y = 2
    result = x // y  # 정수 나눗셈
    return str(result)  # 브라우저에 "2" 출력

if __name__ == "__main__":
    app.run(host="127.0.0.1", port=8080, debug=True)
