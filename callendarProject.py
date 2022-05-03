import calendar

year = 2021
month = 5

y1 = 1000
y2 = 1400

print(calendar.month(year, month))

print (calendar.isleap(year))


#dictionares
child1 = {
  "name" : "Emil",
  "year" : 2004
}
child2 = {
  "name" : "Tobias",
  "year" : 2007
}
child3 = {
  "name" : "Linus",
  "year" : 2011
}

myfamily = {
  "child1" : child1,
  "child2" : child2,
  "child3" : child3
}
print(myfamily)