'''
리스트에서 최대값 찾기
index와 반복문 이용 
'''

score = [99, 15, 4, 80, 64, 3, 42, 94]  

max_score = score[0]
min_score = score[0]

maxP=0
minP=0

i = 1

while i < (len(score)):
    
    if (score[i] > max_score):
        max_score = score[i]
        maxP=i

    elif (score[i] < min_score):
        min_score = score[i]
        minP=i

    i += 1

print(f'최대값({maxP+1}): {max_score} \n최소값({minP+1}): {min_score}')
