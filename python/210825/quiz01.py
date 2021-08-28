"""
[문제]
아래의 코드는 실행 시 오류가 발생되며, 오류를 해결한다 해도 정상적인 결과는 아니다.
코드를 분석하여 오류를 해결하고 정상적인 결과가 나오도록 이후 코드를 완성하여 구현하기.

<출력 예시>
studentName=22
studentAge='홍길동'
print('학생의 이름은'+studentName+'이고 나이는 '+studentAge+'살이다)
"""


studentName=22
studentAge='홍길동'

studentName, studentAge = studentAge, studentName

print('학생의 이름은 ', studentName, '이고 나이는 ', studentAge , '살이다', sep='')
