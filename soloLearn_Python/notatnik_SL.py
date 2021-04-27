#from math import sqrt, pi......

#The last type is called the standard library, 
# and contains many useful modules. Some of the standard library's useful modules include 
# string, re, datetime, math, random, os, multiprocessing, subprocess, socket, email, json, doctest, unittest, pdb, argparse and sys

letters = ['a', 'b', 'z']

if "z" in letters:

  print("Yes")

  for i in range(0, 20, 2):
    print(i)

list = [1, 1, 2, 3, 5, 8, 13]
print(list[list[4]])

for i in range(10):
  if not i % 2 == 0:
    print(i+1)

n = int(input())

for x in range(1, n):
    if x % 3 == 0 and x % 5 == 0:
        print("SoloLearn")
    elif x % 3 == 0:
        print("Solo")
    elif x % 5 == 0:
        print("Learn")
    else:
        print(x)

def print_sum_twice(x, y):
   print(x + y)
   print(x + y)

print_sum_twice(5, 8)

celsius = int(input())

def conv(c):
    fahrenheit = 9/5 * celsius + 32
    return fahrenheit

fahrenheit = conv(celsius)
print(fahrenheit)

try:
  variable = 10
  print (10 / 2)
except ZeroDivisionError:
  print("Error")
print("Finished")


try:
  meaning = 42
  print(meaning / 0)
  print("the meaning of life")
except (ValueError, TypeError):
  print("ValueError or TypeError occurred")
except ZeroDivisionError:
  print("Divided by zero")

try:
  num1 = input(":")
  num2 = input(":")
  print(float(num1)/(num2))
  except:
  print("Invalid code") #z wyjątkiem:

  try:
  print(1)
except:
  print(2)
finally:
  print(3)
  #drukuje 1 i 3