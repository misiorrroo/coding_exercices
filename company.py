import mysql.connector
from time import sleep

mydb = mysql.connector.connect(
    host="localhost",
    user="root",
    password="Fizyka8%",
    database="sql-kurs"
)

print("Wciśnij 1, Wyswietl wszystkich pracowników")
print("Wciśnij 2, Dodaj pracownika")
print("Wciśnij 3, Resetuj apkę")
print("Wciśnij 4, wYSZUKAJ")

opt = input("Wybierz opcję i potw enterem\n")\

if opt == "1":

    mycursor = mydb.cursor()
    mycursor.execute("SELECT * FROM workers;")
    myresult = mycursor.fetchall()
    for x in myresult:
        print(x)

elif opt == "2":
    name = input("Podaj imie: ")
    second_name = input("Podaj nazwisko: ")
    date_of_employment = input("Podaj date: ")
    position = input("Podaj position: ")
    salary = input("Podaj salary: ")

    mycursor = mydb.cursor()
    # Rozbijam na dwie linie zeby bylo ladnie i czytelnie. Pamietaj o f
    sql = "INSERT INTO workers (name, second_name, date_of_employment, position, salary) "
    sql = sql + f"VALUES ('{name}', '{second_name}', '{date_of_employment}', '{position}', {salary})" 
    mycursor.execute(sql)

    mydb.commit()

    print("1 record inserted, ID:", mycursor.lastrowid)


elif opt == "3":
    mycursor = mydb.cursor()

    sql = "DELETE FROM workers WHERE salary > 0;"

    mycursor.execute(sql)

    mydb.commit()

    print(mycursor.rowcount, "record(s) deleted")

elif opt == "4":
    print("36+36555555F")

else:
    print("oDPAL JESZCZE RAZ I WYBIERZ OPCJĘ")
