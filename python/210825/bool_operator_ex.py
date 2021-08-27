"""
<bool>타입
파이썬에서는 0, None, ''(빈 문자열)과 빈 자료형([], (), {})등에 대해 False로 평가하고 그 외의 값은 True로 평가
"""

print(5/3) #파 이썬에서는 정수 실수 구분 없이 그대로 출력됨 (c의 경우 5/3은 1)
print(5//2) # //:몫 연산자
print()

print(5%3) # %: 나머지 연산자
print(5%3.2) # 숫자 타입 확장 연산은 그대로 적용 Q.실수 타입 숫자
print()

print(2**3) # **거듭제곱 연산자
print()

"""
논리 연산자 and, or, 또는 &, | 로도 가능하지만 &, |는 실제 비트연산자임에 주의
"""
print(False and False) # and : 모두 참(true)이면 참
print(True and False)
print(False and True)
print(True and True)
print()

print(False or False) # or : 하나라도 참(true)이면 참
print(True or False)
print(False or True)
print(True or True)
print()

print(False & False) # Q.비트연산자
print(False | False)
print(True | False)

"""
논리연산자의 피연산자가 불린값이 아닌 경우 js와 동일하게 불린값으로 임시 변환 후,
or는 first truthy값에 대하여 원본 값을 반환하고 and는 first falsy값에 대하여 원본 값을 단락평가하여 반환
"""

print('k' or 'a' or 3) #first truthy 값 반환
print(False or 0 or 3)
print (False or 0 or 0) #이 경우 마지막 falsy 
print('t' and 0 and 'f') #first falsy값 반환
print('t' and 10 and 'f')

None or '' or print(10) #first truthy규칙에 의해 print문 실행

print(bool('')) #bool : 인수에 대안 true, false
print(bool(0))
print(bool('value'))
print(bool(123))



"""
1:1 비교
== !=
범위 지정 연산
> >= < <=

"""

i1=5
i2=10
print(i1==5)
print(i2!=10)
print()

print(i1>4)
print(i2>=i1)
print(i2<9)
print(i2<=12)
print()

n=4
print(n>1 and n<5) #일반수학에서의 비교연산자
print(1<n<5)
print()

#n++ 파이썬에서는 증감연산자 제공되지 않음. 복합 대입 연산자로 교체
n+=1 #n=n+1
print('증감연산자')
print(n)
n*=3
print(n)
n/=5
print(n)
n-=10
print(n)

print(12340000)
print(1234e5) #지수 표현방식: 1234 * 10^5
print(0.1234) #지수 표현방식 : 1234 * 10^-4
print(1234E-4)
print()

print(0b1010) #2진수 표기형식 : 접두사 "0b"
print(0o62) #8진수 표기형식 : 접두사 "0o"
print(0x28) #16진수 표기형식 : 접두사 "0x"