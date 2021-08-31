"""
<사이트 url을 이용한 비밀번호 생성>                                 ->http://daum.net
step1: "http://"부분은 제외하고 추출                            ->daum.net
step2: 닷(.)부터 표시되는 문자열을 제외하여 추출                    ->daum
step3: '$' + 처음3자리 + 총 글자수 + 글자내 'a'의 개수로 구성       ->&dau41

"""

url='http://daum.net'

step1=url[url.find(':')+3:]
print(step1)

step2=step1[:step1.find('.')]
print(step2)

step3=f'${step2[:3]}{len(step2)}{step2.count("a")}'
print(step3)