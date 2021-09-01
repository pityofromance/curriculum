from copy import copy   # copy모듈로부터 copy함수 임포트.

list1 = [1, 2, 3]
list2 = [4, 5, 6]
list3 = ['한국', '미국', '영국']
list4 = list1 + list2           # 리스트와 리스트 결합 가능.
list5 = list1 * 3       # 문자열과 같이 리스트에 대한 반복 연산 가능.

print(list4)
print(list5)
print(list2 + list3)            # 타입 다른 리스트간 결합 가능.

# print(list1[0]+list3[0])      # 타입이 다른 리스트간 결합은 가능하지만 이와같이
print(str(list1[0])+list3[0])   # 타입이 다른 요소값들 간의 결합은 타입을 일치 시켜야 가능.
print()


list3[1] = '프랑스'    # 리스트에 대한 대괄호([]) 연산은 요소를 읽거나 변경은 가능하지만,
print(list3)           # 요소를 추가하는 것은 불가. 요소를 추가하기 위해서는 함수(append)
print()                # 이용. 즉, 리스트는 인덱싱 범위를 벗어난 대괄호 연산 불가.


# 리스트 복사
copyList1 = list1[:]    # 슬라이싱을 활용한 리스트 복사. ( 리스트의 부분 복사 가능 )
list1[0] = 5
print(list1)
print(copyList1)
print()

copyList3 = copy(list3)   # copy함수를 이용한 리스트 복사. copy모듈 임포트 필요.( 복사 대상이 가변적인 경우 활용 )
list3[0] = '호주'
print(list3)
print(copyList3)
print()

list4 = list3.copy()    # copy() : 리스트 복사. 내장 메서드.( 복사 대상이 고정 )

print(list4)