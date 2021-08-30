#문자열 표현 방식
str1='string1'
str2="string2"
str3='''string3'''  #주석 처리와 동일
str4="""string4"""

#문자열 내에서 문자열을 표현하는 구두점을 문자로 표현하기 위한 목적으로 '' 또는 "" 두가지 표현식 모두 허용
str5='My name is "Psy"'
str6="John's candy"

# \로 구성된 이스케이프 코드를 이용한 구분
str7 = "My name is \"Psy\""
str8 = 'Jhon\'s candy'

#다중행 문자열 구성 가능(입력하는 그대로를 표현하므로 개행도 포함)
#싱글 쿼트('')나 더블쿼트("")형식의 문자열은 다중행 문자열 구성 불가능
str9='''
first:eat
second:sleep
third:study
'''

str10="""
1:psy

2:Kjs
"""