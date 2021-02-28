import mysql.connector
from time import sleep

mydb = mysql.connector.connect(
    host="localhost",
    user="root",
    password="Fizyka8%",
    database="sql-kurs"
)
mycursor = mydb.cursor()
mycursor.execute("SELECT * FROM freestylepassword;")
myresult = mycursor.fetchall()

for x in myresult:
    print(x)

sleep(1)
print("To nie koniec ziomek!")
sleep(4)

print("Średnie jakieś z pizdy, z tych kurwa numerków:")
mycursor = mydb.cursor()
mycursor.execute("AVG(numer) FROM freestylepassword WHERE 16516461;")
myresult = mycursor.fetchall()

for x in myresult:
    print(x)
