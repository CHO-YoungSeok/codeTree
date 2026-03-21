n, m = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]
commands = [int(input()) for _ in range(m)]
m = n

# Please write your code here.
def log(msg):
    # print(f'log: {msg}')
    pass

def boom(r, c):
    global grid
    size = grid[r][c]
    dr = [-1, 0, 1, 0]
    dc = [0, 1, 0, -1]    

    for p in range(4):
        rr = r; cc = c
        for _ in range(size):
            if not in_range(rr, cc):
                break
            grid[rr][cc] = 0
            rr += dr[p]
            cc += dc[p]
    
def in_range(r, c):
    return 0 <= r and r < n and 0 <= c and c < m

def down():
    global grid
    temp = [[0] * m for _ in range(n)]
    for c in range(m):
        cc = c
        rr = n - 1
        for r in range(n-1, -1, -1):
            if grid[r][c] == 0:
                continue
            
            temp[rr][cc] = grid[r][c]
            rr -= 1
    
    import copy
    grid = copy.deepcopy(temp)
    log(f'down: {grid}')

def get_top(c):
    global grid
    top = 0
    for r in range(n):
        if grid[r][c] != 0:
            top = r
            break
    return top

for col in commands:
    col -= 1
    boom(get_top(col), col)
    down()
    log(f'log: {col} {grid}')

for row in grid:
    for cell in row:
        print(cell, end=' ')
    print()