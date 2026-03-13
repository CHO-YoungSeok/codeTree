n, m = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]

# Please write your code here.

shape = [
    [
        [0, 1, 0],
        [0, 1, 1],
        [0, 0, 0]
    ],
    [
        [0, 0, 0],
        [0, 1, 1],
        [0, 1, 0]
    ],
    [
        [0, 0, 0],
        [1, 1, 0],
        [0, 1, 0]
    ],
    [
        [0, 1, 0],
        [1, 1, 0],
        [0, 0, 0]
    ],
    [
        [0, 1, 0],
        [0, 1, 0],
        [0, 1, 0]
    ],
    [
        [0, 0, 0],
        [1, 1, 1],
        [0, 0, 0]
    ],
]

index= [
    -1, 0, 1
]

max_sum = 0

for r in range(n):
    for c in range(n):
        sum = 0
        for s in range(len(shpae)):
            for x in range(3):
                for y in range(3):
                    xx = r + index[x]
                    yy = c + index[y]
                    if (shape[s][x][y] == 1
                        and 0 <= xx and xx < n  
                        and 0 <= yy and yy <= n):

                        sum += grid[xx][yy]

        
        max_sum = max(max_sum, sum)


p



