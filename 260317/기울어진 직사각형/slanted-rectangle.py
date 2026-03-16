n = int(input())
grid = [list(map(int, input().split())) for _ in range(n)]

# Please write your code here.


max_sum = 0
dr = [-1, -1, 1, 1]
dc = [1, -1, -1, 1]

for r in range(n):
    for c in range(n):        
        for w in range(1, n):
            for h in range(1, n):
                sum = 0
                rr = r
                cc = c
                is_valid = True
                for ww in range(w):
                    rr += dr[0]
                    cc += dc[0]
                    if cc < n and rr < n and 0<= cc and 0<= rr:
                        sum += grid[rr][cc]
                    else:
                        is_valid = False
                        break
                for hh in range(h):
                    rr += dr[1]
                    cc += dc[1]
                    if cc < n and rr < n and 0<= cc and 0 <= rr:
                        sum += grid[rr][cc]
                    else:
                        is_valid = False
                        break
                for ww in range(w):
                    rr += dr[2]
                    cc += dc[2]
                    if cc < n and rr < n and 0<= cc and 0<= rr:
                        sum += grid[rr][cc]
                    else:
                        is_valid = False
                        break
                for hh in range(h):
                    rr += dr[3]
                    cc += dc[3]
                    if cc < n and rr < n and 0<= cc and 0 <= rr:
                        sum += grid[rr][cc]
                    else:
                        is_valid = False
                        break

                if is_valid and max_sum < sum:
                    # print(f'{r} {c} {w} {h}')
                    max_sum = max(max_sum, sum)




print(max_sum)

                
         

                
                