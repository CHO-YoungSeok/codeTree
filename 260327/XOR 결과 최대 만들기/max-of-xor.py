n, m = map(int, input().split())
A = list(map(int, input().split()))

# Please write your code here.
# 0010
# 0100
# 0101
# -----
# 0011

# 0001
# 0011
# 0101
# -----
# 0111 

def log(msg):
    # print(msg)
    pass

nums = []
binary_nums = {}
max_score = 0

def choose(curr_n):
    global max_score

    if curr_n == m:
        score = get_score()
        max_score = max(max_score, score)
        return
    
    for k in range(n):
        if curr_n < 1 or A.index(nums[-1]) < k:
            nums.append(A[k])
            choose(curr_n + 1)
            nums.pop()    

import collections

def map_binary_nums():
    for num in A:
        nn = num
        binary = collections.deque()
        while num > 0:
            binary.appendleft(num%2)
            num //= 2
        
        binary_nums[nn] = binary


map_binary_nums()
log(binary_nums)

def get_score():
    score = 0
    binaries = []
    max_size = 0
    for num in nums:
        binaries.append(binary_nums[num])
        max_size = max(max_size, len(binary_nums[num]))
    
    for i in range(max_size):
        is_xor_true = False
        for bi in binaries:
            if len(bi) > i and bi[i] == 1:
                is_xor_true = True if not is_xor_true else False
        
        if is_xor_true:
            score += pow(2, i)                

    return score



choose(0)
print(max_score)