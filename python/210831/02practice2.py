'''
<두 정수의 차>

정수1 입력 : 5
정수2 입력 : 7

5, 7의 차는 : 2


<두 정수의 차 >

정수1 입력 : 10
정수2 입력 : 6

10, 6의 차는 : 4

'''
int1 = 0
int2 = 0

iDifference=0

i=0
while i<2 :

    print("<두 정수의 차>\n")
    int1 = int(input("정수1 입력 : "))
    int2 = int(input("정수2 입력 : "))

    print(f"\n{int1}, {int2}의 차는 {(int1-int2) if (int1 >= int2) else (int2-int1)}\n\n")

    # if(int1 >= int2):
    #     iDifference = int1 - int2
    # else:
    #     iDifference = int2 - int1

    # #iDifference = (int1 - int2) if (int1 >= int2) else (int2 - int1)

    # print(f"\n{int1}, {int2}의 차는 {iDifference}\n\n")
    
    i+=0