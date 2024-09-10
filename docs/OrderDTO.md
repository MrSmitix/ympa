

# OrderDTO

Заказ.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Идентификатор заказа. |  [optional]
**status** | **OrderStatusType** |  |  [optional]
**substatus** | **OrderSubstatusType** |  |  [optional]
**creationDate** | **String** |  |  [optional]
**updatedAt** | **String** |  |  [optional]
**currency** | **CurrencyType** |  |  [optional]
**itemsTotal** | **BigDecimal** | Платеж покупателя.  |  [optional]
**deliveryTotal** | **BigDecimal** | Стоимость доставки.  |  [optional]
**buyerItemsTotal** | **BigDecimal** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки.  |  [optional]
**buyerTotal** | **BigDecimal** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки.  |  [optional]
**buyerItemsTotalBeforeDiscount** | **BigDecimal** | Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам.  |  [optional]
**buyerTotalBeforeDiscount** | **BigDecimal** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (&#x60;buyerItemsTotalBeforeDiscount&#x60; + стоимость доставки).  |  [optional]
**paymentType** | **OrderPaymentType** |  |  [optional]
**paymentMethod** | **OrderPaymentMethodType** |  |  [optional]
**fake** | **Boolean** | Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  |  [optional]
**items** | [**Seq&lt;OrderItemDTO&gt;**](OrderItemDTO.md) | Список товаров в заказе. | 
**subsidies** | [**Seq&lt;OrderSubsidyDTO&gt;**](OrderSubsidyDTO.md) | Список субсидий по типам. |  [optional]
**delivery** | [**OrderDeliveryDTO**](OrderDeliveryDTO.md) |  |  [optional]
**buyer** | [**OrderBuyerDTO**](OrderBuyerDTO.md) |  |  [optional]
**notes** | **String** | Комментарий к заказу. |  [optional]
**taxSystem** | **OrderTaxSystemType** |  |  [optional]
**cancelRequested** | **Boolean** | **Только для модели DBS**  Запрошена ли отмена.  |  [optional]
**expiryDate** | **String** |  |  [optional]



