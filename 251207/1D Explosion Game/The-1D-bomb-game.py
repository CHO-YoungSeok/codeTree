n, m = map(int, input().split())
numbers = [int(input()) for _ in range(n)]

preLen = n
isFirst = True

while isFirst or preLen != len(numbers) :
    isFirst = False
    preLen = len(numbers)
    i = 0

    while i < len(numbers) :
        consecutation = 1

        while i + consecutation < len(numbers) and numbers[i + consecutation] == numbers[i] :
            consecutation += 1

        if consecutation >= m :
            del numbers[i:i+consecutation]
        else :
            i += consecutation

print(len(numbers))
for num in numbers :
    print(num)
