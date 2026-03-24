n, r, c = map(int, input().split())
a = [[0] * (n + 1) for _ in range(n + 1)]

for i in range(1, n + 1):
    row = list(map(int, input().split()))
    for j in range(1, n + 1):
        a[i][j] = row[j - 1]

# Please write your code here.
import copy
import collections

grid = copy.deepcopy(a)

dr = [-1, 1, 0, 0]
dc = [0, 0, -1, 1]

def in_range(r, c):
    return 0 <= min(r,c) and max(r,c) < n

def move_to_bigger(r, c) -> tuple[bool, int, int]:
    for i in range(4):
        rr = r + dr[i]
        cc = c + dc[i]
        if in_range(rr, cc) and grid[r][c] < grid[rr][cc]:
            return (True, rr, cc)
    
    return (False, 0, 0)

history = []
while True:
    history.append(grid[r][c])
    has_bigger, r, c = move_to_bigger(r, c)
    if not has_bigger:
        break

print(*history)