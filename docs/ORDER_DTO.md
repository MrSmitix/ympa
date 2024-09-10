# ORDER_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **INTEGER_64** | Идентификатор заказа. | [optional] [default to null]
**status** | [**ORDER_STATUS_TYPE**](OrderStatusType.md) |  | [optional] [default to null]
**substatus** | [**ORDER_SUBSTATUS_TYPE**](OrderSubstatusType.md) |  | [optional] [default to null]
**creation_date** | [**STRING_32**](STRING_32.md) |  | [optional] [default to null]
**updated_at** | [**STRING_32**](STRING_32.md) |  | [optional] [default to null]
**currency** | [**CURRENCY_TYPE**](CurrencyType.md) |  | [optional] [default to null]
**items_total** | **REAL_32** | Платеж покупателя.  | [optional] [default to null]
**delivery_total** | **REAL_32** | Стоимость доставки.  | [optional] [default to null]
**buyer_items_total** | **REAL_32** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки.  | [optional] [default to null]
**buyer_total** | **REAL_32** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки.  | [optional] [default to null]
**buyer_items_total_before_discount** | **REAL_32** | Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам.  | [optional] [default to null]
**buyer_total_before_discount** | **REAL_32** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (&#x60;buyerItemsTotalBeforeDiscount&#x60; + стоимость доставки).  | [optional] [default to null]
**payment_type** | [**ORDER_PAYMENT_TYPE**](OrderPaymentType.md) |  | [optional] [default to null]
**payment_method** | [**ORDER_PAYMENT_METHOD_TYPE**](OrderPaymentMethodType.md) |  | [optional] [default to null]
**fake** | **BOOLEAN** | Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  | [optional] [default to null]
**items** | [**LIST [ORDER_ITEM_DTO]**](OrderItemDTO.md) | Список товаров в заказе. | [default to null]
**subsidies** | [**LIST [ORDER_SUBSIDY_DTO]**](OrderSubsidyDTO.md) | Список субсидий по типам. | [optional] [default to null]
**delivery** | [**ORDER_DELIVERY_DTO**](OrderDeliveryDTO.md) |  | [optional] [default to null]
**buyer** | [**ORDER_BUYER_DTO**](OrderBuyerDTO.md) |  | [optional] [default to null]
**notes** | [**STRING_32**](STRING_32.md) | Комментарий к заказу. | [optional] [default to null]
**tax_system** | [**ORDER_TAX_SYSTEM_TYPE**](OrderTaxSystemType.md) |  | [optional] [default to null]
**cancel_requested** | **BOOLEAN** | **Только для модели DBS**  Запрошена ли отмена.  | [optional] [default to null]
**expiry_date** | [**STRING_32**](STRING_32.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


