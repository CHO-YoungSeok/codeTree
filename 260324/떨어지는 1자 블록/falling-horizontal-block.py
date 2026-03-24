n, m, k = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]

# Please write your code here.

k -= 1
def get_highest_row(r, c):
    for rr in range(1, n):
        for cc in range(k, k+m):
            if grid[rr][cc] == 1:
                return rr
    return n


rr = get_highest_row(m, k) - 1

for c in range(k, k+m):
    grid[rr][c] = 1

for row in grid:
    for cell in row:
        print(cell, end=' ')
    print()