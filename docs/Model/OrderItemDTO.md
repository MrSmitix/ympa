# # OrderItemDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. | [optional]
**offer_id** | **string** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) | [optional]
**offer_name** | **string** | Название товара. | [optional]
**price** | **float** | Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр &#x60;subsidies&#x60;). | [optional]
**buyer_price** | **float** | Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам. | [optional]
**buyer_price_before_discount** | **float** | Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам. | [optional]
**price_before_discount** | **float** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок. | [optional]
**count** | **int** | Количество единиц товара. | [optional]
**vat** | [**\OpenAPI\Client\Model\OrderVatType**](OrderVatType.md) |  | [optional]
**shop_sku** | **string** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) | [optional]
**subsidy** | **float** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;subsidies&#x60;.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа. | [optional]
**partner_warehouse_id** | **string** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ. | [optional]
**promos** | [**\OpenAPI\Client\Model\OrderItemPromoDTO[]**](OrderItemPromoDTO.md) | Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям. | [optional]
**instances** | [**\OpenAPI\Client\Model\OrderItemInstanceDTO[]**](OrderItemInstanceDTO.md) | Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, &#x60;instances&#x60; отсутствует. | [optional]
**details** | [**\OpenAPI\Client\Model\OrderItemDetailDTO[]**](OrderItemDetailDTO.md) | Информация об удалении товара из заказа. | [optional]
**subsidies** | [**\OpenAPI\Client\Model\OrderItemSubsidyDTO[]**](OrderItemSubsidyDTO.md) | Список субсидий по типам. | [optional]
**required_instance_types** | [**\OpenAPI\Client\Model\OrderItemInstanceType[]**](OrderItemInstanceType.md) | Список необходимых маркировок товара. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
