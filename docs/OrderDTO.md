# OrderDTO


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Int64** | Идентификатор заказа. | [optional] [default to nothing]
**status** | [***OrderStatusType**](OrderStatusType.md) |  | [optional] [default to nothing]
**substatus** | [***OrderSubstatusType**](OrderSubstatusType.md) |  | [optional] [default to nothing]
**creationDate** | **String** |  | [optional] [default to nothing]
**updatedAt** | **String** |  | [optional] [default to nothing]
**currency** | [***CurrencyType**](CurrencyType.md) |  | [optional] [default to nothing]
**itemsTotal** | **Float64** | Платеж покупателя.  | [optional] [default to nothing]
**deliveryTotal** | **Float64** | Стоимость доставки.  | [optional] [default to nothing]
**buyerItemsTotal** | **Float64** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки.  | [optional] [default to nothing]
**buyerTotal** | **Float64** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки.  | [optional] [default to nothing]
**buyerItemsTotalBeforeDiscount** | **Float64** | Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам.  | [optional] [default to nothing]
**buyerTotalBeforeDiscount** | **Float64** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (&#x60;buyerItemsTotalBeforeDiscount&#x60; + стоимость доставки).  | [optional] [default to nothing]
**paymentType** | [***OrderPaymentType**](OrderPaymentType.md) |  | [optional] [default to nothing]
**paymentMethod** | [***OrderPaymentMethodType**](OrderPaymentMethodType.md) |  | [optional] [default to nothing]
**fake** | **Bool** | Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  | [optional] [default to nothing]
**items** | [**Vector{OrderItemDTO}**](OrderItemDTO.md) | Список товаров в заказе. | [default to nothing]
**subsidies** | [**Vector{OrderSubsidyDTO}**](OrderSubsidyDTO.md) | Список субсидий по типам. | [optional] [default to nothing]
**delivery** | [***OrderDeliveryDTO**](OrderDeliveryDTO.md) |  | [optional] [default to nothing]
**buyer** | [***OrderBuyerDTO**](OrderBuyerDTO.md) |  | [optional] [default to nothing]
**notes** | **String** | Комментарий к заказу. | [optional] [default to nothing]
**taxSystem** | [***OrderTaxSystemType**](OrderTaxSystemType.md) |  | [optional] [default to nothing]
**cancelRequested** | **Bool** | **Только для модели DBS**  Запрошена ли отмена.  | [optional] [default to nothing]
**expiryDate** | **String** |  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


