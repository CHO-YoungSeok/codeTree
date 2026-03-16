n = int(input())
grid = [list(map(int, input().split())) for _ in range(n)]

# Please write your code here.
max_sum = 0

def log(msg):
    # print(msg)
    pass

def get_sum(r, c, w, h) -> int:
    dr = [-1, -1, 1, 1]
    dc = [1, -1, -1, 1]
    move_len = [w, h, w, h]
    sum = 0

    for dir in range(4):
        for ww in range(w):
            for hh in range(h):
                r += dr[dir]
                c += dc[dir]
                if 0 <= r and r < n and 0 <= c and c < n:
                    sum += grid[r][c]
                else:
                    return -1
    
    return sum



for r in range(n):
    for c in range(n):        
        for w in range(1, n):
            for h in range(1, n):
                sum = get_sum(r, c, w, h)
                if max_sum < sum:
                    log(f'{r} {c} {w} {h}')
                max_sum = max(max_sum, sum)




print(max_sum)

                
         

                
                
