import pandas as pd

df = pd.read_csv('C:\\data.csv')

print(df.to_string())
a = len(df.to_string())
print(a)