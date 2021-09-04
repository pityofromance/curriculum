"""
    <문제>

-상품명과 가격을 입력받아 사전에 각각 key와 value로 저장하는 프로그램을 구현

<출력 예시>

첫 번째 상품명 : 냉장고
냉장고의 가격 : 2000000

두 번째 상품명 : 세탁기
세탁기의 가격 : 1000000

세 번째 상품명 : 에어컨
에어컨의 가격 : 1500000

{'냉장고': 2000000, '세탁기': 100000, '에어컨': 1500000}

"""
dic1 = {}

tmpKey = ''
tmpValue = 0


tmpKey = input('첫 번째 상품명 : ')
tmpValue = int(input(f'{tmpKey}의 가격 : '))

dic1[tmpKey] = tmpValue


tmpKey = input('\n두 번째 상품명 : ')
tmpValue = int(input(f'{tmpKey}의 가격 : '))

dic1[tmpKey] = tmpValue


tmpKey = input('\n세 번째 상품명 : ')
tmpValue = int(input(f'{tmpKey}의 가격 : '))

dic1[tmpKey] = tmpValue


print(f'\n{dic1}')