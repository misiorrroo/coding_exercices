from flask import Flask
from flask import jsonify
app = Flask (__name__)


@app.route('/test' , methods = ['GET'])
def test():
    return jsonify (result = 'to jest test', cosjsno1 = 'testtest')


app.run(port=5000)