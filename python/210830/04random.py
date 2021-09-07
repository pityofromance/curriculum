from random import *  # 난수 관련 라이브러리(모듈) 임포트. random모듈로부터 모든 함수를 임포트.

print(random())     # 0.0 <= x < 1.0 사이의 난수 발생(float값 리턴).
print(random())
print(random())
print()

print(int(random()*10))     # 0 ~ 9 범위 값으로 가공.
print(int(random()*10))
print(int(random()*10))
print()

print(int(random()*10)+1)     # 1 ~ 10 범위 값으로 가공.
print(int(random()*10)+1)
print(int(random()*10)+1)
print()

print(int(random()*5)+1)    # 1 ~ 5 범위 값으로 가공.
print(int(random()*5)+1)
print(int(random()*5)+1)
print()

print(randrange(1, 6))  # 1 <= x < 6 범위 값 리턴. step인수 추가 가능.
print(randrange(1, 6))
print(randrange(1, 6))
print()

print(randint(1, 5))     # 1 <= x <= 5 범위 값 리턴.
print(randint(1, 5))
print(randint(1, 5))