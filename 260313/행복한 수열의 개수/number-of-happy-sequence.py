import sys

n, m = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]

def log(msg):
    # print(msg)
    pass

# if n == 1 or m == 1:
#     print(2 * n)
#     sys.exit()
    

count_happy = 0
for i in range(n):
    max_seq = 1
    seq = 1

    for c in range(n - 1):
        if grid[i][c+1] == grid[i][c]:
           seq += 1
        else:
            seq = 1
        
        max_seq = max(seq, max_seq)
        
    if max_seq >= m:
        count_happy += 1
        log(f'col {i}, {c}')

for i in range(n):
    max_seq = 1
    seq = 1
    for r in range(n - 1):
        if grid[r + 1][i] == grid[r][i]:
           seq += 1
        else:
            seq = 1
        
        max_seq = max(seq, max_seq)
        
    if max_seq >= m:
        count_happy += 1
        log(f'row {r}, {i}')
    

print(count_happy)