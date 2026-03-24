n, m, k = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]

# Please write your code here.
k -= 1

def get_break_r(m, k):
    global grid

    for rr in range(1, n):
        for cc in range(k, k+m):
            if grid[rr][cc] != 0:
                return rr - 1
    return n - 1

break_r = get_break_r(m, k)

for cc  in range(k, k+m):
    grid[break_r][cc] = 1

for row in grid:
    for cell in row:
        print(cell, end=' ')
    print()