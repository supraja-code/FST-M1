numbers = input("Enter a sequence of comma separated values: ")
numList = numbers.split(",")

firstElement = numbers[0]
print(firstElement)
lastElement = numbers[-1]
print(lastElement)

if(firstElement == lastElement):
    print(True)
else:
    print(False)