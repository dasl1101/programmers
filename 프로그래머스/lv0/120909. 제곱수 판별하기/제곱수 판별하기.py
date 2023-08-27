import math

def solution(n):
    answer = 0
    a  = math.sqrt(n)
    if type(a) ==  float and a.is_integer():
        answer = 1
    else : answer = 2    
    return answer