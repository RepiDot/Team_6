n = int(input())

for i in range(n) :
    oxLine = list(input())
    score = 0
    sumScore = 0
    for ox in oxLine:
        if ox == 'O':
            score += 1
            sumScore += score
        else:
            score = 0
    print(sumScore)