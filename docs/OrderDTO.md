# WWW::OpenAPIClient::Object::OrderDTO

## Load the model package
```perl
use WWW::OpenAPIClient::Object::OrderDTO;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор заказа. | [optional] 
**status** | [**OrderStatusType**](OrderStatusType.md) |  | [optional] 
**substatus** | [**OrderSubstatusType**](OrderSubstatusType.md) |  | [optional] 
**creation_date** | **string** |  | [optional] 
**updated_at** | **string** |  | [optional] 
**currency** | [**CurrencyType**](CurrencyType.md) |  | [optional] 
**items_total** | **double** | Платеж покупателя.  | [optional] 
**delivery_total** | **double** | Стоимость доставки.  | [optional] 
**buyer_items_total** | **double** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки.  | [optional] 
**buyer_total** | **double** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки.  | [optional] 
**buyer_items_total_before_discount** | **double** | Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам.  | [optional] 
**buyer_total_before_discount** | **double** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (&#x60;buyerItemsTotalBeforeDiscount&#x60; + стоимость доставки).  | [optional] 
**payment_type** | [**OrderPaymentType**](OrderPaymentType.md) |  | [optional] 
**payment_method** | [**OrderPaymentMethodType**](OrderPaymentMethodType.md) |  | [optional] 
**fake** | **boolean** | Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  | [optional] 
**items** | [**ARRAY[OrderItemDTO]**](OrderItemDTO.md) | Список товаров в заказе. | 
**subsidies** | [**ARRAY[OrderSubsidyDTO]**](OrderSubsidyDTO.md) | Список субсидий по типам. | [optional] 
**delivery** | [**OrderDeliveryDTO**](OrderDeliveryDTO.md) |  | [optional] 
**buyer** | [**OrderBuyerDTO**](OrderBuyerDTO.md) |  | [optional] 
**notes** | **string** | Комментарий к заказу. | [optional] 
**tax_system** | [**OrderTaxSystemType**](OrderTaxSystemType.md) |  | [optional] 
**cancel_requested** | **boolean** | **Только для модели DBS**  Запрошена ли отмена.  | [optional] 
**expiry_date** | **string** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


