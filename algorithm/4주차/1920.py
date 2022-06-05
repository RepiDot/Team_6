n = int(input())
questionArr = list(map(int,input().split()))
m = int(input())
answerArr = list(map(int, input().split()))

questionArr.sort()

for num in answerArr :
    lt,rt = 0, n-1
    arrChk = False

    while lt <= rt :
        mid = (lt + rt) // 2

        if num == questionArr[mid] :
            arrChk = True
            print(1)
            break
        elif num > questionArr[mid] :
            lt = mid + 1
        else :
            rt = mid - 1
    
    if not arrChk :
        print(0)
