
# OrderItemDTO

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.Long** | Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа.  |  [optional] |
| **offerId** | **kotlin.String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  |  [optional] |
| **offerName** | **kotlin.String** | Название товара. |  [optional] |
| **price** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр &#x60;subsidies&#x60;).  |  [optional] |
| **buyerPrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам.  |  [optional] |
| **buyerPriceBeforeDiscount** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам.  |  [optional] |
| **priceBeforeDiscount** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок.  |  [optional] |
| **count** | **kotlin.Int** | Количество единиц товара. |  [optional] |
| **vat** | [**OrderVatType**](OrderVatType.md) |  |  [optional] |
| **shopSku** | **kotlin.String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  |  [optional] |
| **subsidy** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;subsidies&#x60;.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа.  |  [optional] |
| **partnerWarehouseId** | **kotlin.String** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ.  |  [optional] |
| **promos** | [**kotlin.collections.List&lt;OrderItemPromoDTO&gt;**](OrderItemPromoDTO.md) | Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям. |  [optional] |
| **instances** | [**kotlin.collections.List&lt;OrderItemInstanceDTO&gt;**](OrderItemInstanceDTO.md) | Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, &#x60;instances&#x60; отсутствует.  |  [optional] |
| **details** | [**kotlin.collections.List&lt;OrderItemDetailDTO&gt;**](OrderItemDetailDTO.md) | Информация об удалении товара из заказа.  |  [optional] |
| **subsidies** | [**kotlin.collections.List&lt;OrderItemSubsidyDTO&gt;**](OrderItemSubsidyDTO.md) | Список субсидий по типам. |  [optional] |
| **requiredInstanceTypes** | [**kotlin.collections.List&lt;OrderItemInstanceType&gt;**](OrderItemInstanceType.md) | Список необходимых маркировок товара. |  [optional] |



