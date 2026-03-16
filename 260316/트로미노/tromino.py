n, m = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]

# Please write your code here.

shape = [
    [
        [1, 0, 0],
        [1, 0, 0],
        [1, 0, 0],
    ],
    [
        [1, 1, 1],
        [0, 0, 0],
        [0, 0, 0],
    ],
    [
        [1, 0, 0],
        [1, 1, 0],
        [0, 0, 0],
    ],
    [
        [0, 1, 0],
        [1, 1, 0],
        [0, 0, 0],
    ],
    [
        [1, 1, 0],
        [0, 1, 0],
        [0, 0, 0],
    ],
    [
        [1, 1, 0],
        [1, 0, 0],
        [0, 0, 0],
    ],
]

di_x = [
    [-1, -1, -1],
    [0, 0, 0],
    [1, 1, 1],
]
di_y = [
    [-1, 0, 1],
    [-1, 0, 1],
    [-1, 0, 1],
]

def log(msg):
    # print(msg)
    pass

max_sum = 0

for r in range(n):
    for c in range(m):
        for shape_i in range(len(shape)):
            sum = 0
            is_valid = True
            for xi in range(3):
                for yi in range(3):
                    xx = r + xi
                    yy = c + yi
                    if (shape[shape_i][xi][yi] == 1):
                        if xx >= n or yy >= m :
                            is_valid = False
                            continue

                        sum += grid[xx][yy]

            if is_valid == True and max_sum < sum:
                max_sum = sum
                log(f'{r} {c} {sum}')


print(max_sum)



            
                    
                    
                    

                    



