n = int(input())
grid = [list(map(int, input().split())) for _ in range(n)]

# Please write your code here.
dx = [-1, 0, 1]
dy = [-1, 0, 1]

maxNum = 0
for r in range(n):
    for c in range(n):
        curr = 0;
        for xx in dx:
            for yy in dy:
                x = r + xx
                y = c + yy
                if x >= 0 and x < n and y >= 0 and y < n:
                    curr += grid[x][y]
        maxNum = max(maxNum, curr)
    
print(maxNum)