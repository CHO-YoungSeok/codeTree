n = int(input())
grid = [list(map(int, input().split())) for _ in range(n)]

# Please write your code here.
max_sum = 0

def log(msg):
    # print(msg)
    pass

def in_range(x, y):
    return 0 <= x and x < n and 0 <= y and y < n

def get_sum(r, c, w, h) -> int:
    dr = [-1, -1, 1, 1]
    dc = [1, -1, -1, 1]
    move_len = [w, h, w, h]
    sum = 0

    for dr, dc, move_len in zip(dr, dc, move_len):
        for _ in range(move_len):
            r += dr
            c += dc
            if in_range(r, c):
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

                
         

                
                

