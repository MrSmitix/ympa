

# SkuBidRecommendationItemDTO

Список товаров с рекомендованными ставками.

The class is defined in **[SkuBidRecommendationItemDTO.java](../../src/main/java/org/openapitools/model/SkuBidRecommendationItemDTO.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sku** | `String` | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**bid** | `Integer` | Значение ставки. | 
**bidRecommendations** | [`List&lt;BidRecommendationItemDTO&gt;`](BidRecommendationItemDTO.md) | Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить.  |  [optional property]
**priceRecommendations** | [`List&lt;PriceRecommendationItemDTO&gt;`](PriceRecommendationItemDTO.md) | Рекомендованные цены. |  [optional property]






