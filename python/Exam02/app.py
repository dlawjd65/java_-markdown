# app.py
from flask import Flask, request, render_template_string, jsonify
from exam02 import simulate_login, LoginResult  # 같은 폴더의 exam02.py 사용

app = Flask(__name__)

HTML = """
<!doctype html>
<title>Login Demo</title>
<h2>로그인 테스트</h2>
<form method="post" action="/login">
  <label>ID</label><br/>
  <input name="user_id" required><br/><br/>
  <label>Password</label><br/>
  <input name="password" type="password" required><br/><br/>
  <button type="submit">로그인</button>
</form>
{% if result %}
  <hr/>
  <p><b>결과:</b> {{ result }}</p>
{% endif %}
<p style="margin-top:20px;">
  API: <code>POST /api/login {"user_id":"admin","password":"12345"}</code>
</p>
"""

@app.route("/", methods=["GET"])
def index():
    return render_template_string(HTML)

@app.route("/login", methods=["POST"])
def login_form():
    user_id = request.form.get("user_id","").strip()
    password = request.form.get("password","").strip()
    res = simulate_login(user_id, password)
    return render_template_string(HTML, result=res.get_message() if hasattr(res, "get_message") else str(res))

@app.post("/api/login")
def login_api():
    data = request.get_json(force=True, silent=True) or {}
    user_id = (data.get("user_id") or "").strip()
    password = (data.get("password") or "").strip()
    res: LoginResult = simulate_login(user_id, password)
    return jsonify({
        "result": res.name,
        "message": getattr(res, "get_message", lambda: res.name)()
    })

if __name__ == "__main__":
    app.run(host="127.0.0.1", port=8080, debug=True)
