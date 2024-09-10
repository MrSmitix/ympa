# Api.OrderDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Number** | Идентификатор заказа. | [optional] 
**status** | [**OrderStatusType**](OrderStatusType.md) |  | [optional] 
**substatus** | [**OrderSubstatusType**](OrderSubstatusType.md) |  | [optional] 
**creationDate** | **String** |  | [optional] 
**updatedAt** | **String** |  | [optional] 
**currency** | [**CurrencyType**](CurrencyType.md) |  | [optional] 
**itemsTotal** | **Number** | Платеж покупателя.  | [optional] 
**deliveryTotal** | **Number** | Стоимость доставки.  | [optional] 
**buyerItemsTotal** | **Number** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки.  | [optional] 
**buyerTotal** | **Number** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки.  | [optional] 
**buyerItemsTotalBeforeDiscount** | **Number** | Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам.  | [optional] 
**buyerTotalBeforeDiscount** | **Number** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (&#x60;buyerItemsTotalBeforeDiscount&#x60; + стоимость доставки).  | [optional] 
**paymentType** | [**OrderPaymentType**](OrderPaymentType.md) |  | [optional] 
**paymentMethod** | [**OrderPaymentMethodType**](OrderPaymentMethodType.md) |  | [optional] 
**fake** | **Boolean** | Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  | [optional] 
**items** | [**[OrderItemDTO]**](OrderItemDTO.md) | Список товаров в заказе. | 
**subsidies** | [**[OrderSubsidyDTO]**](OrderSubsidyDTO.md) | Список субсидий по типам. | [optional] 
**delivery** | [**OrderDeliveryDTO**](OrderDeliveryDTO.md) |  | [optional] 
**buyer** | [**OrderBuyerDTO**](OrderBuyerDTO.md) |  | [optional] 
**notes** | **String** | Комментарий к заказу. | [optional] 
**taxSystem** | [**OrderTaxSystemType**](OrderTaxSystemType.md) |  | [optional] 
**cancelRequested** | **Boolean** | **Только для модели DBS**  Запрошена ли отмена.  | [optional] 
**expiryDate** | **String** |  | [optional] 


