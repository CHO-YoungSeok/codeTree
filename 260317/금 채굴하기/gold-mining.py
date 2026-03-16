n, m = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]

# Please write your code here.


max_count = 0
for r in range(n):
    for c in range(n):
        for k in range(n + 1):
            count = 0
            for rr in range(n):
                for cc in range(n):
                    dis = abs(r - rr) + abs(c - cc)
                    if grid[rr][cc] == 1 and dis <= k :
                        count += 1
            
            if m * count >= pow(k, 2) + pow(k + 1, 2):
                max_count = max(max_count, count)
            
            
print(max_count)


