n, m = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]

# Please write your code here.

max_gold: int = 0

for r in range(n):
    for c in range(n):
        for k in range(1, n):
            gold_count = 0
            for rr in range(n):
                for cc in range(n):
                    if grid[rr][cc] == 1 and abs(r - rr) + abs(c -cc) <= k:
                        gold_count += 1
            if gold_count * m >= pow(k, 2) + pow(k+1, 2):
                max_gold = max(max_gold, gold_count)

print(max_gold)                   