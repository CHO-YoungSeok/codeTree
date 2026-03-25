K, N = map(int, input().split())

# Please write your code here.
answer = []

def choose(curr_n):
    if (curr_n > N):
        print(*answer)
        return
    
    for i in range(1, K + 1):
        answer.append(i)
        choose(curr_n+1)
        answer.pop()

choose(1)