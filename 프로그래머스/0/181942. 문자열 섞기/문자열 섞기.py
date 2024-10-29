def solution(str1, str2):
    answer = ''
    str1_list = []
    for i in str1:
        str1_list.append(i)
    
    for i in range(len(str2)):
        answer += str1_list[i]+str2[i]

        
    return answer