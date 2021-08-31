'''
    < 문제 >

- 직원의 성명과 1, 2, 3월의 급여를 입력 받아 아래 < 출력 예시 >와 같이 출력하는 프로그램을 구현.
  단, 직원의 급여는 숫자만 입력받아도 되지만, 입력 편의를 위해 천단위 구분기호(,)를 포함하여 입력
  해도 무방. 하지만 급여 총계와 평균은 입력과 상관없이 무조건 천단위 구분기호를 삽입하여 출력.
  ( 평균은 소숫점 첫째 자리에서 반올림하여 정수부만 표시 )


  < 출력 예시1 >

직원명 : 박성연

박성연의 1월 급여 : 2000000
박성연의 2월 급여 : 2500000
박성연의 3월 급여 : 2200000

직원 박성연의 급여 총계 : 6,700,000원    
직원 박성연의 급여 평균 : 2,233,333원  


  < 출력 예시2 >

직원명 : 홍길동

홍길동의 1월 급여 : 1,500,000
홍길동의 2월 급여 : 1,800,000
홍길동의 3월 급여 : 2,000,000

직원 홍길동의 급여 총계 : 5,300,000원
직원 홍길동의 급여 평균 : 1,766,667원

'''
#힌트40분 문제풀이5시

staffname=''
payMonth1=0
payMonth2=0
payMonth3=0
tot=0

staffName=input('직원명: ')

payMonth1=input(f'{staffName}의 1월 급여 : ')
payMonth2=input(f'{staffName}의 1월 급여 : ')
payMonth3=input(f'{staffName}의 1월 급여 : ')

payMonth1=int(payMonth1.replace(',', ''))
payMonth2=int(payMonth2.replace(',', ''))
payMonth3=int(payMonth3.replace(',', ''))

tot=payMonth1+payMonth2+payMonth3

print(f'\n직원 {staffName}의 급여 총계 : {tot:,}')
print(f'\n직원 {staffName}의 급여 평균 : {tot/3:,.0f}')