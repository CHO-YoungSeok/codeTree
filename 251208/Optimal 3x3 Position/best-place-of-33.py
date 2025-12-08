n = int(input())
grid = [list(map(int, input().split())) for _ in range(n)]

# print('\n'.join(map(str, grid)))

dx = [
    -1, 0, 1,
    -1, 0, 1,
    -1, 0, 1
]

dy = [
    -1, -1, -1,
    0, 0, 0,
    1, 1, 1
]

maxCount = 0
for i in range(1, n - 1):
    for j in range(1, n - 1):
        count = 0
        for k in range(9):
            if grid[i + dx[k]][j + dy[k]] == 1:
                count += 1
        
        maxCount = max(maxCount, count)


print(maxCount)


