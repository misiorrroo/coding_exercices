#import requests

#response = requests.get("https://collectionapi.metmuseum.org/public/collection/v1/objects/1524")
#response.text
#print(response.text)

import requests
import json

print('          IT IS API READER'             )
print('----The Metropolitan Museum of Art in NYC----')
objectid = input('Enter the identification number of the object you want to check')
objectidstr = str(objectid)
objectidint = int(objectidstr)
print(objectidint)
r = requests.get(f"https://collectionapi.metmuseum.org/public/collection/v1/objects/{objectidint}")
j = r.json()
print(j)
print('')
print('')
print('')
print('')
print('')
print(list(filter(lambda x:x["objectID"]==1524,j)))