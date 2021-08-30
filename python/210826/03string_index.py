sIdx='0123456789012345678590123456'
str1='The Python Standard Library'

"""
형식 : index( 찾으려는 문자열 [, 시작 인덱스] [, 종료 인덱스])

    -검색 문자열의 인덱스를 반환하되 슬라이싱과 같이 종료 인덱스 바로 직전까지만 검색
    모든 문자열 함수는 이와 같이 시작/종료 인덱스 설정 가능

"""

print(str1.index('e'))
print(str1.index('t', 8))
print(str1.index('t', 0, 8))
#print(str1.index('j'))  #찾으려는 문자열이 없으면 에러 발생
print()

print(str1.find('e'))
print(str1.find('t', 8))
print(str1.find('t', 0, 8))
print(str1.find('j'))    #find : index함수와 형식과 결과는 동일하나, 찾으려는 문자열이 없으면 -1 반환




print(str1.count('t'))   #count(str, startIdx, endIdx) : 찾으려는 문자열의 개수 카운트
print(str1.upper())      #upper : 대상 문자열을 변환한 새로운 문자열을 반환
print(str1.lower())      #lower : 대상 문자열을 소문자로 변환한 새로운 문자열 반환
print(str1)             #upper, lower과 같은 문자열 변환 함수들은 문자열의 상수 특성으로 인해 문자열 원본에는 영향X

print(str1[0].isupper)  #isupper : 대상 문자열이 모두 대문자인지 boolean값 반환
print(str1[0].islower)  #islower : 대상 문자열이 모두 소문자인지 boolean값 반환

str2 = "  Test Python          "
str3 = "start"

print(str2+str3)
print(str2.strip()+str3)    #strip : 양쪽 공백 제거
print(str2.lstrip()+str3)   #lstrip : 왼쪽 공백 제거
print(str2.rstrip()+str3)   #rstrip : 오른쪽 공백 제거
print()

str4 = '12345'
str5 = ','.join(str4)   #String.join(str) : 구분자로 지정할 문자열 객체(String)에 대하여 join함수를 호출하고
#                       #                   인수로 대상 문자열(str)을 지정함으로써 인수가 되는 문자열(str)의
#                       #                   문자열 사이에 구분자 역할을 하는 문자열 객체(String)삽입한 새로운

str6 = str5.replace(',', ' ')   #replace(old, new, count) : old문자열을 new문자열로 count갯수만큼 변환
#                               #                           old문자열이 검색되지 않으면 원본 문자열 그대로

print(str5)
print(str6)
print(str6.split(' ', 3))   #split(sep, maxsplit) : 인수로 지정된 구분자(sep)를 기준으로 하여 부분 문자열을 추출하되, maxsplit
#                           #                       갯수만큼의 구분자를 기준으로 분리하여 추출한 부분 문자열들을
#                           #                       sep인수 생략시 whitespace문자(공백, 탭, 개행)를 디폴트 구분
#                           #                       whitespace문자가 연속적으로 여러개 있는 경우에도 하나의 구분자