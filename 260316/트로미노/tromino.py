n, m = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]

# Please write your code here.
def log(msg):
    # print(msg)
    pass

origin_shape = [
    [(0,0), (1,0), (2,0)],
    [(0,0), (1,0), (0,1)],
]

shape_set = set()
for shape in origin_shape:
    rotated_shape = shape

    for _ in range(4):
        rotated_shape = [(c, -r) for r, c in rotated_shape]
        min_r = min(r for r, c in rotated_shape)
        min_c = min(c for r, c in rotated_shape)
        rotated_shape = [(r - min_r, c - min_c) for r, c in rotated_shape]
        shape_set.add(tuple(sorted(rotated_shape)))

log(shape_set)
log(len(shape_set))

max_sum = 0

for r in range(n):
    for c in range(m):
        for shape in shape_set:
            sum = 0
            for dr, dc in shape:
                rr = r + dr
                cc = c + dc
                if rr < n and cc < m:
                    sum += grid[rr][cc]
                else:
                    sum = -1
                    break;

            if max_sum < sum:
                max_sum = sum
                log(f'{sum} {r} {c} {rr} {cc}')

print(max_sum)


        