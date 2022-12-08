import random
import string

while(True):
    LETTERS = string.ascii_letters
    NUMS = '0123456789'
    SPE = '-+%&$!'
    SYMBOLS = LETTERS + NUMS + SPE
    #print(type(len))
    #if(type(len) == int):
    try:
        len = int(input("Wprowadz długość hasła:"))
        password = ''.join(random.sample( SYMBOLS, len))
        print('Twoje hasło to' + password)
    except ValueError:
        print("TypeError!")
    finally:
        print('Trzymaj się')
else:
    print("ten wyjatek")