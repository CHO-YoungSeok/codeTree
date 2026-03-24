n, m, t = map(int, input().split())

# Create n x n grid
a = [list(map(int, input().split())) for _ in range(n)]

# Get m marble positions
marbles = [tuple(map(int, input().split())) for _ in range(m)]
r = [pos[0] for pos in marbles]
c = [pos[1] for pos in marbles]

# Please write your code here.

import copy
grid = copy.deepcopy(a)

count = [[0] * n for _ in range(n)]
for r, c in marbles:
    count[r-1][c-1] += 1

# print(count)

def conflict():
    global count
    for r in range(n):
        for c in range(n):
            if count[r][c] > 1:
                # print(f'{r} {c} {count}')
                count[r][c] = 0
                

def move(r, c):
    global grid, count
    dr = [-1, 1, 0, 0]
    dc = [0, 0, -1, 1]
    next_r = 0
    next_c = 0
    max_value = 0
    
    for i in range(4):
        rr = r + dr[i]
        cc = c + dc[i]        
        if 0 <= min(rr, cc) and max(rr,cc) < n and max_value < grid[rr][cc]:
            next_r = rr
            next_c = cc
            max_value = grid[rr][cc]
    
    count[r][c] -= 1
    count[next_r][next_c] += 1


for tt in range(t):
    for rr in range(n):
        for cc in range(n):
            if count[rr][cc] > 0:
                move(rr, cc)
    conflict()
# print(count)

marble_count = 0
for rr in range(n):
    for cc in range(n):
        if count[rr][cc] > 0:
            marble_count += 1

print(marble_count)