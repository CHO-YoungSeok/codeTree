n = int(input())
grid = [list(map(int, input().split())) for _ in range(n)]
r, c, m1, m2, m3, m4, dir = map(int, input().split())

# Please write your code here.

r -= 1
c -= 1
rr = r
cc = c
dr = []
dc = []

import copy
temp = copy.deepcopy(grid)
if dir == 0:
    dr = [-1, -1, 1, 1]
    dc = [-1, 1, 1, -1]
    dis = [m4, m3, m2, m1]
else:
    dr = [-1, -1, 1, 1]
    dc = [1, -1, -1, 1]
    dis = [m1, m2, m3, m4]


for p in range(4):
    for _ in range(dis[p]):
        next_r = rr + dr[p]
        next_c = cc + dc[p]
        # print(f'log {rr} {cc} {next_r} {next_c} {temp[rr][cc]} {grid[next_r][next_c]}')
        temp[rr][cc] = grid[next_r][next_c]
        rr = next_r
        cc = next_c
        


grid = list(temp)
for row in grid:
    for cell in row:
        print(cell, end =" ")
    print()