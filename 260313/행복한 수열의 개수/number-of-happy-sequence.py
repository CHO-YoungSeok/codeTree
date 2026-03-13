import sys

n, m = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]

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
    

print(count_happy)