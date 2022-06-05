n = int(input())

lts = [str(input()) for _ in range(n)]
lts = list(set(lts)) # 중복 제거
lts.sort() # 사전순 정렬
lts.sort(key=len) #길이순 정렬

for _ in lts:
    print(_)
