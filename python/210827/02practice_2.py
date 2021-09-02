"""
    <문제>
문자열 형태의 도메인 명들(domainName)이 다음과 같이 저장되어 있을 때,
이를 다음 <출력예시>와 같이 문자열을 변환하여 출력 구현하기.

<출력 예시>

naver.com, daum.net, google.co.kr, youtube.com

"""

domainName='''naver.com
daum.net
google.co.kr
youtube.com'''

list1 = []
strDomain=''

list1 = domainName.split('\n')

strDomain = ', '.join(list1)

print(strDomain)

