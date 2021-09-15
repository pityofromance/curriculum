"""
    < for ~ in 문 >

- 문자열, 리스트, 튜플, 사전, 집합, 객체등의 이터러블 자료구조를 대상으로 요소값 순회.

형식    :   for 할당변수 in 자료구조 :          - 자료구조의 값을 변수에 할당하여 순회.
                실행문1                          따라서 for ~ in문은 읽기만 가능할뿐
                실행문2                          할당변수를 이용해 원본 자료구조의 변경은 불가.

"""

testStr = 'String'
testList = [1, 2, 3, 4, 5]
testTuple = (1, 2, 3, 4, 5)
testDic = {'A': 1, "B": 2, "C": 3, "D": 4, "E": 5}
testSet = {1, 2, 3, 4, 5}

for value in testStr:
    print(value)
print()

for value in testList:
    print(value)
print()

for value in testTuple:
    print(value)
print()

for value in testDic:
    print(value)
print()

for value in testSet:
    print(value)
print('-' * 20)


for value in testList:
    value = 0

for value in testList:
    print(value)
print()