# OrderDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Int64** | Идентификатор заказа. | [optional] 
**status** | [**OrderStatusType**](OrderStatusType.md) |  | [optional] 
**substatus** | [**OrderSubstatusType**](OrderSubstatusType.md) |  | [optional] 
**creationDate** | **String** |  | [optional] 
**updatedAt** | **String** |  | [optional] 
**currency** | [**CurrencyType**](CurrencyType.md) |  | [optional] 
**itemsTotal** | **Double** | Платеж покупателя.  | [optional] 
**deliveryTotal** | **Double** | Стоимость доставки.  | [optional] 
**buyerItemsTotal** | **Double** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки.  | [optional] 
**buyerTotal** | **Double** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки.  | [optional] 
**buyerItemsTotalBeforeDiscount** | **Double** | Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам.  | [optional] 
**buyerTotalBeforeDiscount** | **Double** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (&#x60;buyerItemsTotalBeforeDiscount&#x60; + стоимость доставки).  | [optional] 
**paymentType** | [**OrderPaymentType**](OrderPaymentType.md) |  | [optional] 
**paymentMethod** | [**OrderPaymentMethodType**](OrderPaymentMethodType.md) |  | [optional] 
**fake** | **Bool** | Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  | [optional] 
**items** | [OrderItemDTO] | Список товаров в заказе. | 
**subsidies** | [OrderSubsidyDTO] | Список субсидий по типам. | [optional] 
**delivery** | [**OrderDeliveryDTO**](OrderDeliveryDTO.md) |  | [optional] 
**buyer** | [**OrderBuyerDTO**](OrderBuyerDTO.md) |  | [optional] 
**notes** | **String** | Комментарий к заказу. | [optional] 
**taxSystem** | [**OrderTaxSystemType**](OrderTaxSystemType.md) |  | [optional] 
**cancelRequested** | **Bool** | **Только для модели DBS**  Запрошена ли отмена.  | [optional] 
**expiryDate** | **String** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


