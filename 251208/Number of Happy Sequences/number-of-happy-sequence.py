n, m = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]

answer = 0
for i in range(n):
    for j in range(n):
        consecutation = 1
        while consecutation + j < n \
            and grid[i][j] is grid[i][j + consecutation]:
            consecutation += 1
        
        if consecutation >= m:
            answer += 1
            break

for j in range(n):
    passJ = False
    for i in range(n):
        consecutation = 1
        while consecutation + i < n \
            and grid[i][j] is grid[i + consecutation][j]:
            consecutation += 1
        
        if consecutation >= m:
            answer += 1
            break

print(answer)