n, m = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]

# Please write your code here.

def check(start_x, start_y, i, j):
    for x in range(start_x, start_x + i + 1):
        for y in range(start_y, start_y + j + 1):
            if grid[x][y] <= 0:
                return False
    return True

answer = -1
for x in range(n):
    for y in range(m):
        for i in range(n - x):
            for j in range(m - y):
                if check(x, y, i, j):
                    answer = max(answer, (i + 1) * (j + 1))

print(answer)
