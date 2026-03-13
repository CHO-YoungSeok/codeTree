n, m = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]

def log(str):
    # print(str)
    return

count_happy = 0
for i in range(n):
    seq = 1
    for c in range(1, n):
        if grid[i][c-1] == grid[i][c]:
           seq += 1
        else:
            seq = 1
        
        if seq >= m:
            count_happy += 1
            log(f'col {i}, {c}')
            break

for i in range(n):
    seq = 1
    for r in range(1, n):
        if grid[r - 1][i] == grid[r][i]:
           seq += 1
        else:
            seq = 1
        
        if seq >= m:
            count_happy += 1
            log(f'row {r}, {i}')
            break
    

print(count_happy)