
"""
    < in, not in 연산자 >

- 문자열, 리스트, 튜플, 사전, 집합, 객체등의 자료 구조에 대한 포함 여부를 불린값으로 리턴.

형식1    :       포함여부 대상값 in 자료구조.

형식2    :       미포함여부 대상값 not in 자료구조.

"""



testStr='String'
testList=[1,2,3,4,5]
testTuple=(1,2,3,4,5)
testDic={'A':1, "B":2, "C":3, "D":4, "E":5}
testSet={1,2,3,4,5}

if 't' in testStr:
    print("문자열 포함")
else:
    print('문자열 미포함')
print()

if 3 in testList:
    print("리스트 포함")
else:
    print('리스트 미포함')
print()

if 2 in testTuple:
    print("투플 포함")
else:
    print('튜플 미포함')
print()

if 'A' in testDic:  #사전은 키를 이용
    print("사전포함")
else:
    print('사전 미포함')
print()

if 4 in testSet:
    print("집합 포함")
else:
    print('집합 미포함')
print()