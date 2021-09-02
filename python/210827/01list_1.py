v = 1
for i in range(1,4):
    for j in range(1,i+3):
        if j < 4-i:
            print('   ', end='')
        else:
            print(f'{v:2d}', end=' ')
            v += 1
    print()