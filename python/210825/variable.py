n=0
n=None  
#변수를 사용하는 목적
#1)값이 변하니까
#2)값을 저장
"""
number1 = input('정수 1 입력: ')
print('입력된 정수는 ' + number1 + '입니다\n')

number2=input('정수2 입력: ')
print('입력된 정수는 '+number2 +'입니다\n')
print(number1+'와 '+number2+'의 합은 ', int(number1)+int(number2), '입니다', sep='')



<문제>
-학생의 이름과 나이, 국어, 영어, 수학 점수를 입력받아 아래와 같이 출력되도록 구현하기

<입/출력예시>
학생명:박상연
나이:22
국어점수:90
영어점수:70
수학점수:80
박성연님의 나이는 22살이고 국어, 영어, 수학 점수의 총계는 240점입니다.

"""
#변수 타입구분
name='' #빈 문자열
age=0
korean=0
english=0
math=0

name=input('학생명: ')
age=input('나이: ') # age=int(input('나이: ')) 이렇게 int로 받는 것도 가능
korean=input('국어점수: ')
english=input('영어점수: ')
math=input('수학점수: ')

print(name + '님의 나이는 ' + age + '살이고 국어, 영어, 수학 점수의 총계는 ' , int(korean)+int(english)+int(math), '점입니다', sep='')

