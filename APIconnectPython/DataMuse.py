import requests
import json
from requests.models import Response
import time

# MisIt's my simple application to looking for worlds, i use opensorce api (https://api.datamuse.com)
errorek = 'I know the application is written in English but..... ------>>   Something goes wrong'
print('Hello, what is your name?')
user_name = input("GiVE ME NAAAMMMEEEE:")
print('Hello, ' + user_name)
print('It is a console application, written in python, which uses open source api "https://api.datamuse.com".')
time.sleep(1.25)
print('1.You can find a word that rhymes with the word you enter:')
time.sleep(0.7)
print('2.Enter a word to be similar to yours')
time.sleep(0.7)
print('3.Find words that sound similar to yours')
time.sleep(0.7)
print('4.Enter a word to be strongly associated with your word')
time.sleep(1)

menu = input('Choose your number and press ENTER:  ')

if menu == "1":
    rhymes = input('Enter the word to rhyme with: ')
    response = requests.get(
        f'https://api.datamuse.com/words?rel_rhy={rhymes}')  # interlinia
    data = response.json()

    if (response.status_code != requests.codes.ok):
        print(errorek)
    else:
        print(print(json.dumps(data, indent=3)))

if menu == "2":
    similarly_word = input('Enter a word to be similar to yours ')
    response = requests.get(
        f'https://api.datamuse.com/words?sp={similarly_word}')
    data = response.json()

    if (response.status_code != requests.codes.ok):
        print(errorek)
    else:
        print(print(json.dumps(data, indent=3)))
else:
    print('ELO')

if menu == "3":
    sound = input('Find words that sound similar to yours: ')
    response = requests.get(f'https://api.datamuse.com/words?sl={sound}')
    data = response.json()

    if (response.status_code != requests.codes.ok):
        print(errorek)
    else:
        print(print(json.dumps(data, indent=3)))
else:
    print('ELO')

if menu == "4":
    associated = input(
        'Enter a word to be strongly associated with your word: ')
    response = requests.get(
        f'https://api.datamuse.com/words?rel_trg={associated}')
    data = response.json()

    if (response.status_code != requests.codes.ok):
        print(errorek)
    else:
        print(print(json.dumps(data, indent=3)))
else:
    print('ELO')

print('THANKS')
time.sleep(1)
print('>>>>>>>>>>>>>>>>>>>>>END OF APP<<<<<<<<<<<<<<<<<<<<<')
