n, t = map(int, input().split())

up = list(map(int, input().split()))
down = list(map(int, input().split()))

belt = up + down

while 0 < t:
    temp = belt[2 * n - 1]
    for i in range(2 * n - 1, -1, -1):
        belt[i] = belt[i - 1]
    
    belt[0] = temp

print(belt)
