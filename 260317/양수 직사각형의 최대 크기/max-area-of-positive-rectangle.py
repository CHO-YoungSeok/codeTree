n, m = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]

# Please write your code here.

def get_size(r, c, h, w):
    for rr in range(h):
        for cc in range(c):
            if grid[r + rr][c + cc] > 0:
                continue
            else:
                return -1

    return h * w


max_size = 0
for r in range(n):
    for c in range(m):
        for h in range(1, n - r + 1):
            for w in range(1, m - c + 1):
                curr_size = get_size(r, c, h, w)
                max_size = max(max_size, curr_size)

print(max_size)