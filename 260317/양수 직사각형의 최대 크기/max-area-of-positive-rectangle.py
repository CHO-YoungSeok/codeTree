n, m = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]

# Please write your code here.
def log(msg):
    print(msg)
    pass

def get_size(r, c, dr, dc):
    for rr in range(dr):
        for cc in range(dc):
            if grid[r + rr][c + cc] <= 0:
                return -1
    
    return (dr + 1) * (dc + 1)

max_size = 0
for r in range(n):
    for c in range(m):
        for dr in range(n - r):
            for dc in range(m - c):
                curr_size = get_size(r, c, dr, dc)
                # log(f'{r} {c} {dr} {dc} {max_size}')
                if max_size < curr_size:
                    max_size = curr_size
                    log(f'{r} {c} {dr} {dc} {max_size}')


print(max_size)