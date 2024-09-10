

# OrderDTO

Заказ.

The class is defined in **[OrderDTO.java](../../src/main/java/org/openapitools/model/OrderDTO.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `Long` | Идентификатор заказа. |  [optional property]
**status** | `OrderStatusType` |  |  [optional property]
**substatus** | `OrderSubstatusType` |  |  [optional property]
**creationDate** | `String` |  |  [optional property]
**updatedAt** | `String` |  |  [optional property]
**currency** | `CurrencyType` |  |  [optional property]
**itemsTotal** | `BigDecimal` | Платеж покупателя.  |  [optional property]
**deliveryTotal** | `BigDecimal` | Стоимость доставки.  |  [optional property]
**buyerItemsTotal** | `BigDecimal` | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки.  |  [optional property]
**buyerTotal** | `BigDecimal` | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки.  |  [optional property]
**buyerItemsTotalBeforeDiscount** | `BigDecimal` | Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам.  |  [optional property]
**buyerTotalBeforeDiscount** | `BigDecimal` | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (&#x60;buyerItemsTotalBeforeDiscount&#x60; + стоимость доставки).  |  [optional property]
**paymentType** | `OrderPaymentType` |  |  [optional property]
**paymentMethod** | `OrderPaymentMethodType` |  |  [optional property]
**fake** | `Boolean` | Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  |  [optional property]
**items** | [`List&lt;OrderItemDTO&gt;`](OrderItemDTO.md) | Список товаров в заказе. | 
**subsidies** | [`List&lt;OrderSubsidyDTO&gt;`](OrderSubsidyDTO.md) | Список субсидий по типам. |  [optional property]
**delivery** | [`OrderDeliveryDTO`](OrderDeliveryDTO.md) |  |  [optional property]
**buyer** | [`OrderBuyerDTO`](OrderBuyerDTO.md) |  |  [optional property]
**notes** | `String` | Комментарий к заказу. |  [optional property]
**taxSystem** | `OrderTaxSystemType` |  |  [optional property]
**cancelRequested** | `Boolean` | **Только для модели DBS**  Запрошена ли отмена.  |  [optional property]
**expiryDate** | `String` |  |  [optional property]

























