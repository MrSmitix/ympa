# SKU_BID_RECOMMENDATION_ITEM_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sku** | [**STRING_32**](STRING_32.md) | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [default to null]
**bid** | **INTEGER_32** | Значение ставки. | [default to null]
**bid_recommendations** | [**LIST [BID_RECOMMENDATION_ITEM_DTO]**](BidRecommendationItemDTO.md) | Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить.  | [optional] [default to null]
**price_recommendations** | [**LIST [PRICE_RECOMMENDATION_ITEM_DTO]**](PriceRecommendationItemDTO.md) | Рекомендованные цены. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


