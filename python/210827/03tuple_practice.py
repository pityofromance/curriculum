"""
<문제>
-내림차순 정렬된 튜플 출력

<출력 예시>
(10, 7, 5, 2, 1)

"""

t = (5, 2, 7, 1, 10)

t = list(t)
t.sort(reverse=True)
t=tuple(t)

#t = tuple(sorted(list(t), reverse=True))   #한줄로 합치면

print(t)