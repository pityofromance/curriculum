
"""
    < 집합(Set) >

- 자료에 대한 중복 허용이 되지 않고 순서가 없는 자료구로 인해 다른 자료구조와 다르게 인덱싱이
  허용되지 않는 특성. 따라서 인덱싱을 하려면 리스트나 튜플로 자료구조를 변환후 사용. 일반적
  으로 중복 데이터에 대한 필터링 용도로 사용.

형식 1    :   set( [data1, data2, ...] )        - set함수의 인수를 리스트 형태로 지정.

형식 2    :   set( 문자열 )                     - set함수의 인수를 문자열 형태로 지정.

형식 3    :   { data1, data2, ... }             - 사전과 같이 중괄호{} 블럭안에 데이터를 표현하되 키와
                                                  값의 쌍이 아닌 값만 쉼표(,) 구분자로 구분하여 나열.

"""


set1 = set([5,3,1,3,6,1])
set2 = set('interesting')
set3 = {7, 'a', 1, 'a', 7}
set4 = set()    #비어있는 set표현
dic = {}    #비어있는 사전 표현

print(set1)
print(set2)
print(set3)
print(type(set4))
print(type(dic))

developer_Java = {'세종대왕', '강감찬', '이순신', '홍길동'}
developer_Python = {'이순신', '박성연', '이황'}

#교집합
print(developer_Java & developer_Python)    #비트연산자
print(developer_Java.intersection(developer_Python))
print()

#합집합
print(developer_Java | developer_Python)    #비트연산자
print(developer_Java.union(developer_Python))
print()

#차집합
print(developer_Java - developer_Python)
print(developer_Python.difference(developer_Java))
print()

#add
developer_Java.add('김좌진')   #add : 집합에 인수로 지정된 요소 하나를 추가, 다중 인수는 불가
print(developer_Java)
print()

#update
developer_Java.update(['김두한', '유성룡', '김유신'])   #update(Iterable) : 집합에 여러 요소를 추가
print(developer_Python)     #인수는 이터러블(Iterable)형태로 인수를 지정한다.
print()                     #일반 문자열의 경우 문자열을 그대로 인수로 지정하면
#                           #개별 문자 하나하나를 요소로 인식하게 되므로 리스트나 튜플 등의 자료구조를 이용

#remove
developer_Python.remove('이순신')   #remove : 인수로 지정된 요소값을 집합에서 삭제.
print(developer_Python)     #단, 인수로 지정된 요소가 존재하지 않는 경우 컴파일 에러