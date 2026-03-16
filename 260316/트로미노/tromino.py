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



for r in range(n):
    for c in range(m):
        for shape_i in range(len(shape)):
            is_true = False

