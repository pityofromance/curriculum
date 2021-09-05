"""
<문제>
-재고 상품에 대한 상품목록(productlist)와 가격목록(priceList)과 당므과 같이 존재할 때
중복된 상품을 제거하여 <출력 예시>와 같이 새로운 사전 형태로 저장하도록 구현

<출현 예시>
{'면도기' : 15000 , '종이컵' : 10000, '젓가락' : 500, '포크' : 3000}

"""

productList=['면도기', '종이컵', '젓가락', '포크', '종이컵']
priceList = [15000, 1000, 500, 3000, 1000]

inventoryList = {}

inventoryList = dict(zip(productList, priceList))

print(inventoryList)