def solution(array):
    answer = 0
    strarr = ''.join(map(str, array))
    arr = list(strarr)
    print(arr)
    for i in arr:
        if i == '7':
            answer = answer + 1
        else:
            continue
    return answer