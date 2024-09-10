# OrderDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор заказа. | [optional] 
**status** | [**OpenAPI\Server\Model\OrderStatusType**](OrderStatusType.md) |  | [optional] 
**substatus** | [**OpenAPI\Server\Model\OrderSubstatusType**](OrderSubstatusType.md) |  | [optional] 
**creationDate** | **string** |  | [optional] 
**updatedAt** | **string** |  | [optional] 
**currency** | [**OpenAPI\Server\Model\CurrencyType**](CurrencyType.md) |  | [optional] 
**itemsTotal** | **float** | Платеж покупателя. | [optional] 
**deliveryTotal** | **float** | Стоимость доставки. | [optional] 
**buyerItemsTotal** | **float** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки. | [optional] 
**buyerTotal** | **float** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки. | [optional] 
**buyerItemsTotalBeforeDiscount** | **float** | Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам. | [optional] 
**buyerTotalBeforeDiscount** | **float** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (&#x60;buyerItemsTotalBeforeDiscount&#x60; + стоимость доставки). | [optional] 
**paymentType** | [**OpenAPI\Server\Model\OrderPaymentType**](OrderPaymentType.md) |  | [optional] 
**paymentMethod** | [**OpenAPI\Server\Model\OrderPaymentMethodType**](OrderPaymentMethodType.md) |  | [optional] 
**fake** | **bool** | Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. | [optional] 
**items** | [**OpenAPI\Server\Model\OrderItemDTO**](OrderItemDTO.md) | Список товаров в заказе. | 
**subsidies** | [**OpenAPI\Server\Model\OrderSubsidyDTO**](OrderSubsidyDTO.md) | Список субсидий по типам. | [optional] 
**delivery** | [**OpenAPI\Server\Model\OrderDeliveryDTO**](OrderDeliveryDTO.md) |  | [optional] 
**buyer** | [**OpenAPI\Server\Model\OrderBuyerDTO**](OrderBuyerDTO.md) |  | [optional] 
**notes** | **string** | Комментарий к заказу. | [optional] 
**taxSystem** | [**OpenAPI\Server\Model\OrderTaxSystemType**](OrderTaxSystemType.md) |  | [optional] 
**cancelRequested** | **bool** | **Только для модели DBS**  Запрошена ли отмена. | [optional] 
**expiryDate** | **string** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


