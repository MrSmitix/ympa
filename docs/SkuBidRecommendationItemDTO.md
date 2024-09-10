
# Table `SkuBidRecommendationItemDTO`
(mapped from: SkuBidRecommendationItemDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**sku** | sku | text NOT NULL |  | **kotlin.String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**bid** | bid | int UNSIGNED NOT NULL |  | **kotlin.Int** | Значение ставки. | 
**bidRecommendations** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BidRecommendationItemDTO&gt;**](BidRecommendationItemDTO.md) | Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить.  |  [optional]
**priceRecommendations** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PriceRecommendationItemDTO&gt;**](PriceRecommendationItemDTO.md) | Рекомендованные цены. |  [optional]




# **Table `SkuBidRecommendationItemDTOBidRecommendationItemDTO`**
(mapped from: SkuBidRecommendationItemDTOBidRecommendationItemDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
skuBidRecommendationItemDTO | skuBidRecommendationItemDTO | long | | kotlin.Long | Primary Key | *one*
bidRecommendationItemDTO | bidRecommendationItemDTO | long | | kotlin.Long | Foreign Key | *many*



# **Table `SkuBidRecommendationItemDTOPriceRecommendationItemDTO`**
(mapped from: SkuBidRecommendationItemDTOPriceRecommendationItemDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
skuBidRecommendationItemDTO | skuBidRecommendationItemDTO | long | | kotlin.Long | Primary Key | *one*
priceRecommendationItemDTO | priceRecommendationItemDTO | long | | kotlin.Long | Foreign Key | *many*



