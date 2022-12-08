import requests
import datetime
import os.path

response = requests.get("http://deckofcardsapi.com/api/deck/new/draw/?count=1")
response.text
print(response.text)
print(len(response.text))
content = response.text
print('')
print('')
x = datetime.datetime.now()

year = str(x.strftime("%Y"))
month = str(x.strftime("%b"))
day = str(x.strftime("%d"))
hours = str(x.strftime("%H"))
minutes = str(x.strftime("%M"))
seconds = str(x.strftime("%S"))
microsecond = str(x.strftime("%f"))


filename = year + month + day + hours + minutes + seconds + microsecond
print(filename)

data_folder = "C:\\pythontestserwer\\"
file_to_open = data_folder + filename

try:
    f = open(file_to_open, "a")
    f.write(content +'length of written characters:   ' + str(len(response.text)))
    f.close()
except FileNotFoundError:
    print("I'm sorry but this directory doesn't exist")