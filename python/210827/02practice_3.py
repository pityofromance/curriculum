"""
<문제>

과일이 저장되어 있는 리스트(fruit)가 존재할 때 다음 <출력 예시>와 같이 
구현되도록 프로그래밍 구현
과일의 위치는 사람이 인지하는 위치를 기준으로 입력

<출력 예시>

어떤 과일을 추가 할까요? 메론
메론을(를) 몇 번째에 추가 할까요? 2

['사과', '메론', '수박', '바나나', '배']

몇 번째 과일을 드실래요? 1

['메론', '수박', '바나나', '배']

"""

fruit = ['사과', '수박', '바나나', '배']

addFruit = ''
insertIndex = 0
delIndex = 0


addFruit = input("어떤 과일을 추가할까요? ")
insertIndex = int(input(f'{addFruit}을(를) 몇 번째에 추가할까요? '))-1

fruit.insert(insertIndex,addFruit)
print(f'\n{fruit}')


delIndex = int(input("\n몇 번째 과일을 드실래요? "))-1

del fruit[delIndex]
print(f'\n{fruit}')
