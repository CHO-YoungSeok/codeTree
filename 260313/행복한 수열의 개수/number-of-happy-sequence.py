n, m = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]

# Please write your code here.

count_happy = 0
for r in range(n):
    max_cnum = 1
    cnum = 1  
    
    for c in range(n-1):
        if grid[r][c] == grid[r][c+1]:
            cnum += 1
        else:
            cnum = 1
        
        max_cnum = max(max_cnum, cnum)
    
    if max_cnum >= m:
        count_happy += 1

for c in range(n):
    max_cnum = 1
    cnum = 1  
    
    for r in range(n-1):
        if grid[r + 1][c] == grid[r][c]:
            cnum += 1
        else:
            cnum = 1
        
        max_cnum = max(max_cnum, cnum)
    
    if max_cnum >= m:
        count_happy += 1

print(count_happy)

            
        