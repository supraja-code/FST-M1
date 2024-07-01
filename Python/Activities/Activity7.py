numbers = input("Enter a sequence of comma separated values: ")
numList = numbers.split(",")

sum = 0

for number in numList:
  sum += int(number)

print(sum)