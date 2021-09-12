i=1

while i<9:
    i+=1
    j=0
    if i%2 == 0:
        continue    #countinue를 만나면 반복문의 조건으로 다시 돌아가버린다

    while j<9:
        j+=1
        print(f'{i}*{j}={i*j:2d}', end=' ')
    print()