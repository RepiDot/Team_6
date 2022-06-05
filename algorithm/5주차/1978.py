i = 0
def primeNum (num):
    if num == 1 : 
        return 0
    for _ in range(2, num) :
        if num % _ == 0 or num == 1 : 
            return 0
    return 1


a = int(input())
n = list(map(int, input().split()))

for _ in n : 
    i = i + primeNum(_)

print(i)