n, m = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]

# Please write your code here.
def log(msg):
    # print(msg)
    pass

shapes = [
    [(0,0), (0,1), (0,2)],
    [(0,0), (1,0), (2,0)],

    [(0,0), (1,0), (1,1)],
    [(0,1), (1,0), (1,1)],
    [(0,0), (0,1), (1,1)],
    [(0,0), (1,0), (0,1)],
]

max_sum = 0

for r in range(n):
    for c in range(m):
        for shape in shapes:
            sum = 0
            for dr, dc in shape:
                rr = r + dr
                cc = c + dc
                if 0 <= rr and rr < n and 0 <= cc and cc < m:
                    sum += grid[rr][cc]
                else:
                    sum = -1
                    break
            
            if max_sum < sum:
                max_sum = sum
                log(f'{r} {c} {max_sum}')

print(max_sum)