n, m = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]

# Please write your code here.
def log(msg):
    # print(msg)
    pass


def normalize(shape):
    min_r = min(r for r, c in shape)
    min_c = min(c for r, c in shape)
    return tuple(sorted([(r - min_r, c - min_c) for r, c in shape]))

origin_shapes = [
    [(0,0), (0,1), (0,2)],
    # [(0,0), (1,0), (2,0)],

    [(0,0), (1,0), (1,1)],
    # [(0,1), (1,0), (1,1)],
    # [(0,0), (0,1), (1,1)],
    # [(0,0), (1,0), (0,1)],
]

shapes = []
max_sum = 0

for ori_shape in origin_shapes:
    sh_set = set()
    curr = ori_shape
    for _ in range(4):
        curr = normalize([(c, -r) for r, c in curr])
        sh_set.add(curr)
    
    shapes.extend([list(v) for v in sh_set])


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