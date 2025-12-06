n, m  = map(int, input().split())
numbers = [int(input()) for _ in range(n)]

isFirst = True
preCount = n

while isFirst or preCount != len(numbers) :
    isFirst = False
    preCount = len(numbers)
    i = 0
    
    while i < len(numbers) :
        consecutation = 1
        while i + consecutation < len(numbers) and numbers[i] == numbers[i + consecutation] :
            consecutation += 1

        if consecutation >= m :
            del numbers[i : i + consecutation]
        else :
            i += 1

print(len(numbers))
for num in numbers : 
    print(num)