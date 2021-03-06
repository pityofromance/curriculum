#화면 확대/축소: ctrl + +/-
#실행 : ctrl + F5
#주석 처리 : ctrl + /
#여러줄 주석 처리 : shift + alt + a
#한줄삭제 : ctrl + shift + K
#한줄 복사 : shift + alt + up/down

"""
<주석>
한줄주석 : 선두 #
두 줄 이상 : 선두와 말미에 " 또는 ' 3개

---------------------

<print>함수
형식 : print(value1, value2, .... [, sep= ' '][, end = '\n'])
sep(seperator) : values에 대한 쉼표 구분자 설정시 연결 문자 설정, 디폴트 공백 (' ')
end : 출력 후 마지막에 출력할 문자 설정. 디폴트 개행문자(\n)
)
"""


print('한글깨짐')
print("kkk")
print('aaa') #파이썬은 인터프리터 언어로 명령어 끝 세미콜론(;) 필요없이 개행으로 명령어 구분
print(123)
print('bbb') #문장 끝을 의미하는 구문자(;)가 없이 하나의 라인에 2개 이상의 명령어 사용 불가
print(2**3) #거듭제곱 연산자 제공(**)
print() #print 함수는 자동개행, end = \n 디폴트 적용

print('a'+str(5)) #str함수를 이용해서 숫자를 문자타입으로 변환하여 결합 연산, 실제 형변환과 관련된 함수들은 실제 함수가 아니라 클래스 생성자
print('b'*5) #문자열을 n번 반복
print('7'*3)
print(int('7')*3) #int 함수로 문자열을 숫자로 변환해서 반환
#print(int('a')) #문자형태의 문자열은 숫자로 변환불가
print()

print(True) #boolean 대문자 시작 유의
print(False)
print()
print('\n') #개행문자('\n') 인식
print(not True) #not 부정
print(str(True) + '참') #모든 타입간 결합연산(+)시 타입 일치해야 함
print('문', 1) #단, 쉼표(,) 으로는 타입달라도 ㄱㅊ
print('문', '자', '열 출력', 1, sep='')  # 쉼표(,) 구분자로 여러 문자열 결합 가능. 단, 결합시 구분자간 공백 자동 추가.
print()

print('010', '2589', '7342', sep='-')   # sep : 쉼표 구분자로 값 연결시 값 사이 출력 문자 설정.

print('박', end='')     # end : 값 출력후 마지막에 표시할 문자 설정.
print('성', end='')
print('연')
print()
print(
     '문자열'
 )
 # print('문         # 코드가 길어질 경우 함수 블럭()을 개행하여 표현하는 것은 가능하지만
 #       자열'       # 표현식 자체를 개행하여 표현하는 것은 불가.
 # )                 # 표현식이란 대입 할당문의 우변에 지정 가능한 것을 의미.
print()

# 아래와 같이 긴 명령행을 코딩해야 하는 경우 백슬래쉬(\) 뒤에서 개행을 하면 하나의 문장으로 인정.
# 단, 쉼표(,) 구분자가 존재하는 경우 쉼표 구분자 뒤에서 개행하면 백슬래쉬 없이 하나의 문장으로 인정.
# 명령행에 연산자가 존재하는 경우에는  백슬래쉬(\) 뒤에서 개행을 해야만 하나의 문장으로 인정하지만,
# 소괄호()로 표현식을 묶으면 백슬래쉬 없이 하나의 문장으로 인정되며 이는 함수의 호출 형식이되는
# 소괄호도 포함.


""" print('대 ~ 한 ~ 민 ~ 국= >  짜짜짝 ~ 짜짝
대 ~ 한 ~ 민 ~ 국= >  짜짜짝 ~ 짜짝') """

print('대 ~ 한 ~ 민 ~ 국    =>  짜짜짝 ~ 짜짝   \
대 ~ 한 ~ 민 ~ 국    =>  짜짜짝 ~ 짜짝')

print('010', '2589', '7342',        # 쉼표 뒤에서 개행.
      sep='-')

sum = 1 + 2 + 3 + 4 + 5     # 백슬래쉬 없이 개행을 하여 다음 행은 인정되지 않음.
##+ 6 + 7 + 8 + 9 + 10
print(sum)

sum = (1 + 2 + 3 + 4 + 5 +      # 소괄호로 표현식을 묶으면 백슬래쉬 없이 연산자 앞/뒤 모두에서 개행 가능.
       6 + 7 + 8 + 9 + 10)
print(sum)

print('-'.                  # 객체에 접근하기 위한 피어리드(.) 연산자는 앞/뒤 어디에서든 개행 가능.
      join('문자열'))

print('-'
      .join('문자열'))
print()