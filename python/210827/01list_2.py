list1 = []

# append : 리스트의 끝에 요소값 추가.
list1.append(1)
list1.append(3)
list1.append(3)
list1.append(4)
list1.append(4)
list1.append(5)

print(list1)
print(len(list1))    # len : 문자열과 동일하게 리스트의 크기 조사.
print()


# del : 선언 변수에 대한 정의를 취소할 수도 있지만 리스트의 요소값을 삭제 할 때도 사용.( 삭제 시 슬라이싱 가능)
del list1[1]
print(list1)

# insert(index, object)
list1.insert(1, 2)
print(list1)
print('-' * 40)


print(list1.count(4))    # count : 문자열과 동일하게 리스트의 요소값 갯수 카운팅.
end = list1.pop()    # pop : 리스트의 마지막 요소를 삭제하고 삭제한 요소값을 반환.
print(list1)
print(end)
list1.pop(3)     # 삭제할 위치의 인덱스 지정도 가능. ( del 연산자를 이용한 삭제와 기능상 동일. 단, 슬라이싱 불가 )
print(list1)
print('-' * 40)


list1.extend([1, 2, 3, 4, 5])   # extend : 리스트에 다른 리스트를 추가하여 확장.
print(list1)
print(list1.index(2, 2, 6))     # index(value, start, stop) : 문자열의 index함수와 동일하게 검색값의 최초 인덱스 위치를
#                               # 반환하고 시작, 종료 위치 지정이 가능하며 검색 값이 존재하지 않는 경우 오류 발생.
print()


list1.remove(4)      # remove(value) : 최초 검색된 대상값을 삭제. 검색 대상값이 존재하지 않는 경우 오류 발생.
print(list1)
list1.remove(4)
print(list1)
print('-' * 40)


list1.reverse()      # reverse() : 리스트 순서를 역순으로 배치.
print(list1)
list1.sort()         # sort : 정렬함수. 인수 생략시 오름차순 정렬되며 대상 리스트 자체를 정렬시키며 None을 리턴.( None : null에 대응)
print(list1)
list1.sort(reverse=True)  # reverse인수에 True를 지정하면 내림차순 정렬. reverse인수 앞에는 정렬 조건을 람다식등으로
print(list1)              # 지정 가능한 key인수를 지정 가능.
print('-' * 40)


list2 = list1.sort()  # sort함수는 대상 리스트 자체를 정렬시키고 None을 리턴.
print(list2)
print(list1)
list3 = sorted(list1)  # sorted(대상객체, reverse = ?, key = ?) : sorted함수는 인수로 지정된 리스트에
print(list3)           # 대한 정렬된 새로운 리스트를 반환함으로써 대상객체 원본은 정렬되지 않음.
#                       # key : 정렬 대상 객체의 정렬 기준을 함수의 참조로 전달.( 함수 : "함수의 참조와 람다식 활용"참조 )
list1.clear()  # clear : 모든 리스트 요소 삭제.
print(list1)
print('-' * 40)


# join함수를 이용한 리스트를 문자열로 변환. 문자열 함수의 join과 동일한
# 함수로 join함수의 인수 대상이 문자열과 리스트 모두 가능.
list4 = ['하늘', '땅', '강', '물']

str = ''.join(list4)
print(str)
print('-' * 40)


# range함수를 통한 리스트 생성. 리스트에 대한 규칙적이고 연속적인 값으로 초기화 시 유용.

list5 = list(range(1, 11))    # range(st, ed) : st부터 ed - 1까지 연속값이 생성된 객체 반환. 자료 변환 함수(list)의
#                             # 인수로 range함수로 생성된 객체를 전달함으로써 해당 자료형에 대한 연속값을 간단히
#                             # 얻는 것이 가능. 인수는 정수만 가능하며 step인수 추가 가능.

list6 = list(range(10))       # 인수가 하나만 주언진 경우 0 ~ 인수 - 1 반환.

list7 = list(range(1, 10, 2))  # range(st, ed, step)

print(list5)
print(list6)
print(list7)