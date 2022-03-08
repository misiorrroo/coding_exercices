import random
import string

while(True):
    LETTERS = string.ascii_letters
    NUMS = '0123456789'
    SPE = '-+%&$!'
    SYMBOLS = LETTERS + NUMS + SPE
    len = int(input("Wprowadz długość hasła:"))
    try:
        password = ''.join(random.sample( SYMBOLS, len))
        print('Twoje hasło to' + password)
    except TypeError:
        print("TypeError!")
    finally:
        print('Trzymaj się')