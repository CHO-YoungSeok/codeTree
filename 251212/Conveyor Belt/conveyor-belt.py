n, t = map(int, input().split())

up = list(map(int, input().split()))
down = list(map(int, input().split()))

belt = up + down
# print(belt)

while 0 < t:
    temp = belt[n * 2 - 1]
    for i in range(n * 2 -1, -1, -1):
        belt[i] = belt[i - 1]
    
    belt[0] = temp
    t -= 1


up = belt[:n]
down = belt[n:]

print(' '.join(map(str, up)))
print(' '.join(map(str, down)))