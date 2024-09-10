# OrderItemDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i64** | Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа.  | [optional] [default to None]
**offer_id** | **String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] [default to None]
**offer_name** | **String** | Название товара. | [optional] [default to None]
**price** | **f64** | Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр `subsidies`).  | [optional] [default to None]
**buyer_price** | **f64** | Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам.  | [optional] [default to None]
**buyer_price_before_discount** | **f64** | Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам.  | [optional] [default to None]
**price_before_discount** | **f64** | {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок.  | [optional] [default to None]
**count** | **i32** | Количество единиц товара. | [optional] [default to None]
**vat** | [***models::OrderVatType**](OrderVatType.md) |  | [optional] [default to None]
**shop_sku** | **String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] [default to None]
**subsidy** | **f64** | {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `subsidies`.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа.  | [optional] [default to None]
**partner_warehouse_id** | **String** | {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ.  | [optional] [default to None]
**promos** | [**Vec<models::OrderItemPromoDto>**](OrderItemPromoDTO.md) | Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям. | [optional] [default to None]
**instances** | [**Vec<models::OrderItemInstanceDto>**](OrderItemInstanceDTO.md) | Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, `instances` отсутствует.  | [optional] [default to None]
**details** | [**Vec<models::OrderItemDetailDto>**](OrderItemDetailDTO.md) | Информация об удалении товара из заказа.  | [optional] [default to None]
**subsidies** | [**Vec<models::OrderItemSubsidyDto>**](OrderItemSubsidyDTO.md) | Список субсидий по типам. | [optional] [default to None]
**required_instance_types** | [**Vec<models::OrderItemInstanceType>**](OrderItemInstanceType.md) | Список необходимых маркировок товара. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


