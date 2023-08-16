def solution(num, k):
    answer = 0
    a = str(num).find(str(k))
    if a != -1:
        answer = a + 1
    else:
        answer = -1
    return answer