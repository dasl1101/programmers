def solution(my_string):
    
    arr = my_string.split(' ')
    answer = int(arr[0])
    for i in range(len(arr)):
        if i % 2 != 0:  
            if arr[i] == '+':
                answer += int(arr[i+1]) 
            else:
                answer -= int(arr[i+1])  
    
    return answer