def solution(quiz):
    answer = []
    ans = 0
    for i in quiz:
        left, right = i.split('=')
        cal = left.split()
        if cal[1] == '+':
            ans = int(cal[0]) + int(cal[2])
            if ans == int(right):
                answer.append('O')
            else:
                answer.append('X')
        else:
            ans = int(cal[0]) - int(cal[2])
            if ans == int(right):
                answer.append('O')
            else:
                answer.append('X')
    return answer