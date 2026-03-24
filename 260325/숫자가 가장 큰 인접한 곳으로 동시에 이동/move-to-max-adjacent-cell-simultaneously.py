n, m, t = map(int, input().split())

# Create n x n grid
grid = [list(map(int, input().split())) for _ in range(n)]

# Get m marble positions
marbles = [tuple(map(int, input().split())) for _ in range(m)]
r = [pos[0] for pos in marbles]
c = [pos[1] for pos in marbles]

# Please write your code here.
def log(msg):
    # print(msg)
    pass

count_grid = [[0]*n for _ in range(n)]
def move(r, c):
    global grid, count_grid
    dr = [-1, 1, 0, 0]
    dc = [0, 0, -1, 1]
    next_r = 0; next_c = 0;
    max_value = 0

    for i in range(4):
        rr = r + dr[i]
        cc = c + dc[i]
        if 0 <= min(rr, cc) and max(rr, cc) < n and max_value < grid[rr][cc]:
            max_value = grid[rr][cc]
            next_r = r
            next_c = c
    
    count_grid[next_r][next_c] += 1
    count_grid[r][c] -= 1

def conflict():
    global count_grid
    for r in range(n):
        for c in range(n):
            if count_grid[r][c] > 1:
                count_grid[r][c] = 0


for marble in marbles:
    count_grid[marble[0] - 1][marble[1] - 1] += 1

for _ in range(t):
    temp = [[0]*n for _ in range(n)]
    for r_idx in range(n):
        for c_idx in range(n):
            if count_grid[r_idx][c_idx] > 0:
                dr = [-1, 1, 0, 0]
                dc = [0, 0, -1, 1]
                next_r = 0; next_c = 0;
                max_value = 0

                for i in range(4):
                    rr = r_idx + dr[i]
                    cc = c_idx + dc[i]
                    if 0 <= min(rr, cc) and max(rr, cc) < n and max_value < grid[rr][cc]:
                        max_value = grid[rr][cc]
                        next_r = rr
                        next_c = cc
                temp[next_r][next_c] += 1
    import copy
    count_grid = copy.deepcopy(temp)                      
    conflict()

log(count_grid)

answer = 0
for row in count_grid:
    for cell in row:
        if cell > 0:
            answer += 1

print(answer)