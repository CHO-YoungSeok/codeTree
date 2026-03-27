N, M = map(int, input().split())

# Please write your code here.

nums = []
def choose(curr_n):
    if curr_n == M:
        print(*nums)
        return
    
    for k in range(1, N+1):
        if curr_n < 1 or nums[-1] < k:
            nums.append(k)
            choose(curr_n+1)
            nums.pop()

choose(0)        