import math
n = int(input(""))

for i in range(1,(n*n)+1) :
    if i % n == 0 :
        print("*")
    else :
        if(i <= (n*math.ceil(i/n))-math.ceil(i/n)) :
            print(" ", end="")
        else :
            print("*", end="")