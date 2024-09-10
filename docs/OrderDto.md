# OrderDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **Int!** | Идентификатор заказа. | [optional] [default to null]
**status** | [***OrderStatusType**](OrderStatusType.md) |  | [optional] [default to null]
**substatus** | [***OrderSubstatusType**](OrderSubstatusType.md) |  | [optional] [default to null]
**creationDate** | **String!** |  | [optional] [default to null]
**updatedAt** | **String!** |  | [optional] [default to null]
**currency** | [***CurrencyType**](CurrencyType.md) |  | [optional] [default to null]
**itemsTotal** | **Float!** | Платеж покупателя.  | [optional] [default to null]
**deliveryTotal** | **Float!** | Стоимость доставки.  | [optional] [default to null]
**buyerItemsTotal** | **Float!** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки.  | [optional] [default to null]
**buyerTotal** | **Float!** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки.  | [optional] [default to null]
**buyerItemsTotalBeforeDiscount** | **Float!** | Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам.  | [optional] [default to null]
**buyerTotalBeforeDiscount** | **Float!** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (&#x60;buyerItemsTotalBeforeDiscount&#x60; + стоимость доставки).  | [optional] [default to null]
**paymentType** | [***OrderPaymentType**](OrderPaymentType.md) |  | [optional] [default to null]
**paymentMethod** | [***OrderPaymentMethodType**](OrderPaymentMethodType.md) |  | [optional] [default to null]
**fake** | **Boolean!** | Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  | [optional] [default to null]
**items** | [**OrderItemDto**](OrderItemDTO.md) | Список товаров в заказе. | [default to null]
**subsidies** | [**OrderSubsidyDto**](OrderSubsidyDTO.md) | Список субсидий по типам. | [optional] [default to null]
**delivery** | [***OrderDeliveryDto**](OrderDeliveryDTO.md) |  | [optional] [default to null]
**buyer** | [***OrderBuyerDto**](OrderBuyerDTO.md) |  | [optional] [default to null]
**notes** | **String!** | Комментарий к заказу. | [optional] [default to null]
**taxSystem** | [***OrderTaxSystemType**](OrderTaxSystemType.md) |  | [optional] [default to null]
**cancelRequested** | **Boolean!** | **Только для модели DBS**  Запрошена ли отмена.  | [optional] [default to null]
**expiryDate** | **String!** |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


