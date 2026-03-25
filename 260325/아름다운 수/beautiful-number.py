N = int(input())

# Please write your code here.
nums = []
answer = 0
def choose(n):
    global answer
    if n == N:
        answer += 1
        return
    elif n > N:
        return
    
    for k in range(1, 4+1):
        for kk in range(k):
            nums.append(k)
        choose(n + k)
        for kk in range(k):
            nums.pop()


choose(0)
print(answer)

