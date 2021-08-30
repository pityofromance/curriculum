stri='Python is easy to learn'

print(stri[0])
print(stri[1])
print(stri[-1])  #최종 인덱스로부터 역순으로 -1부터 카운팅
print(stri[-2])  #음수 인덱싱 : 실제로는 전체 문자열 크기에서 음수 인덱스 값을 더한 위치값으로 변환된 인덱스 값

#str[0] = 'p'   #문자열 상수를 str변수가 참조하는 개념이므로 인덱싱 연산자 []로 읽는 것은
#               #가능하지만, 문자열 상수 자체를 변경하는 것은 불가하다

"""
  < 문자열 슬라이싱(Slicing) >

형식 : 문자열 [stIx : edIx : step]

-step: 슬라이싱 방향은 step의 부호에 의해 결정되어 양수인 경우 순차 슬라이싱, 음수인 경우 역차 슬라이싱 진행.
        step은 생략 가능하며 생략시 디폴트 1로 지정되어 인덱스가 1씩 이동되면서 순차 슬라이싱 처리
        step의 절대값 크기는 검색 이동 거리(간격)를 의미
    *음수 인덱싱은 실제 전체크기(len)에서 지정된 음수 인덱스를 뺀 결과를 양수 인덱스로 변환하여 처리
"""

regidentNumber='980312-1162735'

print('주민번호는 총 ' + str(len(regidentNumber)-1)+'자리입니다')   #len : 문자열크기
print('생년: ' + regidentNumber[0:2])
print('월: ' + regidentNumber[2:4])
print('일: ' + regidentNumber[4:6])
print('생년월일: ' + regidentNumber[:6])
print('주민번호 뒤 7자리: ' + regidentNumber[7:])
print('주민번호 뒤 7자리: ' + regidentNumber[-7:])
print('주민번호 : ' + regidentNumber)
print('주민번호 : ' + regidentNumber[:])    #stIx와 edIx를 모두 생략하면 처음부터 끝까지 추출
#                                          #중첩 리스트에 대한 슬라이싱을 위해 필요

print(regidentNumber[::1])  #순차 슬라이싱 : '[:]'는 '[::1]'의 축약형
print(regidentNumber[::2])  #순차 슬라이싱을 하되 인덱스를 2씩 이동
print(regidentNumber[::-3]) #역순 슬라이싱 : 슬라이싱을 역방향으로 하면서 3씩 이동

print(regidentNumber[len(regidentNumber)-1:6:-1])    #edIx는 미포함되어 직전 문자열까지만 추출하므로 뒤에서 7자리까지 추출

print(regidentNumber[7:5])      #순차 슬라이싱인 경우 stIx는 edIx보다 작아야 한다
print(regidentNumber[5:13:-1])  #역순 슬라이싱은 반대로 stIx가 exIx보다 커야 한다
#                               #그렇지 않으면 아무것도 반환하지않음

print(regidentNumber[5::-1])    #생년월일 역순 추출
print(regidentNumber[1:6:2])    #생년월일의 일의 자리만 추출