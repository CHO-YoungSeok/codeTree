n, m = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]

# Please write your code here.


def get_size(r, c, dr, dc):
    for ri in range(dr):
        for ci in range(dc):
            rr = r + ri 
            cc = c + ci 
            if 0 <= rr and rr < n and 0 <= cc and cc < m  \
                and grid[rr][cc] > 0:

                continue
            else:
                return -1
    return (dr) * (dc)

max_size = 0
for r in range(n):
    for c in range(m):
        for dr in range(1, n-r+1):
            for dc in range(1, m-c+1):
                curr_size = get_size(r, c, dr, dc)
                max_size = max(max_size, curr_size)

print(max_size)
                
                        
                            


            