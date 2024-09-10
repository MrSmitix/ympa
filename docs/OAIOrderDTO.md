# OAIOrderDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSNumber*** | Идентификатор заказа. | [optional] 
**status** | [**OAIOrderStatusType***](OAIOrderStatusType.md) |  | [optional] 
**substatus** | [**OAIOrderSubstatusType***](OAIOrderSubstatusType.md) |  | [optional] 
**creationDate** | **NSString*** |  | [optional] 
**updatedAt** | **NSString*** |  | [optional] 
**currency** | [**OAICurrencyType***](OAICurrencyType.md) |  | [optional] 
**itemsTotal** | **NSNumber*** | Платеж покупателя.  | [optional] 
**deliveryTotal** | **NSNumber*** | Стоимость доставки.  | [optional] 
**buyerItemsTotal** | **NSNumber*** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки.  | [optional] 
**buyerTotal** | **NSNumber*** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки.  | [optional] 
**buyerItemsTotalBeforeDiscount** | **NSNumber*** | Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам.  | [optional] 
**buyerTotalBeforeDiscount** | **NSNumber*** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (&#x60;buyerItemsTotalBeforeDiscount&#x60; + стоимость доставки).  | [optional] 
**paymentType** | [**OAIOrderPaymentType***](OAIOrderPaymentType.md) |  | [optional] 
**paymentMethod** | [**OAIOrderPaymentMethodType***](OAIOrderPaymentMethodType.md) |  | [optional] 
**fake** | **NSNumber*** | Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  | [optional] 
**items** | [**NSArray&lt;OAIOrderItemDTO&gt;***](OAIOrderItemDTO.md) | Список товаров в заказе. | 
**subsidies** | [**NSArray&lt;OAIOrderSubsidyDTO&gt;***](OAIOrderSubsidyDTO.md) | Список субсидий по типам. | [optional] 
**delivery** | [**OAIOrderDeliveryDTO***](OAIOrderDeliveryDTO.md) |  | [optional] 
**buyer** | [**OAIOrderBuyerDTO***](OAIOrderBuyerDTO.md) |  | [optional] 
**notes** | **NSString*** | Комментарий к заказу. | [optional] 
**taxSystem** | [**OAIOrderTaxSystemType***](OAIOrderTaxSystemType.md) |  | [optional] 
**cancelRequested** | **NSNumber*** | **Только для модели DBS**  Запрошена ли отмена.  | [optional] 
**expiryDate** | **NSString*** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


