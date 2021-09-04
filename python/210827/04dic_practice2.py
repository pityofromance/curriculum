"""
    <문제>

다음과 같이 사전(countryCode)에 국가번호와 국가명이 저장되어 있을 때,
영국(2)을 삭제하고 칠레(2)와 가나(6)을 추가한 후
국가번호 순으로 정렬하는 프로그램을 아래 <출력 예시>처럼 작성하기

<출력 예시>

삭제할 국가번호 입력 : 2
{3: '이탈리아', 1: '한국', 5: '노르웨이', 4: '미국'}


추가할 국가명 : 칠레
칠레의 국가번호 : 2

추가할 국가명 : 가나
가나의 국가번호 : 6

{1: '한국', 2: '칠레', 3: '이탈리아', 4: '미국', 5: '노르웨이', 6: '가나'}

"""

countryCode = {3: '이탈리아', 1: '한국', 5: '노르웨이', 2: '영국', 4: '미국'}

codeNumber=0
countryName=''

codeNumber = int(input('삭제할 국가번호 입력 : '))
del countryCode[codeNumber]
print(countryCode)


countryName = input('\n\n추가할 국가명 : ')
codeNumber = int(input(f'{countryName}의 국가번호 : '))

countryCode[codeNumber] = countryName


countryName = input('\n추가할 국가명 : ')
codeNumber = int(input(f'{countryName}의 국가번호 : '))

countryCode[codeNumber] = countryName


countryCode = dict(sorted(countryCode.items()))

print(f'\n{countryCode}')