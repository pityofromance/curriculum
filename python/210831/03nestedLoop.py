i=1

while i<6:      # 중첩 루프? 항상 외곽 구조변수 값이 고정된 상태에서
    j=1         # 안쪽 구조변수 값이 변하는 특징

    while j<6:
        print(f'i={i}, j={j}')
        j+=1
    i+=1
    print()


# 구구단

i=1

while i<10:
    j=1

    while j<10:
        print(f'{i}*{j}={i*j:2d}', end=' ')
        j+=1
    i+= 1
    print()
print()