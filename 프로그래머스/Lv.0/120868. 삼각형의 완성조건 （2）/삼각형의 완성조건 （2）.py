def solution(sides):
    answer = 0
    sum_side = sum(sides)
    for i in range(1,sum_side):    
        if i <= sum_side-max(sides):
            answer+=1
    return answer+sum_side-max(sides)-1