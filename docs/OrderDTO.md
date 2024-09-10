# ympa_csharp_client.Model.OrderDTO
Заказ.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **long** | Идентификатор заказа. | [optional] 
**Status** | **OrderStatusType** |  | [optional] 
**Substatus** | **OrderSubstatusType** |  | [optional] 
**CreationDate** | **string** |  | [optional] 
**UpdatedAt** | **string** |  | [optional] 
**Currency** | **CurrencyType** |  | [optional] 
**ItemsTotal** | **decimal** | Платеж покупателя.  | [optional] 
**DeliveryTotal** | **decimal** | Стоимость доставки.  | [optional] 
**BuyerItemsTotal** | **decimal** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки.  | [optional] 
**BuyerTotal** | **decimal** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки.  | [optional] 
**BuyerItemsTotalBeforeDiscount** | **decimal** | Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам.  | [optional] 
**BuyerTotalBeforeDiscount** | **decimal** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (&#x60;buyerItemsTotalBeforeDiscount&#x60; + стоимость доставки).  | [optional] 
**PaymentType** | **OrderPaymentType** |  | [optional] 
**PaymentMethod** | **OrderPaymentMethodType** |  | [optional] 
**Fake** | **bool** | Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  | [optional] 
**Items** | [**List&lt;OrderItemDTO&gt;**](OrderItemDTO.md) | Список товаров в заказе. | 
**Subsidies** | [**List&lt;OrderSubsidyDTO&gt;**](OrderSubsidyDTO.md) | Список субсидий по типам. | [optional] 
**Delivery** | [**OrderDeliveryDTO**](OrderDeliveryDTO.md) |  | [optional] 
**Buyer** | [**OrderBuyerDTO**](OrderBuyerDTO.md) |  | [optional] 
**Notes** | **string** | Комментарий к заказу. | [optional] 
**TaxSystem** | **OrderTaxSystemType** |  | [optional] 
**CancelRequested** | **bool** | **Только для модели DBS**  Запрошена ли отмена.  | [optional] 
**ExpiryDate** | **string** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

