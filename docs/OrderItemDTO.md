# OrderItemDTO


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Int64** | Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа.  | [optional] [default to nothing]
**offerId** | **String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] [default to nothing]
**offerName** | **String** | Название товара. | [optional] [default to nothing]
**price** | **Float64** | Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр &#x60;subsidies&#x60;).  | [optional] [default to nothing]
**buyerPrice** | **Float64** | Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам.  | [optional] [default to nothing]
**buyerPriceBeforeDiscount** | **Float64** | Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам.  | [optional] [default to nothing]
**priceBeforeDiscount** | **Float64** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок.  | [optional] [default to nothing]
**count** | **Int64** | Количество единиц товара. | [optional] [default to nothing]
**vat** | [***OrderVatType**](OrderVatType.md) |  | [optional] [default to nothing]
**shopSku** | **String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] [default to nothing]
**subsidy** | **Float64** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;subsidies&#x60;.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа.  | [optional] [default to nothing]
**partnerWarehouseId** | **String** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ.  | [optional] [default to nothing]
**promos** | [**Vector{OrderItemPromoDTO}**](OrderItemPromoDTO.md) | Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям. | [optional] [default to nothing]
**instances** | [**Vector{OrderItemInstanceDTO}**](OrderItemInstanceDTO.md) | Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, &#x60;instances&#x60; отсутствует.  | [optional] [default to nothing]
**details** | [**Vector{OrderItemDetailDTO}**](OrderItemDetailDTO.md) | Информация об удалении товара из заказа.  | [optional] [default to nothing]
**subsidies** | [**Vector{OrderItemSubsidyDTO}**](OrderItemSubsidyDTO.md) | Список субсидий по типам. | [optional] [default to nothing]
**requiredInstanceTypes** | [**Vector{OrderItemInstanceType}**](OrderItemInstanceType.md) | Список необходимых маркировок товара. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


