listData = [1, 2, 3]
tupleData = (4, 5, 6)
dicData = {'A': 1, 'B': 2}
setData = {7, 8, 9}

convert1 = set(listData)    # 자료 형태를 변환하는 함수는 변환된 결과의 자료 구조 형태를 반환할뿐 원본을 변경하지는 않음.
convert2 = set(tupleData)   # ( 형변환과 관련된 함수는 실제 함수가 아닌 클래스 생성자 임에 유의 )
convert3 = set(dicData)     # 사전은 키만 변환.

print(convert1)
print(convert2)
print(convert3)
print()
print(listData)
print(tupleData)
print(dicData)

convert1 = tuple(listData)
convert2 = tuple(dicData)
convert3 = tuple(setData)

print(convert1)
print(convert2)
print(convert3)


convert1 = list(tupleData)
convert2 = list(dicData)
convert3 = list(setData)

print(convert1)
print(convert2)
print(convert3)


# 사전형으로 변환.
convert1 = dict(zip(listData, tupleData))   # dict생성자 내에서 zip함수를 호출하여 zip함수의 인수를 key, value의 쌍으로 나열하면
convert2 = dict(zip(tupleData, setData))    # 각기 다른 이터러블 객체를 묶는 새로운 객체 반환. 이때 key와 value의 갯수가 대응되지
#                                           # 않아도 대응되는 만큼만 묶은 객체가 반환되며 이를 사전으로 변환.
#                                           # zip생성자의 인수는 이터러블 객체로 지정.
print(convert1)
print(convert2)


# 튜플 리스트.
listOfTuple = [('a', 1), ('b', 2), ('c', 3), ]

convert3 = dict(listOfTuple)  # 튜플로 구성된 리스트의 경우 dict함수의 인수로 전달하면 바로 변환 가능.
print(convert3)