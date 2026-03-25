n = int(input())
grid = [list(map(int, input().split())) for _ in range(n)]

def log(msg):
    print(msg)
    pass

# Please write your code here.
combos = []
combo = []
bombs = []
log(combos)

for r in range(n):
    for c in range(n):
        if grid[r][c] == 1:
            bombs.append((r, c))
log(f'bombs: {bombs} len = {len(bombs)}')

def choose(n):
    if n == len(bombs):
        combos.append(list(combo))
        return
    
    for i in range(3):
        combo.append(i)
        choose(n+1)
        combo.pop()

ds = [
    ([-2, -1, 0, 1, 1], [0, 0, 0, 0, 0]),
    ([-1, 0, 1, 0, 0], [0, 1, 0, -1, 0]),
    ([-1, -1, 1, 1, 0], [-1, 1, 1, -1, 0])
]
choose(0)
log(f'combos: {combos}')
log(f'ds: {ds}')

max_answer = 0
for combo in combos:
    killed_set = set()
    for r, c in bombs:
        for dr, dc in ds:
            for i in range(len(dr)):
                log(f'len(dr): {len(dr)}')
                rr = r + dr[i]
                cc = c + dc[i]
                if 0 <= min(rr, cc) and max(rr, cc) < n:
                    killed_set.add((rr, cc))
    max_answer = max(max_answer, len(killed_set))

print(max_answer)