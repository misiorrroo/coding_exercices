
my_list = [1, 3, 5, 7, 9]

def binary_search(list, item):
    low = 0
    high = len(list) - 1
    guess = 0
    while low <=high:
        mid = (low + high)
        guess = list[mid]
        if guess == item:
            return mid
        if guess > item:
            high = mid -1
        else:
            low = mid + 1
    return None

print (binary_search(my_list, 3))