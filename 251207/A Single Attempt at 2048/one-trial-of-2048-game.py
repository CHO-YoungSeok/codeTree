n = 4
grid = [
    list(map(int, input().split()))
    for _ in range(n)
]
next_grid = [
    [0 for _ in range(n)]
    for _ in range(4)
]

def rotate():
    for i in range(n):
        for j in range(n):
            next_grid[i][j] = 0

    for i, row in  enumerate(grid):
        for j in range(n):
            next_grid[j][n - i - 1] = row[j]
print('\n'.join(map(str, grid)))    
rotate()
print('\n'.join(map(str, next_grid)))
            