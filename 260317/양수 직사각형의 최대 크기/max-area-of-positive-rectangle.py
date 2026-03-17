n, m = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]

# Please write your code here.


def get_size(r, c, dr, dc):
    for ri in range(-1, dr):
        for ci in range(-1, dc):
            rr = r + ri + 1
            cc = c + ci + 1
            if 0 <= rr and rr < n and 0 <= cc and cc < m  \
                and grid[rr][cc] > 0:

                continue
            else:
                return -1
    return (dr + 1) * (dc + 1)

max_size = 0
for r in range(n):
    for c in range(m):
        for dr in range(n-r):
            for dc in range(m-c):
                curr_size = get_size(r, c, dr, dc)
                max_size = max(max_size, curr_size)

print(max_size)
                
                        
                            


            