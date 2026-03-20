n = int(input())
a = [list(map(int, input().split())) for _ in range(n)]
r, c, m1, m2, m3, m4, dir = map(int, input().split())

# Please write your code here.

r -= 1
c -= 1
rr = r
cc = c

if dir == 0:
    temp = a[r][c]
    for _ in range(m4):
        next_r = rr -1
        next_c = cc - 1
        a[rr][cc] = a[next_r][next_c]
        rr = next_r
        cc = next_c
    for _ in range(m3):
        next_r = rr - 1
        next_c = cc + 1
        a[rr][cc] = a[next_r][next_c]
        rr = next_r
        cc = next_c
    for _ in range(m2):
        next_r = rr + 1
        next_c = cc + 1
        a[rr][cc] = a[next_r][next_c]
        rr = next_r
        cc = next_c
    for _ in range(m1 - 1):
        next_r = rr + 1
        next_c = cc - 1
        a[rr][cc] = a[next_r][next_c]
        rr = next_r
        cc = next_c
    a[r-1][c+1] = temp  
    
else:
    temp = a[r][c]
    for _ in range(m1):
        next_r = rr -1
        next_c = cc + 1
        a[rr][cc] = a[next_r][next_c]
        rr = next_r
        cc = next_c
    for _ in range(m2):
        next_r = rr -1
        next_c = cc -1
        a[rr][cc] = a[next_r][next_c]
        rr = next_r
        cc = next_c
    for _ in range(m3):
        next_r = rr +1
        next_c = cc -1
        a[rr][cc] = a[next_r][next_c]
        rr = next_r
        cc = next_c
    for _ in range(m4-1):
        next_r = rr +1
        next_c = cc +1
        a[rr][cc] = a[next_r][next_c]
        rr = next_r
        cc = next_c

    a[r-1][c-1] = temp


for row in a:
    for cell in row:
        print(f'{cell}', end=" ")
    print()

