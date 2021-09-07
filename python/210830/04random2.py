from random import *  # 난수 관련 라이브러리(모듈) 임포트. random모듈로부터 모든 함수를 임포트.

data = [1, 2, 3, 4, 5]

shuffle(data)   # shuffle : 대상 자료 구조를 무작위로 재구성.
print(data)

shuffle(data)
print(data)

shuffle(data)
print(data)
print()


randExtract1 = sample(data, 1)    # sample : 첫 인수 객체에서 두번째 인수 갯수만큼 데이터를
randExtract2 = sample(data, 1)    # 리스트 형식으로 무작위로 추출.
randExtract3 = sample(data, 1)

randExtract4 = sample(data, 2)
randExtract5 = sample(data, 2)
randExtract6 = sample(data, 2)

print(randExtract1)
print(randExtract2)
print(randExtract3)

print(randExtract4)
print(randExtract5)
print(randExtract6)