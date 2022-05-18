n = int(input())
nBig = n // 10
nSmall = n % 10
cnt = 0
temp = 0

while True :
    cnt += 1
    temp = nBig + nSmall
    nBig = nSmall
    nSmall = temp % 10
    if n == nBig*10 + nSmall : break
print(cnt)