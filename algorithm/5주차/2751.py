def merge_sort(array) :
    if len(array)<=1:
        return array

        # 재귀함수를 이용해서 끝까지 분할
        mid = len(array) // 2
        # 0부터 mid까지
        left = merge_sort(array[:mid])
        # mid부터 끝까지
        right = merge_sort(array[mid:])

        i,j,k = 0,0,0

        #분할된 배열끼리 비교
        while i<len(left) and j < len(right):
            if left[i] < right[j]
            