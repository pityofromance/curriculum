"""
    < 사전(Dictionary) > - Hash

- key를 이용해 value에 접근하는 자료 구조로써 key는 정수형, 문자열, 튜플등 불변한(Immutable) 값만
  가능한 반면, value는 Immutable value, Mutable value 모두 가능.

형식    :   { key1 : value1, key2 : value2, key3 : value3, ... }

"""

from operator import itemgetter   # sorted함수의 정렬기준 인수 key에 operator모듈에 정의되어 있는 itemgetter객체의
#                                 # 참조를 전달하기 위해 모듈 임포트.

dictionary1 = {5: '한국', 1: '미국', 3: '이탈리아'}

# 사전에 접근하는 방식.
print(dictionary1[5])       # [key] : 리스트와 동일하게 []를 이용해 접근하되 대괄호 안에 인덱스가 아닌 key 명시.
print(dictionary1.get(3))   # get(key) : get함수를 이용한 접근.
print()


# print(dictionary1[2])     # 대괄호 접근 방식은 key가 존재하지 않는 경우 에러 발생.
print(dictionary1.get(2))   # 반면, get함수를 이용한 접근은 None 리턴.
print(dictionary1.get(2, "기본값"))     # get함수를 통해 접근시 key가 존재하지 않는 경우 디폴트 값 지정 가능.
print()


print(1 in dictionary1)     # in연산자 : key의 포함 여부를 True, False로 리턴.
print(2 in dictionary1)     # 형식 : key in dictionary
print()


dictionary2 = {'A': '영수', 'B': '철수', 'C': {'영희'}}

dictionary2['A'] = '성연'   # 대괄호 연산자를 통한 키에 대응되는 값 변경.
print(dictionary2)
dictionary2['a'] = '민수'   # 대괄호 연산자를 통한 키와 값 추가. 리스트는 요소값을 추가하기 위해 append함수 사용함과 대조.
print(dictionary2)
del dictionary2['A']        # del : 사전의 요소값 삭제. del은 연산자로써 값의 반환은 없음.
print(dictionary2)
print()


# keys() : 사전의 키들만 추출한 리스트 형식의 객체를 반환.
keyGroup = dictionary2.keys()
print(keyGroup)
# values() : 사전의 값들만 추출한 리스트 형식의 객체를 반환.
valueGroup = dictionary2.values()
print(valueGroup)
# items() : 사전의 키와 값들을 추출한 튜플 리스트 형식의 객체를 반환.
itemGroup = dictionary2.items()
print(itemGroup)
print()


# list : key, value, item을 객체에서 리스트로 변환하여 반환.
keyGroup = list(dictionary2.keys())
print(keyGroup)
valueGroup = list(dictionary2.values())
print(valueGroup)
itemGroup = list(dictionary2.items())
print(itemGroup)
print()


dictionary2.clear()     # clear : 리스트와 동일하게 사전의 모든 요소값 삭제.
print(dictionary2)
print()


dictionary3 = {2: 'h', 1: 'a', 1: 'b', 4: 't', 1: 'c', 3: 'k'}  # 중복된 키는 최초에 정의된 키만 인정하고 중복 정의된
#                                                               # 키에 대응되는 값은 가장 마지막의 값만 인정.
print(dictionary3)
print()


dictionary4 = {(1, 2): 'a'}     # 사전의 키는 튜플은 가능하지만 리스트나, 다른 사전은 불가.
# dictionary4 = {[1]: 'b'}      # 즉, 키는 불변한(Immutable) 값만 가능.

print(dictionary4[(1, 2)])
delTemp = dictionary4.pop((1, 2))   # 리스트와 동일한 pop함수의 사용이 가능하나, 키 인수 지정은 필수.
print(delTemp)                      # 삭제후 삭제한 키에 대응되는 값 반환.
print(dictionary4)
print()


dictionary5 = dict(화=2, 월=1, 수=3)  # dict : dict함수 호출을 통한 사전 생성. 이는 키워드 파라미터를 통한 사전 매칭
print(dictionary5)                    #       형식으로 좌변이 매개변수, 우변이 할당 값을 가지는 형태이며 좌변이 사전의
#                                     #       key로 우변이 사전의 value로 대응되어 매칭되는 구조.
#                                     #       따라서 좌변은 변수 형태로 지정되어야 하므로 문자열 구분자('')가 올 수 없으며
#                                     #       숫자 형식 또한 불가. ( 키가 문자열로 구성된 경우 사용상 유리 )
print()


dictionary5 = dict(sorted(dictionary5.items()))  # 사전에 대한 직접적인 정렬함수는 제공되지 않아, 이와같이 items함수를
print(dictionary5)                              # 이용하여 튜플 리스트 형태의 객체로 반환받아 sorted함수를 이용 정렬후
print()                                         # dict함수의 인수로 해당 객체를 전달하여 다시 사전 형식으로 변환.
#                                               # 즉, dict함수의 인수는 튜플 리스트나 또는 튜플 리스트 형식의 객체와
#                                               # 같이 키와 값의 쌍으로 이루어진 데이터도 전달 가능.
#                                               # 단, sorted함수의 인수도 튜플 리스트나 또는 튜플 리스트 형식의 객체가
#                                               # 모두 가능한데, 이때 정렬 기준은 항상 튜플쌍의 key에 대응되는 앞의 값이
#                                               # 기준이 됨에 주의.

"""
  < sorted함수의 key인수 >

- sorted함수의 key인수에는 정렬기준이 되는 함수나 객체의 참조를 전달하는데, 내부적으로 sorted함수의 첫 번째 인수로 전달된 객체의
  참조를 통해 객체의 각 요소를 하나씩 순회하면서 key인수에 참조된 함수나 객체에 각 요소를 전달함으로써 함수나 객체의 정렬기준에 
  따라 요소들을 정렬.

"""
dictionary5 = dict(sorted(dictionary5.items(), key=itemgetter(0)))  # items메서드를 통해 반환된 튜플 리스트 객체의 참조를
print(dictionary5)                                                  # 통해 각 튜플쌍을 전달받아 itemgetter클래스의 생성자
print()                                                             # 인수로 튜플쌍에 대한 인덱스를 전달함으로써 튜플쌍의
#                                                                   # 정렬기준 요소를 선택 가능.

dictionary5 = dict(sorted(dictionary5.items(), key=itemgetter(1)))  # items메서드를 통해 전달된 튜플쌍에 대해 itemgetter
print(dictionary5)                                                  # 클래스의 생성자 인수로 두 번째 인덱스를 전달함으로써
print()                                                             # key가 아닌, value를 기준으로 정렬 가능.


dictionary5 = dict(sorted(dictionary5.items(), key=lambda i: i[1]))  # sorted함수의 첫 번째 인수로 전달된 객체의 각 요소를
print(dictionary5)                                                   # 항상 key인수에 참조된 함수나 객체에 순차적으로 전달
#                                                                    # 함으로써, 당행의 경우 전달된 요소값들이 튜플쌍이므로
#                                                                    # 람다식을 통해 바로 인덱싱하여 정렬기준으로 선택 가능.

dictionary6 = {}  # 빈 사전 표현 형식.