'''
<입력받은 정수들의 합>

정수 입력(끝내려면 '0') : 1
정수 입력(끝내려면 '0') : 2
정수 입력(끝내려면 '0') : 3
정수 입력(끝내려면 '0') : 4
정수 입력(끝내려면 '0') : 5
정수 입력(끝내려면 '0') : 0

합계 : 15
'''

n1=0
sum=0

while 1 : 
    n1 = int(input("정수 입력(끝내려면 '0') : "))

    if (n1 == 0) :
        break

    sum = sum + n1

print(f'합계 : {sum}')