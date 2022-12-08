import mysql.connector

name = "asd"
second_name = "asd"
date_of_employment = "2012-12-12"
position = "asd"
salary = 100

mydb = mysql.connector.connect(
    host="localhost",
    user="root",
    password="Fizyka8%",
    database="sql-kurs"
)

mycursor = mydb.cursor()
# Rozbijam na dwie linie zeby bylo ladnie i czytelnie. Pamietaj o f
sql = f"INSERT INTO workers (name, second_name, date_of_employment, position, salary) \
        VALUES ('{name}', '{second_name}', '{date_of_employment}', '{position}', {salary})"

mycursor.execute(sql)

mydb.commit()
print("1 record inserted, ID:", mycursor.lastrowid)