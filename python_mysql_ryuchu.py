import mysql.connector

connection = mysql.connector.connect(host='localhost', 
user= 'root', 
password='Fizyka8%', 
database='python_rychu', 
auth_plugin='mysql_native_password'
)

query = 'SELECT * FROM users'
cursor = connection.cursor()
cursor.execute(query)

for x in cursor:
    print(x)