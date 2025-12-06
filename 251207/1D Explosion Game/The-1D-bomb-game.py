n, m = map(int, input().split())
numbers = [int(input()) for _ in range(n)]

preCount = n
isFirst = True

while isFirst or preCount != len(numbers):
    isFirst = False
    preCount = len(numbers)
    i = 0
    
    while i < len(numbers):
        consecution = 1
        # 연속된 같은 숫자 개수 세기
        while i + consecution < len(numbers) and numbers[i] == numbers[i + consecution]:
            consecution += 1
        
        # m개 이상 연속이면 제거
        if consecution >= m:
            numbers = numbers[:i] + numbers[i + consecution :]
        else:
            i += 1

# 결과 출력
print(len(numbers))
for num in numbers:
    print(num)
