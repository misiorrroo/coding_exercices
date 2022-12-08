import datetime
now = datetime.datetime.now()
print(f'{now:%c}')

x = datetime.datetime(2020, 5, 17) #z dupy jak się datę wprowadza
y = datetime.datetime(1022, 4, 11) 
z = (x-y)
print(z)


#na f sstringach podawac na to co sie wybiezre w datatime