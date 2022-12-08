def fibo(n):
    if n == 0:
        return 0
    if n == 1:
        return 1
    if n == 2:
        return 1
    else:
        return fibo(n-1) + fibo(n-2)


try:
    zakres = input('ile wyrazow ciagu Fibonacciego wydrukować')
    zakres2 = int(zakres)
    for n in range(zakres2):
        print(fibo(n))
except ValueError:
    print('liczba musi byc intem')
finally:
    print('gotowe!')
