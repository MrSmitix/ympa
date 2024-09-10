# ympa_r_client::OrderDTO

Заказ.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | Идентификатор заказа. | [optional] 
**status** | [**OrderStatusType**](OrderStatusType.md) |  | [optional] [Enum: ] 
**substatus** | [**OrderSubstatusType**](OrderSubstatusType.md) |  | [optional] [Enum: ] 
**creationDate** | **character** |  | [optional] 
**updatedAt** | **character** |  | [optional] 
**currency** | [**CurrencyType**](CurrencyType.md) |  | [optional] [Enum: ] 
**itemsTotal** | **numeric** | Платеж покупателя.  | [optional] 
**deliveryTotal** | **numeric** | Стоимость доставки.  | [optional] 
**buyerItemsTotal** | **numeric** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки.  | [optional] 
**buyerTotal** | **numeric** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки.  | [optional] 
**buyerItemsTotalBeforeDiscount** | **numeric** | Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам.  | [optional] 
**buyerTotalBeforeDiscount** | **numeric** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (&#x60;buyerItemsTotalBeforeDiscount&#x60; + стоимость доставки).  | [optional] 
**paymentType** | [**OrderPaymentType**](OrderPaymentType.md) |  | [optional] [Enum: ] 
**paymentMethod** | [**OrderPaymentMethodType**](OrderPaymentMethodType.md) |  | [optional] [Enum: ] 
**fake** | **character** | Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  | [optional] 
**items** | [**array[OrderItemDTO]**](OrderItemDTO.md) | Список товаров в заказе. | 
**subsidies** | [**array[OrderSubsidyDTO]**](OrderSubsidyDTO.md) | Список субсидий по типам. | [optional] 
**delivery** | [**OrderDeliveryDTO**](OrderDeliveryDTO.md) |  | [optional] 
**buyer** | [**OrderBuyerDTO**](OrderBuyerDTO.md) |  | [optional] 
**notes** | **character** | Комментарий к заказу. | [optional] 
**taxSystem** | [**OrderTaxSystemType**](OrderTaxSystemType.md) |  | [optional] [Enum: ] 
**cancelRequested** | **character** | **Только для модели DBS**  Запрошена ли отмена.  | [optional] 
**expiryDate** | **character** |  | [optional] 


