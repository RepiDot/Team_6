n = int(input())

initArr = [0,1]
for i in range(2, n+1) :
    sum = initArr[i - 1] + initArr[i - 2]
    initArr.append(sum)

print(initArr[n])