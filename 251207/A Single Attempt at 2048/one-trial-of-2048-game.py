grid = [
    list(map(int, input().split()))
    for _ in range(4)
]
dir = input()

dir_num = {
    'D' : 0,
    'R' : 1,
    'U' : 2,
    'L' : 3
}

# print('\n'.join(map(str, grid)))

def rotate():
    global grid

    next_grid = [
        [0, 0, 0, 0] for _ in range(4)
    ]

    for i, row in enumerate(grid):
        for j in range(4):
            next_grid[j][4 - 1 - i] = row[j]

    grid = next_grid

# rotate()
# print('\n'.join(map(str, grid)))

def drop():
    next_grid = [
        [0, 0, 0, 0] for _ in range(4)
    ]

    for j in range(4):
        global grid
        next_row, curr_num = 3, None
        for i in range(3, -1, -1):
            if grid[i][j] is 0:
                continue
            
            if curr_num is None:
                curr_num = grid[i][j]

            elif curr_num is grid[i][j]:
                next_grid[next_row][j] = curr_num * 2
                curr_num = None
                next_row -= 1
                
            else:
                next_grid[next_row][j] = curr_num
                curr_num = grid[i][j]
                next_row -= 1   

        if curr_num is not None:
            next_grid[next_row][j] = curr_num
            curr_num = None
            next_row -= 1
        
    grid = next_grid

# drop()
# print('\n'.join(map(str, grid)))

def tilt(rotate_count):
    for _ in range(rotate_count):
        rotate()
    
    drop()

    if rotate_count is not 0:
        for _ in range(4 - rotate_count):
            rotate()
    


tilt(dir_num[dir])
for row in grid:
    for num in row:
        print(num, end=' ')
    print()

    


        