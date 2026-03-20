n = int(input())
blocks = [int(input()) for _ in range(n)]
s1, e1 = map(int, input().split())
s2, e2 = map(int, input().split())

# Please write your code here.
def act(s, e):
    s -= 1
    e -= 1
    global blocks
    temp_arr = []
    for i in range(len(blocks)):
        if s <= i and i <= e:
            continue
        
        temp_arr.append(blocks[i])
    blocks = list(temp_arr)

act(s1, e1)
act(s2, e2)

print(len(blocks))

for num in blocks:
    print(num)