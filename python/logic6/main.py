from fastapi import FastAPI
from pymongo import MongoClient

app = FastAPI()

client = MongoClient("mongodb://localhost:27017/")
db = client["testdb"]
collection = db["results"]

@app.get("/")
def calc_and_save():
    x = 5
    y = 2
    result = x // y
    # MongoDB에 저장
    collection.insert_one({"result": result})
    return {"result": result}

@app.get("/all")
def read_all():
    docs = list(collection.find({}, {"_id":0}))
    return {"all_results": docs}
