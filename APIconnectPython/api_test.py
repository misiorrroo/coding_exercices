import requests

url = "https://try.count.ly/o/system/cpu"

querystring = {"api_key":"api_key"}

headers = {"Accept": "application/json"}

response = requests.request("GET", url, headers=headers, params=querystring)

print(response.text)