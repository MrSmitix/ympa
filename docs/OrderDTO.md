
# OrderDTO

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **items** | [**kotlin.collections.List&lt;OrderItemDTO&gt;**](OrderItemDTO.md) | Список товаров в заказе. |  |
| **id** | **kotlin.Long** | Идентификатор заказа. |  [optional] |
| **status** | [**OrderStatusType**](OrderStatusType.md) |  |  [optional] |
| **substatus** | [**OrderSubstatusType**](OrderSubstatusType.md) |  |  [optional] |
| **creationDate** | **kotlin.String** |  |  [optional] |
| **updatedAt** | **kotlin.String** |  |  [optional] |
| **currency** | [**CurrencyType**](CurrencyType.md) |  |  [optional] |
| **itemsTotal** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Платеж покупателя.  |  [optional] |
| **deliveryTotal** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Стоимость доставки.  |  [optional] |
| **buyerItemsTotal** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки.  |  [optional] |
| **buyerTotal** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки.  |  [optional] |
| **buyerItemsTotalBeforeDiscount** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам.  |  [optional] |
| **buyerTotalBeforeDiscount** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (&#x60;buyerItemsTotalBeforeDiscount&#x60; + стоимость доставки).  |  [optional] |
| **paymentType** | [**OrderPaymentType**](OrderPaymentType.md) |  |  [optional] |
| **paymentMethod** | [**OrderPaymentMethodType**](OrderPaymentMethodType.md) |  |  [optional] |
| **fake** | **kotlin.Boolean** | Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  |  [optional] |
| **subsidies** | [**kotlin.collections.List&lt;OrderSubsidyDTO&gt;**](OrderSubsidyDTO.md) | Список субсидий по типам. |  [optional] |
| **delivery** | [**OrderDeliveryDTO**](OrderDeliveryDTO.md) |  |  [optional] |
| **buyer** | [**OrderBuyerDTO**](OrderBuyerDTO.md) |  |  [optional] |
| **notes** | **kotlin.String** | Комментарий к заказу. |  [optional] |
| **taxSystem** | [**OrderTaxSystemType**](OrderTaxSystemType.md) |  |  [optional] |
| **cancelRequested** | **kotlin.Boolean** | **Только для модели DBS**  Запрошена ли отмена.  |  [optional] |
| **expiryDate** | **kotlin.String** |  |  [optional] |



