# ORDER_ITEM_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **INTEGER_64** | Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа.  | [optional] [default to null]
**offer_id** | [**STRING_32**](STRING_32.md) | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] [default to null]
**offer_name** | [**STRING_32**](STRING_32.md) | Название товара. | [optional] [default to null]
**price** | **REAL_32** | Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр &#x60;subsidies&#x60;).  | [optional] [default to null]
**buyer_price** | **REAL_32** | Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам.  | [optional] [default to null]
**buyer_price_before_discount** | **REAL_32** | Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам.  | [optional] [default to null]
**price_before_discount** | **REAL_32** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок.  | [optional] [default to null]
**count** | **INTEGER_32** | Количество единиц товара. | [optional] [default to null]
**vat** | [**ORDER_VAT_TYPE**](OrderVatType.md) |  | [optional] [default to null]
**shop_sku** | [**STRING_32**](STRING_32.md) | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] [default to null]
**subsidy** | **REAL_32** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;subsidies&#x60;.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа.  | [optional] [default to null]
**partner_warehouse_id** | [**STRING_32**](STRING_32.md) | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ.  | [optional] [default to null]
**promos** | [**LIST [ORDER_ITEM_PROMO_DTO]**](OrderItemPromoDTO.md) | Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям. | [optional] [default to null]
**instances** | [**LIST [ORDER_ITEM_INSTANCE_DTO]**](OrderItemInstanceDTO.md) | Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, &#x60;instances&#x60; отсутствует.  | [optional] [default to null]
**details** | [**LIST [ORDER_ITEM_DETAIL_DTO]**](OrderItemDetailDTO.md) | Информация об удалении товара из заказа.  | [optional] [default to null]
**subsidies** | [**LIST [ORDER_ITEM_SUBSIDY_DTO]**](OrderItemSubsidyDTO.md) | Список субсидий по типам. | [optional] [default to null]
**required_instance_types** | [**LIST [ORDER_ITEM_INSTANCE_TYPE]**](OrderItemInstanceType.md) | Список необходимых маркировок товара. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


