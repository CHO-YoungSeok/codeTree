n = int(input())
grid = [list(map(int, input().split())) for _ in range(n)]

# Please write your code here.

dx = [
    -1, -1, -1,
    0, 0, 0,
    1, 1, 1
]

dy = [
    -1, 0, 1,
    -1, 0, 1,
    -1, 0, 1
]

max_sum = 0
for r in range(n):
    for c in range(n):
        sum = 0
        for i in range(9):
            xx = r + dx[i]
            yy = c + dy[i]

            if 0 <= xx and xx < n and 0 <= yy and yy < n:                
                sum += grid[xx][yy]
    
        max_sum = max(max_sum, sum)

print(max_sum)

